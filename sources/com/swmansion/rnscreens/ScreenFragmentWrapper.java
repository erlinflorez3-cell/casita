package com.swmansion.rnscreens;

import android.app.Activity;
import com.facebook.react.bridge.ReactContext;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<`\u0007\"B\u0012\u007f\u0007lkA0ZeP.XV2\u000fy{<$a(yCQU\"Ԃ*\teNo˧t/pŏs\u000f4\u0015)jZI\u001e\u0007k\u001e'2p|o7[}U9\u000fw|)h80G\u0012\u0005/'plX|\tSc\f@=\u0007\u0015\u0003X\u001b^\u001d\u001a@\u0013\u0005DI,jyf6vy\u000e>=1\u001bipQm\u0004x\u0005[ ^V=\f%udO\t?C*=U\u0019\u0006\u0001q\u0006'\u0010\bK\u0006\u0001-7-Ys\u00069\u0007\u0002jƪ-̠\u0011a\u000b(b\t_e\\=9U{K~\u0015~â\u0007ԫ\u0011F\u001c\u0010\f/V7M\u001cl\u0012\u001c>Ϩvj"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>:\u000b\u001c9u\u00167\\5Hg?)\u0015u7", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011P\u001b8x-5b\r\u0003At\u0015.Z\u0019", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>9\u000f @|t2[N7z2!\u0015u7", "1gX9W\u001a<`\u0019~\u0004<6\u0006\u0018+i\t(\tN", "", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>7\b)Fi\u001a7MP\u0011", "5dc\u0010[0ER\u0007|\b^,\u0006f9n\u000f$\u007fI\u0001$%", "u(;7T=:\u001d)\u000e~euc\r=tU", "Aba2X5", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>/", "5dc V9>S\"", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007u", "Adc V9>S\"", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5bSc(", "/cS\u0010[0ER\u0007|\b^,\u0006f9n\u000f$\u007fI\u0001$", "", "1n]AT0GS&", "=m2<a;:W\"~\bN7{\u0005>e", "=mE6X>\u001a\\\u001d\u0007vm0\u0007\u0012\u000fn~", "=mE6X>\u001a\\\u001d\u0007vm0\u0007\u0012\u001dt{5\u000b", "@d\\<i,\u001cV\u001d\u0006yL*\n\t/n]2\u0005O|\u001b G|", "Bqh\u0014X;\u001aQ(\u0003\fb;\u0011", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "Bqh\u0014X;\u001c]\"\u000ezq;", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface ScreenFragmentWrapper extends FragmentHolder, ScreenEventDispatcher {
    void addChildScreenContainer(ScreenContainer screenContainer);

    List<ScreenContainer> getChildScreenContainers();

    Screen getScreen();

    void onContainerUpdate();

    void onViewAnimationEnd();

    void onViewAnimationStart();

    void removeChildScreenContainer(ScreenContainer screenContainer);

    void setScreen(Screen screen);

    Activity tryGetActivity();

    ReactContext tryGetContext();
}
