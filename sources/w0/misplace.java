package w0;

import cz.msebera.android.httpclient.client.methods.HttpPost;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class misplace {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final misplace f28393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final misplace f28394b;

    static {
        misplace misplaceVar = new misplace("GET", 0);
        f28393a = misplaceVar;
        misplace misplaceVar2 = new misplace(HttpPost.METHOD_NAME, 1);
        f28394b = misplaceVar2;
        EnumEntriesKt.enumEntries(new misplace[]{misplaceVar, misplaceVar2});
    }

    public misplace(String str, int i2) {
    }
}
