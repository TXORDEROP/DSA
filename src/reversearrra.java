import java.util.*;

public class reversearrra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp=0;

        System.out.println("Enter a size");
        int size= sc.nextInt();
        int []arr=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the Numbers: ");
            arr[i]=sc.nextInt();
        }

        int i=0;
        int j=size -1;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for(int k=0;k<size;k++){
            System.out.println(arr[k]);
        }
    }
}
