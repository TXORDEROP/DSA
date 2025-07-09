import java.util.*;
public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The size: ");
        int size= sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the number");
            arr[i]=sc.nextInt();
        }

        boolean isPalindrome=true;
        int i=0;
        int j=size-1;

        while(i<j){
            if(arr[i] != arr[j]){
                isPalindrome= false;
                break;
            }
            i++;
            j--;

        }
        if(isPalindrome){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
