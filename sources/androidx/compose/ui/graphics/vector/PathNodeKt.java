package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: PathNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!,s\bDJg|\u0004O\f8\u000b4W\u0007\":\u0012\u007fјnjGOLe^.Zݷ2\u000fy\u000e<$a&yCQU\"}8\tWNmjvJp\u000bK\u000f\u001c\u0016\u0001̓Dmc\u0016u\u0012=PryMReuM;ptd&NRR<\b'\u0019\u001aXk@z\tgc\f@6\u0007pR:\u001br\u001d\u001a@$n*\u000f=tm^8Xl\f[]C3mPp?_^ }\u0011Tx?\r%gN/N]M\u0015SY3=X]M*W\"M\u0016x6UNʁwa<\u0002\u0010\u001a\u001bU_\u000fcxL\b\u0015bp\u001bU1յgUV78}\u0001&\u001d>\n\u0014,SX0=\u001a\u0015)<[;ɄYXt\u0010\fZ\u007f)\u007ff!3\u001fK1I\u001dvQ\u0010\\Gng\u007f\u0013/6#/\u0012Q_b2x\u0015IZ>QI\u0004Nk`N8wem2o\u0013\u00168#HW\u00101\f\u0011\\8SfD?3#{\u0002veF'5dvu\u0002RvcRr$[B\t:`\u000bߟ%w^ӹp,?Lr΄Yą\f\u0013(ο\u0018H/%(N}g@җ ύ\u000e%7ωWe|l&Wg]\n̓$Ӓ\u0014aZΘ4KJd\u001dX\u0015A*ۑ-څ,\":ʋ\u000b\u001c\u0006~\\N:\u0012\tŰDʬ8,9ǉ|!V\u00076Bo{_ݣ-ӳ\u0014~\\՜D\u000fw)\r\t/V3ʜBς|I4ʉ\u0001.;Hi5G,,ȫ;ط\u0001#\u000fѨ\u0014\fUodGzrl߲(ދ$\u0016\"ߙq;K\u001c'~W8XΒ\u0018ʆveY˧23\t\u0007\u0012\u000fin\u0005ԙZϡt,hʄj[b\":v\rxyΫ7ѣ}aNکgob\u0017s>wxYʞ\u000fҡ<|\rȔ>1\u000f|:|c3\u001aڲoə{\u00147֒\u0002iw}Fy\u0011\u0015|۬8נ0c\u001e˱\u0003]kAS8wXUЙtٝp\u0003Jו\u000b\u0004\u0016R!4;2\u001fЫ7ވZ8UߒO\nt\u0018D\r\u001fU2ƨḙ\u000246ɾJ\u007fQ\u0010,^q$g߀&ܭqmSŌ+V\u001d\u001d#{_mhΕ\u0010֕ZWj־P\u0012\u0002,NAia[¸[Ӻ8,Dފ+Ob~\u001e\u0010)~\u001dܭał6B{ĩv\u001ab\u000ftVv\u00047ѧ3Ճ.\u0001\u0007۰S*\u0007LI\u0005\u001cE+В6҅\u0005S%̿;v]\u0017~%YC+ڦmϜ\\\u0001\u0013Ե}OW\u001bN\u0004u(D£Bɒ<\u0018\u0005܈b$)Si\u0011\u000eu\u0007͟]ڀhNlɺ2r`i:)-ySɝ\u000f\u009f\u0013\u000b!ۚ\u0013{pIdN&6\u001aבSӢH)\u000fљƚgw"}, d2 = {"\u000fqR!b\u0012>g", "", "\u0011k^@X\u0012>g", "\u0011taCX\u001bH9\u0019\u0013", "\u0016na6m6Gb\u0015\u0006ih\u0012|\u001d", "\u001ah]2G6$S-", "\u001bne2G6$S-", "\u001cT<,4\u0019\u001cM\bht:\u0019^v", "", "\u001cT<,6\u001c+DxxiH&Xu\u0011S", "\u001cT<,;\u0016+7\u000ehcM\bc\u0003\u001eOy\u0004h\"n", "\u001cT<,?\u0010'3\u0013mdX\bij\u001d", "\u001cT<,@\u0016/3\u0013mdX\bij\u001d", "\u001cT<,D\u001c\u001a2\u0013mdX\bij\u001d", "\u001cT<,E\f\u001f:x\\iB\u001d\\\u0003\rUl\u0019[:o\u0001\u0011#\\o*", "\u001cT<,E\f\u001f:x\\iB\u001d\\\u0003\u001bU[\u0007u/j\u0011r4Q{", "\u001cT<,I\f+B|\\VE&kr)Al\ni", "\u001ftP1G6$S-", " dU9X*MW*~Xn9\u000e\t\u001eoe(\u0010", " dU9X*MW*~fn({w9K\u007f<", " d[.g0OSt\fxM6b\tC", " d[.g0OSv\u0006\u0005l,b\tC", " d[.g0OSv\u000f\bo,k\u0013\u0015e\u0014", " d[.g0OS{\t\bbA\u0007\u0012>a\u0007\u0017\u0006&\u0001+", " d[.g0OS\u007f\u0003\u0004^\u001b\u0007n/y", " d[.g0OS\u0001\t\f^\u001b\u0007n/y", " d[.g0OS\u0005\u000fv]\u001b\u0007n/y", " d[.g0OS\u0006~{e,z\u00183v\u007f\u0006\fM\u0012\u0017\u0006QU\u000eP", " d[.g0OS\u0006~{e,z\u00183v\u007f\u0014\f<\u007f\u0006!-o\"", " d[.g0OS\n~\bm0z\u00056T\n\u000e{T", "$daA\\*:Z\b\t`^@", ">`c5@6OS\u0002\ty^\r\n\u00137A\r*\n", "", "<nS2f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "/qV@", "", "1nd;g", ">`c5A6=S'_\bh4X\u00161s", "<t\\\u000ee.L", "<nS296K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "AtQ\u000ee9:g", "AsP?g", ">`c5E,EO(\u0003\f^\u0014\u0007\u001a/N\n'{!\u000e!\u001f#|\u0010J", "/cS\u001dT;A<#}zl", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    public static final void addPathNodes(char c2, ArrayList<PathNode> arrayList, float[] fArr, int i2) {
        if (c2 != 'z' && c2 != 'Z') {
            if (c2 == 'm') {
                pathRelativeMoveNodeFromArgs(arrayList, fArr, i2);
                return;
            }
            if (c2 == 'M') {
                pathMoveNodeFromArgs(arrayList, fArr, i2);
                return;
            }
            int i3 = 0;
            if (c2 == 'l') {
                int i4 = i2 - 2;
                while (i3 <= i4) {
                    arrayList.add(new PathNode.RelativeLineTo(fArr[i3], fArr[i3 + 1]));
                    i3 += 2;
                }
                return;
            }
            if (c2 == 'L') {
                int i5 = i2 - 2;
                while (i3 <= i5) {
                    arrayList.add(new PathNode.LineTo(fArr[i3], fArr[i3 + 1]));
                    i3 += 2;
                }
                return;
            }
            if (c2 == 'h') {
                int i6 = i2 - 1;
                while (i3 <= i6) {
                    arrayList.add(new PathNode.RelativeHorizontalTo(fArr[i3]));
                    i3++;
                }
                return;
            }
            if (c2 == 'H') {
                int i7 = i2 - 1;
                while (i3 <= i7) {
                    arrayList.add(new PathNode.HorizontalTo(fArr[i3]));
                    i3++;
                }
                return;
            }
            if (c2 == 'v') {
                int i8 = i2 - 1;
                while (i3 <= i8) {
                    arrayList.add(new PathNode.RelativeVerticalTo(fArr[i3]));
                    i3++;
                }
                return;
            }
            if (c2 == 'V') {
                int i9 = i2 - 1;
                while (i3 <= i9) {
                    arrayList.add(new PathNode.VerticalTo(fArr[i3]));
                    i3++;
                }
                return;
            }
            if (c2 == 'c') {
                int i10 = i2 - 6;
                while (i3 <= i10) {
                    arrayList.add(new PathNode.RelativeCurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3], fArr[i3 + 4], fArr[i3 + 5]));
                    i3 += 6;
                }
                return;
            }
            if (c2 == 'C') {
                int i11 = i2 - 6;
                while (i3 <= i11) {
                    arrayList.add(new PathNode.CurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3], fArr[i3 + 4], fArr[i3 + 5]));
                    i3 += 6;
                }
                return;
            }
            if (c2 == 's') {
                int i12 = i2 - 4;
                while (i3 <= i12) {
                    arrayList.add(new PathNode.RelativeReflectiveCurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                    i3 += 4;
                }
                return;
            }
            if (c2 == 'S') {
                int i13 = i2 - 4;
                while (i3 <= i13) {
                    arrayList.add(new PathNode.ReflectiveCurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                    i3 += 4;
                }
                return;
            }
            if (c2 == 'q') {
                int i14 = i2 - 4;
                while (i3 <= i14) {
                    arrayList.add(new PathNode.RelativeQuadTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                    i3 += 4;
                }
                return;
            }
            if (c2 == 'Q') {
                int i15 = i2 - 4;
                while (i3 <= i15) {
                    arrayList.add(new PathNode.QuadTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                    i3 += 4;
                }
                return;
            }
            if (c2 == 't') {
                int i16 = i2 - 2;
                while (i3 <= i16) {
                    arrayList.add(new PathNode.RelativeReflectiveQuadTo(fArr[i3], fArr[i3 + 1]));
                    i3 += 2;
                }
                return;
            }
            if (c2 == 'T') {
                int i17 = i2 - 2;
                while (i3 <= i17) {
                    arrayList.add(new PathNode.ReflectiveQuadTo(fArr[i3], fArr[i3 + 1]));
                    i3 += 2;
                }
                return;
            }
            if (c2 != 'a') {
                if (c2 != 'A') {
                    throw new IllegalArgumentException("Unknown command for: " + c2);
                }
                int i18 = i2 - 7;
                for (int i19 = 0; i19 <= i18; i19 += 7) {
                    arrayList.add(new PathNode.ArcTo(fArr[i19], fArr[i19 + 1], fArr[i19 + 2], Float.compare(fArr[i19 + 3], 0.0f) != 0, Float.compare(fArr[i19 + 4], 0.0f) != 0, fArr[i19 + 5], fArr[i19 + 6]));
                }
                return;
            }
            int i20 = i2 - 7;
            for (int i21 = 0; i21 <= i20; i21 += 7) {
                arrayList.add(new PathNode.RelativeArcTo(fArr[i21], fArr[i21 + 1], fArr[i21 + 2], Float.compare(fArr[i21 + 3], 0.0f) != 0, Float.compare(fArr[i21 + 4], 0.0f) != 0, fArr[i21 + 5], fArr[i21 + 6]));
            }
            return;
        }
        arrayList.add(PathNode.Close.INSTANCE);
    }

    private static final void pathNodesFromArgs(List<PathNode> list, float[] fArr, int i2, int i3, Function2<? super float[], ? super Integer, ? extends PathNode> function2) {
        int i4 = i2 - i3;
        int i5 = 0;
        while (i5 <= i4) {
            list.add(function2.invoke(fArr, Integer.valueOf(i5)));
            i5 += i3;
        }
    }

    private static final void pathMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i2) {
        int i3 = i2 - 2;
        if (i3 >= 0) {
            list.add(new PathNode.MoveTo(fArr[0], fArr[1]));
            for (int i4 = 2; i4 <= i3; i4 += 2) {
                list.add(new PathNode.LineTo(fArr[i4], fArr[i4 + 1]));
            }
        }
    }

    private static final void pathRelativeMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i2) {
        int i3 = i2 - 2;
        if (i3 >= 0) {
            list.add(new PathNode.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i4 = 2; i4 <= i3; i4 += 2) {
                list.add(new PathNode.RelativeLineTo(fArr[i4], fArr[i4 + 1]));
            }
        }
    }
}
