package com.google.firebase.sessions.api;

import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":5\u007f\u0007|jAӄLe^.ZS81sڔ<$i$yCAV\"}8\tWNmotсZ!¼?\u0006Dw#+`\u0016}c\u0012Ƥ6B}?{[}FQ`#@5$@-Py3\u0006`/\u0011\u001e\u0005\u0007[K:\u0019`D~Ej\r{\n`\u0012N[.\u000e6hwPFH\u001bbJ13\u0003\u0018P|/&ܟ;ת\fϿù+\u000f|p,;\tJC&=S1\u0015\u0003_M\u000eWqk\n/&ݳ/Iyi~f\u000e'-+}\u0017\u000ev4p\u001dQ\u000f\u001am0\u0018nYe&(&\u0005B\fʀ\b\u000e\f=\u0019:;\u001b~\b<5KɄ&ĖT\u0002fۍPGo9/e\u0010=;A9lycQ\u0018|<*\n\u001d(3\t\r'\u0004V$_C\"\u0003~o7y^MR^\u0012wC\u0016\u0006\u0007a0/25W\n?\u0004/4?'MZg*Or\u0018Gro%\t7èUׂVHH̎Å\u001692\t\u0012q֎h\u001d"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n1d\u0002i\u0018q#.J?Ik\"\u001e#veC\u0010q\u000bN\u0002'PKN5ZVrKi", "", "u(E", "\"@6", "", "2d_2a+>\\\u0017\u0003zl", "", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n1d\u0002i%m$<QMDYD\u001b#fn=\u0004c9\r_#OL$", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n1d\u0002i\u0018q#.J?Ik\"\u001e#veC\u0010q\u000bN\u0002'PKN5ZVrKRpZ\u0019N4\f\u0005b?8D", "", "/cS\u0011X7>\\\u0018~\u0004\\@", "", "AtQ@V9BP\u0019\fcZ4|", "5dc\u0011X7>\\\u0018~\u0004\\@", "5dc\u001fX.Ba(~\b^+j\u0019,s}5\u007f=\u0001$%", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n1d\u0002i%m$<QMDYD\u001b#fn=\u0004c9$", "5dc\u001fX.Ba(~\b^+j\u0019,s}5\u007f=\u0001$%\u0006m\u0018Dp'?c\u007f'7g\u00172ZC8gB\u001e\u000fieF\u0007`(\\v!UL\\:`\\{K", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "5dc h)LQ&\u0003w^9", "5dc h)LQ&\u0003w^9;\u00079my*\u0006J\u0003\u001e\u0017Ap\u0012Iv\"1g}\u001a8q#.J?Ik.,\u0015vo=\u0011l:", "@dV6f;>`", "AtQ@V9BP\u0019\f", "@db2g", "@db2gj<]!x|h6~\u0010/_\u0001,\t@}\u0013%Gi\u000f@\u0004%2U\f 1{\u0016<[GEtB", "\u0012d_2a+>\\\u0017\u0013", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FirebaseSessionsDependencies {
    private static final String TAG = "SessionsDependencies";
    public static final FirebaseSessionsDependencies INSTANCE = new FirebaseSessionsDependencies();
    private static final Map<SessionSubscriber.Name, Dependency> dependencies = Collections.synchronizedMap(new LinkedHashMap());

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0010njG9LeN.ZS8\u0015sڔ<$i0yّA٨ \u0014̝9O|f(\u0006Z^\u0019C'\u0006Dyz4OU\u0007_*\u0011HA\u001eBݯQoK=){D\u001082P9@ە\u0002b3V\u001c\u000f|YJ:\u0015vВq\u0003o\u001bZ\u001d\u001a@ßn&\u0007\u001ejgf6vm\u000eB5#\u0011kZP=^^\u007f\u0014ϼE\u001d8\u001b\u0005y\u001eYOg;#5k\u0005\u001dQ\n>Iԡr\u0006\fv8?+w\u0006\u001e\u0383WH\u001b#>g\r\f\u0007lٯ\u0004\"o\u001a'CO\u0012Lח\u0012.\u007f\u07be\u0014\u000fB\t\u001c\fwb</2h\u001e\rawIԦLг\u0006jJȕ\u0013c<\u001e3\bS-?$t[Ŏ?."}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n1d\u0002i\u0018q#.J?Ik\"\u001e#veC\u0010q\u000bN\u0002'PKN5ZVrKRpZ\u0019N4\f\u0005b?8D", "", ";tc2k", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0015 \u0015\u0011W\u001eKv8\u000b", "AtQ@V9BP\u0019\f", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n1d\u0002i%m$<QMDYD\u001b#fn=\u0004c9$", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u000f+ E9uL\u0006%H/d\u001eAu_0WM=r4g\u0016ln9\u0004_:N@5GZ\\0f[\u0001\u0007\u0010\u001d^W<+\u001b\u0013]K-\\T4-\u00069M~;uVO\u0007", "5dc\u001ah;>f", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ%+PmW$\u000745lS", "5dc h)LQ&\u0003w^9", "u(;0b4\bU#\t|e,F\n3r\u007f%wN\u0001`%G}\u001c@\u0001.C#y+;7\u0004.[Q?u=\f%eo7\u0014g)N\u0004|", "Adc h)LQ&\u0003w^9", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@J%\u0017U}\u0012F\u007f3~U\t$\u0001[\u0016<[GEt\".\u0012v_F\u000b`,[Lj8", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Dependency {
        private final Mutex mutex;
        private SessionSubscriber subscriber;

        public Dependency(Mutex mutex, SessionSubscriber sessionSubscriber) {
            Intrinsics.checkNotNullParameter(mutex, "mutex");
            this.mutex = mutex;
            this.subscriber = sessionSubscriber;
        }

        public /* synthetic */ Dependency(Mutex mutex, SessionSubscriber sessionSubscriber, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(mutex, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : sessionSubscriber);
        }

        public static /* synthetic */ Dependency copy$default(Dependency dependency, Mutex mutex, SessionSubscriber sessionSubscriber, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                mutex = dependency.mutex;
            }
            if ((i2 & 2) != 0) {
                sessionSubscriber = dependency.subscriber;
            }
            return dependency.copy(mutex, sessionSubscriber);
        }

        public final Mutex component1() {
            return this.mutex;
        }

        public final SessionSubscriber component2() {
            return this.subscriber;
        }

        public final Dependency copy(Mutex mutex, SessionSubscriber sessionSubscriber) {
            Intrinsics.checkNotNullParameter(mutex, "mutex");
            return new Dependency(mutex, sessionSubscriber);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dependency)) {
                return false;
            }
            Dependency dependency = (Dependency) obj;
            return Intrinsics.areEqual(this.mutex, dependency.mutex) && Intrinsics.areEqual(this.subscriber, dependency.subscriber);
        }

        public final Mutex getMutex() {
            return this.mutex;
        }

        public final SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        public int hashCode() {
            int iHashCode = this.mutex.hashCode() * 31;
            SessionSubscriber sessionSubscriber = this.subscriber;
            return iHashCode + (sessionSubscriber == null ? 0 : sessionSubscriber.hashCode());
        }

        public final void setSubscriber(SessionSubscriber sessionSubscriber) {
            this.subscriber = sessionSubscriber;
        }

        public String toString() {
            return "Dependency(mutex=" + this.mutex + ", subscriber=" + this.subscriber + ')';
        }
    }

    private FirebaseSessionsDependencies() {
    }

    @JvmStatic
    public static final void addDependency(SessionSubscriber.Name subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        if (subscriberName == SessionSubscriber.Name.PERFORMANCE) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map<SessionSubscriber.Name, Dependency> dependencies2 = dependencies;
        if (dependencies2.containsKey(subscriberName)) {
            String str = "Dependency " + subscriberName + " already added.";
            return;
        }
        Intrinsics.checkNotNullExpressionValue(dependencies2, "dependencies");
        dependencies2.put(subscriberName, new Dependency(MutexKt.Mutex(true), null, 2, 0 == true ? 1 : 0));
        String str2 = "Dependency to " + subscriberName + " added.";
    }

    private final Dependency getDependency(SessionSubscriber.Name name) {
        Map<SessionSubscriber.Name, Dependency> dependencies2 = dependencies;
        Intrinsics.checkNotNullExpressionValue(dependencies2, "dependencies");
        Dependency dependency = dependencies2.get(name);
        if (dependency == null) {
            throw new IllegalStateException("Cannot get dependency " + name + ". Dependencies should be added at class load time.");
        }
        Intrinsics.checkNotNullExpressionValue(dependency, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
        return dependency;
    }

    @JvmStatic
    public static final void register(SessionSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        SessionSubscriber.Name sessionSubscriberName = subscriber.getSessionSubscriberName();
        Dependency dependency = INSTANCE.getDependency(sessionSubscriberName);
        if (dependency.getSubscriber() != null) {
            String str = "Subscriber " + sessionSubscriberName + " already registered.";
            return;
        }
        dependency.setSubscriber(subscriber);
        String str2 = "Subscriber " + sessionSubscriberName + " registered.";
        Mutex.DefaultImpls.unlock$default(dependency.getMutex(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a7 -> B:27:0x00a8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(kotlin.coroutines.Continuation<? super java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, ? extends com.google.firebase.sessions.api.SessionSubscriber>> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            if (r0 == 0) goto L41
            r5 = r13
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r5 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1) r5
            int r0 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L41
            int r0 = r5.label
            int r0 = r0 - r2
            r5.label = r0
        L19:
            java.lang.Object r11 = r5.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L4f
            if (r0 != r3) goto L47
            java.lang.Object r10 = r5.L$5
            java.lang.Object r2 = r5.L$4
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r9 = r5.L$3
            kotlinx.coroutines.sync.Mutex r9 = (kotlinx.coroutines.sync.Mutex) r9
            java.lang.Object r1 = r5.L$2
            com.google.firebase.sessions.api.SessionSubscriber$Name r1 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r1
            java.lang.Object r8 = r5.L$1
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r7 = r5.L$0
            java.util.Map r7 = (java.util.Map) r7
            kotlin.ResultKt.throwOnFailure(r11)
            goto La8
        L41:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r5 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            r5.<init>(r12, r13)
            goto L19
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L4f:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency> r1 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.dependencies
            java.lang.String r0 = "dependencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r0 = r1.size()
            int r0 = kotlin.collections.MapsKt.mapCapacity(r0)
            r2.<init>(r0)
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r0 = r1.entrySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r8 = r0.iterator()
        L72:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lbb
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r10 = r0.getKey()
            java.lang.Object r1 = r0.getKey()
            com.google.firebase.sessions.api.SessionSubscriber$Name r1 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r1
            java.lang.Object r0 = r0.getValue()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r0
            kotlinx.coroutines.sync.Mutex r9 = r0.getMutex()
            r5.L$0 = r2
            r5.L$1 = r8
            r5.L$2 = r1
            r5.L$3 = r9
            r5.L$4 = r2
            r5.L$5 = r10
            r5.label = r3
            java.lang.Object r0 = r9.lock(r4, r5)
            if (r0 != r6) goto La7
            return r6
        La7:
            r7 = r2
        La8:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r0 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE     // Catch: java.lang.Throwable -> Lb6
            com.google.firebase.sessions.api.SessionSubscriber r0 = r0.getSubscriber$com_google_firebase_firebase_sessions(r1)     // Catch: java.lang.Throwable -> Lb6
            r9.unlock(r4)
            r2.put(r10, r0)
            r2 = r7
            goto L72
        Lb6:
            r0 = move-exception
            r9.unlock(r4)
            throw r0
        Lbb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.FirebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final SessionSubscriber getSubscriber$com_google_firebase_firebase_sessions(SessionSubscriber.Name subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        SessionSubscriber subscriber = getDependency(subscriberName).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    public final void reset$com_google_firebase_firebase_sessions() {
        dependencies.clear();
    }
}
