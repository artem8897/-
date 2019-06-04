package vetv;

public class vetvlenie_zadanie_1 {
    public static void check(int x,int y){
        if(x>0&&y>0&&x+y<180&&(x==90||y==90)){
            System.out.println("существует, есть прям угол");
        }else if(x+y<180&&x>0&&y>0){
            System.out.println("существует, нет прям ");
        }else {
            System.out.println("не существует");
        }
    }

    public static void main(String[] args) {
        check(90,1);
    }
}
