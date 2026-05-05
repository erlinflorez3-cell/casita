package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
class PathParser {
    static ArrayList<PathElement> elements = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f3544i = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f3545l = 0;
    private static Path mPath = null;
    private static boolean mPenDown = false;
    private static float mPenDownX = 0.0f;
    private static float mPenDownY = 0.0f;
    private static float mPenX = 0.0f;
    private static float mPenY = 0.0f;
    private static float mPivotX = 0.0f;
    private static float mPivotY = 0.0f;
    static float mScale = 0.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static String f3546s = null;

    PathParser() {
    }

    private static void arc(float f2, float f3, float f4, boolean z2, boolean z3, float f5, float f6) {
        arcTo(f2, f3, f4, z2, z3, f5 + mPenX, f6 + mPenY);
    }

    private static void arcTo(float f2, float f3, float f4, boolean z2, boolean z3, float f5, float f6) {
        float f7;
        float f8;
        float f9 = mPenX;
        float f10 = mPenY;
        if (f3 == 0.0f) {
            f3 = f2 == 0.0f ? f6 - f10 : f2;
        }
        float fAbs = Math.abs(f3);
        if (f2 == 0.0f) {
            f2 = f5 - f9;
        }
        float fAbs2 = Math.abs(f2);
        if (fAbs2 == 0.0f || fAbs == 0.0f || (f5 == f9 && f6 == f10)) {
            lineTo(f5, f6);
            return;
        }
        float radians = (float) Math.toRadians(f4);
        double d2 = radians;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        float f11 = f5 - f9;
        float f12 = f6 - f10;
        float f13 = ((fCos * f11) / 2.0f) + ((fSin * f12) / 2.0f);
        float f14 = -fSin;
        float f15 = ((f14 * f11) / 2.0f) + ((fCos * f12) / 2.0f);
        float f16 = fAbs2 * fAbs2;
        float f17 = fAbs * fAbs * f13 * f13;
        if ((((f16 * fAbs) * fAbs) - ((f16 * f15) * f15)) - f17 < 0.0f) {
            float fSqrt = (float) Math.sqrt(1.0f - (r1 / r5));
            fAbs2 *= fSqrt;
            fAbs *= fSqrt;
            f7 = f11 / 2.0f;
            f8 = f12 / 2.0f;
        } else {
            float fSqrt2 = (float) Math.sqrt(r1 / (r9 + f17));
            if (z2 == z3) {
                fSqrt2 = -fSqrt2;
            }
            float f18 = (((-fSqrt2) * f15) * fAbs2) / fAbs;
            float f19 = ((fSqrt2 * f13) * fAbs) / fAbs2;
            f7 = ((fCos * f18) - (fSin * f19)) + (f11 / 2.0f);
            f8 = (f12 / 2.0f) + (f18 * fSin) + (f19 * fCos);
        }
        float f20 = fCos / fAbs2;
        float f21 = fSin / fAbs2;
        float f22 = f14 / fAbs;
        float f23 = fCos / fAbs;
        float f24 = -f7;
        float f25 = -f8;
        float fAtan2 = (float) Math.atan2((f22 * f24) + (f23 * f25), (f24 * f20) + (f25 * f21));
        float f26 = f11 - f7;
        float f27 = f12 - f8;
        float fAtan22 = (float) Math.atan2((f22 * f26) + (f23 * f27), (f20 * f26) + (f21 * f27));
        float f28 = f7 + f9;
        float f29 = f8 + f10;
        float f30 = f11 + f9;
        float f31 = f12 + f10;
        setPenDown();
        mPivotX = f30;
        mPenX = f30;
        mPivotY = f31;
        mPenY = f31;
        if (fAbs2 != fAbs || radians != 0.0f) {
            arcToBezier(f28, f29, fAbs2, fAbs, fAtan2, fAtan22, z3, radians);
            return;
        }
        float degrees = (float) Math.toDegrees(fAtan2);
        float fAbs3 = Math.abs((degrees - ((float) Math.toDegrees(fAtan22))) % 360.0f);
        if (!z2 ? fAbs3 > 180.0f : fAbs3 < 180.0f) {
            fAbs3 = 360.0f - fAbs3;
        }
        if (!z3) {
            fAbs3 = -fAbs3;
        }
        float f32 = mScale;
        mPath.arcTo(new RectF((f28 - fAbs2) * f32, (f29 - fAbs2) * f32, (f28 + fAbs2) * f32, (f29 + fAbs2) * f32), degrees, fAbs3);
        elements.add(new PathElement(ElementType.kCGPathElementAddCurveToPoint, new Point[]{new Point(f30, f31)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006c A[LOOP:0: B:8:0x0068->B:10:0x006c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void arcToBezier(float r31, float r32, float r33, float r34, float r35, float r36, boolean r37, float r38) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.PathParser.arcToBezier(float, float, float, float, float, float, boolean, float):void");
    }

    private static void close() {
        if (mPenDown) {
            mPenX = mPenDownX;
            mPenY = mPenDownY;
            mPenDown = false;
            mPath.close();
            elements.add(new PathElement(ElementType.kCGPathElementCloseSubpath, new Point[]{new Point(mPenX, mPenY)}));
        }
    }

    private static void cubicTo(float f2, float f3, float f4, float f5, float f6, float f7) {
        setPenDown();
        mPenX = f6;
        mPenY = f7;
        Path path = mPath;
        float f8 = mScale;
        path.cubicTo(f2 * f8, f3 * f8, f4 * f8, f5 * f8, f6 * f8, f7 * f8);
        elements.add(new PathElement(ElementType.kCGPathElementAddCurveToPoint, new Point[]{new Point(f2, f3), new Point(f4, f5), new Point(f6, f7)}));
    }

    private static void curve(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = mPenX;
        float f9 = mPenY;
        curveTo(f2 + f8, f3 + f9, f4 + f8, f5 + f9, f6 + f8, f7 + f9);
    }

    private static void curveTo(float f2, float f3, float f4, float f5, float f6, float f7) {
        mPivotX = f4;
        mPivotY = f5;
        cubicTo(f2, f3, f4, f5, f6, f7);
    }

    private static boolean is_absolute(char c2) {
        return Character.isUpperCase(c2);
    }

    private static boolean is_cmd(char c2) {
        switch (c2) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case 'M':
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    private static boolean is_number_start(char c2) {
        return (c2 >= '0' && c2 <= '9') || c2 == '.' || c2 == '-' || c2 == '+';
    }

    private static void line(float f2, float f3) {
        lineTo(f2 + mPenX, f3 + mPenY);
    }

    private static void lineTo(float f2, float f3) {
        setPenDown();
        mPenX = f2;
        mPivotX = f2;
        mPenY = f3;
        mPivotY = f3;
        Path path = mPath;
        float f4 = mScale;
        path.lineTo(f2 * f4, f4 * f3);
        elements.add(new PathElement(ElementType.kCGPathElementAddLineToPoint, new Point[]{new Point(f2, f3)}));
    }

    private static void move(float f2, float f3) {
        moveTo(f2 + mPenX, f3 + mPenY);
    }

    private static void moveTo(float f2, float f3) {
        mPenX = f2;
        mPivotX = f2;
        mPenDownX = f2;
        mPenY = f3;
        mPivotY = f3;
        mPenDownY = f3;
        Path path = mPath;
        float f4 = mScale;
        path.moveTo(f2 * f4, f4 * f3);
        elements.add(new PathElement(ElementType.kCGPathElementMoveToPoint, new Point[]{new Point(f2, f3)}));
    }

    static Path parse(String str) {
        elements = new ArrayList<>();
        Path path = new Path();
        mPath = path;
        if (str == null) {
            return path;
        }
        f3545l = str.length();
        f3546s = str;
        f3544i = 0;
        mPenX = 0.0f;
        mPenY = 0.0f;
        mPivotX = 0.0f;
        mPivotY = 0.0f;
        mPenDownX = 0.0f;
        mPenDownY = 0.0f;
        mPenDown = false;
        char c2 = ' ';
        while (f3544i < f3545l) {
            skip_spaces();
            int i2 = f3544i;
            if (i2 >= f3545l) {
                return mPath;
            }
            boolean z2 = true;
            boolean z3 = c2 != ' ';
            char cCharAt = f3546s.charAt(i2);
            if (!z3 && cCharAt != 'M' && cCharAt != 'm') {
                throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f3544i), f3546s));
            }
            if (is_cmd(cCharAt)) {
                f3544i++;
                z2 = false;
                c2 = cCharAt;
            } else {
                if (!is_number_start(cCharAt) || !z3) {
                    throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f3544i), f3546s));
                }
                if (c2 == 'Z' || c2 == 'z') {
                    throw new IllegalArgumentException(String.format("Unexpected number after 'z' (s=%s)", f3546s));
                }
                if (c2 == 'M' || c2 == 'm') {
                    c2 = is_absolute(c2) ? 'L' : 'l';
                } else {
                    z2 = false;
                }
            }
            boolean zIs_absolute = is_absolute(c2);
            switch (c2) {
                case 'A':
                    arcTo(parse_list_number(), parse_list_number(), parse_list_number(), parse_flag(), parse_flag(), parse_list_number(), parse_list_number());
                    break;
                case 'C':
                    curveTo(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                    break;
                case 'H':
                    lineTo(parse_list_number(), mPenY);
                    break;
                case 'L':
                    lineTo(parse_list_number(), parse_list_number());
                    break;
                case 'M':
                    moveTo(parse_list_number(), parse_list_number());
                    break;
                case 'Q':
                    quadraticBezierCurveTo(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                    break;
                case 'S':
                    smoothCurveTo(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                    break;
                case 'T':
                    smoothQuadraticBezierCurveTo(parse_list_number(), parse_list_number());
                    break;
                case 'V':
                    lineTo(mPenX, parse_list_number());
                    break;
                case 'Z':
                case 'z':
                    close();
                    break;
                case 'a':
                    arc(parse_list_number(), parse_list_number(), parse_list_number(), parse_flag(), parse_flag(), parse_list_number(), parse_list_number());
                    break;
                case 'c':
                    curve(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                    break;
                case 'h':
                    line(parse_list_number(), 0.0f);
                    break;
                case 'l':
                    line(parse_list_number(), parse_list_number());
                    break;
                case 'm':
                    move(parse_list_number(), parse_list_number());
                    break;
                case 'q':
                    quadraticBezierCurve(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                    break;
                case 's':
                    smoothCurve(parse_list_number(), parse_list_number(), parse_list_number(), parse_list_number());
                    break;
                case 't':
                    smoothQuadraticBezierCurve(parse_list_number(), parse_list_number());
                    break;
                case 'v':
                    line(0.0f, parse_list_number());
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Unexpected comand '%c' (s=%s)", Character.valueOf(c2), f3546s));
            }
            if (z2) {
                c2 = zIs_absolute ? 'M' : 'm';
            }
        }
        return mPath;
    }

    private static boolean parse_flag() throws Throwable {
        skip_spaces();
        char cCharAt = f3546s.charAt(f3544i);
        if (cCharAt == '0' || cCharAt == '1') {
            int i2 = f3544i + 1;
            f3544i = i2;
            if (i2 < f3545l && f3546s.charAt(i2) == ',') {
                f3544i++;
            }
            skip_spaces();
            return cCharAt == '1';
        }
        Object[] objArr = {Character.valueOf(cCharAt), Integer.valueOf(f3544i), f3546s};
        short sXd = (short) (C1607wl.Xd() ^ 28387);
        int[] iArr = new int["\u000b%\u001d1* \u001f1##_'.$+dlk+oir5\nr3{pE\u0010xH~".length()];
        QB qb = new QB("\u000b%\u001d1* \u001f1##_'.$+dlk+oir5\nr3{pE\u0010xH~");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
            i3++;
        }
        Object[] objArr2 = {String.format(new String(iArr, 0, i3), objArr)};
        Constructor<?> constructor = Class.forName(Wg.vd("<2J4{91=A\u0007!MHDJ", (short) (C1499aX.Xd() ^ (-24234)))).getConstructor(Class.forName(Qg.kd("QG[E\u0011NBNF\f0PMCG?", (short) (OY.Xd() ^ 12231), (short) (OY.Xd() ^ 23888))));
        try {
            constructor.setAccessible(true);
            throw ((Error) constructor.newInstance(objArr2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static float parse_list_number() throws Throwable {
        if (f3544i != f3545l) {
            float f2 = parse_number();
            skip_spaces();
            parse_list_separator();
            return f2;
        }
        String str = String.format(hg.Vd("\u001b3);2&#3#![ (\u001dW^)qX&Z", (short) (C1633zX.Xd() ^ (-17178)), (short) (C1633zX.Xd() ^ (-15418))), f3546s);
        short sXd = (short) (C1580rY.Xd() ^ (-27872));
        int[] iArr = new int["6,@*u3'3+p\u000732.0".length()];
        QB qb = new QB("6,@*u3'3+p\u000732.0");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {str};
        Constructor<?> constructor = Class.forName(new String(iArr, 0, i2)).getConstructor(Class.forName(C1561oA.yd("QI[G\u0019XJXF\u000e0RUMOI", (short) (FB.Xd() ^ 18729))));
        try {
            constructor.setAccessible(true);
            throw ((Error) constructor.newInstance(objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static void parse_list_separator() {
        int i2 = f3544i;
        if (i2 >= f3545l || f3546s.charAt(i2) != ',') {
            return;
        }
        f3544i++;
    }

    private static float parse_number() throws Throwable {
        char cCharAt;
        skip_spaces();
        int i2 = f3544i;
        if (i2 == f3545l) {
            Object[] objArr = {String.format(Jg.Wd("\u000e\u001ax\fseO\\A=b(!\u0016;?^$tAf", (short) (C1633zX.Xd() ^ (-9863)), (short) (C1633zX.Xd() ^ (-21958))), f3546s)};
            Constructor<?> constructor = Class.forName(ZO.xd("3\u0011LuF\u001az:q.!d\flE", (short) (C1580rY.Xd() ^ (-7854)), (short) (C1580rY.Xd() ^ (-14287)))).getConstructor(Class.forName(C1626yg.Ud("^\u000bMMu\u0001x+\u0004E\u0010(\u0015\u0010\u000fZ", (short) (ZN.Xd() ^ 2019), (short) (ZN.Xd() ^ 25144))));
            try {
                constructor.setAccessible(true);
                throw ((Error) constructor.newInstance(objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        char cCharAt2 = f3546s.charAt(i2);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            int i3 = f3544i + 1;
            f3544i = i3;
            cCharAt2 = f3546s.charAt(i3);
        }
        String strYd = C1561oA.Yd("Jpyeqok(w\u007fxnr\u0001/v\u0001\u0005\u0001u\n\u007f\u0006\u007f9}\u0004}\u0010\u007f\u0003\u0015\u0007\u0015CKJ\nNHQ\u0014hQ\u0012ZO$nW']", (short) (ZN.Xd() ^ 22901));
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            skip_digits();
            int i4 = f3544i;
            if (i4 < f3545l) {
                cCharAt2 = f3546s.charAt(i4);
            }
        } else if (cCharAt2 != '.') {
            throw new IllegalArgumentException(String.format(strYd, Character.valueOf(cCharAt2), Integer.valueOf(f3544i), f3546s));
        }
        if (cCharAt2 == '.') {
            f3544i++;
            skip_digits();
            int i5 = f3544i;
            if (i5 < f3545l) {
                cCharAt2 = f3546s.charAt(i5);
            }
        }
        if (cCharAt2 == 'e' || cCharAt2 == 'E') {
            int i6 = f3544i;
            if (i6 + 1 < f3545l && (cCharAt = f3546s.charAt(i6 + 1)) != 'm' && cCharAt != 'x') {
                int i7 = f3544i + 1;
                f3544i = i7;
                char cCharAt3 = f3546s.charAt(i7);
                if (cCharAt3 == '+' || cCharAt3 == '-') {
                    f3544i++;
                    skip_digits();
                } else {
                    if (cCharAt3 < '0' || cCharAt3 > '9') {
                        throw new IllegalArgumentException(String.format(strYd, Character.valueOf(cCharAt3), Integer.valueOf(f3544i), f3546s));
                    }
                    skip_digits();
                }
            }
        }
        String strSubstring = f3546s.substring(i2, f3544i);
        float f2 = Float.parseFloat(strSubstring);
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            throw new IllegalArgumentException(String.format(Xg.qd("\u001fEN:FD@|LTMCGU\u0004\f\u000bZ\u000f\t\u0012^`N`c-\u0016V\u001f\u0014^3\u001c\\%\u001an9\"q(", (short) (C1607wl.Xd() ^ 30727), (short) (C1607wl.Xd() ^ 31572)), strSubstring, Integer.valueOf(i2), Integer.valueOf(f3544i), f3546s));
        }
        return f2;
    }

    private static void quadraticBezierCurve(float f2, float f3, float f4, float f5) {
        float f6 = mPenX;
        float f7 = mPenY;
        quadraticBezierCurveTo(f2 + f6, f3 + f7, f4 + f6, f5 + f7);
    }

    private static void quadraticBezierCurveTo(float f2, float f3, float f4, float f5) {
        mPivotX = f2;
        mPivotY = f3;
        float f6 = f2 * 2.0f;
        float f7 = f3 * 2.0f;
        cubicTo((mPenX + f6) / 3.0f, (mPenY + f7) / 3.0f, (f4 + f6) / 3.0f, (f5 + f7) / 3.0f, f4, f5);
    }

    private static double round(double d2) {
        return Math.round(d2 * r4) / Math.pow(10.0d, 4.0d);
    }

    private static void setPenDown() {
        if (mPenDown) {
            return;
        }
        mPenDownX = mPenX;
        mPenDownY = mPenY;
        mPenDown = true;
    }

    private static void skip_digits() {
        while (true) {
            int i2 = f3544i;
            if (i2 >= f3545l || !Character.isDigit(f3546s.charAt(i2))) {
                return;
            } else {
                f3544i++;
            }
        }
    }

    private static void skip_spaces() {
        while (true) {
            int i2 = f3544i;
            if (i2 >= f3545l || !Character.isWhitespace(f3546s.charAt(i2))) {
                return;
            } else {
                f3544i++;
            }
        }
    }

    private static void smoothCurve(float f2, float f3, float f4, float f5) {
        float f6 = mPenX;
        float f7 = mPenY;
        smoothCurveTo(f2 + f6, f3 + f7, f4 + f6, f5 + f7);
    }

    private static void smoothCurveTo(float f2, float f3, float f4, float f5) {
        float f6 = (mPenX * 2.0f) - mPivotX;
        float f7 = (mPenY * 2.0f) - mPivotY;
        mPivotX = f2;
        mPivotY = f3;
        cubicTo(f6, f7, f2, f3, f4, f5);
    }

    private static void smoothQuadraticBezierCurve(float f2, float f3) {
        smoothQuadraticBezierCurveTo(f2 + mPenX, f3 + mPenY);
    }

    private static void smoothQuadraticBezierCurveTo(float f2, float f3) {
        quadraticBezierCurveTo((mPenX * 2.0f) - mPivotX, (mPenY * 2.0f) - mPivotY, f2, f3);
    }
}
