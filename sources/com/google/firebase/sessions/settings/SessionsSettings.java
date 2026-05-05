package com.google.firebase.sessions.settings;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseKt;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.ProcessDetailsProvider;
import com.google.firebase.sessions.SessionDataStoreConfigs;
import com.google.firebase.sessions.SessionEvents;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
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
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.hS2\u000fq{<$q$yCAU\"}8\tWNmhvJh\u000fK\u000f\f\u0017\u0001jBI]xc\u0013\u00172PxG3StE9nt>\u0005&3(\u0600\u0010ڎ\u001f>ZH>u3BoL?6P\u0001>`\re\u0005H\u0013\u0016B.\u00036\\\u0016QFLzaR/Q\u0006yF\\,w0+S\u001dJb.%v\u0010&ҋD7C\u001eex\t\u001bb_M\rWqk\u0010x+5-as\u00069h\u0004\"\u0019CO;`\u0003*j\ni`:-˦ScY\\N;\b~\n\u001aT\u0004<\u00147L<<2f6\u001c\u07baxraP\u0019\u0010l_\u0018z\u0010PG)\u000eDC9Ix\u0018a\u00044\\U\u0014\u0005;8S\u0005|6sT<v[\u001bȑvPƱP̵ףLP\u0010xK\u000eL\u007fp#B\u0004^iF\u0082:ö-ϏÉ;[GFqw\u0010U\\g%\u00137èUׂVHH̎?\"E9!\f\tR;ʐmÏXX4Ҋ\u001e+b\u0018\u0016\bA2\u0013<˶%)(PU{w~\u001eu\u0018:Gfeo%0\u0085VުՍ24ʚb\u0010уVz,ABy\u0013p7Qa%r\\V<h\rн\u0014{\u0014FT'!NŰq)<,70d\u0018Nҳ:p@\u0005\teyӹ\u0014$"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u00171;yB\"\u001fqo'\u0007r;R\u007f)U\"", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "0k^0^0GUw\u0003\ti(\f\u00072e\r", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "0`R8Z9Hc\"}Yb:\b\u0005>c\u0003(\t", "4ha2U(LS|\b\tm(\u0004\u0010+t\u00042\u0005N\\\"\u001b", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u0005 %Vk\u0015Cr49c\u0007.\u0001N\u001a;M@7y4\u0002\u001evp5\u000ej(]z1PZ*7`(", "/o_\u0016a-H", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n\u0011d\t';k\u0012=QMDO=\u001f\u001f>", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtB\u00014<]\u0007i5w#8]R?t4,^FkF\u0011s;R\u007f'%VW;\\e\u0002\u0013z\u0018d\u001dU/\u0016NWK1xTF#\u0011,WK\u0019r\u000e\u0016&\u001d9sp `\u0019Vy(\u0005\u0017\u0010fPa){QKGi*.\rc*\\762\u0014;\u001d$v_*\u0011\u0003O v\\\u0003u1(\u001d\b8!:{[*N}d8{.\u001bZ\u007f\u0002\u001b@4\u007f/J\u0014\u0002>2\u007ff\u000fUi\u001f>(y\u00199\\>#46\u0006!?YqyvG\u001c2zl\u0013\u0015f3-(iol,\u0018\bgl\u001f&", "4ha2U(LSt\n\u0006", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\na\u001b$Gl\nJv\u0001@dS", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@Jw\u001bTo\u000b8\u0005%\u0011d\tu\u001es =TGD52(\"rqH\u000bl,\\@\u0005QYX<kV{=q\u001cc\u001dN>\u001cZ@G.}K;(Q*S\u000fEx\u0010\u0010\u001f\u000eC4NLc\u001aW\t\u0019~A\u0007rOh_\rV\u0017,`4lUa'f<A$]r\u001d(hM*\u0018{\u001d\u0015{`\tcnN\u0015\n<.G{%'I|U9p5\u001f/\u0005\u0006!._{'\u00041\u000e=8\u0012o\t!+\t", ":nR._\u0016OS&\f~],j\t>t\u00041}N", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u00171;zC\"\u001ejo$\u0014m=Ru'T\"", "@d\\<g,,S(\u000e~g.\u000b", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@J%\u0017U}\u0012F\u007f3~g}/Fq\u001f0[\r)kC-\u0019qcGqp6_z&GY$\u0013Z\\z\u0007\u0016\u001cd\u0010U+V\u0006]N$k@E\u001fQ:I\u0010Il\u000b\u0015$WCj\u007fQZ\u0019I\b^cA8wJba\b2NOs.c\flr +", "A`\\=_0GU\u0006z\n^", "", "5dc T4IZ\u001d\b|K(\f\t", "u(3", "Adb@\\6G@\u0019\r\nZ9\fw3m\u007f2\fO", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "5dc X:LW#\bg^:\f\u0005<tn,\u0004@\u000b'&\u000f_ P`w@W", "u(9", "Adb@\\6Gax\bv[3|\b", "", "5dc X:LW#\b\t>5x\u00066e~", "u(I", "7rE._0=A\u0015\u0007\u0006e0\u0006\u000b\u001ca\u000f(", "7rE._0=A\u0019\r\tb6\u0006u/s\u000f$\tOo\u001b\u001fGy\u001eK", "7rE._0=A\u0019\r\tb6\u0006u/s\u000f$\tOo\u001b\u001fGy\u001eK>\f\"8\f\n\u001cw", "uI\u0018'", "CoS.g,,S(\u000e~g.\u000b", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "\u0011n\\=T5B]\"", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SessionsSettings {
    private static final String TAG = "SessionsSettings";
    private final SettingsProvider localOverrideSettings;
    private final SettingsProvider remoteSettings;
    public static final Companion Companion = new Companion(null);
    private static final ReadOnlyProperty<Context, DataStore<Preferences>> dataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default(SessionDataStoreConfigs.INSTANCE.getSETTINGS_CONFIG_NAME(), new ReplaceFileCorruptionHandler(new Function1<CorruptionException, Preferences>() { // from class: com.google.firebase.sessions.settings.SessionsSettings$Companion$dataStore$2
        @Override // kotlin.jvm.functions.Function1
        public final Preferences invoke(CorruptionException ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            String str = "CorruptionException in settings DataStore in " + ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions() + '.';
            return PreferencesFactory.createEmpty();
        }
    }), null, null, 12, null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007lkA0ZeP.hS2\u000f\u0002{<$a'wْ<kڼ.\"7N\u000flmnН^\u000bQ\u000fV\"\u0007kDI\u0004z4܋a̓FoG\u074c\u001e~K<xtd\tVvŕ<}\u001d\u0003 /V\u0016G\u001eQR$\u0018@B\u0001:\u0001\u0016{\rB\u00124HVAtմɦNɇLve<50\u0011wZP-j>\t֚\u0011U"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u00171;yB\"\u001fqo'\u0007r;R\u007f)U\u000b,6d]nF\u0018\u001ccc", "", "u(E", "\"@6", "", "7mbAT5<S", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u00171;yB\"\u001fqo'\u0007r;R\u007f)U\"", "5dc\u0016a:MO\"|z", "u(;0b4\bU#\t|e,F\n3r\u007f%wN\u0001`%G}\u001c@\u0001.C#\f F|\u001a7OQ\u0005Y4,#lkB\u0015Q,]\u0006+PN\\\u0002", "2`c.F;H`\u0019", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\u0013Dc\u000b \r", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaG\\", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0011T;:A(\t\b^", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ#r.4f\b$6\u0001_-IR7yC(\"h+7\u0011p,\u0018U#VH<;f_r\u0013", "2`c.F;H`\u0019=y^3|\u000b+t\u007f", "\u001aj^A_0G\u001d$\f\u0005i,\n\u00183e\u000eqh@|\u0016\u0001Pv\"'\u0004/@Y\u000b/KC", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property2(new PropertyReference2Impl(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DataStore<Preferences> getDataStore(Context context) {
            return (DataStore) SessionsSettings.dataStore$delegate.getValue(context, $$delegatedProperties[0]);
        }

        public final SessionsSettings getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionsSettings.class);
            Intrinsics.checkNotNullExpressionValue(obj, "Firebase.app[SessionsSettings::class.java]");
            return (SessionsSettings) obj;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return SessionsSettings.this.updateSettings(this);
        }
    }

    private SessionsSettings(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo) {
        this(new LocalOverrideSettings(context), new RemoteSettings(coroutineContext2, firebaseInstallationsApi, applicationInfo, new RemoteSettingsFetcher(applicationInfo, coroutineContext, null, 4, null), Companion.getDataStore(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionsSettings(FirebaseApp firebaseApp, CoroutineContext blockingDispatcher, CoroutineContext backgroundDispatcher, FirebaseInstallationsApi firebaseInstallationsApi) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Context applicationContext = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "firebaseApp.applicationContext");
        this(applicationContext, blockingDispatcher, backgroundDispatcher, firebaseInstallationsApi, SessionEvents.INSTANCE.getApplicationInfo(firebaseApp));
    }

    public SessionsSettings(SettingsProvider localOverrideSettings, SettingsProvider remoteSettings) {
        Intrinsics.checkNotNullParameter(localOverrideSettings, "localOverrideSettings");
        Intrinsics.checkNotNullParameter(remoteSettings, "remoteSettings");
        this.localOverrideSettings = localOverrideSettings;
        this.remoteSettings = remoteSettings;
    }

    private final boolean isValidSamplingRate(double d2) {
        return 0.0d <= d2 && d2 <= 1.0d;
    }

    /* JADX INFO: renamed from: isValidSessionRestartTimeout-LRDsOJo */
    private final boolean m7779isValidSessionRestartTimeoutLRDsOJo(long j2) {
        return Duration.m10340isPositiveimpl(j2) && Duration.m10335isFiniteimpl(j2);
    }

    public final double getSamplingRate() {
        Double samplingRate = this.localOverrideSettings.getSamplingRate();
        if (samplingRate != null) {
            double dDoubleValue = samplingRate.doubleValue();
            if (isValidSamplingRate(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double samplingRate2 = this.remoteSettings.getSamplingRate();
        if (samplingRate2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = samplingRate2.doubleValue();
        if (isValidSamplingRate(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    /* JADX INFO: renamed from: getSessionRestartTimeout-UwyO8pc */
    public final long m7780getSessionRestartTimeoutUwyO8pc() {
        Duration durationMo7778getSessionRestartTimeoutFghU774 = this.localOverrideSettings.mo7778getSessionRestartTimeoutFghU774();
        if (durationMo7778getSessionRestartTimeoutFghU774 != null) {
            long jM10361unboximpl = durationMo7778getSessionRestartTimeoutFghU774.m10361unboximpl();
            if (m7779isValidSessionRestartTimeoutLRDsOJo(jM10361unboximpl)) {
                return jM10361unboximpl;
            }
        }
        Duration durationMo7778getSessionRestartTimeoutFghU7742 = this.remoteSettings.mo7778getSessionRestartTimeoutFghU774();
        if (durationMo7778getSessionRestartTimeoutFghU7742 != null) {
            long jM10361unboximpl2 = durationMo7778getSessionRestartTimeoutFghU7742.m10361unboximpl();
            if (m7779isValidSessionRestartTimeoutLRDsOJo(jM10361unboximpl2)) {
                return jM10361unboximpl2;
            }
        }
        Duration.Companion companion = Duration.Companion;
        return DurationKt.toDuration(30, DurationUnit.MINUTES);
    }

    public final boolean getSessionsEnabled() {
        Boolean sessionEnabled = this.localOverrideSettings.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        Boolean sessionEnabled2 = this.remoteSettings.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateSettings(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.firebase.sessions.settings.SessionsSettings.AnonymousClass1
            if (r0 == 0) goto L53
            r5 = r7
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r5 = (com.google.firebase.sessions.settings.SessionsSettings.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L53
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L16:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L3e
            if (r0 != r2) goto L59
            kotlin.ResultKt.throwOnFailure(r4)
        L29:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2c:
            kotlin.ResultKt.throwOnFailure(r4)
            com.google.firebase.sessions.settings.SettingsProvider r0 = r6.localOverrideSettings
            r5.L$0 = r6
            r5.label = r1
            java.lang.Object r0 = r0.updateSettings(r5)
            if (r0 != r3) goto L3c
            return r3
        L3c:
            r0 = r6
            goto L45
        L3e:
            java.lang.Object r0 = r5.L$0
            com.google.firebase.sessions.settings.SessionsSettings r0 = (com.google.firebase.sessions.settings.SessionsSettings) r0
            kotlin.ResultKt.throwOnFailure(r4)
        L45:
            com.google.firebase.sessions.settings.SettingsProvider r1 = r0.remoteSettings
            r0 = 0
            r5.L$0 = r0
            r5.label = r2
            java.lang.Object r0 = r1.updateSettings(r5)
            if (r0 != r3) goto L29
            return r3
        L53:
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r5 = new com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            r5.<init>(r7)
            goto L16
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.updateSettings(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
