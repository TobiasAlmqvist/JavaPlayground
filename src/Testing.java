import java.util.ArrayList;

public class Testing {

    public static int token = 0;

    public static void main(String[] args){

        //Animal får = new Animal();
        //får.doStuff();

        //int test = 100;
        //String iTest = får.convInt(test);
        //System.out.println(iTest + 7);

        Thread getInput = new GetInput();
        Thread Count = new Count();

        Count.start();
        getInput.start();


    }


}
