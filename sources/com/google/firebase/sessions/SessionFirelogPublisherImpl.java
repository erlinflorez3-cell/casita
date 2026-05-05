package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a$yCIU\"Ԃ*\teNogtJb\u000bY\u000f\u000eǝ\u0001j:R]xc\u0014\u0015˰Xģ]I}ok8\u0019sLEKB&Fy\u001d\u0001H+X\u0014\u0005|[K:\u0015@D~>j\r{\n*\u0016\u0014D8\u0001LcwRDP\u0005]h8ݭ\u0007iPXom>\be\rt`W\u0011\u0005n6+nE{\u0015ma\u0011\u0016j[m\u000fouK\u0015\u0001'U<\u0010\b <f\u0012,\u0015YbS];5j\u0019i`::qՕ\"ؘOʫ߭{z\n\"\r\u0010\u001c\u000e?H\\6pǔ\nԧ7tzԟ\u0011\\\u0010dZ\u007f)h\rА'ő7+Aӕ7]o;1Ne|[ٿ ţ\u0005n)ż%\u001an\u00173T&T\b҈BףLN\u0012ԯ\u000ey\u0012tz\u0002X\t\u0007ϝ\u0002\u009e\u007f\u00116Ϗ©7]A#'\u0003ɞL["}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u000fQP;r> \u007fx^@\u000bq/N\u0004\u000bOWU\u0002", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u000fQP;r> \u007fx^@\u000bq/N\u0004|", "4ha2U(LSt\n\u0006", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\na\u001b$Gl\nJv\u0001@dS", "4ha2U(LS|\b\tm(\u0004\u0010+t\u00042\u0005N", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u0005 %Vk\u0015Cr49c\u0007.\u0001N\u001a;M@7y4\u0002\u001evp5\u000ej(]z1PZ*7`(", "Adb@\\6GA\u0019\u000e\nb5~\u0017", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u00171;yB\"\u001fqo'\u0007r;R\u007f)U\"", "3uT;g\u000e\u001dB\u007f\t|`,\n", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n\u0015j})FOt\u001d4M=m4+xqp9\u0014d(Lv|", "0`R8Z9Hc\"}Yb:\b\u0005>c\u0003(\t", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@Jw\u001bTo\u000b8\u0005%\u0011d\tu\u001ek 6\u0017EEu6%\u00152b=\u0014c)J\u0005'\u0011PW:kNyD\u0010!^\u0018W9Ve]N$k@E\u001fk5W\u00117o\b\b%\u0012?s~\u001ea\u0014\u001d`\u0013\u007fIrjPca\u0001G\u000bFf7d\t[+\\\u0004H$\"\u007f\u001d%q^w\u0018{b v[{u15\u0019\tF(Hvi4E~d@})-!bu\u001c:\"v5~/\u000b4s7h\u0012Kd\u0014L^B#,jO+0?J\\\u001f\\c~{ lW\u0006k\n\u0010bB\u0015\"tepI\u000b\u0005]lB;kn\b;[O<S|\u001f7U\u0003K[\b^f\u00111wuXG$T^$yS\"r XFW", "/sc2`7M:#\u0001|b5~v/s\u000e,\u0006I`(\u0017P~", "", "Adb@\\6G3*~\u0004m", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u000e^CDz\n", ":nV X:LW#\b", "Adb@\\6G2\u0019\u000evb3\u000b", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\rMR7o;,j", "Ag^B_+\u001c] \u0006z\\;\\\u001a/n\u000f6", "", "Ag^B_+%]\u001blzl:\u0001\u00138", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "\u0011n\\=T5B]\"", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {
    private static final String TAG = "SessionFirelogPublisher";
    private final CoroutineContext backgroundDispatcher;
    private final EventGDTLoggerInterface eventGDTLogger;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final SessionsSettings sessionSettings;
    public static final Companion Companion = new Companion(null);
    private static final double randomValueForSampling = Math.random();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u0016\u007fјlʒ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$BOIV2}P\u000b&ȡ:̊rJbŏ\u0014\u001b\u0014\u0019\u0011jZM,ޏ_ܫ\u00132JģЩ7R"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u000fQP;r> \u007fx^@\u000bq/N\u0004\u000bOWUj:\\zH\u0010\u001b^\u0018W\u0001", "", "u(E", "\"@6", "", "@`]1b4/O \u000fz?6\nv+m\u000b/\u007fI\u0003", "", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SessionDetails $sessionDetails;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SessionDetails sessionDetails, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sessionDetails = sessionDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SessionFirelogPublisherImpl.this.new AnonymousClass1(this.$sessionDetails, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00a2 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                r10 = r14
                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r13.label
                r3 = 3
                r5 = 2
                r2 = 1
                if (r0 == 0) goto L41
                if (r0 == r2) goto L52
                if (r0 == r5) goto L71
                if (r0 != r3) goto La4
                java.lang.Object r9 = r13.L$5
                com.google.firebase.sessions.settings.SessionsSettings r9 = (com.google.firebase.sessions.settings.SessionsSettings) r9
                java.lang.Object r8 = r13.L$4
                com.google.firebase.sessions.SessionDetails r8 = (com.google.firebase.sessions.SessionDetails) r8
                java.lang.Object r7 = r13.L$3
                com.google.firebase.FirebaseApp r7 = (com.google.firebase.FirebaseApp) r7
                java.lang.Object r6 = r13.L$2
                com.google.firebase.sessions.SessionEvents r6 = (com.google.firebase.sessions.SessionEvents) r6
                java.lang.Object r2 = r13.L$1
                com.google.firebase.sessions.SessionFirelogPublisherImpl r2 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) r2
                java.lang.Object r5 = r13.L$0
                com.google.firebase.sessions.InstallationId r5 = (com.google.firebase.sessions.InstallationId) r5
                kotlin.ResultKt.throwOnFailure(r10)
            L2d:
                java.util.Map r10 = (java.util.Map) r10
                java.lang.String r11 = r5.getFid()
                java.lang.String r12 = r5.getAuthToken()
                com.google.firebase.sessions.SessionEvent r0 = r6.buildSession(r7, r8, r9, r10, r11, r12)
                com.google.firebase.sessions.SessionFirelogPublisherImpl.access$attemptLoggingSessionEvent(r2, r0)
            L3e:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L41:
                kotlin.ResultKt.throwOnFailure(r10)
                com.google.firebase.sessions.SessionFirelogPublisherImpl r1 = com.google.firebase.sessions.SessionFirelogPublisherImpl.this
                r0 = r13
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r13.label = r2
                java.lang.Object r10 = com.google.firebase.sessions.SessionFirelogPublisherImpl.access$shouldLogSession(r1, r0)
                if (r10 != r4) goto L55
                return r4
            L52:
                kotlin.ResultKt.throwOnFailure(r10)
            L55:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r0 = r10.booleanValue()
                if (r0 == 0) goto L3e
                com.google.firebase.sessions.InstallationId$Companion r2 = com.google.firebase.sessions.InstallationId.Companion
                com.google.firebase.sessions.SessionFirelogPublisherImpl r0 = com.google.firebase.sessions.SessionFirelogPublisherImpl.this
                com.google.firebase.installations.FirebaseInstallationsApi r1 = com.google.firebase.sessions.SessionFirelogPublisherImpl.access$getFirebaseInstallations$p(r0)
                r0 = r13
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r13.label = r5
                java.lang.Object r10 = r2.create(r1, r0)
                if (r10 != r4) goto L74
                return r4
            L71:
                kotlin.ResultKt.throwOnFailure(r10)
            L74:
                r5 = r10
                com.google.firebase.sessions.InstallationId r5 = (com.google.firebase.sessions.InstallationId) r5
                com.google.firebase.sessions.SessionFirelogPublisherImpl r2 = com.google.firebase.sessions.SessionFirelogPublisherImpl.this
                com.google.firebase.sessions.SessionEvents r6 = com.google.firebase.sessions.SessionEvents.INSTANCE
                com.google.firebase.sessions.SessionFirelogPublisherImpl r0 = com.google.firebase.sessions.SessionFirelogPublisherImpl.this
                com.google.firebase.FirebaseApp r7 = com.google.firebase.sessions.SessionFirelogPublisherImpl.access$getFirebaseApp$p(r0)
                com.google.firebase.sessions.SessionDetails r8 = r13.$sessionDetails
                com.google.firebase.sessions.SessionFirelogPublisherImpl r0 = com.google.firebase.sessions.SessionFirelogPublisherImpl.this
                com.google.firebase.sessions.settings.SessionsSettings r9 = com.google.firebase.sessions.SessionFirelogPublisherImpl.access$getSessionSettings$p(r0)
                com.google.firebase.sessions.api.FirebaseSessionsDependencies r1 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
                r0 = r13
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r13.L$0 = r5
                r13.L$1 = r2
                r13.L$2 = r6
                r13.L$3 = r7
                r13.L$4 = r8
                r13.L$5 = r9
                r13.label = r3
                java.lang.Object r10 = r1.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r0)
                if (r10 != r4) goto La3
                return r4
            La3:
                goto L2d
            La4:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C11551 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11551(Continuation<? super C11551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return SessionFirelogPublisherImpl.this.shouldLogSession(this);
        }
    }

    public SessionFirelogPublisherImpl(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallations, SessionsSettings sessionSettings, EventGDTLoggerInterface eventGDTLogger, CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(sessionSettings, "sessionSettings");
        Intrinsics.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallations;
        this.sessionSettings = sessionSettings;
        this.eventGDTLogger = eventGDTLogger;
        this.backgroundDispatcher = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attemptLoggingSessionEvent(SessionEvent sessionEvent) {
        try {
            this.eventGDTLogger.log(sessionEvent);
            String str = "Successfully logged Session Start event: " + sessionEvent.getSessionData().getSessionId();
        } catch (RuntimeException e2) {
        }
    }

    private final boolean shouldCollectEvents() {
        return randomValueForSampling <= this.sessionSettings.getSamplingRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object shouldLogSession(kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.firebase.sessions.SessionFirelogPublisherImpl.C11551
            if (r0 == 0) goto L4d
            r5 = r7
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r5 = (com.google.firebase.sessions.SessionFirelogPublisherImpl.C11551) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L4d
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r4 = r5.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            java.lang.String r0 = "SessionFirelogPublisher"
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 != r3) goto L65
            java.lang.Object r2 = r5.L$0
            com.google.firebase.sessions.SessionFirelogPublisherImpl r2 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) r2
            kotlin.ResultKt.throwOnFailure(r4)
        L29:
            com.google.firebase.sessions.settings.SessionsSettings r0 = r2.sessionSettings
            boolean r0 = r0.getSessionsEnabled()
            r1 = 0
            if (r0 != 0) goto L53
            java.lang.String r0 = "Sessions SDK disabled. Events will not be sent."
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            return r0
        L39:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.String r0 = "Data Collection is enabled for at least one Subscriber"
            com.google.firebase.sessions.settings.SessionsSettings r0 = r6.sessionSettings
            r5.L$0 = r6
            r5.label = r3
            java.lang.Object r0 = r0.updateSettings(r5)
            if (r0 != r2) goto L4b
            return r2
        L4b:
            r2 = r6
            goto L29
        L4d:
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r5 = new com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            r5.<init>(r7)
            goto L13
        L53:
            boolean r0 = r2.shouldCollectEvents()
            if (r0 != 0) goto L60
            java.lang.String r0 = "Sessions SDK has dropped this session due to sampling."
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            return r0
        L60:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r0
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.shouldLogSession(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    public void logSession(SessionDetails sessionDetails) {
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new AnonymousClass1(sessionDetails, null), 3, null);
    }
}
