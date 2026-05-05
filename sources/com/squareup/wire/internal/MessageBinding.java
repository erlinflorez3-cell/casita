package com.squareup.wire.internal;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Syntax;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import okio.ByteString;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&˛\bDRш|\u0004G\u00068\u000bDB\u0007\"2\u0013\u007f\u0007t\rA0RkP.hS2\u000fq|<$i0yCAV\"}8\tWNmhvJp\u000bK\u000f\f\u0019\u0001j:I]xc\u001a\u00172XoG3SrC\u001evҚ^\u000b&݅07\"\u0005/\u001aRN\u0016u\tDs\f@0pphRU`\u0013.*\u0006l51\"j}f6~Ǎ$^ǥ'\u0003wY\u0017:mH\u0015M;N\u0005+\u001b\ry\u001ea¨}Yչ)S\u0011 \u001bvM\u001dWqk \u0019+5Aas\u000e̬\t\u0004\"1CO;e9Jػ\tQn)o6]\u0002cPD'>\u001fԫ\u0011<\u0012-N:VNE\u001a\u001dڜ>7\u0003\u0014k@\u0007\u0001%fȸ~aD9m-ANQ\u001b\u0015l\u0012?'oO{;\fN'\u000f\u00139[\u0003\u0016\u0011\u0019)y\u0010Q_wpCVu\"[Sl2p)&ò\b0U(w\u000f\u001fW/%evi'/\r\u001aHzf=)¾lSw|\u0019X0p.?:\r\u0012ɮTd;ߘ~W/³\u0013ܖ X\u001f\u007f\u000e\u0017.aHd/+(f_jyj{e\u001a3?rG[~kDãI`C5\bb>j\u0001}j͚>И\t\\~DY\u0016hgx4@T\u0003\u0012\u000ezr[bƵ4Ɛu L.7'j$\u0019\u0013,RY|7p1ӷ\u0012њX7<\u0005o6\u0003\u001cˏOʔʜok\u0001K2\u001c\u000f!γE|ۂ\u001d%"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006^%Cgy\"7J\u001a7LGDm\n", "\u001b", "", "\u0010", ";db@T.>B-\nz", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "5dc\u001aX:LO\u001b~ir7|", "u(;8b;EW\"H\b^-\u0004\t-tI\u000eYG|%%\u001d", "4hT9W:", "", "", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006W)5`|\nDW\u001f.7D\u0018o=\u001d\u0019qc\u000f", "5dc\u0013\\,ER'", "u(;7T=:\u001d)\u000e~eud\u0005:;", "Bx_2H9E", "", "5dc!l7>C&\u0006", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Ax]AT?", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqiT\n&\u0013ZE", "5dc l5MO,", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nn+ Vk!\u0012", "CmZ;b>G4\u001d~\u0002]:", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", ";db@T.>", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u000b\u001d\u001bQ9jP\u0006%#h\u000b$@ok", "5dc\u0010T*AS\u0018lzk0x\u00103z\u007f'iD\u0016\u0017", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "Adc\u0010T*AS\u0018lzk0x\u00103z\u007f'iD\u0016\u0017", "", "Ahi2", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_\u0004q", "<df\u000fh0ER\u0019\f", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "0tX9W", "0tX9W,K", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "/cS\"a2G]+\b[b,\u0004\b", "B`V", "4hT9W\fGQ#}~g.", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\\D\u0001\u001e\u0016'x\fFu)>[S", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_'~!\u001f\u0011}\u001aLr25i\tiIq#.\u0017$?k;\u001dtq_C\u0006g5PL\u000eLH_(&YnF\u0016[D\u000bS+\u000b\u0014/\u0005\u0015", "1kT.e\u001cGY\"\t\rg\r\u0001\t6d\u000e", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public interface MessageBinding<M, B> {
    void addUnknownField(B b2, int i2, FieldEncoding fieldEncoding, Object obj);

    M build(B b2);

    void clearUnknownFields(B b2);

    int getCachedSerializedSize(M m2);

    Map<Integer, FieldOrOneOfBinding<M, B>> getFields();

    KClass<? super M> getMessageType();

    Syntax getSyntax();

    String getTypeUrl();

    B newBuilder();

    void setCachedSerializedSize(M m2, int i2);

    ByteString unknownFields(M m2);
}
