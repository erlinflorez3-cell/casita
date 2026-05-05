package h1;

import android.content.Context;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pair {
    public static final boolean a(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }
}
