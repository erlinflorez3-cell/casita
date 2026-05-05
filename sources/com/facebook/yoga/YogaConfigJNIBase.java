package com.facebook.yoga;

/* JADX INFO: loaded from: classes3.dex */
public abstract class YogaConfigJNIBase extends YogaConfig {
    private YogaLogger mLogger;
    long mNativePointer;

    YogaConfigJNIBase() {
        this(YogaNative.jni_YGConfigNewJNI());
    }

    private YogaConfigJNIBase(long j2) {
        if (j2 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.mNativePointer = j2;
    }

    YogaConfigJNIBase(boolean z2) {
        this(YogaNative.jni_YGConfigNewJNI());
    }

    @Override // com.facebook.yoga.YogaConfig
    public YogaErrata getErrata() {
        return YogaErrata.fromInt(YogaNative.jni_YGConfigGetErrataJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaConfig
    public YogaLogger getLogger() {
        return this.mLogger;
    }

    @Override // com.facebook.yoga.YogaConfig
    protected long getNativePointer() {
        return this.mNativePointer;
    }

    @Override // com.facebook.yoga.YogaConfig
    public void setErrata(YogaErrata yogaErrata) {
        YogaNative.jni_YGConfigSetErrataJNI(this.mNativePointer, yogaErrata.intValue());
    }

    @Override // com.facebook.yoga.YogaConfig
    public void setExperimentalFeatureEnabled(YogaExperimentalFeature yogaExperimentalFeature, boolean z2) {
        YogaNative.jni_YGConfigSetExperimentalFeatureEnabledJNI(this.mNativePointer, yogaExperimentalFeature.intValue(), z2);
    }

    @Override // com.facebook.yoga.YogaConfig
    public void setLogger(YogaLogger yogaLogger) {
        this.mLogger = yogaLogger;
        YogaNative.jni_YGConfigSetLoggerJNI(this.mNativePointer, yogaLogger);
    }

    @Override // com.facebook.yoga.YogaConfig
    public void setPointScaleFactor(float f2) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaConfig
    public void setUseWebDefaults(boolean z2) {
        YogaNative.jni_YGConfigSetUseWebDefaultsJNI(this.mNativePointer, z2);
    }
}
