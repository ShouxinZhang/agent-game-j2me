/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class an {
    private x a;
    private short[] c;
    private short[] d;
    private short[] e;
    private short[] f;
    private byte[] a;
    private byte[] b;
    private short[] g;
    private short[] h;
    private byte[] c;
    private byte[] d;
    short[] a;
    short[] b;
    private Image[] a;
    private String[] a;
    private byte a;
    public boolean a;
    public String a;
    private Image[] b;
    private boolean b;

    public an() {
    }

    public an(String string) {
        this.a = new x(string);
        this.b();
        this.a = string;
    }

    public final void a(String string) {
        this.a = new x(string);
        this.b();
        this.a = string;
    }

    private void b() {
        byte by = this.a.a();
        block8: for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
            short s = this.a.a();
            short s2 = this.a.a();
            switch (s) {
                case -96: {
                    s = s2;
                    an an2 = this;
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(an2.a.a, an2.a.a, s);
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        byte by3;
                        an2.a = by3 = dataInputStream.readByte();
                        an2.a = new String[by3];
                        an2.a = new Image[by3];
                        for (byte by4 = 0; by4 < by3; by4 = (byte)(by4 + 1)) {
                            String string;
                            an2.a[by4] = string = dataInputStream.readUTF();
                        }
                        byteArrayInputStream.close();
                        dataInputStream.close();
                    }
                    catch (Exception exception) {
                        Exception exception2 = exception;
                        exception.printStackTrace();
                    }
                    continue block8;
                }
                case -95: {
                    this.c();
                    continue block8;
                }
                case -94: {
                    this.d();
                    continue block8;
                }
                case -93: {
                    this.e();
                    continue block8;
                }
                default: {
                    this.a.a(s2);
                }
            }
        }
        this.a.a();
        this.a = null;
    }

    private void c() {
        int n = this.a.a() * 6;
        byte by = this.a.a();
        this.c = new short[n];
        for (int n2 = 0; n2 < n; n2 = (int)((short)(n2 + 1))) {
            if (n2 % 6 == 1 || n2 % 6 == 2) {
                if (by == 1) {
                    this.c[n2] = this.a.a();
                    continue;
                }
                this.c[n2] = (short)(this.a.a() & 0xFF);
                continue;
            }
            this.c[n2] = (short)(this.a.a() & 0xFF);
        }
    }

    private void d() {
        int n;
        int n2 = this.a.a();
        this.d = new short[n2];
        this.e = new short[n2];
        this.g = new short[n2];
        this.b = new byte[n2];
        for (n = 0; n < n2; ++n) {
            this.d[n] = this.a.a();
            this.e[n] = (short)(this.a.a() & 0xFF);
            this.g[n] = this.a.a();
            this.b[n] = this.a.a();
        }
        n2 = this.a.a();
        this.f = new short[n2 << 1];
        this.a = new byte[n2];
        for (n = 0; n < n2; ++n) {
            this.f[n << 1] = this.a.a();
            this.f[(n << 1) + 1] = this.a.a();
            this.a[n] = this.a.a();
        }
        n2 = this.a.a();
        this.h = new short[n2 << 2];
        this.c = new byte[n2];
        for (n = 0; n < n2; ++n) {
            this.h[n << 2] = this.a.a();
            this.h[(n << 2) + 1] = this.a.a();
            this.h[(n << 2) + 2] = (short)(this.a.a() & 0xFF);
            this.h[(n << 2) + 3] = (short)(this.a.a() & 0xFF);
            this.c[n] = this.a.a();
        }
    }

    private void e() {
        int n;
        int n2 = this.a.a();
        this.b = new short[n2];
        this.a = new short[n2];
        for (n = 0; n < n2; ++n) {
            this.b[n] = this.a.a();
            this.a[n] = this.a.a();
        }
        n2 = this.a.a();
        this.d = new byte[n2];
        for (n = 0; n < n2; ++n) {
            this.d[n] = this.a.a();
        }
    }

    public final void b(String string) {
        for (byte by = 0; by < this.a; by = (byte)(by + 1)) {
            this.a[by] = w.a(string + this.a[by]);
            this.a[by] = null;
        }
    }

    public final void a() {
        if (GameMIDlet.self.debug) {
            System.out.println("\u5207\u5272\u7cbe\u7075\u56fe\u7247:" + this.a);
        }
        int n = this.c.length / 6;
        this.b = new Image[n];
        for (int n2 = 1; n2 < n; n2 = (int)((short)(n2 + 1))) {
            int n3 = n2 * 6;
            System.out.println("Clip:" + this.c[n3] + "#" + this.c[n3 + 1] + "#" + this.c[n3 + 2] + "#" + this.c[n3 + 3] + "#" + this.c[n3 + 4] + "#" + this.c[n3 + 5]);
            this.b[n2] = this.a ? Image.createImage((Image)this.a[this.c[n3]], (int)this.c[n3 + 1], (int)this.c[n3 + 2], (int)this.c[n3 + 3], (int)this.c[n3 + 4], (int)(this.c[n3 + 5] ^ 2)) : Image.createImage((Image)this.a[this.c[n3]], (int)this.c[n3 + 1], (int)this.c[n3 + 2], (int)this.c[n3 + 3], (int)this.c[n3 + 4], (int)this.c[n3 + 5]);
        }
        this.a = null;
        this.b = true;
        System.gc();
    }

    public final int a(Graphics graphics, int n, int n2, int n3, int n4) {
        try {
            if (n < this.b.length) {
                if (this.b[n] + n2 >= this.d.length) {
                    return 0;
                }
                int n5 = this.d[this.b[n] + n2] & 0xFF;
                for (int i = 0; i < this.e[n5]; ++i) {
                    int n6;
                    int n7;
                    int n8 = this.d[n5] + i;
                    if (this.a) {
                        n7 = -this.f[n8 << 1] + n3;
                        n6 = this.f[(n8 << 1) + 1] + n4;
                    } else {
                        n7 = this.f[n8 << 1] + n3;
                        n6 = this.f[(n8 << 1) + 1] + n4;
                    }
                    if (this.b) {
                        n8 = this.a[n8] & 0xFF;
                        if (this.a) {
                            graphics.drawImage(this.b[n8], n7, n6, 24);
                            continue;
                        }
                        graphics.drawImage(this.b[n8], n7, n6, 20);
                        continue;
                    }
                    n8 = (this.a[n8] & 0xFF) * 6;
                    if (this.a) {
                        graphics.drawRegion(this.a[this.c[n8]], (int)this.c[n8 + 1], (int)this.c[n8 + 2], (int)this.c[n8 + 3], (int)this.c[n8 + 4], this.c[n8 + 5] ^ 2, n7, n6, 24);
                        continue;
                    }
                    graphics.drawRegion(this.a[this.c[n8]], (int)this.c[n8 + 1], (int)this.c[n8 + 2], (int)this.c[n8 + 3], (int)this.c[n8 + 4], (int)this.c[n8 + 5], n7, n6, 20);
                }
                if (++n2 >= this.a[n]) {
                    return -1;
                }
                return n2;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        return -1;
    }

    public final short[] a(int n, int n2, int n3, int n4, int n5) {
        if (n < this.b.length) {
            short[] sArray = new short[5];
            if (this.b[n] + n2 > this.d.length - 1) {
                return null;
            }
            if (0 < this.b[n = this.d[this.b[n] + n2] & 0xFF]) {
                n = this.g[n];
                sArray[4] = this.c[n];
                sArray[0] = this.h[n << 2];
                sArray[1] = this.h[(n << 2) + 1];
                sArray[2] = this.h[(n << 2) + 2];
                sArray[3] = this.h[(n << 2) + 3];
                return sArray;
            }
        }
        return null;
    }
}
