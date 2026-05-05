package com.ticnow.sdk.idnowsecurity.http.response;

import com.google.gson.Gson;
import com.ticnow.sdk.idnowsecurity.http.nodes.User;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005(4\u0012\u000e\u0007nj?4Z͜x.\u0001Rj\u0012ө\u007f42[luQKm\u001a,$Yg\\h\u007fnx\\aÃ\u001bو\u001a\u0005rߚaW~` \u0013RDuDAS@UGg\r63\"\tĹDѩ\t\r\"ݒ`\u0012|\u0003QO,\u00146I~@#%[\u000f2\u00124IvҼJ֔kZ>ԟ\u0005_@;1\u0010\nDT5m?ƐQ\u001e"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gulj8vq,[S;%YN+\\[\u0002A\u0010\u0019hzN9\u0018\u000fbO$D", "", "u(E", "1nS2", "", "5dc\u0010b+>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0010b+>", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "2db0e0Ib\u001d\t\u0004L;\n", "5dc\u0011X:<`\u001d\n\nb6\u0006v>r", "Adc\u0011X:<`\u001d\n\nb6\u0006v>r", "CrT?", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005[B\u001e\">", "5dc\"f,K", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_7WB;y}\u000e#hn\u000f", "Adc\"f,K", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7\u001f8LCI5$,\u0015u7|w", "Bn9@b5", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class FindUserByCredentialsResponse {
    private String code = "";
    private String descriptionStr = "";
    public User user;

    public final String getCode() {
        return this.code;
    }

    public final String getDescriptionStr() {
        return this.descriptionStr;
    }

    public final User getUser() {
        User user = this.user;
        if (user == null) {
            Intrinsics.throwUninitializedPropertyAccessException("user");
        }
        return user;
    }

    public final void setCode(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.code = str;
    }

    public final void setDescriptionStr(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.descriptionStr = str;
    }

    public final void setUser(User user) {
        Intrinsics.checkParameterIsNotNull(user, "<set-?>");
        this.user = user;
    }

    public final String toJson() {
        String json = new Gson().toJson(this);
        Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(this)");
        return json;
    }
}
