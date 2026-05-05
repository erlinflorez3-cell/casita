package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.VelocityKt;
import com.drew.metadata.exif.makernotes.SanyoMakernoteDirectory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
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
/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яħ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.Jչ*,(w\u000ff\u000198DsQ6RY*\u0017k\u00124,Ӌ,qY;]\u001a\u0004&\u0011Odgon`Z\u0013¼\u0017\u0006,xr,OY\u0001](\u000f:ԏw?AMw=?`|6\u001b :\"Ny\r\u00010*P\u0010|zKK\"\u00128@~íZ\rS\t\"\u0012\u001c>(\u0001$^oNLHt]@0+\u0003\u007fBVϋg0\u0013M\u0015Ͽ\\'#vi\u001e1D?5+%[\u0003\rRc?\u0019?y=\u000bl-EAɞ$WdW0\u0014C+\u007f\r\fsf\u0010\u0015an\u000e?7_e[P<,\b|\f\rj\t<\t7L<32f6\u0013Cz\u0001ZXR\u0018]p\b\u000bgD =\u0002I*g%ƻUaI$\u0017;\n!%\u001eQ\u001e7lir&`C8\u00053_PiwCG^'iX}\u0015\u0001q0K˙4Q\u0006Q\f\u00174:59a?IE{\u0004XD\u0016\u00143cx[yXXB2nDTX.\u001c^Tf\u001bj~z\u0007LWܚZΤ\u000b}\u0016:hb\u0006d9%>i\u0016h2p[\u0007\"%]\u0004}m7q\u001c\u0002Q^aR\u0018wXy`\",?j\u007f5\\tnk\f\t\nnFŮGКݻ{}J|\u001aBzW\u007fLL,_6\r\u0019V46Bo/O\u0004̬gɭњX5*6wS=1\u000f\u0005tp\u001e\u0005)M:2x\"[w\u00029']m\"\u0017l-'\u00158\f\u007fu\"\u0013[ǻkֵ\u0091Y}&Q(u\u001a;KP'~WOHΒ\u0004ʆve_\fZ;\t<\u0012\u000fi\u0006^k\u0016+\t,\u000f,\u0011֥\u0013Ђ&vl5k\u001crC\u0012at\u0018wgbKs>w7Iʞzҡ<|\u0013df+\u000f6:|c2\nKe\u001c\u0006[G\u0015\u0010z0ov@pW>t\u0014!\\u\u001copSu>K:YY-B2&|\u0003pM\u0019z8H\u000f4\u001b9`A\u0013u\u0007@S\u000b=\u0005~\tB\f\u001f^\fB\u0019o\f=Fa@rq\bDdI%\u001f\u0017kg\u001cr\u001ct\u0019V'\u0016\u001b}An@ M\"fW\u0011\u000e^\tJ̻8װ?b\rµYXB.T\u0014\u001bEdi4\u0014\u000b\u0002V_=\u001c`E$Kd\u001bl\u0005lXX\u0005\u000fIp#:\u0001-\u0014a!7u\b\u070fyܑX5kѢ\u0019U#\u0017)y \u0013t5CLd;+(\u0007\u0013!D\fT ͼB\u0086K)u @\u001aF+\u0015\u001fX\u0017IM(Μk۞4^\u0013ٝ5jr|*f\u0001SR-\r\b\u0015\u000ej\u000fMKo۟~ƚf3Tϕ\u00109I/\u000f-\u0015I\u0015\u0013\u0015e\\\u001a[\u000ee3KV\u0003\u0016=z\u0006[y>^»,ڗ\bz)Ƹo\u0010l!k3\u000b\"\u007f/z\u00027\u0018'܃\u0010̛Ntz˖~\u0016DX\u001a5\u0018\u0012\rcBկ-͛++tݩ\u0013Yv\u0013\"e\u0003b\u001dpaӉrܕZyv߲ǣ\u001d\u000e/P4\u009ft\t9÷Wj"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0016\u001e#wqF\u0007L6Mv|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r$@o~8LC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9xFz.DY\u000b\u0004@x&=5M:o5\"\u0015uJC\u0006c\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9kF~0?g\u0002/;w\u001f\u0015WA7r\u0012(\u001evqA\u0007p\u0014Xu+HPN9E\\q=i", "1`]\u0011e(@", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "", "3mP/_,=", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "=qX2a;:b\u001d\t\u0004E6z\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0015\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018w1WUM(kV|F]\u0016c\u001dN8\t\u0003hE.w\u000e\u001f/\u0017(F\t;L\n\u001b\u0016\u001b1h\u007fF`\u00195\u0004%\u0003?)>-UhxTKIa=.\ni%gDH$]r#+qO*\u0019\u007f]\u001a<TyuvW&zFm(z_FN~QKx1(!?h", "-bP;79:U", "\nrTA \u0006\u0017", "5dc\u0010T5\u001d`\u0015\u0001", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "1gP;a,E", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7tk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qp\u000f", "2qP4<5MS&zxm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005JA\u001a\u0017LjH\u0007p(L\u0006+QU\r\u001akN\u007fLi", "5dc\u0012a(;Z\u0019}", "u(I", "5dc\u0016a;>`\u0015|\nb6\u0006v9u\r&{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~]\u0007/7z\u0012,\\GEt}\u0006%w]6\u000ec\u0010W\u0006'THL;`\\{+\u001e\"g\fN\u0001", "7r;6f;>\\\u001d\b|?6\nh@e\t7\n", ">nX;g,K7\"\n\u000bm\u0015\u0007\b/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001[&<XCDj8'\u0017Sk=\u0010r,[Z0R\\]\u0014fQv>\u0018\u0012gvX*\rZ", "2hb=b:>7\"\u000ezk(z\u00183o\t\u0016\u0006P\u000e\u0015\u0017", "", "2qP4", "4na\u0012T*A2\u0019\u0006\nZ", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qpwep(PU'N[J\u0002", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "2qP47,Eb\u0015", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "7mXA\\(EW.~eh0\u0006\u0018/rc1\u0007P\u0010\u007f!Fo", "=m2.a*>Z\u0004\t~g;|\u0016\u0013n\u000b8\u000b", "=m32g(<V", "=m3?T.,b\u0015\f\n^+", "AsP?g,=>#\r~m0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "=m3?T.,b\u0015\f\n^+D\u000fv4\u0007\u0014F(", "uI\u0018#", "=m3?T.,b#\n\u0006^+", "Dd[<V0Mg", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "=m3?T.,b#\n\u0006^+Dw\u00121[6W\u000b", "=m?<\\5MS&^\f^5\f", ">nX;g,K3*~\u0004m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", ">`b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp$\u0003q:$", "0nd;W:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "=m?<\\5MS&^\f^5\fP\u00120\u000b\u0015\fJt", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjH\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N]J/~S\u0001*\u00120R\u0011;uJv \u0012>ypO6!G\u0003$`=7v\u001c>#j", ">q^0X:L2&z|<(\u0006\u0007/l", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", ">q^0X:L2&z|L;x\u0016>", "3uT;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qpwep(Pd6CY],[(", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017\"Hg6}&hjHEB9Jx\u0015VH[;\\QH$\u001a\u001ci\u0015R4V\u0003cN.~S;(\b:\u0013_Eq\u0010\u0010\u001f\u001e1ytL_e\u000b`\u001aqR%2MUh{\u0011+Bg*b\u001b5", ">q^0X:L2&z|L;\u0007\u0014", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qpwep(Pd6QWY,[(", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017\"Hg6}&hjHEB9Jx\u0015VVY7\\QH$\u001a\u001ci\u0015R4V\u0003cN.~S;(\b:\u0013_Eq\u0010\u0010\u001f\u001e1ytL_e\u000b`\u001aqR%2MUh{\u0011+Bg*b\u001b5", "AsP?g\u000bKO\u001bb\u0003f,{\r+t\u007f/\u0010", "AsP?g\u0013Ba(~\u0004b5~i9r_9{I\u0010%", "CoS.g,", "Ag^B_++S'~\nI6\u0001\u0012>e\r\f\u0005K\u0011&yCx\rCz.7", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class DragGestureNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private final Function1<PointerInputChange, Boolean> _canDrag = new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$_canDrag$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return this.this$0.getCanDrag().invoke(pointerInputChange);
        }
    };
    private Function1<? super PointerInputChange, Boolean> canDrag;
    private Channel<DragEvent> channel;
    private DragInteraction.Start dragInteraction;
    private boolean enabled;
    private MutableInteractionSource interactionSource;
    private boolean isListeningForEvents;
    private Orientation orientationLock;
    private SuspendingPointerInputModifierNode pointerInputNode;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 */
    /* JADX INFO: compiled from: Draggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUl\u001c\f\u0013s\u0013\"$&$\u0018\u0002$\u001a\u001c", f = "\u0011>,10))2*q.6", i = {0}, l = {566}, m = "?B@58GH\u001aI9@\u001d<J@CK", n = {"c^kY"}, s = {"xQ^"})
    static final class C04541 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C04541(Continuation<? super C04541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return DragGestureNode.this.processDragCancel(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 */
    /* JADX INFO: compiled from: Draggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUl\u001c\f\u0013s\u0013\"$&$\u0018\u0002$\u001a\u001c", f = "\u0011>,10))2*q.6", i = {0, 0, 1, 1, 1}, l = {SanyoMakernoteDirectory.TAG_SEQUENCE_SHOT_INTERVAL, 551}, m = "?B@58GH\u001aI9@-O=OR", n = {"c^kY", "TlgTf", "c^kY", "TlgTf", "XdvKdWE[?IT"}, s = {"xQ^", "xQ_", "xQ^", "xQ_", "xQ`"})
    static final class C04551 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C04551(Continuation<? super C04551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return DragGestureNode.this.processDragStart(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 */
    /* JADX INFO: compiled from: Draggable.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUl\u001c\f\u0013s\u0013\"$&$\u0018\u0002$\u001a\u001c", f = "\u0011>,10))2*q.6", i = {0, 0}, l = {558}, m = "?B@58GH\u001aI9@-OKM", n = {"c^kY", "TlgTf"}, s = {"xQ^", "xQ_"})
    static final class C04561 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C04561(Continuation<? super C04561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureNode.this.processDragStop(null, this);
        }
    }

    public abstract Object drag(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: onDragStarted-k-4lQ0M */
    public abstract void mo727onDragStartedk4lQ0M(long j2);

    /* JADX INFO: renamed from: onDragStopped-TH1AsA0 */
    public abstract void mo728onDragStoppedTH1AsA0(long j2);

    public abstract boolean startDragImmediately();

    public DragGestureNode(Function1<? super PointerInputChange, Boolean> function1, boolean z2, MutableInteractionSource mutableInteractionSource, Orientation orientation) {
        this.orientationLock = orientation;
        this.canDrag = function1;
        this.enabled = z2;
        this.interactionSource = mutableInteractionSource;
    }

    protected final Function1<PointerInputChange, Boolean> getCanDrag() {
        return this.canDrag;
    }

    protected final boolean getEnabled() {
        return this.enabled;
    }

    protected final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final void startListeningForEvents() {
        this.isListeningForEvents = true;
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C04571(null), 3, null);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1 */
    /* JADX INFO: compiled from: Draggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUl\u001c\f\u0013s\u0013\"$&$\u0018\u0002$\u001a\u001c[,.\u001c.1\n(35'1-3-\r7;\u000fA1;BBs\u0002", f = "\u0011>,10))2*q.6", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {431, 433, 435, 442, 444, 447}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aNHKHI2", "TlgTf", "\u0013jjOe\u001aNHKHI2", "TlgTf", "\u0013jjOe\u001aNHKHI2", "TlgTf", "\u0013jjOe\u001aNHKHI2", "\u0013jjOe\u001aNHKHI2", "\u0013jjOe\u001aNHKHI2"}, s = {"xQ^", "xQ_", "xQ^", "xQ_", "xQ^", "xQ_", "xQ^", "xQ^", "xQ^"})
    static final class C04571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C04571(Continuation<? super C04571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04571 c04571 = DragGestureNode.this.new C04571(continuation);
            c04571.L$0 = obj;
            return c04571;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C04571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:67:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00bf A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00c6 A[Catch: CancellationException -> 0x00fb, TryCatch #0 {CancellationException -> 0x00fb, blocks: (B:81:0x00a4, B:84:0x00c0, B:86:0x00c6, B:89:0x00e2, B:91:0x00e8, B:60:0x002e, B:63:0x003c), top: B:100:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00e2 A[Catch: CancellationException -> 0x00fb, TryCatch #0 {CancellationException -> 0x00fb, blocks: (B:81:0x00a4, B:84:0x00c0, B:86:0x00c6, B:89:0x00e2, B:91:0x00e8, B:60:0x002e, B:63:0x003c), top: B:100:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x010f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0089 -> B:65:0x0047). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x00df -> B:65:0x0047). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x00e6 -> B:65:0x0047). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x00f8 -> B:65:0x0047). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x010b -> B:65:0x0047). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 292
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.C04571.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1 */
        /* JADX INFO: compiled from: Draggable.kt */
        /* JADX INFO: loaded from: classes.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001a\u001d̉=!,i\bӵLc\u000b\u0004I\u0006F\u000b6B\u0015\"4\u0012}\u0007tʑQ0rdxM`SB*{\rD3\n&ڱGE[\u001d\u000e(\u000fS^imtp_\u001bE\u001f\u0006Dw\u0019-\u0010ǌ7"}, d2 = {"\n`]<a@F])\rS", "", ">q^0X:L2\u0019\u0006\nZ", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\u0014/\u0015qpwep(PU'N[J\u0002", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "2qP47,Eb\u0015"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUl\u001c\f\u0013s\u0013\"$&$\u0018\u0002$\u001a\u001c[,.\u001c.1\n(35'1-3-\r7;\u000fA1;BBs\u0002u\u0004", f = "\u0011>,10))2*q.6", i = {0}, l = {438}, m = "8>GA>9(KJH>H?", n = {"_hqIWiU+;FZ+"}, s = {"xQ^"})
        static final class C00241 extends SuspendLambda implements Function2<Function1<? super DragEvent.DragDelta, ? extends Unit>, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.ObjectRef<DragEvent> $event;
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ DragGestureNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00241(Ref.ObjectRef<DragEvent> objectRef, DragGestureNode dragGestureNode, Continuation<? super C00241> continuation) {
                super(2, continuation);
                this.$event = objectRef;
                this.this$0 = dragGestureNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00241 c00241 = new C00241(this.$event, this.this$0, continuation);
                c00241.L$0 = obj;
                return c00241;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Function1<? super DragEvent.DragDelta, ? extends Unit> function1, Continuation<? super Unit> continuation) {
                return invoke2((Function1<? super DragEvent.DragDelta, Unit>) function1, continuation);
            }

            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Function1<? super DragEvent.DragDelta, Unit> function1, Continuation<? super Unit> continuation) {
                return ((C00241) create(function1, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0042 -> B:35:0x0018). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0051 -> B:34:0x0016). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r0 = r6.label
                    r3 = 1
                    if (r0 == 0) goto L56
                    if (r0 != r3) goto L61
                    java.lang.Object r5 = r6.L$1
                    kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
                    java.lang.Object r2 = r6.L$0
                    kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
                    kotlin.ResultKt.throwOnFailure(r7)
                L16:
                    androidx.compose.foundation.gestures.DragEvent r7 = (androidx.compose.foundation.gestures.DragEvent) r7
                L18:
                    r5.element = r7
                L1a:
                    kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r0 = r6.$event
                    T r0 = r0.element
                    boolean r0 = r0 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                    if (r0 != 0) goto L5e
                    kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r0 = r6.$event
                    T r0 = r0.element
                    boolean r0 = r0 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                    if (r0 != 0) goto L5e
                    kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r0 = r6.$event
                    T r1 = r0.element
                    boolean r0 = r1 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                    r7 = 0
                    if (r0 == 0) goto L54
                    androidx.compose.foundation.gestures.DragEvent$DragDelta r1 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r1
                L35:
                    if (r1 == 0) goto L3a
                    r2.invoke(r1)
                L3a:
                    kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r5 = r6.$event
                    androidx.compose.foundation.gestures.DragGestureNode r0 = r6.this$0
                    kotlinx.coroutines.channels.Channel r1 = androidx.compose.foundation.gestures.DragGestureNode.access$getChannel$p(r0)
                    if (r1 == 0) goto L18
                    r0 = r6
                    kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                    r6.L$0 = r2
                    r6.L$1 = r5
                    r6.label = r3
                    java.lang.Object r7 = r1.receive(r0)
                    if (r7 != r4) goto L16
                    return r4
                L54:
                    r1 = r7
                    goto L35
                L56:
                    kotlin.ResultKt.throwOnFailure(r7)
                    java.lang.Object r2 = r6.L$0
                    kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
                    goto L1a
                L5e:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L61:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.C04571.C00241.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.isListeningForEvents = false;
        disposeInteractionSource();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo546onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        if (this.enabled && this.pointerInputNode == null) {
            this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(initializePointerInputNode());
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.mo546onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1 */
    /* JADX INFO: compiled from: Draggable.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUl\u001c\f\u0013s\u0013\"$&$\u0018\u0002$\u001a\u001c[\"($0&\u001f+);'\u00133.4;-;\u00139<BB\u001d?57v\u0005", f = "\u0011>,10))2*q.6", i = {}, l = {524}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = DragGestureNode.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                final VelocityTracker velocityTracker = new VelocityTracker();
                final DragGestureNode dragGestureNode = DragGestureNode.this;
                Function3<PointerInputChange, PointerInputChange, Offset, Unit> function3 = new Function3<PointerInputChange, PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragStart$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
                        m770invoke0AR0LA0(pointerInputChange, pointerInputChange2, offset.m3947unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-0AR0LA0, reason: not valid java name */
                    public final void m770invoke0AR0LA0(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j2) {
                        if (dragGestureNode.getCanDrag().invoke(pointerInputChange).booleanValue()) {
                            if (!dragGestureNode.isListeningForEvents) {
                                if (dragGestureNode.channel == null) {
                                    dragGestureNode.channel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                                }
                                dragGestureNode.startListeningForEvents();
                            }
                            VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
                            long jM3941minusMKHz9U = Offset.m3941minusMKHz9U(pointerInputChange2.m5385getPositionF1C5BW0(), j2);
                            Channel channel = dragGestureNode.channel;
                            if (channel != null) {
                                ChannelResult.m10499boximpl(channel.mo10484trySendJP2dKIU(new DragEvent.DragStarted(jM3941minusMKHz9U, null)));
                            }
                        }
                    }
                };
                final DragGestureNode dragGestureNode2 = DragGestureNode.this;
                Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragEnd$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
                        invoke2(pointerInputChange);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(PointerInputChange pointerInputChange) {
                        VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
                        float maximumFlingVelocity = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(dragGestureNode2, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                        long jM5485calculateVelocityAH228Gc = velocityTracker.m5485calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
                        velocityTracker.resetTracking();
                        Channel channel = dragGestureNode2.channel;
                        if (channel != null) {
                            ChannelResult.m10499boximpl(channel.mo10484trySendJP2dKIU(new DragEvent.DragStopped(DraggableKt.m785toValidVelocityTH1AsA0(jM5485calculateVelocityAH228Gc), null)));
                        }
                    }
                };
                final DragGestureNode dragGestureNode3 = DragGestureNode.this;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragCancel$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Channel channel = dragGestureNode3.channel;
                        if (channel != null) {
                            ChannelResult.m10499boximpl(channel.mo10484trySendJP2dKIU(DragEvent.DragCancelled.INSTANCE));
                        }
                    }
                };
                final DragGestureNode dragGestureNode4 = DragGestureNode.this;
                Function0<Boolean> function02 = new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Boolean.valueOf(!dragGestureNode4.startDragImmediately());
                    }
                };
                final DragGestureNode dragGestureNode5 = DragGestureNode.this;
                Function2<PointerInputChange, Offset, Unit> function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDrag$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                        m769invokeUv8p0NA(pointerInputChange, offset.m3947unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
                    public final void m769invokeUv8p0NA(PointerInputChange pointerInputChange, long j2) {
                        VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
                        Channel channel = dragGestureNode5.channel;
                        if (channel != null) {
                            ChannelResult.m10499boximpl(channel.mo10484trySendJP2dKIU(new DragEvent.DragDelta(j2, null)));
                        }
                    }
                };
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(new C00231(DragGestureNode.this, pointerInputScope, function3, function1, function0, function02, function2, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1 */
        /* JADX INFO: compiled from: Draggable.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUl\u001c\f\u0013s\u0013\"$&$\u0018\u0002$\u001a\u001c[\"($0&\u001f+);'\u00133.4;-;\u00139<BB\u001d?57v\u0005x\u0007", f = "\u0011>,10))2*q.6", i = {0}, l = {SanyoMakernoteDirectory.TAG_SEQUENTIAL_SHOT}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aEVHI[>@H$\u0019\u0016&2\f"}, s = {"xQ^"})
        static final class C00231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $$this$SuspendingPointerInputModifierNode;
            final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
            final /* synthetic */ Function0<Unit> $onDragCancel;
            final /* synthetic */ Function1<PointerInputChange, Unit> $onDragEnd;
            final /* synthetic */ Function3<PointerInputChange, PointerInputChange, Offset, Unit> $onDragStart;
            final /* synthetic */ Function0<Boolean> $shouldAwaitTouchSlop;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DragGestureNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00231(DragGestureNode dragGestureNode, PointerInputScope pointerInputScope, Function3<? super PointerInputChange, ? super PointerInputChange, ? super Offset, Unit> function3, Function1<? super PointerInputChange, Unit> function1, Function0<Unit> function0, Function0<Boolean> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super C00231> continuation) {
                super(2, continuation);
                this.this$0 = dragGestureNode;
                this.$$this$SuspendingPointerInputModifierNode = pointerInputScope;
                this.$onDragStart = function3;
                this.$onDragEnd = function1;
                this.$onDragCancel = function0;
                this.$shouldAwaitTouchSlop = function02;
                this.$onDrag = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00231 c00231 = new C00231(this.this$0, this.$$this$SuspendingPointerInputModifierNode, this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$shouldAwaitTouchSlop, this.$onDrag, continuation);
                c00231.L$0 = obj;
                return c00231;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:46:0x004d  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x005f  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r0 = r12.label
                    r1 = 1
                    if (r0 == 0) goto L1b
                    if (r0 != r1) goto L13
                    java.lang.Object r3 = r12.L$0
                    kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
                    kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.util.concurrent.CancellationException -> L44
                    goto L5c
                L13:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                L1b:
                    kotlin.ResultKt.throwOnFailure(r13)
                    java.lang.Object r3 = r12.L$0
                    kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
                    androidx.compose.foundation.gestures.DragGestureNode r0 = r12.this$0     // Catch: java.util.concurrent.CancellationException -> L42
                    androidx.compose.foundation.gestures.Orientation r9 = androidx.compose.foundation.gestures.DragGestureNode.access$getOrientationLock$p(r0)     // Catch: java.util.concurrent.CancellationException -> L42
                    androidx.compose.ui.input.pointer.PointerInputScope r4 = r12.$$this$SuspendingPointerInputModifierNode     // Catch: java.util.concurrent.CancellationException -> L42
                    kotlin.jvm.functions.Function3<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> r5 = r12.$onDragStart     // Catch: java.util.concurrent.CancellationException -> L42
                    kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r6 = r12.$onDragEnd     // Catch: java.util.concurrent.CancellationException -> L42
                    kotlin.jvm.functions.Function0<kotlin.Unit> r7 = r12.$onDragCancel     // Catch: java.util.concurrent.CancellationException -> L42
                    kotlin.jvm.functions.Function0<java.lang.Boolean> r8 = r12.$shouldAwaitTouchSlop     // Catch: java.util.concurrent.CancellationException -> L42
                    kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> r10 = r12.$onDrag     // Catch: java.util.concurrent.CancellationException -> L42
                    r11 = r12
                    kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11     // Catch: java.util.concurrent.CancellationException -> L42
                    r12.L$0 = r3     // Catch: java.util.concurrent.CancellationException -> L42
                    r12.label = r1     // Catch: java.util.concurrent.CancellationException -> L42
                    java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L42
                    if (r0 != r2) goto L5c
                    return r2
                L42:
                    r2 = move-exception
                    goto L45
                L44:
                    r2 = move-exception
                L45:
                    androidx.compose.foundation.gestures.DragGestureNode r0 = r12.this$0
                    kotlinx.coroutines.channels.Channel r1 = androidx.compose.foundation.gestures.DragGestureNode.access$getChannel$p(r0)
                    if (r1 == 0) goto L56
                    androidx.compose.foundation.gestures.DragEvent$DragCancelled r0 = androidx.compose.foundation.gestures.DragEvent.DragCancelled.INSTANCE
                    java.lang.Object r0 = r1.mo10484trySendJP2dKIU(r0)
                    kotlinx.coroutines.channels.ChannelResult.m10499boximpl(r0)
                L56:
                    boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r3)
                    if (r0 == 0) goto L5f
                L5c:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L5f:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.AnonymousClass1.C00231.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }
    }

    private final SuspendingPointerInputModifierNode initializePointerInputNode() {
        return SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AnonymousClass1(null));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.onCancelPointerInput();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processDragStart(androidx.compose.foundation.gestures.DragEvent.DragStarted r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.DragGestureNode.C04551
            if (r0 == 0) goto L86
            r6 = r9
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r6 = (androidx.compose.foundation.gestures.DragGestureNode.C04551) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L86
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r1 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L3e
            if (r0 == r3) goto L5f
            if (r0 != r4) goto L8c
            java.lang.Object r3 = r6.L$2
            androidx.compose.foundation.interaction.DragInteraction$Start r3 = (androidx.compose.foundation.interaction.DragInteraction.Start) r3
            java.lang.Object r8 = r6.L$1
            androidx.compose.foundation.gestures.DragEvent$DragStarted r8 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r8
            java.lang.Object r2 = r6.L$0
            androidx.compose.foundation.gestures.DragGestureNode r2 = (androidx.compose.foundation.gestures.DragGestureNode) r2
            kotlin.ResultKt.throwOnFailure(r1)
        L32:
            r2.dragInteraction = r3
            long r0 = r8.m743getStartPointF1C5BW0()
            r2.mo727onDragStartedk4lQ0M(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L3e:
            kotlin.ResultKt.throwOnFailure(r1)
            androidx.compose.foundation.interaction.DragInteraction$Start r2 = r7.dragInteraction
            if (r2 == 0) goto L5d
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.interactionSource
            if (r1 == 0) goto L5d
            androidx.compose.foundation.interaction.DragInteraction$Cancel r0 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r0.<init>(r2)
            androidx.compose.foundation.interaction.Interaction r0 = (androidx.compose.foundation.interaction.Interaction) r0
            r6.L$0 = r7
            r6.L$1 = r8
            r6.label = r3
            java.lang.Object r0 = r1.emit(r0, r6)
            if (r0 != r5) goto L5d
            return r5
        L5d:
            r2 = r7
            goto L6a
        L5f:
            java.lang.Object r8 = r6.L$1
            androidx.compose.foundation.gestures.DragEvent$DragStarted r8 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r8
            java.lang.Object r2 = r6.L$0
            androidx.compose.foundation.gestures.DragGestureNode r2 = (androidx.compose.foundation.gestures.DragGestureNode) r2
            kotlin.ResultKt.throwOnFailure(r1)
        L6a:
            androidx.compose.foundation.interaction.DragInteraction$Start r3 = new androidx.compose.foundation.interaction.DragInteraction$Start
            r3.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r2.interactionSource
            if (r1 == 0) goto L32
            r0 = r3
            androidx.compose.foundation.interaction.Interaction r0 = (androidx.compose.foundation.interaction.Interaction) r0
            r6.L$0 = r2
            r6.L$1 = r8
            r6.L$2 = r3
            r6.label = r4
            java.lang.Object r0 = r1.emit(r0, r6)
            if (r0 != r5) goto L85
            return r5
        L85:
            goto L32
        L86:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r6 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1
            r6.<init>(r9)
            goto L13
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.processDragStart(androidx.compose.foundation.gestures.DragEvent$DragStarted, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processDragStop(androidx.compose.foundation.gestures.DragEvent.DragStopped r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureNode.C04561
            if (r0 == 0) goto L5b
            r5 = r8
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r5 = (androidx.compose.foundation.gestures.DragGestureNode.C04561) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L5b
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L38
            if (r0 != r3) goto L61
            java.lang.Object r7 = r5.L$1
            androidx.compose.foundation.gestures.DragEvent$DragStopped r7 = (androidx.compose.foundation.gestures.DragEvent.DragStopped) r7
            java.lang.Object r2 = r5.L$0
            androidx.compose.foundation.gestures.DragGestureNode r2 = (androidx.compose.foundation.gestures.DragGestureNode) r2
            kotlin.ResultKt.throwOnFailure(r1)
        L2b:
            r0 = 0
            r2.dragInteraction = r0
        L2e:
            long r0 = r7.m744getVelocity9UxMQ8M()
            r2.mo728onDragStoppedTH1AsA0(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L38:
            kotlin.ResultKt.throwOnFailure(r1)
            androidx.compose.foundation.interaction.DragInteraction$Start r2 = r6.dragInteraction
            if (r2 == 0) goto L59
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r6.interactionSource
            if (r1 == 0) goto L57
            androidx.compose.foundation.interaction.DragInteraction$Stop r0 = new androidx.compose.foundation.interaction.DragInteraction$Stop
            r0.<init>(r2)
            androidx.compose.foundation.interaction.Interaction r0 = (androidx.compose.foundation.interaction.Interaction) r0
            r5.L$0 = r6
            r5.L$1 = r7
            r5.label = r3
            java.lang.Object r0 = r1.emit(r0, r5)
            if (r0 != r4) goto L57
            return r4
        L57:
            r2 = r6
            goto L2b
        L59:
            r2 = r6
            goto L2e
        L5b:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r5 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1
            r5.<init>(r8)
            goto L13
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.processDragStop(androidx.compose.foundation.gestures.DragEvent$DragStopped, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processDragCancel(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.DragGestureNode.C04541
            if (r0 == 0) goto L5d
            r5 = r7
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r5 = (androidx.compose.foundation.gestures.DragGestureNode.C04541) r5
            int r0 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L5d
            int r0 = r5.label
            int r0 = r0 - r2
            r5.label = r0
        L19:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L3c
            if (r0 != r3) goto L63
            java.lang.Object r2 = r5.L$0
            androidx.compose.foundation.gestures.DragGestureNode r2 = (androidx.compose.foundation.gestures.DragGestureNode) r2
            kotlin.ResultKt.throwOnFailure(r1)
        L2d:
            r0 = 0
            r2.dragInteraction = r0
        L30:
            androidx.compose.ui.unit.Velocity$Companion r0 = androidx.compose.ui.unit.Velocity.Companion
            long r0 = r0.m6886getZero9UxMQ8M()
            r2.mo728onDragStoppedTH1AsA0(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L3c:
            kotlin.ResultKt.throwOnFailure(r1)
            androidx.compose.foundation.interaction.DragInteraction$Start r2 = r6.dragInteraction
            if (r2 == 0) goto L5b
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r6.interactionSource
            if (r1 == 0) goto L59
            androidx.compose.foundation.interaction.DragInteraction$Cancel r0 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r0.<init>(r2)
            androidx.compose.foundation.interaction.Interaction r0 = (androidx.compose.foundation.interaction.Interaction) r0
            r5.L$0 = r6
            r5.label = r3
            java.lang.Object r0 = r1.emit(r0, r5)
            if (r0 != r4) goto L59
            return r4
        L59:
            r2 = r6
            goto L2d
        L5b:
            r2 = r6
            goto L30
        L5d:
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r5 = new androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1
            r5.<init>(r7)
            goto L19
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.processDragCancel(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void disposeInteractionSource() {
        DragInteraction.Start start = this.dragInteraction;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(new DragInteraction.Cancel(start));
            }
            this.dragInteraction = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void update$default(DragGestureNode dragGestureNode, Function1 function1, boolean z2, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z3, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((1 & i2) != 0) {
            function1 = dragGestureNode.canDrag;
        }
        if ((2 & i2) != 0) {
            z2 = dragGestureNode.enabled;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            mutableInteractionSource = dragGestureNode.interactionSource;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            orientation = dragGestureNode.orientationLock;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            z3 = false;
        }
        dragGestureNode.update(function1, z2, mutableInteractionSource, orientation, z3);
    }

    public final void update(Function1<? super PointerInputChange, Boolean> function1, boolean z2, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z3) {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode;
        this.canDrag = function1;
        boolean z4 = true;
        if (this.enabled != z2) {
            this.enabled = z2;
            if (!z2) {
                disposeInteractionSource();
                SuspendingPointerInputModifierNode suspendingPointerInputModifierNode2 = this.pointerInputNode;
                if (suspendingPointerInputModifierNode2 != null) {
                    undelegate(suspendingPointerInputModifierNode2);
                }
                this.pointerInputNode = null;
            }
            z3 = true;
        }
        if (!Intrinsics.areEqual(this.interactionSource, mutableInteractionSource)) {
            disposeInteractionSource();
            this.interactionSource = mutableInteractionSource;
        }
        if (this.orientationLock != orientation) {
            this.orientationLock = orientation;
        } else {
            z4 = z3;
        }
        if (!z4 || (suspendingPointerInputModifierNode = this.pointerInputNode) == null) {
            return;
        }
        suspendingPointerInputModifierNode.resetPointerInputHandler();
    }
}
