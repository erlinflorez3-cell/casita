package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яċ\u0014D57\u001eqܜLDyt\fA\u001c0\u0013.X~*,(w\u000ff\u000198ǏmH<X[*\u0015k\u00044:[,qI<]\u001a\f1\u0011O\\ʴonPZ\u0013C\u001d\r\u001exp:QU\u0007{\u001a\u000f8Hw?ALwމA`\u000b6\r 8\"@y\u0013\n\"*N\u0011~zQK\u0014\u00126Nx:h\rU\u0005 \u0013\u000e>6\u0001&\\me>H\u0003]Bǂ+\u0003\u007fBV'e1\u0003[#Ͽ|)\u0013Ǹo\u001d[FG7%%\u0002\u00045R\fE\u0013A\u0002=KgU)[O\u0004YFXF\u0013C.\u007f\u0013mt6\\KP\u000f\u0010_*7$h`\u00126|\u0013{;B\u0014\u0012\u0014.`.[ v\f\u001c;\rr\u0002Iг\u0006`H\n\tl~13*K+gF\u0017[og1TG}\u0015\rTŀ/\u001cgƓ\u0013\u05f8d\u0015)\u0003@d?\u0001X=v~:]K\u001f\u001cp\u0019̣p\u0018ΥK\u007f=.YB%XO[gWQo\u0010y\\g-ݓ'ü\u0012ׂVHNW7)E`!\f\tt\u0015\ty\u0002lXbҊ\u0014\u001cΤ\u000b}\u0016Eho\u0006s9%>~\u007flw\u001ce]@ɘufƠ]ny@ ?lkMQ\u0012D(R?\"Muz\u0005\u0007\u001brW\u001a\u0015t(PC\u000fjX\b\n\u007ff\fAfow*pD3/[CVI\u001e\u000bv\u000bFwbx\u0014\u000fVI#1wR\u00029\u000f^\u001b\tyw|Y.\u0013_P;WPc&VY0(L|Q\r/w\u000e\b\u007fLuR3\u0016\u0091Y{.WbM_qU\u0013=3Y6\u0010^]L)ό\u0018˪Pؠ~|\bD\u0004v<+ j\u001f`\u0011nX\u0014l\u0017P<%rk\u0013rF\u0012at\f\u000eϊӝ\u000f[D\u0011;&g\u0005fF\r\u000f/&5\u0003\u007f\"+iCBUfD\u0005D3#,ui\u001e?@ʬϪ*vkO:0^\u0016p\u001fu2ily]\r\r:$\u001b\u0014rLxG B7E=7V\u0012|p\u0005I}\u000f=O~\u0007Z\u001e7V$@!B\u00164\\\u0014ps\f\u000e\"2[''L\u0002u\u001eqY1#J=\u000bQ{y| qU \u0005h\u0013\r>Z\f\u0018dB\u0002bML\u0017zL.R\u00079Q\u0005m\u0014g\u0013\u007ftpU\u0017zV\u0002\u0014n\u000e\u0003-\rZVYxE\u000f\"p܃=ܓ7\u001e\u0007\u000fy4{!l=s<\u0011[-\u000b+j}3|$Y\u000e\u0003FK:f\\#SmMY\nF\u0006W)\u001c \u0006\u000bfa+*\t\u0018ê=Q\u001f<?6lhmd|e=$/m\\\u0001A\u0007\u000b\u0001\u001e> \u000e9\u001a}\u007f f;,fweI`\u0013ӢH)\u0015lEiT|E\u0006ca\u0004]385^oYK\u007f\u0018 Vٴ2XQ`er~\n\f\u0001j\u001a\u007f|z\u00027\u0019\u0001$\u00126bt!\u0013t\u001c\u0007[\u00108\u001a\u0013\r_Bկ#͛++tݩ\u0013Wv\u007f\"c\u001biEά\rөj1^ҳ?9^%!'{7ì\\ϳ\u0015S(ǅa\u0018\"!>)F\fr+&N\u0012v\u0007j}hcĎ;֗.c90`-N+\b\u0006\u001c*\u00039k͊b؉Bd\u0011Ϟ=Ne vjVuK׆5ِ\u0001~P՝a\u001fBY\u000b\u001e\u00135\u000eآ+˝\u0011GhԂTQW:91\u0001EqΣ>цs(~֫SLp\n\u0018*p\u001a)@>ƫ/ĘXA2)_:{{S8Y]PB62GNg˒\\ߣ$Bt\u001c\"T_M\u0012+\u001f\u001c-84u=Y\fպSƽ).\u0019~\u0007)M\u0014\u0002}H\u0011OrQ@E0qʳh֑)9}N-*\u0010|\u001b\u0011[\u0003n\u000f\u0010=\u007fu\u001cɍ{ߝD\u0004\"!*D\u0014\rs\u0018SR`0o^PV*Ӓ2H`\u000bEަ%ؼp|\f\f2\r&\u00185soYYzJԌz\u0001\u0001˺nخIWx{\u0011j\u001bl,9\u0015.7\\ڃ\u0001x"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u00118\u0004%4:\u0005*IQ\u001e9T\u0019", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011s\u0017Kv2>U\u0005i\u0013j$=Z?9z\"!\u0011ua8gj6`L", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u00118\u0004%4:\u0005*I[\u001d8\\\u0019", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011W\u001eKr\"<Yk#3z\u0016-.JE}\n", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011M\nEt%<`y\u001d>mv5WU\u0011", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011s\u0017Kv2>U\u0005i\u0018}$2JJ;L;('>", "@d_9T@", "", "0tU3X9\u001cO$zxb;\u0011", "=m1BY->`\u0003\u0010zk-\u0004\u0013A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ DW'.ZDBuFs", "\nh]6g\u0005", "uH8\u0019^6MZ\u001d\b\u000e(*\u0007\u00169u\u000f,\u0005@\u000f`\u0015Jk\u0017Ev,C#Z08n\u0016;7T;x5%\u001fz7|w", "0tU3X9", "", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "@d_9T@\"\\\u0018~\u000e", "", ";h]\u0010b3ES\u0017\u000e\u0005k\u0010\u0006\b/x", "0tU3X9,W.~", "?tTBX\u001aBh\u0019", "6dP1", "5dc\u0015X(=", "u(9", "@d_9T@,W.~", "5dc\u001fX7EO-l~s,", "u(8", "Bnc._\u001aBh\u0019", "5dc!b;:Z\u0007\u0003\u0010^", "0tU3X9\u001e\\\u0018b\u0004],\u0010", "5dc\u000fh-?S&^\u0004]\u0010\u0006\b/x", "?tTBX\fGR|\by^?", "5dc\u001eh,NSx\byB5{\tB", "@d_9T@\u001cO\u0017\u0002z", "", "5dc\u001fX7EO-\\v\\/|", "u(;7T=:\u001d)\u000e~euc\r=tU", ":`bAE,IZ\u0015\u0013z]\u0013\u0007\u00075e~", "5dc\u0019T:M@\u0019\n\u0002Z@|\b\u0016o}.{??\u0013 Py\u001d8\u0006)?b\f", "u(E", "5dc\u0019T:M@\u0019\n\u0002Z@|\b\u0016o}.{?", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1n[9X*M", "", "1n[9X*M]&", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u0013c\u0005'7k%8Z\u0019\"q>-\u001clj\u0003\u0005m9X\u00076KUN:&0|F#\u0016c\u001eJ:\u0011\u000fb\u0017gUI30\u0004uP}DjJu\u0013\u00135h\u007f\u0018", "Bqh\u0012`0M", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "3lXA", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "Bqh\u0012`0M:#|\u0001^+", "Bqh\u0012`0M<#\\\u0005e3|\u0007>o\r6bJ~\u001d\u0017F", "2q^=B3=S'\u000eah*\u0003\t.", "1na?X*M1#\u0006\u0002^*\f\u0013<I\t'{S\u0001%\u0001PN\u001bF\u0002\u000f<X}.F", "<df\u0015X(=", "3m`BX<>:#|\u0001^+", "7sT:", "5q^D5<?T\u0019\f", "1ta\u000fh-?S&", "1ta \\A>", "<df \\A>", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q$dZ\r.t\nMrn<U\u0007\"\u0001W\u00133MAJA", "3lXAF<L^\u0019\by", "1`]0X3\u001e[\u001d\u000e\n^9", "3lXAg,K", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u00118\u0004%4:\u0005*IQ\u001e9T\u0002\u001bs8-$hn\u000f", "CoS.g,'S+\\\u0005e3|\u0007>o\r\f\u0005?\u0001*}Qm\u0014<u", "CoS.g,'S+\\\u0005e3|\u0007>o\r\f\u0005?\u0001*}Qm\u0014<uc;c\r';v)(KMHuD-\u0019qaG\u0001a6[v", "CoS.g,\u001c] \u0006z\\;\u0007\u0016\u0013n~(\u000f'\u000b\u0015\u001dGn", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "=kS\u0016a+>f", "CoS.g,\u001c] \u0006z\\;\u0007\u0016\u0013n~(\u000f'\u000b\u0015\u001dGnLB\u00014<]\u000731k ;WSJo=\u001e#b_C\u0014c", "uI\u0018(?2Hb \u0003\u0004(*\u0007\u00169u\u000f,\u0005@\u000f`tQx\u001d@\u007f51h\u0002*@C", "CoS.g,\u001bc\u001a\u007fzk\u0013\u0007\u00075e~", "<df\u001fX7EO-b\u0004],\u0010", "<df\u001a\\5\u001c] \u0006z\\;\u0007\u0016\u0013n~(\u000f", "<df\u000fh-?S&^\u0004]\u0010\u0006\b/x", "<df\u001eh,NSx\byB5{\tB", "1kT.a<IB\u0015\u0003\u0002E6z\u000f/d", "Bqh!T2>D\u0015\u0006\u000b^", "Ak^A", "Bqh\u001dX,D:#|\u0001^+", "5dc\u001dX,DS\u0018ove<|o9c\u0006(z\u001c\u0010", "7mS2k", "/vP6g\u001d:Z)~", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9{?r25X^'A\u007f\u00045WR\u0011R:($oeBPa6[\u00017VPW,j\u001cPG\u001d!^\u0017^'\u001c\tcJy2+<\u001b\u0019(\u0013\t7q\u0003U\u007f\u000b:jnQ,", "4h]1F3Hb'm\u0005K,\u000b\u00197ef2yF\u0001\u0016", "@dbB`,L7\"", "uZ;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007uzc|4WRBo=g\u0013rnC\u0017r0Wv5\u0011*X5kV{M\u0010!^\u0018W\u0001", "1qT.g,,Z#\u000e", "1qT.g,,Z#\u000eVk9x\u001d", "Ahi2", "uH\u0018(?2Hb \u0003\u0004quz\u0013<o\u00107\u007fI\u0001%`Hv\u0018N@\u00138U\u000b 6N\u001d8_1BuCs", "@db2g\u0019>^ z\u000f<(z\f/", "4tb2", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "1`_.V0Mg", "\u0013lXAg,K", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public class SharedFlowImpl<T> extends AbstractSharedFlow<SharedFlowSlot> implements MutableSharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r)4ߚ\u007f\u0007tʑAӄLe^.ZS8\u000fs{:&a$\bّkUH|b:_Vug\u0007Nj\u000bI\u00104\u0017\tn:Kmx\f\u0015\u001f8PsW5cnk>p~D\u000b882:\n\u0005/\"XOǘz|IT\u001a\u001cxF~Ej\r{\r`&VP.\u00016`wN<I\u001b^p3yɍkŌR'gܞM]\u001bHl';y\u0018\"iD\u000eߖ!ȏW\u0003\u000fѸ,O\u0011C\n?\u001bgU,aMJɖ8ݼ\u0004\u0014\u001dۀ !kx>b\u0015Sp\fU3}j\u0002Tdߒyߡ\u007f\rDǉأ\n3"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u00118\u0004%4:\u0005*IQ\u001e9T\u0002\u001bs8-$hn\u000f", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"Q}\n9}%\u0018U\u0007\u001f>mk", "4k^D", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u00118\u0004%4:\u0005*IQ\u001e9T\u0019", "7mS2k", "", "D`[BX", "", "1n]A", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9{?r25X^'A\u007fy6XJ\u0011P\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(YC\u001e!a\u0012Wt\u000b\u000ffK4}H@\u001f\u0016u'\fDw\u0005\u0015&\nDnzK,S8", "2hb=b:>", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class Emitter implements DisposableHandle {
        public final Continuation<Unit> cont;
        public final SharedFlowImpl<?> flow;
        public long index;
        public final Object value;

        /* JADX WARN: Multi-variable type inference failed */
        public Emitter(SharedFlowImpl<?> sharedFlowImpl, long j2, Object obj, Continuation<? super Unit> continuation) {
            this.flow = sharedFlowImpl;
            this.index = j2;
            this.value = obj;
            this.cont = continuation;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            this.flow.cancelEmitter(this);
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SharedFlowImpl<T> sharedFlowImpl, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = sharedFlowImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return SharedFlowImpl.collect$suspendImpl(this.this$0, null, this);
        }
    }

    public SharedFlowImpl(int i2, int i3, BufferOverflow bufferOverflow) {
        this.replay = i2;
        this.bufferCapacity = i3;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitValue(SharedFlowSlot sharedFlowSlot, Continuation<? super Unit> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        synchronized (this) {
            if (tryPeekLocked(sharedFlowSlot) < 0) {
                sharedFlowSlot.cont = cancellableContinuationImpl2;
                sharedFlowSlot.cont = cancellableContinuationImpl2;
            } else {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl2.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
            }
            Unit unit = Unit.INSTANCE;
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelEmitter(Emitter emitter) {
        synchronized (this) {
            if (emitter.index < getHead()) {
                return;
            }
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            if (SharedFlowKt.getBufferAt(objArr, emitter.index) != emitter) {
                return;
            }
            SharedFlowKt.setBufferAt(objArr, emitter.index, SharedFlowKt.NO_VALUE);
            cleanupTailLocked();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void cleanupTailLocked() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            while (this.queueSize > 0 && SharedFlowKt.getBufferAt(objArr, (getHead() + ((long) getTotalSize())) - 1) == SharedFlowKt.NO_VALUE) {
                this.queueSize--;
                SharedFlowKt.setBufferAt(objArr, getHead() + ((long) getTotalSize()), null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ <T> java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl<T> r9, kotlinx.coroutines.flow.FlowCollector<? super T> r10, kotlin.coroutines.Continuation<?> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void correctCollectorIndexesOnDropOldest(long j2) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        SharedFlowImpl<T> sharedFlowImpl = this;
        if (((AbstractSharedFlow) sharedFlowImpl).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) sharedFlowImpl).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                    if (sharedFlowSlot.index >= 0 && sharedFlowSlot.index < j2) {
                        sharedFlowSlot.index = j2;
                    }
                }
            }
        }
        this.minCollectorIndex = j2;
    }

    private final void dropOldestLocked() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        SharedFlowKt.setBufferAt(objArr, getHead(), null);
        this.bufferSize--;
        long head = getHead() + 1;
        if (this.replayIndex < head) {
            this.replayIndex = head;
        }
        if (this.minCollectorIndex < head) {
            correctCollectorIndexesOnDropOldest(head);
        }
        if (DebugKt.getASSERTIONS_ENABLED() && getHead() != head) {
            throw new AssertionError();
        }
    }

    static /* synthetic */ <T> Object emit$suspendImpl(SharedFlowImpl<T> sharedFlowImpl, T t2, Continuation<? super Unit> continuation) {
        Object objEmitSuspend;
        return (!sharedFlowImpl.tryEmit(t2) && (objEmitSuspend = sharedFlowImpl.emitSuspend(t2, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objEmitSuspend : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitSuspend(T t2, Continuation<? super Unit> continuation) throws Throwable {
        Emitter emitter;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        Continuation<Unit>[] continuationArrFindSlotsToResumeLocked = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(t2)) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl2.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
                continuationArrFindSlotsToResumeLocked = findSlotsToResumeLocked(continuationArrFindSlotsToResumeLocked);
                emitter = null;
            } else {
                emitter = new Emitter(this, ((long) getTotalSize()) + getHead(), t2, cancellableContinuationImpl2);
                enqueueLocked(emitter);
                this.queueSize++;
                if (this.bufferCapacity == 0) {
                    continuationArrFindSlotsToResumeLocked = findSlotsToResumeLocked(continuationArrFindSlotsToResumeLocked);
                }
            }
        }
        if (emitter != null) {
            CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl2, emitter);
        }
        for (Continuation<Unit> continuation2 : continuationArrFindSlotsToResumeLocked) {
            if (continuation2 != null) {
                Result.Companion companion2 = Result.Companion;
                continuation2.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueLocked(Object obj) {
        int totalSize = getTotalSize();
        Object[] objArrGrowBuffer = this.buffer;
        if (objArrGrowBuffer == null) {
            objArrGrowBuffer = growBuffer(null, 0, 2);
        } else if (totalSize >= objArrGrowBuffer.length) {
            objArrGrowBuffer = growBuffer(objArrGrowBuffer, totalSize, objArrGrowBuffer.length * 2);
        }
        SharedFlowKt.setBufferAt(objArrGrowBuffer, getHead() + ((long) totalSize), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.Continuation<kotlin.Unit>[]] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    public final Continuation<Unit>[] findSlotsToResumeLocked(Continuation<Unit>[] continuationArr) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        SharedFlowSlot sharedFlowSlot;
        Continuation<? super Unit> continuation;
        int length = continuationArr.length;
        SharedFlowImpl<T> sharedFlowImpl = this;
        if (((AbstractSharedFlow) sharedFlowImpl).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) sharedFlowImpl).slots) != null) {
            int length2 = abstractSharedFlowSlotArr.length;
            int i2 = 0;
            continuationArr = continuationArr;
            while (i2 < length2) {
                AbstractSharedFlowSlot abstractSharedFlowSlot = abstractSharedFlowSlotArr[i2];
                if (abstractSharedFlowSlot != null && (continuation = (sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot).cont) != null && tryPeekLocked(sharedFlowSlot) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        continuationArr = objArrCopyOf;
                    }
                    ((Continuation[]) continuationArr)[length] = continuation;
                    sharedFlowSlot.cont = null;
                    length++;
                }
                i2++;
                continuationArr = continuationArr;
            }
        }
        return (Continuation[]) continuationArr;
    }

    private final long getBufferEndIndex() {
        return getHead() + ((long) this.bufferSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHead() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    protected static /* synthetic */ void getLastReplayedLocked$annotations() {
    }

    private final Object getPeekedValueLockedAt(long j2) {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        Object bufferAt = SharedFlowKt.getBufferAt(objArr, j2);
        return bufferAt instanceof Emitter ? ((Emitter) bufferAt).value : bufferAt;
    }

    private final long getQueueEndIndex() {
        return getHead() + ((long) this.bufferSize) + ((long) this.queueSize);
    }

    private final int getReplaySize() {
        return (int) ((getHead() + ((long) this.bufferSize)) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTotalSize() {
        return this.bufferSize + this.queueSize;
    }

    private final Object[] growBuffer(Object[] objArr, int i2, int i3) {
        if (i3 <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i3];
        this.buffer = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long head = getHead();
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = ((long) i4) + head;
            SharedFlowKt.setBufferAt(objArr2, j2, SharedFlowKt.getBufferAt(objArr, j2));
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryEmitLocked(T t2) {
        if (getNCollectors() == 0) {
            return tryEmitNoCollectorsLocked(t2);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        enqueueLocked(t2);
        int i3 = this.bufferSize + 1;
        this.bufferSize = i3;
        if (i3 > this.bufferCapacity) {
            dropOldestLocked();
        }
        if (getReplaySize() > this.replay) {
            updateBufferLocked(this.replayIndex + 1, this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
        }
        return true;
    }

    private final boolean tryEmitNoCollectorsLocked(T t2) {
        if (DebugKt.getASSERTIONS_ENABLED() && getNCollectors() != 0) {
            throw new AssertionError();
        }
        if (this.replay == 0) {
            return true;
        }
        enqueueLocked(t2);
        int i2 = this.bufferSize + 1;
        this.bufferSize = i2;
        if (i2 > this.replay) {
            dropOldestLocked();
        }
        this.minCollectorIndex = getHead() + ((long) this.bufferSize);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long tryPeekLocked(SharedFlowSlot sharedFlowSlot) {
        long j2 = sharedFlowSlot.index;
        if (j2 < getBufferEndIndex()) {
            return j2;
        }
        if (this.bufferCapacity <= 0 && j2 <= getHead() && this.queueSize != 0) {
            return j2;
        }
        return -1L;
    }

    private final Object tryTakeValue(SharedFlowSlot sharedFlowSlot) {
        Object peekedValueLockedAt;
        Continuation<Unit>[] continuationArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            long jTryPeekLocked = tryPeekLocked(sharedFlowSlot);
            if (jTryPeekLocked < 0) {
                peekedValueLockedAt = SharedFlowKt.NO_VALUE;
            } else {
                long j2 = sharedFlowSlot.index;
                peekedValueLockedAt = getPeekedValueLockedAt(jTryPeekLocked);
                sharedFlowSlot.index = jTryPeekLocked + 1;
                continuationArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = updateCollectorIndexLocked$kotlinx_coroutines_core(j2);
            }
        }
        for (Continuation<Unit> continuation : continuationArrUpdateCollectorIndexLocked$kotlinx_coroutines_core) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
            }
        }
        return peekedValueLockedAt;
    }

    private final void updateBufferLocked(long j2, long j3, long j4, long j5) {
        long jMin = Math.min(j3, j2);
        if (DebugKt.getASSERTIONS_ENABLED() && jMin < getHead()) {
            throw new AssertionError();
        }
        for (long head = getHead(); head < jMin; head++) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            SharedFlowKt.setBufferAt(objArr, head, null);
        }
        this.replayIndex = j2;
        this.minCollectorIndex = j3;
        this.bufferSize = (int) (j4 - jMin);
        this.queueSize = (int) (j5 - j4);
        if (DebugKt.getASSERTIONS_ENABLED() && this.bufferSize < 0) {
            throw new AssertionError();
        }
        if (DebugKt.getASSERTIONS_ENABLED() && this.queueSize < 0) {
            throw new AssertionError();
        }
        if (DebugKt.getASSERTIONS_ENABLED() && this.replayIndex > getHead() + ((long) this.bufferSize)) {
            throw new AssertionError();
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<?> continuation) {
        return collect$suspendImpl(this, flowCollector, continuation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot createSlot() {
        return new SharedFlowSlot();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot[] createSlotArray(int i2) {
        return new SharedFlowSlot[i2];
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t2, Continuation<? super Unit> continuation) {
        return emit$suspendImpl(this, t2, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return SharedFlowKt.fuseSharedFlow(this, coroutineContext, i2, bufferOverflow);
    }

    protected final T getLastReplayedLocked() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        return (T) SharedFlowKt.getBufferAt(objArr, (this.replayIndex + ((long) getReplaySize())) - 1);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        synchronized (this) {
            int replaySize = getReplaySize();
            if (replaySize == 0) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(replaySize);
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            for (int i2 = 0; i2 < replaySize; i2++) {
                arrayList.add(SharedFlowKt.getBufferAt(objArr, this.replayIndex + ((long) i2)));
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        synchronized (this) {
            updateBufferLocked(getBufferEndIndex(), this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T t2) {
        int i2;
        boolean z2;
        Continuation<Unit>[] continuationArrFindSlotsToResumeLocked = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(t2)) {
                continuationArrFindSlotsToResumeLocked = findSlotsToResumeLocked(continuationArrFindSlotsToResumeLocked);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArrFindSlotsToResumeLocked) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
            }
        }
        return z2;
    }

    public final Continuation<Unit>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long j2) {
        long j3;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (DebugKt.getASSERTIONS_ENABLED() && j2 < this.minCollectorIndex) {
            throw new AssertionError();
        }
        if (j2 > this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long head = getHead();
        long j4 = ((long) this.bufferSize) + head;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j4++;
        }
        SharedFlowImpl<T> sharedFlowImpl = this;
        if (((AbstractSharedFlow) sharedFlowImpl).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) sharedFlowImpl).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                    if (sharedFlowSlot.index >= 0 && sharedFlowSlot.index < j4) {
                        j4 = sharedFlowSlot.index;
                    }
                }
            }
        }
        if (DebugKt.getASSERTIONS_ENABLED() && j4 < this.minCollectorIndex) {
            throw new AssertionError();
        }
        if (j4 <= this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long bufferEndIndex = getBufferEndIndex();
        int iMin = getNCollectors() > 0 ? Math.min(this.queueSize, this.bufferCapacity - ((int) (bufferEndIndex - j4))) : this.queueSize;
        Continuation<Unit>[] continuationArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        long j5 = ((long) this.queueSize) + bufferEndIndex;
        if (iMin > 0) {
            continuationArr = new Continuation[iMin];
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            long j6 = bufferEndIndex;
            int i2 = 0;
            while (bufferEndIndex < j5) {
                Object bufferAt = SharedFlowKt.getBufferAt(objArr, bufferEndIndex);
                if (bufferAt != SharedFlowKt.NO_VALUE) {
                    Intrinsics.checkNotNull(bufferAt, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    Emitter emitter = (Emitter) bufferAt;
                    int i3 = i2 + 1;
                    continuationArr[i2] = emitter.cont;
                    SharedFlowKt.setBufferAt(objArr, bufferEndIndex, SharedFlowKt.NO_VALUE);
                    SharedFlowKt.setBufferAt(objArr, j6, emitter.value);
                    j3 = 1;
                    j6++;
                    if (i3 >= iMin) {
                        break;
                    }
                    i2 = i3;
                } else {
                    j3 = 1;
                }
                bufferEndIndex += j3;
            }
            bufferEndIndex = j6;
        }
        int i4 = (int) (bufferEndIndex - head);
        if (getNCollectors() == 0) {
            j4 = bufferEndIndex;
        }
        long jMax = Math.max(this.replayIndex, bufferEndIndex - ((long) Math.min(this.replay, i4)));
        if (this.bufferCapacity == 0 && jMax < j5) {
            Object[] objArr2 = this.buffer;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.areEqual(SharedFlowKt.getBufferAt(objArr2, jMax), SharedFlowKt.NO_VALUE)) {
                bufferEndIndex++;
                jMax++;
            }
        }
        updateBufferLocked(jMax, j4, bufferEndIndex, j5);
        cleanupTailLocked();
        return !(continuationArr.length == 0) ? findSlotsToResumeLocked(continuationArr) : continuationArr;
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long j2 = this.replayIndex;
        if (j2 < this.minCollectorIndex) {
            this.minCollectorIndex = j2;
        }
        return j2;
    }
}
