package com.biocatch.client.android.sdk.contract.externalCollectors.continuousCollectors.elements;

import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.Group;
import com.biocatch.android.commonsdk.collection.collectors.elements.ElementModel;
import com.biocatch.android.commonsdk.collection.collectors.touch.TouchLocation;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.masking.CoordinatesMaskingService;
import com.biocatch.android.commonsdk.core.masking.TextMaskingService;
import com.biocatch.android.commonsdk.di.SdkInjectorKt;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.contract.externalCollectors.ContinuousCollectorEx;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012}\bnjO0LeN/ZS@\u000fs{:'c$\bCCU \u007f*\t]ZogtKb\u000bY\u000f\u000e\u0016~o4Ikxe܈\u00172PuG3SuE9n}>\u0005&2*8\b\u0005\t\u001a0J\u0016\u001b\u0011ŏ{\u0012\"2PphR;LE\u001dŪ\n>.\u0002frulNH\u001bsj31\"\u0002B|=\u00104\u000bm%F\u0003=Sv*49aO5CG\u0004\u0007\u0015us?1c\"A\u0013\u000e?'Ym:W~f\u000e:-+}#\u000ev4|\u001dQ\u000f\"m+\u0018\u0002Yw&(&\u0011,\u0011J,&\u0006U^^1(\u0007 \u000ea\u000b#WNy\u001a^p$Aa~=3*K+g1\u0017Uof1Ne\u00125\u0011,C\u0019nOq\u0005\u0012nA3T&~aUNk`N8\u0007\u0004mL~p1B\u0004^w03\nBF\u0017S7\"Mk'y4`D\u0016'Kt1Yw\u0006`@P\u001f\\Kz\u001b\u001a\\\\d3n\u0007)/£\u0013ܖ X\u001f\u007f\u000e\u0017.aHN/+(N}o ?$ρ\fɻ3jO[ts\u001c`\nwA?ic>l\t7j̶ֿbۖ\\pJU\u0012hj7:4Nv\u001e\u0005L]\\\u001c+2m\u0003Rt\u0003վǎ\\ČL\r&DG\u0011\u0017nrj\u0016\u0011bFt\u0015w9\r\t/f\u0013EFζzͅ0\u0001x$3X_Mi?c;\u00014+==?JÕýg֙KVt\u0018{r\n/.\u001c?l=Yш\u00133"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<;\u001e\u001bi\u0012W;\u0017\u0015g\u001f.uK7\u001d\u00176V\u0010\u0005h\b\f\u001e\u000e>y~\f6\u0017G\u0002\u0015~P7FP`fyEPOo\nwa", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<\u001b\u001e\u001bi\u0012W;\u0017\u0015g\u001f.uK7\u001d\u00176VaN>", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<;\u001e\u001bi\u0012W;\u0017\u0015g\u001f.uK7\u001d\u00176V\u0010\u0005h\b\f\u001e\u000e>y~\f6\u0017G\u0002\u0015~P\u0011rEYfYZ\u0017", "u(E", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "5dc\u0010b5?W\u001b\u000f\bZ;\u0001\u00138R\u007f3\u0006N\u0005&!T\u0004", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001f/QEKx0-\u0019rj\u0003dm5Oz)WYJ;`\\{*\u0014\u001dd\u001cR:\u0017\u0012m\u0017", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+UFo\u0015<x!DY", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "1n^?W0GO(~\tF(\u000b\u000f3n\u0002\u0016{M\u0012\u001b\u0015G", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^FkC\u0014b0Wr6GZ6(jXvF\u0016\u007fZ\u001b_/\u000b\u0005/", "5dc\u0010b6KR\u001d\bvm,\u000bp+s\u0006,\u0005Bn\u0017$Xs\f<", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w#.\u0017K7y:\"\u001ej+\u0017\u0011m9Mz0C[N:DN\u0001C\u0018\u001b\\{N8\u001e\tWAy", "1n^?W0GO(~\tF(\u000b\u000f3n\u0002\u0016{M\u0012\u001b\u0015G.\r<}%7U\r ", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "BdgA@(LY\u001d\b|L,\n\u001a3c\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^WaL\u0016K(\\|+PN<,icv;\u0014g", "5dc!X?M;\u0015\r\u0001b5~v/r\u0011,y@", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w#.\u0017K7y:\"\u001ej+(\u0007v;6r5MPW.JR\u007fN\u0018\u0010Zc", "BdgA@(LY\u001d\b|L,\n\u001a3c\u007ffz@\b\u0017\u0019C~\u000e", "5dc\u0015\\5M", "6h]A", "@db<h9<S\u0002z\u0003^", "5dc\u0019b*:b\u001d\t\u0004", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pVV^*_\u001caG$\u0010]tX)\t\u0014]K-D", ":dUA", "", "Bn_", "5dc\u001aT:DS\u0018kzl6\r\u0016-eh$\u0004@", "5dc!T.", "B`V\u001bT4>", "3kT:X5MB\u0015\u0001kZ3\r\t\u0017a\u0013\u000f{I\u0003&\u001a", "5dc#T3NS", "D`[BX", "@d\\<i,)`\u001d\u0010vm,[\u0005>a", "", "7rC2k;/W\u0019\u0011", "=m2<_3>Q(~y=(\f\u0005", "", "1n[9X*MW#\b^m,\u0005", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class ElementsCollectorEx extends ContinuousCollectorEx<ElementModelEx> {
    private final Lazy configurationRepository$delegate = LazyKt.lazy(new Function0<ConfigurationRepository>() { // from class: com.biocatch.client.android.sdk.contract.externalCollectors.continuousCollectors.elements.ElementsCollectorEx$configurationRepository$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ConfigurationRepository invoke() {
            return SdkInjectorKt.getCommonInjector().provideConfigurationRepository();
        }
    });
    private final Lazy textMaskingService$delegate = LazyKt.lazy(new Function0<TextMaskingService>() { // from class: com.biocatch.client.android.sdk.contract.externalCollectors.continuousCollectors.elements.ElementsCollectorEx$textMaskingService$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TextMaskingService invoke() {
            return SdkInjectorKt.getCommonInjector().provideTextMaskingService();
        }
    });
    private final Lazy coordinatesMaskingService$delegate = LazyKt.lazy(new Function0<CoordinatesMaskingService>() { // from class: com.biocatch.client.android.sdk.contract.externalCollectors.continuousCollectors.elements.ElementsCollectorEx$coordinatesMaskingService$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CoordinatesMaskingService invoke() {
            return SdkInjectorKt.getCommonInjector().provideCoordinatesMaskingService();
        }
    });

    private final ConfigurationRepository getConfigurationRepository() {
        return (ConfigurationRepository) this.configurationRepository$delegate.getValue();
    }

    private final CoordinatesMaskingService getCoordinatesMaskingService() {
        return (CoordinatesMaskingService) this.coordinatesMaskingService$delegate.getValue();
    }

    private final String getHint(String str, String str2) {
        return TextMaskingService.maskIfEnabled$default(getTextMaskingService(), str2, str, true, false, 8, null);
    }

    private final TouchLocation getLocation(int i2, int i3) {
        return getCoordinatesMaskingService().maskTouch(new TouchLocation(i2, i3));
    }

    private final String getMaskedResourceName(String str) {
        return TextMaskingService.maskIfEnabled$default(getTextMaskingService(), str, str, false, false, 12, null);
    }

    private final String getTag(String str, String str2, int i2) {
        String strSubstring = str;
        if (strSubstring.length() > i2) {
            strSubstring = strSubstring.substring(0, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return TextMaskingService.maskIfEnabled$default(getTextMaskingService(), str2, strSubstring, false, false, 12, null);
    }

    private final TextMaskingService getTextMaskingService() {
        return (TextMaskingService) this.textMaskingService$delegate.getValue();
    }

    private final String getValue(String str, String str2, boolean z2, boolean z3) {
        return getTextMaskingService().maskIfEnabled(str2, str, z2, z3);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.Elements;
    }

    @Override // com.biocatch.client.android.sdk.contract.externalCollectors.ContinuousCollectorEx, com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isElements;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return Group.ELEMENTS;
    }

    @Override // com.biocatch.client.android.sdk.contract.externalCollectors.ContinuousCollectorEx
    public void onCollectedData(ElementModelEx collectionItem) {
        Intrinsics.checkNotNullParameter(collectionItem, "collectionItem");
        try {
            TouchLocation location = getLocation(collectionItem.getLeft(), collectionItem.getTop());
            addToQueue(new ElementModel(Integer.valueOf(getContextIDCache().get()), collectionItem.getHash(), getTag(collectionItem.getTagName(), collectionItem.getElementID(), getConfigurationRepository().getInt(ConfigurationFields.elementTagValueMaxLength)), getMaskedResourceName(collectionItem.getElementID()), null, collectionItem.getType(), Integer.valueOf(location.getX()), Integer.valueOf(location.getY()), Integer.valueOf(collectionItem.getWidth()), Integer.valueOf(collectionItem.getHeight()), null, null, getHint(collectionItem.getTooltip(), collectionItem.getElementID()), null, null, getValue(collectionItem.getElementValue(), collectionItem.getElementID(), collectionItem.getRemovePrivateData(), collectionItem.isTextView()), System.currentTimeMillis(), null, 158736, null));
        } catch (Throwable th) {
            Log.Companion.getLogger().error("Element masking failed, disregarding the element data", th);
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Elements collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Elements collector is already started. Aborting the start operation.");
        }
        onStart();
        setStarted(true);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        setStarted(false);
    }
}
