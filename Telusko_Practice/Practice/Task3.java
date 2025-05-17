class Task3{
    public static void main(String arg[]){

        int area;
        int perimeter;

        Area obj1 = new Area();
        Perimeter obj2 = new Perimeter();

        area = obj1.areaOfRec(2,5);
        perimeter = obj2.periOfRec(2,5);

        System.out.println("Area of perimeter       : " + area);
        System.out.println("Perimeter of Rectangle  : " + perimeter);
    }
}

class Area{
    public Area(){
        int l;
        int w;
    }
    public int areaOfRec(int length, int width){
        int result;
        return result = length * width;
    }
}

class Perimeter extends Area{
    public int periOfRec(int length, int width){
        int result;
        return result = 2*(length + width);
    }
}