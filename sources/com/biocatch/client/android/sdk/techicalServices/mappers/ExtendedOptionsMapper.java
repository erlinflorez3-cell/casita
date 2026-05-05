package com.biocatch.client.android.sdk.techicalServices.mappers;

import com.biocatch.client.android.sdk.backend.communication.http.ExternalHttpClientFactory;
import com.biocatch.client.android.sdk.contract.BCAgentType;
import com.biocatch.client.android.sdk.contract.BCCollectorID;
import com.biocatch.client.android.sdk.contract.BCConsentType;
import com.biocatch.client.android.sdk.contract.BCProtocolType;
import com.biocatch.client.android.sdk.contract.http.ICustomHttpClientFactory;
import com.biocatch.client.android.sdk.core.ExtendedOptions;
import com.biocatch.client.android.sdk.core.exceptions.SDKException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјl˒9FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:OIV2}P\u000b\u007fRuj\u0007J\t\u000få\u0013\u000b"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G/7k\u00192K?BY4+&l_9\u0015-4J\u00022GY\\u<e\u0002=\u001d\u0011Z\r86\u001c\tcJ2V@B*\b9\u001f", "", "u(E", ";`_", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w-VJk=\u001d\u0015gKD\u0016g6W\u0005|", "3wc2a+>R\u0003\n\nb6\u0006\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u00141$hj8\u0007b\u0016Y\u0006+QU\\\u0002", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ExtendedOptionsMapper {
    public static final ExtendedOptionsMapper INSTANCE = new ExtendedOptionsMapper();

    private ExtendedOptionsMapper() {
    }

    public final ExtendedOptions map(com.biocatch.client.android.sdk.contract.ExtendedOptions extendedOptions) throws SDKException {
        ExternalHttpClientFactory externalHttpClientFactory;
        Intrinsics.checkNotNullParameter(extendedOptions, "extendedOptions");
        boolean enableHybridSolution = extendedOptions.getEnableHybridSolution();
        boolean enableCoordinatesMasking = extendedOptions.getEnableCoordinatesMasking();
        if (extendedOptions.getCustomHttpClientFactory() != null) {
            ICustomHttpClientFactory customHttpClientFactory = extendedOptions.getCustomHttpClientFactory();
            Intrinsics.checkNotNullExpressionValue(customHttpClientFactory, "extendedOptions.customHttpClientFactory");
            externalHttpClientFactory = new ExternalHttpClientFactory(customHttpClientFactory);
        } else {
            externalHttpClientFactory = null;
        }
        boolean enableAutoContext = extendedOptions.getEnableAutoContext();
        boolean enableGlobalTouchCollectionMode = extendedOptions.getEnableGlobalTouchCollectionMode();
        List<Integer> restrictedViewGroupList = extendedOptions.getRestrictedViewGroupList() != null ? extendedOptions.getRestrictedViewGroupList() : new ArrayList<>();
        Intrinsics.checkNotNullExpressionValue(restrictedViewGroupList, "if (extendedOptions.rest…roupList else ArrayList()");
        boolean enableElementValuesMasking = extendedOptions.getEnableElementValuesMasking();
        List<String> elementValuesMaskingList = extendedOptions.getElementValuesMaskingList() != null ? extendedOptions.getElementValuesMaskingList() : new ArrayList<>();
        Intrinsics.checkNotNullExpressionValue(elementValuesMaskingList, "if (extendedOptions.elem…kingList else ArrayList()");
        List<String> elementValuesDisableMaskingList = extendedOptions.getElementValuesDisableMaskingList() != null ? extendedOptions.getElementValuesDisableMaskingList() : new ArrayList<>();
        Intrinsics.checkNotNullExpressionValue(elementValuesDisableMaskingList, "if (extendedOptions.elem…kingList else ArrayList()");
        List<String> externalModulesList = extendedOptions.getExternalModulesList() != null ? extendedOptions.getExternalModulesList() : new ArrayList<>();
        Intrinsics.checkNotNullExpressionValue(externalModulesList, "if (extendedOptions.exte…ulesList else ArrayList()");
        List<BCCollectorID> disabledCollectors = extendedOptions.getDisabledCollectors() != null ? extendedOptions.getDisabledCollectors() : new ArrayList<>();
        Intrinsics.checkNotNullExpressionValue(disabledCollectors, "if (extendedOptions.disa…llectors else ArrayList()");
        boolean isAppUsingRengwuxianLibraryCustomComponents = extendedOptions.getIsAppUsingRengwuxianLibraryCustomComponents();
        boolean enableWupMessagesHashing = extendedOptions.getEnableWupMessagesHashing();
        BCAgentType agentType = extendedOptions.getAgentType();
        Intrinsics.checkNotNullExpressionValue(agentType, "extendedOptions.agentType");
        BCProtocolType protocolType = extendedOptions.getProtocolType();
        Intrinsics.checkNotNullExpressionValue(protocolType, "extendedOptions.protocolType");
        List<BCConsentType> explicitRequiredConsents = extendedOptions.getExplicitRequiredConsents();
        Intrinsics.checkNotNullExpressionValue(explicitRequiredConsents, "extendedOptions.explicitRequiredConsents");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(explicitRequiredConsents, 10));
        Iterator<T> it = explicitRequiredConsents.iterator();
        while (it.hasNext()) {
            arrayList.add(((BCConsentType) it.next()).getType());
        }
        return new ExtendedOptions(enableHybridSolution, enableCoordinatesMasking, externalHttpClientFactory, enableAutoContext, enableGlobalTouchCollectionMode, restrictedViewGroupList, enableElementValuesMasking, elementValuesMaskingList, elementValuesDisableMaskingList, externalModulesList, disabledCollectors, isAppUsingRengwuxianLibraryCustomComponents, enableWupMessagesHashing, agentType, protocolType, arrayList);
    }
}
