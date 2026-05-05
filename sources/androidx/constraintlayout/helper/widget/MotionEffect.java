package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.widget.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
public class MotionEffect extends MotionHelper {
    public static final int AUTO = -1;
    public static final int EAST = 2;
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final String TAG = "FadeMove";
    private static final int UNSET = -1;
    public static final int WEST = 3;
    private int fadeMove;
    private float motionEffectAlpha;
    private int motionEffectEnd;
    private int motionEffectStart;
    private boolean motionEffectStrictMove;
    private int motionEffectTranslationX;
    private int motionEffectTranslationY;
    private int viewTransitionId;

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isDecorator() {
        return true;
    }

    public MotionEffect(Context context) {
        super(context);
        this.motionEffectAlpha = 0.1f;
        this.motionEffectStart = 49;
        this.motionEffectEnd = 50;
        this.motionEffectTranslationX = 0;
        this.motionEffectTranslationY = 0;
        this.motionEffectStrictMove = true;
        this.viewTransitionId = -1;
        this.fadeMove = -1;
    }

    public MotionEffect(Context context, AttributeSet attrs) throws Throwable {
        super(context, attrs);
        this.motionEffectAlpha = 0.1f;
        this.motionEffectStart = 49;
        this.motionEffectEnd = 50;
        this.motionEffectTranslationX = 0;
        this.motionEffectTranslationY = 0;
        this.motionEffectStrictMove = true;
        this.viewTransitionId = -1;
        this.fadeMove = -1;
        init(context, attrs);
    }

    public MotionEffect(Context context, AttributeSet attrs, int defStyleAttr) throws Throwable {
        super(context, attrs, defStyleAttr);
        this.motionEffectAlpha = 0.1f;
        this.motionEffectStart = 49;
        this.motionEffectEnd = 50;
        this.motionEffectTranslationX = 0;
        this.motionEffectTranslationY = 0;
        this.motionEffectStrictMove = true;
        this.viewTransitionId = -1;
        this.fadeMove = -1;
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) throws Throwable {
        if (attrs != null) {
            int[] iArr = R.styleable.MotionEffect;
            Class<?> cls = Class.forName(C1561oA.od("~\u000b\u007f\r\t\u0002{Dx\u0004\u0002\u0007v~\u0004<P{y~n\u0001{", (short) (FB.Xd() ^ 352)));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (FB.Xd() ^ 26733);
            int[] iArr2 = new int[";I@OMHD\u000fWWMQ\u0014(\\]\\TNbbTCVf".length()];
            QB qb = new QB(";I@OMHD\u000fWWMQ\u0014(\\]\\TNbbTCVf");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr2[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i2));
            clsArr[1] = int[].class;
            Object[] objArr = {attrs, iArr};
            Method method = cls.getMethod(Wg.Zd("Z4Lp{f\u0014'rML~[D8=jWa&\u000fO", (short) (C1633zX.Xd() ^ (-2445)), (short) (C1633zX.Xd() ^ (-16923))), clsArr);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                int indexCount = typedArray.getIndexCount();
                for (int i3 = 0; i3 < indexCount; i3++) {
                    int index = typedArray.getIndex(i3);
                    if (index == R.styleable.MotionEffect_motionEffect_start) {
                        int i4 = typedArray.getInt(index, this.motionEffectStart);
                        this.motionEffectStart = i4;
                        this.motionEffectStart = Math.max(Math.min(i4, 99), 0);
                    } else if (index == R.styleable.MotionEffect_motionEffect_end) {
                        int i5 = typedArray.getInt(index, this.motionEffectEnd);
                        this.motionEffectEnd = i5;
                        this.motionEffectEnd = Math.max(Math.min(i5, 99), 0);
                    } else if (index == R.styleable.MotionEffect_motionEffect_translationX) {
                        this.motionEffectTranslationX = typedArray.getDimensionPixelOffset(index, this.motionEffectTranslationX);
                    } else if (index == R.styleable.MotionEffect_motionEffect_translationY) {
                        this.motionEffectTranslationY = typedArray.getDimensionPixelOffset(index, this.motionEffectTranslationY);
                    } else if (index == R.styleable.MotionEffect_motionEffect_alpha) {
                        this.motionEffectAlpha = typedArray.getFloat(index, this.motionEffectAlpha);
                    } else if (index == R.styleable.MotionEffect_motionEffect_move) {
                        this.fadeMove = typedArray.getInt(index, this.fadeMove);
                    } else if (index == R.styleable.MotionEffect_motionEffect_strict) {
                        this.motionEffectStrictMove = typedArray.getBoolean(index, this.motionEffectStrictMove);
                    } else if (index == R.styleable.MotionEffect_motionEffect_viewTransition) {
                        this.viewTransitionId = typedArray.getResourceId(index, this.viewTransitionId);
                    }
                }
                int i6 = this.motionEffectStart;
                int i7 = this.motionEffectEnd;
                if (i6 == i7) {
                    if (i6 > 0) {
                        this.motionEffectStart = i6 - 1;
                    } else {
                        this.motionEffectEnd = i7 + 1;
                    }
                }
                typedArray.recycle();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0189, code lost:
    
        if (r16 == 0.0f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019a, code lost:
    
        if (r16 == 0.0f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01aa, code lost:
    
        if (r15 == 0.0f) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e4  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout r20, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r21) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }
}
