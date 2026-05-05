package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
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
/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005*4\u0012\u000e\u0007nj?6Le^.ZS0\u0012s{J$c$wDAڭ\u001a\u0014̝9O|f(sPZŲG\u000f\u0014\u0016I\u0002:Jmx\f\u0014Ǻ1ԏƜ>2ޜsEA`\u0003;\u001d\"8%F}U\u0018(0`\u0010%|ǈJÈݮ/?¤>Z\u0015M\u0013\u001f*\bD'\u000f\"-~\\>`l\f<Ȼ\"Ʌ\u07bcAMϮc8\u0005M\u001bKl)\u0013\u007fo\"{WE?-%\u0002\u0005\u008fQ¹У\u0002>џA\rp'50au]Af\u0004d39[%]!3\u0013J(Ө\u000e̥*ՒԣJOˎ,\u0002\u000b}\u0013J\u0012\u000e\u001e)N=;*7\u001d\u001cD\rr\u0002M\u0007G\u0081AȕҦ`5а)\u0004K-?-ta2P'aO{3\u001aThҠmďǵS\r\u05ce\u0019\u001flyWE_P\u000eW\\\u001fq=\u001c\u001a'(͆.\bHI\u0006F\n)~,3Ps9Q.\"GӿCϙѱ\u0004_ĈWmjJF<|&\b9\u0017'rD\u0013!\"\u0016Ԝ\\0)O\"q\u0015\u001cܴ\u0013)dzBƻA>MWho\nܽa)"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U21k}-\u0016m\u0017*]JJy\n", "", "u(E", "\u0012hb:\\:LW\u0016\u0006z=9x\u001b/r_/{Q|&\u001bQx", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0011\\:FW'\r~[3|g<a\u0012(\t \b\u0017(C~\u0012F\u007fl\u0014-]%\u0007n}", "u(5", "\u0014", "\u001b`g6`<F2&z\r^9n\r.t\u0003", "5dc\u001aT?B[)\u0007Yk(\u000f\t<W\u0004'\u000bCHuj't]=^", "\u001bnS._\u000bKO+~\b>3|\u001a+t\u00042\u0005", "5dc\u001ab+:Zw\fvp,\nh6e\u0011$\u000bD\u000b ^&CmAF&\u001d", "\u001eda:T5>\\(]\bZ>|\u0016\u000fl\u007f9wO\u0005! ", "5dc\u001dX9FO\"~\u0004m\u000b\n\u0005Ae\r\b\u0003@\u0012\u0013&Ky\u0017\u0004Ux\u0015^M!\u001f", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109r>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq2", ";nS._\nH\\(z~g,\nf9l\n5", "5dc\u001ab+:Zv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "Aba6`\nHZ#\f", "5dc V9B[v\t\u0002h9", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc [(IS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\tz\bUL$D", "AsP;W(KRv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "5dc g(GR\u0015\fy<6\u0006\u0018+i\t(\t\u001e\u000b\u001e!T", "Eh]1b>\"\\'~\nl", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", "5dc$\\5=]+b\u0004l,\f\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016O6l[q9#\u0016d\u0017\u00182\t\u0019cQ386;(\u00076[eDv\u0001\u001b$c", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DrawerDefaults {
    public static final int $stable = 0;
    public static final DrawerDefaults INSTANCE = new DrawerDefaults();
    private static final float ModalDrawerElevation = ElevationTokens.INSTANCE.m3191getLevel0D9Ej5fM();
    private static final float PermanentDrawerElevation = NavigationDrawerTokens.INSTANCE.m3346getStandardContainerElevationD9Ej5fM();
    private static final float DismissibleDrawerElevation = NavigationDrawerTokens.INSTANCE.m3346getStandardContainerElevationD9Ej5fM();
    private static final float MaximumDrawerWidth = NavigationDrawerTokens.INSTANCE.m3343getContainerWidthD9Ej5fM();

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0013R\u00016\u0005yTlkLg\u000ed\u0016:R]^\r\n\u0014v S\u007fTs|1\u00040uz\fsT\riw=G*\u0016I jM\u00030]Z\u001etJC$KP\"W/{5\u0006@", replaceWith = @ReplaceWith(expression = "standardContainerColor", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getContainerColor$annotations() {
    }

    private DrawerDefaults() {
    }

    /* JADX INFO: renamed from: getModalDrawerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2094getModalDrawerElevationD9Ej5fM() {
        return ModalDrawerElevation;
    }

    /* JADX INFO: renamed from: getPermanentDrawerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2095getPermanentDrawerElevationD9Ej5fM() {
        return PermanentDrawerElevation;
    }

    /* JADX INFO: renamed from: getDismissibleDrawerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2092getDismissibleDrawerElevationD9Ej5fM() {
        return DismissibleDrawerElevation;
    }

    public final Shape getShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 928378975, "C865@35860L5:NavigationDrawer.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(928378975, i2, -1, "androidx.compose.material3.DrawerDefaults.<get-shape> (NavigationDrawer.kt:865)");
        }
        Shape value = ShapesKt.getValue(NavigationDrawerTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getScrimColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1055074989, "C869@36032L5:NavigationDrawer.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1055074989, i2, -1, "androidx.compose.material3.DrawerDefaults.<get-scrimColor> (NavigationDrawer.kt:869)");
        }
        long jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return jM4177copywmQWz5c$default;
    }

    public final long getContainerColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1797317261, "C878@36450L5:NavigationDrawer.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1797317261, i2, -1, "androidx.compose.material3.DrawerDefaults.<get-containerColor> (NavigationDrawer.kt:878)");
        }
        long value = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getStandardContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getStandardContainerColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -125949421, "C884@36684L5:NavigationDrawer.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-125949421, i2, -1, "androidx.compose.material3.DrawerDefaults.<get-standardContainerColor> (NavigationDrawer.kt:884)");
        }
        long value = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getStandardContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getModalContainerColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 706424321, "C888@36862L5:NavigationDrawer.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(706424321, i2, -1, "androidx.compose.material3.DrawerDefaults.<get-modalContainerColor> (NavigationDrawer.kt:888)");
        }
        long value = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getModalContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    /* JADX INFO: renamed from: getMaximumDrawerWidth-D9Ej5fM, reason: not valid java name */
    public final float m2093getMaximumDrawerWidthD9Ej5fM() {
        return MaximumDrawerWidth;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -909973510, "C897@37144L29:NavigationDrawer.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-909973510, i2, -1, "androidx.compose.material3.DrawerDefaults.<get-windowInsets> (NavigationDrawer.kt:897)");
        }
        WindowInsets windowInsetsM1089onlybOOhFvg = WindowInsetsKt.m1089onlybOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6), WindowInsetsSides.m1101plusgK_yJZ4(WindowInsetsSides.Companion.m1116getVerticalJoeWqyM(), WindowInsetsSides.Companion.m1114getStartJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return windowInsetsM1089onlybOOhFvg;
    }
}
