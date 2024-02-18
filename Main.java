import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //ex1

//        System.out.println("Please enter first number : ");
//        int num1=s.nextInt();
//        System.out.println("Please enter second number : ");
//        int num2=s.nextInt();
//        System.out.println("Please enter third number : ");
//        int num3=s.nextInt();
//        small(num1,num2,num3);

        //ex2
//        System.out.println("please enter number : ");
//        int num = s.nextInt();
//        check(num);

//        //ex3
//
//        System.out.println("1. password must have at least eight characters");
//        System.out.println("2. password consist of only letters and digits");
//        System.out.println("3.password must contain at least two digits ");
//        System.out.println("input a password (you are agreeing to the above terms and conditions )");
//        String pass = s.nextLine();
//        if (checkpass(pass)){
//            System.out.println("Password is valid : "+pass);
//        }else System.out.println("Password in not valid : "+pass);
//

    }
    //ex1
    public static void small(int a ,int b ,int c){
        if(a < b && a < c)
            System.out.println("The smallest value is : "+a);
        else if (b < c && b < a)
            System.out.println("The smallest value is : "+b);
        else
            System.out.println("The smallest value is : "+c);

    }

    //ex2
    public static void check(int a){
        if(a > 0)
            System.out.println(" the number "+a+" is positive");
        else if (a < 0)
            System.out.println(" the number "+a+" is negative");
        else
            System.out.println(" the number "+a+" is zero");
    }
    //ex3
    public static boolean checkpass(String p) {
        boolean valid = true;
        int digit = 0;
        if (p.length() < 8)
            valid = false;
        else {
            for (int i = 0; i < p.length(); i++) {
                if (!Character.isLetterOrDigit(p.charAt(i)))
                    valid = false;
                else if (Character.isDigit(p.charAt(i))) {
                    digit++;
                    if (digit == 2) {
                        break;
                    }
                }
            }
            if (digit != 2) {
                valid = false;
            }
        }
        if (valid)

        return valid;
        return valid;
    }


    }











