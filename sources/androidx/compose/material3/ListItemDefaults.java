package androidx.compose.material3;

import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
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
/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u000e\u0007nj?3Le^.ZS0\u0010s{J$c$wLAڭ\u001a\u0014̝9O|f(sPZŲG\u000f\u0014\u0016AU:Ymx\f#?8HoM9eok@\u0011z<\u0005.D:8(\f1 0H\u001e\n\u0013Cy\u0013B6FpHf%M3!B\fD \u000f3tg|=xrc:=9\u001bipUWe6|[$^TU\u0014'g$+NOM\u0015SZ3\rX[M\u001cWqk\f/,߉*ɞָ[8^\u001a\"0{f\u001b^\u000b&\u000b\u0007Ƣ_ϯ̥*NӍOX\u0016(\u0006\u007f\u0014\u000fB\u0007\u001c\nw]<32f6\u0015i:ʺRó҉\u0001]۰\u0004~y8\u001d-\u000e<{N)piai \u0005|\u009e\u0004ټ\u038d\"\u007fͼ%_l\u0010f )]H`?]X=v[@\u001fǀq\b\td\b8\u0012?ϝ\u007f8\u0004\u00144ϱAeZA#'\u000bɞL`"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006])Cha/7ut.N?KrC,j", "", "u(E", "\u0013kTCT;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0012_,OO(\u0003\u0005gs[\\\u000fjO)c", "u(5", "\u0014", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq2", "1n]AX5M1#\u0006\u0005k", "5dc\u0010b5MS\"\u000eXh3\u0007\u0016", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc [(IS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\tz\bUL$D", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006])Cha/7us8TMHy\n", "6dP1_0GSv\t\u0002h9", ":dP1\\5@7\u0017\t\u0004<6\u0004\u0013<", "=uT?_0GSv\t\u0002h9", "At_=b9MW\"\u0001Xh3\u0007\u0016", "BqP6_0GU||\u0005g\n\u0007\u00109r", "2hb.U3>R{~v]3\u0001\u0012/C\n/\u0006M", "2hb.U3>R\u007f~v]0\u0006\u000b\u0013c\n1YJ\b!$", "2hb.U3>R\b\fvb3\u0001\u00121I}2\u0005\u001e\u000b\u001e!T", "1n[<e:\u00068cQ\r,s\\", "uI9\u0017=\u0011#8}caZ5{\u00169i~;E>\u000b\u001f\"Q}\u000e\u0006\u00045>h\u0002(77s8UNEy4+jLE|m_5M\u00041KKauZ\\zH\u001e ZWV'\u001c\u0005fE u\u0012\u0001\u0006\f:XeJh\ti \u0015?w~\u0018", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ListItemDefaults {
    public static final int $stable = 0;
    public static final ListItemDefaults INSTANCE = new ListItemDefaults();
    private static final float Elevation = ListTokens.INSTANCE.m3320getListItemContainerElevationD9Ej5fM();

    private ListItemDefaults() {
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2212getElevationD9Ej5fM() {
        return Elevation;
    }

    public final Shape getShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -496871597, "C536@21333L5:ListItem.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-496871597, i2, -1, "androidx.compose.material3.ListItemDefaults.<get-shape> (ListItem.kt:536)");
        }
        Shape value = ShapesKt.getValue(ListTokens.INSTANCE.getListItemContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getContainerColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1253579929, "C540@21498L5:ListItem.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1253579929, i2, -1, "androidx.compose.material3.ListItemDefaults.<get-containerColor> (ListItem.kt:540)");
        }
        long value = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getContentColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1076068327, "C544@21659L5:ListItem.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1076068327, i2, -1, "androidx.compose.material3.ListItemDefaults.<get-contentColor> (ListItem.kt:544)");
        }
        long value = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    /* JADX INFO: renamed from: colors-J08w3-E, reason: not valid java name */
    public final ListItemColors m2211colorsJ08w3E(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i2, int i3) {
        long jM4177copywmQWz5c$default = j10;
        long jM4177copywmQWz5c$default2 = j9;
        long jM4177copywmQWz5c$default3 = j8;
        long value = j7;
        long value2 = j5;
        long value3 = j6;
        long value4 = j4;
        long value5 = j3;
        long value6 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, -352515689, "C(colors)P(0:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,8:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)564@22724L5,565@22796L5,566@22873L5,567@22944L5,568@23023L5,569@23102L5,571@23202L5,575@23395L5,579@23592L5:ListItem.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            value6 = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemContainerColor(), composer, 6);
        }
        if ((i3 & 2) != 0) {
            value5 = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemLabelTextColor(), composer, 6);
        }
        if ((i3 & 4) != 0) {
            value4 = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemLeadingIconColor(), composer, 6);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            value2 = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemOverlineColor(), composer, 6);
        }
        if ((i3 & 16) != 0) {
            value3 = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemSupportingTextColor(), composer, 6);
        }
        if ((i3 & 32) != 0) {
            value = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemTrailingIconColor(), composer, 6);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            jM4177copywmQWz5c$default3 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemDisabledLabelTextColor(), composer, 6), ListTokens.INSTANCE.getListItemDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i3 + 128) - (i3 | 128) != 0) {
            jM4177copywmQWz5c$default2 = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemDisabledLeadingIconColor(), composer, 6), ListTokens.INSTANCE.getListItemDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i3 & 256) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemDisabledTrailingIconColor(), composer, 6), ListTokens.INSTANCE.getListItemDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-352515689, i2, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:583)");
        }
        ListItemColors listItemColors = new ListItemColors(value6, value5, value4, value2, value3, value, jM4177copywmQWz5c$default3, jM4177copywmQWz5c$default2, jM4177copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return listItemColors;
    }
}
