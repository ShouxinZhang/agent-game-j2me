/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Random;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bf
extends az {
    private byte a;
    private byte b;
    private byte c = (byte)-3;
    private byte d = (byte)6;
    private static Random a;

    public bf() {
        this.s = (byte)6;
        if (a == null) {
            a = new Random();
        }
        this.s = (short)(Math.abs(a.nextInt()) % (ba.a.a + ba.a.a));
        this.t = (short)(-Math.abs(a.nextInt() % 50));
        this.a = (byte)-5;
        this.b = (byte)10;
    }

    public final ax a() {
        return null;
    }

    public final void a(Graphics graphics) {
        if (this.n) {
            graphics.setColor(0xFFFFFF);
            graphics.drawLine((int)this.s, (int)this.t, this.s + this.c, this.t + this.d);
            if (this.s < -50 || this.s > s.a + 150 || this.t > s.b + 200) {
                this.s = (short)(Math.abs(a.nextInt()) % (ba.a.a + ba.a.a));
                this.t = (short)(-Math.abs(a.nextInt() % 50));
            }
            this.s = (short)(this.s + this.a);
            this.t = (short)(this.t + this.b);
        }
    }
}
