package BlockingQ;

import java.util.concurrent.ArrayBlockingQueue;

public class PutMethod {
    public static void main(String[] args) {
        ArrayBlockingQueue <Integer> q=new ArrayBlockingQueue<>(3);
        try{
            q.put(10);
        q.put(20);
        q.put(30);
        q.put(40);
        System.out.println("queue: "+q);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
