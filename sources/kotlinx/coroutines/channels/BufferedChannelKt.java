package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d̉=!4i\bDRj|\u0004W\u00068\u000b4E\u0007\":ߚ\u007fјnjG6LeN.ZS8\u0018sڔ<$q$yCAU\"}8\tWNuhvJp\u000bK\u000f\f\u0016\u0001jBI]ތe\u0012\u001d2JoE7UoS9ht<38\\0\u0600\u0012#\u0011\u001c:H>v\u000bK[\u0012\"2Pp\u0001T;N\u0015\"\"\fN\"\u0011\u001e#i|7vk}<5݊\u0011k\t÷?\b>\u007fe\u0013VV7\r=cL,`9;Ֆ3U3\u000b`_W\u0003mqm\u000fv,?1Yug6\u001f\u0002B\u0016qO%R\u00011t\u0005\u007fl,)1ՒqXx\u00148y\u000b{SI2\u001c6+V=E\u001a-\u0015>\u0001zraPhInS\u0010\n\u0010Hа)\n9>I!leq=\u001fT]\u0011\u0015\u001e.2G{Ĳ_^\u0014s%!Z\fa3WFcW^\u001biL\u001c\u001aͲf\f0\u0017@M\u0006C\f\u00134\u001dKNk;3!\u001a\u001a^C\u0016\bK`ĈWi`aX0|2O*7\f\u000bHr\"\u0004P\u0003ar\u0011e2bJ\u0016\bA \r{Je=\u0010|O\u0019mx\u0013u\nS8-7q\u0005y[o9\r3eUqTyR%\u0014o@pSpfp_RZ|<08`r {\fFd\u000bA9mrrؼ.֞\u001d\\\u001dǽ#,PI\u0015\t\u000ec\u001fɭUԠ5ʗ\u0007i,ڏ)\r^f\to\u0016\u0002 ؖ~˃&-IٛU%4o:hb|yȗQ\u0381\u0004GoնgXz1\u000eU* l֠\fֺ3=\u001bÁ\u001f7@ EEz\u0012\u001cʸ$Ⱦ)ϸ\u0001y\u0017\u0090\t:u(\u0003pZ\u007fA\u07bdQݚ\u001b\"~ܥ\u0013/\u0016\u0006\u0018y\u0010eQõeӝ\u000f[Fδ\u0013\u000fg^f8+$uǊ'˽s\"\u0005ކMO5@.wBNk˘_ɳs.\u0002ʬ/2\u0003\n\u001c,\u00125F̨SЄ6;@Ծy\u000bLG<l1a\u001f۶yڇF\t<ؿSTO\u000b\tVflaɃ\u007f֨\u000b,\u0015ߞvmH:\b}bM6͉uʸ\u0002\u001afƹ=\u0013S{u\u0017\u000eWj5b\u000f8*Rυp݁ =(݈wn\u0017[\u001esFU\u0018ݨdƀ@\t,҉LH\u00167[T\u0018%fĂ\u0002ʮc\u000f\u001fϨb\u007fI\u0004&T'e-ޣWޝI`)ơ!\u000b\u001da6xc:[֊\u0019ߟ3c:ܬs)\u0017J\u0003O-o{ŀ\u0017ȗ=\u001b0߰!\u0017S\u000e[I0?Zڞ{Թoo\u0014Մ8\t+s0\u001bgZg٦Iҍb\u000b]̤np\u0005D~R|+\u007fͩMէ\u0012<\u0012ۇ+%]&\bb[k%ߚ9ƴ\u001e\u0001\u001f\u05edI\u0013\u001a1{FIL\\י/ִMj\u001c՝\u001ccap\u0016\bN?}\u05f7vֈ`W\u0016ў*i)p.qD\u0002XƄ\u0015ц$\u00046\u05fd\u0015~\u0018e 6}\u000b\nûeȨ]k\u007f˺`39%\u001eByqOƀ6ؼgn]̃#r?\u0010\u0012n[YsԗyӰ2\u0013`ŔZ\u001daZp\u0011.\u001dkҴq߱\fb1ցoov,\u0004O\n\u0016\u0002ԝ>ˮe18ܼ>\n-6\u000e\u0004XT~׀\u000eܑQ>lӷ|\u0004P\u0015&^\u0019(\rt:)JϜ~\u001fՠ\u0013ӥ8J\u000b jmEX?r\u001b\bx\u00072Nq&O1\t͋\u001b\u000eֻ\rÃ,z)\u0005@$\u0003BJN\u00179\u0018gZ-\u001dª\u0010Ն+Y,ݦ\u0005\u000f4\u0013]8p\b\u0003ֹ`Ŕ3Z@Ԍ^s(dSQaAA\u0011/\u0015nܐo]ؕ7֚UW=,\u0007F\u000fL_\u0011?6Rse~K/=oQ˳f\u0012ç7ְP+$\u0004k\u0016\r\u001a\u07b8Z^"}, d2 = {"1qT.g,,S\u001b\u0007zg;]\u00198c\u000f,\u0006I", "\u001aj^A_0G\u001d&~{e,z\u0018xK`8\u0005>\u0010\u001b!P<c", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0004.OK;tCs", "\u0013", "1qT.g,,S\u001b\u0007zg;", "7c", ">qTC", "\u001cT;\u0019R\u001a\u001e5\u0001^cM", "", "!D6\u001a8\u0015-M\u0007bo>", "", "\u0013W?\u000eA\u000b80\t_[>\u0019vf\u0019Mj\u000f[/d\u0001\u007fAai e\u001f\u0019H]\r\u0013\\y\u001861", "Bqh\u001fX:N[\u0019I", "", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "D`[BX", "=m2.a*>Z z\nb6\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`d@X", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "1n]AX?M", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^\u0013 Eo\u0015Cr\"<Y[*@|\u001a7]?Jo>'jOf5\u0018_uUr0I\u00168)aRpLix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0015OXj", "\u0010T5\u00138\u001983\u0002]tK\feg\u000fZp\u0012k.", "\u0010T5\u00138\u001983\u0002]tN\u0015cl\u0017In\bZ", "7mXA\\(E0)\u007f{^9\\\u0012.", "1`_.V0Mg", "\u0010T5\u00138\u0019\u001e2", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013Iaz*>C", "\u0017MN\u000fH\r\u001f3\u0006", " DB\"@\u0010'5\u0013[nX\u0019Zy", " DB\"@\u0010'5\u0013[nX\fY", "\u001eN8 B\u0015\u001e2", "\u0012N=\u0012R\u0019\u001cD", "\u0017MC\u0012E\u0019.>\b^YX\u001a\\q\u000e", "\u0017MC\u0012E\u0019.>\b^YX\u0019Zy", "\u0011G0\u001bA\f%MvedL\f[", "5dc\u0010;\b'<xet<\u0013fv\u000fD", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u001b Vo\u001bEr,~G\u0012(4w\u001d\u0004", "!TB\u001d8\u0015\u001d", "!TB\u001d8\u0015\u001dM\u0002htP\b`w\u000fR", "\u0014@8\u00198\u000b", " DB\"?\u001b8@xgY>!mr\u001fS", " DB\"?\u001b80\t_[>\u0019\\g", " DB\"?\u001b8A\tle>\u0015[", " DB\"?\u001b8A\tle>\u0015[\u0003\u0018Oy\u001aW$ov\u0004", " DB\"?\u001b81\u007fhh>\u000b", " DB\"?\u001b84tba>\u000b", "\u001cNN\u001f8\n\u001e7\n^tK\fjx\u0016T", "\u0011K> 8&!/\u0002]a>\u0019vf\u0016Om\bZ", "\u0011K> 8&!/\u0002]a>\u0019vl\u0018Vi\u000e[\u001f", "\u001cNN\u0010?\u0016,3\u0013\\VN\u001a\\", "\u0011K> 8&,BtmjL&Xf\u001eIp\b", "\u0011K> 8&,BtmjL&Zd\u0018C_\u000fb\u001coz\u00010i{+R\u0012$9\\", "\u0011K> 8&,BtmjL&Zo\u0019S_\u0007", "\u0011K> 8&,BtmjL&Zd\u0018C_\u000fb _", "!D=\u00118\u0019,MvedL\fvv\u001eAn\u0018i:nyz(^", "!D=\u00118\u0019,MvhjG\u001b\\u)M[\u0016a", "Ad]1X9L1#\u000f\u0004m,\n", "5dc X5=S&\rXh<\u0006\u0018/r", "uI\u0018\u0017", "Ad]1X9L1 \t\t^\u001a\f\u0005>u\u000e", "5dc X5=S&\rXe6\u000b\t\u001dt{7\fN", "uI\u0018\u0016", "1n]@g9NQ(lzg+|\u0016=A\t'YG\u000b%\u00175~\nK\u00073", "1nd;g,K", "1k^@X\u001aMO(\u000f\t", "\u0013AN\u0010B\u0014):xmZ=&gd\u001fS_\"[3kr\u007f&ij,W\u0006\u0015Fk\u001a\u0014Q\u0005", "\u0013AN\u0010B\u0014):xmZ=&Zr\u001fNn\bh:hr\u0005-", "3a2<`7ES(~y<6\r\u0012>e\r", "5dc\u0012U\nH[$\u0006zm,{f9u\t7{M", "3a?.h:>3,\nvg+Y\u00190f\u007f5\n", "5dc\u0012U\u0017:c'~Zq7x\u0012.B\u0010)|@\u000e%", "uI\u0018'", "1n]@g9NQ(^W<6\u0005\u00146e\u000f(z\u001c\n\u0016\u0002C\u007f\u001c<W,1[", ">`d@X\f\u001b", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class BufferedChannelKt {
    private static final long BUFFER_END_RENDEZVOUS = 0;
    private static final long BUFFER_END_UNLIMITED = Long.MAX_VALUE;
    private static final int CLOSE_STATUS_ACTIVE = 0;
    private static final int CLOSE_STATUS_CANCELLATION_STARTED = 1;
    private static final int CLOSE_STATUS_CANCELLED = 3;
    private static final int CLOSE_STATUS_CLOSED = 2;
    private static final long EB_COMPLETED_COUNTER_MASK = 4611686018427387903L;
    private static final long EB_COMPLETED_PAUSE_EXPAND_BUFFERS_BIT = 4611686018427387904L;
    private static final int RESULT_BUFFERED = 1;
    private static final int RESULT_CLOSED = 4;
    private static final int RESULT_FAILED = 5;
    private static final int RESULT_RENDEZVOUS = 0;
    private static final int RESULT_SUSPEND = 2;
    private static final int RESULT_SUSPEND_NO_WAITER = 3;
    private static final int SENDERS_CLOSE_STATUS_SHIFT = 60;
    private static final long SENDERS_COUNTER_MASK = 1152921504606846975L;
    private static final ChannelSegment<Object> NULL_SEGMENT = new ChannelSegment<>(-1, null, null, 0);
    public static final int SEGMENT_SIZE = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);
    private static final int EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object) null);
    public static final Symbol BUFFERED = new Symbol("BUFFERED");
    private static final Symbol IN_BUFFER = new Symbol("SHOULD_BUFFER");
    private static final Symbol RESUMING_BY_RCV = new Symbol("S_RESUMING_BY_RCV");
    private static final Symbol RESUMING_BY_EB = new Symbol("RESUMING_BY_EB");
    private static final Symbol POISONED = new Symbol("POISONED");
    private static final Symbol DONE_RCV = new Symbol("DONE_RCV");
    private static final Symbol INTERRUPTED_SEND = new Symbol("INTERRUPTED_SEND");
    private static final Symbol INTERRUPTED_RCV = new Symbol("INTERRUPTED_RCV");
    private static final Symbol CHANNEL_CLOSED = new Symbol("CHANNEL_CLOSED");
    private static final Symbol SUSPEND = new Symbol("SUSPEND");
    private static final Symbol SUSPEND_NO_WAITER = new Symbol("SUSPEND_NO_WAITER");
    private static final Symbol FAILED = new Symbol("FAILED");
    private static final Symbol NO_RECEIVE_RESULT = new Symbol("NO_RECEIVE_RESULT");
    private static final Symbol CLOSE_HANDLER_CLOSED = new Symbol("CLOSE_HANDLER_CLOSED");
    private static final Symbol CLOSE_HANDLER_INVOKED = new Symbol("CLOSE_HANDLER_INVOKED");
    private static final Symbol NO_CLOSE_CAUSE = new Symbol("NO_CLOSE_CAUSE");

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class AnonymousClass1<E> extends FunctionReferenceImpl implements Function2<Long, ChannelSegment<E>, ChannelSegment<E>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l2, Object obj) {
            return invoke(l2.longValue(), (ChannelSegment) obj);
        }

        public final ChannelSegment<E> invoke(long j2, ChannelSegment<E> channelSegment) {
            return BufferedChannelKt.createSegment(j2, channelSegment);
        }
    }

    public static final long constructEBCompletedAndPauseFlag(long j2, boolean z2) {
        return (z2 ? 4611686018427387904L : 0L) + j2;
    }

    public static final long constructSendersAndCloseStatus(long j2, int i2) {
        return (((long) i2) << 60) + j2;
    }

    public static final <E> ChannelSegment<E> createSegment(long j2, ChannelSegment<E> channelSegment) {
        return new ChannelSegment<>(j2, channelSegment, channelSegment.getChannel(), 0);
    }

    public static final <E> KFunction<ChannelSegment<E>> createSegmentFunction() {
        return AnonymousClass1.INSTANCE;
    }

    public static final Symbol getCHANNEL_CLOSED() {
        return CHANNEL_CLOSED;
    }

    private static final long getEbCompletedCounter(long j2) {
        return (j2 + 4611686018427387903L) - (j2 | 4611686018427387903L);
    }

    private static final boolean getEbPauseExpandBuffers(long j2) {
        return (j2 + 4611686018427387904L) - (j2 | 4611686018427387904L) != 0;
    }

    private static final int getSendersCloseStatus(long j2) {
        return (int) (j2 >> 60);
    }

    private static final long getSendersCounter(long j2) {
        return (-1) - (((-1) - j2) | ((-1) - SENDERS_COUNTER_MASK));
    }

    public static final long initialBufferEnd(int i2) {
        if (i2 == 0) {
            return 0L;
        }
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean tryResume0(CancellableContinuation<? super T> cancellableContinuation, T t2, Function3<? super Throwable, ? super T, ? super CoroutineContext, Unit> function3) {
        Object objTryResume = cancellableContinuation.tryResume(t2, null, function3);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }

    static /* synthetic */ boolean tryResume0$default(CancellableContinuation cancellableContinuation, Object obj, Function3 function3, int i2, Object obj2) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function3 = null;
        }
        return tryResume0(cancellableContinuation, obj, function3);
    }
}
