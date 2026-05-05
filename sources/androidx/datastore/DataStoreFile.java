package androidx.datastore;

import android.content.Context;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;

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
/* JADX INFO: compiled from: DataStoreFile.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!4i\bDZc|İI\u0006>\u00176Ȑ\u00172:ߚ\u0010\u0007\u0015ia0rex2`TB\u000f\u001a}Ē(^"}, d2 = {"2`c.F;H`\u0019_~e,", "\u001aiPCTuB]b_~e,R", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "4h[2A(FS", "", "2`c.f;H`\u0019x\b^3|\u0005=e"}, k = 2, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class DataStoreFile {
    public static final File dataStoreFile(Context context, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Kd("\tB79D\u0010", (short) (C1580rY.Xd() ^ (-26806))));
        Intrinsics.checkNotNullParameter(str, Wg.Zd("B%\t_)\u001c\rf", (short) (FB.Xd() ^ 20885), (short) (FB.Xd() ^ 28499)));
        short sXd = (short) (C1580rY.Xd() ^ (-21526));
        int[] iArr = new int["m{r\u0002\u007fzvAw\u0005\u0005\f}\b\u000fI_\r\r\u0014\u0006\u001a\u0017".length()];
        QB qb = new QB("m{r\u0002\u007fzvAw\u0005\u0005\f}\b\u000fI_\r\r\u0014\u0006\u001a\u0017");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (FB.Xd() ^ 27105);
        int[] iArr2 = new int["\b\u0005\u0017b\r\f\u000b\u0007{x\u000f\u0003\u0004\u0002Y\u0005\u001f$\u0018*!".length()];
        QB qb2 = new QB("\b\u0005\u0017b\r\f\u000b\u0007{x\u000f\u0003\u0004\u0002Y\u0005\u001f$\u0018*!");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            short sXd3 = (short) (OY.Xd() ^ 1574);
            short sXd4 = (short) (OY.Xd() ^ 9587);
            int[] iArr3 = new int["lxmzvoi2fqotdlq*>igl\\ni".length()];
            QB qb3 = new QB("lxmzvoi2fqotdlq*>igl\\ni");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(((sXd3 + i4) + xuXd3.CK(iKK3)) - sXd4);
                i4++;
            }
            Class<?> cls2 = Class.forName(new String(iArr3, 0, i4));
            Class<?>[] clsArr2 = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd5 = (short) (C1633zX.Xd() ^ (-29673));
            short sXd6 = (short) (C1633zX.Xd() ^ (-15712));
            int[] iArr4 = new int["<9G\u0018:<4A\u00115=".length()];
            QB qb4 = new QB("<9G\u0018:<4A\u00115=");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(sXd5 + i5 + xuXd4.CK(iKK4) + sXd6);
                i5++;
            }
            Method method2 = cls2.getMethod(new String(iArr4, 0, i5), clsArr2);
            try {
                method2.setAccessible(true);
                return new File((File) method2.invoke(context2, objArr2), Intrinsics.stringPlus(C1561oA.ud("40B.??9;-u", (short) (C1607wl.Xd() ^ 4981)), str));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
