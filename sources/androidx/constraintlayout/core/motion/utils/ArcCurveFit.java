package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class ArcCurveFit extends CurveFit {
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    Arc[] mArcs;
    private boolean mExtrapolate = true;
    private final double[] mTime;

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d2, double[] dArr) {
        if (!this.mExtrapolate) {
            if (d2 < this.mArcs[0].mTime1) {
                d2 = this.mArcs[0].mTime1;
            }
            Arc[] arcArr = this.mArcs;
            if (d2 > arcArr[arcArr.length - 1].mTime2) {
                Arc[] arcArr2 = this.mArcs;
                d2 = arcArr2[arcArr2.length - 1].mTime2;
            }
        } else {
            if (d2 < this.mArcs[0].mTime1) {
                double d3 = this.mArcs[0].mTime1;
                double d4 = d2 - this.mArcs[0].mTime1;
                if (this.mArcs[0].linear) {
                    dArr[0] = this.mArcs[0].getLinearX(d3) + (this.mArcs[0].getLinearDX(d3) * d4);
                    dArr[1] = this.mArcs[0].getLinearY(d3) + (d4 * this.mArcs[0].getLinearDY(d3));
                    return;
                } else {
                    this.mArcs[0].setPoint(d3);
                    dArr[0] = this.mArcs[0].getX() + (this.mArcs[0].getDX() * d4);
                    dArr[1] = this.mArcs[0].getY() + (d4 * this.mArcs[0].getDY());
                    return;
                }
            }
            Arc[] arcArr3 = this.mArcs;
            if (d2 > arcArr3[arcArr3.length - 1].mTime2) {
                Arc[] arcArr4 = this.mArcs;
                double d5 = arcArr4[arcArr4.length - 1].mTime2;
                double d6 = d2 - d5;
                Arc[] arcArr5 = this.mArcs;
                int length = arcArr5.length - 1;
                if (arcArr5[length].linear) {
                    dArr[0] = this.mArcs[length].getLinearX(d5) + (this.mArcs[length].getLinearDX(d5) * d6);
                    dArr[1] = this.mArcs[length].getLinearY(d5) + (d6 * this.mArcs[length].getLinearDY(d5));
                    return;
                } else {
                    this.mArcs[length].setPoint(d2);
                    dArr[0] = this.mArcs[length].getX() + (this.mArcs[length].getDX() * d6);
                    dArr[1] = this.mArcs[length].getY() + (d6 * this.mArcs[length].getDY());
                    return;
                }
            }
        }
        int i2 = 0;
        while (true) {
            Arc[] arcArr6 = this.mArcs;
            if (i2 >= arcArr6.length) {
                return;
            }
            if (d2 <= arcArr6[i2].mTime2) {
                if (this.mArcs[i2].linear) {
                    dArr[0] = this.mArcs[i2].getLinearX(d2);
                    dArr[1] = this.mArcs[i2].getLinearY(d2);
                    return;
                } else {
                    this.mArcs[i2].setPoint(d2);
                    dArr[0] = this.mArcs[i2].getX();
                    dArr[1] = this.mArcs[i2].getY();
                    return;
                }
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d2, float[] fArr) {
        if (this.mExtrapolate) {
            if (d2 < this.mArcs[0].mTime1) {
                double d3 = this.mArcs[0].mTime1;
                double d4 = d2 - this.mArcs[0].mTime1;
                if (this.mArcs[0].linear) {
                    fArr[0] = (float) (this.mArcs[0].getLinearX(d3) + (this.mArcs[0].getLinearDX(d3) * d4));
                    fArr[1] = (float) (this.mArcs[0].getLinearY(d3) + (d4 * this.mArcs[0].getLinearDY(d3)));
                    return;
                } else {
                    this.mArcs[0].setPoint(d3);
                    fArr[0] = (float) (this.mArcs[0].getX() + (this.mArcs[0].getDX() * d4));
                    fArr[1] = (float) (this.mArcs[0].getY() + (d4 * this.mArcs[0].getDY()));
                    return;
                }
            }
            Arc[] arcArr = this.mArcs;
            if (d2 > arcArr[arcArr.length - 1].mTime2) {
                Arc[] arcArr2 = this.mArcs;
                double d5 = arcArr2[arcArr2.length - 1].mTime2;
                double d6 = d2 - d5;
                Arc[] arcArr3 = this.mArcs;
                int length = arcArr3.length - 1;
                if (arcArr3[length].linear) {
                    fArr[0] = (float) (this.mArcs[length].getLinearX(d5) + (this.mArcs[length].getLinearDX(d5) * d6));
                    fArr[1] = (float) (this.mArcs[length].getLinearY(d5) + (d6 * this.mArcs[length].getLinearDY(d5)));
                    return;
                } else {
                    this.mArcs[length].setPoint(d2);
                    fArr[0] = (float) this.mArcs[length].getX();
                    fArr[1] = (float) this.mArcs[length].getY();
                    return;
                }
            }
        } else if (d2 < this.mArcs[0].mTime1) {
            d2 = this.mArcs[0].mTime1;
        } else {
            Arc[] arcArr4 = this.mArcs;
            if (d2 > arcArr4[arcArr4.length - 1].mTime2) {
                Arc[] arcArr5 = this.mArcs;
                d2 = arcArr5[arcArr5.length - 1].mTime2;
            }
        }
        int i2 = 0;
        while (true) {
            Arc[] arcArr6 = this.mArcs;
            if (i2 >= arcArr6.length) {
                return;
            }
            if (d2 <= arcArr6[i2].mTime2) {
                if (this.mArcs[i2].linear) {
                    fArr[0] = (float) this.mArcs[i2].getLinearX(d2);
                    fArr[1] = (float) this.mArcs[i2].getLinearY(d2);
                    return;
                } else {
                    this.mArcs[i2].setPoint(d2);
                    fArr[0] = (float) this.mArcs[i2].getX();
                    fArr[1] = (float) this.mArcs[i2].getY();
                    return;
                }
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d2, double[] dArr) {
        if (d2 < this.mArcs[0].mTime1) {
            d2 = this.mArcs[0].mTime1;
        } else {
            Arc[] arcArr = this.mArcs;
            if (d2 > arcArr[arcArr.length - 1].mTime2) {
                Arc[] arcArr2 = this.mArcs;
                d2 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i2 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i2 >= arcArr3.length) {
                return;
            }
            if (d2 <= arcArr3[i2].mTime2) {
                if (this.mArcs[i2].linear) {
                    dArr[0] = this.mArcs[i2].getLinearDX(d2);
                    dArr[1] = this.mArcs[i2].getLinearDY(d2);
                    return;
                } else {
                    this.mArcs[i2].setPoint(d2);
                    dArr[0] = this.mArcs[i2].getDX();
                    dArr[1] = this.mArcs[i2].getDY();
                    return;
                }
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d2, int i2) {
        double d3;
        double linearY;
        double linearDY;
        double y2;
        double dy;
        int i3 = 0;
        if (this.mExtrapolate) {
            if (d2 < this.mArcs[0].mTime1) {
                double d4 = this.mArcs[0].mTime1;
                d3 = d2 - this.mArcs[0].mTime1;
                if (!this.mArcs[0].linear) {
                    this.mArcs[0].setPoint(d4);
                    if (i2 == 0) {
                        y2 = this.mArcs[0].getX();
                        dy = this.mArcs[0].getDX();
                    } else {
                        y2 = this.mArcs[0].getY();
                        dy = this.mArcs[0].getDY();
                    }
                    return y2 + (d3 * dy);
                }
                if (i2 == 0) {
                    linearY = this.mArcs[0].getLinearX(d4);
                    linearDY = this.mArcs[0].getLinearDX(d4);
                } else {
                    linearY = this.mArcs[0].getLinearY(d4);
                    linearDY = this.mArcs[0].getLinearDY(d4);
                }
            } else {
                if (d2 > this.mArcs[r2.length - 1].mTime2) {
                    double d5 = this.mArcs[r1.length - 1].mTime2;
                    d3 = d2 - d5;
                    Arc[] arcArr = this.mArcs;
                    int length = arcArr.length - 1;
                    if (i2 == 0) {
                        linearY = arcArr[length].getLinearX(d5);
                        linearDY = this.mArcs[length].getLinearDX(d5);
                    } else {
                        linearY = arcArr[length].getLinearY(d5);
                        linearDY = this.mArcs[length].getLinearDY(d5);
                    }
                }
            }
            return linearY + (d3 * linearDY);
        }
        if (d2 < this.mArcs[0].mTime1) {
            d2 = this.mArcs[0].mTime1;
        } else {
            if (d2 > this.mArcs[r2.length - 1].mTime2) {
                d2 = this.mArcs[r2.length - 1].mTime2;
            }
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i3 >= arcArr2.length) {
                return Double.NaN;
            }
            if (d2 <= arcArr2[i3].mTime2) {
                if (this.mArcs[i3].linear) {
                    if (i2 == 0) {
                        return this.mArcs[i3].getLinearX(d2);
                    }
                    return this.mArcs[i3].getLinearY(d2);
                }
                this.mArcs[i3].setPoint(d2);
                if (i2 == 0) {
                    return this.mArcs[i3].getX();
                }
                return this.mArcs[i3].getY();
            }
            i3++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d2, int i2) {
        int i3 = 0;
        if (d2 < this.mArcs[0].mTime1) {
            d2 = this.mArcs[0].mTime1;
        }
        if (d2 > this.mArcs[r2.length - 1].mTime2) {
            d2 = this.mArcs[r2.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr = this.mArcs;
            if (i3 >= arcArr.length) {
                return Double.NaN;
            }
            if (d2 <= arcArr[i3].mTime2) {
                if (this.mArcs[i3].linear) {
                    if (i2 == 0) {
                        return this.mArcs[i3].getLinearDX(d2);
                    }
                    return this.mArcs[i3].getLinearDY(d2);
                }
                this.mArcs[i3].setPoint(d2);
                if (i2 == 0) {
                    return this.mArcs[i3].getDX();
                }
                return this.mArcs[i3].getDY();
            }
            i3++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mTime;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ArcCurveFit(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r2 = r24
            r24.<init>()
            r0 = 1
            r2.mExtrapolate = r0
            r3 = r26
            r2.mTime = r3
            int r1 = r3.length
            int r1 = r1 - r0
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r1 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[r1]
            r2.mArcs = r1
            r9 = 0
            r5 = r0
            r11 = r5
            r1 = r9
        L16:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r4 = r2.mArcs
            int r6 = r4.length
            if (r1 >= r6) goto L4b
            r8 = r25[r1]
            r7 = 3
            if (r8 == 0) goto L49
            if (r8 == r0) goto L42
            r6 = 2
            if (r8 == r6) goto L46
            if (r8 == r7) goto L44
        L27:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc r10 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc
            r12 = r3[r1]
            int r7 = r1 + 1
            r14 = r3[r7]
            r6 = r27[r1]
            r16 = r6[r9]
            r18 = r6[r0]
            r6 = r27[r7]
            r20 = r6[r9]
            r22 = r6[r0]
            r10.<init>(r11, r12, r14, r16, r18, r20, r22)
            r4[r1] = r10
            r1 = r7
            goto L16
        L42:
            r5 = r0
            goto L47
        L44:
            if (r5 != r0) goto L42
        L46:
            r5 = r6
        L47:
            r11 = r5
            goto L27
        L49:
            r11 = r7
            goto L27
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.ArcCurveFit.<init>(int[], double[], double[][]):void");
    }

    private static class Arc {
        private static final double EPSILON = 0.001d;
        private static final String TAG = "Arc";
        private static double[] ourPercent = new double[91];
        boolean linear;
        double mArcDistance;
        double mArcVelocity;
        double mEllipseA;
        double mEllipseB;
        double mEllipseCenterX;
        double mEllipseCenterY;
        double[] mLut;
        double mOneOverDeltaTime;
        double mTime1;
        double mTime2;
        double mTmpCosAngle;
        double mTmpSinAngle;
        boolean mVertical;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        Arc(int i2, double d2, double d3, double d4, double d5, double d6, double d7) {
            this.linear = false;
            this.mVertical = i2 == 1;
            this.mTime1 = d2;
            this.mTime2 = d3;
            this.mOneOverDeltaTime = 1.0d / (d3 - d2);
            if (3 == i2) {
                this.linear = true;
            }
            double d8 = d6 - d4;
            double d9 = d7 - d5;
            if (this.linear || Math.abs(d8) < EPSILON || Math.abs(d9) < EPSILON) {
                this.linear = true;
                this.mX1 = d4;
                this.mX2 = d6;
                this.mY1 = d5;
                this.mY2 = d7;
                double dHypot = Math.hypot(d9, d8);
                this.mArcDistance = dHypot;
                this.mArcVelocity = dHypot * this.mOneOverDeltaTime;
                double d10 = this.mTime2;
                double d11 = this.mTime1;
                this.mEllipseCenterX = d8 / (d10 - d11);
                this.mEllipseCenterY = d9 / (d10 - d11);
                return;
            }
            this.mLut = new double[101];
            boolean z2 = this.mVertical;
            this.mEllipseA = d8 * ((double) (z2 ? -1 : 1));
            this.mEllipseB = d9 * ((double) (z2 ? 1 : -1));
            this.mEllipseCenterX = z2 ? d6 : d4;
            this.mEllipseCenterY = z2 ? d5 : d7;
            buildTable(d4, d5, d6, d7);
            this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
        }

        void setPoint(double d2) {
            double dLookup = lookup((this.mVertical ? this.mTime2 - d2 : d2 - this.mTime1) * this.mOneOverDeltaTime) * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(dLookup);
            this.mTmpCosAngle = Math.cos(dLookup);
        }

        double getX() {
            return this.mEllipseCenterX + (this.mEllipseA * this.mTmpSinAngle);
        }

        double getY() {
            return this.mEllipseCenterY + (this.mEllipseB * this.mTmpCosAngle);
        }

        double getDX() {
            double d2 = this.mEllipseA * this.mTmpCosAngle;
            double dHypot = this.mArcVelocity / Math.hypot(d2, (-this.mEllipseB) * this.mTmpSinAngle);
            if (this.mVertical) {
                d2 = -d2;
            }
            return d2 * dHypot;
        }

        double getDY() {
            double d2 = this.mEllipseA * this.mTmpCosAngle;
            double d3 = (-this.mEllipseB) * this.mTmpSinAngle;
            double dHypot = this.mArcVelocity / Math.hypot(d2, d3);
            return this.mVertical ? (-d3) * dHypot : d3 * dHypot;
        }

        public double getLinearX(double d2) {
            double d3 = (d2 - this.mTime1) * this.mOneOverDeltaTime;
            double d4 = this.mX1;
            return d4 + (d3 * (this.mX2 - d4));
        }

        public double getLinearY(double d2) {
            double d3 = (d2 - this.mTime1) * this.mOneOverDeltaTime;
            double d4 = this.mY1;
            return d4 + (d3 * (this.mY2 - d4));
        }

        public double getLinearDX(double d2) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d2) {
            return this.mEllipseCenterY;
        }

        double lookup(double d2) {
            if (d2 <= 0.0d) {
                return 0.0d;
            }
            if (d2 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d2 * ((double) (dArr.length - 1));
            int i2 = (int) length;
            double d3 = dArr[i2];
            return d3 + ((length - ((double) i2)) * (dArr[i2 + 1] - d3));
        }

        private void buildTable(double d2, double d3, double d4, double d5) {
            double dHypot;
            double d6 = d4 - d2;
            double d7 = d3 - d5;
            int i2 = 0;
            double d8 = 0.0d;
            double d9 = 0.0d;
            double d10 = 0.0d;
            while (true) {
                if (i2 >= ourPercent.length) {
                    break;
                }
                double radians = Math.toRadians((((double) i2) * 90.0d) / ((double) (r8.length - 1)));
                double dSin = Math.sin(radians) * d6;
                double dCos = Math.cos(radians) * d7;
                if (i2 > 0) {
                    dHypot = Math.hypot(dSin - d9, dCos - d10) + d8;
                    ourPercent[i2] = dHypot;
                } else {
                    dHypot = d8;
                }
                i2++;
                d10 = dCos;
                d8 = dHypot;
                d9 = dSin;
            }
            this.mArcDistance = d8;
            int i3 = 0;
            while (true) {
                double[] dArr = ourPercent;
                if (i3 >= dArr.length) {
                    break;
                }
                dArr[i3] = dArr[i3] / d8;
                i3++;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= this.mLut.length) {
                    return;
                }
                double length = ((double) i4) / ((double) (r1.length - 1));
                int iBinarySearch = Arrays.binarySearch(ourPercent, length);
                if (iBinarySearch >= 0) {
                    this.mLut[i4] = ((double) iBinarySearch) / ((double) (ourPercent.length - 1));
                } else if (iBinarySearch == -1) {
                    this.mLut[i4] = 0.0d;
                } else {
                    int i5 = -iBinarySearch;
                    int i6 = i5 - 2;
                    double[] dArr2 = ourPercent;
                    double d11 = dArr2[i6];
                    this.mLut[i4] = (((double) i6) + ((length - d11) / (dArr2[i5 - 1] - d11))) / ((double) (dArr2.length - 1));
                }
                i4++;
            }
        }
    }
}
