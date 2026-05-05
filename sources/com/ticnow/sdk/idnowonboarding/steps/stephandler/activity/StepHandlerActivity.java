package com.ticnow.sdk.idnowonboarding.steps.stephandler.activity;

import android.app.ActionBar;
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
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.dynatrace.android.callback.Callback;
import com.ticnow.sdk.idnowonboarding.R;
import com.ticnow.sdk.idnowonboarding.connectivity.ConnectionAliveCallback;
import com.ticnow.sdk.idnowonboarding.dialog.Dialog;
import com.ticnow.sdk.idnowonboarding.dialog.IDDialog;
import com.ticnow.sdk.idnowonboarding.enrollresult.IDNowEnrollmentResult;
import com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity;
import com.ticnow.sdk.idnowonboarding.model.api.IDReintentServicesImpl;
import com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration;
import com.ticnow.sdk.idnowonboarding.model.data.IDNowOnboardingData;
import com.ticnow.sdk.idnowonboarding.model.step.IDNowStep;
import com.ticnow.sdk.idnowonboarding.model.step.IDStepKind;
import com.ticnow.sdk.idnowonboarding.model.step.IDStepReview;
import com.ticnow.sdk.idnowonboarding.services.reintents.IDReintentServices;
import com.ticnow.sdk.idnowonboarding.services.reintents.reintentsCallbacks.GetEnrollmentReintenNewsCallback;
import com.ticnow.sdk.idnowonboarding.steps.helper.IDStepCellProcessor;
import com.ticnow.sdk.idnowonboarding.steps.helper.IDStepProcessor;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import com.ticnow.sdk.idnowonboarding.steps.stephandler.views.ProcessStepView;
import com.ticnow.sdk.idnowonboarding.steps.steplauncher.controller.StepLauncherController;
import com.ticnow.sdk.idnowonboarding.viewmodel.StepHandlerViewModel;
import com.ticnow.sdk.idnowsecurity.http.codes.IDEnrollmentResponseCodes;
import com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import com.ticnow.sdk.idnowsecurity.http.request.CommonParamsRequest;
import com.ticnow.sdk.idnowsecurity.http.request.CommonUserDataRequest;
import com.ticnow.sdk.idnowsecurity.http.response.IdNowCommonResponse;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.CX;
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
import yg.Xg;
import yg.Xu;
import yg.ZN;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я^\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјnjO0LeN.ZS@\u000fsڔ<$q$yّCU(}*\tURog\u0005Jb\u000bI\u0010\u000e\u0016\u000fj4I[xe\u0012\u001d8JoE3UoS9ht<\u0006(288\u0002\u0005\u0007\u001c@Ϻ@v)B\f\u000fܘ4@~:\u001b\u0013[\u00112\u00124Kf\u0002fbu\\NH\u001bj\u00010k\twQf'\u000e=CNULb7%v\u0010+q@\u007fK#6k\u00035_\fC\u0011Q\n=3jW+9\\\fWdlF\u0015]1]\"urTiKR)\u00125Agcy]T(@\u0011\n$T\u0004<\u0013WL<?2f6&cx\u0001fXP0r\t\u0001C\u0002D0=\u007fa8i\u001ftky;Gig\u007f\u0013)6#/\nQab+x\u00171S&owc\tCVm\"YkzJ\u0005+\u00128$HG.<,\u0017<8=9q8QC2\u0014\u0011Ju\u001a\u001d`\u0017`0W\u0011F0\u0013.7X\u0016R[\rj\u0013\u0011hT\u00079WNl`\u0015~ \u0013N^N˖cٚ\u0014NWŖ:v[`\"%]j\u000eխ\u001b«\u0012WAӔ\u0004A_h(a\u0001|j̶hИ\tXn̻$\u0018hc@\"`NAݛ$ԞHN\u0014Ǝ\u0003K\u007f$L,_\"3ìtҴ\"BIґYkhr(~\u0003>zѳ\u0016˨x\t\tˆʽt\u0016"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$w[R;v7\u001a\u001egh9\u0014-(L\u0006+XP]@&@\u0002=\u001ftV\u0017M2\r\u00125?3rU;.\u001c\u0002", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0002)Fm#/IA;y}\r\u0019fjC\u0019?*]z8K[b\u0002", "u(E", "\"@6", "", "0tcAb5\u001c]\"\u000e~g<|", "\u001a`]1e6BRb\u0011~].|\u0018xB\u00107\u000bJ\nl", "7lP4X\u001dBS+[v\\2", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "7lP4X\u001dBS+\\\u0002h:|", ":`h<h;,Q&\t\u0002e\u001d\u0001\tAC\n1\u000b<\u0005 \u0017T", "\u001a`]1e6BRb\u0011~].|\u0018xL\u00041{<\u000e}\u0013[y\u001eKL", ";UX2j\u0014HR\u0019\u0006", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u000f$7\u007f\u001e8LCB5\"-\u0015sD5\u0010b3N\u0004\u0018KL`\u0014fQrDi", "0tX9W\u001aMS$e~l;", "", "1gT0^\fG`#\u0006\u0002f,\u0006\u0018\u000bt\u000f(\u0004K\u0010%", "1gT0^\u0010Gb\u0019\f\u0004^;Z\u00138n\u007f&\u000bD\u000b ", "1gT0^\u0014:ft\u000e\n^4\b\u0018=D{<", "6`]1_,'S,\u000ehm,\b", "AsT=>0GR", "2dU6a0MW#\b", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005K=+\u001foh$\u0003r/$", "7c=<j\nNa(\t\u0003bA|", ":`d;V/\u001cO\"|ze\u000b\u0001\u00056o\u0002", ":`d;V/,b\u0019\n", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dw[R;v}\u0002sVp9\u0012I0Wu|", "=m00g0OW(\u0013g^:\r\u0010>", "@d`BX:M1#}z", "", "@dbB_;\u001c]\u0018~", "2`c.", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "=m1.V2)`\u0019\r\t^+", "=m2?X(MS", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "Ah\\B_(MS\u0007\u000fx\\,\u000b\u0017\u001dt\u007f3", "AsP?g\rE]+", "CoS.g,,b\u0019\nab:\f", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class StepHandlerActivity extends TicnowActivity {
    private final String TAG = "StepHandlerActivity";
    private HashMap _$_findViewCache;
    private Button buttonContinue;
    private ImageView imageViewBack;
    private ImageView imageViewClose;
    private LinearLayout layoutScrollViewContainer;
    private StepHandlerViewModel mViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IDEnrollmentResponseCodes.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[IDEnrollmentResponseCodes.COD_USER_BLOCKED.ordinal()] = 1;
            iArr[IDEnrollmentResponseCodes.COD_OK.ordinal()] = 2;
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$checkEnrollmentAttempts$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b6B\u0015\"4ߚ\u0006ј~jg/tqV.j[H\u0011\u0014}J#\n% Dka(\u0001:\u0011mP\u0010i\u0005I\t\u000fq\u0013L\u001eѱn,OZ"}, d2 = {"\n`]<a@F])\rS", "", "@db=b5LS", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gxgJC\u0019A6V~1P9N:g\\{K\u0014g", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "1nS2", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001k -MQ\u0005O\u0013}\u001euk@\u000ek,W\u0006\u0014GZY6e`r\u001b\u001e\u0011Z\u001c$", "=m62g\fG`#\u0006\u0002f,\u0006\u0018\u001ce\u00041\u000b@\n\u007f\u0017Y}z<\u00050?b\f "}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass1 implements GetEnrollmentReintenNewsCallback {

        /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$checkEnrollmentAttempts$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
        static final class RunnableC03051 implements Runnable {
            RunnableC03051() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                StepHandlerActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_MAX_ATTEMPS_DAY, new Intent());
                StepHandlerActivity.this.finish();
            }
        }

        AnonymousClass1() {
        }

        @Override // com.ticnow.sdk.idnowonboarding.services.reintents.reintentsCallbacks.GetEnrollmentReintenNewsCallback
        public final void onGetEnrollmentReintenNewsResponse(IdNowCommonResponse idNowCommonResponse, IDEnrollmentResponseCodes iDEnrollmentResponseCodes) {
            if (iDEnrollmentResponseCodes == IDEnrollmentResponseCodes.COD_USER_BLOCKED) {
                StepHandlerActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.checkEnrollmentAttempts.1.1
                    RunnableC03051() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        StepHandlerActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_MAX_ATTEMPS_DAY, new Intent());
                        StepHandlerActivity.this.finish();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$checkInternetConnection$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u0003\rI\u00066\f<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(sI>c\u001e"}, d2 = {"\n`]<a@F])\rS", "", "7s", "", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m56a0LV\u0019}", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q\u0004q"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class C13011 implements ConnectionAliveCallback {

        /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$checkInternetConnection$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
        static final class RunnableC03061 implements Runnable {

            /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$checkInternetConnection$1$1$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
            static final class ViewOnClickListenerC03071 implements View.OnClickListener {

                /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$checkInternetConnection$1$1$1$1 */
                @InterfaceC1492Gx
                @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
                static final class RunnableC03081 implements Runnable {
                    RunnableC03081() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        StepHandlerActivity.this.setResult(3036, new Intent());
                        StepHandlerActivity.this.finish();
                    }
                }

                ViewOnClickListenerC03071() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.onClick_enter(view);
                    try {
                        StepHandlerActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.checkInternetConnection.1.1.1.1
                            RunnableC03081() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                StepHandlerActivity.this.setResult(3036, new Intent());
                                StepHandlerActivity.this.finish();
                            }
                        });
                    } finally {
                        Callback.onClick_exit();
                    }
                }
            }

            RunnableC03061() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IDDialog.showDialog(StepHandlerActivity.this.getSupportFragmentManager(), StepHandlerActivity.this, StepHandlerActivity.this, "", "Revise su conexión a internet.\nPor favor intente su proceso más tarde.", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.checkInternetConnection.1.1.1

                    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$checkInternetConnection$1$1$1$1 */
                    @InterfaceC1492Gx
                    @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
                    static final class RunnableC03081 implements Runnable {
                        RunnableC03081() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            StepHandlerActivity.this.setResult(3036, new Intent());
                            StepHandlerActivity.this.finish();
                        }
                    }

                    ViewOnClickListenerC03071() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Callback.onClick_enter(view);
                        try {
                            StepHandlerActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.checkInternetConnection.1.1.1.1
                                RunnableC03081() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    StepHandlerActivity.this.setResult(3036, new Intent());
                                    StepHandlerActivity.this.finish();
                                }
                            });
                        } finally {
                            Callback.onClick_exit();
                        }
                    }
                });
            }
        }

        C13011() {
        }

        @Override // com.ticnow.sdk.idnowonboarding.connectivity.ConnectionAliveCallback
        public final void onFinished(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                return;
            }
            StepHandlerActivity.this.runOnUiThread(new RunnableC03061());
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$checkMaxAttemptsDay$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b6B\u0015\"4ߚ\u0006ј~jg/tqV.j[H\u0011\u0014}J#\n% Dka(\u0001:\u0011mP\u0010i\u0005I\t\u000fq\u0013L\u001eѱn,OZ"}, d2 = {"\n`]<a@F])\rS", "", "@db=b5LS", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gxgJC\u0019A6V~1P9N:g\\{K\u0014g", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "1nS2", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001k -MQ\u0005O\u0013}\u001euk@\u000ek,W\u0006\u0014GZY6e`r\u001b\u001e\u0011Z\u001c$", "=m62g\fG`#\u0006\u0002f,\u0006\u0018\u001ce\u00041\u000b@\n\u007f\u0017Y}z<\u00050?b\f "}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class C13021 implements GetEnrollmentReintenNewsCallback {
        C13021() {
        }

        @Override // com.ticnow.sdk.idnowonboarding.services.reintents.reintentsCallbacks.GetEnrollmentReintenNewsCallback
        public final void onGetEnrollmentReintenNewsResponse(IdNowCommonResponse idNowCommonResponse, IDEnrollmentResponseCodes iDEnrollmentResponseCodes) {
            Intent intent = new Intent();
            if (iDEnrollmentResponseCodes != null) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[iDEnrollmentResponseCodes.ordinal()];
                if (i2 == 1) {
                    StepHandlerActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_MAX_ATTEMPS_DAY, intent);
                    StepHandlerActivity.this.finish();
                    return;
                } else if (i2 == 2) {
                    return;
                }
            }
            StepHandlerActivity.this.setResult(170008, intent);
            StepHandlerActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$launchCancelDialog$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class ViewOnClickListenerC13031 implements View.OnClickListener {
        ViewOnClickListenerC13031() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                StepHandlerActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_USER_CANCELLED_ONBOARDING, new Intent());
                StepHandlerActivity.this.finish();
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$launchCancelDialog$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass2 implements View.OnClickListener {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$launchCancelDialog$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb|\u0005g;|\u0012>/^,wG\u000b\u0019zP~\u000eIw!3YS", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m36f4Ba'"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass3 implements DialogInterface.OnDismissListener {
        public static final AnonymousClass3 INSTANCE = ;

        AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$onActivityResult$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class ViewOnClickListenerC13041 implements View.OnClickListener {
        ViewOnClickListenerC13041() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                StepHandlerActivity.this.checkMaxAttemptsDay();
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$onActivityResult$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class ViewOnClickListenerC13052 implements View.OnClickListener {

        /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$onActivityResult$2$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
        static final class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                StepHandlerActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_BIOMETRY_NOT_MET, new Intent());
                StepHandlerActivity.this.finish();
            }
        }

        ViewOnClickListenerC13052() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                StepHandlerActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.onActivityResult.2.1
                    AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        StepHandlerActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_BIOMETRY_NOT_MET, new Intent());
                        StepHandlerActivity.this.finish();
                    }
                });
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$onActivityResult$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class ViewOnClickListenerC13063 implements View.OnClickListener {
        ViewOnClickListenerC13063() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                StepHandlerActivity.this.checkMaxAttemptsDay();
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$onActivityResult$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass4 implements View.OnClickListener {
        AnonymousClass4() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                StepHandlerActivity.this.checkMaxAttemptsDay();
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$onActivityResult$5 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass5 implements View.OnClickListener {
        AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                StepHandlerActivity.this.checkMaxAttemptsDay();
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$onActivityResult$6 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass6 implements View.OnClickListener {
        AnonymousClass6() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                StepHandlerActivity.this.checkMaxAttemptsDay();
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$onActivityResult$7 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass7 implements View.OnClickListener {
        AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                StepHandlerActivity.this.checkMaxAttemptsDay();
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$onActivityResult$8 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass8 implements View.OnClickListener {
        AnonymousClass8() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                StepHandlerActivity.this.checkMaxAttemptsDay();
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$onCreate$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class ViewOnClickListenerC13071 implements View.OnClickListener {
        ViewOnClickListenerC13071() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                String unused = StepHandlerActivity.this.TAG;
                StepHandlerActivity.access$getButtonContinue$p(StepHandlerActivity.this).setEnabled(false);
                if (!StepHandlerActivity.access$getButtonContinue$p(StepHandlerActivity.this).isEnabled()) {
                    StepHandlerActivity.this.startFlow();
                }
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$onCreate$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class ViewOnClickListenerC13082 implements View.OnClickListener {
        ViewOnClickListenerC13082() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                StepHandlerActivity.this.launchCancelDialog();
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$onCreate$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class ViewOnClickListenerC13093 implements View.OnClickListener {
        ViewOnClickListenerC13093() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                StepHandlerActivity.this.onBackPressed();
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$onCreate$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class ViewOnClickListenerC13104 implements View.OnClickListener {

        /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$onCreate$4$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
        static final class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                StepHandlerActivity.this.setResult(170008, new Intent());
                StepHandlerActivity.this.finish();
            }
        }

        ViewOnClickListenerC13104() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                StepHandlerActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.onCreate.4.1
                    AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        StepHandlerActivity.this.setResult(170008, new Intent());
                        StepHandlerActivity.this.finish();
                    }
                });
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    public static final /* synthetic */ Button access$getButtonContinue$p(StepHandlerActivity stepHandlerActivity) {
        Button button = stepHandlerActivity.buttonContinue;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
        }
        return button;
    }

    private final void buildStepList() {
        String str = this.TAG;
        View viewFindViewById = findViewById(R.id.layoutScrollViewContainer);
        if (viewFindViewById == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        StepHandlerViewModel stepHandlerViewModel = this.mViewModel;
        if (stepHandlerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        ArrayList<IDNowStep> idNowSteps = stepHandlerViewModel.getIdNowSteps();
        if (idNowSteps == null) {
            Intrinsics.throwNpe();
        }
        int i2 = 1;
        for (IDNowStep iDNowStep : idNowSteps) {
            StepHandlerActivity stepHandlerActivity = this;
            ProcessStepView processStepView = new ProcessStepView(stepHandlerActivity, null);
            if (iDNowStep.getSelected()) {
                ProcessStepView.STATUS status = ProcessStepView.STATUS.SELECTED;
                StepHandlerViewModel stepHandlerViewModel2 = this.mViewModel;
                if (stepHandlerViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                IDNowOnboardingData onboardingData = stepHandlerViewModel2.getOnboardingData();
                if (onboardingData == null) {
                    Intrinsics.throwNpe();
                }
                processStepView.setEstado(status, onboardingData.configuration.customization);
            } else if (iDNowStep.getError()) {
                ProcessStepView.STATUS status2 = ProcessStepView.STATUS.FAIL;
                StepHandlerViewModel stepHandlerViewModel3 = this.mViewModel;
                if (stepHandlerViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                IDNowOnboardingData onboardingData2 = stepHandlerViewModel3.getOnboardingData();
                if (onboardingData2 == null) {
                    Intrinsics.throwNpe();
                }
                processStepView.setEstado(status2, onboardingData2.configuration.customization);
            } else if (iDNowStep.getSuccess()) {
                ProcessStepView.STATUS status3 = ProcessStepView.STATUS.SUCCESS;
                StepHandlerViewModel stepHandlerViewModel4 = this.mViewModel;
                if (stepHandlerViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                IDNowOnboardingData onboardingData3 = stepHandlerViewModel4.getOnboardingData();
                if (onboardingData3 == null) {
                    Intrinsics.throwNpe();
                }
                processStepView.setEstado(status3, onboardingData3.configuration.customization);
            } else {
                ProcessStepView.STATUS status4 = ProcessStepView.STATUS.PENDING;
                StepHandlerViewModel stepHandlerViewModel5 = this.mViewModel;
                if (stepHandlerViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                IDNowOnboardingData onboardingData4 = stepHandlerViewModel5.getOnboardingData();
                if (onboardingData4 == null) {
                    Intrinsics.throwNpe();
                }
                processStepView.setEstado(status4, onboardingData4.configuration.customization);
            }
            processStepView.setText(iDNowStep.getStepName());
            processStepView.setIndex(i2);
            IDStepCellProcessor.Companion companion = IDStepCellProcessor.Companion;
            StepHandlerViewModel stepHandlerViewModel6 = this.mViewModel;
            if (stepHandlerViewModel6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            processStepView.setLayoutParams(new ActionBar.LayoutParams(-1, companion.calculateDpHeight(stepHandlerActivity, stepHandlerViewModel6.getStepCellHeight())));
            linearLayout.addView(processStepView);
            StepHandlerViewModel stepHandlerViewModel7 = this.mViewModel;
            if (stepHandlerViewModel7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            ArrayList<IDNowStep> idNowSteps2 = stepHandlerViewModel7.getIdNowSteps();
            if (idNowSteps2 == null) {
                Intrinsics.throwNpe();
            }
            if (i2 == idNowSteps2.size()) {
                StepHandlerViewModel stepHandlerViewModel8 = this.mViewModel;
                if (stepHandlerViewModel8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                ArrayList<IDNowStep> idNowSteps3 = stepHandlerViewModel8.getIdNowSteps();
                if (idNowSteps3 == null) {
                    Intrinsics.throwNpe();
                }
                ((ImageView) linearLayout.getChildAt(idNowSteps3.size() - 1).findViewById(R.id.imageView)).setImageResource(R.drawable.ic_pending_dav);
            }
            i2++;
        }
    }

    private final void checkEnrollmentAttempts() {
        try {
            IDReintentServicesImpl iDReintentServicesImpl = new IDReintentServicesImpl();
            StepHandlerActivity stepHandlerActivity = this;
            StepHandlerActivity stepHandlerActivity2 = this;
            StepHandlerViewModel stepHandlerViewModel = this.mViewModel;
            if (stepHandlerViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            IDNowOnboardingData onboardingData = stepHandlerViewModel.getOnboardingData();
            if (onboardingData == null) {
                Intrinsics.throwNpe();
            }
            CommonParamsRequest commonParamsRequest = onboardingData.configuration.commonParams;
            Intrinsics.checkExpressionValueIsNotNull(commonParamsRequest, "mViewModel.onboardingDat…onfiguration.commonParams");
            StepHandlerViewModel stepHandlerViewModel2 = this.mViewModel;
            if (stepHandlerViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            IDNowOnboardingData onboardingData2 = stepHandlerViewModel2.getOnboardingData();
            if (onboardingData2 == null) {
                Intrinsics.throwNpe();
            }
            CommonUserDataRequest commonUserDataRequest = onboardingData2.configuration.commonUserData;
            Intrinsics.checkExpressionValueIsNotNull(commonUserDataRequest, "mViewModel.onboardingDat…figuration.commonUserData");
            StepHandlerViewModel stepHandlerViewModel3 = this.mViewModel;
            if (stepHandlerViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            IDNowOnboardingData onboardingData3 = stepHandlerViewModel3.getOnboardingData();
            if (onboardingData3 == null) {
                Intrinsics.throwNpe();
            }
            IDReintentServices.getEnrollmentReintenNews(this, this, new GetEnrollmentReintenNewsCallback() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.checkEnrollmentAttempts.1

                /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$checkEnrollmentAttempts$1$1 */
                @InterfaceC1492Gx
                @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
                static final class RunnableC03051 implements Runnable {
                    RunnableC03051() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        StepHandlerActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_MAX_ATTEMPS_DAY, new Intent());
                        StepHandlerActivity.this.finish();
                    }
                }

                AnonymousClass1() {
                }

                @Override // com.ticnow.sdk.idnowonboarding.services.reintents.reintentsCallbacks.GetEnrollmentReintenNewsCallback
                public final void onGetEnrollmentReintenNewsResponse(IdNowCommonResponse idNowCommonResponse, IDEnrollmentResponseCodes iDEnrollmentResponseCodes) {
                    if (iDEnrollmentResponseCodes == IDEnrollmentResponseCodes.COD_USER_BLOCKED) {
                        StepHandlerActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.checkEnrollmentAttempts.1.1
                            RunnableC03051() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                StepHandlerActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_MAX_ATTEMPS_DAY, new Intent());
                                StepHandlerActivity.this.finish();
                            }
                        });
                    }
                }
            }, iDReintentServicesImpl.generateGetEnrollmentReintenNews(stepHandlerActivity, stepHandlerActivity2, commonParamsRequest, commonUserDataRequest, onboardingData3.configuration.additionalHeaders));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void checkInternetConnection() {
        IDDialog.showPreConnectionPopup(2, getSupportFragmentManager(), this, this, new C13011());
    }

    public final void checkMaxAttemptsDay() {
        IDReintentServicesImpl iDReintentServicesImpl = new IDReintentServicesImpl();
        StepHandlerActivity stepHandlerActivity = this;
        StepHandlerActivity stepHandlerActivity2 = this;
        StepHandlerViewModel stepHandlerViewModel = this.mViewModel;
        if (stepHandlerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        IDNowOnboardingData onboardingData = stepHandlerViewModel.getOnboardingData();
        if (onboardingData == null) {
            Intrinsics.throwNpe();
        }
        CommonParamsRequest commonParamsRequest = onboardingData.configuration.commonParams;
        Intrinsics.checkExpressionValueIsNotNull(commonParamsRequest, "mViewModel.onboardingDat…onfiguration.commonParams");
        StepHandlerViewModel stepHandlerViewModel2 = this.mViewModel;
        if (stepHandlerViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        IDNowOnboardingData onboardingData2 = stepHandlerViewModel2.getOnboardingData();
        if (onboardingData2 == null) {
            Intrinsics.throwNpe();
        }
        CommonUserDataRequest commonUserDataRequest = onboardingData2.configuration.commonUserData;
        Intrinsics.checkExpressionValueIsNotNull(commonUserDataRequest, "mViewModel.onboardingDat…figuration.commonUserData");
        StepHandlerViewModel stepHandlerViewModel3 = this.mViewModel;
        if (stepHandlerViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        IDNowOnboardingData onboardingData3 = stepHandlerViewModel3.getOnboardingData();
        if (onboardingData3 == null) {
            Intrinsics.throwNpe();
        }
        IDReintentServices.getEnrollmentReintenNews(stepHandlerActivity, stepHandlerActivity2, new GetEnrollmentReintenNewsCallback() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.checkMaxAttemptsDay.1
            C13021() {
            }

            @Override // com.ticnow.sdk.idnowonboarding.services.reintents.reintentsCallbacks.GetEnrollmentReintenNewsCallback
            public final void onGetEnrollmentReintenNewsResponse(IdNowCommonResponse idNowCommonResponse, IDEnrollmentResponseCodes iDEnrollmentResponseCodes) {
                Intent intent = new Intent();
                if (iDEnrollmentResponseCodes != null) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[iDEnrollmentResponseCodes.ordinal()];
                    if (i2 == 1) {
                        StepHandlerActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_MAX_ATTEMPS_DAY, intent);
                        StepHandlerActivity.this.finish();
                        return;
                    } else if (i2 == 2) {
                        return;
                    }
                }
                StepHandlerActivity.this.setResult(170008, intent);
                StepHandlerActivity.this.finish();
            }
        }, iDReintentServicesImpl.generateGetEnrollmentReintenNews(stepHandlerActivity, stepHandlerActivity2, commonParamsRequest, commonUserDataRequest, onboardingData3.configuration.additionalHeaders));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01fc A[Catch: Exception -> 0x02ef, TryCatch #0 {Exception -> 0x02ef, blocks: (B:208:0x0001, B:403:0x02eb, B:402:0x02e8, B:213:0x0011, B:380:0x028c, B:382:0x0292, B:383:0x0295, B:385:0x029b, B:386:0x029e, B:388:0x02a2, B:389:0x02a5, B:216:0x001b, B:392:0x02be, B:394:0x02c4, B:395:0x02c7, B:397:0x02cd, B:398:0x02d0, B:400:0x02d4, B:401:0x02d7, B:219:0x0025, B:221:0x002d, B:223:0x0033, B:224:0x0036, B:226:0x003c, B:227:0x003f, B:229:0x0043, B:230:0x0046, B:231:0x0056, B:233:0x005e, B:235:0x0064, B:236:0x0067, B:238:0x006d, B:239:0x0070, B:241:0x0074, B:242:0x0077, B:243:0x0087, B:344:0x01f6, B:346:0x01fc, B:347:0x01ff, B:349:0x0205, B:350:0x0208, B:352:0x020c, B:353:0x020f, B:246:0x0091, B:249:0x009b, B:252:0x00a5, B:254:0x00ad, B:256:0x00b3, B:257:0x00b6, B:259:0x00bc, B:260:0x00bf, B:262:0x00c3, B:263:0x00c6, B:264:0x00d7, B:267:0x00e1, B:269:0x00e9, B:271:0x00ef, B:272:0x00f2, B:274:0x00f8, B:275:0x00fb, B:277:0x00ff, B:278:0x0102, B:279:0x0113, B:282:0x011d, B:285:0x0127, B:288:0x0131, B:291:0x013b, B:294:0x0145, B:297:0x014f, B:300:0x0159, B:303:0x0163, B:305:0x016b, B:307:0x0171, B:308:0x0174, B:310:0x017a, B:311:0x017d, B:313:0x0181, B:314:0x0184, B:315:0x0195, B:318:0x019f, B:321:0x01a9, B:324:0x01b3, B:327:0x01bd, B:330:0x01c7, B:333:0x01d1, B:336:0x01db, B:339:0x01e5, B:342:0x01ee, B:354:0x0220, B:356:0x0228, B:358:0x022e, B:359:0x0231, B:361:0x0237, B:362:0x023a, B:364:0x023e, B:365:0x0241, B:366:0x0252, B:368:0x025a, B:370:0x0260, B:371:0x0263, B:373:0x0269, B:374:0x026c, B:376:0x0270, B:377:0x0273, B:378:0x0284, B:390:0x02b6), top: B:407:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0205 A[Catch: Exception -> 0x02ef, TryCatch #0 {Exception -> 0x02ef, blocks: (B:208:0x0001, B:403:0x02eb, B:402:0x02e8, B:213:0x0011, B:380:0x028c, B:382:0x0292, B:383:0x0295, B:385:0x029b, B:386:0x029e, B:388:0x02a2, B:389:0x02a5, B:216:0x001b, B:392:0x02be, B:394:0x02c4, B:395:0x02c7, B:397:0x02cd, B:398:0x02d0, B:400:0x02d4, B:401:0x02d7, B:219:0x0025, B:221:0x002d, B:223:0x0033, B:224:0x0036, B:226:0x003c, B:227:0x003f, B:229:0x0043, B:230:0x0046, B:231:0x0056, B:233:0x005e, B:235:0x0064, B:236:0x0067, B:238:0x006d, B:239:0x0070, B:241:0x0074, B:242:0x0077, B:243:0x0087, B:344:0x01f6, B:346:0x01fc, B:347:0x01ff, B:349:0x0205, B:350:0x0208, B:352:0x020c, B:353:0x020f, B:246:0x0091, B:249:0x009b, B:252:0x00a5, B:254:0x00ad, B:256:0x00b3, B:257:0x00b6, B:259:0x00bc, B:260:0x00bf, B:262:0x00c3, B:263:0x00c6, B:264:0x00d7, B:267:0x00e1, B:269:0x00e9, B:271:0x00ef, B:272:0x00f2, B:274:0x00f8, B:275:0x00fb, B:277:0x00ff, B:278:0x0102, B:279:0x0113, B:282:0x011d, B:285:0x0127, B:288:0x0131, B:291:0x013b, B:294:0x0145, B:297:0x014f, B:300:0x0159, B:303:0x0163, B:305:0x016b, B:307:0x0171, B:308:0x0174, B:310:0x017a, B:311:0x017d, B:313:0x0181, B:314:0x0184, B:315:0x0195, B:318:0x019f, B:321:0x01a9, B:324:0x01b3, B:327:0x01bd, B:330:0x01c7, B:333:0x01d1, B:336:0x01db, B:339:0x01e5, B:342:0x01ee, B:354:0x0220, B:356:0x0228, B:358:0x022e, B:359:0x0231, B:361:0x0237, B:362:0x023a, B:364:0x023e, B:365:0x0241, B:366:0x0252, B:368:0x025a, B:370:0x0260, B:371:0x0263, B:373:0x0269, B:374:0x026c, B:376:0x0270, B:377:0x0273, B:378:0x0284, B:390:0x02b6), top: B:407:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x020c A[Catch: Exception -> 0x02ef, TryCatch #0 {Exception -> 0x02ef, blocks: (B:208:0x0001, B:403:0x02eb, B:402:0x02e8, B:213:0x0011, B:380:0x028c, B:382:0x0292, B:383:0x0295, B:385:0x029b, B:386:0x029e, B:388:0x02a2, B:389:0x02a5, B:216:0x001b, B:392:0x02be, B:394:0x02c4, B:395:0x02c7, B:397:0x02cd, B:398:0x02d0, B:400:0x02d4, B:401:0x02d7, B:219:0x0025, B:221:0x002d, B:223:0x0033, B:224:0x0036, B:226:0x003c, B:227:0x003f, B:229:0x0043, B:230:0x0046, B:231:0x0056, B:233:0x005e, B:235:0x0064, B:236:0x0067, B:238:0x006d, B:239:0x0070, B:241:0x0074, B:242:0x0077, B:243:0x0087, B:344:0x01f6, B:346:0x01fc, B:347:0x01ff, B:349:0x0205, B:350:0x0208, B:352:0x020c, B:353:0x020f, B:246:0x0091, B:249:0x009b, B:252:0x00a5, B:254:0x00ad, B:256:0x00b3, B:257:0x00b6, B:259:0x00bc, B:260:0x00bf, B:262:0x00c3, B:263:0x00c6, B:264:0x00d7, B:267:0x00e1, B:269:0x00e9, B:271:0x00ef, B:272:0x00f2, B:274:0x00f8, B:275:0x00fb, B:277:0x00ff, B:278:0x0102, B:279:0x0113, B:282:0x011d, B:285:0x0127, B:288:0x0131, B:291:0x013b, B:294:0x0145, B:297:0x014f, B:300:0x0159, B:303:0x0163, B:305:0x016b, B:307:0x0171, B:308:0x0174, B:310:0x017a, B:311:0x017d, B:313:0x0181, B:314:0x0184, B:315:0x0195, B:318:0x019f, B:321:0x01a9, B:324:0x01b3, B:327:0x01bd, B:330:0x01c7, B:333:0x01d1, B:336:0x01db, B:339:0x01e5, B:342:0x01ee, B:354:0x0220, B:356:0x0228, B:358:0x022e, B:359:0x0231, B:361:0x0237, B:362:0x023a, B:364:0x023e, B:365:0x0241, B:366:0x0252, B:368:0x025a, B:370:0x0260, B:371:0x0263, B:373:0x0269, B:374:0x026c, B:376:0x0270, B:377:0x0273, B:378:0x0284, B:390:0x02b6), top: B:407:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0292 A[Catch: Exception -> 0x02ef, TryCatch #0 {Exception -> 0x02ef, blocks: (B:208:0x0001, B:403:0x02eb, B:402:0x02e8, B:213:0x0011, B:380:0x028c, B:382:0x0292, B:383:0x0295, B:385:0x029b, B:386:0x029e, B:388:0x02a2, B:389:0x02a5, B:216:0x001b, B:392:0x02be, B:394:0x02c4, B:395:0x02c7, B:397:0x02cd, B:398:0x02d0, B:400:0x02d4, B:401:0x02d7, B:219:0x0025, B:221:0x002d, B:223:0x0033, B:224:0x0036, B:226:0x003c, B:227:0x003f, B:229:0x0043, B:230:0x0046, B:231:0x0056, B:233:0x005e, B:235:0x0064, B:236:0x0067, B:238:0x006d, B:239:0x0070, B:241:0x0074, B:242:0x0077, B:243:0x0087, B:344:0x01f6, B:346:0x01fc, B:347:0x01ff, B:349:0x0205, B:350:0x0208, B:352:0x020c, B:353:0x020f, B:246:0x0091, B:249:0x009b, B:252:0x00a5, B:254:0x00ad, B:256:0x00b3, B:257:0x00b6, B:259:0x00bc, B:260:0x00bf, B:262:0x00c3, B:263:0x00c6, B:264:0x00d7, B:267:0x00e1, B:269:0x00e9, B:271:0x00ef, B:272:0x00f2, B:274:0x00f8, B:275:0x00fb, B:277:0x00ff, B:278:0x0102, B:279:0x0113, B:282:0x011d, B:285:0x0127, B:288:0x0131, B:291:0x013b, B:294:0x0145, B:297:0x014f, B:300:0x0159, B:303:0x0163, B:305:0x016b, B:307:0x0171, B:308:0x0174, B:310:0x017a, B:311:0x017d, B:313:0x0181, B:314:0x0184, B:315:0x0195, B:318:0x019f, B:321:0x01a9, B:324:0x01b3, B:327:0x01bd, B:330:0x01c7, B:333:0x01d1, B:336:0x01db, B:339:0x01e5, B:342:0x01ee, B:354:0x0220, B:356:0x0228, B:358:0x022e, B:359:0x0231, B:361:0x0237, B:362:0x023a, B:364:0x023e, B:365:0x0241, B:366:0x0252, B:368:0x025a, B:370:0x0260, B:371:0x0263, B:373:0x0269, B:374:0x026c, B:376:0x0270, B:377:0x0273, B:378:0x0284, B:390:0x02b6), top: B:407:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x029b A[Catch: Exception -> 0x02ef, TryCatch #0 {Exception -> 0x02ef, blocks: (B:208:0x0001, B:403:0x02eb, B:402:0x02e8, B:213:0x0011, B:380:0x028c, B:382:0x0292, B:383:0x0295, B:385:0x029b, B:386:0x029e, B:388:0x02a2, B:389:0x02a5, B:216:0x001b, B:392:0x02be, B:394:0x02c4, B:395:0x02c7, B:397:0x02cd, B:398:0x02d0, B:400:0x02d4, B:401:0x02d7, B:219:0x0025, B:221:0x002d, B:223:0x0033, B:224:0x0036, B:226:0x003c, B:227:0x003f, B:229:0x0043, B:230:0x0046, B:231:0x0056, B:233:0x005e, B:235:0x0064, B:236:0x0067, B:238:0x006d, B:239:0x0070, B:241:0x0074, B:242:0x0077, B:243:0x0087, B:344:0x01f6, B:346:0x01fc, B:347:0x01ff, B:349:0x0205, B:350:0x0208, B:352:0x020c, B:353:0x020f, B:246:0x0091, B:249:0x009b, B:252:0x00a5, B:254:0x00ad, B:256:0x00b3, B:257:0x00b6, B:259:0x00bc, B:260:0x00bf, B:262:0x00c3, B:263:0x00c6, B:264:0x00d7, B:267:0x00e1, B:269:0x00e9, B:271:0x00ef, B:272:0x00f2, B:274:0x00f8, B:275:0x00fb, B:277:0x00ff, B:278:0x0102, B:279:0x0113, B:282:0x011d, B:285:0x0127, B:288:0x0131, B:291:0x013b, B:294:0x0145, B:297:0x014f, B:300:0x0159, B:303:0x0163, B:305:0x016b, B:307:0x0171, B:308:0x0174, B:310:0x017a, B:311:0x017d, B:313:0x0181, B:314:0x0184, B:315:0x0195, B:318:0x019f, B:321:0x01a9, B:324:0x01b3, B:327:0x01bd, B:330:0x01c7, B:333:0x01d1, B:336:0x01db, B:339:0x01e5, B:342:0x01ee, B:354:0x0220, B:356:0x0228, B:358:0x022e, B:359:0x0231, B:361:0x0237, B:362:0x023a, B:364:0x023e, B:365:0x0241, B:366:0x0252, B:368:0x025a, B:370:0x0260, B:371:0x0263, B:373:0x0269, B:374:0x026c, B:376:0x0270, B:377:0x0273, B:378:0x0284, B:390:0x02b6), top: B:407:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x02a2 A[Catch: Exception -> 0x02ef, TryCatch #0 {Exception -> 0x02ef, blocks: (B:208:0x0001, B:403:0x02eb, B:402:0x02e8, B:213:0x0011, B:380:0x028c, B:382:0x0292, B:383:0x0295, B:385:0x029b, B:386:0x029e, B:388:0x02a2, B:389:0x02a5, B:216:0x001b, B:392:0x02be, B:394:0x02c4, B:395:0x02c7, B:397:0x02cd, B:398:0x02d0, B:400:0x02d4, B:401:0x02d7, B:219:0x0025, B:221:0x002d, B:223:0x0033, B:224:0x0036, B:226:0x003c, B:227:0x003f, B:229:0x0043, B:230:0x0046, B:231:0x0056, B:233:0x005e, B:235:0x0064, B:236:0x0067, B:238:0x006d, B:239:0x0070, B:241:0x0074, B:242:0x0077, B:243:0x0087, B:344:0x01f6, B:346:0x01fc, B:347:0x01ff, B:349:0x0205, B:350:0x0208, B:352:0x020c, B:353:0x020f, B:246:0x0091, B:249:0x009b, B:252:0x00a5, B:254:0x00ad, B:256:0x00b3, B:257:0x00b6, B:259:0x00bc, B:260:0x00bf, B:262:0x00c3, B:263:0x00c6, B:264:0x00d7, B:267:0x00e1, B:269:0x00e9, B:271:0x00ef, B:272:0x00f2, B:274:0x00f8, B:275:0x00fb, B:277:0x00ff, B:278:0x0102, B:279:0x0113, B:282:0x011d, B:285:0x0127, B:288:0x0131, B:291:0x013b, B:294:0x0145, B:297:0x014f, B:300:0x0159, B:303:0x0163, B:305:0x016b, B:307:0x0171, B:308:0x0174, B:310:0x017a, B:311:0x017d, B:313:0x0181, B:314:0x0184, B:315:0x0195, B:318:0x019f, B:321:0x01a9, B:324:0x01b3, B:327:0x01bd, B:330:0x01c7, B:333:0x01d1, B:336:0x01db, B:339:0x01e5, B:342:0x01ee, B:354:0x0220, B:356:0x0228, B:358:0x022e, B:359:0x0231, B:361:0x0237, B:362:0x023a, B:364:0x023e, B:365:0x0241, B:366:0x0252, B:368:0x025a, B:370:0x0260, B:371:0x0263, B:373:0x0269, B:374:0x026c, B:376:0x0270, B:377:0x0273, B:378:0x0284, B:390:0x02b6), top: B:407:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x02c4 A[Catch: Exception -> 0x02ef, TryCatch #0 {Exception -> 0x02ef, blocks: (B:208:0x0001, B:403:0x02eb, B:402:0x02e8, B:213:0x0011, B:380:0x028c, B:382:0x0292, B:383:0x0295, B:385:0x029b, B:386:0x029e, B:388:0x02a2, B:389:0x02a5, B:216:0x001b, B:392:0x02be, B:394:0x02c4, B:395:0x02c7, B:397:0x02cd, B:398:0x02d0, B:400:0x02d4, B:401:0x02d7, B:219:0x0025, B:221:0x002d, B:223:0x0033, B:224:0x0036, B:226:0x003c, B:227:0x003f, B:229:0x0043, B:230:0x0046, B:231:0x0056, B:233:0x005e, B:235:0x0064, B:236:0x0067, B:238:0x006d, B:239:0x0070, B:241:0x0074, B:242:0x0077, B:243:0x0087, B:344:0x01f6, B:346:0x01fc, B:347:0x01ff, B:349:0x0205, B:350:0x0208, B:352:0x020c, B:353:0x020f, B:246:0x0091, B:249:0x009b, B:252:0x00a5, B:254:0x00ad, B:256:0x00b3, B:257:0x00b6, B:259:0x00bc, B:260:0x00bf, B:262:0x00c3, B:263:0x00c6, B:264:0x00d7, B:267:0x00e1, B:269:0x00e9, B:271:0x00ef, B:272:0x00f2, B:274:0x00f8, B:275:0x00fb, B:277:0x00ff, B:278:0x0102, B:279:0x0113, B:282:0x011d, B:285:0x0127, B:288:0x0131, B:291:0x013b, B:294:0x0145, B:297:0x014f, B:300:0x0159, B:303:0x0163, B:305:0x016b, B:307:0x0171, B:308:0x0174, B:310:0x017a, B:311:0x017d, B:313:0x0181, B:314:0x0184, B:315:0x0195, B:318:0x019f, B:321:0x01a9, B:324:0x01b3, B:327:0x01bd, B:330:0x01c7, B:333:0x01d1, B:336:0x01db, B:339:0x01e5, B:342:0x01ee, B:354:0x0220, B:356:0x0228, B:358:0x022e, B:359:0x0231, B:361:0x0237, B:362:0x023a, B:364:0x023e, B:365:0x0241, B:366:0x0252, B:368:0x025a, B:370:0x0260, B:371:0x0263, B:373:0x0269, B:374:0x026c, B:376:0x0270, B:377:0x0273, B:378:0x0284, B:390:0x02b6), top: B:407:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x02cd A[Catch: Exception -> 0x02ef, TryCatch #0 {Exception -> 0x02ef, blocks: (B:208:0x0001, B:403:0x02eb, B:402:0x02e8, B:213:0x0011, B:380:0x028c, B:382:0x0292, B:383:0x0295, B:385:0x029b, B:386:0x029e, B:388:0x02a2, B:389:0x02a5, B:216:0x001b, B:392:0x02be, B:394:0x02c4, B:395:0x02c7, B:397:0x02cd, B:398:0x02d0, B:400:0x02d4, B:401:0x02d7, B:219:0x0025, B:221:0x002d, B:223:0x0033, B:224:0x0036, B:226:0x003c, B:227:0x003f, B:229:0x0043, B:230:0x0046, B:231:0x0056, B:233:0x005e, B:235:0x0064, B:236:0x0067, B:238:0x006d, B:239:0x0070, B:241:0x0074, B:242:0x0077, B:243:0x0087, B:344:0x01f6, B:346:0x01fc, B:347:0x01ff, B:349:0x0205, B:350:0x0208, B:352:0x020c, B:353:0x020f, B:246:0x0091, B:249:0x009b, B:252:0x00a5, B:254:0x00ad, B:256:0x00b3, B:257:0x00b6, B:259:0x00bc, B:260:0x00bf, B:262:0x00c3, B:263:0x00c6, B:264:0x00d7, B:267:0x00e1, B:269:0x00e9, B:271:0x00ef, B:272:0x00f2, B:274:0x00f8, B:275:0x00fb, B:277:0x00ff, B:278:0x0102, B:279:0x0113, B:282:0x011d, B:285:0x0127, B:288:0x0131, B:291:0x013b, B:294:0x0145, B:297:0x014f, B:300:0x0159, B:303:0x0163, B:305:0x016b, B:307:0x0171, B:308:0x0174, B:310:0x017a, B:311:0x017d, B:313:0x0181, B:314:0x0184, B:315:0x0195, B:318:0x019f, B:321:0x01a9, B:324:0x01b3, B:327:0x01bd, B:330:0x01c7, B:333:0x01d1, B:336:0x01db, B:339:0x01e5, B:342:0x01ee, B:354:0x0220, B:356:0x0228, B:358:0x022e, B:359:0x0231, B:361:0x0237, B:362:0x023a, B:364:0x023e, B:365:0x0241, B:366:0x0252, B:368:0x025a, B:370:0x0260, B:371:0x0263, B:373:0x0269, B:374:0x026c, B:376:0x0270, B:377:0x0273, B:378:0x0284, B:390:0x02b6), top: B:407:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x02d4 A[Catch: Exception -> 0x02ef, TryCatch #0 {Exception -> 0x02ef, blocks: (B:208:0x0001, B:403:0x02eb, B:402:0x02e8, B:213:0x0011, B:380:0x028c, B:382:0x0292, B:383:0x0295, B:385:0x029b, B:386:0x029e, B:388:0x02a2, B:389:0x02a5, B:216:0x001b, B:392:0x02be, B:394:0x02c4, B:395:0x02c7, B:397:0x02cd, B:398:0x02d0, B:400:0x02d4, B:401:0x02d7, B:219:0x0025, B:221:0x002d, B:223:0x0033, B:224:0x0036, B:226:0x003c, B:227:0x003f, B:229:0x0043, B:230:0x0046, B:231:0x0056, B:233:0x005e, B:235:0x0064, B:236:0x0067, B:238:0x006d, B:239:0x0070, B:241:0x0074, B:242:0x0077, B:243:0x0087, B:344:0x01f6, B:346:0x01fc, B:347:0x01ff, B:349:0x0205, B:350:0x0208, B:352:0x020c, B:353:0x020f, B:246:0x0091, B:249:0x009b, B:252:0x00a5, B:254:0x00ad, B:256:0x00b3, B:257:0x00b6, B:259:0x00bc, B:260:0x00bf, B:262:0x00c3, B:263:0x00c6, B:264:0x00d7, B:267:0x00e1, B:269:0x00e9, B:271:0x00ef, B:272:0x00f2, B:274:0x00f8, B:275:0x00fb, B:277:0x00ff, B:278:0x0102, B:279:0x0113, B:282:0x011d, B:285:0x0127, B:288:0x0131, B:291:0x013b, B:294:0x0145, B:297:0x014f, B:300:0x0159, B:303:0x0163, B:305:0x016b, B:307:0x0171, B:308:0x0174, B:310:0x017a, B:311:0x017d, B:313:0x0181, B:314:0x0184, B:315:0x0195, B:318:0x019f, B:321:0x01a9, B:324:0x01b3, B:327:0x01bd, B:330:0x01c7, B:333:0x01d1, B:336:0x01db, B:339:0x01e5, B:342:0x01ee, B:354:0x0220, B:356:0x0228, B:358:0x022e, B:359:0x0231, B:361:0x0237, B:362:0x023a, B:364:0x023e, B:365:0x0241, B:366:0x0252, B:368:0x025a, B:370:0x0260, B:371:0x0263, B:373:0x0269, B:374:0x026c, B:376:0x0270, B:377:0x0273, B:378:0x0284, B:390:0x02b6), top: B:407:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void handleNextStep(java.lang.String r5, com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath r6) {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.handleNextStep(java.lang.String, com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath):void");
    }

    private final void idNowCustomize() {
    }

    public final void launchCancelDialog() {
        Dialog.INSTANCE.show(getSupportFragmentManager(), this, "", "¿Desea cerrar sesión?", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.launchCancelDialog.1
            ViewOnClickListenerC13031() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    StepHandlerActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_USER_CANCELLED_ONBOARDING, new Intent());
                    StepHandlerActivity.this.finish();
                } finally {
                    Callback.onClick_exit();
                }
            }
        }, "Cancelar", AnonymousClass2.INSTANCE, AnonymousClass3.INSTANCE);
    }

    private final void launchStep(IDStepKind iDStepKind, EnrollPath enrollPath) {
        try {
            StepLauncherController.Builder builderStepParams = new StepLauncherController.Builder(this, this).stepKind(iDStepKind).stepParams(enrollPath);
            StepHandlerViewModel stepHandlerViewModel = this.mViewModel;
            if (stepHandlerViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            IDNowOnboardingData onboardingData = stepHandlerViewModel.getOnboardingData();
            if (onboardingData == null) {
                Intrinsics.throwNpe();
            }
            builderStepParams.configuration(onboardingData.configuration).Build().Start();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void startFlow() {
        try {
            StepHandlerViewModel stepHandlerViewModel = this.mViewModel;
            if (stepHandlerViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            ArrayList<IDNowStep> idNowSteps = stepHandlerViewModel.getIdNowSteps();
            if (idNowSteps == null) {
                Intrinsics.throwNpe();
            }
            StepHandlerViewModel stepHandlerViewModel2 = this.mViewModel;
            if (stepHandlerViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            String internalStepName = idNowSteps.get(stepHandlerViewModel2.getCurrentStepIndex()).getInternalStepName();
            StepHandlerViewModel stepHandlerViewModel3 = this.mViewModel;
            if (stepHandlerViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            ArrayList<IDNowStep> idNowSteps2 = stepHandlerViewModel3.getIdNowSteps();
            if (idNowSteps2 == null) {
                Intrinsics.throwNpe();
            }
            StepHandlerViewModel stepHandlerViewModel4 = this.mViewModel;
            if (stepHandlerViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            handleNextStep(internalStepName, idNowSteps2.get(stepHandlerViewModel4.getCurrentStepIndex()).getAction());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void updateStepList() {
        try {
            LinearLayout linearLayout = this.layoutScrollViewContainer;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutScrollViewContainer");
            }
            int childCount = linearLayout.getChildCount();
            int i2 = 1;
            for (int i3 = 0; i3 < childCount; i3++) {
                LinearLayout linearLayout2 = this.layoutScrollViewContainer;
                if (linearLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutScrollViewContainer");
                }
                View childAt = linearLayout2.getChildAt(i3);
                if (childAt == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ticnow.sdk.idnowonboarding.steps.stephandler.views.ProcessStepView");
                }
                ProcessStepView processStepView = (ProcessStepView) childAt;
                StepHandlerViewModel stepHandlerViewModel = this.mViewModel;
                if (stepHandlerViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                ArrayList<IDNowStep> idNowSteps = stepHandlerViewModel.getIdNowSteps();
                if (idNowSteps == null) {
                    Intrinsics.throwNpe();
                }
                if (idNowSteps.get(i3).getSelected()) {
                    ProcessStepView.STATUS status = ProcessStepView.STATUS.SELECTED;
                    StepHandlerViewModel stepHandlerViewModel2 = this.mViewModel;
                    if (stepHandlerViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    }
                    IDNowOnboardingData onboardingData = stepHandlerViewModel2.getOnboardingData();
                    if (onboardingData == null) {
                        Intrinsics.throwNpe();
                    }
                    processStepView.setEstado(status, onboardingData.configuration.customization);
                } else {
                    StepHandlerViewModel stepHandlerViewModel3 = this.mViewModel;
                    if (stepHandlerViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    }
                    ArrayList<IDNowStep> idNowSteps2 = stepHandlerViewModel3.getIdNowSteps();
                    if (idNowSteps2 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (idNowSteps2.get(i3).getError()) {
                        ProcessStepView.STATUS status2 = ProcessStepView.STATUS.FAIL;
                        StepHandlerViewModel stepHandlerViewModel4 = this.mViewModel;
                        if (stepHandlerViewModel4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        IDNowOnboardingData onboardingData2 = stepHandlerViewModel4.getOnboardingData();
                        if (onboardingData2 == null) {
                            Intrinsics.throwNpe();
                        }
                        processStepView.setEstado(status2, onboardingData2.configuration.customization);
                    } else {
                        StepHandlerViewModel stepHandlerViewModel5 = this.mViewModel;
                        if (stepHandlerViewModel5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        ArrayList<IDNowStep> idNowSteps3 = stepHandlerViewModel5.getIdNowSteps();
                        if (idNowSteps3 == null) {
                            Intrinsics.throwNpe();
                        }
                        if (idNowSteps3.get(i3).getSuccess()) {
                            ProcessStepView.STATUS status3 = ProcessStepView.STATUS.SUCCESS;
                            StepHandlerViewModel stepHandlerViewModel6 = this.mViewModel;
                            if (stepHandlerViewModel6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                            }
                            IDNowOnboardingData onboardingData3 = stepHandlerViewModel6.getOnboardingData();
                            if (onboardingData3 == null) {
                                Intrinsics.throwNpe();
                            }
                            processStepView.setEstado(status3, onboardingData3.configuration.customization);
                        } else {
                            ProcessStepView.STATUS status4 = ProcessStepView.STATUS.PENDING;
                            StepHandlerViewModel stepHandlerViewModel7 = this.mViewModel;
                            if (stepHandlerViewModel7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                            }
                            IDNowOnboardingData onboardingData4 = stepHandlerViewModel7.getOnboardingData();
                            if (onboardingData4 == null) {
                                Intrinsics.throwNpe();
                            }
                            processStepView.setEstado(status4, onboardingData4.configuration.customization);
                        }
                    }
                }
                StepHandlerViewModel stepHandlerViewModel8 = this.mViewModel;
                if (stepHandlerViewModel8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                ArrayList<IDNowStep> idNowSteps4 = stepHandlerViewModel8.getIdNowSteps();
                if (idNowSteps4 == null) {
                    Intrinsics.throwNpe();
                }
                processStepView.setText(idNowSteps4.get(i3).getStepName());
                processStepView.setIndex(i2);
                i2++;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
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
            String strOd = C1561oA.od("\u0015\u0002G\u0005h", (short) (ZN.Xd() ^ ((1463722410 ^ 1189719905) ^ 299326563)));
            String strKd = C1561oA.Kd("\u007fn", (short) (ZN.Xd() ^ (1858185044 ^ 1858207198)));
            try {
                Class<?> cls = Class.forName(strOd);
                Field field = 0 != 0 ? cls.getField(strKd) : cls.getDeclaredField(strKd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                short sXd = (short) (Od.Xd() ^ (34530104 ^ (-34520607)));
                short sXd2 = (short) (Od.Xd() ^ (465711396 ^ (-465703538)));
                int[] iArr = new int["\u007fuj\u001f2".length()];
                QB qb = new QB("\u007fuj\u001f2");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                String strXd = C1561oA.Xd("\u0001n", (short) (C1633zX.Xd() ^ ((1807648688 ^ 2037321072) ^ (-315739446))));
                try {
                    Class<?> cls2 = Class.forName(str);
                    Field field2 = 0 != 0 ? cls2.getField(strXd) : cls2.getDeclaredField(strXd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strVd = Wg.vd("hU\u001bXD", (short) (FB.Xd() ^ ((631815087 ^ 1572467272) ^ 2014383336)));
                    String strKd2 = Qg.kd(".\"", (short) (ZN.Xd() ^ ((1057283382 ^ 1594630622) ^ 1611189969)), (short) (ZN.Xd() ^ ((1754573146 ^ 1460630205) ^ 1067170676)));
                    try {
                        Class<?> cls3 = Class.forName(strVd);
                        Field field3 = 0 != 0 ? cls3.getField(strKd2) : cls3.getDeclaredField(strKd2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(hg.Vd("r_%nN", (short) (ZN.Xd() ^ ((473529074 ^ 1197159230) ^ 1533173311)), (short) (ZN.Xd() ^ ((1969676328 ^ 672158252) ^ 1568052340)))).getDeclaredMethod(C1561oA.ud("do", (short) (ZN.Xd() ^ (236494466 ^ 236500791))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1561oA.yd("gX\\Qcj", (short) (OY.Xd() ^ (1704638021 ^ 1704641502)))};
                                Method method = Class.forName(C1561oA.Yd("\f\u001a\u0011 \u001e\u0019\u0015_\u0016##*\u001c&-g}++2$85", (short) (C1633zX.Xd() ^ ((721159941 ^ 1457507483) ^ (-2082727633))))).getMethod(Jg.Wd(":LgZ}{\u0019NSMk}\u000eE[b", (short) (FB.Xd() ^ (481099361 ^ 481074536)), (short) (FB.Xd() ^ (550176154 ^ 550189115))), Class.forName(Xg.qd("5-C/|<2@:\u0002(JIAGA", (short) (FB.Xd() ^ (1810284419 ^ 1810269200)), (short) (FB.Xd() ^ (1201483667 ^ 1201501367)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd3 = (short) (C1580rY.Xd() ^ (1972971742 ^ (-1972993644)));
                                    short sXd4 = (short) (C1580rY.Xd() ^ ((1836714686 ^ 171480736) ^ (-1732429496)));
                                    int[] iArr2 = new int["+Jr'\u0018".length()];
                                    QB qb2 = new QB("+Jr'\u0018");
                                    int i3 = 0;
                                    while (qb2.YK()) {
                                        int iKK2 = qb2.KK();
                                        Xu xuXd2 = Xu.Xd(iKK2);
                                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                                        i3++;
                                    }
                                    String str2 = new String(iArr2, 0, i3);
                                    short sXd5 = (short) (C1633zX.Xd() ^ (28569978 ^ (-28541182)));
                                    short sXd6 = (short) (C1633zX.Xd() ^ ((594970199 ^ 792631108) ^ (-206064558)));
                                    int[] iArr3 = new int["2h".length()];
                                    QB qb3 = new QB("2h");
                                    int i4 = 0;
                                    while (qb3.YK()) {
                                        int iKK3 = qb3.KK();
                                        Xu xuXd3 = Xu.Xd(iKK3);
                                        iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i4 * sXd6))) + xuXd3.CK(iKK3));
                                        i4++;
                                    }
                                    String str3 = new String(iArr3, 0, i4);
                                    try {
                                        Class<?> cls4 = Class.forName(str2);
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
                    String strWd = Ig.wd("\u001fas\u0019k", (short) (C1607wl.Xd() ^ ((2013139822 ^ 1906120160) ^ 107157365)));
                    String strOd2 = EO.Od("-G", (short) (Od.Xd() ^ ((1863893742 ^ 1798397978) ^ (-69847551))));
                    try {
                        Class<?> cls5 = Class.forName(strWd);
                        Field field5 = 0 != 0 ? cls5.getField(strOd2) : cls5.getDeclaredField(strOd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strQd = C1561oA.Qd("\u001d\nO\rp", (short) (C1633zX.Xd() ^ ((672345345 ^ 528738336) ^ (-932230155))));
                        String strZd = C1593ug.zd("#\u0019", (short) (OY.Xd() ^ ((313441262 ^ 902006528) ^ 661483385)), (short) (OY.Xd() ^ ((686069303 ^ 925318072) ^ 532912113)));
                        try {
                            Class<?> cls6 = Class.forName(strQd);
                            Field field6 = 0 != 0 ? cls6.getField(strZd) : cls6.getDeclaredField(strZd);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i5 = (2062226638 ^ 1580311717) ^ 618311712;
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) throws Exception {
        super.onActivityResult(i2, i3, intent);
        Button button = this.buttonContinue;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
        }
        button.setEnabled(true);
        new Intent();
        if (i3 == 3000) {
            try {
                Intent intent2 = new Intent();
                if (intent == null) {
                    Intrinsics.throwNpe();
                }
                Serializable serializableExtra = intent.getSerializableExtra("enrollmentResult");
                if (serializableExtra == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ticnow.sdk.idnowonboarding.enrollresult.IDNowEnrollmentResult");
                }
                intent2.putExtra("enrollmentResult", (IDNowEnrollmentResult) serializableExtra);
                setResult(3000, intent2);
                finish();
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (i2 != 1600 || i3 == 0) {
            return;
        }
        if (i3 == 3030) {
            setResult(IDStepResponseCodes.STEP_RESULT_USER_CANCELLED_ONBOARDING, new Intent());
            finish();
            return;
        }
        if (i3 == 190000) {
            Intent intent3 = new Intent(this, (Class<?>) FinalResultsActivity.class);
            StepHandlerViewModel stepHandlerViewModel = this.mViewModel;
            if (stepHandlerViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            intent3.putExtra("onboardingdata", stepHandlerViewModel.getOnboardingData());
            StepHandlerViewModel stepHandlerViewModel2 = this.mViewModel;
            if (stepHandlerViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            ArrayList<IDNowStep> idNowSteps = stepHandlerViewModel2.getIdNowSteps();
            if (idNowSteps == null) {
                Intrinsics.throwNpe();
            }
            intent3.putExtra(ContainerStep.STEPS, idNowSteps);
            if (intent == null) {
                Intrinsics.throwNpe();
            }
            intent3.putExtra("finalScoring", intent.getStringExtra("finalScoring"));
            intent3.putExtra("seed", intent.getStringExtra("seed"));
            intent3.putExtra("status", intent.getStringExtra("status"));
            StepHandlerViewModel stepHandlerViewModel3 = this.mViewModel;
            if (stepHandlerViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            IDNowOnboardingData onboardingData = stepHandlerViewModel3.getOnboardingData();
            if (onboardingData == null) {
                Intrinsics.throwNpe();
            }
            intent3.putExtra("uuidTransaction", onboardingData.uuidTransaction);
            CX.ud();
            startActivityForResult(intent3, 101);
            return;
        }
        switch (i3) {
            case IDStepResponseCodes.STEP_RESULT_DOCUMENT_MAX_LOCAL_ATTEMPS /* 3033 */:
                StepHandlerViewModel stepHandlerViewModel4 = this.mViewModel;
                if (stepHandlerViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                ArrayList<IDNowStep> idNowSteps2 = stepHandlerViewModel4.getIdNowSteps();
                if (idNowSteps2 == null) {
                    Intrinsics.throwNpe();
                }
                StepHandlerViewModel stepHandlerViewModel5 = this.mViewModel;
                if (stepHandlerViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                idNowSteps2.get(stepHandlerViewModel5.getCurrentStepIndex()).setSuccess(false);
                StepHandlerViewModel stepHandlerViewModel6 = this.mViewModel;
                if (stepHandlerViewModel6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                ArrayList<IDNowStep> idNowSteps3 = stepHandlerViewModel6.getIdNowSteps();
                if (idNowSteps3 == null) {
                    Intrinsics.throwNpe();
                }
                StepHandlerViewModel stepHandlerViewModel7 = this.mViewModel;
                if (stepHandlerViewModel7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                idNowSteps3.get(stepHandlerViewModel7.getCurrentStepIndex()).setSelected(false);
                StepHandlerViewModel stepHandlerViewModel8 = this.mViewModel;
                if (stepHandlerViewModel8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                ArrayList<IDNowStep> idNowSteps4 = stepHandlerViewModel8.getIdNowSteps();
                if (idNowSteps4 == null) {
                    Intrinsics.throwNpe();
                }
                StepHandlerViewModel stepHandlerViewModel9 = this.mViewModel;
                if (stepHandlerViewModel9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                idNowSteps4.get(stepHandlerViewModel9.getCurrentStepIndex()).setError(true);
                updateStepList();
                IDDialog.showDialog(getSupportFragmentManager(), this, this, "No fue posible reconocer su cédula", "Recuerde que solo es válida la cédula de ciudadanía Colombiana. Debe tomar nuevamente las fotos.", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.onActivityResult.7
                    AnonymousClass7() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Callback.onClick_enter(view);
                        try {
                            StepHandlerActivity.this.checkMaxAttemptsDay();
                        } finally {
                            Callback.onClick_exit();
                        }
                    }
                });
                return;
            case IDStepResponseCodes.STEP_RESULT_DOCUMENT_BACK_MAX_LOCAL_ATTEMPS /* 3034 */:
                StepHandlerViewModel stepHandlerViewModel10 = this.mViewModel;
                if (stepHandlerViewModel10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                ArrayList<IDNowStep> idNowSteps5 = stepHandlerViewModel10.getIdNowSteps();
                if (idNowSteps5 == null) {
                    Intrinsics.throwNpe();
                }
                StepHandlerViewModel stepHandlerViewModel11 = this.mViewModel;
                if (stepHandlerViewModel11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                idNowSteps5.get(stepHandlerViewModel11.getCurrentStepIndex()).setSuccess(false);
                StepHandlerViewModel stepHandlerViewModel12 = this.mViewModel;
                if (stepHandlerViewModel12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                ArrayList<IDNowStep> idNowSteps6 = stepHandlerViewModel12.getIdNowSteps();
                if (idNowSteps6 == null) {
                    Intrinsics.throwNpe();
                }
                StepHandlerViewModel stepHandlerViewModel13 = this.mViewModel;
                if (stepHandlerViewModel13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                idNowSteps6.get(stepHandlerViewModel13.getCurrentStepIndex()).setSelected(false);
                StepHandlerViewModel stepHandlerViewModel14 = this.mViewModel;
                if (stepHandlerViewModel14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                ArrayList<IDNowStep> idNowSteps7 = stepHandlerViewModel14.getIdNowSteps();
                if (idNowSteps7 == null) {
                    Intrinsics.throwNpe();
                }
                StepHandlerViewModel stepHandlerViewModel15 = this.mViewModel;
                if (stepHandlerViewModel15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                idNowSteps7.get(stepHandlerViewModel15.getCurrentStepIndex()).setError(true);
                updateStepList();
                IDDialog.showDialog(getSupportFragmentManager(), this, this, "No fue posible reconocer su cédula", "Recuerde que solo es válida la cédula de ciudadanía Colombiana. Debe tomar nuevamente las fotos.", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.onActivityResult.8
                    AnonymousClass8() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Callback.onClick_enter(view);
                        try {
                            StepHandlerActivity.this.checkMaxAttemptsDay();
                        } finally {
                            Callback.onClick_exit();
                        }
                    }
                });
                return;
            case IDStepResponseCodes.STEP_RESULT_SELFIE_MAX_LOCAL_ATTEMPS /* 3035 */:
                StepHandlerViewModel stepHandlerViewModel16 = this.mViewModel;
                if (stepHandlerViewModel16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                ArrayList<IDNowStep> idNowSteps8 = stepHandlerViewModel16.getIdNowSteps();
                if (idNowSteps8 == null) {
                    Intrinsics.throwNpe();
                }
                StepHandlerViewModel stepHandlerViewModel17 = this.mViewModel;
                if (stepHandlerViewModel17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                idNowSteps8.get(stepHandlerViewModel17.getCurrentStepIndex()).setSuccess(false);
                StepHandlerViewModel stepHandlerViewModel18 = this.mViewModel;
                if (stepHandlerViewModel18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                ArrayList<IDNowStep> idNowSteps9 = stepHandlerViewModel18.getIdNowSteps();
                if (idNowSteps9 == null) {
                    Intrinsics.throwNpe();
                }
                StepHandlerViewModel stepHandlerViewModel19 = this.mViewModel;
                if (stepHandlerViewModel19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                idNowSteps9.get(stepHandlerViewModel19.getCurrentStepIndex()).setSelected(false);
                StepHandlerViewModel stepHandlerViewModel20 = this.mViewModel;
                if (stepHandlerViewModel20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                ArrayList<IDNowStep> idNowSteps10 = stepHandlerViewModel20.getIdNowSteps();
                if (idNowSteps10 == null) {
                    Intrinsics.throwNpe();
                }
                StepHandlerViewModel stepHandlerViewModel21 = this.mViewModel;
                if (stepHandlerViewModel21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                idNowSteps10.get(stepHandlerViewModel21.getCurrentStepIndex()).setError(true);
                updateStepList();
                IDDialog.showDialog(getSupportFragmentManager(), this, this, "", "No pudimos tomar su foto.\n Por favor comuniquese con nuestro call center.", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.onActivityResult.3
                    ViewOnClickListenerC13063() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Callback.onClick_enter(view);
                        try {
                            StepHandlerActivity.this.checkMaxAttemptsDay();
                        } finally {
                            Callback.onClick_exit();
                        }
                    }
                });
                return;
            case 3036:
                setResult(3036, new Intent());
                finish();
                return;
            default:
                switch (i3) {
                    case IDStepResponseCodes.STEP_RESULT_OK /* 170000 */:
                        ArrayList<KeyValue> arrayList = new ArrayList<>();
                        if (intent != null) {
                            Serializable serializableExtra2 = intent.getSerializableExtra("additionalParams");
                            if (serializableExtra2 == null) {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue> /* = java.util.ArrayList<com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue> */");
                            }
                            arrayList = (ArrayList) serializableExtra2;
                        }
                        IDStepReview iDStepReview = new IDStepReview();
                        if (arrayList.size() > 0) {
                            iDStepReview.setMetadata(arrayList);
                        }
                        iDStepReview.setScore("50");
                        StepHandlerViewModel stepHandlerViewModel22 = this.mViewModel;
                        if (stepHandlerViewModel22 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        ArrayList<IDNowStep> idNowSteps11 = stepHandlerViewModel22.getIdNowSteps();
                        if (idNowSteps11 == null) {
                            Intrinsics.throwNpe();
                        }
                        StepHandlerViewModel stepHandlerViewModel23 = this.mViewModel;
                        if (stepHandlerViewModel23 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        iDStepReview.setStepId(idNowSteps11.get(stepHandlerViewModel23.getCurrentStepIndex()).getAction().getId());
                        iDStepReview.setSuccess(true);
                        StepHandlerViewModel stepHandlerViewModel24 = this.mViewModel;
                        if (stepHandlerViewModel24 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        ArrayList<IDNowStep> idNowSteps12 = stepHandlerViewModel24.getIdNowSteps();
                        if (idNowSteps12 == null) {
                            Intrinsics.throwNpe();
                        }
                        StepHandlerViewModel stepHandlerViewModel25 = this.mViewModel;
                        if (stepHandlerViewModel25 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        iDStepReview.setStepName(idNowSteps12.get(stepHandlerViewModel25.getCurrentStepIndex()).getStepName());
                        StepHandlerViewModel stepHandlerViewModel26 = this.mViewModel;
                        if (stepHandlerViewModel26 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        ArrayList<IDNowStep> idNowSteps13 = stepHandlerViewModel26.getIdNowSteps();
                        if (idNowSteps13 == null) {
                            Intrinsics.throwNpe();
                        }
                        StepHandlerViewModel stepHandlerViewModel27 = this.mViewModel;
                        if (stepHandlerViewModel27 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        iDStepReview.setInternalStepName(idNowSteps13.get(stepHandlerViewModel27.getCurrentStepIndex()).getInternalStepName());
                        StepHandlerViewModel stepHandlerViewModel28 = this.mViewModel;
                        if (stepHandlerViewModel28 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        ArrayList<IDNowStep> idNowSteps14 = stepHandlerViewModel28.getIdNowSteps();
                        if (idNowSteps14 == null) {
                            Intrinsics.throwNpe();
                        }
                        StepHandlerViewModel stepHandlerViewModel29 = this.mViewModel;
                        if (stepHandlerViewModel29 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        iDStepReview.setStepKind(idNowSteps14.get(stepHandlerViewModel29.getCurrentStepIndex()).getStepKind());
                        StepHandlerViewModel stepHandlerViewModel30 = this.mViewModel;
                        if (stepHandlerViewModel30 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        ArrayList<IDNowStep> idNowSteps15 = stepHandlerViewModel30.getIdNowSteps();
                        if (idNowSteps15 == null) {
                            Intrinsics.throwNpe();
                        }
                        StepHandlerViewModel stepHandlerViewModel31 = this.mViewModel;
                        if (stepHandlerViewModel31 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        idNowSteps15.get(stepHandlerViewModel31.getCurrentStepIndex()).setStepData(iDStepReview);
                        StepHandlerViewModel stepHandlerViewModel32 = this.mViewModel;
                        if (stepHandlerViewModel32 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        ArrayList<IDNowStep> idNowSteps16 = stepHandlerViewModel32.getIdNowSteps();
                        if (idNowSteps16 == null) {
                            Intrinsics.throwNpe();
                        }
                        StepHandlerViewModel stepHandlerViewModel33 = this.mViewModel;
                        if (stepHandlerViewModel33 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        idNowSteps16.get(stepHandlerViewModel33.getCurrentStepIndex()).setSuccess(true);
                        StepHandlerViewModel stepHandlerViewModel34 = this.mViewModel;
                        if (stepHandlerViewModel34 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        ArrayList<IDNowStep> idNowSteps17 = stepHandlerViewModel34.getIdNowSteps();
                        if (idNowSteps17 == null) {
                            Intrinsics.throwNpe();
                        }
                        StepHandlerViewModel stepHandlerViewModel35 = this.mViewModel;
                        if (stepHandlerViewModel35 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        idNowSteps17.get(stepHandlerViewModel35.getCurrentStepIndex()).setSelected(false);
                        StepHandlerViewModel stepHandlerViewModel36 = this.mViewModel;
                        if (stepHandlerViewModel36 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        ArrayList<IDNowStep> idNowSteps18 = stepHandlerViewModel36.getIdNowSteps();
                        if (idNowSteps18 == null) {
                            Intrinsics.throwNpe();
                        }
                        StepHandlerViewModel stepHandlerViewModel37 = this.mViewModel;
                        if (stepHandlerViewModel37 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        idNowSteps18.get(stepHandlerViewModel37.getCurrentStepIndex()).setError(false);
                        StepHandlerViewModel stepHandlerViewModel38 = this.mViewModel;
                        if (stepHandlerViewModel38 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        stepHandlerViewModel38.setCurrentStepIndex(stepHandlerViewModel38.getCurrentStepIndex() + 1);
                        StepHandlerViewModel stepHandlerViewModel39 = this.mViewModel;
                        if (stepHandlerViewModel39 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        ArrayList<IDNowStep> idNowSteps19 = stepHandlerViewModel39.getIdNowSteps();
                        if (idNowSteps19 == null) {
                            Intrinsics.throwNpe();
                        }
                        StepHandlerViewModel stepHandlerViewModel40 = this.mViewModel;
                        if (stepHandlerViewModel40 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        }
                        idNowSteps19.get(stepHandlerViewModel40.getCurrentStepIndex()).setSelected(true);
                        Button button2 = this.buttonContinue;
                        if (button2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
                        }
                        button2.setText("Continuar");
                        updateStepList();
                        return;
                    case IDStepResponseCodes.STEP_RESULT_CANCELED /* 170001 */:
                        return;
                    default:
                        switch (i3) {
                            case IDStepResponseCodes.STEP_RESULT_ABORT_FLOW /* 170007 */:
                                setResult(IDStepResponseCodes.STEP_RESULT_ABORT_FLOW, new Intent());
                                finish();
                                return;
                            case 170008:
                                StepHandlerViewModel stepHandlerViewModel41 = this.mViewModel;
                                if (stepHandlerViewModel41 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                }
                                ArrayList<IDNowStep> idNowSteps20 = stepHandlerViewModel41.getIdNowSteps();
                                if (idNowSteps20 == null) {
                                    Intrinsics.throwNpe();
                                }
                                StepHandlerViewModel stepHandlerViewModel42 = this.mViewModel;
                                if (stepHandlerViewModel42 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                }
                                idNowSteps20.get(stepHandlerViewModel42.getCurrentStepIndex()).setSuccess(false);
                                StepHandlerViewModel stepHandlerViewModel43 = this.mViewModel;
                                if (stepHandlerViewModel43 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                }
                                ArrayList<IDNowStep> idNowSteps21 = stepHandlerViewModel43.getIdNowSteps();
                                if (idNowSteps21 == null) {
                                    Intrinsics.throwNpe();
                                }
                                StepHandlerViewModel stepHandlerViewModel44 = this.mViewModel;
                                if (stepHandlerViewModel44 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                }
                                idNowSteps21.get(stepHandlerViewModel44.getCurrentStepIndex()).setSelected(false);
                                StepHandlerViewModel stepHandlerViewModel45 = this.mViewModel;
                                if (stepHandlerViewModel45 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                }
                                ArrayList<IDNowStep> idNowSteps22 = stepHandlerViewModel45.getIdNowSteps();
                                if (idNowSteps22 == null) {
                                    Intrinsics.throwNpe();
                                }
                                StepHandlerViewModel stepHandlerViewModel46 = this.mViewModel;
                                if (stepHandlerViewModel46 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                }
                                idNowSteps22.get(stepHandlerViewModel46.getCurrentStepIndex()).setError(true);
                                updateStepList();
                                IDDialog.showDialog(getSupportFragmentManager(), this, this, "Registro no exitoso", "Intente nuevamente más tarde", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.onActivityResult.2

                                    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$onActivityResult$2$1 */
                                    @InterfaceC1492Gx
                                    @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
                                    static final class AnonymousClass1 implements Runnable {
                                        AnonymousClass1() {
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            StepHandlerActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_BIOMETRY_NOT_MET, new Intent());
                                            StepHandlerActivity.this.finish();
                                        }
                                    }

                                    ViewOnClickListenerC13052() {
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Callback.onClick_enter(view);
                                        try {
                                            StepHandlerActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.onActivityResult.2.1
                                                AnonymousClass1() {
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    StepHandlerActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_BIOMETRY_NOT_MET, new Intent());
                                                    StepHandlerActivity.this.finish();
                                                }
                                            });
                                        } finally {
                                            Callback.onClick_exit();
                                        }
                                    }
                                });
                                return;
                            default:
                                switch (i3) {
                                    case IDStepResponseCodes.STEP_RESULT_FAIL /* 170050 */:
                                        StepHandlerViewModel stepHandlerViewModel47 = this.mViewModel;
                                        if (stepHandlerViewModel47 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        ArrayList<IDNowStep> idNowSteps23 = stepHandlerViewModel47.getIdNowSteps();
                                        if (idNowSteps23 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        StepHandlerViewModel stepHandlerViewModel48 = this.mViewModel;
                                        if (stepHandlerViewModel48 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        idNowSteps23.get(stepHandlerViewModel48.getCurrentStepIndex()).setSuccess(false);
                                        StepHandlerViewModel stepHandlerViewModel49 = this.mViewModel;
                                        if (stepHandlerViewModel49 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        ArrayList<IDNowStep> idNowSteps24 = stepHandlerViewModel49.getIdNowSteps();
                                        if (idNowSteps24 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        StepHandlerViewModel stepHandlerViewModel50 = this.mViewModel;
                                        if (stepHandlerViewModel50 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        idNowSteps24.get(stepHandlerViewModel50.getCurrentStepIndex()).setSelected(false);
                                        StepHandlerViewModel stepHandlerViewModel51 = this.mViewModel;
                                        if (stepHandlerViewModel51 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        ArrayList<IDNowStep> idNowSteps25 = stepHandlerViewModel51.getIdNowSteps();
                                        if (idNowSteps25 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        StepHandlerViewModel stepHandlerViewModel52 = this.mViewModel;
                                        if (stepHandlerViewModel52 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        idNowSteps25.get(stepHandlerViewModel52.getCurrentStepIndex()).setError(true);
                                        updateStepList();
                                        IDDialog.showDialog(getSupportFragmentManager(), this, this, "Error en el sistema", "Intente nuevamente.", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.onActivityResult.1
                                            ViewOnClickListenerC13041() {
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Callback.onClick_enter(view);
                                                try {
                                                    StepHandlerActivity.this.checkMaxAttemptsDay();
                                                } finally {
                                                    Callback.onClick_exit();
                                                }
                                            }
                                        });
                                        return;
                                    case IDStepResponseCodes.STEP_RESULT_DOCUMENT_QUALITY_FAIL /* 170051 */:
                                        StepHandlerViewModel stepHandlerViewModel53 = this.mViewModel;
                                        if (stepHandlerViewModel53 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        ArrayList<IDNowStep> idNowSteps26 = stepHandlerViewModel53.getIdNowSteps();
                                        if (idNowSteps26 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        StepHandlerViewModel stepHandlerViewModel54 = this.mViewModel;
                                        if (stepHandlerViewModel54 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        idNowSteps26.get(stepHandlerViewModel54.getCurrentStepIndex()).setSuccess(false);
                                        StepHandlerViewModel stepHandlerViewModel55 = this.mViewModel;
                                        if (stepHandlerViewModel55 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        ArrayList<IDNowStep> idNowSteps27 = stepHandlerViewModel55.getIdNowSteps();
                                        if (idNowSteps27 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        StepHandlerViewModel stepHandlerViewModel56 = this.mViewModel;
                                        if (stepHandlerViewModel56 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        idNowSteps27.get(stepHandlerViewModel56.getCurrentStepIndex()).setSelected(false);
                                        StepHandlerViewModel stepHandlerViewModel57 = this.mViewModel;
                                        if (stepHandlerViewModel57 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        ArrayList<IDNowStep> idNowSteps28 = stepHandlerViewModel57.getIdNowSteps();
                                        if (idNowSteps28 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        StepHandlerViewModel stepHandlerViewModel58 = this.mViewModel;
                                        if (stepHandlerViewModel58 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        idNowSteps28.get(stepHandlerViewModel58.getCurrentStepIndex()).setError(true);
                                        updateStepList();
                                        IDDialog.showDialog(getSupportFragmentManager(), this, this, "", "No se ha capturado toda la información de su documento.\nIntente nuevamente.", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.onActivityResult.6
                                            AnonymousClass6() {
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Callback.onClick_enter(view);
                                                try {
                                                    StepHandlerActivity.this.checkMaxAttemptsDay();
                                                } finally {
                                                    Callback.onClick_exit();
                                                }
                                            }
                                        });
                                        return;
                                    case IDStepResponseCodes.STEP_RESULT_DOCUMENT_NOT_MATCH /* 170052 */:
                                        StepHandlerViewModel stepHandlerViewModel59 = this.mViewModel;
                                        if (stepHandlerViewModel59 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        ArrayList<IDNowStep> idNowSteps29 = stepHandlerViewModel59.getIdNowSteps();
                                        if (idNowSteps29 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        StepHandlerViewModel stepHandlerViewModel60 = this.mViewModel;
                                        if (stepHandlerViewModel60 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        idNowSteps29.get(stepHandlerViewModel60.getCurrentStepIndex()).setSuccess(false);
                                        StepHandlerViewModel stepHandlerViewModel61 = this.mViewModel;
                                        if (stepHandlerViewModel61 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        ArrayList<IDNowStep> idNowSteps30 = stepHandlerViewModel61.getIdNowSteps();
                                        if (idNowSteps30 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        StepHandlerViewModel stepHandlerViewModel62 = this.mViewModel;
                                        if (stepHandlerViewModel62 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        idNowSteps30.get(stepHandlerViewModel62.getCurrentStepIndex()).setSelected(false);
                                        StepHandlerViewModel stepHandlerViewModel63 = this.mViewModel;
                                        if (stepHandlerViewModel63 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        ArrayList<IDNowStep> idNowSteps31 = stepHandlerViewModel63.getIdNowSteps();
                                        if (idNowSteps31 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        StepHandlerViewModel stepHandlerViewModel64 = this.mViewModel;
                                        if (stepHandlerViewModel64 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        idNowSteps31.get(stepHandlerViewModel64.getCurrentStepIndex()).setError(true);
                                        updateStepList();
                                        IDDialog.showDialog(getSupportFragmentManager(), this, this, "Sus datos no coinciden", "Recuerde que el número de cédula\nque ingresó debe corresponder al de\nla foto de su cédula de ciudadania.\nIntente nuevamente.", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.onActivityResult.4
                                            AnonymousClass4() {
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Callback.onClick_enter(view);
                                                try {
                                                    StepHandlerActivity.this.checkMaxAttemptsDay();
                                                } finally {
                                                    Callback.onClick_exit();
                                                }
                                            }
                                        });
                                        return;
                                    case IDStepResponseCodes.STEP_RESULT_DOCUMENT_INTEGRITY_FAIL /* 170053 */:
                                        StepHandlerViewModel stepHandlerViewModel65 = this.mViewModel;
                                        if (stepHandlerViewModel65 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        ArrayList<IDNowStep> idNowSteps32 = stepHandlerViewModel65.getIdNowSteps();
                                        if (idNowSteps32 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        StepHandlerViewModel stepHandlerViewModel66 = this.mViewModel;
                                        if (stepHandlerViewModel66 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        idNowSteps32.get(stepHandlerViewModel66.getCurrentStepIndex()).setSuccess(false);
                                        StepHandlerViewModel stepHandlerViewModel67 = this.mViewModel;
                                        if (stepHandlerViewModel67 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        ArrayList<IDNowStep> idNowSteps33 = stepHandlerViewModel67.getIdNowSteps();
                                        if (idNowSteps33 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        StepHandlerViewModel stepHandlerViewModel68 = this.mViewModel;
                                        if (stepHandlerViewModel68 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        idNowSteps33.get(stepHandlerViewModel68.getCurrentStepIndex()).setSelected(false);
                                        StepHandlerViewModel stepHandlerViewModel69 = this.mViewModel;
                                        if (stepHandlerViewModel69 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        ArrayList<IDNowStep> idNowSteps34 = stepHandlerViewModel69.getIdNowSteps();
                                        if (idNowSteps34 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        StepHandlerViewModel stepHandlerViewModel70 = this.mViewModel;
                                        if (stepHandlerViewModel70 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                        }
                                        idNowSteps34.get(stepHandlerViewModel70.getCurrentStepIndex()).setError(true);
                                        updateStepList();
                                        IDDialog.showDialog(getSupportFragmentManager(), this, this, "", "No se ha capturado toda la\ninformación de su documento.\nIntente nuevamente.", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.onActivityResult.5
                                            AnonymousClass5() {
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Callback.onClick_enter(view);
                                                try {
                                                    StepHandlerActivity.this.checkMaxAttemptsDay();
                                                } finally {
                                                    Callback.onClick_exit();
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        setResult(170054, new Intent());
                                        finish();
                                        return;
                                }
                        }
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
            androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.hide();
            }
            setContentView(R.layout.activity_step_handler);
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
            View viewFindViewById4 = findViewById(R.id.layoutScrollViewContainer);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById4, "findViewById(R.id.layoutScrollViewContainer)");
            this.layoutScrollViewContainer = (LinearLayout) viewFindViewById4;
            ViewModel viewModel = ViewModelProviders.of(this).get((Class<ViewModel>) StepHandlerViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(th…lerViewModel::class.java)");
            StepHandlerViewModel stepHandlerViewModel = (StepHandlerViewModel) viewModel;
            this.mViewModel = stepHandlerViewModel;
            if (stepHandlerViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            if (stepHandlerViewModel.getOnboardingData() == null) {
                StepHandlerViewModel stepHandlerViewModel2 = this.mViewModel;
                if (stepHandlerViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                Serializable serializableExtra = getIntent().getSerializableExtra("onboardingdata");
                if (serializableExtra == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ticnow.sdk.idnowonboarding.model.data.IDNowOnboardingData");
                }
                stepHandlerViewModel2.setOnboardingData((IDNowOnboardingData) serializableExtra);
            }
            StepHandlerViewModel stepHandlerViewModel3 = this.mViewModel;
            if (stepHandlerViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            if (stepHandlerViewModel3.getStepNames() == null) {
                StepHandlerViewModel stepHandlerViewModel4 = this.mViewModel;
                if (stepHandlerViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                IDStepProcessor.Companion companion = IDStepProcessor.Companion;
                StepHandlerViewModel stepHandlerViewModel5 = this.mViewModel;
                if (stepHandlerViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                IDNowOnboardingData onboardingData = stepHandlerViewModel5.getOnboardingData();
                if (onboardingData == null) {
                    Intrinsics.throwNpe();
                }
                EnrollPath enrollPath = onboardingData.enrollDefinition;
                Intrinsics.checkExpressionValueIsNotNull(enrollPath, "mViewModel.onboardingData!!.enrollDefinition");
                stepHandlerViewModel4.setStepNames(companion.generateStepDataLabels(enrollPath));
            }
            StepHandlerViewModel stepHandlerViewModel6 = this.mViewModel;
            if (stepHandlerViewModel6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            if (stepHandlerViewModel6.getIdNowSteps() == null) {
                StepHandlerViewModel stepHandlerViewModel7 = this.mViewModel;
                if (stepHandlerViewModel7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                IDStepProcessor.Companion companion2 = IDStepProcessor.Companion;
                StepHandlerViewModel stepHandlerViewModel8 = this.mViewModel;
                if (stepHandlerViewModel8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                IDNowOnboardingData onboardingData2 = stepHandlerViewModel8.getOnboardingData();
                if (onboardingData2 == null) {
                    Intrinsics.throwNpe();
                }
                EnrollPath enrollPath2 = onboardingData2.enrollDefinition;
                Intrinsics.checkExpressionValueIsNotNull(enrollPath2, "mViewModel.onboardingData!!.enrollDefinition");
                stepHandlerViewModel7.setIdNowSteps(companion2.generateStepData(enrollPath2));
                StepHandlerViewModel stepHandlerViewModel9 = this.mViewModel;
                if (stepHandlerViewModel9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                ArrayList<IDNowStep> idNowSteps = stepHandlerViewModel9.getIdNowSteps();
                if (idNowSteps == null) {
                    Intrinsics.throwNpe();
                }
                ((IDNowStep) CollectionsKt.first((List) idNowSteps)).setSelected(true);
            }
            StepHandlerViewModel stepHandlerViewModel10 = this.mViewModel;
            if (stepHandlerViewModel10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            if (stepHandlerViewModel10.getCurrentStepIndex() == -1) {
                StepHandlerViewModel stepHandlerViewModel11 = this.mViewModel;
                if (stepHandlerViewModel11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                stepHandlerViewModel11.setCurrentStepIndex(0);
            }
            StepHandlerViewModel stepHandlerViewModel12 = this.mViewModel;
            if (stepHandlerViewModel12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            IDNowOnboardingData onboardingData3 = stepHandlerViewModel12.getOnboardingData();
            if (onboardingData3 == null) {
                Intrinsics.throwNpe();
            }
            if (onboardingData3.configuration.uuidTransaction == null) {
                StepHandlerViewModel stepHandlerViewModel13 = this.mViewModel;
                if (stepHandlerViewModel13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                IDNowOnboardingData onboardingData4 = stepHandlerViewModel13.getOnboardingData();
                if (onboardingData4 == null) {
                    Intrinsics.throwNpe();
                }
                IDNowOnboardingConfiguration iDNowOnboardingConfiguration = onboardingData4.configuration;
                StepHandlerViewModel stepHandlerViewModel14 = this.mViewModel;
                if (stepHandlerViewModel14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                IDNowOnboardingData onboardingData5 = stepHandlerViewModel14.getOnboardingData();
                if (onboardingData5 == null) {
                    Intrinsics.throwNpe();
                }
                iDNowOnboardingConfiguration.setUuidTransaction(onboardingData5.uuidTransaction);
            }
            Button button = this.buttonContinue;
            if (button == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
            }
            button.setText("Continuar");
            Button button2 = this.buttonContinue;
            if (button2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
            }
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.onCreate.1
                ViewOnClickListenerC13071() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.onClick_enter(view);
                    try {
                        String unused = StepHandlerActivity.this.TAG;
                        StepHandlerActivity.access$getButtonContinue$p(StepHandlerActivity.this).setEnabled(false);
                        if (!StepHandlerActivity.access$getButtonContinue$p(StepHandlerActivity.this).isEnabled()) {
                            StepHandlerActivity.this.startFlow();
                        }
                    } finally {
                        Callback.onClick_exit();
                    }
                }
            });
            ImageView imageView = this.imageViewClose;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageViewClose");
            }
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.onCreate.2
                ViewOnClickListenerC13082() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.onClick_enter(view);
                    try {
                        StepHandlerActivity.this.launchCancelDialog();
                    } finally {
                        Callback.onClick_exit();
                    }
                }
            });
            ImageView imageView2 = this.imageViewBack;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageViewBack");
            }
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.onCreate.3
                ViewOnClickListenerC13093() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.onClick_enter(view);
                    try {
                        StepHandlerActivity.this.onBackPressed();
                    } finally {
                        Callback.onClick_exit();
                    }
                }
            });
            idNowCustomize();
            buildStepList();
        } catch (Exception e2) {
            String str = this.TAG;
            String str2 = "Error init " + this.TAG;
            Dialog.INSTANCE.show(getSupportFragmentManager(), this, "Error interno", "Intente nuevamente", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.onCreate.4

                /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity$onCreate$4$1 */
                @InterfaceC1492Gx
                @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
                static final class AnonymousClass1 implements Runnable {
                    AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        StepHandlerActivity.this.setResult(170008, new Intent());
                        StepHandlerActivity.this.finish();
                    }
                }

                ViewOnClickListenerC13104() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.onClick_enter(view);
                    try {
                        StepHandlerActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.stephandler.activity.StepHandlerActivity.onCreate.4.1
                            AnonymousClass1() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                StepHandlerActivity.this.setResult(170008, new Intent());
                                StepHandlerActivity.this.finish();
                            }
                        });
                    } finally {
                        Callback.onClick_exit();
                    }
                }
            });
        }
    }

    public final void simulateSuccessStep() {
        StepHandlerViewModel stepHandlerViewModel = this.mViewModel;
        if (stepHandlerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        ArrayList<IDNowStep> idNowSteps = stepHandlerViewModel.getIdNowSteps();
        if (idNowSteps == null) {
            Intrinsics.throwNpe();
        }
        StepHandlerViewModel stepHandlerViewModel2 = this.mViewModel;
        if (stepHandlerViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        idNowSteps.get(stepHandlerViewModel2.getCurrentStepIndex()).setSuccess(true);
        StepHandlerViewModel stepHandlerViewModel3 = this.mViewModel;
        if (stepHandlerViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        ArrayList<IDNowStep> idNowSteps2 = stepHandlerViewModel3.getIdNowSteps();
        if (idNowSteps2 == null) {
            Intrinsics.throwNpe();
        }
        StepHandlerViewModel stepHandlerViewModel4 = this.mViewModel;
        if (stepHandlerViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        idNowSteps2.get(stepHandlerViewModel4.getCurrentStepIndex()).setSelected(false);
        StepHandlerViewModel stepHandlerViewModel5 = this.mViewModel;
        if (stepHandlerViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        ArrayList<IDNowStep> idNowSteps3 = stepHandlerViewModel5.getIdNowSteps();
        if (idNowSteps3 == null) {
            Intrinsics.throwNpe();
        }
        StepHandlerViewModel stepHandlerViewModel6 = this.mViewModel;
        if (stepHandlerViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        idNowSteps3.get(stepHandlerViewModel6.getCurrentStepIndex()).setError(false);
        StepHandlerViewModel stepHandlerViewModel7 = this.mViewModel;
        if (stepHandlerViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        stepHandlerViewModel7.setCurrentStepIndex(stepHandlerViewModel7.getCurrentStepIndex() + 1);
        StepHandlerViewModel stepHandlerViewModel8 = this.mViewModel;
        if (stepHandlerViewModel8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        ArrayList<IDNowStep> idNowSteps4 = stepHandlerViewModel8.getIdNowSteps();
        if (idNowSteps4 == null) {
            Intrinsics.throwNpe();
        }
        StepHandlerViewModel stepHandlerViewModel9 = this.mViewModel;
        if (stepHandlerViewModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        idNowSteps4.get(stepHandlerViewModel9.getCurrentStepIndex()).setSelected(true);
        updateStepList();
    }
}
