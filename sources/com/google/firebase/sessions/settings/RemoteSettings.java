package com.google.firebase.sessions.settings;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
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
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$q$yCAU\"}8\tWȞog|Nb\u000bI\u0010\u000e\u0016\u0007s4I[ye\u0012%2JoE4UoS9ht<\b(208\u0002\u0005\u0007\u001b2H\u001e\u0003\u0003CQ\u000f\u0018ؓV\u0081X{=M3\u0019J\u0005g`2.`uNNH\u001b^J31\u0005\u0002B|*o4\u000bQ%F\u0003,\u001dzo$C@e<%/a\u000b\u001fXkA\u0013? G3qҊ++W~ Af ,\u0015YpS\\ę*\\\u000bs)\u00125NgcycT<@\t\n1T\u0004<+WL<S2f63yt;bNw\u001a^p!Aʿt҆$ĮĴ/9)\u000f\"mI\u001df7*\nc̗%ъr!c٪^l#\u001blw\u007f2(̸?˓R\naƝ>\u0010~h\u001a*27\u001eČ1ɨ\u0015.\u001f¦\bgG/9k0U\u001bϜxݶdh[֟#TN$\u0007\u0016e-_ȴ\\ֈh\u0005s¬%l:\u001fe\u001ej\u0006,\u0017It3ʓ>Ƽ)\u0014fQnyx^.\u001e3A~9om\u001a!\u000e\u000e5ڿ7Ʉg\u0014yT|(MQ3\"f|ZU\"Y\u000b?X\u0007\u001fб\u0012ɧzͩā\u000b\u0012֮>qʬ80I\u001bb-V\u001cn[O\u0017!_\t\u0004F?+՟ɹ\u0003Ȑ(~\u0011\u0003Vz~\u000f\u007fzOH\u000b}ø-NY5\u001f=]%nض\u0019Q\u0006\u0007s\u0006fѮPq"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u00170;s>-\u0015VaH\u0016g5P\u0005|", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u00171;zC\"\u001ejo$\u0014m=Ru'T\"", "0`R8Z9Hc\"}Yb:\b\u0005>c\u0003(\t", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "4ha2U(LS|\b\tm(\u0004\u0010+t\u00042\u0005N\\\"\u001b", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u0005 %Vk\u0015Cr49c\u0007.\u0001N\u001a;M@7y4\u0002\u001evp5\u000ej(]z1PZ*7`(", "/o_\u0016a-H", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n\u0011d\t';k\u0012=QMDO=\u001f\u001f>", "1n]3\\.L4\u0019\u000exa,\n", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u0017!HgB!\u001c|p=\u0005q\u001aN\u00066KUP:=R\u0002;\u0017\u0012gc", "2`c.F;H`\u0019", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\u0013Dc\u000b \r", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaG\\", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015KMC56(\u001fjh9Pd0[v$CZNu`[\u0001L\u0010\u0019a\n]/\u0017\u000eg\u000b\u0005rQ7\u001c\u0004:IeDv\u0010\b\u001d\u00151ytL_\u001e#\u0005\u0019K('rN#a\u0004QCLbse\u0010l\u001dY6H$]\u007f\u0019)vT8\u0013\n\u001dl}]\u0001keC(~B-\"v\\P\u001bVSF|p!U\u0006y\u00192\"u/\u0002-\u0001086.\u0013Ku&Bh\u0002#ujA65:E\u0015M\u0015A\u0003hL\u0011o3p\f\fp#1(tilJ\u001dg]&Y8alV\u001eN\u000f=Vy\u0019&YHAW\t\u0011\u0017\u0016.ze\u0013A%a\u0001cO@1[~\u0012\rs\u0018qq\u0007", "4dc0[\u0010G>&\t|k,\u000b\u0017", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0015 \u0015\u0011W\u001eKv8\u000b", "A`\\=_0GU\u0006z\n^", "", "5dc T4IZ\u001d\b|K(\f\t", "u(;7T=:\u001d z\u0004`u[\u0013?b\u0007(Q", "Adb@\\6G3\"zwe,{", "", "5dc X:LW#\bZg(y\u0010/d", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "Adb@\\6G@\u0019\r\nZ9\fw3m\u007f2\fO", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "5dc X:LW#\bg^:\f\u0005<tn,\u0004@\u000b'&\u000fP\u0010?fv\u0007(", "u(;8b;EW\"H\nb4|R\u000eu\r$\u000bD\u000b l", "AdcA\\5@avzxa,", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u00171;zC\"\u001ejo\u0017\u0003a/NL", "5dc X;MW\"\u0001\t<(z\f/", "u(;0b4\bU#\t|e,F\n3r\u007f%wN\u0001`%G}\u001c@\u0001.C#\f F|\u001a7OQ\u0005Y4-$lj;\u0015A(Ly'\u001d", "AdcA\\5@avzxa,;\b/l\u007f*wO\u0001", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "1kT.e\n:Q\u001c~yL,\f\u00183n\u00026", "", "1kT.e\n:Q\u001c~yL,\f\u00183n\u00026:>\u000b\u001f\u0011Iy\u0018>}%/Z\u0002-7j\u0012<M=<oA\u001e\u0012do9\u0001q,\\\u0005+QU\\", "7rB2g;B\\\u001b\rhm(\u0004\t", "@d\\<i,\u001f]&\u0011vk+j\u0010+s\u0003(\n$\n", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "CoS.g,,S(\u000e~g.\u000b", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "\u0011n\\=T5B]\"", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RemoteSettings implements SettingsProvider {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String FORWARD_SLASH_STRING = "/";

    @Deprecated
    public static final String TAG = "SessionConfigFetcher";
    private final ApplicationInfo appInfo;
    private final CoroutineContext backgroundDispatcher;
    private final CrashlyticsSettingsFetcher configsFetcher;
    private final Mutex fetchInProgress;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private final Lazy settingsCache$delegate;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005\"2ߝx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈ƪ6F"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u00170;s>-\u0015VaH\u0016g5P\u0005e%VV7X[vG\u001dg", "", "u(E", "\u0014NA$4\u0019\u001dM\u0007eVL\u000fvv\u001eRc\u0011]", "", "\"@6", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteSettings.this.updateSettings(this);
        }
    }

    public RemoteSettings(CoroutineContext backgroundDispatcher, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo appInfo, CrashlyticsSettingsFetcher configsFetcher, final DataStore<Preferences> dataStore) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(configsFetcher, "configsFetcher");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.backgroundDispatcher = backgroundDispatcher;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = appInfo;
        this.configsFetcher = configsFetcher;
        this.settingsCache$delegate = LazyKt.lazy(new Function0<SettingsCache>() { // from class: com.google.firebase.sessions.settings.RemoteSettings$settingsCache$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SettingsCache invoke() {
                return new SettingsCache(dataStore);
            }
        });
        this.fetchInProgress = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SettingsCache getSettingsCache() {
        return (SettingsCache) this.settingsCache$delegate.getValue();
    }

    private final String removeForwardSlashesIn(String str) {
        return new Regex(FORWARD_SLASH_STRING).replace(str, "");
    }

    public final void clearCachedSettings$com_google_firebase_firebase_sessions() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new RemoteSettings$clearCachedSettings$1(this, null), 3, null);
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Double getSamplingRate() {
        return getSettingsCache().sessionSamplingRate();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Boolean getSessionEnabled() {
        return getSettingsCache().sessionsEnabled();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    public Duration mo7778getSessionRestartTimeoutFghU774() {
        Integer numSessionRestartTimeout = getSettingsCache().sessionRestartTimeout();
        if (numSessionRestartTimeout == null) {
            return null;
        }
        Duration.Companion companion = Duration.Companion;
        return Duration.m10304boximpl(DurationKt.toDuration(numSessionRestartTimeout.intValue(), DurationUnit.SECONDS));
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return getSettingsCache().hasCacheExpired$com_google_firebase_firebase_sessions();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5 A[Catch: all -> 0x0152, TRY_LEAVE, TryCatch #0 {all -> 0x0152, blocks: (B:37:0x00a4, B:38:0x00a7, B:40:0x00b5, B:44:0x00be), top: B:59:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object updateSettings(kotlin.coroutines.Continuation<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettings.updateSettings(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
