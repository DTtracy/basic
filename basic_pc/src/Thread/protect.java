package Thread;

public class protect {
    public static void main(String[] args) {
        Thread t = new BackDataThread();
        t.setName("备份数据的线程");
        t.setDaemon(true);
        t.start();

        //主线程：主线程是用户线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"--->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BackDataThread extends Thread{
    @Override
    public void run() {
        int i=0;
        while (true){
            System.out.println(Thread.currentThread().getName()+"--->"+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}