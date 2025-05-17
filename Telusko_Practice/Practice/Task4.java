//int[] numbers = {10, 20, 5, 40, 15};

// Use enhanced for loop to:
// 1. Print elements
// 2. Add to a sum variable
// 3. Track the maximum value

class Loop{
    int[] numbers = {-10, -20, -5, -40, -15};

    public void allElements(){
        System.out.print("Elements : ");
        for (int i : numbers){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public void sumVariable(){
        int result = 0;
        for (int i : numbers){
            result += i;
        }
        System.out.println("Sum      : " + result);
    }
    public void maxVariable(){
        int result = numbers[0];
        for (int i : numbers){
            if (result < i){
                result = i;
            }
        }
        System.out.println("Max      : " + result);
    }
}

class Task4{
    public static void main(String arg[]){
        Loop obj = new Loop();
        
        obj.allElements();
        obj.sumVariable();
        obj.maxVariable();
    }
}