package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.QB;
import yg.Xu;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!4i\bDZc|İI\u0006>\u00176B\u0005\"4\u0012\u0006\u000enʑA0ZeP\u008cZS8\u0018s{:&c$\bCCU \u007f*\t]No˧vJp\u000bK\u000f\f\u0016\u0011\u0006:կmx\f\u001172poo;SoK:xvL\u0004N4h=ѩ\t\u0001 -`\"\u0005\u0001[K:\u0012X@\u001fA\u0003\u0011[\r2\u00124Gf\u007f6hu]NH\u001bb\u0001ǉaɨmB\\7w<\u000b^%F\u0003,Sǻ ӿ/@EE-9a\u0015\u001fR\nR3I\u007fQ\u001dn7);I\"\\dmF\u0014-G]#urTo5Un\u0019?+}q{Z\u001c<\u0010\u0001\f\u000fL\u0004<\u000bU]t-:r\u0016\u0012Kt!X\u0017ГTެF\u007f\u0003ʨV-3\nK-O\u001a\u0015P\u0018ݢo\u05cd9߉\t\u0013&ŀ\u0011p'fb\u001a\u0001#)a\u0010SGPnK\u001fݓ\u0016ՒAm\f͏Đ\u0006A"}, d2 = {"/r2<e6Nb\u001d\bz=0\u000b\u0014+t}+{M", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E<\n\u0016$Qs\r\u0006Y!>X\u0005 DL\u001a<X?Ji7\u001e\">", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "<`\\2", "", "4q^:", "\u001b@G,7\f%/\r", "", "/r7.a+ES&", "\u001a`]1e6BRb\t\t(\u0013\u0007\u0013:e\r}", "/rh;V", "", "\u001b`X;", "5dc\u001aT0G\u0012\u0015\b\u0004h;x\u00183o\t6", "u(E", "1g^?X6@`\u0015\n}^9", "\u001a`]1e6BRb\u0010~^>Ff2o\r(\u0006B\u000e\u0013\"Jo\u001b\u0012", "/vP6g\rKO!~", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "/vP6g\rKO!~he6\u000fs+t\u0003", "CoS.g,\u001cV#\fzh.\n\u0005:h\u007f5WI\u007f\u0002!U~nIr-57y'>j\u0012,S", "", "1n]A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", ">nbA99:[\u0019\\ve3y\u0005-k", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eowI\u007f$!Kn"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class HandlerDispatcherKt {
    private static final long MAX_DELAY = 4611686018427387903L;
    public static final HandlerDispatcher Main;
    private static volatile Choreographer choreographer = null;

    static {
        Object objM8980constructorimpl;
        byte b2 = 0;
        byte b3 = 0;
        try {
            Result.Companion companion = Result.Companion;
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(C1561oA.Qd("t\u0001u\u0003~wq:z}7Tvuuiu", (short) (FB.Xd() ^ 2788))).getDeclaredMethod(C1593ug.zd("65E\u001f4=C\"FGI?M", (short) (C1580rY.Xd() ^ (-1798)), (short) (C1580rY.Xd() ^ (-30556))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                objM8980constructorimpl = Result.m8980constructorimpl(new HandlerContext(asHandler((Looper) declaredMethod.invoke(null, objArr), true), b3 == true ? 1 : 0, 2, b2 == true ? 1 : 0));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
        }
        Main = (HandlerDispatcher) (Result.m8986isFailureimpl(objM8980constructorimpl) ? null : objM8980constructorimpl);
    }

    public static final Handler asHandler(Looper looper, boolean z2) throws IllegalAccessException, InvocationTargetException {
        if (!z2) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }

    public static final Object awaitFrame(Continuation<? super Long> continuation) throws Throwable {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return awaitFrameSlowPath(continuation);
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        postFrameCallback(choreographer2, cancellableContinuationImpl);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitFrameSlowPath(Continuation<? super Long> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        Looper looperMyLooper = Looper.myLooper();
        short sXd = (short) (C1499aX.Xd() ^ (-16974));
        int[] iArr = new int["\u000f\u001b\u0010\u001d\u0019\u0012\fT\u0015\u0018Qn\u0011\u0010\u0010\u0004\u0010".length()];
        QB qb = new QB("\u000f\u001b\u0010\u001d\u0019\u0012\fT\u0015\u0018Qn\u0011\u0010\u0010\u0004\u0010");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Kd("76F 5>D#GHJ@N", (short) (C1607wl.Xd() ^ 7956)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            if (looperMyLooper == ((Looper) declaredMethod.invoke(null, objArr))) {
                updateChoreographerAndPostFrameCallback(cancellableContinuationImpl2);
            } else {
                Dispatchers.getMain().mo10550dispatch(cancellableContinuationImpl2.getContext(), new Runnable() { // from class: kotlinx.coroutines.android.HandlerDispatcherKt$awaitFrameSlowPath$lambda$3$$inlined$Runnable$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        HandlerDispatcherKt.updateChoreographerAndPostFrameCallback(cancellableContinuationImpl2);
                    }
                });
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final HandlerDispatcher from(Handler handler) {
        return from$default(handler, null, 1, null);
    }

    public static final HandlerDispatcher from(Handler handler, String str) {
        return new HandlerContext(handler, str);
    }

    public static /* synthetic */ HandlerDispatcher from$default(Handler handler, String str, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            str = null;
        }
        return from(handler, str);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001tU}(gY[+\u0003U'?\u001cIM\u00125Dq\u001ae\u000bKon")
    @InterfaceC1492Gx
    public static /* synthetic */ void getMain$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback(Choreographer choreographer2, final CancellableContinuation<? super Long> cancellableContinuation) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.HandlerDispatcherKt$$ExternalSyntheticLambda0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                HandlerDispatcherKt.postFrameCallback$lambda$6(cancellableContinuation, j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback$lambda$6(CancellableContinuation cancellableContinuation, long j2) {
        cancellableContinuation.resumeUndispatched(Dispatchers.getMain(), Long.valueOf(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateChoreographerAndPostFrameCallback(CancellableContinuation<? super Long> cancellableContinuation) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.checkNotNull(choreographer2);
            choreographer = choreographer2;
        }
        postFrameCallback(choreographer2, cancellableContinuation);
    }
}
