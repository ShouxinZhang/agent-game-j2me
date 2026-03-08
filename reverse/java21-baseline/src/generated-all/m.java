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
public final class m {
    private short e;
    private short f;
    public short a;
    public short b;
    public Image a;
    private Graphics a;
    public az[] a;
    public short c;
    public short d;

    public m(int n, int n2) {
        this.a = (short)n;
        this.b = (short)n2;
    }

    public final void a(int n, int n2) {
        this.e = (short)n;
        this.f = (short)n2;
    }

    public final int a() {
        return this.e;
    }

    public final int b() {
        return this.f;
    }

    public final void a() {
        if (this.a == null) {
            this.a = Image.createImage((int)this.a, (int)this.b);
            this.a = null;
            this.a = this.a.getGraphics();
        }
        if (GameMIDlet.self.debug) {
            System.out.println("\u91cd\u7ed8");
        }
        this.a.setClip(0, 0, (int)this.a, (int)this.b);
        this.a.setColor(0);
        this.a.fillRect(0, 0, (int)this.a, (int)this.b);
        for (int i = 0; this.a != null && i < this.a.length; ++i) {
            this.a.translate(this.a[i].s - this.e, this.a[i].t - this.f);
            this.a[i].a(this.a);
            this.a.translate(-(this.a[i].s - this.e), -(this.a[i].t - this.f));
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.a != null) {
            graphics.translate((int)(-this.c), (int)(-this.d));
            graphics.drawImage(this.a, (int)this.e, this.f + n2, 20);
            graphics.translate((int)this.c, (int)this.d);
        }
    }
}
