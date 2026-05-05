package androidx.graphics.path;

import android.graphics.Path;
import android.os.Build;
import androidx.graphics.path.PathSegment;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
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
/* JADX INFO: compiled from: PathIterator.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000ejLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0RjP.XU2\u000f\u0002{<$a'yCI[\"Ԃ*\t]WogtJb\u000bY\u000f\u000eǝ\u0001j:[]xc\u0014%˰ruO5]ok9\u000fsn\u0004;rAH}\u0013\u00022*v\u0012\u0007\u0001IK\u001a\u0015H@\u001f>b\u0013S\u0005(\u0017\u001e>N\u0007ɉ`g\\=\u0011zkJG#1zrT-_>\u000fe\rtgo\u0014\u0005u6+nJ{խ%\u001c\n\u0015gs?1?8\u074c\u00051?5@as\u0006L\t\u0004\",CO;u#,b\u0005_y$'Y`*P\u0019\u00126\u0012\u0013{;RT\u001d\u0014*`.[\u001eǴ\f\u0014;ο\u000bUFX\u0010g\u0013\f\tkN\u0017S\u000b\nڂ;ӸjQiݢi]E|\u001d\rL%ъr'c٪&b\u001b'b\u0005\"@_EUH|\u0010ՒAs\f͏z\u00040\u0012>VĲ3\u0018"}, d2 = {"\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?Z45fy/Azk", "", "\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?d%7a})FC", ">`c5", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wO\u0004l", "1n]6V\fOO \u000fvm0\u0007\u0012", "\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?Z45fy/AzT\fWL?i\u0014/\u0011oq5\u0016g6WL", "Bn[2e(GQ\u0019", "", "uKP;W9HW\u0018H|k(\b\f3c\u000eqf<\u0010\u001al.k\u0017;\u0004/9X\u0011i9z\u00129PG9y})\u0011wd\u0003q_;QZ6GYJ;f_1\u001b\u001e\u001b^\f.<\t\fi=3rN@tho:", "5dc\u0010b5BQx\u0010ve<x\u00183o\t", "u(;.a+K]\u001d}\u000e(.\n\u0005:h\u0004&\n\n\f\u0013&J9x8\u0006(\u0019h}-3| ;\f!Et8\u001cty]@\u0017_;R\u00010\u001d", "7l_9X4>\\(z\nb6\u0006", "\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?Z45fy/Azy6XJ\u0011", "5dc\u001dT;A", "u(;.a+K]\u001d}D`9x\u00142i}6E+|&\u001a\u001d", "5dc!b3>`\u0015\bx^", "u(5", "1`[0h3:b\u0019l~s,", "", "7mR9h+>1#\b\f^9\f\t.C\n1\u007f>\u000f", "", "6`b\u001bX?M", "<dgA", "\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?d%7a})F,\u0005BXC\u0011", ">nX;g:", "", "=eU@X;", ">dT8", "\u0011n]6V\fOO \u000fvm0\u0007\u0012", "5qP=[0<a`\nvm/v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PathIterator implements Iterator<PathSegment>, KMappedMarker {
    private final ConicEvaluation conicEvaluation;
    private final PathIteratorImpl implementation;
    private final Path path;
    private final float tolerance;

    /* JADX INFO: compiled from: PathIterator.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0006Gّ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wEшY\u001d"}, d2 = {"\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?Z45fy/AzT\fWL?i\u0014/\u0011oq5\u0016g6WL", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u000fr2<a0<", "\u000fr@BT+KO(\u0003xl", "5qP=[0<a`\nvm/v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum ConicEvaluation {
        AsConic,
        AsQuadratics
    }

    public final PathSegment.Type next(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return next$default(this, points, 0, 2, null);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public PathIterator(Path path, ConicEvaluation conicEvaluation, float f2) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f2;
        this.implementation = Build.VERSION.SDK_INT >= 34 ? new PathIteratorApi34Impl(path, conicEvaluation, f2) : new PathIteratorPreApi34Impl(path, conicEvaluation, f2);
    }

    public final Path getPath() {
        return this.path;
    }

    public /* synthetic */ PathIterator(Path path, ConicEvaluation conicEvaluation, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (2 & i2) != 0 ? ConicEvaluation.AsQuadratics : conicEvaluation, (i2 + 4) - (i2 | 4) != 0 ? 0.25f : f2);
    }

    public final ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    public final float getTolerance() {
        return this.tolerance;
    }

    public static /* synthetic */ int calculateSize$default(PathIterator pathIterator, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = true;
        }
        return pathIterator.calculateSize(z2);
    }

    public final int calculateSize(boolean z2) {
        return this.implementation.calculateSize(z2);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.implementation.hasNext();
    }

    public final PathSegment.Type peek() {
        return this.implementation.peek();
    }

    public static /* synthetic */ PathSegment.Type next$default(PathIterator pathIterator, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 + 2) - (i3 | 2) != 0) {
            i2 = 0;
        }
        return pathIterator.next(fArr, i2);
    }

    public final PathSegment.Type next(float[] points, int i2) {
        Intrinsics.checkNotNullParameter(points, "points");
        return this.implementation.next(points, i2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public PathSegment next() {
        return this.implementation.next();
    }
}
