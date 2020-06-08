package javabooklessons;

public class Main {
    public static void main(String[] args) {
        Queue q= new Queue(10);
        System.out.println(q.qArr.length);
        for (int j = 0; j <q.qArr.length ; j++) {
            q.qArr[j]=j;
            q.putloc++;
        }
        System.out.println(q.get());
        System.out.println(q.get());
        q.put(15);
//        int[] array = {11,22,33,44,55,66,77,88,99,100};
//        for (int arr: array
//             ) {
//            System.out.println(arr);
//            if (arr==5) break;
//
//        }
    }
}
