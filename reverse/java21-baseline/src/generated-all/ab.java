/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public final class ab {
    static g a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(int n) {
        n = af.a(n);
        if (ba.a.a != 2) return;
        if (ba.a.b == 1) {
            if (ba.a.b || ba.a.c) {
                return;
            }
            if (n == 8) {
                if (ba.a.h) {
                    ba.a.a(ba.a.a);
                    return;
                }
                if (ba.a.g) {
                    boolean bl;
                    ak ak2 = ba.a.a;
                    boolean bl2 = false;
                    boolean bl3 = false;
                    if (ak2.b == 0) {
                        bl2 = true;
                    } else if (ak2.b == 1) {
                        bl = false;
                        for (int i = 0; i < s.a.length; ++i) {
                            if (!w.a(s.a[i].a, 10)) continue;
                            bl = true;
                            bl3 = true;
                            break;
                        }
                        if (bl) {
                            bl2 = true;
                        }
                    }
                    if (bl2) {
                        int n2;
                        bl = true;
                        Object object = ak2;
                        ak2.a = (byte)(bl ? 1 : 0);
                        if (!w.a(s.a, (int)ak2.a)) {
                            s.a = w.b(s.a, (int)ak2.a);
                        }
                        String[] stringArray = null;
                        String[] stringArray2 = null;
                        object = new Vector();
                        if (bl3) {
                            ((Vector)object).addElement("\u4f7f\u7528\u5f00\u9501\u6280\u80fd");
                        }
                        if (ak2.b > 0) {
                            ((Vector)object).addElement("\u83b7\u5f97\u91d1\u5e01" + ak2.b);
                            s.a += ak2.b;
                            ak2.b = 0;
                        }
                        if (ak2.a != null) {
                            String string = w.a("/txt/item.txt");
                            stringArray = w.a(string, "itemName:", "end", "=", ",");
                        }
                        if (ak2.b != null) {
                            String string = w.a("/txt/equip.txt");
                            stringArray2 = w.a(string, "equipName:", "end", "=", ",");
                        }
                        for (n2 = 0; ak2.a != null && n2 < ak2.a.length; ++n2) {
                            ((Vector)object).addElement("\u83b7\u5f97" + stringArray[ak2.a[n2] - 1]);
                            s.a(ak2.a[n2], 1);
                        }
                        ak2.a = null;
                        for (n2 = 0; ak2.b != null && n2 < ak2.b.length; ++n2) {
                            ((Vector)object).addElement("\u83b7\u5f97" + stringArray2[ak2.b[n2] - 1]);
                            s.e(ak2.b[n2], -1);
                        }
                        ak2.b = null;
                        if (((Vector)object).size() <= 0) {
                            ((Vector)object).addElement("\u7bb1\u5b50\u662f\u7a7a\u7684");
                        }
                        ba.a.a = new String[((Vector)object).size()];
                        ((Vector)object).copyInto(ba.a.a);
                        ba.a.c = 0;
                        ba.a.b = (byte)6;
                        return;
                    }
                    ba.a.a = new String[]{"\u9501\u4f4f\u4e86\u65e0\u6cd5\u6253\u5f00"};
                    ba.a.c = 0;
                    ba.a.b = (byte)6;
                    return;
                }
                if (ba.a.f) {
                    a = ba.a.a;
                    n = 0;
                    for (int i = 0; s.a != null && i < s.a.length; ++i) {
                        if (a != s.a[i]) continue;
                        n = 1;
                    }
                    if (n != 0) {
                        return;
                    }
                    if (ab.a.t <= 0) return;
                    String string = null;
                    String string2 = null;
                    string = w.a("/txt/scene" + s.c + "chat.txt");
                    if (string == null) {
                        return;
                    }
                    String[][] stringArray = w.a(string, "roleId=" + ab.a.t + "\r\n", "end");
                    byte by = s.a;
                    while ((string2 == null || string2.equals("")) && by > 0 && (string2 = w.a((String)stringArray, "phase" + by + ":", "phase" + by + "End")) != null && !string2.equals("")) {
                    }
                    if (string2 == null) {
                        string2 = w.a((String)stringArray, "phaseAll:", "phaseAllEnd");
                    }
                    if (string2 == null) {
                        return;
                    }
                    stringArray = w.a(string2, "script:", "scriptEnd", "=");
                    e e2 = new e();
                    new e().a = stringArray;
                    e2.a = a;
                    ba.a.a(e2);
                    a = null;
                    return;
                }
                if (ba.a.i) {
                    j j2 = ba.a.a;
                    boolean bl = false;
                    String string = null;
                    String string3 = null;
                    if (j2.a == 0) {
                        string3 = "\u6b64\u8def\u6682\u4e0d\u901a\u884c\uff0c\u8bf7\u7ed5\u9053";
                    } else if (j2.a == 1) {
                        string3 = "\u6b64\u8def\u6682\u4e0d\u901a\u884c\uff0c\u8bf7\u7ed5\u9053";
                    } else if (j2.a == 2) {
                        string3 = "\u65e0\u6cd5\u632a\u5f00\u5de8\u77f3";
                        for (int i = 0; i < s.a.length; ++i) {
                            if (w.a(s.a[i].a, 3)) {
                                bl = true;
                                string = "\u4f7f\u7528\u4e5d\u9633\u795e\u529f\u6253\u788e\u77f3\u5934";
                            } else {
                                if (!w.a(s.a[i].a, 9)) continue;
                                bl = true;
                                string = "\u4f7f\u7528\u4e03\u4f24\u62f3\u6253\u788e\u77f3\u5934";
                            }
                            break;
                        }
                    } else if (j2.a == 3) {
                        string3 = "\u5185\u529b\u4e0d\u591f\u6df1\u539a\uff0c\u65e0\u6cd5\u63a8\u5f00\u6b64\u95e8";
                        for (int i = 0; i < s.a.length; ++i) {
                            if (s.a[0].a[0] < 25) continue;
                            bl = true;
                            string = "\u5185\u529b\u8ff8\u53d1\uff0c\u95e8\u88ab\u63a8\u5f00";
                            break;
                        }
                    }
                    if (bl) {
                        if (!w.a(s.b, (int)j2.a)) {
                            s.b = w.b(s.b, (int)j2.a);
                        }
                        ba.a.b.b(j2);
                        ba.a.a = null;
                        ba.a.i = false;
                        ba.a.a = new String[]{string};
                        ba.a.c = 0;
                        ba.a.b = (byte)6;
                        return;
                    }
                    ba.a.a = new String[]{string3};
                    ba.a.c = 0;
                    ba.a.b = (byte)6;
                    return;
                }
                if (ba.a.j) {
                    a a2 = ba.a.a;
                    if (!w.a(s.c, (int)a2.a)) {
                        a2.a = a.c;
                        if (!w.a(s.c, (int)a2.a)) {
                            s.c = w.b(s.c, (int)a2.a);
                        }
                        for (int i = 0; i < ba.a.b.a.length; ++i) {
                            if (ba.a.b.a[i].s != 5 || ((y)ba.a.b.a[i]).a != a2.b) continue;
                            ((y)ba.a.b.a[i]).a = y.c;
                            if (w.a(s.d, (int)((y)ba.a.b.a[i]).a)) continue;
                            s.d = w.b(s.d, (int)((y)ba.a.b.a[i]).a);
                        }
                        ba.a.a = null;
                        ba.a.j = false;
                        ba.a.a = new String[]{"\u95e8\u88ab\u6253\u5f00"};
                        ba.a.c = 0;
                        ba.a.b = (byte)6;
                        return;
                    }
                    a2.a = 0;
                    if (w.a(s.c, (int)a2.a)) {
                        s.c = w.a(s.c, (int)a2.a);
                    }
                    for (int i = 0; i < ba.a.b.a.length; ++i) {
                        if (ba.a.b.a[i].s != 5 || ((y)ba.a.b.a[i]).a != a2.b) continue;
                        ((y)ba.a.b.a[i]).a = 0;
                        if (!w.a(s.d, (int)((y)ba.a.b.a[i]).a)) continue;
                        s.d = w.a(s.d, (int)((y)ba.a.b.a[i]).a);
                    }
                    ba.a.a = null;
                    ba.a.j = false;
                    ba.a.a = new String[]{"\u95e8\u88ab\u5173\u4e0a"};
                    ba.a.c = 0;
                    ba.a.b = (byte)6;
                    return;
                }
                if (!s.a[0].k || ((ar)s.a[0]).r != 1) return;
                if (s.a[0].i) {
                    s.a[0].l();
                    return;
                }
                s.a[0].k();
                return;
            }
            if (n == af.f) {
                ab.a();
                ah.g = 1;
                return;
            }
            if (n == af.g) {
                if (s.a[0].i) {
                    return;
                }
                if (ap.a == 0) {
                    u.a("/txt/smsItem.txt");
                    ba.a.l();
                    return;
                }
                if (ap.a != 1) return;
                if (ba.a.a == null) {
                    ba.a.a = new ae();
                }
                ba.a.b = (byte)8;
                ba.a.l();
                return;
            }
            if (n == 1) {
                if (!s.a[0].i) return;
                s.a[0].b(1);
                s.a[0].j();
                return;
            }
            if (n == 6) {
                if (!s.a[0].i) return;
                s.a[0].b(0);
                s.a[0].j();
                return;
            }
            if (n == 2) {
                if (!s.a[0].i) return;
                s.a[0].b(2);
                s.a[0].j();
                return;
            }
            if (n == 5) {
                if (!s.a[0].i) return;
                s.a[0].b(3);
                s.a[0].j();
                return;
            }
            if (n != 55) return;
            boolean bl = ba.a.l = !ba.a.l;
            if (ba.a.l) {
                String string = w.a("/txt/nameInbigMap.txt");
                ba.a.b = w.a(string, "nameInBigMap:", "end", "=", ",");
                ba.a.a = w.a(string, "posInBigMap:", "end", "=");
                return;
            }
            ba.a.b = null;
            ba.a.a = null;
            return;
        }
        if (ba.a.b == 6) {
            switch (n) {
                case 8: {
                    if (ba.a.c < ba.a.a.length - 1) {
                        ba.a.c = (byte)(ba.a.c + 1);
                        return;
                    }
                    ba.a.b = 1;
                    ba.a.a = null;
                    ba.a.c = (byte)-1;
                    ba.a.d(0);
                }
                default: {
                    return;
                }
            }
        }
        if (ba.a.b != 2) return;
        switch (n) {
            case 6: {
                if (ba.a.a.c == 0) {
                    if (ba.a.a == null) return;
                    ba.a.a.c();
                    return;
                }
                if (ba.a.a.c != aq.e || ba.a.a.b >= ba.a.a.b.length - 1) return;
                ba.a.a.b = (byte)(ba.a.a.b + 1);
                return;
            }
            case 1: {
                if (ba.a.a.c == 0) {
                    if (ba.a.a == null) return;
                    ba.a.a.b();
                    return;
                }
                if (ba.a.a.c != aq.e || ba.a.a.b <= 0) return;
                ba.a.a.b = (byte)(ba.a.a.b - 1);
                return;
            }
            case 8: {
                if (ba.a.a.c == 0) {
                    if (ba.a.a == null) return;
                    if (ba.a.a.a()) {
                        if (ba.a.a.a >= ba.a.a.a.length - 1) {
                            if (ba.a.a.a != null) {
                                ba.a.a.a.b(ba.a.a.a.b);
                                ba.a.a.a.e();
                            }
                            ba.a.h();
                            ba.a.b = 1;
                            return;
                        }
                        ba.a.a.f();
                        return;
                    }
                    ba.a.a.c();
                    return;
                }
                if (ba.a.a.c != aq.e) return;
                ba.a.a = ba.a.a.b[ba.a.a.b];
                ba.a.h();
                ba.a.b = 1;
            }
        }
    }

    public static void a(int n2, int n3) {
        if (ba.a.a == 2 && ba.a.b == 1) {
            ad ad2 = n.a(n2, n3);
            if (ad2 != null && ad2.a == 1) {
                ab.a();
                ah.g = 1;
            }
            if (n2 > ba.a.c && n2 < ba.a.c + ba.a.a.getWidth() && n3 > ba.a.d && n3 < ba.a.d + ba.a.a.getHeight()) {
                if (ap.a == 0) {
                    u.a("/txt/smsItem.txt");
                    ba.a.l();
                    return;
                }
                if (ap.a == 1) {
                    if (ba.a.a == null) {
                        ba.a.a = new ae();
                    }
                    ba.a.b = (byte)8;
                    ba.a.l();
                }
            }
        }
    }

    private static void a() {
        if (s.a[0].i) {
            return;
        }
        if (ba.a.a != null) {
            return;
        }
        ba.a.f();
        if (GameMIDlet.self.moreSleep) {
            try {
                System.gc();
                Thread.sleep(200L);
            }
            catch (InterruptedException interruptedException) {
                InterruptedException interruptedException2 = interruptedException;
                interruptedException.printStackTrace();
            }
        }
        ba.a.a = new ah();
        ba.a.b = (byte)3;
        ah.a = s.a();
        ba.a.a.b();
        ba.a.a.b = true;
    }
}
