package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&˛\bDZc|\u0004W\u00068é6B\r\"4\u0012}\bnjG6LeN6X8@ş\u0014\u0002:ři#\u001aCiUJ}P\n\u0018qui\u0007J\t\u000es\u0013\u0014\u001a\u0011jbկ\u0006|k\u0017'2poo7[uU9\u000f{|)ڶ6\"F\u0002M\u001e(3`\u0012\ryqK<\u0016>D\t:\t҈}\t(\u0018\u001e>N\bd\u0001ʄR6Vv&M=.\u001bipUWc>\u0001e\r|Öm1țe\u001e9L\u007fH#2k\u00035U\fC\u0011C\n=;ؒm;ȅMseD!\u001b\"$CO;`#*j\ti`Bʬ[SqQh\u000eV~A Ɂ@\u0004\u001c\u0016ТG͓Ʃ\u001aj\u0010\u00109\u0014!RĜT\u0013ߊF~"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u0019J\u0002 IO#8]N#g=\u001a\u0017hn\u000f", "\"", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u0019J\u0002 IU\u00127IE;x&\"$k?<\u000bj+[v0\u001d", "/cS#\\,P", "", ">`a2a;", "1gX9W", "7mS2k", "", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'| \u0016Ty\u0012;@69Y\u0010i(q\u0016@#'~\\", "5dc\u0010[0ERt\u000e", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q$D}\u0013Pn\u001bFz$~j\u0002 I7\u00072MU\u0011", "5dc\u0010[0ERv\t\u000bg;", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q\u0004d", "@d\\<i,\u001aZ o~^>\u000b", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q\u0004q", "@d\\<i,/W\u0019\u0011Vm", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q$D\b", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface IViewGroupManager<T extends View> extends IViewManagerWithChildren {
    void addView(T t2, View view, int i2);

    View getChildAt(T t2, int i2);

    int getChildCount(T t2);

    default void removeAllViews(T parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        UiThreadUtil.assertOnUiThread();
        for (int childCount = getChildCount(parent) - 1; -1 < childCount; childCount--) {
            removeViewAt(parent, childCount);
        }
    }

    void removeViewAt(T t2, int i2);
}
