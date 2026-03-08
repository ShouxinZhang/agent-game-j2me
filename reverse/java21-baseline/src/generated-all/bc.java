/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.wireless.messaging.MessageConnection
 *  javax.wireless.messaging.TextMessage
 */
import java.util.Random;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bc
implements Runnable {
    private String c;
    private String d;
    private Thread a = null;
    public static int a;
    public static String[] a;
    public static String a;
    public static String b;
    public static boolean a;
    private static String e;

    public final void a(int n) {
        a = true;
        if (a == null) {
            a = ap.b;
            a = ap.d;
            b = ap.e;
        }
        this.d = a[n];
        this.c = a;
        System.out.println("content=" + this.d);
        System.out.println("tel_number=" + this.c);
        this.a = new Thread(this);
        this.a.start();
    }

    public final void run() {
        e = "0";
        try {
            String string;
            String string2;
            String string3;
            String string4 = string3 = "sms://" + ((bc)object3).c;
            String string5 = null;
            Object object = null;
            XConnection xConnection = new XConnection();
            if (string4.startsWith("sms")) {
                object = xConnection;
            } else {
                String string6 = string4;
                string2 = null;
                XConnection xConnection2 = null;
                XConnection xConnection3 = new XConnection();
                if (string6.startsWith("sms")) {
                    xConnection2 = xConnection3;
                } else {
                    String string7 = string6;
                    string = null;
                    XConnection xConnection4 = null;
                    XConnection xConnection5 = new XConnection();
                    xConnection4 = string7.startsWith("sms") ? xConnection5 : Connector.open((String)string7);
                    xConnection2 = xConnection4;
                }
                object = xConnection2;
            }
            string3 = (MessageConnection)object;
            e = e + "1";
            string4 = "text";
            string5 = string3;
            object = null;
            object = new XMessage();
            Object object2 = (TextMessage)object;
            e = e + "2";
            object2.setPayloadText(((bc)object3).d);
            e = e + "3";
            string4 = object2;
            string5 = string3;
            System.out.println("hardtodie cracked");
            e = e + "4";
            string5 = string3;
            if (string5 != null && (string2 = string5) != null && (string = string2) != null) {
                string.close();
            }
            e = e + "5";
            if (a == 1) {
                if (ba.a.a != null) {
                    u.b = (short)2;
                    u.c = (short)(u.c + ba.a.a.a);
                }
            } else if (a == 2) {
                if (ba.a.a != null) {
                    u.d = (short)2;
                    u.e = (short)(u.e + ba.a.a.a);
                }
            } else if (a == 4) {
                if (ba.a.a != null) {
                    s.a += ba.a.a.a;
                    ba.a.a.a = 0;
                }
            } else if (a == 3) {
                if (ba.a.a != null) {
                    u.c = true;
                }
            } else if (a == 101) {
                if (ba.a.a != null) {
                    Object object3;
                    if (u.a == 4) {
                        object3 = new StringBuffer();
                        byte by = (byte)(z.c - ba.a.a.a[u.d + u.e].b);
                        int n = 2;
                        if (by < 2) {
                            n = by;
                            ((StringBuffer)object3).append("\u672c\u88c5\u5907\u53ea\u80fd\u5347\u7ea71\u6b21\uff01 ");
                        }
                        for (int i = 0; i < n; ++i) {
                            z.a(ba.a.a.a[u.d + u.e]);
                            ((StringBuffer)object3).append("\u606d\u559c\u60a8,\u88c5\u5907\u5347\u7ea7\u6210\u529f");
                        }
                        u.c = w.a(((StringBuffer)object3).toString(), "\r\n", s.a - 10);
                        u.d = 0;
                        u.e = 0;
                    } else if (u.a == 5) {
                        object3 = new StringBuffer();
                        if (z.c == 5) {
                            z.c = (byte)10;
                            z.b = true;
                        }
                        ((StringBuffer)object3).append("\u88c5\u5907\u7b49\u7ea7\u4e0a\u9650\u5df2\u7ecf\u5f00\u653e\uff0c\u53ef\u4ee5\u5347\u7ea7\u523010\u7ea7!");
                        u.c = w.a(((StringBuffer)object3).toString(), "\r\n", s.a - 10);
                        u.d = 0;
                        u.e = 0;
                    }
                }
            } else if (a == 5) {
                for (int i = 0; i < 4 && i < s.a.length; ++i) {
                    if (!s.a[i].g || s.a[i].a[3] > 0) continue;
                    s.a[i].a[3] = s.a[i].a[4];
                    s.a[i].a[5] = s.a[i].a[6];
                }
                s.a(11, 1);
            } else if (a == 6) {
                int n = 0;
                byte by = 0;
                StringBuffer stringBuffer = new StringBuffer("");
                object2 = new Random();
                ((Random)object2).setSeed(System.currentTimeMillis());
                ((Random)object2).setSeed(System.currentTimeMillis());
                u.a = new byte[5];
                u.b = new byte[5];
                stringBuffer.append("\u60a8\u5f97\u5230\u4e86");
                for (int i = 0; i < 5; ++i) {
                    n = 100 - Math.abs(((Random)object2).nextInt() % 100);
                    u.b[i] = by = (byte)(12 - Math.abs(((Random)object2).nextInt() % 12));
                    if (n < u.f) {
                        u.a[i] = u.e;
                        stringBuffer.append("" + u.b[u.c[u.b[i] - 1] - 1] + ",");
                        s.e(u.c[u.b[i] - 1], -1);
                        continue;
                    }
                    if (n < u.g) {
                        u.a[i] = u.d;
                        stringBuffer.append("" + u.a[u.b[u.b[i] - 1] - 1] + ",");
                        s.a(u.b[u.b[i] - 1], 1);
                        continue;
                    }
                    u.a[i] = 0;
                    stringBuffer.append("" + u.a[u.b[i] - 1] + "\u91d1,");
                    s.a += u.a[u.b[i] - 1];
                }
                stringBuffer.append("\u606d\u559c\u60a8!");
                u.c = w.a(stringBuffer.toString(), "\r\n", s.a - 10);
                stringBuffer.delete(0, stringBuffer.length());
            } else if (a == 7) {
                if (ba.a.a != null) {
                    s.b = true;
                }
            } else if (a == 8) {
                if (ba.a.a != null) {
                    u.f = (short)6;
                    u.g = (short)(u.g + ba.a.a.a);
                }
            } else if (a == 9) {
                if (ba.a.a != null) {
                    u.h = (short)(u.h + 20);
                }
            } else if (a == 10) {
                if (ba.a.a != null) {
                    u.b = true;
                }
            } else if (a == -1 && ba.a.a != null) {
                for (int i = 0; i < ba.a.a.a.length; ++i) {
                    ba.a.a.a[i].a[3] = ba.a.a.a[i].a[33];
                    ba.a.a.a[i].a[5] = ba.a.a.a[i].a[34];
                }
                s.a(3, 1);
                ba.a.a.a = "\u5168\u5458\u8eab\u4f53\u75ca\u6108,\u83b7\u5f97\u73cd\u8d35\u9053\u5177";
                ba.a.a.d = (short)20;
                ba.a.a.g = true;
                ba.a.a.e();
                ba.a.a.b = 1;
            }
            e = e + "6";
            u.b = (byte)5;
            u.a = (short)20;
            u.c = 0;
            a = false;
            e = e + "7";
            u.a();
            e = e + "8";
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            u.c = 0;
            u.a.delete(0, u.a.length());
            u.a.append("\u53d1\u9001\u4e0d\u6210\u529f.");
            u.b = (byte)6;
            a = false;
            return;
        }
    }

    static {
        a = " ";
        b = " ";
        e = " ";
    }
}
