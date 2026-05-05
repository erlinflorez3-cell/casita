package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: LayerMatrixCache.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&˛\bDRш|İI\u0006F\u000b6B\u0015\"4\u0012}\u0007njO0L͜P.`S2\u000fq|<$q$yCAU\"}0\u0012WNmptϺpŏk\u0011\fǝ\u0007i\\I\u0004x\u001eM\u001ffPpWc]\u0001MH\u0017Қȥ\t*8%H\u007f\u000b\u0005*,N\u0016\u001d\u007fS\\\u001c!^F¤>\\\u0013P\u0015 \u0018\nN\"\u0007$\u0003n^8Xl\fB]%ɨmB\\0(K\u000ba%Hj&;\u0003\u0012\"9EO5KǬھ\u0002\u0006ӱZΪƄCsC\u001av=oDW\u000bo6\u0007\fD\u00199T%])̦ڑ\u0004Pՙ\u000bʬ˦SeQh\u001c>@~\n&T\u0004<\u000ewV<72h\u001e\razIԢLг\u0006^JȕK\u001eD\u0018=0C<I*\u001dϟň?#T:\f\u000b\u0013\"3\u0003t'\u0002Y\u001eq%*\u0003}Φ5[F@XT\u0010]Mo\nv\t\t:\u0006@G.7*\u0013\u0005ϒ'ھ_9+ܩ<\u0018VO\u007fx\u001b_\u0017_@ɰTڐ!Âߤ6)Á\u0010\\Ld\u0013x!`f:)MJc]å\u0014˙$\\\u007f˓q1\u001e^gh\u0018y$έ\u0016ɻ3f?ժ?w\u001chQ^aD(Ҳ\u001cуVv\u001c̳\rx\u0013j~Di\u000b\th~β>̄iݘɧzC«\u0010\u0015:?\u007f)\u0005:?,t\u0017^\u0002LH\u0018Ҕ\u0015ރ^h\u0018зԡ3-\u000bl*ڱ%/Odpu\u0007֗MF"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u001cU\u0012 DU\u0012=ZGNI0\u001c\u0018h7", "\"", "", "5dc\u001aT;KW,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "B`a4X;", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", ";`c?\\?", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", "/mS?b0=;\u0015\u000e\bb?Z\u0005-h\u007f", "7me2e:>;\u0015\u000e\bb?Z\u0005-h\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", ")E", "7r36e;R", "", "7r8;i,Ka\u0019]~k;\u0011", "7r8;i,Ka\u0019ove0{", ";`c?\\?\u001cO\u0017\u0002z", ">qTC\\6Nat\byk6\u0001\b\u0017a\u000f5\u007fS", "1`[0h3:b\u0019b\u0004o,\n\u0017/M{7\tD\u0014", "1`[0h3:b\u0019b\u0004o,\n\u0017/M{7\tD\u0014^\u00149lw)h/", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?6a", "1`[0h3:b\u0019fvm9\u0001\u001c", "1`[0h3:b\u0019fvm9\u0001\u001cvG\r'x\"`\u0019", "7me._0=O(~", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LayerMatrixCache<T> {
    public static final int $stable = 8;
    private Matrix androidMatrixCache;
    private final Function2<T, Matrix, Unit> getMatrix;
    private float[] inverseMatrixCache;
    private boolean isDirty = true;
    private boolean isInverseDirty = true;
    private boolean isInverseValid = true;
    private float[] matrixCache;
    private Matrix previousAndroidMatrix;

    /* JADX WARN: Multi-variable type inference failed */
    public LayerMatrixCache(Function2<? super T, ? super Matrix, Unit> function2) {
        this.getMatrix = function2;
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    /* JADX INFO: renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m5882calculateMatrixGrdbGEg(T t2) {
        float[] fArrM4409constructorimpl$default = this.matrixCache;
        if (fArrM4409constructorimpl$default == null) {
            fArrM4409constructorimpl$default = androidx.compose.ui.graphics.Matrix.m4409constructorimpl$default(null, 1, null);
            this.matrixCache = fArrM4409constructorimpl$default;
        }
        if (!this.isDirty) {
            return fArrM4409constructorimpl$default;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(t2, matrix);
        Matrix matrix2 = this.previousAndroidMatrix;
        if (matrix2 == null || !Intrinsics.areEqual(matrix, matrix2)) {
            AndroidMatrixConversions_androidKt.m4049setFromtUYjHk(fArrM4409constructorimpl$default, matrix);
            this.androidMatrixCache = matrix2;
            this.previousAndroidMatrix = matrix;
        }
        this.isDirty = false;
        return fArrM4409constructorimpl$default;
    }

    /* JADX INFO: renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m5881calculateInverseMatrixbWbORWo(T t2) {
        float[] fArrM4409constructorimpl$default = this.inverseMatrixCache;
        if (fArrM4409constructorimpl$default == null) {
            fArrM4409constructorimpl$default = androidx.compose.ui.graphics.Matrix.m4409constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArrM4409constructorimpl$default;
        }
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.m5879invertToJiSxe2E(m5882calculateMatrixGrdbGEg(t2), fArrM4409constructorimpl$default);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArrM4409constructorimpl$default;
        }
        return null;
    }
}
