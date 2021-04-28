package Thread;

public class Test {
    public static void main(String[] args) {
        Account act = new Account("act-001",10000);
        //创建两个线程
        Thread t1 = new AccountThread(act);
        Thread t2= new AccountThread(act);

        t1.setName("t1");
        t2.setName("t2");
        //启动线程取款
        t1.start();
        t2.start();
    }
}
