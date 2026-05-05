package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

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
/* JADX INFO: compiled from: ImageResources.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d̉=!4i\bDZc|İI\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007ljQJR͜`.\u0001RR\u000f\u001a{d(i%\nCiWJ\u0004(\b]Q\u007fg\u001dNr$QƤ\u001e\u0016'iTI\u0004x\u000e\u0018\u00151PrW3{s\u0004>žx6\u0013%ݮ&>"}, d2 = {"7lP4X\u0019>a#\u000f\b\\,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?F*\u0012(\u001ds]B\u000bm5$", "@db", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3\u000b", "7c", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7vr{\u001fpl5\u0010g6WL\u000b.HW+i\\v<'[X\u0018V6\u0017\u0013Y\u000b1~MF#\u0010,\u0013_Ep\f\u0016$\u000eB@T\u0006=\fPx\"\u007fE({\u0010Wi\u0002RKSbst\u0010)\u001fi6E'\u0018o'dLX*\f{0\u0015\u0002Zur=", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ImageResources_androidKt {
    public static final ImageBitmap imageResource(ImageBitmap.Companion companion, Resources resources, int i2) {
        Drawable drawable = resources.getDrawable(i2, null);
        Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable) drawable).getBitmap());
    }

    public static final ImageBitmap imageResource(ImageBitmap.Companion companion, int i2, Composer composer, int i3) throws Throwable {
        ComposerKt.sourceInformationMarkerStart(composer, -304919470, C1561oA.ud("D(hk^c`L^kfkgWX\u001b&#/ \u001d !6 \u0014\u001c\u001a%\u0016\u0013\u0019\u0011,\u0011\u0013\t\u0011\u0012\u001a\u000b\n\n\u000e!\t\u0007\f\u001a=052\u001e0=8=9)*7p#/$1-& h%-Z\u001a\u0019(\u001c\u0016h", (short) (C1499aX.Xd() ^ (-26994))));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304919470, i3, -1, C1561oA.yd("AOFUKFBW\u0006<IHDDI<}F;\u0001>2A|16+2)\u0017+:ovtfa\u001d&HeZa`FZifecUX_\u001bO]L[YTH\u0013Q[ZVTL", (short) (ZN.Xd() ^ 8044)));
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        short sXd = (short) (FB.Xd() ^ 17895);
        int[] iArr = new int["BC;Erquuzq}szzY}rq}@~\t8O\u0001\u007f\u0004\u0002\f".length()];
        QB qb = new QB("BC;Erquuzq}szzY}rq}@~\t8O\u0001\u007f\u0004\u0002\f");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i4));
            i4++;
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, new String(iArr, 0, i4));
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        String strQd = Xg.qd("+,\u0012]QZS\\RVd\u001c.>cX_^L`olsqcfu1esjywrn9w\u00021Hyx|z\u0005", (short) (C1633zX.Xd() ^ (-26572)), (short) (C1633zX.Xd() ^ (-13902)));
        ComposerKt.sourceInformationMarkerStart(composer, 552189435, strQd);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new TypedValue();
            composer.updateRememberedValue(objRememberedValue);
        }
        TypedValue typedValue = (TypedValue) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        Class<?> cls = Class.forName(Jg.Wd("\bOg\u007f\u001fSQE|Cdu\rPX<T;\\l\u007fML", (short) (Od.Xd() ^ (-29535)), (short) (Od.Xd() ^ (-19901))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1499aX.Xd() ^ (-29496));
        short sXd3 = (short) (C1499aX.Xd() ^ (-1657));
        int[] iArr2 = new int["4.>-%^),[[o\u0007".length()];
        QB qb2 = new QB("4.>-%^),[[o\u0007");
        int i5 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd3) + sXd2)));
            i5++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i5), clsArr);
        try {
            method.setAccessible(true);
            ((Resources) method.invoke(context, objArr)).getValue(i2, typedValue, true);
            CharSequence charSequence = typedValue.string;
            Intrinsics.checkNotNull(charSequence);
            String string = charSequence.toString();
            ComposerKt.sourceInformationMarkerStart(composer, 552194840, strQd);
            boolean zChanged = composer.changed(string);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1626yg.Ud("!Q_+\u0015\fK>^\u007fj,\u001eWn\u0001\u0019,m7\u0013`b", (short) (FB.Xd() ^ 1663), (short) (FB.Xd() ^ 2159))).getMethod(Ig.wd("\u0002;:r\u0004l\u0007\u001bdGM{", (short) (OY.Xd() ^ 14815)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    objRememberedValue2 = imageResource(companion, (Resources) method2.invoke(context, objArr2), i2);
                    composer.updateRememberedValue(objRememberedValue2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            ImageBitmap imageBitmap = (ImageBitmap) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return imageBitmap;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
