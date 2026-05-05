package yg;

/* JADX INFO: loaded from: classes.dex */
public final class QB {
    public final int Kd;
    private int Xd = 0;
    public final String Yd;

    public QB(String str) {
        this.Yd = str;
        this.Kd = str.length();
    }

    public int KK() {
        char cCharAt = this.Yd.charAt(this.Xd);
        this.Xd++;
        int i2 = (423437670 ^ 610839843) ^ 1029011386;
        return (i2 + cCharAt) - (i2 | cCharAt);
    }

    public boolean YK() {
        return this.Xd < this.Kd;
    }
}
