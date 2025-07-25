import java.util.*;

public class twoDarrres {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       /*
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////                                                                        ///////////////////
                                      This is fro 2D array to Print it
         /////////////////                                                                        ///////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Enter the Rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the columns:");
        int col= sc.nextInt();

        int arr[][]=new int[rows][col];

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter the rows and columns");
                arr[i][j]= sc.nextInt();
            }

        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////                                                                        ///////////////////
        //**************    This is to find the x=No. from the array in 2D array ******************//////////////////
        /////////////////                                                                        ///////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Enter the no. Of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the no. Of column:");
        int col=sc.nextInt();

        int[][]arr=new int[rows][col];

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter the numbers");
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter number which is to find:");
        int x= sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==x){
                    System.out.println("The number is found at index " + i);
                }
            }
        }
    }

}
