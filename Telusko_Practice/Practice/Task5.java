class ReverseString{
    String welcome = "hello";
    String result = "";
    public void stringReverse(){

        System.out.println("Original                 : " + welcome);
        for (int i = welcome.length() - 1; i >= 0; i--){
            result += welcome.charAt(i);
            // result += String.valueOf(welcome.charAt(i));
        }
        System.out.println("Reversed (String)       : " + result);

        StringBuffer sb = new StringBuffer(welcome);
        System.out.println("Reversed (StringBuffer) : " + sb.reverse());
    }
}

class Task5{
    public static void main(String arg[]){
        ReverseString obj = new ReverseString();

        obj.stringReverse();
    }
}