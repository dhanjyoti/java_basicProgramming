import java.io.*;
import java.util.*;

public class Grade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int total = (a + b + c + d + e)/5;
        System.out.println(total);

        if(total>=90){
            System.out.println("A");
        }   
        else if(total>=80 && total<90){
            System.out.println("B");
        }   
        else if(total>=70 && total<80){
            System.out.println("C");
        }   
        else if(total>=60 && total<70){
            System.out.println("D");
        }   
        else if(total>=40 && total<60){
            System.out.println("E");
        }   
        else if(total<40){
            System.out.println("F");
        }   
    }
}