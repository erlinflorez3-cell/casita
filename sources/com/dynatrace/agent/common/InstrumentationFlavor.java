package com.dynatrace.agent.common;

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
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004O\u00128\u000b4L\u0005ӳܧ\u0012\u000eј\u0017pI2Tev\u008c\u0001Rj\u001eq{D(i$\nCiV۟\u0002$\u000fQ\\j8}XZ#C=\u0007Ȁ|p4կmzc\u0016\u001d7+oE96oC@It<\r\t2(Ab\u0005\u0007$\u0013H\u0016\u0002cCQ\u0018ܞ4M"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006Z.Ch\u000b0?m\u001f=IR?u=~\u001cdrC\u00149", "", ">q^Ab*HZ\nz\u0002n,", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u00114", "5dc\u001de6M]\u0017\t\u0002O(\u0004\u0019/", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u001eK0\u0016A", "&@<\u000eE\u0010'", "\u0011NA\u0011B\u001d\u001a", "\u0014KD!G\f+", " D0\u0010G&'/\bbk>", "\u0018DC\u001d4\n$MvhbI\u0016jh", "\u001b@D\u0016", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class InstrumentationFlavor {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstrumentationFlavor[] $VALUES;
    private final String protocolValue;
    public static final InstrumentationFlavor PLAIN = new InstrumentationFlavor("PLAIN", 0, "pl");
    public static final InstrumentationFlavor XAMARIN = new InstrumentationFlavor("XAMARIN", 1, "xm");
    public static final InstrumentationFlavor CORDOVA = new InstrumentationFlavor("CORDOVA", 2, "cd");
    public static final InstrumentationFlavor FLUTTER = new InstrumentationFlavor("FLUTTER", 3, "fl");
    public static final InstrumentationFlavor REACT_NATIVE = new InstrumentationFlavor("REACT_NATIVE", 4, "rn");
    public static final InstrumentationFlavor JETPACK_COMPOSE = new InstrumentationFlavor("JETPACK_COMPOSE", 5, "jc");
    public static final InstrumentationFlavor MAUI = new InstrumentationFlavor("MAUI", 6, "ma");

    private static final /* synthetic */ InstrumentationFlavor[] $values() {
        return new InstrumentationFlavor[]{PLAIN, XAMARIN, CORDOVA, FLUTTER, REACT_NATIVE, JETPACK_COMPOSE, MAUI};
    }

    static {
        InstrumentationFlavor[] instrumentationFlavorArr$values = $values();
        $VALUES = instrumentationFlavorArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(instrumentationFlavorArr$values);
    }

    private InstrumentationFlavor(String str, int i2, String str2) {
        this.protocolValue = str2;
    }

    public static EnumEntries<InstrumentationFlavor> getEntries() {
        return $ENTRIES;
    }

    public static InstrumentationFlavor valueOf(String str) {
        return (InstrumentationFlavor) Enum.valueOf(InstrumentationFlavor.class, str);
    }

    public static InstrumentationFlavor[] values() {
        return (InstrumentationFlavor[]) $VALUES.clone();
    }

    public final String getProtocolValue() {
        return this.protocolValue;
    }
}
