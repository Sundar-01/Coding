class Person{
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
    private double salary;

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public void showDetails(){
        System.out.println("Name    : " + getName());
        System.out.println("Age     : " + getAge());
        System.out.println("Salary  : " + getSalary());
    }
}

class Task10{
    public static void main(String arg[]){
        Employee obj = new Employee();
        obj.setName("Alice");
        obj.setAge(30);
        obj.setSalary(60000);
        obj.showDetails();
    }
}