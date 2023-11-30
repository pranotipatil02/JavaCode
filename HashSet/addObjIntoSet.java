import java.util.HashSet;
import java.util.Iterator;

class Book
{
    int id;
    String author,name,publisher;
    Book(int id,String name,String author,String publisher)
    {
        this.id=id;
        this.name=name;
        this.author=author;
        this.author=publisher;
    }
}
public class addObjIntoSet {
 public static void main(String[] args) {

Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB");  
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill");  
    Book b3=new Book(103,"Operating System","Galvin","Wiley");
    HashSet<Book> set=new HashSet<>();
set.add(b1);
set.add(b2);
set.add(b3); 
 for(Book b:set){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher);  
    }  

}
    
}
