package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: MultiWidgetSelectionDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яh\u001d<K!&i\u0016DLш|\u0004O\r8é6B\u0015\"4\u0012\u000e\u0007nʑA0ZeP.XS2\u000fy\u0002<$a)yCIU\"Ԃ*\teNo˧vJp\u000bK\u000f\f\u0016\u0001j:N]ތe\u0012%2JģG3coEʠhtD\u000e(2(<\u0002\u0005\u0017\u001a2H\u0016x\u0003Ca\f\u001aؓF\u0081Pĥ=M3\u0019R1N$\u000f\u001etg|7Xxk<G+\u0013mRP=^^\u0001{\u0010V`5\u0012\u000fi./P9K\u0014SY1\nқ_?\u0011F:K\u0013x?'YZ$[Dj\u0018\u0014C>\u0016!&\u00014p\u001dQ\u000f!W/]ycP<1>\u000fD\u001bJ\u001b&\u0006U`^1(| \u000ea}9g\ts\u0010wZ\u007f){f\u001b3\u001bK+g7\u0017UoX1Ne\u001aK!\u038d\"Чϒ Zڍ\u0012b\u001b:b\u0018\u001a7_NUH|\u0013 Q6\f~\u0004\u001a,\u001a/u\u0004u\u0010Y<%GO[g;Qo\u0010^\\g%\u000e'|\u001cw`kX\"\u001d.g.\u0017\"rD\u0013\u000e2d\u001ds:5e\u001c\u0003,.\f!6twj*k$̓NŖʂiLύ\u000e'5\rE\u00017s\u001c\u007fQ`I4\u007f\u007fVu\u001b|\"hTb3\u0003-V$\u0018hd@\"`QAݛ\u0004ԞHN\u0014Ǝ\u0003M\u007f&L.G\u0018\u000b\u001b\u001fҔ*նE|\u0011ݠ+|\u001e\u0001l;4\u0007y&\u000b\b/T\u000bsF\u03a2zͅ0|hõ}U_:1.e&x6\u0013\"5\u0005\"\u0003\u001eшNܤPl\u001e߯&\u000e.\u001629\u007f0\u0014ж\u0011ɒ-8\nΏ]Nxp_Yb=\t\n\u0012\u000fiqVg6p'l7ʇLׅX\u001b:xd\u00011\u0017۰\u007f\u0003iF\u0001fkW\u0011ЗZwqî]g"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g|xhH\u000bU0Mx'V:N3\\P\u0002A\u001e\u001b9\u000eU+\u000f\u0001hAy", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r(K}'\u001d", "Ad[2V;:P ~^]", "", "1n^?W0GO(~\t<(\u0004\u0010,a}.", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", ":`h<h;+S'\u000f\u0002m\nx\u00106b{&\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b%c\u0012\u001c", "-oa2i0Hc'evl;m\r=i|/{*\u0002\u0018%G~", "", "-oa2i0Hc'mzq;c\u0005Co\u00107h@\u000f'\u001eV", "5dc X3>Q(zwe,`\b", "u(9", ":`bAI0LW\u0016\u0006zH-}\u0017/t", "5dc\u0019T:MD\u001d\r~[3|r0f\u000e(\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8D@y4A}%\u001bMQKrCsXL", "/o_2a+,S ~xm(y\u0010/I\t)\u0006/\u000bs'Kv\r<\u0004", "", "0tX9W,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u000eC`X<k/\u0003A\u001b\u0011Z\u001b$", "5dc\u000fb<GR\u001d\b|;6\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "=eU@X;", "5dc\u0010X5MS&r[h9f\n0s\u007f7", "", "5dc\u0015T5=Z\u0019i\u0005l0\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "Ad[2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f|", "7rBAT9M6\u0015\bye,", "", "5dc\u0015T5=Z\u0019i\u0005l0\f\r9nG'X\u001c\u0004i\u00047", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001{\u00165MAJo>'^Va@\u0007a;R\u00010\u001dA\u0012\u0011", "5dc\u0019T@Hc(\\\u0005h9{\r8a\u000f(\n", "5dc\u0019\\5>:\u0019\u007f\n", "5dc\u0019\\5>@\u001d\u0001}m", "5dc\u001fT5@S\u0003\u007fab5|f9n\u000f$\u007fI\u0005 \u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "5dc\u001fT5@S\u0003\u007fab5|f9n\u000f$\u007fI\u0005 \u0019\u000f7\u0013OH\n\u0016g", "uH\u0018\u0017", "5dc X3>Q(Z\u0002e\u001a|\u0010/c\u000f,\u0006I", "5dc!X?M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MultiWidgetSelectionDelegate implements Selectable {
    public static final int $stable = 8;
    private int _previousLastVisibleOffset = -1;
    private TextLayoutResult _previousTextLayoutResult;
    private final Function0<LayoutCoordinates> coordinatesCallback;
    private final Function0<TextLayoutResult> layoutResultCallback;
    private final long selectableId;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiWidgetSelectionDelegate(long j2, Function0<? extends LayoutCoordinates> function0, Function0<TextLayoutResult> function02) {
        this.selectableId = j2;
        this.coordinatesCallback = function0;
        this.layoutResultCallback = function02;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public long getSelectableId() {
        return this.selectableId;
    }

    private final synchronized int getLastVisibleOffset(TextLayoutResult textLayoutResult) {
        int lineCount;
        if (this._previousTextLayoutResult != textLayoutResult) {
            if (!textLayoutResult.getDidOverflowHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                lineCount = textLayoutResult.getLineCount() - 1;
            } else {
                int iCoerceAtMost = RangesKt.coerceAtMost(textLayoutResult.getLineForVerticalPosition(IntSize.m6807getHeightimpl(textLayoutResult.m6096getSizeYbymL2g())), textLayoutResult.getLineCount() - 1);
                while (iCoerceAtMost >= 0 && textLayoutResult.getLineTop(iCoerceAtMost) >= IntSize.m6807getHeightimpl(textLayoutResult.m6096getSizeYbymL2g())) {
                    iCoerceAtMost--;
                }
                lineCount = RangesKt.coerceAtLeast(iCoerceAtMost, 0);
            }
            this._previousLastVisibleOffset = textLayoutResult.getLineEnd(lineCount, true);
            this._previousTextLayoutResult = textLayoutResult;
        }
        return this._previousLastVisibleOffset;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public void appendSelectableInfoToBuilder(SelectionLayoutBuilder selectionLayoutBuilder) {
        TextLayoutResult textLayoutResultInvoke;
        long jM3941minusMKHz9U;
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null || (textLayoutResultInvoke = this.layoutResultCallback.invoke()) == null) {
            return;
        }
        long jMo5523localPositionOfR5De75A = selectionLayoutBuilder.getContainerCoordinates().mo5523localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m3953getZeroF1C5BW0());
        long jM3941minusMKHz9U2 = Offset.m3941minusMKHz9U(selectionLayoutBuilder.m1682getCurrentPositionF1C5BW0(), jMo5523localPositionOfR5De75A);
        if (OffsetKt.m3958isUnspecifiedk4lQ0M(selectionLayoutBuilder.m1683getPreviousHandlePositionF1C5BW0())) {
            jM3941minusMKHz9U = Offset.Companion.m3952getUnspecifiedF1C5BW0();
        } else {
            jM3941minusMKHz9U = Offset.m3941minusMKHz9U(selectionLayoutBuilder.m1683getPreviousHandlePositionF1C5BW0(), jMo5523localPositionOfR5De75A);
        }
        MultiWidgetSelectionDelegateKt.m1668appendSelectableInfoParwq6A(selectionLayoutBuilder, textLayoutResultInvoke, jM3941minusMKHz9U2, jM3941minusMKHz9U, getSelectableId());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public Selection getSelectAllSelection() {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return null;
        }
        int length = textLayoutResultInvoke.getLayoutInput().getText().length();
        return new Selection(new Selection.AnchorInfo(textLayoutResultInvoke.getBidiRunDirection(0), 0, getSelectableId()), new Selection.AnchorInfo(textLayoutResultInvoke.getBidiRunDirection(Math.max(length - 1, 0)), length, getSelectableId()), false);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* JADX INFO: renamed from: getHandlePosition-dBAh8RU, reason: not valid java name */
    public long mo1666getHandlePositiondBAh8RU(Selection selection, boolean z2) {
        TextLayoutResult textLayoutResultInvoke;
        if ((z2 && selection.getStart().getSelectableId() != getSelectableId()) || (!z2 && selection.getEnd().getSelectableId() != getSelectableId())) {
            return Offset.Companion.m3952getUnspecifiedF1C5BW0();
        }
        if (getLayoutCoordinates() != null && (textLayoutResultInvoke = this.layoutResultCallback.invoke()) != null) {
            return TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResultInvoke, RangesKt.coerceIn((z2 ? selection.getStart() : selection.getEnd()).getOffset(), 0, getLastVisibleOffset(textLayoutResultInvoke)), z2, selection.getHandlesCrossed());
        }
        return Offset.Companion.m3952getUnspecifiedF1C5BW0();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinatesInvoke = this.coordinatesCallback.invoke();
        if (layoutCoordinatesInvoke == null || !layoutCoordinatesInvoke.isAttached()) {
            return null;
        }
        return layoutCoordinatesInvoke;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public AnnotatedString getText() {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke != null) {
            return textLayoutResultInvoke.getLayoutInput().getText();
        }
        return new AnnotatedString("", null, null, 6, null);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public Rect getBoundingBox(int i2) {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return Rect.Companion.getZero();
        }
        int length = textLayoutResultInvoke.getLayoutInput().getText().length();
        if (length < 1) {
            return Rect.Companion.getZero();
        }
        return textLayoutResultInvoke.getBoundingBox(RangesKt.coerceIn(i2, 0, length - 1));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineLeft(int i2) {
        int lineForOffset;
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke != null && (lineForOffset = textLayoutResultInvoke.getLineForOffset(i2)) < textLayoutResultInvoke.getLineCount()) {
            return textLayoutResultInvoke.getLineLeft(lineForOffset);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineRight(int i2) {
        int lineForOffset;
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke != null && (lineForOffset = textLayoutResultInvoke.getLineForOffset(i2)) < textLayoutResultInvoke.getLineCount()) {
            return textLayoutResultInvoke.getLineRight(lineForOffset);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getCenterYForOffset(int i2) {
        int lineForOffset;
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null || (lineForOffset = textLayoutResultInvoke.getLineForOffset(i2)) >= textLayoutResultInvoke.getLineCount()) {
            return -1.0f;
        }
        float lineTop = textLayoutResultInvoke.getLineTop(lineForOffset);
        return ((textLayoutResultInvoke.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* JADX INFO: renamed from: getRangeOfLineContaining--jx7JFs, reason: not valid java name */
    public long mo1667getRangeOfLineContainingjx7JFs(int i2) {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return TextRange.Companion.m6128getZerod9O1mEE();
        }
        int lastVisibleOffset = getLastVisibleOffset(textLayoutResultInvoke);
        if (lastVisibleOffset < 1) {
            return TextRange.Companion.m6128getZerod9O1mEE();
        }
        int lineForOffset = textLayoutResultInvoke.getLineForOffset(RangesKt.coerceIn(i2, 0, lastVisibleOffset - 1));
        return TextRangeKt.TextRange(textLayoutResultInvoke.getLineStart(lineForOffset), textLayoutResultInvoke.getLineEnd(lineForOffset, true));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public int getLastVisibleOffset() {
        TextLayoutResult textLayoutResultInvoke = this.layoutResultCallback.invoke();
        if (textLayoutResultInvoke == null) {
            return 0;
        }
        return getLastVisibleOffset(textLayoutResultInvoke);
    }
}
