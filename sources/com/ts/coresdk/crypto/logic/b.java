package com.ts.coresdk.crypto.logic;

import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tvAӄLeV>Zݷ2\u000f\u0002{<$a&yCQU Չ\"\u001fѧ~g\u0016|\u000ba\u0011CǇ\n\u0018~v:V\u001e4k\u001c'2pxo7[oU9\u000fsf\t.4:8(\u00061 8L(x\u0011By\u000fB4NvRR;R5\u001e \u000eV /%#ɹ\rʝGǍҺ>1)\rwMú'a8|S$"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@\"\u000b", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", ">0", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\">", ">1", "", ">2", "", ">3", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@\u00139[\u0007\u0012;|\u0019\u0014MW(kB.\u001cw7", RemoteSettings.FORWARD_SLASH_STRING, "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"5*fZ<L\"[X\u0018[+\u001b\u0004_\u000b\"{XB.\u0012u7\u0006=q|\u001b&\u001b5F\u0001QY\u0010P\t\u0019s=8rS/F~CRA,1`\u0015afJIG(\u001dsn\u0011E74\u0014\u000bZ\u0015{\u001cwqtQ)\n<->{%$Oxd@}7\u001bZ\u007f\u0002\u001b\b\u001c[0p>\u007f}12m\u0007\u0015Q\u0015C^v$\u0002", "\nh]6g\u0005", "u(E", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014\u001d"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class b extends com.ts.coresdk.crypto.b {
    public static final b INSTANCE = new b();

    static final class a extends ContinuationImpl {
        Object ae;
        Object af;
        /* synthetic */ Object ai;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f18278x;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.ai = obj;
            this.f18278x |= Integer.MIN_VALUE;
            return b.this.a(null, null, null, null, null, this);
        }
    }

    private b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[Catch: GeneralSecurityException -> 0x0114, IOException -> 0x014d, TryCatch #3 {IOException -> 0x014d, GeneralSecurityException -> 0x0114, blocks: (B:12:0x0036, B:21:0x0081, B:23:0x0085, B:24:0x008f, B:26:0x0093, B:27:0x00a2, B:29:0x00a6, B:31:0x00c4, B:33:0x00f0, B:34:0x00f6, B:35:0x00fd, B:37:0x0109, B:38:0x010d, B:39:0x010e, B:40:0x0113, B:16:0x0059, B:18:0x0071), top: B:48:0x0023, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2 A[Catch: GeneralSecurityException -> 0x0114, IOException -> 0x014d, TryCatch #3 {IOException -> 0x014d, GeneralSecurityException -> 0x0114, blocks: (B:12:0x0036, B:21:0x0081, B:23:0x0085, B:24:0x008f, B:26:0x0093, B:27:0x00a2, B:29:0x00a6, B:31:0x00c4, B:33:0x00f0, B:34:0x00f6, B:35:0x00fd, B:37:0x0109, B:38:0x010d, B:39:0x010e, B:40:0x0113, B:16:0x0059, B:18:0x0071), top: B:48:0x0023, inners: #2 }] */
    @Override // com.ts.coresdk.crypto.logic.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(android.content.Context r11, com.ts.coresdk.ITSModuleInfo r12, com.ts.coresdk.crypto.SignatureAuthenticator r13, java.lang.String r14, byte[] r15, kotlin.coroutines.Continuation<? super com.ts.coresdk.crypto.logic.SignWithKeyResult> r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ts.coresdk.crypto.logic.b.a(android.content.Context, com.ts.coresdk.ITSModuleInfo, com.ts.coresdk.crypto.SignatureAuthenticator, java.lang.String, byte[], kotlin.coroutines.Continuation):java.lang.Object");
    }
}
