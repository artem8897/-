package vetv;

public class vetvlenie_zadanie_2 {
    public static int find(int a,int b,int c,int d){
        int max;
        int minOne;
        int  minTwo;
        if(a<b){minOne=a;}
        else minOne=b;
        if(c<d){minTwo=c;}
        else minTwo = d;
        if(minOne>minTwo){
            max=minOne;
        }
        else {max=minTwo;}
        return max;
    }


}
