package androidx.graphics.path;

import android.graphics.Path;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007toA0JeP.hS2şs{J$cҕyCI[\"Ԃ*\t]WogtJb\u000bY\u000f\u000eǝ\u0001j:[]xc\u0013\u00151Xģo3{n}XpxD\u000582P9\n\u000b\u0007\u001a8J(v)F[\u0012\u00180NtRR;Rŋ\u001e\u0012\u0014Dh\u000f,g\u007fNdT\u001daH<;\u0003\u0018P\u0015;(6\u000b\\%F\u00035S\u000b*49PO5C6\u0004\u0007\u0015ds?1R\"A\u0013|?'YU:k~^\u000e)-+}\u001e$\u0007vh\u0013Xx\fU3&ҭMח\u0012(\u007f\u07beL\u0019J\r&\u0006UR\u0005Ʃ\u001cǴ\f\u000e;οɪWV"}, d2 = {"\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?Z45fy/Azq9Q\u0011\nO<)\u001c>", "\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?Z45fy/Azy6XJ\u0011", ">`c5", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wO\u0004l", "1n]6V\fOO \u000fvm0\u0007\u0012", "\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?Z45fy/AzT\fWL?i\u0014/\u0011oq5\u0016g6WL", "Bn[2e(GQ\u0019", "", "uKP;W9HW\u0018H|k(\b\f3c\u000eqf<\u0010\u001al.k\u0017;\u0004/9X\u0011i9z\u00129PG9y})\u0011wd\u0003q_;QZ6GYJ;f_1\u001b\u001e\u001b^\f.<\t\fi=3rN@tho:", "1n]6V\nH\\*~\bm,\n", "\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`%y\u0017@t\u0003?b\u000f D|\u0016;#", ">kPAY6K[|\u000ezk(\f\u0013<", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wO\u0004z&G|\nK\u00012\u000b", "1`[0h3:b\u0019l~s,", "", "7mR9h+>1#\b\f^9\f\t.C\n1\u007f>\u000f", "", "6`b\u001bX?M", "<dgA", "\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?d%7a})F,\u0005BXC\u0011", ">nX;g:", "", "=eU@X;", ">dT8", "5qP=[0<a`\nvm/v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PathIteratorApi34Impl extends PathIteratorImpl {
    private final ConicConverter conicConverter;
    private final android.graphics.PathIterator platformIterator;

    public /* synthetic */ PathIteratorApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (2 & i2) != 0 ? PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? 0.25f : f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2) {
        super(path, conicEvaluation, f2);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        android.graphics.PathIterator pathIterator = path.getPathIterator();
        Intrinsics.checkNotNullExpressionValue(pathIterator, "path.pathIterator");
        this.platformIterator = pathIterator;
        this.conicConverter = new ConicConverter();
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public int calculateSize(boolean z2) {
        boolean z3 = z2 && getConicEvaluation() == PathIterator.ConicEvaluation.AsQuadratics;
        android.graphics.PathIterator pathIterator = getPath().getPathIterator();
        Intrinsics.checkNotNullExpressionValue(pathIterator, "path.pathIterator");
        float[] fArr = new float[8];
        int quadraticCount = 0;
        while (pathIterator.hasNext()) {
            if (pathIterator.next(fArr, 0) == 3 && z3) {
                ConicConverter conicConverter = this.conicConverter;
                ConicConverter.convert$default(conicConverter, fArr, fArr[6], getTolerance(), 0, 8, null);
                quadraticCount += conicConverter.getQuadraticCount();
            } else {
                quadraticCount++;
            }
        }
        return quadraticCount;
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public PathSegment.Type next(float[] points, int i2) {
        Intrinsics.checkNotNullParameter(points, "points");
        if (this.conicConverter.getCurrentQuadratic() >= this.conicConverter.getQuadraticCount()) {
            PathSegment.Type typePlatformToAndroidXSegmentType = PathIteratorImplKt.platformToAndroidXSegmentType(this.platformIterator.next(points, i2));
            if (typePlatformToAndroidXSegmentType != PathSegment.Type.Conic || getConicEvaluation() != PathIterator.ConicEvaluation.AsQuadratics) {
                return typePlatformToAndroidXSegmentType;
            }
            ConicConverter conicConverter = this.conicConverter;
            conicConverter.convert(points, points[i2 + 6], getTolerance(), i2);
            if (conicConverter.getQuadraticCount() > 0) {
                conicConverter.nextQuadratic(points, i2);
            }
            return PathSegment.Type.Quadratic;
        }
        this.conicConverter.nextQuadratic(points, i2);
        return PathSegment.Type.Quadratic;
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public boolean hasNext() {
        return this.platformIterator.hasNext();
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public PathSegment.Type peek() {
        return PathIteratorImplKt.platformToAndroidXSegmentType(this.platformIterator.peek());
    }
}
