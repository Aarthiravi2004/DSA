https://leetcode.com/problems/implement-queue-using-stacks/


class MyQueue {
    Stack<Integer> first;
    Stack<Integer> second;
    int size=0;

    public MyQueue() {
         first = new Stack<>();
         second = new Stack<>();
        
    }
    
    public void push(int x) {
        first.push(x);
        size++;
        
    }
    
    public int pop() {
        for(int i=0;i<size;i++)
        {
            second.push(first.pop());
        }
        int k =  second.pop();
        size--;
        for(int i=0;i<size;i++)
        {
            first.push(second.pop());
        }
        return k;
        
    }
    
    public int peek() {
        for(int i=0;i<size;i++)
        {
            second.push(first.pop());
        }
        int k =  second.peek();
        
        for(int i=0;i<size;i++)
        {
            first.push(second.pop());
        }
        
        return k;
    }
    
    public boolean empty() {
        if(size == 0)
        {
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */



OUPTUT:
Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]

Explanation
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false
 
