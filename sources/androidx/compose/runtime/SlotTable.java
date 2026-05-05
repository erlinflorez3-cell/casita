package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import com.dynatrace.android.agent.Global;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;
import org.apache.commons.codec.language.Soundex;
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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яķ\u0014D57\u001eq\u007fZDkt\u0012[\u000e0!.J~(,\u001aw\u001dfr9FDmHDR[*\u0015n\u00044:[,qY;]\u001a\u0004(\u0011O\\zonP[\u0013C\u001d\f\u001exp.QU\u0007f\u001a\u000f8Bw?A\\w=Gś|6\u000b%:\"Ny\r\u00010*P\u0010\rzKK\u0012\u001e8@~:Z҈U\u00050\u0012\u000ē(\u00014\\oN<Kt]HM+\u0003oCV'u0\u0005M\u0013L\\'\u001b\u001di\u001e1G?5+%[\u0003\u001dRc?\tIy=\u0013t/'1K{WLX\b\u0014++W\rcr,ؘ\u001bĩ\u0011\fU*\u007fi[R\u001e(&{*\r|\u0007؝\n'V0u&t@&3#w\u0004D^;vB.\u0015*B%_\u00183YSKj_\u001aS\u0019|<D@\u001bY;\u0001\u001d]\fX\u001c\u001e-\u001b\u00036\u0002U_jUh^\fi=\u001c\t\u0001d\u0012*2\\]~]'y<''G[g(1m\u0012Hr\u0014\r\u0004?\u0016\u001a֟ʐL@(.^փ)\u0017GrD\u0013A\u001cTb\u000fD\u0011{\\\u0005\u000b\f\u001f+ \u000b\u000el%3+fO\u0017\u0004\u001bYk.=7v;ip\u0002\r\u0006\\\rUeUq8yR%.oPp\bpvRU\u001cZ\u000b-P61p y\fD|\u0011q8o\u0016*^DQ)^%H1#RC\r\t\u000e\u0007~\u000f-\u007f\u001c2\u0013k4t7\u0006`^\u0001o\u0016%_+[\u000eR9O\\M!6W2hb\n9\u0006-\u007fFøѨPIR,$7\u001e\u007f.X29\u007fk\u0006\u0017\u001dBA20i\u000eP\u0001*iM@FC\t\bTSn>i\u0018j\u001fF\u000f1\u0011O\u001d'0>vt9\u0007\u0013\u0001*eTC_c\u0003.\"R\u0012\u0003\u0011#TPN{3iN)\u000f;:|cG\n'e*\u0006`G\u0015\u0010|\u001as<Gz\u000fT\u000f\u0016\b:\u001c.o\u0011V&>I\u0007a_\u000f@2$\u001b\u001dp\u000f1wP]\u0017\u0004%;XCtp\u0005\u0003c\n]D\u0017\u000b:]\tV\nTY̊ϻ8.e{<P\ffvI5\u0013]S\u0016n\u001c\u001f#ּJW\u0016\u0019PIt\"\u001eM \u0005q\u0011Ov\u0006<$D\u0017Sh\u0015>\u0019$bFjNQC\u001dm\u0014f\u0013\u007ft\u001eW\u001b@\u001a\f;\u0005N\u001d\u0005j/`\u0005\u000fd\u0011%89\u0017\u000fa#AA?^\u0006Ld1s2/mKOaj\u00184t\u007fCD\u001b\u0015;*^۞\u0019!\u000ebW^N\u001fW:}z\u001eJէ\u001c\u0007#!(!?1!a|6\u0005Hef^d=m\u00150\u0015ä/Ή~|\u001c\u001dRۏ\n'1\u000bo\u0011i|R\u0006N[\u001a/-t-\u0015'\u0015ct5]\u0012CQUQz\u00187}mRi!6BP+\u0012\u001d9\\\u0006(\u0017\u001ek\u001eR&\u0002\u0018r\u00027\u0018~$l4Zv\u0003\n\\\r\u0015U2W\u0010=vy{y1@U0|\bRK\u0017% b\u001b\u000fWc\u001b\u0005v1\u0005~~/`\u001d7Sc-q\u0006\u000bF\u001f^8`!\u0002$\u0015T,L\u0007\u00115V˖ʍlrq2ipsLy\u000fy3FQL!O}\u0004OBTV/kZ[$|\t\u000b\u0007\tĠеbj.K='7{\u0015\u0007Xb!\u0015JE!A\u0013ug\u001d-'%G\u000f!Jـõ*!7;\b)E\u001c#q>u?/jf\u0003KBB7\rHk:\u0018^Tk\u0006oi2Z|\u0005<Js=r\f:J&\u0011]t~ \u0007`(\nSQa}aF\u000f\u0004P\u00066b97p\u070ea\u0001Z \u000b]%Z\nB{I\"w«'9\u0015N+]l\u001b57kRMB\u0012gZ~\u0014?\u0005l(ιOˢI\u001e\b6\t\u001e\u0018\u000f<$4\u0010K\u0004s\"1*>NpZ\u0002\u0011\u001c&XP\u001fH1:\u0005x\"$rih\u001cr^yDQ|$\u0019rCX1U\rUOxy9IkKjɟ\u001bҋ-?\u001fτ(QwG9Q\u0013O5ekFc\u0014\u0012EJiF{W@\b7\u001c,@`:ÆvҦUk\u0018ؾ*\u000f\u0013\u0012\u0006@rb\u0006p+)wc\u0005XNb\tOQb9A=$\u0015\u0003\u0019Ք\rʲ\u001a2`\u0019\b\u0011Xte/A^\fAu(\u0007\u007f/2)[S\u001cc(A\u07b6K߂u^EغK\rsbfN6x\u0013p9K\u0013EE\u0004x@FG\u0005XXj/Ơ\u001aȭhN\u0018͊\u0011F.\n>M\u0001b\rx[]/;U\u0012,Ǵgܢ6fO]j/9W(z`v;-'\u001cY\u07b3Më\u0017\u000b&ҍ\n`1\u0018%9N\u007f\u0018^_T+\u0011w23mX6G\u000eO3QM\u0003U\u0014bGy}?bԓ3դ\n\u001b,bu:\u0002\u0010(\u0005\u0011r\u0007r7pcY?\u0001rn\u001d\u0010\r\f\\&v\u0016\\ۺ\u0012©f\"=ģwB2W~&\u0018\bx&B\u0006\u007fh\u0005Y{J;w)>_\u001e'b}\u000b||a^h>E\\6B#\u0002HI<`Zu\u007fܧ#ƬgyrԔlb\u0017\bB\u001bPf\u007f#t\u0016\u000f{Ln`lG\u0001&ʈ'эHn\u0011Ȣ\tJGCp\nL)<|xNQ\u001dY\u0018/\u0014ec''uHR\"\u0010A\u0012\u001e{ϔVԴ\u0012pi\u07bf-}cjD-Ҏ0p"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014$Uz'7C", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001dF\u0001,9b\u007fi\u0015w\u001e9WQ?z8(\u001eG]H\u00039", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001dF\u0001,9b\u007fi\u0015w\u001e9WQ?z8(\u001eJnC\u0017n\u0002", "u(E", "/mR5b9L", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "5dc\u000ea*A]&\r9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u000ea*A]&\r9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "1`[9X+\u001bg\u0001z\u0006", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DCz%7k%\u0016IN\u0011", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DG}/\r", "5dc\u0010T3ES\u0018[\u000fF(\bG<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`~W~\n9}%\u0019b\r\n4r\u0016,\\+7v\n", "Adc\u0010T3ES\u0018[\u000fF(\bG<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ~'Vk\u000bCv\t>hg\u001d<m\u0014=5?FAw\u000f", "1n\\=b:Bb\u001d\t\u0004@9\u0007\u0019:s", "5dc\u0010b4I]'\u0003\nb6\u0006j<o\u00103\n", "u(;7T=:\u001d z\u0004`u`\u0018/r{%\u0003@V", "\nrTA \u0006\u0017", "", "5q^Bc:", "5dc\u0014e6N^'", "u(J\u0016", "", "5q^Bc:,W.~", "5dc\u0014e6N^'l~s,", "u(8", "7r4:c;R", "", "u(I", "@dP1X9L", "", "", "Ak^Af", "5dc _6Ma", "u(J\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "Ak^Af\u001aBh\u0019", "5dc _6Ma\u0007\u0003\u0010^", "And?V,\"\\\u001a\t\bf(\f\r9ng$\u0007", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9oI\u00015@G\b0Dk\u0016\u0012VDEx<\u001a$lkB\\", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", "5dc b<KQ\u0019b\u0004_6\n\u0011+t\u00042\u0005(|\"UT\u007f\u0017Kz-5S\u000b >m\u0012<M", "u(;7T=:\u001d)\u000e~eu_\u0005=hg$\u0007\u0016", "Adc b<KQ\u0019b\u0004_6\n\u0011+t\u00042\u0005(|\"UT\u007f\u0017Kz-5S\u000b >m\u0012<M", "uKY.i(\bc(\u0003\u0002(\u000fx\u00172M{3Q\u0004q", "Dda@\\6G", "5dc#X9LW#\b9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "Adc#X9LW#\b9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "uH\u0018#", "EqXAX9", "5dc$e0MS&=\bn5\f\r7ey5{G\u0001\u0013%G", "/mR5b9", "7mS2k", "/mR5b9\"\\\u0018~\u000e", "1k^@X", "", "@dP1X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014\"Yy\u001f7zk", "1k^@XjKc\"\u000e~f,v\u0016/l\u007f$\n@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*}/DK\u000b$Fm#\u0004C'\u001fa\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(V$\u0019\u000ek\n\u0018;\u001c\t`\u000b\u007f{Q33n0W\u0011\u0011O\u0006\b'\n~z\u007fF]Y*u#x)%s\u001c@[\u0003FNOf)wU]'cA:\"#u#$28>\u0019wP\u0018r6\u0003vQD\u001ez63&if\u001c\t`", "1n[9X*M1\u0015\u0006\u0002^+Y\u001d\u0013n\u00012\tH|&\u001bQx", "1n[9X*MA#\u000f\b\\,`\u00120o\r0wO\u0005! ", "1n]AT0Ga\u0001z\bd", "2`c.<5=S,~\t", "", "4h]1", "7cT;g0Mg\b\t[b5{", "4h]18-?S\u0017\u000e~o,i\t-o\b3\u0006N\u0001\u0005\u0015Qz\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u001fs?%j", "5q^Bc", "5q^Bc\nH\\(z~g:X\u0012-h\n5", "5q^Bc\u0010GR\u0019\u0012", "5q^Bc\u001aBh\u0019\r", "7me._0=O(~\\k6\r\u0014=W\u00047~&\u0001+", "B`a4X;", "7me._0=O(~\\k6\r\u0014=W\u00047~&\u0001+UT\u007f\u0017Kz-5S\u000b >m\u0012<M", "7sT?T;H`", "", "9dh@", "<nS2f", "=oT;E,:R\u0019\f", "=oT;J9Bb\u0019\f", "=v]@45<V#\f", ">`a2a;\"\\\u0018~\u000e^:", "@dP1", "\"", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "Adc!b", "Adc!bjKc\"\u000e~f,v\u0016/l\u007f$\n@", "uZ8\u0016N\u0013CO*zDe(\u0006\u000bxO|-{>\u0010lz.t\nMrnEh\u0002'\u0001I#;IW\"oB-jOf5\u0018_u^\u0006+N\u00161(jUZ9\u001fgA\nW*\u001a\u000f]@78BA&\u000f,G\u0011?r\nU}\u001eDfmIVsP\t~rF)fUA[\u0005\u001d\u00056", "Ak^A", "Ak^A<5=S,", "Ak^A\u00179N\\(\u0003\u0003^&\n\t6e{6{", "Ak^Af\u0016?", "Ak^Af\u0016?\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "And?V,\"\\\u001a\t\bf(\f\r9ni)", "Bn32U<@A(\f~g.", "", "Bqh\u000ea*A]&", "Dda6Y@0S \u0006[h9\u0005\t.", "EqXAX", "3lXA:9Hc$", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", ":de2_", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, KMappedMarker {
    public static final int $stable = 8;
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private int version;
    private boolean writer;
    private int[] groups = new int[0];
    private Object[] slots = new Object[0];
    private ArrayList<Anchor> anchors = new ArrayList<>();

    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final boolean getWriter$runtime_release() {
        return this.writer;
    }

    public final int getVersion$runtime_release() {
        return this.version;
    }

    public final void setVersion$runtime_release(int i2) {
        this.version = i2;
    }

    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    public final void setAnchors$runtime_release(ArrayList<Anchor> arrayList) {
        this.anchors = arrayList;
    }

    public final HashMap<Anchor, GroupSourceInformation> getSourceInformationMap$runtime_release() {
        return this.sourceInformationMap;
    }

    public final void setSourceInformationMap$runtime_release(HashMap<Anchor, GroupSourceInformation> map) {
        this.sourceInformationMap = map;
    }

    public final MutableIntObjectMap<MutableIntSet> getCalledByMap$runtime_release() {
        return this.calledByMap;
    }

    public final void setCalledByMap$runtime_release(MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        this.calledByMap = mutableIntObjectMap;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    public final <T> T read(Function1<? super SlotReader, ? extends T> function1) {
        SlotReader slotReaderOpenReader = openReader();
        try {
            return function1.invoke(slotReaderOpenReader);
        } finally {
            InlineMarker.finallyStart(1);
            slotReaderOpenReader.close();
            InlineMarker.finallyEnd(1);
        }
    }

    public final <T> T write(Function1<? super SlotWriter, ? extends T> function1) {
        SlotWriter slotWriterOpenWriter = openWriter();
        try {
            T tInvoke = function1.invoke(slotWriterOpenWriter);
            InlineMarker.finallyStart(1);
            slotWriterOpenWriter.close(true);
            InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            slotWriterOpenWriter.close(false);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.readers++;
        return new SlotReader(this);
    }

    public final SlotWriter openWriter() {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
        }
        if (!(this.readers <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final Anchor anchor(int i2) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to create an anchor location instead");
        }
        boolean z2 = false;
        if (i2 >= 0 && i2 < this.groupsSize) {
            z2 = true;
        }
        if (!z2) {
            PreconditionsKt.throwIllegalArgumentException("Parameter index is out of range");
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, i2, this.groupsSize);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        Anchor anchor = new Anchor(i2);
        arrayList.add(-(iSearch + 1), anchor);
        return anchor;
    }

    private final Anchor tryAnchor(int i2) {
        int i3;
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to crate an anchor for location instead");
        }
        if (i2 < 0 || i2 >= (i3 = this.groupsSize)) {
            return null;
        }
        return SlotTableKt.find(this.anchors, i2, i3);
    }

    public final int anchorIndex(Anchor anchor) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.getValid()) {
            PreconditionsKt.throwIllegalArgumentException("Anchor refers to a group that was removed");
        }
        return anchor.getLocation$runtime_release();
    }

    public final boolean ownsAnchor(Anchor anchor) {
        int iSearch;
        return anchor.getValid() && (iSearch = SlotTableKt.search(this.anchors, anchor.getLocation$runtime_release(), this.groupsSize)) >= 0 && Intrinsics.areEqual(this.anchors.get(iSearch), anchor);
    }

    public final boolean groupContainsAnchor(int i2, Anchor anchor) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Writer is active");
        }
        if (!(i2 >= 0 && i2 < this.groupsSize)) {
            ComposerKt.composeImmediateRuntimeError("Invalid group index");
        }
        if (ownsAnchor(anchor)) {
            int iGroupSize = SlotTableKt.groupSize(this.groups, i2) + i2;
            int location$runtime_release = anchor.getLocation$runtime_release();
            if (i2 <= location$runtime_release && location$runtime_release < iGroupSize) {
                return true;
            }
        }
        return false;
    }

    public final void close$runtime_release(SlotReader slotReader, HashMap<Anchor, GroupSourceInformation> map) {
        if (!(slotReader.getTable$runtime_release() == this && this.readers > 0)) {
            ComposerKt.composeImmediateRuntimeError("Unexpected reader close()");
        }
        this.readers--;
        if (map != null) {
            synchronized (this) {
                HashMap<Anchor, GroupSourceInformation> map2 = this.sourceInformationMap;
                if (map2 != null) {
                    map2.putAll(map);
                } else {
                    this.sourceInformationMap = map;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void close$runtime_release(SlotWriter slotWriter, int[] iArr, int i2, Object[] objArr, int i3, ArrayList<Anchor> arrayList, HashMap<Anchor, GroupSourceInformation> map, MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        if (!(slotWriter.getTable$runtime_release() == this && this.writer)) {
            PreconditionsKt.throwIllegalArgumentException("Unexpected writer close()");
        }
        this.writer = false;
        setTo$runtime_release(iArr, i2, objArr, i3, arrayList, map, mutableIntObjectMap);
    }

    public final void setTo$runtime_release(int[] iArr, int i2, Object[] objArr, int i3, ArrayList<Anchor> arrayList, HashMap<Anchor, GroupSourceInformation> map, MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        this.groups = iArr;
        this.groupsSize = i2;
        this.slots = objArr;
        this.slotsSize = i3;
        this.anchors = arrayList;
        this.sourceInformationMap = map;
        this.calledByMap = mutableIntObjectMap;
    }

    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int i2) {
        MutableIntSet mutableIntSet;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        MutableIntSet mutableIntSet2 = new MutableIntSet(0, 1, null);
        mutableIntSet2.add(i2);
        mutableIntSet2.add(-3);
        MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
        if (mutableIntObjectMap != null && (mutableIntSet = mutableIntObjectMap.get(i2)) != null) {
            mutableIntSet2.addAll(mutableIntSet);
        }
        SlotReader slotReaderOpenReader = openReader();
        try {
            invalidateGroupsWithKey$lambda$20$scanGroup(slotReaderOpenReader, mutableIntSet2, arrayList, booleanRef, this, arrayList2);
            Unit unit = Unit.INSTANCE;
            slotReaderOpenReader.close();
            SlotWriter slotWriterOpenWriter = openWriter();
            try {
                slotWriterOpenWriter.startGroup();
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Anchor anchor = (Anchor) arrayList.get(i3);
                    if (anchor.toIndexFor(slotWriterOpenWriter) >= slotWriterOpenWriter.getCurrentGroup()) {
                        slotWriterOpenWriter.seek(anchor);
                        slotWriterOpenWriter.bashCurrentGroup();
                    }
                }
                slotWriterOpenWriter.skipToGroupEnd();
                slotWriterOpenWriter.endGroup();
                slotWriterOpenWriter.close(true);
                if (booleanRef.element) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th) {
                slotWriterOpenWriter.close(false);
                throw th;
            }
        } catch (Throwable th2) {
            slotReaderOpenReader.close();
            throw th2;
        }
    }

    private static final void invalidateGroupsWithKey$lambda$20$scanGroup(SlotReader slotReader, MutableIntSet mutableIntSet, List<Anchor> list, Ref.BooleanRef booleanRef, SlotTable slotTable, List<RecomposeScopeImpl> list2) {
        RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope;
        int groupKey = slotReader.getGroupKey();
        if (mutableIntSet.contains(groupKey)) {
            if (groupKey != -3) {
                list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
            }
            if (booleanRef.element) {
                RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope2 = slotTable.findEffectiveRecomposeScope(slotReader.getCurrentGroup());
                if (recomposeScopeImplFindEffectiveRecomposeScope2 != null) {
                    list2.add(recomposeScopeImplFindEffectiveRecomposeScope2);
                    Anchor anchor = recomposeScopeImplFindEffectiveRecomposeScope2.getAnchor();
                    if (anchor != null && anchor.getLocation$runtime_release() == slotReader.getCurrentGroup() && (recomposeScopeImplFindEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getParent())) != null) {
                        list2.add(recomposeScopeImplFindEffectiveRecomposeScope);
                    }
                } else {
                    booleanRef.element = false;
                    list2.clear();
                }
            }
            slotReader.skipGroup();
            return;
        }
        slotReader.startGroup();
        while (!slotReader.isGroupEnd()) {
            invalidateGroupsWithKey$lambda$20$scanGroup(slotReader, mutableIntSet, list, booleanRef, slotTable, list2);
        }
        slotReader.endGroup();
    }

    public final boolean containsMark() {
        return this.groupsSize > 0 && SlotTableKt.containsMark(this.groups, 0);
    }

    public final GroupSourceInformation sourceInformationOf(int i2) {
        Anchor anchorTryAnchor;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (anchorTryAnchor = tryAnchor(i2)) == null) {
            return null;
        }
        return map.get(anchorTryAnchor);
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int i2) {
        int iParentAnchor = i2;
        while (iParentAnchor > 0) {
            for (Object obj : new DataIterator(this, iParentAnchor)) {
                if (obj instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                    if (recomposeScopeImpl.getUsed() && iParentAnchor != i2) {
                        return recomposeScopeImpl;
                    }
                    recomposeScopeImpl.setForcedRecompose(true);
                }
            }
            iParentAnchor = SlotTableKt.parentAnchor(this.groups, iParentAnchor);
        }
        return null;
    }

    public final void verifyWellFormed() {
        Ref.IntRef intRef = new Ref.IntRef();
        int i2 = -1;
        if (this.groupsSize > 0) {
            while (intRef.element < this.groupsSize) {
                verifyWellFormed$validateGroup(intRef, this, -1, intRef.element + SlotTableKt.groupSize(this.groups, intRef.element));
            }
            if (!(intRef.element == this.groupsSize)) {
                PreconditionsKt.throwIllegalStateException("Incomplete group at root " + intRef.element + " expected to be " + this.groupsSize);
            }
        }
        int length = this.slots.length;
        for (int i3 = this.slotsSize; i3 < length; i3++) {
            if (!(this.slots[i3] == null)) {
                PreconditionsKt.throwIllegalStateException("Non null value in the slot gap at index " + i3);
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            int indexFor = arrayList.get(i4).toIndexFor(this);
            if (!(indexFor >= 0 && indexFor <= this.groupsSize)) {
                PreconditionsKt.throwIllegalArgumentException("Invalid anchor, location out of bound");
            }
            if (!(i2 < indexFor)) {
                PreconditionsKt.throwIllegalArgumentException("Anchor is out of order");
            }
            i4++;
            i2 = indexFor;
        }
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map != null) {
            for (Map.Entry<Anchor, GroupSourceInformation> entry : map.entrySet()) {
                Anchor key = entry.getKey();
                GroupSourceInformation value = entry.getValue();
                if (!key.getValid()) {
                    PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                }
                if (!ownsAnchor(key)) {
                    PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                }
                verifyWellFormed$verifySourceGroup(this, value);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v98 */
    private static final int verifyWellFormed$validateGroup(Ref.IntRef intRef, SlotTable slotTable, int i2, int i3) {
        int i4 = intRef.element;
        int i5 = i4 + 1;
        intRef.element = i5;
        int iParentAnchor = SlotTableKt.parentAnchor(slotTable.groups, i4);
        if ((iParentAnchor == i2) == false) {
            PreconditionsKt.throwIllegalStateException("Invalid parent index detected at " + i4 + ", expected parent index to be " + i2 + " found " + iParentAnchor);
        }
        int iGroupSize = SlotTableKt.groupSize(slotTable.groups, i4) + i4;
        if ((iGroupSize <= slotTable.groupsSize) == false) {
            PreconditionsKt.throwIllegalStateException("A group extends past the end of the table at " + i4);
        }
        if ((iGroupSize <= i3) == false) {
            PreconditionsKt.throwIllegalStateException("A group extends past its parent group at " + i4);
        }
        int iDataAnchor = SlotTableKt.dataAnchor(slotTable.groups, i4);
        int iDataAnchor2 = i4 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : SlotTableKt.dataAnchor(slotTable.groups, i5);
        if ((iDataAnchor2 <= slotTable.slots.length) == false) {
            PreconditionsKt.throwIllegalStateException("Slots for " + i4 + " extend past the end of the slot table");
        }
        if ((iDataAnchor <= iDataAnchor2) == false) {
            PreconditionsKt.throwIllegalStateException("Invalid data anchor at " + i4);
        }
        if ((SlotTableKt.slotAnchor(slotTable.groups, i4) <= iDataAnchor2) == false) {
            PreconditionsKt.throwIllegalStateException("Slots start out of range at " + i4);
        }
        if ((iDataAnchor2 - iDataAnchor >= ((SlotTableKt.isNode(slotTable.groups, i4) ? 1 : 0) + (SlotTableKt.hasObjectKey(slotTable.groups, i4) ? 1 : 0)) + (SlotTableKt.hasAux(slotTable.groups, i4) ? 1 : 0)) == false) {
            PreconditionsKt.throwIllegalStateException("Not enough slots added for group " + i4);
        }
        boolean zIsNode = SlotTableKt.isNode(slotTable.groups, i4);
        if (((zIsNode && slotTable.slots[SlotTableKt.nodeIndex(slotTable.groups, i4)] == null) ? false : true) == false) {
            PreconditionsKt.throwIllegalStateException("No node recorded for a node group at " + i4);
        }
        int iVerifyWellFormed$validateGroup = 0;
        while (intRef.element < iGroupSize) {
            iVerifyWellFormed$validateGroup += verifyWellFormed$validateGroup(intRef, slotTable, i4, iGroupSize);
        }
        int iNodeCount = SlotTableKt.nodeCount(slotTable.groups, i4);
        int iGroupSize2 = SlotTableKt.groupSize(slotTable.groups, i4);
        if ((iNodeCount == iVerifyWellFormed$validateGroup) == false) {
            PreconditionsKt.throwIllegalStateException("Incorrect node count detected at " + i4 + ", expected " + iNodeCount + ", received " + iVerifyWellFormed$validateGroup);
        }
        int i6 = intRef.element - i4;
        if ((iGroupSize2 == i6) == false) {
            PreconditionsKt.throwIllegalStateException("Incorrect slot count detected at " + i4 + ", expected " + iGroupSize2 + ", received " + i6);
        }
        if (SlotTableKt.containsAnyMark(slotTable.groups, i4)) {
            if (!(i4 <= 0 || SlotTableKt.containsMark(slotTable.groups, i2))) {
                PreconditionsKt.throwIllegalStateException("Expected group " + i2 + " to record it contains a mark because " + i4 + " does");
            }
        }
        if (zIsNode) {
            return 1;
        }
        return iVerifyWellFormed$validateGroup;
    }

    private static final void verifyWellFormed$verifySourceGroup(SlotTable slotTable, GroupSourceInformation groupSourceInformation) {
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            ArrayList<Object> arrayList = groups;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = arrayList.get(i2);
                if (obj instanceof Anchor) {
                    Anchor anchor = (Anchor) obj;
                    if (!anchor.getValid()) {
                        PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                    }
                    if (!slotTable.ownsAnchor(anchor)) {
                        PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                    }
                } else if (obj instanceof GroupSourceInformation) {
                    verifyWellFormed$verifySourceGroup(slotTable, (GroupSourceInformation) obj);
                }
            }
        }
    }

    public final void collectCalledByInformation() {
        this.calledByMap = new MutableIntObjectMap<>(0, 1, null);
    }

    public final void collectSourceInformation() {
        this.sourceInformationMap = new HashMap<>();
    }

    public final String toDebugString() {
        if (this.writer) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('\n');
        int i2 = this.groupsSize;
        if (i2 > 0) {
            int iEmitGroup = 0;
            while (iEmitGroup < i2) {
                iEmitGroup += emitGroup(sb, iEmitGroup, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private final int emitGroup(StringBuilder sb, int i2, int i3) {
        String sourceInformation;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(TokenParser.SP);
        }
        sb.append("Group(");
        sb.append(i2);
        sb.append(")");
        GroupSourceInformation groupSourceInformationSourceInformationOf = sourceInformationOf(i2);
        if (groupSourceInformationSourceInformationOf != null && (sourceInformation = groupSourceInformationSourceInformationOf.getSourceInformation()) != null && (StringsKt.startsWith$default(sourceInformation, "C(", false, 2, (Object) null) || StringsKt.startsWith$default(sourceInformation, "CC(", false, 2, (Object) null))) {
            String str = sourceInformation;
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, "(", 0, false, 6, (Object) null) + 1;
            int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ')', 0, false, 6, (Object) null);
            sb.append(Global.BLANK);
            String strSubstring = sourceInformation.substring(iIndexOf$default, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(strSubstring);
            sb.append("()");
        }
        sb.append(" key=");
        sb.append(SlotTableKt.key(this.groups, i2));
        int iGroupSize = SlotTableKt.groupSize(this.groups, i2);
        sb.append(", nodes=");
        sb.append(SlotTableKt.nodeCount(this.groups, i2));
        sb.append(", size=");
        sb.append(iGroupSize);
        if (SlotTableKt.hasMark(this.groups, i2)) {
            sb.append(", mark");
        }
        if (SlotTableKt.containsMark(this.groups, i2)) {
            sb.append(", contains mark");
        }
        int iEmitGroup$dataIndex = emitGroup$dataIndex(this, i2);
        int iEmitGroup = i2 + 1;
        int iEmitGroup$dataIndex2 = emitGroup$dataIndex(this, iEmitGroup);
        if (iEmitGroup$dataIndex >= 0 && iEmitGroup$dataIndex <= iEmitGroup$dataIndex2 && iEmitGroup$dataIndex2 <= this.slotsSize) {
            if (SlotTableKt.hasObjectKey(this.groups, i2)) {
                sb.append(" objectKey=" + SlotTableKt.summarize(String.valueOf(this.slots[SlotTableKt.objectKeyIndex(this.groups, i2)]), 10));
            }
            if (SlotTableKt.isNode(this.groups, i2)) {
                sb.append(" node=" + SlotTableKt.summarize(String.valueOf(this.slots[SlotTableKt.nodeIndex(this.groups, i2)]), 10));
            }
            if (SlotTableKt.hasAux(this.groups, i2)) {
                sb.append(" aux=" + SlotTableKt.summarize(String.valueOf(this.slots[SlotTableKt.auxIndex(this.groups, i2)]), 10));
            }
            int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i2);
            if (iSlotAnchor < iEmitGroup$dataIndex2) {
                sb.append(", slots=[");
                sb.append(iSlotAnchor);
                sb.append(": ");
                for (int i5 = iSlotAnchor; i5 < iEmitGroup$dataIndex2; i5++) {
                    if (i5 != iSlotAnchor) {
                        sb.append(", ");
                    }
                    sb.append(SlotTableKt.summarize(String.valueOf(this.slots[i5]), 10));
                }
                sb.append("]");
            }
        } else {
            sb.append(", *invalid data offsets " + iEmitGroup$dataIndex + Soundex.SILENT_MARKER + iEmitGroup$dataIndex2 + '*');
        }
        sb.append('\n');
        int i6 = i2 + iGroupSize;
        while (iEmitGroup < i6) {
            iEmitGroup += emitGroup(sb, iEmitGroup, i3 + 1);
        }
        return iGroupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i2) {
        return i2 >= slotTable.groupsSize ? slotTable.slotsSize : SlotTableKt.dataAnchor(slotTable.groups, i2);
    }

    private final List<Integer> keys() {
        return SlotTableKt.keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.parentAnchors(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> dataIndexes() {
        return SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
    }

    public final List<Object> slotsOf$runtime_release(int i2) {
        int length;
        int iDataAnchor = SlotTableKt.dataAnchor(this.groups, i2);
        int i3 = i2 + 1;
        if (i3 < this.groupsSize) {
            length = SlotTableKt.dataAnchor(this.groups, i3);
        } else {
            length = this.slots.length;
        }
        return ArraysKt.toList(this.slots).subList(iDataAnchor, length);
    }

    public final Object slot$runtime_release(int i2, int i3) {
        int length;
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i2);
        int i4 = i2 + 1;
        if (i4 < this.groupsSize) {
            length = SlotTableKt.dataAnchor(this.groups, i4);
        } else {
            length = this.slots.length;
        }
        return (i3 < 0 || i3 >= length - iSlotAnchor) ? Composer.Companion.getEmpty() : this.slots[iSlotAnchor + i3];
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object obj) {
        return new SlotTableGroup(this, 0, 0, 4, null).find(obj);
    }
}
