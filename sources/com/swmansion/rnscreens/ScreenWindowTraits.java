package com.swmansion.rnscreens;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.rnscreens.Screen;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯI\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u0006\u0010nj?1LeN/ZS8\u000fs{:)c$\bCC٥\"}8\tWNmlvJp\u000bKƤ\u000e\u0016\u000fj4I[\t\u0006\u0011\u00188ՖoU\u074c}ok8!y<\u0005ڶ6\"FyM\f(5`\u0010%\u0007\nŷë\u00160F}\u0003]\u001b[\u001d\u001a@\u0012\u0005ĨӘ\"\\m]~SzmR/Q\u000f0ĩĚ+_6\u000e\u0016#Tf?\r%fN/NJM\u0015Sg3\u000b`pW\u0003m\b\u0004\u00051A5Baum5\u0007\u0014D\u001b9b%_\t%\u000b\u0019\u0002d\u001a<CO\u0012a\u0017\u000ep\u0010\t\u0014%>\u001a\r4;x2;-~\b<G%vaUh\u0002\rXFz*N%>\u00185A8Iz\u0002eI,f7*\u0019=\"1\u0016\u0007!\njT`])b\u0012i1\u007fEmL\\%q=\u001c\u00067bJQ\u0012L_\u007f]\bA2%8O[g7Qq\u0010e\\i\r\u0004\u000f\u0007\u0004o`gX$\u0005\u0015eJOȱʑHd\u000b\r\u0019qfN)MJ`7\u0002\u0016&8\\&PQ+\u001ekgj\u007fi{{Pɘçj7_\u00124+e]v3c]\u0014\u0014oe\u000f\u0014mP\u0013\u000bf\u0004ZU\"Y\u000bFhõʮn\u0010}!\rk\u001a9J? (d0?,t\u0015v\u0017NHO\u001a!apg>\u001d\u001b՜ʗ\u0007i*\u001cQ\u001e^\u0005\to\u0016\u0005y0\u000bs:-oee\u001f4r:jJ{Q%E͞õKgRp\u0015\n$ m{N\"J=_BU\u0013=\u0013Y8\u0010J]N\td\u007fkX\u05fdϸ\u0001y\u0015f1Uu4\u0003pZl\u001bN]g/\"%r#)\u0016\u0002\u0018{wE)e\u0014Z\u0019zVK\t\u0002\b\\\u0015˻٫\t\u001f$RI\u00170+M-q3M\u001a\u0006'G\u0015\u0010q\u001au<\u0017z\u0011<s\u0014\"\\i$\u000fzSs1iX\u0010ʲ˽B\"*\u001cKiV\u001b\u0010\bp\u0015d\u0011A[Yd\u001fjhS\u0019L\u0016h\u001d+;\u000f\u0007aH2\b\u007fJ-\u000eJ:ʕ\u0382\u0018^IVa]ah\u0006oa[9Leϛ\u0017֭5p\u001a\u001cK#'cp\rH\u0006\"\u001d\rאGك\t<\u0011ӗ\u00058J\u000e#C\u0003n\\؎\u0007ķJ_\u0017ğ\u0003N\u0002Bn\u000e\u0003}3ƊTϖdEhԠz\u000f\r\u0017K\u001e'>\b܍yܑX1k2\u000f]¡\rM"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>K\u0002)6w(\u001dZ??zBs", "", "u(E", "2dU.h3MA(z\nn:Y\u0005<C\n/\u0006M", "", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "2hS X;'O*\u0003|Z;\u0001\u00138B{5WK\f\u0017\u0013Tk\u0017:v", "", "2hS X;(`\u001d~\u0004m(\f\r9n", "2hS X;,b\u0015\u000e\u000bl\tx\u0016\u000bp\u000b(wM| \u0015G", "Eh]1b>\"\\'~\nl\u0013\u0001\u0017>e\t(\t", "1n\\{f>FO\"\r~h5F\u00168s}5{@\n%`5m\u001b<v.']\u0007\u001fA\u007f\u0005;IGJyr0\u0019q`C\u0019G5\\v6U3R:kR{=!P&", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>K\u0002)6w(\u001dZ??zB\\'lj8\u0011u\u0010W\u0005'VZ50jarF\u0014\u001f\u0019Y$", "/o_9l\u000bBR\u0007~\nG(\u000e\r1a\u000f,\u0006I]\u0013$#z\u0019<r21b{ ", "", "/o_9l\u000bBR\u0007~\nG(\u000e\r1a\u000f,\u0006I]\u0013$#z\u0019<r21b{ uz\u0016*KR5t0-\u0019ya3\u0015a9Nv0UF[,cRnK\u0014", "/o_9l\u000bBR\u0007~\nH9\u0001\t8t{7\u007fJ\n", "/o_9l\u000bBR\u0007~\nH9\u0001\t8t{7\u007fJ\nU$Gk\fKp.1h\u000217g$,ZC;tB\u0018\"hh9\u0003q,", "/o_9l\u000bBR\u0007~\nL;x\u0018?s\\$\t\u001c\f\"\u0017C|\nEt%", "/o_9l\u000bBR\u0007~\nL;x\u0018?s\\$\t\u001c\f\"\u0017C|\nEt%sf}\u001c5|\u00107IR?|4\u0018#fn9\u0007l:H\u0004'NLJ:\\", "1gT0^\u001bKO\u001d\u000e[h9j\u0007<e\u007f1", "Aba2X5", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>/", "BqP6g", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>\u0018o$@l @<P7oC,j", "1gX9W\u001a<`\u0019~\u0004P0\f\f\u001er{,\u000b.\u0001&", "4h]1C(KS\"\u000elb;\u007fw<a\u00047i@\u0010", "4h]1F*KS\u0019\b[h9k\u0016+i\u000f", "7r2<_6K:\u001d\u0001}m", "1n[<e", "Adc\u0010b3H`", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "Adc\u0010b3H`W\fzZ*\f\u00038a\u000f,\r@z%\u0015To\u000eE\u0005\u001fBY\u0005 3{\u0016", "Adc\u0015\\+=S\"", "Adc\u0015\\+=S\"=\b^(z\u0018)n{7\u007fQ\u0001\u0011%E|\u000e<\u007f3/f}'7i$.", "Adc\u001bT=BU\u0015\u000e~h5Y\u0005<C\n/\u0006M", "Adc\u001bT=BU\u0015\u000e~h5Y\u0005<C\n/\u0006M?$\u0017Cm\u001d6\u007f!D]\u000f 1{\u0014;MCDy.+\u0015oa5\u0015c", "Adc\u001bT=BU\u0015\u000e~h5Y\u0005<H\u0004'z@\n", "Adc\u001bT=BU\u0015\u000e~h5Y\u0005<H\u0004'z@\nU$Gk\fKp.1h\u000217g$,ZC;tB\u0018\"hh9\u0003q,", "Adc\u001bT=BU\u0015\u000e~h5Y\u0005<T\r$\u0005N\b'\u0015Gx\u001d", "Adc\u001bT=BU\u0015\u000e~h5Y\u0005<T\r$\u0005N\b'\u0015Gx\u001dz\u0004%1W\r\u001a@i%2^C5y2+\u0015hjG\u0001p,Uv#UL", "Adc\u001ce0>\\(z\nb6\u0006", "Adc\u001ce0>\\(z\nb6\u0006G<e{&\u000b:\n\u0013&K\u0001\u000e6\u0005#BY})Eg#.TC7y4", "Adc g@ES", "Adc g@ESW\fzZ*\f\u00038a\u000f,\r@z%\u0015To\u000eE\u0005\u001fBY\u0005 3{\u0016", "Adc!e(Ga \u000fx^5\f", "Adc!e(Ga \u000fx^5\fG<e{&\u000b:\n\u0013&K\u0001\u000e6\u0005#BY})Eg#.TC7y4", "Bqh X;0W\"}\u0005p\u001b\n\u00053t\u000e", "Bqh X;0W\"}\u0005p\u001b\n\u00053t\u000ef\t@|\u0015&Ax\nKz65S\f\u001eDm\u00167[=Hk;\u001e\u0011va", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ScreenWindowTraits {
    private static Integer defaultStatusBarColor = null;
    private static boolean didSetNavigationBarAppearance = false;
    private static boolean didSetOrientation = false;
    private static boolean didSetStatusBarAppearance = false;
    public static final ScreenWindowTraits INSTANCE = new ScreenWindowTraits();
    private static ScreenWindowTraits$windowInsetsListener$1 windowInsetsListener = new OnApplyWindowInsetsListener() { // from class: com.swmansion.rnscreens.ScreenWindowTraits$windowInsetsListener$1
        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View v2, WindowInsetsCompat insets) {
            Intrinsics.checkNotNullParameter(v2, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = ViewCompat.onApplyWindowInsets(v2, insets);
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompatOnApplyWindowInsets, "onApplyWindowInsets(...)");
            if (Build.VERSION.SDK_INT < 30) {
                WindowInsetsCompat windowInsetsCompatReplaceSystemWindowInsets = windowInsetsCompatOnApplyWindowInsets.replaceSystemWindowInsets(windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetLeft(), 0, windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetRight(), windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetBottom());
                Intrinsics.checkNotNullExpressionValue(windowInsetsCompatReplaceSystemWindowInsets, "replaceSystemWindowInsets(...)");
                return windowInsetsCompatReplaceSystemWindowInsets;
            }
            Insets insets2 = windowInsetsCompatOnApplyWindowInsets.getInsets(WindowInsetsCompat.Type.statusBars());
            Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
            WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder().setInsets(WindowInsetsCompat.Type.statusBars(), Insets.of(insets2.left, 0, insets2.right, insets2.bottom)).build();
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "build(...)");
            return windowInsetsCompatBuild;
        }
    };

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Screen.WindowTraits.values().length];
            try {
                iArr[Screen.WindowTraits.ORIENTATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Screen.WindowTraits.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Screen.WindowTraits.STYLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Screen.WindowTraits.TRANSLUCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Screen.WindowTraits.HIDDEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Screen.WindowTraits.ANIMATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Screen.WindowTraits.NAVIGATION_BAR_COLOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Screen.WindowTraits.NAVIGATION_BAR_TRANSLUCENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Screen.WindowTraits.NAVIGATION_BAR_HIDDEN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ScreenWindowTraits() {
    }

    private final boolean checkTraitForScreen(Screen screen, Screen.WindowTraits windowTraits) {
        switch (WhenMappings.$EnumSwitchMapping$0[windowTraits.ordinal()]) {
            case 1:
                if (screen.getScreenOrientation() != null) {
                    return true;
                }
                break;
            case 2:
                if (screen.getStatusBarColor() != null) {
                    return true;
                }
                break;
            case 3:
                if (screen.getStatusBarStyle() != null) {
                    return true;
                }
                break;
            case 4:
                if (screen.isStatusBarTranslucent() != null) {
                    return true;
                }
                break;
            case 5:
                if (screen.isStatusBarHidden() != null) {
                    return true;
                }
                break;
            case 6:
                if (screen.isStatusBarAnimated() != null) {
                    return true;
                }
                break;
            case 7:
                if (screen.getNavigationBarColor() != null) {
                    return true;
                }
                break;
            case 8:
                if (screen.isNavigationBarTranslucent() != null) {
                    return true;
                }
                break;
            case 9:
                if (screen.isNavigationBarHidden() != null) {
                    return true;
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    private final Screen childScreenWithTraitSet(Screen screen, Screen.WindowTraits windowTraits) {
        ScreenFragmentWrapper fragmentWrapper;
        if (screen == null || (fragmentWrapper = screen.getFragmentWrapper()) == null) {
            return null;
        }
        Iterator<ScreenContainer> it = fragmentWrapper.getChildScreenContainers().iterator();
        while (it.hasNext()) {
            Screen topScreen = it.next().getTopScreen();
            ScreenWindowTraits screenWindowTraits = INSTANCE;
            Screen screenChildScreenWithTraitSet = screenWindowTraits.childScreenWithTraitSet(topScreen, windowTraits);
            if (screenChildScreenWithTraitSet != null) {
                return screenChildScreenWithTraitSet;
            }
            if (topScreen != null && screenWindowTraits.checkTraitForScreen(topScreen, windowTraits)) {
                return topScreen;
            }
        }
        return null;
    }

    private final Screen findParentWithTraitSet(Screen screen, Screen.WindowTraits windowTraits) {
        for (ScreenContainer container = screen.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof Screen) {
                Screen screen2 = (Screen) container;
                if (checkTraitForScreen(screen2, windowTraits)) {
                    return screen2;
                }
            }
        }
        return null;
    }

    private final Screen findScreenForTrait(Screen screen, Screen.WindowTraits windowTraits) {
        Screen screenChildScreenWithTraitSet = childScreenWithTraitSet(screen, windowTraits);
        return screenChildScreenWithTraitSet != null ? screenChildScreenWithTraitSet : checkTraitForScreen(screen, windowTraits) ? screen : findParentWithTraitSet(screen, windowTraits);
    }

    private final boolean isColorLight(int i2) {
        return ((double) 1) - ((((((double) Color.red(i2)) * 0.299d) + (((double) Color.green(i2)) * 0.587d)) + (((double) Color.blue(i2)) * 0.114d)) / ((double) 255)) < 0.5d;
    }

    public static final void setHidden$lambda$1(boolean z2, WindowInsetsControllerCompat controller) {
        Intrinsics.checkNotNullParameter(controller, "$controller");
        if (z2) {
            controller.hide(WindowInsetsCompat.Type.statusBars());
        } else {
            controller.show(WindowInsetsCompat.Type.statusBars());
        }
    }

    public static final void setNavigationBarColor$lambda$2(Window window, int i2) {
        new WindowInsetsControllerCompat(window, window.getDecorView()).setAppearanceLightNavigationBars(INSTANCE.isColorLight(i2));
    }

    public static final void setStyle$lambda$0(Activity activity, String style) {
        Intrinsics.checkNotNullParameter(style, "$style");
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        new WindowInsetsControllerCompat(activity.getWindow(), decorView).setAppearanceLightStatusBars(Intrinsics.areEqual(style, "dark"));
    }

    public final void applyDidSetNavigationBarAppearance$react_native_screens_release() {
        didSetNavigationBarAppearance = true;
    }

    public final void applyDidSetOrientation$react_native_screens_release() {
        didSetOrientation = true;
    }

    public final void applyDidSetStatusBarAppearance$react_native_screens_release() {
        didSetStatusBarAppearance = true;
    }

    public final void setColor$react_native_screens_release(Screen screen, Activity activity, ReactContext reactContext) {
        Integer statusBarColor;
        Boolean boolIsStatusBarAnimated;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        if (defaultStatusBarColor == null) {
            defaultStatusBarColor = Integer.valueOf(activity.getWindow().getStatusBarColor());
        }
        Screen screenFindScreenForTrait = findScreenForTrait(screen, Screen.WindowTraits.COLOR);
        Screen screenFindScreenForTrait2 = findScreenForTrait(screen, Screen.WindowTraits.ANIMATED);
        if (screenFindScreenForTrait == null || (statusBarColor = screenFindScreenForTrait.getStatusBarColor()) == null) {
            statusBarColor = defaultStatusBarColor;
        }
        UiThreadUtil.runOnUiThread(new ScreenWindowTraits$setColor$1(activity, statusBarColor, (screenFindScreenForTrait2 == null || (boolIsStatusBarAnimated = screenFindScreenForTrait2.isStatusBarAnimated()) == null) ? false : boolIsStatusBarAnimated.booleanValue(), reactContext.getExceptionHandler()));
    }

    public final void setHidden$react_native_screens_release(Screen screen, Activity activity) {
        Boolean boolIsStatusBarHidden;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        Screen screenFindScreenForTrait = findScreenForTrait(screen, Screen.WindowTraits.HIDDEN);
        final boolean zBooleanValue = (screenFindScreenForTrait == null || (boolIsStatusBarHidden = screenFindScreenForTrait.isStatusBarHidden()) == null) ? false : boolIsStatusBarHidden.booleanValue();
        Window window = activity.getWindow();
        final WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.ScreenWindowTraits$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ScreenWindowTraits.setHidden$lambda$1(zBooleanValue, windowInsetsControllerCompat);
            }
        });
    }

    public final void setNavigationBarColor$react_native_screens_release(Screen screen, Activity activity) {
        Integer navigationBarColor;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        final Window window = activity.getWindow();
        Screen screenFindScreenForTrait = findScreenForTrait(screen, Screen.WindowTraits.NAVIGATION_BAR_COLOR);
        final int navigationBarColor2 = (screenFindScreenForTrait == null || (navigationBarColor = screenFindScreenForTrait.getNavigationBarColor()) == null) ? window.getNavigationBarColor() : navigationBarColor.intValue();
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.ScreenWindowTraits$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ScreenWindowTraits.setNavigationBarColor$lambda$2(window, navigationBarColor2);
            }
        });
        window.setNavigationBarColor(navigationBarColor2);
    }

    public final void setNavigationBarHidden$react_native_screens_release(Screen screen, Activity activity) {
        Boolean boolIsNavigationBarHidden;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        Screen screenFindScreenForTrait = findScreenForTrait(screen, Screen.WindowTraits.NAVIGATION_BAR_HIDDEN);
        if (!((screenFindScreenForTrait == null || (boolIsNavigationBarHidden = screenFindScreenForTrait.isNavigationBarHidden()) == null) ? false : boolIsNavigationBarHidden.booleanValue())) {
            new WindowInsetsControllerCompat(window, window.getDecorView()).show(WindowInsetsCompat.Type.navigationBars());
            return;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.navigationBars());
        windowInsetsControllerCompat.setSystemBarsBehavior(2);
    }

    public final void setNavigationBarTranslucent$react_native_screens_release(Screen screen, Activity activity) {
        Boolean boolIsNavigationBarTranslucent;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        Screen screenFindScreenForTrait = findScreenForTrait(screen, Screen.WindowTraits.NAVIGATION_BAR_TRANSLUCENT);
        if (screenFindScreenForTrait == null || (boolIsNavigationBarTranslucent = screenFindScreenForTrait.isNavigationBarTranslucent()) == null) {
            return;
        }
        WindowCompat.setDecorFitsSystemWindows(window, !boolIsNavigationBarTranslucent.booleanValue());
    }

    public final void setOrientation$react_native_screens_release(Screen screen, Activity activity) {
        Integer screenOrientation;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        Screen screenFindScreenForTrait = findScreenForTrait(screen, Screen.WindowTraits.ORIENTATION);
        activity.setRequestedOrientation((screenFindScreenForTrait == null || (screenOrientation = screenFindScreenForTrait.getScreenOrientation()) == null) ? -1 : screenOrientation.intValue());
    }

    public final void setStyle$react_native_screens_release(Screen screen, final Activity activity, ReactContext reactContext) {
        final String statusBarStyle;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        Screen screenFindScreenForTrait = findScreenForTrait(screen, Screen.WindowTraits.STYLE);
        if (screenFindScreenForTrait == null || (statusBarStyle = screenFindScreenForTrait.getStatusBarStyle()) == null) {
            statusBarStyle = "light";
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.ScreenWindowTraits$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ScreenWindowTraits.setStyle$lambda$0(activity, statusBarStyle);
            }
        });
    }

    public final void setTranslucent$react_native_screens_release(Screen screen, final Activity activity, ReactContext reactContext) {
        Boolean boolIsStatusBarTranslucent;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        Screen screenFindScreenForTrait = findScreenForTrait(screen, Screen.WindowTraits.TRANSLUCENT);
        final boolean zBooleanValue = (screenFindScreenForTrait == null || (boolIsStatusBarTranslucent = screenFindScreenForTrait.isStatusBarTranslucent()) == null) ? false : boolIsStatusBarTranslucent.booleanValue();
        final JSExceptionHandler exceptionHandler = reactContext.getExceptionHandler();
        UiThreadUtil.runOnUiThread(new GuardedRunnable(exceptionHandler) { // from class: com.swmansion.rnscreens.ScreenWindowTraits$setTranslucent$1
            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                View decorView = activity.getWindow().getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
                if (zBooleanValue) {
                    InsetsObserverProxy.INSTANCE.registerOnView(decorView);
                    InsetsObserverProxy.INSTANCE.addOnApplyWindowInsetsListener(ScreenWindowTraits.windowInsetsListener);
                } else {
                    InsetsObserverProxy.INSTANCE.removeOnApplyWindowInsetsListener(ScreenWindowTraits.windowInsetsListener);
                }
                ViewCompat.requestApplyInsets(decorView);
            }
        });
    }

    public final void trySetWindowTraits$react_native_screens_release(Screen screen, Activity activity, ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (didSetOrientation) {
            setOrientation$react_native_screens_release(screen, activity);
        }
        if (didSetStatusBarAppearance) {
            setColor$react_native_screens_release(screen, activity, reactContext);
            setStyle$react_native_screens_release(screen, activity, reactContext);
            setTranslucent$react_native_screens_release(screen, activity, reactContext);
            setHidden$react_native_screens_release(screen, activity);
        }
        if (didSetNavigationBarAppearance) {
            setNavigationBarColor$react_native_screens_release(screen, activity);
            setNavigationBarTranslucent$react_native_screens_release(screen, activity);
            setNavigationBarHidden$react_native_screens_release(screen, activity);
        }
    }
}
