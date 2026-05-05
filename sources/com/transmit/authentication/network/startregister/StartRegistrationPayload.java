package com.transmit.authentication.network.startregister;

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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4L\u0007\":\u001b\u007f\u0007ljA0RkP.XS0Ŧq\u0012éT[Rp\u0004Xe\u001e\f\"!O|hwrX\\#C=\u0007&~x/aW\u000f\\@\u0010̓FoM7\u0016vKBxtd\u0006fތ#\u0001\u0001\u0013\u000b2*v\u0011=ڠD\u0014\u0015 ;XrPQ;NK\u074c\u0013Ne.\r6\\\u0016ޮfNr]H/;\u0003\u0018C~-e0\u000bO%F\u0003(=~g\u001e9CO7+$\u0002\u0004MҿZ\b\u0014M~U\u0005\u00175W1W\u0003o8n~B\u0014q͔\u000e&y4l\u001dQ\u000f\u001dm̚N,R^ @w)|Sʴ\u0003^\u00155HF-Hgڿ\u00129|ɁkBV\u0007lHP\fo9/'\u00162Y:ӸjWiݢ1P=\u0003\u0013\u0013n2\u000fp9[\u0003\u000f\u05ce\u0019!\\ȭi3WHKNݹ\u000el"}, d2 = {"\u001ab^:\";KO\"\r\u0003b;F\u0005?t\u0003(\u0005O\u0005\u0015\u0013Vs\u0018E@.5h\u0010*Ds_<\\?HzA\u001e\u0017loH\u0007pu<\u0006#T[;,^V\u0001L!\u000ei\u0012X4w\u0001mH.jC\r", "", "1kX2a;8W\u0018", "", "CrT?a(FS", "2hb=_(RM\"z\u0003^", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d\u0010?", "5dc\u0010_0>\\(x~]", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0011\\:IZ\u0015\u0013tg(\u0005\t", "5dc\"f,K\\\u0015\u0007z", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "EdQ.h;A\\`z\u0004]9\u0007\r.-\u000e'\u0002:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 6, 0}, pn = "", xi = 48, xs = "")
public final class StartRegistrationPayload {
    private final String client_id;
    private final String display_name;
    private final String username;

    public StartRegistrationPayload(String client_id, String username, String str) {
        Intrinsics.checkNotNullParameter(client_id, "client_id");
        Intrinsics.checkNotNullParameter(username, "username");
        this.client_id = client_id;
        this.username = username;
        this.display_name = str;
    }

    public static /* synthetic */ StartRegistrationPayload copy$default(StartRegistrationPayload startRegistrationPayload, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = startRegistrationPayload.client_id;
        }
        if ((2 & i2) != 0) {
            str2 = startRegistrationPayload.username;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            str3 = startRegistrationPayload.display_name;
        }
        return startRegistrationPayload.copy(str, str2, str3);
    }

    public final String component1() {
        return this.client_id;
    }

    public final String component2() {
        return this.username;
    }

    public final String component3() {
        return this.display_name;
    }

    public final StartRegistrationPayload copy(String client_id, String username, String str) {
        Intrinsics.checkNotNullParameter(client_id, "client_id");
        Intrinsics.checkNotNullParameter(username, "username");
        return new StartRegistrationPayload(client_id, username, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartRegistrationPayload)) {
            return false;
        }
        StartRegistrationPayload startRegistrationPayload = (StartRegistrationPayload) obj;
        return Intrinsics.areEqual(this.client_id, startRegistrationPayload.client_id) && Intrinsics.areEqual(this.username, startRegistrationPayload.username) && Intrinsics.areEqual(this.display_name, startRegistrationPayload.display_name);
    }

    public final String getClient_id() {
        return this.client_id;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int iHashCode = ((this.client_id.hashCode() * 31) + this.username.hashCode()) * 31;
        String str = this.display_name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "StartRegistrationPayload(client_id=" + this.client_id + ", username=" + this.username + ", display_name=" + this.display_name + ")";
    }
}
