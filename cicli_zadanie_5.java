package cicles;

public class cicli_zadanie_5 {
    public void az(double a){
        double sum=0;
        int i=0;
        double z=1;
        while(z>=a){
           z = 1/(Math.pow(2,i))+1/(Math.pow(3,i));
            i++;
            if(z>=a){sum+=z;}
        }
        System.out.println(sum);

    }

}
