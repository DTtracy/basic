package Thread;

import java.util.ArrayList;
import java.util.List;

public class PCtest {
    public static void main(String[] args) {
        //创建一个仓库对象，共享的
        List list = new ArrayList();
        //创建两个线程对象
        //生产者线程
        Thread t1 = new Thread(new Producer(list));

        //消费者线程
        Thread t2 = new Thread(new Consumner(list));

        t1.setName("生产者线程");
        t2.setName("消费者线程");

        t1.start();
        t2.start();
    }
}
//生产线程
class Producer implements Runnable{
    //仓库
    private List list;
    public Producer(List list){
        this.list=list;
    }
    @Override
    public void run() {
        //一直生产,死循环模拟
        while (true){
            //给仓库对象加锁
            synchronized (list){
                if(list.size()>0){//大于0说明仓库中已经有1个元素了
                    //当前线程进入等待状态,并且释放Producer之前占有的list集合的锁
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序能够执行到这里说明仓库是空的，可以生产
                Object  obj = new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName()+"---->"+obj);
                //唤醒
                list.notify();
            }

        }
    }
}
//消费者线程
class Consumner implements Runnable{
    private List list;
    public Consumner(List list){
        this.list=list;
    }
    @Override
    public void run() {
        //一直消费
        while (true){
            synchronized (list){
                if(list.size()==0){
                    //仓库已经空了
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序能够执行到此处说明仓库中有数据，进行消费
                Object obj = list.remove(0);
                System.out.println(Thread.currentThread().getName()+"---->"+obj);
                //唤醒生产者生产
                list.notify();
            }
        }
    }
}