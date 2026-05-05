package com.braze.ui.contentcards.managers;

import com.braze.ui.contentcards.listeners.DefaultContentCardsActionListener;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005'2&\u000eј\u0005ri0rd\u0001-Z\u0014-Ƃo{B$,J\u007fFSW0|P\u000b\u007fTuh\u0007Lp\nq\u0011DZO̚8֒Y\u0005e܈'4HsM8mqC?n{ȫ\t)"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WDr.1[}-E7r;IX;I>'$hjHd_9M\u0005\u000fCUJ.\\_H", "", "u(E", "D`[BX", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WCz3DY\u0007 D{_\u0012+MDz4'$F]F\u0006q\bL\u0006+QU50jarF\u0014\u001f0", "1n]AX5M1\u0015\fyl\bz\u00183o\t\u000f\u007fN\u0010\u0017 G|", "5dc\u0010b5MS\"\u000eXZ9{\u0017\u000bc\u000f,\u0006Ig\u001b%Vo\u0017<\u0004", "u(;0b4\bP&z\u0010^u\r\rxc\n1\u000b@\n&\u0015C|\rJ@,9g\r @m#<\u0017'\u0019u=-\u0015qp\u0017\u0003p+\\R%VPX5CV\u0001L\u0014\u001bZ\u001b$", "Adc\u0010b5MS\"\u000eXZ9{\u0017\u000bc\u000f,\u0006Ig\u001b%Vo\u0017<\u0004", "uKR<`u;`\u0015\u0014z(<\u0001R-o\t7{I\u0010\u0015\u0013Tn\u001c\u0006})Ch})7z$w1!EtC\u001e\u001ew?5\u0014b:*t6KVW\u0013``\u0002=\u001d\u0012gc\u0012\u001c", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class BrazeContentCardsManager {
    public static final Companion Companion = new Companion(null);
    private static final Lazy<BrazeContentCardsManager> instance$delegate = LazyKt.lazy(new Function0<BrazeContentCardsManager>() { // from class: com.braze.ui.contentcards.managers.BrazeContentCardsManager$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final BrazeContentCardsManager invoke() {
            return new BrazeContentCardsManager();
        }
    });
    private IContentCardsActionListener contentCardsActionListener = new DefaultContentCardsActionListener();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005&2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005Ci%\nCiWPBxޣѬN˗k~R\\\u0011I\u001d\r&zp/WU\u0011_\u0018\u0013@GŌC;"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WDr.1[}-E7r;IX;I>'$hjHd_9M\u0005\u000fCUJ.\\_1\u001b\u001e\u001ae\nW/\u0017\u000e/", "", "u(E", "7mbAT5<S", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WDr.1[}-E7r;IX;I>'$hjHd_9M\u0005\u000fCUJ.\\_H", "5dc\u0016a:MO\"|z\u001d(\u0006\u00129t{7\u007fJ\n%", "5dc\u0016a:MO\"|z", "u(;0b4\bP&z\u0010^u\r\rxc\n1\u000b@\n&\u0015C|\rJ@-1by\"7z$w*P7\u00014{\u001fqp9\u0010r\nJ\u0004&U4J5XTrJi", "7mbAT5<SW}ze,~\u0005>e", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        public final BrazeContentCardsManager getInstance() {
            return (BrazeContentCardsManager) BrazeContentCardsManager.instance$delegate.getValue();
        }
    }

    public static final BrazeContentCardsManager getInstance() {
        return Companion.getInstance();
    }

    public final IContentCardsActionListener getContentCardsActionListener() {
        return this.contentCardsActionListener;
    }

    public final void setContentCardsActionListener(IContentCardsActionListener iContentCardsActionListener) {
        if (iContentCardsActionListener == null) {
            iContentCardsActionListener = new DefaultContentCardsActionListener();
        }
        this.contentCardsActionListener = iContentCardsActionListener;
    }
}
