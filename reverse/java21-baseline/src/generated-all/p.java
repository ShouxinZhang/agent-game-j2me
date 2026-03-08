/*
 * Decompiled with CFR 0.152.
 */
import java.util.TimerTask;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class p
extends TimerTask {
    int[] a;
    byte a;
    private byte b;
    private short a;
    private final al a;

    p(al al2) {
        this.a = al2;
        this.a = 1;
    }

    public final void run() {
        this.a[11] = this.a;
        this.a = (short)(1 - this.a);
        this.b = (byte)(this.b + 1);
        if (this.b > 10) {
            this.cancel();
            this.a[11] = 0;
            al.a((al)this.a)[this.a] = null;
            this.a.e = false;
        }
    }
}
