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
public final class j
extends az {
    public short a;
    private Image a;
    public byte a;

    public j(Image image) {
        this.a = image;
    }

    public final ax a() {
        ax ax2 = null;
        ax2 = this.a == 2 ? new ax(this.s - 8, this.t - 16, 16, 16) : new ax(this.s - 8, this.t - 32, 16, 32);
        return ax2;
    }

    public final void a(Graphics graphics) {
        if (this.n && this.a != null) {
            graphics.drawImage(this.a, (int)this.s, (int)this.t, 33);
        }
    }
}
