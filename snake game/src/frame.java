import javax.swing.JFrame;

public class frame extends JFrame {

    frame(){
        // sets the title of the frame
        this.setTitle("snake");
        // sets the panel of the frame
        this.add(new panel());
        // makes it visible because it is defaultly not visible
        this.setVisible(true);

        this.setResizable(false);

        this.pack();
    }
}
