/*
 * Decompiled with CFR 0.152.
 */
public final class o {
    public static String a(String string, String string2, String string3) {
        int n;
        Object var3_3 = null;
        int n2 = 0;
        while ((n = string.indexOf(string2, n2)) != -1) {
            String string4;
            int n3 = string2.length();
            string = string4 = string.substring(n2, n) + string3 + string.substring(n + n3, string.length());
            n2 = n + n3 + 1;
        }
        return string;
    }

    public static short a(g g2, short[][] sArray, int n) {
        short s = 0;
        s = (short)(0 + (sArray[n - 1][0] + sArray[n - 1][1] * g2.b[g2.n].b) * g2.e() / 100);
        s = (short)(s + sArray[n - 1][2]);
        s = (short)(s + sArray[n - 1][3] * g2.b[g2.n].b);
        return s;
    }

    public static short b(g g2, short[][] sArray, int n) {
        short s = 0;
        s = (short)(0 + (sArray[n - 1][0] + sArray[n - 1][1] * g2.b[g2.n].b) * g2.a[34] / 100);
        s = (short)(s + sArray[n - 1][2]);
        s = (short)(s + sArray[n - 1][3] * g2.b[g2.n].b);
        return s;
    }

    public static short c(g g2, short[][] sArray, int n) {
        short s = 0;
        s = (short)(0 + (sArray[n - 1][0] + sArray[n - 1][1] * g2.b[g2.n].b) * g2.a[31] / 100);
        s = (short)(s + sArray[n - 1][2]);
        s = (short)(s + sArray[n - 1][3] * g2.b[g2.n].b);
        for (int i = 0; i < g2.b.length; ++i) {
            if (g2.b[i].a != n) continue;
            s = (short)(s + g2.b[i].g);
            s = (short)(s + g2.b[i].n);
            s = (short)(s + g2.b[i].f);
            s = (short)(s + g2.b[i].m);
        }
        return s;
    }

    public static short d(g g2, short[][] sArray, int n) {
        short s = 0;
        s = (short)(0 + (sArray[n - 1][0] + sArray[n - 1][1] * g2.b[g2.n].b) * g2.e() / 100);
        s = (short)(s + sArray[n - 1][2]);
        s = (short)(s + sArray[n - 1][3] * g2.b[g2.n].b);
        return s;
    }

    public static short e(g g2, short[][] sArray, int n) {
        short s = 0;
        s = (short)(0 + (sArray[n - 1][0] + sArray[n - 1][1] * g2.b[g2.n].b) * g2.a() / 100);
        s = (short)(s + sArray[n - 1][2]);
        s = (short)(s + sArray[n - 1][3] * g2.b[g2.n].b);
        return s;
    }

    public static short f(g g2, short[][] sArray, int n) {
        short s = 0;
        s = (short)(0 + (sArray[n - 1][0] + sArray[n - 1][1] * g2.b[g2.n].b) * g2.b() / 100);
        s = (short)(s + sArray[n - 1][2]);
        s = (short)(s + sArray[n - 1][3] * g2.b[g2.n].b);
        return s;
    }

    public static c[][] a(c[] cArray) {
        if (cArray != null) {
            c[][] cArray2 = new c[2][];
            for (int i = 0; i < cArray.length; ++i) {
                if (cArray[i].e == 0) {
                    cArray2[0] = w.a(cArray2[0], cArray[i]);
                    continue;
                }
                if (cArray[i].e == 1) {
                    cArray2[1] = w.a(cArray2[1], cArray[i]);
                    continue;
                }
                System.out.println("gradeSkill err");
            }
            return cArray2;
        }
        return null;
    }

    public static byte[] a(byte[] byArray) {
        if (byArray == null) {
            return null;
        }
        for (int i = 0; i < byArray.length; ++i) {
            for (int j = 0; j < byArray.length - 1 - i; ++j) {
                if (byArray[j] <= byArray[j + 1]) continue;
                byte by = byArray[j];
                byArray[j] = byArray[j + 1];
                byArray[j + 1] = by;
            }
        }
        return byArray;
    }

    public static String[] a(String[] stringArray, String string) {
        if (stringArray == null) {
            String[] stringArray2 = new String[1];
            stringArray = stringArray2;
            stringArray2[0] = string;
            return stringArray;
        }
        String[] stringArray3 = new String[stringArray.length + 1];
        System.arraycopy(stringArray, 0, stringArray3, 0, stringArray.length);
        stringArray3[stringArray3.length - 1] = string;
        return stringArray3;
    }
}
