package javax.microedition.lcdui;

import javax.microedition.midlet.MIDlet;

public final class Display {
    private Displayable current;

    public static Display getDisplay(MIDlet midlet) {
        return new Display();
    }

    public void setCurrent(Displayable displayable) {
        current = displayable;
    }

    public Displayable getCurrent() {
        return current;
    }
}
