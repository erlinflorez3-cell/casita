package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseKt;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0010qڔJřy-\"CiTR|+Ir^kunbZ9D\u001f\n$z\u0003,wX\ta \u0013JB\u001eDCQ}CQ`#=ӯ$20@J\u0011\u000f\u001aBH>wQŒMë\u00160H\u0081\u000b^\u001bO\u001d\u001a@\t\u0015ī\u0003ɉ`gVȤՈpg"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n\u0016]\u000b 4i$.;CIy8(\u001ev7", "", "4ha2U(LSt\n\u0006", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\na\u001b$Gl\nJv\u0001@dS", "AdcA\\5@a", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u00171;yB\"\u001fqo'\u0007r;R\u007f)U\"", "0`R8Z9Hc\"}Yb:\b\u0005>c\u0003(\t", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", ":hU2V@<Z\u0019lzk=\u0001\u0007/B\u00041z@\u000e", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u0015QD;iH\u001c\u001chO9\u0014t0Lv\u0004KUM,i(", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@Jw\u001bTo\u000b8\u0005%\u0011d\tu\u001ek 6\u0017EEu6%\u00152b=\u0014c)J\u0005'\u0011ZN:jV|F\"[h\u000e]:\u0011\u000e[Om\\DE-\f6R\u0010)h\u0010\u001b\u001a\u00177xF)\\\u001aV\u0001\u0019~\u000b'rSco\tKJEpsB\u0016l'lI>-\u0014O#$wPA\u0019Q:\u000f|ZCiqQ\u001b\u00028m?qhFBkc<>5\u001fY\n{\u001c;f>\u0019t;\u001284?K\tLg\u0016R\\\u007f\u0015\u001a\\N8*4<oCTbuy\u0014QY", "\u0011n\\=T5B]\"", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FirebaseSessions {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "FirebaseSessions";
    private final FirebaseApp firebaseApp;
    private final SessionsSettings settings;

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessions$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineContext $backgroundDispatcher;
        final /* synthetic */ SessionLifecycleServiceBinder $lifecycleServiceBinder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CoroutineContext coroutineContext, SessionLifecycleServiceBinder sessionLifecycleServiceBinder, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$backgroundDispatcher = coroutineContext;
            this.$lifecycleServiceBinder = sessionLifecycleServiceBinder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(String str, FirebaseOptions firebaseOptions) {
            SessionsActivityLifecycleCallbacks.INSTANCE.setLifecycleClient(null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FirebaseSessions.this.new AnonymousClass1(this.$backgroundDispatcher, this.$lifecycleServiceBinder, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                java.lang.String r0 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L44
                if (r1 == r4) goto L55
                if (r1 != r3) goto L98
                kotlin.ResultKt.throwOnFailure(r6)
            L13:
                com.google.firebase.sessions.FirebaseSessions r0 = com.google.firebase.sessions.FirebaseSessions.this
                com.google.firebase.sessions.settings.SessionsSettings r0 = com.google.firebase.sessions.FirebaseSessions.access$getSettings$p(r0)
                boolean r0 = r0.getSessionsEnabled()
                if (r0 != 0) goto L24
                java.lang.String r0 = "Sessions SDK disabled. Not listening to lifecycle events."
            L21:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L24:
                com.google.firebase.sessions.SessionLifecycleClient r1 = new com.google.firebase.sessions.SessionLifecycleClient
                kotlin.coroutines.CoroutineContext r0 = r5.$backgroundDispatcher
                r1.<init>(r0)
                com.google.firebase.sessions.SessionLifecycleServiceBinder r0 = r5.$lifecycleServiceBinder
                r1.bindToService(r0)
                com.google.firebase.sessions.SessionsActivityLifecycleCallbacks r0 = com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.INSTANCE
                r0.setLifecycleClient(r1)
                com.google.firebase.sessions.FirebaseSessions r0 = com.google.firebase.sessions.FirebaseSessions.this
                com.google.firebase.FirebaseApp r1 = com.google.firebase.sessions.FirebaseSessions.access$getFirebaseApp$p(r0)
                com.google.firebase.sessions.FirebaseSessions$1$$ExternalSyntheticLambda0 r0 = new com.google.firebase.sessions.FirebaseSessions$1$$ExternalSyntheticLambda0
                r0.<init>()
                r1.addLifecycleEventListener(r0)
                goto L21
            L44:
                kotlin.ResultKt.throwOnFailure(r6)
                com.google.firebase.sessions.api.FirebaseSessionsDependencies r1 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
                r0 = r5
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r5.label = r4
                java.lang.Object r6 = r1.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r0)
                if (r6 != r2) goto L58
                return r2
            L55:
                kotlin.ResultKt.throwOnFailure(r6)
            L58:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r1 = r6.values()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                boolean r0 = r1 instanceof java.util.Collection
                if (r0 == 0) goto L70
                r0 = r1
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L70
            L6d:
                java.lang.String r0 = "No Sessions subscribers. Not listening to lifecycle events."
                goto L21
            L70:
                java.util.Iterator r1 = r1.iterator()
            L74:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L6d
                java.lang.Object r0 = r1.next()
                com.google.firebase.sessions.api.SessionSubscriber r0 = (com.google.firebase.sessions.api.SessionSubscriber) r0
                boolean r0 = r0.isDataCollectionEnabled()
                if (r0 == 0) goto L74
                com.google.firebase.sessions.FirebaseSessions r0 = com.google.firebase.sessions.FirebaseSessions.this
                com.google.firebase.sessions.settings.SessionsSettings r1 = com.google.firebase.sessions.FirebaseSessions.access$getSettings$p(r0)
                r0 = r5
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r5.label = r3
                java.lang.Object r0 = r1.updateSettings(r0)
                if (r0 != r2) goto L13
                return r2
            L98:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessions.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007lk?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fa(~:\t}P>˪AН^\u000bKƤV%\u0007mDI\u0004|\u0014VƤ6F\bA9R}Cˉd{"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n\u0016]\u000b 4i$.;CIy8(\u001ev \u0017\u0011k7J\u007f+QU$", "", "u(E", "\"@6", "", "7mbAT5<S", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n\u0016]\u000b 4i$.;CIy8(\u001ev7", "5dc\u0016a:MO\"|z", "u(;0b4\bU#\t|e,F\n3r\u007f%wN\u0001`%G}\u001c@\u0001.C#^$Dm\u0013*[C)kB,\u0019rjG\\", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FirebaseSessions getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(FirebaseSessions.class);
            Intrinsics.checkNotNullExpressionValue(obj, "Firebase.app[FirebaseSessions::class.java]");
            return (FirebaseSessions) obj;
        }
    }

    public FirebaseSessions(FirebaseApp firebaseApp, SessionsSettings sessionsSettings, CoroutineContext coroutineContext, SessionLifecycleServiceBinder sessionLifecycleServiceBinder) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 16858);
        short sXd2 = (short) (FB.Xd() ^ 26365);
        int[] iArr = new int["LPZNLL_R/_`".length()];
        QB qb = new QB("LPZNLL_R/_`");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Intrinsics.checkNotNullParameter(firebaseApp, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(sessionsSettings, Jg.Wd("DW\u007f7Ec4A", (short) (C1607wl.Xd() ^ 20046), (short) (C1607wl.Xd() ^ 4726)));
        short sXd3 = (short) (C1633zX.Xd() ^ (-8077));
        short sXd4 = (short) (C1633zX.Xd() ^ (-20486));
        int[] iArr2 = new int["\u0014{/p\u0019C!_c\u001e~Y\u0013\u000bH\u0004\u000e M:".length()];
        QB qb2 = new QB("\u0014{/p\u0019C!_c\u001e~Y\u0013\u000bH\u0004\u000e M:");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
            i3++;
        }
        Intrinsics.checkNotNullParameter(coroutineContext, new String(iArr2, 0, i3));
        Intrinsics.checkNotNullParameter(sessionLifecycleServiceBinder, C1626yg.Ud("\u001dyT>6\u0003$\u0010$D+>\u001f_RGvd\u0002LE ", (short) (FB.Xd() ^ 22341), (short) (FB.Xd() ^ 23870)));
        this.firebaseApp = firebaseApp;
        this.settings = sessionsSettings;
        Ig.wd("+\u001afUJ\u00061=$VY4:b\u0012\u0001;\u001ap\u0007>E%=k*<|\u001c-\u007fWZ\nq", (short) (ZN.Xd() ^ PhotoshopDirectory.TAG_WORKFLOW_URL));
        EO.Od("-\u0007\u007fMCv'K_`rNn|\u001e\u007f", (short) (Od.Xd() ^ (-30861)));
        Context applicationContext = firebaseApp.getApplicationContext();
        Class<?> cls = Class.forName(C1561oA.Qd("iujwslf/cnlqain';fdiYkf", (short) (Od.Xd() ^ (-20722))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd5 = (short) (ZN.Xd() ^ 18048);
        short sXd6 = (short) (ZN.Xd() ^ 31527);
        int[] iArr3 = new int[".-=\u000b;<9721E;BB\u0018EEL>RO".length()];
        QB qb3 = new QB(".-=\u000b;<9721E;BB\u0018EEL>RO");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd5 + i4)) - sXd6);
            i4++;
        }
        Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            Context context = (Context) method.invoke(applicationContext, objArr);
            if (!(context instanceof Application)) {
                String str = C1561oA.Xd("|\u0019\"&  \\2._3'*-8:,:h64221H3=7r76BC::=FO\t}TNFZSIHZLL\tMZZaSgd\u0011", (short) (Od.Xd() ^ (-15034))) + context.getClass() + '.';
                return;
            }
            Application application = (Application) context;
            Object[] objArr2 = {SessionsActivityLifecycleCallbacks.INSTANCE};
            Method method2 = Class.forName(C1561oA.od("T`Ub^WQ\u001aLZY\u0016(VUPLEBTHMK", (short) (C1499aX.Xd() ^ (-25257)))).getMethod(Wg.Zd("RtFW1A\u0002\u001e<\u000e.r\u000fQk`B\u000f[i7\\\u0016.v\u00041\f\u001b@N 7n", (short) (C1580rY.Xd() ^ (-7183)), (short) (C1580rY.Xd() ^ (-29841))), Class.forName(C1561oA.Kd("\u0002\u0010\u0007\u0016\u0014\u000f\u000bU\n\u001a\u001bYm\u001e\u001f\u001c\u001a\u0015\u0014(\u001e%%[y\u001d/%3'39\r+))(?*4.\r,89003<E", (short) (C1499aX.Xd() ^ (-10723)))));
            try {
                method2.setAccessible(true);
                method2.invoke(application, objArr2);
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineContext), null, null, new AnonymousClass1(coroutineContext, sessionLifecycleServiceBinder, null), 3, null);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
