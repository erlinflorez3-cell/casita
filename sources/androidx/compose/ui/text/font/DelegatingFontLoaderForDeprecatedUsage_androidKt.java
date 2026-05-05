package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import yg.C1607wl;
import yg.EO;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
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
/* JADX INFO: compiled from: DelegatingFontLoaderForDeprecatedUsage.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007ӬD \u0006ј~jg/tiV.jSX\u00102zL:iҕ\nCiTJ\u00020\tgN\u0016h\u001fNh\r[\u000f4\u0019?o\u0082MY"}, d2 = {"1qT.g,\u001f]\"\u000e[Z4\u0001\u0010CR\u007f6\u0006G\u0012\u0017$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "4n]AE,L])\fx^\u0013\u0007\u0005.e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F,\u0003.[MKx2\u001e{r]8\u0007p\u0002", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DelegatingFontLoaderForDeprecatedUsage_androidKt {
    @Deprecated(message = "\u0017N\u0005H1y-`k[;:d$kPnU\r.\n(\u0011j\u007fY\u0003s\\{cLwZx\u0010?a{H[06?}eM}'j\bNz@7\u001e\rZ'I.6H\u00112\u000etv1^\u0003\u007f\u001d#\u001b;IuN\tU\u0014)>\\{T!\u000es\u000f/\u000b4G\u0015\u0012\u000e\u001c\u0019\u0010K\u0012\u001651GEl:,6HMWaP~", replaceWith = @ReplaceWith(expression = "createFontFamilyResolver()", imports = {}))
    @InterfaceC1492Gx
    public static final FontFamily.Resolver createFontFamilyResolver(Font.ResourceLoader resourceLoader, Context context) throws Throwable {
        Class<?> cls = Class.forName(EO.Od(".q\u0018Dj)\u000e\u001a&47U\u0011\u0012J a\u001aS\u007f'd\u0001", (short) (C1607wl.Xd() ^ 104)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-30544));
        int[] iArr = new int["\n\u0007\u0015`\u000f\u000e\t\u0005}z\r\u0001\u0006\u0004W\u0003\u0001\u0006u\b\u0003".length()];
        QB qb = new QB("\n\u0007\u0015`\u000f\u000e\t\u0005}z\r\u0001\u0006\u0004W\u0003\u0001\u0006u\b\u0003");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return new FontFamilyResolverImpl(new DelegatingFontLoaderForBridgeUsage(resourceLoader, (Context) method.invoke(context, objArr)), null, null, null, null, 30, null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Deprecated(message = "\u0017N\u0005H1y-`k[;:d$kPnU\r.\n(\u0011j\u007fY\u0003s\\{cLwZx\u0010?a{H[06?}eM}'j\b\u001cU'G]KH\"HZ\n<\u0011\b\u0018sv\u001eP=\u000eb/\u0017\u0012M\u0014~\u0012JB0pgw@`", replaceWith = @ReplaceWith(expression = "createFontFamilyResolver()", imports = {}))
    @InterfaceC1492Gx
    public static final FontFamily.Resolver createFontFamilyResolver(Font.ResourceLoader resourceLoader) {
        return new FontFamilyResolverImpl(new DelegatingFontLoaderForDeprecatedUsage(resourceLoader), null, null, null, null, 30, null);
    }
}
