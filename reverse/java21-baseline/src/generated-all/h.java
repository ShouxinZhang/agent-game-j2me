/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class h {
    private Vector a = new Vector();

    public final void a(int n) {
        this.a.addElement(new Integer(n));
    }

    public final void a(z z2) {
        this.a.addElement(z2);
    }

    public final byte[] a() {
        if (this.a.size() > 0) {
            byte[] byArray = new byte[this.a.size()];
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = ((Integer)this.a.elementAt(i)).byteValue();
            }
            return byArray;
        }
        return null;
    }

    public final z[] a() {
        if (this.a.size() > 0) {
            z[] zArray = new z[this.a.size()];
            for (int i = 0; i < zArray.length; ++i) {
                zArray[i] = (z)this.a.elementAt(i);
            }
            return zArray;
        }
        return null;
    }
}
