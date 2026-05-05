package yg;

/* JADX INFO: loaded from: classes.dex */
class pX implements Runnable {
    private final int Kd;
    private final int Xd;
    final /* synthetic */ RY Yd;

    public pX(RY ry, int i2, int i3) {
        this.Yd = ry;
        this.Xd = i2;
        this.Kd = i3;
    }

    @Override // java.lang.Runnable
    public void run() {
        long jKd = Od.Kd() ^ 2601039965261240253L;
        try {
            Thread.sleep(((long) this.Yd.Xd(this.Xd)) * jKd);
        } catch (Throwable th) {
        }
        do {
            this.Yd.FK();
            try {
                Thread.sleep(((long) this.Yd.Xd(this.Kd)) * jKd);
            } catch (Throwable th2) {
            }
        } while (!this.Yd.Kd.get());
    }
}
