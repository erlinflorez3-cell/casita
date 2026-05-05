package r;

import java.util.Scanner;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class civilian extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public static final civilian f28246a = new civilian();

    public civilian() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            return CollectionsKt.toList(StringsKt.split$default((CharSequence) new Scanner(Runtime.getRuntime().exec("mount").getInputStream()).useDelimiter("\\A").next(), new String[]{"\n"}, false, 0, 6, (Object) null));
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }
}
