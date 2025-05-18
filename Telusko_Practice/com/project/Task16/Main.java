package com.project.Task16;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Yaazhan", "Sundar", "Aishwarya"};
        int in1 = 5, in2 = 0;
        try{
            //Calculation obj = new Calculation();
            //int result = obj.dividor(5, 0);
            int result = in1/in2;
            System.out.println("Result of Calculation is : " + result);
            String result1 = names[3];
            System.out.println("Result of Array is : " + result1);
        }catch (ArithmeticException a){
            System.out.println("Thrown an Arithmetic Exception. Please check the value.");
        }catch (ArrayIndexOutOfBoundsException o){
            System.out.println("Invalid array index!");
        }finally{
            System.out.println("End of program. Resources closed.");
        }
    }
}