import java.util.Scanner;
public class GetInput extends Thread {

    public void run(){

        while(true){
            Scanner Input = new Scanner(System.in);
            String text = Input.nextLine();
            text = text.toLowerCase();

            //System.out.println("You typed: "+text);

            if(text.equals("click")){
                Testing.token = Testing.token + 10;
                System.out.println("You now have " + Testing.token + " amount of tokens!");
            }else if (text.equals("tokens")){
                System.out.println("You have " + Testing.token + " amount of tokens!");
            }


            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e){
            }
        }
    }

}
