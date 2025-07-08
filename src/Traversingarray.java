import java.util.*;

public class Traversingarray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the Number");
       int size = sc.nextInt();
       int [] arr=new int[size];
//        int [] arr={1,2,3,4};

       for(int i=0;i< arr.length;i++){
           System.out.println("Enter the numbers you want to add");
           arr[i]=sc.nextInt();
       }

       for(int i=0;i< size;i++){
           System.out.print( arr[i] + " ");
       }
    }
}
