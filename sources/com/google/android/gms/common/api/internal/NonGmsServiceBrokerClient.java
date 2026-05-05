package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Set;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class NonGmsServiceBrokerClient implements Api.Client, ServiceConnection {
    private static final String zaa = "NonGmsServiceBrokerClient";
    private final String zab;
    private final String zac;
    private final ComponentName zad;
    private final Context zae;
    private final ConnectionCallbacks zaf;
    private final Handler zag;
    private final OnConnectionFailedListener zah;
    private IBinder zai;
    private boolean zaj;
    private String zak;
    private String zal;

    public NonGmsServiceBrokerClient(Context context, Looper looper, ComponentName componentName, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, null, null, componentName, connectionCallbacks, onConnectionFailedListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r7 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private NonGmsServiceBrokerClient(android.content.Context r3, android.os.Looper r4, java.lang.String r5, java.lang.String r6, android.content.ComponentName r7, com.google.android.gms.common.api.internal.ConnectionCallbacks r8, com.google.android.gms.common.api.internal.OnConnectionFailedListener r9) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zaj = r0
            r1 = 0
            r2.zak = r1
            r2.zae = r3
            com.google.android.gms.internal.base.zau r0 = new com.google.android.gms.internal.base.zau
            r0.<init>(r4)
            r2.zag = r0
            r2.zaf = r8
            r2.zah = r9
            if (r5 == 0) goto L24
            if (r6 == 0) goto L24
            if (r7 != 0) goto L27
            r7 = r1
        L1d:
            r2.zab = r5
            r2.zac = r6
            r2.zad = r7
            return
        L24:
            if (r7 == 0) goto L27
            goto L1d
        L27:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r0 = "Must specify either package or component, but not both"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient.<init>(android.content.Context, android.os.Looper, java.lang.String, java.lang.String, android.content.ComponentName, com.google.android.gms.common.api.internal.ConnectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener):void");
    }

    public NonGmsServiceBrokerClient(Context context, Looper looper, String str, String str2, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, str, str2, null, connectionCallbacks, onConnectionFailedListener);
    }

    private final void zad() {
        if (Thread.currentThread() != this.zag.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void connect(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) throws Throwable {
        zad();
        String.valueOf(this.zai);
        if (isConnected()) {
            try {
                disconnect(Jg.Wd("R\u001e8s\u0006v#\u0012.%\u0004=cVj%{[g DhE\f- 7u&?\u001ee\u007f?Un;?9", (short) (C1633zX.Xd() ^ (-3376)), (short) (C1633zX.Xd() ^ (-6188))));
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.zad;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.zab).setAction(this.zac);
            }
            Context context = this.zae;
            int defaultBindFlags = GmsClientSupervisor.getDefaultBindFlags();
            short sXd = (short) (OY.Xd() ^ 17538);
            short sXd2 = (short) (OY.Xd() ^ 11533);
            int[] iArr = new int["ejo\u0014p`\u0010 r\u000f<\u0017\u000b`TZ\u0004\u007f\bej<\u0003".length()];
            QB qb = new QB("ejo\u0014p`\u0010 r\u000f<\u0017\u000b`TZ\u0004\u007f\bej<\u0003");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[3];
            short sXd3 = (short) (Od.Xd() ^ (-7918));
            short sXd4 = (short) (Od.Xd() ^ (-859));
            int[] iArr2 = new int["z\u001bWG\ru5\fN'jHGtU<N\u000bzCB5".length()];
            QB qb2 = new QB("z\u001bWG\ru5\fN'jHGtU<N\u000bzCB5");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            clsArr[1] = Class.forName(Ig.wd("\u0017xz/y\u0016z;\u0011SRx\u001a\u0017O\u0011\r\u0007Zd\u0018\\\u0003^\u001fPp:8y\u0019G(", (short) (OY.Xd() ^ 4841)));
            clsArr[2] = Integer.TYPE;
            Object[] objArr = {intent, this, Integer.valueOf(defaultBindFlags)};
            Method method = cls.getMethod(EO.Od("F}dC1\b9M\u0013ay", (short) (FB.Xd() ^ 15312)), clsArr);
            try {
                method.setAccessible(true);
                boolean zBooleanValue = ((Boolean) method.invoke(context, objArr)).booleanValue();
                this.zaj = zBooleanValue;
                if (!zBooleanValue) {
                    this.zai = null;
                    this.zah.onConnectionFailed(new ConnectionResult(16));
                }
                String.valueOf(this.zai);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (SecurityException e3) {
            this.zaj = false;
            this.zai = null;
            throw e3;
        }
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void disconnect() throws Throwable {
        zad();
        String.valueOf(this.zai);
        try {
            Context context = this.zae;
            Class<?> cls = Class.forName(C1561oA.Qd("[g\\ie^X!U`^cS[`\u0019-XV[K]X", (short) (C1633zX.Xd() ^ (-20526))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1593ug.zd("t\u0003y\t\u0007\u0002}H~\f\f\u0013\u0005\u000f\u0016Pv\n\u0018\u001d\u0011\f\u000fm\u001b\u001b\u001c\u0014\u0013%\u001b\"\"", (short) (FB.Xd() ^ 23377), (short) (FB.Xd() ^ 1475)));
            Object[] objArr = {this};
            Method method = cls.getMethod(C1561oA.od("=5(.2'\u0015&25' !", (short) (C1633zX.Xd() ^ (-27967))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IllegalArgumentException unused) {
        }
        this.zaj = false;
        this.zai = null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void disconnect(String str) throws Throwable {
        zad();
        this.zak = str;
        disconnect();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    public IBinder getBinder() {
        zad();
        return this.zai;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final String getEndpointPackageName() {
        String str = this.zab;
        if (str != null) {
            return str;
        }
        Preconditions.checkNotNull(this.zad);
        return this.zad.getPackageName();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final String getLastDisconnectMessage() {
        return this.zak;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final IBinder getServiceBrokerBinder() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Intent getSignInIntent() {
        return new Intent();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean isConnected() {
        zad();
        return this.zai != null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean isConnecting() {
        zad();
        return this.zaj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) throws Throwable {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.common.api.internal.zacg
            @Override // java.lang.Runnable
            public final void run() {
                this.zaa.zaa(iBinder);
            }
        };
        Handler handler = this.zag;
        Class<?> cls = Class.forName(C1561oA.Kd("GUL[YTP\u001b]b\u001e9SaXa[i", (short) (C1607wl.Xd() ^ 29945)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1607wl.Xd() ^ 1255);
        short sXd2 = (short) (C1607wl.Xd() ^ 11747);
        int[] iArr = new int["~\u000bOmq\b,l\u001d\u001bO&V\nP\u0005Fr".length()];
        QB qb = new QB("~\u000bOmq\b,l\u001d\u001bO&V\nP\u0005Fr");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {runnable};
        short sXd3 = (short) (C1607wl.Xd() ^ 31731);
        int[] iArr2 = new int["kkpr".length()];
        QB qb2 = new QB("kkpr");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) throws Throwable {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.common.api.internal.zacf
            @Override // java.lang.Runnable
            public final void run() {
                this.zaa.zab();
            }
        };
        Handler handler = this.zag;
        Class<?> cls = Class.forName(Wg.vd("myr\u007f\u007fxv?\u0004\u0007D]y\u0006~\u0006\u0002\u000e", (short) (Od.Xd() ^ (-16693))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (ZN.Xd() ^ 27425);
        short sXd2 = (short) (ZN.Xd() ^ 4925);
        int[] iArr = new int["\u0016\f \nU\u0013\u0007\u0013\u000bPs\u0016\u000e\r~~\b\u007f".length()];
        QB qb = new QB("\u0016\f \nU\u0013\u0007\u0013\u000bPs\u0016\u000e\r~~\b\u007f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {runnable};
        Method method = cls.getMethod(hg.Vd("\u001f\u001d  ", (short) (OY.Xd() ^ 25271), (short) (OY.Xd() ^ 15450)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void onUserSignOut(BaseGmsClient.SignOutCallbacks signOutCallbacks) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean providesSignIn() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        return false;
    }

    final /* synthetic */ void zaa(IBinder iBinder) {
        this.zaj = false;
        this.zai = iBinder;
        String.valueOf(iBinder);
        this.zaf.onConnected(new Bundle());
    }

    final /* synthetic */ void zab() {
        this.zaj = false;
        this.zai = null;
        String.valueOf((Object) null);
        this.zaf.onConnectionSuspended(1);
    }

    public final void zac(String str) {
        this.zal = str;
    }
}
