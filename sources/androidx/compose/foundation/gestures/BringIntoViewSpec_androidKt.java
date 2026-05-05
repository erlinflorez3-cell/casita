package androidx.compose.foundation.gestures;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.FirebaseError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okio.Utf8;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
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
/* JADX INFO: compiled from: BringIntoViewSpec.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bDZc|\u0004G\rP+<Ȑ\u0017(<\u0014\b\u0007\u0015jg/z+\u001f\u0094Tޚ.\u001bsڔD&a%\u007fESW \u00010\roful\u0007J\t\u000b\u001aƥ\bȀ|v4կezc\u0018\u001d4ZqE:[w\u07b2=i"}, d2 = {"\u001anR._\tKW\"\u0001^g;\u0007y3e\u0012\u0016\u0007@~", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u000169Xy\u001d>ms8UNEy8-\u0019rj \u0011a(UL", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w*P?t6\u0002\u001ewk*\u000bc><\u0002'E\"", "5dc\u0019b*:Zu\f~g.`\u0012>op,{Rn\"\u0017E.\nE\u007f/DU\r$Av$", "u(E", "5dc\u0019b*:Zu\f~g.`\u0012>op,{Rn\"\u0017E", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006a2?j\u0002\u001f3j\u001d.+MCv>,\u0019weC\u0010J6Lr.\u001d", "\u001ehe<g\tKW\"\u0001^g;\u0007y3e\u0012\u0016\u0007@~", "5dc\u001d\\=Hbu\f~g.`\u0012>op,{Rn\"\u0017E.\nE\u007f/DU\r$Av$", "5dc\u001d\\=Hbu\f~g.`\u0012>op,{Rn\"\u0017E", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~[}.F}#.[\r\u0018x8'\u0017LjH\u0011T0N\t\u0015RLL\u0002", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BringIntoViewSpec_androidKt {
    private static final ProvidableCompositionLocal<BringIntoViewSpec> LocalBringIntoViewSpec = CompositionLocalKt.compositionLocalWithComputedDefaultOf(new Function1<CompositionLocalAccessorScope, BringIntoViewSpec>() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt$LocalBringIntoViewSpec$1
        @Override // kotlin.jvm.functions.Function1
        public final BringIntoViewSpec invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) throws Throwable {
            Context context = (Context) compositionLocalAccessorScope.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalContext());
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("vG\u000fY1<0/\u0014X8u\u00151\u001e\u0006y\u0001\u0010EH\u0019:", (short) (C1499aX.Xd() ^ (-4280)), (short) (C1499aX.Xd() ^ (-21665)))).getMethod(C1626yg.Ud("l^1A]X\u0002xY\u000b\u0019=(E.J[", (short) (Od.Xd() ^ (-21092)), (short) (Od.Xd() ^ (-30676))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                String strWd = Ig.wd("<wkRN#:\u0014&n\u000f7kct\u0001\u0005Iy>\t 97|", (short) (C1607wl.Xd() ^ FirebaseError.ERROR_INVALID_CREDENTIAL));
                Class<?> cls = Class.forName(EO.Od("L/hQIg\t|dO&T\u0014\u0011\u0005fmVamA\u000e>2:^j/`g\u00148W", (short) (FB.Xd() ^ 8216)));
                Class<?>[] clsArr = {Class.forName(C1561oA.Qd("\u0017\r!\u000bV\u0014\b\u0014\fQu\u0016\u0013\t\r\u0005", (short) (C1580rY.Xd() ^ (-18968))))};
                Object[] objArr2 = {strWd};
                short sXd = (short) (OY.Xd() ^ Utf8.MASK_2BYTES);
                short sXd2 = (short) (OY.Xd() ^ 534);
                int[] iArr = new int["sm\u0001a\t\u0004\u0006w\u0001Zzw\f\u000e\f\u007f".length()];
                QB qb = new QB("sm\u0001a\t\u0004\u0006w\u0001Zzw\f\u000e\f\u007f");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                    i2++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method2.setAccessible(true);
                    return !((Boolean) method2.invoke(packageManager, objArr2)).booleanValue() ? BringIntoViewSpec.Companion.getDefaultBringIntoViewSpec$foundation_release() : BringIntoViewSpec_androidKt.getPivotBringIntoViewSpec();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    });
    private static final BringIntoViewSpec PivotBringIntoViewSpec = new BringIntoViewSpec() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt$PivotBringIntoViewSpec$1
        private final float childFraction;
        private final float parentFraction = 0.3f;
        private final AnimationSpec<Float> scrollAnimationSpec = AnimationSpecKt.tween$default(125, 0, new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f), 2, null);

        public final float getParentFraction() {
            return this.parentFraction;
        }

        public final float getChildFraction() {
            return this.childFraction;
        }

        @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
        public AnimationSpec<Float> getScrollAnimationSpec() {
            return this.scrollAnimationSpec;
        }

        @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
        public float calculateScrollDistance(float f2, float f3, float f4) {
            float fAbs = Math.abs((f3 + f2) - f2);
            boolean z2 = fAbs <= f4;
            float f5 = (this.parentFraction * f4) - (this.childFraction * fAbs);
            float f6 = f4 - f5;
            if (z2 && f6 < fAbs) {
                f5 = f4 - fAbs;
            }
            return f2 - f5;
        }
    };

    public static /* synthetic */ void getLocalBringIntoViewSpec$annotations() {
    }

    public static /* synthetic */ void getPivotBringIntoViewSpec$annotations() {
    }

    public static final ProvidableCompositionLocal<BringIntoViewSpec> getLocalBringIntoViewSpec() {
        return LocalBringIntoViewSpec;
    }

    public static final BringIntoViewSpec getPivotBringIntoViewSpec() {
        return PivotBringIntoViewSpec;
    }
}
