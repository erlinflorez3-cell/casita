package com.ticnow.sdk.idnowonboarding.steps.steplauncher.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.dynatrace.android.callback.Callback;
import com.ticnow.sdk.idnowonboarding.R;
import com.ticnow.sdk.idnowonboarding.connectivity.ConnectionAliveCallback;
import com.ticnow.sdk.idnowonboarding.dialog.Dialog;
import com.ticnow.sdk.idnowonboarding.dialog.IDDialog;
import com.ticnow.sdk.idnowonboarding.dialog.ProgressDialog;
import com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity;
import com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration;
import com.ticnow.sdk.idnowonboarding.model.step.IDStepKind;
import com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices;
import com.ticnow.sdk.idnowonboarding.services.enrollment.enrolmentcallbacks.FinishEnrollmentRequestCallback;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.controller.IDDNIController;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.controller.IDMatchEnrollFaceController;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.controller.IDMatchFaceController;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.validateotp.controllers.IDValidateOtpController;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import com.ticnow.sdk.idnowonboarding.viewmodel.StepLauncherViewModel;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApiImpl;
import com.ticnow.sdk.idnowsecurity.http.codes.IDEnrollmentResponseCodes;
import com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath;
import com.ticnow.sdk.idnowsecurity.http.request.CommonParamsRequest;
import com.ticnow.sdk.idnowsecurity.http.request.CommonUserDataRequest;
import com.ticnow.sdk.idnowsecurity.http.response.FinishEnrollmentResponse;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Яp\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјnjO0LeN/ZS@\u000fsڔ<$q$yّCU0}*\tUOog|Jb\u000bI\u0012\u000e\u0016\u000fj4կ]xs\u0012\u00172HpG3[uE9ft>\u000562*8\u007f\u0006\t\u001a@H\u0018v\u0001DS\f 9H\u0081BR#M\r܅(ßn /\u001d\u001djߑ:Hz]\u000351\u0014\u0002B|9&0ES\u001bYl';\t(\u001fsFEI-%\u0002\u0015MR$E\u0011T\n=3zm's_\u0002mNX.&E/]$urTt5Un%?+}}\u0012PV.\u0006\u0016\u0014\rj\u0016T\u0006oh<I2f6 cx\u0001pXP0|r\u0004\t\u0001N\u0017S\u001ec1G;~Sw:Go}\u000eM\u0013,E\u0019nOm\u001b\")%)w\u0010Q_cpCVr\"[Sl2\u0016)\u0014r\n>m\u0018/*#t)mOi`;!\u001a\u0014xHu\u001f\u001d`\u0017|\u001aXVj:p,6X4RZ\u0015p\u0013lhT\u0007.g۶^Τ\u000b}\u0010ʶph\u0006?9%>R&ř\u0016ҷQ]\u0012ɘ\u007frE^\u0007k<]\u0010ӗ_̳Uc\u0018Р#\u0003\"FTb3^=̾\u007f۱^\\0ί\u0003Tx\u0018\u0010{rTbƑ^Ɛu\u001c<ι\u0002%j\u001e`\u0003LL\u0018Ҕ5ރ^h\u0018з%?2\u000e\u0002$#\u0015Wˉ^ʼsg\u0001̢|\tn/EA\u007fCoĢ\u0002ɋl4\u0005ȽW\u000b\u0002\u000f_gzU#́B\u0091Y{(چjE_?U\u0013=\r\u007fɈ.βILzόˡQ>"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$w[R;v;\u001a%q_<\u0007puJt6K]R;p\u001c`L\u0014\u001dA\n^4\u000b\bYN\u007flS;0\f;]W", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0002)Fm#/IA;y}\r\u0019fjC\u0019?*]z8K[b\u0002", "u(E", "\"@6", "", "0tcAb5\u001c]\"\u000e~g<|", "\u001a`]1e6BRb\u0011~].|\u0018xB\u00107\u000bJ\nl", "7lP4X\u001dBS+[v\\2", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "7lP4X\u001dBS+\\\u0002h:|", "7lP4X\u001dBS+aze7", ";UX2j\u0014HR\u0019\u0006", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u000f$7\u007f\u001e8LCB5\"-\u0015sH5\u0017l*Qv48PN>D\\q=\u001bg", ">q^4e,Law\u0003ve6~", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#|$3t 0\u0017.Hu6+\u0015vo\u0018\u000b_3Xx|", "BdgAI0>ew~\t\\9\u0001\u0014>i\n1", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", "BdgAI0>e{\u0003\u0004m", "BdgAI0>e\b\u0003\nm3|", "/cYBf;.Wy\t\bL;|\u0014", "", "1gT0^\u0010Gb\u0019\f\u0004^;Z\u00138n\u007f&\u000bD\u000b ", "4`X9", "4h]6f/\u001e\\&\t\u0002e4|\u0012>", ":`d;V/\"\\(~\bg,\ff9n\t(yO\u0005! &s\nC\u0001'", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", ":`d;V/,b\u0019\n", "=m00g0OW(\u0013g^:\r\u0010>", "@d`BX:M1#}z", "", "@dbB_;\u001c]\u0018~", "2`c.", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "=m1.V2)`\u0019\r\t^+", "=m2?X(MS", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=mA2f<FS", "Adc\u0013\\5Ba\u001ckzl<\u0004\u0018", "AtR0X:L", "", "@db=b5LS", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gulj=\u0015f\fW\u00041NSV,ea_=\"\u001dd\u0017\\+b", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class StepLauncherActivity extends TicnowActivity {
    private HashMap _$_findViewCache;
    private Button buttonContinue;
    private ImageView imageViewBack;
    private ImageView imageViewClose;
    private ImageView imageViewHelp;
    private StepLauncherViewModel mViewModel;
    private TextView textViewDescription;
    private TextView textViewHint;
    private TextView textViewTittle;
    private final String TAG = "StepLauncherActivity";
    private final ProgressDialog progressDialog = new ProgressDialog();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[IDStepKind.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[IDStepKind.analizeDni.ordinal()] = 1;
            iArr[IDStepKind.analizePassport.ordinal()] = 2;
            iArr[IDStepKind.matchFaceZoom.ordinal()] = 3;
            iArr[IDStepKind.matchEnrollFaceZoom.ordinal()] = 4;
            iArr[IDStepKind.genericStep.ordinal()] = 5;
            iArr[IDStepKind.genericImageStep.ordinal()] = 6;
            iArr[IDStepKind.compareSignature.ordinal()] = 7;
            iArr[IDStepKind.finishEnrollment.ordinal()] = 8;
            iArr[IDStepKind.registerPhone.ordinal()] = 9;
            iArr[IDStepKind.validateOtp.ordinal()] = 10;
            int[] iArr2 = new int[IDStepKind.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[IDStepKind.analizeDni.ordinal()] = 1;
            iArr2[IDStepKind.analizePassport.ordinal()] = 2;
            iArr2[IDStepKind.matchFaceZoom.ordinal()] = 3;
            iArr2[IDStepKind.matchEnrollFaceZoom.ordinal()] = 4;
            iArr2[IDStepKind.genericStep.ordinal()] = 5;
            iArr2[IDStepKind.genericImageStep.ordinal()] = 6;
            iArr2[IDStepKind.compareSignature.ordinal()] = 7;
            iArr2[IDStepKind.registerPhone.ordinal()] = 8;
            iArr2[IDStepKind.validateOtp.ordinal()] = 9;
            int[] iArr3 = new int[IDEnrollmentResponseCodes.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[IDEnrollmentResponseCodes.COD_OK.ordinal()] = 1;
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.steplauncher.activity.StepLauncherActivity$checkInternetConnection$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u0003\rI\u00066\f<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(sI>c\u001e"}, d2 = {"\n`]<a@F])\rS", "", "7s", "", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m56a0LV\u0019}", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q\u0004q"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass1 implements ConnectionAliveCallback {

        /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.steplauncher.activity.StepLauncherActivity$checkInternetConnection$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
        static final class RunnableC03091 implements Runnable {
            RunnableC03091() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IDDialog.showDialog(StepLauncherActivity.this.getSupportFragmentManager(), StepLauncherActivity.this, StepLauncherActivity.this, "", "Revise su conexión a internet.\nPor favor intente su proceso más tarde.", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.steplauncher.activity.StepLauncherActivity.checkInternetConnection.1.1.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Callback.onClick_enter(view);
                        try {
                            StepLauncherActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.steplauncher.activity.StepLauncherActivity.checkInternetConnection.1.1.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StepLauncherActivity.this.setResult(3036, new Intent());
                                    StepLauncherActivity.this.finish();
                                }
                            });
                        } finally {
                            Callback.onClick_exit();
                        }
                    }
                });
            }
        }

        AnonymousClass1() {
        }

        @Override // com.ticnow.sdk.idnowonboarding.connectivity.ConnectionAliveCallback
        public final void onFinished(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                return;
            }
            StepLauncherActivity.this.runOnUiThread(new RunnableC03091());
        }
    }

    public static final /* synthetic */ Button access$getButtonContinue$p(StepLauncherActivity stepLauncherActivity) {
        Button button = stepLauncherActivity.buttonContinue;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
        }
        return button;
    }

    private final void adjustUiForStep() {
        StepLauncherViewModel stepLauncherViewModel = this.mViewModel;
        if (stepLauncherViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        IDStepKind stepKind = stepLauncherViewModel.getStepKind();
        if (stepKind == null) {
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[stepKind.ordinal()];
        if (i2 == 1) {
            TextView textView = this.textViewTittle;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewTittle");
            }
            textView.setText("Tomar foto de su cédula");
            TextView textView2 = this.textViewDescription;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewDescription");
            }
            textView2.setText("Enfoque la cédula con la cámara de su\ncelular. Tomaremos una foto frontal y una\nposterior de su documento. Las fotos se\ntomarán automáticamente");
            TextView textView3 = this.textViewHint;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewHint");
            }
            textView3.setText("ORIENTACIÓN CORRECTA DE LA CÉDULA");
            ImageView imageView = this.imageViewHelp;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageViewHelp");
            }
            imageView.setImageResource(R.drawable.img_dni_hint_dav);
            return;
        }
        if (i2 == 3) {
            TextView textView4 = this.textViewTittle;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewTittle");
            }
            textView4.setText("Tomar foto de su rostro");
            TextView textView5 = this.textViewDescription;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewDescription");
            }
            textView5.setText("Ubique el celular frente a su rostro,\nenfóquelo en el óvalo pequeño y luego\nen el grande. Las fotografías se tomarán\nautomáticamente.");
            TextView textView6 = this.textViewHint;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewHint");
            }
            textView6.setText("CAPTURAR ROSTRO");
            ImageView imageView2 = this.imageViewHelp;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageViewHelp");
            }
            imageView2.setImageResource(R.drawable.img_selfie_hint_dav);
            return;
        }
        if (i2 == 4) {
            TextView textView7 = this.textViewTittle;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewTittle");
            }
            textView7.setText("Capturar rostro");
            TextView textView8 = this.textViewDescription;
            if (textView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewDescription");
            }
            textView8.setText("Evite un ambiente carente de luz, procure evitar sombras y reflejos excesivos en el rostro, evite cualquier objeto en el fondo de la captura para lograr contraste.");
            TextView textView9 = this.textViewHint;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewHint");
            }
            textView9.setText("CAPTURA ZOOM®");
            ImageView imageView3 = this.imageViewHelp;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageViewHelp");
            }
            imageView3.setImageResource(R.drawable.img_selfie_hint_dav);
            return;
        }
        switch (i2) {
            case 8:
                Button button = this.buttonContinue;
                if (button == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
                }
                button.setEnabled(false);
                this.progressDialog.show(this, "Cargando");
                finishEnrollment();
                break;
            case 9:
                TextView textView10 = this.textViewTittle;
                if (textView10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textViewTittle");
                }
                textView10.setText("Registro teléfono");
                TextView textView11 = this.textViewDescription;
                if (textView11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textViewDescription");
                }
                textView11.setText("Ingrese su número de teléfono sin código de área");
                TextView textView12 = this.textViewHint;
                if (textView12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textViewHint");
                }
                textView12.setText("");
                ImageView imageView4 = this.imageViewHelp;
                if (imageView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageViewHelp");
                }
                imageView4.setImageResource(0);
                break;
            case 10:
                TextView textView13 = this.textViewTittle;
                if (textView13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textViewTittle");
                }
                textView13.setText("Validación teléfono");
                TextView textView14 = this.textViewDescription;
                if (textView14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textViewDescription");
                }
                textView14.setText("Ingrese el código que ha recibido mediante SMS");
                TextView textView15 = this.textViewHint;
                if (textView15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textViewHint");
                }
                textView15.setText("");
                ImageView imageView5 = this.imageViewHelp;
                if (imageView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageViewHelp");
                }
                imageView5.setImageResource(0);
                break;
        }
    }

    private final void checkInternetConnection() {
        IDDialog.showPreConnectionPopup(2, getSupportFragmentManager(), this, this, new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail() {
        setResult(170008, new Intent());
        finish();
    }

    private final void finishEnrollment() {
        IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
        StepLauncherActivity stepLauncherActivity = this;
        StepLauncherActivity stepLauncherActivity2 = this;
        StepLauncherViewModel stepLauncherViewModel = this.mViewModel;
        if (stepLauncherViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        IDNowOnboardingConfiguration onboardingConfiguration = stepLauncherViewModel.getOnboardingConfiguration();
        if (onboardingConfiguration == null) {
            Intrinsics.throwNpe();
        }
        CommonParamsRequest commonParamsRequest = onboardingConfiguration.commonParams;
        Intrinsics.checkExpressionValueIsNotNull(commonParamsRequest, "mViewModel.onboardingConfiguration!!.commonParams");
        StepLauncherViewModel stepLauncherViewModel2 = this.mViewModel;
        if (stepLauncherViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        IDNowOnboardingConfiguration onboardingConfiguration2 = stepLauncherViewModel2.getOnboardingConfiguration();
        if (onboardingConfiguration2 == null) {
            Intrinsics.throwNpe();
        }
        CommonUserDataRequest commonUserDataRequest = onboardingConfiguration2.commonUserData;
        Intrinsics.checkExpressionValueIsNotNull(commonUserDataRequest, "mViewModel.onboardingCon…guration!!.commonUserData");
        StepLauncherViewModel stepLauncherViewModel3 = this.mViewModel;
        if (stepLauncherViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        IDNowOnboardingConfiguration onboardingConfiguration3 = stepLauncherViewModel3.getOnboardingConfiguration();
        if (onboardingConfiguration3 == null) {
            Intrinsics.throwNpe();
        }
        IDEnrollmentServices.finishEnrollment(stepLauncherActivity, stepLauncherActivity2, new FinishEnrollmentRequestCallback() { // from class: com.ticnow.sdk.idnowonboarding.steps.steplauncher.activity.StepLauncherActivity.finishEnrollment.1
            @Override // com.ticnow.sdk.idnowonboarding.services.enrollment.enrolmentcallbacks.FinishEnrollmentRequestCallback
            public final void onFinishEnrollmentRequestResponse(FinishEnrollmentResponse finishEnrollmentResponse, IDEnrollmentResponseCodes iDEnrollmentResponseCodes) {
                if (iDEnrollmentResponseCodes != null && WhenMappings.$EnumSwitchMapping$2[iDEnrollmentResponseCodes.ordinal()] == 1) {
                    StepLauncherActivity.this.setFinishResult(true, finishEnrollmentResponse);
                } else {
                    StepLauncherActivity.this.setFinishResult(false, null);
                }
                StepLauncherActivity.access$getButtonContinue$p(StepLauncherActivity.this).setEnabled(true);
            }
        }, iDSecurityApiImpl.generateFinishEnrollmentRequest(stepLauncherActivity, stepLauncherActivity2, commonParamsRequest, commonUserDataRequest, onboardingConfiguration3.additionalHeaders));
    }

    private final void launchInternetConnectionDialog(Context context, final Activity activity) {
        Dialog.INSTANCE.show(getSupportFragmentManager(), activity, "Comunicación no disponible", "Intente nuevamente", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.steplauncher.activity.StepLauncherActivity.launchInternetConnectionDialog.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    activity.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.steplauncher.activity.StepLauncherActivity.launchInternetConnectionDialog.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            StepLauncherActivity.this.progressDialog.getDialog().dismiss();
                            StepLauncherActivity.this.fail();
                        }
                    });
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchStep() throws Exception {
        Button button = this.buttonContinue;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
        }
        button.setEnabled(false);
        StepLauncherViewModel stepLauncherViewModel = this.mViewModel;
        if (stepLauncherViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        IDStepKind stepKind = stepLauncherViewModel.getStepKind();
        if (stepKind == null) {
            return;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[stepKind.ordinal()];
        if (i2 == 1) {
            IDDNIController.Builder builder = new IDDNIController.Builder(this, this);
            StepLauncherViewModel stepLauncherViewModel2 = this.mViewModel;
            if (stepLauncherViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            IDDNIController.Builder builderConfiguration = builder.configuration(stepLauncherViewModel2.getOnboardingConfiguration());
            StepLauncherViewModel stepLauncherViewModel3 = this.mViewModel;
            if (stepLauncherViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            builderConfiguration.stepParams(stepLauncherViewModel3.getStepParams()).Build().Start();
            return;
        }
        if (i2 == 9) {
            IDValidateOtpController.Builder builder2 = new IDValidateOtpController.Builder(this, this);
            StepLauncherViewModel stepLauncherViewModel4 = this.mViewModel;
            if (stepLauncherViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            IDValidateOtpController.Builder builderConfiguration2 = builder2.configuration(stepLauncherViewModel4.getOnboardingConfiguration());
            StepLauncherViewModel stepLauncherViewModel5 = this.mViewModel;
            if (stepLauncherViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            builderConfiguration2.stepParams(stepLauncherViewModel5.getStepParams()).Build().Start();
            return;
        }
        if (i2 == 3) {
            IDMatchFaceController.Builder builder3 = new IDMatchFaceController.Builder(this, this);
            StepLauncherViewModel stepLauncherViewModel6 = this.mViewModel;
            if (stepLauncherViewModel6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            IDMatchFaceController.Builder builderConfiguration3 = builder3.configuration(stepLauncherViewModel6.getOnboardingConfiguration());
            StepLauncherViewModel stepLauncherViewModel7 = this.mViewModel;
            if (stepLauncherViewModel7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            builderConfiguration3.stepParams(stepLauncherViewModel7.getStepParams()).Build().Start();
            return;
        }
        if (i2 != 4) {
            return;
        }
        IDMatchEnrollFaceController.Builder builder4 = new IDMatchEnrollFaceController.Builder(this, this);
        StepLauncherViewModel stepLauncherViewModel8 = this.mViewModel;
        if (stepLauncherViewModel8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        IDMatchEnrollFaceController.Builder builderConfiguration4 = builder4.configuration(stepLauncherViewModel8.getOnboardingConfiguration());
        StepLauncherViewModel stepLauncherViewModel9 = this.mViewModel;
        if (stepLauncherViewModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        builderConfiguration4.stepParams(stepLauncherViewModel9.getStepParams()).Build().Start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFinishResult(boolean z2, FinishEnrollmentResponse finishEnrollmentResponse) {
        Intent intent = new Intent();
        if (z2) {
            if (finishEnrollmentResponse == null) {
                Intrinsics.throwNpe();
            }
            intent.putExtra("finalScoring", finishEnrollmentResponse.getFinalScoring());
            intent.putExtra("seed", finishEnrollmentResponse.getSeed());
            if (Intrinsics.areEqual(finishEnrollmentResponse.getDescriptionStr(), "MR")) {
                intent.putExtra("status", "MR");
            } else {
                intent.putExtra("status", "R");
            }
            setResult(IDStepResponseCodes.STEP_RESULT_FINISH, intent);
        } else {
            setResult(IDStepResponseCodes.STEP_RESULT_ABORT_FLOW, intent);
        }
        finish();
    }

    @Override // com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity
    public void _$_clearFindViewByIdCache() {
        HashMap map = this._$_findViewCache;
        if (map != null) {
            map.clear();
        }
    }

    @Override // com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity
    public View _$_findCachedViewById(int i2) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i2);
        this._$_findViewCache.put(Integer.valueOf(i2), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strWd = Jg.Wd(" \\{\nI", (short) (FB.Xd() ^ (1393746983 ^ 1393731659)), (short) (FB.Xd() ^ (1053602969 ^ 1053589770)));
            String strXd = ZO.xd("\\m", (short) (FB.Xd() ^ (1648170 ^ 1670767)), (short) (FB.Xd() ^ (1414256012 ^ 1414238874)));
            try {
                Class<?> cls = Class.forName(strWd);
                Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1626yg.Ud("z\u0006Fo\u001f", (short) (C1607wl.Xd() ^ (259908166 ^ 259899463)), (short) (C1607wl.Xd() ^ ((1612803936 ^ 1117612748) ^ 582763274)));
                String strWd2 = Ig.wd("Z\"", (short) (OY.Xd() ^ (1788421593 ^ 1788424475)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strWd2) : cls2.getDeclaredField(strWd2);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strOd = EO.Od("a\u0007qN.", (short) (C1580rY.Xd() ^ ((1803268261 ^ 855576302) ^ (-1501872615))));
                    String strQd = C1561oA.Qd("/#", (short) (C1499aX.Xd() ^ (551390968 ^ (-551406153))));
                    try {
                        Class<?> cls3 = Class.forName(strOd);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Class<?> cls4 = Class.forName(C1593ug.zd("fU\u001dhJ", (short) (OY.Xd() ^ ((1421685449 ^ 1109669892) ^ 379150847)), (short) (OY.Xd() ^ (469491612 ^ 469487330))));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr = new Object[0];
                        short sXd = (short) (C1633zX.Xd() ^ (1021741757 ^ (-1021755047)));
                        int[] iArr = new int["7B".length()];
                        QB qb = new QB("7B");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                            i2++;
                        }
                        Method declaredMethod = cls4.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd2 = (short) (FB.Xd() ^ (397441043 ^ 397441886));
                                int[] iArr2 = new int[")\u001c\"\u0019%.".length()];
                                QB qb2 = new QB(")\u001c\"\u0019%.");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                                    i3++;
                                }
                                String str = new String(iArr2, 0, i3);
                                Class<?> cls5 = Class.forName(Wg.Zd("/\u001bO$H\u0001:j\u0016`>K\u0003j/l<KE\u000ei?5", (short) (C1499aX.Xd() ^ ((1723373949 ^ 1700567552) ^ (-65299148))), (short) (C1499aX.Xd() ^ ((1678305222 ^ 374488902) ^ (-1918560795)))));
                                Class<?>[] clsArr2 = {Class.forName(C1561oA.Xd("\f\u0004\u001a\u0006S\u0013\t\u0017\u0011X~! \u0018\u001e\u0018", (short) (Od.Xd() ^ ((1423242463 ^ 1660071637) ^ (-908475052)))))};
                                Object[] objArr2 = {str};
                                short sXd3 = (short) (ZN.Xd() ^ (1872583509 ^ 1872575617));
                                int[] iArr3 = new int["\u0010\r\u001bx&\u001f\u001f\u000f\u000er\u0004\u0010\u001b\r\u0006\u0007".length()];
                                QB qb3 = new QB("\u0010\r\u001bx&\u001f\u001f\u000f\u000er\u0004\u0010\u001b\r\u0006\u0007");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK((sXd3 ^ i4) + xuXd3.CK(iKK3));
                                    i4++;
                                }
                                Method method = cls5.getMethod(new String(iArr3, 0, i4), clsArr2);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strKd = Qg.kd("K8};\u001f", (short) (OY.Xd() ^ (1526706608 ^ 1526718536)), (short) (OY.Xd() ^ ((995200441 ^ 2087081215) ^ 1194821194)));
                                    short sXd4 = (short) (C1633zX.Xd() ^ ((443472773 ^ 1763376607) ^ (-1937001013)));
                                    short sXd5 = (short) (C1633zX.Xd() ^ ((206395202 ^ 281751677) ^ (-478566135)));
                                    int[] iArr4 = new int["ZN".length()];
                                    QB qb4 = new QB("ZN");
                                    int i5 = 0;
                                    while (qb4.YK()) {
                                        int iKK4 = qb4.KK();
                                        Xu xuXd4 = Xu.Xd(iKK4);
                                        iArr4[i5] = xuXd4.fK(sXd4 + i5 + xuXd4.CK(iKK4) + sXd5);
                                        i5++;
                                    }
                                    String str2 = new String(iArr4, 0, i5);
                                    try {
                                        Class<?> cls6 = Class.forName(strKd);
                                        Field field4 = 0 != 0 ? cls6.getField(str2) : cls6.getDeclaredField(str2);
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
                    String strUd2 = C1561oA.ud("\u0011}C\u0001d", (short) (C1499aX.Xd() ^ ((834828846 ^ 189525944) ^ (-982090625))));
                    short sXd6 = (short) (C1607wl.Xd() ^ (1224518385 ^ 1224533392));
                    int[] iArr5 = new int["eY".length()];
                    QB qb5 = new QB("eY");
                    int i6 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (sXd6 ^ i6));
                        i6++;
                    }
                    String str3 = new String(iArr5, 0, i6);
                    try {
                        Class<?> cls7 = Class.forName(strUd2);
                        Field field5 = 0 != 0 ? cls7.getField(str3) : cls7.getDeclaredField(str3);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        short sXd7 = (short) (C1499aX.Xd() ^ ((584468040 ^ 673229283) ^ (-183948101)));
                        int[] iArr6 = new int["\u001a\tP\u0010u".length()];
                        QB qb6 = new QB("\u001a\tP\u0010u");
                        int i7 = 0;
                        while (qb6.YK()) {
                            int iKK6 = qb6.KK();
                            Xu xuXd6 = Xu.Xd(iKK6);
                            iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - (((sXd7 + sXd7) + sXd7) + i7));
                            i7++;
                        }
                        String str4 = new String(iArr6, 0, i7);
                        short sXd8 = (short) (C1607wl.Xd() ^ (560155690 ^ 560140766));
                        short sXd9 = (short) (C1607wl.Xd() ^ ((1156445327 ^ 1657773497) ^ 639773588));
                        int[] iArr7 = new int["\u001f\u0015".length()];
                        QB qb7 = new QB("\u001f\u0015");
                        int i8 = 0;
                        while (qb7.YK()) {
                            int iKK7 = qb7.KK();
                            Xu xuXd7 = Xu.Xd(iKK7);
                            iArr7[i8] = xuXd7.fK((xuXd7.CK(iKK7) - (sXd8 + i8)) + sXd9);
                            i8++;
                        }
                        String str5 = new String(iArr7, 0, i8);
                        try {
                            Class<?> cls8 = Class.forName(str4);
                            Field field6 = 0 != 0 ? cls8.getField(str5) : cls8.getDeclaredField(str5);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i9 = 1143873345 ^ 1143873290;
                        if (x2 > i9 && x2 < displayMetrics.widthPixels - i9 && y2 > i9 && y2 < displayMetrics.heightPixels - i9) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Intent intent2 = new Intent();
        if (i2 == 1700) {
            switch (i3) {
                case IDStepResponseCodes.STEP_RESULT_USER_CANCELLED_ONBOARDING /* 3030 */:
                    setResult(IDStepResponseCodes.STEP_RESULT_USER_CANCELLED_ONBOARDING);
                    finish();
                    return;
                case IDStepResponseCodes.STEP_RESULT_DOCUMENT_MAX_LOCAL_ATTEMPS /* 3033 */:
                    setResult(IDStepResponseCodes.STEP_RESULT_DOCUMENT_MAX_LOCAL_ATTEMPS, intent2);
                    finish();
                    return;
                case IDStepResponseCodes.STEP_RESULT_DOCUMENT_BACK_MAX_LOCAL_ATTEMPS /* 3034 */:
                    setResult(IDStepResponseCodes.STEP_RESULT_DOCUMENT_BACK_MAX_LOCAL_ATTEMPS, intent2);
                    finish();
                    return;
                case IDStepResponseCodes.STEP_RESULT_SELFIE_MAX_LOCAL_ATTEMPS /* 3035 */:
                    setResult(IDStepResponseCodes.STEP_RESULT_SELFIE_MAX_LOCAL_ATTEMPS, intent2);
                    finish();
                    return;
                case 3036:
                    setResult(3036, intent2);
                    finish();
                    return;
                case IDStepResponseCodes.STEP_RESULT_OK /* 170000 */:
                    if (intent != null) {
                        try {
                            Serializable serializableExtra = intent.getSerializableExtra("additionalParams");
                            if (serializableExtra == null) {
                                throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<*>");
                            }
                            intent2.putExtra("additionalParams", (ArrayList) serializableExtra);
                        } catch (Exception unused) {
                        }
                    }
                    setResult(IDStepResponseCodes.STEP_RESULT_OK, intent2);
                    finish();
                    return;
                case IDStepResponseCodes.STEP_RESULT_CANCELED /* 170001 */:
                    setResult(IDStepResponseCodes.STEP_RESULT_CANCELED, intent2);
                    finish();
                    return;
                case IDStepResponseCodes.STEP_RESULT_ABORT_FLOW /* 170007 */:
                    setResult(IDStepResponseCodes.STEP_RESULT_ABORT_FLOW, intent2);
                    finish();
                    return;
                case 170008:
                    setResult(170008, intent2);
                    finish();
                    return;
                case IDStepResponseCodes.STEP_RESULT_FAIL /* 170050 */:
                    setResult(IDStepResponseCodes.STEP_RESULT_FAIL, intent2);
                    finish();
                    return;
                case IDStepResponseCodes.STEP_RESULT_DOCUMENT_QUALITY_FAIL /* 170051 */:
                    setResult(IDStepResponseCodes.STEP_RESULT_DOCUMENT_QUALITY_FAIL, intent2);
                    finish();
                    return;
                case IDStepResponseCodes.STEP_RESULT_DOCUMENT_NOT_MATCH /* 170052 */:
                    setResult(IDStepResponseCodes.STEP_RESULT_DOCUMENT_NOT_MATCH, intent2);
                    finish();
                    return;
                case IDStepResponseCodes.STEP_RESULT_DOCUMENT_INTEGRITY_FAIL /* 170053 */:
                    setResult(IDStepResponseCodes.STEP_RESULT_DOCUMENT_INTEGRITY_FAIL, intent2);
                    finish();
                    return;
                default:
                    return;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        setResult(IDStepResponseCodes.STEP_RESULT_CANCELED, new Intent());
        finish();
    }

    @Override // com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            getWindow().setFlags(8192, 8192);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.hide();
            }
            setContentView(R.layout.activity_step_launcher);
            setRequestedOrientation(1);
            animate();
            View viewFindViewById = findViewById(R.id.imageViewBack);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById, "findViewById(R.id.imageViewBack)");
            this.imageViewBack = (ImageView) viewFindViewById;
            View viewFindViewById2 = findViewById(R.id.imageViewClose);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById2, "findViewById(R.id.imageViewClose)");
            this.imageViewClose = (ImageView) viewFindViewById2;
            View viewFindViewById3 = findViewById(R.id.buttonContinue);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById3, "findViewById(R.id.buttonContinue)");
            this.buttonContinue = (Button) viewFindViewById3;
            View viewFindViewById4 = findViewById(R.id.textViewTittle);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById4, "findViewById(R.id.textViewTittle)");
            this.textViewTittle = (TextView) viewFindViewById4;
            View viewFindViewById5 = findViewById(R.id.textViewDescription);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById5, "findViewById(R.id.textViewDescription)");
            this.textViewDescription = (TextView) viewFindViewById5;
            View viewFindViewById6 = findViewById(R.id.textViewHint);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById6, "findViewById(R.id.textViewHint)");
            this.textViewHint = (TextView) viewFindViewById6;
            View viewFindViewById7 = findViewById(R.id.imageViewHelp);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById7, "findViewById(R.id.imageViewHelp)");
            this.imageViewHelp = (ImageView) viewFindViewById7;
            ViewModel viewModel = ViewModelProviders.of(this).get((Class<ViewModel>) StepLauncherViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(th…herViewModel::class.java)");
            StepLauncherViewModel stepLauncherViewModel = (StepLauncherViewModel) viewModel;
            this.mViewModel = stepLauncherViewModel;
            if (stepLauncherViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            if (stepLauncherViewModel.getOnboardingConfiguration() == null) {
                StepLauncherViewModel stepLauncherViewModel2 = this.mViewModel;
                if (stepLauncherViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                Serializable serializableExtra = getIntent().getSerializableExtra("configuration");
                if (serializableExtra == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration");
                }
                stepLauncherViewModel2.setOnboardingConfiguration((IDNowOnboardingConfiguration) serializableExtra);
            }
            StepLauncherViewModel stepLauncherViewModel3 = this.mViewModel;
            if (stepLauncherViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            if (stepLauncherViewModel3.getStepParams() == null) {
                StepLauncherViewModel stepLauncherViewModel4 = this.mViewModel;
                if (stepLauncherViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                Serializable serializableExtra2 = getIntent().getSerializableExtra("stepparams");
                if (serializableExtra2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath");
                }
                stepLauncherViewModel4.setStepParams((EnrollPath) serializableExtra2);
            }
            StepLauncherViewModel stepLauncherViewModel5 = this.mViewModel;
            if (stepLauncherViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            if (stepLauncherViewModel5.getStepKind() == null) {
                StepLauncherViewModel stepLauncherViewModel6 = this.mViewModel;
                if (stepLauncherViewModel6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                Serializable serializableExtra3 = getIntent().getSerializableExtra("stepkind");
                if (serializableExtra3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ticnow.sdk.idnowonboarding.model.step.IDStepKind");
                }
                stepLauncherViewModel6.setStepKind((IDStepKind) serializableExtra3);
            }
            ImageView imageView = this.imageViewBack;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageViewBack");
            }
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.steplauncher.activity.StepLauncherActivity.onCreate.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.onClick_enter(view);
                    try {
                        StepLauncherActivity.this.onBackPressed();
                    } finally {
                        Callback.onClick_exit();
                    }
                }
            });
            ImageView imageView2 = this.imageViewClose;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageViewClose");
            }
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.steplauncher.activity.StepLauncherActivity.onCreate.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.onClick_enter(view);
                    try {
                        Dialog.INSTANCE.show(StepLauncherActivity.this.getSupportFragmentManager(), StepLauncherActivity.this, "", "¿Desea cerrar sesión?", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.steplauncher.activity.StepLauncherActivity.onCreate.2.1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Callback.onClick_enter(view2);
                                try {
                                    StepLauncherActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_USER_CANCELLED_ONBOARDING, new Intent());
                                    StepLauncherActivity.this.finish();
                                } finally {
                                    Callback.onClick_exit();
                                }
                            }
                        }, "Cancelar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.steplauncher.activity.StepLauncherActivity.onCreate.2.2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Callback.onClick_enter(view2);
                                try {
                                } finally {
                                    Callback.onClick_exit();
                                }
                            }
                        }, new DialogInterface.OnDismissListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.steplauncher.activity.StepLauncherActivity.onCreate.2.3
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                            }
                        });
                    } finally {
                        Callback.onClick_exit();
                    }
                }
            });
            Button button = this.buttonContinue;
            if (button == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
            }
            button.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.steplauncher.activity.StepLauncherActivity.onCreate.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.onClick_enter(view);
                    try {
                        String unused = StepLauncherActivity.this.TAG;
                        StepLauncherActivity.access$getButtonContinue$p(StepLauncherActivity.this).setEnabled(false);
                        if (!StepLauncherActivity.access$getButtonContinue$p(StepLauncherActivity.this).isEnabled()) {
                            StepLauncherActivity.this.launchStep();
                        }
                    } finally {
                        Callback.onClick_exit();
                    }
                }
            });
            checkInternetConnection();
            adjustUiForStep();
        } catch (Exception e2) {
            String str = this.TAG;
            Dialog.INSTANCE.show(getSupportFragmentManager(), this, "Error interno", "Intente nuevamente", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.steplauncher.activity.StepLauncherActivity.onCreate.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.onClick_enter(view);
                    try {
                        StepLauncherActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.steplauncher.activity.StepLauncherActivity.onCreate.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                StepLauncherActivity.this.progressDialog.getDialog().dismiss();
                                StepLauncherActivity.this.fail();
                            }
                        });
                    } finally {
                        Callback.onClick_exit();
                    }
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        Button button = this.buttonContinue;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
        }
        button.setEnabled(true);
    }
}
