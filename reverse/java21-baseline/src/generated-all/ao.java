/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ao {
    public short a;
    public short b;
    private byte a;
    private byte b;
    public au[] a;
    private av[] a;
    private am[][] a;
    public b[][] a;
    public byte[] a;
    public be[] a;

    public final void a(String object) {
        k k2 = new k();
        k2.a((String)object);
        object = k2;
        ((k)object).a();
        ((k)object).b();
        ((k)object).c();
        ((k)object).d();
        ((k)object).e();
        this.a = k2.a;
        this.b = k2.b;
        this.a = k2.a;
        this.b = k2.b;
        this.a = k2.a;
        this.a = k2.a;
        this.a = k2.a;
        this.a = k2.a;
        this.a = k2.a;
    }

    public final void a() {
        if (this.a != null && this.a.length > 0) {
            Image[] imageArray = null;
            short[] sArray = null;
            this.a = new be[this.a.length];
            for (int i = 0; this.a != null && i < this.a.length; ++i) {
                int n = 0;
                n = this.a % this.a;
                n = n > 0 ? this.a / this.a + 1 : this.a / this.a;
                int n2 = 0;
                n2 = this.b % this.b;
                n2 = n2 > 0 ? this.b / this.b + 1 : this.b / this.b;
                this.a[i] = new be(this.a, this.a, n, n2, this.a, this.b, this.a[i].length);
                for (n = 0; this.a[i] != null && n < this.a[i].length; ++n) {
                    this.a[i].a(this.a[i][n].a, this.a[i][n].b, this.a[i][n].c);
                }
                if (!GameMIDlet.self.cutMapImg) continue;
                if (imageArray == null) {
                    this.a[i].a();
                    imageArray = this.a[i].a;
                    sArray = this.a[i].a;
                    System.out.println("\u7b2c\u4e00\u6b21\u5207\u5272,\u53d6\u5f97\u5207\u5272\u56fe" + imageArray);
                    continue;
                }
                this.a[i].a = imageArray;
                this.a[i].a = sArray;
                this.a[i].a();
                System.out.println("\u6cbf\u7528\u7b2c\u4e00\u6b21\u5207\u5272\u7684\u56fe" + imageArray);
            }
        }
    }

    public final void b() {
        for (int i = 0; this.a != null && i < this.a.length; ++i) {
            this.a[i].a = w.a("/map/" + this.a[i].a);
        }
    }
}
