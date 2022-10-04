package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char a = 'Z';
        int b = 0xface; //hex
        int c = 012; //octal integer
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;

        int d1, e1, f1, g1, h1;
       /* d1 = Math.toIntExact(d);
        e1 = Math.round(e);
        f1 = Math.round(f);
        g1 = (int) Math.round(g);
        h1 = (int) Math.round(h); */

        d1 = (int)d;
        e1 = (int)e;
        f1 = (int)f;
        g1 = (int)g;
        h1 = (int)h;

        int sum = (a + b + c + d1 + e1 + f1 + g1 + h1);
        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        int a , b ;

        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a+b);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        int x , y ;

        System.out.println("Before Swap:");
        System.out.print("x: ");
        x = scanner.nextInt();
        System.out.print("y: ");
        y = scanner.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        int n1, n2;

        System.out.print("n1: ");
        n1 = scanner.nextInt();
        System.out.print("n2: ");
        n2 = scanner.nextInt();

        if(n1==n2){
            System.out.println("n1 == n2");
        }else if (n1<n2){
            System.out.println("n2 > n1");
        }else {
            System.out.println("n1 > n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        double Umsatz;
        System.out.print("Enter annual Revenue: ");
        Umsatz = scanner.nextDouble();

        if( Umsatz < 0 || Umsatz >= 100000 ){
            System.out.println("Invalid Revenue");
        } if( 0 <= Umsatz && Umsatz < 20000){
            System.out.println("Poor Sales Revenue");
        } if( 20000 <= Umsatz && Umsatz < 50000){
            System.out.println("Average Sales Revenue");
        } if( 50000 <= Umsatz && Umsatz < 80000){
            System.out.println("Good Sales Revenue");
        } if( 80000 <=Umsatz && Umsatz < 100000){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        int e;
        System.out.print("Enter CommissionClass: ");
        e = scanner.nextInt();
        switch (e){
            case 1:
                System.out.print("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.print("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.print("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.print("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.print("Your Commission Rate was set to 0.0");

        }
        System.out.println();

    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0)) {
            System.out.print("Leapyear");
            System.out.println();
        } else {
            System.out.print("Not a Leapyear");
            System.out.println();
        }

    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        int x, y;

        System.out.print("Number: " );
        x = scanner.nextInt();
        if (x > 100 && 1000 > x) {
            y = (x % 100 % 10 * 100) + (x / 10 % 10 * 10 ) + (x / 100);

            System.out.print(y);
            System.out.println();
        }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}