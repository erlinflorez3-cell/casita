package com.google.zxing.client.android;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Vibrator;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes7.dex */
public final class BeepManager {
    private static final float BEEP_VOLUME = 0.1f;
    private static final String TAG = "BeepManager";
    private static final long VIBRATE_DURATION = 200;
    private final Context context;
    private boolean beepEnabled = true;
    private boolean vibrateEnabled = false;

    public BeepManager(Activity activity) {
        activity.setVolumeControlStream(3);
        this.context = activity.getApplicationContext();
    }

    static /* synthetic */ void lambda$playBeepSound$0(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    static /* synthetic */ boolean lambda$playBeepSound$1(MediaPlayer mediaPlayer, int i2, int i3) {
        String str = TAG;
        String str2 = "Failed to beep " + i2 + ", " + i3;
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }

    public boolean isBeepEnabled() {
        return this.beepEnabled;
    }

    public boolean isVibrateEnabled() {
        return this.vibrateEnabled;
    }

    public MediaPlayer playBeepSound() throws Throwable {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.google.zxing.client.android.BeepManager$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                BeepManager.lambda$playBeepSound$0(mediaPlayer2);
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.google.zxing.client.android.BeepManager$$ExternalSyntheticLambda1
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i2, int i3) {
                return BeepManager.lambda$playBeepSound$1(mediaPlayer2, i2, i3);
            }
        });
        try {
            Context context = this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("IUJW[TN\u0017CNLQIQV\u000f\u001bFDIASN", (short) (FB.Xd() ^ 2728))).getMethod(C1561oA.Yd("87G&:IFMK=@O", (short) (Od.Xd() ^ (-17613))), new Class[0]);
            try {
                method.setAccessible(true);
                AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = ((Resources) method.invoke(context, objArr)).openRawResourceFd(R.raw.zxing_beep);
                try {
                    mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                    assetFileDescriptorOpenRawResourceFd.close();
                    mediaPlayer.setVolume(0.1f, 0.1f);
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                    return mediaPlayer;
                } catch (Throwable th) {
                    assetFileDescriptorOpenRawResourceFd.close();
                    throw th;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException e3) {
            String str = TAG;
            mediaPlayer.reset();
            mediaPlayer.release();
            return null;
        }
    }

    public synchronized void playBeepSoundAndVibrate() {
        if (this.beepEnabled) {
            playBeepSound();
        }
        if (this.vibrateEnabled) {
            Context context = this.context;
            Object[] objArr = {Xg.qd("3'!2\"626", (short) (ZN.Xd() ^ 25299), (short) (ZN.Xd() ^ 4662))};
            Method method = Class.forName(Jg.Wd("J\f\n\u007f\u0011ru7pc|h_\u001e.Mx\f\u0013\u0011\u0006\u0001\u0015", (short) (C1580rY.Xd() ^ (-22610)), (short) (C1580rY.Xd() ^ (-19111)))).getMethod(C1626yg.Ud("'NZ+eX\u001a(\u0013\t>$s\u0017:\u0001", (short) (C1499aX.Xd() ^ (-5680)), (short) (C1499aX.Xd() ^ (-2385))), Class.forName(ZO.xd("=\u0004W\u0018I3R\u0015G{\u0010P4\u001a3_", (short) (OY.Xd() ^ 7233), (short) (OY.Xd() ^ 13079))));
            try {
                method.setAccessible(true);
                Vibrator vibrator = (Vibrator) method.invoke(context, objArr);
                if (vibrator != null) {
                    vibrator.vibrate(VIBRATE_DURATION);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public void setBeepEnabled(boolean z2) {
        this.beepEnabled = z2;
    }

    public void setVibrateEnabled(boolean z2) {
        this.vibrateEnabled = z2;
    }
}
