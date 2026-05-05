package com.biocatch.client.android.sdk.collection.collectors.elements;

import android.view.View;
import com.biocatch.android.commonsdk.collection.collectors.elements.ElementEventType;
import com.biocatch.android.commonsdk.collection.focusManager.FocusElement;
import com.biocatch.android.commonsdk.collection.focusManager.IFocusManager;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.core.FeatureFlow;
import com.biocatch.client.android.sdk.events.ViewsDetectedEvent;
import com.biocatch.client.android.sdk.wrappers.FocusChangeWrapper;
import com.biocatch.client.android.sdk.wrappers.FocusChangeWrapperFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
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
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{:$c$\u007fbCU0}*ޛWN}gvJ`\fK\u000f\u0014\u0016\u0001j2J]xs\u0012\u00172HpG3coEʠhtD\u000e(2(=\u007fڎ\u0017ɝZH>u+Cy\fRSPtHS%M3\u001c\"\nL#\u0019\u001e\u000bk^:Vqu:])\u0013mPU?_^\u0005֔\u0011Fb0U\u0003o/C@eGE)a\u0016\u001fR\nKKM\u007fQ\u001dhU9[M\u0002lNX.*[+\u0018\u001bk\n>\\3c\u0011\u00105@gcyfT(@\u000e\n%T\u0004<\u0018WL<F2f6(ysɤW@V\u001d'H\u000e\by6EAF3sO)\u0004iai+~;\n\u001a%\u001eQ\u0017\u001f%ir&`C7\u001b\f\u001a?__UH|\u001c\nA{$\tb0FJ0\u0010\u0006=\u001d).E7}o\u0002)/\u000e\u001aHry=\u00191zasjNP$~\u0016e67\u00171ըfʰoP\\А|\u001d[\u001dl\u0007,\ni\u0601^ʟ@!-ī\u001f[vp\u0003M\f\u0012{ÇhƠ]nsލ(El@MQ\u0012\u001e8ׯx݀C<jڳ)rPV$Z\u000b,xøJн\u0014w\u0004ͩ\u001f\u0018!AWqJ:\u0003վ\u001bÅ\u0019H\u000bٜ\u0013O\u000b\u0019w\\~\u000f-S\nɷ\u000fȐ(t\u0011ɖ˯`\u0014"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[;\u0018L;\u001bb\\=-pD\r", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feIa!\u0015W}k?r.7Yd$E|\u00167MP\u0011", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w.C7zD+\u0015IhC\u00199", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "4nRBf\nAO\"\u0001zP9x\u0014:e\r\tw>\u0010!$[", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5\u0015(\u0013xo\u0017\n_5Pv\u0019THY7\\_S9\u0012!d\u001bb\u0001", "4nRBf\u0014:\\\u0015\u0001zk", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001f\u001ffqGn_5Jx'T\u00162\rfP\u0003K{\u000ec\nP+\u001aZ", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G/7k\u00197QA7r\"\u001e\"ye7\u0007quN\b'P[\\u<crF#nj\u001c<+\u001a\u0016]?$D+5)\u0010uF\u0006Ef|\u001b\u0014\u0011~fyAc\u001aKx^sK1pPbmxM\u000bCl7dUO,`AHyzo##2M2\u0014yO pUCenK\u0019\u0004Gm:vZSOsT\u0006\u0003&%\u0015\u000e\u0005\u000e=ct8\u0003vd>(FrbNc!@^j\"(gL'3\u00178\u0011NUp\nB%\fr'+\u0005\u0012l3-(ch-D\u0018\u0006j!_4+]\u000b?Z\u0010GWn\u001bpD\tIby\u0013\u0018\u000b.v/JM\u0019d\u000f\u0002lM\u001ea\u0011\u0010LJx&,&KA\u000bq&a7ZhLY", "3kT:X5M3*~\u0004m\u0016y\u0017/r\u0011(\tN", "", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[:\u0015N3\r\u000eh!5nMF\t\u0005:I\u000fLh\u000ea", "7r4;T)ES\u0018", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "EqP=c,K4\u0015|\nh9\u0011", "EqP=c,K:\u001d\r\n^5|\u0016", "/cS\u0019\\:MS\"~\b", "", "3kT:X5M3*~\u0004m\u0016y\u0017/r\u0011(\t", "/sc.V/", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "2dc.V/", "6`]1_,", "3uT;g", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r,o40#GaH\u0007a;Nu\u0007XLW;2", "6`]1_,|a\u0018\u0005t,&J\u0003y_SuL:\u000e\u0017\u001eGk\u001c<", "", "=m5<V<L1\u001cz\u0004`,", "6`b\u0013b*Na", "Adc\u0012a(;Z\u0019", "3mP/_,", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class FocusChange implements View.OnFocusChangeListener, FeatureFlow {
    private final List<ElementEventObserver> elementEventObservers;
    private final EventBusService eventBusService;
    private final IFocusManager focusManager;
    private final AtomicBoolean isEnabled;
    private final Utils utils;
    private final FocusChangeWrapperFactory wrapperFactory;
    private View.OnFocusChangeListener wrapperListener;

    public FocusChange(EventBusService eventBusService, Utils utils, FocusChangeWrapperFactory focusChangeWrapperFactory, IFocusManager focusManager) {
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(focusChangeWrapperFactory, "focusChangeWrapperFactory");
        Intrinsics.checkNotNullParameter(focusManager, "focusManager");
        this.eventBusService = eventBusService;
        this.focusManager = focusManager;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.isEnabled = atomicBoolean;
        atomicBoolean.set(false);
        this.utils = utils;
        this.elementEventObservers = new ArrayList();
        this.wrapperFactory = focusChangeWrapperFactory;
    }

    private final void attach(View view) {
        if (view.isFocusableInTouchMode()) {
            detach(view);
            FocusChangeWrapper focusChangeWrapperCreate = this.wrapperFactory.create(view, this);
            this.wrapperListener = focusChangeWrapperCreate;
            view.setOnFocusChangeListener(focusChangeWrapperCreate);
            if (view.hasFocus()) {
                onFocusChange(view, true);
            }
        }
    }

    private final void detach(View view) {
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        if (onFocusChangeListener instanceof FocusChangeWrapper) {
            view.setOnFocusChangeListener(((FocusChangeWrapper) onFocusChangeListener).getOriginalListener());
        }
    }

    private final boolean isEnabled() {
        return this.isEnabled.get();
    }

    private final void setEnable(boolean z2) {
        this.isEnabled.set(z2);
    }

    public final void addListener(ElementEventObserver elementEventObserver) {
        Intrinsics.checkNotNullParameter(elementEventObserver, "elementEventObserver");
        this.elementEventObservers.add(elementEventObserver);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void handle$sdk_3_3_0_936_release(ViewsDetectedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator<View> it = event.getViews().iterator();
        while (it.hasNext()) {
            attach(it.next());
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            String resourceName = view.getResources().getResourceEntryName(view.getId());
            IFocusManager iFocusManager = this.focusManager;
            int iHashCode = view.hashCode();
            Intrinsics.checkNotNullExpressionValue(resourceName, "resourceName");
            iFocusManager.setCurrentFocus(new FocusElement(iHashCode, resourceName));
            ElementEventType elementEventType = z2 ? ElementEventType.FOCUS : ElementEventType.BLUR;
            if (isEnabled()) {
                Iterator<ElementEventObserver> it = this.elementEventObservers.iterator();
                while (it.hasNext()) {
                    it.next().notifyElementEvent(new ElementEventData(elementEventType, view.hashCode(), 0, ""));
                }
            }
        } catch (Throwable th) {
            Log.Companion.getLogger().error("focus change error", th);
        }
    }

    @Override // com.biocatch.client.android.sdk.core.FeatureFlow
    public void start() {
        if (isEnabled()) {
            return;
        }
        this.eventBusService.subscribe(this);
        setEnable(true);
    }

    @Override // com.biocatch.client.android.sdk.core.FeatureFlow
    public void stop() {
        this.eventBusService.unsubscribe(this);
        setEnable(false);
    }
}
