import java.util.ArrayList;

public class Animal {

    public static String iAmDog() {
        return "I am a dog";
    }

    public static String iAmCat() {
        String a = "I am a cat";
        return a.toUpperCase();
    }

    public static void doStuff(){

        int[][] List = {{0},{0}};

        for (int i = 0; i <= 10; i++){
            for (int j = 0; j <= 2; j++) {
                List[i][j] = i*2;
            }
        }

        System.out.println(List);
        //System.out.println(List.size());
    }

    public static String convInt(int num){
        String s = String.valueOf(num);
        return s;
    }
}
