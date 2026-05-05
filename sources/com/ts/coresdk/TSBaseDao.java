package com.ts.coresdk;

import android.content.Context;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.dynatrace.android.agent.Global;
import com.ts.coresdk.db.TSBaseEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&˛\bDZc|\u0004Oي8é6B\r.4\u0012}\bnjO0L͜P.hS2\u000fq{<$iByCAV\"}0\tWNmhvJh\u0011KƤ\u000e\u0016\u000fj4I[}e\u0012%2JoE<UoK@ht<\u0005(20L\u0002\u0005\u0007\u001f0m&͌\u0019vs\u0012\u0018ؓNobR;M5\u001a@\u0007v\u001f4^gwRDJ\u0005]h2ݭ\u0007iPRo\u0005>\u0002e\u000f\\S]˙'e,1X7c\u001cUW\u0011\u000fj[m\fouK\u000f\u0001']Ǣ\u0010sɱ:X\u000e\u001f]Y]\u0012uz6^\u0015Q\u0017ϯ=*}o{T\u001c.\u0010z*\u0014l\b\u001c\u000e?H\\6Jr\u0016\u001bK|\u0003UPP8މX~)m|\u0017m%A9Q\u001d|P\u0018ݢIRE\u0002\u001d\rL*1r/cl\u000e\u000f\u001eKX\u0006[IQv׀\u000fp̆]={\u000f9\u0006\u00109\u001c0u\u0010_\u007f\u001f4/%ebi'/s\u001aHrp'\u000bnrkkhGv̎å\u001a78\u001aT~Rs\u001dk~d\t0\u001fS4T5\u00058\u0017.n\u0010<O.@Z]u\u0002r]_\u001a%eωMX\u001dwV[GqK5\u007fsXt`\n,?jv5\\tWk\f\trnAĘLj\u0016\u000fDY\\$+2m\u0002L8:;1\\KǽI=նE~\u000fxh\u0003X\u0018bK<\u0003\u00184%\u0013\u000f]tv\u007fi\tIbʉ\u000f.s`پ9\u0019,nj\u000eB\u0018;\t\u0015r6ø\u0018PUR\u0005\u0016$\\,$$\"QQ]FC\u0013\r3J\u0002cզ\u0013\u0015ϯUM 2C!\b+Sn>i\u0018j'ݚ\u000fvzSb\u001d:v\ryS\fr\b\u0012at\u0004wgb(s>w\u0011IY\u0005hF\u001c\u001d%.'\u0011oXĜc9s++\u001c\u0010\u0014]\u001c\u0012awwFy\u0011\u0018n\u0017s$Di&qrQ\u0014ЦiDy]\rD:$\u001b\nrLx\u007f B7==7Vb|p\u0005;\u0016I= ~\r<\u000f\u0001V\u0012ƥA{.8<eBsq\u0005DbQ-)M\u0002p\u001eqY\u007f#J=\u001e;\u007f?\u0013*\u001ck#\u0007[p.H\u0006\"\u001bfGI\t\u001d>\u001f#b/\u0003\nS\\b\u0011\u001e\u0016\u000b\u0002V_Eğ`N$?d#lx\u000bl\u000f$ޝI`'RI\u0014\u001d\\6xc[5qT^Gchܬ\u001a<͢\u001flU*tQs]bb3(\u0007.;OkPa\bF\u0006W)$ \u001e\u0018~7Ԡ!B\u001eF\u0002t\u001f\u000e\u000f0\r5\u0006h\\j\u000f\u0012\u0015Y~&7\u0007\u0013|<E:\u0015\u0019#gt\u0006acًϸ{7QII;RW\u001f\f+\u0011v\u001f;\fM-kP\u001b\u00185\u0004oSi\u00078,.4\u001c|1^g\u000e\u001dŊs\u001ah\":9p2!\u0013~042Xz\u000b\n\\\u000ffS\u0010;\u001a\u0013\rb\u001c}/J?-\u0003\u0005xŮи|\nq},\u0013c;\u001bf_f*r;V5\tUT^\u0017fbR\u0011\u0002)\t\u001d\u000e!-./8\u0018b_ցeb\u0017|4di>C/\u001a:\u00125>\\6}Uݗ<#ցX*\u001bmdg\u0007}\u0017\u000e\u0005B\u0006\u001e\u000ft6q\r\u00129\u0016\r~~՝?\u001fzeޔ\"d5ii+i\u000f_`5\u0007\u001cÕ(Ж5RG\u05cdω6?"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0005wN\u0001u\u0013QE", "\"", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxd|qj.]\u0013%GO\u0017Kz4I/", "", "B`Q9X\u0015:[\u0019", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1n]CX9MB#^\u0004\\9\u0011\u0014>e~\u0007wO|", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ";nSB_,\"\\\u001a\t", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", "3mc6g@", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"5*fZ<L\"[X\u0018[+\u001b\u0004_\u000b#k\u000e&\rd(W\u0002\u001bq\u0010\u0010%\"\u000b.W@`\u0018\u0011\t#??3uFg^\u007f\u0011@B,\u0019Rh[+\\\u001aC3\u0018\u0001-p", "", "3mc6g0>a", "2dR?l7M3\"\u000e~m@", "2d[2g,", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"5*fZ<L\"[X\u0018[+\u001b\u0004_\u000b#k\u000e&\rd(W\u0002\u001bq\u0010\u0010%\"\u000b.a", ";nSB_,\"\\\u0018\t", "2d[2g,\u001aZ ", "", "?tT?l", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\fGm#B#", "2d[2g,\u001aZ =xh9|\u0003+n~5\u0006D\u007f\u0011%Fu\bIv,5U\f ", "2d[2g,\u001dO(z", "2d[2g,\u001dO(z9\\6\n\t)a\t'\tJ\u0005\u0016\u0011Un\u00146\u0004%<Yy.7", "uKR<`uMab|\u0005k,\u000b\b5/~%E/ns\u0013UomE\u0006)DmSc(", "3mR?l7M3\"\u000e~m@", "4dc0[", "@`f\u001eh,Kg", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0005\u001f\"No{(])DYi07z*\u0004", "4dc0[\bEZ", "4dc0[\tR1#\byb;\u0001\u00138s", "1n]1\\;B]\"\r", "4dc0[\u001bASx\b\nb;\u0001\t=W\u00047~'\u0005\u001f\u001bV", "1nd;g", "=qS2e\tR", "=qS2e\u001bR^\u0019", "Ap[\u0013X;<Vx\u0012\n^5\u000b\r9n", "5dc\u0012a;Bb\u001d~\t", "5dc\u0012a;Bb\u001d~\t\u001d*\u0007\u0016/_{1zM\u000b\u001b\u0016A}\rBp25`}\u001cEm", "7mb2e;\u001dO(z", "", "7mb2e;\u001dO(z9\\6\n\t)a\t'\tJ\u0005\u0016\u0011Un\u00146\u0004%<Yy.7", "uKR<`uMab|\u0005k,\u000b\b5/~%E/ns\u0013UomE\u0006)DmSc\u001c", "", "7mb2e;\u001e\\\u0017\f\u000fi;|\b\u000ea\u000f$", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"5*fZ<L\"[X\u0018[+\u001b\u0004_\u000b#k\u000e&\rd(W\u0002\u001bq\u0010\u0010%\"\u000b.U", "CoS.g,", "CoS.g,\u001dO(z", "CoS.g,\u001dO(z9\\6\n\t)a\t'\tJ\u0005\u0016\u0011Un\u00146\u0004%<Yy.7", "\u0011n\\=T5B]\"", "1na2 (GR&\t~]s\u000b\b5_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class TSBaseDao<T extends TSBaseEntity> {
    public static final a Companion = new a(null);
    private static final long NOT_VALID = -1;
    private final String tableName;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u000eKLcz\u0006I\u0006>é4ȗ\u007f8ܥBw5j+@6DͿL0XU8\u0012<\u000eB$s$ BqUpԆt\u07beSRoitJh\f"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0005wN\u0001u\u0013Q.\n\u0012", "", "\u001cNC,I\b%7w", "\u0018", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TSBaseDao(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tableName = str;
    }

    private final T convertToEncryptedData(Context context, ITSModuleInfo iTSModuleInfo, T t2) {
        return (T) encryptEntity(context, iTSModuleInfo, t2);
    }

    private final List<T> convertToEncryptedData(Context context, ITSModuleInfo iTSModuleInfo, List<? extends T> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            TSBaseEntity tSBaseEntityEncryptEntity = encryptEntity(context, iTSModuleInfo, (TSBaseEntity) it.next());
            if (tSBaseEntityEncryptEntity != null) {
                arrayList.add(tSBaseEntityEncryptEntity);
            }
        }
        return arrayList;
    }

    private final List<T> fetch(Context context, ITSModuleInfo iTSModuleInfo, SimpleSQLiteQuery simpleSQLiteQuery) {
        List<T> entities$core_android_sdk_release = getEntities$core_android_sdk_release(simpleSQLiteQuery);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entities$core_android_sdk_release.iterator();
        while (it.hasNext()) {
            TSBaseEntity tSBaseEntityDecryptEntity = decryptEntity(context, iTSModuleInfo, (TSBaseEntity) it.next());
            if (tSBaseEntityDecryptEntity != null) {
                arrayList.add(tSBaseEntityDecryptEntity);
            }
        }
        return arrayList;
    }

    protected abstract T decryptEntity(Context context, ITSModuleInfo iTSModuleInfo, T t2);

    public final void delete(Context context, ITSModuleInfo iTSModuleInfo, T t2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        if (t2 != null) {
            try {
                TSBaseEntity tSBaseEntityConvertToEncryptedData = convertToEncryptedData(context, iTSModuleInfo, t2);
                if (tSBaseEntityConvertToEncryptedData != null) {
                    deleteData$core_android_sdk_release(tSBaseEntityConvertToEncryptedData);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void delete(Context context, ITSModuleInfo iTSModuleInfo, List<? extends T> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        if (list != null) {
            try {
                List<T> listConvertToEncryptedData = convertToEncryptedData(context, iTSModuleInfo, list);
                if (listConvertToEncryptedData != null) {
                    deleteData$core_android_sdk_release(listConvertToEncryptedData);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void deleteAll() {
        deleteAll$core_android_sdk_release(new SimpleSQLiteQuery("DELETE FROM " + this.tableName));
    }

    public abstract int deleteAll$core_android_sdk_release(SupportSQLiteQuery supportSQLiteQuery);

    public abstract void deleteData$core_android_sdk_release(T t2);

    public abstract void deleteData$core_android_sdk_release(List<? extends T> list);

    protected abstract T encryptEntity(Context context, ITSModuleInfo iTSModuleInfo, T t2);

    public final List<T> fetchAll(Context context, ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        return fetch(context, iTSModuleInfo, new SimpleSQLiteQuery("SELECT * FROM " + this.tableName));
    }

    public final List<T> fetchByConditions(Context context, ITSModuleInfo iTSModuleInfo, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        return fetch(context, iTSModuleInfo, new SimpleSQLiteQuery("SELECT * FROM " + this.tableName + " where " + str));
    }

    protected final List<T> fetchTheEntitiesWithLimit(Context context, ITSModuleInfo iTSModuleInfo, int i2, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String str4 = this.tableName;
        if (str3 == null) {
            str3 = "";
        }
        return fetch(context, iTSModuleInfo, new SimpleSQLiteQuery("SELECT * FROM " + str4 + Global.BLANK + str3 + " ORDER BY " + str + Global.BLANK + str2 + " LIMIT " + i2 + Global.BLANK));
    }

    public abstract List<T> getEntities$core_android_sdk_release(SupportSQLiteQuery supportSQLiteQuery);

    public abstract long insertData$core_android_sdk_release(T t2);

    public abstract long[] insertData$core_android_sdk_release(List<? extends T> list);

    public final long insertEncryptedData(Context context, ITSModuleInfo iTSModuleInfo, T t2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        if (t2 == null) {
            return -1L;
        }
        try {
            TSBaseEntity tSBaseEntityConvertToEncryptedData = convertToEncryptedData(context, iTSModuleInfo, t2);
            if (tSBaseEntityConvertToEncryptedData != null) {
                return insertData$core_android_sdk_release(tSBaseEntityConvertToEncryptedData);
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public final long[] insertEncryptedData(Context context, ITSModuleInfo iTSModuleInfo, List<? extends T> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        if (list != null) {
            try {
                List<T> listConvertToEncryptedData = convertToEncryptedData(context, iTSModuleInfo, list);
                if (listConvertToEncryptedData != null) {
                    return insertData$core_android_sdk_release(listConvertToEncryptedData);
                }
            } catch (Throwable unused) {
            }
        }
        return new long[]{-1};
    }

    public final void update(Context context, ITSModuleInfo iTSModuleInfo, T t2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        if (t2 != null) {
            try {
                TSBaseEntity tSBaseEntityConvertToEncryptedData = convertToEncryptedData(context, iTSModuleInfo, t2);
                if (tSBaseEntityConvertToEncryptedData != null) {
                    updateData$core_android_sdk_release(tSBaseEntityConvertToEncryptedData);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void update(Context context, ITSModuleInfo iTSModuleInfo, List<? extends T> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        if (list != null) {
            try {
                List<T> listConvertToEncryptedData = convertToEncryptedData(context, iTSModuleInfo, list);
                if (listConvertToEncryptedData != null) {
                    updateData$core_android_sdk_release(listConvertToEncryptedData);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public abstract void updateData$core_android_sdk_release(T t2);

    public abstract void updateData$core_android_sdk_release(List<? extends T> list);
}
