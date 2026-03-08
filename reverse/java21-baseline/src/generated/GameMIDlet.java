/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aj
 *  ba
 *  d
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.midlet.MIDlet
 *  s
 */
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public final class GameMIDlet
extends MIDlet {
    public static Display disp;
    private ba a;
    public boolean showFPS;
    public byte volumn;
    public boolean debug;
    public static GameMIDlet self;
    public boolean collisionBetweenRoles = true;
    public boolean cutMapImg;
    public boolean cutSpLibImg;
    public boolean useBackLayerCache;
    public boolean cacheFullScene;
    public boolean useEnemyFlash;
    public boolean unloadBeforeBattle;
    public boolean cutImg;
    public boolean clearBackLayerCache;
    public boolean moreSleep;
    public boolean alowDebug;
    public boolean useAreaCopy;
    public boolean touchScreen;
    public boolean allowMusic;
    public boolean loadImgBeforeUse;
    public boolean playMusic;
    public boolean notUseMusicClose;
    public String phonemodel = " ";
    public boolean useStart;
    public byte imgType;
    public String mobileType = "";

    public GameMIDlet() {
        self = this;
        this.showFPS = false;
        this.debug = false;
        this.cutMapImg = true;
        this.cutSpLibImg = false;
        this.cutImg = false;
        this.useBackLayerCache = true;
        this.cacheFullScene = false;
        this.useEnemyFlash = true;
        this.unloadBeforeBattle = false;
        this.clearBackLayerCache = true;
        this.moreSleep = false;
        this.alowDebug = false;
        this.useAreaCopy = true;
        this.playMusic = true;
        this.loadImgBeforeUse = true;
        this.useStart = true;
        this.imgType = 0;
        s.d();
        disp = Display.getDisplay((MIDlet)this);
        this.volumn = (byte)80;
        s.c();
        GameMIDlet gameMIDlet = this;
        this.a = new ba(disp);
        gameMIDlet.a.a();
        this.showLogo();
    }

    protected final void startApp() {
        System.out.println("startApp()");
        if (this.a != null) {
            this.a.a = false;
            this.a.a = 0;
            this.a.b = 0;
            disp.setCurrent((Displayable)this.a);
            if (ba.a != null && ba.a.a != null) {
                ba.a.a.a();
            }
        }
    }

    protected final void pauseApp() {
        System.out.println("pauseApp()");
        if (this.a != null) {
            this.a.a = true;
            if (ba.a != null && ba.a.a != null) {
                ba.a.a.b();
            }
        }
    }

    protected final void destroyApp(boolean bl) {
        this.stopThread();
        ba.a = null;
        this.a = null;
        this.notifyDestroyed();
    }

    public final void stopThread() {
        if (object.a != null) {
            object.a.b();
            try {
                Thread.sleep(2000L);
                return;
            }
            catch (InterruptedException interruptedException) {
                Object object = interruptedException;
                interruptedException.printStackTrace();
            }
        }
    }

    public final void showLogo() {
        this.a.a = new aj();
        ba.b = 1;
    }

    public final void showCover() {
        ba.b = 0;
        object.a.a = null;
        ba.a = null;
        object.a.a = null;
        System.gc();
        try {
            Thread.sleep(300L);
        }
        catch (InterruptedException interruptedException) {
            Object object = interruptedException;
            interruptedException.printStackTrace();
        }
        if (ba.a.a == null) {
            ba.a.a = new d();
            ba.a.a.a();
        }
        ba.b = (byte)3;
    }
}
