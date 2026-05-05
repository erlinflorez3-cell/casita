package com.biocatch.client.android.sdk.core.context;

import android.app.Activity;
import com.biocatch.android.commonsdk.core.context.IContextIDCache;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.backend.BackendService;
import com.biocatch.client.android.sdk.core.ActivityCache;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.events.ContextChangedEvent;
import java.util.Arrays;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{B$cҕyCIa\"Ԃ(ޛeȞ\u0018g\u001dI\u001b.S\u0013\u0014\u0016\u0011jZJe|k\u0014'2prO7[sU9\u000fyF\t.8:8(\fв\u001e*V\u0018?\u0007QT$\u0012^J!>`\u0018e\u0005H\u001eVJ.\u00016\\\u0016O\rԢnҺ>/+Ʌ:N\\+w0+RcЂVܮ\u0011viӜ{LE7-%\u0002\u0006]ѻ]ύ\u0007?yܵUt5-CI\"^\rݜ\u0002Џ\u0019+WՕǇv3"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wKMDz41$2?C\u0010r,a\u0006\u0015GY_0ZRH", "", "/bc6i0Mgvzxa,", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w)AJoE\"$|?5\u0005f,$", "1n]AX?M7w\\v\\/|", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_,WLJkG-^L?C\u0010r,a\u0006\u000b&*J*_RH", "0`R8X5=A\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005H0\u001c\u001bhj8tc9_z%G\"", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017\u001f9z8/\u0019wu\u0017\u0003a/NL\u000eEVVuYV|;\u0010!X\u0011\u0018'\u0016\u0004fK(m\u000e5)\u00104S\u000bIg\u0007U\u0014\u0018Bj:@`\u0019Vy(\u0005\u000b\rFPbnyZP)A\b`\nb\u001d2!8.\u001c;\u0016\u001frN*\u0019yVZpY}gpVbvA#Kw_E\u000f}TB>$\u001bI\u0002w\u001b1\"Q'r3\u0004=)$d\u0012\\k\u0016>4_\u00136d\u000b$*@:\u000fNIf?hG\ru)e\u0007W`?9!onqG\u0015Pl\u0017Y8jc~3Ys>V\u0001\u0019%F\r\f[\u000b\u0015\u0012\u001627EZC$c]*~2\"l\"\u0007\u0001fm_\u001f", "1gP;Z,\u001c]\"\u000ezq;", "", "1n]AX?M<\u0015\u0007z", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ContextService {
    private final ActivityCache activityCache;
    private final BackendService backendService;
    private final IContextIDCache contextIDCache;
    private final EventBusService eventBusService;

    public ContextService(ActivityCache activityCache, IContextIDCache contextIDCache, BackendService backendService, EventBusService eventBusService) {
        Intrinsics.checkNotNullParameter(activityCache, "activityCache");
        Intrinsics.checkNotNullParameter(contextIDCache, "contextIDCache");
        Intrinsics.checkNotNullParameter(backendService, "backendService");
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        this.activityCache = activityCache;
        this.contextIDCache = contextIDCache;
        this.backendService = backendService;
        this.eventBusService = eventBusService;
    }

    public final void changeContext(String contextName) {
        String localClassName;
        Intrinsics.checkNotNullParameter(contextName, "contextName");
        if (contextName.length() == 0) {
            Log.Companion.getLogger().error("Received an invalid empty context name. Context change operation has failed.");
            throw new InvalidOperationException("Context Name can not be empty");
        }
        this.contextIDCache.increment();
        this.backendService.changeContext(contextName);
        Activity activity = this.activityCache.get();
        if (activity == null || (localClassName = activity.getLocalClassName()) == null) {
            localClassName = "none";
        }
        this.eventBusService.publish(new ContextChangedEvent(localClassName, contextName));
        Log logger = Log.Companion.getLogger();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("Context changed to %s", Arrays.copyOf(new Object[]{contextName}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        logger.info(str);
    }
}
