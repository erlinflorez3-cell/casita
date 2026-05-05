package androidx.compose.foundation.lazy.layout;

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
/* JADX INFO: compiled from: LazyLayoutMeasuredItem.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\":\u0018\u007f\u0007lkA0RnP.Xb2\u000f\u0002{<$a&yCIU\"}(\fU-}˧\u001fJ\t\n\f*\u00140\u0011jZd\u0006|k\u0016'2pt\u0006W߲n<̙_Қȥ\t\"8>F\u0017M\u0011(H`\u0012\ryqJ<\u0016>D\t:\u0001\u0012\u0014)b8\u0014]8\u0001L|\u0018RDi\u0005]h4S\u0007wdf'\u000e5-Q\u001bil';{\u0012\"9dO5C*\u001a'Whi?\u001b? >[ع)߉*ɞ؎V5ݼ\u0004\u0018--U\u000fkuvl\u0013Ux\fU0&ӑMח\u0012,\u0010|\u0002\u0013J\u000b^\u00165PF-Ho^ԫ5ϢvWXR\bfP\nKqD\"=\u007fa*\u0010ӼhЂe?1P=\b\u0013\u001an3\u000f|9[\u0003\u00137ڤ\u001dƻ{UISFLVUZiK}\u001cp\u0011\u0007\u0001˝2Ͻ\u00043\u0014\u00134(3>,O13\u0004\u0002vM>П\u0011¾l]\u0002TNS0x690\u001d\u001ao\u0015t\u0013\u0002hT\u00071gܚ\u001eΤ\u000b\u0002 \u0015&s\u0006Cq5\u001efgh\u0018o$ϑ\fɻ3jO[t\u0005\u001c^¢]3̓Qr\u0018dXκ0m;j\u0005^\u0006JU\u0012y\u000b'Ϙ6mћ\u0014v"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,[6\u0002=\u001cg", "", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "5dc\u0010b5Lb&z~g;\u000bP7s_\rw\u001f\u0007", "u(9", "7mS2k", "", "5dc\u0016a+>f", "u(8", "7rE2e;BQ\u0015\u0006", "", "u(I", "9dh", "5dc\u0018X@", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", ":`]2", "5dc\u0019T5>", ";`X;4?Ba\u0007\u0003\u0010^\u001e\u0001\u00182S\u000b$yD\n\u0019%", "5dc\u001aT0G/,\u0003\tL0\u0012\t!i\u000f+iK|\u0015\u001bPq\u001c", "<n] V9HZ zwe,`\u0018/m", "5dc\u001bb5,Q&\t\u0002e(y\u0010/I\u000f(\u0004", "Adc\u001bb5,Q&\t\u0002e(y\u0010/I\u000f(\u0004", "uY\u0018#", ">kP0X(;Z\u0019\rXh<\u0006\u0018", "5dc\u001d_(<S\u0015{\u0002^:Z\u0013?n\u000f", "AoP;", "5dc c(G", "5dc\u001cY-LS(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "5dc\u001cY-LS(FWc6LX64", "uH\u0018\u0017", "5dc\u001dT9>\\(]vm(", ">nb6g0H\\", "", ";`X;4?Ba\u0003\u007f{l,\f", "1q^@f\bQW'h{_:|\u0018", ":`h<h;0W\u0018\u000e}", ":`h<h;!S\u001d\u0001}m", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface LazyLayoutMeasuredItem {
    /* JADX INFO: renamed from: getConstraints-msEJaDk */
    long mo1129getConstraintsmsEJaDk();

    int getIndex();

    Object getKey();

    int getLane();

    int getMainAxisSizeWithSpacings();

    boolean getNonScrollableItem();

    /* JADX INFO: renamed from: getOffset-Bjo55l4 */
    long mo1130getOffsetBjo55l4(int i2);

    Object getParentData(int i2);

    int getPlaceablesCount();

    int getSpan();

    boolean isVertical();

    void position(int i2, int i3, int i4, int i5);

    void setNonScrollableItem(boolean z2);
}
