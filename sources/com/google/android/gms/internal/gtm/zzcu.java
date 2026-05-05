package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.FB;

/* JADX INFO: loaded from: classes8.dex */
public class zzcu extends zzbt {
    final zzct zza;

    public zzcu(zzbx zzbxVar, zzct zzctVar) {
        super(zzbxVar);
        this.zza = zzctVar;
    }

    private final zzcs zzb(XmlResourceParser xmlResourceParser) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue) && !TextUtils.isEmpty(strTrim)) {
                            this.zza.zzb(attributeValue, strTrim);
                        }
                    } else if (lowerCase.equals("string")) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && strTrim2 != null) {
                            this.zza.zze(attributeValue2, strTrim2);
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(strTrim3)) {
                            try {
                                this.zza.zzc(attributeValue3, Boolean.parseBoolean(strTrim3));
                            } catch (NumberFormatException e2) {
                                zzS("Error parsing bool configuration value", strTrim3, e2);
                            }
                        }
                    } else if (lowerCase.equals(TypedValues.Custom.S_INT)) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(strTrim4)) {
                            try {
                                this.zza.zzd(attributeValue4, Integer.parseInt(strTrim4));
                            } catch (NumberFormatException e3) {
                                zzS("Error parsing int configuration value", strTrim4, e3);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e4) {
            zzJ("Error parsing tracker configuration file", e4);
        } catch (XmlPullParserException e5) {
            zzJ("Error parsing tracker configuration file", e5);
        }
        return this.zza.zza();
    }

    public final zzcs zza(int i2) throws Throwable {
        try {
            Context contextZzb = zzt().zzb();
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("W\u0015-^;j=\u0007_\u001b\u0010@`kqP\u001bMd\u0017J&{", (short) (FB.Xd() ^ 14692))).getMethod(C1561oA.Qd("DAO,>KFKG78E", (short) (C1580rY.Xd() ^ (-8792))), new Class[0]);
            try {
                method.setAccessible(true);
                return zzb(((Resources) method.invoke(contextZzb, objArr)).getXml(i2));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Resources.NotFoundException e3) {
            zzR(C1593ug.zd("4:3:0D6y{s87CD>>zSFRG\u007fVPNRT]U\b[O^[b`RU:V", (short) (C1633zX.Xd() ^ (-28325)), (short) (C1633zX.Xd() ^ (-22133))), e3);
            return null;
        }
    }
}
