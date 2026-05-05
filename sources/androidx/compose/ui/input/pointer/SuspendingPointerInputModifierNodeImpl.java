package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
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
/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĕ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aՄ\u000ffxˎ8DkH6Ra9\u0017ӆ\u00044:[,qY;]\u001a\f\"\u0011OdgonP\\\u0013C%\u0006\u001exp,QU\u000f]\u001aƁ:B}D;Mu>A`\u000b6\r H\"@ц\r\u00010*P\u0010|}KK\u001a\u001b8@vEZ\rc\u0005\"\u0012\f?(\u00014\\oN<Kt]P/+\u0003oDV'u0\u0005ձ\u0015Fj'\u0015vg)1¨MߎE%\u0002\u00027R\n?3? >5hU)cHB\u0018\u0011h\b\u001a\u00159R%_\t%\u000b\tah\u0012'9T{Mf\rV{\u000b\u000e\u0013<\u0012\u0014\u001e3X43\u0019v\n$2#vi?~\tng\u000e\u0003yW\u001d$\u00105;9IgaiK\u001f^9\f\u0005;)Q\u000b~%kV$_C\u001f\u0003\u0001Φ5QFI˓R\ngJ6?~\u001b\u001a*Jig\u00025Ʌ\u001fgGJE\u0016QD'j\u0012JTg%@ppcobJP\"5Oe4\u0019\u0010jFz\u0004\u001aT\u0003a¯\u0015M\"`MùF˙$\\\u0006xi;\u001e\fgh\u0018u}a\u0018cGfem\u001fo\u001c\u0017Q^au\u0018cX\r`8,?jm5\\t\u0002k\f\t\u001dX:@\u0003\u0003$\b\u0006TV\u001c\u00138@ 7\u0005,_ǉl\u0017X\u0003LMo?Oݣ`1\u0016\r\u0018K$1tj\tQ\u0007^!\to\u0016\u0004\u0010@Ef0rYQc$lij\u0011BC;\u0007-~0Ku\u000b_L\u001b*&Y\n_.\u001ag\u0012_A!V\u0017)`\u0013sY˜qό˛Q\u0014-C\u000bCWAvx\u007f\b\u0019{rt3P] /\"%i97PC\u000eFyF)R\u0014Z\u0019^VK\t\u0002\b@~>\u000b\n7 ;\u007f\u001e&-E;I?)&}\u001a.%csh\u001e2\u0010a=-%\u000b\u00124{7uaa_B;fJi\u0007N(4n\u0013Bvu&\u0012R\rD\u000fIGoh\u001f_иQ\u000b5\n-߿Ր\u0011r\\)H @-B<wKyB\u000e\u0016nCS\u0012][ws}Ml\u000bx\u001a8\u0015\f5~\u00142<NZ\u0006kס4\u0006y$\rאGك\t>\u0011$B;\r\u001c\u0019Sli4!QėRޣ\u000eğѡArŌZ\u0010\\xjh\u0019\u0011nXx!X\u0015U۳?\u038b|59܊>XbD{2/iS]q˙Qǎj)CFZP)@)\u001b\u0019^uQY\fF\fW)sl\u001e'\t\u0018+܈p2qʆSμcv8͜[mrj|v@\u0004\t#xĭ\u0001Ԍ{ɚܬ\t\u000eՈ\u001dS\u000bqhKZmHIQ:\u0019\u0017r?=`SބHɴ1\nM/Cjx,w\u0014euS}6Cvڋ\u0010ȯ%h_ʪ~\fc?H;\u0012\u0018h(\u0017:!.\u00121bv\t\t\\\f\rС\u000eג\u0006\u0013f̏<\u0006/E?-\u0003\u0005pO?ǐ\u0016ʋpcvΩ[\u001dt7n\u0006~3V\u001c\u0019)c-A\\p9?Zvǈ\u001d\u05ca\u0018\u0017.\u001fD037\u001ex{j\u0007j}ocĎ;֗.a9È#8\fI\u0012\u0004\u00144d0%;\\Nl\u007fY\\\u001b܀\u0006(5Ȩ*̒x\f1حMcVf)4:E\u0003 t/e\u001a/c\u001dMp\t\u0014Ew1O;bC+9H\n\u001e,%\u001aܾ>bz\fZg\u0017\u001e\u0018\t2,VVM\u001aUZ4ut\t6MU8p\u0013Z\u001b\u001e\u0015?\\N\u001fl`H%ՀU3G%GUS\r\\˦\u0013ص9tiU+V\u000f*!\u000fE(?\u001b\u000b\u0002E#;1%nI\t=ձ1̂iL/ڄR}X1ec\u0005 \u0018\u0001 ˖G˃x\u07ba̧~\tڍ((\u001ew)3SP\u0019<m\u0011XV\"\r:z\u0001\u07b6p\u07b2'K\u0005zy@:!ѥsmcd:у\u0017B\u0018L>0Lĕ\u000b\u0015"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001[&<XCDj8'\u0017Sk=\u0010r,[Z0R\\]\u0014fQv>\u0018\u0012gvX*\rhaL+D", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001[&<XCDj8'\u0017Sk=\u0010r,[Z0R\\]\u0014fQv>\u0018\u0012gvX*\rZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "9dh}", "", "9dh~", "9dh@", "", ">nX;g,K7\"\n\u000bm\u000fx\u0012.l\u007f5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k$4H7|0g\u001cdj;PM)Sv%V\"52fayA\u001d[_\u001fVt\u000e\u0015b?3rN@-Q\rY\u000b9w\u0005\u0016\u001fZ\u000b.a", "-o^6a;>`|\b\u0006n;_\u00058d\u0007(\t", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0002/", "0nd;W:,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\u0018", "1ta?X5M3*~\u0004m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", "2d]@\\;R", "", "5dc\u0011X5LW(\u0013", "u(5", "2hb=T;<V\u001d\b|I6\u0001\u0012>e\r\u000bwI\u007f\u001e\u0017T}", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001[&<XCDj8'\u0017Sk=\u0010r,[Z0R\\]\u0014fQv>\u0018\u0012gvX*\rhaL+-/A#\u0011;I\u000f\u001by\u0001\u0015%p1soIV\u001d%\u0004\"\u007fQ8lOY5", "3wc2a+>R\b\t\u000b\\/g\u0005.d\u00041}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc\u0012k;>\\\u0018~yM6\r\u00072P{'zD\n\u0019^0RUAs\u00123", "u(9", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", "7mc2e*>^(h\u000bm\u0016}e9u\t'\n\u001e\u0004\u001b\u001eFO\u001f<\u007f4C", "", "5dc\u0016a;>`\u0017~\u0006m\u0016\r\u0018\u0019f\\2\fI\u007f%tJs\u0015;V65b\r.", "u(I", "Adc\u0016a;>`\u0017~\u0006m\u0016\r\u0018\u0019f\\2\fI\u007f%tJs\u0015;V65b\r.", "uY\u0018#", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", ":`bAC6B\\(~\b>=|\u0012>", ">nX;g,K6\u0015\bye,\n\u0017", "D`[BX", "5dc\u001db0Gb\u0019\f^g7\r\u0018\u0012a\t'\u0003@\u000e", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "Adc\u001db0Gb\u0019\f^g7\r\u0018\u0012a\t'\u0003@\u000e", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", ">nX;g,K7\"\n\u000bm\u0011\u0007\u0006", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "Ahi2", "5dc \\A>\u001b\r{\u000ff\u0013I\u000b", "DhTD66GT\u001d\u0001\u000bk(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "5dc#\\,P1#\b{b.\r\u0016+t\u00042\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#n$7\u007fs8VD?mD+\u0011weC\u00109", "/vP6g\u0017HW\"\u000ezk\f\u000e\t8tm&\u0006K\u0001", Global.BLANK, "0k^0^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "2hb=T;<V\u0004\t~g;|\u0016\u000fv\u007f1\u000b", ">nX;g,K3*~\u0004m", ">`b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp$\u0003q:$", "4na\u0012T*A1)\f\b^5\fs9i\t7{Mc\u0013 Fv\u000eI", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "=m2.a*>Z\u0004\t~g;|\u0016\u0013n\u000b8\u000b", "=m32a:Bb-\\}Z5~\t", "=m32g(<V", "=m?<\\5MS&^\f^5\f", "0nd;W:", "=m?<\\5MS&^\f^5\fP\u00120\u000b\u0015\fJt", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjH\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N]J/~S\u0001*\u00120R\u0011;uJv \u0012>ypO6!G\u0003$`=7v\u001c>#j", "=mE6X>\u001c]\"\u007f~`<\n\u0005>i\n1YC| \u0019G", "@db2g\u0017HW\"\u000ezk\u0010\u0006\u0014?tb$\u0005?\b\u0017$", "CoS.g,", "CoS.g,|c\u001dx\b^3|\u0005=e", "\u001enX;g,K3*~\u0004m\u000fx\u0012.l\u007f5YJ\u000e!'Vs\u0017<", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements SuspendingPointerInputModifierNode, PointerInputScope, Density {
    public static final int $stable = 0;
    private Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> _pointerInputHandler;
    private long boundsSize;
    private PointerEvent currentEvent;
    private final MutableVector<PointerEventHandlerCoroutine<?>> dispatchingPointerHandlers;
    private boolean interceptOutOfBoundsChildEvents;
    private Object key1;
    private Object key2;
    private Object[] keys;
    private PointerEvent lastPointerEvent;
    private final MutableVector<PointerEventHandlerCoroutine<?>> pointerHandlers;
    private Job pointerInputJob;

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? null : obj, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : obj2, (i2 & 4) != 0 ? null : objArr, function2);
    }

    public SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this._pointerInputHandler = function2;
        this.currentEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        this.pointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.dispatchingPointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = IntSize.Companion.m6813getZeroYbymL2g();
    }

    public final void update$ui_release(Object obj, Object obj2, Object[] objArr, Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        boolean z2 = !Intrinsics.areEqual(this.key1, obj);
        this.key1 = obj;
        if (!Intrinsics.areEqual(this.key2, obj2)) {
            z2 = true;
        }
        this.key2 = obj2;
        Object[] objArr2 = this.keys;
        if (objArr2 != null && objArr == null) {
            z2 = true;
        }
        if (objArr2 == null && objArr != null) {
            z2 = true;
        }
        boolean z3 = (objArr2 == null || objArr == null || Arrays.equals(objArr, objArr2)) ? z2 : true;
        this.keys = objArr;
        if (z3) {
            resetPointerInputHandler();
        }
        this._pointerInputHandler = function2;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputHandler(Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        resetPointerInputHandler();
        this._pointerInputHandler = function2;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public Function2<PointerInputScope, Continuation<? super Unit>, Object> getPointerInputHandler() {
        return this._pointerInputHandler;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.requireLayoutNode(this).getViewConfiguration();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public long mo702getSizeYbymL2g() {
        return this.boundsSize;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc */
    public long mo701getExtendedTouchPaddingNHjbRc() {
        long j2 = mo711toSizeXkaWNTQ(getViewConfiguration().mo5670getMinimumTouchTargetSizeMYxV2XQ());
        long jMo702getSizeYbymL2g = mo702getSizeYbymL2g();
        return SizeKt.Size(Math.max(0.0f, Size.m4006getWidthimpl(j2) - IntSize.m6808getWidthimpl(jMo702getSizeYbymL2g)) / 2.0f, Math.max(0.0f, Size.m4003getHeightimpl(j2) - IntSize.m6807getHeightimpl(jMo702getSizeYbymL2g)) / 2.0f);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public void setInterceptOutOfBoundsChildEvents(boolean z2) {
        this.interceptOutOfBoundsChildEvents = z2;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetPointerInputHandler();
        super.onDetach();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onViewConfigurationChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void resetPointerInputHandler() {
        Job job = this.pointerInputJob;
        if (job != null) {
            job.cancel((CancellationException) new PointerInputResetException());
            this.pointerInputJob = null;
        }
    }

    private final void forEachCurrentPointerHandler(PointerEventPass pointerEventPass, Function1<? super PointerEventHandlerCoroutine<?>, Unit> function1) {
        MutableVector<PointerEventHandlerCoroutine<?>> mutableVector;
        int size;
        synchronized (this.pointerHandlers) {
            try {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
                mutableVector2.addAll(mutableVector2.getSize(), this.pointerHandlers);
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        try {
            int i2 = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i2 == 1 || i2 == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    PointerEventHandlerCoroutine<?>[] content = mutableVector3.getContent();
                    int i3 = 0;
                    do {
                        function1.invoke(content[i3]);
                        i3++;
                    } while (i3 < size2);
                }
            } else if (i2 == 3 && (size = (mutableVector = this.dispatchingPointerHandlers).getSize()) > 0) {
                int i4 = size - 1;
                PointerEventHandlerCoroutine<?>[] content2 = mutableVector.getContent();
                do {
                    function1.invoke(content2[i4]);
                    i4--;
                } while (i4 >= 0);
            }
        } finally {
            InlineMarker.finallyStart(1);
            this.dispatchingPointerHandlers.clear();
            InlineMarker.finallyEnd(1);
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo546onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.boundsSize = j2;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        if (this.pointerInputJob == null) {
            this.pointerInputJob = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1, null);
        }
        dispatchPointerEvent(pointerEvent, pointerEventPass);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = true;
                break;
            } else if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i2))) {
                break;
            } else {
                i2++;
            }
        }
        if (z2) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        PointerEvent pointerEvent = this.lastPointerEvent;
        if (pointerEvent == null) {
            return;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (changes.get(i2).getPressed()) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                ArrayList arrayList = new ArrayList(changes2.size());
                int size2 = changes2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    PointerInputChange pointerInputChange = changes2.get(i3);
                    arrayList.add(new PointerInputChange(pointerInputChange.m5383getIdJ3iCeTQ(), pointerInputChange.getUptimeMillis(), pointerInputChange.m5385getPositionF1C5BW0(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.m5385getPositionF1C5BW0(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), 0, 0L, 1536, (DefaultConstructorMarker) null));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList);
                this.currentEvent = pointerEvent2;
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Initial);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Main);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Final);
                this.lastPointerEvent = null;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яĭ\u0014D57\u001eqܜLDyt\fA\u001c0\u0013.X~*,\u0018x\u000ff\u000198ǏmHDR[*\u0015l\u00044:[,qI<]\u001a\f'\u0011OThon`Z\u0013C\u0015\t\u001ex\u0001,Qǁ\u0001](\u000f:Bu?;M\u0006=A`z:\r @\"@ц\r\u0001(+P\u0010||KK\"\u00128@v<Z\r[\f\"Ň\u000e>6\u0001&\\uޮ>H\u0003]B/)\u0004qB\\-g0\u0013M\u0015FZ'\u0015vw\u001e3@=<\u001d%i\u0003\u000fRaC\u000b?\b=\rh='3Iy]<ݜ\u0002*ƃSQ\u0013ƞ\u0001%\r\u0005\u007f`<'YP\u0014Q`\u00108wAz;>D\u001f\u00161V1E v\n\u001e3+Ɂ\u0002Bг\u0006^P\u0004CuD9=\u007fa7i\u001ftty;GT}\u07bdCڟ\"#\u000f\u0013iib3x\u0015Iz(W?xX?^M8\u0002\u0006\u0002\u0012\u001az\u0002X*`K\u000eY\u0014\u0011\\#U;i\\;!\u001a\b\u0011]u\"\u001d`\u0017y\u001a\\Vl:t&9:\tBɮr\u0012K\u007fÏXX:?\u0016_b6\u0016\bYP|yB 3@~Sv\u001b\u0003M\f<UTtjq\u0010q\rg;n3cQs\u0018qX\u0007\u0016O<)5\u0007hRW\u001c\\r'Pgv\u001fݻ{{J\u0005RƥpƐu\u001cBcy^jM`\u00054A\b-)a`g\u001e/\u0005724\u0002$#;1uj$\b\t~H<~p\"[Aa=),e$x4CS5\u0001\u0004\u0004WibFz\"D*ʀ\u007f \u001cP\u007f֮mˮ\u0017\u000f\r`z\u0017;~dr\u0014\fu\u0012U6Cɂ\u000eĉg֫Թ\flvhn(\u0013dbP:v\r-K\b\u0013>@ӫEܢFϊӝ\u000f]D\t\u0001C\"Q\\y\u0015\u0005MYM\u0001\u001e`Cޞ,з&ݴə{\u00165Wo!2\b<;z\u000fT0\u000e\u0004Zs\\̉aҌ\\1ק7Ծ˕\u0003@(hzH\u000b`x9 B7o53v{+ݽUҎL\nʹ|օ¡0\u000fv\u001bi\u0001[\u0005\f{F_X<k}Br\nѱ\u0010µR܊ƽqMbTXYR \n|\u0007\u0012JMHV\u0006\u001eOލ\u0005\u0605\u0017ܽװ?d\u000b\t\u0017i|AJS#C\u0003y.\u0010)>\r݂\u000eƘ1߿Ǡ?X\u0014\"\u0007 \u001fS\u0013/]`Oy)~=\u0004dׅ4y\u001a{\u0018l/\u0012F)SKQa˚NȤeއŠHV?m6#I S1[I0t,GW)2Ʃ\u000bֽ\u0017ӽܫF\u001a!\u000e_f(\u000f>2#U\u0013\r\rv@v\u0019ơ!Ə}yֽ\rڳ\u009f\u0013\r\u001f&\u0001E+EZ\"\u00107qX)\u0017rcMѱ{ߦE\u001aԇ\u0005זϦAKpj5S(_I\u0003  N-Zȏ-Ǜ[\u000enŊ.-H\u0019\n\u001cr\u0004\u0019\u0013\u0007܀20!Ɩt˹2\b>ОRE\u0010\u001avY\u001a\u007fw͏)߿p\fJŮ\u0001z\u0010lzm?g\u0019\u000e~1\u0005\u0006%\u0002'ɖ\u000bߓQ2+Z`G\u001fapj\u001f\u000f,\u0015T/l\u001c9Ђ\u0013˹gl\tmUl\u001b=\u007f\u00048tI0\u000124sPǸ\u0006חSӏض:U؉Bh!^rWe$/|6{\r\fW$3\u0013\u001fյ\u0014ӥ8J\u000b jGE+oo\u001b`x\u000f\u0014GY&O=h>IQ\tЦ{Ĭz\u0011\u000b̌3\r\u000eEZ\t!\u001c\u001e\u0001\u0004ČVڭ\u0019ś܋#l҉\u0007*cG>_\u0016Ba \u001fMr8N]\u0013nrԴSߥE\u001d)\u0003\u001bX\u0014\u0011ޡ\u0019>rTYЙF/{\t\rE\u0019ܐo\u0013"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001[&<XCDj8'\u0017Sk=\u0010r,[Z0R\\]\u0014fQv>\u0018\u0012gvX*\rhaL+-/A#\u0011;I\u000f\u001by\u0001\u0015%p1soIV\u001d%\u0004\"\u007fQ8lOY5", Global.BLANK, "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "1n\\=_,MW#\b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u0004>[N;t3\"\u001ejLC\u000bl;N\u0004\u000bPW^;D\\qA\u0015\u0016Z\u001b75\f\u0005=I/u\u001a\u001e%\u0012;P\u0006D2~\u0016#\u0018EytKV\u001e\u0011W\u001f~P-qVUn}QJ\u001b&\u001b", "/vP6g\u0017:a'", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp$\u0003q:$", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "5dc\u0010b5MS,\u000e", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "1ta?X5M3*~\u0004m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", "5dc\u0010h9KS\"\u000eZo,\u0006\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@0?]\u0007/7z_\u0019WGDz4+tyaB\u00169", "2d]@\\;R", "", "5dc\u0011X5LW(\u0013", "u(5", "3wc2a+>R\b\t\u000b\\/g\u0005.d\u00041}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc\u0012k;>\\\u0018~yM6\r\u00072P{'zD\n\u0019^0RUAs\u00123", "u(9", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", ">nX;g,K/+z~m,\n", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc \\A>\u001b\r{\u000ff\u0013I\u000b", "DhTD66GT\u001d\u0001\u000bk(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "5dc#\\,P1#\b{b.\r\u0016+t\u00042\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#n$7\u007fs8VD?mD+\u0011weC\u00109", "/vP6g\u0017HW\"\u000ezk\f\u000e\t8t", ">`b@", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjHq_:\\L\u000eMV]3`[<;\u001e\u001fd\u001e]/\u0016\u0005g\u000b\u0002xMF#\u0011<E\u0011?r\naYt:f\u0002> \u0017C\u0003\u0017?+&mFWnO", "1`]0X3", "", "1`d@X", "", "=eU2e\u0017HW\"\u000ezk\f\u000e\t8t", "3uT;g", "@dbB`,0W(\u0002", "@dbB_;", "\u001aj^A_0G\u001d\u0006~\tn3\f^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "Ehc5G0FS#\u000f\n", "\"", "Bh\\2@0EZ\u001d\r", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu\u001es =TGD52(\"rqH\u000bl,\\@\u0005QU]0ebnL\u0018\u001ccc\u0012\u0012\u0012\u0001j=mu@@!Q\u0016F\u0007;f\u0010a", "Ehc5G0FS#\u000f\nH9e\u00196l", "@nd;W\u001bH>,", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "@nd;W\u001bH>,FE/~G\u000e)4", "uE\u0018\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "@nd;W\u001bH>,FBKxo\u0003\u007fo", "uI\u0018\u0016", "Bn3=", "Bn3= \u000e:<d]n:", "uI\u0018\u0013", "Bn3= <\u000bc#ljF", "uE\u0018\u0013", "uH\u0018\u0013", "Bn3=F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "Bn3=F0SS`\u0005Bk-my\u0017", "uI\u0018\u0017", "Bn?E", "Bn?E v\u000f&c\u0004t-", "Bn?E s+ \fxKh", "BnA2V;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGc%3hS", "BnB6m,", "BnB6m,\u0006F\u001fzlG\u001bh", "BnB=", "BnB= vQ;\tNyh", "uE\u0018\u0017", "BnB= 2)he`\u000f-", "uH\u0018\u0017", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, Continuation<R> {
        private final /* synthetic */ SuspendingPointerInputModifierNodeImpl $$delegate_0;
        private final Continuation<R> completion;
        private CancellableContinuation<? super PointerEvent> pointerAwaiter;
        private PointerEventPass awaitPass = PointerEventPass.Main;
        private final CoroutineContext context = EmptyCoroutineContext.INSTANCE;

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public int mo703roundToPxR2X_6o(long j2) {
            return this.$$delegate_0.mo703roundToPxR2X_6o(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public int mo704roundToPx0680j_4(float f2) {
            return this.$$delegate_0.mo704roundToPx0680j_4(f2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public float mo705toDpGaN1DYA(long j2) {
            return this.$$delegate_0.mo705toDpGaN1DYA(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo706toDpu2uoSUM(float f2) {
            return this.$$delegate_0.mo706toDpu2uoSUM(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo707toDpu2uoSUM(int i2) {
            return this.$$delegate_0.mo707toDpu2uoSUM(i2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public long mo708toDpSizekrfVVM(long j2) {
            return this.$$delegate_0.mo708toDpSizekrfVVM(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public float mo709toPxR2X_6o(long j2) {
            return this.$$delegate_0.mo709toPxR2X_6o(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public float mo710toPx0680j_4(float f2) {
            return this.$$delegate_0.mo710toPx0680j_4(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        public Rect toRect(DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public long mo711toSizeXkaWNTQ(long j2) {
            return this.$$delegate_0.mo711toSizeXkaWNTQ(j2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public long mo712toSp0xMU5do(float f2) {
            return this.$$delegate_0.mo712toSp0xMU5do(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo713toSpkPz2Gy4(float f2) {
            return this.$$delegate_0.mo713toSpkPz2Gy4(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo714toSpkPz2Gy4(int i2) {
            return this.$$delegate_0.mo714toSpkPz2Gy4(i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventHandlerCoroutine(Continuation<? super R> continuation) {
            this.completion = continuation;
            this.$$delegate_0 = SuspendingPointerInputModifierNodeImpl.this;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public PointerEvent getCurrentEvent() {
            return SuspendingPointerInputModifierNodeImpl.this.currentEvent;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* JADX INFO: renamed from: getSize-YbymL2g */
        public long mo5296getSizeYbymL2g() {
            return SuspendingPointerInputModifierNodeImpl.this.boundsSize;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public ViewConfiguration getViewConfiguration() {
            return SuspendingPointerInputModifierNodeImpl.this.getViewConfiguration();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc */
        public long mo5295getExtendedTouchPaddingNHjbRc() {
            return SuspendingPointerInputModifierNodeImpl.this.mo701getExtendedTouchPaddingNHjbRc();
        }

        public final void offerPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
            CancellableContinuation<? super PointerEvent> cancellableContinuation;
            if (pointerEventPass != this.awaitPass || (cancellableContinuation = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m8980constructorimpl(pointerEvent));
        }

        public final void cancel(Throwable th) {
            CancellableContinuation<? super PointerEvent> cancellableContinuation = this.pointerAwaiter;
            if (cancellableContinuation != null) {
                cancellableContinuation.cancel(th);
            }
            this.pointerAwaiter = null;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.context;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            MutableVector mutableVector = SuspendingPointerInputModifierNodeImpl.this.pointerHandlers;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (mutableVector) {
                suspendingPointerInputModifierNodeImpl.pointerHandlers.remove(this);
                Unit unit = Unit.INSTANCE;
            }
            this.completion.resumeWith(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object withTimeoutOrNull(long r6, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<? super T> r9) {
            /*
                r5 = this;
                boolean r0 = r9 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                if (r0 == 0) goto L24
                r4 = r9
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r4 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                int r0 = r2 + r1
                r2 = r2 | r1
                int r0 = r0 - r2
                if (r0 == 0) goto L24
                int r0 = r4.label
                int r0 = r0 - r1
                r4.label = r0
            L16:
                java.lang.Object r3 = r4.result
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r0 = 1
                if (r1 == 0) goto L36
                if (r1 != r0) goto L2e
                goto L2a
            L24:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r4 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r4.<init>(r5, r9)
                goto L16
            L2a:
                kotlin.ResultKt.throwOnFailure(r3)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L42
                goto L43
            L2e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L36:
                kotlin.ResultKt.throwOnFailure(r3)
                r4.label = r0     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L42
                java.lang.Object r3 = r5.withTimeout(r6, r8, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L42
                if (r3 != r2) goto L43
                return r2
            L42:
                r3 = 0
            L43:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeoutOrNull(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object withTimeout(long r11, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r13, kotlin.coroutines.Continuation<? super T> r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                if (r0 == 0) goto L2b
                r2 = r14
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r2 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) r2
                int r0 = r2.label
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = (-1) - r0
                int r0 = (-1) - r3
                r1 = r1 | r0
                int r0 = (-1) - r1
                if (r0 == 0) goto L2b
                int r0 = r2.label
                int r0 = r0 - r3
                r2.label = r0
            L19:
                java.lang.Object r5 = r2.result
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r2.label
                r1 = 1
                if (r0 == 0) goto L3d
                if (r0 != r1) goto L35
                java.lang.Object r4 = r2.L$0
                kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4
                goto L31
            L2b:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r2 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                r2.<init>(r10, r14)
                goto L19
            L31:
                kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L89
                goto L81
            L35:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L3d:
                kotlin.ResultKt.throwOnFailure(r5)
                r4 = 0
                int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r0 > 0) goto L60
                kotlinx.coroutines.CancellableContinuation<? super androidx.compose.ui.input.pointer.PointerEvent> r4 = r10.pointerAwaiter
                if (r4 == 0) goto L60
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                kotlin.Result$Companion r0 = kotlin.Result.Companion
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r0.<init>(r11)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
                java.lang.Object r0 = kotlin.Result.m8980constructorimpl(r0)
                r4.resumeWith(r0)
            L60:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r0 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this
                kotlinx.coroutines.CoroutineScope r4 = r0.getCoroutineScope()
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r7 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
                r0 = 0
                r7.<init>(r11, r10, r0)
                kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                kotlinx.coroutines.Job r4 = kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
                r2.L$0 = r4     // Catch: java.lang.Throwable -> L89
                r2.label = r1     // Catch: java.lang.Throwable -> L89
                java.lang.Object r5 = r13.invoke(r10, r2)     // Catch: java.lang.Throwable -> L89
                if (r5 != r3) goto L81
                return r3
            L81:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r0 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
                r4.cancel(r0)
                return r5
            L89:
                r1 = move-exception
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r0 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
                r4.cancel(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeout(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public Object awaitPointerEvent(PointerEventPass pointerEventPass, Continuation<? super PointerEvent> continuation) throws Throwable {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = cancellableContinuationImpl;
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }
    }

    private final void dispatchPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        MutableVector<PointerEventHandlerCoroutine<?>> mutableVector;
        int size;
        synchronized (this.pointerHandlers) {
            MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
            mutableVector2.addAll(mutableVector2.getSize(), this.pointerHandlers);
        }
        try {
            int i2 = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i2 == 1 || i2 == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    PointerEventHandlerCoroutine<?>[] content = mutableVector3.getContent();
                    int i3 = 0;
                    do {
                        content[i3].offerPointerEvent(pointerEvent, pointerEventPass);
                        i3++;
                    } while (i3 < size2);
                }
            } else if (i2 == 3 && (size = (mutableVector = this.dispatchingPointerHandlers).getSize()) > 0) {
                int i4 = size - 1;
                PointerEventHandlerCoroutine<?>[] content2 = mutableVector.getContent();
                do {
                    content2[i4].offerPointerEvent(pointerEvent, pointerEventPass);
                    i4--;
                } while (i4 >= 0);
            }
        } finally {
            this.dispatchingPointerHandlers.clear();
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public <R> Object awaitPointerEventScope(Function2<? super AwaitPointerEventScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(cancellableContinuationImpl2);
        synchronized (this.pointerHandlers) {
            this.pointerHandlers.add(pointerEventHandlerCoroutine);
            Continuation<Unit> continuationCreateCoroutine = ContinuationKt.createCoroutine(function2, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            Result.Companion companion = Result.Companion;
            continuationCreateCoroutine.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
            Unit unit = Unit.INSTANCE;
        }
        cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                pointerEventHandlerCoroutine.cancel(th);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
