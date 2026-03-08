/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bd {
    private short b;
    private short c;
    private Image a;
    public short a;
    private short d;
    public an a;
    private byte a;
    private boolean a;

    public bd(Image image, int n, int n2) {
        if (image == null) {
            return;
        }
        this.a = image;
        this.b = (short)n;
        this.c = (short)n2;
        this.a = (short)(this.a.getWidth() / n);
        this.a = false;
    }

    public bd(an object) {
        if (object == null) {
            return;
        }
        this.a = object;
        this.a = 0;
        this.d = 0;
        short[] sArray = ((an)object).a(this.a, (int)((byte)this.d), 0, 0, 0);
        object = sArray;
        if (sArray != null) {
            this.b = (short)object[2];
            this.c = (short)object[3];
        }
        this.a = this.a(this.a);
        this.a = true;
    }

    private short a(int n) {
        return this.a.a[n];
    }

    public final void a(int n) {
        if (this.a != null && n <= this.a.b.length - 1) {
            this.a = (byte)n;
            this.a = this.a(this.a);
        }
    }

    public final void b(int n) {
        if (n >= 0 && n < this.a) {
            short[] sArray;
            this.d = (short)n;
            if (this.a && (sArray = this.a.a(this.a, (int)((byte)this.d), 0, 0, 0)) != null) {
                this.b = sArray[2];
                this.c = sArray[3];
            }
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        int n3 = 33;
        bd bd2 = this;
        if (bd2.a) {
            if (bd2.a != null) {
                bd2.a.a(graphics, (int)bd2.a, (int)bd2.d, n, n2);
                return;
            }
        } else if (bd2.a != null) {
            graphics.drawRegion(bd2.a, bd2.d * bd2.b, 0, (int)bd2.b, (int)bd2.c, 0, n, n2, 33);
        }
    }
}
