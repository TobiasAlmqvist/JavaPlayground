import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private JButton btn;

    public MainFrame() {
        super("Hello world");

        setLayout(new BorderLayout());

        textPanel = new TextPanel();
        btn = new JButton("Click Me!");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                textPanel.appendText("Hello\n");
            }
        });

        add(textPanel, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
