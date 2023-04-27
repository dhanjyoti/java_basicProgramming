import java.io.*;
import java.util.*;

public class ElectricityBill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b;

        if(a<=50){
            b=(a*0.5);
            System.out.print((int)(b*1.2));
        }
        else if(a>50 && a<=150){
            a=a-50;
            b=((50*0.5)+(a*0.75));
            System.out.print((int)(b*1.2));
        }
        else if(a>150 && a<=250){
            a=a-150;
            b=((50*0.5)+(100*0.75)+(a*1.2));
            System.out.print((int)(b*1.2));
        }
        else if(a>250){
            a=a-150;
            b=((50*0.5)+(100*0.75)+(100*1.2)+(a*1.5));
            System.out.print((int)(b*1.2));
        }
    }
}