package cicles;
import java.util.Scanner;
public class cicli_zadanie_7 {
    public static void az(int n,int m) {
        if (n > 2) {
            for (; n < m; n++) {
                int x = 2;
                int z = n;
                int pr = 0;
                System.out.println("для числа" + n);
                while (z != 1) {
                    if (z % x == 0 && z != x) {
                        System.out.print("*" + x + "*");
                        z = z / x;
                        pr++;
                    }
                    if (z == x) {
                        if (pr != 0) System.out.print("*" + x + "*");
                        else System.out.print("только 1 и само числ");
                        break;
                    }
                    x++;

                }
                System.out.println(" ");
            }
        }else System.out.println("число меньше  2");
    }
    public static void main(String[] args)
    {int n;
    int m;
        System.out.println("введи меньшее число n");
    Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.println("//");
        System.out.println("введи большее число m");
        Scanner ss = new Scanner(System.in);
        m=ss.nextInt();
        az(n,m);
    }

}
