package pack1;

class one{

    public one(){
        System.out.println("in one");
    }
    public one(int i){

        System.out.println("in i");
    }
}

class two extends one{

    public two(){

        super();
        System.out.println("in two");
    }
    public two(int i){

        super(i);
        System.out.println("in j");
    }
}

public class builder extends two{

    public builder(){
        System.out.println("in builder");
    }
    public builder(int i){

        super(i);
        System.out.println("in k");
    }
    public static void main(String[] args){

        builder obj1=new builder(5);
    }
}
