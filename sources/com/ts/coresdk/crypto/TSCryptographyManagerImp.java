package com.ts.coresdk.crypto;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.TSLog;
import com.ts.coresdk.crypto.Encryptor;
import com.ts.coresdk.crypto.api.BiometricKeyPairResult;
import com.ts.coresdk.crypto.api.CryptographyBiometricError;
import com.ts.coresdk.crypto.api.CryptographyBiometricSignResult;
import com.ts.coresdk.crypto.api.CryptographyError;
import com.ts.coresdk.crypto.api.IBiometricKeyPairSCryptographyCallback;
import com.ts.coresdk.crypto.api.IKeyPairSCryptographyCallback;
import com.ts.coresdk.crypto.api.KeyPairResult;
import com.ts.coresdk.crypto.api.RegularKeyPairResult;
import com.ts.coresdk.crypto.biometrcis.TSBiometricKeyPair;
import com.ts.coresdk.crypto.biometrcis.d;
import com.ts.coresdk.crypto.logic.CryptographyActionError;
import com.ts.coresdk.crypto.logic.SignWithKeyResult;
import com.ts.coresdk.crypto.logic.TSKeypairData;
import com.ts.coresdk.crypto.logic.TSRegularKeyPair;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĕ\u0014D57\u001eq\u007fZDkt\nA\u000e0\u0019:J~(-\u001aw\u001dfrˎ8Dsk6Ri*\u0017k\u00027,[:qK;[\u001a\u0006\"\u001fOVgmnRZ\u0019L\u0017\u0006\u001cyr,_U\u0001]\u0018\u0010:B\u0006?;MuBA`\u000b6\r 8\"@y\u0013\u0001\"ݒP\u0010\rzKK\u0012\u00128@\u0007:Z\rc\u0005\"\u0012\f>(\u00014\\oN<Ht]H?+ɅqBd'gܞ\u0005M#F\\'#viӜ1ê7KՖUS1\u0006\u0013`E\u0003ӭu=\u0013hoG9Y\fWdZ0\u0018#<g\r\f\u0005Vb\u0013dx\u000e=*}e{T\u001c<\u0010z*\"\u0003\u0004V&5^F/0e6\u0010cx\u0001dXP0pr\u0004\txN\u0017S\u0002c/G3~Q\u0010T_b\u007f\u001c\u0013'6%\u0017mO]\u0005\u0012n&3T&caUNX`N8[mq\u0012\tz\u0002X\u001dv[Ho\n-F\u001d59k9Q*\u001a\u001fxHu\b\u001d`\u0017e\u001aVVX:nDPZ\r\u001ax\\d3m\u0001Xf@)MJiMåF̯\u001fο˵; ڰ\u000fNұgiҷQ_\u0010D=\u0007\u007f\u0010|\r&_IbC7gb>j\u0001\u0014DCJs\u001dX\u0015T\u0004\u0010ht@\"`a\u001b\u0014\u0006\u001a\\N:\u0015x?ܝ\u001bعв0\u0018ě\u0014HҴ\"DG\u001f\u0017\u0003#\u001e\u001e#l3R(\u001a(\u0003\u001a\u0019P\u000b\u0003 o~I:\u0010x$C@\u007f7I,[\"vH\u0015#5\u0014$\u0004U\u007fdGz\u0006\\߲\u0014ߡ\u001f\u0016׀=Q=c[7\rPJ\u0002[m|vsbe\u0012U\r-\u007f\u001dN\u00010}\u0007\u0019r\\dxbgTE;'b\u0001L d.$(ZCoq\u007f#[lq#\u0007ghf8+2O$3\u0014\b$\u00134[EW!$\u0010,/Cz\u000em}W\u0012b=T;yLbqE\bb\u007f\u0006b?FZq~l4Tp\u0011Z`j&!r\u000fB=KJWc\u001f\bhQ\u0019a\u0016f5.=td\u000fR\u0013\u001e2d2m_\fC,J'M3HeS\u0016&\u0016K\u000bD\u0011\u000fZ\u0017\n2\u0007\u0012J?v\u074b*ť\r0\u000e\u058chBO>z\u0005j\u000bzҌ~ѧ\f\u000bKҍ:\u0012\u001e~\u0018F\u000e\u0011mϫ\u0015Ǡ?V\u0016֊IhdM\u001d`sfwƤ\u0003϶\u00133&֭\u0006V\u0013t^`?eB\u0001\u0002\u001f\u0019\u001dzO-oS3z\u0015\u0010ЌξX܁\u000fOeEO\u000eD\u0011_+su}\u0017\t$\u000b+Z\u0018IH(Μa۞4^\u0013̧ٝNq~\u0012lqV%/Έ\u0017+\rD\n\u0015\"ĨS-"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u00065M\u001bP\u00024?[\u000b\u001cBp*\u0016IL7m4+xpl\u000f", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u00065M\u001bP\u00024?[\u000b\u001cBp*\u0016IL7m4+j", "u(E", "\u0010H>\u001a8\u001b+7vxhN\r]l\"", "", "\u0012DE\u00166\f89xrtM\b^", "\u0012DE\u00166\f89xrtM\b^\u0003 El\u0016_*i", "1qh=g6@`\u0015\n}r\u0017\n\u0013@i~(\t", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@\u0014#7\u000b4B| 0Z?FnHs", "9dh@C(B`'Z\u0006i\u0013\u0001\n/C\u0014&\u0003@n&!Tk\u0010<", "", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@\u0014#?}4Bi\u001a;,?Jg\n", "5dc\u0018X@L>\u0015\u0003\bl\b\b\u0014\u0016i\u0001(YT~\u001e\u00175~\u0018Ir'5", "u(;7T=:\u001d)\u000e~eud\u0005:;", "9dh@C(B`'Z\u0006i\u0013\u0001\n/C\u0014&\u0003@n&!Tk\u0010<5$5`}\"3|\u0016", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", ";tc2k", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0015 \u0015\u0011W\u001eKv8\u000b", "1qT.g,$S-gvf,", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/kX.f", "Ehc550H[\u0019\u000e\bb*", "", "2dR?l7M", "2`c.G6\u001dS\u0017\f\u000fi;", ";nSB_,\"\\\u001a\t", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", "3mR?l7M", "2`c.G6\u001e\\\u0017\f\u000fi;", "7mc2e5:Zz~\u0004^9x\u0018/K\u007f<a@\u0015", "\u001aj^A_0G\u001d\u0006~\tn3\f^", "9dh\u001bT4>", "7mc2e5:Zz~\u0004^9x\u0018/K\u007f<a@\u0015^+ZV^9S+", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D9\u001e%\u0012;P\u0006D2~\u0016#\u0018EytKV\u001e\u0011W\u001f~P-qVUn}QJ\u001b&\u0011i\bp\u0019&A6-\u0016;\u0003\u0018mP,\u0019Q", "7mc2e5:Z\u007f\tv]\u0012|\u001d", "7mc2e5:Z\u007f\tv]\u0012|\u001dv0_yh,^v", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D\b\u001e$\u0004=EKBd\n\u000e_w2op@ee", "7mc2e5:Z\u007f\tv]\u0012|\u001d\u0010o\r\u0016\u007fB\n", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\"v9 U\u0002-$m$>TR\u0011", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s\nO_C\u000f-;\\@%QYN:[X<!\u0003\u007fB\u0018M;\u0014\u0005=J%x\u001a\u001e%\u0012;P\u0006D2~\u0016#\u0018EytKV\u001e\u0011W\u001f~P-qVUn}QJ\u001b&\u0011i\bp\u0019&A6-\u0016;\u0003\u0018mP,\u0019Q", ":nP1>,R4#\fhb.\u0006", "", "1`[9U(<Y", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW \\%IDy$D[s;aNJu6+\u0011sdMd_3Us#ER$", ":nP1>,R4#\fhb.\u0006z3t\u0003\u0005\u007fJ\t\u0017&Ts\f", "/bc6i0Mg", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D5{/;~\u001a=a\u0019", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW S)?a}/Dq\u0014\u0014MW&g8+\u0003FnM\u0012r6P\u0004#ROb\nXYy:\u0010\u0010`c", "AhV;J0MV~~\u000f", "AhV;T;N`\u0019Z\u000bm/|\u0012>i}$\u000bJ\u000e", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\">", "9dh!T.", "2`c.G6,W\u001b\b", "", ":hbAX5>`", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`tT\u0004\u0019K\u0001'BU\t#K[\u001a0V!7r;\u001b\u0011fg\u000f", "BnC F\nKg$\u000e\u0005`9x\u00142y\\,\u0006H\u0001&$KmmI\u0004/B", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7fp9X\u0004|", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a#Hx>+j", "1na2 (GR&\t~]s\u000b\b5_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TSCryptographyManagerImp implements TSCryptographyManager {
    private static final String BIOMETRIC_SUFFIX = "_BIOMETRIC";
    private static final String DEVICE_KEY_TAG = "_DeviceKeyTag_v2";
    private static final String DEVICE_KEY_TAG_VERSION = "_v2";
    public static final TSCryptographyManagerImp INSTANCE = new TSCryptographyManagerImp();
    private static final Mutex mutex = MutexKt.Mutex$default(false, 1, null);
    private static final com.ts.coresdk.crypto.logic.a cryptographyProvider = com.ts.coresdk.crypto.logic.b.INSTANCE;
    private static final Lazy keysPairsAppLifeCycleStorage$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) AnonymousClass1.aq);

    /* JADX INFO: renamed from: com.ts.coresdk.crypto.TSCryptographyManagerImp$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<CD&i\u000ePLc\u000b\u0004I\u00066\u000b<C\u0017.<\u0014\b\u0007\u0015iI2Tev.\u0001ݷp\u0018ө\u007f6*\\2s"}, d2 = {"", "", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@\u0014#?}4Bi\u001a;,?Jg\n", "7", "u(;7T=:\u001d)\u000e~eud\u0005:;"}, k = 3, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Map<String, TSKeypairData>> {
        public static final AnonymousClass1 aq = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: i */
        public final Map<String, TSKeypairData> invoke() {
            return new LinkedHashMap();
        }
    }

    static final class a extends ContinuationImpl {
        Object ae;
        Object af;
        Object ag;
        boolean ah;
        /* synthetic */ Object ai;

        /* JADX INFO: renamed from: x */
        int f18267x;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.ai = obj;
            this.f18267x |= Integer.MIN_VALUE;
            Object objM8773internalGenerateKeyKeyyxL6bBk = TSCryptographyManagerImp.this.m8773internalGenerateKeyKeyyxL6bBk(null, null, null, false, this);
            return objM8773internalGenerateKeyKeyyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8773internalGenerateKeyKeyyxL6bBk : Result.m8979boximpl(objM8773internalGenerateKeyKeyyxL6bBk);
        }
    }

    public static final class b implements Encryptor.GenerateKeysListener {
        final /* synthetic */ Context ak;
        final /* synthetic */ ITSModuleInfo al;
        final /* synthetic */ Continuation<Result<TSKeypairData>> am;
        final /* synthetic */ String an;

        /* JADX WARN: Multi-variable type inference failed */
        b(Context context, ITSModuleInfo iTSModuleInfo, Continuation<? super Result<TSKeypairData>> continuation, String str) {
            this.ak = context;
            this.al = iTSModuleInfo;
            this.am = continuation;
            this.an = str;
        }

        @Override // com.ts.coresdk.crypto.Encryptor.GenerateKeysListener
        public void onKeyGenerated(Encryptor.PublicKeyData publicKeyData) {
            Intrinsics.checkNotNullParameter(publicKeyData, "");
            TSLog.d(this.ak, this.al, "Successfully generated device key");
            Continuation<Result<TSKeypairData>> continuation = this.am;
            Result.Companion companion = Result.Companion;
            Result resultM8979boximpl = Result.m8979boximpl(Result.m8980constructorimpl(new TSKeypairData(this.an, publicKeyData)));
            Result.Companion companion2 = Result.Companion;
            continuation.resumeWith(Result.m8980constructorimpl(resultM8979boximpl));
        }

        @Override // com.ts.coresdk.crypto.Encryptor.GenerateKeysListener
        public void onKeyGenerationFailure(com.ts.coresdk.crypto.c cVar) {
            Exception exc;
            TSLog.e$default(this.ak, this.al, "Error while generating device key " + cVar, null, 8, null);
            Continuation<Result<TSKeypairData>> continuation = this.am;
            Result.Companion companion = Result.Companion;
            if (cVar == null || (exc = cVar.h()) == null) {
                exc = new Exception("Error while generating device key " + cVar);
            }
            Result resultM8979boximpl = Result.m8979boximpl(Result.m8980constructorimpl(ResultKt.createFailure(exc)));
            Result.Companion companion2 = Result.Companion;
            continuation.resumeWith(Result.m8980constructorimpl(resultM8979boximpl));
        }
    }

    static final class c extends ContinuationImpl {
        Object ae;
        Object af;
        Object ag;
        boolean ah;
        /* synthetic */ Object ai;
        Object ao;

        /* JADX INFO: renamed from: x */
        int f18268x;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.ai = obj;
            this.f18268x = (-1) - (((-1) - this.f18268x) & ((-1) - Integer.MIN_VALUE));
            return TSCryptographyManagerImp.this.internalLoadKeyForSign(null, null, false, null, this);
        }
    }

    static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context ar;
        final /* synthetic */ String as;
        final /* synthetic */ ITSModuleInfo at;
        final /* synthetic */ IKeyPairSCryptographyCallback au;

        /* JADX INFO: renamed from: x */
        int f18269x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, String str, ITSModuleInfo iTSModuleInfo, IKeyPairSCryptographyCallback iKeyPairSCryptographyCallback, Continuation<? super d> continuation) {
            super(2, continuation);
            this.ar = context;
            this.as = str;
            this.at = iTSModuleInfo;
            this.au = iKeyPairSCryptographyCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.ar, this.as, this.at, this.au, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            RegularKeyPairResult.Success success;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f18269x;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f18269x = 1;
                obj = TSCryptographyManagerImp.INSTANCE.internalLoadKeyForSign(this.ar, this.as, false, this.at, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException(Jg.Wd("\u0019Ou-yIc?o\u0003\u00018Yl{Vj|)Uft\u0011z\u001d\u00195x\u0011\u0016\u001b\u0004(IZ\u0001\u000e\\;v\u0002Jw  4F", (short) (C1499aX.Xd() ^ (-17018)), (short) (C1499aX.Xd() ^ (-6480))));
                }
                ResultKt.throwOnFailure(obj);
            }
            IKeyPairSCryptographyCallback iKeyPairSCryptographyCallback = this.au;
            Context context = this.ar;
            ITSModuleInfo iTSModuleInfo = this.at;
            KeyPairResult keyPairResult = (KeyPairResult) obj;
            if (keyPairResult instanceof KeyPairResult.Error) {
                success = new RegularKeyPairResult.Error(((KeyPairResult.Error) keyPairResult).getError());
            } else {
                if (!(keyPairResult instanceof KeyPairResult.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object[] objArr = new Object[0];
                Method method = Class.forName(ZO.xd("`HQ\u0015\u00113W0\u0004w@U\tgc.g7e\baB=", (short) (OY.Xd() ^ 21024), (short) (OY.Xd() ^ 22799))).getMethod(C1626yg.Ud("\u00195\u00199D/\u0014zQ,j262\u0002N\u001a\u000f)d ", (short) (C1633zX.Xd() ^ (-25001)), (short) (C1633zX.Xd() ^ (-24766))), new Class[0]);
                try {
                    method.setAccessible(true);
                    Context context2 = (Context) method.invoke(context, objArr);
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    KeyPairResult.Success success2 = (KeyPairResult.Success) keyPairResult;
                    success = new RegularKeyPairResult.Success(new TSRegularKeyPair(context2, iTSModuleInfo, success2.getKeypairData().getKeyTag(), success2.getKeypairData().getPublicKeyData()));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            iKeyPairSCryptographyCallback.onFetchKeyPair(success);
            return Unit.INSTANCE;
        }
    }

    static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity av;
        final /* synthetic */ IBiometricKeyPairSCryptographyCallback aw;
        final /* synthetic */ String ax;
        final /* synthetic */ ITSModuleInfo ay;

        /* JADX INFO: renamed from: x */
        int f18270x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(FragmentActivity fragmentActivity, IBiometricKeyPairSCryptographyCallback iBiometricKeyPairSCryptographyCallback, String str, ITSModuleInfo iTSModuleInfo, Continuation<? super e> continuation) {
            super(2, continuation);
            this.av = fragmentActivity;
            this.aw = iBiometricKeyPairSCryptographyCallback;
            this.ax = str;
            this.ay = iTSModuleInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.av, this.aw, this.ax, this.ay, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: e */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CryptographyBiometricError.BiometricErrorStatusUnknown biometricErrorStatusUnknown;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f18270x;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                d.a aVarA = com.ts.coresdk.crypto.biometrcis.d.INSTANCE.a(this.av);
                if (aVarA instanceof d.a.C0320a) {
                    switch (TSCryptographyManagerImp$e$a$WhenMappings.$EnumSwitchMapping$0[((d.a.C0320a) aVarA).k().ordinal()]) {
                        case 1:
                            biometricErrorStatusUnknown = CryptographyBiometricError.BiometricErrorNoHardware.INSTANCE;
                            break;
                        case 2:
                            biometricErrorStatusUnknown = CryptographyBiometricError.BiometricErrorHWUnavailable.INSTANCE;
                            break;
                        case 3:
                            biometricErrorStatusUnknown = CryptographyBiometricError.BiometricErrorNonEnrolled.INSTANCE;
                            break;
                        case 4:
                            biometricErrorStatusUnknown = CryptographyBiometricError.BiometricErrorSecurityUpdateRequired.INSTANCE;
                            break;
                        case 5:
                            biometricErrorStatusUnknown = CryptographyBiometricError.BiometricErrorUnsupported.INSTANCE;
                            break;
                        case 6:
                            biometricErrorStatusUnknown = CryptographyBiometricError.BiometricErrorStatusUnknown.INSTANCE;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    this.aw.onFetchKeyPair(new BiometricKeyPairResult.Error(biometricErrorStatusUnknown));
                    return Unit.INSTANCE;
                }
                TSCryptographyManagerImp tSCryptographyManagerImp = TSCryptographyManagerImp.INSTANCE;
                Context applicationContext = this.av.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                this.f18270x = 1;
                obj = tSCryptographyManagerImp.internalLoadKeyForSign(applicationContext, this.ax, true, this.ay, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            IBiometricKeyPairSCryptographyCallback iBiometricKeyPairSCryptographyCallback = this.aw;
            FragmentActivity fragmentActivity = this.av;
            ITSModuleInfo iTSModuleInfo = this.ay;
            KeyPairResult keyPairResult = (KeyPairResult) obj;
            if (keyPairResult instanceof KeyPairResult.Success) {
                TSKeypairData keypairData = ((KeyPairResult.Success) keyPairResult).getKeypairData();
                iBiometricKeyPairSCryptographyCallback.onFetchKeyPair(new BiometricKeyPairResult.Success(new TSBiometricKeyPair(fragmentActivity, iTSModuleInfo, keypairData.getKeyTag(), keypairData.getPublicKeyData())));
                return Unit.INSTANCE;
            }
            if (!(keyPairResult instanceof KeyPairResult.Error)) {
                return Unit.INSTANCE;
            }
            iBiometricKeyPairSCryptographyCallback.onFetchKeyPair(new BiometricKeyPairResult.Error(TSCryptographyManagerImp.INSTANCE.toTSSCryptographyBiometricError(((KeyPairResult.Error) keyPairResult).getError())));
            return Unit.INSTANCE;
        }
    }

    static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ITSModuleInfo aA;
        final /* synthetic */ SignatureAuthenticator aB;
        final /* synthetic */ String aC;
        final /* synthetic */ byte[] aD;
        final /* synthetic */ com.ts.coresdk.crypto.d aE;
        final /* synthetic */ Context az;

        /* JADX INFO: renamed from: x */
        int f18271x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context, ITSModuleInfo iTSModuleInfo, SignatureAuthenticator signatureAuthenticator, String str, byte[] bArr, com.ts.coresdk.crypto.d dVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.az = context;
            this.aA = iTSModuleInfo;
            this.aB = signatureAuthenticator;
            this.aC = str;
            this.aD = bArr;
            this.aE = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.az, this.aA, this.aB, this.aC, this.aD, this.aE, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: f */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f18271x;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f18271x = 1;
                    obj = TSCryptographyManagerImp.cryptographyProvider.a(this.az, this.aA, this.aB, this.aC, this.aD, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                SignWithKeyResult signWithKeyResult = (SignWithKeyResult) obj;
                if (signWithKeyResult instanceof SignWithKeyResult.Success) {
                    TSLog.d(this.az, this.aA, "Signed successfully with key " + this.aC);
                    this.aE.onResult(new CryptographyBiometricSignResult.Success(((SignWithKeyResult.Success) signWithKeyResult).getSignedString()));
                } else if (signWithKeyResult instanceof SignWithKeyResult.Failure) {
                    TSLog.e$default(this.az, this.aA, "signing failed: " + ((SignWithKeyResult.Failure) signWithKeyResult).getError(), null, 8, null);
                    this.aE.onResult(new CryptographyBiometricSignResult.Failure(((SignWithKeyResult.Failure) signWithKeyResult).getError()));
                }
            } catch (Throwable th) {
                TSLog.e(this.az, this.aA, "signing failed: ", th);
                com.ts.coresdk.crypto.d dVar = this.aE;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                dVar.onResult(new CryptographyBiometricSignResult.Failure(new CryptographyActionError.Other(message, th)));
            }
            return Unit.INSTANCE;
        }
    }

    private TSCryptographyManagerImp() {
    }

    private final String createKeyName(Context context, String str, boolean z2) {
        if (str == null && z2) {
            return createKeyName$getKeyTag(context) + BIOMETRIC_SUFFIX;
        }
        return (str == null || !z2) ? (str == null || z2) ? createKeyName$getKeyTag(context) : str : str + BIOMETRIC_SUFFIX;
    }

    private static final String createKeyName$getKeyTag(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("\u0002>\"\u0015\u0012^qC*YZ~!06\u0019U\b>\t;y\b", (short) (Od.Xd() ^ (-6420)))).getMethod(EO.Od("\u001fE\t{tA\u0007~#Sfw,'\u0002N\u0002\u0010+\u0005;", (short) (C1633zX.Xd() ^ (-4738))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Class<?> cls = Class.forName(C1561oA.Qd("eqfsohb+_jhm]ej#7b`eUgb", (short) (C1633zX.Xd() ^ (-9618))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd = (short) (C1580rY.Xd() ^ (-5526));
            short sXd2 = (short) (C1580rY.Xd() ^ (-21387));
            int[] iArr = new int["\u001a\u0019)\u0006\u0018\u001b$\u001b\"!\u000b\u001f,%".length()];
            QB qb = new QB("\u001a\u0019)\u0006\u0018\u001b$\u001b\"!\u000b\u001f,%");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method2.setAccessible(true);
                return ((String) method2.invoke(context2, objArr2)) + C1561oA.od(")\r-=/()\u000e':\u0014 %\u001c2l", (short) (C1580rY.Xd() ^ (-5769)));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private final Map<String, TSKeypairData> getKeysPairsAppLifeCycleStorage() {
        return (Map) keysPairsAppLifeCycleStorage$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX INFO: renamed from: internalGenerateKeyKey-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8773internalGenerateKeyKeyyxL6bBk(android.content.Context r14, com.ts.coresdk.ITSModuleInfo r15, java.lang.String r16, boolean r17, kotlin.coroutines.Continuation<? super kotlin.Result<com.ts.coresdk.crypto.logic.TSKeypairData>> r18) {
        /*
            r13 = this;
            r3 = r18
            boolean r0 = r3 instanceof com.ts.coresdk.crypto.TSCryptographyManagerImp.a
            if (r0 == 0) goto La8
            r2 = r3
            com.ts.coresdk.crypto.TSCryptographyManagerImp$a r2 = (com.ts.coresdk.crypto.TSCryptographyManagerImp.a) r2
            int r0 = r2.f18267x
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto La8
            int r0 = r2.f18267x
            int r0 = r0 - r1
            r2.f18267x = r0
        L15:
            java.lang.Object r4 = r2.ai
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.f18267x
            r0 = 1
            if (r3 == 0) goto L3a
            if (r3 != r0) goto Laf
            boolean r0 = r2.ah
            java.lang.Object r0 = r2.ag
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.af
            com.ts.coresdk.ITSModuleInfo r0 = (com.ts.coresdk.ITSModuleInfo) r0
            java.lang.Object r0 = r2.ae
            android.content.Context r0 = (android.content.Context) r0
            kotlin.ResultKt.throwOnFailure(r4)
        L33:
            kotlin.Result r4 = (kotlin.Result) r4
            java.lang.Object r0 = r4.m8989unboximpl()
            return r0
        L3a:
            kotlin.ResultKt.throwOnFailure(r4)
            r7 = r14
            r2.ae = r7
            r8 = r15
            r2.af = r8
            r9 = r16
            r2.ag = r9
            r10 = r17
            r2.ah = r10
            r2.f18267x = r0
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            kotlin.coroutines.SafeContinuation r3 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r2)
            r3.<init>(r0)
            r0 = r3
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            com.ts.coresdk.crypto.logic.a r6 = com.ts.coresdk.crypto.TSCryptographyManagerImp.cryptographyProvider     // Catch: java.lang.Throwable -> L6a
            java.lang.String r11 = "RSA"
            com.ts.coresdk.crypto.TSCryptographyManagerImp$b r12 = new com.ts.coresdk.crypto.TSCryptographyManagerImp$b     // Catch: java.lang.Throwable -> L6a
            r12.<init>(r7, r8, r0, r9)     // Catch: java.lang.Throwable -> L6a
            com.ts.coresdk.crypto.Encryptor$GenerateKeysListener r12 = (com.ts.coresdk.crypto.Encryptor.GenerateKeysListener) r12     // Catch: java.lang.Throwable -> L6a
            r6.generateKeys(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L6a
            goto L98
        L6a:
            r6 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r4 = "Error while loading device key "
            r5.<init>(r4)
            java.lang.StringBuilder r4 = r5.append(r6)
            java.lang.String r9 = r4.toString()
            r11 = 8
            r12 = 0
            r10 = 0
            com.ts.coresdk.TSLog.e$default(r7, r8, r9, r10, r11, r12)
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r6)
            java.lang.Object r4 = kotlin.Result.m8980constructorimpl(r4)
            kotlin.Result r5 = kotlin.Result.m8979boximpl(r4)
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.Result.m8980constructorimpl(r5)
            r0.resumeWith(r4)
        L98:
            java.lang.Object r4 = r3.getOrThrow()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r0) goto La5
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r2)
        La5:
            if (r4 != r1) goto L33
            return r1
        La8:
            com.ts.coresdk.crypto.TSCryptographyManagerImp$a r2 = new com.ts.coresdk.crypto.TSCryptographyManagerImp$a
            r2.<init>(r3)
            goto L15
        Laf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ts.coresdk.crypto.TSCryptographyManagerImp.m8773internalGenerateKeyKeyyxL6bBk(android.content.Context, com.ts.coresdk.ITSModuleInfo, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: internalLoadKey-0E7RQCE */
    private final Object m8774internalLoadKey0E7RQCE(Context context, ITSModuleInfo iTSModuleInfo, String str) {
        try {
            Result.Companion companion = Result.Companion;
            return Result.m8980constructorimpl(cryptographyProvider.c(context, iTSModuleInfo, str));
        } catch (Throwable th) {
            TSLog.e$default(context, iTSModuleInfo, "Error while loading device key " + th, null, 8, null);
            Result.Companion companion2 = Result.Companion;
            return Result.m8980constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a3 A[Catch: all -> 0x014d, TRY_LEAVE, TryCatch #5 {all -> 0x014d, blocks: (B:153:0x00ed, B:155:0x00f3, B:160:0x010f, B:163:0x011a, B:134:0x0097, B:136:0x00a3, B:141:0x00b4, B:143:0x00be, B:145:0x00c2, B:150:0x00dc, B:168:0x012e, B:171:0x0139), top: B:209:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00b4 A[Catch: all -> 0x014d, TRY_ENTER, TryCatch #5 {all -> 0x014d, blocks: (B:153:0x00ed, B:155:0x00f3, B:160:0x010f, B:163:0x011a, B:134:0x0097, B:136:0x00a3, B:141:0x00b4, B:143:0x00be, B:145:0x00c2, B:150:0x00dc, B:168:0x012e, B:171:0x0139), top: B:209:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00f3 A[Catch: all -> 0x014d, TRY_LEAVE, TryCatch #5 {all -> 0x014d, blocks: (B:153:0x00ed, B:155:0x00f3, B:160:0x010f, B:163:0x011a, B:134:0x0097, B:136:0x00a3, B:141:0x00b4, B:143:0x00be, B:145:0x00c2, B:150:0x00dc, B:168:0x012e, B:171:0x0139), top: B:209:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x010f A[Catch: all -> 0x014d, TRY_ENTER, TryCatch #5 {all -> 0x014d, blocks: (B:153:0x00ed, B:155:0x00f3, B:160:0x010f, B:163:0x011a, B:134:0x0097, B:136:0x00a3, B:141:0x00b4, B:143:0x00be, B:145:0x00c2, B:150:0x00dc, B:168:0x012e, B:171:0x0139), top: B:209:0x0097 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object internalLoadKeyForSign(android.content.Context r16, java.lang.String r17, boolean r18, com.ts.coresdk.ITSModuleInfo r19, kotlin.coroutines.Continuation<? super com.ts.coresdk.crypto.api.KeyPairResult> r20) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ts.coresdk.crypto.TSCryptographyManagerImp.internalLoadKeyForSign(android.content.Context, java.lang.String, boolean, com.ts.coresdk.ITSModuleInfo, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object internalLoadKeyForSign$default(TSCryptographyManagerImp tSCryptographyManagerImp, Context context, String str, boolean z2, ITSModuleInfo iTSModuleInfo, Continuation continuation, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z2 = false;
        }
        return tSCryptographyManagerImp.internalLoadKeyForSign(context, str, z2, iTSModuleInfo, continuation);
    }

    public final CryptographyBiometricError toTSSCryptographyBiometricError(CryptographyError cryptographyError) {
        if (cryptographyError instanceof CryptographyError.GenerateKeyFailed) {
            return new CryptographyBiometricError.LoadKeyFailed(cryptographyError.getErrorMessage(), cryptographyError.getThrowable());
        }
        if (cryptographyError instanceof CryptographyError.InternalError) {
            return new CryptographyBiometricError.GenerateKeyFailed(cryptographyError.getErrorMessage(), cryptographyError.getThrowable());
        }
        if (cryptographyError instanceof CryptographyError.LoadKeyFailed) {
            return new CryptographyBiometricError.InternalError(cryptographyError.getErrorMessage(), cryptographyError.getThrowable());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.ts.coresdk.crypto.TSCryptographyManager
    public String decrypt(Context context, String str, ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        return cryptographyProvider.decrypt(context, str, iTSModuleInfo);
    }

    @Override // com.ts.coresdk.crypto.TSCryptographyManager
    public String encrypt(Context context, String str, ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        return cryptographyProvider.encrypt(context, str, iTSModuleInfo);
    }

    @Override // com.ts.coresdk.crypto.TSCryptographyManager
    public void loadKeyForSign(Context context, String str, ITSModuleInfo iTSModuleInfo, IKeyPairSCryptographyCallback iKeyPairSCryptographyCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(iKeyPairSCryptographyCallback, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new d(context, str, iTSModuleInfo, iKeyPairSCryptographyCallback, null), 2, null);
    }

    @Override // com.ts.coresdk.crypto.TSCryptographyManager
    public void loadKeyForSignWithBiometric(FragmentActivity fragmentActivity, String str, ITSModuleInfo iTSModuleInfo, IBiometricKeyPairSCryptographyCallback iBiometricKeyPairSCryptographyCallback) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(iBiometricKeyPairSCryptographyCallback, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new e(fragmentActivity, iBiometricKeyPairSCryptographyCallback, str, iTSModuleInfo, null), 2, null);
    }

    public final void signWithKey(Context context, ITSModuleInfo iTSModuleInfo, SignatureAuthenticator signatureAuthenticator, String str, byte[] bArr, com.ts.coresdk.crypto.d dVar) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(dVar, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new f(context, iTSModuleInfo, signatureAuthenticator, str, bArr, dVar, null), 2, null);
    }
}
