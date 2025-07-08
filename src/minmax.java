import java.sql.SQLOutput;
import java.util.*;

public class minmax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;


        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int [] arr=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the Numbers:");
            arr[i]= sc.nextInt();
        }

        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max =arr[i];
            }

        }
        System.out.println("The Min element is  "+ min + " " +"and the Max element is  "+ max);
    }

}
