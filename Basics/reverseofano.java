public class reverseofano {
    public static void main(String[] args) {
        // for printing reverese of a no.;
        // 1.last digit print : number%10
        // 2. remove last digit: num/10

        int n= 10855;
        while (n>0) {
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n=n/10; //n/=10
            
        }
        
    }
}
