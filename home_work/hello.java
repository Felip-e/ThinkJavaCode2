public class hello {
    public static void main(String[] args) {
        int age = 35;
        if(args.length >= 2){
           System.out.println("Hello, "  + args[0] + args[1]); 
        } else {
            System.out.println("Please, provide at least two arguments.");
        }
        System.out.println(age);
    }
}
