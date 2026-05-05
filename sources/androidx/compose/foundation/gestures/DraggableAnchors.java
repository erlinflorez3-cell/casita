package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&˛\bDRш|İI\u0006>\u00116B\u0005$4\u0012\u0006\fnj?0LeV7ZS0\u000fs{B$cҕyCQU\"}8\tWNmot0pŏk\u0011\fǝ\u0007i\\I\u0004x&'\u001d7ZqU2\u0004ڎm=nzN\u0005N9h\\ѩ\t\u0001(2\u0011-\u0005\u007f[M\"\u0011fϋ!>`\u0013e\u0005H\u00196B.\n6\\\u0016X|lǰa:=.K(PZ?_^\n}ATb?=\u0007r.:vʺ߱\u0019/Y\u0013\u0017XaP\u0013AwC+z78;X\"^͏\\\n\u001a%;U\u0013n\u0003(b\u000bwf\u001c);O\u0012X~\u001dn\u001cC\u000f\u001bO\u001c\u000e41x2;.~\bDޗ;\u0017ՂDP\u0010s\u000b\u0006\twN\u0017S\u0007yO\u0002!thy;GU} M ,;\u0019nOb\u0005\u0012n)3T.\u0383wu͘AH\\#*M{\u0005\tb0,ZΩIĬ3\u007f)0\u001d(E_߶\"ܩȀ\u0002LLi|$\u000fg\u05eemlͳD!"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0015\u0010a/X\u00045\u001d", "\"", "", "Ahi2", "", "5dc \\A>", "u(8", "1k^@X:M/\"|}h9", ">nb6g0H\\", "", "uE\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "AdP?V/.^+z\b]:", "", "uEIu?1:d\u0015H\u0002Z5~R\u0019b\u0005(yOV", "4na\u0012T*A", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "/mR5b9", "6`b\u000ea*A]&_\u0005k", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", ";`g\u000ea*A]&", ";h]\u000ea*A]&", ">nb6g0H\\\u0003\u007f", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?!", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface DraggableAnchors<T> {
    T closestAnchor(float f2);

    T closestAnchor(float f2, boolean z2);

    void forEach(Function2<? super T, ? super Float, Unit> function2);

    int getSize();

    boolean hasAnchorFor(T t2);

    float maxAnchor();

    float minAnchor();

    float positionOf(T t2);
}
