import java.util.Date;

public class abc_001 {

    //如果a+b+c=1000，且a^2+b^2=c^2,如何求出所有a,b,c可能的组合
    public static void main(String[] args) {
        Date d1 = new Date();
        int m = 1000;
//        for (int a = 0; a <= m; a++) {
//            for (int b = 0; b <= m; b++) {
//                for (int c = 0; c <= m; c++) {
//                     if (a+b+c==1000 && a*a+b*b==c*c){
//                         System.out.println(a+","+b+","+c);
//                     }
//                }
//            }
//        }


//        T为时间复杂度
//        T = 1000 * 1000 * 2
//        T = 2000 * 2000 * 2
//        T = N * N * 2
//        抽象成函数为  T(n) = n^3 * 2

        for (int a = 0; a <= m; a++) {
            for (int b = 0; b <= m; b++) {
                int c = m - a - b;
                if (a * a + b * b == c * c) {
                    System.out.println(a + "," + b + "," + c);
                }
            }
        }

        Date d2 = new Date();
        System.out.println((d2.getTime() - d1.getTime()) + "毫秒");

    }
}
