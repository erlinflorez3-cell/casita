package com.braze.ui.support;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.WindowInsetsCompat;
import com.braze.enums.inappmessage.Orientation;
import com.braze.support.BrazeLogger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d̉=!,o\bӵLc\u0003\u0010Iي8\u000b<F\u0007Ӭ4\u0012\u000e\u0007nj?1Le^.ZS0\u0011s{B-c$wCCU0}*\tUOog\u0005JbŏK\u000f\u0014\u0016\u0001j2I]xs\u0012\u00172HrWG[qU9\u000fwf\t.6:8(\n1\u001e8N(v)Fc\u0018 7XphQ=Q\u0013\"*\u0006l)\u0019*jqf6vk\u000e>=+\u001bipW?k>\be\rtSW\u0011\u0005i6+n@M!3_\u001b\u0007\u0001Zo\u0007MyU\u0005\u00170??W\u0001o6\u0007\u000eD\u00199^%]!%\r\t_p$'Y`{W^ @w)\n=@\u0012\u0012\u001e'v3E&t\u001b&3#\u0001\u0004D^\u0016vB.\u0010yJ%;\u00183YPKj_uS\u0019|L,\t\u001b6;\u0001\u001d s\\\u001cy-\u001b\u0003\u0006y1\u007fZUR\\%q=\u001c\u001b\u0019d\u0018)2E_\u0010=\u0018).E<_[g=Qo\u0010e\\g%\u0004xpa\bjHn9\u0017\u0016e?)\u0018hե|\u0005\u001aO+Г~ҭQ\u001c\\͵\u001e\u0014! twj\"{ĮPћlirܔϓ\u000eD"}, d2 = {"\"@1\u00198\u001b8A\u0001ZaE\fjw)Wc\u0007j#zu\u0002", "", "\"@6", "", "1n]CX9M2$m\u0005I0\u0010\t6s", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "D`[BX\u0010G2$", "5dc\u001aT?,O\u001a~Wh;\f\u00137I\t6{O", "Eh]1b>\"\\'~\nl", "\u001a`]1e6BR,Hxh9|R@i\u007f:E2\u0005 \u0016Q\u0002qE\u0005%Dg[*?x\u0012=#", "5dc\u001aT?,O\u001a~a^-\fl8s\u007f7", "5dc\u001aT?,O\u001a~gb.\u007f\u0018\u0013n\u000e(\u000b", "5dc\u001aT?,O\u001a~ih7`\u0012=e\u000f", "7r2Be9>\\(h\bb,\u0006\u0018+t\u00042\u00051|\u001e\u001bF", "", "1ta?X5MA\u0017\fz^5f\u00163e\t7wO\u0005! ", ">qT3X9KS\u0018h\bb,\u0006\u0018+t\u00042\u0005", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u001ff\u0002 @|\u0012=QMDA", "7r32i0<S|\bcb.\u007f\u0018\u0017o~(", "7r32i0<S\u0002\t\nB5k\u0013?c\u0003\u0010\u0006?\u0001", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "Adc\u0015X0@V(h\u0004O0|\u001b\u0016a\u00142\fOk\u0013$Cw\u001c", "", "6dX4[;", "7rABa5B\\\u001bh\u0004M(y\u0010/t", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "@d\\<i,/W\u0019\u0011[k6\u0005s+r\u007f1\u000b", "Adc\u000eV;Bd\u001d\u000e\u000fK,\t\u0019/s\u000f(z*\u000e\u001b\u0017P~\nKz/>", "@d`BX:MS\u0018h\bb,\u0006\u0018+t\u00042\u0005", "Adc\u0013b*Na\u0015{\u0002^\u0010\u0006w9u}+cJ\u007f\u0017rPnz<\u000355g\r\u0001Ak&<", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ViewUtils {
    private static final int TABLET_SMALLEST_WIDTH_DP = 600;
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("ViewUtils");

    /* JADX INFO: renamed from: com.braze.ui.support.ViewUtils$isCurrentOrientationValid$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Current and preferred orientation are landscape.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.support.ViewUtils$isCurrentOrientationValid$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function0<String> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Current and preferred orientation are portrait.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.support.ViewUtils$isCurrentOrientationValid$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function0<String> {
        final /* synthetic */ int $currentScreenOrientation;
        final /* synthetic */ Orientation $preferredOrientation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(int i2, Orientation orientation) {
            super(0);
            i = i2;
            orientation = orientation;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Current orientation " + i + " and preferred orientation " + orientation + " don't match";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.support.ViewUtils$removeViewFromParent$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10911 extends Lambda implements Function0<String> {
        public static final C10911 INSTANCE = ;

        C10911() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "View passed in is null. Not removing from parent.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.support.ViewUtils$removeViewFromParent$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10922 extends Lambda implements Function0<String> {
        final /* synthetic */ ViewGroup $parent;
        final /* synthetic */ View $this_removeViewFromParent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10922(View view, ViewGroup viewGroup) {
            super(0);
            view = view;
            viewGroup = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Removed view: " + view + "\nfrom parent: " + viewGroup;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.support.ViewUtils$removeViewFromParent$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10933 extends Lambda implements Function0<String> {
        public static final C10933 INSTANCE = ;

        C10933() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Caught exception while removing view from parent.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.support.ViewUtils$setActivityRequestedOrientation$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10941 extends Lambda implements Function0<String> {
        final /* synthetic */ int $requestedOrientation;
        final /* synthetic */ Activity $this_setActivityRequestedOrientation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10941(int i2, Activity activity) {
            super(0);
            i = i2;
            activity = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to set requested orientation " + i + " for activity class: " + activity.getLocalClassName();
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.support.ViewUtils$setFocusableInTouchModeAndRequestFocus$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10951 extends Lambda implements Function0<String> {
        public static final C10951 INSTANCE = ;

        C10951() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Caught exception while setting view to focusable in touch mode and requesting focus.";
        }
    }

    public static final double convertDpToPixels(Context context, double d2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Qd("q|z\u007fo\u0002|", (short) (C1499aX.Xd() ^ (-7244))));
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("N\\Sb`[W\"Xeel^ho*@mmtfzw", (short) (ZN.Xd() ^ 25700), (short) (ZN.Xd() ^ 25240))).getMethod(C1561oA.od("\u0007\u0004\u0012n\u0001\u000e\t\u000e\nyz\b", (short) (C1499aX.Xd() ^ (-3918))), new Class[0]);
        try {
            method.setAccessible(true);
            return d2 * ((double) ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final int getMaxSafeBottomInset(WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        DisplayCutoutCompat displayCutout = windowInsets.getDisplayCutout();
        return Math.max(displayCutout != null ? displayCutout.getSafeInsetBottom() : 0, windowInsets.getInsets(WindowInsetsCompat.Type.systemBars()).bottom);
    }

    public static final int getMaxSafeLeftInset(WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        DisplayCutoutCompat displayCutout = windowInsets.getDisplayCutout();
        return Math.max(displayCutout != null ? displayCutout.getSafeInsetLeft() : 0, windowInsets.getInsets(WindowInsetsCompat.Type.systemBars()).left);
    }

    public static final int getMaxSafeRightInset(WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        DisplayCutoutCompat displayCutout = windowInsets.getDisplayCutout();
        return Math.max(displayCutout != null ? displayCutout.getSafeInsetRight() : 0, windowInsets.getInsets(WindowInsetsCompat.Type.systemBars()).right);
    }

    public static final int getMaxSafeTopInset(WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        DisplayCutoutCompat displayCutout = windowInsets.getDisplayCutout();
        return Math.max(displayCutout != null ? displayCutout.getSafeInsetTop() : 0, windowInsets.getInsets(WindowInsetsCompat.Type.systemBars()).top);
    }

    public static final boolean isCurrentOrientationValid(int i2, Orientation preferredOrientation) {
        Intrinsics.checkNotNullParameter(preferredOrientation, "preferredOrientation");
        if (i2 == 2 && preferredOrientation == Orientation.LANDSCAPE) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) AnonymousClass1.INSTANCE, 12, (Object) null);
            return true;
        }
        if (i2 == 1 && preferredOrientation == Orientation.PORTRAIT) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) AnonymousClass2.INSTANCE, 12, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.support.ViewUtils.isCurrentOrientationValid.3
            final /* synthetic */ int $currentScreenOrientation;
            final /* synthetic */ Orientation $preferredOrientation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(int i22, Orientation preferredOrientation2) {
                super(0);
                i = i22;
                orientation = preferredOrientation2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Current orientation " + i + " and preferred orientation " + orientation + " don't match";
            }
        }, 12, (Object) null);
        return false;
    }

    public static final boolean isDeviceInNightMode(Context context) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 16676);
        int[] iArr = new int["KXX_Qeb".length()];
        QB qb = new QB("KXX_Qeb");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        short sXd2 = (short) (Od.Xd() ^ (-6368));
        short sXd3 = (short) (Od.Xd() ^ (-24404));
        int[] iArr2 = new int["\u0004R(u\u001bD\u001fluUP:r\fQjWsR\u001e3yQ".length()];
        QB qb2 = new QB("\u0004R(u\u001bD\u001fluUP:r\fQjWsR\u001e3yQ");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Xd("jiyXl{x\u007f}or\u0002", (short) (C1580rY.Xd() ^ (-8182))), new Class[0]);
        try {
            method.setAccessible(true);
            return (-1) - (((-1) - ((Resources) method.invoke(context, objArr)).getConfiguration().uiMode) | ((-1) - 48)) == 32;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final boolean isDeviceNotInTouchMode(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return !view.isInTouchMode();
    }

    public static final boolean isRunningOnTablet(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return activity.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    public static final void removeViewFromParent(View view) {
        if (view == null) {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) C10911.INSTANCE, 12, (Object) null);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) C10933.INSTANCE, 8, (Object) null);
                return;
            }
        }
        if ((view != null ? view.getParent() : null) instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView(view);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.support.ViewUtils.removeViewFromParent.2
                final /* synthetic */ ViewGroup $parent;
                final /* synthetic */ View $this_removeViewFromParent;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10922(View view2, ViewGroup viewGroup2) {
                    super(0);
                    view = view2;
                    viewGroup = viewGroup2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Removed view: " + view + "\nfrom parent: " + viewGroup;
                }
            }, 12, (Object) null);
        }
    }

    public static final void setActivityRequestedOrientation(Activity activity, int i2) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        try {
            activity.setRequestedOrientation(i2);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.ui.support.ViewUtils.setActivityRequestedOrientation.1
                final /* synthetic */ int $requestedOrientation;
                final /* synthetic */ Activity $this_setActivityRequestedOrientation;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10941(int i22, Activity activity2) {
                    super(0);
                    i = i22;
                    activity = activity2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to set requested orientation " + i + " for activity class: " + activity.getLocalClassName();
                }
            }, 8, (Object) null);
        }
    }

    public static final void setFocusableInTouchModeAndRequestFocus(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        try {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) C10951.INSTANCE, 8, (Object) null);
        }
    }

    public static final void setHeightOnViewLayoutParams(View view, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }
}
