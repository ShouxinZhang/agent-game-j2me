/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.TextField
 */
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class aa
implements CommandListener {
    private TextField a;
    private Form a;
    public static String a = null;
    private boolean a;
    public static byte a;
    private String[] a = null;

    public static void a() {
        ba.a.a = new aa();
        ba.a.b = (byte)7;
        a = 0;
    }

    private void a(Graphics graphics, String string, int n, int n2, int n3, int n4) {
        this.a = w.a(string, " ", n3);
        for (int i = 0; i < this.a.length; ++i) {
            graphics.drawString(this.a[i], n, n2 + i * w.a, 17);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(Graphics graphics) {
        ba ba2 = ba.a;
        synchronized (ba2) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, (int)s.a, (int)s.b);
            int n = s.a - 16;
            switch (a) {
                case 0: {
                    graphics.setColor(0xFFFFFF);
                    StringBuffer stringBuffer = new StringBuffer();
                    if (a != null) {
                        stringBuffer.append("\u4e3b\u89d2\u540d\u79f0\uff1a" + a);
                    } else {
                        stringBuffer.append("\u662f\u5426\u8981\u81ea\u5b9a\u4e49\u6e38\u620f\u4e3b\u89d2\u7684\u540d\u79f0\uff1f");
                    }
                    this.a(graphics, stringBuffer.toString(), s.a >> 1, s.b / 2 - (w.a << 1), n, 17);
                    int n2 = 0;
                    if (GameMIDlet.self.phonemodel.equals("KG77")) {
                        n2 = 2;
                    }
                    if (a != null) {
                        graphics.drawString("\u4fee\u6539", 0, s.b - n2, 36);
                        graphics.drawString("\u786e\u5b9a", (int)s.a, s.b - n2, 40);
                        break;
                    }
                    graphics.drawString("\u81ea\u5b9a\u4e49", 0, s.b - n2, 36);
                    graphics.drawString("\u9ed8\u8ba4", (int)s.a, s.b - n2, 40);
                    break;
                }
                case 1: {
                    graphics.setColor(0xFFFFFF);
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("\u81ea\u5b9a\u4e49\u6e38\u620f\u4e3b\u89d2\u540d\u79f0\u6210\u529f!");
                    stringBuffer.append(" \u60a8\u7684\u540d\u79f0\uff1a" + a);
                    stringBuffer.append(" \u6309\u4efb\u610f\u952e\u7ee7\u7eed\u6e38\u620f");
                    this.a(graphics, stringBuffer.toString(), s.a >> 1, s.b / 2 - (w.a << 1), n, 17);
                }
            }
            graphics.setColor(0);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(int n) {
        n = af.a(n);
        switch (a) {
            case 0: {
                if (n == af.g) {
                    ba ba2 = ba.a;
                    synchronized (ba2) {
                        if (this.a == null) {
                            this.a = new Form("\u8f93\u5165\u4e3b\u89d2\u540d\u79f0");
                            this.a = new TextField("\u53ef\u8f93\u51653\u4f4d\u4e2d\u6587\u6635\u79f0:", "", 3, 0);
                            this.a.append((Item)this.a);
                            this.a.addCommand(new Command("\u786e\u5b9a", 4, 1));
                            this.a.addCommand(new Command("\u8fd4\u56de", 2, 1));
                            this.a.setCommandListener((CommandListener)this);
                        }
                        ba.a.a((Displayable)this.a);
                        break;
                    }
                }
                if (n != af.f) break;
                ba ba3 = ba.a;
                synchronized (ba3) {
                    if (!this.a) {
                        ba.a.a = null;
                        ba.a.a = System.currentTimeMillis();
                        ba.a.b = 1;
                    } else {
                        a = 1;
                        s.b[0] = a;
                        s.a[0].a = a;
                    }
                    break;
                }
            }
            case 1: {
                a = 0;
                ba.a.a = null;
                ba.a.a = System.currentTimeMillis();
                ba.a.b = 1;
            }
        }
    }

    public final void commandAction(Command object, Displayable displayable) {
        if (((String)(object = object.getLabel())).equals("\u786e\u5b9a")) {
            if (this.a.getString() == null || this.a.getString().equals("")) {
                return;
            }
            a = this.a.getString();
            ba.a.a((Displayable)ba.a);
            this.a = true;
            return;
        }
        if (!((String)object).equals("\u53d1\u9001") && ((String)object).equals("\u8fd4\u56de")) {
            ba.a.a((Displayable)ba.a);
        }
    }
}
