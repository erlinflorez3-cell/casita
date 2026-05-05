package com.hbisoft.hbrecorder;

import android.content.Context;
import android.content.res.Resources;
import android.media.CamcorderProfile;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import io.sentry.rrweb.RRWebVideoEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes7.dex */
public class HBRecorderCodecInfo {
    private Context context;
    ArrayList<String> supportedVideoFormats = new ArrayList<>();
    ArrayList<String> supportedAudioFormats = new ArrayList<>();
    HashMap<String, String> mVideoMap = new HashMap<>();
    HashMap<String, String> mAudioMap = new HashMap<>();

    static final class RecordingInfo {
        final int density;
        final int frameRate;
        final int height;
        final int width;

        RecordingInfo(int i2, int i3, int i4, int i5) {
            this.width = i2;
            this.height = i3;
            this.frameRate = i4;
            this.density = i5;
        }
    }

    static RecordingInfo calculateRecordingInfo(int i2, int i3, int i4, boolean z2, int i5, int i6, int i7, int i8) {
        int i9 = (i2 * i8) / 100;
        int i10 = (i3 * i8) / 100;
        if (i5 == -1 && i6 == -1) {
            return new RecordingInfo(i9, i10, i7, i4);
        }
        int i11 = z2 ? i5 : i6;
        if (z2) {
            i5 = i6;
        }
        if (i11 >= i9 && i5 >= i10) {
            return new RecordingInfo(i9, i10, i7, i4);
        }
        if (z2) {
            i11 = (i9 * i5) / i10;
        } else {
            i5 = (i10 * i11) / i9;
        }
        return new RecordingInfo(i11, i5, i7, i4);
    }

    private void checkIfSupportedAudioMimeTypes() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (codecInfoAt.isEncoder()) {
                for (String str : codecInfoAt.getSupportedTypes()) {
                    if (str.contains("audio")) {
                        this.mAudioMap.put(codecInfoAt.getName(), str);
                    }
                }
            }
        }
    }

    private void checkIfSupportedVideoMimeTypes() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (codecInfoAt.isEncoder()) {
                for (String str : codecInfoAt.getSupportedTypes()) {
                    if (str.contains(RRWebVideoEvent.EVENT_TAG)) {
                        this.mVideoMap.put(codecInfoAt.getName(), str);
                    }
                }
            }
        }
    }

    private void checkSupportedAudioFormats(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.contains("audio")) {
                        str.hashCode();
                        switch (str) {
                            case "audio/x-hx-aac-adts":
                                this.supportedAudioFormats.add("AAC_ADTS");
                                return;
                            case "audio/amr_nb":
                                this.supportedAudioFormats.add("AMR_NB");
                                return;
                            case "audio/amr_wb":
                                this.supportedAudioFormats.add("AMR_WB");
                                return;
                            case "audio/ogg":
                                this.supportedAudioFormats.add("OGG");
                                return;
                        }
                    }
                }
            }
        }
    }

    private void checkSupportedVideoFormats(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.contains(RRWebVideoEvent.EVENT_TAG)) {
                        str.hashCode();
                        switch (str) {
                            case "video/3gpp":
                                this.supportedVideoFormats.add("THREE_GPP");
                                return;
                            case "video/MP2T":
                                this.supportedVideoFormats.add("MPEG_2_TS");
                                return;
                            case "video/mp4v":
                                if (this.supportedVideoFormats.contains("MPEG_4")) {
                                    return;
                                }
                                this.supportedVideoFormats.add("MPEG_4");
                                return;
                            case "video/webm":
                                if (this.supportedVideoFormats.contains("WEBM")) {
                                    return;
                                }
                                this.supportedVideoFormats.add("WEBM");
                                return;
                            case "video/video/x-vnd.on2.vp8":
                                if (this.supportedVideoFormats.contains("WEBM")) {
                                    return;
                                }
                                this.supportedVideoFormats.add("WEBM");
                                return;
                            case "video/mp4v-es":
                                if (this.supportedVideoFormats.contains("MPEG_4")) {
                                    return;
                                }
                                this.supportedVideoFormats.add("MPEG_4");
                                return;
                            case "video/avc":
                                if (this.supportedVideoFormats.contains("MPEG_4")) {
                                    return;
                                }
                                this.supportedVideoFormats.add("MPEG_4");
                                return;
                            case "video/mp4":
                                if (this.supportedVideoFormats.contains("MPEG_4")) {
                                    return;
                                }
                                this.supportedVideoFormats.add("MPEG_4");
                                return;
                        }
                    }
                }
            }
        }
    }

    private RecordingInfo getRecordingInfo() throws Throwable {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Context context = this.context;
        String strYd = C1561oA.Yd("L?E<HQ", (short) (C1499aX.Xd() ^ (-26122)));
        short sXd = (short) (OY.Xd() ^ 14610);
        short sXd2 = (short) (OY.Xd() ^ 7173);
        int[] iArr = new int[")7.=;62|3@@G9CJ\u0005\u001bHHOAUR".length()];
        QB qb = new QB(")7.=;62|3@@G9CJ\u0005\u001bHHOAUR");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Object[] objArr = {strYd};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(ZO.xd("\u0011>y\u0017(\tU{|T#-\u001c|@\u0010", (short) (C1580rY.Xd() ^ (-21690)), (short) (C1580rY.Xd() ^ (-31133))), Class.forName(Jg.Wd("eC\u00146JH\u0019]\u001e$\u0005}Cy:j", (short) (ZN.Xd() ^ 22749), (short) (ZN.Xd() ^ 8079))));
        try {
            method.setAccessible(true);
            ((WindowManager) method.invoke(context, objArr)).getDefaultDisplay().getRealMetrics(displayMetrics);
            int i3 = displayMetrics.widthPixels;
            int i4 = displayMetrics.heightPixels;
            int i5 = displayMetrics.densityDpi;
            Context context2 = this.context;
            short sXd3 = (short) (C1580rY.Xd() ^ (-10390));
            short sXd4 = (short) (C1580rY.Xd() ^ (-25228));
            int[] iArr2 = new int["W\u0014p_>Y|iW^\u0013>y~\b\u000eLT;L.Ry".length()];
            QB qb2 = new QB("W\u0014p_>Y|iW^\u0013>y~\b\u000eLT;L.Ry");
            int i6 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i6] = xuXd2.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i6 * sXd4))) + xuXd2.CK(iKK2));
                i6++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr2, 0, i6)).getMethod(Ig.wd("A\u0011k3D\u000e [\u0002d^8", (short) (ZN.Xd() ^ 18325)), new Class[0]);
            try {
                method2.setAccessible(true);
                boolean z2 = ((Resources) method2.invoke(context2, objArr2)).getConfiguration().orientation == 2;
                CamcorderProfile camcorderProfile = CamcorderProfile.get(1);
                return calculateRecordingInfo(i3, i4, i5, z2, camcorderProfile != null ? camcorderProfile.videoFrameWidth : -1, camcorderProfile != null ? camcorderProfile.videoFrameHeight : -1, camcorderProfile != null ? camcorderProfile.videoFrameRate : 30, 100);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private String returnTypeFromMime(String str) {
        str.hashCode();
        switch (str) {
            case "video/3gpp":
                return "THREE_GPP";
            case "video/MP2T":
                return "MPEG_2_TS";
            case "video/mp4v":
                return "MPEG_4";
            case "video/webm":
                return "WEBM";
            case "video/mp4v-es":
            case "video/avc":
            case "video/mp4":
                return "MPEG_4";
            case "video/x-vnd.on2.vp8":
                return "WEBM";
            default:
                return "";
        }
    }

    private String selectCodecByMime(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt.getName();
                    }
                }
            }
        }
        return "Mime not supported";
    }

    private MediaCodecInfo selectDefaultCodec() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (int i3 = 0; i3 < supportedTypes.length; i3++) {
                    if (supportedTypes[i3].contains(RRWebVideoEvent.EVENT_TAG)) {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(supportedTypes[i3]);
                        if (capabilitiesForType.isFormatSupported(capabilitiesForType.getDefaultFormat())) {
                            return codecInfoAt;
                        }
                    }
                }
            }
        }
        return null;
    }

    public String getDefaultVideoEncoderName(String str) {
        try {
            return selectCodecByMime(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public String getDefaultVideoFormat() {
        try {
            MediaCodecInfo mediaCodecInfoSelectDefaultCodec = selectDefaultCodec();
            if (mediaCodecInfoSelectDefaultCodec == null) {
                return "null";
            }
            for (String str : mediaCodecInfoSelectDefaultCodec.getSupportedTypes()) {
                if (str.contains(RRWebVideoEvent.EVENT_TAG)) {
                    String string = mediaCodecInfoSelectDefaultCodec.getCapabilitiesForType(str).getDefaultFormat().toString();
                    return returnTypeFromMime(string.substring(string.indexOf("=") + 1, string.indexOf(",")));
                }
            }
            return "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public int getMaxSupportedBitrate(String str) {
        int i2 = 0;
        try {
            MediaCodecInfo mediaCodecInfoSelectVideoCodec = selectVideoCodec(str);
            String[] supportedTypes = mediaCodecInfoSelectVideoCodec.getSupportedTypes();
            int length = supportedTypes.length;
            int iIntValue = 0;
            while (i2 < length) {
                try {
                    String str2 = supportedTypes[i2];
                    if (str2.contains(RRWebVideoEvent.EVENT_TAG)) {
                        iIntValue = ((Integer) mediaCodecInfoSelectVideoCodec.getCapabilitiesForType(str2).getVideoCapabilities().getBitrateRange().getUpper()).intValue();
                    }
                    i2++;
                } catch (Exception e2) {
                    e = e2;
                    i2 = iIntValue;
                    e.printStackTrace();
                    return i2;
                }
            }
            return iIntValue;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public double getMaxSupportedFrameRate(int i2, int i3, String str) {
        double dDoubleValue = 0.0d;
        try {
            MediaCodecInfo mediaCodecInfoSelectVideoCodec = selectVideoCodec(str);
            for (String str2 : mediaCodecInfoSelectVideoCodec.getSupportedTypes()) {
                if (str2.contains(RRWebVideoEvent.EVENT_TAG)) {
                    dDoubleValue = ((Double) mediaCodecInfoSelectVideoCodec.getCapabilitiesForType(str2).getVideoCapabilities().getSupportedFrameRatesFor(i3, i2).getUpper()).doubleValue();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return dDoubleValue;
    }

    int getMaxSupportedHeight() {
        return getRecordingInfo().height;
    }

    int getMaxSupportedWidth() {
        return getRecordingInfo().width;
    }

    public ArrayList<String> getSupportedAudioFormats() {
        String[] strArr = {"audio/amr_nb", "audio/amr_wb", "audio/x-hx-aac-adts", "audio/ogg"};
        for (int i2 = 0; i2 < 4; i2++) {
            checkSupportedAudioFormats(strArr[i2]);
        }
        return this.supportedAudioFormats;
    }

    public HashMap<String, String> getSupportedAudioMimeTypes() {
        checkIfSupportedAudioMimeTypes();
        return this.mAudioMap;
    }

    public ArrayList<String> getSupportedVideoFormats() {
        String[] strArr = {"video/MP2T", "video/mp4v-es", "video/m4v", "video/mp4", "video/avc", "video/3gpp", "video/webm", "video/x-vnd.on2.vp8"};
        for (int i2 = 0; i2 < 8; i2++) {
            checkSupportedVideoFormats(strArr[i2]);
        }
        return this.supportedVideoFormats;
    }

    public HashMap<String, String> getSupportedVideoMimeTypes() {
        checkIfSupportedVideoMimeTypes();
        return this.mVideoMap;
    }

    public boolean isMimeTypeSupported(String str) {
        try {
            for (String str2 : selectVideoCodec(str).getSupportedTypes()) {
                str2.contains(RRWebVideoEvent.EVENT_TAG);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean isSizeAndFramerateSupported(int i2, int i3, int i4, String str, int i5) {
        boolean z2 = false;
        try {
            MediaCodecInfo mediaCodecInfoSelectVideoCodec = selectVideoCodec(str);
            boolean zAreSizeAndRateSupported = false;
            for (String str2 : mediaCodecInfoSelectVideoCodec.getSupportedTypes()) {
                try {
                    if (str2.contains(RRWebVideoEvent.EVENT_TAG)) {
                        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfoSelectVideoCodec.getCapabilitiesForType(str2).getVideoCapabilities();
                        zAreSizeAndRateSupported = 1 == i5 ? videoCapabilities.areSizeAndRateSupported(i3, i2, i4) : videoCapabilities.areSizeAndRateSupported(i2, i3, i4);
                    }
                } catch (Exception e2) {
                    e = e2;
                    z2 = zAreSizeAndRateSupported;
                    e.printStackTrace();
                    return z2;
                }
            }
            return zAreSizeAndRateSupported;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public boolean isSizeSupported(int i2, int i3, String str) {
        boolean z2 = false;
        try {
            MediaCodecInfo mediaCodecInfoSelectVideoCodec = selectVideoCodec(str);
            boolean zIsSizeSupported = false;
            for (String str2 : mediaCodecInfoSelectVideoCodec.getSupportedTypes()) {
                try {
                    if (str2.contains(RRWebVideoEvent.EVENT_TAG)) {
                        zIsSizeSupported = mediaCodecInfoSelectVideoCodec.getCapabilitiesForType(str2).getVideoCapabilities().isSizeSupported(i3, i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                    z2 = zIsSizeSupported;
                    e.printStackTrace();
                    return z2;
                }
            }
            return zIsSizeSupported;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final MediaCodecInfo selectVideoCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
