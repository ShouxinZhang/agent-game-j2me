/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class w {
    public static Font a = Font.getFont((int)0, (int)0, (int)8);
    public static int a = a.getHeight();

    public static Image a(String string) {
        if (string == null || string.equals("")) {
            return null;
        }
        Object object = null;
        object = !string.startsWith("/") ? "/" + string : string;
        try {
            if (string.toLowerCase().endsWith(".png") || string.toLowerCase().endsWith(".jpg") || string.toLowerCase().endsWith(".gif")) {
                return Image.createImage((String)object);
            }
            if (string.toLowerCase().endsWith(".ps")) {
                object = new x((String)object);
                Image image = ((x)object).a();
                ((x)object).a();
                return image;
            }
            if (GameMIDlet.self.debug) {
                System.out.println("\u4e0d\u652f\u6301\u8bfb\u53d6\u7684\u6587\u4ef6\u683c\u5f0f" + string);
            }
            return null;
        }
        catch (IOException iOException) {
            if (GameMIDlet.self.debug) {
                System.out.println("\u56fe\u7247" + string + "\u672a\u53d6\u5230");
            }
            return null;
        }
    }

    public static boolean a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        return n5 < n + n3 && n6 < n2 + n4 && n5 + n7 > n && n6 + n8 > n2;
    }

    public static boolean a(ax ax2, ax ax3) {
        return w.a(ax2.a, (int)ax2.b, (int)ax2.c, (int)ax2.d, ax3.a, (int)ax3.b, (int)ax3.c, (int)ax3.d);
    }

    public static byte a(int n, int n2) {
        int n3 = 0;
        if (n == 0 && n2 == 0) {
            n3 = 0;
        } else if (n == 1 && n2 == 0) {
            n3 = 2;
        } else if (n == 0 && n2 == 1) {
            n3 = 1;
        } else if (n == 1 && n2 == 1) {
            n3 = 3;
        }
        return (byte)n3;
    }

    private static String[] b(String string, String string2) {
        if (string == null || string2 == null) {
            return null;
        }
        int n = 0;
        String[] stringArray = null;
        while (n < string.length()) {
            String[] stringArray2;
            int n2 = string.indexOf(string2, n);
            if (n2 != -1) {
                if (!string.substring(n, n2).equals("")) {
                    if (stringArray == null) {
                        stringArray = new String[1];
                    } else {
                        stringArray2 = new String[stringArray.length + 1];
                        System.arraycopy(stringArray, 0, stringArray2, 0, stringArray.length);
                        stringArray = stringArray2;
                    }
                    stringArray[stringArray.length - 1] = string.substring(n, n2);
                }
                n = n2 + string2.length();
                continue;
            }
            if (string.substring(n).equals("")) break;
            if (stringArray == null) {
                stringArray = new String[1];
            } else {
                stringArray2 = new String[stringArray.length + 1];
                System.arraycopy(stringArray, 0, stringArray2, 0, stringArray.length);
                stringArray = stringArray2;
            }
            stringArray[stringArray.length - 1] = string.substring(n);
            break;
        }
        return stringArray;
    }

    private static byte[] b(String object, String string) {
        byte[] byArray = null;
        int[] nArray = w.b((String)object, string);
        object = nArray;
        if (nArray != null) {
            byArray = new byte[((Object)object).length];
            for (int i = 0; i < ((Object)object).length; ++i) {
                byArray[i] = (byte)object[i];
            }
        }
        return byArray;
    }

    private static short[] b(String object, String string) {
        short[] sArray = null;
        int[] nArray = w.b((String)object, string);
        object = nArray;
        if (nArray != null) {
            sArray = new short[((Object)object).length];
            for (int i = 0; i < ((Object)object).length; ++i) {
                sArray[i] = (short)object[i];
            }
        }
        return sArray;
    }

    private static int[] b(String stringArray, String object) {
        if (stringArray == null || stringArray.equals("")) {
            return null;
        }
        stringArray = w.b((String)stringArray, (String)object);
        object = null;
        if (stringArray != null) {
            object = new int[stringArray.length];
            for (int i = 0; i < stringArray.length; ++i) {
                object[i] = Integer.parseInt(stringArray[i]);
            }
        }
        return object;
    }

    public static String[] a(String string, int n) {
        String[] stringArray;
        if (n <= 0) {
            return null;
        }
        if (string == null || string.equals("")) {
            return new String[]{""};
        }
        String[] stringArray2 = null;
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i = 0; i < string.length(); ++i) {
            stringBuffer.append(string.charAt(i));
            if (a.stringWidth(stringBuffer.toString()) <= n) continue;
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            if (stringArray2 == null) {
                stringArray2 = new String[1];
            } else {
                stringArray = new String[stringArray2.length + 1];
                System.arraycopy(stringArray2, 0, stringArray, 0, stringArray2.length);
                stringArray2 = stringArray;
            }
            stringArray2[stringArray2.length - 1] = stringBuffer.toString();
            stringBuffer.delete(0, stringBuffer.length());
            --i;
        }
        if (stringBuffer.length() > 0) {
            if (stringArray2 == null) {
                stringArray2 = new String[1];
            } else {
                stringArray = new String[stringArray2.length + 1];
                System.arraycopy(stringArray2, 0, stringArray, 0, stringArray2.length);
                stringArray2 = stringArray;
            }
            stringArray2[stringArray2.length - 1] = stringBuffer.toString();
        }
        return stringArray2;
    }

    public static String[] a(String stringArray, String object, int n) {
        Object[] objectArray = null;
        stringArray = w.b((String)stringArray, (String)object);
        object = new Vector();
        for (int i = 0; stringArray != null && i < stringArray.length; ++i) {
            String[] stringArray2 = w.a(stringArray[i], n);
            for (int j = 0; stringArray2 != null && j < stringArray2.length; ++j) {
                ((Vector)object).addElement(stringArray2[j]);
            }
        }
        if (((Vector)object).size() > 0) {
            objectArray = new String[((Vector)object).size()];
            ((Vector)object).copyInto(objectArray);
        }
        return objectArray;
    }

    public static void a(Graphics graphics, int n, int n2, int n3, Image image, int n4, int n5, int n6) {
        String string = String.valueOf(n);
        for (n4 = 0; n4 < string.length(); ++n4) {
            char c2 = string.charAt(n4);
            n5 = c2;
            byte by = (byte)(c2 - 48);
            n5 = by;
            if (by >= 0 && n5 <= 9) {
                if ((n6 & 4) == 4) {
                    graphics.drawRegion(image, n5 * 6, 0, 6, 7, 0, n2 + n4 * 6, n3, 20);
                    continue;
                }
                if ((n6 & 8) != 8) continue;
                graphics.drawRegion(image, n5 * 6, 0, 6, 7, 0, n2 - (string.length() - n4) * 6, n3, 20);
                continue;
            }
            if (n5 != -3) continue;
            if ((n6 & 4) == 4) {
                graphics.drawRegion(image, 60, 0, 6, 7, 0, n2 + n4 * 6, n3, 20);
                continue;
            }
            if ((n6 & 8) != 8) continue;
            graphics.drawRegion(image, 60, 0, 6, 7, 0, n2 - (string.length() - n4) * 6, n3, 20);
        }
    }

    public static void a(Graphics graphics, int n, int n2, int n3, Image[] imageArray, int n4, int n5) {
        String string = String.valueOf(n);
        for (n4 = 0; n4 < string.length(); ++n4) {
            char c2 = string.charAt(n4);
            byte by = (byte)(c2 - 48);
            c2 = (char)by;
            if (by >= 0 && c2 <= '\t') {
                if ((n5 & 4) == 4) {
                    graphics.drawImage(imageArray[c2], n2 + n4 * 6, n3, 20);
                    continue;
                }
                if ((n5 & 8) != 8) continue;
                graphics.drawImage(imageArray[c2], n2 - (string.length() - n4) * 6, n3, 20);
                continue;
            }
            if (c2 != '\ufffffffd') continue;
            if ((n5 & 4) == 4) {
                graphics.drawImage(imageArray[10], n2 + n4 * 6, n3, 20);
                continue;
            }
            if ((n5 & 8) != 8) continue;
            graphics.drawImage(imageArray[10], n2 - (string.length() - n4) * 6, n3, 20);
        }
    }

    public static byte a(byte[][] byArray, int n, int n2) {
        for (int i = 0; byArray != null && i < byArray.length; ++i) {
            if (byArray[i][0] != n || byArray[i][1] != n2) continue;
            return byArray[i][2];
        }
        return 0;
    }

    public static short[] a(short[] sArray, int n) {
        short[] sArray2 = sArray;
        for (int i = 0; sArray != null && i < sArray.length; ++i) {
            short[] sArray3;
            if (sArray[i] != n) continue;
            n = i;
            if (sArray == null || sArray.length == 1) {
                sArray3 = null;
            } else {
                while (n < sArray.length - 1) {
                    sArray[n] = sArray[n + 1];
                    ++n;
                }
                short[] sArray4 = new short[sArray.length - 1];
                System.arraycopy(sArray, 0, sArray4, 0, sArray.length - 1);
                sArray = sArray4;
                sArray3 = sArray;
            }
            sArray2 = sArray3;
            break;
        }
        return sArray2;
    }

    public static byte[] a(byte[] byArray, int n) {
        if (byArray == null || byArray.length == 1) {
            return null;
        }
        while (n < byArray.length - 1) {
            byArray[n] = byArray[n + 1];
            ++n;
        }
        byte[] byArray2 = new byte[byArray.length - 1];
        System.arraycopy(byArray, 0, byArray2, 0, byArray.length - 1);
        byArray = byArray2;
        return byArray2;
    }

    public static z[] a(z[] zArray, int n) {
        if (zArray == null || zArray.length == 1) {
            return null;
        }
        while (n < zArray.length - 1) {
            zArray[n] = zArray[n + 1];
            ++n;
        }
        z[] zArray2 = new z[zArray.length - 1];
        System.arraycopy(zArray, 0, zArray2, 0, zArray.length - 1);
        zArray = zArray2;
        return zArray2;
    }

    public static byte[] b(byte[] byArray, int n) {
        if (byArray == null) {
            return null;
        }
        for (int i = 0; i < byArray.length; ++i) {
            if (byArray[i] != n) continue;
            return w.a(byArray, i);
        }
        return byArray;
    }

    public static short[][] a(short[][] object, int n) {
        if (object == null || ((short[][])object).length == 1) {
            return null;
        }
        while (n < ((short[][])object).length - 1) {
            object[n] = object[n + 1];
            ++n;
        }
        short[][] sArrayArray = new short[((short[][])object).length - 1][];
        System.arraycopy(object, 0, sArrayArray, 0, ((short[][])object).length - 1);
        object = sArrayArray;
        return sArrayArray;
    }

    public static byte[][] a(byte[][] object, int n) {
        if (object == null || ((byte[][])object).length == 1) {
            return null;
        }
        while (n < ((byte[][])object).length - 1) {
            object[n] = object[n + 1];
            ++n;
        }
        byte[][] byArrayArray = new byte[((byte[][])object).length - 1][];
        System.arraycopy(object, 0, byArrayArray, 0, ((byte[][])object).length - 1);
        object = byArrayArray;
        return byArrayArray;
    }

    public static short[] b(short[] sArray, int n) {
        if (sArray == null) {
            short[] sArray2 = new short[1];
            sArray = sArray2;
            sArray2[0] = (short)n;
            return sArray;
        }
        short[] sArray3 = new short[sArray.length + 1];
        System.arraycopy(sArray, 0, sArray3, 0, sArray.length);
        sArray3[sArray3.length - 1] = (short)n;
        return sArray3;
    }

    public static byte[] c(byte[] byArray, int n) {
        if (byArray == null) {
            byte[] byArray2 = new byte[1];
            byArray = byArray2;
            byArray2[0] = (byte)n;
            return byArray;
        }
        byte[] byArray3 = new byte[byArray.length + 1];
        System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
        byArray3[byArray3.length - 1] = (byte)n;
        return byArray3;
    }

    public static z[] a(z[] zArray, z z2) {
        if (zArray == null) {
            z[] zArray2 = new z[1];
            zArray = zArray2;
            zArray2[0] = z2;
            return zArray;
        }
        z[] zArray3 = new z[zArray.length + 1];
        System.arraycopy(zArray, 0, zArray3, 0, zArray.length);
        zArray3[zArray3.length - 1] = z2;
        return zArray3;
    }

    public static c[] a(c[] cArray, c c2) {
        if (cArray == null) {
            c[] cArray2 = new c[1];
            cArray = cArray2;
            cArray2[0] = c2;
            return cArray;
        }
        c[] cArray3 = new c[cArray.length + 1];
        System.arraycopy(cArray, 0, cArray3, 0, cArray.length);
        cArray3[cArray3.length - 1] = c2;
        return cArray3;
    }

    public static String[] a(String[] stringArray, String string, int n) {
        if (n < 0) {
            return null;
        }
        if (stringArray == null) {
            String[] stringArray2 = new String[1];
            stringArray = stringArray2;
            stringArray2[0] = string;
            return stringArray;
        }
        String[] stringArray3 = new String[stringArray.length + 1];
        if (n < stringArray.length) {
            System.arraycopy(stringArray, 0, stringArray3, 0, n);
            stringArray3[n] = string;
            System.arraycopy(stringArray, n, stringArray3, n + 1, stringArray.length - n);
        } else {
            System.arraycopy(stringArray, 0, stringArray3, 0, stringArray.length);
            stringArray3[stringArray3.length - 1] = string;
        }
        return stringArray3;
    }

    public static String a(String string) {
        System.out.println("\u8bfb\u53d6" + string);
        Object object = new w().getClass().getResourceAsStream(string);
        if (object == null) {
            System.out.println("\u6587\u4ef6" + string + "\u4e0d\u5b58\u5728");
            return null;
        }
        byte[] byArray = new byte[256];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
        try {
            int n = 0;
            while ((n = ((InputStream)object).read(byArray)) != -1) {
                if (string.toLowerCase().endsWith(".cfg")) {
                    for (int i = 7; i < n; i += 8) {
                        byArray[i] = (byte)(byArray[i] + 5);
                    }
                }
                byteArrayOutputStream.write(byArray, 0, n);
            }
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
        byte[] byArray2 = byteArrayOutputStream.toByteArray();
        try {
            ((InputStream)object).close();
            byteArrayOutputStream.close();
        }
        catch (IOException iOException) {
            IOException iOException3 = iOException;
            iOException.printStackTrace();
        }
        String string2 = null;
        try {
            string2 = new String(byArray2, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            object = unsupportedEncodingException;
            unsupportedEncodingException.printStackTrace();
        }
        System.out.println("\u8bfb\u53d6\u6587\u4ef6" + string + "\u5b8c\u6210");
        return string2;
    }

    public static String[] a(String string, String string2, String string3, String string4, String string5) {
        String[] stringArray = null;
        if ((string = w.a(string, string2, string3)) == null) {
            return null;
        }
        stringArray = w.b(string, "\r\n");
        for (int i = 0; stringArray != null && i < stringArray.length; ++i) {
            int n = stringArray[i].indexOf(string4);
            if (n == -1) continue;
            if (string5 != null) {
                int n2 = stringArray[i].indexOf(string5, n);
                if (n2 != -1) {
                    stringArray[i] = stringArray[i].substring(n + string4.length(), n2);
                    continue;
                }
                stringArray[i] = stringArray[i].substring(n + string4.length());
                continue;
            }
            stringArray[i] = stringArray[i].substring(n + string4.length());
        }
        return stringArray;
    }

    public static String[] a(String string, String string2, String string3, String string4) {
        return w.a(string, string2, string3, string4, null);
    }

    public static byte[] a(String object, String string, String string2, String string3) {
        byte[] byArray = null;
        int[] nArray = w.a((String)object, string, string2, string3);
        object = nArray;
        if (nArray != null) {
            byArray = new byte[((Object)object).length];
            for (int i = 0; i < ((Object)object).length; ++i) {
                byArray[i] = (byte)object[i];
            }
        }
        return byArray;
    }

    public static short[] a(String object, String string, String string2, String string3) {
        short[] sArray = null;
        int[] nArray = w.a((String)object, string, string2, string3);
        object = nArray;
        if (nArray != null) {
            sArray = new short[((Object)object).length];
            for (int i = 0; i < ((Object)object).length; ++i) {
                sArray[i] = (short)object[i];
            }
        }
        return sArray;
    }

    public static int[] a(String string, String string2, String string3, String string4) {
        String[] stringArray = null;
        int[] nArray = null;
        if ((string = w.a(string, string2, string3)) == null) {
            return null;
        }
        stringArray = w.b(string, "\r\n");
        if (stringArray != null) {
            nArray = new int[stringArray.length];
            for (int i = 0; stringArray != null && i < stringArray.length; ++i) {
                int n = -1;
                if (string4 != null) {
                    n = stringArray[i].indexOf(string4);
                }
                if (n != -1) {
                    String string5 = stringArray[i].substring(n + string4.length());
                    try {
                        nArray[i] = Integer.parseInt(string5);
                    }
                    catch (Exception exception) {
                        nArray[i] = 0;
                    }
                    continue;
                }
                try {
                    nArray[i] = Integer.parseInt(stringArray[i]);
                    continue;
                }
                catch (Exception exception) {
                    nArray[i] = 0;
                }
            }
        }
        return nArray;
    }

    public static byte[] a(String string, String string2, String string3) {
        return w.a(string, string2, string3, null);
    }

    public static byte[][] a(String string, String string2, String string3, String string4) {
        String[] stringArray = null;
        byte[][] byArrayArray = null;
        if ((string = w.a(string, string2, string3)) == null) {
            return null;
        }
        stringArray = w.b(string, "\r\n");
        if (stringArray != null) {
            byArrayArray = new byte[stringArray.length][];
            for (int i = 0; stringArray != null && i < stringArray.length; ++i) {
                int n = stringArray[i].indexOf(string4);
                if (n == -1) continue;
                stringArray[i] = stringArray[i].substring(n + string4.length());
                byArrayArray[i] = w.b(stringArray[i], ",");
            }
        }
        return byArrayArray;
    }

    public static short[][] a(String string, String string2, String string3, String string4) {
        String[] stringArray = null;
        short[][] sArrayArray = null;
        if ((string = w.a(string, string2, string3)) == null) {
            return null;
        }
        stringArray = w.b(string, "\r\n");
        if (stringArray != null) {
            sArrayArray = new short[stringArray.length][];
            for (int i = 0; stringArray != null && i < stringArray.length; ++i) {
                int n = stringArray[i].indexOf(string4);
                if (n == -1) continue;
                stringArray[i] = stringArray[i].substring(n + string4.length());
                sArrayArray[i] = w.b(stringArray[i], ",");
            }
        }
        return sArrayArray;
    }

    public static String[][] a(String string, String string2, String string3, String string4) {
        String[] stringArray = null;
        String[][] stringArrayArray = null;
        if ((string = w.a(string, string2, string3)) == null) {
            return null;
        }
        stringArray = w.b(string, "\r\n");
        if (stringArray != null) {
            stringArrayArray = new String[stringArray.length][];
            for (int i = 0; stringArray != null && i < stringArray.length; ++i) {
                int n = stringArray[i].indexOf(string4);
                if (n == -1) continue;
                stringArray[i] = stringArray[i].substring(n + string4.length());
                stringArrayArray[i] = w.b(stringArray[i], ",");
            }
        }
        return stringArrayArray;
    }

    public static String a(String string, String string2, String string3) {
        if (string == null || string.equals("")) {
            return null;
        }
        Object var3_4 = null;
        int n = 0;
        n = string2 != null ? string.indexOf(string2) : 0;
        if (n > -1) {
            if (string3 != null) {
                int n2 = string.indexOf(string3, n);
                if (n2 > -1) {
                    String string4 = string2 != null ? string.substring(n + string2.length(), n2) : string.substring(0, n2);
                    return string4;
                }
            } else {
                String string5 = string2 != null ? string.substring(n + string2.length()) : string;
                return string5;
            }
        }
        return null;
    }

    public static String a(String stringArray, String string) {
        if (stringArray == null || string == null || stringArray.equals("") || string.equals("")) {
            return null;
        }
        stringArray = w.b((String)stringArray, "\r\n");
        for (int i = 0; stringArray != null && i < stringArray.length; ++i) {
            if (stringArray[i] == null || stringArray[i].equals("") || !stringArray[i].startsWith(string + "=")) continue;
            return stringArray[i].substring((string + "=").length());
        }
        return null;
    }

    public static int a(String string, String string2) {
        try {
            return Integer.parseInt(w.a(string, string2));
        }
        catch (Exception exception) {
            return 0;
        }
    }

    public static short a(String string, String string2) {
        try {
            return Short.parseShort(w.a(string, string2));
        }
        catch (Exception exception) {
            return 0;
        }
    }

    public static byte a(String string, String string2) {
        try {
            return Byte.parseByte(w.a(string, string2));
        }
        catch (Exception exception) {
            return 0;
        }
    }

    public static int[] a(String string, String string2) {
        return w.b(w.a(string, string2), ",");
    }

    public static short[] a(String string, String string2) {
        return w.b(w.a(string, string2), ",");
    }

    public static byte[] a(String string, String string2) {
        return w.b(w.a(string, string2), ",");
    }

    public static String[] a(String string, String string2) {
        return w.b(w.a(string, string2), ",");
    }

    public static boolean a(short[] sArray, int n) {
        for (int i = 0; sArray != null && i < sArray.length; ++i) {
            if (sArray[i] != n) continue;
            return true;
        }
        return false;
    }

    public static boolean a(byte[] byArray, int n) {
        for (int i = 0; byArray != null && i < byArray.length; ++i) {
            if (byArray[i] != n) continue;
            return true;
        }
        return false;
    }

    public static Image a(String string, String string2) {
        if (string == null || string.equals("") || string2.equals("")) {
            System.out.println("getImageByMap\u53c2\u6570\u4e3anull");
            return null;
        }
        k k2 = null;
        k2 = new k();
        k2.a(string);
        k2.a();
        k2.d();
        k2.b();
        k2.c();
        short s = k2.a;
        short s2 = k2.b;
        byte by = k2.a;
        byte by2 = k2.b;
        au[] auArray = k2.a;
        av[] avArray = k2.a;
        am[][] amArray = k2.a;
        for (int i = 0; auArray != null && i < auArray.length; ++i) {
            auArray[i].a = w.a(string2 + auArray[i].a);
        }
        k2 = Image.createImage((int)s, (int)s2);
        Graphics graphics = k2.getGraphics();
        if (amArray != null && amArray.length > 0) {
            for (int i = 0; amArray != null && i < amArray.length; ++i) {
                int n = 0;
                n = s % by;
                n = n > 0 ? s / by + 1 : s / by;
                int n2 = 0;
                n2 = s2 % by2;
                n2 = n2 > 0 ? s2 / by2 + 1 : s2 / by2;
                be be2 = new be(avArray, auArray, n, n2, by, by2, amArray[i].length);
                for (n2 = 0; amArray[i] != null && n2 < amArray[i].length; ++n2) {
                    be2.a(amArray[i][n2].a, amArray[i][n2].b, amArray[i][n2].c);
                }
                be2.a(graphics);
            }
        }
        System.gc();
        return k2;
    }

    public static void a(Graphics graphics, String string, int n, int n2, int n3, int n4, int n5) {
        graphics.setColor(n4);
        graphics.drawString(string, n - 1, n2 - 1, n5);
        graphics.drawString(string, n - 1, n2 + 1, n5);
        graphics.drawString(string, n + 1, n2 - 1, n5);
        graphics.drawString(string, n + 1, n2 + 1, n5);
        graphics.setColor(n3);
        graphics.drawString(string, n, n2, n5);
    }

    public static String a(byte[] byArray) {
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i = 0; byArray != null && i < byArray.length; ++i) {
            if (i > 0) {
                stringBuffer.append(",");
            }
            stringBuffer.append(byArray[i]);
        }
        return stringBuffer.toString();
    }

    public static String a(String[] stringArray) {
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i = 0; stringArray != null && i < stringArray.length; ++i) {
            if (i > 0) {
                stringBuffer.append(",");
            }
            stringBuffer.append(stringArray[i]);
        }
        return stringBuffer.toString();
    }

    public static int a(int n) {
        if (n < 0) {
            return -1;
        }
        int n2 = 1;
        if (n < 10) {
            n2 = 1;
        } else {
            do {
                ++n2;
            } while ((n /= 10) >= 10);
        }
        return n2;
    }
}
