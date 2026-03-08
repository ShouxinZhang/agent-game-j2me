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
public final class aq {
    public boolean a;
    public String[] a;
    public byte a;
    private String a;
    public boolean b;
    public String[] b;
    public byte b;
    public byte c;
    public static byte d = 0;
    public static byte e = 1;
    private short a;
    private short b;
    private short c;
    private byte f;
    private short d;
    private short e;
    private String[] c;
    private byte g;
    private byte h;
    private byte i;
    private boolean c;
    private boolean d;
    private boolean e;
    private Image a;
    private Image b;
    private Image c;
    private Image d;
    private Image e;
    private Image f;
    private Image g;
    private Image h;
    private byte j;
    private byte k;
    private Image i;
    public g a;
    private byte l = (byte)18;
    private boolean f;

    public aq() {
        int n = 3;
        aq aq2 = this;
        this.l = (byte)w.a.getHeight();
        if (aq2.l < 18) {
            aq2.l = (byte)18;
        }
        aq2.f = (byte)3;
        aq2.b = (short)(3 * aq2.l + 10);
        this.d = (short)56;
        this.a = w.a("/sys/arrow.ps");
        this.i = w.a("/sys/cloudCursor.ps");
    }

    public final void a() {
        this.a = false;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        ba.a.d(3);
        System.gc();
    }

    public final void b() {
        this.i = (byte)(this.i - this.f);
        if (this.i < 0) {
            this.i = 0;
        }
    }

    public final void c() {
        if (this.j < this.i + this.h - 1 && this.j < this.c.length - 1 || this.k < this.c[this.j].length() - 1) {
            this.j = (byte)(this.i + this.h - 1);
            if (this.j > this.c.length - 1) {
                this.j = (byte)(this.c.length - 1);
            }
            this.k = (byte)(this.c[this.j].length() - 1);
            return;
        }
        if (this.i + this.h - 1 < this.g) {
            this.i = (byte)(this.i + this.f);
        }
        if (this.i > this.g) {
            this.i = this.g;
        }
    }

    public final boolean a() {
        return this.i + this.h - 1 >= this.g && this.k >= this.c[this.j].length() - 1;
    }

    public final void d() {
        this.e = 0;
        this.a = s.a;
        this.c = (short)(s.a - this.d);
    }

    public final void e() {
        String string = null;
        if (this.a >= 0 && this.a != null && this.a < this.a.length) {
            string = this.a[this.a];
        }
        this.a = null;
        this.b = null;
        int n = string.indexOf(".");
        if (n != -1) {
            byte by = Byte.parseByte(string.substring(0, n));
            string = string.substring(n + 1);
            String string2 = s.c[by - 1];
            this.a = s.b[by - 1];
            if (string2 != null && !string2.equals("")) {
                this.b = w.a(string2);
                this.d = (short)(this.b.getWidth() > w.a.stringWidth("\u9648\u9274\u4e4b") ? this.b.getWidth() : w.a.stringWidth("\u9648\u9274\u4e4b") + 3);
            } else {
                this.d = (short)5;
                string = this.a + "\uff1a" + string;
            }
        } else {
            this.d = (short)5;
        }
        this.d();
        if (string != null) {
            this.c = w.a(string, this.c - 8);
            this.g = (byte)(this.c.length - 1);
        }
        this.h = this.f;
        this.c = 0;
        this.j = this.i = 0;
        this.k = 0;
        this.f = true;
    }

    public final void a(Graphics graphics) {
        short s2;
        aq aq2;
        if (!this.a) {
            return;
        }
        if (ba.a.a % 3 == 0) {
            aq aq3 = this;
            if (aq3.f) {
                if (aq3.k < aq3.c[aq3.j].length() - 1) {
                    aq3.k = (byte)(aq3.k + 1);
                } else if (aq3.j < aq3.i + aq3.h - 1 && aq3.j < aq3.c.length - 1) {
                    aq3.j = (byte)(aq3.j + 1);
                    aq3.k = 0;
                }
                if (aq3.j >= aq3.c.length - 1 && aq3.k >= aq3.c[aq3.c.length - 1].length() - 1) {
                    aq3.f = false;
                }
            }
        }
        int n = 0;
        if (s.a[0].t < s.b / 2) {
            n = s.b - this.b;
        }
        graphics.translate(0, n);
        short s3 = this.b;
        short s4 = s.a;
        boolean bl = false;
        bl = false;
        Graphics graphics2 = graphics;
        aq aq4 = aq2 = this;
        if (aq2.c == null) {
            aq4.c = w.a("/sys/chat/backcloud.png");
        }
        if (aq4.d == null) {
            aq4.d = w.a("/sys/chat/leftTopC.png");
        }
        if (aq4.e == null) {
            aq4.e = w.a("/sys/chat/leftbottomC.png");
        }
        if (aq4.f == null) {
            aq4.f = w.a("/sys/chat/toph.png");
        }
        if (aq4.g == null) {
            aq4.g = w.a("/sys/chat/bottomh.png");
        }
        if (aq4.h == null) {
            aq4.h = w.a("/sys/chat/leftv.png");
        }
        graphics2.setColor(15061121);
        graphics2.fillRect(0, 0, (int)s.a, (int)aq2.b);
        graphics2.drawImage(aq2.c, 5, s3 + 0 - 5, 36);
        short s5 = (short)(s4 / 5);
        for (s2 = 0; s2 < s5; s2 = (short)(s2 + 1)) {
            graphics2.drawImage(aq2.f, 0 + s2 * 5, 0, 20);
            graphics2.drawImage(aq2.g, 0 + s2 * 5, s3 + 0, 36);
        }
        s2 = (short)(s3 / 5);
        for (s5 = 0; s5 < s2; s5 = (short)(s5 + 1)) {
            graphics2.drawImage(aq2.h, 0, 0 + s5 * 5, 20);
            graphics2.drawRegion(aq2.h, 0, 0, aq2.h.getWidth(), aq2.h.getHeight(), 2, s4 + 0, 0 + s5 * 5, 24);
        }
        graphics2.drawImage(aq2.d, 0, 0, 20);
        graphics2.drawRegion(aq2.d, 0, 0, aq2.d.getWidth(), aq2.d.getHeight(), 2, s4 + 0, 0, 24);
        graphics2.drawImage(aq2.e, 0, s3 + 0, 36);
        graphics2.drawRegion(aq2.e, 0, 0, aq2.e.getWidth(), aq2.e.getHeight(), 2, s4 + 0, s3 + 0, 40);
        int n2 = 7;
        if (GameMIDlet.self.phonemodel.equals("W958C")) {
            n2 = 2;
        }
        if (this.c == 0) {
            if (this.b != null) {
                graphics.drawImage(this.b, 4, n2, 20);
                if (this.a != null) {
                    w.a(graphics, this.a, 2, n2 + this.b.getHeight(), 14902310, 0xFFFFFF, 20);
                }
            }
            graphics.setColor(478220);
            for (n2 = (int)this.i; n2 < this.i + this.h; ++n2) {
                if (this.c == null || n2 >= this.c.length) continue;
                if (n2 < this.j) {
                    if (this.c == null) continue;
                    graphics.drawString(this.c[n2], this.d + 5, 5 + this.l * (n2 - this.i), 20);
                    continue;
                }
                if (n2 != this.j || this.c == null) continue;
                graphics.drawString(this.c[n2].substring(0, this.k + 1), this.d + 5, 5 + this.l * (n2 - this.i), 20);
            }
            if (this.i > 0) {
                this.c = true;
            }
            if (this.i + this.h - 1 < this.g) {
                this.d = true;
                this.e = false;
            }
            if (this.i == 0) {
                this.c = false;
            }
            if (this.i + this.h - 1 >= this.g) {
                this.d = false;
                this.e = true;
            }
            if (this.c) {
                n2 = this.a / 2;
                boolean bl2 = false;
                graphics.drawRegion(this.a, 0, 0, 11, 7, 0, n2, 3, 3);
            }
            if (this.d) {
                n2 = this.a / 2;
                int n3 = 0 + this.b;
                graphics.drawRegion(this.a, 11, 0, 11, 7, 0, n2, n3, 3);
            }
            if (this.e) {
                n2 = this.a / 2;
                int n4 = 0 + this.b;
                graphics.drawRegion(this.a, 22, 0, 11, 7, 0, n2, n4, 3);
            }
        } else if (this.c == e) {
            if (this.b != null) {
                this.b = (short)(this.b.length * w.a.getHeight() + 10);
            }
            for (n2 = 0; this.b != null && n2 < this.b.length; ++n2) {
                if (n2 == this.b) {
                    if (this.b == null || this.b[n2] == null) continue;
                    w.a(graphics, this.b[n2], 15 - w.a.stringWidth("\u5b57") / 2, 5 + n2 * w.a.getHeight(), 14902310, 0xFFFFFF, 20);
                    continue;
                }
                if (this.b == null || this.b[n2] == null) continue;
                graphics.setColor(0);
                graphics.drawString(this.b[n2], 15 - w.a.stringWidth("\u5b57") / 2, 5 + n2 * w.a.getHeight(), 20);
            }
            if (this.i != null) {
                graphics.drawImage(this.i, 15 - w.a.stringWidth("\u5b57") / 2, 7 + this.b * w.a.getHeight(), 24);
            }
        }
        graphics.translate(0, -n);
    }

    public final void f() {
        if (this.j < this.i + this.h - 1 && this.j < this.c.length - 1 || this.k < this.c[this.j].length() - 1) {
            this.j = (byte)(this.i + this.h - 1);
            if (this.j > this.c.length - 1) {
                this.j = (byte)(this.c.length - 1);
            }
            this.k = (byte)(this.c[this.j].length() - 1);
            this.f = false;
            return;
        }
        if (this.a < this.a.length - 1) {
            this.a = (byte)(this.a + 1);
            if (this.a > this.a.length - 1) {
                this.a = (byte)(this.a.length - 1);
            }
            this.i = 0;
            this.e();
        }
    }
}
