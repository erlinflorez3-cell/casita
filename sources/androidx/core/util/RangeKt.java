package androidx.core.util;

import android.util.Range;
import kotlin.Metadata;
import kotlin.ranges.ClosedRange;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
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
/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d̉=!4i\bӵLc\u0003\u0011I\u00066\u00116B\u0015\"4\u0012}\u0007~ Gӄ\\kX0bSp\u000f\u001azT0aҕ\u007fCc[*\u007f2\t\u0016N\u0016h\u0017Pj\rS\u000fL\u0016'i\\Sczu\u0018\u001f4Ro\u00063{n\u0004ʨj\rj\u0013#J(H{\u0015\u0001`*v\u000f\u0017\u0007Iŷ\u001a\u0012XF\u0001<b\r\u0014\u0005H\u0013.D0\u0003.\\.NdG\u001daH3;\u00030B\u0015ϓg݁\u0001M\u001bKl\\\u001byy$;BG5[%\u0002\u0002'^aΪ\u0011?\u001aC\u0015j7'qI\"X^^\u0010\u0016%+\u0016\r\fqVf\u0013Sx\u00127-_c\u0012P<'>߆\u0004%j\u0012\u0014\u001e-X0=\u001a-\b<2\u0015~Yó^\u0002\u0007H\u0010|q6]%.4S9af\u0002eI f7B\u0005S̜-ъr!i\\&\u0007#$l}a3a@\u0004H|\u0014yIsՎ~b*0\u00142W\u007fu{?/?+G]I#gk0G\u000bl\u000f+nskobJP\"5\u0016e))\u0018`եr\u0005\u0014VdZ<\u0011\u0014\u001c\u0003\b&\u000e#\"lw\u0003!S\u001a\u0015Tſmv"}, d2 = {"/mS", "\u001a`]1e6BRb\u000f\nb3Fu+n\u0002(Q", "\"", "", "=sW2e", ">kd@", "D`[BX", "uKP;W9HW\u0018H\u000bm0\u0004R\u001ca\t*{\u0016g\u001c\u0013XkWCr.7#[*?x\u0012;I@Bk\na{dj8\u0014m0M@7VPUuIN{?\u0014g", "@`]4X\u001bH", "BgPA", "uKY.i(\bZ\u0015\b|(\n\u0007\u0011:a\r$xG\u0001l}Lk\u001f8@,1b\u007fi\u0015w\u001e9IP7h;\u001ej,H5\u0010b9Xz&\u0011\\]0c\u001c_9\u001d\u0014Zc", "Bn29b:>R\u0006z\u0004`,", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?m\u0013 Ioc", "BnA.a.>", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RangeKt {
    public static final <T extends Comparable<? super T>> Range<T> rangeTo(T t2, T t3) {
        return new Range<>(t2, t3);
    }

    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, T t2) {
        return range.extend(t2);
    }

    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, Range<T> range2) {
        return range.extend(range2);
    }

    public static final <T extends Comparable<? super T>> Range<T> and(Range<T> range, Range<T> range2) {
        return range.intersect(range2);
    }

    public static final <T extends Comparable<? super T>> ClosedRange<T> toClosedRange(final Range<T> range) {
        return (ClosedRange) new ClosedRange<T>() { // from class: androidx.core.util.RangeKt.toClosedRange.1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            @Override // kotlin.ranges.ClosedRange
            public boolean contains(Comparable comparable) {
                return ClosedRange.DefaultImpls.contains(this, comparable);
            }

            @Override // kotlin.ranges.ClosedRange
            public boolean isEmpty() {
                return ClosedRange.DefaultImpls.isEmpty(this);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.ranges.ClosedRange
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.ranges.ClosedRange
            public Comparable getStart() {
                return range.getLower();
            }
        };
    }

    public static final <T extends Comparable<? super T>> Range<T> toRange(ClosedRange<T> closedRange) {
        return new Range<>(closedRange.getStart(), closedRange.getEndInclusive());
    }
}
