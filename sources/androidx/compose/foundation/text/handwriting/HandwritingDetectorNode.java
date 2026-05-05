package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: HandwritingDetector.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\":\u0012\u007f\u0007lmA0ZeP.XV2\u000f\u0002{<$a'yCQU\"Ԃ*\teNo˧vJp\u000bK\u000f\f\u0017~jBկ\u0006x\f\u0011?2po\u007fD]yK:xzF\u000702P;(\u0007в\u001e*V\u0014?\u0001Q]$\u0012^C7N\u001b5[\u00182\u00124AP\u0005,p\u007fNd]\u001daHE;\u0003\u0018Y~+mH\u0015M;_\u001b;͒uѭӿ/B=O#@$!\u0015SsE\u0013A\u0002=3kU)\u0002ɥ\u007fɱ:d\bϬ--U\u0012kxF^\u000bXn\u0010wD]kcP<1.;Rȡɢ\u0004؝\n1P03&t\u0015&5z|aK!\u0011lP\u0018z\u0010Eа)\u0006;ٿQ\u001dlaoLύN<\u0004\b\u0013̶?/mĸ_p"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri:i\u001f-_P?z8'\u00172D5\u0010b>[z6KUP\u000b\\ar;#\u001cgvX*\rZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r$@o~8LC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9xFz.DY\u000b\u0004@x&=5M:o5\"\u0015uJC\u0006c\u0002", "1`[9U(<Y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "5dc\u0010T3EP\u0015|\u0001", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Adc\u0010T3EP\u0015|\u0001", "1n\\=b:>7!\u0007", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PA6V\u00021UL25gb\u0002%\u0014!]\u0018M\u0013\t\u000eUC${\u001a", "5dc\u0010b4I]'~^f4", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju,\u0001/RV\\,@[}M#yZ\u001dQ5\flUJ pDDt", "1n\\=b:>7!\u00079],\u0004\t1a\u000f(", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", ">nX;g,K7\"\n\u000bm\u0015\u0007\b/", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri:i\u001f-_P?z8'\u00172OH\u001bj<\\Y#PK`9`avF\u0016zd\rN\u001d\u0011\u0014\\*$p@F#\u0019,4}:g\u0005\u0015\u0018c", "5dc\u001db0Gb\u0019\f^g7\r\u0018\u0018o~(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u0019*VBMx8-\u0019qc\u0003tr@U\u00075*HW+n_vL\u0018\u001b\\vX*\rv]P'WD9\u001b\u00170Z\u0002&d\u007f\u000b\u001a\u00177@", "=m2.a*>Z\u0004\t~g;|\u0016\u0013n\u000b8\u000b", "=m?<\\5MS&^\f^5\f", ">nX;g,K3*~\u0004m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", ">`b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp$\u0003q:$", "0nd;W:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "=m?<\\5MS&^\f^5\fP\u00120\u000b\u0015\fJt", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjH\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N]J/~S\u0001*\u00120R\u0011;uJv \u0012>ypO6!G\u0003$`=7v\u001c>#j", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class HandwritingDetectorNode extends DelegatingNode implements PointerInputModifierNode {
    private Function0<Unit> callback;
    private final Lazy composeImm$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ComposeInputMethodManager>() { // from class: androidx.compose.foundation.text.handwriting.HandwritingDetectorNode$composeImm$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ComposeInputMethodManager invoke() {
            return ComposeInputMethodManager_androidKt.ComposeInputMethodManager(DelegatableNode_androidKt.requireView(this.this$0));
        }
    });
    private final StylusHandwritingNodeWithNegativePadding pointerInputNode = (StylusHandwritingNodeWithNegativePadding) delegate(new StylusHandwritingNodeWithNegativePadding(new Function0<Boolean>() { // from class: androidx.compose.foundation.text.handwriting.HandwritingDetectorNode$pointerInputNode$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.this$0.getCallback().invoke();
            this.this$0.getComposeImm().prepareStylusHandwritingDelegation();
            return true;
        }
    }));

    public HandwritingDetectorNode(Function0<Unit> function0) {
        this.callback = function0;
    }

    public final Function0<Unit> getCallback() {
        return this.callback;
    }

    public final void setCallback(Function0<Unit> function0) {
        this.callback = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposeInputMethodManager getComposeImm() {
        return (ComposeInputMethodManager) this.composeImm$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo546onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.pointerInputNode.mo546onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    public final StylusHandwritingNodeWithNegativePadding getPointerInputNode() {
        return this.pointerInputNode;
    }
}
