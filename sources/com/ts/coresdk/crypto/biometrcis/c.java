package com.ts.coresdk.crypto.biometrcis;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.ts.coresdk.crypto.SignatureAuthenticator;
import com.ts.coresdk.crypto.SignatureAuthenticatorResult;
import com.ts.coresdk.crypto.logic.CryptographyActionError;
import java.security.Signature;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0005$4\u0012\u000e\u0007|ʑW/tev5\u000bR)Opڷ8&a)\u007fI\u0004n(\u0001:\t}P\u0018k|Kr\u000bq\u000fLǵ7Ό+կǤ|_\u0018\u0012@FĦ?5UoCP"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi5C", RemoteSettings.FORWARD_SLASH_STRING, "\u001aiPCTuLS\u0017\u000f\bb;\u0011R\u001di\u00021wO\u0011$\u0017\u001d", ">/", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\"UaG\u0017j;$", "/tc5X5MW\u0017z\n^\u001a\u0001\u000b8a\u000f8\t@", "uKY.i(\ba\u0019|\u000bk0\f\u001dxS\u0004*\u0005<\u0010'$GEtB\u00014<]\u0007i5w#8]R?t4,^FkB\u0016g5^r6KVW\u0002 9w9%\u000e$\u0015J4\u000fNC>)nBFt", "\nh]6g\u0005", "u(E", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\">"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class c implements SignatureAuthenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18276a = new a(null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0006DLc\u0003İGّ1!Ǟr~P-R~\rfʴ=2JdV."}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi5,\u0012\u0004", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ts.coresdk.crypto.SignatureAuthenticator
    public Object authenticateSignature(Signature signature, Continuation<? super SignatureAuthenticatorResult> continuation) {
        return new SignatureAuthenticatorResult.Failure(new CryptographyActionError.Other("Not supported", null));
    }
}
