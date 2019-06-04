package vetv;

public class vetvlenie_zadanie_5 {
    public static double result(int x){
       double res;
        if(3<=x){
            res = (Math.pow(x,2) - 3*x +9);
            return res;
        } else if(x>3){
            res = 1/(Math.pow(x,3)+6);
            return res;
        } else return 0;

    }
}
