public class method {
    public static void main(String[] args) {
        String str=new String("software learning institute");
        String srrr[]={"kunal","rahul","ankit"};
        String x[]={"kunal","rahul","ankit"};

        System.out.println("join: "+String.join("-",srrr));
        System.out.println("substring: "+str.substring(4, 9));
        System.out.println("length: "+str.length());
        System.out.println("substring: "+str.substring(6));

        for(int i=0;i<=127;i++)
        {
            System.out.println(""+i+":- "+(char)i);
        }
        System.out.println();
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }


        for(char c:str.toCharArray())
        {
            System.out.println(c);
        }
        System.out.println(str.startsWith("so"));
        System.out.println(str.startsWith(str, 5));
        System.out.println(str.endsWith("te"));
        System.out.println(str.endsWith("ab"));
        System.out.println("contains: "+str.contains("learning"));


        String a=str.intern();
        System.out.println("cpy string: "+a);

        System.out.println("comparetoignor: "+("abc").compareToIgnoreCase("ABC"));
        
        System.out.println("concate: "+("abc").concat("xyz"));

         System.out.println("join: "+String.join("-","software","training","center"));

         //02/05/2023
         System.out.println(String.join("/", "02","05","2023"));
         System.out.println(str.isEmpty());
       String strr[]=("02/05/2023").split("/");
       System.out.println(strr.length);
       for(String n:strr)
       {
        System.out.println(n);
       }
         
       
    }
    
}
