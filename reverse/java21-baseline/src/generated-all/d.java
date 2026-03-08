/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.midlet.MIDletStateChangeException
 *  javax.microedition.rms.RecordStore
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDletStateChangeException;
import javax.microedition.rms.RecordStore;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class d {
    private ar a;
    private ar b;
    private byte a;
    private static byte b = 0;
    private static byte c = 1;
    private static byte d = (byte)2;
    private static byte e = (byte)3;
    private static byte f = (byte)4;
    private static byte g = (byte)5;
    private static byte h = (byte)7;
    private static byte i = (byte)8;
    private static byte j = (byte)9;
    private static byte k = (byte)10;
    private bf[] a;
    private Image d;
    boolean a;
    private byte l;
    private byte m;
    Image a;
    Image b;
    Image c;
    private Image e;
    private Image f;
    private byte n;
    private String[] a;
    private String[] b;
    private String[] c;
    private Image g;
    private Image[] a;
    private String a;
    private String[] d;
    private String[] e;
    private byte o;
    private String b;
    private String[] f;
    private boolean b;
    private boolean c;
    private short a;
    private short b;
    private String c;
    private String[] g;
    private byte p;
    private String[] h;
    private byte[] a;
    private byte q;
    private int a;
    private int b;
    private Image h;
    private short c;
    private short d;
    private byte r;
    private short e;
    private long a = w.a("/sys/sword.ps");
    private long b = w.a("/sys/swordred.ps");
    private boolean d;
    private byte s = 1;
    private byte t;
    private boolean e = false;

    public d() {
        this.c = w.a("/sys/legamelogo.png");
        this.t = (byte)50;
        if (GameMIDlet.self.allowMusic) {
            this.e = new String[]{"\u97f3\u4e50\u5f00\u5173", "\u8fd4\u56de"};
            this.a = new String[]{"\u5f00\u59cb\u65c5\u7a0b", "\u7ee7\u7eed\u65c5\u7a0b", "\u6e38\u620f\u5e2e\u52a9", "\u6e38\u620f\u8bbe\u7f6e", "\u5173\u4e8e\u6211\u4eec", "\u9000\u51fa\u6e38\u620f"};
            this.b = new String[]{"\u5f00\u59cb\u65c5\u7a0b", "\u7ee7\u7eed\u65c5\u7a0b", "\u65f6\u5149\u65c5\u884c", "\u6e38\u620f\u5e2e\u52a9", "\u6e38\u620f\u8bbe\u7f6e", "\u5173\u4e8e\u6211\u4eec", "\u9000\u51fa\u6e38\u620f"};
            this.a = w.a(this.a, ap.a, 5);
            this.b = w.a(this.b, ap.a, 6);
            return;
        }
        this.e = new String[]{"\u8fd4\u56de"};
        this.a = new String[]{"\u5f00\u59cb\u65c5\u7a0b", "\u7ee7\u7eed\u65c5\u7a0b", "\u6e38\u620f\u5e2e\u52a9", "\u5173\u4e8e\u6211\u4eec", "\u9000\u51fa\u6e38\u620f"};
        this.b = new String[]{"\u5f00\u59cb\u65c5\u7a0b", "\u7ee7\u7eed\u65c5\u7a0b", "\u65f6\u5149\u65c5\u884c", "\u6e38\u620f\u5e2e\u52a9", "\u5173\u4e8e\u6211\u4eec", "\u9000\u51fa\u6e38\u620f"};
        this.a = w.a(this.a, ap.a, 4);
        this.b = w.a(this.b, ap.a, 5);
    }

    public final void a() {
        new bh(this);
        this.a = c;
    }

    private void c() {
        if (this.d) {
            return;
        }
        if (this.a == h) {
            if ((this.a() & 0x100) != 0 || (this.a() & 0x40) != 0) {
                this.r = (byte)10;
                return;
            }
            this.r = 1;
            if (GameMIDlet.self.phonemodel.equals("D608")) {
                this.r = (byte)3;
                return;
            }
        } else if (this.a == f) {
            if ((this.a() & 2) != 0) {
                if (this.a < 0) {
                    this.a = (short)(this.a + 4);
                    return;
                }
            } else if ((this.a() & 0x40) != 0 && w.a.getHeight() + 5 + w.a.getHeight() * this.d.length + this.a > s.b) {
                this.a = (short)(this.a - 4);
                return;
            }
        } else if (this.a == j) {
            if ((this.a() & 2) != 0) {
                if (this.b < 0) {
                    this.b = (short)(this.b + 4);
                    return;
                }
            } else if ((this.a() & 0x40) != 0 && w.a.getHeight() + 5 + w.a.getHeight() * this.g.length + this.b > s.b) {
                this.b = (short)(this.b - 4);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected final void a(int var1_1) {
        block71: {
            block72: {
                block70: {
                    if (this.d) {
                        return;
                    }
                    var1_1 = af.a(var1_1);
                    if (this.a != d.d) break block70;
                    switch (var1_1) {
                        case 8: {
                            if (this.a != null) {
                                this.a.a(this.a.a(this.a.a()) - 1);
                            }
                            if (this.a != null) {
                                this.a.e(1);
                            }
                            if (this.b != null) {
                                this.b.a(this.b.a(this.b.a()) - 1);
                            }
                            if (this.b != null) {
                                this.b.e(1);
                                this.b.a(0);
                            }
                            this.a = d.e;
                        }
                    }
                    break block71;
                }
                if (this.a != d.e) break block72;
                switch (var1_1) {
                    case 8: {
                        if (this.c[this.n].equals("\u5f00\u59cb\u65c5\u7a0b")) {
                            this.r = 1;
                            this.d = (short)5;
                            this.c = s.b;
                            this.e = (short)(-(this.f.length * w.a.getHeight()));
                            this.a = d.h;
                            this.d = false;
                            t.e = true;
                            break;
                        }
                        if (!this.c[this.n].equals("\u7ee7\u7eed\u65c5\u7a0b")) ** GOTO lbl42
                        this.a = d.k;
                        var2_2 /* !! */  = RecordStore.listRecordStores();
                        System.out.println("\u5b58\u68633\uff1a" + w.a(var2_2 /* !! */ ));
                        for (var3_4 = 0; var2_2 /* !! */  != null && var3_4 < var2_2 /* !! */ .length; ++var3_4) {
                            if (!var2_2 /* !! */ [var3_4].equals(s.h)) continue;
                            s.g = true;
                            s.a();
                        }
                        break block71;
lbl42:
                        // 1 sources

                        if (this.c[this.n].equals("\u65f6\u5149\u65c5\u884c")) {
                            if (this.c) {
                                this.a = 0;
                                ba.b = (byte)4;
                                if (ba.a == null) {
                                    ba.a = new t();
                                }
                                ba.a.c();
                                break;
                            }
                        } else {
                            if (this.c[this.n].equals("\u6e38\u620f\u5e2e\u52a9")) {
                                this.a = d.f;
                                break;
                            }
                            if (this.c[this.n].equals("\u6e38\u620f\u8bbe\u7f6e")) {
                                this.a = d.g;
                                break;
                            }
                            if (this.c[this.n].equals("\u5173\u4e8e\u6211\u4eec")) {
                                this.a = d.j;
                                break;
                            }
                            if (this.c[this.n].equals(ap.a)) {
                                GameMIDlet.self.stopThread();
                                try {
                                    GameMIDlet.self.platformRequest(ap.b);
                                }
                                catch (Exception v0) {
                                    var2_2 /* !! */  = v0;
                                    v0.printStackTrace();
                                }
                                try {
                                    GameMIDlet.self.destroyApp(true);
                                }
                                catch (MIDletStateChangeException v1) {
                                    var2_2 /* !! */  = v1;
                                    v1.printStackTrace();
                                }
                                break;
                            }
                            if (this.c[this.n].equals("\u9000\u51fa\u6e38\u620f")) {
                                try {
                                    GameMIDlet.self.destroyApp(true);
                                }
                                catch (MIDletStateChangeException v2) {
                                    var2_2 /* !! */  = v2;
                                    v2.printStackTrace();
                                }
                                break;
                            }
                        }
                        break block71;
                    }
                    case 2: {
                        if (this.n <= 0) ** GOTO lbl95
                        this.n = (byte)(this.n - 1);
                        if (this.c[this.n].equals("\u7ee7\u7eed\u65c5\u7a0b") && !this.b) {
                            if (this.n > 0) {
                                this.n = (byte)(this.n - 1);
                                break;
                            }
                            this.n = (byte)(this.c.length - 1);
                            break;
                        }
                        break block71;
lbl95:
                        // 1 sources

                        this.n = (byte)(this.c.length - 1);
                        break;
                    }
                    case 5: {
                        if (this.n < this.c.length - 1) {
                            this.n = (byte)(this.n + 1);
                            if (this.c[this.n].equals("\u7ee7\u7eed\u65c5\u7a0b") && !this.b) {
                                if (this.n < this.c.length - 1) {
                                    this.n = (byte)(this.n + 1);
                                    break;
                                }
                                this.n = 0;
                                break;
                            }
                        } else {
                            this.n = 0;
                        }
                    }
                }
                break block71;
            }
            if (this.a == d.k) {
                if (var1_1 == 8) {
                    if (this.b) {
                        this.a = 0;
                        this.d = true;
                        this.a = null;
                        this.b = null;
                        ba.b = (byte)4;
                        if (ba.a == null) {
                            Runtime.getRuntime().freeMemory();
                            ba.a = new t();
                            Runtime.getRuntime().freeMemory();
                        }
                        ba.a.a(this.h[this.q]);
                        this.h = null;
                    }
                } else if (var1_1 == af.g) {
                    this.a = d.e;
                } else if (var1_1 == 1) {
                    if (this.q > 0) {
                        this.q = (byte)(this.q - 1);
                    }
                } else if (var1_1 == 6 && this.q < this.h.length - 1) {
                    this.q = (byte)(this.q + 1);
                }
            } else if (this.a == d.f) {
                if (var1_1 == af.g) {
                    this.a = d.e;
                }
            } else if (this.a == d.j) {
                if (var1_1 == af.g) {
                    this.a = d.e;
                }
            } else if (this.a == d.g) {
                if (var1_1 == 8) {
                    if (this.e[this.o].equals("\u97f3\u4e50\u5f00\u5173")) {
                        GameMIDlet.self.playMusic = GameMIDlet.self.playMusic == false;
                    } else if (this.e[this.o].equals("\u8fd4\u56de")) {
                        this.a = d.e;
                    }
                } else if (var1_1 == af.g) {
                    this.a = d.e;
                } else if (var1_1 == 1) {
                    if (this.o > 0) {
                        this.o = (byte)(this.o - 1);
                    }
                } else if (var1_1 == 6 && this.o < this.e.length - 1) {
                    this.o = (byte)(this.o + 1);
                }
            } else if (this.a == d.i) {
                this.d = true;
                this.a = null;
                this.b = null;
                this.h = null;
                ba.b = (byte)4;
                if (ba.a == null) {
                    ba.a = new t();
                    ba.a.b();
                }
            }
        }
        if (var1_1 != 0) {
            var2_3 = 1 << var1_1;
            this.a |= var2_3;
            this.b &= ~var2_3;
            this.a();
        }
    }

    protected final void b(int n) {
        if ((n = af.a(n)) != 0) {
            this.b |= 1 << n;
            this.a();
        }
    }

    private int a() {
        int n = this.a;
        this.a &= ~this.b;
        this.b = 0;
        return n;
    }

    private void b(Graphics graphics) {
        for (int i = 0; i < 50; ++i) {
            this.a[i].a(graphics);
        }
    }

    private void c(Graphics graphics) {
        this.b = System.currentTimeMillis();
        if (this.b - this.a > 3000L && this.b - this.a < 3100L) {
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(0, 0, (int)ba.a.a, (int)ba.a.b);
            return;
        }
        if (this.b - this.a >= 3200L && this.b - this.a < 3300L) {
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(0, 0, (int)ba.a.a, (int)ba.a.b);
            return;
        }
        if (this.b - this.a >= 3400L && this.b - this.a < 3500L) {
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(0, 0, (int)ba.a.a, (int)ba.a.b);
            return;
        }
        if (this.b - this.a >= 3500L) {
            this.a = this.b;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(Graphics graphics) {
        block55: {
            block56: {
                block54: {
                    this.c();
                    if (ba.a.a % 3 == 0) {
                        this.p = this.p == 0 ? (byte)5 : (byte)0;
                    }
                    if (this.a != d) break block54;
                    if (this.s <= 1) break block55;
                    if (this.a != null) {
                        if (this.a.a() < this.a.a(this.a.a()) - 1) {
                            if (ba.a.a % 3 == 0) {
                                this.a.b();
                            }
                        } else {
                            if (!this.e) {
                                this.a.e(1);
                                this.e = true;
                                this.a.b();
                            }
                            if (ba.a.a % 3 == 0) {
                                this.a.b();
                            }
                        }
                    }
                    if (!this.e || this.b == null) break block55;
                    if (this.b.a() < this.b.a(this.b.a()) - 1) {
                        if (ba.a.a % 3 == 0) {
                            this.b.b();
                        }
                        break block55;
                    } else {
                        this.b.e(1);
                        this.b.a(0);
                        this.a = e;
                        this.e = false;
                    }
                    break block55;
                }
                if (this.a != e) break block56;
                if (ba.a.a % 3 == 0) {
                    if (this.a != null) {
                        this.a.b();
                    }
                    if (this.b != null) {
                        this.b.b();
                    }
                }
                break block55;
            }
            if (this.a == h) {
                this.c = (short)(this.c - 3 * this.r);
                if (this.c <= this.e) {
                    this.a = 0;
                    this.d = true;
                    this.a = null;
                    this.b = null;
                    ba.b = (byte)4;
                    if (ba.a == null) {
                        ba.a = new t();
                        ba.a.b();
                    }
                }
            }
        }
        graphics.setColor(0);
        graphics.setClip(0, 0, (int)ba.a.a, (int)ba.a.b);
        graphics.fillRect(0, 0, (int)ba.a.a, (int)ba.a.b);
        graphics.setClip(0, 0, (int)s.a, (int)s.b);
        byte by = 0;
        if (this.a == c) {
            if (this.a != null) {
                graphics.drawImage(this.a, s.a / 2, s.b / 2, 3);
            }
            if (this.b != null) {
                graphics.setClip(s.a / 2 - this.b.getWidth() / 2, s.b / 2 - this.b.getHeight() / 2, this.b.getWidth() * this.m / 100, this.b.getHeight());
                graphics.drawImage(this.b, s.a / 2, s.b / 2, 3);
                graphics.setClip(0, 0, (int)s.a, (int)s.b);
            }
            if (this.c != null) {
                graphics.drawImage(this.c, s.a - 2, s.b - 2, 40);
            }
            if (this.m < this.l) {
                this.m = (byte)(this.m + 10);
                if (this.m > this.l) {
                    this.m = this.l;
                }
            }
            if (!this.a) return;
            if (this.m < 100) return;
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.a = null;
            this.c = null;
            if (GameMIDlet.self.useStart) {
                this.a = d;
                return;
            }
            this.a = e;
            return;
        }
        if (this.a == d) {
            graphics.setClip(0, 0, (int)s.a, (int)s.b);
            if (this.s == 1) {
                graphics.setColor(0xFFFFFF);
                graphics.fillRect(s.a / 2 - this.t / 2, 0, (int)this.t, (int)s.b);
                if (this.t <= 0) return;
                this.t = (byte)(this.t - 2);
                if (this.t > 0) return;
                this.s = (byte)(this.s + 1);
                return;
            }
            if (this.s <= 1) return;
            if (this.a != null) {
                this.a.s = (short)(s.a / 2);
                this.a.t = (short)(s.b / 2);
                this.a.a(graphics);
            }
            this.c(graphics);
            this.b(graphics);
            if (!this.e) return;
            if (this.b == null) return;
            this.b.s = (short)(s.a / 2);
            this.b.t = (short)(s.b / 2);
            this.b.a(graphics);
            return;
        }
        if (this.a == e) {
            graphics.setClip(0, 0, (int)s.a, (int)s.b);
            if (GameMIDlet.self.useStart) {
                if (this.a != null) {
                    this.a.s = (short)(s.a / 2);
                    this.a.t = (short)(s.b / 2);
                    this.a.a(graphics);
                }
                this.c(graphics);
                this.b(graphics);
                if (this.b != null) {
                    this.b.s = (short)(s.a / 2);
                    this.b.t = (short)(s.b / 2);
                    this.b.a(graphics);
                }
            } else if (this.h != null) {
                graphics.drawImage(this.h, s.a >> 1, s.b >> 1, 3);
            }
            graphics.setClip(0, 0, (int)s.a, (int)s.b);
            w.a.getHeight();
            short s2 = 0;
            if (s.a == 176) {
                s2 = (short)(s.b / 2 + 75 - w.a.getHeight() / 2 + 20);
                w.a(graphics, this.c[this.n], s.a / 2, (int)s2, 16250611, 11814947, 17);
            } else if (s.a == 240) {
                s2 = (short)(s.b / 2 + 107 + 16 - w.a.getHeight() / 2);
                w.a(graphics, this.c[this.n], s.a / 2, (int)s2, 16250611, 11814947, 17);
            }
            by = (byte)w.a.stringWidth("\u5b57");
            graphics.drawImage(this.d, s.a / 2 - by * 3 - this.p, s2 + 5, 17);
            graphics.drawRegion(this.d, 0, 0, this.d.getWidth(), this.d.getHeight(), 2, s.a / 2 + by * 3 + this.p, s2 + 5, 17);
            return;
        }
        if (this.a == k) {
            graphics.setColor(12760193);
            graphics.fillRect(0, 0, (int)s.a, (int)s.b);
            if (this.h == null) return;
            int n = 0;
            if (s.a == 240) {
                n = 60;
            }
            graphics.translate(0, n);
            graphics.setColor(0);
            graphics.drawString("\u8bfb\u53d6\u8fdb\u5ea6", s.a / 2, 3, 17);
            by = (byte)(s.a - 30);
            for (int i = 0; this.a != null && i < this.a.length; ++i) {
                int n2 = 2 * w.a + 6;
                byte by2 = by;
                int n3 = 40 + i * 52;
                int n4 = 15;
                Graphics graphics2 = graphics;
                graphics2.setColor(10128995);
                graphics2.fillRect(15, n3, (int)by2, n2);
                graphics2.setColor(8873028);
                graphics2.drawRect(15, n3, (int)by2, n2);
                graphics.setColor(0);
                if (!s.g || s.j[this.a[i] - 1] != 1) continue;
                String string = s.k[this.a[i] - 1] + " \u7b49\u7ea7 " + s.j[this.a[i] - 1];
                String string2 = s.k[this.a[i] - 1] + "/" + s.k[this.a[i] - 1] + "/" + s.l[this.a[i] - 1] + " " + s.m[this.a[i] - 1] + ":" + s.n[this.a[i] - 1] + ":" + s.o[this.a[i] - 1];
                graphics.drawString(string, s.a >> 1, 40 + i * 52 + 3, 17);
                graphics.drawString(string2, s.a >> 1, 40 + i * 52 + 3 + w.a, 17);
            }
            graphics.setColor(0xFFFF00);
            graphics.drawRect(15, 40 + this.q * 52, (int)by, 2 * w.a + 6);
            graphics.translate(0, -n);
            if (!GameMIDlet.self.touchScreen) return;
            if (this.e == null) {
                this.e = w.a("/sys/return.ps");
                return;
            }
            graphics.drawImage(this.e, 2, (int)s.b, 36);
            return;
        }
        if (this.a == f) {
            this.c();
            graphics.setColor(0);
            graphics.setClip(0, 0, (int)s.a, (int)s.b);
            graphics.fillRect(0, 0, (int)s.a, (int)s.b);
            graphics.setColor(0xFFFF00);
            graphics.drawString("\u6e38\u620f\u5e2e\u52a9", s.a / 2, 3 + this.a, 17);
            graphics.setColor(0xFFFFFF);
            by = (byte)w.a.getHeight();
            for (int i = 0; this.d != null && i < this.d.length; ++i) {
                graphics.drawString(this.d[i], 5, by + 5 + by * i + this.a, 20);
            }
            if (!GameMIDlet.self.touchScreen) return;
            if (this.e == null) {
                this.e = w.a("/sys/return.ps");
                return;
            }
            graphics.drawImage(this.e, 2, (int)s.b, 36);
            return;
        }
        if (this.a == j) {
            this.c();
            graphics.setColor(0);
            graphics.setClip(0, 0, (int)s.a, (int)s.b);
            graphics.fillRect(0, 0, (int)s.a, (int)s.b);
            graphics.setColor(0xFFFF00);
            graphics.drawString("\u5173\u4e8e\u6211\u4eec", s.a / 2, 3 + this.b, 17);
            graphics.setColor(0xFFFFFF);
            by = (byte)w.a.getHeight();
            for (int i = 0; this.g != null && i < this.g.length; ++i) {
                graphics.drawString(this.g[i], 5, by + 5 + by * i + this.b, 20);
            }
            if (!GameMIDlet.self.touchScreen) return;
            if (this.e == null) {
                this.e = w.a("/sys/return.ps");
                return;
            }
            graphics.drawImage(this.e, 2, (int)s.b, 36);
            return;
        }
        if (this.a == g) {
            graphics.setColor(0);
            graphics.setClip(0, 0, (int)s.a, (int)s.b);
            graphics.fillRect(0, 0, (int)s.a, (int)s.b);
            graphics.setColor(0xFFFF00);
            graphics.drawString("\u6e38\u620f\u8bbe\u7f6e", s.a / 2, 3, 17);
        } else {
            if (this.a == h) {
                this.c();
                graphics.setColor(0);
                graphics.setClip(0, 0, (int)s.a, (int)s.b);
                graphics.fillRect(0, 0, (int)s.a, (int)s.b);
                by = (byte)w.a.getHeight();
                graphics.setColor(0xFFFFFF);
                int n = 0;
                while (this.f != null) {
                    if (n >= this.f.length) return;
                    graphics.drawString(this.f[n], (int)this.d, this.c + by * n, 36);
                    ++n;
                }
                return;
            }
            if (this.a != i) return;
            if (this.f == null) {
                this.f = w.a("/sys/kaishi.ps");
                return;
            }
            graphics.drawImage(this.f, s.a / 2, s.b - w.a, 33);
            return;
        }
        for (int i = 0; this.e != null && i < this.e.length; ++i) {
            if (this.o == i) {
                graphics.setColor(0xFFFF00);
            } else {
                graphics.setColor(0xFFFFFF);
            }
            graphics.drawString(this.e[i], s.a / 2, s.b / 2 - (w.a << 1) + w.a * i, 33);
            if (!GameMIDlet.self.allowMusic) continue;
            graphics.setColor(0xFFFFFF);
            graphics.drawString(GameMIDlet.self.playMusic ? "\u5f00" : "\u5173", s.a / 2 + w.a.stringWidth("\u58f0\u97f3\u5f00\u5173"), s.b / 2 - (w.a << 1), 33);
        }
        if (!GameMIDlet.self.touchScreen) return;
        if (this.e == null) {
            this.e = w.a("/sys/return.ps");
            return;
        }
        graphics.drawImage(this.e, 2, (int)s.b, 36);
    }

    public final void b() {
        if (this.a == f || this.a == j || this.a == g || this.a == k) {
            this.a = e;
        }
    }

    static void a(d d2) {
        int n;
        Object object;
        Object object2;
        v0.l = 0;
        if (GameMIDlet.self.useStart) {
            object2 = new an();
            ((an)object2).a("/start/start1.ani");
            object = new an();
            ((an)object).a("/start/start2.ani");
            d2.a = new bf[50];
            for (int i = 0; i < 50; ++i) {
                d2.a[i] = new bf();
            }
            d2.l = (byte)30;
            ((an)object2).b("/start/");
            if (GameMIDlet.self.cutSpLibImg) {
                ((an)object2).a();
            }
            ((an)object).b("/start/");
            if (GameMIDlet.self.cutSpLibImg) {
                ((an)object).a();
            }
            d2.a = new ar();
            d2.a.a((an)object2);
            d2.a.s = (short)(s.a / 2);
            d2.a.t = (short)(s.b / 2);
            d2.b = new ar();
            d2.b.a((an)object);
            d2.b.s = (short)(s.a / 2);
            d2.b.t = (short)(s.b / 2);
        } else {
            d2.l = (byte)50;
            d2.h = GameMIDlet.self.imgType <= 0 ? w.a("/start/menuBack.ps") : w.a("/start/menuBack.png");
        }
        d2.d = w.a("/sys/new/lTriangle.png");
        Image.createImage((Image)d2.d, (int)0, (int)0, (int)d2.d.getWidth(), (int)d2.d.getHeight(), (int)2);
        d2.l = (byte)70;
        d2.g = w.a("/sys/arrow.ps");
        if (GameMIDlet.self.cutImg) {
            d2.a = new Image[4];
            for (int i = 0; i < 2; ++i) {
                d2.a[i] = Image.createImage((Image)d2.g, (int)(i * 11), (int)0, (int)11, (int)7, (int)0);
            }
            d2.a[2] = Image.createImage((Image)d2.g, (int)0, (int)0, (int)11, (int)7, (int)5);
            d2.a[3] = Image.createImage((Image)d2.g, (int)0, (int)0, (int)11, (int)7, (int)6);
            d2.g = null;
        }
        object2 = w.a("/txt/story.txt");
        d2.b = w.a((String)object2, "startStory:", "startStoryEnd");
        d2.f = w.a(d2.b, "\r\n", s.a - 10);
        d2.b = null;
        object = w.a("/txt/about.txt");
        d2.a = w.a((String)object, "help:", "helpEnd");
        d2.d = w.a(d2.a, "\r\n", s.a - 10);
        d2.a = null;
        d2.c = ap.c;
        d2.g = w.a(d2.c, "\r\n", s.a - 10);
        d2.c = null;
        d2.l = (byte)90;
        d2.b = false;
        d2.c = false;
        String[] stringArray = RecordStore.listRecordStores();
        System.out.println("\u5b58\u6863\uff1a" + w.a(stringArray));
        for (n = 0; stringArray != null && n < stringArray.length; ++n) {
            if (stringArray[n].equals(s.i)) {
                d2.b = true;
                d2.a = w.c(d2.a, 1);
                continue;
            }
            if (stringArray[n].equals(s.j)) {
                d2.b = true;
                d2.a = w.c(d2.a, 2);
                continue;
            }
            if (stringArray[n].equals(s.k)) {
                d2.b = true;
                d2.a = w.c(d2.a, 3);
                continue;
            }
            if (!stringArray[n].equals(s.l)) continue;
            d2.c = true;
        }
        if (d2.a != null) {
            d2.a = o.a(d2.a);
            block8: for (n = 0; n < d2.a.length; ++n) {
                switch (d2.a[n]) {
                    case 1: {
                        d2.h = o.a(d2.h, "\u8fdb\u5ea6\u4e00");
                        continue block8;
                    }
                    case 2: {
                        d2.h = o.a(d2.h, "\u8fdb\u5ea6\u4e8c");
                        continue block8;
                    }
                    case 3: {
                        d2.h = o.a(d2.h, "\u8fdb\u5ea6\u4e09");
                    }
                }
            }
        }
        boolean cfr_ignored_0 = d2.c;
        d2.c = d2.a;
        d2.l = (byte)100;
    }
}
