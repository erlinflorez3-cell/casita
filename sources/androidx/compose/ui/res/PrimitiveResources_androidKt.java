package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
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
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
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
/* JADX INFO: compiled from: PrimitiveResources.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d̉=!,r\bӵLc\u0003\nI\u00066\u000b6B\u0015\"4\u0012}\u0007njGCLeN0jh8ş\u0004{b#\f*wBIU2}P\n\u0016S˗knX\\#X\u001d\t.x\u00190y[~\\ \u000fJB\u001e@yRڱA9nyN\u001a.8:8(\f1 0G\u001ev\u0013Cy\rX5Ϯt:`\u0015e\u001a(\u001b\u001e>N\u0002NbmMDH\u0005]h0i\bݦFN5i݇\u0001X"}, d2 = {"0n^9X(G@\u0019\r\u0005n9z\t", "", "7c", "", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zk\u0012\u00118", "2h\\2a:B]\"kzl6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zk\u0012\u0011$", "7mc2Z,K/&\fvr\u0019|\u00179u\r&{", "", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zk\u0012\u00119\u001f", "7mc2Z,K@\u0019\r\u0005n9z\t", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zk\u0012\u0011'", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PrimitiveResources_androidKt {
    public static final int integerResource(int i2, Composer composer, int i3) throws Throwable {
        ComposerKt.sourceInformationMarkerStart(composer, 916701108, C1561oA.ud("G+kotdebnM_lglhXY\u001c%(0  #\u001f7!#8YORMWKWE1CPKPL<=J\u00046B7D@93{8@m-,;/){", (short) (C1499aX.Xd() ^ (-8804))));
        if (ComposerKt.isTraceInProgress()) {
            short sXd = (short) (C1633zX.Xd() ^ (-9984));
            int[] iArr = new int["3?4AE>8Kw,74><?0\u0010VI\rXJW\u0011CGL<EBN-Wd_dhXY\u0013\u00129ZP[V`TxfRdytyu]^k%_k`m\u0001ys<\u0001\tME?1".length()];
            QB qb = new QB("3?4AE>8Kw,74><?0\u0010VI\rXJW\u0011CGL<EBN-Wd_dhXY\u0013\u00129ZP[V`TxfRdytyu]^k%_k`m\u0001ys<\u0001\tME?1");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i4));
                i4++;
            }
            ComposerKt.traceEventStart(916701108, i3, -1, new String(iArr, 0, i4));
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, C1561oA.Yd("bc[e\u0013\u0012\u0016\u0016\u001b\u0012\u001e\u0014\u001b\u001by\u001e\u0013\u0012\u001e`\u001f)Xo! $\",", (short) (Od.Xd() ^ (-7128))));
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        Class<?> cls = Class.forName(Xg.qd("\t\u0017\u000e\u001d\u001b\u0016\u0012\\\u0013  '\u0019#*dz((/!52", (short) (Od.Xd() ^ (-11341)), (short) (Od.Xd() ^ (-28977))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1499aX.Xd() ^ (-25804));
        short sXd3 = (short) (C1499aX.Xd() ^ (-21386));
        int[] iArr2 = new int["G\u00178'<[)QOReE".length()];
        QB qb2 = new QB("G\u00178'<[)QOReE");
        int i5 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - ((i5 * sXd3) ^ sXd2));
            i5++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i5), clsArr);
        try {
            method.setAccessible(true);
            int integer = ((Resources) method.invoke(context, objArr)).getInteger(i2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return integer;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final int[] integerArrayResource(int i2, Composer composer, int i3) throws Throwable {
        ComposerKt.sourceInformationMarkerStart(composer, -93991766, Wg.Zd("\\&<*%v-\u0014\u0016IOX<5b^A\u001e|bH+cXH9~OG!\u0011d|wjFG\bc=C\u0017TlsX/\u0011ZA ?k}H;1\u0010[i \u000e\u00116KD\u000ei2", (short) (C1607wl.Xd() ^ 25901), (short) (C1607wl.Xd() ^ 25182)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-93991766, i3, -1, C1561oA.Xd("\n\u0018\u000f\u001e\u001c\u0017\u0013(^\u0015\"!%%*\u001df/$i/#2m*07),+9\t;<,E\u001f3B?FD69t}'JBGDPFTD2FURYWIL[\u0017KYP_]XT\u001f]g.)/ ", (short) (C1580rY.Xd() ^ (-6159))));
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, Wg.vd("10&.a^`^i^h\\igDfa^h)mu#8olnjz", (short) (C1607wl.Xd() ^ 18822)));
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        short sXd = (short) (FB.Xd() ^ 28374);
        short sXd2 = (short) (FB.Xd() ^ 20082);
        int[] iArr = new int["|\t}\u000b\u0007\u007fyBv\u0002\u007f\u0005t|\u0002:Nyw|l~y".length()];
        QB qb = new QB("|\t}\u000b\u0007\u007fyBv\u0002\u007f\u0005t|\u0002:Nyw|l~y");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(((sXd + i4) + xuXd.CK(iKK)) - sXd2);
            i4++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i4)).getMethod(hg.Vd("fcqN`mhmiYZg", (short) (C1580rY.Xd() ^ (-32475)), (short) (C1580rY.Xd() ^ (-14741))), new Class[0]);
        try {
            method.setAccessible(true);
            int[] intArray = ((Resources) method.invoke(context, objArr)).getIntArray(i2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return intArray;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final boolean booleanResource(int i2, Composer composer, int i3) throws Throwable {
        ComposerKt.sourceInformationMarkerStart(composer, -432394447, Xg.qd("@&aopnhesXl{x\u007f}or7ECQCKKLbNRi\r\u0005\n\u0007\u0013\t\u0017\u0007t\t\u0018\u0015\u001c\u001a\f\u000f\u001eY\u000e\u001c\u0013\" \u001b\u0017a *Y\u001b\u001c-#\u001fs", (short) (C1607wl.Xd() ^ 29918), (short) (C1607wl.Xd() ^ 21532)));
        if (ComposerKt.isTraceInProgress()) {
            short sXd = (short) (Od.Xd() ^ (-18223));
            short sXd2 = (short) (Od.Xd() ^ (-9170));
            int[] iArr = new int["?9RWv_\u000e\tr\u00076+P>uNK2\t\u0004+MN1X\u0005i\u0019x $,6o\u0002z\u001fz5R\u0012%]GrY\u001dt9\u0013\u0016\\O{t\u0019|-\u001e\u007f\u0016S<qa\ngX:2+\u000e<\"".length()];
            QB qb = new QB("?9RWv_\u000e\tr\u00076+P>uNK2\t\u0004+MN1X\u0005i\u0019x $,6o\u0002z\u001fz5R\u0012%]GrY\u001dt9\u0013\u0016\\O{t\u0019|-\u001e\u007f\u0016S<qa\ngX:2+\u000e<\"");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(xuXd.CK(iKK) - ((i4 * sXd2) ^ sXd));
                i4++;
            }
            ComposerKt.traceEventStart(-432394447, i3, -1, new String(iArr, 0, i4));
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, ZO.xd("\u0007V!\u0004\u0004K;\u0015d;\b\u0019\be\\\u0001)Y.\f\nB!\u001d\u001bK3\t\u001d", (short) (ZN.Xd() ^ 3371), (short) (ZN.Xd() ^ 26171)));
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("FPtL'8Bi9\u0019[\u000bJ~Lx\tTCn%+\u0004", (short) (C1607wl.Xd() ^ 1918), (short) (C1607wl.Xd() ^ 29007))).getMethod(Ig.wd("o@][\u001fO76Stx)", (short) (C1633zX.Xd() ^ (-26550))), new Class[0]);
        try {
            method.setAccessible(true);
            boolean z2 = ((Resources) method.invoke(context, objArr)).getBoolean(i2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return z2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final float dimensionResource(int i2, Composer composer, int i3) throws Throwable {
        ComposerKt.sourceInformationMarkerStart(composer, 804324951, EO.Od("v\u0001q\u0018vL3\u0002SVUY<Vh\u000e0%`\u000eW\u007f*\"L\n%r\u0002\ncB%{\\,\u0007\u007f\fz\u0017\u0014YQyrnA\u007fO\u001dgyBm=;-\u0012U|W\u0002^3w\u007f\u0004)],b\u0013d_c", (short) (C1607wl.Xd() ^ 22987)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(804324951, i3, -1, C1561oA.Qd("}\n~\f\b\u0001z\u000eBv\u0002~\u0001~\u0002r:\u0001s7zly3hlofnrgljM_lglhXY\u0013\u001aAbX[V`T`N:LYTYUEFS\r?K@MIB<\u0005AI\u000e\n\u0007y", (short) (ZN.Xd() ^ 7340)));
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        String strZd = C1593ug.zd("jkcm\u001b\u001a\u001e\u001e#\u001a&\u001c##\u0002&\u001b\u001a&h'1`w)(,*4", (short) (ZN.Xd() ^ 8753), (short) (ZN.Xd() ^ 5928));
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, strZd);
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, strZd);
        Object objConsume2 = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) objConsume2;
        short sXd = (short) (Od.Xd() ^ (-30696));
        int[] iArr = new int["UaVc_XR\u001bOZX]MUZ\u0013'RPUEWR".length()];
        QB qb = new QB("UaVc_XR\u001bOZX]MUZ\u0013'RPUEWR");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(sXd + sXd + i4 + xuXd.CK(iKK));
            i4++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i4)).getMethod(C1561oA.Kd("HGW6JYV][MP_", (short) (C1633zX.Xd() ^ (-1758))), new Class[0]);
        try {
            method.setAccessible(true);
            float fM6638constructorimpl = Dp.m6638constructorimpl(((Resources) method.invoke(context, objArr)).getDimension(i2) / density.getDensity());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return fM6638constructorimpl;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
