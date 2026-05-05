package com.google.android.material.color.utilities;

import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class QuantizerWu implements Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    /* JADX INFO: renamed from: com.google.android.material.color.utilities.QuantizerWu$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction;

        static {
            int[] iArr = new int[Direction.values().length];
            $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction = iArr;
            try {
                iArr[Direction.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[Direction.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[Direction.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static final class Box {

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        int f3311b0;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        int f3312b1;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        int f3313g0;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        int f3314g1;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        int f3315r0;
        int r1;
        int vol;

        private Box() {
            this.f3315r0 = 0;
            this.r1 = 0;
            this.f3313g0 = 0;
            this.f3314g1 = 0;
            this.f3311b0 = 0;
            this.f3312b1 = 0;
            this.vol = 0;
        }

        /* synthetic */ Box(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private static final class CreateBoxesResult {
        int resultCount;

        CreateBoxesResult(int i2, int i3) {
            this.resultCount = i3;
        }
    }

    private enum Direction {
        RED,
        GREEN,
        BLUE
    }

    private static final class MaximizeResult {
        int cutLocation;
        double maximum;

        MaximizeResult(int i2, double d2) {
            this.cutLocation = i2;
            this.maximum = d2;
        }
    }

    static int bottom(Box box, Direction direction, int[] iArr) {
        int i2;
        int i3;
        int i4 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i4 == 1) {
            i2 = (-iArr[getIndex(box.f3315r0, box.f3314g1, box.f3312b1)]) + iArr[getIndex(box.f3315r0, box.f3314g1, box.f3311b0)] + iArr[getIndex(box.f3315r0, box.f3313g0, box.f3312b1)];
            i3 = iArr[getIndex(box.f3315r0, box.f3313g0, box.f3311b0)];
        } else if (i4 == 2) {
            i2 = (-iArr[getIndex(box.r1, box.f3313g0, box.f3312b1)]) + iArr[getIndex(box.r1, box.f3313g0, box.f3311b0)] + iArr[getIndex(box.f3315r0, box.f3313g0, box.f3312b1)];
            i3 = iArr[getIndex(box.f3315r0, box.f3313g0, box.f3311b0)];
        } else {
            if (i4 != 3) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i2 = (-iArr[getIndex(box.r1, box.f3314g1, box.f3311b0)]) + iArr[getIndex(box.r1, box.f3313g0, box.f3311b0)] + iArr[getIndex(box.f3315r0, box.f3314g1, box.f3311b0)];
            i3 = iArr[getIndex(box.f3315r0, box.f3313g0, box.f3311b0)];
        }
        return i2 - i3;
    }

    static int getIndex(int i2, int i3, int i4) {
        return (i2 << 10) + (i2 << 6) + i2 + (i3 << 5) + i3 + i4;
    }

    static int top(Box box, Direction direction, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i5 == 1) {
            i3 = (iArr[getIndex(i2, box.f3314g1, box.f3312b1)] - iArr[getIndex(i2, box.f3314g1, box.f3311b0)]) - iArr[getIndex(i2, box.f3313g0, box.f3312b1)];
            i4 = iArr[getIndex(i2, box.f3313g0, box.f3311b0)];
        } else if (i5 == 2) {
            i3 = (iArr[getIndex(box.r1, i2, box.f3312b1)] - iArr[getIndex(box.r1, i2, box.f3311b0)]) - iArr[getIndex(box.f3315r0, i2, box.f3312b1)];
            i4 = iArr[getIndex(box.f3315r0, i2, box.f3311b0)];
        } else {
            if (i5 != 3) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i3 = (iArr[getIndex(box.r1, box.f3314g1, i2)] - iArr[getIndex(box.r1, box.f3313g0, i2)]) - iArr[getIndex(box.f3315r0, box.f3314g1, i2)];
            i4 = iArr[getIndex(box.f3315r0, box.f3313g0, i2)];
        }
        return i3 + i4;
    }

    static int volume(Box box, int[] iArr) {
        return ((((((iArr[getIndex(box.r1, box.f3314g1, box.f3312b1)] - iArr[getIndex(box.r1, box.f3314g1, box.f3311b0)]) - iArr[getIndex(box.r1, box.f3313g0, box.f3312b1)]) + iArr[getIndex(box.r1, box.f3313g0, box.f3311b0)]) - iArr[getIndex(box.f3315r0, box.f3314g1, box.f3312b1)]) + iArr[getIndex(box.f3315r0, box.f3314g1, box.f3311b0)]) + iArr[getIndex(box.f3315r0, box.f3313g0, box.f3312b1)]) - iArr[getIndex(box.f3315r0, box.f3313g0, box.f3311b0)];
    }

    void constructHistogram(Map<Integer, Integer> map) {
        this.weights = new int[TOTAL_SIZE];
        this.momentsR = new int[TOTAL_SIZE];
        this.momentsG = new int[TOTAL_SIZE];
        this.momentsB = new int[TOTAL_SIZE];
        this.moments = new double[TOTAL_SIZE];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int iRedFromArgb = ColorUtils.redFromArgb(iIntValue);
            int iGreenFromArgb = ColorUtils.greenFromArgb(iIntValue);
            int iBlueFromArgb = ColorUtils.blueFromArgb(iIntValue);
            int index = getIndex((iRedFromArgb >> 3) + 1, (iGreenFromArgb >> 3) + 1, (iBlueFromArgb >> 3) + 1);
            int[] iArr = this.weights;
            iArr[index] = iArr[index] + iIntValue2;
            int[] iArr2 = this.momentsR;
            iArr2[index] = iArr2[index] + (iRedFromArgb * iIntValue2);
            int[] iArr3 = this.momentsG;
            iArr3[index] = iArr3[index] + (iGreenFromArgb * iIntValue2);
            int[] iArr4 = this.momentsB;
            iArr4[index] = iArr4[index] + (iBlueFromArgb * iIntValue2);
            double[] dArr = this.moments;
            dArr[index] = dArr[index] + ((double) (iIntValue2 * ((iRedFromArgb * iRedFromArgb) + (iGreenFromArgb * iGreenFromArgb) + (iBlueFromArgb * iBlueFromArgb))));
        }
    }

    CreateBoxesResult createBoxes(int i2) {
        int i3;
        this.cubes = new Box[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            this.cubes[i4] = new Box(null);
        }
        double[] dArr = new double[i2];
        Box box = this.cubes[0];
        box.r1 = 32;
        box.f3314g1 = 32;
        box.f3312b1 = 32;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            if (i6 >= i2) {
                i3 = i2;
                break;
            }
            Box[] boxArr = this.cubes;
            if (cut(boxArr[i5], boxArr[i6]).booleanValue()) {
                dArr[i5] = this.cubes[i5].vol > 1 ? variance(this.cubes[i5]) : 0.0d;
                dArr[i6] = this.cubes[i6].vol > 1 ? variance(this.cubes[i6]) : 0.0d;
            } else {
                dArr[i5] = 0.0d;
                i6--;
            }
            double d2 = dArr[0];
            i5 = 0;
            for (int i7 = 1; i7 <= i6; i7++) {
                double d3 = dArr[i7];
                if (d3 > d2) {
                    i5 = i7;
                    d2 = d3;
                }
            }
            if (d2 <= 0.0d) {
                i3 = i6 + 1;
                break;
            }
            i6++;
        }
        return new CreateBoxesResult(i2, i3);
    }

    void createMoments() {
        int i2 = 1;
        while (true) {
            int i3 = 33;
            if (i2 >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i4 = 1;
            while (i4 < i3) {
                int i5 = 0;
                double d2 = 0.0d;
                int i6 = 0;
                int i7 = 1;
                int i8 = 0;
                int i9 = 0;
                while (i7 < i3) {
                    int index = getIndex(i2, i4, i7);
                    i5 += this.weights[index];
                    i8 += this.momentsR[index];
                    i9 += this.momentsG[index];
                    i6 += this.momentsB[index];
                    d2 += this.moments[index];
                    iArr[i7] = iArr[i7] + i5;
                    iArr2[i7] = iArr2[i7] + i8;
                    iArr3[i7] = iArr3[i7] + i9;
                    iArr4[i7] = iArr4[i7] + i6;
                    dArr[i7] = dArr[i7] + d2;
                    int index2 = getIndex(i2 - 1, i4, i7);
                    int[] iArr5 = this.weights;
                    iArr5[index] = iArr5[index2] + iArr[i7];
                    int[] iArr6 = this.momentsR;
                    iArr6[index] = iArr6[index2] + iArr2[i7];
                    int[] iArr7 = this.momentsG;
                    iArr7[index] = iArr7[index2] + iArr3[i7];
                    int[] iArr8 = this.momentsB;
                    iArr8[index] = iArr8[index2] + iArr4[i7];
                    double[] dArr2 = this.moments;
                    dArr2[index] = dArr2[index2] + dArr[i7];
                    i7++;
                    i3 = 33;
                }
                i4++;
                i3 = 33;
            }
            i2++;
        }
    }

    List<Integer> createResult(int i2) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            Box box = this.cubes[i3];
            int iVolume = volume(box, this.weights);
            if (iVolume > 0) {
                int iVolume2 = volume(box, this.momentsR) / iVolume;
                int iVolume3 = volume(box, this.momentsG) / iVolume;
                int iVolume4 = volume(box, this.momentsB) / iVolume;
                int i4 = ((iVolume2 & 255) << 16) | ViewCompat.MEASURED_STATE_MASK;
                int i5 = ((-1) - (((-1) - iVolume3) | ((-1) - 255))) << 8;
                int i6 = (i4 + i5) - (i4 & i5);
                int i7 = (-1) - (((-1) - iVolume4) | ((-1) - 255));
                arrayList.add(Integer.valueOf((i7 + i6) - (i7 & i6)));
            }
        }
        return arrayList;
    }

    Boolean cut(Box box, Box box2) {
        Direction direction;
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        int iVolume4 = volume(box, this.weights);
        MaximizeResult maximizeResultMaximize = maximize(box, Direction.RED, box.f3315r0 + 1, box.r1, iVolume, iVolume2, iVolume3, iVolume4);
        MaximizeResult maximizeResultMaximize2 = maximize(box, Direction.GREEN, box.f3313g0 + 1, box.f3314g1, iVolume, iVolume2, iVolume3, iVolume4);
        MaximizeResult maximizeResultMaximize3 = maximize(box, Direction.BLUE, box.f3311b0 + 1, box.f3312b1, iVolume, iVolume2, iVolume3, iVolume4);
        double d2 = maximizeResultMaximize.maximum;
        double d3 = maximizeResultMaximize2.maximum;
        double d4 = maximizeResultMaximize3.maximum;
        if (d2 < d3 || d2 < d4) {
            direction = (d3 < d2 || d3 < d4) ? Direction.BLUE : Direction.GREEN;
        } else {
            if (maximizeResultMaximize.cutLocation < 0) {
                return false;
            }
            direction = Direction.RED;
        }
        box2.r1 = box.r1;
        box2.f3314g1 = box.f3314g1;
        box2.f3312b1 = box.f3312b1;
        int i2 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i2 == 1) {
            box.r1 = maximizeResultMaximize.cutLocation;
            box2.f3315r0 = box.r1;
            box2.f3313g0 = box.f3313g0;
            box2.f3311b0 = box.f3311b0;
        } else if (i2 == 2) {
            box.f3314g1 = maximizeResultMaximize2.cutLocation;
            box2.f3315r0 = box.f3315r0;
            box2.f3313g0 = box.f3314g1;
            box2.f3311b0 = box.f3311b0;
        } else if (i2 == 3) {
            box.f3312b1 = maximizeResultMaximize3.cutLocation;
            box2.f3315r0 = box.f3315r0;
            box2.f3313g0 = box.f3313g0;
            box2.f3311b0 = box.f3312b1;
        }
        box.vol = (box.r1 - box.f3315r0) * (box.f3314g1 - box.f3313g0) * (box.f3312b1 - box.f3311b0);
        box2.vol = (box2.r1 - box2.f3315r0) * (box2.f3314g1 - box2.f3313g0) * (box2.f3312b1 - box2.f3311b0);
        return true;
    }

    MaximizeResult maximize(Box box, Direction direction, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i2;
        QuantizerWu quantizerWu = this;
        int iBottom = bottom(box, direction, quantizerWu.momentsR);
        int iBottom2 = bottom(box, direction, quantizerWu.momentsG);
        int iBottom3 = bottom(box, direction, quantizerWu.momentsB);
        int iBottom4 = bottom(box, direction, quantizerWu.weights);
        double d2 = 0.0d;
        int i9 = -1;
        while (i8 < i3) {
            int pVar = top(box, direction, i8, quantizerWu.momentsR) + iBottom;
            int pVar2 = top(box, direction, i8, quantizerWu.momentsG) + iBottom2;
            int pVar3 = top(box, direction, i8, quantizerWu.momentsB) + iBottom3;
            int pVar4 = top(box, direction, i8, quantizerWu.weights) + iBottom4;
            if (pVar4 != 0) {
                double d3 = ((double) (((pVar * pVar) + (pVar2 * pVar2)) + (pVar3 * pVar3))) / ((double) pVar4);
                int i10 = i4 - pVar;
                int i11 = i5 - pVar2;
                int i12 = i6 - pVar3;
                int i13 = i7 - pVar4;
                if (i13 != 0) {
                    double d4 = d3 + (((double) (((i10 * i10) + (i11 * i11)) + (i12 * i12))) / ((double) i13));
                    if (d4 > d2) {
                        d2 = d4;
                        i9 = i8;
                    }
                }
            }
            i8++;
            quantizerWu = this;
        }
        return new MaximizeResult(i9, d2);
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i2) {
        constructHistogram(new QuantizerMap().quantize(iArr, i2).colorToCount);
        createMoments();
        List<Integer> listCreateResult = createResult(createBoxes(i2).resultCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Integer> it = listCreateResult.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(Integer.valueOf(it.next().intValue()), 0);
        }
        return new QuantizerResult(linkedHashMap);
    }

    double variance(Box box) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        return (((((((this.moments[getIndex(box.r1, box.f3314g1, box.f3312b1)] - this.moments[getIndex(box.r1, box.f3314g1, box.f3311b0)]) - this.moments[getIndex(box.r1, box.f3313g0, box.f3312b1)]) + this.moments[getIndex(box.r1, box.f3313g0, box.f3311b0)]) - this.moments[getIndex(box.f3315r0, box.f3314g1, box.f3312b1)]) + this.moments[getIndex(box.f3315r0, box.f3314g1, box.f3311b0)]) + this.moments[getIndex(box.f3315r0, box.f3313g0, box.f3312b1)]) - this.moments[getIndex(box.f3315r0, box.f3313g0, box.f3311b0)]) - (((double) (((iVolume * iVolume) + (iVolume2 * iVolume2)) + (iVolume3 * iVolume3))) / ((double) volume(box, this.weights)));
    }
}
