package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.selects.SelectClause1;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&˛\bDRш|İI\u0006>\u00146B\u0005(4\u0012\u000e\u0007nj?1Le^.ZS0\u0014s{J$cҕyCIU\"Ԃ*\teNog\u0005JbŏK\u000f\u0014\u0017\u0001j2M[]s܈76HģM2knm9\u000ft~\u0011.::80ڎGʄhН\u0014v\tL\u0014  >XvJT\u001dM;܅@\u0015\u0005ŏ?ɉ`iTFVu&M=6\u001boRP7_fŧ{\u001c\rxܮ\u0011xg29U\u007fB#;k\t\u0017Tk?9ӊ TKع'oHW\fo6\u0007\u0019D#1O\u001bw\u000b.r\u0004\u007f|t)ANBf\u00172߭{z\n*\u0005\n\u001c\u001e?H\\F`{P A\r\u000bSnR2fH\u007f\t{N\u0019;~aI\u007f@/^oZ1PMz;ټd8ъr!iiVn#;lyg0\b̵\u0004ˈ\r̆]={\rAz\u0010+\u001c0u\u0002e gѬ\u0019É;eI%'n\u0010L\\i|\u0006nm$\u0002`NX\"\u001d\u0018mN_ə\\ֈh\u000f{RZ_:\u0015e\u001eZ\r\f\rc6j\u0002T'5\u0012^O\u001fȉ\u0019X4ܪ'çj;qpq\u001aeF/OCb{\u001cqZ\u0007\u001aO>r\u0005\u000f٨pb:e3͌$ĘLn(y\u0002V\\\u0019cRM\u00134<<5)^+G9ٜpL3]6ˋjʐ\u0003^C&\t\f2x!\u0003V\u007f~|ψ|m"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00125W}$Hms1ILDk;s", "\u0013", "", "7r29b:>Ry\t\bK,z\t3v\u007f", "", "7r29b:>Ry\t\bK,z\t3v\u007ffwI\n!&C~\u0012F\u007f3", "u(E", "u(I", "7r4:c;R", "7r4:c;R\u0012\u0015\b\u0004h;x\u00183o\t6", "@dR2\\=>", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "=mA2V,Bd\u0019", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0007A", "5dc\u001ca\u0019>Q\u0019\u0003\f^", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ%\u0017No\fK\u0005n#Y\u0005 5|s5ISIk\u007fs", "@dR2\\=>1\u0015\u000exa0\u0006\u000b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7t\u0003.[SBz\n", "@dR2\\=>1\u0015\u000exa0\u0006\u000bvJjtz&d\u0007", "=mA2V,Bd\u0019\\vm*\u007f\r8g", "5dc\u001ca\u0019>Q\u0019\u0003\f^\nx\u0018-h\u00041}", "Bqh\u001fX*>W*~", "Bqh\u001fX*>W*~BI;{m$t\u0006", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "7sT?T;H`", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7ty=MP7z>+j", "1`]0X3", "", "1`d@X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158\u0006)?b]35m!=QMDA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Pm\u000eC}!D]\b)\u0017\u0001\u0014.XR?u=s", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`tCx\f<},1h\u0002*@M),MNJo>'j,R", "", ">n[9", "@dR2\\=>=&g\u000be3", "=mA2V,Bd\u0019h\bG<\u0004\u0010", "5dc\u001ca\u0019>Q\u0019\u0003\f^\u0016\nq?l\u0007fwI\n!&C~\u0012F\u007f3", "5dc\u001ca\u0019>Q\u0019\u0003\f^\u0016\nq?l\u0007", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public interface ReceiveChannel<E> {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static /* synthetic */ void cancel$default(ReceiveChannel receiveChannel, CancellationException cancellationException, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i2 & 1) != 0) {
                cancellationException = null;
            }
            receiveChannel.cancel(cancellationException);
        }

        public static /* synthetic */ boolean cancel$default(ReceiveChannel receiveChannel, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i2 + 1) - (i2 | 1) != 0) {
                th = null;
            }
            return receiveChannel.cancel(th);
        }

        public static <E> SelectClause1<E> getOnReceiveOrNull(ReceiveChannel<? extends E> receiveChannel) {
            Intrinsics.checkNotNull(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel<E of kotlinx.coroutines.channels.ReceiveChannel>");
            return ((BufferedChannel) receiveChannel).getOnReceiveOrNull();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T2Or[\u001bf\u0014nKa\u00058smS}:kKMxEUev@\u0006#KN\u0017d_\u00031f", replaceWith = @ReplaceWith(expression = "onReceiveCatching", imports = {}))
        @InterfaceC1492Gx
        public static /* synthetic */ void getOnReceiveOrNull$annotations() {
        }

        public static /* synthetic */ void isClosedForReceive$annotations() {
        }

        public static /* synthetic */ void isEmpty$annotations() {
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T@Va\f\u000f(\u001bw!d6Ut*\u0015\t6\u007fZQgGVrm\u007f\u0014]#F\u0017W_~afWOj}H\u001a\r[SX#{s\u0012\u0005\u001b\u0006@ P\u0002;o'\u0018\bI\u0013D\bF<<pW~@f[|\u000b454I$.\u0011*,J<Z\u0013.-CC,\u000eV)MJib\u000b4\u001ddL7.&sr^\u0010\u0014\u0010;++\u001cM[#I%1\rw\u0011\\\u00026T0.}q\u0004O\u001fr3\u001czi\u000fo%3vb\"\u0005t`O/L&[\u001e`-1 YFKU9M\fhkZ,;\u0014_\rveKtva\u0004'H\\C\"", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        @InterfaceC1492Gx
        public static <E> E poll(ReceiveChannel<? extends E> receiveChannel) throws Throwable {
            Object objMo10492tryReceivePtdJZtk = receiveChannel.mo10492tryReceivePtdJZtk();
            if (ChannelResult.m10509isSuccessimpl(objMo10492tryReceivePtdJZtk)) {
                return (E) ChannelResult.m10505getOrThrowimpl(objMo10492tryReceivePtdJZtk);
            }
            Throwable thM10503exceptionOrNullimpl = ChannelResult.m10503exceptionOrNullimpl(objMo10492tryReceivePtdJZtk);
            if (thM10503exceptionOrNullimpl == null) {
                return null;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(thM10503exceptionOrNullimpl);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T2Or[\u001bf\u0014nK\u0019\tKqoW\u000b)Ii`gJVjo\u007f\u0014]#F\u0017W_~afWOj}H\u001a\r[SX#{s\u0012\u0005\u001b\u0006@ P\u0002;o'\u0018\bI\u0013D\bF<<pW~@f[|\u000b454I$.\u0011*,J<Z\u0013.-CC,\u000eV)MJib\u000b4\u001ddL7.&sr^\u0012\n\u00074m\u0002\u001d3iE\u001f+.Aw\u0001]\u0001B\u0004$8\r(\u0005Rd 2\u0011\u0003i\u0015v\u001d2(`g\u0005t\\Q!TkW-\u001a8+eFJ\u0011\u0001CMR'm\u000b4>\r4\u0011l\"|yvVt/JX#&W;\n+Ka,\u000e\u0005\u0019@\u0003SIhEM#)", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        @yg.InterfaceC1492Gx
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static <E> java.lang.Object receiveOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r5, kotlin.coroutines.Continuation<? super E> r6) {
            /*
                boolean r0 = r6 instanceof kotlinx.coroutines.channels.ReceiveChannel.AnonymousClass1
                if (r0 == 0) goto L3a
                r4 = r6
                kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1 r4 = (kotlinx.coroutines.channels.ReceiveChannel.AnonymousClass1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L3a
                int r0 = r4.label
                int r0 = r0 - r1
                r4.label = r0
            L13:
                java.lang.Object r3 = r4.result
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r0 = 1
                if (r1 == 0) goto L2e
                if (r1 != r0) goto L40
                kotlin.ResultKt.throwOnFailure(r3)
                kotlinx.coroutines.channels.ChannelResult r3 = (kotlinx.coroutines.channels.ChannelResult) r3
                java.lang.Object r0 = r3.m10511unboximpl()
            L29:
                java.lang.Object r0 = kotlinx.coroutines.channels.ChannelResult.m10504getOrNullimpl(r0)
                return r0
            L2e:
                kotlin.ResultKt.throwOnFailure(r3)
                r4.label = r0
                java.lang.Object r0 = r5.mo10491receiveCatchingJP2dKIU(r4)
                if (r0 != r2) goto L29
                return r2
            L3a:
                kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1 r4 = new kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1
                r4.<init>(r6)
                goto L13
            L40:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.receiveOrNull(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1<E> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.receiveOrNull(null, this);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016O\n8v4e%*\u0015wF\u0010\u00175\\]^\"f\bw\u0019bwZwlW\u0001-z\u0002\f{Kad(OK0FC!d_9}5\b\f3\u000f\u0002*")
    @InterfaceC1492Gx
    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016O\n8v4e%*\u0015wF\u0010\u00175\\]^\"f\bw\u0019bwZwlW\u0001-z\u0002\f{Kad(OK0FC!d_9}5\b\f3\u000f\u0002*")
    @InterfaceC1492Gx
    /* synthetic */ boolean cancel(Throwable th);

    SelectClause1<E> getOnReceive();

    SelectClause1<ChannelResult<E>> getOnReceiveCatching();

    SelectClause1<E> getOnReceiveOrNull();

    boolean isClosedForReceive();

    boolean isEmpty();

    ChannelIterator<E> iterator();

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T@Va\f\u000f(\u001bw!d6Ut*\u0015\t6\u007fZQgGVrm\u007f\u0014]#F\u0017W_~afWOj}H\u001a\r[SX#{s\u0012\u0005\u001b\u0006@ P\u0002;o'\u0018\bI\u0013D\bF<<pW~@f[|\u000b454I$.\u0011*,J<Z\u0013.-CC,\u000eV)MJib\u000b4\u001ddL7.&sr^\u0010\u0014\u0010;++\u001cM[#I%1\rw\u0011\\\u00026T0.}q\u0004O\u001fr3\u001czi\u000fo%3vb\"\u0005t`O/L&[\u001e`-1 YFKU9M\fhkZ,;\u0014_\rveKtva\u0004'H\\C\"", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @InterfaceC1492Gx
    E poll();

    Object receive(Continuation<? super E> continuation);

    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    Object mo10491receiveCatchingJP2dKIU(Continuation<? super ChannelResult<? extends E>> continuation);

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T2Or[\u001bf\u0014nK\u0019\tKqoW\u000b)Ii`gJVjo\u007f\u0014]#F\u0017W_~afWOj}H\u001a\r[SX#{s\u0012\u0005\u001b\u0006@ P\u0002;o'\u0018\bI\u0013D\bF<<pW~@f[|\u000b454I$.\u0011*,J<Z\u0013.-CC,\u000eV)MJib\u000b4\u001ddL7.&sr^\u0012\n\u00074m\u0002\u001d3iE\u001f+.Aw\u0001]\u0001B\u0004$8\r(\u0005Rd 2\u0011\u0003i\u0015v\u001d2(`g\u0005t\\Q!TkW-\u001a8+eFJ\u0011\u0001CMR'm\u000b4>\r4\u0011l\"|yvVt/JX#&W;\n+Ka,\u000e\u0005\u0019@\u0003SIhEM#)", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @InterfaceC1492Gx
    Object receiveOrNull(Continuation<? super E> continuation);

    /* JADX INFO: renamed from: tryReceive-PtdJZtk */
    Object mo10492tryReceivePtdJZtk();
}
