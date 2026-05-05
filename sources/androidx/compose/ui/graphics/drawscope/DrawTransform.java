package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
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
/* JADX INFO: compiled from: DrawTransform.kt */
/* JADX INFO: loaded from: classes4.dex */
@DrawScopeMarker
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007ljA0ReP\u008cZS@\u000fsڔ<$q$yCAW\"}0\u000eWNmwvJp\u000bK\u000f\f\u0018~PBկ\u0006x\f\u0011WTPvW3{wm=n}N\u0005N<R>\u007f\u0005\u000f%BH>\u0003Agǰ\u000b۵ضDr@_\u001b[M\\ \u0015V /&\rmT6V|u:]43oHN5qH|{\u001evZ-\r\u0005t6+nHe\u001b+S\u0011\u001bj[m\u0014owC\u0005v2?+w\u007f\u001eZߒ~ϬƦ/Q\u0013r\u0001<%+_w$'YW\u0014O^\u001e@w)\r=@\u0012 \u001e'v?]\u001et\u001b&3#\u0004\u0004D^\u0016vB.\f(Z_G\u000eKC9In\u0002eI2f7*\u0016=$)\u0001|;sT<a[?ȑv\u0383śUBCc\\&\"g{!\tb0244U\u001eG{??G)EzQ#O|2NJg\u0005\u001fxh\u0002j\u0019lڐ!Âގ;,\u000f,he-\u001dyrlXZ\u0019} b*\u0016\bAD#\u001c͌ طŎRQn\u000fxs&$3V~7\bv\u001c\u0014]9lCMQ\u0012!\u0012X|\u0014MNz\u0005\u0007w\tw\\rj(:2vkFLR\u0380Pݵ\u0012ԵǦp\u001bٜ051^\u001bJ\u0011!\u0013W\u000b\rwZ\u0017\u0015UՅ5˭\u0002ǭ̾s\bɹT`\tqm~W/̂_\"\u038dA`=\u001c,ƀ>\u00173\u0005#\r\u001e{\u0002M\u0007zFƫp>¯Y|"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0004u]B\u0015d6[~|", "", "1d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5dc\u0010X5MS&F[*\nLe!0", "u(9", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc \\A>\u001b\u0002aBc)i\u0007", "1kX=C(MV", "", ">`c5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "1kX=B7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013`\u0002+!xk", "1kX=C(MV`\u0007\nk+[P\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:Cyq>", "1kX=E,<b", ":dUA", "", "Bn_", "@hV5g", "0ncAb4", "1kX=E,<b`gtBv\u0004\t1", "uE5\u00139\u0010\u0002D", "7mb2g", "@nc.g,", "2dV?X,L", ">he<g", "@nc.g,\u0006C*Q\u0006)\u0015X", "uE9uI", "AbP9X", "AbP9X\u001f", "AbP9X ", "AbP9Xs\t/\u0006Ia:v", "uE5\u0017\u001c\u001d", "BqP;f-H`!", ";`c?\\?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "BqP;f-H`!FJ1)b\u0006!c", "uZ5uI", "BqP;f3:b\u0019", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface DrawTransform {
    /* JADX INFO: renamed from: clipPath-mtrdD-E */
    void mo4657clipPathmtrdDE(Path path, int i2);

    /* JADX INFO: renamed from: clipRect-N_I0leg */
    void mo4658clipRectN_I0leg(float f2, float f3, float f4, float f5, int i2);

    /* JADX INFO: renamed from: getSize-NH-jbRc */
    long mo4660getSizeNHjbRc();

    void inset(float f2, float f3, float f4, float f5);

    /* JADX INFO: renamed from: rotate-Uv8p0NA */
    void mo4661rotateUv8p0NA(float f2, long j2);

    /* JADX INFO: renamed from: scale-0AR0LA0 */
    void mo4662scale0AR0LA0(float f2, float f3, long j2);

    /* JADX INFO: renamed from: transform-58bKbWc */
    void mo4663transform58bKbWc(float[] fArr);

    void translate(float f2, float f3);

    /* JADX INFO: compiled from: DrawTransform.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m4796getCenterF1C5BW0(DrawTransform drawTransform) {
            return DrawTransform.super.mo4659getCenterF1C5BW0();
        }
    }

    /* JADX INFO: renamed from: getCenter-F1C5BW0 */
    default long mo4659getCenterF1C5BW0() {
        float f2 = 2;
        return OffsetKt.Offset(Size.m4006getWidthimpl(mo4660getSizeNHjbRc()) / f2, Size.m4003getHeightimpl(mo4660getSizeNHjbRc()) / f2);
    }

    /* JADX INFO: renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m4791clipRectN_I0leg$default(DrawTransform drawTransform, float f2, float f3, float f4, float f5, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            f2 = 0.0f;
        }
        if ((i3 + 2) - (2 | i3) != 0) {
            f3 = 0.0f;
        }
        if ((i3 + 4) - (4 | i3) != 0) {
            f4 = Size.m4006getWidthimpl(drawTransform.mo4660getSizeNHjbRc());
        }
        if ((8 & i3) != 0) {
            f5 = Size.m4003getHeightimpl(drawTransform.mo4660getSizeNHjbRc());
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            i2 = ClipOp.Companion.m4167getIntersectrtfAjoo();
        }
        drawTransform.mo4658clipRectN_I0leg(f2, f3, f4, f5, i2);
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m4790clipPathmtrdDE$default(DrawTransform drawTransform, Path path, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i3 & 2) != 0) {
            i2 = ClipOp.Companion.m4167getIntersectrtfAjoo();
        }
        drawTransform.mo4657clipPathmtrdDE(path, i2);
    }

    static /* synthetic */ void translate$default(DrawTransform drawTransform, float f2, float f3, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        drawTransform.translate(f2, f3);
    }

    /* JADX INFO: renamed from: rotate-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m4792rotateUv8p0NA$default(DrawTransform drawTransform, float f2, long j2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j2 = drawTransform.mo4659getCenterF1C5BW0();
        }
        drawTransform.mo4661rotateUv8p0NA(f2, j2);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0$default, reason: not valid java name */
    static /* synthetic */ void m4793scale0AR0LA0$default(DrawTransform drawTransform, float f2, float f3, long j2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            j2 = drawTransform.mo4659getCenterF1C5BW0();
        }
        drawTransform.mo4662scale0AR0LA0(f2, f3, j2);
    }
}
