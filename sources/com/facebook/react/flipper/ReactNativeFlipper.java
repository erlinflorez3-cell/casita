package com.facebook.react.flipper;

import android.content.Context;
import com.facebook.react.ReactInstanceManager;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
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
@Deprecated(level = DeprecationLevel.ERROR, message = "\u0015K|8\u0006b\u0016ka]-I6!5^lQ\u001bf\u000ev W}Xo~W\u00042&q_$FRlz>I\u001fG?\u0016$\fi.]INj}F\u0017\u0019V*IZ\u000b<\u00072\u000fpC(\u000b\u0012\u000b\u001d+\u0016\u0005\\\u0019@\u0007JH-\u0017_xKc!\u0001;&\b1QO?\u000e0'J&S\u001b.\u007fNGq\u0004\u001a'UDek\u0019;\u001de:", replaceWith = @ReplaceWith(expression = "", imports = {}))
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜NÔRiճ?k*3d`*qٴ?U(}j\u001f]O\u007fg\u001dL\u000b\u000fQ\u0012\u001e\u0016'n\\Mc}u\u0012=8\ttЩ7T"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA\b\u001b\"Ro\u001b\u0006c%1W\r\t3|\u001a?M$Bo?)\u0015u7", "", "u(E", "7mXA\\(EW.~[e0\b\u0014/r", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "@dP0g\u0010Ga(z\u0004\\,d\u00058a\u0002(\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E-\u0001\u0013\u0015VS\u0017J\u0006!>W}\b3v\u00120MP\u0011", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReactNativeFlipper {
    public static final ReactNativeFlipper INSTANCE = new ReactNativeFlipper();

    private ReactNativeFlipper() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0015K|8\u0006b\u0016ka]-I6!5^lQ\u001bf\u000ev W}Xo~W\u00042&q_$FRlz>I\u001fG?\u0016$\fi.]INj}F\u0017\u0019V*IZ\u000b<\u00072\u000fpC(\u000b\u0012\u000b\u001d+\u0016\u0005\\\u0019@\u0007JH-\u0017_xKc!\u0001;&\b1QO?\u000e0'J&S\u001b.\u007fNGq\u0004\u001a'UDek\u0019;\u001de:", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final void initializeFlipper(Context context, ReactInstanceManager reactInstanceManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactInstanceManager, "reactInstanceManager");
    }
}
