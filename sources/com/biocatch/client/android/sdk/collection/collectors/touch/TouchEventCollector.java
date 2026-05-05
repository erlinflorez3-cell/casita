package com.biocatch.client.android.sdk.collection.collectors.touch;

import android.view.MotionEvent;
import android.view.View;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.collection.collectors.touch.TouchActions;
import com.biocatch.android.commonsdk.collection.collectors.touch.TouchEventModel;
import com.biocatch.android.commonsdk.collection.collectors.touch.TouchLocation;
import com.biocatch.android.commonsdk.collection.collectors.touch.TouchSettings;
import com.biocatch.android.commonsdk.collection.collectors.touch.TouchSourceType;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.core.masking.CoordinatesMaskingService;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.events.IEventHandler;
import com.biocatch.client.android.sdk.events.ViewsDetectedEvent;
import com.biocatch.client.android.sdk.events.interactionEvents.TouchEvent;
import java.lang.reflect.Field;
import java.util.Iterator;
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
@Metadata(bv = {}, d1 = {"Я\u0001\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCCU }*\teNogtKb\u000bY\u000f\u000e\u0016~k4Ikxe܈\u00172P{G3SpE9nt>ӌ(288\u0002ڎ\t\u001a@H\u0018v\u0001GS\f(0H\u0081BR#M\r܅\u001a\u0006L&\t\u001ebgV6Vue:5'\t݃X÷We@~]\rtTU\f'aL,p7c\u0017]T38\u0005\u001cb\u0013C\u007f@\u001dhU+;M\u0002\\NX.\u001a%/]\u0014urTd\u0015Un\u0015?+}mׂT\u000e6\u0003C\n\u001bV\u001c\u000e4Bx2;6~\b<P;\u0007\u001cY^ vF.\u001a26Eӛ099Y3hg`i\u001a\u0015љ߉\t\r$DI|/}l\u000e\u000f0KX\u0006mIQnZ\u000fbRpK\u0011\u001crx\u0001X\u0005`M\u000eK\u0014\u0013D\u0016ST\"ݽ؝%k\bl\r\b\u0005*xh\u0002\u0010\u0003NN>\u0007\u0018M)7)\u000bHr,\u0004P\u0003\u0001\\\u0015[El\u0007,2Y %\u0010JL=\u0010|j\u0019oxiu\f;.\u0015T\nry5o9\r[{Q,&o~\u000f\u0014mi\u0013\tf\u0003ZS:w\r,0Y`j> BX\u0017\u0012!`WqJOrEab#w\u001b\u001ep\\C\u001d0lv\u001c\u0017Ta19>zڦ\u000bɹT`\tqm\u0007W;Mr0=YQc*\\*xג6č'\u000b\u0017u\u0006Yu_\u0018Xz\u001f\u000eU**l֠;ֺ3=\u001bÁO5@\u0005EEzv<ʻOɟ+z\u0005Ȫ_MvB\u007f\u000ezp2a\u0001I}imǴ\u0003݈v#\u0010ۭP\fo\\\u0013G\u0012kA0\u0015ϋtè]@f:\u0003\u001d-7u\r})\u00155[K}ݷ\u0018߳\u0018/\u001d˕.u}3\u0012b=,KЄ\u0006Нg\u0016w̥мae"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011[X<ZU<,\u001e\"X\u0011.<\r\u000eh\u001f.uK7\u001d\u00176VW", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pVV^*_\u001caG$\u0010]m_+\u0016\u0014AK#nK\r", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feIo!'Ert@\u000545b}-\r", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011[X<ZU<.\u0018\u0012lwK9\r\u0012jA1D", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "Bnd0[\u001a>b(\u0003\u0004`:", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pVV^*_\u001caG$\u0010]{N:\u001c\tbC2D", "1n^?W0GO(~\tF(\u000b\u000f3n\u0002\u0016{M\u0012\u001b\u0015G", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^FkC\u0014b0Wr6GZ6(jXvF\u0016\u007fZ\u001b_/\u000b\u0005/", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G/7k\u00197QA7r\"\u001e\"ye7\u0007quN\b'P[\\u<crF#nj\u001c<+\u001a\u0016]?$D+5)\u0010uF\u0006Ef|\u001b\u0014\u0011~fyAc\u001aKx^sK1pPbmxM\u000bCl7dUO,`AHyzo##2M2\u0014yO pUCcpF&\u0005<#\bkeNMy^Js-hI\u0006~\u00192V\u0004/~6M24=k\u0005Iv\"KlB$6l?*o%F#=NQu{M\u0012q!o]t`?9bbimF\u000b\u0016[\u001a%1j^\u000eAV\u0005\bGy\u001d/P\bPZ\u007f^\u0007\u00111m/Q?)Z\u0005#r\u000e\u007fi\u001b\u0010\u0002j!\u0018=\u0016KA\u000bv0c@O\u0001\tuI\u0010yY\u0019Xa", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "3uT;g\u000f:\\\u0018\u0006zk", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u001fKE\u001e\u001ewD5\u0010b3N\u0004|", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "/sc.V/", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "1qT.g,0`\u0015\n\u0006^9", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011[X<ZU<,\u001e\"X\u0011.<\r\u000eh\u001f.uK7\u001d\u00176V@\"l\u000f\u001b\u0016\u00175wbOR\u001bRy\"K", "=qX4\\5:Z", "1qT.g,0`\u0015\n\u0006^9;\u0017.kyuu\u000eza\u0011\u001b=^6\u0004%<Yy.7", "2dc.V/", "5dc\u001ca\u001bHc\u0017\u0002ab:\f\t8e\r", "5dc\u001ca\u001bHc\u0017\u0002ab:\f\t8e\rf\n?\u0007\u0011dA=\b\u0007px\u0003*w-7t\u0016*[C", "5dc!b<<Vv\t\u0005k+\u0001\u0012+t\u007f6", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pVV^*_\u001caG$\u0010]tX)\t\u0014]K-D", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", ">nX;g,K7\"}zq", "", "6`]1_,-])|}>=|\u0012>", "=mC<h*A", "", "AsP?g", "As^=", "\u001adV.V@-])|}>=|\u0012>H{1zG\u0001$", "\u001ahbAX5>`\u000b\fvi7|\u0016", "\"nd0[\fOS\"\u000e]Z5{\u0010/r", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TouchEventCollector extends ContinuousCollector<TouchEventModel> implements View.OnTouchListener, ViewObserver {
    private final CoordinatesMaskingService coordinatesMaskingService;
    private final EventBusService eventBusService;
    private IEventHandler<?> eventHandler;
    private final TouchSettings touchSettings;
    private final Utils utils;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r\"4\u0012}\u0007lʘ;FǏ\u0016N>Tc*=k*3d^ҸuCIVb\f0\u000bgN\u0016j\u001fNh\u000f[\u000f4\u0016?\u007f\u0082MZ"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011[X<ZU<,\u001e\"X\u0011.<\r\u000eh\u001f.uK7\u001d\u00176V@\"h\u0003\b\u0014\"$t\u0001@YoXy\u001e\u0005$%qE`_\u0007\u001d", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u001fKE\u001e\u001ewD5\u0010b3N\u0004|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r,o40#GaH\u0007a;Nu\u0007XLW;2", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016]6lPu\u0007\u0003\u001cj\fQ\u000b\u001e\u0005bP\u0002xK>\u001f\u0006;S\u000f\u0011,q", "6`]1_,", "", "3uT;g", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public final class LegacyTouchEventHandler implements IEventHandler<ViewsDetectedEvent> {
        public LegacyTouchEventHandler() {
        }

        @Override // com.biocatch.client.android.sdk.events.IEventHandler
        @Subscribe(threadMode = ThreadMode.MAIN)
        public void handle(ViewsDetectedEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            Iterator<View> it = event.getViews().iterator();
            while (it.hasNext()) {
                TouchEventCollector.this.attach(it.next());
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLcz\u0007I\u0006>\u00146Ȑ\u0007\"B\u0012\u007fјnjO0L͜N\u0093Tiճ?k*3dh4wQ;m\u001c\u0014!7NɁkg|K#!Q\u0013\u001e\u0016'o\\Mc~u\u0012=9rsM;eokB'\t\u0007\u0016.2::\u0010\u0004/\u0019ݵL\u0016~ٙ[M\u0012\u0014>Cª>\\"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011[X<ZU<,\u001e\"X\u0011.<\r\u000eh\u001f.uK7\u001d\u00176V@\"l\u000f\u001b\u0016\u00175wbOR\u001bRy\"K", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feIo!'Ert@\u000545b}-\r", "=qX4\\5:Z\u007f\u0003\tm,\u0006\t<", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016]6lPu\u0007\u0003\u001cj\fQ\u000b\u001e\u0005bP\u0002xK>\u001f\u0006;S\u000f\u0011O|\u0015\u0015\u001b?no\fg\u0014G\f^fE)z\u0005ChhQQCe\u0011h\u001an\u001de:GyWb", "5dc\u001ce0@W\"z\u0002E0\u000b\u0018/n\u007f5", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e~j \u0006Q\u007f\f?])Ch})7zk", "=mC<h*A", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public final class ListenerWrapper implements View.OnTouchListener {
        private final View.OnTouchListener originalListener;

        public ListenerWrapper(View.OnTouchListener onTouchListener) {
            this.originalListener = onTouchListener;
        }

        public final View.OnTouchListener getOriginalListener() {
            return this.originalListener;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            boolean zOnTouch = TouchEventCollector.this.onTouch(view, event);
            View.OnTouchListener onTouchListener = this.originalListener;
            return onTouchListener != null ? onTouchListener.onTouch(view, event) : zOnTouch;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r\"4\u0012}\u0007lʘ;FǏ\u0016N>Tc*=k*3d^ҸuCIVb\f0\u000bgN\u0016j\u001fNh\u000f[\u000f4\u0016?\u007f\u0082MZ"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011[X<ZU<,\u001e\"X\u0011.<\r\u000eh\u001f.uK7\u001d\u00176V@*r\u0011\n\u0019mFjyQ9\fPx\u001cuN~", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u001fKE\u001e\u001ewD5\u0010b3N\u0004|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r?tC\u001e\"d_H\u000bm5.\b'P[\\uK\\\u0003;\u0017qk\u000eW:b", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016]6lPu\u0007\u0003\u001cj\fQ\u000b\u001e\u0005bP\u0002xK>\u001f\u0006;S\u000f\u0011,q", "6`]1_,", "", "3uT;g", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public final class TouchEventHandler implements IEventHandler<TouchEvent> {
        public TouchEventHandler() {
        }

        @Override // com.biocatch.client.android.sdk.events.IEventHandler
        @Subscribe(threadMode = ThreadMode.MAIN)
        public void handle(TouchEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            TouchEventCollector.this.handleTouchEvent(null, event.getEvent());
        }
    }

    public TouchEventCollector(EventBusService eventBusService, Utils utils, TouchSettings touchSettings, CoordinatesMaskingService coordinatesMaskingService) {
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(touchSettings, "touchSettings");
        Intrinsics.checkNotNullParameter(coordinatesMaskingService, "coordinatesMaskingService");
        this.eventBusService = eventBusService;
        this.utils = utils;
        this.touchSettings = touchSettings;
        this.coordinatesMaskingService = coordinatesMaskingService;
    }

    private final TouchLocation getTouchCoordinates(View view, MotionEvent motionEvent, int i2) {
        TouchLocation touchLocation;
        if (this.utils.isVersionGreaterOrEqualTo(29)) {
            touchLocation = new TouchLocation((int) motionEvent.getRawX(i2), (int) motionEvent.getRawY(i2));
        } else if (view != null) {
            view.getLocationOnScreen(new int[2]);
            touchLocation = new TouchLocation((int) (r2[0] + motionEvent.getX(i2)), (int) (r2[1] + motionEvent.getY(i2)));
        } else {
            touchLocation = new TouchLocation((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
        }
        return this.coordinatesMaskingService.maskTouch(touchLocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTouchEvent(View view, MotionEvent motionEvent) {
        TouchEventCollector touchEventCollector = this;
        try {
            TouchActions action = TouchActions.Companion.getAction(motionEvent);
            if (action == TouchActions.UNSUPPORTED) {
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 0; i2 < pointerCount; i2++) {
                TouchLocation touchCoordinates = touchEventCollector.getTouchCoordinates(view, motionEvent, i2);
                try {
                    TouchEventModel touchEventModel = new TouchEventModel(Integer.valueOf(getContextIDCache().get()), Long.valueOf(getCurrentEventId()), touchEventCollector.utils.currentTimeMillis(), Integer.valueOf(action.ordinal()), view != null ? view.hashCode() : 0, Integer.valueOf(touchCoordinates.getX()), Integer.valueOf(touchCoordinates.getY()), Integer.valueOf(motionEvent.getPointerId(i2)), Double.valueOf(motionEvent.getTouchMajor(i2)), Double.valueOf(motionEvent.getTouchMinor(i2)), Float.valueOf(motionEvent.getPressure(i2)), Integer.valueOf(TouchSourceType.Companion.getSource(motionEvent).ordinal()), Double.valueOf(touchEventCollector.utils.truncate(motionEvent.getSize(i2), touchEventCollector.touchSettings.getTouchSizePrecision())), Double.valueOf(motionEvent.getOrientation(i2)), null, 16384, null);
                    touchEventCollector = this;
                    try {
                        touchEventCollector.addToQueue(touchEventModel);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return;
        } catch (Throwable th3) {
            th = th3;
        }
        Log.Companion.getLogger().error("Touch feature error", th);
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.touch.ViewObserver
    public void attach(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        detach(view);
        view.setOnTouchListener(createWrapper$sdk_3_3_0_936_release(getOnTouchListener$sdk_3_3_0_936_release(view)));
    }

    public final ListenerWrapper createWrapper$sdk_3_3_0_936_release(View.OnTouchListener onTouchListener) {
        return new ListenerWrapper(onTouchListener);
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.touch.ViewObserver
    public void detach(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View.OnTouchListener onTouchListener$sdk_3_3_0_936_release = getOnTouchListener$sdk_3_3_0_936_release(view);
        if (onTouchListener$sdk_3_3_0_936_release instanceof ListenerWrapper) {
            view.setOnTouchListener(((ListenerWrapper) onTouchListener$sdk_3_3_0_936_release).getOriginalListener());
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.TouchEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isTouchEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "touchEvents";
    }

    public final View.OnTouchListener getOnTouchListener$sdk_3_3_0_936_release(View view) {
        try {
            Field declaredField = View.class.getDeclaredField("mListenerInfo");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            if (obj != null) {
                Field declaredField2 = obj.getClass().getDeclaredField("mOnTouchListener");
                declaredField2.setAccessible(true);
                return (View.OnTouchListener) declaredField2.get(obj);
            }
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            Log.Companion.getLogger().error("failed to get original listener", e2);
        }
        return null;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        handleTouchEvent(view, event);
        return false;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Touch events collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Touch events collector is already started. Aborting the start operation.");
        }
        IEventHandler<?> touchEventHandler = this.touchSettings.getEnableGlobalTouchCollectionMode() ? new TouchEventHandler() : new LegacyTouchEventHandler();
        this.eventHandler = touchEventHandler;
        EventBusService eventBusService = this.eventBusService;
        Intrinsics.checkNotNull(touchEventHandler);
        eventBusService.subscribe(touchEventHandler);
        setStarted(true);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        IEventHandler<?> iEventHandler = this.eventHandler;
        if (iEventHandler != null) {
            EventBusService eventBusService = this.eventBusService;
            Intrinsics.checkNotNull(iEventHandler);
            eventBusService.unsubscribe(iEventHandler);
        }
        this.eventHandler = null;
        setStarted(false);
    }
}
