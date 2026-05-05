package com.google.firebase.sessions.settings;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007|jAӄLeV7ZS0\u000fs{B$c$wDCU(\u0004*\tUNog|Nb\u000bI\u0013\u000e\u0016\u000fj4I[\u0001e\u0012\u001d9JoE;SڎSʠ~!f\u0005N1Z7&E\u0012*4V\u0010\u000f\u0001SM\u001c\u0012^B\u001f;ň\u0011M\u0013\u001dZ\u0011L&\u0019\u001e\u000bn\u0015ȤՂp]@7k\u0014wKf'\u000e:CճKѸS܋˼zc$6NC} 3`\u001b\thZm\u0011ӭu=\u0013wo29Y\fYLW.%Ʀ/O\u001bo;1j\u0018ib\"&YVӍOP\u001c<@(\n\"T\u0004<\u0010GJ4Ʀ(|8\u0018A\f\u000bYPR\u0012^\t\u0016)yf\u001d3\u0019K-O\u001a-g(ݥWل6ަ˿\u0011\u001e1\u001b7:io&`C%\u0005}_MiBSG|\u001b Ƥ,ׇoç͆.\u0004>dHH\n/F\u0017SA\f?1@\u0004\u0004^C\u0016\u0005K¢'ؾhɭ͕D\"|6\u007fC\u0017-rD\u0013\u000f\u001cVbzD\u0013c\u001b\u0003*DܸQٷ[ɼ˶%%\u001er\u0018vw\u0010e]8/_jE\u007f\u0007k<Y\u007f^{N_\u000b(a\u0001\u0001DEJ\u000b\u001dZ|A\u0002\u001a!٩fШ1ʋн\u0014w\nd\u0017%![WqJ>\\7'\u0007-J\u0019\u001dpHCȈ\u001e̬gɭњX32.:6\u0003\t\u0019Vlr\u007fg'KZ}7ø/ۮU5!ğ&.v8\u0015#5\u0004JÕsѨPGT˾ָuW\u0004 \u001c1\u0081U\\"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u00171;zC\"\u001ejo\u0017\u0003a/NL", "", "2`c.F;H`\u0019", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\u0013Dc\u000b \r", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaG\\", "uKP;W9HW\u0018\u0012D](\f\u0005=t\n5{\n~!$G9l8\u0006!#h\b-7CY\u001f", "Adb@\\6G1#\b{b.\u000b", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u00171;yB\"\u001fq?C\u0010d0P\u0005|", "6`b\u0010T*ASx\u0012\u0006b9|\b", "", "6`b\u0010T*ASx\u0012\u0006b9|\bmc\n0uB\u000b!\u0019No\b=z25Vy.7g\u00172ZC8gB\u001e\u000fvaG\u0015g6W\u0005", "@d\\<i,\u001c]\"\u007f~`:", "", "@d\\<i,\u001c]\"\u007f~`:;\u00079my*\u0006J\u0003\u001e\u0017Ap\u0012Iv\"1g}\u001a8q#.J?Ik.,\u0015vo=\u0011l:", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "Adb@\\6G@\u0019\r\nZ9\fw3m\u007f2\fO", "", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adb@\\6GA\u0015\u0007\u0006e0\u0006\u000b\u001ca\u000f(", "", "u(;7T=:\u001d z\u0004`u[\u0013?b\u0007(Q", "Adb@\\6Gax\bv[3|\b", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "CoS.g,\u001c]\"\u007f~`\u001dx\u0010?e", "\"", "9dh", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGEI,bL", "D`[BX", "uKP;W9HW\u0018\u0012D](\f\u0005=t\n5{\n\f$\u0017Ho\u001b<\u007f#5gG\u001eAz\u0016w8P;l4+\u0015q_9\u0015\"\u0012N\u000b|.QJ=X\u001cy9\u001d\u0014$wK0\r\u0003h\u0017\u000btNF&\f5\u0013\u007fEu\u000b\u001c%\u0012>j~\f4\u001aP\t\u0019~Q%wJchO\u000b(J^;`Uf\u0019e<\u0004\u000e\u0011v\u0019\u0019w&", "CoS.g,,O!\n\u0002b5~u+t\u007f", "@`c2", "uKY.i(\bZ\u0015\b|(\u000b\u0007\u0019,l\u007f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "CoS.g,,S'\r~h5Z\u0005-h\u007f\u0007\fM|&\u001bQx", "1`R5X\u000bN`\u0015\u000e~h5`\u0012\u001de}2\u0005?\u000f", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q'\u0007!&Ns\u0017\u0006t/Bc\u000e/;v\u0016<\u0017!EtC\"\u001ex]H\u000bm5$:\u000eLH_(&YnF\u0016[D\u000bS+\u000b\u0014/", "CoS.g,,S'\r~h5Z\u0005-h\u007f\u0018\u0007?|&\u0017F^\u0012Dv", "1`R5X\u001cIR\u0015\u000ez]\u001b\u0001\u0011/", "", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;f.\u0006O\b\u001b \u0011m\u0018I\u00015D]\u0007 E7s8VR?tD\u001a$lkB\\'\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001", "CoS.g,,S'\r~h5Z\u00138f\u0004*\n", ">qT3X9>\\\u0017~\t", "CoS.g,,S'\r~h5i\t=t{5\u000b/\u0005\u001f\u0017Q\u007f\u001d", "Bh\\2b<M7\"lz\\6\u0006\b=", "CoS.g,,S(\u000e~g.\u000bh8a|/{?", "3mP/_,=", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q'\u0007!&Ns\u0017\u0006t/Bc\u000e/;v\u0016<\u0017!EtC\"\u001ex]H\u000bm5$:\u000eLH_(&YnF\u0016[D\u000bS+\u000b\u0014/", "\u0011n\\=T5B]\"", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SettingsCache {

    @Deprecated
    public static final String TAG = "SettingsCache";
    private final DataStore<Preferences> dataStore;
    private SessionConfigs sessionConfigs;
    private static final Companion Companion = new Companion(null);
    private static final Preferences.Key<Boolean> SESSIONS_ENABLED = PreferencesKeys.booleanKey(LocalOverrideSettings.SESSIONS_ENABLED);
    private static final Preferences.Key<Double> SAMPLING_RATE = PreferencesKeys.doubleKey(LocalOverrideSettings.SAMPLING_RATE);
    private static final Preferences.Key<Integer> RESTART_TIMEOUT_SECONDS = PreferencesKeys.intKey("firebase_sessions_restart_timeout");
    private static final Preferences.Key<Integer> CACHE_DURATION_SECONDS = PreferencesKeys.intKey("firebase_sessions_cache_duration");
    private static final Preferences.Key<Long> CACHE_UPDATED_TIME = PreferencesKeys.longKey("firebase_sessions_cache_updated_time");

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCache$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SettingsCache.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SettingsCache settingsCache;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                settingsCache = SettingsCache.this;
                this.L$0 = settingsCache;
                this.label = 1;
                obj = FlowKt.first(settingsCache.dataStore.getData(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                settingsCache = (SettingsCache) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            settingsCache.updateSessionConfigs(((Preferences) obj).toPreferences());
            return Unit.INSTANCE;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r(4\u0012}\bnjG7LeN0ZS8\u0013s{:$c$\u007fLCU }*\t]Zo˧tϽ[!¼?\u0006Dw+1OUޯa\u0012\u001d2\u0013\u0005M4euM;ptd\bN4ŕ<\u007f\rЏ2,N\u0014\u0005\u007f\u0014`\u001a\u0018HF\u0001<b\r{\fH\u0014ĂB&\tȦtiT>Vq.O=,\u001boRP7_^\u007f{\u000fТX-\u0015Ǹy 1JE:e:a\u000e\u001fXkA\u0013? I3jҊ+1Q֕o8^\r\"\u001a{d\u001bk\u000b,l\u0007a`:6YQӍOV\u0016ߊ\u0010|\u0002\u001dJ\t^\u00125YF-Hx^ԋ\u0006ϢvSHАمbU"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u00171;zC\"\u001ejo\u0017\u0003a/N5\u0005QTY(eV|Fi", "", "u(E", "\u0011@2\u00158&\u001dC\u0006ZiB\u0016e\u0003\u001dE]\u0012d\u001fn", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGEI,bL", "", "5dc\u00104\n!3\u0013]jK\bkl\u0019Ny\u0016[\u001ej\u007fu5", "u(;.a+K]\u001d}\u000e(+x\u0018+s\u000f2\t@J\"$Gp\u000eIv.3Y\fi5w#.\u0017.Hk5\u001e\"hj7\u0007qj4v;\u001d", "\u0011@2\u00158&.>wZi>\u000bvw\u0013M_", "", "5dc\u00104\n!3\u0013ne=\bkh\u000e_n\fc ", " DB!4\u0019-M\bbb>\u0016lw)S_\u0006e)_\u0005", "5dc\u001f8\u001a-/\u0006mtM\u0010dh\u0019Un\"i ^\u0001\u007f&]", "!@<\u001d?\u0010'5\u0013kVM\f", "", "5dc 4\u0014):|g\\X\u0019Xw\u000f", "!DB <\u0016'A\u0013^c:\tch\u000e", "", "5dc 8\u001a,7\u0003ghX\fed\fL_\u0007", "\"@6", "", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Preferences.Key<Integer> getCACHE_DURATION_SECONDS() {
            return SettingsCache.CACHE_DURATION_SECONDS;
        }

        public final Preferences.Key<Long> getCACHE_UPDATED_TIME() {
            return SettingsCache.CACHE_UPDATED_TIME;
        }

        public final Preferences.Key<Integer> getRESTART_TIMEOUT_SECONDS() {
            return SettingsCache.RESTART_TIMEOUT_SECONDS;
        }

        public final Preferences.Key<Double> getSAMPLING_RATE() {
            return SettingsCache.SAMPLING_RATE;
        }

        public final Preferences.Key<Boolean> getSESSIONS_ENABLED() {
            return SettingsCache.SESSIONS_ENABLED;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C11561<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C11561(Continuation<? super C11561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SettingsCache.this.updateConfigValue(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bDJc|\u0004W\u0006>éFB-!L\u0014}јtji4Rf`.\u0001UpŪ*"}, d2 = {"\n`]<a@F])\rS", "", "\"", ">qT3X9>\\\u0017~\t", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0016]R7h;\u001e\u007fua:\u0007p,Wt'U\""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ Preferences.Key<T> $key;
        final /* synthetic */ T $value;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SettingsCache this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(T t2, Preferences.Key<T> key, SettingsCache settingsCache, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$value = t2;
            this.$key = key;
            this.this$0 = settingsCache;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$value, this.$key, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            T t2 = this.$value;
            if (t2 != 0) {
                mutablePreferences.set(this.$key, t2);
            } else {
                mutablePreferences.remove(this.$key);
            }
            this.this$0.updateSessionConfigs(mutablePreferences);
            return Unit.INSTANCE;
        }
    }

    public SettingsCache(DataStore<Preferences> dataStore) throws InterruptedException {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.dataStore = dataStore;
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object updateConfigValue(androidx.datastore.preferences.core.Preferences.Key<T> r7, T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.firebase.sessions.settings.SettingsCache.C11561
            if (r0 == 0) goto L21
            r5 = r9
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r5 = (com.google.firebase.sessions.settings.SettingsCache.C11561) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L21
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 != r3) goto L2b
            goto L27
        L21:
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r5 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1
            r5.<init>(r9)
            goto L13
        L27:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.io.IOException -> L49
            goto L5b
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            kotlin.ResultKt.throwOnFailure(r1)
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r2 = r6.dataStore     // Catch: java.io.IOException -> L49
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2 r1 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2     // Catch: java.io.IOException -> L49
            r0 = 0
            r1.<init>(r8, r7, r6, r0)     // Catch: java.io.IOException -> L49
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: java.io.IOException -> L49
            r5.label = r3     // Catch: java.io.IOException -> L49
            java.lang.Object r0 = androidx.datastore.preferences.core.PreferencesKt.edit(r2, r1, r5)     // Catch: java.io.IOException -> L49
            if (r0 != r4) goto L5b
            return r4
        L49:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to update cache config value: "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = "SettingsCache"
        L5b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SettingsCache.updateConfigValue(androidx.datastore.preferences.core.Preferences$Key, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSessionConfigs(Preferences preferences) {
        this.sessionConfigs = new SessionConfigs((Boolean) preferences.get(SESSIONS_ENABLED), (Double) preferences.get(SAMPLING_RATE), (Integer) preferences.get(RESTART_TIMEOUT_SECONDS), (Integer) preferences.get(CACHE_DURATION_SECONDS), (Long) preferences.get(CACHE_UPDATED_TIME));
    }

    public final boolean hasCacheExpired$com_google_firebase_firebase_sessions() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        SessionConfigs sessionConfigs2 = null;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        Long cacheUpdatedTime = sessionConfigs.getCacheUpdatedTime();
        SessionConfigs sessionConfigs3 = this.sessionConfigs;
        if (sessionConfigs3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
        } else {
            sessionConfigs2 = sessionConfigs3;
        }
        Integer cacheDuration = sessionConfigs2.getCacheDuration();
        return cacheUpdatedTime == null || cacheDuration == null || (System.currentTimeMillis() - cacheUpdatedTime.longValue()) / ((long) 1000) >= ((long) cacheDuration.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object removeConfigs$com_google_firebase_firebase_sessions(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1
            if (r0 == 0) goto L24
            r5 = r7
            com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1 r5 = (com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L24
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L16:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 != r3) goto L2e
            goto L2a
        L24:
            com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1 r5 = new com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1
            r5.<init>(r6, r7)
            goto L16
        L2a:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.io.IOException -> L4c
            goto L5e
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            kotlin.ResultKt.throwOnFailure(r1)
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r2 = r6.dataStore     // Catch: java.io.IOException -> L4c
            com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2 r1 = new com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2     // Catch: java.io.IOException -> L4c
            r0 = 0
            r1.<init>(r6, r0)     // Catch: java.io.IOException -> L4c
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: java.io.IOException -> L4c
            r5.label = r3     // Catch: java.io.IOException -> L4c
            java.lang.Object r0 = androidx.datastore.preferences.core.PreferencesKt.edit(r2, r1, r5)     // Catch: java.io.IOException -> L4c
            if (r0 != r4) goto L5e
            return r4
        L4c:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to remove config values: "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = "SettingsCache"
        L5e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SettingsCache.removeConfigs$com_google_firebase_firebase_sessions(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Integer sessionRestartTimeout() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionRestartTimeout();
    }

    public final Double sessionSamplingRate() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionSamplingRate();
    }

    public final Boolean sessionsEnabled() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionEnabled();
    }

    public final Object updateSamplingRate(Double d2, Continuation<? super Unit> continuation) {
        Object objUpdateConfigValue = updateConfigValue(SAMPLING_RATE, d2, continuation);
        return objUpdateConfigValue == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateConfigValue : Unit.INSTANCE;
    }

    public final Object updateSessionCacheDuration(Integer num, Continuation<? super Unit> continuation) {
        Object objUpdateConfigValue = updateConfigValue(CACHE_DURATION_SECONDS, num, continuation);
        return objUpdateConfigValue == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateConfigValue : Unit.INSTANCE;
    }

    public final Object updateSessionCacheUpdatedTime(Long l2, Continuation<? super Unit> continuation) {
        Object objUpdateConfigValue = updateConfigValue(CACHE_UPDATED_TIME, l2, continuation);
        return objUpdateConfigValue == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateConfigValue : Unit.INSTANCE;
    }

    public final Object updateSessionRestartTimeout(Integer num, Continuation<? super Unit> continuation) {
        Object objUpdateConfigValue = updateConfigValue(RESTART_TIMEOUT_SECONDS, num, continuation);
        return objUpdateConfigValue == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateConfigValue : Unit.INSTANCE;
    }

    public final Object updateSettingsEnabled(Boolean bool, Continuation<? super Unit> continuation) {
        Object objUpdateConfigValue = updateConfigValue(SESSIONS_ENABLED, bool, continuation);
        return objUpdateConfigValue == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateConfigValue : Unit.INSTANCE;
    }
}
