package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.interfaces.TaskInterface;
import com.facebook.react.interfaces.fabric.ReactSurface;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import yg.InterfaceC1492Gx;

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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:299)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
@Metadata(bv = {}, d1 = {"Яġ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013.H\u007f*,(w\u000ffp:8D{H6RY+\u0017k\u00124,[*rK;k\u001a\u0006\"\u000fPVgunRҙ\u0013C%\u0006\u001exp,QU\u000f]\u001aƁ:B\u0006?;ݹw=O`|Ȃ\r @.@ц\r\u00010*PƵ~zYK\u0014\u0012F@x:X\rU\u00050\u0012\u000e>6\u0001&\\mO>H\u0003]Bǂ+\u0003wHV'e0\u0005M#F\\܋\u0015vo'3@=9\u001d%i\u0003\u000fRaF\t$\bܵ5hU&s]\u0002kNX.)E5]#ux6^\u0015Q\u000f!UB\u0016\b\u0014^\u001c@\u0010z*\"l\b\u001c\u001f?H\\G`\u000bP0A\u0010\u000bUVO0zr\u0004\t~N\u0017S\u001ec/G:~Q\u0010[ITE\u001d\u001d\u000f4\"/\u0011g\u007f\u001d2n83Z\bSAQnbvr:]K\u0014\u001cp\u0011\"Z\u0010>n\u00187\u0012\u0010\\?\u000e9q8\u0002J2&\u0011Ju!\u001d`\u0017h0v\u0011h0\u001a.7X\u001e<^R\u0011\u001dk~\u0002\t0\u001f{4T5-8\u0017.\r\u0010<OT@T]\u001a\u0002lc\\8Wu\u000b\u007f_|\u001f&Wg\u0013yY\u001aq\u001e\u0017jvBTlf\u0013u~B\u0002*!\u0001p(@~\u0003\u0010&\u0011\u000brT#@u\n\u001cbAa\u001fjA`\u00054Ao*O\u0004#x\u001e6l3R\u0018\u001a*\u00035\u0019Rro\u001e\u0015?mt\u0003nZEA\u007fJ_J\u001e2vl\u0015#5\u0014$\u0006U\u0014dIbkD#\u001c h&(ri/k(?\u00057^\u001a/[K!\u0013\u0018qZA\t6\u0012\u000fi}^m\u0016\u0017\t.vix|\u0005\u001d01vt9\u0007\u0013;@\u0006\u000f\tU l\u000b\nSyv\u0011\u0017TNf/KCf3\u000f.:|cBs++U\u0010\u0014]I(\u00022\u0004<:z\u00156vu\u0004Z\tD\u0014\u0013UkXS8wyEbj8zDZH\u0019\r8L\u0017J%9XCtp\u0005M{\"u\"/\u0015:O\tV\nOCs\fMF_X\u000e\n\"\\jQh)Sci}my\u00029nU.[\u000e?n*\u001eS\u001f\u0005X9ץ2Ӓw\u001cNCAd\u0013?Y6B0T\n!B\u0003n\\ز|ķJc'\u00198H\u0002B'\u001eb\u0001tVv\u000e7ҋbՃ.\u0005\u0017\u00119(\u0007@\u0002\u0015{Rl/\u0012?WӜ\u001f͢\u001fng\u0001l39S%K)8p\u0003!D\fT Π8\u0086K-\u0006mu\u001eF+ն\u001c\u00adȳ\u001b=Y\u0013e\u0016^]πY)Ͱhu"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VR\u0018J\u0006z", "", "1ta?X5M@\u0019zxm\n\u0007\u0012>e\u00137", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "5dc\u0010h9KS\"\u000eg^(z\u0018\ro\t7{S\u0010", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\u00125U{/\u0015w\u001f=MVJA", "2de h7I]&\u000ebZ5x\u000b/r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&VqD\u0012m9]^#PHP,i(", "5dc\u0011X=,c$\n\u0005k;d\u00058a\u0002(\t", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0016\u0017X}\u001eG\u0002/BhG$@|\u0016;N?9kBgshr'\u0017n7X\u00046/HW(^R\u007f\u0013", ":hU2V@<Z\u0019l\nZ;|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW#z&5W\u0012\u001e>m\u0004=IR;A", "5dc\u0019\\->Q-|\u0002^\u001a\f\u0005>e", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0015!Ow\u0018E@\f9Z}\u001eKk\u001d.;R7z4s", ";d\\<e@)`\u0019\r\tn9|u9u\u000f(\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E(\u0001\u001f!T\u0004xIv3Ci\u000b $w&=MP\u0011", "5dc\u001aX4H`-i\b^:\u000b\u0019<el2\fO\u0001$", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ~\u0017Oy\u001bPa25g\f0Dm\u00038]R;x\n", "@dP0g\u0018NS)~Xh5}\r1u\r$\u000bD\u000b ", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoWH\u0007%EYG\r7i\u0014=9S;{4{\u001fqb=\ts9J\u0006+QU$", "5dc\u001fX(<b\u0005\u000fzn,Z\u00138f\u0004*\fM|&\u001bQx", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@1EY\u000e \u0001Z\u0016*KR'{4.\u0015FkB\bg.^\u0004#VPX52", "/cS\u000fX-H`\u0019]zl;\n\u0013CL\u00046\u000b@\n\u0017$", "", "=m12Y6KSw~\tm9\u0007\u001d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "/cS\u001fX(<b|\b\tm(\u0006\u0007/E\u0011(\u0005Og\u001b%Vo\u0017<\u0004", ":hbAX5>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VS\u0017J\u0006!>W}\u007fHm\u001f=4GIz4'\u0015u7", "1qT.g,,c&\u007fv\\,", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tp\n:v3~Zy\u001dDq\u0014w:C7iC\f%ub5\u0005c\u0002", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ";nSB_,'O!~", "", "7mXA\\(E>&\t\u0006l", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "2dbAe6R", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tp\n:v3~Hy.=Q\u001f=MP<g2\u001ej", "\u001aiPCTuEO\"\u0001DO6\u0001\b\u0005", "@dP@b5", "3w", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", "7me._0=O(~", "=m00g0OW(\u0013g^:\r\u0010>", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "@d`BX:M1#}z", "", "@dbB_;\u001c]\u0018~", "2`c.", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "=m1.V2)`\u0019\r\t^+", "", "=m2<a-BU)\fvm0\u0007\u0012\rh{1}@\u007f", "=m7<f;\u001dS'\u000e\bh@", "=m7<f;%S\u0015\u0010zA0\u0006\u0018", "=m7<f;)O)\rz", "=m7<f;+S'\u000f\u0003^", "2dU.h3M0\u0015|\u0001;<\f\u00189nc0\u0007G", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG~7n\u0012>TR\u001egA\u001d'dn9c_*TS6P/J5[YrJi", "=m=2j\u0010Gb\u0019\b\n", "7mc2a;", "=mF6a+Hey\txn:Z\f+n\u0002(", "6`b\u0013b*Na", "@d[<T+", "@d\\<i,\u001bS\u001a\t\b^\u000b|\u0017>r\n<bD\u000f&\u0017Po\u001b", "@d\\<i,+S\u0015|\nB5\u000b\u0018+n}([Q\u0001 &.s\u001cKv.5f", "AsP?g", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface ReactHost {
    void addBeforeDestroyListener(Function0<Unit> function0);

    void addReactInstanceEventListener(ReactInstanceEventListener reactInstanceEventListener);

    ReactSurface createSurface(Context context, String str, Bundle bundle);

    TaskInterface<Void> destroy(String str, Exception exc);

    ReactContext getCurrentReactContext();

    DevSupportManager getDevSupportManager();

    LifecycleState getLifecycleState();

    MemoryPressureRouter getMemoryPressureRouter();

    ReactQueueConfiguration getReactQueueConfiguration();

    void invalidate();

    void onActivityResult(Activity activity, int i2, int i3, Intent intent);

    boolean onBackPressed();

    void onConfigurationChanged(Context context);

    void onHostDestroy();

    void onHostDestroy(Activity activity);

    void onHostLeaveHint(Activity activity);

    void onHostPause();

    void onHostPause(Activity activity);

    void onHostResume(Activity activity);

    void onHostResume(Activity activity, DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler);

    void onNewIntent(Intent intent);

    void onWindowFocusChange(boolean z2);

    TaskInterface<Void> reload(String str);

    void removeBeforeDestroyListener(Function0<Unit> function0);

    void removeReactInstanceEventListener(ReactInstanceEventListener reactInstanceEventListener);

    TaskInterface<Void> start();
}
