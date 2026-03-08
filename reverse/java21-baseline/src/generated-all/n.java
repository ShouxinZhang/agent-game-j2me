/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.util.Vector;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class n {
    private static Vector a;
    public static byte a;
    public static Image a;
    public static Image b;
    public static Image c;

    public static void a(int n2) {
        if (!GameMIDlet.self.touchScreen) {
            return;
        }
        if (n2 == 0) {
            n.a();
            a = 0;
            return;
        }
        if (n2 == 1) {
            n.a();
            ad ad2 = new ad();
            new ad().a = 1;
            ad2.a = new ax(s.a - 26, s.b - 26, 26, 26);
            n.a(ad2);
            a = 1;
            return;
        }
        if (n2 == 2) {
            n.a();
            ad ad3 = new ad();
            new ad().a = (byte)3;
            ad3.a = new ax(s.a - 26, s.b - 26, 26, 26);
            n.a(ad3);
            a = (byte)2;
            return;
        }
        if (n2 == 3) {
            n.a();
            ad ad4 = new ad();
            new ad().a = (byte)2;
            ad4.a = new ax(s.a - 26, s.b - 26, 26, 26);
            n.a(ad4);
            a = (byte)3;
        }
    }

    private static void a(ad ad2) {
        if (!GameMIDlet.self.touchScreen) {
            return;
        }
        if (a == null) {
            a = new Vector(1, 1);
        }
        a.addElement(ad2);
    }

    public static ad a(int n2, int n3) {
        if (!GameMIDlet.self.touchScreen) {
            return null;
        }
        ad ad2 = null;
        for (int i = 0; a != null && i < a.size(); ++i) {
            ax ax2 = ((ad)n.a.elementAt((int)i)).a;
            if (!w.a(ax2, new ax(n2, n3, 0, 0))) continue;
            ad2 = (ad)a.elementAt(i);
        }
        return ad2;
    }

    private static void a() {
        if (!GameMIDlet.self.touchScreen) {
            return;
        }
        a = null;
    }
}
