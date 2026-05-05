package com.braze.enums;

import com.facebook.imagepipeline.memory.BitmapCounterConfig;
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
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004O\f8\u000b4N\u0005Ӵ+(Մ7lz;@D\u0014߉\\Q\u0014?\u0015k\f82[<qq<e\u001e\f$!O|h̊rJh\u000e\u0014\u001e\u0014\u0018\u0011jZJǤ|c\u001aƁJDuCAR@LG`\r63!ݨ&>\u0002ڎ\u0019\u001c0N\u001e{cCQ\u0013z0Fx#R\u0013Vm\u001a\u0018\u0010' \u0007)EgTB1lcG\u0018#\twŒR6"}, d2 = {"\u001ab^:\")KO.~D^5\r\u0011=/\\5wU\u0001\b\u001bG\u0002jF\u0007.4gS", "", "EhSA[\u000bI", "", "6dX4[;\u001d^", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$dZ\b", "5dc\u0015X0@V(]\u0006", "u(8", "5dc$\\+MVw\n", "\u001cNC\u00169\u0010\u001c/\bbdG&\\{\u001aAh\u0007[\u001fzz~#Qm", "\u001cNC\u00169\u0010\u001c/\bbdG&`q\u0016Ih\bu+p\u0005yASu\u0018X\u0005", "\u001cNC\u00169\u0010\u001c/\bbdG&cd\u001cG_\"_\u001ej\u007f", "\u001cNC\u00169\u0010\u001c/\bbdG&fq\u000f_c\u0010W\"`\u0011\u00056Yz0", "\u0010@B\u0012R\n\u001a@wxkB\fn", "\u0017MN\u000eC\u00178;xlh:\u000e\\\u0003\u0017O^\u0004b", "\u0017MN\u000eC\u00178;xlh:\u000e\\\u0003\u001dLc\u0007[0k", "\u001cNN\u000fB\u001c'2\u0007", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public enum BrazeViewBounds {
    NOTIFICATION_EXPANDED_IMAGE(478, 256),
    NOTIFICATION_INLINE_PUSH_IMAGE(BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 256),
    NOTIFICATION_LARGE_ICON(64, 64),
    NOTIFICATION_ONE_IMAGE_STORY(256, 128),
    BASE_CARD_VIEW(512, 512),
    IN_APP_MESSAGE_MODAL(580, 580),
    IN_APP_MESSAGE_SLIDEUP(100, 100),
    NO_BOUNDS(0, 0);

    private final int heightDp;
    private final int widthDp;

    BrazeViewBounds(int i2, int i3) {
        this.widthDp = i2;
        this.heightDp = i3;
    }

    public final int getHeightDp() {
        return this.heightDp;
    }

    public final int getWidthDp() {
        return this.widthDp;
    }
}
