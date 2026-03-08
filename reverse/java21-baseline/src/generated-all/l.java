/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class l {
    private static ax[] a;
    private static short a;

    public static void a(ax ax2) {
        if (a == null) {
            a = new ax[10];
        } else if (a > a.length - 1) {
            ax[] axArray = new ax[a.length + 10];
            System.arraycopy(a, 0, axArray, 0, a.length);
            a = null;
            a = axArray;
        }
        l.a[l.a] = ax2;
        a = (short)(a + 1);
    }

    public static void a() {
        a = null;
        a = 0;
    }

    public static boolean a(ax ax2) {
        if (ax2 == null) {
            return false;
        }
        for (int i = 0; a != null && i < a.length && i < a; ++i) {
            if (!w.a(ax2, a[i])) continue;
            return true;
        }
        return false;
    }

    public static void a(Graphics graphics) {
        for (int i = 0; a != null && i < a.length && i < a; ++i) {
            graphics.setColor(0xFF0000);
            graphics.drawRect((int)l.a[i].a, (int)l.a[i].b, (int)l.a[i].c, (int)l.a[i].d);
        }
    }
}
