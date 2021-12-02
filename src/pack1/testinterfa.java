package pack1;

interface a{

      void add(int x, int y);
      void sub(int a, int b);
}

public class testinterfa implements a {

    public void add(int x, int y){
        int result = x+y;
        System.out.println(result);
    }

    public void sub(int a, int b){
        int result = a-b;
    }

    public static void main(String[] args){

        testinterfa obj1 = new testinterfa();
        obj1.add(10,20);
    }
}
