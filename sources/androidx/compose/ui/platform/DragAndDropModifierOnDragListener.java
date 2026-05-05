package androidx.compose.ui.platform;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.ArraySet;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.ModifierNodeElement;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яh\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"B\u0012\u007f\u0007|jA0JeP.hS2şs{J$c$\bCCU(}*\teNo˧vJh\u0014K\u000f\f\u0016\u0001jBI]xs\u0012\u0017˰JoU3UoC:htL\u0005(2(=\u0002\u0005\u0017\u001a2Ϻ\u0018v\u0011CS\f\u00180FpPĥ=M3\u0019B\u0006l A\u007flB\\7`CmK?21lŌR1e4\rS\u0013Kd)\u0013|\b$;QGDC,٨\u0007\u0011X_O\tEvM\u0007n-M3Y\u0016gVh\u0002$\u0015YY\u001d_\u0003&\u000b\u0010\u007fiВ++UoׂT\u0018.{\u000b\u0002\u0013A\u0014\u0010\f-n;=\u001cv\b<A#tՂDP\u0010m\u000b9\tzN\u0017S\u000ec/G!~Q\u0010>IRE\u0004\u001d\rL*1\u0004/hl\u001fp\u0017+T&[ASP=vY8bǀq\u0004vnH>̯/ϚĬ3}\u0017H%@\u007fiG?9k0Vtk\u0005\"xh\u0002{\u0019\\\t8|4O*7\u001a\u000bHr$\u0004P\u0003x\\\u0015[=l\u0007,*Y4%\u0006JD=\u0010|Z\u0019mxju\nSA-K*\u0001y\u001eo?n5EQ\u0012\"\u0010cMܠAםf\u0005`٨\u0013e\u001amt(PF\u001fб\u0012ȑ\u007fJVۼ+4E\u0007*J|='s-H16\u0019ˉ~ȤcZpɭO7A%\u001b@4\u0006\u0019\u0010~_ʼsq~M<\u0003f'=CW;?,e3xC+*ȷ\u0003}\u0006KwRMQ|\u0018{[\"(&<Iq??#\u000f-3B\u0004=Ez}\u0014Z̊\u0016'\u0001\tɍ\u0013En2w\u000epu<bpPua'$\u0007^!16fVכcâ~GkҺޯ[CQu\tʽX|7ٱ\tC"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0014fy\"\u0013v\u0015\rZMFS>\u001d\u0019ie9\u0014M5-\u0004#I3R:kR{=!g", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feI_$\u0013IV\u0012J\u0006%>Y\u000bu", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Ik\u0017;u2?dG~Di\u0018\nVB\u001ax>)|dj5\tc9$", "AsP?g\u000bKO\u001b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Ik\u0017;u2?dG~Di\u0018\nVB\u001ax>)\u0004u]B\u0015d,[U#VH$", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "BqP;f->`wz\nZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "2dR<e(MW#\bhbA|", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "2qPD79:Uw~xh9x\u00183o\t", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'Sc(", "7mc2e,Lb\u0019}ch+|\u0017", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\n\\$$C\u0004{<\u0006z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Ik\u0017;u2?dG~Di\u0018\nVB\u001ax>)|r`=\bg,[_1FL$", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "5dc\u001ab+BT\u001d~\b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/", "@n^A79:Ut\by=9\u0007\u0014\u0018o~(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Ik\u0017;u2?dG~Di\u0018\nVB\u001ax>)}r`9\\", "2qP4", "2qP4 w\u000bAyRYF", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0016$Cq\nEu$Bc\ti\u0016z\u00120)L:JA( Wn5\u0010q-N\u0004\u0006C[J\u0002A9xG#\u0019^\u0017\u00180\u001e\r#B4wBF#\u00125WK\u001cx\n\n%\u0012?s<\u0018\u001a\u0005", "7r8;g,KS'\u000ez]\u0015\u0007\b/", "<nS2", "=m3?T.", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fg<a\u0002\b\r@\n&l", "@dV6f;>`\u0002\ty^\u0010\u0006\u0018/r\u007f6\u000b", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class DragAndDropModifierOnDragListener implements View.OnDragListener, DragAndDropManager {
    private final Function3<DragAndDropTransferData, Size, Function1<? super DrawScope, Unit>, Boolean> startDrag;
    private final DragAndDropNode rootDragAndDropNode = new DragAndDropNode(new Function1<DragAndDropEvent, DragAndDropTarget>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$rootDragAndDropNode$1
        @Override // kotlin.jvm.functions.Function1
        public final DragAndDropTarget invoke(DragAndDropEvent dragAndDropEvent) {
            return null;
        }
    });
    private final ArraySet<DragAndDropModifierNode> interestedNodes = new ArraySet<>(0, 1, null);
    private final Modifier modifier = new ModifierNodeElement<DragAndDropNode>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(DragAndDropNode dragAndDropNode) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public DragAndDropNode create() {
            return this.this$0.rootDragAndDropNode;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootDragAndDropNode");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return this.this$0.rootDragAndDropNode.hashCode();
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropModifierOnDragListener(Function3<? super DragAndDropTransferData, ? super Size, ? super Function1<? super DrawScope, Unit>, Boolean> function3) {
        this.startDrag = function3;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent dragEvent) {
        DragAndDropEvent dragAndDropEvent = new DragAndDropEvent(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean zAcceptDragAndDropTransfer = this.rootDragAndDropNode.acceptDragAndDropTransfer(dragAndDropEvent);
                Iterator<DragAndDropModifierNode> it = this.interestedNodes.iterator();
                while (it.hasNext()) {
                    it.next().onStarted(dragAndDropEvent);
                }
                break;
            case 2:
                this.rootDragAndDropNode.onMoved(dragAndDropEvent);
                break;
            case 4:
                this.rootDragAndDropNode.onEnded(dragAndDropEvent);
                break;
            case 5:
                this.rootDragAndDropNode.onEntered(dragAndDropEvent);
                break;
            case 6:
                this.rootDragAndDropNode.onExited(dragAndDropEvent);
                break;
        }
        return false;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    /* JADX INFO: renamed from: drag-12SF9DM */
    public boolean mo3808drag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j2, Function1<? super DrawScope, Unit> function1) {
        return this.startDrag.invoke(dragAndDropTransferData, Size.m3994boximpl(j2), function1).booleanValue();
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public void registerNodeInterest(DragAndDropModifierNode dragAndDropModifierNode) {
        this.interestedNodes.add(dragAndDropModifierNode);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public boolean isInterestedNode(DragAndDropModifierNode dragAndDropModifierNode) {
        return this.interestedNodes.contains(dragAndDropModifierNode);
    }
}
