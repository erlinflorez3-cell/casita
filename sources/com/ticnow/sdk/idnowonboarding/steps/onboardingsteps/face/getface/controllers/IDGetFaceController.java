package com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.getface.controllers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ticnow.sdk.idnowonboarding.steps.helper.IDRetrievedData;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.CX;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class IDGetFaceController {
    public static final int FACE_DATA = 16123;
    public static final int FACE_DATA_RESULT_CANCELED = 16126;
    public static final int FACE_DATA_RESULT_ERROR = 16125;
    public static final int FACE_DATA_RESULT_MAX_LOCAL_REINTENTS = 16129;
    public static final int FACE_DATA_RESULT_MAX_REINTENTS = 16128;
    public static final int FACE_DATA_RESULT_OK = 16124;
    public static final int FACE_DATA_RESULT_TIMEOUT = 16127;
    Activity activity;
    Context context;
    Integer intents;
    String zoomLicenceKey;
    String zoomLicenceText;
    String zoomPublicKey;
    String zoomUrl;

    public static class Builder {
        Activity activity;
        Context context;
        Integer intents;
        String zoomLicenceKey;
        String zoomLicenceText;
        String zoomPublicKey;
        String zoomUrl;

        public Builder(Context context, Activity activity) {
            this.activity = activity;
            this.context = context;
        }

        public IDGetFaceController Build() {
            return new IDGetFaceController(this);
        }

        public Builder Intents(Integer num) throws IllegalArgumentException {
            this.intents = num;
            return this;
        }

        public Builder zoomLicenceKey(String str) throws IllegalArgumentException {
            this.zoomLicenceKey = str;
            return this;
        }

        public Builder zoomLicenceText(String str) throws IllegalArgumentException {
            this.zoomLicenceText = str;
            return this;
        }

        public Builder zoomPublicKey(String str) throws IllegalArgumentException {
            this.zoomPublicKey = str;
            return this;
        }

        public Builder zoomUrl(String str) throws IllegalArgumentException {
            this.zoomUrl = str;
            return this;
        }
    }

    public IDGetFaceController(Builder builder) {
        this.activity = builder.activity;
        this.context = builder.context;
        this.zoomLicenceText = builder.zoomLicenceText;
        this.zoomLicenceKey = builder.zoomLicenceKey;
        this.zoomPublicKey = builder.zoomPublicKey;
        this.zoomUrl = builder.zoomUrl;
        this.intents = builder.intents;
    }

    public void Start() throws Exception {
        Intent intent = new Intent(this.context, (Class<?>) IDGetFaceStepController.class);
        try {
            String str = this.zoomPublicKey;
            short sXd = (short) (FB.Xd() ^ 30285);
            int[] iArr = new int["0<1>:3-u<:.0p\u0004\"3$sp".length()];
            QB qb = new QB("0<1>:3-u<:.0p\u0004\"3$sp");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.yd("ias_)hZh^&Hje]_Y", (short) (C1580rY.Xd() ^ (-27489))));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {str, 0};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.Yd("~\u0001\u007f\r\u0003\u0005", (short) (C1580rY.Xd() ^ (-2280))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                this.zoomPublicKey = new String((byte[]) declaredMethod.invoke(null, objArr), StandardCharsets.UTF_8);
                String str2 = this.zoomLicenceText;
                Class<?> cls2 = Class.forName(Xg.qd("\u001a(\u001f.,'#m66,0r\b(;.\u007f~", (short) (C1580rY.Xd() ^ (-18095)), (short) (C1580rY.Xd() ^ (-19702))));
                Class<?>[] clsArr2 = new Class[2];
                clsArr2[0] = Class.forName(Jg.Wd("\u0007>Fw7l$(\u0016#;c\u0014\u0002\n7", (short) (ZN.Xd() ^ 32745), (short) (ZN.Xd() ^ 18437)));
                clsArr2[1] = Integer.TYPE;
                Object[] objArr2 = {str2, 0};
                Method declaredMethod2 = cls2.getDeclaredMethod(ZO.xd(" Z\\]4K", (short) (Od.Xd() ^ (-14124)), (short) (Od.Xd() ^ (-9690))), clsArr2);
                try {
                    declaredMethod2.setAccessible(true);
                    this.zoomLicenceText = new String((byte[]) declaredMethod2.invoke(null, objArr2), StandardCharsets.UTF_8);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Exception unused) {
            this.zoomPublicKey = "";
            this.zoomLicenceText = "";
        }
        IDRetrievedData.getCurrentRetrievedData().setDueIntents(0);
        short sXd2 = (short) (C1607wl.Xd() ^ 30587);
        short sXd3 = (short) (C1607wl.Xd() ^ 5956);
        int[] iArr2 = new int["#\u00193\"\u007fhn\u0014l\nM\u000b'S_".length()];
        QB qb2 = new QB("#\u00193\"\u007fhn\u0014l\nM\u000b'S_");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + (i3 * sXd3))) + xuXd2.CK(iKK2));
            i3++;
        }
        intent.putExtra(new String(iArr2, 0, i3), this.zoomLicenceText);
        short sXd4 = (short) (C1607wl.Xd() ^ 2988);
        int[] iArr3 = new int["\"IE!\\UixO\u0016A=\b*".length()];
        QB qb3 = new QB("\"IE!\\UixO\u0016A=\b*");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd4 + i4)));
            i4++;
        }
        intent.putExtra(new String(iArr3, 0, i4), this.zoomLicenceKey);
        short sXd5 = (short) (C1580rY.Xd() ^ (-1660));
        int[] iArr4 = new int["f\u0004uX\"\u0014\u0011SzeKG\n".length()];
        QB qb4 = new QB("f\u0004uX\"\u0014\u0011SzeKG\n");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + i5)) + xuXd4.CK(iKK4));
            i5++;
        }
        intent.putExtra(new String(iArr4, 0, i5), this.zoomPublicKey);
        short sXd6 = (short) (C1633zX.Xd() ^ (-30620));
        int[] iArr5 = new int["vjifMib".length()];
        QB qb5 = new QB("vjifMib");
        int i6 = 0;
        while (qb5.YK()) {
            int iKK5 = qb5.KK();
            Xu xuXd5 = Xu.Xd(iKK5);
            iArr5[i6] = xuXd5.fK(sXd6 + sXd6 + sXd6 + i6 + xuXd5.CK(iKK5));
            i6++;
        }
        intent.putExtra(new String(iArr5, 0, i6), this.zoomUrl);
        intent.putExtra(C1593ug.zd("JPWISZZ", (short) (ZN.Xd() ^ 19516), (short) (ZN.Xd() ^ 24219)), this.intents);
        Activity activity = (Activity) this.context;
        CX.ud();
        activity.startActivityForResult(intent, FACE_DATA);
    }
}
