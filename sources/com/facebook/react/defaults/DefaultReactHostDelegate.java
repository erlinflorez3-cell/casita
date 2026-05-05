package com.facebook.react.defaults;

import com.facebook.react.ReactPackage;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostDelegate;
import com.facebook.react.runtime.hermes.HermesInstance;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\u0015\"4ߚ\u007f\u0007t\tA0ZeP\u008cZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvJp\u000bK\u000f\u001c\u0016\u0001j:I]ތe\u0012%2JoEBStSʠ\u0011td\u0004`\u00182<\b\u0005\u0019\u001aXI z\tEc\f@3P|@R\u001bQ\u001d \"\bN /$\u000bl^<NlkAG#1qRV-_>\u0006e\u000f\\SU\u0017\u0007g$+NBM\u0015S_\u0013\u001dX[M\u0010W\u0002M\u000bx+U:2s6Fh\u0002$\u0015Y`;k\u0003*j\u0017i`::˦ScYdV.\u0006\u001c\u0014\rj\u0010T\u001aoZ<O2f6\u001fc|\u0001vXT0m+\u007fYq|+u\u0014A4Q\u001d|P\u0010Eoע9߉\t\u0013&ŀ\u0019p'pb$11)a\u0010aAWPAv]rY\u001c}\u0014rr\u0002X\u0015^UV߿} 2\u0017-ڛ,K1#\u0004\u0002vG>Џ\u0007¾lYqɭ`B(\u0006$Oz\u001b\u001aZ\\d3l'ԐZ¯\u0015S$\u0381\u001f\u007f\u000e,.vHN/,(N}p@ҫOύ\u000e+7ωO[t\u0007\u001cs\njA@ic>m)Λ\u0016͖@b\r֚7Za\u0010rb8$BH\u0019\u0016&\u0001\u001b\u009f\u000eƱ6EyʉL.76j3\u0019\u0015,TY|7r1ӧ\u0012њX9,Ѱ\u0002&z(\u000fpʽt\u0014"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001\u0018\u0013Wv\u001dJ@\u00045Zy0>|\u0003.IAJN>,$Ga@\u0007e(]v|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006c%1W\r\u0003A{%\rMJ;m0-\u0015>", "8r<.\\5&]\u0018\u000f\u0002^\u0017x\u00182", "", "8r1Ba+ES\u007f\tv],\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!d\u0002Eb|'7T *LCHA", "@dP0g\u0017:Q\u001fz|^:", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VZ\n:|!7YS", "8rABa;B[\u0019_v\\;\u0007\u0016C", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006[\u0013\"i\u0007/;u\u0016\u000fIAJuA2j", "0h]1\\5@a|\b\tm(\u0004\u0010/r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006S)>X\u0002)9{y7[R7r;\u001e\">", "@dP0g\u0015:b\u001d\u0010z<6\u0006\n3g", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW)v!3hf\u001cFq'.+MDl8 j", "3wR2c;B]\"avg+\u0004\t<", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", "", "Bta/b\u0014HR)\u0006zF(\u0006\u00051e\r\u0007{G\u0001\u0019\u0013VojLz,4Y\u000b", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VZ\n:|!7Yl0Dj \u0016WBKr4\u0006\u0011q];\u0007p\u000bN}'IH],\u001b/\u0003A\u001b\u0011Z\u001b$", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`Hk\f<s/?_G-7i\u0014=\u0017@Ho3 \u00152F'cs5M}'.VJ+\\_H$\u0019\u000ek\n\u0018;\u001c\t`\u000b\u000brRFtn*S\n\u0005i|\n\u0016\u000b?tv\fc\u0010Cw$?N9qU]gy\u0011&3O:m\u001bc%\\\u001b6\"#{&/>7,\u0014\u0004\u001d\u0012nPydqQ\u001fDE$:kj\u0010R\u007f^Kx/\u001f\u0015X{\u001b1\\}-\u0003\u0011\rB92k\fKtm%\\\u0003\u001du]=%&3F\u001dE\u0015puh<\u001d2 ]\u0005\u001bf3z\u0006eaaWw\u0003l\u001bl5?i\n8V\b\u00140u\u001f6M\u0003K%~&\u0011P%}nGR\u001f^\n(:%2h\u000f\u0012\u0007p!g\u0004|;c\u00172+[5M\u0010\u0013r>U\tY?\u0013\u007f\u0012|mGpjBk\"<t\u0013I\u0010CX9\u0001:Mn \u001d4h\u0007\b\u0019uiOX6\u001a%'9h8!=?\u000fnR\"&={\r", "5dc\u000f\\5=W\"\u0001\tB5\u000b\u0018+l\u0007(\t", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ$'P~\u0012Dvn\u0012]\u0007\u001f;v\u0018<1LIz0%\u001chn\u000f", "5dc\u0017f\tN\\\u0018\u0006zE6x\b/r", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\n#6\u000e)6t\u0016\u0015W?:kAs", "5dc\u0017f\u0014:W\"f\u0005]<\u0004\t\u001aa\u000f+", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0017f\u0019N\\(\u0003\u0003^\rx\u0007>o\r<", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ$'P~\u0012Dvn\u001aGj0@|\u001a6M$7iC(\"|7", "5dc\u001fX(<b\u0004zxd(~\t=", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc!h9;]\u0001\tyn3|p+n{*{M_\u0017\u001eGq\nKv\u0002E]\u0005\u001f7z", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0004\u0017Cm\u001d'r#;U\u007f &}#+W+EjD%\u0015P]B\u0003e,[U'NLP(kR1\u001a$\u0016a\rN8b", "5dc\u001fX(<b\u0002z\nb=|f9n\u0001,}", "6`]1_,\"\\'\u000evg*|hBc\u007f3\u000bD\u000b ", "3qa<e", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@UnstableReactNativeAPI
public final class DefaultReactHostDelegate implements ReactHostDelegate {
    private final BindingsInstaller bindingsInstaller;
    private final Function1<Exception, Unit> exceptionHandler;
    private final JSBundleLoader jsBundleLoader;
    private final String jsMainModulePath;
    private final JSRuntimeFactory jsRuntimeFactory;
    private final ReactNativeConfig reactNativeConfig;
    private final List<ReactPackage> reactPackages;
    private final ReactPackageTurboModuleManagerDelegate.Builder turboModuleManagerDelegateBuilder;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultReactHostDelegate(String jsMainModulePath, JSBundleLoader jsBundleLoader, List<? extends ReactPackage> reactPackages, JSRuntimeFactory jsRuntimeFactory, BindingsInstaller bindingsInstaller, ReactNativeConfig reactNativeConfig, Function1<? super Exception, Unit> exceptionHandler, ReactPackageTurboModuleManagerDelegate.Builder turboModuleManagerDelegateBuilder) {
        Intrinsics.checkNotNullParameter(jsMainModulePath, "jsMainModulePath");
        Intrinsics.checkNotNullParameter(jsBundleLoader, "jsBundleLoader");
        Intrinsics.checkNotNullParameter(reactPackages, "reactPackages");
        Intrinsics.checkNotNullParameter(jsRuntimeFactory, "jsRuntimeFactory");
        Intrinsics.checkNotNullParameter(reactNativeConfig, "reactNativeConfig");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        Intrinsics.checkNotNullParameter(turboModuleManagerDelegateBuilder, "turboModuleManagerDelegateBuilder");
        this.jsMainModulePath = jsMainModulePath;
        this.jsBundleLoader = jsBundleLoader;
        this.reactPackages = reactPackages;
        this.jsRuntimeFactory = jsRuntimeFactory;
        this.bindingsInstaller = bindingsInstaller;
        this.reactNativeConfig = reactNativeConfig;
        this.exceptionHandler = exceptionHandler;
        this.turboModuleManagerDelegateBuilder = turboModuleManagerDelegateBuilder;
    }

    public /* synthetic */ DefaultReactHostDelegate(String str, JSBundleLoader jSBundleLoader, List list, JSRuntimeFactory jSRuntimeFactory, BindingsInstaller bindingsInstaller, ReactNativeConfig reactNativeConfig, Function1 function1, ReactPackageTurboModuleManagerDelegate.Builder builder, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jSBundleLoader, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list, (i2 + 8) - (i2 | 8) != 0 ? new HermesInstance() : jSRuntimeFactory, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? null : bindingsInstaller, (-1) - (((-1) - i2) | ((-1) - 32)) != 0 ? ReactNativeConfig.DEFAULT_CONFIG : reactNativeConfig, (-1) - (((-1) - i2) | ((-1) - 64)) != 0 ? new Function1<Exception, Unit>() { // from class: com.facebook.react.defaults.DefaultReactHostDelegate.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Exception exc) throws Exception {
                invoke2(exc);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Exception it) throws Exception {
                Intrinsics.checkNotNullParameter(it, "it");
                throw it;
            }
        } : function1, builder);
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public BindingsInstaller getBindingsInstaller() {
        return this.bindingsInstaller;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public JSBundleLoader getJsBundleLoader() {
        return this.jsBundleLoader;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public String getJsMainModulePath() {
        return this.jsMainModulePath;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public JSRuntimeFactory getJsRuntimeFactory() {
        return this.jsRuntimeFactory;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public ReactNativeConfig getReactNativeConfig() {
        return this.reactNativeConfig;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public List<ReactPackage> getReactPackages() {
        return this.reactPackages;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public ReactPackageTurboModuleManagerDelegate.Builder getTurboModuleManagerDelegateBuilder() {
        return this.turboModuleManagerDelegateBuilder;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public void handleInstanceException(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.exceptionHandler.invoke(error);
    }
}
