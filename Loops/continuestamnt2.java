import java.util.*;
public class continuestamnt2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        do{
            System.out.println("enter your no.");
            int n = sc.nextInt();

            if (n%10==0) {
                continue;
            }
            System.out.println("number was:" +n);
        }while(true);
        //while(true) means → "keep looping FOREVER because 
                      //true is ALWAYS true"
    }
}
