package com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.registerPhone.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import com.biocatch.client.android.sdk.core.Constants;
import com.dynatrace.android.callback.OkCallback;
import com.google.gson.Gson;
import com.ticnow.sdk.idnowonboarding.R;
import com.ticnow.sdk.idnowonboarding.connectivity.IDConnectivity;
import com.ticnow.sdk.idnowonboarding.dialog.Dialog;
import com.ticnow.sdk.idnowonboarding.dialog.ProgressDialog;
import com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity;
import com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration;
import com.ticnow.sdk.idnowonboarding.model.customization.IdNowSdkCustomization;
import com.ticnow.sdk.idnowonboarding.model.http.IDRegisterPhoneRequest;
import com.ticnow.sdk.idnowonboarding.onboarding.SharedPreference;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApiImpl;
import com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import com.ticnow.sdk.idnowsecurity.http.request.CommonParamsRequest;
import com.ticnow.sdk.idnowsecurity.http.request.CommonUserDataRequest;
import com.ticnow.sdk.idnowsecurity.http.response.IdNowCommonResponse;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.GlobalScope;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"ЯP\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјnjO0LeN.ZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001j:I]xc\u001a\u00172XoG3SqSʠ~\u0016f\u0005N1Z7\u001bE\u0004ʀ.H\u001evCOY\u001e*0n\u0004jV\u001ba\u001d\u001a@\b\u0007$\u000f3tg|I\u0011xkPG#1|rR5vH|{\u000f\u000fX5%\u000faL>\t=C.=S1\u001a\u0019[\b\u0007M\fU\u0005\u0017:o1W\u000fo6\u0007\u0013Z)s_\u001by\u000b&\u000b\u0018\u0002f\u001aDCQyJ~,n\nC\u0002\u001b[\u001c\u000e4:\u000f.u\u001et(&3#\u0006$L^\u0003vB.|8تYӾ\u000433ݍkr_dS\u0019|;R˟9̷'\u0001vď,`\u001ce-\u001b\u0003}(Ļ}͘AHVˣ*I{\u000b\tb00Z΅sĬ3{\u0019фg1EcQ#OtX҉pϼz\u0005hå$u`RX\"\u001d!\u000eѪ5ɔ^Dlʍ<\\bdD\u0011{)+\u0378\u007fݔ\u0017 dɼ\r-3\u001efO\u0017xAܗ\nܦ)/nŽ*zy\u001eo9\rD\fȤ\u0010ߧeR~ܝ͜@\u0005"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wWL8u0+\u0014lj;\u0015r,Y\u0005pTLP0jarJ~\u0015d\u0017Nt\t\u0003hE5rSKht,K\u0006Iw\u0001\u0019\u0001\u0011?sp\u001eT\u001fK\u000b\u0019\u0005U~", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0002)Fm#/IA;y}\r\u0019fjC\u0019?*]z8K[b\u0002", "u(E", "\"@6", "", "0tcAb5\u001c]\"\u000e~g<|", "\u001a`]1e6BRb\u0011~].|\u0018xB\u00107\u000bJ\nl", "7lP4X\u001dBS+[v\\2", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "7lP4X\u001dBS+\\\u0002h:|", "=mQ<T9=W\"\u0001Xh5}\r1u\r$\u000bD\u000b ", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKMDl8 ^L@\"\u0011u\u0016Ws1CYM0eTPG\u001d\u0013^\u0010^8\t\u0014]K-D", ">g^;X\u0010G^)\u000e", "\u001a`]1e6BRb\u0011~].|\u0018xE~,\u000b/\u0001*&\u001d", ">q^4e,Law\u0003ve6~", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#|$3t 0\u0017.Hu6+\u0015vo\u0018\u000b_3Xx|", "AgP?X+", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\b)4w\u0012;LGDm}\f\u0018dn9\u0006N9Nw'TLW*\\(", "AsT=C(KO!\r", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005K=+\u001foh$\u0003r/$", "1`[9", "", ">nbA56=g", "1`[989K]&", "1`[9F<<Q\u0019\r\t", "8r^;E,L^#\b\t^", "1`[9H5Lc\u0017|zl:}\u00196", "1n]@b3BR\u0015\u000ezL;|\u0014", "2hb:\\:L>&\t|k,\u000b\u0017\u000ei{/\u0006B", "=m1.V2)`\u0019\r\t^+", "=m2?X(MS", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "Ag^DA6\"\\(~\bg,\ff9n\t(yD\u0010! &s\nC\u0001'", "Ag^DC9HU&~\tl\u000b\u0001\u00056o\u0002", "\u0011n\\=T5B]\"", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class RegisterPhoneActivity extends TicnowActivity {
    public static final Companion Companion = new Companion(null);
    private static final MediaType mediaType = MediaType.Companion.get("application/json; charset=utf-8");
    private HashMap _$_findViewCache;
    private Button buttonContinue;
    private ImageView imageViewBack;
    private ImageView imageViewClose;
    private IDNowOnboardingConfiguration onboardingConfiguration;
    private EditText phoneInput;
    private SharedPreference shared;
    private EnrollPath stepParams;
    private final String TAG = "RegisterPhoneActivity";
    private final ProgressDialog progressDialog = new ProgressDialog();

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wWL8u0+\u0014lj;\u0015r,Y\u0005pTLP0jarJ~\u0015d\u0017Nt\t\u0003hE5rSKht,K\u0006Iw\u0001\u0019\u0001\u0011?sp\u001eT\u001fK\u000b\u0019\u0005UgFPajuPEOk\u007f", "", "u(E", ";dS6T\u001bR^\u0019", "\u001anZ5g;I!bfz]0xwCp\u007f}", "5dc\u001aX+BO\b\u0013\u0006^", "u(;<^/Mb$LDF,{\r+T\u00143{\u0016", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MediaType getMediaType() {
            return RegisterPhoneActivity.mediaType;
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.registerPhone.activity.RegisterPhoneActivity$call$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0010\u001d̉=!,i\bDZc|\u0004G\u0006>éFB-!T\u0012&\u0007-ʜwӧHgN/`U"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\""}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $postBody;
        Object L$0;
        int label;
        private CoroutineScope p$;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, Continuation continuation) {
            super(2, continuation);
            this.$postBody = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
            Intrinsics.checkParameterIsNotNull(completion, "completion");
            AnonymousClass1 anonymousClass1 = RegisterPhoneActivity.this.new AnonymousClass1(this.$postBody, completion);
            anonymousClass1.p$ = (CoroutineScope) obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.L$0 = this.p$;
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OkCallback.enqueue(new OkHttpClient().newCall(new Request.Builder().url("https://segurosmundial-labs.ticnow.cl/id-now-services/api/v0/mobile-hub/enrollment/commitGenericStep").addHeader("User-Agent", "OkHttp Headers.java").addHeader("Accept", "*/*").addHeader("Content-Type", Constants.WUP_CONTENT_TYPE).addHeader("API-USER", "SEGMUNDIAL-DEV").addHeader("API-KEY", "37d3de06-bdd3-418f-a8cf-5a8b79dd79db").post(RequestBody.Companion.create(this.$postBody, RegisterPhoneActivity.Companion.getMediaType())).build()), new Callback() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.registerPhone.activity.RegisterPhoneActivity.call.1.1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e2) {
                    OkCallback.onFailure_enter(call, e2);
                    try {
                        Intrinsics.checkParameterIsNotNull(call, "call");
                        Intrinsics.checkParameterIsNotNull(e2, "e");
                        e2.printStackTrace();
                        RegisterPhoneActivity.this.callError();
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
                        Response response2 = response;
                        try {
                            if (response.isSuccessful()) {
                                ResponseBody responseBodyBody = response.body();
                                if (responseBodyBody == null) {
                                    Intrinsics.throwNpe();
                                }
                                RegisterPhoneActivity.this.callSuccess(responseBodyBody.string());
                            } else {
                                RegisterPhoneActivity.this.callUnsuccessful();
                            }
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(response2, null);
                        } finally {
                        }
                    } finally {
                        OkCallback.onResponse_exit();
                    }
                }
            });
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ Button access$getButtonContinue$p(RegisterPhoneActivity registerPhoneActivity) {
        Button button = registerPhoneActivity.buttonContinue;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
        }
        return button;
    }

    public static final /* synthetic */ EditText access$getPhoneInput$p(RegisterPhoneActivity registerPhoneActivity) {
        EditText editText = registerPhoneActivity.phoneInput;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phoneInput");
        }
        return editText;
    }

    public static final /* synthetic */ SharedPreference access$getShared$p(RegisterPhoneActivity registerPhoneActivity) {
        SharedPreference sharedPreference = registerPhoneActivity.shared;
        if (sharedPreference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shared");
        }
        return sharedPreference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void consolidateStep() throws InterruptedException {
        RegisterPhoneActivity registerPhoneActivity = this;
        this.progressDialog.show(registerPhoneActivity, "Enviando");
        if (!IDConnectivity.Companion.isOnline(registerPhoneActivity)) {
            showNoInternetConnecitonDialog();
            return;
        }
        KeyValue keyValue = new KeyValue();
        keyValue.setKey("mobileNumber");
        EditText editText = this.phoneInput;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phoneInput");
        }
        keyValue.setValue(editText.getText().toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(keyValue);
        IDRegisterPhoneRequest iDRegisterPhoneRequest = new IDRegisterPhoneRequest();
        IDNowOnboardingConfiguration iDNowOnboardingConfiguration = this.onboardingConfiguration;
        if (iDNowOnboardingConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onboardingConfiguration");
        }
        CommonParamsRequest commonParamsRequest = iDNowOnboardingConfiguration.commonParams;
        Intrinsics.checkExpressionValueIsNotNull(commonParamsRequest, "onboardingConfiguration.commonParams");
        iDRegisterPhoneRequest.setCommonParamsRequest(commonParamsRequest);
        IDNowOnboardingConfiguration iDNowOnboardingConfiguration2 = this.onboardingConfiguration;
        if (iDNowOnboardingConfiguration2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onboardingConfiguration");
        }
        CommonUserDataRequest commonUserDataRequest = iDNowOnboardingConfiguration2.commonUserData;
        Intrinsics.checkExpressionValueIsNotNull(commonUserDataRequest, "onboardingConfiguration.commonUserData");
        iDRegisterPhoneRequest.setCommonUserDataRequest(commonUserDataRequest);
        EnrollPath enrollPath = this.stepParams;
        if (enrollPath == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stepParams");
        }
        iDRegisterPhoneRequest.setPathId(Integer.parseInt(enrollPath.getId()));
        iDRegisterPhoneRequest.setUuidDevice(new IDSecurityApiImpl().getDeviceUUID(registerPhoneActivity, this));
        iDRegisterPhoneRequest.setTransactionData(new ArrayList<>(arrayList));
        IDNowOnboardingConfiguration iDNowOnboardingConfiguration3 = this.onboardingConfiguration;
        if (iDNowOnboardingConfiguration3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onboardingConfiguration");
        }
        CommonUserDataRequest commonUserDataRequest2 = iDNowOnboardingConfiguration3.commonUserData;
        Intrinsics.checkExpressionValueIsNotNull(commonUserDataRequest2, "onboardingConfiguration.commonUserData");
        iDRegisterPhoneRequest.setCommonUserDataRequest(commonUserDataRequest2);
        Thread.sleep(5000L);
        String body = new Gson().toJson(iDRegisterPhoneRequest);
        Intrinsics.checkExpressionValueIsNotNull(body, "body");
        call(body);
    }

    private final void showNoInternetConnecitonDialog() {
        this.progressDialog.getDialog().dismiss();
        Dialog.INSTANCE.show(getSupportFragmentManager(), this, "Comunicación no disponible", "Intente nuevamente", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.registerPhone.activity.RegisterPhoneActivity.showNoInternetConnecitonDialog.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.dynatrace.android.callback.Callback.onClick_enter(view);
                try {
                    RegisterPhoneActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.registerPhone.activity.RegisterPhoneActivity.showNoInternetConnecitonDialog.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            RegisterPhoneActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_ABORT_FLOW, new Intent());
                            RegisterPhoneActivity.this.finish();
                        }
                    });
                } finally {
                    com.dynatrace.android.callback.Callback.onClick_exit();
                }
            }
        });
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

    public final void call(String postBody) {
        Intrinsics.checkParameterIsNotNull(postBody, "postBody");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(postBody, null), 3, null);
    }

    public final void callError() {
        setResult(IDStepResponseCodes.STEP_RESULT_FAIL, new Intent());
        dismissProgressDialog();
        finish();
    }

    public final void callSuccess(String jsonResponse) {
        Intrinsics.checkParameterIsNotNull(jsonResponse, "jsonResponse");
        if (Intrinsics.areEqual(((IdNowCommonResponse) new Gson().fromJson(jsonResponse, IdNowCommonResponse.class)).getCode(), "00")) {
            Intent intent = new Intent();
            intent.putExtra("additionalParams", "");
            setResult(IDStepResponseCodes.STEP_RESULT_OK, intent);
            finish();
        } else {
            setResult(IDStepResponseCodes.STEP_RESULT_FAIL, new Intent());
            finish();
        }
        dismissProgressDialog();
    }

    public final void callUnsuccessful() {
        setResult(IDStepResponseCodes.STEP_RESULT_FAIL, new Intent());
        dismissProgressDialog();
        finish();
    }

    public final void dismissProgressDialog() {
        runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.registerPhone.activity.RegisterPhoneActivity.dismissProgressDialog.1
            @Override // java.lang.Runnable
            public final void run() {
                RegisterPhoneActivity.this.progressDialog.getDialog().dismiss();
            }
        });
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strOd = C1561oA.od("n[!^B", (short) (OY.Xd() ^ ((522034080 ^ 2057697891) ^ 1706580303)));
            short sXd = (short) (C1499aX.Xd() ^ (1442745170 ^ (-1442756463)));
            int[] iArr = new int["D3".length()];
            QB qb = new QB("D3");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls = Class.forName(strOd);
                Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                short sXd2 = (short) (C1633zX.Xd() ^ (1894995229 ^ (-1894987325)));
                short sXd3 = (short) (C1633zX.Xd() ^ (592173263 ^ (-592156748)));
                int[] iArr2 = new int["Vz\u001b\u0014N".length()];
                QB qb2 = new QB("Vz\u001b\u0014N");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                    i3++;
                }
                String str2 = new String(iArr2, 0, i3);
                String strXd = C1561oA.Xd("(\u0016", (short) (C1633zX.Xd() ^ (1019230270 ^ (-1019224506))));
                try {
                    Class<?> cls2 = Class.forName(str2);
                    Field field2 = 0 != 0 ? cls2.getField(strXd) : cls2.getDeclaredField(strXd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strVd = Wg.vd("*\u0017\\\u001a\u0006", (short) (Od.Xd() ^ (1075128030 ^ (-1075134657))));
                    short sXd4 = (short) (C1633zX.Xd() ^ (1648094871 ^ (-1648080183)));
                    short sXd5 = (short) (C1633zX.Xd() ^ (1824012410 ^ (-1824020776)));
                    int[] iArr3 = new int["NB".length()];
                    QB qb3 = new QB("NB");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(((sXd4 + i4) + xuXd3.CK(iKK3)) - sXd5);
                        i4++;
                    }
                    String str3 = new String(iArr3, 0, i4);
                    try {
                        Class<?> cls3 = Class.forName(strVd);
                        Field field3 = 0 != 0 ? cls3.getField(str3) : cls3.getDeclaredField(str3);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(hg.Vd(")\u0016[%\u0005", (short) (Od.Xd() ^ (1562037319 ^ (-1562043974))), (short) (Od.Xd() ^ ((645400208 ^ 21051405) ^ (-658051119))))).getDeclaredMethod(C1561oA.ud("\u000f\u001a", (short) (ZN.Xd() ^ ((1236571468 ^ 1195832446) ^ 250748161))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1561oA.yd(">/3(:A", (short) (C1607wl.Xd() ^ ((122142595 ^ 1495961532) ^ 1584217710)))};
                                Method method = Class.forName(C1561oA.Yd("\u001b) /-($n%229+5<v\r::A3GD", (short) (C1607wl.Xd() ^ ((496772890 ^ 1769138537) ^ 1961798016)))).getMethod(Jg.Wd("rwwLb@2\u0019\u0011~\u000e\u0014\u0005_FA", (short) (C1607wl.Xd() ^ ((186713005 ^ 1001728363) ^ 815010344)), (short) (C1607wl.Xd() ^ (166244180 ^ 166251744))), Class.forName(Xg.qd("\u001f\u0017-\u0019f&\u001c*$k\u001243+1+", (short) (C1607wl.Xd() ^ ((1961804699 ^ 948051821) ^ 1282183863)), (short) (C1607wl.Xd() ^ ((993121477 ^ 1478212647) ^ 1663714459)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strXd2 = ZO.xd("zERv\u0014", (short) (C1607wl.Xd() ^ (668988248 ^ 668970592)), (short) (C1607wl.Xd() ^ ((797808150 ^ 1809302707) ^ 1146760281)));
                                    short sXd6 = (short) (C1580rY.Xd() ^ ((586445436 ^ 1577406654) ^ (-2096177666)));
                                    short sXd7 = (short) (C1580rY.Xd() ^ (359145925 ^ (-359164083)));
                                    int[] iArr4 = new int["a_".length()];
                                    QB qb4 = new QB("a_");
                                    int i5 = 0;
                                    while (qb4.YK()) {
                                        int iKK4 = qb4.KK();
                                        Xu xuXd4 = Xu.Xd(iKK4);
                                        iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + (i5 * sXd7))) + xuXd4.CK(iKK4));
                                        i5++;
                                    }
                                    String str4 = new String(iArr4, 0, i5);
                                    try {
                                        Class<?> cls4 = Class.forName(strXd2);
                                        Field field4 = 0 != 0 ? cls4.getField(str4) : cls4.getDeclaredField(str4);
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
                    String strWd = Ig.wd("l\u0015\bc\u001e", (short) (ZN.Xd() ^ ((1727149572 ^ 1481014988) ^ 1051993705)));
                    String strOd2 = EO.Od("$@", (short) (C1499aX.Xd() ^ (374562046 ^ (-374553354))));
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
                        String strQd = C1561oA.Qd("\u0017\u0004I\u0007j", (short) (OY.Xd() ^ ((38900124 ^ 700961348) ^ 731278008)));
                        String strZd = C1593ug.zd("mc", (short) (C1499aX.Xd() ^ (789208315 ^ (-789189821))), (short) (C1499aX.Xd() ^ (1939607660 ^ (-1939621784))));
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
                        int i6 = (1080938760 ^ 122713778) ^ 1195223025;
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

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(IDStepResponseCodes.STEP_RESULT_CANCELED, new Intent());
        finish();
    }

    @Override // com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(8192, 8192);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        setContentView(R.layout.activity_register_phone);
        setRequestedOrientation(1);
        Serializable serializableExtra = getIntent().getSerializableExtra("configuration");
        if (serializableExtra == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration");
        }
        this.onboardingConfiguration = (IDNowOnboardingConfiguration) serializableExtra;
        Serializable serializableExtra2 = getIntent().getSerializableExtra("stepparams");
        if (serializableExtra2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath");
        }
        this.stepParams = (EnrollPath) serializableExtra2;
        View viewFindViewById = findViewById(R.id.imageViewBack);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById, "findViewById(R.id.imageViewBack)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.imageViewBack = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageViewBack");
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.registerPhone.activity.RegisterPhoneActivity.onCreate.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.dynatrace.android.callback.Callback.onClick_enter(view);
                try {
                    RegisterPhoneActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_CANCELED, new Intent());
                    RegisterPhoneActivity.this.finish();
                } finally {
                    com.dynatrace.android.callback.Callback.onClick_exit();
                }
            }
        });
        View viewFindViewById2 = findViewById(R.id.imageViewClose);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById2, "findViewById(R.id.imageViewClose)");
        ImageView imageView2 = (ImageView) viewFindViewById2;
        this.imageViewClose = imageView2;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageViewClose");
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.registerPhone.activity.RegisterPhoneActivity.onCreate.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.dynatrace.android.callback.Callback.onClick_enter(view);
                try {
                    Dialog.INSTANCE.show(RegisterPhoneActivity.this.getSupportFragmentManager(), RegisterPhoneActivity.this, "", "¿Desea cerrar sesión?", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.registerPhone.activity.RegisterPhoneActivity.onCreate.2.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            com.dynatrace.android.callback.Callback.onClick_enter(view2);
                            try {
                                RegisterPhoneActivity.access$getShared$p(RegisterPhoneActivity.this).save("permission", false);
                                RegisterPhoneActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_USER_CANCELLED_ONBOARDING, new Intent());
                                RegisterPhoneActivity.this.finish();
                            } finally {
                                com.dynatrace.android.callback.Callback.onClick_exit();
                            }
                        }
                    }, "Cancelar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.registerPhone.activity.RegisterPhoneActivity.onCreate.2.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            com.dynatrace.android.callback.Callback.onClick_enter(view2);
                            try {
                            } finally {
                                com.dynatrace.android.callback.Callback.onClick_exit();
                            }
                        }
                    }, new DialogInterface.OnDismissListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.registerPhone.activity.RegisterPhoneActivity.onCreate.2.3
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                        }
                    });
                } finally {
                    com.dynatrace.android.callback.Callback.onClick_exit();
                }
            }
        });
        View viewFindViewById3 = findViewById(R.id.editTextPhone);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById3, "findViewById(R.id.editTextPhone)");
        EditText editText = (EditText) viewFindViewById3;
        this.phoneInput = editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phoneInput");
        }
        editText.addTextChangedListener(new TextWatcher() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.registerPhone.activity.RegisterPhoneActivity.onCreate.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                if (RegisterPhoneActivity.access$getPhoneInput$p(RegisterPhoneActivity.this).length() > 5) {
                    RegisterPhoneActivity.access$getButtonContinue$p(RegisterPhoneActivity.this).setClickable(true);
                    RegisterPhoneActivity.access$getButtonContinue$p(RegisterPhoneActivity.this).getBackground().setTint(Color.parseColor(new IdNowSdkCustomization().getSurface().getButton().getBackgroundColorEnabled()));
                    RegisterPhoneActivity.access$getButtonContinue$p(RegisterPhoneActivity.this).setTextColor(Color.parseColor(new IdNowSdkCustomization().getSurface().getButton().getTextColorEnabled()));
                } else {
                    RegisterPhoneActivity.access$getButtonContinue$p(RegisterPhoneActivity.this).setClickable(false);
                    RegisterPhoneActivity.access$getButtonContinue$p(RegisterPhoneActivity.this).getBackground().setTint(Color.parseColor(new IdNowSdkCustomization().getSurface().getButton().getBackgroundColorDisabled()));
                    RegisterPhoneActivity.access$getButtonContinue$p(RegisterPhoneActivity.this).setTextColor(Color.parseColor(new IdNowSdkCustomization().getSurface().getButton().getTextColorDisabled()));
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        View viewFindViewById4 = findViewById(R.id.buttonContinue);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById4, "findViewById(R.id.buttonContinue)");
        Button button = (Button) viewFindViewById4;
        this.buttonContinue = button;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.registerPhone.activity.RegisterPhoneActivity.onCreate.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.dynatrace.android.callback.Callback.onClick_enter(view);
                try {
                    RegisterPhoneActivity.this.consolidateStep();
                } finally {
                    com.dynatrace.android.callback.Callback.onClick_exit();
                }
            }
        });
        Button button2 = this.buttonContinue;
        if (button2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
        }
        button2.setClickable(false);
        Button button3 = this.buttonContinue;
        if (button3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
        }
        button3.getBackground().setTint(Color.parseColor(new IdNowSdkCustomization().getSurface().getButton().getBackgroundColorDisabled()));
        Button button4 = this.buttonContinue;
        if (button4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
        }
        button4.setTextColor(Color.parseColor(new IdNowSdkCustomization().getSurface().getButton().getTextColorDisabled()));
    }

    public final void showProgressDialog() {
        runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.registerPhone.activity.RegisterPhoneActivity.showProgressDialog.1
            @Override // java.lang.Runnable
            public final void run() {
                RegisterPhoneActivity.this.progressDialog.show(RegisterPhoneActivity.this, "Enviando");
            }
        });
    }
}
