import javax.swing.*;

public class GUI {
    public GUI(){
        var frame = Setup();
    }

    public JFrame Setup(){
        var frame = new JFrame();
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        return frame;
    }
}
