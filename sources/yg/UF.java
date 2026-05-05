package yg;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class UF {
    public final long Kd;
    public final int Xd;

    public UF(HN hn) throws IOException {
        this.Xd = hn.Kd();
        if (hn.wd()) {
            hn.Xd();
            hn.Xd();
            hn.Qd();
            this.Kd = hn.Yd();
            hn.ud();
            return;
        }
        this.Kd = hn.Yd();
        hn.Kd();
        hn.Xd();
        hn.Xd();
        hn.Qd();
    }
}
