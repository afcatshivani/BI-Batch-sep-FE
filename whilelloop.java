import java.util.Scanner;

public class whilelloop {

public static void main(String[] args) {
    System.out.println("Enter number");
    Scanner SC = new Scanner(System.in);
    int number = SC.nextInt();
    int counter = 1;
    int sum = 0;
    while(counter<=number){
    //System.out.println(counter);
    sum = counter + sum;
        counter++;
    }
    System.out.println(sum);

 }
}
