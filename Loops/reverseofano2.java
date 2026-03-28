public class reverseofano2 {
    public static void main(String[] args) {
        int n = 10899;
        int rev =0;

        while(n>0){

            int lastdigit = n%10;
            rev =(rev*10) + lastdigit;
            n=n/10;
            
        }
        System.out.println(rev);
    }
}
//1. Printing reverse of a number
//Here,you just display digits in reverse order, 
// but you don’t actually store or change the number.

//2. Reversing a number
//Here, you create a new number whose digits are reversed.
