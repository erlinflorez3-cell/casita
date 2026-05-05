package com.dynatrace.agent.lifecycle.callback;

import android.app.Activity;
import android.os.Bundle;
import com.dynatrace.agent.lifecycle.AppStartupManager;
import com.dynatrace.agent.lifecycle.VisibilityManager;
import com.dynatrace.agent.lifecycle.VisibilityManagerKt;
import com.dynatrace.agent.lifecycle.model.AppStartupPhase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\bnjG0L͜P.hS2\u000fq{<$q$yCAX Ԃ8ޛ\u007fN\u0016f/_j\u000fQ\u000f\u001e\u0016'k<Mczu\u0012=5ԲsA9Q}B\u0002n\u0003<\u001d `)h}\u0013\t2*v\u0019=\u000f\fc\u001a\u001cH@\u001fA\u0003\u0011[\r2\u00124GP\u0007,g\u007fPLG\u001bi\u0001Ck\u0011wOf'\u000e7-Q\u001bNl';\u007f(2sNEC-%\u0002\n7ViG\u001b? FK|o59X\fWd_0\u0018#3g\r\f{lpM_n\u001c?+}j{T\u001c0\u0010z*\u0016\u0003\u0018^\u00125HF-Hg^ԇ5ϢvSHАRjP\u0002\u0013ad\u001a{ı5ڢ=\u001bnϟŎ?*"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~Wy'>j\u0012,S\r\u0017iC\"&lpMmg-Nt;ESN\u0013``\u0002=\u001d\u0012gc", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~Wy'>j\u0012,S\r\u0018gB\u001epfp=\u0018g;b]+HLL@ZYr\u001b\u0010\u0019a\u000bJ)\u0013\u0013/", "/o_ g(Kb)\nbZ5x\u000b/r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~5\t+%|\u0012;\\SFS0'\u0011jaF\\", "Dhb6U0EW(\u0013bZ5x\u000b/r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~J\u0002.;j\u001a5QROS0'\u0011jaF\\", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u001e\u001bHo\fPt,5#Y+B[%*ZRKv\u001c\u001a\u001edc9\u00149\u0013L\u0001/\u0011Kb5Xa\u007f9\u0012\u0012$\nP+\u0016\u0014#H(oD53\u00063IK,l\u000f\u0010\u0013\u0012<n\u007fV>\fPu\u0017uN~,7", "=m00g0OW(\u0013eh:\fu/s\u00100{?", "", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "=m00g0OW(\u0013ek,Z\u0016/a\u000f(z", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=m00g0OW(\u0013ek,j\u0018+r\u000f(z", "=m00g0OW(\u0013hm(\n\u0018/d", "=m00g0OW(\u0013eZ<\u000b\t.", "=m00g0OW(\u0013hm6\b\u0014/d", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ActivityLifecycleListener extends BaseActivityLifecycleCallbacks {
    private final AppStartupManager appStartupManager;
    private final VisibilityManager visibilityManager;

    public ActivityLifecycleListener(AppStartupManager appStartupManager, VisibilityManager visibilityManager) {
        Intrinsics.checkNotNullParameter(appStartupManager, "appStartupManager");
        Intrinsics.checkNotNullParameter(visibilityManager, "visibilityManager");
        this.appStartupManager = appStartupManager;
        this.visibilityManager = visibilityManager;
    }

    @Override // com.dynatrace.agent.lifecycle.callback.BaseActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.visibilityManager.onActivityPaused(VisibilityManagerKt.toIdHash(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.appStartupManager.onStartupPhase(AppStartupPhase.ACTIVITY_RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.appStartupManager.onStartupPhase(AppStartupPhase.ACTIVITY_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.appStartupManager.onStartupPhase(AppStartupPhase.ACTIVITY_START);
    }

    @Override // com.dynatrace.agent.lifecycle.callback.BaseActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.visibilityManager.onActivityStarted(VisibilityManagerKt.toIdHash(activity));
    }

    @Override // com.dynatrace.agent.lifecycle.callback.BaseActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.visibilityManager.onActivityStopped(VisibilityManagerKt.toIdHash(activity), activity.isChangingConfigurations());
    }
}
