package com.dynatrace.android.agent.cookie;

import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.conf.DataCollectionLevel;
import com.dynatrace.android.agent.data.Session;

/* JADX INFO: loaded from: classes3.dex */
class CookieProducer {

    /* JADX INFO: renamed from: com.dynatrace.android.agent.cookie.CookieProducer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$dynatrace$android$agent$conf$DataCollectionLevel;

        static {
            int[] iArr = new int[DataCollectionLevel.values().length];
            $SwitchMap$com$dynatrace$android$agent$conf$DataCollectionLevel = iArr;
            try {
                iArr[DataCollectionLevel.PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$conf$DataCollectionLevel[DataCollectionLevel.USER_BEHAVIOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$conf$DataCollectionLevel[DataCollectionLevel.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    CookieProducer() {
    }

    String createAdkCookie(Session session, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(session.visitorId).append(Global.UNDERSCORE);
        sb.append(session.sessionId);
        sb.append(Global.HYPHEN).append(session.sequenceNumber);
        sb.append(Global.UNDERSCORE);
        sb.append(str).append("_m");
        return sb.toString();
    }

    String createAdkSettingsCookie(Session session) {
        StringBuilder sb = new StringBuilder("v_4_ol_");
        if (!session.isConfigurationApplied()) {
            sb.append(ExifInterface.GPS_MEASUREMENT_2D);
        } else if (session.isActive()) {
            sb.append("0_mul_");
            sb.append(session.multiplicity);
        } else {
            sb.append("1");
        }
        sb.append("_prv_");
        int i2 = AnonymousClass1.$SwitchMap$com$dynatrace$android$agent$conf$DataCollectionLevel[session.getPrivacyRules().getPrivacySettings().getDataCollectionLevel().ordinal()];
        if (i2 == 1) {
            sb.append(ExifInterface.GPS_MEASUREMENT_3D);
        } else if (i2 != 2) {
            sb.append(ExifInterface.GPS_MEASUREMENT_2D);
        } else {
            sb.append("4");
        }
        return sb.toString();
    }

    String createDtCookie(long j2, int i2) {
        return j2 + Global.UNDERSCORE + i2;
    }
}
