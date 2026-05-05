package com.transmit.authentication.network.startauth;

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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4I\u0007\":\u001b\u007f\u0007ljA0RkP.XS0Ŧq\u0012éT[Rp\u0004Pe\u001e\f\"!O|hwtX\\#E%\u0005Dy̶0Ic{&\u0019\u001d9Zom4\u0014ە>\u0002i\u0003>\u001d\"H!fzKі\u001bre\u001e\u007f\u0013CyÈB6FpHR%M3\u001bB\u000eD \u000f tid5vm$Ǆ.k\u0014wLf'\u000e;-S\u001bRl)#u\u0010\u001dqÿ8}\u001c3`\u001b\u0007\u0001i\u0006Ƹ>:D\u0013w?'YJ:ʥ5)\u000f\"\u0015CO;^ę*b\rĩx\u000e-/]h\u001ca\u001c*\u0010|\u0012\fj\u0005؝\n-P͓E\u001cl\u000e\u001c8Ϩvc"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?Hz0.$k+'\u0016_9]R7VON5kVp9#\u0016d\u00179'!\fc=#D", "", "1kX2a;8W\u0018", "", "CrT?a(FS", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "5dc\u0010_0>\\(x~]", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\"f,K\\\u0015\u0007z", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class StartAuthenticationPayload {
    private final String client_id;
    private final String username;

    public StartAuthenticationPayload(String client_id, String str) {
        Intrinsics.checkNotNullParameter(client_id, "client_id");
        this.client_id = client_id;
        this.username = str;
    }

    public static /* synthetic */ StartAuthenticationPayload copy$default(StartAuthenticationPayload startAuthenticationPayload, String str, String str2, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = startAuthenticationPayload.client_id;
        }
        if ((i2 & 2) != 0) {
            str2 = startAuthenticationPayload.username;
        }
        return startAuthenticationPayload.copy(str, str2);
    }

    public final String component1() {
        return this.client_id;
    }

    public final String component2() {
        return this.username;
    }

    public final StartAuthenticationPayload copy(String client_id, String str) {
        Intrinsics.checkNotNullParameter(client_id, "client_id");
        return new StartAuthenticationPayload(client_id, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartAuthenticationPayload)) {
            return false;
        }
        StartAuthenticationPayload startAuthenticationPayload = (StartAuthenticationPayload) obj;
        return Intrinsics.areEqual(this.client_id, startAuthenticationPayload.client_id) && Intrinsics.areEqual(this.username, startAuthenticationPayload.username);
    }

    public final String getClient_id() {
        return this.client_id;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int iHashCode = this.client_id.hashCode() * 31;
        String str = this.username;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "StartAuthenticationPayload(client_id=" + this.client_id + ", username=" + this.username + ")";
    }
}
