import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        Random random = new Random();
        int  arr[] = new int[5];
        for (int i=0; i<arr.length; i++){
            arr[i] = random.nextInt()%1000;
        }

        Arrays.sort(arr);

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int poch = 0;
        int kin = arr.length-1;
        int ser = 0;

        while(poch<=kin){
            ser = (poch + kin) / 2;
            if(number>arr[ser]){
                poch = ser+1;
            } else if (number<arr[ser]){
                kin = ser-1;
            } else if(number==arr[ser]){
                System.out.println("Елемент " + number + " находиться в ячейке № " + ser);
                break;
            }

        }
        System.out.println("Елемент " + number + " не был найден!");

        // МОДИФИКАЦИЯ
        if(arr[0]>number){
            arr[0] = number;
        } else if(arr[arr.length-1]<number){
            arr[arr.length-1] = number;
        } else {
            for (int i=1; i<arr.length; i++){
                for(int j=i; j>0; j--){
                    if(arr[j]>number && arr[j-1]<number){
                        arr[j-1] = number;
                    }
                }
            }
        }

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
