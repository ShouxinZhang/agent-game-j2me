/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class g
extends az {
    public byte a;
    public byte b;
    public byte c;
    private short w;
    private short x;
    protected short a;
    protected short b;
    protected boolean a;
    protected boolean b;
    protected long a;
    protected long b;
    public boolean c;
    public boolean d;
    public String a;
    public ax a;
    private boolean o;
    public ax b;
    public boolean e;
    public byte d;
    public int a;
    public int b;
    private int f;
    private int g;
    short c;
    short d;
    short e;
    short f;
    short g;
    short h;
    short i;
    short j;
    public int c;
    public int d;
    public byte e;
    public byte f;
    public byte g;
    public short k;
    public short l;
    public boolean f = 0;
    public byte h;
    public byte i;
    public byte j;
    public byte k;
    public boolean g = 0;
    public int[] a;
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public c[] a;
    public byte[] d = 0;
    public f a;
    public c[] b;
    public z[] a;
    public short m;
    public byte l;
    public String b;
    public Image a;
    private as a;
    public Image b = 0;
    private byte r;
    private short y;
    private short z;
    private byte u;
    private byte v;
    private byte w;
    private byte x;
    private byte[][] a;
    public short[][] a;
    public String c = 0;
    public short n;
    public byte[] e;
    public byte m;
    public byte n;
    public byte o;
    public bd a = 0;
    public boolean h = 0;
    public boolean i = 0;
    public boolean j = 0;
    public boolean k = 0;
    public boolean l = 0;
    public boolean m = 0;
    public byte p;
    int e = -1;
    short o;
    short p;
    byte q;
    short q;
    short r;

    public g() {
    }

    public g(Image object, int n, int n2) {
        int n3 = n2;
        n2 = n;
        Image image = object;
        object = this;
        this.b = image;
        object.z = (short)n2;
        object.y = (short)n3;
        object.u = (byte)(image.getWidth() / n2);
        object.v = (byte)(image.getHeight() / n3);
        object.w = (byte)(0 % object.u);
        object.x = (byte)(0 / object.u);
        object.r = 0;
        object.u = object.z;
        object.v = object.y;
        this.a();
    }

    public g(int n, int n2) {
        this.z = 0;
        this.y = 0;
    }

    protected final void a() {
        this.c = (byte)3;
        this.a = 0;
        this.w = 0;
        this.x = 0;
        this.b = -1L;
        this.a = -1L;
        this.p = (byte)3;
        this.b = false;
    }

    public final void a(int n, int n2, int n3, int n4) {
        this.a = new ax();
        this.a.a = (short)n;
        this.a.b = (short)n2;
        this.a.c = (short)n3;
        this.a.d = (short)n4;
    }

    public void a(int n) {
        this.r = (byte)n;
        this.n();
    }

    private int g() {
        if (this.a <= this.v - 1) {
            return this.a[this.a].length;
        }
        return this.a[0].length;
    }

    public void b() {
        byte by = this.r;
        this.r = (byte)(this.r + 1);
        if (this.r >= this.g()) {
            this.r = this.r >= 2 ? (byte)1 : 0;
        }
        if (by != this.r) {
            this.n();
        }
    }

    public void c() {
        byte by = this.r;
        if (this.r < this.g() - 1) {
            this.r = (byte)(this.r + 1);
        }
        if (by != this.r) {
            this.n();
        }
    }

    private void n() {
        if (this.a <= this.v - 1) {
            byte by = this.a == null || this.a[this.a] == null ? this.r : this.a[this.a][this.r];
            byte by2 = (byte)(by % this.u);
            by = (byte)(by / this.u);
            this.w = by2;
            this.x = by;
        }
    }

    public void a(Graphics graphics) {
        if (((az)this).n) {
            short s = this.s;
            short s2 = this.t;
            graphics.drawRegion(this.b, this.w * ((az)this).u, this.x * ((az)this).v, (int)((az)this).u, (int)((az)this).v, 0, (int)s, (int)s2, 33);
        }
    }

    public final ax a() {
        ax ax2 = null;
        ax2 = this.a != null ? new ax(this.s + this.a.a, this.t + this.a.b, this.a.c, this.a.d) : new ax(this.s - 7, this.t - 14, 14, 14);
        return ax2;
    }

    public final ax b() {
        ax ax2 = null;
        switch (this.a) {
            case 1: {
                ax2 = new ax(this.s, this.t + this.a.b, 0, 0);
                return ax2;
            }
            case 0: {
                ax2 = new ax(this.s, this.t, 0, 0);
                return ax2;
            }
            case 2: {
                ax2 = new ax(this.s + this.a.a, this.t + this.a.b + this.a.d / 2, 0, 0);
                return ax2;
            }
            case 3: {
                ax2 = new ax(this.s + this.a.a + this.a.c, this.t + this.a.b + this.a.d / 2, 0, 0);
                return ax2;
            }
        }
        return null;
    }

    public void a(boolean bl) {
        int n = -this.b.getWidth() / 2;
        int n2 = -this.b.getHeight() / 2;
        int n3 = this.b.getWidth();
        int n4 = this.b.getHeight() / 2;
        this.a(n, n2, n3, n4);
    }

    public final ax c() {
        ax ax2 = null;
        ax ax3 = this.a();
        switch (this.a) {
            case 1: {
                ax2 = new ax(ax3.a, ax3.b - ax3.d, ax3.c, ax3.d);
                break;
            }
            case 0: {
                ax2 = new ax(ax3.a, ax3.b + ax3.d, ax3.c, ax3.d);
                break;
            }
            case 2: {
                ax2 = new ax(ax3.a - ax3.c, ax3.b, ax3.c, ax3.d);
                break;
            }
            case 3: {
                ax2 = new ax(ax3.a + ax3.c, ax3.b, ax3.c, ax3.d);
            }
        }
        return ax2;
    }

    /*
     * Unable to fully structure code
     */
    public final void d() {
        block41: {
            block47: {
                block42: {
                    block43: {
                        block46: {
                            block44: {
                                block45: {
                                    if (!this.d) break block41;
                                    var1_1 = this.a();
                                    this.b = null;
                                    switch (this.a) {
                                        case 1: {
                                            if (this.t <= 0 + var1_1.d && !ba.a.b) break;
                                            this.b = new ax(var1_1.a, var1_1.b - this.c, var1_1.c, this.c);
                                            break;
                                        }
                                        case 0: {
                                            if (this.t >= this.b - this.c && !ba.a.b) break;
                                            this.b = new ax(var1_1.a, var1_1.b + var1_1.d, var1_1.c, this.c);
                                            break;
                                        }
                                        case 2: {
                                            if (this.s - this.u / 2 <= 0 && !ba.a.b) break;
                                            this.b = new ax(var1_1.a - this.c, var1_1.b, this.c, var1_1.d);
                                            break;
                                        }
                                        case 3: {
                                            if (this.s >= this.a - this.u / 2 && !ba.a.b) break;
                                            this.b = new ax(var1_1.a + var1_1.c, var1_1.b, this.c, var1_1.d);
                                        }
                                    }
                                    if (this.b == null) {
                                        if (this.c) {
                                            if (ba.a.a % this.p == 0) {
                                                this.b();
                                                return;
                                            }
                                        } else {
                                            this.a(0);
                                        }
                                        return;
                                    }
                                    var2_3 = false;
                                    if (this.e) break block42;
                                    if (!this.l) {
                                        var3_4 = this;
                                        if (!var3_4.d) {
                                            v0 = false;
                                        } else {
                                            var4_5 = null;
                                            if (var3_4.a != null) {
                                                var4_5 = var3_4.b;
                                            }
                                            v0 = var3_4.a(var4_5);
                                        }
                                        this.o = v0;
                                    } else {
                                        this.o = false;
                                    }
                                    if (!this.o) break block43;
                                    var3_4 = this;
                                    if (var3_4.a != 2 && var3_4.a != 3) break block44;
                                    var4_5 = var3_4.b;
                                    var5_6 = new ax(var4_5.a, var4_5.b + 3, var4_5.c, var4_5.d);
                                    var4_5 = new ax(var4_5.a, var4_5.b - 3, var4_5.c, var4_5.d);
                                    if (super.a(var5_6)) break block45;
                                    v1 = new q(0, 1);
                                    break block46;
                                }
                                if (super.a(var4_5)) ** GOTO lbl-1000
                                v1 = new q(0, -1);
                                break block46;
                            }
                            if (var3_4.a != 1 && var3_4.a != 0) ** GOTO lbl-1000
                            var4_5 = var3_4.b;
                            var5_7 = new ax(var4_5.a + 3, var4_5.b, var4_5.c, var4_5.d);
                            var4_5 = new ax(var4_5.a - 3, var4_5.b, var4_5.c, var4_5.d);
                            if (!super.a(var5_7)) {
                                v1 = new q(1, 0);
                            } else if (!super.a(var4_5)) {
                                v1 = new q(-1, 0);
                            } else lbl-1000:
                            // 3 sources

                            {
                                v1 = var3_4 = null;
                            }
                        }
                        if (v1 != null) {
                            if (this.t + this.c * var3_4.b > 0 + var1_1.d && this.t + this.c * var3_4.b < this.b && this.s + this.c * var3_4.a > 0 + this.u / 2 && this.s + this.c * var3_4.a < this.a - this.u / 2 || ba.a.b) {
                                if ((this.c * var3_4.a != 0 || this.c * var3_4.b != 0) && this == s.a[0]) {
                                    this.o();
                                }
                                super.b(this.c * var3_4.a, this.c * var3_4.b);
                                if (ba.a.a % this.p == 0) {
                                    this.b();
                                }
                                return;
                            }
                        } else if (this.l) {
                            this.l = false;
                            this.h = false;
                            ba.a.d(6);
                            this.a(0);
                            return;
                        }
                        if (this.c) {
                            if (ba.a.a % this.p == 0) {
                                this.b();
                            }
                        } else {
                            this.a(0);
                        }
                        break block47;
                    }
                    var2_3 = true;
                    break block47;
                }
                var2_3 = true;
            }
            if (var2_3) {
                if (this == s.a[0]) {
                    this.o();
                }
                switch (this.a) {
                    case 1: {
                        super.b(0, -this.c);
                        break;
                    }
                    case 0: {
                        super.b(0, this.c);
                        break;
                    }
                    case 2: {
                        super.b(-this.c, 0);
                        break;
                    }
                    case 3: {
                        super.b(this.c, 0);
                    }
                }
                if (ba.a.a % this.p == 0) {
                    this.b();
                }
                if (this == s.a[0] && s.d > 0 && !ba.a.b && !this.j) {
                    if (this.e == -1) {
                        var3_4 = new Random();
                        var3_4.setSeed(System.currentTimeMillis());
                        var1_2 = 42949672;
                        var1_2 = Math.abs(var3_4.nextInt()) / var1_2;
                        this.e = var1_2 + 100;
                        return;
                    }
                    if (this.e > 0) {
                        --this.e;
                        return;
                    }
                    this.e = -1;
                    if (!(ba.a.a != 2 || ba.a.b || this.h || this.l)) {
                        ba.a.d();
                    }
                }
            }
        }
    }

    private boolean a(ax ax2) {
        ax ax3;
        int n;
        if (l.a(ax2)) {
            return true;
        }
        for (n = 0; ba.a.b != null && ba.a.b.a != null && n < ba.a.b.a.length; ++n) {
            if (ba.a.b.a[n].s != 2 || !w.a(ax3 = ba.a.b.a[n].a(), ax2)) continue;
            return true;
        }
        for (n = 0; ba.a.b != null && ba.a.b.a != null && n < ba.a.b.a.length; ++n) {
            if (ba.a.b.a[n].s != 3 || !w.a(ax3 = ba.a.b.a[n].a(), ax2)) continue;
            return true;
        }
        for (n = 0; ba.a.b != null && ba.a.b.a != null && n < ba.a.b.a.length; ++n) {
            if (ba.a.b.a[n].s != 5 || ((y)ba.a.b.a[n]).a != 0 || !w.a(ax3 = ba.a.b.a[n].a(), ax2)) continue;
            return true;
        }
        if (GameMIDlet.self.collisionBetweenRoles) {
            for (n = 0; ba.a.b != null && ba.a.b.a != null && n < ba.a.b.a.length; ++n) {
                if (ba.a.b.a[n] == this || ba.a.b.a[n].s != 1 || s.a((az)this) && s.a(ba.a.b.a[n]) || !w.a(ax3 = ba.a.b.a[n].a(), ax2)) continue;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.a && !this.b) {
            ax ax2 = new ax(0, 0, this.a, this.b);
            q q2 = new q(this.s, this.t);
            if (this.a != null) {
                this.a.b();
                this.a = null;
            }
            this.a = new as(ax2, q2);
            this.a.a = this;
            if (this.a != -1L) {
                this.a.a = this.a;
            }
            if (this.b != -1L) {
                this.a.b = this.b;
            }
            this.a.a();
        }
    }

    public final void f() {
        this.b = false;
        if (this.a != null) {
            this.a.b();
        }
        this.a = null;
    }

    public final void g() {
        if (this.a != null && this.s + ((az)this).u / 2 > ba.a.c && this.t - ((az)this).v > ba.a.d && this.s - ((az)this).u / 2 < ba.a.c + ba.a.getWidth() && this.t < ba.a.d + ba.a.getHeight()) {
            q q2 = this.a.a;
            if (q2.a - this.s < -this.c) {
                this.b(2);
                this.d = true;
            } else if (q2.a - this.s > this.c) {
                this.b(3);
                this.d = true;
            } else if (q2.b - this.t < -this.c) {
                this.b(1);
                this.d = true;
            } else if (q2.b - this.t > this.c) {
                this.b(0);
                this.d = true;
            } else {
                this.d = false;
            }
            this.d();
        }
    }

    public void b(int n) {
        if (this.a != n) {
            this.a = (byte)n;
            this.n();
        }
        this.a = (byte)n;
    }

    public void c(int n) {
        if (n > this.v - 1) {
            n = this.v - 1;
        }
        this.a = (byte)n;
        this.a = new byte[this.v][];
        for (n = 0; n < this.v; ++n) {
            this.a[n] = new byte[this.u];
            for (int i = 0; i < this.u; ++i) {
                this.a[n][i] = (byte)(n * this.u + i);
            }
        }
        this.n();
    }

    public final void h() {
        this.a = null;
        s.a(this.c);
        this.a = new short[(s.a.length - 1) * s.f + 1][3];
        this.a[0][0] = this.s;
        this.a[0][1] = this.t;
        this.a[0][2] = this.a;
        block6: for (int i = 1; i < this.a.length; ++i) {
            this.a[i][0] = this.a[i - 1][0];
            this.a[i][1] = this.a[i - 1][1];
            this.a[i][2] = this.a[i - 1][2];
            switch (this.a) {
                case 1: {
                    this.a[i][1] = (short)(this.a[i - 1][1] + this.c);
                    continue block6;
                }
                case 0: {
                    this.a[i][1] = (short)(this.a[i - 1][1] - this.c);
                    continue block6;
                }
                case 2: {
                    this.a[i][0] = (short)(this.a[i - 1][0] + this.c);
                    continue block6;
                }
                case 3: {
                    this.a[i][0] = (short)(this.a[i - 1][0] - this.c);
                }
            }
        }
    }

    public final void i() {
        s.a(this.c);
        short[][] sArray = new short[(s.a.length - 1) * s.f + 1][3];
        sArray[0][0] = this.a[0][0];
        sArray[0][1] = this.a[0][1];
        sArray[0][2] = this.a[0][2];
        block6: for (int i = 1; i < sArray.length; ++i) {
            sArray[i][0] = this.s;
            sArray[i][1] = this.t;
            sArray[i][2] = this.a;
            switch (this.a) {
                case 1: {
                    sArray[i][1] = (short)(sArray[i - 1][1] + this.c);
                    continue block6;
                }
                case 0: {
                    sArray[i][1] = (short)(sArray[i - 1][1] - this.c);
                    continue block6;
                }
                case 2: {
                    sArray[i][0] = (short)(sArray[i - 1][0] + this.c);
                    continue block6;
                }
                case 3: {
                    sArray[i][0] = (short)(sArray[i - 1][0] - this.c);
                }
            }
        }
        this.a = null;
        this.a = sArray;
    }

    private void o() {
        if (this.a != null) {
            for (int i = this.a.length - 1; i > 0; --i) {
                this.a[i][0] = this.a[i - 1][0];
                this.a[i][1] = this.a[i - 1][1];
                this.a[i][2] = this.a[i - 1][2];
            }
            this.a[0][0] = this.s;
            this.a[0][1] = this.t;
            this.a[0][2] = this.a;
            s.i();
        }
    }

    public final int a() {
        int n = 0;
        n = 0 + this.a[7];
        n += this.a[27];
        int n2 = 0;
        for (int i = 0; i < 8; ++i) {
            if (this.a[i] == null) continue;
            n2 += this.a[i].e();
        }
        return n += n2;
    }

    public final int b() {
        int n = 0;
        n = 0 + this.a[8];
        n += this.a[28] << 1;
        int n2 = 0;
        for (int i = 0; i < 8; ++i) {
            if (this.a[i] == null) continue;
            n2 += this.a[i].f();
        }
        return n += n2;
    }

    public final int c() {
        int n = 0;
        n = 0 + this.a[9];
        n += this.a[15];
        int n2 = 0;
        for (int i = 0; i < 8; ++i) {
            if (this.a[i] == null) continue;
            n2 += this.a[i].m;
        }
        return n += n2;
    }

    public final int d() {
        int n = 0;
        n = 0 + this.a[10];
        n += this.a[16];
        int n2 = 0;
        for (int i = 0; i < 8; ++i) {
            if (this.a[i] == null) continue;
            n2 += this.a[i].n;
        }
        return n += n2;
    }

    public final int e() {
        int n;
        int n2 = 0;
        n2 = 0 + this.a[4];
        n2 += this.a[29] * 5;
        int n3 = 0;
        for (n = 0; n < 8; ++n) {
            if (this.a[n] == null) continue;
            n3 += this.a[n].k;
        }
        n2 += n3;
        this.f = 0;
        if (this.b != null) {
            for (n = 0; n < this.b.length; ++n) {
                this.f += this.b[n].d;
                this.f += this.b[n].k;
            }
        }
        return n2 += this.f;
    }

    public final int f() {
        int n;
        int n2 = 0;
        n2 = 0 + this.a[6];
        n2 += this.a[30] * 5;
        int n3 = 0;
        for (n = 0; n < 8; ++n) {
            if (this.a[n] == null) continue;
            n3 += this.a[n].l;
        }
        n2 += n3;
        this.g = 0;
        if (this.b != null) {
            for (n = 0; n < this.b.length; ++n) {
                this.g += this.b[n].c;
                this.g += this.b[n].j;
            }
        }
        return n2 += this.g;
    }

    public final void a(int n, int n2, int n3) {
        this.o = (short)n;
        this.p = (short)n2;
        this.q = (byte)n3;
        this.h = true;
        this.l = true;
    }

    public final void j() {
        switch (this.a) {
            case 1: {
                this.c(this.s, this.y);
                return;
            }
            case 0: {
                this.c(this.s, ba.a.b);
                return;
            }
            case 2: {
                this.c(this.z / 2, this.t);
                return;
            }
            case 3: {
                this.c(ba.a.a - this.z / 2, this.t);
            }
        }
    }

    private void c(int n, int n2) {
        this.q = (short)n;
        this.r = (short)n2;
        this.j = true;
    }

    public final void k() {
        if (!s.a || ba.a.d || !ba.a.a) {
            return;
        }
        if (!GameMIDlet.self.debug) {
            System.out.println("GameData.bBuyFly=" + s.b);
            if (s.c != 1 || !s.b) {
                return;
            }
        }
        ((g)object).e = GameMIDlet.self.debug;
        ((g)object).i = true;
        ((ar)s.a[0]).r = 1;
        s.a(s.a);
        Object object = null;
        if (s.c == 1) {
            object = r.a(s.f[0], s.f[1]);
            s.a[0].c = (byte)2;
        } else {
            object = r.a(s.e[0], s.e[1]);
            s.a[0].c = (byte)5;
        }
        ((ar)s.a[0]).a(0);
        ((ar)s.a[0]).a((an)object);
        ((ar)s.a[0]).a(true);
        for (int i = 0; i < s.a.length; ++i) {
            if (i == 0) continue;
            ((az)s.a[i]).n = false;
        }
        if (ba.a.b != null) {
            ba.a.b.b(s.a[0]);
        }
        if (ba.a.b != null) {
            ba.a.a.a(s.a[0]);
        }
        n.a(0);
        System.gc();
        try {
            Thread.sleep(300L);
            return;
        }
        catch (InterruptedException interruptedException) {
            InterruptedException interruptedException2 = interruptedException;
            interruptedException.printStackTrace();
            return;
        }
    }

    public final void l() {
        if (ba.a.d || !ba.a.a) {
            return;
        }
        if (((g)((Object)interruptedException2)).a(((g)((Object)interruptedException2)).a())) {
            return;
        }
        ((g)((Object)interruptedException2)).e = false;
        ((g)((Object)interruptedException2)).i = false;
        ((g)((Object)interruptedException2)).j = false;
        an an2 = null;
        if (s.c == 1) {
            an2 = r.a(s.d[0], s.d[1]);
            s.a[0].c = 1;
        } else {
            an2 = r.a(s.a[((az)((Object)interruptedException2)).t - 1][0], s.a[((az)((Object)interruptedException2)).t - 1][1]);
            s.a[0].c = (byte)3;
            for (int i = 0; i < s.a.length; ++i) {
                if (i == 0) continue;
                s.a[i].a(s.a[0].s, s.a[0].t);
                ((az)s.a[i]).n = true;
            }
        }
        ((ar)s.a[0]).a(0);
        ((ar)s.a[0]).a(an2);
        ((ar)s.a[0]).a(true);
        if (ba.a.a != null) {
            ba.a.a.b(s.a[0]);
        }
        if (ba.a.b != null) {
            ba.a.b.a(s.a[0]);
        }
        n.a(1);
        System.gc();
        try {
            Thread.sleep(300L);
            return;
        }
        catch (InterruptedException interruptedException) {
            InterruptedException interruptedException2 = interruptedException;
            interruptedException.printStackTrace();
            return;
        }
    }

    public void m() {
        if (this.r < this.g() - 1) {
            this.c();
            return;
        }
        ba.a.d(2);
    }
}
