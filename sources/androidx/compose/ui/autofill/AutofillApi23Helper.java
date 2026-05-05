package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: AutofillUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007f\u0007llA0ReP.XZ2\u000fy\b<$a%wړ;kڼ.\"7N\u000flmnН^\u000bQ\u000fN,\u0007kDI\u0004z\u000e\u0016\u001d5Zom7}sK>xtd\u0007f7jP\b\u000b\u0019\u001c@G>z+GY\u000f*0ntjV\u001bT\u001d\u001a@\b\u0005%I\\jof6vu\u000e>=&\u001bipRWc>\u0007e\rtVW\u0011\u0005l6+n9e\u00193_\u001b\u0007\u0001]o\u0007M~U\u0005\u0017)W/W\u0002o6\u0007\u0002D\u00199^%]!(#\n\u001a\u0015\u001a7CO\u0012T\u0001\u00126z\u0013{;@4\u0012\u00148`.[\u001c\u0017\u000e\u001cE\rti?~\u0015\u000fH\u000e\u000fy8-$.F[?){icQ\u0018|JB\nڥ\"9"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0011i\r*8q\u001d5)N?8\u0002\u0001\u0015ol9\u00149", "", "u(E", "/cS\u0010[0ERv\t\u000bg;", "", "AsaBV;N`\u0019", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0016\u000bM\u0011\u0015&W|\u000e\u0012", "<t\\", "<df\u0010[0ER", "7mS2k", "Adc\u0011\\4>\\'", "", ":dUA", "Bn_", "Aba<_31", "Aba<_32", "EhSA[", "6dX4[;", "Adc\u0016W", "7c", ">`R8T.><\u0015\u0007z", "", "Bx_2A(FS", "3mc?l\u0015:[\u0019", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AutofillApi23Helper {
    public static final int $stable = 0;
    public static final AutofillApi23Helper INSTANCE = new AutofillApi23Helper();

    private AutofillApi23Helper() {
    }

    public final ViewStructure newChild(ViewStructure viewStructure, int i2) {
        return viewStructure.newChild(i2);
    }

    public final int addChildCount(ViewStructure viewStructure, int i2) {
        return viewStructure.addChildCount(i2);
    }

    public final void setId(ViewStructure viewStructure, int i2, String str, String str2, String str3) {
        viewStructure.setId(i2, str, str2, str3);
    }

    public final void setDimens(ViewStructure viewStructure, int i2, int i3, int i4, int i5, int i6, int i7) {
        viewStructure.setDimens(i2, i3, i4, i5, i6, i7);
    }
}
