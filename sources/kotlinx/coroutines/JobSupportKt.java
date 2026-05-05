package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!,˛\bDJc|\u0004W\u00068\u000b4D\u0007\":\u0018\u007f\u0007llA0ZeP.XVB\u001dyڔL&q# BcW0|P\b\u0016Ȟ\u007fu|Jr\rY\u000e4\u0015!lBH\u0004w$܈/>PpW3{q\u0014ʣbҽ:\u0005(݅BF\b\b\u0019\u001aXJF͌QőMë\u00160H\u0081Z^\u001bQ\u001d\u001a@\b\u0015ī\u0003ɉ`gVȤhxk?G#1k\u0019ú)ۢ4|Uεf`5\u0013\u000faL2\u0017ʽ\bչ)S\u000bޗrgM\u000bWqk\f?ѪyȅMs_̬x\f\"\u001eCO;dI̩/ԇU`\u0014ʬK[qUh\u000eVyQԋ\u000fʀ\b\u000e\u000eΩh:;%~\b<?KɄUĖT\u0002fۍ \u0007oC/%.?\u0002ݐ\u001dƻUaCϊnC\n\u0013%\u001eQ\bEĒ.ڍ\u0012`\u001dÑt\u0004_@i@kO%˦,ǀq\u0004xç\"6\u0012@_\u007f]\u0003gчiÉ;[A\u05faݒo\u0013"}, d2 = {"0ng\u0016a*H[$\u0006zm,", "", "CmQ<k\u001aMO(~", "\u0011N<\u001d?\f-7\u0002`t:\u0013ih\u000bDs", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013Iaz*>C", "\u0011N<\u001d?\f-7\u0002`tP\b`w\u0013Na\"Y#d}u4Ov", "\u0011N<\u001d?\f-7\u0002`tK\fku#", "\"N>,?\b-3\u0013mdX\nXq\rEf", " DC\u001fL", "", "\u0014@; 8", "\"QD\u0012", "!D0\u00198\u000b", "\u0013L?!L&'3\u000b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \t\"&[E", "\u0013L?!L&\u001a1\bbk>", "\u001aHB!R\u0016'MvhbI\u0013\\w\u0013Oh\"f m~z5]q&_", "\u001aHB!R\n!7\u007f]tI\fip\u0013Sm\fe)", "\u001aHB!R\n\u001a<v^aE\bkl\u0019Ny\u0013[-hz\u00055Sw%", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class JobSupportKt {
    private static final int FALSE = 0;
    private static final int LIST_CANCELLATION_PERMISSION = 4;
    private static final int LIST_CHILD_PERMISSION = 2;
    private static final int LIST_ON_COMPLETION_PERMISSION = 1;
    private static final int RETRY = -1;
    private static final int TRUE = 1;
    private static final Symbol COMPLETING_ALREADY = new Symbol("COMPLETING_ALREADY");
    public static final Symbol COMPLETING_WAITING_CHILDREN = new Symbol("COMPLETING_WAITING_CHILDREN");
    private static final Symbol COMPLETING_RETRY = new Symbol("COMPLETING_RETRY");
    private static final Symbol TOO_LATE_TO_CANCEL = new Symbol("TOO_LATE_TO_CANCEL");
    private static final Symbol SEALED = new Symbol("SEALED");
    private static final Empty EMPTY_NEW = new Empty(false);
    private static final Empty EMPTY_ACTIVE = new Empty(true);

    public static final Object boxIncomplete(Object obj) {
        return obj instanceof Incomplete ? new IncompleteStateBox((Incomplete) obj) : obj;
    }

    public static final Object unboxState(Object obj) {
        Incomplete incomplete;
        IncompleteStateBox incompleteStateBox = obj instanceof IncompleteStateBox ? (IncompleteStateBox) obj : null;
        return (incompleteStateBox == null || (incomplete = incompleteStateBox.state) == null) ? obj : incomplete;
    }
}
