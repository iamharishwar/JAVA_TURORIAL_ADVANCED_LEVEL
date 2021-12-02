package pack1;

public class continuebreak {

    public static void main(String[] arg){
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;   // continue will skip the step
            }
            System.out.println("the value of i is:" + i);
        }
    }
}
