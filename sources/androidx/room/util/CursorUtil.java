package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import com.dynatrace.android.agent.Global;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: CursorUtil.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d̉=!4i\bDJc|\u0004O\f8\u000b4B\u0007\":\u001e\u007fјnjG?LeN1ZS8\"s{:&c$\bCCU }:\u0015]Ȟ\u007fg\u001dI\u000b\u000fQ\u000f\u001e\u0016'iD_cyu\u0012=4rsM6eok8\u0011xD\t82P=@\u0005\u0019;8I(v)E{\u0016 6XvJT\u001dM3\u001f@\rn$\u000f\"tg|;\u000fqҺ>/1\u000b\u0002V\\0w0+O=Jb'%v\u0010\u001d[DE9-%\u0002\b\u001ffiI\u001b? ?5l5'CI\"Vf\\\u000e\u0018-+}\u0012u\u001a4g\u001dQ\u000f\u000bW/]fcP<'(\u0005\n\u0013T\n\u001e\b7H\\2Hm8\u0012A\u0001\u000bSn]ؿbB\u000e\tyc%4\u00183qI;hWĥI)v7*\u0004=.1\u0012\u0007-kV\u001e`C\u001adya1\u0018PkZ\u0015˪_ȖlՎͲf\u00028\u0017΅G\u00057~\u0017ўGS6٬=7"}, d2 = {"1n_F45=1 \t\t^", "\u001a`]1e6BRb}vm(y\u0005=eI\u0006\fM\u000f!$\u001d", "1", "4h]166Ec!\b^g+|\u001c\fym8|A\u0005*", "", "1ta@b9", "<`\\2", "", "1n[B`5'O!~\t", "", "uZ;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u0011'", "5dc\u0010b3N[\"b\u0004],\u0010", "5dc\u0010b3N[\"b\u0004],\u0010r<T\u00035\u0006R", "EqP=@(I^\u0019}Xh3\r\u00118s", ";`_=\\5@", "", "uKP;W9HW\u0018HyZ;x\u0006+s\u007fqYP\u000e%!TE\u0004#{!FUG'3v\u0018w;RHo= j^E|m_5M\u00041KK\u0018+Xan:\u0010 ZW,;\u001a\u0013cNy", "CrT\u0010h9L]&", Global.BLANK, "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKP;W9HW\u0018HyZ;x\u0006+s\u007fqYP\u000e%!TEtB\u00014<]\u0007i<~\u001ewNSDiC\"\u001fqo\u0003gs5L\u0006+QU\u001a\u0002 9w9%\u000e$\u0015J4\u000fNC>)nBFt", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CursorUtil {
    private static final int findColumnIndexBySuffix(Cursor cursor, String str) {
        return -1;
    }

    public static final int getColumnIndex(Cursor c2, String name) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c2.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c2.getColumnIndex("`" + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : findColumnIndexBySuffix(c2, name);
    }

    public static final int getColumnIndexOrThrow(Cursor c2, String name) {
        String strJoinToString$default;
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = getColumnIndex(c2, name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = c2.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "c.columnNames");
            strJoinToString$default = ArraysKt.joinToString$default(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        } catch (Exception e2) {
            strJoinToString$default = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + strJoinToString$default);
    }

    public static final int findColumnIndexBySuffix(String[] columnNames, String name) {
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = "." + name;
        String str2 = "." + name + '`';
        int length = columnNames.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str3 = columnNames[i2];
            int i4 = i3 + 1;
            if (str3.length() >= name.length() + 2) {
                if (StringsKt.endsWith$default(str3, str, false, 2, (Object) null)) {
                    return i3;
                }
                if (str3.charAt(0) == '`' && StringsKt.endsWith$default(str3, str2, false, 2, (Object) null)) {
                    return i3;
                }
            }
            i2++;
            i3 = i4;
        }
        return -1;
    }

    public static final <R> R useCursor(Cursor cursor, Function1<? super Cursor, ? extends R> block) throws IOException {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Cursor cursor2 = cursor;
        try {
            R rInvoke = block.invoke(cursor2);
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(cursor2, null);
            InlineMarker.finallyEnd(1);
            return rInvoke;
        } finally {
        }
    }

    public static final Cursor wrapMappedColumns(Cursor cursor, final String[] columnNames, final int[] mapping) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        if (columnNames.length != mapping.length) {
            throw new IllegalStateException("Expected columnNames.length == mapping.length".toString());
        }
        return new CursorWrapper(cursor) { // from class: androidx.room.util.CursorUtil.wrapMappedColumns.2
            @Override // android.database.CursorWrapper, android.database.Cursor
            public int getColumnIndex(String columnName) {
                Intrinsics.checkNotNullParameter(columnName, "columnName");
                String[] strArr = columnNames;
                int[] iArr = mapping;
                int length = strArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    if (StringsKt.equals(strArr[i2], columnName, true)) {
                        return iArr[i3];
                    }
                    i2++;
                    i3 = i4;
                }
                return super.getColumnIndex(columnName);
            }
        };
    }

    public static final Cursor copyAndClose(Cursor c2) throws IOException {
        Intrinsics.checkNotNullParameter(c2, "c");
        Cursor cursor = c2;
        try {
            Cursor cursor2 = cursor;
            MatrixCursor matrixCursor = new MatrixCursor(cursor2.getColumnNames(), cursor2.getCount());
            while (cursor2.moveToNext()) {
                Object[] objArr = new Object[cursor2.getColumnCount()];
                int columnCount = c2.getColumnCount();
                for (int i2 = 0; i2 < columnCount; i2++) {
                    int type = cursor2.getType(i2);
                    if (type == 0) {
                        objArr[i2] = null;
                    } else if (type == 1) {
                        objArr[i2] = Long.valueOf(cursor2.getLong(i2));
                    } else if (type == 2) {
                        objArr[i2] = Double.valueOf(cursor2.getDouble(i2));
                    } else if (type == 3) {
                        objArr[i2] = cursor2.getString(i2);
                    } else if (type == 4) {
                        objArr[i2] = cursor2.getBlob(i2);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                matrixCursor.addRow(objArr);
            }
            CloseableKt.closeFinally(cursor, null);
            return matrixCursor;
        } finally {
        }
    }
}
