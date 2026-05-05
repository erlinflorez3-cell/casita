package androidx.compose.ui.draganddrop;

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
/* JADX INFO: compiled from: DragAndDrop.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4ߚ\u007f\u0007tsA0JiN\u0013hݷZ\u000f\u001az|2i$\nCiVJ\u00020\u000bgN\u0016j5^#\u0019Q\u0013\u001e\u0016'o\\Mczu\u0012=5\t\u0014\bA[uU9\u000fuf\t.4:8(\bG.rV\u001e}\u0013Cy\rB4NrRR;PK.Z\u0014L(\u0019\u001e\u000bh~:Vnu:]&I}\u000b\\5hH|{\u000evX5\u000f\u000faL.\u0007K}#3]\u001b\u0007\u0001\\o\u0007MsU\u0005\u0017*m?˗rɎ̯X\u0004\u001c\u00171n;\\ğ*gԥU_"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Ik\u0017;u2?dG~Di\u0018\nVB\u001ax>)\u0004dn;\u0007r\u0002", "", "=m25T5@S\u0018", "", "3uT;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Ik\u0017;u2?dG~Di\u0018\nVB\u001ax>)tyaB\u00169", "=m3?b7", "", "=m4;W,=", "=m4;g,KS\u0018", "=m4E\\;>R", "=m<<i,=", "=mBAT9MS\u0018", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface DragAndDropTarget {
    default void onChanged(DragAndDropEvent dragAndDropEvent) {
    }

    boolean onDrop(DragAndDropEvent dragAndDropEvent);

    default void onEnded(DragAndDropEvent dragAndDropEvent) {
    }

    default void onEntered(DragAndDropEvent dragAndDropEvent) {
    }

    default void onExited(DragAndDropEvent dragAndDropEvent) {
    }

    default void onMoved(DragAndDropEvent dragAndDropEvent) {
    }

    default void onStarted(DragAndDropEvent dragAndDropEvent) {
    }
}
