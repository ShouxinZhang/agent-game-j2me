/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class bi
implements Runnable {
    private Thread a;
    private final t a;

    public bi(t t2) {
        this.a = t2;
        this.a = null;
        t.a(t2, w.a("/sys/sword.ps"));
        t.b(t2, w.a("/sys/swordred.ps"));
        t.c(t2, w.a("/sys/legamelogo.png"));
        this.a = new Thread(this);
        this.a.start();
    }

    public final void run() {
        this.a.a();
        try {
            Thread.sleep(500L);
        }
        catch (InterruptedException interruptedException) {
            InterruptedException interruptedException2 = interruptedException;
            interruptedException.printStackTrace();
        }
        this.a.a = true;
    }
}
