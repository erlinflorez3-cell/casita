package com.dynatrace.android.agent.model;

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
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004O\u00128\u000b4J\u0005ӳܧ\u0012\u000eј\u0017pI2Tev\u008c\u0001Rj\u001cq{D(i$\nCiV۟\u0002\"\u0017Q\u001fvunbZ9DǇ\n\u001c\u0001̓DK[{k\u0016w2Ht(3Su&9f{\u001f\u0005&:\u000b8\u007f\u000ei\u001a0RǞz\u0006"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@-?X}'\u0001I!9;R7xC\u0006\u0015doI\u0014c4N\u007f66`Y,2", "", "D`[BX", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u00114", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u0012NF\u001b?\u0016\u001a2\u0013li:\u0019k", "\u0012NF\u001b?\u0016\u001a2\u0013^c=", " D;\u001c4\u000b", " T=,=\u001a80\tgYE\fvv\u001eAl\u0017", " T=,=\u001a80\tgYE\fvh\u0018D", "\u0011N=!8\u0015-Mtie>\bih\u000e", "2x].g9:Q\u0019x\b^(z\u0018vn{7\u007fQ\u0001^\"N\u007f\u0010@\u007f\u001fBY\u0005 3{\u0016"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AppStartMeasurementType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppStartMeasurementType[] $VALUES;
    private final String value;
    public static final AppStartMeasurementType DOWNLOAD_START = new AppStartMeasurementType("DOWNLOAD_START", 0, "downloadStart");
    public static final AppStartMeasurementType DOWNLOAD_END = new AppStartMeasurementType("DOWNLOAD_END", 1, "downloadEnd");
    public static final AppStartMeasurementType RELOAD = new AppStartMeasurementType("RELOAD", 2, "reload");
    public static final AppStartMeasurementType RUN_JS_BUNDLE_START = new AppStartMeasurementType("RUN_JS_BUNDLE_START", 3, "runJsBundleStart");
    public static final AppStartMeasurementType RUN_JS_BUNDLE_END = new AppStartMeasurementType("RUN_JS_BUNDLE_END", 4, "runJsBundleEnd");
    public static final AppStartMeasurementType CONTENT_APPEARED = new AppStartMeasurementType("CONTENT_APPEARED", 5, "contentAppeared");

    private static final /* synthetic */ AppStartMeasurementType[] $values() {
        return new AppStartMeasurementType[]{DOWNLOAD_START, DOWNLOAD_END, RELOAD, RUN_JS_BUNDLE_START, RUN_JS_BUNDLE_END, CONTENT_APPEARED};
    }

    static {
        AppStartMeasurementType[] appStartMeasurementTypeArr$values = $values();
        $VALUES = appStartMeasurementTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(appStartMeasurementTypeArr$values);
    }

    private AppStartMeasurementType(String str, int i2, String str2) {
        this.value = str2;
    }

    public static EnumEntries<AppStartMeasurementType> getEntries() {
        return $ENTRIES;
    }

    public static AppStartMeasurementType valueOf(String str) {
        return (AppStartMeasurementType) Enum.valueOf(AppStartMeasurementType.class, str);
    }

    public static AppStartMeasurementType[] values() {
        return (AppStartMeasurementType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
