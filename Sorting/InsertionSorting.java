TIME COMPLEXITY
  BEST CASE: O(N) // LINEAR COMPLEXITY
  WORST CASE:O(N^2)  // DESCENDING SORTED

  Sorce code:
public class Main{
    public static void main(String[] args)
    {
        int arr[]={4,5,3,2,1};
        insertionSorting(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void insertionSorting(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else
                {
                    break;         // because the left hand side elements were already sorted by the previoys loop conditions
                }
            }
            
        }
    }
    public static void swap(int[] arr, int first, int last)
    {
        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
        
    }
    
}
  
