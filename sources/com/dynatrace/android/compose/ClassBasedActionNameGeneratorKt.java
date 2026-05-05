package com.dynatrace.android.compose;

import androidx.compose.ui.semantics.Role;
import com.dynatrace.android.compose.pager.PagerInfo;
import com.dynatrace.android.compose.pullrefresh.PullRefreshInfo;
import com.dynatrace.android.compose.slider.RangeSliderInfo;
import com.dynatrace.android.compose.slider.SliderInfo;
import cz.msebera.android.httpclient.message.TokenParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d̉=!,u\bӵLc\u000b\u0004Iي8\u000bDB\u0007\"B\u0012\u007fјnjG9Le^.ZS@\u000fs{J$c$\bCC٥\"}8\tWȞ\u007f{|Jr\u000bq\u000e.\u0016'k\\Oczu\u0014%1pn\u0006\u074ce\u0004K9xtd\u0004H2P;*\u000b\u000f\u001cBJ&u)B\u0012È*LNpRR;L-\u001a@\nn&\u000f tid5vk\u000e>=(\u001bipTmڿH\u0011[\r^TU\f\u001faL2p=C\u0017=U\u0019\u0006\u0001Z\u0006šW\u000eK\u0005\u0001'U*qs\u0006>\t\u0006\"\u0017CQ#\\!%\r\t_e$'YU*֟h*6w\u0013{;;,\u000e40x4;\u001c~\n$2#q\u0004D^\u0007vB.\u0001(ا/A\u000e3C9Ieyai#~=\n\u0007% 9\u007f\u001d \fX\u001ce-\u001b\u0003}\u0018ĸiJKSf\n\b<\u0016\u0004\u001faH*\u001c>U\u000bG{?-?)G[?$OwHHds\u0005ݓxh\u0002h)̵\u0013̱r\u0016?ѧÇ\u0010g"}, d2 = {"\u0011N<\u001dB\u0015\u001e<\bxc:\u0014\\", "", "5d]2e(MSt|\nb6\u0006q+m\u007f", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~7\u0005$5s\u0012+TC\u001ft5(j", "Ad\\.a;BQ'gvf,", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~H\b\"9t\u0016*JJ;O=\u001f\u001f>", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~G\u0010$Bm\u0012+TC\u001ft5(j", "6hS2H:>`wz\nZ", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~d\u000e'>z\u0016/ZCIn}\t%oh&\u0007d9N\u0005*+UO62", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~g\u0005$6m#w;J?j4+xqbC\\", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~g\u0005$6m#w:?Dm4\f\u001cl`9\u0014G5O\u0001|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~dy\"7z_\u0019IE;x\u0018'\u0016r7", "1kP@f\u0015:[\u0019p~m/\u0007\u0019>P{&\u0002<\u0003\u0017", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ClassBasedActionNameGeneratorKt {
    private static final String COMPONENT_NAME = "component";

    private static final String classNameWithoutPackage(Class<?> cls) {
        String name = cls.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return classNameWithoutPackage(name);
    }

    private static final String classNameWithoutPackage(String str) {
        return StringsKt.substringAfterLast$default(str, '.', (String) null, 2, (Object) null);
    }

    public static final String generateActionName(ClickableInfo clickableInfo, String str) {
        String strM5931toStringimpl;
        Intrinsics.checkNotNullParameter(clickableInfo, "<this>");
        Role roleM7131getRoleRLKlGQI = clickableInfo.m7131getRoleRLKlGQI();
        if (roleM7131getRoleRLKlGQI == null || (strM5931toStringimpl = Role.m5931toStringimpl(roleM7131getRoleRLKlGQI.m5932unboximpl())) == null) {
            strM5931toStringimpl = COMPONENT_NAME;
        }
        return str != null ? "Touch on " + str : "Touch on " + strM5931toStringimpl + " with function " + classNameWithoutPackage(clickableInfo.getFunction().getClass());
    }

    public static final String generateActionName(SwipeableInfo swipeableInfo, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(swipeableInfo, "<this>");
        return z2 ? "Swipe component with " + classNameWithoutPackage(swipeableInfo.getSourceName()) : str != null ? "Swipe " + str + " to " + classNameWithoutPackage(swipeableInfo.getSourceName()) + TokenParser.SP + swipeableInfo.getToState() : "Swipe to " + classNameWithoutPackage(swipeableInfo.getSourceName()) + TokenParser.SP + swipeableInfo.getToState();
    }

    public static final String generateActionName(ToggleableInfo toggleableInfo, String str) {
        String strM5931toStringimpl;
        Intrinsics.checkNotNullParameter(toggleableInfo, "<this>");
        Role roleM7133getRoleRLKlGQI = toggleableInfo.m7133getRoleRLKlGQI();
        if (roleM7133getRoleRLKlGQI == null || (strM5931toStringimpl = Role.m5931toStringimpl(roleM7133getRoleRLKlGQI.m5932unboximpl())) == null) {
            strM5931toStringimpl = COMPONENT_NAME;
        }
        return str != null ? "Touch on " + str : "Touch on " + strM5931toStringimpl + " with function " + classNameWithoutPackage(toggleableInfo.getSourceName());
    }

    public static final String generateActionName(PagerInfo pagerInfo, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(pagerInfo, "<this>");
        return (str == null || z2) ? "Swipe to page index " + pagerInfo.getCurrentPage() : "Swipe " + str + " to page index " + pagerInfo.getCurrentPage();
    }

    public static final String generateActionName(PullRefreshInfo pullRefreshInfo, String str) {
        Intrinsics.checkNotNullParameter(pullRefreshInfo, "<this>");
        return str != null ? "Swipe to refresh " + str : "Swipe to refresh component with function " + classNameWithoutPackage(pullRefreshInfo.getOnRefresh().getClass());
    }

    public static final String generateActionName(RangeSliderInfo rangeSliderInfo, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(rangeSliderInfo, "<this>");
        return (str == null || z2) ? "Slide component with function " + classNameWithoutPackage(rangeSliderInfo.getSource().getClass()) : "Slide to select " + str;
    }

    public static final String generateActionName(SliderInfo sliderInfo, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(sliderInfo, "<this>");
        return (str == null || z2) ? "Slide component with function " + classNameWithoutPackage(sliderInfo.getSource().getClass()) : "Slide to select " + str;
    }
}
