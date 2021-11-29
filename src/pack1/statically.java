package pack1;

public class statically {

   static  String name = "REDDY";
    String city;
    String car;

    public void show(){
        System.out.println("THe name is" + name);
        System.out.println("THe car is" + car);
        System.out.println("THe city is" + city);
    }

    public static void main(String[] arg){

        statically obj1 = new statically();

        obj1.city="paris";
        obj1.name="harish";
        obj1.car="Renault";
        obj1.show();
        statically obj2 = new statically();
        obj2.city="toulouse";
        obj2.name="naveen";
        obj2.car="sofa";
        obj2.show();
    }
}
