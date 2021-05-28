package com.mycompany.app;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        int n1,n2,sum;
        Scanner s = new Scanner(System.in);
        n1=s.nextInt();
        n2=s.nextInt();
        sum=n1+n2;
        System.out.println( "Hello World!" );
        System.out.println( "Sum of Number:"+sum);
    }
}
