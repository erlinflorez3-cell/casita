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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLc\u0003\rI\u0006>\u000b6B\u0005\"4\u0012\u000e\u0007nj?1LeV:ZS0\u0010qzJř\f0\u0002EKUH}2\u000b_N\u0016h\u001dI\u001b.S\u001f\u0014\u0018\u0011v<Kex\f\u0012\u001f4Rom4{nM?nwN\u000761P<ѩ\t\u0003 /V\u0016?\nQT$\u0012^A!>`\u0017e\u0005H\u0012L̛ Q6jifBXnm:]#\u0013kRNU`^{$θHù+\r~ѭn9N:M\u0017;R1\u000b)¼KƄCqEݛ9352as\u0006>/ß\u0016Ʀ/O\u0015ƞğ*g"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~H\b\"9t\u0016*JJ;I>& ro9d_3Us#ERHwV$H", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "=mE._<>1\u001cz\u0004`,{", "@n[2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7C", "\nh]6g\u0005", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zpULV(eav;\"[G\u0018U+bk_K3uH@h\r=QK?q\u0010\f#\u00171q:!V\u0011C\n\u001c\u0005\u001f3qThl\nEPOo\u0012`\u0019e\u001di\u0010}\u0015", "B`V", "", "7me<^,", ">0", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ToggleableComposeCallback_1_7 implements Function1<Boolean, Unit> {
    public static final int $stable = 8;
    private final Function1<Boolean, Unit> onValueChanged;
    private Role role;
    private final String tag;

    /* JADX WARN: Multi-variable type inference failed */
    private ToggleableComposeCallback_1_7(Function1<? super Boolean, Unit> onValueChanged, Role role) {
        Intrinsics.checkNotNullParameter(onValueChanged, "onValueChanged");
        this.onValueChanged = onValueChanged;
        this.role = role;
        this.tag = Global.LOG_PREFIX + "ToggleableCompose";
    }

    public /* synthetic */ ToggleableComposeCallback_1_7(Function1 function1, Role role, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, role);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(ToggleableComposeCallback_1_7 toggleableComposeCallback_1_7, boolean z2) {
        toggleableComposeCallback_1_7.onValueChanged.invoke(Boolean.valueOf(z2));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public void invoke(final boolean z2) {
        if (!Global.isAlive.get()) {
            this.onValueChanged.invoke(Boolean.valueOf(z2));
            return;
        }
        if (this.role == null) {
            Object objFetchRole = SemanticsManager.INSTANCE.fetchRole();
            this.role = objFetchRole instanceof Role ? (Role) objFetchRole : null;
        }
        MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
        UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
        ToggleableState ToggleableState = ToggleableStateKt.ToggleableState(!z2);
        Role role = this.role;
        String name = this.onValueChanged.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        ToggleableInfo toggleableInfo = new ToggleableInfo(ToggleableState, role, name, null);
        if (Global.DEBUG) {
            Utility.zlogD(this.tag, "onUA: " + toggleableInfo);
        }
        new ToggleActionRecorder(measurementProviderImpl, userActionFactoryImpl, toggleableInfo, SemanticsManager.INSTANCE.fetchNameAndClear()).recordAction(new Function0() { // from class: com.dynatrace.android.compose.ToggleableComposeCallback_1_7$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ToggleableComposeCallback_1_7.invoke$lambda$0(this.f$0, z2);
            }
        });
    }
}
