package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
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
/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!,i\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007|jAӄLe^.ZS@\u000fsڔ<$i)yCAV\"}0\u000fWNmgvJp\u000bK\u000f\f\u001f\u0011\u0017:կmx\f\u001172poo7[pU9\u000fvf\u001a.5:I\n\u0007\u0011\u001aXH x\u000bCy\u000b@4Ϯt:X\u0012\u0014į *2LĨ\u0019\u001e\u000bfv6vl\u000e>=)\u001bipUWt>\u007fe\u001eVV7\r%a.-P7c\u0014SWΫ\u000bRaDIӑwU1vѧ?+wr\u007f6\u0007\u007fD\u00199U%]!.\r\u001a_c$8;QsK~\u000e8y\u000b{;;2\u0012Ν+H42`ǘ\u000e&w\u0003Ɂk@~\u0001\u0007B.z\u0012:%.\u00183YCKj_lS\u0019|A,\t\u001b*;\u0001\u001d+\fX\u001cm-\u001b\u0003\u0002\u0002F_CUY^\fi=\u001c\u0004\u0001d\u0012*2/u\u0004\u009e\u007f\u00114\u001ckڢaQg/ǽ\u001aHrf\u001f\u0005\u000fh\u0004m`QX\"\u001d$g.\u0017\u0017rD\u0013\u0013\u001cTbdD\u0011{*\u0005\u000b\f\u0015+ \u000b\u0006l63\u0013f`xkzM\f\n51v7\bm\u001a\u0012Ć=^9:\u0018Ҷ\u0016y\u0001\u0005#W<\u0011\u0004\u0001fpS<`b(0B`j>\t,Y\\\u000f+COs,4Z1)^%H1\u001dpEҴ\r_`mVоZKf\u0011{<t7\u007fx\\\u001fo\u0018~O,\u000bs:-o[e\u001f,U0|L|Q\u0011/y\u0006Gua_L\u001b &j\n#.+IS?=A\u000f\u000f+B\u0002[DzvϯUM\u0018,Aۧ\u007f'_vD\u007f\b\u0019oT`\u0019J\u007fi%%\u000fo\u0003%\u0018d.yqH\u000bG\u0012S9_ƏMr\t^\u0003҅>\u0015Q-5=\u0001\u001e!%5[CW#\u001cw\"G-a\fs 4\u007fb\u001d?\re26\u0014\u001cub_qJ;fS\n\u0005D\"2\u0002\u001bBvt(\u001dP\fL\u001eCJQd\u001fVHO\u001b/,e50ޛtVa?Y̑\u0004LfmD\fC,\u0013\u0007CS\u0011}Ymm{ct\u000bx\u0019:\u0011\u00021|+4=N`\bw\u00173\u001e\u0005(8Q;\u0011\u0005L\u000b44Z;6\u000fͲXi\f\u0015AěLwG%MZsiU6T'\\\u0007N\u000b`Sx9*/\t?9$xCJ\u001dmt^_x@\u0004k.\u0019\u001dzO-f5-TTg\u001aV\\܁\u000fEcH\u0010\u0380<\u008cKE"}, d2 = {"Ehc563B^", "", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "1kX=C(MV", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wO\u0004l", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1kX=E,<b", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010wl", ":dUA", "", "Bn_", "@hV5g", "0ncAb4", "", "Ehc5@(M`\u001d\u0012", ";`c?\\?", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "Ehc5E6MO(\u0003\u0005g", "2dV?X,L", ">he<g\u001f", ">he<g ", "Ehc5F(OS", "Ehc5F*:Z\u0019", "F", "G", "Ehc5F2>e", "Ehc5G9:\\'\u0006vm0\u0007\u0012", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CanvasKt {
    public static final void withSave(Canvas canvas, Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        try {
            function1.invoke(canvas);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restoreToCount(iSave);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void withTranslation(Canvas canvas, float f2, float f3, Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.translate(f2, f3);
        try {
            function1.invoke(canvas);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restoreToCount(iSave);
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ void withTranslation$default(Canvas canvas, float f2, float f3, Function1 function1, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.translate(f2, f3);
        try {
            function1.invoke(canvas);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restoreToCount(iSave);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void withRotation(Canvas canvas, float f2, float f3, float f4, Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.rotate(f2, f3, f4);
        try {
            function1.invoke(canvas);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restoreToCount(iSave);
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ void withRotation$default(Canvas canvas, float f2, float f3, float f4, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = 0.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.rotate(f2, f3, f4);
        try {
            function1.invoke(canvas);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restoreToCount(iSave);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void withScale(Canvas canvas, float f2, float f3, float f4, float f5, Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.scale(f2, f3, f4, f5);
        try {
            function1.invoke(canvas);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restoreToCount(iSave);
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ void withScale$default(Canvas canvas, float f2, float f3, float f4, float f5, Function1 function1, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = 1.0f;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            f3 = 1.0f;
        }
        if ((4 & i2) != 0) {
            f4 = 0.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            f5 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.scale(f2, f3, f4, f5);
        try {
            function1.invoke(canvas);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restoreToCount(iSave);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void withSkew(Canvas canvas, float f2, float f3, Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.skew(f2, f3);
        try {
            function1.invoke(canvas);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restoreToCount(iSave);
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ void withSkew$default(Canvas canvas, float f2, float f3, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.skew(f2, f3);
        try {
            function1.invoke(canvas);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restoreToCount(iSave);
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ void withMatrix$default(Canvas canvas, Matrix matrix, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            matrix = new Matrix();
        }
        int iSave = canvas.save();
        canvas.concat(matrix);
        try {
            function1.invoke(canvas);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restoreToCount(iSave);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void withMatrix(Canvas canvas, Matrix matrix, Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.concat(matrix);
        try {
            function1.invoke(canvas);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restoreToCount(iSave);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void withClip(Canvas canvas, Rect rect, Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.clipRect(rect);
        try {
            function1.invoke(canvas);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restoreToCount(iSave);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void withClip(Canvas canvas, RectF rectF, Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.clipRect(rectF);
        try {
            function1.invoke(canvas);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restoreToCount(iSave);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void withClip(Canvas canvas, int i2, int i3, int i4, int i5, Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.clipRect(i2, i3, i4, i5);
        try {
            function1.invoke(canvas);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restoreToCount(iSave);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void withClip(Canvas canvas, float f2, float f3, float f4, float f5, Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.clipRect(f2, f3, f4, f5);
        try {
            function1.invoke(canvas);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restoreToCount(iSave);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void withClip(Canvas canvas, Path path, Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            function1.invoke(canvas);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restoreToCount(iSave);
            InlineMarker.finallyEnd(1);
        }
    }
}
