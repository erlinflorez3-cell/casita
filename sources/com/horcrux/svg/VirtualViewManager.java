package com.horcrux.svg;

import android.graphics.Matrix;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.dynatrace.android.agent.Global;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.MatrixMathHelper;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.TransformHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.horcrux.svg.VirtualView;
import java.util.Locale;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes7.dex */
class VirtualViewManager<V extends VirtualView> extends ViewGroupManager<VirtualView> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    protected final String mClassName;
    protected ViewManagerDelegate<V> mDelegate;
    protected final SVGClass svgClass;
    private static final MatrixMathHelper.MatrixDecompositionContext sMatrixDecompositionContext = new MatrixMathHelper.MatrixDecompositionContext();
    private static final double[] sTransformDecompositionArray = new double[16];
    private static final SparseArray<RenderableView> mTagToRenderableView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    /* JADX INFO: renamed from: com.horcrux.svg.VirtualViewManager$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass;

        static {
            int[] iArr = new int[SVGClass.values().length];
            $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass = iArr;
            try {
                iArr[SVGClass.RNSVGGroup.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGPath.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGCircle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGEllipse.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGLine.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGRect.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGText.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGTSpan.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGTextPath.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGImage.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGClipPath.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGDefs.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGUse.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGSymbol.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGLinearGradient.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGRadialGradient.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGPattern.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGMask.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGFilter.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGFeBlend.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGFeColorMatrix.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGFeComposite.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGFeFlood.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGFeGaussianBlur.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGFeMerge.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGFeOffset.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGMarker.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[SVGClass.RNSVGForeignObject.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
        }
    }

    static class RenderableShadowNode extends LayoutShadowNode {
        RenderableShadowNode() {
        }

        @ReactPropGroup(customType = "0/333-@6=';?5)\"!", names = {"s\u007f}|\u0005j}\u0006\u0001", "s\u007f}|\u0005`\r~\b\u000f", "u\u0003\u0001\u0002w\b\fz|\b\u0002", "x\u007fy\u000e", "x\u007fy\u000eXx\f\u0003\u000e", "x\u007fy\u000eZ\u0001\u000b~}\u0010\u0006\r\r", "x\u007fy\u000e]\n\b\u0011", "x\u007fy\u000ei\u007f\u000b\u0003\t\u0007", "x\u007fy\u000em\ny\n", "|\t\b\n\u007f}\u0012\\\n\n\u0011\u0003\r\u0014", "\u0002\ny\b|\u0004\b\u0011", "s\u007f}|\u0005Z\b\b\u000f\u0001\u000b\u0012", "v|\b\u0006\u0003x\u0012", "\u0003\u0003\b~\u000b\u0001\b\b", "\u0005|{}\u000b", "\u0007\u0003\u0005", "t\u0003\t\n\u0006\u0005", "~xz\n", "\u0006\bu\b\u000b", "w\u0002x", "\n|x\n~", "zx}|~\f", "\u007f|\u0003l\u007f{\r\u0002", "\u007ft\rl\u007f{\r\u0002", "\u007f|\u0003]{\u0001\u007f\u0002\u000f", "\u007ft\r]{\u0001\u007f\u0002\u000f", "\u007ft\u0007|\u007f\u0006", "\u007ft\u0007|\u007f\u0006n~\r\u0010\u0006\u0001\u007f\f", "\u007ft\u0007|\u007f\u0006`\t\r\u0005\u0017\r\r\u0014\u0002\u000e", "\u007ft\u0007|\u007f\u0006d~\u0001\u0010", "\u007ft\u0007|\u007f\u0006j\u0003\u0002\u0004\u0011", "\u007ft\u0007|\u007f\u0006l\t\u000b", "\u007ft\u0007|\u007f\u0006Z\t\u000f\u0010\f\u000b", "\u007ft\u0007|\u007f\u0006k\u000e{\u000e\u0011", "\u007ft\u0007|\u007f\u0006]\b~", "\u0003txy\u007f\u0006\u007f", "\u0003txy\u007f\u0006\u007fo\u007f\u000e\u0011\u0007\u0002\u0001\r", "\u0003txy\u007f\u0006\u007fa\n\u000e\u0006\u0018\u000e\u000e\u0015\u0003\u000f", "\u0003txy\u007f\u0006\u007fe\u007f\u0002\u0011", "\u0003txy\u007f\u0006\u007fk\u0004\u0003\u0005\u0012", "\u0003txy\u007f\u0006\u007fm\n\f", "\u0003txy\u007f\u0006\u007f[\n\u0010\u0011\r\f", "\u0003txy\u007f\u0006\u007fl\u000f|\u000f\u0012", "\u0003txy\u007f\u0006\u007f^\t\u007f", "t\u0003\u0007y{\no\u0003~\u0010\u0005", "t\u0003\u0007y{\nk\u000e{\u000e\u0011t\b\u0004\u0015\n", "t\u0003\u0007y{\n]\b~r\u0006\u0002\u0013\b", "t\u0003\u0007y{\nl\t\u000br\u0006\u0002\u0013\b", "t\u0003\u0007y{\nZ\t\u000f\u0010\f\u000bu\t\u0005\u0016\u000b", "t\u0003\u0007y{\nd~\u0001\u0010s\u0007\u0003\u0014\t", "t\u0003\u0007y{\nj\u0003\u0002\u0004\u0011t\b\u0004\u0015\n"})
        @InterfaceC1492Gx
        public void ignoreLayoutProps(int i2, Dynamic dynamic) {
        }
    }

    protected enum SVGClass {
        RNSVGGroup,
        RNSVGPath,
        RNSVGText,
        RNSVGTSpan,
        RNSVGTextPath,
        RNSVGImage,
        RNSVGCircle,
        RNSVGEllipse,
        RNSVGLine,
        RNSVGRect,
        RNSVGClipPath,
        RNSVGDefs,
        RNSVGUse,
        RNSVGSymbol,
        RNSVGLinearGradient,
        RNSVGRadialGradient,
        RNSVGPattern,
        RNSVGMask,
        RNSVGFilter,
        RNSVGFeBlend,
        RNSVGFeColorMatrix,
        RNSVGFeComposite,
        RNSVGFeFlood,
        RNSVGFeGaussianBlur,
        RNSVGFeMerge,
        RNSVGFeOffset,
        RNSVGMarker,
        RNSVGForeignObject
    }

    protected VirtualViewManager(SVGClass sVGClass) {
        this.svgClass = sVGClass;
        this.mClassName = sVGClass.toString();
    }

    @Nullable
    static RenderableView getRenderableViewByTag(int i2) {
        return mTagToRenderableView.get(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateSvgView(V v2) {
        SvgView svgView = v2.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
        if (v2 instanceof TextView) {
            ((TextView) v2).getTextContainer().clearChildCache();
        }
    }

    static void runWhenViewIsAvailable(int i2, Runnable runnable) {
        mTagToRunnable.put(i2, runnable);
    }

    private static float sanitizeFloatPropertyValue(float f2) {
        if (f2 >= -3.4028235E38f && f2 <= Float.MAX_VALUE) {
            return f2;
        }
        if (f2 < -3.4028235E38f || f2 == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f2 > Float.MAX_VALUE || f2 == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f2)) {
            return 0.0f;
        }
        throw new IllegalStateException("Invalid float property value: " + f2);
    }

    static void setRenderableView(int i2, RenderableView renderableView) {
        mTagToRenderableView.put(i2, renderableView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i2);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@Nonnull ThemedReactContext themedReactContext, @Nonnull VirtualView virtualView) {
        super.addEventEmitters(themedReactContext, virtualView);
        virtualView.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.horcrux.svg.VirtualViewManager.1
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                if (view instanceof VirtualView) {
                    VirtualViewManager.this.invalidateSvgView((VirtualView) view);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
                if (view instanceof VirtualView) {
                    VirtualViewManager.this.invalidateSvgView((VirtualView) view);
                }
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new RenderableShadowNode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public VirtualView createViewInstance(@Nonnull ThemedReactContext themedReactContext) {
        switch (AnonymousClass2.$SwitchMap$com$horcrux$svg$VirtualViewManager$SVGClass[this.svgClass.ordinal()]) {
            case 1:
                return new GroupView(themedReactContext);
            case 2:
                return new PathView(themedReactContext);
            case 3:
                return new CircleView(themedReactContext);
            case 4:
                return new EllipseView(themedReactContext);
            case 5:
                return new LineView(themedReactContext);
            case 6:
                return new RectView(themedReactContext);
            case 7:
                return new TextView(themedReactContext);
            case 8:
                return new TSpanView(themedReactContext);
            case 9:
                return new TextPathView(themedReactContext);
            case 10:
                return new ImageView(themedReactContext);
            case 11:
                return new ClipPathView(themedReactContext);
            case 12:
                return new DefsView(themedReactContext);
            case 13:
                return new UseView(themedReactContext);
            case 14:
                return new SymbolView(themedReactContext);
            case 15:
                return new LinearGradientView(themedReactContext);
            case 16:
                return new RadialGradientView(themedReactContext);
            case 17:
                return new PatternView(themedReactContext);
            case 18:
                return new MaskView(themedReactContext);
            case 19:
                return new FilterView(themedReactContext);
            case 20:
                return new FeBlendView(themedReactContext);
            case 21:
                return new FeColorMatrixView(themedReactContext);
            case 22:
                return new FeCompositeView(themedReactContext);
            case 23:
                return new FeFloodView(themedReactContext);
            case 24:
                return new FeGaussianBlurView(themedReactContext);
            case 25:
                return new FeMergeView(themedReactContext);
            case 26:
                return new FeOffsetView(themedReactContext);
            case 27:
                return new MarkerView(themedReactContext);
            case 28:
                return new ForeignObjectView(themedReactContext);
            default:
                throw new IllegalStateException("Unexpected type " + this.svgClass.toString());
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return RenderableShadowNode.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@Nonnull VirtualView virtualView) {
        super.onAfterUpdateTransaction(virtualView);
        invalidateSvgView(virtualView);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@Nonnull VirtualView virtualView) {
        super.onDropViewInstance(virtualView);
        mTagToRenderableView.remove(virtualView.getId());
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nk)\"\u0001")
    public void setClipPath(V v2, String str) {
        v2.setClipPath(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004[h\nm=\u001a}")
    public void setClipRule(V v2, int i2) {
        v2.setClipRule(i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005Xr\n\b)'")
    public void setDisplay(V v2, String str) {
        v2.setDisplay(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:r\u0007Z")
    public void setMarkerEnd(V v2, String str) {
        v2.setMarkerEnd(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:z\u0002Z")
    public void setMarkerMid(V v2, String str) {
        v2.setMarkerMid(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePq\u0005\u0001:\u0001\rWHD")
    public void setMarkerStart(V v2, String str) {
        v2.setMarkerStart(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePr\u0005")
    public void setMask(V v2, String str) {
        v2.setMask(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000ePs\f\u0005@")
    public void setMatrix(V v2, Dynamic dynamic) {
        v2.setMatrix(dynamic);
    }

    public void setMatrix(V v2, @Nullable ReadableArray readableArray) {
        v2.setMatrix(readableArray);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPl~")
    public void setName(V v2, String str) {
        v2.setName(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
    public void setOpacity(@Nonnull V v2, float f2) {
        v2.setOpacity(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011^h\b\u0010- ]l;>*t")
    public void setPointerEvents(V v2, @Nullable String str) {
        if (str == null) {
            v2.setPointerEvents(PointerEvents.AUTO);
        } else {
            v2.setPointerEvents(PointerEvents.valueOf(str.toUpperCase(Locale.US).replace(Global.HYPHEN, Global.UNDERSCORE)));
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\n\u000b6!\u0002XB5")
    public void setResponsible(V v2, boolean z2) {
        v2.setResponsible(z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015a`\b\u000f.\u001d\u000bc")
    public void setTransform(V v2, Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Array) {
            return;
        }
        setTransform((VirtualView) v2, dynamic.asArray());
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    public void setTransform(VirtualView virtualView, @Nullable ReadableArray readableArray) {
        setTransformProperty(virtualView, readableArray);
        Matrix matrix = virtualView.getMatrix();
        virtualView.mMatrix = matrix;
        virtualView.mInvertible = matrix.invert(virtualView.mInvMatrix);
    }

    protected void setTransformProperty(VirtualView virtualView, ReadableArray readableArray) {
        if (readableArray == null) {
            virtualView.setTranslationX(PixelUtil.toPixelFromDIP(0.0f));
            virtualView.setTranslationY(PixelUtil.toPixelFromDIP(0.0f));
            virtualView.setRotation(0.0f);
            virtualView.setRotationX(0.0f);
            virtualView.setRotationY(0.0f);
            virtualView.setScaleX(1.0f);
            virtualView.setScaleY(1.0f);
            virtualView.setCameraDistance(0.0f);
            return;
        }
        MatrixMathHelper.MatrixDecompositionContext matrixDecompositionContext = sMatrixDecompositionContext;
        matrixDecompositionContext.reset();
        double[] dArr = sTransformDecompositionArray;
        TransformHelper.processTransform(readableArray, dArr, virtualView.getWidth(), virtualView.getHeight(), null, false);
        MatrixMathHelper.decomposeMatrix(dArr, matrixDecompositionContext);
        virtualView.setTranslationX(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) matrixDecompositionContext.translation[0])));
        virtualView.setTranslationY(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) matrixDecompositionContext.translation[1])));
        virtualView.setRotation(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[2]));
        virtualView.setRotationX(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[0]));
        virtualView.setRotationY(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[1]));
        virtualView.setScaleX(sanitizeFloatPropertyValue((float) matrixDecompositionContext.scale[0]));
        virtualView.setScaleY(sanitizeFloatPropertyValue((float) matrixDecompositionContext.scale[1]));
        double[] dArr2 = matrixDecompositionContext.perspective;
        if (dArr2.length > 2) {
            float f2 = (float) dArr2[2];
            if (f2 == 0.0f) {
                f2 = 7.8125E-4f;
            }
            float f3 = (-1.0f) / f2;
            float f4 = DisplayMetricsHolder.getScreenDisplayMetrics().density;
            virtualView.setCameraDistance(f4 * f4 * f3 * 5.0f);
        }
    }
}
