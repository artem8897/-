package cicles;
import java.util.Scanner;
public class cicli_zadanie_1 {
    public static void z(int x){
        int sum=0;
        int z=1;
        while(z!=x){
            sum+=z++;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int numb=num.nextInt();
        z(numb);
    }
}
