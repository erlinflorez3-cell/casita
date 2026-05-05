package com.biocatch.client.android.sdk.collection.collectors.elements;

import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.collection.collectors.elements.ElementEventModel;
import com.biocatch.android.commonsdk.collection.collectors.elements.ElementEventType;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.FeatureFlow;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000fq{<$q$yCAV\"}8\tWNmhvJp\u000bK\u000f\u001c\u0016\u0001jBI]ތe\u0012\u001d>JoE4UoK9hҚ>\u000562*8\u007f\u0006\u0007ɝ@Ϻ@|\u000bE[\f@0nojR;NE5\"\nL\"\u0019\u001e\u000bj^:Vpu:](\u0013mPT?_^\u0004֔\u0011Fb/U\u0005o7C@eOE)a\u001e\u001fR\n[IS:C\u0013\u0006?'Yc:k~^\u000e2-+}'$\u0007vn\u0013Zx\fU5\u00068\"\u05cb\u0010߭{~\u0014\u000fB\u000f\u001c\u0012wZ<:2f6\u001ciIIԶBг\u0006bZ\u0002\u0001pD'u\u0018A<Q'vSq;GaG}\u0015\rL7/\u0001wſV\u05f8d\u0015#ƘHc?fX=vd@.\u0014о\u0006Ͳf\u0006B\u00066^\u000eGL\u001d<\u0019=7\n<yܬmɘLDoϸݼd\b"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[:\u0015N3\r\u000eh!5nMF-e6P\t;f\u0010\u0016#c", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pGSN4\\[\u0002K]qa\u000eV+\u0016\u00149R$wS\u001f)\u0007,PW", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[:\u0015N3\r\u000eh!5nMF\t\u0005:I\u000fLh\u000ea", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "7m_Bg\fOS\"\u000e\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[>\u0017Y;\u001cdjA-}R\r", "4nRBf\nAO\"\u0001z", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[;\u0018L;\u001bb\\=-pD\r", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAz\u0016w=R?rBs{fkAP`0Xt#VJQuZYv=\u001d!$\nW*\u001a\u000f]@m|C=h\u00066P\t;f\u0010\u0010 \u0017~hzI]\u0010E\t\u001f\u0003OrhMYgyPPS,\u000em\u0017o,<K:-#\u007fn\u0002fZ6SxW\u001bpN\tej\u0011\u0017\u0002<$G|%BNnbFx&hYz}[0b{2t+\u001384?.\u0003Un\u001f>\\\b\u001f9j\u000b'-6D\u0013HZq?MH\fx-?\u000b\nk71n)V", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "3kT:X5M3*~\u0004m:_\u00136d\u007f5", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Pm\u001eI\u0004%>h`\u001cEp}*X\u0019", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pGSN4\\[\u0002K]qa\u000eV+\u0016\u00149R$wS&3\u0013,\u001f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w.C7zD+\u0015IhC\u00199", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "<nc6Y@\u001eZ\u0019\u0007zg;\\\u001a/n\u000f", "", "2`c.", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[:\u0015N3\r\u000eh!5nMF}\u0004;EW", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ElementEventsCollector extends ContinuousCollector<ElementEventModel> implements ElementEventObserver {
    private final ConcurrentHashMap<ElementEventType, FeatureFlow> elementEventsHolder;
    private final Utils utils;

    public ElementEventsCollector(Utils utils, InputEvents inputEvents, FocusChange focusChange) {
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(inputEvents, "inputEvents");
        Intrinsics.checkNotNullParameter(focusChange, "focusChange");
        this.utils = utils;
        ConcurrentHashMap<ElementEventType, FeatureFlow> concurrentHashMap = new ConcurrentHashMap<>();
        this.elementEventsHolder = concurrentHashMap;
        concurrentHashMap.put(ElementEventType.INPUT, inputEvents);
        concurrentHashMap.put(ElementEventType.FOCUS, focusChange);
        inputEvents.addListener(this);
        focusChange.addListener(this);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.ElementEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isElementsEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "elementEvents";
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.elements.ElementEventObserver
    public void notifyElementEvent(ElementEventData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        long currentEventId = getCurrentEventId();
        addToQueue(new ElementEventModel(Integer.valueOf(getContextIDCache().get()), Long.valueOf(currentEventId), this.utils.currentTimeMillis(), null, data.getType(), data.getHash(), null, Integer.valueOf(data.getLength()), data.getElementValue(), 72, null));
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Element events collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Element events collector is already started. Aborting the start operation.");
        }
        Iterator<FeatureFlow> it = this.elementEventsHolder.values().iterator();
        while (it.hasNext()) {
            it.next().start();
        }
        setStarted(true);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        Iterator<FeatureFlow> it = this.elementEventsHolder.values().iterator();
        while (it.hasNext()) {
            it.next().stop();
        }
        setStarted(false);
    }
}
