import java.util.Scanner;


public class quadratic_form{

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for A in quadratic form (Ax^2 + Bx + C)");
        double a = sc.nextInt();

        System.out.println("Enter value for B in quadratic form (Ax^2 + Bx + C)");
        double b = sc.nextInt();

        System.out.println("Enter value for C in quadratic form (Ax^2 + Bx + C)");
        double c = sc.nextInt();

        double ans1 = (-1*(b)+(Math.sqrt((b*b)-(4*(a*c)))))/2*a;
        double ans2 = (-1*(b)-(Math.sqrt((b*b)-(4*(a*c)))))/2*a;
        System.out.println(ans1 + " " + ans2);


    }

}