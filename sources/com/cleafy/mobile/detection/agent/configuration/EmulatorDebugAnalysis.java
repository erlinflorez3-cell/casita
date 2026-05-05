package com.cleafy.mobile.detection.agent.configuration;

import b.superior;
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
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\nGָّ\u000bDȐ\u001d$\\\u0018\b\tvjgӄrd\u0001-U\u00141\u0015kڷ8&a$\u007fD$U \u0002\u000b\tUSPgtPӂ\u000fJ"}, d2 = {"\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001k 7NG={A\u001a$lkBPC4^}#VV[\u000b\\O\u0003?o\u001bV\u0015b9\u0011\u0013/", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0011n\\=T5B]\"", "0.bBc,KW#\f", "\u001cN=\u0012", "\u0010@B\u00166", "\u000fCE\u000eA\n\u001e2", "/fT;g&KS ~vl,"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class EmulatorDebugAnalysis {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EmulatorDebugAnalysis[] $VALUES;
    public static final superior Companion;
    public static final EmulatorDebugAnalysis NONE = new EmulatorDebugAnalysis("NONE", 0);
    public static final EmulatorDebugAnalysis BASIC = new EmulatorDebugAnalysis("BASIC", 1);
    public static final EmulatorDebugAnalysis ADVANCED = new EmulatorDebugAnalysis("ADVANCED", 2);

    private static final /* synthetic */ EmulatorDebugAnalysis[] $values() {
        return new EmulatorDebugAnalysis[]{NONE, BASIC, ADVANCED};
    }

    static {
        EmulatorDebugAnalysis[] emulatorDebugAnalysisArr$values = $values();
        $VALUES = emulatorDebugAnalysisArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(emulatorDebugAnalysisArr$values);
        Companion = new superior();
    }

    private EmulatorDebugAnalysis(String str, int i2) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static EmulatorDebugAnalysis valueOf(String str) {
        return (EmulatorDebugAnalysis) Enum.valueOf(EmulatorDebugAnalysis.class, str);
    }

    public static EmulatorDebugAnalysis[] values() {
        return (EmulatorDebugAnalysis[]) $VALUES.clone();
    }
}
