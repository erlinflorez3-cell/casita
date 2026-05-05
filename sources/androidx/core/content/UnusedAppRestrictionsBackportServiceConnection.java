package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
class UnusedAppRestrictionsBackportServiceConnection implements ServiceConnection {
    private final Context mContext;
    ResolvableFuture<Integer> mResultFuture;
    IUnusedAppRestrictionsBackportService mUnusedAppRestrictionsService = null;
    private boolean mHasBoundService = false;

    UnusedAppRestrictionsBackportServiceConnection(Context context) {
        this.mContext = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IUnusedAppRestrictionsBackportService iUnusedAppRestrictionsBackportServiceAsInterface = IUnusedAppRestrictionsBackportService.Stub.asInterface(iBinder);
        this.mUnusedAppRestrictionsService = iUnusedAppRestrictionsBackportServiceAsInterface;
        try {
            iUnusedAppRestrictionsBackportServiceAsInterface.isPermissionRevocationEnabledForApp(getBackportCallback());
        } catch (RemoteException unused) {
            this.mResultFuture.set(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.mUnusedAppRestrictionsService = null;
    }

    public void connectAndFetchResult(ResolvableFuture<Integer> resolvableFuture) throws Throwable {
        if (this.mHasBoundService) {
            throw new IllegalStateException(C1626yg.Ud("JN62c*UzzD\u0015M\u0003\f_yM@\u000b\r)DJ\"Vl\u0002s\u0001|ec\u0012Nj\n*1p{:\u0005<U)bA9\u0016\u001fI\u0001qc\u000e\u0015>\u0014\u0018&'vPw\u0016t\u0012\u00183\u0004.4\u0011B*", (short) (C1580rY.Xd() ^ (-20781)), (short) (C1580rY.Xd() ^ (-32269))));
        }
        this.mHasBoundService = true;
        this.mResultFuture = resolvableFuture;
        Intent intent = new Intent(hg.Vd("8D9FB;5}BC=<:<=u<4:7(&\"0/0\"//,\"\u001b+\u001f$\"&_\u0012\u0013#\u0017\u001c\u001aXl\u001e\u001b\u001b\u0015\u0012x\u0011\u0017\u0014\u0005\u0003^\r\fl~\f\f\t~w\b{\u0001~\u0003Pnovzxz{Yjvykde", (short) (C1580rY.Xd() ^ (-13067)), (short) (C1580rY.Xd() ^ (-21723))));
        Context context = this.mContext;
        Class<?> cls = Class.forName(C1561oA.ud("7C8EA:4|1<:?/7<t\t427'94", (short) (C1607wl.Xd() ^ 13828)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-20014));
        int[] iArr = new int[":7E 018-B?&9E7<9U".length()];
        QB qb = new QB(":7E 018-B?&9E7<9U");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            Intent intent2 = intent.setPackage(PackageManagerCompat.getPermissionRevocationVerifierApp((PackageManager) method.invoke(context, objArr)));
            Context context2 = this.mContext;
            Class<?> cls2 = Class.forName(C1561oA.Yd("?MDSQLH\u0013IVV]OY`\u001b1^^eWkh", (short) (ZN.Xd() ^ 31333)));
            Class<?>[] clsArr2 = new Class[3];
            short sXd2 = (short) (Od.Xd() ^ (-25143));
            short sXd3 = (short) (Od.Xd() ^ (-18733));
            int[] iArr2 = new int["ESJYWRN\u0019O\\\\cU_f!=cj\\fm".length()];
            QB qb2 = new QB("ESJYWRN\u0019O\\\\cU_f!=cj\\fm");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                i3++;
            }
            clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
            clsArr2[1] = Class.forName(Jg.Wd("lH-\nwD2Hl_/ c_6^rII\u001ayF;i\u0005r9!im7,Y", (short) (OY.Xd() ^ 17799), (short) (OY.Xd() ^ 9361)));
            clsArr2[2] = Integer.TYPE;
            Object[] objArr2 = {intent2, this, 1};
            Method method2 = cls2.getMethod(ZO.xd("hu\u000e-\u001cGn|\rdc", (short) (OY.Xd() ^ 4410), (short) (OY.Xd() ^ 23677)), clsArr2);
            try {
                method2.setAccessible(true);
                method2.invoke(context2, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public void disconnectFromService() throws Throwable {
        if (!this.mHasBoundService) {
            throw new IllegalStateException(C1593ug.zd("v~\u0005{k~\r\u0012\u0006\u0001\u0004?\u000e\u0017\u0016\u0018D\b\fG\f\u000b\u0017\u0018\u0012\u0012N\u0012\u0016\u0018\"&\u001aU,&\u001b#) ", (short) (C1499aX.Xd() ^ (-32339)), (short) (C1499aX.Xd() ^ (-24707))));
        }
        this.mHasBoundService = false;
        Context context = this.mContext;
        short sXd = (short) (FB.Xd() ^ 9889);
        int[] iArr = new int["\bKo\u0016\u000bG&HBZ[\u0004EDB^.`\bu+b@".length()];
        QB qb = new QB("\bKo\u0016\u000bG&HBZ[\u0004EDB^.`\bu+b@");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Object[] objArr = {this};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("rj]cg\\J[gj\\UV", (short) (C1633zX.Xd() ^ (-13031))), Class.forName(EO.Od("\u0015jp%{2~K/]X~\u001a33\u0011RJ/[\u000eO+\r\tcA\u0012UT\u001d\u0007U", (short) (C1499aX.Xd() ^ (-20908)))));
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.UnusedAppRestrictionsBackportServiceConnection$1 */
    class AnonymousClass1 extends IUnusedAppRestrictionsBackportCallback.Stub {
        AnonymousClass1() {
        }

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
        public void onIsPermissionRevocationEnabledForAppResult(boolean z2, boolean z3) throws RemoteException {
            if (!z2) {
                UnusedAppRestrictionsBackportServiceConnection.this.mResultFuture.set(0);
            } else if (z3) {
                UnusedAppRestrictionsBackportServiceConnection.this.mResultFuture.set(3);
            } else {
                UnusedAppRestrictionsBackportServiceConnection.this.mResultFuture.set(2);
            }
        }
    }

    private IUnusedAppRestrictionsBackportCallback getBackportCallback() {
        return new IUnusedAppRestrictionsBackportCallback.Stub() { // from class: androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.1
            AnonymousClass1() {
            }

            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
            public void onIsPermissionRevocationEnabledForAppResult(boolean z2, boolean z3) throws RemoteException {
                if (!z2) {
                    UnusedAppRestrictionsBackportServiceConnection.this.mResultFuture.set(0);
                } else if (z3) {
                    UnusedAppRestrictionsBackportServiceConnection.this.mResultFuture.set(3);
                } else {
                    UnusedAppRestrictionsBackportServiceConnection.this.mResultFuture.set(2);
                }
            }
        };
    }
}
