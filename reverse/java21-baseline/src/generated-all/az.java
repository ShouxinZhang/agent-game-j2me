/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class az {
    public short s;
    public short t;
    public short u;
    public short v;
    public boolean n = true;
    public byte s;
    public byte t;

    public final void a(int n, int n2) {
        this.s = (short)n;
        this.t = (short)n2;
    }

    public final void b(int n, int n2) {
        this.s = (short)(this.s + n);
        this.t = (short)(this.t + n2);
    }

    public abstract void a(Graphics var1);

    public abstract ax a();
}
