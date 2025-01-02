package case0.c5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

import static java.lang.Thread.sleep;

public class LotteryBox implements Callable<Integer> {
    private String lotteryBoxName;
    private ArrayList<Integer> prizeList;
    public LotteryBox() {
    }
    public LotteryBox(String lotteryBoxName, ArrayList<Integer> list) {
        this.lotteryBoxName = lotteryBoxName;
        this.prizeList=list;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> newList = new ArrayList<>();
        while (true) {
            synchronized (LotteryBox.class) {
                if (prizeList.size() == 0) {
                    System.out.println("在此次抽奖过程中，"+lotteryBoxName+"总共产生了"+newList.size()+"个奖项");
                    System.out.println("分别为："+newList.toString()+"最高奖项为"+Collections.max(newList)+"元，总计额为"+newList.stream().mapToInt(Integer::intValue).sum()+"元");
                    break;
                }
                Collections.shuffle(prizeList);
                newList.add(prizeList.get(0));

                prizeList.remove(0);

            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return Collections.max(newList);
    }
}
