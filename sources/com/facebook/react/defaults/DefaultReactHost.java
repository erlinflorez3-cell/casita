package com.facebook.react.defaults;

import android.content.Context;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.runtime.JSCInstance;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.cxxreactpackage.CxxReactPackage;
import com.facebook.react.runtime.hermes.HermesInstance;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ZeP\u008cZS8-s{J$cҕyCIa\"}(\nWNupvJ`\u000bK\u000f\u001c\u0016\u0001jBI]xs\u0012\u0017˰HŪ?Iݹ =g_5;\u000b ݨ&8\b\u0005I08K(v)E{\u0010 4XphW=Q\u0013 *\u0006l'G#%T\\9`l\f<_'\u0011mZNUd`\u0007[\u0015^Z7\u000f\u0007aL5n@e\u001b+S\u0011\u0012j[m\u000fowC\u0005v4?+w\u007f\b>^\u007f\"#CQ#\\!2\r\u000bW`\u001a6CO\u0012[\u0001\u0014.w\t\r%<2\u001e6?N.;,~\u001a\u001eA\u0005~cB`\u0002\rV\u0010|q6E:.FYBak\"oI\u001af9\u0012\u0004; yЪzĲ_T\u0016֫ڦ\u001fj"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001\u0018\u0013Wv\u001dJ@\u00045Zy0>|\u0003.IAJN>,$>", "", "u(E", "@dP0g\u000fHa(", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VR\u0018J\u0006z", "5dc\u0011X-:c \u000eg^(z\u0018\u0012o\u000e7", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "@dP0g\u0015:b\u001d\u0010zA6\u000b\u0018", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VX\nKz65<\b.FC", ">`R8T.>:\u001d\r\n", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VZ\n:|!7YS", "8r<.\\5&]\u0018\u000f\u0002^\u0017x\u00182", "", "8r1Ba+ESt\r\t^;g\u0005>h", "8r1Ba+ESy\u0003\u0002^\u0017x\u00182", "7r72e4>ax\bv[3|\b", "", "CrT\u0011X=,c$\n\u0005k;", "1wg\u001fX(<b\u0004zxd(~\t\u001ar\n9\u007f?\u0001$%", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006t8Hf}\u001c5|!*KI7m4gr{t&\u0007_*]a#ERJ.\\(", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DefaultReactHost {
    public static final DefaultReactHost INSTANCE = new DefaultReactHost();
    private static ReactHost reactHost = null;

    private DefaultReactHost() {
    }

    @JvmStatic
    public static final ReactHost getDefaultReactHost(Context context, ReactNativeHost reactNativeHost) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactNativeHost, "reactNativeHost");
        if (reactNativeHost instanceof DefaultReactNativeHost) {
            return ((DefaultReactNativeHost) reactNativeHost).toReactHost$ReactAndroid_release(context);
        }
        throw new IllegalArgumentException("You can call getDefaultReactHost only with instances of DefaultReactNativeHost".toString());
    }

    @JvmStatic
    public static final ReactHost getDefaultReactHost(Context context, List<? extends ReactPackage> packageList, String jsMainModulePath, String jsBundleAssetPath, String str, boolean z2, boolean z3, List<? extends Function1<? super ReactContext, ? extends CxxReactPackage>> cxxReactPackageProviders) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageList, "packageList");
        Intrinsics.checkNotNullParameter(jsMainModulePath, "jsMainModulePath");
        Intrinsics.checkNotNullParameter(jsBundleAssetPath, "jsBundleAssetPath");
        Intrinsics.checkNotNullParameter(cxxReactPackageProviders, "cxxReactPackageProviders");
        if (reactHost == null) {
            JSBundleLoader jSBundleLoaderCreateAssetLoader = str != null ? StringsKt.startsWith$default(str, "assets://", false, 2, (Object) null) ? JSBundleLoader.createAssetLoader(context, str, true) : JSBundleLoader.createFileLoader(str) : JSBundleLoader.createAssetLoader(context, "assets://" + jsBundleAssetPath, true);
            JSRuntimeFactory hermesInstance = z2 ? new HermesInstance() : new JSCInstance();
            DefaultTurboModuleManagerDelegate.Builder builder = new DefaultTurboModuleManagerDelegate.Builder();
            Iterator<T> it = cxxReactPackageProviders.iterator();
            while (it.hasNext()) {
                builder.addCxxReactPackage((Function1<? super ReactApplicationContext, ? extends CxxReactPackage>) it.next());
            }
            Intrinsics.checkNotNull(jSBundleLoaderCreateAssetLoader);
            DefaultReactHostDelegate defaultReactHostDelegate = new DefaultReactHostDelegate(jsMainModulePath, jSBundleLoaderCreateAssetLoader, packageList, hermesInstance, null, null, null, builder, PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, null);
            ComponentFactory componentFactory = new ComponentFactory();
            DefaultComponentsRegistry.register(componentFactory);
            reactHost = new ReactHostImpl(context, defaultReactHostDelegate, componentFactory, true, z3);
        }
        ReactHost reactHost2 = reactHost;
        Intrinsics.checkNotNull(reactHost2, "null cannot be cast to non-null type com.facebook.react.ReactHost");
        return reactHost2;
    }

    public static /* synthetic */ ReactHost getDefaultReactHost$default(Context context, List list, String str, String str2, String str3, boolean z2, boolean z3, List list2, int i2, Object obj) {
        List listEmptyList = list2;
        String str4 = str;
        boolean z4 = z2;
        String str5 = str3;
        boolean z5 = z3;
        int i3 = (-1) - (((-1) - i2) | ((-1) - 4));
        String str6 = FirebaseAnalytics.Param.INDEX;
        if (i3 != 0) {
            str4 = FirebaseAnalytics.Param.INDEX;
        }
        if ((i2 & 8) == 0) {
            str6 = str2;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            str5 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            z4 = true;
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            z5 = ReactBuildConfig.DEBUG;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return getDefaultReactHost(context, list, str4, str6, str5, z4, z5, listEmptyList);
    }
}
