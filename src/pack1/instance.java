package pack1;

class todo{

    public void add(int a, int b){

        int c = a+b;
        System.out.println(c);
    }

    public void sub(int y, int z){
        int x = y - z;
    }
}

public class instance{

    public void mult(int u, int w){
        int v = u*w;
    }
    public static void main(String[] args){

        todo obj1 = new todo();
        obj1.add(500,500);
        System.out.println("in todo");
    }
}
