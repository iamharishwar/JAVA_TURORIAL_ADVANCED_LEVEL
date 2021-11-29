package pack1;

public class tacatch {

    public static void main(String[] args) {

        try{
            int i=5;
            int j=100;
            int result = j/i;
            if(result==20){
                throw new ReddyException("it should be changed");
            }
            System.out.println("the ans is :"+ result );
        }catch(ReddyException e){
            System.out.println("error is here: "+ e.getMessage());
        }
    }
}
