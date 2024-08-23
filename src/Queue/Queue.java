/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Menuk Fernando
 */
public class Queue {
    private int maxValue;
    private int queueArray[];
    private int front;
    private int rear;
    private int numberOfElements;
    
    public Queue(int maxValue){
        this.maxValue = maxValue;
        queueArray = new int[maxValue];
        front = 0;
        rear = -1;
        numberOfElements = 0;
    }
    
    private void Insert(int value){
        if(rear == maxValue-1){
            System.out.println("Queue Array is Full");
        }else{
            queueArray[++rear] = value;
            System.out.println("Value "+value+" added to the Queue Array");
        }
    }
    
    private void Remove(){
        if(rear == -1){
            System.out.println("Queue Array is Empty");
        }else{
            numberOfElements--;
            System.out.println("Value "+queueArray[front++]+" has Removed");
        }
    }
    
    private void PeekFront(){
        if(rear == -1){
            System.out.println("Queue Array is Empty");
        }else{
            System.out.println("Front Value is "+queueArray[front]+".");
        }
    }
    
    private void PeekRear(){
        if(rear == -1){
            System.out.println("Queue Array is Empty");
        }else{
            System.out.println("Rear Value is "+queueArray[rear]);
        }
    }
    
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        
        queue.Remove();
        System.out.println("");
        
        queue.Insert(10);
        queue.PeekFront();
        System.out.println("");
        
        queue.Insert(20);
        System.out.println("");
        
        queue.Insert(30);
        System.out.println("");
        
        queue.Remove();
        queue.PeekFront();
        queue.PeekRear();
        
    }
}
