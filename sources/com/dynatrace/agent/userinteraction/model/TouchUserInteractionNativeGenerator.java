package com.dynatrace.agent.userinteraction.model;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.dynatrace.agent.userinteraction.util.UserInteractionMaskingValidator;
import com.dynatrace.agent.userinteraction.util.UserInteractionUtilKt;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007fјnjGNLe^.Zݷ2\u000f\u0002{<řc$\bCCU }*\teNo˧vJh\u0017K\u000f\f\u001a~̓Bկs\u000f\u000e\u0012=1znUsZ\u007fAG`\r63!ݨ&:\u007f\u0007\u000f\u001dru\u001ez\u0013Ea\u000b@5pzHX%S\u0015\u001c\"\u0006l(/%\rk\\?`l\fD_)\u0011tZP=^^\t\u0014εТX'\u0013\u0004*(9NO5C4{\u00035^\"?KI\u007fM\u001dhU8SI\"c|XH\u001e#=g\r\f\u0004N\\3]'\fo5]vcP<9 z*\u0019\u0003\u0004V\u00105\\F-Hw0\u000ea\u00019S\tZ\u0010sZ\u007f)r^\u0017S\fy+\n'tQy;GO\u000eީ\u0007ڟ\"#\t͙ĸ_k"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<vq,[Z0VL[(ZavG\u001dzV\u001dR<\rfYJ${@F)\u0015\u0002", "", ";`b8\\5@D\u0015\u0006~](\f\u0013<", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_>\\GB5$,\u0015uEB\u0016c9Jt6KVW\u0014X`xA\u001d\u0014K\nU/\f\u0001hK1D", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ'%G|\u0012E\u0006%BU{/;w\u001fw]R?r}\u000e#hn\u001d\u0010r,[r%VPX5DN\u0001C\u0018\u001b\\~J2\u0011\u0004UP.{\u001az\u0010", "5d]2e(MS", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<vq,[Z0VL[(ZavG\u001dg", "Bnd0[\u0013Ba(", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<ft,W\u0006|", "@n^AI0>e", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "7mc2e(<b\n\u0003zp", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5d]2e(MSW|\u0005f&{\u001d8a\u000f5w>\u0001\u0011\u0013Io\u0017Kp25`}\u001cEm", "5dc\"\\\fES!~\u0004m", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\u000e\u0019Hh9\u000fc5]L", "5dc\"<\fES!~\u0004m\u0010{", "", "5dc#\\,P7\u0018", "5dc\u0015\\,KO&|}r\u0017x\u00182", "5dc#\\,P<\u0015\u0007z", "5dc\u0010_(La\u0002z\u0003^", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class TouchUserInteractionNativeGenerator {
    private static final Companion Companion = new Companion(null);
    private static final String MASKED_LABEL = "***";
    private final UserInteractionMaskingValidator maskingValidator;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176Ȑ\u0005ӯ-(Մ7f\u00198pKkH¯VU0\u000fy|\u00050i&\nCiXpԅt\u07beSNo˧ĚN^"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<vq,[Z0VL[(ZavG\u001dzV\u001dR<\rfYJ${@F)\u0015j'\fCs|\u0015\u001a\u0018>@", "", "\nh]6g\u0005", "u(E", "\u001b@B\u00188\u000b8:t[ZE", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TouchUserInteractionNativeGenerator(UserInteractionMaskingValidator maskingValidator) {
        Intrinsics.checkNotNullParameter(maskingValidator, "maskingValidator");
        this.maskingValidator = maskingValidator;
    }

    private final String getClassName(View view) {
        String simpleName = view.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    private final String getHierarchyPath(View view) {
        if (view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return getClassName(view);
        }
        String viewId = getViewId(view);
        if (viewId.length() == 0) {
            Object parent = view.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
            return getHierarchyPath((View) parent);
        }
        StringBuilder sbAppend = new StringBuilder().append(viewId).append(AbstractJsonLexerKt.BEGIN_LIST);
        ViewParent parent2 = view.getParent();
        Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        String string = sbAppend.append(((ViewGroup) parent2).indexOfChild(view)).append(AbstractJsonLexerKt.END_LIST).toString();
        StringBuilder sb = new StringBuilder();
        Object parent3 = view.getParent();
        Intrinsics.checkNotNull(parent3, "null cannot be cast to non-null type android.view.View");
        return sb.append(getHierarchyPath((View) parent3)).append('/').append(string).toString();
    }

    private final String getUIElementId(View view) {
        String hierarchyPath = getHierarchyPath(view);
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        Integer numValueOf = viewGroup != null ? Integer.valueOf(viewGroup.indexOfChild(view)) : null;
        String viewId = getViewId(view);
        if (viewId.length() == 0 || numValueOf == null) {
            return hierarchyPath + '/' + getClassName(view) + AbstractJsonLexerKt.BEGIN_LIST + (numValueOf != null ? numValueOf.intValue() : 0) + AbstractJsonLexerKt.END_LIST;
        }
        return StringsKt.substringBeforeLast$default(hierarchyPath, RemoteSettings.FORWARD_SLASH_STRING, (String) null, 2, (Object) null) + '/' + viewId + AbstractJsonLexerKt.BEGIN_LIST + numValueOf + AbstractJsonLexerKt.END_LIST;
    }

    private final UiElement getUiElement(View view) {
        return new UiElement(getViewName(view), getClassName(view), getUIElementId(view));
    }

    private final String getViewId(View view) {
        try {
            String resourceName = view.getResources().getResourceName(view.getId());
            Intrinsics.checkNotNull(resourceName);
            return StringsKt.contains$default((CharSequence) resourceName, (CharSequence) ":id/", false, 2, (Object) null) ? StringsKt.substringAfter$default(resourceName, ":id/", (String) null, 2, (Object) null) : resourceName;
        } catch (Resources.NotFoundException unused) {
            return view.getContentDescription() != null ? view.getContentDescription().toString() : (view.getTag() == null || this.maskingValidator.isMaskedByTag(view)) ? getClassName(view) : view.getTag().toString();
        }
    }

    private final String getViewName(View view) {
        if (this.maskingValidator.isViewMasked(view)) {
            return MASKED_LABEL;
        }
        if (!(view instanceof TextView)) {
            return getClassName(view);
        }
        CharSequence text = ((TextView) view).getText();
        String string = text != null ? text.toString() : null;
        String str = string;
        if (str == null || str.length() == 0) {
            string = null;
        }
        return string == null ? getClassName(view) : string;
    }

    public final TouchUserInteraction generate$com_dynatrace_agent_release(List<TouchEvent> touchList, ViewGroup rootView, View view) {
        Intrinsics.checkNotNullParameter(touchList, "touchList");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        TouchEvent touchEvent = (TouchEvent) CollectionsKt.lastOrNull((List) touchList);
        if (touchEvent == null) {
            return null;
        }
        View viewFindTopView = UserInteractionUtilKt.findTopView(rootView, (int) touchEvent.getX(), (int) touchEvent.getY());
        List<TouchEvent> list = touchList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TouchEvent) obj).getAction() == TouchAction.MOVE) {
                arrayList.add(obj);
            }
        }
        List listFilterDistantTouches$default = TouchEventKt.filterDistantTouches$default(arrayList, 0, 1, null);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            TouchEvent touchEvent2 = (TouchEvent) obj2;
            if (touchEvent2.getAction() != TouchAction.MOVE || listFilterDistantTouches$default.contains(touchEvent2)) {
                arrayList2.add(obj2);
            }
        }
        return new TouchUserInteraction(arrayList2, getUiElement(viewFindTopView), view != null ? getUiElement(view) : null);
    }
}
