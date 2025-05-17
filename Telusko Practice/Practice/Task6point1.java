class MathUtil{
    static int square(int num){
        return num * num;
    }
    static {
        System.out.println("MathUtil class loaded");
    }
}

class Task6point1{
    public static void main(String arg[]){

        System.out.println("Square of given number 5 is : " + MathUtil.square(5));
    }
}