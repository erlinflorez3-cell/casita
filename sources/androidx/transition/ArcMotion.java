package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.core.content.res.TypedArrayUtils;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public class ArcMotion extends PathMotion {
    private static final float DEFAULT_MAX_ANGLE_DEGREES = 70.0f;
    private static final float DEFAULT_MAX_TANGENT = (float) Math.tan(Math.toRadians(35.0d));
    private static final float DEFAULT_MIN_ANGLE_DEGREES = 0.0f;
    private float mMaximumAngle;
    private float mMaximumTangent;
    private float mMinimumHorizontalAngle;
    private float mMinimumHorizontalTangent;
    private float mMinimumVerticalAngle;
    private float mMinimumVerticalTangent;

    public ArcMotion() {
        this.mMinimumHorizontalAngle = 0.0f;
        this.mMinimumVerticalAngle = 0.0f;
        this.mMaximumAngle = DEFAULT_MAX_ANGLE_DEGREES;
        this.mMinimumHorizontalTangent = 0.0f;
        this.mMinimumVerticalTangent = 0.0f;
        this.mMaximumTangent = DEFAULT_MAX_TANGENT;
    }

    public ArcMotion(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.mMinimumHorizontalAngle = 0.0f;
        this.mMinimumVerticalAngle = 0.0f;
        this.mMaximumAngle = DEFAULT_MAX_ANGLE_DEGREES;
        this.mMinimumHorizontalTangent = 0.0f;
        this.mMinimumVerticalTangent = 0.0f;
        this.mMaximumTangent = DEFAULT_MAX_TANGENT;
        Object[] objArr = {attributeSet, Styleable.ARC_MOTION};
        Method method = Class.forName(C1561oA.yd("4B9H>95\u007f>KKR<FM\b&SSZDXU", (short) (C1633zX.Xd() ^ (-17201)))).getMethod(Xg.qd("'\u001b.\u001c%+\u001139-''\u00059:91+??1@", (short) (C1580rY.Xd() ^ (-2854)), (short) (C1580rY.Xd() ^ (-18309))), Class.forName(C1561oA.Yd("IWN][VR\u001dee[_\"6jkjb\\ppbQdt", (short) (C1633zX.Xd() ^ (-15729)))), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
            setMinimumVerticalAngle(TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, Jg.Wd("|<r/\u0017P\fH\tg;s1\u0011OUt\u001fI\u0014", (short) (C1499aX.Xd() ^ (-23685)), (short) (C1499aX.Xd() ^ (-13690))), 1, 0.0f));
            setMinimumHorizontalAngle(TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, ZO.xd("f\u0012<bHx\u007f6*ewg+\u0010\u001e\u001b1T?F\u0012]", (short) (C1607wl.Xd() ^ 7558), (short) (C1607wl.Xd() ^ OlympusMakernoteDirectory.TAG_OLYMPUS_IMAGE_WIDTH)), 0, 0.0f));
            short sXd = (short) (Od.Xd() ^ (-8803));
            short sXd2 = (short) (Od.Xd() ^ (-19774));
            int[] iArr = new int["4zX\u0005k6\rw^d*\u0016".length()];
            QB qb = new QB("4zX\u0005k6\rw^d*\u0016");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            setMaximumAngle(TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, new String(iArr, 0, i2), 2, DEFAULT_MAX_ANGLE_DEGREES));
            typedArray.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setMinimumHorizontalAngle(float f2) {
        this.mMinimumHorizontalAngle = f2;
        this.mMinimumHorizontalTangent = toTangent(f2);
    }

    public float getMinimumHorizontalAngle() {
        return this.mMinimumHorizontalAngle;
    }

    public void setMinimumVerticalAngle(float f2) {
        this.mMinimumVerticalAngle = f2;
        this.mMinimumVerticalTangent = toTangent(f2);
    }

    public float getMinimumVerticalAngle() {
        return this.mMinimumVerticalAngle;
    }

    public void setMaximumAngle(float f2) {
        this.mMaximumAngle = f2;
        this.mMaximumTangent = toTangent(f2);
    }

    public float getMaximumAngle() {
        return this.mMaximumAngle;
    }

    private static float toTangent(float f2) {
        if (f2 < 0.0f || f2 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f2 / 2.0f));
    }

    @Override // androidx.transition.PathMotion
    public Path getPath(float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        Path path = new Path();
        path.moveTo(f2, f3);
        float f9 = f4 - f2;
        float f10 = f5 - f3;
        float f11 = (f9 * f9) + (f10 * f10);
        float f12 = (f2 + f4) / 2.0f;
        float f13 = (f3 + f5) / 2.0f;
        float f14 = 0.25f * f11;
        boolean z2 = f3 > f5;
        if (Math.abs(f9) < Math.abs(f10)) {
            float fAbs = Math.abs(f11 / (f10 * 2.0f));
            if (z2) {
                f7 = fAbs + f5;
                f6 = f4;
            } else {
                f7 = fAbs + f3;
                f6 = f2;
            }
            f8 = this.mMinimumVerticalTangent;
        } else {
            float f15 = f11 / (f9 * 2.0f);
            if (z2) {
                f6 = f15 + f2;
                f7 = f3;
            } else {
                f6 = f4 - f15;
                f7 = f5;
            }
            f8 = this.mMinimumHorizontalTangent;
        }
        float f16 = f14 * f8 * f8;
        float f17 = f12 - f6;
        float f18 = f13 - f7;
        float f19 = (f17 * f17) + (f18 * f18);
        float f20 = this.mMaximumTangent;
        float f21 = f14 * f20 * f20;
        if (f19 >= f16) {
            f16 = f19 > f21 ? f21 : 0.0f;
        }
        if (f16 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f16 / f19);
            f6 = ((f6 - f12) * fSqrt) + f12;
            f7 = f13 + (fSqrt * (f7 - f13));
        }
        path.cubicTo((f2 + f6) / 2.0f, (f3 + f7) / 2.0f, (f6 + f4) / 2.0f, (f7 + f5) / 2.0f, f4, f5);
        return path;
    }
}
