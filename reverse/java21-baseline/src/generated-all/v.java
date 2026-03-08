/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.media.Manager
 *  javax.microedition.media.MediaException
 *  javax.microedition.media.Player
 *  javax.microedition.media.control.VolumeControl
 */
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class v {
    private Player a;
    private VolumeControl a;
    private byte a;
    private boolean a;
    public String a = (byte)100;

    public final void a(String string) {
        try {
            InputStream inputStream = this.getClass().getResourceAsStream(string);
            this.a = string;
            this.a = Manager.createPlayer((InputStream)inputStream, (String)"audio/midi");
            this.a.realize();
            this.a.setLoopCount(-1);
            this.a.prefetch();
            this.b(this.a);
            inputStream.close();
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
        catch (MediaException mediaException) {
            MediaException mediaException2 = mediaException;
            mediaException.printStackTrace();
            return;
        }
    }

    public final void a(int n) {
        if (this.a != null) {
            this.a.setLoopCount(1);
        }
    }

    public final void b(int n) {
        this.a = (byte)n;
        if (this.a == null && this.a != null) {
            this.a = (VolumeControl)this.a.getControl("VolumeControl");
        }
        if (this.a != null) {
            this.a.setLevel((int)this.a);
        }
    }

    public final void a() {
        if (this.a != null && !this.a) {
            try {
                this.a.start();
            }
            catch (MediaException mediaException) {
                MediaException mediaException2 = mediaException;
                mediaException.printStackTrace();
            }
            this.a = true;
        }
    }

    public final void b() {
        if (this.a != null && this.a) {
            try {
                this.a.stop();
            }
            catch (MediaException mediaException) {
                MediaException mediaException2 = mediaException;
                mediaException.printStackTrace();
            }
            this.a = false;
        }
    }

    public final void c() {
        if (((v)((Object)interruptedException2)).a != null) {
            ((v)((Object)interruptedException2)).a.deallocate();
            if (!GameMIDlet.self.notUseMusicClose) {
                ((v)((Object)interruptedException2)).a.close();
            }
            ((v)((Object)interruptedException2)).a = null;
        }
        System.gc();
        try {
            Thread.sleep(20L);
            return;
        }
        catch (InterruptedException interruptedException) {
            InterruptedException interruptedException2 = interruptedException;
            interruptedException.printStackTrace();
            return;
        }
    }
}
