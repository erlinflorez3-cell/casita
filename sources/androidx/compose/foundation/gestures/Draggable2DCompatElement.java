package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Velocity;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import io.sentry.protocol.SentryThread;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: Draggable2D.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\u0010nʑA0ZeP.XS2\u000f\u0002{<$q$yCQU\"}8\tWNmgvJp\u000bK\u000f\u0014\u0016\u0001j:կ]xs\u0012\u0017˰JoU3UoC?htD\u000b(2(9\u0002\u0005\u0017\u001a2H\u0016v\u0001ŏaÈ0RpvJT\u001dM3\u001a@\u0005v\u001f#^֝f^:Vmu:]%\u0013mPQ?_^\u0001]\u0013TY?\u000f\r`L1P;C\u001c=S1\u000bb\u0016M\u000bW(C\u0004x)7+w}gGh\u000fB ۣS\u0017c~6b\u000b^p\u000e-1uq[X\u001e.\b|\f\rj\u0014<\u00157L>/0e6\u001fa}ɤW@V\u0014n|\u000e\u000eyl\u001d$\u00105;9IparK(|K߉\t\u0017$/\u0011t'hd\u0010f\u001bAi\bYAWP?XN8ik|\u0014tr\u0004@\u0003^X.8ɨ\u0015.\u001d7G_G99k0Lזkv\u0013w1Ywk`@Pn\\Kr\u001a\u001at\\d3o\u0001ZfG)O2S5\u000fNˍ %}J==\u0010|l/}3[k(=/\u0015G\nry-o9\r3{e,\u001aor\u000f\u0014mL\u000b\u0005\u0007\b\tg\\fj+:2vnfǱ}ΌR\f\u001bԵ\u0010\u007f*9D3/[CNYٟD˩\u0001\tgʳ9T\r\\KZ\th4v\u0019\u0001~f\u0001\u0001w\bw7ʬd,3Ma;\u001f3e$n:#1\u0017\u0007\u0004\u0006Wi\\Gz|D\u0005e\u007f0\u001808\u007f@k\u001cä\u0003)8\u0014\u0004թNȌiSU\u00125\u0013M>\u001dN\u0001dm\u0007zr<`\u0019T_e'1%rѓ'\u0012j\f\ngL\bWeZ\u0011\u0002SYz\u0013_LPH|3/L4\u0011s2~K,q8K\u001f߳\u0018/\u001bs4ɓqЦ}d\u0017&\u0003}T8q,\bb\u007fa\tձ:ա]~FЭtx\u0011I`j&\f\u0019މ6٢7HIЬAbFN#/,h]\u0530\u000f\u0080Z[Bܤ̳\u0002W"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0006eA6V\u0002#V,U,dR{Li", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0006eL6Mv|", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0006eQ;J\u0006'\u001d", "3mP/_,=", "", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "AsP?g\u000bKO\u001bb\u0003f,{\r+t\u007f/\u0010", "=m3?T.,b\u0015\f\n^+", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "AsP?g,=>#\r~m0\u0007\u0012", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "=m3?T.,b#\n\u0006^+", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "Dd[<V0Mg", "@de2e:>2\u001d\fz\\;\u0001\u00138", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017\"Hg6 \u0011eh9SB\u001a]r6G\"C\u0013X[qJ\u001e\u0016Y!\u0018)\u0017\rdK2n\u000e8)\u00185H}Jl\u000b\u0015_\u0012>ypOR\u000eV}\u001f~\u000b\u0011xUU\\\u0001G%Nq*q\b],`DC\u0012\u001e\u0002&\u0019h&#p\u0002] yV\u00031lX!D94GkjJOxc\u0006U7(I\u000b{\u001c;&J\u0012z7\u0013;.?.\n\\oa?n\u0002\u0013;`K04\u007f\u001d#HIryvG[>\u0014%x", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0003/", "1qT.g,", "3pd._:", "=sW2e", "6`b566=S", "", "CoS.g,", "<nS2", "7mb=X*MO\u0016\u0006zI9\u0007\u0014/r\u000f,{N", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Draggable2DCompatElement extends ModifierNodeElement<Draggable2DNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final MutableInteractionSource interactionSource;
    private final Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> onDragStarted;
    private final Function3<CoroutineScope, Velocity, Continuation<? super Unit>, Object> onDragStopped;
    private final boolean reverseDirection;
    private final boolean startDragImmediately;
    private final Draggable2DState state;
    public static final Companion Companion = new Companion(null);
    private static final Function1<PointerInputChange, Boolean> CanDrag = new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.Draggable2DCompatElement$Companion$CanDrag$1
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return true;
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public Draggable2DCompatElement(Draggable2DState draggable2DState, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function32, boolean z4) {
        this.state = draggable2DState;
        this.enabled = z2;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = z3;
        this.onDragStarted = function3;
        this.onDragStopped = function32;
        this.reverseDirection = z4;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public Draggable2DNode create() {
        return new Draggable2DNode(this.state, CanDrag, this.enabled, this.interactionSource, this.startDragImmediately, this.reverseDirection, this.onDragStarted, null, this.onDragStopped, null, OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(Draggable2DNode draggable2DNode) {
        Draggable2DNode.update$default(draggable2DNode, this.state, CanDrag, this.enabled, this.interactionSource, this.startDragImmediately, this.reverseDirection, this.onDragStarted, this.onDragStopped, null, null, 768, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Draggable2DCompatElement draggable2DCompatElement = (Draggable2DCompatElement) obj;
        return Intrinsics.areEqual(this.state, draggable2DCompatElement.state) && this.enabled == draggable2DCompatElement.enabled && Intrinsics.areEqual(this.interactionSource, draggable2DCompatElement.interactionSource) && this.startDragImmediately == draggable2DCompatElement.startDragImmediately && this.onDragStarted == draggable2DCompatElement.onDragStarted && this.onDragStopped == draggable2DCompatElement.onDragStopped && this.reverseDirection == draggable2DCompatElement.reverseDirection;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((this.state.hashCode() * 31) + Boolean.hashCode(this.enabled)) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return ((((((((iHashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31) + Boolean.hashCode(this.startDragImmediately)) * 31) + this.onDragStarted.hashCode()) * 31) + this.onDragStopped.hashCode()) * 31) + Boolean.hashCode(this.reverseDirection);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("draggable2D");
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("startDragImmediately", Boolean.valueOf(this.startDragImmediately));
        inspectorInfo.getProperties().set("onDragStarted", this.onDragStarted);
        inspectorInfo.getProperties().set("onDragStopped", this.onDragStopped);
        inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(this.reverseDirection));
        inspectorInfo.getProperties().set(SentryThread.JsonKeys.STATE, this.state);
    }

    /* JADX INFO: compiled from: Draggable2D.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u0006\u0010nj?1JͣIDɟ\u0004*=j<9*[ҸuCIUj\u00190\ngZwi~J\t\u000eS\u0011\u0016\u0016'nZKǤ|c\u001aƁJDuDASڷA@"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0006eA6V\u0002#V,U,dR{LRod\u0016Y'\u0016\tcJy", "", "u(E", "\u0011`]\u0011e(@", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "", "5dc\u0010T5\u001d`\u0015\u0001", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Function1<PointerInputChange, Boolean> getCanDrag() {
            return Draggable2DCompatElement.CanDrag;
        }
    }
}
