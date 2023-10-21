TIME COMPLEXITY:
  BEST CASE: O(N^2)
  WORST CASE : O(N^2) //both are same
  no of comparison = 0+1+2+3+...+n-1
                   = (n-1) * (n-1+1) /2
                   = n(n-1)/2
                   = n^2 - n/2  // constatnts n and 2 will get cancelled because they are less dominating
                   = O(n^2) --> complexity

  Source code:


public class Main{
    public static void main(String[] args)
    {
        int arr[]={4,5,3,2,1};
        selectionSorting(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void selectionSorting(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int last = arr.length-i-1;
            int max = maximum(arr,0,last);
            swap(arr,max,last);
            
        }
    }
    public static void swap(int[] arr, int first, int last)
    {
        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
        
    }
    public static int maximum(int[] arr,int start,int end)
    {
        int max = start;
        for(int i=start;i<=end;i++)
        {
            if(arr[start] <arr[i])
            {
                max = i;
            }
        }
        return max;
    }
}


OUTPUT:
[1,2,3,4,5]
