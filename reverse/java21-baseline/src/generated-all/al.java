/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class al {
    public byte a;
    boolean a;
    private byte n;
    private byte o;
    Image a;
    Image b;
    Image c;
    private short e;
    private short f;
    public byte b;
    public byte c;
    private static String[] c;
    private Image d;
    private Image e;
    private Image f;
    private Image g;
    private Image[] a;
    private short[][] c;
    private short[][] d;
    private short[][] e;
    private Image h;
    private Image i;
    private Image j;
    private Image k;
    private Image l;
    private Image[] b;
    private Image m;
    private Image n;
    private Image o;
    private Image[] c;
    private Image p;
    private short g;
    private Image[] d;
    private String[] d;
    public int[][] a;
    private String[] e;
    private byte[][] a;
    private short[][] f;
    private byte[][] b;
    private short[][] g;
    private byte[][] c;
    private short[][] h;
    private byte[][] d;
    private String[] f;
    private byte[][] e;
    private byte p;
    private boolean h;
    public byte d;
    private int a;
    private int[][] b;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private short h;
    private Timer a;
    private byte q;
    public String[] a;
    public short a;
    public String[] b;
    public byte e;
    private byte r;
    private byte s;
    private short[][] i;
    byte f;
    public byte[] a;
    public byte g;
    private short[] a;
    private short[] b;
    private byte t;
    private short[] c;
    private short[] d;
    public boolean b;
    public boolean c;
    public g[] a;
    public byte h;
    private String[] g;
    private byte[] h;
    private byte[] i;
    public byte[] b;
    public byte[] c;
    private short[][] j;
    private String[] h;
    public short[][] a;
    public byte i;
    private byte[] j;
    public byte j;
    public short[][] b;
    private byte u;
    private byte v;
    private short i;
    private short j;
    private short k;
    private short l;
    private short m;
    private short n;
    private short o;
    private short p;
    private short q;
    private byte[] k;
    public byte[] d;
    private byte[] l;
    private byte[][] f;
    private byte[][] g;
    private byte[][] h = false;
    private byte[] m;
    private Image q;
    private bd a;
    private boolean i;
    private boolean j;
    private boolean k;
    public boolean d;
    public byte k;
    public byte l;
    private short r;
    private short s;
    private int b;
    public short b;
    public short c;
    private Random a;
    private byte w;
    private Image r;
    private Image s;
    private Image t;
    private Image u;
    private Image v;
    private byte x = 0;
    private Image w;
    private short t = 0;
    private short u = 0;
    private short v = 0;
    private String b = 0;
    private String c;
    private boolean l;
    private byte y;
    private static byte z;
    private static byte A;
    public boolean e;
    boolean f = false;
    boolean g = false;
    String a = null;
    short d;
    private boolean m;
    private boolean n = false;
    public byte m = false;

    public al() {
        ((al)object).b = w.a("/sys/swordred.ps");
        ((al)object).c = w.a("/sys/legamelogo.png");
        ((al)object).e = s.a;
        ((al)object).f = s.b;
        ((al)object).c = new short[][]{{72, 136}, {89, 136}, {107, 136}, {89, 118}, {89, 154}};
        ((al)object).d = new short[][]{{103, 238}, {120, 238}, {138, 238}, {120, 220}, {120, 256}};
        ((al)object).e = new short[][]{{108, 238}, {125, 238}, {143, 238}, {125, 220}, {125, 256}};
        ((al)object).h = (short)48;
        ((al)object).k = (byte)2;
        ((al)object).l = (byte)2;
        ((al)object).r = (short)75;
        ((al)object).s = (short)82;
        ((al)object).c = (short)10;
        ((al)object).w = (byte)20;
        ((al)object).a = new Random();
        ((al)object).a.setSeed(System.currentTimeMillis());
        if (GameMIDlet.self.phonemodel.equals("V8")) {
            ((al)object).x = (byte)4;
        }
        t.m = false;
        n.a(0);
        Object object = w.a("/txt/smsItem.txt");
        String[] stringArray = w.a((String)object, "smsBuyInfo:", "end", "=");
        int[] nArray = w.a((String)object, "smsType:", "end", "=");
        object = nArray;
        int n2 = nArray.length;
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            if (object[i] != -1) continue;
            n3 = i;
        }
        c = w.a(stringArray[n3], s.a - 10);
    }

    public final boolean a() {
        return this.d != null || s.a != null;
    }

    public final void a() {
        new ai(this);
    }

    public final boolean b() {
        int n2;
        int n3;
        Object object;
        System.gc();
        try {
            Thread.sleep(300L);
        }
        catch (InterruptedException interruptedException) {
            object = interruptedException;
            interruptedException.printStackTrace();
        }
        this.n = 0;
        this.r = (short)(15 + (w.a.stringWidth("\u5b57") << 2) + 12 + 5);
        if (GameMIDlet.self.phonemodel.equals("KG77")) {
            this.r = (short)(15 + (w.a.stringWidth("\u5b57") << 2) + 12 - 2);
        }
        this.k = (byte)(s.a / this.r);
        this.s = (short)(15 + (w.a.stringWidth("\u5b57") << 2) + 27);
        this.l = (byte)(s.a / this.s);
        if (s.a == 240) {
            this.s = (short)(15 + (w.a.stringWidth("\u5b57") << 2) + 30);
            this.l = (byte)(s.a / this.s);
        }
        this.w = (byte)w.a.getHeight();
        if (this.w < 20) {
            this.w = (byte)20;
        }
        this.n = (byte)20;
        if (((ar)s.a[0]).r == 2) {
            object = "/battlemap/hai.map";
            this.e = w.a((String)object, "/battlemap/");
        } else if (s.c != null) {
            this.e = s.c.toLowerCase().endsWith(".png") || s.c.toLowerCase().endsWith(".ps") ? w.a(s.c) : w.a(s.c, "/battlemap/");
        }
        this.n = (byte)30;
        this.f = new byte[this.a.length];
        this.g = new byte[this.a.length];
        this.f = w.a("/battle/finger.ps");
        object = w.a("/txt/battlepos.txt");
        String string = w.a((String)object, "team:", "teamEnd");
        object = w.a((String)object, "enemy:", "enemyEnd");
        this.c = new short[this.a.length];
        this.d = new short[this.a.length];
        this.l = null;
        if (this.a.length == 1) {
            string = w.a(string, "amount1:", "amount1End");
            this.c[0] = w.a(string, "x");
            this.d[0] = w.a(string, "y");
            this.l = new byte[]{0};
        } else if (this.a.length == 2) {
            string = w.a(string, "amount2:", "amount2End");
            this.c = w.a(string, "x");
            this.d = w.a(string, "y");
            this.l = w.a(string, "drawOrder");
        } else if (this.a.length == 3) {
            string = w.a(string, "amount3:", "amount3End");
            this.c = w.a(string, "x");
            this.d = w.a(string, "y");
            this.l = w.a(string, "drawOrder");
        } else if (this.a.length == 4) {
            string = w.a(string, "amount4:", "amount4End");
            this.c = w.a(string, "x");
            this.d = w.a(string, "y");
            this.l = w.a(string, "drawOrder");
        }
        int n4 = 0;
        n4 = 0;
        if (this.d == null) {
            n4 = 21474836;
            n4 = Math.abs(this.a.nextInt()) / n4;
            this.f = n4 > 90 ? s.d : (n4 > 70 ? (s.d > 1 ? (byte)(s.d - 1) : s.d) : (n4 > 40 ? (s.d > 2 ? (byte)(s.d - 2) : s.d) : (byte)1));
        } else {
            this.f = (byte)this.d.length;
        }
        if (this.f == 1) {
            object = w.a((String)object, "amount1:", "amount1End");
            this.a = w.a((String)object, "x");
            this.b = w.a((String)object, "y");
        } else if (this.f == 2) {
            object = w.a((String)object, "amount2:", "amount2End");
            this.a = w.a((String)object, "x");
            this.b = w.a((String)object, "y");
        } else if (this.f == 3) {
            object = w.a((String)object, "amount3:", "amount3End");
            this.a = w.a((String)object, "x");
            this.b = w.a((String)object, "y");
        } else if (this.f == 4) {
            object = w.a((String)object, "amount4:", "amount4End");
            this.a = w.a((String)object, "x");
            this.b = w.a((String)object, "y");
        }
        object = w.a("/txt/enemy.txt");
        this.d = w.a((String)object, "enemyName:", "end", "=");
        this.a = new int[this.f][];
        this.e = new String[this.f];
        this.a = new byte[this.f][];
        this.f = new short[this.f][];
        this.b = new byte[this.f][];
        this.g = new short[this.f][];
        this.c = new byte[this.f][];
        this.h = new short[this.f][];
        this.d = new byte[this.f][];
        this.d = new Image[this.f];
        this.f = new String[this.f];
        this.e = new byte[this.f][];
        this.e = new byte[this.f];
        this.k = new byte[this.f];
        this.n = (byte)50;
        for (int k = 0; k < this.f; ++k) {
            n4 = 0;
            if (((ar)s.a[0]).r == 1) {
                if (this.d == null) {
                    n4 = Integer.MAX_VALUE / s.a.length;
                    n4 = Math.abs(this.a.nextInt()) / n4;
                    n4 = s.a[n4];
                } else {
                    n4 = this.d[k];
                }
            } else if (((ar)s.a[0]).r == 2) {
                n4 = 21474836;
                n4 = Math.abs(this.a.nextInt()) / n4;
                n4 = n4 <= 60 ? 11 : 9;
            }
            String string2 = w.a((String)object, "enemy" + n4 + ":", "enemy" + n4 + "End");
            if (string2 == null) {
                return false;
            }
            this.k[k] = n4;
            int[] nArray = w.a(string2, "data:", "dataEnd", "=");
            this.a[k] = new int[nArray.length + 9 + 3];
            System.arraycopy(nArray, 0, this.a[k], 0, nArray.length);
            this.a[k][9] = this.a[k][0];
            this.a[k][10] = this.a[k][2];
            this.a[k][11] = 1;
            this.a[k] = w.a(string2, "item");
            this.f[k] = w.a(string2, "itemrnd");
            this.b[k] = w.a(string2, "stuff");
            this.g[k] = w.a(string2, "stuffrnd");
            this.c[k] = w.a(string2, "equip");
            this.h[k] = w.a(string2, "equiprnd");
            this.d[k] = w.a(string2, "rankrnd");
            this.e[k] = w.a(string2, "skill:", "end", "=");
            this.e[k] = this.d[n4 - 1];
            this.f[k] = w.a(string2, "img");
            for (int i2 = 0; i2 < k; ++i2) {
                if (!this.f[k].equals(this.f[i2])) continue;
                this.d[k] = this.d[i2];
            }
            if (this.d[k] != null) continue;
            this.d[k] = w.a(this.f[k]);
        }
        this.n = (byte)70;
        if (this.g == null) {
            this.f();
        }
        String string3 = w.a("/txt/team.txt");
        for (n4 = 0; n4 < this.a.length; ++n4) {
            Object object2 = w.a(string3, "role" + this.a[n4].t + ":", "role" + this.a[n4].t + "end");
            if (this.a[n4].b != null) {
                this.a[n4].a = w.a(this.a[n4].b);
            }
            this.a[n4].c = w.a((String)object2, "battleAni");
            object = this.a[n4];
            this.a[n4].a = null;
            if (!((g)object).c.toLowerCase().endsWith(".png")) {
                String string4 = "/battle/role/";
                object2 = ((g)object).c;
                an an2 = null;
                boolean bl = false;
                for (int k = 0; i.a != null && k < i.a.length; ++k) {
                    if (!i.a[k].a.equals(object2)) continue;
                    an2 = i.a[k];
                    bl = true;
                    break;
                }
                if (!bl) {
                    an2 = new an();
                    an2.a((String)object2);
                    an2.b(string4);
                    if (GameMIDlet.self.cutSpLibImg) {
                        an2.a();
                    }
                    if (i.a == null) {
                        i.a = new an[1];
                    } else {
                        an[] anArray = new an[i.a.length + 1];
                        System.arraycopy(i.a, 0, anArray, 0, i.a.length);
                        i.a = anArray;
                    }
                    i.a[i.a.length - 1] = an2;
                }
                object2 = an2;
                ((g)object).a = new bd((an)object2);
            }
            Vector<Byte> vector = new Vector<Byte>();
            this.a[n4].c = null;
            object2 = new Vector();
            this.a[n4].a = null;
            for (int k = 0; this.a[n4].a != null && k < this.a[n4].a.length; ++k) {
                if (this.i[this.a[n4].a[k] - 1] != 1) continue;
                vector.addElement(new Byte(this.a[n4].a[k]));
                ((Vector)object2).addElement(this.a[n4].b[k]);
            }
            if (vector.size() <= 0) continue;
            this.a[n4].c = new byte[vector.size()];
            this.a[n4].a = new c[((Vector)object2).size()];
            Object[] objectArray = new Byte[vector.size()];
            vector.copyInto(objectArray);
            for (int k = 0; k < this.a[n4].c.length; ++k) {
                this.a[n4].c[k] = (Byte)objectArray[k];
                this.a[n4].a[k] = (c)((Vector)object2).elementAt(k);
            }
        }
        this.i = new short[this.f + this.a.length][2];
        for (n4 = 0; this.a != null && n4 < this.a.length; ++n4) {
            this.i[n4][0] = (short)n4;
            this.i[n4][1] = (short)this.a[n4].c();
        }
        n4 = this.a.length;
        for (n3 = 0; n3 < this.f; ++n3) {
            this.i[n4 + n3][0] = (short)(n3 + 10);
            this.i[n4 + n3][1] = (short)this.a[n3][6];
        }
        this.a(this.i);
        this.a = new byte[this.a.length];
        n3 = 0;
        for (n2 = 0; n2 < this.i.length; ++n2) {
            if (this.i[n2][0] >= 10) continue;
            this.a[n3] = (byte)this.i[n2][0];
            ++n3;
        }
        this.g = 0;
        this.h = this.a[this.g];
        if (this.a[this.h].a[3] <= 0) {
            for (n2 = 0; n2 < this.a.length; ++n2) {
                if (this.a[this.a[n2]].a[3] <= 0) continue;
                this.g = (byte)n2;
                this.h = this.a[this.g];
                break;
            }
        }
        this.n = (byte)90;
        this.g();
        this.b = false;
        this.c = false;
        this.g = (short)(w.a.getHeight() * 3 + 5);
        if (this.g < 64) {
            this.g = (short)64;
        }
        this.m = (short)4;
        this.n = (short)(s.b - 5 - this.g);
        this.o = (short)(s.a - 8);
        this.p = (short)(this.g - 7);
        this.q = 0;
        this.b = 1;
        if (GameMIDlet.self.playMusic && s.d != null && !s.d.equals("")) {
            if (ba.a.a == null) {
                ba.a.a = new v();
            }
            ba.a.a.a(s.d);
            ba.a.a.b(s.b);
            ba.a.a.a();
        }
        this.n = (byte)100;
        return true;
    }

    private void f() {
        String string = w.a("/txt/skill.txt");
        this.g = w.a(string, "skillName:", "end", "=");
        this.h = w.a(string, "skillFile:", "end", "=");
        this.b = w.a(string, "skillType:", "end", "=");
        this.i = w.a(string, "battleSkill:", "end", "=");
        this.c = w.a(string, "skillRange:", "end", "=");
        this.j = w.a(string, "skillDamage:", "end", "=");
        this.h = w.a(string, "skillNote:", "end", "=");
        this.a = w.a(string, "skillMP:", "end", "=");
        this.j = w.a(string, "skillDirection:", "end", "=");
    }

    private void g() {
        System.out.println("\u66f4\u65b0\u9053\u5177\u5217\u8868");
        s.e();
        Vector<short[]> vector = new Vector<short[]>();
        for (int k = 0; s.a != null && k < s.a.length; ++k) {
            if (s.i[s.a[k][0] - 1] != 1) continue;
            vector.addElement(s.a[k]);
        }
        if (vector.size() > 0) {
            this.b = new short[vector.size()][];
            vector.copyInto((Object[])this.b);
        } else {
            this.b = null;
        }
        if (this.b != null) {
            this.j = 0;
            if (this.j > this.b.length - 1) {
                this.j = (byte)(this.b.length - 1);
                return;
            }
        } else {
            this.j = 0;
        }
    }

    public final void b() {
        this.h = false;
        i.a = null;
        for (int k = 0; this.a != null && k < this.a.length; ++k) {
            this.a[k].a = null;
            this.a[k].c = null;
            this.a[k].o = 0;
            this.a[k].e = null;
            this.a[k].n = 0;
            this.a[k].m = 0;
        }
        if (this.a != null) {
            this.a.cancel();
            this.a = null;
        }
        System.gc();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(Graphics var1_1) {
        block85: {
            try {
                block86: {
                    block87: {
                        block88: {
                            if (this.a == 0) {
                                var1_1.setColor(0);
                                var1_1.setClip(0, 0, (int)ba.a.a, (int)ba.a.b);
                                var1_1.fillRect(0, 0, ba.a.getWidth(), ba.a.getHeight());
                                var1_1.setClip(0, 0, (int)s.a, (int)s.b);
                                var1_1.setColor(0xFFFFFF);
                                if (this.a != null) {
                                    var1_1.drawImage(this.a, s.a / 2, s.b / 2, 3);
                                }
                                if (this.b != null) {
                                    var1_1.setClip(s.a / 2 - this.b.getWidth() / 2, s.b / 2 - this.b.getHeight() / 2, this.b.getWidth() * this.o / 100, this.b.getHeight());
                                    var1_1.drawImage(this.b, s.a / 2, s.b / 2, 3);
                                    var1_1.setClip(0, 0, (int)s.a, (int)s.b);
                                }
                                if (this.c != null) {
                                    var1_1.drawImage(this.c, s.a - 2, s.b - 2, 40);
                                }
                                if (this.o < this.n) {
                                    this.o = (byte)(this.o + 10);
                                    if (this.o > this.n) {
                                        this.o = this.n;
                                    }
                                }
                                if (this.a && this.o >= 100) {
                                    this.n = 0;
                                    this.o = 0;
                                    this.b = null;
                                    this.a = null;
                                    this.c = null;
                                    this.a = 1;
                                    this.h = true;
                                }
                                try {
                                    Thread.sleep(30L);
                                }
                                catch (InterruptedException v0) {
                                    var2_2 = v0;
                                    v0.printStackTrace();
                                }
                                break block85;
                            }
                            if (!this.h) {
                                return;
                            }
                            var3_12 /* !! */  = var1_1;
                            var2_3 = this;
                            if (s.a == 240) {
                                if (GameMIDlet.self.phonemodel.equals("D608")) {
                                    var2_3.v = (short)5;
                                }
                                var2_3.t = (short)(s.b - 85 - var2_3.v);
                                var2_3.u = (short)(85 + var2_3.v);
                            } else {
                                if (GameMIDlet.self.phonemodel.equals("KG77")) {
                                    var2_3.v = (short)5;
                                }
                                var2_3.t = (short)(135 - var2_3.v);
                                var2_3.u = (short)(s.b - 135 + var2_3.v);
                                if (GameMIDlet.self.phonemodel.equals("KG77")) {
                                    var2_3.v = 0;
                                }
                            }
                            if (var2_3.w == null) {
                                var2_3.w = Image.createImage((int)s.a, (int)s.b);
                                var4_13 = var2_3.w.getGraphics();
                                var4_13.setColor(0);
                                var6_22 = var4_13;
                                var5_24 = var2_3;
                                if (var5_24.e != null) {
                                    var6_22.drawImage(var5_24.e, 0, 0, 20);
                                }
                                var4_14 = 3;
                                var7_33 = var2_3.u;
                                var4_14 = var2_3.t;
                                var6_22 = var4_13;
                                var5_24 = var2_3;
                                var9_34 = 3;
                                var8_35 = var5_24;
                                if (var5_24.r == null) {
                                    var8_35.r = w.a("/sys/new/weaponBack.png");
                                }
                                var8_35.s = var9_34 == 3 ? w.a("/sys/new/sysBorder/simple.png") : w.a("/sys/new/sysBorder/beauty.png");
                                var8_35.t = w.a("/sys/new/sysBorder/th.png");
                                if (var8_35.t == null) {
                                    var8_35.t = w.a("/sys/new/sysBorder/th.png");
                                }
                                if (var8_35.u == null) {
                                    var8_35.u = w.a("/sys/new/sysBorder/lbc.png");
                                }
                                if (var8_35.v == null) {
                                    var8_35.v = w.a("/sys/new/sysBorder/lv.png");
                                }
                                var6_22.setColor(12760193);
                                var6_22.setClip(0, 0, (int)s.a, (int)s.b);
                                var6_22.fillRect(0, var4_14, (int)s.a, s.b - var4_14);
                                var6_22.drawImage(var5_24.r, 7, var4_14 + 7, 20);
                                var6_22.drawRegion(var5_24.r, 0, 0, var5_24.r.getWidth(), var5_24.r.getHeight(), 2, s.a - 7, var4_14 + 7, 24);
                                var8_36 = (byte)(s.a / 5);
                                for (var9_34 = 0; var9_34 < var8_36; var9_34 = (byte)(var9_34 + 1)) {
                                    var6_22.drawImage(var5_24.t, 0 + var9_34 * 5, var4_14, 20);
                                    var6_22.drawRegion(var5_24.t, 0, 0, var5_24.t.getWidth(), var5_24.t.getHeight(), 1, 0 + var9_34 * 5, var4_14 + var7_33, 36);
                                }
                                var9_34 = (byte)(var7_33 / 5);
                                for (var8_36 = 0; var8_36 < var9_34; var8_36 = (byte)(var8_36 + 1)) {
                                    var6_22.drawImage(var5_24.v, 0, var4_14 + var8_36 * 5, 20);
                                    var6_22.drawRegion(var5_24.v, 0, 0, var5_24.v.getWidth(), var5_24.v.getHeight(), 2, (int)s.a, var4_14 + var8_36 * 5, 24);
                                }
                                var6_22.drawImage(var5_24.s, 0, var4_14, 20);
                                var6_22.drawRegion(var5_24.s, 0, 0, var5_24.s.getWidth(), var5_24.s.getHeight(), 2, (int)s.a, var4_14, 24);
                                var6_22.drawImage(var5_24.u, 0, var4_14 + var7_33, 36);
                                var6_22.drawRegion(var5_24.u, 0, 0, var5_24.u.getWidth(), var5_24.u.getHeight(), 2, (int)s.a, var4_14 + var7_33, 40);
                            }
                            var3_12 /* !! */ .drawImage(var2_3.w, s.a >> 1, s.b >> 1, 3);
                            var2_4 = 2;
                            if (GameMIDlet.self.phonemodel.equals("K700C")) {
                                var2_4 = 1;
                            }
                            if (ba.a.a % var2_4 != 0) break block86;
                            var2_5 = this;
                            if (!var2_5.l) break block86;
                            if (var2_5.y != al.z) break block87;
                            if (var2_5.a < 20) break block88;
                            var2_5.l = false;
                            al.h();
                            var2_5.a = 0;
                            var2_5.t = (byte)(var2_5.t + 1);
                            var2_5.c();
                            break block86;
                        }
                        if (var2_5.e) break block86;
                        ** GOTO lbl-1000
                    }
                    if (var2_5.y == al.A) {
                        ** if (var2_5.a < 20) goto lbl-1000
lbl-1000:
                        // 1 sources

                        {
                            var2_5.l = false;
                            var3_12 /* !! */  = var2_5;
                            al.h();
                            var2_5.a = 0;
                            var2_5.t = (byte)(var2_5.t + 1);
                            var2_5.c();
                            ** GOTO lbl125
                        }
                    }
                    break block86;
lbl-1000:
                    // 2 sources

                    {
                        ++var2_5.a;
                    }
                }
                if (ba.a.a % 2 == 0) {
                    var2_7 = this;
                    var2_7.p = (byte)(var2_7.p + 1);
                    if (var2_7.p >= 127) {
                        var2_7.p = 0;
                    }
                }
                if (ba.a.a % 3 == 0) {
                    var2_8 = this;
                    var2_8.q = var2_8.q == 0 ? (byte)3 : 0;
                }
                switch (this.b) {
                    case 1: {
                        this.d(var1_1);
                        this.c(var1_1);
                        this.b(var1_1);
                        break;
                    }
                    case 2: {
                        this.d(var1_1);
                        this.c(var1_1);
                        var3_12 /* !! */  = var1_1;
                        var2_9 = this;
                        if (var2_9.h) {
                            if (var2_9.a[var2_9.h].o == 1 && !var2_9.k) {
                                var4_15 = var2_9.g[var2_9.a[var2_9.h].c[var2_9.a[var2_9.h].n] - 1];
                                ba.a.a(var4_15, (short)30);
                                var2_9.k = true;
                            }
                            if (var2_9.a[var2_9.h].a[3] > 0) {
                                if (GameMIDlet.self.useEnemyFlash) {
                                    for (var4_16 = 0; var2_9.m != null && var4_16 < var2_9.m.length; ++var4_16) {
                                        if (var2_9.m[var4_16] != var2_9.a) continue;
                                        for (var5_25 = 0; var2_9.b != null && var5_25 < var2_9.b.length; ++var5_25) {
                                            if (var2_9.b[var5_25] == null || var2_9.a[var2_9.h].e[var5_25] < 10) continue;
                                            var3_12 /* !! */ .drawRGB(var2_9.b[var5_25], 0, var2_9.d[var2_9.a[var2_9.h].e[var5_25] - 10].getWidth(), var2_9.a[var2_9.a[var2_9.h].e[var5_25] - 10] + var2_9.e[var2_9.a[var2_9.h].e[var5_25] - 10] - var2_9.d[var2_9.a[var2_9.h].e[var5_25] - 10].getWidth() / 2, var2_9.b[var2_9.a[var2_9.h].e[var5_25] - 10] - var2_9.d[var2_9.a[var2_9.h].e[var5_25] - 10].getHeight(), var2_9.d[var2_9.a[var2_9.h].e[var5_25] - 10].getWidth(), var2_9.d[var2_9.a[var2_9.h].e[var5_25] - 10].getHeight(), true);
                                        }
                                    }
                                } else if (var2_9.a[var2_9.h].e[0] >= 10) {
                                    for (var4_17 = 0; var2_9.m != null && var4_17 < var2_9.m.length; ++var4_17) {
                                        if (var2_9.m[var4_17] != var2_9.a) continue;
                                        for (var5_26 = 0; var5_26 < var2_9.a[var2_9.h].e.length; ++var5_26) {
                                            var2_9.e[var2_9.a[var2_9.h].e[var5_26] - 10] = -4;
                                        }
                                    }
                                    if (var2_9.m != null && var2_9.a == var2_9.m[var2_9.m.length - 1] + 1) {
                                        for (var4_17 = 0; var4_17 < var2_9.a[var2_9.h].e.length; ++var4_17) {
                                            var2_9.e[var2_9.a[var2_9.h].e[var4_17] - 10] = 0;
                                        }
                                    }
                                }
                                if (var2_9.a[var2_9.h].e[0] < 10) {
                                    if (var2_9.a[var2_9.h].e.length <= 1) {
                                        var2_9.a(var3_12 /* !! */ , var2_9.c[var2_9.h], var2_9.d[var2_9.h], var2_9.c[var2_9.a[var2_9.h].e[0]], var2_9.d[var2_9.a[var2_9.h].e[0]]);
                                    } else {
                                        var2_9.a(var3_12 /* !! */ , var2_9.c[var2_9.h], var2_9.d[var2_9.h], var2_9.c[var2_9.h], var2_9.d[var2_9.h]);
                                    }
                                } else if (var2_9.a[var2_9.h].o == 1 && var2_9.c[var2_9.a[var2_9.h].c[var2_9.a[var2_9.h].n] - 1] != 1) {
                                    var2_9.a(var3_12 /* !! */ , var2_9.c[var2_9.h], var2_9.d[var2_9.h], var2_9.e / 2, var2_9.f / 2);
                                } else {
                                    var2_9.a(var3_12 /* !! */ , var2_9.c[var2_9.h], var2_9.d[var2_9.h], var2_9.a[var2_9.a[var2_9.h].e[0] - 10], var2_9.b[var2_9.a[var2_9.h].e[0] - 10]);
                                }
                                var2_9.b(var3_12 /* !! */ , 1);
                                if (var2_9.h != null && var2_9.a == var2_9.h[0][0] - 1 && !var2_9.i) {
                                    if (var2_9.a[var2_9.h].o == 0) {
                                        var4_18 = 0xCCCCCCC;
                                        var5_27 = Math.abs(var2_9.a.nextInt()) / var4_18;
                                        if (var2_9.a[var2_9.h].e <= 0) {
                                            var2_9.a[var2_9.h].k = 0;
                                        } else {
                                            var2_9.a[var2_9.h].e = (byte)(var2_9.a[var2_9.h].e - 1);
                                        }
                                        if (var2_9.a[var2_9.a[var2_9.h].e[0] - 10][19] <= 0) {
                                            var2_9.a[var2_9.a[var2_9.h].e[0] - 10][18] = 0;
                                        } else {
                                            v1 = var2_9.a[var2_9.a[var2_9.h].e[0] - 10];
                                            v1[19] = v1[19] - 1;
                                        }
                                        var6_23 = var2_9.a[var2_9.h].a() + var2_9.a[var2_9.h].k - (var2_9.a[var2_9.a[var2_9.h].e[0] - 10][5] - var2_9.a[var2_9.a[var2_9.h].e[0] - 10][18]) / 2 + var5_27;
                                        if (var6_23 <= 0) {
                                            var6_23 = 1;
                                        }
                                        v2 = var2_9.a[var2_9.a[var2_9.h].e[0] - 10];
                                        v2[0] = v2[0] - var6_23;
                                        if (var2_9.a[var2_9.a[var2_9.h].e[0] - 10][0] < 0) {
                                            var2_9.a[var2_9.a[var2_9.h].e[0] - 10][0] = 0;
                                        }
                                    } else if (var2_9.a[var2_9.h].o == 1) {
                                        var4_19 = var2_9.g[var2_9.a[var2_9.h].c[var2_9.a[var2_9.h].n] - 1];
                                        if (var4_19.equals("\u4e03\u4f24\u62f3")) {
                                            var5_28 = o.a(var2_9.a[var2_9.h], var2_9.a, var2_9.a[var2_9.h].c[var2_9.a[var2_9.h].n]);
                                            if (var2_9.a[var2_9.h].a[3] > var5_28) {
                                                var2_9.a(var2_9.a[var2_9.h].c[var2_9.a[var2_9.h].n]);
                                            }
                                        } else {
                                            var5_29 = o.b(var2_9.a[var2_9.h], var2_9.a, var2_9.a[var2_9.h].c[var2_9.a[var2_9.h].n]);
                                            if (var2_9.a[var2_9.h].a[5] >= var5_29) {
                                                var2_9.a(var2_9.a[var2_9.h].c[var2_9.a[var2_9.h].n]);
                                            }
                                        }
                                    } else if (var2_9.a[var2_9.h].o == 2) {
                                        if (var2_9.a[var2_9.h].e[0] < 10) {
                                            if (var2_9.b != null && var2_9.a[var2_9.h].m < var2_9.b.length && var2_9.b[var2_9.a[var2_9.h].m][1] > 0) {
                                                var4_20 = new Vector<g>(1, 1);
                                                for (var5_30 = 0; var2_9.a[var2_9.h].e != null && var5_30 < var2_9.a[var2_9.h].e.length; ++var5_30) {
                                                    var4_20.addElement(var2_9.a[var2_9.a[var2_9.h].e[var5_30]]);
                                                }
                                                if (var4_20.size() > 0) {
                                                    var5_31 = new g[var4_20.size()];
                                                    var4_20.copyInto(var5_31);
                                                    s.a((g[])var5_31, (int)var2_9.b[var2_9.a[var2_9.h].m][0]);
                                                }
                                            }
                                            var2_9.a[var2_9.h].m = 0;
                                        } else if (var2_9.a[var2_9.h].e[0] >= 10) {
                                            var2_9.a[var2_9.h].m = 0;
                                        }
                                    }
                                    var2_9.i = true;
                                }
                                if (var2_9.h != null && var2_9.a == var2_9.h[var2_9.h.length - 1][0] + 1 && !var2_9.j) {
                                    for (var4_21 = 0; var4_21 < var2_9.a.length; ++var4_21) {
                                        if (var2_9.a[var4_21][0] >= var2_9.a[var4_21][9] || var2_9.a[var4_21][0] > 0) continue;
                                        var5_32 = new p(var2_9);
                                        new p(var2_9).a = var2_9.a[var4_21];
                                        var5_32.a = (byte)var4_21;
                                        if (var2_9.a == null) {
                                            var2_9.a = new Timer();
                                        }
                                        var2_9.a.schedule((TimerTask)var5_32, 0L, 50L);
                                        var2_9.e = true;
                                    }
                                    var2_9.j = true;
                                }
                            }
                        }
                        this.b(var1_1);
                        break;
                    }
                    case 3: {
                        this.c(var1_1);
                        this.d(var1_1);
                        this.e(var1_1);
                        this.b(var1_1);
                        break;
                    }
                    case 4: {
                        this.c(var1_1);
                        this.b(var1_1);
                        break;
                    }
                    case 5: {
                        this.c(var1_1);
                        this.d(var1_1);
                        this.b(var1_1);
                        break;
                    }
                    case 6: {
                        this.f(var1_1);
                    }
                }
                var3_12 /* !! */  = var1_1;
                var2_10 = this;
                if (var2_10.h && var2_10.g && var2_10.a != null) {
                    var2_10.a(var3_12 /* !! */ , 2, 0 + var2_10.x, s.a - 4);
                    var3_12 /* !! */ .setColor(0);
                    var3_12 /* !! */ .drawString(var2_10.a, s.a / 2, 3, 17);
                    var2_10.d = (short)(var2_10.d - 1);
                    if (var2_10.d <= 0) {
                        var2_10.g = false;
                        var2_10.a = null;
                    }
                }
                return;
            }
            catch (Exception v3) {
                var2_11 = v3;
                v3.printStackTrace();
            }
        }
    }

    private void a(Graphics graphics, int n2, int n3, int n4) {
        if (this.i == null) {
            this.i = w.a("/battle/left.png");
        }
        if (this.j == null) {
            this.j = w.a("/battle/top.png");
        }
        if (this.k == null) {
            this.k = w.a("/battle/bottom.png");
        }
        graphics.setColor(16773559);
        graphics.fillRect(n2 + 15, n3, n4 - 30, 19);
        int n5 = n4 / 5;
        for (int k = 0; k < n5; ++k) {
            graphics.drawImage(this.j, n2 + k * 5, n3, 20);
            graphics.drawImage(this.k, n2 + k * 5, n3 + 21, 36);
        }
        graphics.drawImage(this.i, n2, n3, 20);
        graphics.drawRegion(this.i, 0, 0, this.i.getWidth(), this.i.getHeight(), 2, n2 + n4, n3, 24);
    }

    private static void h() {
        System.gc();
        if (GameMIDlet.self.moreSleep) {
            try {
                Thread.sleep(200L);
                return;
            }
            catch (InterruptedException interruptedException) {
                InterruptedException interruptedException2 = interruptedException;
                interruptedException.printStackTrace();
            }
        }
    }

    private void i() {
        al.h();
        String string = null;
        byte by = 0;
        string = null;
        if (this.a[this.h].o == 0) {
            String string2;
            if (this.b == null) {
                this.b = w.a("/txt/team.txt");
            }
            if ((string = w.a(string2 = w.a(this.b, "role" + this.a[this.h].t + ":", "role" + this.a[this.h].t + "end"), "attack:", "attackEnd")) == null) {
                string = w.a(this.b, "attackDefault:", "attackDefaultEnd");
            }
        } else if (this.a[this.h].o == 1) {
            by = this.a[this.h].c[this.a[this.h].n];
            string = w.a("/txt/skill" + this.h[by - 1] + ".txt");
            string = w.a(string, "skill" + this.h[by - 1] + ":", "skill" + this.h[by - 1] + "End");
        } else if (this.a[this.h].o == 2) {
            string = s.g;
        }
        boolean bl = false;
        an an2 = null;
        String[] stringArray = w.a(string, "actEffect");
        int n2 = w.a(string, "actEffectWidth");
        int n3 = w.a(string, "actEffectHeight");
        if (stringArray != null) {
            if (stringArray[0].toLowerCase().endsWith(".png") || stringArray[0].toLowerCase().endsWith(".ps")) {
                bl = false;
                this.q = w.a(stringArray[0]);
            } else if (stringArray[0].toLowerCase().endsWith(".ani")) {
                bl = true;
                an2 = new an();
                an2.a(stringArray[0]);
                an2.b(stringArray[1]);
                if (this.a[this.h].o == 1) {
                    byte by2 = this.a[this.h].c[this.a[this.h].n];
                    an2.a = this.j[by2 - 1] == 1;
                }
                if (GameMIDlet.self.cutSpLibImg) {
                    an2.a();
                }
            }
        }
        this.a = bl ? new bd(an2) : new bd(this.q, n2, n3);
        if (string != null) {
            if (this.a[this.h].o == 1) {
                this.f = w.a(string, "actStep:", "actStepEnd", "=");
                this.g = w.a(string, "effectStep:", "effectStepEnd", "=");
                this.h = w.a(string, "headNum:", "headNumEnd", "=");
                this.m = w.a(string, "damageFlash");
                if (this.f == null) {
                    string = w.a("/txt/skill.txt");
                    this.f = w.a(string, "actStep:", "actStepEnd", "=");
                }
            } else {
                this.f = w.a(string, "actStep:", "actStepEnd", "=");
                this.g = w.a(string, "effectStep:", "effectStepEnd", "=");
                this.h = w.a(string, "headNum:", "headNumEnd", "=");
                this.m = w.a(string, "damageFlash");
            }
        }
        System.gc();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        block114: {
            int n2;
            block115: {
                Object object;
                int n3;
                block112: {
                    block113: {
                        block110: {
                            block111: {
                                int n4;
                                int n5;
                                int n6;
                                int n7;
                                Vector<String> vector;
                                al al2;
                                block117: {
                                    block116: {
                                        String string;
                                        Object object2;
                                        int n8;
                                        block107: {
                                            block108: {
                                                block109: {
                                                    block104: {
                                                        block106: {
                                                            block105: {
                                                                n.a(0);
                                                                ba.a.c = false;
                                                                ba.a.a = true;
                                                                ba.a.d = false;
                                                                ((al)object2).c = 0;
                                                                ((al)object2).i = 0;
                                                                n2 = 0;
                                                                for (n3 = 0; n3 < ((al)object2).a.length; n2 += ((al)object2).a[n3].a[3], ++n3) {
                                                                    if (((al)object2).a[n3].a[3] >= 0) continue;
                                                                    ((al)object2).a[n3].a[3] = 0;
                                                                }
                                                                if (n2 <= 0) {
                                                                    al.l();
                                                                    if (n2 <= 0) {
                                                                        if (ba.a.k) {
                                                                            ((al)object2).d();
                                                                            return;
                                                                        }
                                                                        ((al)object2).m = 0;
                                                                        ((al)object2).b = (byte)6;
                                                                        return;
                                                                    }
                                                                }
                                                                n3 = 0;
                                                                for (n2 = 0; n2 < ((al)object2).a.length; n3 += ((al)object2).a[n2][0], ++n2) {
                                                                    if (((al)object2).a[n2][0] > 0) continue;
                                                                    ((al)object2).d[n2] = null;
                                                                }
                                                                if (n3 > 0) break block104;
                                                                al2 = object2;
                                                                if (GameMIDlet.self.playMusic) {
                                                                    ba.a.j();
                                                                    if (s.e != null && !s.e.equals("")) {
                                                                        if (ba.a.a == null) {
                                                                            ba.a.a = new v();
                                                                        }
                                                                        ba.a.a.a(s.e);
                                                                        ba.a.a.a(1);
                                                                        ba.a.a.b(s.c);
                                                                        ba.a.a.a();
                                                                    }
                                                                }
                                                                al.l();
                                                                vector = new Vector<String>();
                                                                n8 = 0;
                                                                n7 = 0;
                                                                for (n6 = 0; al2.a != null && n6 < al2.a.length; n8 += al2.a[n6][7], n7 += al2.a[n6][8], ++n6) {
                                                                }
                                                                vector.addElement(new String("\u6218\u6597\u80dc\u5229"));
                                                                if (u.b <= 1) break block105;
                                                                vector.addElement(new String("\u83b7\u5f97\u7ecf\u9a8c\u503c" + (n8 *= u.b)));
                                                                u.c = (short)(u.c - 1);
                                                                if (u.c > 0) {
                                                                    vector.addElement(new String("\u60a8\u8fd8\u6709" + u.c + "\u6b21\u53cc\u500d\u7ecf\u9a8c\u673a\u4f1a"));
                                                                    break block106;
                                                                } else if (u.c <= 0) {
                                                                    u.b = 1;
                                                                    vector.addElement(new String("\u60a8\u7684\u53cc\u500d\u7ecf\u9a8c\u5df2\u7ecf\u7528\u5b8c\uff01"));
                                                                }
                                                                break block106;
                                                            }
                                                            vector.addElement(new String("\u83b7\u5f97\u7ecf\u9a8c\u503c" + n8));
                                                        }
                                                        if (z.a == null) {
                                                            object2 = w.a("/txt/equip.txt");
                                                            z.a = w.a((String)object2, "equipEffect:", "end", "=");
                                                        }
                                                        if (al2.g == null) {
                                                            al2.f();
                                                        }
                                                        s.e();
                                                        s.g();
                                                        string = w.a("/txt/levelup.txt");
                                                        break block107;
                                                    }
                                                    ((al)object2).i = false;
                                                    ((al)object2).j = false;
                                                    ((al)object2).k = false;
                                                    ((al)object2).e = false;
                                                    ((al)object2).n = false;
                                                    ((al)object2).b = null;
                                                    ((al)object2).m = false;
                                                    System.gc();
                                                    for (n2 = 0; n2 < ((al)object2).a.length; ++n2) {
                                                        ((al)object2).a[n2][9] = ((al)object2).a[n2][0];
                                                        ((al)object2).a[n2][10] = ((al)object2).a[n2][2];
                                                    }
                                                    for (n2 = 0; n2 < ((al)object2).a.length; ++n2) {
                                                        ((al)object2).a[n2].c = ((al)object2).a[n2].a[3];
                                                        ((al)object2).a[n2].d = ((al)object2).a[n2].a[5];
                                                    }
                                                    if (((al)object2).t >= ((al)object2).i.length) break block108;
                                                    ((al)object2).a = 0;
                                                    if (((al)object2).i[((al)object2).t][0] >= 10) break block109;
                                                    if (((al)object2).a[((al)object2).h].h > 0) {
                                                        ((al)object2).a[((al)object2).h].h = (byte)(((al)object2).a[((al)object2).h].h - 1);
                                                    }
                                                    if (((al)object2).a[((al)object2).h].i > 0) {
                                                        ((al)object2).a[((al)object2).h].i = (byte)(((al)object2).a[((al)object2).h].i - 1);
                                                    }
                                                    if (((al)object2).a[((al)object2).h].j > 0) {
                                                        ((al)object2).a[((al)object2).h].j = (byte)(((al)object2).a[((al)object2).h].j - 1);
                                                    }
                                                    if (((al)object2).a[((al)object2).h].k > 0) {
                                                        ((al)object2).a[((al)object2).h].k = (byte)(((al)object2).a[((al)object2).h].k - 1);
                                                    }
                                                    ((al)object2).h = (byte)((al)object2).i[((al)object2).t][0];
                                                    if (((al)object2).a[((al)object2).h].a[3] <= 0) {
                                                        ((al)object2).t = (byte)(((al)object2).t + 1);
                                                        ((al)object2).a = 0;
                                                        ((al)object2).c();
                                                        return;
                                                    }
                                                    if (((al)object2).c) {
                                                        ((al)object2).a[((al)object2).h].o = 0;
                                                        ((al)object2).a[((al)object2).h].e = new byte[]{10};
                                                    }
                                                    if (((al)object2).a[((al)object2).h].e == null) {
                                                        ((al)object2).a[((al)object2).h].o = 0;
                                                        ((al)object2).a[((al)object2).h].e = new byte[]{10};
                                                    }
                                                    if (((al)object2).a[((al)object2).h].o == 3) {
                                                        ((al)object2).t = (byte)(((al)object2).t + 1);
                                                        ((al)object2).a = 0;
                                                        ((al)object2).c();
                                                        return;
                                                    }
                                                    if (((al)object2).a[((al)object2).h].o == 0) {
                                                        if (((al)object2).a[((al)object2).h].e.length > 1) {
                                                            ((al)object2).a[((al)object2).h].e = new byte[]{10};
                                                        }
                                                        if (((al)object2).a[((al)object2).h].e.length == 1 && ((al)object2).a[((al)object2).h].e[0] < 10) {
                                                            ((al)object2).a[((al)object2).h].e[0] = 10;
                                                        }
                                                    }
                                                    if (((al)object2).a[((al)object2).h].e.length == 1 && ((al)object2).a[((al)object2).h].e[0] >= 10 && ((al)object2).a[((al)object2).a[((al)object2).h].e[0] - 10][0] <= 0) {
                                                        for (n2 = 0; n2 < ((al)object2).f; ++n2) {
                                                            if (((al)object2).a[n2][0] <= 0) continue;
                                                            ((al)object2).a[((al)object2).h].e[0] = (byte)(n2 + 10);
                                                        }
                                                    }
                                                    if (((al)object2).a[((al)object2).h].e.length >= 1 && ((al)object2).a[((al)object2).h].e[0] >= 10) {
                                                        byte[] byArray = null;
                                                        for (n3 = 0; n3 < ((al)object2).a[((al)object2).h].e.length; ++n3) {
                                                            if (((al)object2).a[((al)object2).a[((al)object2).h].e[n3] - 10][0] <= 0) continue;
                                                            byArray = w.c(byArray, ((al)object2).a[((al)object2).h].e[n3]);
                                                        }
                                                        ((al)object2).a[((al)object2).h].e = byArray;
                                                    }
                                                    if (((al)object2).a[((al)object2).h].e[0] < 10) {
                                                        ((al)object2).b = null;
                                                        super.i();
                                                        ((al)object2).b = (byte)2;
                                                        System.gc();
                                                        super.k();
                                                        return;
                                                    }
                                                    if (!GameMIDlet.self.useEnemyFlash) break block110;
                                                    ((al)object2).b = new int[((al)object2).a[((al)object2).h].e.length][];
                                                    break block111;
                                                }
                                                ((al)object2).b = null;
                                                ((al)object2).r = (byte)(((al)object2).i[((al)object2).t][0] - 10);
                                                if (((al)object2).a[((al)object2).r][0] <= 0) {
                                                    ((al)object2).t = (byte)(((al)object2).t + 1);
                                                    ((al)object2).a = 0;
                                                    ((al)object2).c();
                                                    return;
                                                }
                                                if (((al)object2).a[((al)object2).r][20] > 0) {
                                                    int[] nArray = ((al)object2).a[((al)object2).r];
                                                    nArray[20] = nArray[20] - 1;
                                                    ((al)object2).t = (byte)(((al)object2).t + 1);
                                                    ((al)object2).a = 0;
                                                    ((al)object2).c();
                                                    return;
                                                }
                                                n2 = Integer.MAX_VALUE / ((al)object2).a.length;
                                                ((al)object2).s = (byte)(Math.abs(((al)object2).a.nextInt()) / n2);
                                                if (((al)object2).a[((al)object2).s].a[3] > 0) break block112;
                                                break block113;
                                            }
                                            ((al)object2).g();
                                            ((al)object2).j();
                                            ((al)object2).c = ((al)object2).b;
                                            if (((al)object2).c) {
                                                ((al)object2).t = 0;
                                                ((al)object2).a = 0;
                                                ((al)object2).c();
                                                return;
                                            }
                                            ((al)object2).b = 1;
                                            ((al)object2).c = 0;
                                            ((al)object2).t = 0;
                                            ((al)object2).a = 0;
                                            ((al)object2).g = 0;
                                            ((al)object2).h = ((al)object2).a[((al)object2).g];
                                            if (((al)object2).a[((al)object2).h].a[3] > 0) break block114;
                                            break block115;
                                        }
                                        for (n5 = 0; n5 < al2.a.length; ++n5) {
                                            if (al2.a[n5].a[3] <= 0) continue;
                                            String string2 = w.a(string, "role" + al2.a[n5].t + ":", "role" + al2.a[n5].t + "End");
                                            String string3 = w.a(string2, "levelSkill:", "levelSkillEnd");
                                            object2 = w.a(string2, "enemySkill:", "enemySkillEnd");
                                            String string4 = w.a(string2, "status:", "statusEnd");
                                            for (n4 = 0; al2.k != null && n4 < al2.k.length; ++n4) {
                                                int n9 = w.a((String)object2, String.valueOf(al2.k[n4]));
                                                if (n9 <= 0 || w.a(al2.a[n5].a, n9)) continue;
                                                al2.a[n5].a = w.c(al2.a[n5].a, n9);
                                                vector.addElement(new String(al2.a[n5].a + "\u4e60\u5f97" + al2.g[n9 - 1]));
                                            }
                                            if (u.c || al2.a[n5].a[0] < 30) {
                                                al2.a[n5].a[1] = al2.a[n5].a[1] + n8;
                                                while (al2.a[n5].a[1] >= al2.a[n5].a[2]) {
                                                    al2.a[n5].a[0] = al2.a[n5].a[0] + 1;
                                                    al2.a[n5].a.a = (short)(al2.a[n5].a.a + 5);
                                                    al2.a[n5].a.b = (short)(al2.a[n5].a.b + 1);
                                                    al2.a[n5].a[2] = al2.a[n5].a[2] + ((al2.a[n5].a[0] + 9) * al2.a[n5].a[0] << 2);
                                                    al2.a[n5].a[3] = al2.a[n5].a[33];
                                                    al2.a[n5].a[5] = al2.a[n5].a[34];
                                                    al2.a[n5].a[9] = al2.a[n5].a[9] + w.a(string4, "speed");
                                                    vector.addElement(new String(al2.a[n5].a + "\u5347\u7ea7\u5230" + al2.a[n5].a[0] + "\u7ea7"));
                                                    vector.addElement(new String("\u6f5c\u80fd\u70b9\u589e\u52a05"));
                                                    vector.addElement(new String("\u6280\u80fd\u70b9\u589e\u52a01"));
                                                    vector.addElement(new String("\u901f\u5ea6\u589e\u52a0" + w.a(string4, "speed")));
                                                    if (!u.c && al2.a[n5].a[0] >= 30) {
                                                        String string5 = "\u53cb\u60c5\u63d0\u793a:\u73a9\u5bb6\u7b49\u7ea7\u53d7\u5230\u9650\u5236\uff0c\u8bf7\u5230\u201c\u8d34\u5fc3\u670d\u52a1\u201d\u5f00\u653e\u7b49\u7ea7\u9650\u5236\uff01";
                                                        ba.a.b(string5, (short)120);
                                                    }
                                                    int[] nArray = w.a(string3, String.valueOf(al2.a[n5].a[0]));
                                                    for (int k = 0; nArray != null && k < nArray.length; ++k) {
                                                        if (w.a(al2.a[n5].a, nArray[k])) continue;
                                                        al2.a[n5].a = w.c(al2.a[n5].a, nArray[k]);
                                                        vector.addElement(new String(al2.a[n5].a + "\u4e60\u5f97" + al2.g[nArray[k] - 1]));
                                                    }
                                                }
                                                continue;
                                            }
                                            String string6 = "\u53cb\u60c5\u63d0\u793a:\u73a9\u5bb6\u7b49\u7ea7\u53d7\u5230\u9650\u5236\uff0c\u8bf7\u5230\u201c\u8d34\u5fc3\u670d\u52a1\u201d\u5f00\u653e\u7b49\u7ea7\u9650\u5236\uff01";
                                            ba.a.b(string6, (short)120);
                                        }
                                        s.a(al2.a);
                                        if (u.d <= 1) break block116;
                                        vector.addElement(new String("\u83b7\u5f97\u91d1\u5e01" + (n7 <<= 1)));
                                        u.e = (short)(u.e - 1);
                                        if (u.e > 0) {
                                            vector.addElement(new String("\u60a8\u8fd8\u6709" + u.e + "\u6b21\u53cc\u500d\u91d1\u94b1\u673a\u4f1a"));
                                            break block117;
                                        } else if (u.e <= 0) {
                                            u.d = 1;
                                            vector.addElement(new String("\u53cc\u500d\u91d1\u94b1\u5df2\u7ecf\u7528\u5b8c\uff01"));
                                        }
                                        break block117;
                                    }
                                    vector.addElement(new String("\u83b7\u5f97\u91d1\u5e01" + n7));
                                }
                                s.a += n7;
                                n5 = 0;
                                while (true) {
                                    if (al2.a == null || n5 >= al2.a.length) break;
                                    for (int k = 0; al2.a[n5] != null && k < al2.a[n5].length; ++k) {
                                        int n10;
                                        n6 = 1;
                                        if (al2.f[n5] != null && k < al2.f[n5].length) {
                                            int n11 = al2.f[n5][k];
                                            if (u.f > 1) {
                                                n11 *= u.f;
                                            }
                                            n10 = 21474836;
                                            n4 = Math.abs(al2.a.nextInt()) / n10;
                                            n6 = n4 <= n11 ? 1 : 0;
                                        }
                                        if (n6 == 0) continue;
                                        if (al2.a[n5][k] <= s.g.length) {
                                            boolean bl = false;
                                            for (n10 = 0; n10 < vector.size(); ++n10) {
                                                if (!((String)vector.elementAt(n10)).equals("\u83b7\u5f97" + s.g[al2.a[n5][k] - 1])) continue;
                                                bl = true;
                                            }
                                            if (!bl) {
                                                vector.addElement(new String("\u83b7\u5f97" + s.g[al2.a[n5][k] - 1]));
                                            }
                                            s.a(al2.a[n5][k], 1);
                                            continue;
                                        }
                                        System.out.println("\u654c\u4eba" + al2.e[n5] + "\u7684\u9053\u5177" + al2.a[n5][k] + "\u8d8a\u754c");
                                    }
                                    ++n5;
                                }
                                n5 = 0;
                                while (true) {
                                    if (al2.b == null || n5 >= al2.b.length) break;
                                    for (int k = 0; al2.b[n5] != null && k < al2.b[n5].length; ++k) {
                                        int n12;
                                        n6 = 1;
                                        if (al2.g[n5] != null && k < al2.g[n5].length) {
                                            int n13 = al2.g[n5][k];
                                            if (u.f > 1) {
                                                n13 *= u.f;
                                            }
                                            n12 = 2147483;
                                            n4 = Math.abs(al2.a.nextInt()) / n12;
                                            n6 = n4 <= n13 ? 1 : 0;
                                        }
                                        if (n6 == 0) continue;
                                        boolean bl = false;
                                        for (n12 = 0; n12 < vector.size(); ++n12) {
                                            if (!((String)vector.elementAt(n12)).equals("\u83b7\u5f97" + s.i[al2.b[n5][k] / 10])) continue;
                                            bl = true;
                                        }
                                        if (!bl) {
                                            vector.addElement(new String("\u83b7\u5f97" + s.i[al2.b[n5][k] / 10]));
                                        }
                                        s.b(al2.b[n5][k], 1);
                                    }
                                    ++n5;
                                }
                                n5 = 0;
                                while (true) {
                                    if (al2.c != null && n5 < al2.c.length) {
                                    } else {
                                        if (u.f > 1) {
                                            if ((u.g = (short)(u.g - 1)) == 0) {
                                                u.f = 1;
                                            }
                                            if (u.g > 0) {
                                                vector.addElement(new String("\u60a8\u8fd8\u6709" + u.g + "\u6b2110\u500d\u6389\u5b9d"));
                                            }
                                        }
                                        if (vector.size() > 0) {
                                            al2.a = new String[vector.size()];
                                            vector.copyInto(al2.a);
                                        }
                                        al2.a = 0;
                                        al2.b = (byte)4;
                                        return;
                                    }
                                    for (int k = 0; al2.c[n5] != null && k < al2.c[n5].length; ++k) {
                                        int n14;
                                        n6 = 1;
                                        if (al2.h[n5] != null && k < al2.h[n5].length) {
                                            int n15 = al2.h[n5][k];
                                            if (u.f > 1) {
                                                n15 *= u.f;
                                            }
                                            n14 = 2147483;
                                            n4 = Math.abs(al2.a.nextInt()) / n14;
                                            n6 = n4 <= n15 ? 1 : 0;
                                        }
                                        if (n6 == 0) continue;
                                        if (z.b == null) {
                                            z.a();
                                        }
                                        if (al2.c[n5][k] <= z.b.length) {
                                            boolean bl = false;
                                            for (n14 = 0; n14 < vector.size(); ++n14) {
                                                if (!((String)vector.elementAt(n14)).equals("\u83b7\u5f97" + z.b[al2.c[n5][k] - 1])) continue;
                                                bl = true;
                                            }
                                            if (!bl) {
                                                vector.addElement(new String("\u83b7\u5f97" + z.b[al2.c[n5][k] - 1]));
                                            }
                                            if ((n4 = z.a(1, 100)) <= al2.d[n5][0]) {
                                                n14 = 1;
                                            } else if (n4 <= al2.d[n5][0] + al2.d[n5][1]) {
                                                n14 = 2;
                                            } else if (n4 <= al2.d[n5][0] + al2.d[n5][1] + al2.d[n5][2]) {
                                                n14 = 3;
                                            } else {
                                                n14 = 1;
                                                System.out.println("\u602a\u7269\u6389\u88c5\u5907\u65f6\u88c5\u5907\u4ea7\u751f\u8fc7\u7a0b\u51fa\u9519\uff01");
                                            }
                                            s.e(al2.c[n5][k], n14);
                                            continue;
                                        }
                                        System.out.println("\u654c\u4eba" + al2.e[n5] + "\u7684\u88c5\u5907" + al2.c[n5][k] + "\u8d8a\u754c");
                                    }
                                    ++n5;
                                }
                            }
                            for (int k = 0; k < ((al)object2).a[((al)object2).h].e.length; ++k) {
                                for (n3 = 0; n3 < k; ++n3) {
                                    if (!((al)object2).f[((al)object2).a[((al)object2).h].e[k] - 10].equals(((al)object2).f[((al)object2).a[((al)object2).h].e[n3] - 10])) continue;
                                    ((al)object2).b[k] = ((al)object2).b[n3];
                                }
                                if (((al)object2).b[k] != null) continue;
                                ((al)object2).b[k] = new int[((al)object2).d[((al)object2).a[((al)object2).h].e[k] - 10].getWidth() * ((al)object2).d[((al)object2).a[((al)object2).h].e[k] - 10].getHeight()];
                                ((al)object2).d[((al)object2).a[((al)object2).h].e[k] - 10].getRGB(((al)object2).b[k], 0, ((al)object2).d[((al)object2).a[((al)object2).h].e[k] - 10].getWidth(), 0, 0, ((al)object2).d[((al)object2).a[((al)object2).h].e[k] - 10].getWidth(), ((al)object2).d[((al)object2).a[((al)object2).h].e[k] - 10].getHeight());
                                for (n3 = 0; n3 < ((al)object2).b[k].length; ++n3) {
                                    if (((al)object2).b[k][n3] >> 24 == 0) continue;
                                    ((al)object2).b[k][n3] = -1;
                                }
                            }
                        }
                        super.i();
                        ((al)object2).b = (byte)2;
                        System.gc();
                        super.k();
                        return;
                    }
                    for (n3 = 0; n3 < ((al)object2).a.length; ++n3) {
                        if (((al)object2).a[n3].a[3] <= 0) continue;
                        ((al)object2).s = (byte)n3;
                        break;
                    }
                }
                if (((al)object2).e[((al)object2).r] != null) {
                    n2 = 21474836;
                    n3 = Math.abs(((al)object2).a.nextInt()) / n2;
                    if (n3 <= 30) {
                        ((al)object2).v = ((al)object2).e[((al)object2).r][0];
                        n2 = ((al)object2).a[((al)object2).v - 1][2];
                        ((al)object2).u = ((al)object2).a[((al)object2).r][2] >= n2 ? (byte)1 : 0;
                    } else {
                        ((al)object2).u = 0;
                    }
                } else {
                    ((al)object2).u = 0;
                }
                Object object3 = object = object2;
                al.h();
                object3 = null;
                String string = null;
                boolean bl = false;
                Object object4 = null;
                if (((al)object).u == 0) {
                    if (((al)object).c == null) {
                        object3 = w.a("/txt/enemy.txt");
                        ((al)object).c = string = w.a((String)object3, "attack:", "attackEnd");
                    } else {
                        string = ((al)object).c;
                    }
                } else if (((al)object).u == 1) {
                    object3 = w.a("/txt/skill" + ((al)object).h[((al)object).v - 1] + ".txt");
                    string = w.a((String)object3, "skill" + ((al)object).h[((al)object).v - 1] + ":", "skill" + ((al)object).h[((al)object).v - 1] + "End");
                }
                String[] stringArray = w.a(string, "actEffect");
                int n16 = w.a(string, "actEffectWidth");
                int n17 = w.a(string, "actEffectHeight");
                if (stringArray != null) {
                    if (stringArray[0].toLowerCase().endsWith(".png") || stringArray[0].toLowerCase().endsWith(".ps")) {
                        bl = false;
                        ((al)object).q = w.a(stringArray[0]);
                    } else {
                        bl = true;
                        object4 = new an();
                        ((an)object4).a(stringArray[0]);
                        ((an)object4).b(stringArray[1]);
                        if (((al)object).u == 0) {
                            ((an)object4).a = true;
                        } else if (((al)object).u == 1) {
                            ((an)object4).a = ((al)object).j[((al)object).v - 1] == 2;
                        }
                        if (GameMIDlet.self.cutSpLibImg) {
                            ((an)object4).a();
                        }
                    }
                }
                ((al)object).a = bl ? new bd((an)object4) : new bd(((al)object).q, n16, n17);
                ((al)object).g = w.a(string, "effectStep:", "effectStepEnd", "=");
                ((al)object).h = w.a(string, "headNum:", "headNumEnd", "=");
                System.gc();
                if (GameMIDlet.self.moreSleep) {
                    try {
                        Thread.sleep(200L);
                    }
                    catch (InterruptedException interruptedException) {
                        object4 = interruptedException;
                        interruptedException.printStackTrace();
                    }
                }
                ((al)object2).b = (byte)3;
                System.gc();
                object = object2;
                if (((al)object).a[((al)object).r][0] > 0) {
                    ((al)object).a = 0;
                    ((al)object).y = A;
                    ((al)object).l = true;
                    return;
                }
                ((al)object).a = 0;
                ((al)object).t = (byte)(((al)object).t + 1);
                ((al)object).c();
                return;
            }
            for (n2 = 0; n2 < ((al)object2).a.length; ++n2) {
                if (((al)object2).a[((al)object2).a[n2]].a[3] <= 0) continue;
                ((al)object2).g = (byte)n2;
                ((al)object2).h = ((al)object2).a[((al)object2).g];
                break;
            }
        }
        ((al)object2).d = 1;
    }

    private void j() {
        for (int k = 0; this.a != null && k < this.a.length; ++k) {
            if (this.a[this.r][0] <= 0) continue;
            if (this.a[this.r][13] > 0) {
                int[] nArray = this.a[this.r];
                nArray[13] = nArray[13] - 1;
            } else {
                this.a[this.r][12] = 0;
            }
            if (this.a[this.r][15] > 0) {
                int[] nArray = this.a[this.r];
                nArray[15] = nArray[15] - 1;
            } else {
                this.a[this.r][14] = 0;
            }
            if (this.a[this.r][17] > 0) {
                int[] nArray = this.a[this.r];
                nArray[17] = nArray[17] - 1;
                continue;
            }
            this.a[this.r][16] = 0;
        }
    }

    private void k() {
        if (this.a[this.h].a[3] > 0) {
            this.a = 0;
            this.y = z;
            this.l = true;
            return;
        }
        this.a = 0;
        this.t = (byte)(this.t + 1);
        this.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b(Graphics graphics) {
        block110: {
            block111: {
                block112: {
                    block117: {
                        block118: {
                            block116: {
                                int n2;
                                int n3;
                                int n4;
                                block109: {
                                    block107: {
                                        block105: {
                                            block106: {
                                                int n5;
                                                int n6;
                                                block114: {
                                                    block115: {
                                                        block113: {
                                                            block101: {
                                                                boolean bl;
                                                                block98: {
                                                                    block99: {
                                                                        block96: {
                                                                            block108: {
                                                                                block102: {
                                                                                    block103: {
                                                                                        block104: {
                                                                                            block100: {
                                                                                                block97: {
                                                                                                    if (!this.h) {
                                                                                                        return;
                                                                                                    }
                                                                                                    if (this.b == 1) {
                                                                                                        al al2 = this;
                                                                                                        if (GameMIDlet.self.cutImg && al2.a == null || !GameMIDlet.self.cutImg && al2.g == null) {
                                                                                                            System.gc();
                                                                                                            if (GameMIDlet.self.moreSleep) {
                                                                                                                try {
                                                                                                                    Thread.sleep(400L);
                                                                                                                }
                                                                                                                catch (InterruptedException interruptedException) {
                                                                                                                    InterruptedException interruptedException2 = interruptedException;
                                                                                                                    interruptedException.printStackTrace();
                                                                                                                }
                                                                                                            }
                                                                                                            al2.g = w.a("/battle/menuWords.png");
                                                                                                            if (GameMIDlet.self.cutImg) {
                                                                                                                int n7;
                                                                                                                al2.a = new Image[10];
                                                                                                                for (n7 = 0; n7 < 5; ++n7) {
                                                                                                                    al2.a[n7] = Image.createImage((Image)al2.g, (int)(n7 << 4), (int)0, (int)16, (int)16, (int)0);
                                                                                                                }
                                                                                                                for (n7 = 5; n7 < 10; ++n7) {
                                                                                                                    al2.a[n7] = Image.createImage((Image)al2.g, (int)(n7 << 4), (int)0, (int)16, (int)16, (int)0);
                                                                                                                }
                                                                                                                al2.g = null;
                                                                                                            }
                                                                                                            al2.h = w.a("/battle/menuBack.png");
                                                                                                            al2.i = w.a("/battle/left.png");
                                                                                                            al2.j = w.a("/battle/top.png");
                                                                                                            al2.k = w.a("/battle/bottom.png");
                                                                                                            al2.m = w.a("/sys/adddel.ps");
                                                                                                            if (GameMIDlet.self.cutImg) {
                                                                                                                al2.n = Image.createImage((Image)al2.m, (int)14, (int)0, (int)7, (int)7, (int)0);
                                                                                                                al2.m = null;
                                                                                                            }
                                                                                                            al2.o = w.a("/sys/arrow.ps");
                                                                                                            if (GameMIDlet.self.cutImg) {
                                                                                                                al2.c = new Image[2];
                                                                                                                for (int k = 0; k < 2; ++k) {
                                                                                                                    al2.c[k] = Image.createImage((Image)al2.o, (int)(k * 11), (int)0, (int)11, (int)7, (int)0);
                                                                                                                }
                                                                                                                al2.o = null;
                                                                                                            }
                                                                                                            if (c.b == null) {
                                                                                                                c.a();
                                                                                                            }
                                                                                                            if (c.a == null) {
                                                                                                                c.b();
                                                                                                            }
                                                                                                            s.f();
                                                                                                            al2.l = w.a("/sys/white_number_s.ps");
                                                                                                            if (GameMIDlet.self.cutImg) {
                                                                                                                al2.b = new Image[11];
                                                                                                                for (int k = 0; k < 11; ++k) {
                                                                                                                    al2.b[k] = Image.createImage((Image)al2.l, (int)(k * 6), (int)0, (int)6, (int)7, (int)0);
                                                                                                                }
                                                                                                                al2.l = null;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    if (this.b != 1 || this.c != 2 && this.c != 3) {
                                                                                                        int n8 = 55;
                                                                                                        if (s.a == 240) {
                                                                                                            n8 = 85;
                                                                                                        }
                                                                                                        for (int k = 0; k < this.a.length; ++k) {
                                                                                                            if (this.a[k].a != null) {
                                                                                                                graphics.drawImage(this.a[k].a, 16 + n8 * k, s.b - this.g + 31, 36);
                                                                                                            }
                                                                                                            if (GameMIDlet.self.cutImg) {
                                                                                                                ah.a(graphics, this.a[k], this.b, (int)this.h, 8 + n8 * k, s.b - this.g + 33);
                                                                                                                continue;
                                                                                                            }
                                                                                                            ah.a(graphics, this.a[k], this.l, (int)this.h, 8 + n8 * k, s.b - this.g + 33);
                                                                                                        }
                                                                                                    }
                                                                                                    if (this.b == 1 && this.c == 0) {
                                                                                                        if (s.a == 240) {
                                                                                                            this.c = this.d;
                                                                                                        }
                                                                                                        if (GameMIDlet.self.phonemodel.equals("KG90n")) {
                                                                                                            this.c = this.e;
                                                                                                        }
                                                                                                        graphics.drawImage(this.h, (int)this.c[1][0], (int)this.c[1][1], 3);
                                                                                                        for (int k = 0; k < 5; ++k) {
                                                                                                            if (GameMIDlet.self.cutImg) {
                                                                                                                graphics.drawImage(this.a[k], (int)this.c[k][0], (int)this.c[k][1], 3);
                                                                                                                continue;
                                                                                                            }
                                                                                                            graphics.drawRegion(this.g, k << 4, 0, 16, 16, 0, (int)this.c[k][0], (int)this.c[k][1], 3);
                                                                                                        }
                                                                                                        if (GameMIDlet.self.cutImg) {
                                                                                                            graphics.drawImage(this.a[this.d + 5], (int)this.c[this.d][0], (int)this.c[this.d][1], 3);
                                                                                                        } else {
                                                                                                            graphics.drawRegion(this.g, this.d + 5 << 4, 0, 16, 16, 0, (int)this.c[this.d][0], (int)this.c[this.d][1], 3);
                                                                                                        }
                                                                                                    }
                                                                                                    if (this.b != 1) break block96;
                                                                                                    if (this.c == 0) {
                                                                                                        this.a(graphics, 2, 0 + this.x, s.a - 4);
                                                                                                        graphics.setColor(0);
                                                                                                        if (this.a[this.h].a[3] > 0) {
                                                                                                            graphics.drawString(this.a[this.h].a + "\u884c\u52a8\u4e2d", s.a / 2, 3, 17);
                                                                                                            return;
                                                                                                        }
                                                                                                        graphics.drawString(this.a[this.h].a + "\u6b7b\u4ea1", s.a / 2, 3, 17);
                                                                                                        return;
                                                                                                    }
                                                                                                    if (this.c != 1) break block97;
                                                                                                    this.a(graphics, 2, 0 + this.x, s.a - 4);
                                                                                                    graphics.setColor(0);
                                                                                                    if (this.a[this.h].a[3] <= 0) return;
                                                                                                    bl = true;
                                                                                                    if (this.a[this.h].e == null) return;
                                                                                                    if (this.a[this.h].e[0] < 10) return;
                                                                                                    if (this.a[this.a[this.h].e[0] - 10][0] > 0) break block98;
                                                                                                    bl = false;
                                                                                                    break block99;
                                                                                                }
                                                                                                if (this.c != 2) break block100;
                                                                                                if (this.g == null) {
                                                                                                    this.f();
                                                                                                }
                                                                                                this.a(graphics, -25, 0 + this.x, s.a + 50);
                                                                                                graphics.setColor(0);
                                                                                                if (this.a[this.h].c == null) {
                                                                                                    graphics.drawString("\u60a8\u8fd8\u6ca1\u5b66\u4f1a\u4efb\u4f55\u6280\u80fd", s.a / 2, 3, 17);
                                                                                                    return;
                                                                                                }
                                                                                                this.i = (short)graphics.getClipX();
                                                                                                this.j = (short)graphics.getClipY();
                                                                                                this.k = (short)graphics.getClipWidth();
                                                                                                this.l = (short)graphics.getClipHeight();
                                                                                                graphics.setClip((int)this.m, this.n - this.v, (int)this.o, this.p + this.v);
                                                                                                n6 = this.n + this.i / this.k * this.w + this.q;
                                                                                                if (n6 < this.n) {
                                                                                                    int n9 = (this.n - n6) % this.w;
                                                                                                    n5 = 0;
                                                                                                    n5 = n9 > 0 ? (this.n - n6) / this.w + 1 : (this.n - n6) / this.w;
                                                                                                    this.q = (short)(this.q + this.w * n5);
                                                                                                } else if (n6 + 10 > this.n + this.p) {
                                                                                                    int n10 = (n6 + 10 - this.n - this.p) % this.w;
                                                                                                    n5 = 0;
                                                                                                    n5 = n10 > 0 ? (n6 + 10 - this.n - this.p) / this.w + 1 : (n6 + 10 - this.n - this.p) / this.w;
                                                                                                    this.q = (short)(this.q - this.w * n5);
                                                                                                }
                                                                                                graphics.translate(10, this.q - this.v);
                                                                                                break block101;
                                                                                            }
                                                                                            if (this.c != 21) break block102;
                                                                                            this.a(graphics, 2, 0 + this.x, s.a - 4);
                                                                                            graphics.setColor(0);
                                                                                            if (this.a[this.h].c == null) return;
                                                                                            if (this.b[this.a[this.h].c[this.a[this.h].n] - 1] != 2) break block103;
                                                                                            if (this.a[this.h].a[3] <= 0) return;
                                                                                            if (this.a[this.h].e.length != 1) break block104;
                                                                                            if (this.a[this.h].e[0] < 10 || this.a[this.a[this.h].e[0] - 10][0] > 0) break block105;
                                                                                            break block106;
                                                                                        }
                                                                                        graphics.setColor(0);
                                                                                        graphics.drawString("\u653b\u51fb\u5168\u4f53", s.a / 2, 3, 17);
                                                                                        break block107;
                                                                                    }
                                                                                    if (this.b[this.a[this.h].c[this.a[this.h].n] - 1] != 1) return;
                                                                                    for (int k = 0; k < this.a[this.h].e.length; ++k) {
                                                                                        graphics.drawImage(this.f, (int)this.c[this.a[this.h].e[k]], this.d[this.a[this.h].e[k]] - this.a[this.a[this.h].e[k]].n + this.q, 33);
                                                                                    }
                                                                                    graphics.setColor(0);
                                                                                    if (6 + w.a.stringWidth(this.h[this.a[this.h].c[this.a[this.h].n] - 1]) <= s.a) {
                                                                                        graphics.drawString(this.h[this.a[this.h].c[this.a[this.h].n] - 1], s.a / 2, 3, 17);
                                                                                        return;
                                                                                    }
                                                                                    graphics.drawString(this.h[this.a[this.h].c[this.a[this.h].n] - 1], 6 + this.b, 3, 20);
                                                                                    if (6 + this.b + w.a.stringWidth(this.h[this.a[this.h].c[this.a[this.h].n] - 1]) > s.a) {
                                                                                        if (this.c < 3) {
                                                                                            this.c = (short)(this.c + 1);
                                                                                            return;
                                                                                        }
                                                                                        this.b = (short)(this.b - 3);
                                                                                        if (6 + this.b + w.a.stringWidth(this.h[this.a[this.h].c[this.a[this.h].n] - 1]) > s.a) return;
                                                                                        this.c = 0;
                                                                                        return;
                                                                                    }
                                                                                    if (this.c < 3) {
                                                                                        this.c = (short)(this.c + 1);
                                                                                        return;
                                                                                    }
                                                                                    if (this.b >= 0) return;
                                                                                    this.b = 0;
                                                                                    this.c = 0;
                                                                                    return;
                                                                                }
                                                                                if (this.c != 3) break block108;
                                                                                this.a(graphics, 2, 0 + this.x, s.a - 4);
                                                                                graphics.setColor(0);
                                                                                if (this.b == null) return;
                                                                                this.i = (short)graphics.getClipX();
                                                                                this.j = (short)graphics.getClipY();
                                                                                this.k = (short)graphics.getClipWidth();
                                                                                this.l = (short)graphics.getClipHeight();
                                                                                graphics.setClip((int)this.m, this.n - this.v, (int)this.o, this.p + this.v);
                                                                                n4 = this.n + this.j / this.l * this.w + this.q;
                                                                                if (n4 < this.n) {
                                                                                    int n11 = (this.n - n4) % this.w;
                                                                                    n3 = 0;
                                                                                    n3 = n11 > 0 ? (this.n - n4) / this.w + 1 : (this.n - n4) / this.w;
                                                                                    this.q = (short)(this.q + this.w * n3);
                                                                                } else if (n4 + 10 > this.n + this.p) {
                                                                                    int n12 = (n4 + 10 - this.n - this.p) % this.w;
                                                                                    n3 = 0;
                                                                                    n3 = n12 > 0 ? (n4 + 10 - this.n - this.p) / this.w + 1 : (n4 + 10 - this.n - this.p) / this.w;
                                                                                    this.q = (short)(this.q - this.w * n3);
                                                                                }
                                                                                n2 = 40;
                                                                                n3 = 20;
                                                                                if (s.a == 240) {
                                                                                    n2 = 8;
                                                                                    n3 = 6;
                                                                                }
                                                                                graphics.translate(n2, this.q - this.v);
                                                                                break block109;
                                                                            }
                                                                            if (this.c != 31) return;
                                                                            if (w.a.stringWidth(s.h[this.b[this.j][0] - 1]) >= s.a - 40) {
                                                                                this.a(graphics, -25, 0 + this.x, s.a - 50);
                                                                            } else {
                                                                                this.a(graphics, 2, 0 + this.x, s.a - 4);
                                                                            }
                                                                            graphics.setColor(0);
                                                                            if (this.a[this.h].e[0] < 10) {
                                                                                graphics.drawImage(this.f, (int)this.c[this.a[this.h].e[0]], this.d[this.a[this.h].e[0]] - this.a[this.a[this.h].e[0]].n + this.q, 33);
                                                                                if (6 + w.a.stringWidth(s.h[this.b[this.j][0] - 1]) <= s.a) {
                                                                                    graphics.drawString(s.h[this.b[this.j][0] - 1], s.a / 2, 3, 17);
                                                                                    return;
                                                                                }
                                                                                graphics.drawString(s.h[this.b[this.j][0] - 1], 6 + this.b, 3, 20);
                                                                                if (6 + this.b + w.a.stringWidth(s.h[this.b[this.j][0] - 1]) > s.a) {
                                                                                    if (this.c < 3) {
                                                                                        this.c = (short)(this.c + 1);
                                                                                        return;
                                                                                    }
                                                                                    this.b = (short)(this.b - 3);
                                                                                    if (6 + this.b + w.a.stringWidth(s.h[this.b[this.j][0] - 1]) > s.a) return;
                                                                                    this.c = 0;
                                                                                    return;
                                                                                }
                                                                                if (this.c < 3) {
                                                                                    this.c = (short)(this.c + 1);
                                                                                    return;
                                                                                }
                                                                                if (this.b >= 0) return;
                                                                                this.b = 0;
                                                                                this.c = 0;
                                                                                return;
                                                                            }
                                                                            if (this.a[this.h].e[0] < 10) return;
                                                                            if (this.a[this.h].a[3] <= 0) return;
                                                                            if (this.a[this.h].e.length != 1) break block110;
                                                                            if (this.a[this.h].e[0] < 10 || this.a[this.a[this.h].e[0] - 10][0] > 0) break block111;
                                                                            break block112;
                                                                        }
                                                                        if (this.b == 4) {
                                                                            if (w.a.stringWidth(this.a[this.a]) >= s.a - 40) {
                                                                                this.a(graphics, -25, 0 + this.x, s.a + 50);
                                                                            } else {
                                                                                this.a(graphics, 2, 0 + this.x, s.a - 4);
                                                                            }
                                                                            graphics.setColor(0);
                                                                            if (this.a != null && this.a < this.a.length) {
                                                                                if (this.a >= this.a.length) return;
                                                                                graphics.drawString(this.a[this.a], s.a / 2, 3, 17);
                                                                                return;
                                                                            }
                                                                            if (!GameMIDlet.self.debug) return;
                                                                            System.out.println("wininfo\u4e3a\u7a7a");
                                                                            return;
                                                                        }
                                                                        if (this.b != 5) return;
                                                                        this.a(graphics, 2, 0 + this.x, s.a - 4);
                                                                        graphics.setColor(0);
                                                                        if (this.b != null && this.e < this.b.length) {
                                                                            graphics.drawString(this.b[this.e], s.a / 2, 3, 17);
                                                                            return;
                                                                        }
                                                                        if (!GameMIDlet.self.debug) return;
                                                                        System.out.println("loseInfo\u4e3a\u7a7a");
                                                                        return;
                                                                    }
                                                                    for (int k = 0; k < this.a.length; ++k) {
                                                                        if (this.a[k][0] <= 0) continue;
                                                                        this.a[this.h].e[0] = (byte)(k + 10);
                                                                        bl = true;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!bl) return;
                                                                graphics.drawString(this.e[this.a[this.h].e[0] - 10], s.a / 2, 3, 17);
                                                                graphics.drawImage(this.f, (int)this.a[this.a[this.h].e[0] - 10], this.b[this.a[this.h].e[0] - 10] - this.d[this.a[this.h].e[0] - 10].getHeight() + this.q, 33);
                                                                return;
                                                            }
                                                            for (n6 = 0; this.a[this.h].c != null && n6 < this.a[this.h].c.length; ++n6) {
                                                                graphics.drawImage(c.a[this.a[this.h].c[n6] - 1], -5 + this.m + n6 % this.k * this.r, this.n + 2 + n6 / this.k * this.w, 20);
                                                                if (n6 == this.i) {
                                                                    w.a(graphics, this.g[this.a[this.h].c[n6] - 1], -3 + this.m + 15 + n6 % this.k * this.r, this.n + 2 + n6 / this.k * this.w, 14902310, 0xFFFFFF, 20);
                                                                    continue;
                                                                }
                                                                graphics.setColor(0);
                                                                graphics.drawString(this.g[this.a[this.h].c[n6] - 1], -3 + this.m + 15 + n6 % this.k * this.r, this.n + 2 + n6 / this.k * this.w, 20);
                                                            }
                                                            graphics.translate(-10, -(this.q - this.v));
                                                            graphics.setClip((int)this.i, (int)this.j, (int)this.k, (int)this.l);
                                                            graphics.setColor(0);
                                                            if (6 + w.a.stringWidth(this.h[this.a[this.h].c[this.a[this.h].n] - 1]) > s.a) break block113;
                                                            graphics.drawString(this.h[this.a[this.h].c[this.a[this.h].n] - 1], s.a / 2, 3, 17);
                                                            break block114;
                                                        }
                                                        graphics.drawString(this.h[this.a[this.h].c[this.a[this.h].n] - 1], 6 + this.b, 3, 20);
                                                        if (6 + this.b + w.a.stringWidth(this.h[this.a[this.h].c[this.a[this.h].n] - 1]) <= s.a) break block115;
                                                        if (this.c < 3) {
                                                            this.c = (short)(this.c + 1);
                                                            break block114;
                                                        } else {
                                                            this.b = (short)(this.b - 3);
                                                            if (6 + this.b + w.a.stringWidth(this.h[this.a[this.h].c[this.a[this.h].n] - 1]) <= s.a) {
                                                                this.c = 0;
                                                            }
                                                        }
                                                        break block114;
                                                    }
                                                    if (this.c < 3) {
                                                        this.c = (short)(this.c + 1);
                                                    } else if (this.b < 0) {
                                                        this.b = 0;
                                                        this.c = 0;
                                                    }
                                                }
                                                n6 = 5;
                                                if (GameMIDlet.self.phonemodel.equals("KG77")) {
                                                    n6 = -9;
                                                }
                                                graphics.translate(-5, n6);
                                                graphics.setColor(0xDDDDCC);
                                                graphics.fillRoundRect(s.a - 50, s.b - this.g - 18, 48, 17, 4, 4);
                                                graphics.setColor(0x333355);
                                                graphics.drawRoundRect(s.a - 50, s.b - this.g - 18, 48, 17, 4, 4);
                                                byte by = this.a[this.h].c[this.a[this.h].n];
                                                if (by == 9) {
                                                    this.p = w.a("/sys/xie.ps");
                                                } else if (by != 9) {
                                                    this.p = w.a("/sys/qi.ps");
                                                }
                                                if (this.p != null) {
                                                    graphics.drawImage(this.p, s.a - 48, s.b - this.g - 15, 20);
                                                }
                                                n5 = 0;
                                                n5 = by == 9 ? (int)o.a(this.a[this.h], this.a, this.a[this.h].c[this.a[this.h].n]) : (by == 12 ? (int)((short)this.a[this.h].a[5]) : (int)o.b(this.a[this.h], this.a, this.a[this.h].c[this.a[this.h].n]));
                                                if (GameMIDlet.self.cutImg) {
                                                    w.a(graphics, n5, s.a - 7, s.b - this.g - 13, this.b, 6, 24);
                                                } else {
                                                    w.a(graphics, n5, s.a - 7, s.b - this.g - 13, this.l, 6, 7, 24);
                                                }
                                                graphics.translate(5, -n6);
                                                if (this.q < 0) {
                                                    if (GameMIDlet.self.cutImg) {
                                                        graphics.drawImage(this.c[0], s.a / 2, this.n + this.q - 8, 17);
                                                    } else {
                                                        graphics.drawRegion(this.o, 0, 0, 11, 7, 0, s.a / 2, this.n + this.q - 8, 17);
                                                    }
                                                }
                                                if ((this.a[this.h].c == null ? 0 : this.a[this.h].c.length / this.k * w.a + this.q) <= this.p) return;
                                                if (GameMIDlet.self.cutImg) {
                                                    graphics.drawImage(this.c[1], s.a / 2, this.n + this.p + this.q - 8, 17);
                                                    return;
                                                }
                                                graphics.drawRegion(this.o, 11, 0, 11, 7, 0, s.a / 2, this.n + this.p + this.q - 8, 17);
                                                return;
                                            }
                                            for (int k = 0; k < this.a.length; ++k) {
                                                if (this.a[k][0] <= 0) continue;
                                                this.a[this.h].e[0] = (byte)(k + 10);
                                                break;
                                            }
                                        }
                                        graphics.setColor(0);
                                        graphics.drawString(this.e[this.a[this.h].e[0] - 10], s.a / 2, 3, 17);
                                    }
                                    int n13 = 0;
                                    while (n13 < this.a[this.h].e.length) {
                                        graphics.drawImage(this.f, (int)this.a[this.a[this.h].e[n13] - 10], this.b[this.a[this.h].e[n13] - 10] - this.d[this.a[this.h].e[n13] - 10].getHeight() + this.q, 33);
                                        ++n13;
                                    }
                                    return;
                                }
                                for (n4 = 0; this.b != null && n4 < this.b.length; ++n4) {
                                    graphics.drawImage(s.a[this.b[n4][0] - 1], this.m + n4 % this.l * this.s, this.n + 2 + n4 / this.l * this.w, 20);
                                    if (n4 == this.j) {
                                        w.a(graphics, s.g[this.b[n4][0] - 1], this.m + n3 + 15 + n4 % this.l * this.s, this.n + 2 + n4 / this.l * this.w, 14902310, 0xFFFFFF, 20);
                                    } else {
                                        graphics.setColor(0);
                                        graphics.drawString(s.g[this.b[n4][0] - 1], this.m + n3 + 15 + n4 % this.l * this.s, this.n + 2 + n4 / this.l * this.w, 20);
                                    }
                                    if (GameMIDlet.self.cutImg) {
                                        graphics.drawImage(this.n, this.m + n3 + 15 + n4 % this.l * this.s + w.a.stringWidth(s.g[this.b[n4][0] - 1]), this.n + 4 + n4 / this.l * this.w, 20);
                                    } else {
                                        graphics.drawRegion(this.m, 14, 0, 7, 7, 0, this.m + n3 + 15 + n4 % this.l * this.s + w.a.stringWidth(s.g[this.b[n4][0] - 1]), this.n + 4 + n4 / this.l * this.w, 20);
                                    }
                                    if (GameMIDlet.self.cutImg) {
                                        w.a(graphics, this.b[n4][1], n3 + 20 + n4 % this.l * this.s + w.a.stringWidth(s.g[this.b[n4][0] - 1]) + 5, this.n + 4 + n4 / this.l * this.w, this.b, 6, 20);
                                        continue;
                                    }
                                    w.a(graphics, (int)this.b[n4][1], n3 + 20 + n4 % this.l * this.s + w.a.stringWidth(s.g[this.b[n4][0] - 1]) + 5, this.n + 4 + n4 / this.l * this.w, this.l, 6, 7, 20);
                                }
                                graphics.translate(-n2, -(this.q - this.v));
                                graphics.setClip((int)this.i, (int)this.j, (int)this.k, (int)this.l);
                                graphics.setColor(0);
                                if (6 + w.a.stringWidth(s.h[this.b[this.j][0] - 1]) > s.a) break block116;
                                graphics.drawString(s.h[this.b[this.j][0] - 1], s.a / 2, 3, 17);
                                break block117;
                            }
                            graphics.drawString(s.h[this.b[this.j][0] - 1], 6 + this.b, 3, 20);
                            if (6 + this.b + w.a.stringWidth(s.h[this.b[this.j][0] - 1]) <= s.a) break block118;
                            if (this.c < 3) {
                                this.c = (short)(this.c + 1);
                                break block117;
                            } else {
                                this.b = (short)(this.b - 3);
                                if (6 + this.b + w.a.stringWidth(s.h[this.b[this.j][0] - 1]) <= s.a) {
                                    this.c = 0;
                                }
                            }
                            break block117;
                        }
                        if (this.c < 3) {
                            this.c = (short)(this.c + 1);
                        } else if (this.b < 0) {
                            this.b = 0;
                            this.c = 0;
                        }
                    }
                    if (this.q < 0) {
                        if (GameMIDlet.self.cutImg) {
                            graphics.drawImage(this.c[0], s.a / 2, this.n + this.q - 8, 17);
                        } else {
                            graphics.drawRegion(this.o, 0, 0, 11, 7, 0, s.a / 2, this.n + this.q - 8, 17);
                        }
                    }
                    if ((this.b == null ? 0 : this.b.length / this.l * w.a + this.q) <= this.p) return;
                    if (GameMIDlet.self.cutImg) {
                        graphics.drawImage(this.c[1], s.a / 2, this.n + this.p + this.q - 8, 17);
                        return;
                    }
                    graphics.drawRegion(this.o, 11, 0, 11, 7, 0, s.a / 2, this.n + this.p + this.q - 8, 17);
                    return;
                }
                for (int k = 0; k < this.a.length; ++k) {
                    if (this.a[k][0] <= 0) continue;
                    this.a[this.h].e[0] = (byte)(k + 10);
                    break;
                }
            }
            graphics.drawString(this.e[this.a[this.h].e[0] - 10], s.a / 2, 3, 17);
        }
        int n14 = 0;
        while (n14 < this.a[this.h].e.length) {
            graphics.drawImage(this.f, (int)this.a[this.a[this.h].e[n14] - 10], this.b[this.a[this.h].e[n14] - 10] - this.d[this.a[this.h].e[n14] - 10].getHeight() + this.q, 33);
            ++n14;
        }
    }

    private void c(Graphics graphics) {
        if (!this.h) {
            return;
        }
        if (this.b == 4) {
            for (int k = 0; k < this.l.length; ++k) {
                if (this.a[this.l[k]].a[3] > 0) {
                    this.a[this.l[k]].a.a(0);
                    bd bd2 = this.a[this.l[k]].a;
                    this.a[this.l[k]].a.b(this.p % bd2.a);
                    this.a[this.l[k]].a.a(graphics, this.c[this.l[k]], this.d[this.l[k]]);
                    continue;
                }
                this.a[this.l[k]].a.a(2);
                this.a[this.l[k]].a.b(0);
                this.a[this.l[k]].a.a(graphics, this.c[this.l[k]], this.d[this.l[k]]);
            }
            return;
        }
        for (int k = 0; this.l != null && k < this.l.length; ++k) {
            if (this.b == 2 && this.l[k] == this.h) {
                for (int i2 = 0; this.f != null && i2 < this.f.length; ++i2) {
                    if (this.f[i2][0] != this.a) continue;
                    byte by = this.f[i2][1];
                    byte by2 = this.f[i2][2];
                    byte by3 = this.f[i2][3];
                    byte by4 = this.f[i2][4];
                    byte by5 = this.f[i2][5];
                    byte by6 = this.f[i2][6];
                    if (by == 0 || by == 1 || by == 2) {
                        this.a(graphics, this.l[k]);
                        continue;
                    }
                    short s2 = 0;
                    short s3 = 0;
                    int n2 = 0;
                    short s4 = 0;
                    if (this.a[this.h].e[0] < 10) {
                        s2 = this.c[this.h];
                        s3 = this.d[this.h];
                        n2 = this.c[this.a[this.h].e[0]];
                        s4 = this.d[this.a[this.h].e[0]];
                    } else {
                        s2 = this.c[this.h];
                        s3 = this.d[this.h];
                        n2 = this.a[this.a[this.h].e[0] - 10] + this.d[this.a[this.h].e[0] - 10].getWidth() / 2;
                        s4 = this.b[this.a[this.h].e[0] - 10];
                    }
                    this.a[this.h].a.a(by);
                    this.a[this.h].a.b(by2);
                    this.a[this.h].a.a(graphics, s2 + (n2 - s2) * by3 / 100 + by4, s3 + (s4 - s3) * by5 / 100 + by6);
                }
                if (this.f != null) {
                    if (this.a <= this.f[this.f.length - 1][0]) continue;
                } else {
                    this.a(graphics, this.l[k]);
                    continue;
                }
            }
            this.a(graphics, this.l[k]);
        }
    }

    private void a(Graphics object, int n2) {
        if (this.a[n2].a[3] > 0) {
            if (this.a[n2].a[3] <= this.a[n2].a[33] / 2) {
                this.a[n2].a.a(1);
                bd bd2 = this.a[n2].a;
                this.a[n2].a.b(this.p % bd2.a);
                this.a[n2].a.a((Graphics)object, this.c[n2], this.d[n2]);
                short[] sArray = this.a[n2].a.a.a(1, 0, 0, 0, 0);
                object = sArray;
                if (sArray != null) {
                    this.a[n2].n = (short)object[3];
                }
                return;
            }
            this.a[n2].a.a(0);
            bd bd3 = this.a[n2].a;
            this.a[n2].a.b(this.p % bd3.a);
            this.a[n2].a.a((Graphics)object, this.c[n2] + this.f[n2], this.d[n2] + this.g[n2]);
            short[] sArray = this.a[n2].a.a.a(0, 0, 0, 0, 0);
            object = sArray;
            if (sArray != null) {
                this.a[n2].n = (short)object[3];
            }
            return;
        }
        this.a[n2].a.a(2);
        this.a[n2].a.b(0);
        this.a[n2].a.a((Graphics)object, this.c[n2], this.d[n2]);
        short[] sArray = this.a[n2].a.a.a(2, 0, 0, 0, 0);
        object = sArray;
        if (sArray != null) {
            this.a[n2].n = (short)object[3];
        }
    }

    private void a(Graphics graphics, int n2, int n3, int n4, int n5) {
        if (this.a == null) {
            return;
        }
        for (int k = 0; this.g != null && k < this.g.length; ++k) {
            if (this.g[k][0] != this.a) continue;
            byte by = this.g[k][1];
            byte by2 = this.g[k][2];
            byte by3 = this.g[k][3];
            byte by4 = this.g[k][4];
            byte by5 = this.g[k][5];
            this.a.b(by);
            this.a.a(graphics, n2 + (n4 - n2) * by2 / 100 + by3, n3 + (n5 - n3) * by4 / 100 + by5);
        }
    }

    private void b(Graphics graphics, int n2) {
        for (int k = 0; this.h != null && k < this.h.length; ++k) {
            int n3;
            if (this.h[k][0] != this.a) continue;
            byte by = this.h[k][1];
            if (n2 == 1) {
                for (n3 = 0; n3 < this.a.length; ++n3) {
                    if (this.a[n3][0] >= this.a[n3][9]) continue;
                    graphics.setColor(0xFF0000);
                    graphics.drawString(String.valueOf(this.a[n3][0] - this.a[n3][9]), (int)this.a[n3], this.b[n3] - this.d[n3].getHeight() + by, 33);
                }
                for (n3 = 0; n3 < this.a.length; ++n3) {
                    if (this.a[n3].a[3] > this.a[n3].c) {
                        graphics.setColor(0xFF0000);
                        graphics.drawString("+" + String.valueOf(this.a[n3].a[3] - this.a[n3].c), (int)this.c[n3], this.d[n3] - this.a[n3].n + by, 33);
                    } else if (this.a[n3].a[3] < this.a[n3].c) {
                        graphics.setColor(0xFF0000);
                        graphics.drawString(String.valueOf(this.a[n3].a[3] - this.a[n3].c), (int)this.c[n3], this.d[n3] - this.a[n3].n + by, 33);
                    }
                    if (this.a[n3].a[5] <= this.a[n3].d) continue;
                    graphics.setColor(61695);
                    graphics.drawString("+" + String.valueOf(this.a[n3].a[5] - this.a[n3].d), (int)this.c[n3], this.d[n3] - this.a[n3].n + by, 33);
                }
            }
            if (n2 != 2) continue;
            for (n3 = 0; n3 < this.a.length; ++n3) {
                if (this.a[n3][2] > this.a[n3][10]) {
                    graphics.setColor(61695);
                    graphics.drawString("+" + String.valueOf(this.a[n3][2] - this.a[n3][10]), (int)this.a[n3], this.b[n3] - this.d[n3].getHeight() + by, 33);
                }
                if (this.a[n3][0] <= this.a[n3][9]) continue;
                graphics.setColor(0xFF0000);
                graphics.drawString("+" + String.valueOf(this.a[n3][0] - this.a[n3][9]), (int)this.a[n3], this.b[n3] - this.d[n3].getHeight() + by, 33);
            }
            for (n3 = 0; n3 < this.a.length; ++n3) {
                if (this.m) {
                    graphics.setColor(61695);
                    graphics.drawString("miss", (int)this.c[this.s], this.d[this.s] - this.a[this.s].n + by, 33);
                    continue;
                }
                if (this.a[n3].a[3] > this.a[n3].c) {
                    graphics.setColor(0xFF0000);
                    graphics.drawString("+" + String.valueOf(this.a[n3].a[3] - this.a[n3].c), (int)this.c[n3], this.d[n3] - this.a[n3].n + 10 + by, 33);
                } else if (this.a[n3].a[3] < this.a[n3].c) {
                    graphics.setColor(0xFF0000);
                    graphics.drawString(String.valueOf(this.a[n3].a[3] - this.a[n3].c), (int)this.c[n3], this.d[n3] - this.a[n3].n + by, 33);
                }
                if (this.a[n3].a[5] > this.a[n3].d) {
                    graphics.setColor(61695);
                    graphics.drawString("+" + String.valueOf(this.a[n3].a[5] - this.a[n3].d), (int)this.c[n3], this.d[n3] - this.a[n3].n + 10 + by, 33);
                    continue;
                }
                if (this.a[n3].a[5] >= this.a[n3].d) continue;
                graphics.setColor(61695);
                graphics.drawString(String.valueOf(this.a[n3].a[5] - this.a[n3].d), (int)this.c[n3], this.d[n3] - this.a[n3].n + by, 33);
            }
        }
    }

    private void d(Graphics graphics) {
        if (!this.h) {
            return;
        }
        for (int k = 0; this.a != null && k < this.a.length; ++k) {
            if (this.a[k][11] != 1 || this.d[k] == null) continue;
            graphics.drawImage(this.d[k], this.a[k] + this.e[k], (int)this.b[k], 33);
        }
    }

    private void e(Graphics graphics) {
        if (!this.h) {
            return;
        }
        if (this.g == null) {
            this.f();
        }
        if (this.a[this.r][0] > 0) {
            if (this.a == 1) {
                this.e[this.r] = -3;
            }
            if (this.u == 0) {
                if (this.a == 2 && !this.i) {
                    this.e[this.r] = -5;
                    int n2 = this.a[this.s].d();
                    int n3 = 21474836;
                    n3 = Math.abs(this.a.nextInt()) / n3;
                    this.m = n3 <= n2;
                    if (!this.m) {
                        int n4;
                        int n5;
                        n3 = 0x19999999;
                        n2 = Math.abs(this.a.nextInt()) / n3;
                        if (this.a[this.h].f <= 0) {
                            this.a[this.h].l = 0;
                        } else {
                            this.a[this.h].f = (byte)(this.a[this.h].f - 1);
                        }
                        n2 = this.a[this.r][4] + this.a[this.r][12] - (this.a[this.s].b() + this.a[this.h].l) / 2 + n2;
                        n3 = 0;
                        if (this.a[this.s].g > 0) {
                            this.a[this.s].g = (byte)(this.a[this.s].g - 1);
                            n5 = 0;
                            for (n4 = 0; n4 < this.a[this.s].b.length; ++n4) {
                                if (this.a[this.s].b[n4].a != 4) continue;
                                n5 = (byte)n4;
                                break;
                            }
                            n3 = n2 * (20 + 4 * this.a[this.s].b[n5].b) / 100;
                            n2 -= n3;
                            if (GameMIDlet.self.debug) {
                                ba.a.a("\u4e7e\u5764\u5927\u632a\u79fb", (short)40);
                            }
                        }
                        if (n2 <= 0) {
                            n2 = 1;
                        }
                        this.a[this.s].a[3] = this.a[this.s].a[3] - n2;
                        if (this.a[this.s].a[3] < 0) {
                            this.a[this.s].a[3] = 0;
                        }
                        if (this.a[this.s].f) {
                            n5 = z.a(0, this.a.length);
                            if (this.a[n5][0] > 0) {
                                int[] nArray = this.a[n5];
                                nArray[0] = nArray[0] - n3;
                                if (this.a[n5][0] <= 0) {
                                    this.a[n5][0] = 1;
                                }
                            } else {
                                for (n4 = 0; n4 < this.a.length; ++n4) {
                                    if (this.a[n4][0] <= 0) continue;
                                    int[] nArray = this.a[n5];
                                    nArray[0] = nArray[0] - n3;
                                    if (this.a[n5][0] > 0) continue;
                                    this.a[n5][0] = 1;
                                }
                            }
                        }
                    }
                    this.i = true;
                } else if (this.a >= 3 && this.a <= 7) {
                    if (!this.m) {
                        this.f[this.s] = -6;
                    } else {
                        this.g[this.s] = -4;
                    }
                } else if (this.a == 8) {
                    this.e[this.r] = 0;
                    this.f[this.s] = 0;
                    this.g[this.s] = 0;
                }
                if (!this.m) {
                    this.a(graphics, this.a[this.r], this.b[this.r], this.c[this.s], this.d[this.s]);
                }
            } else if (this.u == 1) {
                if (this.a == 2 && !this.i) {
                    this.e[this.r] = 5;
                    int n6 = this.v - 1;
                    short[][] sArray = this.a;
                    short s2 = 0;
                    s2 = (short)(0 + sArray[n6 - 1][2]);
                    short s3 = s2;
                    if (this.a[this.r][2] >= s3) {
                        this.n = true;
                        this.a(this.v);
                    }
                    this.i = true;
                } else if (this.a >= 3 && this.a <= 7) {
                    if (this.n) {
                        this.f[this.s] = -6;
                    }
                } else if (this.a == 8) {
                    this.e[this.r] = 0;
                    this.f[this.s] = 0;
                    this.g[this.s] = 0;
                }
                if (this.n) {
                    this.a(graphics, this.a[this.r], this.b[this.r], this.c[this.s], this.d[this.s]);
                }
            }
            if (this.u == 1 && this.a >= 1 && this.a <= 6) {
                this.a(graphics, 2, 0 + this.x, s.a - 4);
                graphics.setColor(0);
                graphics.drawString(this.g[this.v - 1], s.a / 2, 3, 17);
            }
            this.b(graphics, 2);
        }
    }

    private static void l() {
        for (int k = 0; k < s.a.length; ++k) {
            s.a[k].e = 0;
            s.a[k].f = 0;
            s.a[k].g = 0;
            s.a[k].k = 0;
            s.a[k].l = 0;
            s.a[k].f = false;
            s.a[k].h = 0;
            s.a[k].i = 0;
            s.a[k].j = 0;
            s.a[k].k = 0;
        }
    }

    private void a(short[][] sArray) {
        int n2 = sArray.length + 1;
        for (int k = n2 / 2; k > 0; k /= 2) {
            for (int i2 = k; i2 < n2; ++i2) {
                int n3 = i2 - k;
                while (n3 >= k) {
                    short[] sArray2 = sArray[n3 - 1];
                    short[] sArray3 = sArray[n3 + k - 1];
                    if ((sArray2[1] < sArray3[1] ? 1 : (sArray2[1] > sArray3[1] ? -1 : 0)) > 0) {
                        sArray2 = sArray[n3 - 1];
                        sArray[n3 - 1] = sArray[n3 + k - 1];
                        sArray[n3 + k - 1] = sArray2;
                        n3 -= k;
                        continue;
                    }
                    n3 = 0;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(int n2) {
        int n3;
        int n4;
        block104: {
            byte by;
            short s2;
            block111: {
                block109: {
                    short s3;
                    int n5;
                    block103: {
                        short s4;
                        block107: {
                            String string;
                            block105: {
                                block110: {
                                    block108: {
                                        block106: {
                                            string = this.g[n2 - 1];
                                            if (this.b != 2) break block105;
                                            if (!string.equals("\u901a\u81c2\u62f3")) break block106;
                                            short s5 = o.b(this.a[this.h], this.a, n2);
                                            this.a[this.h].a[5] = this.a[this.h].a[5] - s5;
                                            s4 = o.c(this.a[this.h], this.j, n2);
                                            s5 = this.a[this.h].n;
                                            if (this.a[this.h].e > 0) {
                                                s4 = (short)(s4 + this.a[this.h].k);
                                                this.a[this.h].e = (byte)(this.a[this.h].e - 1);
                                            } else {
                                                this.a[this.h].k = 0;
                                            }
                                            if (!this.a[this.h].b[s5].a()) {
                                                int n6 = 0;
                                                n6 = s4 + 0;
                                                if (this.a[this.a[this.h].e[0] - 10][19] <= 0) {
                                                    this.a[this.a[this.h].e[0] - 10][18] = 0;
                                                } else {
                                                    int[] nArray = this.a[this.a[this.h].e[0] - 10];
                                                    nArray[19] = nArray[19] - 1;
                                                }
                                                if ((n6 -= (this.a[this.a[this.h].e[0] - 10][5] - this.a[this.a[this.h].e[0] - 10][18]) / 2) <= 0) {
                                                    n6 = 1;
                                                }
                                                int[] nArray = this.a[this.a[this.h].e[0] - 10];
                                                nArray[0] = nArray[0] - n6;
                                                if (this.a[this.a[this.h].e[0] - 10][0] >= 0) return;
                                                this.a[this.a[this.h].e[0] - 10][0] = 0;
                                                return;
                                            }
                                            break block107;
                                        }
                                        if (string.equals("\u9759\u5fc3\u8bc0")) {
                                            int n7 = o.b(this.a[this.h], this.a, n2);
                                            this.a[this.h].a[5] = this.a[this.h].a[5] - n7;
                                            byte by2 = this.a[this.h].n;
                                            if (!this.a[this.h].b[by2].a()) {
                                                n7 = o.d(this.a[this.h], this.j, n2);
                                                this.a[this.h].a[3] = this.a[this.h].a[3] + n7;
                                                short s6 = (short)this.a[this.h].e();
                                                if (this.a[this.h].a[3] <= s6) return;
                                                this.a[this.h].a[3] = s6;
                                                return;
                                            }
                                            n7 = 0;
                                            while (this.a != null) {
                                                if (n7 >= this.a.length) return;
                                                if (this.a[n7].a[3] > 0) {
                                                    short s7 = o.d(this.a[n7], this.j, n2);
                                                    this.a[n7].a[3] = this.a[n7].a[3] + s7;
                                                    short s8 = (short)this.a[n7].e();
                                                    if (this.a[n7].a[3] > s8) {
                                                        this.a[n7].a[3] = s8;
                                                    }
                                                }
                                                ++n7;
                                            }
                                            return;
                                        }
                                        if (string.equals("\u4e5d\u9633\u795e\u529f")) {
                                            int n8 = o.b(this.a[this.h], this.a, n2);
                                            this.a[this.h].a[5] = this.a[this.h].a[5] - n8;
                                            byte by3 = this.a[this.h].n;
                                            if (!this.a[this.h].b[by3].a()) {
                                                this.a[this.h].f = this.a[this.h].e = (byte)(this.a[this.h].b[by3].b / 3 + 2);
                                                this.a[this.h].k = o.e(this.a[this.h], this.j, n2);
                                                this.a[this.h].l = o.f(this.a[this.h], this.j, n2);
                                                return;
                                            }
                                            n8 = 0;
                                            while (this.a != null) {
                                                if (n8 >= this.a.length) return;
                                                this.a[n8].f = this.a[n8].e = (byte)(this.a[n8].b[by3].b / 3 + 2);
                                                this.a[n8].k = o.e(this.a[n8], this.j, n2);
                                                this.a[n8].l = o.f(this.a[n8], this.j, n2);
                                                ++n8;
                                            }
                                            return;
                                        }
                                        if (string.equals("\u4e7e\u5764\u5927\u632a\u79fb")) {
                                            if (this.a[this.h].h > 0) return;
                                            this.a[this.h].h = (byte)99;
                                            short s9 = o.b(this.a[this.h], this.a, n2);
                                            this.a[this.h].a[5] = this.a[this.h].a[5] - s9;
                                            byte by4 = this.a[this.h].n;
                                            this.a[this.h].g = (byte)(this.a[this.h].b[by4].b / 3 + 2);
                                            if (this.a[this.h].b[by4].a()) {
                                                this.a[this.h].f = true;
                                                return;
                                            }
                                            this.a[this.h].f = false;
                                            return;
                                        }
                                        if (string.equals("\u516b\u5366\u638c")) {
                                            short s10 = o.b(this.a[this.h], this.a, n2);
                                            this.a[this.h].a[5] = this.a[this.h].a[5] - s10;
                                            short s11 = o.c(this.a[this.h], this.j, n2);
                                            if (this.a[this.h].e > 0) {
                                                s11 = (short)(s11 + this.a[this.h].k);
                                                this.a[this.h].e = (byte)(this.a[this.h].e - 1);
                                            } else {
                                                this.a[this.h].k = 0;
                                            }
                                            int[] nArray = this.a[this.a[this.h].e[0] - 10];
                                            nArray[0] = nArray[0] - s11;
                                            if (this.a[this.a[this.h].e[0] - 10][0] >= 0) return;
                                            this.a[this.a[this.h].e[0] - 10][0] = 0;
                                            return;
                                        }
                                        if (!string.equals("\u5929\u5c71\u6298\u6885\u624b")) break block108;
                                        n5 = o.b(this.a[this.h], this.a, n2);
                                        this.a[this.h].a[5] = this.a[this.h].a[5] - n5;
                                        s3 = o.c(this.a[this.h], this.j, n2);
                                        if (this.a[this.h].e > 0) {
                                            s3 = (short)(s3 + this.a[this.h].k);
                                            this.a[this.h].e = (byte)(this.a[this.h].e - 1);
                                            break block103;
                                        } else {
                                            this.a[this.h].k = 0;
                                        }
                                        break block103;
                                    }
                                    if (string.equals("\u5c11\u6797\u9f99\u6293\u624b")) {
                                        int n9 = o.b(this.a[this.h], this.a, n2);
                                        this.a[this.h].a[5] = this.a[this.h].a[5] - n9;
                                        short s12 = o.c(this.a[this.h], this.j, n2);
                                        n9 = 0;
                                        n9 = s12 + 0;
                                        if (this.a[this.h].e > 0) {
                                            n9 += this.a[this.h].k;
                                            this.a[this.h].e = (byte)(this.a[this.h].e - 1);
                                        } else {
                                            this.a[this.h].k = 0;
                                        }
                                        byte by5 = this.a[this.h].n;
                                        this.a[this.a[this.h].e[0] - 10][18] = (short)((15 + 3 * this.a[this.h].b[by5].b) * this.a[this.a[this.h].e[0] - 10][5] / 100);
                                        this.a[this.a[this.h].e[0] - 10][19] = this.a[this.h].b[by5].b / 3 + 2;
                                        if ((n9 -= (this.a[this.a[this.h].e[0] - 10][5] - this.a[this.a[this.h].e[0] - 10][18]) / 2) <= 0) {
                                            n9 = 1;
                                        }
                                        int[] nArray = this.a[this.a[this.h].e[0] - 10];
                                        nArray[0] = nArray[0] - n9;
                                        if (this.a[this.a[this.h].e[0] - 10][0] >= 0) return;
                                        this.a[this.a[this.h].e[0] - 10][0] = 0;
                                        return;
                                    }
                                    if (string.equals("\u964d\u9f99\u5341\u516b\u638c")) break block109;
                                    if (string.equals("\u4e03\u4f24\u62f3")) {
                                        short s13 = o.a(this.a[this.h], this.a, n2);
                                        this.a[this.h].a[3] = this.a[this.h].a[3] - s13;
                                        short s14 = o.c(this.a[this.h], this.j, n2);
                                        s13 = (short)(this.a[this.a[this.h].e[0] - 10][2] * 20 / 100);
                                        int[] nArray = this.a[this.a[this.h].e[0] - 10];
                                        nArray[2] = nArray[2] - s13;
                                        short s15 = (short)(s13 * (30 + 10 * this.a[this.h].b[this.a[this.h].n].b) / 100);
                                        int n10 = 0;
                                        n10 = 0 + (s14 + s15);
                                        if (this.a[this.h].e > 0) {
                                            n10 += this.a[this.h].k;
                                            this.a[this.h].e = (byte)(this.a[this.h].e - 1);
                                        } else {
                                            this.a[this.h].k = 0;
                                        }
                                        if (this.a[this.a[this.h].e[0] - 10][19] <= 0) {
                                            this.a[this.a[this.h].e[0] - 10][18] = 0;
                                        } else {
                                            int[] nArray2 = this.a[this.a[this.h].e[0] - 10];
                                            nArray2[19] = nArray2[19] - 1;
                                        }
                                        if ((n10 -= (this.a[this.a[this.h].e[0] - 10][5] - this.a[this.a[this.h].e[0] - 10][18]) / 2) <= 0) {
                                            n10 = 1;
                                        }
                                        int[] nArray3 = this.a[this.a[this.h].e[0] - 10];
                                        nArray3[0] = nArray3[0] - n10;
                                        if (this.a[this.a[this.h].e[0] - 10][0] >= 0) return;
                                        this.a[this.a[this.h].e[0] - 10][0] = 0;
                                        return;
                                    }
                                    if (!string.equals("\u72ee\u5b50\u543c")) break block110;
                                    if (this.a[this.h].i > 0) return;
                                    this.a[this.h].i = (byte)3;
                                    short s16 = o.b(this.a[this.h], this.a, n2);
                                    this.a[this.h].a[5] = this.a[this.h].a[5] - s16;
                                    s2 = o.c(this.a[this.h], this.j, n2);
                                    s16 = this.a[this.h].n;
                                    by = (byte)(20 + 4 * this.a[this.h].b[s16].b);
                                    if (by > 75) {
                                        by = 75;
                                    }
                                    break block111;
                                }
                                if (string.equals("\u5317\u51a5\u795e\u529f")) {
                                    if (this.a[this.h].j > 0) return;
                                    this.a[this.h].j = (byte)99;
                                    short s17 = o.b(this.a[this.h], this.a, n2);
                                    this.a[this.h].a[5] = this.a[this.h].a[5] - s17;
                                    int n11 = this.a[this.a[this.h].e[0] - 10][0];
                                    int n12 = n2;
                                    short[][] sArray = this.j;
                                    g g2 = this.a[this.h];
                                    short s18 = 0;
                                    s18 = (short)(0 + (sArray[n12 - 1][0] + sArray[n12 - 1][1] * g2.b[g2.n].b) * n11 / 100);
                                    s18 = (short)(s18 + sArray[n12 - 1][2]);
                                    s18 = (short)(s18 + sArray[n12 - 1][3] * g2.b[g2.n].b);
                                    n12 = s18;
                                    int n13 = 0;
                                    n13 = n12 + 0;
                                    int[] nArray = this.a[this.a[this.h].e[0] - 10];
                                    nArray[0] = nArray[0] - n13;
                                    n11 = n12;
                                    s18 = (short)(this.a[this.h].a[33] * 50 / 100);
                                    if (n11 > s18) {
                                        n11 = s18;
                                    }
                                    if (this.a[this.h].a[3] + n11 > this.a[this.h].a[33]) {
                                        this.a[this.h].a[3] = this.a[this.h].a[33];
                                        return;
                                    }
                                    this.a[this.h].a[3] = this.a[this.h].a[3] + n11;
                                    return;
                                }
                                if (string.equals("\u4e7e\u5764\u592a\u6781")) {
                                    if (this.a[this.h].k > 0) return;
                                    this.a[this.h].k = (byte)3;
                                    short s19 = (short)this.a[this.h].a[5];
                                    this.a[this.h].a[5] = 0;
                                    byte by6 = this.a[this.h].n;
                                    s19 = (short)(s19 * (20 + 2 * this.a[this.h].b[by6].b) / 20 + 200 + 50 * this.a[this.h].b[by6].b);
                                    if (this.a[this.h].e > 0) {
                                        s19 = (short)(s19 + this.a[this.h].k);
                                        this.a[this.h].e = (byte)(this.a[this.h].e - 1);
                                    } else {
                                        this.a[this.h].k = 0;
                                    }
                                    int n14 = 0;
                                    while (this.a != null) {
                                        if (n14 >= this.a.length) return;
                                        int n15 = 0;
                                        n15 = s19 + 0;
                                        if (n15 <= 0) {
                                            n15 = 1;
                                        }
                                        int[] nArray = this.a[n14];
                                        nArray[0] = nArray[0] - n15;
                                        if (this.a[n14][0] < 0) {
                                            this.a[n14][0] = 0;
                                        }
                                        ++n14;
                                    }
                                    return;
                                }
                                if (string.equals("\u5ce8\u5d4b\u638c\u6cd5")) {
                                    int n16 = o.b(this.a[this.h], this.a, n2);
                                    this.a[this.h].a[5] = this.a[this.h].a[5] - n16;
                                    int n17 = o.c(this.a[this.h], this.j, n2);
                                    if (this.a[this.h].e > 0) {
                                        n17 = (short)(n17 + this.a[this.h].k);
                                        this.a[this.h].e = (byte)(this.a[this.h].e - 1);
                                    } else {
                                        this.a[this.h].k = 0;
                                    }
                                    n16 = n17;
                                    if (this.a[this.a[this.h].e[0] - 10][19] <= 0) {
                                        this.a[this.a[this.h].e[0] - 10][18] = 0;
                                    } else {
                                        int[] nArray = this.a[this.a[this.h].e[0] - 10];
                                        nArray[19] = nArray[19] - 1;
                                    }
                                    if ((n16 -= (this.a[this.a[this.h].e[0] - 10][5] - this.a[this.a[this.h].e[0] - 10][18]) / 2) <= 0) {
                                        n16 = 1;
                                    }
                                    int[] nArray = this.a[this.a[this.h].e[0] - 10];
                                    nArray[0] = nArray[0] - n16;
                                    if (this.a[this.a[this.h].e[0] - 10][0] >= 0) return;
                                    this.a[this.a[this.h].e[0] - 10][0] = 0;
                                    return;
                                }
                                if (!string.equals("\u5730\u85cf\u5200\u6cd5")) return;
                                n4 = o.b(this.a[this.h], this.a, n2);
                                this.a[this.h].a[5] = this.a[this.h].a[5] - n4;
                                n3 = o.c(this.a[this.h], this.j, n2);
                                if (this.a[this.h].e > 0) {
                                    n3 = (short)(n3 + this.a[this.h].k);
                                    this.a[this.h].e = (byte)(this.a[this.h].e - 1);
                                    break block104;
                                } else {
                                    this.a[this.h].k = 0;
                                }
                                break block104;
                            }
                            if (this.b != 3) return;
                            if (string.equals("\u9ed1\u864e\u6dd8\u5fc3")) {
                                int[] nArray = this.a[this.r];
                                nArray[2] = nArray[2] - this.a[n2 - 1][2];
                                if (this.a[this.s].a[3] > 0) {
                                    this.a[this.s].a[3] = this.a[this.s].a[3] - this.j[n2 - 1][2];
                                    short s20 = (short)((this.a[this.h].l + this.a[this.h].b()) / 2);
                                    this.a[this.s].a[3] = this.j[n2 - 1][2] < s20 ? this.a[this.s].a[3] + (this.j[n2 - 1][2] - 1) : this.a[this.s].a[3] + s20;
                                    if (this.a[this.h].f > 0) {
                                        this.a[this.h].f = (byte)(this.a[this.h].f - 1);
                                    } else {
                                        this.a[this.h].k = 0;
                                    }
                                    if (this.a[this.s].a[3] < 0) {
                                        this.a[this.s].a[3] = 0;
                                    }
                                }
                                ba.a.a("\u9ed1\u864e\u6dd8\u5fc3", (short)30);
                                return;
                            }
                            if (string.equals("\u591c\u6218\u516b\u65b9")) {
                                int[] nArray = this.a[this.r];
                                nArray[2] = nArray[2] - this.a[n2 - 1][2];
                                if (this.a[this.s].a[3] > 0) {
                                    this.a[this.s].a[3] = this.a[this.s].a[3] - this.a[this.s].a[33] * 35 / 100;
                                    if (this.a[this.s].a[3] < 0) {
                                        this.a[this.s].a[3] = 0;
                                    }
                                }
                                ba.a.a("\u591c\u6218\u516b\u65b9", (short)30);
                                return;
                            }
                            if (string.equals("\u5377\u77f3\u7834\u5c71")) {
                                int[] nArray = this.a[this.r];
                                nArray[2] = nArray[2] - this.a[n2 - 1][2];
                                for (int k = 0; this.a != null && k < this.a.length; ++k) {
                                    if (this.a[k].a[3] <= 0) continue;
                                    this.a[k].a[3] = this.a[k].a[3] - this.a[k].a[33] * 15 / 100;
                                    if (this.a[k].a[3] >= 0) continue;
                                    this.a[k].a[3] = 0;
                                }
                                ba.a.a("\u5377\u77f3\u7834\u5c71", (short)30);
                                return;
                            }
                            if (string.equals("\u65e0\u76f8\u52ab\u6307")) {
                                int[] nArray = this.a[this.r];
                                nArray[2] = nArray[2] - this.a[n2 - 1][2];
                                for (int k = 0; this.a != null && k < this.a.length; ++k) {
                                    if (this.a[k].a[3] <= 0) continue;
                                    this.a[k].a[3] = this.a[k].a[3] - this.a[k].a[33] * 30 / 100;
                                    if (this.a[k].a[3] < 0) {
                                        this.a[k].a[3] = 0;
                                    }
                                    this.a[k].a[5] = this.a[k].a[5] - this.a[k].a[5] / 3;
                                    if (this.a[k].a[5] >= 0) continue;
                                    this.a[k].a[5] = 0;
                                }
                                ba.a.a("\u65e0\u76f8\u52ab\u6307", (short)30);
                                return;
                            }
                            if (string.equals("\u6495\u5929\u88c2\u5730")) {
                                int[] nArray = this.a[this.r];
                                nArray[2] = nArray[2] - this.a[n2 - 1][2];
                                if (this.a[this.s].a[3] > 0) {
                                    this.a[this.s].a[3] = 1;
                                    int[] nArray4 = this.a[this.r];
                                    nArray4[0] = nArray4[0] - this.a[this.r][0] / 10;
                                }
                                ba.a.a("\u6495\u5929\u88c2\u5730", (short)30);
                                return;
                            }
                            if (string.equals("\u5982\u6765\u795e\u638c")) {
                                int[] nArray = this.a[this.r];
                                nArray[2] = nArray[2] - this.a[n2 - 1][2];
                                if (this.a[this.s].a[3] > 0) {
                                    this.a[this.s].a[3] = this.a[this.s].a[3] - (this.a[this.s].a() << 1);
                                    if (this.a[this.s].a[3] < 0) {
                                        this.a[this.s].a[3] = 0;
                                    }
                                }
                                ba.a.a("\u5982\u6765\u795e\u638c", (short)30);
                                return;
                            }
                            if (string.equals("\u822c\u82e5\u795e\u529f")) {
                                int[] nArray = this.a[this.r];
                                nArray[2] = nArray[2] - this.a[n2 - 1][2];
                                if (this.a[this.s].a[3] > 0) {
                                    this.a[this.s].a[3] = this.a[this.s].a[3] - this.a[this.s].a[33] / 2;
                                    this.a[this.s].a[5] = 0;
                                    if (this.a[this.s].a[3] < 0) {
                                        this.a[this.s].a[3] = 0;
                                    }
                                }
                                ba.a.a("\u822c\u82e5\u795e\u529f", (short)30);
                                return;
                            }
                            if (!string.equals("\u7d2b\u971e\u795e\u529f")) return;
                            int[] nArray = this.a[this.r];
                            nArray[2] = nArray[2] - this.a[n2 - 1][2];
                            for (int k = 0; this.a != null && k < this.a.length; ++k) {
                                if (this.a[k].a[3] <= 0) continue;
                                this.a[k].a[3] = this.a[k].a[3] - (this.a[k].a[4] << 1) / 5;
                                if (this.a[k].a[3] < 0) {
                                    this.a[k].a[3] = 0;
                                }
                                this.a[k].a[5] = this.a[k].a[5] - this.a[k].a[5] / 3;
                                if (this.a[k].a[5] >= 0) continue;
                                this.a[k].a[5] = 0;
                            }
                            ba.a.a("\u7d2b\u971e\u795e\u529f", (short)30);
                            return;
                        }
                        int n18 = 0;
                        while (this.a != null) {
                            if (n18 >= this.a.length) return;
                            int n19 = 0;
                            n19 = s4 + 0;
                            if (this.a[n18][19] <= 0) {
                                this.a[n18][18] = 0;
                            } else {
                                int[] nArray = this.a[n18];
                                nArray[19] = nArray[19] - 1;
                            }
                            if ((n19 -= (this.a[n18][5] - this.a[n18][18]) / 2) <= 0) {
                                n19 = 1;
                            }
                            int[] nArray = this.a[n18];
                            nArray[0] = nArray[0] - n19;
                            if (this.a[n18][0] < 0) {
                                this.a[n18][0] = 0;
                            }
                            ++n18;
                        }
                        return;
                    }
                    n5 = 0;
                    while (this.a != null) {
                        if (n5 >= this.a.length) return;
                        int n20 = 0;
                        n20 = s3 + 0;
                        if (this.a[n5][19] <= 0) {
                            this.a[n5][18] = 0;
                        } else {
                            int[] nArray = this.a[n5];
                            nArray[19] = nArray[19] - 1;
                        }
                        if ((n20 -= (this.a[n5][5] - this.a[n5][18]) / 2) <= 0) {
                            n20 = 1;
                        }
                        int[] nArray = this.a[n5];
                        nArray[0] = nArray[0] - n20;
                        if (this.a[n5][0] < 0) {
                            this.a[n5][0] = 0;
                        }
                        ++n5;
                    }
                    return;
                }
                short s21 = o.b(this.a[this.h], this.a, n2);
                this.a[this.h].a[5] = this.a[this.h].a[5] - s21;
                short s22 = o.c(this.a[this.h], this.j, n2);
                s21 = this.a[this.h].n;
                byte by7 = (byte)(10 + 2 * this.a[this.h].b[s21].b);
                int n21 = 0;
                while (this.a != null) {
                    if (n21 >= this.a.length) return;
                    n2 = 0;
                    byte by8 = (byte)z.a(1, 100);
                    n2 = by8;
                    n2 = by8 <= by7 ? 0 + (s22 << 1) : s22 + 0;
                    if (this.a[this.h].e > 0) {
                        n2 += this.a[this.h].k;
                        this.a[this.h].e = (byte)(this.a[this.h].e - 1);
                    } else {
                        this.a[this.h].k = 0;
                    }
                    if (this.a[n21][19] <= 0) {
                        this.a[n21][18] = 0;
                    } else {
                        int[] nArray = this.a[n21];
                        nArray[19] = nArray[19] - 1;
                    }
                    if ((n2 -= (this.a[n21][5] - this.a[n21][18]) / 2) <= 0) {
                        n2 = 1;
                    }
                    int[] nArray = this.a[n21];
                    nArray[0] = nArray[0] - n2;
                    if (this.a[n21][0] < 0) {
                        this.a[n21][0] = 0;
                    }
                    ++n21;
                }
                return;
            }
            int n22 = 0;
            while (this.a != null) {
                if (n22 >= this.a.length) return;
                n2 = 0;
                n2 = s2 + 0;
                if (this.a[this.h].e > 0) {
                    n2 += this.a[this.h].k;
                    this.a[this.h].e = (byte)(this.a[this.h].e - 1);
                } else {
                    this.a[this.h].k = 0;
                }
                if (this.a[n22][19] <= 0) {
                    this.a[n22][18] = 0;
                } else {
                    int[] nArray = this.a[n22];
                    nArray[19] = nArray[19] - 1;
                }
                if ((n2 -= (this.a[n22][5] - this.a[n22][18]) / 2) <= 0) {
                    n2 = 1;
                }
                int[] nArray = this.a[n22];
                nArray[0] = nArray[0] - n2;
                if (this.a[n22][0] < 0) {
                    this.a[n22][0] = 0;
                }
                byte by9 = (byte)z.a(1, 100);
                n2 = by9;
                if (by9 <= by) {
                    if (GameMIDlet.self.debug) {
                        ba.a.a("\u5168\u90e8\u88ab\u543c\u6655", (short)40);
                    }
                    this.a[n22][20] = 1;
                }
                ++n22;
            }
            return;
        }
        n4 = 0;
        while (this.a != null) {
            if (n4 >= this.a.length) return;
            int n23 = n3;
            if (this.a[n4][19] <= 0) {
                this.a[n4][18] = 0;
            } else {
                int[] nArray = this.a[n4];
                nArray[19] = nArray[19] - 1;
            }
            if ((n23 -= (this.a[n4][5] - this.a[n4][19]) / 2) <= 0) {
                n23 = 1;
            }
            int[] nArray = this.a[n4];
            nArray[0] = nArray[0] - n23;
            if (this.a[n4][0] < 0) {
                this.a[n4][0] = 0;
            }
            ++n4;
        }
    }

    public final byte[] a() {
        int n2;
        Object var1_1 = null;
        int n3 = 0;
        for (n2 = 0; n2 < this.a.length; ++n2) {
            if (this.a[n2][0] <= 0) continue;
            ++n3;
        }
        byte[] byArray = new byte[n3];
        n2 = 0;
        for (int k = 0; k < this.a.length; ++k) {
            if (this.a[k][0] <= 0) continue;
            byArray[n2] = (byte)(k + 10);
            ++n2;
        }
        return byArray;
    }

    private void f(Graphics graphics) {
        if (this.d == null) {
            this.d = w.a("/sys/cloudCursor.ps");
        }
        graphics.setColor(0xDDDDCC);
        graphics.fillRoundRect(0, 0, (int)s.a, (int)s.b, 5, 5);
        graphics.setColor(3487570);
        graphics.drawRoundRect(0, 0, (int)s.a, (int)s.b, 5, 5);
        graphics.setColor(0);
        graphics.drawString("\u53d1\u77ed\u4fe1\u6218\u6597\u590d\u6d3b", s.a / 2, 5, 17);
        for (int k = 0; c != null && k < c.length; ++k) {
            graphics.drawString(c[k], 3, 5 + (w.a.getHeight() << 1) + k * w.a.getHeight(), 20);
        }
        if (this.m == 0) {
            w.a(graphics, "\u7834\u89e3", s.a - w.a.stringWidth("\u7834\u89e3\u3000\u3000\u79bb\u5f00 "), s.b - 2, 14902310, 0xFFFFFF, 36);
            graphics.setColor(0);
            graphics.drawString("\u79bb\u5f00", s.a - w.a.stringWidth("\u79bb\u5f00 "), s.b - 2, 36);
            graphics.drawImage(this.d, s.a - w.a.stringWidth("\u7834\u89e3\u3000\u3000\u79bb\u5f00 "), s.b - 2 - w.a.getHeight(), 24);
            return;
        }
        graphics.setColor(0);
        graphics.drawString("\u7834\u89e3", s.a - w.a.stringWidth("\u7834\u89e3\u3000\u3000\u79bb\u5f00 "), s.b - 2, 36);
        w.a(graphics, "\u79bb\u5f00", s.a - w.a.stringWidth("\u79bb\u5f00 "), s.b - 2, 14902310, 0xFFFFFF, 36);
        graphics.drawImage(this.d, s.a - w.a.stringWidth("\u79bb\u5f00 "), s.b - 2 - w.a.getHeight(), 24);
    }

    public final void d() {
        if (GameMIDlet.self.playMusic) {
            ba.a.j();
            if (s.f != null && !s.f.equals("")) {
                if (ba.a.a == null) {
                    ba.a.a = new v();
                }
                ba.a.a.a(s.f);
                ba.a.a.a(1);
                ba.a.a.b(s.d);
                ba.a.a.a();
            }
        }
        this.b = this.d ? new String[]{"\u6218\u6597\u5931\u8d25"} : new String[]{"\u6218\u6597\u5931\u8d25", "\u91d1\u94b1\u635f\u5931\u4e00\u534a", "\u81ea\u52a8\u56de\u6751"};
        this.e = 0;
        this.b = (byte)5;
        s.a(this.a);
        if (((ar)s.a[0]).r == 2) {
            ((ar)s.a[0]).r = 1;
            s.a(s.a);
            for (int k = 0; k < ba.a.b.a.length; ++k) {
                if (ba.a.b.a[k].s != 5 || ((y)ba.a.b.a[k]).a != 101 && ((y)ba.a.b.a[k]).a != 102) continue;
                ((y)ba.a.b.a[k]).a = 0;
                if (!w.a(s.d, (int)((y)ba.a.b.a[k]).a)) continue;
                s.d = w.a(s.d, (int)((y)ba.a.b.a[k]).a);
            }
        }
    }

    public final void e() {
        this.g();
        this.j();
        this.c = this.b;
        if (this.c) {
            this.t = 0;
            this.a = 0;
            this.c();
            return;
        }
        this.b = 1;
        this.c = 0;
        this.t = 0;
        this.a = 0;
        this.g = 0;
        this.h = this.a[this.g];
        if (this.a[this.h].a[3] <= 0) {
            for (int k = 0; k < this.a.length; ++k) {
                if (this.a[this.a[k]].a[3] <= 0) continue;
                this.g = (byte)k;
                this.h = this.a[this.g];
                break;
            }
        }
        this.d = 1;
    }

    static Image[] a(al al2) {
        return al2.d;
    }

    static {
        z = 1;
        A = (byte)2;
    }
}
