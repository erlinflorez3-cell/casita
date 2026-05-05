package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
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
/* JADX INFO: compiled from: PointerInputEventProcessor.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.`\\2şs{J$c$wDCU(}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0015\u0015˰Xģo3{n}DpxD\u000582P9ѩ\t\u0001(,\u0011\u0014\u0005\b[K: xk~Ij\r{\u0015J\u0016\u0014O8\u0001Ln\u0018RD[\u0005]hCS\toB\\<w0+UЮEÖބ\fuҐ\"-FMC,mW\u0011\u001fj[m\u0011\u0010}K\b\u0001'U/ ֘Y͏\\\u007f\u001cƃ{[\u001bb\u000b&\u000b\u000b(ӣ\u000eˏ/Ok֟!\u001a6~\u0013{;DZ\u05fd\u0012όL.5Կ7\u0014\u001c<\rr\u0002J'؟`۰\u0004ziاg4\u000e3C9IgЂeA!\u05cbO}\u000b\u0018,/Ъn*cT\u0014\u007f\u001d\u001eZɏm_P͞Aa"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0019\u0018c5]a4QJN:j\\\u007f\u0013", "", "@n^A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u0004\u00114", "6hc\u001dT;AB&zxd,\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001P\u001a=8?Jn#+\u0011fg9\u00149", "6hc\u001fX:NZ(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9p@\u0006\u00145g\r\r7{&5\\\u0019", "7r??b*>a'\u0003\u0004`", "", ">nX;g,K7\"\n\u000bm\n\u007f\u00058g\u007f\b\r@\n&\u0002Ty\rLt%B", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv\u0007XLW;G_|<$\u0010Z\u001b$", "5dc\u001fb6M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.#", "1kT.e\u0017KS*\u0003\u0005n:\u0004\u001d\u0012i\u000f\u0010\u0006?\u0005\u0018\u001bG|vFu%C", "", ">q^0X:L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X#8KCIy!\u001e#xhH\\", ">nX;g,K3*~\u0004m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0019\u0018c5]L", ">nb6g0H\\vz\u0002\\<\u0004\u0005>o\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X <QR?u={\u0011o_I\u000e_;X\u0004|", "7r8;56N\\\u0018\r", ">q^0X:L\u001bub\u0010Q-\u0007\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHft,W\u0006|.HW+i\\v<'[X\u0018V6\u0017\u0013Y\u000b4r\u000e;(\u0013<XKFr\u0005\u0015%\u000eB4[Ld\u0014V}\u001f~\u001f%oDifuVKR8\u001f(o", ">q^0X:L1\u0015\bx^3", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PointerInputEventProcessor {
    public static final int $stable = 8;
    private final HitPathTracker hitPathTracker;
    private boolean isProcessing;
    private final LayoutNode root;
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer = new PointerInputChangeEventProducer();
    private final HitTestResult hitResult = new HitTestResult();

    public PointerInputEventProcessor(LayoutNode layoutNode) {
        this.root = layoutNode;
        this.hitPathTracker = new HitPathTracker(layoutNode.getCoordinates());
    }

    public final LayoutNode getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: process-BIzXfog$default, reason: not valid java name */
    public static /* synthetic */ int m5406processBIzXfog$default(PointerInputEventProcessor pointerInputEventProcessor, PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        return pointerInputEventProcessor.m5407processBIzXfog(pointerInputEvent, positionCalculator, z2);
    }

    /* JADX INFO: renamed from: process-BIzXfog, reason: not valid java name */
    public final int m5407processBIzXfog(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z2) {
        boolean z3;
        if (this.isProcessing) {
            return PointerInputEventProcessorKt.ProcessResult(false, false);
        }
        boolean z4 = true;
        try {
            this.isProcessing = true;
            InternalPointerEvent internalPointerEventProduce = this.pointerInputChangeEventProducer.produce(pointerInputEvent, positionCalculator);
            int size = internalPointerEventProduce.getChanges().size();
            for (int i2 = 0; i2 < size; i2++) {
                PointerInputChange pointerInputChangeValueAt = internalPointerEventProduce.getChanges().valueAt(i2);
                if (!pointerInputChangeValueAt.getPressed() && !pointerInputChangeValueAt.getPreviousPressed()) {
                }
                z3 = false;
                break;
            }
            z3 = true;
            int size2 = internalPointerEventProduce.getChanges().size();
            for (int i3 = 0; i3 < size2; i3++) {
                PointerInputChange pointerInputChangeValueAt2 = internalPointerEventProduce.getChanges().valueAt(i3);
                if (z3 || PointerEventKt.changedToDownIgnoreConsumed(pointerInputChangeValueAt2)) {
                    LayoutNode.m5662hitTestM_7yMNQ$ui_release$default(this.root, pointerInputChangeValueAt2.m5385getPositionF1C5BW0(), this.hitResult, PointerType.m5457equalsimpl0(pointerInputChangeValueAt2.m5388getTypeT8wyACA(), PointerType.Companion.m5464getTouchT8wyACA()), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.m5313addHitPathQJqDSyo(pointerInputChangeValueAt2.m5383getIdJ3iCeTQ(), this.hitResult, PointerEventKt.changedToDownIgnoreConsumed(pointerInputChangeValueAt2));
                        this.hitResult.clear();
                    }
                }
            }
            this.hitPathTracker.removeDetachedPointerInputNodes();
            boolean zDispatchChanges = this.hitPathTracker.dispatchChanges(internalPointerEventProduce, z2);
            if (!internalPointerEventProduce.getSuppressMovementConsumption()) {
                int size3 = internalPointerEventProduce.getChanges().size();
                for (int i4 = 0; i4 < size3; i4++) {
                    PointerInputChange pointerInputChangeValueAt3 = internalPointerEventProduce.getChanges().valueAt(i4);
                    if (PointerEventKt.positionChangedIgnoreConsumed(pointerInputChangeValueAt3) && pointerInputChangeValueAt3.isConsumed()) {
                        break;
                    }
                }
            }
            z4 = false;
            return PointerInputEventProcessorKt.ProcessResult(zDispatchChanges, z4);
        } finally {
            this.isProcessing = false;
        }
    }

    public final void processCancel() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.clear();
        this.hitPathTracker.processCancel();
    }

    public final void clearPreviouslyHitModifierNodes() {
        this.hitPathTracker.clearPreviouslyHitModifierNodeCache();
    }
}
