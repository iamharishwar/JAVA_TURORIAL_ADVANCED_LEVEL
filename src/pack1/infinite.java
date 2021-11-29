package pack1;

public class infinite {
    int res;
    public void result(int k, int...j){

        for(int i=0;i<j.length;i++){
            res =  k + j[i];
            System.out.println(res);
        }
    }

    public static void main(String[] args){
        infinite obj1 = new infinite();
        obj1.result(10,20,30,40,20,10,30,50);
    }
}
