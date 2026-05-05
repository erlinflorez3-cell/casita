package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import com.dynatrace.android.agent.Global;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class KeyTrigger extends Key {
    public static final String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    static final String NAME = "KeyTrigger";
    public static final String NEGATIVE_CROSS = "negativeCross";
    public static final String POSITIVE_CROSS = "positiveCross";
    public static final String POST_LAYOUT = "postLayout";
    private static final String TAG = "KeyTrigger";
    public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final String TRIGGER_ID = "triggerID";
    public static final String TRIGGER_RECEIVER = "triggerReceiver";
    public static final String TRIGGER_SLACK = "triggerSlack";
    public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
    private float mFireLastPos;
    private int mCurveFit = -1;
    private String mCross = null;
    private int mTriggerReceiver = UNSET;
    private String mNegativeCross = null;
    private String mPositiveCross = null;
    private int mTriggerID = UNSET;
    private int mTriggerCollisionId = UNSET;
    private View mTriggerCollisionView = null;
    float mTriggerSlack = 0.1f;
    private boolean mFireCrossReset = true;
    private boolean mFireNegativeReset = true;
    private boolean mFirePositiveReset = true;
    private float mFireThreshold = Float.NaN;
    private boolean mPostLayout = false;
    int mViewTransitionOnNegativeCross = UNSET;
    int mViewTransitionOnPositiveCross = UNSET;
    int mViewTransitionOnCross = UNSET;
    RectF mCollisionRect = new RectF();
    RectF mTargetRect = new RectF();
    HashMap<String, Method> mMethodHashMap = new HashMap<>();

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> splines) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> attributes) {
    }

    public KeyTrigger() {
        this.mType = 5;
        this.mCustomConstraints = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attrs) throws Throwable {
        int[] iArr = R.styleable.KeyTrigger;
        Class<?> cls = Class.forName(hg.Vd("CODQMF@\t=HFK;CH\u0001\u0015@>C3E@", (short) (C1607wl.Xd() ^ 17912), (short) (C1607wl.Xd() ^ 14626)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (ZN.Xd() ^ 15150);
        int[] iArr2 = new int["w\u0004x\u0006\u0002zt=\u0004\u0002uw8J|{xnfxvfSdr".length()];
        QB qb = new QB("w\u0004x\u0006\u0002zt=\u0004\u0002uw8J|{xnfxvfSdr");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i2));
        clsArr[1] = int[].class;
        Object[] objArr = {attrs, iArr};
        Method method = cls.getMethod(C1561oA.yd("F:M;DJ0RH<66\u0014HIHPJ^^P_", (short) (C1580rY.Xd() ^ (-13079))), clsArr);
        try {
            method.setAccessible(true);
            Loader.read(this, (TypedArray) method.invoke(context, objArr), context);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    int getCurveFit() {
        return this.mCurveFit;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String tag, Object value) {
        tag.hashCode();
        byte b2 = -1;
        switch (tag.hashCode()) {
            case -1594793529:
                if (tag.equals("positiveCross")) {
                    b2 = 0;
                }
                break;
            case -966421266:
                if (tag.equals("viewTransitionOnPositiveCross")) {
                    b2 = 1;
                }
                break;
            case -786670827:
                if (tag.equals("triggerCollisionId")) {
                    b2 = 2;
                }
                break;
            case -648752941:
                if (tag.equals("triggerID")) {
                    b2 = 3;
                }
                break;
            case -638126837:
                if (tag.equals("negativeCross")) {
                    b2 = 4;
                }
                break;
            case -76025313:
                if (tag.equals("triggerCollisionView")) {
                    b2 = 5;
                }
                break;
            case -9754574:
                if (tag.equals("viewTransitionOnNegativeCross")) {
                    b2 = 6;
                }
                break;
            case 64397344:
                if (tag.equals("CROSS")) {
                    b2 = 7;
                }
                break;
            case 364489912:
                if (tag.equals("triggerSlack")) {
                    b2 = 8;
                }
                break;
            case 1301930599:
                if (tag.equals("viewTransitionOnCross")) {
                    b2 = 9;
                }
                break;
            case 1401391082:
                if (tag.equals("postLayout")) {
                    b2 = 10;
                }
                break;
            case 1535404999:
                if (tag.equals("triggerReceiver")) {
                    b2 = Ascii.VT;
                }
                break;
        }
        switch (b2) {
            case 0:
                this.mPositiveCross = value.toString();
                break;
            case 1:
                this.mViewTransitionOnPositiveCross = toInt(value);
                break;
            case 2:
                this.mTriggerCollisionId = toInt(value);
                break;
            case 3:
                this.mTriggerID = toInt(value);
                break;
            case 4:
                this.mNegativeCross = value.toString();
                break;
            case 5:
                this.mTriggerCollisionView = (View) value;
                break;
            case 6:
                this.mViewTransitionOnNegativeCross = toInt(value);
                break;
            case 7:
                this.mCross = value.toString();
                break;
            case 8:
                this.mTriggerSlack = toFloat(value);
                break;
            case 9:
                this.mViewTransitionOnCross = toInt(value);
                break;
            case 10:
                this.mPostLayout = toBoolean(value);
                break;
            case 11:
                this.mTriggerReceiver = toInt(value);
                break;
        }
    }

    private void setUpRect(RectF rect, View child, boolean postLayout) {
        rect.top = child.getTop();
        rect.bottom = child.getBottom();
        rect.left = child.getLeft();
        rect.right = child.getRight();
        if (postLayout) {
            child.getMatrix().mapRect(rect);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void conditionallyFire(float r9, android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyTrigger.conditionallyFire(float, android.view.View):void");
    }

    private void fire(String str, View call) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            fireCustom(str, call);
            return;
        }
        if (this.mMethodHashMap.containsKey(str)) {
            method = this.mMethodHashMap.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = call.getClass().getMethod(str, new Class[0]);
                this.mMethodHashMap.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.mMethodHashMap.put(str, null);
                String str2 = "Could not find method \"" + str + "\"on class " + call.getClass().getSimpleName() + Global.BLANK + Debug.getName(call);
                return;
            }
        }
        try {
            method.invoke(call, new Object[0]);
        } catch (Exception unused2) {
            String str3 = "Exception in call \"" + this.mCross + "\"on class " + call.getClass().getSimpleName() + Global.BLANK + Debug.getName(call);
        }
    }

    private void fireCustom(String str, View view) {
        boolean z2 = str.length() == 1;
        if (!z2) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.mCustomConstraints.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z2 || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str2);
                if (constraintAttribute != null) {
                    constraintAttribute.applyCustom(view);
                }
            }
        }
    }

    private static class Loader {
        private static final int COLLISION = 9;
        private static final int CROSS = 4;
        private static final int FRAME_POS = 8;
        private static final int NEGATIVE_CROSS = 1;
        private static final int POSITIVE_CROSS = 2;
        private static final int POST_LAYOUT = 10;
        private static final int TARGET_ID = 7;
        private static final int TRIGGER_ID = 6;
        private static final int TRIGGER_RECEIVER = 11;
        private static final int TRIGGER_SLACK = 5;
        private static final int VT_CROSS = 12;
        private static final int VT_NEGATIVE_CROSS = 13;
        private static final int VT_POSITIVE_CROSS = 14;
        private static SparseIntArray mAttrMap = null;

        private Loader() {
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTrigger_framePosition, 8);
            mAttrMap.append(R.styleable.KeyTrigger_onCross, 4);
            mAttrMap.append(R.styleable.KeyTrigger_onNegativeCross, 1);
            mAttrMap.append(R.styleable.KeyTrigger_onPositiveCross, 2);
            mAttrMap.append(R.styleable.KeyTrigger_motionTarget, 7);
            mAttrMap.append(R.styleable.KeyTrigger_triggerId, 6);
            mAttrMap.append(R.styleable.KeyTrigger_triggerSlack, 5);
            mAttrMap.append(R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            mAttrMap.append(R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            mAttrMap.append(R.styleable.KeyTrigger_triggerReceiver, 11);
            mAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnCross, 12);
            mAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
            mAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        public static void read(KeyTrigger c2, TypedArray a2, Context context) {
            int indexCount = a2.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = a2.getIndex(i2);
                switch (mAttrMap.get(index)) {
                    case 1:
                        c2.mNegativeCross = a2.getString(index);
                        break;
                    case 2:
                        c2.mPositiveCross = a2.getString(index);
                        break;
                    case 3:
                    default:
                        String str = "unused attribute 0x" + Integer.toHexString(index) + "   " + mAttrMap.get(index);
                        break;
                    case 4:
                        c2.mCross = a2.getString(index);
                        break;
                    case 5:
                        c2.mTriggerSlack = a2.getFloat(index, c2.mTriggerSlack);
                        break;
                    case 6:
                        c2.mTriggerID = a2.getResourceId(index, c2.mTriggerID);
                        break;
                    case 7:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            c2.mTargetId = a2.getResourceId(index, c2.mTargetId);
                            if (c2.mTargetId == -1) {
                                c2.mTargetString = a2.getString(index);
                            }
                        } else if (a2.peekValue(index).type == 3) {
                            c2.mTargetString = a2.getString(index);
                        } else {
                            c2.mTargetId = a2.getResourceId(index, c2.mTargetId);
                        }
                        break;
                    case 8:
                        c2.mFramePosition = a2.getInteger(index, c2.mFramePosition);
                        c2.mFireThreshold = (c2.mFramePosition + 0.5f) / 100.0f;
                        break;
                    case 9:
                        c2.mTriggerCollisionId = a2.getResourceId(index, c2.mTriggerCollisionId);
                        break;
                    case 10:
                        c2.mPostLayout = a2.getBoolean(index, c2.mPostLayout);
                        break;
                    case 11:
                        c2.mTriggerReceiver = a2.getResourceId(index, c2.mTriggerReceiver);
                        break;
                    case 12:
                        c2.mViewTransitionOnCross = a2.getResourceId(index, c2.mViewTransitionOnCross);
                        break;
                    case 13:
                        c2.mViewTransitionOnNegativeCross = a2.getResourceId(index, c2.mViewTransitionOnNegativeCross);
                        break;
                    case 14:
                        c2.mViewTransitionOnPositiveCross = a2.getResourceId(index, c2.mViewTransitionOnPositiveCross);
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key src) {
        super.copy(src);
        KeyTrigger keyTrigger = (KeyTrigger) src;
        this.mCurveFit = keyTrigger.mCurveFit;
        this.mCross = keyTrigger.mCross;
        this.mTriggerReceiver = keyTrigger.mTriggerReceiver;
        this.mNegativeCross = keyTrigger.mNegativeCross;
        this.mPositiveCross = keyTrigger.mPositiveCross;
        this.mTriggerID = keyTrigger.mTriggerID;
        this.mTriggerCollisionId = keyTrigger.mTriggerCollisionId;
        this.mTriggerCollisionView = keyTrigger.mTriggerCollisionView;
        this.mTriggerSlack = keyTrigger.mTriggerSlack;
        this.mFireCrossReset = keyTrigger.mFireCrossReset;
        this.mFireNegativeReset = keyTrigger.mFireNegativeReset;
        this.mFirePositiveReset = keyTrigger.mFirePositiveReset;
        this.mFireThreshold = keyTrigger.mFireThreshold;
        this.mFireLastPos = keyTrigger.mFireLastPos;
        this.mPostLayout = keyTrigger.mPostLayout;
        this.mCollisionRect = keyTrigger.mCollisionRect;
        this.mTargetRect = keyTrigger.mTargetRect;
        this.mMethodHashMap = keyTrigger.mMethodHashMap;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: clone */
    public Key mo6901clone() {
        return new KeyTrigger().copy(this);
    }
}
