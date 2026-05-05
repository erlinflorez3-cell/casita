package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: SelectionController.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLш|\u0004O\r8é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0010s{J$c$wDCU0}*ޛWNugvϺb\u000bY\u000f\u000e\u0016~m4Ikxe\u0012\u00152JoU3UڎCʠvҚf\u0005N1b]\n\t\u000f\u001aBH>w\u000bGY\u000e*0nsJV\u001bQ\u001d\u001a@\u000bN&\u0007\u001ejmf6vsҺ>/1\u000b2N\\7w0+^=Jb9%v\u00101sFEI-%\u0002\u0014Mf$E\u0011T\n=3ym;sO\u0002mNX.%[?\u0018\u0019k\n>\\3b\u0011\u00105CgcyiV4\u0006\u0015\u0014\rj\u0015>\n5cF-H\u0003X\"Ax\u000bSnUXތDʎyʨڠ\u0016$ő7-A\u001btZ2J'XO{3\u0018̷'\u0007vďsV\u0014l#(%\u0004_7i@kO%˦eǀq\u0004xçR8\u0012>_\u0002Ez?=m©C٦=#)ǽRTRg\u000f\u0005\u000fi*֢T͕D\"vݫ\b6\u0017\u000erD\u0013\bB¯Vг0\u0011Uȼ΄\u0007\u0007\u0010\u0016&ϡ\u0014j -\u0010Tnſm\b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0003hh9\u0005r0X\u007f\u0005QU]9fYy=!g", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-!j$.ZT;x\n", "Ad[2V;:P ~^]", "", "Ad[2V;B]\"kz`0\u000b\u0018<a\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0014GNR:k_nJi", "0`R8Z9Hc\"}h^3|\u0007>i\n1YJ\b!$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", ">`a.`:", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri?w\u00152NG;xBg\u0003w]H\u000ba\u001bN\n65LU,ZavG\u001d|V\u001bJ3\u001bZ", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2O9\u000ec*]z1P9N.``\u0002J\u0010\u001f0r5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\r \u001e>ilQZ\u001aPC$uT82Nc^}HEEo8.yn\u0019k>8\u0013\u0014\u0005(\thW.\b\u000bW\u001b{=utcO'P\u001f*H|bJN9ZM|p#T\u000bw\u001f;T{tS-\u00050:=sbUp&Mk\t\u0013;fN\u000f\"CB\u0013L!'f", "\u0018", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "5dc\u001ab+BT\u001d~\b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/", "Ad[2V;:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r(K}'\u001d", "2qPD", "", "2qPDF*H^\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "=m0/T5=]\"~y", "=m5<e.Hb(~\u0004", "=mA2`,FP\u0019\fz]", "CoS.g, Z#{ve\u0017\u0007\u00173t\u00042\u0005", "1n^?W0GO(~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "CoS.g,-S,\u000eaZ@\u0007\u0019>", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SelectionController implements RememberObserver {
    public static final int $stable = 8;
    private final long backgroundSelectionColor;
    private final Modifier modifier;
    private StaticTextSelectionParams params;
    private Selectable selectable;
    private final long selectableId;
    private final SelectionRegistrar selectionRegistrar;

    public /* synthetic */ SelectionController(long j2, SelectionRegistrar selectionRegistrar, long j3, StaticTextSelectionParams staticTextSelectionParams, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, selectionRegistrar, j3, staticTextSelectionParams);
    }

    private SelectionController(long j2, SelectionRegistrar selectionRegistrar, long j3, StaticTextSelectionParams staticTextSelectionParams) {
        this.selectableId = j2;
        this.selectionRegistrar = selectionRegistrar;
        this.backgroundSelectionColor = j3;
        this.params = staticTextSelectionParams;
        this.modifier = PointerIconKt.pointerHoverIcon$default(SelectionControllerKt.makeSelectionModifier(selectionRegistrar, j2, new Function0<LayoutCoordinates>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$modifier$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LayoutCoordinates invoke() {
                return this.this$0.params.getLayoutCoordinates();
            }
        }), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
    }

    public /* synthetic */ SelectionController(long j2, SelectionRegistrar selectionRegistrar, long j3, StaticTextSelectionParams staticTextSelectionParams, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, selectionRegistrar, j3, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? StaticTextSelectionParams.Companion.getEmpty() : staticTextSelectionParams, null);
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.selectable = this.selectionRegistrar.subscribe(new MultiWidgetSelectionDelegate(this.selectableId, new Function0<LayoutCoordinates>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController.onRemembered.1
            AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final LayoutCoordinates invoke() {
                return SelectionController.this.params.getLayoutCoordinates();
            }
        }, new Function0<TextLayoutResult>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController.onRemembered.2
            AnonymousClass2() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final TextLayoutResult invoke() {
                return SelectionController.this.params.getTextLayoutResult();
            }
        }));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.modifiers.SelectionController$onRemembered$1 */
    /* JADX INFO: compiled from: SelectionController.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!4i\bӵRш\r\u0006W\u0005^\ntJ֜&,\u0018w"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<LayoutCoordinates> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LayoutCoordinates invoke() {
            return SelectionController.this.params.getLayoutCoordinates();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.modifiers.SelectionController$onRemembered$2 */
    /* JADX INFO: compiled from: SelectionController.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!4i\bӵRш\r\u0006W\u0005^\ntJ֜&,\u0018w"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function0<TextLayoutResult> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextLayoutResult invoke() {
            return SelectionController.this.params.getTextLayoutResult();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    public final void updateTextLayout(TextLayoutResult textLayoutResult) {
        TextLayoutResult textLayoutResult2 = this.params.getTextLayoutResult();
        if (textLayoutResult2 != null && !Intrinsics.areEqual(textLayoutResult2.getLayoutInput().getText(), textLayoutResult.getLayoutInput().getText())) {
            this.selectionRegistrar.notifySelectableChange(this.selectableId);
        }
        this.params = StaticTextSelectionParams.copy$default(this.params, null, textLayoutResult, 1, null);
    }

    public final void updateGlobalPosition(LayoutCoordinates layoutCoordinates) {
        this.params = StaticTextSelectionParams.copy$default(this.params, layoutCoordinates, null, 2, null);
        this.selectionRegistrar.notifyPositionChange(this.selectableId);
    }

    public final void draw(DrawScope drawScope) {
        int offset;
        Selection selection = this.selectionRegistrar.getSubselections().get(this.selectableId);
        if (selection == null) {
            return;
        }
        if (!selection.getHandlesCrossed()) {
            offset = selection.getStart().getOffset();
        } else {
            offset = selection.getEnd().getOffset();
        }
        int offset2 = !selection.getHandlesCrossed() ? selection.getEnd().getOffset() : selection.getStart().getOffset();
        if (offset == offset2) {
            return;
        }
        Selectable selectable = this.selectable;
        int lastVisibleOffset = selectable != null ? selectable.getLastVisibleOffset() : 0;
        Path pathForRange = this.params.getPathForRange(RangesKt.coerceAtMost(offset, lastVisibleOffset), RangesKt.coerceAtMost(offset2, lastVisibleOffset));
        if (pathForRange == null) {
            return;
        }
        if (!this.params.getShouldClip()) {
            DrawScope.m4724drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
            return;
        }
        float fM4006getWidthimpl = Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc());
        float fM4003getHeightimpl = Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc());
        int iM4167getIntersectrtfAjoo = ClipOp.Companion.m4167getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4658clipRectN_I0leg(0.0f, 0.0f, fM4006getWidthimpl, fM4003getHeightimpl, iM4167getIntersectrtfAjoo);
            DrawScope.m4724drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
        }
    }
}
