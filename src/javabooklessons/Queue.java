package javabooklessons;

public class Queue {
    int[] qArr;
    int putloc, getloc;

    public Queue(int size) {
        this.qArr = new int[size];
    }
    public void put(int input){
        if (putloc==this.qArr.length){
            System.out.println("Queue is full");
            return;
        }
        this.qArr[putloc++]=input;
    }
    public int get(){
        if (getloc==putloc){
            System.out.println("Queue is empty");
            return -1111;
        }
        return this.qArr[getloc++];
    }

}
