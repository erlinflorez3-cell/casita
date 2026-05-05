package com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.regula.documentreader.api.DocumentReader;
import com.regula.documentreader.api.completions.IDocumentReaderInitCompletion;
import com.regula.documentreader.api.errors.DocumentReaderException;
import com.ticnow.sdk.idnowonboarding.R;
import com.ticnow.sdk.idnowonboarding.connectivity.ConnectionAliveCallback;
import com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker;
import com.ticnow.sdk.idnowonboarding.dialog.Dialog;
import com.ticnow.sdk.idnowonboarding.dialog.IDDialog;
import com.ticnow.sdk.idnowonboarding.dialog.ProgressDialog;
import com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity;
import com.ticnow.sdk.idnowonboarding.model.api.IDReintentServicesImpl;
import com.ticnow.sdk.idnowonboarding.model.api.IDStepServicesImpl;
import com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration;
import com.ticnow.sdk.idnowonboarding.model.http.IDAnalizeDniRequest;
import com.ticnow.sdk.idnowonboarding.services.reintents.IDReintentServices;
import com.ticnow.sdk.idnowonboarding.services.reintents.reintentsCallbacks.UpdateEnrollmentReintenNewsCallback;
import com.ticnow.sdk.idnowonboarding.services.steps.dni.FinalAnalizeDni;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import com.ticnow.sdk.idnowonboarding.utils.DataCleaner;
import com.ticnow.sdk.idnowonboarding.viewmodel.ValidateDniViewModel;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApiImpl;
import com.ticnow.sdk.idnowsecurity.http.codes.IDEnrollmentResponseCodes;
import com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import com.ticnow.sdk.idnowsecurity.http.request.CommonParamsRequest;
import com.ticnow.sdk.idnowsecurity.http.request.CommonUserDataRequest;
import com.ticnow.sdk.idnowsecurity.http.response.IdNowCommonResponse;
import java.io.ByteArrayOutputStream;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.FB;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я~\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјnjO0LeN4ZS@\u000fsڔ<$q$yّCU(}*\tUTog|Pb\u000bI\u000f\u000e\u0016\u000fj4I[ye\u0012%2JģG3coEʠhtL\u0005(2(8\u0002\u0005\u0017\u001a2H\u0016y\u0003Ca\f\u001a0VpBR#M\r\u001a\u0018\u000bF \u0017\u001edgd6Plc:E݊3ipMgb݁\u0001M\u001bF\u001d-\u001b\ty\u001eYS}5]+a\u0017\u001fR\nRI@:C\u0013}?'Y\\:W~^\u000e*-+} $rnb\u0013hx\fU>\u0016c\u0014V\u001c@\u0010z* \u0003\u0004V\n5aF-HyP.A\u000f\u000bSnc2bP\u001b\u0013ad3U\u0004AHQ\u001b\u0015m\u0012A'lO}\u001b\fLBG\u0001iab.x\u0015Ig>eyaN^`N8lms\u0012\u0013z\u0004@\u0003^jFAD\u001f<;=7\n^S%y(`D\u0016\u001eK`1awz`@P\u0002F;82$Zr\u000fKk\u0019bfW)MJg7\u0002\u0016?8\\&>g%Xv]\u0016\u0002j{p:)=\u0015OY\u001dm>oG\u000eKIae a\u0001(*>j\u0013m`vDc\f\t\u000e>!\u0011z3\u001e\u0006/\\N:&bC\u007fPL,_\u001b#\u0015\u0011\u0011,wY|7r\u000bl\u001e3l3R\u00050$=\u0017\u000f\u0007tp\u001ez)M:4x\"[C\u00185a,cZ\u00014+6M~<\u0010U!dGz'>u\u00047P\u001a(ui/k/_\u000b73\u001a-sNIϏ\u0014̊\u0016'\u0003۠J\u001bIkFg6nGݝ\rʧNO\\ϟr\u0003lw;\b\u0013\u0006PӖrیKc\\ެ,JWy\u001bYjT\u000fً1ȷ\"%\tǻr\tC5['K\u001cNҤ[ֵe]q۰~\u0006p\u0018>t\u0014\n\u0003ϦB̔fQeЦ\fDWc\u0017>P*CÚn\u05f8nw\u0010ȷY@\u001b>`A\u0013v-Иyߵ3}n߿|\u0019~bs:AuTұZʡ.sK͟djQ2)M\u0002mDޱwů\u000fJ\u0017Ϙ[\b?|*\u001ck/-̳\u000fס4\u0006{̸\u0007MIr\u001d<75\u000bɹ>ޭ\u000fC\\ȫћ\u00148"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wWL8u0+\u0014lj;\u0015r,Y\u0005pFURuXP\u0002A%\u0016i\"\u0018\u001c\t\f]@ }D\u0016(\f\bG\u0011?y\u0005\u001b*c", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0002)Fm#/IA;y}\r\u0019fjC\u0019?*]z8K[b\u0002", "u(E", "\"@6", "", "0tcAb5\u001c]\"\u000e~g<|", "\u001a`]1e6BRb\u0011~].|\u0018xB\u00107\u000bJ\nl", "7lP4X\u001dBS+[v\\2", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "7lP4X\u001dBS+\\\u0002h:|", "7lP4X\u001dBS+]\u0004b\tx\u00075C\u0003(yF", "7lP4X\u001dBS+]\u0004b\tx\u00075F\r$\u0004@", "7lP4X\u001dBS+]\u0004b\tx\u00075P\u0004&\u000bP\u000e\u0017", "7lP4X\u001dBS+]\u0004b\r\n\u00138t]+{>\u0007", "7lP4X\u001dBS+]\u0004b\r\n\u00138t`5wH\u0001", "7lP4X\u001dBS+]\u0004b\r\n\u00138tj,yO\u0011$\u0017", ";UX2j\u0014HR\u0019\u0006", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u000f$7\u007f\u001e8LCB5%\u001a\u001cl`5\u0016c\u000bWz\u0018KL`\u0014fQrDi", ">q^4e,Law\u0003ve6~", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#|$3t 0\u0017.Hu6+\u0015vo\u0018\u000b_3Xx|", "1gT0^\tNb(\t\u0004<6\u0006\u00183n\u0010(", "", "1gT0^\u0010Gb\u0019\f\u0004^;Z\u00138n\u007f&\u000bD\u000b ", "1gT0^\u0013HQ\u0015\u0006WZ*\u0003d>t\u007f0\u0007N", "1gT0^\u0013HQ\u0015\u0006[k6\u0006\u0018\u000bt\u000f(\u0004K\u000f", "4`X9X+\u001bO\u0017\u0005Xa,z\u000f", "4`X9X+\u001f`#\b\n</|\u00075", "7mXAE,@c zh=\u0012", "=m00g0OW(\u0013g^:\r\u0010>", "@d`BX:M1#}z", "", "@dbB_;\u001c]\u0018~", "2`c.", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "=m1.V2)`\u0019\r\t^+", "=m2?X(MS", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "@nd;W,=0\u001d\u000e\u0003Z7", "\u001a`]1e6BR,Hxh9|R1r{3~D~%`F|\nNr\"<YG\rA}\u001f-MB\u0018oC&\u0011s@F\u0003u(K}'\u001d", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "AgP8X", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "Ag^D9(BZ\u0019}Xa,z\u000f\u000ei{/\u0006B", ";db@T.>", "AsT=E,Lc \u000e", "@dbB_;", "/cS6g0H\\\u0015\u0006g^:\b\u00138s\u007f\u0004\u000bO\u000e%", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "AtR0X:L0\u0015|\u0001</|\u00075", ">`c5", "AtR0X:L4&\t\u0004m\n\u007f\t-k", "CoS.g,\u001e\\&\t\u0002e4|\u0012>sl(\u007fI\u0010\u0017 V}v<\t3", "3qa<e\nHR\u0019", "D`[6W(MSw\b~", "@db<h9<S\t\f~", "\u001a`]1e6BRb\bzmul\u00163;", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "@db<h9<S|}", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class ValidateDniActivity extends TicnowActivity {
    private HashMap _$_findViewCache;
    private Button buttonContinue;
    private ImageView imageViewBack;
    private ImageView imageViewClose;
    private ImageView imageViewDniBackCheck;
    private ImageView imageViewDniBackFrame;
    private ImageView imageViewDniBackPicture;
    private ImageView imageViewDniFrontCheck;
    private ImageView imageViewDniFrontFrame;
    private ImageView imageViewDniFrontPicture;
    private ValidateDniViewModel mViewModel;
    private final String TAG = "ValidateDniActivity";
    private final ProgressDialog progressDialog = new ProgressDialog();

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity$checkInternetConnection$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u0003\rI\u00066\f<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(sI>c\u001e"}, d2 = {"\n`]<a@F])\rS", "", "7s", "", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m56a0LV\u0019}", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q\u0004q"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass1 implements ConnectionAliveCallback {

        /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity$checkInternetConnection$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
        static final class RunnableC02871 implements Runnable {
            RunnableC02871() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IDDialog.showDialog(ValidateDniActivity.this.getSupportFragmentManager(), ValidateDniActivity.this, ValidateDniActivity.this, "", "Revise su conexión a internet.\nPor favor intente su proceso más tarde.", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.checkInternetConnection.1.1.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Callback.onClick_enter(view);
                        try {
                            ValidateDniActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.checkInternetConnection.1.1.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ValidateDniActivity.this.setResult(3036, new Intent());
                                    ValidateDniActivity.this.finish();
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
            ValidateDniActivity.this.runOnUiThread(new RunnableC02871());
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity$initRegulaSDK$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0018\u001d̉=!,i\bӵLc\u0003\rIي8\u000bDB\u0007\"2\u0012\u0006ј~jg/tiV.jSX\u0010\u001c\bB&s,\u0010GcW0|P\f}Q.oĔNZ\u0011H"}, d2 = {"\n`]<a@F])\rS", "", "AtR0X:L", "", "3qa<e&B\\\u001d\u000e~Z3\u0001\u001e/R\u007f$z@\u000e", "\u001ab^:\"9>U)\u0006v(+\u0007\u0007?m\u007f1\u000bM\u0001\u0013\u0016G|W8\u0002)~Y\u000b-Az$w,M9{<\u001e\u001ewN9\u0003b,[V:ELY;`\\{\u0013", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m8;\\;\u001c]!\n\u0002^;|\b"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class C12721 implements IDocumentReaderInitCompletion {
        C12721() {
        }

        public final void onInitCompleted(boolean z2, DocumentReaderException documentReaderException) {
            if (z2) {
                String unused = ValidateDniActivity.this.TAG;
                ValidateDniActivity.this.progressDialog.getDialog().dismiss();
            } else {
                String unused2 = ValidateDniActivity.this.TAG;
                ValidateDniActivity.this.progressDialog.getDialog().dismiss();
                ValidateDniActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.initRegulaSDK.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ValidateDniActivity.this.progressDialog.getDialog().dismiss();
                        IDDialog.showDialog(ValidateDniActivity.this.getSupportFragmentManager(), ValidateDniActivity.this, ValidateDniActivity.this, "Error interno", "Por favor intente nuevamente", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.initRegulaSDK.1.1.1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Callback.onClick_enter(view);
                                try {
                                    ValidateDniActivity.this.setResult(170054, new Intent());
                                    ValidateDniActivity.this.finish();
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

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity$validateDni$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я&\u001d̉=!,i\bӵLc\u0003\u0010I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007njO0Le^.ZS0\u000fyڔL$\n#\"VIU2\rP\nҊRqmpZ`\u0011F\u001f\b\u001c~\u00110y|\u0007b*2BD\u007f?aT\u0006<gf]>\u0015\"B\"f\u0001\u001b\u007fx2Н\u0014\u0001\u0001E[\u0012\u00183Pr@X3Vŋ\u001e\u0012\fH"}, d2 = {"\n`]<a@F])\rS", "", ">0", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "@dbB_;", ">1", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "/cS6g0H\\\u0015\u0006g^:\b\u00138s\u007f\u0004\u000bO\u000e%", "7me<^,"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final /* synthetic */ class C12821 extends FunctionReference implements Function2<String, ArrayList<KeyValue>, Unit> {
        C12821(ValidateDniActivity validateDniActivity) {
            super(2, validateDniActivity);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "stepResult";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ValidateDniActivity.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "stepResult(Ljava/lang/String;Ljava/util/ArrayList;)V";
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, ArrayList<KeyValue> arrayList) {
            invoke2(str, arrayList);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p1, ArrayList<KeyValue> arrayList) {
            Intrinsics.checkParameterIsNotNull(p1, "p1");
            ((ValidateDniActivity) this.receiver).stepResult(p1, arrayList);
        }
    }

    public static final /* synthetic */ ImageView access$getImageViewDniBackCheck$p(ValidateDniActivity validateDniActivity) {
        ImageView imageView = validateDniActivity.imageViewDniBackCheck;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageViewDniBackCheck");
        }
        return imageView;
    }

    public static final /* synthetic */ ImageView access$getImageViewDniBackPicture$p(ValidateDniActivity validateDniActivity) {
        ImageView imageView = validateDniActivity.imageViewDniBackPicture;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageViewDniBackPicture");
        }
        return imageView;
    }

    public static final /* synthetic */ ImageView access$getImageViewDniFrontCheck$p(ValidateDniActivity validateDniActivity) {
        ImageView imageView = validateDniActivity.imageViewDniFrontCheck;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageViewDniFrontCheck");
        }
        return imageView;
    }

    public static final /* synthetic */ ImageView access$getImageViewDniFrontPicture$p(ValidateDniActivity validateDniActivity) {
        ImageView imageView = validateDniActivity.imageViewDniFrontPicture;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageViewDniFrontPicture");
        }
        return imageView;
    }

    public static final /* synthetic */ ValidateDniViewModel access$getMViewModel$p(ValidateDniActivity validateDniActivity) {
        ValidateDniViewModel validateDniViewModel = validateDniActivity.mViewModel;
        if (validateDniViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        return validateDniViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void checkButtonContinue() {
        /*
            r5 = this;
            android.widget.Button r4 = r5.buttonContinue
            if (r4 != 0) goto L9
            java.lang.String r0 = "buttonContinue"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L9:
            com.ticnow.sdk.idnowonboarding.viewmodel.ValidateDniViewModel r0 = r5.mViewModel
            java.lang.String r3 = "mViewModel"
            if (r0 != 0) goto L12
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L12:
            java.lang.Boolean r1 = r0.getFrontReady()
            r2 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L3a
            com.ticnow.sdk.idnowonboarding.viewmodel.ValidateDniViewModel r0 = r5.mViewModel
            if (r0 != 0) goto L28
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L28:
            java.lang.Boolean r1 = r0.getBackReady()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L3a
        L36:
            r4.setEnabled(r2)
            return
        L3a:
            r2 = 0
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.checkButtonContinue():void");
    }

    private final void checkInternetConnection() {
        IDDialog.showPreConnectionPopup(2, getSupportFragmentManager(), this, this, new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkLocalBackAttemps() {
        ValidateDniViewModel validateDniViewModel = this.mViewModel;
        if (validateDniViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        short localBackAttempts = validateDniViewModel.getLocalBackAttempts();
        ValidateDniViewModel validateDniViewModel2 = this.mViewModel;
        if (validateDniViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        IDNowOnboardingConfiguration onboardingConfiguration = validateDniViewModel2.getOnboardingConfiguration();
        Integer num = onboardingConfiguration != null ? onboardingConfiguration.maxBackAttemps : null;
        if (num == null) {
            Intrinsics.throwNpe();
        }
        if (localBackAttempts >= num.intValue()) {
            updateEnrollmentsReintentsNews("DNIBACKNOTVALID");
        } else {
            showFailedCheckDialog("Recuerde que solo es válida la foto de la parte posterior.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkLocalFrontAttemps() {
        ValidateDniViewModel validateDniViewModel = this.mViewModel;
        if (validateDniViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        short localFrontAttempts = validateDniViewModel.getLocalFrontAttempts();
        ValidateDniViewModel validateDniViewModel2 = this.mViewModel;
        if (validateDniViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        IDNowOnboardingConfiguration onboardingConfiguration = validateDniViewModel2.getOnboardingConfiguration();
        Integer num = onboardingConfiguration != null ? onboardingConfiguration.maxFrontAttemps : null;
        if (num == null) {
            Intrinsics.throwNpe();
        }
        if (localFrontAttempts >= num.intValue()) {
            updateEnrollmentsReintentsNews("DNIFRONTNOTVALID");
        } else {
            showFailedCheckDialog("Recuerde que solo es válida la foto de la parte frontal.");
        }
    }

    private final void failedBackCheck() {
        runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.failedBackCheck.1
            @Override // java.lang.Runnable
            public final void run() {
                ValidateDniActivity.access$getMViewModel$p(ValidateDniActivity.this).setDniBackPath("");
                ValidateDniActivity.access$getMViewModel$p(ValidateDniActivity.this).setBackReady(false);
                ValidateDniViewModel validateDniViewModelAccess$getMViewModel$p = ValidateDniActivity.access$getMViewModel$p(ValidateDniActivity.this);
                validateDniViewModelAccess$getMViewModel$p.setLocalBackAttempts((short) (validateDniViewModelAccess$getMViewModel$p.getLocalBackAttempts() + 1));
                ValidateDniActivity.access$getImageViewDniBackCheck$p(ValidateDniActivity.this).setImageResource(R.drawable.ic_failed_dav);
                ValidateDniActivity.access$getImageViewDniBackPicture$p(ValidateDniActivity.this).setBackgroundResource(R.drawable.bg_frame_dav);
                ValidateDniActivity.this.checkButtonContinue();
                ValidateDniActivity.this.checkLocalBackAttemps();
            }
        });
    }

    private final void failedFrontCheck() {
        runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.failedFrontCheck.1
            @Override // java.lang.Runnable
            public final void run() {
                ValidateDniActivity.access$getMViewModel$p(ValidateDniActivity.this).setDniFrontalPath("");
                ValidateDniActivity.access$getMViewModel$p(ValidateDniActivity.this).setFrontReady(false);
                ValidateDniViewModel validateDniViewModelAccess$getMViewModel$p = ValidateDniActivity.access$getMViewModel$p(ValidateDniActivity.this);
                validateDniViewModelAccess$getMViewModel$p.setLocalFrontAttempts((short) (validateDniViewModelAccess$getMViewModel$p.getLocalFrontAttempts() + 1));
                ValidateDniActivity.access$getImageViewDniFrontCheck$p(ValidateDniActivity.this).setImageResource(R.drawable.ic_failed_dav);
                ValidateDniActivity.access$getImageViewDniFrontPicture$p(ValidateDniActivity.this).setBackgroundResource(R.drawable.bg_frame_dav);
                ValidateDniActivity.this.checkButtonContinue();
                ValidateDniActivity.this.checkLocalFrontAttemps();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RoundedBitmapDrawable roundedBitmap(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkExpressionValueIsNotNull(byteArray, "stream.toByteArray()");
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        Intrinsics.checkExpressionValueIsNotNull(bitmapDecodeByteArray, "BitmapFactory.decodeByte…Array, 0, byteArray.size)");
        RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(Resources.getSystem(), bitmapDecodeByteArray);
        Intrinsics.checkExpressionValueIsNotNull(roundedBitmapDrawableCreate, "RoundedBitmapDrawableFac… internalBitmap\n        )");
        roundedBitmapDrawableCreate.setCircular(true);
        roundedBitmapDrawableCreate.setCornerRadius(18.0f);
        return roundedBitmapDrawableCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shake(View view) {
    }

    private final void showFailedCheckDialog(final String str) {
        runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.showFailedCheckDialog.1
            @Override // java.lang.Runnable
            public final void run() {
                Dialog.INSTANCE.show(ValidateDniActivity.this.getSupportFragmentManager(), ValidateDniActivity.this, "No fue posible reconocer su cédula", str, "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.showFailedCheckDialog.1.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Callback.onClick_enter(view);
                        try {
                        } finally {
                            Callback.onClick_exit();
                        }
                    }
                });
            }
        });
    }

    private final void successBackCheck(String str) {
        ValidateDniViewModel validateDniViewModel = this.mViewModel;
        if (validateDniViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        validateDniViewModel.setBackReady(true);
        ImageView imageView = this.imageViewDniBackCheck;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageViewDniBackCheck");
        }
        imageView.setImageResource(R.drawable.ic_success_dav);
        ImageView imageView2 = this.imageViewDniBackPicture;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageViewDniBackPicture");
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        Intrinsics.checkExpressionValueIsNotNull(bitmapDecodeFile, "BitmapFactory.decodeFile(path)");
        imageView2.setBackground(roundedBitmap(bitmapDecodeFile));
        ValidateDniViewModel validateDniViewModel2 = this.mViewModel;
        if (validateDniViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        validateDniViewModel2.setDniBackPath(str);
        checkButtonContinue();
    }

    private final void successFrontCheck(final String str) {
        runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.successFrontCheck.1
            @Override // java.lang.Runnable
            public final void run() {
                ValidateDniActivity.access$getMViewModel$p(ValidateDniActivity.this).setDniFrontalPath(str);
                ValidateDniActivity.access$getMViewModel$p(ValidateDniActivity.this).setFrontReady(true);
                ValidateDniActivity.access$getImageViewDniFrontCheck$p(ValidateDniActivity.this).setImageResource(R.drawable.ic_success_dav);
                ImageView imageViewAccess$getImageViewDniFrontPicture$p = ValidateDniActivity.access$getImageViewDniFrontPicture$p(ValidateDniActivity.this);
                ValidateDniActivity validateDniActivity = ValidateDniActivity.this;
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
                Intrinsics.checkExpressionValueIsNotNull(bitmapDecodeFile, "BitmapFactory.decodeFile(path)");
                imageViewAccess$getImageViewDniFrontPicture$p.setBackground(validateDniActivity.roundedBitmap(bitmapDecodeFile));
                ValidateDniActivity.this.checkButtonContinue();
            }
        });
    }

    private final void updateEnrollmentsReintentsNews(String str) {
        IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
        IDReintentServicesImpl iDReintentServicesImpl = new IDReintentServicesImpl();
        ValidateDniActivity validateDniActivity = this;
        ValidateDniActivity validateDniActivity2 = this;
        ValidateDniViewModel validateDniViewModel = this.mViewModel;
        if (validateDniViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        IDNowOnboardingConfiguration onboardingConfiguration = validateDniViewModel.getOnboardingConfiguration();
        if (onboardingConfiguration == null) {
            Intrinsics.throwNpe();
        }
        CommonParamsRequest commonParamsRequest = onboardingConfiguration.commonParams;
        Intrinsics.checkExpressionValueIsNotNull(commonParamsRequest, "mViewModel.onboardingConfiguration!!.commonParams");
        ValidateDniViewModel validateDniViewModel2 = this.mViewModel;
        if (validateDniViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        IDNowOnboardingConfiguration onboardingConfiguration2 = validateDniViewModel2.getOnboardingConfiguration();
        if (onboardingConfiguration2 == null) {
            Intrinsics.throwNpe();
        }
        CommonUserDataRequest commonUserDataRequest = onboardingConfiguration2.commonUserData;
        Intrinsics.checkExpressionValueIsNotNull(commonUserDataRequest, "mViewModel.onboardingCon…guration!!.commonUserData");
        ValidateDniViewModel validateDniViewModel3 = this.mViewModel;
        if (validateDniViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        IDNowOnboardingConfiguration onboardingConfiguration3 = validateDniViewModel3.getOnboardingConfiguration();
        if (onboardingConfiguration3 == null) {
            Intrinsics.throwNpe();
        }
        String str2 = onboardingConfiguration3.uuidTransaction;
        Intrinsics.checkExpressionValueIsNotNull(str2, "mViewModel.onboardingCon…uration!!.uuidTransaction");
        String deviceUUID = iDSecurityApiImpl.getDeviceUUID(validateDniActivity, validateDniActivity2);
        ValidateDniViewModel validateDniViewModel4 = this.mViewModel;
        if (validateDniViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        IDNowOnboardingConfiguration onboardingConfiguration4 = validateDniViewModel4.getOnboardingConfiguration();
        if (onboardingConfiguration4 == null) {
            Intrinsics.throwNpe();
        }
        IDReintentServicesImpl.GenerateUpdateEnrollmentReintentNewsResult generateUpdateEnrollmentReintentNewsResultGenerateUpdateEnrollmentReintenNews = iDReintentServicesImpl.generateUpdateEnrollmentReintenNews(validateDniActivity, validateDniActivity2, commonParamsRequest, commonUserDataRequest, str2, deviceUUID, str, onboardingConfiguration4.additionalHeaders);
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = Intrinsics.areEqual(str, "DNIFRONTNOTVALID") ? IDStepResponseCodes.STEP_RESULT_DOCUMENT_MAX_LOCAL_ATTEMPS : IDStepResponseCodes.STEP_RESULT_DOCUMENT_BACK_MAX_LOCAL_ATTEMPS;
        IDReintentServices.updateEnrollmentReintenNews(validateDniActivity, validateDniActivity2, new UpdateEnrollmentReintenNewsCallback() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.updateEnrollmentsReintentsNews.1
            @Override // com.ticnow.sdk.idnowonboarding.services.reintents.reintentsCallbacks.UpdateEnrollmentReintenNewsCallback
            public final void onUpdateEnrollmentReintenNewsResponse(IdNowCommonResponse idNowCommonResponse, IDEnrollmentResponseCodes iDEnrollmentResponseCodes) {
                ValidateDniActivity.this.setResult(intRef.element, new Intent());
                ValidateDniActivity.this.finish();
            }
        }, generateUpdateEnrollmentReintentNewsResultGenerateUpdateEnrollmentReintenNews);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateDni() {
        ValidateDniViewModel validateDniViewModel = this.mViewModel;
        if (validateDniViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        if (Intrinsics.areEqual((Object) validateDniViewModel.getFrontReady(), (Object) true)) {
            ValidateDniViewModel validateDniViewModel2 = this.mViewModel;
            if (validateDniViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            if (Intrinsics.areEqual((Object) validateDniViewModel2.getBackReady(), (Object) true)) {
                IDStepServicesImpl iDStepServicesImpl = new IDStepServicesImpl();
                IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
                ValidateDniActivity validateDniActivity = this;
                ValidateDniActivity validateDniActivity2 = this;
                ValidateDniViewModel validateDniViewModel3 = this.mViewModel;
                if (validateDniViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                IDNowOnboardingConfiguration onboardingConfiguration = validateDniViewModel3.getOnboardingConfiguration();
                if (onboardingConfiguration == null) {
                    Intrinsics.throwNpe();
                }
                CommonParamsRequest commonParamsRequest = onboardingConfiguration.commonParams;
                Intrinsics.checkExpressionValueIsNotNull(commonParamsRequest, "mViewModel.onboardingConfiguration!!.commonParams");
                ValidateDniViewModel validateDniViewModel4 = this.mViewModel;
                if (validateDniViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                EnrollPath stepParams = validateDniViewModel4.getStepParams();
                if (stepParams == null) {
                    Intrinsics.throwNpe();
                }
                String id = stepParams.getId();
                String deviceUUID = iDSecurityApiImpl.getDeviceUUID(validateDniActivity, validateDniActivity2);
                ValidateDniViewModel validateDniViewModel5 = this.mViewModel;
                if (validateDniViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                IDNowOnboardingConfiguration onboardingConfiguration2 = validateDniViewModel5.getOnboardingConfiguration();
                if (onboardingConfiguration2 == null) {
                    Intrinsics.throwNpe();
                }
                String str = onboardingConfiguration2.country;
                Intrinsics.checkExpressionValueIsNotNull(str, "mViewModel.onboardingConfiguration!!.country");
                ValidateDniViewModel validateDniViewModel6 = this.mViewModel;
                if (validateDniViewModel6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                IDNowOnboardingConfiguration onboardingConfiguration3 = validateDniViewModel6.getOnboardingConfiguration();
                if (onboardingConfiguration3 == null) {
                    Intrinsics.throwNpe();
                }
                IDStepServicesImpl.GenerateAnalizeDniRequestResult generateAnalizeDniRequestResultGenerateAnalizeDniRequest = iDStepServicesImpl.generateAnalizeDniRequest(validateDniActivity, validateDniActivity2, commonParamsRequest, id, deviceUUID, str, onboardingConfiguration3.additionalHeaders);
                IDAnalizeDniRequest analizeDniRequest = generateAnalizeDniRequestResultGenerateAnalizeDniRequest.getAnalizeDniRequest();
                if (analizeDniRequest == null) {
                    Intrinsics.throwNpe();
                }
                ArrayList<KeyValue> headers = generateAnalizeDniRequestResultGenerateAnalizeDniRequest.getHeaders();
                if (headers == null) {
                    Intrinsics.throwNpe();
                }
                ValidateDniViewModel validateDniViewModel7 = this.mViewModel;
                if (validateDniViewModel7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                String dniFrontalPath = validateDniViewModel7.getDniFrontalPath();
                if (dniFrontalPath == null) {
                    Intrinsics.throwNpe();
                }
                ValidateDniViewModel validateDniViewModel8 = this.mViewModel;
                if (validateDniViewModel8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                String dniBackPath = validateDniViewModel8.getDniBackPath();
                if (dniBackPath == null) {
                    Intrinsics.throwNpe();
                }
                new FinalAnalizeDni(analizeDniRequest, validateDniActivity, headers, dniFrontalPath, dniBackPath, new C12821(this)).makeCall();
                return;
            }
        }
        ValidateDniViewModel validateDniViewModel9 = this.mViewModel;
        if (validateDniViewModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        Boolean frontReady = validateDniViewModel9.getFrontReady();
        if (frontReady == null) {
            Intrinsics.throwNpe();
        }
        if (!frontReady.booleanValue()) {
            runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.validateDni.2
                @Override // java.lang.Runnable
                public final void run() {
                    ValidateDniActivity validateDniActivity3 = ValidateDniActivity.this;
                    validateDniActivity3.shake(ValidateDniActivity.access$getImageViewDniFrontPicture$p(validateDniActivity3));
                }
            });
        }
        ValidateDniViewModel validateDniViewModel10 = this.mViewModel;
        if (validateDniViewModel10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        Boolean backReady = validateDniViewModel10.getBackReady();
        if (backReady == null) {
            Intrinsics.throwNpe();
        }
        if (backReady.booleanValue()) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.validateDni.3
            @Override // java.lang.Runnable
            public final void run() {
                ValidateDniActivity validateDniActivity3 = ValidateDniActivity.this;
                validateDniActivity3.shake(ValidateDniActivity.access$getImageViewDniBackPicture$p(validateDniActivity3));
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
            String strQd = C1561oA.Qd("ub(eI", (short) (C1633zX.Xd() ^ ((735674794 ^ 902866603) ^ (-503916745))));
            String strZd = C1593ug.zd("O>", (short) (C1580rY.Xd() ^ (1745872763 ^ (-1745866348))), (short) (C1580rY.Xd() ^ ((1487079382 ^ 1416782553) ^ (-215035998))));
            try {
                Class<?> cls = Class.forName(strQd);
                Field field = 0 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strOd = C1561oA.od("\u0003o5rV", (short) (C1633zX.Xd() ^ (710020590 ^ (-710017085))));
                String strKd = C1561oA.Kd(";)", (short) (OY.Xd() ^ ((721698198 ^ 1823369008) ^ 1202348082)));
                try {
                    Class<?> cls2 = Class.forName(strOd);
                    Field field2 = 0 != 0 ? cls2.getField(strKd) : cls2.getDeclaredField(strKd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strZd2 = Wg.Zd(",c`>Y", (short) (OY.Xd() ^ (2126379054 ^ 2126375518)), (short) (OY.Xd() ^ (1003008264 ^ 1003007263)));
                    String strXd = C1561oA.Xd("2(", (short) (C1633zX.Xd() ^ ((1678726497 ^ 302620894) ^ (-1980153315))));
                    try {
                        Class<?> cls3 = Class.forName(strZd2);
                        Field field3 = 0 != 0 ? cls3.getField(strXd) : cls3.getDeclaredField(strXd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        short sXd = (short) (FB.Xd() ^ (1132797073 ^ 1132798569));
                        int[] iArr = new int["\nx@\fe".length()];
                        QB qb = new QB("\nx@\fe");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                            i2++;
                        }
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Qg.kd("w\u0003", (short) (Od.Xd() ^ ((1099451720 ^ 268706911) ^ (-1368144658))), (short) (Od.Xd() ^ (959883816 ^ (-959902935)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {hg.Vd("\u001f\u0010\u0014\t\u0013\u001a", (short) (C1499aX.Xd() ^ ((1728829303 ^ 197447751) ^ (-1825505602))), (short) (C1499aX.Xd() ^ (1431075477 ^ (-1431069756))))};
                                Method method = Class.forName(C1561oA.ud("DPERNGA\n>IGL<DI\u0002\u0016A?D4FA", (short) (OY.Xd() ^ ((276211847 ^ 2097119433) ^ 1820933753)))).getMethod(C1561oA.Yd("YXhHojl^gNaothcf", (short) (FB.Xd() ^ (374690958 ^ 374670179))), Class.forName(C1561oA.yd("TJ^H\u0014QEQI\u000f3SPFJB", (short) (FB.Xd() ^ ((481699525 ^ 1473612308) ^ 1264842525)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strQd2 = Xg.qd("ZI\u0011P6", (short) (OY.Xd() ^ ((1040389937 ^ 189021843) ^ 893855257)), (short) (OY.Xd() ^ (917267622 ^ 917245299)));
                                    String strWd = Jg.Wd(" N", (short) (C1633zX.Xd() ^ ((289532046 ^ 1120059975) ^ (-1401099146))), (short) (C1633zX.Xd() ^ (1179880281 ^ (-1179877905))));
                                    try {
                                        Class<?> cls4 = Class.forName(strQd2);
                                        Field field4 = 0 != 0 ? cls4.getField(strWd) : cls4.getDeclaredField(strWd);
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
                    String strXd2 = ZO.xd("(\u0007HqQ", (short) (OY.Xd() ^ ((1465662296 ^ 750540092) ^ 2078281557)), (short) (OY.Xd() ^ (920273392 ^ 920279864)));
                    String strUd = C1626yg.Ud("\u001f5", (short) (C1607wl.Xd() ^ ((172400876 ^ 898838155) ^ 1070988898)), (short) (C1607wl.Xd() ^ (2042721600 ^ 2042708572)));
                    try {
                        Class<?> cls5 = Class.forName(strXd2);
                        Field field5 = 0 != 0 ? cls5.getField(strUd) : cls5.getDeclaredField(strUd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        short sXd2 = (short) (Od.Xd() ^ (135850819 ^ (-135834481)));
                        int[] iArr2 = new int["j\n~]#".length()];
                        QB qb2 = new QB("j\n~]#");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd2 + i3)));
                            i3++;
                        }
                        String str = new String(iArr2, 0, i3);
                        short sXd3 = (short) (C1499aX.Xd() ^ (1810876136 ^ (-1810886643)));
                        int[] iArr3 = new int["#]".length()];
                        QB qb3 = new QB("#]");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i4)) + xuXd3.CK(iKK3));
                            i4++;
                        }
                        String str2 = new String(iArr3, 0, i4);
                        try {
                            Class<?> cls6 = Class.forName(str);
                            Field field6 = 0 != 0 ? cls6.getField(str2) : cls6.getDeclaredField(str2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i5 = 521722937 ^ 521722994;
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

    public final void initRegulaSDK() throws Throwable {
        short sXd = (short) (C1499aX.Xd() ^ (-2888));
        int[] iArr = new int["GYZg]QB28\f^MNVHXNS\u0003DBCJ\u0018|".length()];
        QB qb = new QB("GYZg]QB28\f^MNVHXNS\u0003DBCJ\u0018|");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strZd = C1593ug.zd("\u001d14C;1$\u0016\u001esH9<F:LDK|DQOOV\u001d\u0004", (short) (ZN.Xd() ^ 9868), (short) (ZN.Xd() ^ 29299));
        String strOd = C1561oA.od("z\r\u000e\u001b\u0011\u0005uek?\u000e\u0010\u0006\u0001\t\u000ey\f\u007f\u0005\u0003M2", (short) (C1607wl.Xd() ^ 27555));
        String strKd = C1561oA.Kd("Sgjyqg'trmpzpsI\u001a1", (short) (Od.Xd() ^ (-15419)));
        try {
            String str2 = this.TAG;
            Wg.Zd("36$\"X>D\u0019\"\fT9\u0015o", (short) (Od.Xd() ^ (-6406)), (short) (Od.Xd() ^ (-10450)));
            String str3 = this.TAG;
            StringBuilder sb = new StringBuilder(strKd);
            ValidateDniViewModel validateDniViewModel = this.mViewModel;
            String strXd = C1561oA.Xd("gQebuLoego", (short) (OY.Xd() ^ 1161));
            if (validateDniViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException(strXd);
            }
            IDNowOnboardingConfiguration onboardingConfiguration = validateDniViewModel.getOnboardingConfiguration();
            sb.append(onboardingConfiguration != null ? onboardingConfiguration.regulaLicenseText : null).toString();
            String str4 = this.TAG;
            StringBuilder sb2 = new StringBuilder(strOd);
            ValidateDniViewModel validateDniViewModel2 = this.mViewModel;
            if (validateDniViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(strXd);
            }
            IDNowOnboardingConfiguration onboardingConfiguration2 = validateDniViewModel2.getOnboardingConfiguration();
            sb2.append(onboardingConfiguration2 != null ? onboardingConfiguration2.regulaOrientation : null).toString();
            String str5 = this.TAG;
            StringBuilder sb3 = new StringBuilder(strZd);
            ValidateDniViewModel validateDniViewModel3 = this.mViewModel;
            if (validateDniViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(strXd);
            }
            IDNowOnboardingConfiguration onboardingConfiguration3 = validateDniViewModel3.getOnboardingConfiguration();
            sb3.append(onboardingConfiguration3 != null ? onboardingConfiguration3.regulaScenarioFront : null).toString();
            String str6 = this.TAG;
            StringBuilder sb4 = new StringBuilder(str);
            ValidateDniViewModel validateDniViewModel4 = this.mViewModel;
            if (validateDniViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(strXd);
            }
            IDNowOnboardingConfiguration onboardingConfiguration4 = validateDniViewModel4.getOnboardingConfiguration();
            sb4.append(onboardingConfiguration4 != null ? onboardingConfiguration4.regulaScenarioBack : null).toString();
            ValidateDniViewModel validateDniViewModel5 = this.mViewModel;
            if (validateDniViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(strXd);
            }
            IDNowOnboardingConfiguration onboardingConfiguration5 = validateDniViewModel5.getOnboardingConfiguration();
            String str7 = onboardingConfiguration5 != null ? onboardingConfiguration5.regulaLicenseText : null;
            Class<?> cls = Class.forName(Wg.vd("LZQ`VQM\u0018XXNR\r\"BU`21", (short) (ZN.Xd() ^ 3651)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(Qg.kd("NDXB\u000eK?KC\t-MJ@D<", (short) (ZN.Xd() ^ 62), (short) (ZN.Xd() ^ 19642)));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {str7, 0};
            Method declaredMethod = cls.getDeclaredMethod(hg.Vd("HHEPDD", (short) (C1607wl.Xd() ^ 16973), (short) (C1607wl.Xd() ^ OlympusImageProcessingMakernoteDirectory.TagFaceDetectFrameCrop)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                DocumentReader.Instance().initializeReader(getApplicationContext(), (byte[]) declaredMethod.invoke(null, objArr), new C12721());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            String str8 = this.TAG;
            C1561oA.ud("Gkeo\u001aK]^kaUF6<\u0010T`_[]", (short) (OY.Xd() ^ 6454));
            runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.initRegulaSDK.2
                @Override // java.lang.Runnable
                public final void run() {
                    ValidateDniActivity.this.progressDialog.getDialog().dismiss();
                    FragmentManager supportFragmentManager = ValidateDniActivity.this.getSupportFragmentManager();
                    ValidateDniActivity validateDniActivity = ValidateDniActivity.this;
                    IDDialog.showDialog(supportFragmentManager, validateDniActivity, validateDniActivity, "Error interno", "Por favor intente nuevamente", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.initRegulaSDK.2.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Callback.onClick_enter(view);
                            try {
                                ValidateDniActivity.this.setResult(170054, new Intent());
                                ValidateDniActivity.this.finish();
                            } finally {
                                Callback.onClick_exit();
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        String it;
        String it2;
        super.onActivityResult(i2, i3, intent);
        runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onActivityResult.1
            @Override // java.lang.Runnable
            public final void run() {
                ValidateDniActivity.this.progressDialog.show(ValidateDniActivity.this);
            }
        });
        ImageView imageView = this.imageViewClose;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageViewClose");
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onActivityResult.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    FragmentManager supportFragmentManager = ValidateDniActivity.this.getSupportFragmentManager();
                    ValidateDniActivity validateDniActivity = ValidateDniActivity.this;
                    IDDialog.showDialog(supportFragmentManager, validateDniActivity, validateDniActivity, "", "¿Desea cerrar sesión?", "Aceptar", "Cancelar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onActivityResult.2.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Callback.onClick_enter(view2);
                            try {
                                new DataCleaner().deleteDniFiles(ValidateDniActivity.this);
                                ValidateDniActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_USER_CANCELLED_ONBOARDING, new Intent());
                                ValidateDniActivity.this.finish();
                            } finally {
                                Callback.onClick_exit();
                            }
                        }
                    }, new DialogInterface.OnDismissListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onActivityResult.2.2
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                        }
                    }, new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onActivityResult.2.3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Callback.onClick_enter(view2);
                            try {
                            } finally {
                                Callback.onClick_exit();
                            }
                        }
                    });
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        if (i3 == RegulaActivity.Companion.getREGULA_ACTIVITY_RESPONSE_CODE_CANCEL()) {
            this.progressDialog.getDialog().dismiss();
            return;
        }
        if (i3 == RegulaActivity.Companion.getREGULA_ACTIVITY_RESPONSE_CODE_GENERAL_ERROR()) {
            runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onActivityResult.3
                @Override // java.lang.Runnable
                public final void run() {
                    ValidateDniActivity.this.progressDialog.getDialog().dismiss();
                    FragmentManager supportFragmentManager = ValidateDniActivity.this.getSupportFragmentManager();
                    ValidateDniActivity validateDniActivity = ValidateDniActivity.this;
                    IDDialog.showDialog(supportFragmentManager, validateDniActivity, validateDniActivity, "Error interno", "Por favor intente nuevamente", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onActivityResult.3.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Callback.onClick_enter(view);
                            try {
                            } finally {
                                Callback.onClick_exit();
                            }
                        }
                    });
                }
            });
            return;
        }
        if (i2 == RegulaActivity.Companion.getREGULA_ACTIVITY_REQUEST_CODE_FRONT_PICTURE()) {
            try {
                if (i3 == RegulaActivity.Companion.getREGULA_ACTIVITY_RESPONSE_CODE_PICTURE_OK()) {
                    this.progressDialog.getDialog().dismiss();
                    if (intent != null && (it = intent.getStringExtra("path")) != null) {
                        Intrinsics.checkExpressionValueIsNotNull(it, "it");
                        successFrontCheck(it);
                    }
                } else {
                    this.progressDialog.getDialog().dismiss();
                    failedFrontCheck();
                }
                return;
            } catch (Exception unused) {
                this.progressDialog.getDialog().dismiss();
                failedFrontCheck();
                return;
            }
        }
        if (i2 != RegulaActivity.Companion.getREGULA_ACTIVITY_REQUEST_CODE_BACK_PICTURE()) {
            this.progressDialog.getDialog().dismiss();
            return;
        }
        try {
            if (i3 != RegulaActivity.Companion.getREGULA_ACTIVITY_RESPONSE_CODE_PICTURE_OK()) {
                this.progressDialog.getDialog().dismiss();
                failedBackCheck();
                return;
            }
            this.progressDialog.getDialog().dismiss();
            if (intent != null && (it2 = intent.getStringExtra("path")) != null) {
                Intrinsics.checkExpressionValueIsNotNull(it2, "it");
                successBackCheck(it2);
            }
            if (intent != null) {
                ValidateDniViewModel validateDniViewModel = this.mViewModel;
                if (validateDniViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                validateDniViewModel.setBackPdf417(String.valueOf(intent.getStringExtra("backPdf417")));
            }
        } catch (Exception unused2) {
            this.progressDialog.getDialog().dismiss();
            failedBackCheck();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() throws Throwable {
        super.onBackPressed();
        new DataCleaner().deleteDniFiles(this);
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
            setContentView(R.layout.activity_validate_dni);
            animate();
            View viewFindViewById = findViewById(R.id.imageViewDniFrontFrame);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById, "findViewById(R.id.imageViewDniFrontFrame)");
            this.imageViewDniFrontFrame = (ImageView) viewFindViewById;
            View viewFindViewById2 = findViewById(R.id.imageViewDniBackFrame);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById2, "findViewById(R.id.imageViewDniBackFrame)");
            this.imageViewDniBackFrame = (ImageView) viewFindViewById2;
            View viewFindViewById3 = findViewById(R.id.imageViewDniFrontCheck);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById3, "findViewById(R.id.imageViewDniFrontCheck)");
            this.imageViewDniFrontCheck = (ImageView) viewFindViewById3;
            View viewFindViewById4 = findViewById(R.id.imageViewDniBackCheck);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById4, "findViewById(R.id.imageViewDniBackCheck)");
            this.imageViewDniBackCheck = (ImageView) viewFindViewById4;
            View viewFindViewById5 = findViewById(R.id.imageViewDniFrontPicture);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById5, "findViewById(R.id.imageViewDniFrontPicture)");
            this.imageViewDniFrontPicture = (ImageView) viewFindViewById5;
            View viewFindViewById6 = findViewById(R.id.imageViewDniBackPicture);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById6, "findViewById(R.id.imageViewDniBackPicture)");
            this.imageViewDniBackPicture = (ImageView) viewFindViewById6;
            View viewFindViewById7 = findViewById(R.id.imageViewBack);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById7, "findViewById(R.id.imageViewBack)");
            this.imageViewBack = (ImageView) viewFindViewById7;
            View viewFindViewById8 = findViewById(R.id.imageViewClose);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById8, "findViewById(R.id.imageViewClose)");
            this.imageViewClose = (ImageView) viewFindViewById8;
            View viewFindViewById9 = findViewById(R.id.buttonContinue);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById9, "findViewById(R.id.buttonContinue)");
            this.buttonContinue = (Button) viewFindViewById9;
            ViewModel viewModel = ViewModelProviders.of(this).get((Class<ViewModel>) ValidateDniViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(th…DniViewModel::class.java)");
            ValidateDniViewModel validateDniViewModel = (ValidateDniViewModel) viewModel;
            this.mViewModel = validateDniViewModel;
            if (validateDniViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            if (validateDniViewModel.getOnboardingConfiguration() == null) {
                ValidateDniViewModel validateDniViewModel2 = this.mViewModel;
                if (validateDniViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                Serializable serializableExtra = getIntent().getSerializableExtra("configuration");
                if (serializableExtra == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration");
                }
                validateDniViewModel2.setOnboardingConfiguration((IDNowOnboardingConfiguration) serializableExtra);
            }
            ValidateDniViewModel validateDniViewModel3 = this.mViewModel;
            if (validateDniViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            if (validateDniViewModel3.getStepParams() == null) {
                ValidateDniViewModel validateDniViewModel4 = this.mViewModel;
                if (validateDniViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                Serializable serializableExtra2 = getIntent().getSerializableExtra("stepparams");
                if (serializableExtra2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath");
                }
                validateDniViewModel4.setStepParams((EnrollPath) serializableExtra2);
            }
            ValidateDniViewModel validateDniViewModel5 = this.mViewModel;
            if (validateDniViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            Boolean frontReady = validateDniViewModel5.getFrontReady();
            if (Intrinsics.areEqual((Object) frontReady, (Object) true)) {
                ImageView imageView = this.imageViewDniFrontCheck;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageViewDniFrontCheck");
                }
                imageView.setImageResource(R.drawable.ic_success_dav);
                ImageView imageView2 = this.imageViewDniFrontPicture;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageViewDniFrontPicture");
                }
                ValidateDniViewModel validateDniViewModel6 = this.mViewModel;
                if (validateDniViewModel6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(validateDniViewModel6.getDniFrontalPath());
                Intrinsics.checkExpressionValueIsNotNull(bitmapDecodeFile, "BitmapFactory.decodeFile…ViewModel.dniFrontalPath)");
                imageView2.setBackground(roundedBitmap(bitmapDecodeFile));
            } else if (Intrinsics.areEqual((Object) frontReady, (Object) false)) {
                ImageView imageView3 = this.imageViewDniFrontCheck;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageViewDniFrontCheck");
                }
                imageView3.setImageResource(R.drawable.ic_failed_dav);
            } else {
                ImageView imageView4 = this.imageViewDniFrontCheck;
                if (imageView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageViewDniFrontCheck");
                }
                imageView4.setImageResource(R.drawable.ic_null);
            }
            ImageView imageView5 = this.imageViewDniFrontPicture;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageViewDniFrontPicture");
            }
            imageView5.setColorFilter(Color.parseColor("#f4c844"), PorterDuff.Mode.SRC_ATOP);
            ValidateDniViewModel validateDniViewModel7 = this.mViewModel;
            if (validateDniViewModel7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            Boolean backReady = validateDniViewModel7.getBackReady();
            if (Intrinsics.areEqual((Object) backReady, (Object) true)) {
                ImageView imageView6 = this.imageViewDniBackCheck;
                if (imageView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageViewDniBackCheck");
                }
                imageView6.setImageResource(R.drawable.ic_success_dav);
                ImageView imageView7 = this.imageViewDniBackPicture;
                if (imageView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageViewDniBackPicture");
                }
                ValidateDniViewModel validateDniViewModel8 = this.mViewModel;
                if (validateDniViewModel8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                }
                Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(validateDniViewModel8.getDniBackPath());
                Intrinsics.checkExpressionValueIsNotNull(bitmapDecodeFile2, "BitmapFactory.decodeFile(mViewModel.dniBackPath)");
                imageView7.setBackground(roundedBitmap(bitmapDecodeFile2));
            } else if (Intrinsics.areEqual((Object) backReady, (Object) false)) {
                ImageView imageView8 = this.imageViewDniBackCheck;
                if (imageView8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageViewDniBackCheck");
                }
                imageView8.setImageResource(R.drawable.ic_failed_dav);
            } else {
                ImageView imageView9 = this.imageViewDniBackCheck;
                if (imageView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageViewDniBackCheck");
                }
                imageView9.setImageResource(R.drawable.ic_null);
            }
            ImageView imageView10 = this.imageViewDniBackPicture;
            if (imageView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageViewDniBackPicture");
            }
            imageView10.setColorFilter(Color.parseColor("#f4c844"), PorterDuff.Mode.LIGHTEN);
            ImageView imageView11 = this.imageViewDniFrontPicture;
            if (imageView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageViewDniFrontPicture");
            }
            imageView11.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onCreate.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Exception {
                    Callback.onClick_enter(view);
                    try {
                        Intent intent = new Intent(ValidateDniActivity.this, (Class<?>) RegulaActivity.class);
                        IDNowOnboardingConfiguration onboardingConfiguration = ValidateDniActivity.access$getMViewModel$p(ValidateDniActivity.this).getOnboardingConfiguration();
                        if (onboardingConfiguration == null) {
                            Intrinsics.throwNpe();
                        }
                        intent.putExtra("regulaScenario", onboardingConfiguration.regulaScenarioFront);
                        IDNowOnboardingConfiguration onboardingConfiguration2 = ValidateDniActivity.access$getMViewModel$p(ValidateDniActivity.this).getOnboardingConfiguration();
                        if (onboardingConfiguration2 == null) {
                            Intrinsics.throwNpe();
                        }
                        intent.putExtra("regulaOrientation", onboardingConfiguration2.regulaOrientation);
                        intent.putExtra(RegulaActivity.Companion.getREGULA_ACTIVITY_KEY_EXTRA_REQUEST_CODE(), RegulaActivity.Companion.getREGULA_ACTIVITY_REQUEST_CODE_FRONT_PICTURE());
                        ValidateDniActivity validateDniActivity = ValidateDniActivity.this;
                        int regula_activity_request_code_front_picture = RegulaActivity.Companion.getREGULA_ACTIVITY_REQUEST_CODE_FRONT_PICTURE();
                        CX.ud();
                        validateDniActivity.startActivityForResult(intent, regula_activity_request_code_front_picture);
                    } finally {
                        Callback.onClick_exit();
                    }
                }
            });
            ImageView imageView12 = this.imageViewDniBackPicture;
            if (imageView12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageViewDniBackPicture");
            }
            imageView12.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onCreate.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Exception {
                    Callback.onClick_enter(view);
                    try {
                        Intent intent = new Intent(ValidateDniActivity.this, (Class<?>) RegulaActivity.class);
                        IDNowOnboardingConfiguration onboardingConfiguration = ValidateDniActivity.access$getMViewModel$p(ValidateDniActivity.this).getOnboardingConfiguration();
                        if (onboardingConfiguration == null) {
                            Intrinsics.throwNpe();
                        }
                        intent.putExtra("regulaScenario", onboardingConfiguration.regulaScenarioBack);
                        IDNowOnboardingConfiguration onboardingConfiguration2 = ValidateDniActivity.access$getMViewModel$p(ValidateDniActivity.this).getOnboardingConfiguration();
                        if (onboardingConfiguration2 == null) {
                            Intrinsics.throwNpe();
                        }
                        intent.putExtra("regulaOrientation", onboardingConfiguration2.regulaOrientation);
                        intent.putExtra(RegulaActivity.Companion.getREGULA_ACTIVITY_KEY_EXTRA_REQUEST_CODE(), RegulaActivity.Companion.getREGULA_ACTIVITY_REQUEST_CODE_BACK_PICTURE());
                        ValidateDniActivity validateDniActivity = ValidateDniActivity.this;
                        int regula_activity_request_code_back_picture = RegulaActivity.Companion.getREGULA_ACTIVITY_REQUEST_CODE_BACK_PICTURE();
                        CX.ud();
                        validateDniActivity.startActivityForResult(intent, regula_activity_request_code_back_picture);
                    } finally {
                        Callback.onClick_exit();
                    }
                }
            });
            ImageView imageView13 = this.imageViewBack;
            if (imageView13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageViewBack");
            }
            imageView13.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onCreate.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.onClick_enter(view);
                    try {
                        ValidateDniActivity.this.onBackPressed();
                    } finally {
                        Callback.onClick_exit();
                    }
                }
            });
            ImageView imageView14 = this.imageViewClose;
            if (imageView14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageViewClose");
            }
            imageView14.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onCreate.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.onClick_enter(view);
                    try {
                        Dialog.INSTANCE.show(ValidateDniActivity.this.getSupportFragmentManager(), ValidateDniActivity.this, "", "¿Desea cerrar sesión?", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onCreate.4.1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Callback.onClick_enter(view2);
                                try {
                                    new DataCleaner().deleteDniFiles(ValidateDniActivity.this);
                                    ValidateDniActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_USER_CANCELLED_ONBOARDING, new Intent());
                                    ValidateDniActivity.this.finish();
                                } finally {
                                    Callback.onClick_exit();
                                }
                            }
                        }, "Cancelar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onCreate.4.2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Callback.onClick_enter(view2);
                                try {
                                } finally {
                                    Callback.onClick_exit();
                                }
                            }
                        }, new DialogInterface.OnDismissListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onCreate.4.3
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
            button.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onCreate.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.onClick_enter(view);
                    try {
                        ValidateDniActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onCreate.5.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ValidateDniActivity.this.progressDialog.show(ValidateDniActivity.this, "Cargando");
                            }
                        });
                        ValidateDniActivity validateDniActivity = ValidateDniActivity.this;
                        FragmentManager supportFragmentManager = validateDniActivity.getSupportFragmentManager();
                        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
                        new IdNowConnectionChecker(validateDniActivity, supportFragmentManager, new Function0<Unit>() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onCreate.5.2
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
                                ValidateDniActivity.this.validateDni();
                            }
                        }).check();
                    } finally {
                        Callback.onClick_exit();
                    }
                }
            });
            this.progressDialog.show(this);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
            new IdNowConnectionChecker(this, supportFragmentManager, new Function0<Unit>() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onCreate.6
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws Throwable {
                    ValidateDniActivity.this.initRegulaSDK();
                }
            }).check();
            checkButtonContinue();
        } catch (Exception e2) {
            String str = "OnCreate - Catch" + e2;
            Dialog.INSTANCE.show(getSupportFragmentManager(), this, "Error interno", "Intente nuevamente", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onCreate.7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.onClick_enter(view);
                    try {
                        ValidateDniActivity.this.runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.onCreate.7.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ValidateDniActivity.this.progressDialog.getDialog().dismiss();
                                ValidateDniActivity.this.setResult(170008, new Intent());
                                ValidateDniActivity.this.finish();
                            }
                        });
                    } finally {
                        Callback.onClick_exit();
                    }
                }
            });
        }
    }

    public final Uri resourceUri(Context context, int i2) throws Throwable {
        short sXd = (short) (ZN.Xd() ^ 5384);
        int[] iArr = new int["tF;=HyI=<9@>03$B*".length()];
        QB qb = new QB("tF;=HyI=<9@>03$B*");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i3));
            i3++;
        }
        Intrinsics.checkParameterIsNotNull(context, new String(iArr, 0, i3));
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("x\u0007}\r\u000b\u0006\u0002L\u0003\u0010\u0010\u0017\t\u0013\u001aTj\u0018\u0018\u001f\u0011%\"", (short) (FB.Xd() ^ 28163))).getMethod(Xg.qd("vu\u0006dx\b\u0005\f\n{~\u000e", (short) (OY.Xd() ^ 27768), (short) (OY.Xd() ^ 3114)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            Uri.Builder builder = new Uri.Builder();
            short sXd2 = (short) (FB.Xd() ^ 5308);
            short sXd3 = (short) (FB.Xd() ^ 19429);
            int[] iArr2 = new int["i\bl*\u001c\u0015?}qSb\u0012\u0007\u0015\u0019\u001a".length()];
            QB qb2 = new QB("i\bl*\u001c\u0015?}qSb\u0012\u0007\u0015\u0019\u001a");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((i4 * sXd3) ^ sXd2));
                i4++;
            }
            Uri uriBuild = builder.scheme(new String(iArr2, 0, i4)).authority(resources.getResourcePackageName(i2)).appendPath(resources.getResourceTypeName(i2)).appendPath(resources.getResourceEntryName(i2)).build();
            Intrinsics.checkExpressionValueIsNotNull(uriBuild, ZO.xd(":uVux\u00051C\u0016FIC$}\u000fujQ`, \fF\u0001\udd45MyKD\u000b;c\u0016?\u0013\t\u001f/\u00041j}//8mCRuk", (short) (ZN.Xd() ^ 27980), (short) (ZN.Xd() ^ 25086)));
            short sXd4 = (short) (FB.Xd() ^ 27097);
            short sXd5 = (short) (FB.Xd() ^ 239);
            int[] iArr3 = new int["\b\u0006(;>\u001e}6\"[<\u000f!f!w\u0006,\u0006T]sf[ﶿ\n'2\u0002g\u00143Ry\u0004y#z\u001e^\u0019=QE\u0015Y$3LC".length()];
            QB qb3 = new QB("\b\u0006(;>\u001e}6\"[<\u000f!f!w\u0006,\u0006T]sf[ﶿ\n'2\u0002g\u00143Ry\u0004y#z\u001e^\u0019=QE\u0015Y$3LC");
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + (i5 * sXd5))) + xuXd3.CK(iKK3));
                i5++;
            }
            Intrinsics.checkExpressionValueIsNotNull(uriBuild, new String(iArr3, 0, i5));
            return uriBuild;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void stepResult(String result, ArrayList<KeyValue> arrayList) {
        Intrinsics.checkParameterIsNotNull(result, "result");
        Intent intent = new Intent();
        int iHashCode = result.hashCode();
        if (iHashCode != 1570) {
            if (iHashCode != 1601) {
                if (iHashCode != 1724) {
                    if (iHashCode != 1761) {
                        if (iHashCode != 3548) {
                            if (iHashCode != 3135262) {
                                if (iHashCode == 92611376 && result.equals("abort")) {
                                    setResult(IDStepResponseCodes.STEP_RESULT_ABORT_FLOW, intent);
                                }
                            } else if (result.equals("fail")) {
                                setResult(IDStepResponseCodes.STEP_RESULT_FAIL, intent);
                            }
                        } else if (result.equals("ok")) {
                            KeyValue keyValue = new KeyValue();
                            keyValue.setKey("ID_FRONT_PATH");
                            ValidateDniViewModel validateDniViewModel = this.mViewModel;
                            if (validateDniViewModel == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                            }
                            String dniFrontalPath = validateDniViewModel.getDniFrontalPath();
                            if (dniFrontalPath == null) {
                                Intrinsics.throwNpe();
                            }
                            keyValue.setValue(dniFrontalPath);
                            KeyValue keyValue2 = new KeyValue();
                            keyValue2.setKey("ID_BACK_PATH");
                            ValidateDniViewModel validateDniViewModel2 = this.mViewModel;
                            if (validateDniViewModel2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                            }
                            String dniBackPath = validateDniViewModel2.getDniBackPath();
                            if (dniBackPath == null) {
                                Intrinsics.throwNpe();
                            }
                            keyValue2.setValue(dniBackPath);
                            if (arrayList != null) {
                                arrayList.add(keyValue);
                                arrayList.add(keyValue2);
                                intent.putExtra("additionalParams", arrayList);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(keyValue);
                                arrayList2.add(keyValue2);
                                intent.putExtra("additionalParams", arrayList2);
                            }
                            setResult(IDStepResponseCodes.STEP_RESULT_OK, intent);
                        }
                    } else if (result.equals("78")) {
                        setResult(IDStepResponseCodes.STEP_RESULT_DOCUMENT_QUALITY_FAIL, intent);
                    }
                } else if (result.equals("62")) {
                    setResult(IDStepResponseCodes.STEP_RESULT_DOCUMENT_QUALITY_FAIL, intent);
                }
            } else if (result.equals("23")) {
                setResult(IDStepResponseCodes.STEP_RESULT_DOCUMENT_NOT_MATCH, intent);
            }
        } else if (result.equals("13")) {
            setResult(IDStepResponseCodes.STEP_RESULT_DOCUMENT_INTEGRITY_FAIL, intent);
        }
        runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.ValidateDniActivity.stepResult.1
            @Override // java.lang.Runnable
            public final void run() {
                ValidateDniActivity.this.progressDialog.getDialog().dismiss();
            }
        });
        finish();
    }
}
