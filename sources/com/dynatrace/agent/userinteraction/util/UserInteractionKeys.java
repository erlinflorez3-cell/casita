package com.dynatrace.agent.userinteraction.util;

import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005*2\u009aw\u001d߿\u001b9^C\u001eG:\u0013Z0\u000fө\u007f6*[2r\u0014Gc\u001c\u0016\"7R%ʻ:ĔNZ\u0013¼_\u0012$|\u0003,wXOصdƤ6BwЀ\u0004Y}BQ`#9[ږ\u0005ŕ<y\rЏj6V\u0016\u000fzqNbۼ\u0003Ϯt:Z҈\u001e\u0011(\u0019\u001e>N\u0004tո:ߑ:Htҗ\u000b;1\u000b\u0002B|*6ܥO֔\u0011F\\܋]\u0003o'C@e8kǳ&Ϋ\u000bRcΪSK\u007fG\u001dhU*\u0002ɥFɱ:X\bϬe7]\u0018urT_[İ3В++WҪ\u05c8T\u001b"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_>\\GB5$,\u0015uEB\u0016c9Jt6KVW\u0012\\f\u0001\u0013", "", "\nh]6g\u0005", "u(E", "\u0017MC\u0012E\b\u001cB|hcX\u0015Xp\u000f", "", "\u0013K4\u001a8\u0015-", "\u0013K4\u001a8\u0015-MtgX>\u001akr\u001c", "\u0013K4\u001a8\u0015-MtgX>\u001akr\u001c_h\u0004c ", "\u0013K4\u001a8\u0015-MtgX>\u001akr\u001c_]\u0012c+j\u007fv0^", "\u0013K4\u001a8\u0015-MtgX>\u001akr\u001c_c\u0007", "\u0013K4\u001a8\u0015-M\u0002Zb>", "\u0013K4\u001a8\u0015-MvhbI\u0016eh\u0018T", "\u0013K4\u001a8\u0015-M|]", "\"nd0[", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class UserInteractionKeys {
    private static final String ELEMENT = "ui_element";
    private static final String ELEMENT_ANCESTOR = "ui_element.ancestor";
    public static final String ELEMENT_ANCESTOR_COMPONENT = "ui_element.ancestor.component";
    public static final String ELEMENT_ANCESTOR_ID = "ui_element.ancestor.id";
    public static final String ELEMENT_ANCESTOR_NAME = "ui_element.ancestor.name";
    public static final String ELEMENT_COMPONENT = "ui_element.component";
    public static final String ELEMENT_ID = "ui_element.id";
    public static final String ELEMENT_NAME = "ui_element.name";
    public static final UserInteractionKeys INSTANCE = new UserInteractionKeys();
    public static final String INTERACTION_NAME = "interaction.name";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176Ȑ\u0005Գ,(Մ7f\u00198pKkH¯VU0\u000fy|\u00050i&\nCiXpԉt\u07beSNo˧ĚN^"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_>\\GB5$,\u0015uEB\u0016c9Jt6KVW\u0012\\f\u0001{\u0003\u001cj\fQ\u0001", "", "\nh]6g\u0005", "u(E", "\u001eNB\u0016G\u0010(<\u0007", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Touch {
        public static final Touch INSTANCE = new Touch();
        public static final String POSITIONS = "positions";

        private Touch() {
        }
    }

    private UserInteractionKeys() {
    }
}
