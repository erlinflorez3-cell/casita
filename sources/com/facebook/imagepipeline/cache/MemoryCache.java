package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.HasDebugData;
import com.facebook.common.internal.Predicate;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.memory.MemoryTrimmable;
import com.facebook.common.references.CloseableReference;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0006DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007lmA0ZeP.XU2\u000fy\u0005<$a$yCQU\"}(\fWNugvJ`\rIs\u001cǝ!l2կcw\u0006\u0014\u00151Poo3{pm9\u000fvn\u0004;zKF\u0003\u001d\t*,X\u0010-yYJ:\u001c`D~Ej\r\u0004ĨJ\u001c\u0014J8\u0007.^wNlG\u001bg\u0001Sݭ\u0007iP[os>\u000be\rtcW\u0011\u0005l6+vʺ{ս%٨\u0007\u0007`k\b\u0018M\u007fU\u0005\u00176W5W\u0005o<h\u0002$\u0015a˽;o9͍\\Mmn\u001f?3_e[PD'\u000ey*\u0017l\b\u001c\u0011?HdƦ`Ǹ\bԧ7t\u0001g\te\u0010sZ\u0002\u0011`l\u0016U\u0004A6Q\u001b\u001dϟ(_ϭR7\n\u001bU11\u0018\u0007!\nl>d#&lw\bĸ\u0018dףLN\u0018r\u0006\u0002\u0012\u000bz\u0002X\b`Q\u000e@\u0014\u0017>\u001957\u0012ݽQ32&\u0019Tuy\u001d`\u0017W@ʔJغ&r.90\u000e\u001a`\u0015t\u0013rhT\u00070gܚ\u001eΤ\u000b\u0002 \u0015&d\u0006Bǂ),"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015>", "\u0019", "$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006^%=c\u000b4&z\u001a6U?8r4s", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0007+c\u0003(E>\u000b\u001f\u001fQxW\u001fr3\u0014Yz09L\u0012=I\u0019", "1nd;g", "", "5dc\u0010b<Gb", "u(8", "Ahi2<5\u001bg(~\t", "5dc \\A>7\"[\u000fm,\u000b", "1`R5X", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "9dh", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b>\u000b\u001f`Hk\f<s/?_G\u001eAu\u001e8V\rHk5\u001e\"hj7\u0007qu,}1ULJ)cR_=\u0015\u0012g\u000eW)\rZ\u001d(\"xL\u0001 \u0004*I~Er\u0007U\u0014\u0018=rzK \u001dGz\u0015\u0003A2fFg)WNKSb&a\u0013_\n\\;:1\u0014z\u0017\u001b>", "1n]AT0Ga", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", ">qT1\\*:b\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u0005 &G|\u00178}n f}\u001f;k\u0012=M\u0019", "5dc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'~!\u001f\u0011p\n:v\"?c\u0004i5w\u001e6WL\u0005x4\u001f\u0015uaB\u0005c:\u0018T.QZN(YYr*\u0014\u0013Z\u001bN4\u000b\u0005/", "7mb=X*M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", ">q^/X", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "@d\\<i,\u001aZ ", "\u0011`R5X\u001bKW!l\nk(\f\t1y", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface MemoryCache<K, V> extends MemoryTrimmable, HasDebugData {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLш|\u0004O\n8é6B\u0015\"4ߚ}ҿ\u0000iOӄtev-\u001ba8\u000f\u0004{b%\f(\u007fESUH\u0001h-ҐRk"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015'?5\u0005f,=\u0004+O:]9Xar?(g", "", "5dc!e0F@\u0015\u000e~h", "", "BqX:G@IS", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006^%=c\u000b4&z\u001a6<WFk\n", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface CacheTrimStrategy {
        double getTrimRatio(MemoryTrimType memoryTrimType);
    }

    CloseableReference<V> cache(K k2, CloseableReference<V> closeableReference);

    boolean contains(Predicate<K> predicate);

    boolean contains(K k2);

    CloseableReference<V> get(K k2);

    int getCount();

    int getSizeInBytes();

    V inspect(K k2);

    void probe(K k2);

    int removeAll(Predicate<K> predicate);
}
