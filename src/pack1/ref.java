package pack1;

public class ref {

    int age;

    public void setAge(int age ){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args){
        ref obj1 = new ref();

        obj1.setAge(29);
        System.out.println(obj1.getAge());
    }
}
