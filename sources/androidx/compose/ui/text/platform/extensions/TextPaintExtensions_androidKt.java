package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: TextPaintExtensions.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d̉=!,n\bDJc|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tsAӄLe^.Zݷ2\u000f\u0002{<$a%yCQU\"}(\tWN}gvJp\u000bK\u000f\u001c\u0016\u0001jBI]xs\u0012\u00172XoG\u074cUoS9ht<\u0005(208\u0002ڎ\t\u001a@H\u0018͌\u0013QYÈ*0nojV\u001bM\u001d\u001a@\u0005\u0005Ĩ\u0019Rjhf8^k\f<_'\u0011lZNUc`\u0001[\u0012^TU\u0013'e,2X7c\u001dUY\u0011\u0010j]U\u0002m{\u0004\u0005ڋ&ݐȅMu]Af\f,c9\\%_\t%\u000b\u0007y`:5[SqZh\u000eVy+ \u001bL\u001c.\u0016+X0C\u0019\u0015\u001a\u001e5\u0005r\u0002S`\u0004nB.\u000fq8'%.H;;+f\u007fwi*~;\n\u001c%\u001eQ\u0019\u001f'aT\u001ce-\u001b\u0003}\u0018ĸiJKaf\n\bC\u0016\u0004\u001fdHÏ\u001cDU\u001aG{?I?%eii)/\b\u001aJZf%\"'å\u05c8iWPC(ä2e)Ç\u0010x"}, d2 = {"1na?X*M0 \u000f\bK({\r?s", "", "0kd?E(=W)\r", "5d]2e(MSyz\u0002e)x\u00075S\u000b$\u0005.\u0010+\u001eG", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9{Gr.#h\u0012'7C", ":dcAX9,^\u0015|~g.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "@d`B\\9>a\u007f~\nm,\nv:a},\u0005B", "", "0`R8Z9Hc\"}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "0`b2_0GS\u0007\u0002~_;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#Z\u001cEm\u001d2VC)n8\u001f$>", "5d]2e(MSyz\u0002e)x\u00075S\u000b$\u0005.\u0010+\u001eG7^\tX\u0014\u001f6P", "uII\u0017?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011~\u000eO\u0006nCh\u0012'77r*[CBo=\u001e\u0003ke:\u00169o5r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b3nWFhu7E\u000b)w\u0015\u0013\u0016c", "/o_9l\u001aIO\"l\nr3|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0019Cr46c\u000b(\u0001I\u001f-ZM?j#\u001e(wL5\u000bl;$", "Ash9X", "@db<_=>B-\nz_(z\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJOA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[*7\\F;y8,j", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0017\u0010K\u0001\u0018\u0013Eoc", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "6`b\u0013b5M/(\u000e\bb)\r\u0018/s", "Adc!X?M;#\u000e~h5", "", "BdgA@6MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|}8\\GEt\n", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextPaintExtensions_androidKt {
    public static final float correctBlurRadius(float f2) {
        if (f2 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f2;
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, Function4 function4, Density density, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            z2 = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, function4, density, z2);
    }

    public static final SpanStyle applySpanStyle(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> function4, Density density, boolean z2) {
        long jM6830getTypeUIouoOA = TextUnit.m6830getTypeUIouoOA(spanStyle.m6074getFontSizeXSAIIZE());
        if (TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6864getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo709toPxR2X_6o(spanStyle.m6074getFontSizeXSAIIZE()));
        } else if (TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6863getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m6831getValueimpl(spanStyle.m6074getFontSizeXSAIIZE()));
        }
        if (hasFontAttributes(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle fontStyleM6075getFontStyle4Lr2A7w = spanStyle.m6075getFontStyle4Lr2A7w();
            FontStyle fontStyleM6230boximpl = FontStyle.m6230boximpl(fontStyleM6075getFontStyle4Lr2A7w != null ? fontStyleM6075getFontStyle4Lr2A7w.m6236unboximpl() : FontStyle.Companion.m6240getNormal_LCdwA());
            FontSynthesis fontSynthesisM6076getFontSynthesisZQGJjVo = spanStyle.m6076getFontSynthesisZQGJjVo();
            androidTextPaint.setTypeface(function4.invoke(fontFamily, fontWeight, fontStyleM6230boximpl, FontSynthesis.m6241boximpl(fontSynthesisM6076getFontSynthesisZQGJjVo != null ? fontSynthesisM6076getFontSynthesisZQGJjVo.m6249unboximpl() : FontSynthesis.Companion.m6250getAllGVVA2EU())));
        }
        if (spanStyle.getLocaleList() != null && !Intrinsics.areEqual(spanStyle.getLocaleList(), LocaleList.Companion.getCurrent())) {
            LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !Intrinsics.areEqual(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !Intrinsics.areEqual(spanStyle.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m6392setColor8_81llA(spanStyle.m6073getColor0d7_KjU());
        androidTextPaint.m6390setBrush12SF9DM(spanStyle.getBrush(), Size.Companion.m4014getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (TextUnitType.m6859equalsimpl0(TextUnit.m6830getTypeUIouoOA(spanStyle.m6077getLetterSpacingXSAIIZE()), TextUnitType.Companion.m6864getSpUIouoOA()) && TextUnit.m6831getValueimpl(spanStyle.m6077getLetterSpacingXSAIIZE()) != 0.0f) {
            float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
            float fMo709toPxR2X_6o = density.mo709toPxR2X_6o(spanStyle.m6077getLetterSpacingXSAIIZE());
            if (textSize != 0.0f) {
                androidTextPaint.setLetterSpacing(fMo709toPxR2X_6o / textSize);
            }
        } else if (TextUnitType.m6859equalsimpl0(TextUnit.m6830getTypeUIouoOA(spanStyle.m6077getLetterSpacingXSAIIZE()), TextUnitType.Companion.m6863getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m6831getValueimpl(spanStyle.m6077getLetterSpacingXSAIIZE()));
        }
        return m6406generateFallbackSpanStyle62GTOB8(spanStyle.m6077getLetterSpacingXSAIIZE(), z2, spanStyle.m6071getBackground0d7_KjU(), spanStyle.m6072getBaselineShift5SSeXJ0());
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x008f  */
    /* JADX INFO: renamed from: generateFallbackSpanStyle-62GTOB8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final androidx.compose.ui.text.SpanStyle m6406generateFallbackSpanStyle62GTOB8(long r20, boolean r22, long r23, androidx.compose.ui.text.style.BaselineShift r25) {
        /*
            r0 = r23
            r13 = r20
            r15 = r25
            r7 = 1
            r6 = 0
            if (r22 == 0) goto L23
            long r4 = androidx.compose.ui.unit.TextUnit.m6830getTypeUIouoOA(r13)
            androidx.compose.ui.unit.TextUnitType$Companion r2 = androidx.compose.ui.unit.TextUnitType.Companion
            long r2 = r2.m6864getSpUIouoOA()
            boolean r2 = androidx.compose.ui.unit.TextUnitType.m6859equalsimpl0(r4, r2)
            if (r2 == 0) goto L23
            float r3 = androidx.compose.ui.unit.TextUnit.m6831getValueimpl(r13)
            r2 = 0
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L93
        L23:
            r5 = r6
        L24:
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.ui.graphics.Color.Companion
            long r2 = r2.m4214getUnspecified0d7_KjU()
            boolean r2 = androidx.compose.ui.graphics.Color.m4179equalsimpl0(r0, r2)
            if (r2 != 0) goto L91
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.ui.graphics.Color.Companion
            long r2 = r2.m4213getTransparent0d7_KjU()
            boolean r2 = androidx.compose.ui.graphics.Color.m4179equalsimpl0(r0, r2)
            if (r2 != 0) goto L91
            r4 = r7
        L3d:
            if (r15 == 0) goto L8f
            androidx.compose.ui.text.style.BaselineShift$Companion r2 = androidx.compose.ui.text.style.BaselineShift.Companion
            float r3 = r2.m6421getNoney9eOQZs()
            float r2 = r15.m6417unboximpl()
            boolean r2 = androidx.compose.ui.text.style.BaselineShift.m6414equalsimpl0(r2, r3)
            if (r2 != 0) goto L8f
        L4f:
            r3 = 0
            if (r5 != 0) goto L57
            if (r4 != 0) goto L57
            if (r7 != 0) goto L57
        L56:
            return r3
        L57:
            if (r5 == 0) goto L88
        L59:
            if (r4 == 0) goto L81
        L5b:
            if (r7 == 0) goto L7f
        L5d:
            androidx.compose.ui.text.SpanStyle r3 = new androidx.compose.ui.text.SpanStyle
            r24 = 63103(0xf67f, float:8.8426E-41)
            r25 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r17 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r18 = r0
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25)
            goto L56
        L7f:
            r15 = r3
            goto L5d
        L81:
            androidx.compose.ui.graphics.Color$Companion r0 = androidx.compose.ui.graphics.Color.Companion
            long r0 = r0.m4214getUnspecified0d7_KjU()
            goto L5b
        L88:
            androidx.compose.ui.unit.TextUnit$Companion r2 = androidx.compose.ui.unit.TextUnit.Companion
            long r13 = r2.m6842getUnspecifiedXSAIIZE()
            goto L59
        L8f:
            r7 = r6
            goto L4f
        L91:
            r4 = r6
            goto L3d
        L93:
            r5 = r7
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt.m6406generateFallbackSpanStyle62GTOB8(long, boolean, long, androidx.compose.ui.text.style.BaselineShift):androidx.compose.ui.text.SpanStyle");
    }

    public static final void setTextMotion(AndroidTextPaint androidTextPaint, TextMotion textMotion) {
        int flags;
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        if (textMotion.getSubpixelTextPositioning$ui_text_release()) {
            flags = androidTextPaint.getFlags() | 128;
        } else {
            flags = (-1) - (((-1) - androidTextPaint.getFlags()) | ((-1) - (-129)));
        }
        androidTextPaint.setFlags(flags);
        int iM6555getLinearity4e0Vf04$ui_text_release = textMotion.m6555getLinearity4e0Vf04$ui_text_release();
        if (TextMotion.Linearity.m6559equalsimpl0(iM6555getLinearity4e0Vf04$ui_text_release, TextMotion.Linearity.Companion.m6564getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m6559equalsimpl0(iM6555getLinearity4e0Vf04$ui_text_release, TextMotion.Linearity.Companion.m6563getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (TextMotion.Linearity.m6559equalsimpl0(iM6555getLinearity4e0Vf04$ui_text_release, TextMotion.Linearity.Companion.m6565getNone4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        } else {
            androidTextPaint.getFlags();
        }
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.m6075getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) ? false : true;
    }
}
