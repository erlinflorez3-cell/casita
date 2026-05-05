package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractTimeSource;
import kotlinx.coroutines.AbstractTimeSourceKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;
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
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u007f\u0007tqAӄLeV:ZS0\u0010s{J$c$wCCU(\u0007*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001j:I]ތe\u0012%2JoE7UoS9ht<\u0012(288\u0002\u0005\u0007\u001c2H&v\u0003Ca\f\u001a0FuBR#M\r\u001a\u0018\u0017DĨ\u0017Ȧz3~6vk\u000e:]#;j\u000e\u001bt Y\rQ\u001bGl';xq\"9CO5C'c\t\rRiC\u001b? B\u0015n-'9O\fWd_ÿ\u0018\u00171W\u001bf;4j\u0012i`:5[SqZh\u000eV\bA{U\\\u0012!\u001e'vB]\"t\u001d&7#\t$@~\u061c\u000fF\u000e\u0012y6E'079Q3f\u007fc\u0004)\\P\u0014\u0005;,S\t|6sX<ve\u001b\u0003ȭ\u001a=_ZUNd\t\bS>\u0004\u001fçH*LBU\u001bG{?0G-EpQ'O\u0002RHrϙ=\u0005)wa\tjHn$\u001f\u001aEN!\f\tI+ʐq\u0019cfQ)MJV7\u0002\u001678\\&Agغ\u0016\u0017^v\f\u0003M\f\fU3t[qn\u001a\u0013\u001eޱd{<_\n(a\u0001xZ̶B+\ff\u000eZS:\\#̨(zOx8\u0010{rSRƑ8\bx*]D1Gp[Ȁ\tfIO'!_\tvVкZ{+\u0011\u0015<t7\u0006\u0017ʗv8~\u0007yD|\u000f6]I_f1*\u0004UQ4[UM\u0013\u0381\u0004Gu\u0001\u0010RzK\u000eU*4\\.\u0002]=s+\u000f-=b\u0006;|dr\u0014V\u0016?53\u0015y=O\u00196uA\u0003tZ\u0014SJ.\u0007G,|^\u0001] h.\bJFY\u0003\u0014Z\u0011[L\u0006\u000b\u0003\bJҡ<|\u0013\\fF\u000f.:|c=s/+O\u0010\u0018]HJ]H\"^\u0002pI>x\u0014\u0012\u0015ct+͈U]@z\u0001_g?V\"R\u00013FV,\u0010\bp\u000ed\u0011A\u000bYd\u001fd~MS3\f*\u001f,;\u0005\u001fkHW\b}b<\u00100yC\f8vCS\u0016\u0014S0s{\u0011t\u000bx\u001dP\u000bD7|X4=NX\u001ebQR\u0014;08W:\u0011\u0015d\u000f:3ZRX\u000bqҍ\u001a\n\u001e\n\u0018F\u000e\u001fG6P0SV<b?\\\u001fT\u0013)]f7)/\u0015_3L֭{1MsT\u001eGc`\b\u001a1Q'x\u001a\u0017fS?tXG*@X/\u001b\u0016kQJ\u001a62I_qBƙ\u000eէ\u001c|%\u00adh)GT)_%2\u0015\u000f,̬PЩz\u0012nŚ\u001f07\u0003\u0013|<A@\u0013aćQζsb5ً\u001f\u0006EI2\u0001EK_\u000bbŹe̍\u001f-\u000eז}KWt,'*b\n?TР\"Č+\u0004|ե-e\u001cr\"]IELulȐ\u0004Ƥ\u0017P(Ɍ~Q\u0003\u0004\".6H&ב5R+lu\u0004\u00021F7/\u001b\u001c\u0013K\u0017Ǎ8\u0001#gEα\rөj1^ҳ?4^;!'{@ì\\\u000b$a?p\u0011.\u0016KӴ\u001f\rʍdЍ\u0014S{jv\f]|]>=\u000eBa_2\t˷}uݚwą.X@\u0017Ay[_5\u0010j\u0019ZW<\fAۭfE\u001b7B\u0015~vlGW̭Jv6f5e'Nˣ\u0011\u0016"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~7\b-A}%2VC)i7\u001e\u0014xh9\u00149", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "1na2C6HZ\u0007\u0003\u0010^", "", ";`g\u001db6EA\u001d\u0014z", "7c[2J6KY\u0019\f`^,\bd6i\u0011(dN", "", "AbW2W<ES&gvf,", "", "\nh]6g\u0005", "uH8\u0017?1:d\u0015H\u0002Z5~R\u001dt\r,\u0005BVZ\b", "5k^/T3\u001c^)j\u000b^<|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~;\u0005*4i\u001d\u001a]CKk\n", "5k^/T3\u001bZ#|\u0001b5~t?e\u0010(", "/cS!b\u000eE]\u0016z\u0002J<|\u0019/", "", "B`b8", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~Hy.=C", ">`a8X+0]&\u0005zk:j\u0018+c\u0006", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015.y\u0017>L", ">`a8X+0]&\u0005zk:j\u0018+c\u0006\u0017\u0006Kp\"\u0016C~\u000e", "", "Ena8X9", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~7\b-A}%2VC)i7\u001e\u0014xh9\u0014\"\u001eX\u0004-GY$", "=kS\u0016a+>f", "<df\u0016a+>f", ">`a8X+0]&\u0005zk:j\u0018+c\u0006\u0013\fN\u0004", ">`a8X+0]&\u0005zk:j\u0018+c\u0006\u0013\u0006K", ">`a8X+0]&\u0005zk:j\u0018+c\u0006\u0011{S\u0010z Fo!", "Ena8X9L", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00125g\u000253j\u001d.)REs8\u001cpun5\u001b9", "1n]Ae6EA(z\n^", "1qT.g,=E#\f\u0001^9\u000b", "5dc\u0010e,:b\u0019}lh9\u0003\t<s", "u(8", "/uP6_(;Z\u0019\\\u0006n\u0017|\u00167i\u000f6", "5dc\u000ei(BZ\u0015{\u0002^\n\b\u0019\u001ae\r0\u007fO\u000f", "AsPAX", "0k^0^0GU\bz\td:", "7mR?X4>\\(\\\b^(\f\t.W\n5\u0002@\u000e%", "2dR?X4>\\(\\\b^(\f\t.W\n5\u0002@\u000e%", "7mR?X4>\\([\u0002h*\u0003\r8gn$\nF\u000f", "2dR?X4>\\([\u0002h*\u0003\r8gn$\nF\u000f", "Bqh\u000eV8NW&~Xi<g\t<m\u00047", "@d[2T:>1$\u000fe^9\u0005\r>", "-hb!X9FW\"z\n^+", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015$y\u0018Cv!>/", "7rC2e4B\\\u0015\u000ez]", "u(I", "3wT0h;>", "1n\\:T5=", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E-\u0011  Cl\u0015<L", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016D\b", "1k^@X", "AgdAW6P\\", "Bh\\2b<M", "2hb=T;<V", "0k^0^", "B`b866Gb\u0019\u0012\n", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~Hy.=K 7\\CNz\n", "B`X970L^\u0015\u000exa", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016u\fZ8", "1qT.g,-O'\u0005", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016uZ}My\u001dCz.H#{*Dw&=QL;y},\u0013ka8\u0017j0Wxp6H\\22", "AhV;T3\u001bZ#|\u0001b5~z9r\u0006", "AsPAX\u001aGO$\r}h;", "AjX=H5IO&\u0005", "AhV;T3\u001c^)p\u0005k2", "Bqh\u0010e,:b\u0019p\u0005k2|\u0016", "Bqh\"a7:`\u001f", "1qT.g,'S+p\u0005k2|\u0016", "AtQ:\\;-]\u007f\txZ3h\u0019/u\u007f", "1ta?X5ME#\f\u0001^9", "BnBAe0GU", "@t] T->Z-", "\u0011n\\=T5B]\"", "%na8X9", "%na8X9,b\u0015\u000ez", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class CoroutineScheduler implements Executor, Closeable {
    private static final long BLOCKING_MASK = 4398044413952L;
    private static final int BLOCKING_SHIFT = 21;
    private static final int CLAIMED = 0;
    private static final long CPU_PERMITS_MASK = 9223367638808264704L;
    private static final int CPU_PERMITS_SHIFT = 42;
    private static final long CREATED_MASK = 2097151;
    public static final int MAX_SUPPORTED_POOL_SIZE = 2097150;
    public static final int MIN_SUPPORTED_POOL_SIZE = 1;
    private static final int PARKED = -1;
    private static final long PARKED_INDEX_MASK = 2097151;
    private static final long PARKED_VERSION_INC = 2097152;
    private static final long PARKED_VERSION_MASK = -2097152;
    private static final int TERMINATED = 1;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int corePoolSize;
    public final GlobalQueue globalBlockingQueue;
    public final GlobalQueue globalCpuQueue;
    public final long idleWorkerKeepAliveNs;
    public final int maxPoolSize;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final String schedulerName;
    public final ResizableAtomicArray<Worker> workers;
    public static final Companion Companion = new Companion(null);
    private static final /* synthetic */ AtomicLongFieldUpdater parkedWorkersStack$volatile$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater controlState$volatile$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater _isTerminated$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");
    public static final Symbol NOT_IN_STACK = new Symbol("NOT_IN_STACK");

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007llA0RlP.XZ0Ŧl\u0012éT[Rp\u0004B[\u001aԥ&\u000bUNuh?Xh\r[\u000f4\u0019/n\u0003շWޯa\u0012\u0017˰\u0013{M7eok>7ҝ\tӯ$2*\u0600J\u0011\u000f BH>{QŒ\u001eë\u00160H\u0081\u000b^\u001bT\u001d\u001a@\u000b\u0015īSɉ`gVȤ\u0019xkBG#1n\u0019úyۢ4|Uε\u0017`5\u0016\u000faL5\u0017ʽ\bչ)S\u000bޗ#gM\u000eWqk\u000f?ѪyȅMs_̬)\f\"!CO;bI̩/ԇU`\u0014ʬ{[qXh\u000eV\u0002Qԋ_ʀ\b\u000e\u000eΩ\u0019:;(~\b<8Kɂ&ĖT\u0002fۍP\u0007oE/%.8\u0002ݎmƻUaCϊ\u001fC\n\u0015%\u001eQ\u000bEĒ.ڍ\u0012`\u001dÑ%\u0004_Bi@kR%˦,ǀq\u0004xçR6\u0012B_\u007f]\u0006gчiÉ;[A\u05faݒo\u0015"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~7\b-A}%2VC)i7\u001e\u0014xh9\u0014\"\nX~2CUR6e(", "", "\nh]6g\u0005", "u(E", "\u001cNC,<\u00158A\bZXD", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013Iaz*>C", "\u001e@A\u00188\u000b", "", "\u0011K0\u0016@\f\u001d", "\"DA\u001a<\u0015\u001aBx]", "\u0010K>\u0010>\u0010'5\u0013l]B\rk", "\u0011Q4\u000eG\f\u001dM\u0001ZhD", "", "\u0010K>\u0010>\u0010'5\u0013fVL\u0012", "\u0011OD,C\f+;|mhX\u001a_l\u0010T", "\u0011OD,C\f+;|mhX\u0014Xv\u0015", "\u001bH=,F\u001c)>\u0003ki>\u000bvs\u0019Of\"i$uv", "\u001b@G,F\u001c)>\u0003ki>\u000bvs\u0019Of\"i$uv", "\u001e@A\u00188\u000b87\u0002]ZQ&dd\u001dK", "\u001e@A\u00188\u000b8DxkhB\u0016e\u0003\u0017Am\u000e", "\u001e@A\u00188\u000b8DxkhB\u0016e\u0003\u0013N]", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u0016DLcz\u0005I\u0006>\u00116B\u0005'4\u0012\u000e\u0007nj?1Le^.Zݷ2\u000f\u0002{<$q$yّCU0}*ޛWN}gvϺb\u000bQ\u0016\u000eǝ\u0001j:կ]xc\u0017\u00172PxG3SpE9nt>\u0005&D*8\u0010\u0005\t\u001a0H\u0016͍|Yŷ<\u0012^?1AX\r̂\t\u001c\u0018\u0006L!A-b{^:Vnu:]&ɨmDT'm4ES\u001bgl';\u0019(\u001esLEX-%\u0002%7Vic\u001b? QMn5LCI\"}|lH\u001a#Sg\r\f\u0019l\\MUn5?+}{\u0014T\u001cR\u0010z*/\u0005\n\u001c1?H\\S`fP\u0014A!\u000bSnrH^\u000b\u000e\t\u000fN\u0017S&c/GI~Q\u0010M_N\u007f\b\u0013<6#/qQ_b>x\u0015IW@W?\u0003X=vtPY\u0006s\u0012#z\u0002X*vGH=\nDF\u0019;6\nKS%y)`D\u0016\u0019Mhv\b\u0002T^?P\u0001\\7r\u0011\u001a\u0010\\f\u001bj~f\u001f,Y]*\u000b\u001f\u007f\u001e\u0012Nn(@/\\(N}\u000b0j\u0016e\u0018]GhMX\u001d}TW\u0002wAnie&`\u0001\tDGJ\u001d\u001d\\\u0015E<\f9\u0018n\"ĘLj\u001e4Lf\\\u0011+2mtL8:31\\CKAb\u0019ˍ\tȤcfpɭ\u0017V9*\u0011pDv\u000f\t^eA\u007fu\u0003a,+kXϑAپ9\u001d>W(tB\ns\u0015\r\u0002\u0018G\u0016[}PCֽwʀ\u007f \u001e֝\ne=M+\u0017\u000f-B\u0004CDz\u0005\u0014b$ȿ)ϸ\u0001y\u0017\u00909>u\u001b\u0003pZt!N\u000eXmǹ\u0003݈v#\u0010ۭP}o[\u0013G\u0012j[gL`\u000b\u0003\bT%˾\tġ#\u001e-˚@<\u000bNEE=\u001cD\u0012jٳ!˸auwЃ\u0012d\u0015A\u0003\u0002$.i3}\u0001\"i@ZPI\b\u0017\u0015а0к\u0007BP۳H\u0014P)L\raK\u0018Я|ެ<M\u0013ɀNv\u0015S%p\u0005}p\u0017.\u0002\u000bʥkͫwC\u0006жڔGb"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~7\b-A}%2VC)i7\u001e\u0014xh9\u0014\"\u001eX\u0004-GY$", "\u001aiPCTuEO\"\u0001DM/\n\t+dU", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u000f\u0015\u001aGn\u001eCz.7#[*Dw&=QL;Y2!\u0015gq@\u0007p\u0002\u0012g", "7mS2k", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u000f\u0015\u001aGn\u001eCz.7#[*Dw&=QL;Y2!\u0015gq@\u0007p\u00022:\u0018", "7mS2k\u0010G/&\fvr", "5dc\u0016a+>f|\bVk9x\u001d", "u(8", "Adc\u0016a+>f|\bVk9x\u001d", "uH\u0018#", "AbW2W<ES&", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~7\b-A}%2VC)i7\u001e\u0014xh9\u00149", "5dc V/>R)\u0006zk", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ%\u0015Jo\rL})>[G}Az >\\GDk\"\u001c\u0018h`I\u000ec9$", ":nR._\u0018NS)~", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~K\b-=Y&.]C\u0011", "As^9X5-O'\u0005", "\u001aj^A_0G\u001d\u001e\u0010\u0003(0\u0006\u0018/r\t$\u0003\nm\u0017\u0018\u0006Y\u000bAv#DF}!\r", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~Hy.=C", "AsPAX", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~7\b-A}%2VC)i7\u001e\u0014xh9\u0014\"\u001eX\u0004-GY<;Xar\u0013", "Ena8X9\u001cb ", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015+x\u001d\u0012", "Bda:\\5:b\u001d\t\u0004=,x\b6i\t(", "", "<dgAC(KY\u0019}lh9\u0003\t<", "", "5dc\u001bX?M>\u0015\f\u0001^+n\u0013<k\u007f5", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc\u001bX?M>\u0015\f\u0001^+n\u0013<k\u007f5", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", ";h]\u0011X3:g\t\b\nb3j\u0018/a\u0007$xG\u0001\u0006\u0013UuvJ", "@mV g(MS", "Bqh\u000eV8NW&~Xi<g\t<m\u00047", "", "Bqh\u001fX3>O'~Xi<", "<df g(MS", "@t]", "", ";`h\u0015T=>:#|ve\u001bx\u00175s", "@t]$b9DS&", "@t] \\5@Z\u0019mvl2", "7r8<", "Bqh\u001dT9D", "7mBAT*D", "3wT0h;>B\u0015\r\u0001", "B`b8", "<dgA<5M", "Co_2e\tHc\"}", ">`a8", "Bqh!X9FW\"z\n^\u001e\u0007\u00165e\r", "4h]1G(LY", "4h]153HQ\u001f\u0003\u0004`\u001bx\u00175", "4h]167NB\u0015\r\u0001", "4h]145RB\u0015\r\u0001", "AbP;?6<O j\u000b^<|", ">n[9:3HP\u0015\u0006fn,\r\t=", "Bqh g,:Z", "AsT._0GU\u0001\ty^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~G\r 3t\u001a7O+Ej4s", "uH\u0018\u0019^6MZ\u001d\b\u000e(*\u0007\u00169u\u000f,\u0005@\u000f`%Er\u000e;\u0007,9b\u007fi&i$4#", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public final class Worker extends Thread {
        private static final /* synthetic */ AtomicIntegerFieldUpdater workerCtl$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Worker.class, "workerCtl$volatile");
        private volatile int indexInArray;
        public final WorkQueue localQueue;
        public boolean mayHaveLocalTasks;
        private long minDelayUntilStealableTaskNs;
        private volatile Object nextParkedWorker;
        private int rngState;
        public WorkerState state;
        private final Ref.ObjectRef<Task> stolenTask;
        private long terminationDeadline;
        private volatile /* synthetic */ int workerCtl$volatile;

        private Worker() {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.localQueue = new WorkQueue();
            this.stolenTask = new Ref.ObjectRef<>();
            this.state = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.NOT_IN_STACK;
            int iNanoTime = (int) System.nanoTime();
            this.rngState = iNanoTime == 0 ? 42 : iNanoTime;
        }

        public Worker(CoroutineScheduler coroutineScheduler, int i2) {
            this();
            setIndexInArray(i2);
        }

        private final void executeTask(Task task) {
            this.terminationDeadline = 0L;
            if (this.state == WorkerState.PARKING) {
                if (DebugKt.getASSERTIONS_ENABLED() && !task.taskContext) {
                    throw new AssertionError();
                }
                this.state = WorkerState.BLOCKING;
            }
            if (!task.taskContext) {
                CoroutineScheduler.this.runSafely(task);
                return;
            }
            if (tryReleaseCpu(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.signalCpuWork();
            }
            CoroutineScheduler.this.runSafely(task);
            CoroutineScheduler.getControlState$volatile$FU().addAndGet(CoroutineScheduler.this, CoroutineScheduler.PARKED_VERSION_MASK);
            WorkerState workerState = this.state;
            if (workerState != WorkerState.TERMINATED) {
                if (DebugKt.getASSERTIONS_ENABLED() && workerState != WorkerState.BLOCKING) {
                    throw new AssertionError();
                }
                this.state = WorkerState.DORMANT;
            }
        }

        private final Task findAnyTask(boolean z2) {
            Task taskPollGlobalQueues;
            Task taskPollGlobalQueues2;
            if (z2) {
                boolean z3 = nextInt(CoroutineScheduler.this.corePoolSize * 2) == 0;
                if (z3 && (taskPollGlobalQueues2 = pollGlobalQueues()) != null) {
                    return taskPollGlobalQueues2;
                }
                Task taskPoll = this.localQueue.poll();
                if (taskPoll != null) {
                    return taskPoll;
                }
                if (!z3 && (taskPollGlobalQueues = pollGlobalQueues()) != null) {
                    return taskPollGlobalQueues;
                }
            } else {
                Task taskPollGlobalQueues3 = pollGlobalQueues();
                if (taskPollGlobalQueues3 != null) {
                    return taskPollGlobalQueues3;
                }
            }
            return trySteal(3);
        }

        private final Task findBlockingTask() {
            Task taskPollBlocking = this.localQueue.pollBlocking();
            if (taskPollBlocking != null) {
                return taskPollBlocking;
            }
            Task taskRemoveFirstOrNull = CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return taskRemoveFirstOrNull == null ? trySteal(1) : taskRemoveFirstOrNull;
        }

        private final Task findCpuTask() {
            Task taskPollCpu = this.localQueue.pollCpu();
            if (taskPollCpu != null) {
                return taskPollCpu;
            }
            Task taskRemoveFirstOrNull = CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return taskRemoveFirstOrNull == null ? trySteal(2) : taskRemoveFirstOrNull;
        }

        private final /* synthetic */ int getWorkerCtl$volatile() {
            return this.workerCtl$volatile;
        }

        private final boolean inStack() {
            return this.nextParkedWorker != CoroutineScheduler.NOT_IN_STACK;
        }

        private final void park() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = System.nanoTime() + CoroutineScheduler.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                tryTerminateWorker();
            }
        }

        private final Task pollGlobalQueues() {
            if (nextInt(2) == 0) {
                Task taskRemoveFirstOrNull = CoroutineScheduler.this.globalCpuQueue.removeFirstOrNull();
                return taskRemoveFirstOrNull != null ? taskRemoveFirstOrNull : CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            }
            Task taskRemoveFirstOrNull2 = CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return taskRemoveFirstOrNull2 != null ? taskRemoveFirstOrNull2 : CoroutineScheduler.this.globalCpuQueue.removeFirstOrNull();
        }

        private final void runWorker() {
            loop0: while (true) {
                boolean z2 = false;
                while (!CoroutineScheduler.this.isTerminated() && this.state != WorkerState.TERMINATED) {
                    Task taskFindTask = findTask(this.mayHaveLocalTasks);
                    if (taskFindTask != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        executeTask(taskFindTask);
                    } else {
                        this.mayHaveLocalTasks = false;
                        if (this.minDelayUntilStealableTaskNs == 0) {
                            tryPark();
                        } else if (z2) {
                            tryReleaseCpu(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                        } else {
                            z2 = true;
                        }
                    }
                }
                break loop0;
            }
            tryReleaseCpu(WorkerState.TERMINATED);
        }

        private final /* synthetic */ void setWorkerCtl$volatile(int i2) {
            this.workerCtl$volatile = i2;
        }

        private final boolean tryAcquireCpuPermit() {
            long j2;
            if (this.state == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater controlState$volatile$FU = CoroutineScheduler.getControlState$volatile$FU();
            do {
                j2 = controlState$volatile$FU.get(coroutineScheduler);
                if (((int) (((-1) - (((-1) - CoroutineScheduler.CPU_PERMITS_MASK) | ((-1) - j2))) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.getControlState$volatile$FU().compareAndSet(coroutineScheduler, j2, j2 - 4398046511104L));
            this.state = WorkerState.CPU_ACQUIRED;
            return true;
        }

        private final void tryPark() {
            if (!inStack()) {
                CoroutineScheduler.this.parkedWorkersStackPush(this);
                return;
            }
            workerCtl$volatile$FU.set(this, -1);
            while (inStack() && workerCtl$volatile$FU.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.state != WorkerState.TERMINATED) {
                tryReleaseCpu(WorkerState.PARKING);
                Thread.interrupted();
                park();
            }
        }

        private final Task trySteal(int i2) {
            long j2 = CoroutineScheduler.getControlState$volatile$FU().get(CoroutineScheduler.this);
            int i3 = (int) ((j2 + 2097151) - (j2 | 2097151));
            if (i3 < 2) {
                return null;
            }
            int iNextInt = nextInt(i3);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i4 = 0; i4 < i3; i4++) {
                iNextInt++;
                if (iNextInt > i3) {
                    iNextInt = 1;
                }
                Worker worker = coroutineScheduler.workers.get(iNextInt);
                if (worker != null && worker != this) {
                    long jTrySteal = worker.localQueue.trySteal(i2, this.stolenTask);
                    if (jTrySteal == -1) {
                        Task task = this.stolenTask.element;
                        this.stolenTask.element = null;
                        return task;
                    }
                    if (jTrySteal > 0) {
                        jMin = Math.min(jMin, jTrySteal);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.minDelayUntilStealableTaskNs = jMin;
            return null;
        }

        private final void tryTerminateWorker() {
            ResizableAtomicArray<Worker> resizableAtomicArray = CoroutineScheduler.this.workers;
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (resizableAtomicArray) {
                if (coroutineScheduler.isTerminated()) {
                    return;
                }
                if (((int) (CoroutineScheduler.getControlState$volatile$FU().get(coroutineScheduler) & 2097151)) <= coroutineScheduler.corePoolSize) {
                    return;
                }
                if (workerCtl$volatile$FU.compareAndSet(this, -1, 1)) {
                    int i2 = this.indexInArray;
                    setIndexInArray(0);
                    coroutineScheduler.parkedWorkersStackTopUpdate(this, i2, 0);
                    int andDecrement = (int) (CoroutineScheduler.getControlState$volatile$FU().getAndDecrement(coroutineScheduler) & 2097151);
                    if (andDecrement != i2) {
                        Worker worker = coroutineScheduler.workers.get(andDecrement);
                        Intrinsics.checkNotNull(worker);
                        Worker worker2 = worker;
                        coroutineScheduler.workers.setSynchronized(i2, worker2);
                        worker2.setIndexInArray(i2);
                        coroutineScheduler.parkedWorkersStackTopUpdate(worker2, andDecrement, i2);
                    }
                    coroutineScheduler.workers.setSynchronized(andDecrement, null);
                    Unit unit = Unit.INSTANCE;
                    this.state = WorkerState.TERMINATED;
                }
            }
        }

        public final Task findTask(boolean z2) {
            return tryAcquireCpuPermit() ? findAnyTask(z2) : findBlockingTask();
        }

        public final int getIndexInArray() {
            return this.indexInArray;
        }

        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final CoroutineScheduler getScheduler() {
            return CoroutineScheduler.this;
        }

        public final boolean isIo() {
            return this.state == WorkerState.BLOCKING;
        }

        public final int nextInt(int i2) {
            int i3 = this.rngState;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.rngState = i6;
            int i7 = i2 - 1;
            return (i7 + i2) - (i7 | i2) == 0 ? (i6 + i7) - (i6 | i7) : (i6 & Integer.MAX_VALUE) % i2;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            runWorker();
        }

        public final long runSingleTask() {
            WorkerState workerState = this.state;
            boolean z2 = workerState == WorkerState.CPU_ACQUIRED;
            Task taskFindCpuTask = z2 ? findCpuTask() : findBlockingTask();
            if (taskFindCpuTask == null) {
                long j2 = this.minDelayUntilStealableTaskNs;
                if (j2 == 0) {
                    return -1L;
                }
                return j2;
            }
            CoroutineScheduler.this.runSafely(taskFindCpuTask);
            if (!z2) {
                CoroutineScheduler.getControlState$volatile$FU().addAndGet(CoroutineScheduler.this, CoroutineScheduler.PARKED_VERSION_MASK);
            }
            if (!DebugKt.getASSERTIONS_ENABLED() || this.state == workerState) {
                return 0L;
            }
            throw new AssertionError();
        }

        public final void setIndexInArray(int i2) {
            setName(CoroutineScheduler.this.schedulerName + "-worker-" + (i2 == 0 ? "TERMINATED" : String.valueOf(i2)));
            this.indexInArray = i2;
        }

        public final void setNextParkedWorker(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean tryReleaseCpu(WorkerState workerState) {
            WorkerState workerState2 = this.state;
            boolean z2 = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z2) {
                CoroutineScheduler.getControlState$volatile$FU().addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.state = workerState;
            }
            return z2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\nGָّ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005lN.ʂW,\u0015k\n5\r[*s,;[\u001df\"\u000fS7gms3Z\u0011IǍ\n\u001d"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~7\b-A}%2VC)i7\u001e\u0014xh9\u0014\"\u001eX\u0004-GY<;Xar\u0013", "", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0011OD,4\n*C|kZ=", "\u0010K>\u0010>\u0010'5", "\u001e@A\u0018<\u0015 ", "\u0012NA\u001a4\u0015-", "\"DA\u001a<\u0015\u001aBx]", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class WorkerState extends Enum<WorkerState> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ WorkerState[] $VALUES;
        public static final WorkerState CPU_ACQUIRED = new WorkerState("CPU_ACQUIRED", 0);
        public static final WorkerState BLOCKING = new WorkerState("BLOCKING", 1);
        public static final WorkerState PARKING = new WorkerState("PARKING", 2);
        public static final WorkerState DORMANT = new WorkerState("DORMANT", 3);
        public static final WorkerState TERMINATED = new WorkerState("TERMINATED", 4);

        private static final /* synthetic */ WorkerState[] $values() {
            return new WorkerState[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
        }

        static {
            WorkerState[] workerStateArr$values = $values();
            $VALUES = workerStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(workerStateArr$values);
        }

        private WorkerState(String str, int i2) {
            super(str, i2);
        }

        public static EnumEntries<WorkerState> getEntries() {
            return $ENTRIES;
        }

        public static WorkerState valueOf(String str) {
            return (WorkerState) Enum.valueOf(WorkerState.class, str);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) $VALUES.clone();
        }
    }

    public CoroutineScheduler(int i2, int i3, long j2, String str) {
        this.corePoolSize = i2;
        this.maxPoolSize = i3;
        this.idleWorkerKeepAliveNs = j2;
        this.schedulerName = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.globalCpuQueue = new GlobalQueue();
        this.globalBlockingQueue = new GlobalQueue();
        this.workers = new ResizableAtomicArray<>((i2 + 1) * 2);
        this.controlState$volatile = ((long) i2) << 42;
        this._isTerminated$volatile = 0;
    }

    public /* synthetic */ CoroutineScheduler(int i2, int i3, long j2, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, (4 & i4) != 0 ? TasksKt.IDLE_WORKER_KEEP_ALIVE_NS : j2, (-1) - (((-1) - i4) | ((-1) - 8)) != 0 ? TasksKt.DEFAULT_SCHEDULER_NAME : str);
    }

    private final boolean addToGlobalQueue(Task task) {
        return task.taskContext ? this.globalBlockingQueue.addLast(task) : this.globalCpuQueue.addLast(task);
    }

    private final int blockingTasks(long j2) {
        return (int) (((j2 + BLOCKING_MASK) - (j2 | BLOCKING_MASK)) >> 21);
    }

    private final int createNewWorker() {
        synchronized (this.workers) {
            if (isTerminated()) {
                return -1;
            }
            long j2 = controlState$volatile$FU.get(this);
            int i2 = (int) (j2 & 2097151);
            int iCoerceAtLeast = RangesKt.coerceAtLeast(i2 - ((int) (((j2 + BLOCKING_MASK) - (j2 | BLOCKING_MASK)) >> 21)), 0);
            if (iCoerceAtLeast >= this.corePoolSize) {
                return 0;
            }
            if (i2 >= this.maxPoolSize) {
                return 0;
            }
            long j3 = getControlState$volatile$FU().get(this);
            int i3 = ((int) ((j3 + 2097151) - (j3 | 2097151))) + 1;
            if (i3 <= 0 || this.workers.get(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            Worker worker = new Worker(this, i3);
            this.workers.setSynchronized(i3, worker);
            long jIncrementAndGet = controlState$volatile$FU.incrementAndGet(this);
            if (i3 != ((int) ((2097151 + jIncrementAndGet) - (2097151 | jIncrementAndGet)))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int i4 = iCoerceAtLeast + 1;
            worker.start();
            return i4;
        }
    }

    private final int createdWorkers(long j2) {
        return (int) ((j2 + 2097151) - (j2 | 2097151));
    }

    private final Worker currentWorker() {
        Thread threadCurrentThread = Thread.currentThread();
        Worker worker = threadCurrentThread instanceof Worker ? (Worker) threadCurrentThread : null;
        if (worker == null || !Intrinsics.areEqual(CoroutineScheduler.this, this)) {
            return null;
        }
        return worker;
    }

    private final void decrementBlockingTasks() {
        getControlState$volatile$FU().addAndGet(this, PARKED_VERSION_MASK);
    }

    private final int decrementCreatedWorkers() {
        return (int) (getControlState$volatile$FU().getAndDecrement(this) & 2097151);
    }

    public static /* synthetic */ void dispatch$default(CoroutineScheduler coroutineScheduler, Runnable runnable, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            z2 = false;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            z3 = false;
        }
        coroutineScheduler.dispatch(runnable, z2, z3);
    }

    private final int getAvailableCpuPermits() {
        return (int) ((controlState$volatile$FU.get(this) & CPU_PERMITS_MASK) >> 42);
    }

    private final /* synthetic */ long getControlState$volatile() {
        return this.controlState$volatile;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater getControlState$volatile$FU() {
        return controlState$volatile$FU;
    }

    private final int getCreatedWorkers() {
        long j2 = getControlState$volatile$FU().get(this);
        return (int) ((j2 + 2097151) - (j2 | 2097151));
    }

    private final /* synthetic */ long getParkedWorkersStack$volatile() {
        return this.parkedWorkersStack$volatile;
    }

    private final /* synthetic */ int get_isTerminated$volatile() {
        return this._isTerminated$volatile;
    }

    private final long incrementBlockingTasks() {
        return controlState$volatile$FU.addAndGet(this, PARKED_VERSION_INC);
    }

    private final int incrementCreatedWorkers() {
        return (int) (controlState$volatile$FU.incrementAndGet(this) & 2097151);
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Unit> function1) {
        while (true) {
            function1.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final int parkedWorkersStackNextIndex(Worker worker) {
        Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != NOT_IN_STACK) {
            if (nextParkedWorker == null) {
                return 0;
            }
            Worker worker2 = (Worker) nextParkedWorker;
            int indexInArray = worker2.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = worker2.getNextParkedWorker();
        }
        return -1;
    }

    private final Worker parkedWorkersStackPop() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$volatile$FU;
        while (true) {
            long j2 = atomicLongFieldUpdater.get(this);
            Worker worker = this.workers.get((int) (2097151 & j2));
            if (worker == null) {
                return null;
            }
            long j3 = (-1) - (((-1) - (PARKED_VERSION_INC + j2)) | ((-1) - PARKED_VERSION_MASK));
            int iParkedWorkersStackNextIndex = parkedWorkersStackNextIndex(worker);
            if (iParkedWorkersStackNextIndex >= 0) {
                long j4 = iParkedWorkersStackNextIndex;
                if (parkedWorkersStack$volatile$FU.compareAndSet(this, j2, (j4 + j3) - (j4 & j3))) {
                    worker.setNextParkedWorker(NOT_IN_STACK);
                    return worker;
                }
            }
        }
    }

    private final long releaseCpuPermit() {
        return getControlState$volatile$FU().addAndGet(this, 4398046511104L);
    }

    private final /* synthetic */ void setControlState$volatile(long j2) {
        this.controlState$volatile = j2;
    }

    private final /* synthetic */ void setParkedWorkersStack$volatile(long j2) {
        this.parkedWorkersStack$volatile = j2;
    }

    private final /* synthetic */ void set_isTerminated$volatile(int i2) {
        this._isTerminated$volatile = i2;
    }

    private final void signalBlockingWork(long j2, boolean z2) {
        if (z2 || tryUnpark() || tryCreateWorker(j2)) {
            return;
        }
        tryUnpark();
    }

    private final Task submitToLocalQueue(Worker worker, Task task, boolean z2) {
        if (worker == null || worker.state == WorkerState.TERMINATED) {
            return task;
        }
        if (!task.taskContext && worker.state == WorkerState.BLOCKING) {
            return task;
        }
        worker.mayHaveLocalTasks = true;
        return worker.localQueue.add(task, z2);
    }

    private final boolean tryAcquireCpuPermit() {
        long j2;
        AtomicLongFieldUpdater controlState$volatile$FU2 = getControlState$volatile$FU();
        do {
            j2 = controlState$volatile$FU2.get(this);
            if (((int) (((-1) - (((-1) - CPU_PERMITS_MASK) | ((-1) - j2))) >> 42)) == 0) {
                return false;
            }
        } while (!getControlState$volatile$FU().compareAndSet(this, j2, j2 - 4398046511104L));
        return true;
    }

    private final boolean tryCreateWorker(long j2) {
        if (RangesKt.coerceAtLeast(((int) ((2097151 + j2) - (2097151 | j2))) - ((int) (((-1) - (((-1) - j2) | ((-1) - BLOCKING_MASK))) >> 21)), 0) < this.corePoolSize) {
            int iCreateNewWorker = createNewWorker();
            if (iCreateNewWorker == 1 && this.corePoolSize > 1) {
                createNewWorker();
            }
            if (iCreateNewWorker > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean tryCreateWorker$default(CoroutineScheduler coroutineScheduler, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = controlState$volatile$FU.get(coroutineScheduler);
        }
        return coroutineScheduler.tryCreateWorker(j2);
    }

    private final boolean tryUnpark() {
        Worker workerParkedWorkersStackPop;
        do {
            workerParkedWorkersStackPop = parkedWorkersStackPop();
            if (workerParkedWorkersStackPop == null) {
                return false;
            }
        } while (!Worker.workerCtl$volatile$FU.compareAndSet(workerParkedWorkersStackPop, -1, 0));
        LockSupport.unpark(workerParkedWorkersStackPop);
        return true;
    }

    public final int availableCpuPermits(long j2) {
        return (int) (((-1) - (((-1) - j2) | ((-1) - CPU_PERMITS_MASK))) >> 42);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown(10000L);
    }

    public final Task createTask(Runnable runnable, boolean z2) {
        long jNanoTime = TasksKt.schedulerTimeSource.nanoTime();
        if (!(runnable instanceof Task)) {
            return TasksKt.asTask(runnable, jNanoTime, z2);
        }
        Task task = (Task) runnable;
        task.submissionTime = jNanoTime;
        task.taskContext = z2;
        return task;
    }

    public final void dispatch(Runnable runnable, boolean z2, boolean z3) {
        AbstractTimeSource abstractTimeSource = AbstractTimeSourceKt.timeSource;
        if (abstractTimeSource != null) {
            abstractTimeSource.trackTask();
        }
        Task taskCreateTask = createTask(runnable, z2);
        boolean z4 = taskCreateTask.taskContext;
        long jAddAndGet = z4 ? controlState$volatile$FU.addAndGet(this, PARKED_VERSION_INC) : 0L;
        Worker workerCurrentWorker = currentWorker();
        Task taskSubmitToLocalQueue = submitToLocalQueue(workerCurrentWorker, taskCreateTask, z3);
        if (taskSubmitToLocalQueue != null && !addToGlobalQueue(taskSubmitToLocalQueue)) {
            throw new RejectedExecutionException(this.schedulerName + " was terminated");
        }
        boolean z5 = z3 && workerCurrentWorker != null;
        if (z4) {
            signalBlockingWork(jAddAndGet, z5);
        } else {
            if (z5) {
                return;
            }
            signalCpuWork();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dispatch$default(this, runnable, false, false, 6, null);
    }

    public final boolean isTerminated() {
        return _isTerminated$volatile$FU.get(this) != 0;
    }

    public final boolean parkedWorkersStackPush(Worker worker) {
        long j2;
        long j3;
        long j4;
        if (worker.getNextParkedWorker() != NOT_IN_STACK) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$volatile$FU;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            int i2 = (int) ((2097151 + j2) - (2097151 | j2));
            long j5 = PARKED_VERSION_INC + j2;
            j3 = (j5 + PARKED_VERSION_MASK) - (j5 | PARKED_VERSION_MASK);
            int indexInArray = worker.getIndexInArray();
            if (DebugKt.getASSERTIONS_ENABLED() && indexInArray == 0) {
                throw new AssertionError();
            }
            worker.setNextParkedWorker(this.workers.get(i2));
            j4 = indexInArray;
        } while (!parkedWorkersStack$volatile$FU.compareAndSet(this, j2, (j3 + j4) - (j3 & j4)));
        return true;
    }

    public final void parkedWorkersStackTopUpdate(Worker worker, int i2, int i3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$volatile$FU;
        while (true) {
            long j2 = atomicLongFieldUpdater.get(this);
            int iParkedWorkersStackNextIndex = (int) ((2097151 + j2) - (2097151 | j2));
            long j3 = (-1) - (((-1) - (PARKED_VERSION_INC + j2)) | ((-1) - PARKED_VERSION_MASK));
            if (iParkedWorkersStackNextIndex == i2) {
                iParkedWorkersStackNextIndex = i3 == 0 ? parkedWorkersStackNextIndex(worker) : i3;
            }
            if (iParkedWorkersStackNextIndex >= 0) {
                long j4 = iParkedWorkersStackNextIndex;
                if (parkedWorkersStack$volatile$FU.compareAndSet(this, j2, (j3 + j4) - (j3 & j4))) {
                    return;
                }
            }
        }
    }

    public final void runSafely(Task task) {
        try {
            task.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                AbstractTimeSource abstractTimeSource = AbstractTimeSourceKt.timeSource;
                if (abstractTimeSource == null) {
                }
            } finally {
                AbstractTimeSource abstractTimeSource2 = AbstractTimeSourceKt.timeSource;
                if (abstractTimeSource2 != null) {
                    abstractTimeSource2.unTrackTask();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void shutdown(long r9) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.shutdown(long):void");
    }

    public final void signalCpuWork() {
        if (tryUnpark() || tryCreateWorker$default(this, 0L, 1, null)) {
            return;
        }
        tryUnpark();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iCurrentLength = this.workers.currentLength();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < iCurrentLength; i7++) {
            Worker worker = this.workers.get(i7);
            if (worker != null) {
                int size$kotlinx_coroutines_core = worker.localQueue.getSize$kotlinx_coroutines_core();
                int i8 = WhenMappings.$EnumSwitchMapping$0[worker.state.ordinal()];
                if (i8 == 1) {
                    i4++;
                } else if (i8 == 2) {
                    i3++;
                    arrayList.add(new StringBuilder().append(size$kotlinx_coroutines_core).append('b').toString());
                } else if (i8 == 3) {
                    i2++;
                    arrayList.add(new StringBuilder().append(size$kotlinx_coroutines_core).append('c').toString());
                } else if (i8 == 4) {
                    i5++;
                    if (size$kotlinx_coroutines_core > 0) {
                        arrayList.add(new StringBuilder().append(size$kotlinx_coroutines_core).append('d').toString());
                    }
                } else {
                    if (i8 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i6++;
                }
            }
        }
        long j2 = controlState$volatile$FU.get(this);
        StringBuilder sb = new StringBuilder();
        sb.append(this.schedulerName).append('@').append(DebugStringsKt.getHexAddress(this)).append("[Pool Size {core = ").append(this.corePoolSize).append(", max = ").append(this.maxPoolSize).append("}, Worker States {CPU = ").append(i2).append(", blocking = ").append(i3).append(", parked = ").append(i4).append(", dormant = ").append(i5).append(", terminated = ").append(i6).append("}, running workers queues = ").append(arrayList).append(", global CPU queue size = ").append(this.globalCpuQueue.getSize()).append(", global blocking queue size = ").append(this.globalBlockingQueue.getSize());
        sb.append(", Control State {created workers= ").append((int) ((-1) - (((-1) - 2097151) | ((-1) - j2)))).append(", blocking tasks = ").append((int) (((BLOCKING_MASK + j2) - (BLOCKING_MASK | j2)) >> 21)).append(", CPUs acquired = ").append(this.corePoolSize - ((int) (((-1) - (((-1) - CPU_PERMITS_MASK) | ((-1) - j2))) >> 42))).append("}]");
        return sb.toString();
    }
}
