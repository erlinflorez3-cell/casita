package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.logging.Logger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zbm {
    private static final Logger zba = new Logger("GoogleSignInCommon", new String[0]);

    public static Intent zba(Context context, GoogleSignInOptions googleSignInOptions) throws Throwable {
        zba.d("getFallbackSignInIntent()", new Object[0]);
        Intent intentZbc = zbc(context, googleSignInOptions);
        intentZbc.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return intentZbc;
    }

    public static Intent zbb(Context context, GoogleSignInOptions googleSignInOptions) throws Throwable {
        zba.d("getNoImplementationSignInIntent()", new Object[0]);
        Intent intentZbc = zbc(context, googleSignInOptions);
        intentZbc.setAction("com.google.android.gms.auth.NO_IMPL");
        return intentZbc;
    }

    public static Intent zbc(Context context, GoogleSignInOptions googleSignInOptions) throws Throwable {
        zba.d(C1626yg.Ud("<Z\u0006\u0015\tj0tm{2M\u001ddxP<", (short) (FB.Xd() ^ 23645), (short) (FB.Xd() ^ 22540)), new Object[0]);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("9\u0013\u0019LW\u0005Q\u0019s50Zx\u0012\u0016r_o4\u007f6\u0017+", (short) (ZN.Xd() ^ 13491))).getMethod(EO.Od("\u0002/ll\u000eTL\u000bgu`\u0012hV", (short) (C1580rY.Xd() ^ (-5229))), new Class[0]);
        try {
            method.setAccessible(true);
            SignInConfiguration signInConfiguration = new SignInConfiguration((String) method.invoke(context, objArr), googleSignInOptions);
            Intent intent = new Intent(C1561oA.Qd("nyv6nutkog/ambokd^'_di#UhfY\u001e6=<37/H;0-3C,0", (short) (C1499aX.Xd() ^ (-1050))));
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1593ug.zd("Vd[jhc_*`mmtfpw2Huu|n\u0003\u007f", (short) (Od.Xd() ^ (-6781)), (short) (Od.Xd() ^ (-31668)))).getMethod(C1561oA.od("\f\t\u0017q\u0002\u0003\n~\u0004\u0001hz\u0006|", (short) (Od.Xd() ^ (-31720))), new Class[0]);
            try {
                method2.setAccessible(true);
                intent.setPackage((String) method2.invoke(context, objArr2));
                intent.setClass(context, SignInHubActivity.class);
                Bundle bundle = new Bundle();
                String strKd = C1561oA.Kd("\u0019&&\u001f#\"", (short) (ZN.Xd() ^ 8301));
                bundle.putParcelable(strKd, signInConfiguration);
                intent.putExtra(strKd, bundle);
                return intent;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static GoogleSignInResult zbd(Intent intent) {
        if (intent == null) {
            return new GoogleSignInResult(null, Status.RESULT_INTERNAL_ERROR);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new GoogleSignInResult(googleSignInAccount, Status.RESULT_SUCCESS);
        }
        if (status == null) {
            status = Status.RESULT_INTERNAL_ERROR;
        }
        return new GoogleSignInResult(null, status);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.common.api.OptionalPendingResult zbe(com.google.android.gms.common.api.GoogleApiClient r7, android.content.Context r8, com.google.android.gms.auth.api.signin.GoogleSignInOptions r9, boolean r10) {
        /*
            com.google.android.gms.common.logging.Logger r2 = com.google.android.gms.auth.api.signin.internal.zbm.zba
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "silentSignIn()"
            r2.d(r0, r1)
            java.lang.String r1 = "getEligibleSavedSignInResult()"
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r2.d(r1, r0)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            com.google.android.gms.auth.api.signin.internal.zbn r0 = com.google.android.gms.auth.api.signin.internal.zbn.zbc(r8)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r6 = r0.zbb()
            r3 = 0
            if (r6 != 0) goto L2e
        L1f:
            r4 = r3
        L20:
            if (r4 == 0) goto L95
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "Eligible saved sign in result found"
            r2.d(r0, r1)
            com.google.android.gms.common.api.OptionalPendingResult r0 = com.google.android.gms.common.api.PendingResults.immediatePendingResult(r4, r7)
            return r0
        L2e:
            android.accounts.Account r1 = r6.getAccount()
            android.accounts.Account r0 = r9.getAccount()
            if (r1 != 0) goto L41
            if (r0 != 0) goto L1f
        L3a:
            boolean r0 = r9.isServerAuthCodeRequested()
            if (r0 == 0) goto L48
            goto L1f
        L41:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3a
            goto L1f
        L48:
            boolean r0 = r9.isIdTokenRequested()
            if (r0 == 0) goto L64
            boolean r0 = r6.isIdTokenRequested()
            if (r0 != 0) goto L55
            goto L1f
        L55:
            java.lang.String r1 = r9.getServerClientId()
            java.lang.String r0 = r6.getServerClientId()
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r1, r0)
            if (r0 != 0) goto L64
            goto L1f
        L64:
            java.util.HashSet r4 = new java.util.HashSet
            java.util.ArrayList r0 = r6.getScopes()
            r4.<init>(r0)
            java.util.HashSet r1 = new java.util.HashSet
            java.util.ArrayList r0 = r9.getScopes()
            r1.<init>(r0)
            boolean r0 = r4.containsAll(r1)
            if (r0 != 0) goto L7d
            goto L1f
        L7d:
            com.google.android.gms.auth.api.signin.internal.zbn r0 = com.google.android.gms.auth.api.signin.internal.zbn.zbc(r8)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r0.zba()
            if (r1 == 0) goto L1f
            boolean r0 = r1.isExpired()
            if (r0 != 0) goto L1f
            com.google.android.gms.auth.api.signin.GoogleSignInResult r4 = new com.google.android.gms.auth.api.signin.GoogleSignInResult
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r4.<init>(r1, r0)
            goto L20
        L95:
            if (r10 == 0) goto La7
            com.google.android.gms.auth.api.signin.GoogleSignInResult r2 = new com.google.android.gms.auth.api.signin.GoogleSignInResult
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r0 = 4
            r1.<init>(r0)
            r2.<init>(r3, r1)
            com.google.android.gms.common.api.OptionalPendingResult r0 = com.google.android.gms.common.api.PendingResults.immediatePendingResult(r2, r7)
            return r0
        La7:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "trySilentSignIn()"
            r2.d(r0, r1)
            com.google.android.gms.auth.api.signin.internal.zbg r0 = new com.google.android.gms.auth.api.signin.internal.zbg
            r0.<init>(r7, r8, r9)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r1 = r7.enqueue(r0)
            com.google.android.gms.common.api.internal.OptionalPendingResultImpl r0 = new com.google.android.gms.common.api.internal.OptionalPendingResultImpl
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.zbm.zbe(com.google.android.gms.common.api.GoogleApiClient, android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions, boolean):com.google.android.gms.common.api.OptionalPendingResult");
    }

    public static PendingResult zbf(GoogleApiClient googleApiClient, Context context, boolean z2) {
        zba.d("Revoking access", new Object[0]);
        String savedRefreshToken = Storage.getInstance(context).getSavedRefreshToken();
        zbh(context);
        return z2 ? zbb.zba(savedRefreshToken) : googleApiClient.execute(new zbk(googleApiClient));
    }

    public static PendingResult zbg(GoogleApiClient googleApiClient, Context context, boolean z2) {
        zba.d("Signing out", new Object[0]);
        zbh(context);
        return z2 ? PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, googleApiClient) : googleApiClient.execute(new zbi(googleApiClient));
    }

    private static void zbh(Context context) {
        zbn.zbc(context).zbd();
        Iterator<GoogleApiClient> it = GoogleApiClient.getAllClients().iterator();
        while (it.hasNext()) {
            it.next().maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
    }
}
