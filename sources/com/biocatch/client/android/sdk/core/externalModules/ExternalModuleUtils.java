package com.biocatch.client.android.sdk.core.externalModules;

import com.biocatch.android.commonsdk.IBCFeature;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.codec.language.Soundex;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјnjG9LeN1ZS@\u000fs{:$qҕ\"CiTZ\u0001̀\rO\\g0|X[#E%\u0005Dz\u001b0WX\u0011]@\u0013zN}DKM\u001eCid\u0003=\u001d `&\u0001\u000e\u0013\t2*v\u0016'~QT$\u0012^D!>`\u0017e\u0005H\u0016NL.\f6^}MdT\u001daH<;\u0003\u0018DĠ+m"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wMVJkA'\u0011oIC\u0006s3N\u0005p'_],i[nD{\u001cY\u001eU+|\u0014]H2D", "", "u(E", "1`bAG6\"0v_zZ;\r\u0016/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wMVJkA'\u0011oIC\u0006s3N\u0005p'_],i[nD{\u001cY\u001eU+p\u000eZKy", "3wc2e5:Z\u0001\tyn3|", "", "7r=B`,KW\u0017", "", "Bn25X*D", "7rE2e:B]\"\\\u0005f7x\u00183b\u0007(", "4dPAh9>1#\u0007\u0003h5m\t<s\u00042\u0005", "AcZ\u0010b4F]\"ozk:\u0001\u00138", "Bqh\u0010e,:b\u0019bW<\r|\u0005>u\r(_I\u000f&\u0013Pm\u000e", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#a|\u0015N\u0016*\\SHk\n", "3wc2e5:Z\u0001\tyn3|l8f\n", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ExternalModuleUtils {
    public final ExternalModuleInfo castToIBCFeature(String externalModule) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(externalModule, "externalModule");
        Class<?> cls = Class.forName(externalModule);
        Intrinsics.checkNotNullExpressionValue(cls, "forName(externalModule)");
        if (IBCFeature.class.isAssignableFrom(cls)) {
            return new ExternalModuleInfo(cls);
        }
        return null;
    }

    public final boolean isNumeric(String toCheck) {
        Intrinsics.checkNotNullParameter(toCheck, "toCheck");
        for (int i2 = 0; i2 < toCheck.length(); i2++) {
            if (!Character.isDigit(toCheck.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public final boolean isVersionCompatible(String featureCommonVersion, String sdkCommonVersion) {
        Intrinsics.checkNotNullParameter(featureCommonVersion, "featureCommonVersion");
        Intrinsics.checkNotNullParameter(sdkCommonVersion, "sdkCommonVersion");
        if (featureCommonVersion.length() == 0 || sdkCommonVersion.length() == 0) {
            return false;
        }
        List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.substringBefore$default(featureCommonVersion, Soundex.SILENT_MARKER, (String) null, 2, (Object) null), new char[]{'.'}, false, 0, 6, (Object) null);
        List listSplit$default2 = StringsKt.split$default((CharSequence) StringsKt.substringBefore$default(sdkCommonVersion, Soundex.SILENT_MARKER, (String) null, 2, (Object) null), new char[]{'.'}, false, 0, 6, (Object) null);
        if (listSplit$default.size() < 2 || listSplit$default2.size() < 2 || !isNumeric((String) listSplit$default.get(0)) || !isNumeric((String) listSplit$default.get(1)) || !isNumeric((String) listSplit$default2.get(0)) || !isNumeric((String) listSplit$default2.get(1))) {
            return false;
        }
        return Integer.parseInt((String) listSplit$default.get(0)) <= Integer.parseInt((String) listSplit$default2.get(0)) && Integer.parseInt((String) listSplit$default.get(1)) <= Integer.parseInt((String) listSplit$default2.get(1));
    }

    public final IBCFeature tryCreateIBCFeatureInstance(ExternalModuleInfo externalModuleInfo) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(externalModuleInfo, "externalModuleInfo");
        IBCFeature iBCFeatureNewInstance = externalModuleInfo.getModuleClass().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        if (iBCFeatureNewInstance == null) {
            return null;
        }
        return iBCFeatureNewInstance;
    }
}
