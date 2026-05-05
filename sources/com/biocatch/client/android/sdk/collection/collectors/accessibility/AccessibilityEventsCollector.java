package com.biocatch.client.android.sdk.collection.collectors.accessibility;

import android.view.accessibility.AccessibilityManager;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.accessibility.AccessibilityService;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
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
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{J$c$wDCU0}*\tUOog|Vb\u000bI\u0010\u000e\u0016\u0007j4կ]xk\u001b\u00172HtE\u074ccڎm?pvF\u0005N2P7*\u0005/\u001bZH>x;V[\u0010 3XphV\u001dQ\u0013\u001f*\u0006l&Ә\"\\uU~VzqR/Q\u0018\u001aF\\=w0+dSZ\u001d5\u001b\u000fy\u001eYUg9#;k\u00035i\"SKU\u007fV\u001dhU<[M\u0002qNX.+E/](urTsKQ)\u00125GgcyeT<@\u0001\n*T\u0004<\u001bm\\~9(i \u000eaxIԢBг\u0006^JȕKsD\u001f=\u007fa4oo=϶cޅ\u001dRO}\u000b\u0017,.Q\u0001/gl\u000e\u000f\"Q)NΚ3ҨDA`P\u0010gK|T\u0003p\u0012B\u0004^X6\u0004R\u00940ϲ);s;)3y\u0015\u0019Pu{\u001d`\u0017Y@ɰJغ&n\u001eճҐ\r*"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HL*\\`\u0001A\u0011\u0016a\u0012]?V`W?$|R;\u001c\f3M\u0011OH\u0012\f\u001f\u001dCHzI]\u0010E\t\u001f\u0003\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HL*\\`\u0001A\u0011\u0016a\u0012]?V`W?$|R;\u001c\f3M\u0011OH\u0012\f\u001f\u001d\u001dtoB]e", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROS0'\u0011jaFER6^t*'_Y3f_nL\u0018\u001cc{]'\u001c\u00057D wF7\u0006\f:X\u0002Dh\u000ea", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROS0'\u0011jaFE?*Lv5UPK0cV\u0002Q\u0002!V\u001dN\t\u0010\u0001bC$UHE.\b5I\u000f\u0011", "/bR2f:BP\u001d\u0006~m@j\t<v\u0004&{", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wIA9kB,\u0019ee@\u000br@\u0018R%EL\\:`OvD\u0018!n{N8\u001e\tWAy", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017?9i4,#l^=\u000eg;b@\u0003EJN:jVoA\u001b\u0016i\"<+\u001a\u0016]?$D+5)\u0010uF\u0006Ef|\u001b\u0014\u0011~fyAc\u001aKx^sK1pPbmxM\u000bCl7dUO,`AHyWb", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "=m00V,La\u001d{~e0\f\u001d\u001dt{7{\u001e\u0004\u0013 Io\r", "", "3mP/_,=", "", "=mC<h*A3,\n\u0002h9x\u00183o\t\u0016\u000b<\u0010\u0017tJk\u0017>v$", "Ad]14*<S'\r~[0\u0004\r>y_9{I\u0010", "7r00V,La\u001d{~e0\f\u001d\u001dt{7{ \n\u0013\u0014No\r", "7rC<h*A3,\n\u0002h9x\u00183o\t\b\u0005<}\u001e\u0017F", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class AccessibilityEventsCollector extends ContinuousCollector<AccessibilityEventModel> implements AccessibilityManager.TouchExplorationStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener {
    private final AccessibilityService accessibilityService;
    private final Utils utils;

    public AccessibilityEventsCollector(AccessibilityService accessibilityService, Utils utils) {
        Intrinsics.checkNotNullParameter(accessibilityService, "accessibilityService");
        Intrinsics.checkNotNullParameter(utils, "utils");
        this.accessibilityService = accessibilityService;
        this.utils = utils;
    }

    private final void sendAccessibilityEvent(boolean z2, boolean z3) {
        try {
            addToQueue(new AccessibilityEventModel(getContextIDCache().get(), getCurrentEventId(), this.utils.currentTimeMillis(), z2, z3));
        } catch (Throwable th) {
            Log.Companion.getLogger().error("error collecting touch exploration state", th);
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.AccessibilityEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isAccessibilityEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "accessibilityEvents";
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z2) {
        sendAccessibilityEvent(z2, this.accessibilityService.isTouchExplorationEnabled());
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z2) {
        sendAccessibilityEvent(this.accessibilityService.isAccessibilityEnabled(), z2);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() throws Throwable {
        if (isStarted()) {
            Log.Companion.getLogger().error("Accessibility events collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Accessibility events collector is already started. Aborting the start operation.");
        }
        this.accessibilityService.addAccessibilityStateChangeListener(this);
        this.accessibilityService.addTouchExplorationStateChangeListener(this);
        sendAccessibilityEvent(this.accessibilityService.isAccessibilityEnabled(), this.accessibilityService.isTouchExplorationEnabled());
        setStarted(true);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() throws Throwable {
        this.accessibilityService.removeAccessibilityStateChangeListener(this);
        this.accessibilityService.removeTouchExplorationStateChangeListener(this);
        setStarted(false);
    }
}
