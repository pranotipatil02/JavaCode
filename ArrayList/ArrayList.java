package ArrayList;

import java.util.List;
public class ArrayList {
public static void main(String[] args) {
    List<String> name=new java.util.ArrayList<>();
    List<String> str=new java.util.ArrayList<>();
    System.out.println(name.size());
    System.out.println(str.size());

    System.out.println("name empty:"+name.isEmpty());
    System.out.println("str empty:"+str.isEmpty());

    name.add("Kunal");
    name.add("Mohit");
    name.add("Roshan");
    System.out.println("list:"+name);
    System.out.println("Accessed element"+name.get(1));
    System.out.println("name:"+name);
    name.set(1,"Prapti");
    System.out.println("List:"+name);
    name.remove(0);
    System.out.println("List:"+name);
    name.add("Sahil");
    System.out.println("List:"+name);
    System.out.println("Contains:"+name.contains("Mohit"));
    System.out.println(str.isEmpty());
    System.out.println(str.containsAll(name));
    
    //loop
    for(int i=0;i<name.size();i++)
    {
        System.out.println("index:"+i+": "+name.get(i));
    }
     
    //for each
    for(String s:name)
    {
System.out.println(s);
    }

    //sort
    name.sort(null);
    System.out.println("After sort:");
    for(int i=0;i<name.size();i++)
    {
        System.out.println(name.get(i));

        
    }
    
}    
}
