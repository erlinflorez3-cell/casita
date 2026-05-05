package com.biocatch.client.android.sdk.events;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.biocatch.android.commonsdk.events.IEvent;
import java.util.Collection;
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007t\u0007AӄLe^.ZS0\u0017qڔJř\f$ B{\u0001*\u00040\tgP}f\u001dKj\u000fQ\u0011\u001e\u0016'm<Sc|u\u0018\u001f4Rom6{tM=nzN\u0005N9ŕ<y\u0013\tj;V\u0010\u000f|YJ:\u0013ضDvBĥ%O\u000b# \u0010\u000f/\u000f$tg|=ՂpcBǂ;\u0005oM\\30?\u000bO%F\u0003*˼zg&ѨX9;\"3aS\u001c`_W\tOsM\u0005\u0017*U0ʁw]>ݙ\u0018\u0016\u001b:]\u001dǇv7"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r,o40#GaH\u0007a;Nu\u0007XLW;2", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#}17v%<\u0017'\u001b|4'$>", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "@n^AI0>e", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "DhTDf", "", "@db<h9<S'", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3\u000b", "uKP;W9HW\u0018Hvi7Fd-t\u00049\u007fO\u0015l}Cx\rI\u0001)4#\u000f$7\u007f_\u001fQCMA\u001b#\u0011y]\u0003\u0017r0U@\u0005QSU,ZavG\u001dgA\nW*\u001a\u000f]@mlN@.\b5XKHh\u000fU\u0003\u000eCt\u0001OT\u0010UOXf", "5dc\u000eV;Bd\u001d\u000e\u000f", "u(;.a+K]\u001d}DZ7\bR\u000bc\u000f,\rD\u0010+l", "5dc\u001fX:Hc&|zl", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fq\t@\u000f`\u0004G}\u0018L\u0004#5gS", "5dc\u001fb6MD\u001d~\r", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "5dc#\\,Pa", "u(;7T=:\u001d)\u000e~euZ\u00136l\u007f&\u000bD\u000b l", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ViewsDetectedEvent implements IEvent {
    private final Activity activity;
    private final Resources resources;
    private final View rootView;
    private final Collection<View> views;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewsDetectedEvent(Activity activity, View rootView, Collection<? extends View> views, Resources resources) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(views, "views");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.activity = activity;
        this.rootView = rootView;
        this.views = views;
        this.resources = resources;
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final Resources getResources() {
        return this.resources;
    }

    public final View getRootView() {
        return this.rootView;
    }

    public final Collection<View> getViews() {
        return this.views;
    }
}
