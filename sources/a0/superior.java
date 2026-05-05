package a0;

import android.location.Location;
import android.os.Build;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class superior extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final superior f78a = new superior();

    public superior() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Location location = (Location) obj;
        return Boolean.valueOf(Build.VERSION.SDK_INT >= 31 ? location.isMock() : location.isFromMockProvider());
    }
}
