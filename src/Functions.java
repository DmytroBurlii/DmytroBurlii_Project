import java.util.Random;

public class Functions {
    public static int[] Array;

    public static void main(String[] args) {
        System.out.println("Сумма чисел 10 и 5 = " + Func_1(10,5));
        System.out.println("Найбольше число из чисел 5, 10, 0 = " + Func_2(5, 10, 0));
        Func_3(25);
        Func_4();
    }

    public static int Func_1(int x, int y){
        return x+y;
    }

    public static int Func_2(int x1, int x2, int x3){
        if(x1>x2 && x1>x3){
            return x1;
        } else if(x2>x1 && x2>x3){
            return x2;
        } else {
            return x3;
        }
    }

    public static void Func_3(int x){
        Array = new int[x];
        Random random = new Random();
        for(int i=0; i<Array.length; i++){
            Array[i] = random.nextInt()%1000;
        }
    }

    public static void Func_4(){
        for (int element:Array){
            System.out.println(element);
        }
    }
}
