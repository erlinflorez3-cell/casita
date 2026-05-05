package androidx.work.impl;

import android.content.Context;
import androidx.work.Logger;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Xg;
import yg.ZN;
import yg.hg;

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
/* JADX INFO: compiled from: WorkDatabasePathHelper.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lkA0ReP\u008cZS81sڔ:ơ[:ڎs;\u0004\u0019>'\u000fOɁkg|J#\u0017Q\u0010\u001e\u0016'l\\Mc{u\u0012=6\u000b{M8eok;\u0011xD\b82P<B\u0013\u000f BH>x+GY\u000f*0nt\u0001SU[\u0013!*\u0006l(1\"jjf6vp$?w;\u0011rZZ7a@|{\u000fVV7\r%cL5p;C\u0018=S1\u000bҡ_J"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E2\u000b$\u001d&k\u001d8s!CYh\u001cFpx.TN;x\n", "", "u(E", "5dc\u0011T;:P\u0015\rzI(\f\f", "\u001aiPCTuB]b_~e,R", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0011X-:c \u000eYZ;x\u0006+s\u007f\u0013wO\u0004", "5dc\u001bb\t:Q\u001f\u000f\u0006I(\f\f", ";hV?T;>2\u0015\u000ev[(\u000b\t", "", ";hV?T;B]\"ivm/\u000b", "", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WorkDatabasePathHelper {
    public static final WorkDatabasePathHelper INSTANCE = new WorkDatabasePathHelper();

    private WorkDatabasePathHelper() {
    }

    @JvmStatic
    public static final void migrateDatabase(Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        WorkDatabasePathHelper workDatabasePathHelper = INSTANCE;
        if (workDatabasePathHelper.getDefaultDatabasePath(context).exists()) {
            Logger.get().debug(WorkDatabasePathHelperKt.TAG, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : workDatabasePathHelper.migrationPaths(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        Logger.get().warning(WorkDatabasePathHelperKt.TAG, "Over-writing contents of " + value);
                    }
                    if (key.renameTo(value)) {
                        str = "Migrated " + key + "to " + value;
                    } else {
                        str = "Renaming " + key + " to " + value + " failed";
                    }
                    Logger.get().debug(WorkDatabasePathHelperKt.TAG, str);
                }
            }
        }
    }

    public final Map<File, File> migrationPaths(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        File defaultDatabasePath = getDefaultDatabasePath(context);
        File databasePath = getDatabasePath(context);
        String[] strArr = WorkDatabasePathHelperKt.DATABASE_EXTRA_FILES;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(strArr.length), 16));
        for (String str : strArr) {
            Pair pair = TuplesKt.to(new File(defaultDatabasePath.getPath() + str), new File(databasePath.getPath() + str));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return MapsKt.plus(linkedHashMap, TuplesKt.to(defaultDatabasePath, databasePath));
    }

    public final File getDefaultDatabasePath(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, hg.Vd("\u001d(&+\u001b-(", (short) (OY.Xd() ^ 3330), (short) (OY.Xd() ^ 21630)));
        Object[] objArr = {C1561oA.ud(",8-:6/)<p902*k4+-%\u001d\u001a", (short) (ZN.Xd() ^ 1587))};
        Method method = Class.forName(C1561oA.yd("_mdsid`+ivv}gqx31^^eOc`", (short) (C1499aX.Xd() ^ (-808)))).getMethod(Xg.qd("65E\u00164H688K>*<PE", (short) (FB.Xd() ^ 4393), (short) (FB.Xd() ^ 2376)), Class.forName(C1561oA.Yd("QI_K\u0019XN\\V\u001eDfe]c]", (short) (FB.Xd() ^ 14300))));
        try {
            method.setAccessible(true);
            File file = (File) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(file, Jg.Wd("\u0004\u001frE\u0001m:<H\u001cw\u0014\u0004\bF\u0018a(o'\u0003n4<>\u000bzA(]+\u0010G=\u0011j- _9\u001bg\u0018", (short) (C1633zX.Xd() ^ (-32090)), (short) (C1633zX.Xd() ^ (-17260))));
            return file;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final File getDatabasePath(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getNoBackupPath(context);
    }

    private final File getNoBackupPath(Context context) {
        return new File(Api21Impl.INSTANCE.getNoBackupFilesDir(context), WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
    }
}
