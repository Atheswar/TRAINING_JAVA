import java.util.Scanner;

public class swap_program
{
    public static void main(String[] args)
    {
        String athes="HEYY YOU THIS IS ATHES";
        String arr[] = athes.split(" ");
        for (int i=0;i<arr.length-1;i+=2)
        {
            String t=arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = t;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
