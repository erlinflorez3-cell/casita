package com.ts.coresdk.crypto.api;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.crypto.TSCryptographyManager;
import com.ts.coresdk.crypto.TSCryptographyManagerImp;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP.XT2\u000fy{<$a$yCQU\"}(\tWN}gvJp\u000bKƤ\fȥx\u0001ߚyU'\\R\u00148BņC3[o\u0006ZnuN\u000761P:*\t\u000f\u001dBH>z+GY\u0011*0nrjV\u001bS\u001d\u001a@\r\u0005Ŀ\u007ff}uVNJ\u0003\\h1S\u0007wEf'\u000e4-Q\u001bOl';x\u0012\"9FO5C,\u001aΟ\u0006\u001b\u0007M\rWqk\u0010\u0019+5.as\u0006:\t\b\u001a\u00159[%_\t%\u000b\u0007\u0002d\u001a-CO\u0012R\u0001\u00126\u0005\u0013{;JJؑ\u0005os<<2f6\u0019cx\u0001cXP0or\b\u0001aD#=\u0002I*g\u001d\u0017UoA1Ne\u00035\u0011,0\u0019nOm\u001b\u05ec_ڦ\u001fg"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a+7t0 \u0015u7", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u00065M\u001bP\u00024?[\u000b\u001cBp*\u0016IL7m4+j", "u(E", "2dR?l7M", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "2`c.G6\u001dS\u0017\f\u000fi;", ";nSB_,\"\\\u001a\t", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", "3mR?l7M", "2`c.G6\u001e\\\u0017\f\u000fi;", ":nP1>,R4#\fhb.\u0006", "", "/kX.f", "1`[9U(<Y", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW \\%IDy$D[s;aNJu6+\u0011sdMd_3Us#ER$", ":nP1>,R4#\fhb.\u0006z3t\u0003\u0005\u007fJ\t\u0017&Ts\f", "/bc6i0Mg", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D5{/;~\u001a=a\u0019", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW S)?a}/Dq\u0014\u0014MW&g8+\u0003FnM\u0012r6P\u0004#ROb\nXYy:\u0010\u0010`c", "1na2 (GR&\t~]s\u000b\b5_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class CryptographyManager implements TSCryptographyManager {
    public static final CryptographyManager INSTANCE = new CryptographyManager();
    private final /* synthetic */ TSCryptographyManagerImp $$delegate_0 = TSCryptographyManagerImp.INSTANCE;

    private CryptographyManager() {
    }

    @Override // com.ts.coresdk.crypto.TSCryptographyManager
    public String decrypt(Context context, String str, ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        return this.$$delegate_0.decrypt(context, str, iTSModuleInfo);
    }

    @Override // com.ts.coresdk.crypto.TSCryptographyManager
    public String encrypt(Context context, String str, ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        return this.$$delegate_0.encrypt(context, str, iTSModuleInfo);
    }

    @Override // com.ts.coresdk.crypto.TSCryptographyManager
    public void loadKeyForSign(Context context, String str, ITSModuleInfo iTSModuleInfo, IKeyPairSCryptographyCallback iKeyPairSCryptographyCallback) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(iKeyPairSCryptographyCallback, "");
        this.$$delegate_0.loadKeyForSign(context, str, iTSModuleInfo, iKeyPairSCryptographyCallback);
    }

    @Override // com.ts.coresdk.crypto.TSCryptographyManager
    public void loadKeyForSignWithBiometric(FragmentActivity fragmentActivity, String str, ITSModuleInfo iTSModuleInfo, IBiometricKeyPairSCryptographyCallback iBiometricKeyPairSCryptographyCallback) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(iBiometricKeyPairSCryptographyCallback, "");
        this.$$delegate_0.loadKeyForSignWithBiometric(fragmentActivity, str, iTSModuleInfo, iBiometricKeyPairSCryptographyCallback);
    }
}
