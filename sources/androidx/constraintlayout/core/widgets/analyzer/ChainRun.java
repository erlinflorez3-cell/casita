package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ChainRun extends WidgetRun {
    private int chainStyle;
    ArrayList<WidgetRun> widgets;

    public ChainRun(ConstraintWidget constraintWidget, int i2) {
        super(constraintWidget);
        this.widgets = new ArrayList<>();
        this.orientation = i2;
        build();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.orientation == 0 ? "horizontal : " : "vertical : ");
        for (WidgetRun widgetRun : this.widgets) {
            sb.append("<");
            sb.append(widgetRun);
            sb.append("> ");
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean supportsWrapComputation() {
        int size = this.widgets.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.widgets.get(i2).supportsWrapComputation()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long getWrapDimension() {
        int size = this.widgets.size();
        long wrapDimension = 0;
        for (int i2 = 0; i2 < size; i2++) {
            WidgetRun widgetRun = this.widgets.get(i2);
            wrapDimension = wrapDimension + ((long) widgetRun.start.margin) + widgetRun.getWrapDimension() + ((long) widgetRun.end.margin);
        }
        return wrapDimension;
    }

    private void build() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = this.widget;
        ConstraintWidget previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
        while (true) {
            constraintWidget = constraintWidget2;
            constraintWidget2 = previousChainMember;
            if (constraintWidget2 == null) {
                break;
            } else {
                previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
            }
        }
        this.widget = constraintWidget;
        this.widgets.add(constraintWidget.getRun(this.orientation));
        ConstraintWidget nextChainMember = constraintWidget.getNextChainMember(this.orientation);
        while (nextChainMember != null) {
            this.widgets.add(nextChainMember.getRun(this.orientation));
            nextChainMember = nextChainMember.getNextChainMember(this.orientation);
        }
        for (WidgetRun widgetRun : this.widgets) {
            if (this.orientation == 0) {
                widgetRun.widget.horizontalChainRun = this;
            } else if (this.orientation == 1) {
                widgetRun.widget.verticalChainRun = this;
            }
        }
        if (this.orientation == 0 && ((ConstraintWidgetContainer) this.widget.getParent()).isRtl() && this.widgets.size() > 1) {
            ArrayList<WidgetRun> arrayList = this.widgets;
            this.widget = arrayList.get(arrayList.size() - 1).widget;
        }
        this.chainStyle = this.orientation == 0 ? this.widget.getHorizontalChainStyle() : this.widget.getVerticalChainStyle();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void clear() {
        this.runGroup = null;
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void reset() {
        this.start.resolved = false;
        this.end.resolved = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:390:0x0102, code lost:
    
        r3 = r22.start.value;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0106, code lost:
    
        if (r20 == false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0108, code lost:
    
        r3 = r22.end.value;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0110, code lost:
    
        if (r11 <= r19) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0114, code lost:
    
        if (r20 == false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0116, code lost:
    
        r3 = r3 + ((int) (((r11 - r19) / 2.0f) + 0.5f));
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x011d, code lost:
    
        if (r5 <= 0) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x011f, code lost:
    
        r12 = r19 - r11;
        r0 = (int) ((r12 / r5) + 0.5f);
        r2 = 0;
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x012c, code lost:
    
        if (r2 >= r9) goto L602;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x012e, code lost:
    
        r0 = r22.widgets.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0144, code lost:
    
        if (r0.widget.getVisibility() != 8) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0146, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0152, code lost:
    
        if (r0.dimensionBehavior != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) goto L604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x015a, code lost:
    
        if (r0.dimension.resolved != false) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x015f, code lost:
    
        if (r18 <= 0.0f) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0161, code lost:
    
        r1 = (int) (((r0.widget.mWeight[r22.orientation] * r12) / r18) + 0.5f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0174, code lost:
    
        if (r22.orientation != 0) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0176, code lost:
    
        r13 = r0.widget.mMatchConstraintMaxWidth;
        r14 = r0.widget.mMatchConstraintMinWidth;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0187, code lost:
    
        if (r0.matchConstraintsType != 1) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0189, code lost:
    
        r0 = java.lang.Math.min(r1, r0.dimension.wrapValue);
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0193, code lost:
    
        r0 = java.lang.Math.max(r14, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0197, code lost:
    
        if (r13 <= 0) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0199, code lost:
    
        r0 = java.lang.Math.min(r13, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x019d, code lost:
    
        if (r0 == r1) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x019f, code lost:
    
        r17 = r17 + 1;
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x01a2, code lost:
    
        r0.dimension.resolve(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x01aa, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x01ac, code lost:
    
        r13 = r0.widget.mMatchConstraintMaxHeight;
        r14 = r0.widget.mMatchConstraintMinHeight;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x01b9, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x01bc, code lost:
    
        r3 = r3 - ((int) (((r11 - r19) / 2.0f) + 0.5f));
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x01cb, code lost:
    
        if (r17 <= 0) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x01cd, code lost:
    
        r5 = r5 - r17;
        r1 = 0;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x01d1, code lost:
    
        if (r1 >= r9) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x01d3, code lost:
    
        r2 = r22.widgets.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x01e3, code lost:
    
        if (r2.widget.getVisibility() != 8) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x01e5, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x01e8, code lost:
    
        if (r1 <= 0) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x01ea, code lost:
    
        if (r1 < r8) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x01ec, code lost:
    
        r11 = r11 + r2.start.margin;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x01f1, code lost:
    
        r11 = r11 + r2.dimension.value;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x01f6, code lost:
    
        if (r1 >= r6) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x01f8, code lost:
    
        if (r1 >= r7) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x01fa, code lost:
    
        r11 = r11 + (-r2.end.margin);
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0202, code lost:
    
        r1 = 0;
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0205, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0208, code lost:
    
        if (r22.chainStyle != 2) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x020a, code lost:
    
        if (r17 != 0) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x020c, code lost:
    
        r1 = 0;
        r22.chainStyle = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0211, code lost:
    
        if (r11 <= r19) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0213, code lost:
    
        r22.chainStyle = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0215, code lost:
    
        if (r4 <= 0) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0217, code lost:
    
        if (r5 != 0) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0219, code lost:
    
        if (r8 != r7) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x021b, code lost:
    
        r22.chainStyle = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x021d, code lost:
    
        r2 = r22.chainStyle;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0220, code lost:
    
        if (r2 != 1) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0222, code lost:
    
        if (r4 <= 1) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0224, code lost:
    
        r19 = (r19 - r11) / (r4 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0229, code lost:
    
        if (r5 <= 0) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x022b, code lost:
    
        r19 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x022d, code lost:
    
        if (r1 >= r9) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x022f, code lost:
    
        if (r20 == false) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0231, code lost:
    
        r2 = r9 - (r1 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0235, code lost:
    
        r4 = r22.widgets.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0245, code lost:
    
        if (r4.widget.getVisibility() != 8) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0247, code lost:
    
        r4.start.resolve(r3);
        r4.end.resolve(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0251, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0254, code lost:
    
        if (r1 <= 0) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0256, code lost:
    
        if (r20 == false) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0258, code lost:
    
        r3 = r3 - r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x025a, code lost:
    
        if (r1 <= 0) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x025c, code lost:
    
        if (r1 < r8) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x025e, code lost:
    
        if (r20 == false) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0260, code lost:
    
        r3 = r3 - r4.start.margin;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0265, code lost:
    
        if (r20 == false) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0267, code lost:
    
        r4.end.resolve(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x026c, code lost:
    
        r5 = r4.dimension.value;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0274, code lost:
    
        if (r4.dimensionBehavior != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0279, code lost:
    
        if (r4.matchConstraintsType != 1) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x027b, code lost:
    
        r5 = r4.dimension.wrapValue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x027f, code lost:
    
        if (r20 == false) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0281, code lost:
    
        r3 = r3 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0282, code lost:
    
        if (r20 == false) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0284, code lost:
    
        r4.start.resolve(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0289, code lost:
    
        r4.resolved = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x028c, code lost:
    
        if (r1 >= r6) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x028e, code lost:
    
        if (r1 >= r7) goto L615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0290, code lost:
    
        if (r20 == false) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0292, code lost:
    
        r3 = r3 - (-r4.end.margin);
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0299, code lost:
    
        r4.end.resolve(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x029f, code lost:
    
        r3 = r3 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x02a1, code lost:
    
        r4.start.resolve(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x02a7, code lost:
    
        r3 = r3 + r4.start.margin;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x02ad, code lost:
    
        r3 = r3 + r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x02b0, code lost:
    
        r3 = r3 + (-r4.end.margin);
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x02b7, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x02ba, code lost:
    
        if (r4 != 1) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x02bc, code lost:
    
        r19 = (r19 - r11) / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x02c3, code lost:
    
        r19 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x02c7, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x02ca, code lost:
    
        if (r2 != 0) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x02cc, code lost:
    
        r19 = (r19 - r11) / (r4 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x02d2, code lost:
    
        if (r5 <= 0) goto L625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x02d4, code lost:
    
        r19 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x02d6, code lost:
    
        if (r1 >= r9) goto L619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x02d8, code lost:
    
        if (r20 == false) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x02da, code lost:
    
        r2 = r9 - (r1 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x02de, code lost:
    
        r4 = r22.widgets.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x02ee, code lost:
    
        if (r4.widget.getVisibility() != 8) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x02f0, code lost:
    
        r4.start.resolve(r3);
        r4.end.resolve(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x02fa, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x02fd, code lost:
    
        if (r20 == false) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x02ff, code lost:
    
        r3 = r3 - r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0301, code lost:
    
        if (r1 <= 0) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0303, code lost:
    
        if (r1 < r8) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0305, code lost:
    
        if (r20 == false) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0307, code lost:
    
        r3 = r3 - r4.start.margin;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x030c, code lost:
    
        if (r20 == false) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x030e, code lost:
    
        r4.end.resolve(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0313, code lost:
    
        r5 = r4.dimension.value;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x031b, code lost:
    
        if (r4.dimensionBehavior != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0320, code lost:
    
        if (r4.matchConstraintsType != 1) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0322, code lost:
    
        r5 = java.lang.Math.min(r5, r4.dimension.wrapValue);
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x032a, code lost:
    
        if (r20 == false) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x032c, code lost:
    
        r3 = r3 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x032d, code lost:
    
        if (r20 == false) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x032f, code lost:
    
        r4.start.resolve(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0334, code lost:
    
        if (r1 >= r6) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0336, code lost:
    
        if (r1 >= r7) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0338, code lost:
    
        if (r20 == false) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x033a, code lost:
    
        r3 = r3 - (-r4.end.margin);
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0341, code lost:
    
        r4.end.resolve(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0347, code lost:
    
        r3 = r3 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0349, code lost:
    
        r4.start.resolve(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x034f, code lost:
    
        r3 = r3 + r4.start.margin;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0355, code lost:
    
        r3 = r3 + r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0358, code lost:
    
        r3 = r3 + (-r4.end.margin);
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x035f, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0363, code lost:
    
        if (r2 != 2) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0367, code lost:
    
        if (r22.orientation != 0) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0369, code lost:
    
        r4 = r22.widget.getHorizontalBiasPercent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x036f, code lost:
    
        if (r20 == false) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0371, code lost:
    
        r4 = 1.0f - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0375, code lost:
    
        r0 = (int) (((r19 - r11) * r4) + 0.5f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x037f, code lost:
    
        if (r0 < 0) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0381, code lost:
    
        if (r5 <= 0) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0383, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0384, code lost:
    
        if (r20 == false) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0386, code lost:
    
        r3 = r3 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0387, code lost:
    
        if (r1 >= r9) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0389, code lost:
    
        if (r20 == false) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x038b, code lost:
    
        r2 = r9 - (r1 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x038f, code lost:
    
        r4 = r22.widgets.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x039f, code lost:
    
        if (r4.widget.getVisibility() != 8) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x03a1, code lost:
    
        r4.start.resolve(r3);
        r4.end.resolve(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x03ac, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x03af, code lost:
    
        if (r1 <= 0) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x03b1, code lost:
    
        if (r1 < r8) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x03b3, code lost:
    
        if (r20 == false) goto L583;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x03b5, code lost:
    
        r3 = r3 - r4.start.margin;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x03ba, code lost:
    
        if (r20 == false) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x03bc, code lost:
    
        r4.end.resolve(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x03c1, code lost:
    
        r5 = r4.dimension.value;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x03c9, code lost:
    
        if (r4.dimensionBehavior != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x03ce, code lost:
    
        if (r4.matchConstraintsType != 1) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x03d0, code lost:
    
        r5 = r4.dimension.wrapValue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x03d4, code lost:
    
        if (r20 == false) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x03d6, code lost:
    
        r3 = r3 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x03d7, code lost:
    
        if (r20 == false) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x03d9, code lost:
    
        r4.start.resolve(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x03de, code lost:
    
        if (r1 >= r6) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x03e0, code lost:
    
        if (r1 >= r7) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x03e2, code lost:
    
        if (r20 == false) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x03e4, code lost:
    
        r3 = r3 - (-r4.end.margin);
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x03eb, code lost:
    
        r4.end.resolve(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x03f1, code lost:
    
        r3 = r3 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x03f5, code lost:
    
        r4.start.resolve(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x03fb, code lost:
    
        r3 = r3 + r4.start.margin;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0401, code lost:
    
        r3 = r3 + (-r4.end.margin);
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0408, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x040a, code lost:
    
        r3 = r3 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x040d, code lost:
    
        r4 = r22.widget.getVerticalBiasPercent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:?, code lost:
    
        return;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency r23) {
        /*
            Method dump skipped, instruction units count: 1045
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.ChainRun.update(androidx.constraintlayout.core.widgets.analyzer.Dependency):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        for (int i2 = 0; i2 < this.widgets.size(); i2++) {
            this.widgets.get(i2).applyToWidget();
        }
    }

    private ConstraintWidget getFirstVisibleWidget() {
        for (int i2 = 0; i2 < this.widgets.size(); i2++) {
            WidgetRun widgetRun = this.widgets.get(i2);
            if (widgetRun.widget.getVisibility() != 8) {
                return widgetRun.widget;
            }
        }
        return null;
    }

    private ConstraintWidget getLastVisibleWidget() {
        for (int size = this.widgets.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.widgets.get(size);
            if (widgetRun.widget.getVisibility() != 8) {
                return widgetRun.widget;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void apply() {
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            it.next().apply();
        }
        int size = this.widgets.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.widgets.get(0).widget;
        ConstraintWidget constraintWidget2 = this.widgets.get(size - 1).widget;
        if (this.orientation == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.mLeft;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.mRight;
            DependencyNode target = getTarget(constraintAnchor, 0);
            int margin = constraintAnchor.getMargin();
            ConstraintWidget firstVisibleWidget = getFirstVisibleWidget();
            if (firstVisibleWidget != null) {
                margin = firstVisibleWidget.mLeft.getMargin();
            }
            if (target != null) {
                addTarget(this.start, target, margin);
            }
            DependencyNode target2 = getTarget(constraintAnchor2, 0);
            int margin2 = constraintAnchor2.getMargin();
            ConstraintWidget lastVisibleWidget = getLastVisibleWidget();
            if (lastVisibleWidget != null) {
                margin2 = lastVisibleWidget.mRight.getMargin();
            }
            if (target2 != null) {
                addTarget(this.end, target2, -margin2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.mTop;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.mBottom;
            DependencyNode target3 = getTarget(constraintAnchor3, 1);
            int margin3 = constraintAnchor3.getMargin();
            ConstraintWidget firstVisibleWidget2 = getFirstVisibleWidget();
            if (firstVisibleWidget2 != null) {
                margin3 = firstVisibleWidget2.mTop.getMargin();
            }
            if (target3 != null) {
                addTarget(this.start, target3, margin3);
            }
            DependencyNode target4 = getTarget(constraintAnchor4, 1);
            int margin4 = constraintAnchor4.getMargin();
            ConstraintWidget lastVisibleWidget2 = getLastVisibleWidget();
            if (lastVisibleWidget2 != null) {
                margin4 = lastVisibleWidget2.mBottom.getMargin();
            }
            if (target4 != null) {
                addTarget(this.end, target4, -margin4);
            }
        }
        this.start.updateDelegate = this;
        this.end.updateDelegate = this;
    }
}
