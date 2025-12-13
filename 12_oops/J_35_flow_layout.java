import java.awt.*;

public class J_35_flow_layout {
     public static void main(String[] args) {
        Frame f = new Frame("Flow Layout Example");

        f.setLayout(new FlowLayout());   // Setting FlowLayout

        f.add(new Button("Button 1"));
        f.add(new Button("Button 2"));
        f.add(new Button("Button 3"));
        f.add(new Button("Button 4"));
        f.add(new Button("Button 5"));

        f.setSize(300, 200);
        f.setVisible(true);
    }
}
