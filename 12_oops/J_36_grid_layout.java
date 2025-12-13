import java.awt.*;

/*Divides the entire window into a grid (rows × columns).
All cells are equal in size.
Components fill the grid from left → right, top → bottom */

public class J_36_grid_layout {
    public static void main(String[] args) {
        Frame f = new Frame("Grid Layout Example");

        f.setLayout(new GridLayout(2, 3)); // 2 rows, 3 columns

        f.add(new Button("1"));
        f.add(new Button("2"));
        f.add(new Button("3"));
        f.add(new Button("4"));
        f.add(new Button("5"));
        f.add(new Button("6"));

        f.setSize(300, 200);
        f.setVisible(true);
    }
}
