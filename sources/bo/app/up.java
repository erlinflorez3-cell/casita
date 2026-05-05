package bo.app;

import android.content.Context;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
public final class up extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f1959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultBrazeImageLoader f1960b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(Context context, DefaultBrazeImageLoader defaultBrazeImageLoader, Continuation continuation) {
        super(2, continuation);
        this.f1959a = context;
        this.f1960b = defaultBrazeImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new up(this.f1959a, this.f1960b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new up(this.f1959a, this.f1960b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ip ipVar = DefaultBrazeImageLoader.Companion;
        Context context = this.f1959a;
        ipVar.getClass();
        short sXd = (short) (C1633zX.Xd() ^ (-31309));
        int[] iArr = new int["xMZ\u0005\u000e]1".length()];
        QB qb = new QB("xMZ\u0005\u000e]1");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        String strQd = C1561oA.Qd("]UOVYH0BMD", (short) (C1499aX.Xd() ^ (-10005)));
        short sXd2 = (short) (C1633zX.Xd() ^ (-18792));
        short sXd3 = (short) (C1633zX.Xd() ^ (-31656));
        int[] iArr2 = new int["brsft\u007f5qvkrqy}ptv\u0005A\u0001\b\fE{z}\u0004\u0002".length()];
        QB qb2 = new QB("brsft\u007f5qvkrqy}ptv\u0005A\u0001\b\fE{z}\u0004\u0002");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        String str = new String(iArr2, 0, i3);
        Intrinsics.checkNotNullParameter(str, strQd);
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od(",8-:6/)q&1/4$,1i})',\u001c.)", (short) (FB.Xd() ^ 13590))).getMethod(C1561oA.Kd("|{\f[z}\u0004\u0002a\b\u0012", (short) (C1580rY.Xd() ^ (-31736))), new Class[0]);
        try {
            method.setAccessible(true);
            File file = new File(d1.a(sb.append(((File) method.invoke(context, objArr)).getPath()), File.separator, str));
            ReentrantLock reentrantLock = this.f1960b.diskCacheLock;
            DefaultBrazeImageLoader defaultBrazeImageLoader = this.f1960b;
            reentrantLock.lock();
            try {
                try {
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    BrazeLogger.brazelog$default(brazeLogger, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) rp.f1702a, 14, (Object) null);
                    defaultBrazeImageLoader.diskLruCache = new z(file);
                    BrazeLogger.brazelog$default(brazeLogger, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) sp.f1785a, 14, (Object) null);
                    defaultBrazeImageLoader.isDiskCacheStarting = false;
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DefaultBrazeImageLoader.TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) tp.f1882a, 8, (Object) null);
                }
                return Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
