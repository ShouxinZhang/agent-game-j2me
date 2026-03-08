/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Alert
 *  javax.microedition.lcdui.AlertType
 *  javax.microedition.lcdui.ChoiceGroup
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.ItemStateListener
 *  javax.microedition.lcdui.TextField
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
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotFoundException;
import javax.microedition.rms.RecordStoreNotOpenException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ae
implements CommandListener,
ItemStateListener {
    private Form a;
    private Command a;
    private Command b;
    private TextField a;
    private TextField b;
    private TextField c;
    private TextField d;
    private ChoiceGroup a;
    private byte b;
    private static byte c;
    byte a;
    private static short a;
    private String[] a;
    private String[] b;
    private int b;
    public static String a;
    public static String b;
    public static String c;
    static String d;
    static String e;
    static String f;
    static String g;
    public static int a;
    public boolean a;
    public static String h;
    private boolean b;
    private int c;
    private int d = 0;
    private long a;
    private long b = 5000L;
    private String[] c;
    private int e = 2;
    private int f = 1;
    private String i;
    private boolean c = new String[]{"\u60a8\u53ef\u4ee5\u7528\u4e50\u5e01\u6765\u6362\u53d6\u6e38\u620f\u5f53\u4e2d\u7684\u670d\u52a1\uff08\u6b66\u5668\u3001\u88c5\u5907\u6216\u5176\u5b83\uff09\uff0c\u8d76\u7d27\u767b\u9646\u5427", "\u60a8\u53ef\u4ee5\u53bb\u4e50\u6e38wap\u7f51http://wap.legame.cn\u53d1\u5e16\u83b7\u5f97\u4e50\u5e01\u6216\u8005\u67e5\u770b\u60a8\u7684\u7528\u6237ID\u53f7"};
    private int g;
    private static String j;

    public ae() {
        this.a = ap.a == 1 ? new String[]{"\u77ed\u4fe1\u670d\u52a1", "\u4e50\u5e01\u670d\u52a1"} : new String[]{"\u77ed\u4fe1\u670d\u52a1"};
        n.a(2);
        c = 1;
    }

    public final void a(byte by) {
        try {
            ((ae)((Object)exception2)).a.deleteAll();
            ((ae)((Object)exception2)).a.removeCommand(((ae)((Object)exception2)).b);
            switch (by) {
                case 1: {
                    ((ae)((Object)exception2)).a = new ChoiceGroup("\u8bf7\u9009\u62e9\u767b\u9646\u65b9\u5f0f", 1);
                    ((ae)((Object)exception2)).a.append("\u7528\u6237\u540d\u767b\u9646", null);
                    ((ae)((Object)exception2)).a.append("\u7528\u6237ID\u767b\u9646", null);
                    ((ae)((Object)exception2)).a.append((Item)((ae)((Object)exception2)).a);
                    ((ae)((Object)exception2)).a = new TextField("\u7528\u6237\u540d", d, 14, 0);
                    ((ae)((Object)exception2)).b = new TextField("\u5bc6\u7801", e, 20, 65536);
                    ((ae)((Object)exception2)).b = new Command("\u786e\u5b9a", 8, 1);
                    ((ae)((Object)exception2)).a.append((Item)((ae)((Object)exception2)).a);
                    ((ae)((Object)exception2)).a.append((Item)((ae)((Object)exception2)).b);
                    ((ae)((Object)exception2)).a.addCommand(((ae)((Object)exception2)).b);
                    ((ae)((Object)exception2)).a.setItemStateListener((ItemStateListener)exception2);
                    break;
                }
                case 2: {
                    ((ae)((Object)exception2)).a = new TextField("\u7528\u6237\u540d", d, 14, 0);
                    ((ae)((Object)exception2)).b = new TextField("\u5bc6\u7801", e, 20, 65536);
                    ((ae)((Object)exception2)).c = new TextField("\u786e\u8ba4\u5bc6\u7801", f, 20, 65536);
                    ((ae)((Object)exception2)).d = new TextField("\u624b\u673a\u53f7\u7801", g, 11, 3);
                    ((ae)((Object)exception2)).b = new Command("\u6ce8\u518c", 8, 1);
                    ((ae)((Object)exception2)).a.append((Item)((ae)((Object)exception2)).a);
                    ((ae)((Object)exception2)).a.append((Item)((ae)((Object)exception2)).b);
                    ((ae)((Object)exception2)).a.append((Item)((ae)((Object)exception2)).c);
                    ((ae)((Object)exception2)).a.append((Item)((ae)((Object)exception2)).d);
                    ((ae)((Object)exception2)).a.append("\u8f93\u5165\u624b\u673a\u53f7\u7801\u53ef\u83b7\u5f97\u6ce8\u518c\u79ef\u5206\u5956\u52b1");
                    ((ae)((Object)exception2)).a.addCommand(((ae)((Object)exception2)).b);
                    break;
                }
                case 3: {
                    ((ae)((Object)exception2)).a.setTitle("\u8fde\u63a5\u4e2d");
                    ((ae)((Object)exception2)).a.append("\u8bf7\u7b49\u5f85");
                    break;
                }
                case 4: {
                    ae.a();
                    ((ae)((Object)exception2)).b = new Command("\u786e\u5b9a", 8, 1);
                    ((ae)((Object)exception2)).a.setTitle("\u6700\u65b0\u516c\u544a");
                    ((ae)((Object)exception2)).a.append(a);
                    ((ae)((Object)exception2)).a.addCommand(((ae)((Object)exception2)).b);
                    break;
                }
                case 5: {
                    ae.a();
                    ((ae)((Object)exception2)).b = new Command("\u786e\u5b9a", 8, 1);
                    ((ae)((Object)exception2)).a.setTitle("\u767b\u9646\u6210\u529f");
                    ((ae)((Object)exception2)).a.append("\u6b22\u8fce\u201c" + d + "\u201d,\u60a8\u7684\u7528\u6237ID\u662f:" + b + ",\u662f\u5426\u67e5\u770b\u5f53\u524d\u4e50\u5e01\uff1f");
                    ((ae)((Object)exception2)).a.addCommand(((ae)((Object)exception2)).b);
                    break;
                }
                case 6: {
                    ae.a();
                    ((ae)((Object)exception2)).a.setTitle("\u6ce8\u518c\u6210\u529f");
                    ((ae)((Object)exception2)).a.append("\u60a8\u7684\u7528\u6237ID\u662f:" + b + ",\u8fd4\u56de\u5230\u767b\u9646\u754c\u9762\u767b\u9646");
                    break;
                }
                case 7: {
                    ((ae)((Object)exception2)).a.setTitle("\u8fde\u63a5\u5931\u8d25");
                    ((ae)((Object)exception2)).a.append(h);
                    ((ae)((Object)exception2)).a.append("\u8bf7\u8fd4\u56de\u91cd\u8bf7\u5c1d\u8bd5");
                    break;
                }
                case 8: {
                    ((ae)((Object)exception2)).b = new Command("\u786e\u5b9a", 8, 1);
                    ((ae)((Object)exception2)).a.setTitle("\u5f53\u524d\u4e50\u5e01");
                    ((ae)((Object)exception2)).a.append("\u4e50\u5e01:" + a + ",\u662f\u5426\u67e5\u770b\u670d\u52a1\uff1f");
                    ((ae)((Object)exception2)).a.addCommand(((ae)((Object)exception2)).b);
                }
            }
            ((ae)((Object)exception2)).a.setCommandListener((CommandListener)exception2);
            GameMIDlet.disp.setCurrent((Displayable)((ae)((Object)exception2)).a);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void commandAction(Command object, Displayable displayable) {
        if (object == ae2.a) {
            if (ae2.a == 7) {
                u.b = 0;
                ba.a.b = (byte)8;
            }
            n.a(3);
            ae2.a = false;
            c = (byte)2;
            ae2.a = 0;
            ae2.b = 0;
            ae2.b = 0;
            GameMIDlet.disp.setCurrent((Displayable)ba.a);
            ae2.a.deleteAll();
            return;
        }
        if (object == ae2.b) {
            switch (ae2.a) {
                case 1: {
                    ae ae2;
                    e = ae2.b.getString();
                    if (ae2.b == 0) {
                        d = ae2.a.getString();
                        if (!d.equals("") && !e.equals("") && d.length() >= 3 && e.length() >= 6) {
                            ae2.a = (byte)3;
                            a = 1;
                            object = new ac();
                            object.a(a);
                            ae2.a(ae2.a);
                            return;
                        }
                        ae2 = new Alert("\u8b66\u544a", null, null, AlertType.INFO);
                        if (d.equals("")) {
                            ae2.setString("\u7528\u6237\u540d\u4e0d\u80fd\u4e3a\u7a7a");
                        } else if (e.equals("")) {
                            ae2.setString("\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a");
                        } else if (d.length() < 3) {
                            ae2.setString("\u8bf7\u8f93\u51653~14\u4f4d\u7528\u6237\u540d");
                        } else if (e.length() < 6) {
                            ae2.setString("\u8bf7\u8f93\u51656~20\u4f4d\u5bc6\u7801");
                        }
                        ae2.setTimeout(3000);
                        GameMIDlet.disp.setCurrent((Displayable)ae2);
                        return;
                    }
                    if (ae2.b != 1) break;
                    b = ae2.a.getString();
                    if (!b.equals("") && !e.equals("") && e.length() >= 6) {
                        ae2.a = (byte)3;
                        a = (short)8;
                        object = new ac();
                        object.a(a);
                        ae2.a(ae2.a);
                        return;
                    }
                    ae2 = new Alert("\u8b66\u544a", null, null, AlertType.INFO);
                    if (b.equals("")) {
                        ae2.setString("\u7528\u6237ID\u4e0d\u80fd\u4e3a\u7a7a");
                    } else if (e.equals("")) {
                        ae2.setString("\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a");
                    } else if (e.length() < 6) {
                        ae2.setString("\u8bf7\u8f93\u51656~20\u4f4d\u5bc6\u7801");
                    }
                    ae2.setTimeout(3000);
                    GameMIDlet.disp.setCurrent((Displayable)ae2);
                    return;
                }
                case 2: {
                    d = ae2.a.getString();
                    e = ae2.b.getString();
                    f = ae2.c.getString();
                    g = ae2.d.getString();
                    if (!d.equals("") && !e.equals("") && !f.equals("") && e.equals(f) && d.length() >= 3 && e.length() >= 6 && f.length() >= 6) {
                        ae2.a = (byte)3;
                        a = (short)4;
                        object = new ac();
                        object.a(a);
                        ae2.a(ae2.a);
                        return;
                    }
                    ae ae2 = new Alert("\u8b66\u544a", null, null, AlertType.INFO);
                    if (d.equals("")) {
                        ae2.setString("\u7528\u6237\u540d\u4e0d\u80fd\u4e3a\u7a7a");
                    } else if (e.equals("")) {
                        ae2.setString("\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a");
                    } else if (f.equals("")) {
                        ae2.setString("\u786e\u8ba4\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a");
                    } else if (d.length() < 3) {
                        ae2.setString("\u8bf7\u8f93\u51653~14\u4f4d\u7528\u6237\u540d");
                    } else if (e.length() < 6) {
                        ae2.setString("\u8bf7\u8f93\u51656~20\u4f4d\u5bc6\u7801");
                    } else if (f.length() < 6) {
                        ae2.setString("\u8bf7\u8f93\u51656~20\u4f4d\u5bc6\u7801");
                    } else if (!e.equals(f)) {
                        ae2.setString("\u4e24\u6b21\u5bc6\u7801\u4e0d\u540c");
                    }
                    ae2.setTimeout(3000);
                    GameMIDlet.disp.setCurrent((Displayable)ae2);
                    return;
                }
                case 4: {
                    ae2.a = (byte)5;
                    ae2.a(ae2.a);
                    return;
                }
                case 5: {
                    ae2.a = (byte)3;
                    a = (short)5;
                    object = new ac();
                    object.a(a);
                    ae2.a(ae2.a);
                    return;
                }
                case 8: {
                    ae2.a = (byte)3;
                    a = (short)7;
                    object = new ac();
                    object.a(a);
                    ae2.a(ae2.a);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void a(int n2) {
        n2 = af.a(n2);
        switch (c) {
            case 1: {
                if (n2 == 8) {
                    n.a(0);
                    if (((ae)((Object)ba2)).a[((ae)((Object)ba2)).b].equals("\u77ed\u4fe1\u670d\u52a1")) {
                        u.a("/txt/smsItem.txt");
                        c = 1;
                        ((ae)((Object)ba2)).b = 0;
                        return;
                    }
                    if (!((ae)((Object)ba2)).a[((ae)((Object)ba2)).b].equals("\u4e50\u5e01\u670d\u52a1")) break;
                    c = (byte)2;
                    ((ae)((Object)ba2)).b = 0;
                    n.a(3);
                    return;
                }
                if (n2 == 1) {
                    if (((ae)((Object)ba2)).b <= 0) break;
                    --((ae)((Object)ba2)).b;
                    return;
                }
                if (n2 == 6) {
                    if (((ae)((Object)ba2)).b >= ((ae)((Object)ba2)).a.length - 1) break;
                    ++((ae)((Object)ba2)).b;
                    return;
                }
                if (n2 != af.g) break;
                ba ba2 = ba.a;
                synchronized (ba2) {
                    ae.a();
                    break;
                }
            }
            case 2: {
                if (n2 == 8) {
                    n.a(0);
                    if (((ae)((Object)ba2)).b[((ae)((Object)ba2)).b].equals("\u767b\u9646")) {
                        Throwable throwable;
                        RecordStore recordStore = null;
                        Object object = null;
                        object = null;
                        object = null;
                        try {
                            recordStore = RecordStore.openRecordStore((String)j, (boolean)false);
                            throwable = recordStore.enumerateRecords(null, null, false);
                            if (throwable.hasNextElement()) {
                                int n3 = throwable.nextRecordId();
                                object = recordStore.getRecord(n3);
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
                                d = ((DataInputStream)object).readUTF();
                                e = ((DataInputStream)object).readUTF();
                                b = ((DataInputStream)object).readUTF();
                                recordStore.closeRecordStore();
                            }
                            catch (IOException iOException) {
                                throwable = iOException;
                                iOException.printStackTrace();
                            }
                            catch (RecordStoreNotOpenException recordStoreNotOpenException) {
                                throwable = recordStoreNotOpenException;
                                recordStoreNotOpenException.printStackTrace();
                            }
                            catch (RecordStoreFullException recordStoreFullException) {
                                throwable = recordStoreFullException;
                                recordStoreFullException.printStackTrace();
                            }
                            catch (RecordStoreException recordStoreException) {
                                throwable = recordStoreException;
                                recordStoreException.printStackTrace();
                            }
                        }
                        ((ae)((Object)ba2)).a = 1;
                        ((ae)((Object)ba2)).a = new Form("\u7528\u6237\u767b\u9646");
                        ((ae)((Object)ba2)).a(((ae)((Object)ba2)).a);
                    } else if (((ae)((Object)ba2)).b[((ae)((Object)ba2)).b].equals("\u6ce8\u518c")) {
                        ((ae)((Object)ba2)).a = (byte)2;
                        ((ae)((Object)ba2)).a = new Form("\u6ce8\u518c\u7528\u6237");
                        g = "";
                        f = "";
                        e = "";
                        d = "";
                        ((ae)((Object)ba2)).a(((ae)((Object)ba2)).a);
                    }
                    ((ae)((Object)ba2)).a = new Command("\u8fd4\u56de", 8, 1);
                    ((ae)((Object)ba2)).a.addCommand(((ae)((Object)ba2)).a);
                    return;
                }
                if (n2 == 1) {
                    if (((ae)((Object)ba2)).b <= 0) break;
                    --((ae)((Object)ba2)).b;
                    return;
                }
                if (n2 == 6) {
                    if (((ae)((Object)ba2)).b >= ((ae)((Object)ba2)).b.length - 1) break;
                    ++((ae)((Object)ba2)).b;
                    return;
                }
                if (n2 != af.g) break;
                c = 1;
                ((ae)((Object)ba2)).a = 0;
                ((ae)((Object)ba2)).b = 0;
                n.a(2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(int n2, int n3) {
        ad ad2;
        if (c == 2) {
            n.a(3);
            ((ae)((Object)ba2)).b = 0;
        }
        if ((ad2 = n.a(n2, n3)) != null) {
            if (ad2.a == 3) {
                ba ba2 = ba.a;
                synchronized (ba2) {
                    ae.a();
                }
                n.a(1);
                return;
            }
            if (ad2.a == 2) {
                c = 1;
                ((ae)((Object)ba2)).a = 0;
                ((ae)((Object)ba2)).b = 0;
                n.a(2);
            }
        }
    }

    public final void a(Graphics graphics) {
        Graphics graphics2 = graphics;
        graphics2.setColor(9293818);
        graphics2.fillRect(0, 0, (int)s.a, (int)s.b);
        graphics2.setColor(6000495);
        graphics2.fillRoundRect(0, 0, (int)s.a, 19, 8, 8);
        graphics2.setColor(3297388);
        graphics2.drawRoundRect(0, 0, (int)s.a, 19, 8, 8);
        graphics2.setColor(6000495);
        graphics2.fillRoundRect(0, 21, (int)s.a, s.b - 19, 8, 8);
        graphics2.setColor(3297388);
        graphics2.drawRoundRect(0, 21, (int)s.a, s.b - 19, 8, 8);
        switch (c) {
            case 1: {
                graphics.setColor(0xFFFF00);
                graphics.drawString("\u8d85\u7ea7\u4f53\u9a8c", s.a >> 1, 1, 17);
                int n2 = (s.b - (this.a.length + 2) * w.a - (this.a.length - 1) * 10 - 3) / 2 + 2 * w.a;
                for (int i = 0; i < this.a.length; ++i) {
                    if (i == this.b) {
                        w.a(graphics, this.a[i], s.a >> 1, n2 + (w.a + 10) * i, 14902310, 0xFFFFFF, 17);
                        continue;
                    }
                    graphics.setColor(0);
                    graphics.drawString(this.a[i], s.a >> 1, n2 + (w.a + 10) * i, 17);
                }
                return;
            }
            case 2: {
                boolean bl;
                graphics.setColor(0xFFFF00);
                graphics.drawString("\u6fc0\u60c5\u4e50\u5e01", s.a >> 1, 1, 17);
                int n3 = (s.b - (this.b.length + 2) * w.a - (this.b.length - 1) * 10 - 3) / 2 + 2 * w.a;
                for (int i = 0; i < this.b.length; ++i) {
                    if (i == this.b) {
                        w.a(graphics, this.b[i], s.a >> 1, n3 + (w.a + 10) * i, 14902310, 0xFFFFFF, 17);
                        continue;
                    }
                    graphics.setColor(0);
                    graphics.drawString(this.b[i], s.a >> 1, n3 + (w.a + 10) * i, 17);
                }
                if (this.c == null) break;
                if (System.currentTimeMillis() - this.a > this.b && !this.c) {
                    ae ae2 = this;
                    this.g = ++ae2.g % ae2.c.length;
                    ae2.c = true;
                    this.i = ae2.c[ae2.g];
                }
                if (this.i == null) break;
                int n4 = this.f;
                int n5 = this.e;
                int n6 = 21;
                int n7 = s.a;
                String string = this.i;
                Graphics graphics3 = graphics;
                ae ae3 = this;
                int n8 = w.a.stringWidth(string);
                ae3.c += n5;
                if (ae3.d >= n4) {
                    bl = true;
                } else {
                    if (ae3.c > s.a + n8) {
                        ++ae3.d;
                        ae3.c = 0;
                    } else {
                        graphics3.setColor(0xFFFFFF);
                        graphics3.drawString(string, n7 -= ae3.c, 21, 20);
                    }
                    bl = this.b = false;
                }
                if (!this.b) break;
                this.i = null;
                this.b = false;
                this.d = 0;
                this.c = 0;
                this.c = false;
                this.a = System.currentTimeMillis();
            }
        }
    }

    private static boolean a() {
        if (ba.a.a != null) {
            ba.a.a = null;
        }
        ba.a.m();
        ba.a.k();
        if (GameMIDlet.self.playMusic && GameMIDlet.self.allowMusic) {
            ba.a.i();
        }
        ((at)ba.a).a = 0;
        ((at)ba.a).b = 0;
        System.gc();
        try {
            Thread.sleep(200L);
        }
        catch (InterruptedException interruptedException) {
            InterruptedException interruptedException2 = interruptedException;
            interruptedException.printStackTrace();
        }
        ba.a.b = 1;
        return true;
    }

    private static void a() {
        RecordStore recordStore = null;
        Object object = null;
        DataOutputStream dataOutputStream = null;
        try {
            recordStore = RecordStore.openRecordStore((String)j, (boolean)true);
            recordStore.closeRecordStore();
            RecordStore.deleteRecordStore((String)j);
            recordStore = RecordStore.openRecordStore((String)j, (boolean)true);
        }
        catch (RecordStoreFullException recordStoreFullException) {
            object = recordStoreFullException;
            recordStoreFullException.printStackTrace();
        }
        catch (RecordStoreNotFoundException recordStoreNotFoundException) {
            object = recordStoreNotFoundException;
            recordStoreNotFoundException.printStackTrace();
        }
        catch (RecordStoreException recordStoreException) {
            object = recordStoreException;
            recordStoreException.printStackTrace();
        }
        object = new ByteArrayOutputStream();
        dataOutputStream = new DataOutputStream((OutputStream)object);
        try {
            dataOutputStream.writeUTF(d);
            dataOutputStream.writeUTF(e);
            dataOutputStream.writeUTF(b);
            object = ((ByteArrayOutputStream)object).toByteArray();
            recordStore.addRecord((byte[])object, 0, ((Object)object).length);
            recordStore.closeRecordStore();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
        catch (RecordStoreNotOpenException recordStoreNotOpenException) {
            object = recordStoreNotOpenException;
            recordStoreNotOpenException.printStackTrace();
            return;
        }
        catch (RecordStoreFullException recordStoreFullException) {
            object = recordStoreFullException;
            recordStoreFullException.printStackTrace();
            return;
        }
        catch (RecordStoreException recordStoreException) {
            object = recordStoreException;
            recordStoreException.printStackTrace();
            return;
        }
    }

    public final void itemStateChanged(Item item) {
        if (item.equals(this.a)) {
            this.b = (byte)this.a.getSelectedIndex();
            this.a.deleteAll();
            this.a.append((Item)this.a);
            switch (this.b) {
                case 0: {
                    this.a = new TextField("\u7528\u6237\u540d", d, 14, 0);
                    this.b = new TextField("\u5bc6\u7801", e, 20, 65536);
                    this.a.append((Item)this.a);
                    this.a.append((Item)this.b);
                    return;
                }
                case 1: {
                    this.a = new TextField("\u7528\u6237ID", b, 14, 2);
                    this.b = new TextField("\u5bc6\u7801", e, 20, 65536);
                    this.a.append((Item)this.a);
                    this.a.append((Item)this.b);
                }
            }
        }
    }

    static {
        a = 0;
        c = "FY3";
        d = "";
        e = "";
        f = "";
        g = "";
        h = "";
        j = "yitiantulongUser";
    }
}
