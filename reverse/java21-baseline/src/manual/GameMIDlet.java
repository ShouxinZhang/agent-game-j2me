import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public final class GameMIDlet extends MIDlet {
    public static GameMIDlet self;
    public static Display disp;

    public static boolean allowMusic = true;
    public static boolean alowDebug = false;
    public static boolean cacheFullScene = false;
    public static boolean clearBackLayerCache = false;
    public static boolean collisionBetweenRoles = false;
    public static boolean cutImg = false;
    public static boolean cutMapImg = false;
    public static boolean cutSpLibImg = false;
    public static boolean debug = false;
    public static int imgType = 0;
    public static boolean loadImgBeforeUse = true;
    public static int mobileType = 0;
    public static int moreSleep = 0;
    public static boolean notUseMusicClose = false;
    public static int phonemodel = 0;
    public static boolean playMusic = true;
    public static boolean showCover = true;
    public static boolean showFPS = false;
    public static boolean showLogo = true;
    public static boolean stopThread = false;
    public static boolean touchScreen = false;
    public static boolean unloadBeforeBattle = false;
    public static boolean useAreaCopy = false;
    public static boolean useBackLayerCache = false;
    public static boolean useEnemyFlash = true;
    public static boolean useStart = true;
    public static int volumn = 100;

    private final aj mainScreen;
    private final ba splashScreen;

    public GameMIDlet() {
        self = this;
        disp = Display.getDisplay(this);
        mainScreen = new aj();
        splashScreen = new ba();
    }

    public void startApp() throws MIDletStateChangeException {
        setCurrent(splashScreen);
    }

    public void pauseApp() {
        pauseAppFlag();
    }

    public void destroyApp(boolean unconditional) throws MIDletStateChangeException {
        stopThread = true;
        notifyDestroyed();
    }

    public void setCurrent(Displayable displayable) {
        if (disp == null) {
            disp = Display.getDisplay(this);
        }
        disp.setCurrent(displayable);
    }

    private void pauseAppFlag() {
        // First-stage reverse baseline: retain the lifecycle shape only.
    }
}
