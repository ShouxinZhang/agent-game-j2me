/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ba
extends at
implements Runnable {
    private Display a;
    private Graphics a;
    private short c;
    short a;
    short b;
    private boolean b;
    public boolean a;
    public byte a;
    private Thread a;
    public static ba a;
    public static byte b;
    aj a;
    d a;
    static t a;
    private boolean c;
    private boolean d;
    private long b;
    private long c;
    private long d;
    long a = null;

    public final void a(Displayable displayable) {
        this.a.setCurrent(displayable);
    }

    public ba(Display object) {
        this.a = object;
        this.setFullScreenMode(true);
        object = this;
        this.a = object.a.getGraphics();
        this.a.setFont(w.a);
        this.c = (short)33;
        this.a = (short)super.getWidth();
        this.b = (short)super.getHeight();
        this.b = false;
        this.a = false;
        a = this;
    }

    public final void a() {
        this.b = true;
        if (this.a == null && !this.c) {
            this.a = new Thread(this);
            this.a.start();
            this.c = true;
        }
        this.a.setCurrent((Displayable)this);
    }

    public final void b() {
        this.b = false;
    }

    protected final void hideNotify() {
        System.out.println("hideNotify()");
        this.a = true;
        if (a != null && ba.a.a != null) {
            ba.a.a.b();
        }
    }

    protected final void showNotify() {
        System.out.println("showNotify()");
        this.a = false;
        if (a != null && ba.a.a != null) {
            ba.a.a.a();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected final void keyPressed(int n) {
        if (this.d) return;
        this.d = true;
        switch (b) {
            case 1: {
                if (this.a == null) break;
                Object object = this.a;
                aj aj2 = object;
                synchronized (object) {
                    if (!((aj)object).a) {
                        ((aj)object).a = true;
                        GameMIDlet.self.showCover();
                    }
                    // ** MonitorExit[var3_6] (shouldn't be in output)
                    break;
                }
            }
            case 3: {
                if (this.a == null) break;
                this.a.a(n);
                break;
            }
            case 4: {
                Object object = this;
                synchronized (object) {
                    if (a != null) {
                        a.b(n);
                    }
                    break;
                }
            }
        }
        {
            int n2 = af.a(n);
            if (GameMIDlet.self.alowDebug) {
                if (n2 == 51) {
                    a.d();
                } else if (n2 == 49) {
                    GameMIDlet.self.debug = !GameMIDlet.self.debug;
                } else if (n2 == 55) {
                    if (s.a > 1) {
                        s.a = (byte)(s.a - 1);
                    }
                } else if (n2 == 57) {
                    s.a = (byte)(s.a + 1);
                } else if (n2 == 48) {
                    GameMIDlet.self.showFPS = !GameMIDlet.self.showFPS;
                }
            }
            this.d = false;
            return;
        }
    }

    protected final void keyReleased(int n) {
        switch (b) {
            case 3: {
                if (this.a == null) break;
                this.a.b(n);
                return;
            }
            case 4: {
                if (a == null) break;
                a.c(n);
            }
        }
    }

    public final void pointerPressed(int n, int n2) {
        switch (b) {
            case 3: {
                if (this.a == null) break;
                this.a.b();
                return;
            }
            case 4: {
                if (a == null) break;
                a.a(n, n2);
            }
        }
    }

    public final void pointerReleased(int n, int n2) {
    }

    public final void pointerDragged(int n, int n2) {
        switch (b) {
            case 4: {
                if (a == null) break;
                a.b(n, n2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void run() {
        while (this.b) {
            Object object;
            if (!this.a) {
                this.b = System.currentTimeMillis();
                switch (b) {
                    case 1: {
                        if (this.a == null) break;
                        Graphics graphics = this.a;
                        object = this.a;
                        graphics.setColor(0xFFFFFF);
                        graphics.setClip(0, 0, (int)ba.a.a, (int)ba.a.b);
                        graphics.fillRect(0, 0, (int)ba.a.a, (int)ba.a.b);
                        graphics.setClip(0, 0, (int)s.a, (int)s.b);
                        if (((aj)object).a) break;
                        if (!((aj)object).a[((aj)object).a]) {
                            if (((aj)object).a[((aj)object).a].toLowerCase().endsWith(".ani")) {
                                ((aj)object).a = new an(((aj)object).a[((aj)object).a]);
                                ((aj)object).a.b("/sys/");
                                ((aj)object).a = new ar();
                                ((aj)object).a.a(((aj)object).a);
                                ((aj)object).a.a(s.a / 2, s.b / 2);
                            } else if (((aj)object).a[((aj)object).a].toLowerCase().endsWith(".ps")) {
                                ((aj)object).a = w.a(((aj)object).a[((aj)object).a]);
                                ((aj)object).a = System.currentTimeMillis();
                            }
                            ((aj)object).a[((aj)object).a] = true;
                        }
                        if (((aj)object).a[((aj)object).a].toLowerCase().endsWith(".ps") || ((aj)object).a[((aj)object).a].toLowerCase().endsWith(".png")) {
                            if (((aj)object).a != null) {
                                graphics.drawImage(((aj)object).a, s.a / 2, s.b / 2, 3);
                            }
                            if (!((aj)object).b) {
                                ((aj)object).a = System.currentTimeMillis();
                                ((aj)object).b = true;
                                break;
                            }
                            if (System.currentTimeMillis() - ((aj)object).a <= (long)((aj)object).a[((aj)object).a]) break;
                            if (((aj)object).a < ((aj)object).a.length - 1) {
                                ((aj)object).a = (byte)(((aj)object).a + 1);
                                ((aj)object).b = false;
                                break;
                            }
                            ((aj)object).a = true;
                            GameMIDlet.self.showCover();
                            break;
                        }
                        if (!((aj)object).a[((aj)object).a].toLowerCase().endsWith(".ani") || ((aj)object).a == null) break;
                        graphics.setColor(0);
                        graphics.setClip(0, 0, (int)ba.a.a, (int)ba.a.b);
                        graphics.fillRect(0, 0, (int)ba.a.a, (int)ba.a.b);
                        ((aj)object).a.a(graphics);
                        if (((aj)object).a.a() < ((aj)object).a.a(0) - 1) {
                            if (ba.a.a % 3 != 0) break;
                            ((aj)object).a.b();
                            break;
                        }
                        if (!((aj)object).b) {
                            ((aj)object).a = System.currentTimeMillis();
                            ((aj)object).b = true;
                            break;
                        }
                        if (System.currentTimeMillis() - ((aj)object).a <= (long)((aj)object).a[((aj)object).a]) break;
                        if (((aj)object).a < ((aj)object).a.length - 1) {
                            ((aj)object).a = (byte)(((aj)object).a + 1);
                            ((aj)object).b = false;
                            break;
                        }
                        ((aj)object).a = true;
                        GameMIDlet.self.showCover();
                        break;
                    }
                    case 3: {
                        System.gc();
                        try {
                            Thread.sleep(20L);
                        }
                        catch (Exception exception) {
                            object = exception;
                            exception.printStackTrace();
                        }
                        try {
                            if (this.a == null) break;
                            this.a.a(this.a);
                        }
                        catch (Exception exception) {
                            object = exception;
                            exception.printStackTrace();
                        }
                        break;
                    }
                    case 4: {
                        object = this;
                        synchronized (object) {
                            if (a != null) {
                                a.a(this.a);
                            }
                            break;
                        }
                    }
                }
                this.a(0, 0, ba.a.a, ba.a.b);
                this.a = (byte)(this.a + 1);
                if (this.a >= 127) {
                    this.a = 0;
                }
                this.c = System.currentTimeMillis();
                if (this.c - this.b < (long)this.c) {
                    try {
                        Thread.sleep((long)this.c - (this.c - this.b));
                    }
                    catch (InterruptedException interruptedException) {
                        object = interruptedException;
                        interruptedException.printStackTrace();
                    }
                }
                this.d = System.currentTimeMillis();
                if (this.d <= this.b) continue;
                this.a = 1000L / (this.d - this.b);
                continue;
            }
            try {
                Thread.sleep(2000L);
            }
            catch (InterruptedException interruptedException) {
                object = interruptedException;
                interruptedException.printStackTrace();
            }
        }
        this.c = false;
        if (GameMIDlet.self.debug) {
            System.out.println("\u7ebf\u7a0b\u7ed3\u675f");
        }
    }
}
