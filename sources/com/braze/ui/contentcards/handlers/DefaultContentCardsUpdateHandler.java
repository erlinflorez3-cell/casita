package com.braze.ui.contentcards.handlers;

import android.os.Parcel;
import android.os.Parcelable;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116Ȑ\u0007\":0\u007f\u0007|jAӄLe^.Zݷ2\u000fy{<řc$\bCCU ~(\u001deȞ\u0006t\u001fJ\t\n{\u000e\u0013V{̶0Icx&\u0018\u001d3Zom5\u0014\u0004\u0006MnwN\u000b0428(\n/\u001eZL\u001e|\u0013Cy\u0013XD\t\u0007HZ%M3#B\nL*\u0019\u001e\u000br~:Vxu:]%I}ŒR5"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}W?r.4`}-E7t.N?KrC{\u001fqp9\u0010r\nJ\u0004&U<Y+Xar \u0010\u001bY\u0015N8b", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}W?r.4`}-E7y\fWLJk=-rdn8\u0015S7Mr6G/J5[YrJi", "u(E", "2db0e0;Sv\t\u0004m,\u0006\u0018=", "", "6`]1_,\u001cO&}ji+x\u0018/", "", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "3uT;g", "\u001ab^:\")KO.~D^=|\u0012>sI\u0006\u0006I\u0010\u0017 VM\nIu3%d|\u001cFm\u0015\u000e^CDz\n", "EqXAX\u001bH>\u0015\fx^3", "", "2dbA", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007}", "4kP4f", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class DefaultContentCardsUpdateHandler implements IContentCardsUpdateHandler {
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DefaultContentCardsUpdateHandler> CREATOR = new Parcelable.Creator<DefaultContentCardsUpdateHandler>() { // from class: com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsUpdateHandler createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new DefaultContentCardsUpdateHandler();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsUpdateHandler[] newArray(int i2) {
            return new DefaultContentCardsUpdateHandler[i2];
        }
    };

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ}џg\u0001ˎ`D\u0014GnWY*Ƃo{B$,8\u007fDS[*\u007f2\t}Q\u0016i%N1ŗEǇ\n\u0016\u0001̓\u0082MY"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}W?r.4`}-E7t.N?KrC{\u001fqp9\u0010r\nJ\u0004&U<Y+Xar \u0010\u001bY\u0015N8KbcI/jM;)\u0011\u0002", "", "u(E", "\u0011Q4\u000eG\u0016+", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007$xG\u0001UtTo\nK\u00012\u000b", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}W?r.4`}-E7t.N?KrC{\u001fqp9\u0010r\nJ\u0004&U<Y+Xar \u0010\u001bY\u0015N8b", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsUpdateHandler
    public List<Card> handleCardUpdate(ContentCardsUpdatedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return BrazeContentCardUtils.INSTANCE.defaultCardHandling(event.getAllCards());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i2) {
        Intrinsics.checkNotNullParameter(dest, "dest");
    }
}
