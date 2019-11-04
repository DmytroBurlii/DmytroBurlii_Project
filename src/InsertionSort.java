import java.util.Random;

public class InsertionSort{
    public static void main(String[] args) {
        Random random = new Random();
        int  arr[] = new int[10];
        for (int i=0; i<arr.length; i++){
            arr[i] = random.nextInt()%1000;
        }


        for (int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}

