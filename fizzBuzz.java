import java.io.*;
import java.util.*;

public class FizzBuzz{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a % 3 == 0 && a % 5 == 0){
            System.out.print("fizzbuzz");
        }
        else if(a % 3 == 0){
            System.out.print("Fizz");
        }
        else if(a % 5 == 0){
            System.out.print("Buzz");
        }
        else{
            System.out.print("None");
        }
    }
}