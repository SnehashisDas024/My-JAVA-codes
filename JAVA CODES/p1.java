import java.util.*;
public class  p1{
    public int fibo(int n){
        if(n==0||n==1)
        return n;
        else
        return fibo(n-1)+fibo(n-2);

    }
    public static void main(String args[]){
        //System.out.println("Hello world");
        /*for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        p1 ob = new p1();
        for(int i=0;i<10;i++){
            System.out.print(ob.fibo(i)+"\t");
        }
    }
}