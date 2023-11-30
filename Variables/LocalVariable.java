class LocalVariable
{
    void printFun()
        {
         String str="Local Variable";//local 
         System.out.println("Message: "+str);  
        }
    public static void main(String[] args) {
        LocalVariable o=new LocalVariable();
        o.printFun();
    }
}

