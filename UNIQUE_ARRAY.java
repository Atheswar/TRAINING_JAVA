public class unique_array
{
    public static void main(String[] args)
    {
        int AG[] = {1,1,1,2,2,3,4,4,4};
        int arr[] = new int[10];
        for (int i=0;i<10;i++)
        {
            arr [AG[i]]++;
        }
        for (int i=0;i<10;i++)
        {
            if (arr[i]>0)
            System.out.println(i+=" "+arr[i]);
        }
    }
}
