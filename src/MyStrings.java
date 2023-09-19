import java.util.Scanner;
public class MyStrings {
    public static void main(String[] args) {
        String name = new String("Aldrin");
        String name1 = "Aldrin";
        System.out.print("My name is ");
        System.out.println(name);
        int a = 6;
        int c = 2;
        float b = 5.6454f;
        System.out.println(a^c);
        System.out.printf("The value of a is %d and value of b is %3.2f", a, b);
        System.out.println();
        System.out.format("The value of a is %d and value of b is %f", a, b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter s ");
        String s = sc.next();
        String st = sc.nextLine();
        System.out.println(st);
        System.out.println(s);
    }
}