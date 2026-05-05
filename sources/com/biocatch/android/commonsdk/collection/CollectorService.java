package com.biocatch.android.commonsdk.collection;

import com.biocatch.android.commonsdk.collection.collectors.Collector;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.logging.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
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
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njGNLeV:Zݷ2\u000fy{<řc$\bCCU }*\t]]ogtKb\u000bQ\u0018\u000e\u0016~j4Ikxe\u0012\u00155JoU3UoC:vҚf\u0005N1bK\n\t\u000f\u001aBH>w\u000bGY\u000e*0nsĐV\r[\tb \u0014F8\u0001Le\u0018RDR\u0005]h:i\u00032Y\\3w0+V=Pb4%|q ;@e@C3٨\u0007\u0007`j\b\u0011M\u0002U\u0007~&U2ywe@p\u007fB s[\u001bn\u000b&\u000b\u0017\u0002d\u001a1CO\u0012V\u0019 6\u000b\u0013{;E4\u0018\u0014;`4=\u001cv\b<H#x\u001cR^\u0018vB.\u0004\u0012@%<\u00189;;+f\u007fli\u001f\u0017I\n\u001d%\u001eQ\n\u001f+im&f%\u001ddw\u007f8\u007fF\u0006X\\$q=\u001c\u0016!j\u00104\u001c4W\u007f5|?I_5EwQ#Ot2PR\u0005\u000f\tphYj\u0001c\u0011.|\u0016O*7\r1ըfʰoP\\А|\u001d[\u001el\u0007,\u000bi\u0601^ʟ@!-ī\u001favn\u0003Sm\f5/\u0015>\btBސcߍb3=ȡӘ\u0014\u007f"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[d'T]R*\\(", "", "1n[9X*M]&kzi6\u000b\r>o\r<", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[c'RV\\0k\\\u007fQi", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAt\u001d.KR?u=grrh@\u0007a;X\u0004\u0014GWX:`a|J(gA\fX3V\u0002]K\"jS5\"Q(R\u0001Hr\u0005\u000b_\f?rxL_\u001eF\u007f^sK2iJ[o\u0007CPIl3.ii&]><4!m(\u001frY\u001b\n\u0007]\u001fva\u0004t{\u001d\\k", "3w_9\\*Bb\u0006~\u0007n0\n\t.C\n1\n@\n&%", "", "", "/cS\u0010b3ES\u0017\u000e\u0005k", "", "1n[9X*M]&", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VU3\\P\u0002G!g", "/cS\u0010b3ES\u0017\u000e\u0005k:", "1n[9X*M]&\r", "", "uZ;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016,6cYr;#\u001cgc\u0012\u001c", "5dc\u001fX8NW&~y<6\u0006\u0017/n\u000f", "7r2<_3>Q(\t\b>5x\u00066e~", "", "@d\\<i,\u001c] \u0006z\\;\u0007\u0016=", "1n[9X*M]&\rih\u0019|\u00119v\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "@d_9T*>1#\u0006\u0002^*\f\u0013<s", "@d_9T*>[\u0019\b\n<6\u0004\u0010/c\u000f2\tN", "Adc\u0012k7EW\u0017\u0003\nK,\t\u00193r\u007f'YJ\n%\u0017P~\u001c", "@d`B\\9>Rv\t\u0004l,\u0006\u0018=", "AsP?g\nHZ ~xm6\n", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "As^=66EZ\u0019|\nh9", "4dPAh9>", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class CollectorService {
    private final CollectorRepository collectorRepository;
    private final ConfigurationRepository configurationRepository;
    private List<String> explicitRequiredConsents;

    public CollectorService(CollectorRepository collectorRepository, ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(collectorRepository, "collectorRepository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.collectorRepository = collectorRepository;
        this.configurationRepository = configurationRepository;
        this.explicitRequiredConsents = new ArrayList();
    }

    private final void addCollector(Collector collector) {
        if (!collector.isSupported()) {
            Log.Companion.getLogger().info("Collection of " + collector.getFriendlyName() + " is not supported. Collector will not be initialized.");
        } else {
            Log.Companion.getLogger().debug("adding feature: " + collector.getFriendlyName() + ", group: " + collector.getCollectorID().getGroupName());
            this.collectorRepository.add(collector);
        }
    }

    public final void addCollectors(Collector[] collectors) {
        Intrinsics.checkNotNullParameter(collectors, "collectors");
        for (Collector collector : collectors) {
            addCollector(collector);
        }
    }

    public final String getRequiredConsent(Collector collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        String consent = collector.getCollectorID().getConsent();
        if (consent == null || !this.explicitRequiredConsents.contains(consent)) {
            return null;
        }
        return consent;
    }

    public final boolean isCollectorEnabled(Collector collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        String strName = collector.getConfigKey().name();
        if (collector.getIExternalCollector()) {
            Log.Companion.getLogger().warning("Ignoring an attempt to disable an external collector: " + collector.getFriendlyName() + " from remote configuration");
            return true;
        }
        if (this.configurationRepository.containsKey(strName)) {
            return this.configurationRepository.getBoolean(strName);
        }
        Log.Companion.getLogger().error("Unable to find collector configuration key " + strName + '.');
        return false;
    }

    public final void removeCollectors(List<? extends CollectorID> collectorsToRemove) {
        Intrinsics.checkNotNullParameter(collectorsToRemove, "collectorsToRemove");
        for (CollectorID collectorID : collectorsToRemove) {
            Collector collector = this.collectorRepository.get(collectorID);
            Log.Companion.getLogger().debug("removing feature: " + collector.getFriendlyName() + ", group: " + collectorID.getGroupName());
            this.collectorRepository.remove(collector);
        }
    }

    public final void replaceCollectors(List<? extends Collector> replacementCollectors) {
        Intrinsics.checkNotNullParameter(replacementCollectors, "replacementCollectors");
        for (Collector collector : replacementCollectors) {
            this.collectorRepository.remove(collector);
            this.collectorRepository.add(collector);
        }
    }

    public final void setExplicitRequiredConsents(List<String> requiredConsents) {
        Intrinsics.checkNotNullParameter(requiredConsents, "requiredConsents");
        this.explicitRequiredConsents = requiredConsents;
    }

    public final boolean startCollector(ContinuousCollector<?> collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        try {
            if (collector.getCollectorID().getCollectionMode() == CollectionMode.ContinuousPerSession) {
                collector.restart();
                return true;
            }
            if (collector.getCollectorID().getCollectionMode() != CollectionMode.Continuous) {
                return false;
            }
            collector.startIfNotStarted();
            return true;
        } catch (Exception e2) {
            Log.Companion.getLogger().error("An error has occurred while starting the " + collector.getFriendlyName() + " collector.", e2);
            return false;
        }
    }

    public final void stopCollector(ContinuousCollector<?> feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        try {
            feature.stop();
        } catch (Exception e2) {
            Log logger = Log.Companion.getLogger();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("An error has occurred while stopping feature %s.", Arrays.copyOf(new Object[]{feature.getFriendlyName()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            logger.error(str, e2);
        }
    }
}
