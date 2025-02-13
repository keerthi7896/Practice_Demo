class Counter{
    int cont;
    public synchronized void increment(){
        cont++;
    }
}



    public class Count
    {
    public static void main(String[] args) throws InterruptedException {
             Counter c =new Counter();
        Runnable ar=()-> {
            for (int i = 1; i <= 10000; i++) {

                c.increment();
            }
        } ;
            Runnable an = () ->
            {
                for (int i = 1; i <= 10000; i++) {
                    c.increment();
                }
            };

                    Thread t1 = new Thread(ar);
                    Thread t2 = new Thread(an);

                    t1.start();
                    t2.start();
                    t1.join();
                    t2.join();
                    System.out.println(c.cont);
                }

            }



