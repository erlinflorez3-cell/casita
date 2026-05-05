package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key_androidKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: compiled from: KeyMapping.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005R2\u009aw\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0\u001al\u0007c*\u000f`DƜ>\u074c߲n<˃d|>\u0005.7::\u007f\f\u000f\u001ez_\u001e~\u0013Cy\u000eݮ/ϋú9QҫQ\r\"\u0012\u0014C8\u0003$euR\u0007_zgR/Q\u0005\u07bcA÷ф^/ƊQ\u0015NT5\u0012\u000fc$6N;\u0006,3_\u001b\u0007\u0001]У\u0002ӊҵ<\u0004ص+/3I\u0002\\NZ\u0006!#/ $k\u0001>\\3Sՙ\u000bʬ̼NbׂT\u00160w\t\u0001%>\n\u001d\u0014+\u0019E;*~\b<5иqԟŬO\u0001ެF\b\u0003aD\u001c=\u00029<G\u001f7hoM1Ne}͕\f̔ƹ\u007fmĲ_\\\u0016`# lyWD_D\u000e_\\\u001eq=\u001c\u0006ψạň\u0003/Ͻ\u00047\u0004\u0011<\u001c=9aN1%<\u0019VZ\u007fv3bŞR֟˦G?̱r\u001e?*\u0017\u0011rFj\u001cyT%o:)e\u001c\u0003\tś\u0007ʶٷ[v˶%-\u0018N]m\u0002lSv\u0018)\u007f}Es\u0007k<Y¢]ڨΉPbߧeZ~\u0014MAz\u0007^\u0002PW\\qjD:2vlߑvӻϢM\u000bƱ6Gy\u001cB1I\u001bb2V\u0007nYO\u001b!_\tj˦}Ԟו#\u0002Ȑ(|\u0011\u0001^a\tqm\u0018W0Mw0MYQc\u001bƘTȨش3{ɠ\u000b\u0007{\u007fUldIR\u000e$y&\u0013.829\u007f1̈́\u0012Áʨ(1ī1MTrsVe\u0014-\u001e\u000b}_RvR\u007f\b\u0019rߓ_ʄ²NSЂ&~fr1\r|\u0002\u007f\u0007T~\u0018zb1s>wtľXߢӷ7{ġ#&-\u0001}'\u001573j5!f\u000f\"W-a\fkݩ-Ӡ̥\u000e%܌i\f4c$tzSc[I<\u001ap\rh:$\u001b\u0005ޢG۳Τ\u0007Aީ8\u0015;HOi\tX>x\u00193N}\u0015X%p\u0005]Ȟ\u0012̊ё3-ʡ.{K}\"c['\u0017zak>\u0005Y\u000b#J=\fГzς£\u0011\u001bݞ$^_b\u00175\u001eu\u001eeO?3\u001cJ9<4Z>\u0082\n͏Ԇh\u0005خ~\bN_\u001d\u001cJDyld\u0012%\u0010j\t`\u0005\u000fGɰ ơݹ}\u000eʟ\"\u0001=1\u0013r^V5\u0017@\u0005Ҹ\u001d\u0012#mUǍ\u0003S*LT?:Ϣ\\5"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001fi!9MB!kH,j", "", "u(E", "\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\r", "5dc\u000e \f$#\u001b`\u0005J", "u(9", "\u0018", "\u0010`R8f3:a\u001c", "5dc\u000fT*Da z\tas\\n~ga2g", "\u0010`R8f7:Q\u0019", "5dc\u000fT*Da$zx^s\\n~ga2g", "\u0011", "5dc\u0010 \f$#\u001b`\u0005J", "\u0011n_F", "5dc\u0010b7R\u001bxdJ`\u000e\u0007t", "\u0011tc", "5dc\u0010h;\u00063~N|@6h", "\u0012d[2g,", "5dc\u0011X3>b\u0019FZD{~j9Q", "\u0012ha2V;B]\"]\u0005p5", "5dc\u0011\\9>Q(\u0003\u0005g\u000b\u0007\u001b8-_\u000eKBb!\u0003", "\u0012ha2V;B]\"ez_;", "5dc\u0011\\9>Q(\u0003\u0005g\u0013|\n>-_\u000eKBb!\u0003", "\u0012ha2V;B]\"k~`/\f", "5dc\u0011\\9>Q(\u0003\u0005g\u0019\u0001\u000b2tG\ba\u0010\u0003x!3", "\u0012ha2V;B]\"n\u0006", "5dc\u0011\\9>Q(\u0003\u0005g\u001c\bP\u000fKO*]Jl", "\u0013mc2e", "5dc\u0012a;>``^`..^\u0013\u001b", "\u0016", "5dc\u0015 \f$#\u001b`\u0005J", "\u0017mb2e;", "5dc\u0016a:>`(FZD{~j9Q", "\u001bne285=", "5dc\u001ab=>3\"}B>\u0012L\u000b\u0011ok", "\u001bne2;6FS", "5dc\u001ab=>6#\u0007z&\fbX1G\n\u0014", "\u001e`V276P\\", "5dc\u001dT.>2#\u0011\u0004&\fbX1G\n\u0014", "\u001e`V2H7", "5dc\u001dT.>C$FZD{~j9Q", "\u001e`bAX", "5dc\u001dT:MS`^`..^\u0013\u001b", "\"`Q", "5dc!T)\u00063~N|@6h", "$", "5dc# \f$#\u001b`\u0005J", "&", "5dc% \f$#\u001b`\u0005J", "'", "5dc& \f$#\u001b`\u0005J", "(", "5dc' \f$#\u001b`\u0005J", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MappedKeys {
    public static final int $stable = 0;
    public static final MappedKeys INSTANCE = new MappedKeys();
    private static final long A = Key_androidKt.Key(29);
    private static final long C = Key_androidKt.Key(31);
    private static final long H = Key_androidKt.Key(36);
    private static final long V = Key_androidKt.Key(50);
    private static final long Y = Key_androidKt.Key(53);
    private static final long X = Key_androidKt.Key(52);
    private static final long Z = Key_androidKt.Key(54);
    private static final long Backslash = Key_androidKt.Key(73);
    private static final long DirectionLeft = Key_androidKt.Key(21);
    private static final long DirectionRight = Key_androidKt.Key(22);
    private static final long DirectionUp = Key_androidKt.Key(19);
    private static final long DirectionDown = Key_androidKt.Key(20);
    private static final long PageUp = Key_androidKt.Key(92);
    private static final long PageDown = Key_androidKt.Key(93);
    private static final long MoveHome = Key_androidKt.Key(122);
    private static final long MoveEnd = Key_androidKt.Key(123);
    private static final long Insert = Key_androidKt.Key(124);
    private static final long Enter = Key_androidKt.Key(66);
    private static final long Backspace = Key_androidKt.Key(67);
    private static final long Delete = Key_androidKt.Key(PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
    private static final long Paste = Key_androidKt.Key(279);
    private static final long Cut = Key_androidKt.Key(277);
    private static final long Copy = Key_androidKt.Key(278);
    private static final long Tab = Key_androidKt.Key(61);

    private MappedKeys() {
    }

    /* JADX INFO: renamed from: getA-EK5gGoQ, reason: not valid java name */
    public final long m1365getAEK5gGoQ() {
        return A;
    }

    /* JADX INFO: renamed from: getC-EK5gGoQ, reason: not valid java name */
    public final long m1368getCEK5gGoQ() {
        return C;
    }

    /* JADX INFO: renamed from: getH-EK5gGoQ, reason: not valid java name */
    public final long m1377getHEK5gGoQ() {
        return H;
    }

    /* JADX INFO: renamed from: getV-EK5gGoQ, reason: not valid java name */
    public final long m1385getVEK5gGoQ() {
        return V;
    }

    /* JADX INFO: renamed from: getY-EK5gGoQ, reason: not valid java name */
    public final long m1387getYEK5gGoQ() {
        return Y;
    }

    /* JADX INFO: renamed from: getX-EK5gGoQ, reason: not valid java name */
    public final long m1386getXEK5gGoQ() {
        return X;
    }

    /* JADX INFO: renamed from: getZ-EK5gGoQ, reason: not valid java name */
    public final long m1388getZEK5gGoQ() {
        return Z;
    }

    /* JADX INFO: renamed from: getBackslash-EK5gGoQ, reason: not valid java name */
    public final long m1366getBackslashEK5gGoQ() {
        return Backslash;
    }

    /* JADX INFO: renamed from: getDirectionLeft-EK5gGoQ, reason: not valid java name */
    public final long m1373getDirectionLeftEK5gGoQ() {
        return DirectionLeft;
    }

    /* JADX INFO: renamed from: getDirectionRight-EK5gGoQ, reason: not valid java name */
    public final long m1374getDirectionRightEK5gGoQ() {
        return DirectionRight;
    }

    /* JADX INFO: renamed from: getDirectionUp-EK5gGoQ, reason: not valid java name */
    public final long m1375getDirectionUpEK5gGoQ() {
        return DirectionUp;
    }

    /* JADX INFO: renamed from: getDirectionDown-EK5gGoQ, reason: not valid java name */
    public final long m1372getDirectionDownEK5gGoQ() {
        return DirectionDown;
    }

    /* JADX INFO: renamed from: getPageUp-EK5gGoQ, reason: not valid java name */
    public final long m1382getPageUpEK5gGoQ() {
        return PageUp;
    }

    /* JADX INFO: renamed from: getPageDown-EK5gGoQ, reason: not valid java name */
    public final long m1381getPageDownEK5gGoQ() {
        return PageDown;
    }

    /* JADX INFO: renamed from: getMoveHome-EK5gGoQ, reason: not valid java name */
    public final long m1380getMoveHomeEK5gGoQ() {
        return MoveHome;
    }

    /* JADX INFO: renamed from: getMoveEnd-EK5gGoQ, reason: not valid java name */
    public final long m1379getMoveEndEK5gGoQ() {
        return MoveEnd;
    }

    /* JADX INFO: renamed from: getInsert-EK5gGoQ, reason: not valid java name */
    public final long m1378getInsertEK5gGoQ() {
        return Insert;
    }

    /* JADX INFO: renamed from: getEnter-EK5gGoQ, reason: not valid java name */
    public final long m1376getEnterEK5gGoQ() {
        return Enter;
    }

    /* JADX INFO: renamed from: getBackspace-EK5gGoQ, reason: not valid java name */
    public final long m1367getBackspaceEK5gGoQ() {
        return Backspace;
    }

    /* JADX INFO: renamed from: getDelete-EK5gGoQ, reason: not valid java name */
    public final long m1371getDeleteEK5gGoQ() {
        return Delete;
    }

    /* JADX INFO: renamed from: getPaste-EK5gGoQ, reason: not valid java name */
    public final long m1383getPasteEK5gGoQ() {
        return Paste;
    }

    /* JADX INFO: renamed from: getCut-EK5gGoQ, reason: not valid java name */
    public final long m1370getCutEK5gGoQ() {
        return Cut;
    }

    /* JADX INFO: renamed from: getCopy-EK5gGoQ, reason: not valid java name */
    public final long m1369getCopyEK5gGoQ() {
        return Copy;
    }

    /* JADX INFO: renamed from: getTab-EK5gGoQ, reason: not valid java name */
    public final long m1384getTabEK5gGoQ() {
        return Tab;
    }
}
