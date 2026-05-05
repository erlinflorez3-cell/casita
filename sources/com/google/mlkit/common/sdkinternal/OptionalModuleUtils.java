package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_common.zzah;
import com.google.android.gms.internal.mlkit_common.zzai;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes7.dex */
public class OptionalModuleUtils {
    public static final String BARCODE = "barcode";
    public static final String BARCODE_MODULE_ID = "com.google.android.gms.vision.barcode";
    public static final String CUSTOM_ICA = "custom_ica";
    public static final String CUSTOM_ICA_MODULE_ID = "com.google.android.gms.vision.custom.ica";
    public static final String DEPRECATED_DYNAMITE_MODULE_ID = "com.google.android.gms.vision.dynamite";
    public static final String DOCSCAN_CROP_MODULE_ID = "com.google.android.gms.mlkit_docscan_crop";
    public static final String DOCSCAN_DETECT_MODULE_ID = "com.google.android.gms.mlkit_docscan_detect";
    public static final String DOCSCAN_ENHANCE_MODULE_ID = "com.google.android.gms.mlkit_docscan_enhance";
    public static final String DOCSCAN_SHADOW_REMOVAL_MODULE_ID = "com.google.android.gms.mlkit_docscan_shadow";
    public static final String DOCSCAN_STAIN_REMOVAL_MODULE_ID = "com.google.android.gms.mlkit_docscan_stain";
    public static final Feature[] EMPTY_FEATURES = new Feature[0];
    public static final String FACE = "face";
    public static final String FACE_MODULE_ID = "com.google.android.gms.vision.face";
    public static final Feature FEATURE_BARCODE;
    public static final Feature FEATURE_CUSTOM_ICA;
    public static final Feature FEATURE_DOCSCAN_CROP;
    public static final Feature FEATURE_DOCSCAN_DETECT;
    public static final Feature FEATURE_DOCSCAN_ENHANCE;
    public static final Feature FEATURE_DOCSCAN_SHADOW_REMOVAL;
    public static final Feature FEATURE_DOCSCAN_STAIN_REMOVAL;
    public static final Feature FEATURE_DOCSCAN_UI;
    public static final Feature FEATURE_FACE;
    public static final Feature FEATURE_ICA;
    public static final Feature FEATURE_IMAGE_CAPTION;
    public static final Feature FEATURE_IMAGE_QUALITY_AESTHETIC;
    public static final Feature FEATURE_IMAGE_QUALITY_TECHNICAL;
    public static final Feature FEATURE_LANGID;
    public static final Feature FEATURE_MLKIT_BARCODE_UI;
    public static final Feature FEATURE_NLCLASSIFIER;
    public static final Feature FEATURE_OCR;
    public static final Feature FEATURE_OCR_CHINESE;
    public static final Feature FEATURE_OCR_COMMON;
    public static final Feature FEATURE_OCR_DEVANAGARI;
    public static final Feature FEATURE_OCR_JAPANESE;
    public static final Feature FEATURE_OCR_KOREAN;
    public static final Feature FEATURE_SMART_REPLY;
    public static final Feature FEATURE_SUBJECT_SEGMENTATION;
    public static final Feature FEATURE_TFLITE_DYNAMITE;
    public static final String ICA = "ica";
    public static final String ICA_MODULE_ID = "com.google.android.gms.vision.ica";
    public static final String IMAGE_CAPTION_MODULE_ID = "com.google.android.gms.mlkit_image_caption";
    public static final String IMAGE_QUALITY_AESTHETIC_MODULE_ID = "com.google.android.gms.mlkit_quality_aesthetic";
    public static final String IMAGE_QUALITY_TECHNICAL_MODULE_ID = "com.google.android.gms.mlkit_quality_technical";
    public static final String LANGID = "langid";
    public static final String LANGID_MODULE_ID = "com.google.android.gms.mlkit.langid";
    public static final String MLKIT_BARCODE_UI = "barcode_ui";
    public static final String NLCLASSIFIER = "nlclassifier";
    public static final String NLCLASSIFIER_MODULE_ID = "com.google.android.gms.mlkit.nlclassifier";
    public static final String OCR = "ocr";
    public static final String OCR_CHINESE_MODULE_ID = "com.google.android.gms.mlkit_ocr_chinese";
    public static final String OCR_COMMON_MODULE_ID = "com.google.android.gms.mlkit_ocr_common";
    public static final String OCR_DEVANAGARI_MODULE_ID = "com.google.android.gms.mlkit_ocr_devanagari";
    public static final String OCR_JAPANESE_MODULE_ID = "com.google.android.gms.mlkit_ocr_japanese";
    public static final String OCR_KOREAN_MODULE_ID = "com.google.android.gms.mlkit_ocr_korean";
    public static final String OCR_MODULE_ID = "com.google.android.gms.vision.ocr";
    public static final String SMART_REPLY = "smart_reply";
    public static final String SMART_REPLY_MODULE_ID = "com.google.android.gms.mlkit_smartreply";
    public static final String SUBJECT_SEGMENTATION_MODULE_ID = "com.google.android.gms.mlkit_subject_segmentation";
    public static final String TFLITE_DYNAMITE = "tflite_dynamite";
    public static final String TFLITE_DYNAMITE_MODULE_ID = "com.google.android.gms.tflite_dynamite";
    private static final zzai zza;
    private static final zzai zzb;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        FEATURE_BARCODE = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        FEATURE_CUSTOM_ICA = feature2;
        Feature feature3 = new Feature("vision.face", 1L);
        FEATURE_FACE = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        FEATURE_ICA = feature4;
        Feature feature5 = new Feature("vision.ocr", 1L);
        FEATURE_OCR = feature5;
        FEATURE_OCR_CHINESE = new Feature("mlkit.ocr.chinese", 1L);
        FEATURE_OCR_COMMON = new Feature("mlkit.ocr.common", 1L);
        FEATURE_OCR_DEVANAGARI = new Feature("mlkit.ocr.devanagari", 1L);
        FEATURE_OCR_JAPANESE = new Feature("mlkit.ocr.japanese", 1L);
        FEATURE_OCR_KOREAN = new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        FEATURE_LANGID = feature6;
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        FEATURE_NLCLASSIFIER = feature7;
        Feature feature8 = new Feature(TFLITE_DYNAMITE, 1L);
        FEATURE_TFLITE_DYNAMITE = feature8;
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        FEATURE_MLKIT_BARCODE_UI = feature9;
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        FEATURE_SMART_REPLY = feature10;
        FEATURE_IMAGE_CAPTION = new Feature("mlkit.image.caption", 1L);
        FEATURE_DOCSCAN_DETECT = new Feature("mlkit.docscan.detect", 1L);
        FEATURE_DOCSCAN_CROP = new Feature("mlkit.docscan.crop", 1L);
        FEATURE_DOCSCAN_ENHANCE = new Feature("mlkit.docscan.enhance", 1L);
        FEATURE_DOCSCAN_UI = new Feature("mlkit.docscan.ui", 1L);
        FEATURE_DOCSCAN_STAIN_REMOVAL = new Feature("mlkit.docscan.stain", 1L);
        FEATURE_DOCSCAN_SHADOW_REMOVAL = new Feature("mlkit.docscan.shadow", 1L);
        FEATURE_IMAGE_QUALITY_AESTHETIC = new Feature("mlkit.quality.aesthetic", 1L);
        FEATURE_IMAGE_QUALITY_TECHNICAL = new Feature("mlkit.quality.technical", 1L);
        FEATURE_SUBJECT_SEGMENTATION = new Feature("mlkit.segmentation.subject", 1L);
        zzah zzahVar = new zzah();
        zzahVar.zza(BARCODE, feature);
        zzahVar.zza(CUSTOM_ICA, feature2);
        zzahVar.zza(FACE, feature3);
        zzahVar.zza(ICA, feature4);
        zzahVar.zza(OCR, feature5);
        zzahVar.zza(LANGID, feature6);
        zzahVar.zza(NLCLASSIFIER, feature7);
        zzahVar.zza(TFLITE_DYNAMITE, feature8);
        zzahVar.zza(MLKIT_BARCODE_UI, feature9);
        zzahVar.zza(SMART_REPLY, feature10);
        zza = zzahVar.zzb();
        zzah zzahVar2 = new zzah();
        zzahVar2.zza(BARCODE_MODULE_ID, feature);
        zzahVar2.zza(CUSTOM_ICA_MODULE_ID, feature2);
        zzahVar2.zza(FACE_MODULE_ID, feature3);
        zzahVar2.zza(ICA_MODULE_ID, feature4);
        zzahVar2.zza(OCR_MODULE_ID, feature5);
        zzahVar2.zza(LANGID_MODULE_ID, feature6);
        zzahVar2.zza(NLCLASSIFIER_MODULE_ID, feature7);
        zzahVar2.zza(TFLITE_DYNAMITE_MODULE_ID, feature8);
        zzahVar2.zza(SMART_REPLY_MODULE_ID, feature10);
        zzb = zzahVar2.zzb();
    }

    private OptionalModuleUtils() {
    }

    @Deprecated
    public static boolean areAllRequiredModulesAvailable(Context context, List<String> list) throws Throwable {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            return areAllRequiredModulesAvailable(context, zza(zzb, list));
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, it.next());
            }
            return true;
        } catch (DynamiteModule.LoadingException unused) {
            return false;
        }
    }

    public static boolean areAllRequiredModulesAvailable(Context context, final Feature[] featureArr) {
        try {
            return ((ModuleAvailabilityResponse) Tasks.await(ModuleInstall.getClient(context).areModulesAvailable(new OptionalModuleApi() { // from class: com.google.mlkit.common.sdkinternal.zzq
                @Override // com.google.android.gms.common.api.OptionalModuleApi
                public final Feature[] getOptionalFeatures() {
                    Feature[] featureArr2 = OptionalModuleUtils.EMPTY_FEATURES;
                    return featureArr;
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.common.sdkinternal.zzr
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                }
            }))).areModulesAvailable();
        } catch (InterruptedException | ExecutionException e2) {
            return false;
        }
    }

    @Deprecated
    public static void requestDownload(Context context, String str) throws Throwable {
        requestDownload(context, zzaf.zzh(str));
    }

    @Deprecated
    public static void requestDownload(Context context, List<String> list) throws Throwable {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            requestDownload(context, zza(zza, list));
            return;
        }
        Intent intent = new Intent();
        short sXd = (short) (ZN.Xd() ^ 29852);
        short sXd2 = (short) (ZN.Xd() ^ 10803);
        int[] iArr = new int["t\u007f|<t{zqum5gshuqjd-ejo".length()];
        QB qb = new QB("t\u007f|<t{zqum5gshuqjd-ejo");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        short sXd3 = (short) (ZN.Xd() ^ 8539);
        int[] iArr2 = new int["x\u0004\u0001@x\u007f~uyq9kwlyunh1ins-tfodig&;[eYaVV^Rg/^ZKMKHYY6HEFIUCO,MIQQ".length()];
        QB qb2 = new QB("x\u0004\u0001@x\u007f~uyq9kwlyunh1ins-tfodig&;[eYaVV^Rg/^ZKMKHYY6HEFIUCO,MIQQ");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        intent.setClassName(str, new String(iArr2, 0, i3));
        short sXd4 = (short) (C1607wl.Xd() ^ 2515);
        int[] iArr3 = new int["!,-l)03*\"\u001ae\u0018(\u001d.*71}6?D\u0002I/8168v\u0010\u0010.\".#'/'<".length()];
        QB qb3 = new QB("!,-l)03*\"\u001ae\u0018(\u001d.*71}6?D\u0002I/8168v\u0010\u0010.\".#'/'<");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 ^ i4));
            i4++;
        }
        intent.setAction(new String(iArr3, 0, i4));
        intent.putExtra(Xg.qd("\u0013 \u001f`\u001b$%\u001e$\u001eg\u001c*!0.)%o*18s=1<3::z\u0012\u0014 \u0016 \u0017\u0019#\u0019 \u001d,", (short) (FB.Xd() ^ 12770), (short) (FB.Xd() ^ 15886)), TextUtils.join(C1561oA.Yd(com.biocatch.client.android.sdk.core.Constants.FLUSH_KEY, (short) (Od.Xd() ^ (-6703))), list));
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("gqfkg`b+Wb`o]]b\u001b7b`]Og`", (short) (C1633zX.Xd() ^ (-9909)), (short) (C1633zX.Xd() ^ (-30962)))).getMethod(ZO.xd("scd\f.0/{]H8o)ZW0P\u0006", (short) (C1607wl.Xd() ^ 20106), (short) (C1607wl.Xd() ^ 20444)), new Class[0]);
        try {
            method.setAccessible(true);
            intent.putExtra(C1626yg.Ud("4\u0012^\u001f@t\u0015Y\u0007cv>T,twKQ\u0017\u000e\u001e", (short) (C1607wl.Xd() ^ 32409), (short) (C1607wl.Xd() ^ 20622)), ((ApplicationInfo) method.invoke(context, objArr)).packageName);
            short sXd5 = (short) (C1580rY.Xd() ^ (-13340));
            int[] iArr4 = new int["'\b\nFb\u0017c$\u0002D;I\u000b \u007fYEa'#L*B".length()];
            QB qb4 = new QB("'\b\nFb\u0017c$\u0002D;I\u000b \u007fYEa'#L*B");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd5 + i5)));
                i5++;
            }
            Class<?> cls = Class.forName(new String(iArr4, 0, i5));
            Class<?>[] clsArr = new Class[1];
            short sXd6 = (short) (C1580rY.Xd() ^ (-5983));
            int[] iArr5 = new int["T\u0011t^;\u0013&\u0007\fWP<x\u0010\u0012-\u00065r\u0010X\u0002".length()];
            QB qb5 = new QB("T\u0011t^;\u0013&\u0007\fWP<x\u0010\u0012-\u00065r\u0010X\u0002");
            int i6 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i6] = xuXd5.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + i6)) + xuXd5.CK(iKK5));
                i6++;
            }
            clsArr[0] = Class.forName(new String(iArr5, 0, i6));
            Object[] objArr2 = {intent};
            Method method2 = cls.getMethod(C1561oA.Qd("'\u0018 \u0015q!\u001d\u000e\u0010\u000e\u000b\u001c\u001c", (short) (C1580rY.Xd() ^ (-19619))), clsArr);
            try {
                method2.setAccessible(true);
                method2.invoke(context, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static void requestDownload(Context context, final Feature[] featureArr) {
        ModuleInstall.getClient(context).installModules(ModuleInstallRequest.newBuilder().addApi(new OptionalModuleApi() { // from class: com.google.mlkit.common.sdkinternal.zzo
            @Override // com.google.android.gms.common.api.OptionalModuleApi
            public final Feature[] getOptionalFeatures() {
                Feature[] featureArr2 = OptionalModuleUtils.EMPTY_FEATURES;
                return featureArr;
            }
        }).build()).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.common.sdkinternal.zzp
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
            }
        });
    }

    private static Feature[] zza(Map map, List list) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            featureArr[i2] = (Feature) Preconditions.checkNotNull((Feature) map.get(list.get(i2)));
        }
        return featureArr;
    }
}
