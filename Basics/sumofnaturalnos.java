import java.util.Scanner;

public class sumofnaturalnos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;

        int i=1;
        while(i<=n){
            sum += i;  //using this statement for storing i value in sum part
            i++;

        }
        System.out.println("sum is: " +sum);
    }
}
