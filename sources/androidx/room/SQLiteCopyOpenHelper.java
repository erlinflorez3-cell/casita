package androidx.room;

import android.content.Context;
import android.content.res.AssetManager;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.FileUtil;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.sqlite.util.ProcessLock;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
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
/* JADX INFO: compiled from: SQLiteCopyOpenHelper.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\u0013nʑA0ZeP\u008cZS@\u000fs{J$cҕyCI[\"}(\nWN}gvJ`\u000fK\u000f\u001c\u0016\u0001j2J]xk\u001b\u00172HpG3[oE9f}<ӌ6݅R8(\u00041\u001aXHP6\u000bGY\r*0nrJX\u001bP\u001d\u001c(\u0005l$\u0011$jlf8^k\f@?/\u0011pZV7a@|{\u0016\\SU\u0015\u0007e,5X7c 5W\u0011\u0013j[m\u0002ӭu=\u0013uo-9f\fWdvF(]A],urTz5Un,?+}i{T\u001cI\u0010z*'\u0003\u0004V\u00145jF-He8\u0012A\u0018\u000bSnVH^\u000b\u0016\t\u0006N\u0017S\u001ec/G>~Q\u0010AIRE\u001d\u001d\rL=Gnigb3x\u0015Ir(U?_X=v]RgK\u0014\u001cp\u0011 Z\b>n\u0018/*+t,mEia;!\u001a xHu\u0018\u001d`\u0017m0R\u0019L0o.7X\u000bbɱF\u0081\tkXӹ):\u001fP4V\u001d|6\u0017vςy˶%%\u0018ʚ vwoe_ $]l\u000eխp«\u0012WAӔ\u0004I_j(ibx$?jk\u001bW\u0015J*ۑ\\څ,\":ʋ;\u001c\u0006\n\\N:\"\tŰ\u001eʬ8,9ǉ-)V\u00136DW{7c\u0011=fюVտ(\u0007\u0002&z\u001a\u000fb-|}q\u0011IZ\b7ø/ۮU5!ğ&4v@\u0015#5}JéIѨPMT˾.w[\u000f.*jK_DU\u0013=\u0015_\u0007XΦGʆviiO\u0018>\t\u0015J\u001bI\u0002Fg6\u0005GݝlʧNO\\ϟr\tl\u000e;\b\u0013\u001606\u001dۀIϭX\u000fs@O\u000f\u0011q\u008aRa"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001dQf,\u000b@^!\"[Y\u0019<\u007f\b5`\t DC", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkAs", "\u001a`]1e6BR,H\bh6\u0005R\u000ee\u0007(}<\u0010\u001b IY\u0019<\u007f\b5`\t DC", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1n_F99H[t\r\t^;g\u0005>h", "", "1n_F99H[y\u0003\u0002^", "\u001aiPCTuB]b_~e,R", "1n_F99H[|\b\u0006n;j\u0018<e{0", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Nv\n9}%\u000b", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "2`c.U(LS\n~\bl0\u0007\u0012", "", "2d[2Z(MS", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{m]J\u0003-0X@\bKSN\u0002CWnN\u0010[j\u001dR2V\u0003cJ\"~QD\u001f\u0011;\u0013_7o\b\b\u0013\u00155@T)R\u0019F\u0007\u001fy@<2Tef}VA\u000fa'.yo(gDG3\u0002]\u007f\u001fwP\u0018\u0015{\\srY\u0005gt\u001d\\k", "2`c.U(LSv\t\u0004_0~\u0019<a\u000f,\u0006I", "\u001a`]1e6BR,H\bh6\u0005R\u000ea\u000f$x<\u000f\u0017tQx\u000f@x5BU\r$Avk", "2`c.U(LS\u0002z\u0003^", "5dc\u0011T;:P\u0015\rzG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0011X3>U\u0015\u000ez", "u(;.a+K]\u001d}\u000e(:\t\u00103t\u007fqz=J\u0005'Rz\u0018I\u0006\u0013!@\u0002/7W!.V&;r?\u001e\">", "@dP1T)ESwz\nZ)x\u0017/", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "5dc\u001fX(=O\u0016\u0006z=(\f\u0005,a\u000e(", "u(;.a+K]\u001d}\u000e(:\t\u00103t\u007fqz=J\u0005'Rz\u0018I\u0006\u0013!@\u0002/7L\u0012=I@7y4s", "Dda6Y0>R", "", "EqXAT)ESwz\nZ)x\u0017/", "5dc$e0MO\u0016\u0006z=(\f\u0005,a\u000e(", "1k^@X", "", "1n_F7(MO\u0016z\t^\r\u0001\u0010/", "2dbA\\5:b\u001d\t\u0004?0\u0004\t", "EqXAT)ES", "1qT.g,\u001f`\u0015\u0007zp6\n\u000f\u0019p\u007f1^@\b\"\u0017T", "2`c.U(LSy\u0003\u0002^", "2hb=T;<V\u0003\bdi,\u0006s<e\u000b$yF|\u0019\u0017FN\nKr\"1g}", "Adc\u0011T;:P\u0015\rz<6\u0006\n3g\u00105wO\u0005! ", "Adc$e0MSt\u0002zZ+c\u00131g\u00041} \n\u0013\u0014No\r", "3mP/_,=", "Dda6Y@\u001dO(zwZ:|i3l\u007f", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SQLiteCopyOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {
    private final Context context;
    private final String copyFromAssetPath;
    private final File copyFromFile;
    private final Callable<InputStream> copyFromInputStream;
    private DatabaseConfiguration databaseConfiguration;
    private final int databaseVersion;
    private final SupportSQLiteOpenHelper delegate;
    private boolean verified;

    public SQLiteCopyOpenHelper(Context context, String str, File file, Callable<InputStream> callable, int i2, SupportSQLiteOpenHelper delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i2;
        this.delegate = delegate;
    }

    @Override // androidx.room.DelegatingOpenHelper
    public SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z2) {
        getDelegate().setWriteAheadLoggingEnabled(z2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() throws Throwable {
        if (!this.verified) {
            verifyDatabaseFile(true);
            this.verified = true;
        }
        return getDelegate().getWritableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getReadableDatabase() throws Throwable {
        if (!this.verified) {
            verifyDatabaseFile(false);
            this.verified = true;
        }
        return getDelegate().getReadableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    public final void setDatabaseConfiguration(DatabaseConfiguration databaseConfiguration) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    private final void verifyDatabaseFile(boolean z2) throws Throwable {
        EO.Od("U\u00011P", (short) (ZN.Xd() ^ 10466));
        String strQd = C1561oA.Qd("f\u0001\b\n\u0002\u007f:\u000e\b7zz\u0001x\u0007v0so\u0002mmk|m'lnph\")", (short) (C1607wl.Xd() ^ 14638));
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException(ZO.xd("\u000fI)\u00036$\u001af\u000b#}7\u001ez_UurY4`&H\u001a", (short) (ZN.Xd() ^ 5271), (short) (ZN.Xd() ^ 7258)).toString());
        }
        Context context = this.context;
        Object[] objArr = {databaseName};
        Method method = Class.forName(C1593ug.zd("2@7FD?;\u0006<IIPBLS\u000e$QQXJ^[", (short) (C1499aX.Xd() ^ (-19949)), (short) (C1499aX.Xd() ^ (-18831)))).getMethod(C1561oA.Kd("HGW(FZHJJ]P<NbW", (short) (C1580rY.Xd() ^ (-28793))), Class.forName(C1561oA.od("(\u001e2\u001cg%\u0019%\u001db\u0007'$\u001a\u001e\u0016", (short) (C1580rY.Xd() ^ (-16748)))));
        try {
            method.setAccessible(true);
            File file = (File) method.invoke(context, objArr);
            DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
            String strZd = Wg.Zd("a\u0003(9pQ8  `\u0006qW+m\r\u0012IpZ0", (short) (C1607wl.Xd() ^ 6326), (short) (C1607wl.Xd() ^ 2442));
            DatabaseConfiguration databaseConfiguration2 = null;
            if (databaseConfiguration == null) {
                Intrinsics.throwUninitializedPropertyAccessException(strZd);
                databaseConfiguration = null;
            }
            boolean z3 = databaseConfiguration.multiInstanceInvalidation;
            Context context2 = this.context;
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Xd(";I@OMHD\u000fERRYKU\\\u0017-ZZaSgd", (short) (OY.Xd() ^ 18003))).getMethod(Wg.vd("\u0003\u0002\u000e`\u0001\u0005z\nW}\u0004", (short) (C1607wl.Xd() ^ 4667)), new Class[0]);
            try {
                method2.setAccessible(true);
                ProcessLock processLock = new ProcessLock(databaseName, (File) method2.invoke(context2, objArr2), z3);
                try {
                    ProcessLock.lock$default(processLock, false, 1, null);
                    boolean zExists = file.exists();
                    String strKd = Qg.kd("p\tzz\u0004{5\t\u00032t\u007f\u007f\b-pl~jjhyj$ikme-", (short) (OY.Xd() ^ 20646), (short) (OY.Xd() ^ 7576));
                    short sXd = (short) (C1633zX.Xd() ^ (-10128));
                    short sXd2 = (short) (C1633zX.Xd() ^ (-17781));
                    int[] iArr = new int["\u001e\u001a,\u0018\u0018\u0016'\u0018w\u001a\u001c\u0014".length()];
                    QB qb = new QB("\u001e\u001a,\u0018\u0018\u0016'\u0018w\u001a\u001c\u0014");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                        i2++;
                    }
                    String str = new String(iArr, 0, i2);
                    if (!zExists) {
                        try {
                            Intrinsics.checkNotNullExpressionValue(file, str);
                            copyDatabaseFile(file, z2);
                            processLock.unlock();
                            return;
                        } catch (IOException e2) {
                            throw new RuntimeException(strKd, e2);
                        }
                    }
                    try {
                        Intrinsics.checkNotNullExpressionValue(file, str);
                        int version = DBUtil.readVersion(file);
                        if (version == this.databaseVersion) {
                            processLock.unlock();
                            return;
                        }
                        DatabaseConfiguration databaseConfiguration3 = this.databaseConfiguration;
                        if (databaseConfiguration3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(strZd);
                        } else {
                            databaseConfiguration2 = databaseConfiguration3;
                        }
                        if (databaseConfiguration2.isMigrationRequired(version, this.databaseVersion)) {
                            processLock.unlock();
                            return;
                        }
                        Context context3 = this.context;
                        Class<?> cls = Class.forName(C1561oA.ud("o{p}yrl5itrwgot-Aljo_ql", (short) (C1499aX.Xd() ^ (-7142))));
                        Class<?>[] clsArr = new Class[1];
                        clsArr[0] = Class.forName(C1561oA.yd("dZr\\$aYei/Wwpfnf", (short) (C1580rY.Xd() ^ (-11804))));
                        Object[] objArr3 = {databaseName};
                        short sXd3 = (short) (C1580rY.Xd() ^ (-3856));
                        int[] iArr2 = new int[";=E?OA!?SACCVI".length()];
                        QB qb2 = new QB(";=E?OA!?SACCVI");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i3));
                            i3++;
                        }
                        Method method3 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                        try {
                            method3.setAccessible(true);
                            if (((Boolean) method3.invoke(context3, objArr3)).booleanValue()) {
                                try {
                                    copyDatabaseFile(file, z2);
                                } catch (IOException e3) {
                                    IOException iOException = e3;
                                }
                            } else {
                                StringBuilder sbAppend = new StringBuilder(strQd).append(databaseName);
                                short sXd4 = (short) (C1580rY.Xd() ^ (-32594));
                                short sXd5 = (short) (C1580rY.Xd() ^ (-845));
                                int[] iArr3 = new int["OG\u000f\u0019\u001dK\u000eM\u0012\u001f!+R\u0018\u001a)+*.\u001d/%3#^-*)5%9/66v".length()];
                                QB qb3 = new QB("OG\u000f\u0019\u001dK\u000eM\u0012\u001f!+R\u0018\u001a)+*.\u001d/%3#^-*)5%9/66v");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i4)) + sXd5);
                                    i4++;
                                }
                                sbAppend.append(new String(iArr3, 0, i4)).toString();
                            }
                            processLock.unlock();
                            return;
                        } catch (InvocationTargetException e4) {
                            throw e4.getCause();
                        }
                    } catch (IOException e5) {
                        Jg.Wd("-z\u00127fD#\u0019<UXl\u0011<]>_ q\u001fB}\u00183+BwZt/R7", (short) (ZN.Xd() ^ 13261), (short) (ZN.Xd() ^ 7523));
                        IOException iOException2 = e5;
                        processLock.unlock();
                        return;
                    }
                } catch (Throwable th) {
                    processLock.unlock();
                    throw th;
                }
                processLock.unlock();
                throw th;
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        } catch (InvocationTargetException e7) {
            throw e7.getCause();
        }
    }

    private final void copyDatabaseFile(File file, boolean z2) throws Throwable {
        FileChannel fileChannelNewChannel;
        if (this.copyFromAssetPath != null) {
            Context context = this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Qd("frgtpic,`kin^fk$8cafVhc", (short) (Od.Xd() ^ (-12471)))).getMethod(C1593ug.zd("zy\nW\u000b\f~\u000f\u000f", (short) (ZN.Xd() ^ 26622), (short) (ZN.Xd() ^ 15158)), new Class[0]);
            try {
                method.setAccessible(true);
                fileChannelNewChannel = Channels.newChannel(((AssetManager) method.invoke(context, objArr)).open(this.copyFromAssetPath));
                Intrinsics.checkNotNullExpressionValue(fileChannelNewChannel, C1561oA.od("h^o:^VbaW]\u0018R][`Pb]\u0016HYXIWU\u000fOOCK\u0004>IIQ\u001dHDA\u0014ED5C\u001e.@3rq", (short) (OY.Xd() ^ 13284)));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else if (this.copyFromFile != null) {
            FileChannel channel = new FileInputStream(this.copyFromFile).getChannel();
            Intrinsics.checkNotNullExpressionValue(channel, C1561oA.Kd("\u000e260\u0015;>DD$FE96C~;HJT\"OML&JNH\r\u0013IOIWXPX", (short) (FB.Xd() ^ 25980)));
            fileChannelNewChannel = channel;
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable == null) {
                throw new IllegalStateException(Ig.wd("\u0003@m\u001cggV\u0002\u000b\u001f\u001fp1\u0011,\u001f>\u0006/xJpi8*\tb\u0013yhC_vgkf\bmDc(l\u001a:\\\u0012>\u0013$'i\u001adY&X K\u0013Ot\u001ep\n1\u001cS f", (short) (Od.Xd() ^ (-18929))));
            }
            try {
                fileChannelNewChannel = Channels.newChannel(callable.call());
                Intrinsics.checkNotNullExpressionValue(fileChannelNewChannel, Wg.Zd("?9M\u0017>6eo`m$\f\u0013\u0017\u001e\u001c\u001dD<90B ", (short) (C1499aX.Xd() ^ (-6435)), (short) (C1499aX.Xd() ^ (-3105))));
            } catch (Exception e3) {
                throw new IOException(C1626yg.Ud("=+wR\u0019\u0006M\u0012\u0005\u007f\u0016!^>{\b6\u0013c9\u0006[0g\u0017\bN6\u001a\u001c3\u007f3\t~\f<", (short) (C1499aX.Xd() ^ (-14051)), (short) (C1499aX.Xd() ^ (-25041))), e3);
            }
        }
        Context context2 = this.context;
        Object[] objArr2 = new Object[0];
        Method method2 = Class.forName(C1561oA.Xd("m{r\u0002\u007fzvAw\u0005\u0005\f}\b\u000fI_\r\r\u0014\u0006\u001a\u0017", (short) (Od.Xd() ^ (-32331)))).getMethod(Wg.vd("fcuC\\]eaKo{", (short) (ZN.Xd() ^ 29722)), new Class[0]);
        try {
            method2.setAccessible(true);
            File fileCreateTempFile = File.createTempFile(Qg.kd("\u0012\u000e\r\nH}\t\t\u0011C}y\u007f\u0003v\u0003", (short) (C1499aX.Xd() ^ (-20611)), (short) (C1499aX.Xd() ^ (-27420))), hg.Vd("&kce", (short) (Od.Xd() ^ (-25951)), (short) (Od.Xd() ^ (-9167))), (File) method2.invoke(context2, objArr2));
            fileCreateTempFile.deleteOnExit();
            FileChannel channel2 = new FileOutputStream(fileCreateTempFile).getChannel();
            short sXd = (short) (C1580rY.Xd() ^ (-24156));
            int[] iArr = new int["\u0015\u001a\u0018\u0013\u0017\u0015".length()];
            QB qb = new QB("\u0015\u001a\u0018\u0013\u0017\u0015");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Intrinsics.checkNotNullExpressionValue(channel2, new String(iArr, 0, i2));
            FileUtil.copy(fileChannelNewChannel, channel2);
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                short sXd2 = (short) (FB.Xd() ^ 9077);
                int[] iArr2 = new int["&BGKAAyOW\tIYIFVH\u0010UWaQP^Zjb[j\u0014[ae ".length()];
                QB qb2 = new QB("&BGKAAyOW\tIYIFVH\u0010UWaQP^Zjb[j\u0014[ae ");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                    i3++;
                }
                throw new IOException(new String(iArr2, 0, i3) + file.getAbsolutePath());
            }
            short sXd3 = (short) (C1499aX.Xd() ^ (-2044));
            int[] iArr3 = new int["kqxjxtmmsl\u0001rTx|v".length()];
            QB qb3 = new QB("kqxjxtmmsl\u0001rTx|v");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd3 + sXd3) + sXd3) + i4));
                i4++;
            }
            Intrinsics.checkNotNullExpressionValue(fileCreateTempFile, new String(iArr3, 0, i4));
            dispatchOnOpenPrepackagedDatabase(fileCreateTempFile, z2);
            if (fileCreateTempFile.renameTo(file)) {
                return;
            }
            short sXd4 = (short) (C1580rY.Xd() ^ (-20090));
            short sXd5 = (short) (C1580rY.Xd() ^ (-18976));
            int[] iArr4 = new int["%AJNHH\u0005ZV\bVYaQ\rW]dVd`YY_Xl^\u001aaeic\u001f(".length()];
            QB qb4 = new QB("%AJNHH\u0005ZV\bVYaQ\rW]dVd`YY_Xl^\u001aaeic\u001f(");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd4 + i5)) + sXd5);
                i5++;
            }
            throw new IOException(new String(iArr4, 0, i5) + fileCreateTempFile.getAbsolutePath() + Jg.Wd("5^ya\u00183\u001d-\u0001^u+'2~j\"`", (short) (FB.Xd() ^ 6574), (short) (FB.Xd() ^ 23064)) + file.getAbsolutePath() + ZO.xd("#T", (short) (OY.Xd() ^ 29545), (short) (OY.Xd() ^ 25830)));
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private final void dispatchOnOpenPrepackagedDatabase(File file, boolean z2) throws IOException {
        DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        if (databaseConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            databaseConfiguration = null;
        }
        if (databaseConfiguration.prepackagedDatabaseCallback == null) {
            return;
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelperCreateFrameworkOpenHelper = createFrameworkOpenHelper(file);
        try {
            SupportSQLiteOpenHelper supportSQLiteOpenHelper = supportSQLiteOpenHelperCreateFrameworkOpenHelper;
            SupportSQLiteDatabase writableDatabase = z2 ? supportSQLiteOpenHelper.getWritableDatabase() : supportSQLiteOpenHelper.getReadableDatabase();
            DatabaseConfiguration databaseConfiguration2 = this.databaseConfiguration;
            if (databaseConfiguration2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                databaseConfiguration2 = null;
            }
            RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback = databaseConfiguration2.prepackagedDatabaseCallback;
            Intrinsics.checkNotNull(prepackagedDatabaseCallback);
            prepackagedDatabaseCallback.onOpenPrepackagedDatabase(writableDatabase);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(supportSQLiteOpenHelperCreateFrameworkOpenHelper, null);
        } finally {
        }
    }

    private final SupportSQLiteOpenHelper createFrameworkOpenHelper(File file) {
        try {
            final int version = DBUtil.readVersion(file);
            FrameworkSQLiteOpenHelperFactory frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            SupportSQLiteOpenHelper.Configuration.Builder builderName = SupportSQLiteOpenHelper.Configuration.Companion.builder(this.context).name(file.getAbsolutePath());
            final int iCoerceAtLeast = RangesKt.coerceAtLeast(version, 1);
            return frameworkSQLiteOpenHelperFactory.create(builderName.callback(new SupportSQLiteOpenHelper.Callback(iCoerceAtLeast) { // from class: androidx.room.SQLiteCopyOpenHelper$createFrameworkOpenHelper$configuration$1
                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onCreate(SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onUpgrade(SupportSQLiteDatabase db, int i2, int i3) {
                    Intrinsics.checkNotNullParameter(db, "db");
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onOpen(SupportSQLiteDatabase db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    int i2 = version;
                    if (i2 < 1) {
                        db.setVersion(i2);
                    }
                }
            }).build());
        } catch (IOException e2) {
            throw new RuntimeException("Malformed database file, unable to read version.", e2);
        }
    }
}
