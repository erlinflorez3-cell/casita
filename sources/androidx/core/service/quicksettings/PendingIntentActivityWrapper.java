package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.PendingIntentCompat;

/* JADX INFO: loaded from: classes4.dex */
public class PendingIntentActivityWrapper {
    private final Context mContext;
    private final int mFlags;
    private final Intent mIntent;
    private final boolean mIsMutable;
    private final Bundle mOptions;
    private final PendingIntent mPendingIntent;
    private final int mRequestCode;

    public PendingIntentActivityWrapper(Context context, int i2, Intent intent, int i3, boolean z2) {
        this(context, i2, intent, i3, null, z2);
    }

    public PendingIntentActivityWrapper(Context context, int i2, Intent intent, int i3, Bundle bundle, boolean z2) {
        this.mContext = context;
        this.mRequestCode = i2;
        this.mIntent = intent;
        this.mFlags = i3;
        this.mOptions = bundle;
        this.mIsMutable = z2;
        this.mPendingIntent = createPendingIntent();
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getRequestCode() {
        return this.mRequestCode;
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public Bundle getOptions() {
        return this.mOptions;
    }

    public boolean isMutable() {
        return this.mIsMutable;
    }

    public PendingIntent getPendingIntent() {
        return this.mPendingIntent;
    }

    private PendingIntent createPendingIntent() {
        Bundle bundle = this.mOptions;
        if (bundle == null) {
            return PendingIntentCompat.getActivity(this.mContext, this.mRequestCode, this.mIntent, this.mFlags, this.mIsMutable);
        }
        return PendingIntentCompat.getActivity(this.mContext, this.mRequestCode, this.mIntent, this.mFlags, bundle, this.mIsMutable);
    }
}
