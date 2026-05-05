package androidx.compose.material3;

import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.FabPrimaryLargeTokens;
import androidx.compose.material3.tokens.FabPrimarySmallTokens;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
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
/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u000e\u0007nj?1Le^.ZS0\u0016s{J$c$wMAڭ\u001a\u0014̝9O|f(sPZŲG\u000f\u0014\u0016A!:]mx\f'?8HoMIeok;\u0011z<\u0005.I:8(\u00071 0H\u001e\u000f\u0013Cy\u000eB6FpHk%M3\u001cǀ\u0005̄ŋ\u0005 b\u0002\\Q\u0011%kVG#1~rT-_>\u0013e\rtVW\u0013|a,BX7c\u0017UY\t\u0007`sW\u0003msm\u000bn'5Das\u00068\u001f\u0005ѥ\u0014ۀ̠\u0011_xCj#\u001a\u0019\u001aFCO\u0012`\u0001\u0014.w\t\u0012%<2\u00106-N.;1~\b<5%xY@^\u001avB.|\u0012<\u001d%\u000eLC9Ih\u0018fߛ\u0018\u05cbѼ\u007f\u0007\u0013>1\u001f?8iU&`C\u001dȑv\u0383ƱP?ףLV\u0012YKr\u001crh\u00058\b\u0001\\\u000e5\u0014\u0011\\\u001e[|ڼ8\u05faޢj\u0001ҩHk\u000f\u0007fpar#WN,\u0007\u0016e5?QʑHh\u001dmV`f9a\\*b\u001f}6\u001eV\"ʟ@%=\u0012T^vv;\\k\u001a=/\u0015B\u00104«\u0012[Q`9F_p`p`\t,?jm;\u001eڋFW$\\b;0?ʎj\u0019\u007f~Jª(A1Gq\"SϢ5:"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006W,?U\r$@oq,\\GEt\u0011.$wkBec-J\u0007.VZ$", "", "u(E", "\u001a`a4X\u0010<]\"l~s,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0019T9@S||\u0005g\u001a\u0001\u001e/-^{[EP\u0018~", "u(5", "\u0014", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq2", "3wc2a+>RyzwL/x\u0014/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc\u0012k;>\\\u0018~y?(yv2a\u000b(", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\tz\bUL$D", ":`a4X\u001aAO$~", "5dc\u0019T9@S\u0007\u0002vi,", "AgP=X", "5dc [(IS", "AlP9_\u001aAO$~", "5dc `(EZ\u0007\u0002vi,", "0ncAb4\u001a^$[vk\rx\u0006\u000fl\u007f9wO\u0005! ", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006W,?U\r$@oq,\\GEt\u0011.$wkBfj,_r6KVW\u0002", "2dU.h3M3 ~\fZ;\u0001\u00138", ">qT@f,=3 ~\fZ;\u0001\u00138", "4nRBf,=3 ~\fZ;\u0001\u00138", "6ne2e,=3 ~\fZ;\u0001\u00138", "0ncAb4\u001a^$[vk\rx\u0006\u000fl\u007f9wO\u0005! \u000fka,{\tD(", "uE5\u00139o%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`Ok\u001d<\u0004)1`Ki\u0018t *\\GDm\u0010\u001c$lkBcs;]\u00010'SN=XavG\u001dg", "3kTCT;B]\"", "3kTCT;B]\"F\u000eS\u007fDt5E", "uE5\u00139\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`$Wx\u001d@~%~7\b(Bw$.Z\u0019\u001fOw\u0005\u0011q`F\u0011g+a@%QTY6jR<E\u0010!Z\u001bR'\u0014R#\"+x@F#\u0011.%\u007fJl\u000b\u0015r\u001eDyzK6\u0017G\u000b\u0011\u0005E3q\u001c", ":nf2e,=3 ~\fZ;\u0001\u00138", ":nf2e,=3 ~\fZ;\u0001\u00138-\u0013\u001dO\bl\u001dv", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();
    private static final float LargeIconSize = FabPrimaryLargeTokens.INSTANCE.m3212getIconSizeD9Ej5fM();

    private FloatingActionButtonDefaults() {
    }

    /* JADX INFO: renamed from: getLargeIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2136getLargeIconSizeD9Ej5fM() {
        return LargeIconSize;
    }

    public final Shape getShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -53247565, "C410@19302L5:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-53247565, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:410)");
        }
        Shape value = ShapesKt.getValue(FabPrimaryTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getSmallShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 394933381, "C414@19461L5:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394933381, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-smallShape> (FloatingActionButton.kt:414)");
        }
        Shape value = ShapesKt.getValue(FabPrimarySmallTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getLargeShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1835912187, "C418@19620L5:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1835912187, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-largeShape> (FloatingActionButton.kt:418)");
        }
        Shape value = ShapesKt.getValue(FabPrimaryLargeTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getExtendedFabShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -536021915, "C422@19792L5:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-536021915, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:422)");
        }
        Shape value = ShapesKt.getValue(ExtendedFabPrimaryTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getContainerColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1855656391, "C426@19954L5:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1855656391, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:426)");
        }
        long value = ColorSchemeKt.getValue(FabPrimaryTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    /* JADX INFO: renamed from: elevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m2135elevationxZ9QkE(float f2, float f3, float f4, float f5, Composer composer, int i2, int i3) {
        float fM3233getHoverContainerElevationD9Ej5fM = f5;
        float fM3232getFocusContainerElevationD9Ej5fM = f4;
        float fM3239getPressedContainerElevationD9Ej5fM = f3;
        float fM3229getContainerElevationD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, -241106249, "C(elevation)P(0:c#ui.unit.Dp,3:c#ui.unit.Dp,1:c#ui.unit.Dp,2:c#ui.unit.Dp):FloatingActionButton.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            fM3229getContainerElevationD9Ej5fM = FabPrimaryTokens.INSTANCE.m3229getContainerElevationD9Ej5fM();
        }
        if ((i3 + 2) - (2 | i3) != 0) {
            fM3239getPressedContainerElevationD9Ej5fM = FabPrimaryTokens.INSTANCE.m3239getPressedContainerElevationD9Ej5fM();
        }
        if ((i3 + 4) - (4 | i3) != 0) {
            fM3232getFocusContainerElevationD9Ej5fM = FabPrimaryTokens.INSTANCE.m3232getFocusContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            fM3233getHoverContainerElevationD9Ej5fM = FabPrimaryTokens.INSTANCE.m3233getHoverContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-241106249, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:446)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(fM3229getContainerElevationD9Ej5fM, fM3239getPressedContainerElevationD9Ej5fM, fM3232getFocusContainerElevationD9Ej5fM, fM3233getHoverContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return floatingActionButtonElevation;
    }

    /* JADX INFO: renamed from: loweredElevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m2137loweredElevationxZ9QkE(float f2, float f3, float f4, float f5, Composer composer, int i2, int i3) {
        float fM3237getLoweredHoverContainerElevationD9Ej5fM = f5;
        float fM3236getLoweredFocusContainerElevationD9Ej5fM = f4;
        float fM3238getLoweredPressedContainerElevationD9Ej5fM = f3;
        float fM3235getLoweredContainerElevationD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, -285065125, "C(loweredElevation)P(0:c#ui.unit.Dp,3:c#ui.unit.Dp,1:c#ui.unit.Dp,2:c#ui.unit.Dp):FloatingActionButton.kt#uh7d8r");
        if ((i3 + 1) - (1 | i3) != 0) {
            fM3235getLoweredContainerElevationD9Ej5fM = FabPrimaryTokens.INSTANCE.m3235getLoweredContainerElevationD9Ej5fM();
        }
        if ((2 & i3) != 0) {
            fM3238getLoweredPressedContainerElevationD9Ej5fM = FabPrimaryTokens.INSTANCE.m3238getLoweredPressedContainerElevationD9Ej5fM();
        }
        if ((4 & i3) != 0) {
            fM3236getLoweredFocusContainerElevationD9Ej5fM = FabPrimaryTokens.INSTANCE.m3236getLoweredFocusContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            fM3237getLoweredHoverContainerElevationD9Ej5fM = FabPrimaryTokens.INSTANCE.m3237getLoweredHoverContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-285065125, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation (FloatingActionButton.kt:470)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(fM3235getLoweredContainerElevationD9Ej5fM, fM3238getLoweredPressedContainerElevationD9Ej5fM, fM3236getLoweredFocusContainerElevationD9Ej5fM, fM3237getLoweredHoverContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return floatingActionButtonElevation;
    }

    /* JADX INFO: renamed from: bottomAppBarFabElevation-a9UjIt4, reason: not valid java name */
    public final FloatingActionButtonElevation m2134bottomAppBarFabElevationa9UjIt4(float f2, float f3, float f4, float f5) {
        return new FloatingActionButtonElevation(f2, f3, f4, f5, null);
    }

    /* JADX INFO: renamed from: bottomAppBarFabElevation-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ FloatingActionButtonElevation m2133bottomAppBarFabElevationa9UjIt4$default(FloatingActionButtonDefaults floatingActionButtonDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = Dp.m6638constructorimpl(0);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = Dp.m6638constructorimpl(0);
        }
        if ((4 & i2) != 0) {
            f4 = Dp.m6638constructorimpl(0);
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            f5 = Dp.m6638constructorimpl(0);
        }
        return floatingActionButtonDefaults.m2134bottomAppBarFabElevationa9UjIt4(f2, f3, f4, f5);
    }
}
