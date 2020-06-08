package udemyfirstmonth;

import java.util.Scanner;

public class FirstMonth {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.printf(s.next());
////        System.out.println(changeNumToText("94 556 444"));
        Vehicle y = new Car(20);

        Vehicle X = new Vehicle(19);
        Vehicle X1;
        Car C = new Car(3);
        X1=C;
        X1.show();

//        System.out.println(y.toString());

//        LocalDate date = LocalDate.of(2012,1,30);
//        date.plusDays(10);
//        System.out.println(date);
//
//
//
//        for (int i = 0; i <10 ; i++) {
//            for (int j = 0; j <10 ; j++) {
//                if (i==0||i==9 || j==0||j==9){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//
//        }


    }

    static int a = 0;

    public static void startJob() {
        a++;
        int b = a;
        if (b < 5)
            startJob();

        System.out.println(b);
    }

    public static void printStep(int a, int c) {
        for (int i = 0; i < a; i++) {
            System.out.println(c);
        }
    }

    public static void printDiamond() {
        int i, j, r;
        System.out.print("Input number of rows (half of the diamond) : ");
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        for (i = 0; i <= r; i++) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for (i = r - 1; i >= 1; i--) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }


    }

    public static String changeNumToText(int number) {
        return changeNumToText(String.valueOf(number));

    }

    public static String changeNumToText(String text) {
        text = text.replace(" ", "");
        String result = "";
        int textLenght = text.length();
        switch (textLenght) {
            case 1:
                return changeTeklik(text.charAt(0));
            case 2:
                return changeOnluq(text.charAt(0)) + changeTeklik(text.charAt(1));
            case 3:
                return changeTeklik(text.charAt(0)) + "yüz " + changeNumToText(Integer.parseInt(text.substring(1)));
            case 4:
                return changeTeklik(text.charAt(0)) + "min " + changeNumToText(Integer.parseInt(text.substring(1)));
            case 5:
                return changeNumToText(text.substring(0, 2)) + "min " + changeNumToText(Integer.parseInt(text.substring(2)));
            case 6:
                return changeNumToText(text.substring(0, 3)) + "min " + changeNumToText(Integer.parseInt(text.substring(3)));
            case 7:
                return changeTeklik(text.charAt(0)) + "milyon " + changeNumToText(Integer.parseInt(text.substring(1)));
            case 8:
                return changeNumToText(text.substring(0, 2)) + "milyon " + changeNumToText(Integer.parseInt(text.substring(2)));
            case 9:
                return changeNumToText(text.substring(0, 3)) + "milyon " + changeNumToText(Integer.parseInt(text.substring(3)));
            case 10:
                return changeTeklik(text.charAt(0)) + "milyard " + changeNumToText(Integer.parseInt(text.substring(1)));
            case 11:
                return changeNumToText(text.substring(0, 2)) + "milyard " + changeNumToText(Integer.parseInt(text.substring(2)));
            case 12:
                return changeNumToText(text.substring(0, 3)) + "milyard " + changeNumToText(Integer.parseInt(text.substring(3)));
            default:
                return result;
        }


    }

    public static String changeTeklik(char number) {
        String result = "";
        switch (number) {
            case '1':
                return "bir ";
            case '2':
                return "iki ";
            case '3':
                return "üç ";
            case '4':
                return "dörd ";
            case '5':
                return "beş ";
            case '6':
                return "altı ";
            case '7':
                return "yeddi ";
            case '8':
                return "şəkkiz ";
            case '9':
                return "doqquz ";

        }
        return result;
    }

    public static String changeOnluq(char number) {
        String result = "";
        switch (number) {
            case '1':
                return "on ";
            case '2':
                return "iyirmi ";
            case '3':
                return "otuz ";
            case '4':
                return "qırx ";
            case '5':
                return "əlli ";
            case '6':
                return "altmış ";
            case '7':
                return "yetmiş ";
            case '8':
                return "şəksən ";
            case '9':
                return "doxsan ";

        }
        return result;
    }
}
