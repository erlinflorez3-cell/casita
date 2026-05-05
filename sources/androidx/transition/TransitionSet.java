package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class TransitionSet extends Transition {
    private static final int FLAG_CHANGE_EPICENTER = 8;
    private static final int FLAG_CHANGE_INTERPOLATOR = 1;
    private static final int FLAG_CHANGE_PATH_MOTION = 4;
    private static final int FLAG_CHANGE_PROPAGATION = 2;
    public static final int ORDERING_SEQUENTIAL = 1;
    public static final int ORDERING_TOGETHER = 0;
    private int mChangeFlags;
    int mCurrentListeners;
    private boolean mPlayTogether;
    boolean mStarted;
    ArrayList<Transition> mTransitions;

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ Transition addTarget(Class cls) {
        return addTarget((Class<?>) cls);
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ Transition removeTarget(Class cls) {
        return removeTarget((Class<?>) cls);
    }

    public TransitionSet() {
        this.mTransitions = new ArrayList<>();
        this.mPlayTogether = true;
        this.mStarted = false;
        this.mChangeFlags = 0;
    }

    public TransitionSet(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.mTransitions = new ArrayList<>();
        this.mPlayTogether = true;
        this.mStarted = false;
        this.mChangeFlags = 0;
        Object[] objArr = {attributeSet, Styleable.TRANSITION_SET};
        Method method = Class.forName(C1561oA.Xd("\u0002\u0010\u0007\u0016\u0014\u000f\u000bU\f\u0019\u0019 \u0012\u001c#]s!!(\u001a.+", (short) (FB.Xd() ^ 27435))).getMethod(Qg.kd("\u000f\u0001\u0012}\u0005\tl\r\u0011\u0003zxT\u0007\u0006\u0003xp\u0003\u0001p}", (short) (Od.Xd() ^ (-20459)), (short) (Od.Xd() ^ (-25023))), Class.forName(Wg.vd("=I>KG@:\u0003YWKM\u000e RQ^TL^\\L9Jh", (short) (C1633zX.Xd() ^ (-25133)))), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            setOrdering(TypedArrayUtils.getNamedInt(typedArray, (XmlResourceParser) attributeSet, hg.Vd("!\u001e\f\u0018\u001c\u0011\u001b\u000f\u0014\u0012q\u0014\u0005\u0005\u0011\u0007\u000b\u0003", (short) (FB.Xd() ^ 3995), (short) (FB.Xd() ^ 26213)), 0, 0));
            typedArray.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public TransitionSet setOrdering(int i2) {
        if (i2 == 0) {
            this.mPlayTogether = true;
        } else if (i2 == 1) {
            this.mPlayTogether = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i2);
        }
        return this;
    }

    public int getOrdering() {
        return !this.mPlayTogether ? 1 : 0;
    }

    public TransitionSet addTransition(Transition transition) {
        addTransitionInternal(transition);
        if (this.mDuration >= 0) {
            transition.setDuration(this.mDuration);
        }
        if ((this.mChangeFlags & 1) != 0) {
            transition.setInterpolator(getInterpolator());
        }
        int i2 = this.mChangeFlags;
        if ((i2 + 2) - (i2 | 2) != 0) {
            transition.setPropagation(getPropagation());
        }
        int i3 = this.mChangeFlags;
        if ((i3 + 4) - (i3 | 4) != 0) {
            transition.setPathMotion(getPathMotion());
        }
        if ((this.mChangeFlags & 8) != 0) {
            transition.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    private void addTransitionInternal(Transition transition) {
        this.mTransitions.add(transition);
        transition.mParent = this;
    }

    public int getTransitionCount() {
        return this.mTransitions.size();
    }

    public Transition getTransitionAt(int i2) {
        if (i2 < 0 || i2 >= this.mTransitions.size()) {
            return null;
        }
        return this.mTransitions.get(i2);
    }

    @Override // androidx.transition.Transition
    public TransitionSet setDuration(long j2) {
        ArrayList<Transition> arrayList;
        super.setDuration(j2);
        if (this.mDuration >= 0 && (arrayList = this.mTransitions) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mTransitions.get(i2).setDuration(j2);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public TransitionSet setStartDelay(long j2) {
        return (TransitionSet) super.setStartDelay(j2);
    }

    @Override // androidx.transition.Transition
    public TransitionSet setInterpolator(TimeInterpolator timeInterpolator) {
        this.mChangeFlags = (-1) - (((-1) - this.mChangeFlags) & ((-1) - 1));
        ArrayList<Transition> arrayList = this.mTransitions;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mTransitions.get(i2).setInterpolator(timeInterpolator);
            }
        }
        return (TransitionSet) super.setInterpolator(timeInterpolator);
    }

    @Override // androidx.transition.Transition
    public TransitionSet addTarget(View view) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).addTarget(view);
        }
        return (TransitionSet) super.addTarget(view);
    }

    @Override // androidx.transition.Transition
    public TransitionSet addTarget(int i2) {
        for (int i3 = 0; i3 < this.mTransitions.size(); i3++) {
            this.mTransitions.get(i3).addTarget(i2);
        }
        return (TransitionSet) super.addTarget(i2);
    }

    @Override // androidx.transition.Transition
    public TransitionSet addTarget(String str) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).addTarget(str);
        }
        return (TransitionSet) super.addTarget(str);
    }

    @Override // androidx.transition.Transition
    public TransitionSet addTarget(Class<?> cls) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).addTarget(cls);
        }
        return (TransitionSet) super.addTarget(cls);
    }

    @Override // androidx.transition.Transition
    public TransitionSet addListener(Transition.TransitionListener transitionListener) {
        return (TransitionSet) super.addListener(transitionListener);
    }

    @Override // androidx.transition.Transition
    public TransitionSet removeTarget(int i2) {
        for (int i3 = 0; i3 < this.mTransitions.size(); i3++) {
            this.mTransitions.get(i3).removeTarget(i2);
        }
        return (TransitionSet) super.removeTarget(i2);
    }

    @Override // androidx.transition.Transition
    public TransitionSet removeTarget(View view) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).removeTarget(view);
        }
        return (TransitionSet) super.removeTarget(view);
    }

    @Override // androidx.transition.Transition
    public TransitionSet removeTarget(Class<?> cls) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).removeTarget(cls);
        }
        return (TransitionSet) super.removeTarget(cls);
    }

    @Override // androidx.transition.Transition
    public TransitionSet removeTarget(String str) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).removeTarget(str);
        }
        return (TransitionSet) super.removeTarget(str);
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(View view, boolean z2) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).excludeTarget(view, z2);
        }
        return super.excludeTarget(view, z2);
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(String str, boolean z2) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).excludeTarget(str, z2);
        }
        return super.excludeTarget(str, z2);
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(int i2, boolean z2) {
        for (int i3 = 0; i3 < this.mTransitions.size(); i3++) {
            this.mTransitions.get(i3).excludeTarget(i2, z2);
        }
        return super.excludeTarget(i2, z2);
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(Class<?> cls, boolean z2) {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).excludeTarget(cls, z2);
        }
        return super.excludeTarget(cls, z2);
    }

    @Override // androidx.transition.Transition
    public TransitionSet removeListener(Transition.TransitionListener transitionListener) {
        return (TransitionSet) super.removeListener(transitionListener);
    }

    @Override // androidx.transition.Transition
    public void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.mChangeFlags |= 4;
        if (this.mTransitions != null) {
            for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
                this.mTransitions.get(i2).setPathMotion(pathMotion);
            }
        }
    }

    public TransitionSet removeTransition(Transition transition) {
        this.mTransitions.remove(transition);
        transition.mParent = null;
        return this;
    }

    private void setupStartEndListeners() {
        TransitionSetListener transitionSetListener = new TransitionSetListener(this);
        Iterator<Transition> it = this.mTransitions.iterator();
        while (it.hasNext()) {
            it.next().addListener(transitionSetListener);
        }
        this.mCurrentListeners = this.mTransitions.size();
    }

    static class TransitionSetListener extends TransitionListenerAdapter {
        TransitionSet mTransitionSet;

        TransitionSetListener(TransitionSet transitionSet) {
            this.mTransitionSet = transitionSet;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            if (this.mTransitionSet.mStarted) {
                return;
            }
            this.mTransitionSet.start();
            this.mTransitionSet.mStarted = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            TransitionSet transitionSet = this.mTransitionSet;
            transitionSet.mCurrentListeners--;
            if (this.mTransitionSet.mCurrentListeners == 0) {
                this.mTransitionSet.mStarted = false;
                this.mTransitionSet.end();
            }
            transition.removeListener(this);
        }
    }

    @Override // androidx.transition.Transition
    void createAnimators(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList<TransitionValues> arrayList, ArrayList<TransitionValues> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            Transition transition = this.mTransitions.get(i2);
            if (startDelay > 0 && (this.mPlayTogether || i2 == 0)) {
                long startDelay2 = transition.getStartDelay();
                if (startDelay2 > 0) {
                    transition.setStartDelay(startDelay2 + startDelay);
                } else {
                    transition.setStartDelay(startDelay);
                }
            }
            transition.createAnimators(viewGroup, transitionValuesMaps, transitionValuesMaps2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    protected void runAnimators() {
        if (this.mTransitions.isEmpty()) {
            start();
            end();
            return;
        }
        setupStartEndListeners();
        if (!this.mPlayTogether) {
            for (int i2 = 1; i2 < this.mTransitions.size(); i2++) {
                this.mTransitions.get(i2 - 1).addListener(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.1
                    final /* synthetic */ Transition val$nextTransition;

                    AnonymousClass1(Transition transition) {
                        transition = transition;
                    }

                    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition) {
                        transition.runAnimators();
                        transition.removeListener(this);
                    }
                });
            }
            Transition transition = this.mTransitions.get(0);
            if (transition != null) {
                transition.runAnimators();
                return;
            }
            return;
        }
        Iterator<Transition> it = this.mTransitions.iterator();
        while (it.hasNext()) {
            it.next().runAnimators();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.TransitionSet$1 */
    class AnonymousClass1 extends TransitionListenerAdapter {
        final /* synthetic */ Transition val$nextTransition;

        AnonymousClass1(Transition transition) {
            transition = transition;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.runAnimators();
            transition.removeListener(this);
        }
    }

    @Override // androidx.transition.Transition
    boolean hasAnimators() {
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            if (this.mTransitions.get(i2).hasAnimators()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: androidx.transition.TransitionSet$2 */
    class AnonymousClass2 extends TransitionListenerAdapter {
        AnonymousClass2() {
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            TransitionSet.this.mTransitions.remove(transition);
            if (TransitionSet.this.hasAnimators()) {
                return;
            }
            TransitionSet.this.notifyListeners(Transition.TransitionNotification.ON_CANCEL, false);
            TransitionSet.this.mEnded = true;
            TransitionSet.this.notifyListeners(Transition.TransitionNotification.ON_END, false);
        }
    }

    @Override // androidx.transition.Transition
    void prepareAnimatorsForSeeking() {
        this.mTotalDuration = 0L;
        AnonymousClass2 anonymousClass2 = new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.2
            AnonymousClass2() {
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
                TransitionSet.this.mTransitions.remove(transition);
                if (TransitionSet.this.hasAnimators()) {
                    return;
                }
                TransitionSet.this.notifyListeners(Transition.TransitionNotification.ON_CANCEL, false);
                TransitionSet.this.mEnded = true;
                TransitionSet.this.notifyListeners(Transition.TransitionNotification.ON_END, false);
            }
        };
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            Transition transition = this.mTransitions.get(i2);
            transition.addListener(anonymousClass2);
            transition.prepareAnimatorsForSeeking();
            long totalDurationMillis = transition.getTotalDurationMillis();
            if (this.mPlayTogether) {
                this.mTotalDuration = Math.max(this.mTotalDuration, totalDurationMillis);
            } else {
                transition.mSeekOffsetInParent = this.mTotalDuration;
                this.mTotalDuration += totalDurationMillis;
            }
        }
    }

    private int indexOfTransition(long j2) {
        for (int i2 = 1; i2 < this.mTransitions.size(); i2++) {
            if (this.mTransitions.get(i2).mSeekOffsetInParent > j2) {
                return i2 - 1;
            }
        }
        return this.mTransitions.size() - 1;
    }

    @Override // androidx.transition.Transition
    void setCurrentPlayTimeMillis(long j2, long j3) {
        long totalDurationMillis = getTotalDurationMillis();
        if (this.mParent != null) {
            if (j2 < 0 && j3 < 0) {
                return;
            }
            if (j2 > totalDurationMillis && j3 > totalDurationMillis) {
                return;
            }
        }
        boolean z2 = j2 < j3;
        if ((j2 >= 0 && j3 < 0) || (j2 <= totalDurationMillis && j3 > totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(Transition.TransitionNotification.ON_START, z2);
        }
        if (this.mPlayTogether) {
            for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
                this.mTransitions.get(i2).setCurrentPlayTimeMillis(j2, j3);
            }
        } else {
            int iIndexOfTransition = indexOfTransition(j3);
            if (j2 >= j3) {
                while (iIndexOfTransition < this.mTransitions.size()) {
                    Transition transition = this.mTransitions.get(iIndexOfTransition);
                    long j4 = transition.mSeekOffsetInParent;
                    long j5 = j2 - j4;
                    if (j5 < 0) {
                        break;
                    }
                    transition.setCurrentPlayTimeMillis(j5, j3 - j4);
                    iIndexOfTransition++;
                }
            } else {
                while (iIndexOfTransition >= 0) {
                    Transition transition2 = this.mTransitions.get(iIndexOfTransition);
                    long j6 = transition2.mSeekOffsetInParent;
                    long j7 = j2 - j6;
                    transition2.setCurrentPlayTimeMillis(j7, j3 - j6);
                    if (j7 >= 0) {
                        break;
                    } else {
                        iIndexOfTransition--;
                    }
                }
            }
        }
        if (this.mParent != null) {
            if ((j2 <= totalDurationMillis || j3 > totalDurationMillis) && (j2 >= 0 || j3 < 0)) {
                return;
            }
            if (j2 > totalDurationMillis) {
                this.mEnded = true;
            }
            notifyListeners(Transition.TransitionNotification.ON_END, z2);
        }
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.mTransitions.get(i2).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        if (isValidTarget(transitionValues.view)) {
            for (Transition transition : this.mTransitions) {
                if (transition.isValidTarget(transitionValues.view)) {
                    transition.captureStartValues(transitionValues);
                    transitionValues.mTargetedTransitions.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        if (isValidTarget(transitionValues.view)) {
            for (Transition transition : this.mTransitions) {
                if (transition.isValidTarget(transitionValues.view)) {
                    transition.captureEndValues(transitionValues);
                    transitionValues.mTargetedTransitions.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    void capturePropagationValues(TransitionValues transitionValues) {
        super.capturePropagationValues(transitionValues);
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTransitions.get(i2).capturePropagationValues(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    public void pause(View view) {
        super.pause(view);
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTransitions.get(i2).pause(view);
        }
    }

    @Override // androidx.transition.Transition
    public void resume(View view) {
        super.resume(view);
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTransitions.get(i2).resume(view);
        }
    }

    @Override // androidx.transition.Transition
    protected void cancel() {
        super.cancel();
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTransitions.get(i2).cancel();
        }
    }

    @Override // androidx.transition.Transition
    void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTransitions.get(i2).forceToEnd(viewGroup);
        }
    }

    @Override // androidx.transition.Transition
    void setCanRemoveViews(boolean z2) {
        super.setCanRemoveViews(z2);
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTransitions.get(i2).setCanRemoveViews(z2);
        }
    }

    @Override // androidx.transition.Transition
    public void setPropagation(TransitionPropagation transitionPropagation) {
        super.setPropagation(transitionPropagation);
        int i2 = this.mChangeFlags;
        this.mChangeFlags = (i2 + 2) - (i2 & 2);
        int size = this.mTransitions.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.mTransitions.get(i3).setPropagation(transitionPropagation);
        }
    }

    @Override // androidx.transition.Transition
    public void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        super.setEpicenterCallback(epicenterCallback);
        this.mChangeFlags = (-1) - (((-1) - this.mChangeFlags) & ((-1) - 8));
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTransitions.get(i2).setEpicenterCallback(epicenterCallback);
        }
    }

    @Override // androidx.transition.Transition
    String toString(String str) {
        String string = super.toString(str);
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            string = string + "\n" + this.mTransitions.get(i2).toString(str + "  ");
        }
        return string;
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: clone */
    public Transition mo6979clone() {
        TransitionSet transitionSet = (TransitionSet) super.mo6979clone();
        transitionSet.mTransitions = new ArrayList<>();
        int size = this.mTransitions.size();
        for (int i2 = 0; i2 < size; i2++) {
            transitionSet.addTransitionInternal(this.mTransitions.get(i2).mo6979clone());
        }
        return transitionSet;
    }
}
