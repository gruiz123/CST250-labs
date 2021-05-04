package edu.ru.lab12;

import java.util.Scanner;        
        
public class MainClass {
    

    static void ToH(int numOfDisks, char start, char end, char rod) {

        if (numOfDisks == 1) {

            System.out.println("Disk 1 Moved from " + start + " to " + end);

            return;

        }


        ToH(numOfDisks - 1, start, rod, end);

        System.out.println("Disk " + numOfDisks + " Moved from " + start + " to " + end);

        ToH(numOfDisks - 1, rod, end, start);

    }


    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of disks:");

        int numOfDisks = scan.nextInt();

        ToH(numOfDisks, 'A', 'C', 'B');

        scan.close();

    }

}