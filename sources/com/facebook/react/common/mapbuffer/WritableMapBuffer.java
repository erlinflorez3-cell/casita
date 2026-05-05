package com.facebook.react.common.mapbuffer;

import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.common.mapbuffer.MapBuffer;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Яh\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116B\u0005#4\u0012\u000e\u0007njGӄL͜P.`\\2\u000fq{<$q$yCAV\"}0\rWNmhvJh\u001eKƤ\u000e\u0016\u0007q4I[xe\u0012\u001dPJģG3[{EʠhtL\u0005(݅*8\b\u0014\t\u001a0H\u0018v\tiS\f\u00188FuPĥ+w5\u001a@\u0005v +I\u001djߑ:Hz]\u0003=1\u000b\u0002B|0\u00104\u000bW%F\u0003)S\u000b*,9KO5C1\u0004\u0007\u0015_s?1A8QMv55CI\"`f\\\u000e\u001e-+}\u000f$\u0007nj\u0013`x\fU;\u007fgYZ&(&|B!\u0005\u0012\u001c\u0017?H\\/Jj\u0016\u0018Kt!U\u0007dJlP\u0012\u0013ad\u0019U\u0004A5Q\u001b\u0015S(OaTE\u000f\u001d\rL7Goiib#x\u0015Ij(U?[X=vPPm\u0006{\u0012\bz\u0002X\u0003`K\u000e9\u0014\u0011\\\u0019kK$M19\u0004\bXFwv3_\u0017l\u001aVVJ:nD9p\u001dThR~\u001dk~o\t0\u001fW4T5\u007fN'hj\u0006X9%>k\u007flwte]8'uz\u007fj|\n&]I`C5\u007fj>\u0001\u0019w݀C<p%!sPt$`l*22vv>\u001aB\u0380NT'@b\n\u001cbιa\u001dj\u001f`\u0003LDq\u0001\u0017\u0004rh>}\u001dG2&\u0002$#է1Tjz\bg'K\\\u0001nFEA\u007f>a:cE\u00014+Ƚ7\u0003\u0002\n_gzI|p$\u001am{N&bM_RU\u0013=ȯY6\u00107]L!g\u0002Q K\u0013|(\u0011\u0004|<\u000b j\u001fݚ\u0011nXYl\u0017Px\u000fv1,|\u007f(w\u000f\u000fU\u0007l\u000b\nŬyv\u0011cTNf~5#,I\u0019oP\u0018}CQL5\u0016&ҡ_\u0019og\u0002o\\{\u0013\u00134\u0019}\u0004Zj\\o+wkXS8\u0010\u0001\u001fB(غz*XG\u001b{\u0016L!4;5xGr\u0015n:c\n]\u0005-\u00812ޛtVib[\u0002\f]F_X\u0011k}Bes)\u001fWkg\u001co\u0012\\[\\\u001d\u000b#{_pHp\u0014։X͓f\rH\by\u001bDE\ft\u0013A!*D.L\b9J\u0003o\\؎|ķJ_\u0017ğБF "}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_ ZGJg1%\u0015P]Dcs-Ov4\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u7", "u(E", "1nd;g", "", "5dc\u0010b<Gb", "u(8", "D`[BX:", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{\u001c\u000e$\u0013[E", "", "1n]AT0Ga", "", "9dh", "3mc?l\bM", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u \u0019\u0010r9bL", "=eU@X;", "5dc\u000fb6ES\u0015\b", "5dc\u0011b<;Z\u0019", "", "5dc\u0016a;", "5dc\u0018X@(T\u001a\rzm", "5dc\u0018X@L", "", "5dc\u0019b5@", "", "5dc\u001aT7\u001bc\u001a\u007fzk", "5dc\u001aT7\u001bc\u001a\u007fzk\u0013\u0001\u0017>", "", "5dc g9B\\\u001b", "", "5dc!l7>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u \u0018\u0003r(=\u000b2G\"", "5dc#T3NS'", "", "u(J\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "7sT?T;H`", "", ">tc", "D`[BX", ">tc\u0016a;>`\"z\u0002", "Dda6Y@/O \u000fz", "\"", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "2`c.G@IS", "\u0011n\\=T5B]\"", "\u001b`_\u000fh-?S&^\u0004m9\u0011", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class WritableMapBuffer implements MapBuffer {
    private static final Companion Companion = new Companion(null);
    private final SparseArray<Object> values = new SparseArray<>();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0004Gٍ1!Ǟr~P+R|\rfʴ=0Re߲2S"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_ ZGJg1%\u0015P]Dcs-Ov4\u0006*X4gN{A\u001e\u001b0", "", "u(E", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4B\u0007\":\u001b\u007f\u0007lkA0RiP.XY2\u000fy\u0003<$a%yCQU\"}(\nWNusvJ`\fK\u000f\u001c\u0016\u0001j2J[ޏ_(ƁbB\u001e>sX\u007fAG`\r63!ݨ&8\b\u0007Q,8K(v)G\u0002`hتB¤>V%O\u000b\u001f \f\u000f2\u000f%tg|>~A4Ɣ1ݭ\u0007mZP-h>\u0007\u001e\u0019TT?\r%btѫB˝9\u0015-مS\u0019`fW\u0003mrsY?Ѿ)ȅMwo8^\f\"\"{a\u001bk\u000b&\u000b\u0006(ӷ\u000eˏ/Uk֟h\u0010.\u0007\t\t]N\u0012\u001e\u001e'v?cn=ڳ\u0010\u07baxvkBV\u0014lUP\roJ/%.Ha\u000eqƯSň?\u001df9\u0002\u001b\u001b5s\u0013|9sT<yKo+ɄSśUDUJT$gX>\u0016~~\u001a*2M\u001eĠ1ɨ\u00154\u001f¦O]?A/\u000bɞLd"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_ ZGJg1%\u0015P]Dcs-Ov4\u00064J79bs>\u0014\u001f:\u0017]8!Z", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u \u0019\u0010r9bL", "7mS2k", "", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n~!\u001fOy\u0017\u0006~!@V\u000e!8m#w?P?z0\u001b\u001chI5\u0012@<Ow'T\"2oM", "0n^9X(GD\u0015\u0006\u000b^", "", "5dc\u000fb6ES\u0015\bkZ3\r\t", "u(I", "2nd/_,/O \u000fz", "", "5dc\u0011b<;Z\u0019ove<|", "u(3", "7mc#T3NS", "5dc\u0016a;/O \u000fz", "u(8", "9dh", "5dc\u0018X@", ":n]4I(Ec\u0019", "", "5dc\u0019b5@D\u0015\u0006\u000b^", "u(9", ";`_\u000fh-?S&ove<|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u7", "5dc\u001aT7\u001bc\u001a\u007fzk\u001dx\u0010?e", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0015!Ow\u0018E@-1dz08n\u0016;\u0017+7v\u0011.\u0016iaF\\", "Asa6a./O \u000fz", "", "5dc g9B\\\u001bove<|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Bx_2", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u \u0018\u0003r(=\u000b2G\"", "5dc!l7>", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0015!Ow\u0018E@-1dz08n\u0016;\u0017+7v\u0011.\u0016iaFEB(]r\u0016[WN\u0002", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private final class MapBufferEntry implements MapBuffer.Entry {
        private final int index;
        private final int key;
        private final MapBuffer.DataType type;

        public MapBufferEntry(int i2) {
            this.index = i2;
            this.key = WritableMapBuffer.this.values.keyAt(i2);
            Object objValueAt = WritableMapBuffer.this.values.valueAt(i2);
            Intrinsics.checkNotNullExpressionValue(objValueAt, "valueAt(...)");
            this.type = WritableMapBuffer.this.dataType(objValueAt, getKey());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public boolean getBooleanValue() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof Boolean) {
                return ((Boolean) objValueAt).booleanValue();
            }
            throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public double getDoubleValue() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof Double) {
                return ((Number) objValueAt).doubleValue();
            }
            throw new IllegalStateException(("Expected " + Double.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getIntValue() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof Integer) {
                return ((Number) objValueAt).intValue();
            }
            throw new IllegalStateException(("Expected " + Integer.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getKey() {
            return this.key;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public long getLongValue() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof Long) {
                return ((Number) objValueAt).longValue();
            }
            throw new IllegalStateException(("Expected " + Long.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public MapBuffer getMapBufferValue() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof MapBuffer) {
                return (MapBuffer) objValueAt;
            }
            throw new IllegalStateException(("Expected " + MapBuffer.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public String getStringValue() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof String) {
                return (String) objValueAt;
            }
            throw new IllegalStateException(("Expected " + String.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public MapBuffer.DataType getType() {
            return this.type;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.common.mapbuffer.WritableMapBuffer$iterator$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я!\u001d̉=!,\u0010\bDZc|İI\u0006>\u00116B\u0005%4\u0012\u0006\u0010nj?0ld߉4Ziճ?q\f64[Rqq:\u001e!\f)!O|o.ĈJ#\u0012Q\u0018\u001e\u0016'jrֆUIu \u0010JB\u001eA\nހ{ެ=l|Ȃ\u001d\"8%F}%\u0003 /V\u0016͵~M"}, d2 = {"1n\\{Y(<S\u0016\t\u0005du\n\t+c\u000fqyJ\t\u001f!P9\u00168\u0002\"EZ~ D7\b;QR7h;\u001e|dl\u0016\u0017d-N\u0004eK[N9Xa|JR]", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxWDr02i~!7z_\u0016IN\u0018{5\u001f\u0015u \u0019\u0010r9bL", "1nd;g", "", "5dc\u0010b<Gb", "u(8", "Adc\u0010b<Gb", "uH\u0018#", "6`b\u001bX?M", "", "<dgA", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Iterator<MapBuffer.Entry>, KMappedMarker {
        private int count;

        AnonymousClass1() {
        }

        public final int getCount() {
            return this.count;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.count < WritableMapBuffer.this.values.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public MapBuffer.Entry next() {
            WritableMapBuffer writableMapBuffer = WritableMapBuffer.this;
            int i2 = this.count;
            this.count = i2 + 1;
            return writableMapBuffer.new MapBufferEntry(i2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCount(int i2) {
            this.count = i2;
        }
    }

    static {
        MapBufferSoLoader.staticInit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MapBuffer.DataType dataType(Object obj, int i2) {
        if (obj instanceof Boolean) {
            return MapBuffer.DataType.BOOL;
        }
        if (obj instanceof Integer) {
            return MapBuffer.DataType.INT;
        }
        if (obj instanceof Long) {
            return MapBuffer.DataType.LONG;
        }
        if (obj instanceof Double) {
            return MapBuffer.DataType.DOUBLE;
        }
        if (obj instanceof String) {
            return MapBuffer.DataType.STRING;
        }
        if (obj instanceof MapBuffer) {
            return MapBuffer.DataType.MAP;
        }
        throw new IllegalStateException("Key " + i2 + " has value of unknown type: " + obj.getClass());
    }

    private final int[] getKeys() {
        int size = this.values.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.values.keyAt(i2);
        }
        return iArr;
    }

    private final Object[] getValues() {
        int size = this.values.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            Object objValueAt = this.values.valueAt(i2);
            Intrinsics.checkNotNullExpressionValue(objValueAt, "valueAt(...)");
            objArr[i2] = objValueAt;
        }
        return objArr;
    }

    private final WritableMapBuffer putInternal(int i2, Object obj) {
        IntRange kEY_RANGE$ReactAndroid_release = MapBuffer.Companion.getKEY_RANGE$ReactAndroid_release();
        int first = kEY_RANGE$ReactAndroid_release.getFirst();
        if (i2 > kEY_RANGE$ReactAndroid_release.getLast() || first > i2) {
            throw new IllegalArgumentException("Only integers in [0;65535] range are allowed for keys.".toString());
        }
        this.values.put(i2, obj);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final /* synthetic */ <T> T verifyValue(int i2, Object obj) {
        if (obj == 0) {
            throw new IllegalArgumentException(("Key not found: " + i2).toString());
        }
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        if (obj instanceof Object) {
            return obj;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        throw new IllegalStateException(("Expected " + Object.class + " for key: " + i2 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean contains(int i2) {
        return this.values.get(i2) != null;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public MapBuffer.Entry entryAt(int i2) {
        return new MapBufferEntry(i2);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean getBoolean(int i2) {
        Object obj = this.values.get(i2);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i2).toString());
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + i2 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getCount() {
        return this.values.size();
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public double getDouble(int i2) {
        Object obj = this.values.get(i2);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i2).toString());
        }
        if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        }
        throw new IllegalStateException(("Expected " + Double.class + " for key: " + i2 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getInt(int i2) {
        Object obj = this.values.get(i2);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i2).toString());
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        throw new IllegalStateException(("Expected " + Integer.class + " for key: " + i2 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getKeyOffset(int i2) {
        return this.values.indexOfKey(i2);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public long getLong(int i2) {
        Object obj = this.values.get(i2);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i2).toString());
        }
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        throw new IllegalStateException(("Expected " + Long.class + " for key: " + i2 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public MapBuffer getMapBuffer(int i2) {
        Object obj = this.values.get(i2);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i2).toString());
        }
        if (obj instanceof MapBuffer) {
            return (MapBuffer) obj;
        }
        throw new IllegalStateException(("Expected " + MapBuffer.class + " for key: " + i2 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public List<MapBuffer> getMapBufferList(int i2) {
        Object obj = this.values.get(i2);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i2).toString());
        }
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new IllegalStateException(("Expected " + List.class + " for key: " + i2 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public String getString(int i2) {
        Object obj = this.values.get(i2);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i2).toString());
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalStateException(("Expected " + String.class + " for key: " + i2 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public MapBuffer.DataType getType(int i2) {
        Object obj = this.values.get(i2);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i2).toString());
        }
        Intrinsics.checkNotNull(obj);
        return dataType(obj, i2);
    }

    @Override // java.lang.Iterable
    public Iterator<MapBuffer.Entry> iterator() {
        return new AnonymousClass1();
    }

    public final WritableMapBuffer put(int i2, double d2) {
        return putInternal(i2, Double.valueOf(d2));
    }

    public final WritableMapBuffer put(int i2, int i3) {
        return putInternal(i2, Integer.valueOf(i3));
    }

    public final WritableMapBuffer put(int i2, long j2) {
        return putInternal(i2, Long.valueOf(j2));
    }

    public final WritableMapBuffer put(int i2, MapBuffer value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return putInternal(i2, value);
    }

    public final WritableMapBuffer put(int i2, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return putInternal(i2, value);
    }

    public final WritableMapBuffer put(int i2, boolean z2) {
        return putInternal(i2, Boolean.valueOf(z2));
    }
}
