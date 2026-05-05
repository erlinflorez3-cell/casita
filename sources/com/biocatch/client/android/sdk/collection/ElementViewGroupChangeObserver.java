package com.biocatch.client.android.sdk.collection;

import android.view.View;
import android.view.ViewGroup;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.client.android.sdk.collection.collectors.elements.ReactNativeWorkaroundService;
import com.biocatch.client.android.sdk.di.SdkInjectorKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjGNL͜P.hS2\u000f\u0002{<$q$yّCU(}*\tUQog\u0005Jb\u000bI\u0012\u000e\u0016\u000fj4կ[ތs܈?2pn\u007f6ޜs=G`=B\u0013+J\"f\u00065\u0005(7`\u0010%\u0004\fW\u001a H@\u001fF\u0003\u0011[\u00142\u00124=h\u0017,l\u007fNdT\u001daH@;\u0003\u0018T~+mC\u0015M;X\u001b;U\ro2C@eAE)a\u0014\u001fR\nQ3C\u007fP\u001dhU9q]<eDm\u0018\u0014C7\u007f\u0013k\u0002>^\u001bP\u000f\u000bo7]ycP<4(~\n$T\u0004<\u001ewZ<.2l\u0018\u0010Ct!RnRXތDȸ~a>Ѝu\fA.Q\u001b\u0015U8ݥ\u001b\u05ee;{\rټn3\u000fs9_d\u000ef\u0016IZNΆ=ҨD=PݐZyKt\u001c\u0005r\u0004:\u0004^P\u00109\f\u0019>\u001b59q8Q*\u001a\fvL>ϻ\u0007¾lSqɭ͛D;"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=gtoaA\u0007l;?z'Y.[6l]P@\u0010\u001b\\\u000e8(\u001b\u0005fR${\u001a", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"U1xp@v21f{#KK\u0019*VE;R8,$hj9\u00149", "u(E", ":hbAX5>`{z\ta\u001a|\u0018", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u001de\u000f}", "@dP0g\u0015:b\u001d\u0010zL,\n\u001a3c\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[G\u000eJ)\u001cmUP(\u007fD))\u00152E\u000fEx\n\u000b\u0004\u000eB{t@Ve", "@dbAe0<b\u0019}kb,\u000fj<o\u00103bD\u000f&", "", "DhTD:9Hc$pzZ2j\t>", "\u001aiPCTuNb\u001d\u0006DP,x\u000f\u0012a\u000e+c<\fl", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "/cS#\\,P5&\t\u000bi", "", "DhTD:9Hc$", "/cS#\\,P5&\t\u000bi\u0013\u0001\u0017>e\t(\t", "DhTD:9Hc$e~l;|\u0012/r", "=m25\\3=D\u001d~\r:+{\t.", ">`a2a;", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "1gX9W", "=m25\\3=D\u001d~\rK,\u0005\u0013@e~", "@d\\<i,/W\u0019\u0011\\k6\r\u0014\u0016i\u000e7{I\u0001$", "CoS.g,\u001c]\"\u007f~`<\n\u0005>i\n1", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ElementViewGroupChangeObserver implements ViewGroup.OnHierarchyChangeListener {
    private final WeakHashMap<ViewGroup, WeakReference<ViewGroup>> viewGroupWeakSet = new WeakHashMap<>();
    private final HashSet<ViewGroup.OnHierarchyChangeListener> listenerHashSet = new HashSet<>();
    private List<?> restrictedViewGroupList = new ArrayList();
    private final ReactNativeWorkaroundService reactNativeService = SdkInjectorKt.getSdkInjector().provideReactNativeWorkaroundService$sdk_3_3_0_936_release();

    public final void addViewGroup(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        if (this.viewGroupWeakSet.containsKey(viewGroup)) {
            return;
        }
        if (!this.reactNativeService.isReactNativeCamera(viewGroup) && (viewGroup.getId() == -1 || (viewGroup.getId() > 0 && !CollectionsKt.contains(this.restrictedViewGroupList, Integer.valueOf(viewGroup.getId()))))) {
            viewGroup.setOnHierarchyChangeListener(this);
        }
        this.viewGroupWeakSet.put(viewGroup, new WeakReference<>(viewGroup));
    }

    public final void addViewGroupListener(ViewGroup.OnHierarchyChangeListener viewGroupListener) {
        Intrinsics.checkNotNullParameter(viewGroupListener, "viewGroupListener");
        this.listenerHashSet.add(viewGroupListener);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View parent, View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Iterator<ViewGroup.OnHierarchyChangeListener> it = this.listenerHashSet.iterator();
        while (it.hasNext()) {
            it.next().onChildViewAdded(parent, child);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View parent, View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
    }

    public final void removeViewGroupListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        TypeIntrinsics.asMutableCollection(this.listenerHashSet).remove(onHierarchyChangeListener);
    }

    public final void updateConfiguration(ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.restrictedViewGroupList = configurationRepository.getList(ConfigurationFields.restrictedViewGroupList);
    }
}
