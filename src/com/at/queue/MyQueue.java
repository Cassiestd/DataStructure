package com.at.queue;

/**
 * 自定义队列：入队列和出队列
 */
public class MyQueue {
    private int[] data;
    private int head=-1,back=-1;
    public MyQueue(int count){
        this.data=new int[count];
    }
    //head:头指针，初始值为-1，指向队列第一个元素的前一个元素
    //back：尾指针，初始值为-1，指向队列最后一个元素(另一种情况：指向队列最后一个元素的下一个位置)

    public boolean enQueue(int temp){
        if(back==data.length-1){
            return  false;
        }
        data[++back]=temp;
        return true;
    }

    public boolean deQueue(){
        if(head==back){
            return false;
        }
        int count= data[++head];
        System.out.println(count);
        return true;
    }




    public static void main(String[] cassie){
        MyQueue myQueue=new MyQueue(3);
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();



    }



}
