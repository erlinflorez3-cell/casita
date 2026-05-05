package com.facebook.react.common.mapbuffer;

import com.facebook.jni.HybridData;
import com.facebook.react.common.mapbuffer.MapBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
@Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007ljA0RkP.X[2\u000fy\u0005<$a$yCQU\"}(\tWNu˧vJ`\rK\u000f\u0014\u001a\u0001j2L]xk\u0019\u00172HoG3[\u000eEʠhtD\u0011(݅*8\u0010\u0005\t\u001a0K\u0018v\tiS\f\u00183HpHR\u0015M\u000b\u001f\u001a\u0006T \t\u001ebkT;^Ǎ{|_#1hzNi#p\nS\u001eVX5\r\u000faL,Ë;5#'\u0014\u0010\rbkC\u0011B\n=3lҊ++Wx\u0018K^\u0010$\u00199R%]!*l\t_f$'YVӍOP\u001c0@\t\n\u001eT\u0004<\u0018WL<@2f6\u0015y\t;aNd\u001a^p\u0015+eD\u001d=\u007fa2\u007f//boQ1Ne\u000e5\u0013,:\u0019p7Z\u0003&'ڔ\u001b\u001d\u0006_Ji@kZ~\u000egP\u0006\u0004\u001fiH>L>U\u001aG{?5G)EvQ#OrHH\ru\u0005!xh\u0002\u0007\u0003LN5\u0007\u0016e1O #Rr#\u0004P\u0003_\\\u0015[/l\u0007,\u000fY4%\u0006J@=\u0010|V\u0019mx`u\nS6-K\"|y.o9\r:eUq1yR%\u001b\u0006<+\u0013f\tZS:}\r,0E`j>~BX\u0017\u001a!VWqJع\\5'o-H1%\tUE\u001dm\u007f\u0001\u0016\u000fVC$1ǭR\u001b9\u0005^o\to\u0016\u007f\u0010@En0TYQcAVY0{L|Q\u000eE\bHUuu_L\u001b@&Y\n3.\u001agXuQ[%\rTJ\u0002[L|vsde\u0012U\u0002-}\u001dg\u0001.\u001621ptfxwgTE)=r;*\u0016\u0013\u0018y\u0010JAõ\u0002\u001d\u0018imax\u0013[LNf\u00123Odݩ\u000180\u000bfECU/F{\"a-a\fp6.Bp\u001dY\re2V\u0014\u001a}\u0004i]`B~I\"\rLV<l1_xn\u0006:Z\tb\u0014yH\nj~\fPM9eDfO:\u001b(n[h\u001a \u0002B`w*\"JD\u0014'Q3IeS\u0016\u0011\u001eOj=b\u000f8\u0012B17&*v8\\gd\u001904\u058cF\\q?p?T\tR;r<P\u0019Q\u0010\u0002\u0006>ÿ0JmI/2pz\u0002VVb\u0007\u0019nH3\tud/\\\u0019~=:dx}L\u0013+^T]\"b\u0005aO!\u001b\u0019VEf\u0000*לɭ8\u001aϜ\\\u0003\u0011\u0005k\u0004\u0012\bDE_)\u001c\u00146 \t$\u000b Z\u0018I=(Μa۞4^\u0013ٝ5jr\u0001*f\u0001UR-\r\u0004\u0015\u000ej\u0011M[o۱~ƚf3Tϕ\u00109I%\u000f#\u00159\u0015\u0019\u0015e\\\u001a[\u0007k-\u0014ƚl͂+{_ė\f\u0010\u0016.8'2{W\u001d.ʭhŭa\u001fR\u0018w%p\u000eY\u001f^0\u001c.x{I˙0ĝ:O\n֯û\u0013gak}@H*1ˬ\"pJо|N"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u001bM?:g1%\u0015P]Dcs-Ov4\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u7", "6xQ?\\+\u001dO(z", "\u001ab^:\"-:Q\u0019{\u0005h2F\u000e8iI\u000b\u0010=\u000e\u001b\u0016&k\u001d8L", "uKR<`u?O\u0017~wh6\u0003R4n\u0004q^T}$\u001bFN\nKrzxJ", "0tU3X9", "\u001aiPCTuGW#HWr;|e?f\u0001(\t\u0016", "uKY.i(\b\\\u001d\tD;@\f\t\fu\u0001){MVZ\b", "=eU@X;", "", "uKY.i(\b\\\u001d\tD;@\f\t\fu\u0001){MVzZ8", "\nrTA \u0006\u0017", "1nd;g", "5dc\u0010b<Gb", "u(8", ";Gh/e0=2\u0015\u000ev", "=eU@X;\u001f]&]\u000fg(\u0005\r-D{7w", "5dc\u001cY-LS(_\u0005k\u000b\u0011\u0012+m\u0004&Z<\u0010\u0013", "=eU@X;-]\u0001z\u0006;<}\n/r", "1n]AT0Ga", "", "9dh", "3mc?l\bM", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u \u0019\u0010r9bL", "3pd._:", "=sW2e", "", "5dc\u000fb6ES\u0015\b", "5dc\u000fh*DS(b\u0004],\u0010i9re(\u0010", "7mc\u0018X@", "5dc\u0011b<;Z\u0019", "", "5dc\u0016a;", "5dc\u0018X@(T\u001a\rzm", "5dc\u0018X@(T\u001a\rzm\r\u0007\u0016\fu}.{Od \u0016G\u0003", "0tR8X;\"\\\u0018~\u000e", "5dc\u0019b5@", "", "5dc\u001aT7\u001bc\u001a\u007fzk", "5dc\u001aT7\u001bc\u001a\u007fzk\u0013\u0001\u0017>", "", "5dc g9B\\\u001b", "", "5dc!l7>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u \u0018\u0003r(=\u000b2G\"", "5dc!l7>R\nz\u0002n,f\n0s\u007f7\\J\u000e|\u0017[", "3w_2V;>R", "6`b566=S", "7l_<e;\u001bg(~Wn-}\t<", "7sT?T;H`", "", "@dP156HZ\u0019z\u0004O(\u0004\u0019/", "0tU3X9)]'\u0003\nb6\u0006", "@dP17(MO\b\u0013\u0006^", "@dP176NP ~kZ3\r\t", "@dP1;,:R\u0019\f", "", "@dP1<5MD\u0015\u0006\u000b^", "@dP1?6GU\nz\u0002n,", "@dP1@(I0)\u007f{^9c\r=tp$\u0003P\u0001", ">nb6g0H\\", "@dP1@(I0)\u007f{^9m\u00056u\u007f", "@dP1F;KW\"\u0001kZ3\r\t", "@dP1H5LW\u001b\bz]\u001a\u007f\u0013<t", "\u001aj^A_0G\u001d\tl}h9\f^", "@dP1H5LW\u001b\bz]\u001a\u007f\u0013<tG\u0005\u000e&l\u0001h\u001a", "uH\u0018 ", "BnBAe0GU", "\u0011n\\=T5B]\"", "\u001b`_\u000fh-?S&^\u0004m9\u0011", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReadableMapBuffer implements MapBuffer {
    private static final int ALIGNMENT = 254;
    private static final int BUCKET_SIZE = 12;
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_SIZE = 8;
    private static final int TYPE_OFFSET = 2;
    private static final int VALUE_OFFSET = 4;
    private final ByteBuffer buffer;
    private int count;
    private final HybridData mHybridData;
    private final int offsetToMapBuffer;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005%2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈_>PsW3{q\u0014ʣ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͏MŲO\f\u001aؓ\u0011|HX%M3\u001châ\u0011ŋ\u0005\u001edɡߗ:O"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u001bM?:g1%\u0015P]Dcs-Ov4\u0006*X4gN{A\u001e\u001b0", "", "u(E", "\u000fK8\u0014A\u0014\u001e<\b", "", "\u0010T2\u00188\u001b8A|sZ", "\u0016D0\u00118\u00198A|sZ", "\"X?\u0012R\u0016\u001f4\u0007^i", "$@;\"8&(4ylZM", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4B\u0007\":\u001b\u007f\u0007lkA0RiP.XY2\u000fy\u0003<$a%yCQU\"}(\nWNusvJ`\fK\u000f\u001c\u0016\u0001j2J]xk\u0012\u00172HoEݏO\u0006މi`#5E+B&Fy\u001d\u0001H+Н\u0014v\tE\u0014\u001a PXphs=Q\u0013<*\u0006l=G\u001e-y\\9`l\f>ewYݚDĚ+cH~S\u0012TZw\u0019\u0005a6+n8\fՙ'٨\u0007\u0007Z¹\u0010\u0015MxU\u0005\u0017/]\u007f ֬Y͏\\\u0004,\u00171X\u001bgC8j\u0010i`:(a$:ֶRˎ,{\u0013}\u0013H\u0012\u001bV9V<E\u001a\u0015\tD\bKɘUĖT\u0006vD\u0006\noCg7\u000eCC9Iw\b6\u0012ϡPѼ\u007f\t% )\u0013|4,f\u001ct-\u001b\u0003\r\b\u0006(͌?˓R\u000eq?s\u001a~yR<\u0012H_\u007f]\u0015G\u0003m½9٦='9m\bbR\u0003G\u0017n\u0005ki\u0001evvEނ9Ҋ\r\u0010rFj#yoԢ\\O"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u001bM?:g1%\u0015P]Dcs-Ov4\u00064J79bs>\u0014\u001f:\u0017]8!Z", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u \u0019\u0010r9bL", "0tR8X;(T\u001a\rzm", "", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n~!\u001fOy\u0017\u0006~!@V\u000e!8m#w:C7j0\u001b\u001chI5\u0012@<Ow'T\"2oM", "0n^9X(GD\u0015\u0006\u000b^", "", "5dc\u000fb6ES\u0015\bkZ3\r\t", "u(I", "2nd/_,/O \u000fz", "", "5dc\u0011b<;Z\u0019ove<|", "u(3", "7mc#T3NS", "5dc\u0016a;/O \u000fz", "u(8", "9dh", "5dc\u0018X@", ":n]4I(Ec\u0019", "", "5dc\u0019b5@D\u0015\u0006\u000b^", "u(9", ";`_\u000fh-?S&ove<|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u7", "5dc\u001aT7\u001bc\u001a\u007fzk\u001dx\u0010?e", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0015!Ow\u0018E@-1dz08n\u0016;\u0017+7v\u0011.\u0016iaF\\", "Asa6a./O \u000fz", "", "5dc g9B\\\u001bove<|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Bx_2", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u \u0018\u0003r(=\u000b2G\"", "5dc!l7>", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0015!Ow\u0018E@-1dz08n\u0016;\u0017+7v\u0011.\u0016iaFEB(]r\u0016[WN\u0002", "/rb2e;-g$~", "", "3w_2V;>R", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private final class MapBufferEntry implements MapBuffer.Entry {
        private final int bucketOffset;

        public MapBufferEntry(int i2) {
            this.bucketOffset = i2;
        }

        private final void assertType(MapBuffer.DataType dataType) {
            MapBuffer.DataType type = getType();
            if (dataType == type) {
                return;
            }
            throw new IllegalStateException(("Expected " + dataType + " for key: " + getKey() + " found " + type + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public boolean getBooleanValue() {
            assertType(MapBuffer.DataType.BOOL);
            return ReadableMapBuffer.this.readBooleanValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public double getDoubleValue() {
            assertType(MapBuffer.DataType.DOUBLE);
            return ReadableMapBuffer.this.readDoubleValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getIntValue() {
            assertType(MapBuffer.DataType.INT);
            return ReadableMapBuffer.this.readIntValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getKey() {
            return ReadableMapBuffer.this.m7313readUnsignedShortBwKQO78(this.bucketOffset) & 65535;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public long getLongValue() {
            assertType(MapBuffer.DataType.LONG);
            return ReadableMapBuffer.this.readLongValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public MapBuffer getMapBufferValue() {
            assertType(MapBuffer.DataType.MAP);
            return ReadableMapBuffer.this.readMapBufferValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public String getStringValue() {
            assertType(MapBuffer.DataType.STRING);
            return ReadableMapBuffer.this.readStringValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public MapBuffer.DataType getType() {
            MapBuffer.DataType[] dataTypeArrValues = MapBuffer.DataType.values();
            short sM7313readUnsignedShortBwKQO78 = ReadableMapBuffer.this.m7313readUnsignedShortBwKQO78(this.bucketOffset + 2);
            return dataTypeArrValues[(sM7313readUnsignedShortBwKQO78 + 65535) - (sM7313readUnsignedShortBwKQO78 | 65535)];
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.common.mapbuffer.ReadableMapBuffer$iterator$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я!\u001d̉=!,\u0010\bDZc|İI\u0006>\u00116B\u0005'4\u0012\u0006\u0010nj?0ld߉4Ziճ?q\f64[Rqq:\u001e!\f+!O|q.ĈJ#\u0012Q\u001a\u001e\u0016'jrֆUIu \u0010JB\u001eA\nހ{ެ=l|Ȃ\u001d\"8%F}%\u0003 /V\u0016G\nQR$\u0012^B¤>X\u0015˟\u001d\u001c\u0018\u000eL$Ӟ\"h"}, d2 = {"1n\\{Y(<S\u0016\t\u0005du\n\t+c\u000fqyJ\t\u001f!P9\u00168\u0002\"EZ~ D7\u0003.IB7h;\u001e|dl\u0016\u0017d-N\u0004eK[N9Xa|JR]", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u \u0019\u0010r9bL", "1ta?X5M", "", "5dc\u0010h9KS\"\u000e", "u(8", "Adc\u0010h9KS\"\u000e", "uH\u0018#", ":`bA", "5dc\u0019T:M", "6`b\u001bX?M", "", "<dgA", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Iterator<MapBuffer.Entry>, KMappedMarker {
        private int current;
        private final int last;

        AnonymousClass1() {
            this.last = ReadableMapBuffer.this.getCount() - 1;
        }

        public final int getCurrent() {
            return this.current;
        }

        public final int getLast() {
            return this.last;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current <= this.last;
        }

        @Override // java.util.Iterator
        public MapBuffer.Entry next() {
            ReadableMapBuffer readableMapBuffer = ReadableMapBuffer.this;
            int i2 = this.current;
            this.current = i2 + 1;
            return readableMapBuffer.new MapBufferEntry(readableMapBuffer.getKeyOffsetForBucketIndex(i2));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCurrent(int i2) {
            this.current = i2;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.common.mapbuffer.ReadableMapBuffer$toString$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,t\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "3mc?l", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u \u0019\u0010r9bL", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C11461 extends Lambda implements Function1<MapBuffer.Entry, CharSequence> {
        public static final C11461 INSTANCE = ;

        /* JADX INFO: renamed from: com.facebook.react.common.mapbuffer.ReadableMapBuffer$toString$1$WhenMappings */
        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MapBuffer.DataType.values().length];
                try {
                    iArr[MapBuffer.DataType.BOOL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MapBuffer.DataType.INT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MapBuffer.DataType.LONG.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MapBuffer.DataType.DOUBLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MapBuffer.DataType.STRING.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[MapBuffer.DataType.MAP.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C11461() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(MapBuffer.Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey());
            sb.append('=');
            switch (WhenMappings.$EnumSwitchMapping$0[entry.getType().ordinal()]) {
                case 1:
                    sb.append(entry.getBooleanValue());
                    break;
                case 2:
                    sb.append(entry.getIntValue());
                    break;
                case 3:
                    sb.append(entry.getLongValue());
                    break;
                case 4:
                    sb.append(entry.getDoubleValue());
                    break;
                case 5:
                    sb.append('\"');
                    sb.append(entry.getStringValue());
                    sb.append('\"');
                    break;
                case 6:
                    sb.append(entry.getMapBufferValue().toString());
                    break;
            }
            return sb;
        }
    }

    static {
        MapBufferSoLoader.staticInit();
    }

    private ReadableMapBuffer(HybridData hybridData) {
        this.mHybridData = hybridData;
        this.buffer = importByteBuffer();
        this.offsetToMapBuffer = 0;
        readHeader();
    }

    private ReadableMapBuffer(ByteBuffer byteBuffer) {
        this.mHybridData = null;
        this.buffer = byteBuffer;
        this.offsetToMapBuffer = 0;
        readHeader();
    }

    private ReadableMapBuffer(ByteBuffer byteBuffer, int i2) {
        this.mHybridData = null;
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i2);
        Intrinsics.checkNotNullExpressionValue(byteBufferDuplicate, "apply(...)");
        this.buffer = byteBufferDuplicate;
        this.offsetToMapBuffer = i2;
        readHeader();
    }

    private final int getBucketIndexForKey(int i2) {
        IntRange kEY_RANGE$ReactAndroid_release = MapBuffer.Companion.getKEY_RANGE$ReactAndroid_release();
        int first = kEY_RANGE$ReactAndroid_release.getFirst();
        if (i2 <= kEY_RANGE$ReactAndroid_release.getLast() && first <= i2) {
            short sM9261constructorimpl = UShort.m9261constructorimpl((short) i2);
            int count = getCount() - 1;
            int i3 = 0;
            while (i3 <= count) {
                int i4 = (i3 + count) >>> 1;
                int iM7313readUnsignedShortBwKQO78 = m7313readUnsignedShortBwKQO78(getKeyOffsetForBucketIndex(i4)) & 65535;
                int i5 = 65535 & sM9261constructorimpl;
                if (Intrinsics.compare(iM7313readUnsignedShortBwKQO78, i5) < 0) {
                    i3 = i4 + 1;
                } else {
                    if (Intrinsics.compare(iM7313readUnsignedShortBwKQO78, i5) <= 0) {
                        return i4;
                    }
                    count = i4 - 1;
                }
            }
        }
        return -1;
    }

    public final int getKeyOffsetForBucketIndex(int i2) {
        return this.offsetToMapBuffer + 8 + (i2 * 12);
    }

    private final int getOffsetForDynamicData() {
        return getKeyOffsetForBucketIndex(getCount());
    }

    private final int getTypedValueOffsetForKey(int i2, MapBuffer.DataType dataType) {
        int bucketIndexForKey = getBucketIndexForKey(i2);
        if (bucketIndexForKey == -1) {
            throw new IllegalArgumentException(("Key not found: " + i2).toString());
        }
        MapBuffer.DataType dataType2 = readDataType(bucketIndexForKey);
        if (dataType2 == dataType) {
            return getKeyOffsetForBucketIndex(bucketIndexForKey) + 4;
        }
        throw new IllegalStateException(("Expected " + dataType + " for key: " + i2 + ", found " + dataType2 + " instead.").toString());
    }

    private final native ByteBuffer importByteBuffer();

    public final boolean readBooleanValue(int i2) {
        return readIntValue(i2) == 1;
    }

    private final MapBuffer.DataType readDataType(int i2) {
        return MapBuffer.DataType.values()[m7313readUnsignedShortBwKQO78(getKeyOffsetForBucketIndex(i2) + 2) & 65535];
    }

    public final double readDoubleValue(int i2) {
        return this.buffer.getDouble(i2);
    }

    private final void readHeader() {
        if (this.buffer.getShort() != 254) {
            this.buffer.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.count = (-1) - (((-1) - m7313readUnsignedShortBwKQO78(this.buffer.position())) | ((-1) - 65535));
    }

    public final int readIntValue(int i2) {
        return this.buffer.getInt(i2);
    }

    public final long readLongValue(int i2) {
        return this.buffer.getLong(i2);
    }

    private final List<ReadableMapBuffer> readMapBufferListValue(int i2) {
        ArrayList arrayList = new ArrayList();
        int offsetForDynamicData = getOffsetForDynamicData() + this.buffer.getInt(i2);
        int i3 = this.buffer.getInt(offsetForDynamicData);
        int i4 = offsetForDynamicData + 4;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = this.buffer.getInt(i4 + i5);
            int i7 = i5 + 4;
            arrayList.add(new ReadableMapBuffer(this.buffer, i4 + i7));
            i5 = i7 + i6;
        }
        return arrayList;
    }

    public final ReadableMapBuffer readMapBufferValue(int i2) {
        return new ReadableMapBuffer(this.buffer, getOffsetForDynamicData() + this.buffer.getInt(i2) + 4);
    }

    public final String readStringValue(int i2) {
        int offsetForDynamicData = getOffsetForDynamicData() + this.buffer.getInt(i2);
        int i3 = this.buffer.getInt(offsetForDynamicData);
        byte[] bArr = new byte[i3];
        this.buffer.position(offsetForDynamicData + 4);
        this.buffer.get(bArr, 0, i3);
        return new String(bArr, Charsets.UTF_8);
    }

    /* JADX INFO: renamed from: readUnsignedShort-BwKQO78 */
    public final short m7313readUnsignedShortBwKQO78(int i2) {
        return UShort.m9261constructorimpl(this.buffer.getShort(i2));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean contains(int i2) {
        return getBucketIndexForKey(i2) != -1;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public MapBuffer.Entry entryAt(int i2) {
        return new MapBufferEntry(getKeyOffsetForBucketIndex(i2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer byteBuffer = this.buffer;
        ByteBuffer byteBuffer2 = ((ReadableMapBuffer) obj).buffer;
        if (byteBuffer == byteBuffer2) {
            return true;
        }
        byteBuffer.rewind();
        byteBuffer2.rewind();
        return Intrinsics.areEqual(byteBuffer, byteBuffer2);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean getBoolean(int i2) {
        return readBooleanValue(getTypedValueOffsetForKey(i2, MapBuffer.DataType.BOOL));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getCount() {
        return this.count;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public double getDouble(int i2) {
        return readDoubleValue(getTypedValueOffsetForKey(i2, MapBuffer.DataType.DOUBLE));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getInt(int i2) {
        return readIntValue(getTypedValueOffsetForKey(i2, MapBuffer.DataType.INT));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getKeyOffset(int i2) {
        return getBucketIndexForKey(i2);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public long getLong(int i2) {
        return readLongValue(getTypedValueOffsetForKey(i2, MapBuffer.DataType.LONG));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public ReadableMapBuffer getMapBuffer(int i2) {
        return readMapBufferValue(getTypedValueOffsetForKey(i2, MapBuffer.DataType.MAP));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public List<ReadableMapBuffer> getMapBufferList(int i2) {
        return readMapBufferListValue(getTypedValueOffsetForKey(i2, MapBuffer.DataType.MAP));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public String getString(int i2) {
        return readStringValue(getTypedValueOffsetForKey(i2, MapBuffer.DataType.STRING));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public MapBuffer.DataType getType(int i2) {
        int bucketIndexForKey = getBucketIndexForKey(i2);
        if (bucketIndexForKey != -1) {
            return readDataType(bucketIndexForKey);
        }
        throw new IllegalArgumentException(("Key not found: " + i2).toString());
    }

    public int hashCode() {
        this.buffer.rewind();
        return this.buffer.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<MapBuffer.Entry> iterator() {
        return new AnonymousClass1();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        CollectionsKt.joinTo$default(this, sb, null, null, null, 0, null, C11461.INSTANCE, 62, null);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
