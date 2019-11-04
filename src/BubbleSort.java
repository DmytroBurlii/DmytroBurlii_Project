import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int  arr[] = new int[1000];
        for (int i=0; i<arr.length; i++){
            arr[i] = random.nextInt()%1000;
        }

        boolean x = false;
        int q, y;
        while (x!=true){
            q=0;
            for (int i=1; i<arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    y = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = y;
                    q++;
                }
            }
            if(q==0){
                x=true;
            }
        }

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}