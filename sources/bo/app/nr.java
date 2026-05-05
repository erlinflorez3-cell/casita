package bo.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class nr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vu f1391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f1392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr f1394d;

    public nr(pr prVar, vu vuVar) {
        this.f1394d = prVar;
        this.f1391a = vuVar;
        this.f1392b = vuVar.f2068c ? null : new boolean[prVar.f1539g];
    }

    public final OutputStream a() {
        FileOutputStream fileOutputStream;
        mr mrVar;
        pr prVar = this.f1394d;
        if (prVar.f1539g <= 0) {
            throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.f1394d.f1539g);
        }
        synchronized (prVar) {
            vu vuVar = this.f1391a;
            if (vuVar.f2069d != this) {
                throw new IllegalStateException();
            }
            if (!vuVar.f2068c) {
                this.f1392b[0] = true;
            }
            File fileA = vuVar.a(0);
            try {
                fileOutputStream = new FileOutputStream(fileA);
            } catch (FileNotFoundException unused) {
                this.f1394d.f1533a.mkdirs();
                try {
                    fileOutputStream = new FileOutputStream(fileA);
                } catch (FileNotFoundException unused2) {
                    return pr.f1532q;
                }
            }
            mrVar = new mr(this, fileOutputStream);
        }
        return mrVar;
    }
}
