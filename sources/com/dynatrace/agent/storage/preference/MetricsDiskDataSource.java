package com.dynatrace.agent.storage.preference;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.dynatrace.agent.metrics.AppVersion;
import com.dynatrace.agent.storage.di.StorageModuleKt;
import com.dynatrace.android.agent.util.Utility;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007\"2\u0013\u007f\u0007|jA0JeP.hS2şs{B+cҕyCIa\"}(\tWNugvJ`\u000fK\u000f\u001c\u0016\u0001̓4Ikxe\u0012\u00154HģU\u074c}ok8\u0019sRE3B,Fy\u001d\u0007*,X\u0010%|qLë\u00162FsHVU[\u0013\u001f*\bT\u001f/$#ɨ\rɇLlkAwD\u0011qZP=^^\u0006}\u0013T^?\u000f\r`L6p=C!=U\u0019\u0006\u0001h\u0006\u0003ӭu=\u0013vo;9X\fWdh0\u0018#<g\r\fxl؟CŌd\f5=\u0018oYc&(&\u000bBȥzǬ\u0012\u00065Ov^(z \u000ea\u0005\u0013UFА\u0010sr\u0004\twN\u0017S\u0017c5G3~Wq=)N}\u00113&N)\u000f\t9]j\r'*aTɐU1_[\u000eZ\\\nqC}\u0006\u0001b0,21\u001eČ1ɨ\u0015.\u001f¦ۄ_V"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r#kC+\u0019fo\u0018\u000bq2-r6C:X<iPr\u0013", "", "2`c.F;H`\u0019", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\u0013Dc\u000b \r", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaG\\", "\nh]6g\u0005", "uKP;W9HW\u0018\u0012D](\f\u0005=t\n5{\n~!$G9l8\u0006!#h\b-7CY\u001f", "5dc\u001aX;KW\u0017\r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r#kC+\u0019fo\u0018\u0003r($", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "1qT.g,\u001a^$ozk:\u0001\u00138", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\u0001@dn D{\u001a8V\u0019", "Dda@\\6G1#}z", "", "Dda@\\6G<\u0015\u0007z", "", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;f-wQ|`\u001eCx\u0010\u0006d4B]\u0007\"\r1|,WK\u0005jH'\u0011wn5\u0005cuJx'P[\u00184\\a\u007fA\u0012 $iY6}\u0005fO(xM\r", "Adc\u001aX;KW\u0017\r", "", ";dc?\\*L", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ%&Q|\n>vn@f}!7z\u00167KC\u0005S4-\"l_Ge_;JL\u000eMV]3`[<;\u001e\u001fd\u001e]/\u0016\u0005g\u000b\u0002xMF#\u0011<E\u0011?r\naYt:f\u0002> \u0017C\u0003\u0017?+&mFWnO", "1kT.e\u0017KS\u001a~\b^5z\t=", "Adc\u001ce\u0019>[#\u0010z", "\"", ">qT3X9>\\\u0017~\t", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0016]R7h;\u001e\u007fua:\u0007p,Wt'U\"", "9dh", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGEI,bL", "D`[BX", "uKP;W9HW\u0018\u0012D](\f\u0005=t\n5{\n\f$\u0017Ho\u001b<\u007f#5gG\u001eAz\u0016w5SJg1%\u0015Sn9\bc9N\u007f%GZ$\u0013X[qJ\u001e\u0016Y!\u0018*\t\u0014UO3xQ7h\u00139I\u0003;u\u0001\u0015\u0014\u000eC4nLc\u0010\u0011d\"uB)uFb]yU\u007f+b>:rd\u0019m6\u0004+\u0010z\u001bdRM3\nybf6C", "\u0019dh@", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class MetricsDiskDataSource {
    private final DataStore<Preferences> dataStore;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\r(4\u0012}\u000enjG<LeN0ZS8\u0018s{:$c$\u007fGCU \u0006*\t]UogtW`ƐC%إFx\u0019+\n\\~]ܫ\u00134HoM4\u001e\u0005K;xzF\u000702P<(\bв\u001e0PƵ\u000f|IP\u001a\u0018\u0001U~Aj\u0013]\u0007*\u00124BN\u0004ɉ`mVȤ`ncB=)S~PW?e@~]\rtXU\u0010țe$3¨O7\u001b/a\tWgiJ\u001bE\u0002?\u0015hU+YLָ[<`Ü,\u00171[\u001bcC;j\u0012if\u001c);O\u0012Y~\u0011߭{\u0001\u0004ȞT\u0006\u0014\u00155N~B(v \u0014Cv\u0003Sn^0a۰\u0004\u0001iا/'\u0006D9?k{_sS\u001f^9\f\u0005;1Q\u0004ͼ%a\\וx\u0017!h\u0006W\u0002fNR`T\u001a[Mm2\u0007\u0011\u0005ò\b6OĉG}\u0017E%+\bpG;9q\u0012JTg%\u001b\u000fkרmXPؗ:p\u001cP8\u000f\\oR~\u001dq`Vh,?[JWΘ\u0002\u000e\u001b\u05fetyB<3\u0016\u001fdv\u0006\u0003Sm\f5/\u0015E\bq«\u0012]AӔK7W\u0001\u001eg#\f\"]Th\u0015ZvB\u0002\u001a\t_͈&8PК(y\u0002c\\\u0012cGM\u00124:<3)\\Ci1!նE\u0003\u0011ݠrj\u0016!b9t\u0018wG\r\u000f\u0011Rlp\u001eu'Lض\u0001f*ΊYS;=4[r}B\";\r\u000fu\u0010G\u0016ZuO̡\u001a{]ݨ8\u0018 __5\u000e(\u001d&A8\u0012/UL!s\u007fPɟ+\u0001\u0005Ȫ'=nVu\u000e;\u0006:\n\u0003P_V'\"%q!&ϋh\u0006\u0002ӓ^|M\u000eb\u0011,SW\u001e\u001b_LPH|32L(˽s(\u0005ކEE-I$}dD#\u000fuo\u007f0\nb=4#hנ0i\u001e˱zSc`I>\u001ae\rm:$\u001b\u0007\u0019ל=͎\fB\u0011ͩ٨7x"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r#kC+\u0019fo\u0018\u000bq2-r6C:X<iPr{y\u0012n\u001c$", "", "\nh]6g\u0005", "u(E", "\u0012DE\u00166\f8AvkZ>\u0015vz\u0013Dn\u000b", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGEI,bL", "", "5dc\u00118\u001d\"1xxh<\u0019\\h\u0018_q\fZ/c", "u(;.a+K]\u001d}\u000e(+x\u0018+s\u000f2\t@J\"$Gp\u000eIv.3Y\fi5w#.\u0017.Hk5\u001e\"hj7\u0007qj4v;\u001d", "\u0012DE\u00166\f8AvkZ>\u0015vk\u000fIa\u000bj", "5dc\u00118\u001d\"1xxh<\u0019\\h\u0018_b\b_\"c\u0006", "\u0012DE\u00166\f8=\u0006bZG\u001bXw\u0013Oh", "5dc\u00118\u001d\"1xxdK\u0010\\q\u001eAn\fe)", "\u0012DE\u00166\f80tmi>\u0019p\u0003\u0016Ep\bb", "5dc\u00118\u001d\"1xxW:\u001bkh\u001cYy\u000f[1`}", "\u0012DE\u00166\f8;tgj?\bZw\u001fR_\u0015", "", "5dc\u00118\u001d\"1xxb:\u0015li\u000bCn\u0018h m", "\u0012DE\u00166\f8;\u0003]ZE&`g\u000fNn\f\\$`\u0004", "5dc\u00118\u001d\"1xxbH\u000b\\o)I^\bd/dwz'\\", "\u0012DE\u00166\f87\u0007xgH\u0016kh\u000e", "", "5dc\u00118\u001d\"1xx^L&ir\u0019T_\u0007", "\u001aN2\u000eG\u0010(<\u0013eVM\u0010kx\u000eE", "", "5dc\u0019B\n\u001aB|hcX\u0013Xw\u0013To\u0007[", "\u001aN2\u000eG\u0010(<\u0013edG\u000e`w\u001fD_", "5dc\u0019B\n\u001aB|hcX\u0013fq\u0011In\u0018Z ", "\u001dRN\u001b4\u0014\u001e", "5dc\u001cF&'/\u0001^", "\u001dRN#8\u0019,7\u0003g", "5dc\u001cF&/3\u0006l^H\u0015", "\u0010T=\u0011?\f", "5dc\u000fH\u0015\u001d:x", "\u000fO?,I\f+A|hcX\nfg\u000f", "", "5dc\u000eC\u00178DxkhB\u0016e\u0003\rO^\b", "\u000fO?,I\f+A|hcX\u0015Xp\u000f", "5dc\u000eC\u00178DxkhB\u0016e\u0003\u0018Ag\b", "\u0017MB!4\u0015\u001c3\u0013bY", "5dc\u0016A\u001a-/\u0002\\ZX\u0010[", "!DB <\u0016'M|]", "5dc 8\u001a,7\u0003gtB\u000b", "!DB <\u0016'Mt\\iB\u001d\\", "5dc 8\u001a,7\u0003gt:\nkl E", "\u0011Q0 ;&+3\u0004hgM\u0010ej", "5dc\u0010E\b,6\u0013kZI\u0016iw\u0013Na", "\u001cDC$B\u0019$M\bre>", "5dc\u001b8\u001b0=\u0006dtM gh", "\u0017ME\u000e?\u0010\u001d", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Keys {
        public static final int INVALID = -1;
        public static final Keys INSTANCE = new Keys();
        private static final Preferences.Key<Integer> DEVICE_SCREEN_WIDTH = PreferencesKeys.intKey("mt_deviceScreenWidth");
        private static final Preferences.Key<Integer> DEVICE_SCREEN_HEIGHT = PreferencesKeys.intKey("mt_deviceScreenHeight");
        private static final Preferences.Key<Integer> DEVICE_ORIENTATION = PreferencesKeys.intKey("mt_deviceOrientation");
        private static final Preferences.Key<Integer> DEVICE_BATTERY_LEVEL = PreferencesKeys.intKey("mt_deviceBatteryLevel");
        private static final Preferences.Key<String> DEVICE_MANUFACTURER = PreferencesKeys.stringKey("mt_deviceManufacturer");
        private static final Preferences.Key<String> DEVICE_MODEL_IDENTIFIER = PreferencesKeys.stringKey("mt_deviceModelIdentifier");
        private static final Preferences.Key<Boolean> DEVICE_IS_ROOTED = PreferencesKeys.booleanKey("mt_deviceIsRooted");
        private static final Preferences.Key<Double> LOCATION_LATITUDE = PreferencesKeys.doubleKey("mt_locationLatitude");
        private static final Preferences.Key<Double> LOCATION_LONGITUDE = PreferencesKeys.doubleKey("mt_locationLongitude");
        private static final Preferences.Key<String> OS_NAME = PreferencesKeys.stringKey("mt_osName");
        private static final Preferences.Key<String> OS_VERSION = PreferencesKeys.stringKey("mt_osVersion");
        private static final Preferences.Key<String> BUNDLE = PreferencesKeys.stringKey("mt_bundle");
        private static final Preferences.Key<Long> APP_VERSION_CODE = PreferencesKeys.longKey("mt_versionCode");
        private static final Preferences.Key<String> APP_VERSION_NAME = PreferencesKeys.stringKey("mt_versionName");
        private static final Preferences.Key<String> INSTANCE_ID = PreferencesKeys.stringKey("mt_instanceId");
        private static final Preferences.Key<String> SESSION_ID = PreferencesKeys.stringKey("mt_sessionId");
        private static final Preferences.Key<Boolean> SESSION_ACTIVE = PreferencesKeys.booleanKey("mt_sessionActive");
        private static final Preferences.Key<Boolean> CRASH_REPORTING = PreferencesKeys.booleanKey("mt_crashReporting");
        private static final Preferences.Key<String> NETWORK_TYPE = PreferencesKeys.stringKey("mt_networkType");

        private Keys() {
        }

        public final Preferences.Key<Long> getAPP_VERSION_CODE() {
            return APP_VERSION_CODE;
        }

        public final Preferences.Key<String> getAPP_VERSION_NAME() {
            return APP_VERSION_NAME;
        }

        public final Preferences.Key<String> getBUNDLE() {
            return BUNDLE;
        }

        public final Preferences.Key<Boolean> getCRASH_REPORTING() {
            return CRASH_REPORTING;
        }

        public final Preferences.Key<Integer> getDEVICE_BATTERY_LEVEL() {
            return DEVICE_BATTERY_LEVEL;
        }

        public final Preferences.Key<Boolean> getDEVICE_IS_ROOTED() {
            return DEVICE_IS_ROOTED;
        }

        public final Preferences.Key<String> getDEVICE_MANUFACTURER() {
            return DEVICE_MANUFACTURER;
        }

        public final Preferences.Key<String> getDEVICE_MODEL_IDENTIFIER() {
            return DEVICE_MODEL_IDENTIFIER;
        }

        public final Preferences.Key<Integer> getDEVICE_ORIENTATION() {
            return DEVICE_ORIENTATION;
        }

        public final Preferences.Key<Integer> getDEVICE_SCREEN_HEIGHT() {
            return DEVICE_SCREEN_HEIGHT;
        }

        public final Preferences.Key<Integer> getDEVICE_SCREEN_WIDTH() {
            return DEVICE_SCREEN_WIDTH;
        }

        public final Preferences.Key<String> getINSTANCE_ID() {
            return INSTANCE_ID;
        }

        public final Preferences.Key<Double> getLOCATION_LATITUDE() {
            return LOCATION_LATITUDE;
        }

        public final Preferences.Key<Double> getLOCATION_LONGITUDE() {
            return LOCATION_LONGITUDE;
        }

        public final Preferences.Key<String> getNETWORK_TYPE() {
            return NETWORK_TYPE;
        }

        public final Preferences.Key<String> getOS_NAME() {
            return OS_NAME;
        }

        public final Preferences.Key<String> getOS_VERSION() {
            return OS_VERSION;
        }

        public final Preferences.Key<Boolean> getSESSION_ACTIVE() {
            return SESSION_ACTIVE;
        }

        public final Preferences.Key<String> getSESSION_ID() {
            return SESSION_ID;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.MetricsDiskDataSource$clearPreferences$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return MetricsDiskDataSource.this.clearPreferences(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.MetricsDiskDataSource$clearPreferences$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A/&:\u0012\u0010\u0007\u0015k\u007f8"}, d2 = {"\n`]<a@F])\rS", "", ">qT3X9>\\\u0017~\t", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0016]R7h;\u001e\u007fua:\u0007p,Wt'U\""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
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
            mutablePreferences.remove(Keys.INSTANCE.getDEVICE_SCREEN_WIDTH());
            mutablePreferences.remove(Keys.INSTANCE.getDEVICE_SCREEN_HEIGHT());
            mutablePreferences.remove(Keys.INSTANCE.getDEVICE_ORIENTATION());
            mutablePreferences.remove(Keys.INSTANCE.getDEVICE_BATTERY_LEVEL());
            mutablePreferences.remove(Keys.INSTANCE.getDEVICE_MANUFACTURER());
            mutablePreferences.remove(Keys.INSTANCE.getDEVICE_MODEL_IDENTIFIER());
            mutablePreferences.remove(Keys.INSTANCE.getDEVICE_IS_ROOTED());
            mutablePreferences.remove(Keys.INSTANCE.getLOCATION_LATITUDE());
            mutablePreferences.remove(Keys.INSTANCE.getLOCATION_LONGITUDE());
            mutablePreferences.remove(Keys.INSTANCE.getOS_NAME());
            mutablePreferences.remove(Keys.INSTANCE.getOS_VERSION());
            mutablePreferences.remove(Keys.INSTANCE.getBUNDLE());
            mutablePreferences.remove(Keys.INSTANCE.getAPP_VERSION_CODE());
            mutablePreferences.remove(Keys.INSTANCE.getAPP_VERSION_NAME());
            mutablePreferences.remove(Keys.INSTANCE.getINSTANCE_ID());
            mutablePreferences.remove(Keys.INSTANCE.getSESSION_ID());
            mutablePreferences.remove(Keys.INSTANCE.getSESSION_ACTIVE());
            mutablePreferences.remove(Keys.INSTANCE.getCRASH_REPORTING());
            mutablePreferences.remove(Keys.INSTANCE.getNETWORK_TYPE());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11341 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C11341(Continuation<? super C11341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return MetricsDiskDataSource.this.getMetrics(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004W\u00068é6B\r#:ߚ\u0010\u0007\u0015ia6TgX.\u0001TX\u000f\u001c\u007fB&s$ F\u0002]"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaG\\", "3wR2c;B]\"", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11352 extends SuspendLambda implements Function3<FlowCollector<? super Preferences>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C11352(Continuation<? super C11352> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super Preferences> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C11352 c11352 = new C11352(continuation);
            c11352.L$0 = th;
            return c11352.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Utility.devLog(StorageModuleKt.TAG_STORAGE, "reading data: preferences could not be retrieved", (Throwable) this.L$0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004W\u00068é6B\r#:ߚ\u0010\u0007\u0015ia8TiX0hRX\u0010\u001a{d(i&\nCiX`\u0006"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r#kC+\u0019fo\u0018\u0003r($", "3wR2c;B]\"", ""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends SuspendLambda implements Function3<FlowCollector<? super MetricsData>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super MetricsData> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
            anonymousClass4.L$0 = th;
            return anonymousClass4.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Utility.devLog(StorageModuleKt.TAG_STORAGE, "mapping data: Metrics could not be retrieved", (Throwable) this.L$0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.MetricsDiskDataSource$setMetrics$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11361 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C11361(Continuation<? super C11361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MetricsDiskDataSource.this.setMetrics(null, this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.storage.preference.MetricsDiskDataSource$setMetrics$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A/&:\u0012\u0010\u0007\u0015k\u007f8"}, d2 = {"\n`]<a@F])\rS", "", ">qT3X9>\\\u0017~\t", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0016]R7h;\u001e\u007fua:\u0007p,Wt'U\""}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11372 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ MetricsData $metrics;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MetricsDiskDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11372(MetricsData metricsData, MetricsDiskDataSource metricsDiskDataSource, Continuation<? super C11372> continuation) {
            super(2, continuation);
            this.$metrics = metricsData;
            this.this$0 = metricsDiskDataSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11372 c11372 = new C11372(this.$metrics, this.this$0, continuation);
            c11372.L$0 = obj;
            return c11372;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((C11372) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            MetricsData metricsData = this.$metrics;
            MetricsDiskDataSource metricsDiskDataSource = this.this$0;
            mutablePreferences.set(Keys.INSTANCE.getDEVICE_SCREEN_WIDTH(), Boxing.boxInt(metricsData.getDeviceScreenWidth()));
            mutablePreferences.set(Keys.INSTANCE.getDEVICE_SCREEN_HEIGHT(), Boxing.boxInt(metricsData.getDeviceScreenHeight()));
            mutablePreferences.set(Keys.INSTANCE.getDEVICE_ORIENTATION(), Boxing.boxInt(metricsData.getDeviceOrientation()));
            mutablePreferences.set(Keys.INSTANCE.getDEVICE_BATTERY_LEVEL(), Boxing.boxInt(metricsData.getDeviceBatteryLevel()));
            mutablePreferences.set(Keys.INSTANCE.getDEVICE_IS_ROOTED(), Boxing.boxBoolean(metricsData.getDeviceIsRooted()));
            mutablePreferences.set(Keys.INSTANCE.getOS_NAME(), metricsData.getOsName());
            mutablePreferences.set(Keys.INSTANCE.getINSTANCE_ID(), metricsData.getInstanceId());
            mutablePreferences.set(Keys.INSTANCE.getSESSION_ID(), metricsData.getSessionId());
            mutablePreferences.set(Keys.INSTANCE.getSESSION_ACTIVE(), Boxing.boxBoolean(metricsData.getSessionActive()));
            mutablePreferences.set(Keys.INSTANCE.getCRASH_REPORTING(), Boxing.boxBoolean(metricsData.getCrashReportingOptIn()));
            mutablePreferences.set(Keys.INSTANCE.getNETWORK_TYPE(), metricsData.getNetworkType());
            metricsDiskDataSource.setOrRemove(mutablePreferences, Keys.INSTANCE.getDEVICE_MANUFACTURER(), metricsData.getDeviceManufacturer());
            metricsDiskDataSource.setOrRemove(mutablePreferences, Keys.INSTANCE.getDEVICE_MODEL_IDENTIFIER(), metricsData.getDeviceModelIdentifier());
            metricsDiskDataSource.setOrRemove(mutablePreferences, Keys.INSTANCE.getLOCATION_LATITUDE(), metricsData.getLocationLatitude());
            metricsDiskDataSource.setOrRemove(mutablePreferences, Keys.INSTANCE.getLOCATION_LONGITUDE(), metricsData.getLocationLongitude());
            metricsDiskDataSource.setOrRemove(mutablePreferences, Keys.INSTANCE.getOS_VERSION(), metricsData.getOsVersion());
            metricsDiskDataSource.setOrRemove(mutablePreferences, Keys.INSTANCE.getBUNDLE(), metricsData.getBundle());
            AppVersion appVersion = metricsData.getAppVersion();
            if (appVersion != null) {
                mutablePreferences.set(Keys.INSTANCE.getAPP_VERSION_CODE(), Boxing.boxLong(appVersion.getVersionCode()));
                metricsDiskDataSource.setOrRemove(mutablePreferences, Keys.INSTANCE.getAPP_VERSION_NAME(), appVersion.getVersionName());
            } else {
                mutablePreferences.remove(Keys.INSTANCE.getAPP_VERSION_CODE());
                mutablePreferences.remove(Keys.INSTANCE.getAPP_VERSION_NAME());
            }
            return Unit.INSTANCE;
        }
    }

    public MetricsDiskDataSource(DataStore<Preferences> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    public final AppVersion createAppVersion(Long l2, String str) {
        if (l2 == null || l2.longValue() < 1) {
            return null;
        }
        return new AppVersion(l2.longValue(), str);
    }

    public final <T> void setOrRemove(MutablePreferences mutablePreferences, Preferences.Key<T> key, T t2) {
        if (t2 != null) {
            mutablePreferences.set(key, t2);
        } else {
            mutablePreferences.remove(key);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object clearPreferences(kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.dynatrace.agent.storage.preference.MetricsDiskDataSource.AnonymousClass1
            if (r0 == 0) goto L2a
            r6 = r8
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$clearPreferences$1 r6 = (com.dynatrace.agent.storage.preference.MetricsDiskDataSource.AnonymousClass1) r6
            int r0 = r6.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L2a
            int r0 = r6.label
            int r0 = r0 - r2
            r6.label = r0
        L19:
            java.lang.Object r1 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            java.lang.String r4 = "dtxStorage"
            r3 = 1
            if (r0 == 0) goto L3c
            if (r0 != r3) goto L34
            goto L30
        L2a:
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$clearPreferences$1 r6 = new com.dynatrace.agent.storage.preference.MetricsDiskDataSource$clearPreferences$1
            r6.<init>(r8)
            goto L19
        L30:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L58
            goto L61
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3c:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.String r0 = "metrics preferences are cleared"
            com.dynatrace.android.agent.util.Utility.devLog(r4, r0)
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r2 = r7.dataStore     // Catch: java.lang.Exception -> L58
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$clearPreferences$2 r1 = new com.dynatrace.agent.storage.preference.MetricsDiskDataSource$clearPreferences$2     // Catch: java.lang.Exception -> L58
            r0 = 0
            r1.<init>(r0)     // Catch: java.lang.Exception -> L58
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: java.lang.Exception -> L58
            r6.label = r3     // Catch: java.lang.Exception -> L58
            java.lang.Object r0 = androidx.datastore.preferences.core.PreferencesKt.edit(r2, r1, r6)     // Catch: java.lang.Exception -> L58
            if (r0 != r5) goto L61
            return r5
        L58:
            r1 = move-exception
            java.lang.String r0 = "metrics preferences can't be cleared"
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.dynatrace.android.agent.util.Utility.devLog(r4, r0, r1)
        L61:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.preference.MetricsDiskDataSource.clearPreferences(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getMetrics(kotlin.coroutines.Continuation<? super com.dynatrace.agent.storage.preference.MetricsData> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.dynatrace.agent.storage.preference.MetricsDiskDataSource.C11341
            if (r0 == 0) goto L22
            r5 = r7
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$1 r5 = (com.dynatrace.agent.storage.preference.MetricsDiskDataSource.C11341) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L22
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L30
            if (r0 != r2) goto L28
            goto L5f
        L22:
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$1 r5 = new com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$1
            r5.<init>(r7)
            goto L13
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            kotlin.ResultKt.throwOnFailure(r1)
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r0 = r6.dataStore     // Catch: java.lang.Exception -> L66
            kotlinx.coroutines.flow.Flow r1 = r0.getData()     // Catch: java.lang.Exception -> L66
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$2 r0 = new com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$2     // Catch: java.lang.Exception -> L66
            r0.<init>(r3)     // Catch: java.lang.Exception -> L66
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0     // Catch: java.lang.Exception -> L66
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.m10520catch(r1, r0)     // Catch: java.lang.Exception -> L66
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$$inlined$map$1 r1 = new com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$$inlined$map$1     // Catch: java.lang.Exception -> L66
            r1.<init>()     // Catch: java.lang.Exception -> L66
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1     // Catch: java.lang.Exception -> L66
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$4 r0 = new com.dynatrace.agent.storage.preference.MetricsDiskDataSource$getMetrics$4     // Catch: java.lang.Exception -> L66
            r0.<init>(r3)     // Catch: java.lang.Exception -> L66
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0     // Catch: java.lang.Exception -> L66
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.m10520catch(r1, r0)     // Catch: java.lang.Exception -> L66
            r5.label = r2     // Catch: java.lang.Exception -> L66
            java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.first(r0, r5)     // Catch: java.lang.Exception -> L66
            if (r1 != r4) goto L62
            return r4
        L5f:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L66
        L62:
            com.dynatrace.agent.storage.preference.MetricsData r1 = (com.dynatrace.agent.storage.preference.MetricsData) r1     // Catch: java.lang.Exception -> L66
            r3 = r1
            goto L72
        L66:
            r2 = move-exception
            java.lang.String r1 = "there is no metrics available"
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r0 = "dtxStorage"
            com.dynatrace.android.agent.util.Utility.devLog(r0, r1, r2)
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.preference.MetricsDiskDataSource.getMetrics(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object setMetrics(com.dynatrace.agent.storage.preference.MetricsData r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.dynatrace.agent.storage.preference.MetricsDiskDataSource.C11361
            if (r0 == 0) goto L24
            r6 = r9
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$setMetrics$1 r6 = (com.dynatrace.agent.storage.preference.MetricsDiskDataSource.C11361) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L24
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r1 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            java.lang.String r4 = "dtxStorage"
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 != r3) goto L2e
            goto L2a
        L24:
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$setMetrics$1 r6 = new com.dynatrace.agent.storage.preference.MetricsDiskDataSource$setMetrics$1
            r6.<init>(r9)
            goto L13
        L2a:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L5f
            goto L68
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "metrics are updated: "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r8)
            java.lang.String r0 = r0.toString()
            com.dynatrace.android.agent.util.Utility.devLog(r4, r0)
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r2 = r7.dataStore     // Catch: java.lang.Exception -> L5f
            com.dynatrace.agent.storage.preference.MetricsDiskDataSource$setMetrics$2 r1 = new com.dynatrace.agent.storage.preference.MetricsDiskDataSource$setMetrics$2     // Catch: java.lang.Exception -> L5f
            r0 = 0
            r1.<init>(r8, r7, r0)     // Catch: java.lang.Exception -> L5f
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: java.lang.Exception -> L5f
            r6.label = r3     // Catch: java.lang.Exception -> L5f
            java.lang.Object r0 = androidx.datastore.preferences.core.PreferencesKt.edit(r2, r1, r6)     // Catch: java.lang.Exception -> L5f
            if (r0 != r5) goto L68
            return r5
        L5f:
            r1 = move-exception
            java.lang.String r0 = "metrics preferences can't be stored"
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            com.dynatrace.android.agent.util.Utility.devLog(r4, r0, r1)
        L68:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.storage.preference.MetricsDiskDataSource.setMetrics(com.dynatrace.agent.storage.preference.MetricsData, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
