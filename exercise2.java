import java.time.Year;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {

        //1. Scanner SC = new Scanner(System.in);
        // int Number = SC.nextInt();
        // if (Number>0){
        //     System.out.println("Positive");
        // }
        // else{
        //     System.out.println("neagtive");
        // }
    // 2. double temp = 103.5;
    // if (temp>100) {
    //     System.out.println("Fever");
    //     }                                     
    // else{
    //     System.out.println("Not fever");
    // }
    //3.
    // System.out.println("Enter week day number: = ");
    //     Scanner SC = new Scanner(System.in);
    //     int week = SC.nextInt();
    //     switch (week) {
    //     case 1: System.out.println("Monday");
    //         break;
    //     case 2:System.out.println("Tues");
    //         break;
    //     case 3:System.out.println("Wed");
    //         break;
    //     case 4: System.out.println("Thru");
    //         break;
    //     case 5:System.out.println("Friday");
    //         break;
    //     case 6:System.out.println("Sat");
    //         break;
    //     case 7:System.out.println("sunday");
    //         break;
    //     default:System.out.println("Oops there is off day");
    //         break;
    // }
    
    
    Scanner SC = new Scanner(System.in);
    int year = SC.nextInt();
    if (year %100 == 0){
            System.out.println("Yearis leap year");
    }
    else if (year %400==0){
            System.out.println("Leap year");}
    else{
            System.out.println("N0 leap year");
    }
    }
}