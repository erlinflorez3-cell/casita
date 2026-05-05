package com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.fragment.app.FragmentManager;
import com.dynatrace.android.callback.OkCallback;
import com.facetec.sdk.FaceTecSDK;
import com.facetec.sdk.FaceTecSDKStatus;
import com.facetec.sdk.FaceTecSessionActivity;
import com.facetec.sdk.FaceTecSessionResult;
import com.facetec.sdk.FaceTecSessionStatus;
import com.ticnow.sdk.idnowonboarding.R;
import com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker;
import com.ticnow.sdk.idnowonboarding.dialog.Dialog;
import com.ticnow.sdk.idnowonboarding.dialog.IDDialog;
import com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity;
import com.ticnow.sdk.idnowonboarding.model.api.IDReintentServicesImpl;
import com.ticnow.sdk.idnowonboarding.model.api.IDStepServicesImpl;
import com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration;
import com.ticnow.sdk.idnowonboarding.model.http.IDMatchFaceRequest;
import com.ticnow.sdk.idnowonboarding.services.reintents.IDReintentServices;
import com.ticnow.sdk.idnowonboarding.services.reintents.reintentsCallbacks.UpdateEnrollmentReintenNewsCallback;
import com.ticnow.sdk.idnowonboarding.services.steps.matchFace.MatchFace;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors.LivenessCheckProcessor;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors.NetworkingHelpers;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors.Processor;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.utils.IDFaceFile;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApiImpl;
import com.ticnow.sdk.idnowsecurity.http.codes.IDEnrollmentResponseCodes;
import com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import com.ticnow.sdk.idnowsecurity.http.request.CommonParamsRequest;
import com.ticnow.sdk.idnowsecurity.http.request.CommonUserDataRequest;
import com.ticnow.sdk.idnowsecurity.http.response.IdNowCommonResponse;
import defpackage.ThemeHelpers;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
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
@Metadata(bv = {1, 0, 3}, d1 = {"ЯX\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176B\u0005\"4\u0012\u000e\u0007nʑA0RkP\u008cZS@\u000fsڔ<$i$yCAV\"}8\tWNmmvJp\u000bK\u000f\f\u0016\u0001jBI]xc\u0015\u00172XoG3coE9vt>\u0005&28\u0600\u0018)1\u001aXGHu\u001f\u0004Në\u00160Np\u0003X\u001bW\u001d\u001a@\u0011\u0005 I$jsf6vw$:w1\u0011vZNUj`\u0001[\u001b^TU\u001c=af9NGM\u0015S^3\u000b`lW\u0003ms\u0004\u00051-5=as\u0006A\u001f\u0001\\\u001b9b%]!1#\u0005\u001a\u0001\u001a;CO\u0012V\u0001\u00126\r\u0013{;C4\u0012\u0014=`.[!\u0017\u000e\u001cJ\rti?~\u001a%TH\u000boO/%.>[?)\u0001icQ\u0018|RB\u0017U$1\u001d\u0007!\n_T`]!b\u0015i1\u007fK\u0004H\u00172g[\u0006\u0004\u001fm2.\u0012O_\u007f]}AF%EOoI%1k0jZf%&IpckbHnD\u0005\u0015\u0016MY\u0018hE|\u0005\u001aR+ГXҭQ\u001c\\͵N\u0016!#tyR S\u0012%лtȬnMe܃u;t;qn\u001a\u0013.ޭ\u000bۋ9Qk߄2^\u0005\u001aW<\u0011\f/٫Nΐ\u0010Zd̥r>Vr(w*M%ۿ?\u0558Cq$عϢ5>"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wWL8u0+\u0014lj;\u0015r,Y\u0005pHHL,&NpL\u0018#^\u001dbtp\u0004A=3lG\u0018\u001b\u0006,%\u007fJl\u0012\u0010%\"\u000b", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0002)Fm#/IA;y}\r\u0019fjC\u0019?*]z8K[b\u0002", "u(E", "4`R2<4:U\u0019ivm/", "", "4`R2G,<A\u0019\r\tb6\u0006w9k\u007f1", "=mQ<T9=W\"\u0001Xh5}\r1u\r$\u000bD\u000b ", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKMDl8 ^L@\"\u0011u\u0016Ws1CYM0eTPG\u001d\u0013^\u0010^8\t\u0014]K-D", "Ad[3\\,\u001ab(~\u0003i;\u000b", "", "AsT=C(KO!\r", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005K=+\u001foh$\u0003r/$", "1gT0^\r:Q\u0019mz\\\u001a[n\u001dt{7\fN", "", "5dc\u0013T*>B\u0019|h=\u0012j\t=s\u00042\u0005/\u000b\u001d\u0017P", "6`]1_,,c\u0017|zl:}\u00196S\u007f6\nD\u000b ", "4`R2G,<A\u0019\r\tb6\u0006u/s\u0010/\u000b", "\u001ab^:\"-:Q\u0019\u000ez\\u\u000b\b5/`$y@o\u0017\u00155o\u001cJz/>F}.Gt%\u0004", "6`]1_,.\\'\u000fx\\,\u000b\u00170u\u0007\u0016{N\u000f\u001b!P", "3qa<e\nHR\u0019", "7mXA9(<S\b~xL\u000bb", ":`d;V/\u001fO\u0017~i^*jg\u0015", "=m00g0OW(\u0013g^:\r\u0010>", "@d`BX:M1#}z", "@dbB_;\u001c]\u0018~", "2`c.", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "=m2?X(MS", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "Ag^D9(BZ\u0019}Vm;|\u0011:t^,wG\u000b\u0019", "Ag^D:,GS&z\u0002>9\n\u0013<D\u0004$\u0003J\u0003", "AsT=E,Lc \u000e", "@dbB_;", "/cS6g0H\\\u0015\u0006g^:\b\u00138s\u007f\u0004\u000bO\u000e%", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "\u0011n\\=T5B]\"", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IdMatchFaceActivity extends TicnowActivity {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "MatchFaceActivity";
    private HashMap _$_findViewCache;
    private String faceImagePath;
    private String faceTecSessionToken;
    private IDNowOnboardingConfiguration onboardingConfiguration;
    private int selfieAttempts;
    private EnrollPath stepParams;

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wWL8u0+\u0014lj;\u0015r,Y\u0005pHHL,&NpL\u0018#^\u001dbtp\u0004A=3lG\u0018\u001b\u0006,%\u007fJl\u0012\u0010%\"sHzJa\fP}\u001f~\u0017", "", "u(E", "\"@6", "", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FaceTecSessionStatus.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY.ordinal()] = 1;
            iArr[FaceTecSessionStatus.CONTEXT_SWITCH.ordinal()] = 2;
            iArr[FaceTecSessionStatus.SESSION_UNSUCCESSFUL.ordinal()] = 3;
            iArr[FaceTecSessionStatus.TIMEOUT.ordinal()] = 4;
            iArr[FaceTecSessionStatus.LOCKED_OUT.ordinal()] = 5;
            iArr[FaceTecSessionStatus.USER_CANCELLED.ordinal()] = 6;
            iArr[FaceTecSessionStatus.USER_CANCELLED_VIA_CLICKABLE_READY_SCREEN_SUBTEXT.ordinal()] = 7;
            iArr[FaceTecSessionStatus.USER_CANCELLED_VIA_HARDWARE_BUTTON.ordinal()] = 8;
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchFaceActivity$handleUnsuccessfulSession$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class RunnableC12851 implements Runnable {
        final /* synthetic */ String $errorCode;

        RunnableC12851(String str) {
            this.$errorCode = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
            IDReintentServicesImpl iDReintentServicesImpl = new IDReintentServicesImpl();
            IdMatchFaceActivity idMatchFaceActivity = IdMatchFaceActivity.this;
            CommonParamsRequest commonParamsRequest = IdMatchFaceActivity.access$getOnboardingConfiguration$p(idMatchFaceActivity).commonParams;
            Intrinsics.checkExpressionValueIsNotNull(commonParamsRequest, "onboardingConfiguration.commonParams");
            CommonUserDataRequest commonUserDataRequest = IdMatchFaceActivity.access$getOnboardingConfiguration$p(IdMatchFaceActivity.this).commonUserData;
            Intrinsics.checkExpressionValueIsNotNull(commonUserDataRequest, "onboardingConfiguration.commonUserData");
            String str = IdMatchFaceActivity.access$getOnboardingConfiguration$p(IdMatchFaceActivity.this).uuidTransaction;
            Intrinsics.checkExpressionValueIsNotNull(str, "onboardingConfiguration.uuidTransaction");
            IdMatchFaceActivity idMatchFaceActivity2 = IdMatchFaceActivity.this;
            IDReintentServicesImpl.GenerateUpdateEnrollmentReintentNewsResult generateUpdateEnrollmentReintentNewsResultGenerateUpdateEnrollmentReintenNews = iDReintentServicesImpl.generateUpdateEnrollmentReintenNews(idMatchFaceActivity, idMatchFaceActivity, commonParamsRequest, commonUserDataRequest, str, iDSecurityApiImpl.getDeviceUUID(idMatchFaceActivity2, idMatchFaceActivity2), this.$errorCode, IdMatchFaceActivity.access$getOnboardingConfiguration$p(IdMatchFaceActivity.this).additionalHeaders);
            IdMatchFaceActivity idMatchFaceActivity3 = IdMatchFaceActivity.this;
            IDReintentServices.updateEnrollmentReintenNews(idMatchFaceActivity3, idMatchFaceActivity3, new UpdateEnrollmentReintenNewsCallback() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchFaceActivity.handleUnsuccessfulSession.1.1
                @Override // com.ticnow.sdk.idnowonboarding.services.reintents.reintentsCallbacks.UpdateEnrollmentReintenNewsCallback
                public final void onUpdateEnrollmentReintenNewsResponse(IdNowCommonResponse idNowCommonResponse, IDEnrollmentResponseCodes iDEnrollmentResponseCodes) {
                    IdMatchFaceActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchFaceActivity.handleUnsuccessfulSession.1.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            IdMatchFaceActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_SELFIE_MAX_LOCAL_ATTEMPS, new Intent());
                            IdMatchFaceActivity.this.finish();
                        }
                    });
                }
            }, generateUpdateEnrollmentReintentNewsResultGenerateUpdateEnrollmentReintenNews);
        }
    }

    public static final /* synthetic */ IDNowOnboardingConfiguration access$getOnboardingConfiguration$p(IdMatchFaceActivity idMatchFaceActivity) {
        IDNowOnboardingConfiguration iDNowOnboardingConfiguration = idMatchFaceActivity.onboardingConfiguration;
        if (iDNowOnboardingConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onboardingConfiguration");
        }
        return iDNowOnboardingConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkFaceTecSDKStatus() {
        if (FaceTecSDK.getStatus(this) == FaceTecSDKStatus.INITIALIZED) {
            getFaceTecSDKSessionToken();
        } else {
            checkFaceTecSDKStatus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getFaceTecSDKSessionToken() {
        Request.Builder builder = new Request.Builder();
        IDNowOnboardingConfiguration iDNowOnboardingConfiguration = this.onboardingConfiguration;
        if (iDNowOnboardingConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onboardingConfiguration");
        }
        String str = iDNowOnboardingConfiguration.zoomLicenceKey;
        Intrinsics.checkExpressionValueIsNotNull(str, "onboardingConfiguration.zoomLicenceKey");
        Request.Builder builderHeader = builder.header("X-Device-Key", str);
        String strCreateFaceTecAPIUserAgentString = FaceTecSDK.createFaceTecAPIUserAgentString("");
        Intrinsics.checkExpressionValueIsNotNull(strCreateFaceTecAPIUserAgentString, "FaceTecSDK.createFaceTecAPIUserAgentString(\"\")");
        Request.Builder builderHeader2 = builderHeader.header("User-Agent", strCreateFaceTecAPIUserAgentString);
        StringBuilder sb = new StringBuilder();
        IDNowOnboardingConfiguration iDNowOnboardingConfiguration2 = this.onboardingConfiguration;
        if (iDNowOnboardingConfiguration2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onboardingConfiguration");
        }
        OkCallback.enqueue(NetworkingHelpers.getApiClient().newCall(builderHeader2.url(sb.append(iDNowOnboardingConfiguration2.zoomServerBaseURL).append("/session-token").toString()).get().build()), new Callback() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchFaceActivity.getFaceTecSDKSessionToken.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e2) {
                OkCallback.onFailure_enter(call, e2);
                try {
                    Intrinsics.checkParameterIsNotNull(call, "call");
                    Intrinsics.checkParameterIsNotNull(e2, "e");
                    e2.printStackTrace();
                    IOException iOException = e2;
                    IdMatchFaceActivity.this.showGeneralErrorDialog();
                } finally {
                    OkCallback.onFailure_exit();
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                OkCallback.onResponse_enter(call, response);
                try {
                    Intrinsics.checkParameterIsNotNull(call, "call");
                    Intrinsics.checkParameterIsNotNull(response, "response");
                    ResponseBody responseBodyBody = response.body();
                    if (responseBodyBody == null) {
                        Intrinsics.throwNpe();
                    }
                    String strString = responseBodyBody.string();
                    ResponseBody responseBodyBody2 = response.body();
                    if (responseBodyBody2 == null) {
                        Intrinsics.throwNpe();
                    }
                    responseBodyBody2.close();
                    try {
                        JSONObject jSONObject = new JSONObject(strString);
                        if (jSONObject.has("sessionToken")) {
                            IdMatchFaceActivity.this.faceTecSessionToken = jSONObject.getString("sessionToken");
                            IdMatchFaceActivity.this.launchFaceTecSDK();
                        } else {
                            IdMatchFaceActivity.this.faceTecSessionToken = null;
                            IdMatchFaceActivity.this.showGeneralErrorDialog();
                        }
                    } catch (JSONException e2) {
                        JSONException jSONException = e2;
                        IdMatchFaceActivity.this.faceTecSessionToken = null;
                        IdMatchFaceActivity.this.showGeneralErrorDialog();
                    }
                } finally {
                    OkCallback.onResponse_exit();
                }
            }
        });
    }

    private final void handleSuccessfulSession(FaceTecSessionResult faceTecSessionResult) throws Throwable {
        if (faceTecSessionResult.getFaceScan() == null) {
            showGeneralErrorDialog();
            return;
        }
        IdMatchFaceActivity idMatchFaceActivity = this;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, ZO.xd("|\u000e\u0018\"1\tk\\\u007f0\u001d\u001dj\u001e=6\t\u001aR\u0014\u00079", (short) (FB.Xd() ^ 16538), (short) (FB.Xd() ^ 9854)));
        new IdNowConnectionChecker(idMatchFaceActivity, supportFragmentManager).check();
        String faceScanBase64 = faceTecSessionResult.getFaceScanBase64();
        String sessionId = faceTecSessionResult.getSessionId();
        Object[] objArr = {faceTecSessionResult.getAuditTrailCompressedBase64()[0], 0};
        Method declaredMethod = Class.forName(C1626yg.Ud("i~?;\u001d\u0016t\u0006Xy\"1!/\bzI\rO", (short) (OY.Xd() ^ 17163), (short) (OY.Xd() ^ 31805))).getDeclaredMethod(EO.Od("P\u0019)Y7d", (short) (ZN.Xd() ^ 14477)), Class.forName(Ig.wd("\u00126=\rIJg|F]\t\u0004V?X0", (short) (C1580rY.Xd() ^ (-28335)))), Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
            Intrinsics.checkExpressionValueIsNotNull(bArr, C1561oA.Qd("m\f\u001d\u000e]ZS\t\t\u0006\u0011\u0005\u0005F\u007f\u0006\u0010\bz\tYw\tyIF=0Qo\u0001qA>7LLLFYOV*", (short) (ZN.Xd() ^ 11524)));
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            short sXd = (short) (C1580rY.Xd() ^ (-3455));
            short sXd2 = (short) (C1580rY.Xd() ^ (-25859));
            int[] iArr = new int["U}\n\u0004x\t_{~\u0011\r\u0011\u0019N\u0006\b\u0007\u0014\n\fi\"\u001e\u0010ꪺ\u0014YN_\\Q\u0017\u0019\u0018%\u001b\u001d\u001d\r/.&,&m4+=)m".length()];
            QB qb = new QB("U}\n\u0004x\t_{~\u0011\r\u0011\u0019N\u0006\b\u0007\u0014\n\fi\"\u001e\u0010ꪺ\u0014YN_\\Q\u0017\u0019\u0018%\u001b\u001d\u001d\r/.&,&m4+=)m");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            Intrinsics.checkExpressionValueIsNotNull(bitmapDecodeByteArray, new String(iArr, 0, i2));
            String strSaveFaceImage = IDFaceFile.saveFaceImage(bitmapDecodeByteArray);
            Intrinsics.checkExpressionValueIsNotNull(strSaveFaceImage, C1561oA.od("B<=WXY9[]U\u001daNbP0JKL/REJG\tBHRJ=K\u0003", (short) (FB.Xd() ^ 16274)));
            this.faceImagePath = strSaveFaceImage;
            String str = faceTecSessionResult.getLowQualityAuditTrailCompressedBase64()[0];
            String str2 = faceTecSessionResult.getAuditTrailCompressedBase64()[0];
            IDStepServicesImpl iDStepServicesImpl = new IDStepServicesImpl();
            IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
            IdMatchFaceActivity idMatchFaceActivity2 = this;
            IDNowOnboardingConfiguration iDNowOnboardingConfiguration = this.onboardingConfiguration;
            short sXd3 = (short) (FB.Xd() ^ 19872);
            int[] iArr2 = new int["!!\u0016$\u0017)\u001c\"(\"~,,%)(75%9/66".length()];
            QB qb2 = new QB("!!\u0016$\u0017)\u001c\"(\"~,,%)(75%9/66");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i3));
                i3++;
            }
            String str3 = new String(iArr2, 0, i3);
            if (iDNowOnboardingConfiguration == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str3);
            }
            CommonParamsRequest commonParamsRequest = iDNowOnboardingConfiguration.commonParams;
            Intrinsics.checkExpressionValueIsNotNull(commonParamsRequest, Wg.Zd("sw9[\u001b9p\u0003]e\u000f\u0001\rRj6I\u0014\u000evxL\u0011]h\u0002MT$0g\u0006\\YrN", (short) (C1607wl.Xd() ^ 24069), (short) (C1607wl.Xd() ^ 5349)));
            EnrollPath enrollPath = this.stepParams;
            if (enrollPath == null) {
                Intrinsics.throwUninitializedPropertyAccessException(C1561oA.Xd("bdVbCUgWdk", (short) (C1499aX.Xd() ^ (-23653))));
            }
            String id = enrollPath.getId();
            String deviceUUID = iDSecurityApiImpl.getDeviceUUID(idMatchFaceActivity, idMatchFaceActivity2);
            short sXd4 = (short) (C1580rY.Xd() ^ (-3784));
            int[] iArr3 = new int["WSRU:O[".length()];
            QB qb3 = new QB("WSRU:O[");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((sXd4 ^ i4) + xuXd3.CK(iKK3));
                i4++;
            }
            Intrinsics.checkExpressionValueIsNotNull(faceScanBase64, new String(iArr3, 0, i4));
            if (sessionId == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(str, Qg.kd("D@L:\u001a456", (short) (OY.Xd() ^ 27167), (short) (OY.Xd() ^ 30194)));
            Intrinsics.checkExpressionValueIsNotNull(str2, hg.Vd("tnopK~lpz", (short) (ZN.Xd() ^ 12293), (short) (ZN.Xd() ^ 17044)));
            IDNowOnboardingConfiguration iDNowOnboardingConfiguration2 = this.onboardingConfiguration;
            if (iDNowOnboardingConfiguration2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str3);
            }
            IDStepServicesImpl.GenerateMatchFaceRequestResult generateMatchFaceRequestResultGenerateMatchFaceRequest = iDStepServicesImpl.generateMatchFaceRequest(idMatchFaceActivity, idMatchFaceActivity2, commonParamsRequest, id, deviceUUID, faceScanBase64, sessionId, str, str2, iDNowOnboardingConfiguration2.additionalHeaders);
            IDMatchFaceRequest matchFaceRequest = generateMatchFaceRequestResultGenerateMatchFaceRequest.getMatchFaceRequest();
            if (matchFaceRequest == null) {
                Intrinsics.throwNpe();
            }
            ArrayList<KeyValue> headers = generateMatchFaceRequestResultGenerateMatchFaceRequest.getHeaders();
            if (headers == null) {
                Intrinsics.throwNpe();
            }
            new MatchFace(this, matchFaceRequest, idMatchFaceActivity, idMatchFaceActivity2, bitmapDecodeByteArray, headers).execute(new Void[0]);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final void handleUnsuccessfulSession(String str) {
        int i2 = this.selfieAttempts + 1;
        this.selfieAttempts = i2;
        IDNowOnboardingConfiguration iDNowOnboardingConfiguration = this.onboardingConfiguration;
        if (iDNowOnboardingConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onboardingConfiguration");
        }
        Integer num = iDNowOnboardingConfiguration.maxSelfieAttemps;
        Intrinsics.checkExpressionValueIsNotNull(num, "onboardingConfiguration.maxSelfieAttemps");
        if (Intrinsics.compare(i2, num.intValue()) <= 0) {
            runOnUiThread(new RunnableC12851(str));
        } else {
            showFailedAttemptDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initFaceTecSDK() {
        try {
            StringBuilder sb = new StringBuilder("FaceTecSDK licence:\n");
            IDNowOnboardingConfiguration iDNowOnboardingConfiguration = this.onboardingConfiguration;
            if (iDNowOnboardingConfiguration == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onboardingConfiguration");
            }
            sb.append(iDNowOnboardingConfiguration.zoomLicenceText).toString();
            StringBuilder sb2 = new StringBuilder("FaceTecSDK licence key:\n");
            IDNowOnboardingConfiguration iDNowOnboardingConfiguration2 = this.onboardingConfiguration;
            if (iDNowOnboardingConfiguration2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onboardingConfiguration");
            }
            sb2.append(iDNowOnboardingConfiguration2.zoomLicenceKey).toString();
            StringBuilder sb3 = new StringBuilder("FaceTecSDK public key:\n");
            IDNowOnboardingConfiguration iDNowOnboardingConfiguration3 = this.onboardingConfiguration;
            if (iDNowOnboardingConfiguration3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onboardingConfiguration");
            }
            sb3.append(iDNowOnboardingConfiguration3.zoomPublicKey).toString();
            IDNowOnboardingConfiguration iDNowOnboardingConfiguration4 = this.onboardingConfiguration;
            if (iDNowOnboardingConfiguration4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onboardingConfiguration");
            }
            if (iDNowOnboardingConfiguration4.customization != null) {
                ThemeHelpers.INSTANCE.setAppTheme(this);
            }
            IdMatchFaceActivity idMatchFaceActivity = this;
            IDNowOnboardingConfiguration iDNowOnboardingConfiguration5 = this.onboardingConfiguration;
            if (iDNowOnboardingConfiguration5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onboardingConfiguration");
            }
            String str = iDNowOnboardingConfiguration5.zoomLicenceText;
            IDNowOnboardingConfiguration iDNowOnboardingConfiguration6 = this.onboardingConfiguration;
            if (iDNowOnboardingConfiguration6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onboardingConfiguration");
            }
            String str2 = iDNowOnboardingConfiguration6.zoomLicenceKey;
            IDNowOnboardingConfiguration iDNowOnboardingConfiguration7 = this.onboardingConfiguration;
            if (iDNowOnboardingConfiguration7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onboardingConfiguration");
            }
            FaceTecSDK.initializeInProductionMode(idMatchFaceActivity, str, str2, iDNowOnboardingConfiguration7.zoomPublicKey, new FaceTecSDK.InitializeCallback() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchFaceActivity.initFaceTecSDK.1
                @Override // com.facetec.sdk.FaceTecSDK.InitializeCallback
                public void onCompletion(boolean z2) {
                    if (z2) {
                        IdMatchFaceActivity.this.checkFaceTecSDKStatus();
                        return;
                    }
                    String str3 = "initializing FaceTecSDK... failed " + FaceTecSDK.getStatus(IdMatchFaceActivity.this);
                    IdMatchFaceActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_FAIL, new Intent());
                    IdMatchFaceActivity.this.finish();
                }
            });
        } catch (Exception e2) {
            runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchFaceActivity.initFaceTecSDK.2
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentManager supportFragmentManager = IdMatchFaceActivity.this.getSupportFragmentManager();
                    IdMatchFaceActivity idMatchFaceActivity2 = IdMatchFaceActivity.this;
                    IDDialog.showDialog(supportFragmentManager, idMatchFaceActivity2, idMatchFaceActivity2, "Error interno", "Por favor intente nuevamente", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchFaceActivity.initFaceTecSDK.2.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            com.dynatrace.android.callback.Callback.onClick_enter(view);
                            try {
                                IdMatchFaceActivity.this.setResult(170054, new Intent());
                                IdMatchFaceActivity.this.finish();
                            } finally {
                                com.dynatrace.android.callback.Callback.onClick_exit();
                            }
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchFaceTecSDK() {
        String str = this.faceTecSessionToken;
        IdMatchFaceActivity idMatchFaceActivity = this;
        IDNowOnboardingConfiguration iDNowOnboardingConfiguration = this.onboardingConfiguration;
        if (iDNowOnboardingConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onboardingConfiguration");
        }
        new LivenessCheckProcessor(str, idMatchFaceActivity, iDNowOnboardingConfiguration, new Processor.SessionTokenErrorCallback() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchFaceActivity.launchFaceTecSDK.1
            @Override // com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors.Processor.SessionTokenErrorCallback
            public final void onError() {
                IdMatchFaceActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchFaceActivity.launchFaceTecSDK.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        IdMatchFaceActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_FAIL, new Intent());
                        IdMatchFaceActivity.this.finish();
                    }
                });
            }
        });
    }

    private final void showFailedAttemptDialog() {
        runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchFaceActivity.showFailedAttemptDialog.1
            @Override // java.lang.Runnable
            public final void run() {
                FragmentManager supportFragmentManager = IdMatchFaceActivity.this.getSupportFragmentManager();
                IdMatchFaceActivity idMatchFaceActivity = IdMatchFaceActivity.this;
                IDDialog.showDialog(supportFragmentManager, idMatchFaceActivity, idMatchFaceActivity, "", "No pudimos tomar su foto.\n Intente nuevamente.", "Reintentar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchFaceActivity.showFailedAttemptDialog.1.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.dynatrace.android.callback.Callback.onClick_enter(view);
                        try {
                            IdMatchFaceActivity.this.getFaceTecSDKSessionToken();
                        } finally {
                            com.dynatrace.android.callback.Callback.onClick_exit();
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showGeneralErrorDialog() {
        runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchFaceActivity.showGeneralErrorDialog.1
            @Override // java.lang.Runnable
            public final void run() {
                FragmentManager supportFragmentManager = IdMatchFaceActivity.this.getSupportFragmentManager();
                IdMatchFaceActivity idMatchFaceActivity = IdMatchFaceActivity.this;
                IDDialog.showDialog(supportFragmentManager, idMatchFaceActivity, idMatchFaceActivity, "Error interno", "Por favor intente nuevamente", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchFaceActivity.showGeneralErrorDialog.1.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.dynatrace.android.callback.Callback.onClick_enter(view);
                        try {
                            IdMatchFaceActivity.this.setResult(170054, new Intent());
                            IdMatchFaceActivity.this.finish();
                        } finally {
                            com.dynatrace.android.callback.Callback.onClick_exit();
                        }
                    }
                });
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

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strUd = C1561oA.ud("4!f$\b", (short) (FB.Xd() ^ (79517309 ^ 79496196)));
            String strYd = C1561oA.yd("_L", (short) (C1580rY.Xd() ^ (620665799 ^ (-620671411))));
            try {
                Class<?> cls = Class.forName(strUd);
                Field field = 0 != 0 ? cls.getField(strYd) : cls.getDeclaredField(strYd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strYd2 = C1561oA.Yd("'\u0016]\u001d\u0003", (short) (Od.Xd() ^ ((641994746 ^ 568255295) ^ (-127594323))));
                String strQd = Xg.qd("6$", (short) (Od.Xd() ^ (1512241076 ^ (-1512223772))), (short) (Od.Xd() ^ ((1258158219 ^ 947850899) ^ (-1921179198))));
                try {
                    Class<?> cls2 = Class.forName(strYd2);
                    Field field2 = 0 != 0 ? cls2.getField(strQd) : cls2.getDeclaredField(strQd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strWd = Jg.Wd("\f(\u000f|q", (short) (C1499aX.Xd() ^ ((1284450769 ^ 810843529) ^ (-2094735348))), (short) (C1499aX.Xd() ^ ((687274658 ^ 931272181) ^ (-527759737))));
                    String strXd = ZO.xd(" \u001a", (short) (C1499aX.Xd() ^ ((1817584254 ^ 1488710856) ^ (-887992926))), (short) (C1499aX.Xd() ^ ((79219248 ^ 1573958423) ^ (-1500018905))));
                    try {
                        Class<?> cls3 = Class.forName(strWd);
                        Field field3 = 0 != 0 ? cls3.getField(strXd) : cls3.getDeclaredField(strXd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(C1626yg.Ud("<\u0002\n3Y", (short) (Od.Xd() ^ ((2013793742 ^ 287561928) ^ (-1764487064))), (short) (Od.Xd() ^ ((1100944171 ^ 520799938) ^ (-1586864651))))).getDeclaredMethod(Ig.wd("Q\f", (short) (ZN.Xd() ^ (77381285 ^ 77386113))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd = (short) (FB.Xd() ^ (1256568587 ^ 1256579675));
                                int[] iArr = new int["FjQ,f3".length()];
                                QB qb = new QB("FjQ,f3");
                                int i2 = 0;
                                while (qb.YK()) {
                                    int iKK = qb.KK();
                                    Xu xuXd = Xu.Xd(iKK);
                                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                                    i2++;
                                }
                                Object[] objArr2 = {new String(iArr, 0, i2)};
                                Method method = Class.forName(C1561oA.Qd("r~s\u0001|uo8lwuzjrw0Domrbto", (short) (FB.Xd() ^ ((1484619585 ^ 605005531) ^ 2087892964)))).getMethod(C1561oA.od("\u0004\u0001\u000fl\u0012\u000b\u000bz\u0002fw\u0004\u0007xqr", (short) (OY.Xd() ^ (957824597 ^ 957815968))), Class.forName(C1593ug.zd("@8N:\bG=KE\r3UTLRL", (short) (Od.Xd() ^ (279099781 ^ (-279103483))), (short) (Od.Xd() ^ (1359835148 ^ (-1359836500))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strKd = C1561oA.Kd("kZ\"aG", (short) (C1633zX.Xd() ^ (269373525 ^ (-269353074))));
                                    String strZd = Wg.Zd("\f\u000e", (short) (C1499aX.Xd() ^ ((1951247030 ^ 990449900) ^ (-1329901001))), (short) (C1499aX.Xd() ^ (1070986108 ^ (-1070968657))));
                                    try {
                                        Class<?> cls4 = Class.forName(strKd);
                                        Field field4 = 0 != 0 ? cls4.getField(strZd) : cls4.getDeclaredField(strZd);
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
                    String strXd2 = C1561oA.Xd("wf.mS", (short) (C1580rY.Xd() ^ (75737528 ^ (-75759067))));
                    String strVd = Wg.vd("vj", (short) (C1607wl.Xd() ^ ((551156473 ^ 807777577) ^ 284968002)));
                    try {
                        Class<?> cls5 = Class.forName(strXd2);
                        Field field5 = 0 != 0 ? cls5.getField(strVd) : cls5.getDeclaredField(strVd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strKd2 = Qg.kd("kX\u001e[?", (short) (OY.Xd() ^ (1310736799 ^ 1310752767)), (short) (OY.Xd() ^ (860692248 ^ 860700518)));
                        short sXd2 = (short) (OY.Xd() ^ (114745044 ^ 114747698));
                        short sXd3 = (short) (OY.Xd() ^ (2043442619 ^ 2043437132));
                        int[] iArr2 = new int["\t|".length()];
                        QB qb2 = new QB("\t|");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
                            i3++;
                        }
                        String str = new String(iArr2, 0, i3);
                        try {
                            Class<?> cls6 = Class.forName(strKd2);
                            Field field6 = 0 != 0 ? cls6.getField(str) : cls6.getDeclaredField(str);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i4 = 479059546 ^ 479059473;
                        if (x2 > i4 && x2 < displayMetrics.widthPixels - i4 && y2 > i4 && y2 < displayMetrics.heightPixels - i4) {
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
    protected void onActivityResult(int i2, int i3, Intent intent) throws Throwable {
        super.onActivityResult(i2, i3, intent);
        String str = "onActivityResult, requestCode: " + i2 + ", resultCode: " + i3;
        if (intent == null) {
            showGeneralErrorDialog();
            return;
        }
        FaceTecSessionResult faceTecSessionResult = FaceTecSessionActivity.getSessionResultFromActivityResult(intent);
        Intrinsics.checkExpressionValueIsNotNull(faceTecSessionResult, "faceTecSessionResult");
        FaceTecSessionStatus status = faceTecSessionResult.getStatus();
        if (status != null) {
            switch (WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) {
                case 1:
                    handleSuccessfulSession(faceTecSessionResult);
                    break;
                case 2:
                    initFaceTecSDK();
                    break;
                case 3:
                    handleUnsuccessfulSession("ZOOMSESSIONUNSUCCESSFUL");
                    break;
                case 4:
                    handleUnsuccessfulSession("ZOOMTIMEOUTERROR");
                    break;
                case 5:
                    handleUnsuccessfulSession("ZOOMSDKMAXATTEMPSERROR");
                    break;
                case 6:
                case 7:
                case 8:
                    finish();
                    break;
            }
        }
        showGeneralErrorDialog();
    }

    @Override // com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_matchface);
        try {
            onCreateTasks();
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
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
            new IdNowConnectionChecker(this, supportFragmentManager, new Function0<Unit>() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchFaceActivity.onCreate.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    IdMatchFaceActivity.this.initFaceTecSDK();
                }
            }).check();
        } catch (Exception e2) {
            Dialog.INSTANCE.show(getSupportFragmentManager(), this, "Error interno", "Intente nuevamente", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchFaceActivity.onCreate.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.dynatrace.android.callback.Callback.onClick_enter(view);
                    try {
                        IdMatchFaceActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchFaceActivity.onCreate.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                IdMatchFaceActivity.this.setResult(170054, new Intent());
                                IdMatchFaceActivity.this.finish();
                            }
                        });
                    } finally {
                        com.dynatrace.android.callback.Callback.onClick_exit();
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void stepResult(java.lang.String r6, java.util.ArrayList<com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            int r4 = r6.hashCode()
            r0 = 1567(0x61f, float:2.196E-42)
            r2 = 170008(0x29818, float:2.38232E-40)
            r1 = 170050(0x29842, float:2.38291E-40)
            if (r4 == r0) goto L84
            r0 = 3548(0xddc, float:4.972E-42)
            if (r4 == r0) goto L45
            r0 = 3135262(0x2fd71e, float:4.393438E-39)
            if (r4 == r0) goto L39
            r0 = 92611376(0x5852330, float:1.2520186E-35)
            if (r4 == r0) goto L2d
        L26:
            r5.setResult(r1, r3)
        L29:
            r5.finish()
            return
        L2d:
            java.lang.String r0 = "abort"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L26
            r5.setResult(r2, r3)
            goto L29
        L39:
            java.lang.String r0 = "fail"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L26
            r5.setResult(r1, r3)
            goto L29
        L45:
            java.lang.String r0 = "ok"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L26
            com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue r2 = new com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue
            r2.<init>()
            java.lang.String r0 = "ID_FACE_PATH"
            r2.setKey(r0)
            java.lang.String r1 = r5.faceImagePath
            if (r1 != 0) goto L60
            java.lang.String r0 = "faceImagePath"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L60:
            r2.setValue(r1)
            java.lang.String r1 = "additionalParams"
            if (r7 == 0) goto L76
            r7.add(r2)
            java.io.Serializable r7 = (java.io.Serializable) r7
            r3.putExtra(r1, r7)
        L6f:
            r0 = 170000(0x29810, float:2.38221E-40)
            r5.setResult(r0, r3)
            goto L29
        L76:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r2)
            java.io.Serializable r0 = (java.io.Serializable) r0
            r3.putExtra(r1, r0)
            goto L6f
        L84:
            java.lang.String r0 = "10"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L26
            r5.setResult(r2, r3)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.activity.IdMatchFaceActivity.stepResult(java.lang.String, java.util.ArrayList):void");
    }
}
