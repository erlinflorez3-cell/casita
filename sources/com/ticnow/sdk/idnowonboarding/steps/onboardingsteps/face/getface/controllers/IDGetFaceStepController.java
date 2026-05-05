package com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.getface.controllers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.dynatrace.android.callback.OkCallback;
import com.facetec.sdk.FaceTecSDK;
import com.facetec.sdk.FaceTecSDKStatus;
import com.facetec.sdk.FaceTecSessionActivity;
import com.facetec.sdk.FaceTecSessionResult;
import com.facetec.sdk.FaceTecSessionStatus;
import com.ticnow.sdk.idnowonboarding.R;
import com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity;
import com.ticnow.sdk.idnowonboarding.steps.helper.IDRetrievedData;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors.LivenessCheckProcessor;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors.NetworkingHelpers;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import defpackage.ThemeHelpers;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
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
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я<\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u0018\u007f\u0007lmA0ReP.X[2\u000f\u0002{<$a$yCQU\"}(\tWN}gvJ`\rYƤ$4)jZH\u000ew{R\u0012̓FoM3\u0016uKBxtd\u000ff2j<\b\u0010\u0019\u001aXRX|\tOc\f@:\u0007p\u0003X\u001bZ\u001d\u001a@\u0010\u0005!I$juf6vv$:w'\u0011xZNUix\u0001[\u001d^TU\u0017?\u0002,<X7c\u001fUW\u0011\u0019j[m\u0007ouK\u0018\u0001'U/yyeJp\u0002*\u0014YdSo;6j\u001bi`:1[Uqbh\u0010>v)\u0014SNL\u001c\u0014@`.[$\u0017\f\u001cM\rr\u0002[\u0017\u0002'F\u000e\u0017y6E/H79V3f\u007fk\f'\\8\u0014\u0007#\u001dQ\u0003EĒgڍ\u0012`\u001dÑ%\u0004_4i@kL%˦eǀq\u0004xçR6\u00125_\u007f]}gч#É;[A\u05faqw\u0010N\\g%\u00077è_ׂVHH̎?\"E1!\f\tF;ʐwÏXX4Ҋ\u001e(b\u000f\u0016\bA\"3ɿHƼ)\u0010Vиſm\n"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wWL8u0+\u0014lj;\u0015r,Y\u0005pHHL,&TrL\u0015\u000eX\u000e\u0018)\u0017\u000ehN.uK7,\u0016u-`\u001dh\u0010l\u0012\f5X\u007fBamQ\u0003$\u0003K0oFf5", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0002)Fm#/IA;y}\r\u0019fjC\u0019?*]z8K[b\u0002", "u(E", "4`R2G,<A\u0019\r\tb6\u0006w9k\u007f1", "", "7mc2a;L", "", "Hn^:?0<S\"|zD,\u0011", "Hn^:?0<S\"|zM,\u0010\u0018", "Hn^:C<;Z\u001d|`^@", "Hn^:H9E", "1gT0^\r:Q\u0019mz\\\u001a[n\u001dt{7\fN", "", "1gT0^\u001bB[\u0019h\u000bm\u001a|\u00100i\u007f", "5dc\u0013T*>B\u0019|h=\u0012j\t=s\u00042\u0005/\u000b\u001d\u0017P", "7mXA9(<S\b~xL\u000bb", ":`d;V/\u001fO\u0017~i^*jg\u0015", ":nR._\bMb\u0019\u0007\u0006l\u0019|\u0005-h\u007f'", ";`g6`6L7\"\u000ezg;\u0007\u0017\u000bl}$\u0005U|\u0016!U", "=m00g0OW(\u0013g^:\r\u0010>", "@d`BX:M1#}z", "@dbB_;\u001c]\u0018~", "2`c.", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "=m2?X(MS", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "Adb@\\6GA)|zl:}\u00196", "4`R2G,<A\u0019\r\tb6\u0006u/s\u0010/\u000b", "\u001ab^:\"-:Q\u0019\u000ez\\u\u000b\b5/`$y@o\u0017\u00155o\u001cJz/>F}.Gt%\u0004", "Adb@\\6GC\"\r\u000b\\*|\u00170u\u0007", "CrT?6(GQ\u0019\u0006\u0002^+", "\u0011n\\=T5B]\"", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDGetFaceStepController extends TicnowActivity {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "IDGetFaceStepController";
    private HashMap _$_findViewCache;
    private String faceTecSessionToken;
    private String zoomLicenceText = "";
    private String zoomLicenceKey = "";
    private String zoomPublicKey = "";
    private String zoomUrl = "";
    private int intents = 3;

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨\\ԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wWL8u0+\u0014lj;\u0015r,Y\u0005pHHL,&TrL\u0015\u000eX\u000e\u0018)\u0017\u000ehN.uK7,\u0016u-`\u001dh\u0010l\u0012\f5X\u007fBamQ\u0003$\u0003K0oFf\u001eWQIP^3h\u0016hr", "", "u(E", "\"@6", "", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkFaceTecSDKStatus() {
        if (FaceTecSDK.getStatus(this) == FaceTecSDKStatus.INITIALIZED) {
            getFaceTecSDKSessionToken();
        } else {
            checkFaceTecSDKStatus();
        }
    }

    private final void getFaceTecSDKSessionToken() {
        Request.Builder builderHeader = new Request.Builder().header("X-Device-Key", this.zoomLicenceKey);
        String strCreateFaceTecAPIUserAgentString = FaceTecSDK.createFaceTecAPIUserAgentString("");
        Intrinsics.checkExpressionValueIsNotNull(strCreateFaceTecAPIUserAgentString, "FaceTecSDK.createFaceTecAPIUserAgentString(\"\")");
        OkCallback.enqueue(NetworkingHelpers.getApiClient().newCall(builderHeader.header("User-Agent", strCreateFaceTecAPIUserAgentString).url(this.zoomUrl + "/session-token").get().build()), new Callback() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.getface.controllers.IDGetFaceStepController.getFaceTecSDKSessionToken.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e2) {
                OkCallback.onFailure_enter(call, e2);
                try {
                    Intrinsics.checkParameterIsNotNull(call, "call");
                    Intrinsics.checkParameterIsNotNull(e2, "e");
                    e2.printStackTrace();
                    IDGetFaceStepController.this.sessionUnsuccesful();
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
                            IDGetFaceStepController.this.faceTecSessionToken = jSONObject.getString("sessionToken");
                            IDGetFaceStepController.this.launchFaceTecSDK();
                        } else {
                            IDGetFaceStepController.this.faceTecSessionToken = null;
                            IDGetFaceStepController.this.sessionUnsuccesful();
                        }
                    } catch (JSONException unused) {
                        IDGetFaceStepController.this.faceTecSessionToken = null;
                        IDGetFaceStepController.this.sessionUnsuccesful();
                    }
                } finally {
                    OkCallback.onResponse_exit();
                }
            }
        });
    }

    private final void initFaceTecSDK() {
        try {
            ThemeHelpers.INSTANCE.setAppTheme(this);
            FaceTecSDK.initializeInProductionMode(this, this.zoomLicenceText, this.zoomLicenceKey, this.zoomPublicKey, new FaceTecSDK.InitializeCallback() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.getface.controllers.IDGetFaceStepController.initFaceTecSDK.1
                @Override // com.facetec.sdk.FaceTecSDK.InitializeCallback
                public void onCompletion(boolean z2) {
                    if (z2) {
                        IDGetFaceStepController.this.checkFaceTecSDKStatus();
                        return;
                    }
                    IDGetFaceStepController.this.setResult(IDStepResponseCodes.STEP_RESULT_FAIL, new Intent());
                    IDGetFaceStepController.this.finish();
                }
            });
        } catch (Exception e2) {
            sessionUnsuccesful();
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchFaceTecSDK() {
        new LivenessCheckProcessor(this.faceTecSessionToken, this, this.zoomUrl, this.zoomLicenceKey);
    }

    private final void sessionSucessful(FaceTecSessionResult faceTecSessionResult) throws Throwable {
        IDRetrievedData currentRetrievedData = IDRetrievedData.getCurrentRetrievedData();
        Intrinsics.checkExpressionValueIsNotNull(currentRetrievedData, "IDRetrievedData.getCurrentRetrievedData()");
        Integer maxIntents = currentRetrievedData.getMaxIntents();
        IDRetrievedData currentRetrievedData2 = IDRetrievedData.getCurrentRetrievedData();
        Intrinsics.checkExpressionValueIsNotNull(currentRetrievedData2, "IDRetrievedData.getCurrentRetrievedData()");
        int iIntValue = currentRetrievedData2.getDueIntents().intValue();
        Intrinsics.checkExpressionValueIsNotNull(maxIntents, "maxIntents");
        if (Intrinsics.compare(iIntValue, maxIntents.intValue()) >= 0) {
            localAttempsReached();
            return;
        }
        if (faceTecSessionResult.getFaceScan() != null) {
            String faceScanBase64 = faceTecSessionResult.getFaceScanBase64();
            String sessionId = faceTecSessionResult.getSessionId();
            String str = faceTecSessionResult.getAuditTrailCompressedBase64()[0];
            IDRetrievedData currentRetrievedData3 = IDRetrievedData.getCurrentRetrievedData();
            Intrinsics.checkExpressionValueIsNotNull(currentRetrievedData3, "IDRetrievedData.getCurrentRetrievedData()");
            currentRetrievedData3.setSelfie(str);
            IDRetrievedData currentRetrievedData4 = IDRetrievedData.getCurrentRetrievedData();
            Intrinsics.checkExpressionValueIsNotNull(currentRetrievedData4, "IDRetrievedData.getCurrentRetrievedData()");
            currentRetrievedData4.setJsonBody("{\"selfie\":\"" + str + "\",\"sessionId\":\"" + sessionId + "\",\"faceMap\":\"" + faceScanBase64 + "\"}");
            IDRetrievedData currentRetrievedData5 = IDRetrievedData.getCurrentRetrievedData();
            Intrinsics.checkExpressionValueIsNotNull(currentRetrievedData5, "IDRetrievedData.getCurrentRetrievedData()");
            currentRetrievedData5.setSessionId(sessionId);
            IDRetrievedData currentRetrievedData6 = IDRetrievedData.getCurrentRetrievedData();
            Intrinsics.checkExpressionValueIsNotNull(currentRetrievedData6, "IDRetrievedData.getCurrentRetrievedData()");
            currentRetrievedData6.setFaceMap(faceScanBase64);
            setResult(IDGetFaceController.FACE_DATA_RESULT_OK, new Intent());
            finish();
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

    public final void checkTimeOutSelfie() {
        setResult(IDGetFaceController.FACE_DATA_RESULT_TIMEOUT, new Intent());
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            short sXd = (short) (OY.Xd() ^ (2106109991 ^ 2106129129));
            int[] iArr = new int["#\u0010U\u0013v".length()];
            QB qb = new QB("#\u0010U\u0013v");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            short sXd2 = (short) (C1607wl.Xd() ^ (123810280 ^ 123816289));
            int[] iArr2 = new int["M<".length()];
            QB qb2 = new QB("M<");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                i3++;
            }
            String str2 = new String(iArr2, 0, i3);
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(str2) : cls.getDeclaredField(str2);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strZd = Wg.Zd("@\u00159Z\u0011", (short) (FB.Xd() ^ ((235353661 ^ 1865321614) ^ 1630122221)), (short) (FB.Xd() ^ (323282551 ^ 323270656)));
                String strXd = C1561oA.Xd("\u0012\u007f", (short) (C1580rY.Xd() ^ (1462947003 ^ (-1462945886))));
                try {
                    Class<?> cls2 = Class.forName(strZd);
                    Field field2 = 0 != 0 ? cls2.getField(strXd) : cls2.getDeclaredField(strXd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strVd = Wg.vd(",\u001b^\u001e\b", (short) (Od.Xd() ^ (1633247773 ^ (-1633234507))));
                    String strKd = Qg.kd("MA", (short) (C1499aX.Xd() ^ (1666979038 ^ (-1666976325))), (short) (C1499aX.Xd() ^ (171620890 ^ (-171607723))));
                    try {
                        Class<?> cls3 = Class.forName(strVd);
                        Field field3 = 0 != 0 ? cls3.getField(strKd) : cls3.getDeclaredField(strKd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(hg.Vd("&\u0013X\"\u0002", (short) (Od.Xd() ^ ((1424043406 ^ 28040353) ^ (-1430964242))), (short) (Od.Xd() ^ (1622947134 ^ (-1622965574))))).getDeclaredMethod(C1561oA.ud("}\t", (short) (C1580rY.Xd() ^ (263605768 ^ (-263600390)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strYd = C1561oA.yd("bU[RV_", (short) (FB.Xd() ^ ((296687176 ^ 525481504) ^ 251479055)));
                                short sXd3 = (short) (C1580rY.Xd() ^ ((1105532978 ^ 1046187368) ^ (-2143208886)));
                                int[] iArr3 = new int["UcZigb^)_llseov1Gtt{m\u0002~".length()];
                                QB qb3 = new QB("UcZigb^)_llseov1Gtt{m\u0002~");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd3 + sXd3) + sXd3) + i4));
                                    i4++;
                                }
                                Class<?> cls4 = Class.forName(new String(iArr3, 0, i4));
                                Class<?>[] clsArr = {Class.forName(Xg.qd("}u\fwE\u0005z\t\u0003Jp\u0013\u0012\n\u0010\n", (short) (C1633zX.Xd() ^ ((1422474190 ^ 1159156352) ^ (-299776573))), (short) (C1633zX.Xd() ^ ((929828985 ^ 1453465752) ^ (-1640909108)))))};
                                Object[] objArr2 = {strYd};
                                short sXd4 = (short) (C1633zX.Xd() ^ ((1092148674 ^ 2054836237) ^ (-996311868)));
                                short sXd5 = (short) (C1633zX.Xd() ^ ((1865898120 ^ 601394092) ^ (-1290790057)));
                                int[] iArr4 = new int["~QCafcDwgMB\u000fqgE\u001a".length()];
                                QB qb4 = new QB("~QCafcDwgMB\u000fqgE\u001a");
                                int i5 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((i5 * sXd5) ^ sXd4));
                                    i5++;
                                }
                                Method method = cls4.getMethod(new String(iArr4, 0, i5), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strXd2 = ZO.xd("TUB|\u000f", (short) (C1580rY.Xd() ^ ((1083786611 ^ 2024627700) ^ (-942936252))), (short) (C1580rY.Xd() ^ (1263748513 ^ (-1263754220))));
                                    short sXd6 = (short) (C1607wl.Xd() ^ (1510813971 ^ 1510825193));
                                    short sXd7 = (short) (C1607wl.Xd() ^ ((1591805823 ^ 1535999101) ^ 90985526));
                                    int[] iArr5 = new int["3l".length()];
                                    QB qb5 = new QB("3l");
                                    int i6 = 0;
                                    while (qb5.YK()) {
                                        int iKK5 = qb5.KK();
                                        Xu xuXd5 = Xu.Xd(iKK5);
                                        iArr5[i6] = xuXd5.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + (i6 * sXd7))) + xuXd5.CK(iKK5));
                                        i6++;
                                    }
                                    String str3 = new String(iArr5, 0, i6);
                                    try {
                                        Class<?> cls5 = Class.forName(strXd2);
                                        Field field4 = 0 != 0 ? cls5.getField(str3) : cls5.getDeclaredField(str3);
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
                    String strWd = Ig.wd("o.\u0005h\u001b", (short) (Od.Xd() ^ (1857395051 ^ (-1857397898))));
                    String strOd = EO.Od("d\u000f", (short) (C1580rY.Xd() ^ (203989617 ^ (-203995465))));
                    try {
                        Class<?> cls6 = Class.forName(strWd);
                        Field field5 = 0 != 0 ? cls6.getField(strOd) : cls6.getDeclaredField(strOd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strQd = C1561oA.Qd("G4y7\u001b", (short) (ZN.Xd() ^ (466093208 ^ 466119909)));
                        String strZd2 = C1593ug.zd("[Q", (short) (C1633zX.Xd() ^ ((166136588 ^ 757939812) ^ (-617243748))), (short) (C1633zX.Xd() ^ (1862244653 ^ (-1862260848))));
                        try {
                            Class<?> cls7 = Class.forName(strQd);
                            Field field6 = 0 != 0 ? cls7.getField(strZd2) : cls7.getDeclaredField(strZd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i7 = 1222084147 ^ 1222084216;
                        if (x2 > i7 && x2 < displayMetrics.widthPixels - i7 && y2 > i7 && y2 < displayMetrics.heightPixels - i7) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void localAttempsReached() {
        setResult(IDGetFaceController.FACE_DATA_RESULT_MAX_LOCAL_REINTENTS, new Intent());
        finish();
    }

    public final void maximosIntentosAlcanzados() {
        setResult(IDGetFaceController.FACE_DATA_RESULT_MAX_REINTENTS, new Intent());
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) throws Throwable {
        super.onActivityResult(i2, i3, intent);
        if (intent == null) {
            sessionUnsuccesful();
            return;
        }
        FaceTecSessionResult faceTecSessionResult = FaceTecSessionActivity.getSessionResultFromActivityResult(intent);
        Intrinsics.checkExpressionValueIsNotNull(faceTecSessionResult, "faceTecSessionResult");
        FaceTecSessionStatus status = faceTecSessionResult.getStatus();
        if (status != null) {
            switch (WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) {
                case 1:
                    sessionSucessful(faceTecSessionResult);
                    break;
                case 2:
                    initFaceTecSDK();
                    break;
                case 3:
                    sessionUnsuccesful();
                    break;
                case 4:
                    checkTimeOutSelfie();
                    break;
                case 5:
                    maximosIntentosAlcanzados();
                    break;
                case 6:
                case 7:
                case 8:
                    userCancelled();
                    break;
            }
        }
        sessionUnsuccesful();
    }

    @Override // com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_get_face);
        onCreateTasks();
        String stringExtra = getIntent().getStringExtra("zoomLicenceText");
        if (stringExtra == null) {
            Intrinsics.throwNpe();
        }
        this.zoomLicenceText = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("zoomLicenceKey");
        if (stringExtra2 == null) {
            Intrinsics.throwNpe();
        }
        this.zoomLicenceKey = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("zoomPublicKey");
        if (stringExtra3 == null) {
            Intrinsics.throwNpe();
        }
        this.zoomPublicKey = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("zoomUrl");
        if (stringExtra4 == null) {
            Intrinsics.throwNpe();
        }
        this.zoomUrl = stringExtra4;
        this.intents = getIntent().getIntExtra("intents", 3);
        IDRetrievedData currentRetrievedData = IDRetrievedData.getCurrentRetrievedData();
        Intrinsics.checkExpressionValueIsNotNull(currentRetrievedData, "IDRetrievedData.getCurrentRetrievedData()");
        currentRetrievedData.setDueIntents(0);
        IDRetrievedData currentRetrievedData2 = IDRetrievedData.getCurrentRetrievedData();
        Intrinsics.checkExpressionValueIsNotNull(currentRetrievedData2, "IDRetrievedData.getCurrentRetrievedData()");
        currentRetrievedData2.setMaxIntents(Integer.valueOf(this.intents));
        initFaceTecSDK();
    }

    public final void sessionUnsuccesful() {
        setResult(IDGetFaceController.FACE_DATA_RESULT_ERROR, new Intent());
        finish();
    }

    public final void userCancelled() {
        setResult(IDGetFaceController.FACE_DATA_RESULT_CANCELED, new Intent());
        finish();
    }
}
