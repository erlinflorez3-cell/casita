package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.common.logging.FLog;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.views.view.WindowUtilKt;
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
@ReactModule(name = "\u00133\u001f11.{\u001a*\u0004\u0017#\u0015\u001a\u0017#")
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0017\u007fјnjGRLeV:ZS8şsڔ<$i$yّCU(\u0002*ޛWNupvJ`\u0011I\u0014\u001cǝ\u0017\u007f\\I\u0004w\u0016\u0011$rO\u007fEAM\b?O_#7ӯ$20:B\u000b\u000f\u001dBH>zAC\u0014\u001e 5X|JT\u001dM3!\"\bN /&\u000bm\u0015H\u0011\u0003kCG#1srR5jH|{\u0019vX5\u001a\u000faL9\u0007K}#3b\u001b\u0007\u0001eo\u0007M\u0002U\u0005\u00175m?\u0012\u0004eGp\u007fB\u001f[U\u001bo\u000b(r\u0004\u007fgR;s]q^h\u000eV\u0002+\u007f\u001bP\u001c\u000e45\u000fBǏ\u001e|"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006\u000541h\u000e.4i#w;R7zD,qdn!\u0011b<Uv|", "\u001ab^:\"-:Q\u0019{\u0005h2F\n,r\u007f$yOJ%\"Gm\u001c\u0006_!D]\u000f %|\u0012=]Q\u0018gA\u0006\u0011q];\u0007p\bWu4QPM\u001agRp\u0013", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "5dc g(Mc'[vk\u000f|\r1h\u000f\u0013\u000f", "", "5dc!l7>Rx\u0012\u0006h9\f\t.C\n1\nO| &U", "", "", "", "Adc\u0010b3H`", "", "1n[<e\u000bHc\u0016\u0006z", "", "/mX:T;>R", "", "Adc\u0015\\+=S\"", "6hS1X5", "Adc g@ES", "Ash9X", "Adc!e(Ga \u000fx^5\f", "BqP;f3NQ\u0019\b\n", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class StatusBarModule extends NativeStatusBarManagerAndroidSpec {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅ś<~"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006\u000541h\u000e.4i#w;R7zD,qdn!\u0011b<Uve%VV7X[vG\u001dg", "", "u(E", "\u0012D5\u000eH\u0013-MuZXD\u000eir\u001fN^\"Y*g\u0001\u0004AUm0", "", "\u0016D8\u0014;\u001b89xr", "\u001c@<\u0012", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.modules.statusbar.StatusBarModule$setColor$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0013\u001d̉=!4i\bӵLc\u0003\u0004IيX\nǞH\u00078ܥBw5e3?>D}H\\S\u001a>ƈo}"}, d2 = {"1n\\{Y(<S\u0016\t\u0005du\n\t+c\u000fq\u0004J\u007f'\u001eG}WJ\u0006!Di\f\u001d3z_\u001c\\?J{Bz\u0011uIC\u0006s3N55G[,6c\\\u007f{_", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001e\u0007!BX}\u001f$}\u001f7I@Bk\n", "@t]\u0014h(KR\u0019}", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends GuardedRunnable {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ boolean $animated;
        final /* synthetic */ int $color;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Activity activity, boolean z2, int i2, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.$activity = activity;
            this.$animated = z2;
            this.$color = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runGuarded$lambda$0(Activity activity, ValueAnimator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            Window window = activity.getWindow();
            if (window == null) {
                return;
            }
            Object animatedValue = animator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            window.setStatusBarColor(((Integer) animatedValue).intValue());
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            Window window = this.$activity.getWindow();
            if (window == null) {
                return;
            }
            window.addFlags(Integer.MIN_VALUE);
            if (!this.$animated) {
                window.setStatusBarColor(this.$color);
                return;
            }
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(this.$color));
            final Activity activity = this.$activity;
            valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facebook.react.modules.statusbar.StatusBarModule$setColor$1$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StatusBarModule.AnonymousClass1.runGuarded$lambda$0(activity, valueAnimator);
                }
            });
            valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
            valueAnimatorOfObject.start();
        }
    }

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final float getStatusBarHeightPx() {
        Window window;
        View decorView;
        WindowInsetsCompat rootWindowInsets;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootWindowInsets = ViewCompat.getRootWindowInsets(decorView)) == null) {
            return 0.0f;
        }
        return rootWindowInsets.getInsets((-1) - (((-1) - (WindowInsetsCompat.Type.statusBars() | WindowInsetsCompat.Type.navigationBars())) & ((-1) - WindowInsetsCompat.Type.displayCutout()))).top;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHidden$lambda$1(Activity activity, boolean z2) {
        Window window = activity.getWindow();
        if (window != null) {
            WindowUtilKt.setStatusBarVisibility(window, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStyle$lambda$2(Activity activity, String str) {
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 30) {
            View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(Intrinsics.areEqual("dark-content", str) ? systemUiVisibility | 8192 : (systemUiVisibility - 8193) - (systemUiVisibility | (-8193)));
            return;
        }
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController == null) {
            return;
        }
        if (Intrinsics.areEqual("dark-content", str)) {
            insetsController.setSystemBarsAppearance(8, 8);
        } else {
            insetsController.setSystemBarsAppearance(0, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.util.Map<java.lang.String, java.lang.Object> getTypedExportedConstants() {
        /*
            r5 = this;
            android.app.Activity r0 = r5.getCurrentActivity()
            r4 = 1
            if (r0 == 0) goto L31
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L31
            int r1 = r0.getStatusBarColor()
            kotlin.jvm.internal.StringCompanionObject r0 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r4)
            java.lang.String r0 = "#%06X"
            java.lang.String r3 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "format(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            if (r3 != 0) goto L33
        L31:
            java.lang.String r3 = "black"
        L33:
            r0 = 2
            kotlin.Pair[] r2 = new kotlin.Pair[r0]
            float r0 = r5.getStatusBarHeightPx()
            float r0 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            java.lang.String r0 = "HEIGHT"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r0, r1)
            r0 = 0
            r2[r0] = r1
            java.lang.String r0 = "DEFAULT_BACKGROUND_COLOR"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r3)
            r2[r4] = r0
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.statusbar.StatusBarModule.getTypedExportedConstants():java.util.Map");
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setColor(double d2, boolean z2) {
        int i2 = (int) d2;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            FLog.w(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new AnonymousClass1(currentActivity, z2, i2, getReactApplicationContext()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setHidden(final boolean z2) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            FLog.w(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.StatusBarModule$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    StatusBarModule.setHidden$lambda$1(currentActivity, z2);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setStyle(final String str) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            FLog.w(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.StatusBarModule$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    StatusBarModule.setStyle$lambda$2(currentActivity, str);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setTranslucent(boolean z2) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            FLog.w(ReactConstants.TAG, "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new GuardedRunnable(currentActivity, z2, getReactApplicationContext()) { // from class: com.facebook.react.modules.statusbar.StatusBarModule.setTranslucent.1
                final /* synthetic */ Activity $activity;
                final /* synthetic */ boolean $translucent;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(reactApplicationContext);
                }

                @Override // com.facebook.react.bridge.GuardedRunnable
                public void runGuarded() {
                    Window window = this.$activity.getWindow();
                    if (window != null) {
                        WindowUtilKt.setStatusBarTranslucency(window, this.$translucent);
                    }
                }
            });
        }
    }
}
