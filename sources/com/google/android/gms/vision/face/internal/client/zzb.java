package com.google.android.gms.vision.face.internal.client;

import android.content.Context;
import android.graphics.PointF;
import android.media.Image;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.internal.vision.zzt;
import com.google.android.gms.internal.vision.zzu;
import com.google.android.gms.vision.face.Contour;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class zzb extends zzt<zzh> {
    private final zzf zza;

    public zzb(Context context, zzf zzfVar) {
        super(context, "FaceNativeHandle", OptionalModuleUtils.FACE);
        this.zza = zzfVar;
        zzd();
    }

    private static Face zza(FaceParcel faceParcel) {
        Landmark[] landmarkArr;
        Contour[] contourArr;
        int i2 = faceParcel.zza;
        PointF pointF = new PointF(faceParcel.zzb, faceParcel.zzc);
        float f2 = faceParcel.zzd;
        float f3 = faceParcel.zze;
        float f4 = faceParcel.zzf;
        float f5 = faceParcel.zzg;
        float f6 = faceParcel.zzh;
        LandmarkParcel[] landmarkParcelArr = faceParcel.zzi;
        if (landmarkParcelArr == null) {
            landmarkArr = new Landmark[0];
        } else {
            landmarkArr = new Landmark[landmarkParcelArr.length];
            for (int i3 = 0; i3 < landmarkParcelArr.length; i3++) {
                LandmarkParcel landmarkParcel = landmarkParcelArr[i3];
                landmarkArr[i3] = new Landmark(new PointF(landmarkParcel.zza, landmarkParcel.zzb), landmarkParcel.zzc);
            }
        }
        zza[] zzaVarArr = faceParcel.zzm;
        if (zzaVarArr == null) {
            contourArr = new Contour[0];
        } else {
            contourArr = new Contour[zzaVarArr.length];
            for (int i4 = 0; i4 < zzaVarArr.length; i4++) {
                zza zzaVar = zzaVarArr[i4];
                contourArr[i4] = new Contour(zzaVar.zza, zzaVar.zzb);
            }
        }
        return new Face(i2, pointF, f2, f3, f4, f5, f6, landmarkArr, contourArr, faceParcel.zzj, faceParcel.zzk, faceParcel.zzl, faceParcel.zzn);
    }

    @Override // com.google.android.gms.internal.vision.zzt
    protected final /* synthetic */ zzh zza(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.LoadingException {
        zzi zziVarAsInterface = zzu.zza(context, "com.google.android.gms.vision.dynamite.face") ? zzl.asInterface(dynamiteModule.instantiate("com.google.android.gms.vision.face.NativeFaceDetectorV2Creator")) : zzl.asInterface(dynamiteModule.instantiate("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
        if (zziVarAsInterface == null) {
            return null;
        }
        return zziVarAsInterface.newFaceDetector(ObjectWrapper.wrap(context), (zzf) Preconditions.checkNotNull(this.zza));
    }

    @Override // com.google.android.gms.internal.vision.zzt
    protected final void zza() throws RemoteException {
        ((zzh) Preconditions.checkNotNull(zzd())).zza();
    }

    public final boolean zza(int i2) {
        if (!zzb()) {
            return false;
        }
        try {
            return ((zzh) Preconditions.checkNotNull(zzd())).zza(i2);
        } catch (RemoteException e2) {
            return false;
        }
    }

    public final Face[] zza(ByteBuffer byteBuffer, zzs zzsVar) {
        if (!zzb()) {
            return new Face[0];
        }
        try {
            FaceParcel[] faceParcelArrZza = ((zzh) Preconditions.checkNotNull(zzd())).zza(ObjectWrapper.wrap(byteBuffer), zzsVar);
            Face[] faceArr = new Face[faceParcelArrZza.length];
            for (int i2 = 0; i2 < faceParcelArrZza.length; i2++) {
                faceArr[i2] = zza(faceParcelArrZza[i2]);
            }
            return faceArr;
        } catch (RemoteException e2) {
            return new Face[0];
        }
    }

    public final Face[] zza(Image.Plane[] planeArr, zzs zzsVar) {
        if (!zzb()) {
            return new Face[0];
        }
        if (planeArr != null && planeArr.length != 3) {
            throw new IllegalArgumentException("Only android.graphics.ImageFormat#YUV_420_888 is supported which should have 3 planes.");
        }
        try {
            FaceParcel[] faceParcelArrZza = ((zzh) Preconditions.checkNotNull(zzd())).zza(ObjectWrapper.wrap(planeArr[0].getBuffer()), ObjectWrapper.wrap(planeArr[1].getBuffer()), ObjectWrapper.wrap(planeArr[2].getBuffer()), planeArr[0].getPixelStride(), planeArr[1].getPixelStride(), planeArr[2].getPixelStride(), planeArr[0].getRowStride(), planeArr[1].getRowStride(), planeArr[2].getRowStride(), zzsVar);
            Face[] faceArr = new Face[faceParcelArrZza.length];
            for (int i2 = 0; i2 < faceParcelArrZza.length; i2++) {
                faceArr[i2] = zza(faceParcelArrZza[i2]);
            }
            return faceArr;
        } catch (RemoteException e2) {
            return new Face[0];
        }
    }
}
