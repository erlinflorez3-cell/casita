package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.SharedValues;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public class ReactiveGuide extends View implements SharedValues.SharedValuesListener {
    private boolean mAnimateChange;
    private boolean mApplyToAllConstraintSets;
    private int mApplyToConstraintSetId;
    private int mAttributeId;

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
    }

    public ReactiveGuide(Context context) throws Throwable {
        super(context);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(null);
    }

    public ReactiveGuide(Context context, AttributeSet attrs) throws Throwable {
        super(context, attrs);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(attrs);
    }

    public ReactiveGuide(Context context, AttributeSet attrs, int defStyleAttr) throws Throwable {
        super(context, attrs, defStyleAttr);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(attrs);
    }

    public ReactiveGuide(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) throws Throwable {
        super(context, attrs, defStyleAttr);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(attrs);
    }

    private void init(AttributeSet attrs) throws Throwable {
        if (attrs != null) {
            Context context = getContext();
            int[] iArr = R.styleable.ConstraintLayout_ReactiveGuide;
            Class<?> cls = Class.forName(C1561oA.yd("6B;H@97\u007f@KMR>FO\b(SUZFXW", (short) (OY.Xd() ^ 24525)));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (ZN.Xd() ^ 5916);
            int[] iArr2 = new int["#1(750,v??59{\u0010DED<6JJ<+>N".length()];
            QB qb = new QB("#1(750,v??59{\u0010DED<6JJ<+>N");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr2[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i2));
            clsArr[1] = int[].class;
            Object[] objArr = {attrs, iArr};
            Method method = cls.getMethod(Xg.qd(".\"5#,2\u0018:@4..\f@A@82FF8G", (short) (C1499aX.Xd() ^ (-5606)), (short) (C1499aX.Xd() ^ (-4286))), clsArr);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                int indexCount = typedArray.getIndexCount();
                for (int i3 = 0; i3 < indexCount; i3++) {
                    int index = typedArray.getIndex(i3);
                    if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                        this.mAttributeId = typedArray.getResourceId(index, this.mAttributeId);
                    } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                        this.mAnimateChange = typedArray.getBoolean(index, this.mAnimateChange);
                    } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                        this.mApplyToConstraintSetId = typedArray.getResourceId(index, this.mApplyToConstraintSetId);
                    } else if (index == R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                        this.mApplyToAllConstraintSets = typedArray.getBoolean(index, this.mApplyToAllConstraintSets);
                    }
                }
                typedArray.recycle();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (this.mAttributeId != -1) {
            ConstraintLayout.getSharedValues().addListener(this.mAttributeId, this);
        }
    }

    public int getAttributeId() {
        return this.mAttributeId;
    }

    public void setAttributeId(int id) {
        SharedValues sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.mAttributeId;
        if (i2 != -1) {
            sharedValues.removeListener(i2, this);
        }
        this.mAttributeId = id;
        if (id != -1) {
            sharedValues.addListener(id, this);
        }
    }

    public int getApplyToConstraintSetId() {
        return this.mApplyToConstraintSetId;
    }

    public void setApplyToConstraintSetId(int id) {
        this.mApplyToConstraintSetId = id;
    }

    public boolean isAnimatingChange() {
        return this.mAnimateChange;
    }

    public void setAnimateChange(boolean animate) {
        this.mAnimateChange = animate;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int margin) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideBegin = margin;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int margin) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideEnd = margin;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float ratio) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guidePercent = ratio;
        setLayoutParams(layoutParams);
    }

    @Override // androidx.constraintlayout.widget.SharedValues.SharedValuesListener
    public void onNewValue(int key, int newValue, int oldValue) {
        setGuidelineBegin(newValue);
        int id = getId();
        if (id > 0 && (getParent() instanceof MotionLayout)) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            int currentState = motionLayout.getCurrentState();
            int i2 = this.mApplyToConstraintSetId;
            if (i2 != 0) {
                currentState = i2;
            }
            int i3 = 0;
            if (this.mAnimateChange) {
                if (this.mApplyToAllConstraintSets) {
                    int[] constraintSetIds = motionLayout.getConstraintSetIds();
                    while (i3 < constraintSetIds.length) {
                        int i4 = constraintSetIds[i3];
                        if (i4 != currentState) {
                            changeValue(newValue, id, motionLayout, i4);
                        }
                        i3++;
                    }
                }
                ConstraintSet constraintSetCloneConstraintSet = motionLayout.cloneConstraintSet(currentState);
                constraintSetCloneConstraintSet.setGuidelineEnd(id, newValue);
                motionLayout.updateStateAnimate(currentState, constraintSetCloneConstraintSet, 1000);
                return;
            }
            if (this.mApplyToAllConstraintSets) {
                int[] constraintSetIds2 = motionLayout.getConstraintSetIds();
                while (i3 < constraintSetIds2.length) {
                    changeValue(newValue, id, motionLayout, constraintSetIds2[i3]);
                    i3++;
                }
                return;
            }
            changeValue(newValue, id, motionLayout, currentState);
        }
    }

    private void changeValue(int newValue, int id, MotionLayout motionLayout, int currentState) {
        ConstraintSet constraintSet = motionLayout.getConstraintSet(currentState);
        constraintSet.setGuidelineEnd(id, newValue);
        motionLayout.updateState(currentState, constraintSet);
    }
}
