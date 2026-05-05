package androidx.compose.material3;

import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
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
/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u000e\u0007njO0LeN1ZS@\u000fs{:4aӝqYП\u0006\u001a,!ITTg̊rJh\u000b\f\u001a\u0014!\u0011jZP\u001c}ٕ\u0016\u000f@N8г2[zU9\u000f{f\u000b&20E\u0012\u0005/(ZN\u0016v\tRc\f@>pv@R\u001b]\u001d\u001a@\u0014n&\u0007\u001ejxf6vz\u000e@5#\u0011{ZNUm`\u0003S\rTg?\r%oN1F7C)=S1\u0015\u0003aE\u0003M\u0007U\u0005\u00175W1OseLp\u007fB#[U\u0013]\u0001=t\u0005\u007fn<-1Oqch\u000eV\u0006+\u0002\u0013<\u0012'\u001e'v<] l\b\u001cM\rr\u0002N\u0001\bdB\u000e\u0016y6E30919)\u0003iai'~=\u0002\u0005\u001b;;\u0001\u001d/\"Yَ_ٽôXyWO__\u000e_\\\u000bq=\u001c\u0006ψạň\u0003/Ͻ\u00047\u0004\u0011<\u001c=9a<1%<\u0018VJ\u007fv3g\u0011S\u0018Z~~xÃ\u0018֖.\r$\\Jm\u0013u¯Ta4\u0014Sɞp5|\u0010\u0013&{ʥ@A"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d79h{#\u0016m\u0017*]JJy\n", "", "u(E", "\u0017b^;F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0016V6GA\u001d\u0014z&\u000bPh45\u0001\u0010", "u(5", "\u0014", "2dU.h3MA+\u0003\n\\/Z\u00136o\r6", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d79h{#\u0015w\u001d8ZQ\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000ehp0\f\u00072C\n/\u0006M\u000fU\u001fC~\u000eIz!<'w-7t\u0016*[C", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZNGS(}B:|\u00123S\u000fI>", "1n[<e:", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W<=\u0011\u0014WD\u0002xKA,\u0016\u0002", "1gT0^,=B\u001c\u000f\u0003[\n\u0007\u00109r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1gT0^,=B&zxd\n\u0007\u00109r", "1gT0^,=0#\fy^9Z\u00136o\r", "1gT0^,=7\u0017\t\u0004<6\u0004\u0013<", "CmR5X*DS\u0018m}n4yf9l\n5", "CmR5X*DS\u0018m\bZ*\u0003f9l\n5", "CmR5X*DS\u0018[\u0005k+|\u0016\ro\u00072\t", "CmR5X*DS\u0018bxh5Z\u00136o\r", "2hb.U3>Rv\u0002z\\2|\b\u001eh\u00100x\u001e\u000b\u001e!T", "2hb.U3>Rv\u0002z\\2|\b\u001er{&\u0002\u001e\u000b\u001e!T", "2hb.U3>Rv\u0002z\\2|\b\fo\r'{M^!\u001eQ|", "2hb.U3>Rv\u0002z\\2|\b\u0013c\n1YJ\b!$", "2hb.U3>R\t\bxa,z\u000f/dn+\fH}t!Ny\u001b", "2hb.U3>R\t\bxa,z\u000f/dn5w>\u0007t!Ny\u001b", "2hb.U3>R\t\bxa,z\u000f/d\\2\t?\u0001$tQv\u0018I", "2hb.U3>R\t\bxa,z\u000f/dc&\u0006I^!\u001eQ|", "1n[<e:\u0006Dd\bmK\u0013K", "uI9\u0017=\u0011#8}c_C\u0011am\u0014Jf$\u0005?\u000e!\u001bF\u0003W:\u0001-@c\f \u0001z&7\\GCk}{\u001fplC\u0015c9$Z\u000b+\u00105(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8L3.\b9M}B6Jy(\u0012Dhs `\u0017Q\u0007#K", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();
    private static final float IconSize = Dp.m6638constructorimpl(16);

    private SwitchDefaults() {
    }

    public final SwitchColors colors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 435552781, "C(colors)299@11393L11:Switch.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(435552781, i2, -1, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:299)");
        }
        SwitchColors defaultSwitchColors$material3_release = getDefaultSwitchColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultSwitchColors$material3_release;
    }

    /* JADX INFO: renamed from: colors-V1nXRL4, reason: not valid java name */
    public final SwitchColors m2593colorsV1nXRL4(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, Composer composer, int i2, int i3, int i4) {
        int i5;
        long jM4223compositeOverOWjLjI = j14;
        long value = j9;
        long value2 = j8;
        long jM4223compositeOverOWjLjI2 = j17;
        long jM4213getTransparent0d7_KjU = j12;
        long value3 = j7;
        long jM4223compositeOverOWjLjI3 = j10;
        long value4 = j5;
        long jM4223compositeOverOWjLjI4 = j16;
        long jM4213getTransparent0d7_KjU2 = j4;
        long value5 = j2;
        long jM4223compositeOverOWjLjI5 = j11;
        long jM4223compositeOverOWjLjI6 = j13;
        long value6 = j6;
        long jM4223compositeOverOWjLjI7 = j15;
        long value7 = j3;
        ComposerKt.sourceInformationMarkerStart(composer, 1937926421, "C(colors)P(2:c#ui.graphics.Color,3:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,14:c#ui.graphics.Color,15:c#ui.graphics.Color,12:c#ui.graphics.Color,13:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,10:c#ui.graphics.Color,11:c#ui.graphics.Color,8:c#ui.graphics.Color,9:c#ui.graphics.Color)324@13145L5,325@13219L5,327@13346L5,328@13425L5,329@13503L5,330@13594L5,331@13670L5,333@13773L5,335@13898L11,337@14015L5,339@14131L11,342@14309L5,344@14432L11,346@14554L5,348@14681L11,350@14802L5,352@14918L11,354@15047L5,356@15163L11,358@15282L5,360@15407L11:Switch.kt#uh7d8r");
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            value5 = ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedHandleColor(), composer, 6);
        }
        if ((i4 & 2) != 0) {
            value7 = ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedTrackColor(), composer, 6);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            jM4213getTransparent0d7_KjU2 = Color.Companion.m4213getTransparent0d7_KjU();
        }
        if ((i4 + 8) - (i4 | 8) != 0) {
            value4 = ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedIconColor(), composer, 6);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
            value6 = ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedHandleColor(), composer, 6);
        }
        if ((i4 + 32) - (i4 | 32) != 0) {
            value3 = ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedTrackColor(), composer, 6);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
            value2 = ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor(), composer, 6);
        }
        if ((i4 + 128) - (i4 | 128) != 0) {
            value = ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedIconColor(), composer, 6);
        }
        if ((i4 & 256) != 0) {
            jM4223compositeOverOWjLjI3 = ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedHandleColor(), composer, 6), SwitchTokens.INSTANCE.getDisabledSelectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1933getSurface0d7_KjU());
        }
        if ((i4 + 512) - (i4 | 512) != 0) {
            jM4223compositeOverOWjLjI5 = ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedTrackColor(), composer, 6), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1933getSurface0d7_KjU());
        }
        if ((-1) - (((-1) - i4) | ((-1) - 1024)) != 0) {
            jM4213getTransparent0d7_KjU = Color.Companion.m4213getTransparent0d7_KjU();
        }
        if ((i4 & 2048) != 0) {
            jM4223compositeOverOWjLjI6 = ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedIconColor(), composer, 6), SwitchTokens.INSTANCE.getDisabledSelectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1933getSurface0d7_KjU());
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4096)) != 0) {
            jM4223compositeOverOWjLjI = ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedHandleColor(), composer, 6), SwitchTokens.INSTANCE.getDisabledUnselectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1933getSurface0d7_KjU());
        }
        if ((i4 & 8192) != 0) {
            i5 = 6;
            jM4223compositeOverOWjLjI7 = ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedTrackColor(), composer, 6), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1933getSurface0d7_KjU());
        } else {
            i5 = 6;
        }
        if ((i4 + 16384) - (i4 | 16384) != 0) {
            long jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedTrackOutlineColor(), composer, i5), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            i5 = 6;
            jM4223compositeOverOWjLjI4 = ColorKt.m4223compositeOverOWjLjI(jM4177copywmQWz5c$default, MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1933getSurface0d7_KjU());
        }
        if ((i4 & 32768) != 0) {
            jM4223compositeOverOWjLjI2 = ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedIconColor(), composer, i5), SwitchTokens.INSTANCE.getDisabledUnselectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1933getSurface0d7_KjU());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1937926421, i2, i3, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:362)");
        }
        SwitchColors switchColors = new SwitchColors(value5, value7, jM4213getTransparent0d7_KjU2, value4, value6, value3, value2, value, jM4223compositeOverOWjLjI3, jM4223compositeOverOWjLjI5, jM4213getTransparent0d7_KjU, jM4223compositeOverOWjLjI6, jM4223compositeOverOWjLjI, jM4223compositeOverOWjLjI7, jM4223compositeOverOWjLjI4, jM4223compositeOverOWjLjI2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return switchColors;
    }

    public final SwitchColors getDefaultSwitchColors$material3_release(ColorScheme colorScheme) {
        SwitchColors defaultSwitchColorsCached$material3_release = colorScheme.getDefaultSwitchColorsCached$material3_release();
        if (defaultSwitchColorsCached$material3_release != null) {
            return defaultSwitchColorsCached$material3_release;
        }
        SwitchColors switchColors = new SwitchColors(ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getSelectedHandleColor()), ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getSelectedTrackColor()), Color.Companion.m4213getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getSelectedIconColor()), ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getUnselectedHandleColor()), ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getUnselectedTrackColor()), ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor()), ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getUnselectedIconColor()), ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getDisabledSelectedHandleColor()), SwitchTokens.INSTANCE.getDisabledSelectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1933getSurface0d7_KjU()), ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getDisabledSelectedTrackColor()), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1933getSurface0d7_KjU()), Color.Companion.m4213getTransparent0d7_KjU(), ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getDisabledSelectedIconColor()), SwitchTokens.INSTANCE.getDisabledSelectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1933getSurface0d7_KjU()), ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getDisabledUnselectedHandleColor()), SwitchTokens.INSTANCE.getDisabledUnselectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1933getSurface0d7_KjU()), ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getDisabledUnselectedTrackColor()), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1933getSurface0d7_KjU()), ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getDisabledUnselectedTrackOutlineColor()), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1933getSurface0d7_KjU()), ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getDisabledUnselectedIconColor()), SwitchTokens.INSTANCE.getDisabledUnselectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1933getSurface0d7_KjU()), null);
        colorScheme.setDefaultSwitchColorsCached$material3_release(switchColors);
        return switchColors;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2594getIconSizeD9Ej5fM() {
        return IconSize;
    }
}
