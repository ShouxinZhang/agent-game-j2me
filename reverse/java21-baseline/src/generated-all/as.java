/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class as {
    private ax a;
    public static Timer a;
    private TimerTask a;
    public q a;
    public long a;
    public long b;
    public g a;
    private boolean a;

    public as(ax ax2, q q2) {
        this.a = ax2;
        this.a = new q(q2.a, q2.b);
        this.a = 3000L;
        this.b = 10000L;
    }

    public final void a() {
        if (a == null) {
            a = new Timer();
        }
        this.a = new aw(this);
        a.schedule(this.a, this.a, this.b);
    }

    public final void b() {
        if (this.a != null) {
            this.a.cancel();
            this.a = null;
        }
        this.a = false;
    }

    static void a(as as2) {
        short s = as2.a.a;
        short s2 = as2.a.b;
        short s3 = (short)(as2.a.a + as2.a.c);
        int n = as2.a.b + as2.a.d;
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        n = Short.MAX_VALUE / (n - s2);
        n = (short)(Math.abs(random.nextInt()) / n);
        as2.a.b = s2 = (short)(s2 + n);
        n = Short.MAX_VALUE / (s3 - s);
        s2 = (short)(Math.abs(random.nextInt()) / n);
        as2.a.a = s = (short)(s + s2);
    }
}
