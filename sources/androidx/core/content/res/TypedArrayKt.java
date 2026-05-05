package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: compiled from: TypedArray.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d̉=!,i\bDZc|İI\u0006>\u00116Ȑ\u0007\":\u001b\u007f\u0007ljA0ZeP\u008cZS8\u0014s{:%c$\bCCU }*\teNogtLb\u000bQ\u001b\u000eǝ\u0001j:X]xk\u001d\u00172HrG3coE9ftN\u0019.݅:8(\u0004)\u001aXH@|\u0001BY\r*0nr\u0001R%_\u0013\u001d*\u0006l$)\u001e\u000bg~<Nkk;G#1kZb5dH|{\u000fnTU\r'g$*N8M\u0015SUI\fjmM\tWqk\f\u0011'U+yy]5f\u0001,\u0015YQ%o\u0001.t\u0005\u007fi4'YO\u0014QV\r6x\u0013{;>\u001c\"\u00141`.[\u001c\u000f\b<3%xY?^\u0003vB.|(;/9\u000e>C9Ihyai\u0019~=\u0002\u0004\u001b\u001f;\u0001\u001d#\"Y&r#'lw\u007f>y@kH~\u0010_<{\u0005\tb0,\u001cBU\u000eG{?7?%e[i)'j\u0010I\\g%\u0007x|axjHn2\u0017\u0016e*9\u0012`Cr\u0006\u0004P\u0003Zr\u0016e.b\u0018\u0016\bA\"\u0005wj!U\u0016TNvj\u0003M\f\f=AtIqn\u001a\u0010\u007f9\r3eWi\u000foS\u000f\u0014m>z\u0019fyZS:\\\u0005(P2xp\u0016v\nEf\fA4\u0006v4F:E1\\C]+\u001epA-\u000feYv\u0011\u0017Ta&\u001b\u00072\u000b!\u0007`^\u0001o\u0016\u0011wC%`P-qW;\u00184V:hb~ɠ\u000b~\u0002\u0019_yZadlD\u000e}{N\u0016J?W.K\u0014'~W4\u001aWSg\u000be\u0018i2)\u0001۠\b+ch\\g8z~IxvZQd\u0017Pvnt3\b+\u001c(\u007f\rڰMϭX\u000bi]ϝv#"}, d2 = {"1gT0^\bMb&\u0003wn;|", "", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\no+\"GniI\u0004!I/", "7mS2k", "", "5dc\u000fb6ES\u0015\bdk\u001b\u007f\u00169w", "", "5dc\u0010b3H`\u0003\fia9\u0007\u001b", "5dc\u0010b3H`\u0007\u000evm,c\r=ti5jC\u000e!)", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n^!\u001eQ|{Kr45@\u0002.FC", "5dc\u0011\\4>\\'\u0003\u0005g\u0016\nw2r\n:", "", "5dc\u0011\\4>\\'\u0003\u0005g\u0017\u0001\u001c/li)|N\u0001&\u0001T^\u0011I\u00017", "5dc\u0011\\4>\\'\u0003\u0005g\u0017\u0001\u001c/lm,\u0011@j$\u0006J|\u0018N", "5dc\u0011e(PO\u0016\u0006zH9k\f<o\u0012", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", "5dc\u0013_6:b\u0003\fia9\u0007\u001b", "5dc\u0013b5M=&m}k6\u000f", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0017\u0010K\u0001\u0018\u0013Eoc", "5dc\u0016a;(`\b\u0002\bh>", "5dc\u0016a;>U\u0019\fdk\u001b\u007f\u00169w", "5dc\u001fX:Hc&|zB+f\u0016\u001eh\r2\u000e", "5dc g9B\\\u001bh\bM/\n\u0013A", "", "5dc!X?M/&\fvr\u0016\nw2r\n:", "", "", "uKP;W9HW\u0018Hxh5\f\t8tI5{NJ\u0006+Ro\r\u0018\u000421mS\u0004zc|3IT75;\u001a\u001ej+\u0017\n_9<v3WLW*\\(", "5dc!X?M=&m}k6\u000f", "CrT", Global.BLANK, "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKP;W9HW\u0018Hxh5\f\t8tI5{NJ\u0006+Ro\r\u0018\u000421mS\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d]0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TypedArrayKt {
    private static final void checkAttribute(TypedArray typedArray, int i2) {
        if (!typedArray.hasValue(i2)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean getBooleanOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getBoolean(i2, false);
    }

    public static final int getColorOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getColor(i2, 0);
    }

    public static final ColorStateList getColorStateListOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        ColorStateList colorStateList = typedArray.getColorStateList(i2);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    public static final float getDimensionOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getDimension(i2, 0.0f);
    }

    public static final int getDimensionPixelOffsetOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getDimensionPixelOffset(i2, 0);
    }

    public static final int getDimensionPixelSizeOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getDimensionPixelSize(i2, 0);
    }

    public static final Drawable getDrawableOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        Drawable drawable = typedArray.getDrawable(i2);
        Intrinsics.checkNotNull(drawable);
        return drawable;
    }

    public static final float getFloatOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getFloat(i2, 0.0f);
    }

    public static final Typeface getFontOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return TypedArrayApi26ImplKt.getFont(typedArray, i2);
    }

    public static final int getIntOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getInt(i2, 0);
    }

    public static final int getIntegerOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getInteger(i2, 0);
    }

    public static final int getResourceIdOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getResourceId(i2, 0);
    }

    public static final String getStringOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        String string = typedArray.getString(i2);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
    }

    public static final CharSequence getTextOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        CharSequence text = typedArray.getText(i2);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.".toString());
    }

    public static final CharSequence[] getTextArrayOrThrow(TypedArray typedArray, int i2) {
        checkAttribute(typedArray, i2);
        return typedArray.getTextArray(i2);
    }

    public static final <R> R use(TypedArray typedArray, Function1<? super TypedArray, ? extends R> function1) {
        R rInvoke = function1.invoke(typedArray);
        typedArray.recycle();
        return rInvoke;
    }
}
