import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int marks = SC.nextInt();

        if (marks%2 ==0){
            System.out.println("Number is Even");
        }
        else 
            System.out.println("Number is Odd");
            
        }
    }
