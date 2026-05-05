package com.braze.ui.feed;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageSwitcher;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Od;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeN5hݷZ\u000f\u001azt9k(\u007fCSUH~2\u000f]P\u007fi\u0005I\t\u000eß\u0013\u0006$|;RW\\\u0011_(\u000e`H EAR\b?O_#<Ce\tĹDѩ\t\r\"ݒ`\u0012|\u0003QT,\u00146J~E#3[\u00112\u0014\u001c=N\u0007NbuSNJ\u0003\\h5aH@İZϮc<\u0005ձ%HZ4\u001b\u007f\u0002 1NE@տ)b"}, d2 = {"\u001ab^:\")KO.~Dn0F\n/e~qXM|,\u0017+w\n>v\u0013G]\r\u001e:m#\u0004", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@n)\u001bVm\u0011<\u0004z", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/sc?f", "\u001a`]1e6BRb\u000f\nb3Fd>t\r,xP\u0010\u0017\u0005G~c", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001}%2T\r\u0017zC+\u0019eqH\u0007Q,]Lj8", "\nrTA \u0006\u0017", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", "@dP1<*H\\", "5dc\u001fX(=7\u0017\t\u0004", "u(;.a+K]\u001d}D`9x\u00142i}6E?\u000e\u0013)Cl\u0015<@\u0004BU\u0010\u001c4t\u0016\u0004", "Adc\u001fX(=7\u0017\t\u0004", "uKP;W9HW\u0018H|k(\b\f3c\u000eqzM|)\u0013Dv\u000e\u0006U21ky\u001d>mkq>", "CmA2T+\"Q#\b", "5dc\"a\u0019>O\u0018bxh5", "Adc\"a\u0019>O\u0018bxh5", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BrazeImageSwitcher extends ImageSwitcher {
    private Drawable readIcon;
    private Drawable unReadIcon;

    /* JADX INFO: renamed from: com.braze.ui.feed.BrazeImageSwitcher$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Error while checking for custom drawable.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeImageSwitcher(Context context, AttributeSet attributeSet) throws Throwable {
        Drawable drawable;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, C1561oA.Qd("t\u007f}\u0003r\u0005\u007f", (short) (C1607wl.Xd() ^ 5275)));
        try {
            int[] iArr = R.styleable.com_braze_ui_feed_BrazeImageSwitcher;
            Class<?> cls = Class.forName(C1593ug.zd("q\u007fv\u0006\u0004~zE{\t\t\u0010\u0002\f\u0013Mc\u0011\u0011\u0018\n\u001e\u001b", (short) (C1499aX.Xd() ^ (-31651)), (short) (C1499aX.Xd() ^ (-5715))));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.od("p|q~zsm6|znp1Cutqg_qo_L]k", (short) (FB.Xd() ^ 16039)));
            clsArr[1] = int[].class;
            Object[] objArr = {attributeSet, iArr};
            short sXd = (short) (C1580rY.Xd() ^ (-11876));
            int[] iArr2 = new int["UI\\JSY?ag[UU3ghg_Ymm_n".length()];
            QB qb = new QB("UI\\JSY?ag[UU3ghg_Ymm_n");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr2[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                Intrinsics.checkNotNullExpressionValue(typedArray, Wg.Zd("\u0011\u0003ZN\u000e\u0003KN~W2-\u0014*|x;\u0013eO}\u0012\u001fkዃ'9\u0006b3\u0019]\u0007[O\u0018X^\u001d4\u001cl^\\E\u0007yS\u001a3", (short) (Od.Xd() ^ (-14466)), (short) (Od.Xd() ^ (-15082))));
                int indexCount = typedArray.getIndexCount();
                for (int i3 = 0; i3 < indexCount; i3++) {
                    int index = typedArray.getIndex(i3);
                    if (index == R.styleable.com_braze_ui_feed_BrazeImageSwitcher_brazeFeedCustomReadIcon) {
                        Drawable drawable2 = typedArray.getDrawable(index);
                        if (drawable2 != null) {
                            this.readIcon = drawable2;
                        }
                    } else if (typedArray.getIndex(i3) == R.styleable.com_braze_ui_feed_BrazeImageSwitcher_brazeFeedCustomUnReadIcon && (drawable = typedArray.getDrawable(index)) != null) {
                        this.unReadIcon = drawable;
                    }
                }
                typedArray.recycle();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e3, false, (Function0) AnonymousClass1.INSTANCE, 4, (Object) null);
        }
    }

    public final Drawable getReadIcon() {
        return this.readIcon;
    }

    public final Drawable getUnReadIcon() {
        return this.unReadIcon;
    }

    public final void setReadIcon(Drawable drawable) {
        this.readIcon = drawable;
    }

    public final void setUnReadIcon(Drawable drawable) {
        this.unReadIcon = drawable;
    }
}
