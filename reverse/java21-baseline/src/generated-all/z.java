/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.util.Random;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class z {
    public short a;
    public boolean a;
    public byte a;
    public byte b;
    public static byte c = (byte)5;
    public byte d;
    public static boolean b;
    public short b;
    public short c;
    public short d;
    public short e;
    public short f;
    public short g;
    public short h;
    public short i;
    public short j;
    public short k;
    public short l;
    public short m;
    public short n;
    public short o;
    public short p;
    public short q;
    public short r;
    public short s;
    public short t;
    public short u;
    public short v;
    public byte e;
    public int a = true;
    public static String[] a;
    public static Image[] a;
    private static byte[] c;
    private static short[][] b;
    private static byte[] d;
    private static byte[] e;
    private static short[][] c;
    private static short[][] d;
    public static String[] b;
    public static byte[] a;
    public static byte[] b;
    public static String[] c;
    public static short[][] a;
    public static short[] a;
    public static short[] b;
    private static Random a;

    public z() {
        this.a = 0xFFFFFF;
        this.a = 0;
        this.b = 0;
    }

    public z(int n, int n2) {
        if (c == null) {
            String string = w.a("/txt/equip.txt");
            c = w.a(string, "equippro:", "end", "=");
        }
        z.a();
        this.a = (byte)n;
        if (n2 <= 0) {
            int n3 = z.a(1, 100);
            if (n3 <= c[0]) {
                this.e = 1;
            } else if (n3 <= c[0] + c[1]) {
                this.e = (byte)2;
            } else if (n3 <= c[0] + c[1] + c[2]) {
                this.e = (byte)3;
            } else {
                this.e = (byte)-1;
                System.out.println("Equip err rank=" + n2);
            }
        } else {
            this.e = (byte)n2;
        }
        z.c();
        switch (this.e) {
            case 1: {
                this.a = 0xFFFFFF;
                break;
            }
            case 2: {
                this.a = 255;
                break;
            }
            case 3: {
                this.a = 65280;
                break;
            }
            default: {
                System.out.println("createEquip err");
                return;
            }
        }
        n = 100;
        switch (this.e) {
            case 1: {
                n = (short)z.a(100, 21);
                this.b = (short)(a[this.a - 1][1] * n / 100);
                break;
            }
            case 2: {
                n = (short)z.a(140, 21);
                this.b = (short)(a[this.a - 1][1] * n / 100);
                break;
            }
            case 3: {
                n = (short)z.a(180, 21);
                this.b = (short)(a[this.a - 1][1] * n / 100);
            }
        }
        switch (b[this.a - 1][0]) {
            case 0: {
                System.out.println("no specialField");
                break;
            }
            case 1: {
                n = (short)(b[this.a - 1][1] * n / 100);
                n2 = (short)z.a(0, n);
                n = (short)(n - n2);
                this.k = (short)n2;
                this.l = (short)n;
                break;
            }
            case 2: {
                this.l = (short)(b[this.a - 1][1] * n / 100);
                break;
            }
            case 3: {
                this.k = (short)(b[this.a - 1][1] * n / 100);
                break;
            }
            case 4: {
                this.m = (short)(b[this.a - 1][1] * n / 100);
                break;
            }
            case 5: {
                this.n = (short)(b[this.a - 1][1] * n / 100);
                break;
            }
            case 6: {
                this.h = (short)(b[this.a - 1][1] * n / 100);
                break;
            }
            case 7: {
                this.g = (short)(b[this.a - 1][1] * n / 100);
                break;
            }
            case 8: {
                this.i = (short)(b[this.a - 1][1] * n / 100);
                break;
            }
            case 9: {
                this.j = (short)(b[this.a - 1][1] * n / 100);
                break;
            }
            default: {
                System.out.println("createEquip specialField logic err");
            }
        }
        block22 : switch (this.e) {
            case 1: {
                break;
            }
            case 2: {
                byte by = (byte)z.a(1, 4);
                n = by;
                switch (by) {
                    case 1: {
                        this.o = (short)(d[this.a - 1] + z.a(d[this.a - 1], z.a(1, 50), 100));
                        break;
                    }
                    case 2: {
                        this.p = (short)(d[this.a - 1] + z.a(d[this.a - 1], z.a(1, 50), 100));
                        break;
                    }
                    case 3: {
                        this.q = (short)(d[this.a - 1] + z.a(d[this.a - 1], z.a(1, 50), 100));
                        break;
                    }
                    case 4: {
                        this.r = (short)(d[this.a - 1] + z.a(d[this.a - 1], z.a(1, 50), 100));
                    }
                }
                break;
            }
            case 3: {
                byte by = (byte)z.a(1, 4);
                n = by;
                switch (by) {
                    case 1: {
                        this.o = (short)(this.o + (short)(d[this.a - 1] + z.a(d[this.a - 1], z.a(1, 50), 100)));
                        break;
                    }
                    case 2: {
                        this.p = (short)(this.p + (short)(d[this.a - 1] + z.a(d[this.a - 1], z.a(1, 50), 100)));
                        break;
                    }
                    case 3: {
                        this.q = (short)(this.q + (short)(d[this.a - 1] + z.a(d[this.a - 1], z.a(1, 50), 100)));
                        break;
                    }
                    case 4: {
                        this.r = (short)(this.r + (short)(d[this.a - 1] + z.a(d[this.a - 1], z.a(1, 50), 100)));
                    }
                }
                byte by2 = (byte)z.a(1, 4);
                n2 = by2;
                switch (by2) {
                    case 1: {
                        this.s = (short)(this.s + (short)(e[this.a - 1] + z.a(d[this.a - 1], z.a(1, 50), 100)));
                        break block22;
                    }
                    case 2: {
                        this.t = (short)(this.t + (short)(e[this.a - 1] + z.a(d[this.a - 1], z.a(1, 50), 100)));
                        break block22;
                    }
                    case 3: {
                        this.u = (short)(this.u + (short)(e[this.a - 1] + z.a(d[this.a - 1], z.a(1, 50), 100)));
                        break block22;
                    }
                    case 4: {
                        this.v = (short)(this.v + (short)(e[this.a - 1] + z.a(d[this.a - 1], z.a(1, 50), 100)));
                    }
                }
            }
        }
        this.a = 0;
        this.b = 0;
    }

    public static void a() {
        if (b == null) {
            String string = w.a("/txt/equip.txt");
            b = w.a(string, "equipName:", "end", "=", ",");
            a = w.a(string, "equipName:", "end", ",");
            b = w.a(string, "equipType:", "end", "=");
            c = w.a(string, "equipEffectNote:", "end", "=");
            a = w.a(string, "equipIcon:", "end", "=");
            a = w.a(string, "equipEffect:", "end", "=");
            a = w.a(string, "equipBuyPrice:", "end", "=");
            b = w.a(string, "equipSellPrice:", "end", "=");
        }
    }

    public static void b() {
        if (a == null) {
            z.a();
        }
        if (a == null) {
            byte by = (byte)a.length;
            a = new Image[by];
            for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
                z.a[by2] = w.a(a[by2]);
            }
        }
    }

    public static boolean a(g g2, z z2) {
        boolean bl = false;
        if (c == null || d == null) {
            String string = w.a("/txt/equip.txt");
            c = w.a(string, "equipUseNeed1:", "end", "=");
            d = w.a(string, "equipUseNeed2:", "end", "=");
        }
        boolean bl2 = z.a(g2, z2, c);
        boolean bl3 = z.a(g2, z2, d);
        if (bl2 && bl3) {
            bl = true;
        }
        return bl;
    }

    private static boolean a(g g2, z z2, short[][] sArray) {
        boolean bl = false;
        short s = sArray[z2.a - 1][0];
        short s2 = sArray[z2.a - 1][1];
        if (s == 0) {
            bl = true;
        } else if (s > 0) {
            switch (s) {
                case 1: {
                    if (g2.a[27] < s2) break;
                    bl = true;
                    break;
                }
                case 2: {
                    if (g2.a[28] < s2) break;
                    bl = true;
                    break;
                }
                case 3: {
                    if (g2.a[29] < s2) break;
                    bl = true;
                    break;
                }
                case 4: {
                    if (g2.a[30] < s2) break;
                    bl = true;
                    break;
                }
                default: {
                    bl = true;
                    System.out.println("checkEquipUse 0 err");
                }
            }
        }
        return bl;
    }

    private static void c() {
        String string = w.a("/txt/equip.txt");
        a = w.a(string, "equipEffect:", "end", "=");
        b = w.a(string, "SpecialField:", "end", "=");
        d = w.a(string, "equipAddField1:", "end", "=");
        e = w.a(string, "equipAddField2:", "end", "=");
    }

    public final int a() {
        return this.g + this.o + this.s;
    }

    public final int b() {
        return this.h + this.p + this.t;
    }

    public final int c() {
        return this.i + this.q + this.u;
    }

    public final int d() {
        return this.j + this.r + this.v;
    }

    public final int e() {
        if (a[this.a - 1][0] == 1) {
            return this.b + this.c + (this.g + this.o + this.s);
        }
        return this.g + this.o + this.s;
    }

    public final int f() {
        if (a[this.a - 1][0] == 2) {
            return this.b + this.d + (this.h + this.p + this.t << 1);
        }
        return this.h + this.p + this.t << 1;
    }

    public final int g() {
        return (this.i + this.q + this.u) * 5 + this.k + this.e;
    }

    public final int h() {
        return (this.j + this.r + this.v) * 5 + this.l + this.f;
    }

    public static short[] a(z z2, byte[] byArray) {
        int n;
        short[] sArray = new short[4];
        short s = (short)(byArray[0] / 10);
        sArray[1] = s;
        if (z2.b >= c) {
            sArray[0] = -2;
            sArray[2] = -1;
            sArray[3] = -1;
            return sArray;
        }
        int n2 = 0;
        if (z2 == null) {
            sArray[0] = -1;
            sArray[2] = -1;
            sArray[3] = -1;
            return sArray;
        }
        for (n2 = 0; n2 < 3; ++n2) {
            if (byArray[n2] != 0) continue;
            sArray[0] = -1;
            sArray[2] = -1;
            sArray[3] = -1;
            return sArray;
        }
        n2 = (byte)(byArray[0] % 10);
        byte by = (byte)(byArray[1] % 10);
        byte by2 = (byte)(byArray[2] % 10);
        byte by3 = (byte)(n2 + by + by2);
        byte by4 = 0;
        for (n = 0; n < 3; ++n) {
            if (by4 < byArray[n]) {
                by4 = byArray[n];
            }
            if (0 <= byArray[n]) continue;
            by4 = byArray[n];
        }
        by4 = (byte)(by4 % 10);
        n2 = (byte)((n2 + by + by2) / 3);
        n = z.a(1, 10);
        if (n <= n2) {
            byArray[0] = 0;
            byArray[1] = 0;
            byArray[2] = 0;
            z2.a = (byte)(z2.a + 1);
            z2.b = (byte)(z2.b + 1);
            switch (s) {
                case 0: {
                    short s2 = (short)(((by3 - by4) / 3 + z2.a) / 2);
                    z2.d = (short)(z2.d + s2);
                    sArray[2] = s2;
                    sArray[3] = 0;
                    break;
                }
                case 1: {
                    short s3 = (short)((by3 - by4) / 3 + z2.a << 1);
                    s = (short)z.a(0, s3 + 1);
                    z2.e = (short)(z2.e + s);
                    z2.f = (short)(z2.f + (s3 - s));
                    sArray[2] = s;
                    sArray[3] = (short)(s3 - s);
                    break;
                }
                case 2: {
                    short s4 = (short)((by3 - by4) / 3 + z2.a);
                    z2.c = (short)(z2.c + s4);
                    sArray[2] = s4;
                    sArray[3] = 0;
                }
            }
            sArray[0] = 1;
        } else {
            byArray[0] = 0;
            byArray[1] = 0;
            byArray[2] = 0;
            z2.b = (byte)(z2.b + 1);
            sArray[0] = 0;
        }
        return sArray;
    }

    public static void a(z z2) {
        int n = 0;
        switch (z2.d) {
            case 0: 
            case 1: 
            case 2: {
                n = 0;
                break;
            }
            case 3: 
            case 4: 
            case 5: 
            case 7: {
                n = 1;
                break;
            }
            case 6: {
                n = 2;
            }
        }
        int n2 = z.a(1, 10);
        if (n2 <= 16) {
            z2.a = (byte)(z2.a + 1);
            z2.b = (byte)(z2.b + 1);
            switch (n) {
                case 0: {
                    n = (short)(9 + z2.a);
                    z2.d = (short)(z2.d + n);
                    return;
                }
                default: {
                    n = (short)(9 + z2.a << 1);
                    n2 = (short)z.a(0, n + 1);
                    z2.e = (short)(z2.e + n2);
                    z2.f = (short)(z2.f + (n - n2));
                    return;
                }
                case 2: 
            }
            n = (short)((9 + z2.a) / 2);
            z2.c = (short)(z2.c + n);
        }
    }

    public static String[] a(z z2) {
        z.c();
        String[] stringArray = new String[2];
        StringBuffer stringBuffer = new StringBuffer();
        switch (z2.e) {
            case 2: {
                stringBuffer.append("[\u6781\u54c1]");
                break;
            }
            case 3: {
                stringBuffer.append("[\u5b8c\u7f8e]");
            }
        }
        stringBuffer.append(b[z2.a - 1]);
        stringArray[0] = stringBuffer.toString();
        stringBuffer = new StringBuffer();
        if (z2.b != 0) {
            stringBuffer.append("[+" + z2.b + "]");
        }
        if (z2.a > 0) {
            stringBuffer.append(" " + z2.a + "\u7ea7");
        }
        switch (a[z2.a - 1][0]) {
            case 0: {
                break;
            }
            case 1: {
                stringBuffer.append(" \u653b\u51fb+" + (z2.b + z2.c));
                break;
            }
            case 2: {
                stringBuffer.append(" \u9632\u5fa1+" + (z2.b + z2.d));
            }
        }
        if (z2.g > 0) {
            stringBuffer.append(" \u529b\u91cf+" + z2.g);
        }
        if (z2.h > 0) {
            stringBuffer.append(" \u654f\u6377+" + z2.h);
        }
        if (z2.i > 0) {
            stringBuffer.append(" \u4f53\u529b+" + z2.i);
        }
        if (z2.j > 0) {
            stringBuffer.append(" \u667a\u529b+" + z2.j);
        }
        if (z2.k + z2.e > 0) {
            stringBuffer.append(" \u751f\u547d+" + (z2.k + z2.e));
        }
        if (z2.l + z2.f > 0) {
            stringBuffer.append(" \u5185\u529b+" + (z2.l + z2.f));
        }
        if (z2.m > 0) {
            stringBuffer.append(" \u901f\u5ea6+" + z2.m);
        }
        if (z2.n > 0) {
            stringBuffer.append(" \u8eb2\u907f+" + z2.n);
        }
        if (z2.e == 2 || z2.e == 3) {
            if (z2.o > 0) {
                stringBuffer.append(" \u529b\u91cf+" + z2.o);
            }
            if (z2.p > 0) {
                stringBuffer.append(" \u654f\u6377+" + z2.p);
            }
            if (z2.q > 0) {
                stringBuffer.append(" \u4f53\u529b+" + z2.q);
            }
            if (z2.r > 0) {
                stringBuffer.append(" \u667a\u529b+" + z2.r);
            }
        }
        if (z2.e == 3) {
            if (z2.s > 0) {
                stringBuffer.append(" \u529b\u91cf+" + z2.s);
            }
            if (z2.t > 0) {
                stringBuffer.append(" \u654f\u6377+" + z2.t);
            }
            if (z2.u > 0) {
                stringBuffer.append(" \u4f53\u529b+" + z2.u);
            }
            if (z2.v > 0) {
                stringBuffer.append(" \u667a\u529b+" + z2.v);
            }
        }
        if (c == null || d == null) {
            String string = w.a("/txt/equip.txt");
            c = w.a(string, "equipUseNeed1:", "end", "=");
            d = w.a(string, "equipUseNeed2:", "end", "=");
        }
        short s = c[z2.a - 1][0];
        short s2 = c[z2.a - 1][1];
        if (s > 0) {
            stringBuffer.append(" \u88c5\u5907\u65f6\u9700\u8981");
            switch (s) {
                case 1: {
                    stringBuffer.append("\u529b\u91cf" + s2);
                    break;
                }
                case 2: {
                    stringBuffer.append("\u654f\u6377" + s2);
                    break;
                }
                case 3: {
                    stringBuffer.append("\u4f53\u529b" + s2);
                    break;
                }
                case 4: {
                    stringBuffer.append("\u667a\u529b" + s2);
                }
            }
        }
        s = d[z2.a - 1][0];
        short s3 = d[z2.a - 1][1];
        if (s > 0) {
            switch (s) {
                case 1: {
                    stringBuffer.append(" \u529b\u91cf" + s3);
                    break;
                }
                case 2: {
                    stringBuffer.append(" \u654f\u6377" + s3);
                    break;
                }
                case 3: {
                    stringBuffer.append(" \u4f53\u529b" + s3);
                    break;
                }
                case 4: {
                    stringBuffer.append(" \u667a\u529b" + s3);
                }
            }
        }
        stringArray[1] = stringBuffer.toString();
        return stringArray;
    }

    public static int a(int n, int n2) {
        if (a == null) {
            a = new Random();
        }
        return n += Math.abs(a.nextInt()) % n2;
    }

    private static int a(int n, int n2, int n3) {
        n *= n2;
        return n /= 100;
    }
}
