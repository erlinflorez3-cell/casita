package com.dynatrace.android.compose;

import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\u0015\"4ߚ\u007f\u0007|jA0JmN-hݷZ\u000f\u001aztKk(\u007fCSUH~2\u000f]P\u007fi\u0005I\t\u000eS\u001b\u0014\u001a\u0011r<Mezs\u0011=1ptУ7OuCGg=<\u0013.J\"fzK\u0015j9V\u0010\u000fzqLë\u00166H\u0081RT\u0013U\u0013#b\u0017L\"\u0019 rf|9ՂpcBǂ;\u0005oL\\20G\u000bQ%Nd+\u001dxw\u001dY?e:չ)Y\u000bޗj]E\u000fM~ݞ\tw"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~7\u0005$5s\u0012+TC\u001ft5(j", "", "7mc2e(<b\u001d\t\u0004M@\b\t", "", "@n[2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7C", "4t]0g0H\\", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\rIk<\u001a\u001ewe7\u0015-\u0019X}'\u001d3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015`c\u001cpzQ]\u0014PC\u001a\u0007IrlOh_\u0007P=L,\td\r[-cI\u0018.\u001d\u007f((xN=\u0014\t;\r\u007fXyt=\u000b\n", "5dc\u0016a;>`\u0015|\nb6\u0006wCp\u007f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001fb3>\u001b\u0006e`e\u000ehl", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Gw\nE\u0006)3gG\rAt\u0016\u0004", "5dc\u0013h5<b\u001d\t\u0004", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "BnBAe0GU", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ClickableInfo {
    public static final int $stable = 0;
    private final Function0<Object> function;
    private final String interactionType;
    private final Role role;

    private ClickableInfo(String interactionType, Role role, Function0<? extends Object> function) {
        Intrinsics.checkNotNullParameter(interactionType, "interactionType");
        Intrinsics.checkNotNullParameter(function, "function");
        this.interactionType = interactionType;
        this.role = role;
        this.function = function;
    }

    public /* synthetic */ ClickableInfo(String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, role, function0);
    }

    public final Function0<Object> getFunction() {
        return this.function;
    }

    public final String getInteractionType() {
        return this.interactionType;
    }

    /* JADX INFO: renamed from: getRole-RLKlGQI, reason: not valid java name */
    public final Role m7131getRoleRLKlGQI() {
        return this.role;
    }

    public String toString() {
        return "ClickableInfo{interactionType='" + this.interactionType + "', role=" + this.role + ", function=" + this.function.getClass().getName() + AbstractJsonLexerKt.END_OBJ;
    }
}
