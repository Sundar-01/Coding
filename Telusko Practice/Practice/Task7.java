class Student{

    public Student(){
        System.out.println("Student Details: ");
    }
    private String name;
    private int rollno;
    private char grade;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getRollNo(){
        return rollno;
    }
    public void setRollNo(int rollno){
        this.rollno = rollno;
    }
    public char getGrade(){
        return grade;
    }
    public void setGrade(char grade){
        this.grade = grade;
    }
}

class Task7{
    public static void main(String arg[]){
        Student obj1 = new Student();
        // Student obj2 = new Student();
        // Student obj3 = new Student();

        obj1.setName("Rahul");
        obj1.setRollNo(101);
        obj1.setGrade('A');

        System.out.println("Name   : " + obj1.getName());
        System.out.println("RollNo : " + obj1.getRollNo());
        System.out.println("Grade  : " + obj1.getGrade());
    }
}