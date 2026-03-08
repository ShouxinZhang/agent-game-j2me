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
public final class ak
extends az {
    private Image a;
    public short a;
    private byte c;
    public byte a;
    public short b;
    public byte[] a;
    public byte[] b;
    public byte b;
    private Image[] a;

    public ak(Image image, int n, int n2) {
        this.a = image;
        this.u = (short)16;
        this.v = (short)16;
        if (GameMIDlet.self.cutImg) {
            n = (byte)image.getWidth();
            n2 = (byte)image.getHeight();
            this.a = new Image[2];
            this.a[0] = Image.createImage((Image)image, (int)0, (int)0, (int)(n / 2), (int)n2, (int)0);
            this.a[1] = Image.createImage((Image)image, (int)(n / 2), (int)0, (int)(n / 2), (int)n2, (int)0);
        }
    }

    public ak(int n, int n2) {
        this.u = (short)16;
        this.v = (short)16;
    }

    public final void a() {
        this.c = 0;
    }

    public final ax a() {
        ax ax2 = new ax(((az)((Object)ax2)).s - ((az)((Object)ax2)).u / 2, ((az)((Object)ax2)).t - ((az)((Object)ax2)).v, ((az)((Object)ax2)).u, ((az)((Object)ax2)).v);
        return ax2;
    }

    public final void a(Graphics graphics) {
        if (this.n) {
            if (GameMIDlet.self.cutImg) {
                graphics.drawImage(this.a[this.a], (int)this.s, (int)this.t, 33);
                return;
            }
            graphics.drawRegion(this.a, this.a * this.u, 0 * this.v, (int)this.u, (int)this.v, 0, (int)this.s, (int)this.t, 33);
        }
    }
}
