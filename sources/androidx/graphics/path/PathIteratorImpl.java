package androidx.graphics.path;

import android.graphics.Path;
import android.graphics.PointF;
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
/* JADX INFO: compiled from: PathIteratorImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007toA0JiP.`e2\u000fq|<$i*yّCU(\u0007*ޛWNuvvJp\u000bKƤ\u000e\u0016\u000fj4I[ye\u0012%2JoE6S\u000eSʠ~\u0014f\u0005N1Z7\u0019E *.V\u0010\u000fzqL\u001c\u00186@~<j\r{\b*\u0018\f>.\u00056\\\u0016SɇLlk@w1\u0011xZNUo`\u0001[\u001e^TU\u001f=\u0006fLNJM\u001b5U\u0013\u0007\u0001pm\u0017ouK\u0010\u0001'U7yweLp\u007fB,qOոar4tMWn%?+}u\u0012tV,\u0006\u0015\u0014\rj\u001fV\u001e5bF-H}8\u0012A\u0011\u000bSn\\2dH\u007f\t~N\u0017S\u0010yO\u0002!toy;Ge} U\u001c,%\u0019nO^ڍ\u0012f\u001dÑlyW8_H\u000eW\\\nq=\u001c\u0005Ͳf\b2ʶHI\u00068\n\u001b~#3Bs9Q-BȸJזkv\r\u009b9bwV`@Psގ;0\u0011ȱrFj\u0012y^Ԣ\\L"}, d2 = {"\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?Z45fy/Azy6XJ\u0011", "", ">`c5", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wO\u0004l", "1n]6V\fOO \u000fvm0\u0007\u0012", "\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?Z45fy/AzT\fWL?i\u0014/\u0011oq5\u0016g6WL", "Bn[2e(GQ\u0019", "", "uKP;W9HW\u0018H|k(\b\f3c\u000eqf<\u0010\u001al.k\u0017;\u0004/9X\u0011i9z\u00129PG9y})\u0011wd\u0003q_;QZ6GYJ;f_1\u001b\u001e\u001b^\f.<\t\fi=3rN@tho:", "5dc\u0010b5BQx\u0010ve<x\u00183o\t", "u(;.a+K]\u001d}\u000e(.\n\u0005:h\u0004&\n\n\f\u0013&J9x8\u0006(\u0019h}-3| ;\f!Et8\u001cty]@\u0017_;R\u00010\u001d", "5dc\u001dT;A", "u(;.a+K]\u001d}D`9x\u00142i}6E+|&\u001a\u001d", ">nX;g:\u001dO(z", "", "5dc!b3>`\u0015\bx^", "u(5", "1`[0h3:b\u0019l~s,", "", "7mR9h+>1#\b\f^9\f\t.C\n1\u007f>\u000f", "", "4k^.g:-]\u0004\t~g;\u000b", "", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&w\u001d", "Bx_2", "\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?d%7a})F,\u0005BXC\u0011", "uZ5\u0019T5=`#\u0003yqu~\u0016+p\u0003,yNJ\"\u0013VrW'r48G}\"?m\u001f=\f2Ov4sX^H5\u0010b9Xz&\u0011N[(gUv;\"[E\u0018R4\u001ce/", "6`b\u001bX?M", "<dgA", "\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?d%7a})FC", ">nX;g:", "=eU@X;", ">dT8", "\u0011n\\=T5B]\"", "5qP=[0<a`\nvm/v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class PathIteratorImpl {
    private static final Companion Companion = new Companion(null);
    private final PathIterator.ConicEvaluation conicEvaluation;
    private final Path path;
    private final float[] pointsData;
    private final float tolerance;

    /* JADX INFO: compiled from: PathIteratorImpl.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public abstract int calculateSize(boolean z2);

    public abstract boolean hasNext();

    public abstract PathSegment.Type next(float[] fArr, int i2);

    public abstract PathSegment.Type peek();

    public PathIteratorImpl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f2;
        this.pointsData = new float[8];
    }

    public final Path getPath() {
        return this.path;
    }

    public /* synthetic */ PathIteratorImpl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (2 & i2) != 0 ? PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i2 & 4) != 0 ? 0.25f : f2);
    }

    public final PathIterator.ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    public final float getTolerance() {
        return this.tolerance;
    }

    /* JADX INFO: compiled from: PathIteratorImpl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0004Gٍ1!Ǟr~P+R|\rfʴ=0Re߲2S"}, d2 = {"\u001a`]1e6BR,H|k(\b\f3c\u000eq\u0007<\u0010\u001a`2k\u001d?Z45fy/Azy6XJyI>& dj=\u0011l\u0002", "", "u(E", "5qP=[0<a`\nvm/v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        System.loadLibrary("androidx.graphics.path");
    }

    public static /* synthetic */ PathSegment.Type next$default(PathIteratorImpl pathIteratorImpl, float[] fArr, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i2 = 0;
        }
        return pathIteratorImpl.next(fArr, i2);
    }

    public final PathSegment next() {
        PathSegment.Type next = next(this.pointsData, 0);
        if (next == PathSegment.Type.Done) {
            return PathSegmentUtilities.getDoneSegment();
        }
        if (next == PathSegment.Type.Close) {
            return PathSegmentUtilities.getCloseSegment();
        }
        return new PathSegment(next, floatsToPoints(this.pointsData, next), next == PathSegment.Type.Conic ? this.pointsData[6] : 0.0f);
    }

    private final PointF[] floatsToPoints(float[] fArr, PathSegment.Type type) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i2 == 1) {
            return new PointF[]{new PointF(fArr[0], fArr[1])};
        }
        if (i2 == 2) {
            return new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3])};
        }
        if (i2 == 3 || i2 == 4) {
            return new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5])};
        }
        if (i2 == 5) {
            return new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5]), new PointF(fArr[6], fArr[7])};
        }
        return new PointF[0];
    }
}
