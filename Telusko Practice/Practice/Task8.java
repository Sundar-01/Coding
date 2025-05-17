class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
        System.out.println("Employee Details : ");
    }
    public void display(){
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Task8{
    public static void main(String arg[]){
        Employee obj = new Employee("John", 50000);
        // obj.Employee("John", 50000);
        obj.display();
    }
}