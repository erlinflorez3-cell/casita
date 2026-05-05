package androidx.camera.core.impl;

import androidx.camera.core.Logger;
import androidx.camera.core.RetryPolicy;
import androidx.camera.core.impl.CameraValidator;

/* JADX INFO: loaded from: classes.dex */
public final class CameraProviderInitRetryPolicy implements RetryPolicyInternal {
    private final RetryPolicy mDelegatePolicy;

    /* JADX INFO: renamed from: androidx.camera.core.impl.CameraProviderInitRetryPolicy$1 */
    class AnonymousClass1 implements RetryPolicy {
        final /* synthetic */ long val$timeoutInMillis;

        AnonymousClass1(long j2) {
            j = j2;
        }

        @Override // androidx.camera.core.RetryPolicy
        public RetryPolicy.RetryConfig onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
            if (executionState.getStatus() == 1) {
                return RetryPolicy.RetryConfig.NOT_RETRY;
            }
            return RetryPolicy.RetryConfig.DEFAULT_DELAY_RETRY;
        }

        @Override // androidx.camera.core.RetryPolicy
        public long getTimeoutInMillis() {
            return j;
        }
    }

    public CameraProviderInitRetryPolicy(long j2) {
        this.mDelegatePolicy = new TimeoutRetryPolicy(j2, new RetryPolicy() { // from class: androidx.camera.core.impl.CameraProviderInitRetryPolicy.1
            final /* synthetic */ long val$timeoutInMillis;

            AnonymousClass1(long j22) {
                j = j22;
            }

            @Override // androidx.camera.core.RetryPolicy
            public RetryPolicy.RetryConfig onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
                if (executionState.getStatus() == 1) {
                    return RetryPolicy.RetryConfig.NOT_RETRY;
                }
                return RetryPolicy.RetryConfig.DEFAULT_DELAY_RETRY;
            }

            @Override // androidx.camera.core.RetryPolicy
            public long getTimeoutInMillis() {
                return j;
            }
        });
    }

    @Override // androidx.camera.core.RetryPolicy
    public RetryPolicy.RetryConfig onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
        return this.mDelegatePolicy.onRetryDecisionRequested(executionState);
    }

    @Override // androidx.camera.core.RetryPolicy
    public long getTimeoutInMillis() {
        return this.mDelegatePolicy.getTimeoutInMillis();
    }

    @Override // androidx.camera.core.impl.RetryPolicyInternal
    public RetryPolicy copy(long j2) {
        return new CameraProviderInitRetryPolicy(j2);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Legacy implements RetryPolicyInternal {
        private final RetryPolicy mBasePolicy;

        public Legacy(long j2) {
            this.mBasePolicy = new CameraProviderInitRetryPolicy(j2);
        }

        @Override // androidx.camera.core.RetryPolicy
        public RetryPolicy.RetryConfig onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
            if (!this.mBasePolicy.onRetryDecisionRequested(executionState).shouldRetry()) {
                Throwable cause = executionState.getCause();
                if (cause instanceof CameraValidator.CameraIdListIncorrectException) {
                    Logger.e("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    if (((CameraValidator.CameraIdListIncorrectException) cause).getAvailableCameraCount() > 0) {
                        return RetryPolicy.RetryConfig.COMPLETE_WITHOUT_FAILURE;
                    }
                }
                return RetryPolicy.RetryConfig.NOT_RETRY;
            }
            return RetryPolicy.RetryConfig.DEFAULT_DELAY_RETRY;
        }

        @Override // androidx.camera.core.RetryPolicy
        public long getTimeoutInMillis() {
            return this.mBasePolicy.getTimeoutInMillis();
        }

        @Override // androidx.camera.core.impl.RetryPolicyInternal
        public RetryPolicy copy(long j2) {
            return new Legacy(j2);
        }
    }
}
