package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.ElevatedCardTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.material3.tokens.OutlinedCardTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
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
/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005'4\u0012\u000e\u0007njO0LeN5ZS@\u000fs{:(c$\bCC٥\"}8\tWNmqvJp\u000bKƤ\u000e\u0016\u0007s4I[|cݐ\u000fHԏ ?aL0B?`ҽ:\u0005.2jC\b\u0017\u0019\u001aXRV{ټGK\u001a%xx~Lj\r{\u000fJ\u0018\f>.\u00156\\\u0016cfNr]HE;\u0003\u0018W~-e0\u000bd%F\u0003<=|g\u001e9XO5C:\u001a\b\u008fQ¹ύ\u0007AwV\u0013\u0003os9d\fWdt0\u001a\u001b+]*urTz5Wf\f5Jgcyn>.}z\n-T\u0004<$WN4-(\b \u000ea\u0013#YFP\u0010\u0001Z\u007f)\u007ff\u001d+\u007fANQ\u001b\u0015o(@уMљ߉\t\u000f$G\u000f\u0014ifb4x\u0015I^>VśU@K[\u0017Bgc\u0006\u0004\u001fl20\n0U\u0014G{?CG+=[G99k0]tm|\u0005n\u007fki\u0001]p(t\u0016EB!\f\tY+\nÐOӹг0\u0013SCb!FT!Htwj=U\u0016TOv\u0007\u0003M\f(U5l7g\u000e\u0004\u000e\u0006W\u000f9;Qq0yR%2oBh\u0005f\bZS:x\r.(2V\r(w*b~\u0012\u00192M\u001544ZO_aŢGґٿFC\u00032m\u007f1%\r~K$1\u0015Tz\u000f\u0001^\t\to\u0016&\u00101ʬd\";o\u001a@'Um\"\u0017>C(ȷ\u0003s\u000eZ0\u0005U{\u0005\u0016$_,&\u001c\u001aGeG=A$//8\u0002;[dr\u0014f}\u0018-z\u000b\u0011';\u0017C\u0018\u000epp:x\u0003J}i]'֧]аן\ff\u0006*o`C\u0014q\u0006#[le#\t_<\\U\u0015\u0005M<U\u0007u\"\u000bTECU;F}\u001a/#\u0002ui\u001eL*h\u0015&\u0003\u0007\u001c,\u00124 hW]@]PI\b\u001dn(*l\u0011e`j&&\t\u000eϢ\fΉȈEfv\tFr[>\fg\u001f,;r\r!ǈ\u0017s\u001664b8w\u0014\r\"c[%?O\n-ƽqOt\rP\u0015\u0018\u000fL@|\u00194=NX\u000e(ס4\n\f\u001a<IIfUR\u0017-L,j\u00123C\u0003t<NQĕHݍ\u0013\u001bJDyGd\u001b%\u000fjd`\u0005\u000fO\t!X\f5M\nͩz\u00985\t\u0006HZ>q?Qi+\u00193j}\t\u000f%YO\u000bwqκZ܁\u000fIuEO\u0013D\u0011ڞ)rsr\u0012զ4+\u001cÖ\u001cN"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!BX\\ 8i&5\\Q\u0011", "", "u(E", "3kTCT;>R\u0007\u0002vi,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc\u0012_,OO(~yL/x\u0014/", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\tz\bUL$D", "=tc9\\5>R\u0007\u0002vi,", "5dc\u001ch;EW\"~yL/x\u0014/", "AgP=X", "5dc [(IS", "2dU.h3M1\u0015\fy<6\u0004\u0013<s", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!BX[*>w#<#", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000eXZ9{f9l\n5\n~\t\u0013&G|\u00128}r/f}'7i$.", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZN7=1m\"A&\u00129WW", "2dU.h3M3 ~\fZ;|\b\ra\r'YJ\b!$U", "5dc\u0011X-:c \u000eZe,\u000e\u0005>e~\u0006wM\u007ft!Ny\u001bJ5-1h}-;i\u001d{GP;r4\u001a#h", "2dU.h3M=)\u000e\u0002b5|\b\ra\r'YJ\b!$U", "5dc\u0011X-:c \u000edn;\u0004\r8e~\u0006wM\u007ft!Ny\u001bJ5-1h}-;i\u001d{GP;r4\u001a#h", "1`a166E]&\r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W,'\u001a\u00047K+xQEt", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX5M1#\u0006\u0005k", "2hb.U3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "2hb.U3>Rv\t\u0004m,\u0006\u0018\ro\u00072\t", "1`a166E]&\rBk6vp\u00148R", "uI9\u0017=\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`$Wx\u001d@~%~7\b(Bw$.Z\u0019\u001fOw\u0005\u0011q`F\u0011g+a@%QTY6jR<E\u0010!Z\u001bR'\u0014R#\u001f {C\u0015)\u000f6V\u0010\u0011", "1`a183>d\u0015\u000e~h5", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!BX]'7~\u0012=QMDA", "2dU.h3M3 ~\fZ;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", ">qT@f,=3 ~\fZ;\u0001\u00138", "4nRBf,=3 ~\fZ;\u0001\u00138", "6ne2e,=3 ~\fZ;\u0001\u00138", "2qP4Z,=3 ~\fZ;\u0001\u00138", "2hb.U3>Rx\u0006zo(\f\r9n", "1`a183>d\u0015\u000e~h5D\u0005;Jp\"H4", "uE5\u00139\r\u001f:\u0015\byk6\u0001\bB/}2\u0004K\u000b%\u0017\u0011|\u001eE\u0006)=YG}Au!8[CHA\u0018\u0002XO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u001aV\u001dN8\u0011\u0001`\u000fmL@D\u001eg3I\u00137w\u0005\u0016\u001fc", "3kTCT;>Rvz\b]\n\u0007\u00109r\u000e", "3kTCT;>Rvz\b]\n\u0007\u00109r\u000eo\tJz~{\u001aB", "3kTCT;>Rvz\b]\f\u0004\t@a\u000f,\u0006I", "3kTCT;>Rvz\b]\f\u0004\t@a\u000f,\u0006IH\u0013#,`\b\tj", "=tc9\\5>Rvz\b]\t\u0007\u0016.e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "3mP/_,=", "", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zk\u00121\u0007\"g=\u001d\"re8\u001a-*X~2QZNu]\\\u0003F\u0013\u000ei\u0012X4VacN#nQ%.\u00156O\u0002\u0011", "=tc9\\5>Rvz\b]\n\u0007\u00109r\u000e", "=tc9\\5>Rvz\b]\n\u0007\u00109r\u000eo\tJz~{\u001aB", "=tc9\\5>Rvz\b]\f\u0004\t@a\u000f,\u0006I", "=tc9\\5>Rvz\b]\f\u0004\t@a\u000f,\u0006IH\u0013#,`\b\tj", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CardDefaults {
    public static final int $stable = 0;
    public static final CardDefaults INSTANCE = new CardDefaults();

    private CardDefaults() {
    }

    public final Shape getShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1266660211, "C376@16530L5:Card.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1266660211, i2, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:376)");
        }
        Shape value = ShapesKt.getValue(FilledCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getElevatedShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -133496185, "C380@16675L5:Card.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-133496185, i2, -1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:380)");
        }
        Shape value = ShapesKt.getValue(ElevatedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getOutlinedShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1095404023, "C384@16820L5:Card.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1095404023, i2, -1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:384)");
        }
        Shape value = ShapesKt.getValue(OutlinedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    /* JADX INFO: renamed from: cardElevation-aqJV_2Y */
    public final CardElevation m1847cardElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        float fM3266getDisabledContainerElevationD9Ej5fM = f7;
        float fM3271getPressedContainerElevationD9Ej5fM = f3;
        float fM3269getHoverContainerElevationD9Ej5fM = f5;
        float fM3268getFocusContainerElevationD9Ej5fM = f4;
        float fM3267getDraggedContainerElevationD9Ej5fM = f6;
        float fM3265getContainerElevationD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, -574898487, "C(cardElevation)P(0:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,2:c#ui.unit.Dp,1:c#ui.unit.Dp):Card.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            fM3265getContainerElevationD9Ej5fM = FilledCardTokens.INSTANCE.m3265getContainerElevationD9Ej5fM();
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            fM3271getPressedContainerElevationD9Ej5fM = FilledCardTokens.INSTANCE.m3271getPressedContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            fM3268getFocusContainerElevationD9Ej5fM = FilledCardTokens.INSTANCE.m3268getFocusContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            fM3269getHoverContainerElevationD9Ej5fM = FilledCardTokens.INSTANCE.m3269getHoverContainerElevationD9Ej5fM();
        }
        if ((i3 & 16) != 0) {
            fM3267getDraggedContainerElevationD9Ej5fM = FilledCardTokens.INSTANCE.m3267getDraggedContainerElevationD9Ej5fM();
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            fM3266getDisabledContainerElevationD9Ej5fM = FilledCardTokens.INSTANCE.m3266getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-574898487, i2, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:405)");
        }
        CardElevation cardElevation = new CardElevation(fM3265getContainerElevationD9Ej5fM, fM3271getPressedContainerElevationD9Ej5fM, fM3268getFocusContainerElevationD9Ej5fM, fM3269getHoverContainerElevationD9Ej5fM, fM3267getDraggedContainerElevationD9Ej5fM, fM3266getDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return cardElevation;
    }

    /* JADX INFO: renamed from: elevatedCardElevation-aqJV_2Y */
    public final CardElevation m1849elevatedCardElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        float fM3185getDisabledContainerElevationD9Ej5fM = f7;
        float fM3186getDraggedContainerElevationD9Ej5fM = f6;
        float fM3188getHoverContainerElevationD9Ej5fM = f5;
        float fM3187getFocusContainerElevationD9Ej5fM = f4;
        float fM3190getPressedContainerElevationD9Ej5fM = f3;
        float fM3184getContainerElevationD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, 1154241939, "C(elevatedCardElevation)P(0:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,2:c#ui.unit.Dp,1:c#ui.unit.Dp):Card.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            fM3184getContainerElevationD9Ej5fM = ElevatedCardTokens.INSTANCE.m3184getContainerElevationD9Ej5fM();
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            fM3190getPressedContainerElevationD9Ej5fM = ElevatedCardTokens.INSTANCE.m3190getPressedContainerElevationD9Ej5fM();
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            fM3187getFocusContainerElevationD9Ej5fM = ElevatedCardTokens.INSTANCE.m3187getFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            fM3188getHoverContainerElevationD9Ej5fM = ElevatedCardTokens.INSTANCE.m3188getHoverContainerElevationD9Ej5fM();
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            fM3186getDraggedContainerElevationD9Ej5fM = ElevatedCardTokens.INSTANCE.m3186getDraggedContainerElevationD9Ej5fM();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            fM3185getDisabledContainerElevationD9Ej5fM = ElevatedCardTokens.INSTANCE.m3185getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1154241939, i2, -1, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:434)");
        }
        CardElevation cardElevation = new CardElevation(fM3184getContainerElevationD9Ej5fM, fM3190getPressedContainerElevationD9Ej5fM, fM3187getFocusContainerElevationD9Ej5fM, fM3188getHoverContainerElevationD9Ej5fM, fM3186getDraggedContainerElevationD9Ej5fM, fM3185getDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return cardElevation;
    }

    /* JADX INFO: renamed from: outlinedCardElevation-aqJV_2Y */
    public final CardElevation m1851outlinedCardElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        float fM3365getDisabledContainerElevationD9Ej5fM = f7;
        float f8 = f4;
        float fM3366getDraggedContainerElevationD9Ej5fM = f6;
        float f9 = f3;
        float f10 = f5;
        float fM3364getContainerElevationD9Ej5fM = f2;
        ComposerKt.sourceInformationMarkerStart(composer, -97678773, "C(outlinedCardElevation)P(0:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,2:c#ui.unit.Dp,1:c#ui.unit.Dp):Card.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            fM3364getContainerElevationD9Ej5fM = OutlinedCardTokens.INSTANCE.m3364getContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f9 = fM3364getContainerElevationD9Ej5fM;
        }
        if ((i3 & 4) != 0) {
            f8 = fM3364getContainerElevationD9Ej5fM;
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            f10 = fM3364getContainerElevationD9Ej5fM;
        }
        if ((i3 & 16) != 0) {
            fM3366getDraggedContainerElevationD9Ej5fM = OutlinedCardTokens.INSTANCE.m3366getDraggedContainerElevationD9Ej5fM();
        }
        if ((i3 & 32) != 0) {
            fM3365getDisabledContainerElevationD9Ej5fM = OutlinedCardTokens.INSTANCE.m3365getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-97678773, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:463)");
        }
        CardElevation cardElevation = new CardElevation(fM3364getContainerElevationD9Ej5fM, f9, f8, f10, fM3366getDraggedContainerElevationD9Ej5fM, fM3365getDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return cardElevation;
    }

    public final CardColors cardColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1876034303, "C(cardColors)476@21292L11:Card.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1876034303, i2, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:476)");
        }
        CardColors defaultCardColors$material3_release = getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultCardColors$material3_release;
    }

    /* JADX INFO: renamed from: cardColors-ro_MJ88 */
    public final CardColors m1846cardColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j4;
        long jM4177copywmQWz5c$default = j5;
        long jM1947contentColorForek8zF_U = j3;
        long jM4214getUnspecified0d7_KjU2 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, -1589582123, "C(cardColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)490@21903L31,494@22109L11:Card.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(jM4214getUnspecified0d7_KjU2, composer, (i2 + 14) - (14 | i2));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(jM1947contentColorForek8zF_U, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589582123, i2, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:494)");
        }
        CardColors cardColorsM1841copyjRlVdoo = getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1841copyjRlVdoo(jM4214getUnspecified0d7_KjU2, jM1947contentColorForek8zF_U, jM4214getUnspecified0d7_KjU, jM4177copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return cardColorsM1841copyjRlVdoo;
    }

    public final CardColors getDefaultCardColors$material3_release(ColorScheme colorScheme) {
        CardColors defaultCardColorsCached$material3_release = colorScheme.getDefaultCardColorsCached$material3_release();
        if (defaultCardColorsCached$material3_release != null) {
            return defaultCardColorsCached$material3_release;
        }
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, FilledCardTokens.INSTANCE.getContainerColor()), ColorSchemeKt.m1946contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, FilledCardTokens.INSTANCE.getContainerColor())), ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledCardTokens.INSTANCE.getDisabledContainerColor()), FilledCardTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledCardTokens.INSTANCE.getContainerColor())), Color.m4177copywmQWz5c$default(ColorSchemeKt.m1946contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, FilledCardTokens.INSTANCE.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    public final CardColors elevatedCardColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1610137975, "C(elevatedCardColors)522@23477L11:Card.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1610137975, i2, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:522)");
        }
        CardColors defaultElevatedCardColors$material3_release = getDefaultElevatedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultElevatedCardColors$material3_release;
    }

    /* JADX INFO: renamed from: elevatedCardColors-ro_MJ88 */
    public final CardColors m1848elevatedCardColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j2;
        long jM4177copywmQWz5c$default = j5;
        long jM4214getUnspecified0d7_KjU2 = j4;
        long jM1947contentColorForek8zF_U = j3;
        ComposerKt.sourceInformationMarkerStart(composer, 139558303, "C(elevatedCardColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)536@24145L31,540@24351L11:Card.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(jM4214getUnspecified0d7_KjU, composer, 14 & i2);
        }
        if ((i3 & 4) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(jM1947contentColorForek8zF_U, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(139558303, i2, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:540)");
        }
        CardColors cardColorsM1841copyjRlVdoo = getDefaultElevatedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1841copyjRlVdoo(jM4214getUnspecified0d7_KjU, jM1947contentColorForek8zF_U, jM4214getUnspecified0d7_KjU2, jM4177copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return cardColorsM1841copyjRlVdoo;
    }

    public final CardColors getDefaultElevatedCardColors$material3_release(ColorScheme colorScheme) {
        CardColors defaultElevatedCardColorsCached$material3_release = colorScheme.getDefaultElevatedCardColorsCached$material3_release();
        if (defaultElevatedCardColorsCached$material3_release != null) {
            return defaultElevatedCardColorsCached$material3_release;
        }
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, ElevatedCardTokens.INSTANCE.getContainerColor()), ColorSchemeKt.m1946contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, ElevatedCardTokens.INSTANCE.getContainerColor())), ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ElevatedCardTokens.INSTANCE.getDisabledContainerColor()), ElevatedCardTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, ElevatedCardTokens.INSTANCE.getDisabledContainerColor())), Color.m4177copywmQWz5c$default(ColorSchemeKt.m1946contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, ElevatedCardTokens.INSTANCE.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    public final CardColors outlinedCardColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1204388929, "C(outlinedCardColors)571@25869L11:Card.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1204388929, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:571)");
        }
        CardColors defaultOutlinedCardColors$material3_release = getDefaultOutlinedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultOutlinedCardColors$material3_release;
    }

    /* JADX INFO: renamed from: outlinedCardColors-ro_MJ88 */
    public final CardColors m1850outlinedCardColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j4;
        long jM4177copywmQWz5c$default = j5;
        long jM1947contentColorForek8zF_U = j3;
        long jM4214getUnspecified0d7_KjU2 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, -1112362409, "C(outlinedCardColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)585@26537L31,587@26667L31,589@26762L11:Card.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(jM4214getUnspecified0d7_KjU2, composer, (i2 + 14) - (14 | i2));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            jM4177copywmQWz5c$default = Color.m4177copywmQWz5c$default(ColorSchemeKt.m1947contentColorForek8zF_U(jM4214getUnspecified0d7_KjU2, composer, (-1) - (((-1) - i2) | ((-1) - 14))), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112362409, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:589)");
        }
        CardColors cardColorsM1841copyjRlVdoo = getDefaultOutlinedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1841copyjRlVdoo(jM4214getUnspecified0d7_KjU2, jM1947contentColorForek8zF_U, jM4214getUnspecified0d7_KjU, jM4177copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return cardColorsM1841copyjRlVdoo;
    }

    public final CardColors getDefaultOutlinedCardColors$material3_release(ColorScheme colorScheme) {
        CardColors defaultOutlinedCardColorsCached$material3_release = colorScheme.getDefaultOutlinedCardColorsCached$material3_release();
        if (defaultOutlinedCardColorsCached$material3_release != null) {
            return defaultOutlinedCardColorsCached$material3_release;
        }
        CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, OutlinedCardTokens.INSTANCE.getContainerColor()), ColorSchemeKt.m1946contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, OutlinedCardTokens.INSTANCE.getContainerColor())), ColorSchemeKt.fromToken(colorScheme, OutlinedCardTokens.INSTANCE.getContainerColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.m1946contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, OutlinedCardTokens.INSTANCE.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedCardColorsCached$material3_release(cardColors);
        return cardColors;
    }

    public final BorderStroke outlinedCardBorder(boolean z2, Composer composer, int i2, int i3) {
        long jM4223compositeOverOWjLjI;
        ComposerKt.sourceInformationMarkerStart(composer, -392936593, "C(outlinedCardBorder)626@28402L72:Card.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            z2 = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-392936593, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:617)");
        }
        if (z2) {
            composer.startReplaceGroup(-134409770);
            ComposerKt.sourceInformation(composer, "620@28131L5");
            jM4223compositeOverOWjLjI = ColorSchemeKt.getValue(OutlinedCardTokens.INSTANCE.getOutlineColor(), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-134330379);
            ComposerKt.sourceInformation(composer, "622@28214L5,624@28366L5");
            jM4223compositeOverOWjLjI = ColorKt.m4223compositeOverOWjLjI(Color.m4177copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedCardTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.getValue(ElevatedCardTokens.INSTANCE.getContainerColor(), composer, 6));
            composer.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerStart(composer, -974156849, "CC(remember):Card.kt#9igjgp");
        boolean zChanged = composer.changed(jM4223compositeOverOWjLjI);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = BorderStrokeKt.m600BorderStrokecXLIe8U(OutlinedCardTokens.INSTANCE.m3370getOutlineWidthD9Ej5fM(), jM4223compositeOverOWjLjI);
            composer.updateRememberedValue(objRememberedValue);
        }
        BorderStroke borderStroke = (BorderStroke) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return borderStroke;
    }
}
