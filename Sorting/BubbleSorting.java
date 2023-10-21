Bubble Sorting WHY? 
  At every end of the hecking loop , we will get the largest elements to placed in the last to first position order 
  For Example: [3,1,5,4,2]
  1st check
    1,3,5,4,2
    1,3,5,4,2
    1,3,4,5,2
    1,3,4,2,5
  --> in the end we are getting the largest element 5 at the end of the array

  2nd check
    1,3,4,2,5
    1,3,4,2,5
    1,3,2,4,5
  --> in the end we are getting 4,5 in the order

  3rd check
  1,2,3,4,5

  here with every check we are reducing the checks because we've already knew that the last elements are allocated in the correct order so we could just ignore it

  SPACE COMPLEXITY : O(1)--> constant no another array required , it is an inplace sorting algorithm
  TIME COMPLEXITY : Best case : O(N)
                    Worst case : O(N^2)
  As the size of the array increases the number of comparisons also will be increased
  BEST CASE: [1,2,3,4,5] --> 1 comparison , if there was no swaping happened then it is making sure that the given array is already sorted and there is no need for the further checks
  
STABILITY : this bubble sorting is know as the stable sorting algorithm


  Source code:

  public class Main{
    public static void main(String[] args)
    {
        int arr[]={5,4,3,2,1};
        bubbleSorting(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void bubbleSorting(int[] arr)
    {
        boolean swapped;
        for(int i=0;i<arr.length;i++)
        {
            swapped = false;
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;     // for the purpose of time complexity
                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }
}

OUTPUT:
[1,2,3,4,5]
