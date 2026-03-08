/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class at
extends Canvas {
    protected int a;
    protected int b;
    public Image a;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean a;
    private int g;
    private int h;

    protected at() {
        this.setFullScreenMode(true);
        if (s.e) {
            GameMIDlet.self.touchScreen = this.hasPointerEvents();
        }
        this.g = super.getWidth();
        this.h = super.getHeight();
        if (this.g <= 128) {
            this.g = 128;
            if (this.h < 149) {
                this.h = 149;
            } else if (this.h < 160) {
                this.h = 160;
            }
        } else if (this.g > 128 && this.g <= 176) {
            this.g = 176;
            if (this.h < 208) {
                this.h = 208;
            }
        } else if (this.g > 176 && this.g == 240 && this.h < 320) {
            this.h = 320;
        }
        if (s.a == 0) {
            s.a = (short)this.g;
        }
        if (s.b == 0) {
            s.b = (short)this.h;
        }
        this.a = Image.createImage((int)this.g, (int)this.h);
    }

    public int getWidth() {
        return this.g;
    }

    public int getHeight() {
        return this.h;
    }

    protected void sizeChanged(int n, int n2) {
    }

    private int a() {
        int n = this.a;
        this.a &= ~this.b;
        this.b = 0;
        return n;
    }

    public void paint(Graphics graphics) {
        if (this.a) {
            graphics.clipRect(this.c, this.d, this.e, this.f);
            this.a = false;
        }
        graphics.drawImage(this.a, 0, 0, 20);
    }

    public final void a(int n, int n2, int n3, int n4) {
        this.a = true;
        this.c = 0;
        this.d = 0;
        this.e = n3;
        this.f = n4;
        this.repaint();
        this.serviceRepaints();
    }

    protected void keyPressed(int n) {
        if ((n = af.a(n)) != 0) {
            n = 1 << n;
            this.a |= n;
            this.b &= ~n;
            this.a();
        }
    }

    public void setFullScreenMode(boolean bl) {
        super.setFullScreenMode(bl);
    }

    protected void keyReleased(int n) {
        if ((n = af.a(n)) != 0) {
            this.b |= 1 << n;
            this.a();
        }
    }
}
