package com.ticnow.sdk.idnowsecurity.http.response;

import com.google.gson.Gson;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005(4\u0012\u000e\u0007njO0Le^.ZS0\u0018s{B-c$wCQ٥J}P\b\u0010Q˗knXZSG\u001d\u001e.x\u0019E\u0012Y\u0007w*\u000f`D@WAN\b=gbKȉ\u0011ڶ6.@ц\u001d\u0003 -V\u0014\u0017|IP\u001a\u0018\u0001X~Aj\r{\u0007pŎ\u0012̧$\r&ձ\u007fP<PzaZ1)\fwH\u001fOm:\u0015]\u001dHd';\u0003\u0010)\u0014FG7%%\u0002\u000fe_2α/ӭuI\rؒ?)1W\u0002fVZ\u0006$#< %k\u0005>\\3S7϶3˦SoSִ&*}\u000e\n\u0011\\\u0006\u0014\u001a5N~E({ \u000eavIԦLг\u0006jJȕ\u0013c<-3\u0004S-?2tWŎ?4"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gxqeHfl9X}.OLW;IR\u0001H\u001e\u001bh\u000e$", "", "u(E", "1nS2", "", "5dc\u0010b+>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0010b+>", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "2db0e0Ib\u001d\t\u0004L;\n", "5dc\u0011X:<`\u001d\n\nb6\u0006v>r", "Adc\u0011X:<`\u001d\n\nb6\u0006v>r", "3me6e6G[\u0019\b\nl\u0017x\u0016+m\u000e", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "5dc\u0012a=B`#\b\u0003^5\f\u0017\u001aa\r$\u0004N", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u0012a=B`#\b\u0003^5\f\u0017\u001aa\r$\u0004N", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "AdaCX9\u001e\\&\t\u0002e4|\u0012>K\u007f<", "5dc X9OS&^\u0004k6\u0004\u00107e\t7a@\u0015", "Adc X9OS&^\u0004k6\u0004\u00107e\t7a@\u0015", "CtX1G9:\\'zxm0\u0007\u0012", "5dc\"h0=B&z\u0004l(z\u00183o\t", "Adc\"h0=B&z\u0004l(z\u00183o\t", "7r4;i0K]\"\u0007zg;\u000bs+r{0\n$\n\u001b&Kk\u0015@\f%4", "", "Bn9@b5", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class InitEnrollmentResponse {
    public ArrayList<KeyValue> environmentsParams;
    private String code = "";
    private String descriptionStr = "";
    private String serverEnrollmentKey = "";
    private String uuidTransaction = "";

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowsecurity.http.response.InitEnrollmentResponse$isEnvironmentsParamsInitialized$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    final /* synthetic */ class AnonymousClass1 extends MutablePropertyReference0 {
        AnonymousClass1(InitEnrollmentResponse initEnrollmentResponse) {
            super(initEnrollmentResponse);
        }

        @Override // kotlin.reflect.KProperty0
        public Object get() {
            return ((InitEnrollmentResponse) this.receiver).getEnvironmentsParams();
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public String getName() {
            return "environmentsParams";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(InitEnrollmentResponse.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public String getSignature() {
            return "getEnvironmentsParams()Ljava/util/ArrayList;";
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(Object obj) {
            ((InitEnrollmentResponse) this.receiver).setEnvironmentsParams((ArrayList) obj);
        }
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescriptionStr() {
        return this.descriptionStr;
    }

    public final ArrayList<KeyValue> getEnvironmentsParams() {
        ArrayList<KeyValue> arrayList = this.environmentsParams;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("environmentsParams");
        }
        return arrayList;
    }

    public final String getServerEnrollmentKey() {
        return this.serverEnrollmentKey;
    }

    public final String getUuidTransaction() {
        return this.uuidTransaction;
    }

    public final boolean isEnvironmentsParamsInitialized() {
        return this.environmentsParams != null;
    }

    public final void setCode(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.code = str;
    }

    public final void setDescriptionStr(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.descriptionStr = str;
    }

    public final void setEnvironmentsParams(ArrayList<KeyValue> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.environmentsParams = arrayList;
    }

    public final void setServerEnrollmentKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.serverEnrollmentKey = str;
    }

    public final void setUuidTransaction(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.uuidTransaction = str;
    }

    public final String toJson() {
        String json = new Gson().toJson(this);
        Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(this)");
        return json;
    }
}
