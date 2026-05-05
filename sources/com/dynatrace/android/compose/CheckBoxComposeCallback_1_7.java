package com.dynatrace.android.compose;

import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLc\u0003İI\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0RnP.XT2\u000fy\b<$a%yCQU\"Ԃ(\u000eeȞ\u0018o~Nj\rY\u000e4\u0016'i\\I\u0004y\u001eG\u001f>PqW;]sM;vsd\u0005N12L\b\b\u0019*:L x\u0011By\f\"4PrPQ;M3\u001e\"\nL%\u0019\u001e\u000bmߑ:JrdH7k\fwMf)u/+MSЖTo\u0013\u0005m6+nA{)mY\u0011\u0014j[m\u0011\u0006\u0006\u000e\u0019v)?3Ywg8n~B\u0015YNcơt͉`\u0005YӠ\\C9R{[`\u00128y\u0011z;<\u0014\u0012\u0016)^-[\u001a\u0015\fdޚvɤW@X\u061c/N\u000e\u007fy6E+VĔ-ݰ\u001ffYĥ\f%\\@\u0014\u0005;(yЪpĲ_T\u0016֫ڦ\u001fc"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~7\u0001 5sr8`!Es?(#h?5\u000ej)Jt-A\u0018H}2", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~H\b\"9t\u0016*JJ;J0-\u0011SnC\u0018g+N\u0004|", "4t]0g0H\\", "And?V,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "1gT0^,=", "", "\nh]6g\u0005", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d]0\u0003\u0012\u001c", "B`V", "", "7me<^,", ">q^C\\+>a\u0007\t\u000bk*|q+m\u007f", ">q^C\\+>a\b\t|`3|\u0005,l\u007f\u0016\u000b<\u0010\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f&\u0013VoW+\u0001'7`}\u001c4t\u0016\u001c\\?Jk\n", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class CheckBoxComposeCallback_1_7 implements Function0<Object>, ToggleableDataProvider {
    public static final int $stable = 0;
    private final boolean checked;
    private final Function0<Object> function;
    private final Function1<Object, Object> source;
    private final String tag;

    public CheckBoxComposeCallback_1_7(Function0<? extends Object> function, Function1<Object, ? extends Object> source, boolean z2) {
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(source, "source");
        this.function = function;
        this.source = source;
        this.checked = z2;
        this.tag = Global.LOG_PREFIX + "CheckBoxCompose";
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        if (!Global.isAlive.get()) {
            return this.function.invoke();
        }
        MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
        UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
        ToggleableInfo toggleableInfo = new ToggleableInfo(providesToggleableState(), Role.m5926boximpl(Role.Companion.m5934getCheckboxo7Vup1c()), providesSourceName(), null);
        if (Global.DEBUG) {
            Utility.zlogD(this.tag, "onUA: " + toggleableInfo);
        }
        return new ToggleActionRecorder(measurementProviderImpl, userActionFactoryImpl, toggleableInfo, SemanticsManager.INSTANCE.fetchNameAndClear()).recordAction(this.function);
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    public String providesSourceName() {
        String name = this.source.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    public ToggleableState providesToggleableState() {
        return ToggleableStateKt.ToggleableState(this.checked);
    }
}
