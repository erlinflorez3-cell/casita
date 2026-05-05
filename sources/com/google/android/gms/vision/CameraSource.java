package com.google.android.gms.vision;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.google.android.gms.common.images.Size;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.vision.Frame;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class CameraSource {
    public static final int CAMERA_FACING_BACK = 0;
    public static final int CAMERA_FACING_FRONT = 1;
    private Context zza;
    private final Object zzb;

    @Nullable
    private Camera zzc;
    private int zzd;
    private int zze;
    private Size zzf;
    private float zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;

    @Nullable
    private String zzk;

    @Nullable
    private SurfaceTexture zzl;

    @Nullable
    private Thread zzm;
    private zza zzn;
    private final IdentityHashMap<byte[], ByteBuffer> zzo;

    public static class Builder {
        private final Detector<?> zza;
        private CameraSource zzb;

        public Builder(Context context, Detector<?> detector) {
            CameraSource cameraSource = new CameraSource();
            this.zzb = cameraSource;
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            }
            if (detector == null) {
                throw new IllegalArgumentException("No detector supplied.");
            }
            this.zza = detector;
            cameraSource.zza = context;
        }

        public CameraSource build() {
            CameraSource cameraSource = this.zzb;
            CameraSource cameraSource2 = this.zzb;
            cameraSource2.getClass();
            cameraSource.zzn = cameraSource2.new zza(this.zza);
            return this.zzb;
        }

        public Builder setAutoFocusEnabled(boolean z2) {
            this.zzb.zzj = z2;
            return this;
        }

        public Builder setFacing(int i2) {
            if (i2 != 0 && i2 != 1) {
                throw new IllegalArgumentException(new StringBuilder(27).append("Invalid camera: ").append(i2).toString());
            }
            this.zzb.zzd = i2;
            return this;
        }

        public Builder setFocusMode(String str) {
            if (str.equals("continuous-video") || str.equals("continuous-picture")) {
                this.zzb.zzk = str;
            } else {
                String.format("FocusMode %s is not supported for now.", str);
                this.zzb.zzk = null;
            }
            return this;
        }

        public Builder setRequestedFps(float f2) {
            if (f2 <= 0.0f) {
                throw new IllegalArgumentException(new StringBuilder(28).append("Invalid fps: ").append(f2).toString());
            }
            this.zzb.zzg = f2;
            return this;
        }

        public Builder setRequestedPreviewSize(int i2, int i3) {
            if (i2 <= 0 || i2 > 1000000 || i3 <= 0 || i3 > 1000000) {
                throw new IllegalArgumentException(new StringBuilder(45).append("Invalid preview size: ").append(i2).append("x").append(i3).toString());
            }
            this.zzb.zzh = i2;
            this.zzb.zzi = i3;
            return this;
        }
    }

    public interface PictureCallback {
        void onPictureTaken(byte[] bArr);
    }

    public interface ShutterCallback {
        void onShutter();
    }

    private class zza implements Runnable {

        @Nullable
        private Detector<?> zza;
        private long zze;

        @Nullable
        private ByteBuffer zzg;
        private long zzb = SystemClock.elapsedRealtime();
        private final Object zzc = new Object();
        private boolean zzd = true;
        private int zzf = 0;

        zza(Detector<?> detector) {
            this.zza = detector;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z2;
            Frame frameBuild;
            ByteBuffer byteBuffer;
            while (true) {
                synchronized (this.zzc) {
                    while (true) {
                        z2 = this.zzd;
                        if (!z2 || this.zzg != null) {
                            break;
                        }
                        try {
                            this.zzc.wait();
                        } catch (InterruptedException e2) {
                            return;
                        }
                    }
                    if (!z2) {
                        return;
                    }
                    frameBuild = new Frame.Builder().setImageData((ByteBuffer) Preconditions.checkNotNull(this.zzg), CameraSource.this.zzf.getWidth(), CameraSource.this.zzf.getHeight(), 17).setId(this.zzf).setTimestampMillis(this.zze).setRotation(CameraSource.this.zze).build();
                    byteBuffer = this.zzg;
                    this.zzg = null;
                }
                try {
                    ((Detector) Preconditions.checkNotNull(this.zza)).receiveFrame(frameBuild);
                } catch (Exception e3) {
                } finally {
                    ((Camera) Preconditions.checkNotNull(CameraSource.this.zzc)).addCallbackBuffer(((ByteBuffer) Preconditions.checkNotNull(byteBuffer)).array());
                }
            }
        }

        final void zza() {
            Detector<?> detector = this.zza;
            if (detector != null) {
                detector.release();
                this.zza = null;
            }
        }

        final void zza(boolean z2) {
            synchronized (this.zzc) {
                this.zzd = z2;
                this.zzc.notifyAll();
            }
        }

        final void zza(byte[] bArr, Camera camera) {
            synchronized (this.zzc) {
                ByteBuffer byteBuffer = this.zzg;
                if (byteBuffer != null) {
                    camera.addCallbackBuffer(byteBuffer.array());
                    this.zzg = null;
                }
                if (CameraSource.this.zzo.containsKey(bArr)) {
                    this.zze = SystemClock.elapsedRealtime() - this.zzb;
                    this.zzf++;
                    this.zzg = (ByteBuffer) CameraSource.this.zzo.get(bArr);
                    this.zzc.notifyAll();
                }
            }
        }
    }

    private class zzb implements Camera.PreviewCallback {
        private zzb() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            CameraSource.this.zzn.zza(bArr, camera);
        }
    }

    private class zzc implements Camera.PictureCallback {

        @Nullable
        private PictureCallback zza;

        private zzc() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public final void onPictureTaken(byte[] bArr, Camera camera) {
            PictureCallback pictureCallback = this.zza;
            if (pictureCallback != null) {
                pictureCallback.onPictureTaken(bArr);
            }
            synchronized (CameraSource.this.zzb) {
                if (CameraSource.this.zzc != null) {
                    CameraSource.this.zzc.startPreview();
                }
            }
        }
    }

    private static class zzd implements Camera.ShutterCallback {

        @Nullable
        private ShutterCallback zza;

        private zzd() {
        }

        @Override // android.hardware.Camera.ShutterCallback
        public final void onShutter() {
            ShutterCallback shutterCallback = this.zza;
            if (shutterCallback != null) {
                shutterCallback.onShutter();
            }
        }
    }

    static class zze {
        private Size zza;
        private Size zzb;

        public zze(Camera.Size size, @Nullable Camera.Size size2) {
            this.zza = new Size(size.width, size.height);
            if (size2 != null) {
                this.zzb = new Size(size2.width, size2.height);
            }
        }

        public final Size zza() {
            return this.zza;
        }

        @Nullable
        public final Size zzb() {
            return this.zzb;
        }
    }

    private CameraSource() {
        this.zzb = new Object();
        this.zzd = 0;
        this.zzg = 30.0f;
        this.zzh = 1024;
        this.zzi = 768;
        this.zzj = false;
        this.zzo = new IdentityHashMap<>();
    }

    private final Camera zza() throws Throwable {
        int i2;
        int i3;
        int i4 = this.zzd;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= Camera.getNumberOfCameras()) {
                i6 = -1;
                break;
            }
            Camera.getCameraInfo(i6, cameraInfo);
            if (cameraInfo.facing == i4) {
                break;
            }
            i6++;
        }
        if (i6 == -1) {
            throw new IOException(C1593ug.zd("6cjb[\u0018gio\u001ccgmd!thuzkz|nn+on{t\u0003r@", (short) (C1607wl.Xd() ^ 29369), (short) (C1607wl.Xd() ^ 17860)));
        }
        Camera cameraOpen = Camera.open(i6);
        int i7 = this.zzh;
        int i8 = this.zzi;
        Camera.Parameters parameters = cameraOpen.getParameters();
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : supportedPreviewSizes) {
            float f2 = size.width / size.height;
            Iterator<Camera.Size> it = supportedPictureSizes.iterator();
            while (true) {
                if (it.hasNext()) {
                    Camera.Size next = it.next();
                    if (Math.abs(f2 - (next.width / next.height)) < 0.01f) {
                        arrayList.add(new zze(size, next));
                        break;
                    }
                }
            }
        }
        int size2 = arrayList.size();
        Qg.kd("z\u0018#\u001a&\u0014\u0005 %!\u0011\u0012", (short) (Od.Xd() ^ (-30307)), (short) (Od.Xd() ^ (-16188)));
        if (size2 == 0) {
            hg.Vd("\u0001!P !\u0013#\u0015\u0010!H\u001b\u0010 \n\u0017B\n\u0002\u0016\u0004=};}\t\u000b\n{\t\u0005\u0003\u0001uy}u-\u007flwn5hyuifv.r`rfk\u001bjb[kkgY\u0013eZjT", (short) (OY.Xd() ^ 10018), (short) (OY.Xd() ^ 27442));
            Iterator<Camera.Size> it2 = supportedPreviewSizes.iterator();
            while (it2.hasNext()) {
                arrayList.add(new zze(it2.next(), null));
            }
        }
        int size3 = arrayList.size();
        int i9 = Integer.MAX_VALUE;
        int i10 = 0;
        int i11 = Integer.MAX_VALUE;
        zze zzeVar = null;
        while (i10 < size3) {
            Object obj = arrayList.get(i10);
            i10++;
            zze zzeVar2 = (zze) obj;
            Size sizeZza = zzeVar2.zza();
            int iAbs = Math.abs(sizeZza.getWidth() - i7) + Math.abs(sizeZza.getHeight() - i8);
            if (iAbs < i11) {
                zzeVar = zzeVar2;
                i11 = iAbs;
            }
        }
        zze zzeVar3 = (zze) Preconditions.checkNotNull(zzeVar);
        if (zzeVar3 == null) {
            throw new IOException(C1561oA.Qd("'RWMD~LLPz@BF;uHI<F22;3l<=/?1,=d7,<&m", (short) (Od.Xd() ^ (-15494))));
        }
        Size sizeZzb = zzeVar3.zzb();
        this.zzf = zzeVar3.zza();
        int i12 = (int) (this.zzg * 1000.0f);
        int[] iArr = null;
        for (int[] iArr2 : cameraOpen.getParameters().getSupportedPreviewFpsRange()) {
            int iAbs2 = Math.abs(i12 - iArr2[0]) + Math.abs(i12 - iArr2[1]);
            if (iAbs2 < i9) {
                iArr = iArr2;
                i9 = iAbs2;
            }
        }
        int[] iArr3 = (int[]) Preconditions.checkNotNull(iArr);
        if (iArr3 == null) {
            throw new IOException(EO.Od("ONVq\u001ay0\"Y%D+\u007fi\u0013N\u0016qF\u0019]5\u0012RfJ!g:\n}\u000e&\u001a:}aIR7&\ra%\u000bzM|#\u0004X\r\u0004F\u001ce", (short) (ZN.Xd() ^ 16523)));
        }
        Camera.Parameters parameters2 = cameraOpen.getParameters();
        if (sizeZzb != null) {
            parameters2.setPictureSize(sizeZzb.getWidth(), sizeZzb.getHeight());
        }
        parameters2.setPreviewSize(this.zzf.getWidth(), this.zzf.getHeight());
        parameters2.setPreviewFpsRange(iArr3[0], iArr3[1]);
        parameters2.setPreviewFormat(17);
        Context context = this.zza;
        String strUd = C1561oA.ud("_PTISZ", (short) (C1580rY.Xd() ^ (-12370)));
        short sXd = (short) (C1633zX.Xd() ^ (-28390));
        int[] iArr4 = new int["HTMZZSQ\u001aR]_dX`i\"\u001aEGL@RQ".length()];
        QB qb = new QB("HTMZZSQ\u001aR]_dX`i\"\u001aEGL@RQ");
        int i13 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr4[i13] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i13));
            i13++;
        }
        Object[] objArr = {strUd};
        Method method = Class.forName(new String(iArr4, 0, i13)).getMethod(Xg.qd("\u000f\u000e\u001e}% \"\u0014\u001d\u0004\u0017%*\u001e\u0019\u001c", (short) (C1607wl.Xd() ^ 14514), (short) (C1607wl.Xd() ^ 15132)), Class.forName(C1561oA.Yd("5-C/|<2@:\u0002(JIAGA", (short) (Od.Xd() ^ (-4584)))));
        try {
            method.setAccessible(true);
            int rotation = ((WindowManager) Preconditions.checkNotNull((WindowManager) method.invoke(context, objArr))).getDefaultDisplay().getRotation();
            if (rotation != 0) {
                if (rotation == 1) {
                    i5 = 90;
                } else if (rotation == 2) {
                    i5 = 180;
                } else if (rotation != 3) {
                    StringBuilder sb = new StringBuilder(31);
                    short sXd2 = (short) (FB.Xd() ^ 25592);
                    short sXd3 = (short) (FB.Xd() ^ 12859);
                    int[] iArr5 = new int["'I0/U\u0016>nT\rvx}\u0018f5\u0011\u0004<e".length()];
                    QB qb2 = new QB("'I0/U\u0016>nT\rvx}\u0018f5\u0011\u0004<e");
                    int i14 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr5[i14] = xuXd2.fK(xuXd2.CK(iKK2) - ((i14 * sXd3) ^ sXd2));
                        i14++;
                    }
                    sb.append(new String(iArr5, 0, i14)).append(rotation).toString();
                } else {
                    i5 = 270;
                }
            }
            Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
            Camera.getCameraInfo(i6, cameraInfo2);
            if (cameraInfo2.facing == 1) {
                i2 = (cameraInfo2.orientation + i5) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
                i3 = (360 - i2) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
            } else {
                i2 = ((cameraInfo2.orientation - i5) + SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
                i3 = i2;
            }
            this.zze = i2 / 90;
            cameraOpen.setDisplayOrientation(i3);
            parameters2.setRotation(i2);
            if (this.zzk != null) {
                if (parameters2.getSupportedFocusModes().contains(this.zzk)) {
                    parameters2.setFocusMode((String) Preconditions.checkNotNull(this.zzk));
                } else {
                    Object[] objArr2 = {this.zzk};
                    short sXd4 = (short) (C1499aX.Xd() ^ (-1578));
                    short sXd5 = (short) (C1499aX.Xd() ^ (-11734));
                    int[] iArr6 = new int["D%p\u0006J#M\"\u000bF}nDK\u001b`N\u001bN8\u001d\\g\u001a=\u0014\u001b\u001d\u0002_o \u001334\u001cXZcU\u0006\u0018p\f&".length()];
                    QB qb3 = new QB("D%p\u0006J#M\"\u000bF}nDK\u001b`N\u001bN8\u001d\\g\u001a=\u0014\u001b\u001d\u0002_o \u001334\u001cXZcU\u0006\u0018p\f&");
                    int i15 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr6[i15] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i15 % C1561oA.Xd.length] ^ ((i15 * sXd5) + sXd4)));
                        i15++;
                    }
                    String.format(new String(iArr6, 0, i15), objArr2);
                    this.zzk = null;
                }
            }
            if (this.zzk == null && this.zzj) {
                List<String> supportedFocusModes = parameters2.getSupportedFocusModes();
                String strUd2 = C1626yg.Ud("\u000fZWU1E9f*:=\u001dQ:u\u0003", (short) (FB.Xd() ^ 31920), (short) (FB.Xd() ^ 6966));
                if (supportedFocusModes.contains(strUd2)) {
                    parameters2.setFocusMode(strUd2);
                    this.zzk = strUd2;
                } else {
                    Ig.wd("\"m,@N\u0018&@\u001d<5\bbuUN~I;9.9\u0014\u00159L1VL>\u0011wP.`fFW/\u0015\u0016\t\u0002,/HvFV:", (short) (ZN.Xd() ^ 23140));
                }
            }
            cameraOpen.setParameters(parameters2);
            cameraOpen.setPreviewCallbackWithBuffer(new zzb());
            cameraOpen.addCallbackBuffer(zza(this.zzf));
            cameraOpen.addCallbackBuffer(zza(this.zzf));
            cameraOpen.addCallbackBuffer(zza(this.zzf));
            cameraOpen.addCallbackBuffer(zza(this.zzf));
            return cameraOpen;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final byte[] zza(Size size) {
        byte[] bArr = new byte[((int) Math.ceil(((((long) size.getHeight()) * ((long) size.getWidth())) * ((long) ImageFormat.getBitsPerPixel(17))) / 8.0d)) + 1];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (!byteBufferWrap.hasArray() || byteBufferWrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.zzo.put(bArr, byteBufferWrap);
        return bArr;
    }

    public int getCameraFacing() {
        return this.zzd;
    }

    public Size getPreviewSize() {
        return this.zzf;
    }

    public void release() {
        synchronized (this.zzb) {
            stop();
            this.zzn.zza();
        }
    }

    public CameraSource start() throws IOException {
        synchronized (this.zzb) {
            if (this.zzc != null) {
                return this;
            }
            this.zzc = zza();
            SurfaceTexture surfaceTexture = new SurfaceTexture(100);
            this.zzl = surfaceTexture;
            this.zzc.setPreviewTexture(surfaceTexture);
            this.zzc.startPreview();
            Thread thread = new Thread(this.zzn);
            this.zzm = thread;
            thread.setName("gms.vision.CameraSource");
            this.zzn.zza(true);
            Thread thread2 = this.zzm;
            if (thread2 != null) {
                thread2.start();
            }
            return this;
        }
    }

    public CameraSource start(SurfaceHolder surfaceHolder) throws IOException {
        synchronized (this.zzb) {
            if (this.zzc != null) {
                return this;
            }
            Camera cameraZza = zza();
            this.zzc = cameraZza;
            cameraZza.setPreviewDisplay(surfaceHolder);
            this.zzc.startPreview();
            this.zzm = new Thread(this.zzn);
            this.zzn.zza(true);
            Thread thread = this.zzm;
            if (thread != null) {
                thread.start();
            }
            return this;
        }
    }

    public void stop() {
        synchronized (this.zzb) {
            this.zzn.zza(false);
            Thread thread = this.zzm;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException unused) {
                }
                this.zzm = null;
            }
            Camera camera = this.zzc;
            if (camera != null) {
                camera.stopPreview();
                this.zzc.setPreviewCallbackWithBuffer(null);
                try {
                    this.zzc.setPreviewTexture(null);
                    this.zzl = null;
                    this.zzc.setPreviewDisplay(null);
                } catch (Exception e2) {
                    String strValueOf = String.valueOf(e2);
                    new StringBuilder(String.valueOf(strValueOf).length() + 32).append("Failed to clear camera preview: ").append(strValueOf).toString();
                }
                ((Camera) Preconditions.checkNotNull(this.zzc)).release();
                this.zzc = null;
                this.zzo.clear();
            } else {
                this.zzo.clear();
            }
        }
    }

    public void takePicture(@Nullable ShutterCallback shutterCallback, @Nullable PictureCallback pictureCallback) {
        synchronized (this.zzb) {
            if (this.zzc != null) {
                zzd zzdVar = new zzd();
                zzdVar.zza = shutterCallback;
                zzc zzcVar = new zzc();
                zzcVar.zza = pictureCallback;
                this.zzc.takePicture(zzdVar, null, null, zzcVar);
            }
        }
    }
}
