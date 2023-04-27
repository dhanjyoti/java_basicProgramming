import java.io.*;
import java.util.*;

public class WhichTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==b && b==c && c==a){
            System.out.println("Equilateral");
        } else if(a==b || b==c || c==a){
            System.out.println("Isosceles");
        } else if(a!=b && b!=c && c!=a){
            System.out.println("Scalene");
        }
    }
}