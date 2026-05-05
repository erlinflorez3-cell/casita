package com.facebook.react.uimanager.style;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0011Gָّ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005jN.ʂW*\u001dkd4*\\\rqI=>\u001a\u0004%qOTkPnP_sC\u0015\f~xp32U~ez\u000f8KX?9WX=?k]6\u000b,\u001b\">\u0007ڷ\u0005("}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77r8ZB;x!\u001a\u0014lqGqp6YL", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0010NA\u00118\u00198@t]^N\u001a", "\u0010NA\u00118\u00198B\u0003itE\f]w)R[\u0007_0n", "\u0010NA\u00118\u00198B\u0003itK\u0010^k\u001e_l\u0004Z$p\u0005", "\u0010NA\u00118\u001980\u0003miH\u0014vu\u0013Gb\u0017u-\\uz7]", "\u0010NA\u00118\u001980\u0003miH\u0014vo\u000fFn\"h\u001c_z\u00075", "\u0010NA\u00118\u00198B\u0003itL\u001bXu\u001e_l\u0004Z$p\u0005", "\u0010NA\u00118\u00198B\u0003it>\u0015[\u0003\u001cA^\fk.", "\u0010NA\u00118\u001980\u0003miH\u0014vv\u001eAl\u0017u-\\uz7]", "\u0010NA\u00118\u001980\u0003miH\u0014vh\u0018Dy\u0015W\u001fd\u0007\u0005", "\u0010NA\u00118\u001983\u0002]t>\u0015[\u0003\u001cA^\fk.", "\u0010NA\u00118\u001983\u0002]tL\u001bXu\u001e_l\u0004Z$p\u0005", "\u0010NA\u00118\u00198A\bZgM&\\q\u000e_l\u0004Z$p\u0005", "\u0010NA\u00118\u00198A\bZgM&jw\u000bRn\"h\u001c_z\u00075", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class BorderRadiusProp extends Enum<BorderRadiusProp> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BorderRadiusProp[] $VALUES;
    public static final BorderRadiusProp BORDER_RADIUS = new BorderRadiusProp("BORDER_RADIUS", 0);
    public static final BorderRadiusProp BORDER_TOP_LEFT_RADIUS = new BorderRadiusProp("BORDER_TOP_LEFT_RADIUS", 1);
    public static final BorderRadiusProp BORDER_TOP_RIGHT_RADIUS = new BorderRadiusProp("BORDER_TOP_RIGHT_RADIUS", 2);
    public static final BorderRadiusProp BORDER_BOTTOM_RIGHT_RADIUS = new BorderRadiusProp("BORDER_BOTTOM_RIGHT_RADIUS", 3);
    public static final BorderRadiusProp BORDER_BOTTOM_LEFT_RADIUS = new BorderRadiusProp("BORDER_BOTTOM_LEFT_RADIUS", 4);
    public static final BorderRadiusProp BORDER_TOP_START_RADIUS = new BorderRadiusProp("BORDER_TOP_START_RADIUS", 5);
    public static final BorderRadiusProp BORDER_TOP_END_RADIUS = new BorderRadiusProp("BORDER_TOP_END_RADIUS", 6);
    public static final BorderRadiusProp BORDER_BOTTOM_START_RADIUS = new BorderRadiusProp("BORDER_BOTTOM_START_RADIUS", 7);
    public static final BorderRadiusProp BORDER_BOTTOM_END_RADIUS = new BorderRadiusProp("BORDER_BOTTOM_END_RADIUS", 8);
    public static final BorderRadiusProp BORDER_END_END_RADIUS = new BorderRadiusProp("BORDER_END_END_RADIUS", 9);
    public static final BorderRadiusProp BORDER_END_START_RADIUS = new BorderRadiusProp("BORDER_END_START_RADIUS", 10);
    public static final BorderRadiusProp BORDER_START_END_RADIUS = new BorderRadiusProp("BORDER_START_END_RADIUS", 11);
    public static final BorderRadiusProp BORDER_START_START_RADIUS = new BorderRadiusProp("BORDER_START_START_RADIUS", 12);

    private static final /* synthetic */ BorderRadiusProp[] $values() {
        return new BorderRadiusProp[]{BORDER_RADIUS, BORDER_TOP_LEFT_RADIUS, BORDER_TOP_RIGHT_RADIUS, BORDER_BOTTOM_RIGHT_RADIUS, BORDER_BOTTOM_LEFT_RADIUS, BORDER_TOP_START_RADIUS, BORDER_TOP_END_RADIUS, BORDER_BOTTOM_START_RADIUS, BORDER_BOTTOM_END_RADIUS, BORDER_END_END_RADIUS, BORDER_END_START_RADIUS, BORDER_START_END_RADIUS, BORDER_START_START_RADIUS};
    }

    static {
        BorderRadiusProp[] borderRadiusPropArr$values = $values();
        $VALUES = borderRadiusPropArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(borderRadiusPropArr$values);
    }

    private BorderRadiusProp(String str, int i2) {
        super(str, i2);
    }

    public static EnumEntries<BorderRadiusProp> getEntries() {
        return $ENTRIES;
    }

    public static BorderRadiusProp valueOf(String str) {
        return (BorderRadiusProp) Enum.valueOf(BorderRadiusProp.class, str);
    }

    public static BorderRadiusProp[] values() {
        return (BorderRadiusProp[]) $VALUES.clone();
    }
}
