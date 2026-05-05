package androidx.compose.ui.util;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.google.firebase.sessions.settings.RemoteSettings;
import defpackage.Architecture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: ListUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d̉=!,i\bӵLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007njG;LeN.ZS8\u0018s{BBc$wHCU(Ԃ*\tUQog|db\u000bI\u0010\u000e\u0016\u000fj4Ikxe\u0012\u00156JoM9UoCBhtD\u0011(2(>\u0002\u0005\u000f72H\u0016w\u0003CY\u0019\u001a0F|R\n\u001b˟\u001d\u001a@\u0005^\"\u0007Ȧjgv:vmF:\u000e%3mPQ?_v|}\u001fTX?\u001b\u0007c.+\u00077E\u00175S1\rhZm\b\u0006qݘ\th5.C\u007f\u0002_NX.\u001d5-UՕkrNb\u0015Sp\fm+}m{`\u001c3\u0010\u0007\f\u000fL\u0004T\u00067J>-Ho6\u0013yφxԢ@V\nbH~\u000baD\u0016=6A7Q\u001b\u0015Z\u0002=\u001f\u05cbE{-\u0013.%\u0011ng[\u0003\u0018\u0011%)_\u0010]ASP=\u000fN\u001a[Mm2y\u0011\u0007pʽ6ϝ\u007f5\u0004\u00154\u001657i8;cy\u000f`Jwx\u0015`/S\u0018\\hB(Â$7J\u000b\u0012YRr-q`Vh,WMJ^7\u000e\u0016\"8h\b>1%VN_jyj\u0014k8*uϐ=խnq\u0016[?]C5_b(\u001e`\u0007,ELd\u0015X-B\u0002\u0016z^.ί@H\u0013\u0016\b}TNR\u0013`I\",B7I%l\u0017X\u0003dBQ~\u0019_\tq>\u0004\u001bգ*ѳi*|\r\u0007Olp}f\u0011i:\u000ex(=Ca5_&\u0004,\t:\u0003Ƚ\u0015~\u001c\u007fuytO\\p&wkzf\u0016HCijK&'~o2\"/Kɣ\u0001eyS\")\u000b|@\u000fir^w\u0016u\t8plZO\u001b\u00172xnrQ\u0011\u0013\u0005@ӚLڬGi\\\u000fa=Yr\u0011X\u0084R8\u000b\u00197[3\u0016\b$\u00134sCG\u001f\u001cߐ\"/=gmk\u007f.@b=0%u\u00127{\"\u007fda]x;HKi~l+RqIܰN۶w\u000eJ\r:\fCHOcވZ8[\u001fGFt\u001dD\u0013\u0001Xk:Y\u0007,>Na0ϒQ}4`I$\u001fd{m}o[\\QJ=\u0014;\u0012?r*.M\"fW)\t@\u000e\u0004\u001eFCKbKS7<b1\u0003ޑ\u0011͒To\u000e\u0014\u0001~V_\u001d\u0016J!\u0002Tn\u000e\u001b\u0010|XNγnE\u0001#0\u007f\r&[$\t7A\u00054F\u00039\u00146\u000fm5\ta\u0002\u007f$t@CedJ+7\u001f\u0018խIgIf\u0012<\ne9oqu2W(~-B^\u001bIS!_=G\r'\u001c̫TЉv\u0018nVT!9~\t|ɽ@\n\u001d+1\u0006\u0001\u0011z-zM\u00189I\u05ce\u000f\u0017l/\u0017\u000e\rc\r\u001b[\u0010e=Kk\u0003 7}gS\u0002}\u0018\"0'2sOa\u001eʱlō]!B\u001aw\u0015r\u0002\u0017\u0012h\\\u0012Qbt!\tN\n<О\u00103*\u0019n[{wg@U5\u001d\u001cPm\u0001\u000b\u001ae|c\u001dy\u001b\u0005v1\u001dy~/`\u001d7&{JŸ́`ϓ\u0011Y(\\\u0017~$\u00154\u001eN>pN(O\u0012g\u0011mU܀\u001b+Wq:cA0\u0019\u001e,)*\u0006\u0012Ll4%=fM\u0005d\u0019^|B\u0006\r\ron˶z׆)\u001a\u0005\u0003N]!\u0013BE\u000b\u001arUO\u0019e\u0003-IfԂ\u0012Ei0'0`fC;`\fX(U\u0013+@rv\u0010*\t\t!\n\u00180;nl=`N\n*sd\u0011OcEfH82\u0017\u000e\u001fYr8ND\r \";_^Y\u0019?\u0007E>\fo\u0015EMj\u007fwU0\u0007|\u000f:Wy_qj\b=r13'}+Yv;k5uN7\f0k`}{h\u001d\u000fˋ0ICs6Xco\u0018\nMTD\b{߿\u000eEYN:al@\u001ds\u0006\u000eV0<nRL_l'y:2o\u0018\u0002\u000fsabG+\u001a\u001fDLUEl5K}n\u007f\u000bR9]\u0014e36/9\u0017\u000b=gqn1y\u0007S/jaT!\u0004\u0006J2(6\nIPYX\fC\u0011\u0003h\u0003({\u0003w\u0012N\u0011S\r$y7ׯn\u007f\t#()[v\r6\u000b\u0003}Qp\u0016X\u001b4`>BR\u000b\u0016\u0018>HE\u000b,O'ŏ\u0019ЧGyIK\u0018U\f!+\u0010ئ)\u00063{\u0003\nM\b\n^M;C\u000b4a\u0007?\u0006^\u000bǹ/K\u0005-\u001b~xBVMf@**\u001f\u0006<O\u0015X\u001eH\u0011P8o@0vP\u000f\\S]G3MB\u001cǤk܂2h?_j\u0010;7emj-1`\u0011\b\u0013\u0012Q\u0019Y\"L]Y4)ё\u001b1^}\u000e[Wl%sY\u0012\u0013a\u0011!]\u0010oTOO\u0005wuP)fm#Ǯ$1*##*h\u0006#k\u0014(\u00067\\8f)\u000fKi\u0013vB1&)\u0011R˟\u0012ގU\fE\n\u0017a,5I^X\u0006<&!M_l\f*,\u0007\u0015~yOKΎ\u0004\u0019^3w\u0010qf\b\u001a~SlX\u0005\u0017\u00060p:\u0010\u001e5Iq\rX8^;Ƭgwp\u0011df\u0017wDm6j 'vfNc\u0005<Xp)he|ahr~OȩvֶA\u0016jp2&FHx\u0018\u0019EY\u0018/\u001aGF\u0007#.Jh,\u0002$Yԥ3Gj\b\u0014io\u000f=\u0002m5F\r6,+\u001f5Ptv\u001cz\u0015O@\u00042/BJjB2,!>\u001cmNɕ\u0014۫|\u000b4rYQau-q|Z1U2A\u001eqg#\u0019и'<(4SW\t\u0006xj+.\n>G\u001aR\u007f;ΖQsBJ\u0006+w:m 9}0wN\u0017\u001c\u0016\u0012\u001eb#\u0016\"\u0013!k2e\u0004\u0017[LY\b\u0002\u001a$9$N,U\u0007\u000fϼPޡ\")\t\u0013<\u0017Zf|xθ\re\u001aj\rC\u001cn\u0006@\ne$gTCCφk~e95p\u0016bqs\u000f-W\u000e\u0010-h\rts\u0006]MT\\25y4A\u001e\u0003xgR\u0019\b\b)4{<\fGI+\u0019Ptߕ`ɜnr~Tg\u000fM\u0016\u001b\u0013حBs77Xrm\u001f\u007f\u0002Q\b74WSKژ\u0019D14f1L)7Nhh\u001e\u001bH\u001cy\"B\u001cIG\t@\u0012\u0015\n\u000e\u0018s_1\u007fT{*?\n>\u0016F\u001f\u00105\u007f$\"U%ڎmϫ\t[+\u0012-m_\b\u007f/ߐK]h_G)\u0016NbhbOSA'n4֖\u0005r7K\u001b\u00018\\J#Sg)gKM\u001bx\u0006ncf\u000b\u001e5[\n1`\u000e\u00140+M/\u0018\u001e$N\u007f\u0005]DO<\u0018nMYº ß.\u000e\u001c\tkK\u00155\u0018@ׯCS~-CRm Z\u0005SgA*\u0011ě6$\r\u0019u\u00146\"k\u0013=]\u0016\u000f \u001eY%O-\u007f\u0001+?@+8v P\u001a\")!ށ\u0004+OM@y\u000fk\\o\u00044\u0011\u000fzyn\u0010\u0016qL_\u000fw|\bV,l͔AҁbbL+a'T\u0017\u001c\u001dҕ.$@O\u0007f)!\u0001}\u001e\u001brd\u0018ĈBn]^P7;#G&/\u000b93k:,JiWVdUf\u0007RS\u0012\r\u0019lnCϓ7ڰ\u0004\fSi8\u001bII\b \u0004/NgBh$&u\fS\u0013~7:8eԉ09\\\u001dy/\r.1Bpt\u0012un\u0017\u0003\u000b\u00011xI\u000efO6lp\tq\n1`R\bd\u001d9JK4<yg3\\u1bEӵAS+2\u001d%p*\u0005\u0005#;\u0018%n;O\u0011L;ܠF\t<\u000eSpD\u0014,6\u001azH,y6>B)\u0016X2XʖTɶWwl\u0017g3\u000e:[\u001a\u001a'WQ%,3/\u001b\u001bp\u001azNq5r˶UU\u0017^\u0013\u000e?T\u0012M@N\u0006zD\u001c`{p\u000e\u0001e\u0004HU\u0002()\u000bIA4\u0012\f\u0017L\u007f~@IXc9^Xۯ8Ė\u001e\u0006#ZlHDH\u0004[Ӈp)"}, d2 = {"/o_2a+\u001eZ\u0019\u0007zg;", "", "\"", "\u001aiPCTuEO\"\u0001D:7\b\t8d{%\u0003@V", "\u001aj^A_0G\u001d(~\u000emuX\u0014:e\t'w=\b\u0017l", "3kT:X5M", "BqP;f-H`!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "uKY.i(\bZ\u0015\b|(\b\b\u0014/n~$xG\u0001l}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011R:($oeBPh=V@(WUL;`\\{K]rj\u0017L:\u0011\u000fb\ry25", "4`bA43E", "", "", ">qT1\\*:b\u0019", "4`bA45R", "4`bA70Lb\u001d\bxm\t\u0011", "\u0019", "Ad[2V;H`", "4`bA90Eb\u0019\f", "4`bA90Eb\u0019\fch;e\u00196l", "", "4`bA90Ka(", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f.\u0006O\b\u001b \u0011t\u001fD@&Eb{/;w\u001f<\u0017$Kt2-\u0019rj\u0005\\'\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001", "4`bA90Ka(h\bG<\u0004\u0010", "4`bA93:b\u0001z\u0006", Global.BLANK, "", "4`bA96ER", "7mXA\\(E", "=oT?T;B]\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "/bR", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`\u001eCx\u0010\u0006`\":Y{/\rT\u001c8\\J?t}#&p+:\u0017l*]z1PZ\u0018\rl[pL\u0018\u001ccZ$ns\nUR 8K3(\nu3~@h~\u001bk", "4`bA96K3\u0015|}", "/bc6b5", "4`bA96K3\u0015|}B5{\tBe~", "", "4`bA96K3\u0015|}K,\u000e\t<s\u007f'", "4`bA=6B\\\b\t", "\u000f", "0tU3X9", "Ad_.e(M]&", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`\u001eCx\u0010\u0006R0@Y\u0007\u001f3j\u001d.#*@gE\u001a^o]B\t-\nQr45LZ<\\[p=ix_\n_'V\fUJ&8\":\u001b\u0015\u001aI\u000eKh\n\n\u0016c\u001colSRYNu\u001ew\u000b\u0007kBfMySQEk(daC\u0004a6K ]x\u0015$j\u001a\f\rw`~r^\ngpE\u0019P\u001f*H|bJN9ZM|p [\u0005u!6b}9>\u000e\u0014=(Eh\u000fT3m\u0002E}\u0011=X\u000b.\"?>\\\u001bVnuu=\ne&a]", "4`bA=6B\\\b\thm9\u0001\u00121", "", "4`bA?(Lb\u0003\fcn3\u0004", "4`bA@(I", "4`bA@(I7\"}zq,{", "7mS2k", "4`bA@(I7\"}zq,{q9th8\u0003G", "4`bA@(I<#\u000ecn3\u0004", "4`bA@(IB#", "\u0011", "", "2dbA\\5:b\u001d\t\u0004", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`'Vs\u0015\u0006T/<`}\u001eFq 7#*AuC%\u0019q+>\u0018kuO\u00070E[R6e`<\u001e$\u001bX\u001dR5\u0016P/\u0005\u000bs@H\u001bQ<X\u0006B2^\u0016\u001d\u00155h\u007fF`\u0019\u001d", "4`bA@(Q0-", "", "4`bA@(Q=\u001ah\bG<\u0004\u0010", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f.\u0006O\b\u001b \u0011t\u001fD@&Eb{/;w\u001f<\u0017$Kt2-\u0019rj\u0005\\'\u0013Sr8C\u0016U(eT<\u001b\u001e\u001ae\n['\n\fY\u0017", "4`bA@0G0-h\bG<\u0004\u0010", "4`bAE,=c\u0017~", "!", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f.\u0006O\b\u001b \u0011t\u001fD@&Eb{/;w\u001f<\u0017$Kt2-\u0019rj\u0006\\'\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001", "4`bAF<F0-", "4`bAM0I", "$", "=sW2e", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "4`bAM0IE\u001d\u000e}G,\u0010\u0018", "Ch\u001cBg0EM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ListUtilsKt {
    public static final <T> void fastForEach(List<? extends T> list, Function1<? super T, Unit> function1) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            function1.invoke(list.get(i2));
        }
    }

    public static final <T> void fastForEachReversed(List<? extends T> list, Function1<? super T, Unit> function1) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i2 = size - 1;
            function1.invoke(list.get(size));
            if (i2 < 0) {
                return;
            } else {
                size = i2;
            }
        }
    }

    public static final <T> void fastForEachIndexed(List<? extends T> list, Function2<? super Integer, ? super T, Unit> function2) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            function2.invoke(Integer.valueOf(i2), list.get(i2));
        }
    }

    public static final <T, R> List<R> fastMap(List<? extends T> list, Function1<? super T, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(function1.invoke(list.get(i2)));
        }
        return arrayList;
    }

    public static final <T, R extends Comparable<? super R>> T fastMaxBy(List<? extends T> list, Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return null;
        }
        T t2 = list.get(0);
        R rInvoke = function1.invoke(t2);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t3 = list.get(i2);
                R rInvoke2 = function1.invoke(t3);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    t2 = t3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return (T) t2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    public static final <T> T fastLastOrNull(List<? extends T> list, Function1<? super T, Boolean> function1) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i2 = size - 1;
            T t2 = list.get(size);
            if (function1.invoke(t2).booleanValue()) {
                return t2;
            }
            if (i2 < 0) {
                return null;
            }
            size = i2;
        }
    }

    public static final <T> List<T> fastFilter(List<? extends T> list, Function1<? super T, Boolean> function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t2 = list.get(i2);
            if (function1.invoke(t2).booleanValue()) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapIndexed(List<? extends T> list, Function2<? super Integer, ? super T, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(function2.invoke(Integer.valueOf(i2), list.get(i2)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapIndexedNotNull(List<? extends T> list, Function2<? super Integer, ? super T, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            R rInvoke = function2.invoke(Integer.valueOf(i2), list.get(i2));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(List<? extends T> list, Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return null;
        }
        R rInvoke = function1.invoke(list.get(0));
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = function1.invoke(list.get(i2));
                if (rInvoke2.compareTo(rInvoke) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return rInvoke;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, Function2<? super T, ? super T, ? extends R> function2) {
        if (list.size() == 0 || list.size() == 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        Architecture architecture = list.get(0);
        int lastIndex = CollectionsKt.getLastIndex(list);
        while (i2 < lastIndex) {
            i2++;
            T t2 = list.get(i2);
            arrayList.add(function2.invoke(architecture, t2));
            architecture = t2;
        }
        return arrayList;
    }

    public static final <S, T extends S> S fastReduce(List<? extends T> list, Function2<? super S, ? super T, ? extends S> function2) {
        if (list.isEmpty()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S sInvoke = (Object) CollectionsKt.first((List) list);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                sInvoke = function2.invoke(sInvoke, list.get(i2));
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return sInvoke;
    }

    public static final <T, R, V> List<V> fastZip(List<? extends T> list, List<? extends R> list2, Function2<? super T, ? super R, ? extends V> function2) {
        int iMin = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(function2.invoke(list.get(i2), list2.get(i2)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapNotNull(List<? extends T> list, Function1<? super T, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            R rInvoke = function1.invoke(list.get(i2));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 + 1) - (1 | i3) != 0) {
        }
        if ((2 & i3) != 0) {
        }
        if ((4 & i3) != 0) {
        }
        if ((8 & i3) != 0) {
            i2 = -1;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
        }
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        return fastJoinToString(list, charSequence, charSequence2, charSequence3, i2, charSequence4, function1);
    }

    public static final <T> String fastJoinToString(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        return ((StringBuilder) fastJoinTo(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, function1)).toString();
    }

    public static final <T, K> List<T> fastDistinctBy(List<? extends T> list, Function1<? super T, ? extends K> function1) {
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t2 = list.get(i2);
            if (hashSet.add(function1.invoke(t2))) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(List<? extends T> list, Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return null;
        }
        T t2 = list.get(0);
        R rInvoke = function1.invoke(t2);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t3 = list.get(i2);
                R rInvoke2 = function1.invoke(t3);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    t2 = t3;
                    rInvoke = rInvoke2;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return (T) t2;
    }

    public static final <T, R> List<R> fastFlatMap(List<? extends T> list, Function1<? super T, ? extends Iterable<? extends R>> function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            CollectionsKt.addAll(arrayList, function1.invoke(list.get(i2)));
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilterNotNull(List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t2 = list.get(i2);
            if (t2 != null) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    static /* synthetic */ Appendable fastJoinTo$default(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        int i4 = i2;
        CharSequence charSequence5 = charSequence;
        CharSequence charSequence6 = charSequence2;
        Function1 function12 = function1;
        CharSequence charSequence7 = charSequence4;
        if ((i3 + 2) - (i3 | 2) != 0) {
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
        }
        CharSequence charSequence8 = (i3 + 8) - (i3 | 8) != 0 ? "" : charSequence3;
        if ((i3 + 16) - (i3 | 16) != 0) {
            i4 = -1;
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            function12 = null;
        }
        return fastJoinTo(list, appendable, charSequence5, charSequence6, charSequence8, i4, charSequence7, function12);
    }

    private static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        a2.append(charSequence2);
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            T t2 = list.get(i4);
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            appendElement(a2, t2, function1);
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable appendable, T t2, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        if (function1 != null) {
            appendable.append(function1.invoke(t2));
            return;
        }
        if (!(t2 == 0 ? true : t2 instanceof CharSequence)) {
            if (t2 instanceof Character) {
                appendable.append(((Character) t2).charValue());
                return;
            } else {
                appendable.append(String.valueOf(t2));
                return;
            }
        }
        appendable.append((CharSequence) t2);
    }

    public static final <T> boolean fastAll(List<? extends T> list, Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!function1.invoke(list.get(i2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(List<? extends T> list, Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (function1.invoke(list.get(i2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    public static final <T> T fastFirstOrNull(List<? extends T> list, Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t2 = list.get(i2);
            if (function1.invoke(t2).booleanValue()) {
                return t2;
            }
        }
        return null;
    }

    public static final <T> int fastSumBy(List<? extends T> list, Function1<? super T, Integer> function1) {
        int size = list.size();
        int iIntValue = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iIntValue += function1.invoke(list.get(i2)).intValue();
        }
        return iIntValue;
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c2, Function1<? super T, ? extends R> function1) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            c2.add(function1.invoke(list.get(i2)));
        }
        return c2;
    }

    public static final <T, R> R fastFold(List<? extends T> list, R r2, Function2<? super R, ? super T, ? extends R> function2) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            r2 = function2.invoke(r2, list.get(i2));
        }
        return r2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public static final <T> T fastFirst(List<? extends T> list, Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t2 = list.get(i2);
            if (function1.invoke(t2).booleanValue()) {
                return t2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
