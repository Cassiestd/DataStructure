package com.at.queue;

public class MyQueue_1 {
   // private int maxSize;
    private int front=-1;
    private int rear=-1;
    int[] queue;

    public MyQueue_1(int max){
        queue=new int[max];
    }


    public boolean isFull(){
        return rear==queue.length-1;
    }

    public boolean isEmpty(){
        return front==rear;
    }

    public boolean enQueue(int data){
        if(!isFull()){
            queue[++rear]=data;
            return true;
        }
        return  false;
    }

    public boolean  deQueue(){
        if(!isEmpty()){
            //int item=queue[front++];
            front++;
            return true;
        }
        return  false;
    }

    public int getFront(){
        if(!isEmpty()){
            int i=queue[front+1];
            return i;
        }

        return -1;
    }

    public int getRear(){
        if (!isEmpty()){
            int a=queue[rear];
            return a;
        }
        return -1;
    }

    public static void main(String[] cassie){
        MyQueue_1 myQueue=new MyQueue_1(3);
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());

    }



}
