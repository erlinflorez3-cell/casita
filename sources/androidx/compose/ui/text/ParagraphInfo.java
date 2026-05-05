package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: MultiParagraph.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\tnjG5LeNIZS8\u0018s{:%c$\u007fOC٥\"}8\tWN}gvJp\u000bK\u000f\f\u001b\u0001jBI]xc\u0016\u0015˱H\u0006ЀcM\u001e<y$\u0005:\u0013 J\"fz\u0015\u0005(,`\u0010%}SO\u001a\u0016H@\u001f=b\u0013S\u0005(\u0017\u001e>N\u0004.bmNDN\u0005]h23\toB\\.w0+U\u001dLZ'\u001b\u007fy\u001eYH˝9\u00153]K\u000e`xW\u0003mr\u0004ޢio.9g\fWd[Fг\u0016sV\u001b|\u000b&\u000b\b\u0018ԧ\ro2]\u0004cP<+>\u0084|UC\u0012/\u001e'v1sֆgP\u0015A\u0017\u000bSnXHߐCH\u0002oY/%.;qޔ\u001c/\u001fo_1Neަ5\u0013$#\u000fn9[\u0003\u000f\u0011\u001b!T\u0006SIQn@xT\u0010YKq\u001cp\u0011\u0005Z\n6G\u000e4\u0014\u0011\\\u001aU=a91'\u0004\u0002vG\u0018|\u000b`vZ\u0002RvHRt\u001c78\u0012$ZrlK\u009eO\u001di:6e\u001c\u0003-.\u000e!GtyR S\u000f\u0015ҏi2q[\u0006\"%]i}ׁm4\u0015ebv3c{*\u009a`\u001b~\"jTb3\u0005\u000fB\u00028#d6MJH\u0019= {r{T/@j\n\u001cbZY\u0019\u000bCx\t$BO,!_\t\u000f˦}Ԟտ(\u0005oT\u0003:IXj#\bg'LT|\u000f%uI_h1&\u0004%\u00114+&O\u0007\u00024_gzOtlD}\u001e\u000e.K29\u007fee\u0013=5ɴ1ĈβINx\u001d_\u0006Z/\t2\u0012\u000fi\u0015Vg6\u001794n$bO\u0003\u001aJv\ruk\u0010r:\u0012at}oc\u0003\u000e$FW.\u001bYjV`|3'n=\u000fx:|c5\u001aڶ)ə{ 7֒y_oz<\u0006\u0003\u0011,\u0002s\u0012|r$szQ\f5֑<Oa˚V$*{\u0011R\u0019\u0003\u0006\u000eZ\tb\u0010\nǬMяtb@ԇ#1\u0004w\u0015<-r\\mH&@\rBBw*\"F4XڎG))OY|{}\u001ck\u0019J'\n9|ϥr\u0018$ܻ8X]x\u0017GV\u0003&8Y;\u0011\bØ\r*<ɶT\n\u0011[byV(\t\u0005^_=\u001a\t\u0085\u007fŌZ\u001a\\ۿtXN\u001enU\u0001#0\u001b\r\"\u00046\u0007<I\u0005\u001cN+Жo҅\u0005_%̿3lU\u001at1KFZU)6߳\u0001\u0010M`I͔\u001ed\u0003ۄ-*"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:Q\u001f/W\u0019", "", ">`a.Z9:^\u001c", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:C", "AsP?g\u0010GR\u0019\u0012", "", "3mS\u0016a+>f", "AsP?g\u0013B\\\u0019b\u0004],\u0010", "3mS\u0019\\5>7\"}zq", "Bn_", "", "0ncAb4", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W'r21[\u000b\u001cBpk\u00121'\u001fL\u0015a\u0006", "5dc\u000fb;M]!", "u(5", "Adc\u000fb;M]!", "uE\u0018#", "5dc\u0012a+\"\\\u0018~\u000e", "u(8", "5dc\u0012a+%W\"~^g+|\u001c", "Adc\u0012a+%W\"~^g+|\u001c", "uH\u0018#", ":d]4g/", "5dc\u0019X5@b\u001c", "5dc\u001dT9:U&z\u0006a", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006a!BU\u007f-3x\u0019\u0004", "5dc g(Kb|\by^?", "5dc g(Kb\u007f\u0003\u0004^\u0010\u0006\b/x", "Adc g(Kb\u007f\u0003\u0004^\u0010\u0006\b/x", "5dc!b7", "Adc!b7", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "", "Bn69b):Z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "BqT.g!>`#Z\tG<\u0004\u0010", "Bn69b):Z`\u0012yQ|Djy", "uIIu=", "Bn69b):Z|\by^?", "Bn69b):Z\u007f\u0003\u0004^\u0010\u0006\b/x", "Bn69b):Z\ri\u0005l0\f\r9n", "Bn;<V(E", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "Bn;<V(E\u001b\u0001dBAAPx", "uI\u0018\u0017", "Bn;<V(E7\"}zq", "Bn;<V(E:\u001d\bzB5{\tB", "Bn;<V(EG\u0004\t\tb;\u0001\u00138", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ParagraphInfo {
    public static final int $stable = 8;
    private float bottom;
    private final int endIndex;
    private int endLineIndex;
    private final Paragraph paragraph;
    private final int startIndex;
    private int startLineIndex;
    private float top;

    public static /* synthetic */ ParagraphInfo copy$default(ParagraphInfo paragraphInfo, Paragraph paragraph, int i2, int i3, int i4, int i5, float f2, float f3, int i6, Object obj) {
        if ((1 & i6) != 0) {
            paragraph = paragraphInfo.paragraph;
        }
        if ((i6 + 2) - (2 | i6) != 0) {
            i2 = paragraphInfo.startIndex;
        }
        if ((i6 + 4) - (4 | i6) != 0) {
            i3 = paragraphInfo.endIndex;
        }
        if ((i6 + 8) - (8 | i6) != 0) {
            i4 = paragraphInfo.startLineIndex;
        }
        if ((16 & i6) != 0) {
            i5 = paragraphInfo.endLineIndex;
        }
        if ((i6 + 32) - (32 | i6) != 0) {
            f2 = paragraphInfo.top;
        }
        if ((i6 & 64) != 0) {
            f3 = paragraphInfo.bottom;
        }
        return paragraphInfo.copy(paragraph, i2, i3, i4, i5, f2, f3);
    }

    public final Paragraph component1() {
        return this.paragraph;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    public final int component4() {
        return this.startLineIndex;
    }

    public final int component5() {
        return this.endLineIndex;
    }

    public final float component6() {
        return this.top;
    }

    public final float component7() {
        return this.bottom;
    }

    public final ParagraphInfo copy(Paragraph paragraph, int i2, int i3, int i4, int i5, float f2, float f3) {
        return new ParagraphInfo(paragraph, i2, i3, i4, i5, f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
        return Intrinsics.areEqual(this.paragraph, paragraphInfo.paragraph) && this.startIndex == paragraphInfo.startIndex && this.endIndex == paragraphInfo.endIndex && this.startLineIndex == paragraphInfo.startLineIndex && this.endLineIndex == paragraphInfo.endLineIndex && Float.compare(this.top, paragraphInfo.top) == 0 && Float.compare(this.bottom, paragraphInfo.bottom) == 0;
    }

    public int hashCode() {
        return (((((((((((this.paragraph.hashCode() * 31) + Integer.hashCode(this.startIndex)) * 31) + Integer.hashCode(this.endIndex)) * 31) + Integer.hashCode(this.startLineIndex)) * 31) + Integer.hashCode(this.endLineIndex)) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.bottom);
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.paragraph + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", startLineIndex=" + this.startLineIndex + ", endLineIndex=" + this.endLineIndex + ", top=" + this.top + ", bottom=" + this.bottom + ')';
    }

    public ParagraphInfo(Paragraph paragraph, int i2, int i3, int i4, int i5, float f2, float f3) {
        this.paragraph = paragraph;
        this.startIndex = i2;
        this.endIndex = i3;
        this.startLineIndex = i4;
        this.endLineIndex = i5;
        this.top = f2;
        this.bottom = f3;
    }

    public /* synthetic */ ParagraphInfo(Paragraph paragraph, int i2, int i3, int i4, int i5, float f2, float f3, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(paragraph, i2, i3, (i6 & 8) != 0 ? -1 : i4, (i6 & 16) == 0 ? i5 : -1, (-1) - (((-1) - i6) | ((-1) - 32)) != 0 ? -1.0f : f2, (-1) - (((-1) - i6) | ((-1) - 64)) == 0 ? f3 : -1.0f);
    }

    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    public final void setStartLineIndex(int i2) {
        this.startLineIndex = i2;
    }

    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public final void setEndLineIndex(int i2) {
        this.endLineIndex = i2;
    }

    public final float getTop() {
        return this.top;
    }

    public final void setTop(float f2) {
        this.top = f2;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final void setBottom(float f2) {
        this.bottom = f2;
    }

    public final int getLength() {
        return this.endIndex - this.startIndex;
    }

    public final int toLocalIndex(int i2) {
        return RangesKt.coerceIn(i2, this.startIndex, this.endIndex) - this.startIndex;
    }

    public final int toGlobalIndex(int i2) {
        return i2 + this.startIndex;
    }

    public final int toLocalLineIndex(int i2) {
        return i2 - this.startLineIndex;
    }

    public final int toGlobalLineIndex(int i2) {
        return i2 + this.startLineIndex;
    }

    public final float toGlobalYPosition(float f2) {
        return f2 + this.top;
    }

    public final float toLocalYPosition(float f2) {
        return f2 - this.top;
    }

    /* JADX INFO: renamed from: toLocal-MK-Hz9U, reason: not valid java name */
    public final long m6004toLocalMKHz9U(long j2) {
        return OffsetKt.Offset(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2) - this.top);
    }

    public final Rect toGlobal(Rect rect) {
        return rect.m3974translatek4lQ0M(OffsetKt.Offset(0.0f, this.top));
    }

    public final Rect toLocal(Rect rect) {
        return rect.m3974translatek4lQ0M(OffsetKt.Offset(0.0f, -this.top));
    }

    public final Path toGlobal(Path path) {
        path.mo4073translatek4lQ0M(OffsetKt.Offset(0.0f, this.top));
        return path;
    }

    /* JADX INFO: renamed from: toGlobal-xdX6-G0$default, reason: not valid java name */
    public static /* synthetic */ long m6002toGlobalxdX6G0$default(ParagraphInfo paragraphInfo, long j2, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return paragraphInfo.m6003toGlobalxdX6G0(j2, z2);
    }

    /* JADX INFO: renamed from: toGlobal-xdX6-G0, reason: not valid java name */
    public final long m6003toGlobalxdX6G0(long j2, boolean z2) {
        if (z2 && TextRange.m6116equalsimpl0(j2, TextRange.Companion.m6128getZerod9O1mEE())) {
            return TextRange.Companion.m6128getZerod9O1mEE();
        }
        return TextRangeKt.TextRange(toGlobalIndex(TextRange.m6123getStartimpl(j2)), toGlobalIndex(TextRange.m6118getEndimpl(j2)));
    }
}
