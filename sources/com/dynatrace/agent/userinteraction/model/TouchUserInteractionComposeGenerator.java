package com.dynatrace.agent.userinteraction.model;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutInfo;
import com.dynatrace.agent.userinteraction.util.UserInteractionUtilKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6Ȑ\u0007\":0\u007f\u0007|jAӄLe^.ZS0\u000fs{J$c$wDCU(\n*\tUUm˧\u0005Ϻx\"s\u000f4\u00151iC\nZޯa\u0014\u00152Pp\bX[qU;vsd\bP<0<\u0012\u000b\u0011\u001c:H>|)H{\u0012 7XrPQ;UK܅Ū\n>&\nfzuXNJ\u0003\\h:S\rwNf-o2\rM;Q\u0003,=zo+C@e;[%\u001c\r\u0015`s?1N\u001a=3sm'sS\u0002gNX.#=+}\u0018$rnz\u0013bx\fU:wcy[>8\u0006\r\u0014\u0019L\f\u001e\f7J>-Hu6\u0013ay9S\t\\\u0010qZ\u0002\u0011`d&M\u007fa6\u007f\u001b/uoO1Ne\u000b5\u0013,8\u0019p7Z\u0003\u0019\u0011%)f\u0010]AYPCXP\u001aYk|2u\u0011\u0007p\u0004xi\u000eE\u0014\u0011\\&U;iN;!\u001a\rxTu\t\u001dlx[yXXB2nDFX\u000e:_\u000bdʶoh"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<vq,[Z0VL[(ZavG\u001dod\u0016Y5\u001b\u0005;A-nQ3.\u00129\u001f", "", "\nh]6g\u0005", "u(E", "5d]2e(MS", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<vq,[Z0VL[(ZavG\u001dg", "Bnd0[\u0013Ba(", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<ft,W\u0006|", "1n\\=b:>6\u001d\u000eZo,\u0006\u0018", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}{\u001fplC\u0015c\u000fR\u0006\u0007XLW;2", "5d]2e(MSW|\u0005f&{\u001d8a\u000f5w>\u0001\u0011\u0013Io\u0017Kp25`}\u001cEm", "5dc!b7%O-\t\u000bm\b\fs9i\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u001bv\u00178#", "<dP?49>O'", "Bnd0[\fOS\"\u000e", "5dc\u0010_(La", "", "5dc\u0012_,FS\"\u000ecZ4|", "5dc\u0016W", ":`h<h;)]'\u0003\nb6\u0006\u0017", "5dc!l7>4&\t\u0003F,x\u0017?r\u007f\u0013\u0006G\u0005\u0015+", "5d]2e(MS\u0004z\na", ":`h<h;\"\\\u001a\t", "1`[0h3:b\u0019evr6\r\u0018\u001ao\u000e,\u000bD\u000b ", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class TouchUserInteractionComposeGenerator {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String DEFAULT_CLASS_NAME = "Composable";

    @Deprecated
    public static final String DEFAULT_ID = "Compose.undefined_id";

    @Deprecated
    public static final String DEFAULT_NAME = "Compose.undefined_name";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005#2ߝx\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޢ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰\u0013{M8eok<7ҡ\tӯ$2*\u0600ѯ\t\u0007"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<vq,[Z0VL[(ZavG\u001dod\u0016Y5\u001b\u0005;A-nQ3.\u00129\b_Ep\f\b\u001f\u0012?sF", "", "\nh]6g\u0005", "u(E", "\u0012D5\u000eH\u0013-MveVL\u001avq\u000bM_", "", "\u0012D5\u000eH\u0013-M\u0002Zb>", "\u0012D5\u000eH\u0013-M|]", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final String calculateLayoutPosition(LayoutInfo layoutInfo, List<? extends List<String>> list) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Integer.parseInt((String) CollectionsKt.first((List) next)) == layoutInfo.getSemanticsId()) {
                break;
            }
        }
        List list2 = (List) next;
        String str = list2 != null ? (String) CollectionsKt.getOrNull(list2, 1) : null;
        return str == null ? "" : str;
    }

    private final String generatePath(LayoutInfo layoutInfo, List<? extends List<String>> list) {
        if (layoutInfo == null || layoutInfo.getParentInfo() == null) {
            return "";
        }
        String strGeneratePath = generatePath(layoutInfo.getParentInfo(), list);
        String customId = UserInteractionUtilKt.getCustomId(layoutInfo);
        if (customId == null && (customId = UserInteractionUtilKt.getRole(layoutInfo)) == null && (customId = getTypeFromMeasurePolicy(layoutInfo)) == null) {
            customId = DEFAULT_ID;
        }
        return strGeneratePath + '/' + customId + AbstractJsonLexerKt.BEGIN_LIST + calculateLayoutPosition(layoutInfo, list) + AbstractJsonLexerKt.END_LIST;
    }

    private final String getClass(LayoutInfo layoutInfo) {
        String str;
        String role = UserInteractionUtilKt.getRole(layoutInfo);
        if (role != null && (str = "Compose." + role) != null) {
            return str;
        }
        String typeFromMeasurePolicy = getTypeFromMeasurePolicy(layoutInfo);
        return typeFromMeasurePolicy != null ? "Compose." + typeFromMeasurePolicy : DEFAULT_CLASS_NAME;
    }

    private final String getElementName(LayoutInfo layoutInfo) {
        String customName = UserInteractionUtilKt.getCustomName(layoutInfo);
        if (customName != null) {
            return customName;
        }
        String text = UserInteractionUtilKt.getText(layoutInfo);
        return text == null ? DEFAULT_NAME : text;
    }

    private final String getId(LayoutInfo layoutInfo, List<? extends List<String>> list) {
        String customId = UserInteractionUtilKt.getCustomId(layoutInfo);
        return customId == null ? generatePath(layoutInfo, list) : customId;
    }

    private final LayoutInfo getTopLayoutAtPoint(List<? extends LayoutInfo> list, TouchEvent touchEvent) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Rect area = UserInteractionUtilKt.getArea((LayoutInfo) obj);
            if (touchEvent.getX() >= area.getLeft() && touchEvent.getX() <= area.getRight() && touchEvent.getY() >= area.getTop() && touchEvent.getY() <= area.getBottom()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Rect area2 = UserInteractionUtilKt.getArea((LayoutInfo) next);
                float right = (area2.getRight() - area2.getLeft()) * (area2.getBottom() - area2.getTop());
                do {
                    Object next2 = it.next();
                    Rect area3 = UserInteractionUtilKt.getArea((LayoutInfo) next2);
                    float right2 = (area3.getRight() - area3.getLeft()) * (area3.getBottom() - area3.getTop());
                    if (Float.compare(right, right2) > 0) {
                        next = next2;
                        right = right2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        return (LayoutInfo) next;
    }

    private final String getTypeFromMeasurePolicy(LayoutInfo layoutInfo) {
        List<String> groupValues;
        MatchResult matchResultFind$default = Regex.find$default(new Regex("\\s(\\w*MeasurePolicy)\\b"), layoutInfo.toString(), 0, 2, null);
        String str = (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null) ? null : groupValues.get(1);
        if (str != null) {
            return StringsKt.removeSuffix(str, (CharSequence) "MeasurePolicy");
        }
        return null;
    }

    public final TouchUserInteraction generate$com_dynatrace_agent_release(List<TouchEvent> touchList, ComposeHitEvent composeHitEvent) {
        LayoutInfo topLayoutAtPoint;
        Intrinsics.checkNotNullParameter(touchList, "touchList");
        TouchEvent touchEvent = (TouchEvent) CollectionsKt.lastOrNull((List) touchList);
        if (touchEvent == null || composeHitEvent == null || (topLayoutAtPoint = getTopLayoutAtPoint(composeHitEvent.getOverlappedAreas(), touchEvent)) == null) {
            return null;
        }
        UiElement uiElement = new UiElement(getElementName(topLayoutAtPoint), getClass(topLayoutAtPoint), getId(topLayoutAtPoint, composeHitEvent.getSequentialList()));
        LayoutInfo hitArea = composeHitEvent.getHitArea();
        return (TouchEventKt.isInArea(touchEvent, UserInteractionUtilKt.getArea(hitArea)) && UserInteractionUtilKt.isClickable(hitArea)) ? new TouchUserInteraction(CollectionsKt.listOf(touchEvent), uiElement, new UiElement(getElementName(hitArea), getClass(hitArea), getId(hitArea, composeHitEvent.getSequentialList()))) : new TouchUserInteraction(CollectionsKt.listOf(touchEvent), uiElement, null);
    }
}
