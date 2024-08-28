import java.util.*;

public class removeduplicate
{
    public static void main(String[] args)
    {
        Scanner athes=new Scanner(System.in);
        int n = athes.nextInt();
        int m = athes.nextInt();
        int varman[] = new int[n];
        int muthuvelpandian[] = new int[m];
        for(int i=0;i<n;i++)
        {
            varman[i]=athes.nextInt();
        }
        int o=n+m;
        int santhoshh[] = new int[0];
        int c = 0;
        for(int i=0;i<n;i++)
        {
            santhoshh[c++]=varman[i];
        }
        for(int i=0;i<m;i++)
        {
            santhoshh[c++]=muthuvelpandian[i];
        }
        Arrays. sort(muthuvelpandian);
        int soni[] = new int[100];
        for(int i=0;i<o;i++)
        {
            soni[santhoshh[i]]++;
        }
        for(int i1=0;i1<o;i1++)
        {
            if(soni[santhoshh[i1]]>0)
                System.err.println(santhoshh[i1]);
            int k = 0;
                soni[santhoshh[k]] = 0;
        }

    }
}
