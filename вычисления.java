import java.util.Scanner;

public class sdfg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("¬ведите а: ");
        a = in.nextInt();
        System.out.println("¬ведите b: ");
        b = in.nextInt();
        System.out.println(sum(a,b));
        System.out.println(sub(a,b));
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
}
