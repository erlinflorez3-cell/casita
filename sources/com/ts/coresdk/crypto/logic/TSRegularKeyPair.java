package com.ts.coresdk.crypto.logic;

import android.content.Context;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.crypto.Encryptor;
import com.ts.coresdk.crypto.SignatureAuthenticator;
import com.ts.coresdk.crypto.TSKeyPair;
import com.ts.coresdk.crypto.api.CryptographyBiometricSignResult;
import com.ts.coresdk.crypto.api.CryptographySignResult;
import com.ts.coresdk.crypto.api.ICryptographyRegularSignCallback;
import com.ts.coresdk.crypto.logic.CryptographyActionError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLcz\u0005I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG0L͜P.`c2\u000fq{<$q$yّCU0}*\t]Zog\u0005Jb\u000bI\u0010\u000e\u0016\u000fj4Ikxs܈?DRqO3{}M;ptd\u001a0428(\n/.jm z\tGc\f@>PtHX%M3\u0019\"\nL*\u0019\u001e\u000bv^:V}u:]3ɨmDT9mCEj\u001bHl';}\u0012\"9DO5C(\u0004\u0007\u0015Xs?1D8Oݾl)--W{ [f\u0002,\u0015YV=a\u0001*t\u0005\u007f_<+9U{K~\u0017X{\t\u0006%<2\u0013L;ρ2/ h\u0016\u0019{\f\u0001UXR\u0018]p\f+eD\u001b=\u007fa0\u007f.ƻUcA\u001b\\DL\u0014\u001b ;\u0001\u001d 2Y\u05f8d\u0019#V}Q?R"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@\u0014#F}\"Gt\u0012;3COV0\"\">", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", "0g", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", RemoteSettings.FORWARD_SLASH_STRING, "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7tg.Wc'U\\U;2", ">/", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW T2Id\r*9z\u00129PW(k6.\u001cdn'\u000be5,r.NIJ*b(", ">0", "", "uKR<`uMab|\u0005k,\u000b\b5/}5\u0010K\u0010!`Cz\u0012\u0006T2Id\r*9z\u00129PW\u0018o>&\u0015wn=\u0005Q0P\u007f\u0014GZ^3k(Y;\u001e\u001a$\u001d\\t\u000b\u000ffA2mJ\u0001\u001d\u0015@T\u0011E2|\u0017\u001aW\u0019H}Va\u001fQ{\"qL,|3Ya\nN=RP.f\u0015=\u0019cA7 \u0012wn^Y", "", ">1", "uKR<`uMab|\u0005k,\u000b\b5/c\u0017i(\u000b\u0016'NoqEw/\u000bOZ\u00075w\u001ew\\Q\u0005i>+\u0015v`?Pa9b\u00026Q\u0016J7`\u001cV\u001b!&e\u001dX-\u001a\u0001dD8[D9/\u000f(Vo?j\ni\u0012\u0015<gl@\\e\u000bj", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\">", "uKR<`uMab|\u0005k,\u000b\b5/}5\u0010K\u0010!`Cz\u0012\u0006Z\u0003Bm\t/Ao#*XFOX4 %o]Ftg.WT#NSK(ZXH\u0001z\u0010d\u0016\u0018:\u001bNWK1nR6%Q*V\u0016Fw\u000bU\u0004\u00127slQf\u001dGU%\u0005D)qU]]uVKR8", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`vPm\u001bP\u00024?f<\u000bGj\u001d2K);\u007f\u0013\u001a$d7", ">2", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D+5)\u0010uX\u0010\u0005f\u000b\u0019\u0016\u001c4p:@c$R\t\u001f?!2fSmj\tQN\u0004M:a\u0013c\u001bB:N\u0003\u0010\u0001\u0015p,A", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u00065U\u000ePa!9fS", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a1?m=\u000b\u0015vq@\u00169"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TSRegularKeyPair extends TSKeyPair<Context, CryptographySignResult, ICryptographyRegularSignCallback> {
    public final ITSModuleInfo bh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TSRegularKeyPair(Context context, ITSModuleInfo iTSModuleInfo, String str, Encryptor.PublicKeyData publicKeyData) {
        super(context, iTSModuleInfo, str, publicKeyData);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(publicKeyData, "");
        this.bh = iTSModuleInfo;
    }

    @Override // com.ts.coresdk.crypto.TSKeyPair
    /* JADX INFO: renamed from: a */
    public SignatureAuthenticator signatureAuthenticator(ICryptographyRegularSignCallback iCryptographyRegularSignCallback) {
        Intrinsics.checkNotNullParameter(iCryptographyRegularSignCallback, "");
        return null;
    }

    @Override // com.ts.coresdk.crypto.TSKeyPair
    /* JADX INFO: renamed from: a */
    public void sign(ITSModuleInfo iTSModuleInfo, byte[] bArr, ICryptographyRegularSignCallback iCryptographyRegularSignCallback) {
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(iCryptographyRegularSignCallback, "");
        super.sign(iTSModuleInfo, bArr, iCryptographyRegularSignCallback);
    }

    @Override // com.ts.coresdk.crypto.TSKeyPair
    /* JADX INFO: renamed from: a */
    public void returnSignResult(CryptographyBiometricSignResult cryptographyBiometricSignResult, ICryptographyRegularSignCallback iCryptographyRegularSignCallback) {
        CryptographySignResult failure;
        CryptographySignResult success;
        Intrinsics.checkNotNullParameter(cryptographyBiometricSignResult, "");
        Intrinsics.checkNotNullParameter(iCryptographyRegularSignCallback, "");
        if (cryptographyBiometricSignResult instanceof CryptographyBiometricSignResult.Success) {
            success = new CryptographySignResult.Success(((CryptographyBiometricSignResult.Success) cryptographyBiometricSignResult).getSignedString());
        } else {
            if (!(cryptographyBiometricSignResult instanceof CryptographyBiometricSignResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            CryptographyBiometricSignResult.Failure failure2 = (CryptographyBiometricSignResult.Failure) cryptographyBiometricSignResult;
            CryptographyActionError error = failure2.getError();
            if (error instanceof CryptographyActionError.Other) {
                String errorMsg = failure2.getError().getErrorMsg();
                failure = new CryptographySignResult.Failure(errorMsg != null ? errorMsg : "", ((CryptographyActionError.Other) failure2.getError()).getT());
            } else if (error instanceof CryptographyActionError.UnKnown) {
                String errorMsg2 = failure2.getError().getErrorMsg();
                failure = new CryptographySignResult.Failure(errorMsg2 != null ? errorMsg2 : "", null);
            } else {
                failure = new CryptographySignResult.Failure("internal error", null);
            }
            success = failure;
        }
        iCryptographyRegularSignCallback.onResult(success);
    }
}
