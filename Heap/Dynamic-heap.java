import java.util.*;
public class Heap<T extends comparable<T>> {

    private ArrayList<T> list;

    public Heap(){
        list = new ArrayList<>();
    }
    private void swap(int first,int second){
        T temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);

    }
    public int parent(int index){
        return (index+1)/2;
    }

    public int left(int index)
    {
        return (index*2)+1;
    }
    public int right(int index)
    {
        return (index*2)+2;
    }
    
    public void insert(T value)
    {
        list.add(value);
        upheap(list.size()-1);
    }
    
    private void upheap(int index)
    {
        if(index == 0)
        {
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0)
        {
            swap(index,p);
            upheap(p);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("your list is empty");
        }
        T temp = list.get(0);
        T last = list.remove(list.size()-1);
        if(!list.isEmpty())
        {
            list.set(0,last);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int index)
    {
        int min= index;
        int left = left(index);
        int right = right(index);
        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0)
        {
            min = left;
        }
        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0)
        {
            min = right;
        }

        if(min != index)
        {
            swap(index,min);
            downheap(min);
        }
    }

    public ArrayList<T> heapSort()
    {
        ArrayList<T> list1 = new ArrayList<>();
        int i=0;
        while(!list.isEmpty())
        {
            list1.add(list.remove(i));
            i++;
        }
        return list1;
    }

    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(10);
        heap.insert(20);

        heap.insert(30);

        heap.insert(40);

        heap.insert(50);


        System.out.print(heap.remove());

    }

}
