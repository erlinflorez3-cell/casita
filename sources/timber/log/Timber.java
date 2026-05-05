package timber.log;

import androidx.exifinterface.media.ExifInterface;
import com.drew.metadata.exif.makernotes.FujifilmMakernoteDirectory;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZO;
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0007WيN\r^B-!d\u0013x\ti+>6DͿL.`S֜\u0013o"}, d2 = {"\u001asX:U,K\u001d \t|(\u001b\u0001\u0011,e\r}", "", "u(E", "\u0012dQBZ\u001bKS\u0019", "\u0014na2f;", "\"qT2", "Bh\\/X98`\u0019\u0006zZ:|"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class Timber {
    public static final Forest Forest = new Forest(null);
    private static final ArrayList<Tree> trees = new ArrayList<>();
    private static volatile Tree[] treeArray = new Tree[0];

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLcz\u0004I\u0006>)6B\r.4\u0012}\u000bnjO0L͜P.`S2şs{B*c$wCCU(~*\tUNm{\u0005Ϻx\u001ds\u000f4\u00151i>\nXޯa\u0012\u001d2\u000b\u007fM;eqS8\u000fwf\t.;:8(\u000fG,rr\u001e\u0002\u0013Cy\u0018B4N}RR;[5  \u000bV\"\u0017\u001d\u000bj~:V{u:]&3oP^?aF{{\u001e\rfw'\u0005b69PAE\u001dCW+\thZm\u0006mtk\u0007?Ѫ)ȅMs_̬)\u0014\"\u001aCQ#\\!)\u0013S(ӱ\u000eˏ/S{MV\u00146~ߧ\u007f "}, d2 = {"\u001asX:U,K\u001d \t|(\u001b\u0001\u0011,e\rfZ@}'\u00196|\u000e<L", "\u001asX:U,K\u001d \t|(\u001b\u0001\u0011,e\rfjM\u0001\u0017l", "u(E", "4pR;<.G]&~", "", "", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "B`V", "5dc!T.|b\u001d\u0007w^9v\u0016/l\u007f$\n@", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1qT.g,,b\u0015|\u0001>3|\u0011/n\u000f\u0017wB", "3kT:X5M", "\u001aiPCTuEO\"\u0001DL;x\u00075T\r$y@`\u001e\u0017Oo\u0017KL", ":nV", "", ">qX<e0Mg", "", ";db@T.>", "B", "", "\u0011n\\=T5B]\"", "Bh\\/X98`\u0019\u0006zZ:|"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static class DebugTree extends Tree {
        private static final int MAX_LOG_LENGTH = 4000;
        private static final int MAX_TAG_LENGTH = 23;
        private final List<String> fqcnIgnore = CollectionsKt.listOf((Object[]) new String[]{Timber.class.getName(), Forest.class.getName(), Tree.class.getName(), DebugTree.class.getName()});
        public static final Companion Companion = new Companion(null);
        private static final Pattern ANONYMOUS_CLASS = Pattern.compile("(\\$\\d+)+$");

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\rnj?0JͣIDɟ\u0004*=j<9*[ҸuCIUj\u00120\ngV\u0006j\u0017Lp\nq\u00114\u0018O̖.֒Yxe܈_>PsW3{t\u0014ʣ3ҽ:\u0005(݅rD\b\u000b\u0019\u001aXMf͏MŲO\f\u001aؓϴtA"}, d2 = {"\u001asX:U,K\u001d \t|(\u001b\u0001\u0011,e\rfZ@}'\u00196|\u000e<5\u0003?a\t\u001c@q 7#", "", "u(E", "\u000fM>\u001bL\u0014(C\u0007xXE\bjv", "\u001aiPCTuNb\u001d\u0006Dk,~\tB/j$\u000bO\u0001$ \u001d", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "\u001b@G,?\u0016 M\u007f^c@\u001b_", "", "\u001b@G,G\b M\u007f^c@\u001b_", "Bh\\/X98`\u0019\u0006zZ:|"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        protected String createStackElementTag(StackTraceElement stackTraceElement) throws Throwable {
            Intrinsics.checkNotNullParameter(stackTraceElement, Wg.vd("!)\u001f(%/2", (short) (OY.Xd() ^ 23541)));
            short sXd = (short) (C1580rY.Xd() ^ (-21242));
            short sXd2 = (short) (C1580rY.Xd() ^ (-8885));
            int[] iArr = new int["\r\u0003\u0017\u0001L\n}\n\u0002Gk\fwx\u007fg\u0005rstSyqxow|".length()];
            QB qb = new QB("\r\u0003\u0017\u0001L\n}\n\u0002Gk\fwx\u007fg\u0005rstSyqxow|");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(hg.Vd("\u001e\u001b)v\u001f\u0013$#|\u000f\u001a\u0011", (short) (C1607wl.Xd() ^ 19261), (short) (C1607wl.Xd() ^ 19367)), new Class[0]);
            try {
                method.setAccessible(true);
                String str = (String) method.invoke(stackTraceElement, objArr);
                Intrinsics.checkNotNullExpressionValue(str, C1561oA.ud("\u0018\u001e\u0016\u001d\u0014\u001c!Y\u000e\u0016\n\u001b\u001as\u0006\u0011\b", (short) (C1607wl.Xd() ^ 10755)));
                String strSubstringAfterLast$default = StringsKt.substringAfterLast$default(str, '.', (String) null, 2, (Object) null);
                Matcher matcher = ANONYMOUS_CLASS.matcher(strSubstringAfterLast$default);
                if (matcher.find()) {
                    strSubstringAfterLast$default = matcher.replaceAll("");
                    Intrinsics.checkNotNullExpressionValue(strSubstringAfterLast$default, C1561oA.yd("!b$\u0018(%\u0017\u001a!}&'gb_g", (short) (OY.Xd() ^ 4202)));
                }
                strSubstringAfterLast$default.length();
                return strSubstringAfterLast$default;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // timber.log.Timber.Tree
        public String getTag$timber_release() throws Throwable {
            String tag$timber_release = super.getTag$timber_release();
            if (tag$timber_release != null) {
                return tag$timber_release;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, C1561oA.Yd("r\b\u0013\u0011\u001a\u0005\u0007\u0012\fOQW\u001e \u000e\u0011\u001a\u0004#\u0013\u0016\u0019", (short) (C1580rY.Xd() ^ (-1144))));
            for (StackTraceElement stackTraceElement : stackTrace) {
                List<String> list = this.fqcnIgnore;
                Class<?> cls = Class.forName(Xg.qd("[SiU#bXf`(Np^ajTscfiJrlunx\u007f", (short) (C1607wl.Xd() ^ 6301), (short) (C1607wl.Xd() ^ 28330)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (C1633zX.Xd() ^ (-12287));
                short sXd2 = (short) (C1633zX.Xd() ^ (-13155));
                int[] iArr = new int["J;),0LZ]7nU\u0003".length()];
                QB qb = new QB("J;),0LZ]7nU\u0003");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    if (!list.contains((String) method.invoke(stackTraceElement, objArr))) {
                        return createStackElementTag(stackTraceElement);
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            throw new NoSuchElementException(ZO.xd("aiI\u000e\u000bMzy*4+Uxy<S\u0017Aje*o\u0014\u001bBq\u001d</\nxk\u000f(\f!;P\u0006:2\u0004]H@VY\b\r", (short) (OY.Xd() ^ FujifilmMakernoteDirectory.TAG_BLUR_WARNING), (short) (OY.Xd() ^ 18541)));
        }

        @Override // timber.log.Timber.Tree
        protected void log(int i2, String str, String message, Throwable th) {
            int iMin;
            Intrinsics.checkNotNullParameter(message, "message");
            if (message.length() < MAX_LOG_LENGTH) {
                return;
            }
            int length = message.length();
            int i3 = 0;
            while (i3 < length) {
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) message, '\n', i3, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = length;
                }
                while (true) {
                    iMin = Math.min(iIndexOf$default, i3 + MAX_LOG_LENGTH);
                    Intrinsics.checkNotNullExpressionValue(message.substring(i3, iMin), "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (iMin >= iIndexOf$default) {
                        break;
                    } else {
                        i3 = iMin;
                    }
                }
                i3 = iMin + 1;
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLcz\u0004I\u0006>\u001a6B\u0005\"4\u0012\u0006\rnj?0Le^.ZS0\u000fs{B$cҕyCIa\"Ԃ*\t]ȞogtJb\u000bQ\u0010\u000e\u0016~k4Ic\u0017e\u0012\u0015?HĪ@Iݹ =g_5;\u000b ݨ&8\b\u0005I!8Q(v)B\u0012à\u0018xo~Dj\r{\u0010J\u001a\f=.\r6^}MdU\u001dqH=;\ryHT&o2\u0013L;U\u0003)-xw\u001dYO}Jչ)S\u0011\u0017\u001bkM\rWqk\u0010\u0019-5<aum5\u0007\u0012Z*s\t\u001bg\u000b&\u000b\u0010\u0002f\u001a8CQyJ~ X\u007f\u0001z\u001bH\u001c\u0010\u001c&v;].t\u0016&=\u0005xY?`\u0004tA.\n\u001087'\u00162YHa{Ђe;'a\u007f+\u0013!6#/yQcZ\rn!3V\u000eP_^pQV\\\"cMs\nor\u0004@\u0003^V.1\u001c\u0013D\u0016SF\"N؝%k\u0010X\rw\u0005\u0019xh\u0002t\u0003NN3\u0007\u0018M)7\u001e!Y->ydlXZ\u001c}\"b\u0018\u0016\n)\u001f\u000b\nl)+\u000f\\[\u0001k\u0001L\f\u0017UCtEqx{\u0014]8n5KP\u0012\u001f\u0010T\u0017\u0016U;\u0011\u0014\u001f{͞W\fhop.@]\u0003\u0016\b}TN:\u0012`U8!|[?0t\u0015v\u000eNJG{\u0017krj&}\u0003@T\u0017w2\r\u0013\u0011Vbo\u007fi\u000fHZ\f\u000f$MCg4G5\u001c7מ8|1\u0017G\u0004\u000e^\u007fLuW\u001d\u001c\u0004f\u0014\",\u0019gcuR[H\r@J\u0002[P|xsbe\u0014=y+\f?Cn-u\u0014\u0003rB_\u0019W\u007fh%0\u000fh\u0003)\u000ec\u0010{wE)V\u0012V+]TH!\u0012 Qҡ<|\u00132f\\\u000f\b:|c8s++/\u0010\u0014]\u001a\u0012eon<\u0006z\u0011<s\u0014\u0011\\w$}z[m8A7Y[\u0015=P3\u001b\u0005bJ\u0001v6QOI٢7HO~9\u0001Fe#/,q70\u001b\nn[h\u0018 \u0004BIw,\nB,!\u000fG3\u001deS\u0016z\u001eQj\u001cb\u0011 \n*C5$dU.nob7;6w&OY;\u0011\nl\u000f2ED>\u001e\nqf0\u001bX<\u000e^w\u000fE=rwIo&T'a\u0007N\u0013q]b7)/\u0011?;$wC=\u001do\\S]pb\u0015a+!%zU\u0005e5-ZSg*VZ!\r[\\qXHK\u0086K){\b8+F5\u0015\u001dp#KI_\u0018w~@b\u0011TtN\u0013u@hrNP(E\u007fէ\u0012<\u0018-S']\u0010\bb[W~{Eb2\u0001ECo\fT\u000bqa3-44]AW\u0006,'*d\u001a@F\u0016.@?\u0004#,\r[\u001c\u0006\"]I9\\v^h\u0010*+PN\u000ftO=\"\u0018P 6}\rc\n\u0019]gw\u0010#V&Yy6VYv\u0011\u0014srime\r\u0019e_e(pMR3\bU\\t(͠^:\u001fchh\u001f\",\u0015T*f\u000ep:(Qyg\u001f}\u0016pUd=\u000eBa_;\u0003$\f0\u0012w\u001a)\u0003:EC\\LLp!^\u0003A\u0006\u001b\u000f~6r\r\u00169\u001a\u0003}X`'\u0012bU! \u00051M\u0018MjS\\ֿ\u000b\u0004S\\nP?uW\u001be=;w.u\u001f\u000fRd\u000b~XO9\u0007\u000euD7VZC\u00197[:l\u0013\u0012TMe:X\u0007Z T&˲^8.N%**^i3o$A\u0007#I\u001eq\u001d\u0018c|\u0018hmc\u000f \u0019\rm\u0005aqH\u0005Ot9.=\u0002K_l:3A}N=\u000b0rz\u0013[qn\u0019q2O4U \u0010Tn\u000f8!D&\u001ctQ\u000f\fF؝._jS\u001f#e(>*dyt+Mk\u0007\u007f\".\u007f\u0017\"q\fuBO\u0013\u001e)JD)=n\u001dD{w(\rd\u000f[\u0013e\u001eL>ط\u001b|\u001e_:P9m\u000bM]g\u000eB!\u0005\u001c<H`d\f\u000eU\"c\u0014Q*T\u0012u\u001bs_p(:(\f;\u0016(9X_\u000el5\u001a=J%Sfp\u0007[Yl\u001bF\u0015#n0X\u000b9\u0015D0h\u0019\u0018|xo[(чKsOZbj\n\"5\u0017k'\u0016%\u0016iuA,ߑdؐ=5\u0013mX[\u0006tj\tm!yiaZʛn/FI\\B(0)\u0018\u001cL|N F\tDVl^8\u0007ɲ\u0001\u0082G]\tߵؤAz"}, d2 = {"\u001asX:U,K\u001d \t|(\u001b\u0001\u0011,e\rf\\J\u000e\u0017%VE", "\u001asX:U,K\u001d \t|(\u001b\u0001\u0011,e\rfjM\u0001\u0017l", "u(E", "BqT249KO-", "", ")Kc6`)>`b\u0006\u0005`uk\r7b\u007f5:/\u000e\u0017\u0017\u001d", "BqT266N\\(", "", "u(8", "BqT2f", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "/rC?X,", ExifInterface.GPS_MEASUREMENT_2D, "", ";db@T.>", "", "/qV@", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u00114", "B", "", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@V}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u00191R9\u001a&d+@\u0003l.\u0018`$LLL;2\u0016c", ExifInterface.GPS_MEASUREMENT_3D, "4na2f;", "", "7", ":nV", ">qX<e0Mg", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q6g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#\u0007,", "B`V", "uH;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l}Lk\u001f8@,1b\u007fi%|#2VE\u0011a\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(6.", ">kP;g", "uZ;A\\4;S&H\u0002h.Fw3m|(\t~o$\u0017GEQ-", "BqT2", "Coa<b;", "Coa<b;\u001aZ ", "D", ExifInterface.LONGITUDE_EAST, "EsU", "Bh\\/X98`\u0019\u0006zZ:|"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class Forest extends Tree {
        private Forest() {
        }

        public /* synthetic */ Forest(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public Tree asTree() {
            return this;
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void d(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.d(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void d(Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.d(th);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void d(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.d(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void e(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.e(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void e(Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.e(th);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void e(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.e(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @JvmStatic
        public final List<Tree> forest() {
            List<Tree> listUnmodifiableList;
            synchronized (Timber.trees) {
                listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.toList(Timber.trees));
                Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(trees.toList())");
            }
            return listUnmodifiableList;
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void i(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.i(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void i(Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.i(th);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void i(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.i(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        protected void log(int i2, String str, String message, Throwable th) {
            Intrinsics.checkNotNullParameter(message, "message");
            throw new AssertionError();
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void log(int i2, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.log(i2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void log(int i2, Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.log(i2, th);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void log(int i2, Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.log(i2, th, str, Arrays.copyOf(args, args.length));
            }
        }

        @JvmStatic
        public final void plant(Tree tree) {
            Intrinsics.checkNotNullParameter(tree, "tree");
            if (!(tree != this)) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
            }
            synchronized (Timber.trees) {
                Timber.trees.add(tree);
                Forest forest = Timber.Forest;
                Object[] array = Timber.trees.toArray(new Tree[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Timber.treeArray = (Tree[]) array;
                Unit unit = Unit.INSTANCE;
            }
        }

        @JvmStatic
        public final void plant(Tree... trees) {
            Intrinsics.checkNotNullParameter(trees, "trees");
            int length = trees.length;
            int i2 = 0;
            while (i2 < length) {
                Tree tree = trees[i2];
                i2++;
                if (tree == null) {
                    throw new IllegalArgumentException("trees contained null".toString());
                }
                if (!(tree != this)) {
                    throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
                }
            }
            synchronized (Timber.trees) {
                Collections.addAll(Timber.trees, Arrays.copyOf(trees, trees.length));
                Forest forest = Timber.Forest;
                Object[] array = Timber.trees.toArray(new Tree[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Timber.treeArray = (Tree[]) array;
                Unit unit = Unit.INSTANCE;
            }
        }

        @JvmStatic
        public final Tree tag(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Tree[] treeArr = Timber.treeArray;
            int length = treeArr.length;
            int i2 = 0;
            while (i2 < length) {
                Tree tree = treeArr[i2];
                i2++;
                tree.getExplicitTag$timber_release().set(tag);
            }
            return this;
        }

        @JvmStatic
        public final int treeCount() {
            return Timber.treeArray.length;
        }

        @JvmStatic
        public final void uproot(Tree tree) {
            Intrinsics.checkNotNullParameter(tree, "tree");
            synchronized (Timber.trees) {
                if (!Timber.trees.remove(tree)) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Cannot uproot tree which is not planted: ", tree).toString());
                }
                Forest forest = Timber.Forest;
                Object[] array = Timber.trees.toArray(new Tree[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Timber.treeArray = (Tree[]) array;
                Unit unit = Unit.INSTANCE;
            }
        }

        @JvmStatic
        public final void uprootAll() {
            synchronized (Timber.trees) {
                Timber.trees.clear();
                Forest forest = Timber.Forest;
                Timber.treeArray = new Tree[0];
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void v(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.v(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void v(Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.v(th);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void v(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.v(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void w(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.w(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void w(Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.w(th);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void w(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.w(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void wtf(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.wtf(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void wtf(Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.wtf(th);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void wtf(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.wtf(th, str, Arrays.copyOf(args, args.length));
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r.4\u0012}\u000bnjG0LeN.ZS8\u001es{:$c$\u007fDCU \u0003*\t]Wo˧vJh\u0011K\u000f\f\u001c~\u000fBկ\u0006x\f\u0011O5Բs?AM8jGi\r63*b(F\u0005\u001d\u00030)v\u0013'\u000fQW$\u001c@Fv9b\u000fc\u0004H\u00114K@\u00034[\u0016M|\\ǰa:=1KyPW?_^\u0007}\u0013Tc?\u000f\r`L;\u0007K}L3\\\u001b\u0007\u0001eo\tM\u0001U\u0007~&U;yyeAp\u0002*\u0014YR=q\u00012t\u000faf\u0012&;QyJ~\rV\u0005\u001b}#;2\rL;ρ2-(wP;A\u0007\u000bSnZ2dP\u000b\u0013cL\u0016S\u0003c?G'~[qA\u001fMG}\u001b\fL\"/{A]j\r\u000f\u0014ahɐU1_N\u0006X\\\u001cq=\u001c\u000e!h\u00109\u001c2]~]\fWB_\\EmQ#Ou2NRv\u000f\u0007vg\u0002y\u0003NN-\u0007\u0018M)7\u000f\u000bXr\u0011\u0004Zd^2\u0010]\u001ej\u0006,\u0007A-|yR S\u000f\u0015cŹmj[nRJ=yOY\u001dn>[GiK5\u007ff@o`\u0003,ILh\u000bWvDi\u000b\t[V/xZн\u0014w\nX\u0017\u001a!GWqJ7\\5'k-H1.\tAE6mp\u0001\u0010-^c*\u0011t<v\u001f\u007f~_!\u0004u\u0005a6\rf(,QSK\u0018TTPuT~9\u0006-rF[ѨPGZz^\u0006c\u00128\u0016HC\u00025K\"'\u0001?10=\f`;\u001d_c*')\u0007*\u0015IwFi\u001ei\u001f<\u0011pXZl\u00198u\ruS\u001cr\f\u0012kV\u0001Mbd\rq=wq1f\\PN{3\u001ed9˽s\"\u000bFuQ54.wBGEek\u0003\b.(|U9=}\u0012C{\u0016\u001ez\u0002c@APKo}l%Tp\u0011[`j&\"\t\u001b|BAcYd\u001f`hQ\u0019H\u0016f5F=vdfR\u0015\u0006|b1\u0010>\u0002O\u0016\u001enI+\u0010]U}l\u001cJ\u000b\u0018j\u0011 \n*05&εA ds+3>!\f\u0018dKkf\u0013U!$bFl\u000e\u0019Ilk\u001c\u000f)\u0003vc\u001d\"JB\">\u0007\u0014b\btX^\u0004\u000fU'Cr\u0019\r*K\u001e'?a\t{_l/\u0012L1Y+\u00183le}\u00155qX\u001dx)Cp\u00019O\u000eGW\u001bN\u0004uC\u001eq}\u001bP\u001a\u0013\u001cp(K?_\u001cwxF]9X\u0015br\u0003*pbT((\u000f|\u0013\rj\t=\u00189Q\tn\u0011,\u0013bߺ;C(\u001e_\u00047%$|\u0012PK1\u0014NE=w\u0005D-\nfk=\u0014\u0007N0W\n\u0003,tY$e8`KN$}.l\u0012\u000f\u0019O0\u0006DI#q8;(8e\u0001a\u0001Y^̲ow/]oXz%ZK\u0017\u0003:izn\u0007W!\u0002\u00154\u0007\u000e|9h'\u0019-S-#Zp9?RNe1\u0002*\u0014T\u001e|\u001cԖ-\u0010]q1\u0001yns\rY9\u001c0o@HT4|M\n<\u0018r\f64SV{H\u0015\u000fj{ZY$]\u00198\u0015z\u001a4,~\u0015G\r\u0014CHT~6n?=\u001f\u001ek\u000f]_5\u0003sVF#GQm\u001a}Fцs(\u0005\"Kgp\u0015\u0018*p\u0013#\u0006u7EHj<H*\n8{p\u001b0[K>A\u0018.'\r?.\tE@@r\u0019J:\u0018G¡\u001d\u0011\u000f#\u0001\u0016}'15\u0019[\u0004+8\u0010\u0015\u0003#>(A2N<n\u0001CG\u000f\u001e%\blI4Mgb&:\u0012\u0016P\rX{X%`ZLeY,\u0006mJ\u0010\u0010%#4\b\f\".D_UJar?\u0005r\u001e\u0018ڲ.6|Uktz\u001a\f\nZsHyrfy6WyB\u001ctR89\u0005\u0011USnx\u001bF#DB6=\u0013I5-{>N8T\u0557Mr[=%mJ4\f\u0004h<\u0012<\bVX[@\u0005[\"\u001bw3\"{rw\u0010f\u001c=\u0013\u0012\u0007ITv~\u000f-H-Y\u0002^8rw{D\u0013\u001fN\u001b<h>H\u0012\n\u0016\u0018DGE\u0001,W\u0001\u0017)2ur\b[̫Z{/.au3\u0007=mzIOU [k;iIDԳZ˥ib\rǹ9Mj/#\u0005;?<Mn@0)\u0007\tD\u0014;л\u0012ͭ|H@o67>Xڭ^e"}, d2 = {"\u001asX:U,K\u001d \t|(\u001b\u0001\u0011,e\rfjM\u0001\u0017l", "", "u(E", "3w_9\\*Bb\bz|", "\u001aiPCTuEO\"\u0001DM/\n\t+df2y<\bl", "", "5dc\u0012k7EW\u0017\u0003\nM(~G>i\b%{Mz$\u0017No\nJv", "u(;7T=:\u001d z\u0004`uk\f<e{'bJ~\u0013\u001e\u001d", "B`V", "5dc!T.|b\u001d\u0007w^9v\u0016/l\u007f$\n@", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ExifInterface.GPS_MEASUREMENT_2D, "", ";db@T.>", "/qV@", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u00114", "B", "", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@V}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u00191R9\u001a&d+@\u0003l.\u0018`$LLL;2\u0016c", ExifInterface.GPS_MEASUREMENT_3D, "4na:T;&S'\rv`,", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u0011*@gE\u001a^o]B\t-\u001a]\u0004+PN$", "5dc g(<Y\b\fv\\,j\u0018<i\t*", "7", "7r;<Z.:P ~", "", ">qX<e0Mg", "", ":nV", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q6g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#\u0007,", "uH;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l}Lk\u001f8@,1b\u007fi%|#2VE\u0011a\u001b#\u0011y]\u0003\u000e_5P@\u0011DQN*k(6.", ">qT=T9>:#\u0001", "D", ExifInterface.LONGITUDE_EAST, "EsU", "Bh\\/X98`\u0019\u0006zZ:|"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static abstract class Tree {
        private final ThreadLocal<String> explicitTag = new ThreadLocal<>();

        private final String getStackTraceString(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sw.toString()");
            return string;
        }

        private final void prepareLog(int i2, Throwable th, String str, Object... objArr) {
            String tag$timber_release = getTag$timber_release();
            if (isLoggable(tag$timber_release, i2)) {
                String str2 = str;
                if (str2 != null && str2.length() != 0) {
                    if (!(objArr.length == 0)) {
                        str = formatMessage(str, objArr);
                    }
                    if (th != null) {
                        str = ((Object) str) + '\n' + getStackTraceString(th);
                    }
                } else if (th == null) {
                    return;
                } else {
                    str = getStackTraceString(th);
                }
                log(i2, tag$timber_release, str, th);
            }
        }

        public void d(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(3, null, str, Arrays.copyOf(args, args.length));
        }

        public void d(Throwable th) {
            prepareLog(3, th, null, new Object[0]);
        }

        public void d(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(3, th, str, Arrays.copyOf(args, args.length));
        }

        public void e(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(6, null, str, Arrays.copyOf(args, args.length));
        }

        public void e(Throwable th) {
            prepareLog(6, th, null, new Object[0]);
        }

        public void e(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(6, th, str, Arrays.copyOf(args, args.length));
        }

        protected String formatMessage(String message, Object[] args) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(args, "args");
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(this, *args)");
            return str;
        }

        public final /* synthetic */ ThreadLocal getExplicitTag$timber_release() {
            return this.explicitTag;
        }

        public /* synthetic */ String getTag$timber_release() {
            String str = this.explicitTag.get();
            if (str != null) {
                this.explicitTag.remove();
            }
            return str;
        }

        public void i(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(4, null, str, Arrays.copyOf(args, args.length));
        }

        public void i(Throwable th) {
            prepareLog(4, th, null, new Object[0]);
        }

        public void i(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(4, th, str, Arrays.copyOf(args, args.length));
        }

        @Deprecated(message = "\u0018Y\u0001tz\b\u0001f_N)|\\\u001asAp^\u00125\f4K[\u0005Z7", replaceWith = @ReplaceWith(expression = "this.isLoggable(null, priority)", imports = {}))
        @InterfaceC1492Gx
        protected boolean isLoggable(int i2) {
            return true;
        }

        protected boolean isLoggable(String str, int i2) {
            return isLoggable(i2);
        }

        protected abstract void log(int i2, String str, String str2, Throwable th);

        public void log(int i2, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(i2, null, str, Arrays.copyOf(args, args.length));
        }

        public void log(int i2, Throwable th) {
            prepareLog(i2, th, null, new Object[0]);
        }

        public void log(int i2, Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(i2, th, str, Arrays.copyOf(args, args.length));
        }

        public void v(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(2, null, str, Arrays.copyOf(args, args.length));
        }

        public void v(Throwable th) {
            prepareLog(2, th, null, new Object[0]);
        }

        public void v(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(2, th, str, Arrays.copyOf(args, args.length));
        }

        public void w(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(5, null, str, Arrays.copyOf(args, args.length));
        }

        public void w(Throwable th) {
            prepareLog(5, th, null, new Object[0]);
        }

        public void w(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(5, th, str, Arrays.copyOf(args, args.length));
        }

        public void wtf(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(7, null, str, Arrays.copyOf(args, args.length));
        }

        public void wtf(Throwable th) {
            prepareLog(7, th, null, new Object[0]);
        }

        public void wtf(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(7, th, str, Arrays.copyOf(args, args.length));
        }
    }

    private Timber() {
        throw new AssertionError();
    }

    @JvmStatic
    public static Tree asTree() {
        return Forest.asTree();
    }

    @JvmStatic
    public static void d(String str, Object... objArr) {
        Forest.d(str, objArr);
    }

    @JvmStatic
    public static void d(Throwable th) {
        Forest.d(th);
    }

    @JvmStatic
    public static void d(Throwable th, String str, Object... objArr) {
        Forest.d(th, str, objArr);
    }

    @JvmStatic
    public static void e(String str, Object... objArr) {
        Forest.e(str, objArr);
    }

    @JvmStatic
    public static void e(Throwable th) {
        Forest.e(th);
    }

    @JvmStatic
    public static void e(Throwable th, String str, Object... objArr) {
        Forest.e(th, str, objArr);
    }

    @JvmStatic
    public static final List<Tree> forest() {
        return Forest.forest();
    }

    @JvmStatic
    public static void i(String str, Object... objArr) {
        Forest.i(str, objArr);
    }

    @JvmStatic
    public static void i(Throwable th) {
        Forest.i(th);
    }

    @JvmStatic
    public static void i(Throwable th, String str, Object... objArr) {
        Forest.i(th, str, objArr);
    }

    @JvmStatic
    public static void log(int i2, String str, Object... objArr) {
        Forest.log(i2, str, objArr);
    }

    @JvmStatic
    public static void log(int i2, Throwable th) {
        Forest.log(i2, th);
    }

    @JvmStatic
    public static void log(int i2, Throwable th, String str, Object... objArr) {
        Forest.log(i2, th, str, objArr);
    }

    @JvmStatic
    public static final void plant(Tree tree) {
        Forest.plant(tree);
    }

    @JvmStatic
    public static final void plant(Tree... treeArr) {
        Forest.plant(treeArr);
    }

    @JvmStatic
    public static final Tree tag(String str) {
        return Forest.tag(str);
    }

    @JvmStatic
    public static final int treeCount() {
        return Forest.treeCount();
    }

    @JvmStatic
    public static final void uproot(Tree tree) {
        Forest.uproot(tree);
    }

    @JvmStatic
    public static final void uprootAll() {
        Forest.uprootAll();
    }

    @JvmStatic
    public static void v(String str, Object... objArr) {
        Forest.v(str, objArr);
    }

    @JvmStatic
    public static void v(Throwable th) {
        Forest.v(th);
    }

    @JvmStatic
    public static void v(Throwable th, String str, Object... objArr) {
        Forest.v(th, str, objArr);
    }

    @JvmStatic
    public static void w(String str, Object... objArr) {
        Forest.w(str, objArr);
    }

    @JvmStatic
    public static void w(Throwable th) {
        Forest.w(th);
    }

    @JvmStatic
    public static void w(Throwable th, String str, Object... objArr) {
        Forest.w(th, str, objArr);
    }

    @JvmStatic
    public static void wtf(String str, Object... objArr) {
        Forest.wtf(str, objArr);
    }

    @JvmStatic
    public static void wtf(Throwable th) {
        Forest.wtf(th);
    }

    @JvmStatic
    public static void wtf(Throwable th, String str, Object... objArr) {
        Forest.wtf(th, str, objArr);
    }
}
