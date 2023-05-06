package dataStructure.week_6;

public class queue2 {
    
    private int max;
    private int front;
    private int rear;
    public int currantSize;
    private int qureuearay[]; 

    public queue2(int max){

        this.max = max;
        this.front = -1;
        this.rear = -1;
        this.currantSize = 0;
        this.qureuearay = new int [max];
    }
    // this function is used to check if the array is impty or not
    public boolean isImpty(){
        if(currantSize == 0){
            return true;
        }else{
            return false;
        }
    }
    // this function is used to check if the array is full or not
    public boolean isFull(){
        if(max == currantSize){
            return true;
        }else{
            return false;
        }
    }
    // this function is used for adding an element after the last added element 
    public void add(int value){
        if(isFull()){
            System.out.println("the array is full");
        }else if(isImpty()){
            rear = (rear+1)%max;
            front = (front+1)%max;
            rear = value;
            currantSize++;
        }else{
            rear = (rear+1)%max;
            rear = value;
            currantSize++;
        }
    }
    // this function is used for deleting the oldest element
    public void remove(){
        if(isImpty()){
            System.out.println("the array is impty");
        }else if(rear == front){
            front = rear = -1;
        }else{
            front = (front+1)%max;
            currantSize--;
        }
    }

    public int last_element(){
        System.out.println(rear);
        return rear;
    }
}
