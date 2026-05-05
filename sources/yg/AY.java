package yg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AY {
    public final List<UF> Xd = new ArrayList();

    public AY(byte[] bArr, int i2, boolean z2, boolean z3) throws IOException {
        HN hn = new HN(bArr, z2, z3);
        for (int i3 = 0; i3 < i2; i3++) {
            this.Xd.add(new UF(hn));
        }
    }
}
