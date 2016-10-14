package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
	    System.out.println("What is your name?");
        String nameInput = input.next();
        LuckyNum person1 = new LuckyNum();

        if (person1.perfRandom()>0)
        {
            System.out.println("Hello " + nameInput + " your lucky number is: " + person1.perfRandom());
        }
        else
        {
            System.out.print("Restart");
        }


        System.out.println("If you'd like to continue, type 0. If you'd like to exit, press 1");
        int cont = input.nextInt();
        while (cont == 0)
        {
            System.out.println("What is your name?");
            nameInput = input.next();
            LuckyNum person2 = new LuckyNum();

            if (person1.perfRandom()>0)
            {
                System.out.println("Hello " + nameInput + " your lucky number is: " + person1.perfRandom());
            }
            else
            {
                System.out.print("Restart");
            }

            System.out.println("If you'd like to continue, type 0. If you'd like to exit, press 1");
        }


    }
}
