class AppConfig{
    static String version = "1.0";
    static {
        System.out.println("AppConfig initialized");
    }
    static void showVersion(){
        System.out.println("Current version is : " + version);
    }
}

class Task6point2{
    public static void main(String arg[]){
        AppConfig.showVersion();
    }
}