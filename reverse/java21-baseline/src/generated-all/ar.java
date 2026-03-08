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
final class ar
extends g {
    private an a;
    private byte u;
    private short w;
    public int f;
    public byte r = 1;

    public ar() {
        super(0, 0);
        this.a();
    }

    public final void a(Graphics graphics) {
        if (this.a != null) {
            this.a.a(graphics, (int)this.u, (int)this.w, (int)this.s, (int)this.t);
        }
    }

    public final void a(boolean bl) {
        if (this.a != null) {
            short[] sArray = this.a.a(this.u, (int)this.w, 0, 0, 0);
            short s = 0;
            short s2 = 0;
            int n = 0;
            int n2 = 0;
            if (sArray != null) {
                s = sArray[0];
                s2 = sArray[1];
                n = sArray[2];
                n2 = sArray[3];
                this.a(s, s2, n, n2);
            } else {
                n = 14;
                n2 = 14;
                this.a(-7, -14, 14, 14);
            }
            ((az)this).u = (short)n;
            ((az)this).v = (short)n2;
        }
    }

    public final int a(int n) {
        return this.a.a[n];
    }

    public final void c(int n) {
        if (this.r == 1) {
            if (n == 1) {
                this.u = 1;
                ((g)this).a = 1;
                return;
            }
            if (n == 2) {
                this.u = (byte)2;
                ((g)this).a = (byte)2;
                return;
            }
            if (n == 3) {
                this.u = (byte)3;
                ((g)this).a = (byte)3;
                return;
            }
            if (n == 0) {
                this.u = 0;
                ((g)this).a = 0;
                return;
            }
        } else if (this.r == 2) {
            if (n == 1) {
                this.u = (byte)9;
                ((g)this).a = 1;
                return;
            }
            if (n == 2) {
                this.u = (byte)10;
                ((g)this).a = (byte)2;
                return;
            }
            if (n == 3) {
                this.u = (byte)11;
                ((g)this).a = (byte)3;
                return;
            }
            if (n == 0) {
                this.u = (byte)8;
                ((g)this).a = 0;
            }
        }
    }

    public final void d(int n) {
        this.r = (byte)n;
        if (n == 1) {
            if (((g)this).a == 1) {
                this.u = 1;
                ((g)this).a = 1;
                return;
            }
            if (((g)this).a == 2) {
                this.u = (byte)2;
                ((g)this).a = (byte)2;
                return;
            }
            if (((g)this).a == 3) {
                this.u = (byte)3;
                ((g)this).a = (byte)3;
                return;
            }
            if (((g)this).a == 0) {
                this.u = 0;
                ((g)this).a = 0;
                return;
            }
        } else if (this.r == 2) {
            if (((g)this).a == 1) {
                this.u = (byte)9;
                ((g)this).a = 1;
                return;
            }
            if (((g)this).a == 2) {
                this.u = (byte)10;
                ((g)this).a = (byte)2;
                return;
            }
            if (((g)this).a == 3) {
                this.u = (byte)11;
                ((g)this).a = (byte)3;
                return;
            }
            if (((g)this).a == 0) {
                this.u = (byte)8;
                ((g)this).a = 0;
            }
        }
    }

    public final void b(int n) {
        this.c(n);
    }

    public final void e(int n) {
        ar ar2 = this;
        if (n <= (byte)ar2.a.b.length - 1) {
            this.u = (byte)n;
        }
    }

    public final void b() {
        if (this.w < this.a(this.u) - 1) {
            this.w = (short)(this.w + 1);
            return;
        }
        this.w = 0;
    }

    public final void c() {
        if (this.w < this.a(this.u) - 1) {
            this.w = (short)(this.w + 1);
        }
    }

    public final void a(int n) {
        if (n <= this.a(this.u) - 1) {
            this.w = (short)n;
            return;
        }
        System.out.println("\u52a8\u753b" + this.a.a + "\u5e27\u8d8a\u754c");
    }

    public final an a() {
        return this.a;
    }

    public final void a(an an2) {
        this.a = an2;
    }

    public final byte a() {
        return this.u;
    }

    public final short a() {
        return this.w;
    }

    public final void m() {
        if (this.w < this.a(this.u) - 1) {
            this.c();
            return;
        }
        if (this.f <= 1) {
            this.m = false;
            ba.a.d(2);
            return;
        }
        --this.f;
        this.w = 0;
    }
}
