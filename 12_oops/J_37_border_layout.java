import java.awt.*;

public class J_37_border_layout {
    public static void main(String[] args) {
        Frame f = new Frame("Border Layout Example");

        f.setLayout(new BorderLayout());

        f.add(new Button("NORTH"), BorderLayout.NORTH);
        f.add(new Button("SOUTH"), BorderLayout.SOUTH);
        f.add(new Button("EAST"), BorderLayout.EAST);
        f.add(new Button("WEST"), BorderLayout.WEST);
        f.add(new Button("CENTER"), BorderLayout.CENTER);

        f.setSize(400, 300);
        f.setVisible(true);
    }
}
