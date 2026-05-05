package com.horcrux.svg;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGCircleManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGCircleManagerInterface;
import com.facebook.react.viewmanagers.RNSVGClipPathManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface;
import com.facebook.react.viewmanagers.RNSVGDefsManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGDefsManagerInterface;
import com.facebook.react.viewmanagers.RNSVGEllipseManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeBlendManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeCompositeManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeFloodManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeMergeManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeOffsetManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFilterManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFilterManagerInterface;
import com.facebook.react.viewmanagers.RNSVGForeignObjectManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface;
import com.facebook.react.viewmanagers.RNSVGGroupManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGGroupManagerInterface;
import com.facebook.react.viewmanagers.RNSVGImageManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGImageManagerInterface;
import com.facebook.react.viewmanagers.RNSVGLineManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGLineManagerInterface;
import com.facebook.react.viewmanagers.RNSVGLinearGradientManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface;
import com.facebook.react.viewmanagers.RNSVGMarkerManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface;
import com.facebook.react.viewmanagers.RNSVGMaskManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGMaskManagerInterface;
import com.facebook.react.viewmanagers.RNSVGPathManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGPathManagerInterface;
import com.facebook.react.viewmanagers.RNSVGPatternManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGPatternManagerInterface;
import com.facebook.react.viewmanagers.RNSVGRadialGradientManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface;
import com.facebook.react.viewmanagers.RNSVGRectManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGRectManagerInterface;
import com.facebook.react.viewmanagers.RNSVGSymbolManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface;
import com.facebook.react.viewmanagers.RNSVGTSpanManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface;
import com.facebook.react.viewmanagers.RNSVGTextManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGTextManagerInterface;
import com.facebook.react.viewmanagers.RNSVGTextPathManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface;
import com.facebook.react.viewmanagers.RNSVGUseManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGUseManagerInterface;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.VirtualViewManager;
import com.horcrux.svg.events.SvgLoadEvent;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes7.dex */
class RenderableViewManager<T extends RenderableView> extends VirtualViewManager<T> {

    /* JADX INFO: renamed from: com.horcrux.svg.RenderableViewManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static class CircleViewManager extends RenderableViewManager<CircleView> implements RNSVGCircleManagerInterface<CircleView> {
        public static final String REACT_CLASS = "RNSVGCircle";

        CircleViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGCircle);
            this.mDelegate = new RNSVGCircleManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004g")
        public void setCx(CircleView circleView, Dynamic dynamic) {
            circleView.setCx(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004h")
        public void setCy(CircleView circleView, Dynamic dynamic) {
            circleView.setCy(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
        public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i2) {
            super.setFillRule((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
        public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013")
        public void setR(CircleView circleView, Dynamic dynamic) {
            circleView.setR(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
        public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i2) {
            super.setStrokeLinecap((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i2) {
            super.setStrokeLinejoin((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i2) {
            super.setVectorEffect((RenderableView) view, i2);
        }
    }

    static class ClipPathViewManager extends GroupViewManagerAbstract<ClipPathView> implements RNSVGClipPathManagerInterface<ClipPathView> {
        public static final String REACT_CLASS = "RNSVGClipPath";

        ClipPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGClipPath);
            this.mDelegate = new RNSVGClipPathManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
        public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i2) {
            super.setFillRule((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000e")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000en1(}")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000er-\u0017\u007f^J")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
        public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
        public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i2) {
            super.setStrokeLinecap((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i2) {
            super.setStrokeLinejoin((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i2) {
            super.setVectorEffect((RenderableView) view, i2);
        }
    }

    static class DefsViewManager extends VirtualViewManager<DefsView> implements RNSVGDefsManagerInterface<DefsView> {
        public static final String REACT_CLASS = "RNSVGDefs";

        DefsViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGDefs);
            this.mDelegate = new RNSVGDefsManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }
    }

    static class EllipseViewManager extends RenderableViewManager<EllipseView> implements RNSVGEllipseManagerInterface<EllipseView> {
        public static final String REACT_CLASS = "RNSVGEllipse";

        EllipseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGEllipse);
            this.mDelegate = new RNSVGEllipseManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004g")
        public void setCx(EllipseView ellipseView, Dynamic dynamic) {
            ellipseView.setCx(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004h")
        public void setCy(EllipseView ellipseView, Dynamic dynamic) {
            ellipseView.setCy(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
        public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i2) {
            super.setFillRule((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
        public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013g")
        public void setRx(EllipseView ellipseView, Dynamic dynamic) {
            ellipseView.setRx(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013h")
        public void setRy(EllipseView ellipseView, Dynamic dynamic) {
            ellipseView.setRy(dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
        public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i2) {
            super.setStrokeLinecap((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i2) {
            super.setStrokeLinejoin((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i2) {
            super.setVectorEffect((RenderableView) view, i2);
        }
    }

    static class FeBlendManager extends FilterPrimitiveManager<FeBlendView> implements RNSVGFeBlendManagerInterface<FeBlendView> {
        public static final String REACT_CLASS = "RNSVGFeBlend";

        FeBlendManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeBlend);
            this.mDelegate = new RNSVGFeBlendManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tTh\u0001\u0004<")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]0")
        public void setIn1(FeBlendView feBlendView, String str) {
            feBlendView.setIn1(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]1")
        public void setIn2(FeBlendView feBlendView, String str) {
            feBlendView.setIn2(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000e^c~")
        public void setMode(FeBlendView feBlendView, String str) {
            feBlendView.setMode(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\u000f\b<")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FilterPrimitiveView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0018Xc\u000e\u0004")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FilterPrimitiveView) view, dynamic);
        }
    }

    static class FeColorMatrixManager extends FilterPrimitiveManager<FeColorMatrixView> implements RNSVGFeColorMatrixManagerInterface<FeColorMatrixView> {
        public static final String REACT_CLASS = "RNSVGFeColorMatrix";

        FeColorMatrixManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeColorMatrix);
            this.mDelegate = new RNSVGFeColorMatrixManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tTh\u0001\u0004<")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]0")
        public void setIn1(FeColorMatrixView feColorMatrixView, String str) {
            feColorMatrixView.setIn1(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\u000f\b<")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FilterPrimitiveView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015ho~")
        public void setType(FeColorMatrixView feColorMatrixView, String str) {
            feColorMatrixView.setType(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Pk\u000f\u0001;")
        public void setValues(FeColorMatrixView feColorMatrixView, @Nullable ReadableArray readableArray) {
            feColorMatrixView.setValues(readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0018Xc\u000e\u0004")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FilterPrimitiveView) view, dynamic);
        }
    }

    static class FeCompositeManager extends FilterPrimitiveManager<FeCompositeView> implements RNSVGFeCompositeManagerInterface<FeCompositeView> {
        public static final String REACT_CLASS = "RNSVGFeComposite";

        FeCompositeManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeComposite);
            this.mDelegate = new RNSVGFeCompositeManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tTh\u0001\u0004<")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]0")
        public void setIn1(FeCompositeView feCompositeView, String str) {
            feCompositeView.setIn1(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]1")
        public void setIn2(FeCompositeView feCompositeView, String str) {
            feCompositeView.setIn2(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\f ")
        public void setK1(FeCompositeView feCompositeView, float f2) {
            feCompositeView.setK1(Float.valueOf(f2));
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\f!")
        public void setK2(FeCompositeView feCompositeView, float f2) {
            feCompositeView.setK2(Float.valueOf(f2));
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\f\"")
        public void setK3(FeCompositeView feCompositeView, float f2) {
            feCompositeView.setK3(Float.valueOf(f2));
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\f#")
        public void setK4(FeCompositeView feCompositeView, float f2) {
            feCompositeView.setK4(Float.valueOf(f2));
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010_d\f|<\u001d\u000b'")
        public void setOperator1(FeCompositeView feCompositeView, String str) {
            feCompositeView.setOperator(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\u000f\b<")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FilterPrimitiveView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0018Xc\u000e\u0004")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FilterPrimitiveView) view, dynamic);
        }
    }

    static class FeFloodManager extends FilterPrimitiveManager<FeFloodView> implements RNSVGFeFloodManagerInterface<FeFloodView> {
        public static final String REACT_CLASS = "RNSVGFeFlood";

        FeFloodManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeFlood);
            this.mDelegate = new RNSVGFeFloodManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007[n\t\u007f\u000b\u001d\u0005eH")
        public void setFloodColor(FeFloodView feFloodView, @Nullable Dynamic dynamic) {
            feFloodView.setFloodColor(dynamic);
        }

        public void setFloodColor(FeFloodView feFloodView, @Nullable ReadableMap readableMap) {
            feFloodView.setFloodColor(readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007[n\t\u007f\u0017\u001eyY?D/")
        public void setFloodOpacity(FeFloodView feFloodView, float f2) {
            feFloodView.setFloodOpacity(f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tTh\u0001\u0004<")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\u000f\b<")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FilterPrimitiveView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0018Xc\u000e\u0004")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FilterPrimitiveView) view, dynamic);
        }
    }

    static class FeGaussianBlurManager extends FilterPrimitiveManager<FeGaussianBlurView> implements RNSVGFeGaussianBlurManagerInterface<FeGaussianBlurView> {
        public static final String REACT_CLASS = "RNSVGFeGaussianBlur";

        FeGaussianBlurManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeGaussianBlur);
            this.mDelegate = new RNSVGFeGaussianBlurManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Pk\u000f\u0001;")
        public void setEdgeMode(FeGaussianBlurView feGaussianBlurView, String str) {
            feGaussianBlurView.setEdgeMode(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tTh\u0001\u0004<")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]0")
        public void setIn1(FeGaussianBlurView feGaussianBlurView, String str) {
            feGaussianBlurView.setIn1(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\u000f\b<")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FilterPrimitiveView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cc]\u0001>\u0017yj??$Y")
        public void setStdDeviationX(FeGaussianBlurView feGaussianBlurView, float f2) {
            feGaussianBlurView.setStdDeviationX(f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cc]\u0001>\u0017yj??$Z")
        public void setStdDeviationY(FeGaussianBlurView feGaussianBlurView, float f2) {
            feGaussianBlurView.setStdDeviationY(f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0018Xc\u000e\u0004")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FilterPrimitiveView) view, dynamic);
        }
    }

    static class FeMergeManager extends FilterPrimitiveManager<FeMergeView> implements RNSVGFeMergeManagerInterface<FeMergeView> {
        public static final String REACT_CLASS = "RNSVGFeMerge";

        FeMergeManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeMerge);
            this.mDelegate = new RNSVGFeMergeManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tTh\u0001\u0004<")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000f^c~\u000f")
        public void setNodes(FeMergeView feMergeView, ReadableArray readableArray) {
            feMergeView.setNodes(readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\u000f\b<")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FilterPrimitiveView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0018Xc\u000e\u0004")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FilterPrimitiveView) view, dynamic);
        }
    }

    static class FeOffsetManager extends FilterPrimitiveManager<FeOffsetView> implements RNSVGFeOffsetManagerInterface<FeOffsetView> {
        public static final String REACT_CLASS = "RNSVGFeOffset";

        FeOffsetManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeOffset);
            this.mDelegate = new RNSVGFeOffsetManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005g")
        public void setDx(FeOffsetView feOffsetView, Dynamic dynamic) {
            feOffsetView.setDx(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005h")
        public void setDy(FeOffsetView feOffsetView, Dynamic dynamic) {
            feOffsetView.setDy(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tTh\u0001\u0004<")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]0")
        public void setIn1(FeOffsetView feOffsetView, String str) {
            feOffsetView.setIn1(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\u000f\b<")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FilterPrimitiveView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0018Xc\u000e\u0004")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FilterPrimitiveView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FilterPrimitiveView) view, dynamic);
        }
    }

    static class FilterManager extends VirtualViewManager<FilterView> implements RNSVGFilterManagerInterface<FilterView> {
        public static final String REACT_CLASS = "RNSVGFilter";

        FilterManager() {
            super(VirtualViewManager.SVGClass.RNSVGFilter);
            this.mDelegate = new RNSVGFilterManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:\u0003\u0007_JC")
        public void setFilterUnits(FilterView filterView, String str) {
            filterView.setFilterUnits(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tTh\u0001\u0004<")
        public void setHeight(FilterView filterView, Dynamic dynamic) {
            filterView.setHeight(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011ah\u0007\u0005<\u0017\u000f[+>\u001fur")
        public void setPrimitiveUnits(FilterView filterView, String str) {
            filterView.setPrimitiveUnits(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0018Xc\u000e\u0004")
        public void setWidth(FilterView filterView, Dynamic dynamic) {
            filterView.setWidth(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public void setX(FilterView filterView, Dynamic dynamic) {
            filterView.setX(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public void setY(FilterView filterView, Dynamic dynamic) {
            filterView.setY(dynamic);
        }
    }

    static class FilterPrimitiveManager<T extends FilterPrimitiveView> extends VirtualViewManager<T> {
        protected FilterPrimitiveManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tTh\u0001\u0004<")
        public void setHeight(T t2, Dynamic dynamic) {
            t2.setHeight(dynamic);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\u000f\b<")
        public void setResult(T t2, String str) {
            t2.setResult(str);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0018Xc\u000e\u0004")
        public void setWidth(T t2, Dynamic dynamic) {
            t2.setWidth(dynamic);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public void setX(T t2, Dynamic dynamic) {
            t2.setX(dynamic);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public void setY(T t2, Dynamic dynamic) {
            t2.setY(dynamic);
        }
    }

    static class ForeignObjectManager extends GroupViewManagerAbstract<ForeignObjectView> implements RNSVGForeignObjectManagerInterface<ForeignObjectView> {
        public static final String REACT_CLASS = "RNSVGForeignObject";

        ForeignObjectManager() {
            super(VirtualViewManager.SVGClass.RNSVGForeignObject);
            this.mDelegate = new RNSVGForeignObjectManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
        public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i2) {
            super.setFillRule((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000e")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000en1(}")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000er-\u0017\u007f^J")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tTh\u0001\u0004<")
        public void setHeight(ForeignObjectView foreignObjectView, Dynamic dynamic) {
            foreignObjectView.setHeight(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
        public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
        public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i2) {
            super.setStrokeLinecap((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i2) {
            super.setStrokeLinejoin((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i2) {
            super.setVectorEffect((RenderableView) view, i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0018Xc\u000e\u0004")
        public void setWidth(ForeignObjectView foreignObjectView, Dynamic dynamic) {
            foreignObjectView.setWidth(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public void setX(ForeignObjectView foreignObjectView, Dynamic dynamic) {
            foreignObjectView.setX(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public void setY(ForeignObjectView foreignObjectView, Dynamic dynamic) {
            foreignObjectView.setY(dynamic);
        }
    }

    static class GroupViewManager extends GroupViewManagerAbstract<GroupView> implements RNSVGGroupManagerInterface<GroupView> {
        public static final String REACT_CLASS = "RNSVGGroup";

        GroupViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGGroup);
            this.mDelegate = new RNSVGGroupManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
        public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i2) {
            super.setFillRule((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000e")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000en1(}")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000er-\u0017\u007f^J")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
        public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
        public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i2) {
            super.setStrokeLinecap((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i2) {
            super.setStrokeLinejoin((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i2) {
            super.setVectorEffect((RenderableView) view, i2);
        }
    }

    static class GroupViewManagerAbstract<U extends GroupView> extends RenderableViewManager<U> {
        GroupViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000e")
        public void setFont(U u2, Dynamic dynamic) {
            u2.setFont(dynamic);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000en1(}")
        public void setFontSize(U u2, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i2 = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()];
            if (i2 == 1) {
                javaOnlyMap.putDouble(ViewProps.FONT_SIZE, dynamic.asDouble());
            } else if (i2 != 2) {
                return;
            } else {
                javaOnlyMap.putString(ViewProps.FONT_SIZE, dynamic.asString());
            }
            u2.setFont(javaOnlyMap);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000er-\u0017\u007f^J")
        public void setFontWeight(U u2, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i2 = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()];
            if (i2 == 1) {
                javaOnlyMap.putDouble(ViewProps.FONT_WEIGHT, dynamic.asDouble());
            } else if (i2 != 2) {
                return;
            } else {
                javaOnlyMap.putString(ViewProps.FONT_WEIGHT, dynamic.asString());
            }
            u2.setFont(javaOnlyMap);
        }
    }

    static class ImageViewManager extends RenderableViewManager<ImageView> implements RNSVGImageManagerInterface<ImageView> {
        public static final String REACT_CLASS = "RNSVGImage";

        ImageViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGImage);
            this.mDelegate = new RNSVGImageManagerDelegate(this);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
            HashMap map = new HashMap();
            map.put(SvgLoadEvent.EVENT_NAME, MapBuilder.of("registrationName", "onLoad"));
            return map;
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002[h\u0001\n")
        public void setAlign(ImageView imageView, String str) {
            imageView.setAlign(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
        public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i2) {
            super.setFillRule((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tTh\u0001\u0004<")
        public void setHeight(ImageView imageView, Dynamic dynamic) {
            imageView.setHeight(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eTd\u000ej:\u0001\u0005_95")
        public void setMeetOrSlice(ImageView imageView, int i2) {
            imageView.setMeetOrSlice(i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
        public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "(~dCHYYGy\n\n", name = "\u0014ab")
        public void setSrc(ImageView imageView, @Nullable ReadableMap readableMap) {
            imageView.setSrc(readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
        public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i2) {
            super.setStrokeLinecap((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i2) {
            super.setStrokeLinejoin((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i2) {
            super.setVectorEffect((RenderableView) view, i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0018Xc\u000e\u0004")
        public void setWidth(ImageView imageView, Dynamic dynamic) {
            imageView.setWidth(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public void setX(ImageView imageView, Dynamic dynamic) {
            imageView.setX(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public void setY(ImageView imageView, Dynamic dynamic) {
            imageView.setY(dynamic);
        }
    }

    static class LineViewManager extends RenderableViewManager<LineView> implements RNSVGLineManagerInterface<LineView> {
        public static final String REACT_CLASS = "RNSVGLine";

        LineViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGLine);
            this.mDelegate = new RNSVGLineManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
        public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i2) {
            super.setFillRule((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
        public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
        public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i2) {
            super.setStrokeLinecap((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i2) {
            super.setStrokeLinejoin((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i2) {
            super.setVectorEffect((RenderableView) view, i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019 ")
        public void setX1(LineView lineView, Dynamic dynamic) {
            lineView.setX1(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019!")
        public void setX2(LineView lineView, Dynamic dynamic) {
            lineView.setX2(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a ")
        public void setY1(LineView lineView, Dynamic dynamic) {
            lineView.setY1(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a!")
        public void setY2(LineView lineView, Dynamic dynamic) {
            lineView.setY2(dynamic);
        }
    }

    static class LinearGradientManager extends VirtualViewManager<LinearGradientView> implements RNSVGLinearGradientManagerInterface<LinearGradientView> {
        public static final String REACT_CLASS = "RNSVGLinearGradient";

        LinearGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGLinearGradient);
            this.mDelegate = new RNSVGLinearGradientManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\ba`}\u0005-\u001c\r")
        public void setGradient(LinearGradientView linearGradientView, ReadableArray readableArray) {
            linearGradientView.setGradient(readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\ba`}\u0005-\u001c\rJH1$tejO\u0018")
        public void setGradientTransform(LinearGradientView linearGradientView, @Nullable ReadableArray readableArray) {
            linearGradientView.setGradientTransform(readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\ba`}\u0005-\u001c\rKD9*t")
        public void setGradientUnits(LinearGradientView linearGradientView, int i2) {
            linearGradientView.setGradientUnits(i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019 ")
        public void setX1(LinearGradientView linearGradientView, Dynamic dynamic) {
            linearGradientView.setX1(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019!")
        public void setX2(LinearGradientView linearGradientView, Dynamic dynamic) {
            linearGradientView.setX2(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a ")
        public void setY1(LinearGradientView linearGradientView, Dynamic dynamic) {
            linearGradientView.setY1(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a!")
        public void setY2(LinearGradientView linearGradientView, Dynamic dynamic) {
            linearGradientView.setY2(dynamic);
        }
    }

    static class MarkerManager extends GroupViewManagerAbstract<MarkerView> implements RNSVGMarkerManagerInterface<MarkerView> {
        public static final String REACT_CLASS = "RNSVGMarker";

        MarkerManager() {
            super(VirtualViewManager.SVGClass.RNSVGMarker);
            this.mDelegate = new RNSVGMarkerManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002[h\u0001\n")
        public void setAlign(MarkerView markerView, String str) {
            markerView.setAlign(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
        public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i2) {
            super.setFillRule((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000e")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000en1(}")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000er-\u0017\u007f^J")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:u}_=8*")
        public void setMarkerHeight(MarkerView markerView, Dynamic dynamic) {
            markerView.setMarkerHeight(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0003\u0007_JC")
        public void setMarkerUnits(MarkerView markerView, String str) {
            markerView.setMarkerUnits(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0005\u0002ZJ8")
        public void setMarkerWidth(MarkerView markerView, Dynamic dynamic) {
            markerView.setMarkerWidth(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eTd\u000ej:\u0001\u0005_95")
        public void setMeetOrSlice(MarkerView markerView, int i2) {
            markerView.setMeetOrSlice(i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eXmq")
        public void setMinX(MarkerView markerView, float f2) {
            markerView.setMinX(f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eXmr")
        public void setMinY(MarkerView markerView, float f2) {
            markerView.setMinY(f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010ah~\n<")
        public void setOrient(MarkerView markerView, String str) {
            markerView.setOrient(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
        public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Teq")
        public void setRefX(MarkerView markerView, Dynamic dynamic) {
            markerView.setRefX(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Ter")
        public void setRefY(MarkerView markerView, Dynamic dynamic) {
            markerView.setRefY(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
        public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i2) {
            super.setStrokeLinecap((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i2) {
            super.setStrokeLinejoin((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017QG~\u0005/\u0016\r")
        public void setVbHeight(MarkerView markerView, float f2) {
            markerView.setVbHeight(f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017QV\u0003\u007f<\u0016")
        public void setVbWidth(MarkerView markerView, float f2) {
            markerView.setVbWidth(f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i2) {
            super.setVectorEffect((RenderableView) view, i2);
        }
    }

    static class MaskManager extends GroupViewManagerAbstract<MaskView> implements RNSVGMaskManagerInterface<MaskView> {
        public static final String REACT_CLASS = "RNSVGMask";

        MaskManager() {
            super(VirtualViewManager.SVGClass.RNSVGMask);
            this.mDelegate = new RNSVGMaskManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
        public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i2) {
            super.setFillRule((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000e")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000en1(}")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000er-\u0017\u007f^J")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tTh\u0001\u0004<")
        public void setHeight(MaskView maskView, Dynamic dynamic) {
            maskView.setHeight(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005^7\u001c\r[DD\u000bohoP")
        public void setMaskContentUnits(MaskView maskView, int i2) {
            maskView.setMaskContentUnits(i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005oA\u001e}")
        public void setMaskType(MaskView maskView, int i2) {
            maskView.setMaskType(i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005p6\u0017\ri")
        public void setMaskUnits(MaskView maskView, int i2) {
            maskView.setMaskUnits(i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
        public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
        public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i2) {
            super.setStrokeLinecap((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i2) {
            super.setStrokeLinejoin((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i2) {
            super.setVectorEffect((RenderableView) view, i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0018Xc\u000e\u0004")
        public void setWidth(MaskView maskView, Dynamic dynamic) {
            maskView.setWidth(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public void setX(MaskView maskView, Dynamic dynamic) {
            maskView.setX(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public void setY(MaskView maskView, Dynamic dynamic) {
            maskView.setY(dynamic);
        }
    }

    static class PathViewManager extends RenderableViewManager<PathView> implements RNSVGPathManagerInterface<PathView> {
        public static final String REACT_CLASS = "RNSVGPath";

        PathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGPath);
            this.mDelegate = new RNSVGPathManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005")
        public void setD(PathView pathView, String str) {
            pathView.setD(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
        public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i2) {
            super.setFillRule((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
        public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
        public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i2) {
            super.setStrokeLinecap((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i2) {
            super.setStrokeLinejoin((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i2) {
            super.setVectorEffect((RenderableView) view, i2);
        }
    }

    static class PatternManager extends GroupViewManagerAbstract<PatternView> implements RNSVGPatternManagerInterface<PatternView> {
        public static final String REACT_CLASS = "RNSVGPattern";

        PatternManager() {
            super(VirtualViewManager.SVGClass.RNSVGPattern);
            this.mDelegate = new RNSVGPatternManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002[h\u0001\n")
        public void setAlign(PatternView patternView, String str) {
            patternView.setAlign(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
        public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i2) {
            super.setFillRule((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000e")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000en1(}")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000er-\u0017\u007f^J")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tTh\u0001\u0004<")
        public void setHeight(PatternView patternView, Dynamic dynamic) {
            patternView.setHeight(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eTd\u000ej:\u0001\u0005_95")
        public void setMeetOrSlice(PatternView patternView, int i2) {
            patternView.setMeetOrSlice(i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eXmq")
        public void setMinX(PatternView patternView, float f2) {
            patternView.setMinX(f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eXmr")
        public void setMinY(PatternView patternView, float f2) {
            patternView.setMinY(f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011Ps\u000e\u0001:\u001c[eDD\u001bosPK\u0014\u0019_")
        public void setPatternContentUnits(PatternView patternView, int i2) {
            patternView.setPatternContentUnits(i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011Ps\u000e\u0001:\u001clh7>)gnmJ")
        public void setPatternTransform(PatternView patternView, @Nullable ReadableArray readableArray) {
            patternView.setPatternTransform(readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011Ps\u000e\u0001:\u001cmd?D)")
        public void setPatternUnits(PatternView patternView, int i2) {
            patternView.setPatternUnits(i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
        public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
        public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i2) {
            super.setStrokeLinecap((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i2) {
            super.setStrokeLinejoin((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017QG~\u0005/\u0016\r")
        public void setVbHeight(PatternView patternView, float f2) {
            patternView.setVbHeight(f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017QV\u0003\u007f<\u0016")
        public void setVbWidth(PatternView patternView, float f2) {
            patternView.setVbWidth(f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i2) {
            super.setVectorEffect((RenderableView) view, i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0018Xc\u000e\u0004")
        public void setWidth(PatternView patternView, Dynamic dynamic) {
            patternView.setWidth(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public void setX(PatternView patternView, Dynamic dynamic) {
            patternView.setX(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public void setY(PatternView patternView, Dynamic dynamic) {
            patternView.setY(dynamic);
        }
    }

    static class RadialGradientManager extends VirtualViewManager<RadialGradientView> implements RNSVGRadialGradientManagerInterface<RadialGradientView> {
        public static final String REACT_CLASS = "RNSVGRadialGradient";

        RadialGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGRadialGradient);
            this.mDelegate = new RNSVGRadialGradientManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004g")
        public void setCx(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setCx(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004h")
        public void setCy(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setCy(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007g")
        public void setFx(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setFx(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007h")
        public void setFy(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setFy(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\ba`}\u0005-\u001c\r")
        public void setGradient(RadialGradientView radialGradientView, ReadableArray readableArray) {
            radialGradientView.setGradient(readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\ba`}\u0005-\u001c\rJH1$tejO\u0018")
        public void setGradientTransform(RadialGradientView radialGradientView, @Nullable ReadableArray readableArray) {
            radialGradientView.setGradientTransform(readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\ba`}\u0005-\u001c\rKD9*t")
        public void setGradientUnits(RadialGradientView radialGradientView, int i2) {
            radialGradientView.setGradientUnits(i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013g")
        public void setRx(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setRx(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013h")
        public void setRy(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setRy(dynamic);
        }
    }

    static class RectViewManager extends RenderableViewManager<RectView> implements RNSVGRectManagerInterface<RectView> {
        public static final String REACT_CLASS = "RNSVGRect";

        RectViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGRect);
            this.mDelegate = new RNSVGRectManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
        public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i2) {
            super.setFillRule((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tTh\u0001\u0004<")
        public void setHeight(RectView rectView, Dynamic dynamic) {
            rectView.setHeight(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
        public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013g")
        public void setRx(RectView rectView, Dynamic dynamic) {
            rectView.setRx(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013h")
        public void setRy(RectView rectView, Dynamic dynamic) {
            rectView.setRy(dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
        public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i2) {
            super.setStrokeLinecap((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i2) {
            super.setStrokeLinejoin((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i2) {
            super.setVectorEffect((RenderableView) view, i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0018Xc\u000e\u0004")
        public void setWidth(RectView rectView, Dynamic dynamic) {
            rectView.setWidth(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public void setX(RectView rectView, Dynamic dynamic) {
            rectView.setX(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public void setY(RectView rectView, Dynamic dynamic) {
            rectView.setY(dynamic);
        }
    }

    static class SymbolManager extends GroupViewManagerAbstract<SymbolView> implements RNSVGSymbolManagerInterface<SymbolView> {
        public static final String REACT_CLASS = "RNSVGSymbol";

        SymbolManager() {
            super(VirtualViewManager.SVGClass.RNSVGSymbol);
            this.mDelegate = new RNSVGSymbolManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002[h\u0001\n")
        public void setAlign(SymbolView symbolView, String str) {
            symbolView.setAlign(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
        public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i2) {
            super.setFillRule((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000e")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000en1(}")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000er-\u0017\u007f^J")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eTd\u000ej:\u0001\u0005_95")
        public void setMeetOrSlice(SymbolView symbolView, int i2) {
            symbolView.setMeetOrSlice(i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eXmq")
        public void setMinX(SymbolView symbolView, float f2) {
            symbolView.setMinX(f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eXmr")
        public void setMinY(SymbolView symbolView, float f2) {
            symbolView.setMinY(f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
        public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
        public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i2) {
            super.setStrokeLinecap((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i2) {
            super.setStrokeLinejoin((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017QG~\u0005/\u0016\r")
        public void setVbHeight(SymbolView symbolView, float f2) {
            symbolView.setVbHeight(f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017QV\u0003\u007f<\u0016")
        public void setVbWidth(SymbolView symbolView, float f2) {
            symbolView.setVbWidth(f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i2) {
            super.setVectorEffect((RenderableView) view, i2);
        }
    }

    static class TSpanViewManager extends TextViewManagerAbstract<TSpanView> implements RNSVGTSpanManagerInterface<TSpanView> {
        public static final String REACT_CLASS = "RNSVGTSpan";

        TSpanViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTSpan);
            this.mDelegate = new RNSVGTSpanManagerDelegate(this);
        }

        TSpanViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new RNSVGTSpanManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, @Nullable String str) {
            super.setAlignmentBaseline((TextView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003Pr~\b1\u001c}I>9\u001cu")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004^m\u000e\u00016\"")
        public void setContent(TSpanView tSpanView, @Nullable String str) {
            tSpanView.setContent(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005g")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005h")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((TextView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
        public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i2) {
            super.setFillRule((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000e")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000en1(}")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000er-\u0017\u007f^J")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]k\u0003\n-\u0001\u0002p;")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\rTm\u0001\u00100n|`KC*")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, @Nullable String str) {
            super.setLengthAdjust((TextView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
        public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013^sz\u0010-")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((TextView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
        public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i2) {
            super.setStrokeLinecap((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i2) {
            super.setStrokeLinejoin((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015Tw\u000eg-\u001c\u007fj>")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((TextView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i2) {
            super.setVectorEffect((RenderableView) view, i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tq\u000e\u0005+\u000f\u00057B9\u001do")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, @Nullable Dynamic dynamic) {
            super.setVerticalAlign((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((TextView) view, dynamic);
        }
    }

    static class TextPathViewManager extends TextViewManagerAbstract<TextPathView> implements RNSVGTextPathManagerInterface<TextPathView> {
        public static final String REACT_CLASS = "RNSVGTextPath";

        TextPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTextPath);
            this.mDelegate = new RNSVGTextPathManagerDelegate(this);
        }

        TextPathViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new RNSVGTextPathManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, @Nullable String str) {
            super.setAlignmentBaseline((TextView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003Pr~\b1\u001c}I>9\u001cu")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005g")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005h")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((TextView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
        public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i2) {
            super.setFillRule((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000e")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000en1(}")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000er-\u0017\u007f^J")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tad\u007f")
        public void setHref(TextPathView textPathView, String str) {
            textPathView.setHref(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]k\u0003\n-\u0001\u0002p;")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\rTm\u0001\u00100n|`KC*")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, @Nullable String str) {
            super.setLengthAdjust((TextView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eTs\u0002\u000b,")
        public void setMethod(TextPathView textPathView, @Nullable String str) {
            textPathView.setMethod(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public void setMidLine(TextPathView textPathView, @Nullable String str) {
            textPathView.setSharp(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
        public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013^sz\u0010-")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((TextView) view, dynamic);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eXce\u00056\u0013")
        public void setSharp(TextPathView textPathView, @Nullable String str) {
            textPathView.setSharp(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Xc~")
        public void setSide(TextPathView textPathView, @Nullable String str) {
            textPathView.setSide(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014_`|\u00056\u0015")
        public void setSpacing(TextPathView textPathView, @Nullable String str) {
            textPathView.setSpacing(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014c`\f\u0010\u0017\u0014~i;D")
        public void setStartOffset(TextPathView textPathView, Dynamic dynamic) {
            textPathView.setStartOffset(dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
        public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i2) {
            super.setStrokeLinecap((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i2) {
            super.setStrokeLinejoin((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015Tw\u000eg-\u001c\u007fj>")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((TextView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i2) {
            super.setVectorEffect((RenderableView) view, i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tq\u000e\u0005+\u000f\u00057B9\u001do")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, @Nullable Dynamic dynamic) {
            super.setVerticalAlign((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((TextView) view, dynamic);
        }
    }

    static class TextViewManager extends TextViewManagerAbstract<TextView> implements RNSVGTextManagerInterface<TextView> {
        public static final String REACT_CLASS = "RNSVGText";

        TextViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGText);
            this.mDelegate = new RNSVGTextManagerDelegate(this);
        }

        TextViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new RNSVGTextManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, @Nullable String str) {
            super.setAlignmentBaseline((TextView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003Pr~\b1\u001c}I>9\u001cu")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005g")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005h")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((TextView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
        public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i2) {
            super.setFillRule((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000e")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000en1(}")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000er-\u0017\u007f^J")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((GroupView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]k\u0003\n-\u0001\u0002p;")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\rTm\u0001\u00100n|`KC*")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, @Nullable String str) {
            super.setLengthAdjust((TextView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
        public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013^sz\u0010-")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((TextView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
        public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i2) {
            super.setStrokeLinecap((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i2) {
            super.setStrokeLinejoin((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015Tw\u000eg-\u001c\u007fj>")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((TextView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i2) {
            super.setVectorEffect((RenderableView) view, i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tq\u000e\u0005+\u000f\u00057B9\u001do")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, @Nullable Dynamic dynamic) {
            super.setVerticalAlign((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((TextView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((TextView) view, dynamic);
        }
    }

    static class TextViewManagerAbstract<K extends TextView> extends GroupViewManagerAbstract<K> {
        TextViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        public void setAlignmentBaseline(K k2, @Nullable String str) {
            k2.setMethod(str);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003Pr~\b1\u001c}I>9\u001cu")
        public void setBaselineShift(K k2, Dynamic dynamic) {
            k2.setBaselineShift(dynamic);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005g")
        public void setDx(K k2, Dynamic dynamic) {
            k2.setDeltaX(dynamic);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005h")
        public void setDy(K k2, Dynamic dynamic) {
            k2.setDeltaY(dynamic);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^m\u000e")
        public void setFont(K k2, Dynamic dynamic) {
            k2.setFont(dynamic);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]k\u0003\n-\u0001\u0002p;")
        public void setInlineSize(K k2, Dynamic dynamic) {
            k2.setInlineSize(dynamic);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\rTm\u0001\u00100n|`KC*")
        public void setLengthAdjust(K k2, @Nullable String str) {
            k2.setLengthAdjust(str);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002[h\u0001\n5\u0013\u0007j\u00181)fkdK\u0010")
        public void setMethod(K k2, @Nullable String str) {
            k2.setMethod(str);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013^sz\u0010-")
        public void setRotate(K k2, Dynamic dynamic) {
            k2.setRotate(dynamic);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015Tw\u000eg-\u001c\u007fj>")
        public void setTextLength(K k2, Dynamic dynamic) {
            k2.setTextLength(dynamic);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tq\u000e\u0005+\u000f\u00057B9\u001do")
        public void setVerticalAlign(K k2, @Nullable Dynamic dynamic) {
            k2.setVerticalAlign(dynamic);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public void setX(K k2, Dynamic dynamic) {
            k2.setPositionX(dynamic);
        }

        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public void setY(K k2, Dynamic dynamic) {
            k2.setPositionY(dynamic);
        }
    }

    static class UseViewManager extends RenderableViewManager<UseView> implements RNSVGUseManagerInterface<UseView> {
        public static final String REACT_CLASS = "RNSVGUse";

        UseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGUse);
            this.mDelegate = new RNSVGUseManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i2) {
            super.setClipRule((VirtualView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
        public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i2) {
            super.setFillRule((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tTh\u0001\u0004<")
        public void setHeight(UseView useView, Dynamic dynamic) {
            useView.setHeight(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tad\u007f")
        public void setHref(UseView useView, String str) {
            useView.setHref(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
        public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z2) {
            super.setResponsible((VirtualView) view, z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
        public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i2) {
            super.setStrokeLinecap((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i2) {
            super.setStrokeLinejoin((RenderableView) view, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i2) {
            super.setVectorEffect((RenderableView) view, i2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0018Xc\u000e\u0004")
        public void setWidth(UseView useView, Dynamic dynamic) {
            useView.setWidth(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0019")
        public void setX(UseView useView, Dynamic dynamic) {
            useView.setX(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @InterfaceC1492Gx
        @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001a")
        public void setY(UseView useView, Dynamic dynamic) {
            useView.setY(dynamic);
        }
    }

    RenderableViewManager(VirtualViewManager.SVGClass sVGClass) {
        super(sVGClass);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0004^k\t\u000e")
    public void setColor(T t2, Integer num) {
        t2.setCurrentColor(num);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u0006")
    public void setFill(T t2, @Nullable Dynamic dynamic) {
        t2.setFill(dynamic);
    }

    public void setFill(T t2, @Nullable ReadableMap readableMap) {
        t2.setFill(readableMap);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0007Xk\u0006j8\u000f{_JI")
    public void setFillOpacity(T t2, float f2) {
        t2.setFillOpacity(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0007Xk\u0006m=\u001a}")
    public void setFillRule(T t2, int i2) {
        t2.setFillRule(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007Xk\u000e\u0001:")
    public void setFilter(T t2, String str) {
        t2.setFilter(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011an\ng1!\r")
    public void setPropList(T t2, @Nullable ReadableArray readableArray) {
        t2.setPropList(readableArray);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-")
    public void setStroke(T t2, @Nullable Dynamic dynamic) {
        t2.setStroke(dynamic);
    }

    public void setStroke(T t2, @Nullable ReadableMap readableMap) {
        t2.setStroke(readableMap);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>1(s`t")
    public void setStrokeDasharray(T t2, Dynamic dynamic) {
        t2.setStrokeDasharray(dynamic);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-qyi>?\u001cgr`Q")
    public void setStrokeDashoffset(T t2, float f2) {
        t2.setStrokeDashoffset(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;3\u0017q")
    public void setStrokeLinecap(T t2, int i2) {
        t2.setStrokeLinecap(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultInt = 1, name = "\u0014cq\t\u0007-y\u0002d;:%jm")
    public void setStrokeLinejoin(T t2, int i2) {
        t2.setStrokeLinejoin(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 4.0f, name = "\u0014cq\t\u0007-z\u0002j;B\"jldQ")
    public void setStrokeMiterlimit(T t2, float f2) {
        t2.setStrokeMiterlimit(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014cq\t\u0007-|\tW99*z")
    public void setStrokeOpacity(T t2, float f2) {
        t2.setStrokeOpacity(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014cq\t\u0007-\u0005\u0002ZJ8")
    public void setStrokeWidth(T t2, Dynamic dynamic) {
        t2.setStrokeWidth(dynamic);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0017Tb\u000e\u000b:r~\\;3*")
    public void setVectorEffect(T t2, int i2) {
        t2.setVectorEffect(i2);
    }
}
