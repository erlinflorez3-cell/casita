package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
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
/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLeV7Zݷ2\u000f\u0002{<$a$yCQU\"}(\tWNulvJ`\u000eK\u000f\u001c\u0016\u0001j2J]xk\u0012\u00172HoG3coEʠhtL\u0005(݅*8\u0010\u0005\t\u001a0P\u0016͌\u0011ŏ{\f@/pphR=M3\u001bB\u0006l\"A9lk\\9`l\f>?'\u0011nZNUe@\u0001[\u0014^TU\u0015țe\u001e9I\u007f;#<k\u00035j\"SKg\u007fV\u001dhU?[M\u0002qNX./E/])urTy5Un*?+}\u0003\u0012d̤'»ߡ\u007f\u000fB$\u001c'o`<O2f6&cx\u0001vXP0}\t\u0014Ҧ`اа)\u00029OG@/woa1Ne\u00145\u0011,&\u0019nO_\u0005\u0012n\u001a3T&WaUND`N8aȖlՎͲf\u00040+>oP;\n\u0016F\u0017S=2ހ/\u074co\u0002Pֳ8\u000b\u0013j\u0001S\u0018]\u001fؚ.Ļ\u0015ճӠ\b\u000bʑHf\rk^`)>\u001fZ4T5\f>Svςy˶%)(PUwwz\u001ei\u00186GfegE\u008b\u001aĆ=^;̐\"o\u001esjvBM\u0013ϸ\u0011ֽjB[ێ+h65JH\u0019$NӾF«\u0010\u0013:ŭB(BAI\u0019\u000b)\u001fҔ նE|\u0011ݠ+|\u001e\u0006l3R\u000b@ˈ\u0001נ\u007fˆ̍onς|K4|n8}M_81&\u0004&?ؗ\tɠ\u000b~{ÒûgUOOrח\u0012\u0004z(\u0016 X׀3f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T,?W\u0004~;i\u001d\u0017WB;A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r$@o~8LC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9xFz.DY\u000b\u0004@x&=5M:o5\"\u0015uJC\u0006c\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9kF~0?g\u0002/;w\u001f\u0015WA7r\u0012(\u001evqA\u0007p\u0014Xu+HPN9E\\q=i", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/EhY23z\u0016\u0016WB?l8\u001e\"Qk8\u00079", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006R.1`\b\"&q\u001e.8G9q4+\u0003w]H\u00079", "/tc<F>Bb\u0017\u0002ih\u0014\u0001\u0012?t\u007f", "", "Ad[2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;;CBk2-\u0019rj!\u0011b,$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0001>U\u0005*9\\\u001a6M.?i:\u001e\"Vp5\u0016c\u0002CZ\u000eMV]3`[<B%\u001a$\u0012W:\r\u0012b=+8#7 \u0004<P\u0011\u0019r\n\u001a%\u001bEh\u007fLcwC\u0007\u001buN~,7", "1d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "\u0018", ";`g\u0011\\:M", "", "5dc\u001aT?\u001dW'\u000e", "u(5", "=eU@X;1", "=eU@X;2", ">nX;g,K7\"\n\u000bm\u000b\n\u00051N\n'{", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001[&<XCDj8'\u0017Sk=\u0010r,[Z0R\\]\u0014fQv>\u0018\u0012gvX*\rZ", ">nX;g,K7\"\n\u000bm\u001bx\u0014\u0018o~(", "\u0017", "=m2.a*>Z\u0004\t~g;|\u0016\u0013n\u000b8\u000b", "", "=m?<\\5MS&^\f^5\f", ">nX;g,K3*~\u0004m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", ">`b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp$\u0003q:$", "0nd;W:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "=m?<\\5MS&^\f^5\fP\u00120\u000b\u0015\fJt", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjH\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N]J/~S\u0001*\u00120R\u0011;uJv \u0012>ypO6!G\u0003$`=7v\u001c>#j", "=mA2`,:a)\fz]", "Ahi2", "=mA2`,:a)\fz]s\u0007\u001e7zt\u0013_", "uI\u0018#", "CoS.g,']\u0018~", "CoS.g,']\u0018~B^~\r\u0006Brc", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0001>U\u0005*9\\\u001a6M.?i:\u001e\"Vp5\u0016c\u0002CZj8", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ClockDialNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private boolean autoSwitchToMinute;
    private long center;
    private float offsetX;
    private float offsetY;
    private final SuspendingPointerInputModifierNode pointerInputDragNode;
    private final SuspendingPointerInputModifierNode pointerInputTapNode;
    private int selection;
    private AnalogTimePickerState state;

    public /* synthetic */ ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(analogTimePickerState, z2, i2);
    }

    private ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z2, int i2) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z2;
        this.selection = i2;
        this.center = IntOffset.Companion.m6776getZeronOccac();
        this.pointerInputTapNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new ClockDialNode$pointerInputTapNode$1(this, null)));
        this.pointerInputDragNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new ClockDialNode$pointerInputDragNode$1(this, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getMaxDist() {
        return DelegatableNodeKt.requireDensity(this).mo710toPx0680j_4(TimePickerKt.MaxDistance);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public void mo700onRemeasuredozmzZPI(long j2) {
        this.center = IntSizeKt.m6814getCenterozmzZPI(j2);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo546onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.pointerInputTapNode.mo546onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
        this.pointerInputDragNode.mo546onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputTapNode.onCancelPointerInput();
        this.pointerInputDragNode.onCancelPointerInput();
    }

    /* JADX INFO: renamed from: updateNode-e8ubxrI, reason: not valid java name */
    public final void m1900updateNodee8ubxrI(AnalogTimePickerState analogTimePickerState, boolean z2, int i2) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z2;
        if (TimePickerSelectionMode.m2765equalsimpl0(this.selection, i2)) {
            return;
        }
        this.selection = i2;
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new ClockDialNode$updateNode$1(analogTimePickerState, null), 3, null);
    }
}
