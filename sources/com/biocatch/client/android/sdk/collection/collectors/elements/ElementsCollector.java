package com.biocatch.client.android.sdk.collection.collectors.elements;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.Group;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.collection.collectors.elements.ElementModel;
import com.biocatch.android.commonsdk.collection.collectors.touch.TouchLocation;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.core.masking.CoordinatesMaskingService;
import com.biocatch.android.commonsdk.core.masking.TextMaskingService;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.events.ViewsDetectedEvent;
import com.dynatrace.android.agent.Global;
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
@Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yCAU\"}8\tWNmhvJp\u000bK\u000f\f\u0017\u0001j:O]ތe\u0012\u001d>JoE4UoKBhҚ>\u0005.2*\u0600\u0002\u0005\u0017\u001a2Ϻ\u0018v\u0011CS\f\u00183HpPR\u0015M\u000b\u001f\u001a\u0006T \t\u001ebhTȤ^Ǎ\u000e@?%\u0013ipNU^p(]\u0011TU?\r%c./N:M\u0015SW\u0013\u000b``W\u0003mwM\tv.?+w{g:f\t,\u0015YYոar4gMon(?+}\u0001{T\u001cF\u0010z*,l\b\u001c&?H\\NJj\u00160Kt!h\u0007PJlP#\u0013ad4U\u0004A2Q\u001b\u0015Y(OadE \u001d\rL:1r/yl\u000e\u000f4KX\u0006vIQnT\u000fNRgK\u0014\u001cp\u0011)Z\b>e\u0018/*0t\u0017mEia;!\u001a\u0019xHu\u001c\u001d`\u0017j0R\u0011V0\u0018.7X <^R\u0003\u001dk~s\t0\u001fr4T5\u0015N\u0013hj\u0006f9%>e\u007flw\te]8Duf\u007fq|\u0017&Wguc;_\u0002(chuB^lf\u0013}~B\u0002#!\\p0@t\u0003\u0010&\u0013tR\u001a1J? ;z,y'jB`\u0003L_q\u0001\u0017\u000erh>.\u001b8l\twT\r\t/m#\u00058m\u0007zD|\u000f?sU\"G'2m\"\u0017A3w]ѿuõKkdIRz$\u0005&\u000e.&29\u007f@sgeɆ+ɨ\u00061]Nxw_`b3\t\u0004\u0012\u000fip\u0005ԙ\nϡt,hʄ\u001b[b :v\r|yΫfѣ}aNک\u0018ob\u001fs>w\bYʞHҡ<|\rȔn1\u000fp:|c/\u001aڲ\u001fə{\u00147֒2ow\u0006Fy\u0011&\\I<ה.І\u001aszScJIQ\u001ae\rX:$\u001b\u001e\u0019טv͎\fB\u0011ͩ]?VF|p\u0005>$ߕ1̱j\u00074ݸAbi=+o,8\u0005ʁ,ϵG}\u001c٫Ǣ)C"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[:\u0015N3\r\u000ehO\u0002xK>\u001f\u0006;S\u000f\u0011", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pGSN4\\[\u0002K]qa\u000eV+\u0016\u0014AK#nK\r", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "BdgA@(LY\u001d\b|L,\n\u001a3c\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^WaL\u0016K(\\|+PN<,icv;\u0014g", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "1n^?W0GO(~\tF(\u000b\u000f3n\u0002\u0016{M\u0012\u001b\u0015G", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^FkC\u0014b0Wr6GZ6(jXvF\u0016\u007fZ\u001b_/\u000b\u0005/", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G/7k\u00197QA7r\"\u001e\"ye7\u0007quN\b'P[\\u<crF#nj\u001c<+\u001a\u0016]?$D+5)\u0010uF\u0006Ef|\u001b\u0014\u0011~fyAc\u001aKx^sK1pPbmxM\u000bCl7dUO,`AHyzo##2M2\u0014yO pUCcpF&\u0005<#\bkeNMy^Js-hI\u0006\u0005\u0012{`p9z1\r6s%d\u0018ZO\u0014Ld|\u001e.JA47::\u0013\u00152a\u007ft\b\u000bl)_\u0004\u001d`8z\u0015ndpR\u0013\u0006'\u0015e=ii\nEQ\f\bGy\u001e(J\u0001Rhu$\r\u0011-7CSL\u001cX\u0003*}@1c\u001b\fof#&<\u001aLc\u001c|\u007fF5W\u001bRe<\u0016yUR\u0013s\u0012\fvJ\u007fe[nm4\u0003\u0019Q+<Y;|\u001cAy\u001d\u0016}\t\u0007\r#wrDC\u0014\u001d/2<]A^o/\u0019OO0\u001fkA\u001e\r->\u0013V>n4;\u0018", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "3kT:X5MB\u0015\u0001kZ3\r\t\u0017a\u0013\u000f{I\u0003&\u001a", "", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "7r0Bg6\u001eZ\u0019\u0007zg;`\b\u000fn{%\u0003@\u007f", "", "1n[9X*M3 ~\u0003^5\f", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "@db<h9<S'", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3\u000b", "1n]AX?M7w", "1n]3\\.N`\u0019", "5dc\u0015\\5M", "@db<h9<S\u0002z\u0003^", "5dc\u0019b*:b\u001d\t\u0004", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pVV^*_\u001caG$\u0010]tX)\t\u0014]K-D", "5dc\u001aT:DS\u0018kzl6\r\u0016-eh$\u0004@", "5dc!T.", "5dc\"a0Jc\u0019by", "5dc#T3NS", "5dc#\\,P7\"}zq", "6`]1_,", "3uT;g", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r,o40#GaH\u0007a;Nu\u0007XLW;2", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ElementsCollector extends ContinuousCollector<ElementModel> {
    private final ConfigurationRepository configurationRepository;
    private final CoordinatesMaskingService coordinatesMaskingService;
    private int elementTagValueMaxLength;
    private final EventBusService eventBusService;
    private boolean isAutoElementIdEnabled;
    private final TextMaskingService textMaskingService;
    private final Utils utils;

    public ElementsCollector(EventBusService eventBusService, Utils utils, TextMaskingService textMaskingService, ConfigurationRepository configurationRepository, CoordinatesMaskingService coordinatesMaskingService) {
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(textMaskingService, "textMaskingService");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(coordinatesMaskingService, "coordinatesMaskingService");
        this.eventBusService = eventBusService;
        this.utils = utils;
        this.textMaskingService = textMaskingService;
        this.configurationRepository = configurationRepository;
        this.coordinatesMaskingService = coordinatesMaskingService;
        this.elementTagValueMaxLength = configurationRepository.getInt(ConfigurationFields.elementTagValueMaxLength);
        this.isAutoElementIdEnabled = configurationRepository.getBoolean(ConfigurationFields.enableAutoElementId);
    }

    private final void collectElement(View view, Resources resources, int i2) {
        try {
            TouchLocation location = getLocation(view);
            String resourceName = this.textMaskingService.getResourceName(view, resources);
            String uniqueId = "";
            if (this.isAutoElementIdEnabled) {
                uniqueId = getUniqueId(view);
                Log.Companion.getLogger().debug("PrintUniqueId: contextID: " + i2 + ", uniqueId: " + uniqueId);
            }
            addToQueue(new ElementModel(Integer.valueOf(i2), view.hashCode(), getTag(view, resourceName), getMaskedResourceName(resourceName), null, view.getClass().getSimpleName(), Integer.valueOf(location.getX()), Integer.valueOf(location.getY()), Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()), null, null, getHint(view, resourceName), null, null, getValue(view, resourceName), this.utils.currentTimeMillis(), uniqueId, 27664, null));
        } catch (Throwable th) {
            Log.Companion.getLogger().error("Error collection activity element", th);
        }
    }

    private final String getHint(View view, String str) {
        String string;
        CharSequence hint;
        if (!(view instanceof TextView) || (hint = ((TextView) view).getHint()) == null || (string = hint.toString()) == null) {
            string = "";
        }
        return TextMaskingService.maskIfEnabled$default(this.textMaskingService, str, string, true, false, 8, null);
    }

    private final TouchLocation getLocation(View view) {
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return this.coordinatesMaskingService.maskTouch(new TouchLocation(iArr[0], iArr[1]));
    }

    private final String getMaskedResourceName(String str) {
        return TextMaskingService.maskIfEnabled$default(this.textMaskingService, str, str, false, false, 12, null);
    }

    private final String getTag(View view, String str) {
        Object tag = view.getTag();
        if (tag == null) {
            return "";
        }
        String string = tag.toString();
        int length = string.length();
        int i2 = this.elementTagValueMaxLength;
        if (length > i2) {
            string = string.substring(0, i2);
            Intrinsics.checkNotNullExpressionValue(string, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return TextMaskingService.maskIfEnabled$default(this.textMaskingService, str, string, false, false, 12, null);
    }

    private final String getUniqueId(View view) {
        StringBuilder sb = new StringBuilder();
        View view2 = view;
        while (view2 != null) {
            if (!Intrinsics.areEqual(view2, view)) {
                sb.insert(0, Global.UNDERSCORE);
            }
            sb.insert(0, getViewIndex(view2));
            sb.insert(0, view2.getClass().getSimpleName());
            Object parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uniqueId.toString()");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca A[PHI: r0
  0x00ca: PHI (r0v15 java.lang.String) = (r0v11 java.lang.String), (r0v14 java.lang.String), (r0v20 java.lang.String) binds: [B:56:0x00c6, B:46:0x00a3, B:39:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String getValue(android.view.View r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.biocatch.client.android.sdk.collection.collectors.elements.ElementsCollector.getValue(android.view.View, java.lang.String):java.lang.String");
    }

    private final String getViewIndex(View view) {
        int iIndexOfChild;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        return (viewGroup == null || (iIndexOfChild = viewGroup.indexOfChild(view)) < 0) ? "" : String.valueOf(iIndexOfChild);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handle$lambda-0, reason: not valid java name */
    public static final void m7041handle$lambda0(ElementsCollector this$0, View view, ViewsDetectedEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(event, "$event");
        this$0.collectElement(view, event.getResources(), this$0.getContextIDCache().get());
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public synchronized void configure(ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        super.configure(configurationRepository);
        this.elementTagValueMaxLength = this.configurationRepository.getInt(ConfigurationFields.elementTagValueMaxLength);
        this.isAutoElementIdEnabled = this.configurationRepository.getBoolean(ConfigurationFields.enableAutoElementId);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.Elements;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isElements;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return Group.ELEMENTS;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void handle(final ViewsDetectedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        for (final View view : event.getViews()) {
            view.post(new Runnable() { // from class: com.biocatch.client.android.sdk.collection.collectors.elements.ElementsCollector$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ElementsCollector.m7041handle$lambda0(this.f$0, view, event);
                }
            });
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Elements collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Elements collector is already started. Aborting the start operation.");
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
