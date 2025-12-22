import java.awt.*;
import java.applet.*;

public class J_38_LineReact extends Applet {
	public void paint(Graphics g) {

        g.drawLine(10, 10, 500, 50);

        g.drawRect(10, 60, 40, 30);
        g.fillRect(60, 10, 30, 80);

        g.drawRoundRect(10, 100, 80, 50, 10, 10);
        g.fillRoundRect(20, 110, 80, 50, 10, 10);

        g.drawLine(100, 10, 230, 140);
        g.drawLine(100, 140, 230, 10);
    }
}

// <html>
// <body>
// <applet code="J_37_LineReact.class" width="300" height="200">
// </applet>
// </body>
// </html>
