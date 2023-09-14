import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class First {
    public static int binarysearch(int[] arr, int x)
    {
        int l=0;
        int r=(arr.length-1);
        while(l<r)
        {
            int mid=(l+r)/2;  // also you can do as mid=(l+(r-l)/2 to het the mid answer into the range of int
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(x < arr[mid])
            {
                r = mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {25,67,89,34,10,23,12};
        int x=92;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print(binarysearch(arr,x));

    }
 }


