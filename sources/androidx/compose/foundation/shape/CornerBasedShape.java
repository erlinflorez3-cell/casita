package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
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
/* JADX INFO: compiled from: CornerBasedShape.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4L\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$c$wCCU(\u0003*\tUOm\r\u0005Ϻ\u000b\u000bq\u000eF9\tn:Imx\f\u0013\u001f6PqW3{pM=nwN\u0005N32<\b\t\u0019\u001aXIǘzzQPT\u001e>K\t:\u0001҈}\t(\u001e\u001e>N\u0002f\u000buYNH\u001bҗj5)\u0003wBf'\u000e1-S\u0013Fb)%v\u0010\u001f[F=5#(k\u00035S\fE\t?\u007fA\u001dhU(qm<}De\u0018\u0014C9\u007f\u0011k\u0002>\\3a\u0011\u00105<gcyb>,\u0006\u000e\u0014\rj\u0018ٳ\u0005Ωρ2/ {\u0016${5\u0001`XP0lr\u0004\tpN\u0017S\u0010c/G\u001b~Q\u0010RIRE}\u001d\rL:1r/^l\u000e\u000f,KX\u0006UIQnTxR\u0018jUm2\u0003)&ň\u0003\u0382Ͻ\u00041\u0002)<0uFi<;!\u001a\u0003ҩHm~ݓxjYo`O\u00111|\u001aO*7\rʑHj\rߘhV^4\u001fTlc\u0015\u007f \u0013N]ʟ@'-īfQnrxT.\u00193/~7\bo«\u0012]AӔK7Wm\u001ehׯv\u0019G?hەt\u0015AΖ\u0010t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001K ;VCHH0,\u0015gO<\u0003n,$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "Bn_ g(Kb", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001K ;VCHY83\u0015>", "Bn_\u0012a+", "0ncAb4\u001e\\\u0018", "0ncAb4,b\u0015\f\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnC\\y+77s8ZL;x\"\"*h7 \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u000fX;\u0016\u0004UP(xM\u0001-\u000b(T\u0002\u0005F\u000b\u0019\u001f\u000eBXtWVe.u\u001etN3lEl)wQIPl8dU`'lC9 #u#$2^1\u0006\u0007SZP\\\u0007pgT\u0007~M$\u0014TWOD|_@s:hI\u0006\u007f\u001d<fttu7\u0014=)2s\tUpaLat ,&\u001f13?< -OxuB\u0002~", "5dc\u000fb;M]!^\u0004]", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~g\u0001\u001cBm_\fWPDkA\f\u0019}a\u000f", "5dc\u000fb;M]!l\nZ9\f", "5dc!b7\u001e\\\u0018", "5dc!b7,b\u0015\f\n", "1n_F", "/k[", "1qT.g,(c(\u0006~g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001fi\r';v\u0016\u0004", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "1qT.g,(c(\u0006~g,Ds;9\u0015<\u000b$", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s{dj8\u0014m0M\npEVV7f`r\u0007$\u0016$\u001eW/\u001cN8A-|HF3]o0}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?Q-2Hf[\u0005JECpsN\u001cn$`C:y", "", "1qT.g,(c(\u0006~g,Do4S\u0015/m\u000b", "uI5\u00139\r%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`WsWL\u007f)D#d\u001cKw&=,GHk2-\u0019rj\u000fJJ(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N[N yG;\u001d\u0016u3\u0012Jo\u0005\u0015\u0016c", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class CornerBasedShape implements Shape {
    public static final int $stable = 0;
    private final CornerSize bottomEnd;
    private final CornerSize bottomStart;
    private final CornerSize topEnd;
    private final CornerSize topStart;

    public abstract CornerBasedShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4);

    /* JADX INFO: renamed from: createOutline-LjSzlW0 */
    public abstract Outline mo1284createOutlineLjSzlW0(long j2, float f2, float f3, float f4, float f5, LayoutDirection layoutDirection);

    public CornerBasedShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        this.topStart = cornerSize;
        this.topEnd = cornerSize2;
        this.bottomEnd = cornerSize3;
        this.bottomStart = cornerSize4;
    }

    public final CornerSize getTopStart() {
        return this.topStart;
    }

    public final CornerSize getTopEnd() {
        return this.topEnd;
    }

    public final CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    public final CornerSize getBottomStart() {
        return this.bottomStart;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final Outline mo621createOutlinePq9zytI(long j2, LayoutDirection layoutDirection, Density density) {
        float fMo1292toPxTmRCtEA = this.topStart.mo1292toPxTmRCtEA(j2, density);
        float fMo1292toPxTmRCtEA2 = this.topEnd.mo1292toPxTmRCtEA(j2, density);
        float fMo1292toPxTmRCtEA3 = this.bottomEnd.mo1292toPxTmRCtEA(j2, density);
        float fMo1292toPxTmRCtEA4 = this.bottomStart.mo1292toPxTmRCtEA(j2, density);
        float fM4005getMinDimensionimpl = Size.m4005getMinDimensionimpl(j2);
        float f2 = fMo1292toPxTmRCtEA + fMo1292toPxTmRCtEA4;
        if (f2 > fM4005getMinDimensionimpl) {
            float f3 = fM4005getMinDimensionimpl / f2;
            fMo1292toPxTmRCtEA *= f3;
            fMo1292toPxTmRCtEA4 *= f3;
        }
        float f4 = fMo1292toPxTmRCtEA2 + fMo1292toPxTmRCtEA3;
        if (f4 > fM4005getMinDimensionimpl) {
            float f5 = fM4005getMinDimensionimpl / f4;
            fMo1292toPxTmRCtEA2 *= f5;
            fMo1292toPxTmRCtEA3 *= f5;
        }
        if (fMo1292toPxTmRCtEA < 0.0f || fMo1292toPxTmRCtEA2 < 0.0f || fMo1292toPxTmRCtEA3 < 0.0f || fMo1292toPxTmRCtEA4 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fMo1292toPxTmRCtEA + ", topEnd = " + fMo1292toPxTmRCtEA2 + ", bottomEnd = " + fMo1292toPxTmRCtEA3 + ", bottomStart = " + fMo1292toPxTmRCtEA4 + ")!").toString());
        }
        return mo1284createOutlineLjSzlW0(j2, fMo1292toPxTmRCtEA, fMo1292toPxTmRCtEA2, fMo1292toPxTmRCtEA3, fMo1292toPxTmRCtEA4, layoutDirection);
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i2 + 1) - (1 | i2) != 0) {
            cornerSize = cornerBasedShape.topStart;
        }
        if ((2 & i2) != 0) {
            cornerSize2 = cornerBasedShape.topEnd;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            cornerSize3 = cornerBasedShape.bottomEnd;
        }
        if ((i2 & 8) != 0) {
            cornerSize4 = cornerBasedShape.bottomStart;
        }
        return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public final CornerBasedShape copy(CornerSize cornerSize) {
        return copy(cornerSize, cornerSize, cornerSize, cornerSize);
    }
}
