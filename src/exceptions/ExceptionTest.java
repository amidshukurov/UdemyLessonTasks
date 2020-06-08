package exceptions;

public class ExceptionTest {
    public static void main(String[] args) {
//        try {
//            System.out.println("Before method");
//            ExcClassTest.genExcp();
//            System.out.println("After method");
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Catch in main");
//        }
//        System.out.println("After all");

        int[] num = {2, 4, 8, 16, 32, 64, 128};
        for (int i = 0; i <3 ; i++) {
            ExcClassTest.genExcp(i);
        }
    }
}
