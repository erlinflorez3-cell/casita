package com.dynatrace.android.compose.userinteraction.handler;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.unit.IntSizeKt;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.useraction.OneAgentUserInteractionManagerBridge;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.compose.userinteraction.uitl.UserInteractionsUtilKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0005I\u0006>*6B\u0015\"4ߚ\u007f\u0007tjA0JiP.`\\2şs{BBc$\u007fOCU ~*\teNo˧tIpŏs\u000f4\u00159o߽MW~] \u0010zU}DKM\u001eCid\u0003=\u001d `&~цڱ\u0005\u001a0PX\n\tLc\f@6ptHY%M3\u001eXß̧$\u0001$f0}DS\u0005]h5S\u0007wIf'\u000e4-Q\u001bRl';\u0004\u0012.9NOA%-c\t\u0017Tk?1O L3wmݐȅMs]G!\u0014\"'CU\u001d_\u0003&\u000b\t\u007fo<+9b{K~\"nwK\u000e\u001b>\u001c\u0014\u0016)X.[\u001e\u0015\u000bdޚvɤW@X\u061c\u07b2F\u0015"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~i\f Dq\u001f=MP7iC\"\u001fq+<\u0003l+Uv4\u0011;X<ZUbK\u0014\u001f>\u0017]+\u001a\u0001WP(xM\u001a\u001b\u0011+P\u0002H>", "", "\nh]6g\u0005", "u(E", ":`h<h;%W'\u000e", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u001bv\u00178#", "=m0Ag(<V", "", ":`h<h;\"\\\u001a\t", "=m0Ag(<VWz|^5\f\u00033n\u000e7\tP\t\u0017 Vy\u001b\u0018a\t/W\b(Bw$.GP;r4\u001a#h", "=m32g(<V", "=m32g(<VWz|^5\f\u00033n\u000e7\tP\t\u0017 Vy\u001b\u0018a\t/W\b(Bw$.GP;r4\u001a#h", "=m=<W,\u001c]#\fyb5x\u00189rb,\u000b", "6`b\u0015\\;", "", "Ad`BX5MW\u0015\u0006eZ;\u007fo3s\u000f", "", "", "=m=<W,\u001c]#\fyb5x\u00189rb,\u000b~|\u0019\u0017P~\b@\u007f3Df\u000e(7v%8Z\u001f&O.\u001c\u001fplC\u0015c&[v.GH\\,", "5dc\u001ci,KZ\u0015\n\u0006^+c\u0005Co\u00107\n", "@dRA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class TouchUserInteractionHandler {
    public static final int $stable = 8;
    private final List<LayoutInfo> layoutList = new ArrayList();

    private final List<LayoutInfo> getOverlappedLayouts(final Rect rect) {
        return SequencesKt.toList(SequencesKt.filter(CollectionsKt.asSequence(this.layoutList), new Function1() { // from class: com.dynatrace.android.compose.userinteraction.handler.TouchUserInteractionHandler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TouchUserInteractionHandler.getOverlappedLayouts$lambda$0(rect, (LayoutInfo) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOverlappedLayouts$lambda$0(Rect rect, LayoutInfo layoutInfo) {
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        return UserInteractionsUtilKt.isValid(layoutInfo) && LayoutCoordinatesKt.boundsInWindow(layoutInfo.getCoordinates()).overlaps(rect);
    }

    public final void onAttach$agent_instrumentorAPI_compose_release(LayoutInfo layoutInfo) {
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        this.layoutList.add(layoutInfo);
    }

    public final void onDetach$agent_instrumentorAPI_compose_release(LayoutInfo layoutInfo) {
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        this.layoutList.remove(layoutInfo);
    }

    public final void onNodeCoordinatorHit$agent_instrumentorAPI_compose_release(LayoutInfo layoutInfo, boolean z2, List<? extends List<String>> sequentialPathList) {
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        Intrinsics.checkNotNullParameter(sequentialPathList, "sequentialPathList");
        if (UserInteractionsUtilKt.isValid(layoutInfo) && !z2) {
            Rect rectM3977Recttz77jQw = RectKt.m3977Recttz77jQw(LayoutCoordinatesKt.positionInWindow(layoutInfo.getCoordinates()), IntSizeKt.m6820toSizeozmzZPI(layoutInfo.getCoordinates().mo5522getSizeYbymL2g()));
            List<LayoutInfo> overlappedLayouts = getOverlappedLayouts(rectM3977Recttz77jQw);
            Utility.devLog(OneAgentLoggingKt.TAG_USER_INTERACTION, "NodeCoordinator hit in area " + rectM3977Recttz77jQw + " for " + layoutInfo.getSemanticsId());
            OneAgentUserInteractionManagerBridge oneAgentUserInteractionManagerBridge = Core.getOneAgentUserInteractionManagerBridge();
            if (oneAgentUserInteractionManagerBridge != null) {
                oneAgentUserInteractionManagerBridge.onComposeHit(layoutInfo, overlappedLayouts, sequentialPathList);
            }
        }
    }
}
