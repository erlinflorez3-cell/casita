package bo.app;

import com.facebook.cache.disk.DefaultDiskStorage;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class vu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f2067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public nr f2069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f2071f;

    public vu(String str, int i2, File file) {
        this.f2066a = str;
        this.f2070e = i2;
        this.f2071f = file;
        this.f2067b = new long[i2];
    }

    public final File a(int i2) {
        return new File(this.f2071f, this.f2066a + "." + i2 + DefaultDiskStorage.FileType.TEMP);
    }
}
