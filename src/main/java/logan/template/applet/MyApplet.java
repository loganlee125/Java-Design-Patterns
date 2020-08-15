package logan.template.applet;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {

    private static final long serialVersionUID = 7588074746273953380L;

    private String message;

    @Override
    public void init() {
        message = "Hello World, I'm alive!";
        repaint();
    }

    @Override
    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    @Override
    public void stop() {
        message = "Oh, now I'm being stopped...";
        repaint();
    }

    @Override
    public void destroy() {
        message = "Goodbye, cruel world";
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}

