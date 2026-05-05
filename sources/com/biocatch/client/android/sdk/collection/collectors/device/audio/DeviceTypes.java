package com.biocatch.client.android.sdk.collection.collectors.device.audio;

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
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004O\f8\u000b4b\u0005Ӵ+(Մ7lz;@D\u0014߉\\Q\u00147\u0015k\f82[<qq<ڈ\u001e}0\u000b ]ug\u0007J\t\fß\u0013\f\u001eю\u0003.OX\u0007az\u000f8GX?9SX=?g]6\u000b(\u001b\">\u0003m\u0001 41\u0010|\u0006,K\u0012\u001e\u0019@vG;\rS\u0013\u0003\u0012\fM\t\u0001$lPN<YU]@A\f\u0003oU7'eDeM\u0013[='\u0013\rJ\u001e1W 5\u001b=<\u0003\rkD?\tYZ=\u000b\u0004\u0010'1e\\W<uh\u0014\u001bI8\rc\u0012\u000f\\\u000bqI\f-L8cQr˔,\u001b"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011KN=`Pr\u0007\u0010\"Y\u0012Xtk\u0005jE\"n3K*\b:\u001f", "", "Bx_2", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$D\b", "5dc!l7>", "u(8", "\"X?\u0012R\t.7\u007fm^G&\\d\u001cPc\bY ", "\"X?\u0012R\t.7\u007fm^G&js\u000fAe\bh", "\"X?\u0012R\u001e\"@x]tA\fXg\u001dEn", "\"X?\u0012R\u001e\"@x]tA\fXg\u001aHi\u0011[.", "\"X?\u0012R\t%CxmdH\u001b_\u0003\u001dCi", "\"X?\u0012R\t%CxmdH\u001b_\u0003\u000b2^\u0013", "\"X?\u0012R\u000f\u001d;|", "\"X?\u0012R\u000b(1~", "\"X?\u0012R\u001c,0\u0013ZX<\fjv\u0019Rs", "\"X?\u0012R\u001c,0\u0013]ZO\u0010Zh", "\"X?\u0012R\u001c,0\u0013aZ:\u000bjh\u001e", "\"X?\u0012R\u001b\u001e:xi]H\u0015p", "\"X?\u0012R\u0013\"<xxVG\bcr\u0011", "\"X?\u0012R\u000f\u001d;|xVK\n", "\"X?\u0012R\u000f\u001d;|xZ:\u0019Z", "\"X?\u0012R\u0013\"<xxYB\u000e`w\u000bL", "\"X?\u0012R\r&", "\"X?\u0012R\b.F\u0013e^G\f", "\"X?\u0012R\u0010)", "\"X?\u0012R\t.A", "\"X?\u0012R\u000f\u001e/\u0006bc@&Xl\u000e", "\"X?\u0012R\t.7\u007fm^G&dl\r", "\"X?\u0012R\r&M\bnc>\u0019", "\"X?\u0012R\u001b/M\bnc>\u0019", "\"X?\u0012R\t.7\u007fm^G&js\u000fAe\bh:nrw'", "\"X?\u0012R\u0019\u001e;\u0003mZX\u001ale\u0017Ir", "\"X?\u0012R\t%3\u0013aZ:\u000bjh\u001e", "\"X?\u0012R\t%3\u0013le>\bbh\u001c", "\"X?\u0012R\t%3\u0013[gH\b[f\u000bSn", "\"X?\u0012R\u000b(1~xVG\bcr\u0011", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public enum DeviceTypes {
    TYPE_BUILTIN_EARPIECE(1),
    TYPE_BUILTIN_SPEAKER(2),
    TYPE_WIRED_HEADSET(3),
    TYPE_WIRED_HEADPHONES(4),
    TYPE_BLUETOOTH_SCO(7),
    TYPE_BLUETOOTH_A2DP(8),
    TYPE_HDMI(9),
    TYPE_DOCK(13),
    TYPE_USB_ACCESSORY(12),
    TYPE_USB_DEVICE(11),
    TYPE_USB_HEADSET(22),
    TYPE_TELEPHONY(18),
    TYPE_LINE_ANALOG(5),
    TYPE_HDMI_ARC(10),
    TYPE_HDMI_EARC(29),
    TYPE_LINE_DIGITAL(6),
    TYPE_FM(14),
    TYPE_AUX_LINE(19),
    TYPE_IP(20),
    TYPE_BUS(21),
    TYPE_HEARING_AID(23),
    TYPE_BUILTIN_MIC(15),
    TYPE_FM_TUNER(16),
    TYPE_TV_TUNER(17),
    TYPE_BUILTIN_SPEAKER_SAFE(24),
    TYPE_REMOTE_SUBMIX(25),
    TYPE_BLE_HEADSET(26),
    TYPE_BLE_SPEAKER(27),
    TYPE_BLE_BROADCAST(30),
    TYPE_DOCK_ANALOG(31);

    private final int type;

    DeviceTypes(int i2) {
        this.type = i2;
    }

    public final int getType() {
        return this.type;
    }
}
