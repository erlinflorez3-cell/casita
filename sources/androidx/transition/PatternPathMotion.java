package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Xg;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class PatternPathMotion extends PathMotion {
    private Path mOriginalPatternPath;
    private final Path mPatternPath;
    private final Matrix mTempMatrix;

    public PatternPathMotion() {
        Path path = new Path();
        this.mPatternPath = path;
        this.mTempMatrix = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.mOriginalPatternPath = path;
    }

    public PatternPathMotion(Context context, AttributeSet attributeSet) throws Throwable {
        this.mPatternPath = new Path();
        this.mTempMatrix = new Matrix();
        Object[] objArr = {attributeSet, Styleable.PATTERN_PATH_MOTION};
        Method method = Class.forName(hg.Vd("\u0019%\u001a'#\u001c\u0016^\u0013\u001e\u001c!\u0011\u0019\u001eVj\u0016\u0014\u0019\t\u001b\u0016", (short) (C1633zX.Xd() ^ (-15740)), (short) (C1633zX.Xd() ^ (-3676)))).getMethod(C1561oA.yd(";-B.15\u001d=M?;9\u0011CFC%\u001d31\u001d*", (short) (C1607wl.Xd() ^ 31151)), Class.forName(C1561oA.ud("\r\u0019\u000e\u001b\u0017\u0010\nR\u0019\u0017\u000b\rM_\u0012\u0011\u000e\u0004{\u000e\f{hy\b", (short) (C1499aX.Xd() ^ (-14859)))), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            try {
                String namedString = TypedArrayUtils.getNamedString(typedArray, (XmlPullParser) attributeSet, C1561oA.Yd("gYmn`nkN`tiFdxf", (short) (C1580rY.Xd() ^ (-20975))), 0);
                if (namedString == null) {
                    throw new RuntimeException(Xg.qd("\u0017\t\u001d\u0012n\r!\u000fN\u001d&%'S\u0017\u001bV+.*+(&##_'15c5';<.<9\u001c.B7\u001d@F<CC", (short) (FB.Xd() ^ 21947), (short) (FB.Xd() ^ 23772)));
                }
                setPatternPath(PathParser.createPathFromPathData(namedString));
            } finally {
                typedArray.recycle();
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public PatternPathMotion(Path path) {
        this.mPatternPath = new Path();
        this.mTempMatrix = new Matrix();
        setPatternPath(path);
    }

    public Path getPatternPath() {
        return this.mOriginalPatternPath;
    }

    public void setPatternPath(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f2 = fArr[0];
        float f3 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f4 = fArr[0];
        float f5 = fArr[1];
        if (f4 == f2 && f5 == f3) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.mTempMatrix.setTranslate(-f4, -f5);
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        float fDistance = 1.0f / distance(f6, f7);
        this.mTempMatrix.postScale(fDistance, fDistance);
        this.mTempMatrix.postRotate((float) Math.toDegrees(-Math.atan2(f7, f6)));
        path.transform(this.mTempMatrix, this.mPatternPath);
        this.mOriginalPatternPath = path;
    }

    @Override // androidx.transition.PathMotion
    public Path getPath(float f2, float f3, float f4, float f5) {
        float f6 = f4 - f2;
        float f7 = f5 - f3;
        float fDistance = distance(f6, f7);
        double dAtan2 = Math.atan2(f7, f6);
        this.mTempMatrix.setScale(fDistance, fDistance);
        this.mTempMatrix.postRotate((float) Math.toDegrees(dAtan2));
        this.mTempMatrix.postTranslate(f2, f3);
        Path path = new Path();
        this.mPatternPath.transform(this.mTempMatrix, path);
        return path;
    }

    private static float distance(float f2, float f3) {
        return (float) Math.sqrt((f2 * f2) + (f3 * f3));
    }
}
