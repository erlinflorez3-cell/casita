package j;

import android.content.pm.PackageManager;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class close extends FunctionReferenceImpl implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final close f19787a = new close();

    public close() {
        super(3, h1.superior.class, "getPackageInfoInternal", "getPackageInfoInternal(Landroid/content/pm/PackageManager;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;", 1);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return h1.superior.a((PackageManager) obj, (String) obj2, ((Number) obj3).intValue());
    }
}
