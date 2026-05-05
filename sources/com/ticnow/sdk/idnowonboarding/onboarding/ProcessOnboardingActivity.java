package com.ticnow.sdk.idnowonboarding.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Patterns;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.ActivityCompat;
import com.dynatrace.android.callback.Callback;
import com.dynatrace.android.callback.OkCallback;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ticnow.sdk.idnowonboarding.R;
import com.ticnow.sdk.idnowonboarding.connectivity.ConnectionAliveCallback;
import com.ticnow.sdk.idnowonboarding.dialog.IDDialog;
import com.ticnow.sdk.idnowonboarding.enrollresult.IDNowEnrollmentResult;
import com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity;
import com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration;
import com.ticnow.sdk.idnowonboarding.model.data.IDNowOnboardingData;
import com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices;
import com.ticnow.sdk.idnowonboarding.services.enrollment.enrolmentcallbacks.GetRegisterPathRequestCallBack;
import com.ticnow.sdk.idnowonboarding.services.enrollment.enrolmentcallbacks.InitEnrollmentRequestCallback;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApi;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApiImpl;
import com.ticnow.sdk.idnowsecurity.http.codes.IDEnrollmentResponseCodes;
import com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import com.ticnow.sdk.idnowsecurity.http.request.CommonParamsRequest;
import com.ticnow.sdk.idnowsecurity.http.request.CommonUserDataRequest;
import com.ticnow.sdk.idnowsecurity.http.request.UserDataRequest;
import com.ticnow.sdk.idnowsecurity.http.response.InitEnrollmentResponse;
import com.ticnow.sdk.idnowsecurity.http.response.RegisterPathResponse;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.CX;
import yg.EO;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

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
@Metadata(bv = {1, 0, 3}, d1 = {"Яv\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176B\u0005&4\u0012\u000e\u0007nʑA0RkP\u008cZS@\u000fs{:'c$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u0014\u0016\u0001j2I]xs\u0012\u00172HtG3coE9fu>\u000562*8\u007f\u0005\t\u001a8W\u0018͌\u0003CY\u001f\u001a0FqBR#M\r\u001a(\u0006F \u0007\u001erɡ~6vk\u001e=ǥ'\u0003wB\u0017-mH\u0015M;_\u001b'U\u0005o8C@eNE)a\u001e\u001fR\n[I?:C\u0013\u0006?'Yb:W~^\u000e2-+}&$rnb\u0013px\fUD\u0016c\u0014p\u001cH\u0010z*&l\b\u001c'?H\\8Jj\u00160Kt!^pV\u0010\u0002Z\u0002\u0011`d;k\u0012{1G@~Q\u0010T_b\u007f\f\u001336#/\bQab5x\u00171S&ywd\thVw\"Yk\u00074tp#B\u0004^R0;\n;F\u001f5;a83!\u001a\u0004vo\u0018z\u0013\r\u0001S\u0018\u007f\u000fṮr\u0016EXQ hs|\u0005\u001ai\u0005b:Ae\"d\t\u000e\bAR\u000b)\u0003!m\u0016\\\u0003\u0001i\u0019f$\nu;t8qn\u001a\u0010.ޭ!ۋ9Qk߄2a\u0005\u0017W<\u0011ڳֽjH[ێr^.&@M;\u001f\u0006\u0002\\N:Ǝ\u0558Cw$عD3\u001fc#MS*PI\u0015\t\u000ec?ɰ+Ձ7$\u000bǭt\u0001\u0017\u000bh\\\u001fz>ձ\fض\u0001`*Ί\u0012iC%>UPu\u000bñ/ȷ\u0003\u007f\bø\u007fNMZz%\u0016W\u00020$+\n]=O+\u000f-<\tċY։Prmʸ\u001e\u001e5\u000f\u0015y=P?֮\u0014Űnp4ߌ;V]j/\"%uIֿ4ܐ\u0004yi¿ےK\u0018"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\b)4w\u0012;LGDm}\t\"r_9\u0015q\u0016Ws1CYM0eTN;#\u0016k\u0012]?b", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0002)Fm#/IA;y}\r\u0019fjC\u0019?*]z8K[b\u0002", "u(E", "\"@6", "", "/bc6i0Mg", "5dc\u000eV;Bd\u001d\u000e\u000f", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fiAv\u00138IP:o= ^SnC\u0005c:\\`0DVJ9[V{?o\u0010i\u0012_/\u001c\u0019/", "1n]AX?M", "5dc\u0010b5MS,\u000e", "4tb2W\u0013HQ\u0015\u000e~h5Z\u00103e\t7", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Ny\f8\u0006)?bG\u0001G{\u0016-4M9gC\"\u001fqLF\u0011t0Mv4%SR,eaH", ":nR.g0H\\\u0004~\bf0\u000b\u00173o\t\u0015{L\u0011\u0017%VM\u0018;v", "", "=m1<T9=W\"\u0001Xh5}\r1u\r$\u000bD\u000b ", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKMDl8 ^L@\"\u0011u\u0016Ws1CYM0eTPG\u001d\u0013^\u0010^8\t\u0014]K-D", "5dc\u001ca\tHO&}~g.Z\u00138f\u0004*\fM|&\u001bQx", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9u=\u001f\u0019j+\u001deL6``0DVJ9[V{?q\u001cc\u000fR-\u001d\u0012UP(xM\r", "Adc\u001ca\tHO&}~g.Z\u00138f\u0004*\fM|&\u001bQx", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AEt5\"\u00172E\u0018om>8\u007f$QH[+`[t\u001b\u001e\u001b[\u0012P;\u001a\u0001hE.w\u001az\u0010", "AdRBe0Mg", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u000f", "AgP?X+", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\b)4w\u0012;LGDm}\f\u0018dn9\u0006N9Nw'TLW*\\(", "BdgAI0>e|\b~m\u0016\u0006\u00069a\r'\u007fI\u0003\u0005&C~\u001eJ", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", "1`[9:,M7\"\u0003\n>5\n\u00136l\b(\u0005O", "", "1`[9:,M@\u0019\u0001~l;|\u0016\u001aa\u000f+", "7mXA85K] \u0006\u0003^5\fu/s\u000b2\u0005N\u0001", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gxqeHfl9X}.OLW;IR\u0001H\u001e\u001bh\u000e$", "5dc\u0019b*:b\u001d\t\u0004", "5dc\u001dh)EW\u0017b\u0006", "7mXAB5\u001b]\u0015\fyb5~", "=m00g0OW(\u0013g^:\r\u0010>", "@d`BX:M1#}z", "@dbB_;\u001c]\u0018~", "2`c.", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "=m1.V2)`\u0019\r\t^+", "=m2?X(MS", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=mA2d<>a(izk4\u0001\u0017=i\n1\n-\u0001%'N~", ">da:\\:LW#\b\t", "", "5qP;g\u0019>a)\u0006\nl", "", "uHJ\u0019](OOb\u0006vg.Fv>r\u00041}\u0016vzZ8", ">q^0X:L3\"\u0010~k6\u0006\u0011/n\u000f6", "3me6e6G[\u0019\b\nl", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "@d`BX:M/$\ne^9\u0005\r=s\u00042\u0005N", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class ProcessOnboardingActivity extends TicnowActivity {
    private HashMap _$_findViewCache;
    private FusedLocationProviderClient fusedLocationClient;
    private IDNowOnboardingConfiguration onBoardingConfiguration;
    private IDSecurityApi security;
    private SharedPreference shared;
    private TextView textViewInitOnboardingStatus;
    private final String TAG = "ProcessOnboardingActivity";
    private final int locationPermissionRequestCode = 1001;
    private final ProcessOnboardingActivity context = this;
    private final ProcessOnboardingActivity activity = this;

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity$callGetInitEnrollment$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b6B\u0015\"4ߚ\u0006ј~jg/tqV.j[H\u0011\u0014}J#\n% Dka(\u0001:\u0011mP\u0010i\u0005I\t\u000fq\u0013L\u001eѱn,OZ"}, d2 = {"\n`]<a@F])\rS", "", "7mXA85K] \u0006\u0003^5\fu/s\u000b2\u0005N\u0001", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gxqeHfl9X}.OLW;IR\u0001H\u001e\u001bh\u000e$", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "1nS2", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001k -MQ\u0005O\u0013}\u001euk@\u000ek,W\u0006\u0014GZY6e`r\u001b\u001e\u0011Z\u001c$", "=m8;\\;\u001e\\&\t\u0002e4|\u0012>R\u007f4\f@\u000f&\u0004G}\u0019F\u007f35"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass2 implements InitEnrollmentRequestCallback {

        /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity$callGetInitEnrollment$2$2, reason: invalid class name and collision with other inner class name */
        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
        static final class RunnableC02802 implements Runnable {
            RunnableC02802() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IDDialog.showDialog(ProcessOnboardingActivity.this.getSupportFragmentManager(), ProcessOnboardingActivity.this.getActivity(), ProcessOnboardingActivity.this.getContext(), "Error en el sistema", "Intente nuevamente.", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.callGetInitEnrollment.2.2.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Callback.onClick_enter(view);
                        try {
                            ProcessOnboardingActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.callGetInitEnrollment.2.2.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ProcessOnboardingActivity.access$getTextViewInitOnboardingStatus$p(ProcessOnboardingActivity.this).setText("general error");
                                }
                            });
                            ProcessOnboardingActivity.this.setResult(170054, new Intent());
                            ProcessOnboardingActivity.this.finish();
                        } finally {
                            Callback.onClick_exit();
                        }
                    }
                });
            }
        }

        AnonymousClass2() {
        }

        @Override // com.ticnow.sdk.idnowonboarding.services.enrollment.enrolmentcallbacks.InitEnrollmentRequestCallback
        public final void onInitEnrollmentRequestResponse(InitEnrollmentResponse initEnrollmentResponse, IDEnrollmentResponseCodes iDEnrollmentResponseCodes) {
            if (iDEnrollmentResponseCodes == IDEnrollmentResponseCodes.COD_DEFINITION_WORKFLOW_NOT_VALID) {
                ProcessOnboardingActivity.this.getActivity().runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.callGetInitEnrollment.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProcessOnboardingActivity.access$getTextViewInitOnboardingStatus$p(ProcessOnboardingActivity.this).setText("the user has max attempts");
                        ProcessOnboardingActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_MAX_ATTEMPS_DAY, new Intent());
                        ProcessOnboardingActivity.this.finish();
                    }
                });
            } else {
                if (iDEnrollmentResponseCodes != IDEnrollmentResponseCodes.COD_OK) {
                    ProcessOnboardingActivity.this.getActivity().runOnUiThread(new RunnableC02802());
                    return;
                }
                ProcessOnboardingActivity processOnboardingActivity = ProcessOnboardingActivity.this;
                Intrinsics.checkExpressionValueIsNotNull(initEnrollmentResponse, "initEnrollmentResponse");
                processOnboardingActivity.callGetRegisterPath(initEnrollmentResponse);
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity$callGetRegisterPath$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b6B\u0015\"4ߚ\u0006ј~jg/tqV.j[H\u0011\u0014}J#\n% Dka(\u0001:\u0011mP\u0010i\u0005I\t\u000fq\u0013L\u001eѱn,OZ"}, d2 = {"\n`]<a@F])\rS", "", "@db=b5LS", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4g\u0002hc=\u0015r,[a#VO;,j]|F\"\u00120", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "@b^1X", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001k -MQ\u0005O\u0013}\u001euk@\u000ek,W\u0006\u0014GZY6e`r\u001b\u001e\u0011Z\u001c$", "=m62g\u0019>U\u001d\r\n^9g\u0005>hl(\bP\u0001%&4o\u001cG\u0001.CY"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class C12582 implements GetRegisterPathRequestCallBack {
        final /* synthetic */ InitEnrollmentResponse $initEnrollmentResponse;

        C12582(InitEnrollmentResponse initEnrollmentResponse) {
            this.$initEnrollmentResponse = initEnrollmentResponse;
        }

        @Override // com.ticnow.sdk.idnowonboarding.services.enrollment.enrolmentcallbacks.GetRegisterPathRequestCallBack
        public final void onGetRegisterPathRequestResponse(final RegisterPathResponse registerPathResponse, IDEnrollmentResponseCodes iDEnrollmentResponseCodes) {
            if (iDEnrollmentResponseCodes == IDEnrollmentResponseCodes.COD_OK) {
                ProcessOnboardingActivity.this.getActivity().runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.callGetRegisterPath.2.3
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        EnrollPath definitionWorkflow = registerPathResponse.getEnrollDefinition().getDefinitionWorkflow();
                        IDNowOnboardingConfiguration onBoardingConfiguration = ProcessOnboardingActivity.this.getOnBoardingConfiguration();
                        IDNowOnboardingData iDNowOnboardingData = new IDNowOnboardingData();
                        iDNowOnboardingData.configuration = onBoardingConfiguration;
                        iDNowOnboardingData.enrollDefinition = definitionWorkflow;
                        iDNowOnboardingData.uuidTransaction = C12582.this.$initEnrollmentResponse.getUuidTransaction();
                        Intent intent = new Intent(ProcessOnboardingActivity.this.getContext(), (Class<?>) StepHandlerActivity.class);
                        intent.putExtra("onboardingdata", iDNowOnboardingData);
                        ProcessOnboardingActivity processOnboardingActivity = ProcessOnboardingActivity.this;
                        CX.ud();
                        processOnboardingActivity.startActivityForResult(intent, 998);
                    }
                });
            } else {
                ProcessOnboardingActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.callGetRegisterPath.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProcessOnboardingActivity.access$getTextViewInitOnboardingStatus$p(ProcessOnboardingActivity.this).setText("general error");
                    }
                });
                ProcessOnboardingActivity.this.getActivity().runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.callGetRegisterPath.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        IDDialog.showDialog(ProcessOnboardingActivity.this.getSupportFragmentManager(), ProcessOnboardingActivity.this.getActivity(), ProcessOnboardingActivity.this.getContext(), "Error en el sistema", "Intente nuevamente.", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.callGetRegisterPath.2.2.1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Callback.onClick_enter(view);
                                try {
                                    ProcessOnboardingActivity.this.setResult(170054, new Intent());
                                    ProcessOnboardingActivity.this.finish();
                                } finally {
                                    Callback.onClick_exit();
                                }
                            }
                        });
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity$initOnBoarding$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u0003\rI\u00066\f<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(sI>c\u001e"}, d2 = {"\n`]<a@F])\rS", "", "7s", "", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m56a0LV\u0019}", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q\u0004q"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class C12631 implements ConnectionAliveCallback {

        /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity$initOnBoarding$1$2, reason: invalid class name */
        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
        static final class AnonymousClass2 implements Runnable {
            AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IDDialog.showDialog(ProcessOnboardingActivity.this.getSupportFragmentManager(), ProcessOnboardingActivity.this.getActivity(), ProcessOnboardingActivity.this.getContext(), "", "Revise su conexión a internet.\nPor favor intente su proceso más tarde.", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.initOnBoarding.1.2.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Callback.onClick_enter(view);
                        try {
                            ProcessOnboardingActivity.this.getActivity().runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.initOnBoarding.1.2.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ProcessOnboardingActivity.this.setResult(3036, new Intent());
                                    ProcessOnboardingActivity.this.finish();
                                }
                            });
                        } finally {
                            Callback.onClick_exit();
                        }
                    }
                });
            }
        }

        C12631() {
        }

        @Override // com.ticnow.sdk.idnowonboarding.connectivity.ConnectionAliveCallback
        public final void onFinished(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                new Timer("SettingUp", false).schedule(new TimerTask() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity$initOnBoarding$1$$special$$inlined$schedule$1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        ProcessOnboardingActivity.this.getOnBoardingConfiguration().commonParams.setLocation("0.00000,0.00000");
                        ProcessOnboardingActivity.this.getPublicIp();
                    }
                }, 500L);
            } else {
                ProcessOnboardingActivity.this.getActivity().runOnUiThread(new AnonymousClass2());
            }
        }
    }

    public ProcessOnboardingActivity() {
        System.loadLibrary("Elliptic-Now");
        this.onBoardingConfiguration = new IDNowOnboardingConfiguration();
    }

    public static final /* synthetic */ TextView access$getTextViewInitOnboardingStatus$p(ProcessOnboardingActivity processOnboardingActivity) {
        TextView textView = processOnboardingActivity.textViewInitOnboardingStatus;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewInitOnboardingStatus");
        }
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callGetInitEnrollment() {
        String str = this.TAG;
        runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.callGetInitEnrollment.1
            @Override // java.lang.Runnable
            public final void run() {
                ProcessOnboardingActivity.access$getTextViewInitOnboardingStatus$p(ProcessOnboardingActivity.this).setText("calling getInitEnrollment");
            }
        });
        CommonUserDataRequest commonUserDataRequest = this.onBoardingConfiguration.commonUserData;
        String str2 = this.onBoardingConfiguration.userId;
        Intrinsics.checkExpressionValueIsNotNull(str2, "onBoardingConfiguration.userId");
        commonUserDataRequest.setUserId(str2);
        IDSecurityApi iDSecurityApi = this.security;
        if (iDSecurityApi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("security");
        }
        ProcessOnboardingActivity processOnboardingActivity = this.context;
        ProcessOnboardingActivity processOnboardingActivity2 = this.activity;
        CommonParamsRequest commonParamsRequest = this.onBoardingConfiguration.commonParams;
        Intrinsics.checkExpressionValueIsNotNull(commonParamsRequest, "onBoardingConfiguration.commonParams");
        CommonUserDataRequest commonUserDataRequest2 = this.onBoardingConfiguration.commonUserData;
        Intrinsics.checkExpressionValueIsNotNull(commonUserDataRequest2, "onBoardingConfiguration.commonUserData");
        UserDataRequest userDataRequest = this.onBoardingConfiguration.userData;
        String str3 = this.onBoardingConfiguration.enrollType;
        Intrinsics.checkExpressionValueIsNotNull(str3, "onBoardingConfiguration.enrollType");
        IDEnrollmentServices.InitEnrollment(this.context, this.activity, new AnonymousClass2(), iDSecurityApi.generateInitEnrollmentRequest(processOnboardingActivity, processOnboardingActivity2, commonParamsRequest, commonUserDataRequest2, userDataRequest, null, "nWO4YXu48XYGB0WSlWg287349823907Xu48XYGB0WSlWgdJ8hbjrQCuaLw", str3, this.onBoardingConfiguration.additionalHeaders));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callGetRegisterPath(InitEnrollmentResponse initEnrollmentResponse) {
        String str = this.TAG;
        runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.callGetRegisterPath.1
            @Override // java.lang.Runnable
            public final void run() {
                ProcessOnboardingActivity.access$getTextViewInitOnboardingStatus$p(ProcessOnboardingActivity.this).setText("call getRegisterPath");
            }
        });
        processEnvironments(initEnrollmentResponse.getEnvironmentsParams());
        IDSecurityApi iDSecurityApi = this.security;
        if (iDSecurityApi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("security");
        }
        ProcessOnboardingActivity processOnboardingActivity = this.context;
        ProcessOnboardingActivity processOnboardingActivity2 = this.activity;
        CommonParamsRequest commonParamsRequest = this.onBoardingConfiguration.commonParams;
        Intrinsics.checkExpressionValueIsNotNull(commonParamsRequest, "onBoardingConfiguration.commonParams");
        CommonUserDataRequest commonUserDataRequest = this.onBoardingConfiguration.commonUserData;
        Intrinsics.checkExpressionValueIsNotNull(commonUserDataRequest, "onBoardingConfiguration.commonUserData");
        String str2 = this.onBoardingConfiguration.enrollType;
        Intrinsics.checkExpressionValueIsNotNull(str2, "onBoardingConfiguration.enrollType");
        IDEnrollmentServices.getRegisterPath(this.context, this.activity, new C12582(initEnrollmentResponse), iDSecurityApi.generateGetRegisterPathRequest(processOnboardingActivity, processOnboardingActivity2, commonParamsRequest, commonUserDataRequest, str2, "", this.onBoardingConfiguration.additionalHeaders));
    }

    private final void getLocation() {
        try {
            String str = this.TAG;
            runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.getLocation.1
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessOnboardingActivity.access$getTextViewInitOnboardingStatus$p(ProcessOnboardingActivity.this).setText("get last location");
                }
            });
            this.onBoardingConfiguration.commonParams.setLocation("0.00000,0.00000");
            if (ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") != 0 && ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                ActivityCompat.requestPermissions(this, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, this.locationPermissionRequestCode);
                return;
            }
            FusedLocationProviderClient fusedLocationProviderClient = this.fusedLocationClient;
            if (fusedLocationProviderClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fusedLocationClient");
            }
            fusedLocationProviderClient.getLastLocation().addOnSuccessListener(new OnSuccessListener<Location>() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.getLocation.2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Location location) {
                    if (location == null) {
                        ProcessOnboardingActivity.this.getPublicIp();
                    } else {
                        ProcessOnboardingActivity.this.getOnBoardingConfiguration().commonParams.setLocation(String.valueOf(location.getLatitude()) + "," + String.valueOf(location.getLongitude()));
                        ProcessOnboardingActivity.this.getPublicIp();
                    }
                }
            });
            FusedLocationProviderClient fusedLocationProviderClient2 = this.fusedLocationClient;
            if (fusedLocationProviderClient2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fusedLocationClient");
            }
            fusedLocationProviderClient2.getLastLocation().addOnFailureListener(new OnFailureListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.getLocation.3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception it) {
                    Intrinsics.checkParameterIsNotNull(it, "it");
                    ProcessOnboardingActivity.this.getPublicIp();
                }
            });
            FusedLocationProviderClient fusedLocationProviderClient3 = this.fusedLocationClient;
            if (fusedLocationProviderClient3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fusedLocationClient");
            }
            fusedLocationProviderClient3.getLastLocation().addOnCanceledListener(new OnCanceledListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.getLocation.4
                @Override // com.google.android.gms.tasks.OnCanceledListener
                public final void onCanceled() {
                    ProcessOnboardingActivity.this.getPublicIp();
                }
            });
        } catch (Exception unused) {
            getPublicIp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getPublicIp() {
        try {
            String str = this.TAG;
            runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.getPublicIp.1
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessOnboardingActivity.access$getTextViewInitOnboardingStatus$p(ProcessOnboardingActivity.this).setText("get public IP");
                }
            });
            this.onBoardingConfiguration.commonParams.setForwaredIp("0.0.0.0");
            OkHttpClient okHttpClientBuild = new OkHttpClient.Builder().connectTimeout(5L, TimeUnit.SECONDS).writeTimeout(5L, TimeUnit.SECONDS).readTimeout(5L, TimeUnit.SECONDS).callTimeout(10L, TimeUnit.SECONDS).build();
            Request requestBuild = new Request.Builder().url("https://api.ipify.org/").build();
            OkCallback.enqueue(okHttpClientBuild.newCall(requestBuild), new okhttp3.Callback() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity$getPublicIp$callback$1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e2) {
                    OkCallback.onFailure_enter(call, e2);
                    try {
                        Intrinsics.checkParameterIsNotNull(call, "call");
                        Intrinsics.checkParameterIsNotNull(e2, "e");
                        String unused = this.this$0.TAG;
                        IOException iOException = e2;
                        this.this$0.callGetInitEnrollment();
                    } finally {
                        OkCallback.onFailure_exit();
                    }
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    OkCallback.onResponse_enter(call, response);
                    try {
                        Intrinsics.checkParameterIsNotNull(call, "call");
                        Intrinsics.checkParameterIsNotNull(response, "response");
                        try {
                            ResponseBody responseBodyBody = response.body();
                            String strValueOf = String.valueOf(responseBodyBody != null ? responseBodyBody.string() : null);
                            String unused = this.this$0.TAG;
                            String str2 = "Public ip: " + strValueOf;
                            if (Patterns.IP_ADDRESS.matcher(strValueOf).matches()) {
                                this.this$0.getOnBoardingConfiguration().commonParams.setForwaredIp(strValueOf);
                                this.this$0.callGetInitEnrollment();
                            }
                        } catch (Exception e2) {
                            String unused2 = this.this$0.TAG;
                            Exception exc = e2;
                            this.this$0.callGetInitEnrollment();
                        }
                    } finally {
                        OkCallback.onResponse_exit();
                    }
                }
            });
        } catch (Exception e2) {
            String str2 = this.TAG;
            runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.getPublicIp.2
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessOnboardingActivity.access$getTextViewInitOnboardingStatus$p(ProcessOnboardingActivity.this).setText("get public ip error");
                }
            });
            setResult(170054, new Intent());
            finish();
        }
    }

    private final void initOnBoarding() {
        String str = this.TAG;
        try {
            IDDialog.showPreConnectionPopup(2, getSupportFragmentManager(), this.activity, this.context, new C12631());
        } catch (Exception unused) {
            this.activity.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.ProcessOnboardingActivity.initOnBoarding.2
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessOnboardingActivity.this.setResult(3036, new Intent());
                    ProcessOnboardingActivity.this.finish();
                }
            });
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void processEnvironments(ArrayList<KeyValue> arrayList) {
        for (KeyValue keyValue : arrayList) {
            String key = keyValue.getKey();
            switch (key.hashCode()) {
                case -1947858845:
                    if (key.equals("REGULA_SCENARIO_FRONT")) {
                        this.onBoardingConfiguration.regulaScenarioFront = keyValue.getValue();
                        String str = "Regula scenario front: " + keyValue.getValue();
                    }
                    break;
                case -1376403787:
                    if (key.equals("ZOOM_LICENSE_KEY")) {
                        this.onBoardingConfiguration.zoomLicenceText = keyValue.getValue();
                    }
                    break;
                case -1134461305:
                    if (key.equals("REGULA_ORIENTATION")) {
                        this.onBoardingConfiguration.regulaOrientation = keyValue.getValue();
                    }
                    break;
                case -334733832:
                    if (key.equals("REGULA_LICENSE_KEY")) {
                        this.onBoardingConfiguration.regulaLicenseText = keyValue.getValue();
                    }
                    break;
                case -62970035:
                    if (key.equals("REGULA_SCENARIO_BACK")) {
                        this.onBoardingConfiguration.regulaScenarioBack = keyValue.getValue();
                        String str2 = "Regula scenario back: " + keyValue.getValue();
                    }
                    break;
                case 80888661:
                    if (key.equals("ZOOM_PUBLIC_KEY")) {
                        this.onBoardingConfiguration.zoomPublicKey = keyValue.getValue();
                    }
                    break;
                case 1099814509:
                    if (key.equals("ZOOM_TOKEN")) {
                        this.onBoardingConfiguration.zoomLicenceKey = keyValue.getValue();
                    }
                    break;
                case 1668182755:
                    if (key.equals("ZOOM_URL")) {
                        this.onBoardingConfiguration.zoomServerBaseURL = keyValue.getValue();
                    }
                    break;
            }
        }
    }

    private final void requestAppPermissions() {
        String str = this.TAG;
        new Timer("SettingUp", false).schedule(new ProcessOnboardingActivity$requestAppPermissions$$inlined$schedule$1(this), 500L);
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
            short sXd = (short) (C1607wl.Xd() ^ ((252660299 ^ 1205202319) ^ 1222311153));
            short sXd2 = (short) (C1607wl.Xd() ^ (2041779515 ^ 2041787245));
            int[] iArr = new int["o\\\"_C".length()];
            QB qb = new QB("o\\\"_C");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strVd = hg.Vd("\u001f\f", (short) (C1499aX.Xd() ^ (774850084 ^ (-774848012))), (short) (C1499aX.Xd() ^ ((1676783626 ^ 617663337) ^ (-1193353617))));
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("A.s1\u0015", (short) (ZN.Xd() ^ ((391080759 ^ 252590452) ^ 406922519)));
                String strYd = C1561oA.yd("\\H", (short) (C1499aX.Xd() ^ (1738366541 ^ (-1738366024))));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("XG\u000fN4", (short) (C1607wl.Xd() ^ (1396149475 ^ 1396153931)));
                    String strQd = Xg.qd("\u001f\u0015", (short) (OY.Xd() ^ (800096217 ^ 800066055)), (short) (OY.Xd() ^ (1932544123 ^ 1932529271)));
                    try {
                        Class<?> cls3 = Class.forName(strYd2);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        short sXd3 = (short) (C1607wl.Xd() ^ (1118604997 ^ 1118602652));
                        short sXd4 = (short) (C1607wl.Xd() ^ (9152260 ^ 9146443));
                        int[] iArr2 = new int[".v{!H".length()];
                        QB qb2 = new QB(".v{!H");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                            i3++;
                        }
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(new String(iArr2, 0, i3)).getDeclaredMethod(ZO.xd("?\u001b", (short) (C1580rY.Xd() ^ (785397329 ^ (-785407782))), (short) (C1580rY.Xd() ^ (190446706 ^ (-190421455)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("@j3p%\u001e", (short) (OY.Xd() ^ (1357775761 ^ 1357802613)), (short) (OY.Xd() ^ (857308028 ^ 857302135)))};
                                Method method = Class.forName(Ig.wd("R\nod6\u000b\u0018\u007f}lgQWh|Y\"f\u000b'a.F", (short) (C1499aX.Xd() ^ (1635082300 ^ (-1635064092))))).getMethod(C1561oA.Qd("pm{Y~wwgnSdpse^_", (short) (C1580rY.Xd() ^ ((283310301 ^ 261815249) ^ (-527982458)))), Class.forName(EO.Od("f6[cy]<+[Cl&\u000f}\u0015j", (short) (C1607wl.Xd() ^ (788533186 ^ 788541314)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("\\K\u0013R8", (short) (Od.Xd() ^ (1719764539 ^ (-1719786888))), (short) (Od.Xd() ^ (372923510 ^ (-372904831))));
                                    String strOd = C1561oA.od("rf", (short) (ZN.Xd() ^ ((434522798 ^ 706302858) ^ 872364074)));
                                    try {
                                        Class<?> cls4 = Class.forName(strZd);
                                        Field field4 = 0 != 0 ? cls4.getField(strOd) : cls4.getDeclaredField(strOd);
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
                    String strKd = C1561oA.Kd("eT\u001c[A", (short) (Od.Xd() ^ ((565848619 ^ 1446986759) ^ (-2005215160))));
                    String strZd2 = Wg.Zd("KC", (short) (ZN.Xd() ^ ((655309219 ^ 778202970) ^ 158144301)), (short) (ZN.Xd() ^ (1065964076 ^ 1065970260)));
                    try {
                        Class<?> cls5 = Class.forName(strKd);
                        Field field5 = 0 != 0 ? cls5.getField(strZd2) : cls5.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("\fzB\u0002g", (short) (C1580rY.Xd() ^ ((1071277146 ^ 879782820) ^ (-195711970))));
                        short sXd5 = (short) (Od.Xd() ^ (842625234 ^ (-842603518)));
                        int[] iArr3 = new int["i_".length()];
                        QB qb3 = new QB("i_");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK((sXd5 ^ i4) + xuXd3.CK(iKK3));
                            i4++;
                        }
                        String str2 = new String(iArr3, 0, i4);
                        try {
                            Class<?> cls6 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls6.getField(str2) : cls6.getDeclaredField(str2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i5 = (850791308 ^ 341064129) ^ 652358150;
                        if (x2 > i5 && x2 < displayMetrics.widthPixels - i5 && y2 > i5 && y2 < displayMetrics.heightPixels - i5) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final ProcessOnboardingActivity getActivity() {
        return this.activity;
    }

    public final ProcessOnboardingActivity getContext() {
        return this.context;
    }

    public final IDNowOnboardingConfiguration getOnBoardingConfiguration() {
        return this.onBoardingConfiguration;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Intent intent2 = new Intent();
        try {
            if (i3 == 0) {
                setResult(IDStepResponseCodes.STEP_RESULT_USER_CANCELLED_ONBOARDING, intent2);
                finish();
            } else {
                if (i3 == 3000) {
                    if (intent == null) {
                        try {
                            Intrinsics.throwNpe();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                    }
                    Serializable serializableExtra = intent.getSerializableExtra("enrollmentResult");
                    if (serializableExtra == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.ticnow.sdk.idnowonboarding.enrollresult.IDNowEnrollmentResult");
                    }
                    intent2.putExtra("enrollmentResult", (IDNowEnrollmentResult) serializableExtra);
                    setResult(3000, intent2);
                    finish();
                    return;
                }
                if (i3 == 170007) {
                    setResult(IDStepResponseCodes.STEP_RESULT_ABORT_FLOW, intent2);
                    finish();
                } else if (i3 == 170054) {
                    setResult(170054, intent2);
                    finish();
                }
            }
            if (i2 == 997) {
                if (i3 == 3031) {
                    setResult(IDStepResponseCodes.STEP_RESULT_PERMISSION_NOT_ACCEPTED, intent2);
                    finish();
                    return;
                } else if (i3 == 3032) {
                    initOnBoarding();
                    return;
                } else {
                    if (i3 != 3036) {
                        return;
                    }
                    setResult(3036, intent2);
                    finish();
                    return;
                }
            }
            if (i2 != 998) {
                setResult(170008, intent2);
                finish();
                return;
            }
            if (i3 == 3000) {
                setResult(3000, intent2);
                if (intent == null) {
                    Intrinsics.throwNpe();
                }
                Serializable serializableExtra2 = intent.getSerializableExtra("enrollmentResult");
                if (serializableExtra2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ticnow.sdk.idnowonboarding.enrollresult.IDNowEnrollmentResult");
                }
                intent2.putExtra("enrollmentResult", (IDNowEnrollmentResult) serializableExtra2);
                finish();
                return;
            }
            if (i3 == 3020) {
                setResult(IDStepResponseCodes.STEP_RESULT_MAX_ATTEMPS_DAY, intent2);
                finish();
                return;
            }
            if (i3 == 3030) {
                setResult(IDStepResponseCodes.STEP_RESULT_USER_CANCELLED_ONBOARDING, intent2);
                finish();
            } else if (i3 == 3036) {
                setResult(3036, intent2);
                finish();
            } else if (i3 != 3050) {
                setResult(170008, intent2);
                finish();
            } else {
                setResult(IDStepResponseCodes.STEP_RESULT_BIOMETRY_NOT_MET, intent2);
                finish();
            }
        } catch (Exception unused) {
            setResult(170008, intent2);
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        AppCompatDelegate.setDefaultNightMode(1);
        super.onCreate(bundle);
        setContentView(R.layout.activity_process_onboarding);
        animate();
        getWindow().setFlags(8192, 8192);
        try {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar == null) {
                Intrinsics.throwNpe();
            }
            supportActionBar.hide();
        } catch (NullPointerException unused) {
        }
        this.shared = new SharedPreference(this);
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient((Activity) this);
        Intrinsics.checkExpressionValueIsNotNull(fusedLocationProviderClient, "LocationServices.getFuse…ationProviderClient(this)");
        this.fusedLocationClient = fusedLocationProviderClient;
        Serializable serializableExtra = getIntent().getSerializableExtra("configuration");
        if (serializableExtra == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration");
        }
        this.onBoardingConfiguration = (IDNowOnboardingConfiguration) serializableExtra;
        this.security = new IDSecurityApiImpl();
        View viewFindViewById = findViewById(R.id.textViewInitOnboardingStatus);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById, "findViewById(R.id.textViewInitOnboardingStatus)");
        TextView textView = (TextView) viewFindViewById;
        this.textViewInitOnboardingStatus = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textViewInitOnboardingStatus");
        }
        textView.setText("init onboarding");
        initOnBoarding();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] permissions, int[] grantResults) {
        Intrinsics.checkParameterIsNotNull(permissions, "permissions");
        Intrinsics.checkParameterIsNotNull(grantResults, "grantResults");
        if (i2 == this.locationPermissionRequestCode) {
            if (!(grantResults.length == 0) && grantResults[0] == 0) {
                initOnBoarding();
            } else {
                setResult(IDStepResponseCodes.STEP_RESULT_PERMISSION_NOT_ACCEPTED, new Intent());
                finish();
            }
        }
    }

    public final void setOnBoardingConfiguration(IDNowOnboardingConfiguration iDNowOnboardingConfiguration) {
        Intrinsics.checkParameterIsNotNull(iDNowOnboardingConfiguration, "<set-?>");
        this.onBoardingConfiguration = iDNowOnboardingConfiguration;
    }
}
