class AR implements Runnable
{
 public void run()
 {
  for(int i=1; i<=4; i++){
   System.out.println("hello");
   try{
       Thread.sleep(10);
   }
    catch (InterruptedException e) {
       e.printStackTrace();
   }
         }
      }

    }
class AN implements Runnable{
    public void run(){
        for(int i=1;i<=4;i++){
            System.out.println("hiioiiii");
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class Event
{
    public static void main(String[] args) {
        Runnable ar=new AR();
        Runnable an=new AN();
        Thread t1=new Thread(ar);
        Thread t2=new Thread(an);

        t1.start();
        t2.start();
    }
}
