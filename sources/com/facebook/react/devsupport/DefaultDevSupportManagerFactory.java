package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.packagerconnection.RequestHandler;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`_2şs{B-cҕyCQU\"Ԃ*\teNo˧vJh\u0011KƤ\u000e\u0016\u0007\r4Ikxe܈\u00172XoG\u074cUoS9hҚ>\u000562*8\u007f\u0006\u0017ɝHc@v)B\u0004\u000b-pC¤>R\u001bMM\u0013 \u0007V / \rk\\9`l\f>_'\u0011nZNUe`\u0003[\u0014^V=\f%iN/N@M\u0015S]3\r`fW\u0005Upk\u0011\u0019-58aum5\u0007\u000eD\u00199^%]!6\r\u0017_q$5;QsK~\u00168y\u000b{;O\u001a\r49x4;.~\n$2#\b\u0004F^\u0018vD\u0016y\u0010MG+\u000eKC;1e\u007fz\u0002-\u0017g\n\u0006%\u001eQ\u0003\u001f%iW&`C\u001f\u0005{_Ki@kN~\u0010gD\u0006\u0006\u0007a0244U\tG{?8G)EjQ#O{HMלk\u0013"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~8}!3}\u001d=,CLYD) rnHn_5Jx'T-J*k\\\u007fQi", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~8}1%}!9WPJS0'\u0011jaFg_*]\u00014[\"", "u(E", "1qT.g,", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&VqD\u0012m9]^#PHP,i(", "/o_9\\*:b\u001d\t\u0004<6\u0006\u0018/x\u000f", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "@dP0g\u0010Ga(z\u0004\\,d\u00058a\u0002(\t#\u0001\u001e\"G|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~F}\u001c5|y7[R7t2\u001eshr\u001c\u0007j7N\u0004|", ">`R8T.>`\u0004z\na\r\u0007\u0016\u0014S\\8\u0005?\b\u0017\u007fCw\u000e", "", "3mP/_,(\\v\fzZ;|", "", "@dS\u000fb?!O\"}\u0002^9", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5!\u001e\u0014EkLi_5M}'T\"", "2de\u000fh5=Z\u0019]\u0005p5\u0004\u0013+df,\nO\u0001 \u0017T", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&EqB\u0006j,-\u00019PSX([9vK#\u0012c\u000e[\u0001", ";h]\u001bh4,V\u0015\u0005zl", "", "1tbAb4)O\u0017\u0005v`,\nf9m\b$\u0005?c\u0013 Fv\u000eI\u0005", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EK|\u0015\u001dCq\u000eIt/>b}\u001eFq 7\u00170;wD\u001e#wD5\u0010b3N\u0004|", "Ata3T*>2\u0019\u0006z`(\f\t\u0010a}7\u0006M\u0015", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW*\u000726U{ \u0016m\u001d.O?Jk\u0015\u001a\u0013wkF\u001b9", "2de\u0019b(=W\"\u0001kb,\u000fp+n{*{M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&Ok5\u0006g5Pg+G^6(eNt=!g", ">`d@X+\"\\w~wn.~\t<O\u0011(\tG|+~Cx\n>v2", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u001f\u001a%va8jl\u000bNs7INN9FcrJ\u001b\u000enuJ4\t\u0007YNy", "@dP0g\u0010Ga(z\u0004\\,[\t@H\u007f/\u0007@\u000e", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DefaultDevSupportManagerFactory implements DevSupportManagerFactory {
    private static final Companion Companion = new Companion(null);
    private static final String DEVSUPPORT_IMPL_CLASS = "BridgeDevSupportManager";
    private static final String DEVSUPPORT_IMPL_PACKAGE = "com.facebook.react.devsupport";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005\"2ߝx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈ƪ6F"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~8}!3}\u001d=,CLYD) rnHn_5Jx'T-J*k\\\u007fQRod\u0016Y'\u0016\tcJy", "", "u(E", "\u0012DE H\u0017)=\u0006mtB\u0014go)Cf\u0004i.", "", "\u0012DE H\u0017)=\u0006mtB\u0014go)P[\u0006a\u001cbv", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Deprecated(message = ",T;;r\u000b$i\u0018V.:d\u001d1\u000e_a\u001c;\u0014u\u0015ewHzo\u000ew6ki`i\u0002Skzx*#I-'f\\\t4l5<s?;\u0017\u001e-\u0015G/\u0006F\u001b", replaceWith = @ReplaceWith(expression = "create(applicationContext, reactInstanceManagerHelper, packagerPathForJSBundleName, enableOnCreate, redBoxHandler, devBundleDownloadListener, minNumShakes, customPackagerCommandHandlers, surfaceDelegateFactory, devLoadingViewManager, pausedInDebuggerOverlayManager)", imports = {}))
    @InterfaceC1492Gx
    public final DevSupportManager create(Context applicationContext, ReactInstanceDevHelper reactInstanceDevHelper, String str, boolean z2, int i2) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(reactInstanceDevHelper, "reactInstanceDevHelper");
        return create(applicationContext, reactInstanceDevHelper, str, z2, null, null, i2, null, null, null, null);
    }

    @Override // com.facebook.react.devsupport.DevSupportManagerFactory
    public DevSupportManager create(Context applicationContext, ReactInstanceDevHelper reactInstanceManagerHelper, String str, boolean z2, RedBoxHandler redBoxHandler, DevBundleDownloadListener devBundleDownloadListener, int i2, Map<String, ? extends RequestHandler> map, SurfaceDelegateFactory surfaceDelegateFactory, DevLoadingViewManager devLoadingViewManager, PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(reactInstanceManagerHelper, "reactInstanceManagerHelper");
        if (!z2) {
            return new ReleaseDevSupportManager();
        }
        try {
            Intrinsics.checkNotNullExpressionValue("com.facebook.react.devsupport.BridgeDevSupportManager", "toString(...)");
            Object objNewInstance = Class.forName("com.facebook.react.devsupport.BridgeDevSupportManager").getConstructor(Context.class, ReactInstanceDevHelper.class, String.class, Boolean.TYPE, RedBoxHandler.class, DevBundleDownloadListener.class, Integer.TYPE, Map.class, SurfaceDelegateFactory.class, DevLoadingViewManager.class, PausedInDebuggerOverlayManager.class).newInstance(applicationContext, reactInstanceManagerHelper, str, true, redBoxHandler, devBundleDownloadListener, Integer.valueOf(i2), map, surfaceDelegateFactory, devLoadingViewManager, pausedInDebuggerOverlayManager);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.facebook.react.devsupport.interfaces.DevSupportManager");
            return (DevSupportManager) objNewInstance;
        } catch (Exception unused) {
            return new PerftestDevSupportManager(applicationContext);
        }
    }
}
