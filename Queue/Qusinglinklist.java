package Queue;
import java.util.Queue;
 class QusingLinklist {
public static void main(String[] args) {
    Queue<Integer> num=new java.util.LinkedList<>();
  num.offer(10);
  num.offer(20);
  num.add(30);
  num.offer(40);
  num.offer(50);
  num.add(60);

  System.out.println("Queue: "+num);
  num.remove();//10
  System.out.println("Queue: "+num);
  num.poll();//20
  System.out.println("Queue: "+num);//30 40 50 60

System.out.println("peek: "+num.peek());//30


}
}
