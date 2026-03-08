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
public final class be
extends az {
    private byte a;
    private byte b;
    private byte[][] a;
    private byte c;
    private byte d;
    private av[] a;
    private au[] a;
    public Image[] a;
    private boolean a;
    public short[] a;
    private byte e;
    private short a;
    private int a = 0;
    private int b;
    private short[] b;
    private short[] c;

    public be(av[] object, au[] auArray, int n, int n2, int n3, int n4, int n5) {
        this.c = (byte)n;
        this.d = (byte)n2;
        this.u = (short)(n * n3);
        this.v = (short)(n2 * n4);
        this.a = object;
        this.a = auArray;
        this.a = (byte)n3;
        this.b = (byte)n4;
        this.a = (short)n5;
        object = this;
        if (object.a * 3 < object.c * object.d) {
            object.a = new byte[object.a][3];
            object.e = 1;
            System.out.println("QUEUE\u6570\u7ec4\uff0c\u4f7f\u7528" + object.a + "*" + 3 + "=" + object.a * 3);
        } else {
            object.a = new byte[object.c][object.d];
            object.e = 0;
            System.out.println("MATRIX\u6570\u7ec4\uff0c\u4f7f\u7528" + object.c + "*" + object.d + "=" + object.c * object.d);
        }
        this.a = false;
        this.a = 0;
    }

    public final void a() {
        if (this.a == null) {
            System.gc();
            try {
                Thread.sleep(400L);
            }
            catch (InterruptedException interruptedException) {
                InterruptedException interruptedException2 = interruptedException;
                interruptedException.printStackTrace();
            }
            try {
                this.a = new Image[this.a.length];
                this.a = new short[this.a[this.a.length - 1].a];
                for (int i = 0; this.a != null && i < this.a.length; ++i) {
                    short s = this.a[i].b;
                    short s2 = this.a[i].c;
                    short s3 = this.a[i].d;
                    short s4 = this.a[i].e;
                    byte by = this.a[i].b;
                    byte by2 = this.a[i].c;
                    by = w.a(by, (int)by2);
                    au au2 = this.a(this.a[i].a);
                    this.a[i] = Image.createImage((Image)au2.a, (int)s, (int)s2, (int)s3, (int)s4, (int)by);
                    this.a[this.a[i].a - 1] = (short)i;
                }
            }
            catch (Exception exception) {
                System.out.println(exception.getMessage());
                return;
            }
        }
        this.a = true;
        this.a = null;
        System.gc();
    }

    private short a(int n) {
        if (n <= 0) {
            return -1;
        }
        return this.a[n - 1];
    }

    public final void a(byte by, byte by2, short s) {
        if (this.e == 0) {
            this.a[by][by2] = (byte)s;
            return;
        }
        if (this.e == 1) {
            this.a[this.a][0] = by;
            this.a[this.a][1] = by2;
            this.a[this.a][2] = (byte)s;
            ++this.a;
        }
    }

    public final void a(Graphics graphics) {
        if (!this.n) {
            return;
        }
        this.b = 0;
        short s = (short)graphics.getClipX();
        short s2 = (short)graphics.getClipY();
        short s3 = (short)graphics.getClipWidth();
        short s4 = (short)graphics.getClipHeight();
        short s5 = 0;
        short s6 = 0;
        short s7 = this.c;
        short s8 = this.d;
        if (this.s < s) {
            s5 = (short)((s - this.s) / this.a);
        }
        if (this.t < s2) {
            s6 = (short)((s2 - this.t) / this.b);
        }
        if (this.s + this.u > s + s3) {
            s7 = (short)((s + s3 - this.s) / this.a + 1);
        }
        if (this.t + this.v > s2 + s4) {
            s8 = (short)((s2 + s4 - this.t) / this.b + 1);
        }
        System.currentTimeMillis();
        if (this.e == 0) {
            for (short s9 = 0; s9 < this.c; s9 = (short)(s9 + 1)) {
                for (short s10 = 0; s10 < this.d; s10 = (short)(s10 + 1)) {
                    byte by = this.a[s9][s10];
                    this.a(graphics, s, s2, s3, s4, s5, s7, s6, s8, s9, s10, by);
                }
            }
        } else if (this.e == 1) {
            for (int i = 0; this.a != null && i < this.a.length; ++i) {
                byte by = this.a[i][0];
                byte by2 = this.a[i][1];
                byte by3 = this.a[i][2];
                this.a(graphics, s, s2, s3, s4, s5, s7, s6, s8, by, by2, by3);
            }
        }
        System.currentTimeMillis();
    }

    private void a(Graphics graphics, short s, short s2, short s3, short s4, short s5, short s6, short s7, short s8, short s9, short s10, short s11) {
        block5: {
            short s12;
            block6: {
                block9: {
                    block10: {
                        block7: {
                            block8: {
                                if (s11 == 0) {
                                    return;
                                }
                                s12 = 0;
                                s12 = s11 < 0 ? (short)(s11 & 0xFF) : s11;
                                if (s12 == 0) break block5;
                                if (!this.a) break block6;
                                av av2 = this.a(s12);
                                short s13 = av2.d;
                                short s14 = av2.e;
                                if (s13 <= this.a && s14 <= this.b) break block7;
                                short s15 = (short)(this.s + s9 * this.a);
                                short s16 = (short)(this.t + s10 * this.b);
                                short s17 = av2.d;
                                short s18 = av2.e;
                                if (!w.a(s15, (int)s16, (int)s17, (int)s18, s, (int)s2, (int)s3, (int)s4)) break block5;
                                s5 = this.a(s12);
                                if (s5 < 0) break block8;
                                if (this.a == null) break block5;
                                graphics.drawImage(this.a[s5], s9 * this.a, s10 * this.b, 20);
                                ++this.b;
                                break block9;
                            }
                            System.out.println("\u56fe\u5757" + s12 + "\u672a\u627e\u5230");
                            break block5;
                        }
                        if (s9 < s5 || s9 >= s6 || s10 < s7 || s10 >= s8) break block9;
                        short s19 = this.a(s12);
                        if (s19 < 0) break block10;
                        if (this.a == null) break block9;
                        graphics.drawImage(this.a[s19], s9 * this.a, s10 * this.b, 20);
                        ++this.b;
                        break block5;
                    }
                    System.out.println("\u56fe\u5757" + s12 + "\u672a\u627e\u5230");
                }
                return;
            }
            av av3 = this.a(s12);
            short s20 = av3.b;
            short s21 = av3.c;
            short s22 = av3.d;
            short s23 = av3.e;
            byte by = av3.b;
            byte by2 = av3.c;
            if (s22 > this.a || s23 > this.b) {
                s5 = (short)(this.s + s9 * this.a);
                s6 = (short)(this.t + s10 * this.b);
                s7 = s22;
                s8 = s23;
                if (w.a(s5, (int)s6, (int)s7, (int)s8, s, (int)s2, (int)s3, (int)s4)) {
                    s = w.a(by, (int)by2);
                    au au2 = this.a(av3.a);
                    if (au2 != null && au2.a != null) {
                        graphics.drawRegion(au2.a, (int)s20, (int)s21, (int)s22, (int)s23, (int)s, (int)s5, (int)s6, 20);
                        ++this.b;
                    }
                }
                return;
            }
            if (s9 >= s5 && s9 < s6 && s10 >= s7 && s10 < s8) {
                s5 = w.a(by, (int)by2);
                au au3 = this.a(av3.a);
                graphics.drawRegion(au3.a, (int)s20, (int)s21, (int)s22, (int)s23, (int)s5, s9 * this.a, s10 * this.b, 20);
                ++this.b;
            }
        }
    }

    private av a(int n) {
        if (n <= 0) {
            return null;
        }
        if (this.b == null) {
            this.b = new short[this.a[this.a.length - 1].a];
            for (int i = 0; this.a != null && i < this.a.length; ++i) {
                this.b[this.a[i].a - 1] = (short)i;
            }
            return this.a[this.b[n - 1]];
        }
        return this.a[this.b[n - 1]];
    }

    private au a(int n) {
        if (n <= 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new short[this.a[this.a.length - 1].a];
            for (int i = 0; this.a != null && i < this.a.length; ++i) {
                this.c[this.a[i].a - 1] = (short)i;
            }
            return this.a[this.c[n - 1]];
        }
        return this.a[this.c[n - 1]];
    }

    public final ax a() {
        return null;
    }
}
