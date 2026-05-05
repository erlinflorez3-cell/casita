package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d̉=!4i\bDR}|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007ljA0ZeP.XS2\u000f\u0002{<$i@yCAU\"}8\tWNmgvJp\u000bK\u000f\f\u0016\u0001jBI]xc\u0012'IPģW3{ne?pvF\u0005N3P8@\nв\u001e,N\u0012\u0005}[b\u001a۵H@\u001f9z\u0013]\u0007*\u00124=N\u0001daʄR8Npk=G:\u0011݃ZNUdX\u0003]\u000fVTU\u0012%ad0Ë;7\u001b+a\n\u001fiiΪ\u001b? <-n7);I\"_dXF\u0019Ʀ/Q\u0013f\u0001)t\u001a_j$'YZ\fQ`\u00108w)|;HJ\u0013Ν+H<:2{\u0016\u001cKt!bhV\u0012`R\u007f)`d#k\u0005Ĵ/9)vivI*f7*\u00175$3\u0003~!\nY<l[ ƻ{Q?dXRVb\"Yk\u0003,vr\u0004:\u0004^O.;B\u0016ѧ\u001b%Eqަ'8"}, d2 = {"At\\", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "", "\u001aj^A_0G\u001d\t[\u000fm,R", "At\\\u001cY\u001c\u001bg(~", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016Dz", "At\\\u001cY\u001c\"\\(", "\u001aj^A_0G\u001d\te\u0005g.R", "At\\\u001cY\u001c%]\"\u0001", "uKY.i(\bZ\u0015\b|(\u0010\f\t<a|/{\u0016D{", "\u001aj^A_0G\u001d\tl}h9\f^", "At\\\u001cY\u001c,V#\f\n", "BnD\u000fl;>/&\fvr", "\u001aj^A_0G\u001d\t[\u000fm,X\u0016<a\u0014}", "", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nlZ=L", "BnD\u0016a;\u001a`&z\u000f", "\u001aj^A_0G\u001d\tb\u0004m\b\n\u0016+yU", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nlZ=S", "BnD\u0019b5@/&\fvr", "\u001aj^A_0G\u001d\te\u0005g.X\u0016<a\u0014}", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nlZ=T", "BnD [6Kbt\f\bZ@", "\u001aj^A_0G\u001d\tl}h9\fd<r{<Q", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nlZ=]", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:65-*:.315o\u0015\u0002-)( \u001d-!&$(~'")
class UCollectionsKt___UCollectionsKt {
    public static final int sumOfUByte(Iterable<UByte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UByte> it = iterable.iterator();
        int iM9075constructorimpl = 0;
        while (it.hasNext()) {
            iM9075constructorimpl = UInt.m9075constructorimpl(iM9075constructorimpl + UInt.m9075constructorimpl(it.next().m9048unboximpl() & 255));
        }
        return iM9075constructorimpl;
    }

    public static final int sumOfUInt(Iterable<UInt> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UInt> it = iterable.iterator();
        int iM9075constructorimpl = 0;
        while (it.hasNext()) {
            iM9075constructorimpl = UInt.m9075constructorimpl(iM9075constructorimpl + it.next().m9127unboximpl());
        }
        return iM9075constructorimpl;
    }

    public static final long sumOfULong(Iterable<ULong> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<ULong> it = iterable.iterator();
        long jM9154constructorimpl = 0;
        while (it.hasNext()) {
            jM9154constructorimpl = ULong.m9154constructorimpl(jM9154constructorimpl + it.next().m9206unboximpl());
        }
        return jM9154constructorimpl;
    }

    public static final int sumOfUShort(Iterable<UShort> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UShort> it = iterable.iterator();
        int iM9075constructorimpl = 0;
        while (it.hasNext()) {
            iM9075constructorimpl = UInt.m9075constructorimpl(iM9075constructorimpl + UInt.m9075constructorimpl(it.next().m9311unboximpl() & 65535));
        }
        return iM9075constructorimpl;
    }

    public static final byte[] toUByteArray(Collection<UByte> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] bArrM9050constructorimpl = UByteArray.m9050constructorimpl(collection.size());
        Iterator<UByte> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            UByteArray.m9061setVurrAj0(bArrM9050constructorimpl, i2, it.next().m9048unboximpl());
            i2++;
        }
        return bArrM9050constructorimpl;
    }

    public static final int[] toUIntArray(Collection<UInt> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArrM9129constructorimpl = UIntArray.m9129constructorimpl(collection.size());
        Iterator<UInt> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            UIntArray.m9140setVXSXFK8(iArrM9129constructorimpl, i2, it.next().m9127unboximpl());
            i2++;
        }
        return iArrM9129constructorimpl;
    }

    public static final long[] toULongArray(Collection<ULong> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArrM9208constructorimpl = ULongArray.m9208constructorimpl(collection.size());
        Iterator<ULong> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            ULongArray.m9219setk8EXiF4(jArrM9208constructorimpl, i2, it.next().m9206unboximpl());
            i2++;
        }
        return jArrM9208constructorimpl;
    }

    public static final short[] toUShortArray(Collection<UShort> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        short[] sArrM9313constructorimpl = UShortArray.m9313constructorimpl(collection.size());
        Iterator<UShort> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            UShortArray.m9324set01HTLdE(sArrM9313constructorimpl, i2, it.next().m9311unboximpl());
            i2++;
        }
        return sArrM9313constructorimpl;
    }
}
