package com.ts.coresdk.crypto.biometrcis;

import androidx.biometric.BiometricPrompt;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.ts.coresdk.crypto.SignatureAuthenticator;
import com.ts.coresdk.crypto.api.KeyPairSignBiometricPromptTexts;
import com.ts.coresdk.crypto.biometrcis.TSBiometricResult;
import com.ts.coresdk.crypto.biometrcis.a;
import java.security.Signature;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import yg.InterfaceC1492Gx;

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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.hS2şs{J$c$wCCU(}*ޛWN}gvϺb\u000bY\u000f\u000e\u0016~j2Nkތ\u000e\u0012=1znQs`\u007fAG`\r63!B&F{\u001d\u0001H-Н\u0014v\tG\u0014# 7XphZ=Q\u0013#*\u0006l*Gȩ\u001b˚MȤՂp]H:k\u0019wNf'\u000e=-Q\u001bOl';\u0001\u0012\"9NO5C4\u001a\u0003OiiO\u001b? N5l50CI\"a|ݰ>ѥ\u0014ۀ̠\u0011]\u00011-\u0011_`$'YP:֢Rˎ,w\u0003Ԉ]H\u0012\u0010\u001e'v1\u0004Ղhڿ\u00123|Ɂ$L^\u0007vB.\u00018ت\u0019Ӿ\u000433ݍӘfSi;\u001fe҂\u007f\u0018"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi&[r2WK;zA\"\u0013SnC\u0018g+N\u0004\u0003RP\u001by8[q\u0019\u0011\u001ck\u000e$", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\">", "/bc6i0Mg", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D5{/;~\u001a=a\u0019", "9dh\u001dT0KA\u001d\u0001\u0004;0\u0007\u0011/t\r,y+\u000e!\u001fR~|<\n4C", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\"v9 U\u0002-%q\u00187*GEs4-\"l_$\u0014m4Y\u0006\u0016G_]:2", "uKP;W9HW\u0018\u0012D_9x\u000b7e\t7E<\f\"`(|\n>~%>hY\u001eFq'2\\W\u0011R2(\u001d2pGPa6[v5FR\u0018*if}L\u001e[V\u0019Rtr\u0005m, rQ%#\n5&\u0006Ep\u0001\u001b#\u00123U}L^\u001bVh\u0015\tP7>\nJ", ">q^:c;\"\\\u001a\t", "\u001a`]1e6BR,Hwb6\u0005\t>r\u0004&E\u001d\u0005!\u001fG~\u001b@t\u0010Bc\u0006+F,\u0001;WKFz\u0018'\u0016r7", "/tc5X5MW\u0017z\n^", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi&[r2WK;zA\"\u0013UaG\u0017j;$", "AhV;T;N`\u0019", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R\u001di\u00021wO\u0011$\u0017\u001d", "uKY.i(\ba\u0019|\u000bk0\f\u001dxS\u0004*\u0005<\u0010'$GEtB\u00014<]\u0007i5w#8]R?t4,^FkB\u0016g5^r6KVW\u0002 9w9%\u000e$\u0015J4\u000fNC>)nBFt", "/tc5X5MW\u0017z\n^\u0017\n\u00137p\u000f", "", "1`[9U(<Y", "\u001a`]1e6BR,Hwb6\u0005\t>r\u0004&E\u001d\u0005!\u001fG~\u001b@t\u0010Bc\u0006+F,q>\\F;tC\"\u0013dp=\u0011l\nJ}.DHL22", "/tc5X5MW\u0017z\n^\u001a\u0001\u000b8a\u000f8\t@", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\"UaG\u0017j;$", "\u000ftc5X5MW\u0017z\nb6\u0006f+l\u0007%w>\u0007z\u001fR", "1na2 (GR&\t~]s\u000b\b5_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TSBiometricProviderApi23AndAbove implements SignatureAuthenticator {
    private final FragmentActivity activity;
    private final KeyPairSignBiometricPromptTexts keyPairSignBiometricPromptTexts;
    private final BiometricPrompt.PromptInfo promptInfo;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007tjAӄLeV4Zݷ2\u000fy\u0007<$a%yCQU\"Ԃ(ޮQdʴ\u0018nxYKT\u001f\u0010$x\u00032YW\t]@\u0011`CņC3[r\u0006OnxN\u0005N7R<\b\u000b\u0019\u001aXO@z\tKc\f@9\u0007\u0006\u0003X\u001bW\u001d\u001a@\u000b\u00055I,jrf6vq\u000e>=/\u001bip[mt\u0001\u000f[\r^Z7\u000f\u0007aL-n8\fՙ'٨\u0007\u0007Z¹ϓ\u0007M"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi&[r2WK;zA\"\u0013SnC\u0018g+N\u0004\u0003RP\u001by8[q\u0019\u0011\u001ck\u000e\r\u0007\u001d\u0014\\A-}H5\u001b\u00170S\u000b\u0019d\b\u0013\u0013\n3pTJae", "\u001a`]1e6BR,Hwb6\u0005\t>r\u0004&E\u001d\u0005!\u001fG~\u001b@t\u0010Bc\u0006+F,q>\\F;tC\"\u0013dp=\u0011l\nJ}.DHL22", "1n]A", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi&[r2WK;zA\"\u0013UaG\u0017j;$", "uKR<`uMab|\u0005k,\u000b\b5/}5\u0010K\u0010!`Ds\u0018Dv4BW\u0002.\u0001\\\u0004\u000bQMCkC+\u0019fLF\u0011t0Mv4#WRx*.{<o\u000fd\u001fN\u0001s\u000bcP+rM\u0001\u001d\u00129S\u0012Jl\n\f$W\u0013tyQZ\u0019Wu$yK2>\nJ", "=m0Bg/>\\(\u0003xZ;\u0001\u00138E\r5\u0006M", "", "3qa<e\nHR\u0019", "", "3qa g9B\\\u001b", "", "=m0Bg/>\\(\u0003xZ;\u0001\u00138F{,\u0003@\u007f", "=m0Bg/>\\(\u0003xZ;\u0001\u00138S\u0010&y@\u0001\u0016\u0017F", "@dbB_;", "\u001a`]1e6BR,Hwb6\u0005\t>r\u0004&E\u001d\u0005!\u001fG~\u001b@t\u0010Bc\u0006+F,q>\\F;tC\"\u0013dp=\u0011l\u0019N\u00057N[$", "1na2 (GR&\t~]s\u000b\b5_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    private class AuthenticationCallbackImp extends BiometricPrompt.AuthenticationCallback {
        private final Continuation<TSBiometricResult> cont;
        final /* synthetic */ TSBiometricProviderApi23AndAbove this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public AuthenticationCallbackImp(TSBiometricProviderApi23AndAbove tSBiometricProviderApi23AndAbove, Continuation<? super TSBiometricResult> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "");
            this.this$0 = tSBiometricProviderApi23AndAbove;
            this.cont = continuation;
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationError(int i2, CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            super.onAuthenticationError(i2, charSequence);
            String string = charSequence.toString();
            a.i hVar = i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 7 ? i2 != 13 ? i2 != 9 ? i2 != 10 ? new a.h(null) : new a.j(string) : new a.c(string) : new a.d(string) : new a.b(string) : new a.C0319a(string) : new a.f(string) : new a.g(string) : new a.i(string);
            Continuation<TSBiometricResult> continuation = this.cont;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m8980constructorimpl(new TSBiometricResult.Failure(hVar)));
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationFailed() {
            super.onAuthenticationFailed();
            Continuation<TSBiometricResult> continuation = this.cont;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m8980constructorimpl(new TSBiometricResult.Failure(new a.e(null))));
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
            Unit unit;
            Signature signature;
            Intrinsics.checkNotNullParameter(authenticationResult, "");
            super.onAuthenticationSucceeded(authenticationResult);
            BiometricPrompt.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
            if (cryptoObject == null || (signature = cryptoObject.getSignature()) == null) {
                unit = null;
            } else {
                Continuation<TSBiometricResult> continuation = this.cont;
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m8980constructorimpl(new TSBiometricResult.Success(signature)));
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                Continuation<TSBiometricResult> continuation2 = this.cont;
                Result.Companion companion2 = Result.Companion;
                continuation2.resumeWith(Result.m8980constructorimpl(new TSBiometricResult.Failure(new a.h(null))));
            }
        }
    }

    static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BiometricPrompt aX;
        final /* synthetic */ TSBiometricProviderApi23AndAbove aY;
        final /* synthetic */ Signature aZ;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f18274x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(BiometricPrompt biometricPrompt, TSBiometricProviderApi23AndAbove tSBiometricProviderApi23AndAbove, Signature signature, Continuation<? super a> continuation) {
            super(2, continuation);
            this.aX = biometricPrompt;
            this.aY = tSBiometricProviderApi23AndAbove;
            this.aZ = signature;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.aX, this.aY, this.aZ, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f18274x != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.aX.authenticate(this.aY.promptInfo, new BiometricPrompt.CryptoObject(this.aZ));
            return Unit.INSTANCE;
        }
    }

    static final class b extends ContinuationImpl {
        /* synthetic */ Object ai;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f18275x;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.ai = obj;
            this.f18275x |= Integer.MIN_VALUE;
            return TSBiometricProviderApi23AndAbove.this.authenticateSignature(null, this);
        }
    }

    public TSBiometricProviderApi23AndAbove(FragmentActivity fragmentActivity, KeyPairSignBiometricPromptTexts keyPairSignBiometricPromptTexts) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(keyPairSignBiometricPromptTexts, "");
        this.activity = fragmentActivity;
        this.keyPairSignBiometricPromptTexts = keyPairSignBiometricPromptTexts;
        BiometricPrompt.PromptInfo.Builder confirmationRequired = new BiometricPrompt.PromptInfo.Builder().setAllowedAuthenticators(15).setConfirmationRequired(false);
        confirmationRequired.setTitle(keyPairSignBiometricPromptTexts.getTitle()).setSubtitle(keyPairSignBiometricPromptTexts.getSubTitle()).setNegativeButtonText(keyPairSignBiometricPromptTexts.getNegativeButton());
        BiometricPrompt.PromptInfo promptInfoBuild = confirmationRequired.setConfirmationRequired(true).build();
        Intrinsics.checkNotNullExpressionValue(promptInfoBuild, "");
        this.promptInfo = promptInfoBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object authenticate(Signature signature, Continuation<? super TSBiometricResult> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        authenticatePrompt(signature, new AuthenticationCallbackImp(this, safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    private final void authenticatePrompt(Signature signature, BiometricPrompt.AuthenticationCallback authenticationCallback) {
        try {
            Executor mainExecutor = ContextCompat.getMainExecutor(this.activity.getApplicationContext());
            Intrinsics.checkNotNullExpressionValue(mainExecutor, "");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new a(new BiometricPrompt(this.activity, mainExecutor, authenticationCallback), this, signature, null), 2, null);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    @Override // com.ts.coresdk.crypto.SignatureAuthenticator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object authenticateSignature(java.security.Signature r6, kotlin.coroutines.Continuation<? super com.ts.coresdk.crypto.SignatureAuthenticatorResult> r7) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ts.coresdk.crypto.biometrcis.TSBiometricProviderApi23AndAbove.authenticateSignature(java.security.Signature, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
