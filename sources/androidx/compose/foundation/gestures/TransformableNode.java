package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
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
/* JADX INFO: compiled from: Transformable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012\u000e\u0007njG9LeN0ZS@\u000fs{J$cҕyCQU\"}(\tWNugvϺ`\u000bYƤ6\u0016'ilxe|k\u0012'2ppOC[qUEpvF\u0005N62:\n\u0005/\u001fXK z\tIc\f@5PtHY%M3\u001fŪ\n>.\tf\ru]NH\u001bmj31\u0003\u0002B|(\u0010@\u000bO%Rd)\u001dv\u0010\";BG5C*\u0002\u00067ViE\u001b? B5l5.CI\"\\\u0007p\u000e\u0016-7_\u000fmrT`\u0015Sp\fU0}f\"ַ\u001a߭{z\u0004Ȟ\r\u0016\u001c\u000f?N>/*f6\u0019a~IԢBг\u0006^JȕKmD\u001e=\u007fa0\u0010ӘrЂe;!\u05cb\b\b\u0013\u00136#/swſ`\u05f8d\u0015#ƘH]?]X=v[`Բ?ъ\bpj̣z\u0010>G\u0018/*\u0012\u0005ϒ1ھ_9+ܩ<\u001aVR\u007f\u0003\u0015bxS\u0018VXB2nD<X\fbɱF\u0081\tkXӹй0\""}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<P7tB\u001f\u001fui5\u0004j,7\u0001&G\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r$@o~8LC\u0011", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<P7tB\u001f\u001fui5\u0004j,<\u0006#VL$", "1`]\u001dT5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "", ":nR8E6MO(\u0003\u0005g\u0016\u0006}9o\b\u0013wI", "3mP/_,=", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u00172Hg=,\u0016rnA\u0003`3Nd6C[N\u0002CX|L\u001b\u0016cWS<\u0015NZQ-lS;)\u0011:\u0013bKq~\u001b\u001a\u0018>6F7KS8", "1gP;a,E", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7tk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<P7tB\u001f\u001fui\u0019\u0018c5]L", ">nX;g,K7\"\n\u000bm\u0015\u0007\b/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001[&<XCDj8'\u0017Sk=\u0010r,[Z0R\\]\u0014fQv>\u0018\u0012gvX*\rZ", "CoS.g,=1\u0015\beZ5", "CoS.g,", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class TransformableNode extends DelegatingNode {
    private Function1<? super Offset, Boolean> canPan;
    private boolean enabled;
    private boolean lockRotationOnZoomPan;
    private TransformableState state;
    private final Function1<Offset, Boolean> updatedCanPan = new Function1<Offset, Boolean>() { // from class: androidx.compose.foundation.gestures.TransformableNode$updatedCanPan$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Offset offset) {
            return m849invokek4lQ0M(offset.m3947unboximpl());
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final Boolean m849invokek4lQ0M(long j2) {
            return (Boolean) this.this$0.canPan.invoke(Offset.m3926boximpl(j2));
        }
    };
    private final Channel<TransformEvent> channel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new TransformableNode$pointerInputNode$1(this, null)));

    public TransformableNode(TransformableState transformableState, Function1<? super Offset, Boolean> function1, boolean z2, boolean z3) {
        this.state = transformableState;
        this.canPan = function1;
        this.lockRotationOnZoomPan = z2;
        this.enabled = z3;
    }

    public final void update(TransformableState transformableState, Function1<? super Offset, Boolean> function1, boolean z2, boolean z3) {
        this.canPan = function1;
        if (Intrinsics.areEqual(this.state, transformableState) && this.enabled == z3 && this.lockRotationOnZoomPan == z2) {
            return;
        }
        this.state = transformableState;
        this.enabled = z3;
        this.lockRotationOnZoomPan = z2;
        this.pointerInputNode.resetPointerInputHandler();
    }
}
