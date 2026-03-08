/*
 * Decompiled with CFR 0.152.
 */
import java.util.TimerTask;

final class aw
extends TimerTask {
    private final as a;

    aw(as as2) {
        this.a = as2;
    }

    public final void run() {
        as.a(this.a);
        if (this.a.a != null) {
            this.a.a.b = true;
        }
    }
}
