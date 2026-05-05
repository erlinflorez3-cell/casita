package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
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
/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005(4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{:$c$\u007fOCU }*\t]Wo˧vJp\u000bK\u000f\f\u0018~oBկ\u0006x\f\u0011G2[\n\u007f6ޜs=G`=J\u0013,J\"f\u00075\u0005(8`\u0010%\n\nžJܘ4@~J\u001bA[\u00112\u00124KP\u0005,m\u007fNdZ\u001de@/1\u0016\u0002Dd&\u000eB-S\u0013Fb;%v\u00103[F=5#;k\u00035i\"αAӭu=\u0013\u0001wT9L\fYLW.\u0016E1]\u000eut<[3S\u0017Pek&ұ֮Pˎ,\b\u0003}\u0013D\u0012\u0017\u001e)N2;\u001f\u0007\n\u00149\u0003y$L^\fvB.\u00068ت\u0019Ӿ\u000433ݍӾjl"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d.1W\u0004\u001d3zx8[R)z0-\u0015>", "", "u(E", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d.1W\u0004\u001d3zt*\\?\u0011", "1ta?X5MA\"zxd)x\u0016\u000ea\u000f$", "5dc\u0010h9KS\"\u000ehg(z\u000f,a\r\u0007wO|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn#by\u001e=j\u0012;,?Jg\n", "Adc\u0010h9KS\"\u000ehg(z\u000f,a\r\u0007wO|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0013>U{&4i#\rIR7Aw\u000f", "1ta?X5MA\"zxd)x\u0016\u000ea\u000f$:?\u0001\u001e\u0017Ik\u001d<", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", ";tc2k", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0015 \u0015\u0011W\u001eKv8\u000b", "Ag^DF5:Q\u001f{vk", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d.1W\u0004\u001d3z\u0003.[SBz\n", "DhbBT3L", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d.1W\u0004\u001d3z\u00072[S7rBs", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0013>U{&4i#\u001fQQKg;,jOgC\u0016j0W@%QYX<kV{=\"[8\u0018W:\u0011\u000ei=3rN@tK\u0013N}LdJ\u0013\u0012\u001774Z?[\u0010E\tj", ";db@T.>", "", "/bc6b5%O\u0016~\u0002", "Ehc570L[\u001d\r\t:*\f\r9n", "", "2ta.g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d.1W\u0004\u001d3zt>Z?Jo>'j", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok#4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W<4\t\u0003_> {#G,\u0004;M\fD>g\u0012 \u001d<ny\fT\u001aT\u0004%\u0005E2hT#=\u0004PPIk:`\u001bc'e\u0010}\u000b\u0019m*\u00172W*\u0013}\u001dzoWyev\u001d", "!mP0^):`wz\nZ\u0010\u0005\u00146", "!mP0^):`\n\u0003\tn(\u0004\u0017\u0013m\u000b/", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SnackbarHostState {
    public static final int $stable = 0;
    private final Mutex mutex = MutexKt.Mutex$default(false, 1, null);
    private final MutableState currentSnackbarData$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: androidx.compose.material3.SnackbarHostState$showSnackbar$2, reason: invalid class name */
    /* JADX INFO: compiled from: SnackbarHost.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKq\u000e\u0002\u0005\u000e\u0006\u0006\u0018n\u0017\u001c\u001e} \u000e\"\u0014", f = " :,-4*(8\r366n+3", i = {0, 0, 0, 1, 1, 1, 1}, l = {446, 449}, m = "B8@I&B69B::L", n = {"c^kY", "e_u[SbU", "\u0013jjOe\u001aYPJB29:E\u001e;dj&\f\u0018\u0018\u001c\u0017\u000b>\u0010x", "c^kY", "e_u[SbU", "\u0013jjOe\u001aYPJB29:E\u001e;dj&\f\u0018\u0018\u001c\u0017\u000b>\u0010x", "\u0013YqSbbG[?ITm@P"}, s = {"xQ^", "xQ_", "xQ`", "xQ^", "xQ_", "xQ`", "xQa"})
    static final class AnonymousClass2 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnackbarHostState.this.showSnackbar(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSnackbarData(SnackbarData snackbarData) {
        this.currentSnackbarData$delegate.setValue(snackbarData);
    }

    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData$delegate.getValue();
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, boolean z2, SnackbarDuration snackbarDuration, Continuation continuation, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            str2 = null;
        }
        if ((4 & i2) != 0) {
            z2 = false;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            snackbarDuration = str2 == null ? SnackbarDuration.Short : SnackbarDuration.Indefinite;
        }
        return snackbarHostState.showSnackbar(str, str2, z2, snackbarDuration, continuation);
    }

    public final Object showSnackbar(String str, String str2, boolean z2, SnackbarDuration snackbarDuration, Continuation<? super SnackbarResult> continuation) {
        return showSnackbar(new SnackbarVisualsImpl(str, str2, z2, snackbarDuration), continuation);
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00b3: INVOKE (r4 I:kotlinx.coroutines.sync.Mutex), (r5 I:java.lang.Object) INTERFACE call: kotlinx.coroutines.sync.Mutex.unlock(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:463), block:B:35:0x00b3 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object showSnackbar(androidx.compose.material3.SnackbarVisuals r10, kotlin.coroutines.Continuation<? super androidx.compose.material3.SnackbarResult> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.compose.material3.SnackbarHostState.AnonymousClass2
            if (r0 == 0) goto L35
            r6 = r11
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r6 = (androidx.compose.material3.SnackbarHostState.AnonymousClass2) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L35
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r1 = r6.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r2 = 2
            r7 = 1
            r5 = 0
            if (r0 == 0) goto L59
            if (r0 == r7) goto L49
            if (r0 != r2) goto L41
            java.lang.Object r0 = r6.L$3
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = (androidx.compose.material3.SnackbarHostState.AnonymousClass2) r0
            java.lang.Object r4 = r6.L$2
            kotlinx.coroutines.sync.Mutex r4 = (kotlinx.coroutines.sync.Mutex) r4
            java.lang.Object r0 = r6.L$1
            androidx.compose.material3.SnackbarVisuals r0 = (androidx.compose.material3.SnackbarVisuals) r0
            java.lang.Object r3 = r6.L$0
            androidx.compose.material3.SnackbarHostState r3 = (androidx.compose.material3.SnackbarHostState) r3
            goto L3b
        L35:
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r6 = new androidx.compose.material3.SnackbarHostState$showSnackbar$2
            r6.<init>(r11)
            goto L13
        L3b:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Throwable -> L3f
            goto La6
        L3f:
            r0 = move-exception
            goto Lae
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L49:
            java.lang.Object r4 = r6.L$2
            kotlinx.coroutines.sync.Mutex r4 = (kotlinx.coroutines.sync.Mutex) r4
            java.lang.Object r10 = r6.L$1
            androidx.compose.material3.SnackbarVisuals r10 = (androidx.compose.material3.SnackbarVisuals) r10
            java.lang.Object r3 = r6.L$0
            androidx.compose.material3.SnackbarHostState r3 = (androidx.compose.material3.SnackbarHostState) r3
            kotlin.ResultKt.throwOnFailure(r1)
            goto L6e
        L59:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.sync.Mutex r4 = r9.mutex
            r6.L$0 = r9
            r6.L$1 = r10
            r6.L$2 = r4
            r6.label = r7
            java.lang.Object r0 = r4.lock(r5, r6)
            if (r0 != r8) goto L6d
            return r8
        L6d:
            r3 = r9
        L6e:
            r6.L$0 = r3     // Catch: java.lang.Throwable -> Lad
            r6.L$1 = r10     // Catch: java.lang.Throwable -> Lad
            r6.L$2 = r4     // Catch: java.lang.Throwable -> Lad
            r6.L$3 = r6     // Catch: java.lang.Throwable -> Lad
            r6.label = r2     // Catch: java.lang.Throwable -> Lad
            r0 = r6
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0     // Catch: java.lang.Throwable -> Lad
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> Lad
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> Lad
            r2.<init>(r0, r7)     // Catch: java.lang.Throwable -> Lad
            r2.initCancellability()     // Catch: java.lang.Throwable -> Lad
            r1 = r2
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1     // Catch: java.lang.Throwable -> Lad
            androidx.compose.material3.SnackbarHostState$SnackbarDataImpl r0 = new androidx.compose.material3.SnackbarHostState$SnackbarDataImpl     // Catch: java.lang.Throwable -> Lad
            r0.<init>(r10, r1)     // Catch: java.lang.Throwable -> Lad
            androidx.compose.material3.SnackbarData r0 = (androidx.compose.material3.SnackbarData) r0     // Catch: java.lang.Throwable -> Lad
            access$setCurrentSnackbarData(r3, r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r1 = r2.getResult()     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> Lad
            if (r1 != r0) goto La3
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6     // Catch: java.lang.Throwable -> Lad
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)     // Catch: java.lang.Throwable -> Lad
        La3:
            if (r1 != r8) goto La6
            return r8
        La6:
            r3.setCurrentSnackbarData(r5)     // Catch: java.lang.Throwable -> Lb2
            r4.unlock(r5)
            return r1
        Lad:
            r0 = move-exception
        Lae:
            r3.setCurrentSnackbarData(r5)     // Catch: java.lang.Throwable -> Lb2
            throw r0     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r0 = move-exception
            r4.unlock(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostState.showSnackbar(androidx.compose.material3.SnackbarVisuals, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: compiled from: SnackbarHost.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4B\u0007\":\u001b\u007fјnjO0LeN6ZS8şsڔ<$i*yّAU0ԂR\t}M(\r~Nh\u000b[\u000f4\u0017\tp:Kmzs\u0011=3RsM6eok=pxD\n82P>ѩ\t\u0001(1\u0011!\u0005\n[K:\u0016`F~Jj\u000fc\u0004H#L̛ I$jyf6v\u007f$N\u007f7\u0011kZP=^^}$όHù+\u0013~ѭ6-F?C\u001eue\u0011\fj[m\t\u0016ѓ?ݾl-/Ǣau]@f\u000bd'9O%]!'3ӻSԃ\u0010-3Ւ{MV\u001a6\u0001K\u000e\u001b?\u001c\u000e4+\u001fͪ/բj\u000e\u0016ޗ\rtYM^\u0010\u07b2F\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d.1W\u0004\u001d3zx8[R)z0-\u0015'OB\u0003a2Kr48P\\<XY\u0001!\u001c\u001dac", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d.1W\u0004\u001d3z\u00072[S7rBs", ";db@T.>", "", "/bc6b5%O\u0016~\u0002", "Ehc570L[\u001d\r\t:*\f\r9n", "", "2ta.g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d.1W\u0004\u001d3zt>Z?Jo>'j", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok#4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W<4\t\u0003_> {#G,\u0004;M\fD>D|", "5dc\u000eV;B]\"ev[,\u0004", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0011h9:b\u001d\t\u0004", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn#by\u001e=j\u0012;,SHgC\"\u001fq7", "5dc\u001aX:LO\u001b~", "5dc$\\;A2\u001d\r\u0003b:\u000bd-t\u00042\u0005", "u(I", "3pd._:", "=sW2e", "", "6`b566=S", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class SnackbarVisualsImpl implements SnackbarVisuals {
        private final String actionLabel;
        private final SnackbarDuration duration;
        private final String message;
        private final boolean withDismissAction;

        public SnackbarVisualsImpl(String str, String str2, boolean z2, SnackbarDuration snackbarDuration) {
            this.message = str;
            this.actionLabel = str2;
            this.withDismissAction = z2;
            this.duration = snackbarDuration;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SnackbarVisualsImpl snackbarVisualsImpl = (SnackbarVisualsImpl) obj;
            return Intrinsics.areEqual(getMessage(), snackbarVisualsImpl.getMessage()) && Intrinsics.areEqual(getActionLabel(), snackbarVisualsImpl.getActionLabel()) && getWithDismissAction() == snackbarVisualsImpl.getWithDismissAction() && getDuration() == snackbarVisualsImpl.getDuration();
        }

        public int hashCode() {
            int iHashCode = getMessage().hashCode() * 31;
            String actionLabel = getActionLabel();
            return ((((iHashCode + (actionLabel != null ? actionLabel.hashCode() : 0)) * 31) + Boolean.hashCode(getWithDismissAction())) * 31) + getDuration().hashCode();
        }
    }

    /* JADX INFO: compiled from: SnackbarHost.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012\u000e\u0007nj?2LeV.Zݷ2\u000fy\u0005<řc$\u007fّC٥\"}0\u000fWNmgtJpŏs\u000f4\u00159\u0004<Mcxu\u0012=3RyM5euM;ptd\tN5ŕ<y\u0013\u0006b0V\u0018\u000fzqTR&xQ~Dj\r{\u0010J\u0018\u0014J8\u00034[\u0016[|Զl&@=1\u001bip]msx\u0003[\u001d^TU\u0016=un=N9M\u001b5U\u0013\u0007\u0001_m\u0006\u0016п?ݾl'/Ǣ\u001a\u0006e6p\u007fB\u0016\u0002̔\u000fǁv,dӤib\u0012-9VӓOa"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d.1W\u0004\u001d3zx8[R)z0-\u0015'OB\u0003a2Kr4&H](@Z}Di", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d.1W\u0004\u001d3zt*\\?\u0011", "DhbBT3L", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d.1W\u0004\u001d3z\u00072[S7rBs", "1n]A\\5NO(\u0003\u0005g", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d.1W\u0004\u001d3z\u0003.[SBz\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0013>U{&4i#\u001fQQKg;,jOgC\u0016j0W\npEV[6lavF\u0014 $kJ4\u000b\u0005`H kK7|\u00125X\u0006Dx|\u001b\u001a\u0018>@43", "5dc#\\:NO \r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn#by\u001e=j\u0012;>GI{0%#>", "2hb:\\:L", "", "3pd._:", "", "=sW2e", "", "6`b566=S", "", ">da3b9F/\u0017\u000e~h5", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class SnackbarDataImpl implements SnackbarData {
        private final CancellableContinuation<SnackbarResult> continuation;
        private final SnackbarVisuals visuals;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarDataImpl(SnackbarVisuals snackbarVisuals, CancellableContinuation<? super SnackbarResult> cancellableContinuation) {
            this.visuals = snackbarVisuals;
            this.continuation = cancellableContinuation;
        }

        @Override // androidx.compose.material3.SnackbarData
        public SnackbarVisuals getVisuals() {
            return this.visuals;
        }

        @Override // androidx.compose.material3.SnackbarData
        public void performAction() {
            if (this.continuation.isActive()) {
                CancellableContinuation<SnackbarResult> cancellableContinuation = this.continuation;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m8980constructorimpl(SnackbarResult.ActionPerformed));
            }
        }

        @Override // androidx.compose.material3.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                CancellableContinuation<SnackbarResult> cancellableContinuation = this.continuation;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m8980constructorimpl(SnackbarResult.Dismissed));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SnackbarDataImpl snackbarDataImpl = (SnackbarDataImpl) obj;
            return Intrinsics.areEqual(getVisuals(), snackbarDataImpl.getVisuals()) && Intrinsics.areEqual(this.continuation, snackbarDataImpl.continuation);
        }

        public int hashCode() {
            return (getVisuals().hashCode() * 31) + this.continuation.hashCode();
        }
    }
}
