package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
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
/* JADX INFO: compiled from: RoundRect.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d̉=!4i\bDZc|\u0004G\u00078\u000bDB\u0007\"2\u0013\u007f\u0007tsA0JjP.`X2\u000fq\u0003<$q$yCAl2\u001c0 gN\u0016g\u001fNh#[\u000f4\u0015)n:bmx\f,Ǻ1ԏņC5S\u000bKUx3D\u001c82P8*\t\u000f2BH>u+IQ\f MXphl=S\u000b\u001a $V /8\rmT6V\fu:]=3oHN5\u007fH|{'ѸS܋˼zc$LNYM13j\u001b\u0007\u0001[o\u0007M\nU\u0005\u0017&W/W\u0017o6\u0007\u0010D\u00199s%]!6t;_w$'YO\u0014O^3@w)\f=@\u00124\u001e'v>]\u001et/&3#\u0003\u0004D^*vB.\u000b\u0012:%>\u00183YSՎeϟň?\u001bT`\n/%R1\u0018\u0007!\nT>d#@lw\u007fA\u0002DKnf\n\bM\u001e\b~\n\u001a*2@w\u0004=$).E5g_GF9k0Xtk\u0005)xh\u0002yjdNM\u0007\u0016e*9\u0010hp|\u0005\u001aP\u0005\\:>e\u001c\u0003\u0007.\f!Ntwj1=*\\~\u0001i\u0019M\u0006\nS/\u0017;g\u001f\u0004\u000e\u0006=Ս2̐Ʉg\u0012g\u0004\u0005F_OpڳpfpR4Z\u000b(Xvʮn\u0014\u0010}JO\u001a\u0015RR\u007f\u001fL,_\u001d\u0005\u0015v\u0003T\u0007˩\u0001\rw\\n\u0015\rZS7\u0011p<t7\tx\\\u001fo\u001e=ͅ0\u0001x$3H_>99c,\u00014++/~\"\u007f},֙KP\u0005\u0018{_\n)6-G\\G=A\u0017')`\u0002c\nʆviiO\u00182\t\u0006\u001a\"ItFg6r\u0019,\u000fj\u0001\u0014ݚ\u001b&\u000f`x/\u0016m \roS\u0013G\u0012\\3[lI)Gʾ@RP~\u000b,,.!\u00030\u000bM-q/E\u0016&\u0014eY˸am\b0\u007fp\u001d/\u0015x\u0012;{\u0016\u001ery]`;n\u000e˕\u0003B:&r\u0014PZ\u000b\u000b\u0016U!4;CpA\u0013p\r|Ԫ\u000f3\u0016h\r@\u001b\u0003vnH(\b}b-\b*\"C4XڎG))OY}{oй\\\u0010R\u0012\u0010μ\u0018_m݇ p"}, d2 = {"0nd;W0GU\u0006~xm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"c\u000e)6Z\u0016,\\\u0019", "5dc\u000fb<GR\u001d\b|K,z\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F\b0@l\u0003.KR\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0014Z\u0018V+\u001c\u0012m\u000b\u0011nBFt", "1d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "5dc\u0010X5MS&", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F\b0@l\u0003.KR\u0011/\u0019", "7r26e*ES", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F\b0@l\u0003.KR\u0011/)", "7r49_0Ia\u0019", "7r4:c;R", "7r56a0MS", "7rA2V;", "7rB6`7ES", ";`g\u0011\\4>\\'\u0003\u0005g", "", "5dc\u001aT?\u001dW!~\u0004l0\u0007\u0012", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F\b0@l\u0003.KR\u0011/\u0015", ";h]\u0011\\4>\\'\u0003\u0005g", "5dc\u001a\\5\u001dW!~\u0004l0\u0007\u0012", "A`U2<5GS&kz\\;", "5dc T->7\"\bzk\u0019|\u0007>", " nd;W\u0019>Q(", "@dRA", "1na;X9+O\u0018\u0003\u000bl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u0013c\u000b)7z\u0003*LGKy\n", " nd;W\u0019>Q(F\tg0j\u001a0s", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFCzq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&TrG\u001c\u0012i\u001bbty\u000fiJ#[D5.]", "Bn_\u0019X-M", "Bn_\u001f\\.Ab", "0ncAb4+W\u001b\u0002\n", "0ncAb4%S\u001a\u000e", " nd;W\u0019>Q(Fo:\u0014Ii\u0014o", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFCz\u00132(~R0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007\u0016\u0012d\u0016N:\u001a\u0019#..~M6\f\b*XW", "@`S6h:1", "@`S6h:2", ":dUA", "Bn_", "@hV5g", "0ncAb4", " nd;W\u0019>Q(F|@}\u0007\u0015\u0003Y", "uE5\u00139\u0011\u0002:\u0015\byk6\u0001\bB/}2\u0004K\u000b%\u0017\u0011\u007f\u0012\u0006x%?a}/D\u0002_\u001bWSDj!\u001e\u0013w7", ":da=", "AsP?g", "As^=", "4qP0g0H\\", "BqP;f3:b\u0019", "=eU@X;", "BqP;f3:b\u0019Fjo~\bS\u0018A", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F\b0@l\u0003.KR\u0011Pw\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[\\\u000eX3\r\u0014fUm[NG(\u0007\u0019I\u007fJ>", "Ch\u001c4X6FS(\f\u000fX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RoundRectKt {
    public static final RoundRect RoundRect(float f2, float f3, float f4, float f5, float f6, float f7) {
        long jCornerRadius = CornerRadiusKt.CornerRadius(f6, f7);
        return new RoundRect(f2, f3, f4, f5, jCornerRadius, jCornerRadius, jCornerRadius, jCornerRadius, null);
    }

    /* JADX INFO: renamed from: RoundRect-gG7oq9Y */
    public static final RoundRect m3991RoundRectgG7oq9Y(float f2, float f3, float f4, float f5, long j2) {
        return RoundRect(f2, f3, f4, f5, CornerRadius.m3912getXimpl(j2), CornerRadius.m3913getYimpl(j2));
    }

    public static final RoundRect RoundRect(Rect rect, float f2, float f3) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f2, f3);
    }

    /* JADX INFO: renamed from: RoundRect-sniSvfs */
    public static final RoundRect m3992RoundRectsniSvfs(Rect rect, long j2) {
        return RoundRect(rect, CornerRadius.m3912getXimpl(j2), CornerRadius.m3913getYimpl(j2));
    }

    /* JADX INFO: renamed from: RoundRect-ZAM2FJo$default */
    public static /* synthetic */ RoundRect m3990RoundRectZAM2FJo$default(Rect rect, long j2, long j3, long j4, long j5, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            j2 = CornerRadius.Companion.m3922getZerokKHJgLs();
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            j3 = CornerRadius.Companion.m3922getZerokKHJgLs();
        }
        if ((8 & i2) != 0) {
            j4 = CornerRadius.Companion.m3922getZerokKHJgLs();
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            j5 = CornerRadius.Companion.m3922getZerokKHJgLs();
        }
        return m3989RoundRectZAM2FJo(rect, j2, j3, j4, j5);
    }

    /* JADX INFO: renamed from: RoundRect-ZAM2FJo */
    public static final RoundRect m3989RoundRectZAM2FJo(Rect rect, long j2, long j3, long j4, long j5) {
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j2, j3, j4, j5, null);
    }

    /* JADX INFO: renamed from: translate-Uv8p0NA */
    public static final RoundRect m3993translateUv8p0NA(RoundRect roundRect, long j2) {
        return new RoundRect(Offset.m3937getXimpl(j2) + roundRect.getLeft(), Offset.m3938getYimpl(j2) + roundRect.getTop(), Offset.m3937getXimpl(j2) + roundRect.getRight(), Offset.m3938getYimpl(j2) + roundRect.getBottom(), roundRect.m3987getTopLeftCornerRadiuskKHJgLs(), roundRect.m3988getTopRightCornerRadiuskKHJgLs(), roundRect.m3986getBottomRightCornerRadiuskKHJgLs(), roundRect.m3985getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    public static final Rect getBoundingRect(RoundRect roundRect) {
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final Rect getSafeInnerRect(RoundRect roundRect) {
        return new Rect(roundRect.getLeft() + (Math.max(CornerRadius.m3912getXimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getTop() + (Math.max(CornerRadius.m3913getYimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m3913getYimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getRight() - (Math.max(CornerRadius.m3912getXimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()), CornerRadius.m3912getXimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getBottom() - (Math.max(CornerRadius.m3913getYimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m3913getYimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs())) * 0.29289323f));
    }

    public static final boolean isEmpty(RoundRect roundRect) {
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(RoundRect roundRect) {
        float left = roundRect.getLeft();
        if (!Float.isInfinite(left) && !Float.isNaN(left)) {
            float top = roundRect.getTop();
            if (!Float.isInfinite(top) && !Float.isNaN(top)) {
                float right = roundRect.getRight();
                if (!Float.isInfinite(right) && !Float.isNaN(right)) {
                    float bottom = roundRect.getBottom();
                    if (!Float.isInfinite(bottom) && !Float.isNaN(bottom)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isRect(RoundRect roundRect) {
        return (CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m3913getYimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) == 0.0f) && (CornerRadius.m3912getXimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m3913getYimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) == 0.0f) && ((CornerRadius.m3912getXimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m3913getYimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) && (CornerRadius.m3912getXimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m3913getYimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) == 0.0f));
    }

    public static final boolean isEllipse(RoundRect roundRect) {
        return CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3912getXimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m3913getYimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3913getYimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m3912getXimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m3912getXimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m3913getYimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m3913getYimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m3912getXimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m3912getXimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs()) && CornerRadius.m3913getYimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m3913getYimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs()) && ((double) roundRect.getWidth()) <= ((double) CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs())) * 2.0d && ((double) roundRect.getHeight()) <= ((double) CornerRadius.m3913getYimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs())) * 2.0d;
    }

    public static final boolean isCircle(RoundRect roundRect) {
        return roundRect.getWidth() == roundRect.getHeight() && isEllipse(roundRect);
    }

    public static final float getMinDimension(RoundRect roundRect) {
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMaxDimension(RoundRect roundRect) {
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final long getCenter(RoundRect roundRect) {
        return OffsetKt.Offset(roundRect.getLeft() + (roundRect.getWidth() / 2.0f), roundRect.getTop() + (roundRect.getHeight() / 2.0f));
    }

    public static final boolean isSimple(RoundRect roundRect) {
        return CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3913getYimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) && CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3912getXimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3913getYimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3912getXimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3913getYimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3912getXimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs()) && CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m3913getYimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs());
    }

    public static final RoundRect lerp(RoundRect roundRect, RoundRect roundRect2, float f2) {
        return new RoundRect(MathHelpersKt.lerp(roundRect.getLeft(), roundRect2.getLeft(), f2), MathHelpersKt.lerp(roundRect.getTop(), roundRect2.getTop(), f2), MathHelpersKt.lerp(roundRect.getRight(), roundRect2.getRight(), f2), MathHelpersKt.lerp(roundRect.getBottom(), roundRect2.getBottom(), f2), CornerRadiusKt.m3923lerp3Ry4LBc(roundRect.m3987getTopLeftCornerRadiuskKHJgLs(), roundRect2.m3987getTopLeftCornerRadiuskKHJgLs(), f2), CornerRadiusKt.m3923lerp3Ry4LBc(roundRect.m3988getTopRightCornerRadiuskKHJgLs(), roundRect2.m3988getTopRightCornerRadiuskKHJgLs(), f2), CornerRadiusKt.m3923lerp3Ry4LBc(roundRect.m3986getBottomRightCornerRadiuskKHJgLs(), roundRect2.m3986getBottomRightCornerRadiuskKHJgLs(), f2), CornerRadiusKt.m3923lerp3Ry4LBc(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs(), roundRect2.m3985getBottomLeftCornerRadiuskKHJgLs(), f2), null);
    }
}
