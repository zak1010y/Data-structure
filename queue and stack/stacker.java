package dataStructure.week_6;

public class stacker {
    
    public static void main(String[] args) {

        queue2 q1 = new queue2(5);
        queue2 q2 = new queue2(5);
        
    }

    public static int pop(queue2 q1, queue2 q2){
        int x = q1.currantSize;
        while(x != 1){

            q2.add(q1.last_element()); 
            q1.remove();
            x--;
        }
        return q1.last_element();       
    }
}
