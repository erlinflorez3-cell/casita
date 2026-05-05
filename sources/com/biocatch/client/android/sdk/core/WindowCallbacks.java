package com.biocatch.client.android.sdk.core;

import android.app.Activity;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.biocatch.android.commonsdk.core.ActivityObserver;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.collection.collectors.clipboard.ClipBoardCollector;
import com.biocatch.client.android.sdk.events.interactionEvents.TouchEvent;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{B$cҕyCQU\"}(\nWN}gvJ`\u000bK\u000f\u001c\u0016\u0001j2I]xs\u0012\u0017˰JoU3UoC9fҚLӌP2P72\u0004\u001aZQX\u0016\u0005z[M\"\u0011^A\u0001>`\u000fe\u0005H\u0015\u0016D.\u00056^}MdM|aH5;\u0003\u0018IĚ+_>\u0005\u0016\u0019T]?\r%kN/NBM\u0015S_K\u0015`hW\u0003m{m\u000bv2?-_r\u0006B!\u000e\"#CO;g#*j\u0014i`:7qO,Y^\u001f@w)\u0006=@\u0012 \u001e'vAs\u001a/\u0016\u001cG\rr\u0002J\u0001\u0006lM\u0018z\u0010B]9HC9N3j\u007fw\f\u0019|љ,\t\u001b5;\u0001\u001d9,b\u001c`-\u001djv\u007f2(̸?˓R\naƝ>\u0010~h\u001a*27\u001eČ1ɨ\u0015.\u001f¦\bgG%9k0K\u001bϜxݶdh[֟#VN&\u0007\u0018M)7\u00111ըfʰoP\\Аµ\u0015g"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w?GDj>0rdh@\u0004_*T\u0005|", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\nKR?|8-)R^G\u0007p=N\u0004|", "1kX=56:`\u0018\\\u0005e3|\u0007>o\r", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JU0gO|9!\u0011$kU/\u0018ac=1m\"A&\u000f,G\u0011EuV", "5dbAh9>2\u0019\u000ez\\;\u0007\u0016", "\u001a`]1e6BRb\u0010~^>Fj/s\u000f8\t@_\u0017&Gm\u001dF\u0004z", "AbP9X\u000e>a(\u000f\b^\u000b|\u0018/c\u000f2\t", "\u001a`]1e6BRb\u0010~^>Fv-a\u0007(]@\u000f&'Tol<\u0006%3h\b-\r", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016L3`]oG\u0010\u001fYW,2\u0011\u00106K {C\u0015)\u000f3I\u007fJr\u000ea|\n>i}LZ\u000f\u0011\u000b\u0019uSrJFgn\nTA$b9d\nn'i\u0010! \u001dp&%lOw\u001b\u007fS#<@wcnGzzF3Nz[%E~U:\u00041,!bu\u001c:\"q/~+\u007fC(9.\u0001Tf%Hbw^*fI/0?J\u0012E\u0015rujA\u0017l\u001d]\u000f{bBB\u001dceq\u0012\u000f\u0018] jC+?\u00127[\u0015\u001bY}\u0003'S\u0010FYyjLw", "/sc.V/", "", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "2dc.V/", "2hb=T;<V\b\t\u000b\\/\\\u001a/n\u000f", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "=m00g0H\\\u0001~\u0004n\u0016\b\t8", ";nS2", "\u001a`]1e6BRb\u0010~^>Fd-t\u00042\u0005(\u000b\u0016\u0017\u001d", "=m00g0OW(\u0013Xa(\u0006\u000b/d", "EqP=", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w?GDj>0rdh@\u0004_*T\u0005e9PW+fdP9\u001b\u0019W\nL1\u001bvf=/yDDt", "=qX4\\5:Z", "\u001a`]1e6BRb\u0010~^>Fz3n~2\u000e~^\u0013\u001eNl\n:|z", "%h]1b>\u001cO \u0006wZ*\u0003\u0017!r{3\u0007@\u000e", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WindowCallbacks implements ActivityObserver {
    private final ClipBoardCollector clipBoardCollector;
    private final EventBusService eventBusService;
    private final GestureDetector gestureDetector;
    private final ScaleGestureDetector scaleGestureDetector;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яl\u001d<K!&i\u0016DLcz\u0007I\u0006>\u00146Ȑ\u0007\"B\u0012\u007fјnjO0LeN.ZS@\u000fs{:%c$\u007fCC٥\"}8\tWNmjvJh\u0011KƤ\u000e\u0016\u000fj4կ]xs\u0012\u00172HpG3coE9fx>\u000562*8\u007f\u0005\t\u001a@H\u0018v\u0001ES\f(0Hp@R\u0013˦\u00070Ň6>N\u007f^imޮFLz]R/Q\u0002ݦFN5`x\u000b[\u0011^TU\u0012'e,1X7c\u001ckgK\u0015`cW\u0003mvm\tv-?+w|\u001eJ!\u000e\"\u001fCO;b#*j\u000bi`:0qc,Y^\u0019@w)\u0001=@\u0012\u0014\u001e'v:s./\u0016\u001c@\rr\u0002E\u0001\u0006lH\u0018z\u0010=]9HA9G3f\u007ffk\u001d\\=\u0014\u0005;%i\u00157/ic&`C+\u0005{_Bi@kZ\u0015\u001e\"K{\u0017\tb0:44U\u0011G{?@]9\u007faG79k0X\u000b{?\u000bn}ki\u0001X\u000767,E@!\f\tI\u0015\tyglXZ)} b \u0016\bA:#\f\u000513+fQ~h\u0019i\u000e\u000e3F~7\b\u00072\" ?lPMQ\u0012 (f?*MZz\u0005\u0007krW\u001aqt(PJxn\u001e\u0017\u0014D|,YF\b\b*UD1GaEL\u00115ZA+!\u0010^v)\u0017Ta>I}l\u000b\u0017#h\\\u001f\u007f\u0018|WC\u0015`PEqUC2>UP\u0003z\u0011k'\r\u0017\u0018G\u0016QwPz-\u000eU*8F GuG?)\u000e-Eb\u0006;^dr\u0014k\u0014&o\u0001\u000b\u001f';\u00173.\u001c3~:\u0006\u0003J}YG&\u0005\u0005\u000b#6\fF\u000e*T\to{T9knM\u0001,q<|bC\u0019g,3,\b\"+E]G5I.wB4[u&y}[\u0012d%%#w40qD\bb\u007f\rxO\u0001ag,V$:k1Txn\u00066Z\tb<cLO\u0015\tVfeQCNu\u0015,%p\u0005Zǈ\u0017u\u0006ҮFa0uQ\u0001џbt"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w?GDj>0rdh@\u0004_*T\u0005e9PW+fdP9\u001b\u0019W\nL1\u001bvf=/yDDt", "\u001a`]1e6BRb\u0010~^>Fz3n~2\u000e~^\u0013\u001eNl\n:|z", "=qX4\\5:Z", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u00175?t3('F]@\u000e`(L|5\u001d3J5[_|A\u0013[k\u0012N=Vv]J#xVu|\u00043P~7f\u0007aY~", "5dc\u001ce0@W\"z\u0002", "u(;.a+K]\u001d}Do0|\u001bxW\u00041zJ\u0013UtCv\u00159r#;/", "2hb=T;<Vz~\u0004^9\u0001\u0007\u0017o\u000f,\u0006I`(\u0017P~", "", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "2hb=T;<V~~\u000f>=|\u0012>", "\u001a`]1e6BRb\u0010~^>Fn/y_9{I\u0010l", "2hb=T;<V~~\u000fL/\u0007\u0016>c\u00107[Q\u0001 &", "2hb=T;<V\u0004\t\u0006n3x\u0018/A}&{N\u000f\u001b\u0014Kv\u0012K\u000b\u0005FY\u0007/", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROKE\u001e\u001ew7", "2hb=T;<V\b\t\u000b\\/\\\u001a/n\u000f", "2hb=T;<V\b\fv\\2y\u00056l_9{I\u0010", "=m00g0H\\\u0001\ty^\r\u0001\u00123s\u0003(z", "", ";nS2", "\u001a`]1e6BRb\u0010~^>Fd-t\u00042\u0005(\u000b\u0016\u0017\u001d", "=m00g0H\\\u0001\ty^\u001a\f\u0005<t\u007f'", "=m0Ag(<V\u0019}ih\u001e\u0001\u0012.o\u0012", "=m2<a;>\\(\\}Z5~\t.", "=m2?X(MS\u0004z\u0004^3d\t8u", "4dPAh9>7\u0018", "", ";d]B", "\u001a`]1e6BRb\u0010~^>Fp/n\u0010}", "=m2?X(MS\u0004z\u0004^3m\r/w", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "=m32g(<V\u0019}[k6\u0005z3n~2\u000e", "=m<2a<\"b\u0019\u0007h^3|\u0007>e~", "7sT:", "\u001a`]1e6BRb\u0010~^>Fp/n\u0010\f\u000b@\tl", "=m<2a<(^\u0019\bz]", "=m?.a,E1 \t\t^+", "=m??X7:`\u0019ivg,\u0004", "DhTD", "=mB2T9<V\u0006~\u0007n,\u000b\u0018/d", "AdP?V/\u001ed\u0019\b\n", "\u001a`]1e6BRb\u0010~^>Fv/a\r&~ \u0012\u0017 VE", "=mF6a+Het\u000e\nk0y\u0019>e\u000e\u0006~<\n\u0019\u0017F", "/sc?f", "\u001a`]1e6BRb\u0010~^>Fz3n~2\u000e(| \u0013Io\u001bz]!Ic\u000e/\"i#*UQ\u0011", "=mF6a+Hey\txn:Z\f+n\u0002(z", "6`b\u0013b*Na", "=mF6a+He\u0007\u000evk;\u0001\u00121A}7\u007fJ\n~!Fo", "1`[9U(<Y", "\u001a`]1e6BRb\u0010~^>Fd-t\u00042\u0005(\u000b\u0016\u0017\u0006M\nC}\"1W\u0004u", "Bx_2", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public final class WindowCallbacksWrapper implements Window.Callback {
        private final Window.Callback original;
        final /* synthetic */ WindowCallbacks this$0;

        public WindowCallbacksWrapper(WindowCallbacks windowCallbacks, Window.Callback original) {
            Intrinsics.checkNotNullParameter(original, "original");
            this.this$0 = windowCallbacks;
            this.original = original;
        }

        @Override // android.view.Window.Callback
        public boolean dispatchGenericMotionEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return this.original.dispatchGenericMotionEvent(event);
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return this.original.dispatchKeyEvent(event);
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return this.original.dispatchKeyShortcutEvent(event);
        }

        @Override // android.view.Window.Callback
        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return this.original.dispatchPopulateAccessibilityEvent(event);
        }

        @Override // android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.this$0.dispatchTouchEvent(event);
            return this.original.dispatchTouchEvent(event);
        }

        @Override // android.view.Window.Callback
        public boolean dispatchTrackballEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return this.original.dispatchTrackballEvent(event);
        }

        public final Window.Callback getOriginal() {
            return this.original;
        }

        @Override // android.view.Window.Callback
        public void onActionModeFinished(ActionMode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.original.onActionModeFinished(mode);
        }

        @Override // android.view.Window.Callback
        public void onActionModeStarted(ActionMode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.original.onActionModeStarted(mode);
            this.this$0.onActionMenuOpen(mode);
        }

        @Override // android.view.Window.Callback
        public void onAttachedToWindow() {
            this.original.onAttachedToWindow();
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            this.original.onContentChanged();
        }

        @Override // android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            Intrinsics.checkNotNullParameter(menu, "menu");
            return this.original.onCreatePanelMenu(i2, menu);
        }

        @Override // android.view.Window.Callback
        public View onCreatePanelView(int i2) {
            return this.original.onCreatePanelView(i2);
        }

        @Override // android.view.Window.Callback
        public void onDetachedFromWindow() {
            this.original.onDetachedFromWindow();
        }

        @Override // android.view.Window.Callback
        public boolean onMenuItemSelected(int i2, MenuItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return this.original.onMenuItemSelected(i2, item);
        }

        @Override // android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
            Intrinsics.checkNotNullParameter(menu, "menu");
            return this.original.onMenuOpened(i2, menu);
        }

        @Override // android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
            Intrinsics.checkNotNullParameter(menu, "menu");
            this.original.onPanelClosed(i2, menu);
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            Intrinsics.checkNotNullParameter(menu, "menu");
            return this.original.onPreparePanel(i2, view, menu);
        }

        @Override // android.view.Window.Callback
        public boolean onSearchRequested() {
            return this.original.onSearchRequested();
        }

        @Override // android.view.Window.Callback
        public boolean onSearchRequested(SearchEvent searchEvent) {
            Intrinsics.checkNotNullParameter(searchEvent, "searchEvent");
            return this.original.onSearchRequested(searchEvent);
        }

        @Override // android.view.Window.Callback
        public void onWindowAttributesChanged(WindowManager.LayoutParams attrs) {
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            this.original.onWindowAttributesChanged(attrs);
        }

        @Override // android.view.Window.Callback
        public void onWindowFocusChanged(boolean z2) {
            this.original.onWindowFocusChanged(z2);
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            return this.original.onWindowStartingActionMode(callback);
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            return this.original.onWindowStartingActionMode(callback, i2);
        }
    }

    public WindowCallbacks(ClipBoardCollector clipBoardCollector, GestureDetector gestureDetector, ScaleGestureDetector scaleGestureDetector, EventBusService eventBusService) {
        Intrinsics.checkNotNullParameter(gestureDetector, "gestureDetector");
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        this.clipBoardCollector = clipBoardCollector;
        this.gestureDetector = gestureDetector;
        this.scaleGestureDetector = scaleGestureDetector;
        this.eventBusService = eventBusService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            this.gestureDetector.onTouchEvent(motionEvent);
            ScaleGestureDetector scaleGestureDetector = this.scaleGestureDetector;
            if (scaleGestureDetector != null) {
                scaleGestureDetector.onTouchEvent(motionEvent);
            }
            this.eventBusService.publish(new TouchEvent(motionEvent));
        } catch (Throwable th) {
            Log.Companion.getLogger().error("error notifying touch listeners", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActionMenuOpen(ActionMode actionMode) {
        ClipBoardCollector clipBoardCollector = this.clipBoardCollector;
        if (clipBoardCollector != null) {
            clipBoardCollector.onActionMenuOpen(actionMode);
        }
    }

    public final void attach(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        detach(activity);
        Window window = activity.getWindow();
        Window.Callback callback = window.getCallback();
        Intrinsics.checkNotNullExpressionValue(callback, "callback");
        window.setCallback(wrap(callback));
    }

    public final void detach(Activity activity) {
        if (activity != null) {
            Window window = activity.getWindow();
            Window.Callback callback = window.getCallback();
            if (callback instanceof WindowCallbacksWrapper) {
                window.setCallback(((WindowCallbacksWrapper) callback).getOriginal());
            }
        }
    }

    @Override // com.biocatch.android.commonsdk.core.ActivityObserver
    public void onActivityChanged(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        attach(activity);
    }

    public final WindowCallbacksWrapper wrap(Window.Callback original) {
        Intrinsics.checkNotNullParameter(original, "original");
        return new WindowCallbacksWrapper(this, original);
    }
}
