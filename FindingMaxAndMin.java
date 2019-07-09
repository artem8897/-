package by.epam.introdaction_tasks.step_first.action;

public class FindingMaxAndMin {
    public static void find(int arr[]){

        int max = arr[arr.length-1];
        int min = arr[0];

        for(int elem : arr){

            if(max < elem){
                max = elem;
            }
            if(min > elem){
                min = elem;
            }
        }
        System.out.println("max =" + max + '\n' + "min =" + min);
    }
}
