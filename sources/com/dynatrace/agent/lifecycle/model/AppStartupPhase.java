package com.dynatrace.agent.lifecycle.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import yg.InterfaceC1492Gx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
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
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004O\u00128\u000b4I\u0005ӭܧ\u0012\u000eј\u0017pI2Tev\u008c\u0001Rj q{D*i$\nEQTH~̀\rQTiuq\u001bk\u0019C'\b,w\u0019-֒Y~e܈'4HsM86oC?It<\f\t2(@b\u0005\u0007#ݻL\u001a"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\b\u001b\u0018Gm\":}%~a\b\u001f7t_\nXN)z0+$xl$\n_:NL", "", "D`[BX", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u00114", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u000fO?\u0019<\n\u001aB|hcX\nih\u000bT_", "\u000fBC\u0016I\u0010-G\u0013\\g>\bkh", "\u000fBC\u0016I\u0010-G\u0013li:\u0019k", "\u000fBC\u0016I\u0010-G\u0013kZL\u001cdh\u000e", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class AppStartupPhase {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppStartupPhase[] $VALUES;
    private final String value;
    public static final AppStartupPhase APPLICATION_CREATE = new AppStartupPhase("APPLICATION_CREATE", 0, "android.application.on_create");
    public static final AppStartupPhase ACTIVITY_CREATE = new AppStartupPhase("ACTIVITY_CREATE", 1, "android.activity.on_create");
    public static final AppStartupPhase ACTIVITY_START = new AppStartupPhase("ACTIVITY_START", 2, "android.activity.on_start");
    public static final AppStartupPhase ACTIVITY_RESUMED = new AppStartupPhase("ACTIVITY_RESUMED", 3, null);

    private static final /* synthetic */ AppStartupPhase[] $values() {
        return new AppStartupPhase[]{APPLICATION_CREATE, ACTIVITY_CREATE, ACTIVITY_START, ACTIVITY_RESUMED};
    }

    static {
        AppStartupPhase[] appStartupPhaseArr$values = $values();
        $VALUES = appStartupPhaseArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(appStartupPhaseArr$values);
    }

    private AppStartupPhase(String str, int i2, String str2) {
        this.value = str2;
    }

    public static EnumEntries<AppStartupPhase> getEntries() {
        return $ENTRIES;
    }

    public static AppStartupPhase valueOf(String str) {
        return (AppStartupPhase) Enum.valueOf(AppStartupPhase.class, str);
    }

    public static AppStartupPhase[] values() {
        return (AppStartupPhase[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
