package com.braze.ui.inappmessage.listeners;

import android.view.View;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.inappmessage.InAppMessageCloser;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4\u0012}\u0007njO0LeN0ZS@\u000fsڔ<$q$yّCU0}*\tUOmL\u0005Ϻ\u000b\u000bq\u000eN$\u0007jDI\u0004y\u000e\u0016\u001d4Zom6\u0014\u0014\u0006OnxN\u0005N3R<\b\n\u0019\u001aXN@z\tEc\f@3\u0007\u0015\u0003h\u001bT\u001d\u001a@\u0007n$\u000f#tg|<xpk<G#1l\trou>\u0005e\rtUW\u0011\u0005f6+n=e\u00193U\u001b\u0007\u0001^\u0006'\b\u0010K\u000e\u0001'U,ywe@p\u007fB [S\u001bi\u000b&\u000b\u0012\u0002d\u001a5CO\u0012Z\u00172p\u0016\t\f%<2\u000f6+V8E\u001a\u0015\u0013>7\u0003wk@~\b\u000fF\u000e|y6E(FWsO)wiai\u001a~;\n\n%\u001eQ\u0007\u001f%iV&`C\u001e\u001b\u001cϼ0̸҅=LV\f_\\\u001c\u0003\u0378f\u0014Đ\b/"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u00121L\u0017v?\u0006\u0015vo5\tc\u001dRv9.PO,ZfpD\u0014x^\u001c]+\u0016\u0005f\u0017", "", "/ec2e\nE]'~y", "", "7m0=c\u0014>a'z|^", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "/ec2e\u0016IS\"~y", "7m0=c\u0014>a'z|^\u001d\u0001\tA", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "0dU<e,\u001cZ#\rz]", "0dU<e,(^\u0019\bz]", "=m1Bg;H\\v\u0006~\\2|\b", "7m0=c\u0014>a'z|^\n\u0004\u0013=e\r", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW \u007f\u0001@de E{\u00120M!BuB\u001e\">", ";db@T.>0)\u000e\nh5", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~A}.Ei\u0018.*SJz>'j", "7m0=c\u0014>a'z|^\u0010\u0005\u0011/r\u000e,\r@", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001expi9\u0014q0_v|", "=m29\\*DS\u0018", "=m36f4Ba'~y", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface IInAppMessageViewLifecycleListener {
    void afterClosed(IInAppMessage iInAppMessage);

    void afterOpened(View view, IInAppMessage iInAppMessage);

    void beforeClosed(View view, IInAppMessage iInAppMessage);

    void beforeOpened(View view, IInAppMessage iInAppMessage);

    void onButtonClicked(InAppMessageCloser inAppMessageCloser, MessageButton messageButton, IInAppMessageImmersive iInAppMessageImmersive);

    void onClicked(InAppMessageCloser inAppMessageCloser, View view, IInAppMessage iInAppMessage);

    void onDismissed(View view, IInAppMessage iInAppMessage);
}
