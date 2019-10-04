package hello;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hello {
//    this is a comment (control forward slash)
    public static void main(String[] args) throws Exception {
//        new java.io.InputStreamReader(System.in)
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        /*java.lang.*/System.out.println("Hi, what's your name?");
        String name = input.readLine();

        System.out.print("Hello ");
        System.out.println(name);
    }
}
