package demos;

public class Main {
    public static void main(String[] args) {

        Sup S = new Sup();
        Sub1 sub1 = new Sub1();
        Sub2 sub2 = new Sub2();
        Sup ref;
        ref = S;
        ref.show();
        ref = sub1;
        ref.show();
        ref = sub2;
        ref.show();
        MyInfImp myin=new MyInfImp();
        System.out.println(myin.count);
        System.out.println(MyInf.result());



    }
}
