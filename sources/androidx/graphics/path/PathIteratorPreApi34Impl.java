package androidx.graphics.path;

import android.graphics.Path;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import dalvik.annotation.optimization.FastNative;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: PathIteratorImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007toA0JeP.`Z2şs{B*cҕyCI^\"}(\tWNugvJ`\u000eK\u000f\u0014(\u0001j2L]xs\u0012\u00172HoE\u074ccڎm9\u000fsv$0608\u0012\u0005/\u001b:N\u0016v\tEc\f@3Pv@R\u001bQ\u001d\u001a@\u000b̧$\u0001,b0\\DQ\u0005]h9S\u0007wMf'\u000e<CaUeb4%v\u0010&[DE5-%\u0002\u00047ViA\u001b? G5l5+CI\"\\|ݜ\u001e\\$9]%]!5\r\t_g$'YW*֢nV.\u0006\u000b\u0014\rj\u0013T\boN<>2f6\u001ay\t;bNb\u001a^p\f+eD\u001e=\u007fa3\u007fә\u0005\u001a\u0001I,f7*\u000f=\"1\b\u0007!\n\\>d#/lw\u007fF\u0002DK^f\n\bG4Ւ\u000f+\u00118\u001bHG.9,\u0015<\u001e=7\nAiܭ\nJWR\u007f\u000f\u0005\u000fr\u0004m`OX\"\u001d\u001e}ѫ'TiR}\u001dk~^\t0\u001fT4T5\u0006Nʺ>%\u000eJ;=\u0010|j\u0019mxau\nSD\u0017;g\u0005\u0004\u000e\u0006C%G}Wq,yR%/\u0006P3\u0011fmZS:b3̨$ĘLj\u0018ǮԤHk"}, d2 = {"\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?Z45fy/Az\u0001;M\u001fFo\u0002lxpl@\\", "\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?Z45fy/Azy6XJ\u0011", ">`c5", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wO\u0004l", "1n]6V\fOO \u000fvm0\u0007\u0012", "\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?Z45fy/AzT\fWL?i\u0014/\u0011oq5\u0016g6WL", "Bn[2e(GQ\u0019", "", "uKP;W9HW\u0018H|k(\b\f3c\u000eqf<\u0010\u001al.k\u0017;\u0004/9X\u0011i9z\u00129PG9y})\u0011wd\u0003q_;QZ6GYJ;f_1\u001b\u001e\u001b^\f.<\t\fi=3rN@tho:", "7mc2e5:Z\u0004z\na\u0010\f\t<a\u000f2\t", "", "1`[0h3:b\u0019l~s,", "", "7mR9h+>1#\b\f^9\f\t.C\n1\u007f>\u000f", "", "1qT.g,\"\\(~\bg(\u0004s+t\u0003\f\u000b@\u000e\u0013&Q|", "2dbAe6R7\"\u000ezk5x\u0010\u001aa\u000f+_O\u0001$\u0013Vy\u001b", "", "4h]._0SS", "6`b\u001bX?M", "7mc2e5:Z\u0004z\na\u0010\f\t<a\u000f2\t#|%\u007fG\u0003\u001d", "7mc2e5:Z\u0004z\na\u0010\f\t<a\u000f2\t)\u0001*&", ">nX;g:", "", "=eU@X;", "7mc2e5:Z\u0004z\na\u0010\f\t<a\u000f2\t+\u0001\u0017\u001d", "7mc2e5:Z\u0004z\na\u0010\f\t<a\u000f2\t-|)\u0005K\u0005\u000e", "7mc2e5:Z\u0004z\na\u0010\f\t<a\u000f2\t.\u0005,\u0017", "<dgA", "\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?d%7a})F,\u0005BXC\u0011", ">dT8", "5qP=[0<a`\nvm/v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PathIteratorPreApi34Impl extends PathIteratorImpl {
    private final long internalPathIterator;

    private final native long createInternalPathIterator(Path path, int i2, float f2);

    private final native void destroyInternalPathIterator(long j2);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j2);

    @FastNative
    private final native int internalPathIteratorNext(long j2, float[] fArr, int i2);

    @FastNative
    private final native int internalPathIteratorPeek(long j2);

    @FastNative
    private final native int internalPathIteratorRawSize(long j2);

    @FastNative
    private final native int internalPathIteratorSize(long j2);

    public /* synthetic */ PathIteratorPreApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i2 + 2) - (2 | i2) != 0 ? PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i2 & 4) != 0 ? 0.25f : f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorPreApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2) {
        super(path, conicEvaluation, f2);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        this.internalPathIterator = createInternalPathIterator(path, conicEvaluation.ordinal(), f2);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public int calculateSize(boolean z2) {
        if (!z2 || getConicEvaluation() == PathIterator.ConicEvaluation.AsConic) {
            return internalPathIteratorRawSize(this.internalPathIterator);
        }
        return internalPathIteratorSize(this.internalPathIterator);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public boolean hasNext() {
        return internalPathIteratorHasNext(this.internalPathIterator);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public PathSegment.Type peek() {
        return PathIteratorImplKt.PathSegmentTypes[internalPathIteratorPeek(this.internalPathIterator)];
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public PathSegment.Type next(float[] points, int i2) {
        Intrinsics.checkNotNullParameter(points, "points");
        return PathIteratorImplKt.PathSegmentTypes[internalPathIteratorNext(this.internalPathIterator, points, i2)];
    }

    protected final void finalize() {
        destroyInternalPathIterator(this.internalPathIterator);
    }
}
