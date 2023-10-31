class HelloWorld {
    public static void main(String[] args) {
        int arr[] ={56,54,73,22,10};
        quickSorting(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
    public static void quickSorting(int[] arr,int low , int hi)
    {
        if(low >= hi)
        {
            return;
        }
        int s = low;
        int e = hi;
        int m = s+(e-s)/2;
        int pivot = arr[m];
        while( s <= e)
        {
            while(arr[s]<pivot)
            {
                s++;
            }
            while(arr[e]>pivot)
            {
                e--;
            }
            if(s <= e)
            {
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        quickSorting(arr,low,e);
        quickSorting(arr,s,hi);
    }
}


OUTPUT:
[10, 22, 54, 56, 73]
