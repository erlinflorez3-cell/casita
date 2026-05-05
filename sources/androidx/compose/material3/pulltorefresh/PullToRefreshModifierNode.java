package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory;
import cz.msebera.android.httpclient.HttpStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
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
/* JADX INFO: compiled from: PullToRefresh.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яd\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\":\u001b\u007fјnjO0LeV.ZS0\u000fs{J$cҕyCQU\"}(\tWNulvJ`\u0018K\u000f\u001c\u0016\u0001j2U]xk\u0018\u00172HxG3coE9fy>\u000562*8\u007f\u0006\t\u001a@H\u0018v\u0001KQÈ(ؓpphQ=M3\u001aB\u0006l!AOlk\\8`l\f=?-\u0011mZT7a@|{\u0013tY7\u0011\u0005h6+n:E\u00193[\u001b\u0007\u0001dO\u0007M{U\u0005\u00172ݳ/I\u0002c~d\u000eH-+}\u0013$ùdػ\tQnAo7]\u001acP<.>߁:Ɂ@\u0004\u001c;oN<d2f6\u001cyt;kN\t\u001a^p9+eDQ=\u007fad\u007f\u001bȑPĥޅ\u001dP=7\u0013If)\u000f,9[\u0003\u0014')c|\u0006\u0010IQnvxR\u0018\u0019Um2*\u0013\u00068>HG.h,\u0015<W=7\nzi5ɶ\u0001҆זkx\u000b#v\u00172kV\u0005:nD|Z\r\u001a\u0015\\d31\u0017Ԑ\u0017ą\u0010۳ɟX\t\u0004N!g%\u0018Ji=\u0010|\t\u0019mx\bu\nSh\u0017;g/\u0004\u000e\u0006z%GΉPүߧeT|]M\u0007+\u0019f2ZS:h\r,0~`j>\u0006Bͬ\rܟ\u00172M?d8:\u007f1\\CNS0PN\u0015\t\u000eh\u001fPUԡ5ʗ\u0007m<v\u000f\u0010^lA\u0019u\u000ba,+nR1ObM\u0019TcX)r=yȗѷsõKwTIR\u0003$\rm}&)(Iq1C'\u001d\u0014yJ\u00104]L!h(ˮ\u001eؠ~\t\u0002ҸSj4\u007f\u0016\u0004\u0011.f\u0005Xj%/0xvrQ\u000b;ч\u0006ӶJ\u0007Oϊl\ra@W\f#[BjF\u0018U+,B\u0019oP\u001b\fԉOے!\u0016\u007fҡ\u007f3oa\u0002u>{r\u000fTz\u0014\t\u0003Ϫ\"̔f]eЦS:Ox\r^B&r$Pj;\n\u0016e!4;A~\u0002;ݨXиQ\u000fG\u007fl+:\u001dAniB+o,=\u0005ʅ6ϵG\n\u001c٫['\u0017ra\u000e\u000eoQ\u0004\u0019r_*\u0019\u0006In@'\u0014չbΩa־߮\u0005r͛:OCb\u0013g!&:UJ\u0018+EZ\u0014\u0014%K\u0012T\f'\u0017`o*{-\u0558Vܢ`Z`\u0007fsnPz*\r?K\u001e'Ca\t{Wl/\u0012@7\u0014[Iq˅ʹ~ݝ);LV?N6o\u0019\rK\u000fQY\"8\ny7\u0003£o\u0015@\u001b\u0003ܪ^F\u001aAQ\u0017~ۤ4."}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u00025<`\r*Dm\u0017;MQ>5\u001f.\u001coPCsc-[v5J4X+`Sv=!zd\rN\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r$@o~8LC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9kF~0?g\u0002/;w\u001f\u0015WA7r\u0012(\u001evqA\u0007p\u0014Xu+HPN9E\\q=i", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UT1PUN*kV|Fi", "7rA2Y9>a\u001c\u0003\u0004`", "", "=mA2Y9>a\u001c", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "3mP/_,=", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u00025<`\r*Dm\u0017;MQ>5\u001f.\u001coPCsc-[v5J:](kRH", "Bga2f/HZ\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu,T\u00127LPEo31^fkA\u0012m:N@/C[N9`Ny\u000b]\u001dj\u0015U:\u0017\u0012YB1nR:hr<P\t*rm\f\u0017\u001b5xs0e\fVyjV(/rU`c\u0003\u0011FVjsh\u0015n\u001diC6+]P\u0019\u001cd`5\u0019Y]\u001a\u0001a\u0007weV#\b  Ks[S\u001b3F", "/cYBf;>Rw\u0003\tm(\u0006\u0007/P\u0010/\u0003@\u007f", "", "5dc\u000eW1Na(~y=0\u000b\u0018+n}(fP\b\u001e\u0017F", "u(5", "\nrTA \u0006\u0017", "2hbAT5<S\u0004\u000f\u0002e,{", "5dc\u0011\\:MO\"|zI<\u0004\u0010/d", "Adc\u0011\\:MO\"|zI<\u0004\u0010/d", "uE\u0018#", "2hbAT5<S\u0004\u000f\u0002e,{G.e\u0007(}<\u0010\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "5dc\u0012a(;Z\u0019}", "u(I", "Adc\u0012a(;Z\u0019}", "uY\u0018#", "Adc\u001fX-KS'\u0002~g.", "<dbAX+,Q&\t\u0002e\u0015\u0007\b/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r\u001c4t\u0016\u0017WB;A", "5dc\u001ca\u0019>T&~\ta", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Adc\u001ca\u0019>T&~\ta", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", ">q^4e,La", "5dc\u001de6@`\u0019\r\t", "5dc g(MS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn@i\u0005'Fw#.NP;y7g\u007fxh@um\u0019Nw4GZQ\u001akN\u0002=i", "Adc g(MS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@0E`\u0005/Az\u0016/ZCIn}\t%oh(\u0011P,O\u0004'UO<;Xar\u0013W\u0003", "5dc![9>a\u001c\t\u0002]s[\\\u000fjO)c", "Adc![9>a\u001c\t\u0002]sGY\u00020\u0005\"J", "\u0014", "Bga2f/HZ\u0018i\u000e", "", "5dc![9>a\u001c\t\u0002]\u0017\u0010", "u(8", "DdaA\\*:Z\u0003\u007f{l,\f", "5dc#X9MW\u0017z\u0002H-}\u0017/t", "Adc#X9MW\u0017z\u0002H-}\u0017/t", "DdaA\\*:Z\u0003\u007f{l,\fG.e\u0007(}<\u0010\u0017", "/mX:T;>B#a~]+|\u0012", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "/mX:T;>B#m}k,\u000b\f9l~", "1`[0h3:b\u0019ozk;\u0001\u0007+li)|N\u0001&", "1n]@h4>/*z~e(y\u0010/O\u0001)\n@\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "/uP6_(;Z\u0019", "1n]@h4>/*z~e(y\u0010/O\u0001)\n@\u0010^~-7pQJ\u0015", "uI\u0018\u0017", "=m0Ag(<V", "=m?<f;,Q&\t\u0002e", "1n]@h4>R", "And?V,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3Ud1WYL,2", "=m?<f;,Q&\t\u0002es[\u001e\u0019Qsrc", "uI9\u0016\u001c\u0011", "=m??X\rEW\"\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "=m??X\rEW\"\u0001BJ\u001e\u0007\u0011zM\n", "uI;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007uzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "=m??X\u001a<`#\u0006\u0002", "=m??X\u001a<`#\u0006\u0002&\u0016\u0012gza].", "uI8u=", "=mA2_,:a\u0019", "Dd[<V0Mg", "uE;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007uzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "CoS.g,", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PullToRefreshModifierNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, NestedScrollConnection {
    public static final int $stable = 8;
    private final MutableFloatState distancePulled$delegate;
    private boolean enabled;
    private boolean isRefreshing;
    private DelegatableNode nestedScrollNode;
    private Function0<Unit> onRefresh;
    private PullToRefreshState state;
    private float threshold;
    private final MutableFloatState verticalOffset$delegate;

    /* JADX INFO: renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1, reason: invalid class name */
    /* JADX INFO: compiled from: PullToRefresh.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\u000f\u0015\r\u000e\u0017\u0013\u0017\u000b\r\u001a\u000e\u001d\u0013Y|#\u001b\u001c\u0005!\u0005\u0019\u001b(\u001c+!\u0007* &$(%3\u00102(*", f = "\u001dA76\u001d7\u0019++6(5)m*2", i = {0}, l = {HttpStatus.SC_NOT_ACCEPTABLE}, m = "0>:?4H:*F B>?AK", n = {"c^kY"}, s = {"xQ^"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshModifierNode.this.animateToHidden(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PullToRefresh.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\u000f\u0015\r\u000e\u0017\u0013\u0017\u000b\r\u001a\u000e\u001d\u0013Y|#\u001b\u001c\u0005!\u0005\u0019\u001b(\u001c+!\u0007* &$(%3\u00102(*", f = "\u001dA76\u001d7\u0019++6(5)m*2", i = {0}, l = {400}, m = "0>:?4H:*F,AL@OEMKD", n = {"c^kY"}, s = {"xQ^"})
    static final class C07301 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C07301(Continuation<? super C07301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return PullToRefreshModifierNode.this.animateToThreshold(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PullToRefresh.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\u000f\u0015\r\u000e\u0017\u0013\u0017\u000b\r\u001a\u000e\u001d\u0013Y|#\u001b\u001c\u0005!\u0005\u0019\u001b(\u001c+!\u0007* &$(%3\u00102(*", f = "\u001dA76\u001d7\u0019++6(5)m*2", i = {0, 0, 1, 1}, l = {359, 362}, m = ">>#7?96I<", n = {"c^kY", "e[nUU_V`", "c^kY", "e[nUU_V`"}, s = {"xQ^", "rQ^", "xQ^", "rQ^"})
    static final class C07321 extends ContinuationImpl {
        float F$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C07321(Continuation<? super C07321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshModifierNode.this.onRelease(0.0f, this);
        }
    }

    public /* synthetic */ PullToRefreshModifierNode(boolean z2, Function0 function0, boolean z3, PullToRefreshState pullToRefreshState, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, function0, z3, pullToRefreshState, f2);
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    public final void setRefreshing(boolean z2) {
        this.isRefreshing = z2;
    }

    public final Function0<Unit> getOnRefresh() {
        return this.onRefresh;
    }

    public final void setOnRefresh(Function0<Unit> function0) {
        this.onRefresh = function0;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z2) {
        this.enabled = z2;
    }

    public final PullToRefreshState getState() {
        return this.state;
    }

    public final void setState(PullToRefreshState pullToRefreshState) {
        this.state = pullToRefreshState;
    }

    /* JADX INFO: renamed from: getThreshold-D9Ej5fM, reason: not valid java name */
    public final float m3020getThresholdD9Ej5fM() {
        return this.threshold;
    }

    /* JADX INFO: renamed from: setThreshold-0680j_4, reason: not valid java name */
    public final void m3021setThreshold0680j_4(float f2) {
        this.threshold = f2;
    }

    private PullToRefreshModifierNode(boolean z2, Function0<Unit> function0, boolean z3, PullToRefreshState pullToRefreshState, float f2) {
        this.isRefreshing = z2;
        this.onRefresh = function0;
        this.enabled = z3;
        this.state = pullToRefreshState;
        this.threshold = f2;
        this.nestedScrollNode = NestedScrollNodeKt.nestedScrollModifierNode(this, null);
        this.verticalOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.distancePulled$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getVerticalOffset() {
        return this.verticalOffset$delegate.getFloatValue();
    }

    private final void setVerticalOffset(float f2) {
        this.verticalOffset$delegate.setFloatValue(f2);
    }

    private final float getDistancePulled() {
        return this.distancePulled$delegate.getFloatValue();
    }

    private final void setDistancePulled(float f2) {
        this.distancePulled$delegate.setFloatValue(f2);
    }

    private final float getAdjustedDistancePulled() {
        return getDistancePulled() * 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getThresholdPx() {
        return ((Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalDensity())).mo704roundToPx0680j_4(this.threshold);
    }

    private final float getProgress() {
        return getAdjustedDistancePulled() / getThresholdPx();
    }

    /* JADX INFO: renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PullToRefresh.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\u000f\u0015\r\u000e\u0017\u0013\u0017\u000b\r\u001a\u000e\u001d\u0013Y|#\u001b\u001c\u0005!\u0005\u0019\u001b(\u001c+!\u0007* &$(%3\u00102(*i66\n>?-06r\u0001", f = "\u001dA76\u001d7\u0019++6(5)m*2", i = {}, l = {OlympusImageProcessingMakernoteDirectory.TagWbGLevel, 289}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C07311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C07311(Continuation<? super C07311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PullToRefreshModifierNode.this.new C07311(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (PullToRefreshModifierNode.this.isRefreshing()) {
                    this.label = 1;
                    if (PullToRefreshModifierNode.this.getState().snapTo(1.0f, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.label = 2;
                    if (PullToRefreshModifierNode.this.getState().snapTo(0.0f, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        delegate(this.nestedScrollNode);
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C07311(null), 3, null);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo1094onPreScrollOzD1aCk(long j2, int i2) {
        if (!this.state.isAnimating() && this.enabled) {
            if (NestedScrollSource.m5268equalsimpl0(i2, NestedScrollSource.Companion.m5280getUserInputWNlRxjI()) && Offset.m3938getYimpl(j2) < 0.0f) {
                return m3019consumeAvailableOffsetMKHz9U(j2);
            }
            return Offset.Companion.m3953getZeroF1C5BW0();
        }
        return Offset.Companion.m3953getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo820onPostScrollDzOQY0M(long j2, long j3, int i2) {
        if (!this.state.isAnimating() && this.enabled) {
            if (NestedScrollSource.m5268equalsimpl0(i2, NestedScrollSource.Companion.m5280getUserInputWNlRxjI())) {
                long jM3019consumeAvailableOffsetMKHz9U = m3019consumeAvailableOffsetMKHz9U(j3);
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new PullToRefreshModifierNode$onPostScroll$1(this, null), 3, null);
                return jM3019consumeAvailableOffsetMKHz9U;
            }
            return Offset.Companion.m3953getZeroF1C5BW0();
        }
        return Offset.Companion.m3953getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo1093onPreFlingQWom1Mo(long r7, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1
            if (r0 == 0) goto L48
            r5 = r9
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1 r5 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L48
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L34
            if (r0 != r2) goto L4e
            float r1 = r5.F$0
            kotlin.ResultKt.throwOnFailure(r4)
        L25:
            java.lang.Number r4 = (java.lang.Number) r4
            float r0 = r4.floatValue()
            long r0 = androidx.compose.ui.unit.VelocityKt.Velocity(r1, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m6866boximpl(r0)
            return r0
        L34:
            kotlin.ResultKt.throwOnFailure(r4)
            float r0 = androidx.compose.ui.unit.Velocity.m6876getYimpl(r7)
            r1 = 0
            r5.F$0 = r1
            r5.label = r2
            java.lang.Object r4 = r6.onRelease(r0, r5)
            if (r4 != r3) goto L47
            return r3
        L47:
            goto L25
        L48:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1 r5 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1
            r5.<init>(r6, r9)
            goto L13
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.mo1093onPreFlingQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PullToRefresh.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\u000f\u0015\r\u000e\u0017\u0013\u0017\u000b\r\u001a\u000e\u001d\u0013Y|#\u001b\u001c\u0005!\u0005\u0019\u001b(\u001c+!\u0007* &$(%3\u00102(*i<8-+?1p~", f = "\u001dA76\u001d7\u0019++6(5)m*2", i = {}, l = {333, 335}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C07331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C07331(Continuation<? super C07331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PullToRefreshModifierNode.this.new C07331(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!PullToRefreshModifierNode.this.isRefreshing()) {
                    this.label = 1;
                    if (PullToRefreshModifierNode.this.animateToHidden(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.label = 2;
                    if (PullToRefreshModifierNode.this.animateToThreshold(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void update() {
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C07331(null), 3, null);
    }

    /* JADX INFO: renamed from: consumeAvailableOffset-MK-Hz9U, reason: not valid java name */
    private final long m3019consumeAvailableOffsetMKHz9U(long j2) {
        float distancePulled;
        if (this.isRefreshing) {
            distancePulled = 0.0f;
        } else {
            float fCoerceAtLeast = RangesKt.coerceAtLeast(getDistancePulled() + Offset.m3938getYimpl(j2), 0.0f);
            distancePulled = fCoerceAtLeast - getDistancePulled();
            setDistancePulled(fCoerceAtLeast);
            setVerticalOffset(calculateVerticalOffset());
        }
        return OffsetKt.Offset(0.0f, distancePulled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onRelease(float r9, kotlin.coroutines.Continuation<? super java.lang.Float> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C07321
            if (r0 == 0) goto L8c
            r7 = r10
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 r7 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C07321) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L8c
            int r0 = r7.label
            int r0 = r0 - r1
            r7.label = r0
        L16:
            java.lang.Object r6 = r7.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.label
            r4 = 2
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L46
            if (r0 == r3) goto L6e
            if (r0 != r4) goto L92
            float r9 = r7.F$0
            java.lang.Object r1 = r7.L$0
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r1 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode) r1
            kotlin.ResultKt.throwOnFailure(r6)
        L30:
            float r0 = r1.getDistancePulled()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L41
        L38:
            r9 = r2
        L39:
            r1.setDistancePulled(r2)
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r9)
            return r0
        L41:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L39
            goto L38
        L46:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r0 = r8.isRefreshing
            if (r0 == 0) goto L52
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r2)
            return r0
        L52:
            float r1 = r8.getAdjustedDistancePulled()
            int r0 = r8.getThresholdPx()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L7d
            r7.L$0 = r8
            r7.F$0 = r9
            r7.label = r3
            java.lang.Object r0 = r8.animateToThreshold(r7)
            if (r0 != r5) goto L6c
            return r5
        L6c:
            r1 = r8
            goto L77
        L6e:
            float r9 = r7.F$0
            java.lang.Object r1 = r7.L$0
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r1 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode) r1
            kotlin.ResultKt.throwOnFailure(r6)
        L77:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r1.onRefresh
            r0.invoke()
            goto L30
        L7d:
            r7.L$0 = r8
            r7.F$0 = r9
            r7.label = r4
            java.lang.Object r0 = r8.animateToHidden(r7)
            if (r0 != r5) goto L8a
            return r5
        L8a:
            r1 = r8
            goto L30
        L8c:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 r7 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1
            r7.<init>(r10)
            goto L16
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.onRelease(float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final float calculateVerticalOffset() {
        if (getAdjustedDistancePulled() <= getThresholdPx()) {
            return getAdjustedDistancePulled();
        }
        float fCoerceIn = RangesKt.coerceIn(Math.abs(getProgress()) - 1.0f, 0.0f, 2.0f);
        return getThresholdPx() + (getThresholdPx() * (fCoerceIn - (((float) Math.pow(fCoerceIn, 2)) / 4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animateToThreshold(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C07301
            if (r0 == 0) goto L4c
            r4 = r6
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 r4 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C07301) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L4c
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L13:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L3a
            if (r0 != r1) goto L52
            java.lang.Object r1 = r4.L$0
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r1 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode) r1
            kotlin.ResultKt.throwOnFailure(r3)
        L27:
            int r0 = r1.getThresholdPx()
            float r0 = (float) r0
            r1.setDistancePulled(r0)
            int r0 = r1.getThresholdPx()
            float r0 = (float) r0
            r1.setVerticalOffset(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L3a:
            kotlin.ResultKt.throwOnFailure(r3)
            androidx.compose.material3.pulltorefresh.PullToRefreshState r0 = r5.state
            r4.L$0 = r5
            r4.label = r1
            java.lang.Object r0 = r0.animateToThreshold(r4)
            if (r0 != r2) goto L4a
            return r2
        L4a:
            r1 = r5
            goto L27
        L4c:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 r4 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1
            r4.<init>(r6)
            goto L13
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.animateToThreshold(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animateToHidden(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.AnonymousClass1
            if (r0 == 0) goto L49
            r4 = r6
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 r4 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.AnonymousClass1) r4
            int r0 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L49
            int r0 = r4.label
            int r0 = r0 - r2
            r4.label = r0
        L19:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 != r1) goto L4f
            java.lang.Object r1 = r4.L$0
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r1 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode) r1
            kotlin.ResultKt.throwOnFailure(r3)
        L2d:
            r0 = 0
            r1.setDistancePulled(r0)
            r1.setVerticalOffset(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L37:
            kotlin.ResultKt.throwOnFailure(r3)
            androidx.compose.material3.pulltorefresh.PullToRefreshState r0 = r5.state
            r4.L$0 = r5
            r4.label = r1
            java.lang.Object r0 = r0.animateToHidden(r4)
            if (r0 != r2) goto L47
            return r2
        L47:
            r1 = r5
            goto L2d
        L49:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 r4 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1
            r4.<init>(r6)
            goto L19
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.animateToHidden(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
