package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {}, d1 = {"Я2\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000b<B\u0007Ӭ4\u0012\u0006\fnj?7Le^.ZS0\u000fs{J$cҕyCQU\"Ԃ:\u0015]Ȟ\u007fg\u001dI\u000b\u000fQ\u000f\u001e\u0016'kDiczu\u0012=5jom2}sK=xtd\nP60>\u0012\u0005/\u001fZL\u001e}\u0013Cy\u0011*TNxRR;P-\u001a@\u0005n$\u000f'tg|;xrc:=)\u001bipSWe6|[\u0014^TU\u0012\u000f\f,5X7c\u0018MS1\u0006\u0003_M\u000eWqk\n\u0019--+W\u007fo6\u0007\u0005D\u00199U%]!+\r\t_g$'YT{d^\u001b@w)~5<2\r61V<E v\n\u001e3#u\u0002O\u0017أdZ)\tqN\u0017S\u0003[+g\u001a\u0017UoL1Ne\u000e5\u0011,6\u0019nOo\u0005\u0018n#3Z\bSAQn@v]PԶCѐ\b\u0006"}, d2 = {"\u0011`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "7lP4X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "@nc.g,", "", "2dV?X,L", "", ">he<g\u001f", ">he<g ", "@nc.g,+O\u0018", "@`S6T5L", "AbP9X", "Aw", "Ax", "Ehc5F(OS", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "Ehc5F(OS\u007fz\u000f^9", "0nd;W:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", ">`X;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CanvasKt {
    public static final Canvas Canvas(ImageBitmap imageBitmap) {
        return AndroidCanvas_androidKt.ActualCanvas(imageBitmap);
    }

    public static final void withSave(Canvas canvas, Function0<Unit> function0) {
        try {
            canvas.save();
            function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restore();
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void withSaveLayer(Canvas canvas, Rect rect, Paint paint, Function0<Unit> function0) {
        try {
            canvas.saveLayer(rect, paint);
            function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restore();
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void rotate(Canvas canvas, float f2, float f3, float f4) {
        if (f2 == 0.0f) {
            return;
        }
        canvas.translate(f3, f4);
        canvas.rotate(f2);
        canvas.translate(-f3, -f4);
    }

    public static /* synthetic */ void rotateRad$default(Canvas canvas, float f2, float f3, float f4, int i2, Object obj) {
        if ((2 & i2) != 0) {
            f3 = 0.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f4 = 0.0f;
        }
        rotateRad(canvas, f2, f3, f4);
    }

    public static final void rotateRad(Canvas canvas, float f2, float f3, float f4) {
        rotate(canvas, DegreesKt.degrees(f2), f3, f4);
    }

    public static /* synthetic */ void scale$default(Canvas canvas, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            f3 = f2;
        }
        scale(canvas, f2, f3, f4, f5);
    }

    public static final void scale(Canvas canvas, float f2, float f3, float f4, float f5) {
        if (f2 == 1.0f && f3 == 1.0f) {
            return;
        }
        canvas.translate(f4, f5);
        canvas.scale(f2, f3);
        canvas.translate(-f4, -f5);
    }
}
