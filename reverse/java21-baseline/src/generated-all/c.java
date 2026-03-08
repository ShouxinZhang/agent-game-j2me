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
public final class c {
    public byte a;
    public byte b;
    public byte c;
    public byte d;
    public byte e;
    public String a;
    public Image a;
    public short a;
    public short b;
    public short c;
    public short d;
    public short e;
    public short f;
    public short g;
    public short h;
    public short i;
    public short j;
    public short k;
    public short l;
    public short m;
    public short n;
    public static String[] a;
    public static String[] b;
    public static Image[] a;
    private static byte[] a;
    private static byte[] b;
    private static byte[] c;

    public c() {
        this.b = 0;
        this.c = (byte)3;
    }

    public c(int n) {
        this.a = (byte)n;
        this.b = 0;
        c.a();
        this.c = c[this.a - 1];
        this.d = a[this.a - 1];
        this.e = b[this.a - 1];
        this.a = b[this.a - 1];
    }

    public c(int n, g g2) {
        this.a = (byte)n;
        this.b = 0;
        c.a();
        this.c = c[this.a - 1];
        this.d = a[this.a - 1];
        this.e = b[this.a - 1];
        this.a = b[this.a - 1];
        this.a(g2);
    }

    public final void a(g g2) {
        if (a == null) {
            c.a();
        }
        String string = a[this.a - 1];
        this.a = b[this.a - 1];
        if (string.equals("\u901a\u81c2\u62f3")) {
            this.b = (short)15;
            return;
        }
        if (string.equals("\u9759\u5fc3\u8bc0")) {
            this.c = (short)(7 * g2.e() / 100);
            return;
        }
        if (string.equals("\u4e5d\u9633\u795e\u529f")) {
            this.d = (short)(13 * g2.e() / 100);
            return;
        }
        if (string.equals("\u4e7e\u5764\u5927\u632a\u79fb")) {
            this.e = (short)30;
            return;
        }
        if (string.equals("\u516b\u5366\u638c")) {
            boolean bl = false;
            this.f = (short)5;
            if (g2.b != null) {
                for (int i = 0; i < g2.b.length; ++i) {
                    if (g2.b[i].d != 2 || g2.b[i].a == this.a) continue;
                    g2.b[i].m = (short)(g2.b[i].m + 5);
                }
            }
            return;
        }
        if (string.equals("\u5929\u5c71\u6298\u6885\u624b")) {
            short s;
            this.f = s = (short)(1 * g2.a() / 100);
            if (g2.b != null) {
                for (int i = 0; i < g2.b.length; ++i) {
                    if (g2.b[i].d != 2 || g2.b[i].a == this.a) continue;
                    g2.b[i].m = (short)(g2.b[i].m + s);
                }
            }
            return;
        }
        if (string.equals("\u5c11\u6797\u9f99\u6293\u624b")) {
            short s;
            this.f = s = (short)(2 * g2.a() / 100);
            if (g2.b != null) {
                for (int i = 0; i < g2.b.length; ++i) {
                    if (g2.b[i].d != 2 || g2.b[i].a == this.a) continue;
                    g2.b[i].m = (short)(g2.b[i].m + s);
                }
            }
            return;
        }
        if (string.equals("\u964d\u9f99\u5341\u516b\u638c")) {
            short s;
            this.f = s = (short)(2 * g2.a() / 100 + 10);
            if (g2.b != null) {
                for (int i = 0; i < g2.b.length; ++i) {
                    if (g2.b[i].d != 2 || g2.b[i].a == this.a) continue;
                    g2.b[i].m = (short)(g2.b[i].m + s);
                }
            }
            return;
        }
        if (string.equals("\u4e03\u4f24\u62f3")) {
            boolean bl = false;
            this.g = (short)5;
            if (g2.b != null) {
                for (int i = 0; i < g2.b.length; ++i) {
                    if (g2.b[i].d != 3 || g2.b[i].a == this.a) continue;
                    g2.b[i].n = (short)(g2.b[i].n + 5);
                }
            }
            return;
        }
        if (string.equals("\u72ee\u5b50\u543c")) {
            short s;
            this.g = s = (short)(1 * g2.a() / 100);
            if (g2.b != null) {
                for (int i = 0; i < g2.b.length; ++i) {
                    if (g2.b[i].d != 3 || g2.b[i].a == this.a) continue;
                    g2.b[i].n = (short)(g2.b[i].n + s);
                }
            }
            return;
        }
        if (string.equals("\u5317\u51a5\u795e\u529f")) {
            short s;
            this.g = s = (short)(2 * g2.a() / 100);
            if (g2.b != null) {
                for (int i = 0; i < g2.b.length; ++i) {
                    if (g2.b[i].d != 3 || g2.b[i].a == this.a) continue;
                    g2.b[i].n = (short)(g2.b[i].n + s);
                }
            }
            return;
        }
        if (string.equals("\u4e7e\u5764\u592a\u6781")) {
            short s;
            this.g = s = (short)(2 * g2.a() / 100 + 10);
            if (g2.b != null) {
                for (int i = 0; i < g2.b.length; ++i) {
                    if (g2.b[i].d != 3 || g2.b[i].a == this.a) continue;
                    g2.b[i].n = (short)(g2.b[i].n + s);
                }
            }
            return;
        }
        if (string.equals("\u5ce8\u5d4b\u638c\u6cd5")) {
            short s = (short)(g2.a() * 5 / 100);
            this.a = (short)(this.a + s);
            return;
        }
        if (string.equals("\u5730\u85cf\u5200\u6cd5")) {
            short s = (short)(g2.a() * 5 / 100);
            this.a = (short)(this.a + s);
        }
    }

    public final boolean a() {
        return this.b >= this.c;
    }

    public static void a(g g2, c c2) {
        if (g2 == null || c2 == null) {
            return;
        }
        if (g2.a.b >= c2.b + 1) {
            System.out.println("skillUpdate \u6280\u80fd\u70b9>=(skill.level+1)");
            if (!c2.a()) {
                System.out.println("skillUpdate \u73b0\u6709\u7ea7\u522b\u672a\u5230\u9876\u7ea7");
                g2.a.b = (short)(g2.a.b - (c2.b + 1));
                c2.b = (byte)(c2.b + 1);
                String string = a[c2.a - 1];
                if (string.equals("\u901a\u81c2\u62f3")) {
                    c2.i = (short)(c2.i + 5);
                    if (c2.a()) {
                        // empty if block
                    }
                } else if (string.equals("\u9759\u5fc3\u8bc0")) {
                    short s2 = (short)(2 * g2.f() / 100);
                    c2.j = (short)(c2.j + s2);
                } else if (string.equals("\u4e5d\u9633\u795e\u529f")) {
                    short s3 = (short)(3 * g2.e() / 100);
                    c2.k = (short)(c2.k + s3);
                } else if (string.equals("\u4e7e\u5764\u5927\u632a\u79fb")) {
                    c2.l = (short)(c2.l + 10);
                    if (c2.a()) {
                        // empty if block
                    }
                } else if (string.equals("\u516b\u5366\u638c")) {
                    boolean bl = false;
                    for (int i = 0; i < g2.b.length; ++i) {
                        if (g2.b[i].d != 2) continue;
                        g2.b[i].m = (short)(g2.b[i].m + 5);
                    }
                } else if (string.equals("\u5929\u5c71\u6298\u6885\u624b")) {
                    short s4 = (short)(1 * g2.a() / 100);
                    for (int i = 0; i < g2.b.length; ++i) {
                        if (g2.b[i].d != 2) continue;
                        g2.b[i].m = (short)(g2.b[i].m + s4);
                    }
                } else if (string.equals("\u5c11\u6797\u9f99\u6293\u624b")) {
                    short s5 = (short)(2 * g2.a() / 100);
                    for (int i = 0; i < g2.b.length; ++i) {
                        if (g2.b[i].d != 2) continue;
                        g2.b[i].m = (short)(g2.b[i].m + s5);
                    }
                } else if (string.equals("\u964d\u9f99\u5341\u516b\u638c")) {
                    short s6 = (short)(2 * g2.a() / 100 + 10);
                    for (int i = 0; i < g2.b.length; ++i) {
                        if (g2.b[i].d != 2) continue;
                        g2.b[i].m = (short)(g2.b[i].m + s6);
                    }
                } else if (string.equals("\u4e03\u4f24\u62f3")) {
                    boolean bl = false;
                    for (int i = 0; i < g2.b.length; ++i) {
                        if (g2.b[i].d != 3) continue;
                        g2.b[i].n = (short)(g2.b[i].n + 5);
                    }
                } else if (string.equals("\u72ee\u5b50\u543c")) {
                    short s7 = (short)(1 * g2.a() / 100);
                    for (int i = 0; i < g2.b.length; ++i) {
                        if (g2.b[i].d != 3) continue;
                        g2.b[i].n = (short)(g2.b[i].n + s7);
                    }
                } else if (string.equals("\u5317\u51a5\u795e\u529f")) {
                    short s8 = (short)(2 * g2.a() / 100);
                    for (int i = 0; i < g2.b.length; ++i) {
                        if (g2.b[i].d != 3) continue;
                        g2.b[i].n = (short)(g2.b[i].n + s8);
                    }
                } else if (string.equals("\u4e7e\u5764\u592a\u6781")) {
                    short s9 = (short)(2 * g2.a() / 100 + 10);
                    for (int i = 0; i < g2.b.length; ++i) {
                        if (g2.b[i].d != 3) continue;
                        g2.b[i].n = (short)(g2.b[i].n + s9);
                    }
                } else if (string.equals("\u5ce8\u5d4b\u638c\u6cd5")) {
                    short s10 = (short)(g2.a() * 5 / 100);
                    c2.h = (short)(c2.h + s10);
                } else if (string.equals("\u5730\u85cf\u5200\u6cd5")) {
                    short s11 = (short)(g2.a() * 5 / 100);
                    c2.h = (short)(c2.h + s11);
                }
                if (GameMIDlet.self.debug) {
                    System.out.println("skillUpdate \u6280\u80fd\u5347\u7ea7\u6210\u529f");
                }
            }
        }
        s.c(g2);
        s.a(s.a);
        if (GameMIDlet.self.debug) {
            System.out.println("skillUpdate \u6280\u80fd\u5347\u7ea7\u5b8c\u6210");
        }
    }

    public static void a() {
        String string = w.a("/txt/skill.txt");
        a = w.a(string, "skillName:", "end", "=");
        w.a(string, "skillNote:", "end", "=");
        w.a(string, "skillMP:", "end", "=");
        b = w.a(string, "skillIcon:", "end", "=");
        a = w.a(string, "skillSeries:", "end", "=");
        b = w.a(string, "skillNeedBook:", "end", "=");
        c = w.a(string, "skillLevelMax:", "end", "=");
        w.a(string, "skillDamage:", "end", "=");
        w.a(string, "skillAddType:", "end", "=");
    }

    public static void b() {
        byte by = (byte)b.length;
        if (a == null) {
            a = new Image[by];
            for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
                c.a[by2] = w.a(b[by2]);
            }
        }
    }

    public static String[] a(c c2) {
        String[] stringArray = new String[2];
        StringBuffer stringBuffer = new StringBuffer();
        stringArray[0] = a[c2.a - 1];
        if (c2.b > 0) {
            stringBuffer.append(c2.b + "\u7ea7");
        }
        if (stringArray[0].equals("\u901a\u81c2\u62f3")) {
            if (!c2.a()) {
                stringBuffer.append("+\u529b\u91cf" + (10 + 5 * (c2.b + 1)) + " ");
                stringBuffer.append("\u5355\u4f53").append(80 + 20 * (c2.b + 1) + "%\u57fa\u7840\u653b\u51fb,").append(30 + 20 * (c2.b + 1) + "\u70b9\u989d\u5916\u653b\u51fb");
                stringBuffer.append("\u4e0b\u4e00\u7ea7: ");
                stringBuffer.append("+\u529b\u91cf" + (10 + 5 * (c2.b + 2)) + " ");
                stringBuffer.append(80 + 20 * (c2.b + 2) + "%\u57fa\u7840\u653b\u51fb,").append(30 + 20 * (c2.b + 2) + "\u70b9\u989d\u5916\u653b\u51fb ");
            } else {
                stringBuffer.append("[\u9876\u7ea7] ");
                stringBuffer.append("+\u529b\u91cf" + (10 + 5 * (c2.b + 1)) + " ");
                stringBuffer.append("\u5168\u4f53").append(80 + 20 * (c2.b + 1) + "%\u57fa\u7840\u653b\u51fb,").append(30 + 20 * (c2.b + 1) + "\u70b9\u989d\u5916\u653b\u51fb ");
            }
        } else if (stringArray[0].equals("\u9759\u5fc3\u8bc0")) {
            if (!c2.a()) {
                stringBuffer.append("+MP\u4e0a\u9650" + (5 + 2 * (c2.b + 1)) + "% ");
                stringBuffer.append("\u5355\u4f53\u56de\u8840").append(25 + 5 * (c2.b + 1) + "%").append(",\u5916\u52a0" + 50 * (c2.b + 1));
                stringBuffer.append("\u4e0b\u4e00\u7ea7: ");
                stringBuffer.append("+MP\u4e0a\u9650" + (5 + 2 * (c2.b + 2)) + "% ");
                stringBuffer.append("\u56de\u8840").append(25 + 5 * (c2.b + 2) + "%,").append("\u5916\u52a0" + (30 + 20 * (c2.b + 2)) + " ");
            } else {
                stringBuffer.append("[\u9876\u7ea7] ");
                stringBuffer.append("+MP\u4e0a\u9650" + (5 + 2 * (c2.b + 1)) + "% ");
                stringBuffer.append("\u5168\u4f53\u56de\u8840").append(25 + 5 * (c2.b + 1) + "%").append("\u5916\u52a0" + 50 * (c2.b + 1));
            }
        } else if (stringArray[0].equals("\u4e5d\u9633\u795e\u529f")) {
            if (!c2.a()) {
                stringBuffer.append("+HP\u4e0a\u9650" + (10 + 5 * (c2.b + 1)) + "% ");
                stringBuffer.append("\u6218\u6597\u65f6\u589e\u52a0\u5355\u4f53").append(15 + 3 * (c2.b + 1) + "%\u7684\u653b\u51fb\u548c\u9632\u5fa1").append(",\u6301\u7eed" + ((c2.b + 1) / 3 + 1) + "\u56de\u5408");
                stringBuffer.append("\u4e0b\u4e00\u7ea7: ");
                stringBuffer.append("+HP\u4e0a\u9650" + (10 + 5 * (c2.b + 2)) + "% ");
                stringBuffer.append("\u6218\u6597\u65f6\u589e\u52a0").append(15 + 3 * (c2.b + 2) + "%\u7684\u653b\u51fb\u548c\u9632\u5fa1").append(",\u6301\u7eed" + ((c2.b + 2) / 3 + 1) + "\u56de\u5408 ");
            } else {
                stringBuffer.append("[\u9876\u7ea7] ");
                stringBuffer.append("+HP\u4e0a\u9650" + (10 + 5 * (c2.b + 1)) + "% ");
                stringBuffer.append("\u5168\u4f53\u589e\u52a0").append(15 + 3 * (c2.b + 1) + "%\u7684\u653b\u51fb\u548c\u9632\u5fa1").append(",\u6301\u7eed" + ((c2.b + 1) / 3 + 1) + "\u56de\u5408");
            }
        } else if (stringArray[0].equals("\u4e7e\u5764\u5927\u632a\u79fb")) {
            if (!c2.a()) {
                stringBuffer.append("+\u654f\u6377" + (20 + 10 * (c2.b + 1)) + " ");
                stringBuffer.append("\u51cf\u5c11\u6240\u53d7\u4f24\u5bb3").append(20 + 4 * (c2.b + 1) + "%").append(",\u6301\u7eed" + ((c2.b + 1) / 3 + 1) + "\u56de\u5408");
                stringBuffer.append("\u4e0b\u4e00\u7ea7: ");
                stringBuffer.append("+\u654f\u6377" + (20 + 10 * (c2.b + 2)) + " ");
                stringBuffer.append("\u51cf\u5c11\u6240\u53d7\u4f24\u5bb3").append(20 + 4 * (c2.b + 2) + "%").append(",\u6301\u7eed" + ((c2.b + 2) / 3 + 1) + "\u56de\u5408 ");
            } else {
                stringBuffer.append("[\u9876\u7ea7] ");
                stringBuffer.append("+\u654f\u6377" + (20 + 10 * (c2.b + 1)) + " ");
                stringBuffer.append("\u51cf\u5c11\u6240\u53d7\u4f24\u5bb3").append(20 + 4 * (c2.b + 1) + "%,\u5e76\u5c06\u53d7\u5230\u7684\u4f24\u5bb3\u968f\u673a\u8f6c\u79fb\u7ed9\u654c\u4eba").append(",\u6301\u7eed" + ((c2.b + 1) / 3 + 1) + "\u56de\u5408");
            }
            stringBuffer.append("\u4e00\u573a\u6218\u6597\u53ea\u53ef\u4f7f\u7528\u4e00\u6b21");
        } else if (stringArray[0].equals("\u516b\u5366\u638c")) {
            if (!c2.a()) {
                stringBuffer.append("+\u5916\u529f\u653b\u51fb" + 5 * (c2.b + 1) + " ");
                stringBuffer.append("\u5355\u4f53").append("80%\u57fa\u7840\u653b\u51fb").append("," + (30 + 20 * (c2.b + 1)) + "\u70b9\u989d\u5916\u653b\u51fb ");
                stringBuffer.append("\u4e0b\u4e00\u7ea7: ");
                stringBuffer.append("+\u5916\u529f\u653b\u51fb" + 5 * (c2.b + 2) + " ");
                stringBuffer.append("80%\u57fa\u7840\u653b\u51fb").append("," + (30 + 20 * (c2.b + 2)) + "\u70b9\u989d\u5916\u653b\u51fb.\u8be5\u653b\u51fb\u65e0\u89c6\u654c\u4eba\u7684\u9632\u5fa1 ");
            } else {
                stringBuffer.append("[\u9876\u7ea7] ");
                stringBuffer.append("+\u5916\u529f\u653b\u51fb" + 5 * (c2.b + 1) + " ");
                stringBuffer.append("\u5355\u4f53").append("80%\u57fa\u7840\u653b\u51fb").append("," + (30 + 20 * (c2.b + 1)) + "\u70b9\u989d\u5916\u653b\u51fb. \u8be5\u653b\u51fb\u65e0\u89c6\u654c\u4eba\u7684\u9632\u5fa1");
            }
        } else if (stringArray[0].equals("\u5929\u5c71\u6298\u6885\u624b")) {
            if (!c2.a()) {
                stringBuffer.append("+\u5916\u529f\u653b\u51fb" + 1 * (c2.b + 1) + "% ");
                stringBuffer.append("\u5168\u4f53").append("80%\u57fa\u7840\u653b\u51fb").append("," + (50 + 30 * (c2.b + 1)) + "\u70b9\u989d\u5916\u653b\u51fb ");
                stringBuffer.append("\u4e0b\u4e00\u7ea7: ");
                stringBuffer.append("+\u5916\u529f\u653b\u51fb" + 1 * (c2.b + 2) + "% ");
                stringBuffer.append("\u5168\u4f53").append("80%\u57fa\u7840\u653b\u51fb").append("," + (50 + 30 * (c2.b + 2)) + "\u70b9\u989d\u5916\u653b\u51fb ");
            } else {
                stringBuffer.append("[\u9876\u7ea7] ");
                stringBuffer.append("+\u5916\u529f\u653b\u51fb" + 1 * (c2.b + 1) + "% ");
                stringBuffer.append("\u5168\u4f53").append("80%\u57fa\u7840\u653b\u51fb").append("," + (50 + 30 * (c2.b + 1)) + "\u70b9\u989d\u5916\u653b\u51fb ");
            }
        } else if (stringArray[0].equals("\u5c11\u6797\u9f99\u6293\u624b")) {
            if (!c2.a()) {
                stringBuffer.append("+\u5916\u529f\u653b\u51fb" + 2 * (c2.b + 1) + "% ");
                stringBuffer.append("\u5355\u4f53").append("140%\u57fa\u7840\u653b\u51fb").append("," + (150 + 40 * (c2.b + 1)) + "\u70b9\u989d\u5916\u653b\u51fb ");
                stringBuffer.append("\u4e0b\u4e00\u7ea7: ");
                stringBuffer.append("+\u5916\u529f\u653b\u51fb" + 2 * (c2.b + 2) + "% ");
                stringBuffer.append("\u5355\u4f53").append("140%\u57fa\u7840\u653b\u51fb").append("," + (150 + 40 * (c2.b + 2)) + "\u70b9\u989d\u5916\u653b\u51fb ");
            } else {
                stringBuffer.append("[\u9876\u7ea7] ");
                stringBuffer.append("+\u5916\u529f\u653b\u51fb" + 2 * (c2.b + 1) + "% ");
                stringBuffer.append("\u5355\u4f53").append("140%\u57fa\u7840\u653b\u51fb").append("," + (150 + 40 * (c2.b + 1)) + "\u70b9\u989d\u5916\u653b\u51fb ");
            }
        } else if (stringArray[0].equals("\u964d\u9f99\u5341\u516b\u638c")) {
            if (!c2.a()) {
                stringBuffer.append("+\u5916\u529f\u653b\u51fb" + 2 * (c2.b + 1) + "%+" + 10 * (c2.b + 1) + " ");
                stringBuffer.append("\u5168\u4f53").append("120%\u57fa\u7840\u653b\u51fb,").append(100 + 30 * (c2.b + 1) + "\u70b9\u989d\u5916\u653b\u51fb").append(",\u6709" + (10 + 2 * (c2.b + 1)) + "%\u7684\u51e0\u7387\u653b\u51fb\u52a0\u500d ");
                stringBuffer.append("\u4e0b\u4e00\u7ea7: ");
                stringBuffer.append("+\u5916\u529f\u653b\u51fb" + 2 * (c2.b + 2) + "%+" + 10 * (c2.b + 2) + " ");
                stringBuffer.append("\u5168\u4f53").append("120%\u57fa\u7840\u653b\u51fb").append(100 + 30 * (c2.b + 2) + "\u70b9\u989d\u5916\u653b\u51fb").append(",\u6709" + (10 + 2 * (c2.b + 2)) + "%\u7684\u51e0\u7387\u653b\u51fb\u52a0\u500d ");
            } else {
                stringBuffer.append("[\u9876\u7ea7] ");
                stringBuffer.append("+\u5916\u529f\u653b\u51fb" + 2 * (c2.b + 1) + "%+" + 10 * (c2.b + 1) + " ");
                stringBuffer.append("\u5168\u4f53").append("120%\u57fa\u7840\u653b\u51fb,").append(100 + 30 * (c2.b + 1) + "\u70b9\u989d\u5916\u653b\u51fb").append(",\u6709" + (10 + 2 * (c2.b + 1)) + "%\u7684\u51e0\u7387\u653b\u51fb\u52a0\u500d ");
            }
        } else if (stringArray[0].equals("\u4e03\u4f24\u62f3")) {
            if (!c2.a()) {
                stringBuffer.append("+\u5185\u529f\u653b\u51fb" + 5 * (c2.b + 1) + " ");
                stringBuffer.append("\u5355\u4f53").append("100%\u57fa\u7840\u653b\u51fb,").append(30 + 20 * (c2.b + 1) + "\u70b9\u989d\u5916\u653b\u51fb").append(",\u51fb\u4e2d\u654c\u4eba\u8fd8\u5c06\u71c3\u70e7\u654c\u4eba20%\u7684MP,\u9020\u6210\u6240\u71c3\u70e7MP\u7684" + (30 + 10 * (c2.b + 1)) + "%\u7684\u4f24\u5bb3 ");
                stringBuffer.append("\u4e0b\u4e00\u7ea7: ");
                stringBuffer.append("+\u5185\u529f\u653b\u51fb" + 5 * (c2.b + 2) + " ");
                stringBuffer.append("\u5355\u4f53").append("100%\u57fa\u7840\u653b\u51fb,").append(30 + 20 * (c2.b + 2) + "\u70b9\u989d\u5916\u653b\u51fb").append(",\u51fb\u4e2d\u654c\u4eba\u8fd8\u5c06\u71c3\u70e7\u654c\u4eba20%\u7684MP,\u9020\u6210\u6240\u71c3\u70e7MP\u7684" + (30 + 10 * (c2.b + 2)) + "%\u7684\u4f24\u5bb3 ");
            } else {
                stringBuffer.append("[\u9876\u7ea7] ");
                stringBuffer.append("+\u5185\u529f\u653b\u51fb" + 5 * (c2.b + 1) + " ");
                stringBuffer.append("\u5355\u4f53").append("100%\u57fa\u7840\u653b\u51fb,").append(30 + 20 * (c2.b + 1) + "\u70b9\u989d\u5916\u653b\u51fb").append(",\u51fb\u4e2d\u654c\u4eba\u8fd8\u5c06\u71c3\u70e7\u654c\u4eba20%\u7684MP,\u9020\u6210\u6240\u71c3\u70e7MP\u7684" + (30 + 10 * (c2.b + 1)) + "%\u7684\u4f24\u5bb3 ");
            }
        } else if (stringArray[0].equals("\u72ee\u5b50\u543c")) {
            if (!c2.a()) {
                stringBuffer.append("+\u5185\u529f\u653b\u51fb" + 1 * (c2.b + 1) + "% ");
                stringBuffer.append("\u5168\u4f53").append("30%\u57fa\u7840\u653b\u51fb,").append(50 + 20 * (c2.b + 1) + "\u70b9\u989d\u5916\u653b\u51fb").append(".\u654c\u4eba\u88ab\u51fb\u4e2d\u6709" + (20 + 4 * (c2.b + 1)) + "%\u7684\u51e0\u7387\u65e0\u6cd5\u8fdb\u884c\u8be5\u56de\u5408\u884c\u52a8 ");
                stringBuffer.append("\u4e0b\u4e00\u7ea7: ");
                stringBuffer.append("+\u5185\u529f\u653b\u51fb" + 1 * (c2.b + 2) + "% ");
                stringBuffer.append("\u5168\u4f53").append("30%\u57fa\u7840\u653b\u51fb").append(50 + 20 * (c2.b + 2) + "\u70b9\u989d\u5916\u653b\u51fb").append(".\u654c\u4eba\u88ab\u51fb\u4e2d\u6709" + (20 + 4 * (c2.b + 2)) + "%\u7684\u51e0\u7387\u65e0\u6cd5\u8fdb\u884c\u8be5\u56de\u5408\u884c\u52a8 ");
            } else {
                stringBuffer.append("[\u9876\u7ea7] ");
                stringBuffer.append("+\u5185\u529f\u653b\u51fb" + 1 * (c2.b + 1) + "% ");
                stringBuffer.append("\u5168\u4f53").append("30%\u57fa\u7840\u653b\u51fb,").append(50 + 20 * (c2.b + 1) + "\u70b9\u989d\u5916\u653b\u51fb").append(".\u654c\u4eba\u88ab\u51fb\u4e2d\u6709" + (20 + 4 * (c2.b + 1)) + "%\u7684\u51e0\u7387\u65e0\u6cd5\u8fdb\u884c\u8be5\u56de\u5408\u884c\u52a8 ");
            }
            stringBuffer.append(" \u4e09\u56de\u5408\u53ef\u4f7f\u7528\u4e00\u6b21");
        } else if (stringArray[0].equals("\u5317\u51a5\u795e\u529f")) {
            if (!c2.a()) {
                stringBuffer.append("+\u5185\u529f\u653b\u51fb" + 2 * (c2.b + 1) + "% ");
                stringBuffer.append("\u5438\u6536\u654c\u4eba").append(10 + 2 * (c2.b + 1) + "%\u7684\u751f\u547d\u4e3a\u5df1\u7528 ");
                stringBuffer.append("\u4e0b\u4e00\u7ea7: ");
                stringBuffer.append("+\u5185\u529f\u653b\u51fb" + 2 * (c2.b + 2) + "% ");
                stringBuffer.append("\u5438\u6536\u654c\u4eba").append(10 + 2 * (c2.b + 2) + "%\u7684\u751f\u547d\u4e3a\u5df1\u7528 ");
            } else {
                stringBuffer.append("[\u9876\u7ea7] ");
                stringBuffer.append("+\u5185\u529f\u653b\u51fb" + 2 * (c2.b + 1) + "% ");
                stringBuffer.append("\u5438\u6536\u654c\u4eba").append(10 + 2 * (c2.b + 1) + "%\u7684\u751f\u547d\u4e3a\u5df1\u7528 ");
            }
            stringBuffer.append(" \u4e00\u573a\u6218\u6597\u53ea\u53ef\u4f7f\u7528\u4e00\u6b21");
        } else if (stringArray[0].equals("\u4e7e\u5764\u592a\u6781")) {
            if (!c2.a()) {
                stringBuffer.append("+\u5185\u529f\u653b\u51fb" + 2 * (c2.b + 1) + "%+" + 10 * (c2.b + 1) + " ");
                stringBuffer.append("\u7ed9\u5168\u4f53\u9020\u6210\u5168\u90e8MP\u7684").append((20 + 2 * (c2.b + 1)) / 20 + "\u500d\u4f24\u5bb3 ");
                stringBuffer.append("\u4e0b\u4e00\u7ea7:");
                stringBuffer.append("+\u5185\u529f\u653b\u51fb" + 2 * (c2.b + 2) + "%+" + 10 * (c2.b + 2) + " ");
                stringBuffer.append("\u7ed9\u5168\u4f53\u9020\u6210\u5168\u90e8MP\u7684").append((20 + 2 * (c2.b + 2)) / 20 + "\u500d\u4f24\u5bb3 ");
            } else {
                stringBuffer.append("[\u9876\u7ea7] ");
                stringBuffer.append("+\u5185\u529f\u653b\u51fb" + 2 * (c2.b + 1) + "%+" + 10 * (c2.b + 1) + " ");
                stringBuffer.append("\u7ed9\u5168\u4f53\u9020\u6210\u5168\u90e8MP\u7684").append((20 + 2 * (c2.b + 1)) / 20 + "\u500d\u4f24\u5bb3 ");
            }
            stringBuffer.append(" \u4e09\u56de\u5408\u53ef\u4f7f\u7528\u4e00\u6b21");
        } else if (stringArray[0].equals("\u5ce8\u5d4b\u638c\u6cd5")) {
            if (!c2.a()) {
                stringBuffer.append("\u5355\u4f53\u653b\u51fb\uff0c\u4f7f\u672c\u8eab\u653b\u51fb\u529b\u6210\u500d\u589e\u52a0 ");
                stringBuffer.append("\u4e0b\u4e00\u7ea7\u653b\u51fb\u529b\u52a0\u62105% ");
            } else {
                stringBuffer.append("[\u9876\u7ea7]");
                stringBuffer.append("\u5355\u4f53\u653b\u51fb\uff0c\u4f7f\u672c\u8eab\u653b\u51fb\u529b\u6210\u500d\u589e\u52a0 ");
            }
        } else if (stringArray[0].equals("\u5730\u85cf\u5200\u6cd5")) {
            if (!c2.a()) {
                stringBuffer.append("\u5168\u4f53\u653b\u51fb\uff0c\u5bf9\u672c\u8eab\u653b\u51fb\u529b\u5177\u6709\u6210\u500d\u7684\u52a0\u6210\u6548\u679c ");
                stringBuffer.append("\u4e0b\u4e00\u7ea7\u653b\u51fb\u529b\u52a0\u62105% ");
            } else {
                stringBuffer.append("[\u9876\u7ea7]");
                stringBuffer.append("\u5168\u4f53\u653b\u51fb\uff0c\u5bf9\u672c\u8eab\u653b\u51fb\u529b\u5177\u6709\u6210\u500d\u7684\u52a0\u6210\u6548\u679c ");
            }
        }
        if (!c2.a()) {
            stringBuffer.append("\u9700\u8981\u6d88\u8017" + (c2.b + 1) + "\u4e2a\u6280\u80fd\u70b9 ");
        }
        stringArray[1] = stringBuffer.toString();
        return stringArray;
    }
}
