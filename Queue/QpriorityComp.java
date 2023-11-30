package Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
class QpriorityComp {
    public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>(new CustomComparator());
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        System.out.print("PriorityQueue: " + numbers);
    }
}

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer number1, Integer number2) {
        int value =  number1.compareTo(number2);//4 2 1 3
        // elements are sorted in reverse order  //4 2 1 3
        if (value > 0) {                         //4 2 1 3
            return -1;//not swap                  //4 2 3 1
                                                  //4 2 3 1
        }                                         //4 3 2 1
        else if (value < 0) {
            return 1;//swap
        }
        else {
            return 0;//equal
        }
    }
}
/*
swapping concept
 v1>v2 : return 1 -swap  45 >34 
 v1<v2: return -1 -not swap  //23<30
 v1==v2 :- return 0  
 */
