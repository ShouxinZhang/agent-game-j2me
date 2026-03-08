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
public final class bb {
    public az[] a;
    private short a;
    private short b;
    private short c;
    private short d;
    private boolean a;

    public final void a(az az2) {
        if (this.a == null) {
            this.a = new az[1];
        } else {
            az[] azArray = new az[this.a.length + 1];
            System.arraycopy(this.a, 0, azArray, 0, this.a.length);
            this.a = azArray;
        }
        this.a[this.a.length - 1] = az2;
    }

    public final void b(az az2) {
        if (this.a == null) {
            return;
        }
        boolean bl = false;
        for (int i = 0; this.a != null && i < this.a.length; ++i) {
            az az3 = this.a[i];
            if (bl) {
                if (i >= this.a.length - 1) continue;
                this.a[i] = this.a[i + 1];
                continue;
            }
            if (az3 != az2) continue;
            bl = true;
            if (i >= this.a.length - 1) continue;
            this.a[i] = this.a[i + 1];
        }
        if (bl) {
            if (this.a.length <= 1) {
                this.a = null;
            } else {
                az[] azArray = new az[this.a.length - 1];
                System.arraycopy(this.a, 0, azArray, 0, this.a.length - 1);
                this.a = azArray;
            }
        }
        System.gc();
        try {
            Thread.sleep(20L);
            return;
        }
        catch (InterruptedException interruptedException) {
            InterruptedException interruptedException2 = interruptedException;
            interruptedException.printStackTrace();
            return;
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        int n3;
        int n4;
        int n5;
        if (this.a == null) {
            return;
        }
        int n6 = graphics.getClipX();
        int n7 = graphics.getClipY();
        int n8 = graphics.getClipWidth();
        int n9 = graphics.getClipHeight();
        if (this.a) {
            graphics.setClip(0, n2, (int)this.c, (int)this.d);
            short s = this.a;
            n = s;
            n5 = s + this.c;
            short s2 = this.b;
            n4 = s2;
            n3 = s2 + this.d;
        } else {
            n = 0;
            n5 = n8 + 0;
            n4 = n2;
            n3 = n2 + n9;
        }
        for (int i = 0; this.a != null && i < this.a.length; ++i) {
            az az2 = this.a[i];
            if (!az2.n) continue;
            short s = az2.s;
            short s3 = az2.t;
            short s4 = az2.u;
            short s5 = az2.v;
            if (az2.s != 1 ? s + s4 < n || s - s4 > n5 || s3 + s5 < n4 || s3 - s5 > n3 : s + s4 < n || s - s4 > n5 || s3 + s4 < n4 || s3 - s5 - 64 > n3) continue;
            graphics.translate(0 - this.a, n2 - this.b);
            az2.a(graphics);
            graphics.translate(-(0 - this.a), -(n2 - this.b));
        }
        if (this.a) {
            graphics.setClip(n6, n7, n8, n9);
        }
    }

    public final void a(int n, int n2, int n3, int n4) {
        this.a = true;
        this.a = (short)n;
        this.b = (short)n2;
        this.c = (short)n3;
        this.d = (short)n4;
    }

    public final void a() {
        if (this.a == null) {
            return;
        }
        int n = this.a.length + 1;
        for (int i = n / 2; i > 0; i /= 2) {
            for (int j = i; j < n; ++j) {
                int n2 = j - i;
                while (n2 >= i) {
                    az az2 = this.a[n2 + i - 1];
                    az az3 = this.a[n2 - 1];
                    if ((az3.t < az2.t ? -1 : (az3.t > az2.t ? 1 : 0)) > 0) {
                        az3 = this.a[n2 - 1];
                        this.a[n2 - 1] = this.a[n2 + i - 1];
                        this.a[n2 + i - 1] = az3;
                        n2 -= i;
                        continue;
                    }
                    n2 = 0;
                }
            }
        }
    }
}
