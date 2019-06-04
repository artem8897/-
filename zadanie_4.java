package liney;

public class zadanie_4 {
    public static double change(double a){
        double newInt;
        double z = (int)a;
        long b = Math.round((a-z)*1000);
        newInt = b+z/1000;
        return newInt;
    }

    public static void main(String[] args) {
       double az = change(461.876);
        System.out.println(az);
    }
}
