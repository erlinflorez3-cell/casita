package com.transmit.authentication;

import android.content.Context;
import com.transmit.authentication.TSDeviceInfoError;
import com.transmit.authentication.TSWebAuthnAuthenticationError;
import com.transmit.authentication.TSWebAuthnRegistrationError;
import com.transmit.authentication.gen.AuthenticationController;
import com.transmit.authentication.network.completereg.DeviceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#4\u0012\u000e\u0007nʑA0ReP\u008cZS@\u000fs{:$c$\bCCU0}*\teNo˧vJp\u000bK\u000f\u001c\u0016\u0001j2L]xk\u001b\u00172HoG3coE9vt>\u0005&2(وy\u001bЏJ*v\u000f7\u007fIKë\u00160Np\u0003\u0001\u001bT\u001d\u001a@\u000en$\u000f'tg|@xtc:=.\u001bkXMUa`\r[\u0019^`7\u000f\u0007aL9P9E\u0015Sb1\u0014\u0019`\b%M\u0002U\u0005\u0017/W/W|o6\u0007\nD%9[%i\u0003(l\u0005\u007fq\u001c);O\u0012]~\u001bn|C\u001a\u001bO\u001c\u000e4/x2;#~\b<=%vaTh\u0002\rD0~oK/%.5q9c|_wS\u0019|?,\t\u001b';\u0001\u001d+\fX\u001ct-\u001b\u0003y\u00186\u001a`K^f\n\bE\u001e\b~k\u001a*2:w\u0004=\u0010).E'ga?#/\u0001\u001aHri=\n)na\u0001jHn:5\u001b\u007f^\u0017%rD\u0013\r\u001cTbaD\u0011{&\u0005\u000b\f\u0013+ \u000byl'3*fQ~h\u0019O\u000e\u001a3;~Cip{\u000e\u0006Tn5EQ\u0012,\u0010_=\u0019\bhp\"pfp[<^j1:2vt@}\nOf\u000e)1msLD:=1h%J\u0013\u001epO\r\u000boZ\u0017\u001f-ay)Su2u!\u0001~^Gה:֑M,\u0005ʠr9OTM\u0019TWx־\u0007č'\u0007\u0007͞PSuP_L\u001b\u0015Lɠ}°\u001a\u001aA֗\u007fK!\u0014\u0017+H\u0001[K#Ǭq˛Q\u0012/ϕ܉}-"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#5\u000e/:m\u001f=QA7z8(\u001e>", "", "u(E", "\u0012D5\u000eH\u0013-MuZh>&lu\u0016", "", "\"@6", ":nR8", ";@dA[\nH\\(\f\u0005e3|\u0016", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@'5bG{G|\u0019.VR?i0-\u0019rj\u0017\u0011l;[\u0001.NL[\u0002", "/tc5X5MW\u0017z\n^\u001e|\u0006\u000bu\u000f+\u0005", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "CrT?A(FS", "1`[9U(<Y", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#5\u000e/:K\u00125T@7i:s", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0001Eh\u0001 @|\u001a,IR?u=\u000b\u0015vq@\u00169", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", "5dc\u0011X=BQ\u0019b\u0004_6", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015ua;PB,_z%G0W-f(", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#8}1;k\u0016\u0012VDEKA+\u001fu7", "7mXA4<MV\u0007]`", "1kX2a;\"2", "0`b2H9E", "7mXA\\(EW.~", "7rF2U\bNb\u001c\bhn7\b\u0013<t\u007f'", "", "@dV6f;>`\u000b~w:<\f\f8", "2hb=_(R<\u0015\u0007z", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u00125[\u0002.Fz\u0012=QMDX4,%op\u000f", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", "AhV;G9:\\'zxm0\u0007\u0012!e|\u0004\fO\u0004 ", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class TSAuthentication {
    private static final String DEFAULT_BASE_URL = "https://collect.riskid.security/device/";
    private static final String TAG = "TsAuth";
    private static AuthenticationController mAuthController = null;
    public static final TSAuthentication INSTANCE = new TSAuthentication();
    private static final Object lock = new Object();

    private TSAuthentication() {
    }

    @JvmStatic
    public static final void authenticateWebAuthn(Context context, String str, TSAuthCallback<AuthenticationResult, TSWebAuthnAuthenticationError> callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AuthenticationController authenticationController = mAuthController;
        if (authenticationController == null) {
            unit = null;
        } else {
            authenticationController.prepareWebauthnAuthentication(context, str, callback);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            callback.error(new TSWebAuthnAuthenticationError.SDKNotInitialized("TSAuthentication SDK was not initialized."));
        }
    }

    public static /* synthetic */ void authenticateWebAuthn$default(Context context, String str, TSAuthCallback tSAuthCallback, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            str = "";
        }
        authenticateWebAuthn(context, str, tSAuthCallback);
    }

    @JvmStatic
    public static final void getDeviceInfo(Context context, TSAuthCallback<DeviceInfo, TSDeviceInfoError> callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AuthenticationController authenticationController = mAuthController;
        if (authenticationController == null) {
            unit = null;
        } else {
            authenticationController.getDeviceInfo(context, callback);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            callback.error(new TSDeviceInfoError.SDKNotInitialized("TSAuthentication SDK was not initialized."));
        }
    }

    private final void initAuthSDK(Context context, String str, String str2) {
        synchronized (lock) {
            if (mAuthController == null) {
                mAuthController = new AuthenticationController(context, str, str2);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void initialize(Context context, String clientID) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientID, "clientID");
        INSTANCE.initAuthSDK(context, clientID, "https://api.transmitsecurity.io/");
    }

    @JvmStatic
    public static final void initialize(Context context, String clientID, String baseUrl) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientID, "clientID");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        INSTANCE.initAuthSDK(context, clientID, baseUrl);
    }

    public static /* synthetic */ void initialize$default(Context context, String str, String str2, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            str2 = "https://api.transmitsecurity.io/";
        }
        initialize(context, str, str2);
    }

    @JvmStatic
    public static final boolean isWebAuthnSupported() {
        AuthenticationController authenticationController = mAuthController;
        if (authenticationController == null) {
            return false;
        }
        return authenticationController.isWebAuthnSupported();
    }

    @JvmStatic
    public static final void registerWebAuthn(Context context, String userName, String str, TSAuthCallback<RegistrationResult, TSWebAuthnRegistrationError> callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AuthenticationController authenticationController = mAuthController;
        if (authenticationController == null) {
            unit = null;
        } else {
            authenticationController.prepareWebauthnRegistration(context, userName, str, callback);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            callback.error(new TSWebAuthnRegistrationError.SDKNotInitialized("TSAuthentication SDK was not initialized."));
        }
    }

    @JvmStatic
    public static final void signTransactionWebAuthn(Context context, String str, TSAuthCallback<AuthenticationResult, TSWebAuthnAuthenticationError> callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AuthenticationController authenticationController = mAuthController;
        if (authenticationController == null) {
            unit = null;
        } else {
            authenticationController.signTransaction(context, str, callback);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            callback.error(new TSWebAuthnAuthenticationError.SDKNotInitialized("TSAuthentication SDK was not initialized."));
        }
    }
}
