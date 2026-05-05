package com.biocatch.client.android.sdk.collection.collectors.elements;

import android.app.Activity;
import android.view.View;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.Group;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.core.ActivityCache;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.events.ViewsDetectedEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{:$c$\bCCU ~*\teNogtKb\u000bQ\u001b\u000eǝ\u0001j:O]xc\u0014\u00172PoG\u074cUoS9ht<\u0005(288\u0002\u0005\u0007\u001a2H&v\u0003CQ\u000f\u0018ؓV\u0081jX\u001dO\u0015\u001a@\u0006l\u001f9\u001d\u0003(qFLz^R/Q\u0005yF\\*w0+Q\u001dJb,%v\u0010$;DE<-%\u0002\u000b\u07baV[M\f\b\u007fK\u001e\u0001'UEyweQp\u007fB1qOUk\u0001Ct\u0005\u007fz<+9m{K~-n|C\u0014\u001b\\\u001c\u000e4Ax4;;~\n$2#\u0015\u0004D^%vB.\u0017(6_+\u000eWC9I\u0001\u0018u\u0004\u001f\\\\\u0014\u0005;8i\u0015?-iY&`C!+ȰSśU@Eʰ\u001f\u001cgG\u0006\u0004\u001fm8~ZΙIĬ3\u007f)0\u001d1Eh\n5/y\u001aHrv-Y7üUׂVLX$t&E;Y\u001ahV|\u0007\u0002O\u0003k\u0003ҍYɟX\u0007\u0006ܱc,j\fT!S%%лtȬnMe܃u;t:qn\u001a\u0012.ޭ`ۋ9Qk߄2^\u0005\u0015W<\u0011\u0007/٫Dΐ\u0010Zd̥rDV\u0001(w*W\u0005`iՌAۇ 8D3\u001fs#`S*PH\u0015\t\u000eb?ɰ\u0001Ձ7$\u000bǭˮx0"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[:\u0015N3\r\u000ehO\u0007rDD\u001b\u0015*L\u0016\u0019r\b\u0013\u0016\fDt}\u0018", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[:\u0015N3\r\u000eh$(nQ3,\u0006/]aLh\n\u001b}\u00184jw\u0018", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "3kT:X5Ma\u0001z\u0006i,\n", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[K\u0012N=l\fYI$wSE\u0007\u00047T\u0002H>", "/bc6i0Mgvzxa,", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w)AJoE\"$|?5\u0005f,$", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G/7k\u00197QA7r\"\u001e\"ye7\u0007quN\b'P[\\u<crF#nj\u001c<+\u001a\u0016]?$D+5)\u0010uF\u0006Ef|\u001b\u0014\u0011~hwFV\u0019VC\u0011~@6rJX)\bFG\u000f`4k\u0013_\u001bk>D-]o#\"oP,\u0019\u0006`\u001f<R\u0001goG\"\nFm/q[X%vUDt0.Ycs\u001d=X\u0002\u0001[+\u000e<s3h\u000fIc'<aB\u00133`A05\u007f8\u001c>Xmyk\b\u001cg%+\u0006\u0018o5ztctgY\u0013\u0016qtW3d_V\u001eP\u0010F\u0013l\u00191DzQY|^\u0005\u0010#zoMBdR\u000b\"xN+m\u0010\tLd\")._-h\u0013o85z>", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "1ta?X5M/\u0017\u000e~o0\f\u001d\u0018a\b(", "", "1ta?X5M/\u0017\u000e~o0\f\u001d\u0018e\u00137jM|(\u0017T}\nCZ.4Y\u0011", "", "4qX2a+Eg\u0002z\u0003^", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "3md:X9:b\u0019n^M9|\t", "", "@n^A", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "6`]1_,", "3uT;g", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r,o40#GaH\u0007a;Nu\u0007XLW;2", ">q^0X:L", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "@n^AI0>e", "AsP?g", "As^=", "\u0016hT?T9<V-kzi6\n\u0018/r", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ElementsHierarchyCollector extends ContinuousCollector<ElementHierarchyEventModel> {
    private final ActivityCache activityCache;
    private String currentActivityName;
    private int currentActivityNextTraversalIndex;
    private final ViewElementsMapper elementsMapper;
    private final EventBusService eventBusService;
    private final Utils utils;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r(4ߚ\u007f\u0007tvAӄLe^.ZS0\u0010s{B$cҕwٔ=kڼ.\"7N\u000f\rwrXZ#C=\u0007&|x.aU'`\"\u0015@F\bAIL\u001eBId\u0003<\u001d `)أ}\u0005\u000f\"rN\u001e\u007f\u0013Cy\u0011X0\tvH\\%M3%X\u001a\u000f.\u000f\"tid5vq4ƀ1ݭ\u0007iJ÷wk>~e\rtW}˜xҐ\"+Hʺ\u0006!3Y\u001b\u0007\u0001b\u0016ŤAџA\u0005pѧw7Wso6\u0007\u0001jƆ-̠\u0011]z̦ف\t]"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[:\u0015N3\r\u000ehO\u0007rDD\u001b\u0015*L\u0016\u0019r\b\u0013\u0016\fDt}\u00019\u0014G\u0007\u0011\u0003?,|3Yj\u0004TPEo\u007f", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "DhTD83>[\u0019\b\n", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[K\u0012N=l\fYI$wS\r", "1n]AX?M7w", "", "/bc6i0Mgv\t\u0003i6\u0006\t8th$\u0004@", "", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016N3\\ZrF# $mU+\u0015\u0005bP2QH7,\u00049G\u0005OF\u000b\u0013\u001d\u000e3yzO,vE\u0004\u001d?>-rDUnwJ\u000bCi.d\u0015nfXC91\u001eu\u0018dvO4Sy]\u0018yRwvkQ\"D6.Et[DTybJ>'&K\u0004w\u001bAf>\u001cx-\u0016\u001416l\u0005Tvm\"E}\u0011=X\u000b.\"?>\\-Zpyu@cO\u001dk\u0010W_9;\u0017ataKX\u0003f\u0016h?e^J5\\\u000eFSx#&LH@e\u0007\u0015Rv3qlW\u0019^E", "5dc\u000eV;Bd\u001d\u000e\u000f<6\u0005\u00149n\u007f1\u000b)|\u001f\u0017", "@t]", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    private final class HierarchyReporter implements Runnable {
        private final String activityComponentName;
        private final int contextID;
        final /* synthetic */ ElementsHierarchyCollector this$0;
        private final Utils utils;
        private final ViewElement viewElement;

        public HierarchyReporter(ElementsHierarchyCollector elementsHierarchyCollector, ViewElement viewElement, int i2, String str, Utils utils) {
            Intrinsics.checkNotNullParameter(viewElement, "viewElement");
            Intrinsics.checkNotNullParameter(utils, "utils");
            this.this$0 = elementsHierarchyCollector;
            this.viewElement = viewElement;
            this.contextID = i2;
            this.activityComponentName = str;
            this.utils = utils;
        }

        private final String getActivityComponentName() {
            String str = this.activityComponentName;
            Intrinsics.checkNotNull(str);
            String strSubstring = str.substring(StringsKt.lastIndexOf$default((CharSequence) this.activityComponentName, ".", 0, false, 6, (Object) null) + 1, StringsKt.lastIndexOf$default((CharSequence) this.activityComponentName, "}", 0, false, 6, (Object) null));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.this$0.addToQueue(new ElementHierarchyEventModel(this.contextID, getActivityComponentName(), this.viewElement.getViewHashCode(), this.viewElement.getParentHashCode(), this.viewElement.getViewClassName(), this.viewElement.getTraversalIndex(), this.utils.currentTimeMillis()));
            } catch (Throwable unused) {
                Log.Companion.getLogger().error("Error reporting element hierarchy");
            }
        }
    }

    public ElementsHierarchyCollector(EventBusService eventBusService, ViewElementsMapper elementsMapper, ActivityCache activityCache, Utils utils) {
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        Intrinsics.checkNotNullParameter(elementsMapper, "elementsMapper");
        Intrinsics.checkNotNullParameter(activityCache, "activityCache");
        Intrinsics.checkNotNullParameter(utils, "utils");
        this.eventBusService = eventBusService;
        this.elementsMapper = elementsMapper;
        this.activityCache = activityCache;
        this.utils = utils;
        this.currentActivityNextTraversalIndex = 1;
    }

    private final void enumerateUITree(View view) {
        for (Map.Entry<View, ViewElement> entry : this.elementsMapper.getDFSHashMap(view, this.currentActivityNextTraversalIndex).entrySet()) {
            View key = entry.getKey();
            ViewElement value = entry.getValue();
            if (entry.getValue().getTraversalIndex() >= this.currentActivityNextTraversalIndex) {
                this.currentActivityNextTraversalIndex = entry.getValue().getTraversalIndex() + 1;
            }
            key.post(new HierarchyReporter(this, value, getContextIDCache().get(), this.currentActivityName, this.utils));
        }
    }

    private final void process(Activity activity, View view) {
        if (activity != null) {
            try {
                this.currentActivityName = activity.getComponentName().toShortString();
                this.currentActivityNextTraversalIndex = 1;
            } catch (Throwable th) {
                Log.Companion.getLogger().error("ElementsHierarchy - Error collecting elements hierarchy", th);
                return;
            }
        }
        enumerateUITree(view);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.ElementHierarchy;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isElementsHierarchy;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return Group.ELEMENTSHIERARCHY;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void handle(ViewsDetectedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        process(event.getActivity(), event.getRootView());
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Elements Hierarchy collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Elements Hierarchy collector is already started. Aborting the start operation.");
        }
        this.eventBusService.subscribe(this);
        setStarted(true);
        Activity activity = this.activityCache.get();
        if (activity == null) {
            return;
        }
        View root = activity.getWindow().getDecorView().getRootView();
        Intrinsics.checkNotNullExpressionValue(root, "root");
        process(activity, root);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        this.eventBusService.unsubscribe(this);
        setStarted(false);
    }
}
