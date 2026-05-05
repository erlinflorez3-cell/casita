package com.hbisoft.hbrecorder;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
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

/* JADX INFO: loaded from: classes7.dex */
public class HBRecorder implements MyListener {
    private byte[] byteArray;
    private final Context context;
    Countdown countDown;
    private boolean enableCustomSettings;
    private String fileName;
    private final HBRecorderListener hbRecorderListener;
    boolean isMaxDurationSet;
    boolean isPaused;
    private int mScreenDensity;
    private int mScreenHeight;
    private int mScreenWidth;
    Uri mUri;
    boolean mWasUriSet;
    int maxDuration;
    private long maxFileSize;
    private String notificationButtonText;
    private String notificationDescription;
    private String notificationTitle;
    private FileObserver observer;
    private int orientation;
    private String outputFormat;
    private String outputPath;
    private int resultCode;
    Intent service;
    private int videoBitrate;
    private String videoEncoder;
    private int videoFrameRate;
    boolean wasOnErrorCalled;
    private boolean isAudioEnabled = true;
    private boolean isVideoHDEnabled = true;
    private int audioBitrate = 0;
    private int audioSamplingRate = 0;
    private int vectorDrawable = 0;
    private String audioSource = C1626yg.Ud("\u000b\u0015\b", (short) (ZN.Xd() ^ 19268), (short) (ZN.Xd() ^ 17829));

    public HBRecorder(Context context, HBRecorderListener hBRecorderListener) throws Throwable {
        String strWd = Ig.wd("\u0018er\u001f9{i", (short) (C1633zX.Xd() ^ (-26490)));
        this.videoEncoder = strWd;
        this.enableCustomSettings = false;
        this.videoFrameRate = 30;
        this.videoBitrate = 40000000;
        this.outputFormat = strWd;
        this.maxFileSize = 0L;
        this.wasOnErrorCalled = false;
        this.isPaused = false;
        this.isMaxDurationSet = false;
        this.maxDuration = 0;
        this.mWasUriSet = false;
        this.countDown = null;
        short sXd = (short) (C1580rY.Xd() ^ (-2784));
        int[] iArr = new int["c\u0019\u0001v+\u0003\u001aj{KH,l\u007f}\u0015O\u0006<Jv5\u000f".length()];
        QB qb = new QB("c\u0019\u0001v+\u0003\u001aj{KH,l\u007f}\u0015O\u0006<Jv5\u000f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1580rY.Xd() ^ (-30292));
        int[] iArr2 = new int[".+9\u000532-)\"\u001f1%*({'%*\u001a,'".length()];
        QB qb2 = new QB(".+9\u000532-)\"\u001f1%*({'%*\u001a,'");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            this.context = (Context) method.invoke(context, objArr);
            this.hbRecorderListener = hBRecorderListener;
            setScreenDensity();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void setScreenDensity() {
        this.mScreenDensity = Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCountdown() {
        Countdown countdown = new Countdown(this.maxDuration, 1000L, 0L) { // from class: com.hbisoft.hbrecorder.HBRecorder.2
            @Override // com.hbisoft.hbrecorder.Countdown
            public void onFinished() throws Throwable {
                onTick(0L);
                Object[] objArr = new Object[0];
                Method declaredMethod = Class.forName(C1561oA.yd("Q]Vc[TR\u001bgj(EcbfZR", (short) (Od.Xd() ^ (-10112)))).getDeclaredMethod(C1561oA.Yd("YXhBW`fEijlbp", (short) (ZN.Xd() ^ 1836)), new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                    Runnable runnable = new Runnable() { // from class: com.hbisoft.hbrecorder.HBRecorder.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                HBRecorder.this.stopScreenRecording();
                                HBRecorder.this.observer.stopWatching();
                                HBRecorder.this.hbRecorderListener.HBRecorderOnComplete();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    };
                    short sXd = (short) (C1607wl.Xd() ^ 23535);
                    short sXd2 = (short) (C1607wl.Xd() ^ 8656);
                    int[] iArr = new int["9G>MKFB\rOT\u0010+ESJSM[".length()];
                    QB qb = new QB("9G>MKFB\rOT\u0010+ESJSM[");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                        i2++;
                    }
                    Object[] objArr2 = {runnable};
                    Method method = Class.forName(new String(iArr, 0, i2)).getMethod(ZO.xd("4MA6", (short) (C1580rY.Xd() ^ (-27613)), (short) (C1580rY.Xd() ^ (-22100))), Class.forName(Jg.Wd("lcpw4N;d] \u001d<EA\f\t\u0013(", (short) (OY.Xd() ^ 24252), (short) (OY.Xd() ^ 14097))));
                    try {
                        method.setAccessible(true);
                        method.invoke(handler, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }

            @Override // com.hbisoft.hbrecorder.Countdown
            public void onStopCalled() {
            }

            @Override // com.hbisoft.hbrecorder.Countdown
            public void onTick(long j2) {
            }
        };
        this.countDown = countdown;
        countdown.start();
    }

    private void startService(Intent intent) throws Exception {
        try {
            if (!this.mWasUriSet) {
                if (this.outputPath != null) {
                    this.observer = new FileObserver(new File(this.outputPath).getParent(), this);
                } else {
                    this.observer = new FileObserver(String.valueOf(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES)), this);
                }
                this.observer.startWatching();
            }
            Intent intent2 = new Intent(this.context, (Class<?>) ScreenRecordService.class);
            this.service = intent2;
            if (this.mWasUriSet) {
                intent2.putExtra(C1593ug.zd("{d\u0003z", (short) (C1580rY.Xd() ^ (-619)), (short) (C1580rY.Xd() ^ (-16930))), this.mUri.toString());
            }
            this.service.putExtra(C1561oA.od("\u0012\u001d\u0011\u0011", (short) (OY.Xd() ^ 12701)), this.resultCode);
            this.service.putExtra(C1561oA.Kd("75I7", (short) (C1633zX.Xd() ^ (-20874))), intent);
            Intent intent3 = this.service;
            short sXd = (short) (C1499aX.Xd() ^ (-32231));
            short sXd2 = (short) (C1499aX.Xd() ^ (-11647));
            int[] iArr = new int["6;\u0017)C".length()];
            QB qb = new QB("6;\u0017)C");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            intent3.putExtra(new String(iArr, 0, i2), this.isAudioEnabled);
            Intent intent4 = this.service;
            short sXd3 = (short) (C1607wl.Xd() ^ 20404);
            int[] iArr2 = new int[" \u0013\u000f \u0015".length()];
            QB qb2 = new QB(" \u0013\u000f \u0015");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
                i3++;
            }
            intent4.putExtra(new String(iArr2, 0, i3), this.mScreenWidth);
            this.service.putExtra(Wg.vd(".,10*7", (short) (C1499aX.Xd() ^ (-30825))), this.mScreenHeight);
            this.service.putExtra(Qg.kd("OOW[PZ^", (short) (C1607wl.Xd() ^ 14287), (short) (C1607wl.Xd() ^ 9020)), this.mScreenDensity);
            this.service.putExtra(hg.Vd("#&\u0011\u001b\u0017!%", (short) (C1499aX.Xd() ^ (-4049)), (short) (C1499aX.Xd() ^ (-20700))), this.isVideoHDEnabled);
            this.service.putExtra(C1561oA.ud("&\u0016(\u001b", (short) (Od.Xd() ^ (-17235))), this.outputPath);
            Intent intent5 = this.service;
            short sXd4 = (short) (C1607wl.Xd() ^ 11806);
            int[] iArr3 = new int["'+/)\u000b\u001f,%".length()];
            QB qb3 = new QB("'+/)\u000b\u001f,%");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 ^ i4));
                i4++;
            }
            intent5.putExtra(new String(iArr3, 0, i4), this.fileName);
            this.service.putExtra(C1561oA.Yd("480-7>,@6==", (short) (C1607wl.Xd() ^ 15157)), this.orientation);
            this.service.putExtra(Xg.qd("\u0015*\u001a 'z#/.\u001e2$", (short) (C1607wl.Xd() ^ 17338), (short) (C1607wl.Xd() ^ 10381)), this.audioBitrate);
            this.service.putExtra(Jg.Wd("i\u001d<Rhk\nGz\u0017C9cn\rpq", (short) (C1499aX.Xd() ^ (-20261)), (short) (C1499aX.Xd() ^ (-5462))), this.audioSamplingRate);
            this.service.putExtra(ZO.xd("c(m2v_z.\ttg_*[Q8\u0012\u0005c9\u00041b", (short) (C1633zX.Xd() ^ (-15734)), (short) (C1633zX.Xd() ^ (-7500))), this.byteArray);
            Intent intent6 = this.service;
            short sXd5 = (short) (C1633zX.Xd() ^ (-25341));
            short sXd6 = (short) (C1633zX.Xd() ^ (-4903));
            int[] iArr4 = new int["Ch,>O\u0014O5)+nJzz~\\=\u000e25>MQ".length()];
            QB qb4 = new QB("Ch,>O\u0014O5)+nJzz~\\=\u000e25>MQ");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i5 * sXd6))) + xuXd4.CK(iKK4));
                i5++;
            }
            intent6.putExtra(new String(iArr4, 0, i5), this.vectorDrawable);
            this.service.putExtra(Ig.wd("%uL%r\u0019;`%\n\u0016n\n\u0011P&b", (short) (C1633zX.Xd() ^ (-20181))), this.notificationTitle);
            this.service.putExtra(EO.Od("C\u001b0BY\u0002eE\u00106@W\u00181!mI<\u001ew#\u0004b", (short) (C1607wl.Xd() ^ 3648)), this.notificationDescription);
            this.service.putExtra(C1561oA.Qd("ww{okmfcuinl?qonhfK[mh", (short) (C1499aX.Xd() ^ (-13766))), this.notificationButtonText);
            this.service.putExtra(C1593ug.zd("isgitnM\u0001\u007f\u0002}|cv\u0007\b}\u0004}\u000b", (short) (OY.Xd() ^ 14666), (short) (OY.Xd() ^ 1846)), this.enableCustomSettings);
            Intent intent7 = this.service;
            short sXd7 = (short) (Od.Xd() ^ (-10256));
            int[] iArr5 = new int["\u0007\u001a\b\f\u0011s\u000f\u0014\u0010\u007f\u0001".length()];
            QB qb5 = new QB("\u0007\u001a\b\f\u0011s\u000f\u0014\u0010\u007f\u0001");
            int i6 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i6] = xuXd5.fK(sXd7 + sXd7 + i6 + xuXd5.CK(iKK5));
                i6++;
            }
            intent7.putExtra(new String(iArr5, 0, i6), this.audioSource);
            this.service.putExtra(C1561oA.Kd("\\PLNY0ZP]SUc", (short) (FB.Xd() ^ 21838)), this.videoEncoder);
            this.service.putExtra(Wg.Zd("(F@l46auIdV\tcy", (short) (ZN.Xd() ^ 20378), (short) (ZN.Xd() ^ 32728)), this.videoFrameRate);
            this.service.putExtra(C1561oA.Xd("fZVXc7_kjZn`", (short) (Od.Xd() ^ (-31851))), this.videoBitrate);
            this.service.putExtra(Wg.vd("NUQNPP\u001fIYUFZ", (short) (Od.Xd() ^ (-4228))), this.outputFormat);
            this.service.putExtra(Qg.kd("b^ggW_Ua", (short) (OY.Xd() ^ 6343), (short) (OY.Xd() ^ 1475)), new ResultReceiver(new Handler()) { // from class: com.hbisoft.hbrecorder.HBRecorder.1
                @Override // android.os.ResultReceiver
                protected void onReceiveResult(int i7, Bundle bundle) throws Throwable {
                    super.onReceiveResult(i7, bundle);
                    if (i7 == -1) {
                        String string = bundle.getString(C1593ug.zd("~\r\u000e\f\u0010p\u0005\u0002\u0015\u0012\u0012", (short) (C1580rY.Xd() ^ (-8728)), (short) (C1580rY.Xd() ^ (-30808))));
                        String string2 = bundle.getString(C1561oA.od("><\u0010;8:5-;+", (short) (Od.Xd() ^ (-27135))));
                        short sXd8 = (short) (ZN.Xd() ^ 8307);
                        int[] iArr6 = new int["ppVxfx{".length()];
                        QB qb6 = new QB("ppVxfx{");
                        int i8 = 0;
                        while (qb6.YK()) {
                            int iKK6 = qb6.KK();
                            Xu xuXd6 = Xu.Xd(iKK6);
                            iArr6[i8] = xuXd6.fK(xuXd6.CK(iKK6) - ((sXd8 + sXd8) + i8));
                            i8++;
                        }
                        int i9 = bundle.getInt(new String(iArr6, 0, i8));
                        short sXd9 = (short) (C1499aX.Xd() ^ (-2937));
                        short sXd10 = (short) (C1499aX.Xd() ^ (-25704));
                        int[] iArr7 = new int[" s\u0019jr".length()];
                        QB qb7 = new QB(" s\u0019jr");
                        int i10 = 0;
                        while (qb7.YK()) {
                            int iKK7 = qb7.KK();
                            Xu xuXd7 = Xu.Xd(iKK7);
                            iArr7[i10] = xuXd7.fK(((i10 * sXd10) ^ sXd9) + xuXd7.CK(iKK7));
                            i10++;
                        }
                        int i11 = bundle.getInt(new String(iArr7, 0, i10));
                        if (string != null) {
                            HBRecorder.this.stopCountDown();
                            if (!HBRecorder.this.mWasUriSet) {
                                HBRecorder.this.observer.stopWatching();
                            }
                            HBRecorder.this.wasOnErrorCalled = true;
                            if (i11 > 0) {
                                HBRecorder.this.hbRecorderListener.HBRecorderOnError(i11, string);
                            } else {
                                HBRecorder.this.hbRecorderListener.HBRecorderOnError(100, string);
                            }
                            try {
                                Intent intent8 = new Intent(HBRecorder.this.context, (Class<?>) ScreenRecordService.class);
                                Context context = HBRecorder.this.context;
                                short sXd11 = (short) (C1580rY.Xd() ^ (-28828));
                                int[] iArr8 = new int["1?6EC>:\u0005;HHOAKR\r#PPWI]Z".length()];
                                QB qb8 = new QB("1?6EC>:\u0005;HHOAKR\r#PPWI]Z");
                                int i12 = 0;
                                while (qb8.YK()) {
                                    int iKK8 = qb8.KK();
                                    Xu xuXd8 = Xu.Xd(iKK8);
                                    iArr8[i12] = xuXd8.fK(xuXd8.CK(iKK8) - (sXd11 + i12));
                                    i12++;
                                }
                                Class<?> cls = Class.forName(new String(iArr8, 0, i12));
                                Class<?>[] clsArr = new Class[1];
                                clsArr[0] = Class.forName(Wg.vd("ESFUWRJ\u0015?LHOEOR\r\u001dCF8FM", (short) (OY.Xd() ^ 877)));
                                Object[] objArr = {intent8};
                                Method method = cls.getMethod(Qg.kd("aa[[=NZ]OHI", (short) (C1580rY.Xd() ^ (-1969)), (short) (C1580rY.Xd() ^ (-23986))), clsArr);
                                try {
                                    method.setAccessible(true);
                                    method.invoke(context, objArr);
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            } catch (Exception unused) {
                            }
                        } else if (string2 != null) {
                            HBRecorder.this.stopCountDown();
                            if (HBRecorder.this.mWasUriSet && !HBRecorder.this.wasOnErrorCalled) {
                                HBRecorder.this.hbRecorderListener.HBRecorderOnComplete();
                            }
                            HBRecorder.this.wasOnErrorCalled = false;
                        } else if (i9 != 0) {
                            HBRecorder.this.hbRecorderListener.HBRecorderOnStart();
                            if (HBRecorder.this.isMaxDurationSet) {
                                HBRecorder.this.startCountdown();
                            }
                        }
                        String string3 = bundle.getString(hg.Vd("DB#3FC4", (short) (FB.Xd() ^ 31946), (short) (FB.Xd() ^ 18956)));
                        String string4 = bundle.getString(C1561oA.ud("\u001e\u001c~\u0011\u001e\u001f\u0016\r", (short) (C1607wl.Xd() ^ 14887)));
                        if (string3 != null) {
                            HBRecorder.this.hbRecorderListener.HBRecorderOnPause();
                        } else if (string4 != null) {
                            HBRecorder.this.hbRecorderListener.HBRecorderOnResume();
                        }
                    }
                }
            });
            this.service.putExtra(hg.Vd("WJ`-OQI6K[E", (short) (FB.Xd() ^ 20900), (short) (FB.Xd() ^ 4791)), this.maxFileSize);
            Context context = this.context;
            Intent intent8 = this.service;
            CX.ud();
            Class<?> cls = Class.forName(C1561oA.ud("p|q~zsm6jusxhpu.Bmkp`rm", (short) (FB.Xd() ^ 3227)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.yd("*6+84-'o4?=B2:?w\u0002&+\u001b#(", (short) (OY.Xd() ^ 32575)));
            Object[] objArr = {intent8};
            short sXd8 = (short) (C1607wl.Xd() ^ 25267);
            int[] iArr6 = new int["\\^L^aATbg[VY".length()];
            QB qb6 = new QB("\\^L^aATbg[VY");
            int i7 = 0;
            while (qb6.YK()) {
                int iKK6 = qb6.KK();
                Xu xuXd6 = Xu.Xd(iKK6);
                iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - (((sXd8 + sXd8) + sXd8) + i7));
                i7++;
            }
            Method method = cls.getMethod(new String(iArr6, 0, i7), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            this.hbRecorderListener.HBRecorderOnError(0, Log.getStackTraceString(e3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopCountDown() {
        Countdown countdown = this.countDown;
        if (countdown != null) {
            countdown.stop();
        }
    }

    public void enableCustomSettings() {
        this.enableCustomSettings = true;
    }

    public int getDefaultHeight() {
        HBRecorderCodecInfo hBRecorderCodecInfo = new HBRecorderCodecInfo();
        hBRecorderCodecInfo.setContext(this.context);
        return hBRecorderCodecInfo.getMaxSupportedHeight();
    }

    public int getDefaultWidth() {
        HBRecorderCodecInfo hBRecorderCodecInfo = new HBRecorderCodecInfo();
        hBRecorderCodecInfo.setContext(this.context);
        return hBRecorderCodecInfo.getMaxSupportedWidth();
    }

    public String getFileName() {
        return ScreenRecordService.getFileName();
    }

    public String getFilePath() {
        return ScreenRecordService.getFilePath();
    }

    public void isAudioEnabled(boolean z2) {
        this.isAudioEnabled = z2;
    }

    public boolean isBusyRecording() throws Throwable {
        Context context = this.context;
        String strQd = Xg.qd("\u001a\u001d/%3'39", (short) (C1607wl.Xd() ^ 23151), (short) (C1607wl.Xd() ^ 4821));
        short sXd = (short) (C1607wl.Xd() ^ 4746);
        short sXd2 = (short) (C1607wl.Xd() ^ 18308);
        int[] iArr = new int["4('9=?G\u0019U\u0006\u000e \u0018)4u\u0012+2?4PX".length()];
        QB qb = new QB("4('9=?G\u0019U\u0006\u000e \u0018)4u\u0012+2?4PX");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {Class.forName(ZO.xd("DR\b\u001ak\u000eeU<NgPDH\".", (short) (C1633zX.Xd() ^ (-14508)), (short) (C1633zX.Xd() ^ (-23290))))};
        Object[] objArr = {strQd};
        short sXd3 = (short) (C1499aX.Xd() ^ (-13886));
        short sXd4 = (short) (C1499aX.Xd() ^ (-19379));
        int[] iArr2 = new int["D\"\u0006BC\tb\u001e`\u001aw\u0006]=.b".length()];
        QB qb2 = new QB("D\"\u0006BC\tb\u001e`\u001aw\u0006]=.b");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            ActivityManager activityManager = (ActivityManager) method.invoke(context, objArr);
            if (activityManager == null) {
                return false;
            }
            Iterator<ActivityManager.RunningServiceInfo> it = activityManager.getRunningServices(Integer.MAX_VALUE).iterator();
            while (it.hasNext()) {
                if (ScreenRecordService.class.getName().equals(it.next().service.getClassName())) {
                    return true;
                }
            }
            return false;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public boolean isRecordingPaused() {
        return this.isPaused;
    }

    @Override // com.hbisoft.hbrecorder.MyListener
    public void onCompleteCallback() {
        this.observer.stopWatching();
        this.hbRecorderListener.HBRecorderOnComplete();
    }

    public void pauseScreenRecording() throws Exception {
        Intent intent = this.service;
        if (intent != null) {
            this.isPaused = true;
            intent.setAction(Ig.wd("'F\r'h", (short) (C1607wl.Xd() ^ 24390)));
            Context context = this.context;
            Intent intent2 = this.service;
            CX.ud();
            Class<?> cls = Class.forName(EO.Od("b\u001eDk*\u0002Ruz\u0004~)e~^;\u000eBzK{4L", (short) (OY.Xd() ^ 24568)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (ZN.Xd() ^ 1409);
            int[] iArr = new int["'3(51*$l!,*/\u001f',d~#(\u0018 %".length()];
            QB qb = new QB("'3(51*$l!,*/\u001f',d~#(\u0018 %");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {intent2};
            Method method = cls.getMethod(C1593ug.zd("=?-?B\"5CH<7:", (short) (ZN.Xd() ^ 31053), (short) (ZN.Xd() ^ 18170)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public void recordHDVideo(boolean z2) {
        this.isVideoHDEnabled = z2;
    }

    public void resumeScreenRecording() throws Exception {
        Intent intent = this.service;
        if (intent != null) {
            this.isPaused = false;
            intent.setAction(C1561oA.od("aS`aXO", (short) (C1580rY.Xd() ^ (-14966))));
            Context context = this.context;
            Intent intent2 = this.service;
            CX.ud();
            Object[] objArr = {intent2};
            Method method = Class.forName(C1561oA.Kd("\u0004\u0012\t\u0018\u0016\u0011\rW\u000e\u001b\u001b\"\u0014\u001e%_u##*\u001c0-", (short) (C1633zX.Xd() ^ (-15468)))).getMethod(C1561oA.Xd("#%\u0013%(\b\u001b).\"\u001d ", (short) (C1499aX.Xd() ^ (-8760))), Class.forName(Wg.Zd("B|7P\u0016\u0019\u00031mJR;x-{>@2G\u0019+\u0004", (short) (FB.Xd() ^ 27041), (short) (FB.Xd() ^ 16768))));
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public void setAudioBitrate(int i2) {
        this.audioBitrate = i2;
    }

    public void setAudioSamplingRate(int i2) {
        this.audioSamplingRate = i2;
    }

    public void setAudioSource(String str) {
        this.audioSource = str;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setMaxDuration(int i2) {
        this.isMaxDurationSet = true;
        this.maxDuration = i2 * 1000;
    }

    public void setMaxFileSize(long j2) {
        this.maxFileSize = j2;
    }

    public void setNotificationButtonText(String str) {
        this.notificationButtonText = str;
    }

    public void setNotificationDescription(String str) {
        this.notificationDescription = str;
    }

    public void setNotificationSmallIcon(int i2) throws Throwable {
        Context context = this.context;
        short sXd = (short) (ZN.Xd() ^ 19037);
        int[] iArr = new int["IWJY[VN\u0019S`\\cYcf!\u001bHDKAUN".length()];
        QB qb = new QB("IWJY[VN\u0019S`\\cYcf!\u001bHDKAUN");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((sXd ^ i3) + xuXd.CK(iKK));
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Qg.kd("FCQ.@MHMI9:G", (short) (C1607wl.Xd() ^ 20411), (short) (C1607wl.Xd() ^ 32581)), new Class[0]);
        try {
            method.setAccessible(true);
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource((Resources) method.invoke(context, objArr), i2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapDecodeResource.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            this.byteArray = byteArrayOutputStream.toByteArray();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setNotificationSmallIcon(byte[] bArr) {
        this.byteArray = bArr;
    }

    public void setNotificationSmallIconVector(int i2) {
        this.vectorDrawable = i2;
    }

    public void setNotificationTitle(String str) {
        this.notificationTitle = str;
    }

    public void setOrientationHint(int i2) {
        this.orientation = i2;
    }

    public void setOutputFormat(String str) {
        this.outputFormat = str;
    }

    public void setOutputPath(String str) {
        this.outputPath = str;
    }

    public void setOutputUri(Uri uri) {
        this.mWasUriSet = true;
        this.mUri = uri;
    }

    public void setScreenDimensions(int i2, int i3) {
        this.mScreenHeight = i2;
        this.mScreenWidth = i3;
    }

    public void setVideoBitrate(int i2) {
        this.videoBitrate = i2;
    }

    public void setVideoEncoder(String str) {
        this.videoEncoder = str;
    }

    public void setVideoFrameRate(int i2) {
        this.videoFrameRate = i2;
    }

    public void startScreenRecording(Intent intent, int i2) {
        this.resultCode = i2;
        startService(intent);
    }

    public void stopScreenRecording() {
        Intent intent = new Intent(this.context, (Class<?>) ScreenRecordService.class);
        Context context = this.context;
        Object[] objArr = {intent};
        Method method = Class.forName(hg.Vd("NZO\\XQK\u0014HSQVFNS\f KIN>PK", (short) (FB.Xd() ^ 13562), (short) (FB.Xd() ^ 25419))).getMethod(C1561oA.yd("\r\r\u000b\u000bp\u0002\u0012\u0015zsx", (short) (C1633zX.Xd() ^ (-25646))), Class.forName(C1561oA.ud("MYN[WPJ\u0013GRPUEMR\u000b%IN>FK", (short) (C1499aX.Xd() ^ (-19241)))));
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public boolean wasUriSet() {
        return this.mWasUriSet;
    }
}
