package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
/* JADX INFO: compiled from: ProgressIndicator.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005&4\u0012\u000e\u0007nj?=Le^.ZS8\u0014s{:%c$\bCCU \n*\t]No˧vJp\u000bK\u000f\f\u001a~͛,_ǁ)]@\u000erGu?ݯQoK9)#D182Pe*\t\u000fHBH>&+GY<*0nyjV\u001b~\u001d\u001a@$n$\u000fPtg|8֘kҗƠ3%\t\u001dP\u0003wv>}e\rtVބ\fǸӦ\u001d*Ë;=\u001d%a\b\u001fTaB\u0011CBT\u0013n?'YK؎V̬ߒ~\u0013Ʀ/W\u0015]\u0001+t\u0007Wg\u001a+{qqSh\u000eV\u00011Acɥ\u0006ٳ\u0005ΩЗ-,բj\u0016\u00163\u0003\u007fcBV\flB\u0018|gA%1PJ9G3f\u007fjߛ\u0018\u05cbӒz\u0004ڟ\"+\tn/hl\u0010f$)`Hs?aX=vW@\u001f\u0014Я\u0006ψạň\u0003/Ͻ\u0004=\u0004\u0011<$59aJ1!\u0004\u0004NVu\u0003Uwvf\u0002RvB·mݫ\u05ec)\bɔ^Ll\u0005yUlZ2%[ %)\f\u001d+ \u000b\u0001rf{ĳPұgȉԍL\\ܦ)=n7g{{\u0010]Ol3MSi'o^G)MTz\u000bhhRS:t\u000bAϒ6Nrݘ\u0010}Ji\u001a/\u0003T\u007f9L,_7\u0013Zɶ\u0002ٜ\u05cc@{Ȥc^\u0001\u0012\u0005sADS~2\u0016!\u0001~z'5Иw̢ڌ{_Ę1Ei7\u001fHcB9I\u000bF\u001f~\"\u001e}-ׯFƂͷ\u0015tʀ\u007f$.\u001c?u=]c-\rNJ\u0002[c\u00038<ˀOʵ&ϕݙx\u000e³l8w\np\u0017:`\u0003LU{%BGs\u0001K d.\u0018\u0018\fܢFϊԳ\nZƏMv\u001b[BwF\u001dU4,O\u0019oP\u001bkrз&ݴʯv\u0013ڏ\u0019eukuY\b\u0003ϊ&}m\u00072Ѕ2\u001eaY]8ZΘM\u000f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006a2?[\u000b E{y7LG9gC(\"Ga:\u0003s3]\u0005|", "", "u(E", "\u0011ha0h3:`w~\n^9\u0005\r8a\u000f(iO\u000e!\u001dGM\nG", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", "5dc\u0010\\9<c z\b=,\f\t<m\u00041wO\u0001\u0005&Ty\u0014<T!@!c\u001c\"P\u001c\u0010_", "u(8", "\u0017", "\u0011ha0h3:`|\by^;|\u00167i\t$\u000b@n&$Qu\u000e\u001ar0", "5dc\u0010\\9<c z\bB5{\t>e\r0\u007fI|&\u00175~\u001bF|%\u0013U\tg\u001di\u0001\u0011S%M", "\u0011ha0h3:`|\byb*x\u00189rn5w>\u0007x\u0013R]\u0012Qv", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0010\\9<c z\bB5{\r-a\u000f2\t/\u000e\u0013\u0015MQ\nGd)JYE~\u000bM\u001b}N+yg='\u001fw]H\u000bm5\\", "5dc\u0010\\9<c z\bB5{\r-a\u000f2\t/\u000e\u0013\u0015MQ\nGd)JYE~\u000bM\u001b}N+", "u(5", "\u0014", "\u0011ha0h3:`\u0007\u000e\bh2|z3d\u000f+", "5dc\u0010\\9<c z\bL;\n\u00135eq,zO\u0004^u\u001bO\u0013\fw\r", "\u001ah]2T9\"\\\u0018\u0003xZ;\u0007\u0016\u001er{&\u0002\"|\"\u0005K\u0005\u000e", "5dc\u0019\\5>O&b\u0004]0z\u0005>o\r\u0017\t<~\u001dxCz{@\f%|8Q\u007f<=\u0017\u0016\f?Dt>-\u0011weC\u0010q", "5dc\u0019\\5>O&b\u0004]0z\u0005>o\r\u0017\t<~\u001dxCz{@\f%|8Q\u007f<=\u0017\u0016", "\u001ah]2T9,b&\t\u0001^\nx\u0014", "5dc\u0019\\5>O&l\nk6\u0003\t\ra\u000boa<ky\u001d)\u0002", "\u001ah]2T9-`\u0015|\u0001L;\u0007\u0014\u0013n~,y<\u0010!$5s#<", "5dc\u0019\\5>O&m\bZ*\u0003v>o\u000b\f\u0005?\u0005\u0015\u0013Vy\u001b*z:5!\\s\u0017re/5\u00027t=($dp=\u0011l:", "5dc\u0019\\5>O&m\bZ*\u0003v>o\u000b\f\u0005?\u0005\u0015\u0013Vy\u001b*z:5!\\s\u0017re/5", "\u001eq^4e,Lat\b~f(\f\r9nm3{>", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eBz\u001a7O1Fk2s", "", "5dc\u001de6@`\u0019\r\t:5\u0001\u0011+t\u00042\u0005.\f\u0017\u0015", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001[!;QL=Y?\u001e\u0013>", "1ha0h3:`v\t\u0002h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc\u0010\\9<c z\b<6\u0004\u0013<", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq2", "1ha0h3:`w~\n^9\u0005\r8a\u000f(jM|\u0015\u001d%y\u0015F\u0004", "5dc\u0010\\9<c z\b=,\f\t<m\u00041wO\u0001\u0006$Cm\u0014\u001a\u0001,?f", "1ha0h3:`|\by^;|\u00167i\t$\u000b@o$\u0013EukF}/B", "5dc\u0010\\9<c z\bB5{\t>e\r0\u007fI|&\u00176|\n:|\u0003?`\b-", "1ha0h3:`\b\fv\\2Z\u00136o\r", "5dc\u0010\\9<c z\bM9x\u00075C\n/\u0006M?\u0013 Py\u001d8\u0006)?b\f", "5dc\u0010\\9<c z\bM9x\u00075C\n/\u0006M", ":h]2T9\u001c] \t\b", "5dc\u0019\\5>O&\\\u0005e6\n", ":h]2T9-`\u0015|\u0001<6\u0004\u0013<", "5dc\u0019\\5>O&m\bZ*\u0003f9l\n5", "2qPDF;H^|\byb*x\u00189r", "", "2qPDF*H^\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "As^=F0SS", "1n[<e", "Asa<^,\u001cO$", "2qPDF;H^|\byb*x\u00189rG\b}$M\u0006y7", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u0002/[\u000b\u000b=", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ProgressIndicatorDefaults {
    public static final int $stable = 0;
    public static final ProgressIndicatorDefaults INSTANCE = new ProgressIndicatorDefaults();
    private static final float CircularStrokeWidth = ProgressIndicatorTokens.INSTANCE.m3486getTrackThicknessD9Ej5fM();
    private static final int LinearStrokeCap = StrokeCap.Companion.m4532getRoundKaPHkGw();
    private static final int CircularDeterminateStrokeCap = StrokeCap.Companion.m4532getRoundKaPHkGw();
    private static final int CircularIndeterminateStrokeCap = StrokeCap.Companion.m4532getRoundKaPHkGw();
    private static final float LinearTrackStopIndicatorSize = ProgressIndicatorTokens.INSTANCE.m3485getStopSizeD9Ej5fM();
    private static final float LinearIndicatorTrackGapSize = ProgressIndicatorTokens.INSTANCE.m3482getActiveTrackSpaceD9Ej5fM();
    private static final float CircularIndicatorTrackGapSize = ProgressIndicatorTokens.INSTANCE.m3482getActiveTrackSpaceD9Ej5fM();
    private static final SpringSpec<Float> ProgressAnimationSpec = new SpringSpec<>(1.0f, 50.0f, Float.valueOf(0.001f));

    /* JADX INFO: renamed from: getCircularIndicatorTrackGapSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2371getCircularIndicatorTrackGapSizeD9Ej5fM$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0015K\n6~y\u0019\u0017lVg}Y'/chM\u001b\u000b\n|\u0011d\u0004O|kby\u0018xiOo%\\hwK\u0006-Ey\u0015_^|7dIMNL8\u0017 L&Q$\u00055\u0016w\u007f\u00028\u001fV`\u000bi1\u001a", replaceWith = @ReplaceWith(expression = "ProgressIndicatorDefaults.circularIndeterminateTrackColor", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getCircularTrackColor$annotations() {
    }

    /* JADX INFO: renamed from: getLinearIndicatorTrackGapSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2372getLinearIndicatorTrackGapSizeD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getLinearTrackStopIndicatorSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2373getLinearTrackStopIndicatorSizeD9Ej5fM$annotations() {
    }

    private ProgressIndicatorDefaults() {
    }

    public final long getLinearColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -914312983, "C843@34028L5:ProgressIndicator.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-914312983, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:843)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getCircularColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1803349725, "C847@34197L5:ProgressIndicator.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1803349725, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:847)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getLinearTrackColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1677541593, "C851@34363L5:ProgressIndicator.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1677541593, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:851)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getTrackColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getCircularTrackColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -404222247, "C:ProgressIndicator.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-404222247, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularTrackColor> (ProgressIndicator.kt:860)");
        }
        long jM4213getTransparent0d7_KjU = Color.Companion.m4213getTransparent0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return jM4213getTransparent0d7_KjU;
    }

    public final long getCircularDeterminateTrackColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -2143778381, "C864@34928L5:ProgressIndicator.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2143778381, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularDeterminateTrackColor> (ProgressIndicator.kt:864)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getTrackColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getCircularIndeterminateTrackColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1947901123, "C:ProgressIndicator.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1947901123, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularIndeterminateTrackColor> (ProgressIndicator.kt:868)");
        }
        long jM4213getTransparent0d7_KjU = Color.Companion.m4213getTransparent0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return jM4213getTransparent0d7_KjU;
    }

    /* JADX INFO: renamed from: getCircularStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m2378getCircularStrokeWidthD9Ej5fM() {
        return CircularStrokeWidth;
    }

    /* JADX INFO: renamed from: getLinearStrokeCap-KaPHkGw, reason: not valid java name */
    public final int m2380getLinearStrokeCapKaPHkGw() {
        return LinearStrokeCap;
    }

    /* JADX INFO: renamed from: getCircularDeterminateStrokeCap-KaPHkGw, reason: not valid java name */
    public final int m2375getCircularDeterminateStrokeCapKaPHkGw() {
        return CircularDeterminateStrokeCap;
    }

    /* JADX INFO: renamed from: getCircularIndeterminateStrokeCap-KaPHkGw, reason: not valid java name */
    public final int m2376getCircularIndeterminateStrokeCapKaPHkGw() {
        return CircularIndeterminateStrokeCap;
    }

    /* JADX INFO: renamed from: getLinearTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m2381getLinearTrackStopIndicatorSizeD9Ej5fM() {
        return LinearTrackStopIndicatorSize;
    }

    /* JADX INFO: renamed from: getLinearIndicatorTrackGapSize-D9Ej5fM, reason: not valid java name */
    public final float m2379getLinearIndicatorTrackGapSizeD9Ej5fM() {
        return LinearIndicatorTrackGapSize;
    }

    /* JADX INFO: renamed from: getCircularIndicatorTrackGapSize-D9Ej5fM, reason: not valid java name */
    public final float m2377getCircularIndicatorTrackGapSizeD9Ej5fM() {
        return CircularIndicatorTrackGapSize;
    }

    public final SpringSpec<Float> getProgressAnimationSpec() {
        return ProgressAnimationSpec;
    }

    /* JADX INFO: renamed from: drawStopIndicator-EgI2THU, reason: not valid java name */
    public final void m2374drawStopIndicatorEgI2THU(DrawScope drawScope, float f2, long j2, int i2) {
        float fMin = Math.min(drawScope.mo710toPx0680j_4(f2), Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()));
        float fM4003getHeightimpl = (Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()) - fMin) / 2;
        if (StrokeCap.m4527equalsimpl0(i2, StrokeCap.Companion.m4532getRoundKaPHkGw())) {
            float f3 = fMin / 2.0f;
            DrawScope.m4715drawCircleVaOC9Bg$default(drawScope, j2, f3, OffsetKt.Offset((Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc()) - f3) - fM4003getHeightimpl, Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()) / 2.0f), 0.0f, null, null, 0, 120, null);
        } else {
            DrawScope.m4728drawRectnJ9OG0$default(drawScope, j2, OffsetKt.Offset((Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc()) - fMin) - fM4003getHeightimpl, (Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()) - fMin) / 2.0f), SizeKt.Size(fMin, fMin), 0.0f, null, null, 0, 120, null);
        }
    }
}
