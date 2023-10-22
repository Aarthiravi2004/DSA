when the given rage is from 1 to N then use the cyclic sorting algorithm //very important


  Source Code:

class Main{
    public static void main(String[] args)
    {
        int[] arr={8,7,6,5,1,2,3,4};
        cyclicSorting(arr);
        System.out.print(Arrays.toString(arr));
    }

 static void cyclicSorting(int[] arr)
{
    int i=0;
    while(i < arr.length){              //while loop for the continuous swapping until that particular position get the appropriate number
        int correct = arr[i]-1;
        if(i != correct)
        {
            swap(arr,i,correct);
        }
        else 
        {
            i++;
        }
    }
}
 static void swap(int[] arr, int first, int second)
{
    int temp = arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
}
}
