package androidx.core.database;

import android.database.Cursor;
import kotlin.Metadata;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Cursor.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d̉=!,y\bDZc|İI\u0006>\u00116Ȑ\u0007\":\u0016\u007f\u0007ljA0RjP.XU2\u000fy\u0003<$a$yCI]\"}(\tWNusvϺr QƤ\u001e\u0018\u000fiZH}x\f\u0012?6PpW3{q\u0004ʧf\rP\u0013#J$Nx3\u0005B*v\u0010'~QL$\u0012^B7ôXҫQ\u0005(\u0017\u001eX.\u00076^}MdO\u0015]h/S\u0007wCf'\u000e2Cո\u0013ТX'\u001b~y89IO7+$\u0002\u0005/R\n?3C\u007f>\u001dhU)qɥyɱ:X\u000e\u001e-E]\u0018ut<[3]\t\fU+\u007fgYQ&(&|BȥBǬ\u0012\u00065UFG(t \u0010Is!bhP0^r\u0004\tbN\u0017S\u0002yچ?ӸjQoK1cE\r\u001d\u000f4\"/\u0001I[\u0003\u000e\u0011\u0019)U\u0010Q_S\u0007ׇNݹ\u000el"}, d2 = {"5dc\u000f_6;=&g\u000be3", "", "\u001a`]1e6BRb}vm(y\u0005=eI\u0006\fM\u000f!$\u001d", "7mS2k", "", "5dc\u0011b<;Z\u0019h\bG<\u0004\u0010", "", "uKP;W9HW\u0018HyZ;x\u0006+s\u007fqYP\u000e%!TEq\u007f]*1jyi>i\u001f0\u0017\"E{1%\u0015>", "5dc\u0013_6:b\u0003\fcn3\u0004", "", "uKP;W9HW\u0018HyZ;x\u0006+s\u007fqYP\u000e%!TEq\u007f]*1jyi>i\u001f0\u0017$Bu0-j", "5dc\u0016a;(`\u0002\u000f\u0002e", "uKP;W9HW\u0018HyZ;x\u0006+s\u007fqYP\u000e%!TEq\u007f]*1jyi>i\u001f0\u0017'Dz4 \u0015u7", "5dc\u0019b5@=&g\u000be3", "", "uKP;W9HW\u0018HyZ;x\u0006+s\u007fqYP\u000e%!TEq\u007f]*1jyi>i\u001f0\u0017*Et6s", "5dc [6Kb\u0003\fcn3\u0004", "", "uKP;W9HW\u0018HyZ;x\u0006+s\u007fqYP\u000e%!TEq\u007f]*1jyi>i\u001f0\u00171>uA-j", "5dc g9B\\\u001bh\bG<\u0004\u0010", "", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CursorKt {
    public static final byte[] getBlobOrNull(Cursor cursor, int i2) {
        if (cursor.isNull(i2)) {
            return null;
        }
        return cursor.getBlob(i2);
    }

    public static final Double getDoubleOrNull(Cursor cursor, int i2) {
        if (cursor.isNull(i2)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i2));
    }

    public static final Float getFloatOrNull(Cursor cursor, int i2) {
        if (cursor.isNull(i2)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i2));
    }

    public static final Integer getIntOrNull(Cursor cursor, int i2) {
        if (cursor.isNull(i2)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i2));
    }

    public static final Long getLongOrNull(Cursor cursor, int i2) {
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    public static final Short getShortOrNull(Cursor cursor, int i2) {
        if (cursor.isNull(i2)) {
            return null;
        }
        return Short.valueOf(cursor.getShort(i2));
    }

    public static final String getStringOrNull(Cursor cursor, int i2) {
        if (cursor.isNull(i2)) {
            return null;
        }
        return cursor.getString(i2);
    }
}
