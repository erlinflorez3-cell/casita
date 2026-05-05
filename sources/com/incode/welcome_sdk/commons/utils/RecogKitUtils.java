package com.incode.welcome_sdk.commons.utils;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import com.incode.recogkitandroid.BuildConfigUtils;
import com.incode.recogkitandroid.Face;
import com.incode.recogkitandroid.RecogKitAndroid;
import com.incode.recogkitandroid.RecogKitIncorrectTemplateException;
import com.incode.recogkitandroid.RecogKitInvalidInputException;
import com.incode.recogkitandroid.RecogKitProcessException;
import com.incode.recogkitandroid.RecogKitTemplateSetFullException;
import com.incode.welcome_sdk.commons.utils.FaceProcessingUtils;
import com.incode.welcome_sdk.data.RecognitionFaceInfo;
import com.incode.welcome_sdk.data.TemplateModel;
import com.incode.welcome_sdk.data.local.FaceInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.msgpack.core.MessagePack;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class RecogKitUtils {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f6330b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6331c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6332e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, int r9, int r10) {
        /*
            int r8 = r8 * 3
            int r2 = r8 + 1
            int r0 = r9 * 2
            int r0 = r0 + 117
            int r1 = r10 * 2
            int r7 = 4 - r1
            byte[] r6 = com.incode.welcome_sdk.commons.utils.RecogKitUtils.$$a
            byte[] r5 = new byte[r2]
            r4 = 0
            if (r6 != 0) goto L2d
            r3 = r8
            r1 = r7
            r2 = r4
        L16:
            int r7 = r7 + r3
            int r1 = r1 + 1
            r0 = r7
            r7 = r1
        L1b:
            byte r1 = (byte) r0
            r5[r2] = r1
            if (r2 != r8) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            int r2 = r2 + 1
            r3 = r6[r7]
            r1 = r7
            r7 = r0
            goto L16
        L2d:
            r2 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.RecogKitUtils.$$c(byte, int, int):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{64, MessagePack.Code.INT32, -98, Ascii.DC2};
        $$b = 45;
    }

    public static boolean isFullRecogKitAvailable() {
        int i2 = 2 % 2;
        int i3 = f6332e + 63;
        f6331c = i3 % 128;
        if (i3 % 2 == 0) {
            return BuildConfigUtils.isFullRecogKitAvailable();
        }
        BuildConfigUtils.isFullRecogKitAvailable();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TemplateModel getTemplateFromDetectionData(RecogKitAndroid recogKitAndroid, FaceProcessingUtils.DetectionData detectionData) {
        int i2 = 2 % 2;
        RecognitionFaceInfo faceInfoFromDetectionData = getFaceInfoFromDetectionData(recogKitAndroid, detectionData);
        if (faceInfoFromDetectionData == null) {
            int i3 = f6331c + 61;
            f6332e = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        TemplateModel templateModel = new TemplateModel(faceInfoFromDetectionData.getTemplateId(), faceInfoFromDetectionData.getTemplate());
        int i4 = f6332e + 91;
        f6331c = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return templateModel;
    }

    public static RecognitionFaceInfo getFaceInfoFromDetectionData(RecogKitAndroid recogKitAndroid, FaceProcessingUtils.DetectionData detectionData) {
        int i2 = 2 % 2;
        int i3 = f6332e;
        int i4 = i3 + 21;
        f6331c = i4 % 128;
        int i5 = i4 % 2;
        if (detectionData != null) {
            return createFaceInfo(recogKitAndroid, detectionData.bitmap, detectionData.face, detectionData.faceLandmarksState, 1);
        }
        int i6 = i3 + 31;
        int i7 = i6 % 128;
        f6331c = i7;
        Object obj = null;
        if (i6 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i8 = i7 + 51;
        f6332e = i8 % 128;
        if (i8 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $11 + 109;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
            charArray = str2 != null ? str2.toCharArray() : str2;
        } else {
            if (str2 != null) {
            }
        }
        com.c.a.k kVar = new com.c.a.k();
        char[] cArrE = com.c.a.k.e(f6330b ^ (-3501477462694648052L), (char[]) charArray, i2);
        kVar.f2772b = 4;
        while (kVar.f2772b < cArrE.length) {
            int i6 = $11 + 37;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            kVar.f2773d = kVar.f2772b - 4;
            int i8 = kVar.f2772b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrE[kVar.f2772b] ^ cArrE[kVar.f2772b % 4]), Long.valueOf(kVar.f2773d), Long.valueOf(f6330b)};
                Object objC = com.c.a.e.e.c(1215460496);
                if (objC == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objC = com.c.a.e.e.e((char) (Color.rgb(0, 0, 0) + 16777308), 20 - View.getDefaultSize(0, 0), 1107 - (ViewConfiguration.getEdgeSlop() >> 16), 1223194345, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrE[i8] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {kVar, kVar};
                Object objC2 = com.c.a.e.e.c(-727400358);
                if (objC2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objC2 = com.c.a.e.e.e((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), Color.rgb(0, 0, 0) + 16777236, 1281 - TextUtils.indexOf((CharSequence) "", '0', 0), -734084573, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objC2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str3 = new String(cArrE, 4, cArrE.length - 4);
        int i9 = $11 + 65;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.incode.welcome_sdk.data.RecognitionFaceInfo predictFaceWithBlocklist(com.incode.recogkitandroid.RecogKitAndroid r11, com.incode.welcome_sdk.data.RecognitionFaceInfo r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.RecogKitUtils.predictFaceWithBlocklist(com.incode.recogkitandroid.RecogKitAndroid, com.incode.welcome_sdk.data.RecognitionFaceInfo):com.incode.welcome_sdk.data.RecognitionFaceInfo");
    }

    public static RecognitionFaceInfo predictFace(RecogKitAndroid recogKitAndroid, RecognitionFaceInfo recognitionFaceInfo) {
        int i2 = 2 % 2;
        int i3 = f6332e + 55;
        f6331c = i3 % 128;
        int i4 = i3 % 2;
        Timber.v("predictFace called, faceInfo: %s, recogkitAndroid: %s", recognitionFaceInfo, recogKitAndroid);
        if (recognitionFaceInfo == null) {
            int i5 = f6331c + 13;
            f6332e = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        }
        try {
            Timber.d("calling predict", new Object[0]);
            long jCurrentTimeMillis = System.currentTimeMillis();
            String template = recognitionFaceInfo.getTemplate();
            Object[] objArr = new Object[1];
            a("\ue120\ue172ۡ\uda49䆺銅뇣癮談\uf125\uf248䁡ﶖ\ua7e3㭌", -MotionEvent.axisFromString(""), objArr);
            Pair<String, Float> pairPredict = recogKitAndroid.predict(template, ((String) objArr[0]).intern());
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (pairPredict != null) {
                int i6 = f6332e + 27;
                f6331c = i6 % 128;
                int i7 = i6 % 2;
                Timber.d("predictResult: templateId:%s confidence:%s", pairPredict.first, pairPredict.second);
                recognitionFaceInfo.setPredictionTemplateId((String) pairPredict.first);
                recognitionFaceInfo.setPredictionConfidence(((Float) pairPredict.second).floatValue());
                recognitionFaceInfo.setPredictionExecutionTime(jCurrentTimeMillis2);
                recognitionFaceInfo.setTemplateId(UUID.randomUUID().toString());
            } else {
                Timber.w("Recognition template set is empty", new Object[0]);
                int i8 = f6331c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f6332e = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 5;
                }
            }
        } catch (RecogKitIncorrectTemplateException | RecogKitInvalidInputException | RecogKitProcessException e2) {
            Timber.e(e2, "predictFace", new Object[0]);
        }
        return recognitionFaceInfo;
    }

    public static RecognitionFaceInfo correlateFace(RecogKitAndroid recogKitAndroid, RecognitionFaceInfo recognitionFaceInfo) {
        int i2 = 2 % 2;
        int i3 = f6331c + 95;
        f6332e = i3 % 128;
        int i4 = i3 % 2;
        Timber.v("correlateFace called, faceInfo: %s, recogkitAndroid: %s", recognitionFaceInfo, recogKitAndroid);
        if (recognitionFaceInfo == null) {
            int i5 = f6332e + 117;
            f6331c = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }
        try {
            Timber.d("calling predict", new Object[0]);
            long jCurrentTimeMillis = System.currentTimeMillis();
            String template = recognitionFaceInfo.getTemplate();
            Object[] objArr = new Object[1];
            a("⏜⎟ꢚ祃濜㳴猝\ud81d⧔\udf5e兓芝폭\u0992顗", 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            Pair<String, Float> pairPredict = recogKitAndroid.predict(template, ((String) objArr[0]).intern());
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (pairPredict != null) {
                int i6 = f6332e + 85;
                f6331c = i6 % 128;
                int i7 = i6 % 2;
                Timber.d("predictResult: templateId:%s confidence:%s", pairPredict.first, pairPredict.second);
                recognitionFaceInfo.setPredictionTemplateId((String) pairPredict.first);
                recognitionFaceInfo.setPredictionConfidence(((Float) pairPredict.second).floatValue());
                recognitionFaceInfo.setPredictionExecutionTime(jCurrentTimeMillis2);
                recognitionFaceInfo.setTemplateId(UUID.randomUUID().toString());
                if (((Float) pairPredict.second).floatValue() > 0.75f) {
                    try {
                        String template2 = recognitionFaceInfo.getTemplate();
                        String templateId = recognitionFaceInfo.getTemplateId();
                        Object[] objArr2 = new Object[1];
                        a("⏜⎟ꢚ祃濜㳴猝\ud81d⧔\udf5e兓芝폭\u0992顗", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
                        recogKitAndroid.train(template2, templateId, ((String) objArr2[0]).intern());
                        Timber.d("Trained TEMPLATE_CORRELATION_THRESHOLD", new Object[0]);
                    } catch (RecogKitIncorrectTemplateException | RecogKitInvalidInputException | RecogKitProcessException | RecogKitTemplateSetFullException e2) {
                        Timber.e(e2);
                    }
                }
            } else {
                Timber.v("Correlation template set is empty, adding first template", new Object[0]);
                try {
                    recognitionFaceInfo.setTemplateId(UUID.randomUUID().toString());
                    String template3 = recognitionFaceInfo.getTemplate();
                    String templateId2 = recognitionFaceInfo.getTemplateId();
                    Object[] objArr3 = new Object[1];
                    a("⏜⎟ꢚ祃濜㳴猝\ud81d⧔\udf5e兓芝폭\u0992顗", 1 - View.MeasureSpec.getSize(0), objArr3);
                    recogKitAndroid.train(template3, templateId2, ((String) objArr3[0]).intern());
                    recognitionFaceInfo.setPredictionConfidence(-1.0f);
                    Timber.d("Trained empty TEMPLATE_CORRELATION_THRESHOLD", new Object[0]);
                    int i8 = f6332e + 93;
                    f6331c = i8 % 128;
                    int i9 = i8 % 2;
                } catch (RecogKitIncorrectTemplateException | RecogKitInvalidInputException | RecogKitProcessException | RecogKitTemplateSetFullException e3) {
                    Timber.e(e3);
                }
            }
        } catch (RecogKitIncorrectTemplateException | RecogKitInvalidInputException | RecogKitProcessException e4) {
            Timber.e(e4, "correlateFace", new Object[0]);
        }
        int i10 = f6332e + 49;
        f6331c = i10 % 128;
        int i11 = i10 % 2;
        return recognitionFaceInfo;
    }

    public static RecognitionFaceInfo createFaceInfo(RecogKitAndroid recogKitAndroid, Bitmap bitmap, Face face, FaceProcessingUtils.FaceLandmarksState faceLandmarksState, int i2) {
        int i3 = 2 % 2;
        Timber.v("createFaceInfo called, bitmap: %s, recogkitAndroid: %s, face: %s", bitmap, recogKitAndroid, face);
        RecognitionFaceInfo recognitionFaceInfoCreateRecognitionFaceInfo = null;
        try {
            recognitionFaceInfoCreateRecognitionFaceInfo = createRecognitionFaceInfo(recogKitAndroid, bitmap, face, faceLandmarksState, i2);
            if (recognitionFaceInfoCreateRecognitionFaceInfo != null) {
                int i4 = f6331c + 49;
                f6332e = i4 % 128;
                int i5 = i4 % 2;
                recognitionFaceInfoCreateRecognitionFaceInfo.setTemplateId(UUID.randomUUID().toString());
                int i6 = f6332e + 85;
                f6331c = i6 % 128;
                int i7 = i6 % 2;
            }
        } catch (RecogKitInvalidInputException e2) {
            Timber.e(e2, "createFaceInfo", new Object[0]);
        } catch (RecogKitProcessException e3) {
            Timber.e(e3, "createFaceInfo", new Object[0]);
        }
        return recognitionFaceInfoCreateRecognitionFaceInfo;
    }

    public static RecognitionFaceInfo createRecognitionFaceInfo(RecogKitAndroid recogKitAndroid, Bitmap bitmap, Face face, FaceProcessingUtils.FaceLandmarksState faceLandmarksState, int i2) throws RecogKitInvalidInputException, RecogKitProcessException {
        boolean z2;
        float f2;
        float f3;
        int i3 = 2 % 2;
        Timber.d("createRecognitionFaceInfo called", new Object[0]);
        if (bitmap != null) {
            int i4 = f6331c + 125;
            f6332e = i4 % 128;
            int i5 = i4 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        Object obj = null;
        if ((recogKitAndroid != null) & z2) {
            int i6 = f6332e;
            int i7 = i6 + 75;
            f6331c = i7 % 128;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (face != null) {
                int i8 = i6 + 43;
                f6331c = i8 % 128;
                int i9 = i8 % 2;
                Timber.d("createRecognitionFaceInfo faceWidth: %s, faceHeight: %s, x: %s, y: %s, bitmapWidth: %s, bitmapHeight: %s", Integer.valueOf(Math.min(((int) face.rect.width) * i2, bitmap.getWidth())), Integer.valueOf(Math.min(((int) face.rect.height) * i2, bitmap.getHeight())), Integer.valueOf(Math.max(0, ((int) face.rect.f3644x) * i2)), Integer.valueOf(Math.max(0, ((int) face.rect.f3645y) * i2)), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
                float f4 = i2;
                float f5 = faceLandmarksState.rightEye.x * f4;
                float f6 = faceLandmarksState.rightEye.y * f4;
                float f7 = faceLandmarksState.leftEye.x * f4;
                float f8 = faceLandmarksState.leftEye.y * f4;
                if (faceLandmarksState.mouthEdgesDetected()) {
                    float f9 = faceLandmarksState.leftMouth.x * f4;
                    float f10 = faceLandmarksState.leftMouth.y * f4;
                    f2 = ((faceLandmarksState.rightMouth.x * f4) + f9) / 2.0f;
                    f3 = ((faceLandmarksState.rightMouth.y * f4) + f10) / 2.0f;
                } else {
                    f2 = 0.0f;
                    f3 = 0.0f;
                }
                Timber.d("Will call recogKitAndroid.getTemplate()", new Object[0]);
                try {
                    String template = recogKitAndroid.getTemplate(bitmap, f5, f6, f7, f8, f2, f3);
                    Timber.d("getTemplate() finished", new Object[0]);
                    Timber.d("createRecognitionFaceInfo rex: %s, rey: %s, lex: %s, ley: %s, centerMouthX: %s, centerMouthY: %s", Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8), Float.valueOf(f2), Float.valueOf(f3));
                    return new RecognitionFaceInfo(Bitmap.createBitmap(bitmap), template, f5, f6, f7, f8, f2, f3);
                } catch (RecogKitInvalidInputException | RecogKitProcessException e2) {
                    Timber.e(e2, "createRecognitionFaceInfo", new Object[0]);
                }
            }
        }
        Timber.w("createRecognitionFaceInfo returned null", new Object[0]);
        return null;
    }

    public static void clearRecogKitRecognitionSet(RecogKitAndroid recogKitAndroid) {
        String strIntern;
        int i2 = 2 % 2;
        int i3 = f6332e + 123;
        f6331c = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                a("\ue120\ue172ۡ\uda49䆺銅뇣癮談\uf125\uf248䁡ﶖ\ua7e3㭌", -ImageFormat.getBitsPerPixel(0), objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                a("\ue120\ue172ۡ\uda49䆺銅뇣癮談\uf125\uf248䁡ﶖ\ua7e3㭌", -ImageFormat.getBitsPerPixel(0), objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
            recogKitAndroid.clear(strIntern);
            int i4 = f6331c + 29;
            f6332e = i4 % 128;
            int i5 = i4 % 2;
        } catch (RecogKitProcessException e2) {
            e2.printStackTrace();
        }
    }

    public static void trainRecogKitWithFaceInfos(RecogKitAndroid recogKitAndroid, List<FaceInfo> list) {
        int i2 = 2 % 2;
        int i3 = f6331c + 41;
        f6332e = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                a("\ue120\ue172ۡ\uda49䆺銅뇣癮談\uf125\uf248䁡ﶖ\ua7e3㭌", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
                recogKitAndroid.clear(((String) objArr[0]).intern());
            } else {
                Object[] objArr2 = new Object[1];
                a("\ue120\ue172ۡ\uda49䆺銅뇣癮談\uf125\uf248䁡ﶖ\ua7e3㭌", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
                recogKitAndroid.clear(((String) objArr2[0]).intern());
            }
            int i4 = f6332e + 37;
            f6331c = i4 % 128;
            int i5 = i4 % 2;
            for (FaceInfo faceInfo : list) {
                String faceTemplate = faceInfo.getFaceTemplate();
                String templateId = faceInfo.getTemplateId();
                Object[] objArr3 = new Object[1];
                a("\ue120\ue172ۡ\uda49䆺銅뇣癮談\uf125\uf248䁡ﶖ\ua7e3㭌", View.resolveSizeAndState(0, 0, 0) + 1, objArr3);
                recogKitAndroid.train(faceTemplate, templateId, ((String) objArr3[0]).intern());
            }
        } catch (RecogKitIncorrectTemplateException | RecogKitInvalidInputException | RecogKitProcessException | RecogKitTemplateSetFullException e2) {
            Timber.e(e2);
        }
    }

    public static void trainRecogKitWithFaceInfo(RecogKitAndroid recogKitAndroid, FaceInfo faceInfo) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(faceInfo);
        trainRecogKitWithFaceInfos(recogKitAndroid, arrayList);
        int i3 = f6332e + 57;
        f6331c = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Pair<String, Float> predictFaceInfo(RecogKitAndroid recogKitAndroid, String str) {
        String strIntern;
        int i2 = 2 % 2;
        int i3 = f6331c + 97;
        f6332e = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                a("\ue120\ue172ۡ\uda49䆺銅뇣癮談\uf125\uf248䁡ﶖ\ua7e3㭌", 1 >> (ViewConfiguration.getTapTimeout() * 28), objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                a("\ue120\ue172ۡ\uda49䆺銅뇣癮談\uf125\uf248䁡ﶖ\ua7e3㭌", 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
            Pair<String, Float> pairPredict = recogKitAndroid.predict(str, strIntern);
            int i4 = f6331c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f6332e = i4 % 128;
            int i5 = i4 % 2;
            return pairPredict;
        } catch (RecogKitIncorrectTemplateException | RecogKitInvalidInputException | RecogKitProcessException e2) {
            Timber.e(e2);
            return null;
        }
    }

    public static void clearRecogKitBlocklistSet(RecogKitAndroid recogKitAndroid) throws Throwable {
        String strIntern;
        int i2 = 2 % 2;
        int i3 = f6331c + 23;
        f6332e = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                a("\uda0b\uda49脏樌嚉ᕢ諄\uf18b㪎\ue61d䈁筗\ueaa9", (SystemClock.elapsedRealtime() > 1L ? 1 : (SystemClock.elapsedRealtime() == 1L ? 0 : -1)), objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                a("\uda0b\uda49脏樌嚉ᕢ諄\uf18b㪎\ue61d䈁筗\ueaa9", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
            recogKitAndroid.clear(strIntern);
            int i4 = f6331c + 17;
            f6332e = i4 % 128;
            int i5 = i4 % 2;
        } catch (RecogKitProcessException e2) {
            e2.printStackTrace();
        }
    }

    public static void trainRecogKitWithBlocklist(RecogKitAndroid recogKitAndroid, String str, String str2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f6332e + 111;
        f6331c = i3 % 128;
        int i4 = i3 % 2;
        try {
            Object[] objArr = new Object[1];
            a("\uda0b\uda49脏樌嚉ᕢ諄\uf18b㪎\ue61d䈁筗\ueaa9", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr);
            recogKitAndroid.train(str2, str, ((String) objArr[0]).intern());
            int i5 = f6332e + 73;
            f6331c = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f6331c = 0;
        f6332e = 1;
        f6330b = -3479050183834782931L;
    }
}
