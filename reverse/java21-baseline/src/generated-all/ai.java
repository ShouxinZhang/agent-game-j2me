/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class ai
implements Runnable {
    private Thread a;
    private final al a;

    public ai(al al2) {
        this.a = al2;
        this.a = null;
        al2.a = w.a("/sys/sword.ps");
        al2.b = w.a("/sys/swordred.ps");
        al2.c = w.a("/sys/legamelogo.png");
        this.a = new Thread(this);
        this.a.start();
    }

    public final void run() {
        this.a.b();
        if (GameMIDlet.self.moreSleep) {
            try {
                Thread.sleep(200L);
            }
            catch (InterruptedException interruptedException) {
                InterruptedException interruptedException2 = interruptedException;
                interruptedException.printStackTrace();
            }
        }
        this.a.a = true;
    }
}
