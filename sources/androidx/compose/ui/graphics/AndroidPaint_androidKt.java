package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
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
/* JADX INFO: compiled from: AndroidPaint.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яp\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000b6B\r'4\u0012\u000e\u0007nʑA0RnP\u008cZS@\u000fs{:$c$\bCCU }*\teNo˧vJp\u000bK\u000f\f\u0017\u0001jBI]ތe\u0012\u001d2JoE5UoS9ht<\t(288\u0002\u0005\u0007\u001b2H&v\u0003ŏS\f(0HpPR\u0015M\u000b\"*\nLĨ\u0019\u001e\u000bff<Vlu:]$I݃ZV5aH|{\fnTU\u000e\u000fo,.X7c\u0019MW1\b;[\u001e\b\u0006мU\u0013v-?+wz\u007f:\u0007\u0001|\u0015\nTSƞ\u000b9j\ri`:0SS\u0012L9\u000e\u0007|AԈɁ@\u0004\u001c\u0010?[<82f6\u001a[x!T)P`c\tȕѐe6%2\u0018F9G3f\u007fpc\u001d|8d\u0005k#iЧͼ%[b\u001bx()d\u0010Q_bhAvOrY\u001crJ͏Ċ\u0006*\u0012=_\u000e=\u000e).E)__g$\nk`M\u000bϙ\u000f\u0013n{ki\u0001Lh&\u001d\u0017 *g\u0011!ե|\u0018ydlXZ&u \u0003\bf\bq%#ɼ˶%%\u001e[g~w\u0001e]8<WjeZWkl\\ibAMic>e\u0019Θ,UJ{\u001dX\u0015Y{\u0010\t]\u0011\"\u0011M\u001b\u0014\u0006\u0014\\N:\u001axŭ\n<BFI\u0019\u000b,p\u0007LC*|gd\u000bl\u001e\u001al3R\u001f0˅܈\bɖ˩`ru\u0005\u0007gD\u001dnAEA\u007fLA*\u0004#Q4[(7\u0003\u0002\u0018_gzP\u0013˾خtɝދ$\u0018 Y_PU+\u001d!A20DmP!f:Mp,+\u0003\b'SjDf6\u000e7ݚx\u000bXsl\u0017P\u000e\u0007vQ\tM\u007fXfv~U{l\u000b\nJ\u0010ͿľXߢҡ<~\u000bD,C\u0019\b0#M-q>E\u001a&\u0015\u0018\u0015@b\u001au<\u0012z\u0011<s\u0014+rϣ.\u000epyu2iOq]-?\u000b$K\brTx\u0010 J\u001f3;\\1Czo5b\u0014ߒG\u001et2D\r\u001fm\u0004>Apf4\rdZwQ\u0016,^q4W\u07bdтfƚߑO^\u0011v\u001d(#\u001c?\u001c*\u001ck7~[\u0011\n\u0019\u0006R\u001dfEIz\u001d<75zɶҽ\u0007ՁͲXk\f>\t\u001e^u\u001dFJB\"R~\u0012\u0003yEV'\n\u0011In9B\u0001-\u0013yͨ\u0011K?5\u0006F\u0003F\f6/T\u0006\tyo\u007f\u0003t=CD\u0003=aιp!\u0019vuCw\u0019^\bu*VkN\u0011h\u001c\u000b5Z\u0018IN\u0018ΙۜuѪͿ\u000fWj\u0001r\u0015:n`\u0002B)-{-\u000ej\u000bۊ\u000b\u001eWuuܐIzM\u0000;w"}, d2 = {"\u001e`X;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", ";`Z2A(MW*~eZ0\u0006\u0018", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", "/r2<`7Ha\u0019ivb5\f", "5dc\u001bT;Bd\u0019Z\u0002i/x", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001eU\r$Hm\u0001*QLJA", "5dc\u001bT;Bd\u0019Z\u0004m0X\u00103a\u000e", "", "5dc\u001bT;Bd\u0019\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "uKP;W9HW\u0018H|k(\b\f3c\u000eqf<\u0005 &\u001d3r", "5dc\u001bT;Bd\u0019_~e;|\u0016\u001bu{/\u007fO\u0015", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0016]\u0005/7z\u0002>IJ?zHs", "uKP;W9HW\u0018H|k(\b\f3c\u000eqf<\u0005 &\u001d3q", "5dc\u001bT;Bd\u0019l\nk6\u0003\t\ra\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", "5dc\u001bT;Bd\u0019l\nk6\u0003\t\u0014o\u00041", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=mz8QL\u0011", "5dc\u001bT;Bd\u0019l\nk6\u0003\t\u0017i\u000f(\t'\u0005\u001f\u001bV", "5dc\u001bT;Bd\u0019l\nk6\u0003\t!i~7~", "5dc\u001bT;Bd\u0019l\nr3|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)Fq\u001f0;ROr4s", "Adc\u001bT;Bd\u0019Z\u0002i/x", "", "D`[BX", "Adc\u001bT;Bd\u0019Z\u0004m0X\u00103a\u000e", "Adc\u001bT;Bd\u0019[\u0002^5{p9d\u007f", ";nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "Adc\u001bT;Bd\u0019[\u0002^5{p9d\u007fo]\u001dK\u0004\u0016-q", "uKP;W9HW\u0018H|k(\b\f3c\u000eqf<\u0005 &\u001dSQ-", "Adc\u001bT;Bd\u0019\\\u0005e6\n", "Adc\u001bT;Bd\u0019\\\u0005e6\nP}Wn\u000eh#l", "uKP;W9HW\u0018H|k(\b\f3c\u000eqf<\u0005 &\u001dTQ-", "Adc\u001bT;Bd\u0019\\\u0005e6\ni3l\u000f(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "Adc\u001bT;Bd\u0019_~e;|\u0016\u001bu{/\u007fO\u0015", "Adc\u001bT;Bd\u0019_~e;|\u0016\u001bu{/\u007fO\u0015^f\u0012ZmJS\u0015", "Adc\u001bT;Bd\u0019ivm/\\\n0e}7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u0017n\u0017.KR\u0011", "Adc\u001bT;Bd\u0019l}Z+|\u0016", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0016~<\u007f\u0017$\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001f7zk", "Adc\u001bT;Bd\u0019l\nk6\u0003\t\ra\u000b", "Adc\u001bT;Bd\u0019l\nk6\u0003\t\ra\u000boY.tz\u00177u", "Adc\u001bT;Bd\u0019l\nk6\u0003\t\u0014o\u00041", "Adc\u001bT;Bd\u0019l\nk6\u0003\t\u0014o\u00041CFg&{A\u0001i", "Adc\u001bT;Bd\u0019l\nk6\u0003\t\u0017i\u000f(\t'\u0005\u001f\u001bV", "Adc\u001bT;Bd\u0019l\nk6\u0003\t!i~7~", "Adc\u001bT;Bd\u0019l\nr3|", "Adc\u001bT;Bd\u0019l\nr3|Pv5s(\tFp", "\u001c`c6i,)O\u001d\b\n", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidPaint_androidKt {

    /* JADX INFO: compiled from: AndroidPaint.android.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final Paint Paint() {
        return new AndroidPaint();
    }

    public static final Paint asComposePaint(android.graphics.Paint paint) {
        return new AndroidPaint(paint);
    }

    public static final android.graphics.Paint makeNativePaint() {
        return new android.graphics.Paint(7);
    }

    /* JADX INFO: renamed from: setNativeBlendMode-GB0RdKg */
    public static final void m4062setNativeBlendModeGB0RdKg(android.graphics.Paint paint, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.INSTANCE.m4581setBlendModeGB0RdKg(paint, i2);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m4030toPorterDuffModes9anfk8(i2)));
        }
    }

    public static final void setNativeColorFilter(android.graphics.Paint paint, ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
    }

    public static final float getNativeAlpha(android.graphics.Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final void setNativeAlpha(android.graphics.Paint paint, float f2) {
        paint.setAlpha((int) Math.rint(f2 * 255.0f));
    }

    public static final boolean getNativeAntiAlias(android.graphics.Paint paint) {
        return paint.isAntiAlias();
    }

    public static final void setNativeAntiAlias(android.graphics.Paint paint, boolean z2) {
        paint.setAntiAlias(z2);
    }

    public static final long getNativeColor(android.graphics.Paint paint) {
        return ColorKt.Color(paint.getColor());
    }

    /* JADX INFO: renamed from: setNativeColor-4WTKRHQ */
    public static final void m4063setNativeColor4WTKRHQ(android.graphics.Paint paint, long j2) {
        paint.setColor(ColorKt.m4232toArgb8_81llA(j2));
    }

    /* JADX INFO: renamed from: setNativeStyle--5YerkU */
    public static final void m4067setNativeStyle5YerkU(android.graphics.Paint paint, int i2) {
        paint.setStyle(PaintingStyle.m4441equalsimpl0(i2, PaintingStyle.Companion.m4446getStrokeTiuSbCo()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public static final int getNativeStyle(android.graphics.Paint paint) {
        Paint.Style style = paint.getStyle();
        return (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) == 1 ? PaintingStyle.Companion.m4446getStrokeTiuSbCo() : PaintingStyle.Companion.m4445getFillTiuSbCo();
    }

    public static final float getNativeStrokeWidth(android.graphics.Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final void setNativeStrokeWidth(android.graphics.Paint paint, float f2) {
        paint.setStrokeWidth(f2);
    }

    public static final int getNativeStrokeCap(android.graphics.Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i2 = strokeCap == null ? -1 : WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        if (i2 == 1) {
            return StrokeCap.Companion.m4531getButtKaPHkGw();
        }
        if (i2 == 2) {
            return StrokeCap.Companion.m4532getRoundKaPHkGw();
        }
        if (i2 == 3) {
            return StrokeCap.Companion.m4533getSquareKaPHkGw();
        }
        return StrokeCap.Companion.m4531getButtKaPHkGw();
    }

    /* JADX INFO: renamed from: setNativeStrokeCap-CSYIeUk */
    public static final void m4065setNativeStrokeCapCSYIeUk(android.graphics.Paint paint, int i2) {
        Paint.Cap cap;
        if (StrokeCap.m4527equalsimpl0(i2, StrokeCap.Companion.m4533getSquareKaPHkGw())) {
            cap = Paint.Cap.SQUARE;
        } else if (StrokeCap.m4527equalsimpl0(i2, StrokeCap.Companion.m4532getRoundKaPHkGw())) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = StrokeCap.m4527equalsimpl0(i2, StrokeCap.Companion.m4531getButtKaPHkGw()) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final int getNativeStrokeJoin(android.graphics.Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i2 = strokeJoin == null ? -1 : WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        if (i2 == 1) {
            return StrokeJoin.Companion.m4542getMiterLxFBmk8();
        }
        if (i2 == 2) {
            return StrokeJoin.Companion.m4541getBevelLxFBmk8();
        }
        if (i2 == 3) {
            return StrokeJoin.Companion.m4543getRoundLxFBmk8();
        }
        return StrokeJoin.Companion.m4542getMiterLxFBmk8();
    }

    /* JADX INFO: renamed from: setNativeStrokeJoin-kLtJ_vA */
    public static final void m4066setNativeStrokeJoinkLtJ_vA(android.graphics.Paint paint, int i2) {
        Paint.Join join;
        if (StrokeJoin.m4537equalsimpl0(i2, StrokeJoin.Companion.m4542getMiterLxFBmk8())) {
            join = Paint.Join.MITER;
        } else if (StrokeJoin.m4537equalsimpl0(i2, StrokeJoin.Companion.m4541getBevelLxFBmk8())) {
            join = Paint.Join.BEVEL;
        } else {
            join = StrokeJoin.m4537equalsimpl0(i2, StrokeJoin.Companion.m4543getRoundLxFBmk8()) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final float getNativeStrokeMiterLimit(android.graphics.Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final void setNativeStrokeMiterLimit(android.graphics.Paint paint, float f2) {
        paint.setStrokeMiter(f2);
    }

    public static final int getNativeFilterQuality(android.graphics.Paint paint) {
        return !paint.isFilterBitmap() ? FilterQuality.Companion.m4280getNonefv9h1I() : FilterQuality.Companion.m4278getLowfv9h1I();
    }

    /* JADX INFO: renamed from: setNativeFilterQuality-50PEsBU */
    public static final void m4064setNativeFilterQuality50PEsBU(android.graphics.Paint paint, int i2) {
        paint.setFilterBitmap(!FilterQuality.m4273equalsimpl0(i2, FilterQuality.Companion.m4280getNonefv9h1I()));
    }

    public static final void setNativeShader(android.graphics.Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void setNativePathEffect(android.graphics.Paint paint, PathEffect pathEffect) {
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect != null ? androidPathEffect.getNativePathEffect() : null);
    }
}
