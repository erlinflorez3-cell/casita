package io.cobrowse;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.view.Surface;
import androidx.compose.animation.core.AnimationKt;
import com.google.android.gms.common.Scopes;
import com.google.common.base.Ascii;
import io.cobrowse.Encoder;
import io.sentry.protocol.SentryThread;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
final class H264Encoder extends Encoder {
    private static final int BITRATE = 524288;
    private static final int FRAME_RATE = 10;
    private static final Point FRAME_SIZE_CONSTRAINTS = new Point(16, 16);
    private static final int IFRAME_INTERVAL = 10;
    private static final int INTRA_REFRESH_PERIOD = 120;
    static final String MIME_TYPE = "video/avc";
    private final Iterable<String> boardNames;
    private byte[] configByte;
    private EncoderState encoder;
    private int equalFrameCount;
    private long generateIndex;
    private boolean isResetRequested;
    private Frame lastFrame;
    private byte[] lastFrameConvertedPixelsData;
    private int[] lastFramePixelsData;
    private final Handler mediaCodecHandler;
    private final HandlerThread mediaCodecHandlerThread;
    private final Object mediaCodecLock;
    private final BitmapScaleConverter scaleConverter;
    private Bitmap unprocessedFrame;
    private final Queue<Integer> unprocessedInputBuffers;

    /* JADX INFO: renamed from: io.cobrowse.H264Encoder$1 */
    class AnonymousClass1 extends ArrayList<String> {
        AnonymousClass1() {
            add(SystemProperties.read("ro.board.platform"));
            add(Build.BOARD);
        }
    }

    /* JADX INFO: renamed from: io.cobrowse.H264Encoder$2 */
    class AnonymousClass2 extends MediaCodec.Callback {
        AnonymousClass2() {
        }

        /* JADX INFO: renamed from: lambda$onError$2$io-cobrowse-H264Encoder$2 */
        /* synthetic */ void m8825lambda$onError$2$iocobrowseH264Encoder$2(MediaCodec.CodecException codecException) throws Throwable {
            H264Encoder h264Encoder = H264Encoder.this;
            Object[] objArr = {codecException};
            Constructor<?> constructor = Class.forName(C1561oA.Xd("2*@,y9/=7~\u0017EFDH", (short) (C1580rY.Xd() ^ (-10111)))).getConstructor(Class.forName(Wg.vd("wo\u0002m7vhvl4Wlsqva_j`", (short) (C1499aX.Xd() ^ (-24467)))));
            try {
                constructor.setAccessible(true);
                h264Encoder.raiseEncoderError((Error) constructor.newInstance(objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX INFO: renamed from: lambda$onInputBufferAvailable$0$io-cobrowse-H264Encoder$2 */
        /* synthetic */ void m8826lambda$onInputBufferAvailable$0$iocobrowseH264Encoder$2(int i2) {
            H264Encoder.this.unprocessedInputBuffers.add(Integer.valueOf(i2));
            H264Encoder.this.encodeNextFrameAsynchronously();
        }

        /* JADX INFO: renamed from: lambda$onOutputBufferAvailable$1$io-cobrowse-H264Encoder$2 */
        /* synthetic */ void m8827lambda$onOutputBufferAvailable$1$iocobrowseH264Encoder$2(int i2, MediaCodec.BufferInfo bufferInfo) {
            H264Encoder.this.readFrameFromBuffer(i2, bufferInfo);
        }

        /* JADX INFO: renamed from: lambda$onOutputFormatChanged$3$io-cobrowse-H264Encoder$2 */
        /* synthetic */ void m8828lambda$onOutputFormatChanged$3$iocobrowseH264Encoder$2(MediaFormat mediaFormat) {
            H264Encoder.this.readNewOutputFormat(mediaFormat);
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) throws Throwable {
            Qg.kd("d\u0010\u0002\u0011\r\u0014\u000f\u007fbg", (short) (C1580rY.Xd() ^ (-12394)), (short) (C1580rY.Xd() ^ (-21825)));
            hg.Vd("}{Q}|xz", (short) (C1633zX.Xd() ^ (-22293)), (short) (C1633zX.Xd() ^ (-427)));
            Handler handler = H264Encoder.this.mediaCodecHandler;
            Runnable runnable = new Runnable() { // from class: io.cobrowse.H264Encoder$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.m8825lambda$onError$2$iocobrowseH264Encoder$2(codecException);
                }
            };
            Class<?> cls = Class.forName(C1561oA.ud("[g\\ie^X!ad\u001e7O[PWO[", (short) (OY.Xd() ^ 4539)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (ZN.Xd() ^ 17046);
            int[] iArr = new int["KCUA\u000bJ<JP\u00189]STDF]W".length()];
            QB qb = new QB("KCUA\u000bJ<JP\u00189]STDF]W");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {runnable};
            Method method = cls.getMethod(C1561oA.Yd("##(*", (short) (Od.Xd() ^ (-2653))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, final int i2) throws Throwable {
            Handler handler = H264Encoder.this.mediaCodecHandler;
            Runnable runnable = new Runnable() { // from class: io.cobrowse.H264Encoder$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8826lambda$onInputBufferAvailable$0$iocobrowseH264Encoder$2(i2);
                }
            };
            short sXd = (short) (ZN.Xd() ^ 18830);
            short sXd2 = (short) (ZN.Xd() ^ 24799);
            int[] iArr = new int["cqhwupl7y~:Uo}t}w\u0006".length()];
            QB qb = new QB("cqhwupl7y~:Uo}t}w\u0006");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
                i3++;
            }
            Object[] objArr = {runnable};
            Method method = Class.forName(new String(iArr, 0, i3)).getMethod(ZO.xd("CMW\u0002", (short) (C1499aX.Xd() ^ (-16791)), (short) (C1499aX.Xd() ^ (-30480))), Class.forName(Jg.Wd("\u000b\bT0Vd2\u0005]\rr\u001eO\u001d\b9\u001d\u0006", (short) (Od.Xd() ^ (-12866)), (short) (Od.Xd() ^ (-383)))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(MediaCodec mediaCodec, final int i2, final MediaCodec.BufferInfo bufferInfo) throws Throwable {
            Handler handler = H264Encoder.this.mediaCodecHandler;
            Runnable runnable = new Runnable() { // from class: io.cobrowse.H264Encoder$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8827lambda$onOutputBufferAvailable$1$iocobrowseH264Encoder$2(i2, bufferInfo);
                }
            };
            Class<?> cls = Class.forName(C1626yg.Ud("\u0018\u001a+\u0001\u0001\u001d)_V9*\r2Jw$kl", (short) (FB.Xd() ^ 20695), (short) (FB.Xd() ^ 27111)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1499aX.Xd() ^ (-17354));
            int[] iArr = new int["\u000f=\u0001\u0007L^Cw&\\\u0003\u0004.4\u001f\u00027J".length()];
            QB qb = new QB("\u000f=\u0001\u0007L^Cw&\\\u0003\u0004.4\u001f\u00027J");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i3));
            Object[] objArr = {runnable};
            Method method = cls.getMethod(EO.Od("\"I}%", (short) (C1580rY.Xd() ^ (-27819))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) throws Throwable {
            String str = C1561oA.Qd("kiInlgki:bd^Qc1UMYQNL", (short) (C1580rY.Xd() ^ (-29708))) + mediaFormat;
            C1593ug.zd("\u001eK?PNWTG,3", (short) (OY.Xd() ^ 30975), (short) (OY.Xd() ^ 23647));
            Handler handler = H264Encoder.this.mediaCodecHandler;
            Runnable runnable = new Runnable() { // from class: io.cobrowse.H264Encoder$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8828lambda$onOutputFormatChanged$3$iocobrowseH264Encoder$2(mediaFormat);
                }
            };
            short sXd = (short) (Od.Xd() ^ (-8421));
            int[] iArr = new int["\u0016\"\u0017$ \u0019\u0013[\u001c\u001fXq\n\u0016\u000b\u0012\n\u0016".length()];
            QB qb = new QB("\u0016\"\u0017$ \u0019\u0013[\u001c\u001fXq\n\u0016\u000b\u0012\n\u0016");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[1];
            short sXd2 = (short) (OY.Xd() ^ 13812);
            int[] iArr2 = new int["\u0019\u0011'\u0013` \u0016$\u001ee\u000b/)*\u001e +%".length()];
            QB qb2 = new QB("\u0019\u0011'\u0013` \u0016$\u001ee\u000b/)*\u001e +%");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr = {runnable};
            Method method = cls.getMethod(Wg.Zd("bAz\u0012", (short) (C1607wl.Xd() ^ 8691), (short) (C1607wl.Xd() ^ 9296)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private static class EncoderState {
        private final int colorFormat;
        private final MediaCodec mediaCodec;

        EncoderState(MediaCodec mediaCodec, int i2) {
            this.mediaCodec = mediaCodec;
            this.colorFormat = i2;
        }

        public void destroy() {
            try {
                this.mediaCodec.stop();
                this.mediaCodec.release();
            } catch (IllegalStateException e2) {
            }
        }
    }

    private static class RecognizedColorFormats {
        private RecognizedColorFormats() {
        }

        private static int COLOR_Format32bitABGR8888() {
            return 2130747392;
        }

        private static int COLOR_FormatYUV420Flexible() {
            return 2135033992;
        }

        private static int COLOR_FormatYUV420PackedPlanar() {
            return 20;
        }

        private static int COLOR_FormatYUV420PackedSemiPlanar() {
            return 39;
        }

        private static int COLOR_FormatYUV420Planar() {
            return 19;
        }

        private static int COLOR_FormatYUV420SemiPlanar() {
            return 21;
        }

        private static int COLOR_TI_FormatYUV420PackedSemiPlanar() {
            return 2130706688;
        }

        public static ArrayList<Integer> get() {
            ArrayList<Integer> arrayList = new ArrayList<>();
            if (Build.VERSION.SDK_INT < 31) {
                arrayList.add(Integer.valueOf(COLOR_FormatYUV420SemiPlanar()));
            }
            arrayList.add(Integer.valueOf(COLOR_TI_FormatYUV420PackedSemiPlanar()));
            if (Build.VERSION.SDK_INT != 33) {
                arrayList.add(Integer.valueOf(COLOR_FormatYUV420Flexible()));
                arrayList.add(Integer.valueOf(COLOR_FormatYUV420Planar()));
            } else {
                arrayList.add(Integer.valueOf(COLOR_FormatYUV420Planar()));
                arrayList.add(Integer.valueOf(COLOR_FormatYUV420Flexible()));
            }
            arrayList.add(Integer.valueOf(COLOR_Format32bitABGR8888()));
            arrayList.add(Integer.valueOf(COLOR_FormatYUV420PackedPlanar()));
            return arrayList;
        }
    }

    H264Encoder(Encoder.Delegate delegate) {
        this(delegate, null);
    }

    H264Encoder(Encoder.Delegate delegate, Handler handler) {
        super(delegate, handler);
        this.unprocessedInputBuffers = new LinkedList();
        HandlerThread handlerThread = new HandlerThread("H264Encoder");
        this.mediaCodecHandlerThread = handlerThread;
        handlerThread.start();
        this.mediaCodecHandler = new Handler(handlerThread.getLooper());
        this.mediaCodecLock = new Object();
        this.scaleConverter = new BitmapScaleConverter();
        this.boardNames = new ArrayList<String>() { // from class: io.cobrowse.H264Encoder.1
            AnonymousClass1() {
                add(SystemProperties.read("ro.board.platform"));
                add(Build.BOARD);
            }
        };
    }

    private static long computePresentationTime(long j2) {
        return ((j2 * AnimationKt.MillisToNanos) / 10) + 132;
    }

    private MediaCodec createMediaCodec(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat) {
        try {
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(mediaCodecInfo.getName());
            mediaCodecCreateByCodecName.setCallback(getMediaCodecCallback());
            try {
                mediaCodecCreateByCodecName.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                mediaCodecCreateByCodecName.start();
                return mediaCodecCreateByCodecName;
            } catch (IllegalStateException e2) {
                mediaCodecCreateByCodecName.release();
                throw new IllegalStateException("Cannot configure MediaCodec instance", e2);
            }
        } catch (IOException e3) {
            throw new UnsupportedOperationException("Cannot create a MediaCodec instance", e3);
        }
    }

    private MediaFormat createMediaFormat(MediaCodecInfo.CodecCapabilities codecCapabilities, int i2, int i3, int i4) {
        int iFindDesiredQuality;
        MediaCodecInfo.CodecProfileLevel codecProfileLevelFindProfileAndLevel;
        if (!isSizeSupported(codecCapabilities, i2, i3)) {
            throw new UnsupportedOperationException(String.format("Size %d:%d is not supported by codec", Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(MIME_TYPE, i2, i3);
        mediaFormatCreateVideoFormat.setInteger("bitrate", 524288);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 10);
        mediaFormatCreateVideoFormat.setInteger("color-format", i4);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 10);
        if (codecCapabilities.isFeatureSupported("intra-refresh") && !isUnreliableIntraRefresh()) {
            mediaFormatCreateVideoFormat.setInteger("intra-refresh-period", 120);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", -1);
        }
        if (!isUnreliableProfileAndLevel() && (codecProfileLevelFindProfileAndLevel = findProfileAndLevel(codecCapabilities)) != null) {
            mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, codecProfileLevelFindProfileAndLevel.profile);
            mediaFormatCreateVideoFormat.setInteger("level", codecProfileLevelFindProfileAndLevel.level);
        }
        if (Build.VERSION.SDK_INT >= 28 && (iFindDesiredQuality = findDesiredQuality(codecCapabilities)) > 0) {
            mediaFormatCreateVideoFormat.setInteger("quality", iFindDesiredQuality);
        }
        mediaFormatCreateVideoFormat.setInteger(SentryThread.JsonKeys.PRIORITY, 0);
        Integer numFindDesiredComplexity = findDesiredComplexity(codecCapabilities);
        if (numFindDesiredComplexity != null) {
            mediaFormatCreateVideoFormat.setInteger("complexity", numFindDesiredComplexity.intValue());
        }
        mediaFormatCreateVideoFormat.setInteger("latency", 0);
        if (Build.VERSION.SDK_INT >= 30 && codecCapabilities.isFeatureSupported("low-latency")) {
            mediaFormatCreateVideoFormat.setInteger("low-latency", 1);
        }
        return mediaFormatCreateVideoFormat;
    }

    private void destroyCodec() {
        synchronized (this.mediaCodecLock) {
            if (isMediaCodecRunning()) {
                this.encoder.destroy();
                this.encoder = null;
            }
            this.scaleConverter.clear();
            this.lastFrameConvertedPixelsData = null;
            this.lastFramePixelsData = null;
            this.lastFrame = null;
            this.unprocessedFrame = null;
            this.unprocessedInputBuffers.clear();
            this.isResetRequested = false;
        }
    }

    private Bitmap downscaleForCodec(MediaCodecInfo.CodecCapabilities codecCapabilities, Bitmap bitmap) {
        if (isSizeSupported(codecCapabilities, bitmap.getWidth(), bitmap.getHeight())) {
            return bitmap;
        }
        return this.scaleConverter.downscale(bitmap, Math.min(((Integer) codecCapabilities.getVideoCapabilities().getSupportedWidths().getUpper()).intValue() / bitmap.getWidth(), ((Integer) codecCapabilities.getVideoCapabilities().getSupportedHeights().getUpper()).intValue() / bitmap.getHeight()), FRAME_SIZE_CONSTRAINTS);
    }

    private Bitmap downscaleForCodec(MediaFormat mediaFormat, Bitmap bitmap) {
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        return (bitmap.getWidth() == integer && bitmap.getHeight() == integer2) ? bitmap : this.scaleConverter.createScaledBitmap(bitmap, integer, integer2);
    }

    private void encodeNextFrame() throws Throwable {
        Handler handler = this.mediaCodecHandler;
        Runnable runnable = new Runnable() { // from class: io.cobrowse.H264Encoder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.encodeNextFrameAsynchronously();
            }
        };
        short sXd = (short) (C1580rY.Xd() ^ (-22529));
        int[] iArr = new int["\u0019'\u001e-+&\"l/4o\u000b%3*3-;".length()];
        QB qb = new QB("\u0019'\u001e-+&\"l/4o\u000b%3*3-;");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Object[] objArr = {runnable};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Qg.kd("[Y\\\\", (short) (FB.Xd() ^ 27561), (short) (FB.Xd() ^ 10546)), Class.forName(Wg.vd("YQcO\u0019XJX^&GkabRTKE", (short) (ZN.Xd() ^ 3417))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void encodeNextFrameAsynchronously() {
        Bitmap bitmap = this.unprocessedFrame;
        if (this.unprocessedInputBuffers.isEmpty() || bitmap == null) {
            return;
        }
        this.unprocessedFrame = null;
        writeFrameToBuffer(bitmap, this.unprocessedInputBuffers.remove().intValue());
    }

    private int findColorFormat(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        for (Integer num : RecognizedColorFormats.get()) {
            for (int i2 : codecCapabilities.colorFormats) {
                if (num.intValue() == i2) {
                    return i2;
                }
            }
        }
        return 21;
    }

    private static Integer findDesiredComplexity(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        Range<Integer> complexityRange = codecCapabilities.getEncoderCapabilities().getComplexityRange();
        if (complexityRange != null) {
            return (Integer) complexityRange.getLower();
        }
        return null;
    }

    private static int findDesiredQuality(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        Range<Integer> qualityRange = codecCapabilities.getEncoderCapabilities().getQualityRange();
        if (qualityRange == null || ((Integer) qualityRange.getUpper()).equals(qualityRange.getLower())) {
            return 0;
        }
        return (((Integer) qualityRange.getUpper()).intValue() + ((Integer) qualityRange.getLower()).intValue()) / 2;
    }

    private static ArrayList<MediaCodecInfo> findMediaCodecs(String str) {
        ArrayList<MediaCodecInfo> arrayList = new ArrayList<>();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str) && !isBrokenCodec(codecInfoAt)) {
                        arrayList.add(codecInfoAt);
                    }
                }
            }
        }
        return arrayList;
    }

    private static MediaCodecInfo.CodecProfileLevel findProfileAndLevel(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (codecCapabilities.profileLevels != null && codecCapabilities.profileLevels.length != 0) {
            for (Integer num : getRecognizedProfiles()) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
                    if (num.intValue() == codecProfileLevel.profile) {
                        return codecProfileLevel;
                    }
                }
            }
        }
        return null;
    }

    private MediaCodec.Callback getMediaCodecCallback() {
        return new AnonymousClass2();
    }

    private static ArrayList<Integer> getRecognizedProfiles() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(8);
        arrayList.add(2);
        arrayList.add(1);
        return arrayList;
    }

    private static boolean isARGB8888PlanarFormat(int i2) {
        return i2 == 2130747392;
    }

    private static boolean isBrokenCodec(MediaCodecInfo mediaCodecInfo) {
        return Build.VERSION.SDK_INT == 33 && mediaCodecInfo.getName().equals("c2.v4l2.avc.encoder");
    }

    private static boolean isI420PlanarFormat(int i2) {
        return i2 == 19 || i2 == 20;
    }

    private boolean isMediaCodecRunning() {
        return this.encoder != null;
    }

    private static boolean isSizeSupported(MediaCodecInfo.CodecCapabilities codecCapabilities, int i2, int i3) {
        return codecCapabilities.getVideoCapabilities().isSizeSupported(i2, i3);
    }

    public static boolean isSupported() {
        return !findMediaCodecs(MIME_TYPE).isEmpty();
    }

    private boolean isUnreliableIntraRefresh() {
        for (String str : this.boardNames) {
            if (str != null && !str.isEmpty()) {
                if (str.equalsIgnoreCase("msm8996")) {
                    return Build.VERSION.SDK_INT == 26;
                }
                if (str.equalsIgnoreCase("msm8953")) {
                    return Build.VERSION.SDK_INT == 28;
                }
            }
        }
        return false;
    }

    private boolean isUnreliableProfileAndLevel() {
        for (String str : this.boardNames) {
            if (str != null && !str.isEmpty()) {
                if (str.equalsIgnoreCase("msm8953")) {
                    return true;
                }
                if (str.equalsIgnoreCase("sdm660")) {
                    return Build.VERSION.SDK_INT < 29;
                }
            }
        }
        return false;
    }

    private static boolean isYUV420FlexibleFormat(int i2) {
        return i2 == 2135033992;
    }

    private Bitmap prepareNextFrame(Bitmap bitmap) {
        if (isMediaCodecRunning()) {
            return downscaleForCodec(this.encoder.mediaCodec.getInputFormat(), bitmap);
        }
        for (MediaCodecInfo mediaCodecInfo : findMediaCodecs(MIME_TYPE)) {
            try {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(MIME_TYPE);
                bitmap = downscaleForCodec(capabilitiesForType, bitmap);
                int iFindColorFormat = findColorFormat(capabilitiesForType);
                String.format("Color format 0x%x will be used", Integer.valueOf(iFindColorFormat));
                this.encoder = new EncoderState(createMediaCodec(mediaCodecInfo, createMediaFormat(capabilitiesForType, bitmap.getWidth(), bitmap.getHeight(), iFindColorFormat)), iFindColorFormat);
                return bitmap;
            } catch (Exception e2) {
                String.format("Failed to initialize %s codec", mediaCodecInfo.getName());
            }
        }
        throw new UnsupportedOperationException("Failed to initialise an encoder: there is none that supports H264");
    }

    public void readFrameFromBuffer(int i2, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.mediaCodecLock) {
            if (isMediaCodecRunning()) {
                ByteBuffer outputBuffer = this.encoder.mediaCodec.getOutputBuffer(i2);
                if (outputBuffer == null) {
                    return;
                }
                int i3 = bufferInfo.size;
                byte[] bArr = new byte[i3];
                outputBuffer.get(bArr, 0, i3);
                Error error = null;
                if ((bufferInfo.flags & 2) != 0) {
                    this.configByte = bArr;
                    byte b2 = bArr[4];
                    if ((b2 + Ascii.US) - (b2 | Ascii.US) == 7) {
                        bArr[6] = (byte) ((-1) - (((-1) - bArr[6]) & ((-1) - 16)));
                    }
                    bArr = null;
                } else if ((bufferInfo.flags & 1) != 0) {
                    byte[] bArr2 = this.configByte;
                    if (bArr2 == null) {
                        hg.Vd("d\u0010\u0002\u0011\r\u0014\u000f\u007fbg", (short) (FB.Xd() ^ 30336), (short) (FB.Xd() ^ 32487));
                        C1561oA.ud("\u0016>2=11=i9:6*:'(&`!^)\"5Z +\u0019$\u001bT+\u001c&\u0019\u001f$\"L~z|H\t\u0015\nDsrt@\u0004\u007f\u0012}", (short) (OY.Xd() ^ 10023));
                        Object[] objArr = {C1561oA.yd("5_UbXZh\u0017hki_q`cc b\"ni~&mzjwp,\u0005w\u00048@GGs(&*w:H?{-.2\u007fECWE", (short) (OY.Xd() ^ 3848))};
                        Constructor<?> constructor = Class.forName(C1561oA.Yd("ph~j8wm{u=U\u0004\u0005\u0003\u0007", (short) (C1580rY.Xd() ^ (-24583)))).getConstructor(Class.forName(Xg.qd("\b\u007f\u0016\u0002O\u000f\u0005\u0013\rTz\u001d\u001c\u0014\u001a\u0014", (short) (C1499aX.Xd() ^ (-13898)), (short) (C1499aX.Xd() ^ (-30770)))));
                        try {
                            constructor.setAccessible(true);
                            bArr = null;
                            error = (Error) constructor.newInstance(objArr);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } else {
                        byte[] bArr3 = new byte[bArr2.length + i3];
                        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                        System.arraycopy(bArr, 0, bArr3, this.configByte.length, i3);
                        bArr = bArr3;
                    }
                }
                this.encoder.mediaCodec.releaseOutputBuffer(i2, false);
                if (bArr != null) {
                    raiseEncodedFrameData(bArr);
                } else if (error != null) {
                    raiseEncoderError(error);
                }
            }
        }
    }

    public void readNewOutputFormat(MediaFormat mediaFormat) {
        synchronized (this.mediaCodecLock) {
            if (isMediaCodecRunning()) {
                ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
                if (byteBuffer != null && byteBuffer2 != null) {
                    byte[] bArrArray = byteBuffer.array();
                    byte[] bArrArray2 = byteBuffer2.array();
                    byte[] bArr = new byte[bArrArray.length + bArrArray2.length];
                    this.configByte = bArr;
                    System.arraycopy(bArrArray, 0, bArr, 0, bArrArray.length);
                    System.arraycopy(bArrArray2, 0, this.configByte, bArrArray.length, bArrArray2.length);
                }
            }
        }
    }

    private void writeFrameToBuffer(Bitmap bitmap, int i2) {
        int length;
        synchronized (this.mediaCodecLock) {
            if (isMediaCodecRunning()) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (this.lastFramePixelsData == null) {
                    this.lastFramePixelsData = new int[width * height];
                }
                bitmap.getPixels(this.lastFramePixelsData, 0, width, 0, 0, width, height);
                ByteBuffer inputBuffer = this.encoder.mediaCodec.getInputBuffer(i2);
                if (inputBuffer == null) {
                    String str = "MediaCodec failed to return an input buffer #" + i2;
                    return;
                }
                if (isYUV420FlexibleFormat(this.encoder.colorFormat)) {
                    if (this.lastFrameConvertedPixelsData == null) {
                        this.lastFrameConvertedPixelsData = new byte[((width * height) * 3) / 2];
                    }
                    PixelFormatConverter.argb2i420(this.lastFramePixelsData, this.lastFrameConvertedPixelsData, width, height);
                    length = inputBuffer.capacity();
                    Image inputImage = this.encoder.mediaCodec.getInputImage(i2);
                    if (inputImage == null) {
                        String str2 = "MediaCodec failed to return an input image #" + i2;
                        return;
                    } else if (inputImage.getFormat() != 35) {
                        return;
                    } else {
                        writeYuvToImage(this.lastFrameConvertedPixelsData, inputImage);
                    }
                } else {
                    if (isARGB8888PlanarFormat(this.encoder.colorFormat)) {
                        if (this.lastFrameConvertedPixelsData == null) {
                            this.lastFrameConvertedPixelsData = new byte[width * height * 4];
                        }
                        PixelFormatConverter.argb2rgba(this.lastFramePixelsData, this.lastFrameConvertedPixelsData, width, height);
                    } else if (isI420PlanarFormat(this.encoder.colorFormat)) {
                        if (this.lastFrameConvertedPixelsData == null) {
                            this.lastFrameConvertedPixelsData = new byte[((width * height) * 3) / 2];
                        }
                        PixelFormatConverter.argb2i420(this.lastFramePixelsData, this.lastFrameConvertedPixelsData, width, height);
                    } else {
                        if (this.lastFrameConvertedPixelsData == null) {
                            this.lastFrameConvertedPixelsData = new byte[((width * height) * 3) / 2];
                        }
                        PixelFormatConverter.argb2nv12(this.lastFramePixelsData, this.lastFrameConvertedPixelsData, width, height);
                    }
                    length = this.lastFrameConvertedPixelsData.length;
                    inputBuffer.clear();
                    inputBuffer.put(this.lastFrameConvertedPixelsData);
                }
                this.encoder.mediaCodec.queueInputBuffer(i2, 0, length, computePresentationTime(this.generateIndex), 1);
                this.generateIndex++;
            }
        }
    }

    private static void writeYuvToImage(byte[] bArr, Image image) {
        int i2;
        int i3;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int width = image.getWidth();
        int height = image.getHeight();
        Image.Plane[] planes = image.getPlanes();
        for (int i4 = 0; i4 < planes.length; i4++) {
            ByteBuffer buffer = planes[i4].getBuffer();
            int pixelStride = planes[i4].getPixelStride();
            if (i4 > 0) {
                i2 = ((width * height) * (i4 + 3)) / 4;
                i3 = 2;
            } else {
                i2 = 0;
                i3 = 1;
            }
            for (int i5 = 0; i5 < height / i3; i5++) {
                byteBufferWrap.position(((i5 * width) / i3) + i2);
                buffer.position(planes[i4].getRowStride() * i5);
                int i6 = 0;
                while (true) {
                    int i7 = width / i3;
                    if (i6 < i7) {
                        buffer.put(byteBufferWrap.get());
                        if (pixelStride > 1 && i6 != i7 - 1) {
                            buffer.position((buffer.position() + pixelStride) - 1);
                        }
                        i6++;
                    }
                }
            }
        }
    }

    @Override // io.cobrowse.Encoder
    public void destroy() {
        destroyCodec();
        this.mediaCodecHandlerThread.quitSafely();
        super.destroy();
    }

    @Override // io.cobrowse.Encoder
    public void encode(Frame frame) throws Throwable {
        Frame frame2;
        if (this.isResetRequested || !((frame2 = this.lastFrame) == null || frame.sameSizeAs(frame2))) {
            Frame frame3 = this.lastFrame;
            if (frame3 != null && !frame.sameSizeAs(frame3)) {
                short sXd = (short) (OY.Xd() ^ 15483);
                short sXd2 = (short) (OY.Xd() ^ 9553);
                int[] iArr = new int["@L%)m)\u000bp\\F".length()];
                QB qb = new QB("@L%)m)\u000bp\\F");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                    i2++;
                }
                new String(iArr, 0, i2);
                short sXd3 = (short) (C1633zX.Xd() ^ (-16497));
                short sXd4 = (short) (C1633zX.Xd() ^ (-30992));
                int[] iArr2 = new int["_\u0018zLD\u0019/V~R\r\u001eS[\u0016q8fhc^GB\u0005'\u001bId.\u0010rJNh\u0013g}ty^F'#\\T>]Ik\u000eI{iy|\u0012 \u0015q`\u000b&_b".length()];
                QB qb2 = new QB("_\u0018zLD\u0019/V~R\r\u001eS[\u0016q8fhc^GB\u0005'\u001bId.\u0010rJNh\u0013g}ty^F'#\\T>]Ik\u000eI{iy|\u0012 \u0015q`\u000b&_b");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                    i3++;
                }
                new String(iArr2, 0, i3);
                destroyCodec();
            }
            this.equalFrameCount = 0;
            this.isResetRequested = false;
        } else {
            Frame frame4 = this.lastFrame;
            if (frame4 == null || !frame.sameSizeAs(frame4) || frame.isDirty()) {
                this.equalFrameCount = 0;
            } else {
                int i4 = this.equalFrameCount + 1;
                this.equalFrameCount = i4;
                if (i4 > 5) {
                    return;
                }
            }
        }
        Bitmap bitmapDownscale = this.scaleConverter.downscale(frame.getBitmap(), frame.getScale(), FRAME_SIZE_CONSTRAINTS);
        try {
            this.lastFrame = frame;
            this.unprocessedFrame = prepareNextFrame(bitmapDownscale);
            encodeNextFrame();
        } catch (Exception e2) {
            this.lastFrame = null;
            this.unprocessedFrame = null;
            Object[] objArr = {e2};
            Constructor<?> constructor = Class.forName(C1626yg.Ud("8Lz\u0018P^o\u000e\u0010L\u000fKN\\&", (short) (OY.Xd() ^ 23449), (short) (OY.Xd() ^ 29648))).getConstructor(Class.forName(Ig.wd("f&Ygke27]Sc\u000eit|\u007f\\H\u0019", (short) (C1607wl.Xd() ^ 2332))));
            try {
                constructor.setAccessible(true);
                raiseEncoderError((Error) constructor.newInstance(objArr));
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    @Override // io.cobrowse.Encoder
    public int maximumFramesInFlight() {
        return 60;
    }

    @Override // io.cobrowse.Encoder
    public String mimeType() {
        return MIME_TYPE;
    }

    @Override // io.cobrowse.Encoder
    public void reset() {
        if (isMediaCodecRunning()) {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.encoder.mediaCodec.setParameters(bundle);
        }
        this.isResetRequested = true;
    }
}
