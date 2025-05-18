package com.practise.Task16;

public class Task16 {
    public static void main(String[] args) {
        String[] names = {"Yaazhan", "Sundar", "Aishwarya"};
        int in1 = 5, in2 = 0;
        Calculation obj = new Calculation();
        try{
            int result = obj.dividor(in1, in2);
            System.out.println("Result of Calculation is : " + result);
            
        }catch (ArithmeticException a){
            System.out.println("Thrown an Arithmetic Exception. Please check the value.");
        }
        try{
            String result1 = names[3];
            System.out.println("Result of Array is : " + result1);
        }catch (ArrayIndexOutOfBoundsException o){
            System.out.println("Invalid array index!");
        }finally{
            System.out.println("End of program. Resources closed.");
        }
    }
}
