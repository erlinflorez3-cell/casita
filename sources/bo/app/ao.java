package bo.app;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ao extends BrazeConfigurationProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
