package com.braze.events;

import com.braze.models.cards.Card;
import com.braze.support.DateTimeUtils;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004O$8\u000bDB\u0007Ӭ4\u0012\u0006\u0013nʑA0RlP\u008cZS8\u0018s{:$c$\u007fbCU ~*\t]TogtX`\u0010YƤ$4)jZH\u000ew{R:BL}?KS\u007f?I`#83!B(F|\u001d\u00030)v\u0014\u0007~QP$\u0012^F\u0001>`\u0014e\u0005H\u001aĂB \u000f'%m\\P`l\f@u(KuPi?_^\u0005}\u0011Tp?\r%gf1NTM\u0015SWI\u001b#pM\rWwM\u0007x'U-w~\u000ezݼ\u0004\u0018--U\u0019k\u007fvk\u0013_x\fU:\u0006(ׂT\u0012@y\u0001\f\u001bMT \u0014'`4=\u001cv\b<5#s*öRؿbB\bЭ2E%7\u00183YAQ+Ђe?1P=\u000e\u0013 n2\u000fu9[\u0003\u0016\u05ce\u0019!\\ȭi3WGK[\u001f\u0019gB\u0006\u0004\u001fh͆.\n8Ϛ\u00181\u0002%<,uFiO;!\u001a\u0011~\tϼz\txjY\u0001`Y\u00113|\u0019O,\u001f\u000b\tH\u0081\tqXӹp.\u0017e*mΞ\u0002'"}, d2 = {"\u001ab^:\")KO.~D^=|\u0012>sI\u0006\u0006I\u0010\u0017 VM\nIu3%d|\u001cFm\u0015\u000e^CDz\n", "", "1n]AX5M1\u0015\fyl", "", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "CrT?<+", "", "Bh\\2f;:[$lz\\6\u0006\b=", "", "7r5?b4(T\u001a\u0006~g,j\u00189r{*{", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`\u001eCx\u0010\u0006d4B]\u0007\"\rR\u000bq>", "/k[\u0010T9=a", "", "5dc\u000e_3\u001cO&}\t", "u(;7T=:\u001d)\u000e~euc\r=tU", "1`a166N\\(", "", "5dc\u0010T9=1#\u000f\u0004m", "u(8", "7r4:c;R", "u(I", "5dc!\\4>a(z\u0003i\u001a|\u00079n~6", "u(9", "Cme6X>>Rvz\b]\n\u0007\u00198t", "5dc\"a=BS+~y<(\n\b\ro\u00101\u000b", "5dc\"f,K7\u0018", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0019T:MC$}vm,{l8S\u007f&\u0006I\u007f%wTy\u0016\u001c\u0002/3\\", "7rC6`,Lb\u0015\u0007\u0006H3{\t<T\u0003$\u0005", "/fT X*H\\\u0018\r", "BnBAe0GU", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ContentCardsUpdatedEvent {
    public static final Companion Companion = new Companion(null);
    private final List<Card> contentCards;
    private final boolean isFromOfflineStorage;
    private final long timestampSeconds;
    private final String userId;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$2ߢx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005<i%\nCiWPBxޣQɁkq~L`\u000eQ\u000f\u001e\u0018~n:NǪ|c"}, d2 = {"\u001ab^:\")KO.~D^=|\u0012>sI\u0006\u0006I\u0010\u0017 VM\nIu3%d|\u001cFm\u0015\u000e^CDzr{\u001fpl5\u0010g6WL", "", "u(E", "3l_Al\u001cIR\u0015\u000ez", "\u001ab^:\")KO.~D^=|\u0012>sI\u0006\u0006I\u0010\u0017 VM\nIu3%d|\u001cFm\u0015\u000e^CDz\n", "5dc\u0012`7Mg\t\nyZ;|G+n\t2\u000b<\u0010\u001b!P}", "5dc\u0012`7Mg\t\nyZ;|", "u(;0b4\bP&z\u0010^u|\u001a/n\u000f6E\u001e\u000b &Gx\u001d\u001ar24gm+6i%.L#Lk=-j", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getEmptyUpdate$annotations() {
        }

        public final ContentCardsUpdatedEvent getEmptyUpdate() {
            return new ContentCardsUpdatedEvent(CollectionsKt.emptyList(), null, DateTimeUtils.nowInSeconds(), true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentCardsUpdatedEvent(List<? extends Card> contentCards, String str, long j2, boolean z2) {
        Intrinsics.checkNotNullParameter(contentCards, "contentCards");
        this.contentCards = contentCards;
        this.userId = str;
        this.timestampSeconds = j2;
        this.isFromOfflineStorage = z2;
    }

    public static final ContentCardsUpdatedEvent getEmptyUpdate() {
        return Companion.getEmptyUpdate();
    }

    public final List<Card> getAllCards() {
        return CollectionsKt.toMutableList((Collection) this.contentCards);
    }

    public final int getCardCount() {
        return this.contentCards.size();
    }

    @Deprecated(message = "\u0018Y\u0001txy)KaT-\u000ed\u00169^OQ\f6\u0013l\u001f\u001a?\u00066TO\u000b%/([v\u0002aeu>Y24G\"IQ|1fLN%\u0006\u001f! S\u001dRc", replaceWith = @ReplaceWith(expression = "timestampSeconds", imports = {}))
    @InterfaceC1492Gx
    public final long getLastUpdatedInSecondsFromEpoch() {
        return this.timestampSeconds;
    }

    public final long getTimestampSeconds() {
        return this.timestampSeconds;
    }

    public final int getUnviewedCardCount() {
        List<Card> list = this.contentCards;
        int i2 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Card card : list) {
                if (!card.getViewed() && !card.isControl() && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i2;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isEmpty() {
        return this.contentCards.isEmpty();
    }

    public final boolean isFromOfflineStorage() {
        return this.isFromOfflineStorage;
    }

    public final boolean isTimestampOlderThan(long j2) {
        return TimeUnit.SECONDS.toMillis(this.timestampSeconds + j2) < DateTimeUtils.nowInMilliseconds();
    }

    public String toString() {
        return "ContentCardsUpdatedEvent{userId='" + this.userId + "', timestampSeconds=" + this.timestampSeconds + ", isFromOfflineStorage=" + this.isFromOfflineStorage + ", card count=" + getCardCount() + AbstractJsonLexerKt.END_OBJ;
    }
}
