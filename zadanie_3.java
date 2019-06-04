package liney;

import java.lang.Math;
public class zadanie_3 {
    public double resh(int x,int y){
        double result;
        result = ((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
        return result;
    }
}
