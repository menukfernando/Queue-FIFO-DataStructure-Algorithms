package Queue;

public class Queue{
    private int maxSize;
    private int queueArray[];
    private int front;
    private int rear;
    private int numberOfElements;
    
    public Queue(int maxSize){
        this.maxSize = maxSize;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        numberOfElements = 0;
    }
    
    private void Insert(int value){
        if(rear == maxSize-1){
            System.out.println("Queue Array is Full.");
        }else{
            queueArray[++rear] = value;
            numberOfElements++;
            System.out.println("Value "+value+" has Inserted.");
        }
    }
    
    private void Remove(){
        if(numberOfElements == 0){
            System.out.println("Queue Array is Empty.");
        }else{
            numberOfElements--;
            System.out.println("Value "+queueArray[front++]+" is Removed.");
        }
    }
    
    private void PeekFront(){
        if(numberOfElements == 0){
            System.out.println("Queue Array is Empty");
        }else{
            System.out.println("Front value is "+queueArray[front]+".");
        }
    }
    
    private void PeekRear(){
        if(numberOfElements == 0){
            System.out.println("Queue Array is Empty.");
        }else{
            System.out.println("Rear Value is "+queueArray[rear]+".");
        }
    }
    
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        
        
        queue.Insert(10);
        queue.Insert(20);
        queue.Insert(30);
        queue.Insert(40);
        queue.Insert(50);
        
        System.out.println("");
        
        queue.PeekFront();
        queue.PeekRear();
        
        System.out.println("");
        
        queue.Remove();
        queue.PeekFront();
        System.out.println("");
        
        queue.Remove();
        queue.PeekFront();
        System.out.println("");
        
        queue.Remove();
        queue.PeekFront();
        System.out.println("");
        
        queue.Remove();
        queue.PeekFront();
        System.out.println("");
        
        queue.Remove();
        queue.PeekFront();
        
    }
}
