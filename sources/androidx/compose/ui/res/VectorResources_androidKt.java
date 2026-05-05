package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.compat.AndroidVectorParser;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import org.xmlpull.v1.XmlPullParserException;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.Wg;

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
/* JADX INFO: compiled from: VectorResources.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!4i\bӵLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0RkP\u008cZS@\u000fs{J$c$wES\u0004(Ԃ:\t}M\u0018stJh\u000b[\u0015\u001c\u0015'k|I\u0004z\u000e\u0016\u001d5Zom5}sK=xtd\nP60>\u0012\u0005/!pϺ(\u001f\tKc\f@9hph\\=Y\u000b\u001a \u0006V&\u0017\u001d\u000bh\u001f6vn\u000e>=&\u001bipPWc>\be\rt[?&\u0005i6+n@]\u0015S]3\rXZM\u000fWqk\f/,ݳ/I\u0002d͕\\\u000e"}, d2 = {":nP1I,<b#\fg^:\u0007\u0019<c\u007f\f\u0005I\u0001$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000e\u0017%\u0011S\u00168x%&Y{/Azs*KF;*\u0018&\u0011ja*\u0007a;X\u0004\u0007P[[@2", "BgT:X", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3sH\u0001 ?mk", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3\u000b", "@db", ">`a@X9", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\ns\u001f\u001e4o\u001cF\u000723Yh\u001cD{\u0016;#", "1gP;Z0GUv\t\u0004_0~\u0019<a\u000f,\u0006I\u000f", "", "DdRAb9+S'\t\u000bk*|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0012U?=k%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0012U?=k%\u001e\u0013wkFEA6V\u0002#PPX52", "@db\u0016W", "7c", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~j}\u001eFw#w1K7m4\u000f\u0015fpC\u0014\"\nX~2CUR6e(V$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buV\u0012Dw\u0005\u0014\u0016W\u0013txM`\u001eG\u0007jY\u0005\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;\u001b(d[1\u000eyaZ\u0004RwvqTb^@ @mLFC~_IJ", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VectorResources_androidKt {
    public static final ImageVector vectorResource(ImageVector.Companion companion, int i2, Composer composer, int i3) throws Throwable {
        ComposerKt.sourceInformationMarkerStart(composer, 44534090, C1593ug.zd("\u0014yI98JFJ+?NKRPBE\n\u0016\u001b$\u0016\u001f\u001d\u001f5!\u0017 &. ))+?%&\",*9,+00J80;XhgyuyZn}z\u0002\u007fqt\u0004?s\u0002x\b\u0006\u0001|G\u0006\u0010?\u0001\u0002\u0013\t\u0005Y", (short) (C1633zX.Xd() ^ (-5201)), (short) (C1633zX.Xd() ^ (-15104))));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(44534090, i3, -1, C1561oA.od("IUJWSLFY\u000eBMJLJM>\u0006L?\u0003F8E~F41A;=\u001c.;6;7'(ah\u0016$!1+-\f\u001e+&+'\u0017\u0018%^\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u0013\u001b_XZK", (short) (C1633zX.Xd() ^ (-3587))));
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, C1561oA.Kd("\u001a\u001b\u0013\u001dJIMMRIUKRR1UJIU\u0018V`\u0010'XW[Yc", (short) (C1580rY.Xd() ^ (-7059))));
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        Resources resources = Resources_androidKt.resources(composer, 0);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("l#6m(IaTGx\u001bNx\u001fN3}Ko'G\u0004-", (short) (Od.Xd() ^ (-5843)), (short) (Od.Xd() ^ (-8881)))).getMethod(C1561oA.Xd("\u001d\u001c,\r\" )\"", (short) (FB.Xd() ^ 8358)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources.Theme theme = (Resources.Theme) method.invoke(context, objArr);
            Object configuration = resources.getConfiguration();
            ComposerKt.sourceInformationMarkerStart(composer, -1769560526, Wg.vd("=> k[dYbTXb\u001a(EQP~zz[kzsztfet,`jaLJA=\u0004BHw\u000b<7;5?", (short) (Od.Xd() ^ (-20924))));
            boolean zChanged = composer.changed(resources) | ((((112 & i3) ^ 48) > 32 && composer.changed(i2)) || (i3 + 48) - (i3 | 48) == 32) | composer.changed(theme) | composer.changed(configuration);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = vectorResource(companion, theme, resources, i2);
                composer.updateRememberedValue(objRememberedValue);
            }
            ImageVector imageVector = (ImageVector) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return imageVector;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ ImageVector vectorResource$default(ImageVector.Companion companion, Resources.Theme theme, Resources resources, int i2, int i3, Object obj) throws XmlPullParserException {
        if ((i3 & 1) != 0) {
            theme = null;
        }
        return vectorResource(companion, theme, resources, i2);
    }

    public static final ImageVector vectorResource(ImageVector.Companion companion, Resources.Theme theme, Resources resources, int i2) throws XmlPullParserException, IOException {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i2, typedValue, true);
        XmlResourceParser xml = resources.getXml(i2);
        XmlVectorParser_androidKt.seekToStartTag(xml);
        Unit unit = Unit.INSTANCE;
        return loadVectorResourceInner(theme, resources, xml, typedValue.changingConfigurations).getImageVector();
    }

    public static /* synthetic */ ImageVectorCache.ImageVectorEntry loadVectorResourceInner$default(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i2, int i3, Object obj) throws XmlPullParserException {
        if ((i3 + 1) - (i3 | 1) != 0) {
            theme = null;
        }
        return loadVectorResourceInner(theme, resources, xmlResourceParser, i2);
    }

    public static final ImageVectorCache.ImageVectorEntry loadVectorResourceInner(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i2) throws XmlPullParserException {
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser2);
        int currentVectorNode = 0;
        AndroidVectorParser androidVectorParser = new AndroidVectorParser(xmlResourceParser2, 0, 2, null);
        ImageVector.Builder builderCreateVectorImageBuilder = XmlVectorParser_androidKt.createVectorImageBuilder(androidVectorParser, resources, theme, attributeSetAsAttributeSet);
        while (!XmlVectorParser_androidKt.isAtEnd(xmlResourceParser2)) {
            currentVectorNode = XmlVectorParser_androidKt.parseCurrentVectorNode(androidVectorParser, resources, attributeSetAsAttributeSet, theme, builderCreateVectorImageBuilder, currentVectorNode);
            xmlResourceParser.next();
        }
        return new ImageVectorCache.ImageVectorEntry(builderCreateVectorImageBuilder.build(), i2);
    }
}
