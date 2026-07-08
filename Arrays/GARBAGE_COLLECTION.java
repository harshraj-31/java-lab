class GARBAGE_COLLECTION

{
    protected void finalize()
    {
        System.out.println("Object destroyed");
    }
    public static void main(String args[])
    {
        GARBAGE_COLLECTION t = new GARBAGE_COLLECTION();
        t = null;          
        System.gc();       
    }
}