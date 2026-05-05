package androidx.camera.core.impl;

import androidx.camera.core.Camera;
import androidx.camera.core.Logger;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraInternal;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class CameraStateRegistry implements CameraCoordinator.ConcurrentCameraModeListener {
    private static final int MAX_ALLOWED_CONCURRENT_CAMERAS_IN_CONCURRENT_MODE = 2;
    private static final int MAX_ALLOWED_CONCURRENT_CAMERAS_IN_SINGLE_MODE = 1;
    private static final String TAG = "CameraStateRegistry";
    private int mAvailableCameras;
    private final CameraCoordinator mCameraCoordinator;
    private final Map<Camera, CameraRegistration> mCameraStates;
    private final StringBuilder mDebugString = new StringBuilder();
    private final Object mLock;
    private int mMaxAllowedOpenedCameras;

    public interface OnConfigureAvailableListener {
        void onConfigureAvailable();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface OnOpenAvailableListener {
        void onOpenAvailable();
    }

    public CameraStateRegistry(CameraCoordinator cameraCoordinator, int i2) {
        Object obj = new Object();
        this.mLock = obj;
        this.mCameraStates = new HashMap();
        this.mMaxAllowedOpenedCameras = i2;
        synchronized (obj) {
            this.mCameraCoordinator = cameraCoordinator;
            this.mAvailableCameras = this.mMaxAllowedOpenedCameras;
        }
    }

    public void registerCamera(Camera camera, Executor executor, OnConfigureAvailableListener onConfigureAvailableListener, OnOpenAvailableListener onOpenAvailableListener) {
        synchronized (this.mLock) {
            Preconditions.checkState(!this.mCameraStates.containsKey(camera), "Camera is already registered: " + camera);
            this.mCameraStates.put(camera, new CameraRegistration(null, executor, onConfigureAvailableListener, onOpenAvailableListener));
        }
    }

    public boolean tryOpenCamera(Camera camera) {
        boolean z2;
        synchronized (this.mLock) {
            CameraRegistration cameraRegistration = (CameraRegistration) Preconditions.checkNotNull(this.mCameraStates.get(camera), "Camera must first be registered with registerCamera()");
            z2 = false;
            if (Logger.isDebugEnabled(TAG)) {
                this.mDebugString.setLength(0);
                this.mDebugString.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", camera, Integer.valueOf(this.mAvailableCameras), Boolean.valueOf(isOpen(cameraRegistration.getState())), cameraRegistration.getState()));
            }
            if (this.mAvailableCameras > 0 || isOpen(cameraRegistration.getState())) {
                cameraRegistration.setState(CameraInternal.State.OPENING);
                traceState(camera, CameraInternal.State.OPENING);
                z2 = true;
            }
            if (Logger.isDebugEnabled(TAG)) {
                this.mDebugString.append(String.format(Locale.US, " --> %s", z2 ? "SUCCESS" : "FAIL"));
                Logger.d(TAG, this.mDebugString.toString());
            }
            if (z2) {
                recalculateAvailableCameras();
            }
        }
        return z2;
    }

    public boolean tryOpenCaptureSession(String str, String str2) {
        synchronized (this.mLock) {
            boolean z2 = true;
            if (this.mCameraCoordinator.getCameraOperatingMode() != 2) {
                return true;
            }
            CameraRegistration cameraRegistration = getCameraRegistration(str);
            CameraInternal.State state = cameraRegistration != null ? cameraRegistration.getState() : null;
            CameraRegistration cameraRegistration2 = str2 != null ? getCameraRegistration(str2) : null;
            CameraInternal.State state2 = cameraRegistration2 != null ? cameraRegistration2.getState() : null;
            boolean z3 = CameraInternal.State.OPEN.equals(state) || CameraInternal.State.CONFIGURED.equals(state);
            boolean z4 = CameraInternal.State.OPEN.equals(state2) || CameraInternal.State.CONFIGURED.equals(state2);
            if (!z3 || !z4) {
                z2 = false;
            }
            return z2;
        }
    }

    public void markCameraState(Camera camera, CameraInternal.State state) {
        markCameraState(camera, state, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void markCameraState(androidx.camera.core.Camera r8, androidx.camera.core.impl.CameraInternal.State r9, boolean r10) {
        /*
            r7 = this;
            java.lang.Object r3 = r7.mLock
            monitor-enter(r3)
            int r2 = r7.mAvailableCameras     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraInternal$State r0 = androidx.camera.core.impl.CameraInternal.State.RELEASED     // Catch: java.lang.Throwable -> Lbc
            if (r9 != r0) goto Le
            androidx.camera.core.impl.CameraInternal$State r0 = r7.unregisterCamera(r8)     // Catch: java.lang.Throwable -> Lbc
            goto L12
        Le:
            androidx.camera.core.impl.CameraInternal$State r0 = r7.updateAndVerifyState(r8, r9)     // Catch: java.lang.Throwable -> Lbc
        L12:
            if (r0 != r9) goto L16
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lbc
            return
        L16:
            androidx.camera.core.concurrent.CameraCoordinator r0 = r7.mCameraCoordinator     // Catch: java.lang.Throwable -> Lbc
            int r1 = r0.getCameraOperatingMode()     // Catch: java.lang.Throwable -> Lbc
            r0 = 2
            r4 = 0
            if (r1 != r0) goto L3b
            androidx.camera.core.impl.CameraInternal$State r0 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED     // Catch: java.lang.Throwable -> Lbc
            if (r9 != r0) goto L3b
            androidx.camera.core.CameraInfo r0 = r8.getCameraInfo()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraInfoInternal r0 = (androidx.camera.core.impl.CameraInfoInternal) r0     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r1 = r0.getCameraId()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.concurrent.CameraCoordinator r0 = r7.mCameraCoordinator     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = r0.getPairedConcurrentCameraId(r1)     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L3b
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r6 = r7.getCameraRegistration(r0)     // Catch: java.lang.Throwable -> Lbc
            goto L3c
        L3b:
            r6 = r4
        L3c:
            r0 = 1
            if (r2 >= r0) goto L7c
            int r0 = r7.mAvailableCameras     // Catch: java.lang.Throwable -> Lbc
            if (r0 <= 0) goto L7c
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lbc
            r4.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r0 = r7.mCameraStates     // Catch: java.lang.Throwable -> Lbc
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> Lbc
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Throwable -> Lbc
        L52:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L94
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r0 = r2.getValue()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r0 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r0     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraInternal$State r1 = r0.getState()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraInternal$State r0 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN     // Catch: java.lang.Throwable -> Lbc
            if (r1 != r0) goto L52
            java.lang.Object r1 = r2.getKey()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.Camera r1 = (androidx.camera.core.Camera) r1     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r0 = r2.getValue()     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r0 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r0     // Catch: java.lang.Throwable -> Lbc
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> Lbc
            goto L52
        L7c:
            androidx.camera.core.impl.CameraInternal$State r0 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN     // Catch: java.lang.Throwable -> Lbc
            if (r9 != r0) goto L94
            int r0 = r7.mAvailableCameras     // Catch: java.lang.Throwable -> Lbc
            if (r0 <= 0) goto L94
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lbc
            r4.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.util.Map<androidx.camera.core.Camera, androidx.camera.core.impl.CameraStateRegistry$CameraRegistration> r0 = r7.mCameraStates     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> Lbc
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r0 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r0     // Catch: java.lang.Throwable -> Lbc
            r4.put(r8, r0)     // Catch: java.lang.Throwable -> Lbc
        L94:
            if (r4 == 0) goto L9b
            if (r10 != 0) goto L9b
            r4.remove(r8)     // Catch: java.lang.Throwable -> Lbc
        L9b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lbc
            if (r4 == 0) goto Lb6
            java.util.Collection r0 = r4.values()
            java.util.Iterator r1 = r0.iterator()
        La6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r0 = r1.next()
            androidx.camera.core.impl.CameraStateRegistry$CameraRegistration r0 = (androidx.camera.core.impl.CameraStateRegistry.CameraRegistration) r0
            r0.notifyOnOpenAvailableListener()
            goto La6
        Lb6:
            if (r6 == 0) goto Lbb
            r6.notifyOnConfigureAvailableListener()
        Lbb:
            return
        Lbc:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lbc
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.CameraStateRegistry.markCameraState(androidx.camera.core.Camera, androidx.camera.core.impl.CameraInternal$State, boolean):void");
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener
    public void onCameraOperatingModeUpdated(int i2, int i3) {
        synchronized (this.mLock) {
            this.mMaxAllowedOpenedCameras = i3 == 2 ? 2 : 1;
            boolean z2 = i2 != 2 && i3 == 2;
            boolean z3 = i2 == 2 && i3 != 2;
            if (z2 || z3) {
                recalculateAvailableCameras();
            }
        }
    }

    private CameraInternal.State unregisterCamera(Camera camera) {
        CameraRegistration cameraRegistrationRemove = this.mCameraStates.remove(camera);
        if (cameraRegistrationRemove == null) {
            return null;
        }
        recalculateAvailableCameras();
        return cameraRegistrationRemove.getState();
    }

    private CameraInternal.State updateAndVerifyState(Camera camera, CameraInternal.State state) {
        CameraInternal.State state2 = ((CameraRegistration) Preconditions.checkNotNull(this.mCameraStates.get(camera), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).setState(state);
        if (state == CameraInternal.State.OPENING) {
            Preconditions.checkState(isOpen(state) || state2 == CameraInternal.State.OPENING, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (state2 != state) {
            traceState(camera, state);
            recalculateAvailableCameras();
        }
        return state2;
    }

    private static boolean isOpen(CameraInternal.State state) {
        return state != null && state.holdsCameraSlot();
    }

    private void recalculateAvailableCameras() {
        if (Logger.isDebugEnabled(TAG)) {
            this.mDebugString.setLength(0);
            this.mDebugString.append("Recalculating open cameras:\n");
            this.mDebugString.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.mDebugString.append("-------------------------------------------------------------------\n");
        }
        int i2 = 0;
        for (Map.Entry<Camera, CameraRegistration> entry : this.mCameraStates.entrySet()) {
            if (Logger.isDebugEnabled(TAG)) {
                this.mDebugString.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().getState() != null ? entry.getValue().getState().toString() : "UNKNOWN"));
            }
            if (isOpen(entry.getValue().getState())) {
                i2++;
            }
        }
        if (Logger.isDebugEnabled(TAG)) {
            this.mDebugString.append("-------------------------------------------------------------------\n");
            this.mDebugString.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i2), Integer.valueOf(this.mMaxAllowedOpenedCameras)));
            Logger.d(TAG, this.mDebugString.toString());
        }
        this.mAvailableCameras = Math.max(this.mMaxAllowedOpenedCameras - i2, 0);
    }

    public boolean isCameraClosing() {
        synchronized (this.mLock) {
            Iterator<Map.Entry<Camera, CameraRegistration>> it = this.mCameraStates.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().getState() == CameraInternal.State.CLOSING) {
                    return true;
                }
            }
            return false;
        }
    }

    private CameraRegistration getCameraRegistration(String str) {
        for (Camera camera : this.mCameraStates.keySet()) {
            if (str.equals(((CameraInfoInternal) camera.getCameraInfo()).getCameraId())) {
                return this.mCameraStates.get(camera);
            }
        }
        return null;
    }

    /* JADX INFO: loaded from: classes2.dex */
    private static class CameraRegistration {
        private final Executor mNotifyExecutor;
        private final OnConfigureAvailableListener mOnConfigureAvailableListener;
        private final OnOpenAvailableListener mOnOpenAvailableListener;
        private CameraInternal.State mState;

        CameraRegistration(CameraInternal.State state, Executor executor, OnConfigureAvailableListener onConfigureAvailableListener, OnOpenAvailableListener onOpenAvailableListener) {
            this.mState = state;
            this.mNotifyExecutor = executor;
            this.mOnConfigureAvailableListener = onConfigureAvailableListener;
            this.mOnOpenAvailableListener = onOpenAvailableListener;
        }

        CameraInternal.State setState(CameraInternal.State state) {
            CameraInternal.State state2 = this.mState;
            this.mState = state;
            return state2;
        }

        CameraInternal.State getState() {
            return this.mState;
        }

        void notifyOnConfigureAvailableListener() {
            try {
                Executor executor = this.mNotifyExecutor;
                final OnConfigureAvailableListener onConfigureAvailableListener = this.mOnConfigureAvailableListener;
                Objects.requireNonNull(onConfigureAvailableListener);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.CameraStateRegistry$CameraRegistration$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        onConfigureAvailableListener.onConfigureAvailable();
                    }
                });
            } catch (RejectedExecutionException e2) {
                Logger.e(CameraStateRegistry.TAG, "Unable to notify camera to configure.", e2);
            }
        }

        void notifyOnOpenAvailableListener() {
            try {
                Executor executor = this.mNotifyExecutor;
                final OnOpenAvailableListener onOpenAvailableListener = this.mOnOpenAvailableListener;
                Objects.requireNonNull(onOpenAvailableListener);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.CameraStateRegistry$CameraRegistration$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        onOpenAvailableListener.onOpenAvailable();
                    }
                });
            } catch (RejectedExecutionException e2) {
                Logger.e(CameraStateRegistry.TAG, "Unable to notify camera to open.", e2);
            }
        }
    }

    private static void traceState(Camera camera, CameraInternal.State state) {
        if (Trace.isEnabled()) {
            Trace.setCounter("CX:State[" + camera + "]", state.ordinal());
        }
    }
}
