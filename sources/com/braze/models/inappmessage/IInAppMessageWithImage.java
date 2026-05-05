package com.braze.models.inappmessage;

import android.graphics.Bitmap;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4E\u0007\":\u001b\u007f\u0007loA0RqP.X[0t\u0002ڔd$\n#B[IU2\u007f8\b}O>̎zН^\u0015[\u0011\f\u0018\u0007mLK[|k\u0017_NPuW3{v\u0014ˇlҽ:\u001504(@\b\u000e\u0019\u001c0R\u001e\u0002\u001bEQ\u0018 =\u0011\u0003H`%O\u001b\u0019@\u0015\u0015ŏ\u0003ɉ`kf8N|kK\u007f;\u0011{ZP=^^\f$ϜRù+\u0017\u000fc$>NHU\u0017+g\u0011\u001c#sM\u0019WsS\u0004\u00176}ȉUָ[@p\u0002\u001a,9`-_x>j\u001aƢ_ϯʯ+SkMV-Vvߧ\u007f&ʞ\b\r"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001e\u0007lp<jk(Pv|", "", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "5dc\u000f\\;FO$", "u(;.a+K]\u001d}D`9x\u00142i}6E\u001d\u0005&\u001fCzc", "Adc\u000f\\;FO$", "uKP;W9HW\u0018H|k(\b\f3c\u000eqXD\u0010\u001f\u0013REQ-", "7lP4X\u000bHe\"\u0006\u0005Z+j\u0019-c\u007f6\nA\u0011\u001e", "", "5dc\u0016`(@Sw\t\rg3\u0007\u0005.S\u0010&y@\u000f%\u0018WvL8\u007f.?hy/;w\u001f<", "u(E", "5dc\u0016`(@Sw\t\rg3\u0007\u0005.S\u0010&y@\u000f%\u0018Wv", "u(I", "Adc\u0016`(@Sw\t\rg3\u0007\u0005.S\u0010&y@\u000f%\u0018Wv", "uY\u0018#", "7lP4X\u001cKZ", "", "5dc\u0016`(@S\t\f\u0002", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ":nR._\u0010FO\u001b~jk3", "5dc\u0019b*:Z|\u0007v`,l\u00166", "Adc\u0019b*:Z|\u0007v`,l\u00166", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "@d\\<g,\"[\u0015\u0001zN9\u0004", "5dc\u001fX4Hb\u0019b\u0003Z.|x<l", "Adc\u001fX4Hb\u0019b\u0003Z.|x<l", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface IInAppMessageWithImage {
    static /* synthetic */ void getImageDownloadSuccessful$annotations() {
    }

    Bitmap getBitmap();

    boolean getImageDownloadSuccessful();

    String getImageUrl();

    String getLocalImageUrl();

    String getRemoteImageUrl();

    void setBitmap(Bitmap bitmap);

    void setImageDownloadSuccessful(boolean z2);

    void setLocalImageUrl(String str);

    void setRemoteImageUrl(String str);
}
