public class continuestamnt {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            if(i==3){ //this thing use to skip iteration like we have to print 1 2 3 4 5 and skip 3
              continue;
            }
            System.out.println(i); 
        }
    }
}
