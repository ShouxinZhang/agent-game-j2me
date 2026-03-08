/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreException
 *  javax.microedition.rms.RecordStoreFullException
 *  javax.microedition.rms.RecordStoreNotFoundException
 *  javax.microedition.rms.RecordStoreNotOpenException
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotFoundException;
import javax.microedition.rms.RecordStoreNotOpenException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class s {
    public static short a = 0;
    public static short b = 0;
    public static byte a = 1;
    public static String a;
    public static byte b;
    public static byte c;
    public static byte[] a;
    public static byte d;
    public static boolean a;
    public static String b;
    public static String c;
    public static String[] a;
    public static boolean b;
    public static g[] a;
    public static byte[] b;
    public static short[][] a;
    public static byte[][] a;
    public static byte e;
    private static byte h;
    public static byte f;
    public static int a;
    public static z[][] a;
    public static byte[][][] a;
    public static byte[] c;
    public static short[] a;
    public static short[] b;
    public static short[] c;
    public static short[] d;
    public static short[] e;
    public static byte[] d;
    public static byte[] e;
    public static short[] f;
    public static String[] b;
    public static String[] c;
    public static String[][] a;
    public static String[] d;
    public static String[] e;
    public static String[] f;
    public static ag[] a;
    public static boolean c;
    public static boolean d;
    public static String d;
    public static String e;
    public static String f;
    public static int b;
    public static int c;
    public static int d;
    public static String[] g;
    public static byte[] f;
    public static byte[] g;
    public static byte[] h;
    private static byte[] p;
    public static byte[] i;
    public static String[] h;
    public static String g;
    public static short[] g;
    public static short[] h;
    private static String[] l;
    public static Image[] a;
    public static String[] i;
    public static String[] j;
    public static Image[] b;
    public static short[] i;
    public static short c;
    public static byte g;
    public static boolean e;
    public static boolean f;
    public static String h;
    public static String i;
    public static String j;
    public static String k;
    public static String l;
    public static byte[] j;
    public static String[] k;
    public static short[] j;
    public static short[] k;
    public static byte[] k;
    public static byte[] l;
    public static byte[] m;
    public static byte[] n;
    public static byte[] o;
    public static boolean g;

    public static void a() {
        int n;
        if (GameMIDlet.self.debug) {
            System.out.println("\u8bfb\u53d6\u65b0\u6e38\u620f\u6570\u636e");
        }
        Object object = new byte[]{1};
        b = false;
        e = 0;
        for (n = 0; n < ((byte[])object).length; ++n) {
            byte by = object[n];
            s.b(s.a((int)by));
        }
        s.a[0].k = true;
        for (n = 0; n < a.length; ++n) {
            s.d(a[n]);
            g g2 = a[n];
            object = g2;
            s.c(g2);
            object.a[3] = object.a[33];
            object.a[5] = object.a[34];
        }
        a = 1;
        String string = w.a("/txt/team.txt");
        a = w.a(string, "item:", "end", "=");
        a = new byte[3][][];
        a = w.a(string, "bag:", "end", "=");
        if (a != null) {
            z[][] zArrayArray;
            object = a;
            if (a == null) {
                zArrayArray = null;
            } else {
                z[][] zArrayArray2 = null;
                int n2 = ((byte[])object).length;
                zArrayArray2 = new z[n2][];
                for (int i = 0; i < n2; ++i) {
                    if (object[i] == null) continue;
                    int n3 = ((byte)object[i]).length;
                    zArrayArray2[i] = new z[n3];
                    for (int j = 0; j < n3; ++j) {
                        zArrayArray2[i][j] = new z((int)object[i][j], 1);
                    }
                }
                zArrayArray = zArrayArray2;
            }
            a = zArrayArray;
        } else {
            a = new byte[8][];
            a = new z[8][];
        }
        a = w.a(string, "money");
        if (GameMIDlet.self.debug) {
            System.out.println("\u8bfb\u53d6\u65b0\u6e38\u620f\u6570\u636e\u5b8c\u6210");
        }
    }

    public static void a(String string) {
        b = false;
        e = 0;
        String string2 = i;
        if (string.equals("\u8fdb\u5ea6\u4e00")) {
            string2 = i;
        } else if (string.equals("\u8fdb\u5ea6\u4e8c")) {
            string2 = j;
        } else if (string.equals("\u8fdb\u5ea6\u4e09")) {
            string2 = k;
        }
        s.a(string2);
        for (int i = 0; i < b.length; ++i) {
            byte by = b[i];
            s.b(s.a((int)by));
        }
        s.a[0].k = true;
    }

    public static void b() {
        e = 0;
        s.a(l);
        for (int i = 0; i < b.length; ++i) {
            byte by = b[i];
            s.b(s.a((int)by));
        }
        s.a[0].k = true;
    }

    public static void c() {
        String string = w.a("/txt/scene.txt");
        b = w.a(string, "default");
        string = w.a(string, "battleMusic:", "end");
        d = w.a(string, "inbattle");
        e = w.a(string, "win");
        f = w.a(string, "lose");
        b = w.a(string, "inbattleVolume");
        c = w.a(string, "winVolume");
        d = w.a(string, "loseVolume");
        string = w.a("/txt/role.txt");
        b = w.a(string, "roleName:", "end", "=");
        c = w.a(string, "roleFace:", "end", "=");
        a = w.a(string, "roleBody:", "roleBodyEnd", "=");
        e = w.a(string, "roleFlyBody");
        d = w.a(string, "roleSmallBody");
        f = w.a(string, "roleSmallFlyBody");
        u.b();
    }

    public static void d() {
        String string = w.a("/txt/config.txt");
        GameMIDlet.self.cutMapImg = w.a(string, "cutMapImg") == 1;
        GameMIDlet.self.cutSpLibImg = w.a(string, "cutSpLibImg") == 1;
        GameMIDlet.self.cutImg = w.a(string, "cutImg") == 1;
        GameMIDlet.self.useBackLayerCache = w.a(string, "useBackLayerCache") == 1;
        GameMIDlet.self.cacheFullScene = w.a(string, "cacheFullScene") == 1;
        GameMIDlet.self.useEnemyFlash = w.a(string, "useEnemyFlash") == 1;
        GameMIDlet.self.unloadBeforeBattle = w.a(string, "unloadBeforeBattle") == 1;
        GameMIDlet.self.clearBackLayerCache = w.a(string, "clearBackLayerCache") == 1;
        GameMIDlet.self.moreSleep = w.a(string, "moreSleep") == 1;
        GameMIDlet.self.alowDebug = w.a(string, "alowDebug") == 1;
        GameMIDlet.self.useAreaCopy = w.a(string, "useAreaCopy") == 1;
        GameMIDlet.self.allowMusic = w.a(string, "allowMusic") == 1;
        GameMIDlet.self.mobileType = w.a(string, "mobileType");
        System.out.println("mobileType=" + GameMIDlet.self.mobileType);
        a = w.a(string, "screenWidth");
        b = w.a(string, "screenHeight");
        GameMIDlet.self.playMusic = GameMIDlet.self.allowMusic;
        e = w.a(string, "useTouchScreen") > 0;
        GameMIDlet.self.notUseMusicClose = w.a(string, "notUseMusicClose") > 0;
        GameMIDlet.self.phonemodel = w.a(string, "phonemodel");
        if (GameMIDlet.self.phonemodel == null) {
            GameMIDlet.self.phonemodel = " ";
        }
        GameMIDlet.self.useStart = w.a(string, "useStart") > 0;
        GameMIDlet.self.imgType = w.a(string, "imgType");
        System.out.println("useStart=" + GameMIDlet.self.useStart + "  ---imgType" + GameMIDlet.self.imgType);
        System.gc();
        string = w.a("/txt/keyset.txt");
        byte by = w.a(string, "\u4e0a");
        if (by != 0) {
            af.a = by;
        }
        if ((by = w.a(string, "\u4e0b")) != 0) {
            af.b = by;
        }
        if ((by = w.a(string, "\u5de6")) != 0) {
            af.c = by;
        }
        if ((by = w.a(string, "\u53f3")) != 0) {
            af.d = by;
        }
        if ((by = w.a(string, "\u786e\u5b9a")) != 0) {
            af.e = by;
        }
        if ((by = w.a(string, "\u5de6\u8f6f")) != 0) {
            af.g = by;
        }
        if ((by = w.a(string, "\u53f3\u8f6f")) != 0) {
            af.f = by;
        }
        string = "/pic/m.ps";
        string = w.a("/pic/m.ps");
        ap.a = w.a(string, "addMenu");
        ap.b = w.a(string, "addMenuLink");
        ap.a = w.a(string, "logo");
        ap.a = w.a(string, "logoTime");
        ap.c = w.a(string, "aboutus:", "aboutusEnd");
        ap.b = w.a(string, "smsCommand");
        ap.d = w.a(string, "smsPhoneNum");
        ap.e = w.a(string, "smsPrice");
        w.a(string, "smsCommandUseType");
        w.a(string, "smsMsg:", "smsMsgEnd", "=");
        ap.a = (byte)w.a(string, "legameGoldBuy");
        ap.f = w.a(string, "wapIp");
        ap.g = w.a(string, "rootAD");
        w.a(string, "openExitInfo");
        w.a(string, "exitInfo");
        w.a(string, "openExitLink");
        w.a(string, "exitLink");
        System.gc();
    }

    public static boolean a(int n) {
        a = null;
        a = null;
        String string = w.a("/txt/scene.txt");
        Object object = w.a(string, "scene" + n + "File", "scene" + n + "FileEnd");
        a = w.a((String)object, "phase" + a);
        if (a == null) {
            a = w.a((String)object, "phaseAll");
        }
        if (a == null) {
            return false;
        }
        w.a(string, "sceneType:", "end", "=");
        byte[][] byArray = w.a(string, "sceneEnemy:", "end", "=");
        object = byArray;
        a = byArray[n - 1];
        byte[] byArray2 = w.a(string, "sceneEnemyCount:", "end", "=");
        object = byArray2;
        d = byArray2[n - 1];
        int[] nArray = w.a(string, "allowFly:", "end", "=");
        object = nArray;
        a = nArray[n - 1] == 1;
        object = w.a(string, "music:", "end", "=");
        b = object[n - 1];
        object = w.a(string, "battleBack:", "end", "=");
        c = object[n - 1];
        w.a(string, "sceneOut:", "end", "=");
        if (c == 0) {
            c = w.a(string, "liveBackScene");
        }
        if (g == 0) {
            g = w.a(string, "liveBackPos");
        }
        if (a == null) {
            a = w.a(string, "sceneName:", "end", "=");
        }
        return true;
    }

    public static void a(int n, int n2) {
        if (a == null) {
            a = new short[1][2];
            s.a[0][0] = (short)n;
            s.a[0][1] = (short)n2;
            return;
        }
        boolean bl = false;
        for (int i = 0; a != null && i < a.length; ++i) {
            if (a[i][0] != n) continue;
            short[] sArray = a[i];
            sArray[1] = (short)(sArray[1] + n2);
            bl = true;
            break;
        }
        if (!bl) {
            short[][] sArray = new short[a.length + 1][2];
            System.arraycopy(a, 0, sArray, 0, a.length);
            sArray[sArray.length - 1][0] = (short)n;
            sArray[sArray.length - 1][1] = (short)n2;
            a = sArray;
        }
    }

    private static byte[][] a(byte[][] byArray, int n, int n2) {
        if (byArray == null) {
            byArray = new byte[1][2];
            byArray[0][0] = (byte)n;
            byArray[0][1] = (byte)n2;
        } else {
            boolean bl = false;
            for (int i = 0; byArray != null && i < byArray.length; ++i) {
                if (byArray[i][0] != n) continue;
                byte[] byArray2 = byArray[i];
                byArray2[1] = (byte)(byArray2[1] + n2);
                bl = true;
                break;
            }
            if (!bl) {
                byte[][] byArray3 = new byte[byArray.length + 1][2];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                byArray3[byArray3.length - 1][0] = (byte)n;
                byArray3[byArray3.length - 1][1] = (byte)n2;
                byArray = byArray3;
            }
        }
        return byArray;
    }

    public static void b(int n, int n2) {
        n2 = (byte)(n / 10);
        block5: for (int i = 0; i < 1; ++i) {
            switch (n2) {
                case 0: {
                    s.a[0] = s.a(a[0], n, 1);
                    continue block5;
                }
                case 1: {
                    s.a[1] = s.a(a[1], n, 1);
                    continue block5;
                }
                case 2: {
                    s.a[2] = s.a(a[2], n, 1);
                }
            }
        }
    }

    public static void a(g g2, int n) {
        if (!w.a(g2.a, n)) {
            g2.a = w.c(g2.a, n);
            c c2 = new c(n, g2);
            g2.b = w.a(g2.b, c2);
        }
    }

    public static void c(int n, int n2) {
        int n3;
        if (a == null) {
            return;
        }
        for (n3 = 0; n2 > 0 && n3 < a.length; ++n3) {
            if (a[n3][0] != n) continue;
            if (a[n3][1] >= n2) {
                short[] sArray = a[n3];
                sArray[1] = (short)(sArray[1] - n2);
                n2 = 0;
                continue;
            }
            n2 -= a[n3][1];
            s.a[n3][1] = 0;
        }
        n3 = a.length - 1;
        while (n3 >= 0) {
            if (a[n3][1] <= 0) {
                a = w.a(a, n3);
            }
            --n3;
        }
    }

    public static void a(int n) {
        for (int i = 0; i < a.length; ++i) {
            if (a[i][0] != n) continue;
            short[][] sArray = w.a(a, i);
            a = sArray;
            return;
        }
    }

    public static void d(int n, int n2) {
        int n3;
        byte by = (byte)(n / 10);
        if (a == null || a[by] == null) {
            return;
        }
        for (n3 = 0; n2 > 0 && n3 < a[by].length; ++n3) {
            if (a[by][n3][0] != n) continue;
            if (a[by][n3][1] >= n2) {
                byte[] byArray = a[by][n3];
                byArray[1] = (byte)(byArray[1] - n2);
                n2 = 0;
                continue;
            }
            n2 -= a[by][n3][1];
            s.a[by][n3][1] = 0;
        }
        for (n3 = a[by].length - 1; n3 >= 0; --n3) {
            if (a[by][n3][1] > 0) continue;
            s.a[by] = w.a(a[by], n3);
        }
    }

    public static void b(int n) {
        byte by = (byte)(n / 10);
        for (int i = 0; i < a[by].length; ++i) {
            if (a[by][i][0] != n) continue;
            byte[][] byArray = w.a(a[by], i);
            s.a[by] = byArray;
            return;
        }
    }

    public static void e(int n, int n2) {
        if (z.a == null) {
            String string = w.a("/txt/equip.txt");
            z.a = w.a(string, "equipName:", "end", ",");
        }
        if (a == null) {
            a = new byte[8][];
        }
        s.a[z.a[n - 1] - 1] = w.c(a[z.a[n - 1] - 1], (byte)n);
        if (a == null) {
            a = new z[8][];
        }
        int n3 = 0;
        switch (n2) {
            case 1: {
                n3 = 1;
                break;
            }
            case 2: {
                n3 = 2;
                break;
            }
            case 3: {
                n3 = 3;
                break;
            }
            default: {
                Random random = new Random();
                random.setSeed(System.currentTimeMillis());
                n3 = 21474836;
                n2 = Math.abs(random.nextInt()) / n3;
                n3 = n2 <= 34 ? 1 : (n2 <= 67 ? 2 : 3);
            }
        }
        z z2 = new z(n, n3);
        s.a[z.a[n - 1] - 1] = w.a(a[z.a[n - 1] - 1], z2);
    }

    public static void f(int n, int n2) {
        s.a[n] = w.a(a[n], n2);
        s.a[n] = w.a(a[n], n2);
    }

    public static boolean a(az az2) {
        for (int i = 0; a != null && i < a.length; ++i) {
            if (az2 != a[i]) continue;
            return true;
        }
        return false;
    }

    private static void b(g g2, int n) {
        g2.a[3] = g2.a[3] + n;
        if (g2.a[3] > g2.a[33]) {
            g2.a[3] = g2.a[33];
        }
    }

    private static void c(g g2, int n) {
        g2.a[5] = g2.a[5] + n;
        if (g2.a[5] > g2.a[34]) {
            g2.a[5] = g2.a[34];
        }
    }

    public static void e() {
        if (g == null) {
            String string = w.a("/txt/item.txt");
            g = w.a(string, "itemName:", "end", "=");
            f = w.a(string, "itemType:", "end", "=");
            g = w.a(string, "itemTarget:", "end", "=");
            i = w.a(string, "battleItem:", "end", "=");
            p = w.a(string, "itemRunOut:", "end", "=");
            h = w.a(string, "itemRange:", "end", "=");
            h = w.a(string, "itemNote:", "end", "=");
            g = w.a(string, "itemDefaultAni:", "itemDefaultAniEnd");
            h = w.a(string, "itemNote:", "end", "=");
            g = w.a(string, "itemBuyPrice:", "end", "=");
            h = w.a(string, "itemSellPrice:", "end", "=");
            l = w.a(string, "itemIcon:", "end", "=");
        }
    }

    public static void f() {
        if (l == null) {
            s.e();
        }
        if (a == null) {
            int n = l.length;
            a = new Image[n];
            for (int i = 0; i < n; ++i) {
                s.a[i] = w.a(l[i]);
            }
        }
    }

    public static void g() {
        if (i == null) {
            String string = w.a("/txt/item.txt");
            i = w.a(string, "stuffName:", "end", "=");
            j = w.a(string, "stuffIcon:", "end", "=");
            i = w.a(string, "stuffSellPrice:", "end", "=");
        }
    }

    public static void h() {
        if (j == null) {
            s.g();
        }
        if (b == null) {
            int n = j.length;
            b = new Image[n];
            for (n = 0; n < j.length; ++n) {
                s.b[n] = w.a(j[n]);
            }
        }
    }

    public static void a(g[] gArray, int n) {
        int n2 = s.a(n);
        if (n2 > 0) {
            s.e();
            if (g[n - 1].equals("\u8349\u836f")) {
                if (gArray[0].a[3] > 0) {
                    s.b(gArray[0], 200);
                }
            } else if (g[n - 1].equals("\u91d1\u521b\u836f")) {
                if (gArray[0].a[3] > 0) {
                    s.b(gArray[0], 500);
                }
            } else if (g[n - 1].equals("\u4e91\u5c71\u4ed9\u836f")) {
                if (gArray[0].a[3] > 0) {
                    s.b(gArray[0], 1000);
                }
            } else if (g[n - 1].equals("\u7075\u6563")) {
                if (gArray[0].a[3] > 0) {
                    s.c(gArray[0], 200);
                }
            } else if (g[n - 1].equals("\u56de\u5206\u4e0d\u8981\u6563")) {
                if (gArray[0].a[3] > 0) {
                    s.c(gArray[0], 500);
                }
            } else if (g[n - 1].equals("\u7389\u795e\u865a\u6563")) {
                if (gArray[0].a[3] > 0) {
                    s.c(gArray[0], 1000);
                }
            } else if (g[n - 1].equals("\u5927\u8865\u4e38")) {
                if (gArray[0].a[3] > 0) {
                    s.b(gArray[0], 500);
                    s.c(gArray[0], 300);
                }
            } else if (g[n - 1].equals("\u805a\u795e\u4e38")) {
                if (gArray[0].a[3] > 0) {
                    s.b(gArray[0], 1000);
                    s.c(gArray[0], 600);
                }
            } else if (g[n - 1].equals("\u6b63\u6c14\u4e38")) {
                if (gArray[0].a[3] > 0) {
                    s.b(gArray[0], 2000);
                    s.c(gArray[0], 1200);
                }
            } else if (g[n - 1].equals("\u5929\u5c71\u96ea\u83b2")) {
                if (gArray[0].a[3] == 0) {
                    gArray[0].a[3] = gArray[0].a[33] / 5;
                }
            } else if (g[n - 1].equals("\u4e5d\u8f6c\u8fd8\u9b42\u4e39")) {
                if (gArray[0].a[3] == 0) {
                    gArray[0].a[3] = gArray[0].a[33] / 2;
                }
            } else if (g[n - 1].equals("\u6b66\u6797\u79d8\u7c4d")) {
                if (gArray[0].a[3] > 0) {
                    gArray[0].a.b = (short)(gArray[0].a.b + 1);
                }
            } else if (g[n - 1].equals("\u5c11\u6797\u9f99\u722a\u624b")) {
                if (gArray[0].a[3] > 0) {
                    s.a(gArray[0], 7);
                }
            } else if (g[n - 1].equals("\u4e5d\u9633\u795e\u529f")) {
                if (gArray[0].a[3] > 0) {
                    s.a(gArray[0], 3);
                }
            } else if (g[n - 1].equals("\u964d\u9f99\u5341\u516b\u638c")) {
                if (gArray[0].a[3] > 0) {
                    s.a(gArray[0], 8);
                }
            } else if (g[n - 1].equals("\u5317\u51a5\u795e\u529f")) {
                if (gArray[0].a[3] > 0) {
                    s.a(gArray[0], 11);
                }
            } else if (g[n - 1].equals("\u72ee\u5b50\u543c")) {
                if (gArray[0].a[3] > 0) {
                    s.a(gArray[0], 10);
                }
            } else if (g[n - 1].equals("\u6d17\u9ad3\u7ecf")) {
                if (gArray[0].a[3] > 0) {
                    n2 = gArray[0].a[0];
                    gArray[0].a.a = (short)(n2 * 5);
                    gArray[0].a[23] = 0;
                    gArray[0].a[24] = 0;
                    gArray[0].a[25] = 0;
                    gArray[0].a[26] = 0;
                    gArray[0].a[11] = 0;
                    gArray[0].a[12] = 0;
                    gArray[0].a[13] = 0;
                    gArray[0].a[14] = 0;
                    s.c(gArray[0]);
                    s.a(a);
                }
            } else if (g[n - 1].equals("\u6613\u7b4b\u7ecf")) {
                if (gArray[0].a[3] > 0) {
                    int n3;
                    n2 = 0;
                    int n4 = gArray[0].b.length;
                    for (n3 = 0; n3 < n4; ++n3) {
                        int n5 = n2;
                        n2 = gArray[0].b[n3].b;
                        int n6 = 0;
                        for (int i = 1; i <= n2; ++i) {
                            n6 += i;
                        }
                        System.out.println("getSkillKnack totalKnack=" + n6);
                        n2 = (short)(n5 + n6);
                        gArray[0].b[n3].b = 0;
                    }
                    gArray[0].a.b = (short)(gArray[0].a.b + n2);
                    for (n3 = 0; n3 < n4; ++n3) {
                        gArray[0].b[n3].h = 0;
                        gArray[0].b[n3].i = 0;
                        gArray[0].b[n3].j = 0;
                        gArray[0].b[n3].k = 0;
                        gArray[0].b[n3].l = 0;
                        gArray[0].b[n3].m = 0;
                        gArray[0].b[n3].n = 0;
                    }
                }
                s.c(gArray[0]);
                s.a(a);
            } else if (g[n - 1].equals("\u8c79\u80ce\u6613\u7b4b\u4e38")) {
                gArray[0].m = (short)(gArray[0].m + 1);
            }
            if (p[n - 1] == 1) {
                System.out.println("\u9053\u5177" + n + "\u51cf\u5c111\u4e2a");
                s.c(n, 1);
                return;
            }
            System.out.println("\u9053\u5177" + n + "\u4e0d\u51cf\u5c11");
        }
    }

    public static int a(int n) {
        int n2 = 0;
        for (int i = 0; a != null && i < a.length; ++i) {
            if (a[i] == null || a[i][0] != n) continue;
            n2 += a[i][1];
        }
        return n2;
    }

    public static int b(int n) {
        int n2 = 0;
        byte by = (byte)(n / 10);
        for (int i = 0; a[by] != null && i < a[by].length; ++i) {
            if (a[by][i] == null || a[by][i][0] != n) continue;
            n2 += a[by][i][1];
        }
        return n2;
    }

    public static g[] a() {
        Vector<g> vector = new Vector<g>();
        Object[] objectArray = null;
        if (ba.a.a != null && ba.a.a.d != null && w.a(ba.a.a.d, 25)) {
            g[] gArray = new g[1];
            objectArray = gArray;
            gArray[0] = a[0];
            return objectArray;
        }
        for (int i = 0; i < 4 && i < a.length; ++i) {
            if (!s.a[i].g) continue;
            vector.addElement(a[i]);
        }
        if (vector.size() > 0) {
            objectArray = new g[vector.size()];
            vector.copyInto(objectArray);
        }
        return objectArray;
    }

    public static void c(int n) {
        if (n > 0) {
            if (GameMIDlet.self.debug) {
                System.out.println("\u52a0\u5165id=" + n + "\u7684\u7ed3\u675f\u4e8b\u4ef6");
            }
            f = w.b(f, n);
            return;
        }
        if (GameMIDlet.self.debug) {
            System.out.println("\u4e0d\u80fd\u52a0\u5165id=0\u7684\u4e8b\u4ef6");
        }
    }

    public static boolean b(int n) {
        return w.a(f, n);
    }

    public static g a(int n) {
        g g2 = null;
        Object object = w.a("/txt/role.txt");
        if ((object = w.a((String)object, "roleBody:", "end", "="))[n - 1][0].toLowerCase().endsWith(".png") || object[n - 1][0].toLowerCase().endsWith(".ps")) {
            g2 = new g(w.a(object[n - 1][0]), Integer.parseInt(object[n - 1][1]), Integer.parseInt(object[n - 1][2]));
            g2.a(true);
        } else if (object[n - 1][0].toLowerCase().endsWith(".ani")) {
            object = r.a(object[n - 1][0], object[n - 1][1]);
            g2 = new ar();
            ((ar)g2).a((an)object);
            ((ar)g2).a(true);
        } else if (GameMIDlet.self.debug) {
            System.out.println("\u672a\u77e5\u7684\u7cbe\u7075\u56fe\u7247\u683c\u5f0f\uff1a" + object[n - 1][0]);
        }
        g2.c(0);
        g2.t = (byte)n;
        g2.a = b[g2.t - 1];
        g2.b = c[g2.t - 1];
        g2.s = 1;
        s.a(g2);
        return g2;
    }

    public static void a(g g2) {
        String string = w.a("/txt/team.txt");
        if ((string = w.a(string, "role" + g2.t + ":", "role" + g2.t + "end")) != null) {
            g2.g = true;
            Object object = s.a((int)g2.t);
            if (object != null) {
                if (GameMIDlet.self.debug) {
                    System.out.println("\u89d2\u8272" + g2.t + "\u4ece\u5185\u5b58\u6570\u636e\u91cc\u83b7\u5f97");
                }
                g2.a = object.a;
                g2.a = object.a;
                g2.a = object.a;
                g2.b = object.a;
                g2.b = object.b;
                g2.a = object.a;
                ((ar)g2).r = object.c;
                g2.d = w.a(string, "equipTypes");
                g2.d = g2.t == 1 ? (byte)1 : (byte)2;
            } else {
                if (GameMIDlet.self.debug) {
                    System.out.println("\u89d2\u8272" + g2.t + "\u4ece\u6587\u672c\u6570\u636e\u91cc\u83b7\u5f97");
                }
                object = w.a(string, "baseInfo:", "end", "=");
                g2.a = new int[37];
                System.arraycopy(object, 0, g2.a, 0, ((Object)object).length);
                object = string;
                System.out.println("\u52a0\u8f7d\u7cbe\u7075\u7684\u6f5c\u80fd\u70b9\u548c\u6280\u80fd\u70b9");
                f f2 = new f();
                new f().a = w.a((String)object, "\u6f5c\u80fd\u70b9");
                f2.b = w.a((String)object, "\u6280\u80fd\u70b9");
                System.out.println("\u6f5c\u80fd\u70b9=" + f2.a + " \u6280\u80fd\u70b9=" + f2.b);
                g2.a = f2;
                g2.a = w.a(string, "skill:", "end");
                g2.b = s.a(g2);
                g2.b = w.a(string, "equip:", "end", "=");
                object = w.a(string, "equipRank:", "end", "=");
                g2.a = s.a(g2.b, (byte[])object);
                ((ar)g2).r = 1;
                g2.d = w.a(string, "equipTypes");
                g2.d = g2.t == 1 ? (byte)1 : (byte)2;
            }
            if (g2.b == null) {
                g2.b = new byte[8];
            } else if (g2.b.length < 8) {
                object = new byte[8];
                System.arraycopy(g2.b, 0, object, 0, g2.b.length);
                g2.b = null;
                g2.b = (byte[])object;
            }
            if (g2.a == null) {
                g2.a = new z[8];
            } else if (g2.a.length < 8) {
                object = new z[8];
                System.arraycopy(g2.a, 0, object, 0, g2.a.length);
                g2.a = null;
                g2.a = object;
            }
            g2.b = c[g2.t - 1];
            s.a(new g[]{g2});
            return;
        }
        g2.b = c[g2.t - 1];
        g2.g = false;
    }

    public static void b(g g2) {
        if (a == null) {
            a = new g[1];
        } else {
            g[] gArray = new g[a.length + 1];
            System.arraycopy(a, 0, gArray, 0, a.length);
            a = gArray;
        }
        s.a[s.a.length - 1] = g2;
        if (g2.a == null) {
            s.a(g2);
        }
        g2.f();
        g2.a = false;
        if (s.a[0].a == null) {
            a[0].h();
        } else {
            a[0].i();
        }
        s.i();
        if (!w.a(b, (int)g2.t)) {
            b = w.c(b, g2.t);
        }
    }

    public static void d(int n) {
        for (int i = 0; i < a.length; ++i) {
            if (s.a[i].t != n) continue;
            g g2 = a[i];
            i = 0;
            for (int k = 0; a != null && k < a.length; ++k) {
                if (i != 0) {
                    if (k < a.length - 1) {
                        s.a[k] = a[k + 1];
                        continue;
                    }
                    s.a[k] = null;
                    continue;
                }
                if (a[k] != g2 || k >= a.length - 1) continue;
                s.a[k] = a[k + 1];
                i = 1;
            }
            g[] gArray = new g[a.length - 1];
            System.arraycopy(a, 0, gArray, 0, a.length - 1);
            a = gArray;
            gArray[0].i();
            g2.c(0);
            g2.a = ba.a.a;
            g2.b = ba.a.b;
            for (i = 0; i < b.length; ++i) {
                if (b[i] != g2.t) continue;
                b = w.a(b, i);
                break;
            }
            System.gc();
            return;
        }
    }

    public static void i() {
        int n = 0;
        short[][] sArray = s.a[0].a;
        for (int i = 0; a != null && i < a.length; ++i) {
            if (i == 0) continue;
            s.a[i].s = sArray[(n + 1) * f][0];
            s.a[i].t = sArray[(n + 1) * f][1];
            a[i].b(sArray[(n + 1) * f][2]);
            if (ba.a != null && ba.a.a % s.a[i].p == 0) {
                a[i].b();
            }
            ++n;
        }
    }

    public static void j() {
        c = null;
        a = null;
        b = null;
        f = null;
        c = null;
        d = null;
        b = null;
        a = null;
        a = null;
        a = null;
        a = 0;
        a = null;
        e = null;
        a = null;
        d = null;
        e = null;
        a = null;
    }

    public static void a(byte by) {
        byte by2 = (byte)(h / by);
        by = (byte)(h % by);
        byte by3 = 0;
        by3 = by > 0 ? (byte)(by2 + 1) : by2;
        f = by3;
    }

    public static void c(g g2) {
        int n;
        int[] nArray = g2.a;
        g g3 = g2;
        int n2 = 0;
        n2 = 0 + g3.a[19];
        n2 += g3.a[23];
        int n3 = 0;
        for (n = 0; n < 8; ++n) {
            if (g3.a[n] == null) continue;
            n3 += g3.a[n].a();
        }
        n2 += n3;
        g3.a = 0;
        if (g3.b != null) {
            for (n = 0; n < g3.b.length; ++n) {
                g3.a += g3.b[n].b;
                g3.a += g3.b[n].i;
            }
        }
        nArray[27] = n2 += g3.a;
        int[] nArray2 = g2.a;
        g3 = g2;
        n2 = 0;
        n2 = 0 + g3.a[20];
        n2 += g3.a[24];
        n3 = 0;
        for (n = 0; n < 8; ++n) {
            if (g3.a[n] == null) continue;
            n3 += g3.a[n].b();
        }
        n2 += n3;
        g3.b = 0;
        if (g3.b != null) {
            for (n = 0; n < g3.b.length; ++n) {
                g3.b += g3.b[n].e;
                g3.b += g3.b[n].l;
            }
        }
        nArray2[28] = n2 += g3.b;
        int[] nArray3 = g2.a;
        g3 = g2;
        n2 = 0;
        n2 = 0 + g3.a[21];
        n2 += g3.a[25];
        n3 = 0;
        for (n = 0; n < 8; ++n) {
            if (g3.a[n] == null) continue;
            n3 += g3.a[n].c();
        }
        nArray3[29] = n2 += n3;
        int[] nArray4 = g2.a;
        g3 = g2;
        n2 = 0;
        n2 = 0 + g3.a[22];
        n2 += g3.a[26];
        n3 = 0;
        for (n = 0; n < 8; ++n) {
            if (g3.a[n] == null) continue;
            n3 += g3.a[n].d();
        }
        nArray4[30] = n2 += n3;
        g2.a[31] = g2.a();
        g2.a[32] = g2.b();
        g2.a[33] = g2.e();
        g2.a[34] = g2.f();
        if (g2.a[3] > g2.a[33]) {
            g2.a[3] = g2.a[33];
        }
        if (g2.a[5] > g2.a[34]) {
            g2.a[5] = g2.a[34];
        }
        g2.a[35] = g2.c();
        System.out.println("9=" + g2.a[35]);
        g2.a[36] = g2.d();
        System.out.println("10=" + g2.a[36]);
    }

    public static void a(g[] gArray) {
        boolean bl = false;
        for (int i = 0; gArray != null && i < gArray.length; ++i) {
            System.out.println("\u66f4\u65b0\u89d2\u8272" + gArray[i].t + "\u7684\u72b6\u6001\u6570\u636e");
            for (int k = 0; a != null && k < a.length; ++k) {
                if (s.a[k].a != gArray[i].t) continue;
                bl = true;
                s.a[k].a = gArray[i].a;
                s.a[k].a = gArray[i].a;
                s.a[k].a = gArray[i].a;
                s.a[k].a = gArray[i].b;
                s.a[k].b = gArray[i].b;
                s.a[k].a = gArray[i].a;
                s.a[k].c = ((ar)gArray[i]).r;
                s.a[k].c = gArray[i].m;
                System.out.println("\u6280\u80fd=" + w.a(s.a[k].a));
                break;
            }
            if (bl || gArray[i].t <= 0) continue;
            System.out.println("\u6dfb\u52a0\u4eba\u7269");
            if (a == null) {
                a = new ag[1];
            } else {
                ag[] agArray = new ag[a.length + 1];
                System.arraycopy(a, 0, agArray, 0, a.length);
                a = agArray;
            }
            s.a[s.a.length - 1] = new ag();
            s.a[s.a.length - 1].a = gArray[i].t;
            s.a[s.a.length - 1].a = gArray[i].a;
            s.a[s.a.length - 1].a = gArray[i].a;
            s.a[s.a.length - 1].a = gArray[i].a;
            s.a[s.a.length - 1].a = gArray[i].b;
            s.a[s.a.length - 1].b = gArray[i].b;
            s.a[s.a.length - 1].a = gArray[i].a;
            s.a[s.a.length - 1].a = gArray[i].s;
            s.a[s.a.length - 1].b = gArray[i].t;
            s.a[s.a.length - 1].b = gArray[i].a;
            s.a[s.a.length - 1].c = ((ar)gArray[i]).r;
            s.a[s.a.length - 1].c = gArray[i].m;
            System.out.println("\u6280\u80fd=" + w.a(s.a[s.a.length - 1].a));
        }
    }

    public static ag a(int n) {
        for (int i = 0; a != null && i < a.length; ++i) {
            if (s.a[i].a != n) continue;
            return a[i];
        }
        return null;
    }

    public static boolean a(byte by) {
        s.j[by] = 1;
        System.out.println("createRmsInfo flag[rmsNum]=" + j[by]);
        s.k[by] = b[0];
        s.j[by] = (short)s.a[0].a[0];
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        System.out.println("calendar.getTime=" + calendar.getTime());
        int n = calendar.get(1);
        int n2 = calendar.get(2);
        int n3 = calendar.get(5);
        int n4 = calendar.get(11);
        int n5 = calendar.get(12);
        int n6 = calendar.get(13);
        s.k[by] = (short)n;
        s.k[by] = (byte)(n2 + 1);
        s.l[by] = (byte)n3;
        s.m[by] = (byte)n4;
        s.n[by] = (byte)n5;
        s.o[by] = (byte)n6;
        System.out.println("names[rmsNum]=" + k[by]);
        System.out.println("levels[rmsNum]=" + j[by]);
        System.out.println("\u751f\u6210\u65f6\u95f4=" + k[by] + "/" + k[by] + "/" + l[by] + " " + m[by] + ":" + s.n[by] + ":" + o[by]);
        RecordStore recordStore = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            recordStore = RecordStore.openRecordStore((String)h, (boolean)true);
            recordStore.closeRecordStore();
            RecordStore.deleteRecordStore((String)h);
            recordStore = RecordStore.openRecordStore((String)h, (boolean)true);
        }
        catch (RecordStoreFullException recordStoreFullException) {
            RecordStoreFullException recordStoreFullException2 = recordStoreFullException;
            recordStoreFullException.printStackTrace();
        }
        catch (RecordStoreNotFoundException recordStoreNotFoundException) {
            RecordStoreNotFoundException recordStoreNotFoundException2 = recordStoreNotFoundException;
            recordStoreNotFoundException.printStackTrace();
        }
        catch (RecordStoreException recordStoreException) {
            RecordStoreException recordStoreException2 = recordStoreException;
            recordStoreException.printStackTrace();
        }
        byteArrayOutputStream = new ByteArrayOutputStream();
        dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            for (int i = 0; i < 3; ++i) {
                System.out.println("saveRmsInfo flag[" + i + "]=" + j[i]);
                dataOutputStream.writeByte(j[i]);
                if (j[i] != 1) continue;
                dataOutputStream.writeUTF(k[i]);
                dataOutputStream.writeShort(j[i]);
                dataOutputStream.writeShort(k[i]);
                dataOutputStream.writeByte(k[i]);
                dataOutputStream.writeByte(l[i]);
                dataOutputStream.writeByte(m[i]);
                dataOutputStream.writeByte(s.n[i]);
                dataOutputStream.writeByte(o[i]);
                System.out.println("names[" + i + "]=" + k[i]);
                System.out.println("levels[" + i + "]=" + j[i]);
                System.out.println("years[" + i + "]=" + k[i]);
                System.out.println("months[" + i + "]=" + k[i]);
                System.out.println("days[" + i + "]=" + l[i]);
                System.out.println("hours[" + i + "]=" + m[i]);
                System.out.println("minutes[" + i + "]=" + s.n[i]);
                System.out.println("seconds[" + i + "]=" + o[i]);
            }
            byte[] byArray = byteArrayOutputStream.toByteArray();
            recordStore.addRecord(byArray, 0, byArray.length);
            recordStore.closeRecordStore();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return false;
        }
        catch (RecordStoreNotOpenException recordStoreNotOpenException) {
            RecordStoreNotOpenException recordStoreNotOpenException2 = recordStoreNotOpenException;
            recordStoreNotOpenException.printStackTrace();
            return false;
        }
        catch (RecordStoreFullException recordStoreFullException) {
            RecordStoreFullException recordStoreFullException3 = recordStoreFullException;
            recordStoreFullException.printStackTrace();
            return false;
        }
        catch (RecordStoreException recordStoreException) {
            RecordStoreException recordStoreException3 = recordStoreException;
            recordStoreException.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean a() {
        Throwable throwable;
        RecordStore recordStore = null;
        Object object = null;
        object = null;
        object = null;
        try {
            recordStore = RecordStore.openRecordStore((String)h, (boolean)false);
            throwable = recordStore.enumerateRecords(null, null, false);
            if (throwable.hasNextElement()) {
                int n = throwable.nextRecordId();
                object = recordStore.getRecord(n);
            }
        }
        catch (RecordStoreFullException recordStoreFullException) {
            throwable = recordStoreFullException;
            recordStoreFullException.printStackTrace();
        }
        catch (RecordStoreNotFoundException recordStoreNotFoundException) {
            throwable = recordStoreNotFoundException;
            recordStoreNotFoundException.printStackTrace();
        }
        catch (RecordStoreException recordStoreException) {
            throwable = recordStoreException;
            recordStoreException.printStackTrace();
        }
        if (object != null) {
            object = new ByteArrayInputStream((byte[])object);
            object = new DataInputStream((InputStream)object);
            try {
                for (int i = 0; i < 3; ++i) {
                    s.j[i] = ((DataInputStream)object).readByte();
                    System.out.println("loadRmsInfo flag[" + i + "]=" + j[i]);
                    if (j[i] != 1) continue;
                    System.out.println("names[" + i + "]=" + k[i]);
                    System.out.println("levels[" + i + "]=" + j[i]);
                    System.out.println("years[" + i + "]=" + k[i]);
                    System.out.println("months[" + i + "]=" + k[i]);
                    System.out.println("days[" + i + "]=" + l[i]);
                    System.out.println("hours[" + i + "]=" + m[i]);
                    System.out.println("minutes[" + i + "]=" + n[i]);
                    System.out.println("seconds[" + i + "]=" + o[i]);
                    s.k[i] = ((DataInputStream)object).readUTF();
                    s.j[i] = ((DataInputStream)object).readShort();
                    s.k[i] = ((DataInputStream)object).readShort();
                    s.k[i] = ((DataInputStream)object).readByte();
                    s.l[i] = ((DataInputStream)object).readByte();
                    s.m[i] = ((DataInputStream)object).readByte();
                    s.n[i] = ((DataInputStream)object).readByte();
                    s.o[i] = ((DataInputStream)object).readByte();
                }
                recordStore.closeRecordStore();
            }
            catch (IOException iOException) {
                throwable = iOException;
                iOException.printStackTrace();
                return false;
            }
            catch (RecordStoreNotOpenException recordStoreNotOpenException) {
                throwable = recordStoreNotOpenException;
                recordStoreNotOpenException.printStackTrace();
                return false;
            }
            catch (RecordStoreFullException recordStoreFullException) {
                throwable = recordStoreFullException;
                recordStoreFullException.printStackTrace();
                return false;
            }
            catch (RecordStoreException recordStoreException) {
                throwable = recordStoreException;
                recordStoreException.printStackTrace();
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    public static boolean b(byte by) {
        s.a(a);
        RecordStore recordStore = null;
        Object object = null;
        DataOutputStream dataOutputStream = null;
        object = i;
        switch (by) {
            case 0: {
                object = i;
                break;
            }
            case 1: {
                object = j;
                break;
            }
            case 2: {
                object = k;
            }
        }
        System.out.println("save rmsName=" + (String)object);
        try {
            recordStore = RecordStore.openRecordStore((String)object, (boolean)true);
            recordStore.closeRecordStore();
            RecordStore.deleteRecordStore((String)object);
            recordStore = RecordStore.openRecordStore((String)object, (boolean)true);
        }
        catch (RecordStoreFullException recordStoreFullException) {
            RecordStoreFullException recordStoreFullException2 = recordStoreFullException;
            recordStoreFullException.printStackTrace();
        }
        catch (RecordStoreNotFoundException recordStoreNotFoundException) {
            RecordStoreNotFoundException recordStoreNotFoundException2 = recordStoreNotFoundException;
            recordStoreNotFoundException.printStackTrace();
        }
        catch (RecordStoreException recordStoreException) {
            RecordStoreException recordStoreException2 = recordStoreException;
            recordStoreException.printStackTrace();
        }
        object = new ByteArrayOutputStream();
        dataOutputStream = new DataOutputStream((OutputStream)object);
        try {
            boolean bl;
            int n;
            int n2;
            dataOutputStream.writeByte(a);
            dataOutputStream.writeByte(c);
            dataOutputStream.writeByte(GameMIDlet.self.playMusic ? 1 : 0);
            int n3 = c != null ? c.length : 0;
            dataOutputStream.writeByte(n3);
            if (n3 > 0) {
                ((OutputStream)dataOutputStream).write(c);
            }
            n3 = a != null ? a.length : 0;
            dataOutputStream.writeByte(n3);
            if (n3 > 0) {
                for (n2 = 0; n2 < n3; ++n2) {
                    dataOutputStream.writeShort(a[n2]);
                }
            }
            n2 = b != null ? b.length : 0;
            dataOutputStream.writeByte(n2);
            if (n2 > 0) {
                for (n3 = 0; n3 < n2; ++n3) {
                    dataOutputStream.writeShort(b[n3]);
                }
            }
            n3 = f != null ? f.length : 0;
            dataOutputStream.writeByte(n3);
            if (n3 > 0) {
                for (n2 = 0; n2 < n3; ++n2) {
                    dataOutputStream.writeShort(f[n2]);
                }
            }
            n2 = c != null ? c.length : 0;
            dataOutputStream.writeByte(n2);
            if (n2 > 0) {
                for (n3 = 0; n3 < n2; ++n3) {
                    dataOutputStream.writeShort(c[n3]);
                }
            }
            n3 = d != null ? d.length : 0;
            dataOutputStream.writeByte(n3);
            if (n3 > 0) {
                for (n2 = 0; n2 < n3; ++n2) {
                    dataOutputStream.writeShort(d[n2]);
                }
            }
            n2 = d != null ? d.length : 0;
            dataOutputStream.writeByte(n2);
            if (n2 > 0) {
                for (n3 = 0; n3 < n2; ++n3) {
                    dataOutputStream.writeByte(d[n3]);
                }
            }
            n3 = e != null ? e.length : 0;
            dataOutputStream.writeByte(n3);
            if (n3 > 0) {
                for (n2 = 0; n2 < n3; ++n2) {
                    dataOutputStream.writeByte(e[n2]);
                }
            }
            dataOutputStream.writeByte(b.length);
            ((OutputStream)dataOutputStream).write(b);
            if (a != null) {
                dataOutputStream.writeByte(a.length);
                for (n2 = 0; n2 < a.length; ++n2) {
                    dataOutputStream.writeByte(a[n2][0]);
                    dataOutputStream.writeShort(a[n2][1]);
                }
            } else {
                dataOutputStream.writeByte(0);
            }
            if (a != null) {
                dataOutputStream.writeByte(a.length);
                for (n2 = 0; n2 < a.length; ++n2) {
                    if (a[n2] != null) {
                        dataOutputStream.writeByte(a[n2].length);
                        for (n3 = 0; n3 < a[n2].length; ++n3) {
                            dataOutputStream.writeByte(a[n2][n3][0]);
                            dataOutputStream.writeByte(a[n2][n3][1]);
                        }
                        continue;
                    }
                    dataOutputStream.writeByte(0);
                }
            } else {
                dataOutputStream.writeByte(0);
            }
            dataOutputStream.writeBoolean(z.b);
            for (n2 = 0; n2 < 8; ++n2) {
                n3 = a[n2] != null ? a[n2].length : 0;
                dataOutputStream.writeShort(n3);
                if (n3 <= 0) continue;
                for (n = 0; n < n3; ++n) {
                    bl = a[n2][n];
                    dataOutputStream.writeByte(bl ? 1 : 0);
                    if (bl <= false) continue;
                    dataOutputStream.writeByte(s.a[n2][n].e);
                    bl = s.a[n2][n].a;
                    dataOutputStream.writeBoolean(bl);
                    if (!bl) continue;
                    dataOutputStream.writeByte(s.a[n2][n].a);
                    dataOutputStream.writeByte(s.a[n2][n].b);
                    dataOutputStream.writeShort(s.a[n2][n].b);
                    dataOutputStream.writeShort(s.a[n2][n].c);
                    dataOutputStream.writeShort(s.a[n2][n].d);
                    dataOutputStream.writeShort(s.a[n2][n].e);
                    dataOutputStream.writeShort(s.a[n2][n].f);
                    dataOutputStream.writeShort(s.a[n2][n].g);
                    dataOutputStream.writeShort(s.a[n2][n].h);
                    dataOutputStream.writeShort(s.a[n2][n].i);
                    dataOutputStream.writeShort(s.a[n2][n].j);
                    dataOutputStream.writeShort(s.a[n2][n].k);
                    dataOutputStream.writeShort(s.a[n2][n].l);
                    dataOutputStream.writeShort(s.a[n2][n].m);
                    dataOutputStream.writeShort(s.a[n2][n].n);
                    dataOutputStream.writeShort(s.a[n2][n].o);
                    dataOutputStream.writeShort(s.a[n2][n].p);
                    dataOutputStream.writeShort(s.a[n2][n].q);
                    dataOutputStream.writeShort(s.a[n2][n].r);
                    dataOutputStream.writeShort(s.a[n2][n].s);
                    dataOutputStream.writeShort(s.a[n2][n].t);
                    dataOutputStream.writeShort(s.a[n2][n].u);
                    dataOutputStream.writeShort(s.a[n2][n].v);
                }
            }
            if (a < 0) {
                a = 99999;
            }
            dataOutputStream.writeInt(a);
            dataOutputStream.writeByte(a != null ? a.length : 0);
            for (n2 = 0; a != null && n2 < a.length; ++n2) {
                dataOutputStream.writeByte(s.a[n2].a);
                dataOutputStream.writeByte(s.a[n2].a.length);
                for (n3 = 0; n3 < s.a[n2].a.length; ++n3) {
                    dataOutputStream.writeInt(s.a[n2].a[n3]);
                }
                dataOutputStream.writeShort(s.a[n2].a.a);
                dataOutputStream.writeShort(s.a[n2].a.b);
                if (s.a[n2].a != null) {
                    dataOutputStream.writeByte(s.a[n2].a.length);
                    for (n3 = 0; n3 < s.a[n2].a.length; ++n3) {
                        dataOutputStream.writeByte(s.a[n2].a[n3]);
                        dataOutputStream.writeByte(s.a[n2].a[n3].b);
                        dataOutputStream.writeByte(s.a[n2].a[n3].c);
                        dataOutputStream.writeByte(s.a[n2].a[n3].d);
                        dataOutputStream.writeByte(s.a[n2].a[n3].e);
                        dataOutputStream.writeShort(s.a[n2].a[n3].a);
                        dataOutputStream.writeShort(s.a[n2].a[n3].b);
                        dataOutputStream.writeShort(s.a[n2].a[n3].c);
                        dataOutputStream.writeShort(s.a[n2].a[n3].d);
                        dataOutputStream.writeShort(s.a[n2].a[n3].e);
                        dataOutputStream.writeShort(s.a[n2].a[n3].f);
                        dataOutputStream.writeShort(s.a[n2].a[n3].g);
                        dataOutputStream.writeShort(s.a[n2].a[n3].h);
                        dataOutputStream.writeShort(s.a[n2].a[n3].i);
                        dataOutputStream.writeShort(s.a[n2].a[n3].j);
                        dataOutputStream.writeShort(s.a[n2].a[n3].k);
                        dataOutputStream.writeShort(s.a[n2].a[n3].l);
                        dataOutputStream.writeShort(s.a[n2].a[n3].m);
                        dataOutputStream.writeShort(s.a[n2].a[n3].n);
                    }
                } else {
                    dataOutputStream.writeByte(0);
                }
                if (s.a[n2].b != null) {
                    dataOutputStream.writeShort(s.a[n2].b.length);
                    for (n3 = 0; n3 < s.a[n2].b.length; ++n3) {
                        n = s.a[n2].b[n3];
                        dataOutputStream.writeByte(n);
                        if (n <= 0) continue;
                        if (s.a[n2].a == null) {
                            System.out.println("roleDatas[i].equip==null");
                        }
                        dataOutputStream.writeByte(s.a[n2].a[n3].e);
                        bl = s.a[n2].a[n3].a;
                        dataOutputStream.writeBoolean(bl);
                        if (!bl) continue;
                        dataOutputStream.writeByte(s.a[n2].a[n3].a);
                        dataOutputStream.writeByte(s.a[n2].a[n3].b);
                        dataOutputStream.writeShort(s.a[n2].a[n3].b);
                        dataOutputStream.writeShort(s.a[n2].a[n3].c);
                        dataOutputStream.writeShort(s.a[n2].a[n3].d);
                        dataOutputStream.writeShort(s.a[n2].a[n3].e);
                        dataOutputStream.writeShort(s.a[n2].a[n3].f);
                        dataOutputStream.writeShort(s.a[n2].a[n3].g);
                        dataOutputStream.writeShort(s.a[n2].a[n3].h);
                        dataOutputStream.writeShort(s.a[n2].a[n3].i);
                        dataOutputStream.writeShort(s.a[n2].a[n3].j);
                        dataOutputStream.writeShort(s.a[n2].a[n3].k);
                        dataOutputStream.writeShort(s.a[n2].a[n3].l);
                        dataOutputStream.writeShort(s.a[n2].a[n3].m);
                        dataOutputStream.writeShort(s.a[n2].a[n3].n);
                        dataOutputStream.writeShort(s.a[n2].a[n3].o);
                        dataOutputStream.writeShort(s.a[n2].a[n3].p);
                        dataOutputStream.writeShort(s.a[n2].a[n3].q);
                        dataOutputStream.writeShort(s.a[n2].a[n3].r);
                        dataOutputStream.writeShort(s.a[n2].a[n3].s);
                        dataOutputStream.writeShort(s.a[n2].a[n3].t);
                        dataOutputStream.writeShort(s.a[n2].a[n3].u);
                        dataOutputStream.writeShort(s.a[n2].a[n3].v);
                    }
                } else {
                    dataOutputStream.writeShort(0);
                }
                if (s.a[n2].a == s.a[0].t) {
                    s.a[n2].a = s.a[0].s;
                    s.a[n2].b = s.a[0].t;
                    s.a[n2].b = s.a[0].a;
                }
                dataOutputStream.writeShort(s.a[n2].a);
                dataOutputStream.writeShort(s.a[n2].b);
                dataOutputStream.writeByte(s.a[n2].b);
                dataOutputStream.writeByte(s.a[n2].c);
                dataOutputStream.writeShort(s.a[n2].c);
            }
            dataOutputStream.writeShort(c);
            dataOutputStream.writeByte(g);
            dataOutputStream.writeBoolean(b);
            dataOutputStream.writeUTF(b[0]);
            byte[] byArray = ((ByteArrayOutputStream)object).toByteArray();
            recordStore.addRecord(byArray, 0, byArray.length);
            recordStore.closeRecordStore();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return false;
        }
        catch (RecordStoreNotOpenException recordStoreNotOpenException) {
            b = false;
            recordStoreNotOpenException.printStackTrace();
            return false;
        }
        catch (RecordStoreFullException recordStoreFullException) {
            RecordStoreFullException recordStoreFullException3 = recordStoreFullException;
            recordStoreFullException.printStackTrace();
            return false;
        }
        catch (RecordStoreException recordStoreException) {
            RecordStoreException recordStoreException3 = recordStoreException;
            recordStoreException.printStackTrace();
            return false;
        }
        return true;
    }

    private static boolean a(String string) {
        int n;
        Throwable throwable;
        System.out.println("load storeName=" + string);
        RecordStore recordStore = null;
        Object object = null;
        object = null;
        object = null;
        try {
            recordStore = RecordStore.openRecordStore((String)string, (boolean)false);
            throwable = recordStore.enumerateRecords(null, null, false);
            if (throwable.hasNextElement()) {
                n = throwable.nextRecordId();
                object = recordStore.getRecord(n);
            }
        }
        catch (RecordStoreFullException recordStoreFullException) {
            throwable = recordStoreFullException;
            recordStoreFullException.printStackTrace();
        }
        catch (RecordStoreNotFoundException recordStoreNotFoundException) {
            throwable = recordStoreNotFoundException;
            recordStoreNotFoundException.printStackTrace();
        }
        catch (RecordStoreException recordStoreException) {
            throwable = recordStoreException;
            recordStoreException.printStackTrace();
        }
        if (object != null) {
            object = new ByteArrayInputStream((byte[])object);
            object = new DataInputStream((InputStream)object);
            try {
                int n2;
                int n3;
                int n4;
                a = ((DataInputStream)object).readByte();
                c = ((DataInputStream)object).readByte();
                GameMIDlet.self.playMusic = ((DataInputStream)object).readByte() == 1;
                int n5 = ((DataInputStream)object).readByte();
                if (n5 > 0) {
                    c = new byte[n5];
                    for (n = 0; n < n5; ++n) {
                        s.c[n] = ((DataInputStream)object).readByte();
                    }
                }
                byte by = ((DataInputStream)object).readByte();
                n = by;
                if (by > 0) {
                    a = new short[n];
                    for (n5 = 0; n5 < n; ++n5) {
                        s.a[n5] = ((DataInputStream)object).readShort();
                    }
                }
                if ((n5 = ((DataInputStream)object).readByte()) > 0) {
                    b = new short[n5];
                    for (n = 0; n < n5; ++n) {
                        s.b[n] = ((DataInputStream)object).readShort();
                    }
                }
                byte by2 = ((DataInputStream)object).readByte();
                n = by2;
                if (by2 > 0) {
                    f = new short[n];
                    for (n5 = 0; n5 < n; ++n5) {
                        s.f[n5] = ((DataInputStream)object).readShort();
                    }
                }
                byte by3 = ((DataInputStream)object).readByte();
                n5 = by3;
                if (by3 > 0) {
                    c = new short[n5];
                    for (n = 0; n < n5; ++n) {
                        s.c[n] = ((DataInputStream)object).readShort();
                    }
                }
                byte by4 = ((DataInputStream)object).readByte();
                n = by4;
                if (by4 > 0) {
                    d = new short[n];
                    for (n5 = 0; n5 < n; ++n5) {
                        s.d[n5] = ((DataInputStream)object).readShort();
                    }
                }
                byte by5 = ((DataInputStream)object).readByte();
                n5 = by5;
                if (by5 > 0) {
                    d = new byte[n5];
                    for (n = 0; n < n5; ++n) {
                        s.d[n] = ((DataInputStream)object).readByte();
                    }
                }
                byte by6 = ((DataInputStream)object).readByte();
                n = by6;
                if (by6 > 0) {
                    e = new byte[n];
                    for (n5 = 0; n5 < n; ++n5) {
                        s.e[n5] = ((DataInputStream)object).readByte();
                    }
                }
                byte by7 = ((DataInputStream)object).readByte();
                n5 = by7;
                if (by7 > 0) {
                    b = new byte[n5];
                    for (n5 = 0; n5 < b.length; ++n5) {
                        s.b[n5] = ((DataInputStream)object).readByte();
                    }
                }
                byte by8 = ((DataInputStream)object).readByte();
                n5 = by8;
                if (by8 > 0) {
                    a = new short[n5][2];
                    for (n5 = 0; n5 < a.length; ++n5) {
                        s.a[n5][0] = ((DataInputStream)object).readByte();
                        s.a[n5][1] = ((DataInputStream)object).readShort();
                    }
                }
                byte by9 = ((DataInputStream)object).readByte();
                n5 = by9;
                if (by9 > 0) {
                    a = new byte[n5][][];
                    for (n = 0; n < n5; ++n) {
                        n4 = ((DataInputStream)object).readByte();
                        if (n4 <= 0) continue;
                        s.a[n] = new byte[n4][2];
                        for (n3 = 0; n3 < n4; ++n3) {
                            s.a[n][n3][0] = ((DataInputStream)object).readByte();
                            s.a[n][n3][1] = ((DataInputStream)object).readByte();
                        }
                    }
                }
                z.b = ((DataInputStream)object).readBoolean();
                a = new byte[8][];
                a = new z[8][];
                for (n = 0; n < 8; ++n) {
                    n4 = ((DataInputStream)object).readShort();
                    if (n4 <= 0) continue;
                    s.a[n] = new byte[n4];
                    s.a[n] = new z[n4];
                    for (n3 = 0; n3 < n4; ++n3) {
                        s.a[n][n3] = n5 = (int)((DataInputStream)object).readByte();
                        if (n5 <= 0) continue;
                        n2 = ((DataInputStream)object).readByte();
                        s.a[n][n3] = new z(n5, n2);
                        n5 = ((DataInputStream)object).readBoolean() ? 1 : 0;
                        s.a[n][n3].a = n5;
                        if (n5 == 0) continue;
                        s.a[n][n3].a = ((DataInputStream)object).readByte();
                        s.a[n][n3].b = ((DataInputStream)object).readByte();
                        s.a[n][n3].b = ((DataInputStream)object).readShort();
                        s.a[n][n3].c = ((DataInputStream)object).readShort();
                        s.a[n][n3].d = ((DataInputStream)object).readShort();
                        s.a[n][n3].e = ((DataInputStream)object).readShort();
                        s.a[n][n3].f = ((DataInputStream)object).readShort();
                        s.a[n][n3].g = ((DataInputStream)object).readShort();
                        s.a[n][n3].h = ((DataInputStream)object).readShort();
                        s.a[n][n3].i = ((DataInputStream)object).readShort();
                        s.a[n][n3].j = ((DataInputStream)object).readShort();
                        s.a[n][n3].k = ((DataInputStream)object).readShort();
                        s.a[n][n3].l = ((DataInputStream)object).readShort();
                        s.a[n][n3].m = ((DataInputStream)object).readShort();
                        s.a[n][n3].n = ((DataInputStream)object).readShort();
                        s.a[n][n3].o = ((DataInputStream)object).readShort();
                        s.a[n][n3].p = ((DataInputStream)object).readShort();
                        s.a[n][n3].q = ((DataInputStream)object).readShort();
                        s.a[n][n3].r = ((DataInputStream)object).readShort();
                        s.a[n][n3].s = ((DataInputStream)object).readShort();
                        s.a[n][n3].t = ((DataInputStream)object).readShort();
                        s.a[n][n3].u = ((DataInputStream)object).readShort();
                        s.a[n][n3].v = ((DataInputStream)object).readShort();
                    }
                }
                a = ((DataInputStream)object).readInt();
                if (a < 0) {
                    a = 99999;
                }
                byte by10 = ((DataInputStream)object).readByte();
                n = by10;
                if (by10 > 0) {
                    a = new ag[n];
                    for (n4 = 0; a != null && n4 < a.length; ++n4) {
                        s.a[n4] = new ag();
                        s.a[n4].a = ((DataInputStream)object).readByte();
                        byte by11 = ((DataInputStream)object).readByte();
                        n3 = by11;
                        if (by11 > 0) {
                            s.a[n4].a = new int[n3];
                            for (n5 = 0; n5 < n3; ++n5) {
                                s.a[n4].a[n5] = ((DataInputStream)object).readInt();
                            }
                        }
                        s.a[n4].a = new f();
                        s.a[n4].a.a = ((DataInputStream)object).readShort();
                        s.a[n4].a.b = ((DataInputStream)object).readShort();
                        byte by12 = ((DataInputStream)object).readByte();
                        n5 = by12;
                        if (by12 > 0) {
                            s.a[n4].a = new byte[n5];
                            s.a[n4].a = new c[n5];
                            for (n2 = 0; n2 < s.a[n4].a.length; ++n2) {
                                s.a[n4].a[n2] = n5 = (int)((DataInputStream)object).readByte();
                                s.a[n4].a[n2] = new c(n5);
                                s.a[n4].a[n2].b = ((DataInputStream)object).readByte();
                                s.a[n4].a[n2].c = ((DataInputStream)object).readByte();
                                s.a[n4].a[n2].d = ((DataInputStream)object).readByte();
                                s.a[n4].a[n2].e = ((DataInputStream)object).readByte();
                                s.a[n4].a[n2].a = ((DataInputStream)object).readShort();
                                s.a[n4].a[n2].b = ((DataInputStream)object).readShort();
                                s.a[n4].a[n2].c = ((DataInputStream)object).readShort();
                                s.a[n4].a[n2].d = ((DataInputStream)object).readShort();
                                s.a[n4].a[n2].e = ((DataInputStream)object).readShort();
                                s.a[n4].a[n2].f = ((DataInputStream)object).readShort();
                                s.a[n4].a[n2].g = ((DataInputStream)object).readShort();
                                s.a[n4].a[n2].h = ((DataInputStream)object).readShort();
                                s.a[n4].a[n2].i = ((DataInputStream)object).readShort();
                                s.a[n4].a[n2].j = ((DataInputStream)object).readShort();
                                s.a[n4].a[n2].k = ((DataInputStream)object).readShort();
                                s.a[n4].a[n2].l = ((DataInputStream)object).readShort();
                                s.a[n4].a[n2].m = ((DataInputStream)object).readShort();
                                s.a[n4].a[n2].n = ((DataInputStream)object).readShort();
                            }
                        }
                        if ((n2 = ((DataInputStream)object).readShort()) > 0) {
                            s.a[n4].b = new byte[n2];
                            s.a[n4].a = new z[n2];
                            for (n5 = 0; n5 < s.a[n4].b.length; ++n5) {
                                s.a[n4].b[n5] = n = (int)((DataInputStream)object).readByte();
                                if (n <= 0) continue;
                                n3 = ((DataInputStream)object).readByte();
                                s.a[n4].a[n5] = new z(n, n3);
                                n = ((DataInputStream)object).readBoolean() ? 1 : 0;
                                switch (n3) {
                                    case 1: {
                                        s.a[n4].a[n5].a = 0xFFFFFF;
                                        break;
                                    }
                                    case 2: {
                                        s.a[n4].a[n5].a = 255;
                                        break;
                                    }
                                    case 3: {
                                        s.a[n4].a[n5].a = 65280;
                                        break;
                                    }
                                    default: {
                                        System.out.println("\u8f7d\u5165\u88c5\u5907\u989c\u8272\u65f6\u51fa\u9519");
                                    }
                                }
                                s.a[n4].a[n5].a = n;
                                if (n == 0) continue;
                                s.a[n4].a[n5].a = ((DataInputStream)object).readByte();
                                s.a[n4].a[n5].b = ((DataInputStream)object).readByte();
                                s.a[n4].a[n5].b = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].c = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].d = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].e = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].f = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].g = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].h = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].i = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].j = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].k = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].l = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].m = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].n = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].o = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].p = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].q = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].r = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].s = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].t = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].u = ((DataInputStream)object).readShort();
                                s.a[n4].a[n5].v = ((DataInputStream)object).readShort();
                            }
                        }
                        s.a[n4].a = ((DataInputStream)object).readShort();
                        s.a[n4].b = ((DataInputStream)object).readShort();
                        s.a[n4].b = ((DataInputStream)object).readByte();
                        s.a[n4].c = ((DataInputStream)object).readByte();
                        s.a[n4].c = ((DataInputStream)object).readShort();
                    }
                }
                c = ((DataInputStream)object).readShort();
                g = ((DataInputStream)object).readByte();
                b = ((DataInputStream)object).readBoolean();
                s.b[0] = ((DataInputStream)object).readUTF();
                recordStore.closeRecordStore();
            }
            catch (IOException iOException) {
                throwable = iOException;
                iOException.printStackTrace();
                return false;
            }
            catch (RecordStoreNotOpenException recordStoreNotOpenException) {
                throwable = recordStoreNotOpenException;
                recordStoreNotOpenException.printStackTrace();
                return false;
            }
            catch (RecordStoreFullException recordStoreFullException) {
                throwable = recordStoreFullException;
                recordStoreFullException.printStackTrace();
                return false;
            }
            catch (RecordStoreException recordStoreException) {
                throwable = recordStoreException;
                recordStoreException.printStackTrace();
                return false;
            }
        } else {
            return false;
        }
        if (!string.equals(l)) {
            c = true;
        }
        return true;
    }

    public static void k() {
        a /= 2;
        for (int i = 0; a != null && i < a.length; ++i) {
            if (s.a[i].a == null) continue;
            s.a[i].a[3] = s.a[i].a[33];
            s.a[i].a[5] = s.a[i].a[34];
        }
    }

    public static boolean a(int n, int n2) {
        int n3;
        for (n3 = 0; a != null && n3 < a.length; ++n3) {
            for (int i = 0; a[n3] != null && i < a[n3].length; ++i) {
                if (a[n3][i] != n2) continue;
                return true;
            }
        }
        for (n3 = 0; n3 < a.length; ++n3) {
            if (s.a[n3].t != n || !w.a(s.a[n3].b, n2)) continue;
            return true;
        }
        return false;
    }

    public static boolean c(int n) {
        return w.a(s.a[0].a, n);
    }

    private static c[] a(g g2) {
        System.out.println("\u52a0\u8f7d\u7cbe\u7075\u7684\u5b9e\u9645\u6280\u80fd\u6570\u636e");
        if (g2.a != null) {
            c[] cArray = new c[g2.a.length];
            for (int i = 0; i < g2.a.length; ++i) {
                cArray[i] = new c(g2.a[i]);
            }
            return cArray;
        }
        return null;
    }

    public static void d(g g2) {
        System.out.println("\u8865\u5145\u52a0\u8f7d\u5b9e\u9645\u6280\u80fd\u7684\u4e00\u4e9b\u4fe1\u606f");
        if (g2.b != null) {
            for (int i = 0; i < g2.b.length; ++i) {
                g2.b[i].a(g2);
            }
        }
    }

    private static z[] a(byte[] byArray, byte[] byArray2) {
        System.out.println("\u52a0\u8f7d\u7cbe\u7075\u7684\u5b9e\u9645\u88c5\u5907\u6570\u636e");
        if (byArray == null) {
            System.out.println("\u8be5\u7cbe\u7075\u88c5\u5907\u4e3anull");
            return null;
        }
        if (byArray.length != byArray2.length) {
            System.out.println("\u88c5\u5907\u6570\u636e\u6587\u4ef6\u914d\u7f6e\u51fa\u9519!");
            return null;
        }
        if (byArray != null) {
            z[] zArray = new z[byArray.length];
            for (int i = 0; i < byArray.length; ++i) {
                if (byArray[i] <= 0) continue;
                zArray[i] = new z(byArray[i], byArray2[i]);
            }
            return zArray;
        }
        return null;
    }

    public static int[] a(int n) {
        if (n < 0) {
            System.out.println("getEquipIdFromBag \u7269\u54c1\u5728\u7269\u54c1\u680f\u4e2d\u7684\u5e8f\u53f7\u4e0d\u80fd\u4e3a\u8d1f\u6570");
        }
        if (a == null) {
            int[] nArray = new int[]{-1, -1};
            return nArray;
        }
        int[] nArray = new int[]{0, 0};
        byte by = a[0] != null ? (byte)a[0].length : (byte)0;
        byte by2 = a[1] != null ? (byte)a[1].length : (byte)0;
        byte by3 = a[2] != null ? (byte)a[2].length : (byte)0;
        byte by4 = a[3] != null ? (byte)a[3].length : (byte)0;
        byte by5 = a[4] != null ? (byte)a[4].length : (byte)0;
        byte by6 = a[5] != null ? (byte)a[5].length : (byte)0;
        byte by7 = a[6] != null ? (byte)a[6].length : (byte)0;
        byte by8 = a[7] != null ? (byte)a[7].length : (byte)0;
        if (n < by) {
            nArray[0] = 0;
            nArray[1] = n;
        } else if (n < by + by2) {
            nArray[0] = 1;
            nArray[1] = n - by;
        } else if (n < by + by2 + by3) {
            nArray[0] = 2;
            nArray[1] = n - by - by2;
        } else if (n < by + by2 + by3 + by4) {
            nArray[0] = 3;
            nArray[1] = n - by - by2 - by3;
        } else if (n < by + by2 + by3 + by4 + by5) {
            nArray[0] = 4;
            nArray[1] = n - by - by2 - by3 - by4;
        } else if (n < by + by2 + by3 + by4 + by5 + by6) {
            nArray[0] = 5;
            nArray[1] = n - by - by2 - by3 - by4 - by5;
        } else if (n < by + by2 + by3 + by4 + by5 + by6 + by7) {
            nArray[0] = 6;
            nArray[1] = n - by - by2 - by3 - by4 - by5 - by6;
        } else if (n < by + by2 + by3 + by4 + by5 + by6 + by7 + by8) {
            nArray[0] = 7;
            nArray[1] = n - by - by2 - by3 - by4 - by5 - by6 - by7;
        } else {
            nArray[0] = -1;
            nArray[1] = -1;
            System.out.println("\u6839\u636e\u88c5\u5907\u5728\u7269\u54c1\u680f\u4e2d\u7684\u6392\u5217\u53f7\u6765\u83b7\u53d6\u88c5\u5907\u7684id\u51fa\u9519\uff01");
        }
        return nArray;
    }

    public static int[] b(int n) {
        if (n < 0) {
            System.out.println("getStuffPosFromStuff \u7269\u54c1\u5728\u7269\u54c1\u680f\u4e2d\u7684\u5e8f\u53f7\u4e0d\u80fd\u4e3a\u8d1f\u6570");
        }
        int[] nArray = new int[]{0, 0};
        byte by = a[0] != null ? (byte)a[0].length : (byte)0;
        byte by2 = a[1] != null ? (byte)a[1].length : (byte)0;
        byte by3 = a[2] != null ? (byte)a[2].length : (byte)0;
        if (n < by) {
            nArray[0] = 0;
            nArray[1] = n;
        } else if (n < by + by2) {
            nArray[0] = 1;
            nArray[1] = n - by;
        } else if (n < by + by2 + by3) {
            nArray[0] = 2;
            nArray[1] = n - by - by2;
        } else {
            nArray[0] = -1;
            nArray[1] = -1;
            System.out.println("\u6839\u636e\u88c5\u5907\u5728\u7269\u54c1\u680f\u4e2d\u7684\u6392\u5217\u53f7\u6765\u83b7\u53d6\u5347\u7ea7\u6750\u6599\u7684\u4f4d\u7f6e\u4fe1\u606f\u51fa\u9519\uff01");
        }
        return nArray;
    }

    static {
        b = false;
        h = (byte)15;
        f = 0;
        d = null;
        e = null;
        f = null;
        b = 100;
        c = 100;
        d = 100;
        f = false;
        h = "saveInfo";
        i = "yitiantulong1";
        j = "yitiantulong2";
        k = "yitiantulong3";
        l = "yitiantulongWin";
        j = new byte[]{0, 0, 0};
        k = new String[]{null, null, null};
        j = new short[]{1, 1, 1};
        k = new short[]{1, 1, 1};
        k = new byte[]{1, 1, 1};
        l = new byte[]{1, 1, 1};
        m = new byte[]{1, 1, 1};
        n = new byte[]{1, 1, 1};
        o = new byte[]{1, 1, 1};
        g = false;
    }
}
