class Counter{
    static int count = 0;

    static{
        System.out.println("Class is being loaded...");
    }

    public Counter(){
        count++;
        System.out.println("Object created. Count : " + count);
    }

    static void totalObjectsCreated(){

        System.out.println("Total Objects created : " + count);
    }
}

class Task6{
    public static void main(String srg[]){
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        Counter.totalObjectsCreated();
    }
}