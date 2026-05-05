package com.transmit.authentication.webauthn;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.transmit.authentication.TSAuthCallback;
import com.transmit.authentication.TSWebAuthnAuthenticationError;
import com.transmit.authentication.TSWebAuthnRegistrationError;
import com.transmit.authentication.network.completeauth.TSPublicKeyCredential;
import com.transmit.authentication.network.completeauth.TSPublicKeyCredentialResponse;
import com.transmit.authentication.network.completereg.TSRegPublicKeyCredential;
import com.transmit.authentication.network.completereg.TSRegPublicKeyCredentialResponse;
import com.transmit.authentication.network.startauth.AllowCredentials;
import com.transmit.authentication.network.startauth.CredentialRequestOptions;
import com.transmit.authentication.network.startregister.CredentialCreationOptions;
import com.transmit.authentication.network.startregister.WebAuthnCredParams;
import io.sentry.protocol.Response;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
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
@Metadata(bv = {}, d1 = {"Яħ\u0014D57\u001eq\u007fZDkt\nA\u000e0!.Jչ*,(w\u000f߿r9>Pm߉6Ra*\u0017ӆ\u00044:[,ڎK;k\u001a\u0006̝\u0011Odgon`Z\u0013C%\u0006\u001exp,QU\u000f]\u001a\u000fHBwЀ;M\u0006=A`z6\r H\"@ц\r\u00010*PƵ~zYK\u0014۵8@~XZ\rc\u0005\"Ň\u000e>6\u0001&\\mN>H\u0003]B/)\u0004qBd'gܞ\u0005M\u001bU\\'\u0013vi\u001eA@?ߎ\u001d%a\f\u000fRa@\u000b?\u007fC\rؒ=ݐ[I\"Vv[ÿ\u0018\u00159OUk\u0001't\u0005\u007fb<+9R{K~\u0012nwC\n\u001b=\u001c\u000e4)x2;\u001f~\b<9;r\u001cj^\tvB.\u0003\u0012:%.\u00183YCKj_lS\u0019|C,\u0015\u001b+;\r~#kT<o%\u001ddw\u007fA\u007fN\u0004\\\u00174gN\u0006\u0004\u001fj2.\u00129_\u007f]\u0006A2%7O[g6Q{\u0010U\\s\u0007\u0007ph\u0002kbJP\"\u001d*e8O #Tr\u001a\u0004RjWZ'} b\u001e\u0016\bA&#w\u0005/3(fO\u0017\u0003\u001bQk\u001c=/\u0015J n4\u001eeSv5KP\u0012+\u0012V\u0005&W<\u0011\u0018\u001ff\u000ba\u001avt(POxn\u001e\u0003\u0014D|\u0018Y2\b\u0006*RD7)^%H1>p`-\rml\u0001\u0010-gy$K{2\u0016!\u0003f[\u001f\u0012\u0018~WO\u0015b8,oW{\u0019nc0\rL|Q,/w\u000eY\u007fLu_3\u0016>c\nF.\u001ag`_A!\u0012\u0017)`\u0006sE\u0015\u0001sxe\u0012U|-}\u001d>\u0001.\u0016\f1pt\u0004xrg\\'$\u0007^!L\u001ec.\u0019\u0012R\tq{\\\u001b]NI!\to;|cC\u0005ȷ\"%\u000f\u001cj\u000bCZ['KD(\u0018='y]\u0018\u0003ty+\u00154$}\u0004Z\u0014\\\u0004+ykcS8wa/B0-\u0005\u0003pR\u001b{\u0016T!4;FxOr}nB]\u000b5~v\u00072\u000e\u0007U\nHYoFf<\u0012Bsq\u0006DbQ.)M\u0002q\u001eqY\u0010#J=>;\u0002?y*\u001eS\u001f\u0005c\u0013\u0017>\u0013\f\"FAAc\u0015<\u000f%J+j\u0016QCҶm;"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@75Vy0Fp\u001fw.G:u\u0001\t\u0011vo?\u0007w\u0017[\u00018KKN92", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@75Vy0Fp\u001fw8?Iy:\u001e)SnC\u0018g+N\u0004|", "u(E", "1qT.g,$S-\\\b^+|\u0012>i{/", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015ua;PR\u001a;v)2\\K3`PX=(og\u000eM+\u0016\u0014]=+D", "1qT1X5MW\u0015\u0006", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Hs\rF@&9X\bl\u0001i!2\u0017AEs<(\u001e2LI\u0004j0L\\'[*[,[R{L\u0018\u000eac", "1qT1X5MW\u0015\u0006hm9", "", "3wT0h;>E\u0019{vn;\u007f\u0012\u000bu\u000f+{I\u0010\u001b\u0015C~\u0012F\u007f", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1qT1X5MW\u0015\u0006g^8\r\t=ti3\u000bD\u000b %", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?Hz0.$k+\u0017\u0014c+N\u007f6KHU\u0019\\^\u0003=\"!D\u0019]/\u0017\u000eg\u0017", "1`[9U(<Y", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#5\u000e/:K\u00125T@7i:s", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_,WKFr4-\u0015dqH\n-\u001b<a7DSR*BR\u0007\u001b!\u0012Y\u000eW:\u0011\u0001`\u0017", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", "3wT0h;>E\u0019{vn;\u007f\u0012\u001ce\u0002,\nO\u000e\u0013&Ky\u0017", "1qT1X5MW\u0015\u0006Xk,x\u00183o\t\u0012\u0007O\u0005! U", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu,\u0004'FLW;`Ny\u001b!\u0012V\u001dR5\u0016ndP(xMEt", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", "5dc\u000eg;:Q\u001c\u0007zg;", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Hs\rF@&9X\bl\u0001i!2\u0017AEs<(\u001e2=H\u0016_*Q~'P[$", "/tc5X5MW\u0017z\nh9X\u0018>a}+\u0004@\n&", "5dc\u000eg;>a(z\nb6\u0006s<e\u0001", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Hs\rF@&9X\bl\u0001i!2\u0017AEs<(\u001e2=H\u0016c:]r6KVW\nf[\u0004=(\u000ec\fN\u0016\u001a\u0005ZA1nM5\u001f]", "5dc\u0018X@\u001c`\u0019z\nb6\u0006r:t\u00042\u0005N", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Hs\rF@&9X\bl\u0001i!2\u0017AEs<(\u001e2LI\u0004j0L\\'[*[,[R{L\u0018\u000eak[+\t\u0014]K-XOF#\u00125WW", "5dc\u0018X@+S%\u000fzl;f\u0014>i\n1\n", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Hs\rF@&9X\bl\u0001i!2\u0017AEs<(\u001e2LI\u0004j0L\\'[*[,[R{L\u0018\u000eazN7\u001d\u0005gP\u000eyS;)\u0011:\u001f", "5dc\u001dh)EW\u0017dzr\n\n\t.sj$\t<\t%", "", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Hs\rF@&9X\bl\u0001i!2\u0017AEs<(\u001e2LI\u0004j0L\\'[*[,[R{L\u0018\u000eaxJ8\t\rYP${R\r", "5dc\u001fX:$S-kzj<\u0001\u0016/m\u007f1\u000b", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Hs\rF@&9X\bl\u0001i!2\u0017AEs<(\u001e2N9\u0015g+N\u007f6-Lb\u0019\\^\u0003A!\u0012b\u000eW:b", "CrT?I,KW\u001a\u0003xZ;\u0001\u00138", "5dc\u001fc", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Hs\rF@&9X\bl\u0001i!2\u0017AEs<(\u001e2LI\u0004j0L\\'[*[,[R{L\u0018\u000eazY\u000b\u0016\u0014]P8D", "5dc!F\u0017NP \u0003xD,\u0011f<e~(\u0005O\u0005\u0013\u001e(y\u001b\u0018\u000748Y\u0007/;k\u0012=QMD", "5dc!F\u0017NP \u0003xD,\u0011f<e~(\u0005O\u0005\u0013\u001e(y\u001b)v'9g\r-3|\u001a8V", "5dc!e(Ga$\t\bm:", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Hs\rF@#?a\u0006*@7\u0005;ILIv>+$>", "BqP;f7H`(\r", "", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004g\u001c\u0013XkWL\u0006)<#d$E|k", "5dc\"f,K", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Hs\rF@&9X\bl\u0001i!2\u0017AEs<(\u001e2LI\u0004j0L\\'[*[,[R{L\u0018\u000ea}\\+\u001adbP(}X\r", "7rF2U\bNb\u001c\bhn7\b\u0013<t\u007f'", "", ":`d;V/+S\u001b\u0003\tm,\ns/n~,\u0005Bd &Gx\u001d", ":`d;V/,W\u001b\b~g.g\t8d\u00041}$\n&\u0017P~", "@d`BX:M1#}z", "", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class Fido2PasskeyProvider implements PasskeyProvider {

    /* JADX INFO: renamed from: com.transmit.authentication.webauthn.Fido2PasskeyProvider$executeWebauthnAuthentication$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001d\u001d̉=!4i\bDZc|\u0004W\u00068é6B\r\"4\u0012}\b\u000fiˎ6L{߉^^c,\u001fk*44]4qq<\u0004\u0019F0\u0017Qfg\u0016qz^\u0019E'\u0006Dy1@\u0012c\u0007a*\u000f`E CAR\b=g`;Jӵ$8"}, d2 = {"1n\\{g9:\\'\u0007~mux\u0019>h\u007f1\u000bD~\u0013&Ky\u0017\u0006\t%2U\u000e/:v_\u000fQBE8\u001f\u001a#vg9\u001bN9X\b+FL[j\\er;$!Z\u007fN(\t\u0015hD-JTF\"\b5X\u00069d\u0010\u0010 \u0017s6", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#5\u000e/:K\u00125T@7i:s", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Hs\rF@&9X\bl\u0001i!2\u0017AEs<(\u001e2LI\u0004j0L\\'[*[,[R{L\u0018\u000eac", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V\u001fKz7\u001e\u001ewe7\u0003r0X\u007f\u0007TYX92", "3qa<e", "", "AtR0X:L", "@dbB_;", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements TSAuthCallback<PublicKeyCredential, TSWebAuthnAuthenticationError> {
        final /* synthetic */ TSAuthCallback<TSPublicKeyCredential, TSWebAuthnAuthenticationError> $callback;
        final /* synthetic */ Fido2PasskeyProvider this$0;

        AnonymousClass1(TSAuthCallback<TSPublicKeyCredential, TSWebAuthnAuthenticationError> tSAuthCallback, Fido2PasskeyProvider fido2PasskeyProvider) {
            tSAuthCallback = tSAuthCallback;
            fido2PasskeyProvider = fido2PasskeyProvider;
        }

        @Override // com.transmit.authentication.TSAuthCallback
        public void error(TSWebAuthnAuthenticationError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new Fido2PasskeyProvider$executeWebauthnAuthentication$1$error$1(tSAuthCallback, error, null), 3, null);
        }

        @Override // com.transmit.authentication.TSAuthCallback
        public void success(PublicKeyCredential result) {
            Intrinsics.checkNotNullParameter(result, "result");
            tSAuthCallback.success(fido2PasskeyProvider.getTSPublicKeyCredentialForAuthentication(result));
        }
    }

    /* JADX INFO: renamed from: com.transmit.authentication.webauthn.Fido2PasskeyProvider$executeWebauthnRegistration$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001d\u001d̉=!4i\bDZc|\u0004W\u00068é6B\r\"4\u0012}\b\u000fiˎ6L{߉^^c,\u001fk*44]4qq<\u0004\u0019F0\u0017Qfg\u0016qz^\u0019E'\u0006Dy1@\u0012c\u0007a*\u000f`E CAR\b=g`;Jӵ$8"}, d2 = {"1n\\{g9:\\'\u0007~mux\u0019>h\u007f1\u000bD~\u0013&Ky\u0017\u0006\t%2U\u000e/:v_\u000fQBE8\u001f\u001a#vg9\u001bN9X\b+FL[j\\er;$!Z\u007fN(\t\u0015hD-[D9#\u0016;V}Jl\u000b\u0015TY", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#5\u000e/:K\u00125T@7i:s", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Hs\rF@&9X\bl\u0001i!2\u0017AEs<(\u001e2LI\u0004j0L\\'[*[,[R{L\u0018\u000eac", "\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@\u0014#K}\u001d\u0013}%1V0;m8,$u]H\u000bm5.\u00044QY$", "3qa<e", "", "AtR0X:L", "@dbB_;", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
    public static final class C13191 implements TSAuthCallback<PublicKeyCredential, TSWebAuthnRegistrationError> {
        final /* synthetic */ TSAuthCallback<TSRegPublicKeyCredential, TSWebAuthnRegistrationError> $callback;
        final /* synthetic */ Fido2PasskeyProvider this$0;

        C13191(TSAuthCallback<TSRegPublicKeyCredential, TSWebAuthnRegistrationError> tSAuthCallback, Fido2PasskeyProvider fido2PasskeyProvider) {
            tSAuthCallback = tSAuthCallback;
            fido2PasskeyProvider = fido2PasskeyProvider;
        }

        @Override // com.transmit.authentication.TSAuthCallback
        public void error(TSWebAuthnRegistrationError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new Fido2PasskeyProvider$executeWebauthnRegistration$1$error$1(tSAuthCallback, error, null), 3, null);
        }

        @Override // com.transmit.authentication.TSAuthCallback
        public void success(PublicKeyCredential result) {
            Intrinsics.checkNotNullParameter(result, "result");
            tSAuthCallback.success(fido2PasskeyProvider.getTSPublicKeyCredentialForRegistration(result));
        }
    }

    private final TSRegPublicKeyCredential createKeyCredential(PublicKeyCredential publicKeyCredential) throws Throwable {
        Object[] objArr = {publicKeyCredential.getResponse().getClientDataJSON(), 2};
        Method declaredMethod = Class.forName(Qg.kd("p|q~zsm6|znp1Dbsd41", (short) (FB.Xd() ^ 31047), (short) (FB.Xd() ^ 27157))).getDeclaredMethod(hg.Vd("\u0005\r\u0001\f\u007f\u007fm\bj\u000b\b}\u0002y", (short) (ZN.Xd() ^ 15522), (short) (ZN.Xd() ^ 20700)), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, objArr);
            String strUd = C1561oA.ud(">F:E99'A$DA7;3rShgfedcba췼%tqj\n\n\u0019\u0010\nw\u0006>SRQPONMLKJIHP", (short) (C1580rY.Xd() ^ (-24077)));
            Intrinsics.checkNotNullExpressionValue(str, strUd);
            Object[] objArr2 = {((AuthenticatorAttestationResponse) publicKeyCredential.getResponse()).getAttestationObject(), 2};
            Method declaredMethod2 = Class.forName(C1561oA.yd("HVIXRME\u0010TTFJ\t\u001e:M<\u000e\t", (short) (FB.Xd() ^ 3245))).getDeclaredMethod(C1561oA.Yd("mwmzprb~c\u0006\u0005|\u0003|", (short) (C1607wl.Xd() ^ 12476)), byte[].class, Integer.TYPE);
            try {
                declaredMethod2.setAccessible(true);
                String str2 = (String) declaredMethod2.invoke(null, objArr2);
                Intrinsics.checkNotNullExpressionValue(str2, strUd);
                TSRegPublicKeyCredentialResponse tSRegPublicKeyCredentialResponse = new TSRegPublicKeyCredentialResponse(str, str2);
                String id = publicKeyCredential.getId();
                short sXd = (short) (C1633zX.Xd() ^ (-12656));
                short sXd2 = (short) (C1633zX.Xd() ^ (-16625));
                int[] iArr = new int["\\l``blsibn1mi".length()];
                QB qb = new QB("\\l``blsibn1mi");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                    i2++;
                }
                Intrinsics.checkNotNullExpressionValue(id, new String(iArr, 0, i2));
                byte[] rawId = publicKeyCredential.getRawId();
                short sXd3 = (short) (OY.Xd() ^ 23243);
                short sXd4 = (short) (OY.Xd() ^ 20563);
                int[] iArr2 = new int["*\u001c\u0004:%H;s+K.)\u001dX\u001d!C\u00021".length()];
                QB qb2 = new QB("*\u001c\u0004:%H;s+K.)\u001dX\u001d!C\u00021");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                    i3++;
                }
                Object[] objArr3 = {rawId, 2};
                Method declaredMethod3 = Class.forName(new String(iArr2, 0, i3)).getDeclaredMethod(ZO.xd("6\fr\u0018\ryS?\u0004;d\u0014=E", (short) (ZN.Xd() ^ 26835), (short) (ZN.Xd() ^ 25806)), byte[].class, Integer.TYPE);
                try {
                    declaredMethod3.setAccessible(true);
                    String str3 = (String) declaredMethod3.invoke(null, objArr3);
                    Intrinsics.checkNotNullExpressionValue(str3, C1626yg.Ud("\\W0\u00181@7|[\u00156\u0002sP+Q5[#K\u0012df\u0016`;A\u0003T+\u001b6O\fl\u0001\u0015\u0016(|{w].\rtH\u0014", (short) (FB.Xd() ^ 17756), (short) (FB.Xd() ^ 1731)));
                    String type = publicKeyCredential.getType();
                    Intrinsics.checkNotNullExpressionValue(type, Ig.wd("1\nH9P%QS%\u0002;mD7&", (short) (C1499aX.Xd() ^ (-2175))));
                    return new TSRegPublicKeyCredential(id, str3, tSRegPublicKeyCredentialResponse, type);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private final TSRegPublicKeyCredential createKeyCredential(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject(Response.TYPE);
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "credential.getJSONObject(\"response\")");
        String strOptString = jSONObject2.optString("clientDataJSON");
        Intrinsics.checkNotNullExpressionValue(strOptString, "responseJson.optString(\"clientDataJSON\")");
        String strOptString2 = jSONObject2.optString("attestationObject");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "responseJson.optString(\"attestationObject\")");
        TSRegPublicKeyCredentialResponse tSRegPublicKeyCredentialResponse = new TSRegPublicKeyCredentialResponse(strOptString, strOptString2);
        String strOptString3 = jSONObject.optString("id");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "credential.optString(\"id\")");
        String strOptString4 = jSONObject.optString("rawId");
        Intrinsics.checkNotNullExpressionValue(strOptString4, "credential.optString(\"rawId\")");
        String strOptString5 = jSONObject.optString("type");
        Intrinsics.checkNotNullExpressionValue(strOptString5, "credential.optString(\"type\")");
        return new TSRegPublicKeyCredential(strOptString3, strOptString4, tSRegPublicKeyCredentialResponse, strOptString5);
    }

    private final Attachment getAttachment(String str) {
        if (Intrinsics.areEqual(str, "platform")) {
            return Attachment.PLATFORM;
        }
        if (Intrinsics.areEqual(str, "cross_platform")) {
            return Attachment.CROSS_PLATFORM;
        }
        return null;
    }

    private final AttestationConveyancePreference getAttestationPref(CredentialCreationOptions credentialCreationOptions) {
        return Intrinsics.areEqual(credentialCreationOptions.getAttestation(), DevicePublicKeyStringDef.DIRECT) ? AttestationConveyancePreference.DIRECT : Intrinsics.areEqual(credentialCreationOptions.getAttestation(), DevicePublicKeyStringDef.INDIRECT) ? AttestationConveyancePreference.INDIRECT : AttestationConveyancePreference.NONE;
    }

    private final PublicKeyCredentialCreationOptions getKeyCreationOptions(CredentialCreationOptions credentialCreationOptions) throws Throwable {
        PublicKeyCredentialCreationOptions.Builder builder = new PublicKeyCredentialCreationOptions.Builder();
        String challenge = credentialCreationOptions.getChallenge();
        short sXd = (short) (FB.Xd() ^ 5655);
        int[] iArr = new int["1nT=[\"C\u0017\u001d\u001b\fr^r,#A*R".length()];
        QB qb = new QB("1nT=[\"C\u0017\u001d\u001b\fr^r,#A*R");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {challenge, 2};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1593ug.zd("EGFSIK", (short) (ZN.Xd() ^ 16056), (short) (ZN.Xd() ^ 7331)), Class.forName(C1561oA.Qd("\b}\u0012{G\u0005x\u0005|Bf\u0007\u0004y}u", (short) (C1633zX.Xd() ^ (-15161)))), Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            builder.setChallenge((byte[]) declaredMethod.invoke(null, objArr));
            builder.setTimeoutSeconds(Double.valueOf(credentialCreationOptions.getTimeout()));
            AuthenticatorSelectionCriteria.Builder builder2 = new AuthenticatorSelectionCriteria.Builder();
            Attachment attachment = getAttachment(credentialCreationOptions.getAuthenticatorSelection().getAuthenticatorAttachment());
            if (attachment != null) {
                builder2.setAttachment(attachment);
            }
            ResidentKeyRequirement resKeyRequirement = getResKeyRequirement(credentialCreationOptions.getAuthenticatorSelection().getUserVerification());
            if (resKeyRequirement != null) {
                builder2.setResidentKeyRequirement(resKeyRequirement);
            }
            builder.setAuthenticatorSelection(builder2.build());
            builder.setRp(getRp(credentialCreationOptions));
            builder.setUser(getUser(credentialCreationOptions));
            builder.setAttestationConveyancePreference(getAttestationPref(credentialCreationOptions));
            builder.setParameters(getPublicKeyCredsParams(credentialCreationOptions));
            return builder.build();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final PublicKeyCredentialRequestOptions getKeyRequestOptions(CredentialRequestOptions credentialRequestOptions) throws Throwable {
        PublicKeyCredentialRequestOptions.Builder builder = new PublicKeyCredentialRequestOptions.Builder();
        Intrinsics.checkNotNull(credentialRequestOptions);
        Object[] objArr = {credentialRequestOptions.getChallenge(), 2};
        Method declaredMethod = Class.forName(C1561oA.od("MYN[WPJ\u0013YWKM\u000e!?PA\u0011\u000e", (short) (ZN.Xd() ^ 29953))).getDeclaredMethod(Wg.Zd("L\u0012\u0016XS\u001b", (short) (ZN.Xd() ^ 13681), (short) (ZN.Xd() ^ 1948)), Class.forName(C1561oA.Kd("\u0014\f\"\u000e[\u001b\u0011\u001f\u0019`\u0007)( & ", (short) (OY.Xd() ^ 8936))), Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            builder.setChallenge((byte[]) declaredMethod.invoke(null, objArr));
            ArrayList arrayList = new ArrayList();
            AllowCredentials[] allowCredentials = credentialRequestOptions.getAllowCredentials();
            Intrinsics.checkNotNull(allowCredentials);
            int length = allowCredentials.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                AllowCredentials[] allowCredentials2 = credentialRequestOptions.getAllowCredentials();
                Intrinsics.checkNotNull(allowCredentials2);
                String type = allowCredentials2[i2].getType();
                Intrinsics.checkNotNull(type);
                AllowCredentials[] allowCredentials3 = credentialRequestOptions.getAllowCredentials();
                Intrinsics.checkNotNull(allowCredentials3);
                Object[] objArr2 = {allowCredentials3[i2].getId(), 2};
                Method declaredMethod2 = Class.forName(C1561oA.Xd("\u0011\u001f\u0016%#\u001e\u001ad--#'i~\u001f2%vu", (short) (ZN.Xd() ^ 8479))).getDeclaredMethod(Qg.kd("XXU`TT", (short) (C1633zX.Xd() ^ (-30672)), (short) (C1633zX.Xd() ^ (-27700))), Class.forName(Wg.vd("QG_I\u0011NFRF\f4TMCKC", (short) (FB.Xd() ^ 21521))), Integer.TYPE);
                try {
                    declaredMethod2.setAccessible(true);
                    byte[] bArr = (byte[]) declaredMethod2.invoke(null, objArr2);
                    AllowCredentials[] allowCredentials4 = credentialRequestOptions.getAllowCredentials();
                    Intrinsics.checkNotNull(allowCredentials4);
                    arrayList.add(new PublicKeyCredentialDescriptor(type, bArr, getTransports(allowCredentials4[i2].getTransports())));
                    i2 = i3;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            builder.setAllowList(arrayList);
            String rpId = credentialRequestOptions.getRpId();
            Intrinsics.checkNotNull(rpId);
            builder.setRpId(rpId);
            builder.setTimeoutSeconds(credentialRequestOptions.getTimeout());
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptionsBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(publicKeyCredentialRequestOptionsBuild, hg.Vd("\u001d/\"$\u001b\u001b'a\u0015'\u001a\u001c\u0013UU", (short) (Od.Xd() ^ (-14822)), (short) (Od.Xd() ^ (-22143))));
            return publicKeyCredentialRequestOptionsBuild;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private final List<PublicKeyCredentialParameters> getPublicKeyCredsParams(CredentialCreationOptions credentialCreationOptions) {
        ArrayList arrayList = new ArrayList();
        WebAuthnCredParams[] pubKeyCredParams = credentialCreationOptions.getPubKeyCredParams();
        int length = pubKeyCredParams.length;
        int i2 = 0;
        while (i2 < length) {
            WebAuthnCredParams webAuthnCredParams = pubKeyCredParams[i2];
            i2++;
            arrayList.add(new PublicKeyCredentialParameters(webAuthnCredParams.getType(), webAuthnCredParams.getAlg()));
        }
        return arrayList;
    }

    private final ResidentKeyRequirement getResKeyRequirement(String str) {
        if (Intrinsics.areEqual(str, "preferred")) {
            return ResidentKeyRequirement.RESIDENT_KEY_PREFERRED;
        }
        if (Intrinsics.areEqual(str, "required")) {
            return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
        }
        return null;
    }

    private final PublicKeyCredentialRpEntity getRp(CredentialCreationOptions credentialCreationOptions) {
        return new PublicKeyCredentialRpEntity(credentialCreationOptions.getRp().getId(), credentialCreationOptions.getRp().getName(), "");
    }

    public final TSPublicKeyCredential getTSPublicKeyCredentialForAuthentication(PublicKeyCredential publicKeyCredential) throws Throwable {
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) publicKeyCredential.getResponse();
        Object[] objArr = {publicKeyCredential.getResponse().getClientDataJSON(), 2};
        Method declaredMethod = Class.forName(C1561oA.ud("\n\u0016\u000b\u0018\u0014\r\u0007O\u0016\u0014\b\nJ]{\r}MJ", (short) (Od.Xd() ^ (-6342)))).getDeclaredMethod(C1561oA.yd("\u0019#\u0019&\u001c\u001e\u000e*~! \u0018\u001e\u0018", (short) (C1633zX.Xd() ^ (-27053))), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, objArr);
            Intrinsics.checkNotNullExpressionValue(str, C1561oA.Yd("WaWdZ\\LhMonflf(dthhjt{qjﯵ\u007fmWa^^9;?4Ww\u000b}ONIjl}vrbrL", (short) (C1607wl.Xd() ^ 23271)));
            Object[] objArr2 = {authenticatorAssertionResponse.getAuthenticatorData(), 2};
            Method declaredMethod2 = Class.forName(Xg.qd("\u007f\u000e\u0005\u0014\u0012\r\tS\u001c\u001c\u0012\u0016Xm\u000e!\u0014ed", (short) (FB.Xd() ^ 26135), (short) (FB.Xd() ^ 16910))).getDeclaredMethod(Jg.Wd("\u001b\blO2\u001bX)\u001d%P\u001fSq", (short) (C1607wl.Xd() ^ 9102), (short) (C1607wl.Xd() ^ 10252)), byte[].class, Integer.TYPE);
            try {
                declaredMethod2.setAccessible(true);
                String str2 = (String) declaredMethod2.invoke(null, objArr2);
                Intrinsics.checkNotNullExpressionValue(str2, ZO.xd("1vuv1k{n\u0016tca\u0003>\u0013\u001c#D\u0011,\u0018bl\u001b⿏1\u001b\"=!Lu,6VT)w\u001aN|e\u0016A$<-`%M", (short) (C1580rY.Xd() ^ (-2189)), (short) (C1580rY.Xd() ^ (-11882))));
                byte[] signature = authenticatorAssertionResponse.getSignature();
                short sXd = (short) (C1499aX.Xd() ^ (-6324));
                short sXd2 = (short) (C1499aX.Xd() ^ (-11424));
                int[] iArr = new int["\u001f@tIv6#%Qi\u0014X\u0005$\bMhi\u0004".length()];
                QB qb = new QB("\u001f@tIv6#%Qi\u0014X\u0005$\bMhi\u0004");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                    i2++;
                }
                Object[] objArr3 = {signature, 2};
                Method declaredMethod3 = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Ig.wd("G\u0001sW<h\u0004>_\\d5kb", (short) (C1499aX.Xd() ^ (-26318))), byte[].class, Integer.TYPE);
                try {
                    declaredMethod3.setAccessible(true);
                    String str3 = (String) declaredMethod3.invoke(null, objArr3);
                    short sXd3 = (short) (C1607wl.Xd() ^ 11997);
                    int[] iArr2 = new int["a#{a0fk@Gf\\;ol\u001bMu 6\u000fQ0:\u0001YUvOV\u001d4XmO\u0005n)Y,\u0011\r0w\r`n g\u0007x".length()];
                    QB qb2 = new QB("a#{a0fk@Gf\\;ol\u001bMu 6\u000fQ0:\u0001YUvOV\u001d4XmO\u0005n)Y,\u0011\r0w\r`n g\u0007x");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
                        i3++;
                    }
                    Intrinsics.checkNotNullExpressionValue(str3, new String(iArr2, 0, i3));
                    TSPublicKeyCredentialResponse tSPublicKeyCredentialResponse = new TSPublicKeyCredentialResponse(str, str2, str3, null);
                    String id = publicKeyCredential.getId();
                    Intrinsics.checkNotNullExpressionValue(id, C1561oA.Qd("R`RPPX]QHR\u0013KHV*D\u0007\u0007", (short) (Od.Xd() ^ (-126))));
                    Object[] objArr4 = {publicKeyCredential.getRawId(), 2};
                    Method declaredMethod4 = Class.forName(C1593ug.zd("0>5DB=9\u0004LLBF\t\u001e>QD\u0016\u0015", (short) (OY.Xd() ^ 25578), (short) (OY.Xd() ^ 22969))).getDeclaredMethod(C1561oA.od("6>2=11\u001f9\u001c<9/3+", (short) (C1580rY.Xd() ^ (-14949))), byte[].class, Integer.TYPE);
                    try {
                        declaredMethod4.setAccessible(true);
                        String str4 = (String) declaredMethod4.invoke(null, objArr4);
                        Intrinsics.checkNotNullExpressionValue(str4, C1561oA.Kd("PZP]SUEaFhg_e_!]maacmtjc夶xWg~Qm248-Pp\u0004vHGBcevok[kE", (short) (Od.Xd() ^ (-30679))));
                        return new TSPublicKeyCredential(id, str4, tSPublicKeyCredentialResponse, Wg.Zd("HDh*fTUK\u0005L", (short) (ZN.Xd() ^ 20666), (short) (ZN.Xd() ^ 8816)));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    public final TSRegPublicKeyCredential getTSPublicKeyCredentialForRegistration(PublicKeyCredential publicKeyCredential) throws Throwable {
        Object[] objArr = {publicKeyCredential.getResponse().getClientDataJSON(), 2};
        Method declaredMethod = Class.forName(C1561oA.Xd("q\u007fv\u0006\u0004~zE\u000e\u000e\u0004\bJ_\u007f\u0013\u0006WV", (short) (OY.Xd() ^ 31426))).getDeclaredMethod(Wg.vd("z\u0005v\u0004uwc\u007fp\u0013\u000e\u0006\b\u0002", (short) (FB.Xd() ^ 18346)), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, objArr);
            Intrinsics.checkNotNullExpressionValue(str, Qg.kd("EMAL@@.H+KH>B:y4B422:?3*ꉛ\u000b'9%\r\u0015\u0010\u000ej]~\u001d.\u001fnkd\u0004\u0004\u0013\n\u0004q\u007fW", (short) (OY.Xd() ^ 28856), (short) (OY.Xd() ^ 2677)));
            byte[] attestationObject = ((AuthenticatorAttestationResponse) publicKeyCredential.getResponse()).getAttestationObject();
            Class<?> cls = Class.forName(hg.Vd("(4)62+%m42&(h{\u001a+\u001ckh", (short) (OY.Xd() ^ 6674), (short) (OY.Xd() ^ 29641)));
            Class<?>[] clsArr = {byte[].class, Integer.TYPE};
            Object[] objArr2 = {attestationObject, 2};
            short sXd = (short) (C1633zX.Xd() ^ (-12706));
            int[] iArr = new int["$, +\u001f\u001f\r'\n*'\u001d!\u0019".length()];
            QB qb = new QB("$, +\u001f\u001f\r'\n*'\u001d!\u0019");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method declaredMethod2 = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod2.setAccessible(true);
                String str2 = (String) declaredMethod2.invoke(null, objArr2);
                Intrinsics.checkNotNullExpressionValue(str2, C1561oA.yd("\u0005\u000f\u0005\u0012\b\ny\u0016j\r\f\u0004\n\u0004EF\u0013#\u0017\u0017\u0019#* 孖\u0018\u0018y\u000e\u0017\u0013\u0012s,!Ddwj<+&GIZSO?_9", (short) (Od.Xd() ^ (-20611))));
                TSRegPublicKeyCredentialResponse tSRegPublicKeyCredentialResponse = new TSRegPublicKeyCredentialResponse(str, str2);
                String id = publicKeyCredential.getId();
                Intrinsics.checkNotNullExpressionValue(id, C1561oA.Yd(".>224>E;4@\u0003?;", (short) (C1607wl.Xd() ^ 23028)));
                byte[] rawId = publicKeyCredential.getRawId();
                Class<?> cls2 = Class.forName(Xg.qd("CQHWUPL\u0017__UY\u001c1QdW)(", (short) (C1580rY.Xd() ^ (-27042)), (short) (C1580rY.Xd() ^ (-15075))));
                Class<?>[] clsArr2 = {byte[].class, Integer.TYPE};
                Object[] objArr3 = {rawId, 2};
                short sXd2 = (short) (Od.Xd() ^ (-11038));
                short sXd3 = (short) (Od.Xd() ^ (-22930));
                int[] iArr2 = new int["\u001fan%Ro\u000b\\l(`\u0002\u001fS".length()];
                QB qb2 = new QB("\u001fan%Ro\u000b\\l(`\u0002\u001fS");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                    i3++;
                }
                Method declaredMethod3 = cls2.getDeclaredMethod(new String(iArr2, 0, i3), clsArr2);
                try {
                    declaredMethod3.setAccessible(true);
                    String str3 = (String) declaredMethod3.invoke(null, objArr3);
                    Intrinsics.checkNotNullExpressionValue(str3, ZO.xd(">9`(RZSy\u0016[\u0015sKd\u001dBm1ypm?&,g7|>z-B\u0007t2)NL\u001exAG#\u0007-\u001aL#K", (short) (C1607wl.Xd() ^ 32422), (short) (C1607wl.Xd() ^ 12274)));
                    String type = publicKeyCredential.getType();
                    short sXd4 = (short) (C1607wl.Xd() ^ 5472);
                    short sXd5 = (short) (C1607wl.Xd() ^ 24834);
                    int[] iArr3 = new int["TP>\u001d!2\u001aVD`FL?$R".length()];
                    QB qb3 = new QB("TP>\u001d!2\u001aVD`FL?$R");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + (i4 * sXd5))) + xuXd3.CK(iKK3));
                        i4++;
                    }
                    Intrinsics.checkNotNullExpressionValue(type, new String(iArr3, 0, i4));
                    return new TSRegPublicKeyCredential(id, str3, tSRegPublicKeyCredentialResponse, type);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private final List<Transport> getTransports(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (Intrinsics.areEqual(Transport.BLUETOOTH_CLASSIC.toString(), strArr[i2])) {
                    arrayList.add(Transport.BLUETOOTH_CLASSIC);
                } else if (Intrinsics.areEqual(Transport.BLUETOOTH_LOW_ENERGY.toString(), strArr[i2])) {
                    arrayList.add(Transport.BLUETOOTH_LOW_ENERGY);
                } else if (Intrinsics.areEqual(Transport.INTERNAL.toString(), strArr[i2])) {
                    arrayList.add(Transport.INTERNAL);
                } else if (Intrinsics.areEqual(Transport.NFC.toString(), strArr[i2])) {
                    arrayList.add(Transport.NFC);
                } else if (Intrinsics.areEqual(Transport.USB.toString(), strArr[i2])) {
                    arrayList.add(Transport.USB);
                }
                i2 = i3;
            }
        }
        return arrayList;
    }

    private final PublicKeyCredentialUserEntity getUser(CredentialCreationOptions credentialCreationOptions) {
        byte[] bytes = credentialCreationOptions.getUser().getId().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return new PublicKeyCredentialUserEntity(bytes, credentialCreationOptions.getUser().getName(), "", credentialCreationOptions.getUser().getDisplayName());
    }

    private final void launchRegisterPendingIntent(Context context, CredentialCreationOptions credentialCreationOptions, TSAuthCallback<?, ?> tSAuthCallback) throws Exception {
        Intent intent = new Intent(context, (Class<?>) TSOverlayActivity.class);
        intent.addFlags(65536);
        intent.putExtra(Ig.wd("nD\u001e\b\u001a]\u0017\u0012tF#\u0019tph@\r\t", (short) (OY.Xd() ^ 9926)), TSOverlayActivity.registerCallbackForResultCompletion(tSAuthCallback));
        intent.putExtra(EO.Od("B#cK\r:l\n8(1\u0017gp\u0001\u0019T", (short) (Od.Xd() ^ (-16705))), getKeyCreationOptions(credentialCreationOptions));
        short sXd = (short) (OY.Xd() ^ 7108);
        int[] iArr = new int["WWKWEWKPN^CUPM;".length()];
        QB qb = new QB("WWKWEWKPN^CUPM;");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        intent.putExtra(new String(iArr, 0, i2), TSOverlayActivity.REGISTER_REQUEST_CODE);
        CX.ud();
        Object[] objArr = {intent};
        Method method = Class.forName(C1593ug.zd("\u0017%\u001c+)$ j!..5'18r\t66=/C@", (short) (C1580rY.Xd() ^ (-6331)), (short) (C1580rY.Xd() ^ (-16854)))).getMethod(C1561oA.Kd("`bPbe3Vh^l`lr", (short) (C1633zX.Xd() ^ (-18268))), Class.forName(C1561oA.od("HTIVRKE\u000eBMKP@HM\u0006 DI9AF", (short) (Od.Xd() ^ (-13234)))));
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
            ((Activity) context).overridePendingTransition(0, 0);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final void launchSigningPendingIntent(Context context, int i2, CredentialRequestOptions credentialRequestOptions, TSAuthCallback<?, ?> tSAuthCallback) throws Exception {
        Intent intent = new Intent(context, (Class<?>) TSOverlayActivity.class);
        intent.addFlags(65536);
        intent.putExtra(Wg.Zd("dV+\u0006X)\u0010W8\n9*\rd2\u0018\u0001\\", (short) (OY.Xd() ^ 27486), (short) (OY.Xd() ^ 17305)), TSOverlayActivity.registerCallbackForResultCompletion(tSAuthCallback));
        intent.putExtra(C1561oA.Xd(".0&4$8.55G.B?>.", (short) (C1580rY.Xd() ^ (-12023))), i2);
        Intrinsics.checkNotNull(credentialRequestOptions);
        intent.putExtra(Wg.vd("BRFFHRYOHT\\iPda`0", (short) (Od.Xd() ^ (-902))), getKeyRequestOptions(credentialRequestOptions));
        CX.ud();
        short sXd = (short) (C1580rY.Xd() ^ (-16579));
        short sXd2 = (short) (C1580rY.Xd() ^ (-7202));
        int[] iArr = new int["*6+84-'o$/-2\"*/g{'%*\u001a,'".length()];
        QB qb = new QB("*6+84-'o$/-2\"*/g{'%*\u001a,'");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(((sXd + i3) + xuXd.CK(iKK)) - sXd2);
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = new Class[1];
        short sXd3 = (short) (FB.Xd() ^ 24247);
        short sXd4 = (short) (FB.Xd() ^ 28624);
        int[] iArr2 = new int["\u0015!\u0016#\u001f\u0018\u0012Z\u000f\u001a\u0018\u001d\r\u0015\u001aRl\u0011\u0016\u0006\u000e\u0013".length()];
        QB qb2 = new QB("\u0015!\u0016#\u001f\u0018\u0012Z\u000f\u001a\u0018\u001d\r\u0015\u001aRl\u0011\u0016\u0006\u000e\u0013");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(sXd3 + i4 + xuXd2.CK(iKK2) + sXd4);
            i4++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i4));
        Object[] objArr = {intent};
        short sXd5 = (short) (C1633zX.Xd() ^ (-27955));
        int[] iArr3 = new int["[[GWX$EUIUGQU".length()];
        QB qb3 = new QB("[[GWX$EUIUGQU");
        int i5 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i5] = xuXd3.fK(sXd5 + i5 + xuXd3.CK(iKK3));
            i5++;
        }
        Method method = cls.getMethod(new String(iArr3, 0, i5), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
            ((Activity) context).overridePendingTransition(0, 0);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.transmit.authentication.webauthn.PasskeyProvider
    public void executeWebauthnAuthentication(Context context, CredentialRequestOptions credentialRequestOptions, TSAuthCallback<TSPublicKeyCredential, TSWebAuthnAuthenticationError> callback) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(credentialRequestOptions, "credentialRequestOptions");
        Intrinsics.checkNotNullParameter(callback, "callback");
        launchSigningPendingIntent(context, TSOverlayActivity.SIGN_REQUEST_CODE, credentialRequestOptions, new TSAuthCallback<PublicKeyCredential, TSWebAuthnAuthenticationError>() { // from class: com.transmit.authentication.webauthn.Fido2PasskeyProvider.executeWebauthnAuthentication.1
            final /* synthetic */ TSAuthCallback<TSPublicKeyCredential, TSWebAuthnAuthenticationError> $callback;
            final /* synthetic */ Fido2PasskeyProvider this$0;

            AnonymousClass1(TSAuthCallback<TSPublicKeyCredential, TSWebAuthnAuthenticationError> callback2, Fido2PasskeyProvider this) {
                tSAuthCallback = callback2;
                fido2PasskeyProvider = this;
            }

            @Override // com.transmit.authentication.TSAuthCallback
            public void error(TSWebAuthnAuthenticationError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new Fido2PasskeyProvider$executeWebauthnAuthentication$1$error$1(tSAuthCallback, error, null), 3, null);
            }

            @Override // com.transmit.authentication.TSAuthCallback
            public void success(PublicKeyCredential result) {
                Intrinsics.checkNotNullParameter(result, "result");
                tSAuthCallback.success(fido2PasskeyProvider.getTSPublicKeyCredentialForAuthentication(result));
            }
        });
    }

    @Override // com.transmit.authentication.webauthn.PasskeyProvider
    public void executeWebauthnRegistration(Context context, CredentialCreationOptions credentialCreationOptions, TSAuthCallback<TSRegPublicKeyCredential, TSWebAuthnRegistrationError> callback) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(credentialCreationOptions, "credentialCreationOptions");
        Intrinsics.checkNotNullParameter(callback, "callback");
        launchRegisterPendingIntent(context, credentialCreationOptions, new TSAuthCallback<PublicKeyCredential, TSWebAuthnRegistrationError>() { // from class: com.transmit.authentication.webauthn.Fido2PasskeyProvider.executeWebauthnRegistration.1
            final /* synthetic */ TSAuthCallback<TSRegPublicKeyCredential, TSWebAuthnRegistrationError> $callback;
            final /* synthetic */ Fido2PasskeyProvider this$0;

            C13191(TSAuthCallback<TSRegPublicKeyCredential, TSWebAuthnRegistrationError> callback2, Fido2PasskeyProvider this) {
                tSAuthCallback = callback2;
                fido2PasskeyProvider = this;
            }

            @Override // com.transmit.authentication.TSAuthCallback
            public void error(TSWebAuthnRegistrationError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new Fido2PasskeyProvider$executeWebauthnRegistration$1$error$1(tSAuthCallback, error, null), 3, null);
            }

            @Override // com.transmit.authentication.TSAuthCallback
            public void success(PublicKeyCredential result) {
                Intrinsics.checkNotNullParameter(result, "result");
                tSAuthCallback.success(fido2PasskeyProvider.getTSPublicKeyCredentialForRegistration(result));
            }
        });
    }

    @Override // com.transmit.authentication.webauthn.PasskeyProvider
    public boolean isWebAuthnSupported() {
        return true;
    }
}
