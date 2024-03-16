package BtkAkademi.threadingDemo1;

public class KronometreThread implements Runnable {
    private Thread t;
    private String threadName;

    public KronometreThread(String threadName){
        this.threadName=threadName;
        System.out.println("Oluşturuluyor : "+threadName);
    }

    @Override
    public void run(){
        System.out.println("ÇALIŞTIRILIYOR "+threadName);

        for (int i=1;i<=10;i++){
            System.out.println(threadName+" : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Thread bitti : "+threadName);
    }

    public void start(){
        System.out.println("Thread nesnesi oluşuyor");
        if (t==null){
            t=new Thread(this, threadName);
            t.start();
        }
    }
}
