package ThreadPool;

public class Test2 {
    public static void main(String[] args) {
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println("cpu的逻辑处理器的数量(最大并行数): " + count);
    }
}
