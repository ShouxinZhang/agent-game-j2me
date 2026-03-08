/*
 * Decompiled with CFR 0.152.
 */
public final class r {
    public static an[] a;

    public static an a(String string, String string2) {
        an an2 = null;
        boolean bl = false;
        for (int i = 0; a != null && i < a.length; ++i) {
            if (!r.a[i].a.equals(string)) continue;
            if (GameMIDlet.self.debug) {
                System.out.println("\u91cd\u7528\u65e7\u7684spLib:" + string);
            }
            an2 = a[i];
            bl = true;
            break;
        }
        if (!bl) {
            if (GameMIDlet.self.debug) {
                System.out.println("\u751f\u6210\u65b0\u7684spLib:" + string);
            }
            an2 = new an();
            an2.a(string);
            an2.b(string2);
            if (GameMIDlet.self.cutSpLibImg) {
                an2.a();
            }
            if (a == null) {
                a = new an[1];
            } else {
                an[] anArray = new an[a.length + 1];
                System.arraycopy(a, 0, anArray, 0, a.length);
                a = anArray;
            }
            r.a[r.a.length - 1] = an2;
        }
        return an2;
    }
}
