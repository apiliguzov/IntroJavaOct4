package hello;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hello {
//    this is a comment (control forward slash)
    public static void main(String[] args) throws Exception {
//        new java.io.InputStreamReader(System.in)
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        /*java.lang.*/System.out.println("Hi, what's your name?");
//        String name = input.readLine();
//
//        System.out.print("Hello " + name);
//
//        System.out.println("What's your friend's name?");
//        String name2 = input.readLine();
//        System.out.println("the names are the same? " + name.equals(name2));

        System.out.println("enter the first number: ");
        int num1 = Integer.parseInt(input.readLine());
//
//        System.out.println("enter the second number: ");
//        int num2 = Integer.parseInt(input.readLine());

//        System.out.println(num1 + num2);
//        System.out.println("num 1 is greater than num 2 ? " + (num1 > num2));
//        System.out.println("num 1 is same as num 2 ? " + (num1 == num2));
//
//        if (num1 == num2) {
//            System.out.println("they are the same");
//        } else { // else is optional
//            System.out.println("different");
//        }

        switch (num1) { // switch on int, String, (also Enum!?)
            case 1:
                System.out.println("that's a one!");
                break;
            case 2:
                System.out.println("that's a two");
                break;
            case 3: break;
            case 4:
            case 5:
                System.out.println("three four or five");
                break;
            default:
                System.out.println("something else...");
                break;
        }
    }
}
