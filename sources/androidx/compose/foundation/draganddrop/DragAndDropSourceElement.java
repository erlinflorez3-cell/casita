package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: DragAndDropSource.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"B\u0012\u007f\u0007tjA0ZeP\u008cZS@\u000fs{J$c$\bCCU(Ԃ*\tUXog|Sb\u000bI\u000f\u000e\u0016\u0007p4կ]xk\u001e\u00172HpG3coEʠfҞ<\u001bړb(H{\u0015\u0001H*v\u000f7@S`\u001a\u0013HQ\u0001<b\r{\b*\u0014\u0016>N\u0005L^ʄR6Nqm_=)\u001b\u000bHM7a@|{\u0015V\\7\u0013\u0007c.+n;c\u001e5W\u0013\thZm\rmxݘ\th-,ȅMseA!\u0018\"&C`\u001d_\u0003&\u000b\bab\u001c'YS\u0012Mח\u0012(}\u007fBɥ=L;\u00149`O3\u0019v\n\u001e3#zcH`\bnD\u0010z\u0010:E.\u00107;;1e\u007fki \u05ee;{\u000b\u0012dƇ\u0002ͼ%[b\u001b)g)g\u0010Q_҅pTNN\u0018ZU~\u0014rr\u0002X\u0007@I\u0010/*\u0015\\\u0019É;[?(Q\u0013\bHRm\u000f&fgckbHn*~\u001eG0\u0019\u000ejD\u0013\t\u001aYd\\<\u0013c\u001b\u0003\u0011,\u000f˙$\\}Agپ\u000fʽShw~\u0016c\u0018:GfeY5\u007fVhGtK5\u007fz@g`\u000f,ARa3b-ΒTTajA:2v\u0005VɅz\rU\u001a.J? 8zА0aj#e\u001b\u001epE-\rmx\u0001\u0010-Ty8Ks2\u0014!\u0001~`\u0019o\u0016\u0019\u0010@M\u001303Yr;\u00186W2hb\u00053\u000f\u000fy\u0010IwLuP\u001b\u001f\u0006Y\f\",\u0019g[]Dт\u0013~/7ī1MTrs_e\u0014-\u0007\u000b\u0007_[v/\u007f\u0019zr<`\u0019M_V'\"%b!%ϋh\u007f\u007ffâ~MkҺ#]DX\u0001\u0013˄@o"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@$BU\u007f\u001c@l\u0015;WN\u0005JA\u001a\u0017Dj8ep6Yd1WYL,<YrE\u0014\u001bic", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@$BU\u007f\u001c@l\u0015;WN\u0005JA\u001a\u0017Dj8ep6Yd1WYL,E\\q=i", "2qPD79:Uw~xh9x\u00183o\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "2qP445=2&\t\u0006L6\r\u0016-eb$\u0005?\b\u0017$", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@$BU\u007f\u001c@l\u0015;WN\u0005JA\u001a\u0017Dj8ep6Yd1WYL,JP|H\u0014g", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0Q?", "5dc\u0011e(@/\"}Yk6\bv9u\r&{#| \u0016No\u001b", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0002/", "5dc\u0011e(P2&z|=,z\u0013<a\u000f,\u0006I", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0Q5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\r \u001e>ilQZ\u001aPC\u0014\u0003=+dOX^\u0007QL\u000fA7`\u000e;&[\u0019G.\u001f_#+uN.i\u0003S\u0019r[\t=", "1qT.g,", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "CoS.g,", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class DragAndDropSourceElement extends ModifierNodeElement<DragAndDropSourceNode> {
    private final Function2<DragAndDropSourceScope, Continuation<? super Unit>, Object> dragAndDropSourceHandler;
    private final Function1<DrawScope, Unit> drawDragDecoration;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DragAndDropSourceElement copy$default(DragAndDropSourceElement dragAndDropSourceElement, Function1 function1, Function2 function2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            function1 = dragAndDropSourceElement.drawDragDecoration;
        }
        if ((i2 & 2) != 0) {
            function2 = dragAndDropSourceElement.dragAndDropSourceHandler;
        }
        return dragAndDropSourceElement.copy(function1, function2);
    }

    public final Function1<DrawScope, Unit> component1() {
        return this.drawDragDecoration;
    }

    public final Function2<DragAndDropSourceScope, Continuation<? super Unit>, Object> component2() {
        return this.dragAndDropSourceHandler;
    }

    public final DragAndDropSourceElement copy(Function1<? super DrawScope, Unit> function1, Function2<? super DragAndDropSourceScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new DragAndDropSourceElement(function1, function2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceElement)) {
            return false;
        }
        DragAndDropSourceElement dragAndDropSourceElement = (DragAndDropSourceElement) obj;
        return Intrinsics.areEqual(this.drawDragDecoration, dragAndDropSourceElement.drawDragDecoration) && Intrinsics.areEqual(this.dragAndDropSourceHandler, dragAndDropSourceElement.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.drawDragDecoration.hashCode() * 31) + this.dragAndDropSourceHandler.hashCode();
    }

    public String toString() {
        return "DragAndDropSourceElement(drawDragDecoration=" + this.drawDragDecoration + ", dragAndDropSourceHandler=" + this.dragAndDropSourceHandler + ')';
    }

    public final Function1<DrawScope, Unit> getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    public final Function2<DragAndDropSourceScope, Continuation<? super Unit>, Object> getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropSourceElement(Function1<? super DrawScope, Unit> function1, Function2<? super DragAndDropSourceScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.drawDragDecoration = function1;
        this.dragAndDropSourceHandler = function2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DragAndDropSourceNode create() {
        return new DragAndDropSourceNode(this.drawDragDecoration, this.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DragAndDropSourceNode dragAndDropSourceNode) {
        dragAndDropSourceNode.setDrawDragDecoration(this.drawDragDecoration);
        dragAndDropSourceNode.setDragAndDropSourceHandler(this.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSource");
        inspectorInfo.getProperties().set("drawDragDecoration", this.drawDragDecoration);
        inspectorInfo.getProperties().set("dragAndDropSourceHandler", this.dragAndDropSourceHandler);
    }
}
