package com.biocatch.client.android.sdk.collection.collectors.elements;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.collection.ElementViewGroupChangeObserver;
import com.biocatch.client.android.sdk.events.ViewsDetectedEvent;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.`Y2şs{J$cҕyCQU\"Ԃ*\teNo˧vJh\u000bK\u000f\f\u001c\u0001jBI]xc\u0012\u0015˰Xģo3{n}TpxD\u000582P9\n\t\u000f\u001cBH>y\u000bGY\u0010*0nuĐV\r[\u000bb2\u0014E8\u0001Ld\u0018TDQ\u0005_P.Q\r\u001aF\\2w0+Y=Jb4%v\u0010,q@\u007fK#4k\u00035b\fC\u0011P\n=3tW+9[\fWddF(]A] urTl5Un ?+}o{T\u001c=\u0010z*\u0019\u0003\u0018V\u00125^F-Hv8\u0012A}\u000bSnZJjP\u0017\u0013ad'U\u0004ACQ\u001b\u0015j*?'hO{3\u001dn/\u000fr9[\u0003\u00137ڀ\u001dƻ{Q9҅\u0011IVP\"YkpZ͒d͆.\u00048ϚP;\n\u0011F\u0017S82ހ%\u074co\u0002PֳЂz "}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[:\u0015N3\r\u000ehO\u0012nQH#\u0006,\u001f", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"U1xp@v21f{#KK\u0019*VE;R8,$hj9\u00149", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "3md:X9:b#\f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[9n<\u001c\u0011\u0005k!-~L7,\u0004;S\u000f\u0011", "3kT:X5MD\u001d~\r@9\u0007\u0019:C\u0003$\u0005B\u0001\u0001\u0014Uo\u001bMv2", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=gtoaA\u0007l;?z'Y.[6l]P@\u0010\u001b\\\u000e8(\u001b\u0005fR${\u001a", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G/7k\u00197QA7r\"\u001e\"ye7\u0007quN\b'P[\\u<crF#nj\u001c<+\u001a\u0016]?$D+5)\u0010uF\u0006Ef|\u001b\u0014\u0011~hwFV\u0019VC\u0011~@6rJX)\bFG\u000f`4k\u0013_\u001bk>D-]o#\"oP,\u0019\u0006`\u001f<R\u0001goG\"\nFm\u001dNI7Iog\u001c}7'K\ts!<eJ\u0012r7\f}':n\u0003Gv\u0016A(v\u001c0\\J6o2E\u0012LUgt6L\rnh_\u0012\u0015i5/(iol\u0012n\u000e]\u001f[>pP\u00057dgKS\u007f \u0005IzK]y~\u0006\u0015$zvIPp\u0018q", "3md:X9:b\u0019n^M9|\t", "", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "@n^A", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "@db<h9<S'", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3\u000b", "=m25\\3=D\u001d~\r:+{\t.", "", ">`a2a;", "1gX9W", "=m25\\3=D\u001d~\rK,\u0005\u0013@e~", "DhTD", "DhTD$", ">q^0X:L/\u0017\u000e~o0\f\u001d", ">q^0X:L4&z|f,\u0006\u0018", "4qP4`,Gb", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "As^=;0>`\u0015\fxa@Z\f+n\u0002(bD\u000f&\u0017Po\u001b", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ElementsService implements ViewGroup.OnHierarchyChangeListener {
    private final ElementViewGroupChangeObserver elementViewGroupChangeObserver;
    private final DFSViewEnumerator enumerator;
    private final EventBusService eventBusService;

    public ElementsService(EventBusService eventBusService, DFSViewEnumerator enumerator, ElementViewGroupChangeObserver elementViewGroupChangeObserver) {
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        Intrinsics.checkNotNullParameter(enumerator, "enumerator");
        Intrinsics.checkNotNullParameter(elementViewGroupChangeObserver, "elementViewGroupChangeObserver");
        this.eventBusService = eventBusService;
        this.enumerator = enumerator;
        this.elementViewGroupChangeObserver = elementViewGroupChangeObserver;
        elementViewGroupChangeObserver.addViewGroupListener(this);
    }

    private final int enumerateUITree(Activity activity, View view, Resources resources) {
        List<View> allChildren = this.enumerator.getAllChildren(view);
        for (View view2 : allChildren) {
            if (view2 instanceof ViewGroup) {
                this.elementViewGroupChangeObserver.addViewGroup((ViewGroup) view2);
            }
        }
        if (!allChildren.isEmpty()) {
            this.eventBusService.publish(new ViewsDetectedEvent(activity, view, allChildren, resources));
        }
        return allChildren.size();
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View parent, View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        try {
            Resources resources = parent.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "resources");
            enumerateUITree(null, child, resources);
        } catch (Throwable th) {
            Log.Companion.getLogger().error("Error collecting dynamically added element", th);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view1) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view1, "view1");
    }

    public final void processActivity(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Log.Companion companion = Log.Companion;
        companion.getLogger().info("Processing activity \"" + activity.getLocalClassName() + "\" elements.");
        if (activity.getWindow() == null) {
            companion.getLogger().warning("Activity \"" + activity.getLocalClassName() + "\" window is unavailable. Aborting activity processing.");
            return;
        }
        View root = activity.getWindow().getDecorView().getRootView();
        Resources resources = activity.getResources();
        Intrinsics.checkNotNullExpressionValue(root, "root");
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        companion.getLogger().info("Found " + enumerateUITree(activity, root, resources) + " child elements under \"" + activity.getLocalClassName() + "\" activity.");
    }

    public final void processFragment(Fragment fragment) {
        View view;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FragmentActivity activity = fragment.getActivity();
        if (activity == null || (view = fragment.getView()) == null) {
            return;
        }
        EventBusService eventBusService = this.eventBusService;
        FragmentActivity activity2 = fragment.getActivity();
        Intrinsics.checkNotNullExpressionValue(view, "view");
        List<View> allChildren = this.enumerator.getAllChildren(view);
        Resources resources = activity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "it.resources");
        eventBusService.publish(new ViewsDetectedEvent(activity2, view, allChildren, resources));
    }

    public final void stopHierarchyChangeListener() {
        this.elementViewGroupChangeObserver.removeViewGroupListener(this);
    }
}
