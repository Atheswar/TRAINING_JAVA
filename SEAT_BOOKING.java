import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Seat Number");
        num=sc.nextInt();
        if (num%8==1)
        {
            System.out.println("Upper berth");
        }
        if (num%8==2)
        {
            System.out.println("Middle berth");
        }
        if (num%8==3)
        {
            System.out.println("Lower berth");
        }
        if (num%8==4)
        {
            System.out.println("Upper berth");
        }
        if (num%8==5)
        {
            System.out.println("Middle berth");
        }
        if (num%8==6)
        {
            System.out.println("Lower berth");
        }
        if (num%8==7)
        {
            System.out.println("Upper berth");
        }
        if (num%8==8)
        {
            System.out.println("Upper berth");
        }
        else
        {
            System.out.println("No Seat");
        }
    }
}
