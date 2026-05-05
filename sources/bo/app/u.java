package bo.app;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f1897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f1898b;

    public u(Bitmap bitmap, Map map) {
        this.f1897a = bitmap;
        this.f1898b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.f1897a, uVar.f1897a) && Intrinsics.areEqual(this.f1898b, uVar.f1898b);
    }

    public final int hashCode() {
        Bitmap bitmap = this.f1897a;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Map map = this.f1898b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "BitmapAndHeaders(bitmap=" + this.f1897a + ", headers=" + this.f1898b + ')';
    }
}
