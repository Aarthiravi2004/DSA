import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ss[] = s.split(" ");
		int arr[] = new int[ss.length];
		for(int i=0;i<ss.length;i++)
		{
		    arr[i]=Integer.parseInt(ss[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
		    int sum=arr[i];
		    int flag=0;
		    int k=0;
		    for(int j=i+1;j<arr.length;j++)
		    {
		        sum+=arr[j];
		        if(sum == 0)
		        {
		            k=j;
		            flag=1;
		            break;
		        }
		    }
		    if(flag==1)
		    {
		        for(int p=i;p<=k;p++)
		        {
		            System.out.print(arr[p]+" ");
		        }
		        System.out.println();
		    }
		}
		
		
	}
}

INPUT: 3, 4, -7, 3, 1, 3, 1, -4, -2, -2
OUPUT:
{ 3, 4, -7 }
{ 4, -7, 3 }
{ -7, 3, 1, 3 }
{ 3, 1, -4 }
{ 3, 1, 3, 1, -4, -2, -2 }
{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
