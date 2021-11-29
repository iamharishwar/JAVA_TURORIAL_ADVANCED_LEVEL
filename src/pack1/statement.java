package pack1;

public class statement {
    int a ;
    int b;
    int c;
    public statement(int a, int b){
        this.a=a;
        this.b=b;
    }
    public void add(){
        int c = a +b;
        System.out.println(c);
    }
    public static void main(String[] args){
        statement obj1 = new statement(200,300);
        obj1.add();
    }
}
