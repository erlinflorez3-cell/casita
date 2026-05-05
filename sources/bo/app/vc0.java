package bo.app;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public final class vc0 extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wc0 f2038a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc0(wc0 wc0Var, int i2) {
        super(i2);
        this.f2038a = wc0Var;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 > 0) {
            int i3 = i2 - 1;
            if (((ByteArrayOutputStream) this).buf[i3] == 13) {
                i2 = i3;
            }
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i2, this.f2038a.f2131b.name());
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }
}
