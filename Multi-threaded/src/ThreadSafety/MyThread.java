package ThreadSafety;

public class MyThread extends Thread {
    //票数
    static int ticket = 0;

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    //    static Object obj=new Object();  或者MyThread.class或任何对象，只要唯一就可
    //代表这个锁，不可重复，所以要设置为静态的
    @Override
    public void run() {
        while (true) {
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //买票原语(同步代码块 不被打断)
            if (syMethod()) break;
            //买票原语(同步方法)
        }
    }

    //提取出同步方法
    //同步方法里所用的锁看类实现的对象个数，若所在类创建了多个对象 需要以所在类字节码为锁保证唯一
//                                              例如继承Tread就是需要创建多次
    //                              若所在类只创建了一个对象，直接使用this为锁即可保证唯一性 方法体内使用的变量也不必使用static修饰，因为只创建了一个实例
//                                            例如实现Runable接口就是只需创建一次
//                                  实际上java就是这么做的，自动判断使用this还是class为锁
    private synchronized boolean syMethod() {
        if (ticket >= 100) {
            return true;
        }
        //卖票
        ticket++;
        System.out.println(getName() + "卖出去了第" + ticket + "张票");
        return false;
    }
}
