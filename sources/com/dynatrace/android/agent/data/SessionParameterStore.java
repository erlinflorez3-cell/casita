package com.dynatrace.android.agent.data;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import com.dynatrace.android.agent.util.Utility;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?1Le^.ZS0\u000fs{B*c$wCCU(\u0005*\tUNog\u0005JbŏK\u000f\u001c\u0016\u0001j2I]xk\u0012\u00172HyE\u074ccڎ[Z\u0011td\u0004X1Cx\u0015\u0015\u000b(*`\u0016\u0007|SK:\u0014^A\u0001>`\u0010e\u0005H\u0016ĂB\"\u0007#jm\u000fEN\u0001m>=*\u001bipVϮc2\u0003R\u001bO\u001d+\u001b\fy\u001eYV\u007f;#<k\u00035h\"?KS\u007fU\u001dhU=[M\u0002pNX.\u001fE/]'urTjMUn'?+}n\u0014T\u001cD\u0010z*\u001b\u0005\b\u001c#?H\\Cbq\u0016,Kt!i\u0007АؿbB\u0006\u001a*@%E\u00183YDCf\u007fl\u0002\u0019\u001fI\n\u0005%$3\u0003~!\nV<akÔVɐU1Y̵\u000eT\\\rq=\u001c\bGê\u0004ò\b0Oĉ\u007f\f\u001f8/'MZg.wȀ\u000eҩHi~\u0005nt$y`UX$\u0005\u0015e8_ȴfֈh\u0007sPbg|\u001f[,l\t\u0014\u0007A13ɿHƼ)\u0010Vи9ux_u\nSB=ƀ[ˇo\u000e_ު/ACe{\u0012wQ%%\u0016ֽnۖ\\fJͭ۷^~"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@$1hyi%m$<QMDV0+\u0011paH\u0007p\u001a]\u00014G\"", "", "2`c.F;H`\u0019", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\u0013Dc\u000b \r", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaG\\", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\nh]6g\u0005", "uKP;W9HW\u0018\u0012D](\f\u0005=t\n5{\n~!$G9l8\u0006!#h\b-7C|4WRBo=1^fkF\u0011s;R\u007f'U\u0016,6i\\\u0003L\u0018\u001bZ{L5\u0018\u0005/\u0005\u0015", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "Adb@\\6G7\u0018", "", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "Dhb6g6K7\u0018", "", "\u001aiPCTuEO\"\u0001DE6\u0006\u000b\u0005", ">qT9b(=8#{", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", ">qT9b(=7\"i\bh.\n\t=s", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "EqXAX\u0011HP", ">qT9b(=", "", "3mbBe,)`\u0019\u0006\u0005Z+Z\u00137p\u0007(\u000b@", "CoS.g,", "<df X:LW#\b^]", "<df#\\:Bb#\f^]", "5dc X:LW#\b^]", "5dc#\\:Bb#\f^]", "4kd@[", "@db2g", "@db2gj:U\u0019\b\nX*\u0007\u0016/_\r(\u0003@|%\u0017", "A`]6g0SS\u0007~\tl0\u0007\u0012\u0013d", "\u0011n\\=T5B]\"", "/fT;gt<]&~tk,\u0004\t+s\u007f"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class SessionParameterStore {
    public static final Companion Companion = new Companion(null);
    private static final Preferences.Key<Integer> KEY_SESSION_ID = PreferencesKeys.intKey("session_id");
    private static final Preferences.Key<Long> KEY_VISITOR_ID = PreferencesKeys.longKey("visitor_id");
    private final DataStore<Preferences> dataStore;
    private final AtomicBoolean preloadInProgress;
    private Job preloadJob;
    private final CoroutineScope scope;
    private volatile Integer sessionId;
    private volatile Long visitorId;
    private Job writeJob;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\r(4ߚ\u007f\u0007tqAӄJͣIDɟ\u0004*=j<;*[ҸuEAU(~r\u001b]P\u007fm~Lj\u000bq\u00134\u0019O̖.֒Yxe܈_DPtW9]qM9\u000fzd\bv݈$أ}\u0005\tɝݻL\u0017"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@$1hyi%m$<QMDV0+\u0011paH\u0007p\u001a]\u00014G\u000b,6d]nF\u0018\u001ccc", "", "\nh]6g\u0005", "u(E", "\u0019DH,F\f,A|hcX\u0010[", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGEI,bL", "", "\u0019DH,I\u0010,7\bhgX\u0010[", "", "/fT;gt<]&~tk,\u0004\t+s\u007f"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.android.agent.data.SessionParameterStore$ensurePreloadComplete$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\bF\n\\A'\"Z\u0012>\u000f"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SessionParameterStore.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Job job = SessionParameterStore.this.preloadJob;
                if (job == null) {
                    return null;
                }
                this.label = 1;
                if (job.join(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.dynatrace.android.agent.data.SessionParameterStore$preload$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C11431(Continuation<? super C11431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SessionParameterStore.this.new C11431(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = FlowKt.first(FlowKt.m10520catch(SessionParameterStore.this.dataStore.getData(), new SessionParameterStore$preload$1$sessionParameters$1(null)), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Preferences preferences = (Preferences) obj;
            SessionParameterStore sessionParameterStore = SessionParameterStore.this;
            Integer num = (Integer) preferences.get(SessionParameterStore.KEY_SESSION_ID);
            sessionParameterStore.sessionId = Boxing.boxInt(num != null ? SessionParameterStore.this.sanitizeSessionId(num.intValue()) : 0);
            SessionParameterStore sessionParameterStore2 = SessionParameterStore.this;
            Long lBoxLong = (Long) preferences.get(SessionParameterStore.KEY_VISITOR_ID);
            if (lBoxLong == null) {
                lBoxLong = Boxing.boxLong(0L);
            }
            sessionParameterStore2.visitorId = lBoxLong;
            Utility.devLog(SessionParameterStoreKt.TAG_SESSION_PARAMETER, "preloading completed: sessionId: " + SessionParameterStore.this.sessionId + ", visitorId: " + SessionParameterStore.this.visitorId);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.android.agent.data.SessionParameterStore$update$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $newVisitorId;
        final /* synthetic */ int $sanitizedSessionId;
        int label;

        /* JADX INFO: renamed from: com.dynatrace.android.agent.data.SessionParameterStore$update$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A/&:\u0012\u0010\u0007\u0015k\u007f8"}, d2 = {"\n`]<a@F])\rS", "", "Adb@\\6G>\u0015\fvf,\f\t<s", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0016]R7h;\u001e\u007fua:\u0007p,Wt'U\""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
        static final class C01521 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
            final /* synthetic */ long $newVisitorId;
            final /* synthetic */ int $sanitizedSessionId;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01521(int i2, long j2, Continuation<? super C01521> continuation) {
                super(2, continuation);
                this.$sanitizedSessionId = i2;
                this.$newVisitorId = j2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01521 c01521 = new C01521(this.$sanitizedSessionId, this.$newVisitorId, continuation);
                c01521.L$0 = obj;
                return c01521;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
                return ((C01521) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                mutablePreferences.set(SessionParameterStore.KEY_SESSION_ID, Boxing.boxInt(this.$sanitizedSessionId));
                mutablePreferences.set(SessionParameterStore.KEY_VISITOR_ID, Boxing.boxLong(this.$newVisitorId));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11441(int i2, long j2, Continuation<? super C11441> continuation) {
            super(2, continuation);
            this.$sanitizedSessionId = i2;
            this.$newVisitorId = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SessionParameterStore.this.new C11441(this.$sanitizedSessionId, this.$newVisitorId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (PreferencesKt.edit(SessionParameterStore.this.dataStore, new C01521(this.$sanitizedSessionId, this.$newVisitorId, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (IOException e2) {
                Utility.devLog(SessionParameterStoreKt.TAG_SESSION_PARAMETER, "failed to write to data store", e2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionParameterStore(Context context) {
        this(SessionParameterStoreKt.getDataStore(context), CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault())));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public SessionParameterStore(DataStore<Preferences> dataStore, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.dataStore = dataStore;
        this.scope = scope;
        this.preloadInProgress = new AtomicBoolean(false);
    }

    private final void ensurePreloadComplete() throws InterruptedException {
        preload();
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int sanitizeSessionId(int i2) {
        if (i2 < Integer.MAX_VALUE && i2 >= 0) {
            return i2;
        }
        Utility.devLog(SessionParameterStoreKt.TAG_SESSION_PARAMETER, "session id is out of range and will be reset to 0");
        return 0;
    }

    public final void flush() throws InterruptedException {
        Job job = this.writeJob;
        if (job == null || !job.isActive()) {
            return;
        }
        Utility.devLog(SessionParameterStoreKt.TAG_SESSION_PARAMETER, "need to wait for updates to be written to data store");
        BuildersKt__BuildersKt.runBlocking$default(null, new SessionParameterStore$flush$1$1(job, null), 1, null);
    }

    public final int getSessionId() throws InterruptedException {
        Integer num = this.sessionId;
        if (num != null) {
            return num.intValue();
        }
        ensurePreloadComplete();
        Integer num2 = this.sessionId;
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    public final long getVisitorId() throws InterruptedException {
        Long l2 = this.visitorId;
        if (l2 != null) {
            return l2.longValue();
        }
        ensurePreloadComplete();
        Long l3 = this.visitorId;
        if (l3 != null) {
            return l3.longValue();
        }
        return 0L;
    }

    public final void preload() {
        if (this.preloadInProgress.compareAndSet(false, true)) {
            this.preloadJob = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C11431(null), 3, null);
        }
    }

    public final void reset$agent_core_release() throws InterruptedException {
        BuildersKt__BuildersKt.runBlocking$default(null, new SessionParameterStore$reset$1(this, null), 1, null);
    }

    public final synchronized void update(int i2, long j2) {
        int iSanitizeSessionId = sanitizeSessionId(i2);
        this.sessionId = Integer.valueOf(iSanitizeSessionId);
        this.visitorId = Long.valueOf(j2);
        Job job = this.writeJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.writeJob = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C11441(iSanitizeSessionId, j2, null), 3, null);
    }
}
