package androidx.compose.ui.node;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\u0010nʑA0RkP.XV2\u000f\u0002{<$a$yCIh\"}(\u001cgdu˧\u0007J\t\ns\u0013\u0014\u0016\u0011jZJ\u0006|k\u0014'2pr\u00063eHK=xtd\nP60>\u0012\u0005/!ZL\u001e~\u0013Cy\u0013B4NyRR;T5\u001e \u0010V /%\rk\\A`l\f=_'\u0011uZNUl`\u0001[\u0011^TU\u001a'e,9X7c\u001cUW\u0011\u0016j[m\u0013\u0006qޮ\u0004ؒҊ+-O\u0005eHp\u001e\"(CO;^#*j\u0019i`:.[Sq`h\u000eV~+\u007f\u001bG\u001c\u000e4*\u000f.E8t\u001e&3#q\u0004D^\u0016vB.\u0002\u0012:%:\u00183Y@Kj_cS\u0019|:B˜%T1\u0018\u0007!\nS>d#3lw\u007f8\u0002DKaf\n\bD\u001e\b~|\u001a*27w\u0004=\u0017).E,g_G?9k0Mtk\u0005\"xh\u0002y\u0019̲Xz|\"O*7\u0011\u000bHr\u000b\u0004P\u0003_\\\u0015[$l\u0007,\u000fC$j\u0001T!S\u0017~Svs\u0003M\f\u0011U3tBqn\u001a\u0011\b=l?MQ\u0012\u001d\u0012V\u0005\u0018W<\u0011\u0012\tjPa$Z\u000b/R6Vy(w*T\u0015\fȇ1ŭۇ 62O'n-\u0019\u0011=ZA+\u000e\u0010^v\u0016\u0017Ta+3m2|!\u0001~c!su\u0002a,+gR1O[M\u0019T\\RlB\b;\u0007-v0KuX_L\u001b#&Y\n$.\u001ag^_A!\u001e\u0017)`\u0012sE˜qό˛Q\u0014-\u001b\u000b\u001b'UvP\u007f\b\u0019oT`\u0019Z\u007fX%E\u000f^!*8h\u000e\u001eyF)N*Tޯ[CQu\tʽX|7ٱ\tD"}, d2 = {"/o_9l\u000bBT\u001a", "", "2hP4b5:Z'", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9qE\u0006\u0013DU{&\r", "1`[9U(<Y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l@w&\u0013U\u0005'4i\u00144#", "0`R8j(KR", "", "=kS g(Kb", "", "=kS\u0012a+", "<df g(Kb", "<df\u0012a+", "1a", "4naDT9=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9k<\u007f45f}\u001f\u0013z#*a\u0019", ExifInterface.GPS_MEASUREMENT_2D, "AmP8X", "", "0`R8j(KR`M\u0002.&ie#", "uH8\u0016<\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0017Fu%~8\u0002!8K\u00125T@7i:s\u000bLW\u001djY\u0010\u0012k", "1`[0h3:b\u0019]~_-", "=kS \\A>", "<df \\A>", "3wT0h;>2\u001d\u007f{", "4h[9F5:Y\u0019", "AsP?g\u001f", "AsP?g ", "3mS%", "3mS&", "@de2e:>", "2`c.", "4naDT9=\u001bg\u0006JX\u0019Y|", ";hS\u001db0Gb", ";hS\u001db0Gb`\u000bJ^\u000bb\u001e\u0013", "uH8\u0016<\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0017Fu%~8\u0002!8K\u00125T@7i:s\u000bLW\u001d|GoC", "AvP=", "7", "8", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MyersDiffKt {
    private static final IntStack calculateDiff(int i2, int i3, DiffCallback diffCallback) {
        int i4 = ((i2 + i3) + 1) / 2;
        IntStack intStack = new IntStack(i4 * 3);
        IntStack intStack2 = new IntStack(i4 * 4);
        intStack2.pushRange(0, i2, 0, i3);
        int i5 = (i4 * 2) + 1;
        int[] iArrM5623constructorimpl = CenteredArray.m5623constructorimpl(new int[i5]);
        int[] iArrM5623constructorimpl2 = CenteredArray.m5623constructorimpl(new int[i5]);
        int[] iArrM5809constructorimpl = Snake.m5809constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int iPop = intStack2.pop();
            int iPop2 = intStack2.pop();
            int iPop3 = intStack2.pop();
            int iPop4 = intStack2.pop();
            int[] iArr = iArrM5623constructorimpl;
            int[] iArr2 = iArrM5623constructorimpl2;
            if (m5708midPointq5eDKzI(iPop4, iPop3, iPop2, iPop, diffCallback, iArr, iArr2, iArrM5809constructorimpl)) {
                if (Snake.m5812getDiagonalSizeimpl(iArrM5809constructorimpl) > 0) {
                    Snake.m5807addDiagonalToStackimpl(iArrM5809constructorimpl, intStack);
                }
                intStack2.pushRange(iPop4, Snake.m5817getStartXimpl(iArrM5809constructorimpl), iPop2, Snake.m5818getStartYimpl(iArrM5809constructorimpl));
                intStack2.pushRange(Snake.m5813getEndXimpl(iArrM5809constructorimpl), iPop3, Snake.m5814getEndYimpl(iArrM5809constructorimpl), iPop);
            }
            iArrM5623constructorimpl = iArr;
            iArrM5623constructorimpl2 = iArr2;
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i2, i3, 0);
        return intStack;
    }

    private static final void applyDiff(IntStack intStack, DiffCallback diffCallback) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < intStack.getSize()) {
            int i5 = i2 + 2;
            int i6 = intStack.get(i2) - intStack.get(i5);
            int i7 = intStack.get(i2 + 1) - intStack.get(i5);
            int i8 = intStack.get(i5);
            i2 += 3;
            while (i3 < i6) {
                diffCallback.remove(i4, i3);
                i3++;
            }
            while (i4 < i7) {
                diffCallback.insert(i4);
                i4++;
            }
            while (true) {
                int i9 = i8 - 1;
                if (i8 > 0) {
                    diffCallback.same(i3, i4);
                    i3++;
                    i4++;
                    i8 = i9;
                }
            }
        }
    }

    public static final void executeDiff(int i2, int i3, DiffCallback diffCallback) {
        applyDiff(calculateDiff(i2, i3, diffCallback), diffCallback);
    }

    /* JADX INFO: renamed from: midPoint-q5eDKzI */
    private static final boolean m5708midPointq5eDKzI(int i2, int i3, int i4, int i5, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i6 = i3;
        int i7 = i2;
        int i8 = i6 - i7;
        int i9 = i5;
        int i10 = i4;
        int i11 = i9 - i10;
        if (i8 >= 1 && i11 >= 1) {
            int i12 = ((i8 + i11) + 1) / 2;
            int[] iArr4 = iArr;
            CenteredArray.m5629setimpl(iArr4, 1, i7);
            int[] iArr5 = iArr2;
            CenteredArray.m5629setimpl(iArr5, 1, i6);
            int i13 = 0;
            while (i13 < i12) {
                int i14 = i13;
                if (m5707forward4l5_RBY(i7, i6, i10, i9, diffCallback, iArr4, iArr5, i14, iArr3)) {
                    return true;
                }
                i7 = i7;
                i6 = i6;
                i10 = i10;
                i9 = i9;
                iArr4 = iArr4;
                iArr5 = iArr5;
                if (m5706backward4l5_RBY(i7, i6, i10, i9, diffCallback, iArr4, iArr5, i14, iArr3)) {
                    return true;
                }
                i13 = i14 + 1;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: forward-4l5_RBY */
    private static final boolean m5707forward4l5_RBY(int i2, int i3, int i4, int i5, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i6, int[] iArr3) {
        int iM5626getimpl;
        int i7;
        int i8;
        int i9 = (i3 - i2) - (i5 - i4);
        boolean z2 = Math.abs(i9) % 2 == 1;
        int i10 = -i6;
        for (int i11 = i10; i11 <= i6; i11 += 2) {
            if (i11 == i10 || (i11 != i6 && CenteredArray.m5626getimpl(iArr, i11 + 1) > CenteredArray.m5626getimpl(iArr, i11 - 1))) {
                iM5626getimpl = CenteredArray.m5626getimpl(iArr, i11 + 1);
                i7 = iM5626getimpl;
            } else {
                iM5626getimpl = CenteredArray.m5626getimpl(iArr, i11 - 1);
                i7 = iM5626getimpl + 1;
            }
            int i12 = (i4 + (i7 - i2)) - i11;
            int i13 = (i6 == 0 || i7 != iM5626getimpl) ? i12 : i12 - 1;
            while (i7 < i3 && i12 < i5 && diffCallback.areItemsTheSame(i7, i12)) {
                i7++;
                i12++;
            }
            CenteredArray.m5629setimpl(iArr, i11, i7);
            if (z2 && (i8 = i9 - i11) >= i10 + 1 && i8 <= i6 - 1 && CenteredArray.m5626getimpl(iArr2, i8) <= i7) {
                fillSnake(iM5626getimpl, i13, i7, i12, false, iArr3);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: backward-4l5_RBY */
    private static final boolean m5706backward4l5_RBY(int i2, int i3, int i4, int i5, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i6, int[] iArr3) {
        int iM5626getimpl;
        int i7;
        int i8;
        int i9 = (i3 - i2) - (i5 - i4);
        boolean z2 = i9 % 2 == 0;
        int i10 = -i6;
        for (int i11 = i10; i11 <= i6; i11 += 2) {
            if (i11 == i10 || (i11 != i6 && CenteredArray.m5626getimpl(iArr2, i11 + 1) < CenteredArray.m5626getimpl(iArr2, i11 - 1))) {
                iM5626getimpl = CenteredArray.m5626getimpl(iArr2, i11 + 1);
                i7 = iM5626getimpl;
            } else {
                iM5626getimpl = CenteredArray.m5626getimpl(iArr2, i11 - 1);
                i7 = iM5626getimpl - 1;
            }
            int i12 = i5 - ((i3 - i7) - i11);
            int i13 = (i6 == 0 || i7 != iM5626getimpl) ? i12 : i12 + 1;
            while (i7 > i2 && i12 > i4 && diffCallback.areItemsTheSame(i7 - 1, i12 - 1)) {
                i7--;
                i12--;
            }
            CenteredArray.m5629setimpl(iArr2, i11, i7);
            if (z2 && (i8 = i9 - i11) >= i10 && i8 <= i6 && CenteredArray.m5626getimpl(iArr, i8) >= i7) {
                fillSnake(i7, i12, iM5626getimpl, i13, true, iArr3);
                return true;
            }
        }
        return false;
    }

    public static final void fillSnake(int i2, int i3, int i4, int i5, boolean z2, int[] iArr) {
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        iArr[4] = z2 ? 1 : 0;
    }

    public static final void swap(int[] iArr, int i2, int i3) {
        int i4 = iArr[i2];
        iArr[i2] = iArr[i3];
        iArr[i3] = i4;
    }
}
