package com.dynatrace.android.compose;

import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.useraction.UserActionFactoryImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLc\u0003İI\u00066\u000b6B\u0015\"4ߚ\u007f\u0007tvA0JhN3hݷZ\u0017{\u007fD&q# CiTZ%2\u0015]O\u007fo~Nj\rY\u000e4\u0016'i<Oczu\u0014%1prO7[sU9\u000fyȥ\t\"8(F\u0001M\n(3`\u0012\ryqKR܌0\u0011\u0005HS%U\u0015\u001e\"\bT\u001f/\u001e\u000bf%ȧJǰa:7݊SwPP?aF{{\u0010\u001dÙ3˼za&Ѩ\u0011CC\u0019=S1\f)¼AƄCqEݛ9353as\u0006;/ß\u0016Ʀ/O\u0015ƞğ*f"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~7\u0005$5s\u0012+TC\u0019u<)\u001fva\u0017\u0003j3Kr%M\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "4t]0g0H\\", "@n[2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7C", "Bx_2", "", "\nh]6g\u0005", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zpULV(eav;\"[G\u0018U+bk^=5j\u000e>\u001b\u0011.\u0013oJu\u0005\u0015\u0018c\u001cpzQ]\u0014PC\u001a\u0007IrlOh_\u0007P=L,\td\r[-cI\u0018.\u001d\u007f((xN=\u0014\t;\r\u007fXyt=\u000b\n", "B`V", "7me<^,", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ClickableComposeCallback implements Function0<Object> {
    public static final int $stable = 8;
    private final Function0<Object> function;
    private Role role;
    private final String tag;
    private final String type;

    private ClickableComposeCallback(Function0<? extends Object> function, Role role, String type) {
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(type, "type");
        this.function = function;
        this.role = role;
        this.type = type;
        this.tag = Global.LOG_PREFIX + "ClickableCompose";
    }

    public /* synthetic */ ClickableComposeCallback(Function0 function0, Role role, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, role, str);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        if (!Global.isAlive.get()) {
            return this.function.invoke();
        }
        if (this.role == null) {
            Object objFetchRole = SemanticsManager.INSTANCE.fetchRole();
            this.role = objFetchRole instanceof Role ? (Role) objFetchRole : null;
        }
        MeasurementProviderImpl measurementProviderImpl = new MeasurementProviderImpl(TimeLineProvider.GLOBAL_TIME_LINE_PROVIDER);
        UserActionFactoryImpl userActionFactoryImpl = new UserActionFactoryImpl();
        if (!(this.function instanceof ToggleableDataProvider)) {
            ClickableInfo clickableInfo = new ClickableInfo(this.type, this.role, this.function, null);
            if (Global.DEBUG) {
                Utility.zlogD(this.tag, "onUA: " + clickableInfo);
            }
            return new ClickActionRecorder(measurementProviderImpl, userActionFactoryImpl, clickableInfo, SemanticsManager.INSTANCE.fetchNameAndClear()).recordAction(this.function);
        }
        ToggleableState toggleableStateProvidesToggleableState = ((ToggleableDataProvider) this.function).providesToggleableState();
        Intrinsics.checkNotNullExpressionValue(toggleableStateProvidesToggleableState, "providesToggleableState(...)");
        Role role = this.role;
        String strProvidesSourceName = ((ToggleableDataProvider) this.function).providesSourceName();
        Intrinsics.checkNotNullExpressionValue(strProvidesSourceName, "providesSourceName(...)");
        ToggleableInfo toggleableInfo = new ToggleableInfo(toggleableStateProvidesToggleableState, role, strProvidesSourceName, null);
        if (Global.DEBUG) {
            Utility.zlogD(this.tag, "onUA: " + toggleableInfo);
        }
        return new ToggleActionRecorder(measurementProviderImpl, userActionFactoryImpl, toggleableInfo, SemanticsManager.INSTANCE.fetchNameAndClear()).recordAction(this.function);
    }
}
