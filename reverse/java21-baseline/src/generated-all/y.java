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
public final class y
extends az {
    public short a;
    private Image a;
    public byte a;
    public static byte b = 0;
    public static byte c = 1;
    private byte d = (byte)34;
    private byte e = (byte)42;
    private Image[] a;

    public y(Image image) {
        this.a = image;
        this.d = (byte)image.getWidth();
        this.e = (byte)image.getHeight();
        this.u = (short)(this.d / 2);
        this.v = this.e;
        if (GameMIDlet.self.cutImg) {
            byte by = (byte)image.getWidth();
            byte by2 = (byte)image.getHeight();
            this.a = new Image[2];
            this.a[0] = Image.createImage((Image)image, (int)0, (int)0, (int)(by / 2), (int)by2, (int)0);
            this.a[1] = Image.createImage((Image)image, (int)(by / 2), (int)0, (int)(by / 2), (int)by2, (int)0);
        }
    }

    public final ax a() {
        ax ax2 = new ax(((az)((Object)ax2)).s - ((y)((Object)ax2)).d / 4, ((az)((Object)ax2)).t - ((y)((Object)ax2)).e, ((y)((Object)ax2)).d / 2, ((y)((Object)ax2)).e);
        return ax2;
    }

    public final void a(Graphics graphics) {
        if (this.n) {
            if (GameMIDlet.self.cutImg) {
                graphics.drawImage(this.a[this.a], (int)this.s, (int)this.t, 33);
                return;
            }
            if (this.a != null) {
                graphics.drawRegion(this.a, this.a * this.d / 2, 0, this.d / 2, (int)this.e, 0, (int)this.s, (int)this.t, 33);
            }
        }
    }
}
