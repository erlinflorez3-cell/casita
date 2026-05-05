package com.biocatch.client.android.sdk.events;

import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.collection.CollectorsController;
import com.biocatch.client.android.sdk.collection.collectors.application.ApplicationsService;
import com.biocatch.client.android.sdk.core.brand.BrandService;
import com.biocatch.client.android.sdk.core.session.SessionInfoService;
import com.biocatch.client.android.sdk.techicalServices.events.ClientEventService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yCAU\"}0\tWNmgtϺpŏs\u0015\u0016\u0018\tjZI\u0004w\u001e=\u001f6PpW3{qM=nwN\u0005N62<\b\n\u0019\u001aXN z\tJc\f@8PtH[%M3$Ū\n>.\ffjuZNH\u001bjj31\u0011\u0002B|'&EMY\u001bKl';|8ӟ-Ë;5\u001dǬ$\u000f\u0015[s?1IHܸ\u0007ص+'3ɞDcDY\u0018\u0014C-&\u0558_ę*\\\rĩ1\u00185.gcyTdߍyߡ\u007f\rDǉ^\u00125OF-Hn^ԇ5ϢvSHАمbQ"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r$kF\f\u0015vo=\u0011l\u001a]r4VLM\fmR{Lv\u000ec\rU+\u001aZ", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u001fKE\u001e\u001ewD5\u0010b3N\u0004|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r$kF\f\u0015vo=\u0011l\u001a]r4VLM\fmR{Li", "1kX2a;\u001ed\u0019\b\nL,\n\u001a3c\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G/7k\u00192K?BY4+&l_9\u0015-,_v0VZ\u0018\ncVrF#qk\u000eW:z\u0005fR(lD\r", "1n[9X*M]&\rXh5\f\u00169l\u0007(\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=grrh@\u0007a;X\u00045%VW;i\\yD\u0014\u001f0", "/o_9\\*:b\u001d\t\u0004l\u001a|\u0016@i}(", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u0007\u0018\u0010`E\"jS;)\u0011:7\u0002Hy\u0005\n\u0016c", "Adb@\\6G7\"\u007f\u0005L,\n\u001a3c\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w[CIy8(\u001e2O9\u0015q0X\u007f\u000bPMX\u001a\\_\u0004A\u0012\u00120", "0qP;W\u001a>`*\u0003x^", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wJP7t3gqu]B\u0006Q,[\b+EL$", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004iFm\u00141QA7r\"\u001e\"ye7\u0007quN\b'P[\\u:Yv=\u001d!:\u001fN4\u001crYN5rB7tn*S\n\u0005e\u0005\u0016\u0014\nDhs\fT\u0017Ky\u001e\u0005\u000b%qEfi}F\u000bSa0.\ni$c:83\u0018{\"dFZ5\u0011{Q |_\bEqP(\bB+Emh\u001c,m_D>$#Uys!0[>){1\u0004=9\u007f`\u000eJt\"B]B#+b\u000b%0=C\u0013=Zg\u007fu\b\fr&h\b\fq?>'/anS\u0016\u000b[\u0013j9khJ\u0013]\u0011EMm\u00116J\tKig\u0015\u0016\u0018(ke\u001f*\u0019^\tcmH,]\r\u0012\u0001ia\u001a5\u001a=b\u001e2&h6Z\u001d\rg\u0002\u001az_\r\u0013zU\u00107Yries.?B~I/AOF\u007f6Lp\u001a\u00044\u000e\u001c\u0003\u001bs?)w@\u001bn\"Ac6^o-\u000e1Q)\u001dgA+h):\u0001_Jr]A5\u0014\u0004Wf\u0007\"]\b5\u000f/JH4~I_T\u0004*Z_!0K\u0015\u0005$e", "6`]1_,", "", "3uT;g", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class NewSessionStartedEventHandler implements IEventHandler<NewSessionStartedEvent> {
    private final ApplicationsService applicationsService;
    private final BrandService brandService;
    private final ClientEventService clientEventService;
    private final CollectorsController collectorsController;
    private final SessionInfoService sessionInfoService;

    public NewSessionStartedEventHandler(ClientEventService clientEventService, CollectorsController collectorsController, ApplicationsService applicationsService, SessionInfoService sessionInfoService, BrandService brandService) {
        Intrinsics.checkNotNullParameter(clientEventService, "clientEventService");
        Intrinsics.checkNotNullParameter(collectorsController, "collectorsController");
        Intrinsics.checkNotNullParameter(applicationsService, "applicationsService");
        Intrinsics.checkNotNullParameter(sessionInfoService, "sessionInfoService");
        Intrinsics.checkNotNullParameter(brandService, "brandService");
        this.clientEventService = clientEventService;
        this.collectorsController = collectorsController;
        this.applicationsService = applicationsService;
        this.sessionInfoService = sessionInfoService;
        this.brandService = brandService;
    }

    @Override // com.biocatch.client.android.sdk.events.IEventHandler
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void handle(NewSessionStartedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.Companion.getLogger().info("A new session " + event.getSessionID() + " has started");
        this.sessionInfoService.markStartTime();
        this.applicationsService.reset();
        this.collectorsController.onSessionStarted();
        this.clientEventService.publishNewSessionStarted(event.getSessionID());
    }
}
