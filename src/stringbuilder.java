import java.util.*;
import java.lang.*;

public class stringbuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
       StringBuilder str=new StringBuilder(sc.nextLine());
//        System.out.println(str);
//        System.out.println(str.charAt(0));
//        System.out.println(str.append(1));
//        str.setCharAt(2 , 'w');
//        System.out.println(str);
//        str.delete(1,5);
//        System.out.println(str);
//        str.append("e");
//        str.append("l");
//        str.append("l");
//        str.append("o");
//        System.out.println(str);
//        for(int i=0;i<str.length()/2;i++){
//            int front=i;
//            int back=str.length()-1-i;
//
//            char frontchar=str.charAt(front);
//            char backchar=str.charAt(back);
//
//            str.setCharAt(front, backchar);
//            str.setCharAt(back, frontchar);
//        }
//        System.out.println(str);

        int i=0;
        int j=str.length()-1;

        while(i<j){
            char temp=str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, temp);
            i++;
            j--;
        }
        System.out.println(str);
    }
}
