package bo.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a */
    public final pr f2336a;

    public z(File file) throws IOException {
        pr prVarA = pr.a(file);
        Intrinsics.checkNotNullExpressionValue(prVarA, "open(directory, appVersion, valueCount, maxSize)");
        this.f2336a = prVarA;
    }

    public final void a(String key, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        String strValueOf = String.valueOf(key.hashCode());
        try {
            nr nrVarA = this.f2336a.a(strValueOf);
            OutputStream outputStreamA = nrVarA.a();
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamA);
                outputStreamA.flush();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(outputStreamA, null);
                if (!nrVarA.f1393c) {
                    pr.a(nrVarA.f1394d, nrVarA, true);
                } else {
                    pr.a(nrVarA.f1394d, nrVarA, false);
                    nrVarA.f1394d.d(nrVarA.f1391a.f2066a);
                }
            } finally {
            }
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th, false, (Function0) new y(key, strValueOf), 4, (Object) null);
        }
    }

    public final boolean a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String strValueOf = String.valueOf(key.hashCode());
        try {
            or orVarB = this.f2336a.b(strValueOf);
            boolean z2 = orVarB != null;
            CloseableKt.closeFinally(orVarB, null);
            return z2;
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th, false, (Function0) new v(key, strValueOf), 4, (Object) null);
            return false;
        }
    }

    public final Bitmap b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String strValueOf = String.valueOf(key.hashCode());
        try {
            or orVarB = this.f2336a.b(strValueOf);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(orVarB.f1458a[0]);
                CloseableKt.closeFinally(orVarB, null);
                return bitmapDecodeStream;
            } finally {
            }
        } catch (Throwable th) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.E, th, false, (Function0) new w(key, strValueOf), 4, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x(key, strValueOf), 7, (Object) null);
            return null;
        }
    }
}
