package com.facebook.fresco.ui.common;

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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјnjO0L͜P.hS2\u000fq{<$q$yّAi0ԂR\t}M(r~Nh\u000b[\u000f4\u0017ѱn,WWAs \u0012JB\u001eCcQ}BQ`#<5$@)Py3\t`>\u0011&\u0005\u0004[K:\u0016`D~?j\r{\u000bJ\u0016\u0014H8\u0001Lg.b\u0007Tz]R/Q\u0004@ĬPϮc0\u0005ձϞJ`"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~=\u0006\u001c9m\u0001.ZD\u001agC\u001a}rp=\bg,[L", "\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~=\u0006\u001c9m\u0001.ZD$uC\"\u0016laF\\", ">da37(MO\u007f\u0003\tm,\u0006\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~=\u0006\u001c9m\u0001.ZD\u001agC\u001a{loH\u0007l,[L", "uKR<`u?O\u0017~wh6\u0003R0r\u007f6yJJ'\u001b\u0011m\u0018D~/>#a(3o\u0016\u0019MP<J0-\u0011OeG\u0016c5N\u0004|\u000b=", "<nc6Y@%W'\u000ezg,\n\u0017\u0019fp,\nD}\u001b\u001eK~\"*\u0006!DYm+6i%.", "", "AsPAX", "\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~=\u0006\u001c9m\u0001.ZD)z0-\u0015>", "Dhb6U0EW(\u0013hm(\f\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~J\u0002.;j\u001a5QROYC\u001a$h7", "<nc6Y@,b\u0015\u000e\u000bl\u001c\b\b+t\u007f'", "7lP4X\u0013HO\u0018l\nZ;\r\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\n<e\u000e&\u0006\n\u0011\u001b`Ey\u0016D\u0001.~=\u0006\u001c9m|8IB)z0-%v7", "Ch\u001c0b4F]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class ImagePerfDataNotifier implements ImagePerfNotifier {
    private final ImagePerfDataListener perfDataListener;

    public ImagePerfDataNotifier(ImagePerfDataListener perfDataListener) {
        Intrinsics.checkNotNullParameter(perfDataListener, "perfDataListener");
        this.perfDataListener = perfDataListener;
    }

    @Override // com.facebook.fresco.ui.common.ImagePerfNotifier
    public void notifyListenersOfVisibilityStateUpdate(ImagePerfState state, VisibilityState visibilityState) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(visibilityState, "visibilityState");
        this.perfDataListener.onImageVisibilityUpdated(state.snapshot(), visibilityState);
    }

    @Override // com.facebook.fresco.ui.common.ImagePerfNotifier
    public void notifyStatusUpdated(ImagePerfState state, ImageLoadStatus imageLoadStatus) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(imageLoadStatus, "imageLoadStatus");
        this.perfDataListener.onImageLoadStatusUpdated(state.snapshot(), imageLoadStatus);
    }
}
