package com.transmit.authentication.webauthn;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.fido.Fido;
import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.transmit.authentication.TSAuthCallback;
import com.transmit.authentication.TSWebAuthnAuthenticationError;
import com.transmit.authentication.TSWebAuthnRegistrationError;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
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
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class TSOverlayActivity extends AppCompatActivity {
    public static final String CALLBACK_KEY = "completionCallback";
    public static final String CREDENTIALS_EXTRA = "CREDENTIALS_EXTRA";
    public static final String OPERATION_EXTRA = "OPERATION_EXTRA";
    public static final int REGISTER_REQUEST_CODE = 34543;
    public static final int SIGN_REQUEST_CODE = 123123;
    public static final int SIGN_USERLESS_REQUEST_CODE = 1231235;
    static final HashMap<String, TSAuthCallback> registeredCallbacks = new HashMap<>();
    protected TSAuthCallback completionCallback;
    Object pendingResult;

    private void handleIncomingRequest() {
        if (getIntent().getIntExtra(OPERATION_EXTRA, 0) == 34543) {
            TSAuthCallback tSAuthCallback = registeredCallbacks.get(getIntent().getStringExtra(CALLBACK_KEY));
            this.completionCallback = tSAuthCallback;
            if (tSAuthCallback == null) {
                completeWithErrorAndFinish(new TSWebAuthnRegistrationError.InternalError("Could not retrieve completion callback.", null));
                return;
            } else {
                launchRegisterPendingIntent();
                return;
            }
        }
        if (getIntent().getIntExtra(OPERATION_EXTRA, 0) != 123123 && getIntent().getIntExtra(OPERATION_EXTRA, 0) != 1231235) {
            finish();
            return;
        }
        TSAuthCallback tSAuthCallback2 = registeredCallbacks.get(getIntent().getStringExtra(CALLBACK_KEY));
        this.completionCallback = tSAuthCallback2;
        if (tSAuthCallback2 == null) {
            completeWithErrorAndFinish(new TSWebAuthnAuthenticationError.InternalError("Could not retrieve completion callback.", null));
        } else {
            launchSignPendingIntent();
        }
    }

    private void handleRegisterRequestResult(int i2, Intent intent) {
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra(Fido.FIDO2_KEY_CREDENTIAL_EXTRA) : null;
        if (i2 != -1) {
            completeWithErrorAndFinish(new TSWebAuthnRegistrationError.InternalError("Illegal Fido2 result code!", null));
            return;
        }
        if (byteArrayExtra == null) {
            completeWithErrorAndFinish(new TSWebAuthnRegistrationError.InternalError("Couldn't get Key credential extra.", null));
            return;
        }
        PublicKeyCredential publicKeyCredentialDeserializeFromBytes = PublicKeyCredential.deserializeFromBytes(byteArrayExtra);
        AuthenticatorResponse response = publicKeyCredentialDeserializeFromBytes.getResponse();
        if (response instanceof AuthenticatorErrorResponse) {
            completeWithErrorAndFinish(new TSWebAuthnRegistrationError.InternalError(response.toString(), null));
        } else {
            completeWithResultAndFinish(publicKeyCredentialDeserializeFromBytes);
        }
    }

    private void launchSignPendingIntent() {
        Fido2ApiClient fido2ApiClient = Fido.getFido2ApiClient(getApplicationContext());
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) getIntent().getParcelableExtra(CREDENTIALS_EXTRA);
        if (fido2ApiClient == null) {
            this.completionCallback.error(new TSWebAuthnAuthenticationError.InternalError("Fido2 API client is not available", null));
        } else {
            if (publicKeyCredentialRequestOptions == null) {
                this.completionCallback.error(new TSWebAuthnAuthenticationError.InternalError("Couldn't get public key credentials request options.", null));
                return;
            }
            Task<PendingIntent> signPendingIntent = fido2ApiClient.getSignPendingIntent(publicKeyCredentialRequestOptions);
            signPendingIntent.addOnSuccessListener(new OnSuccessListener<PendingIntent>() { // from class: com.transmit.authentication.webauthn.TSOverlayActivity.3
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(PendingIntent pendingIntent) {
                    if (pendingIntent != null) {
                        try {
                            TSOverlayActivity.this.startIntentSenderForResult(pendingIntent.getIntentSender(), TSOverlayActivity.SIGN_USERLESS_REQUEST_CODE, null, 0, 0, 0);
                        } catch (IntentSender.SendIntentException e2) {
                            TSOverlayActivity.this.completionCallback.error(new TSWebAuthnAuthenticationError.InternalError(e2.getMessage(), e2));
                            e2.printStackTrace();
                        }
                    }
                }
            });
            signPendingIntent.addOnFailureListener(new OnFailureListener() { // from class: com.transmit.authentication.webauthn.TSOverlayActivity.4
                @Override // com.google.android.gms.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    TSOverlayActivity.this.completionCallback.error(new TSWebAuthnAuthenticationError.InternalError(exc.getMessage(), exc));
                    exc.printStackTrace();
                }
            });
        }
    }

    public static String registerCallbackForResultCompletion(TSAuthCallback tSAuthCallback) {
        String string = UUID.randomUUID().toString();
        registeredCallbacks.put(string, tSAuthCallback);
        return string;
    }

    protected void completeWithErrorAndFinish(Object obj) {
        this.completionCallback.error(obj);
        finish();
        overridePendingTransition(0, 0);
    }

    protected void completeWithResultAndFinish(Object obj) {
        this.completionCallback.success(obj);
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strYd = C1561oA.yd("*\u0019\\\u001c}", (short) (C1607wl.Xd() ^ (68591027 ^ 68591463)));
            String strYd2 = C1561oA.Yd("\u0018\u0007", (short) (C1633zX.Xd() ^ ((1302918908 ^ 1686945797) ^ (-690238220))));
            try {
                Class<?> cls = Class.forName(strYd);
                Field field = 0 != 0 ? cls.getField(strYd2) : cls.getDeclaredField(strYd2);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strQd = Xg.qd("`O\u0017V<", (short) (C1607wl.Xd() ^ ((494106601 ^ 1725011876) ^ 2074279658)), (short) (C1607wl.Xd() ^ ((1378524091 ^ 1383233835) ^ 5812602)));
                short sXd = (short) (Od.Xd() ^ ((151073603 ^ 49088515) ^ (-200018694)));
                short sXd2 = (short) (Od.Xd() ^ ((1062229687 ^ 316478704) ^ (-764243779)));
                int[] iArr = new int[" _".length()];
                QB qb = new QB(" _");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                try {
                    Class<?> cls2 = Class.forName(strQd);
                    Field field2 = 0 != 0 ? cls2.getField(str) : cls2.getDeclaredField(str);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    short sXd3 = (short) (C1633zX.Xd() ^ ((1390391388 ^ 1799101566) ^ (-971213335)));
                    short sXd4 = (short) (C1633zX.Xd() ^ (339135987 ^ (-339121818)));
                    int[] iArr2 = new int["~}\u0011\u0013\u001a".length()];
                    QB qb2 = new QB("~}\u0011\u0013\u001a");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    String strUd = C1626yg.Ud("W\\", (short) (FB.Xd() ^ ((2004422697 ^ 173501325) ^ 2100179882)), (short) (FB.Xd() ^ (556656709 ^ 556661338)));
                    try {
                        Class<?> cls3 = Class.forName(str2);
                        Field field3 = 0 != 0 ? cls3.getField(strUd) : cls3.getDeclaredField(strUd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Ig.wd("\nG_\u000b\u0004", (short) (Od.Xd() ^ ((252786787 ^ 874516329) ^ (-993078080))))).getDeclaredMethod(EO.Od("%h", (short) (FB.Xd() ^ (129744940 ^ 129746457))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strQd2 = C1561oA.Qd("o`dYcj", (short) (OY.Xd() ^ (1245585955 ^ 1245601674)));
                                short sXd5 = (short) (OY.Xd() ^ (307946827 ^ 307941108));
                                short sXd6 = (short) (OY.Xd() ^ ((1552565467 ^ 144727722) ^ 1412043989));
                                int[] iArr3 = new int["Xf]ljea,boovhry4Jww~p\u0005\u0002".length()];
                                QB qb3 = new QB("Xf]ljea,boovhry4Jww~p\u0005\u0002");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd5 + i4)) - sXd6);
                                    i4++;
                                }
                                Object[] objArr2 = {strQd2};
                                Method method = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.Kd("QP`@gbdV_FYgl`[^", (short) (OY.Xd() ^ ((1476644339 ^ 719652303) ^ 1927712141))), Class.forName(C1561oA.od("kau_+h\\h`&Jjg]aY", (short) (C1499aX.Xd() ^ (768458297 ^ (-768460459))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = Wg.Zd("Q50d\r", (short) (FB.Xd() ^ ((176788685 ^ 389100593) ^ 498660320)), (short) (FB.Xd() ^ ((1667111607 ^ 158234717) ^ 1781557384)));
                                    short sXd7 = (short) (FB.Xd() ^ (343875985 ^ 343883820));
                                    int[] iArr4 = new int["\u001b\u0011".length()];
                                    QB qb4 = new QB("\u001b\u0011");
                                    int i5 = 0;
                                    while (qb4.YK()) {
                                        int iKK4 = qb4.KK();
                                        Xu xuXd4 = Xu.Xd(iKK4);
                                        iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd7 + i5));
                                        i5++;
                                    }
                                    String str3 = new String(iArr4, 0, i5);
                                    try {
                                        Class<?> cls4 = Class.forName(strZd);
                                        Field field4 = 0 != 0 ? cls4.getField(str3) : cls4.getDeclaredField(str3);
                                        field4.setAccessible(true);
                                        field4.set(null, windowManager);
                                    } catch (Throwable th4) {
                                    }
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    String strVd = Wg.vd("C2y9\u0017", (short) (C1499aX.Xd() ^ (512845949 ^ (-512847774))));
                    String strKd = Qg.kd("\f\u007f", (short) (C1499aX.Xd() ^ (1652778509 ^ (-1652779647))), (short) (C1499aX.Xd() ^ ((2089799021 ^ 50308199) ^ (-2121269923))));
                    try {
                        Class<?> cls5 = Class.forName(strVd);
                        Field field5 = 0 != 0 ? cls5.getField(strKd) : cls5.getDeclaredField(strKd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strVd2 = hg.Vd("/\u001ca\u001f\u0003", (short) (C1607wl.Xd() ^ ((1610642817 ^ 1562192351) ^ 1025317135)), (short) (C1607wl.Xd() ^ ((1602871493 ^ 81347874) ^ 1532011355)));
                        String strUd2 = C1561oA.ud(":.", (short) (Od.Xd() ^ ((1833197304 ^ 1595193084) ^ (-844151279))));
                        try {
                            Class<?> cls6 = Class.forName(strVd2);
                            Field field6 = 0 != 0 ? cls6.getField(strUd2) : cls6.getDeclaredField(strUd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i6 = (1129440844 ^ 212982885) ^ 1340095074;
                        if (x2 > i6 && x2 < displayMetrics.widthPixels - i6 && y2 > i6 && y2 < displayMetrics.heightPixels - i6) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void launchRegisterPendingIntent() {
        Fido2ApiClient fido2ApiClient = Fido.getFido2ApiClient(getApplicationContext());
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) getIntent().getParcelableExtra(CREDENTIALS_EXTRA);
        if (fido2ApiClient == null || publicKeyCredentialCreationOptions == null) {
            this.completionCallback.error(new TSWebAuthnRegistrationError.InternalError("Could not generate register request.", null));
            return;
        }
        Task<PendingIntent> registerPendingIntent = fido2ApiClient.getRegisterPendingIntent(publicKeyCredentialCreationOptions);
        registerPendingIntent.addOnSuccessListener(new OnSuccessListener() { // from class: com.transmit.authentication.webauthn.TSOverlayActivity.1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Object obj) {
                if (obj != null) {
                    try {
                        TSOverlayActivity.this.startIntentSenderForResult(((PendingIntent) obj).getIntentSender(), TSOverlayActivity.REGISTER_REQUEST_CODE, null, 0, 0, 0);
                    } catch (IntentSender.SendIntentException e2) {
                        TSOverlayActivity.this.completionCallback.error(new TSWebAuthnRegistrationError.InternalError(e2.getMessage(), e2));
                    }
                }
            }
        });
        registerPendingIntent.addOnFailureListener(new OnFailureListener() { // from class: com.transmit.authentication.webauthn.TSOverlayActivity.2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                TSOverlayActivity.this.completionCallback.error(new TSWebAuthnRegistrationError.InternalError(exc.getMessage(), exc));
                exc.printStackTrace();
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 123123 && i2 != 1231235) {
            if (i2 == 34543) {
                handleRegisterRequestResult(i3, intent);
            }
        } else {
            if (i3 != -1 || intent == null || intent.getExtras() == null) {
                completeWithErrorAndFinish(new TSWebAuthnAuthenticationError.InternalError("Sign request code is not OK.", null));
                return;
            }
            PublicKeyCredential publicKeyCredentialDeserializeFromBytes = PublicKeyCredential.deserializeFromBytes(intent.getExtras().getByteArray(Fido.FIDO2_KEY_CREDENTIAL_EXTRA));
            AuthenticatorResponse response = publicKeyCredentialDeserializeFromBytes.getResponse();
            if (response instanceof AuthenticatorErrorResponse) {
                completeWithErrorAndFinish(new TSWebAuthnAuthenticationError.InternalError(((AuthenticatorErrorResponse) response).getErrorMessage(), null));
            } else {
                completeWithResultAndFinish(publicKeyCredentialDeserializeFromBytes);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        handleIncomingRequest();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }
}
