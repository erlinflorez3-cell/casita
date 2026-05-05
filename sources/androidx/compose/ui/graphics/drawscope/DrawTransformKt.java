package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.DegreesKt;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: DrawTransform.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d̉=!,i\bDZc|\u0004O\u000b8\u000b4E\u0007\"B\u0012\u007f\u0007lmQCR͜`.\u0001RR\u000f\u001a{d(iҕ\nCiV`ԉ(!n\\ʴ\u007fnxY3C=\u0006F~p,WW\u0011]@\u0010bHu?AP\b=ga;ȉ\u000b8Y0<\u0012\u0005/\u0019RH>v+GY\u0011*0nqjX\u0013M\u0013 *\u0006l'Gȭb˚MȤՂp_@71\f\u0002i\\1w0+L5F\u0003'=zo(C@e6E+Y\u0003\u0015Xs?1F8ܼ\u000bڋ&ݐȅMu]Af\tϯ\u00150W\u0010cĘB\u000b\u0004Œd\u0018"}, d2 = {"7mb2g", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0004u]B\u0015d6[~|", "", "6na6m6Gb\u0015\u0006", "DdaA\\*:Z", "@nc.g,+O\u0018", "@`S6T5L", ">he<g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "@nc.g,+O\u0018FE:\u0019Go\u000b0", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'Wn5\u0010q-X\u0004/\u001d-3oM", "AbP9X", "AbP9Xs\t/\u0006Ia:v", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DrawTransformKt {
    public static final void inset(DrawTransform drawTransform, float f2, float f3) {
        drawTransform.inset(f2, f3, f2, f3);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f2, float f3, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = 0.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = 0.0f;
        }
        drawTransform.inset(f2, f3, f2, f3);
    }

    /* JADX INFO: renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m4800rotateRad0AR0LA0$default(DrawTransform drawTransform, float f2, long j2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            j2 = drawTransform.mo4659getCenterF1C5BW0();
        }
        drawTransform.mo4661rotateUv8p0NA(DegreesKt.degrees(f2), j2);
    }

    /* JADX INFO: renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m4799rotateRad0AR0LA0(DrawTransform drawTransform, float f2, long j2) {
        drawTransform.mo4661rotateUv8p0NA(DegreesKt.degrees(f2), j2);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m4802scale0AR0LA0$default(DrawTransform drawTransform, float f2, long j2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            j2 = drawTransform.mo4659getCenterF1C5BW0();
        }
        drawTransform.mo4662scale0AR0LA0(f2, f2, j2);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m4801scale0AR0LA0(DrawTransform drawTransform, float f2, long j2) {
        drawTransform.mo4662scale0AR0LA0(f2, f2, j2);
    }

    public static final void inset(DrawTransform drawTransform, float f2) {
        drawTransform.inset(f2, f2, f2, f2);
    }
}
