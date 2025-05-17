class Person{
    public Person(){
        System.out.println("Person constructor called");
    }
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void showDetails(){
        System.out.println("Name    : " + getName());
        System.out.println("Age     : " + getAge());
    }
}

class Employee extends Person{
    public Employee(){
        System.out.println("Employee constructor called");
    }
    private double salary;

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("Salary  : " + getSalary());
    }
}

class Task11{
    public static void main(String arg[]){
        Employee obj = new Employee();
        obj.setName("Bob");
        obj.setAge(28);
        obj.setSalary(45000);
        obj.showDetails();
    }
}