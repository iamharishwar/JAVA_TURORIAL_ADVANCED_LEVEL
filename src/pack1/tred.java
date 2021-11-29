package pack1;

import static java.lang.Thread.sleep;

class show extends Thread{

    public void run(){

        for(int i=0;i<5;i++) {
            System.out.println("in show");
           try{ Thread.sleep(1000);} catch(Exception e){}
        }
    }
}

class display  extends Thread{

    public void run(){

        for(int i=0;i<5;i++) {
            System.out.println("in display");
            try{Thread.sleep(1000); } catch(Exception e){}
        }
    }
}

public class tred{

    public static void main(String[] args){

        show t1 = new show();
        display t2 = new display();

        t1.start();
        try{Thread.sleep(1000); } catch(Exception e){}
        t2.start();
    }
}


