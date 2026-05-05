package com.facebook.react.interfaces.fabric;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.interfaces.TaskInterface;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\":\u001b\u007f\u0007ljA0RqP.XT2\u000fy\u0002<$a%yCQU\"}(\nWNugvJ`\u000bK\u000f\u001c\u0016\u0001jBI]xc\u0013\u0015\u0017Xģo3{n\u0006?n\bN\u0005NFh\\B\u000b\u000f/BH>\u000bAg\u0014\u0018 FXvJT\u001dM32@\u001d\u0005DI*j\u0001f<Xnm:];1\u0001\trok>\u0017e\u0013VV7\r%yLB\u0007[\u0006%3S\u001b\u0007\u0001\\\u0016ƈAџA\t\u0001)--Wv(Ff\u0004,\u0015YTcǅt͉`\tib\u0012+9U4[^\u0015@w)\u0004cʄ\u0006؝\n+`03#t\u0012^C\u0003}k@~\u000e5۴\u0002ѐe:/'\u0006@9Gkx_pS\u001bd6*\u0015c̻%ъr%sV\u0014q#-ȑv\u0383ĻQDEJT)\b<ѐ\b\fĨ\u0006)"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tp\n:v3~Zy\u001dDq\u0014w:C7iC\f%ub5\u0005c\u0002", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0010b5MS,\u000e", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "7rABa5B\\\u001b", "", "u(I", ";nSB_,'O!~", "", "5dc\u001ab+NZ\u0019gvf,", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Ata3T*>7w", "", "5dc h9?O\u0017~^=", "u(8", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "5dc#\\,P", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\"\u000e!'RE", "1kT.e", "", "2dc.V/", ">qT?X5=S&", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tp\n:v3~Hy.=Q\u001f=MP<g2\u001ej", "\u001aiPCTuEO\"\u0001DO6\u0001\b\u0005", "AsP?g", "As^=", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface ReactSurface {
    void clear();

    void detach();

    Context getContext();

    String getModuleName();

    int getSurfaceID();

    ViewGroup getView();

    boolean isRunning();

    TaskInterface<Void> prerender();

    TaskInterface<Void> start();

    TaskInterface<Void> stop();
}
