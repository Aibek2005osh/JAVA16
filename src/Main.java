
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Сан киргиз: ");
//        int bek = scan.nextInt();
//        int res = bek % 2;
//
//        if ( res == 0) {
//            System.out.println("jup san");
//        } else  {
//            System.out.println(" tak san");
        //       }

//        Scanner Aison = new Scanner(System.in);
//
//        System.out.print ("MEN :" );
//        int Syiyy = Aison.nextInt();
//
//
//        Random random =new Random();
//       int Aibek = rando m.nextInt(1,5);
//        System.out.println("BOT ;"+ Aibek);
//
//       if (Syiyy==Aibek ){
//           System.out.println("a==b");
//       }else {
//           System.out.println("a!=b");
//       }

//        Scanner BEK = new Scanner(System.in);
//        System.out.print("kaalagan san jaz (1 - 3): ");
//        Byte num = BEK.nextByte();
        //
////Random random = new Random();
//        int ran = random.nextInt(3) + 1;
//
//        System.out.println("MEN = " + num);
//        System.out.println("BOT = " + ran);
//        if (num > ran) {
//            System.out.println(num + " > " + ran + "     сиз уттунуз");
//        } else if (num < ran) {
//            System.out.println(num + " < " + ran + "     BOT утту");
//        } else {
//            System.out.println(num + " = " + ran + "     тен чыктыныз");
//        }

//     Scanner scanner = new Scanner(System.in);
//        System.out.print("1 san :");
//     int a = scanner.nextInt();
//        System.out.print(" 2 san :");
//     int b = scanner.nextInt();
//        System.out.print(" 3 san :");
//     int c = scanner.nextInt();

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("san :");
//        int Aibek = scanner.nextInt();
//      System.out.print("san2 ;");
//      int bek = scanner.nextInt();
//      ;
//
//       if (Aibek > bek  ){
//          System.out.println("чон" + Aibek);
//      }else if (bek > Aibek) {
//          System.out.println("кичине :" + bek);
//       }else {
//           System.out.printf("");
        //}

//
//        int a = 10 ;
//            while (a > 0){
//
//                System.out.println(a);
//            a--;}
//

//            Scanner scanner = new Scanner(System.in);
//        System.out.println("san");
//            int b = scanner.nextInt();
//          while (b > 0) {
//            System.out.println(b--);
//        }

      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("san");
        int b = scanner.nextInt();

        int c = 0;
        while (b < c  ) {

            int v += 2
            System.out.println(b);
            c++; */


//        Scanner scanner = new Scanner(System.in);
//        while (true){
//            System.out.print("number :");
//            int number2 = scanner.nextInt();
//            int c = 0;
//            if (number2 <=c) break ;
//            else  number2 += c;

//        int number = 1;
//        while (number <= 10){
//            System.out.printf(" %d * %d = %d\n", 2, (number), 2 * number);
//            number++;
//        }
//
//        int outerStartNum = 2;
//        int innerStartNum = 1;
//        while (outerStartNum < 10){
//            while (innerStartNum <= 10){
//                System.out.printf(" %d * %d = %d\n", outerStartNum, innerStartNum, (outerStartNum * innerStartNum));
//                innerStartNum++;
//            }
//            System.out.println("_____________________");
//            innerStartNum = 1;
//            outerStartNum++;
//        }



int num = 300;
myMethod(num);


    }
public static void myMethod (int num ){

     int res = 0;
    for (int i = 0; i < num; i++) {
        if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0){
            res += i;
            System.out.println(i + "");
        }

    }
    System.out.println("result ;"+res);
}

        }




