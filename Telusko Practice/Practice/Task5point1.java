class SBPractice{
    public void reverse(){
        String hello = "welcome";

        StringBuilder sb = new StringBuilder(hello);
        System.out.println("Original     : " + hello);
        System.out.println("Reversed     : " + sb.reverse());
        
        String uppercase = sb.toString().toUpperCase();
        System.out.println("Uppercase    : " + uppercase);
        System.out.println("Final Output : " + uppercase + " is reversed");
        
        // System.out.println("Uppercase    : " + sb.toString().toUpperCase());
        // System.out.println("Final Output : " + sb.append(" is reversed"));
    }
}

class Task5point1{
    public static void main(String arg[]){
        SBPractice obj = new SBPractice();

        obj.reverse();
    }
}