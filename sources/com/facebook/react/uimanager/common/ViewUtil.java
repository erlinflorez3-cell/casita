package com.facebook.react.uimanager.common;

import android.view.View;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u000e\u0007nj?1LeV7Zݷ0Ʀk\u0012éT[Rp\u0004@[\u001aԥ&\t]N0u|Mr\u000bq\u00116\u001a\u0007nDI\u0004}$\u0017W@PrW3{qm=nzN\u0005N4h=B\u001b\u000f\u001dBH>x+GY\u0012*0nrjV\u001bT\u001d\u001a@\b\u0005%I,jof6vu\u000e>=)\u001bipPmd\u0001\t[\u000e^TU\u000fMѴpҋD7=ՖȕW\r"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n3c\u0006(Av_\u001fQCM[C\"\u001c>", "", "u(E", "\u001cNN H\u0019\u001f/v^tB\u000b", "", "5dc\"<\u0014:\\\u0015\u0001zk\u001b\u0011\u0014/", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "DhTDG(@", "Ata3T*>7\u0018", "7rA<b;-O\u001b", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ViewUtil {
    public static final ViewUtil INSTANCE = new ViewUtil();
    public static final int NO_SURFACE_ID = -1;

    private ViewUtil() {
    }

    @JvmStatic
    public static final int getUIManagerType(int i2) {
        return i2 % 2 == 0 ? 2 : 1;
    }

    @JvmStatic
    public static final int getUIManagerType(int i2, int i3) {
        int i4 = i3 == -1 ? 1 : 2;
        if (i4 == 1 && !isRootTag(i2) && i2 % 2 == 0) {
            return 2;
        }
        return i4;
    }

    @JvmStatic
    public static final int getUIManagerType(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return getUIManagerType(view.getId());
    }

    @Deprecated(message = "\u001cU\u0011t\u0005|$ldKg\t_)kQdQ\f2D|\u0014W6Zoq\u000e\u0004*&|Ti\u0002cemP\u00062By\u001bd_\n'[\\znDs\u001b \u000e'\u0004/~9A\u0005\u001b~K\u0010L\u0005I\u001d\u0014\r\ba\u0019M\u0002\u0001=6pgwDf[z\u000b'~%\u0004\u00135\u0014'\u0019JFS\u001d%^WFz\rV'QK%iT3.PKK.'r8\u0019\u000bD\r=$\u007f I\u0017]\u001f37\r=J", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @JvmStatic
    @InterfaceC1492Gx
    public static final boolean isRootTag(int i2) {
        return i2 % 10 == 1;
    }
}
