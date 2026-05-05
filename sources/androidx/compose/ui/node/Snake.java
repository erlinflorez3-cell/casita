package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004O\u00198\u000b4E\u0007\":\u0018\u007f\u0007loA0RnP.X\\2\u000fy{<řc$\bCCU \u0005*\t]ZogtK`œ\u0002%إFx\u0019+\nb\ta \u000fJB\u001e@ݯQqC;nw~\u0018.L:8( 1\u001e8d(v)`ƚ\u0010\u00146^~Y\u001b%[%2\u00124MP\u0007,}\u007fPLG\u001b\\\u0001ș$ɨmDTImSE[\u001bjl';}(Գ*Ë;7\u001bJa\fO_ie\u001b? dK|Ҋ+-O\u001ce_)\u000f\"\u0015CO;^ę*b\rĩx\u000e-/]h\u001c_\u001c.\u0010z*\u0014rH؝\n+`03\"t\u0011^B\u0003|k@~\t\u0015\u0007ȸ~eN\u0019+\u000bA4\n*t]y;GUm@˿\u0011\";\u0003t.i]^r#)lw\u007f@\b\u0001\u0014ʳP̆]A\u0006\u0006vr\u0010;TBU\u0012G{?=Me\u000eن;؝%o\u001aJJz\u0005\u00161wa}jHn1%Z֖.\r$\\Jy\u0013|!cfB)MJ[=Bݔ\u0017$tyB83\u0019\u001f^v\u0002\u0003M\f\u0011[sϬ;]\u0007m\u0014pGgڱ4QӘ\u0014\f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9{Er+5/", "", "2`c.", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uZ8uN\u0010", "5dc\u0011T;:", "u(J\u0016", "2hP4b5:Z\u0007\u0003\u0010^", "", "5dc\u0011\\(@]\"z\u0002L0\u0012\tvi\b3\u0003", "uZ8u<", "3mS%", "5dc\u0012a+1\u001b\u001d\u0007\u0006e", "3mS&", "5dc\u0012a+2\u001b\u001d\u0007\u0006e", "6`b\u000eW+Bb\u001d\t\u0004H9i\t7o\u0011$\u0003", "", "5dc\u0015T:\u001aR\u0018\u0003\nb6\u0006r<R\u007f0\u0006Q|\u001e^Kw\u0019C", "uZ8uM", "7r01W0MW#\b", "7r01W0MW#\bBb4\b\u0010", "@de2e:>", "5dc\u001fX=>`'~Bb4\b\u0010", "AsP?g\u001f", "5dc g(Kb\fF~f7\u0004", "AsP?g ", "5dc g(Kb\rF~f7\u0004", "/cS\u0011\\(@]\"z\u0002M6j\u0018+c\u0006", "", "2hP4b5:Z'", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9qE\u0006\u0013DU{&\r", "/cS\u0011\\(@]\"z\u0002M6j\u0018+c\u0006o\u007fH\f\u001e", "uZ8\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Py\r<@\t>hk/3k\u001c\u0004\u00114", "3pd._:", "=sW2e", "3pd._:\u0006W!\n\u0002", "uZ8\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016D\f", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uZ8u?1:d\u0015H\u0002Z5~R\u001dt\r,\u0005BV", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
final class Snake {
    private final int[] data;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Snake m5808boximpl(int[] iArr) {
        return new Snake(iArr);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int[] m5809constructorimpl(int[] iArr) {
        return iArr;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m5810equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof Snake) && Intrinsics.areEqual(iArr, ((Snake) obj).m5822unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5811equalsimpl0(int[] iArr, int[] iArr2) {
        return Intrinsics.areEqual(iArr, iArr2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5819hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public boolean equals(Object obj) {
        return m5810equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m5819hashCodeimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m5822unboximpl() {
        return this.data;
    }

    private /* synthetic */ Snake(int[] iArr) {
        this.data = iArr;
    }

    public final int[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: getStartX-impl, reason: not valid java name */
    public static final int m5817getStartXimpl(int[] iArr) {
        return iArr[0];
    }

    /* JADX INFO: renamed from: getStartY-impl, reason: not valid java name */
    public static final int m5818getStartYimpl(int[] iArr) {
        return iArr[1];
    }

    /* JADX INFO: renamed from: getEndX-impl, reason: not valid java name */
    public static final int m5813getEndXimpl(int[] iArr) {
        return iArr[2];
    }

    /* JADX INFO: renamed from: getEndY-impl, reason: not valid java name */
    public static final int m5814getEndYimpl(int[] iArr) {
        return iArr[3];
    }

    /* JADX INFO: renamed from: getReverse-impl, reason: not valid java name */
    public static final boolean m5816getReverseimpl(int[] iArr) {
        return iArr[4] != 0;
    }

    /* JADX INFO: renamed from: getDiagonalSize-impl, reason: not valid java name */
    public static final int m5812getDiagonalSizeimpl(int[] iArr) {
        return Math.min(m5813getEndXimpl(iArr) - m5817getStartXimpl(iArr), m5814getEndYimpl(iArr) - m5818getStartYimpl(iArr));
    }

    /* JADX INFO: renamed from: getHasAdditionOrRemoval-impl, reason: not valid java name */
    private static final boolean m5815getHasAdditionOrRemovalimpl(int[] iArr) {
        return m5814getEndYimpl(iArr) - m5818getStartYimpl(iArr) != m5813getEndXimpl(iArr) - m5817getStartXimpl(iArr);
    }

    /* JADX INFO: renamed from: isAddition-impl, reason: not valid java name */
    private static final boolean m5820isAdditionimpl(int[] iArr) {
        return m5814getEndYimpl(iArr) - m5818getStartYimpl(iArr) > m5813getEndXimpl(iArr) - m5817getStartXimpl(iArr);
    }

    /* JADX INFO: renamed from: addDiagonalToStack-impl, reason: not valid java name */
    public static final void m5807addDiagonalToStackimpl(int[] iArr, IntStack intStack) {
        if (m5815getHasAdditionOrRemovalimpl(iArr)) {
            if (m5816getReverseimpl(iArr)) {
                intStack.pushDiagonal(m5817getStartXimpl(iArr), m5818getStartYimpl(iArr), m5812getDiagonalSizeimpl(iArr));
                return;
            } else if (m5820isAdditionimpl(iArr)) {
                intStack.pushDiagonal(m5817getStartXimpl(iArr), m5818getStartYimpl(iArr) + 1, m5812getDiagonalSizeimpl(iArr));
                return;
            } else {
                intStack.pushDiagonal(m5817getStartXimpl(iArr) + 1, m5818getStartYimpl(iArr), m5812getDiagonalSizeimpl(iArr));
                return;
            }
        }
        intStack.pushDiagonal(m5817getStartXimpl(iArr), m5818getStartYimpl(iArr), m5813getEndXimpl(iArr) - m5817getStartXimpl(iArr));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m5821toStringimpl(int[] iArr) {
        return "Snake(" + m5817getStartXimpl(iArr) + AbstractJsonLexerKt.COMMA + m5818getStartYimpl(iArr) + AbstractJsonLexerKt.COMMA + m5813getEndXimpl(iArr) + AbstractJsonLexerKt.COMMA + m5814getEndYimpl(iArr) + AbstractJsonLexerKt.COMMA + m5816getReverseimpl(iArr) + ')';
    }

    public String toString() {
        return m5821toStringimpl(this.data);
    }
}
