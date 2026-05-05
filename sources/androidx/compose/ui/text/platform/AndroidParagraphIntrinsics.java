package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
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
/* JADX INFO: compiled from: AndroidParagraphIntrinsics.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\u0015\"4ߚ\u007f\u0007t\tA0ZeP.hS2şs{J$cҕyCQU\"Ԃ*\teNogtJb\u000bQ\u001a\u000e\u0016~m4Ic\u0002e\u0012\u00156JoU3UoC:htD\n(2(=\u0002\u0005\u0017\u001a2H\u0016z\u0003CY\u0012\u001a0FqBR#M\r\u001a\u0018\u0007DĨ\u0017Ȧ\rg|5\t8m>=#\u001bipO7c>~e\rtW7\u001d\u0005e67P?E\u001b5U\u0013\u0007\u0001bm\tmvM\u0015v/?7Y{g<h\u0002$\u0015YX;c!+l\t_j$'YZsO^\u001a@w)\tɁ@\u0004\u001c\u0014wZ<<2f6\u001e\nπtՂDV\nމZ\u0002\u0001rD)u\u000fA7Q\u001b\u0015^ň?\u001fVљ\u0014\u0007\u001311\u0015?-ii&`C1+ȰSśU@Eʰ\u001f\u0019gG\u0006\u0004\u001fm͆.\n8Ϛ\u00181\u0002(</uIiR;!\u001a\u0018~\u0019>Џ\u0007¾lW\u0002TNZ0\nfI8%$Zr\u0002[ߙRԜ\\2\u0019۳4V\r\u001c\u00162pn\u0006\\9%>o\u0006=@ҫOύ\u000e)Gh={|\u000f^iG\u0003K5\u007f\u0005F6)ί\u0016͖@f\u001dZlga/+w6*JTz\u0018\b\u0002TP\u001c\u0013`H \"b1֞\u001db\u001dǽ\u001b Hg\u000b00hv8\u0017VI#1\u0013zڒ\u0015ɹT\\xב8\u0014W0\u0015l25QWE\u001b6UPob\u0003Q\fҋw\u0006OхdIR\u0017$\u001d&\u000b.\u001829\u007f2ˮ\u0017\u0015\u0007ǻJ\u00043pZ\u001f6`[\u0012?z+zӛ?n6Ԗ lvYn\u0019\u001babF:v\r#yΩfѣ}gNک_eZ<ip\u001a\u0005\u0011\rTNf1[ȕ ݵ\u0005u*ĜM/I\\+L߹\u0018f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0019Cr46c\u000b(\u0001I\u001f-ZM?j\u001f\u001a\"dcF\u0003n/2\u007f6TPW:`P\u0001\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:Q\u001f=ZGDy8\u001c#>", "BdgA", "", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "AoP;F;RZ\u0019\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9{Gr.#h\u0012'7C", ">kP0X/HZ\u0018~\bl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\rJkG-^WaL\u0016Q;b}'\u001d3S(mN<M#\u0016aW5/\u001b\u0014/()jU3h\u0018;M\t\u0005O\u0005\u001a%c\u001cfyAc\u001aKx(??3pQcmy\u0011QI,9d\u001fnf]DC3]R#$w1*\u0012\u007fZ%1?yuqN*zEy%idERyY;\bp\u001dU\u0004\u0003\u001c@X>;xv\u0014=.E.cKp&Bm\rjoM", "1gP?F,Jc\u0019\bx^", "", "5dc\u0010[(KA\u0019\u000b\u000b^5z\tmu\u0004\"\u000b@\u0014&\u0011To\u0015<r35", "u(;7T=:\u001d z\u0004`uZ\f+rm(\bP\u0001 \u0015GE", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "3l^7\\\nH[$z\nI9\u0007\u0007/s\u000e(z", "", "5dc\u0013b5M4\u0015\u0007~e@i\t=o\u00079{M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u000fIK?rH\\\u0002hoC\u000et,[L", "6`b g(ES\u0006~\th3\u000e\t.F\n1\u000bN", "5dc\u0015T:,b\u0015\u0006zK,\u000b\u00136v\u007f'\\J\n&%", "u(I", ":`h<h;\"\\(\f~g:\u0001\u0007=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u001ftC+\u0019qo=\u0005q\u0002", "5dc\u0019T@Hc(b\u0004m9\u0001\u0012=i}6:P\u0005\u0011&G\u0003\u001d6\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006r.4f\b$67|*aMKz\u0018'$ueB\u0015g*\\L", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "", "5dc\u001aT?\"\\(\f~g:\u0001\u0007!i~7~", "u(5", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "5dc\u001a\\5\"\\(\f~g:\u0001\u0007!i~7~", "5dc\u001d_(<S\u001c\t\u0002],\n\u0017", "u(;7T=:\u001d)\u000e~euc\r=tU", "@db<_=>R\b\u0013\u0006^-x\u0007/s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0019Cr46c\u000b(\u0001\\*9MD7i4|\u0019upMup(L|'T3R5bRq$\u0018 ic", "5dc c(GA(\u0013\u0002^:", "5dc g@ES", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhk/Kt\u0016\u0004", "5dc!X?M", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "BdgA70KS\u0017\u000e~h5_\t?r\u00046\u000bD~", "", "5dc!X?M2\u001d\fz\\;\u0001\u00138H\u007f8\tD\u000f&\u001bE.\u001e@p45l\r\u001aDm\u001d.IQ;", "u(8", "BdgAC(B\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0019Cr46c\u000b(\u0001I\u001f-ZM?j#\u001e(wL5\u000bl;$", "5dc!X?M>\u0015\u0003\u0004mj\r\r)t\u007f;\u000b:\u000e\u0017\u001eGk\u001c<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u0002,1h~*Du_\nVBHu8\u001d\u0004htHq_0W\u0006|", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {
    public static final int $stable = 8;
    private final CharSequence charSequence;
    private final Density density;
    private final boolean emojiCompatProcessed;
    private final FontFamily.Resolver fontFamilyResolver;
    private final LayoutIntrinsics layoutIntrinsics;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private TypefaceDirtyTrackerLinkedList resolvedTypefaces;
    private final List<AnnotatedString.Range<SpanStyle>> spanStyles;
    private final TextStyle style;
    private final String text;
    private final int textDirectionHeuristic;
    private final AndroidTextPaint textPaint;

    public AndroidParagraphIntrinsics(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, FontFamily.Resolver resolver, Density density) {
        AnnotatedString.Range<SpanStyle> range;
        ArrayList arrayList = list;
        this.text = str;
        this.style = textStyle;
        this.spanStyles = arrayList;
        this.placeholders = list2;
        this.fontFamilyResolver = resolver;
        this.density = density;
        AndroidTextPaint androidTextPaint = new AndroidTextPaint(1, density.getDensity());
        this.textPaint = androidTextPaint;
        this.emojiCompatProcessed = !AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(textStyle) ? false : EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue();
        this.textDirectionHeuristic = AndroidParagraphIntrinsics_androidKt.m6381resolveTextDirectionHeuristicsHklW4sA(textStyle.m6166getTextDirections_7Xco(), textStyle.getLocaleList());
        Function4<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> function4 = new Function4<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface>() { // from class: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics$resolveTypeface$1
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Typeface invoke(FontFamily fontFamily, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis) {
                return m6380invokeDPcqOEQ(fontFamily, fontWeight, fontStyle.m6236unboximpl(), fontSynthesis.m6249unboximpl());
            }

            /* JADX INFO: renamed from: invoke-DPcqOEQ, reason: not valid java name */
            public final Typeface m6380invokeDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3) {
                State<Object> stateMo6208resolveDPcqOEQ = this.this$0.getFontFamilyResolver().mo6208resolveDPcqOEQ(fontFamily, fontWeight, i2, i3);
                if (stateMo6208resolveDPcqOEQ instanceof TypefaceResult.Immutable) {
                    Object value = stateMo6208resolveDPcqOEQ.getValue();
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) value;
                }
                TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = new TypefaceDirtyTrackerLinkedList(stateMo6208resolveDPcqOEQ, this.this$0.resolvedTypefaces);
                this.this$0.resolvedTypefaces = typefaceDirtyTrackerLinkedList;
                return typefaceDirtyTrackerLinkedList.getTypeface();
            }
        };
        TextPaintExtensions_androidKt.setTextMotion(androidTextPaint, textStyle.getTextMotion());
        SpanStyle spanStyleApplySpanStyle = TextPaintExtensions_androidKt.applySpanStyle(androidTextPaint, textStyle.toSpanStyle(), function4, density, !arrayList.isEmpty());
        if (spanStyleApplySpanStyle != null) {
            int size = arrayList.size() + 1;
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 == 0) {
                    range = new AnnotatedString.Range<>(spanStyleApplySpanStyle, 0, this.text.length());
                } else {
                    range = this.spanStyles.get(i2 - 1);
                }
                arrayList2.add(range);
            }
            arrayList = arrayList2;
        }
        CharSequence charSequenceCreateCharSequence = AndroidParagraphHelper_androidKt.createCharSequence(this.text, this.textPaint.getTextSize(), this.style, arrayList, this.placeholders, this.density, function4, this.emojiCompatProcessed);
        this.charSequence = charSequenceCreateCharSequence;
        this.layoutIntrinsics = new LayoutIntrinsics(charSequenceCreateCharSequence, this.textPaint, this.textDirectionHeuristic);
    }

    public final String getText() {
        return this.text;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final List<AnnotatedString.Range<SpanStyle>> getSpanStyles() {
        return this.spanStyles;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.textPaint;
    }

    public final CharSequence getCharSequence$ui_text_release() {
        return this.charSequence;
    }

    public final LayoutIntrinsics getLayoutIntrinsics$ui_text_release() {
        return this.layoutIntrinsics;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.resolvedTypefaces;
        return (typefaceDirtyTrackerLinkedList != null ? typefaceDirtyTrackerLinkedList.isStaleResolvedFont() : false) || (!this.emojiCompatProcessed && AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(this.style) && EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue());
    }

    public final int getTextDirectionHeuristic$ui_text_release() {
        return this.textDirectionHeuristic;
    }
}
