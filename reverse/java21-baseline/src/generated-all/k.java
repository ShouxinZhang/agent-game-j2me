/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class k {
    public au[] a;
    public av[] a;
    public am[][] a;
    public b[][] a;
    private byte[] b;
    public short a;
    public short b;
    public byte a;
    public byte b;
    public byte[] a;
    private String a;

    public final void a(String string) {
        this.a = string;
        this.b = null;
    }

    private byte[] a(String string) {
        Object object;
        byte[] byArray = null;
        try {
            object = object.getClass().getResourceAsStream(string);
            int n = 0;
            n = ((InputStream)object).available();
            if (n <= 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
                byte[] byArray2 = new byte[256];
                while (((InputStream)object).read(byArray2) != -1) {
                    byteArrayOutputStream.write(byArray2);
                }
                byArray = byteArrayOutputStream.toByteArray();
            } else {
                byArray = new byte[n];
                ((InputStream)object).read(byArray);
            }
            ((InputStream)object).close();
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
        }
        return byArray;
    }

    private int a(int n) {
        int n2 = -1;
        byte[] byArray = new byte[2];
        int n3 = 0;
        for (int i = 0; this.b != null && i < this.b.length; ++i) {
            byte by = this.b[i];
            if (n3 <= 1) {
                byArray[n3] = by;
                ++n3;
            } else {
                byArray[0] = byArray[1];
                byArray[1] = by;
            }
            if (byArray[0] != -1 || byArray[1] != n) continue;
            n2 = i;
            break;
        }
        return n2;
    }

    public final boolean a() {
        if (this.a == null) {
            return false;
        }
        try {
            if (this.b == null) {
                this.b = this.a(this.a);
            }
            int n = this.a(1);
            int n2 = this.a(12);
            DataInputStream dataInputStream = null;
            if (n > -1) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.b, n + 1, this.b.length - n - 1);
                dataInputStream = new DataInputStream(byteArrayInputStream);
                this.a = dataInputStream.readShort();
                this.b = dataInputStream.readShort();
                this.a = dataInputStream.readByte();
                this.b = dataInputStream.readByte();
                dataInputStream.close();
                byteArrayInputStream.close();
            }
            if (n2 > -1) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.b, n2 + 1, this.b.length - n2 - 1);
                dataInputStream = new DataInputStream(byteArrayInputStream);
                if ((n2 = dataInputStream.readByte() & 0xFF) > 0) {
                    this.a = new byte[n2];
                    for (int i = 0; i < n2; ++i) {
                        this.a[i] = dataInputStream.readByte();
                    }
                }
                dataInputStream.close();
                byteArrayInputStream.close();
            }
            return true;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return false;
        }
    }

    public final boolean b() {
        if (this.a == null) {
            return false;
        }
        try {
            if (this.b == null) {
                this.b = this.a(this.a);
            }
            int n = this.a(2);
            DataInputStream dataInputStream = null;
            if (n > -1) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.b, n + 1, this.b.length - n - 1);
                dataInputStream = new DataInputStream(byteArrayInputStream);
                int n2 = dataInputStream.readByte() & 0xFF;
                if (n2 > 0) {
                    this.a = new au[n2];
                }
                for (int i = 0; i < n2; ++i) {
                    this.a[i] = new au();
                    this.a[i].a = dataInputStream.readByte();
                    this.a[i].a = dataInputStream.readUTF();
                }
                dataInputStream.close();
                byteArrayInputStream.close();
            }
            return true;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return false;
        }
    }

    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        try {
            if (this.b == null) {
                this.b = this.a(this.a);
            }
            int n = this.a(3);
            DataInputStream dataInputStream = null;
            if (n > -1) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.b, n + 1, this.b.length - n - 1);
                dataInputStream = new DataInputStream(byteArrayInputStream);
                int n2 = dataInputStream.readByte() & 0xFF;
                if (n2 > 0) {
                    this.a = new av[n2];
                }
                for (int i = 0; i < n2; ++i) {
                    this.a[i] = new av();
                    this.a[i].a = (short)(dataInputStream.readByte() & 0xFF);
                    this.a[i].a = dataInputStream.readByte();
                    this.a[i].b = dataInputStream.readShort();
                    this.a[i].c = dataInputStream.readShort();
                    this.a[i].d = dataInputStream.readShort();
                    this.a[i].e = dataInputStream.readShort();
                    this.a[i].b = dataInputStream.readByte();
                    this.a[i].c = dataInputStream.readByte();
                }
                dataInputStream.close();
                byteArrayInputStream.close();
            }
            return true;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return false;
        }
    }

    public final boolean d() {
        if (this.a == null) {
            return false;
        }
        try {
            if (this.b == null) {
                this.b = this.a(this.a);
            }
            int n = this.a(7);
            DataInputStream dataInputStream = null;
            if (n > -1) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.b, n + 1, this.b.length - n - 1);
                dataInputStream = new DataInputStream(byteArrayInputStream);
                int n2 = dataInputStream.readByte() & 0xFF;
                this.a = new am[n2][];
                for (int i = 0; i < n2; ++i) {
                    int n3 = dataInputStream.readShort();
                    this.a[i] = new am[n3];
                    for (int j = 0; j < n3; ++j) {
                        this.a[i][j] = new am();
                        this.a[i][j].a = dataInputStream.readByte();
                        this.a[i][j].b = dataInputStream.readByte();
                        this.a[i][j].c = dataInputStream.readByte();
                    }
                }
                dataInputStream.close();
                byteArrayInputStream.close();
            }
            return true;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return false;
        }
    }

    public final boolean e() {
        if (this.a == null) {
            return false;
        }
        try {
            if (this.b == null) {
                this.b = this.a(this.a);
            }
            int n = this.a(11);
            DataInputStream dataInputStream = null;
            if (n > -1) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.b, n + 1, this.b.length - n - 1);
                dataInputStream = new DataInputStream(byteArrayInputStream);
                int n2 = dataInputStream.readByte() & 0xFF;
                this.a = new b[n2][];
                for (int i = 0; i < n2; ++i) {
                    int n3 = dataInputStream.readShort();
                    this.a[i] = new b[n3];
                    for (int j = 0; j < n3; ++j) {
                        this.a[i][j] = new b();
                        this.a[i][j].a = dataInputStream.readShort();
                        this.a[i][j].b = dataInputStream.readShort();
                        this.a[i][j].c = dataInputStream.readShort();
                        this.a[i][j].d = dataInputStream.readShort();
                        dataInputStream.readByte();
                    }
                }
                dataInputStream.close();
                byteArrayInputStream.close();
            }
            return true;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return false;
        }
    }
}
