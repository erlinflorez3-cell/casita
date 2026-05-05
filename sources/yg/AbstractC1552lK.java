package yg;

/* JADX INFO: renamed from: yg.lK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1552lK {
    private Thread Kd;
    private T Xd;

    public synchronized T hY() {
        if (this.Kd == null) {
            return null;
        }
        try {
            this.Kd.join();
        } catch (InterruptedException e2) {
        }
        this.Kd = null;
        return this.Xd;
    }

    public void iY(T t2) {
        this.Xd = t2;
    }

    public synchronized void rY() {
        if (this.Kd != null) {
            return;
        }
        this.Kd = new Thread(new Qu(this));
        this.Kd.start();
    }

    protected abstract T yY();
}
