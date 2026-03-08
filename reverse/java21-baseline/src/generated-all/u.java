/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreException
 *  javax.microedition.rms.RecordStoreFullException
 *  javax.microedition.rms.RecordStoreNotFoundException
 *  javax.microedition.rms.RecordStoreNotOpenException
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotFoundException;
import javax.microedition.rms.RecordStoreNotOpenException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class u {
    private static String a;
    public static byte a;
    public static byte b;
    public static boolean a;
    private static int h;
    private static String[] d;
    private static int[] d;
    private static String[] e;
    private static String[] f;
    private static String[] g;
    private static int[] e;
    public static StringBuffer a;
    private byte f = 0;
    private static String[] h;
    private static String[] i;
    private static String b;
    private static String c;
    public static String[] a;
    public static String[] b;
    private static String[][] a;
    private static String[][] b;
    private static int[][] b;
    private static byte[][] a;
    private static byte g;
    private static byte h;
    private static byte[] c;
    private static short[][] a;
    private static String[][] c;
    private static String d;
    private static String[] j;
    private static String[] k;
    public static String[] c;
    private int i = 0;
    public int a;
    public int b;
    private int j;
    private boolean d;
    static int[][] a;
    public static short a;
    private int k;
    private int l;
    private int m;
    private int n;
    private Image a;
    private Image b;
    private Image c;
    private int o;
    private int p;
    private int q;
    private int r;
    public static int c;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w = 0;
    private static int x;
    private static int y;
    private static int z;
    private int A;
    private int B;
    private int C;
    public static int d;
    public static int e;
    private String[] l = new String[2];
    private static boolean e;
    private String e = " ";
    private static int D;
    private static int E;
    public z[] a;
    private static String f;
    public static boolean b;
    private static boolean f;
    private static boolean g;
    public static boolean c;
    public static short b;
    public static short c;
    public static short d;
    public static short e;
    public static short f;
    public static short g;
    public static short h;
    public static byte c;
    public static byte d;
    public static byte e;
    public static int f;
    public static int g;
    public static byte[] a;
    public static byte[] b;
    public static int[] a;
    public static int[] b;
    public static int[] c;

    public u() {
        bc.a = ap.b;
        bc.a = ap.d;
        bc.b = ap.e;
        System.out.println("Sms.channelSmsCmd.length=" + bc.a.length);
        n.a(2);
    }

    public static void a(String object) {
        if (a == null) {
            a = w.a((String)object);
        }
        if (s.a[0].i) {
            return;
        }
        if (ba.a.a != null) {
            return;
        }
        if (GameMIDlet.self.moreSleep) {
            try {
                System.gc();
                Thread.sleep(200L);
            }
            catch (InterruptedException interruptedException) {
                object = interruptedException;
                interruptedException.printStackTrace();
            }
        }
        ba.a.a = new u();
        ba.a.b = (byte)5;
        if (GameMIDlet.self.playMusic && GameMIDlet.self.allowMusic) {
            ba.a.j();
        }
        object = ba.a.a;
        ba.a.a.k = 22;
        ((u)object).l = 5;
        ((u)object).m = 20;
        ((u)object).n = w.a.getHeight() + 8;
        ((u)object).t = 37;
        ((u)object).u = 60;
        ((u)object).v = 16;
        ((u)object).A = ((u)object).t;
        ((u)object).B = ((u)object).u;
        ((u)object).C = ((u)object).v;
        ((u)object).f = 0;
        ((u)object).i = 0;
        b = 0;
        ((u)object).a = 0;
        ((u)object).b = 0;
        ((u)object).o = 0;
        ((u)object).q = 0;
        u.d();
        a = new int[]{500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600};
        b = new int[]{11, 20, 21, 22, 22, 25, 13, 14, 15, 16, 17, 19};
        c = new int[]{5, 9, 12, 56, 57, 58, 59, 60, 61, 62, 63, 64};
        object = ba.a.a;
        if (d == null) {
            d = w.a(a, "smsName:", "end", "=");
            d = w.a(a, "smsType:", "end", "=");
            e = w.a(a, "smsNote:", "end", "=");
        }
        int n2 = d.length;
        h = 0;
        for (int i = 0; i < n2; ++i) {
            if (d[i] < 1) continue;
            ++h;
        }
        b = new int[h][];
        a = new String[h][];
        b = new String[h][];
        a = new byte[h][];
        a = new short[h][];
        c = new String[h][];
        ((u)object).c = w.a("/sys/arrow.ps");
        ((u)object).b = w.a("/sys/white_number_s.ps");
        if (((u)object).a == null) {
            ((u)object).a = w.a("/sys/cloudCursor.ps");
        }
        ba.a.a.d = true;
        if (ba.a.b != null) {
            for (int i = 0; ba.a.b.a != null && i < ba.a.b.a.length; ++i) {
                if (ba.a.b.a[i].s != 1 || ((g)ba.a.b.a[i]).d != 2) continue;
                ((g)ba.a.b.a[i]).f();
            }
        }
    }

    private static boolean a() {
        InterruptedException interruptedException;
        a = null;
        d = null;
        d = null;
        e = null;
        f = null;
        g = null;
        e = null;
        a.delete(0, a.length());
        b = null;
        c = null;
        a = null;
        b = null;
        a = null;
        b = null;
        b = null;
        a = null;
        a = null;
        c = null;
        j = null;
        c = null;
        ba.a.a = null;
        System.gc();
        try {
            Thread.sleep(100L);
        }
        catch (InterruptedException interruptedException2) {
            interruptedException = interruptedException2;
            interruptedException2.printStackTrace();
        }
        System.out.println("\u9000\u51fa\u77ed\u4fe1\u7834\u89e3\u754c\u9762\u65f6\u8fdb\u884c\u4fdd\u5b58!");
        s.a((byte)0);
        s.b((byte)0);
        ((at)ba.a).a = 0;
        ((at)ba.a).b = 0;
        if (ap.a == 0) {
            ba.a.m();
            ba.a.k();
            if (GameMIDlet.self.playMusic && GameMIDlet.self.allowMusic) {
                ba.a.i();
            }
            ba.a.b = 1;
            n.a(1);
        } else if (ap.a == 1) {
            if (ba.a.a == null) {
                ba.a.a = new ae();
            }
            ba.a.b = (byte)8;
        }
        try {
            Thread.sleep(200L);
        }
        catch (InterruptedException interruptedException3) {
            interruptedException = interruptedException3;
            interruptedException3.printStackTrace();
        }
        return true;
    }

    private void c() {
        if (d[this.f] != 101) {
            return;
        }
        System.out.println("readEquip curMenuSelect=" + this.f);
        u.a[this.f] = null;
        if (b[this.f] == null) {
            u.b[this.f] = w.a(a, "equipID:", "end", "=");
        }
        d = "\u7834\u89e3\u6210\u529f\uff01";
        if (a[this.f] == null) {
            u.a[this.f] = w.a(a, "equipPrice" + a + ":", "end", "=");
        }
        if (c == null) {
            c = w.a(a, "equippro:", "end", "=");
        }
        h = 1;
        if (b == null) {
            b = w.a("/txt/equip.txt");
        }
        u.a[this.f] = w.a(b, "equipName:", "end", "=", ",");
        u.b[this.f] = w.a(b, "equipEffectNote:", "end", "=");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(int n2, int n3) {
        Object object;
        if (ba.a.a == 2 && ba.a.b == 5 && (object = n.a(n2, n3)) != null) {
            if (((ad)object).a == 3) {
                object = ba.a;
                synchronized (object) {
                    u.a();
                }
            } else if (((ad)object).a == 2) {
                switch (b) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 7: 
                    case 8: 
                    case 9: {
                        ba.a.a.a(af.g);
                    }
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(Graphics graphics) {
        ba ba2 = ba.a;
        synchronized (ba2) {
            if (!this.d) {
                return;
            }
            if (c++ % 4 == 0) {
                this.s = this.s == 0 ? 3 : 0;
            }
            switch (b) {
                case 0: {
                    u.b(graphics);
                    int n2 = h;
                    String[] stringArray = e;
                    String[] stringArray2 = d;
                    String string = "[\u7531\u6625\u54e5\u7834\u89e3]";
                    byte by = this.f;
                    int n3 = this.o;
                    graphics.setColor(0);
                    graphics.drawString(string, 8, 4, 20);
                    int n4 = this.p = (s.b - this.k - this.n - this.l - this.m) / (this.v + 5);
                    this.u = this.k + this.l + (s.b - this.k - this.n - this.l - this.m) / 2 - n4 / 2 * this.v;
                    int n5 = this.t - 17;
                    int n6 = this.u;
                    int n7 = this.v;
                    for (int i = n3; i < n2; ++i) {
                        if (i != by) {
                            graphics.drawString(stringArray2[i], n5, n6 - 2, 20);
                        } else {
                            w.a(graphics, stringArray2[i], n5 - 2, n6 + 1 - 2, 0, 0xFFFFFF, 20);
                            if (this.a != null) {
                                if (GameMIDlet.self.cutImg) {
                                    graphics.drawImage(this.a, this.t - 24 - this.s, n6 + 2, 17);
                                } else {
                                    graphics.drawRegion(this.a, 0, 0, this.a.getWidth(), this.a.getHeight(), 0, this.t - 24 - this.s, n6 + 2, 17);
                                }
                            }
                        }
                        n6 += n7;
                        if (i - n3 >= n4) break;
                    }
                    if (n3 != 0) {
                        graphics.drawRegion(this.c, 0, 0, 11, 7, 0, s.a / 2, 30 - this.s, 20);
                    }
                    if (n3 / (n4 + 1) != (n2 - 1) / (n4 + 1)) {
                        graphics.drawRegion(this.c, 0, 0, 11, 7, 3, s.a / 2, s.b - 38 - this.s, 20);
                    }
                    ah.a(graphics, 0, s.b - w.a.getHeight() - 8);
                    if (d[by] == 1 && c > 0) {
                        u.a(graphics, stringArray[by] + "(\u8fd8\u6709" + c + "\u6b21\u6709\u6548)", s.b - w.a.getHeight() - 4);
                        break;
                    }
                    if (d[by] == 2 && e > 0) {
                        u.a(graphics, stringArray[by] + "(\u8fd8\u6709" + e + "\u6b21\u6709\u6548)", s.b - w.a.getHeight() - 4);
                        break;
                    }
                    if (d[by] == 3 && c) {
                        u.a(graphics, stringArray[by] + "(\u5df2\u7ecf\u5f00\u653e)", s.b - w.a.getHeight() - 4);
                        break;
                    }
                    if (d[by] == 4) {
                        u.a(graphics, stringArray[by] + "(\u60a8\u73b0\u5728\u7684\u6e38\u620f\u91d1\u5e01\u4e3a" + s.a + ")", s.b - w.a.getHeight() - 4);
                        break;
                    }
                    if (d[by] == 8 && g > 0) {
                        u.a(graphics, stringArray[by] + "(\u8fd8\u6709" + g + "\u6b21\u6709\u6548)", s.b - w.a.getHeight() - 4);
                        break;
                    }
                    if (d[by] == 9 && g > 0) {
                        u.a(graphics, stringArray[by] + "(\u8fd8\u6709" + h + "\u6b21\u6709\u6548)", s.b - w.a.getHeight() - 4);
                        break;
                    }
                    if (d[by] == 10 && b) {
                        u.a(graphics, stringArray[by] + "(\u5df2\u7ecf\u5f00\u653e)", s.b - w.a.getHeight() - 4);
                        break;
                    }
                    if (d[by] == 7 && s.b) {
                        u.a(graphics, stringArray[by] + "(\u5df2\u7ecf\u5f00\u653e)", s.b - w.a.getHeight() - 4);
                        break;
                    }
                    u.a(graphics, stringArray[by], s.b - w.a.getHeight() - 4);
                    break;
                }
                case 1: {
                    u.b(graphics);
                    this.a(graphics, this.q, this.i, "\u62e5\u6709\u91d1\u5e01\uff1a" + s.a, a[this.f], b[this.f], b[this.f].length);
                    break;
                }
                case 7: {
                    u.b(graphics);
                    this.a(graphics, "\u88c5\u5907\u670d\u52a1\u7c7b\u578b", h, i);
                    break;
                }
                case 8: {
                    u.b(graphics);
                    this.a(graphics, this.q, this.i, "\u62e5\u6709\u91d1\u5e01\uff1a" + s.a, a[this.f], b[this.f], b[this.f].length);
                    break;
                }
                case 3: {
                    int n8;
                    u.b(graphics);
                    graphics.setColor(0);
                    int n9 = 0;
                    n9 = n8 = k.length;
                    n9 = this.u = this.k + this.l + (s.b - this.k - this.n - this.l - this.m) / 2 - n9 / 2 * this.v;
                    for (int i = 0; i < n8; ++i) {
                        graphics.drawString(k[i], s.a >> 1, n9 += this.v, 33);
                    }
                    ah.a(graphics, 0, s.b - w.a.getHeight() - 8);
                    if (GameMIDlet.self.touchScreen) break;
                    w.a(graphics, "\u514d\u8d39", s.a - 10, s.b - w.a.getHeight(), 0, 0xBBBBBB, 24);
                    w.a(graphics, "\u53d6\u6d88", 10, s.b - w.a.getHeight(), 0, 0xBBBBBB, 20);
                    break;
                }
                case 9: {
                    u.b(graphics);
                    this.a(graphics, "\u9009\u62e9\u5305\u88f9\u4e2d\u8981\u5347\u7ea7\u7684\u88c5\u5907", this.a);
                    break;
                }
                case 2: {
                    int n10;
                    u.b(graphics);
                    graphics.setColor(0);
                    int n11 = 0;
                    n11 = n10 = j.length;
                    n11 = this.u = this.k + this.l + (s.b - this.k - this.n - this.l - this.m) / 2 - n11 / 2 * this.v;
                    for (int i = 0; i < n10; ++i) {
                        graphics.drawString(j[i], s.a >> 1, n11 += this.v, 33);
                    }
                    ah.a(graphics, 0, s.b - w.a.getHeight() - 8);
                    if (GameMIDlet.self.touchScreen) break;
                    w.a(graphics, "\u514d\u8d39", s.a - 30, s.b - w.a.getHeight(), 0, 0xBBBBBB, 20);
                    w.a(graphics, "\u53d6\u6d88", 10, s.b - w.a.getHeight(), 0, 0xBBBBBB, 20);
                    break;
                }
                case 4: {
                    u.b(graphics);
                    graphics.setColor(0);
                    int n12 = s.b / 2;
                    graphics.drawString("\u53d1\u9001\u4e2d...", s.a >> 1, n12, 33);
                    ah.a(graphics, 0, s.b - w.a.getHeight() - 8);
                    break;
                }
                case 5: {
                    int n13;
                    u.b(graphics);
                    graphics.setColor(0);
                    int n14 = 0;
                    n14 = n13 = c.length;
                    n14 = this.u = this.k + this.l + (s.b - this.k - this.n - this.l - this.m) / 2 - n14 / 2 * this.v;
                    for (int i = 0; i < n13; ++i) {
                        graphics.drawString(c[i], s.a >> 1, n14 += this.v, 33);
                    }
                    ah.a(graphics, 0, s.b - w.a.getHeight() - 8);
                    if (c++ <= a) break;
                    if (bc.a == 6) {
                        return;
                    }
                    if (d[this.f] > 0 && d[this.f] < 100) {
                        b = 0;
                        n.a(2);
                        break;
                    }
                    if (d[this.f] > 101) {
                        b = 1;
                        break;
                    }
                    if (d[this.f] != 101) break;
                    if (a == 0 || a == 1 || a == 2 || a == 3) {
                        b = (byte)8;
                        break;
                    }
                    if (a == 4) {
                        b = (byte)9;
                        break;
                    }
                    if (a != 5) break;
                    b = (byte)7;
                    break;
                }
                case 6: {
                    u.b(graphics);
                    graphics.setColor(0);
                    int n15 = s.b / 2;
                    graphics.drawString(a.toString(), s.a >> 1, n15, 33);
                    if (c++ <= a) break;
                    if (d[this.f] > 0 && d[this.f] < 100) {
                        b = 0;
                        n.a(2);
                        break;
                    }
                    if (d[this.f] > 101) {
                        b = 1;
                        break;
                    }
                    if (d[this.f] != 101) break;
                    if (a == 0 || a == 1 || a == 2 || a == 3) {
                        b = (byte)8;
                        break;
                    }
                    if (a == 4) {
                        b = (byte)9;
                        break;
                    }
                    if (a != 5) break;
                    b = (byte)7;
                }
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public final void a(int var1_2) {
        var1_2 = af.a(var1_2);
        block2 : switch (u.b) {
            case 0: {
                if (var1_2 == af.g) {
                    this = ba.a;
                    synchronized (this) {
                        u.a();
                        break;
                    }
                }
                if (var1_2 != af.f && var1_2 != 8) ** GOTO lbl102
                if (u.f == null) {
                    u.f = w.a(u.a, "smsBuyInfo:", "end", "=");
                }
                if (u.g == null) {
                    u.g = w.a(u.a, "smsBuyOK:", "end", "=");
                }
                if (u.e == null) {
                    u.e = w.a(u.a, "smsCount:", "end", "=");
                }
                if (u.d[this.f] <= 0 || u.d[this.f] >= 100) ** GOTO lbl65
                if (u.d[this.f] != 5) ** GOTO lbl36
                for (var0_1 = 0; var0_1 < 4 && var0_1 < s.a.length; ++var0_1) {
                    if (!s.a[var0_1].g || s.a[var0_1].a[3] > 0) continue;
                    v0 = true;
                    ** GOTO lbl27
                }
                v0 = false;
lbl27:
                // 2 sources

                if (!v0) {
                    u.c = 0;
                    u.a.delete(0, u.a.length());
                    u.a.append("\u60a8\u6ca1\u6709\u4eba\u5458\u6b7b\u4ea1");
                    u.b = (byte)6;
                    return;
                }
                ** GOTO lbl62
lbl36:
                // 1 sources

                if (u.d[this.f] == 3) {
                    if (u.c) {
                        return;
                    }
                    u.j = w.a(u.f[this.f] + "(\u5df2\u7834\u89e3\uff0c\u514d\u8d39" + bc.b + "\u5206\u4e0d\u8981)", "\r\n", s.a - 20);
                } else if (u.d[this.f] == 6) {
                    if (u.c == null) {
                        u.c = w.a("/txt/item.txt");
                    }
                    u.a = w.a(u.c, "itemName:", "end", "=");
                    w.a(u.c, "itemNote:", "end", "=");
                    if (u.b == null) {
                        u.b = w.a("/txt/equip.txt");
                    }
                    u.b = w.a(u.b, "equipName:", "end", "=", ",");
                    w.a(u.b, "equipEffectNote:", "end", "=");
                    u.j = w.a(u.f[this.f] + "(\u5df2\u7834\u89e3\uff0c\u514d\u8d39" + bc.b + "\u5206\u4e0d\u8981)", "\r\n", s.a - 20);
                } else {
                    switch (u.d[this.f]) {
                        case 7: {
                            if (!s.b) break;
                            return;
                        }
                        case 10: {
                            if (!u.b) break;
                            return;
                        }
                    }
                    u.j = w.a(u.f[this.f] + "(\u5df2\u7834\u89e3\uff0c\u514d\u8d39" + bc.b + "\u5206\u4e0d\u8981)", "\r\n", s.a - 20);
                }
lbl62:
                // 4 sources

                u.b = (byte)2;
                n.a(3);
                return;
lbl65:
                // 1 sources

                if (u.d[this.f] >= 102) {
                    if (u.d[this.f] >= 100) {
                        System.out.println("readItem curMenuSelect=" + this.f);
                        if (u.a == null) {
                            System.out.println("g_sSmsContent==null");
                        }
                        if (u.b[this.f] == null) {
                            u.b[this.f] = w.a(u.a, "item" + (this.f + 1) + "ID:", "end", "=");
                        }
                        if (u.c[this.f] == null) {
                            u.c[this.f] = w.a(u.a, "item" + (this.f + 1) + "BuyOK:", "end", "=");
                        }
                        if (u.a[this.f] == null) {
                            u.a[this.f] = w.a(u.a, "item" + (this.f + 1) + "Price:", "end", "=");
                        }
                        if (u.a[this.f] == null) {
                            u.a[this.f] = w.a(u.a, "item" + (this.f + 1) + "Count:", "end", "=");
                        }
                        switch (u.d[this.f]) {
                            case 102: {
                                if (u.c == null) {
                                    u.c = w.a("/txt/item.txt");
                                }
                                u.a[this.f] = w.a(u.c, "itemName:", "end", "=");
                                u.b[this.f] = w.a(u.c, "itemNote:", "end", "=");
                                break;
                            }
                            case 103: {
                                if (u.c == null) {
                                    u.c = w.a("/txt/item.txt");
                                }
                                u.a[this.f] = w.a(u.c, "itemName:", "end", "=");
                                u.b[this.f] = w.a(u.c, "itemNote:", "end", "=");
                            }
                        }
                    }
                    s.f();
                    u.b = 1;
                    u.g = 1;
                    n.a(3);
                    return;
                }
                if (u.d[this.f] != 101) break;
                if (u.h == null) {
                    u.h = w.a(u.a, "serviceType:", "end", "=");
                    u.i = w.a(u.a, "serviceNote:", "end", "=");
                }
                u.b = (byte)7;
                n.a(3);
                return;
lbl102:
                // 1 sources

                if (var1_2 == 1) {
                    if (this.f <= 0) break;
                    this.f = (byte)(this.f - 1);
                    if (this.f - this.o < 0) {
                        this.o -= this.p + 1;
                    }
                    u.d();
                    return;
                }
                if (var1_2 != 6 || this.f >= u.h - 1) break;
                this.f = (byte)(this.f + 1);
                if (this.f - this.o > this.p) {
                    this.o += this.p + 1;
                }
                u.d();
                return;
            }
            case 1: {
                if (var1_2 == af.g) {
                    this.i = 0;
                    this.q = 0;
                    s.a = null;
                    u.b = 0;
                    return;
                }
                if (var1_2 == af.f || var1_2 == 8) {
                    u.b = (byte)3;
                    u.k = w.a("\u662f\u5426\u7834\u89e3\uff1f", "\r\n", s.a - 20);
                    return;
                }
                if (var1_2 == 1) {
                    if (this.i <= 0) break;
                    --this.i;
                    if (this.i - this.q < 0) {
                        this.q -= this.r + 1;
                    }
                    u.d();
                    return;
                }
                if (var1_2 == 6) {
                    if (this.i >= u.b[this.f].length - 1) break;
                    ++this.i;
                    if (this.i - this.q > this.r) {
                        this.q += this.r + 1;
                    }
                    u.d();
                    return;
                }
                if (var1_2 == 2) {
                    if (!u.d[this.f].equals("\u7834\u89e3\u9053\u5177[\u91d1\u5e01]") || u.g <= 1) break;
                    u.g = (byte)(u.g - 1);
                    return;
                }
                if (var1_2 != 5 || !u.d[this.f].equals("\u7834\u89e3\u9053\u5177[\u91d1\u5e01]") || u.g >= 9 || s.a < this.w + u.a[this.f][this.i]) break;
                u.g = (byte)(u.g + 1);
                return;
            }
            case 8: {
                if (var1_2 == af.g) {
                    this.i = 0;
                    this.q = 0;
                    u.b = (byte)7;
                    return;
                }
                if (var1_2 == af.f || var1_2 == 8) {
                    u.b = (byte)3;
                    u.k = w.a("\u662f\u5426\u7834\u89e3\uff1f", "\r\n", s.a - 20);
                    return;
                }
                if (var1_2 == 1) {
                    if (this.i <= 0) break;
                    --this.i;
                    if (this.i - this.q < 0) {
                        this.q -= this.r + 1;
                    }
                    u.d();
                    return;
                }
                if (var1_2 != 6 || this.i >= u.b[this.f].length - 1) break;
                ++this.i;
                if (this.i - this.q > this.r) {
                    this.q += this.r + 1;
                }
                u.d();
                return;
            }
            case 3: {
                if (var1_2 == af.g) {
                    if (u.d[this.f].equals("\u7834\u89e3\u79d8\u7c4d[\u91d1\u5e01]") || u.d[this.f].equals("\u7834\u89e3\u9053\u5177[\u91d1\u5e01]")) {
                        u.b = 1;
                        return;
                    }
                    if (!u.d[this.f].equals("\u88c5\u5907\u670d\u52a1")) break;
                    u.b = (byte)8;
                    return;
                }
                if (var1_2 != af.f && var1_2 != 8) break;
                super.c(u.d[this.f]);
                n.a(3);
                return;
            }
            case 7: {
                if (var1_2 == af.g) {
                    u.y = 0;
                    u.z = 0;
                    z.a = null;
                    u.b = 0;
                    return;
                }
                if (var1_2 == af.f || var1_2 == 8) {
                    if (u.h[u.y + u.z].equals("\u9ad8\u7ea7\u88c5\u5907[\u91d1\u5e01]")) {
                        u.b = (byte)8;
                        u.a = 1;
                        super.c();
                    } else if (u.h[u.y + u.z].equals("\u6781\u54c1\u88c5\u5907[\u91d1\u5e01]")) {
                        u.b = (byte)8;
                        u.a = (byte)2;
                        super.c();
                    } else if (u.h[u.y + u.z].equals("\u5b8c\u7f8e\u88c5\u5907[\u91d1\u5e01]")) {
                        u.b = (byte)8;
                        u.a = (byte)3;
                        super.c();
                    } else if (u.h[u.y + u.z].equals("\u88c5\u5907\u8d4c\u535a[\u91d1\u5e01]")) {
                        u.b = (byte)8;
                        u.a = 0;
                        super.c();
                    } else if (u.h[u.y + u.z].equals("\u5347\u7ea7\u88c5\u5907")) {
                        super.e();
                        u.b = (byte)9;
                        u.a = (byte)4;
                        u.e = true;
                    } else if (u.h[u.y + u.z].equals("\u88c5\u5907\u7b49\u7ea7\u4e0a\u9650") && !z.b) {
                        u.b = (byte)2;
                        u.j = w.a("\u5f00\u901a\u6240\u6709\u88c5\u5907\u7684\u5347\u7ea7\u4e0a\u9650(\u5df2\u7834\u89e3\uff0c\u514d\u8d39" + bc.b + "\u5206\u4e0d\u8981)", "\r\n", s.a - 20);
                        u.a = (byte)5;
                    }
                    z.b();
                    n.a(3);
                    return;
                }
                if (var1_2 == 1) {
                    if (u.z > 0) {
                        --u.z;
                        u.d();
                        return;
                    }
                    if (u.z != 0 || u.y <= 0) break;
                    u.z = u.x - 1;
                    u.y -= u.x;
                    u.d();
                    return;
                }
                if (var1_2 != 6 || u.y + u.z >= u.h.length - 1) break;
                if (u.z < u.x - 1) {
                    ++u.z;
                } else {
                    u.z = 0;
                    u.y += u.x;
                }
                u.d();
                return;
            }
            case 9: {
                u.e = true;
                if (var1_2 == af.g) {
                    u.d = 0;
                    u.e = 0;
                    u.b = (byte)7;
                    return;
                }
                if (var1_2 == af.f || var1_2 == 8) {
                    if (this.a == null || this.a[u.d + u.e].b >= z.c) break;
                    u.b = (byte)2;
                    u.j = w.a("\u88c5\u5907\u53472\u7ea7(\u5df2\u7834\u89e3\uff0c\u514d\u8d39" + bc.b + "\u5206\u4e0d\u8981)", "\r\n", s.a - 20);
                    n.a(3);
                    return;
                }
                if (var1_2 == 1) {
                    if (this.a == null) break;
                    if (u.e > 0) {
                        --u.e;
                        u.d();
                        return;
                    }
                    if (u.e != 0 || u.d <= 0) break;
                    u.e = u.x - 1;
                    u.d -= u.x;
                    u.d();
                    return;
                }
                if (var1_2 != 6 || this.a == null || u.d + u.e >= this.a.length - 1) break;
                if (u.e < u.x - 1) {
                    ++u.e;
                } else {
                    u.e = 0;
                    u.d += u.x;
                }
                u.d();
                return;
            }
            case 2: {
                if (var1_2 == af.g) {
                    if (u.d[this.f] > 0 && u.d[this.f] < 100) {
                        u.b = 0;
                        n.a(2);
                        return;
                    }
                    if (u.d[this.f] > 101) {
                        u.b = 1;
                        return;
                    }
                    if (u.d[this.f] != 101) break;
                    if (u.a == 0 || u.a == 1 || u.a == 2 || u.a == 3) {
                        u.b = (byte)8;
                        return;
                    }
                    if (u.a == 4) {
                        u.b = (byte)9;
                        return;
                    }
                    if (u.a != 5) break;
                    u.b = (byte)7;
                    return;
                }
                if (var1_2 != af.f && var1_2 != 8) break;
                u.b = (byte)4;
                u.c = 0;
                if (u.d[this.f] > 0 && u.d[this.f] < 100) {
                    this.b = 0;
                    this.a = u.e[this.f];
                    u.c = w.a(u.g[this.f], "\r\n", s.a - 20);
                }
                switch (u.d[this.f]) {
                    case -1: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 7: 
                    case 8: 
                    case 9: 
                    case 10: {
                        u.b(u.d[this.f]);
                        break block2;
                    }
                    case 101: {
                        switch (u.a) {
                            case 4: 
                            case 5: {
                                u.b(u.d[this.f]);
                            }
                        }
                    }
                }
                return;
            }
            case 4: {
                return;
            }
            case 5: {
                if (bc.a != 6) break;
                if (u.d[this.f] > 0 && u.d[this.f] < 100) {
                    u.b = 0;
                    n.a(2);
                    return;
                }
                if (u.d[this.f] > 101) {
                    u.b = 1;
                    return;
                }
                if (u.d[this.f] != 101) break;
                if (u.a == 0 || u.a == 1 || u.a == 2 || u.a == 3) {
                    u.b = (byte)8;
                    return;
                }
                if (u.a == 4) {
                    u.b = (byte)9;
                    return;
                }
                if (u.a != 5) break;
                u.b = (byte)7;
            }
        }
    }

    private static void b(Graphics graphics) {
        int n2 = 0;
        if (GameMIDlet.self.phonemodel.equals("V8")) {
            n2 = 6;
        }
        graphics.setColor(13290434);
        graphics.fillRoundRect(0, 0, (int)s.a, n2 += 19, 8, 8);
        graphics.setColor(0);
        graphics.drawRoundRect(0, 0, (int)s.a, n2, 8, 8);
        graphics.setColor(13290434);
        graphics.fillRoundRect(0, n2 + 2, (int)s.a, s.b - n2, 8, 8);
        graphics.setColor(0);
        graphics.drawRoundRect(0, n2 + 2, (int)s.a, s.b - n2, 8, 8);
    }

    private void a(Graphics graphics, int n2, int n3, String string, String[] stringArray, String[] stringArray2, int n4) {
        graphics.setColor(0);
        graphics.drawString(string, 8, 4, 20);
        int n5 = this.r = (s.b - this.k - this.n - this.l - this.m) / (this.v + 5);
        this.u = this.k + this.l + (s.b - this.k - this.n - this.l - this.m) / 2 - n5 / 2 * this.v;
        int n6 = this.t;
        int n7 = this.u;
        int n8 = this.v;
        int n9 = 0;
        for (int i = n2; i < n4; ++i) {
            n9 = b[this.f][i] - 1;
            if (d[this.f].equals("\u88c5\u5907\u670d\u52a1")) {
                graphics.drawImage(z.a[n9], 8, n7 - 2, 20);
            } else {
                graphics.drawImage(s.a[n9], 8, n7 - 2, 20);
            }
            if (i != n3) {
                graphics.drawString(stringArray[n9], n6, n7 - 2, 20);
            } else {
                if (stringArray[n9] == null) {
                    System.out.println("asList[curItem]=null");
                }
                w.a(graphics, stringArray[n9], n6 - 2, n7 + 1 - 2, 0, 0xFFFFFF, 20);
                graphics.drawRegion(this.c, 0, 0, 11, 7, 6, s.a - 20, n7, 24);
                graphics.drawRegion(this.c, 0, 0, 11, 7, 5, s.a - 10, n7, 20);
                if (d[this.f].equals("\u88c5\u5907\u670d\u52a1")) {
                    w.a(graphics, (int)h, s.a - 10, n7 + 2, this.b, 6, 7, 24);
                } else if (d[this.f].equals("\u7834\u89e3\u9053\u5177[\u91d1\u5e01]")) {
                    w.a(graphics, (int)g, s.a - 10, n7 + 2, this.b, 6, 7, 24);
                } else {
                    w.a(graphics, (int)a[this.f][n3], s.a - 10, n7 + 2, this.b, 6, 7, 24);
                }
            }
            n7 += n8;
            if (i - n2 >= n5) break;
        }
        if (n2 != 0) {
            graphics.drawRegion(this.c, 0, 0, 11, 7, 0, s.a / 2, 30 - this.s, 20);
        }
        if (n2 / (n5 + 1) != (n4 - 1) / (n5 + 1)) {
            graphics.drawRegion(this.c, 0, 0, 11, 7, 3, s.a / 2, s.b - 38 - this.s, 20);
        }
        ah.a(graphics, 0, s.b - w.a.getHeight() - 8);
        n9 = b[this.f][n3] - 1;
        this.w = a[this.f][n3];
        if (d[this.f].equals("\u7834\u89e3\u9053\u5177[\u91d1\u5e01]")) {
            this.w = a[this.f][n3] * g;
        }
        String string2 = stringArray[n9] + "[\u4ef7\u683c\uff1a" + this.w + "\u91d1\u5e01] " + stringArray2[n9];
        u.a(graphics, string2, s.b - w.a.getHeight() - 4);
    }

    private void a(Graphics graphics, String string, String[] stringArray, String[] stringArray2) {
        graphics.setColor(0);
        graphics.drawString(string, 8, 4, 20);
        x = this.r = (s.b - this.k - this.n - this.l - this.m) / (this.v + 5);
        for (int i = 0; i < x; ++i) {
            if (stringArray == null || y + i >= stringArray.length) continue;
            if (i == z) {
                w.a(graphics, stringArray[y + i], this.A - 2, this.B + i * this.C, 0, 0xFFFFFF, 20);
                if (this.a == null) continue;
                if (GameMIDlet.self.cutImg) {
                    graphics.drawImage(this.a, this.A - 24 - this.s, this.B + 5 + i * this.C, 17);
                    continue;
                }
                graphics.drawRegion(this.a, 0, 0, this.a.getWidth(), this.a.getHeight(), 0, this.A - 24 - this.s, this.B + 5 + i * this.C, 17);
                continue;
            }
            graphics.setColor(0);
            graphics.drawString(stringArray[y + i], this.A, this.B + i * this.C, 20);
        }
        if (y > 0) {
            graphics.drawRegion(this.c, 0, 0, 11, 7, 0, s.a / 2, 30 - this.s, 20);
        }
        if (y + x < stringArray.length) {
            graphics.drawRegion(this.c, 0, 0, 11, 7, 3, s.a / 2, s.b - 38 - this.s, 20);
        }
        ah.a(graphics, 0, s.b - w.a.getHeight() - 8);
        String string2 = stringArray2[y + z];
        if (stringArray[y + z].equals("\u88c5\u5907\u7b49\u7ea7\u4e0a\u9650") && z.b) {
            string2 = string2 + "(\u88c5\u5907\u7b49\u7ea7\u4e0a\u9650\u5df2\u5f00\u653e)";
        }
        u.a(graphics, string2, s.b - w.a.getHeight() - 4);
    }

    private void a(Graphics graphics, String string, z[] zArray) {
        graphics.setColor(0);
        graphics.drawString(string, 8, 4, 20);
        if (zArray == null) {
            return;
        }
        x = this.r = (s.b - this.k - this.n - this.l - this.m) / (this.v + 5);
        for (int i = 0; i < x; ++i) {
            if (zArray == null || d + i >= zArray.length) continue;
            if (d[this.f].equals("\u88c5\u5907\u670d\u52a1")) {
                graphics.drawImage(z.a[this.a[u.d + i].a - 1], 8, this.B + i * this.C, 20);
            } else {
                graphics.drawImage(s.a[this.a[u.d + i].a - 1], 8, this.B + i * this.C, 20);
            }
            if (i == e) {
                w.a(graphics, z.b[this.a[u.d + i].a - 1], this.A - 2, this.B + i * this.C, 0, 0xFFFFFF, 20);
                continue;
            }
            graphics.setColor(0);
            graphics.drawString(z.b[this.a[u.d + i].a - 1], this.A, this.B + i * this.C, 20);
        }
        if (d > 0) {
            graphics.drawRegion(this.c, 0, 0, 11, 7, 0, s.a / 2, 30 - this.s, 20);
        }
        if (d + x < zArray.length) {
            graphics.drawRegion(this.c, 0, 0, 11, 7, 3, s.a / 2, s.b - 38 - this.s, 20);
        }
        ah.a(graphics, 0, s.b - w.a.getHeight() - 8);
        if (e) {
            this.l = z.a(this.a[d + e]);
            this.e = this.l[0] + " " + this.l[1];
            if (z.b) {
                this.e = this.e + "<\u88c5\u5907\u7684\u5347\u7ea7\u4e0a\u9650\u5df2\u5f00\u653e>";
            }
            if (this.a[u.d + u.e].b >= z.c) {
                this.e = this.e + "(\u5347\u7ea7\u6b21\u6570\u5df2\u6ee1)";
                this.e = this.a[u.d + u.e].b < 10 ? this.e + "[\u53cb\u60c5\u63d0\u793a\uff1a\u5230\u201d\u8d34\u5fc3\u670d\u52a1\u201c\u5f00\u901a\u88c5\u5907\u7684\u5347\u7ea7\u4e0a\u9650\u53ef\u4ee5\u7ee7\u7eed\u5347\u7ea7\uff01]" : this.e + "[\u53cb\u60c5\u63d0\u793a\uff1a\u88c5\u5907\u5df2\u5230\u9876\u7ea7\uff0c\u4e0d\u80fd\u518d\u5347\u7ea7\uff01]";
            }
            e = false;
        }
        u.a(graphics, this.e, s.b - w.a.getHeight() - 4);
    }

    private static void d() {
        D = s.a + 1 * w.a.getHeight();
        E = 2;
    }

    private static void a(Graphics graphics, String string, int n2) {
        Font font = Font.getFont((int)0, (int)0, (int)8);
        graphics.drawString(string, D, n2, 20);
        if ((D -= E) < -font.getHeight() * string.length()) {
            D = s.a;
        }
    }

    public static void b(int n2) {
        if (!bc.a) {
            bc bc2 = new bc();
            bc.a = n2;
            System.out.println("\u77ed\u4fe1\u52a8\u4f5c aAct=" + n2);
            int n3 = -1;
            switch (n2) {
                case 4: {
                    n3 = 0;
                    break;
                }
                case 7: {
                    n3 = 1;
                    break;
                }
                case 1: {
                    n3 = 2;
                    break;
                }
                case 2: {
                    n3 = 3;
                    break;
                }
                case 8: {
                    n3 = 4;
                    break;
                }
                case 3: {
                    n3 = 5;
                    break;
                }
                case 10: {
                    n3 = 6;
                    break;
                }
                case 101: {
                    if (a == 4) {
                        n3 = 7;
                        break;
                    }
                    if (a != 5) break;
                    n3 = 8;
                    break;
                }
                case -1: {
                    n3 = 9;
                }
            }
            System.out.println("\u77ed\u4fe1\u5e8f\u53f7 cmdOrder=" + n3);
            if (n3 >= 0) {
                System.out.println("\u53d1\u9001\u77ed\u4fe1");
                bc2.a(n3);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void c(int n2) {
        block21: {
            block22: {
                block20: {
                    if (d[this.f] > 101) {
                        this.b = b[this.f][this.i];
                        this.a = a[this.f][this.i];
                        this.j = a[this.f][this.i];
                        System.out.println("1--sms_iCurGoodsID=" + this.b + " sms_iCurGoodsCount=" + this.a);
                        c = w.a(c[this.f][this.i], "\r\n", s.a - 20);
                    } else if (d[this.f] == 101 && (a == 0 || a == 1 || a == 2 || a == 3)) {
                        this.b = b[this.f][this.i];
                        this.a = h;
                        this.j = a[this.f][this.i];
                        System.out.println("2--sms_iCurGoodsID=" + this.b + " sms_iCurGoodsCount=" + this.a);
                        c = w.a(d, "\r\n", s.a - 20);
                    }
                    if (n2 != 102) break block20;
                    if (ba.a.a != null) {
                        this.j = this.w;
                        if (s.a < this.j) {
                            c = 0;
                            a = (short)20;
                            a.delete(0, a.length());
                            a.append("\u60a8\u7684\u91d1\u5e01\u4e0d\u8db3\uff01");
                            b = (byte)6;
                            return;
                        }
                        n2 = ba.a.a.b;
                        System.out.println("\u52a0\u5165\u9053\u5177ID\uff1a" + n2 + " \u6570\u91cf\uff1a" + g);
                        s.a(n2, (int)g);
                        if ((s.a -= this.j) < 0) {
                            s.a = 0;
                        }
                    }
                    break block21;
                }
                if (n2 != 103) break block22;
                if (ba.a.a != null) {
                    if (s.a < this.j) {
                        c = 0;
                        a = (short)20;
                        a.delete(0, a.length());
                        a.append("\u60a8\u7684\u91d1\u5e01\u4e0d\u8db3\uff01");
                        b = (byte)6;
                        return;
                    }
                    n2 = ba.a.a.b;
                    System.out.println("\u52a0\u5165\u79d8\u7c4dID\uff1a" + n2 + " \u6570\u91cf\uff1a" + ba.a.a.a);
                    s.a(n2, ba.a.a.a);
                    if ((s.a -= this.j) < 0) {
                        s.a = 0;
                    }
                }
                break block21;
            }
            if (n2 == 101 && ba.a.a != null) {
                int n3;
                if (s.a < this.j) {
                    c = 0;
                    a = (short)20;
                    a.delete(0, a.length());
                    a.append("\u60a8\u7684\u91d1\u5e01\u4e0d\u8db3\uff01");
                    b = (byte)6;
                    return;
                }
                n2 = ba.a.a.b;
                int n4 = ba.a.a.a;
                System.out.println("\u52a0\u5165\u88c5\u5907ID\uff1a" + n2 + " \u6570\u91cf\uff1a" + n4);
                int n5 = a;
                if (n5 == 0) {
                    n3 = z.a(1, 100);
                    System.out.println("SmsBoard-----RandInt=" + n3);
                    if (n3 <= c[0]) {
                        n5 = 1;
                    } else if (n3 <= c[0] + c[1]) {
                        n5 = 2;
                    } else if (n3 <= c[0] + c[1] + c[2]) {
                        n5 = 3;
                    } else {
                        n5 = -1;
                        System.out.println("sms err equipRank=" + -1);
                    }
                }
                for (n3 = 0; n3 < n4; ++n3) {
                    s.e(n2, n5);
                }
                if ((s.a -= this.j) < 0) {
                    s.a = 0;
                }
            }
        }
        b = (byte)5;
        a = (short)80;
        c = 0;
        c = w.a("\u7834\u89e3\u6210\u529f\uff01", "\r\n", s.a - 20);
    }

    private void e() {
        int n2;
        this.a = null;
        if (s.a[3] != null) {
            for (n2 = 0; n2 < s.a[3].length; ++n2) {
                s.a[3][n2].d = (byte)3;
                this.a = w.a(this.a, s.a[3][n2]);
            }
        }
        if (s.a[4] != null) {
            for (n2 = 0; n2 < s.a[4].length; ++n2) {
                s.a[4][n2].d = (byte)4;
                this.a = w.a(this.a, s.a[4][n2]);
            }
        }
        if (s.a[5] != null) {
            for (n2 = 0; n2 < s.a[5].length; ++n2) {
                s.a[5][n2].d = (byte)5;
                this.a = w.a(this.a, s.a[5][n2]);
            }
        }
        if (s.a[7] != null) {
            for (n2 = 0; n2 < s.a[7].length; ++n2) {
                s.a[7][n2].d = (byte)7;
                this.a = w.a(this.a, s.a[7][n2]);
            }
        }
        if (s.a[0] != null) {
            for (n2 = 0; n2 < s.a[0].length; ++n2) {
                s.a[0][n2].d = 0;
                this.a = w.a(this.a, s.a[0][n2]);
            }
        }
        if (s.a[1] != null) {
            for (n2 = 0; n2 < s.a[1].length; ++n2) {
                s.a[1][n2].d = 1;
                this.a = w.a(this.a, s.a[1][n2]);
            }
        }
        if (s.a[2] != null) {
            for (n2 = 0; n2 < s.a[2].length; ++n2) {
                s.a[2][n2].d = (byte)2;
                this.a = w.a(this.a, s.a[2][n2]);
            }
        }
        if (s.a[6] != null) {
            for (n2 = 0; n2 < s.a[6].length; ++n2) {
                s.a[6][n2].d = (byte)6;
                this.a = w.a(this.a, s.a[6][n2]);
            }
        }
    }

    public static void a() {
        RecordStore recordStore = null;
        Object object = null;
        DataOutputStream dataOutputStream = null;
        try {
            recordStore = RecordStore.openRecordStore((String)f, (boolean)true);
            recordStore.closeRecordStore();
            RecordStore.deleteRecordStore((String)f);
            recordStore = RecordStore.openRecordStore((String)f, (boolean)true);
        }
        catch (RecordStoreFullException recordStoreFullException) {
            object = recordStoreFullException;
            recordStoreFullException.printStackTrace();
        }
        catch (RecordStoreNotFoundException recordStoreNotFoundException) {
            object = recordStoreNotFoundException;
            recordStoreNotFoundException.printStackTrace();
        }
        catch (RecordStoreException recordStoreException) {
            object = recordStoreException;
            recordStoreException.printStackTrace();
        }
        object = new ByteArrayOutputStream();
        dataOutputStream = new DataOutputStream((OutputStream)object);
        try {
            dataOutputStream.writeBoolean(c);
            dataOutputStream.writeShort(b);
            dataOutputStream.writeShort(c);
            dataOutputStream.writeShort(d);
            dataOutputStream.writeShort(e);
            dataOutputStream.writeShort(f);
            dataOutputStream.writeShort(g);
            dataOutputStream.writeShort(h);
            dataOutputStream.writeBoolean(g);
            dataOutputStream.writeBoolean(f);
            dataOutputStream.writeBoolean(b);
            object = ((ByteArrayOutputStream)object).toByteArray();
            recordStore.addRecord((byte[])object, 0, ((Object)object).length);
            recordStore.closeRecordStore();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
        catch (RecordStoreNotOpenException recordStoreNotOpenException) {
            object = recordStoreNotOpenException;
            recordStoreNotOpenException.printStackTrace();
            return;
        }
        catch (RecordStoreFullException recordStoreFullException) {
            object = recordStoreFullException;
            recordStoreFullException.printStackTrace();
            return;
        }
        catch (RecordStoreException recordStoreException) {
            object = recordStoreException;
            recordStoreException.printStackTrace();
            return;
        }
    }

    public static void b() {
        Throwable throwable;
        RecordStore recordStore = null;
        Object object = null;
        object = null;
        object = null;
        f = true;
        c = false;
        b = 1;
        c = 0;
        d = 1;
        e = 0;
        g = false;
        f = 1;
        g = 0;
        h = 0;
        b = false;
        try {
            recordStore = RecordStore.openRecordStore((String)f, (boolean)false);
            throwable = recordStore.enumerateRecords(null, null, false);
            if (throwable.hasNextElement()) {
                int n2 = throwable.nextRecordId();
                object = recordStore.getRecord(n2);
            }
        }
        catch (RecordStoreFullException recordStoreFullException) {
            throwable = recordStoreFullException;
            recordStoreFullException.printStackTrace();
        }
        catch (RecordStoreNotFoundException recordStoreNotFoundException) {
            throwable = recordStoreNotFoundException;
            recordStoreNotFoundException.printStackTrace();
        }
        catch (RecordStoreException recordStoreException) {
            throwable = recordStoreException;
            recordStoreException.printStackTrace();
        }
        if (object != null) {
            object = new ByteArrayInputStream((byte[])object);
            object = new DataInputStream((InputStream)object);
            try {
                c = ((DataInputStream)object).readBoolean();
                b = ((DataInputStream)object).readShort();
                c = ((DataInputStream)object).readShort();
                d = ((DataInputStream)object).readShort();
                e = ((DataInputStream)object).readShort();
                f = ((DataInputStream)object).readShort();
                g = ((DataInputStream)object).readShort();
                h = ((DataInputStream)object).readShort();
                g = ((DataInputStream)object).readBoolean();
                f = ((DataInputStream)object).readBoolean();
                b = ((DataInputStream)object).readBoolean();
                recordStore.closeRecordStore();
                return;
            }
            catch (IOException iOException) {
                throwable = iOException;
                iOException.printStackTrace();
                return;
            }
            catch (RecordStoreNotOpenException recordStoreNotOpenException) {
                throwable = recordStoreNotOpenException;
                recordStoreNotOpenException.printStackTrace();
                return;
            }
            catch (RecordStoreFullException recordStoreFullException) {
                throwable = recordStoreFullException;
                recordStoreFullException.printStackTrace();
                return;
            }
            catch (RecordStoreException recordStoreException) {
                throwable = recordStoreException;
                recordStoreException.printStackTrace();
            }
        }
    }

    static {
        b = 0;
        a = new StringBuffer("");
        g = 1;
        h = 1;
        a = (short)20;
        x = 8;
        y = 0;
        z = 0;
        d = 0;
        e = 0;
        e = true;
        f = "yitiantulongSms";
        b = false;
        f = true;
        g = false;
        c = false;
        c = 0;
        d = 1;
        e = (byte)2;
        f = 10;
        g = 10 + 40;
    }
}
