package pack1;

class grandfather{

    String name = "GRAND";
    int age = 50;
    String city="sedam";
}
class father extends grandfather{

    public void show(){
        System.out.println("THe name is :" + name);
    }
}
class son extends father{
    public void display(){
        System.out.println("THe name is :" + age);
    }

    public void see(){
        System.out.println("THe name is :" + city);
    }
}
public class inducts {
    public static void main(String[] args){
        father obj1 = new father();
        son obj2 = new son();
        obj1.show();
        obj2.display();
    }
}
