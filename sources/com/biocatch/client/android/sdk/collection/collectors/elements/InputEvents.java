package com.biocatch.client.android.sdk.collection.collectors.elements;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.biocatch.android.commonsdk.collection.collectors.elements.ElementEventType;
import com.biocatch.android.commonsdk.core.masking.TextMaskingService;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.core.FeatureFlow;
import com.biocatch.client.android.sdk.di.SdkInjectorKt;
import com.biocatch.client.android.sdk.events.ViewsDetectedEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XS2\u000fy\u001b<$q$yّCU0}*ޛWN}gvJp\u000bK\u000f\u001c\u0016\u0001̓4Icxe\u0012\u00157JoU3UoC9htL\u0005(݅*8\b\u000e\t\u001a0H\u0018v\tNSÈ\u001a0NvBR\u0013Q\u000b܅(ßn /\u001d\rg|6\t\nm>=$\u001bipP7c>\u007fe\rtX7\u0013|a,0X7c\u001bȏW\u0003\u0015Y$K\u0011P\n=3zW+9\\\fWdbH\"#?g\r\f\u0005V`\u0013fx\fU:\u0016c\u0014c\u001c>\u0010z*\u001dl\b\u001c\u001d?H\\<`eڿ\u00123z\u000b\u001cN^\u001bvB.\r\u0012:%:\u00183YSaf\u001atI4f7*\u0017=\"1\u001d\u0007!\nqT_ڠ\u001fT}oyWNH`N8x\u0004mL#p\"B\u0004^Y05\n&F\u0019;6\nHS'y#`F}u3\u0003\u0019Wwu`@P\u0013F;8.$Zr\t5o^zp,?qbhO\f\u0016:8\\&NQ)\u001evgh\u0018\n\u0014]R+=\nOY\u001d}Tk\u0002dA^ic>s\u0019\u000bdQJj\u001d^vDc\f\tfV+\tʎlݻ{{L\u0088\\\u001f@@\n\u001cb.\bǌ^ČL\u0003&Փ\u0012\t\u0017jrh>\u000b+՟&ғm$|էQ\\ju\bg'O\u0003ʌbĘ1AYځi2c%\u00014+']ѫuõKgT܁\u001d\u0005$\u0003m\b0\u0018*9\u007f>M\u0015\u001f~WB0;\u001cɦtϯUM\u001a\u05fdϾ\u0001$"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[>\u0017Y;\u001cdjA-}R\r", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[I\u000ea:j\bUJ&n#7&\b.E\u0011;>", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w.C7zD+\u0015IhC\u00199", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "BdgA@(LY\u001d\b|L,\n\u001a3c\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^WaL\u0016K(\\|+PN<,icv;\u0014g", "@dP0g\u0015:b\u001d\u0010zL,\n\u001a3c\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[G\u000eJ)\u001cmUP(\u007fD))\u00152E\u000fEx\n\u000b\u0004\u000eB{t@Ve", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G/7k\u00197QA7r\"\u001e\"ye7\u0007quN\b'P[\\u<crF#nj\u001c<+\u001a\u0016]?$D+5)\u0010uF\u0006Ef|\u001b\u0014\u0011~fyAc\u001aKx^sK1pPbmxM\u000bCl7dUg\u0019j@>-\u0016;\b\u001b{_\u0016\u0006\nY\u0015{TggtX\u001dx8y%keN\u000flYFr#.I~A\u00109\\t4\u0004v\u007f=)Cn\tJ1&=dB\u00136cH'$E@\u001dH\u0015a\u007fsE\u000ef.k\u0015\u001c,58\u0019melW\u001dPJ\u0017W3pH|FV\u0017>;y\"-B\fLk\u0003\u0014v\u00071~iGCp\u0018q", "3kT:X5M3*~\u0004m\u0016y\u0017/r\u0011(\tN", "", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[:\u0015N3\r\u000eh!5nMF\t\u0005:I\u000fLh\u000ea", "7r4;T)ES\u0018", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "DhTD?0Lb\u0019\bzk:_\u0005=hg$\u0007", "\u001aiPCTuNb\u001d\u0006DP,x\u000f\u0012a\u000e+c<\fl", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[I\u000ea:s\tgP$wDD\u0011\u0015(T\r;uV", "/cS\u0019\\:MS\"~\b", "", "3kT:X5M3*~\u0004m\u0016y\u0017/r\u0011(\t", "/sc.V/", "DhTD", "1qT.g,0`\u0015\n\u0006^9", "BdgAI0>e", "1qT.g,0`\u0015\n\u0006^9;\u0017.kyuu\u000eza\u0011\u001b=^6\u0004%<Yy.7", "2dc.V/", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", "6`]1_,", "3uT;g", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r,o40#GaH\u0007a;Nu\u0007XLW;2", "6`]1_,|a\u0018\u0005t,&J\u0003y_SuL:\u000e\u0017\u001eGk\u001c<", "", "=mC2k;\u001cV\u0015\b|^+", "BdgA", "", "AsP?g", "", "0dU<e,", "1nd;g", "Adc\u0012a(;Z\u0019", "3mP/_,", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class InputEvents implements TextChangeDelegate, FeatureFlow {
    private final List<ElementEventObserver> elementEventObservers;
    private final EventBusService eventBusService;
    private final AtomicBoolean isEnabled;
    private final ReactNativeWorkaroundService reactNativeService;
    private final TextMaskingService textMaskingService;
    private final WeakHashMap<View, TextListenerWrapper> viewListenersHashMap;

    public InputEvents(EventBusService eventBusService, TextMaskingService textMaskingService, ReactNativeWorkaroundService reactNativeService) {
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        Intrinsics.checkNotNullParameter(textMaskingService, "textMaskingService");
        Intrinsics.checkNotNullParameter(reactNativeService, "reactNativeService");
        this.eventBusService = eventBusService;
        this.textMaskingService = textMaskingService;
        this.reactNativeService = reactNativeService;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.isEnabled = atomicBoolean;
        this.viewListenersHashMap = new WeakHashMap<>();
        atomicBoolean.set(false);
        this.elementEventObservers = new ArrayList();
    }

    public /* synthetic */ InputEvents(EventBusService eventBusService, TextMaskingService textMaskingService, ReactNativeWorkaroundService reactNativeWorkaroundService, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventBusService, textMaskingService, (i2 & 4) != 0 ? SdkInjectorKt.getSdkInjector().provideReactNativeWorkaroundService$sdk_3_3_0_936_release() : reactNativeWorkaroundService);
    }

    private final void attach(View view) {
        if (((view instanceof TextView) && view.isFocusableInTouchMode()) || (view instanceof EditText)) {
            TextView textView = (TextView) view;
            detach(textView);
            TextListenerWrapper textListenerWrapperCreateWrapper$sdk_3_3_0_936_release = createWrapper$sdk_3_3_0_936_release(view);
            textView.addTextChangedListener(textListenerWrapperCreateWrapper$sdk_3_3_0_936_release);
            this.viewListenersHashMap.put(view, textListenerWrapperCreateWrapper$sdk_3_3_0_936_release);
        }
    }

    private final void detach(TextView textView) {
        if (this.viewListenersHashMap.containsKey(textView)) {
            textView.removeTextChangedListener(this.viewListenersHashMap.get(textView));
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

    public final TextListenerWrapper createWrapper$sdk_3_3_0_936_release(View textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        return new TextListenerWrapper(textView, this, this.reactNativeService.isReactNativeEditText(textView));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void handle$sdk_3_3_0_936_release(ViewsDetectedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator<View> it = event.getViews().iterator();
        while (it.hasNext()) {
            attach(it.next());
        }
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.elements.TextChangeDelegate
    public synchronized void onTextChanged(View view, CharSequence charSequence, int i2, int i3, int i4) {
        if (isEnabled()) {
            if (charSequence == null) {
                return;
            }
            if (view != null) {
                try {
                    String strMaskInputs = this.textMaskingService.maskInputs(TextMaskingService.getResourceName$default(this.textMaskingService, view, null, 2, null), charSequence.toString());
                    Iterator<ElementEventObserver> it = this.elementEventObservers.iterator();
                    while (it.hasNext()) {
                        it.next().notifyElementEvent(new ElementEventData(ElementEventType.INPUT, view.hashCode(), charSequence.toString().length(), strMaskInputs));
                    }
                } catch (Throwable th) {
                    Log.Companion.getLogger().error("failed to capture input event", th);
                }
            }
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
