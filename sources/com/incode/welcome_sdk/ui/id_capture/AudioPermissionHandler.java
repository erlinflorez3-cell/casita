package com.incode.welcome_sdk.ui.id_capture;

import com.incode.welcome_sdk.ui.id_capture.event.AudioPermissionState;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes5.dex */
public interface AudioPermissionHandler {
    StateFlow<AudioPermissionState> getState();

    boolean isGranted();

    void requestPermission();

    public static final class DefaultImpls {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14501c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14502e = 1;

        public static boolean isGranted(AudioPermissionHandler audioPermissionHandler) {
            int i2 = 2 % 2;
            if (audioPermissionHandler.getState().getValue() != AudioPermissionState.f14988a) {
                return false;
            }
            int i3 = f14502e + 111;
            int i4 = i3 % 128;
            f14501c = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 99;
            f14502e = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 27 / 0;
            }
            return true;
        }
    }
}
