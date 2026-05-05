package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final LottieListener<Throwable> DEFAULT_FAILURE_LISTENER = new LottieListener() { // from class: com.airbnb.lottie.LottieAnimationView$$ExternalSyntheticLambda1
        @Override // com.airbnb.lottie.LottieListener
        public final void onResult(Object obj) {
            LottieAnimationView.lambda$static$0((Throwable) obj);
        }
    };
    private static final String TAG = "LottieAnimationView";
    private String animationName;
    private int animationResId;
    private boolean autoPlay;
    private boolean cacheComposition;
    private LottieTask<LottieComposition> compositionTask;
    private LottieListener<Throwable> failureListener;
    private int fallbackResource;
    private boolean ignoreUnschedule;
    private final LottieListener<LottieComposition> loadedListener;
    private final LottieDrawable lottieDrawable;
    private final Set<LottieOnCompositionLoadedListener> lottieOnCompositionLoadedListeners;
    private final Set<UserActionTaken> userActionsTaken;
    private final LottieListener<Throwable> wrappedFailureListener;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.airbnb.lottie.LottieAnimationView.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };
        String animationName;
        int animationResId;
        String imageAssetsFolder;
        boolean isAnimating;
        float progress;
        int repeatCount;
        int repeatMode;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.animationName = parcel.readString();
            this.progress = parcel.readFloat();
            this.isAnimating = parcel.readInt() == 1;
            this.imageAssetsFolder = parcel.readString();
            this.repeatMode = parcel.readInt();
            this.repeatCount = parcel.readInt();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.animationName);
            parcel.writeFloat(this.progress);
            parcel.writeInt(this.isAnimating ? 1 : 0);
            parcel.writeString(this.imageAssetsFolder);
            parcel.writeInt(this.repeatMode);
            parcel.writeInt(this.repeatCount);
        }
    }

    private enum UserActionTaken {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    private static class WeakFailureListener implements LottieListener<Throwable> {
        private final WeakReference<LottieAnimationView> targetReference;

        public WeakFailureListener(LottieAnimationView lottieAnimationView) {
            this.targetReference = new WeakReference<>(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.LottieListener
        public void onResult(Throwable th) {
            LottieAnimationView lottieAnimationView = this.targetReference.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.fallbackResource != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.fallbackResource);
            }
            (lottieAnimationView.failureListener == null ? LottieAnimationView.DEFAULT_FAILURE_LISTENER : lottieAnimationView.failureListener).onResult(th);
        }
    }

    private static class WeakSuccessListener implements LottieListener<LottieComposition> {
        private final WeakReference<LottieAnimationView> targetReference;

        public WeakSuccessListener(LottieAnimationView lottieAnimationView) {
            this.targetReference = new WeakReference<>(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.LottieListener
        public void onResult(LottieComposition lottieComposition) throws Throwable {
            LottieAnimationView lottieAnimationView = this.targetReference.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(lottieComposition);
        }
    }

    public LottieAnimationView(Context context) throws Throwable {
        super(context);
        this.loadedListener = new WeakSuccessListener(this);
        this.wrappedFailureListener = new WeakFailureListener(this);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(null, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.loadedListener = new WeakSuccessListener(this);
        this.wrappedFailureListener = new WeakFailureListener(this);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        super(context, attributeSet, i2);
        this.loadedListener = new WeakSuccessListener(this);
        this.wrappedFailureListener = new WeakFailureListener(this);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(attributeSet, i2);
    }

    private void cancelLoaderTask() {
        LottieTask<LottieComposition> lottieTask = this.compositionTask;
        if (lottieTask != null) {
            lottieTask.removeListener(this.loadedListener);
            this.compositionTask.removeFailureListener(this.wrappedFailureListener);
        }
    }

    private void clearComposition() throws Throwable {
        this.lottieDrawable.clearComposition();
    }

    private LottieTask<LottieComposition> fromAssets(final String str) {
        return isInEditMode() ? new LottieTask<>(new Callable() { // from class: com.airbnb.lottie.LottieAnimationView$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m6996lambda$fromAssets$2$comairbnblottieLottieAnimationView(str);
            }
        }, true) : this.cacheComposition ? LottieCompositionFactory.fromAsset(getContext(), str) : LottieCompositionFactory.fromAsset(getContext(), str, null);
    }

    private LottieTask<LottieComposition> fromRawRes(final int i2) {
        return isInEditMode() ? new LottieTask<>(new Callable() { // from class: com.airbnb.lottie.LottieAnimationView$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m6997lambda$fromRawRes$1$comairbnblottieLottieAnimationView(i2);
            }
        }, true) : this.cacheComposition ? LottieCompositionFactory.fromRawRes(getContext(), i2) : LottieCompositionFactory.fromRawRes(getContext(), i2, null);
    }

    private void init(AttributeSet attributeSet, int i2) throws Throwable {
        String string;
        Context context = getContext();
        int[] iArr = R.styleable.LottieAnimationView;
        Class<?> cls = Class.forName(C1561oA.od("\u000b\u0017\f\u0019\u0015\u000e\bP\u0005\u0010\u000e\u0013\u0003\u000b\u0010H\\\b\u0006\u000bz\r\b", (short) (C1633zX.Xd() ^ (-23567))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Kd("drixvqm8\u0001\u0001vz=Q\u0006\u0007\u0006}w\f\f}l\u007f\u0010", (short) (C1580rY.Xd() ^ (-14181)))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), 0};
        Method method = cls.getMethod(Wg.Zd("2\u0010\tpoP\u001c84\u0002bX0:&\u001b\r\\ZQ9\"", (short) (C1607wl.Xd() ^ 28718), (short) (C1607wl.Xd() ^ 21798)), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            this.cacheComposition = typedArray.getBoolean(R.styleable.LottieAnimationView_lottie_cacheComposition, true);
            boolean zHasValue = typedArray.hasValue(R.styleable.LottieAnimationView_lottie_rawRes);
            boolean zHasValue2 = typedArray.hasValue(R.styleable.LottieAnimationView_lottie_fileName);
            boolean zHasValue3 = typedArray.hasValue(R.styleable.LottieAnimationView_lottie_url);
            if (zHasValue && zHasValue2) {
                short sXd = (short) (C1499aX.Xd() ^ (-26246));
                int[] iArr2 = new int["\u0006\n\u0010\u0011\u0007\u0004~\u0013\u0003\u001au\n\u0019F\t\u0017\u000eJ\u0018\u001c\"#\u0019\u0016\u0011\u0019\u001d!\u001b\u0005\u0019&\u001fZ\u001f\u001e,-/5a%)d;:--i,@lB75pE4A:uKAF?\t{-JDATG\u0003YXK\u0007WWVd\f\\\\T\u0010Rf\u0013ccY\\&".length()];
                QB qb = new QB("\u0006\n\u0010\u0011\u0007\u0004~\u0013\u0003\u001au\n\u0019F\t\u0017\u000eJ\u0018\u001c\"#\u0019\u0016\u0011\u0019\u001d!\u001b\u0005\u0019&\u001fZ\u001f\u001e,-/5a%)d;:--i,@lB75pE4A:uKAF?\t{-JDATG\u0003YXK\u0007WWVd\f\\\\T\u0010Rf\u0013ccY\\&");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr2[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
                    i3++;
                }
                throw new IllegalArgumentException(new String(iArr2, 0, i3));
            }
            if (zHasValue) {
                int resourceId = typedArray.getResourceId(R.styleable.LottieAnimationView_lottie_rawRes, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (zHasValue2) {
                String string2 = typedArray.getString(R.styleable.LottieAnimationView_lottie_fileName);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (zHasValue3 && (string = typedArray.getString(R.styleable.LottieAnimationView_lottie_url)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(typedArray.getResourceId(R.styleable.LottieAnimationView_lottie_fallbackRes, 0));
            if (typedArray.getBoolean(R.styleable.LottieAnimationView_lottie_autoPlay, false)) {
                this.autoPlay = true;
            }
            if (typedArray.getBoolean(R.styleable.LottieAnimationView_lottie_loop, false)) {
                this.lottieDrawable.setRepeatCount(-1);
            }
            if (typedArray.hasValue(R.styleable.LottieAnimationView_lottie_repeatMode)) {
                setRepeatMode(typedArray.getInt(R.styleable.LottieAnimationView_lottie_repeatMode, 1));
            }
            if (typedArray.hasValue(R.styleable.LottieAnimationView_lottie_repeatCount)) {
                setRepeatCount(typedArray.getInt(R.styleable.LottieAnimationView_lottie_repeatCount, -1));
            }
            if (typedArray.hasValue(R.styleable.LottieAnimationView_lottie_speed)) {
                setSpeed(typedArray.getFloat(R.styleable.LottieAnimationView_lottie_speed, 1.0f));
            }
            if (typedArray.hasValue(R.styleable.LottieAnimationView_lottie_clipToCompositionBounds)) {
                setClipToCompositionBounds(typedArray.getBoolean(R.styleable.LottieAnimationView_lottie_clipToCompositionBounds, true));
            }
            if (typedArray.hasValue(R.styleable.LottieAnimationView_lottie_clipTextToBoundingBox)) {
                setClipTextToBoundingBox(typedArray.getBoolean(R.styleable.LottieAnimationView_lottie_clipTextToBoundingBox, false));
            }
            if (typedArray.hasValue(R.styleable.LottieAnimationView_lottie_defaultFontFileExtension)) {
                setDefaultFontFileExtension(typedArray.getString(R.styleable.LottieAnimationView_lottie_defaultFontFileExtension));
            }
            setImageAssetsFolder(typedArray.getString(R.styleable.LottieAnimationView_lottie_imageAssetsFolder));
            setProgressInternal(typedArray.getFloat(R.styleable.LottieAnimationView_lottie_progress, 0.0f), typedArray.hasValue(R.styleable.LottieAnimationView_lottie_progress));
            enableMergePathsForKitKatAndAbove(typedArray.getBoolean(R.styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
            setApplyingOpacityToLayersEnabled(typedArray.getBoolean(R.styleable.LottieAnimationView_lottie_applyOpacityToLayers, false));
            setApplyingShadowToLayersEnabled(typedArray.getBoolean(R.styleable.LottieAnimationView_lottie_applyShadowToLayers, true));
            if (typedArray.hasValue(R.styleable.LottieAnimationView_lottie_colorFilter)) {
                addValueCallback(new KeyPath(Wg.vd("LK", (short) (ZN.Xd() ^ 13622))), LottieProperty.COLOR_FILTER, (LottieValueCallback<ColorFilter>) new LottieValueCallback(new SimpleColorFilter(AppCompatResources.getColorStateList(getContext(), typedArray.getResourceId(R.styleable.LottieAnimationView_lottie_colorFilter, -1)).getDefaultColor())));
            }
            if (typedArray.hasValue(R.styleable.LottieAnimationView_lottie_renderMode)) {
                int iOrdinal = typedArray.getInt(R.styleable.LottieAnimationView_lottie_renderMode, RenderMode.AUTOMATIC.ordinal());
                if (iOrdinal >= RenderMode.values().length) {
                    iOrdinal = RenderMode.AUTOMATIC.ordinal();
                }
                setRenderMode(RenderMode.values()[iOrdinal]);
            }
            if (typedArray.hasValue(R.styleable.LottieAnimationView_lottie_asyncUpdates)) {
                int iOrdinal2 = typedArray.getInt(R.styleable.LottieAnimationView_lottie_asyncUpdates, AsyncUpdates.AUTOMATIC.ordinal());
                if (iOrdinal2 >= RenderMode.values().length) {
                    iOrdinal2 = AsyncUpdates.AUTOMATIC.ordinal();
                }
                setAsyncUpdates(AsyncUpdates.values()[iOrdinal2]);
            }
            setIgnoreDisabledSystemAnimations(typedArray.getBoolean(R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
            if (typedArray.hasValue(R.styleable.LottieAnimationView_lottie_useCompositionFrameRate)) {
                setUseCompositionFrameRate(typedArray.getBoolean(R.styleable.LottieAnimationView_lottie_useCompositionFrameRate, false));
            }
            typedArray.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* synthetic */ void lambda$static$0(Throwable th) {
        if (!Utils.isNetworkException(th)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        Logger.warning("Unable to load composition.", th);
    }

    private void setCompositionTask(LottieTask<LottieComposition> lottieTask) throws Throwable {
        LottieResult<LottieComposition> result = lottieTask.getResult();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (result != null && lottieDrawable == getDrawable() && lottieDrawable.getComposition() == result.getValue()) {
            return;
        }
        this.userActionsTaken.add(UserActionTaken.SET_ANIMATION);
        clearComposition();
        cancelLoaderTask();
        this.compositionTask = lottieTask.addListener(this.loadedListener).addFailureListener(this.wrappedFailureListener);
    }

    private void setLottieDrawable() {
        boolean zIsAnimating = isAnimating();
        setImageDrawable(null);
        setImageDrawable(this.lottieDrawable);
        if (zIsAnimating) {
            this.lottieDrawable.resumeAnimation();
        }
    }

    private void setProgressInternal(float f2, boolean z2) {
        if (z2) {
            this.userActionsTaken.add(UserActionTaken.SET_PROGRESS);
        }
        this.lottieDrawable.setProgress(f2);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.addAnimatorListener(animatorListener);
    }

    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.addAnimatorPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.addAnimatorUpdateListener(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        LottieComposition composition = getComposition();
        if (composition != null) {
            lottieOnCompositionLoadedListener.onCompositionLoaded(composition);
        }
        return this.lottieOnCompositionLoadedListeners.add(lottieOnCompositionLoadedListener);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t2, LottieValueCallback<T> lottieValueCallback) throws Throwable {
        this.lottieDrawable.addValueCallback(keyPath, t2, lottieValueCallback);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t2, final SimpleLottieValueCallback<T> simpleLottieValueCallback) throws Throwable {
        this.lottieDrawable.addValueCallback(keyPath, t2, new LottieValueCallback<T>() { // from class: com.airbnb.lottie.LottieAnimationView.1
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
                return (T) simpleLottieValueCallback.getValue(lottieFrameInfo);
            }
        });
    }

    public void cancelAnimation() {
        this.autoPlay = false;
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.cancelAnimation();
    }

    public <T> void clearValueCallback(KeyPath keyPath, T t2) throws Throwable {
        this.lottieDrawable.addValueCallback(keyPath, t2, (LottieValueCallback) null);
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
        this.lottieDrawable.disableExtraScaleModeInFitXY();
    }

    public void enableFeatureFlag(LottieFeatureFlag lottieFeatureFlag, boolean z2) {
        this.lottieDrawable.enableFeatureFlag(lottieFeatureFlag, z2);
    }

    public void enableMergePathsForKitKatAndAbove(boolean z2) {
        this.lottieDrawable.enableFeatureFlag(LottieFeatureFlag.MergePathsApi19, z2);
    }

    public AsyncUpdates getAsyncUpdates() {
        return this.lottieDrawable.getAsyncUpdates();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.lottieDrawable.getAsyncUpdatesEnabled();
    }

    public boolean getClipTextToBoundingBox() {
        return this.lottieDrawable.getClipTextToBoundingBox();
    }

    public boolean getClipToCompositionBounds() {
        return this.lottieDrawable.getClipToCompositionBounds();
    }

    public LottieComposition getComposition() {
        Drawable drawable = getDrawable();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (drawable == lottieDrawable) {
            return lottieDrawable.getComposition();
        }
        return null;
    }

    public long getDuration() {
        LottieComposition composition = getComposition();
        if (composition != null) {
            return (long) composition.getDuration();
        }
        return 0L;
    }

    public int getFrame() {
        return this.lottieDrawable.getFrame();
    }

    public String getImageAssetsFolder() {
        return this.lottieDrawable.getImageAssetsFolder();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.lottieDrawable.getMaintainOriginalImageBounds();
    }

    public float getMaxFrame() {
        return this.lottieDrawable.getMaxFrame();
    }

    public float getMinFrame() {
        return this.lottieDrawable.getMinFrame();
    }

    public PerformanceTracker getPerformanceTracker() {
        return this.lottieDrawable.getPerformanceTracker();
    }

    public float getProgress() {
        return this.lottieDrawable.getProgress();
    }

    public RenderMode getRenderMode() {
        return this.lottieDrawable.getRenderMode();
    }

    public int getRepeatCount() {
        return this.lottieDrawable.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.lottieDrawable.getRepeatMode();
    }

    public float getSpeed() {
        return this.lottieDrawable.getSpeed();
    }

    public boolean hasMasks() {
        return this.lottieDrawable.hasMasks();
    }

    public boolean hasMatte() {
        return this.lottieDrawable.hasMatte();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof LottieDrawable) && ((LottieDrawable) drawable).getRenderMode() == RenderMode.SOFTWARE) {
            this.lottieDrawable.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.lottieDrawable.isAnimating();
    }

    public boolean isFeatureFlagEnabled(LottieFeatureFlag lottieFeatureFlag) {
        return this.lottieDrawable.isFeatureFlagEnabled(lottieFeatureFlag);
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.lottieDrawable.isFeatureFlagEnabled(LottieFeatureFlag.MergePathsApi19);
    }

    /* JADX INFO: renamed from: lambda$fromAssets$2$com-airbnb-lottie-LottieAnimationView, reason: not valid java name */
    /* synthetic */ LottieResult m6996lambda$fromAssets$2$comairbnblottieLottieAnimationView(String str) throws Exception {
        return this.cacheComposition ? LottieCompositionFactory.fromAssetSync(getContext(), str) : LottieCompositionFactory.fromAssetSync(getContext(), str, null);
    }

    /* JADX INFO: renamed from: lambda$fromRawRes$1$com-airbnb-lottie-LottieAnimationView, reason: not valid java name */
    /* synthetic */ LottieResult m6997lambda$fromRawRes$1$comairbnblottieLottieAnimationView(int i2) throws Exception {
        return this.cacheComposition ? LottieCompositionFactory.fromRawResSync(getContext(), i2) : LottieCompositionFactory.fromRawResSync(getContext(), i2, null);
    }

    @Deprecated
    public void loop(boolean z2) {
        this.lottieDrawable.setRepeatCount(z2 ? -1 : 0);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.autoPlay) {
            return;
        }
        this.lottieDrawable.playAnimation();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) throws Throwable {
        int i2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.animationName = savedState.animationName;
        if (!this.userActionsTaken.contains(UserActionTaken.SET_ANIMATION) && !TextUtils.isEmpty(this.animationName)) {
            setAnimation(this.animationName);
        }
        this.animationResId = savedState.animationResId;
        if (!this.userActionsTaken.contains(UserActionTaken.SET_ANIMATION) && (i2 = this.animationResId) != 0) {
            setAnimation(i2);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_PROGRESS)) {
            setProgressInternal(savedState.progress, false);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.PLAY_OPTION) && savedState.isAnimating) {
            playAnimation();
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.imageAssetsFolder);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.repeatMode);
        }
        if (this.userActionsTaken.contains(UserActionTaken.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.repeatCount);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.animationName = this.animationName;
        savedState.animationResId = this.animationResId;
        savedState.progress = this.lottieDrawable.getProgress();
        savedState.isAnimating = this.lottieDrawable.isAnimatingOrWillAnimateOnVisible();
        savedState.imageAssetsFolder = this.lottieDrawable.getImageAssetsFolder();
        savedState.repeatMode = this.lottieDrawable.getRepeatMode();
        savedState.repeatCount = this.lottieDrawable.getRepeatCount();
        return savedState;
    }

    public void pauseAnimation() {
        this.autoPlay = false;
        this.lottieDrawable.pauseAnimation();
    }

    public void playAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.playAnimation();
    }

    public void removeAllAnimatorListeners() {
        this.lottieDrawable.removeAllAnimatorListeners();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.lottieOnCompositionLoadedListeners.clear();
    }

    public void removeAllUpdateListeners() {
        this.lottieDrawable.removeAllUpdateListeners();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.removeAnimatorListener(animatorListener);
    }

    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.removeAnimatorPauseListener(animatorPauseListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        return this.lottieOnCompositionLoadedListeners.remove(lottieOnCompositionLoadedListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.removeAnimatorUpdateListener(animatorUpdateListener);
    }

    public List<KeyPath> resolveKeyPath(KeyPath keyPath) {
        return this.lottieDrawable.resolveKeyPath(keyPath);
    }

    public void resumeAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.resumeAnimation();
    }

    public void reverseAnimationSpeed() {
        this.lottieDrawable.reverseAnimationSpeed();
    }

    public void setAnimation(int i2) throws Throwable {
        this.animationResId = i2;
        this.animationName = null;
        setCompositionTask(fromRawRes(i2));
    }

    public void setAnimation(InputStream inputStream, String str) throws Throwable {
        setCompositionTask(LottieCompositionFactory.fromJsonInputStream(inputStream, str));
    }

    public void setAnimation(String str) throws Throwable {
        this.animationName = str;
        this.animationResId = 0;
        setCompositionTask(fromAssets(str));
    }

    public void setAnimation(ZipInputStream zipInputStream, String str) throws Throwable {
        setCompositionTask(LottieCompositionFactory.fromZipStream(zipInputStream, str));
    }

    @Deprecated
    public void setAnimationFromJson(String str) throws Throwable {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromJson(String str, String str2) throws Throwable {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str) throws Throwable {
        setCompositionTask(this.cacheComposition ? LottieCompositionFactory.fromUrl(getContext(), str) : LottieCompositionFactory.fromUrl(getContext(), str, null));
    }

    public void setAnimationFromUrl(String str, String str2) throws Throwable {
        setCompositionTask(LottieCompositionFactory.fromUrl(getContext(), str, str2));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z2) {
        this.lottieDrawable.setApplyingOpacityToLayersEnabled(z2);
    }

    public void setApplyingShadowToLayersEnabled(boolean z2) {
        this.lottieDrawable.setApplyingShadowToLayersEnabled(z2);
    }

    public void setAsyncUpdates(AsyncUpdates asyncUpdates) {
        this.lottieDrawable.setAsyncUpdates(asyncUpdates);
    }

    public void setCacheComposition(boolean z2) {
        this.cacheComposition = z2;
    }

    public void setClipTextToBoundingBox(boolean z2) throws Throwable {
        this.lottieDrawable.setClipTextToBoundingBox(z2);
    }

    public void setClipToCompositionBounds(boolean z2) throws Throwable {
        this.lottieDrawable.setClipToCompositionBounds(z2);
    }

    public void setComposition(LottieComposition lottieComposition) throws Throwable {
        if (L.DBG) {
            String str = TAG;
            String str2 = "Set Composition \n" + lottieComposition;
        }
        this.lottieDrawable.setCallback(this);
        this.ignoreUnschedule = true;
        boolean composition = this.lottieDrawable.setComposition(lottieComposition);
        if (this.autoPlay) {
            this.lottieDrawable.playAnimation();
        }
        this.ignoreUnschedule = false;
        if (getDrawable() != this.lottieDrawable || composition) {
            if (!composition) {
                setLottieDrawable();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<LottieOnCompositionLoadedListener> it = this.lottieOnCompositionLoadedListeners.iterator();
            while (it.hasNext()) {
                it.next().onCompositionLoaded(lottieComposition);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.lottieDrawable.setDefaultFontFileExtension(str);
    }

    public void setFailureListener(LottieListener<Throwable> lottieListener) {
        this.failureListener = lottieListener;
    }

    public void setFallbackResource(int i2) {
        this.fallbackResource = i2;
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        this.lottieDrawable.setFontAssetDelegate(fontAssetDelegate);
    }

    public void setFontMap(Map<String, Typeface> map) throws Throwable {
        this.lottieDrawable.setFontMap(map);
    }

    public void setFrame(int i2) {
        this.lottieDrawable.setFrame(i2);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z2) {
        this.lottieDrawable.setIgnoreDisabledSystemAnimations(z2);
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.lottieDrawable.setImageAssetDelegate(imageAssetDelegate);
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.setImagesAssetsFolder(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.animationResId = 0;
        this.animationName = null;
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.animationResId = 0;
        this.animationName = null;
        cancelLoaderTask();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i2) {
        this.animationResId = 0;
        this.animationName = null;
        cancelLoaderTask();
        super.setImageResource(i2);
    }

    public void setMaintainOriginalImageBounds(boolean z2) {
        this.lottieDrawable.setMaintainOriginalImageBounds(z2);
    }

    public void setMaxFrame(int i2) {
        this.lottieDrawable.setMaxFrame(i2);
    }

    public void setMaxFrame(String str) {
        this.lottieDrawable.setMaxFrame(str);
    }

    public void setMaxProgress(float f2) {
        this.lottieDrawable.setMaxProgress(f2);
    }

    public void setMinAndMaxFrame(int i2, int i3) {
        this.lottieDrawable.setMinAndMaxFrame(i2, i3);
    }

    public void setMinAndMaxFrame(String str) {
        this.lottieDrawable.setMinAndMaxFrame(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z2) {
        this.lottieDrawable.setMinAndMaxFrame(str, str2, z2);
    }

    public void setMinAndMaxProgress(float f2, float f3) {
        this.lottieDrawable.setMinAndMaxProgress(f2, f3);
    }

    public void setMinFrame(int i2) {
        this.lottieDrawable.setMinFrame(i2);
    }

    public void setMinFrame(String str) {
        this.lottieDrawable.setMinFrame(str);
    }

    public void setMinProgress(float f2) {
        this.lottieDrawable.setMinProgress(f2);
    }

    public void setOutlineMasksAndMattes(boolean z2) {
        this.lottieDrawable.setOutlineMasksAndMattes(z2);
    }

    public void setPerformanceTrackingEnabled(boolean z2) {
        this.lottieDrawable.setPerformanceTrackingEnabled(z2);
    }

    public void setProgress(float f2) {
        setProgressInternal(f2, true);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.lottieDrawable.setRenderMode(renderMode);
    }

    public void setRepeatCount(int i2) {
        this.userActionsTaken.add(UserActionTaken.SET_REPEAT_COUNT);
        this.lottieDrawable.setRepeatCount(i2);
    }

    public void setRepeatMode(int i2) {
        this.userActionsTaken.add(UserActionTaken.SET_REPEAT_MODE);
        this.lottieDrawable.setRepeatMode(i2);
    }

    public void setSafeMode(boolean z2) {
        this.lottieDrawable.setSafeMode(z2);
    }

    public void setSpeed(float f2) {
        this.lottieDrawable.setSpeed(f2);
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        this.lottieDrawable.setTextDelegate(textDelegate);
    }

    public void setUseCompositionFrameRate(boolean z2) {
        this.lottieDrawable.setUseCompositionFrameRate(z2);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.ignoreUnschedule && drawable == (lottieDrawable = this.lottieDrawable) && lottieDrawable.isAnimating()) {
            pauseAnimation();
        } else if (!this.ignoreUnschedule && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.isAnimating()) {
                lottieDrawable2.pauseAnimation();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        return this.lottieDrawable.updateBitmap(str, bitmap);
    }
}
