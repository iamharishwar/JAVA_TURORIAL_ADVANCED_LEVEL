package pack1;
import static java.lang.Thread.sleep;

class print implements Runnable{

    public void run(){

        for(int i=0;i<5;i++) {
            System.out.println("in show");
            try{ Thread.sleep(1000);} catch(Exception e){}
        }
    }
}

class empire implements Runnable{

    public void run(){

        for(int i=0;i<5;i++) {
            System.out.println("in display");
            try{ Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
public class interred {

    public static void main(String[] args) throws Exception  {
        Runnable p1 = new print();
        Runnable e1 = new empire();
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(e1);
        t1.start();
        try{Thread.sleep(1000);} catch(Exception e){}
        t2.start();

        System.out.println(t1.getName());

        t2.getName();
        int[] a = {10,20,30,40};

        int[][] b = {
                {10, 30, 50, 70},
                {40, 50, 70, 80},
                {1,2,3,4}
        };
        System.out.println(b[0][1]);
    }
}
