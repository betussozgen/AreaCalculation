import java.util.Scanner;
public class AreaCalculation {
    public static void main(String[] args) {
        int a,b,c;
        double u,cevre,alan;

        Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        a = input.nextInt();

        System.out.print("b: ");
        b = input.nextInt();

        System.out.print("c: ");
        c = input.nextInt();

        u = (a+b+c)/2;
        cevre = 2 * u;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));


        System.out.println("Çevre: "+ cevre);
        System.out.println("Alan: "+ alan);

    }
}
