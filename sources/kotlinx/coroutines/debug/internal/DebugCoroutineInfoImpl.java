package kotlinx.coroutines.debug.internal;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tqA0JhP.hS2\u000fq|<$iByCQU\"}(\nWNusvJ`\rK\u000f\u0014\u001c\u0001̓4Icxe܈\u00172XoG\u074cUoKBht<\u0005(288\u0002ڎ\t\u001a@H\u0018v\u0001JS\f(0Hp@S\u0013L\u001b܅B\u0006l\u001fAAbɡ^<Vlu<E\"1jRT5aH~c\ftW7\u0011\u0005e6+n<߱\u0019'Y\t\u0015Y$f\u0011Y\n=3\u0004W+9\\\fWdl0\u001c#Gg\u0011mr,]3n\u0011\u00105IgcyoTߊÞ~{\u0013\\L\u001f\u0014R`4=\u001cv\b<C#\u0002\u001aóг\u0006^H,CmD%=\u0006C-I\u001b\u0015a\u0010J_N\u007f\u001c\u0013:6#/\nIad\u0010p\u0015Id&\u007faWNY`P Xk\u0012J͒1͆.\u0004>vH5\nAF\u0017SK\"Ms5y\u0004`F}u3c?׆kʐLF*Â.90\u0011\u001ac\u0015r\u0013ohT\u00071GQrΉ\tą\f\u0013(οHP//(V_lylc\\8&]q\u000eխp«\u0012WAӔ\u0004F_c(chuB@r'ۖ\\jZU\u0012fj5rGVx(}\fF^\fABm\u0001RxϜ5\u001dt\u0017N\u0014,T\u0012\u000f\u0017rrh>\u0013\u000bqzѱk˨x\r\u0019Rb\u0006}}IY:\u0014x\"[U\b9W*,Ȱtط\u0001#\u000fѨD\fU\u007fdGz\u0006l߲aދ$\u0016\"ߙ\"AK4'\u0001?10O{P1i(˯\u001eؠ~|\u0002Ҹ\f\u0001<\u000b r\u0001.pjxsj\u0016P\u0002\u0015va\f;ш\u0006ӶJzOϊ%1idat\u0019Xjrh\u0003\u0013D6'\u0017nP!kk\u0002esȷ\u0004ӄ3\u001fy_o\u0017<\"\u0003\u0011,\u001es.УgG"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001L\u0016+]E\u0019uA(%weB\u0007G5O\u0001\u000bOWU\u0002", "", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "1qT.g0H\\\u0007\u000ev\\2Y\u0013>t\n0", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001[%*KI*x0\u001c\u0015In5\u000fc\u0002", "Ad`BX5<S\u0002\u000f\u0003[,\n", "", "\nh]6g\u0005", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015SMJr8'(2_C\u0014m<]z0GZ\u0018+\\O\u0003?]\u0016c\u001dN8\u0016\u0001`\u000b\u0012}@5%v9E\u007f;I\u000e\b\u001e\u000e\u000bO43", "5dc\u0010e,:b\u001d\t\u0004L;x\u00075B\n7\u000bJ\tU\u001dQ~\u0015@\u007f8/W\b-A}%2VCIe2(\"h", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0016\u0017D\u007f\u0010\u0006z.DY\u000b)3t_\u001c\\?9q#+\u0011fa\u001a\u0014_4NL", "-b^;g,Qb", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "5dc\u0010b5MS,\u000e", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "1qT.g0H\\\u0007\u000ev\\2k\u0016+c\u007f", "", "\u001aiPCTuEO\"\u0001DL;x\u00075T\r$y@`\u001e\u0017Oo\u0017KL", "5dc\u0010e,:b\u001d\t\u0004L;x\u00075T\r$y@", "u(;7T=:\u001d)\u000e~euc\r=tU", "AsPAX", "", "5dc g(MSW\u0005\u0005m3\u0001\u0012B_}2\tJ\u0011&\u001bPo\u001c6t/BY", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "-rc.g,", "Cm\\.g*AS\u0018kzl<\u0005\t", "", "CoS.g,,b\u0015\u000ez", "", "4qP:X", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "Ag^B_+\u001bS\u0001z\n\\/|\b", "", "CoS.g,,b\u0015\u000ez\u001d2\u0007\u00186i\t;u>\u000b$!W~\u0012Ev3/W\b-7", ":`bAB)LS&\u0010z]\u001b\u007f\u0016/a~", "\u001aiPCTuEO\"\u0001DM/\n\t+dU", "-kP@g\u0016;a\u0019\f\f^+]\u0016+m\u007f", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eq\u0001Q\t`\u001bP~\u000eI\u007f!<#[*Dw&=QL;YC\u001a\u0013nBF\u0003k,$", "D`[BX", ":`bAB)LS&\u0010z]\r\n\u00057e", "5dc\u0019T:M=\u0016\rzk=|\b\u0010r{0{~\u0007!&Ns\u0017Op#?f\b0Fq\u001f.[=9uA\u001e", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n\u0006(\u001f\u0011s\u0017Kv2>U\u0005i\u0015w#8]R?t4\f$d_?gp(Vv|", "Adc\u0019T:M=\u0016\rzk=|\b\u0010r{0{~\u0007!&Ns\u0017Op#?f\b0Fq\u001f.[=9uA\u001e", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6EE\u0012\u001f`Kx\u001d<\u0004.1`G}Az >\\GDk\"-\u0011fg\u001a\u0014_4NLj8", ":`bAB)LS&\u0010z]\u001a\f\u0005-kn5w>\u0001", ":`bAB)LS&\u0010z]\u001a\f\u0005-kn5w>\u0001U\u001dQ~\u0015@\u007f8/W\b-A}%2VCIe2(\"h", "GhT9W\rKO!~\t", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eo{:\u000105/", "uKZ<g3B\\b\rzj<|\u0012-e\u000eqi@\r'\u0017Pm\u000e*t/@YS\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018{8O\u0016R5kR\u007fF\u0010\u0019$kX8\u0017\u0015hE-n2F\u001b\u00062*\u000f7p\u0001a|\u0014?ywF_YE\u0004\"\u007fQ8lOYmC%KNq.m\u001c[,`DCyWX\u001e\u0017yLw\u0011w\\\u0013<<vlgE(P", "BnBAe0GU", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class DebugCoroutineInfoImpl {
    private final WeakReference<CoroutineContext> _context;
    public volatile WeakReference<CoroutineStackFrame> _lastObservedFrame;
    public volatile String _state = DebugCoroutineInfoImplKt.CREATED;
    private final StackTraceFrame creationStackBottom;
    public volatile Thread lastObservedThread;
    public final long sequenceNumber;
    private int unmatchedResume;

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bDZc|\u0004W\u0006>éFB-!T\u0018\b\tvjg1re\u000f6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eo{:\u000105/", "\u001aiPCTuEO\"\u0001DL;x\u00075T\r$y@`\u001e\u0017Oo\u0017KL"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super StackTraceElement>, Continuation<? super Unit>, Object> {
        final /* synthetic */ StackTraceFrame $bottom;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(StackTraceFrame stackTraceFrame, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$bottom = stackTraceFrame;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = DebugCoroutineInfoImpl.this.new AnonymousClass1(this.$bottom, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super StackTraceElement> sequenceScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope = (SequenceScope) this.L$0;
                this.label = 1;
                if (DebugCoroutineInfoImpl.this.yieldFrames(sequenceScope, this.$bottom.getCallerFrame(), this) == coroutine_suspended) {
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
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C14241 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C14241(Continuation<? super C14241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return DebugCoroutineInfoImpl.this.yieldFrames(null, null, this);
        }
    }

    public DebugCoroutineInfoImpl(CoroutineContext coroutineContext, StackTraceFrame stackTraceFrame, long j2) {
        this.creationStackBottom = stackTraceFrame;
        this.sequenceNumber = j2;
        this._context = new WeakReference<>(coroutineContext);
    }

    private final List<StackTraceElement> creationStackTrace() {
        StackTraceFrame stackTraceFrame = this.creationStackBottom;
        return stackTraceFrame == null ? CollectionsKt.emptyList() : SequencesKt.toList(SequencesKt.sequence(new AnonymousClass1(stackTraceFrame, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0041 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004f -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object yieldFrames(kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> r7, kotlin.coroutines.jvm.internal.CoroutineStackFrame r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.C14241
            if (r0 == 0) goto L58
            r5 = r9
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r5 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.C14241) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L58
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L16:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L53
            if (r0 != r2) goto L61
            java.lang.Object r1 = r5.L$2
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r1 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r1
            java.lang.Object r8 = r5.L$1
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r8 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r8
            java.lang.Object r7 = r5.L$0
            kotlin.sequences.SequenceScope r7 = (kotlin.sequences.SequenceScope) r7
            kotlin.ResultKt.throwOnFailure(r4)
        L32:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r8 = r8.getCallerFrame()
            if (r8 == 0) goto L5e
        L38:
            if (r8 != 0) goto L3d
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L3d:
            java.lang.StackTraceElement r0 = r8.getStackTraceElement()
            if (r0 == 0) goto L32
            r5.L$0 = r7
            r5.L$1 = r8
            r5.L$2 = r1
            r5.label = r2
            java.lang.Object r0 = r7.yield(r0, r5)
            if (r0 != r3) goto L52
            return r3
        L52:
            goto L32
        L53:
            kotlin.ResultKt.throwOnFailure(r4)
            r1 = r6
            goto L38
        L58:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r5 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            r5.<init>(r9)
            goto L16
        L5e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.yieldFrames(kotlin.sequences.SequenceScope, kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final CoroutineContext getContext() {
        return this._context.get();
    }

    public final StackTraceFrame getCreationStackBottom$kotlinx_coroutines_core() {
        return this.creationStackBottom;
    }

    public final List<StackTraceElement> getCreationStackTrace() {
        return creationStackTrace();
    }

    public final CoroutineStackFrame getLastObservedFrame$kotlinx_coroutines_core() {
        WeakReference<CoroutineStackFrame> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final String getState$kotlinx_coroutines_core() {
        return this._state;
    }

    public final List<StackTraceElement> lastObservedStackTrace$kotlinx_coroutines_core() {
        CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        while (lastObservedFrame$kotlinx_coroutines_core != null) {
            StackTraceElement stackTraceElement = lastObservedFrame$kotlinx_coroutines_core.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            lastObservedFrame$kotlinx_coroutines_core = lastObservedFrame$kotlinx_coroutines_core.getCallerFrame();
        }
        return arrayList;
    }

    public final void setLastObservedFrame$kotlinx_coroutines_core(CoroutineStackFrame coroutineStackFrame) {
        this._lastObservedFrame = coroutineStackFrame != null ? new WeakReference<>(coroutineStackFrame) : null;
    }

    public String toString() {
        return "DebugCoroutineInfo(state=" + getState$kotlinx_coroutines_core() + ",context=" + getContext() + ')';
    }

    public final synchronized void updateState$kotlinx_coroutines_core(String str, Continuation<?> continuation, boolean z2) {
        if (Intrinsics.areEqual(this._state, DebugCoroutineInfoImplKt.RUNNING) && Intrinsics.areEqual(str, DebugCoroutineInfoImplKt.RUNNING) && z2) {
            this.unmatchedResume++;
        } else if (this.unmatchedResume > 0 && Intrinsics.areEqual(str, DebugCoroutineInfoImplKt.SUSPENDED)) {
            this.unmatchedResume--;
            return;
        }
        if (Intrinsics.areEqual(this._state, str) && Intrinsics.areEqual(str, DebugCoroutineInfoImplKt.SUSPENDED) && getLastObservedFrame$kotlinx_coroutines_core() != null) {
            return;
        }
        this._state = str;
        setLastObservedFrame$kotlinx_coroutines_core(continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null);
        this.lastObservedThread = Intrinsics.areEqual(str, DebugCoroutineInfoImplKt.RUNNING) ? Thread.currentThread() : null;
    }
}
