package androidx.core.graphics;

import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class PathParser {
    private static final String LOGTAG = "PathParser";

    static float[] copyOfRange(float[] fArr, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i2 < 0 || i2 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = i3 - i2;
        float[] fArr2 = new float[i4];
        System.arraycopy(fArr, i2, fArr2, 0, Math.min(i4, length - i2));
        return fArr2;
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        try {
            PathDataNode.nodesToPath(createNodesFromPathData(str), path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing " + str, e2);
        }
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 1;
        while (i3 < str.length()) {
            int iNextStart = nextStart(str, i3);
            String strTrim = str.substring(i2, iNextStart).trim();
            if (!strTrim.isEmpty()) {
                addNode(arrayList, strTrim.charAt(0), getFloats(strTrim));
            }
            i3 = iNextStart + 1;
            i2 = iNextStart;
        }
        if (i3 - i2 == 1 && i2 < str.length()) {
            addNode(arrayList, str.charAt(i2), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[0]);
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
            pathDataNodeArr2[i2] = new PathDataNode(pathDataNodeArr[i2]);
        }
        return pathDataNodeArr2;
    }

    public static boolean canMorph(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
            if (pathDataNodeArr[i2].mType != pathDataNodeArr2[i2].mType || pathDataNodeArr[i2].mParams.length != pathDataNodeArr2[i2].mParams.length) {
                return false;
            }
        }
        return true;
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i2 = 0; i2 < pathDataNodeArr2.length; i2++) {
            pathDataNodeArr[i2].mType = pathDataNodeArr2[i2].mType;
            for (int i3 = 0; i3 < pathDataNodeArr2[i2].mParams.length; i3++) {
                pathDataNodeArr[i2].mParams[i3] = pathDataNodeArr2[i2].mParams[i3];
            }
        }
    }

    private static int nextStart(String str, int i2) {
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i2;
            }
            i2++;
        }
        return i2;
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c2, float[] fArr) {
        arrayList.add(new PathDataNode(c2, fArr));
    }

    private static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;

        ExtractFloatResult() {
        }
    }

    private static float[] getFloats(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int i2 = 1;
            int i3 = 0;
            while (i2 < length) {
                extract(str, i2, extractFloatResult);
                int i4 = extractFloatResult.mEndPosition;
                if (i2 < i4) {
                    fArr[i3] = Float.parseFloat(str.substring(i2, i4));
                    i3++;
                }
                i2 = extractFloatResult.mEndWithNegOrDot ? i4 : i4 + 1;
            }
            return copyOfRange(fArr, 0, i3);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027 A[LOOP:0: B:3:0x0007->B:16:0x0027, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0024 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void extract(java.lang.String r8, int r9, androidx.core.graphics.PathParser.ExtractFloatResult r10) {
        /*
            r7 = 0
            r10.mEndWithNegOrDot = r7
            r6 = r9
            r5 = r7
            r4 = r5
            r3 = r4
        L7:
            int r0 = r8.length()
            if (r6 >= r0) goto L24
            char r2 = r8.charAt(r6)
            r0 = 32
            r1 = 1
            if (r2 == r0) goto L3a
            r0 = 69
            if (r2 == r0) goto L36
            r0 = 101(0x65, float:1.42E-43)
            if (r2 == r0) goto L36
            switch(r2) {
                case 44: goto L3a;
                case 45: goto L2a;
                case 46: goto L31;
                default: goto L21;
            }
        L21:
            r5 = r7
        L22:
            if (r3 == 0) goto L27
        L24:
            r10.mEndPosition = r6
            return
        L27:
            int r6 = r6 + 1
            goto L7
        L2a:
            if (r6 == r9) goto L21
            if (r5 != 0) goto L21
            r10.mEndWithNegOrDot = r1
            goto L3a
        L31:
            if (r4 != 0) goto L38
            r5 = r7
            r4 = r1
            goto L22
        L36:
            r5 = r1
            goto L22
        L38:
            r10.mEndWithNegOrDot = r1
        L3a:
            r5 = r7
            r3 = r1
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.PathParser.extract(java.lang.String, int, androidx.core.graphics.PathParser$ExtractFloatResult):void");
    }

    public static void interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, float f2, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3) {
        if (!interpolatePathDataNodes(pathDataNodeArr, pathDataNodeArr2, pathDataNodeArr3, f2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    @Deprecated
    public static boolean interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3, float f2) {
        if (pathDataNodeArr.length != pathDataNodeArr2.length || pathDataNodeArr2.length != pathDataNodeArr3.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
            return false;
        }
        for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
            pathDataNodeArr[i2].interpolatePathDataNode(pathDataNodeArr2[i2], pathDataNodeArr3[i2], f2);
        }
        return true;
    }

    public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
        float[] fArr = new float[6];
        char c2 = 'm';
        for (PathDataNode pathDataNode : pathDataNodeArr) {
            PathDataNode.addCommand(path, fArr, c2, pathDataNode.mType, pathDataNode.mParams);
            c2 = pathDataNode.mType;
        }
    }

    public static class PathDataNode {
        public final float[] mParams;
        public char mType;

        public char getType() {
            return this.mType;
        }

        public float[] getParams() {
            return this.mParams;
        }

        PathDataNode(char c2, float[] fArr) {
            this.mType = c2;
            this.mParams = fArr;
        }

        PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }

        @Deprecated
        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            PathParser.nodesToPath(pathDataNodeArr, path);
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f2) {
            this.mType = pathDataNode.mType;
            int i2 = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i2 >= fArr.length) {
                    return;
                }
                this.mParams[i2] = (fArr[i2] * (1.0f - f2)) + (pathDataNode2.mParams[i2] * f2);
                i2++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void addCommand(Path path, float[] fArr, char c2, char c3, float[] fArr2) {
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            char c4 = c2;
            char c5 = c3;
            char c6 = 0;
            float f8 = fArr[0];
            float f9 = fArr[1];
            int i2 = 2;
            float f10 = fArr[2];
            float f11 = fArr[3];
            float f12 = fArr[4];
            float f13 = fArr[5];
            switch (c5) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f12, f13);
                    f8 = f12;
                    f10 = f8;
                    f9 = f13;
                    f11 = f9;
                    break;
            }
            int i3 = 0;
            while (i3 < fArr2.length) {
                if (c5 == 'A') {
                    int i4 = i3 + 5;
                    int i5 = i3 + 6;
                    drawArc(path, f8, f9, fArr2[i4], fArr2[i5], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                    f8 = fArr2[i4];
                    f9 = fArr2[i5];
                } else {
                    if (c5 == 'C') {
                        int i6 = i3 + 2;
                        int i7 = i3 + 3;
                        int i8 = i3 + 4;
                        int i9 = i3 + 5;
                        path.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                        f8 = fArr2[i8];
                        f9 = fArr2[i9];
                        f10 = fArr2[i6];
                        f11 = fArr2[i7];
                    } else if (c5 == 'H') {
                        path.lineTo(fArr2[i3], f9);
                        f8 = fArr2[i3];
                    } else if (c5 == 'Q') {
                        int i10 = i3 + 1;
                        int i11 = i3 + 2;
                        int i12 = i3 + 3;
                        path.quadTo(fArr2[i3], fArr2[i10], fArr2[i11], fArr2[i12]);
                        f10 = fArr2[i3];
                        f11 = fArr2[i10];
                        f8 = fArr2[i11];
                        f9 = fArr2[i12];
                    } else if (c5 == 'V') {
                        path.lineTo(f8, fArr2[i3]);
                        f9 = fArr2[i3];
                    } else if (c5 != 'a') {
                        if (c5 == 'c') {
                            int i13 = i3 + 2;
                            int i14 = i3 + 3;
                            int i15 = i3 + 4;
                            int i16 = i3 + 5;
                            path.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                            f10 = fArr2[i13] + f8;
                            f11 = fArr2[i14] + f9;
                            f8 += fArr2[i15];
                            f2 = fArr2[i16];
                        } else if (c5 == 'h') {
                            path.rLineTo(fArr2[i3], 0.0f);
                            f8 += fArr2[i3];
                        } else if (c5 != 'q') {
                            if (c5 == 'v') {
                                path.rLineTo(0.0f, fArr2[i3]);
                                f3 = fArr2[i3];
                            } else if (c5 == 'L') {
                                int i17 = i3 + 1;
                                path.lineTo(fArr2[i3], fArr2[i17]);
                                f8 = fArr2[i3];
                                f9 = fArr2[i17];
                            } else if (c5 == 'M') {
                                f8 = fArr2[i3];
                                f9 = fArr2[i3 + 1];
                                if (i3 > 0) {
                                    path.lineTo(f8, f9);
                                } else {
                                    path.moveTo(f8, f9);
                                    f13 = f9;
                                    f12 = f8;
                                }
                            } else if (c5 == 'S') {
                                if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                    f8 = (f8 * 2.0f) - f10;
                                    f9 = (f9 * 2.0f) - f11;
                                }
                                int i18 = i3 + 1;
                                int i19 = i3 + 2;
                                int i20 = i3 + 3;
                                path.cubicTo(f8, f9, fArr2[i3], fArr2[i18], fArr2[i19], fArr2[i20]);
                                f10 = fArr2[i3];
                                f11 = fArr2[i18];
                                f8 = fArr2[i19];
                                f9 = fArr2[i20];
                            } else if (c5 == 'T') {
                                if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                    f8 = (f8 * 2.0f) - f10;
                                    f9 = (f9 * 2.0f) - f11;
                                }
                                int i21 = i3 + 1;
                                path.quadTo(f8, f9, fArr2[i3], fArr2[i21]);
                                float f14 = fArr2[i3];
                                float f15 = fArr2[i21];
                                f11 = f9;
                                f10 = f8;
                                f8 = f14;
                                f9 = f15;
                            } else if (c5 == 'l') {
                                int i22 = i3 + 1;
                                path.rLineTo(fArr2[i3], fArr2[i22]);
                                f8 += fArr2[i3];
                                f3 = fArr2[i22];
                            } else if (c5 == 'm') {
                                float f16 = fArr2[i3];
                                f8 += f16;
                                float f17 = fArr2[i3 + 1];
                                f9 += f17;
                                if (i3 > 0) {
                                    path.rLineTo(f16, f17);
                                } else {
                                    path.rMoveTo(f16, f17);
                                    f13 = f9;
                                    f12 = f8;
                                }
                            } else if (c5 == 's') {
                                if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                    f4 = f8 - f10;
                                    f5 = f9 - f11;
                                } else {
                                    f4 = 0.0f;
                                    f5 = 0.0f;
                                }
                                int i23 = i3 + 1;
                                int i24 = i3 + 2;
                                int i25 = i3 + 3;
                                path.rCubicTo(f4, f5, fArr2[i3], fArr2[i23], fArr2[i24], fArr2[i25]);
                                f10 = fArr2[i3] + f8;
                                f11 = fArr2[i23] + f9;
                                f8 += fArr2[i24];
                                f2 = fArr2[i25];
                            } else if (c5 == 't') {
                                if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                    f6 = f8 - f10;
                                    f7 = f9 - f11;
                                } else {
                                    f7 = 0.0f;
                                    f6 = 0.0f;
                                }
                                int i26 = i3 + 1;
                                path.rQuadTo(f6, f7, fArr2[i3], fArr2[i26]);
                                f10 = f6 + f8;
                                f11 = f7 + f9;
                                f8 += fArr2[i3];
                                f9 += fArr2[i26];
                            }
                            f9 += f3;
                        } else {
                            int i27 = i3 + 1;
                            int i28 = i3 + 2;
                            int i29 = i3 + 3;
                            path.rQuadTo(fArr2[i3], fArr2[i27], fArr2[i28], fArr2[i29]);
                            f10 = fArr2[i3] + f8;
                            f11 = fArr2[i27] + f9;
                            f8 += fArr2[i28];
                            f2 = fArr2[i29];
                        }
                        f9 += f2;
                    } else {
                        int i30 = i3 + 5;
                        float f18 = fArr2[i30] + f8;
                        int i31 = i3 + 6;
                        float f19 = fArr2[i31] + f9;
                        float f20 = f9;
                        drawArc(path, f8, f20, f18, f19, fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                        f8 = fArr2[i30] + f8;
                        f9 = f20 + fArr2[i31];
                    }
                    i3 += i2;
                    c4 = c3;
                    c5 = c4;
                    c6 = 0;
                }
                f11 = f9;
                f10 = f8;
                i3 += i2;
                c4 = c3;
                c5 = c4;
                c6 = 0;
            }
            fArr[c6] = f8;
            fArr[1] = f9;
            fArr[2] = f10;
            fArr[3] = f11;
            fArr[4] = f12;
            fArr[5] = f13;
        }

        private static void drawArc(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z2, boolean z3) {
            double d2;
            double d3;
            double radians = Math.toRadians(f8);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d4 = f2;
            double d5 = f3;
            double d6 = f6;
            double d7 = ((d4 * dCos) + (d5 * dSin)) / d6;
            double d8 = f7;
            double d9 = ((((double) (-f2)) * dSin) + (d5 * dCos)) / d8;
            double d10 = f5;
            double d11 = ((((double) f4) * dCos) + (d10 * dSin)) / d6;
            double d12 = ((((double) (-f4)) * dSin) + (d10 * dCos)) / d8;
            double d13 = d7 - d11;
            double d14 = d9 - d12;
            double d15 = (d7 + d11) / 2.0d;
            double d16 = (d9 + d12) / 2.0d;
            double d17 = (d13 * d13) + (d14 * d14);
            if (d17 == 0.0d) {
                return;
            }
            double d18 = (1.0d / d17) - 0.25d;
            if (d18 < 0.0d) {
                String str = "Points are too far apart " + d17;
                float fSqrt = (float) (Math.sqrt(d17) / 1.99999d);
                drawArc(path, f2, f3, f4, f5, f6 * fSqrt, f7 * fSqrt, f8, z2, z3);
                return;
            }
            double dSqrt = Math.sqrt(d18);
            double d19 = d13 * dSqrt;
            double d20 = dSqrt * d14;
            if (z2 == z3) {
                d2 = d15 - d20;
                d3 = d16 + d19;
            } else {
                d2 = d15 + d20;
                d3 = d16 - d19;
            }
            double dAtan2 = Math.atan2(d9 - d3, d7 - d2);
            double dAtan22 = Math.atan2(d12 - d3, d11 - d2) - dAtan2;
            if (z3 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d21 = d2 * d6;
            double d22 = d3 * d8;
            arcToBezier(path, (d21 * dCos) - (d22 * dSin), (d21 * dSin) + (d22 * dCos), d6, d8, d4, d5, radians, dAtan2, dAtan22);
        }

        private static void arcToBezier(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
            double d11 = d7;
            double d12 = d6;
            int iCeil = (int) Math.ceil(Math.abs((d10 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d8);
            double dSin = Math.sin(d8);
            double dCos2 = Math.cos(d9);
            double dSin2 = Math.sin(d9);
            double d13 = -d4;
            double d14 = d13 * dCos;
            double d15 = d5 * dSin;
            double d16 = (d14 * dSin2) - (d15 * dCos2);
            double d17 = d13 * dSin;
            double d18 = d5 * dCos;
            double d19 = (dSin2 * d17) + (dCos2 * d18);
            double d20 = d10 / ((double) iCeil);
            int i2 = 0;
            while (i2 < iCeil) {
                double d21 = d9 + d20;
                double dSin3 = Math.sin(d21);
                double dCos3 = Math.cos(d21);
                double d22 = (d2 + ((d4 * dCos) * dCos3)) - (d15 * dSin3);
                double d23 = d3 + (d4 * dSin * dCos3) + (d18 * dSin3);
                double d24 = (d14 * dSin3) - (d15 * dCos3);
                double d25 = (dSin3 * d17) + (dCos3 * d18);
                double d26 = d21 - d9;
                double dTan = Math.tan(d26 / 2.0d);
                double dSin4 = (Math.sin(d26) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) (d12 + (d16 * dSin4)), (float) (d11 + (d19 * dSin4)), (float) (d22 - (dSin4 * d24)), (float) (d23 - (dSin4 * d25)), (float) d22, (float) d23);
                i2++;
                d12 = d22;
                d9 = d21;
                d19 = d25;
                d16 = d24;
                d11 = d23;
            }
        }
    }

    private PathParser() {
    }
}
