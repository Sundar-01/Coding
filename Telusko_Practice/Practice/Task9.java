class Product{
    private String name;
    private double price;
    private int quantity;

    public Product(){
        this.name = "Unknown";
        this.price = 0;
        this.quantity = 0;
        System.out.println("Default Product : ");
    }
    public Product(String name, double price){
        this.name = name;
        this.price = price;
        System.out.println("Partial Product : ");
    }
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        System.out.println("Full Product : ");
    }
    public void display(){
        System.out.println("Name     : " + name);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println();
    }
}

class Task9{
    public static void main(String arg[]){
        Product obj1 = new Product();
        obj1.display();
        Product obj2 = new Product("Pen", 10);
        obj2.display();
        Product obj3 = new Product("Book", 200, 3);
        obj3.display();
    }
}