package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParserException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
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
/* JADX INFO: compiled from: PainterResources.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d̉=!,u\bӵLc\u000b\u0004Iي8\u000b<M\u0007Ӭ4\u0012\u000e\u0007nʑA0RkP\u008cZS@\u000fsڔ<$q$yCAV\"}8\tWNmg\u0007hh\u000b[\u000f4\u0017)n:Kmx\f\u0015?6PsW3{tm=nzN\u0005N9h8\u00124\u000f\"BH>\u007f+KY\u0016*4n{\u000bR;R5\u001e \nV /#\rk\\<`l\fA_'\u0011uZNUfv}֔\u0011Fb4%\fo,C@eDE+Y\u0002\u0015Xs?1F8Bݾl'5;i\u007fe̬p\u007fB\u0014\u0002̀_ǁv&dӤŒd\u001d"}, d2 = {"3qa<e\u0014>a'z|^", "", ":nP1<4:U\u0019[~m4x\u0014\u001ce\u000e2\fM~\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", ">`c5", "", "@db", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3\u000b", "7c", "", ":nP1I,<b#\fg^:\u0007\u0019<c\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0012U?=k%\u001e\u0013wkF\\", "BgT:X", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3sH\u0001 ?mk", "1gP;Z0GUv\t\u0004_0~\u0019<a\u000f,\u0006I\u000f", "uKP;W9HW\u0018Hxh5\f\t8tI5{NJ\u0004\u0017Uy\u001eIt%C\u0018l#7u\u0016\u00044?DjA(\u0019g+7\u0011l;N\u007f6\u0011YN:&?rK\u001e\"g\fN9bh=( wCD)\f+\\K9r\t\u0017 \u001c54}R_\u001fK\u0002\u0015?\u001f3pQcmyT\u0017)&\u0011`\u0015^*f>97]o##sZ<\nEc\u0015<T\u0007crJ\u001dxFmOmYUO|\u001f |#!Klw\u0010Ab\u0002\u0001", ">`X;g,K@\u0019\r\u0005n9z\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n@U\u0002)Fm#w8??tC\u001e\">", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zk\u0012\u0011*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001ctJ\u0010\u001d]\u0012L9V\u0010UE-}DDhr(M\u000bJh\u000ea", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PainterResources_androidKt {
    private static final String errorMessage = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP";

    public static final Painter painterResource(int i2, Composer composer, int i3) throws Throwable {
        BitmapPainter bitmapPainter;
        ComposerKt.sourceInformationMarkerStart(composer, 473971343, EO.Od("\u00043M#b$Jc+k|l\u0017'\\k2[@\u000fQ\f08A\u000f\u001caq\u001f>Nj\u000bT63P[bw\u00024M\u0015;Itzq\u0013u\u000e |\u001e-\u001bbxoD\u0004\u0016\n#o\u000ftwaV\u007fvcasWy\u00126M", (short) (FB.Xd() ^ 5466)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(473971343, i3, -1, C1561oA.Qd("NZO\\XQK^\u0013GROQORC\u000bQD\bK=J\u0004E5<@E5A 2?:?;+,el\u0014$+/4$0\u000f!.).*\u001a\u001b(a\u0014 \u0015\"\u001e\u0017\u0011Y\u0016\u001eb\\]N", (short) (C1499aX.Xd() ^ (-14606))));
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        String strZd = C1593ug.zd("\u0001\u0002y\u0004104490<299\u0018<10<~=Gv\u000e?>B@J", (short) (C1499aX.Xd() ^ (-32319)), (short) (C1499aX.Xd() ^ (-11350)));
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, strZd);
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, strZd);
        composer.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("/;0=92,t)427'/4l\u0001,*/\u001f1,", (short) (C1633zX.Xd() ^ (-17279)))).getMethod(C1561oA.Kd("VUeDXgdki[^m", (short) (Od.Xd() ^ (-28550))), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            ProvidableCompositionLocal<ResourceIdCache> localResourceIdCache = AndroidCompositionLocals_androidKt.getLocalResourceIdCache();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, strZd);
            Object objConsume2 = composer.consume(localResourceIdCache);
            ComposerKt.sourceInformationMarkerEnd(composer);
            TypedValue typedValueResolveResourcePath = ((ResourceIdCache) objConsume2).resolveResourcePath(resources, i2);
            CharSequence charSequence = typedValueResolveResourcePath.string;
            int i4 = 1;
            if (charSequence != null && StringsKt.endsWith$default(charSequence, (CharSequence) Wg.Zd("e@\u0016s", (short) (C1607wl.Xd() ^ 16309), (short) (C1607wl.Xd() ^ 19578)), false, 2, (Object) null)) {
                composer.startReplaceGroup(-803040357);
                ComposerKt.sourceInformation(composer, C1561oA.Xd("\u0019\u001d%\u0018 \u001b 6\"\u001e\u0019%\u001f0$\"$,A)+", (short) (OY.Xd() ^ 7773)));
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Wg.vd("0<5B:31y*57<(09q\"MOT@RQ", (short) (Od.Xd() ^ (-21657)))).getMethod(Qg.kd("C@N-@<C:", (short) (C1499aX.Xd() ^ (-138)), (short) (C1499aX.Xd() ^ (-15135))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    int i5 = i3 << 6;
                    VectorPainter vectorPainterRememberVectorPainter = VectorPainterKt.rememberVectorPainter(loadVectorResource((Resources.Theme) method2.invoke(context, objArr2), resources, i2, typedValueResolveResourcePath.changingConfigurations, composer, (i5 + 896) - (i5 | 896)), composer, 0);
                    composer.endReplaceGroup();
                    bitmapPainter = vectorPainterRememberVectorPainter;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else {
                composer.startReplaceGroup(-802884675);
                ComposerKt.sourceInformation(composer, hg.Vd(" \u001b'\u0019\u0016\u0017\u001b.\u001a\u0016", (short) (C1580rY.Xd() ^ (-27185)), (short) (C1580rY.Xd() ^ (-22866))));
                short sXd = (short) (FB.Xd() ^ 4160);
                int[] iArr = new int["myn{wpj3grpuemr+?jhm]oj".length()];
                QB qb = new QB("myn{wpj3grpuemr+?jhm]oj");
                int i6 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i6] = xuXd.fK(sXd + i6 + xuXd.CK(iKK));
                    i6++;
                }
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(new String(iArr, 0, i6)).getMethod(C1561oA.yd("-*<\u001b*&1(", (short) (C1499aX.Xd() ^ (-13455))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    Object obj = (Resources.Theme) method3.invoke(context, objArr3);
                    ComposerKt.sourceInformationMarkerStart(composer, -1411370574, C1561oA.Yd("lmS\u001f\u0013\u001c\u0015\u001e\u0014\u0018&]o\u0007\u0019\"(/!/\u0010$3075'*9t)7.=;62|;Et\f=<@>H", (short) (FB.Xd() ^ 14007)));
                    boolean zChanged = composer.changed(charSequence);
                    if (((((-1) - (((-1) - i3) | ((-1) - 14))) ^ 6) <= 4 || !composer.changed(i2)) && (i3 + 6) - (i3 | 6) != 4) {
                        i4 = 0;
                    }
                    int i7 = ((zChanged ? 1 : 0) + i4) - ((zChanged ? 1 : 0) & i4) != 1 ? 0 : 1;
                    boolean zChanged2 = composer.changed(obj);
                    boolean z2 = (i7 + (zChanged2 ? 1 : 0)) - (i7 & (zChanged2 ? 1 : 0)) == 1;
                    Object objRememberedValue = composer.rememberedValue();
                    if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = loadImageBitmapResource(charSequence, resources, i2);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    BitmapPainter bitmapPainter2 = new BitmapPainter((ImageBitmap) objRememberedValue, 0L, 0L, 6, null);
                    composer.endReplaceGroup();
                    bitmapPainter = bitmapPainter2;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return bitmapPainter;
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private static final ImageVector loadVectorResource(Resources.Theme theme, Resources resources, int i2, int i3, Composer composer, int i4) throws XmlPullParserException {
        ComposerKt.sourceInformationMarkerStart(composer, 21855625, "C(loadVectorResource)P(3,2,1)92@3720L7:PainterResources.android.kt#ccshc7");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21855625, i4, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:91)");
        }
        ProvidableCompositionLocal<ImageVectorCache> localImageVectorCache = AndroidCompositionLocals_androidKt.getLocalImageVectorCache();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localImageVectorCache);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ImageVectorCache imageVectorCache = (ImageVectorCache) objConsume;
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, i2);
        ImageVectorCache.ImageVectorEntry imageVectorEntryLoadVectorResourceInner = imageVectorCache.get(key);
        if (imageVectorEntryLoadVectorResourceInner == null) {
            XmlResourceParser xml = resources.getXml(i2);
            if (!Intrinsics.areEqual(XmlVectorParser_androidKt.seekToStartTag(xml).getName(), "vector")) {
                throw new IllegalArgumentException(errorMessage);
            }
            imageVectorEntryLoadVectorResourceInner = VectorResources_androidKt.loadVectorResourceInner(theme, resources, xml, i3);
            imageVectorCache.set(key, imageVectorEntryLoadVectorResourceInner);
        }
        ImageVector imageVector = imageVectorEntryLoadVectorResourceInner.getImageVector();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return imageVector;
    }

    private static final ImageBitmap loadImageBitmapResource(CharSequence charSequence, Resources resources, int i2) {
        try {
            return ImageResources_androidKt.imageResource(ImageBitmap.Companion, resources, i2);
        } catch (Exception e2) {
            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e2);
        }
    }
}
