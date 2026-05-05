package com.ticnow.sdk.idnowsecurity.api;

import android.app.Activity;
import android.content.Context;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import com.ticnow.sdk.idnowsecurity.http.codes.IDEnrollmentResponseCodes;
import com.ticnow.sdk.idnowsecurity.http.codes.IDEnrollmentResponseParser;
import com.ticnow.sdk.idnowsecurity.http.nodes.IDBaseUrl;
import com.ticnow.sdk.idnowsecurity.http.nodes.IDCredentials;
import com.ticnow.sdk.idnowsecurity.http.nodes.IDSignResponse;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import com.ticnow.sdk.idnowsecurity.http.request.CommitGenericStepRequest;
import com.ticnow.sdk.idnowsecurity.http.request.CommonParamsRequest;
import com.ticnow.sdk.idnowsecurity.http.request.CommonUserDataRequest;
import com.ticnow.sdk.idnowsecurity.http.request.DeviceDataRequest;
import com.ticnow.sdk.idnowsecurity.http.request.DeviceStatusRequest;
import com.ticnow.sdk.idnowsecurity.http.request.FinishEnrollmentRequest;
import com.ticnow.sdk.idnowsecurity.http.request.InitEnrollmentRequest;
import com.ticnow.sdk.idnowsecurity.http.request.OmmitingEnrollRequest;
import com.ticnow.sdk.idnowsecurity.http.request.RegisterPathRequest;
import com.ticnow.sdk.idnowsecurity.http.request.UpdateNotificationIdRequest;
import com.ticnow.sdk.idnowsecurity.http.request.UserDataRequest;
import com.ticnow.sdk.idnowsecurity.http.response.FinishEnrollmentResponse;
import com.ticnow.sdk.idnowsecurity.http.response.IdNowCommonResponse;
import com.ticnow.sdk.idnowsecurity.http.response.InitEnrollmentResponse;
import com.ticnow.sdk.idnowsecurity.http.response.PushMessageResponse;
import com.ticnow.sdk.idnowsecurity.security.commonstore.IDCommonStorage;
import com.ticnow.sdk.idnowsecurity.security.crypto.IDAes;
import com.ticnow.sdk.idnowsecurity.security.crypto.IDAesLegacy;
import com.ticnow.sdk.idnowsecurity.security.crypto.IDSign;
import com.ticnow.sdk.idnowsecurity.security.ellipticnow.EllipticNow;
import com.ticnow.sdk.idnowsecurity.security.fingerprint.IDFingerprint;
import com.ticnow.sdk.idnowsecurity.security.process.IDProcess;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Яō\u0014D57\u001eq\u007fZDkt\nA\u000e0!.J~(/\u001aw\u0015rrˎ8DsH6ɟ[*%k\u0004é,[:qKП]\u001a\f+\u0011ѧVg}nRҙ\u0013C\u001d\u0016\u001exp0QU\u000f]\u001aƁ:B\u0006?;ݹw=O`|Ȃ\r H\"@y\u001b\u0001\"*N\u0010~zYK\u0014\u00126@x:h\rUĨ\"\u0012\u001c>(\u0001$]oNLHtҗB/9\u0003qĩV'u0\u0005M\u0013F\\'#viӜ3@M5\u001d%Y\u0003\u000fRq?\u000bӊy=\u001bh/ݐ3I\nW>X\u0006\u0019\u001d+e\reö.\\\u001bQh\f-+WcaP\u0016ߊ\u007fz\u0012\rD\u0004\u0014\u001d=Ξ^-He@\u0014\u0012TS5#4fD\u0003\u0003ѐe6%%HI9B3f\u007fkk\u001d\\B\u0014\u0005;*S\u0005|.sT<n[/\u001d\u000e_@i@kX~\u000egH\u0006\u0004\u001fn2.\u0012=_\u007f]\nWB_=ElQ%7j0Ztk\u0005\u0010xh\u0002u\u0003LN/\u0007\u0016e8O #dr\u0018\u0004RjWZ%} b\u0012\u0016\bA,\r{J.=\u0010|]\u0019mxbu\nSC-K\"\u000fy$o;t2ce\u0014\u0014o]\u000f\u0014mH\u0013\tfsZS:h\r,0G`j>\fBX\u0017,!IWs23ZEI`#S\u001b\u001epM-\rmg\u0001\u0010-bc(\u0011~<t7\u0015\u0017p9\u0010u\u0011a.\u0013_PAqUC$>UPtd\u00011\u0014\u0017s.U\u0018PUa\u0005\u0016$iB4^8GjG=A\u0017/-@\rEEz~\u0016U[\u001f?z+\b??vC\u007f\b\u0019xrt3\u0007]n/\"%y#'\u0016o\u0018y\u0010R+Kqa#[lW#\u0007gXf8+\"O\"3\u001f\b\"+T]M5=.}$1%a\f\f\u001eO*f\u001dI\re24**8\u0019_\u0002J;fn\n\u0003L-<l1Nxn\u0006\u0015Z\tb\u001bcLO\u0001\tVfj;3\f\u0005\u001f,;\u0010\u0007gH9\b\u0006D0o*\"e\u0014\u0013\rdk%\u0016\nu\u0015\u0006K\u000b3z\u0013\u0018\u0016\u00141\u001d\u001eLA.cob7>6w&RY;\u0011\"l\r2RD<6*s`w,(\u0003\u0010Ho\u000fETXriwThA#dq\u001d`s\u000bQ.\u000f\n'3L\u0005e5\u0013z^T]qb\u0005a9!\u001b\u0019l/j3I\\Tg:X\\\u000f6]]qQ2:\u0012sAm\u001aw<D&#5J(\u001dIQ?\u0002\r/\r,\u001cx\u0017?\u0005?~R|PY\u0003\t\b&<8\u001b;\u001d]\u007f\bb[Z~{E_2\u0001EaY\u000b\u001a\u001b{FIL6;;lal*&*\b\u0004A\f98\"=\u0003#S\r[\u001c\u001a\"]IBFu$\u000e\u001a\tAXP\u0010<p\rz\u001a0\u00186}$I\u0001A\u007f \u007f@ON[Cl4w{l\u0007\u0015{l\u0012z\u0006\u000f\u0011sIV(|]T+%?M\\0\t^H/k \u000700\u0018#I766jo$\u0018\u0002v'\u0004O\nD[3y5y1^^N\u0002-\u0007\u000e\u0004XbX\u0019I\ne>\u0013\u0011#\u0001\u000bm\u001c\u0017\u0003(\u0013|<-\"\b\u0017H\r\u001dC8T\u007f6d]E_3$%U\u001a\u001f\u0006[HT[aVM&O29{Xz\u001f\u0010Rb#\u000epVQ\u000b\u000e#D/\\SkVW]2x|\u0003TWu<P\u0015D\u0011<\u001fun\u0001@L\u001a2\u001eQPa\u007fI\u0015\u000f P\u0006\u001e\u0013I9x^k%X\u000f-\u0005\u001b~\u00121\u001aB:K;I=O\b\u001b\u0006pk)Cpd':\u000e\u0016N\rZ{V=o\\MC\u00076y\u0004z0\u000e-f<\u0006$_FYyb8#tFfug\u0004TLd\u0010t-U1\u0011y\u001a.y\u0018\"\u0007\n\u0003zAC2'\nV*[37I[s\u0012\u000br\u0019u\u0018E\u001c\u001e)a%-\u0014]9X+w;\u0014C%{J\\\f\u0004hx\u0012:\bRXYX\u0012]\u0016bp\u0003j\u001c_\u0010\u0014FY%\r2@wf)\u001eng0'yBv:j\u0004eA\u0011\u0017p\u00132kFB:\u00196\u001a<\u0015/\u0002,\u0018')[QUBYG@\",%+\u001cs%41\u0018nULmq\u0007Ki7\u0019:bXc3#\u0019\u001e9Y4C\u0017\u0016iY@wZL%BX4\u001auhV\u001d\\xr64DxH^OrEs\u007fJ1mY#p\u00172\u0011C\fh\u001f8OW\u001d`\u001c7u\u0011\u0010T(C/\u001290\u0004=@.\f\r_J,\fjVm|\u001cWV\u0017*b/\u0002\u001eAE@y~\u0007iM$o?-\u0018P+2\u0013+$\u0011uY}VHmVd6\u00053xOg\u001c~B\u0019\u001b+x\u001a;$8\u0004\u0014m\n\u001f745igp0<F!G}rB*.\u000etKqMs5&\u001dL<\n\u0011\u0012[\u0010\u0018|^tXl%\b*NU\u001a\u001aK.({\u0011G>nmc\u001ct$Xn\u001cq4\u001a<\u0015}\u0001s|>\u0012LlLzq~O,#\u0018D+'nJ`A>l\u001d05A`jG\r1Oo$,7r\u0005SkA\u0013:aP[$9\u0010p\u0014h\u0003a&\u001f,aAA%oZ\tE\tLs\u000b\u0004\u001b\u0013}4\u0012-G2t\u0015p ;\u001d?m\u0017Dp\u000eT\u001b\u0013\b\u0007S\u0001a&#\u0001o\u0017#L&q[GT9\u00131'l\f@&pz\u001d`#9v\u0006\u0014{*B*=\u0015A\"\u0004yW:YB;6),q  ;sX\u00044d1P\u0002d'\\\\ON˕e\u008d]M\nۿ:+*\u000b#+\"J:O@(s\r\u001d=0J\u0015vOΘKà\u0010/|҉˝6T"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3$", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u000f", "u(E", ">qT3f", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bnCY{0Dq%B\u0017AEs<(\u001evpC\u0014cu2U\u0005QTV6e@\u0002G!\u000e\\\u000e$", "5dc\u001de,?a", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\f 5}#2\\W\u0005i>&\u001drjG\u0016m9N@\u000b&*X4d\\{+#\u001cg\nP+b", "Adc\u001de,?a", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~g}\u001eGz\u001a=a\r9u<&\u001fqoH\u0011p,\u0018Z\u0006%VV4f[`L\u001e\u001fV\u0010N\u0001Pu", "B`V", "", "/u^6W\u0013>U\u0015|\u000fL0~\u0012", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "1gT0^\u001d\n'\u0007\u0003|g", "", "1kT.e\fG`#\u0006\u0002f,\u0006\u0018", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gxgJC\u0019A6V~1P9N:g\\{K\u0014g", "2dR?l7M2\u0015\u000ev", "", "2`c.", "2d]0e@Ibwz\nZ\u0010\u0006\r>", "3mR?l7M2\u0015\u000ev", "3mR?l7M2\u0015\u000evB5\u0001\u0018", "3mR?l7MA(\f~g.", "5d]2e(MSv\t\u0003f0\fj/n\u007f5\u007f>n&\u0017R\\\u000eH\u0007%Ch", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rT1OTR;>R{=!\u0016X{]+\u0018qYM4nRF\f\b:Y\tJ>", "1n\\:b5)O&z\u0003l\u0019|\u0015?e\u000e7", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010N([r/U9N8lR\u0001Li", "1n\\:b5.a\u0019\fYZ;xu/q\u0010(\nO", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010S:N\u0004\u0006C[J\u0019\\^\u0003=\"!0", "D`[BX:", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", ">`c5<+", "5d]2e(MSw~\fb*|v>a\u000f8\n-\u0001#'G}\u001d", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rX'PL[(kRQ=%\u0016X\u000e<:\t\u0014iO\u0011nPG\u001f\u0016;6\u0002Ix\b\u001bk", "/cS6g0H\\\u0015\u0006]^({\t<s", "5d]2e(MSy\u0003\u0004b:\u007fh8r\n/\u0003H\u0001 &4o\u001aLv3D", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rX'PL[(kRSA\u001d\u0016h\u0011.4\u001a\u000f`H,nMF\f\b8Y\u0002Iwm\f$\u001e<yF", "5d]2e(MSz~\nK,~\r=t\u007f5f<\u0010\u001a\u0004G{\u001e<\u00054", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rX'PL[(kRT=#~Z\u0010R9\u001c\u0005f, }G$\u001f\u0014<I\u0010JU\u0001\u001a&\u0015D@", "3ma<_3FS\"\u000eir7|", "AdV:X5M", "5d]2e(MS|\b~m\f\u0006\u00169l\u00070{I\u0010\u0004\u0017S\u007f\u000eJ\u0006", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rX'PL[(kRVF\u0018!:\u0017[5\u0014\faA-}17+\u0018,W\u0011(h\u000f\u001c\u001d\u001d\u000b", "CrT?7(MO\u0006~\u0007n,\u000b\u0018", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}\u000e#hn\u0018\u0003r(;v3WL\\;2", "2de6V,\u001dO(zg^8\r\t=t", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}|\u0015ye7\u0007B(]r\u0014GX^,jaH", "<nc6Y0<O(\u0003\u0005g\u0010{", "5d]2e(MS\u0003\u0007\u0003b;\f\r8g_1\tJ\b\u001e\u0005Vo\u0019)v1EY\f/", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rX'PL[(kR\\E\u001c\u0016i\u001dR4\u000fdbN.uK%.\b76\u0002Gx\u0001\u001a%z5x\u0001Iee", "5d]2e(MS\t\nyZ;|q9t\u0004)\u007f>|&\u001bQxq;c%Ai}.F", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}\u000e g]H\u0007L6]z(KJJ;`\\{!\u0013~Z\u001a^+\u001b\u0014/", "5dc\u0011X=BQ\u0019njB\u000b", "5dc\u0016W\u0015Hev\fz],\u0006\u00183a\u00076", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005O\u0013{\"h`9\u0010r0J}5\u001d", "5dc\u0016W\u0015He{\t\tm", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005O\u0013z\u0011va)\u0014j\u0002", "5dc\u001aX:LO\u001b~", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4g\u007fxo<nc:\\r)G9N:g\\{K\u0014g", ";rV", "7mXAF\u000b$", "1qT1X5MW\u0015\u0006\t", "6nbA", ">q^0X:L3\"\u0010~k6\u0006\u0011/n\u000f6", "3me6e6G[\u0019\b\nl", ">q^0X:L4\u001d\b~l/\\\u0012<o\u0007/\u0004@\n&\u0004G}\u0019F\u007f35", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\ra4QJN:j3vF\u0018 ]mW8\u0017\f`I$wS$\u001f\u00167S\u000bIhm\f$\u001e<yF", "4h]6f/\u001e\\&\t\u0002e4|\u0012>R\u007f6\u0007J\n%\u0017", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gulj=\u0015f\fW\u00041NSV,ea_=\"\u001dd\u0017\\+b", ">q^0X:L4\u001d\b~l/\\\u0012<o\u0007/\u0004@\n&\u0004G}\u0019F\u007f35B]}", ">q^0X:L7\"\u0003\n>5\n\u00136l\b(\u0005Om\u0017%Ry\u0017Jv", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\ra4QJN:j6{A#qc\u001bX2\u0014\rYJ3[DE*\u00125W\u0002(h\u000f\u001c\u001d\u001d\u000b", "7mXA85K] \u0006\u0003^5\fu/s\u000b2\u0005N\u0001", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gxqeHfl9X}.OLW;IR\u0001H\u001e\u001bh\u000e$", ">q^0X:L7\"\u0003\n>5\n\u00136l\b(\u0005Om\u0017%Ry\u0017Jv\u000e?9\u00071", "@db2g\fGd\u001d\f\u0005g4|\u0012>P{5wH\u000f", "@db2g\u001a!A\u0004\u000f\ta", "@db2g\u001a!A\u0007\u0003|g", "@db2g\u001cNW\u0018", "A`e2<+']+\\\b^+|\u0012>i{/\n", "/oX\"f,K", "/oX\u0018X@", "A`e2<+']+a\u0005l;", "A`e2C0G", ">h]", "AdRBe,)W\"", "Adc\"c\u001a\u001d9", "D`[6W(MS\u0004\u0003\u0004", "2dR<W,", "3mR<W,", "\u0011n\\:\\; S\"~\bb*j\u0018/pl(\bP\u0001%&4o\u001cL}4", "\u0015d]2e(MSw~\fb*|v>a\u000f8\n-\u0001#'G}\u001d)v3E`\r", "\u0015d]2e(MSy\u0003\u0004b:\u007fh8r\n/\u0003H\u0001 &4o\u001aLv3DF}.Gt%", "\u0015d]2e(MSz~\nK,~\r=t\u007f5f<\u0010\u001a\u0004G{\u001e<\u00054\"Y\f0>|", "\u0015d]2e(MS|\b~m\f\u0006\u00169l\u00070{I\u0010\u0004\u0017S\u007f\u000eJ\u0006\u00125g\u000e'F", "\u0015d]2e(MS\u0003\u0007\u0003b;\f\r8g_1\tJ\b\u001e\u0005Vo\u0019)v1EY\f/$m$>TR", "\u001eq^0X:L4\u001d\b~l/\\\u0012<o\u0007/\u0004@\n&\u0004G}\u0019F\u007f35F}.Gt%", "\u001eq^0X:L7\"\u0003\n>5\n\u00136l\b(\u0005Om\u0017%Ry\u0017Jv\u00125g\u000e'F", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDSecurityApiImpl implements IDSecurityApi {
    private IDCommonStorage prefs;
    private final String tag = "IDSecurityApiImpl";

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4\u0012}\u0012njG9LeN.ZS8\u0015s{:$aҜwYП\u0006\u001a,!If^munb\\!B=\u0007&~x.aW\u000f\\@\u0012̓FoM7\u0016xKFxvL\u0004N3hهzM\n(8`\u0012\ryqNRܼ1\t\u0010Ha%M3܅B\u000eD \u000f\u001etid5vm\u000eB5#\u0011kZP=^^\u007f\u0014ϼE\u001d8\u001b\u0007y\u001eYQg;#7k\u0005\u001dQ\n>Iԡr\u0006\fv:?+w\b\u001e\u0383WH\u001b#@g\r\fulٯ\u0004\"z\u001a'CQyJ~\u000f~Â\u0007ԫ\u0011H\f\u05fa\u001e)N3; \u0007\n\u0014:\u0003z$Z^\u0004vD\u0016y\u00109mӢ\fĴ/E#ƘicA\"\\A\u001c\u0007\u0013)1\r\u0382%q"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rT1OTR;>R{=!\u0016X{]+\u0018qYM4nRF\f\b:Y\tJ>", "", "\u0011n\\:\\; S\"~\bb*j\u0018/pl(\bP\u0001%&", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpi=\u0016E,Wv4KJ<;\\]_= \"Z\u001c]\u0001", "3qa<e", "", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCgrriA\u000br\u000eN\u007f'TPL\u001akR}*\u0014\u001ej\u000e\\:bk^=5j\u000e>\u001b\u0011.\u0013oJu\u0005\u0015\u0018cx[", "5dc\u0010b4FW(`zg,\n\r-S\u000f(\u0007-\u0001#'G}\u001d", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MOKkB-^FkA\u000fg;0v0GYR*JarH\u0001\u0012f\u001eN9\u001cZ", "Adc\u0010b4FW(`zg,\n\r-S\u000f(\u0007-\u0001#'G}\u001d", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCgrriA\u000br\u000eN\u007f'TPL\u001akR}*\u0014\u001ej\u000e\\:bHJ", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012e9H`", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class CommitGenericStepRequestResult {
        private CommitGenericStepRequest CommitGenericStepRequest;
        private String error;

        public CommitGenericStepRequestResult(CommitGenericStepRequest commitGenericStepRequest, String str) {
            this.CommitGenericStepRequest = commitGenericStepRequest;
            this.error = str;
        }

        public static /* synthetic */ CommitGenericStepRequestResult copy$default(CommitGenericStepRequestResult commitGenericStepRequestResult, CommitGenericStepRequest commitGenericStepRequest, String str, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                commitGenericStepRequest = commitGenericStepRequestResult.CommitGenericStepRequest;
            }
            if ((i2 & 2) != 0) {
                str = commitGenericStepRequestResult.error;
            }
            return commitGenericStepRequestResult.copy(commitGenericStepRequest, str);
        }

        public final CommitGenericStepRequest component1() {
            return this.CommitGenericStepRequest;
        }

        public final String component2() {
            return this.error;
        }

        public final CommitGenericStepRequestResult copy(CommitGenericStepRequest commitGenericStepRequest, String str) {
            return new CommitGenericStepRequestResult(commitGenericStepRequest, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommitGenericStepRequestResult)) {
                return false;
            }
            CommitGenericStepRequestResult commitGenericStepRequestResult = (CommitGenericStepRequestResult) obj;
            return Intrinsics.areEqual(this.CommitGenericStepRequest, commitGenericStepRequestResult.CommitGenericStepRequest) && Intrinsics.areEqual(this.error, commitGenericStepRequestResult.error);
        }

        public final CommitGenericStepRequest getCommitGenericStepRequest() {
            return this.CommitGenericStepRequest;
        }

        public final String getError() {
            return this.error;
        }

        public int hashCode() {
            CommitGenericStepRequest commitGenericStepRequest = this.CommitGenericStepRequest;
            int iHashCode = (commitGenericStepRequest != null ? commitGenericStepRequest.hashCode() : 0) * 31;
            String str = this.error;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final void setCommitGenericStepRequest(CommitGenericStepRequest commitGenericStepRequest) {
            this.CommitGenericStepRequest = commitGenericStepRequest;
        }

        public final void setError(String str) {
            this.error = str;
        }

        public String toString() {
            return "CommitGenericStepRequestResult(CommitGenericStepRequest=" + this.CommitGenericStepRequest + ", error=" + this.error + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jA0ZeP.Xc2\u000fy\u0005<$a$yCI[\"}(\tUȥm}ñzZ9BO-&~x,aW\u000f\\@\u0010BH}AKO\u0006<gc\u0005B\u0013$J*H{\u0015\u0001H0^\u000f%\u007fŲO\f 7\tyHf%O\u001b\u0019@\u0007\u0005ů\u0002feucNJ\u0003\\h2iʌj\u000b]5uH\u0005]\u000fVTU\u0013\r`L0\u0007́6]Va\u001a\u001fR\nΪ3Gw=\u0013h?)AH\"Xf`\u0006\u0014#-g\u000fsqT_5_f\f5/gk[R\u001e(&\u0001\u0012\fj\tTρ&\u0011?;2~\b<L%xaZh\u0004tA.y(پ\u0018m\u0007AFQ\u001b\u0015m(\u07b9\u0018\u0017>\n\"%\u001eQ\u00045ŦZ%(n\u00153V\u000eP_R\u0017ׇTݳ\u000eeEЧ\u001crh\n8\rPI\u00069\n\u001c~139s;9 \u001a\u0005\u001fֺsЛ\tlpׅ\u0002TNL0{690\u0017\u001ai\u0015\u0005\u0013oh\\h.!MJZ\u001d|6\u0018vφ\u0004˶%1\u0018ʚgjoz[n*'5xElˍo,"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rX'PL[(kRQ=%\u0016X\u000e<:\t\u0014iO\u0011nPG\u001f\u0016;6\u0002Ix\b\u001bk", "", "\u0012de6V,,b\u0015\u000e\u000bl\u0019|\u0015?e\u000e7", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}|\u0015ye7\u0007Q;J\u00067U9N8lR\u0001Li", "3qa<e", "", "6dP1X9L", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCgshr=\u0005c\u001a]r6WZ;,hbrK#gA\u0013J<\tN`=-p\u000e%.\u00150R\u0004\u0011O\u0006\b'\n~z\u007fF]Y#\u0007\"qU\u0010lTh5=8", "5dc\u0011X=BQ\u0019l\nZ;\r\u0017\u001ce\f8{N\u0010", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MOKkB-^GaJ\u000ba,<\u0006#V\\\\\u0019\\^\u0003=\"!0", "Adc\u0011X=BQ\u0019l\nZ;\r\u0017\u001ce\f8{N\u0010", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCgshr=\u0005c\u001a]r6WZ;,hbrK#g\u001e~", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012e9H`", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0015X(=S&\r", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u0015X(=S&\r", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class GenerateDeviceStatusRequestResult {
        private DeviceStatusRequest DeviceStatusRequest;
        private String error;
        private ArrayList<KeyValue> headers;

        public GenerateDeviceStatusRequestResult(DeviceStatusRequest deviceStatusRequest, String str, ArrayList<KeyValue> arrayList) {
            this.DeviceStatusRequest = deviceStatusRequest;
            this.error = str;
            this.headers = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GenerateDeviceStatusRequestResult copy$default(GenerateDeviceStatusRequestResult generateDeviceStatusRequestResult, DeviceStatusRequest deviceStatusRequest, String str, ArrayList arrayList, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                deviceStatusRequest = generateDeviceStatusRequestResult.DeviceStatusRequest;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                str = generateDeviceStatusRequestResult.error;
            }
            if ((i2 + 4) - (i2 | 4) != 0) {
                arrayList = generateDeviceStatusRequestResult.headers;
            }
            return generateDeviceStatusRequestResult.copy(deviceStatusRequest, str, arrayList);
        }

        public final DeviceStatusRequest component1() {
            return this.DeviceStatusRequest;
        }

        public final String component2() {
            return this.error;
        }

        public final ArrayList<KeyValue> component3() {
            return this.headers;
        }

        public final GenerateDeviceStatusRequestResult copy(DeviceStatusRequest deviceStatusRequest, String str, ArrayList<KeyValue> arrayList) {
            return new GenerateDeviceStatusRequestResult(deviceStatusRequest, str, arrayList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenerateDeviceStatusRequestResult)) {
                return false;
            }
            GenerateDeviceStatusRequestResult generateDeviceStatusRequestResult = (GenerateDeviceStatusRequestResult) obj;
            return Intrinsics.areEqual(this.DeviceStatusRequest, generateDeviceStatusRequestResult.DeviceStatusRequest) && Intrinsics.areEqual(this.error, generateDeviceStatusRequestResult.error) && Intrinsics.areEqual(this.headers, generateDeviceStatusRequestResult.headers);
        }

        public final DeviceStatusRequest getDeviceStatusRequest() {
            return this.DeviceStatusRequest;
        }

        public final String getError() {
            return this.error;
        }

        public final ArrayList<KeyValue> getHeaders() {
            return this.headers;
        }

        public int hashCode() {
            DeviceStatusRequest deviceStatusRequest = this.DeviceStatusRequest;
            int iHashCode = (deviceStatusRequest != null ? deviceStatusRequest.hashCode() : 0) * 31;
            String str = this.error;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            ArrayList<KeyValue> arrayList = this.headers;
            return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
        }

        public final void setDeviceStatusRequest(DeviceStatusRequest deviceStatusRequest) {
            this.DeviceStatusRequest = deviceStatusRequest;
        }

        public final void setError(String str) {
            this.error = str;
        }

        public final void setHeaders(ArrayList<KeyValue> arrayList) {
            this.headers = arrayList;
        }

        public String toString() {
            return "GenerateDeviceStatusRequestResult(DeviceStatusRequest=" + this.DeviceStatusRequest + ", error=" + this.error + ", headers=" + this.headers + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jA0ZeP.Xc2\u000fy\u0005<$a$yCI[\"}(\tUȥm}ñzZ9BO-&~x,aW\u000f\\@\u0010BH}AKO\u0006<gc\u0005B\u0013$J*H{\u0015\u0001H0^\u000f%\u007fŲO\f 7\tyHf%O\u001b\u0019@\u0007\u0005ů\u0002feucNJ\u0003\\h2iʌj\u000b]5uH\u0005]\u000fVTU\u0013\r`L0\u0007́6]Va\u001a\u001fR\nΪ3Gw=\u0013h?)AH\"Xf`\u0006\u0014#-g\u000fsqT_5_f\f5/gk[R\u001e(&\u0001\u0012\fj\tTρ&\u0011?;2~\b<L%xaZh\u0004tA.y(پ\u0018m\u0007AFQ\u001b\u0015m(\u07b9\u0018\u0017>\n\"%\u001eQ\u00045ŦZ%(n\u00153V\u000eP_R\u0017ׇTݳ\u000eeEЧ\u001crh\n8\rPI\u00069\n\u001c~139s;9 \u001a\u0005\u001fֺsЛ\tlpׅ\u0002TNL0{690\u0017\u001ai\u0015\u0005\u0013oh\\h.!MJZ\u001d|6\u0018vφ\u0004˶%1\u0018ʚgjoz[n*'5xElˍo,"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rX'PL[(kRSA\u001d\u0016h\u0011.4\u001a\u000f`H,nMF\f\b8Y\u0002Iwm\f$\u001e<yF", "", "\u0014h]6f/\u001e\\&\t\u0002e4|\u0012>R\u007f4\f@\u000f&", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}~\u0019qeG\nC5[\u0001.NTN5k?rI$\u0012h\u001d$", "3qa<e", "", "6dP1X9L", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCgulj=\u0015f\fW\u00041NSV,ea_= \"Z\u001c]\u0001s\nUR 8K3(\nu7\u0011Hl\n\u000ekt:f\u0002>  V}\u001c?\u001d6uBmF}UP\u001b&\u001b", "5dc\u0013\\5Ba\u001c^\u0004k6\u0004\u00107e\t7h@\r'\u0017U~", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MOKkB-^IeB\u000bq/.\u007f4QSU4\\[\u0002*\u0014\u001ej\u000e\\:b", "Adc\u0013\\5Ba\u001c^\u0004k6\u0004\u00107e\t7h@\r'\u0017U~", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCgulj=\u0015f\fW\u00041NSV,ea_= \"Z\u001c]\u0001Pu", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012e9H`", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0015X(=S&\r", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u0015X(=S&\r", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class GenerateFinishEnrollmentRequestResult {
        private FinishEnrollmentRequest FinishEnrollmentRequest;
        private String error;
        private ArrayList<KeyValue> headers;

        public GenerateFinishEnrollmentRequestResult(FinishEnrollmentRequest finishEnrollmentRequest, String str, ArrayList<KeyValue> arrayList) {
            this.FinishEnrollmentRequest = finishEnrollmentRequest;
            this.error = str;
            this.headers = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GenerateFinishEnrollmentRequestResult copy$default(GenerateFinishEnrollmentRequestResult generateFinishEnrollmentRequestResult, FinishEnrollmentRequest finishEnrollmentRequest, String str, ArrayList arrayList, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                finishEnrollmentRequest = generateFinishEnrollmentRequestResult.FinishEnrollmentRequest;
            }
            if ((i2 + 2) - (2 | i2) != 0) {
                str = generateFinishEnrollmentRequestResult.error;
            }
            if ((i2 & 4) != 0) {
                arrayList = generateFinishEnrollmentRequestResult.headers;
            }
            return generateFinishEnrollmentRequestResult.copy(finishEnrollmentRequest, str, arrayList);
        }

        public final FinishEnrollmentRequest component1() {
            return this.FinishEnrollmentRequest;
        }

        public final String component2() {
            return this.error;
        }

        public final ArrayList<KeyValue> component3() {
            return this.headers;
        }

        public final GenerateFinishEnrollmentRequestResult copy(FinishEnrollmentRequest finishEnrollmentRequest, String str, ArrayList<KeyValue> arrayList) {
            return new GenerateFinishEnrollmentRequestResult(finishEnrollmentRequest, str, arrayList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenerateFinishEnrollmentRequestResult)) {
                return false;
            }
            GenerateFinishEnrollmentRequestResult generateFinishEnrollmentRequestResult = (GenerateFinishEnrollmentRequestResult) obj;
            return Intrinsics.areEqual(this.FinishEnrollmentRequest, generateFinishEnrollmentRequestResult.FinishEnrollmentRequest) && Intrinsics.areEqual(this.error, generateFinishEnrollmentRequestResult.error) && Intrinsics.areEqual(this.headers, generateFinishEnrollmentRequestResult.headers);
        }

        public final String getError() {
            return this.error;
        }

        public final FinishEnrollmentRequest getFinishEnrollmentRequest() {
            return this.FinishEnrollmentRequest;
        }

        public final ArrayList<KeyValue> getHeaders() {
            return this.headers;
        }

        public int hashCode() {
            FinishEnrollmentRequest finishEnrollmentRequest = this.FinishEnrollmentRequest;
            int iHashCode = (finishEnrollmentRequest != null ? finishEnrollmentRequest.hashCode() : 0) * 31;
            String str = this.error;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            ArrayList<KeyValue> arrayList = this.headers;
            return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
        }

        public final void setError(String str) {
            this.error = str;
        }

        public final void setFinishEnrollmentRequest(FinishEnrollmentRequest finishEnrollmentRequest) {
            this.FinishEnrollmentRequest = finishEnrollmentRequest;
        }

        public final void setHeaders(ArrayList<KeyValue> arrayList) {
            this.headers = arrayList;
        }

        public String toString() {
            return "GenerateFinishEnrollmentRequestResult(FinishEnrollmentRequest=" + this.FinishEnrollmentRequest + ", error=" + this.error + ", headers=" + this.headers + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jA0ZeP.Xc2\u000fy\u0005<$a$yCI[\"}(\tUȥm}ñzZ9BO-&~x,aW\u000f\\@\u0010BH}AKO\u0006<gc\u0005B\u0013$J*H{\u0015\u0001H0^\u000f%\u007fŲO\f 7\tyHf%O\u001b\u0019@\u0007\u0005ů\u0002feucNJ\u0003\\h2iʌj\u000b]5uH\u0005]\u000fVTU\u0013\r`L0\u0007́6]Va\u001a\u001fR\nΪ3Gw=\u0013h?)AH\"Xf`\u0006\u0014#-g\u000fsqT_5_f\f5/gk[R\u001e(&\u0001\u0012\fj\tTρ&\u0011?;2~\b<L%xaZh\u0004tA.y(پ\u0018m\u0007AFQ\u001b\u0015m(\u07b9\u0018\u0017>\n\"%\u001eQ\u00045ŦZ%(n\u00153V\u000eP_R\u0017ׇTݳ\u000eeEЧ\u001crh\n8\rPI\u00069\n\u001c~139s;9 \u001a\u0005\u001fֺsЛ\tlpׅ\u0002TNL0{690\u0017\u001ai\u0015\u0005\u0013oh\\h.!MJZ\u001d|6\u0018vφ\u0004˶%1\u0018ʚgjoz[n*'5xElˍo,"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rX'PL[(kRT=#~Z\u0010R9\u001c\u0005f, }G$\u001f\u0014<I\u0010JU\u0001\u001a&\u0015D@", "", " dV6f;>`\u0004z\na\u0019|\u0015?e\u000e7", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}\u000b\u0015jeG\u0016c99r6J9N8lR\u0001Li", "3qa<e", "", "6dP1X9L", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCg\u0002hc=\u0015r,[a#VO;,hbrK#gA\u0013J<\tN`=-p\u000e%.\u00150R\u0004\u0011O\u0006\b'\n~z\u007fF]Y#\u0007\"qU\u0010lTh5=8", "5dc\u001fX.Ba(~\bI(\f\f\u001ce\f8{N\u0010", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MOKkB-^Ua;\u000bq;N\u0004\u0012C[Q\u0019\\^\u0003=\"!0", "Adc\u001fX.Ba(~\bI(\f\f\u001ce\f8{N\u0010", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCg\u0002hc=\u0015r,[a#VO;,hbrK#g\u001e~", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012e9H`", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0015X(=S&\r", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u0015X(=S&\r", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class GenerateGetRegisterPathRequestResult {
        private RegisterPathRequest RegisterPathRequest;
        private String error;
        private ArrayList<KeyValue> headers;

        public GenerateGetRegisterPathRequestResult(RegisterPathRequest registerPathRequest, String str, ArrayList<KeyValue> arrayList) {
            this.RegisterPathRequest = registerPathRequest;
            this.error = str;
            this.headers = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GenerateGetRegisterPathRequestResult copy$default(GenerateGetRegisterPathRequestResult generateGetRegisterPathRequestResult, RegisterPathRequest registerPathRequest, String str, ArrayList arrayList, int i2, Object obj) {
            if ((1 & i2) != 0) {
                registerPathRequest = generateGetRegisterPathRequestResult.RegisterPathRequest;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                str = generateGetRegisterPathRequestResult.error;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                arrayList = generateGetRegisterPathRequestResult.headers;
            }
            return generateGetRegisterPathRequestResult.copy(registerPathRequest, str, arrayList);
        }

        public final RegisterPathRequest component1() {
            return this.RegisterPathRequest;
        }

        public final String component2() {
            return this.error;
        }

        public final ArrayList<KeyValue> component3() {
            return this.headers;
        }

        public final GenerateGetRegisterPathRequestResult copy(RegisterPathRequest registerPathRequest, String str, ArrayList<KeyValue> arrayList) {
            return new GenerateGetRegisterPathRequestResult(registerPathRequest, str, arrayList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenerateGetRegisterPathRequestResult)) {
                return false;
            }
            GenerateGetRegisterPathRequestResult generateGetRegisterPathRequestResult = (GenerateGetRegisterPathRequestResult) obj;
            return Intrinsics.areEqual(this.RegisterPathRequest, generateGetRegisterPathRequestResult.RegisterPathRequest) && Intrinsics.areEqual(this.error, generateGetRegisterPathRequestResult.error) && Intrinsics.areEqual(this.headers, generateGetRegisterPathRequestResult.headers);
        }

        public final String getError() {
            return this.error;
        }

        public final ArrayList<KeyValue> getHeaders() {
            return this.headers;
        }

        public final RegisterPathRequest getRegisterPathRequest() {
            return this.RegisterPathRequest;
        }

        public int hashCode() {
            RegisterPathRequest registerPathRequest = this.RegisterPathRequest;
            int iHashCode = (registerPathRequest != null ? registerPathRequest.hashCode() : 0) * 31;
            String str = this.error;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            ArrayList<KeyValue> arrayList = this.headers;
            return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
        }

        public final void setError(String str) {
            this.error = str;
        }

        public final void setHeaders(ArrayList<KeyValue> arrayList) {
            this.headers = arrayList;
        }

        public final void setRegisterPathRequest(RegisterPathRequest registerPathRequest) {
            this.RegisterPathRequest = registerPathRequest;
        }

        public String toString() {
            return "GenerateGetRegisterPathRequestResult(RegisterPathRequest=" + this.RegisterPathRequest + ", error=" + this.error + ", headers=" + this.headers + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jA0ZeP.Xc2\u000fy\u0005<$a$yCI[\"}(\tUȥm}ñzZ9BO-&~x,aW\u000f\\@\u0010BH}AKO\u0006<gc\u0005B\u0013$J*H{\u0015\u0001H0^\u000f%\u007fŲO\f 7\tyHf%O\u001b\u0019@\u0007\u0005ů\u0002feucNJ\u0003\\h2iʌj\u000b]5uH\u0005]\u000fVTU\u0013\r`L0\u0007́6]Va\u001a\u001fR\nΪ3Gw=\u0013h?)AH\"Xf`\u0006\u0014#-g\u000fsqT_5_f\f5/gk[R\u001e(&\u0001\u0012\fj\tTρ&\u0011?;2~\b<L%xaZh\u0004tA.y(پ\u0018m\u0007AFQ\u001b\u0015m(\u07b9\u0018\u0017>\n\"%\u001eQ\u00045ŦZ%(n\u00173V\u000eP_T\u0017ׇTݳ\u000eeEЧ\u001crh\n8\rPI\u00069\n\u001c~73;sA3#{\u0002vJ}u3e?\u05ccuʐLL*Â.90\u0015\u001agdf\u000by^c)F\u001fM4V\u001d|6\u0014vφ\u0004˶%1\u0018ʚgjoz[n*'5xElˍo,"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rX'PL[(kRVF\u0018!:\u0017[5\u0014\faA-}17+\u0018,W\u0011(h\u000f\u001c\u001d\u001d\u000b", "", "7mXA85K] \u0006\u0003^5\fu/q\u0010(\nO", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}\u0002\u001elp\u0019\u0010p6U}/GU]\u0019\\^\u0003=\"!0", "3qa<e", "", "6dP1X9L", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCgxqeHfl9X}.OLW;IR~M\u0014 ic50\t\u0016U\u000b+jM9hu;V\u0006DjVr\u001b\nFf:Re\u0014NCp\u0003N%|-]m\t\u001d\u00056", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012e9H`", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0015X(=S&\r", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u0015X(=S&\r", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "5dc\u0016a0M3\"\f\u0005e3\u0005\t8tl(\bP\u0001%&", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MOKkB-^Lj=\u0016C5[\u0001.NTN5k?rI$\u0012h\u001d$", "Adc\u0016a0M3\"\f\u0005e3\u0005\t8tl(\bP\u0001%&", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCgxqeHfl9X}.OLW;IR~M\u0014 ic\u0012\u001c", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class GenerateInitEnrollmentRequestResult {
        private String error;
        private ArrayList<KeyValue> headers;
        private InitEnrollmentRequest initEnrollmentRequest;

        public GenerateInitEnrollmentRequestResult(InitEnrollmentRequest initEnrollmentRequest, String str, ArrayList<KeyValue> arrayList) {
            this.initEnrollmentRequest = initEnrollmentRequest;
            this.error = str;
            this.headers = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GenerateInitEnrollmentRequestResult copy$default(GenerateInitEnrollmentRequestResult generateInitEnrollmentRequestResult, InitEnrollmentRequest initEnrollmentRequest, String str, ArrayList arrayList, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                initEnrollmentRequest = generateInitEnrollmentRequestResult.initEnrollmentRequest;
            }
            if ((2 & i2) != 0) {
                str = generateInitEnrollmentRequestResult.error;
            }
            if ((i2 & 4) != 0) {
                arrayList = generateInitEnrollmentRequestResult.headers;
            }
            return generateInitEnrollmentRequestResult.copy(initEnrollmentRequest, str, arrayList);
        }

        public final InitEnrollmentRequest component1() {
            return this.initEnrollmentRequest;
        }

        public final String component2() {
            return this.error;
        }

        public final ArrayList<KeyValue> component3() {
            return this.headers;
        }

        public final GenerateInitEnrollmentRequestResult copy(InitEnrollmentRequest initEnrollmentRequest, String str, ArrayList<KeyValue> arrayList) {
            return new GenerateInitEnrollmentRequestResult(initEnrollmentRequest, str, arrayList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenerateInitEnrollmentRequestResult)) {
                return false;
            }
            GenerateInitEnrollmentRequestResult generateInitEnrollmentRequestResult = (GenerateInitEnrollmentRequestResult) obj;
            return Intrinsics.areEqual(this.initEnrollmentRequest, generateInitEnrollmentRequestResult.initEnrollmentRequest) && Intrinsics.areEqual(this.error, generateInitEnrollmentRequestResult.error) && Intrinsics.areEqual(this.headers, generateInitEnrollmentRequestResult.headers);
        }

        public final String getError() {
            return this.error;
        }

        public final ArrayList<KeyValue> getHeaders() {
            return this.headers;
        }

        public final InitEnrollmentRequest getInitEnrollmentRequest() {
            return this.initEnrollmentRequest;
        }

        public int hashCode() {
            InitEnrollmentRequest initEnrollmentRequest = this.initEnrollmentRequest;
            int iHashCode = (initEnrollmentRequest != null ? initEnrollmentRequest.hashCode() : 0) * 31;
            String str = this.error;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            ArrayList<KeyValue> arrayList = this.headers;
            return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
        }

        public final void setError(String str) {
            this.error = str;
        }

        public final void setHeaders(ArrayList<KeyValue> arrayList) {
            this.headers = arrayList;
        }

        public final void setInitEnrollmentRequest(InitEnrollmentRequest initEnrollmentRequest) {
            this.initEnrollmentRequest = initEnrollmentRequest;
        }

        public String toString() {
            return "GenerateInitEnrollmentRequestResult(initEnrollmentRequest=" + this.initEnrollmentRequest + ", error=" + this.error + ", headers=" + this.headers + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4\u0012}\u0012njG9LeN.ZS8\u0015s{:$aҜwYП\u0006\u001a,!If^munb\\!B=\u0007&~x.aW\u000f\\@\u0012̓FoM7\u0016xKFxvL\u0004N3hهzM\n(8`\u0012\ryqNRܼ1\t\u0010Ha%M3܅B\u000eD \u000f\u001etid5vm\u000eB5#\u0011kZP=^^\u007f\u0014ϼE\u001d8\u001b\u0007y\u001eYQg;#7k\u0005\u001dQ\n>Iԡr\u0006\fv:?+w\b\u001e\u0383WH\u001b#@g\r\fulٯ\u0004\"z\u001a'CQyJ~\u000f~Â\u0007ԫ\u0011H\f\u05fa\u001e)N3; \u0007\n\u0014:\u0003z$Z^\u0004vD\u0016y\u00109mӢ\fĴ/E#ƘicA\"\\A\u001c\u0007\u0013)1\r\u0382%q"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\rX'PL[(kR\\E\u001c\u0016i\u001dR4\u000fdbN.uK%.\b76\u0002Gx\u0001\u001a%z5x\u0001Iee", "", "\u001dl\\6g0GUx\b\bh3\u0004u/q\u0010(\nO", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}\b\u001dpeH\u000bl..\u007f4QSU\u0019\\^\u0003=\"!0", "3qa<e", "", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCg~pi=\u0016g5PV0TVU3IR~M\u0014 ic50\t\u0016U\u000b+jM9hu;V\u0006DjVO\u0007", "5dc\u001c`4Bb\u001d\b|>5\n\u00136ll(\bP\u0001%&", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MOKkB-^RiA\u000br0Wx\u0007PYX3c?rI$\u0012h\u001d$", "Adc\u001c`4Bb\u001d\b|>5\n\u00136ll(\bP\u0001%&", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCg~pi=\u0016g5PV0TVU3IR~M\u0014 ic\u0012\u001c", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012e9H`", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class GenerateOmmittingEnrollStepRequestResult {
        private OmmitingEnrollRequest OmmitingEnrollRequest;
        private String error;

        public GenerateOmmittingEnrollStepRequestResult(OmmitingEnrollRequest ommitingEnrollRequest, String str) {
            this.OmmitingEnrollRequest = ommitingEnrollRequest;
            this.error = str;
        }

        public static /* synthetic */ GenerateOmmittingEnrollStepRequestResult copy$default(GenerateOmmittingEnrollStepRequestResult generateOmmittingEnrollStepRequestResult, OmmitingEnrollRequest ommitingEnrollRequest, String str, int i2, Object obj) {
            if ((1 & i2) != 0) {
                ommitingEnrollRequest = generateOmmittingEnrollStepRequestResult.OmmitingEnrollRequest;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                str = generateOmmittingEnrollStepRequestResult.error;
            }
            return generateOmmittingEnrollStepRequestResult.copy(ommitingEnrollRequest, str);
        }

        public final OmmitingEnrollRequest component1() {
            return this.OmmitingEnrollRequest;
        }

        public final String component2() {
            return this.error;
        }

        public final GenerateOmmittingEnrollStepRequestResult copy(OmmitingEnrollRequest ommitingEnrollRequest, String str) {
            return new GenerateOmmittingEnrollStepRequestResult(ommitingEnrollRequest, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenerateOmmittingEnrollStepRequestResult)) {
                return false;
            }
            GenerateOmmittingEnrollStepRequestResult generateOmmittingEnrollStepRequestResult = (GenerateOmmittingEnrollStepRequestResult) obj;
            return Intrinsics.areEqual(this.OmmitingEnrollRequest, generateOmmittingEnrollStepRequestResult.OmmitingEnrollRequest) && Intrinsics.areEqual(this.error, generateOmmittingEnrollStepRequestResult.error);
        }

        public final String getError() {
            return this.error;
        }

        public final OmmitingEnrollRequest getOmmitingEnrollRequest() {
            return this.OmmitingEnrollRequest;
        }

        public int hashCode() {
            OmmitingEnrollRequest ommitingEnrollRequest = this.OmmitingEnrollRequest;
            int iHashCode = (ommitingEnrollRequest != null ? ommitingEnrollRequest.hashCode() : 0) * 31;
            String str = this.error;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final void setError(String str) {
            this.error = str;
        }

        public final void setOmmitingEnrollRequest(OmmitingEnrollRequest ommitingEnrollRequest) {
            this.OmmitingEnrollRequest = ommitingEnrollRequest;
        }

        public String toString() {
            return "GenerateOmmittingEnrollStepRequestResult(OmmitingEnrollRequest=" + this.OmmitingEnrollRequest + ", error=" + this.error + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4\u0012}\u001anjG9LeN.ZS8\u0015s{:$aҜwYП\u0006\u001a,!Iz^munb\\!B=\u0007&~x.aW\u000f\\@\u0012BH}CKO\u0006<gc\u0005<\u0013%J$Nx3\u0004ʀ.H\u001e|CLY\u001f*2VohSȘ\u0006b\u001b\u0014R8\u00034[\u0016Q|զm&C=8\u001bkXMUbvƮNUOb=%xw\u001dYC}\u0094\u0016m\u000b\u0011\u001ej[mšoyC\u0005v'?-_r\u00067\t\b\u001a\u00159Q%_\t%\u000b\b\u0002h\u0012'9S{Mf\rVz+\u0004\u0013<\u0012\u0013\u001e)^-[\u001d-ۣ\r{\u0006\u0001kXP0wr\u0006\t{N\u0019;~a*\u007fԬg\u001ahI4f7*!Sͫ\"Iu/xl\u000e\u000f\u0018aǯv\"K_@UJd\t\b>DՕ|Ċ\u00066\f\u0382_\u00025\u0003\u001f67'=dG-q\u0006\u0010M\\i\r\u0004\u000fk*֦^͕D.vݫO,\u000f\u0017hP\u0005\u0007q]bf|+[ l\t\u0014\u0007A#3ʃHƼ)\u001cVи\u0001kp\\k\u0016E1lGg|<(e;v5KP\u0012\u00138׳\u0003݀CHjڳphHd\u001af|*(DVxށ{\u001a"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\ra4QJN:j3vF\u0018 ]mW8\u0017\f`I$wS$\u001f\u00167S\u000bIhm\f$\u001e<yF", "", "\u0017c=<j\nH[!\t\u0004K,\u000b\u00149n\u000e(", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gxgJC\u0019A6V~1P9N:g\\{K\u0014g", "AdT1", "", "4h]._\u001a<]&\u0003\u0004`", "3qa<e", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.[NEtB\u001e^L`\"\u0011u\nX~/QU;,j]|F\"\u00120tS'\u001e\u0001#H wF\u0001\r\u00179M\u000b=>g\u0011\u0012\u001f14w>_\u0012\u0011g$\u0003E2j\u001c@duX=\u000fi&m\u000e)\u000bkG>-\u0016G\\\f", "5dc\u0016W\u0015Hev\t\u0003f6\u0006u/s\u000b2\u0005N\u0001", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MQFu=,\u00152E8om>,\u0001/OVW\u0019\\`}G\u001d Zc", "Adc\u0016W\u0015Hev\t\u0003f6\u0006u/s\u000b2\u0005N\u0001", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.[NEtB\u001e^L`\"\u0011u\nX~/QU;,j]|F\"\u00120Q?", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012e9H`", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0013\\5:Z\u0007|\u0005k0\u0006\u000b", "Adc\u0013\\5:Z\u0007|\u0005k0\u0006\u000b", "5dc X,=", "Adc X,=", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class ProcessFinishEnrollmentResponseResult {
        private IdNowCommonResponse IdNowCommonResponse;
        private String error;
        private String finalScoring;
        private String seed;

        public ProcessFinishEnrollmentResponseResult(IdNowCommonResponse idNowCommonResponse, String str, String str2, String str3) {
            this.IdNowCommonResponse = idNowCommonResponse;
            this.seed = str;
            this.finalScoring = str2;
            this.error = str3;
        }

        public static /* synthetic */ ProcessFinishEnrollmentResponseResult copy$default(ProcessFinishEnrollmentResponseResult processFinishEnrollmentResponseResult, IdNowCommonResponse idNowCommonResponse, String str, String str2, String str3, int i2, Object obj) {
            if ((1 & i2) != 0) {
                idNowCommonResponse = processFinishEnrollmentResponseResult.IdNowCommonResponse;
            }
            if ((2 & i2) != 0) {
                str = processFinishEnrollmentResponseResult.seed;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                str2 = processFinishEnrollmentResponseResult.finalScoring;
            }
            if ((i2 & 8) != 0) {
                str3 = processFinishEnrollmentResponseResult.error;
            }
            return processFinishEnrollmentResponseResult.copy(idNowCommonResponse, str, str2, str3);
        }

        public final IdNowCommonResponse component1() {
            return this.IdNowCommonResponse;
        }

        public final String component2() {
            return this.seed;
        }

        public final String component3() {
            return this.finalScoring;
        }

        public final String component4() {
            return this.error;
        }

        public final ProcessFinishEnrollmentResponseResult copy(IdNowCommonResponse idNowCommonResponse, String str, String str2, String str3) {
            return new ProcessFinishEnrollmentResponseResult(idNowCommonResponse, str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProcessFinishEnrollmentResponseResult)) {
                return false;
            }
            ProcessFinishEnrollmentResponseResult processFinishEnrollmentResponseResult = (ProcessFinishEnrollmentResponseResult) obj;
            return Intrinsics.areEqual(this.IdNowCommonResponse, processFinishEnrollmentResponseResult.IdNowCommonResponse) && Intrinsics.areEqual(this.seed, processFinishEnrollmentResponseResult.seed) && Intrinsics.areEqual(this.finalScoring, processFinishEnrollmentResponseResult.finalScoring) && Intrinsics.areEqual(this.error, processFinishEnrollmentResponseResult.error);
        }

        public final String getError() {
            return this.error;
        }

        public final String getFinalScoring() {
            return this.finalScoring;
        }

        public final IdNowCommonResponse getIdNowCommonResponse() {
            return this.IdNowCommonResponse;
        }

        public final String getSeed() {
            return this.seed;
        }

        public int hashCode() {
            IdNowCommonResponse idNowCommonResponse = this.IdNowCommonResponse;
            int iHashCode = (idNowCommonResponse != null ? idNowCommonResponse.hashCode() : 0) * 31;
            String str = this.seed;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.finalScoring;
            int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.error;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setError(String str) {
            this.error = str;
        }

        public final void setFinalScoring(String str) {
            this.finalScoring = str;
        }

        public final void setIdNowCommonResponse(IdNowCommonResponse idNowCommonResponse) {
            this.IdNowCommonResponse = idNowCommonResponse;
        }

        public final void setSeed(String str) {
            this.seed = str;
        }

        public String toString() {
            return "ProcessFinishEnrollmentResponseResult(IdNowCommonResponse=" + this.IdNowCommonResponse + ", seed=" + this.seed + ", finalScoring=" + this.finalScoring + ", error=" + this.error + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4\u0012}\u0012njG9LeN.ZS8\u0015s{:$aҜwYП\u0006\u001a,!If^munb\\!B=\u0007&~x.aW\u000f\\@\u0012̓FoM7\u0016xKFxvL\u0004N3hهzM\n(8`\u0012\ryqNRܼ1\t\u0010Ha%M3܅B\u000eD \u000f\u001etid5vm\u000eB5#\u0011kZP=^^\u007f\u0014ϼE\u001d8\u001b\u0007y\u001eYQg;#7k\u0005\u001dQ\n>Iԡr\u0006\fv:?+w\b\u001e\u0383WH\u001b#@g\r\fulٯ\u0004\"z\u001a'CQyJ~\u000f~Â\u0007ԫ\u0011H\f\u05fa\u001e)N3; \u0007\n\u0014:\u0003z$Z^\u0004vD\u0016y\u00109mӢ\fĴ/E#ƘicA\"\\A\u001c\u0007\u0013)1\r\u0382%q"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn1d\u0002i\u001bL\u0004.KSHoC2pse\u001d\u000fn3\ra4QJN:j6{A#qc\u001bX2\u0014\rYJ3[DE*\u00125W\u0002(h\u000f\u001c\u001d\u001d\u000b", "", "\u0017c=<j\nH[!\t\u0004K,\u000b\u00149n\u000e(", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gxgJC\u0019A6V~1P9N:g\\{K\u0014g", "3qa<e", "", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.[NEtB\u001e^L`\"\u0011u\nX~/QU;,j]|F\"\u00120tS'\u001e\u0001#H wF\u0001\r\u00179M\u000b=>D|", "5dc\u0016W\u0015Hev\t\u0003f6\u0006u/s\u000b2\u0005N\u0001", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MQFu=,\u00152E8om>,\u0001/OVW\u0019\\`}G\u001d Zc", "Adc\u0016W\u0015Hev\t\u0003f6\u0006u/s\u000b2\u0005N\u0001", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.[NEtB\u001e^L`\"\u0011u\nX~/QU;,j]|F\"\u00120Q?", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0012e9H`", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class ProcessInitEnrollmentResponseResult {
        private IdNowCommonResponse IdNowCommonResponse;
        private String error;

        public ProcessInitEnrollmentResponseResult(IdNowCommonResponse idNowCommonResponse, String str) {
            this.IdNowCommonResponse = idNowCommonResponse;
            this.error = str;
        }

        public static /* synthetic */ ProcessInitEnrollmentResponseResult copy$default(ProcessInitEnrollmentResponseResult processInitEnrollmentResponseResult, IdNowCommonResponse idNowCommonResponse, String str, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                idNowCommonResponse = processInitEnrollmentResponseResult.IdNowCommonResponse;
            }
            if ((i2 & 2) != 0) {
                str = processInitEnrollmentResponseResult.error;
            }
            return processInitEnrollmentResponseResult.copy(idNowCommonResponse, str);
        }

        public final IdNowCommonResponse component1() {
            return this.IdNowCommonResponse;
        }

        public final String component2() {
            return this.error;
        }

        public final ProcessInitEnrollmentResponseResult copy(IdNowCommonResponse idNowCommonResponse, String str) {
            return new ProcessInitEnrollmentResponseResult(idNowCommonResponse, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProcessInitEnrollmentResponseResult)) {
                return false;
            }
            ProcessInitEnrollmentResponseResult processInitEnrollmentResponseResult = (ProcessInitEnrollmentResponseResult) obj;
            return Intrinsics.areEqual(this.IdNowCommonResponse, processInitEnrollmentResponseResult.IdNowCommonResponse) && Intrinsics.areEqual(this.error, processInitEnrollmentResponseResult.error);
        }

        public final String getError() {
            return this.error;
        }

        public final IdNowCommonResponse getIdNowCommonResponse() {
            return this.IdNowCommonResponse;
        }

        public int hashCode() {
            IdNowCommonResponse idNowCommonResponse = this.IdNowCommonResponse;
            int iHashCode = (idNowCommonResponse != null ? idNowCommonResponse.hashCode() : 0) * 31;
            String str = this.error;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final void setError(String str) {
            this.error = str;
        }

        public final void setIdNowCommonResponse(IdNowCommonResponse idNowCommonResponse) {
            this.IdNowCommonResponse = idNowCommonResponse;
        }

        public String toString() {
            return "ProcessInitEnrollmentResponseResult(IdNowCommonResponse=" + this.IdNowCommonResponse + ", error=" + this.error + ")";
        }
    }

    private final String decode(String str) throws Throwable {
        Class<?> cls = Class.forName(ZO.xd("\\X3$OR\u0002X5P>\"sc\u0014P\u0014\nU", (short) (C1499aX.Xd() ^ (-5512)), (short) (C1499aX.Xd() ^ (-19188))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (ZN.Xd() ^ 6869);
        short sXd2 = (short) (ZN.Xd() ^ 28892);
        int[] iArr = new int["\u000f\u0011b-fEwn\u000e]S\f\u0015|&9".length()];
        QB qb = new QB("\u000f\u0011b-fEwn\u000e]S\f\u0015|&9");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {str, 0};
        Method declaredMethod = cls.getDeclaredMethod(Ig.wd(")|L5a\u0015", (short) (C1633zX.Xd() ^ (-29848))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
            short sXd3 = (short) (ZN.Xd() ^ 6979);
            int[] iArr2 = new int["D\u001bQa|?\u001b\u001co\u007f$=l#m\n/Y<fK)_OBZ7\u001buhGC\ns\b".length()];
            QB qb2 = new QB("D\u001bQa|?\u001b\u001co\u007f$=l#m\n/Y<fK)_OBZ7\u001buhGC\ns\b");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
                i3++;
            }
            Intrinsics.checkExpressionValueIsNotNull(bArr, new String(iArr2, 0, i3));
            Charset charsetForName = Charset.forName(C1561oA.Qd("PN?%/", (short) (Od.Xd() ^ (-23522))));
            Intrinsics.checkExpressionValueIsNotNull(charsetForName, C1593ug.zd("a\b\u0002\u0014\u0016\t\u0019S\r\u0017\u001bw\f\u0019\u0012U\u0012\u0018\u0012$&\u0019)\u0004\u0018%\u001eb", (short) (C1607wl.Xd() ^ 14701), (short) (C1607wl.Xd() ^ 5970)));
            return new String(bArr, charsetForName);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final String encode(String str) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 19533);
        int[] iArr = new int["JH9\u001f)".length()];
        QB qb = new QB("JH9\u001f)");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Charset charsetForName = Charset.forName(new String(iArr, 0, i2));
        Intrinsics.checkExpressionValueIsNotNull(charsetForName, C1561oA.Kd("\\\u0003|\u000f\u0011\u0004\u0014N\b\u0012\u0016r\u0007\u0014\rP\r\u0013\r\u001f!\u0014$~\u0013 \u0019]", (short) (OY.Xd() ^ 10339)));
        if (str == null) {
            short sXd2 = (short) (OY.Xd() ^ 4449);
            short sXd3 = (short) (OY.Xd() ^ 31118);
            int[] iArr2 = new int["gmcb\u0015WT`__c\u000eOQ\u000bMJ[[\u0006YS\u0003PPN\fLRHGyMQG;t>4H2};/;3x\u001d=:04,".length()];
            QB qb2 = new QB("gmcb\u0015WT`__c\u000eOQ\u000bMJ[[\u0006YS\u0003PPN\fLRHGyMQG;t>4H2};/;3x\u001d=:04,");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
                i3++;
            }
            throw new TypeCastException(new String(iArr2, 0, i3));
        }
        byte[] bytes = str.getBytes(charsetForName);
        Intrinsics.checkExpressionValueIsNotNull(bytes, Wg.Zd("`a{\b W?\u007f[0.Mg^GGbdU)u} \u00137~N\u0017C91w=6s\u0016x\bOk\u0013\u00101p", (short) (FB.Xd() ^ IDStepResponseCodes.STEP_LAUNCH_REQUEST), (short) (FB.Xd() ^ IptcDirectory.TAG_OBJECT_CYCLE)));
        Object[] objArr = {bytes, 0};
        Method declaredMethod = Class.forName(C1561oA.Xd("SaXge`\\'ooei,Aatg98", (short) (C1633zX.Xd() ^ (-16016)))).getDeclaredMethod(Wg.vd("_g_jbbTnEef\\d\\", (short) (C1607wl.Xd() ^ 19612)), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            String str2 = (String) declaredMethod.invoke(null, objArr);
            short sXd4 = (short) (C1499aX.Xd() ^ (-16717));
            short sXd5 = (short) (C1499aX.Xd() ^ (-1380));
            int[] iArr3 = new int["Lj{l<92hpdoccQkNnkae]\u001dh[尟FD5\u001b%\u000e\u0014\u0013\u0015\b)GXI\u0019\u0016\u000f$$$\u001e1'.\u0002".length()];
            QB qb3 = new QB("Lj{l<92hpdoccQkNnkae]\u001dh[尟FD5\u001b%\u000e\u0014\u0013\u0015\b)GXI\u0019\u0016\u000f$$$\u001e1'.\u0002");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(((sXd4 + i4) + xuXd3.CK(iKK3)) - sXd5);
                i4++;
            }
            Intrinsics.checkExpressionValueIsNotNull(str2, new String(iArr3, 0, i4));
            return str2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final ArrayList<KeyValue> processEnvironments(ArrayList<KeyValue> arrayList) {
        for (KeyValue keyValue : arrayList) {
            String key = keyValue.getKey();
            switch (key.hashCode()) {
                case -1376403787:
                    if (key.equals("ZOOM_LICENSE_KEY")) {
                        keyValue.setValue(decode(keyValue.getValue()));
                    }
                    break;
                case 80888661:
                    if (key.equals("ZOOM_PUBLIC_KEY")) {
                        keyValue.setValue(decode(keyValue.getValue()));
                    }
                    break;
                case 1099814509:
                    if (key.equals("ZOOM_TOKEN")) {
                        keyValue.setValue(keyValue.getValue());
                    }
                    break;
                case 1668182755:
                    if (key.equals("ZOOM_URL")) {
                        keyValue.getValue();
                        keyValue.setValue(keyValue.getValue());
                    }
                    break;
            }
        }
        return arrayList;
    }

    private final void saveIdNowCredentials(Context context, Activity activity, String str, String str2) {
        IDCommonStorage iDCommonStorage = new IDCommonStorage(context);
        this.prefs = iDCommonStorage;
        iDCommonStorage.setAPIUser(str);
        iDCommonStorage.setAPIKey(str2);
    }

    private final void saveIdNowHost(Context context, Activity activity, String str) {
        IDCommonStorage iDCommonStorage = new IDCommonStorage(context);
        this.prefs = iDCommonStorage;
        iDCommonStorage.setAPIHost(str);
    }

    private final void savePin(Context context, Activity activity, String str) {
        IDCommonStorage iDCommonStorage = new IDCommonStorage(context);
        this.prefs = iDCommonStorage;
        iDCommonStorage.setSecurePin(str);
    }

    private final void setUpSDK(Context context, Activity activity, IDCredentials iDCredentials, IDBaseUrl iDBaseUrl) {
        String apiUser = iDCredentials.getApiUser();
        String apiKey = iDCredentials.getApiKey();
        saveIdNowHost(context, activity, iDBaseUrl.getBaseIDUrl());
        saveIdNowCredentials(context, activity, apiUser, apiKey);
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public void avoidLegacySign(Context context, Activity activity) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        IDCommonStorage iDCommonStorage = new IDCommonStorage(context);
        this.prefs = iDCommonStorage;
        iDCommonStorage.setV19Sign("AVOIDV19SIGN");
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public boolean checkV19Sign(Context context, Activity activity) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        IDCommonStorage iDCommonStorage = new IDCommonStorage(context);
        this.prefs = iDCommonStorage;
        return IDCommonStorage.Companion.isNullOrEmpty(iDCommonStorage.getV19Sign());
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public IdNowCommonResponse clearEnrollment(Context context, Activity activity) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        IdNowCommonResponse idNowCommonResponse = new IdNowCommonResponse();
        idNowCommonResponse.setCode("500");
        idNowCommonResponse.setDescription("General Error");
        IdNowCommonResponse idNowCommonResponseResetUuid = resetUuid(context, activity);
        IdNowCommonResponse idNowCommonResponseResetSHSSign = resetSHSSign(context, activity);
        IdNowCommonResponse idNowCommonResponseResetSHSPush = resetSHSPush(context, activity);
        IdNowCommonResponse idNowCommonResponseResetEnvironmentParams = resetEnvironmentParams(context, activity);
        if (idNowCommonResponseResetUuid != null && idNowCommonResponseResetSHSSign != null && idNowCommonResponseResetSHSPush != null && idNowCommonResponseResetEnvironmentParams != null && Intrinsics.areEqual(idNowCommonResponseResetUuid.getCode(), "00") && Intrinsics.areEqual(idNowCommonResponseResetSHSSign.getCode(), "00") && Intrinsics.areEqual(idNowCommonResponseResetSHSPush.getCode(), "00") && Intrinsics.areEqual(idNowCommonResponseResetEnvironmentParams.getCode(), "00")) {
            idNowCommonResponse.setCode("00");
            idNowCommonResponse.setDescription("OK");
        }
        return idNowCommonResponse;
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public byte[] decryptData(Context context, Activity activity, byte[] data) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(data, "data");
        IDCommonStorage iDCommonStorage = new IDCommonStorage(context);
        this.prefs = iDCommonStorage;
        if (IDCommonStorage.Companion.isNullOrEmpty(iDCommonStorage.getSHSSign())) {
            return null;
        }
        IDAes.Companion companion = IDAes.Companion;
        String sHSSign = iDCommonStorage.getSHSSign();
        if (sHSSign == null) {
            Intrinsics.throwNpe();
        }
        return companion.decryptBytes(data, sHSSign);
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public byte[] dencryptDataInit(Context context, Activity activity, byte[] data) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(data, "data");
        return IDAes.Companion.decryptBytes(data, IDNowSettings.Companion.getink());
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public byte[] encryptData(Context context, Activity activity, byte[] data) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(data, "data");
        IDCommonStorage iDCommonStorage = new IDCommonStorage(context);
        this.prefs = iDCommonStorage;
        if (IDCommonStorage.Companion.isNullOrEmpty(iDCommonStorage.getSHSSign())) {
            return null;
        }
        IDAes.Companion companion = IDAes.Companion;
        String sHSSign = iDCommonStorage.getSHSSign();
        if (sHSSign == null) {
            Intrinsics.throwNpe();
        }
        return companion.encryptData(data, sHSSign);
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public byte[] encryptDataInit(Context context, Activity activity, byte[] data) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(data, "data");
        return IDAes.Companion.encryptData(data, IDNowSettings.Companion.getink());
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public String encryptString(Context context, Activity activity, String data) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(data, "data");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public CommitGenericStepRequestResult generateCommitGenericStepRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, CommonUserDataRequest commonUserDataRequest, ArrayList<KeyValue> values, String pathId) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(commonParamsRequest, "commonParamsRequest");
        Intrinsics.checkParameterIsNotNull(commonUserDataRequest, "commonUserDataRequest");
        Intrinsics.checkParameterIsNotNull(values, "values");
        Intrinsics.checkParameterIsNotNull(pathId, "pathId");
        try {
            CommitGenericStepRequest commitGenericStepRequest = new CommitGenericStepRequest();
            commitGenericStepRequest.setCommonParamsRequest(commonParamsRequest);
            commitGenericStepRequest.setCommonUserDataRequest(commonUserDataRequest);
            commitGenericStepRequest.setUuidDevice(getDeviceUUID(context, activity));
            commitGenericStepRequest.setTransactionData(values);
            commitGenericStepRequest.setPathId(pathId);
            return new CommitGenericStepRequestResult(commitGenericStepRequest, null);
        } catch (Exception e2) {
            return new CommitGenericStepRequestResult(null, e2.getLocalizedMessage());
        }
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public GenerateDeviceStatusRequestResult generateDeviceStatusRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, CommonUserDataRequest commonUserDataRequest, ArrayList<KeyValue> arrayList) {
        String apiUser;
        String apiKey;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(commonParamsRequest, "commonParamsRequest");
        Intrinsics.checkParameterIsNotNull(commonUserDataRequest, "commonUserDataRequest");
        try {
            this.prefs = new IDCommonStorage(context);
            IDFingerprint iDFingerprint = new IDFingerprint();
            DeviceStatusRequest deviceStatusRequest = new DeviceStatusRequest();
            deviceStatusRequest.setCommonParamsRequest(commonParamsRequest);
            deviceStatusRequest.setCommonUserDataRequest(commonUserDataRequest);
            deviceStatusRequest.setUuidDevice(getDeviceUUID(context, activity));
            deviceStatusRequest.setDeviceFingerprint(iDFingerprint.generateInitialFingerPrintFromDevice(context));
            deviceStatusRequest.setOs(IDNowSettings.Companion.getOs(context));
            KeyValue keyValue = new KeyValue();
            keyValue.setKey("API-USER");
            IDCredentials idNowCredentials = getIdNowCredentials(context, activity);
            String str = "";
            if (idNowCredentials == null || (apiUser = idNowCredentials.getApiUser()) == null) {
                apiUser = "";
            }
            keyValue.setValue(apiUser);
            KeyValue keyValue2 = new KeyValue();
            keyValue2.setKey("API-KEY");
            IDCredentials idNowCredentials2 = getIdNowCredentials(context, activity);
            if (idNowCredentials2 != null && (apiKey = idNowCredentials2.getApiKey()) != null) {
                str = apiKey;
            }
            keyValue2.setValue(str);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(keyValue);
            arrayList2.add(keyValue2);
            if (arrayList != null) {
                Iterator<KeyValue> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
            }
            return new GenerateDeviceStatusRequestResult(deviceStatusRequest, null, arrayList2);
        } catch (Exception e2) {
            return new GenerateDeviceStatusRequestResult(null, e2.getLocalizedMessage(), null);
        }
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public GenerateFinishEnrollmentRequestResult generateFinishEnrollmentRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, CommonUserDataRequest commonUserDataRequest, ArrayList<KeyValue> arrayList) {
        String apiUser;
        String apiKey;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(commonParamsRequest, "commonParamsRequest");
        Intrinsics.checkParameterIsNotNull(commonUserDataRequest, "commonUserDataRequest");
        try {
            this.prefs = new IDCommonStorage(context);
            IDFingerprint iDFingerprint = new IDFingerprint();
            FinishEnrollmentRequest finishEnrollmentRequest = new FinishEnrollmentRequest();
            finishEnrollmentRequest.setCommonParamsRequest(commonParamsRequest);
            finishEnrollmentRequest.setCommonUserDataRequest(commonUserDataRequest);
            finishEnrollmentRequest.setUuidDevice(getDeviceUUID(context, activity));
            finishEnrollmentRequest.setTypeKey("IDNOWPUSH2021V2SIGN");
            String strGenerateInitialFingerPrintFromDevice = iDFingerprint.generateInitialFingerPrintFromDevice(context);
            IDCommonStorage iDCommonStorage = this.prefs;
            if (iDCommonStorage == null) {
                Intrinsics.throwNpe();
            }
            String sHSSign = iDCommonStorage.getSHSSign();
            if (sHSSign == null) {
                Intrinsics.throwNpe();
            }
            String strEncrypt = IDAesLegacy.encrypt(strGenerateInitialFingerPrintFromDevice, sHSSign);
            if (strEncrypt == null) {
                Intrinsics.throwNpe();
            }
            finishEnrollmentRequest.setMobileFingerprint(strEncrypt);
            finishEnrollmentRequest.setMobileSignature(EllipticNow.Companion.generateSecp256r1PublicKey());
            KeyValue keyValue = new KeyValue();
            keyValue.setKey("API-USER");
            IDCredentials idNowCredentials = getIdNowCredentials(context, activity);
            String str = "";
            if (idNowCredentials == null || (apiUser = idNowCredentials.getApiUser()) == null) {
                apiUser = "";
            }
            keyValue.setValue(apiUser);
            KeyValue keyValue2 = new KeyValue();
            keyValue2.setKey("API-KEY");
            IDCredentials idNowCredentials2 = getIdNowCredentials(context, activity);
            if (idNowCredentials2 != null && (apiKey = idNowCredentials2.getApiKey()) != null) {
                str = apiKey;
            }
            keyValue2.setValue(str);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(keyValue);
            arrayList2.add(keyValue2);
            if (arrayList != null) {
                Iterator<KeyValue> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
            }
            IDSignResponse iDSignResponseSign = IDSign.sign(finishEnrollmentRequest.toJson(), context);
            if (iDSignResponseSign != null) {
                KeyValue keyValue3 = new KeyValue();
                keyValue3.setKey("TRX-SIGN");
                keyValue3.setValue(iDSignResponseSign.getTrxSign());
                KeyValue keyValue4 = new KeyValue();
                keyValue4.setKey("TMSTP");
                keyValue4.setValue(iDSignResponseSign.getTimeStamp());
                arrayList2.add(keyValue3);
                arrayList2.add(keyValue4);
                new KeyValue().setKey("CLEAN-JSON");
            }
            return new GenerateFinishEnrollmentRequestResult(finishEnrollmentRequest, null, arrayList2);
        } catch (Exception e2) {
            return new GenerateFinishEnrollmentRequestResult(null, e2.getLocalizedMessage(), null);
        }
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public GenerateGetRegisterPathRequestResult generateGetRegisterPathRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, CommonUserDataRequest commonUserDataRequest, String enrollmentType, String segment, ArrayList<KeyValue> arrayList) {
        String apiUser;
        String apiKey;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(commonParamsRequest, "commonParamsRequest");
        Intrinsics.checkParameterIsNotNull(commonUserDataRequest, "commonUserDataRequest");
        Intrinsics.checkParameterIsNotNull(enrollmentType, "enrollmentType");
        Intrinsics.checkParameterIsNotNull(segment, "segment");
        try {
            RegisterPathRequest registerPathRequest = new RegisterPathRequest();
            registerPathRequest.setCommonParamsRequest(commonParamsRequest);
            registerPathRequest.setCommonUserDataRequest(commonUserDataRequest);
            registerPathRequest.setTypeEnrollment(enrollmentType);
            registerPathRequest.setSegment(segment);
            registerPathRequest.setUuidDevice(getDeviceUUID(context, activity));
            KeyValue keyValue = new KeyValue();
            keyValue.setKey("API-USER");
            IDCredentials idNowCredentials = getIdNowCredentials(context, activity);
            String str = "";
            if (idNowCredentials == null || (apiUser = idNowCredentials.getApiUser()) == null) {
                apiUser = "";
            }
            keyValue.setValue(apiUser);
            KeyValue keyValue2 = new KeyValue();
            keyValue2.setKey("API-KEY");
            IDCredentials idNowCredentials2 = getIdNowCredentials(context, activity);
            if (idNowCredentials2 != null && (apiKey = idNowCredentials2.getApiKey()) != null) {
                str = apiKey;
            }
            keyValue2.setValue(str);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(keyValue);
            arrayList2.add(keyValue2);
            if (arrayList != null) {
                Iterator<KeyValue> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
            }
            IDSignResponse iDSignResponseSign = IDSign.sign(registerPathRequest.toJson(), context);
            if (iDSignResponseSign != null) {
                KeyValue keyValue3 = new KeyValue();
                keyValue3.setKey("TRX-SIGN");
                keyValue3.setValue(iDSignResponseSign.getTrxSign());
                KeyValue keyValue4 = new KeyValue();
                keyValue4.setKey("TMSTP");
                keyValue4.setValue(iDSignResponseSign.getTimeStamp());
                arrayList2.add(keyValue3);
                arrayList2.add(keyValue4);
            }
            return new GenerateGetRegisterPathRequestResult(registerPathRequest, null, arrayList2);
        } catch (Exception e2) {
            return new GenerateGetRegisterPathRequestResult(null, e2.getLocalizedMessage(), null);
        }
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public GenerateInitEnrollmentRequestResult generateInitEnrollmentRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, CommonUserDataRequest commonUserDataRequest, UserDataRequest userDataRequest, DeviceDataRequest deviceDataRequest, String notificationId, String enrollmentType, ArrayList<KeyValue> arrayList) {
        String apiUser;
        String apiKey;
        String str = "";
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(commonParamsRequest, "commonParamsRequest");
        Intrinsics.checkParameterIsNotNull(commonUserDataRequest, "commonUserDataRequest");
        Intrinsics.checkParameterIsNotNull(notificationId, "notificationId");
        Intrinsics.checkParameterIsNotNull(enrollmentType, "enrollmentType");
        try {
            IDFingerprint iDFingerprint = new IDFingerprint();
            InitEnrollmentRequest initEnrollmentRequest = new InitEnrollmentRequest();
            initEnrollmentRequest.setCommonParamsRequest(commonParamsRequest);
            initEnrollmentRequest.setCommonUserDataRequest(commonUserDataRequest);
            if (userDataRequest != null) {
                initEnrollmentRequest.setUserDataRequest(userDataRequest);
            }
            initEnrollmentRequest.setNotificationId(notificationId);
            initEnrollmentRequest.setEnrollmentType(enrollmentType);
            initEnrollmentRequest.setOs(IDNowSettings.Companion.getOs(context));
            initEnrollmentRequest.setMobileEnrollmentKey(EllipticNow.Companion.generateSecp256r1PublicKey());
            initEnrollmentRequest.setMobileSignature("");
            initEnrollmentRequest.setUuidDevice(getDeviceUUID(context, activity));
            initEnrollmentRequest.setDeviceFingerprint(iDFingerprint.generateInitialFingerPrintFromDevice(context));
            initEnrollmentRequest.setFlagExternalValidation("F");
            initEnrollmentRequest.setTypeKey("IDNOWPUSH2021V2SIGN");
            avoidLegacySign(context, activity);
            if (deviceDataRequest != null) {
                initEnrollmentRequest.setDeviceDataRequest(deviceDataRequest);
            }
            KeyValue keyValue = new KeyValue();
            keyValue.setKey("API-USER");
            IDCredentials idNowCredentials = getIdNowCredentials(context, activity);
            if (idNowCredentials == null || (apiUser = idNowCredentials.getApiUser()) == null) {
                apiUser = "";
            }
            keyValue.setValue(apiUser);
            KeyValue keyValue2 = new KeyValue();
            keyValue2.setKey("API-KEY");
            IDCredentials idNowCredentials2 = getIdNowCredentials(context, activity);
            if (idNowCredentials2 != null && (apiKey = idNowCredentials2.getApiKey()) != null) {
                str = apiKey;
            }
            keyValue2.setValue(str);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(keyValue);
            arrayList2.add(keyValue2);
            if (arrayList != null) {
                Iterator<KeyValue> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
            }
            return new GenerateInitEnrollmentRequestResult(initEnrollmentRequest, null, arrayList2);
        } catch (Exception e2) {
            return new GenerateInitEnrollmentRequestResult(null, e2.getLocalizedMessage(), null);
        }
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public GenerateOmmittingEnrollStepRequestResult generateOmmittingEnrollStepRequest(Context context, Activity activity, CommonParamsRequest commonParamsRequest, CommonUserDataRequest commonUserDataRequest, String pathId) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(commonParamsRequest, "commonParamsRequest");
        Intrinsics.checkParameterIsNotNull(commonUserDataRequest, "commonUserDataRequest");
        Intrinsics.checkParameterIsNotNull(pathId, "pathId");
        try {
            OmmitingEnrollRequest ommitingEnrollRequest = new OmmitingEnrollRequest();
            ommitingEnrollRequest.setCommonParamsRequest(commonParamsRequest);
            ommitingEnrollRequest.setCommonUserDataRequest(commonUserDataRequest);
            ommitingEnrollRequest.setUuidDevice(getDeviceUUID(context, activity));
            ommitingEnrollRequest.setPathId(pathId);
            return new GenerateOmmittingEnrollStepRequestResult(ommitingEnrollRequest, null);
        } catch (Exception e2) {
            return new GenerateOmmittingEnrollStepRequestResult(null, e2.getLocalizedMessage());
        }
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public UpdateNotificationIdRequest generateUpdateNotificationIdRequest(Context context, Activity activity, String notificationId) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(notificationId, "notificationId");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public String getDeviceUUID(Context context, Activity activity) {
        String idNowUUID;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        IDCommonStorage iDCommonStorage = new IDCommonStorage(context);
        this.prefs = iDCommonStorage;
        if (IDCommonStorage.Companion.isNullOrEmpty(iDCommonStorage.getIdNowUUID())) {
            iDCommonStorage.setIdNowUUID(UUID.randomUUID().toString() + String.valueOf(System.currentTimeMillis()));
            idNowUUID = iDCommonStorage.getIdNowUUID();
            if (idNowUUID == null) {
                Intrinsics.throwNpe();
            }
        } else {
            idNowUUID = iDCommonStorage.getIdNowUUID();
            if (idNowUUID == null) {
                Intrinsics.throwNpe();
            }
        }
        return idNowUUID;
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public IDCredentials getIdNowCredentials(Context context, Activity activity) {
        String aPIKey;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        IDCommonStorage iDCommonStorage = new IDCommonStorage(context);
        this.prefs = iDCommonStorage;
        String aPIUser = iDCommonStorage.getAPIUser();
        if (aPIUser == null || (aPIKey = iDCommonStorage.getAPIKey()) == null) {
            return null;
        }
        return new IDCredentials(aPIUser, aPIKey);
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public IDBaseUrl getIdNowHost(Context context, Activity activity) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.prefs = new IDCommonStorage(context);
        IDBaseUrl iDBaseUrl = new IDBaseUrl("");
        IDCommonStorage iDCommonStorage = this.prefs;
        iDBaseUrl.setBaseUrl(iDCommonStorage != null ? iDCommonStorage.getAPIHost() : null);
        return iDBaseUrl;
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public PushMessageResponse getMessage(Context context, Activity activity, String msg) {
        String strDecrypt;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(msg, "msg");
        boolean zCheckV19Sign = checkV19Sign(context, activity);
        try {
            IDCommonStorage iDCommonStorage = new IDCommonStorage(context);
            this.prefs = iDCommonStorage;
            String sHSPush = iDCommonStorage.getSHSPush();
            if (sHSPush == null) {
                Intrinsics.throwNpe();
            }
            if (zCheckV19Sign) {
                strDecrypt = IDAesLegacy.decryptV19(sHSPush, msg);
                Intrinsics.checkExpressionValueIsNotNull(strDecrypt, "IDAesLegacy.decryptV19(key, msg)");
            } else {
                strDecrypt = IDAesLegacy.decrypt(sHSPush, msg);
                Intrinsics.checkExpressionValueIsNotNull(strDecrypt, "IDAesLegacy.decrypt(key, msg)");
            }
            PushMessageResponse pushMessageResponse = new PushMessageResponse();
            Type type = new TypeToken<List<? extends KeyValue>>() { // from class: com.ticnow.sdk.idnowsecurity.api.IDSecurityApiImpl$getMessage$listType$1
            }.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "object : TypeToken<List<KeyValue?>?>() {}.type");
            Object objFromJson = new Gson().fromJson(strDecrypt, type);
            Intrinsics.checkExpressionValueIsNotNull(objFromJson, "Gson().fromJson(transactionData, listType)");
            pushMessageResponse.setPrivateParts((ArrayList) objFromJson);
            return pushMessageResponse;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final IDCommonStorage getPrefs() {
        return this.prefs;
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public void initSDK(Context context, Activity activity, IDCredentials credentials, IDBaseUrl host) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(credentials, "credentials");
        Intrinsics.checkParameterIsNotNull(host, "host");
        setUpSDK(context, activity, credentials, host);
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public ProcessFinishEnrollmentResponseResult processFinishEnrollmentResponse(Context context, Activity activity, FinishEnrollmentResponse finishEnrollmentResponse) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(finishEnrollmentResponse, "finishEnrollmentResponse");
        IdNowCommonResponse idNowCommonResponse = new IdNowCommonResponse();
        try {
            IDEnrollmentResponseCodes iDEnrollmentResponseCodesProcessResponseCode = IDEnrollmentResponseParser.processResponseCode(finishEnrollmentResponse.getCode());
            Intrinsics.checkExpressionValueIsNotNull(iDEnrollmentResponseCodesProcessResponseCode, "IDEnrollmentResponsePars…hEnrollmentResponse.code)");
            if (iDEnrollmentResponseCodesProcessResponseCode != IDEnrollmentResponseCodes.COD_OK) {
                String code = iDEnrollmentResponseCodesProcessResponseCode.getCode();
                Intrinsics.checkExpressionValueIsNotNull(code, "response.code");
                idNowCommonResponse.setCode(code);
                String description = iDEnrollmentResponseCodesProcessResponseCode.getDescription();
                Intrinsics.checkExpressionValueIsNotNull(description, "response.description");
                idNowCommonResponse.setDescription(description);
                return new ProcessFinishEnrollmentResponseResult(idNowCommonResponse, null, null, iDEnrollmentResponseCodesProcessResponseCode.getDescription());
            }
            if (IDCommonStorage.Companion.isNullOrEmpty(finishEnrollmentResponse.getServerEnrollmentKey2()) || IDCommonStorage.Companion.isNullOrEmpty(finishEnrollmentResponse.getSeed())) {
                String code2 = IDEnrollmentResponseCodes.GENERAL_ERROR.getCode();
                Intrinsics.checkExpressionValueIsNotNull(code2, "IDEnrollmentResponseCodes.GENERAL_ERROR.code");
                idNowCommonResponse.setCode(code2);
                idNowCommonResponse.setDescription("IDINITENROLLMENTRESPONSE_INPUT_ISNULL_(ERROR)");
                return new ProcessFinishEnrollmentResponseResult(idNowCommonResponse, null, null, "IDFINISHENROLLMENTRESPONSE_INPUT_ISNULL_(ERROR)");
            }
            IDProcess.Companion.processSHSPush(context, activity, finishEnrollmentResponse.getServerEnrollmentKey2());
            String code3 = iDEnrollmentResponseCodesProcessResponseCode.getCode();
            Intrinsics.checkExpressionValueIsNotNull(code3, "response.code");
            idNowCommonResponse.setCode(code3);
            String description2 = iDEnrollmentResponseCodesProcessResponseCode.getDescription();
            Intrinsics.checkExpressionValueIsNotNull(description2, "response.description");
            idNowCommonResponse.setDescription(description2);
            return new ProcessFinishEnrollmentResponseResult(idNowCommonResponse, finishEnrollmentResponse.getSeed(), finishEnrollmentResponse.getFinalScoring(), null);
        } catch (Exception e2) {
            String code4 = IDEnrollmentResponseCodes.GENERAL_ERROR.getCode();
            Intrinsics.checkExpressionValueIsNotNull(code4, "IDEnrollmentResponseCodes.GENERAL_ERROR.code");
            idNowCommonResponse.setCode(code4);
            String description3 = IDEnrollmentResponseCodes.GENERAL_ERROR.getDescription();
            Intrinsics.checkExpressionValueIsNotNull(description3, "IDEnrollmentResponseCode…GENERAL_ERROR.description");
            idNowCommonResponse.setDescription(description3);
            return new ProcessFinishEnrollmentResponseResult(idNowCommonResponse, null, null, e2.getLocalizedMessage());
        }
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public ProcessFinishEnrollmentResponseResult processFinishEnrollmentResponseNEC(Context context, Activity activity, FinishEnrollmentResponse finishEnrollmentResponse) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(finishEnrollmentResponse, "finishEnrollmentResponse");
        IdNowCommonResponse idNowCommonResponse = new IdNowCommonResponse();
        try {
            IDEnrollmentResponseCodes iDEnrollmentResponseCodesProcessResponseCode = IDEnrollmentResponseParser.processResponseCode(finishEnrollmentResponse.getCode());
            Intrinsics.checkExpressionValueIsNotNull(iDEnrollmentResponseCodesProcessResponseCode, "IDEnrollmentResponsePars…hEnrollmentResponse.code)");
            if (iDEnrollmentResponseCodesProcessResponseCode != IDEnrollmentResponseCodes.COD_OK) {
                String code = iDEnrollmentResponseCodesProcessResponseCode.getCode();
                Intrinsics.checkExpressionValueIsNotNull(code, "response.code");
                idNowCommonResponse.setCode(code);
                String description = iDEnrollmentResponseCodesProcessResponseCode.getDescription();
                Intrinsics.checkExpressionValueIsNotNull(description, "response.description");
                idNowCommonResponse.setDescription(description);
                return new ProcessFinishEnrollmentResponseResult(idNowCommonResponse, null, null, iDEnrollmentResponseCodesProcessResponseCode.getDescription());
            }
            if (IDCommonStorage.Companion.isNullOrEmpty(finishEnrollmentResponse.getServerEnrollmentKey2()) || IDCommonStorage.Companion.isNullOrEmpty(finishEnrollmentResponse.getSeed())) {
                String code2 = IDEnrollmentResponseCodes.GENERAL_ERROR.getCode();
                Intrinsics.checkExpressionValueIsNotNull(code2, "IDEnrollmentResponseCodes.GENERAL_ERROR.code");
                idNowCommonResponse.setCode(code2);
                idNowCommonResponse.setDescription("IDINITENROLLMENTRESPONSE_INPUT_ISNULL_(ERROR)");
                return new ProcessFinishEnrollmentResponseResult(idNowCommonResponse, null, null, "IDFINISHENROLLMENTRESPONSE_INPUT_ISNULL_(ERROR)");
            }
            String code3 = iDEnrollmentResponseCodesProcessResponseCode.getCode();
            Intrinsics.checkExpressionValueIsNotNull(code3, "response.code");
            idNowCommonResponse.setCode(code3);
            String description2 = iDEnrollmentResponseCodesProcessResponseCode.getDescription();
            Intrinsics.checkExpressionValueIsNotNull(description2, "response.description");
            idNowCommonResponse.setDescription(description2);
            return new ProcessFinishEnrollmentResponseResult(idNowCommonResponse, finishEnrollmentResponse.getSeed(), finishEnrollmentResponse.getFinalScoring(), null);
        } catch (Exception e2) {
            String code4 = IDEnrollmentResponseCodes.GENERAL_ERROR.getCode();
            Intrinsics.checkExpressionValueIsNotNull(code4, "IDEnrollmentResponseCodes.GENERAL_ERROR.code");
            idNowCommonResponse.setCode(code4);
            String description3 = IDEnrollmentResponseCodes.GENERAL_ERROR.getDescription();
            Intrinsics.checkExpressionValueIsNotNull(description3, "IDEnrollmentResponseCode…GENERAL_ERROR.description");
            idNowCommonResponse.setDescription(description3);
            return new ProcessFinishEnrollmentResponseResult(idNowCommonResponse, null, null, e2.getLocalizedMessage());
        }
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public ProcessInitEnrollmentResponseResult processInitEnrollmentResponse(Context context, Activity activity, InitEnrollmentResponse initEnrollmentResponse) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(initEnrollmentResponse, "initEnrollmentResponse");
        IdNowCommonResponse idNowCommonResponse = new IdNowCommonResponse();
        try {
            IDEnrollmentResponseCodes iDEnrollmentResponseCodesProcessResponseCode = IDEnrollmentResponseParser.processResponseCode(initEnrollmentResponse.getCode());
            Intrinsics.checkExpressionValueIsNotNull(iDEnrollmentResponseCodesProcessResponseCode, "IDEnrollmentResponsePars…tEnrollmentResponse.code)");
            if (iDEnrollmentResponseCodesProcessResponseCode != IDEnrollmentResponseCodes.COD_OK) {
                String code = iDEnrollmentResponseCodesProcessResponseCode.getCode();
                Intrinsics.checkExpressionValueIsNotNull(code, "response.code");
                idNowCommonResponse.setCode(code);
                String description = iDEnrollmentResponseCodesProcessResponseCode.getDescription();
                Intrinsics.checkExpressionValueIsNotNull(description, "response.description");
                idNowCommonResponse.setDescription(description);
                return new ProcessInitEnrollmentResponseResult(idNowCommonResponse, iDEnrollmentResponseCodesProcessResponseCode.getDescription());
            }
            if (IDCommonStorage.Companion.isNullOrEmpty(initEnrollmentResponse.getServerEnrollmentKey()) || IDCommonStorage.Companion.isNullOrEmpty(initEnrollmentResponse.getUuidTransaction())) {
                String code2 = IDEnrollmentResponseCodes.GENERAL_ERROR.getCode();
                Intrinsics.checkExpressionValueIsNotNull(code2, "IDEnrollmentResponseCodes.GENERAL_ERROR.code");
                idNowCommonResponse.setCode(code2);
                idNowCommonResponse.setDescription("IDINITENROLLMENTRESPONSE_INPUT_ISNULL_(ERROR)");
                return new ProcessInitEnrollmentResponseResult(idNowCommonResponse, "IDINITENROLLMENTRESPONSE_INPUT_ISNULL_(ERROR)");
            }
            IDProcess.Companion.processSHSSign(context, activity, initEnrollmentResponse.getServerEnrollmentKey());
            String code3 = IDEnrollmentResponseCodes.COD_OK.getCode();
            Intrinsics.checkExpressionValueIsNotNull(code3, "IDEnrollmentResponseCodes.COD_OK.code");
            idNowCommonResponse.setCode(code3);
            idNowCommonResponse.setDescription("OK, UuidTrx: " + initEnrollmentResponse.getUuidTransaction());
            idNowCommonResponse.setEnvironmentsParams(processEnvironments(initEnrollmentResponse.getEnvironmentsParams()));
            return new ProcessInitEnrollmentResponseResult(idNowCommonResponse, null);
        } catch (Exception e2) {
            String code4 = IDEnrollmentResponseCodes.GENERAL_ERROR.getCode();
            Intrinsics.checkExpressionValueIsNotNull(code4, "IDEnrollmentResponseCodes.GENERAL_ERROR.code");
            idNowCommonResponse.setCode(code4);
            String description2 = IDEnrollmentResponseCodes.GENERAL_ERROR.getDescription();
            Intrinsics.checkExpressionValueIsNotNull(description2, "IDEnrollmentResponseCode…GENERAL_ERROR.description");
            idNowCommonResponse.setDescription(description2);
            return new ProcessInitEnrollmentResponseResult(idNowCommonResponse, e2.getLocalizedMessage());
        }
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public ProcessInitEnrollmentResponseResult processInitEnrollmentResponseNoEnv(Context context, Activity activity, InitEnrollmentResponse initEnrollmentResponse) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(initEnrollmentResponse, "initEnrollmentResponse");
        IdNowCommonResponse idNowCommonResponse = new IdNowCommonResponse();
        try {
            IDEnrollmentResponseCodes iDEnrollmentResponseCodesProcessResponseCode = IDEnrollmentResponseParser.processResponseCode(initEnrollmentResponse.getCode());
            Intrinsics.checkExpressionValueIsNotNull(iDEnrollmentResponseCodesProcessResponseCode, "IDEnrollmentResponsePars…tEnrollmentResponse.code)");
            if (iDEnrollmentResponseCodesProcessResponseCode != IDEnrollmentResponseCodes.COD_OK) {
                String code = iDEnrollmentResponseCodesProcessResponseCode.getCode();
                Intrinsics.checkExpressionValueIsNotNull(code, "response.code");
                idNowCommonResponse.setCode(code);
                String description = iDEnrollmentResponseCodesProcessResponseCode.getDescription();
                Intrinsics.checkExpressionValueIsNotNull(description, "response.description");
                idNowCommonResponse.setDescription(description);
                return new ProcessInitEnrollmentResponseResult(idNowCommonResponse, iDEnrollmentResponseCodesProcessResponseCode.getDescription());
            }
            if (IDCommonStorage.Companion.isNullOrEmpty(initEnrollmentResponse.getServerEnrollmentKey()) || IDCommonStorage.Companion.isNullOrEmpty(initEnrollmentResponse.getUuidTransaction())) {
                String code2 = IDEnrollmentResponseCodes.GENERAL_ERROR.getCode();
                Intrinsics.checkExpressionValueIsNotNull(code2, "IDEnrollmentResponseCodes.GENERAL_ERROR.code");
                idNowCommonResponse.setCode(code2);
                idNowCommonResponse.setDescription("IDINITENROLLMENTRESPONSE_INPUT_ISNULL_(ERROR)");
                return new ProcessInitEnrollmentResponseResult(idNowCommonResponse, "IDINITENROLLMENTRESPONSE_INPUT_ISNULL_(ERROR)");
            }
            IDProcess.Companion.processSHSSign(context, activity, initEnrollmentResponse.getServerEnrollmentKey());
            String code3 = IDEnrollmentResponseCodes.COD_OK.getCode();
            Intrinsics.checkExpressionValueIsNotNull(code3, "IDEnrollmentResponseCodes.COD_OK.code");
            idNowCommonResponse.setCode(code3);
            idNowCommonResponse.setDescription("OK, UuidTrx: " + initEnrollmentResponse.getUuidTransaction());
            return new ProcessInitEnrollmentResponseResult(idNowCommonResponse, null);
        } catch (Exception e2) {
            String code4 = IDEnrollmentResponseCodes.GENERAL_ERROR.getCode();
            Intrinsics.checkExpressionValueIsNotNull(code4, "IDEnrollmentResponseCodes.GENERAL_ERROR.code");
            idNowCommonResponse.setCode(code4);
            String description2 = IDEnrollmentResponseCodes.GENERAL_ERROR.getDescription();
            Intrinsics.checkExpressionValueIsNotNull(description2, "IDEnrollmentResponseCode…GENERAL_ERROR.description");
            idNowCommonResponse.setDescription(description2);
            return new ProcessInitEnrollmentResponseResult(idNowCommonResponse, e2.getLocalizedMessage());
        }
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public IdNowCommonResponse resetEnvironmentParams(Context context, Activity activity) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.prefs = new IDCommonStorage(context);
        IdNowCommonResponse idNowCommonResponse = new IdNowCommonResponse();
        idNowCommonResponse.setCode("500");
        idNowCommonResponse.setDescription("General Error");
        idNowCommonResponse.setCode("00");
        idNowCommonResponse.setDescription("OK");
        return idNowCommonResponse;
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public IdNowCommonResponse resetSHSPush(Context context, Activity activity) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.prefs = new IDCommonStorage(context);
        IdNowCommonResponse idNowCommonResponse = new IdNowCommonResponse();
        idNowCommonResponse.setCode("500");
        idNowCommonResponse.setDescription("General Error");
        IDCommonStorage iDCommonStorage = this.prefs;
        if (iDCommonStorage != null) {
            iDCommonStorage.setSHSPush("");
            idNowCommonResponse.setCode("00");
            idNowCommonResponse.setDescription("OK");
        }
        return idNowCommonResponse;
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public IdNowCommonResponse resetSHSSign(Context context, Activity activity) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.prefs = new IDCommonStorage(context);
        IdNowCommonResponse idNowCommonResponse = new IdNowCommonResponse();
        idNowCommonResponse.setCode("500");
        idNowCommonResponse.setDescription("General Error");
        IDCommonStorage iDCommonStorage = this.prefs;
        if (iDCommonStorage != null) {
            iDCommonStorage.setSHSSign("");
            idNowCommonResponse.setCode("00");
            idNowCommonResponse.setDescription("OK");
        }
        return idNowCommonResponse;
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public IdNowCommonResponse resetUuid(Context context, Activity activity) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.prefs = new IDCommonStorage(context);
        IdNowCommonResponse idNowCommonResponse = new IdNowCommonResponse();
        idNowCommonResponse.setCode("500");
        idNowCommonResponse.setDescription("General Error");
        IDCommonStorage iDCommonStorage = this.prefs;
        if (iDCommonStorage != null) {
            iDCommonStorage.setIdNowUUID("");
            idNowCommonResponse.setCode("00");
            idNowCommonResponse.setDescription("OK");
        }
        return idNowCommonResponse;
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public void securePin(Context context, Activity activity, String pin) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(pin, "pin");
        savePin(context, activity, pin);
    }

    public final void setPrefs(IDCommonStorage iDCommonStorage) {
        this.prefs = iDCommonStorage;
    }

    @Override // com.ticnow.sdk.idnowsecurity.api.IDSecurityApi
    public boolean validatePin(Context context, Activity activity, String pin) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(pin, "pin");
        IDCommonStorage iDCommonStorage = new IDCommonStorage(context);
        this.prefs = iDCommonStorage;
        return StringsKt.equals$default(iDCommonStorage.getSecurePin(), pin, false, 2, null);
    }
}
