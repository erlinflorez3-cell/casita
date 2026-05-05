package com.biocatch.client.android.sdk.collection.collectors.key;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.collection.collectors.key.KeyEventModel;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.core.masking.TextMaskingService;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.collection.collectors.elements.TextChangeDelegate;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.events.ViewsDetectedEvent;
import com.biocatch.client.android.sdk.events.interactionEvents.TextChangeEvent;
import java.util.Iterator;
import java.util.WeakHashMap;
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
@Metadata(bv = {}, d1 = {"Яz\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000fq{<$q$yCAV\"}8\tWNmhvJh\u0017K\u000f\f\u0017\u0001jBI]xs\u0012\u00172XoG\u074cUoK9hҚ>\u000562*8\u007f\n\t\u001a@H\u0018v\u0001CS\f 9H\u0081BR\u001bS\r\u001a\u0018\bF \u000f)dgT7NǍsŽ_)\u0013kRNU_^{}\rtUg(\u0007e,-X7c\u00185W\u0011\u000bj[m\bOuK\u000b\u0001'U2ʁwWD`H'#Dg\r\f\rV`\u0013lx\fUG\u0016ҪׂT\u000e.\u0015C\n\u001bZ\u001c\u000e4?x2;9~\b<O;r\u001cS^\"vB.\u0015\u0012:%@\u00183YPaƘЂe;\u001fo\u007f\u000f\u0013/6#/\tQ_b1x\u0015Ix>PśU@Cm\u0017\u001egc\u0006\u0004\u001f\n2.\u0012X_\u007f]%A2%OO[gLi\u007f\u0010s\\g%,\u0011la\u0012jHnK\u001f\u001aET!\f\tm-7y|lXZ+}\"b\"\u0016\n)\u001f\u000b\u0014l'3=fQ~h\u0019{\u000e\u000e3^~7\b\u0018\u001c\u0012eav3cz\u0014\u0014o|\u000f\u0014me)\u0019!lP\u0003$Z\u000bBhF\u0011p\u001e(\u0014D|&YF\u0010\u0004*=D1GfK\u001dYٳD˩\u0001\rw\\n\u001b\r`\u00046\u0011v<t7\u000f\u00071Gרi֑M0\u0015b(<Oa\u0006%4W:hb\u007fyȗ\u0001\u0381\u0004Goն\u0018^z'\u000eU*2Ln\u0010֮1ˮ\u0017\u0013\u0017+8\u0015;Y\u001d\u000bsfe\u001e7|\ry=Rx0w\b\u0019\tZvA\u07bdQݚ\u001b\"~ܥC/\u0016j\u0018y\u0010MQõeӝ\u000f[FδC\u000fg@f8+\nuǊ'˽s\"\u0005ކԯGX"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011RN@&8rQs#Z\u0017]9j\u000f`H$lSA,]", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pMLbuBR\u0007\u001d%\u0012c\u001d65\f\u0005`\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[I\u000ea:j\bUJ&n#7&\b.E\u0011;>", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "BdgA@(LY\u001d\b|L,\n\u001a3c\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^WaL\u0016K(\\|+PN<,icv;\u0014g", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G/7k\u00197QA7r\"\u001e\"ye7\u0007quN\b'P[\\u<crF#nj\u001c<+\u001a\u0016]?$D+5)\u0010uF\u0006Ef|\u001b\u0014\u0011~fyAc\u001aKx^sK1pPbmxM\u000bCl7dUO,`AHyzo##2M2\u0014yO pUCcpF&\u0005<#\bkeNMy^Js-hI\u0006\u0005\u0012{`p9z1\r6s%d\u0018ZO\u0014Ld|\u001e.JA47::\u0013\u0015\u000fT", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ":hbAX5>`'fvi", "\u001aiPCTuNb\u001d\u0006DP,x\u000f\u0012a\u000e+c<\fl", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011RN@&8rQq\u0015V\u0017P+s\tgP$wDD\u0011\u0015(T\r;uV", "/sc.V/", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "/sc.V/|a\u0018\u0005t,&J\u0003y_SuL:\u000e\u0017\u001eGk\u001c<", "1qT.g,0`\u0015\n\u0006^9", "BdgAI0>e", "2dc.V/", "2dc.V/|a\u0018\u0005t,&J\u0003y_SuL:\u000e\u0017\u001eGk\u001c<", "6`]1_,", "3uT;g", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r,o40#GaH\u0007a;Nu\u0007XLW;2", "6`]1_,|a\u0018\u0005t,&J\u0003y_SuL:\u000e\u0017\u001eGk\u001c<", "7r1.V2L^\u0015|z", "", "0dU<e,", "", "1nd;g", "7rB6a.ESv\u0002vk(z\u0018/r]+wI\u0003\u0017", "=mC2k;\u001cV\u0015\b|^+", "BdgA", "", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class KeyEventsCollector extends ContinuousCollector<KeyEventModel> implements TextChangeDelegate {
    private final EventBusService eventBusService;
    private final WeakHashMap<TextView, KeyChangeListenerWrapper> listenersMap;
    private final TextMaskingService textMaskingService;
    private final Utils utils;

    public KeyEventsCollector(EventBusService eventBusService, Utils utils, TextMaskingService textMaskingService) {
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(textMaskingService, "textMaskingService");
        this.eventBusService = eventBusService;
        this.utils = utils;
        this.textMaskingService = textMaskingService;
        this.listenersMap = new WeakHashMap<>();
    }

    private final KeyChangeListenerWrapper createWrapper(View view) {
        return new KeyChangeListenerWrapper(view, this);
    }

    public final void attach$sdk_3_3_0_936_release(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (((view instanceof TextView) && view.isFocusableInTouchMode()) || (view instanceof EditText)) {
            TextView textView = (TextView) view;
            detach$sdk_3_3_0_936_release(textView);
            KeyChangeListenerWrapper keyChangeListenerWrapperCreateWrapper = createWrapper(view);
            textView.addTextChangedListener(keyChangeListenerWrapperCreateWrapper);
            this.listenersMap.put(view, keyChangeListenerWrapperCreateWrapper);
        }
    }

    public final void detach$sdk_3_3_0_936_release(TextView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        KeyChangeListenerWrapper keyChangeListenerWrapper = this.listenersMap.get(view);
        if (keyChangeListenerWrapper == null) {
            return;
        }
        view.removeTextChangedListener(keyChangeListenerWrapper);
        this.listenersMap.remove(view);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.KeyEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isKeyEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "keyEvents";
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void handle$sdk_3_3_0_936_release(ViewsDetectedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator<View> it = event.getViews().iterator();
        while (it.hasNext()) {
            attach$sdk_3_3_0_936_release(it.next());
        }
    }

    public final boolean isBackspace(int i2, int i3) {
        return i3 - i2 < 0;
    }

    public final boolean isSingleCharacterChange(int i2, int i3) {
        return Math.abs(i3 - i2) == 1 || i3 == 1;
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.elements.TextChangeDelegate
    public void onTextChanged(View view, CharSequence charSequence, int i2, int i3, int i4) {
        char cCharAt;
        try {
            this.eventBusService.publish(new TextChangeEvent());
            if (isSingleCharacterChange(i3, i4)) {
                if (isBackspace(i3, i4)) {
                    cCharAt = '\b';
                } else {
                    Intrinsics.checkNotNull(charSequence);
                    cCharAt = charSequence.charAt((i2 + i4) - 1);
                }
                if (view != null) {
                    cCharAt = this.textMaskingService.maskKeys(TextMaskingService.getResourceName$default(this.textMaskingService, view, null, 2, null), cCharAt);
                }
                addToQueue(new KeyEventModel(Integer.valueOf(getContextIDCache().get()), Long.valueOf(getCurrentEventId()), null, this.utils.currentTimeMillis(), null, cCharAt, String.valueOf(cCharAt), view != null ? view.hashCode() : 0, null, null, 788, null));
            }
        } catch (Throwable th) {
            Log.Companion.getLogger().error("failed to capture key event", th);
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Key events collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Key events collector is already started. Aborting the start operation.");
        }
        this.eventBusService.subscribe(this);
        setStarted(true);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        this.eventBusService.unsubscribe(this);
        setStarted(false);
    }
}
