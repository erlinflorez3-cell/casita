package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.graphics.Point;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_barcode.zzeu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxn;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.odml.image.MlImage;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.ZoomSuggestionOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import yg.FB;
import yg.Jg;
import yg.Xg;

/* JADX INFO: loaded from: classes7.dex */
public final class zzh extends MobileVisionBase implements BarcodeScanner {
    public static final /* synthetic */ int zzc = 0;
    private static final BarcodeScannerOptions zzd = new BarcodeScannerOptions.Builder().build();

    @Nullable
    final zzxk zzb;
    private final boolean zze;
    private final BarcodeScannerOptions zzf;
    private int zzg;
    private boolean zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzh(BarcodeScannerOptions barcodeScannerOptions, zzl zzlVar, Executor executor, zzwp zzwpVar, MlKitContext mlKitContext) throws Throwable {
        zzxk zzxkVarZzd;
        super(zzlVar, executor);
        ZoomSuggestionOptions zoomSuggestionOptionsZzb = barcodeScannerOptions.zzb();
        if (zoomSuggestionOptionsZzb == null) {
            zzxkVarZzd = null;
        } else {
            Context applicationContext = mlKitContext.getApplicationContext();
            Context applicationContext2 = mlKitContext.getApplicationContext();
            Object[] objArr = new Object[0];
            Method method = Class.forName(Xg.qd("\u001f-$31,(r)66=/9@z\u0011>>E7KH", (short) (FB.Xd() ^ 8408), (short) (FB.Xd() ^ 11380))).getMethod(Jg.Wd("Cx1={%W|o&8z5T", (short) (FB.Xd() ^ 16137), (short) (FB.Xd() ^ 19748)), new Class[0]);
            try {
                method.setAccessible(true);
                zzxkVarZzd = zzxk.zzd(applicationContext, (String) method.invoke(applicationContext2, objArr));
                zzxkVarZzd.zzo(new zze(zoomSuggestionOptionsZzb), zzeu.zza());
                if (zoomSuggestionOptionsZzb.zza() >= 1.0f) {
                    zzxkVarZzd.zzk(zoomSuggestionOptionsZzb.zza());
                }
                zzxkVarZzd.zzm();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.zzf = barcodeScannerOptions;
        boolean zZzf = zzb.zzf();
        this.zze = zZzf;
        zzrp zzrpVar = new zzrp();
        zzrpVar.zzi(zzb.zzc(barcodeScannerOptions));
        zzrr zzrrVarZzj = zzrpVar.zzj();
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(zZzf ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzrdVar.zzg(zzrrVarZzj);
        zzwpVar.zzd(zzws.zzg(zzrdVar, 1), zzrc.ON_DEVICE_BARCODE_CREATE);
        this.zzb = zzxkVarZzd;
    }

    private final Task zzf(Task task, final int i2, final int i3) {
        return task.onSuccessTask(new SuccessContinuation() { // from class: com.google.mlkit.vision.barcode.internal.zzf
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.zza.zzd(i2, i3, (List) obj);
            }
        });
    }

    @Override // com.google.mlkit.vision.common.internal.MobileVisionBase, java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    public final synchronized void close() {
        zzxk zzxkVar = this.zzb;
        if (zzxkVar != null) {
            zzxkVar.zzn(this.zzh);
            this.zzb.zzj();
        }
        super.close();
    }

    @Override // com.google.mlkit.vision.interfaces.Detector
    public final int getDetectorType() {
        return 1;
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.zze ? OptionalModuleUtils.EMPTY_FEATURES : new Feature[]{OptionalModuleUtils.FEATURE_BARCODE};
    }

    @Override // com.google.mlkit.vision.barcode.BarcodeScanner
    public final Task<List<Barcode>> process(MlImage mlImage) {
        return zzf(super.processBase(mlImage), mlImage.getWidth(), mlImage.getHeight());
    }

    @Override // com.google.mlkit.vision.barcode.BarcodeScanner
    public final Task<List<Barcode>> process(InputImage inputImage) {
        return zzf(super.processBase(inputImage), inputImage.getWidth(), inputImage.getHeight());
    }

    final /* synthetic */ Task zzd(int i2, int i3, List list) throws Exception {
        if (this.zzb == null) {
            return Tasks.forResult(list);
        }
        this.zzg++;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Barcode barcode = (Barcode) it.next();
            if (barcode.getFormat() == -1) {
                arrayList2.add(barcode);
            } else {
                arrayList.add(barcode);
            }
        }
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                Point[] cornerPoints = ((Barcode) arrayList2.get(i4)).getCornerPoints();
                if (cornerPoints != null) {
                    this.zzb.zzi(this.zzg, zzxn.zzg(Arrays.asList(cornerPoints), i2, i3, 0.0f));
                }
            }
        } else {
            this.zzh = true;
        }
        if (true != this.zzf.zzd()) {
            list = arrayList;
        }
        return Tasks.forResult(list);
    }
}
