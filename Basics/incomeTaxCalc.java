import java.util.Scanner;

public class incomeTaxCalc {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if(income < 500000){
            tax = 0;
         }
         else if(income>=500000 && income<1000000) {

        tax = (int) (income * 0.2); //typecasted bcuz java taxes point value as double by default
         }
        else{
            tax = (int) (income * 0.3);
        }
        System.out.println("your tax is : " + tax); // we use + in print when we have to print same things  in once 
     }
}
