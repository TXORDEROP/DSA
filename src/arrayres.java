import java.util.*;

public class arrayres {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        int []arr=new int[3];
//        arr[0]=100;
//        arr[1]=99;
//        arr[2]=98;
//        for(int i=0;i< arr.length;i++){
//            System.out.print(arr[i] + " " );
//        }
//        int [] arr= {100, 99, 98};
//        for(int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }
        System.out.println("Enter the Size");
        int size= sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the elements in array: ");
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the X number: ");
        int x= sc.nextInt();

        for(int i=0;i< arr.length;i++){
            if(arr[i]==x){
                System.out.println("The number is found at the index " + i);

            }
        }

    }

}
