package vetv;

public class vetvlenie_zadanie_3 {
    public void find(int x1,int y1,int x2,int y2,int x3,int y3){

        if((x1==x1&&x2==x3&&x1==x3)||(y2==y3&&y1==y3&&y1==y2)){
            System.out.println("на одной прямой");
        }
        else System.out.println("нет");

    }
}
