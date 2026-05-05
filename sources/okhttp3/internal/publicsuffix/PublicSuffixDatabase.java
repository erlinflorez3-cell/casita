package okhttp3.internal.publicsuffix;

import androidx.webkit.ProxyConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\"\u007f\u0007ljA0ZeP\u008cZS8-s{B0c$wECU(}*\tUQ}˧\r]\u000b\u000bq\u000e>\u0015\f+/֒Yxk\u0012WLPwW9]qM9\u000f~d\u000eP<0C\u0012\u000b\u0011\u001c:H>\u0001)L\u0012\fZ>N|RT#L3$B\nL-\u0019\u001e\u000bq\u0017<Vzu:]2Ii\u000bT5oH|{\u001c\rTo!\u0005r6+nFe\u00193X\u001b\u0007\u0001_o\u0007MtU\u0005\u0017+o?W\u0006o<h\u0002$\u0015YY;f#*j\u0012i`:1qO4W^\u000f@w)}cɠ\u0006؝\n'P͓}&t\u000b&3#v*ö|ؿbB\bЭ2B%*\u00183Y=qƛ}ň?\u0019VљL\u0011\u001b$;\u0001\u001d(2٭\u0010\u05ce\u0019\u001b\\ȭά5e"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\f=\b\u001b\u0015U\u007f\u000f=z8~D\u000e\u001d>q\u0014\u001c]D<oG|\u0011w]6\u0003q,$", "", "u(E", ":hbAE,:R", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", ">tQ9\\*,c\u001a\u007f~q\f\u0010\u0007/p\u000f,\u0006Ig\u001b%VL\"Kv3", "", ">tQ9\\*,c\u001a\u007f~q\u0013\u0001\u0017>B\u00147{N", "@dP166F^ ~\n^\u0013x\u0018-h", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Wx\u001d\u001b\u00017>@y/5pk", "4h]1@(MQ\u001c\u0003\u0004`\u0019\r\u0010/", "", "", "2n\\.\\5%O\u0016~\u0002l", "5dc\u0012Y->Q(\u0003\f^\u001b\u0004\b\u001al\u00106eI\u0001", "2n\\.\\5", "@dP1G/>:\u001d\r\n", "", "@dP1G/>:\u001d\r\nN5\u0001\u0012>e\r5\fK\u0010\u001b\u0014N\u0004", "Adc\u0019\\:M0-\u000ezl", "Ao[6g\u000bH[\u0015\u0003\u0004", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final Companion Companion = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {42};
    private static final List<String> PREVAILING_RULE = CollectionsKt.listOf(ProxyConfig.MATCH_ALL_SCHEMES);
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00156Ȑ\u0007\":0\u007f\u0007tvA0JeP.`c2şs{J$c$wDCU(\r*ޛWNumvJ`\u000bIƫ\u0007,ю\u001b,wT9b\u0018\u000f̓FoM3\u0016sKDxtd\u000fhY0D\u0012\u0007\u0017\u0019XM8v)K{\u0016 =XvJT\u001dM3\"@\u0014n$\u000f-tg|F\u000flҺ>/1\u0014:N\\(w0+OcЂ'ܮ\u0011viӜ{RE8-+c\u0005\u0017R\nD1CHܸ\u0007ص+'3ɞDcD^\u0018\u0014C0&՜0ę*\\\rĩ1\u001852gcyXdߍyߡ\u007f\rDǉ^\u00125QF-Hp^ԇ5ϢvSHАمbT"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\f=\b\u001b\u0015U\u007f\u000f=z8~D\u000e\u001d>q\u0014\u001c]D<oG|\u0011w]6\u0003q,\rT1OWJ5`\\{\u0013", "", "u(E", "\u0013W2\u0012C\u001b\"=\u0002xb:\u0019bh\u001c", "", "\u001eQ4#4\u0010%7\u0002`tK\u001cch", "", "", "\u001eT1\u0019<\n8A\t_[B\u001fvu\u000fSi\u0018h\u001e`", "%H;\u00116\b+2\u0013eV;\fc", "", "7mbAT5<S", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI3\f=\b\u001b\u0015U\u007f\u000f=z8~D\u000e\u001d>q\u0014\u001c]D<oG|\u0011w]6\u0003q,$", "5dc", "0h].e@,S\u0015\fxa", ":`Q2_:", "", ":`Q2_\u0010GR\u0019\u0012", "", "uZ1(N\t\"\u0017\u007f\u0004vo(F\u0010+n\u0002qiO\u000e\u001b IE", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i2) {
            int i3;
            int iAnd;
            int iAnd2;
            int length = bArr.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr[i5] != 10) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i3 = i6 + i7;
                    if (bArr[i3] == 10) {
                        break;
                    }
                    i7++;
                }
                int i8 = i3 - i6;
                int i9 = i2;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        iAnd = 46;
                        z2 = false;
                    } else {
                        iAnd = Util.and(bArr2[i9][i10], 255);
                    }
                    iAnd2 = iAnd - Util.and(bArr[i6 + i11], 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i11++;
                    i10++;
                    if (i11 == i8) {
                        break;
                    }
                    if (bArr2[i9].length == i10) {
                        if (i9 == bArr2.length - 1) {
                            break;
                        }
                        i9++;
                        i10 = -1;
                        z2 = true;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr2[i9].length - i10;
                        int length3 = bArr2.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr2[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new String(bArr, i6, i8, UTF_8);
                            }
                        }
                    }
                    i4 = i3 + 1;
                }
                length = i5;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }
    }

    private final List<String> findMatchingRule(List<String> list) {
        String str;
        String strBinarySearch;
        String strBinarySearch2;
        List<String> listEmptyList;
        List<String> listEmptyList2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = list.get(i2);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str2.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i2] = bytes;
        }
        byte[][] bArr2 = bArr;
        int length = bArr2.length;
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                strBinarySearch = null;
                break;
            }
            Companion companion = Companion;
            byte[] bArr3 = this.publicSuffixListBytes;
            if (bArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                bArr3 = null;
            }
            strBinarySearch = companion.binarySearch(bArr3, bArr, i3);
            if (strBinarySearch != null) {
                break;
            }
            i3++;
        }
        if (bArr2.length > 1) {
            byte[][] bArr4 = (byte[][]) bArr2.clone();
            int length2 = bArr4.length - 1;
            for (int i4 = 0; i4 < length2; i4++) {
                bArr4[i4] = WILDCARD_LABEL;
                Companion companion2 = Companion;
                byte[] bArr5 = this.publicSuffixListBytes;
                if (bArr5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                    bArr5 = null;
                }
                strBinarySearch2 = companion2.binarySearch(bArr5, bArr4, i4);
                if (strBinarySearch2 != null) {
                    break;
                }
            }
            strBinarySearch2 = null;
        } else {
            strBinarySearch2 = null;
        }
        if (strBinarySearch2 != null) {
            int length3 = bArr2.length - 1;
            int i5 = 0;
            while (true) {
                if (i5 >= length3) {
                    break;
                }
                Companion companion3 = Companion;
                byte[] bArr6 = this.publicSuffixExceptionListBytes;
                if (bArr6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                    bArr6 = null;
                }
                String strBinarySearch3 = companion3.binarySearch(bArr6, bArr, i5);
                if (strBinarySearch3 != null) {
                    str = strBinarySearch3;
                    break;
                }
                i5++;
            }
        }
        if (str != null) {
            return StringsKt.split$default((CharSequence) ("!" + str), new char[]{'.'}, false, 0, 6, (Object) null);
        }
        if (strBinarySearch == null && strBinarySearch2 == null) {
            return PREVAILING_RULE;
        }
        if (strBinarySearch == null || (listEmptyList = StringsKt.split$default((CharSequence) strBinarySearch, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (strBinarySearch2 == null || (listEmptyList2 = StringsKt.split$default((CharSequence) strBinarySearch2, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return listEmptyList.size() > listEmptyList2.size() ? listEmptyList : listEmptyList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, byte[]] */
    private final void readTheList() throws IOException {
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream == null) {
                return;
            }
            BufferedSource bufferedSourceBuffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
            try {
                BufferedSource bufferedSource = bufferedSourceBuffer;
                objectRef.element = bufferedSource.readByteArray(bufferedSource.readInt());
                objectRef2.element = bufferedSource.readByteArray(bufferedSource.readInt());
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedSourceBuffer, null);
                synchronized (this) {
                    T t2 = objectRef.element;
                    Intrinsics.checkNotNull(t2);
                    this.publicSuffixListBytes = (byte[]) t2;
                    T t3 = objectRef2.element;
                    Intrinsics.checkNotNull(t3);
                    this.publicSuffixExceptionListBytes = (byte[]) t3;
                    Unit unit2 = Unit.INSTANCE;
                }
            } finally {
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z2 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z2 = true;
                } catch (IOException e2) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e2);
                    if (z2) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> splitDomain(String str) {
        List<String> listSplit$default = StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        return Intrinsics.areEqual(CollectionsKt.last((List) listSplit$default), "") ? CollectionsKt.dropLast(listSplit$default, 1) : listSplit$default;
    }

    public final String getEffectiveTldPlusOne(String domain) {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List<String> listSplitDomain = splitDomain(unicodeDomain);
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        return SequencesKt.joinToString$default(SequencesKt.drop(CollectionsKt.asSequence(splitDomain(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    public final void setListBytes(byte[] publicSuffixListBytes, byte[] publicSuffixExceptionListBytes) {
        Intrinsics.checkNotNullParameter(publicSuffixListBytes, "publicSuffixListBytes");
        Intrinsics.checkNotNullParameter(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = publicSuffixListBytes;
        this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
