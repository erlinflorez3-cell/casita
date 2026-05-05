package com.dynatrace.android.compose;

import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tvA0JmN-hݷZ\u000f\u001aztCk(\u007fCSUH~2\u000f]P\u007fi\u0005I\t\u000eS\u0013\u0014\u001a\u0011jZNǤ|_\u0018\u0015@I8EA[\b=ge;JU/@\"Py3\u0002ʀ.N\u0018͌\u0013EQ\u0014 9\u0011\u0002HT%O\u001b\u0019@\ţ$\u0007&ձ\u007fP<Rzh\u000b>1\u0007\u0002B|,ۢ4\u0003Uε^V-\u0019\u0005nԅ/O"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~H\b\"9t\u0016*JJ;O=\u001f\u001f>", "", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f&\u0013VoW+\u0001'7`}\u001c4t\u0016\u001c\\?Jk\n", "@n[2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7C", "And?V,'O!~", "", "\nh]6g\u0005", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%&C~\u000e\u0006e/7[\u0005 3j\u001d.;R7z4s{dj8\u0014m0M\npEVV7f`r\u0007$\u0016$\u001cN3\t\u000ehE\"|\u000e$)\u000f,\u001fh@d\u0012\b_\u00151sr\fD\u001fT}\u001ew\u0017\u0010nPhf}P\u000bJs2.\u0010h,\\GC \u001b;w\u001biL>\u0011\u000b1\u001b{`\ttwE(\u0005E\f:zaFRE\u0019-", "5dc g(MS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Vk\u001d<@\u0014?[\u007f'7i\u00135M1JgC\u001ej", "5dc\u001fb3>\u001b\u0006e`e\u000ehl", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Gw\nE\u0006)3gG\rAt\u0016\u0004", "5dc b<KQ\u0019gvf,", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "BnBAe0GU", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ToggleableInfo {
    public static final int $stable = 0;
    private final Role role;
    private final String sourceName;
    private final ToggleableState state;

    private ToggleableInfo(ToggleableState state, Role role, String sourceName) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        this.state = state;
        this.role = role;
        this.sourceName = sourceName;
    }

    public /* synthetic */ ToggleableInfo(ToggleableState toggleableState, Role role, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(toggleableState, role, str);
    }

    /* JADX INFO: renamed from: getRole-RLKlGQI, reason: not valid java name */
    public final Role m7133getRoleRLKlGQI() {
        return this.role;
    }

    public final String getSourceName() {
        return this.sourceName;
    }

    public final ToggleableState getState() {
        return this.state;
    }

    public String toString() {
        return "ToggleableInfo(state=" + this.state + ", role=" + this.role + ", sourceName='" + this.sourceName + "')";
    }
}
