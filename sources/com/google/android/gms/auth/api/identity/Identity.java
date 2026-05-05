package com.google.android.gms.auth.api.identity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p000authapi.zbaf;
import com.google.android.gms.internal.p000authapi.zbap;
import com.google.android.gms.internal.p000authapi.zbz;

/* JADX INFO: loaded from: classes8.dex */
public final class Identity {
    private Identity() {
    }

    public static AuthorizationClient getAuthorizationClient(Activity activity) {
        return new zbz((Activity) Preconditions.checkNotNull(activity), new zbb(null).zbb());
    }

    public static AuthorizationClient getAuthorizationClient(Context context) {
        return new zbz((Context) Preconditions.checkNotNull(context), new zbb(null).zbb());
    }

    public static CredentialSavingClient getCredentialSavingClient(Activity activity) {
        return new zbaf((Activity) Preconditions.checkNotNull(activity), new zbh());
    }

    public static CredentialSavingClient getCredentialSavingClient(Context context) {
        return new zbaf((Context) Preconditions.checkNotNull(context), new zbh());
    }

    public static SignInClient getSignInClient(Activity activity) {
        return new zbap((Activity) Preconditions.checkNotNull(activity), new zbu());
    }

    public static SignInClient getSignInClient(Context context) {
        return new zbap((Context) Preconditions.checkNotNull(context), new zbu());
    }
}
