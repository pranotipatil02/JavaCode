public class MyObject {
    private int id;

    public MyObject(int id) {
        this.id = id;
    }
    
    @Override
    protected void finalize() throws Throwable
    {
        try
        {
            System.out.println("finalizing object with id: "+id);
        }
        finally
        {
            super.finalize();
        }
        
    }
    
}
