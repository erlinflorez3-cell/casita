package okhttp3.internal.http2;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.settings.RemoteSettings;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006>-6B\u0015\"4\u0012\u0006\rnj?7LeV=ZS@\u000fs{:+aӜqYП\u0006\u001a,!AOd~(sPZŲG\u000f\u0014\u0016Av:\\mx\f\u0015?6P\u0004W3{r\u0006Kn\nN\u00110428(\b\u0011\u001c:H>z)E\u0012\fbKNqR^\u001dO\u0015\u001a@\tN\"\u0011\u001e\u000bk|8ՂpcBǂ;\u0005oG\\-0<\u000bT%F\u0003+cǻ4ӿ/@?ߎe1a\u000b\u001fR\nCYӍDݘ\th/ݐ{U\u0002`NX.\u0018kۃ\"ոar.ؘU]n\u0016?+}g\"ַ`߭{z\u0004Ȟ\r\u0010\u001c\u0011?H\\1pǔZԧ7tzԟ\u0011\\\u0010jZ\u007f)e\rАwő7+Aӕ7hoH1TG}\u0015\rL2/|Ĳ_\\\u0016`#-lyWA_QשLf"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*z\n:|z", "", "u(E", "\u001c@<\u0012R\u001b(MybgL\u001bvl\u0018D_\u001b", "", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "", "5dc\u001b4\u0014\u001eM\bht?\u0010iv\u001e_c\u0011Z s", "u(;7T=:\u001d)\u000e~eud\u0005:;", "\u001eQ4\u0013<\u001f8\"\u0013[^M\u001a", "\u001eQ4\u0013<\u001f8#\u0013[^M\u001a", "\u001eQ4\u0013<\u001f8$\u0013[^M\u001a", "\u001eQ4\u0013<\u001f8%\u0013[^M\u001a", "!DC!<\u0015 A\u0013aZ:\u000b\\u)T[\u0005b z\u0005z<O", "!DC!<\u0015 A\u0013aZ:\u000b\\u)T[\u0005b z\u0005z<O\b#Z\r\u0019H", "!S0!<\n86xZY>\u0019vw\u000bBf\b", "", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*o\n;v2\u000b", "5dc G\b-7vx]>\b[h\u001c_n\u0004X'`", "u(J\u0019b2Ab(\nH(0\u0006\u0018/r\t$\u0003\n\u0004&&R<W\u001fv!4Y\u000bu", ")K^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"c\u0011R\u000e8u%B/", "1gT0^\u0013He\u0019\fxZ:|", "<`\\2", "<`\\2G6\u001fW&\r\nB5{\tB", " dP1X9", "%qXAX9", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\bnjG?Le^.ZS0\u0011s{BCcҕyCQU\"Ԃ*\t]NogtNb\u000bQ-\u000eǝ\u0001jBI]xc\u0013\u00172PxG3SzSʠ\u0011td\u0004`Q(=\n\t\u000f\u001aBH>w\u000bGY\u000e*0nsJX\u0013M\u0013\u001e*\u0006l#Ә\"\\uS~NzmR/Q\u00140B\u0017-mB\u0015M;W\u001b'U\u0005o1C@e8E)a\u0017\u001fR\nBI?:K\u0013}?'YL$[Dn\u0018\u0014C.\u0016\r&|4s\u001dWp\u000e7+}kyhV6\u0006\u0014\u0014\rj\u001e>\n5\\F-HiN\u000e{\u000b\u0001nXP0or\u0004\tuN\u0017S\u0003c/G7~Q\u0010C_N\u007f\n\u0013*6#/\rQ_b\"x\u0015IW>QyUNA`N8\\\u0006s\u0012\u0010z\u0002X\u0007vGH3\n1F\u0017SQ$=1B\u0004\u0002vU0\u0005\u0013\u0003\u0001S\u0018cxD0\u0003.7X\fRZ\rx\u0013\u000fhT\u0007/AQ*x\u001f}6\u0016P`\u0006a9%>Q\u0018vw\u0011e]86_jE\u0001\u0007k<Z\u007f^{;_\f(a\u0001\bZ?\u0005p\u0013\u0002~B\u0002\u001d\u000b`66JH\u0019\u0013>{\rT\u001a=J? -z,\u00023j\u001b`\u000b.FQ~\u001f^\tp>\u0006\u000b7b\u0007@ˍ\u0001֊\u0005Rdp}pIY:\u0007x\"[D\b9W*,Ȱtط\u0001#\u000fѨD\u0010UrdGzoLy\u0014\u007fvڎ&\u07fcU/EП_\u00117>\u001a3UN\u0003e\u007fU@4Qۣ{ӛ?h6ԖXv~.xjxR+Ϣ$Ցbr+Ψ5\f\be^zuf+ޯgƏMr\u000bʛ\rZF\u000b\u001d\u001fL(WǾ.Ŀ9-Kگm\"\u0006\u0014G\u0015\u0010l@۳0ԃf\u000f.۩Ъ\bW"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*z\n:|c\"Yy\u001f7zk", "", "And?V,", "\u001anZ6bu,])\fx^\u0002", "6dP1X9-O\u0016\u0006zL0\u0012\t\u001de\u000f7\u007fI\u0003", "", ";`g\u0011l5:[\u001d|iZ)\u0004\t\fy\u000f(YJ\u0011 &", "uK^8\\6\bA#\u000f\b\\,Rl\u0013)p", "2x].`0<B\u0015{\u0002^", "", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*o\n;v2\u000b", ")K^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"c\u0011R\u000e8u%B/", "2x].`0<B\u0015{\u0002^\t\u0011\u0018/C\n8\u0005O", "6dP1X9\u001c])\b\n", "6dP1X9%W'\u000e", "", "<dgA;,:R\u0019\f^g+|\u001c", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "/cYBf;\u001dg\"z\u0003b*k\u0005,l\u007f\u0005\u0010O\u0001t!Wx\u001d", "", "1kT.e\u000bR\\\u0015\u0007~\\\u001bx\u00066e", "2x].`0<B\u0015{\u0002^\u0010\u0006\b/x", "7mS2k", "3uX0g\u001bH@\u0019|\u0005o,\neCt\u007f6", "0xc2f\u001bH@\u0019|\u0005o,\n", "5dc\u000ea++S'~\nA,x\b/rf,\nO", "", "5dc\u001bT4>", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "7mb2e;\"\\(\tYr5x\u00113cn$xG\u0001", "3mc?l", "7rBAT;BQ{~v],\n", "", "@dP15@MS", "@dP15@MS\u0007\u000e\bb5~", "@dP1;,:R\u0019\f\t", "@dP1<5=S,~yA,x\b/r", "@dP1<5M", "4ha@g\tRb\u0019", ">qT3\\?&O'\u0005", "@dP1?0MS&z\u0002A,x\b/rq,\u000bCd \u0015To\u0016<\u007f41`a)6m)2VE\u001ft3\u001e(h`\"\u0003k,", "<`\\2<5=S,", "@dP1?0MS&z\u0002A,x\b/rq,\u000bCd \u0015To\u0016<\u007f41`a)6m)2VE$kF\u0007\u0011pa", "@dP1?0MS&z\u0002A,x\b/rq,\u000bC\u000b'&+x\r<\n)>[a)6m).L,7s4", "@dP1?0MS&z\u0002A,x\b/rq,\u000bC\u000b'&+x\r<\n)>[f IV\u00126M", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final BufferedSource source;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Reader(Source source, int i2) {
            this(source, i2, 0, 4, null);
            Intrinsics.checkNotNullParameter(source, "source");
        }

        public Reader(Source source, int i2, int i3) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.headerTableSizeSetting = i2;
            this.maxDynamicTableByteCount = i3;
            this.headerList = new ArrayList();
            this.source = Okio.buffer(source);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r0.length - 1;
        }

        public /* synthetic */ Reader(Source source, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(source, i2, (i4 + 4) - (i4 | 4) != 0 ? i2 : i3);
        }

        private final void adjustDynamicTableByteCount() {
            int i2 = this.maxDynamicTableByteCount;
            int i3 = this.dynamicTableByteCount;
            if (i2 < i3) {
                if (i2 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i3 - i2);
                }
            }
        }

        private final void clearDynamicTable() {
            ArraysKt.fill$default(this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i2) {
            return this.nextHeaderIndex + 1 + i2;
        }

        private final int evictToRecoverBytes(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.dynamicTable.length - 1;
                while (true) {
                    i3 = this.nextHeaderIndex;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    Intrinsics.checkNotNull(header);
                    i2 -= header.hpackSize;
                    this.dynamicTableByteCount -= header.hpackSize;
                    this.headerCount--;
                    i4++;
                    length--;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i3 + 1, headerArr, i3 + 1 + i4, this.headerCount);
                this.nextHeaderIndex += i4;
            }
            return i4;
        }

        private final ByteString getName(int i2) throws IOException {
            if (isStaticHeader(i2)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i2].name;
            }
            int iDynamicTableIndex = dynamicTableIndex(i2 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    Header header = headerArr[iDynamicTableIndex];
                    Intrinsics.checkNotNull(header);
                    return header.name;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        private final void insertIntoDynamicTable(int i2, Header header) {
            this.headerList.add(header);
            int i3 = header.hpackSize;
            if (i2 != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i2)];
                Intrinsics.checkNotNull(header2);
                i3 -= header2.hpackSize;
            }
            int i4 = this.maxDynamicTableByteCount;
            if (i3 > i4) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i3) - i4);
            if (i2 == -1) {
                int i5 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i5 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i6 = this.nextHeaderIndex;
                this.nextHeaderIndex = i6 - 1;
                this.dynamicTable[i6] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i2 + dynamicTableIndex(i2) + iEvictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i3;
        }

        private final boolean isStaticHeader(int i2) {
            return i2 >= 0 && i2 <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() throws IOException {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i2) throws IOException {
            if (isStaticHeader(i2)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i2]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(i2 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[iDynamicTableIndex];
                    Intrinsics.checkNotNull(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i2) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(i2), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i2) throws IOException {
            this.headerList.add(new Header(getName(i2), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> list = CollectionsKt.toList(this.headerList);
            this.headerList.clear();
            return list;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public final ByteString readByteString() throws IOException {
            int i2 = readByte();
            boolean z2 = (-1) - (((-1) - i2) | ((-1) - 128)) == 128;
            long j2 = readInt(i2, 127);
            if (!z2) {
                return this.source.readByteString(j2);
            }
            Buffer buffer = new Buffer();
            Huffman.INSTANCE.decode(this.source, j2, buffer);
            return buffer.readByteString();
        }

        public final void readHeaders() throws IOException {
            while (!this.source.exhausted()) {
                int iAnd = Util.and(this.source.readByte(), 255);
                if (iAnd == 128) {
                    throw new IOException("index == 0");
                }
                if ((iAnd + 128) - (128 | iAnd) == 128) {
                    readIndexedHeader(readInt(iAnd, 127) - 1);
                } else if (iAnd == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((iAnd + 64) - (64 | iAnd) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(iAnd, 63) - 1);
                } else if ((iAnd & 32) == 32) {
                    int i2 = readInt(iAnd, 31);
                    this.maxDynamicTableByteCount = i2;
                    if (i2 < 0 || i2 > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (iAnd == 16 || iAnd == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(iAnd, 15) - 1);
                }
            }
        }

        public final int readInt(int i2, int i3) throws IOException {
            int i4 = (i2 + i3) - (i2 | i3);
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int i6 = readByte();
                if ((i6 + 128) - (128 | i6) == 0) {
                    return i3 + (i6 << i5);
                }
                i3 += ((-1) - (((-1) - i6) | ((-1) - 127))) << i5;
                i5 += 7;
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r+4ߚ\u007f\u0007|jA0JeP.`b2\u000f\u0002{<$a*yCIU\"}(\u000fWN}gvJ`\u000bK\u000f\u00144\u0001j2Lkތ\u000e\u0012=1\u0003\u0011E8]uC9ntN\u0005N32>\u007f\u0005\u000f\u001cBH>y\u000bGY\u0010*0nuĐV\r[\u000bb\u0018\u0014O8\u0001Ln.N~NzpR/Q\u00150B\u00175mD\u0015M;G\u0005+\u001b\fy\u001eYA}5]3a\u0019\u001fR\nQ3C\u007fT\u001dhU0qI<cDp\u0018\u0014C=\u007f\u0011kr>\\3R)\u00185Dgcyb>,\u0006\u0015\u0014\rj\u001fV\u00185dF-Hx8\u0018A\u0012\u000bYPR\u0012^p\t)\u007f~33\u001fK+g-\u0017Uo[1Ne|5\u0011,D\u0019nO\\\u0005\u0012n73T&R\u0002kND`V\u001a]Mo\u001ao\u0011\u000bX\ffK>3R\u0085:ϲ)9c91+<\u0012VO\u007fv3a\u001fW(V\u001f؟.å\u001a72\u009e\\fRp\u001dk~W/\u008f\u001dܖ T\u000fâX#.i\u0010<O&FR\u000el@ҜYύ\u000e%7ω\bi|k&Wg_i9\u0010gfШ^λ\u0018?DϵUhtPk\f\t]^&pLAݠ\u0004ԞHN\u0014Ǝ\u0003K\u007f+L,_\u001a3ìTҴ\"BIґYkhl(~\u00038zѳk˨x\t\tˆ-|}w\u0011IZ}7ø9ۮU5!ğ&.v6\u0015#5\u0002JÕIѨPGT˾מyx"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*z\n:|c'f\u0002/7zk", "", "6dP1X9-O\u0016\u0006zL0\u0012\t\u001de\u000f7\u007fI\u0003", "", "CrT\u0010b4I`\u0019\r\tb6\u0006", "", "=tc", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "uHI\u0019b2B]b[\u000b_-|\u0016\u0005)p", "2x].`0<B\u0015{\u0002^", "", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*o\n;v2\u000b", ")K^8[;M^fH~g;|\u00168a\u0007q~O\u0010\"c\u0011R\u000e8u%B/", "2x].`0<B\u0015{\u0002^\t\u0011\u0018/C\n8\u0005O", "3lXA7@GO!\u0003xM(y\u0010/S\u0004={0\f\u0016\u0013Vo", "6dP1X9\u001c])\b\n", ";`g\u0011l5:[\u001d|iZ)\u0004\t\fy\u000f(YJ\u0011 &", "<dgA;,:R\u0019\f^g+|\u001c", "AlP9_,Lb{~v],\nw+b\u0007(iD\u0016\u0017\u0005G~\u001d@\u007f'", "/cYBf;\u001dg\"z\u0003b*k\u0005,l\u007f\u0005\u0010O\u0001t!Wx\u001d", "", "1kT.e\u000bR\\\u0015\u0007~\\\u001bx\u00066e", "3uX0g\u001bH@\u0019|\u0005o,\neCt\u007f6", "0xc2f\u001bH@\u0019|\u0005o,\n", "7mb2e;\"\\(\tYr5x\u00113cn$xG\u0001", "3mc?l", "@db6m,!S\u0015}zk\u001bx\u00066e", "EqXAX\tRb\u0019l\nk0\u0006\u000b", "2`c.", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "EqXAX\u000f>O\u0018~\bl", "6dP1X9\u001bZ#|\u0001", "", "EqXAX\u0010Gb", "D`[BX", ">qT3\\?&O'\u0005", "0hc@", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(int i2, Buffer out) {
            this(i2, false, out, 2, null);
            Intrinsics.checkNotNullParameter(out, "out");
        }

        public Writer(int i2, boolean z2, Buffer out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.headerTableSizeSetting = i2;
            this.useCompression = z2;
            this.out = out;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i2;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r0.length - 1;
        }

        public /* synthetic */ Writer(int i2, boolean z2, Buffer buffer, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((1 & i3) != 0 ? 4096 : i2, (i3 & 2) != 0 ? true : z2, buffer);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(Buffer out) {
            this(0, false, out, 3, null);
            Intrinsics.checkNotNullParameter(out, "out");
        }

        private final void adjustDynamicTableByteCount() {
            int i2 = this.maxDynamicTableByteCount;
            int i3 = this.dynamicTableByteCount;
            if (i2 < i3) {
                if (i2 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i3 - i2);
                }
            }
        }

        private final void clearDynamicTable() {
            ArraysKt.fill$default(this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.dynamicTable.length - 1;
                while (true) {
                    i3 = this.nextHeaderIndex;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    Intrinsics.checkNotNull(header);
                    i2 -= header.hpackSize;
                    int i5 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    Intrinsics.checkNotNull(header2);
                    this.dynamicTableByteCount = i5 - header2.hpackSize;
                    this.headerCount--;
                    i4++;
                    length--;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i3 + 1, headerArr, i3 + 1 + i4, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i6 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i6 + 1, i6 + 1 + i4, (Object) null);
                this.nextHeaderIndex += i4;
            }
            return i4;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i2 = header.hpackSize;
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i2) - i3);
            int i4 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i4 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i5 = this.nextHeaderIndex;
            this.nextHeaderIndex = i5 - 1;
            this.dynamicTable[i5] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i2;
        }

        public final void resizeHeaderTable(int i2) {
            this.headerTableSizeSetting = i2;
            int iMin = Math.min(i2, 16384);
            int i3 = this.maxDynamicTableByteCount;
            if (i3 == iMin) {
                return;
            }
            if (iMin < i3) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            adjustDynamicTableByteCount();
        }

        public final void writeByteString(ByteString data) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!this.useCompression || Huffman.INSTANCE.encodedLength(data) >= data.size()) {
                writeInt(data.size(), 127, 0);
                this.out.write(data);
                return;
            }
            Buffer buffer = new Buffer();
            Huffman.INSTANCE.encode(data, buffer);
            ByteString byteString = buffer.readByteString();
            writeInt(byteString.size(), 127, 128);
            this.out.write(byteString);
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> r13) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 269
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.writeHeaders(java.util.List):void");
        }

        public final void writeInt(int i2, int i3, int i4) {
            if (i2 < i3) {
                this.out.writeByte(i2 | i4);
                return;
            }
            this.out.writeByte(i4 | i3);
            int i5 = i2 - i3;
            while (i5 >= 128) {
                this.out.writeByte((-1) - (((-1) - 128) & ((-1) - ((i5 + 127) - (127 | i5)))));
                i5 >>>= 7;
            }
            this.out.writeByte(i5);
        }
    }

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        STATIC_HEADER_TABLE = new Header[]{new Header(Header.TARGET_AUTHORITY, ""), new Header(Header.TARGET_METHOD, "GET"), new Header(Header.TARGET_METHOD, HttpPost.METHOD_NAME), new Header(Header.TARGET_PATH, RemoteSettings.FORWARD_SLASH_STRING), new Header(Header.TARGET_PATH, "/index.html"), new Header(Header.TARGET_SCHEME, "http"), new Header(Header.TARGET_SCHEME, "https"), new Header(Header.RESPONSE_STATUS, "200"), new Header(Header.RESPONSE_STATUS, "204"), new Header(Header.RESPONSE_STATUS, "206"), new Header(Header.RESPONSE_STATUS, "304"), new Header(Header.RESPONSE_STATUS, "400"), new Header(Header.RESPONSE_STATUS, "404"), new Header(Header.RESPONSE_STATUS, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header(ClientCookie.EXPIRES_ATTR, ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header(FirebaseAnalytics.Param.LOCATION, ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<ByteString, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i2].name)) {
                linkedHashMap.put(headerArr2[i2].name, Integer.valueOf(i2));
            }
        }
        Map<ByteString, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public final ByteString checkLowercase(ByteString name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = name.size();
        for (int i2 = 0; i2 < size; i2++) {
            byte b2 = name.getByte(i2);
            if (65 <= b2 && b2 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
        return name;
    }

    public final Map<ByteString, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }
}
