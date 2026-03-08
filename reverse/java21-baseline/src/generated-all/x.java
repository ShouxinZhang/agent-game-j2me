/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class x {
    byte[] a;
    private int b;
    int a;
    private static final byte[] b = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82};

    public x() {
        this.a = 0;
        this.b = 0;
    }

    public x(String object) {
        Object object2 = null;
        try {
            object2 = !((String)object).startsWith("/") ? "/" + (String)object : object;
            object = this.getClass().getResourceAsStream((String)object2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
            byte[] byArray = new byte[256];
            while ((this.b = ((InputStream)object).read(byArray)) != -1) {
                byteArrayOutputStream.write(byArray, 0, this.b);
            }
            this.a = byteArrayOutputStream.toByteArray();
            ((InputStream)object).close();
            byteArrayOutputStream.close();
            this.b = this.a.length;
            this.a = 0;
            return;
        }
        catch (Exception exception) {
            System.out.println("\u8bfb\u53d6\u6587\u4ef6\uff1a" + (String)object2 + "\u51fa\u9519");
            return;
        }
    }

    public final void a() {
        this.a = null;
        this.b = 0;
        this.a = 0;
    }

    public final byte a() {
        return this.a[this.a++];
    }

    public final short a() {
        return (short)(((this.a[this.a++] & 0xFF) << 8) + (this.a[this.a++] & 0xFF));
    }

    public final void a(int n) {
        this.a += n;
        if (this.a >= this.b) {
            this.a = 0;
        }
    }

    public final Image a() {
        int n;
        x x2 = x3;
        x3.b = x2.a.length;
        x2.a = 0;
        for (int i = 7; i < x2.b; i += 8) {
            int n2 = i;
            x2.a[n2] = (byte)(x2.a[n2] + 5);
        }
        x2.b = 16 + x2.a.length;
        byte[] byArray = new byte[x2.b];
        for (n = 16; n < x2.b; ++n) {
            byArray[n] = x2.a();
        }
        for (n = 0; n < 16; ++n) {
            byArray[n] = b[n];
        }
        x2.a = null;
        x2.a = byArray;
        byte[] cfr_ignored_0 = x2.a;
        x x3 = Image.createImage((byte[])x3.a, (int)0, (int)x3.b);
        return x3;
    }
}
