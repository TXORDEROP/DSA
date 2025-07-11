import java.util.*;
public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Size");
        int size=sc.nextInt();
        int []arr=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter The elements:");
            arr[i]=sc.nextInt();
        }

        boolean isPalindrom=true;
        int i=0; int j=size-1;

        while(arr[i]!=arr[j]){
          isPalindrom=false;
          break;
        }
        i++;
        j--;

        if(isPalindrom){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

//        System.out.println("Enter The size: ");
//        int size= sc.nextInt();
//        int arr[]=new int[size];
//
//        for(int i=0;i<size;i++){
//            System.out.println("Enter the number");
//            arr[i]=sc.nextInt();
//        }
//
//        boolean isPalindrome=true;
//        int i=0;
//        int j=size-1;
//
//        while(i<j){
//            if(arr[i] != arr[j]){
//                isPalindrome= false;
//                break;
//            }
//            i++;
//            j--;
//
//        }
//        if(isPalindrome){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }
    }
}
