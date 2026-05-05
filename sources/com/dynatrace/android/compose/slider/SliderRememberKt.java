package com.dynatrace.android.compose.slider;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d̉=!4i\bӵLc\u000b\u0004I\u0006>\u00106B\r\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<$a$yCQU\"}(\nWN}gvJp\u000bK\u000f\f\u0016\u0001jBI]xc\u0012'uPģW3{nmIntN\u00110428(\u0007\u0011\u001c:H>y)D{\u0012 4XrPQ;R5(\u0018\u0006L&\u0019&li^6vos9]*3mPV?_^\u0006\u0014\fТX'\u001b\u0001yE9KO5C1\u0004\u0013\u0015RsK\u0013A\u0002=3j7);I\"ZdY0\u0018#8g\r\fql[ԇU`\u001a5C\u0019qZh\u000eV\b+\u0012\u001b<\u001c \u0016/X4=\u001cv\b<5#\u0004cB`\u0002\rE.{\u0012<%)\u00185A8Ik\u0002oA\u0019\\=\u0014\r\u001d 3\u0001\u001d$qS<gE\u001fb\u007fi1\u007fI\u0004Gݳ\u000eYK\u007f\u001c\u001ep\u0015B\u0004^[0E\n\u0011F)5?k?3#{\u0002vF\u0016\b\u0015bxS\u0018UvARr$DB\t:j\u000bcʰoPbmµ\u0015c"}, d2 = {"@d\\2`)>`\u0007\u0006~],\ny+l\u0010(\\D\n\u001b%Jo\r\u001ar,<Vy\u001e=", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~g\u0005$6m#w;J?j4+\u0006dhI\u0007D0Wz5JLM\nXYy:\u0010\u0010`c", "=mE._<>1\u001cz\u0004`,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "=mE._<>1\u001cz\u0004`,]\r8i\u000e+{?", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "CrT X4:\\(\u0003xl", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0012O\n\\=2gSccxZ\u000bCl2o\u0016m\u001d&GJ-#u!\u001b2.8\u0012\u0007]\u001fr_OKK\u000b\u007fxB,\bloOA~b8r'hG\u0005v\u001f<\\str7\f?4DdNYn\u001c=^\u0006^\u001acE&&C-\u000fF[cVpG\u0012v\"a\u0007k^<8\u0016aci\u001e", "@d\\2`)>`\u0007\u0006~],\nr8V{/\f@^\u001a\u0013Pq\u000e\u001ar,<Vy\u001e=", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~g\u0005$6m#w;J?j4+\u0006dhI\u0007A/J\u007f)GK,(cYo9\u0012\u00180", "4h]6f/>Rvz\u0002e)x\u00075", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u00075w\u001ewLWDgC+\u0011fa\u0003\u0003l+[\u0001+F\u0016L6d]|K\u0014[h\u0015R*\r\u0012#/+rC7,x(P\u0012;I\u0005\u0015\u001a\u001c8jo R\u0017Nv\u0011sG~OBb^\u0007QEDusb\u0016g(fH:m!\u0002\"*lX.SY]\u0019}\\\bgt\u001d|>\u001f\"Hu%EYxQK\u0002#\u001dKEs\u001b1e~/sv\u0002>2An\u0013K1&Ebw\u00159&/.*5< 0Gj\u0006l\u001c\u0011d(c\b\r@18 baaNd", "@d\\2`)>`\u0006z\u0004`,j\u00103d\u007f5l<\b'\u0017(s\u0017@\u0005(5X[\u001c>t\u0013*KI", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~g\u0005$6m#w:?Dm4\f\u001cl`9\u0014T(U\u0007'(PW0jUr<q\u000ea\u0015K'\u000b\u000b/", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?a\u001e!C~\u0012Ex\u0010?]\u0007/$i\u001f0M\u0019", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0012O\n\\=2gSccxZ\u000bCl2o\u0016m\u001d&GJ-#u!\u001b2.8\u0012\u0007]\u001fr_OKK\u000b\u007fxB,\bloOA~b8r'hG\u0005v\u001f<\\str7\f?4DdNYn\u001c=^\u0006^\u0019XJ)&$C\u0017>KpfhE\u001eh\u007fe\u0011\u0012p81\u0018CajO\f\u0003[\u001d1", "@d\\2`)>`\u0006z\u0004`,j\u00103d\u007f5eIq\u0013\u001eWok?r.7Y[\u001c>t\u0013*KI", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~g\u0005$6m#w:?Dm4\f\u001cl`9\u0014T(U\u0007'%OJ5^Rq\u001b\u0010\u0019a\u000bJ)\u0013Z", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u00075w\u001ewLWDgC+\u0011fa\u0003\u0003l+[\u0001+F\u0016L6d]|K\u0014[h\u0015R*\r\u0012#. wF7\r\u000f0H\u0002HY|\u0013&\u000e\u0016nyFd\u0013GxrqH0eBWeO.=Na7n\u0010^0&8D,\u001f{'\u001b2]>\u0013\u000bW\u0019r\u001cWqoR#\t81\u0014Q\u001f-Cy]\u0006s;(G\u000b\u0005\u000e0X>'},\u0011>.5.\u0003Uo#Hlx^:cE&&C\u0006\u007f;TeuZE\u0012g\u001fnx\niE1vhalJ\u000f\u0006;\u0013b<^[~=(", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class SliderRememberKt {
    public static final RangeSliderValueChangedCallback rememberRangeSliderOnValueChangeCallback(Function1<? super ClosedFloatingPointRange<Float>, Unit> onValueChange, RangeSliderValueFinishedCallback finishedCallback, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(finishedCallback, "finishedCallback");
        composer.startReplaceableGroup(-16661989);
        ComposerKt.sourceInformation(composer, "C(rememberRangeSliderOnValueChangeCallback)P(1)95@3758L104:SliderRemember.kt#vjm75m");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-16661989, i2, -1, "com.dynatrace.android.compose.slider.rememberRangeSliderOnValueChangeCallback (SliderRemember.kt:94)");
        }
        composer.startReplaceableGroup(-1691723086);
        ComposerKt.sourceInformation(composer, "CC(remember):SliderRemember.kt#9igjgp");
        boolean zChanged = composer.changed(onValueChange);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new RangeSliderValueChangedCallback(onValueChange, finishedCallback);
            composer.updateRememberedValue(objRememberedValue);
        }
        RangeSliderValueChangedCallback rangeSliderValueChangedCallback = (RangeSliderValueChangedCallback) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rangeSliderValueChangedCallback;
    }

    public static final RangeSliderValueFinishedCallback rememberRangeSliderValueFinishedCallback(Function1<? super ClosedFloatingPointRange<Float>, Unit> onValueChange, Modifier modifier, Function0<Unit> function0, boolean z2, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        composer.startReplaceableGroup(201495675);
        ComposerKt.sourceInformation(composer, "C(rememberRangeSliderValueFinishedCallback)P(1)76@2967L142:SliderRemember.kt#vjm75m");
        if ((i3 + 4) - (i3 | 4) != 0) {
            function0 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(201495675, i2, -1, "com.dynatrace.android.compose.slider.rememberRangeSliderValueFinishedCallback (SliderRemember.kt:75)");
        }
        composer.startReplaceableGroup(1800701593);
        ComposerKt.sourceInformation(composer, "CC(remember):SliderRemember.kt#9igjgp");
        boolean zChanged = composer.changed(function0);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new RangeSliderValueFinishedCallback(onValueChange, modifier, function0, z2);
            composer.updateRememberedValue(objRememberedValue);
        }
        RangeSliderValueFinishedCallback rangeSliderValueFinishedCallback = (RangeSliderValueFinishedCallback) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rangeSliderValueFinishedCallback;
    }

    public static final SliderValueChangedCallback rememberSliderOnValueChangeCallback(Function1<? super Float, Unit> onValueChange, SliderValueFinishedCallback finishedCallback, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(finishedCallback, "finishedCallback");
        composer.startReplaceableGroup(-352491528);
        ComposerKt.sourceInformation(composer, "C(rememberSliderOnValueChangeCallback)P(1)51@1932L99:SliderRemember.kt#vjm75m");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-352491528, i2, -1, "com.dynatrace.android.compose.slider.rememberSliderOnValueChangeCallback (SliderRemember.kt:50)");
        }
        composer.startReplaceableGroup(-1377953848);
        ComposerKt.sourceInformation(composer, "CC(remember):SliderRemember.kt#9igjgp");
        boolean zChanged = composer.changed(onValueChange);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new SliderValueChangedCallback(onValueChange, finishedCallback);
            composer.updateRememberedValue(objRememberedValue);
        }
        SliderValueChangedCallback sliderValueChangedCallback = (SliderValueChangedCallback) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sliderValueChangedCallback;
    }

    public static final SliderValueFinishedCallback rememberSliderValueFinishedCallback(Function1<? super Float, Unit> onValueChange, Modifier modifier, Function0<Unit> function0, boolean z2, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        composer.startReplaceableGroup(1696842313);
        ComposerKt.sourceInformation(composer, "C(rememberSliderValueFinishedCallback)P(1)32@1197L137:SliderRemember.kt#vjm75m");
        if ((i3 + 4) - (i3 | 4) != 0) {
            function0 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1696842313, i2, -1, "com.dynatrace.android.compose.slider.rememberSliderValueFinishedCallback (SliderRemember.kt:31)");
        }
        composer.startReplaceableGroup(2114472623);
        ComposerKt.sourceInformation(composer, "CC(remember):SliderRemember.kt#9igjgp");
        boolean zChanged = composer.changed(function0);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new SliderValueFinishedCallback(onValueChange, modifier, function0, z2);
            composer.updateRememberedValue(objRememberedValue);
        }
        SliderValueFinishedCallback sliderValueFinishedCallback = (SliderValueFinishedCallback) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sliderValueFinishedCallback;
    }
}
