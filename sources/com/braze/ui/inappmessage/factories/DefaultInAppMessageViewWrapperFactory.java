package com.braze.ui.inappmessage.factories;

import android.view.View;
import android.view.animation.Animation;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.braze.ui.inappmessage.IInAppMessageViewWrapper;
import com.braze.ui.inappmessage.IInAppMessageViewWrapperFactory;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$cҕyCQU\"}(\nWNu\u0006vJ`\u000bI#\u001cǝ)jZH\u0016{ٕ\u0016\u000f@B8\u0004AN\b=gb%:\u0013#J\"f}5\u0005(/`\u0010%\u0001sO\u001a\u0019H@\u001fB\u0003\u0011[\u000e2\u00124HP\u0007,g\u007fPLG\u001bij51\u0010\u0002Dd&\u000e<-S\u001bTl)#u\u0010\"qT\u007f\u0014#&k\u00035T\fC\u0011B\n=3lW+9N\fWd^0\u0018#2g\r\fzV`\u0013Zx\fU5\u007fiY[&*\u000ey*\u0019l\n\u001c\u0013?JD,Hr8\u0014A\u0003\u000bUVO0br\f\tpN\u001f5\u0002C+g\u001f|P\u0010KITE\r\u001d\u000f4\"/rgoړ\u0012r"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW=r#Dc\u000b$7{_\rMD7{;-xq=D\u0012K,\\\u0005#IL?0\\ddJ\u0010\u001de\u000e[\f\t\u0003hK1\u0003\u001a", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW Z.\u0011d\t\b7{$*OC,o40\u0007u]D\u0012c9/r%VV[@2", "u(E", "1qT.g,\"\\t\n\u0006F,\u000b\u0017+g\u007f\u0019\u007f@\u0013\t$Cz\u0019<\u0004", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW Z.\u0011d\t\b7{$*OC,o40\u0007u]D\u0012c9$", "7m0=c\u0014>a'z|^\u001d\u0001\tA", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7m0=c\u0014>a'z|^", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "7m0=c\u0014>a'z|^\u001d\u0001\tAL\u0004){>\u0015\u0015\u001eGV\u0012J\u0006%>Y\u000b", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u00121L\u0017v?\u0006\u0015vo5\tc\u001dRv9.PO,ZfpD\u0014x^\u001c]+\u0016\u0005f\u0017", "1n]3\\.N`\u0015\u000e~h5g\u00169v\u0004'{M", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;o&;IR?u=\t\"rr=\u0006c9$", "=oT;\\5@/\"\u0003\u0003Z;\u0001\u00138", "\u001a`]1e6BRb\u0010~^>F\u00058i\b$\u000bD\u000b `#x\u0012Dr49c\u0007u", "1k^@\\5@/\"\u0003\u0003Z;\u0001\u00138", "1kX0^(;Z\u0019b\u0004:7\bp/s\u000e$}@q\u001b\u0017Y", "0tcAb5L", "", "1k^@X\tNb(\t\u0004", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class DefaultInAppMessageViewWrapperFactory implements IInAppMessageViewWrapperFactory {
    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapperFactory
    public IInAppMessageViewWrapper createInAppMessageViewWrapper(View inAppMessageView, IInAppMessage inAppMessage, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, BrazeConfigurationProvider configurationProvider, Animation animation, Animation animation2, View view) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        return new DefaultInAppMessageViewWrapper(inAppMessageView, inAppMessage, inAppMessageViewLifecycleListener, configurationProvider, animation, animation2, view, null, null, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, null);
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapperFactory
    public IInAppMessageViewWrapper createInAppMessageViewWrapper(View inAppMessageView, IInAppMessage inAppMessage, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, BrazeConfigurationProvider configurationProvider, Animation animation, Animation animation2, View view, List<? extends View> list, View view2) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        return new DefaultInAppMessageViewWrapper(inAppMessageView, inAppMessage, inAppMessageViewLifecycleListener, configurationProvider, animation, animation2, view, list, view2);
    }
}
