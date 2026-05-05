package com.facebook.react.common.mapbuffer;

import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import yg.InterfaceC1492Gx;

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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000e^Lc\u000b\u0004Iي8\u000b<H\u0007\"2\u0013\u007f\u0007tsA0JhP.`W2\u000fq|<$i+yCAU\"}0'WȞog|VbŏK\u000f\u001c\u0016\u0001j2K[]s܈-JruO5]ok9\u000fsn\u00068K<\u0001\b\u0013\u00062*v\u0016'~QR$\u0012^B7^\u001b\u001b[\r2\u00124>P\u0005,e\u007fNdJ3\u0002\u0003=1\r\u0002B|-\u00104\u000bT%F\u0003)S\u001b*,9KO5C1\u0004\u0007\u0015Ys?1A8aMv54CI\"Yf\\\u000e\u001b-+}\u000f$\u0017nj\u0013_x\fU-\u007fgYW&(&|B1\u0005\u0012\u001c\u0015?H\\=Jj\u0016\u0015Kt!U\u0007tJlP\u0011\u0013adЍU\u0004A2Q\u001b\u0015S(_abE\u000e\u001d\u0013.%\u0011nOż\u0003!\u0011\u0019)[\u0010Q_S\u0007a\u0011\\\u0018mUm2\u0006\u0013\u00068\u000bHG.1B5v%3Ms9Q8\u001c\u0006VK\u007fv3b/w:bVA:nD9\u0001Å\u000eʑHh\u001dmVWf0ԃLȼ΄\u0007\u0002\u0010\u0015&{&;ǂ)+˛Sg"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u7", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u \u0019\u0010r9bL", "1nd;g", "", "5dc\u0010b<Gb", "u(8", "1n]AT0Ga", "", "9dh", "3mc?l\bM", "=eU@X;", "5dc\u000fb6ES\u0015\b", "5dc\u0011b<;Z\u0019", "", "5dc\u0016a;", "5dc\u0018X@(T\u001a\rzm", "5dc\u0019b5@", "", "5dc\u001aT7\u001bc\u001a\u007fzk", "5dc\u001aT7\u001bc\u001a\u007fzk\u0013\u0001\u0017>", "", "5dc g9B\\\u001b", "", "5dc!l7>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u \u0018\u0003r(=\u000b2G\"", "\u0011n\\=T5B]\"", "\u0012`c.G@IS", "\u0013mc?l", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface MapBuffer extends Iterable<Entry>, KMappedMarker {
    public static final Companion Companion = Companion.$$INSTANCE;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00056i%\nCiWpԃ$\u07beSTo˧\u0007L`\u000eQ\u0013َ\u001a}"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u \u0017\u0011k7J\u007f+QU$", "", "u(E", "\u0019DH,E\b'5x", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "5dc\u00188 8@tg\\>ji\t+c\u000f\u0004\u0005?\u000e!\u001bFi\u001b<}%1g}", "u(;8b;EW\"H\bZ5~\t=/c1\u000b-| \u0019GE", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final IntRange KEY_RANGE = new IntRange(0, 65535);

        private Companion() {
        }

        public final IntRange getKEY_RANGE$ReactAndroid_release() {
            return KEY_RANGE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\nGָّ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005jN.ʂW*\u001dkd4*\\\rqI=>\u001a\u0004%qOTkPnP_sC\u0015\fȆ|q"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u \u0018\u0003r(=\u000b2G\"", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0010N>\u0019", "\u0017MC", "\u0012ND\u000f?\f", "!SA\u0016A\u000e", "\u001b@?", "\u001aN=\u0014", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class DataType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DataType[] $VALUES;
        public static final DataType BOOL = new DataType("BOOL", 0);
        public static final DataType INT = new DataType("INT", 1);
        public static final DataType DOUBLE = new DataType("DOUBLE", 2);
        public static final DataType STRING = new DataType("STRING", 3);
        public static final DataType MAP = new DataType("MAP", 4);
        public static final DataType LONG = new DataType("LONG", 5);

        private static final /* synthetic */ DataType[] $values() {
            return new DataType[]{BOOL, INT, DOUBLE, STRING, MAP, LONG};
        }

        static {
            DataType[] dataTypeArr$values = $values();
            $VALUES = dataTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(dataTypeArr$values);
        }

        private DataType(String str, int i2) {
        }

        public static EnumEntries<DataType> getEntries() {
            return $ENTRIES;
        }

        public static DataType valueOf(String str) {
            return (DataType) Enum.valueOf(DataType.class, str);
        }

        public static DataType[] values() {
            return (DataType[]) $VALUES.clone();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4C\u0007\":\u0016\u007f\u0007lkA0RkP.XV2\u000fy\u0003<$a%yCQU\"}(\nWNusvJ`\fK\u000f\u001c\u0016\u0001j2J[]s܈?2pn\u0010C[oU9\u000fu\rӳ\"ݨ&<\u0012\u0007\u0007\u001c8K`\u0007\tGc\f@5\u0017¨<ň\u0011Q\u001d\u001c\u0018\fL'Q.jof6vu4Ƥ1ݭ\u0007mZP-i>\b\u001e\u001dT`?\r%jtҏB˝9\u0019=U\t\u0014`f\u0010\u0013M\u007fU\u0005\u00176}ȉKָ[:p\u0002\u001a%9`]m\u00018t\u0005\u007fsb˓-յgOh\u0010.\f\t\u0011]L\u0012$\u001e'vE\u0004զhڿ\u00127\rtYX^\u001b/R\u000e\u0015y6E@Vĸ-ݰ\u001fjicA5\\T\u009e\u0004ټ̗#\u0005v#as<_ڦ\u001frɮU0"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u \u0019\u0010r9bL", "", "0n^9X(GD\u0015\u0006\u000b^", "", "5dc\u000fb6ES\u0015\bkZ3\r\t", "u(I", "2nd/_,/O \u000fz", "", "5dc\u0011b<;Z\u0019ove<|", "u(3", "7mc#T3NS", "", "5dc\u0016a;/O \u000fz", "u(8", "9dh", "5dc\u0018X@", ":n]4I(Ec\u0019", "", "5dc\u0019b5@D\u0015\u0006\u000b^", "u(9", ";`_\u000fh-?S&ove<|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u7", "5dc\u001aT7\u001bc\u001a\u007fzk\u001dx\u0010?e", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0015!Ow\u0018E@-1dz08n\u0016;\u0017+7v\u0011.\u0016iaF\\", "Asa6a./O \u000fz", "", "5dc g9B\\\u001bove<|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Bx_2", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u \u0018\u0003r(=\u000b2G\"", "5dc!l7>", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0015!Ow\u0018E@-1dz08n\u0016;\u0017+7v\u0011.\u0016iaFEB(]r\u0016[WN\u0002", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface Entry {
        boolean getBooleanValue();

        double getDoubleValue();

        int getIntValue();

        int getKey();

        long getLongValue();

        MapBuffer getMapBufferValue();

        String getStringValue();

        DataType getType();
    }

    boolean contains(int i2);

    Entry entryAt(int i2);

    boolean getBoolean(int i2);

    int getCount();

    double getDouble(int i2);

    int getInt(int i2);

    int getKeyOffset(int i2);

    long getLong(int i2);

    MapBuffer getMapBuffer(int i2);

    List<MapBuffer> getMapBufferList(int i2);

    String getString(int i2);

    DataType getType(int i2);
}
