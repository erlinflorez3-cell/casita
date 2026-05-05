package yg;

/* JADX INFO: loaded from: classes.dex */
public class Qu implements Runnable {
    private final AbstractC1552lK<T> Xd;

    public Qu(AbstractC1552lK<T> abstractC1552lK) {
        this.Xd = abstractC1552lK;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.Xd.iY(this.Xd.yY());
    }
}
