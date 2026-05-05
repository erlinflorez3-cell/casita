package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

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
/* JADX INFO: compiled from: WorkDatabaseMigrations.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r(4\u0012}\nnjG0L͜P.hS2ş\u0002ڔd$\n#2^KY(}:\t}Owk|Lr\u000bq\u0012\u0016\u001a\u0007nDI\u0004{ٕ\u0016\u000f@G8MAU\b=gi%:\u0013*J\"f\u0005K\u0015j9V\u0010\u000fzqLë\u00166H\u0081RT\u0013S\u0013!Ű\nJ"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E-\u0001%\u0015Jo\rL}%\u001d]\u007f-3|\u001a8V\u0019", "\u001a`]1e6BR,H\bh6\u0005R7i\u00025wO\u0005! \u0011W\u0012>\u0004!D]\b)\r", ";B^;g,Qb", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "AsP?g\u001d>`'\u0003\u0005g", "", "3mS#X9LW#\b", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEq :\u0016", "5dc\u001a66Gb\u0019\u0012\n", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", ";hV?T;>", "", "2a", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class RescheduleMigration extends Migration {
    private final Context mContext;

    public final Context getMContext() {
        return this.mContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RescheduleMigration(Context mContext, int i2, int i3) {
        super(i2, i3);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) throws Throwable {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, C1593ug.zd("\u001b\u001a", (short) (C1633zX.Xd() ^ (-8454)), (short) (C1633zX.Xd() ^ (-29568))));
        int i2 = this.endVersion;
        String strOd = C1561oA.od("\u0002s\u0001osom}skdrhgeec", (short) (C1580rY.Xd() ^ (-15303)));
        if (i2 >= 10) {
            supportSQLiteDatabase.execSQL(C1561oA.Kd("\u000e\u0014\u001a\r\u001b\u001ej\u001b\u001fm!\u0015!\u001e\u0014\u0017\u001au &-)z<-PDFFTHRHKG\b\u0011JVQfN\u001b\u0010Q^bb\\UmYeo`\\&\u001eUAMWHW%.Gsn\u00047,Mz~~xq\nu\u0002\f|A", (short) (OY.Xd() ^ 29126)), new Object[]{strOd, 1});
            return;
        }
        Context context = this.mContext;
        short sXd = (short) (FB.Xd() ^ 27105);
        short sXd2 = (short) (FB.Xd() ^ 3273);
        int[] iArr = new int["\u0002z9W\u001dG+omG\bZ\u001c\u000f~.k?I\u001cf\nr\"wzL\u0012\\\u001b".length()];
        QB qb = new QB("\u0002z9W\u001dG+omG\bZ\u001c\u000f~.k?I\u001cf\nr\"wzL\u0012\\\u001b");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i3++;
        }
        String str = new String(iArr, 0, i3);
        short sXd3 = (short) (ZN.Xd() ^ 24724);
        int[] iArr2 = new int["\u0004\u0012\t\u0018\u0016\u0011\rW\u000e\u001b\u001b\"\u0014\u001e%_u##*\u001c0-".length()];
        QB qb2 = new QB("\u0004\u0012\t\u0018\u0016\u0011\rW\u000e\u001b\u001b\"\u0014\u001e%_u##*\u001c0-");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i4));
            i4++;
        }
        Object[] objArr = {str, 0};
        Method method = Class.forName(new String(iArr2, 0, i4)).getMethod(Qg.kd("\u0016\u0013!~\u0013\u000b\u001b\r\u000bu\u0017\t\t\u0007\u0013\u0005\r\u0001\u0002\u000f", (short) (FB.Xd() ^ 7793), (short) (FB.Xd() ^ 30608)), Class.forName(Wg.vd("G=Q;\u0007D8DL\u00126VSIME", (short) (C1580rY.Xd() ^ (-28871)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            ((SharedPreferences) method.invoke(context, objArr)).edit().putBoolean(strOd, true).apply();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
