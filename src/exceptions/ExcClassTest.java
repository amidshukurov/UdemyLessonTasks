package exceptions;

public class ExcClassTest {

    static void genExcp( int i) {
        int[] num = new int[4];
        try {
            System.out.println("\n start of try in method");
            switch (i){
                case 0:
                    int t = num[1] / i;
                     break;
                case 1:
                    num[6]=5;
                    break;
                case 2:
                    return;
            }
            System.out.println("Try");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array bound Catch in class");
        }
        catch (ArithmeticException exc){
            System.out.println("zero devidew");
        }


        System.out.println("After try and catch");
    }
}