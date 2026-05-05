package com.transmit.authentication.gen;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.transmit.authentication.AuthenticationResult;
import com.transmit.authentication.RegistrationResult;
import com.transmit.authentication.TSAuthCallback;
import com.transmit.authentication.TSDeviceInfoError;
import com.transmit.authentication.TSWebAuthnAuthenticationError;
import com.transmit.authentication.TSWebAuthnRegistrationError;
import com.transmit.authentication.network.NetworkApiError;
import com.transmit.authentication.network.completeauth.CompleteAuthenticationResult;
import com.transmit.authentication.network.completeauth.TSPublicKeyCredential;
import com.transmit.authentication.network.completereg.CompleteRegistrationResult;
import com.transmit.authentication.network.completereg.DeviceInfo;
import com.transmit.authentication.network.completereg.TSRegPublicKeyCredential;
import com.transmit.authentication.network.startauth.CredentialRequestOptions;
import com.transmit.authentication.network.startauth.StartAuthenticationPayload;
import com.transmit.authentication.network.startauth.TSStartAuthenticationServerProvider;
import com.transmit.authentication.network.startregister.CredentialCreationOptions;
import com.transmit.authentication.network.startregister.StartRegistrationPayload;
import com.transmit.authentication.network.startregister.TSStartRegistrationServerProvider;
import com.transmit.authentication.webauthn.Fido2PasskeyProvider;
import com.transmit.authentication.webauthn.PasskeyProvider;
import com.ts.coresdk.JsonStringConvertor;
import com.ts.coresdk.TSLog;
import com.ts.coresdk.TSNetworkResponse;
import com.ts.coresdk.crypto.api.CryptographyError;
import com.ts.coresdk.crypto.api.CryptographyManager;
import com.ts.coresdk.crypto.api.IKeyPairSCryptographyCallback;
import com.ts.coresdk.crypto.api.RegularKeyPairResult;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
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
@Metadata(bv = {}, d1 = {"Я|\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4\u0012}\u000fnjO0L͜P.hS2şs{J$c$wDCU(}*ޛWN}gvϺb\u000bY\u000f\u000e\u0016\u000fj4Ikxe\u0012\u00152JoU3UoS9htL\u0005(2(9\u0002\u0005\u0017\u001a2H&v\u0003CQ\f\u001a0VpBĥ\u0015M\u0013#\u001a\u0006D \t\u001ergV6NscŽE݊3ipMgz@\u0001[\r^TU\u000e\u0007e,-X7c\u00185W\u0011\u000bj[m\u0006ӭu=\u0013moI9^\fWdn0\u0018#Bg\r\f\u000bVl\u0013jx\u00187-_cyk\u001e*\bz*)j\u001eT\u0006or<J2f6$cx\u0001SXP0_r\u0004\t\u007fN\u0017S\u001fc;G4~]q=)Ne\u001c\u0015\u000f.#/\u0010Ou\u001b\u000e)5)v\u0010Q_gpAVN\"Ykn4\u0001p\u001bB\u0010@I\u0010/*,>\u001957\nUQ;4\"Vg\u007fv3v\u0019WwR`@PoFG8\"$fTf\u0015k~th.!MJu5\u0018P3.\u0001\u0010<O;@R]h\u0002j{^:5=\u007fOe~m\u001eWg\u0004C7ac>\b\u0001\u0011\\MJ\n\u001dX\u0015h\u0004\u0010h\u0005@\"`q1\u0010@\u007fRx$\u0013`j:.BXI\u0019\u000b6x\u000b,oY\u0001\u0019_`i>-\u001b3l\u0015wS\r\t/l\rx}\u0015\u0011M<|f#[o\u00185aPcR\u00014+97\u0003\u0002\u007f_gzH|r$'m}6\u0015H<\u0002?K,'\u000b94\u0012-sg\u0003gaM@C)\u0017BAI\u001bFg6\u0001!0njbO\u0003\u0018Rzl&;\b\u0013\u0003*gT/_ej\n\nAy\u0003\u0011rTZH~\u0015\u001fLE\u0011q2|cNqAe@\u0006IG\u0015\u0010s\u001as<yz\u000fTu\u0016\n:\u0015.qxP\f5kHWr\u0017J2&|\u0003pczy\u0018B7P;M\u0011kr'n8{!_\u0002t\u0007D\r\u001fW\fJ!\t\u0016@>a:sq\u0019$`S%?i\u0002\u0002\u001eqY\u0010#J=\rQ{\u0002\u0003 \"U(t^\u000b\u000bF\u0005\"\u0019dB\u0012أ\u0007Ø\r$<ɶ\r\u0017\u0019Gli4\u0013Ģ\u0004Lgʕ/4H{I_^c\u0007^nH3c҇d'2܀\u0017\u00119(\u0007>\u0002\u0011{Ql/\u00125WҸ)͢\u001fjWƫ719Pl9I+/ۡ\u0017\u0558aCQ\u0379\u0007\u0012U6\u0006m\u0006\u000bf&S܋Nɓ\u001f9YΙ0\u0005>m#WzM\u0013\u0007hש^Ƭ&)\u0007ғM\u001aJ\u001b'\u000bGaIź\u000fυPN\u007f˿\u0014(\u000f*\\+\u001d\u000b+f\u001dɔ9ޅ9-EƖ; 5\u0010oSi\u0001^¹,ڗ\bt)Ƹߏ\u0012\u001e"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@'5bG{G|\u0019.VR?i0-\u0019rj\u0017\u0011l;[\u0001.NL[\u0002", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1kX2a;\"2", "", "0`b2H9E", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{m]J\u0003-3J\u007f)\u0011:]9`[t\u0013W\u0003", "/o_9\\*:b\u001d\t\u0004<6\u0006\u0018/x\u000f", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "5dc\u000fT:>C&\u0006", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010_0>\\(bY", ";@dA[\u001a>a'\u0003\u0005g\u0010{", ";AX;W0GU\b\t\u0001^5", ";Ba2W,Gb\u001dz\u0002<9|\u0005>i\n1eK\u0010\u001b!P}", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu,\u0004'FLW;`Ny\u001b!\u0012V\u001dR5\u0016ndP(xMEt", ";Ba2W,Gb\u001dz\u0002K,\t\u0019/s\u000f\u0012\u0007O\u0005! U", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?Hz0.$k+\u0017\u0014c+N\u007f6KHU\u0019\\^\u0003=\"!D\u0019]/\u0017\u000eg\u0017", ";OP@f2>g\u0004\f\u0005o0{\t<", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@75Vy0Fp\u001fw8?Iy:\u001e)SnC\u0018g+N\u0004|", ";Tb2e\u0015:[\u0019", ";VT/4<MV\"lzl:\u0001\u00138I^", "1n\\=_,MSt\u000f\na,\u0006\u00183c{7\u007fJ\n", "", ">tQ9\\*$S-\\\b^+|\u0012>i{/", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015dqH\n-\u001b<a7DSR*BR\u0007\u001b!\u0012Y\u000eW:\u0011\u0001`\u0017", "1`[9U(<Y", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#5\u000e/:K\u00125T@7i:s", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0001Eh\u0001 @|\u001a,IR?u=\u000b\u0015vq@\u00169", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", "1n\\=_,MS\u0006~|b:\f\u0016+t\u00042\u0005", "1qT1X5MW\u0015\u0006", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015ua;PR\u001a;v)2\\K3`PX=(og\u000eM+\u0016\u0014]=+D", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u00125[\u0002.Fz\u0012=QMDX4,%op\u000f", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", "3wT0h;>E\u0019{vn;\u007f\u0012\u000bu\u000f+{I\u0010\u001b\u0015C~\u0012F\u007f", "3wT0h;>E\u0019{vn;\u007f\u0012\u001ce\u0002,\nO\u000e\u0013&Ky\u0017", "5dc\u0011X=BQ\u0019b\u0004_6", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015ua;PB,_z%G0W-f(", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#8}1;k\u0016\u0012VDEKA+\u001fu7", "5dc\u0011X=BQ\u0019dzr\f\n\u00169r", "9dh\u0012e9H`", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a#Hx>+j", "7rF2U\bNb\u001c\bhn7\b\u0013<t\u007f'", "", "<dcDb9D@\u0019\u0001~l;\n\u0005>i\n1h@\u000f\"!P}\u000e+\u0001\u0005Bf\b-", "3qa<e", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0011{O\u0013!$M\\\u000eJ\u0002/>g}u", "<dcDb9D@\u0019\r\u0006h5\u000b\t\u001eo[8\u000bC`$$Q|", ">qT=T9>E\u0019{vn;\u007f\u0012\u000bu\u000f+{I\u0010\u001b\u0015C~\u0012F\u007f", "CrT?A(FS", ">qT=T9>E\u0019{vn;\u007f\u0012\u001ce\u0002,\nO\u000e\u0013&Ky\u0017", "CrT?a(FS", "2hb=_(RM\"z\u0003^", "AhV;G9:\\'zxm0\u0007\u0012", "AsP?g\u001e>Pt\u000f\na5X\u0019>h\u007f1\u000bD~\u0013&Ky\u0017", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class AuthenticationController {
    private final Context applicationContext;
    private final String baseUrl;
    private final String clientID;
    private String mAuthSessionId;
    private String mBindingToken;
    private CredentialCreationOptions mCredentialCreationOptions;
    private CredentialRequestOptions mCredentialRequestOptions;
    private PasskeyProvider mPasskeyProvider;
    private String mUserName;
    private String mWebAuthnSessionID;

    /* JADX INFO: renamed from: com.transmit.authentication.gen.AuthenticationController$completeAuthentication$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TSAuthCallback<AuthenticationResult, TSWebAuthnAuthenticationError> $callback;
        final /* synthetic */ String $resultBase64;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TSAuthCallback<AuthenticationResult, TSWebAuthnAuthenticationError> tSAuthCallback, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callback = tSAuthCallback;
            this.$resultBase64 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$callback, this.$resultBase64, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TSAuthCallback<AuthenticationResult, TSWebAuthnAuthenticationError> tSAuthCallback = this.$callback;
            String resultBase64 = this.$resultBase64;
            Intrinsics.checkNotNullExpressionValue(resultBase64, "resultBase64");
            tSAuthCallback.success(new AuthenticationResult(resultBase64));
            return Unit.INSTANCE;
        }
    }

    public AuthenticationController(Context context, String str, String str2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, Jg.Wd("/\u001fw)w\u001fu", (short) (C1580rY.Xd() ^ (-20235)), (short) (C1580rY.Xd() ^ (-12858))));
        short sXd = (short) (ZN.Xd() ^ 28286);
        short sXd2 = (short) (ZN.Xd() ^ 1648);
        int[] iArr = new int["\u0014b\\hE\u000bPD".length()];
        QB qb = new QB("\u0014b\\hE\u000bPD");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(str2, C1626yg.Ud("5A\u001fSDQ\u0017", (short) (C1633zX.Xd() ^ (-26088)), (short) (C1633zX.Xd() ^ (-8239))));
        this.clientID = str;
        this.baseUrl = str2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("!\u007fG-r /0\u000b\u0017\u0014\u007f\u001e9+J7Y ]\u0014\u0003X", (short) (Od.Xd() ^ (-17994)))).getMethod(EO.Od("=k)\u001d\\\u0012i^\u007f1FU\u0007\fd*fr\u000b&9", (short) (C1499aX.Xd() ^ (-14790))), new Class[0]);
        try {
            method.setAccessible(true);
            this.applicationContext = (Context) method.invoke(context, objArr);
            this.mPasskeyProvider = new Fido2PasskeyProvider();
            this.mBindingToken = "";
            this.mWebAuthnSessionID = "";
            this.mAuthSessionId = "";
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void completeAuthentication(TSPublicKeyCredential tSPublicKeyCredential, TSAuthCallback<AuthenticationResult, TSWebAuthnAuthenticationError> tSAuthCallback) throws Throwable {
        short sXd = (short) (C1499aX.Xd() ^ (-816));
        int[] iArr = new int["Va`[\u0018JOLTY".length()];
        QB qb = new QB("Va`[\u0018JOLTY");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String property = System.getProperty(new String(iArr, 0, i2));
        Intrinsics.checkNotNullExpressionValue(property, C1593ug.zd("on~[~|~t\u0003\u0006\f;6}\u000b\f\tG{\u0003\u0002\f\u0013AI", (short) (Od.Xd() ^ (-16874)), (short) (Od.Xd() ^ (-21723))));
        byte[] bytes = new GsonBuilder().disableHtmlEscaping().create().toJson(new CompleteAuthenticationResult(property, this.mWebAuthnSessionID, tSPublicKeyCredential)).toString().getBytes(Charsets.UTF_8);
        short sXd2 = (short) (C1607wl.Xd() ^ 9786);
        int[] iArr2 = new int["[NNW\u0003CT\u007fI?S=\tF:F>\u0004(HE;?7w{41?\fB<,9l'+#33$2e".length()];
        QB qb2 = new QB("[NNW\u0003CT\u007fI?S=\tF:F>\u0004(HE;?7w{41?\fB<,9l'+#33$2e");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Intrinsics.checkNotNullExpressionValue(bytes, new String(iArr2, 0, i3));
        Class<?> cls = Class.forName(C1561oA.Kd("^lcrpkg2zzpt7Ll\u007frDC", (short) (C1607wl.Xd() ^ 448)));
        Class<?>[] clsArr = {byte[].class, Integer.TYPE};
        Object[] objArr = {bytes, 2};
        short sXd3 = (short) (OY.Xd() ^ 31138);
        short sXd4 = (short) (OY.Xd() ^ 12546);
        int[] iArr3 = new int["7<@>RfEs6\n\u0017\u0005\"2".length()];
        QB qb3 = new QB("7<@>RfEs6\n\u0017\u0005\"2");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(((i4 * sXd4) ^ sXd3) + xuXd3.CK(iKK3));
            i4++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
        try {
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, objArr);
            Context context = this.applicationContext;
            Intrinsics.checkNotNullExpressionValue(context, C1561oA.Xd("\\lmjhcbvlssIvv}o\u0004\u0001", (short) (FB.Xd() ^ 3717)));
            WebAuthnPocModule webAuthnPocModule = new WebAuthnPocModule();
            short sXd5 = (short) (C1499aX.Xd() ^ (-15445));
            int[] iArr4 = new int["ABC$hutxe_oa>sshV`g]XWkaXX\u000b^Rad\\U\u0002\u001d".length()];
            QB qb4 = new QB("ABC$hutxe_oa>sshV`g]XWkaXX\u000b^Rad\\U\u0002\u001d");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK((sXd5 ^ i5) + xuXd4.CK(iKK4));
                i5++;
            }
            TSLog.d(context, webAuthnPocModule, new String(iArr4, 0, i5) + str);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AnonymousClass1(tSAuthCallback, str, null), 3, null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void completeRegistration(Context context, final TSRegPublicKeyCredential tSRegPublicKeyCredential, final TSAuthCallback<RegistrationResult, TSWebAuthnRegistrationError> tSAuthCallback) {
        getDeviceInfo(context, new TSAuthCallback<DeviceInfo, TSDeviceInfoError>() { // from class: com.transmit.authentication.gen.AuthenticationController.completeRegistration.1
            @Override // com.transmit.authentication.TSAuthCallback
            public void error(TSDeviceInfoError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                Context applicationContext = AuthenticationController.this.applicationContext;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                TSLog.e(applicationContext, new WebAuthnPocModule(), "get device info error:" + error.getErrorMessage(), error.getThrowable());
                tSAuthCallback.error(new TSWebAuthnRegistrationError.InternalError(error.getErrorMessage(), null, 2, null));
            }

            @Override // com.transmit.authentication.TSAuthCallback
            public void success(DeviceInfo deviceInfo) throws Throwable {
                Intrinsics.checkNotNullParameter(deviceInfo, C1561oA.Xd("\u0006\b\u001a\u000e\t\fp\u0017\u0010\u001a", (short) (OY.Xd() ^ 26678)));
                short sXd = (short) (C1633zX.Xd() ^ (-11452));
                int[] iArr = new int["GTUR\u0011ELKU\\".length()];
                QB qb = new QB("GTUR\u0011ELKU\\");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                    i2++;
                }
                String property = System.getProperty(new String(iArr, 0, i2));
                Intrinsics.checkNotNullExpressionValue(property, Qg.kd(",)7\u00123//#/04aZ +*%a\u0014\u0019\u0016\u001e#OU", (short) (FB.Xd() ^ 21765), (short) (FB.Xd() ^ 32249)));
                byte[] bytes = new Gson().toJson(new CompleteRegistrationResult(property, AuthenticationController.this.mWebAuthnSessionID, tSRegPublicKeyCredential, deviceInfo)).toString().getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, hg.Vd("\r\u007f\u007f\t4t\u00061zp\u0005n:wkwo5Yyvlph)-ebp=sm]j\u001eX\\TddUc\u0017", (short) (OY.Xd() ^ 22371), (short) (OY.Xd() ^ 16736)));
                Object[] objArr = {bytes, 2};
                Method declaredMethod = Class.forName(C1561oA.ud("&2'40)#k20$&fy\u0018)\u001aif", (short) (C1499aX.Xd() ^ (-5314)))).getDeclaredMethod(C1561oA.yd("191<,,\u001e8'GH>>6", (short) (Od.Xd() ^ (-480))), byte[].class, Integer.TYPE);
                try {
                    declaredMethod.setAccessible(true);
                    String str = (String) declaredMethod.invoke(null, objArr);
                    Context context2 = AuthenticationController.this.applicationContext;
                    short sXd2 = (short) (C1633zX.Xd() ^ (-23264));
                    int[] iArr2 = new int["\u001f/0-+&%9/66\f99@2FC".length()];
                    QB qb2 = new QB("\u001f/0-+&%9/66\f99@2FC");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                        i3++;
                    }
                    Intrinsics.checkNotNullExpressionValue(context2, new String(iArr2, 0, i3));
                    TSLog.d(context2, new WebAuthnPocModule(), Xg.qd("Z[\\=\u0002\u000f\u000e\u0012\u000f\t\u0019\u000bx\r\u0010\u0013\u001e \u001f\u000f#\u0019  R&\u001a),$-Yt", (short) (FB.Xd() ^ 31300), (short) (FB.Xd() ^ 7824)) + str);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AuthenticationController$completeRegistration$1$success$1(tSAuthCallback, str, null), 3, null);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TSDeviceInfoError getDeviceKeyError(CryptographyError cryptographyError) {
        if (cryptographyError instanceof CryptographyError.LoadKeyFailed) {
            return new TSDeviceInfoError.LoadDeviceKeyError("Couldn't load device key.");
        }
        if (cryptographyError instanceof CryptographyError.GenerateKeyFailed) {
            return new TSDeviceInfoError.GenerateDeviceKeyError("Couldn't generate device key.");
        }
        if (cryptographyError instanceof CryptographyError.InternalError) {
            return new TSDeviceInfoError.LoadDeviceKeyError("Internal error occurred during device key retrival.");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final TSWebAuthnRegistrationError networkRegistrationResponseToError(TSNetworkResponse<?> tSNetworkResponse) throws IOException {
        Object objFromJson;
        if (tSNetworkResponse instanceof TSNetworkResponse.TSNetworkError) {
            return new TSWebAuthnRegistrationError.NetworkError("Network error", ((TSNetworkResponse.TSNetworkError) tSNetworkResponse).getError());
        }
        if (!(tSNetworkResponse instanceof TSNetworkResponse.ApiError)) {
            return tSNetworkResponse instanceof TSNetworkResponse.TSExternalNetworkError ? new TSWebAuthnRegistrationError.NetworkError(((TSNetworkResponse.TSExternalNetworkError) tSNetworkResponse).getError(), null, 2, null) : tSNetworkResponse instanceof TSNetworkResponse.UnknownError ? new TSWebAuthnRegistrationError.InternalError("Internal error", ((TSNetworkResponse.UnknownError) tSNetworkResponse).getError()) : new TSWebAuthnRegistrationError.InternalError("Internal error", null, 2, null);
        }
        JsonStringConvertor jsonStringConvertor = JsonStringConvertor.INSTANCE;
        String strString = ((TSNetworkResponse.ApiError) tSNetworkResponse).getBody().string();
        Intrinsics.checkNotNullExpressionValue(strString, "error.body.string()");
        try {
            objFromJson = new Gson().fromJson(strString, (Class<Object>) NetworkApiError.class);
        } catch (Throwable unused) {
            objFromJson = null;
        }
        NetworkApiError networkApiError = (NetworkApiError) objFromJson;
        String error_code = networkApiError == null ? null : networkApiError.getError_code();
        if (error_code != null) {
            switch (error_code.hashCode()) {
                case -1356535902:
                    if (error_code.equals("client_not_found")) {
                        return new TSWebAuthnRegistrationError.ClientNotFound(networkApiError.getMessage());
                    }
                    break;
                case -1112350814:
                    if (error_code.equals("user_not_found")) {
                        return new TSWebAuthnRegistrationError.UserNotFound(networkApiError.getMessage());
                    }
                    break;
                case -702770607:
                    if (error_code.equals("auth_session_registration_username_mismatch")) {
                        return new TSWebAuthnRegistrationError.RegistrationUsernameMismatch(networkApiError.getMessage());
                    }
                    break;
                case -560122370:
                    if (error_code.equals("user_id_mismatch")) {
                        return new TSWebAuthnRegistrationError.UserIdMismatch(networkApiError.getMessage());
                    }
                    break;
                case 885424199:
                    if (error_code.equals("invalid_auth_session")) {
                        return new TSWebAuthnRegistrationError.InternalError(networkApiError.getMessage(), null, 2, null);
                    }
                    break;
                case 1624182494:
                    if (error_code.equals("invalid_device_binding_token")) {
                        return new TSWebAuthnRegistrationError.InternalError(networkApiError.getMessage(), null, 2, null);
                    }
                    break;
                case 1776706006:
                    if (error_code.equals("auth_session_not_found")) {
                        return new TSWebAuthnRegistrationError.InternalError(networkApiError.getMessage(), null, 2, null);
                    }
                    break;
                case 2117379143:
                    if (error_code.equals("invalid_request")) {
                        return new TSWebAuthnRegistrationError.InternalError(networkApiError.getMessage(), null, 2, null);
                    }
                    break;
            }
        }
        return new TSWebAuthnRegistrationError.InternalError("Unknown error", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final TSWebAuthnAuthenticationError networkResponseToAuthError(TSNetworkResponse<?> tSNetworkResponse) throws IOException {
        Object objFromJson;
        if (tSNetworkResponse instanceof TSNetworkResponse.TSNetworkError) {
            return new TSWebAuthnAuthenticationError.NetworkError("Network error", ((TSNetworkResponse.TSNetworkError) tSNetworkResponse).getError());
        }
        if (!(tSNetworkResponse instanceof TSNetworkResponse.ApiError)) {
            return tSNetworkResponse instanceof TSNetworkResponse.TSExternalNetworkError ? new TSWebAuthnAuthenticationError.NetworkError(((TSNetworkResponse.TSExternalNetworkError) tSNetworkResponse).getError(), null, 2, null) : tSNetworkResponse instanceof TSNetworkResponse.UnknownError ? new TSWebAuthnAuthenticationError.InternalError("Unknown error", ((TSNetworkResponse.UnknownError) tSNetworkResponse).getError()) : new TSWebAuthnAuthenticationError.InternalError("Unknown error", null, 2, null);
        }
        JsonStringConvertor jsonStringConvertor = JsonStringConvertor.INSTANCE;
        String strString = ((TSNetworkResponse.ApiError) tSNetworkResponse).getBody().string();
        Intrinsics.checkNotNullExpressionValue(strString, "error.body.string()");
        try {
            objFromJson = new Gson().fromJson(strString, (Class<Object>) NetworkApiError.class);
        } catch (Throwable unused) {
            objFromJson = null;
        }
        NetworkApiError networkApiError = (NetworkApiError) objFromJson;
        String error_code = networkApiError == null ? null : networkApiError.getError_code();
        if (error_code != null) {
            switch (error_code.hashCode()) {
                case -1356535902:
                    if (error_code.equals("client_not_found")) {
                        return new TSWebAuthnAuthenticationError.ClientNotFound(networkApiError.getMessage());
                    }
                    break;
                case -1220819997:
                    if (error_code.equals("no_credentials_registered")) {
                        return new TSWebAuthnAuthenticationError.NoRegisteredCredentials(networkApiError.getMessage());
                    }
                    break;
                case -1112350814:
                    if (error_code.equals("user_not_found")) {
                        return new TSWebAuthnAuthenticationError.UserNotFound(networkApiError.getMessage());
                    }
                    break;
                case 190611928:
                    if (error_code.equals("device_binding_token_not_provided")) {
                        return new TSWebAuthnAuthenticationError.InternalError(networkApiError.getMessage(), null, 2, null);
                    }
                    break;
                case 885424199:
                    if (error_code.equals("invalid_auth_session")) {
                        return new TSWebAuthnAuthenticationError.InternalError(networkApiError.getMessage(), null, 2, null);
                    }
                    break;
                case 1624182494:
                    if (error_code.equals("invalid_device_binding_token")) {
                        return new TSWebAuthnAuthenticationError.InternalError(networkApiError.getMessage(), null, 2, null);
                    }
                    break;
                case 1776706006:
                    if (error_code.equals("auth_session_not_found")) {
                        return new TSWebAuthnAuthenticationError.InternalError(networkApiError.getMessage(), null, 2, null);
                    }
                    break;
                case 2117379143:
                    if (error_code.equals("invalid_request")) {
                        return new TSWebAuthnAuthenticationError.InternalError(networkApiError.getMessage(), null, 2, null);
                    }
                    break;
            }
        }
        return new TSWebAuthnAuthenticationError.InternalError("Unknown error", null, 2, null);
    }

    private final void startWebAuthnAuthentication(final Context context, final TSAuthCallback<AuthenticationResult, TSWebAuthnAuthenticationError> tSAuthCallback, final String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x-ts-device-binding-token", this.mBindingToken);
            ArrayList arrayList = new ArrayList();
            arrayList.add(jSONObject);
            Context applicationContext = this.applicationContext;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            new TSStartAuthenticationServerProvider(applicationContext, this.baseUrl).sendDataToServer(arrayList, new StartAuthenticationPayload(this.clientID, str), new TSStartAuthenticationServerProvider.ITSStartAuthServerCallback() { // from class: com.transmit.authentication.gen.AuthenticationController.startWebAuthnAuthentication.1
                @Override // com.transmit.authentication.network.startauth.TSStartAuthenticationServerProvider.ITSStartAuthServerCallback
                public void onError(TSNetworkResponse<?> error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    Context applicationContext2 = AuthenticationController.this.applicationContext;
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
                    TSLog.d(applicationContext2, new WebAuthnPocModule(), "@@@ error :" + error);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AuthenticationController$startWebAuthnAuthentication$1$onError$1(tSAuthCallback, AuthenticationController.this, error, null), 3, null);
                }

                @Override // com.transmit.authentication.network.startauth.TSStartAuthenticationServerProvider.ITSStartAuthServerCallback
                public void onSuccess(String str2, CredentialRequestOptions credentialRequestOptions) {
                    Context applicationContext2 = AuthenticationController.this.applicationContext;
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
                    TSLog.d(applicationContext2, new WebAuthnPocModule(), "@@@ webAuthnSessionId: " + str2);
                    if (str2 == null) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AuthenticationController$startWebAuthnAuthentication$1$onSuccess$1(tSAuthCallback, null), 3, null);
                        return;
                    }
                    if (credentialRequestOptions == null) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AuthenticationController$startWebAuthnAuthentication$1$onSuccess$2(tSAuthCallback, null), 3, null);
                        return;
                    }
                    AuthenticationController.this.mWebAuthnSessionID = str2;
                    AuthenticationController.this.mCredentialRequestOptions = credentialRequestOptions;
                    AuthenticationController.this.mUserName = str;
                    AuthenticationController.this.executeWebauthnAuthentication(context, tSAuthCallback);
                }
            }, new WebAuthnPocModule());
        } catch (JSONException e2) {
            tSAuthCallback.error(new TSWebAuthnAuthenticationError.InternalError("Couldn't create the binding token header.", null, 2, null));
            e2.printStackTrace();
        }
    }

    public final void executeWebauthnAuthentication(Context context, final TSAuthCallback<AuthenticationResult, TSWebAuthnAuthenticationError> callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CredentialRequestOptions credentialRequestOptions = this.mCredentialRequestOptions;
        if (credentialRequestOptions == null) {
            unit = null;
        } else {
            PasskeyProvider passkeyProvider = this.mPasskeyProvider;
            if (passkeyProvider == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPasskeyProvider");
                passkeyProvider = null;
            }
            passkeyProvider.executeWebauthnAuthentication(context, credentialRequestOptions, new TSAuthCallback<TSPublicKeyCredential, TSWebAuthnAuthenticationError>() { // from class: com.transmit.authentication.gen.AuthenticationController$executeWebauthnAuthentication$1$1
                @Override // com.transmit.authentication.TSAuthCallback
                public void error(TSWebAuthnAuthenticationError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AuthenticationController$executeWebauthnAuthentication$1$1$error$1(callback, error, null), 3, null);
                }

                @Override // com.transmit.authentication.TSAuthCallback
                public void success(TSPublicKeyCredential result) throws Throwable {
                    Intrinsics.checkNotNullParameter(result, "result");
                    this.this$0.completeAuthentication(result, callback);
                }
            });
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AuthenticationController$executeWebauthnAuthentication$2$1(callback, null), 3, null);
        }
    }

    public final void executeWebauthnRegistration(final Context context, final TSAuthCallback<RegistrationResult, TSWebAuthnRegistrationError> callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CredentialCreationOptions credentialCreationOptions = this.mCredentialCreationOptions;
        if (credentialCreationOptions == null) {
            unit = null;
        } else {
            PasskeyProvider passkeyProvider = this.mPasskeyProvider;
            if (passkeyProvider == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPasskeyProvider");
                passkeyProvider = null;
            }
            passkeyProvider.executeWebauthnRegistration(context, credentialCreationOptions, new TSAuthCallback<TSRegPublicKeyCredential, TSWebAuthnRegistrationError>() { // from class: com.transmit.authentication.gen.AuthenticationController$executeWebauthnRegistration$1$1
                @Override // com.transmit.authentication.TSAuthCallback
                public void error(TSWebAuthnRegistrationError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AuthenticationController$executeWebauthnRegistration$1$1$error$1(callback, error, null), 3, null);
                }

                @Override // com.transmit.authentication.TSAuthCallback
                public void success(TSRegPublicKeyCredential result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    this.this$0.completeRegistration(context, result, callback);
                }
            });
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AuthenticationController$executeWebauthnRegistration$2$1(callback, null), 3, null);
        }
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final String getClientID() {
        return this.clientID;
    }

    public final void getDeviceInfo(Context context, final TSAuthCallback<DeviceInfo, TSDeviceInfoError> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            CryptographyManager.INSTANCE.loadKeyForSign(context, null, new WebAuthnPocModule(), new IKeyPairSCryptographyCallback() { // from class: com.transmit.authentication.gen.AuthenticationController.getDeviceInfo.1
                @Override // com.ts.coresdk.crypto.api.IKeyPairSCryptographyCallback
                public void onFetchKeyPair(RegularKeyPairResult keyResult) {
                    Intrinsics.checkNotNullParameter(keyResult, "keyResult");
                    if (keyResult instanceof RegularKeyPairResult.Error) {
                        callback.error(this.getDeviceKeyError(((RegularKeyPairResult.Error) keyResult).getError()));
                    } else {
                        if (!(keyResult instanceof RegularKeyPairResult.Success)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        RegularKeyPairResult.Success success = (RegularKeyPairResult.Success) keyResult;
                        callback.success(new DeviceInfo(success.getKeyPair().getKeyId(), success.getKeyPair().getPublicKeyData()));
                    }
                    Unit unit = Unit.INSTANCE;
                }
            });
        } catch (Throwable th) {
            TSLog.e(context, new WebAuthnPocModule(), "Failed to load device key pair", th);
            callback.error(new TSDeviceInfoError.InternalError("Internal error occurred during device key retrival.", th));
        }
    }

    public final boolean isWebAuthnSupported() {
        PasskeyProvider passkeyProvider = this.mPasskeyProvider;
        if (passkeyProvider == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPasskeyProvider");
            passkeyProvider = null;
        }
        return passkeyProvider.isWebAuthnSupported();
    }

    public final void prepareWebauthnAuthentication(Context context, String str, TSAuthCallback<AuthenticationResult, TSWebAuthnAuthenticationError> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String str2 = null;
        this.mUserName = null;
        if (str != null) {
            startWebAuthnAuthentication(context, callback, str);
            str2 = str;
        }
        if (str2 == null) {
            startWebAuthnAuthentication(context, callback, "");
        }
        this.mUserName = str;
    }

    public final void prepareWebauthnRegistration(final Context context, String username, String str, final TSAuthCallback<RegistrationResult, TSWebAuthnRegistrationError> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String str2 = this.clientID;
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            str = username;
        }
        StartRegistrationPayload startRegistrationPayload = new StartRegistrationPayload(str2, username, str);
        Context applicationContext = this.applicationContext;
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        TSStartRegistrationServerProvider tSStartRegistrationServerProvider = new TSStartRegistrationServerProvider(applicationContext, this.baseUrl);
        this.mAuthSessionId = "";
        tSStartRegistrationServerProvider.sendDataToServer(new ArrayList(), startRegistrationPayload, new TSStartRegistrationServerProvider.ITSStartRegisterServerCallback() { // from class: com.transmit.authentication.gen.AuthenticationController.prepareWebauthnRegistration.1
            @Override // com.transmit.authentication.network.startregister.TSStartRegistrationServerProvider.ITSStartRegisterServerCallback
            public void onError(TSNetworkResponse<?> error) {
                Intrinsics.checkNotNullParameter(error, "error");
                Context applicationContext2 = AuthenticationController.this.applicationContext;
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
                TSLog.d(applicationContext2, new WebAuthnPocModule(), "@@@ error :" + error);
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AuthenticationController$prepareWebauthnRegistration$1$onError$1(callback, AuthenticationController.this, error, null), 3, null);
            }

            @Override // com.transmit.authentication.network.startregister.TSStartRegistrationServerProvider.ITSStartRegisterServerCallback
            public void onSuccess(String str4, String str5, CredentialCreationOptions credentialCreationOptions) {
                AuthenticationController authenticationController = AuthenticationController.this;
                if (str4 == null) {
                    str4 = "";
                }
                authenticationController.mBindingToken = str4;
                AuthenticationController authenticationController2 = AuthenticationController.this;
                if (str5 == null) {
                    str5 = "";
                }
                authenticationController2.mWebAuthnSessionID = str5;
                AuthenticationController.this.mCredentialCreationOptions = credentialCreationOptions;
                AuthenticationController.this.executeWebauthnRegistration(context, callback);
            }
        }, new WebAuthnPocModule());
    }

    public final void signTransaction(Context context, String str, TSAuthCallback<AuthenticationResult, TSWebAuthnAuthenticationError> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        prepareWebauthnAuthentication(context, str, callback);
    }
}
