package com.statsig.androidsdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.`Y2\u000fq~<$i-yCAU\"}0\tWNmgvJp\u000bK\u000f\f\u001d~̓Bկ\u0006x\f\u0011OERsM3eok:pxD\u000782P;ѩ\t\u0001(.\u0011\u0016\u0005\u0007[M\"\u0011^F9@`\u001ae\u0005H L>h\u0007,k\u007fNdV3]\u0003G1\u0013\u0002B|8\u00104\u000b_%F\u0003-=|o1CBM4C9\u001a\u0017O`iT\u001b? N5l59CI\"]|lH\"#Ag\r\f\u0004V`\u0013cx\fU1\u0016w\u0014^\u001c?\u0010z*\u001el\b\u001c\u0018?H\\3`zP$A\r\u000bSna2bP\u0012\u0013ad\u001dU\u0004ADQ\u001b\u0015e(Oa\\E\u0016\u001d\rL41r/ml\u000e\u000f\u001bah@_?lX=v_:]K\u007f\u001cp\u0011\bp\u0018xK\u000eK\u0014\u0011\\(uCi9;!\u001a\u0003\u001fֶiЛ\t`pׅ:`VE:p,6X\u000fbɱP\u0081\tkXӹ)8\u001fO4T5\u0001^ʹ\"Ϣ{<)ط`Z]o\u0002j{e`ɛ;Ϭ;Yv\u0088^cGgK5\u007fkfУ^λ\u0018?DϵUdtLk\f\td~β>ʮn\u0010\u007fӻ\u0015Z\u001a\u001eJ? $\u000bμ=Ǭ`\u0015PґڅF^"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)75{/;~\u001a=a*?l4\u001c)fh9mg:]v0GY$", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u0006K\fKz69h\u0012\u0007;n\u0016,aABk\u0012\u001a\u001co^5\u0005i:$", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", ":hbAX5>`", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`.s\u000f<t93`}\u007fHm\u001f=4GIz4'\u0015u7", "uKP;W9HW\u0018Hvi7Fd:p\u0007,y<\u0010\u001b!PEt:\u0001-~g\r\u001cF{\u001a0\u0017?DjA(\u0019go8\r-\u0013Rw'E`L3\\2\u0004=\u001d!A\u0012\\:\r\u000eYNy25", "1ta?X5M/\u0017\u000e~o0\f\u001d", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", ">`d@X+", "", "@dbB`,=", "AsP?g,=", "As^=c,=", "5dc\u0010h9KS\"\u000eV\\;\u0001\u001a3t\u0014", "7r0=c3BQ\u0015\u000e~h5`\u0012\u0010o\r(}M\u000b' F", "", "7r0=c3BQ\u0015\u000e~h5m\r=i|/{", "=m00g0OW(\u0013Xk,x\u0018/d", "", "/bc6i0Mg", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=m00g0OW(\u0013Y^:\f\u00169y\u007f'", "=m00g0OW(\u0013eZ<\u000b\t.", "=m00g0OW(\u0013g^:\r\u0011/d", "=m00g0OW(\u0013hZ=|l8s\u000f$\u0005>\u0001\u0005&C~\u000e", "=tc g(MS", "=m00g0OW(\u0013hm(\n\u0018/d", "=m00g0OW(\u0013hm6\b\u0014/d", "AgdAW6P\\", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class StatsigActivityLifecycleListener implements Application.ActivityLifecycleCallbacks {
    private final Application application;
    private Activity currentActivity;
    private final LifecycleEventListener listener;
    private int paused;
    private int resumed;
    private int started;
    private int stopped;

    public StatsigActivityLifecycleListener(Application application, LifecycleEventListener lifecycleEventListener) throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (-22337));
        int[] iArr = new int["\u0016$#\u001e\u001a\u0013\u0010\"\u0016\u001b\u0019".length()];
        QB qb = new QB("\u0016$#\u001e\u001a\u0013\u0010\"\u0016\u001b\u0019");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(application, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(lifecycleEventListener, C1561oA.Kd("ecnpbldr", (short) (C1499aX.Xd() ^ (-14996))));
        this.application = application;
        this.listener = lifecycleEventListener;
        Object[] objArr = {this};
        Method method = Class.forName(Wg.Zd("nVF>5I>q\u00170y2/hr`WKC!\u0010\u0010\u0002", (short) (Od.Xd() ^ (-32366)), (short) (Od.Xd() ^ (-30189)))).getMethod(Wg.vd("{onqxzhvBesisgouEc]]XoV`V5P\\YPLO\u0015\u001e", (short) (ZN.Xd() ^ 29841)), Class.forName(C1561oA.Xd("iwn}{vr=q\u0002\u0003AU\u0006\u0007\u0004\u0002|{\u0010\u0006\r\rCa\u0005\u0017\r\u001b\u000f\u001b!t\u0013\u0011\u0011\u0010'\u0012\u001c\u0016t\u0014 !\u0018\u0018\u001b$-", (short) (C1607wl.Xd() ^ 9798))));
        try {
            method.setAccessible(true);
            method.invoke(application, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final boolean isApplicationInForeground() {
        return this.resumed > this.paused;
    }

    private final boolean isApplicationVisible() {
        return this.started > this.stopped;
    }

    public final Activity getCurrentActivity() {
        return this.currentActivity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.currentActivity = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.currentActivity = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.paused++;
        if (isApplicationInForeground()) {
            return;
        }
        this.listener.onAppBlur();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.currentActivity = activity;
        this.resumed++;
        this.listener.onAppFocus();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.started++;
        this.currentActivity = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.stopped++;
        this.currentActivity = null;
        if (isApplicationVisible()) {
            return;
        }
        this.listener.onAppBlur();
    }

    public final void shutdown() {
        this.application.unregisterActivityLifecycleCallbacks(this);
    }
}
