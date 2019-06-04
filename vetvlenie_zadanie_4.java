package vetv;

public class vetvlenie_zadanie_4 {
    int A;
    int B;
    vetvlenie_zadanie_4(int a,int b){
        A=a;
        B=b;
    }
    public boolean find(int x,int y,int z){
        if(x==A&&y==B||x==A&&z==B||y==A&&z==B||x==B&&y==A||x==B&&z==A||y==B&&z==A){return true;}
        else return false;
    }
}
