package com.kabaso.test;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a = 15;
        int b = 10;
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println( "Hello World!"+name );
        if(15>10){
            System.out.println(a*b);
        }
    }
}
