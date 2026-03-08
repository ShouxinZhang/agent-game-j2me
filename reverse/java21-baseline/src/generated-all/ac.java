/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.HttpConnection
 *  javax.microedition.lcdui.Displayable
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Displayable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ac
implements Runnable {
    private Thread a;
    private short a;
    private HttpConnection a;
    private static String a = "221.130.184.166:80";
    private static String b = "http://10.0.0.172:80/wap/MsgServer.do";
    private static String c = "http://221.130.184.166/wap/MsgServer.do";
    private static String d = "/wap/MsgServer.do";
    private boolean a = true;

    public ac() {
        a = ap.f;
        d = ap.g;
        b = "http://10.0.0.172:80" + d;
        c = "http://" + a + d;
    }

    public final void a(int n) {
        if (!ba.a.a.a) {
            this.a = (short)n;
            this.a = null;
            this.a = new Thread(this);
            this.a.start();
            ba.a.a.a = true;
            return;
        }
        this.c();
    }

    /*
     * Loose catch block
     */
    public final void run() {
        HttpConnection httpConnection;
        HttpConnection httpConnection2;
        HttpConnection httpConnection3;
        block20: {
            boolean bl = true;
            int n = 3;
            String string = this.a ? c : b;
            httpConnection3 = null;
            XConnection xConnection = null;
            XConnection xConnection2 = new XConnection();
            if (string.startsWith("sms")) {
                xConnection = xConnection2;
            } else {
                boolean bl2 = bl;
                int n2 = n;
                String string2 = string;
                httpConnection2 = null;
                XConnection xConnection3 = null;
                XConnection xConnection4 = new XConnection();
                if (string2.startsWith("sms")) {
                    xConnection3 = xConnection4;
                } else {
                    boolean bl3 = bl2;
                    int n3 = n2;
                    String string3 = string2;
                    httpConnection = null;
                    XConnection xConnection5 = null;
                    XConnection xConnection6 = new XConnection();
                    xConnection5 = string3.startsWith("sms") ? xConnection6 : Connector.open((String)string3, (int)n3, (boolean)bl3);
                    xConnection3 = xConnection5;
                }
                xConnection = xConnection3;
            }
            this.a = (HttpConnection)xConnection;
            this.a.setRequestMethod("POST");
            this.a.setRequestProperty("Connection", "close");
            this.a.setRequestProperty("Pragma", "no-cache");
            this.a.setRequestProperty("User-Agent", "Profile/MIDP-2.0 Configuration/CLDC-1.0");
            this.a.setRequestProperty("Content-Language", "zh-cn");
            this.a.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            this.a.setRequestProperty("Accept", "text/plain");
            this.a.setRequestProperty("X-Online-Host", a);
            this.a();
            if (this.a == null) break block20;
            int n4 = this.a.getResponseCode();
            if (n4 != 200) {
                this.c();
            }
            if (!ba.a.a.a) break block20;
            this.b();
        }
        try {
            httpConnection3 = this.a;
            if (httpConnection3 != null && (httpConnection2 = httpConnection3) != null && (httpConnection = httpConnection2) != null) {
                httpConnection.close();
            }
            this.a = null;
            return;
        }
        catch (Exception exception) {
            return;
        }
        catch (Exception exception) {
            try {
                this.c();
                try {
                    Thread.sleep(50L);
                }
                catch (Exception exception2) {
                    this.c();
                }
            }
            catch (Throwable throwable) {
                try {
                    HttpConnection httpConnection4;
                    HttpConnection httpConnection5;
                    HttpConnection httpConnection6 = this.a;
                    if (httpConnection6 != null && (httpConnection5 = httpConnection6) != null && (httpConnection4 = httpConnection5) != null) {
                        httpConnection4.close();
                    }
                    this.a = null;
                }
                catch (Exception exception3) {}
                throw throwable;
            }
            try {
                HttpConnection httpConnection7;
                HttpConnection httpConnection8;
                HttpConnection httpConnection9 = this.a;
                if (httpConnection9 != null && (httpConnection8 = httpConnection9) != null && (httpConnection7 = httpConnection8) != null) {
                    httpConnection7.close();
                }
                this.a = null;
                return;
            }
            catch (Exception exception4) {
                return;
            }
        }
    }

    private synchronized void a() {
        OutputStream outputStream = null;
        outputStream = null;
        try {
            outputStream = this.a.openOutputStream();
            outputStream = new DataOutputStream(outputStream);
            ((DataOutputStream)outputStream).writeShort(this.a);
            switch (this.a) {
                case 1: {
                    ((DataOutputStream)outputStream).writeUTF(ae.d);
                    ((DataOutputStream)outputStream).writeUTF(ae.e);
                    break;
                }
                case 8: {
                    ((DataOutputStream)outputStream).writeUTF(ae.b);
                    ((DataOutputStream)outputStream).writeUTF(ae.e);
                    break;
                }
                case 4: {
                    ((DataOutputStream)outputStream).writeUTF(ae.d);
                    ((DataOutputStream)outputStream).writeUTF(ae.e);
                    ((DataOutputStream)outputStream).writeUTF(ae.f);
                    ((DataOutputStream)outputStream).writeUTF(ae.g);
                    break;
                }
                case 5: {
                    ((DataOutputStream)outputStream).writeUTF(ae.b);
                    break;
                }
                case 7: {
                    ((DataOutputStream)outputStream).writeUTF(ae.b);
                    ((DataOutputStream)outputStream).writeUTF(ae.c);
                    break;
                }
                case 6: {
                    ((DataOutputStream)outputStream).writeUTF(ae.b);
                    ((DataOutputStream)outputStream).writeUTF(ae.c);
                    ((DataOutputStream)outputStream).writeInt(0);
                }
            }
            try {
                ((FilterOutputStream)outputStream).close();
            }
            catch (Exception exception) {
                this.c();
                return;
            }
        }
        catch (Exception exception) {
            this.c();
        }
    }

    private synchronized void b() {
        block27: {
            try {
                Object var1_1 = null;
                InputStream inputStream = null;
                if (this.a != null) {
                    try {
                        inputStream = this.a.openInputStream();
                        int n = (int)this.a.getLength();
                        int n2 = 0;
                        byte[] byArray = null;
                        if (n > 0) {
                            int n3;
                            byArray = new byte[n];
                            for (n3 = 0; n3 != n && n2 != -1; n3 += n2) {
                                n2 = inputStream.read(byArray, n3, n - n3);
                            }
                            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
                            short s = dataInputStream.readShort();
                            n2 = s;
                            if (s == 1) {
                                switch (this.a) {
                                    case 1: {
                                        ae.b = dataInputStream.readUTF();
                                        ae.a = dataInputStream.readUTF();
                                        ba.a.a.a = ae.a != null && !ae.a.equals("") ? (byte)4 : (byte)5;
                                        ba.a.a.a(ba.a.a.a);
                                        break;
                                    }
                                    case 8: {
                                        ae.d = dataInputStream.readUTF();
                                        ae.a = dataInputStream.readUTF();
                                        ba.a.a.a = ae.a != null && !ae.a.equals("") ? (byte)4 : (byte)5;
                                        ba.a.a.a(ba.a.a.a);
                                        break;
                                    }
                                    case 4: {
                                        ae.b = dataInputStream.readUTF();
                                        ba.a.a.a = (byte)6;
                                        ba.a.a.a(ba.a.a.a);
                                        break;
                                    }
                                    case 5: {
                                        ae.a = dataInputStream.readInt();
                                        ba.a.a.a = (byte)8;
                                        ba.a.a.a(ba.a.a.a);
                                        break;
                                    }
                                    case 7: {
                                        short s2 = dataInputStream.readShort();
                                        n2 = s2;
                                        u.a = new int[s2][2];
                                        for (int i = 0; i < n2; ++i) {
                                            for (n3 = 0; n3 < 2; ++n3) {
                                                u.a[i][n3] = dataInputStream.readInt();
                                            }
                                        }
                                        u.a = true;
                                        u.a("/txt/smsItem.txt");
                                        GameMIDlet.disp.setCurrent((Displayable)ba.a);
                                        break;
                                    }
                                    case 6: {
                                        ae.a = dataInputStream.readInt();
                                        u.b = (byte)5;
                                        u.c = 0;
                                        u.a();
                                    }
                                }
                                ba.a.a.a = false;
                            } else if (this.a == 6) {
                                u.c = 0;
                                u.a.delete(0, u.a.length());
                                u.a.append("\u53d1\u9001\u4e0d\u6210\u529f.");
                                u.b = (byte)6;
                                ba.a.a.a = false;
                            } else {
                                if (this.a == 1 || this.a == 8 || this.a == 4) {
                                    ae.h = dataInputStream.readUTF();
                                }
                                this.c();
                            }
                            dataInputStream.close();
                        } else if (this.a == 6) {
                            u.c = 0;
                            u.a.delete(0, u.a.length());
                            u.a.append("\u53d1\u9001\u4e0d\u6210\u529f.");
                            u.b = (byte)6;
                            ba.a.a.a = false;
                        } else {
                            this.c();
                        }
                        inputStream.close();
                    }
                    catch (Exception exception) {
                        this.c();
                    }
                    break block27;
                }
                return;
            }
            catch (Exception exception) {
                this.c();
            }
        }
    }

    private void c() {
        try {
            if (this.a != null) {
                HttpConnection httpConnection;
                HttpConnection httpConnection2;
                HttpConnection httpConnection3 = this.a;
                if (httpConnection3 != null && (httpConnection2 = httpConnection3) != null && (httpConnection = httpConnection2) != null) {
                    httpConnection.close();
                }
                this.a = null;
            }
        }
        catch (Exception exception) {}
        try {
            if (ba.a.a != null && ba.a.a.a && ba.a.b == 8) {
                ba.a.a.a = false;
                ba.a.a.a = (byte)7;
                ba.a.a.a(ba.a.a.a);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}
