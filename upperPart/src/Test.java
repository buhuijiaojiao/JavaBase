public class Test {
    public static void main(String[] args) {
        int[] arr={100,133,444,151,515};
        printArr(arr);
        int sum=getMax(arr);
        System.out.println(sum);
        boolean a=contains(444,new int[]{100,444});
        System.out.println(a);
        int[] copy = copyOfRange(arr, 2, 4);
        printArr(copy);

    }

    public static int[] copyOfRange(int[] arr,int from,int to){
        int[] arr0=new int[to-from];
        for (int i = 0; i < arr0.length; i++) {
            arr0[i]=arr[from++];
        }
        return arr0;
    }
    public static boolean contains(int number,int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (number==arr[i]){
                return true;
            }
        }
        return false;
    }
    public static int getMax(int[] arr){
        int sum=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (sum<arr[i]){
                sum=arr[i];
            }
        }
        return sum;
    }
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i]+",");
            }


        }
        System.out.println("]");
    }
}
