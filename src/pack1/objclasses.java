package pack1;

public class objclasses {

    int a ;
    int b;
    int c;

    public  void perform(int a, int b){

        c = a+b;
        System.out.println(c);
    }

    public static void main(String[] arg){

        objclasses inst = new objclasses();
        inst.perform(100,200);

    }
}
