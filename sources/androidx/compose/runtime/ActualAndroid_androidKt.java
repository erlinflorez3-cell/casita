package androidx.compose.runtime;

import android.os.Looper;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import yg.C1561oA;
import yg.C1580rY;
import yg.InterfaceC1492Gx;
import yg.QB;
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
/* JADX INFO: compiled from: ActualAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d̉=!4i\bDJh|\u0004O\u000f8é6B\r.4ߚ\u007f\u0007tqA0JfP.hS2şs{B(cҕyCQU\"}0\u000eWȞog\u0005Jb\u000bQ\u0015\u000eǝ\u0001jBI]ތe\u0012%2JoE3UoS9ht<\u0005(208\u0002\u0005\u0007\u001a2H\u001ew\u0003ŏS\f(0H\u0081R`\u001b[\u001d\u001a@\u0015n$\u000f.tg|G\u000fǍuH=5\u001bipaWc>\re\rthm˙\u000fo,@X7c+UW\u0011\u0017j[m\u001a\u0006мU\u0013v??+w\r\b:f\u0010,\u0015YZSƞ\u000bSj\u001fif\u001c);O*g~)Hy\u0001Ԉ\u001bX4\u0012\u00147`.s6\u0017\u0012\u001cP\rxcB`\u0002%^.\u0019(اа)\u007fAJQ1tqy;Gog\u007f\u0013/6#/wQ_b1x\u0015Ix>\u0383QpN׀`N8Xs2Z͗ì\u0002ò\b@O\u00025\u007f\u001f3''=[G$9m\bJRj\u0017\u0011nnki\u0001O\u0017̑Aގ;*\u0011ȱzPr\r\u0004P\u0003a\u0003ҍ ɟX\u0007\u0006ܱ32j\u0002T!S\u001b%йjȬnSe܃=1lCg{\u0014\u0018]ުlXUQ\u00126\u0012R%:͜@\n"}, d2 = {"\u0012dU.h3M;#\b\u0005m6\u0006\r-F\r$\u0004@^\u001e!Eu", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\u007f/Dc\u0007$5N#*UC\u0019r>\u001c\u001b>", "5dc\u0011X-:c \u000ebh5\u0007\u00189n\u0004&\\M|\u001f\u0017%v\u0018:|c1b\u0007*Fi%2WLI", "u(E", "5dc\u0011X-:c \u000ebh5\u0007\u00189n\u0004&\\M|\u001f\u0017%v\u0018:|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006^/>c\r*@q\u0014\u000fZ?Ck\u0012%\u001ffg\u000f", "\u0012dU.h3M;#\b\u0005m6\u0006\r-F\r$\u0004@^\u001e!EuL;v,5[y/7", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "\u0012hb._3Hew~{Z<\u0004\u0018\u0017o\t2\u000bJ\n\u001b\u0015(|\nDv\u0003<c{&", "", "\u001anV!T.", "", "\u001b`X;G/KS\u0015}^]", "", "5dc\u001aT0GB\u001c\fzZ+`\b", "u(9", "1qT.g,,\\\u0015\n\ta6\fp?t{%\u0003@_!'Dv\u000e*\u0006!DY", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}~A}\u00135M1JgC\u001ej", "D`[BX", "", "1qT.g,,\\\u0015\n\ta6\fp?t{%\u0003@a\u001e!C~{Kr45", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "", "1qT.g,,\\\u0015\n\ta6\fp?t{%\u0003@d &5~\nKv", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0004@|\u0004=IR;A", "", "1qT.g,,\\\u0015\n\ta6\fp?t{%\u0003@g! I]\u001d8\u0006%", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0007Av\u0018\u001c\\?Jk\n", "1qT.g,,\\\u0015\n\ta6\fp?t{%\u0003@n&\u0013Vo", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-|xp5\u0004j,<\u0006#VL$", "\"", ">n[6V@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/\u001f}%*\\GEt\u001f(\u001cl_M\\", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_;]LJo<\u001e^Vj5\u0012q/X\u0006\u000fW[J;`\\{(\u001e\u0019^\fb\u0001PkUJ#{N;\u001e\u001buG\fCs\u000b\u001a\u0016WBzyQZ\u0018GC#~=4vIcn\b\u0011/N^5r\u000fi,DJI \u0011x\u0019\twL=\nQ", ":nV\u0012e9H`", "", ";db@T.>", ExifInterface.GPS_MEASUREMENT_3D, "", "\u0011gT0^\u0019>a)\u0006\n", "\u001a`]1e6BR,Hvg5\u0007\u0018+t\u00042\u0005\n^\u001a\u0017Euz<\u00055<hS", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ActualAndroid_androidKt {
    private static final Lazy DefaultMonotonicFrameClock$delegate = LazyKt.lazy(new Function0<MonotonicFrameClock>() { // from class: androidx.compose.runtime.ActualAndroid_androidKt$DefaultMonotonicFrameClock$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final MonotonicFrameClock invoke() throws Throwable {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(C1561oA.od("?K@MIB<\u0005EH\u0002\u001fA@@4@", (short) (ZN.Xd() ^ 13190))).getDeclaredMethod(C1561oA.Kd("CBR,AJP/STVLZ", (short) (C1580rY.Xd() ^ (-16864))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                return ((Looper) declaredMethod.invoke(null, objArr)) != null ? DefaultChoreographerFrameClock.INSTANCE : SdkStubsFallbackFrameClock.INSTANCE;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    });
    private static final boolean DisallowDefaultMonotonicFrameClock = false;
    private static final String LogTag = "ComposeInternal";
    private static final long MainThreadId;

    @Deprecated(message = "\u0010U\nD\u0006\u0004#`[-:{]\u001a\u000fZkO\u0014:Di\u001eW6T}~\u000e{0ujMpNf\u001ciIV*<=\u0013XX~aYKMtQGQ\u001cS\u0015X!\u0006F\u000f\u0006Y/,/P=|ka\t\fX\"N\u000bS7)EX/Gb\u001fo\b_x.S\u00131L")
    @InterfaceC1492Gx
    public static /* synthetic */ void getDefaultMonotonicFrameClock$annotations() {
    }

    static {
        long id;
        try {
            Class<?> cls = Class.forName(hg.Vd("w\u0004x\u0006\u0002zt=}\u0001:Wyxxlx", (short) (C1580rY.Xd() ^ (-17827)), (short) (C1580rY.Xd() ^ (-4449))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (ZN.Xd() ^ 8746);
            int[] iArr = new int["SP^6IPT1SRRFR".length()];
            QB qb = new QB("SP^6IPT1SRRFR");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod.setAccessible(true);
                id = ((Looper) declaredMethod.invoke(null, objArr)).getThread().getId();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception unused) {
            id = -1;
        }
        MainThreadId = id;
    }

    public static final MonotonicFrameClock getDefaultMonotonicFrameClock() {
        return (MonotonicFrameClock) DefaultMonotonicFrameClock$delegate.getValue();
    }

    public static final <T> SnapshotMutableState<T> createSnapshotMutableState(T t2, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return new ParcelableSnapshotMutableState(t2, snapshotMutationPolicy);
    }

    public static final MutableIntState createSnapshotMutableIntState(int i2) {
        return new ParcelableSnapshotMutableIntState(i2);
    }

    public static final MutableLongState createSnapshotMutableLongState(long j2) {
        return new ParcelableSnapshotMutableLongState(j2);
    }

    public static final MutableFloatState createSnapshotMutableFloatState(float f2) {
        return new ParcelableSnapshotMutableFloatState(f2);
    }

    public static final MutableDoubleState createSnapshotMutableDoubleState(double d2) {
        return new ParcelableSnapshotMutableDoubleState(d2);
    }

    public static final void logError(String str, Throwable th) {
    }

    public static final long getMainThreadId() {
        return MainThreadId;
    }
}
