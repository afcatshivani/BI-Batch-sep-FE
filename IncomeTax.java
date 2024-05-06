public class IncomeTax {

public static void main(String[] args) {
    int salary  = 800000;
    if ( salary<500000){
        System.out.println("No tax");
    }
    else if (salary>500000 && salary<700000){
        System.out.println("5% Tax is applicable which is =" + (int)(salary*0.05));
    }
    else{
        System.out.println("0.1% is applicable = " + (int)(salary*0.1));
    }

}
}