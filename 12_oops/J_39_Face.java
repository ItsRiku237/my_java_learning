import java.awt.*;
import java.applet.*;
public class J_39_Face extends Applet{
	// public void paint(Graphics g){
	// 	g.drawOval(40,40,120,150);
	// 	g.drawOval(57,75,30,20);
	// 	g.drawOval(110,75,30,20);
	// 	g.fillOval(68,81,10,10);
	// 	g.fillOval(68,81,10,10);
	// 	g.drawOval(10,100,80,10);
	// 	g.fillArc(20,110,80,50,10,10);
	// 	g.drawOval(100,10,230,140);
	// 	g.drawOval(100,140,230,10);
	// }
	public void paint(Graphics g) {

        // Face outline
        g.drawOval(40, 40, 120, 150);

        // Eyes
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20);

        g.fillOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);

        // Nose
        g.drawLine(100, 95, 100, 120);

        // Mouth (Smile)
        g.drawArc(70, 120, 60, 30, 180, 180);
    }
}
/*
<html>
<applet code = face.class
width =300
height = 200>
</applet>
</html>
*/