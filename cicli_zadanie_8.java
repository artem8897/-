package cicles;
import java.util.Scanner;
public class cicli_zadanie_8 {
    public static void find(int a,int b){
        int aa=0;
        int bb=0;
        int az=a;
        int bz=b;
        while(az!=0){
            az = az/10;
            if(az!=0)aa++;
        }
        while(bz!=0){
            bz = bz/10;
            if(bz!=0)bb++;
        }
        int max;
        max=aa>bb?aa:bb;
        numers(a,b,max);

    }
    public static void numers(int a,int b, int max){
        int aNums[] = new int[max+1];
        int bNums[]=new int[max+1];
        int i=0;
        int t;
        while(a!=0){
            t = a%10;
            aNums[i]=t;
            a = a/10;
            i++;
        }
        int j=0;
        int z;
        while(b!=0){
            z = b%10;
          bNums[j]=z;
            b = b/10;
            j++;
        }
        int in;
        int jn;
        int ar[]=new int[max+1];
        int ari=0;
        for(in=0;in<max;in++){
            for(jn=0;jn<max;jn++){
                if(aNums[in]==bNums[jn]){
                    int aaz=0;
                    for(int aza=0;aza<ar.length;aza++){
                        if(ar[aza]==aNums[in]){
                            aaz=1;break;
                        }
                    }
                    if(aaz==0){
                 ar[ari]=aNums[in];
                 ari++;
                }
                }
            }
        }
        for(int iz=0;iz<ari;iz++){
            System.out.println(ar[iz]);
        }
    }

    public static void main(String[] args) {
        System.out.println("int 1 zifr");
        Scanner za=new Scanner(System.in);
        int a=za.nextInt();
        Scanner az = new Scanner(System.in);
        System.out.println("int 2 zifr");
        int aa= az.nextInt();
        find(a,a);
    }
}
