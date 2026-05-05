package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.StateWrapper;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007lkA0ZeP.`_2şs{J$cҕyCIh\"Ԃ*\t]]ogtMb\u000bY\u000f\u000eǝ\u0001jBI]ތe\u0012\u001d;JoE4Sە=Oś%63\u001fr'>yڱ\u0005\u001a8HX\u001f\tDc\f@2ptHU%M3\u001eB\nL%\u0019\u001e\u000bk~:Vru:]'3oPU?aF{{\u0015\rYo5\u0005b6+n9e\u00193V\u001b\u0007\u0001_o\u0007MvU\u0005\u0017+W/Wyo6\u0007\tD\u001b9V%_\t%\u000b\r\u0018eTZ9Y{K~\u0019X{\t~%<2\u00126+V:E\u001a\u0015\u0015>?\u0003\u0001kH`\u0006nD\u0016y\u00105E4079I3f\u007fe\u0002\u001e\u05ee;{\u0013\u001ef]\u000f\u00019[\u0003\u0019\u0011\u0019)W\u0010Q_UpAVS\"Ykq4tp\u0015B\u0004^P05\n%F\u0019;6\nNS'y\u0018`F}u3w\u0019Wwj`@P\b\\<r'\u001at\\d3v\u0001Xf/)MJX7\u0002\u0016\u00188\\&@Q)\u001eigh\u0018n\u0014bܬ)K"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmWD\u00015>h\u0002)97\u001e8]LJoC\u001e\u001dv+!\u0011s5]Z6GT/(Za|J(g", "", "u(E", "1qT.g,\u001dW'\nvm*\u007ff9m\b$\u0005?h!'P~qKv-", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmWD\u00015>h\u0002)97\u001e8]LJoC\u001e\u001dv+\u0018\u000bq7J\u0006%J*X4dN{<{\u001cj\u0017]\u000f\u001c\u0005a\u0017", "Ata3T*>7\u0018", "", "@dP0g\u001b:U", "1n\\:T5=7\u0018", "1n\\:T5=/&\u0001\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "", "1qT.g,\"\\([\u000b_-|\u0016\fa\u000f&~(\u000b' VS\u001d<~", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmWD\u00015>h\u0002)97\u001e8]LJoC\u001e\u001dv+!\u0011s5]Z6GT$", "7mc\u000fh-", "", "=aY\u000fh-", "", "1n\\:\\;'c!{zk", "uHJ\u0016N\u0013CO*zDe(\u0006\u000bxO|-{>\u0010lz\u000bV\fF~n6U{ 4w 4\u0017P;g2-^i]6\u0014g*\u0018~1WU]0eT<E\u001e\"c\u001dR:\r\rg\u000b\fxT@.k;I\n\u0011", "1qT.g,)`\u0019Z\u0002e6z\u0005>ep,{Rh!'P~qKv-", "1n\\=b5>\\(", ">q^=f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "AsPAX\u001eKO$\nzk", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n#hy/7_#*XN;x\n", "7r;.l6Nb\u0015{\u0002^", "", "1qT.g,,S\"}V\\*|\u0017=i|,\u0003D\u0010+vXo\u0017K^/Eb\r\u0004Fm\u001e", "3uT;g\u001bR^\u0019", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class MountItemFactory {
    public static final MountItemFactory INSTANCE = new MountItemFactory();

    private MountItemFactory() {
    }

    @JvmStatic
    public static final DispatchCommandMountItem createDispatchCommandMountItem(int i2, int i3, int i4, ReadableArray readableArray) {
        return new DispatchIntCommandMountItem(i2, i3, i4, readableArray);
    }

    @JvmStatic
    public static final DispatchCommandMountItem createDispatchCommandMountItem(int i2, int i3, String commandId, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        return new DispatchStringCommandMountItem(i2, i3, commandId, readableArray);
    }

    @JvmStatic
    public static final MountItem createIntBufferBatchMountItem(int i2, int[] intBuf, Object[] objBuf, int i3) {
        Intrinsics.checkNotNullParameter(intBuf, "intBuf");
        Intrinsics.checkNotNullParameter(objBuf, "objBuf");
        return new IntBufferBatchMountItem(i2, intBuf, objBuf, i3);
    }

    @JvmStatic
    public static final MountItem createPreAllocateViewMountItem(int i2, int i3, String component, ReadableMap readableMap, StateWrapper stateWrapper, boolean z2) {
        Intrinsics.checkNotNullParameter(component, "component");
        return new PreAllocateViewMountItem(i2, i3, component, readableMap, stateWrapper, z2);
    }

    @JvmStatic
    public static final MountItem createSendAccessibilityEventMountItem(int i2, int i3, int i4) {
        return new SendAccessibilityEventMountItem(i2, i3, i4);
    }
}
