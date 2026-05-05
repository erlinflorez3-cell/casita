package androidx.compose.animation.core;

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
/* JADX INFO: compiled from: EasingFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJ'\u0015\u0013OيH\u000b\\A֜&2\u001aՄ\u001fhp9>E\u0006W<Tk*=jڷ8*cҕ\nEAX(~B\u0018]R\u007fg\u001dIҼ\u000fI\u0017إ.zp1WV\u0019l \u0015JB\u001e>ݯQuEʠxv<\f.3BG\b\r\u0019\u001aXGǘz\u0001Kŷ$\u00146I~;r\u001c[\u000f2\u00124=ŋ\u0005$dɡf8Nwk;O2\u0011uZNU^݁\u0001S\u0015Ͽl)\u0013\u0004o\u001fKOEC-%\u0002\u0002\u07baVaGšWsC\u0014v(G:W\u0004o6\u0007~Џ\u00191WՕut,m\u0013R\u0001\u001b5=gcyOˎ,}\u0003Ԉ%>\n!\u0014(h=;.~\b<2ϢvYHА\u001a`H\u0015\tbV&3\u0016K+g\u001aƻUgCϊf9\u0002\u001c\u001b\u001fC\u0010|9sT<_ڠ\u001fZ\u007f\u0383ISFVVO*hK\b\u001cp\u0011\u0001ò\b6OĉG}\u0017I%&WjG?9k0Gזk|\r\u009b\u0001UooVAB}$UB\t:Yֈh\u000bs¬lZ20[\u001dt\u0016\f(+ \u000bv˶%+\u0018ʚgjo\f[^*4=\tOY\u001djް[?fڨMSi3oS\u0017#M`z\u0005\u0007e͞W\u0012b٢@$8mx\u0011\u0018\u000bRt$\u0013`>ۇ :4ջ1^\u001bo\u0011\u001fbP\u000b1wZ\u0017\u000fњX9,Ѱ\u0002&z2\u000fQ|\u007f}\u0012\u0011IZ{˃&3IٛM\u001b,\u00010iT\f13\u0017s.FѨPMT˾.w[).\u0017:H_]U\u0013=}Ȟ6\b5զdtk\u0001[\u0013G\n\u000b*';\u0017-Թ\fpxݚxlP\u0001b\u0018B\u0006l%;\b\u0013~\u05fbeL\u0003ò{V\u0011\u000fLJ\u0013\u0012gpf8+\u0004ȷ\"+\tǻ:~;bQ(=%\u0006JG\u0015\u0010\\ɳs4\u0002ʬ'(z\u001d\u0012-\u0004%}\u001bi]`:ΒM_\u0007Ж:&r<PI\u000b\u0007\u0016|!4;2ȈEjxމPO\u0011j\fg';\u001b-n[h\u0012̭\u0002:6ɾBuI;\"_c4\u001f\fkg\u001clљ`\u0011R\u05fa\"\r\u0002p|\u0013<L.\u0017ob7/Ӓw\u001e>\u05cdSd\u000b}\u0017%T;JJ#C\u0003hѕ\u0014\u0001\bʋw\u0011\u001duPtŒZR"}, d2 = {"\u0013`b2", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u007f3{\u001a7O\u0019", "5dc\u0012T:>", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001M\u0012<QL=A", "\u0013`b2<5", "5dc\u0012T:>7\"", "\u0013`b2<5\u001bO\u0017\u0005", "5dc\u0012T:>7\"[v\\2", "\u0013`b2<5\u001b])\bx^", "5dc\u0012T:>7\"[\u0005n5z\t", "\u0013`b2<5\u001cW&|", "5dc\u0012T:>7\"\\~k*", "\u0013`b2<5\u001cc\u0016\u0003x", "5dc\u0012T:>7\"\\\u000b[0z", "\u0013`b2<5\u001eZ\u0015\r\nb*", "5dc\u0012T:>7\"^\u0002Z:\f\r-", "\u0013`b2<5\u001ef$\t", "5dc\u0012T:>7\"^\u000ei6", "\u0013`b2<5(c(", "5dc\u0012T:>7\"h\u000bm", "\u0013`b2<5(c([v\\2", "5dc\u0012T:>7\"h\u000bm\tx\u00075", "\u0013`b2<5(c([\u0005n5z\t", "5dc\u0012T:>7\"h\u000bm\t\u0007\u00198c\u007f", "\u0013`b2<5(c(\\~k*", "5dc\u0012T:>7\"h\u000bm\n\u0001\u0016-", "\u0013`b2<5(c(\\\u000b[0z", "5dc\u0012T:>7\"h\u000bm\n\r\u00063c", "\u0013`b2<5(c(^\u0002Z:\f\r-", "5dc\u0012T:>7\"h\u000bm\f\u0004\u0005=t\u0004&", "\u0013`b2<5(c(^\u000ei6", "5dc\u0012T:>7\"h\u000bm\f\u0010\u00149", "\u0013`b2<5(c(j\u000bZ+", "5dc\u0012T:>7\"h\u000bm\u0018\r\u0005.", "\u0013`b2<5(c(j\u000bZ9\f", "5dc\u0012T:>7\"h\u000bm\u0018\r\u0005<t", "\u0013`b2<5(c(j\u000bb5\f", "5dc\u0012T:>7\"h\u000bm\u0018\r\r8t", "\u0013`b2<5(c(l~g,", "5dc\u0012T:>7\"h\u000bm\u001a\u0001\u0012/", "\u0013`b2<5*c\u0015}", "5dc\u0012T:>7\"j\u000bZ+", "\u0013`b2<5*c\u0015\f\n", "5dc\u0012T:>7\"j\u000bZ9\f", "\u0013`b2<5*c\u001d\b\n", "5dc\u0012T:>7\"j\u000bb5\f", "\u0013`b2<5,W\"~", "5dc\u0012T:>7\"l~g,", "\u0013`b2B<M", "5dc\u0012T:>=)\u000e", "\u0013`b2B<M0\u0015|\u0001", "5dc\u0012T:>=)\u000eWZ*\u0003", "\u0013`b2B<M0#\u000f\u0004\\,", "5dc\u0012T:>=)\u000eWh<\u0006\u0007/", "\u0013`b2B<M1\u001d\fx", "5dc\u0012T:>=)\u000eXb9z", "\u0013`b2B<M1){~\\", "5dc\u0012T:>=)\u000eXn)\u0001\u0007", "\u0013`b2B<M3 z\tm0z", "5dc\u0012T:>=)\u000eZe(\u000b\u00183c", "\u0013`b2B<M3,\n\u0005", "5dc\u0012T:>=)\u000eZq7\u0007", "\u0013`b2B<M?)zy", "5dc\u0012T:>=)\u000efn({", "\u0013`b2B<M?)z\bm", "5dc\u0012T:>=)\u000efn(\n\u0018", "\u0013`b2B<M?)\u0003\u0004m", "5dc\u0012T:>=)\u000efn0\u0006\u0018", "\u0013`b2B<MA\u001d\bz", "5dc\u0012T:>=)\u000ehb5|", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class EasingFunctionsKt {
    private static final Easing Ease = new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f);
    private static final Easing EaseOut = new CubicBezierEasing(0.0f, 0.0f, 0.58f, 1.0f);
    private static final Easing EaseIn = new CubicBezierEasing(0.42f, 0.0f, 1.0f, 1.0f);
    private static final Easing EaseInOut = new CubicBezierEasing(0.42f, 0.0f, 0.58f, 1.0f);
    private static final Easing EaseInSine = new CubicBezierEasing(0.12f, 0.0f, 0.39f, 0.0f);
    private static final Easing EaseOutSine = new CubicBezierEasing(0.61f, 1.0f, 0.88f, 1.0f);
    private static final Easing EaseInOutSine = new CubicBezierEasing(0.37f, 0.0f, 0.63f, 1.0f);
    private static final Easing EaseInCubic = new CubicBezierEasing(0.32f, 0.0f, 0.67f, 0.0f);
    private static final Easing EaseOutCubic = new CubicBezierEasing(0.33f, 1.0f, 0.68f, 1.0f);
    private static final Easing EaseInOutCubic = new CubicBezierEasing(0.65f, 0.0f, 0.35f, 1.0f);
    private static final Easing EaseInQuint = new CubicBezierEasing(0.64f, 0.0f, 0.78f, 0.0f);
    private static final Easing EaseOutQuint = new CubicBezierEasing(0.22f, 1.0f, 0.36f, 1.0f);
    private static final Easing EaseInOutQuint = new CubicBezierEasing(0.83f, 0.0f, 0.17f, 1.0f);
    private static final Easing EaseInCirc = new CubicBezierEasing(0.55f, 0.0f, 1.0f, 0.45f);
    private static final Easing EaseOutCirc = new CubicBezierEasing(0.0f, 0.55f, 0.45f, 1.0f);
    private static final Easing EaseInOutCirc = new CubicBezierEasing(0.85f, 0.0f, 0.15f, 1.0f);
    private static final Easing EaseInQuad = new CubicBezierEasing(0.11f, 0.0f, 0.5f, 0.0f);
    private static final Easing EaseOutQuad = new CubicBezierEasing(0.5f, 1.0f, 0.89f, 1.0f);
    private static final Easing EaseInOutQuad = new CubicBezierEasing(0.45f, 0.0f, 0.55f, 1.0f);
    private static final Easing EaseInQuart = new CubicBezierEasing(0.5f, 0.0f, 0.75f, 0.0f);
    private static final Easing EaseOutQuart = new CubicBezierEasing(0.25f, 1.0f, 0.5f, 1.0f);
    private static final Easing EaseInOutQuart = new CubicBezierEasing(0.76f, 0.0f, 0.24f, 1.0f);
    private static final Easing EaseInExpo = new CubicBezierEasing(0.7f, 0.0f, 0.84f, 0.0f);
    private static final Easing EaseOutExpo = new CubicBezierEasing(0.16f, 1.0f, 0.3f, 1.0f);
    private static final Easing EaseInOutExpo = new CubicBezierEasing(0.87f, 0.0f, 0.13f, 1.0f);
    private static final Easing EaseInBack = new CubicBezierEasing(0.36f, 0.0f, 0.66f, -0.56f);
    private static final Easing EaseOutBack = new CubicBezierEasing(0.34f, 1.56f, 0.64f, 1.0f);
    private static final Easing EaseInOutBack = new CubicBezierEasing(0.68f, -0.6f, 0.32f, 1.6f);
    private static final Easing EaseInElastic = new Easing() { // from class: androidx.compose.animation.core.EasingFunctionsKt$$ExternalSyntheticLambda0
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f2) {
            return EasingFunctionsKt.EaseInElastic$lambda$0(f2);
        }
    };
    private static final Easing EaseOutElastic = new Easing() { // from class: androidx.compose.animation.core.EasingFunctionsKt$$ExternalSyntheticLambda1
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f2) {
            return EasingFunctionsKt.EaseOutElastic$lambda$1(f2);
        }
    };
    private static final Easing EaseInOutElastic = new Easing() { // from class: androidx.compose.animation.core.EasingFunctionsKt$$ExternalSyntheticLambda2
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f2) {
            return EasingFunctionsKt.EaseInOutElastic$lambda$2(f2);
        }
    };
    private static final Easing EaseOutBounce = new Easing() { // from class: androidx.compose.animation.core.EasingFunctionsKt$$ExternalSyntheticLambda3
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f2) {
            return EasingFunctionsKt.EaseOutBounce$lambda$3(f2);
        }
    };
    private static final Easing EaseInBounce = new Easing() { // from class: androidx.compose.animation.core.EasingFunctionsKt$$ExternalSyntheticLambda4
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f2) {
            return EasingFunctionsKt.EaseInBounce$lambda$4(f2);
        }
    };
    private static final Easing EaseInOutBounce = new Easing() { // from class: androidx.compose.animation.core.EasingFunctionsKt$$ExternalSyntheticLambda5
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f2) {
            return EasingFunctionsKt.EaseInOutBounce$lambda$5(f2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseOutBounce$lambda$3(float f2) {
        float f3;
        float f4;
        if (f2 < 0.36363637f) {
            return 7.5625f * f2 * f2;
        }
        if (f2 < 0.72727275f) {
            float f5 = f2 - 0.54545456f;
            f3 = 7.5625f * f5 * f5;
            f4 = 0.75f;
        } else if (f2 < 0.90909094f) {
            float f6 = f2 - 0.8181818f;
            f3 = 7.5625f * f6 * f6;
            f4 = 0.9375f;
        } else {
            float f7 = f2 - 0.95454544f;
            f3 = 7.5625f * f7 * f7;
            f4 = 0.984375f;
        }
        return f3 + f4;
    }

    public static final Easing getEase() {
        return Ease;
    }

    public static final Easing getEaseOut() {
        return EaseOut;
    }

    public static final Easing getEaseIn() {
        return EaseIn;
    }

    public static final Easing getEaseInOut() {
        return EaseInOut;
    }

    public static final Easing getEaseInSine() {
        return EaseInSine;
    }

    public static final Easing getEaseOutSine() {
        return EaseOutSine;
    }

    public static final Easing getEaseInOutSine() {
        return EaseInOutSine;
    }

    public static final Easing getEaseInCubic() {
        return EaseInCubic;
    }

    public static final Easing getEaseOutCubic() {
        return EaseOutCubic;
    }

    public static final Easing getEaseInOutCubic() {
        return EaseInOutCubic;
    }

    public static final Easing getEaseInQuint() {
        return EaseInQuint;
    }

    public static final Easing getEaseOutQuint() {
        return EaseOutQuint;
    }

    public static final Easing getEaseInOutQuint() {
        return EaseInOutQuint;
    }

    public static final Easing getEaseInCirc() {
        return EaseInCirc;
    }

    public static final Easing getEaseOutCirc() {
        return EaseOutCirc;
    }

    public static final Easing getEaseInOutCirc() {
        return EaseInOutCirc;
    }

    public static final Easing getEaseInQuad() {
        return EaseInQuad;
    }

    public static final Easing getEaseOutQuad() {
        return EaseOutQuad;
    }

    public static final Easing getEaseInOutQuad() {
        return EaseInOutQuad;
    }

    public static final Easing getEaseInQuart() {
        return EaseInQuart;
    }

    public static final Easing getEaseOutQuart() {
        return EaseOutQuart;
    }

    public static final Easing getEaseInOutQuart() {
        return EaseInOutQuart;
    }

    public static final Easing getEaseInExpo() {
        return EaseInExpo;
    }

    public static final Easing getEaseOutExpo() {
        return EaseOutExpo;
    }

    public static final Easing getEaseInOutExpo() {
        return EaseInOutExpo;
    }

    public static final Easing getEaseInBack() {
        return EaseInBack;
    }

    public static final Easing getEaseOutBack() {
        return EaseOutBack;
    }

    public static final Easing getEaseInOutBack() {
        return EaseInOutBack;
    }

    public static final Easing getEaseInElastic() {
        return EaseInElastic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseInElastic$lambda$0(float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 == 1.0f) {
            return 1.0f;
        }
        return (float) (((double) (-((float) Math.pow(2.0f, r6 - 10.0f)))) * Math.sin(((double) ((f2 * 10.0f) - 10.75f)) * 2.0943951023931953d));
    }

    public static final Easing getEaseOutElastic() {
        return EaseOutElastic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseOutElastic$lambda$1(float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 == 1.0f) {
            return 1.0f;
        }
        return (float) ((((double) ((float) Math.pow(2.0f, (-10.0f) * f2))) * Math.sin(((double) ((f2 * 10.0f) - 0.75f)) * 2.0943951023931953d)) + ((double) 1.0f));
    }

    public static final Easing getEaseInOutElastic() {
        return EaseInOutElastic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseInOutElastic$lambda$2(float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 == 1.0f) {
            return 1.0f;
        }
        if (0.0f <= f2 && f2 <= 0.5f) {
            double d2 = 2.0f;
            return (float) ((-(((double) ((float) Math.pow(d2, r11 - 10.0f))) * Math.sin(((double) ((f2 * 20.0f) - 11.125f)) * 1.3962634015954636d))) / d2);
        }
        double d3 = 2.0f;
        return ((float) ((((double) ((float) Math.pow(d3, ((-20.0f) * f2) + 10.0f))) * Math.sin(((double) ((f2 * 20.0f) - 11.125f)) * 1.3962634015954636d)) / d3)) + 1.0f;
    }

    public static final Easing getEaseOutBounce() {
        return EaseOutBounce;
    }

    public static final Easing getEaseInBounce() {
        return EaseInBounce;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseInBounce$lambda$4(float f2) {
        return 1 - EaseOutBounce.transform(1.0f - f2);
    }

    public static final Easing getEaseInOutBounce() {
        return EaseInOutBounce;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseInOutBounce$lambda$5(float f2) {
        float fTransform;
        if (f2 < 0.5d) {
            fTransform = 1 - EaseOutBounce.transform(1.0f - (f2 * 2.0f));
        } else {
            fTransform = 1 + EaseOutBounce.transform((f2 * 2.0f) - 1.0f);
        }
        return fTransform / 2.0f;
    }
}
