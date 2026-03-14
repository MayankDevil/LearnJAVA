
package java5;

class Class_Thread
{
    public Class_Thread() 
    {
        // Thread.activeCount();
        //Thread.currentThread().setName("Master");
        //Thread.currentThread().getName();
        //Thread.currentThread().setPriority();
        //Thread.currentThread().getPriority()
        //Thread.currentThread().isAlive();
        //Thread.currentThread().isDaemon();
        //Thread.currentThread().getState();
        
        
        System.out.println();
        
        for(int i = 1 ; i<5; i++)
        {
            System.out.println("count "+i);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception error)
            {
                System.out.println(error);
            }
        }
        System.out.println("Execute Complete");
        
    }    
}
