package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BasicMeasure {
    public static final int AT_MOST = Integer.MIN_VALUE;
    private static final boolean DEBUG = false;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    private static final int MODE_SHIFT = 30;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;
    private ConstraintWidgetContainer constraintWidgetContainer;
    private final ArrayList<ConstraintWidget> mVariableDimensionsWidgets = new ArrayList<>();
    private Measure mMeasure = new Measure();

    public static class Measure {
        public static int SELF_DIMENSIONS = 0;
        public static int TRY_GIVEN_DIMENSIONS = 1;
        public static int USE_GIVEN_DIMENSIONS = 2;
        public ConstraintWidget.DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measureStrategy;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public ConstraintWidget.DimensionBehaviour verticalBehavior;
        public int verticalDimension;
    }

    public interface Measurer {
        void didMeasures();

        void measure(ConstraintWidget constraintWidget, Measure measure);
    }

    public void updateHierarchy(ConstraintWidgetContainer constraintWidgetContainer) {
        this.mVariableDimensionsWidgets.clear();
        int size = constraintWidgetContainer.mChildren.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i2);
            if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                this.mVariableDimensionsWidgets.add(constraintWidget);
            }
        }
        constraintWidgetContainer.invalidateGraph();
    }

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer) {
        this.constraintWidgetContainer = constraintWidgetContainer;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x00a9 A[PHI: r9
  0x00a9: PHI (r9v2 boolean) = (r9v1 boolean), (r9v1 boolean), (r9v1 boolean), (r9v4 boolean), (r9v4 boolean) binds: [B:110:0x0064, B:112:0x006a, B:114:0x006e, B:138:0x00a3, B:136:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void measureChildren(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r12) {
        /*
            r11 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r12.mChildren
            int r8 = r0.size()
            r0 = 64
            boolean r10 = r12.optimizeFor(r0)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r7 = r12.getMeasurer()
            r6 = 0
            r5 = r6
        L12:
            if (r5 >= r8) goto Lc1
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r12.mChildren
            java.lang.Object r2 = r0.get(r5)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            boolean r0 = r2 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r0 == 0) goto L23
        L20:
            int r5 = r5 + 1
            goto L12
        L23:
            boolean r0 = r2 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r0 == 0) goto L28
            goto L20
        L28:
            boolean r0 = r2.isInVirtualLayout()
            if (r0 == 0) goto L2f
            goto L20
        L2f:
            if (r10 == 0) goto L4a
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r2.horizontalRun
            if (r0 == 0) goto L4a
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r2.verticalRun
            if (r0 == 0) goto L4a
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r2.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            boolean r0 = r0.resolved
            if (r0 == 0) goto L4a
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r2.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            boolean r0 = r0.resolved
            if (r0 == 0) goto L4a
            goto L20
        L4a:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r2.getDimensionBehaviour(r6)
            r3 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r2.getDimensionBehaviour(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r0) goto Lab
            int r0 = r2.mMatchConstraintDefaultWidth
            if (r0 == r3) goto Lab
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r0) goto Lab
            int r0 = r2.mMatchConstraintDefaultHeight
            if (r0 == r3) goto Lab
            r9 = r3
        L64:
            if (r9 != 0) goto La9
            boolean r0 = r12.optimizeFor(r3)
            if (r0 == 0) goto La9
            boolean r0 = r2 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r0 != 0) goto La9
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r0) goto L83
            int r0 = r2.mMatchConstraintDefaultWidth
            if (r0 != 0) goto L83
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 == r0) goto L83
            boolean r0 = r2.isInHorizontalChain()
            if (r0 != 0) goto L83
            r9 = r3
        L83:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r0) goto L96
            int r0 = r2.mMatchConstraintDefaultHeight
            if (r0 != 0) goto L96
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 == r0) goto L96
            boolean r0 = r2.isInHorizontalChain()
            if (r0 != 0) goto L96
            r9 = r3
        L96:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 == r0) goto L9e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r0) goto La9
        L9e:
            float r1 = r2.mDimensionRatio
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto La9
        La5:
            if (r3 == 0) goto Lad
            goto L20
        La9:
            r3 = r9
            goto La5
        Lab:
            r9 = r6
            goto L64
        Lad:
            int r0 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            r11.measure(r7, r2, r0)
            androidx.constraintlayout.core.Metrics r0 = r12.mMetrics
            if (r0 == 0) goto L20
            androidx.constraintlayout.core.Metrics r4 = r12.mMetrics
            long r2 = r4.measuredWidgets
            r0 = 1
            long r2 = r2 + r0
            r4.measuredWidgets = r2
            goto L20
        Lc1:
            r7.didMeasures()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.measureChildren(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer):void");
    }

    private void solveLinearSystem(ConstraintWidgetContainer constraintWidgetContainer, String str, int i2, int i3, int i4) {
        int minWidth = constraintWidgetContainer.getMinWidth();
        int minHeight = constraintWidgetContainer.getMinHeight();
        constraintWidgetContainer.setMinWidth(0);
        constraintWidgetContainer.setMinHeight(0);
        constraintWidgetContainer.setWidth(i3);
        constraintWidgetContainer.setHeight(i4);
        constraintWidgetContainer.setMinWidth(minWidth);
        constraintWidgetContainer.setMinHeight(minHeight);
        this.constraintWidgetContainer.setPass(i2);
        this.constraintWidgetContainer.layout();
    }

    public long solverMeasure(ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        boolean zDirectMeasure;
        int i11;
        Measurer measurer = constraintWidgetContainer.getMeasurer();
        int size = constraintWidgetContainer.mChildren.size();
        int width = constraintWidgetContainer.getWidth();
        int height = constraintWidgetContainer.getHeight();
        boolean zEnabled = Optimizer.enabled(i2, 128);
        int i12 = 0;
        boolean z2 = zEnabled || Optimizer.enabled(i2, 64);
        if (z2) {
            for (int i13 = 0; i13 < size; i13++) {
                ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i13);
                boolean z3 = (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.getDimensionRatio() > 0.0f;
                if ((constraintWidget.isInHorizontalChain() && z3) || ((constraintWidget.isInVerticalChain() && z3) || (constraintWidget instanceof VirtualLayout) || constraintWidget.isInHorizontalChain() || constraintWidget.isInVerticalChain())) {
                    z2 = false;
                    break;
                }
            }
        }
        if (z2 && LinearSystem.sMetrics != null) {
            LinearSystem.sMetrics.measures++;
        }
        boolean z4 = z2 & ((i5 == 1073741824 && i7 == 1073741824) || zEnabled);
        int i14 = 2;
        if (z4) {
            int iMin = Math.min(constraintWidgetContainer.getMaxWidth(), i6);
            int iMin2 = Math.min(constraintWidgetContainer.getMaxHeight(), i8);
            if (i5 == 1073741824 && constraintWidgetContainer.getWidth() != iMin) {
                constraintWidgetContainer.setWidth(iMin);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i7 == 1073741824 && constraintWidgetContainer.getHeight() != iMin2) {
                constraintWidgetContainer.setHeight(iMin2);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i5 == 1073741824 && i7 == 1073741824) {
                zDirectMeasure = constraintWidgetContainer.directMeasure(zEnabled);
                i11 = 2;
            } else {
                boolean zDirectMeasureSetup = constraintWidgetContainer.directMeasureSetup(zEnabled);
                if (i5 == 1073741824) {
                    zDirectMeasureSetup = (-1) - (((-1) - (zDirectMeasureSetup ? 1 : 0)) | ((-1) - (constraintWidgetContainer.directMeasureWithOrientation(zEnabled, 0) ? 1 : 0))) == 1;
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i7 == 1073741824) {
                    zDirectMeasure = (constraintWidgetContainer.directMeasureWithOrientation(zEnabled, 1) ? 1 : 0) & zDirectMeasureSetup;
                    i11++;
                } else {
                    zDirectMeasure = zDirectMeasureSetup;
                }
            }
            if (zDirectMeasure) {
                constraintWidgetContainer.updateFromRuns(i5 == 1073741824, i7 == 1073741824);
            }
        } else {
            zDirectMeasure = false;
            i11 = 0;
        }
        if (zDirectMeasure && i11 == 2) {
            return 0L;
        }
        int optimizationLevel = constraintWidgetContainer.getOptimizationLevel();
        if (size > 0) {
            measureChildren(constraintWidgetContainer);
        }
        updateHierarchy(constraintWidgetContainer);
        int size2 = this.mVariableDimensionsWidgets.size();
        if (size > 0) {
            solveLinearSystem(constraintWidgetContainer, "First pass", 0, width, height);
        }
        if (size2 > 0) {
            boolean z5 = constraintWidgetContainer.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z6 = constraintWidgetContainer.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            int iMax = Math.max(constraintWidgetContainer.getWidth(), this.constraintWidgetContainer.getMinWidth());
            int iMax2 = Math.max(constraintWidgetContainer.getHeight(), this.constraintWidgetContainer.getMinHeight());
            int i15 = 0;
            while (i12 < size2) {
                ConstraintWidget constraintWidget2 = this.mVariableDimensionsWidgets.get(i12);
                if (constraintWidget2 instanceof VirtualLayout) {
                    int width2 = constraintWidget2.getWidth();
                    int height2 = constraintWidget2.getHeight();
                    int i16 = (-1) - (((-1) - (measure(measurer, constraintWidget2, Measure.TRY_GIVEN_DIMENSIONS) ? 1 : 0)) & ((-1) - i15)) != 1 ? 0 : 1;
                    if (constraintWidgetContainer.mMetrics != null) {
                        constraintWidgetContainer.mMetrics.measuredMatchWidgets++;
                    }
                    int width3 = constraintWidget2.getWidth();
                    int height3 = constraintWidget2.getHeight();
                    if (width3 != width2) {
                        constraintWidget2.setWidth(width3);
                        if (z5 && constraintWidget2.getRight() > iMax) {
                            iMax = Math.max(iMax, constraintWidget2.getRight() + constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin());
                        }
                        i16 = 1;
                    }
                    if (height3 != height2) {
                        constraintWidget2.setHeight(height3);
                        if (z6 && constraintWidget2.getBottom() > iMax2) {
                            iMax2 = Math.max(iMax2, constraintWidget2.getBottom() + constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin());
                        }
                        i16 = 1;
                    }
                    boolean zNeedSolverPass = ((VirtualLayout) constraintWidget2).needSolverPass();
                    i15 = 1;
                    if ((i16 + (zNeedSolverPass ? 1 : 0)) - (i16 & (zNeedSolverPass ? 1 : 0)) != 1) {
                        i15 = 0;
                    }
                }
                i12++;
                i14 = 2;
            }
            int i17 = 0;
            while (i17 < i14) {
                for (int i18 = 0; i18 < size2; i18++) {
                    ConstraintWidget constraintWidget3 = this.mVariableDimensionsWidgets.get(i18);
                    if ((!(constraintWidget3 instanceof Helper) || (constraintWidget3 instanceof VirtualLayout)) && !(constraintWidget3 instanceof Guideline) && constraintWidget3.getVisibility() != 8 && ((!z4 || !constraintWidget3.horizontalRun.dimension.resolved || !constraintWidget3.verticalRun.dimension.resolved) && !(constraintWidget3 instanceof VirtualLayout))) {
                        int width4 = constraintWidget3.getWidth();
                        int height4 = constraintWidget3.getHeight();
                        int baselineDistance = constraintWidget3.getBaselineDistance();
                        int i19 = Measure.TRY_GIVEN_DIMENSIONS;
                        if (i17 == 1) {
                            i19 = Measure.USE_GIVEN_DIMENSIONS;
                        }
                        boolean zMeasure = measure(measurer, constraintWidget3, i19);
                        i15 = ((zMeasure ? 1 : 0) + i15) - ((zMeasure ? 1 : 0) & i15) != 1 ? 0 : 1;
                        if (constraintWidgetContainer.mMetrics != null) {
                            constraintWidgetContainer.mMetrics.measuredMatchWidgets++;
                        }
                        int width5 = constraintWidget3.getWidth();
                        int height5 = constraintWidget3.getHeight();
                        if (width5 != width4) {
                            constraintWidget3.setWidth(width5);
                            if (z5 && constraintWidget3.getRight() > iMax) {
                                iMax = Math.max(iMax, constraintWidget3.getRight() + constraintWidget3.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin());
                            }
                            i15 = 1;
                        }
                        if (height5 != height4) {
                            constraintWidget3.setHeight(height5);
                            if (z6 && constraintWidget3.getBottom() > iMax2) {
                                iMax2 = Math.max(iMax2, constraintWidget3.getBottom() + constraintWidget3.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin());
                            }
                            i15 = 1;
                        }
                        if (constraintWidget3.hasBaseline() && baselineDistance != constraintWidget3.getBaselineDistance()) {
                            i15 = 1;
                        }
                    }
                }
                if (i15 == 0) {
                    break;
                }
                i17++;
                solveLinearSystem(constraintWidgetContainer, "intermediate pass", i17, width, height);
                i14 = 2;
                i15 = 0;
            }
        }
        constraintWidgetContainer.setOptimizationLevel(optimizationLevel);
        return 0L;
    }

    private boolean measure(Measurer measurer, ConstraintWidget constraintWidget, int i2) {
        this.mMeasure.horizontalBehavior = constraintWidget.getHorizontalDimensionBehaviour();
        this.mMeasure.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
        this.mMeasure.horizontalDimension = constraintWidget.getWidth();
        this.mMeasure.verticalDimension = constraintWidget.getHeight();
        this.mMeasure.measuredNeedsSolverPass = false;
        this.mMeasure.measureStrategy = i2;
        boolean z2 = this.mMeasure.horizontalBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z3 = this.mMeasure.verticalBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z4 = z2 && constraintWidget.mDimensionRatio > 0.0f;
        boolean z5 = z3 && constraintWidget.mDimensionRatio > 0.0f;
        if (z4 && constraintWidget.mResolvedMatchConstraintDefault[0] == 4) {
            this.mMeasure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z5 && constraintWidget.mResolvedMatchConstraintDefault[1] == 4) {
            this.mMeasure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        measurer.measure(constraintWidget, this.mMeasure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
        this.mMeasure.measureStrategy = Measure.SELF_DIMENSIONS;
        return this.mMeasure.measuredNeedsSolverPass;
    }
}
