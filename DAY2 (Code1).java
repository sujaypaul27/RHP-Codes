// Online Java Compiler
// Use this editor to write, compile and run your Java code online  Finmd largest and second largest element in an array
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int fl=0,sl=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>fl)
            {
                sl=fl;
                fl=arr[i];
            }else if(arr[i]>sl){
                sl=arr[i];
            }
        }
        
        System.out.println("First largest: "+fl);
        System.out.println("Second largest: "+sl);
        
    }
}