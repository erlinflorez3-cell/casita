package com.ticnow.sdk.idnowsecurity.http.response;

import com.google.gson.Gson;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import java.io.Serializable;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я.\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nj?3LeV:ZS0\u001bs{B-c$wDQ٥J}P\b\u0010Q˗knXZSG\u001d\u001e.x\u0019E\u0012Y\u0007w*\u000f`[8CAh\b=gjE^\u0013!J2H{\u0015\u0001H-v\u0012_\u0001SM\u001c\u0012^CO>)ҏyŋ\u001e\u001e\u000ē8\u0003$auTVJrdH7s\u001bwKf'\u000e:Sո\u0019ТX3\u0015Ǹy 1KEA5'Y\u0010\u0015`,W\u0011N\n=3r}ݗ7ʁwc>ݙ\u0018\u0016\u001b;]\u0019}t,m\u0013_145=gs[R\u001e(&}*\u000f%\n\u001e\b7H\\0xj^ԋ_Ϣv_HА\u001a`H\u0013\tgV\u0019+\u0014A3\n3tfy;GX\u000eޭ\u0011ڟ\"/\t͙9]Z$n!;V}h?_͞Ad"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gxgJC\u0019A6V~1P9N:g\\{K\u0014g", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "u(E", "/cS6g0H\\\u0015\u0006g^:\b\u00138s\u007f\u0004\u000bO\u000e%", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005Q42\u0006dhI\u00079", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "5dc\u000eW+Bb\u001d\t\u0004Z3i\t=p\n1\n@\\&&T}", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u000eW+Bb\u001d\t\u0004Z3i\t=p\n1\n@\\&&T}", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "1nS2", "", "5dc\u0010b+>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0010b+>", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "2db0e0Ib\u001d\t\u0004", "5dc\u0011X:<`\u001d\n\nb6\u0006", "Adc\u0011X:<`\u001d\n\nb6\u0006", "3me6e6G[\u0019\b\nl\u0017x\u0016+m\u000e", "5dc\u0012a=B`#\b\u0003^5\f\u0017\u001aa\r$\u0004N", "Adc\u0012a=B`#\b\u0003^5\f\u0017\u001aa\r$\u0004N", ">`h9b(=", "5dc\u001dT@E]\u0015}", "Adc\u001dT@E]\u0015}", "7r01W0MW#\bve\u0019|\u0017:o\t6{\u001c\u0010&$US\u0017@\u0006)1`\u000257l", "", "7r4;i0K]\"\u0007zg;\u000bs+r{0\n$\n\u001b&Kk\u0015@\f%4", "Bn9@b5", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IdNowCommonResponse implements Serializable {
    public ArrayList<KeyValue> additionalResponseAttrs;
    public ArrayList<KeyValue> environmentsParams;
    private String code = "";
    private String description = "";
    private String payload = "";

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowsecurity.http.response.IdNowCommonResponse$isAdditionalResponseAttrsInitialized$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    final /* synthetic */ class AnonymousClass1 extends MutablePropertyReference0 {
        AnonymousClass1(IdNowCommonResponse idNowCommonResponse) {
            super(idNowCommonResponse);
        }

        @Override // kotlin.reflect.KProperty0
        public Object get() {
            return ((IdNowCommonResponse) this.receiver).getAdditionalResponseAttrs();
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public String getName() {
            return "additionalResponseAttrs";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(IdNowCommonResponse.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public String getSignature() {
            return "getAdditionalResponseAttrs()Ljava/util/ArrayList;";
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(Object obj) {
            ((IdNowCommonResponse) this.receiver).setAdditionalResponseAttrs((ArrayList) obj);
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowsecurity.http.response.IdNowCommonResponse$isEnvironmentsParamsInitialized$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    final /* synthetic */ class C13141 extends MutablePropertyReference0 {
        C13141(IdNowCommonResponse idNowCommonResponse) {
            super(idNowCommonResponse);
        }

        @Override // kotlin.reflect.KProperty0
        public Object get() {
            return ((IdNowCommonResponse) this.receiver).getEnvironmentsParams();
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public String getName() {
            return "environmentsParams";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(IdNowCommonResponse.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public String getSignature() {
            return "getEnvironmentsParams()Ljava/util/ArrayList;";
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(Object obj) {
            ((IdNowCommonResponse) this.receiver).setEnvironmentsParams((ArrayList) obj);
        }
    }

    public final ArrayList<KeyValue> getAdditionalResponseAttrs() {
        ArrayList<KeyValue> arrayList = this.additionalResponseAttrs;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("additionalResponseAttrs");
        }
        return arrayList;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ArrayList<KeyValue> getEnvironmentsParams() {
        ArrayList<KeyValue> arrayList = this.environmentsParams;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("environmentsParams");
        }
        return arrayList;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final boolean isAdditionalResponseAttrsInitialized() {
        return this.additionalResponseAttrs != null;
    }

    public final boolean isEnvironmentsParamsInitialized() {
        return this.environmentsParams != null;
    }

    public final void setAdditionalResponseAttrs(ArrayList<KeyValue> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.additionalResponseAttrs = arrayList;
    }

    public final void setCode(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.code = str;
    }

    public final void setDescription(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.description = str;
    }

    public final void setEnvironmentsParams(ArrayList<KeyValue> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.environmentsParams = arrayList;
    }

    public final void setPayload(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.payload = str;
    }

    public final String toJson() {
        String json = new Gson().toJson(this);
        Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(this)");
        return json;
    }
}
