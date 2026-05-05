package com.swmansion.rnscreens;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ChoreographerCompat;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.events.ScreenDismissedEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.CX;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яv\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG9LeN0ZS@\u000fs{:$c$\bCC٥\"}0\u000fWNmhvJp\u000bK\u000f\u001c\u0016\u0001̓4Ikxe\u0012\u00155JoM3UoC;htL\u0005(݅*8\u0010\u0005\t\u001a0K\u0018v\u0011CSÈ\u001a0VpBR\u0013f\r\u001a(\u0006F \u0007!b{dȤxl\f9o0\u0013oPN?aF{{\u000eТX'\u001bx*,9ZO5C3\u0004\u0007\u0015ms?1V8OM|5CCI\"tf\\\u000e/-+}$\u000ev4z\u001dQ\u000f\u001co/]\u0003cP<E@\u0011\n-T\u0004<#WL<N2f60cx\u0001vXP0\u0003\t\u007fCgD<=\u007faM\u007f\u001d/Uoa1Ne\u0019M#,J\u0019nOx\u0005\u0012n63T&saUN``N8}\u0004mL~p*B\u0004^K03\n:F\u0017Sa\"9k1y-`F}u3\r\u0019Ww\u007f`@P|\\7r\u0015\u001a\t\\d3\u0003\u0001XfJ)MJdO\n\u0016B8\\&JQ)\u001elgh\u0018z\u0016m\u0018UGfe_\u001fq\u001c\u0005Q`I4\u007fqVu\u001bz\"pTb3u/Ha>r\\V?xZ3\u0014\u0006/\\N:0zE\u007fPL,_6#'\u0011\t,wY|7|!zX-bi<\u0003\u0018A%\r\u000f\btp\u001em)M:5x\"[Q\u00029'_m\"\u0017D-'\u00159\f\u007fuw|KZ(.u\u0004\ff(bO_kU\u0013=\u001cY6\u0010j]L!u\u0002Q e\u0013|(\u001f\u0002zvm\u0016*\t,\u000f\b\u0011O\u001d\u001d07vrQ%+\u0014BeT<_c\u0003($DW5\u001bYjk~~M%,h\u0019oP\u001a{A\f5+Z\u0010\u0014]2\u0012awrFy\u0011\u0013lt.\u0012:).o\u0011n\u000e6IVaY-Nh85\u0011P\u000f\u0003w6_98\u001bz`A\u00139\u001dL\u0016\u0011=G~\u0007Z*7j$H!:\u00164\\|ZwQI,^q)WM\u001cm{:c\\9gU\n[\u000e?q*\u001eS\u001f\u0005[\u0019\u000bn\bJ̾Bװ?b\rµY0B1T\b9I+Ȯ\u0012خ~\u007fNܪ_#@I\f;\u0005\u0014+܂hƪL\u0005hѤ108\t\u0017\u000fa$/y̰\tq^V5k@\n$)\u0017%\u0003O-q{ŀFȗ=\u001b0߰Q\u0017Si[I0<Zڞ5Թoo\u0014Մh\u000b+O0\u001dOP?mMѭjκYdVІG!taf\"W\u000f1Aɽ@\u000e'\r\u001f`\u0001\u00023KZa\u0010GS\u001c\u0011\u0017r75 eiV\u001d=\u0006c;\u001c^!\u0016}عYĺ?}\u0010¶p;\u0012\u000b9^m\r\u0015!\u0014o\u0011Ϛsїf\u0006!\u0015V8\u0012Gئx@"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>7\b)Fi\u001a7MP\u0011", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "4qP4`,Gb\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.DAy)3o\u0016;#", "7r0Ag(<V\u0019}", "", "7r;.l6Nbx\b\u0007n,\r\t.", "7r=2f;>R", "u(I", ":`h<h;\u001cO \u0006wZ*\u0003", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG}:w#.WEHg?!\u0015u?C\u000fn(]5\bTHV,:NyD\u0011\u000eX\u0014$", "<dT1f\u001cIR\u0015\u000ez", ">`a2a;,Q&~zg\u001e\n\u0005:p\u007f5", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\u000b\u001c9u\u00167\\5Hg?)\u0015u7", "Aba2X5\u001c])\b\n", "", "5dc V9>S\"\\\u0005n5\f", "u(8", "Aba2X50`\u0015\n\u0006^9\u000b", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "Bn_ V9>S\"", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>/", "5dc!b7,Q&~zg", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007u", "/cP=g", "Aba2X5", "/cS V9>S\"", "", "7mS2k", "/sc.V/\u001bS \t\rM6\b", "/sc.V/,Q&~zg", "BqP;f(<b\u001d\t\u0004", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.DH\u000b\u001c@{\u0012,\\GEt\n", "4qP4`,Gb", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "1qT.g,-`\u0015\b\tZ*\f\r9n", "2dc.V/\u001bS \t\rM6\b", "2dc.V/,Q&~zg", "4h]199:U!~\u0004m\u0014x\u0012+g\u007f5\\J\u000e\u0004\u0017Cm\u001d)\u0001/DJ\u0002 I", "@n^AI0>e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015V\\\u0018F\u0006\u00169Y\u0010u", "5dc\u000eV;Bd\u001d\u000e\u000fL;x\u0018/", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>\u0018Y\u001eFq'2\\W)z0-\u0015>", "Aba2X5\u001f`\u0015\u0001\u0003^5\fz<a\u000b3{M", "5dc V9>S\"Z\n", "5dc V9>S\"_\bZ.\u0005\t8tq5wK\f\u0017$#~", "6`b V9>S\"", "<nc6Y@\u001cV\u001d\u0006yN7{\u0005>e", "<nc6Y@\u001c]\"\u000evb5|\u0016\u001fp~$\u000b@", "<nc6Y@-]$]zm(z\f/d", "=m0Ag(<V\u0019}ih\u001e\u0001\u0012.o\u0012", "=m32g(<V\u0019}[k6\u0005z3n~2\u000e", "=m;.l6Nb", "1gP;Z,=", Global.COLON, "B", "@", AdkSettings.PLATFORM_TYPE_MOBILE, "=m<2T:N`\u0019", "EhSA[\u0014>O'\u000f\b^\u001a\b\t-", "6dX4[;&S\u0015\r\u000bk,j\u0014/c", "=mB0e,>\\v\u0002vg.|\b", "=mD=W(MS", ">da3b9FC$}vm,\u000b", ">da3b9FC$}vm,\u000bq9w", "@d\\<i,\u001aZ lxk,|\u0012=", "@d\\<i,&gy\fv`4|\u0012>s", "@d\\<i,,Q&~zg\b\f", "@d\\<i,/W\u0019\u0011", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "@d`BX:M:\u0015\u0013\u0005n;", "Adc\u0013e(@[\u0019\b\nF(\u0006\u00051e\r", "4l", "AdcBc\rKO\u001b\u0007zg;d\u00058a\u0002(\t", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class ScreenContainer extends ViewGroup {
    protected FragmentManager fragmentManager;
    private boolean isAttached;
    private boolean isLayoutEnqueued;
    private final ChoreographerCompat.FrameCallback layoutCallback;
    private boolean needsUpdate;
    private ScreenFragmentWrapper parentScreenWrapper;
    protected final ArrayList<ScreenFragmentWrapper> screenWrappers;

    public ScreenContainer(Context context) {
        super(context);
        this.screenWrappers = new ArrayList<>();
        this.layoutCallback = new ChoreographerCompat.FrameCallback() { // from class: com.swmansion.rnscreens.ScreenContainer$layoutCallback$1
            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j2) {
                this.this$0.isLayoutEnqueued = false;
                ScreenContainer screenContainer = this.this$0;
                screenContainer.measure(View.MeasureSpec.makeMeasureSpec(screenContainer.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.this$0.getHeight(), 1073741824));
                ScreenContainer screenContainer2 = this.this$0;
                screenContainer2.layout(screenContainer2.getLeft(), this.this$0.getTop(), this.this$0.getRight(), this.this$0.getBottom());
            }
        };
    }

    private final void attachScreen(FragmentTransaction fragmentTransaction, Fragment fragment) {
        fragmentTransaction.add(getId(), fragment);
    }

    private final void detachScreen(FragmentTransaction fragmentTransaction, Fragment fragment) {
        fragmentTransaction.remove(fragment);
    }

    private final FragmentManager findFragmentManagerForReactRootView(ReactRootView reactRootView) {
        boolean z2;
        FragmentManager supportFragmentManager;
        Context context = reactRootView.getContext();
        while (true) {
            z2 = context instanceof FragmentActivity;
            if (z2 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!z2) {
            throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactActivity".toString());
        }
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        if (fragmentActivity.getSupportFragmentManager().getFragments().isEmpty()) {
            FragmentManager supportFragmentManager2 = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNull(supportFragmentManager2);
            return supportFragmentManager2;
        }
        try {
            supportFragmentManager = FragmentManager.findFragment(reactRootView).getChildFragmentManager();
        } catch (IllegalStateException unused) {
            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        }
        Intrinsics.checkNotNull(supportFragmentManager);
        return supportFragmentManager;
    }

    private final Screen.ActivityState getActivityState(ScreenFragmentWrapper screenFragmentWrapper) {
        return screenFragmentWrapper.getScreen().getActivityState();
    }

    private final void onScreenChanged() {
        this.needsUpdate = true;
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((ThemedReactContext) context).getReactApplicationContext().runOnUiQueueThread(new Runnable() { // from class: com.swmansion.rnscreens.ScreenContainer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                ScreenContainer.onScreenChanged$lambda$7(this.f$0);
            }
        });
    }

    public static final void onScreenChanged$lambda$7(ScreenContainer this$0) throws Exception {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.performUpdates();
    }

    private final void removeMyFragments(FragmentManager fragmentManager) throws Exception {
        CX.ud();
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        boolean z2 = false;
        for (Fragment fragment : fragmentManager.getFragments()) {
            if ((fragment instanceof ScreenFragment) && ((ScreenFragment) fragment).getScreen().getContainer() == this) {
                fragmentTransactionBeginTransaction.remove(fragment);
                z2 = true;
            }
        }
        if (z2) {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        }
    }

    private final void setFragmentManager(FragmentManager fragmentManager) throws Exception {
        this.fragmentManager = fragmentManager;
        performUpdatesNow();
    }

    private final void setupFragmentManager() throws Exception {
        boolean z2;
        Unit unit;
        ScreenContainer parent = this;
        while (true) {
            z2 = parent instanceof ReactRootView;
            if (z2 || (parent instanceof Screen) || parent.getParent() == null) {
                break;
            }
            parent = parent.getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
        }
        if (!(parent instanceof Screen)) {
            if (!z2) {
                throw new IllegalStateException("ScreenContainer is not attached under ReactRootView".toString());
            }
            setFragmentManager(findFragmentManagerForReactRootView((ReactRootView) parent));
            return;
        }
        ScreenFragmentWrapper fragmentWrapper = ((Screen) parent).getFragmentWrapper();
        if (fragmentWrapper != null) {
            this.parentScreenWrapper = fragmentWrapper;
            fragmentWrapper.addChildScreenContainer(this);
            FragmentManager childFragmentManager = fragmentWrapper.getFragment().getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            setFragmentManager(childFragmentManager);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Parent Screen does not have its Fragment attached".toString());
        }
    }

    protected ScreenFragmentWrapper adapt(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new ScreenFragment(screen);
    }

    public final void addScreen(Screen screen, int i2) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        ScreenFragmentWrapper screenFragmentWrapperAdapt = adapt(screen);
        screen.setFragmentWrapper(screenFragmentWrapperAdapt);
        this.screenWrappers.add(i2, screenFragmentWrapperAdapt);
        screen.setContainer(this);
        onScreenChanged();
    }

    public final void attachBelowTop() throws Exception {
        if (this.screenWrappers.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        FragmentTransaction fragmentTransactionCreateTransaction = createTransaction();
        Screen topScreen = getTopScreen();
        Intrinsics.checkNotNull(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        Fragment fragment = topScreen.getFragment();
        Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        detachScreen(fragmentTransactionCreateTransaction, fragment);
        ArrayList<ScreenFragmentWrapper> arrayList = this.screenWrappers;
        attachScreen(fragmentTransactionCreateTransaction, arrayList.get(arrayList.size() - 2).getFragment());
        Fragment fragment2 = topScreen.getFragment();
        Intrinsics.checkNotNull(fragment2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        attachScreen(fragmentTransactionCreateTransaction, fragment2);
        fragmentTransactionCreateTransaction.commitNowAllowingStateLoss();
    }

    protected final FragmentTransaction createTransaction() throws Exception {
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager == null) {
            throw new IllegalArgumentException("fragment manager is null when creating transaction".toString());
        }
        CX.ud();
        FragmentTransaction reorderingAllowed = fragmentManager.beginTransaction().setReorderingAllowed(true);
        Intrinsics.checkNotNullExpressionValue(reorderingAllowed, "setReorderingAllowed(...)");
        return reorderingAllowed;
    }

    public final void detachBelowTop() throws Exception {
        if (this.screenWrappers.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        FragmentTransaction fragmentTransactionCreateTransaction = createTransaction();
        ArrayList<ScreenFragmentWrapper> arrayList = this.screenWrappers;
        detachScreen(fragmentTransactionCreateTransaction, arrayList.get(arrayList.size() - 2).getFragment());
        fragmentTransactionCreateTransaction.commitNowAllowingStateLoss();
    }

    public final Screen getScreenAt(int i2) {
        return this.screenWrappers.get(i2).getScreen();
    }

    public final int getScreenCount() {
        return this.screenWrappers.size();
    }

    public final ScreenFragmentWrapper getScreenFragmentWrapperAt(int i2) {
        ScreenFragmentWrapper screenFragmentWrapper = this.screenWrappers.get(i2);
        Intrinsics.checkNotNullExpressionValue(screenFragmentWrapper, "get(...)");
        return screenFragmentWrapper;
    }

    public Screen getTopScreen() {
        Object next;
        Iterator<T> it = this.screenWrappers.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (getActivityState((ScreenFragmentWrapper) next) == Screen.ActivityState.ON_TOP) {
                break;
            }
        }
        ScreenFragmentWrapper screenFragmentWrapper = (ScreenFragmentWrapper) next;
        if (screenFragmentWrapper != null) {
            return screenFragmentWrapper.getScreen();
        }
        return null;
    }

    public boolean hasScreen(ScreenFragmentWrapper screenFragmentWrapper) {
        return CollectionsKt.contains(this.screenWrappers, screenFragmentWrapper);
    }

    public final boolean isNested() {
        return this.parentScreenWrapper != null;
    }

    public final void notifyChildUpdate() {
        performUpdatesNow();
    }

    protected void notifyContainerUpdate() {
        ScreenFragmentWrapper fragmentWrapper;
        Screen topScreen = getTopScreen();
        if (topScreen == null || (fragmentWrapper = topScreen.getFragmentWrapper()) == null) {
            return;
        }
        fragmentWrapper.onContainerUpdate();
    }

    public final void notifyTopDetached() {
        Screen topScreen = getTopScreen();
        Intrinsics.checkNotNull(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        if (getContext() instanceof ReactContext) {
            int surfaceId = UIManagerHelper.getSurfaceId(getContext());
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, topScreen.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new ScreenDismissedEvent(surfaceId, topScreen.getId()));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() throws Exception {
        super.onAttachedToWindow();
        this.isAttached = true;
        setupFragmentManager();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() throws Exception {
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager != null && !fragmentManager.isDestroyed()) {
            removeMyFragments(fragmentManager);
            fragmentManager.executePendingTransactions();
        }
        ScreenFragmentWrapper screenFragmentWrapper = this.parentScreenWrapper;
        if (screenFragmentWrapper != null) {
            screenFragmentWrapper.removeChildScreenContainer(this);
        }
        this.parentScreenWrapper = null;
        super.onDetachedFromWindow();
        this.isAttached = false;
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            removeViewAt(childCount);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            getChildAt(i6).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).measure(i2, i3);
        }
    }

    public void onUpdate() throws Exception {
        FragmentTransaction fragmentTransactionCreateTransaction = createTransaction();
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager == null) {
            throw new IllegalArgumentException("fragment manager is null when performing update in ScreenContainer".toString());
        }
        HashSet hashSet = new HashSet(fragmentManager.getFragments());
        for (ScreenFragmentWrapper screenFragmentWrapper : this.screenWrappers) {
            Intrinsics.checkNotNull(screenFragmentWrapper);
            if (getActivityState(screenFragmentWrapper) == Screen.ActivityState.INACTIVE && screenFragmentWrapper.getFragment().isAdded()) {
                detachScreen(fragmentTransactionCreateTransaction, screenFragmentWrapper.getFragment());
            }
            hashSet.remove(screenFragmentWrapper.getFragment());
        }
        HashSet hashSet2 = hashSet;
        boolean z2 = false;
        if (!hashSet2.isEmpty()) {
            for (Fragment fragment : (Fragment[]) hashSet2.toArray(new Fragment[0])) {
                if ((fragment instanceof ScreenFragment) && ((ScreenFragment) fragment).getScreen().getContainer() == null) {
                    detachScreen(fragmentTransactionCreateTransaction, fragment);
                }
            }
        }
        boolean z3 = getTopScreen() == null;
        ArrayList arrayList = new ArrayList();
        for (ScreenFragmentWrapper screenFragmentWrapper2 : this.screenWrappers) {
            Intrinsics.checkNotNull(screenFragmentWrapper2);
            Screen.ActivityState activityState = getActivityState(screenFragmentWrapper2);
            if (activityState != Screen.ActivityState.INACTIVE && !screenFragmentWrapper2.getFragment().isAdded()) {
                attachScreen(fragmentTransactionCreateTransaction, screenFragmentWrapper2.getFragment());
                z2 = true;
            } else if (activityState != Screen.ActivityState.INACTIVE && z2) {
                detachScreen(fragmentTransactionCreateTransaction, screenFragmentWrapper2.getFragment());
                arrayList.add(screenFragmentWrapper2);
            }
            screenFragmentWrapper2.getScreen().setTransitioning(z3);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            attachScreen(fragmentTransactionCreateTransaction, ((ScreenFragmentWrapper) it.next()).getFragment());
        }
        fragmentTransactionCreateTransaction.commitNowAllowingStateLoss();
    }

    public final void performUpdates() throws Exception {
        FragmentManager fragmentManager;
        if (this.needsUpdate && this.isAttached && (fragmentManager = this.fragmentManager) != null) {
            if (fragmentManager == null || !fragmentManager.isDestroyed()) {
                this.needsUpdate = false;
                onUpdate();
                notifyContainerUpdate();
            }
        }
    }

    protected final void performUpdatesNow() throws Exception {
        this.needsUpdate = true;
        performUpdates();
    }

    public void removeAllScreens() {
        Iterator<ScreenFragmentWrapper> it = this.screenWrappers.iterator();
        while (it.hasNext()) {
            it.next().getScreen().setContainer(null);
        }
        this.screenWrappers.clear();
        onScreenChanged();
    }

    public void removeScreenAt(int i2) {
        this.screenWrappers.get(i2).getScreen().setContainer(null);
        this.screenWrappers.remove(i2);
        onScreenChanged();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) throws Throwable {
        Intrinsics.checkNotNullParameter(view, C1561oA.od("L>9J", (short) (C1607wl.Xd() ^ 30951)));
        if (view == getFocusedChild()) {
            Context context = getContext();
            Object[] objArr = {C1561oA.Kd("X^aggSb[k`h^", (short) (C1633zX.Xd() ^ (-17864)))};
            Method method = Class.forName(Wg.Zd("\u001d]\u000f\u0007?l\u0012\u00176=0`\r@\u0001.m\u0015~?$\"X", (short) (C1580rY.Xd() ^ (-1599)), (short) (C1580rY.Xd() ^ (-28039)))).getMethod(Wg.vd("\\YgEjccSZ?P\\_QJK", (short) (ZN.Xd() ^ 31728)), Class.forName(C1561oA.Xd("NF\\H\u0016UKYS\u001bAcbZ`Z", (short) (C1633zX.Xd() ^ (-1301)))));
            try {
                method.setAccessible(true);
                Object objInvoke = method.invoke(context, objArr);
                Intrinsics.checkNotNull(objInvoke, Qg.kd("kqgf\u0019[Xdccg\u0012SU\u000fQN__\n]W\u0007TTR\u0010PVLK}QUK?x9E:GC<6~F83Dy489=;3*8+1%m\b,-1/\u0007\u001e,\u001f%\u0019\u0001\u0014 \u0012\u0017\u0014 ", (short) (C1580rY.Xd() ^ (-30142)), (short) (C1580rY.Xd() ^ (-940))));
                ((InputMethodManager) objInvoke).hideSoftInputFromWindow(getWindowToken(), 2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.isLayoutEnqueued || this.layoutCallback == null) {
            return;
        }
        this.isLayoutEnqueued = true;
        ReactChoreographer.Companion.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.layoutCallback);
    }
}
