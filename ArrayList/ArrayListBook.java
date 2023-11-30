package ArrayList;

import java.util.*;
import java.util.ArrayList;  
class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
public class ArrayListBook {  
public static void main(String[] args) {  
     
    List<Book> list=new ArrayList<>();
      System.out.println("isempty: "+list.isEmpty());
    Book b1=new Book(1,"Book 1","Manjeet pal","BPB",8);  
    Book b2=new Book(2,"Book 2","Manish pal","Mc Graw Hill",4);  
    Book b3=new Book(3,"Book 3","Monu","Wiley",6);  
     
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
     
    for(Book b:list){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  
