package com.facetec.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import com.facetec.sdk.FaceTecVocalGuidanceCustomization;

/* JADX INFO: loaded from: classes3.dex */
final class bg {
    static SharedPreferences B = null;
    private static MediaPlayer C = null;
    private static MediaPlayer Code = null;
    private static MediaPlayer D = null;
    private static MediaPlayer I = null;
    private static MediaPlayer L = null;
    static boolean V = false;
    private static MediaPlayer Z = null;

    /* JADX INFO: renamed from: com.facetec.sdk.bg$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] B;

        static {
            int[] iArr = new int[V.values().length];
            B = iArr;
            try {
                iArr[V.GET_READY_PRESS_BUTTON_TAPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                B[V.GET_READY_PRESS_BUTTON_DELAYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                B[V.RETRY_PRESS_BUTTON_TAPPING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                B[V.GET_READY_FRAME_YOUR_FACE_TAPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                B[V.GET_READY_FRAME_YOUR_FACE_AUTOMATIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                B[V.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                B[V.FACE_CAPTURE_FRAME_YOUR_FACE_DELAYED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                B[V.FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                B[V.FACE_CAPTURE_ZOOMED_MOVE_CLOSER_TAPPING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                B[V.FACE_CAPTURE_MOVE_CLOSER_AUTOMATIC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                B[V.FACE_CAPTURE_MOVE_CLOSER_DELAYED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                B[V.SUCCESS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                B[V.UPLOADING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                B[V.RETRY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    enum V {
        GET_READY_PRESS_BUTTON_TAPPING("GET_READY_PRESS_BUTTON_TAPPING"),
        GET_READY_FRAME_YOUR_FACE_TAPPING("GET_READY_FRAME_YOUR_FACE_TAPPING"),
        GET_READY_PRESS_BUTTON_DELAYED("GET_READY_PRESS_BUTTON_DELAYED"),
        GET_READY_FRAME_YOUR_FACE_AUTOMATIC("GET_READY_FRAME_YOUR_FACE_AUTOMATIC"),
        RETRY_PRESS_BUTTON_TAPPING("RETRY_PRESS_BUTTON_TAPPING"),
        FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING("FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING"),
        FACE_CAPTURE_FRAME_YOUR_FACE_DELAYED("FACE_CAPTURE_FRAME_YOUR_FACE_DELAYED"),
        FACE_CAPTURE_ZOOMED_MOVE_CLOSER_TAPPING("FACE_CAPTURE_ZOOMED_MOVE_CLOSER_TAPPING"),
        FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING("FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING"),
        FACE_CAPTURE_MOVE_CLOSER_AUTOMATIC("FACE_CAPTURE_MOVE_CLOSER_AUTOMATIC"),
        FACE_CAPTURE_MOVE_CLOSER_DELAYED("FACE_CAPTURE_MOVE_CLOSER_DELAYED"),
        SUCCESS("SUCCESS"),
        UPLOADING("UPLOADING"),
        RETRY("RETRY");


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f2993d;

        V(String str) {
            this.f2993d = str;
        }

        final String B() {
            return this.f2993d;
        }
    }

    bg() {
    }

    static void B(Context context) throws Throwable {
        if (FaceTecSDK.V.vocalGuidanceCustomization.pleaseFrameYourFaceInTheOvalSoundFile == -1) {
            Z = MediaPlayer.create(context, R.raw.facetec_internal_please_frame_your_face_sound_file);
        } else {
            Z = MediaPlayer.create(context, FaceTecSDK.V.vocalGuidanceCustomization.pleaseFrameYourFaceInTheOvalSoundFile);
        }
        if (FaceTecSDK.V.vocalGuidanceCustomization.pleaseMoveCloserSoundFile == -1) {
            Code = MediaPlayer.create(context, R.raw.facetec_internal_please_move_closer_sound_file);
        } else {
            Code = MediaPlayer.create(context, FaceTecSDK.V.vocalGuidanceCustomization.pleaseMoveCloserSoundFile);
        }
        if (FaceTecSDK.V.vocalGuidanceCustomization.pleaseRetrySoundFile == -1) {
            I = MediaPlayer.create(context, R.raw.facetec_internal_please_retry_sound_file);
        } else {
            I = MediaPlayer.create(context, FaceTecSDK.V.vocalGuidanceCustomization.pleaseRetrySoundFile);
        }
        if (FaceTecSDK.V.vocalGuidanceCustomization.uploadingSoundFile == -1) {
            C = MediaPlayer.create(context, R.raw.facetec_internal_uploading_sound_file);
        } else {
            C = MediaPlayer.create(context, FaceTecSDK.V.vocalGuidanceCustomization.uploadingSoundFile);
        }
        if (FaceTecSDK.V.vocalGuidanceCustomization.facescanSuccessfulSoundFile == -1) {
            L = MediaPlayer.create(context, R.raw.facetec_internal_facescan_successful_sound_file);
        } else {
            L = MediaPlayer.create(context, FaceTecSDK.V.vocalGuidanceCustomization.facescanSuccessfulSoundFile);
        }
        if (FaceTecSDK.V.vocalGuidanceCustomization.pleasePressTheButtonToStartSoundFile == -1) {
            D = MediaPlayer.create(context, R.raw.facetec_internal_please_press_button_sound_file);
        } else {
            D = MediaPlayer.create(context, FaceTecSDK.V.vocalGuidanceCustomization.pleasePressTheButtonToStartSoundFile);
        }
        SharedPreferences sharedPreferencesC = n.C(context);
        B = sharedPreferencesC;
        V = sharedPreferencesC.getBoolean("facetecMoveCloserSoundHasBeenPlayed", false);
    }

    static void B(Context context, V v2) {
        if (be.Code || B() || Code() || FaceTecSDK.V.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE) {
            return;
        }
        switch (AnonymousClass1.B[v2.ordinal()]) {
            case 1:
            case 2:
            case 3:
                D.start();
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                Z.start();
                break;
            case 9:
            case 10:
            case 11:
                Code.start();
                break;
            case 12:
                L.start();
                break;
            case 13:
                C.start();
                break;
            case 14:
                I.start();
                break;
        }
        a.V(context, v2);
    }

    private static boolean B() {
        return Z == null || Code == null || I == null || C == null || L == null || D == null;
    }

    private static boolean Code() {
        return Z.isPlaying() || Code.isPlaying() || I.isPlaying() || C.isPlaying() || L.isPlaying() || D.isPlaying();
    }

    static void V() {
        MediaPlayer mediaPlayer = Z;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            Z = null;
        }
        MediaPlayer mediaPlayer2 = Code;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            Code = null;
        }
        MediaPlayer mediaPlayer3 = I;
        if (mediaPlayer3 != null) {
            mediaPlayer3.release();
            I = null;
        }
        MediaPlayer mediaPlayer4 = D;
        if (mediaPlayer4 != null) {
            mediaPlayer4.release();
            D = null;
        }
        MediaPlayer mediaPlayer5 = C;
        if (mediaPlayer5 != null) {
            mediaPlayer5.release();
            C = null;
        }
        MediaPlayer mediaPlayer6 = L;
        if (mediaPlayer6 != null) {
            mediaPlayer6.release();
            L = null;
        }
        if (B != null) {
            L = null;
        }
    }
}
