package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4\u0012}\u0010njG9LeN1ZS8şsڔ<$i*yCAU\"}0\u0015WNmgtOpŏa)6\u0016'i\\Oezm\u0012=3poo9]qM9\u000fud\u0007X1<x\r\u0015\u0005(-`\u0010%{SO\u001a\u0016H@\u001f;ň\u0011M\u0013\u001fZ\u001cL-\u0019\u001e\u000bu~:V{u:]$IݚBĚ+a6\r[\u001e\u000fe5\u001f\u000faL9p=C(=U\u0019\u0006\u0001o\u0006Ÿ?:C\u0013}?'Y_:k~^\u000e+-+}\u001b$\u0007nb\u0013ix\fUD\u0016w\u001ck\u001c.\u0010z*\u000erXdΒ)З-Ʀբj\u0012\u001e5zyaHh\u0004dK\u000e\u00052K%)\u00183Y:Q;(ļ=уMљ߉\t\u00116%\u0007y/e%#n\u00183T&Rg&\u0017חJ߉\tԯǀq\b\td\b6\u0012:ϝ\u007f1\u0004\u001146Ï;v"}, d2 = {"\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fL\n1}-| \u0019GE", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fL\n1}+\u000e!\u0019To\u001cJz/>/", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?m\u0013 Ioc", "\u001aj^A_0G\u001d\te\u0005g.R", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0019p\u007f1[I\u007f\u0004\u0013Pq\u000e\u0012", "AsP?g", "3mS\u0016a*Ec'\u0003\f^", "uI9\u0019^6MZ\u001d\bDc=\u0005R3n\u000f(\tI|\u001e`&o\u000f8\u0007,D7\b)E|#>KREx\u001c\u001a\"naF\\'\u001d", "3mS\u0012k*Ec'\u0003\f^", "5dc\u0012a+\u001ef\u0017\u0006\u000bl0\u000e\tvsG\u0019a)f\u0007UCx\u0017F\u0006!D]\b)E", "u(E", "5dc\u0012a+\u001ef\u0017\u0006\u000bl0\u000e\tvsG\u0019a)f\u0007", "u(9", "5dc\u0012a+\"\\\u0017\u0006\u000bl0\u000e\tvsG\u0019a)f\u0007", "5dc g(Kb`\rBO\u0012en\u001f", "1n]AT0Ga", "", "D`[BX", "1n]AT0Ga`o`S\u001e\ro\u001b", "uI\u0018'", "3pd._:", "=sW2e", "", "6`b566=S", "", "7r4:c;R", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ULongRange extends ULongProgression implements ClosedRange<ULong>, OpenEndRange<ULong> {
    public static final Companion Companion = new Companion(null);
    private static final ULongRange EMPTY = new ULongRange(-1, 0, null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fL\n1}-| \u0019G.kF~01b\u0002*@C", "", "u(E", "\u0013L?!L", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fL\n1}-| \u0019GE", "5dc\u0012@\u0017-G", "u(;8b;EW\"H\bZ5~\t=/o\u000f\u0006I\u0003\u0004\u0013Pq\u000e\u0012", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ULongRange getEMPTY() {
            return ULongRange.EMPTY;
        }
    }

    private ULongRange(long j2, long j3) {
        super(j2, j3, 1L, null);
    }

    public /* synthetic */ ULongRange(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3);
    }

    @Deprecated(message = "\u0006G\nt\u0006|'fo\u0007)\t\u0010\u001aDQa\\\u001d0\u0014vKi~K|*W\tjy(UqR\\o{BH*8y&e\f\f'hZ@xCB&K[\u001cIZ\r5\u000e\b\u0011/N%_\u0006;R\u000e\u0017\nOOS\u0014Q3spY~M\u0013!\u0007|-\u0006.I[e\u0016#\u001a\u0019xf\u001a%^P8s\u0002\u001ceJIYi`5!bx\u001fO\u001d_)xkyh|$T,\u000bj\u0017\u001c$%\nE\nY\u000bzI\"h\u000fw0_remRsv\u0010S&1tcu}~`\u0015[WxX)_:3y\u0005K\u0014BE\bP1`^.ua_\u001dotE~?")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: getEndExclusive-s-VKNKU$annotations */
    public static /* synthetic */ void m10216getEndExclusivesVKNKU$annotations() {
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m10217containsVKZWuLQ(((ULong) comparable).m9206unboximpl());
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ */
    public boolean m10217containsVKZWuLQ(long j2) {
        return Long.compareUnsigned(m10212getFirstsVKNKU(), j2) <= 0 && Long.compareUnsigned(j2, m10213getLastsVKNKU()) <= 0;
    }

    @Override // kotlin.ranges.ULongProgression
    public boolean equals(Object obj) {
        if (obj instanceof ULongRange) {
            if (!isEmpty() || !((ULongRange) obj).isEmpty()) {
                ULongRange uLongRange = (ULongRange) obj;
                if (m10212getFirstsVKNKU() != uLongRange.m10212getFirstsVKNKU() || m10213getLastsVKNKU() != uLongRange.m10213getLastsVKNKU()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ Comparable getEndExclusive() {
        return ULong.m9148boximpl(m10218getEndExclusivesVKNKU());
    }

    /* JADX INFO: renamed from: getEndExclusive-s-VKNKU */
    public long m10218getEndExclusivesVKNKU() {
        if (m10213getLastsVKNKU() != -1) {
            return ULong.m9154constructorimpl(m10213getLastsVKNKU() + ULong.m9154constructorimpl(((long) 1) & 4294967295L));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ Comparable getEndInclusive() {
        return ULong.m9148boximpl(m10219getEndInclusivesVKNKU());
    }

    /* JADX INFO: renamed from: getEndInclusive-s-VKNKU */
    public long m10219getEndInclusivesVKNKU() {
        return m10213getLastsVKNKU();
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ Comparable getStart() {
        return ULong.m9148boximpl(m10220getStartsVKNKU());
    }

    /* JADX INFO: renamed from: getStart-s-VKNKU */
    public long m10220getStartsVKNKU() {
        return m10212getFirstsVKNKU();
    }

    @Override // kotlin.ranges.ULongProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) ULong.m9154constructorimpl(m10212getFirstsVKNKU() ^ ULong.m9154constructorimpl(m10212getFirstsVKNKU() >>> 32))) * 31) + ((int) ULong.m9154constructorimpl(m10213getLastsVKNKU() ^ ULong.m9154constructorimpl(m10213getLastsVKNKU() >>> 32)));
    }

    @Override // kotlin.ranges.ULongProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return Long.compareUnsigned(m10212getFirstsVKNKU(), m10213getLastsVKNKU()) > 0;
    }

    @Override // kotlin.ranges.ULongProgression
    public String toString() {
        return ((Object) ULong.m9200toStringimpl(m10212getFirstsVKNKU())) + ".." + ((Object) ULong.m9200toStringimpl(m10213getLastsVKNKU()));
    }
}
