import java.util.Scanner;

public class TicTacToe {
    //public static final String
    public static final String KHRESTIK=" X ", NOLIK=" O ", PUSTO="   ";
    public static int STOVP=3, RYAD=3;
    public static String pole [][] = new String[STOVP][RYAD];
    public static int stanGru=0;
    public static String activIgrok;
    public static Scanner scan =  new Scanner(System.in);

    public static void Start() {

    }

    public static void main(String[] args) {
        zapovnenyaPolya();
        vuvidPolya();
        Gra();
    }


    public static void vuvidPolya(){
        System.out.println("-----------");
        for(int s=0; s<STOVP; s++){
            for (int r=0; r<RYAD; r++){
                System.out.print(pole[s][r]);
                if(r!=RYAD-1){
                    System.out.print("|");
                }
            }
            System.out.println("");
            System.out.println("-----------");
        }
    }

    public static void zapovnenyaPolya(){
        for(int s=0; s<STOVP; s++){
            for (int r=0; r<RYAD; r++){
                pole[s][r] = "   ";
            }
        }
        activIgrok=KHRESTIK;
    }

    public static void pochatokGru(){
        boolean bl = false;
        while(bl==false){
            System.out.print("Ходит"+activIgrok+", введите область поля [ряд пробел столбик]: ");
            int stovp = scan.nextInt()-1;
            int ryadok = scan.nextInt()-1;
            if(ryadok>=0 && ryadok<RYAD && stovp>=0 && stovp<STOVP && pole[stovp][ryadok]==PUSTO){
                pole[stovp][ryadok]=activIgrok;
                vuvidPolya();
                if(activIgrok==KHRESTIK){
                    activIgrok=NOLIK;
                } else {
                    activIgrok = KHRESTIK;
                }
                bl=true;
            } else {
                System.out.println("НЕ ПРАВИЛЬННЫЙ ВВОД! Попробуйте еще раз!");
            }
        }
    }

    public static void Gra(){
        while (stanGru==0){
            pochatokGru();
            stanGru = proverkaStanyIgru();
        }
        switch(stanGru){
            case 1:
                System.out.println("Выиграл: X");
                break;
            case 2:
                System.out.println("Выиграл: O");
                break;
            case 3:
                System.out.println("Выиграл: НИЧЬЯ");
                break;
        }
    }

    public static int proverkaStanyIgru(){
        int kilk;
        for (int ryadok=0; ryadok<RYAD; ryadok++){
            kilk = 0;
            for (int stovp=0; stovp<STOVP; stovp++){
                if (pole[ryadok][0]!=PUSTO && pole[ryadok][0]==pole[ryadok][stovp]){
                    kilk++;
                }
            }
            if (kilk==3){
                if(pole[ryadok][0]==KHRESTIK){
                    return 1;
                } else if(pole[ryadok][0]==NOLIK){
                    return 2;
                }
            }
        }
        for (int stovp=0; stovp<STOVP; stovp++){
            kilk = 0;
            for (int ryadok=0; ryadok<RYAD; ryadok++){
                if (pole[0][stovp]!=PUSTO && pole[0][stovp]==pole[ryadok][stovp]){
                    kilk++;
                }
            }
            if (kilk==3){
                if(pole[0][stovp]==KHRESTIK){
                    return 1;
                } else if(pole[0][stovp]==NOLIK){
                    return 2;
                }
            }
        }
        if (pole[0][0]!=PUSTO && pole[0][0]==pole[1][1] && pole[0][0]==pole[2][2]){
            if(pole[0][0]==KHRESTIK){
                return 1;
            } else if(pole[0][0]==NOLIK){
                return 2;
            }
        }
        if (pole[0][2]!=PUSTO && pole[0][2]==pole[1][1] && pole[0][2]==pole[2][0]){
            if(pole[0][2]==KHRESTIK){
                return 1;
            } else if(pole[0][2]==NOLIK){
                return 2;
            }
        }
        return 0;
    }
}