package liney;

public class zadanie_5 {
    public static void ti(int a){
        int min=0;
        int hour=0;
        int sec=0;
            hour = a/3600;
            a=a-hour*3600;
            min=a/60;
            a=a-min*60;
            sec=a%60;
            System.out.println(hour + "ч " + min+"мин "+sec+"с");

    }

    public static void main(String[] args) {
        ti(120);
    }
}
