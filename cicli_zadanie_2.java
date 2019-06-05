package cicles;

public class cicli_zadanie_2 {
    public static void as(int a,int b,int h){
        int x;
        int y=0;
        for(;a<=b;a=a+h){
         if(a>2){
             y=a;
         }   else if(a<=2){
             y=-a;
         }
         else {System.out.println("mistake");}
            System.out.println(y);

        }
    }


}
