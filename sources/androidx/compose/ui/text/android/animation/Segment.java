package androidx.compose.ui.text.android.animation;

import kotlin.Metadata;
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
/* JADX INFO: compiled from: SegmentBreaker.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4U\u0007\":\u001b\u007f\u0007lkA0RqP\u008cXݸ0%ӆ,4RZd%S?c\u001a\u0016\"7P^kupbZ9D\u001f\n${\u0003,wV\ta \u0013JB\u001e@CQ}BQ`#7\u0015$@(Py3\u0002ʀ.H\u001e}CJY\u001b*0nq\u0001Ŭ\u000e\u0016\f(\"\u001e>N\u0002dָh\u0017=V}u:]$IފC\u0017.mB\u0015M;G\u001bݒ\u000e?h,>X7c\u0016kڌ\u0004OYiS\u001b? >Kٙ(onW\to6\u0007ÜD\u001b1O\u001b]\u000b&\u000b\u0006\u0002f\u0012'9Q{K~\u000fX}\u0001{\u001b?\u001c\u000e4(x43\u001at\f&3#s\u0004FV\u0002lG\u0018z\u00107G+\u000639?3f\u007fb\u0002БM\u007f\r\u0013#6#/\u0006Qab&x\u00171S&PwӜA\u0006O\\#q=\u001c\u00057ľ\u0001r\u000b>a\u0018/*,tЦ$\bjG)9k0Iזk|\r\u009b\u0001UoZVIr}$9B\t:[ֈh\u000bs¬lZ2\u001b[%%\u0016\f\u000b+ \u000bx˶%+\u0018ʚgjou[fZ4=kOY\u001dlް[?fڨMSi\u001co[G#M<z\u0005\u0007g͞W\u0012b٢@$8Ux\u0019H\u000bRR$\u0013`@ۇ :4ջ1^\u001bV\u0011'ռE\u0019"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i3v\u001a6IR?u=g\u0003hcA\u0007l;$", "", "AsP?g\u0016?T'~\n", "", "3mS\u001cY-LS(", ":dUA", "Bn_", "@hV5g", "0ncAb4", "uH8\u0016<\u0010\"\u0017\n", "5dc\u000fb;M]!", "u(8", "5dc\u0012a+(T\u001a\rzm", "5dc\u0019X-M", "5dc\u001f\\.Ab", "5dc g(Kb\u0003\u007f{l,\f", "5dc!b7", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Segment {
    public static final int $stable = 0;
    private final int bottom;
    private final int endOffset;
    private final int left;
    private final int right;
    private final int startOffset;
    private final int top;

    public static /* synthetic */ Segment copy$default(Segment segment, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((1 & i8) != 0) {
            i2 = segment.startOffset;
        }
        if ((-1) - (((-1) - i8) | ((-1) - 2)) != 0) {
            i3 = segment.endOffset;
        }
        if ((4 & i8) != 0) {
            i4 = segment.left;
        }
        if ((-1) - (((-1) - i8) | ((-1) - 8)) != 0) {
            i5 = segment.top;
        }
        if ((-1) - (((-1) - i8) | ((-1) - 16)) != 0) {
            i6 = segment.right;
        }
        if ((i8 & 32) != 0) {
            i7 = segment.bottom;
        }
        return segment.copy(i2, i3, i4, i5, i6, i7);
    }

    public final int component1() {
        return this.startOffset;
    }

    public final int component2() {
        return this.endOffset;
    }

    public final int component3() {
        return this.left;
    }

    public final int component4() {
        return this.top;
    }

    public final int component5() {
        return this.right;
    }

    public final int component6() {
        return this.bottom;
    }

    public final Segment copy(int i2, int i3, int i4, int i5, int i6, int i7) {
        return new Segment(i2, i3, i4, i5, i6, i7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Segment)) {
            return false;
        }
        Segment segment = (Segment) obj;
        return this.startOffset == segment.startOffset && this.endOffset == segment.endOffset && this.left == segment.left && this.top == segment.top && this.right == segment.right && this.bottom == segment.bottom;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.startOffset) * 31) + Integer.hashCode(this.endOffset)) * 31) + Integer.hashCode(this.left)) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom);
    }

    public String toString() {
        return "Segment(startOffset=" + this.startOffset + ", endOffset=" + this.endOffset + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ')';
    }

    public Segment(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.startOffset = i2;
        this.endOffset = i3;
        this.left = i4;
        this.top = i5;
        this.right = i6;
        this.bottom = i7;
    }

    public final int getStartOffset() {
        return this.startOffset;
    }

    public final int getEndOffset() {
        return this.endOffset;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getBottom() {
        return this.bottom;
    }
}
