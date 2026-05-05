package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.vector.ImageVector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d̉=!4i\bӵLc\u0003\u0010Iي8\u000b<G\u0007\"2\u0017\u007f\u0007t\tA0ZeP\u008cZS@\u000fs{B$c$\bCCU }*\teNogtMb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0012\u00172XoG\u074cUoS9ht<\u0007(288\u0002\u0005\u0017\u001a2H\u0016w\u0003CY\u0015\u001a0FqRĬ\f[Ĩ2\u00124=H\u0001L[\u0018T<Hz]R/Q\u0004\u001aHT'm2\u0015M;I\u0005-\u0013vo\"C@e8E+Y\u0003\u0015Ws?1B\"C\u000bh5-CI\"Zf^\u0006\u0014#2g\r\fuVb\u000bQn\u0014?+}f{V\u0014(\u0006\u0004\u0014\rj\u0007>\u0012-H<72l\u0018\u0010Ct!_n[2sP\r\u0013rF\u00195\u007fa*I\u001dvQ\u0010JG\\Ѽ\u007f\u0005\u0013.iЮt9ƕS\u001cq-\u001b\u0003vy1\u007f?mNT\ng=\u0006\u0004\u001fc22\n0U\u0012G}'-E8ga?#/\u007f\u001aHrj'\rfha~jJV!\u001d)g0\u000f\fhZ|\u0005\u001aS\u0005^2\u0011[3l\u0007,\u000bC&bwJ9=\u0010|h\u0019opMk$=/\u0015R\ntq\u000eeUv3cT\u0014\u0016gR\u00051W<\u0011#\t{Pr$kl*22v\u000b y\fD|\u001bA@Ɛu\u001c:<wǐbŢGґٿFC\u0003*m|\u00015\rwK$I\u000eDv\u000fɖ^\u0001\u0019\u007fwzY,C\u0005PR*WE\u001b6Uh\r\u0013#i\u0007ҋw\u007fU\u000fdlZ\u0015.u\u001c @\u0018 ߙ_Se#\u001f\u000192HQsq[kaO\"'A!X5\u0002h\u05cek\bx\u0018D\u000exsgTEL\u0017`xּ\u0016\t(\nqH\u000bG*x9\u0001'O\u0003\u0005i<\u0015\\[+O\"3,\b\"CYsCے!\u0016\u0006@ٯ\u0015feluХ\u0016\u0011\u000e֗x\u0013"}, d2 = {"5q^Bc", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0012U?=k%\u001e\u0013wkFE@<R}&GY$", "<`\\2", "", "@nc.g,", "", ">he<g\u001f", ">he<g ", "AbP9X\u001f", "AbP9X ", "BqP;f3:b\u001d\t\u0004Q", "BqP;f3:b\u001d\t\u0004R", "1kX=C(MVwz\nZ", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ">`c5", "4h[9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "4h[943IV\u0015", "Asa<^,", "Asa<^,\u001aZ$\u0002v", "Asa<^,%W\"~lb+\f\f", "Asa<^,%W\"~XZ7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", "Asa<^,%W\"~_h0\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=mz8QL\u0011", "Asa<^,%W\"~bb;|\u0016", ">`c590EZ\b\u0013\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u0018q\u001d5<WFk\n", ">`c55<BZ\u0018~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>HD\"\u001cgaF\\", ">`c5 \u00198:yFHB", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~j}\u001eFw#w1K7m4\u000f\u0015fpC\u0014\"\t^z.FL[\u0002CWnN\u0010[a\nW-VrhN(wF\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\n\u0019?C6dQ\\cwU\u000b\"o:r\u000f5}C6C#!{\u001d\u001a{\u001a,\u0014\u0004^\u001b\u0001RCwk\u0011\u001b\b4/AqYT\u000fLbL\u0003*t,\\[u\u0013<[1~<\u000b83\u007fi\u0016S1\u0019Ngv$0fJ5o\u0017L\u001c=Zg\u007fu\nc,\u0006]\u0011\ro?5\u0018x/aR\u0017\u0012g%[~qcJ9_\u0002ILs\u00135\u0010\u0010BY\t\u001f\u0016P\buaKC\fT~)zQ`<!\u0007\ne\u0018)\u0004", ">dT8", "\"", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011", ">n_", ">tb5", "", "D`[BX", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOV}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019~`", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ImageVectorKt {
    /* JADX INFO: renamed from: path-R_LF-3I$default */
    public static /* synthetic */ ImageVector.Builder m4872pathR_LF3I$default(ImageVector.Builder builder, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i2, int i3, float f5, int i4, Function1 function1, int i5, Object obj) {
        int defaultFillType = i4;
        float f6 = f5;
        int defaultStrokeLineJoin = i3;
        float f7 = f2;
        Brush brush3 = brush;
        String str2 = str;
        int defaultStrokeLineCap = i2;
        float f8 = f4;
        if ((i5 & 1) != 0) {
            str2 = "";
        }
        if ((i5 + 2) - (i5 | 2) != 0) {
            brush3 = null;
        }
        if ((i5 + 4) - (i5 | 4) != 0) {
            f7 = 1.0f;
        }
        Brush brush4 = (i5 + 8) - (i5 | 8) == 0 ? brush2 : null;
        float f9 = (-1) - (((-1) - i5) | ((-1) - 16)) == 0 ? f3 : 1.0f;
        if ((-1) - (((-1) - i5) | ((-1) - 32)) != 0) {
            f8 = 0.0f;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 64)) != 0) {
            defaultStrokeLineCap = VectorKt.getDefaultStrokeLineCap();
        }
        if ((i5 & 128) != 0) {
            defaultStrokeLineJoin = VectorKt.getDefaultStrokeLineJoin();
        }
        if ((i5 & 256) != 0) {
            f6 = 4.0f;
        }
        if ((i5 & 512) != 0) {
            defaultFillType = VectorKt.getDefaultFillType();
        }
        PathBuilder pathBuilder = new PathBuilder();
        function1.invoke(pathBuilder);
        return ImageVector.Builder.m4869addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, str2, brush3, f7, brush4, f9, f8, defaultStrokeLineCap, defaultStrokeLineJoin, f6, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder builder, String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, Function1 function1, int i2, Object obj) {
        List emptyPath = list;
        float f9 = f7;
        float f10 = f3;
        float f11 = f4;
        float f12 = f2;
        float f13 = f5;
        String str2 = str;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str2 = "";
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            f12 = 0.0f;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            f10 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f11 = 0.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            f13 = 1.0f;
        }
        float f14 = (i2 + 32) - (i2 | 32) == 0 ? f6 : 1.0f;
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            f9 = 0.0f;
        }
        float f15 = (i2 + 128) - (i2 | 128) == 0 ? f8 : 0.0f;
        if ((i2 + 256) - (i2 | 256) != 0) {
            emptyPath = VectorKt.getEmptyPath();
        }
        builder.addGroup(str2, f12, f10, f11, f13, f14, f9, f15, emptyPath);
        function1.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    public static final ImageVector.Builder group(ImageVector.Builder builder, String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List<? extends PathNode> list, Function1<? super ImageVector.Builder, Unit> function1) {
        builder.addGroup(str, f2, f3, f4, f5, f6, f7, f8, list);
        function1.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    public static final <T> boolean push(ArrayList<T> arrayList, T t2) {
        return arrayList.add(t2);
    }

    public static final <T> T pop(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    public static final <T> T peek(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: path-R_LF-3I */
    public static final ImageVector.Builder m4871pathR_LF3I(ImageVector.Builder builder, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i2, int i3, float f5, int i4, Function1<? super PathBuilder, Unit> function1) {
        PathBuilder pathBuilder = new PathBuilder();
        function1.invoke(pathBuilder);
        return ImageVector.Builder.m4869addPathoIyEayM$default(builder, pathBuilder.getNodes(), i4, str, brush, f2, brush2, f3, f4, i2, i3, f5, 0.0f, 0.0f, 0.0f, 14336, null);
    }
}
