package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
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
/* JADX INFO: compiled from: NavigationBar.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\nnjO0LeN7X\u07bf*%ӆ,4RZdvI;ڈ\u001e}0\t\u0018Yum\u0007J\t\r\n\u0014و\u001axx3\u0012\u0018\u0007c*\u000f`D E9M}EQ`#?5&8\"F\u0004\u001d\u0001H3x\u0016|zQV$\u0012^I!@X\r[\u00112\u00124GP\u0007$\\u[NH\u001bf\u00014߃\u0002݃ŌR)e>\u000b\\U\u001db-%v\u0010 [F=5#-k\u00035[\fE\t?\u007fG\u001dhU0[OyWDc\u0018\u0014C4\u007f\u0013cr4h\u001dQ\u000f\u0015W1UcY]&(&\u0004,\u0013B\u0004\u001c\u0016?H\\6Jl\u000e\u000eA\u0006\u000bSnYHc݆~Эˋ:\u0019+\u0012A>\n1tRy;GP_{3\u0010TaW͚#ƟX\u0012x\u0017!X\u0006VĻQEEKT̅uklշtv"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006_!F]\u007f\u001cFq 7*?HOC\u001e\u001dGa:\u0003s3]\u0005|", "", "u(E", "2dU.h3M<\u0015\u0010~`(\f\r9n\\$\t$\u0010\u0017\u001f%y\u0015F\u00043", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006_!F]\u007f\u001cFq 7*?HOC\u001e\u001dFk@\u0011p:$", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000ecZ=\u0001\u000b+t\u00042\u0005\u001d|$zVo\u0016\u001a\u0001,?f\f^?i%.ZG7r\u0002\u0018\"hh9\u0003q,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZNB=5rF3.\f6R^7ud\u001b\u0016\u0016\u0013twLc\u001e\u001d", "1n[<e:", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W7'\u001e\t[=3rN@{\u00049-\u0011;p^\u0016\u001d\u0018BxF", "Ad[2V;>R||\u0005g\n\u0007\u00109r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Ad[2V;>R\b~\u000em\n\u0007\u00109r", "7mS6V(M]&\\\u0005e6\n", "Cmb2_,<b\u0019}^\\6\u0006f9l\n5", "Cmb2_,<b\u0019}i^?\ff9l\n5", "1n[<e:\u0006h\u001ef\u000e=0d", "uI9\u0017=\u0011%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`T\u007f\u0017Kz-5#[*?x <MP\u0011O\u0018a{dj8\u0014m0M\npEVV7f`r\u0007\u001c\u000ei\u000e[/\t\f'\u000b\rjU;!\u0004;M\fDE|\u0019y\u001d5rNL]\u001aT\bj", "2hb.U3>R||\u0005g\n\u0007\u00109r", "2hb.U3>R\b~\u000em\n\u0007\u00109r", "1n[<e:\u0006$l\u007fvs\u000e\u000b", "uI9\u0017=\u0011#8\u007fz\u0004]9\u0007\r.xI&\u0006H\f!%G9\u001bL\u007f49a}i\u0015w\u001e9WQ;x\n\u0002x,H5\u0010b9Xz&Z\u0016L6d]|K\u0014[b\n]+\u001a\tUHq8-30\f.E\u0011?r\nh\u0012\u001b\u0019ypJ4\u001aN\u0004\"\u0004\u0017", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class NavigationBarItemDefaults {
    public static final int $stable = 0;
    public static final NavigationBarItemDefaults INSTANCE = new NavigationBarItemDefaults();

    private NavigationBarItemDefaults() {
    }

    public final NavigationBarItemColors colors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1018883954, "C(colors)310@13425L11:NavigationBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1018883954, i2, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:310)");
        }
        NavigationBarItemColors defaultNavigationBarItemColors$material3_release = getDefaultNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultNavigationBarItemColors$material3_release;
    }

    /* JADX INFO: renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationBarItemColors m2289colors69fazGs(long j2, long j3, long j4, long j5, long j6, long j7, long j8, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j2;
        long jM4214getUnspecified0d7_KjU2 = j6;
        long jM4214getUnspecified0d7_KjU3 = j7;
        long jM4214getUnspecified0d7_KjU4 = j3;
        long jM4214getUnspecified0d7_KjU5 = j5;
        long jM4214getUnspecified0d7_KjU6 = j8;
        long jM4214getUnspecified0d7_KjU7 = j4;
        ComposerKt.sourceInformationMarkerStart(composer, -1618564327, "C(colors)P(3:c#ui.graphics.Color,4:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color)335@14809L11:NavigationBar.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            jM4214getUnspecified0d7_KjU7 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 16) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 64) - (i3 | 64) != 0) {
            jM4214getUnspecified0d7_KjU6 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1618564327, i2, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:335)");
        }
        NavigationBarItemColors navigationBarItemColorsM2278copy4JmcsL4 = getDefaultNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2278copy4JmcsL4(jM4214getUnspecified0d7_KjU, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU7, jM4214getUnspecified0d7_KjU5, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return navigationBarItemColorsM2278copy4JmcsL4;
    }

    public final NavigationBarItemColors getDefaultNavigationBarItemColors$material3_release(ColorScheme colorScheme) {
        NavigationBarItemColors defaultNavigationBarItemColorsCached$material3_release = colorScheme.getDefaultNavigationBarItemColorsCached$material3_release();
        if (defaultNavigationBarItemColorsCached$material3_release != null) {
            return defaultNavigationBarItemColorsCached$material3_release;
        }
        NavigationBarItemColors navigationBarItemColors = new NavigationBarItemColors(ColorSchemeKt.fromToken(colorScheme, NavigationBarTokens.INSTANCE.getActiveIconColor()), ColorSchemeKt.fromToken(colorScheme, NavigationBarTokens.INSTANCE.getActiveLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, NavigationBarTokens.INSTANCE.getActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, NavigationBarTokens.INSTANCE.getInactiveIconColor()), ColorSchemeKt.fromToken(colorScheme, NavigationBarTokens.INSTANCE.getInactiveLabelTextColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, NavigationBarTokens.INSTANCE.getInactiveIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, NavigationBarTokens.INSTANCE.getInactiveLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultNavigationBarItemColorsCached$material3_release(navigationBarItemColors);
        return navigationBarItemColors;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001t\u0001\u000b\u001aidV)~\u0010,5bd\f\r0\u0018i\u000e^{JWm]\u0003\u0007ut[v\u0002NjlxJ'F;\u0014bQ}\u0016]`OHM@!\u001e")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: colors-zjMxDiM, reason: not valid java name */
    public final /* synthetic */ NavigationBarItemColors m2290colorszjMxDiM(long j2, long j3, long j4, long j5, long j6, Composer composer, int i2, int i3) {
        long value = j4;
        long value2 = j5;
        long value3 = j2;
        long value4 = j3;
        long value5 = j6;
        ComposerKt.sourceInformationMarkerStart(composer, -213647161, "C(colors)P(1:c#ui.graphics.Color,2:c#ui.graphics.Color,0:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)371@16664L5,372@16747L5,373@16827L5,374@16909L5,375@16996L5:NavigationBar.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            value3 = ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveIconColor(), composer, 6);
        }
        if ((i3 & 2) != 0) {
            value4 = ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            value = ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        }
        if ((i3 & 8) != 0) {
            value2 = ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getInactiveIconColor(), composer, 6);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            value5 = ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-213647161, i2, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:377)");
        }
        NavigationBarItemColors navigationBarItemColors = new NavigationBarItemColors(value3, value4, value, value2, value5, Color.m4177copywmQWz5c$default(value2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(value5, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return navigationBarItemColors;
    }
}
