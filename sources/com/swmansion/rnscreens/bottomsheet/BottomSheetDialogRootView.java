package com.swmansion.rnscreens.bottomsheet;

import android.view.MotionEvent;
import android.view.View;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.JSPointerDispatcher;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.ReactViewGroup;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.Zݷ2\u000f\u0002{<$a%yCIU\"Ԃ*\t]OogtJb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0012\u00172PxG3SrE9nz>\u0005&8(=\u0010ڎ\u001f>ZH>u+Cy\fJ/d1Ob\u0013[\u00062\u0014\u001c=N\u0003.`uQNH\u001baƠ3#\u0011n\u000b^5kH|{\u001avZ5\u001b\u000fc4*nF{)mi\u0011\u0017j[m\u0010ouK\u0016\u0001'U=yweIp\u007fB)qcUk\u0001;t\u0005\u007fm<+9b{K~\"n\rC\u0012\u001bQ\u001c\u000e44x2;+~\b<E%vaSh\u0002\rVF\u000f*D%;\u00183YPKj_tS\u0019|KB\u0019U,1\u0019\u0007!\nk>d#.lw\u007fE\u0018T\u0006V\\#q=\u001c\u001b!f\u0010=\u001c0u\u0014u\u0010Y\\%?O[g0Qo\u0010c\\g%\u001c\u0011la\u0006jHn?\u001f\u001aEH!\f\ta\u0015\tyolXZ.} b'\u0016\bA=#\n\u0005/31fO\u0017\u0001\u001bQk\u001d=/\u0015K \u00034\u001ce[v3c^\u0014\u0014ou\u000f\u0014mS)\u0019)rPV$Z\u000b,xøJн\u0014w\u0004ͩ\u001f\u001a!8Ws23Z8o¥!Ƞ\u0007\u001eJˆM\u0015mb\u0001\u0010-]\nɷ\u0005Ȑ(t\u0011ɖ!m~p\u007fz_++bĘ1GYځ1([,v?ē',"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011l\u0018K\u0006/=g\u0001 7|_\u000bWRJu<\f\u0018haHeg(U\u0001)4VX;MVrOi", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001f@v7~F}\u001c5|\u00072MU\u001dx>. >", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\"c\b/(q\u0016@#", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "3uT;g\u000bBa$z\n\\/|\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\u0013\"#s]H\u0005f,[L", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r}Av%.`R\u0011R2(\u001d2b5\u0005c)X\u0001-\u0011YN(Za<M\u0018\u001aV\u0017J-\r\u0012#A5nMF-Q\fZ\u0002Dw_\u0010$\u00191ynEV\u001d\u001d=\u0006", "8r?<\\5MS&]~l7x\u0018-h\u007f5", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001aGh*;v%.Z\"?y?\u001a$fd9\u00149", "8rC<h*A2\u001d\r\u0006Z;z\f/r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001aGl*Gk\u0019\rQQFgC\u001c\u0018hn\u000f", "5dc\u001fX(<bv\t\u0004m,\u0010\u0018", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\u00125U{/\u0015w\u001f=MVJA", "6`]1_,\u001ef\u0017~\u0006m0\u0007\u0012", "", "Bga<j(;Z\u0019", "", "=m25\\3=3\"}z]\u0015x\u00183v\u007f\n{N\u0010'$G", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "=m25\\3=A(z\bm,{q+t\u00049{\"\u0001%&W|\u000e", "=m7<i,K3*~\u0004m", "", "=m8;g,KQ\u0019\n\nA6\u000e\t<E\u0011(\u0005O", "=m8;g,KQ\u0019\n\nM6\r\u00072E\u0011(\u0005O", "=m;.l6Nb", "1gP;Z,=", Global.COLON, "", "B", "@", AdkSettings.PLATFORM_TYPE_MOBILE, "=mC<h*A3*~\u0004m", "@d`BX:M2\u001d\rve3\u0007\u001b\u0013n\u000f(\t>\u0001\"&6y\u001e:y\u0005FY\u0007/", "2hb._3He|\b\n^9z\t:t", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class BottomSheetDialogRootView extends ReactViewGroup implements RootView {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "BottomSheetDialogRootView";
    private final EventDispatcher eventDispatcher;
    private JSPointerDispatcher jsPointerDispatcher;
    private final JSTouchDispatcher jsTouchDispatcher;
    private final ReactContext reactContext;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011l\u0018K\u0006/=g\u0001 7|_\u000bWRJu<\f\u0018haHeg(U\u0001)4VX;MVrORod\u0016Y'\u0016\tcJy", "", "u(E", "\"@6", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetDialogRootView(ReactContext reactContext, EventDispatcher eventDispatcher) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(eventDispatcher, "eventDispatcher");
        this.reactContext = reactContext;
        this.eventDispatcher = eventDispatcher;
        BottomSheetDialogRootView bottomSheetDialogRootView = this;
        this.jsTouchDispatcher = new JSTouchDispatcher(bottomSheetDialogRootView);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.jsPointerDispatcher = new JSPointerDispatcher(bottomSheetDialogRootView);
        }
    }

    public final ReactContext getReactContext() {
        return this.reactContext;
    }

    @Override // com.facebook.react.uimanager.RootView
    public void handleException(Throwable th) {
    }

    @Override // com.facebook.react.uimanager.RootView
    public void onChildEndedNativeGesture(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        this.jsTouchDispatcher.onChildEndedNativeGesture(event, this.eventDispatcher);
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.onChildEndedNativeGesture();
        }
    }

    @Override // com.facebook.react.uimanager.RootView
    @Deprecated(message = "\u0007K\fGvw\u0016k]Kg|iT\u001eS]O\u001dfri [\rK")
    @InterfaceC1492Gx
    public void onChildStartedNativeGesture(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        throw new IllegalStateException("Deprecated onChildStartedNativeGesture was called");
    }

    @Override // com.facebook.react.uimanager.RootView
    public void onChildStartedNativeGesture(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        this.jsTouchDispatcher.onChildStartedNativeGesture(event, this.eventDispatcher);
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.onChildStartedNativeGesture(view, event, this.eventDispatcher);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.handleMotionEvent(event, this.eventDispatcher, false);
        }
        return super.onHoverEvent(event);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.handleMotionEvent(event, this.eventDispatcher, true);
        }
        return super.onHoverEvent(event);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.jsTouchDispatcher.handleTouchEvent(event, this.eventDispatcher);
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.handleMotionEvent(event, this.eventDispatcher, true);
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (z2) {
            getChildCount();
            getChildAt(0).layout(i2, i3, i4, i5);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.jsTouchDispatcher.handleTouchEvent(event, this.eventDispatcher);
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.handleMotionEvent(event, this.eventDispatcher, false);
        }
        super.onTouchEvent(event);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
    }
}
