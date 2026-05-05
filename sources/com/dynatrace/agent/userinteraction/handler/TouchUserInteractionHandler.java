package com.dynatrace.agent.userinteraction.handler;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.layout.LayoutInfo;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSource;
import com.dynatrace.agent.userinteraction.model.ComposeHitEvent;
import com.dynatrace.agent.userinteraction.model.TouchEvent;
import com.dynatrace.agent.userinteraction.model.TouchUserInteraction;
import com.dynatrace.agent.userinteraction.model.TouchUserInteractionGenerator;
import com.dynatrace.agent.userinteraction.model.TouchUserInteractionKt;
import com.dynatrace.agent.userinteraction.util.UserInteractionLogger;
import com.dynatrace.agent.userinteraction.util.UserInteractionTracker;
import com.dynatrace.agent.userinteraction.util.UserInteractionUtilKt;
import com.dynatrace.agent.util.CoroutineHandler;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
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
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yCAV\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001̓4Icxe܈\u00172XoG\u074cUoS9ht<\t(288\u0002ڎ\t\u001a8f\u0018͌\u0003CY\u0018\u001a0FpBR#M\r\u001a\u0018\u0007DĨ\u0017Ȧz\u0010~6vk\u000e:]#;hj\u000fTo4\u000bN%F\u0003)\u001dzo!C@e9%)a\b\u001fR\nE\u0013C\u007fD\u001dhU/;M\u0002`NX.\u001eƦ/Q\u0013h\u00012% _s$'Yc\u0014O^#@w)\u0012=@\u0012%\u001e'vFsԿǴ\f\u000e9\u000e;fNj\u001a^p\u0014+eD2=\u007faA\u007fӕƻUaA5\u0017l\n\"%\u001eQ\u0015\u001f%ir&`C:\u0005\u0002_QiFMJ^\n\b\\\u001c%!r\u0010L\u001c<W\b?\u0002!0'%e~gDO\rH҆זkv\u000b\u00051mww`@P\u0003F=8\u001e$\\Zc3\u0012\u0001ZfS)O2S5\u0014N\u0013ph\u0006?9%>R&řkҷQ]\u0012ɘ\u007frE^\u0007k<]\u0010ӗ5̳Uc\u0018Р#\u0003\"FTb3`=̾U۱^\\0ί\u0003Tx\u0019\u0010{rXbƑ4Ɛu\u001c<ι\u0002'j\"`\u00054Ao\u000b_ݣfӳ\u0014~\\՜t\u0011w3\r\u000b\u0017O\u000b\u0001F\u03a2\u0005ͅ0|hõ}O_F1(k!\u0017FSɀ\u0013ҋw\u007fOх֟Ku"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_1IL:r4+^WkI\u0005f\u001c\\v4+U],iNpL\u0018\u001ccpJ4\f\fYNy", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011&\u001bN9kF\u0004/Eh\u0002)7P\u00127LJ;x\n", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_1IL:r4+^Xo9\u0014G5]v4CJ]0f[U9\u001d\u0011a\u000e[\u0001", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "CrT?<5MS&zxm0\u0007\u0012\u0016o\u0002*{M", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_>\\GB5$,\u0015uEB\u0016c9Jt6KVW\u0013fTt=!g", "CrT?<5MS&zxm0\u0007\u0012\u001er{&\u0002@\u000e", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_>\\GB5$,\u0015uEB\u0016c9Jt6KVW\u001biNpC\u0014\u001f0", "Bnd0[\u001cLS&b\u0004m,\n\u0005-t\u00042\u0005\"\u0001 \u0017Tk\u001dF\u0004", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<vq,[Z0VL[(ZavG\u001dsZ\u0017N8\t\u0014cNy", "AdaCX9\u001c]\"\u007f~`<\n\u0005>i\n1Z<\u0010\u0013\u0005Q\u007f\u001b:v", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6e1nL\u0010\u007fd\u001e[)\rZ", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|,WK\u0005jH'\u0011wn5\u0005cuJx'P[\u0018<jR\u007fA\u001d!Z\u001bJ)\u001c\tcJm~S;&Q\u001cW\u0002HL\n\u001b\u0016\u001b1h\u007fF`\u0019.\u0004\u0017wA6>-Wi\u0002\u0011@Yk&s\u0019[\u001b\\\u00046&\u0014z(dx^.\u0017\u007f\\ r_uevK#\u0004\u00024Mqb\u00105}UIX0.K\ts\u0010A\\~4c:\u007f206qZ2e\"F(w)5XP4\"4<\\;Mc~{\b\u001ev\u001fn\f\u0017q5>\u0015ctgR\u0018Pe!Z5h)oAb\u0004A9}\u00154*\bQ[\u0007\u0011\u0007\u0016(wn+C$T\u000e\u0016\u007fN/5w\u0001\rna\u001bB\u001f9h\u001cd(_\u0001I\u0015\tqGU\nhM\"lJ\u00107V\u007f[Xo16\u0002\u000fIj!KI\bRPM\u001a\u001f5\u0005\r\u000f*oxF\u0004?q!49GBrm-\u000b=\u0017\u0013", "CoC<h*A3*~\u0004m", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<ft,W\u0006|", "1n\\=b:>6\u001d\u000eZo,\u0006\u0018", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}{\u001fplC\u0015c\u000fR\u0006\u0007XLW;2", "Bnd0[\fOS\"\u000e_h)", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "=m<<g0H\\x\u0010zg;", "", "@n^AI0>e", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "=m<<g0H\\x\u0010zg;;\u00079my'\u0010I|&$Cm\u000e6r'5b\r\u001aDm\u001d.IQ;", "=mE6X>\u001cZ\u001d|\u0001", "DhTD", "=mE6X>\u001cZ\u001d|\u0001\u001d*\u0007\u0011)d\u00141wO\u000e\u0013\u0015Gi\n>v.DS\u000b >m\u0012<M", "=m2<`7Ha\u0019a~m", "6hc\u000ee,:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u001bv\u00178#", "=uT?_(I^\u0019}Vk,x\u0017", "", "Ad`BX5MW\u0015\u0006ab:\f", "", "=m2<`7Ha\u0019a~mjz\u00137_~<\u0005<\u0010$\u0013Eo\b8x%>hw-7t\u0016*[C", ">q^0X:LB#\u000fxa\f\u000e\t8t\u000e", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "7mc2e(<b\n\u0003zp", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class TouchUserInteractionHandler extends CoroutineHandler implements UserInteractionHandler {
    public static final Companion Companion = new Companion(null);
    private static final long NO_INTERACTION_DELAY = 500;
    private ComposeHitEvent composeHitEvent;
    private final ServerConfigurationDataSource serverConfigurationDataSource;
    private Job touchEventJob;
    private final TouchUserInteractionGenerator touchUserInteractionGenerator;
    private TouchEvent upTouchEvent;
    private final UserInteractionLogger userInteractionLogger;
    private final UserInteractionTracker userInteractionTracker;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00126Ȑ\u0005ӳ-(Մ7f\u00198pKkH¯VU0\u000fy|\u00050i&\nCiXpԅt\u07beSNo˧ĚN^"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_1IL:r4+^WkI\u0005f\u001c\\v4+U],iNpL\u0018\u001ccpJ4\f\fYNbLN?*\u00045M\fD>", "", "\nh]6g\u0005", "u(E", "\u001cNN\u0016A\u001b\u001e@t\\iB\u0016e\u0003\u000eEf\u0004o", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchUserInteractionHandler(CoroutineScope coroutineScope, UserInteractionLogger userInteractionLogger, UserInteractionTracker userInteractionTracker, TouchUserInteractionGenerator touchUserInteractionGenerator, ServerConfigurationDataSource serverConfigurationDataSource) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(userInteractionLogger, "userInteractionLogger");
        Intrinsics.checkNotNullParameter(userInteractionTracker, "userInteractionTracker");
        Intrinsics.checkNotNullParameter(touchUserInteractionGenerator, "touchUserInteractionGenerator");
        Intrinsics.checkNotNullParameter(serverConfigurationDataSource, "serverConfigurationDataSource");
        this.userInteractionLogger = userInteractionLogger;
        this.userInteractionTracker = userInteractionTracker;
        this.touchUserInteractionGenerator = touchUserInteractionGenerator;
        this.serverConfigurationDataSource = serverConfigurationDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMotionEvent$lambda$0(TouchUserInteractionHandler touchUserInteractionHandler, View view) {
        touchUserInteractionHandler.processTouchEvents((ViewGroup) view, null);
        return Unit.INSTANCE;
    }

    private final void processTouchEvents(ViewGroup viewGroup, View view) {
        if (!this.serverConfigurationDataSource.getServerConfiguration().isTouchUserInteractionEnabled()) {
            Utility.devLog(OneAgentLoggingKt.TAG_USER_INTERACTION, "Touch User Interaction cannot be tracked, userInteractions config disabled for touches");
            return;
        }
        Job job = this.touchEventJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (viewGroup != null) {
            TouchEvent touchEvent = this.upTouchEvent;
            if (touchEvent == null) {
                return;
            }
            TouchUserInteraction touchUserInteractionGenerateCompose = this.touchUserInteractionGenerator.generateCompose(CollectionsKt.listOf(touchEvent), this.composeHitEvent);
            if (touchUserInteractionGenerateCompose == null) {
                touchUserInteractionGenerateCompose = this.touchUserInteractionGenerator.generateNative(CollectionsKt.listOf(touchEvent), viewGroup, view);
            }
            if (touchUserInteractionGenerateCompose != null) {
                this.userInteractionLogger.logTouchUserInteraction$com_dynatrace_agent_release(touchUserInteractionGenerateCompose);
                this.userInteractionTracker.track$com_dynatrace_agent_release(TouchUserInteractionKt.toJSONObject(touchUserInteractionGenerateCompose));
            }
        }
        this.upTouchEvent = null;
        this.composeHitEvent = null;
    }

    public final void onComposeHit$com_dynatrace_agent_release(LayoutInfo hitArea, List<? extends LayoutInfo> overlappedAreas, List<? extends List<String>> sequentialList) {
        Intrinsics.checkNotNullParameter(hitArea, "hitArea");
        Intrinsics.checkNotNullParameter(overlappedAreas, "overlappedAreas");
        Intrinsics.checkNotNullParameter(sequentialList, "sequentialList");
        this.composeHitEvent = new ComposeHitEvent(hitArea, overlappedAreas, sequentialList);
    }

    public final void onMotionEvent$com_dynatrace_agent_release(final View rootView, MotionEvent event) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(event, "event");
        if (rootView instanceof ViewGroup) {
            Job job = this.touchEventJob;
            if (job != null && job.isActive()) {
                processTouchEvents((ViewGroup) rootView, null);
            }
            TouchEvent touchEvent = new TouchEvent(UserInteractionUtilKt.getActionName(event), event.getX(0), event.getY(0));
            this.userInteractionLogger.logTouchEvent$com_dynatrace_agent_release(touchEvent);
            if (event.getAction() == 1) {
                this.upTouchEvent = touchEvent;
                this.touchEventJob = launchWithDelay(NO_INTERACTION_DELAY, new Function0() { // from class: com.dynatrace.agent.userinteraction.handler.TouchUserInteractionHandler$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TouchUserInteractionHandler.onMotionEvent$lambda$0(this.f$0, rootView);
                    }
                });
            }
        }
    }

    public final void onViewClick$com_dynatrace_agent_release(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View rootView = view.getRootView();
        ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        if (viewGroup == null) {
            return;
        }
        processTouchEvents(viewGroup, view);
    }
}
