package com.facebook.react.defaults;

import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlagsDefaults;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.JvmStatic;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.truncatedMessage(InvalidProtocolBufferException.java:70)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.refillBuffer(CodedInputStream.java:1094)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readRawLittleEndian64(CodedInputStream.java:823)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:238)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record.<init>(JvmProtoBuf.java:368)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record.<init>(JvmProtoBuf.java:327)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$1.parsePartialFrom(JvmProtoBuf.java:474)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$1.parsePartialFrom(JvmProtoBuf.java:469)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readMessage(CodedInputStream.java:507)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:121)
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u000514\u0012\u000e\u0007njG<L͜P.`S2şqۛ4:ӋTqq:\u0016\u001f\u0004\"\u07beSNug7th\u001e[\u001b\u0016\u0018\tjZKezm\u0012=Gp\u0004o7[\u007fU9\u000fvf\t.;:8(\u00071\u001e8I(v)E\u0012\u0011ZTN\u0007RR;d5 \u0018\u0006L0\u0019\u001e\u000bi~<NlkCG#1krT-_>}e\rtVm\u0012Gy,,X7c\u0017[\u0018YޟTÜC\rOsC\bv'?-Owe;)\u0018\"\u001bCO;_)j3ӬSԃ\u00101;QiR^\u000e@y\u0001\u0004\u001bAT&\u00140`.[\u001c\u001dLdޟvɤWJ`\u0004dL\u000ezy8\u001d0\u000e8{E)riai\u001b%ќ\b˿\u0011\u001e+Ч?-ia&`C\u001d+Ȱ]śU@Eʰ\u001f\u0016gK\u0006\u0004\u001fdXÒ\u0010ΥK\u007f7Ʌa:%4O[g%wȀ\u000eҩHg~ݓ1\u0001ayjHn$%Z\u000eѯ\u000bɔ^Nt\u0007qabXD\u0013S.b\fċ\f+"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001\u0018\u0013Wv\u001dJ@\u00045Zy0>|~._\u001fHi7\"$h_H\u0017p,.\u007f6T`96`[\u0002\u0013", "", "u(E", "0qX1Z,ES'\rZg(y\u0010/d", "", "5dc\u000fe0=U\u0019\u0006zl:\\\u0012+b\u0007(z~|  Q~\nKz/>g", "5dc\u000fe0=U\u0019\u0006zl:\\\u0012+b\u0007(z", "u(I", "1n]0h9KS\"\u000eg^(z\u0018\u000fn{%\u0003@\u007f", "5dc\u0010b5<c&\fzg;i\t+c\u000f\b\u0005<}\u001e\u0017F.\nE\u007f/DU\r$Av$", "5dc\u0010b5<c&\fzg;i\t+c\u000f\b\u0005<}\u001e\u0017F", "4`Q?\\*\u001e\\\u0015{\u0002^+", "5dc\u0013T)KW\u0017^\u0004Z)\u0004\t.${1\u0005J\u0010\u0013&Ky\u0017J", "5dc\u0013T)KW\u0017^\u0004Z)\u0004\t.", ">qXCT;>0&\u0003y`,\u0004\t=s_1w=\b\u0017\u0016", ">qXCT;>1#\bxn9\n\t8tl(w>\u0010v Cl\u0015<u", ">qXCT;>4\u0015{\bb*\\\u0012+b\u0007(z", ">qXCT;>B)\fwh\u0014\u0007\b?l\u007f6[I|\u0014\u001eGn", "Bta/b\u0014HR)\u0006zl\f\u0006\u0005,l\u007f'", "5dc!h9;]\u0001\tyn3|\u0017\u000fn{%\u0003@\u007fU\u0013Px\u0018Kr49c\u0007.", "5dc!h9;]\u0001\tyn3|\u0017\u000fn{%\u0003@\u007f", "7r2<a-BU)\fvm0\u0007\u0012 a\u0007,z", "\u001aj^A_0G\u001d\u0004z~k\u0002", "", ":nP1", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DefaultNewArchitectureEntryPoint {
    public static final DefaultNewArchitectureEntryPoint INSTANCE = new DefaultNewArchitectureEntryPoint();
    private static boolean privateBridgelessEnabled = false;
    private static boolean privateConcurrentReactEnabled = false;
    private static boolean privateFabricEnabled = false;
    private static boolean privateTurboModulesEnabled = false;

    private DefaultNewArchitectureEntryPoint() {
    }

    public static final boolean getBridgelessEnabled() {
        return privateBridgelessEnabled;
    }

    @JvmStatic
    public static /* synthetic */ void getBridgelessEnabled$annotations() {
    }

    public static final boolean getConcurrentReactEnabled() {
        return privateConcurrentReactEnabled;
    }

    @JvmStatic
    public static /* synthetic */ void getConcurrentReactEnabled$annotations() {
    }

    public static final boolean getFabricEnabled() {
        return privateFabricEnabled;
    }

    @JvmStatic
    public static /* synthetic */ void getFabricEnabled$annotations() {
    }

    public static final boolean getTurboModulesEnabled() {
        return privateTurboModulesEnabled;
    }

    @JvmStatic
    public static /* synthetic */ void getTurboModulesEnabled$annotations() {
    }

    @JvmStatic
    public static final void load() {
        load$default(false, false, false, 7, null);
    }

    @JvmStatic
    public static final void load(boolean z2) {
        load$default(z2, false, false, 6, null);
    }

    @JvmStatic
    public static final void load(boolean z2, boolean z3) {
        load$default(z2, z3, false, 4, null);
    }

    @JvmStatic
    public static final void load(boolean z2, final boolean z3, boolean z4) {
        Pair<Boolean, String> pairIsConfigurationValid = INSTANCE.isConfigurationValid(z2, z3, z4);
        boolean zBooleanValue = pairIsConfigurationValid.component1().booleanValue();
        String strComponent2 = pairIsConfigurationValid.component2();
        if (!zBooleanValue) {
            throw new IllegalStateException(strComponent2.toString());
        }
        ReactFeatureFlags.useTurboModules = z2;
        ReactFeatureFlags.enableFabricRenderer = z3;
        if (z4) {
            ReactNativeFeatureFlags.override(new ReactNativeNewArchitectureFeatureFlagsDefaults() { // from class: com.facebook.react.defaults.DefaultNewArchitectureEntryPoint.load.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(true);
                }

                @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
                public boolean enableEventEmitterRetentionDuringGesturesOnAndroid() {
                    return z3;
                }

                @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
                public boolean useFabricInterop() {
                    return z3;
                }
            });
        }
        privateFabricEnabled = z3;
        privateTurboModulesEnabled = z2;
        privateConcurrentReactEnabled = z3;
        privateBridgelessEnabled = z4;
        DefaultSoLoader.Companion.maybeLoadSoLibrary();
    }

    public static /* synthetic */ void load$default(boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((1 & i2) != 0) {
            z2 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z3 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z4 = true;
        }
        load(z2, z3, z4);
    }

    @VisibleForTesting
    public final Pair<Boolean, String> isConfigurationValid(boolean z2, boolean z3, boolean z4) {
        return (!z3 || z2) ? (!z4 || (z2 && z3)) ? TuplesKt.to(true, "") : TuplesKt.to(false, "bridgelessEnabled=true requires (turboModulesEnabled=true AND fabricEnabled=true) - Please update your DefaultNewArchitectureEntryPoint.load() parameters.") : TuplesKt.to(false, "fabricEnabled=true requires turboModulesEnabled=true (is now false) - Please update your DefaultNewArchitectureEntryPoint.load() parameters.");
    }
}
