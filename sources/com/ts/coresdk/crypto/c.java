package com.ts.coresdk.crypto;

import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000ePLcz\u0007I\u0006>\f6B\u0005%4\u0012\u000e\u0007nj?2LeV\u008cX\t@ş\u001c{b4\u0014#u\u0004T[\u001c\u000e&\u0017[fg\u0016mZ`\u0019P'\b,w\u00191֒Yzc \u001dA\u0013\bM7eok8\u0017\n\rӤ$ݨ&B\u0002\u0007\u0007\u001a8I(x\u0001EY\u000fbJNzRT#L3\u001fH\u001b\u0015ŀ\u0005ɉ`qV8NrkAG%\tqPWώ^/\b"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0015\u001d", "", "3qa<e", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", RemoteSettings.FORWARD_SLASH_STRING, "", "/a", "\u001aiPCTuEO\"\u0001DM/\n\u0013Aa|/{\u0016", "6", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", AdkSettings.PLATFORM_TYPE_MOBILE, "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0015\u0006kc", ">/", ">0", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class c {
    private Throwable ab;
    private String error;

    public static final class a extends c {
        private Throwable ab;
        private String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Throwable th) {
            super(str, th, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
            this.ab = th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(getError(), aVar.getError()) && Intrinsics.areEqual(h(), aVar.h());
        }

        @Override // com.ts.coresdk.crypto.c
        public String getError() {
            return this.error;
        }

        @Override // com.ts.coresdk.crypto.c
        public Throwable h() {
            return this.ab;
        }

        public int hashCode() {
            return (getError().hashCode() * 31) + (h() == null ? 0 : h().hashCode());
        }

        public String toString() {
            return "KeyStoreError(error=" + getError() + ", t=" + h() + ")";
        }
    }

    private c(String str, Throwable th) {
        this.error = str;
        this.ab = th;
    }

    public /* synthetic */ c(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    public String getError() {
        return this.error;
    }

    public Throwable h() {
        return this.ab;
    }
}
