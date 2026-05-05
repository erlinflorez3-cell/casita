package com.biocatch.android.commonsdk.logging;

import com.drew.metadata.wav.WavDirectory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DEBUG' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
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
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eRLш|\u0004O\f8\u000b4D\u0007\":\u001b\u007f\u0007lr?ӋC{߉La\u00040\u001fm\f4RӋRp{:dZ\u000b(\t_Rug\u0007J\t\fß\u0013\u0006$z38WZ\u0011]@\u0015bF}FKM\u001eމ\no\u00036\u001d `#أ}\u000b\tɝBJ\u0016y\tG4\f\u00188)p@[uM\u000b$z\u0006D+i\u001ebs76NyF:51ɮmR"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\u001bR> {hr9\u000e9", "", "Ade2e0Mg", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$D\b", "5dc X=>`\u001d\u000e\u000f", "u(8", "7r;<j,K=&^\u0007n(\u0004", "", "=sW2e", "\"Q0\u00108", "\u0012D1\":", "\u0017M5\u001c", "%@A\u001b<\u0015 ", "\u0013QA\u001cE", "\u0011Q8!<\n\u001a:", "\u001dE5", "\u0011n\\=T5B]\"", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ELogLevel {
    private static final /* synthetic */ ELogLevel[] $VALUES;
    public static final ELogLevel CRITICAL;
    public static final Companion Companion;
    public static final ELogLevel DEBUG;
    public static final ELogLevel ERROR;
    public static final ELogLevel INFO;
    public static final ELogLevel OFF;
    public static final ELogLevel TRACE;
    public static final ELogLevel WARNING;
    private final int severity;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:OIV2}P\u000b\u007fRuj\u0007J\t\u000få\u0013\u000b"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\u001bR> {hr9\u000e\"\nX~2CUR6e(", "", "u(E", "5dc\u0019X=>Z", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\u001bR> {hr9\u000e9", "Ade2e0Mg", "", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ELogLevel getLevel(int i2) {
            ELogLevel eLogLevel = ELogLevel.ERROR;
            for (ELogLevel eLogLevel2 : ELogLevel.values()) {
                if (eLogLevel2.getSeverity() == i2) {
                    return eLogLevel2;
                }
            }
            return eLogLevel;
        }
    }

    private static final /* synthetic */ ELogLevel[] $values() {
        return new ELogLevel[]{TRACE, DEBUG, INFO, WARNING, ERROR, CRITICAL, OFF};
    }

    static {
        ELogLevel eLogLevel = new ELogLevel("TRACE", 0, 10);
        TRACE = eLogLevel;
        DEBUG = new ELogLevel("DEBUG", 1, eLogLevel.severity);
        INFO = new ELogLevel(WavDirectory.LIST_INFO, 2, 20);
        WARNING = new ELogLevel("WARNING", 3, 30);
        ERROR = new ELogLevel("ERROR", 4, 40);
        CRITICAL = new ELogLevel("CRITICAL", 5, 50);
        OFF = new ELogLevel("OFF", 6, 80);
        $VALUES = $values();
        Companion = new Companion(null);
    }

    private ELogLevel(String str, int i2, int i3) {
        this.severity = i3;
    }

    public static ELogLevel valueOf(String str) {
        return (ELogLevel) Enum.valueOf(ELogLevel.class, str);
    }

    public static ELogLevel[] values() {
        return (ELogLevel[]) $VALUES.clone();
    }

    public final int getSeverity() {
        return this.severity;
    }

    public final boolean isLowerOrEqual(ELogLevel other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.severity <= other.severity;
    }
}
