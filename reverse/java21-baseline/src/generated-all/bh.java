/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class bh
implements Runnable {
    private Thread a;
    private final d a;

    public bh(d d2) {
        this.a = d2;
        d2.a = w.a("/sys/sword.ps");
        d2.b = w.a("/sys/swordred.ps");
        d2.c = w.a("/sys/legamelogo.png");
        this.a = new Thread(this);
        this.a.start();
    }

    public final void run() {
        d.a(this.a);
        this.a.a = true;
    }
}
