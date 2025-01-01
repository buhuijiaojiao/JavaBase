package case0.c1;

public class Window extends Thread{
    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (Window.class){
                if (Resources.movieTicket==0){
                    System.out.println("票已卖完");
                    System.out.println(getName()+"一共卖了"+count+"张电影票");
                    return;
                }
                Resources.movieTicket--;
                count++;
                System.out.println(getName()+"卖了一张电影票,还剩"
                        +Resources.movieTicket+"张未售出");
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
