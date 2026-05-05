package androidx.compose.ui.unit;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import yg.C1499aX;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.ZO;

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
/* JADX INFO: compiled from: AndroidDensity.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bӵLc\u000b\u0004IيH\u0017<Ȑ\u0017\"Z\u0011(\u000btjQ0rf߲2T"}, d2 = {"\u0012d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidDensity_androidKt {
    public static final Density Density(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("\u0010pB\n{\u001b<H\u000e,u\u001dBcgwlAf5\u0003l\b", (short) (C1633zX.Xd() ^ (-1375)), (short) (C1633zX.Xd() ^ (-15964)))).getMethod(C1626yg.Ud("\u001dq}\u0001tYQqP^\u0016f", (short) (FB.Xd() ^ 32566), (short) (FB.Xd() ^ 13823)), new Class[0]);
        try {
            method.setAccessible(true);
            float f2 = ((Resources) method.invoke(context, objArr)).getConfiguration().fontScale;
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Ig.wd("K\u0006i[H\u0006!\n\u0005`aE\b\u0007\ba1]\u00033h\u001e>", (short) (OY.Xd() ^ 29210))).getMethod(EO.Od("\u001ba~\u0005o*\n\u0001[*(\u001a", (short) (C1499aX.Xd() ^ (-29680))), new Class[0]);
            try {
                method2.setAccessible(true);
                float f3 = ((Resources) method2.invoke(context, objArr2)).getDisplayMetrics().density;
                LinearFontScaleConverter linearFontScaleConverterForScale = FontScaleConverterFactory.INSTANCE.forScale(f2);
                if (linearFontScaleConverterForScale == null) {
                    linearFontScaleConverterForScale = new LinearFontScaleConverter(f2);
                }
                return new DensityWithConverter(f3, f2, linearFontScaleConverterForScale);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
