package liney;

public class zadanie_2 {
    public double otvet(int a,int b,int c){
        double result;
        result = ((b+Math.sqrt(Math.pow(b,2)+4*a*c))/2*a)-Math.pow(a,3)*c+Math.pow(b,-2);
        return result;
    }
}
