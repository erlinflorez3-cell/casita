package com.facebook.react.runtime;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.facebook.common.logging.FLog;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.JSPointerDispatcher;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.systrace.Systrace;
import java.util.Objects;
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
@Metadata(bv = {}, d1 = {"Яh\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG6L͜P.hS2şs{J$cҕyCQU\"}(\nWNupvJ`\u000bK\u000f\u0014\u0016\u0001̓4Ikxe\u0012\u00153JoU3UڎE9n\u0001>\u0005&3*8\b\u0006\t\u001a0K\u0018v\u0011CS\f\u0018=V\u0081X\u0006=M3\u0019J\u0005q`\u0016.buNNJ\u0003\\h03\u0007wDf'\u000e3ƊQ\rTXo#\u0005s6+nJe\u00193g\u001b\u0007\u0001po\u0007M\bU\u0005\u00177m=\u0012\u0002eMp\u007fB([S\u001bq\u000b&\u000b\u001a\u0018rT/9g{Mf\rV\u0011A\u0010UB\u0012(\u001e'vIs./\u000e\u001cO\rr\u0002F\u0017\u0016'P\u000e\u0018y6E8079W3f\u007f\u0001\u0002-\u0017=\n%%\u001eQ\u001155$Z\u001c\u0002-\u001b\u0003\b\u0018E\u001aFKjf\n\bM4\u00189x\u0010M\u001c0u\u0013_\u007f\u001fR/%e\u0001i'/\u0012\u001aHr|=\u0019)\u0001a\u0011jHn5\u001f\u001cEN!\u000epC\u0013*\u001cTb~D\u0011{1\u001b\u001bF6!Htwj4U\u0014\\x\u0001i\u0019]\u000e\u000e3Y~7\bt\u001c\u0012edv3cW\u0014\u0014o~\u000f\u0014mB\u0013\tf\u0014ZS:`#:jHV\u0019(w*W~\u0010!CWqJ:\\5'a-H1$\tSE\u0017m\n\u0001\u0010-gc(\u0011\u001a<t7\u0011\u0017p9}u*a,+sR1O\u0004M\u0019Teh|\u0005\t1\f\u0017s.M>չSƥp\u0016}ɝL.$!QSE<A\u0017UǾ>ī1ETǩ6][\u001b?z+\u0004e\u0093j\u05cek\brѱ|lxLgTE%Mܨtן\fd\bט2X\tR{T9gt\nIÈ[\u0084R<\u0015\u0007%+3\u000f@.\u000bDECU-lߓ ڏ\u0019aeɐ@:\bs'&#kZϽo݁sbYϡя?l"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006c%1W\r\u000eGz\u0017*KC,o40j", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015V\\\u0018F\u0006\u00169Y\u0010u", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Ata3T*>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006c%1W\r\u000eGz\u0017*KC\u001fs?%j", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~Zy\u001e7j 8S\rHk0\u001c$2nI\u0010r0Vvp4LJ*k@\u0003J\u0015\u000eX\u000e23\u0018\f/\u0005\u0015", "6dX4[;&S\u0015\r\u000bk,j\u0014/c", "", "8r?<\\5MS&]~l7x\u0018-h\u007f5", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001aGh*;v%.Z\"?y?\u001a$fd9\u00149", "8rC<h*A2\u001d\r\u0006Z;z\f/r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001aGl*Gk\u0019\rQQFgC\u001c\u0018hn\u000f", "DhTDc6Kb\u0003\u007f{l,\f", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&l", "5dc#\\,P^#\f\nH-}\u0017/t", "u(;.a+K]\u001d}D`9x\u00142i}6E+\u000b\u001b VE", "E`b\u001aX(Lc&~y", "", "EhSA[\u0014>O'\u000f\b^\u001a\b\t-", "2hb=T;<V}leh0\u0006\u0018/r_9{I\u0010", "", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "7r2.c;N`\u0019", "2hb=T;<V}lih<z\f\u000fv\u007f1\u000b", "5dc\u0010h9KS\"\u000eg^(z\u0018\ro\t7{S\u0010", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "5dc\u0017F\u0014HR)\u0006zG(\u0005\t", "", "5dc\"<\u0014:\\\u0015\u0001zk\u001b\u0011\u0014/", "6`]1_,\u001ef\u0017~\u0006m0\u0007\u0012", "B", "", "6`b\u000eV;Bd\u0019kzZ*\ff9n\u000f(\u000fO", "6`b\u000eV;Bd\u0019kzZ*\fl8s\u000f$\u0005>\u0001", "7rE6X>\u001ab(zxa,{w9R\u007f$yOd %Vk\u0017:v", "=m25\\3=3\"}z]\u0015x\u00183v\u007f\n{N\u0010'$G", "1gX9W\u001dBS+", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "3u", "=m25\\3=A(z\bm,{q+t\u00049{\"\u0001%&W|\u000e", "=m;.l6Nb", "1gP;Z,=", ":dUA", "Bn_", "@hV5g", "0ncAb4", "=m<2T:N`\u0019", "@d`BX:M2\u001d\rve3\u0007\u001b\u0013n\u000f(\t>\u0001\"&6y\u001e:y\u0005FY\u0007/", "2hb._3He|\b\n^9z\t:t", "Adc\u0016f\r:P&\u0003x", "7r5.U9BQ", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReactSurfaceView extends ReactRootView {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "ReactSurfaceView";
    private int heightMeasureSpec;
    private JSPointerDispatcher jsPointerDispatcher;
    private final JSTouchDispatcher jsTouchDispatcher;
    private final ReactSurfaceImpl surface;
    private boolean wasMeasured;
    private int widthMeasureSpec;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӯ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006c%1W\r\u000eGz\u0017*KC,o40SFkA\u0012_5R\u00010\u001d", "", "u(E", "\"@6", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactSurfaceView(Context context, ReactSurfaceImpl surface) {
        super(context);
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.surface = surface;
        ReactSurfaceView reactSurfaceView = this;
        this.jsTouchDispatcher = new JSTouchDispatcher(reactSurfaceView);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.jsPointerDispatcher = new JSPointerDispatcher(reactSurfaceView);
        }
    }

    private final Point getViewportOffset() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }

    @Override // com.facebook.react.ReactRootView
    protected void dispatchJSPointerEvent(MotionEvent event, boolean z2) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.jsPointerDispatcher == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                FLog.w(TAG, "Unable to dispatch pointer events to JS before the dispatcher is available");
                return;
            }
            return;
        }
        EventDispatcher eventDispatcher = this.surface.getEventDispatcher();
        if (eventDispatcher == null) {
            FLog.w(TAG, "Unable to dispatch pointer events to JS as the React instance has not been attached");
            return;
        }
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.handleMotionEvent(event, eventDispatcher, z2);
        }
    }

    @Override // com.facebook.react.ReactRootView
    protected void dispatchJSTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        EventDispatcher eventDispatcher = this.surface.getEventDispatcher();
        if (eventDispatcher != null) {
            this.jsTouchDispatcher.handleTouchEvent(event, eventDispatcher, this.surface.getReactHost().getCurrentReactContext());
        } else {
            FLog.w(TAG, "Unable to dispatch touch events to JS as the React instance has not been attached");
        }
    }

    @Override // com.facebook.react.ReactRootView
    public ReactContext getCurrentReactContext() {
        if (this.surface.isAttached()) {
            return this.surface.getReactHost().getCurrentReactContext();
        }
        return null;
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.ReactRoot
    public String getJSModuleName() {
        String moduleName = this.surface.getModuleName();
        Intrinsics.checkNotNullExpressionValue(moduleName, "<get-moduleName>(...)");
        return moduleName;
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.ReactRoot
    public int getUIManagerType() {
        return 2;
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.RootView
    public void handleException(Throwable t2) {
        Intrinsics.checkNotNullParameter(t2, "t");
        ReactHostImpl reactHost = this.surface.getReactHost();
        Intrinsics.checkNotNullExpressionValue(reactHost, "getReactHost(...)");
        String string = Objects.toString(t2.getMessage(), "");
        Intrinsics.checkNotNull(string);
        reactHost.handleHostException(new IllegalViewOperationException(string, this, t2));
    }

    @Override // com.facebook.react.ReactRootView
    public boolean hasActiveReactContext() {
        return this.surface.isAttached() && this.surface.getReactHost().getCurrentReactContext() != null;
    }

    @Override // com.facebook.react.ReactRootView
    public boolean hasActiveReactInstance() {
        return this.surface.isAttached() && this.surface.getReactHost().isInstanceInitialized();
    }

    @Override // com.facebook.react.ReactRootView
    public boolean isViewAttachedToReactInstance() {
        return this.surface.isAttached();
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.RootView
    public void onChildEndedNativeGesture(View childView, MotionEvent ev) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(ev, "ev");
        EventDispatcher eventDispatcher = this.surface.getEventDispatcher();
        if (eventDispatcher == null) {
            return;
        }
        this.jsTouchDispatcher.onChildEndedNativeGesture(ev, eventDispatcher);
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.onChildEndedNativeGesture();
        }
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.RootView
    public void onChildStartedNativeGesture(View view, MotionEvent ev) {
        JSPointerDispatcher jSPointerDispatcher;
        Intrinsics.checkNotNullParameter(ev, "ev");
        EventDispatcher eventDispatcher = this.surface.getEventDispatcher();
        if (eventDispatcher == null) {
            return;
        }
        this.jsTouchDispatcher.onChildStartedNativeGesture(ev, eventDispatcher);
        if (view == null || (jSPointerDispatcher = this.jsPointerDispatcher) == null) {
            return;
        }
        jSPointerDispatcher.onChildStartedNativeGesture(view, ev, eventDispatcher);
    }

    @Override // com.facebook.react.ReactRootView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (this.wasMeasured && z2) {
            Point viewportOffset = getViewportOffset();
            this.surface.updateLayoutSpecs(this.widthMeasureSpec, this.heightMeasureSpec, viewportOffset.x, viewportOffset.y);
        }
    }

    @Override // com.facebook.react.ReactRootView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int iMax;
        int iMax2;
        Systrace.beginSection(0L, "ReactSurfaceView.onMeasure");
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int childCount = getChildCount();
            iMax = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                iMax = Math.max(iMax, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
            }
        } else {
            iMax = View.MeasureSpec.getSize(i2);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int childCount2 = getChildCount();
            iMax2 = 0;
            for (int i5 = 0; i5 < childCount2; i5++) {
                View childAt2 = getChildAt(i5);
                iMax2 = Math.max(iMax2, childAt2.getTop() + childAt2.getMeasuredHeight() + childAt2.getPaddingTop() + childAt2.getPaddingBottom());
            }
        } else {
            iMax2 = View.MeasureSpec.getSize(i3);
        }
        setMeasuredDimension(iMax, iMax2);
        this.wasMeasured = true;
        this.widthMeasureSpec = i2;
        this.heightMeasureSpec = i3;
        Point viewportOffset = getViewportOffset();
        this.surface.updateLayoutSpecs(i2, i3, viewportOffset.x, viewportOffset.y);
        Systrace.endSection(0L);
    }

    @Override // com.facebook.react.ReactRootView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    @Override // com.facebook.react.ReactRootView
    public void setIsFabric(boolean z2) {
        super.setIsFabric(true);
    }
}
