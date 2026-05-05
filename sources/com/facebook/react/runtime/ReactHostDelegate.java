package com.facebook.react.runtime;

import com.facebook.react.ReactPackage;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.fabric.ReactNativeConfig;
import java.util.List;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007lkA0RqP.XT2\u000f\u0002{<$a%yCIs\"}8\tWNmhvJp\u000bK\u000f\f\u0017\u0001jBI]ތe\u0012\u001d2JģG3coE9vt>ӌ&\u00188\u0600*\u0005/\u0019rN\u001e\u0010\u0013Cy&XT\t\u0003Hm%M36B\u000eL=\u0019\"\u000b\u000676'\f$^\u007f5\u0011iZP=^^}$ϜHù+\u0011\u000fc$-N:\u0006%3W\u001b\u0007\u0001`\u0016ƈAџA\t\u0001)-1Wz(Ff\b,\u0015YXcǅt͉`\tib\u001219Z4[^\u001a@w)\tcʄ\u0006؝\n+`03(t\u0017^I\u0003\u0003kF`\u0004nB.\r\u0010GmԂ\u0002Ĵ/=3hWtI-\u001fG\n\u001a%\u001eQ\u0017EĶ]ڍ\u0012d-\u001dZ\u000f_IӾ?׀ʳN\u000ea?s#\u001fa͌.$σK~"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006c%1W\r\u0003A{%\rMJ;m0-\u0015>", "", "0h]1\\5@a|\b\tm(\u0004\u0010/r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006S)>X\u0002)9{y7[R7r;\u001e\">", "5dc\u000f\\5=W\"\u0001\tB5\u000b\u0018+l\u0007(\t", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ$'P~\u0012Dvn\u0012]\u0007\u001f;v\u0018<1LIz0%\u001chn\u000f", "8r1Ba+ES\u007f\tv],\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!d\u0002Eb|'7T *LCHA", "5dc\u0017f\tN\\\u0018\u0006zE6x\b/r", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\n#6\u000e)6t\u0016\u0015W?:kAs", "8r<.\\5&]\u0018\u000f\u0002^\u0017x\u00182", "", "5dc\u0017f\u0014:W\"f\u0005]<\u0004\t\u001aa\u000f+", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "8rABa;B[\u0019_v\\;\u0007\u0016C", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006[\u0013\"i\u0007/;u\u0016\u000fIAJuA2j", "5dc\u0017f\u0019N\\(\u0003\u0003^\rx\u0007>o\r<", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ$'P~\u0012Dvn\u001aGj0@|\u001a6M$7iC(\"|7", "@dP0g\u0017:Q\u001fz|^:", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VZ\n:|!7YS", "5dc\u001fX(<b\u0004zxd(~\t=", "u(;7T=:\u001d)\u000e~euc\r=tU", "Bta/b\u0014HR)\u0006zF(\u0006\u00051e\r\u0007{G\u0001\u0019\u0013VojLz,4Y\u000b", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VZ\n:|!7Yl0Dj \u0016WBKr4\u0006\u0011q];\u0007p\u000bN}'IH],\u001b/\u0003A\u001b\u0011Z\u001b$", "5dc!h9;]\u0001\tyn3|p+n{*{M_\u0017\u001eGq\nKv\u0002E]\u0005\u001f7z", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0004\u0017Cm\u001d'r#;U\u007f &}#+W+EjD%\u0015P]B\u0003e,[U'NLP(kR1\u001a$\u0016a\rN8b", "5dc\u001fX(<b\u0002z\nb=|f9n\u0001,}", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW)v!3hf\u001cFq'.+MDl8 j", "6`]1_,\"\\'\u000evg*|hBc\u007f3\u000bD\u000b ", "", "3qa<e", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@UnstableReactNativeAPI
public interface ReactHostDelegate {
    BindingsInstaller getBindingsInstaller();

    JSBundleLoader getJsBundleLoader();

    String getJsMainModulePath();

    JSRuntimeFactory getJsRuntimeFactory();

    ReactNativeConfig getReactNativeConfig();

    List<ReactPackage> getReactPackages();

    ReactPackageTurboModuleManagerDelegate.Builder getTurboModuleManagerDelegateBuilder();

    void handleInstanceException(Exception exc);
}
