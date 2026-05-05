package com.facebook.react.uimanager.style;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.codec.language.bm.Rule;
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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eRLcz\u0004I\u0006>\u00116B\u0005.2ߡՆ\u0007|ʑW?tkX0bSXş\u001azl#jdvI;ڈ\u001e}0\t\u0018Tuh\u0007J\t\r\n3n\u0016~m\u0015I[|F\u0012\u00157+oE96oC@It<\r\t2(Ab\u0005\u0007$\u0013H\u0016\u0002cCQ\u0018z0F}#R\u0013[ő\u001e\""}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77|8OG9g;}\u0014ja\u000f", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "BnB=T*B\\\u001bm\u000fi,", "", "\u000fK;", "\u001aD5!", " H6\u0015G", "\"N?", "\u0010NC!B\u0014", "!S0\u001fG", "\u0013M3", "\u0016NA\u0016M\u0016'Bte", "$DA!<\n\u001a:", "\u0010K>\u0010>&,Btki", "\u0010K>\u0010>&\u001e<w", "\u0010K>\u0010>", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class LogicalEdge {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LogicalEdge[] $VALUES;
    public static final Companion Companion;
    public static final LogicalEdge ALL = new LogicalEdge(Rule.ALL, 0) { // from class: com.facebook.react.uimanager.style.LogicalEdge.ALL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 8;
        }
    };
    public static final LogicalEdge LEFT = new LogicalEdge("LEFT", 1) { // from class: com.facebook.react.uimanager.style.LogicalEdge.LEFT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 0;
        }
    };
    public static final LogicalEdge RIGHT = new LogicalEdge("RIGHT", 2) { // from class: com.facebook.react.uimanager.style.LogicalEdge.RIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 2;
        }
    };
    public static final LogicalEdge TOP = new LogicalEdge("TOP", 3) { // from class: com.facebook.react.uimanager.style.LogicalEdge.TOP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 1;
        }
    };
    public static final LogicalEdge BOTTOM = new LogicalEdge("BOTTOM", 4) { // from class: com.facebook.react.uimanager.style.LogicalEdge.BOTTOM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 3;
        }
    };
    public static final LogicalEdge START = new LogicalEdge("START", 5) { // from class: com.facebook.react.uimanager.style.LogicalEdge.START
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 4;
        }
    };
    public static final LogicalEdge END = new LogicalEdge("END", 6) { // from class: com.facebook.react.uimanager.style.LogicalEdge.END
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 5;
        }
    };
    public static final LogicalEdge HORIZONTAL = new LogicalEdge("HORIZONTAL", 7) { // from class: com.facebook.react.uimanager.style.LogicalEdge.HORIZONTAL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 6;
        }
    };
    public static final LogicalEdge VERTICAL = new LogicalEdge("VERTICAL", 8) { // from class: com.facebook.react.uimanager.style.LogicalEdge.VERTICAL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 7;
        }
    };
    public static final LogicalEdge BLOCK_START = new LogicalEdge("BLOCK_START", 9) { // from class: com.facebook.react.uimanager.style.LogicalEdge.BLOCK_START
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 11;
        }
    };
    public static final LogicalEdge BLOCK_END = new LogicalEdge("BLOCK_END", 10) { // from class: com.facebook.react.uimanager.style.LogicalEdge.BLOCK_END
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 10;
        }
    };
    public static final LogicalEdge BLOCK = new LogicalEdge("BLOCK", 11) { // from class: com.facebook.react.uimanager.style.LogicalEdge.BLOCK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.facebook.react.uimanager.style.LogicalEdge
        public int toSpacingType() {
            return 9;
        }
    };

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2}P\u000b\u007fRuj\u0007J\t\u000f\n\u0014َ\u001a}"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77|8OG9g;}\u0014jawdm4Yr0KVW\u0002", "", "u(E", "4q^:F7:Q\u001d\b|M@\b\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77|8OG9g;}\u0014ja\u000f", "AoP0\\5@B-\nz", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final LogicalEdge fromSpacingType(int i2) {
            switch (i2) {
                case 0:
                    return LogicalEdge.LEFT;
                case 1:
                    return LogicalEdge.TOP;
                case 2:
                    return LogicalEdge.RIGHT;
                case 3:
                    return LogicalEdge.BOTTOM;
                case 4:
                    return LogicalEdge.START;
                case 5:
                    return LogicalEdge.END;
                case 6:
                    return LogicalEdge.HORIZONTAL;
                case 7:
                    return LogicalEdge.VERTICAL;
                case 8:
                    return LogicalEdge.ALL;
                case 9:
                    return LogicalEdge.BLOCK;
                case 10:
                    return LogicalEdge.BLOCK_END;
                case 11:
                    return LogicalEdge.BLOCK_START;
                default:
                    throw new IllegalArgumentException("Unknown spacing type: " + i2);
            }
        }
    }

    private static final /* synthetic */ LogicalEdge[] $values() {
        return new LogicalEdge[]{ALL, LEFT, RIGHT, TOP, BOTTOM, START, END, HORIZONTAL, VERTICAL, BLOCK_START, BLOCK_END, BLOCK};
    }

    static {
        LogicalEdge[] logicalEdgeArr$values = $values();
        $VALUES = logicalEdgeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(logicalEdgeArr$values);
        Companion = new Companion(null);
    }

    private LogicalEdge(String str, int i2) {
    }

    public /* synthetic */ LogicalEdge(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i2);
    }

    @JvmStatic
    public static final LogicalEdge fromSpacingType(int i2) {
        return Companion.fromSpacingType(i2);
    }

    public static EnumEntries<LogicalEdge> getEntries() {
        return $ENTRIES;
    }

    public static LogicalEdge valueOf(String str) {
        return (LogicalEdge) Enum.valueOf(LogicalEdge.class, str);
    }

    public static LogicalEdge[] values() {
        return (LogicalEdge[]) $VALUES.clone();
    }

    public abstract int toSpacingType();
}
