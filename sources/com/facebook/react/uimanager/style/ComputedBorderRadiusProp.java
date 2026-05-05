package com.facebook.react.uimanager.style;

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
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\bGָّ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005jN.ʂW*\u001dkd4*\\\rqI=>\u001a\u0004%qOTk̐rO"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77s8UNKz4\u001dqrn8\u0007p\u0019Ju+WZ99f]H", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0011N<\u001dH\u001b\u001e2\u0013[dK\u000b\\u)Ti\u0013u'`w\u0006A\\i\u001bZ\u0015#", "\u0011N<\u001dH\u001b\u001e2\u0013[dK\u000b\\u)Ti\u0013u-dxy6iz\u0018U\t%G", "\u0011N<\u001dH\u001b\u001e2\u0013[dK\u000b\\u)Bi\u0017j*h\u0011\u0004+Qp+p\u0012\u00118a\u0010%", "\u0011N<\u001dH\u001b\u001e2\u0013[dK\u000b\\u)Bi\u0017j*h\u0011}'P|6c\u0001\u0014=m\u000e", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ComputedBorderRadiusProp {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ComputedBorderRadiusProp[] $VALUES;
    public static final ComputedBorderRadiusProp COMPUTED_BORDER_TOP_LEFT_RADIUS = new ComputedBorderRadiusProp("COMPUTED_BORDER_TOP_LEFT_RADIUS", 0);
    public static final ComputedBorderRadiusProp COMPUTED_BORDER_TOP_RIGHT_RADIUS = new ComputedBorderRadiusProp("COMPUTED_BORDER_TOP_RIGHT_RADIUS", 1);
    public static final ComputedBorderRadiusProp COMPUTED_BORDER_BOTTOM_RIGHT_RADIUS = new ComputedBorderRadiusProp("COMPUTED_BORDER_BOTTOM_RIGHT_RADIUS", 2);
    public static final ComputedBorderRadiusProp COMPUTED_BORDER_BOTTOM_LEFT_RADIUS = new ComputedBorderRadiusProp("COMPUTED_BORDER_BOTTOM_LEFT_RADIUS", 3);

    private static final /* synthetic */ ComputedBorderRadiusProp[] $values() {
        return new ComputedBorderRadiusProp[]{COMPUTED_BORDER_TOP_LEFT_RADIUS, COMPUTED_BORDER_TOP_RIGHT_RADIUS, COMPUTED_BORDER_BOTTOM_RIGHT_RADIUS, COMPUTED_BORDER_BOTTOM_LEFT_RADIUS};
    }

    static {
        ComputedBorderRadiusProp[] computedBorderRadiusPropArr$values = $values();
        $VALUES = computedBorderRadiusPropArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(computedBorderRadiusPropArr$values);
    }

    private ComputedBorderRadiusProp(String str, int i2) {
    }

    public static EnumEntries<ComputedBorderRadiusProp> getEntries() {
        return $ENTRIES;
    }

    public static ComputedBorderRadiusProp valueOf(String str) {
        return (ComputedBorderRadiusProp) Enum.valueOf(ComputedBorderRadiusProp.class, str);
    }

    public static ComputedBorderRadiusProp[] values() {
        return (ComputedBorderRadiusProp[]) $VALUES.clone();
    }
}
