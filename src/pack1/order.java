package pack1;

class method1{

    public void type(){
        System.out.println("in above");
    }
}

class method2 extends method1{

    public void type(){
        System.out.println("in middle");
    }
}
    public class order extends method1{

    public void type(){
        System.out.println("in below");
    }

    public static void main(String[] args){

        method1 obj1 = new method2();
        obj1.type();
    }
}
