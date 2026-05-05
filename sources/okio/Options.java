package okio;

import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tyAӄLeVAZS0\u0012s{B*c$wIQ٥8\u0011R\u000f_Pwg\u001dJ\t\ns\u00134\u0017aj\u000bK\u000ewpR,8B\u007fKAP\bEIdz5\u0015 `\"f}\u0015\u0005(/`\u0010%\u0001ŲO\f 7\t\u007fHc%M3\u001aB\nL2\u0019\u001e\u000bs\u0015ȻH=yH2;\u000byFT&o0+M;J+܌\u000fțe&3@E?-'Y\u000b\u0015[,Q\u0011J\n=3t]{\u0002ɵuɱ:\\\u0018\u0016\u001b8]\u001b.\u00054a\u001dQ\u000f\u0012}˄QӍOV\u0016ߊ\u0010|\u0002\u001cJ\u0014أ\n;"}, d2 = {"\u001anZ6bu(^(\u0003\u0005g:R", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fK])ChS", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\u001aiPCTuNb\u001d\u0006DK(\u0006\b9m[&y@\u000f%l", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E-| \u0016Qwi:t%CgS", "0xc2F;KW\"\u0001\t", "", "BqX2", "", "uZ;<^0H\u001du\u0013\n^\u001a\f\u00163n\u0002}q$D\b", "5dc\u000fl;>A(\f~g.\u000bG9k\u00042", "u(J\u0019b2B]b[\u000fm,j\u0018<i\t*Q", ")K^8\\6\b0-\u000ezL;\n\r8gU", "Ahi2", "", "5dc \\A>", "u(8", "5dc!e0>\u0012#\u0005~h", "u(J\u0016", "5dc", "7mS2k", "\u0011n\\=T5B]\"", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Options extends AbstractList<ByteString> implements RandomAccess {
    public static final Companion Companion = new Companion(null);
    private final ByteString[] byteStrings;
    private final int[] trie;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126B\u0015\"4\u0012}\bnjG0LeN/ZS8\u0015sڔ<$iByCQU\"}(\u000bWN}gvJh\u001aK\u000f\f\u0016~̚-_ǁ)]@\u000erGu?ݯQoK9)GD\u000b82P?*\u000b\u0007\u001a8P(v)E{\u0010 9XphU=S\u000b\u001a \u0010V /)\rq\\B`rm<?#1wp[We6|[\u001c^TU\u0018'g$+NGM\u0015S^3\u0011`lW\tOsM\u0005\u00172U8\u0010s Uf\u0012,\u0015Yb=m\u00012t\rad\u0012&;O\u0012Y~\"Hw)\nSAǬ\u0012\u00065]~C(g \u000eav\u001bSnS8\u001f\u0019Ș|ˋ:\u001b=\u00029/G ǁUw"}, d2 = {"\u001anZ6bu(^(\u0003\u0005g:;f9m\u000b$\u0005D\u000b l", "", "u(E", "7mc\u0010b<Gb", "", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "5dc\u0016a;\u001c])\b\n", "uK^8\\6\b0)\u007f{^9RL\u0014", "0tX9W\u001bKW\u0019kz\\<\n\u00173v\u007f", "", "<nS2B-?a\u0019\u000e", "<nS2", "0xc2F;KW\"\u0001d_-\u000b\t>", "", "0xc2F;KW\"\u0001\t", "", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "4q^:<5=S,", "Bn8;W,Q", "7mS2k,L", "=e", "\u001anZ6bu(^(\u0003\u0005g:R", "", "uZ;<^0H\u001du\u0013\n^\u001a\f\u00163n\u0002}?'\u000b\u001d\u001bQ9wG\u0006)?b\fu", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void buildTrieRecursive(long j2, Buffer buffer, int i2, List<? extends ByteString> list, int i3, int i4, List<Integer> list2) throws IOException {
            int iIntValue;
            int i5 = i2;
            int i6 = i3;
            if (i6 >= i4) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i7 = i6; i7 < i4; i7++) {
                if (list.get(i7).size() < i5) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = list.get(i6);
            ByteString byteString2 = list.get(i4 - 1);
            if (i5 == byteString.size()) {
                iIntValue = list2.get(i6).intValue();
                i6++;
                byteString = list.get(i6);
            } else {
                iIntValue = -1;
            }
            if (byteString.getByte(i5) == byteString2.getByte(i5)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i8 = 0;
                for (int i9 = i5; i9 < iMin && byteString.getByte(i9) == byteString2.getByte(i9); i9++) {
                    i8++;
                }
                long intCount = j2 + getIntCount(buffer) + ((long) 2) + ((long) i8) + 1;
                buffer.writeInt(-i8);
                buffer.writeInt(iIntValue);
                int i10 = i8 + i5;
                while (i5 < i10) {
                    byte b2 = byteString.getByte(i5);
                    buffer.writeInt((b2 + 255) - (b2 | 255));
                    i5++;
                }
                if (i6 + 1 == i4) {
                    if (i10 != list.get(i6).size()) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    buffer.writeInt(list2.get(i6).intValue());
                    return;
                } else {
                    Buffer buffer2 = new Buffer();
                    buffer.writeInt(((int) (getIntCount(buffer2) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer2, i10, list, i6, i4, list2);
                    buffer.writeAll(buffer2);
                    return;
                }
            }
            int i11 = 1;
            for (int i12 = i6 + 1; i12 < i4; i12++) {
                if (list.get(i12 - 1).getByte(i5) != list.get(i12).getByte(i5)) {
                    i11++;
                }
            }
            long intCount2 = j2 + getIntCount(buffer) + ((long) 2) + ((long) (i11 * 2));
            buffer.writeInt(i11);
            buffer.writeInt(iIntValue);
            for (int i13 = i6; i13 < i4; i13++) {
                byte b3 = list.get(i13).getByte(i5);
                if (i13 == i6 || b3 != list.get(i13 - 1).getByte(i5)) {
                    buffer.writeInt(b3 & 255);
                }
            }
            Buffer buffer3 = new Buffer();
            while (i6 < i4) {
                byte b4 = list.get(i6).getByte(i5);
                int i14 = i6 + 1;
                int i15 = i14;
                while (true) {
                    if (i15 >= i4) {
                        i15 = i4;
                        break;
                    } else if (b4 != list.get(i15).getByte(i5)) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (i14 == i15 && i5 + 1 == list.get(i6).size()) {
                    buffer.writeInt(list2.get(i6).intValue());
                } else {
                    buffer.writeInt(((int) (intCount2 + getIntCount(buffer3))) * (-1));
                    buildTrieRecursive(intCount2, buffer3, i5 + 1, list, i6, i15, list2);
                }
                i6 = i15;
            }
            buffer.writeAll(buffer3);
        }

        static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j2, Buffer buffer, int i2, List list, int i3, int i4, List list2, int i5, Object obj) throws IOException {
            int size = i4;
            int i6 = i2;
            long j3 = j2;
            if ((i5 + 1) - (i5 | 1) != 0) {
                j3 = 0;
            }
            if ((i5 & 4) != 0) {
                i6 = 0;
            }
            int i7 = (i5 + 16) - (i5 | 16) == 0 ? i3 : 0;
            if ((-1) - (((-1) - i5) | ((-1) - 32)) != 0) {
                size = list.size();
            }
            companion.buildTrieRecursive(j3, buffer, i6, list, i7, size, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / ((long) 4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:93:0x00b4, code lost:
        
            continue;
         */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okio.Options of(okio.ByteString... r21) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 277
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.Options.Companion.of(okio.ByteString[]):okio.Options");
        }
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    @JvmStatic
    public static final Options of(ByteString... byteStringArr) {
        return Companion.of(byteStringArr);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains(byteString);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ByteString get(int i2) {
        return this.byteStrings[i2];
    }

    public final ByteString[] getByteStrings$okio() {
        return this.byteStrings;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.byteStrings.length;
    }

    public final int[] getTrie$okio() {
        return this.trie;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf(byteString);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf(byteString);
    }
}
