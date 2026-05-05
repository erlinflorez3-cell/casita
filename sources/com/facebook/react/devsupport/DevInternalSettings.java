package com.facebook.react.devsupport;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0LeV7ZS0&s{J$c$wDCU0}*ޛWNugvϺb\u000bQ\u001b\u000e\u0016~n2կkތ{??2pno3{ou9\u000e#v\u001a0609\u0012\u0005/\u001c:N\u001ey\u0013Ea\u000b@4Ϯt:`\u0012\u0016\u0013(8\u001e>N(N`uvNH\u001b\u0007\u0001Ck\u001bwlf'\u000eW-Q\u001bql';\u001c\u0012$9lO7+$\u0002,Mf,a\u0011G\n=3oW+9O\fWd_6hS\u007f&լię*f\u001dSf\u001454oeQZ\u001c3H\u0013\n\u0019T\u0004<\r}ε:ǉ\u001er\u0010ԄKvx_NY\"`H\r\tl\u000793\u000fK+g\"\u0017UoI1Ne\u0003;a\\wWͰ-ƟX\u0018x\u0017!c\u0006ZQSFMVYZ{K~\u001cp\u0011\tZ\b>U\u0018/*\u0018dkc\f2ޔ/\u074co\f`Fm\b\u0013i\tUodVKr\u0011$KB\t:ath\u0013~hT\u00073G\"Z)]ù\u0014˙$f\u0010>'9\u001eWojo\u007f[hZG=|OY\u001dr>[GlK5\u007fjF6\u0011Kj͊HИ\tb~DY\"heH$8_x\u001bH\u001eRf$\u0013`F\" B2I\u0019\u000b\u001c~W\\\u0017\u0018Ҩ\u0015ރ^r(\u0001ZK2\f\n&z\"\u000f[-\u0013}\u0002\u0011IZ\u0004\u0011&;Oi5G-\fv'\tSɔ\u0013ҋw\n_iRaZu6w[\u0017.!j[_KU\u0013=\u0006_F@A\u001cɻ~ϯU_\u001a\u05fd\u000b~\u007f,I\u0007Fi\u000e\u0007~5\u0001lPnb\"r\u0005lu;\nz~(e\u001dڬIϭX\u000bcŬ\u001a\u0005\u0011yTNf\u001e[ȫ ݵ\u0005u*ĜM/II+9H =9y]\u0018\u0015\u0005ӣdϪ*tmֽУgE"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~8}1\u001bv%.ZL7r\"\u001e$weB\tq\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006u%2i\u007fi;v%.ZD7i4,^GaJ\u0007j6Yv45L];`[tKi", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.uW\u001f\u001cP?Hk3\t\"hb9\u0014c5Lv\u0005JHW.\\9vK#\u0012c\u000e[\u0001", "/o_9\\*:b\u001d\t\u0004<6\u0006\u0018/x\u000f", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ":hbAX5>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~8}1\u001bv%.ZL7r\"\u001e$weB\tqj5z5VLW,i(", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~Zy\u001e7j 8S\rHk0\u001c$2`9\u0018q<Y\u00021T[\u0018\u000b\\cVF#\u0012g\u0017J2z\u0005hP(wFE]n0W\u0011;q\u0001\u0019kQ&", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzKo", "", "7r0;\\4:b\u001d\t\u0004?7\u000bg/b\u0010*[I|\u0014\u001eGn", "u(I", "Adc\u000ea0FO(\u0003\u0005g\r\b\u0017\u000ee|8} \n\u0013\u0014No\r", "uY\u0018#", "7r32i0<Sw~wn.\\\u0012+b\u0007(z", "Adc\u0011X=BQ\u0019]z[<~h8a|/{?", "D`[BX", "7r49X4>\\(b\u0004l7|\u0007>o\r\b\u0005<}\u001e\u0017F", "Adc\u0012_,FS\"\u000e^g:\b\t-t\n5[I|\u0014\u001eGn", "7r5=f\u000b>P)\u0001Zg(y\u0010/d", "Adc\u0013c:\u001dS\u0016\u000f|>5x\u00066e~", "3mP/_,=", "7r7<g\u0014HR)\u0006zK,\b\u0010+c\u007f0{I\u0010v Cl\u0015<u", "Adc\u0015b;&]\u0018\u000f\u0002^\u0019|\u00146a}(\u0004@\n&vPk\u000bCv$", "7r9 7,O;#}z>5x\u00066e~", "Adc\u0017F\u000b>d\u0001\ty^\f\u0006\u0005,l\u007f'", "7r9 @0GW\u001a\u0013Zg(y\u0010/d", "Adc\u0017F\u0014B\\\u001d\u007f\u000f>5x\u00066e~", "7rA2`6MS}lY^)\r\u000b\u000fn{%\u0003@\u007f", "Adc\u001fX4Hb\u0019ch=,y\u00191E\t$xG\u0001\u0016", "7rBAT9MA\u0015\u0007\u0006e0\u0006\u000b\u001ar\n)\u007fG\u0001$\u0001PS\u0017@\u0006", "7rBAT9MA\u0015\u0007\u0006e0\u0006\u000b\u001ar\n)\u007fG\u0001$\u0001PS\u0017@\u0006c1b\u0007*Fi%2WLI", "u(E", "Adc g(Kb\u0007z\u0003i3\u0001\u00121P\r2|D\b\u0017$1xqEz4", ">`R8T.>`v\t\u0004g,z\u00183o\t\u0016{O\u0010\u001b I}", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EK|\u0015\u001dCq\u000eIt/>b}\u001eFq 7\u0017.7i:\u001a\u0017hn\u0017\u0011l5Nt6KVW\u001a\\a\u0002A\u001d\u0014hc", "5dc\u001dT*DO\u001b~\b<6\u0006\u0012/c\u000f,\u0006In\u0017&Vs\u0017>\u0005", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\"\u0013Eu\n>v23c\u0007)7k%2WL\u0005V0\u001c\u001bdc9\u0014A6W\u007f'E[R6e@rL#\u0016c\u0010\\\u0001", ">qT3X9>\\\u0017~\t", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "/cS\u001aX5N7(~\u0003", "", "Bhc9X", "", "=mB5T9>R\u0004\fz_,\n\t8c\u007f\u0006~<\n\u0019\u0017F", "AgP?X+)`\u0019\u007fzk,\u0006\u0007/s", "9dh", "\u0011n\\=T5B]\"", "\u001ahbAX5>`", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DevInternalSettings implements DeveloperSettings, SharedPreferences.OnSharedPreferenceChangeListener {
    public static final Companion Companion = new Companion(null);
    private static final String PREFS_ANIMATIONS_DEBUG_KEY = "animations_debug";
    private static final String PREFS_FPS_DEBUG_KEY = "fps_debug";
    private static final String PREFS_HOT_MODULE_REPLACEMENT_KEY = "hot_module_replacement";
    private static final String PREFS_INSPECTOR_DEBUG_KEY = "inspector_debug";
    private static final String PREFS_JS_DEV_MODE_DEBUG_KEY = "js_dev_mode_debug";
    private static final String PREFS_JS_MINIFY_DEBUG_KEY = "js_minify_debug";
    private static final String PREFS_REMOTE_JS_DEBUG_KEY = "remote_js_debug";
    private boolean isDeviceDebugEnabled;
    private boolean isStartSamplingProfilerOnInit;
    private final Listener listener;
    private final PackagerConnectionSettings packagerConnectionSettings;
    private final SharedPreferences preferences;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005'2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈_>PsW3{q\u0014ʣ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͏MŲO\f\u001aؓ\u0011|HX%M3\u001châ\u0011ŋ\u0005\u001edɡ\u001fBVsu:]%Y݆\u0015Ě+_8ŧ\u001e\u0019T\\?\r%ctѫ\u0013˝9\u0015-مα\u000b["}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~8}1\u001bv%.ZL7r\"\u001e$weB\tqj,\u0001/RHW0f[H", "", "u(E", "\u001eQ4\u0013F&\u001a<|fVM\u0010fq\u001d_^\bX0b\u0011|'c", "", "\u001eQ4\u0013F&\u001f>\u0007xY>\tlj)K_\u001c", "\u001eQ4\u0013F&!=\bxbH\u000blo\u000f_l\bf'\\tv/Ov+p\u000b\u0015M", "\u001eQ4\u0013F&\"<\u0007iZ<\u001bfu)D_\u0005k\"z|v;", "\u001eQ4\u0013F&#A\u0013]ZO&dr\u000eEy\u0007[\u001dpx\u0011-O\u0002", "\u001eQ4\u0013F&#A\u0013f^G\u0010]|)D_\u0005k\"z|v;", "\u001eQ4\u0013F&+3\u0001hi>&av)D_\u0005k\"z|v;", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u000eӵLш|\u0004O\u00068é4'\u0015Ӭ\\\u0012&\u0006/pG0\\ev/\u0019w\u05ec\u000eӆڗ4(c&wbiTۥ\u0002$ߜSM"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~8}1\u001bv%.ZL7r\"\u001e$weB\tqj5z5VLW,i(", "", "=m8;g,K\\\u0015\u0006h^;\f\r8g\u000e\u0006~<\n\u0019\u0017F", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface Listener {
        void onInternalSettingsChanged();
    }

    public DevInternalSettings(Context applicationContext, Listener listener) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.listener = listener;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.preferences = defaultSharedPreferences;
        this.packagerConnectionSettings = new PackagerConnectionSettings(applicationContext);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.isDeviceDebugEnabled = ReactBuildConfig.DEBUG;
    }

    @Deprecated(message = "\u000fK\u00036t\u000eTjYT8\u0007Y#3\u000el^\u0018-\u000et\u0011d6O\u0002*\\\u0004crwZkG_\u001c{NV.BL&[P9n\u0018<CnQs\u0018\u0015L HZ\u000e=\u000e~Kq<[]\u0003\tl8\r\u007f\b\u0019M:33)4g/)T0w\u0012%5q\u0012f|")
    @InterfaceC1492Gx
    public static /* synthetic */ void isStartSamplingProfilerOnInit$annotations() {
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void addMenuItem(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public PackagerConnectionSettings getPackagerConnectionSettings() {
        return this.packagerConnectionSettings;
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isAnimationFpsDebugEnabled() {
        return this.preferences.getBoolean(PREFS_ANIMATIONS_DEBUG_KEY, false);
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isDeviceDebugEnabled() {
        return this.isDeviceDebugEnabled;
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isElementInspectorEnabled() {
        return this.preferences.getBoolean(PREFS_INSPECTOR_DEBUG_KEY, false);
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isFpsDebugEnabled() {
        return this.preferences.getBoolean(PREFS_FPS_DEBUG_KEY, false);
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isHotModuleReplacementEnabled() {
        return this.preferences.getBoolean(PREFS_HOT_MODULE_REPLACEMENT_KEY, true);
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isJSDevModeEnabled() {
        return this.preferences.getBoolean(PREFS_JS_DEV_MODE_DEBUG_KEY, true);
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isJSMinifyEnabled() {
        return this.preferences.getBoolean(PREFS_JS_MINIFY_DEBUG_KEY, false);
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isRemoteJSDebugEnabled() {
        return this.preferences.getBoolean(PREFS_REMOTE_JS_DEBUG_KEY, false);
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isStartSamplingProfilerOnInit() {
        return this.isStartSamplingProfilerOnInit;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        if (this.listener != null) {
            if (Intrinsics.areEqual(PREFS_FPS_DEBUG_KEY, str) || Intrinsics.areEqual(PREFS_JS_DEV_MODE_DEBUG_KEY, str) || Intrinsics.areEqual(PREFS_JS_MINIFY_DEBUG_KEY, str)) {
                this.listener.onInternalSettingsChanged();
            }
        }
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setAnimationFpsDebugEnabled(boolean z2) {
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setDeviceDebugEnabled(boolean z2) {
        this.isDeviceDebugEnabled = z2;
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setElementInspectorEnabled(boolean z2) {
        this.preferences.edit().putBoolean(PREFS_INSPECTOR_DEBUG_KEY, z2).apply();
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setFpsDebugEnabled(boolean z2) {
        this.preferences.edit().putBoolean(PREFS_FPS_DEBUG_KEY, z2).apply();
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setHotModuleReplacementEnabled(boolean z2) {
        this.preferences.edit().putBoolean(PREFS_HOT_MODULE_REPLACEMENT_KEY, z2).apply();
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setJSDevModeEnabled(boolean z2) {
        this.preferences.edit().putBoolean(PREFS_JS_DEV_MODE_DEBUG_KEY, z2).apply();
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setJSMinifyEnabled(boolean z2) {
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setRemoteJSDebugEnabled(boolean z2) {
        this.preferences.edit().putBoolean(PREFS_REMOTE_JS_DEBUG_KEY, z2).apply();
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setStartSamplingProfilerOnInit(boolean z2) {
        this.isStartSamplingProfilerOnInit = z2;
    }
}
