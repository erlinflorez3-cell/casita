package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

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
/* JADX INFO: compiled from: IdGenerator.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d̉=!,o\bӵLc\u0003\u0010I\u00066\f6B\r\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a&\nYIY2}P\u000e\u007fRum\u0007J\t\u0012s\u0013\u0014\u001e\u0011jZR\u001cތu$\u001d<Zom2uokD\u0011xD\u001182P9@\u0005\u001948U(v)Hs\f@;ptH^%M3\u001bB\nL.\u0019\u001e\u000bf\u00156hxkŽG#1h\u0019þyۢ4|Uεf`5\r\u000faL,\u0017ˁ\bչ)S\u000bޗrgM\u0005Wqk\u0006?ѮyȅMs_̬x\f\"\u0018CO;^I̭/ԇU`\u0014ʬˬSr"}, d2 = {"\u0017M8!<\b%M|]", "", "\u001cDG!R\b%/\u0006ftF\bed\u0011El\"_\u001fz|v;", "", "\u001cDG!R\u0011(0\u0013lXA\f[x\u0016El\"_\u001fz|v;", "\u001eQ4\u00138\u0019\u001e<v^t?\u0010ch)K_\u001c", ";hV?T;>:\u0019\u0001v\\@`\b\u0011e\t(\t<\u0010!$", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Ap;6g,\u001dO(zwZ:|", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "<dgA<+", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E2\u000b$\u001d&k\u001d8s!CYS", "9dh", "CoS.g,)`\u0019\u007fzk,\u0006\u0007/", "D`[BX", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 2, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class IdGeneratorKt {
    public static final int INITIAL_ID = 0;
    public static final String NEXT_ALARM_MANAGER_ID_KEY = "next_alarm_manager_id";
    public static final String NEXT_JOB_SCHEDULER_ID_KEY = "next_job_scheduler_id";
    public static final String PREFERENCE_FILE_KEY = "androidx.work.util.id";

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nextId(WorkDatabase workDatabase, String str) {
        Long longValue = workDatabase.preferenceDao().getLongValue(str);
        int iLongValue = longValue != null ? (int) longValue.longValue() : 0;
        updatePreference(workDatabase, str, iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0);
        return iLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updatePreference(WorkDatabase workDatabase, String str, int i2) {
        workDatabase.preferenceDao().insertPreference(new Preference(str, Long.valueOf(i2)));
    }

    public static final void migrateLegacyIdGenerator(Context context, SupportSQLiteDatabase supportSQLiteDatabase) throws Throwable {
        String strZd = Wg.Zd("\u0003\u00047O<hb\t<0D]\u0019{n\u001d\r}U\u0007\f-,Tf/\u0011\n7.ApT|<\"\u0018f&\u0007\u0019(ao^S\u0005:%Ez\f\u0006\u000b)\n\u0003\u00149J\u0016\u0005'K\t7}%\rG\u0018tG*\u001bB]<\u0002\u0015]\u00111\u000b", (short) (Od.Xd() ^ (-24439)), (short) (Od.Xd() ^ (-17761)));
        Intrinsics.checkNotNullParameter(context, C1561oA.Xd("u\u0003\u0003\n{\u0010\r", (short) (OY.Xd() ^ 29299)));
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, Wg.vd("63\r)3#\u0001\u001d?++):+", (short) (FB.Xd() ^ 32171)));
        Object[] objArr = {Qg.kd("}\n~\f\b\u0001z\u000eB\u000b\u0002\u0004{=\u0004\u0002uw8rl", (short) (ZN.Xd() ^ 13202), (short) (ZN.Xd() ^ 14198)), 0};
        Method method = Class.forName(hg.Vd("`lanjc]&ZechX`e\u001e2][`Pb]", (short) (FB.Xd() ^ 17129), (short) (FB.Xd() ^ 18633))).getMethod(C1561oA.yd("WVbBTN\\PL9XLJJTHndcr", (short) (C1633zX.Xd() ^ (-25819))), Class.forName(C1561oA.ud("E;O9\u0005B6B:\u007f$DA7;3", (short) (ZN.Xd() ^ 1502))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            short sXd = (short) (FB.Xd() ^ 14682);
            int[] iArr = new int["4,@=)5;/-B3977IA;I7B>".length()];
            QB qb = new QB("4,@=)5;/-B3977IA;I7B>");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            if (sharedPreferences.contains(str) || sharedPreferences.contains(str)) {
                int i3 = sharedPreferences.getInt(str, 0);
                String strQd = Xg.qd("XPdaMP\\Rd`SbWeY`_m[fb", (short) (FB.Xd() ^ 11377), (short) (FB.Xd() ^ 25976));
                int i4 = sharedPreferences.getInt(strQd, 0);
                supportSQLiteDatabase.beginTransaction();
                try {
                    supportSQLiteDatabase.execSQL(strZd, new Object[]{str, Integer.valueOf(i3)});
                    supportSQLiteDatabase.execSQL(strZd, new Object[]{strQd, Integer.valueOf(i4)});
                    sharedPreferences.edit().clear().apply();
                    supportSQLiteDatabase.setTransactionSuccessful();
                } finally {
                    supportSQLiteDatabase.endTransaction();
                }
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
