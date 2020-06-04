# Java-program-to-convert-minutes-into-number-of-years-and-days
Developed by Bhavesh Kewalramani

import java.util.Scanner;
public class YearsAndDays{
    public static void main(String[] args){
        double minutesInAYear=60*24*365;
        Scanner minutes=new Scanner(System.in);
        System.out.println("Enter the number of Minutes: ");
        double minute=minutes.nextDouble();
                  long years=(long)(minute/minutesInAYear);
                  int days=(int)(minute/60/24)%365;
        System.out.println(+minute+" minutes is nearly "+years+" years and "+days+" days");
    }
  }
