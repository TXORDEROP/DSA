import java.util.*;

public class stringresss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String str="Google";
//        System.out.println("Enter the String:");
//        String str=sc.next();
//        for(int i =0;i<=str.length();i++){
//            System.out.println(str.substring(0,i));
//        }
//        for(int i=0;i<str.length();i++){
//            System.out.println(str.charAt(i));
//        }
        String str1="Aditya";
        String str2="AdItya";
        if (str1.compareTo(str2)==0){
            System.out.println("Are Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
