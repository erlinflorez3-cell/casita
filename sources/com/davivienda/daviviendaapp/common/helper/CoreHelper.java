package com.davivienda.daviviendaapp.common.helper;

import com.valid.vssh_android_core.VsshCoreManagerImp;
import com.valid.vssh_android_core.basecore.BaseResponse;
import com.valid.vssh_android_core.document.CoreDocumentImp;
import com.valid.vssh_android_core.generic.CoreGenericImp;
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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007njO0LeN/ZS@\u000fs{:%aӜqYП\u0006\u001a,!ITTg̊rJh\u000b\u0014\u001e\u0014\u0017\u0011jZKǤ|c\u001aƁJDuBAQ@RGe\r<\u0015\"B\"f\u00013\u0007ʀ.N\u0018͌\u0013EQ\u0014 9\u0011\u007fH\\%M3%Ū\nD(ҵ6^mZDUǶaH"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n3c\u0006(Av_1MJFkAgrrn9ic3Yv4\u001d", "", "u(E", "7mbAT5<Sv\t\b^\u000b\u0007\u0007?m\u007f1\u000b", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)a\t'\tJ\u0005\u0016\u0011Ey\u001b<@$?W\u000e(7v%w+MHk\u0013(\u0013xi9\u0010r\u0010V\u0002|", "5dc\u0016a:MO\"|z<6\n\t\u000eo}8\u0004@\n&", "u(;0b4\bd\u0015\u0006~]u\u000e\u0017=hy$\u0005?\u000e!\u001bFi\fF\u0004%~X\b\u001eGu\u00167\\\r\u0019uA\u001esr_I\u000fc5]Z/R\"", "7mbAT5<Sv\t\b^\u000e|\u0012/r\u0004&", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)a\t'\tJ\u0005\u0016\u0011Ey\u001b<@'5b}-;k_\fWP;M4'\u0015ue7jk7$", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)a\t'\tJ\u0005\u0016\u0011Ey\u001b<@\"1g}\u001eAz\u0016w*?Ik!\u001e#skB\u0015c\u0002", "5dc\u0016a:MO\"|z<6\n\t\u0011e\t(\tD~", "u(;0b4\bd\u0015\u0006~]u\u000e\u0017=hy$\u0005?\u000e!\u001bFi\fF\u0004%~[})7z\u001a,\u0017!Ex4\u007f\u0015qaF\u000ba\u0010V\u0002|", "7mbAT5<Sv\t\b^\u0014x\u0012+g\u007f5", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)a\t'\tJ\u0005\u0016\u0011Ey\u001b<@\u0016Cg\u0001}Az\u0016\u0016IL7m4+xpl\u000f", "5dc\u0016a:MO\"|z<6\n\t\u0017a\t$}@\u000e", "u(;0b4\bd\u0015\u0006~]u\u000e\u0017=hy$\u0005?\u000e!\u001bFi\fF\u0004%~J\f.:K ;M+7t0 \u0015uEA\u00129", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CoreHelper {
    public static final CoreHelper INSTANCE = new CoreHelper();
    private static final VsshCoreManagerImp instanceCoreManager = new VsshCoreManagerImp();
    private static final CoreGenericImp<BaseResponse> instanceCoreGeneric = new CoreGenericImp<>();
    private static final CoreDocumentImp instanceCoreDocument = new CoreDocumentImp();

    private CoreHelper() {
    }

    public final CoreDocumentImp getInstanceCoreDocument() {
        return instanceCoreDocument;
    }

    public final CoreGenericImp<BaseResponse> getInstanceCoreGeneric() {
        return instanceCoreGeneric;
    }

    public final VsshCoreManagerImp getInstanceCoreManager() {
        return instanceCoreManager;
    }
}
