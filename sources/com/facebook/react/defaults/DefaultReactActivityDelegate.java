package com.facebook.react.defaults;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007tsA0JhNBhݷZ\u000f\u001aztIa9\u0002GIU2}P\n_Rui\u0007J\t\u000eS\u0013\u0014\u001a\u0011jZNe|k\u0018'2ptУ7M}Dy}\u0005:\u0013 J\"fz\u0015\u0005(,`\u0010%}SQ\u0012\u0012>D\t:\u0001\u0012̂\t\u001a \u000e\u0007&\u000f'tg|;\u000f~.F='\u001bipS}ۂ2ƊQ\rNÖܴ\u0011\u0001"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001\u0018\u0013Wv\u001dJ@\u00045Zy0>|\u0003.IAJG2-\u0019yeH\u001bB,Uv)C[N\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VK\fKz69h\u0012~7t\u00160IR;A", "/bc6i0Mg", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VK\fKz69h\u0012u", ";`X;66F^#\bzg;e\u00057e", "", "4`Q?\\*\u001e\\\u0015{\u0002^+", "", "1n]0h9KS\"\u000eg^(z\u0018\u000fn{%\u0003@\u007f", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\nm\u0017\u0013E~i:\u0006)F]\r4\rT\u001b*^?\u0005r0'\u00172OH\u0014g5PL\u001c<\u0010?", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\nm\u0017\u0013E~i:\u0006)F]\r4\rT\u001b*^?\u0005r0'\u00172OH\u0014g5PL\u001c\u000b=", "7r5.U9BQx\bv[3|\b", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class DefaultReactActivityDelegate extends ReactActivityDelegate {
    private final boolean fabricEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultReactActivityDelegate(ReactActivity activity, String mainComponentName, boolean z2) {
        super(activity, mainComponentName);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mainComponentName, "mainComponentName");
        this.fabricEnabled = z2;
    }

    public /* synthetic */ DefaultReactActivityDelegate(ReactActivity reactActivity, String str, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactActivity, str, (i2 & 4) != 0 ? false : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0006X\u00016\u0006}#^\u0018+-\u0001Q*8bNQ\n*\u0019I\u000ff\u007f\\w~gX)rmSeVR\u001c\u007fBZ&r<!jT9(YJMnA\u0019 \rI I\u001f65\u0010vKrF*N\u0013\u000eo'\u0016\u0010:\u0015@}U\u001362U{@W[w\u000f_y'T\"+\u0002\u001c)\u0010= Q\u0010+C8x\u007fV6BNi\u001dZ?(hxA|* 5'\u000f\u0011\t0r+.Ecl\u000f^6\u00039\u0011\u0014\u0014\u007fP*h|m0_re2Ktw\u001e*\u001a=|V\"zt\\U/", replaceWith = @ReplaceWith(expression = "DefaultReactActivityDelegate(activity, mainComponentName, fabricEnabled)", imports = {}))
    @InterfaceC1492Gx
    public DefaultReactActivityDelegate(ReactActivity activity, String mainComponentName, boolean z2, boolean z3) {
        this(activity, mainComponentName, z2);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mainComponentName, "mainComponentName");
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected boolean isFabricEnabled() {
        return this.fabricEnabled;
    }
}
