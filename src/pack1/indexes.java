package pack1;

public class indexes {

public static void main(String[] args){

    int a[][] = {
            {10,20,30,40,50},
            {60,70,80,90},
            {110,120,130,140,150}
    };
    for(int k[]:a){
        for(int l:k){
            System.out.print(" " + l);
        }
        System.out.println();
     }
  }
}
