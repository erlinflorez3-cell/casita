package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.node.PointerInputModifierNode;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: Hoverable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jAӄLeV.ZS0\u0013s{J$cҕyCQU\"Ԃ*\teNogtM`\u000bYƤ6\u0016'i\\I\u0004x\u001e\u001d\u001f6PpW3{qެ=`\u00039M,@(Py3\b`ݕ\u0007ǘzzQST\u001e>I\t:\u0001\u0014\u0014īXŪ\n>.\tfbuXNH\u001bd\u0001Ck\twMf'\u000e7CaUnb3%v\u0010%[DEB-%\u0002\u00117ViN\u001b? M5l58CI\"i|lŕ\u0013ƃۣS\u000fc\u00064pMWn!?+}j\u0012PV4\u0006\u0011\u0014\rj\u000b>\n5IF-HhX\u001cAx\u000bUVO0c\u0019Ș\u0007ˋ:\u0017-Į\u00047G\u001c~Q\u0010=o\u05ceC߉\t\r&ŀЪn&cW\u0014\u05cd1ISɖUH"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\b?j}-3j\u001d.6M:k\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9xFz.DY\u000b\u0004@x&=5M:o5\"\u0015uJC\u0006c\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u001c.$d^@\u0007G5]v4CJ]0f[`G$\u001fX\u000e$n}", "6ne2e\u0010Gb\u0019\fv\\;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005N>/\u0015uEB\u0016c9Jt6KVWj<[\u0002=!g", "3lXA85MS&", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "3lXA8?Bb", "=m2.a*>Z\u0004\t~g;|\u0016\u0013n\u000b8\u000b", "=m32g(<V", "=m?<\\5MS&^\f^5\f", ">nX;g,K3*~\u0004m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", ">`b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp$\u0003q:$", "0nd;W:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "=m?<\\5MS&^\f^5\fP\u00120\u000b\u0015\fJt", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjH\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N]J/~S\u0001*\u00120R\u0011;uJv \u0012>ypO6!G\u0003$`=7v\u001c>#j", "Bqh\u0012`0M3,\u0003\n", "CoS.g,\"\\(~\bZ*\f\r9nm2\fM~\u0017", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class HoverableNode extends Modifier.Node implements PointerInputModifierNode {
    private HoverInteraction.Enter hoverInteraction;
    private MutableInteractionSource interactionSource;

    /* JADX INFO: renamed from: androidx.compose.foundation.HoverableNode$emitEnter$1 */
    /* JADX INFO: compiled from: Hoverable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fLg\u0010\u0018\b\u0016\u0006\b\u0013\rv\u0019\u000f\u0011", f = "\u0015;A/;))2*q.6", i = {0, 0}, l = {111}, m = "4=:F\u0018BI;I", n = {"c^kY", "XdvKdWE[?IT"}, s = {"xQ^", "xQ_"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return HoverableNode.this.emitEnter(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.HoverableNode$emitExit$1 */
    /* JADX INFO: compiled from: Hoverable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fLg\u0010\u0018\b\u0016\u0006\b\u0013\rv\u0019\u000f\u0011", f = "\u0015;A/;))2*q.6", i = {0}, l = {PanasonicMakernoteDirectory.TAG_BURST_SPEED}, m = "4=:F\u0018L>J", n = {"c^kY"}, s = {"xQ^"})
    static final class C04291 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C04291(Continuation<? super C04291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HoverableNode.this.emitExit(this);
        }
    }

    public HoverableNode(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    public final void updateInteractionSource(MutableInteractionSource mutableInteractionSource) {
        if (Intrinsics.areEqual(this.interactionSource, mutableInteractionSource)) {
            return;
        }
        tryEmitExit();
        this.interactionSource = mutableInteractionSource;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo546onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        if (pointerEventPass == PointerEventPass.Main) {
            int iM5327getType7fucELk = pointerEvent.m5327getType7fucELk();
            if (PointerEventType.m5334equalsimpl0(iM5327getType7fucELk, PointerEventType.Companion.m5338getEnter7fucELk())) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new HoverableNode$onPointerEvent$1(this, null), 3, null);
            } else if (PointerEventType.m5334equalsimpl0(iM5327getType7fucELk, PointerEventType.Companion.m5339getExit7fucELk())) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new HoverableNode$onPointerEvent$2(this, null), 3, null);
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        tryEmitExit();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        tryEmitExit();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emitEnter(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.HoverableNode.AnonymousClass1
            if (r0 == 0) goto L56
            r5 = r7
            androidx.compose.foundation.HoverableNode$emitEnter$1 r5 = (androidx.compose.foundation.HoverableNode.AnonymousClass1) r5
            int r0 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L56
            int r0 = r5.label
            int r0 = r0 - r2
            r5.label = r0
        L19:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 != r3) goto L5c
            java.lang.Object r2 = r5.L$1
            androidx.compose.foundation.interaction.HoverInteraction$Enter r2 = (androidx.compose.foundation.interaction.HoverInteraction.Enter) r2
            java.lang.Object r0 = r5.L$0
            androidx.compose.foundation.HoverableNode r0 = (androidx.compose.foundation.HoverableNode) r0
            kotlin.ResultKt.throwOnFailure(r1)
        L31:
            r0.hoverInteraction = r2
        L33:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L36:
            kotlin.ResultKt.throwOnFailure(r1)
            androidx.compose.foundation.interaction.HoverInteraction$Enter r0 = r6.hoverInteraction
            if (r0 != 0) goto L33
            androidx.compose.foundation.interaction.HoverInteraction$Enter r2 = new androidx.compose.foundation.interaction.HoverInteraction$Enter
            r2.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r6.interactionSource
            r0 = r2
            androidx.compose.foundation.interaction.Interaction r0 = (androidx.compose.foundation.interaction.Interaction) r0
            r5.L$0 = r6
            r5.L$1 = r2
            r5.label = r3
            java.lang.Object r0 = r1.emit(r0, r5)
            if (r0 != r4) goto L54
            return r4
        L54:
            r0 = r6
            goto L31
        L56:
            androidx.compose.foundation.HoverableNode$emitEnter$1 r5 = new androidx.compose.foundation.HoverableNode$emitEnter$1
            r5.<init>(r7)
            goto L19
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.emitEnter(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emitExit(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.HoverableNode.C04291
            if (r0 == 0) goto L50
            r5 = r7
            androidx.compose.foundation.HoverableNode$emitExit$1 r5 = (androidx.compose.foundation.HoverableNode.C04291) r5
            int r0 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L50
            int r0 = r5.label
            int r0 = r0 - r2
            r5.label = r0
        L19:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L33
            if (r0 != r2) goto L56
            java.lang.Object r1 = r5.L$0
            androidx.compose.foundation.HoverableNode r1 = (androidx.compose.foundation.HoverableNode) r1
            kotlin.ResultKt.throwOnFailure(r4)
        L2d:
            r0 = 0
            r1.hoverInteraction = r0
        L30:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L33:
            kotlin.ResultKt.throwOnFailure(r4)
            androidx.compose.foundation.interaction.HoverInteraction$Enter r0 = r6.hoverInteraction
            if (r0 == 0) goto L30
            androidx.compose.foundation.interaction.HoverInteraction$Exit r1 = new androidx.compose.foundation.interaction.HoverInteraction$Exit
            r1.<init>(r0)
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = r6.interactionSource
            androidx.compose.foundation.interaction.Interaction r1 = (androidx.compose.foundation.interaction.Interaction) r1
            r5.L$0 = r6
            r5.label = r2
            java.lang.Object r0 = r0.emit(r1, r5)
            if (r0 != r3) goto L4e
            return r3
        L4e:
            r1 = r6
            goto L2d
        L50:
            androidx.compose.foundation.HoverableNode$emitExit$1 r5 = new androidx.compose.foundation.HoverableNode$emitExit$1
            r5.<init>(r7)
            goto L19
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.emitExit(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void tryEmitExit() {
        HoverInteraction.Enter enter = this.hoverInteraction;
        if (enter != null) {
            this.interactionSource.tryEmit(new HoverInteraction.Exit(enter));
            this.hoverInteraction = null;
        }
    }
}
