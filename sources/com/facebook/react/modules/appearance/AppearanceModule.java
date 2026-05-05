package com.facebook.react.modules.appearance;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatDelegate;
import com.facebook.fbreact.specs.NativeAppearanceSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.google.firebase.ktx.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.InterfaceC1492Gx;
import yg.Qg;
import yg.Wg;
import yg.ZN;

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
@ReactModule(name = "\u0001/.\"\u001d-\u001b'\u001b\u001c")
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG<L͜P.`S2\u000fq|<$q$yCAZ\"}0\rWNmjtOpŏa&6\u0016'idIl\u0011\u001e+\u00157RsM3eok:p|<\u0005.4::\u0010\u0004/\u001dݵL\u0010\u0005~\fY\u001a\u0019H@\u001fB\u0003\u0011[\u000e2\u00124Df\u0015fjuXNH\u001bcj31\u000e\u0002B|3&0EY\u001bSl';~\u0012\"9NO5C+\u001c\t\u0015as?1E8QMt57CI\"_f\\\u000e%-+}\u0019&\u00014n\u001dQ\u000f\u0014W/]vcP<<>\u000fD\u001bJ\u0019&\u0006UP^1(| \u000eaz9g\u0011^\u0010cZ\u0002\u0011`d\u001d{ı?ڢ=\u001bnϟ2I'PO}\u001b\fL&W͜#ƟX\u000ehٽúX\u0011"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006r0@Yy-3v\u0014.\u0017\u001fFv4\u001a\"dj7\u0007K6M\u0007.G\"", "\u001ab^:\"-:Q\u0019{\u0005h2F\n,r\u007f$yOJ%\"Gm\u001c\u0006_!D]\u000f \u0013x!.IP7t2\u001e\u0003sa7\\", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "=uT?e0=Sv\t\u0002h9j\u00072e\b(", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006r0@Yy-3v\u0014.\u0017\u001fFv4\u001a\"dj7\u0007K6M\u0007.G\u000b8=\\_\u007fA\u0013\u00128\u0018U5\u001arWD$vD\r", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$]%QT\u0018-XPr:\u001e\u001c`W[+\t\u0003h\u000b,xCG&\b:\u0013}Fs\u0001\b#\n>hp\f2\u001bRy\u0011\u0003=2fFAixWHE!\u0014u\fl*`9:\u0002\u001ex#(VN1\n\u0004Sf6C", ":`bA84Bb(~y<6\u0004\u0013<S}+{H\u0001", "", "/cS\u0019\\:MS\"~\b", "", "3uT;g\u0015:[\u0019", "1n[<e\u001a<V\u0019\u0007z?6\nf?r\r(\u0005O^! Hs\u0010L\u0004!D]\b)", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "3lXA47IS\u0015\fvg*|f2a\t*{?", "1n[<e\u001a<V\u0019\u0007z", "5dc\u0010b3H`\u0007|}^4|", "=m2<a-BU)\fvm0\u0007\u0012\rh{1}@\u007f", "1ta?X5M1#\b\n^?\f", "@d\\<i,%W'\u000ezg,\n\u0017", "1nd;g", "", "Adc\u0010b3H`\u0007|}^4|", "Ash9X", "\u0011n\\=T5B]\"", "\u001duT?e0=Sv\t\u0002h9j\u00072e\b(", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AppearanceModule extends NativeAppearanceSpec {
    private static final String APPEARANCE_CHANGED_EVENT_NAME = "appearanceChanged";
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "Appearance";
    private String lastEmittedColorScheme;
    private final OverrideColorScheme overrideColorScheme;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈ƪ6F"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006r0@Yy-3v\u0014.\u0017\u001fFv4\u001a\"dj7\u0007K6M\u0007.G\u000b,6d]nF\u0018\u001ccc", "", "u(E", "\u000fO?\u00124\u0019\u001a<v^t<\u000fXq\u0011E^\"[1`\u007f\u0006AXi$V", "", "\u001c@<\u0012", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u000eӵLш|\u0004O\u00128é4ɷպ!Bߚ(\u0007\u0015i\u00026Re`.\u0001Tp3ԿzéŜ[(yEAtH|͆\rQɟkf"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006r0@Yy-3v\u0014.\u0017\u001fFv4\u001a\"dj7\u0007K6M\u0007.G\u000b8=\\_\u007fA\u0013\u00128\u0018U5\u001arWD$vD\r", "", "5dc V/>[\u0019", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface OverrideColorScheme {
        String getScheme();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppearanceModule(ReactApplicationContext reactContext) {
        this(reactContext, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppearanceModule(ReactApplicationContext reactContext, OverrideColorScheme overrideColorScheme) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.overrideColorScheme = overrideColorScheme;
    }

    public /* synthetic */ AppearanceModule(ReactApplicationContext reactApplicationContext, OverrideColorScheme overrideColorScheme, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : overrideColorScheme);
    }

    private final String colorSchemeForCurrentConfiguration(Context context) throws Throwable {
        OverrideColorScheme overrideColorScheme = this.overrideColorScheme;
        if (overrideColorScheme != null) {
            return overrideColorScheme.getScheme();
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("G!rJ\u0003F\u001c/ \u0006P\u0010K2\u007fvc\\\u0013f/\u0010C", (short) (ZN.Xd() ^ 23200), (short) (ZN.Xd() ^ 1200))).getMethod(C1561oA.Xd("nm}\\p\u007f|\u0004\u0002sv\u0006", (short) (C1499aX.Xd() ^ (-28869))), new Class[0]);
        try {
            method.setAccessible(true);
            int i2 = (-1) - (((-1) - ((Resources) method.invoke(context, objArr)).getConfiguration().uiMode) | ((-1) - 48));
            String strVd = Wg.vd("db]_p", (short) (C1580rY.Xd() ^ (-29916)));
            return (i2 == 16 || i2 != 32) ? strVd : Qg.kd("miyq", (short) (ZN.Xd() ^ 32033), (short) (ZN.Xd() ^ 11341));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void addListener(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    public final void emitAppearanceChanged(String colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("colorScheme", colorScheme);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent(APPEARANCE_CHANGED_EVENT_NAME, writableMapCreateMap);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public String getColorScheme() {
        ContextWrapper currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = getReactApplicationContext();
        }
        ContextWrapper contextWrapper = currentActivity;
        Intrinsics.checkNotNull(contextWrapper);
        return colorSchemeForCurrentConfiguration(contextWrapper);
    }

    public final void onConfigurationChanged(Context currentContext) {
        Intrinsics.checkNotNullParameter(currentContext, "currentContext");
        String strColorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(currentContext);
        if (Intrinsics.areEqual(this.lastEmittedColorScheme, strColorSchemeForCurrentConfiguration)) {
            return;
        }
        this.lastEmittedColorScheme = strColorSchemeForCurrentConfiguration;
        emitAppearanceChanged(strColorSchemeForCurrentConfiguration);
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void removeListeners(double d2) {
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void setColorScheme(String style) {
        Intrinsics.checkNotNullParameter(style, "style");
        int iHashCode = style.hashCode();
        if (iHashCode == -1626174665) {
            if (style.equals(BuildConfig.VERSION_NAME)) {
                AppCompatDelegate.setDefaultNightMode(-1);
            }
        } else if (iHashCode == 3075958) {
            if (style.equals("dark")) {
                AppCompatDelegate.setDefaultNightMode(2);
            }
        } else if (iHashCode == 102970646 && style.equals("light")) {
            AppCompatDelegate.setDefaultNightMode(1);
        }
    }
}
