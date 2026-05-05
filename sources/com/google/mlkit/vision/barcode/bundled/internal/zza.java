package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import com.drew.metadata.exif.makernotes.FujifilmMakernoteDirectory;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzam;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzap;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaq;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzar;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzas;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzau;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzav;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzax;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzay;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbe;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbm;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.MultiScaleDecodingOptions;
import com.google.android.libraries.barhopper.MultiScaleDetectionOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.barhopper.deeplearning.BarhopperV3Options;
import com.google.barhopper.deeplearning.zzab;
import com.google.barhopper.deeplearning.zzac;
import com.google.barhopper.deeplearning.zze;
import com.google.barhopper.deeplearning.zzf;
import com.google.barhopper.deeplearning.zzh;
import com.google.barhopper.deeplearning.zzi;
import com.google.barhopper.deeplearning.zzk;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.photos.vision.barhopper.BarhopperProto$BarhopperResponse;
import com.google.photos.vision.barhopper.zzae;
import com.google.photos.vision.barhopper.zzaf;
import com.google.photos.vision.barhopper.zzah;
import com.google.photos.vision.barhopper.zzak;
import com.google.photos.vision.barhopper.zzb;
import com.google.photos.vision.barhopper.zzc;
import com.google.photos.vision.barhopper.zzl;
import com.google.photos.vision.barhopper.zzn;
import com.google.photos.vision.barhopper.zzp;
import com.google.photos.vision.barhopper.zzr;
import com.google.photos.vision.barhopper.zzv;
import com.google.photos.vision.barhopper.zzz;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
final class zza extends zzbm {
    private static final int[] zza = {5, 7, 7, 7, 5, 5};
    private static final double[][] zzb = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};
    private final Context zzc;
    private final zzba zzd;
    private BarhopperV3 zze;

    zza(Context context, zzba zzbaVar) {
        this.zzc = context;
        this.zzd = zzbaVar;
    }

    private final RecognitionOptions zzg() {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        recognitionOptions.setBarcodeFormats(this.zzd.zza());
        recognitionOptions.setOutputUnrecognizedBarcodes(this.zzd.zzb());
        recognitionOptions.setEnableQrAlignmentGrid(true);
        recognitionOptions.setEnableUseKeypointAsFinderPattern(true);
        return recognitionOptions;
    }

    private static zzan zzh(zzl zzlVar, String str, String str2) {
        if (zzlVar == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new zzan(zzlVar.zzf(), zzlVar.zzd(), zzlVar.zza(), zzlVar.zzb(), zzlVar.zzc(), zzlVar.zze(), zzlVar.zzj(), matcher.find() ? matcher.group(1) : null);
    }

    private final BarhopperProto$BarhopperResponse zzi(ByteBuffer byteBuffer, zzcc zzccVar, RecognitionOptions recognitionOptions) {
        BarhopperV3 barhopperV3 = (BarhopperV3) Preconditions.checkNotNull(this.zze);
        if (((ByteBuffer) Preconditions.checkNotNull(byteBuffer)).isDirect()) {
            return barhopperV3.recognize(zzccVar.zzd(), zzccVar.zza(), byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.recognize(zzccVar.zzd(), zzccVar.zza(), byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.recognize(zzccVar.zzd(), zzccVar.zza(), bArr, recognitionOptions);
    }

    private final List zzj(IObjectWrapper iObjectWrapper, zzcc zzccVar, RecognitionOptions recognitionOptions) {
        BarhopperProto$BarhopperResponse barhopperProto$BarhopperResponseRecognize;
        zzar zzarVar;
        zzau zzauVar;
        zzav zzavVar;
        zzax zzaxVar;
        zzaw zzawVar;
        zzas zzasVar;
        zzao zzaoVar;
        zzap zzapVar;
        zzaq zzaqVar;
        int i2;
        Point[] pointArr;
        zzau[] zzauVarArr;
        zzar[] zzarVarArr;
        zzam[] zzamVarArr;
        int iZzb = zzccVar.zzb();
        int i3 = -1;
        int i4 = 0;
        if (iZzb == -1) {
            barhopperProto$BarhopperResponseRecognize = ((BarhopperV3) Preconditions.checkNotNull(this.zze)).recognize((Bitmap) ObjectWrapper.unwrap(iObjectWrapper), recognitionOptions);
        } else if (iZzb == 17) {
            barhopperProto$BarhopperResponseRecognize = zzi((ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper), zzccVar, recognitionOptions);
        } else if (iZzb != 35) {
            if (iZzb != 842094169) {
                throw new IllegalArgumentException("Unsupported image format: " + zzccVar.zzb());
            }
            barhopperProto$BarhopperResponseRecognize = zzi((ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper), zzccVar, recognitionOptions);
        } else {
            barhopperProto$BarhopperResponseRecognize = zzi(((Image) Preconditions.checkNotNull((Image) ObjectWrapper.unwrap(iObjectWrapper))).getPlanes()[0].getBuffer(), zzccVar, recognitionOptions);
        }
        ArrayList arrayList = new ArrayList();
        Matrix uprightRotationMatrix = ImageUtils.getInstance().getUprightRotationMatrix(zzccVar.zzd(), zzccVar.zza(), zzccVar.zzc());
        for (zzc zzcVar : barhopperProto$BarhopperResponseRecognize.zzc()) {
            if (zzcVar.zza() > 0 && uprightRotationMatrix != null) {
                float[] fArr = new float[8];
                List listZzo = zzcVar.zzo();
                int iZza = zzcVar.zza();
                for (int i5 = i4; i5 < iZza; i5++) {
                    int i6 = i5 + i5;
                    fArr[i6] = ((zzaf) listZzo.get(i5)).zza();
                    fArr[i6 + 1] = ((zzaf) listZzo.get(i5)).zzb();
                }
                uprightRotationMatrix.mapPoints(fArr);
                int iZzc = zzccVar.zzc();
                while (i4 < iZza) {
                    zzb zzbVar = (zzb) zzcVar.zzH();
                    int i7 = i4 + i4;
                    zzae zzaeVarZzc = zzaf.zzc();
                    zzaeVarZzc.zza((int) fArr[i7]);
                    zzaeVarZzc.zzb((int) fArr[i7 + 1]);
                    zzbVar.zza((i4 + iZzc) % iZza, (zzaf) zzaeVarZzc.zzj());
                    zzcVar = (zzc) zzbVar.zzj();
                    i4++;
                }
            }
            if (zzcVar.zzt()) {
                zzv zzvVarZzh = zzcVar.zzh();
                zzarVar = new zzar(zzvVarZzh.zzf() + i3, zzvVarZzh.zzc(), zzvVarZzh.zze(), zzvVarZzh.zzd());
            } else {
                zzarVar = null;
            }
            if (zzcVar.zzv()) {
                zzco zzcoVarZzb = zzcVar.zzb();
                zzauVar = new zzau(zzcoVarZzb.zzd() + i3, zzcoVarZzb.zzc());
            } else {
                zzauVar = null;
            }
            if (zzcVar.zzw()) {
                zzah zzahVarZzj = zzcVar.zzj();
                zzavVar = new zzav(zzahVarZzj.zzc(), zzahVarZzj.zzd());
            } else {
                zzavVar = null;
            }
            if (zzcVar.zzy()) {
                com.google.photos.vision.barhopper.zzao zzaoVarZzl = zzcVar.zzl();
                zzaxVar = new zzax(zzaoVarZzl.zzd(), zzaoVarZzl.zzc(), zzaoVarZzl.zze() + i3);
            } else {
                zzaxVar = null;
            }
            if (zzcVar.zzx()) {
                zzak zzakVarZzk = zzcVar.zzk();
                zzawVar = new zzaw(zzakVarZzk.zzc(), zzakVarZzk.zzd());
            } else {
                zzawVar = null;
            }
            if (zzcVar.zzu()) {
                zzz zzzVarZzi = zzcVar.zzi();
                zzasVar = new zzas(zzzVarZzi.zza(), zzzVarZzi.zzb());
            } else {
                zzasVar = null;
            }
            if (zzcVar.zzq()) {
                zzn zznVarZzd = zzcVar.zzd();
                zzaoVar = new zzao(zznVarZzd.zzj(), zznVarZzd.zze(), zznVarZzd.zzf(), zznVarZzd.zzh(), zznVarZzd.zzi(), zzh(zznVarZzd.zzb(), zzcVar.zzm().zzn() ? zzcVar.zzm().zzt() : null, "DTSTART:([0-9TZ]*)"), zzh(zznVarZzd.zza(), zzcVar.zzm().zzn() ? zzcVar.zzm().zzt() : null, "DTEND:([0-9TZ]*)"));
            } else {
                zzaoVar = null;
            }
            if (zzcVar.zzr()) {
                zzp zzpVarZze = zzcVar.zze();
                zzck zzckVarZza = zzpVarZze.zza();
                zzat zzatVar = zzckVarZza != null ? new zzat(zzckVarZza.zzd(), zzckVarZza.zzi(), zzckVarZza.zzh(), zzckVarZza.zzc(), zzckVarZza.zzf(), zzckVarZza.zze(), zzckVarZza.zzj()) : null;
                String strZzd = zzpVarZze.zzd();
                String strZze = zzpVarZze.zze();
                List listZzi = zzpVarZze.zzi();
                if (listZzi.isEmpty()) {
                    zzauVarArr = null;
                } else {
                    zzauVarArr = new zzau[listZzi.size()];
                    for (int i8 = 0; i8 < listZzi.size(); i8++) {
                        zzauVarArr[i8] = new zzau(((zzco) listZzi.get(i8)).zzd() + i3, ((zzco) listZzi.get(i8)).zzc());
                    }
                }
                List listZzh = zzpVarZze.zzh();
                if (listZzh.isEmpty()) {
                    zzarVarArr = null;
                } else {
                    zzarVarArr = new zzar[listZzh.size()];
                    int i9 = 0;
                    while (i9 < listZzh.size()) {
                        zzarVarArr[i9] = new zzar(((zzv) listZzh.get(i9)).zzf() + i3, ((zzv) listZzh.get(i9)).zzc(), ((zzv) listZzh.get(i9)).zze(), ((zzv) listZzh.get(i9)).zzd());
                        i9++;
                        i3 = -1;
                    }
                }
                String[] strArr = (String[]) zzpVarZze.zzj().toArray(new String[0]);
                List listZzf = zzpVarZze.zzf();
                if (listZzf.isEmpty()) {
                    i4 = 0;
                    zzamVarArr = null;
                } else {
                    zzamVarArr = new zzam[listZzf.size()];
                    for (int i10 = 0; i10 < listZzf.size(); i10++) {
                        zzamVarArr[i10] = new zzam(((zzci) listZzf.get(i10)).zzc() - 1, (String[]) ((zzci) listZzf.get(i10)).zzb().toArray(new String[0]));
                    }
                    i4 = 0;
                }
                zzapVar = new zzap(zzatVar, strZzd, strZze, zzauVarArr, zzarVarArr, strArr, zzamVarArr);
            } else {
                i4 = 0;
                zzapVar = null;
            }
            if (zzcVar.zzs()) {
                zzr zzrVarZzf = zzcVar.zzf();
                zzaqVar = new zzaq(zzrVarZzf.zzi(), zzrVarZzf.zzk(), zzrVarZzf.zzq(), zzrVarZzf.zzo(), zzrVarZzf.zzl(), zzrVarZzf.zze(), zzrVarZzf.zzc(), zzrVarZzf.zzd(), zzrVarZzf.zzf(), zzrVarZzf.zzp(), zzrVarZzf.zzm(), zzrVarZzf.zzj(), zzrVarZzf.zzh(), zzrVarZzf.zzn());
            } else {
                zzaqVar = null;
            }
            int i11 = 2;
            switch (zzcVar.zzz() - 1) {
                case 0:
                    i2 = i4;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 8;
                    break;
                case 5:
                    i2 = 16;
                    break;
                case 6:
                    i2 = 32;
                    break;
                case 7:
                    i2 = 64;
                    break;
                case 8:
                    i2 = 128;
                    break;
                case 9:
                    i2 = 256;
                    break;
                case 10:
                    i2 = 512;
                    break;
                case 11:
                    i2 = 1024;
                    break;
                case 12:
                    i2 = 2048;
                    break;
                case 13:
                    i2 = 4096;
                    break;
                default:
                    i2 = -1;
                    break;
            }
            String strZzn = zzcVar.zzn();
            String strZzt = zzcVar.zzm().zzn() ? zzcVar.zzm().zzt() : null;
            byte[] bArrZzw = zzcVar.zzm().zzw();
            List listZzo2 = zzcVar.zzo();
            if (listZzo2.isEmpty()) {
                pointArr = null;
            } else {
                pointArr = new Point[listZzo2.size()];
                for (int i12 = i4; i12 < listZzo2.size(); i12++) {
                    pointArr[i12] = new Point(((zzaf) listZzo2.get(i12)).zza(), ((zzaf) listZzo2.get(i12)).zzb());
                }
            }
            i3 = -1;
            switch (zzcVar.zzA() - 1) {
                case 1:
                    i11 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i11 = 3;
                    break;
                case 4:
                    i11 = 4;
                    break;
                case 5:
                    i11 = 5;
                    break;
                case 6:
                    i11 = 6;
                    break;
                case 7:
                    i11 = 7;
                    break;
                case 8:
                    i11 = 8;
                    break;
                case 9:
                    i11 = 9;
                    break;
                case 10:
                    i11 = 10;
                    break;
                case 11:
                    i11 = 11;
                    break;
                case 12:
                    i11 = 12;
                    break;
                default:
                    i11 = i4;
                    break;
            }
            arrayList.add(new zzay(i2, strZzn, strZzt, bArrZzw, pointArr, i11, zzarVar, zzauVar, zzavVar, zzaxVar, zzawVar, zzasVar, zzaoVar, zzapVar, zzaqVar));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final List zzb(IObjectWrapper iObjectWrapper, zzcc zzccVar) {
        return zzj(iObjectWrapper, zzccVar, zzg());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final List zzc(IObjectWrapper iObjectWrapper, zzcc zzccVar, zzbc zzbcVar) {
        RecognitionOptions recognitionOptionsZzg = zzg();
        MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
        multiScaleDecodingOptions.setExtraScales(zzbcVar.zza().zzc());
        multiScaleDecodingOptions.setMinimumDetectedDimension(zzbcVar.zza().zza());
        multiScaleDecodingOptions.setSkipProcessingIfBarcodeFound(zzbcVar.zza().zzb());
        recognitionOptionsZzg.setMultiScaleDecodingOptions(multiScaleDecodingOptions);
        MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
        multiScaleDetectionOptions.setExtraScales(zzbcVar.zza().zzc());
        recognitionOptionsZzg.setMultiScaleDetectionOptions(multiScaleDetectionOptions);
        recognitionOptionsZzg.setQrEnableFourthCornerApproximation(zzbcVar.zzb());
        return zzj(iObjectWrapper, zzccVar, recognitionOptionsZzg);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final void zzd() throws Throwable {
        if (this.zze != null) {
            return;
        }
        this.zze = new BarhopperV3();
        zzh zzhVarZza = zzi.zza();
        zze zzeVarZza = zzf.zza();
        int i2 = 16;
        int i3 = 0;
        for (int i4 = 0; i4 < 6; i4++) {
            com.google.barhopper.deeplearning.zzb zzbVarZza = com.google.barhopper.deeplearning.zzc.zza();
            zzbVarZza.zzc(i2);
            zzbVarZza.zzd(i2);
            for (int i5 = 0; i5 < zza[i4]; i5++) {
                double[] dArr = zzb[i3];
                double d2 = dArr[0] * 320.0d;
                float fSqrt = (float) Math.sqrt(dArr[1]);
                float f2 = (float) d2;
                zzbVarZza.zza(f2 / fSqrt);
                zzbVarZza.zzb(f2 * fSqrt);
                i3++;
            }
            i2 += i2;
            zzeVarZza.zza(zzbVarZza);
        }
        zzhVarZza.zza(zzeVarZza);
        try {
            Context context = this.zzc;
            Class<?> cls = Class.forName(C1561oA.od("?K@MIB<\u00059DBG7?D|\u0011<:?/A<", (short) (FB.Xd() ^ 6061)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (ZN.Xd() ^ FujifilmMakernoteDirectory.TAG_DYNAMIC_RANGE_SETTING);
            int[] iArr = new int["xw\bU\t\n|\r\r".length()];
            QB qb = new QB("xw\bU\t\n|\r\r");
            int i6 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i6] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i6));
                i6++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i6), clsArr);
            try {
                method.setAccessible(true);
                AssetManager assetManager = (AssetManager) method.invoke(context, objArr);
                short sXd2 = (short) (OY.Xd() ^ 11390);
                short sXd3 = (short) (OY.Xd() ^ 16100);
                int[] iArr2 = new int["\u000e-K(Q[=\\L\\\u0007\\|\u0017\u0004%x\u0018>$\u007fR.]-XmMf\u0019w\bc\u00123\u0005*L$M#QZ^(eZ\u0013d4f\u007f\"5\u0012M\"jaBWc\\|".length()];
                QB qb2 = new QB("\u000e-K(Q[=\\L\\\u0007\\|\u0017\u0004%x\u0018>$\u007fR.]-XmMf\u0019w\bc\u00123\u0005*L$M#QZ^(eZ\u0013d4f\u007f\"5\u0012M\"jaBWc\\|");
                int i7 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i7] = xuXd2.fK(((i7 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                    i7++;
                }
                InputStream inputStreamOpen = assetManager.open(new String(iArr2, 0, i7));
                try {
                    Context context2 = this.zzc;
                    short sXd4 = (short) (FB.Xd() ^ 32050);
                    int[] iArr3 = new int["\u0007\u0015\f\u001b\u0019\u0014\u0010Z\u0011\u001e\u001e%\u0017!(bx&&-\u001f30".length()];
                    QB qb3 = new QB("\u0007\u0015\f\u001b\u0019\u0014\u0010Z\u0011\u001e\u001e%\u0017!(bx&&-\u001f30");
                    int i8 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i8] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 + i8));
                        i8++;
                    }
                    Class<?> cls2 = Class.forName(new String(iArr3, 0, i8));
                    Object[] objArr2 = new Object[0];
                    Method method2 = cls2.getMethod(Wg.vd("sr\u0003P{|o\u007f\b", (short) (C1607wl.Xd() ^ 22529)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        InputStream inputStreamOpen2 = ((AssetManager) method2.invoke(context2, objArr2)).open(Qg.kd("?=;8B,.,<,7++$12&&,2l,* \u001e\u0018\u0019,*$\u0013%\u0017\u0018\"\u0014! \u001b\u001d\t\u0016\u0017\t\u000f\u0011\tP\u0016\u0007\f\b\u0012\u0002", (short) (C1633zX.Xd() ^ (-720)), (short) (C1633zX.Xd() ^ (-27339))));
                        try {
                            Context context3 = this.zzc;
                            Object[] objArr3 = new Object[0];
                            Method method3 = Class.forName(hg.Vd("%1&3/(\"j\u001f*(-\u001d%*bv\" %\u0015'\"", (short) (Od.Xd() ^ (-20623)), (short) (Od.Xd() ^ (-11578)))).getMethod(C1561oA.ud("0-;\u000787(64", (short) (C1633zX.Xd() ^ (-4980))), new Class[0]);
                            try {
                                method3.setAccessible(true);
                                InputStream inputStreamOpen3 = ((AssetManager) method3.invoke(context3, objArr3)).open(C1561oA.yd("gec`jTVTdT_SSLYZnntz5trhf`fd_qqm?8=OJG56F@B.;<.4VN\u0016[LQMWG", (short) (ZN.Xd() ^ 15263)));
                                try {
                                    BarhopperV3 barhopperV3 = (BarhopperV3) Preconditions.checkNotNull(this.zze);
                                    zzk zzkVarZza = BarhopperV3Options.zza();
                                    zzhVarZza.zzb(zzdf.zzs(inputStreamOpen));
                                    zzkVarZza.zza(zzhVarZza);
                                    zzab zzabVarZza = zzac.zza();
                                    zzabVarZza.zza(zzdf.zzs(inputStreamOpen2));
                                    zzabVarZza.zzb(zzdf.zzs(inputStreamOpen3));
                                    zzkVarZza.zzb(zzabVarZza);
                                    barhopperV3.create(zzkVarZza.zzj());
                                    if (inputStreamOpen3 != null) {
                                        inputStreamOpen3.close();
                                    }
                                    if (inputStreamOpen2 != null) {
                                        inputStreamOpen2.close();
                                    }
                                    if (inputStreamOpen != null) {
                                        inputStreamOpen.close();
                                    }
                                } finally {
                                }
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } finally {
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } finally {
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (IOException e5) {
            throw new IllegalStateException(C1561oA.Yd("a}\u0007\u000b\u0005\u0005A\u0017\u0013D\u0015\u0017\r\u0017Il\r\u001f\u0011\u001e\u0014\u0016Q #\u0019\u001b#+", (short) (C1499aX.Xd() ^ (-17490))), e5);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final void zze(zzbe zzbeVar) throws Throwable {
        zzd();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn
    public final void zzf() {
        BarhopperV3 barhopperV3 = this.zze;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.zze = null;
        }
    }
}
