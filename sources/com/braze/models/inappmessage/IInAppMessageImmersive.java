package com.braze.models.inappmessage;

import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.TextAlign;
import java.util.List;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4J\u0007\":\u001e\u007f\u0007lmA0ZeP.XY2\u000f\u0002{<$a'yCIs\"}8\tWNmjvJh\u0014K\u000f\f\u0016~PBկ\u0006x\f\u0011W@P\u0017W3{\u0018m=n\u001eN\u0005NTh\\J\u001b\u000f\u001aBH>wQŶWë\u0016:Xr@T\u001bP%\u001c\u0018\nL%Q6jmf8^k\f;\u0006ݱ\u000fݦFX?a6\u0004[\u0015fV-\u0016\u0005knCNBM\u0017;R1\u0013)àKƄC{U\u0007n459iu]Ef\u0010d+9`%]!83ԋ]ԃ\u00101CQi^^\"Hy\u0001\u0011\u001bRT$\u0014>`.[\u001b=ۃ\u001a\u07bax|kBV\u001alE |gO%*PI9S3f\u007f|\u0012ϱZѼ\u007f\u000f% )\u001d|>{V\u0014~#:%\u0014_QiFMJ^\n\b_\u001c%GĎ\u000eò\b:_\u00025\u001f\u001fR7'=\u0001GIޢjȵ҉Dk~\u0007f\b\u0002hʖLj͏r\u0015"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001expi9\u0014q0_v|", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "1k^@X\tNb(\t\u0004<6\u0004\u0013<", "", "5dc\u0010_6LSu\u000f\nm6\u0006f9l\n5", "u(8", "Adc\u0010_6LSu\u000f\nm6\u0006f9l\n5", "uH\u0018#", "4qP:X\nHZ#\f", "5dc\u0013e(FSv\t\u0002h9", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u0013e(FSv\t\u0002h9", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "6dP1X9", "", "5dc\u0015X(=S&", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0015X(=S&", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "6dP1X9-S,\u000eVe0~\u0012", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn$Y\u0011/\u0013t\u001a0V\u0019", "5dc\u0015X(=S&mzq;X\u00103g\t", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#l J|q5QEDA", "Adc\u0015X(=S&mzq;X\u00103g\t", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI,\u0005<\f\"\u001fG}\u001c8x%~H}3FI\u001d2OL\u0011/%", "6dP1X9-S,\u000eXh3\u0007\u0016", "5dc\u0015X(=S&mzq;Z\u00136o\r", "Adc\u0015X(=S&mzq;Z\u00136o\r", "7lP4X\u001aMg ~", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u0019ay\"7[%BTC\u0011", "5dc\u0016`(@S\u0007\u000e\u000fe,", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#a(3o\u0016\u001c\\WBk\n", "Adc\u0016`(@S\u0007\u000e\u000fe,", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI,\u0005<\f\"\u001fG}\u001c8x%~=\u0006\u001c9m\u0004=aJ;Aw\u000f", ";db@T.>0)\u000e\nh5\u000b", "", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~A}.Ei\u0018.*SJz>'j", "5dc\u001aX:LO\u001b~Wn;\f\u00138s", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u001aX:LO\u001b~Wn;\f\u00138s", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", ":nV\u000fh;M]\"\\\u0002b*\u0003", "", ";db@T.>0)\u000e\nh5", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface IInAppMessageImmersive extends IInAppMessage {
    int getCloseButtonColor();

    Integer getFrameColor();

    String getHeader();

    TextAlign getHeaderTextAlign();

    int getHeaderTextColor();

    ImageStyle getImageStyle();

    List<MessageButton> getMessageButtons();

    boolean logButtonClick(MessageButton messageButton);

    void setCloseButtonColor(int i2);

    void setFrameColor(Integer num);

    void setHeader(String str);

    void setHeaderTextAlign(TextAlign textAlign);

    void setHeaderTextColor(int i2);

    void setImageStyle(ImageStyle imageStyle);

    void setMessageButtons(List<? extends MessageButton> list);
}
