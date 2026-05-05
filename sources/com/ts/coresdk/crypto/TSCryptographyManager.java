package com.ts.coresdk.crypto;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.crypto.api.IBiometricKeyPairSCryptographyCallback;
import com.ts.coresdk.crypto.api.IKeyPairSCryptographyCallback;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\u0015\"4\u0012}\u0007njO0LeN/ZS8\u000fs{:$c$\bCCU }*\teNog\u0005JbŏIt\u001cǝ)jZH\u001e\u0019k\u0012'4Xnm4}sK;xtd\bP60<\u0012\u0005/\u001bZL\u001e{\u0013Cy\u0012XT\t\u0011HY%O\u001b\u0019@\u0007n$\u000f tg|9xpkBG#1jrR5dH|{\u0013\rxo7\u0005j6+nAe\u00193U\u001b\u0007\u0001^o\u000bEqK\u0010\u0001)=*wt\b:f\u0005,\u0015YU=a\u00012t\u0005\u007fmRKsyqYh\u000eV\u0002+\u007f\u001bK\u001c\u000e47x63\u001at\u0013&5\u000bq\u0002A\u0001\u0006lG\u0018z\u0010<G)\u000e?C9Iw\u0018\u0006ދ\u001d`"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u00065M\u001bP\u00024?[\u000b\u001cBp*\u0016IL7m4+j", "", "2dR?l7M", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "2`c.G6\u001dS\u0017\f\u000fi;", ";nSB_,\"\\\u001a\t", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", "3mR?l7M", "2`c.G6\u001e\\\u0017\f\u000fi;", ":nP1>,R4#\fhb.\u0006", "", "/kX.f", "1`[9U(<Y", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW \\%IDy$D[s;aNJu6+\u0011sdMd_3Us#ER$", ":nP1>,R4#\fhb.\u0006z3t\u0003\u0005\u007fJ\t\u0017&Ts\f", "/bc6i0Mg", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D5{/;~\u001a=a\u0019", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW S)?a}/Dq\u0014\u0014MW&g8+\u0003FnM\u0012r6P\u0004#ROb\nXYy:\u0010\u0010`c", "1na2 (GR&\t~]s\u000b\b5_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public interface TSCryptographyManager {
    String decrypt(Context context, String str, ITSModuleInfo iTSModuleInfo);

    String encrypt(Context context, String str, ITSModuleInfo iTSModuleInfo);

    void loadKeyForSign(Context context, String str, ITSModuleInfo iTSModuleInfo, IKeyPairSCryptographyCallback iKeyPairSCryptographyCallback);

    void loadKeyForSignWithBiometric(FragmentActivity fragmentActivity, String str, ITSModuleInfo iTSModuleInfo, IBiometricKeyPairSCryptographyCallback iBiometricKeyPairSCryptographyCallback);
}
