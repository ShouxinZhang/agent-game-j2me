/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.Serializable;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class t {
    public byte a;
    public byte b;
    boolean a;
    boolean b;
    public boolean c;
    public boolean d;
    public static boolean e;
    private byte g;
    private byte h;
    private Image b;
    private Image c;
    private Image d;
    private long b;
    private long c;
    private long d;
    private String b;
    public bb a;
    private bb c;
    public bb b;
    private bb d;
    public short a;
    public short b;
    private byte i;
    private byte j;
    public short c;
    public short d;
    private m a;
    private e[][] a;
    private e b;
    private e c;
    g a;
    boolean f;
    aq a;
    ak a;
    boolean g;
    boolean h;
    e a;
    boolean i;
    j a;
    boolean j;
    a a;
    ah a;
    public al a;
    aa a;
    ae a;
    u a;
    public byte c;
    public String[] a;
    private Image e;
    private Image f;
    private int e;
    private int f;
    public static byte d;
    private boolean n;
    private byte k;
    private Image g;
    private String c;
    private String[] c;
    private int g;
    private int h;
    private boolean o;
    private int i;
    private static boolean p;
    protected int a;
    protected int b;
    private boolean q;
    private byte l;
    public v a;
    private String d;
    private boolean r;
    public Image a;
    public int c;
    public int d;
    public long a;
    private short e;
    private short f;
    private boolean s;
    private byte m;
    public boolean k;
    public byte e;
    public boolean l;
    public String[] b;
    public short[][] a;
    private boolean t = false;
    private boolean u = false;
    public static boolean m;
    private boolean v;
    private byte n;
    private byte[] a;
    private Runtime a;
    private boolean w;
    private boolean x;
    private boolean y;
    private byte o;
    private g b;
    public String a = Runtime.getRuntime();
    public byte f = false;
    private boolean z;
    private byte p;
    private byte q = (byte)-1;
    private e d;
    private byte r;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean A;
    private String e = 1;
    private short g = false;
    private static boolean B;
    private String[] d;
    private short h = (short)8;
    private short i = 0;
    private short j = (short)160;
    private short k = (short)(w.a + 6);
    private static boolean C;
    private short l = false;
    private short m = (short)10;
    private boolean D = false;
    private short n = 0;
    private boolean E = false;
    private short o = 0;
    private byte s = 0;

    public final void a() {
        Object object;
        int n;
        this.c = true;
        this.l();
        if (this.a != null && !this.a.a.equals(s.b)) {
            this.a.b();
            this.a.c();
        }
        Object var1_1 = null;
        var1_1 = null;
        Object var2_4 = null;
        int n2 = 0;
        byte by = 0;
        short s2 = 0;
        short s3 = 0;
        this.c = 0;
        this.d = 0;
        this.b = Runtime.getRuntime().freeMemory();
        this.c = Runtime.getRuntime().freeMemory();
        this.d = this.b - this.c > 0L ? this.b - this.c : 0L;
        Object object2 = new ao();
        ((ao)object2).a(this.b);
        this.r = false;
        if (this.d != null && this.d.equals(this.b) && d < 0) {
            this.r = true;
        }
        this.d = this.b;
        this.g = 0;
        System.gc();
        this.c = Runtime.getRuntime().freeMemory();
        this.d = this.b - this.c > 0L ? this.b - this.c : 0L;
        this.g = (byte)10;
        this.a = ((ao)object2).a;
        this.b = ((ao)object2).b;
        this.i = 0;
        if (this.a < s.a) {
            this.i = (byte)(s.a - this.a >> 1);
        }
        this.j = 0;
        if (this.b < s.b) {
            this.j = (byte)(s.b - this.b >> 1);
        }
        if (GameMIDlet.self.cacheFullScene) {
            s2 = this.a;
            s3 = this.b;
        } else {
            s2 = (short)(s.a + 32);
            s3 = (short)(s.b + 32);
        }
        if (GameMIDlet.self.debug) {
            System.out.println("\u88c5\u8f7dPIC\u8d44\u6e90\u7684\u56fe\u7247" + this.a.freeMemory());
        }
        ((ao)object2).b();
        this.c = Runtime.getRuntime().freeMemory();
        this.d = this.b - this.c > 0L ? this.b - this.c : 0L;
        this.g = (byte)60;
        if (GameMIDlet.self.debug) {
            System.out.println("\u751f\u6210\u80cc\u666f\u5c42" + this.a.freeMemory());
        }
        ((ao)object2).a();
        this.c = Runtime.getRuntime().freeMemory();
        long l2 = this.d = this.b - this.c > 0L ? this.b - this.c : 0L;
        if (GameMIDlet.self.debug) {
            System.out.println("\u5efa\u89d2\u8272\u5c42\u7ba1\u7406\u5668" + this.a.freeMemory());
        }
        this.b = null;
        this.b = new bb();
        if (GameMIDlet.self.debug) {
            System.out.println("\u5efa\u524d\u666f\u5c42\u7ba1\u7406\u5668" + this.a.freeMemory());
        }
        this.c = null;
        this.c = new bb();
        this.d = null;
        if (GameMIDlet.self.debug) {
            System.out.println("\u5efa\u98de\u884c\u5c42\u7ba1\u7406\u5668" + this.a.freeMemory());
        }
        this.a = null;
        this.a = new bb();
        this.c = Runtime.getRuntime().freeMemory();
        this.d = this.b - this.c > 0L ? this.b - this.c : 0L;
        this.g = (byte)70;
        this.a = null;
        if (GameMIDlet.self.debug) {
            System.out.println("\u9650\u5236\u7f13\u5b58\u56fe\u7684\u5927\u5c0f" + this.a.freeMemory());
        }
        if (GameMIDlet.self.useBackLayerCache) {
            if (s2 > this.a) {
                s2 = this.a;
            }
            if (s3 > this.b) {
                s3 = this.b;
            }
            this.a = new m(s2, s3);
        } else {
            this.d = new bb();
        }
        Object object3 = ((ao)object2).a;
        ((ao)object2).a = null;
        this.c = Runtime.getRuntime().freeMemory();
        this.d = this.b - this.c > 0L ? this.b - this.c : 0L;
        this.g = (byte)80;
        byte[] byArray = ((ao)object2).a;
        n2 = 0;
        by = 0;
        if (GameMIDlet.self.debug) {
            System.out.println("\u52a0\u5165\u4eba\u7269\u89d2\u8272\u7cbe\u7075" + this.a.freeMemory());
        }
        g[] gArray = this.a();
        for (int i = 0; gArray != null && i < gArray.length; ++i) {
            this.b.a(gArray[i]);
        }
        if (GameMIDlet.self.debug) {
            System.out.println("\u52a0\u5165\u5b9d\u7bb1\u7cbe\u7075" + this.a.freeMemory());
        }
        ak[] akArray = t.a();
        for (int i = 0; akArray != null && i < akArray.length; ++i) {
            this.b.a(akArray[i]);
        }
        if (GameMIDlet.self.debug) {
            System.out.println("\u52a0\u5165\u77f3\u5934\u7cbe\u7075" + this.a.freeMemory());
        }
        j[] jArray = t.a();
        for (int i = 0; jArray != null && i < jArray.length; ++i) {
            this.b.a(jArray[i]);
        }
        if (GameMIDlet.self.debug) {
            System.out.println("\u52a0\u5165\u5f00\u5173\u7cbe\u7075" + this.a.freeMemory());
        }
        a[] aArray = t.a();
        for (int i = 0; aArray != null && i < aArray.length; ++i) {
            this.b.a(aArray[i]);
        }
        Object object4 = t.a();
        for (n = 0; object4 != null && n < ((y[])object4).length; ++n) {
            this.b.a(object4[n]);
        }
        if (GameMIDlet.self.debug) {
            System.out.println("\u52a0\u5165\u80cc\u666f\u5c42" + this.a.freeMemory());
        }
        for (n = 0; byArray != null && n < byArray.length; ++n) {
            if (byArray[n] == 1) {
                if (n2 >= ((be[])object3).length) continue;
                if (by == 0) {
                    if (GameMIDlet.self.useBackLayerCache) {
                        be be2 = object3[n2];
                        object4 = this.a;
                        if (object4.a == null) {
                            object4.a = new az[1];
                        } else {
                            object = new az[object4.a.length + 1];
                            System.arraycopy(object4.a, 0, object, 0, object4.a.length);
                            object4.a = null;
                            object4.a = object;
                        }
                        object4.a[object4.a.length - 1] = be2;
                    } else {
                        this.d.a(object3[n2]);
                    }
                } else {
                    this.c.a(object3[n2]);
                }
                n2 = (byte)(n2 + 1);
                continue;
            }
            if (byArray[n] != 2) continue;
            by = 1;
        }
        if (GameMIDlet.self.debug) {
            System.out.println("\u52a0\u5165\u80cc\u666f\u5c42\u7ed3\u675f" + this.a.freeMemory());
        }
        this.c = Runtime.getRuntime().freeMemory();
        this.d = this.b - this.c > 0L ? this.b - this.c : 0L;
        this.g = (byte)90;
        if (GameMIDlet.self.debug) {
            System.out.println("\u8bbe\u7f6e\u969c\u788d\u5bf9\u8c61" + this.a.freeMemory());
        }
        l.a();
        object3 = ((ao)object2).a;
        for (n = 0; object3 != null && n < ((be[])object3).length; ++n) {
            for (int i = 0; object3[n] != null && i < ((be)object3[n]).length; ++i) {
                if (((b)((Object)object3[n][i])).c <= 0 || ((b)((Object)object3[n][i])).d <= 0) continue;
                ax ax2 = new ax(((b)((Object)object3[n][i])).a, ((b)((Object)object3[n][i])).b, ((b)((Object)object3[n][i])).c, ((b)((Object)object3[n][i])).d);
                l.a(ax2);
            }
        }
        if (!this.r) {
            this.a = null;
            if (GameMIDlet.self.debug) {
                System.out.println("\u53d6\u7279\u6b8a\u4e8b\u4ef6\u6570\u636e" + this.a.freeMemory());
            }
            Object object5 = null;
            String string = w.a("/txt/scene" + s.c + "event.txt");
            String string2 = w.a(string, "scene" + s.c + ":", "scene" + s.c + "End");
            object3 = w.a(string2, "phase" + s.a + ":", "phase" + s.a + "End");
            string = w.a(string2, "phaseAll:", "phaseAllEnd");
            if (object3 != null || string != null) {
                e e2;
                boolean bl;
                boolean bl2;
                boolean bl3;
                short[] sArray;
                int n3;
                int n4 = w.a((String)object3, "eventAmount");
                by = w.a(string, "eventAmount");
                object2 = new Vector();
                for (n3 = 0; n3 < n4; ++n3) {
                    object5 = w.a((String)object3, "event" + (n3 + 1) + ":", "event" + (n3 + 1) + "End");
                    short s4 = w.a((String)object5, "id");
                    object = w.a((String)object5, "name");
                    sArray = w.a((String)object5, "area");
                    bl3 = w.a((String)object5, "auto") == 1;
                    bl2 = w.a((String)object5, "loop") == 1;
                    bl = w.a((String)object5, "enable") == 1;
                    object5 = w.a((String)object5, "script:", "scriptEnd", "=");
                    if (sArray == null) continue;
                    e2 = new e();
                    new e().e = s4;
                    e2.a = object;
                    e2.a = sArray[0];
                    e2.b = sArray[1];
                    e2.c = sArray[2];
                    e2.d = sArray[3];
                    e2.a = bl3;
                    e2.b = bl2;
                    e2.c = bl;
                    e2.a = object5;
                    ((Vector)object2).addElement(e2);
                    if (!GameMIDlet.self.debug) continue;
                    System.out.println("\u52a0\u5165\u9636\u6bb5" + s.a + "\u4e8b\u4ef6\uff1a" + e2.a + " " + e2.e);
                }
                for (n3 = 0; n3 < by; ++n3) {
                    object5 = w.a(string, "event" + (n3 + 1) + ":", "event" + (n3 + 1) + "End");
                    short s5 = w.a((String)object5, "id");
                    object = w.a((String)object5, "name");
                    sArray = w.a((String)object5, "area");
                    bl3 = w.a((String)object5, "auto") == 1;
                    bl2 = w.a((String)object5, "loop") == 1;
                    bl = w.a((String)object5, "enable") == 1;
                    object5 = w.a((String)object5, "script:", "scriptEnd", "=");
                    if (sArray == null) continue;
                    e2 = new e();
                    new e().e = s5;
                    e2.a = object;
                    e2.a = sArray[0];
                    e2.b = sArray[1];
                    e2.c = sArray[2];
                    e2.d = sArray[3];
                    e2.a = bl3;
                    e2.b = bl2;
                    e2.c = bl;
                    e2.a = object5;
                    ((Vector)object2).addElement(e2);
                    if (!GameMIDlet.self.debug) continue;
                    System.out.println("\u52a0\u5165\u5168\u9636\u6bb5\u4e8b\u4ef6\uff1a" + e2.a + " " + e2.e);
                }
                if (((Vector)object2).size() > 0) {
                    object5 = new e[((Vector)object2).size()];
                    ((Vector)object2).copyInto((Object[])object5);
                    if (this.a == null) {
                        this.a = new e[1][];
                        this.a[0] = object5;
                    } else {
                        e[] eArray = new e[this.a[this.a.length - 1].length + ((Vector)object2).size()];
                        System.arraycopy(this.a[this.a.length - 1], 0, eArray, 0, this.a[this.a.length - 1].length);
                        System.arraycopy(object5, 0, eArray, this.a[this.a.length - 1].length, ((Object[])object5).length);
                        this.a[this.a.length - 1] = eArray;
                    }
                }
            }
        }
        this.m();
        if (s.c == 1) {
            System.out.println(s.c + "\u53f7\u573a\u666f\u52a0\u5165\u4e91\u5c42");
            this.f = w.a("/pic/yun.ps");
            Random random = new Random();
            random.setSeed(System.currentTimeMillis());
            int n5 = Integer.MAX_VALUE / this.a;
            this.e = (short)(Math.abs(random.nextInt()) / n5);
            n5 = Integer.MAX_VALUE / this.b;
            this.f = (short)(Math.abs(random.nextInt()) / n5);
        }
        this.a = w.a("/pic/sms.ps");
        this.c = 4;
        this.d = s.b - this.a.getHeight() - 4;
        this.c = Runtime.getRuntime().freeMemory();
        this.d = this.b - this.c > 0L ? this.b - this.c : 0L;
        this.c = Runtime.getRuntime().freeMemory();
        this.d = this.b - this.c > 0L ? this.b - this.c : 0L;
        System.out.println("\u6b63\u5728\u4f7f\u7528\u7684\u5185\u5b58\uff1auseMen=" + this.d);
        this.e = w.a("/sys/red_number_s.ps");
        t t2 = this;
        if (s.a[0] != null) {
            t2.c = (short)(s.a[0].s - s.a / 2);
            t2.d = (short)(s.a[0].t - s.b / 2);
        }
        if (t2.c < 0) {
            t2.c = 0;
        } else if (t2.c > t2.a - s.a) {
            t2.c = (short)(t2.a - s.a);
            if (t2.c < 0) {
                t2.c = 0;
            }
        }
        if (t2.d < 0) {
            t2.d = 0;
        } else if (t2.d > t2.b - s.b) {
            t2.d = (short)(t2.b - s.b);
            if (t2.d < 0) {
                t2.d = 0;
            }
        }
        System.gc();
        if (GameMIDlet.self.debug) {
            System.out.println("\u8f7d\u5165\u5b8c\u6bd5");
        }
        this.c = false;
        this.a = 0;
        this.b = 0;
        d = (byte)-1;
        System.gc();
        if (GameMIDlet.self.moreSleep) {
            try {
                Thread.sleep(500L);
            }
            catch (InterruptedException interruptedException) {
                InterruptedException interruptedException2 = interruptedException;
                interruptedException.printStackTrace();
            }
        }
        this.g = (byte)100;
        this.i();
        this.d(0);
    }

    public final void b() {
        ba.a.a = null;
        System.gc();
        if (GameMIDlet.self.moreSleep) {
            try {
                Thread.sleep(200L);
            }
            catch (InterruptedException interruptedException) {
                InterruptedException interruptedException2 = interruptedException;
                interruptedException.printStackTrace();
            }
        }
        s.a();
        this.a(s.b);
    }

    public final void a(String string) {
        ba.a.a = null;
        s.a(string);
        this.a(s.c);
    }

    public final void c() {
        ba.a.a = null;
        s.b();
        this.a(s.c);
    }

    public final void a(int n) {
        if (s.a(n)) {
            s.c = (byte)n;
            String string = s.a;
            t t2 = this;
            this.b = string;
            this.k();
        }
    }

    public final void d() {
        this.a((byte[])null);
        this.t();
    }

    private void a(byte[] byArray) {
        n.a(0);
        this.d = true;
        this.j();
        this.a = byArray;
        this.n = (byte)5;
        this.v = true;
    }

    public final void e() {
        m = true;
        if (this.k) {
            this.k = false;
            for (int i = 0; i < s.a.length; ++i) {
                if (s.a[i].a[3] > 0) continue;
                s.a[i].a[3] = 1;
            }
        }
        if (GameMIDlet.self.unloadBeforeBattle) {
            this.a = 0;
            this.j();
            this.a.b();
            this.a = null;
            System.gc();
            try {
                Thread.sleep(400L);
            }
            catch (InterruptedException interruptedException) {
                InterruptedException interruptedException2 = interruptedException;
                interruptedException.printStackTrace();
            }
        } else {
            this.a = 0;
            this.j();
            this.a.b();
            this.a = null;
            System.gc();
            try {
                Thread.sleep(400L);
            }
            catch (InterruptedException interruptedException) {
                InterruptedException interruptedException3 = interruptedException;
                interruptedException.printStackTrace();
            }
            this.a = (byte)2;
            t.g();
            this.b = 1;
        }
        n.a(1);
    }

    public final void f() {
        ((t)((Object)interruptedException2)).t();
        if (GameMIDlet.self.unloadBeforeBattle) {
            ba.a.b = 0;
            ba.a.l();
        }
        if (s.a[0].i) {
            s.a[0].j = false;
        }
        System.gc();
        try {
            Thread.sleep(200L);
            return;
        }
        catch (InterruptedException interruptedException) {
            InterruptedException interruptedException2 = interruptedException;
            interruptedException.printStackTrace();
            return;
        }
    }

    public static void g() {
        if (GameMIDlet.self.unloadBeforeBattle) {
            ba.a.k();
        } else {
            ba.a.i();
        }
        System.gc();
        try {
            Thread.sleep(400L);
            return;
        }
        catch (InterruptedException interruptedException) {
            InterruptedException interruptedException2 = interruptedException;
            interruptedException.printStackTrace();
            return;
        }
    }

    public final void h() {
        if (((t)((Object)interruptedException2)).a != null) {
            ((t)((Object)interruptedException2)).a.a();
            ((t)((Object)interruptedException2)).a = null;
        }
        ((t)((Object)interruptedException2)).a = null;
        ab.a = null;
        ((t)((Object)interruptedException2)).f = false;
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

    public final void i() {
        if (GameMIDlet.self.playMusic && s.b != null && !s.b.equals("")) {
            if (this.a != null) {
                if (!this.a.a.equals(s.b)) {
                    this.a.b();
                    this.a.c();
                    this.a.a(s.b);
                    this.a.b(100);
                    this.a.a();
                    return;
                }
            } else {
                this.a = new v();
                this.a.a(s.b);
                this.a.b(100);
                this.a.a();
            }
        }
    }

    public final void j() {
        if (this.a != null) {
            this.a.b();
            this.a.c();
            this.a = null;
        }
    }

    public final void k() {
        this.a = false;
        if (s.c != 11) {
            s.d = false;
        }
        if (this.a != 1) {
            this.a = 1;
            new bi(this);
            this.k = 0;
        }
    }

    public final void l() {
        if (GameMIDlet.self.debug) {
            System.out.println("\u6e05\u9664\u8d44\u6e90clearResource()");
        }
        t t2 = interruptedException2;
        for (int i = 0; t2.b != null && t2.b.a != null && i < t2.b.a.length; ++i) {
            if (t2.b.a[i].s != 1 || ((g)t2.b.a[i]).d != 2) continue;
            ((g)t2.b.a[i]).f();
        }
        if (s.a != null && s.a[0] != null) {
            s.a[0].e = -1;
            s.a[0].l = false;
            s.a[0].h = false;
        }
        r.a = null;
        ((t)((Object)interruptedException2)).b = null;
        ((t)((Object)interruptedException2)).c = null;
        ((t)((Object)interruptedException2)).a = null;
        l.a();
        if (as.a != null) {
            as.a.cancel();
            as.a = null;
        }
        if (((t)((Object)interruptedException2)).a != null) {
            ((t)((Object)interruptedException2)).a.a = null;
            ((t)((Object)interruptedException2)).a.a = null;
            ((t)((Object)interruptedException2)).a = null;
        }
        ((t)((Object)interruptedException2)).a = null;
        ((t)((Object)interruptedException2)).f = null;
        ((t)((Object)interruptedException2)).a = null;
        ((t)((Object)interruptedException2)).a = null;
        ((t)((Object)interruptedException2)).a = 0;
        ((t)((Object)interruptedException2)).b = 0;
        System.gc();
        try {
            Thread.sleep(500L);
        }
        catch (InterruptedException interruptedException) {
            InterruptedException interruptedException2 = interruptedException;
            interruptedException.printStackTrace();
        }
        if (GameMIDlet.self.debug) {
            System.out.println("\u6e05\u9664\u8d44\u6e90\u7ed3\u675f");
        }
    }

    public final void a(Graphics graphics) {
        if (this.a == 2) {
            Object object;
            if (this.b == 1) {
                short s2;
                int n2;
                object = this;
                if (!(((t)object).c || !((t)object).a || ((t)object).b || ((t)object).d || s.a[0].i)) {
                    n2 = ((t)object).a();
                    if (((t)object).b == 1 && s.a[0] != null) {
                        if (s.a[0].i) {
                            s.a[0].b();
                        } else {
                            if ((n2 & 4) != 0) {
                                s.a[0].b(2);
                                s.a[0].d = true;
                                s.a[0].d();
                            } else if ((n2 & 0x20) != 0) {
                                s.a[0].b(3);
                                s.a[0].d = true;
                                s.a[0].d();
                            } else if ((n2 & 2) != 0) {
                                s.a[0].b(1);
                                s.a[0].d = true;
                                s.a[0].d();
                            } else if ((n2 & 0x40) != 0) {
                                s.a[0].b(0);
                                s.a[0].d = true;
                                s.a[0].d();
                            }
                            if ((n2 & 4) == 0 && (n2 & 0x20) == 0 && (n2 & 2) == 0 && (n2 & 0x40) == 0) {
                                s.a[0].d = false;
                                if (!(((t)object).b || s.a[0].h || s.a[0].i)) {
                                    for (s2 = 0; s2 < s.a.length; s2 = (short)(s2 + 1)) {
                                        s.a[s2].a(0);
                                    }
                                }
                            }
                        }
                    }
                }
                object = this;
                n2 = 0;
                s2 = 0;
                n2 = (short)(s.a[0].s - s.a / 2);
                s2 = (short)(s.a[0].t - s.b / 2);
                if (n2 < 0) {
                    n2 = 0;
                } else if (n2 > ((t)object).a - s.a) {
                    short s3 = (short)(((t)object).a - s.a);
                    n2 = s3;
                    if (s3 < 0) {
                        n2 = 0;
                    }
                }
                if (s2 < 0) {
                    s2 = 0;
                } else if (s2 > ((t)object).b - s.b && (s2 = (short)(((t)object).b - s.b)) < 0) {
                    s2 = 0;
                }
                if (((t)object).c < n2 && ((t)object).c < ((t)object).a - s.a) {
                    ((t)object).c = (short)(((t)object).c + 6);
                    if (((t)object).c > n2) {
                        ((t)object).c = (short)n2;
                    }
                } else if (((t)object).c > n2 && ((t)object).c > 0) {
                    ((t)object).c = (short)(((t)object).c - 6);
                    if (((t)object).c < n2) {
                        ((t)object).c = (short)n2;
                    }
                }
                if (((t)object).d < s2 && ((t)object).d < ((t)object).b - s.b) {
                    ((t)object).d = (short)(((t)object).d + 6);
                    if (((t)object).d > s2) {
                        ((t)object).d = s2;
                    }
                } else if (((t)object).d > s2 && ((t)object).d > 0) {
                    ((t)object).d = (short)(((t)object).d - 6);
                    if (((t)object).d < s2) {
                        ((t)object).d = s2;
                    }
                }
                if (((t)object).b != null) {
                    ((t)object).b.a(((t)object).c, ((t)object).d, s.a, s.b);
                }
                if (((t)object).d != null) {
                    ((t)object).d.a(((t)object).c, ((t)object).d, s.a, s.b);
                }
                if (((t)object).c != null) {
                    ((t)object).c.a(((t)object).c, ((t)object).d, s.a, s.b);
                }
                if (((t)object).a != null) {
                    ((t)object).a.a(((t)object).c, ((t)object).d, s.a, s.b);
                }
                if (!this.z) {
                    ax ax2;
                    int n3;
                    g g2;
                    object = this;
                    if (!((t)object).b && ((t)object).b == 1 && s.a[0] != null && !s.a[0].i) {
                        g g3;
                        block96: {
                            ((t)object).a = null;
                            Object object2 = object;
                            if (s.a[0] != null && ((t)object2).b != null) {
                                g2 = s.a[0];
                                bb bb2 = ((t)object2).b;
                                for (n3 = 0; bb2.a != null && n3 < bb2.a.length; ++n3) {
                                    if (g2 == bb2.a[n3] || bb2.a[n3].s != 1 || !w.a(ax2 = g2.c(), bb2.a[n3].a())) continue;
                                    g3 = (g)bb2.a[n3];
                                    break block96;
                                }
                                g3 = null;
                            } else {
                                g3 = null;
                            }
                        }
                        ((t)object).a = g3;
                        ((t)object).f = ((t)object).a != null;
                    }
                    object = this;
                    if (!((t)object).b && ((t)object).b == 1 && s.a[0] != null && !s.a[0].i) {
                        ak ak2;
                        block97: {
                            Object object3 = object;
                            if (s.a[0] != null && ((t)object3).b != null) {
                                g2 = s.a[0];
                                bb bb3 = ((t)object3).b;
                                for (n3 = 0; bb3.a != null && n3 < bb3.a.length; ++n3) {
                                    if (g2 == bb3.a[n3] || bb3.a[n3].s != 2 || !w.a(ax2 = g2.c(), bb3.a[n3].a()) || ((ak)bb3.a[n3]).a != 0) continue;
                                    ak2 = (ak)bb3.a[n3];
                                    break block97;
                                }
                                ak2 = null;
                            } else {
                                ak2 = null;
                            }
                        }
                        ((t)object).a = ak2;
                        ((t)object).g = ((t)object).a != null;
                    }
                    object = this;
                    if (!((t)object).b && ((t)object).b == 1 && s.a[0] != null && !s.a[0].i) {
                        block98: {
                            e e2;
                            ax ax3 = s.a[0].b();
                            Object object4 = object;
                            if (!((t)object4).b) {
                                for (int i = 0; ((t)object4).a != null && i < ((t)object4).a.length; ++i) {
                                    for (n3 = 0; ((t)object4).a[i] != null && n3 < ((t)object4).a[i].length; ++n3) {
                                        short s4 = ((t)object4).a[i][n3].a;
                                        short s5 = ((t)object4).a[i][n3].b;
                                        short s6 = ((t)object4).a[i][n3].c;
                                        short s7 = ((t)object4).a[i][n3].d;
                                        if (!w.a(ax3.a, (int)ax3.b, (int)ax3.c, (int)ax3.d, s4, (int)s5, (int)s6, (int)s7) || !((t)object4).a[i][n3].c || !((t)object4).a[i][n3].a || s.b(((t)object4).a[i][n3].e)) continue;
                                        e2 = ((t)object4).a[i][n3];
                                        break block98;
                                    }
                                }
                            }
                            e2 = ((t)object).c = null;
                        }
                        if (((t)object).c != null) {
                            if (((t)object).w) {
                                ((t)object).b = ((t)object).c;
                            }
                            if (((t)object).b == null) {
                                ((t)object).b = ((t)object).c;
                                if (((t)object).b.a) {
                                    if (GameMIDlet.self.debug) {
                                        System.out.println("\u6267\u884c\u4e8b\u4ef6:" + ((t)object).b.a);
                                    }
                                    if (((t)object).b.c) {
                                        super.b(((t)object).b);
                                    }
                                }
                            } else if (((t)object).b != ((t)object).c) {
                                ((t)object).b = null;
                                ((t)object).b = ((t)object).c;
                                if (((t)object).b.a) {
                                    if (GameMIDlet.self.debug) {
                                        System.out.println("\u6267\u884c\u4e8b\u4ef6:" + ((t)object).b.a);
                                    }
                                    if (((t)object).b.c) {
                                        super.b(((t)object).b);
                                    }
                                }
                            }
                        } else {
                            ((t)object).b = null;
                            if (((t)object).w) {
                                ((t)object).w = false;
                            }
                        }
                    }
                    object = this;
                    if (!((t)object).b && ((t)object).b == 1 && s.a[0] != null && !s.a[0].i) {
                        super.c(s.a[0].c());
                    }
                    object = this;
                    if (!((t)object).b && ((t)object).b == 1 && s.a[0] != null && !s.a[0].i) {
                        super.b(s.a[0].c());
                    }
                    object = this;
                    if (!((t)object).b && ((t)object).b == 1 && s.a[0] != null && !s.a[0].i) {
                        super.a(s.a[0].c());
                    }
                }
                object = s.a[0];
                if (((g)object).j) {
                    if (((g)object).q - ((az)object).s < -((g)object).c) {
                        ((g)object).b(2);
                        ((g)object).d = true;
                        ((g)object).d();
                    } else if (((g)object).q - ((az)object).s > ((g)object).c) {
                        ((g)object).b(3);
                        ((g)object).d = true;
                        ((g)object).d();
                    } else if (((g)object).r - ((az)object).t < -((g)object).c) {
                        ((g)object).b(1);
                        ((g)object).d = true;
                        ((g)object).d();
                    } else if (((g)object).r - ((az)object).t > ((g)object).c) {
                        ((g)object).b(0);
                        ((g)object).d = true;
                        ((g)object).d();
                    } else if (ba.a.a % ((g)object).p == 0) {
                        ((g)object).b();
                    }
                } else if (((g)object).i && ba.a.a % ((g)object).p == 0) {
                    ((g)object).b();
                }
                this.o();
                this.p();
                this.n();
            }
            if (ba.a.a % 4 == 0) {
                this.r();
            }
            if (ba.a.a % 3 == 0) {
                object = this;
            }
            if (ba.a.a % 2 == 0) {
                object = this;
                if (((t)object).v) {
                    ((t)object).x = !((t)object).x;
                    ((t)object).n = (byte)(((t)object).n - 1);
                    if (((t)object).n <= 0) {
                        ((t)object).v = false;
                        ((t)object).x = false;
                        ((t)object).a = null;
                        if (GameMIDlet.self.unloadBeforeBattle) {
                            ((t)object).b = 0;
                            ((t)object).l();
                        }
                        if (s.a[0].i) {
                            s.a[0].j = false;
                        }
                        System.gc();
                        try {
                            Thread.sleep(200L);
                        }
                        catch (InterruptedException interruptedException) {
                            InterruptedException interruptedException2 = interruptedException;
                            interruptedException.printStackTrace();
                        }
                        ((t)object).a = new al();
                        ((t)object).a.d = ((t)object).a;
                        ((t)object).a.a = s.a();
                        if (((t)object).a != null) {
                            ((t)object).a.d = true;
                        }
                        ba.a.a.d = 1;
                        if (((t)object).a.a()) {
                            ((t)object).b = (byte)4;
                            ((t)object).a.a();
                            ba.a.j();
                        } else {
                            ((t)object).a = null;
                            System.gc();
                            try {
                                Thread.sleep(200L);
                            }
                            catch (InterruptedException interruptedException) {
                                InterruptedException interruptedException3 = interruptedException;
                                interruptedException.printStackTrace();
                            }
                            n.a(1);
                        }
                        ((t)object).d = false;
                    }
                }
            }
            this.k = this.n ? (ba.a.a % 4 == 0 ? (byte)4 : (byte)0) : (byte)0;
        }
        if (this.y && ba.a.a % 2 == 0) {
            this.o = (byte)(this.o - 1);
            if (this.o > 0) {
                ((az)this.b).n = !((az)this.b).n;
            } else {
                ((az)this.b).n = false;
                if (this.b != null) {
                    this.b.b(this.b);
                }
                this.b = null;
                this.y = false;
                this.d(0);
            }
        }
        this.b(graphics);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(Graphics graphics) {
        block111: {
            block115: {
                block116: {
                    t t2;
                    Graphics graphics2;
                    String string;
                    block118: {
                        block117: {
                            boolean bl;
                            int n2;
                            short s2;
                            block112: {
                                block113: {
                                    t t3;
                                    block114: {
                                        if (this.a == 1) {
                                            graphics.setColor(0);
                                            graphics.setClip(0, 0, (int)ba.a.a, (int)ba.a.b);
                                            graphics.fillRect(0, 0, (int)ba.a.a, (int)ba.a.b);
                                            graphics.setClip(0, 0, (int)s.a, (int)s.b);
                                            if (this.b != null) {
                                                graphics.drawImage(this.b, s.a / 2, s.b / 2, 3);
                                            }
                                            if (this.c != null) {
                                                graphics.setClip(s.a / 2 - this.c.getWidth() / 2, s.b / 2 - this.c.getHeight() / 2, this.c.getWidth() * this.h / 100, this.c.getHeight());
                                                graphics.drawImage(this.c, s.a / 2, s.b / 2, 3);
                                                graphics.setClip(0, 0, (int)s.a, (int)s.b);
                                            }
                                            if (this.d != null) {
                                                graphics.drawImage(this.d, s.a - 2, s.b - 2, 40);
                                            }
                                            if (this.h < this.g) {
                                                this.h = (byte)(this.h + 10);
                                                if (this.h > this.g) {
                                                    this.h = this.g;
                                                }
                                            }
                                            if (!this.a) return;
                                            if (this.h < 100) return;
                                            this.g = 0;
                                            this.h = 0;
                                            this.c = null;
                                            this.b = null;
                                            this.d = null;
                                            this.a = (byte)2;
                                            if (e) {
                                                this.a = new aa();
                                                aa.a();
                                                e = false;
                                                return;
                                            }
                                            this.a = System.currentTimeMillis();
                                            this.b = 1;
                                            n.a(1);
                                            return;
                                        }
                                        if (this.a != 2) break block111;
                                        graphics.setColor(0);
                                        graphics.setClip(0, 0, (int)ba.a.a, (int)ba.a.b);
                                        graphics.fillRect(0, 0, (int)ba.a.a, (int)ba.a.b);
                                        graphics.setClip(0, 0, (int)s.a, (int)s.b);
                                        graphics.translate((int)this.i, (int)this.j);
                                        if (this.b == 1 || this.b == 2 || this.b == 6) {
                                            Object object;
                                            if (GameMIDlet.self.useBackLayerCache) {
                                                short s3;
                                                short s4;
                                                object = this;
                                                if (((t)object).a != null) {
                                                    if (((t)object).a.a == null) {
                                                        s4 = 0;
                                                        s3 = 0;
                                                        if (s.a[0] != null) {
                                                            switch (s.a[0].a) {
                                                                case 1: {
                                                                    s4 = (short)(((t)object).c - (((t)object).a.a - s.a) / 2);
                                                                    s3 = (short)(((t)object).d - (((t)object).a.b - s.b));
                                                                    break;
                                                                }
                                                                case 0: {
                                                                    s4 = (short)(((t)object).c - (((t)object).a.a - s.a) / 2);
                                                                    s3 = ((t)object).d;
                                                                    break;
                                                                }
                                                                case 2: {
                                                                    s4 = (short)(((t)object).c - (((t)object).a.a - s.a));
                                                                    s3 = (short)(((t)object).d - (((t)object).a.b - s.b) / 2);
                                                                    break;
                                                                }
                                                                case 3: {
                                                                    s4 = ((t)object).c;
                                                                    s3 = (short)(((t)object).d - (((t)object).a.b - s.b) / 2);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        if (s4 < 0) {
                                                            s4 = 0;
                                                        }
                                                        if (s3 < 0) {
                                                            s3 = 0;
                                                        }
                                                        if (s3 > ((t)object).d) {
                                                            s3 = ((t)object).d;
                                                        }
                                                        if (s4 > ((t)object).c) {
                                                            s4 = ((t)object).c;
                                                        }
                                                        if (s4 + ((t)object).a.a > ((t)object).a) {
                                                            s4 = (short)(((t)object).a - ((t)object).a.a);
                                                        }
                                                        if (s3 + ((t)object).a.b > ((t)object).b) {
                                                            s3 = (short)(((t)object).b - ((t)object).a.b);
                                                        }
                                                        ((t)object).a.a(s4, s3);
                                                        ((t)object).a.a();
                                                    } else if (((t)object).c < ((t)object).a.a() || ((t)object).a.a > s.a && ((t)object).c + s.a > ((t)object).a.a() + ((t)object).a.a || ((t)object).d < ((t)object).a.b() || ((t)object).a.b > s.b && ((t)object).d + s.b > ((t)object).a.b() + ((t)object).a.b) {
                                                        s4 = 0;
                                                        s3 = 0;
                                                        if (s.a[0] != null) {
                                                            switch (s.a[0].a) {
                                                                case 1: {
                                                                    s4 = (short)(((t)object).c - (((t)object).a.a - s.a) / 2);
                                                                    s3 = (short)(((t)object).d - (((t)object).a.b - s.b));
                                                                    break;
                                                                }
                                                                case 0: {
                                                                    s4 = (short)(((t)object).c - (((t)object).a.a - s.a) / 2);
                                                                    s3 = ((t)object).d;
                                                                    break;
                                                                }
                                                                case 2: {
                                                                    s4 = (short)(((t)object).c - (((t)object).a.a - s.a));
                                                                    s3 = (short)(((t)object).d - (((t)object).a.b - s.b) / 2);
                                                                    break;
                                                                }
                                                                case 3: {
                                                                    s4 = ((t)object).c;
                                                                    s3 = (short)(((t)object).d - (((t)object).a.b - s.b) / 2);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        if (s4 < 0) {
                                                            s4 = 0;
                                                        }
                                                        if (s3 < 0) {
                                                            s3 = 0;
                                                        }
                                                        if (s3 > ((t)object).d) {
                                                            s3 = ((t)object).d;
                                                        }
                                                        if (s4 > ((t)object).c) {
                                                            s4 = ((t)object).c;
                                                        }
                                                        if (s4 + ((t)object).a.a > ((t)object).a) {
                                                            s4 = (short)(((t)object).a - ((t)object).a.a);
                                                        }
                                                        if (s3 + ((t)object).a.b > ((t)object).b) {
                                                            s3 = (short)(((t)object).b - ((t)object).a.b);
                                                        }
                                                        if (s4 != ((t)object).a.a() || s3 != ((t)object).a.b()) {
                                                            ((t)object).a.a(s4, s3);
                                                            ((t)object).a.a();
                                                        }
                                                    }
                                                }
                                                if (this.a != null) {
                                                    s4 = this.d;
                                                    s3 = this.c;
                                                    object = this.a;
                                                    this.a.c = s3;
                                                    ((m)object).d = s4;
                                                }
                                                if (this.a != null) {
                                                    this.a.a(graphics, 0, this.k);
                                                }
                                            } else if (this.d != null) {
                                                this.d.a(graphics, 0, this.k);
                                            }
                                            if (this.b != null) {
                                                this.b.a();
                                            }
                                            if (this.b != null) {
                                                this.b.a(graphics, 0, this.k);
                                            }
                                            if (this.c != null) {
                                                this.c.a(graphics, 0, this.k);
                                            }
                                            Graphics graphics3 = graphics;
                                            object = this;
                                            if (((t)object).f != null) {
                                                graphics3.translate((int)(-((t)object).c), (int)(-((t)object).d));
                                                graphics3.drawImage(((t)object).f, ((t)object).e, ((t)object).f, 20);
                                                graphics3.translate((int)((t)object).c, (int)((t)object).d);
                                                if (ba.a.a % 2 == 0) {
                                                    --((t)object).e;
                                                    if (((t)object).e <= -((t)object).f.getWidth()) {
                                                        ((t)object).e = ((t)object).a;
                                                        Random random = new Random();
                                                        random.setSeed(System.currentTimeMillis());
                                                        int n3 = Integer.MAX_VALUE / ((t)object).b;
                                                        ((t)object).f = (short)(Math.abs(random.nextInt()) / n3);
                                                    }
                                                }
                                            }
                                            if (this.a != null) {
                                                this.a.a(graphics, 0, this.k);
                                            }
                                            if (s.c == 1 && this.l) {
                                                for (int i = 0; i < this.b.length; ++i) {
                                                    byte by = (byte)w.a.stringWidth(this.b[i]);
                                                    byte by2 = (byte)w.a;
                                                    graphics.setColor(0xFFFFFF);
                                                    graphics.fillRect(this.a[i][0] - this.c - by / 2, this.a[i][1] - this.d - by2, (int)by, (int)by2);
                                                    graphics.setColor(0xFF00FF);
                                                    graphics.drawString(this.b[i], this.a[i][0] - this.c, this.a[i][1] - this.d, 33);
                                                }
                                            }
                                        }
                                        graphics.translate((int)(-this.i), (int)(-this.j));
                                        graphics.drawImage(this.a, 4, s.b - this.a.getHeight() - 4, 20);
                                        this.c = 4;
                                        this.d = s.b - this.a.getHeight() - 4;
                                        if (this.b == 2 && this.a != null && this.a.a) {
                                            this.a.a(graphics);
                                        }
                                        if (this.b != 6) break block112;
                                        ah.a(graphics, 0, 0);
                                        if (this.a == null || this.c >= this.a.length || this.c < 0) break block112;
                                        graphics.setColor(0);
                                        if (w.a.stringWidth(this.a[this.c]) < s.a) break block113;
                                        s2 = s.a;
                                        n2 = w.a + 4;
                                        boolean bl2 = false;
                                        String string2 = this.a[this.c];
                                        Graphics graphics4 = graphics;
                                        t3 = this;
                                        graphics4.drawString(string2, 0 + t3.l, n2, 36);
                                        if (0 + t3.l + w.a.stringWidth(string2) <= s2 + 0) break block114;
                                        if (t3.m < 10) {
                                            t3.m = (short)(t3.m + 1);
                                            break block112;
                                        } else {
                                            t3.l = (short)(t3.l - 1);
                                            if (0 + t3.l + w.a.stringWidth(string2) <= s2 + 0) {
                                                t3.m = 0;
                                            }
                                        }
                                        break block112;
                                    }
                                    if (t3.m < 10) {
                                        t3.m = (short)(t3.m + 1);
                                        break block112;
                                    } else if (t3.l < 0) {
                                        t3.l = 0;
                                        t3.m = 0;
                                    }
                                    break block112;
                                }
                                graphics.drawString(this.a[this.c], s.a / 2, 3, 17);
                            }
                            if (this.b == 3 && this.a != null && this.a.b) {
                                this.a.a(graphics);
                            }
                            if (this.b == 4 && this.a != null) {
                                this.a.a(graphics);
                            }
                            boolean bl3 = GameMIDlet.self.phonemodel.equals("E6");
                            int n4 = GameMIDlet.self.phonemodel.equals("E680");
                            boolean bl4 = bl = !bl3 && n4 == 0;
                            if (System.currentTimeMillis() - this.a < 2000L) {
                                if (s.a != null && s.a[s.c - 1] != null && !s.a[s.c - 1].equals("")) {
                                    w.a(graphics, s.a[s.c - 1], 6, 5, 14902310, 0xFFFFFF, 20);
                                }
                                if (bl) {
                                    this.t = true;
                                }
                            } else if (bl && this.t) {
                                this.u = true;
                                this.E = true;
                                this.t = false;
                            }
                            if (!bl || !m) break block115;
                            if (s.c != 1 || !this.u) break block116;
                            n2 = 2;
                            n4 = 3;
                            string = "\u53cb\u60c5\u63d0\u793a\uff1a\u63097\u952e\u53ef\u4ee5\u67e5\u770b\u5927\u5730\u56fe\u4e0a\u7684\u5730\u7406\u540d\u79f0\uff01";
                            graphics2 = graphics;
                            t2 = this;
                            if (!t2.E) break block117;
                            s2 = (short)w.a;
                            if (t2.n < s2) {
                                t2.n = (short)(t2.n + 1);
                                if (t2.n >= s2) {
                                    t2.D = true;
                                }
                            }
                            break block118;
                        }
                        t2.D = false;
                        if (t2.n > 0) {
                            t2.n = (short)(t2.n - 1);
                        }
                    }
                    graphics2.setColor(0);
                    if (t2.n > 0) {
                        graphics2.fillRect(0, 0, (int)s.a, (int)t2.n);
                    }
                    if (!t2.D) break block115;
                    t2.o = (short)(t2.o - 3);
                    graphics2.setColor(0xFFFF00);
                    graphics2.drawString(string, s.a + t2.o, 0, 20);
                    if (t2.o < -(w.a.stringWidth(string) + s.a)) {
                        t2.o = 0;
                        t2.s = (byte)(t2.s + 1);
                        if (t2.s >= 2) {
                            t2.E = false;
                        }
                    }
                    break block115;
                }
                this.t();
            }
            if (m && B) {
                if (this.g > 0) {
                    this.d(graphics);
                    this.g = (short)(this.g - 1);
                } else {
                    B = false;
                }
            }
            if (C) {
                if (this.g > 0) {
                    this.d(graphics);
                    this.g = (short)(this.g - 1);
                } else {
                    C = false;
                }
            }
            if (this.A) {
                if (this.g > 0) {
                    if (this.e != null && !this.e.equals("")) {
                        w.a(graphics, this.e, s.a >> 1, 40, 0xFF0000, 0xFFFFFF, 33);
                    }
                    this.g = (short)(this.g - 1);
                } else {
                    this.A = false;
                }
            }
            if (this.b == 7 && this.a != null) {
                this.a.a(graphics);
            }
            if (s.f) {
                this.e(graphics);
            }
            if (this.b == 5 && this.a != null) {
                this.a.a(graphics);
            }
            if (this.b == 8 && this.a != null) {
                this.a.a(graphics);
            }
            Graphics graphics5 = graphics;
            if (GameMIDlet.self.touchScreen) {
                if (n.a == 1) {
                    if (n.a != null) {
                        graphics5.drawImage(n.a, s.a - 1, s.b - 1, 40);
                    } else {
                        n.a = w.a("/sys/tick.ps");
                    }
                } else if (n.a == 3) {
                    if (n.b != null) {
                        graphics5.drawImage(n.b, s.a - 1, s.b - 1, 40);
                    } else {
                        n.b = w.a("/sys/return.ps");
                    }
                } else if (n.a == 2) {
                    if (n.c != null) {
                        graphics5.drawImage(n.c, s.a - 1, s.b - 1, 40);
                    } else {
                        n.c = w.a("/sys/close.ps");
                    }
                } else {
                    n.a = null;
                    n.b = null;
                    n.c = null;
                }
            }
            if (this.q) {
                graphics.setColor(0);
                graphics.setClip(0, 0, (int)s.a, (int)s.b);
                graphics.fillRect(0, 0, (int)s.a, (int)s.b);
                graphics.setColor(0xFFFFFF);
                graphics.drawString("zzzzZZZZ", s.a / 2, s.b / 2, 17);
                this.l = (byte)(this.l - 1);
                if (this.l <= 0) {
                    this.q = false;
                    this.d(0);
                }
            }
            if (this.x) {
                graphics.setColor(0xFFFFFF);
                graphics.setClip(0, 0, (int)s.a, (int)s.b);
                graphics.fillRect(0, 0, (int)s.a, (int)s.b);
            }
            if (GameMIDlet.self.showFPS && this.e != null) {
                w.a(graphics, (int)ba.a.a, 5, 5, this.e, 6, 7, 20);
                w.a(graphics, (int)this.a.freeMemory() >> 10, 5, 15, this.e, 6, 7, 20);
            }
            if (GameMIDlet.self.debug) {
                graphics.drawString("phase:", 0, 25, 20);
                if (this.e != null) {
                    w.a(graphics, (int)s.a, w.a.stringWidth("phase:") + 2, 25, this.e, 6, 7, 20);
                }
            }
            this.c(graphics);
            return;
        }
        if (this.a != 3) return;
        graphics.setColor(0);
        graphics.setClip(0, 0, (int)ba.a.a, (int)ba.a.b);
        graphics.fillRect(0, 0, (int)ba.a.a, (int)ba.a.b);
        graphics.setClip(0, 0, (int)s.a, (int)s.b);
        if (!this.o && this.c != null) {
            for (int i = 0; this.c != null && i < this.c.length; ++i) {
                w.a(graphics, this.c[i], this.g, this.h + w.a * i, 0, 0xFFFFFF, 36);
            }
            if (ba.a.a % 2 != 0) return;
            if (this.h + w.a * this.c.length > -10) {
                --this.h;
                return;
            }
            this.o = true;
            return;
        }
        t.a(graphics, s.a / 2, this.i);
        if (ba.a.a % 2 != 0) return;
        if (this.i + w.a * 18 > s.b / 2) {
            --this.i;
            return;
        }
        p = true;
    }

    private void n() {
        for (int i = 0; this.b != null && this.b.a != null && i < this.b.a.length; ++i) {
            if (this.b.a[i].s != 1 || ((g)this.b.a[i]).d != 2 || !((g)this.b.a[i]).b || ba.a.a % 5 != 0) continue;
            ((g)this.b.a[i]).g();
        }
    }

    private void o() {
        for (int i = 0; this.b != null && this.b.a != null && i < this.b.a.length; ++i) {
            if (this.b.a[i].s != 1 || !((g)this.b.a[i]).l) continue;
            g g2 = (g)this.b.a[i];
            if (!g2.l) continue;
            if (g2.o - g2.s < -g2.c) {
                g2.b(2);
                g2.d = true;
            } else if (g2.o - g2.s > g2.c) {
                g2.b(3);
                g2.d = true;
            } else if (g2.p - g2.t < -g2.c) {
                g2.b(1);
                g2.d = true;
            } else if (g2.p - g2.t > g2.c) {
                g2.b(0);
                g2.d = true;
            } else {
                g2.d = false;
                g2.a(0);
                g2.l = false;
                g2.h = false;
                if (g2.c > 3) {
                    g2.c = (byte)3;
                }
                if (g2.q >= 0 && g2.q <= 3) {
                    g2.b(g2.q);
                    System.out.println(g2.t + "\u4eba\u7269\u8f6c\u5411" + g2.q);
                }
                ba.a.d(5);
            }
            g2.d();
        }
    }

    private void p() {
        for (int i = 0; this.b != null && this.b.a != null && i < this.b.a.length; ++i) {
            if (this.b.a[i].s != 1 || !((g)this.b.a[i]).m) continue;
            ((g)this.b.a[i]).m();
        }
    }

    private void a(ax ax2) {
        if (this.b) {
            return;
        }
        boolean bl = false;
        for (int i = 0; this.b != null && this.b.a != null && i < this.b.a.length; ++i) {
            ax ax3;
            if (this.b.a[i].s != 4 || !w.a(ax3 = this.b.a[i].a(), ax2)) continue;
            this.j = true;
            this.a = (a)this.b.a[i];
            bl = true;
        }
        if (!bl) {
            this.j = false;
            this.a = null;
        }
    }

    private void b(ax ax2) {
        if (this.b) {
            return;
        }
        boolean bl = false;
        for (int i = 0; this.b != null && this.b.a != null && i < this.b.a.length; ++i) {
            ax ax3;
            if (this.b.a[i].s != 3 || !w.a(ax3 = this.b.a[i].a(), ax2)) continue;
            this.i = true;
            this.a = (j)this.b.a[i];
            bl = true;
        }
        if (!bl) {
            this.i = false;
            this.a = null;
        }
    }

    private void c(ax ax2) {
        if (this.b) {
            return;
        }
        boolean bl = false;
        block0: for (int i = 0; this.a != null && i < this.a.length; ++i) {
            for (int k = 0; this.a[i] != null && k < this.a[i].length; ++k) {
                short s2 = this.a[i][k].a;
                short s3 = this.a[i][k].b;
                short s4 = this.a[i][k].c;
                short s5 = this.a[i][k].d;
                if (!w.a(ax2.a, (int)ax2.b, (int)ax2.c, (int)ax2.d, s2, (int)s3, (int)s4, (int)s5) || !this.a[i][k].c || this.a[i][k].a || s.b(this.a[i][k].e)) continue;
                this.h = true;
                this.a = this.a[i][k];
                bl = true;
                continue block0;
            }
        }
        if (!bl) {
            this.h = false;
            this.a = null;
        }
    }

    private void b(e e2) {
        if (this.b || this.a != null) {
            return;
        }
        if (e2.a) {
            this.a(e2);
        }
    }

    private void c(Graphics graphics) {
        if (GameMIDlet.self.debug) {
            int n2;
            graphics.translate((int)(-this.c), (int)(-this.d));
            l.a(graphics);
            graphics.translate((int)this.c, (int)this.d);
            graphics.translate((int)(-this.c), (int)(-this.d));
            for (n2 = 0; this.a != null && n2 < this.a.length; ++n2) {
                for (int i = 0; this.a[n2] != null && i < this.a[n2].length; ++i) {
                    if (w.a(s.f, (int)this.a[n2][i].e)) {
                        graphics.setColor(0xEEEEEE);
                    } else {
                        graphics.setColor(0xFFFFFF);
                    }
                    graphics.drawRect((int)this.a[n2][i].a, (int)this.a[n2][i].b, (int)this.a[n2][i].c, (int)this.a[n2][i].d);
                    graphics.drawString(String.valueOf(this.a[n2][i].a), (int)this.a[n2][i].a, (int)this.a[n2][i].b, 20);
                }
            }
            graphics.translate((int)this.c, (int)this.d);
            graphics.translate((int)(-this.c), (int)(-this.d));
            for (n2 = 0; this.b != null && this.b.a != null && n2 < this.b.a.length; ++n2) {
                if (this.b.a[n2].s != 5) continue;
                ax ax2 = this.b.a[n2].a();
                graphics.setColor(65280);
                graphics.drawRect((int)ax2.a, (int)ax2.b, (int)ax2.c, (int)ax2.d);
            }
            graphics.translate((int)this.c, (int)this.d);
            graphics.translate((int)(-this.c), (int)(-this.d));
            for (n2 = 0; this.b != null && this.b.a != null && n2 < this.b.a.length; ++n2) {
                ax ax3 = this.b.a[n2].a();
                if (ax3 == null) continue;
                graphics.setColor(65280);
                graphics.drawRect((int)ax3.a, (int)ax3.b, (int)ax3.c, (int)ax3.d);
            }
            for (n2 = 0; s.a != null && n2 < s.a.length; ++n2) {
                ax ax4 = s.a[n2].a();
                graphics.setColor(65280);
                graphics.drawRect((int)ax4.a, (int)ax4.b, (int)ax4.c, (int)ax4.d);
            }
            graphics.translate((int)this.c, (int)this.d);
            graphics.translate((int)(-this.c), (int)(-this.d));
            for (n2 = 0; this.b != null && this.b.a != null && n2 < this.b.a.length; ++n2) {
                if (this.b.a[n2].s != 2) continue;
                ax ax5 = this.b.a[n2].a();
                graphics.setColor(65280);
                graphics.drawRect((int)ax5.a, (int)ax5.b, (int)ax5.c, (int)ax5.d);
            }
            graphics.translate((int)this.c, (int)this.d);
            ax ax6 = null;
            graphics.translate((int)(-this.c), (int)(-this.d));
            ax6 = s.a[0].b;
            if (ax6 != null) {
                graphics.setColor(65280);
                graphics.drawRect((int)ax6.a, (int)ax6.b, (int)ax6.c, (int)ax6.d);
            }
            graphics.translate((int)this.c, (int)this.d);
            graphics.translate((int)(-this.c), (int)(-this.d));
            ax6 = s.a[0].b();
            if (ax6 != null) {
                graphics.setColor(0xFF0000);
                graphics.drawRect((int)ax6.a, (int)ax6.b, (int)ax6.c, (int)ax6.d);
            }
            graphics.translate((int)this.c, (int)this.d);
        }
        if (GameMIDlet.self.debug) {
            graphics.setColor(0xFFFFFF);
            int n3 = this.j < this.l ? this.j : this.l;
            int n4 = this.k < this.m ? this.k : this.m;
            int n5 = this.l > this.j ? this.l : this.j;
            int n6 = this.m > this.k ? this.m : this.k;
            graphics.translate((int)(-this.c), (int)(-this.d));
            graphics.drawRect(n3, n4, n5 - n3, n6 - n4);
            graphics.setColor(0);
            graphics.drawString("(" + n3 + "," + n4 + "," + (n5 - n3) + "," + (n6 - n4) + ")", n3 + 1, n6 + 1, 20);
            graphics.setColor(0xFFFFFF);
            graphics.drawString("(" + n3 + "," + n4 + "," + (n5 - n3) + "," + (n6 - n4) + ")", n3, n6, 20);
            graphics.translate((int)this.c, (int)this.d);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void b(int object) {
        g g2;
        int n2;
        block180: {
            int n3;
            block183: {
                block174: {
                    block178: {
                        block162: {
                            void var1_2;
                            block164: {
                                block165: {
                                    block182: {
                                        block181: {
                                            block173: {
                                                g g3;
                                                block179: {
                                                    block175: {
                                                        block177: {
                                                            block176: {
                                                                block169: {
                                                                    block170: {
                                                                        g g4;
                                                                        block171: {
                                                                            int n4;
                                                                            block172: {
                                                                                block166: {
                                                                                    block168: {
                                                                                        block167: {
                                                                                            if (this.c) return;
                                                                                            if (!this.a) return;
                                                                                            if (this.d) {
                                                                                                return;
                                                                                            }
                                                                                            if (C) {
                                                                                                C = false;
                                                                                                return;
                                                                                            }
                                                                                            if (s.f) {
                                                                                                if (!p) return;
                                                                                                s.f = false;
                                                                                                p = false;
                                                                                                ba.b = 0;
                                                                                                ba.a.a = 0;
                                                                                                s.j();
                                                                                                GameMIDlet.self.showCover();
                                                                                            }
                                                                                            if ((n3 = af.a((int)var1_2)) != 0 && (n3 == 1 || n3 == 6 || n3 == 2 || n3 == 5)) {
                                                                                                n3 = 1 << n3;
                                                                                                this.a |= n3;
                                                                                                this.b &= ~n3;
                                                                                                this.a();
                                                                                            }
                                                                                            if (this.a != 2) {
                                                                                                if (this.a != 3) return;
                                                                                                if (!p) return;
                                                                                                ba.b = 0;
                                                                                                this.g = null;
                                                                                                this.a = 0;
                                                                                                s.j();
                                                                                                GameMIDlet.self.showCover();
                                                                                                return;
                                                                                            }
                                                                                            if (this.b == 3) {
                                                                                                bg.a((int)var1_2);
                                                                                                return;
                                                                                            }
                                                                                            if (this.b != 4) break block164;
                                                                                            n2 = var1_2;
                                                                                            n2 = af.a(n2);
                                                                                            if (ba.a.b != 4) return;
                                                                                            if (ba.a.a.a != 1) return;
                                                                                            if (ba.a.a.b != 1) break block165;
                                                                                            if (ba.a.a.c != 0) break block166;
                                                                                            object = ba.a.a.a[ba.a.a.a[ba.a.a.g]];
                                                                                            if (n2 == 8) {
                                                                                                if (ba.a.a.d == 1) {
                                                                                                    if (((g)object).e == null || ((g)object).e.length > 1) {
                                                                                                        ((g)object).e = new byte[]{10};
                                                                                                    }
                                                                                                    if (((g)object).e[0] < 10) {
                                                                                                        ((g)object).e[0] = 10;
                                                                                                        while (ba.a.a.a[((g)object).e[0] - 10][0] <= 0 && ((g)object).e[0] - 10 < ba.a.a.f - 1) {
                                                                                                            ((g)object).e[0] = (byte)(((g)object).e[0] + 1);
                                                                                                        }
                                                                                                    }
                                                                                                    ba.a.a.c = 1;
                                                                                                    n.a(3);
                                                                                                    return;
                                                                                                }
                                                                                                if (ba.a.a.d == 0) {
                                                                                                    ba.a.a.i = 0;
                                                                                                    ba.a.a.c = (byte)2;
                                                                                                    n.a(3);
                                                                                                    return;
                                                                                                }
                                                                                                if (ba.a.a.d == 2) {
                                                                                                    ba.a.a.c = (byte)3;
                                                                                                    n.a(3);
                                                                                                    return;
                                                                                                }
                                                                                                if (ba.a.a.d == 4) {
                                                                                                    int n5;
                                                                                                    n3 = 0;
                                                                                                    String string = null;
                                                                                                    if (!ba.a.a.d) {
                                                                                                        System.out.println("\u975eBOSS\u6218\u53ef\u4ee5\u9003\u8dd1");
                                                                                                        System.out.println("\u6839\u636e\u6982\u7387\u9003\u8dd1");
                                                                                                        n5 = 0;
                                                                                                        int n6 = 0;
                                                                                                        int n7 = 0;
                                                                                                        int n8 = 0;
                                                                                                        for (n2 = 0; n2 < ba.a.a.a.length; n5 += ba.a.a.a[n2].c(), ++n2) {
                                                                                                        }
                                                                                                        n7 = n5 / ba.a.a.a.length;
                                                                                                        for (n2 = 0; ba.a.a.a != null && n2 < ba.a.a.a.length; n6 += ba.a.a.a[n2][6], ++n2) {
                                                                                                        }
                                                                                                        n8 = n6 / ba.a.a.a.length;
                                                                                                        n2 = n7 >= n8 ? 66 : 33;
                                                                                                        Random random = new Random();
                                                                                                        object = random;
                                                                                                        random.setSeed(System.currentTimeMillis());
                                                                                                        n5 = 21474836;
                                                                                                        int n9 = Math.abs(((Random)object).nextInt()) / n5;
                                                                                                        if (n9 <= n2 && !ba.a.a.d) {
                                                                                                            n3 = 1;
                                                                                                        } else {
                                                                                                            string = "\u9003\u8dd1\u5931\u8d25";
                                                                                                        }
                                                                                                    } else {
                                                                                                        System.out.println("\u9003\u8dd1\u65e0\u6548");
                                                                                                        n3 = 0;
                                                                                                        string = "\u9003\u8dd1\u65e0\u6548";
                                                                                                    }
                                                                                                    if (n3 != 0) {
                                                                                                        System.out.println("\u9003\u8dd1\u6210\u529f");
                                                                                                        ba.a.f = 1;
                                                                                                        ba.a.e();
                                                                                                        if (GameMIDlet.self.unloadBeforeBattle) {
                                                                                                            ba.a.k();
                                                                                                            return;
                                                                                                        }
                                                                                                        ba.a.i();
                                                                                                        return;
                                                                                                    }
                                                                                                    System.out.println("\u9003\u8dd1\u5931\u8d25");
                                                                                                    n5 = 0;
                                                                                                    while (true) {
                                                                                                        if (n5 >= ba.a.a.a.length) {
                                                                                                            ba.a.a.a = string;
                                                                                                            ba.a.a.d = (short)50;
                                                                                                            ba.a.a.g = true;
                                                                                                            ba.a.a.c();
                                                                                                            return;
                                                                                                        }
                                                                                                        ba.a.a.a[n5].o = (byte)3;
                                                                                                        ++n5;
                                                                                                    }
                                                                                                }
                                                                                                if (ba.a.a.d != 3) return;
                                                                                                ba.a.a.b = true;
                                                                                                ba.a.a.c = true;
                                                                                                n3 = 0;
                                                                                                while (true) {
                                                                                                    if (n3 >= ba.a.a.a.length) {
                                                                                                        ba.a.a.c();
                                                                                                        return;
                                                                                                    }
                                                                                                    ba.a.a.a[n3].o = 0;
                                                                                                    ++n3;
                                                                                                }
                                                                                            }
                                                                                            if (n2 == 1) {
                                                                                                switch (ba.a.a.d) {
                                                                                                    case 1: {
                                                                                                        ba.a.a.d = (byte)3;
                                                                                                        return;
                                                                                                    }
                                                                                                    case 4: {
                                                                                                        ba.a.a.d = 1;
                                                                                                        return;
                                                                                                    }
                                                                                                    case 0: {
                                                                                                        ba.a.a.d = (byte)3;
                                                                                                        return;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        ba.a.a.d = (byte)3;
                                                                                                    }
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            if (n2 == 6) {
                                                                                                switch (ba.a.a.d) {
                                                                                                    case 1: {
                                                                                                        ba.a.a.d = (byte)4;
                                                                                                        return;
                                                                                                    }
                                                                                                    case 3: {
                                                                                                        ba.a.a.d = 1;
                                                                                                        return;
                                                                                                    }
                                                                                                    case 0: {
                                                                                                        ba.a.a.d = (byte)4;
                                                                                                        return;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        ba.a.a.d = (byte)4;
                                                                                                    }
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            if (n2 == 2) {
                                                                                                switch (ba.a.a.d) {
                                                                                                    case 1: {
                                                                                                        ba.a.a.d = 0;
                                                                                                        return;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        ba.a.a.d = 1;
                                                                                                        return;
                                                                                                    }
                                                                                                    case 3: {
                                                                                                        ba.a.a.d = 0;
                                                                                                        return;
                                                                                                    }
                                                                                                    case 4: {
                                                                                                        ba.a.a.d = 0;
                                                                                                    }
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            if (n2 == 5) {
                                                                                                switch (ba.a.a.d) {
                                                                                                    case 1: {
                                                                                                        ba.a.a.d = (byte)2;
                                                                                                        return;
                                                                                                    }
                                                                                                    case 0: {
                                                                                                        ba.a.a.d = 1;
                                                                                                        return;
                                                                                                    }
                                                                                                    case 3: {
                                                                                                        ba.a.a.d = (byte)2;
                                                                                                        return;
                                                                                                    }
                                                                                                    case 4: {
                                                                                                        ba.a.a.d = (byte)2;
                                                                                                    }
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            if (n2 != af.g) return;
                                                                                            if (ba.a.a.g <= 0) break block167;
                                                                                            ba.a.a.g = (byte)(ba.a.a.g - 1);
                                                                                            ba.a.a.h = ba.a.a.a[ba.a.a.g];
                                                                                            ba.a.a.d = 1;
                                                                                            if (ba.a.a.g != 0) break block168;
                                                                                        }
                                                                                        n.a(0);
                                                                                    }
                                                                                    ba.a.a.b = 0;
                                                                                    ba.a.a.c = 0;
                                                                                    return;
                                                                                }
                                                                                if (ba.a.a.c == 1) {
                                                                                    g g5 = ba.a.a.a[ba.a.a.a[ba.a.a.g]];
                                                                                    if (n2 == 8) {
                                                                                        g5.o = 0;
                                                                                        if (ba.a.a.g >= ba.a.a.a.length - 1) {
                                                                                            ba.a.a.c();
                                                                                            return;
                                                                                        }
                                                                                        ba.a.a.g = (byte)(ba.a.a.g + 1);
                                                                                        ba.a.a.h = ba.a.a.a[ba.a.a.g];
                                                                                        if (ba.a.a.a[ba.a.a.h].a[3] > 0) {
                                                                                            ba.a.a.c = 0;
                                                                                            ba.a.a.d = 1;
                                                                                            return;
                                                                                        }
                                                                                        n3 = 0;
                                                                                        break block162;
                                                                                    } else {
                                                                                        if (n2 == 1) {
                                                                                            if (g5.e[0] <= 10) return;
                                                                                            g5.e[0] = (byte)(g5.e[0] - 1);
                                                                                            while (ba.a.a.a[g5.e[0] - 10][0] <= 0) {
                                                                                                if (g5.e[0] - 10 <= 0) return;
                                                                                                g5.e[0] = (byte)(g5.e[0] - 1);
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                        if (n2 != 6) {
                                                                                            if (n2 != af.g) return;
                                                                                            ba.a.a.c = 0;
                                                                                            ba.a.a.b = 0;
                                                                                            ba.a.a.c = 0;
                                                                                            return;
                                                                                        }
                                                                                        if (g5.e[0] - 10 >= ba.a.a.f - 1) return;
                                                                                        g5.e[0] = (byte)(g5.e[0] + 1);
                                                                                        while (ba.a.a.a[g5.e[0] - 10][0] <= 0) {
                                                                                            if (g5.e[0] - 10 >= ba.a.a.f - 1) return;
                                                                                            g5.e[0] = (byte)(g5.e[0] + 1);
                                                                                        }
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                if (ba.a.a.c != 2) break block169;
                                                                                ba.a.a.f = false;
                                                                                g4 = ba.a.a.a[ba.a.a.a[ba.a.a.g]];
                                                                                if (g4.c == null) break block170;
                                                                                if (n2 != 8) break block171;
                                                                                byte by = g4.c[ba.a.a.i];
                                                                                if (by == 9) {
                                                                                    n4 = o.a(g4, ba.a.a.a, g4.c[ba.a.a.i]);
                                                                                    n3 = g4.a[3] > n4 ? 1 : 0;
                                                                                } else {
                                                                                    n4 = o.b(g4, ba.a.a.a, g4.c[ba.a.a.i]);
                                                                                    int n10 = n3 = g4.a[5] >= n4 && g4.a[5] > 0 ? 1 : 0;
                                                                                }
                                                                                if (n3 == 0) break block170;
                                                                                if (g4.h > 0) {
                                                                                    if (by == 4) return;
                                                                                }
                                                                                if (g4.i > 0) {
                                                                                    if (by == 10) return;
                                                                                }
                                                                                if (g4.j > 0) {
                                                                                    if (by == 11) return;
                                                                                }
                                                                                if (g4.k > 0) {
                                                                                    if (by == 12) return;
                                                                                }
                                                                                g4.n = ba.a.a.i;
                                                                                if (ba.a.a.b[g4.c[g4.n] - 1] != 2) break block172;
                                                                                if (!(ba.a.a.c[g4.c[g4.n] - 1] != 1 || g4.c[g4.n] == 1 && g4.a[g4.n].a())) {
                                                                                    g4.e = new byte[]{10};
                                                                                    while (ba.a.a.a[g4.e[0] - 10][0] <= 0 && g4.e[0] - 10 < ba.a.a.f - 1) {
                                                                                        g4.e[0] = (byte)(g4.e[0] + 1);
                                                                                    }
                                                                                } else {
                                                                                    g4.e = ba.a.a.a();
                                                                                }
                                                                                ba.a.a.c = (byte)21;
                                                                                break block170;
                                                                            }
                                                                            if (ba.a.a.b[g4.c[g4.n] - 1] == 1) {
                                                                                if (ba.a.a.c[g4.c[g4.n] - 1] == 1) {
                                                                                    boolean bl;
                                                                                    n4 = g4.c[g4.n] == 2 && g4.a[g4.n].a() ? 1 : 0;
                                                                                    boolean bl2 = g4.c[g4.n] == 3 && g4.a[g4.n].a();
                                                                                    boolean bl3 = bl = g4.c[g4.n] == 4 && g4.a[g4.n].a();
                                                                                    if (n4 != 0 || bl2 || bl) {
                                                                                        g4.e = new byte[ba.a.a.a.length];
                                                                                        for (int i = 0; i < ba.a.a.a.length; ++i) {
                                                                                            g4.e[i] = (byte)i;
                                                                                        }
                                                                                    } else {
                                                                                        g4.e = new byte[1];
                                                                                        g4.e[0] = ba.a.a.a[ba.a.a.g];
                                                                                    }
                                                                                } else {
                                                                                    g4.e = new byte[ba.a.a.a.length];
                                                                                    for (n4 = 0; n4 < ba.a.a.a.length; ++n4) {
                                                                                        g4.e[n4] = (byte)n4;
                                                                                    }
                                                                                }
                                                                                ba.a.a.c = (byte)21;
                                                                            }
                                                                            break block170;
                                                                        }
                                                                        if (n2 == 1) {
                                                                            ba.a.a.i = ba.a.a.i - ba.a.a.k >= 0 ? (byte)(ba.a.a.i - ba.a.a.k) : (byte)0;
                                                                            g4.n = ba.a.a.i;
                                                                        } else if (n2 == 6) {
                                                                            ba.a.a.i = ba.a.a.i + ba.a.a.k <= g4.c.length - 1 ? (byte)(ba.a.a.i + ba.a.a.k) : (byte)(g4.c.length - 1);
                                                                            g4.n = ba.a.a.i;
                                                                        } else if (n2 == 2) {
                                                                            ba.a.a.i = ba.a.a.i <= 0 ? (byte)(g4.c.length - 1) : (byte)(ba.a.a.i - 1);
                                                                            g4.n = ba.a.a.i;
                                                                        } else if (n2 == 5) {
                                                                            ba.a.a.i = ba.a.a.i >= g4.c.length - 1 ? (byte)0 : (byte)(ba.a.a.i + 1);
                                                                            g4.n = ba.a.a.i;
                                                                        }
                                                                    }
                                                                    if (n2 == af.g) {
                                                                        ba.a.a.c = 0;
                                                                        ba.a.a.i = 0;
                                                                    }
                                                                    ba.a.a.b = 0;
                                                                    ba.a.a.c = 0;
                                                                    return;
                                                                }
                                                                if (ba.a.a.c != 21) break block173;
                                                                g3 = ba.a.a.a[ba.a.a.a[ba.a.a.g]];
                                                                if (g3.c == null) break block174;
                                                                if (n2 != 8) break block175;
                                                                g3.o = 1;
                                                                if (ba.a.a.g < ba.a.a.a.length - 1) break block176;
                                                                ba.a.a.c();
                                                                break block174;
                                                            }
                                                            ba.a.a.g = (byte)(ba.a.a.g + 1);
                                                            ba.a.a.h = ba.a.a.a[ba.a.a.g];
                                                            if (ba.a.a.a[ba.a.a.h].a[3] > 0) break block177;
                                                            n3 = 0;
                                                            break block178;
                                                        }
                                                        ba.a.a.c = 0;
                                                        ba.a.a.d = 1;
                                                        break block174;
                                                    }
                                                    if (n2 != 1) break block179;
                                                    if (ba.a.a.c[g3.c[g3.n] - 1] == 1) {
                                                        if (ba.a.a.b[g3.c[ba.a.a.i] - 1] == 2) {
                                                            if (g3.e[0] > 10) {
                                                                g3.e[0] = (byte)(g3.e[0] - 1);
                                                                while (ba.a.a.a[g3.e[0] - 10][0] <= 0 && g3.e[0] - 10 > 0) {
                                                                    g3.e[0] = (byte)(g3.e[0] - 1);
                                                                }
                                                            }
                                                            break block174;
                                                        } else if (ba.a.a.b[g3.c[ba.a.a.i] - 1] == 1 && g3.e[0] > 0) {
                                                            g3.e[0] = (byte)(g3.e[0] - 1);
                                                        }
                                                    }
                                                    break block174;
                                                }
                                                if (n2 != 6 || ba.a.a.c[g3.c[g3.n] - 1] != 1) break block174;
                                                if (ba.a.a.b[g3.c[ba.a.a.i] - 1] == 2) {
                                                    if (g3.e[0] - 10 < ba.a.a.f - 1) {
                                                        g3.e[0] = (byte)(g3.e[0] + 1);
                                                        while (ba.a.a.a[g3.e[0] - 10][0] <= 0 && g3.e[0] - 10 < ba.a.a.f - 1) {
                                                            g3.e[0] = (byte)(g3.e[0] + 1);
                                                        }
                                                    }
                                                    break block174;
                                                } else if (ba.a.a.b[g3.c[ba.a.a.i] - 1] == 1 && g3.e[0] < ba.a.a.a.length - 1) {
                                                    g3.e[0] = (byte)(g3.e[0] + 1);
                                                }
                                                break block174;
                                            }
                                            if (ba.a.a.c == 3) {
                                                g g6 = ba.a.a.a[ba.a.a.a[ba.a.a.g]];
                                                if (ba.a.a.b != null) {
                                                    if (n2 == 8) {
                                                        if (ba.a.a.b[ba.a.a.j][1] > 0) {
                                                            g6.m = ba.a.a.j;
                                                            if (s.g[ba.a.a.b[ba.a.a.j][0] - 1] == 1) {
                                                                if (s.h[ba.a.a.b[ba.a.a.j][0] - 1] == 1) {
                                                                    g6.e = new byte[1];
                                                                    g6.e[0] = ba.a.a.a[ba.a.a.g];
                                                                } else {
                                                                    g6.e = new byte[ba.a.a.a.length];
                                                                    for (n3 = 0; n3 < ba.a.a.a.length; ++n3) {
                                                                        g6.e[n3] = (byte)n3;
                                                                    }
                                                                }
                                                            }
                                                            if (s.g[ba.a.a.b[ba.a.a.j][0] - 1] == 2) {
                                                                if (s.h[ba.a.a.b[ba.a.a.j][0] - 1] == 1) {
                                                                    g6.e = new byte[]{10};
                                                                    while (ba.a.a.a[g6.e[0] - 10][0] <= 0 && g6.e[0] - 10 < ba.a.a.f - 1) {
                                                                        g6.e[0] = (byte)(g6.e[0] + 1);
                                                                    }
                                                                } else {
                                                                    g6.e = ba.a.a.a();
                                                                }
                                                            }
                                                            ba.a.a.c = (byte)31;
                                                        }
                                                    } else if (n2 == 1) {
                                                        ba.a.a.j = ba.a.a.j - ba.a.a.l >= 0 ? (byte)(ba.a.a.j - ba.a.a.l) : (byte)0;
                                                    } else if (n2 == 6) {
                                                        ba.a.a.j = ba.a.a.j + ba.a.a.l <= ba.a.a.b.length - 1 ? (byte)(ba.a.a.j + ba.a.a.l) : (byte)(ba.a.a.b.length - 1);
                                                    } else if (n2 == 2) {
                                                        ba.a.a.j = ba.a.a.j <= 0 ? (byte)(ba.a.a.b.length - 1) : (byte)(ba.a.a.j - 1);
                                                    } else if (n2 == 5) {
                                                        ba.a.a.j = ba.a.a.j >= ba.a.a.b.length - 1 ? (byte)0 : (byte)(ba.a.a.j + 1);
                                                    }
                                                }
                                                if (n2 == af.g) {
                                                    ba.a.a.c = 0;
                                                }
                                                ba.a.a.b = 0;
                                                ba.a.a.c = 0;
                                                return;
                                            }
                                            if (ba.a.a.c != 31) return;
                                            g2 = ba.a.a.a[ba.a.a.a[ba.a.a.g]];
                                            if (ba.a.a.b == null) return;
                                            if (n2 != 8) break block180;
                                            g2.o = (byte)2;
                                            if (ba.a.a.g < ba.a.a.a.length - 1) break block181;
                                            ba.a.a.c();
                                            break block180;
                                        }
                                        ba.a.a.g = (byte)(ba.a.a.g + 1);
                                        ba.a.a.h = ba.a.a.a[ba.a.a.g];
                                        if (ba.a.a.a[ba.a.a.h].a[3] > 0) break block182;
                                        n3 = 0;
                                        break block183;
                                    }
                                    ba.a.a.c = 0;
                                    ba.a.a.d = 1;
                                    break block180;
                                }
                                if (ba.a.a.b == 2 || ba.a.a.b == 3) {
                                    ba.a.a.b = false;
                                    ba.a.a.d = 1;
                                    return;
                                }
                                if (ba.a.a.b == 4) {
                                    if (n2 != 8) return;
                                    ba.a.f = (byte)2;
                                    if (ba.a.a.a != null && ba.a.a.a < ba.a.a.a.length - 1) {
                                        ba.a.a.a = (short)(ba.a.a.a + 1);
                                        return;
                                    }
                                    ba.a.e();
                                    if (GameMIDlet.self.unloadBeforeBattle) {
                                        ba.a.k();
                                    } else {
                                        ba.a.i();
                                    }
                                    ba.a.d(0);
                                    return;
                                }
                                if (ba.a.a.b == 5) {
                                    if (n2 != 8) return;
                                    ba ba2 = ba.a;
                                    synchronized (ba2) {
                                        ba.a.f = 0;
                                        if (ba.a.a.b != null && ba.a.a.e < ba.a.a.b.length - 1) {
                                            ba.a.a.e = (byte)(ba.a.a.e + 1);
                                        } else {
                                            if (!ba.a.a.d) {
                                                ba.a.e();
                                                s.k();
                                                d = s.g;
                                                ba.a.a(s.c);
                                            } else {
                                                ba.a.e();
                                                if (GameMIDlet.self.unloadBeforeBattle) {
                                                    ba.a.k();
                                                } else {
                                                    ba.a.i();
                                                }
                                            }
                                            ba.a.d(0);
                                        }
                                        return;
                                    }
                                }
                                if (ba.a.a.b != 6) return;
                                if (n2 == 2) {
                                    ba.a.a.m = 0;
                                    return;
                                }
                                if (n2 == 5) {
                                    ba.a.a.m = 1;
                                    return;
                                }
                                if (n2 != 8) return;
                                if (ba.a.a.m == 0) {
                                    u.b(-1);
                                    return;
                                }
                                ba.a.a.d();
                                return;
                            }
                            if (this.b == 7) {
                                if (this.a == null) return;
                                this.a.a((int)var1_2);
                                return;
                            }
                            if (this.b == 5) {
                                this.a.a((int)var1_2);
                                return;
                            }
                            if (this.b == 8) {
                                if (this.a == null) return;
                                this.a.a((int)var1_2);
                                return;
                            }
                            ab.a((int)var1_2);
                            return;
                        }
                        for (int i = ba.a.a.g + 1; i < ba.a.a.a.length; ++i) {
                            if (ba.a.a.a[ba.a.a.a[i]].a[3] <= 0) continue;
                            ba.a.a.g = (byte)i;
                            ba.a.a.h = ba.a.a.a[ba.a.a.g];
                            n3 = 1;
                            break;
                        }
                        if (n3 != 0) {
                            ba.a.a.c = 0;
                            ba.a.a.d = 1;
                            return;
                        }
                        ba.a.a.c();
                        return;
                    }
                    for (int i = ba.a.a.g + 1; i < ba.a.a.a.length; ++i) {
                        if (ba.a.a.a[ba.a.a.a[i]].a[3] <= 0) continue;
                        ba.a.a.g = (byte)i;
                        ba.a.a.h = ba.a.a.a[ba.a.a.g];
                        n3 = 1;
                        break;
                    }
                    if (n3 != 0) {
                        ba.a.a.c = 0;
                        ba.a.a.d = 1;
                    } else {
                        ba.a.a.c();
                    }
                }
                if (n2 != af.g) return;
                ba.a.a.c = (byte)2;
                return;
            }
            for (int i = ba.a.a.g + 1; i < ba.a.a.a.length; ++i) {
                if (ba.a.a.a[ba.a.a.a[i]].a[3] <= 0) continue;
                ba.a.a.g = (byte)i;
                ba.a.a.h = ba.a.a.a[ba.a.a.g];
                n3 = 1;
                break;
            }
            if (n3 != 0) {
                ba.a.a.c = 0;
                ba.a.a.d = 1;
            } else {
                ba.a.a.c();
            }
        }
        if (n2 == 1) {
            if (s.h[ba.a.a.b[ba.a.a.j][0] - 1] != 1) return;
            if (s.g[ba.a.a.b[ba.a.a.j][0] - 1] == 1) {
                if (g2.e[0] > 0) {
                    g2.e[0] = (byte)(g2.e[0] - 1);
                    return;
                }
                g2.e[0] = 0;
                return;
            }
            if (s.g[ba.a.a.b[ba.a.a.j][0] - 1] != 2) return;
            if (g2.e[0] <= 10) return;
            g2.e[0] = (byte)(g2.e[0] - 1);
            while (ba.a.a.a[g2.e[0] - 10][0] <= 0) {
                if (g2.e[0] - 10 <= 0) return;
                g2.e[0] = (byte)(g2.e[0] - 1);
            }
            return;
        }
        if (n2 != 6) {
            if (n2 != af.g) return;
            ba.a.a.c = (byte)3;
            return;
        }
        if (s.h[ba.a.a.b[ba.a.a.j][0] - 1] != 1) return;
        if (s.g[ba.a.a.b[ba.a.a.j][0] - 1] == 1) {
            if (g2.e[0] < ba.a.a.a.length - 1) {
                g2.e[0] = (byte)(g2.e[0] + 1);
                return;
            }
            g2.e[0] = (byte)(ba.a.a.a.length - 1);
            return;
        }
        if (s.g[ba.a.a.b[ba.a.a.j][0] - 1] != 2) return;
        if (g2.e[0] - 10 >= ba.a.a.f - 1) return;
        g2.e[0] = (byte)(g2.e[0] + 1);
        while (ba.a.a.a[g2.e[0] - 10][0] <= 0) {
            if (g2.e[0] - 10 >= ba.a.a.f - 1) return;
            g2.e[0] = (byte)(g2.e[0] + 1);
        }
    }

    protected final void c(int n2) {
        if ((n2 = af.a(n2)) != 0) {
            this.b |= 1 << n2;
            this.a();
        }
    }

    private int a() {
        int n2 = this.a;
        this.a &= ~this.b;
        this.b = 0;
        return n2;
    }

    private g[] a() {
        Object[] objectArray = null;
        byte by = s.c;
        byte by2 = s.a;
        Object object = w.a("/txt/scene" + by + "role.txt");
        Object object2 = w.a((String)object, "scene" + by + ":", "scene" + by + "End");
        if (object2 == null) {
            return null;
        }
        String string = w.a((String)object2, "phase" + by2 + ":", "phase" + by2 + "End");
        if (string == null) {
            string = w.a((String)object2, "phaseAll:", "phaseAllEnd");
        }
        if (string == null) {
            return null;
        }
        object2 = w.a(string, "roles:", "rolesEnd");
        object = new Vector();
        for (int i = 0; i < ((Object)object2).length; ++i) {
            Object object3;
            String string2 = w.a(string, "role" + (int)object2[i] + ":", "role" + (int)object2[i] + "End");
            if (string2 == null) continue;
            byte by3 = w.a(string2, "spriteType");
            Object object4 = w.a(string2, "pos");
            short[] sArray = w.a(string2, "x");
            short[] sArray2 = w.a(string2, "y");
            int n2 = w.a(string2, "defaultPos");
            Object object5 = object2[i];
            byte[] byArray = w.a(string2, "dir");
            int n3 = w.a(string2, "walk");
            if (by3 == 1) {
                if (!this.r) {
                    int n4;
                    s.a[0].a = this.a;
                    s.a[0].b = this.b;
                    s.a[0].c = true;
                    s.a[0].a(true);
                    s.a[0].c = (byte)3;
                    object3 = s.a((int)s.a[0].t);
                    if (object3 != null && s.c) {
                        s.a[0].a(((ag)object3).a, ((ag)object3).b);
                        s.a[0].c(((ag)object3).b);
                        s.c = false;
                    } else if (object4 != null) {
                        if (d > 0) {
                            n4 = 0;
                            for (n3 = 0; n3 < ((byte[])object4).length; ++n3) {
                                if (object4[n3] != d) continue;
                                s.a[0].a(sArray[n3], sArray2[n3]);
                                s.a[0].c(byArray[n3]);
                                n4 = 1;
                                break;
                            }
                            if (n4 == 0) {
                                s.a[0].a(sArray[n2 - 1], sArray2[n2 - 1]);
                                s.a[0].c(byArray[n2 - 1]);
                            }
                        } else {
                            s.a[0].a(sArray[n2 - 1], sArray2[n2 - 1]);
                            s.a[0].c(byArray[n2 - 1]);
                        }
                    } else {
                        s.a[0].a(sArray[0], sArray2[0]);
                        s.a[0].c(byArray[0]);
                    }
                    s.a[0].h();
                    s.i();
                    for (n4 = 0; n4 < s.a.length; ++n4) {
                        ((Vector)object).addElement(s.a[n4]);
                    }
                    if (s.c == 1) {
                        an an2 = r.a(s.d[0], s.d[1]);
                        ((ar)s.a[0]).a(an2);
                        ((ar)s.a[0]).a(true);
                        ((ar)s.a[0]).c = 1;
                        for (n3 = 0; n3 < s.a.length; ++n3) {
                            if (n3 == 0) continue;
                            ((az)s.a[n3]).n = false;
                        }
                        continue;
                    }
                    n4 = s.a[0].t;
                    if (!((ar)s.a[0]).a().a.equals(s.a[n4 - 1][0])) {
                        an an3 = r.a(s.a[object5 - true][0], s.a[object5 - true][1]);
                        ((ar)s.a[0]).a(an3);
                        ((ar)s.a[0]).a(true);
                        ((ar)s.a[0]).c = (byte)3;
                    }
                    for (int k = 0; k < s.a.length; ++k) {
                        if (k == 0) continue;
                        ((az)s.a[k]).n = true;
                    }
                    continue;
                }
                for (int k = 0; k < s.a.length; ++k) {
                    ((Vector)object).addElement(s.a[k]);
                }
                continue;
            }
            if (!w.a(s.b, (int)object5) && !w.a(s.c, (int)object5)) {
                object3 = null;
                if (s.a[object5 - true][0].toLowerCase().endsWith(".png") || s.a[object5 - true][0].toLowerCase().endsWith(".ps")) {
                    object3 = new g(w.a(s.a[object5 - true][0]), Integer.parseInt(s.a[object5 - true][1]), Integer.parseInt(s.a[object5 - true][2]));
                    int n5 = 14;
                    n2 = Integer.parseInt(s.a[object5 - true][1]) - 2;
                    object4 = object3;
                    if (n2 > 0) {
                        n2 = -((g)object4).b.getWidth() / 2;
                        int n6 = -((g)object4).b.getHeight() / 2;
                        int n7 = ((g)object4).b.getWidth();
                        int n8 = ((g)object4).b.getHeight() / 2;
                        ((g)object4).a(n2, n6, n7, n8);
                    } else {
                        ((g)object4).a = null;
                    }
                } else {
                    an an4 = r.a(s.a[object5 - true][0], s.a[object5 - true][1]);
                    object3 = new ar();
                    ((ar)object3).a(an4);
                    ((ar)object3).a(true);
                }
                ((az)object3).t = (byte)object5;
                ((az)object3).s = 1;
                ((g)object3).d = by3;
                ((g)object3).a = s.b[object5 - true];
                ((az)object3).a(sArray[0], sArray2[0]);
                ((g)object3).a = this.a;
                ((g)object3).b = this.b;
                ((g)object3).c = false;
                ((g)object3).p = 1;
                ((g)object3).c(byArray[0]);
                ((g)object3).c = 1;
                ((g)object3).e = false;
                ((g)object3).a = n3 == 1;
                ((Vector)object).addElement(object3);
                continue;
            }
            if (!GameMIDlet.self.debug) continue;
            System.out.println("\u7cbe\u7075" + (int)object5 + "\u5728\u961f\u4f0d\u91cc\u4e0d\u52a0\u5165\u573a\u666f");
        }
        if (((Vector)object).size() > 0) {
            objectArray = new g[((Vector)object).size()];
            ((Vector)object).copyInto(objectArray);
        }
        return objectArray;
    }

    public final void m() {
        for (int i = 0; this.b != null && this.b.a != null && i < this.b.a.length; ++i) {
            if (this.b.a[i].s != 1 || ((g)this.b.a[i]).d != 2 || w.a(s.b, (int)((g)this.b.a[i]).t)) continue;
            Serializable serializable = new Random();
            serializable.setSeed(System.currentTimeMillis());
            int n2 = 2147483;
            ((g)this.b.a[i]).a = Math.abs(serializable.nextInt()) / n2;
            n2 = 429496;
            ((g)this.b.a[i]).b = Math.abs(serializable.nextInt()) / n2 + 15000;
            ((g)this.b.a[i]).e();
            try {
                Thread.sleep(50L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                serializable = interruptedException;
                interruptedException.printStackTrace();
            }
        }
    }

    private static ak[] a() {
        Object[] objectArray = null;
        byte by = s.c;
        byte by2 = s.a;
        Object object = w.a("/txt/treasurebox.txt");
        String string = w.a((String)object, "scene" + by + ":", "scene" + by + "End");
        if (string == null) {
            return null;
        }
        String string2 = w.a(string, "phase" + by2 + ":", "phase" + by2 + "End");
        if (string2 == null) {
            string2 = w.a(string, "phaseAll:", "phaseAllEnd");
        }
        if (string2 == null) {
            return null;
        }
        int n2 = w.a(string2, "amount");
        object = new Vector();
        Image image = null;
        Image image2 = null;
        for (int i = 1; i <= n2; ++i) {
            ak ak2;
            Object object2 = w.a(string2, "box" + i + ":", "box" + i + "End");
            short s2 = w.a((String)object2, "id");
            byte by3 = w.a((String)object2, "type");
            short[] sArray = w.a((String)object2, "position");
            boolean bl = w.a((String)object2, "visible") == 1;
            w.a((String)object2, "dir");
            short s3 = w.a((String)object2, "money");
            byte[] byArray = w.a((String)object2, "items");
            object2 = w.a((String)object2, "equips");
            ak ak3 = null;
            if (bl) {
                if (by3 == 0) {
                    if (image == null) {
                        image = w.a("/pic/box1.ps");
                    }
                    ak3 = new ak(image, 16, 16);
                } else if (by3 == 1) {
                    if (image2 == null) {
                        image2 = w.a("/pic/box2.ps");
                    }
                    ak3 = new ak(image2, 16, 16);
                }
            } else {
                ak3 = new ak(16, 16);
            }
            ak3.b = by3;
            ak3.n = bl;
            ak3.a = s2;
            ak3.a();
            if (w.a(s.a, (int)s2)) {
                by3 = 1;
                ak2 = ak3;
                ak3.a = by3;
            } else {
                by3 = 0;
                ak2 = ak3;
                ak3.a = by3;
                ak3.b = s3;
                ak3.a = byArray;
                ak3.b = (byte[])object2;
            }
            ak3.a(sArray[0], sArray[1]);
            ak3.s = (byte)2;
            ((Vector)object).addElement(ak3);
        }
        if (((Vector)object).size() > 0) {
            objectArray = new ak[((Vector)object).size()];
            ((Vector)object).copyInto(objectArray);
        }
        return objectArray;
    }

    private static j[] a() {
        Object[] objectArray = null;
        byte by = s.c;
        byte by2 = s.a;
        Object object = w.a("/txt/rock.txt");
        String string = w.a((String)object, "scene" + by + ":", "scene" + by + "End");
        if (string == null) {
            return null;
        }
        String string2 = w.a(string, "phase" + by2 + ":", "phase" + by2 + "End");
        if (string2 == null) {
            string2 = w.a(string, "phaseAll:", "phaseAllEnd");
        }
        if (string2 == null) {
            return null;
        }
        int n2 = w.a(string2, "amount");
        object = new Vector();
        Image image = null;
        Image image2 = null;
        Image image3 = null;
        Image image4 = null;
        Image image5 = null;
        for (int i = 1; i <= n2; ++i) {
            Object object2 = w.a(string2, "rock" + i + ":", "rock" + i + "End");
            short s2 = w.a((String)object2, "id");
            byte by3 = w.a((String)object2, "type");
            object2 = w.a((String)object2, "position");
            if (w.a(s.b, (int)s2)) continue;
            j j2 = null;
            if (by3 == 0) {
                if (image2 == null) {
                    image2 = w.a("/pic/wood.ps");
                }
                j2 = new j(image2);
            } else if (by3 == 1) {
                if (image == null) {
                    image = w.a("/pic/rock.ps");
                }
                j2 = new j(image);
            } else if (by3 == 2) {
                if (image3 == null) {
                    image3 = w.a("/pic/rock2.ps");
                }
                j2 = new j(image3);
            } else if (by3 == 3) {
                if (image4 == null) {
                    image4 = w.a("/pic/door.ps");
                    image4 = Image.createImage((Image)image4, (int)0, (int)0, (int)(image4.getWidth() >> 1), (int)image4.getHeight(), (int)0);
                }
                j2 = new j(image4);
            } else if (by3 == 4) {
                if (image5 == null) {
                    image5 = w.a("/role/mjdz.png");
                }
                j2 = new j(image5);
            }
            j2.a = by3;
            j2.a = s2;
            j2.a((int)object2[0], (int)object2[1]);
            j2.s = (byte)3;
            ((Vector)object).addElement(j2);
        }
        if (((Vector)object).size() > 0) {
            objectArray = new j[((Vector)object).size()];
            ((Vector)object).copyInto(objectArray);
        }
        return objectArray;
    }

    private static a[] a() {
        Object[] objectArray = null;
        byte by = s.c;
        byte by2 = s.a;
        Object object = w.a("/txt/switch.txt");
        String string = w.a((String)object, "scene" + by + ":", "scene" + by + "End");
        if (string == null) {
            return null;
        }
        String string2 = w.a(string, "phase" + by2 + ":", "phase" + by2 + "End");
        if (string2 == null) {
            string2 = w.a(string, "phaseAll:", "phaseAllEnd");
        }
        if (string2 == null) {
            return null;
        }
        int n2 = w.a(string2, "amount");
        object = new Vector();
        Image image = null;
        for (int i = 1; i <= n2; ++i) {
            String string3 = w.a(string2, "switch" + i + ":", "switch" + i + "End");
            short s2 = w.a(string3, "id");
            short[] sArray = w.a(string3, "position");
            short s3 = w.a(string3, "door");
            a a2 = null;
            if (image == null) {
                image = w.a("/pic/switch.ps");
            }
            a2 = new a(image);
            new a(image).a = s2;
            a2.a(sArray[0], sArray[1]);
            a2.b = s3;
            a2.s = (byte)4;
            if (w.a(s.c, (int)s2)) {
                a2.a = a.c;
            }
            ((Vector)object).addElement(a2);
        }
        if (((Vector)object).size() > 0) {
            objectArray = new a[((Vector)object).size()];
            ((Vector)object).copyInto(objectArray);
        }
        return objectArray;
    }

    private static y[] a() {
        Object[] objectArray = null;
        byte by = s.c;
        byte by2 = s.a;
        Object object = w.a("/txt/door.txt");
        String string = w.a((String)object, "scene" + by + ":", "scene" + by + "End");
        if (string == null) {
            return null;
        }
        String string2 = w.a(string, "phase" + by2 + ":", "phase" + by2 + "End");
        if (string2 == null) {
            string2 = w.a(string, "phaseAll:", "phaseAllEnd");
        }
        if (string2 == null) {
            return null;
        }
        int n2 = w.a(string2, "amount");
        object = new Vector();
        Image image = null;
        for (int i = 1; i <= n2; ++i) {
            Object object2 = w.a(string2, "door" + i + ":", "door" + i + "End");
            short s2 = w.a((String)object2, "id");
            short s3 = w.a((String)object2, "type");
            object2 = w.a((String)object2, "position");
            y y2 = null;
            if (image == null) {
                if (s3 == 0) {
                    image = w.a("/pic/door.ps");
                } else if (s3 == 1) {
                    image = w.a("/pic/chuan.png");
                }
            }
            y2 = new y(image);
            new y(image).a = s2;
            y2.a((int)object2[0], (int)object2[1]);
            y2.s = (byte)5;
            ((Vector)object).addElement(y2);
            if (!w.a(s.d, (int)s2)) continue;
            y2.a = y.c;
        }
        if (((Vector)object).size() > 0) {
            objectArray = new y[((Vector)object).size()];
            ((Vector)object).copyInto(objectArray);
        }
        return objectArray;
    }

    private void e(int n2) {
        s.c = w.c(s.c, n2);
        g g2 = null;
        for (int i = 0; this.b != null && this.b.a != null && i < this.b.a.length; ++i) {
            if (this.b.a[i].t != n2) continue;
            g2 = (g)this.b.a[i];
        }
        if (g2 != null) {
            this.b = g2;
            this.o = (byte)10;
            this.y = true;
            return;
        }
        this.d(0);
    }

    public final void a(e e2) {
        if (this.b || this.a != null) {
            return;
        }
        this.b = true;
        n.a(0);
        this.d = e2;
        this.p = 0;
        this.q = (byte)-1;
        this.a = null;
        this.f = (byte)-1;
        for (int i = 0; i < s.a.length; ++i) {
            s.a[i].a(0);
        }
        this.s = true;
        this.m = 0;
        this.e = 0;
        this.f = 0;
        this.z = true;
    }

    private void q() {
        this.z = false;
        this.d = null;
        this.b = false;
        n.a(1);
    }

    private void r() {
        if (this.z) {
            boolean bl = false;
            for (int i = 0; this.d != null && this.d.a != null && i < this.d.a.length; ++i) {
                if (Integer.parseInt(this.d.a[i][0]) != this.p) continue;
                bl = true;
                if (this.p <= this.q) continue;
                this.q = this.p;
                if (this.e > 0) {
                    this.e = (short)(this.e - 1);
                }
                this.a(this.d.a[i], 1);
            }
            if (!bl) {
                this.d(0);
            }
            if (this.d != null && this.p > Integer.parseInt(this.d.a[this.d.a.length - 1][0])) {
                if (!this.d.b && this.d.e > 0) {
                    s.c(this.d.e);
                }
                this.q();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(String[] object, int n2) {
        int n3;
        boolean bl;
        block191: {
            g g2;
            byte by;
            byte by2;
            block190: {
                boolean bl2;
                int n4;
                int n5;
                int n6;
                int n7;
                block186: {
                    int n8;
                    int n9;
                    int n10;
                    block184: {
                        boolean bl3;
                        int n11;
                        int n12;
                        int n13;
                        block182: {
                            boolean bl4;
                            block181: {
                                int n14;
                                int n15;
                                int n16;
                                block177: {
                                    boolean bl5;
                                    int n17;
                                    block174: {
                                        block148: {
                                            short s2;
                                            short s3;
                                            block154: {
                                                block189: {
                                                    block188: {
                                                        block187: {
                                                            block185: {
                                                                block183: {
                                                                    block179: {
                                                                        Object object2;
                                                                        block180: {
                                                                            block178: {
                                                                                block176: {
                                                                                    block175: {
                                                                                        block173: {
                                                                                            block172: {
                                                                                                block171: {
                                                                                                    block170: {
                                                                                                        block169: {
                                                                                                            block168: {
                                                                                                                block167: {
                                                                                                                    block166: {
                                                                                                                        block165: {
                                                                                                                            block164: {
                                                                                                                                block163: {
                                                                                                                                    block162: {
                                                                                                                                        block161: {
                                                                                                                                            block160: {
                                                                                                                                                block159: {
                                                                                                                                                    block158: {
                                                                                                                                                        block157: {
                                                                                                                                                            block156: {
                                                                                                                                                                block155: {
                                                                                                                                                                    block153: {
                                                                                                                                                                        block152: {
                                                                                                                                                                            block151: {
                                                                                                                                                                                block150: {
                                                                                                                                                                                    block149: {
                                                                                                                                                                                        block147: {
                                                                                                                                                                                            System.out.println("\u6267\u884c\u4e8b\u4ef6:" + (String)object[n2]);
                                                                                                                                                                                            if (((String)object[n2]).equals("\u5bf9\u8bdd")) {
                                                                                                                                                                                                this.b((String[])object, n2 + 1);
                                                                                                                                                                                                this.d(1);
                                                                                                                                                                                                return;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (((String)object[n2]).equals("\u6218\u6597")) {
                                                                                                                                                                                                this.c((String[])object, n2 + 1);
                                                                                                                                                                                                return;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (((String)object[n2]).equals("\u6e05\u9664BOSS") || ((String)object[n2]).equals("\u6e05\u9664\u654c\u4eba")) {
                                                                                                                                                                                                this.e(Integer.parseInt((String)object[n2 + 1]));
                                                                                                                                                                                                return;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (((String)object[n2]).equals("\u590d\u6d3b\u89d2\u8272")) {
                                                                                                                                                                                                int n18 = Integer.parseInt((String)object[n2 + 1]);
                                                                                                                                                                                                object = this;
                                                                                                                                                                                                s.c = w.b(s.c, n18);
                                                                                                                                                                                                ((t)object).d(0);
                                                                                                                                                                                                return;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (!((String)object[n2]).equals("\u66f4\u65b0\u9636\u6bb5")) break block147;
                                                                                                                                                                                            s.a = Byte.parseByte((String)object[n2 + 1]);
                                                                                                                                                                                            break block148;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (!((String)object[n2]).equals("\u53bb\u9664\u4e8b\u4ef6")) break block149;
                                                                                                                                                                                        s.c(Integer.parseInt((String)object[n2 + 1]));
                                                                                                                                                                                        break block148;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (!((String)object[n2]).equals("\u83b7\u53d6\u9053\u5177")) break block150;
                                                                                                                                                                                    s.a(Integer.parseInt((String)object[n2 + 1]), 1);
                                                                                                                                                                                    break block148;
                                                                                                                                                                                }
                                                                                                                                                                                if (!((String)object[n2]).equals("\u83b7\u53d6\u88c5\u5907")) break block151;
                                                                                                                                                                                s.e(Integer.parseInt((String)object[n2 + 1]), 1);
                                                                                                                                                                                break block148;
                                                                                                                                                                            }
                                                                                                                                                                            if (((String)object[n2]).equals("\u83b7\u53d6\u6280\u80fd")) {
                                                                                                                                                                                if (n2 + 2 <= ((Object)object).length - 1) {
                                                                                                                                                                                    int n19 = Integer.parseInt((String)object[n2 + 1]);
                                                                                                                                                                                    byte by3 = Byte.parseByte((String)object[n2 + 2]);
                                                                                                                                                                                    for (int i = 0; this.b.a != null && i < this.b.a.length; ++i) {
                                                                                                                                                                                        if (this.b.a[i].s != 1 || ((g)this.b.a[i]).t != n19) continue;
                                                                                                                                                                                        s.a((g)this.b.a[i], (int)by3);
                                                                                                                                                                                    }
                                                                                                                                                                                } else if (n2 + 1 <= ((Object)object).length - 1) {
                                                                                                                                                                                    s.a(s.a[0], Integer.parseInt((String)object[n2 + 1]));
                                                                                                                                                                                }
                                                                                                                                                                                this.d(0);
                                                                                                                                                                                return;
                                                                                                                                                                            }
                                                                                                                                                                            if (((String)object[n2]).equals("\u63d0\u793a\u4fe1\u606f")) {
                                                                                                                                                                                this.a = new String[]{object[n2 + 1]};
                                                                                                                                                                                this.c = 0;
                                                                                                                                                                                this.b = (byte)6;
                                                                                                                                                                                return;
                                                                                                                                                                            }
                                                                                                                                                                            if (!((String)object[n2]).equals("\u5904\u7406\u5931\u8d25")) break block152;
                                                                                                                                                                            s.k();
                                                                                                                                                                            break block148;
                                                                                                                                                                        }
                                                                                                                                                                        if (((String)object[n2]).equals("\u6362\u573a\u666f2") || ((String)object[n2]).equals("\u6362\u573a\u666f")) {
                                                                                                                                                                            this.c = true;
                                                                                                                                                                            d = Byte.parseByte((String)object[n2 + 2]);
                                                                                                                                                                            this.a(Byte.parseByte((String)object[n2 + 1]));
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        if (!((String)object[n2]).equals("\u77ac\u79fb")) break block153;
                                                                                                                                                                        s3 = Short.parseShort((String)object[n2 + 1]);
                                                                                                                                                                        s2 = Short.parseShort((String)object[n2 + 2]);
                                                                                                                                                                        this.w = true;
                                                                                                                                                                        break block154;
                                                                                                                                                                    }
                                                                                                                                                                    if (!((String)object[n2]).equals("\u8f6c\u5411")) break block155;
                                                                                                                                                                    s.a[0].b(Integer.parseInt((String)object[n2 + 1]));
                                                                                                                                                                    break block148;
                                                                                                                                                                }
                                                                                                                                                                if (((String)object[n2]).equals("NPC\u8f6c\u5411")) {
                                                                                                                                                                    byte by4 = Byte.parseByte((String)object[n2 + 1]);
                                                                                                                                                                    byte by5 = Byte.parseByte((String)object[n2 + 2]);
                                                                                                                                                                    for (int i = 0; this.b.a != null && i < this.b.a.length; ++i) {
                                                                                                                                                                        if (this.b.a[i].s != 1 || ((g)this.b.a[i]).t != by4) continue;
                                                                                                                                                                        ((g)this.b.a[i]).b(by5);
                                                                                                                                                                    }
                                                                                                                                                                    this.d(0);
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                if (((String)object[n2]).equals("\u8d70\u52a8")) {
                                                                                                                                                                    boolean bl6 = false;
                                                                                                                                                                    int n20 = Integer.parseInt((String)object[n2 + 1]);
                                                                                                                                                                    g g3 = this.a(1);
                                                                                                                                                                    if (g3 != null) {
                                                                                                                                                                        System.out.println("\u4eba\u7269\u8d70\u52a8" + g3.t);
                                                                                                                                                                        if (n20 < 4) {
                                                                                                                                                                            t.a(g3, n20, 3, Integer.parseInt((String)object[n2 + 2]), 0, 0);
                                                                                                                                                                        } else {
                                                                                                                                                                            t.a(g3, n20, 3, Integer.parseInt((String)object[n2 + 2]), Integer.parseInt((String)object[n2 + 3]), Integer.parseInt((String)object[n2 + 4]));
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    this.d(1);
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                if (((String)object[n2]).equals("\u4eba\u7269\u8d70\u52a8")) {
                                                                                                                                                                    int n21 = Integer.parseInt((String)object[n2 + 1]);
                                                                                                                                                                    int n22 = Integer.parseInt((String)object[n2 + 2]);
                                                                                                                                                                    g g4 = this.a(n21);
                                                                                                                                                                    if (g4 == null) {
                                                                                                                                                                        System.out.println("\u573a\u666f\u91cc\u6ca1\u6709\u4eba\u7269" + n21);
                                                                                                                                                                        this.d(2);
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    System.out.println("\u4eba\u7269\u8d70\u52a8" + g4.t);
                                                                                                                                                                    if (n22 < 4) {
                                                                                                                                                                        t.a(g4, n22, 3, Integer.parseInt((String)object[n2 + 3]), 0, 0);
                                                                                                                                                                    } else {
                                                                                                                                                                        t.a(g4, n22, 3, Integer.parseInt((String)object[n2 + 3]), Integer.parseInt((String)object[n2 + 4]), Integer.parseInt((String)object[n2 + 5]));
                                                                                                                                                                    }
                                                                                                                                                                    this.d(1);
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                if (!((String)object[n2]).equals("\u6218\u6597\u80dc\u5229") && !((String)object[n2]).equals("\u80dc\u5229\u52a8\u4f5c")) break block156;
                                                                                                                                                                if (this.f == 2) {
                                                                                                                                                                    if (this.m == 0) {
                                                                                                                                                                        this.m = 1;
                                                                                                                                                                    }
                                                                                                                                                                    this.a((String[])object, n2 + 1);
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                this.m = (byte)2;
                                                                                                                                                                break block148;
                                                                                                                                                            }
                                                                                                                                                            if (!((String)object[n2]).equals("\u6218\u6597\u5931\u8d25") && !((String)object[n2]).equals("\u5931\u8d25\u52a8\u4f5c")) break block157;
                                                                                                                                                            if (this.f == 0) {
                                                                                                                                                                if (this.m == 0) {
                                                                                                                                                                    this.m = 1;
                                                                                                                                                                }
                                                                                                                                                                this.a((String[])object, n2 + 1);
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                            this.m = (byte)2;
                                                                                                                                                            break block148;
                                                                                                                                                        }
                                                                                                                                                        if (!((String)object[n2]).equals("\u6218\u6597\u9003\u8dd1") && !((String)object[n2]).equals("\u9003\u8dd1\u52a8\u4f5c")) break block158;
                                                                                                                                                        if (this.f == 1) {
                                                                                                                                                            if (this.m == 0) {
                                                                                                                                                                this.m = 1;
                                                                                                                                                            }
                                                                                                                                                            this.a((String[])object, n2 + 1);
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        this.m = (byte)2;
                                                                                                                                                        break block148;
                                                                                                                                                    }
                                                                                                                                                    if (((String)object[n2]).equals("\u5bf9\u8bdd\u4e2d\u9009\u62e9")) {
                                                                                                                                                        if (this.a == null) {
                                                                                                                                                            this.a = new aq();
                                                                                                                                                            this.a.d();
                                                                                                                                                        }
                                                                                                                                                        this.a.b = new String[((Object)object).length - (n2 + 1)];
                                                                                                                                                        int n23 = n2 + 1;
                                                                                                                                                        while (true) {
                                                                                                                                                            if (n23 >= ((Object)object).length) {
                                                                                                                                                                this.a.c = aq.e;
                                                                                                                                                                this.b = (byte)2;
                                                                                                                                                                this.a.a = true;
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                            this.a.b[n23 - (n2 + 1)] = object[n23];
                                                                                                                                                            ++n23;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (!((String)object[n2]).equals("\u9009\u62e9\u4e86")) break block159;
                                                                                                                                                    if (this.a != null && this.a.equals(object[n2 + 1])) {
                                                                                                                                                        if (this.m == 0) {
                                                                                                                                                            this.m = 1;
                                                                                                                                                        }
                                                                                                                                                        this.a((String[])object, n2 + 2);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    this.m = (byte)2;
                                                                                                                                                    break block148;
                                                                                                                                                }
                                                                                                                                                if (!((String)object[n2]).equals("\u4eba\u53d8\u8239")) break block160;
                                                                                                                                                ((ar)s.a[0]).r = (byte)2;
                                                                                                                                                ((ar)s.a[0]).d(2);
                                                                                                                                                s.a(s.a);
                                                                                                                                                break block148;
                                                                                                                                            }
                                                                                                                                            if (!((String)object[n2]).equals("\u4eba\u53d8\u82391")) break block161;
                                                                                                                                            ((ar)s.a[0]).r = (byte)2;
                                                                                                                                            ((ar)s.a[0]).s = Short.parseShort((String)object[n2 + 1]);
                                                                                                                                            ((ar)s.a[0]).t = Short.parseShort((String)object[n2 + 2]);
                                                                                                                                            ((ar)s.a[0]).d(2);
                                                                                                                                            s.a(s.a);
                                                                                                                                            break block148;
                                                                                                                                        }
                                                                                                                                        if (!((String)object[n2]).equals("\u8239\u53d8\u4eba")) break block162;
                                                                                                                                        ((ar)s.a[0]).r = 1;
                                                                                                                                        ((ar)s.a[0]).d(1);
                                                                                                                                        s.a(s.a);
                                                                                                                                        break block148;
                                                                                                                                    }
                                                                                                                                    if (!((String)object[n2]).equals("\u8239\u53d8\u4eba1")) break block163;
                                                                                                                                    ((ar)s.a[0]).r = 1;
                                                                                                                                    ((ar)s.a[0]).d(1);
                                                                                                                                    ((ar)s.a[0]).s = Short.parseShort((String)object[n2 + 1]);
                                                                                                                                    ((ar)s.a[0]).t = Short.parseShort((String)object[n2 + 2]);
                                                                                                                                    s.a(s.a);
                                                                                                                                    break block148;
                                                                                                                                }
                                                                                                                                if (((String)object[n2]).equals("\u53bb\u6389\u8239")) {
                                                                                                                                    int n24 = 0;
                                                                                                                                    while (true) {
                                                                                                                                        if (n24 >= ba.a.b.a.length) {
                                                                                                                                            this.d(0);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        if (ba.a.b.a[n24].s == 5 && ((y)ba.a.b.a[n24]).a == Short.parseShort((String)object[n2 + 1])) {
                                                                                                                                            ((y)ba.a.b.a[n24]).a = y.c;
                                                                                                                                            if (!w.a(s.d, (int)((y)ba.a.b.a[n24]).a)) {
                                                                                                                                                s.d = w.b(s.d, (int)((y)ba.a.b.a[n24]).a);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        ++n24;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (((String)object[n2]).equals("\u52a0\u4e0a\u8239")) {
                                                                                                                                    int n25 = 0;
                                                                                                                                    while (true) {
                                                                                                                                        if (n25 >= ba.a.b.a.length) {
                                                                                                                                            this.d(0);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        if (ba.a.b.a[n25].s == 5 && ((y)ba.a.b.a[n25]).a == Short.parseShort((String)object[n2 + 1])) {
                                                                                                                                            ((y)ba.a.b.a[n25]).a = 0;
                                                                                                                                            if (w.a(s.d, (int)((y)ba.a.b.a[n25]).a)) {
                                                                                                                                                s.d = w.a(s.d, (int)((y)ba.a.b.a[n25]).a);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        ++n25;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (((String)object[n2]).equals("\u52a0\u5165\u4efb\u52a1")) {
                                                                                                                                    byte by6 = Byte.parseByte((String)object[n2 + 1]);
                                                                                                                                    if (!w.a(s.e, (int)by6)) {
                                                                                                                                        s.d = w.c(s.d, by6);
                                                                                                                                        s.e = w.c(s.e, by6);
                                                                                                                                    }
                                                                                                                                    this.d(0);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                if (!((String)object[n2]).equals("\u79fb\u9664\u4efb\u52a1")) break block164;
                                                                                                                                byte by7 = Byte.parseByte((String)object[n2 + 1]);
                                                                                                                                s.d = w.b(s.d, (int)by7);
                                                                                                                                break block148;
                                                                                                                            }
                                                                                                                            if (((String)object[n2]).equals("\u5df2\u53d1\u751f\u4e8b\u4ef6")) {
                                                                                                                                int n26 = Integer.parseInt((String)object[n2 + 1]);
                                                                                                                                if (!w.a(s.f, n26)) {
                                                                                                                                    this.m = (byte)2;
                                                                                                                                    this.d(0);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                if (this.m == 0) {
                                                                                                                                    this.m = 1;
                                                                                                                                }
                                                                                                                                this.a((String[])object, n2 + 2);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            if (((String)object[n2]).equals("\u672a\u53d1\u751f\u4e8b\u4ef6")) {
                                                                                                                                int n27 = Integer.parseInt((String)object[n2 + 1]);
                                                                                                                                if (w.a(s.f, n27)) {
                                                                                                                                    this.m = (byte)2;
                                                                                                                                    this.d(0);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                if (this.m == 0) {
                                                                                                                                    this.m = 1;
                                                                                                                                }
                                                                                                                                this.a((String[])object, n2 + 2);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            if (!((String)object[n2]).equals("\u6709\u9053\u5177")) break block165;
                                                                                                                            if (s.a(Integer.parseInt((String)object[n2 + 1])) > 0) {
                                                                                                                                if (this.m == 0) {
                                                                                                                                    this.m = 1;
                                                                                                                                }
                                                                                                                                this.a((String[])object, n2 + 2);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            this.m = (byte)2;
                                                                                                                            break block148;
                                                                                                                        }
                                                                                                                        if (!((String)object[n2]).equals("\u65e0\u9053\u5177")) break block166;
                                                                                                                        if (s.a(Integer.parseInt((String)object[n2 + 1])) <= 0) {
                                                                                                                            if (this.m == 0) {
                                                                                                                                this.m = 1;
                                                                                                                            }
                                                                                                                            this.a((String[])object, n2 + 2);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        this.m = (byte)2;
                                                                                                                        break block148;
                                                                                                                    }
                                                                                                                    if (((String)object[n2]).equals("\u6709\u6280\u80fd")) {
                                                                                                                        boolean bl7 = false;
                                                                                                                        int n28 = Integer.parseInt((String)object[n2 + 1]);
                                                                                                                        int n29 = Integer.parseInt((String)object[n2 + 2]);
                                                                                                                        bl7 = w.a(s.a[n28].a, n29);
                                                                                                                        if (!bl7) {
                                                                                                                            this.m = (byte)2;
                                                                                                                            this.d(0);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        if (this.m == 0) {
                                                                                                                            this.m = 1;
                                                                                                                        }
                                                                                                                        this.a((String[])object, n2 + 2);
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    if (!((String)object[n2]).equals("\u65e0\u6280\u80fd")) break block167;
                                                                                                                    if (!s.c(Integer.parseInt((String)object[n2 + 1]))) {
                                                                                                                        if (this.m == 0) {
                                                                                                                            this.m = 1;
                                                                                                                        }
                                                                                                                        this.a((String[])object, n2 + 2);
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    this.m = (byte)2;
                                                                                                                    break block148;
                                                                                                                }
                                                                                                                if (!((String)object[n2]).equals("\u6263\u9664\u9053\u5177")) break block168;
                                                                                                                s.c(Integer.parseInt((String)object[n2 + 1]), Integer.parseInt((String)object[n2 + 2]));
                                                                                                                break block148;
                                                                                                            }
                                                                                                            if (!((String)object[n2]).equals("\u6263\u9664\u6750\u6599")) break block169;
                                                                                                            s.d(Integer.parseInt((String)object[n2 + 1]), Integer.parseInt((String)object[n2 + 2]));
                                                                                                            break block148;
                                                                                                        }
                                                                                                        if (((String)object[n2]).equals("\u7ed3\u675f\u4efb\u52a1") || ((String)object[n2]).equals("\u7ed3\u675f\u811a\u672c")) {
                                                                                                            this.q();
                                                                                                            return;
                                                                                                        }
                                                                                                        if (((String)object[n2]).equals("\u6e38\u620f\u7ed3\u5c40")) {
                                                                                                            if (this.a != null) {
                                                                                                                this.a.b();
                                                                                                            }
                                                                                                            this.r = Byte.parseByte((String)object[n2 + 1]);
                                                                                                            this.a = (byte)3;
                                                                                                            this.s();
                                                                                                            return;
                                                                                                        }
                                                                                                        if (!((String)object[n2]).equals("\u6e38\u620f\u7ed3\u5c401")) break block170;
                                                                                                        if (this.a != null) {
                                                                                                            this.a.b();
                                                                                                        }
                                                                                                        this.r = Byte.parseByte((String)object[n2 + 1]);
                                                                                                        s.f = true;
                                                                                                        this.s();
                                                                                                        break block148;
                                                                                                    }
                                                                                                    if (!((String)object[n2]).equals("\u573a\u666f\u6296\u52a8")) break block171;
                                                                                                    this.n = true;
                                                                                                    break block148;
                                                                                                }
                                                                                                if (!((String)object[n2]).equals("\u573a\u666f\u6296\u52a8\u505c")) break block172;
                                                                                                this.n = false;
                                                                                                break block148;
                                                                                            }
                                                                                            if (!((String)object[n2]).equals("\u52a0\u5165\u961f\u4f0d")) break block173;
                                                                                            n17 = Integer.parseInt((String)object[n2 + 1]);
                                                                                            bl5 = false;
                                                                                            break block174;
                                                                                        }
                                                                                        if (!((String)object[n2]).equals("\u79bb\u5f00\u961f\u4f0d")) break block175;
                                                                                        s.d(Integer.parseInt((String)object[n2 + 1]));
                                                                                        ba.a.m();
                                                                                        break block148;
                                                                                    }
                                                                                    if (((String)object[n2]).equals("\u4e70\u9053\u5177")) {
                                                                                        this.a("\u4e70\u9053\u5177", Integer.parseInt((String)object[n2 + 1]));
                                                                                        return;
                                                                                    }
                                                                                    if (((String)object[n2]).equals("\u5356\u9053\u5177")) {
                                                                                        this.a("\u5356\u9053\u5177", 0);
                                                                                        return;
                                                                                    }
                                                                                    if (((String)object[n2]).equals("\u4e70\u88c5\u5907")) {
                                                                                        this.a("\u4e70\u88c5\u5907", Integer.parseInt((String)object[n2 + 1]));
                                                                                        this.e = 1;
                                                                                        return;
                                                                                    }
                                                                                    if (((String)object[n2]).equals("\u4e70\u7279\u6b8a\u88c5\u5907")) {
                                                                                        this.a("\u4e70\u7279\u6b8a\u88c5\u5907", Integer.parseInt((String)object[n2 + 1]));
                                                                                        this.e = (byte)Integer.parseInt((String)object[n2 + 2]);
                                                                                        return;
                                                                                    }
                                                                                    if (((String)object[n2]).equals("\u5356\u88c5\u5907")) {
                                                                                        this.a("\u5356\u88c5\u5907", 0);
                                                                                        return;
                                                                                    }
                                                                                    if (((String)object[n2]).equals("\u5347\u7ea7\u6b66\u5668")) {
                                                                                        this.a("\u5347\u7ea7\u6b66\u5668", 11);
                                                                                        return;
                                                                                    }
                                                                                    if (((String)object[n2]).equals("\u5347\u7ea7\u9632\u5177")) {
                                                                                        this.a("\u5347\u7ea7\u9632\u5177", 11);
                                                                                        return;
                                                                                    }
                                                                                    if (((String)object[n2]).equals("\u5347\u7ea7\u9996\u9970")) {
                                                                                        this.a("\u5347\u7ea7\u9996\u9970", 11);
                                                                                        return;
                                                                                    }
                                                                                    if (!((String)object[n2]).equals("\u6539\u53d8\u5c5e\u6027")) break block176;
                                                                                    n16 = Integer.parseInt((String)object[n2 + 1]);
                                                                                    n15 = Integer.parseInt((String)object[n2 + 2]);
                                                                                    n14 = Integer.parseInt((String)object[n2 + 3]);
                                                                                    break block177;
                                                                                }
                                                                                if (((String)object[n2]).equals("\u79fb\u9664NPC")) {
                                                                                    byte by8 = Byte.parseByte((String)object[n2 + 1]);
                                                                                    for (int i = 0; this.b.a != null && i < this.b.a.length; ++i) {
                                                                                        if (this.b.a[i].s != 1 || ((g)this.b.a[i]).t != by8) continue;
                                                                                        this.b.b(this.b.a[i]);
                                                                                    }
                                                                                    this.d(0);
                                                                                    return;
                                                                                }
                                                                                if (!((String)object[n2]).equals("\u6539\u590d\u6d3b\u70b9")) break block178;
                                                                                s.c = Short.parseShort((String)object[n2 + 1]);
                                                                                s.g = Byte.parseByte((String)object[n2 + 2]);
                                                                                break block148;
                                                                            }
                                                                            if (((String)object[n2]).equals("\u9053\u5177\u6570\u91cf")) {
                                                                                short s4 = Short.parseShort((String)object[n2 + 1]);
                                                                                Object object3 = object[n2 + 2];
                                                                                int n30 = Integer.parseInt((String)object[n2 + 3]);
                                                                                if (((String)object3).equals("\u5927\u4e8e")) {
                                                                                    if (s.a(s4) > n30) {
                                                                                        if (this.m == 0) {
                                                                                            this.m = 1;
                                                                                        }
                                                                                        this.a((String[])object, n2 + 4);
                                                                                        return;
                                                                                    }
                                                                                    this.m = (byte)2;
                                                                                } else if (((String)object3).equals("\u5c0f\u4e8e")) {
                                                                                    if (s.a(s4) < n30) {
                                                                                        if (this.m == 0) {
                                                                                            this.m = 1;
                                                                                        }
                                                                                        this.a((String[])object, n2 + 4);
                                                                                        return;
                                                                                    }
                                                                                    this.m = (byte)2;
                                                                                }
                                                                                this.d(0);
                                                                                return;
                                                                            }
                                                                            if (((String)object[n2]).equals("\u6750\u6599\u6570\u91cf")) {
                                                                                short s5 = Short.parseShort((String)object[n2 + 1]);
                                                                                Object object4 = object[n2 + 2];
                                                                                int n31 = Integer.parseInt((String)object[n2 + 3]);
                                                                                if (((String)object4).equals("\u5927\u4e8e")) {
                                                                                    if (s.b(s5) > n31) {
                                                                                        if (this.m == 0) {
                                                                                            this.m = 1;
                                                                                        }
                                                                                        this.a((String[])object, n2 + 4);
                                                                                        return;
                                                                                    }
                                                                                    this.m = (byte)2;
                                                                                } else if (((String)object4).equals("\u5c0f\u4e8e")) {
                                                                                    if (s.b(s5) < n31) {
                                                                                        if (this.m == 0) {
                                                                                            this.m = 1;
                                                                                        }
                                                                                        this.a((String[])object, n2 + 4);
                                                                                        return;
                                                                                    }
                                                                                    this.m = (byte)2;
                                                                                }
                                                                                this.d(0);
                                                                                return;
                                                                            }
                                                                            if (!((String)object[n2]).equals("\u5224\u65ad\u5c5e\u6027")) break block179;
                                                                            n13 = Integer.parseInt((String)object[n2 + 1]);
                                                                            n12 = Integer.parseInt((String)object[n2 + 2]);
                                                                            object2 = object[n2 + 3];
                                                                            n11 = Integer.parseInt((String)object[n2 + 4]);
                                                                            if (!((String)object2).equals("\u5927\u4e8e")) break block180;
                                                                            bl4 = false;
                                                                            break block181;
                                                                        }
                                                                        if (!((String)object2).equals("\u5c0f\u4e8e")) {
                                                                            this.d(0);
                                                                            return;
                                                                        }
                                                                        bl3 = false;
                                                                        break block182;
                                                                    }
                                                                    if (!((String)object[n2]).equals("\u64ad\u653e\u52a8\u4f5c")) break block183;
                                                                    n10 = Integer.parseInt((String)object[n2 + 1]);
                                                                    n9 = Integer.parseInt((String)object[n2 + 2]);
                                                                    n8 = 0;
                                                                    if (n2 + 3 < ((Object)object).length) {
                                                                        n8 = Integer.parseInt((String)object[n2 + 3]);
                                                                    }
                                                                    break block184;
                                                                }
                                                                if (((String)object[n2]).equals("\u4f11\u606f")) {
                                                                    int n32 = 0;
                                                                    while (true) {
                                                                        if (n32 >= s.a.length) {
                                                                            s.a(s.a);
                                                                            this.l = (byte)20;
                                                                            this.q = true;
                                                                            return;
                                                                        }
                                                                        s.a[n32].a[3] = s.a[n32].a[33];
                                                                        s.a[n32].a[5] = s.a[n32].a[34];
                                                                        ++n32;
                                                                    }
                                                                }
                                                                if (!((String)object[n2]).equals("\u8f7d\u5165\u4eba\u7269")) break block185;
                                                                n7 = Integer.parseInt((String)object[n2 + 1]);
                                                                n6 = Integer.parseInt((String)object[n2 + 2]);
                                                                n5 = Integer.parseInt((String)object[n2 + 3]);
                                                                n4 = Integer.parseInt((String)object[n2 + 4]);
                                                                bl2 = false;
                                                                break block186;
                                                            }
                                                            if (!((String)object[n2]).equals("\u6709\u88c5\u5907")) break block187;
                                                            if (s.a(Integer.parseInt((String)object[n2 + 1]), Integer.parseInt((String)object[n2 + 2]))) {
                                                                if (this.m == 0) {
                                                                    this.m = 1;
                                                                }
                                                                this.a((String[])object, n2 + 3);
                                                                return;
                                                            }
                                                            this.m = (byte)2;
                                                            break block148;
                                                        }
                                                        if (!((String)object[n2]).equals("\u65e0\u88c5\u5907")) break block188;
                                                        if (!s.a(Integer.parseInt((String)object[n2 + 1]), Integer.parseInt((String)object[n2 + 2]))) {
                                                            if (this.m == 0) {
                                                                this.m = 1;
                                                            }
                                                            this.a((String[])object, n2 + 3);
                                                            return;
                                                        }
                                                        this.m = (byte)2;
                                                        break block148;
                                                    }
                                                    if (((String)object[n2]).equals("\u5fc5\u8d25\u6218\u6597")) {
                                                        this.k = true;
                                                        this.c((String[])object, n2 + 1);
                                                        return;
                                                    }
                                                    if (((String)object[n2]).equals("\u91d1\u94b1\u6570\u91cf")) {
                                                        Object object5 = object[n2 + 1];
                                                        int n33 = Integer.parseInt((String)object[n2 + 2]);
                                                        if (((String)object5).equals("\u5927\u4e8e")) {
                                                            if (s.a > n33) {
                                                                if (this.m == 0) {
                                                                    this.m = 1;
                                                                }
                                                                this.a((String[])object, n2 + 3);
                                                                return;
                                                            }
                                                            this.m = (byte)2;
                                                        } else if (((String)object5).equals("\u5c0f\u4e8e")) {
                                                            if (s.a < n33) {
                                                                if (this.m == 0) {
                                                                    this.m = 1;
                                                                }
                                                                this.a((String[])object, n2 + 3);
                                                                return;
                                                            }
                                                            this.m = (byte)2;
                                                        }
                                                        this.d(0);
                                                        return;
                                                    }
                                                    if (!((String)object[n2]).equals("\u5e73\u79fb")) break block189;
                                                    by2 = Byte.parseByte((String)object[n2 + 1]);
                                                    by = Byte.parseByte((String)object[n2 + 2]);
                                                    g2 = null;
                                                    break block190;
                                                }
                                                if (((String)object[n2]).equals("\u8fde\u7eed\u6267\u884c")) {
                                                    this.d(0);
                                                    this.f = this.e = Short.parseShort((String)object[n2 + 1]);
                                                    return;
                                                }
                                                if (((String)object[n2]).equals("\u53d8\u901f\u8d70\u52a8")) {
                                                    int n34 = Integer.parseInt((String)object[n2 + 1]);
                                                    int n35 = Integer.parseInt((String)object[n2 + 2]);
                                                    int n36 = Integer.parseInt((String)object[n2 + 3]);
                                                    g g5 = this.a(n34);
                                                    if (g5 != null) {
                                                        System.out.println(g5.t + "\u53d8\u901f=" + n35);
                                                        if (n36 < 4) {
                                                            t.a(g5, n36, n35, Integer.parseInt((String)object[n2 + 4]), 0, 0);
                                                        } else {
                                                            t.a(g5, n36, n35, Integer.parseInt((String)object[n2 + 4]), Integer.parseInt((String)object[n2 + 5]), Integer.parseInt((String)object[n2 + 6]));
                                                        }
                                                    }
                                                    this.d(1);
                                                    return;
                                                }
                                                if (((String)object[n2]).equals("\u6539\u53d8\u91d1\u94b1")) {
                                                    int n37 = Integer.parseInt((String)object[n2 + 1]);
                                                    if ((s.a += n37) < 0) {
                                                        s.a = 0;
                                                    }
                                                    this.d(0);
                                                    return;
                                                }
                                                if (((String)object[n2]).equals("\u7ee7\u627f\u6761\u4ef6")) {
                                                    if (this.s) {
                                                        this.a((String[])object, n2 + 1);
                                                        return;
                                                    }
                                                    this.d(0);
                                                    return;
                                                }
                                                if (((String)object[n2]).equals("\u64ad\u653e\u80cc\u666f\u97f3\u4e50")) {
                                                    if (GameMIDlet.self.playMusic && this.a != null) {
                                                        this.a.a();
                                                    }
                                                    this.d(0);
                                                    return;
                                                }
                                                if (((String)object[n2]).equals("\u505c\u6b62\u80cc\u666f\u97f3\u4e50")) {
                                                    if (GameMIDlet.self.playMusic && this.a != null) {
                                                        this.a.b();
                                                    }
                                                    this.d(0);
                                                    return;
                                                }
                                                if (!((String)object[n2]).equals("\u6709\u540c\u4f34")) break block148;
                                                bl = false;
                                                n3 = Integer.parseInt((String)object[n2 + 1]);
                                                break block191;
                                            }
                                            for (int i = 0; s.a != null && i < s.a.length; ++i) {
                                                s.a[i].s = s3;
                                                s.a[i].t = i == 0 ? s2 : (short)(s.a[i - 1].t - s.a[0].c);
                                                s.a[i].b(0);
                                                s.a[0].h();
                                            }
                                            ((at)ba.a).b = 0;
                                            ((at)ba.a).a = 0;
                                        }
                                        this.d(0);
                                        return;
                                    }
                                    for (int i = 0; i < ba.a.b.a.length; ++i) {
                                        if (ba.a.b.a[i].t != n17 || ba.a.b.a[i].s != 1) continue;
                                        bl5 = true;
                                        g g6 = (g)ba.a.b.a[i];
                                        s.a(g6);
                                        s.b(g6);
                                        g6.f();
                                        if (g6.t != 41 && g6.t != 48) break;
                                        s.d(g6);
                                        s.c(g6);
                                        g6.a[3] = g6.a[33];
                                        g6.a[5] = g6.a[34];
                                        break;
                                    }
                                    if (!bl5) {
                                        g g7 = s.a(n17);
                                        s.b(g7);
                                        ba.a.b.a(g7);
                                        s.d(g7);
                                        s.c(g7);
                                        g7.a[3] = g7.a[33];
                                        g7.a[5] = g7.a[34];
                                    }
                                    this.d(0);
                                    return;
                                }
                                for (int i = 0; this.b.a != null && i < this.b.a.length; ++i) {
                                    if (this.b.a[i].s != 1 || ((g)this.b.a[i]).t != n16) continue;
                                    if (n15 < ((g)this.b.a[i]).a.length) {
                                        int n38 = n15;
                                        ((g)this.b.a[i]).a[n38] = ((g)this.b.a[i]).a[n38] + n14;
                                        s.a(new g[]{(g)this.b.a[i]});
                                        break;
                                    }
                                    System.out.println("\u6539\u53d8\u5c5e\u6027\u8d8a\u754c,\u8d8a\u754c\u5c5e\u6027index" + n15);
                                }
                                this.d(0);
                                return;
                            }
                            for (int i = 0; s.a != null && i < s.a.length; ++i) {
                                if (s.a[i].a != n13) continue;
                                if (s.a[i].a[n12] > n11) {
                                    if (this.m == 0) {
                                        this.m = 1;
                                    }
                                    this.a((String[])object, n2 + 5);
                                    bl4 = true;
                                    break;
                                }
                                this.m = (byte)2;
                            }
                            if (bl4) return;
                            this.d(0);
                            return;
                        }
                        for (int i = 0; s.a != null && i < s.a.length; ++i) {
                            if (s.a[i].a != n13) continue;
                            if (s.a[i].a[n12] < n11) {
                                if (this.m == 0) {
                                    this.m = 1;
                                }
                                this.a((String[])object, n2 + 5);
                                bl3 = true;
                                break;
                            }
                            this.m = (byte)2;
                        }
                        if (bl3) return;
                        this.d(0);
                        return;
                    }
                    int n39 = 0;
                    while (this.b.a != null) {
                        if (n39 >= this.b.a.length) return;
                        if (this.b.a[n39].s == 1 && ((g)this.b.a[n39]).t == n10) {
                            ar ar2 = (ar)this.b.a[n39];
                            ar2.a(0);
                            ar2.e(n9);
                            ar2.f = n8;
                            ar2.m = true;
                            return;
                        }
                        ++n39;
                    }
                    return;
                }
                for (int i = 0; i < ba.a.b.a.length; ++i) {
                    if (ba.a.b.a[i].t != n7 || ba.a.b.a[i].s != 1) continue;
                    bl2 = true;
                    s.a((g)ba.a.b.a[i]);
                    ((g)ba.a.b.a[i]).s = (short)n6;
                    ((g)ba.a.b.a[i]).t = (short)n5;
                    ((g)ba.a.b.a[i]).c(n4);
                    ((g)ba.a.b.a[i]).f();
                    break;
                }
                if (!bl2) {
                    g g8 = s.a(n7);
                    s.a(g8);
                    g8.s = (short)n6;
                    g8.t = (short)n5;
                    g8.c(n4);
                    g8.f();
                    ba.a.b.a(g8);
                }
                this.d(0);
                return;
            }
            for (int i = 0; this.b.a != null && i < this.b.a.length; ++i) {
                if (this.b.a[i].s != 1 || ((g)this.b.a[i]).t != by2) continue;
                g2 = (g)this.b.a[i];
                break;
            }
            if (g2 != null) {
                switch (by) {
                    case 1: {
                        g2.t = (short)(g2.t - Integer.parseInt((String)object[n2 + 3]));
                        break;
                    }
                    case 0: {
                        g2.t = (short)(g2.t + Integer.parseInt((String)object[n2 + 3]));
                        break;
                    }
                    case 2: {
                        g2.s = (short)(g2.s - Integer.parseInt((String)object[n2 + 3]));
                        break;
                    }
                    case 3: {
                        g2.s = (short)(g2.s + Integer.parseInt((String)object[n2 + 3]));
                        break;
                    }
                }
            }
            this.d(0);
            return;
        }
        for (int i = 0; i < ba.a.b.a.length; ++i) {
            if (ba.a.b.a[i].t != n3 || ba.a.b.a[i].s != 1) continue;
            bl = true;
            break;
        }
        if (!bl) {
            this.m = (byte)2;
            this.d(0);
            return;
        }
        if (this.m == 0) {
            this.m = 1;
        }
        this.a((String[])object, n2 + 2);
    }

    private void b(String[] object, int n2) {
        boolean bl;
        if (this.a == null) {
            this.a = new aq();
        }
        this.a.b = bl = Integer.parseInt(object[n2]) == 1;
        Vector<String> vector = new Vector<String>();
        Object[] objectArray = null;
        ++n2;
        while (n2 < ((String[])object).length) {
            if (object[n2].indexOf("&") != -1) {
                object[n2] = o.a(object[n2], "&", s.b[0]);
            }
            vector.addElement(object[n2]);
            ++n2;
        }
        if (vector.size() > 0) {
            objectArray = new String[vector.size()];
            vector.copyInto(objectArray);
        }
        this.a.a = this.d.a;
        this.a.a = objectArray;
        this.a.a = 0;
        object = this;
        if (object.d != null && object.d.a != null) {
            object.d.a.f();
            if (object.d.a.d <= 2) {
                if (GameMIDlet.self.debug) {
                    System.out.println("\u8ba9NPC\u8f6c\u5411");
                }
                object.d.a.b = object.d.a.a;
                n2 = s.a[0].t - object.d.a.t;
                int n3 = s.a[0].s - object.d.a.s;
                if (Math.abs(n2) > Math.abs(n3)) {
                    if (n2 < 0) {
                        object.d.a.b(1);
                    } else {
                        object.d.a.b(0);
                    }
                } else if (n3 < 0) {
                    object.d.a.b(2);
                } else {
                    object.d.a.b(3);
                }
            }
        } else if (GameMIDlet.self.debug) {
            System.out.println("eventObj.chatSprite=null");
        }
        this.a.e();
        this.a.a = true;
        this.b = (byte)2;
    }

    private void c(String[] stringArray, int n2) {
        byte[] byArray = new byte[stringArray.length - n2];
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = Byte.parseByte(stringArray[i + n2]);
        }
        this.a(byArray);
    }

    private void a(String string, int n2) {
        this.f();
        System.gc();
        try {
            Thread.sleep(100L);
        }
        catch (InterruptedException interruptedException) {
            InterruptedException interruptedException2 = interruptedException;
            interruptedException.printStackTrace();
        }
        this.a = new ah();
        ah.a = s.a();
        this.a.p = (byte)n2;
        if (string.equals("\u4e70\u9053\u5177")) {
            this.a.a = (byte)10;
            this.a.c = 1;
            s.e();
            this.a.a();
        } else if (string.equals("\u5356\u9053\u5177") || string.equals("\u5356\u88c5\u5907")) {
            this.a.a = (byte)6;
            ah.g = 0;
            ba.a.a.d = 0;
        } else if (string.equals("\u4e70\u88c5\u5907")) {
            this.a.a = (byte)10;
            this.a.c = (byte)3;
            z.a();
            this.a.a();
        } else if (string.equals("\u5347\u7ea7\u6b66\u5668")) {
            this.a.a = (byte)13;
            ah.H = 1;
        } else if (string.equals("\u5347\u7ea7\u9632\u5177")) {
            this.a.a = (byte)14;
            ah.H = (byte)2;
        } else if (string.equals("\u5347\u7ea7\u9996\u9970")) {
            this.a.a = (byte)15;
            ah.H = (byte)3;
        }
        this.a.b();
        this.a.b = true;
        this.b = (byte)3;
    }

    private void s() {
        String string = w.a("/txt/story.txt");
        this.c = w.a(string, "end" + this.r + "Story:", "end" + this.r + "StoryEnd");
        this.c = w.a(this.c, "\r\n", s.a - 10);
        this.c = null;
        this.g = 5;
        this.h = s.b + 5;
        this.i = s.b;
    }

    private static void a(Graphics graphics, int n2, int n3) {
        graphics.setColor(16753731);
        graphics.drawString("\u5f00\u53d1\u4eba\u5458", n2, n3, 33);
        graphics.setColor(0xFFFF00);
        graphics.drawString("\u7b56\u5212", n2, n3 + (w.a << 1), 33);
        graphics.setColor(0xFFFFFF);
        graphics.drawString("\u5f6d\u4f73\u5174", n2, n3 + w.a * 3, 33);
        graphics.setColor(0xFFFF00);
        graphics.drawString("\u7f8e\u672f", n2, n3 + w.a * 5, 33);
        graphics.setColor(0xFFFFFF);
        graphics.drawString("\u6c64\u4f73\u4e3d\uff0c\u674e\u6797", n2, n3 + w.a * 6, 33);
        graphics.setColor(0xFFFF00);
        graphics.drawString("\u7a0b\u5e8f", n2, n3 + (w.a << 3), 33);
        graphics.setColor(0xFFFFFF);
        graphics.drawString("\u8c22\u6587\u660e", n2, n3 + w.a * 9, 33);
        graphics.setColor(0xFFFF00);
        graphics.drawString("\u6d4b\u8bd5", n2, n3 + w.a * 11, 33);
        graphics.setColor(0xFFFFFF);
        graphics.drawString("\u8463\u957f\u742a\uff0c\u5f20\u660e\u534e", n2, n3 + w.a * 12, 33);
        graphics.setColor(0xFFFF00);
        graphics.drawString("\u4e50\u6e38\u4fe1\u606f\u6280\u672f\u6709\u9650\u516c\u53f8", n2, n3 + w.a * 19, 33);
        graphics.drawString("2008.4", n2, n3 + w.a * 20, 33);
    }

    public final void a(int n2, int n3) {
        if (this.a == 2) {
            if (this.b == 3) {
                bg.a(n2, n3);
            } else if (this.b == 4) {
                ad ad2;
                int n4 = n3;
                int n5 = n2;
                if (ba.a.b == 4 && ba.a.a.a == 1 && (ad2 = n.a(n5, n4)) != null && ad2.a == 2 && ba.a.a.b == 1) {
                    if (ba.a.a.c == 0) {
                        if (ba.a.a.g > 0) {
                            ba.a.a.g = (byte)(ba.a.a.g - 1);
                            ba.a.a.h = ba.a.a.a[ba.a.a.g];
                            ba.a.a.d = 1;
                            if (ba.a.a.g == 0) {
                                n.a(0);
                            }
                        } else {
                            n.a(0);
                        }
                    } else if (ba.a.a.c == 1) {
                        ba.a.a.c = 0;
                        if (ba.a.a.g == 0) {
                            n.a(0);
                        }
                    } else if (ba.a.a.c == 2) {
                        ba.a.a.c = 0;
                        ba.a.a.i = 0;
                        if (ba.a.a.g == 0) {
                            n.a(0);
                        }
                    } else if (ba.a.a.c == 21) {
                        ba.a.a.c = (byte)2;
                    } else if (ba.a.a.c == 3) {
                        ba.a.a.c = 0;
                        if (ba.a.a.g == 0) {
                            n.a(0);
                        }
                    } else if (ba.a.a.c == 31) {
                        ba.a.a.c = (byte)3;
                    }
                }
            } else if (this.b == 7) {
                ax ax2 = new ax(0, s.b - w.a, w.a.stringWidth("\u81ea\u5b9a\u4e49"), w.a);
                ax ax3 = new ax(s.a - w.a.stringWidth("\u9ed8\u8ba4"), s.b - w.a, w.a.stringWidth("\u9ed8\u8ba4"), w.a);
                ax ax4 = new ax(0, s.b - w.a, w.a.stringWidth("\u4fee\u6539"), w.a);
                if (aa.a == 0) {
                    if (aa.a == null) {
                        if (w.a(ax2, new ax(n2, n3, 0, 0))) {
                            this.a.a(42);
                        } else if (w.a(ax3, new ax(n2, n3, 0, 0))) {
                            this.a.a(35);
                            n.a(1);
                        }
                    } else if (w.a(ax4, new ax(n2, n3, 0, 0))) {
                        this.a.a(42);
                    } else if (w.a(ax3, new ax(n2, n3, 0, 0))) {
                        this.a.a(35);
                        n.a(1);
                    }
                }
            } else if (this.b == 5) {
                u.a(n2, n3);
            } else if (this.b == 8) {
                ba.a.a.a(n2, n3);
            } else {
                ab.a(n2, n3);
            }
        }
        if (GameMIDlet.self.debug) {
            this.j = n2 + this.c;
            this.k = n3 + this.d;
            this.l = this.j;
            this.m = this.k;
            System.out.println("(" + this.j + "," + this.k + ")");
        }
    }

    public final void b(int n2, int n3) {
        int n4;
        this.l = n2 + this.c;
        this.m = n3 + this.d;
        n2 = this.j < this.l ? this.j : this.l;
        n3 = this.k < this.m ? this.k : this.m;
        int n5 = this.l > this.j ? this.l : this.j;
        int n6 = n4 = this.m > this.k ? this.m : this.k;
        if (GameMIDlet.self.debug) {
            System.out.println("(" + n2 + "," + n3 + "," + (n5 - n2) + "," + (n4 - n3) + ")");
        }
    }

    public final void a(String string, short s2) {
        this.e = string;
        this.g = s2;
        this.A = true;
    }

    public final void b(String string, short s2) {
        this.g = (short)120;
        B = true;
        s2 = (short)w.a.stringWidth(string);
        byte by = (byte)(s2 / (this.j - 10));
        if (s2 % (this.j - 10) > 0) {
            by = (byte)(s2 / (this.j - 10) + 1);
        }
        this.k = (short)(w.a * by + 6);
        this.i = (short)((s.b - this.k) / 2);
        this.d = w.a(string, this.j - 10);
    }

    public final void c(String string, short s2) {
        this.g = s2;
        C = true;
        s2 = (short)w.a.stringWidth(string);
        byte by = (byte)(s2 / (this.j - 10));
        if (s2 % (this.j - 10) > 0) {
            by = (byte)(s2 / (this.j - 10) + 1);
        }
        this.k = (short)(w.a * by + 6);
        this.i = (short)((s.b - this.k) / 2);
        this.d = w.a(string, this.j - 10);
    }

    private void d(Graphics graphics) {
        graphics.setColor(0xFFFF00);
        graphics.fillRect((int)this.h, (int)this.i, (int)this.j, (int)this.k);
        graphics.setColor(65280);
        graphics.drawRect((int)this.h, (int)this.i, (int)this.j, (int)this.k);
        if (this.d != null) {
            graphics.setColor(0);
            for (int i = 0; i < this.d.length; ++i) {
                graphics.drawString(this.d[i], this.h + 5, this.i + 3 + w.a * i, 20);
            }
        }
    }

    public final void d(int n2) {
        System.out.println("nextScript(" + n2 + "),step=" + this.p);
        if (n2 == 0) {
            this.p = (byte)(this.p + 1);
            if (this.f > 0) {
                this.f = (short)(this.f - 1);
            }
        } else if (n2 == 1) {
            if (this.e > 0) {
                this.p = (byte)(this.p + 1);
                System.out.println("\u811a\u672c\u7ee7\u7eed\u6267\u884c");
            } else {
                System.out.println("\u811a\u672c\u6682\u505c");
            }
        } else if (n2 >= 2) {
            if (this.f > 0) {
                this.f = (short)(this.f - 1);
            }
            if (this.f == 0) {
                this.p = (byte)(this.p + 1);
            }
        }
        if (this.m == 1) {
            this.s = true;
        } else if (this.m == 2) {
            this.s = false;
        }
        this.m = 0;
    }

    private static void a(g g2, int n2, int n3, int n4, int n5, int n6) {
        if (g2 != null) {
            g2.a = true;
            if (n3 > 0) {
                g2.c = (byte)n3;
                System.out.println(g2.t + "\u901f\u5ea6=" + g2.c);
            }
            switch (n2) {
                case 1: {
                    g2.a(g2.s, g2.t - n4, n2);
                    return;
                }
                case 0: {
                    g2.a(g2.s, g2.t + n4, n2);
                    return;
                }
                case 2: {
                    g2.a(g2.s - n4, g2.t, n2);
                    return;
                }
                case 3: {
                    g2.a(g2.s + n4, g2.t, n2);
                    return;
                }
            }
            g2.a(n4, n5, n6);
        }
    }

    private g a(int n2) {
        g g2 = null;
        for (int i = 0; this.b.a != null && i < this.b.a.length; ++i) {
            if (this.b.a[i].s != 1 || ((g)this.b.a[i]).t != n2) continue;
            g2 = (g)this.b.a[i];
            break;
        }
        return g2;
    }

    private void t() {
        this.D = false;
        this.n = 0;
        this.E = false;
        this.o = 0;
        this.s = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void e(Graphics graphics) {
        if (!this.o && this.c != null) {
            for (int i = 0; this.c != null && i < this.c.length; ++i) {
                w.a(graphics, this.c[i], this.g, this.h + w.a * i, 0, 0xFFFFFF, 36);
            }
            if (ba.a.a % 2 != 0) return;
            if (this.h + w.a * this.c.length > -10) {
                this.h -= 3;
                if (!GameMIDlet.self.phonemodel.equals("N73")) return;
                this.h -= 6;
                return;
            }
            this.o = true;
            return;
        }
        graphics.setColor(0);
        graphics.fillRect(0, 0, (int)s.a, (int)s.b);
        t.a(graphics, s.a / 2, this.i);
        if (ba.a.a % 2 != 0) return;
        if (this.i + w.a * 20 > s.b / 2) {
            this.i -= 3;
            if (!GameMIDlet.self.phonemodel.equals("D608")) return;
            this.h -= 5;
            return;
        }
        p = true;
    }

    static Image a(t t2, Image image) {
        t2.b = image;
        return t2.b;
    }

    static Image b(t t2, Image image) {
        t2.c = image;
        return t2.c;
    }

    static Image c(t t2, Image image) {
        t2.d = image;
        return t2.d;
    }

    static {
        m = true;
        B = false;
        C = false;
    }
}
