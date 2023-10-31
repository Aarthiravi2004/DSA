class HelloWorld {
    public static void main(String[] args) {
        int arr[] ={56,54,73,22,10};
        System.out.print(Arrays.toString(mergeSorting(arr)));
    }
    public static int[] mergeSorting(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSorting(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSorting(Arrays.copyOfRange(arr,mid,arr.length));
        
        return merging(left,right);
    }
    public static int[] merging(int[] left, int[] right)
    {
        int[] mix = new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i < left.length && j< right.length)
        {
            if(left[i] < right[j])
            {
                mix[k] = left[i];
                i++;
            }
            else
            {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while( i < left.length)
        {
            mix[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length)
        {
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
}

OUTPUT:
[10, 22, 54, 56, 73]
