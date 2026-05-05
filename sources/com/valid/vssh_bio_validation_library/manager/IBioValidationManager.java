package com.valid.vssh_bio_validation_library.manager;

import com.valid.vssh_bio_validation_library.utils.EnumBioAuthenticationResult;
import com.valid.vssh_bio_validation_library.utils.model.EnumAction;
import java.util.ArrayList;
import java.util.Map;
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
@Metadata(bv = {1, 0, 3}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\r+4\u0012}\u0007njG6L͜P.`_2\u000fq{<$q$yCQU\"}(\tWNu\nvJ`\u000fK\u000f\u001c\u0016\u0001̓4Ikxe܈\u0015\u0017Xģo3{n\u0006GntN\u0005N3R<\b\u0007\u0019\u001aXKV\u001bCYY\u0010*0nqjV\u001bR\u001d\u001a@\fn$\u000f%tg|>\u000f\u0011&X=,\u001bipOWs>\u0007e\u001dVV7\r%gL6)=E\u00175S1\r1g\u0006'\b\fK\u0012\u0001'U,y\u0004eDp\f$\u0017;O;e\u0003(l\u0005\u007f_:6qs,Y^\u001e@w)|=@\u0012\u001f\u001e'v1s>/\u0016\u001cE\rr\u0002A\u0001\u0006lU\u0018z\u00109]IHY9M3f\u007fbk\u001d\\L\u0014\u0005;4S\u0005|8sT<xE\u001fb|i1\u007fFmL\\\u0011q=\u001c\f7\u0007͌.\u001d"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017K7t0 \u0015u+\u001dcg6?r.KKJ;`\\{%\u0010\u001bV\u0010N8b", "", "2d[2g,\u001dO(zhZ-|\u0010C", "", "2d[2g,+S'\n\u0005g:|", "", "5d]2e(MSw~\bb=|n/y", "AsPAh:\u001c]\u0018~", "", ";db@T.>", "", "5dc\u000f\\6FS(\f~\\\u000fx\u0016.w{5{/\u0015\"\u0017U", "=oc6b5L", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "5dc\u0011T;:A\u0015\u007fze@", "2`c.", "", "Adc\u0011T;:A\u0015\u007fze@", "A`e2F;:b)\r", "D`[6W(MSx\u0012~l;j\t-u\r(Z<\u0010\u0013", "AsPAh:", "D`[6W(MS{z\b]>x\u0016/B\u00042\u0004@\u0010$\u001bE", "3md:F;:b\u0019", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^HjI\u000f@0XR7VON5kVp9#\u0016d\u0017;+\u001b\u0015`Py", "/bc6b5", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^pk8\u0007ju.\u007f7O(L;`\\{\u0013", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public interface IBioValidationManager {
    void deleteDataSafely(boolean z2);

    void generateDeriveKey(int i2, String str);

    void getBiometricHardwareTypes(ArrayList<Integer> arrayList);

    void getDataSafely(Map<String, ? extends Object> map);

    void setDataSafely(boolean z2);

    void validateExistSecureData(boolean z2);

    void validateHardwareBiometric(EnumBioAuthenticationResult enumBioAuthenticationResult, EnumAction enumAction, int i2, String str);
}
