package com.swmansion.gesturehandler.core;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootHelper;
import com.swmansion.gesturehandler.react.RNViewConfigurationHelper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

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
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN0ZS8\u000fsڔ<$i-yCAV\"}8\tWNmivJp\u000bK\u000f\f\u001c\u000f̓Jf\u0006~m\u0014\u001f2pģm2\u0006nZycҽ:\u0005.2j>\b\u000f\u0019\u001aXSVvCVY\u0018*0n}jZ\u001b[\u001d\u001e\"\u0006D!/\u001d#ɤP~ozlR19\u0002\u0018O~+m@\u0015M;W\u0005+\u001b\u0005y\u001eYQg;\u001b%a\u0015\u001fR\nPI?џA\u0005v:oAW\bo6\u0007\u000bD\u00199d%]!<\r\t_w$'Ye*]\u0019$6\u0010\u0013{;G4\u0012\u0014<`.[0\u0017\f\u001cJ\rr\u0002V\u0017\u0014'H\u000e\u0014y6E0FEsK)\u0001iai&~?\n\b%\"3\u0001t\"\nSTt]-b\u0013i1\u007fMmP\\\rqA}\u0004vc0)JD\u0010\u0012=\u0018).E2gcG&9o\u0012HJh%\u0004'|$u`IX\"\u001d\u0018\u000eѪ\u0015ɔ^Dlʍ<^b[D\u0013c\u001b\u0003\u000bTܴ\u001fء`wDƙu,\\V\u0001i\u0019S\u000e\u000e34~7\bt*N.ޱjۋ9Wk߄yT|\u001cMEО\tv"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001P ?MP\u001dkB-%ua\u001c\u0003l+Uv4\u001d", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "u(E", "4h]6f/+c\"\bv[3|", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "\nrTA \u0006\u0017", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001[%BTSIJ0-\u0011>", "Ash9h:\u001dO(z", "5dc g@Ec']vm(", "u(;0b4\ba+\u0007vg:\u0001\u00138/\u0002(\nO\u0011$\u0017Jk\u0017;}%B#{*Dm_\u001c\\WB{B|\u0011w]\u000f", "4h]6f/", "", "7r0;V,Lb#\fd_", "", "=sW2e", "7rE6X>\u001dW'\n\u0002Z@|\b\u0019v\u007f5WI\u000b&\u001aG|", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "@n^AI0>e", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'| \u0016Ty\u0012;@69Y\u0010i(q\u0016@#*7t3+\u001fl`\u0003\u0018g,`@\u0018KL`\u0002 9w9%\u000e$\u0015J4\u000fN6K.uD3(]", "=m7.a+ES", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "And?V,\u001ed\u0019\b\n", "=m7.a+ES{\t\f^9", "=mA2f,M", "Ag^B_+\u001bSvz\u0004\\,\u0004\u0010/d\\<", "Ag^B_++S\u0017\t|g0\u0012\t\u001di\b8\u0003O| \u0017Q\u007f\u001cC\u000b", "Ag^B_++S%\u000f~k,k\u0013!a\u00047\\J\u000ew\u0013Kv\u001eIv", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class HoverGestureHandler extends GestureHandler<HoverGestureHandler> {
    public static final Companion Companion = new Companion(null);
    private static final RNViewConfigurationHelper viewConfigHelper = new RNViewConfigurationHelper();
    private Handler handler;
    private Runnable finishRunnable = new Runnable() { // from class: com.swmansion.gesturehandler.core.HoverGestureHandler$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            HoverGestureHandler.finishRunnable$lambda$0(this.f$0);
        }
    };
    private StylusData stylusData = new StylusData(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨\u001cԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001P ?MP\u001dkB-%ua\u001c\u0003l+Uv4\u0006*X4gN{A\u001e\u001b0", "", "u(E", "DhTD66GT\u001d\u0001]^3\b\t<", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017>G;}\u0012(\u001eie;\u0017p(]z1P/N3gR\u007f\u0013", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void finish() {
        int state = getState();
        if (state == 0) {
            cancel();
        } else if (state == 2) {
            fail();
        } else {
            if (state != 4) {
                return;
            }
            end();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishRunnable$lambda$0(HoverGestureHandler this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final boolean isAncestorOf(GestureHandler<?> gestureHandler) {
        View view = gestureHandler.getView();
        while (view != null) {
            if (Intrinsics.areEqual(view, getView())) {
                return true;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return false;
    }

    private final Boolean isViewDisplayedOverAnother(View view, View view2, View view3) {
        if (Intrinsics.areEqual(view3, view2)) {
            return true;
        }
        if (Intrinsics.areEqual(view3, view)) {
            return false;
        }
        if (!(view3 instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view3;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            Boolean boolIsViewDisplayedOverAnother = isViewDisplayedOverAnother(view, view2, viewConfigHelper.getChildInDrawingOrderAtIndex(viewGroup, i2));
            if (boolIsViewDisplayedOverAnother != null) {
                return boolIsViewDisplayedOverAnother;
            }
        }
        return null;
    }

    static /* synthetic */ Boolean isViewDisplayedOverAnother$default(HoverGestureHandler hoverGestureHandler, View view, View view2, View view3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            view3 = view.getRootView();
            Intrinsics.checkNotNullExpressionValue(view3, "getRootView(...)");
        }
        return hoverGestureHandler.isViewDisplayedOverAnother(view, view2, view3);
    }

    public final StylusData getStylusData() {
        return this.stylusData;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onHandle(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (event.getAction() == 0) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.handler = null;
            return;
        }
        if (event.getAction() != 1 || isWithinBounds()) {
            return;
        }
        finish();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onHandleHover(MotionEvent motionEvent, MotionEvent motionEvent2) throws Throwable {
        Intrinsics.checkNotNullParameter(motionEvent, Ig.wd("Z\u001d>k:", (short) (C1580rY.Xd() ^ (-9874))));
        Intrinsics.checkNotNullParameter(motionEvent2, EO.Od("\u007fC\u001b|\u0016D4>w\u0011\u0015", (short) (FB.Xd() ^ 26974)));
        if (motionEvent.getAction() != 10) {
            if (!isWithinBounds()) {
                finish();
                return;
            }
            if (getState() == 4 && motionEvent.getToolType(0) == 2) {
                this.stylusData = StylusData.Companion.fromEvent(motionEvent);
                return;
            }
            if (getState() == 0) {
                if (motionEvent.getAction() == 7 || motionEvent.getAction() == 9) {
                    begin();
                    activate();
                    return;
                }
                return;
            }
            return;
        }
        if (this.handler == null) {
            short sXd = (short) (C1607wl.Xd() ^ 15186);
            int[] iArr = new int["T`Ub^WQ\u001aZ]\u00174VUUIU".length()];
            QB qb = new QB("T`Ub^WQ\u001aZ]\u00174VUUIU");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1593ug.zd("\u001d\u001c,\u0006\u001b$*\t-.0&4", (short) (OY.Xd() ^ 22989), (short) (OY.Xd() ^ 12306)), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Handler handler = this.handler;
        Intrinsics.checkNotNull(handler);
        Runnable runnable = this.finishRunnable;
        Class<?> cls = Class.forName(C1561oA.od("\u001e*\u001f,(!\u001bc$'`y\u0012\u001e\u0013\u001a\u0012\u001e", (short) (OY.Xd() ^ 27380)));
        Class<?>[] clsArr = new Class[2];
        short sXd2 = (short) (C1499aX.Xd() ^ (-17825));
        int[] iArr2 = new int["\\TjV$cYga)Nrlmacnh".length()];
        QB qb2 = new QB("\\TjV$cYga)Nrlmacnh");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        clsArr[1] = Long.TYPE;
        Object[] objArr2 = {runnable, 4L};
        Method method = cls.getMethod(Wg.Zd("-\u007fM2K6/nR\u001eh", (short) (Od.Xd() ^ (-20965)), (short) (Od.Xd() ^ (-9441))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onReset() {
        super.onReset();
        this.stylusData = new StylusData(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public boolean shouldBeCancelledBy(GestureHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (!(handler instanceof HoverGestureHandler) || ((HoverGestureHandler) handler).isAncestorOf(this)) {
            return super.shouldBeCancelledBy(handler);
        }
        View view = handler.getView();
        Intrinsics.checkNotNull(view);
        View view2 = getView();
        Intrinsics.checkNotNull(view2);
        Boolean boolIsViewDisplayedOverAnother$default = isViewDisplayedOverAnother$default(this, view, view2, null, 4, null);
        Intrinsics.checkNotNull(boolIsViewDisplayedOverAnother$default);
        return boolIsViewDisplayedOverAnother$default.booleanValue();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public boolean shouldRecognizeSimultaneously(GestureHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (((handler instanceof HoverGestureHandler) && (isAncestorOf(handler) || ((HoverGestureHandler) handler).isAncestorOf(this))) || (handler instanceof RNGestureHandlerRootHelper.RootViewGestureHandler)) {
            return true;
        }
        return super.shouldRecognizeSimultaneously(handler);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public boolean shouldRequireToWaitForFailure(GestureHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if ((handler instanceof HoverGestureHandler) && !isAncestorOf(handler) && !((HoverGestureHandler) handler).isAncestorOf(this)) {
            View view = getView();
            Intrinsics.checkNotNull(view);
            View view2 = handler.getView();
            Intrinsics.checkNotNull(view2);
            Boolean boolIsViewDisplayedOverAnother$default = isViewDisplayedOverAnother$default(this, view, view2, null, 4, null);
            if (boolIsViewDisplayedOverAnother$default != null) {
                return boolIsViewDisplayedOverAnother$default.booleanValue();
            }
        }
        return super.shouldRequireToWaitForFailure(handler);
    }
}
