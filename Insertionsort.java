import java.lang.*;

public class First {
    public static void insertionsort(int[] arr)
    {
        int n = arr.length;
        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]<key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
      }
    }
    public static void main(String[] args)
    {
        int[] arr = {25,67,89,34,10,23,12};
        insertionsort(arr);
        for (int j : arr) 
        {
            System.out.print(j + " ");
        }
    }

 }
