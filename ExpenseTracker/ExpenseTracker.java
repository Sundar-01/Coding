package ExpenseTracker;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class ExpenseTracker extends JFrame {
    private JTextField nameField, categoryField, amountField;
    private DefaultTableModel tableModel;
    private String filePath = "expenses.csv";
    private JPanel chartPanel;

    public ExpenseTracker() {
        setTitle("Expense Tracker");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(45, 52, 54)); // Dark mode

        // Input fields
        nameField = new JTextField(10);
        categoryField = new JTextField(10);
        amountField = new JTextField(10);
        JButton addButton = new JButton("Add");

        styleComponent(nameField);
        styleComponent(categoryField);
        styleComponent(amountField);
        styleComponent(addButton);

        JPanel inputPanel = new JPanel();
        inputPanel.setBackground(new Color(45, 52, 54));
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(new JLabel("Name:")).setForeground(Color.WHITE);
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Category:")).setForeground(Color.WHITE);
        inputPanel.add(categoryField);
        inputPanel.add(new JLabel("Amount:")).setForeground(Color.WHITE);
        inputPanel.add(amountField);
        inputPanel.add(addButton);

        // Table
        tableModel = new DefaultTableModel(new String[]{"Name", "Category", "Amount"}, 0);
        JTable table = new JTable(tableModel);
        table.setBackground(new Color(60, 63, 65));
        table.setForeground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(table);

        // Chart Panel
        chartPanel = new JPanel(new BorderLayout());
        chartPanel.setPreferredSize(new Dimension(400, 300));
        updateChart();

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(chartPanel, BorderLayout.SOUTH);

        addButton.addActionListener(e -> addExpense());
        loadExpenses();
    }

    private void styleComponent(JComponent comp) {
        comp.setBackground(new Color(60, 63, 65));
        comp.setForeground(Color.WHITE);
    }

    private void addExpense() {
        String name = nameField.getText();
        String category = categoryField.getText();
        String amountText = amountField.getText();

        if (name.isEmpty() || category.isEmpty() || amountText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
            return;
        }

        try {
            double amount = Double.parseDouble(amountText);
            tableModel.addRow(new Object[]{name, category, amount});
            saveExpense(name, category, amount);
            nameField.setText("");
            categoryField.setText("");
            amountField.setText("");
            updateChart();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid amount.");
        }
    }

    private void saveExpense(String name, String category, double amount) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write(name + "," + category + "," + amount);
            bw.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving expense.");
        }
    }

    private void loadExpenses() {
        File file = new File(filePath);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    tableModel.addRow(new Object[]{parts[0], parts[1], parts[2]});
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading expenses.");
        }
    }

    private void updateChart() {
        Map<String, Double> categoryMap = new HashMap<>();

        for (int i = 0; i < tableModel.getRowCount(); i++) {
            String category = tableModel.getValueAt(i, 1).toString();
            double amount = Double.parseDouble(tableModel.getValueAt(i, 2).toString());

            categoryMap.put(category, categoryMap.getOrDefault(category, 0.0) + amount);
        }

        DefaultPieDataset dataset = new DefaultPieDataset();
        for (String category : categoryMap.keySet()) {
            dataset.setValue(category, categoryMap.get(category));
        }

        JFreeChart chart = ChartFactory.createPieChart("Category Wise Expenses", dataset, true, true, false);
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setBackgroundPaint(new Color(45, 52, 54));
        plot.setOutlineVisible(false);

        chartPanel.removeAll();
        chartPanel.add(new ChartPanel(chart), BorderLayout.CENTER);
        chartPanel.revalidate();
        chartPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ExpenseTracker().setVisible(true));
    }
}
