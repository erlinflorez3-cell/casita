package com.swmansion.rnscreens.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.PixelUtil;
import com.google.android.material.appbar.AppBarLayout;
import com.swmansion.rnscreens.ScreenStackHeaderConfig;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{B*cҕyCIZ\"Ԃ*\teNo˧vJh\u0014KƤ\u000e\u0016\u000fj4կ]xs\u0012\u00172HqG3[oEʠhtL\u0005(2(;\u0002\u0005\u0017\u001a2H\u0016v\u0003Ca\f\u001a0N\u0081BR\u0013M\u000b\u0019(ß\\F1\u001e\u000bf\u00075n-hJ31\u0003\u0002B|(ۢ4|[\u000f\u000fj5\"\u000faL7p;C+=S1\u0011\u0003_M\u001aWqk\u0015/(o9W\fo6\u0007\u0019D\u00199i%]!A#\u0005\u001an\u001aCCO\u0012[\u0001\u00126w\u0013{;=J\u000eN-VKE\u001a\u0015!TG=xa^h\u0002\r[F\u000f*<%D\u00183YRaz\u001agI9f7*&S\u001ek\u0019|CsT<aE)Zw_TiHMJ^\n\bb\u0004\u0003\u001f\u0007H*T<U\u0003G{?2m©c٦=#)ǽRTRl\u000f\u0005\u000fn*֢^͕D\"vݫ\b6\u0017\u0013rD\u0013\rB¯\u0001г0\u0011Uȼ%\u0013\f\u0011+ \u000b\u0002\u0013Ɯ1ŎROpȉ;Yk\u0015=/\u0015C0ʧwް[9fڨ\u0006]q\u001dyR%\"\u0016ֽ\u000fۖ\\fJͭ\\fj7:2vzfǱ\bΌR\f\u001bԵ\u0010\u0004*ED7)^%H1\u001fpSSȄk˖l\u0010\u0007Ԟ\u00040\u0011|<t7\u0015'ʗ\u001d״kxQؓʲdI"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011\u007f\u001d@}3~G{-7m\u001f\r]KC\u007f\u001b\u001a)rqHic3Yv4\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW#z&5W\u0012\u001e>mu?MLJR8,$hj9\u00149", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "/o_\u000fT9%O-\t\u000bm", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EH|&\u0017Ts\nC@!@dz\u001cD7q9X 7x\u001b\u001a)rqH\\", "1`R5X", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011\u007f\u001d@}3~7y\u001e:mu7\\POA", "1n^?W0GO(\t\bE(\u0011\u0013?t", "\u001a`]1e6BR,Hxh6\n\b3n{7\u0006M\b\u0013+Q\u007f\u001d\u0006\t)4[}/\u0001K 8ZB?t0-\u001fuH5\u001bm<]L", "2dU.h3M1#\b\n^5\fl8s\u007f7iO|$&9s\u001d?_!F]\u007f\u001cFq 7", "", "2dU.h3M4#\b\nL0\u0012\t", "", "2t\\:l\nH\\(~\u0004m\u001d\u0001\tA", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7r;.l6Nb|\b~m0x\u00103z\u007f'", "", "@dP0g\nH\\(~\u000em\u0019|\n", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "Bn^9U(K", "\u001a`]1e6BR,Hvi7z\u00137p{7ER\u0005\u0016\u0019G~W+\u0001/<Vy-\r", "1n\\=h;>2)\u0007\u0003r\u0013x\u001d9u\u000f", "4n]AF0SS", "7rC6g3>3!\n\nr", "7mXA7<F[-evr6\r\u0018!i\u000f+^@|\u0016\u0017T", "", "1n]AX?ME\u001d\u000e}M/|\u0011/", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ";`h/X\u0010GW(]\u000bf4\u0011o+y\n8\u000b2\u0005&\u001a*o\n;v2", "=m7<f;\u001dS'\u000e\bh@", "=m7<f;)O)\rz", "=m7<f;+S'\u000f\u0003^", "@d`B\\9>/\u0017\u000e~o0\f\u001d", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "@d`B\\9>@\u0019zxm\n\u0007\u0012>e\u00137", ":`iF@,La\u0015\u0001z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ScreenDummyLayoutHelper implements LifecycleEventListener {
    private static final String DEFAULT_HEADER_TITLE = "FontSize123!#$";
    public static final int FONT_SIZE_UNSET = -1;
    public static final String LIBRARY_NAME = "react_codegen_rnscreens";
    public static final String TAG = "ScreenDummyLayoutHelper";
    private AppBarLayout appBarLayout;
    private CacheEntry cache;
    private CoordinatorLayout coordinatorLayout;
    private int defaultContentInsetStartWithNavigation;
    private float defaultFontSize;
    private View dummyContentView;
    private volatile boolean isLayoutInitialized;
    private WeakReference<ReactApplicationContext> reactContextRef;
    private Toolbar toolbar;
    public static final Companion Companion = new Companion(null);
    private static WeakReference<ScreenDummyLayoutHelper> weakInstance = new WeakReference<>(null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u0018\u007f\u0007lkA0ZeP.hS2\u000fq{:Š\\:ڎs;\u0004\u0019>'\u000fOɁkg|J#\u0013Q\u0019\u001e\u0018\u000fiZR\u001c}.\u001e\u001d3Zom5$ڑ\u0010˃dt>ӌp>0;\u0012\u0005/\u001e\u0001Ёbͯ~CSÈb<NuRR;O[܌dĂB \tȦ-s\\<`l\f<\u0006ݑUݦFN/ڿ\u0001\u000f[\u0014^Z7\u000f\u0007aL4n?\fՙ1٨\u0007\u0007Z¹ϓ\u0007J"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011\u007f\u001d@}3~G{-7m\u001f\r]KC\u007f\u001b\u001a)rqHic3Yv4\u0006*X4gN{A\u001e\u001b0", "", "u(E", "\u0012D5\u000eH\u0013-M{^V=\fi\u0003\u001eIn\u000f[", "", "\u0014N=!R\u001a\"HxxjG\u001a\\w", "", "\u001aH1\u001f4\u00192M\u0002Zb>", "\"@6", "EdP8<5Lb\u0015\bx^", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011\u007f\u001d@}3~G{-7m\u001f\r]KC\u007f\u001b\u001a)rqHic3Yv4\u001d", "5dc\u0016a:MO\"|z", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ScreenDummyLayoutHelper getInstance() {
            return (ScreenDummyLayoutHelper) ScreenDummyLayoutHelper.weakInstance.get();
        }
    }

    public ScreenDummyLayoutHelper(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.cache = CacheEntry.Companion.getEMPTY();
        this.reactContextRef = new WeakReference<>(reactContext);
        try {
            System.loadLibrary(LIBRARY_NAME);
        } catch (UnsatisfiedLinkError unused) {
        }
        weakInstance = new WeakReference<>(this);
        if (reactContext.hasCurrentActivity() && maybeInitDummyLayoutWithHeader(reactContext)) {
            return;
        }
        reactContext.addLifecycleEventListener(this);
    }

    private final float computeDummyLayout(int i2, boolean z2) {
        if (!this.isLayoutInitialized && !maybeInitDummyLayoutWithHeader(requireReactContext(new Function0<Object>() { // from class: com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper$computeDummyLayout$reactContext$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return "[RNScreens] Context was null-ed before dummy layout was initialized";
            }
        }))) {
            return 0.0f;
        }
        if (this.cache.hasKey(new CacheKey(i2, z2))) {
            return this.cache.getHeaderHeight();
        }
        View decorView = requireActivity().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        int width = decorView.getWidth();
        int height = decorView.getHeight();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
        AppBarLayout appBarLayout = null;
        if (z2) {
            Toolbar toolbar = this.toolbar;
            if (toolbar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbar");
                toolbar = null;
            }
            toolbar.setTitle("");
            Toolbar toolbar2 = this.toolbar;
            if (toolbar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbar");
                toolbar2 = null;
            }
            toolbar2.setContentInsetStartWithNavigation(0);
        } else {
            Toolbar toolbar3 = this.toolbar;
            if (toolbar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbar");
                toolbar3 = null;
            }
            toolbar3.setTitle(DEFAULT_HEADER_TITLE);
            Toolbar toolbar4 = this.toolbar;
            if (toolbar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbar");
                toolbar4 = null;
            }
            toolbar4.setContentInsetStartWithNavigation(this.defaultContentInsetStartWithNavigation);
        }
        ScreenStackHeaderConfig.Companion companion = ScreenStackHeaderConfig.Companion;
        Toolbar toolbar5 = this.toolbar;
        if (toolbar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            toolbar5 = null;
        }
        TextView textViewFindTitleTextViewInToolbar = companion.findTitleTextViewInToolbar(toolbar5);
        if (textViewFindTitleTextViewInToolbar != null) {
            textViewFindTitleTextViewInToolbar.setTextSize(i2 != -1 ? i2 : this.defaultFontSize);
        }
        CoordinatorLayout coordinatorLayout = this.coordinatorLayout;
        if (coordinatorLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
            coordinatorLayout = null;
        }
        coordinatorLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        CoordinatorLayout coordinatorLayout2 = this.coordinatorLayout;
        if (coordinatorLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
            coordinatorLayout2 = null;
        }
        coordinatorLayout2.layout(0, 0, width, height);
        AppBarLayout appBarLayout2 = this.appBarLayout;
        if (appBarLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarLayout");
        } else {
            appBarLayout = appBarLayout2;
        }
        float dIPFromPixel = PixelUtil.toDIPFromPixel(appBarLayout.getHeight());
        this.cache = new CacheEntry(new CacheKey(i2, z2), dIPFromPixel);
        return dIPFromPixel;
    }

    @JvmStatic
    public static final ScreenDummyLayoutHelper getInstance() {
        return Companion.getInstance();
    }

    private final void initDummyLayoutWithHeader(Context context) {
        this.coordinatorLayout = new CoordinatorLayout(context);
        AppBarLayout appBarLayout = new AppBarLayout(context);
        appBarLayout.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, -2));
        this.appBarLayout = appBarLayout;
        Toolbar toolbar = new Toolbar(context);
        toolbar.setTitle(DEFAULT_HEADER_TITLE);
        AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(-1, -2);
        layoutParams.setScrollFlags(0);
        toolbar.setLayoutParams(layoutParams);
        this.toolbar = toolbar;
        ScreenStackHeaderConfig.Companion companion = ScreenStackHeaderConfig.Companion;
        Toolbar toolbar2 = this.toolbar;
        View view = null;
        if (toolbar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            toolbar2 = null;
        }
        TextView textViewFindTitleTextViewInToolbar = companion.findTitleTextViewInToolbar(toolbar2);
        Intrinsics.checkNotNull(textViewFindTitleTextViewInToolbar);
        this.defaultFontSize = textViewFindTitleTextViewInToolbar.getTextSize();
        Toolbar toolbar3 = this.toolbar;
        if (toolbar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            toolbar3 = null;
        }
        this.defaultContentInsetStartWithNavigation = toolbar3.getContentInsetStartWithNavigation();
        AppBarLayout appBarLayout2 = this.appBarLayout;
        if (appBarLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarLayout");
            appBarLayout2 = null;
        }
        Toolbar toolbar4 = this.toolbar;
        if (toolbar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            toolbar4 = null;
        }
        appBarLayout2.addView(toolbar4);
        View view2 = new View(context);
        view2.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, -1));
        this.dummyContentView = view2;
        CoordinatorLayout coordinatorLayout = this.coordinatorLayout;
        if (coordinatorLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
            coordinatorLayout = null;
        }
        AppBarLayout appBarLayout3 = this.appBarLayout;
        if (appBarLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarLayout");
            appBarLayout3 = null;
        }
        coordinatorLayout.addView(appBarLayout3);
        View view3 = this.dummyContentView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dummyContentView");
        } else {
            view = view3;
        }
        coordinatorLayout.addView(view);
        this.isLayoutInitialized = true;
    }

    private final boolean maybeInitDummyLayoutWithHeader(ReactApplicationContext reactApplicationContext) {
        if (this.isLayoutInitialized) {
            return true;
        }
        if (!reactApplicationContext.hasCurrentActivity()) {
            return false;
        }
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity. This could happen only due to race-condition.".toString());
        }
        Intrinsics.checkNotNullExpressionValue(currentActivity, "requireNotNull(...)");
        synchronized (this) {
            if (this.isLayoutInitialized) {
                return true;
            }
            initDummyLayoutWithHeader(currentActivity);
            Unit unit = Unit.INSTANCE;
            return true;
        }
    }

    private final Activity requireActivity() {
        Activity currentActivity = requireReactContext$default(this, null, 1, null).getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity".toString());
    }

    private final ReactApplicationContext requireReactContext(Function0<? extends Object> function0) {
        ReactApplicationContext reactApplicationContext = this.reactContextRef.get();
        if (function0 == null) {
            function0 = new Function0<String>() { // from class: com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper.requireReactContext.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "[RNScreens] Attempt to require missing react context";
                }
            };
        }
        if (reactApplicationContext != null) {
            return reactApplicationContext;
        }
        throw new IllegalArgumentException(function0.invoke().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ ReactApplicationContext requireReactContext$default(ScreenDummyLayoutHelper screenDummyLayoutHelper, Function0 function0, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            function0 = null;
        }
        return screenDummyLayoutHelper.requireReactContext(function0);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        ReactApplicationContext reactApplicationContext = this.reactContextRef.get();
        if (reactApplicationContext != null) {
            reactApplicationContext.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        ReactApplicationContext reactApplicationContextRequireReactContext = requireReactContext(new Function0<Object>() { // from class: com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper$onHostResume$reactContext$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return "[RNScreens] ReactContext missing in onHostResume! This should not happen.";
            }
        });
        if (maybeInitDummyLayoutWithHeader(reactApplicationContextRequireReactContext)) {
            reactApplicationContextRequireReactContext.removeLifecycleEventListener(this);
        }
    }
}
