import javafx.embed.swing.JFXPanel;
import java.util.ArrayList;
import javax.swing.*;

public class Testing {

    public static int token = 0;

    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                new MainFrame();

            }

        });

        //Testing threads
        /*
        Thread getInput = new GetInput();
        Thread Count = new Count();

        Count.start();
        getInput.start();
        */

    }
}