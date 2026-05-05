package androidx.compose.material3.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.os.ConfigurationCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.Qg;
import yg.Wg;
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
/* JADX INFO: compiled from: Strings.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d̉=!,u\bӵLc\u000b\u0004I\u00066\f6B\r14\u0012\u0006јnj?1\\}V\u008cjSX\u000e\u001c\u007fB$s$ D\u0002Tܵ|̝\u07beSPmi|Mr7QƤ\u001e\u0016'i\\Mcxu\u0012=3r\u007fM7ewM=fsF\u0005N8P=\u001a\u0005/ pGȮuٙŲO\u000e\u00187NxðR\u0012U\b ũ\"l\u001fӞ\"e"}, d2 = {"5dc g9B\\\u001b", "", "Asa6a.", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u001c\\P?t6,j", "5dc g9B\\\u001bFG>\u0017H\u0014\"o", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zk\u0012\u0011*@gE\u001a^o]B\t-\u001a]\u0004+PN$", "4na:T;\u001a`\u001b\r", "", "", "5dc g9B\\\u001bF\u0007;1\f\u001b\"w", "uHJ\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016g\u0013 F|\u0018@u8~W\b(Bw$.\u0017PKtC\"\u001dh+\u0017\u0011k7X\u0005'T\"2oCWnN\u0010[a\nW-VrhN(wF\r", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Strings_androidKt {
    /* JADX INFO: renamed from: getString-2EP1pXo */
    public static final String m2993getString2EP1pXo(int i2, Composer composer, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -907677715, C1561oA.Xd("T:zy\ni\f\u000b\u0003\t\u0003EmFOZ\u0005E\u0011\u0006\u001a\f\u001a\u0012\u000b\u0017^Z\u0017\u001d$\u0016$!\u0015!c\n,+#)#0fqp\u0001rsyu\u0012}s{{\u000b|~}\u0001\u001c\b\f&HG?E?L\b<JAPNIE\u0010NX\bSXI]PV", (short) (C1633zX.Xd() ^ (-12372))));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-907677715, i3, -1, Wg.vd("DPERVOI\\\t=HEOMPA\u0001?2D<H>57|v1=B2>1#-m.+9\u0017/,\"&&]d\u000f'$\u001a\u001e\u001e)b\u0015\u0019\u000e\u001b\u0017\u0018\u0012Z\u0017\u0018\\TPP", (short) (C1580rY.Xd() ^ (-32731))));
        }
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        String strKd = Qg.kd("32(0[XZX[PZNSQ.PC@J\u000bGO|\u0012A>@<D", (short) (C1499aX.Xd() ^ (-30825)), (short) (C1499aX.Xd() ^ (-8201)));
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, strKd);
        composer.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, strKd);
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("eqfsohb+_jhm]ej#7b`eUgb", (short) (C1499aX.Xd() ^ (-9605)), (short) (C1499aX.Xd() ^ (-29607)))).getMethod(C1561oA.ud("\n\u0007\u0015q\u0004\u0011\f\u0011\r|}\u000b", (short) (ZN.Xd() ^ 17684)), new Class[0]);
        try {
            method.setAccessible(true);
            String string = ((Resources) method.invoke(context, objArr)).getString(i2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return string;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: renamed from: getString-qBjtwXw */
    public static final String m2994getStringqBjtwXw(int i2, Object[] objArr, Composer composer, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -1427268608, "C(getString)P(1:c#material3.internal.Strings)39@1395L17,41@1488L7:Strings.android.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1427268608, i3, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:38)");
        }
        String strM2993getString2EP1pXo = m2993getString2EP1pXo(i2, composer, (i3 + 14) - (i3 | 14));
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Locale locale = ConfigurationCompat.getLocales((Configuration) objConsume).get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str = String.format(locale, strM2993getString2EP1pXo, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return str;
    }
}
