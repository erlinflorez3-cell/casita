package com.braze.events;

import com.braze.enums.BrazePushEventType;
import com.braze.models.push.BrazeNotificationPayload;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u000enjG9LeN.ZS8\u0015sڔ<$i0yّA٭ \u0014̝9O|f(\u0002Z^\u0019C'\u0006Dyz0WW\u0011]@\u0012̓FoM7\u0016vKBxtd\u0006fތ#\u0001\u0001\u0013\u000b2*v\u0013=ڠD\u0014' ;Xphĥ=S\u000b\u001a \u0006V /\u001f\rmT6Vnu:]&IފA\u00178m<\u0015M;S\u0005-\u001b\u0005y A?e4[ɃTK\u000e`jW\u0003m\u0002\u0004\u07b2go.9Z\fWdjFу\u0014{^\u001b]\u000b&\u000b\u0006Ōd\u0012/˃geQU\u001c.H\n\n\u000fT\u0004<\tόL45Կ~\n\u0014:\u0003zՈDc"}, d2 = {"\u001ab^:\")KO.~D^=|\u0012>sI\u0005\t<\u0016\u0017\u0002W}\u0011\u001c\b%>hS", "", "3uT;g\u001bR^\u0019", "\u001ab^:\")KO.~D^5\r\u0011=/\\5wU\u0001\u0002'UrmMv.DH\u0012+7C", "<nc6Y0<O(\u0003\u0005g\u0017x\u001d6o{'", "\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`\u000f", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI\u0005\t<\u0016\u0017\u0002W}\u0011\u001c\b%>hl4Bmk\u0015KMC51+\u0011}a\u0003\u000fm+N}5\u0011W^:_\u001cOJ\u0010'ZvX:\u0011\u0006]? }HA(r(]\tEd\u007faY~", "5dc\u0012i,Gb\b\u0013\u0006^", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eqXM|,\u00172\u007f\u001c?V65b\r\u000fKx\u0016\u0004", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\u001aa\u0014/\u0006<\u007f", "u(;0b4\bP&z\u0010^u\u0005\u0013.e\u00076EK\u0011%\u001a\u0011L\u001b8\f%\u001ec\r$8q\u0014*\\GEt\u001f\u001a)ok5\u00069", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BrazePushEvent {
    private final BrazePushEventType eventType;
    private final BrazeNotificationPayload notificationPayload;

    public BrazePushEvent(BrazePushEventType eventType, BrazeNotificationPayload notificationPayload) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(notificationPayload, "notificationPayload");
        this.eventType = eventType;
        this.notificationPayload = notificationPayload;
    }

    public static /* synthetic */ BrazePushEvent copy$default(BrazePushEvent brazePushEvent, BrazePushEventType brazePushEventType, BrazeNotificationPayload brazeNotificationPayload, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            brazePushEventType = brazePushEvent.eventType;
        }
        if ((i2 & 2) != 0) {
            brazeNotificationPayload = brazePushEvent.notificationPayload;
        }
        return brazePushEvent.copy(brazePushEventType, brazeNotificationPayload);
    }

    public final BrazePushEventType component1() {
        return this.eventType;
    }

    public final BrazeNotificationPayload component2() {
        return this.notificationPayload;
    }

    public final BrazePushEvent copy(BrazePushEventType eventType, BrazeNotificationPayload notificationPayload) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(notificationPayload, "notificationPayload");
        return new BrazePushEvent(eventType, notificationPayload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrazePushEvent)) {
            return false;
        }
        BrazePushEvent brazePushEvent = (BrazePushEvent) obj;
        return this.eventType == brazePushEvent.eventType && Intrinsics.areEqual(this.notificationPayload, brazePushEvent.notificationPayload);
    }

    public final BrazePushEventType getEventType() {
        return this.eventType;
    }

    public final BrazeNotificationPayload getNotificationPayload() {
        return this.notificationPayload;
    }

    public int hashCode() {
        return this.notificationPayload.hashCode() + (this.eventType.hashCode() * 31);
    }

    public String toString() {
        return "BrazePushEvent(eventType=" + this.eventType + ", notificationPayload=" + this.notificationPayload + ')';
    }
}
