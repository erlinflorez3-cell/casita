package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r.4\u0012}\bnjG9LeN7ZS@\u000fs{J$c$wKCU(}*\tUOog\u0005Jb\u000bI\u0013\u000e\u0016\u000fj4I[ze\u0012%2JoE3SڎSʠ\u0011td\u0004`O2<\b\u0005\u0019\u001aXI |\tEc\u000e(/nsJV\u001bQ\u001d\u001a@\u0007̧$\u0001,a0\\Df\u0005]hNS\u0007wbf'\u000e/CMUbbH%v\u0010=[DEW-%\u0002&7Vic\u001b? >5l5GCI\"X~d\u000e9-+},\u000ev4\u0003\u001dQ\u000f\ro7]\u000bcP<G(~\n3T\u0004<\u0007oV<U2f6\u0015cx\u0001|XP0\t\t\u007fCgDB=\u007faٿ\u007f\u001b/]og1Ne\u00035\u0011,L\u0019nO\u0006\u001d\"nB3T&paUNk`N8\tmq\u0012\u0011z\u0002X\u0005x[\u000e\\\u0014\u0011\\6U;i[;!\u001a%xHu\u0017\u001d`\u0017T2nVp:nDVZ\r\u001aZ\\d3l\u0001Xf.)MJW7\u0002\u001698\\&=q=\u001eTgh\u0018q$α\u0016ɻ3r?ժ\u0007m\u0014_GgS7Wm\u001el#\u000f\"KTb3Y=͂_۱^h0ίJJp\u001d\u0006\ndP\u0012\"@OB+B0I\u0019\u000b\u0016Ƞ\u0007$Jˆ\u0015\u000bekv\u001eO\u0001A6\u001b}4v\u0019\u0001~[\u0007n\u0016\f24\rb2-oPK\u0018\u0005ixׂ@č'\u0013\u0007͞\u0018ImaUb\r\u0018{l\n8f)GQG=A\u0010ɒ-8\nΏ]Nx~_[bA\t~\u0012\u0011Qg\\j^υ|ݽdvR֢l\u0019(\u0011l\u000eC\nj\u001c\b~è~x"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9oI\u00015@G\b0Dk\u0016\u0012VDEx<\u001a$lkB\\", "", "9dh", "", "And?V,\"\\\u001a\t\bf(\f\r9n", "", "2`c.F;:`(h{_:|\u0018", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q$D\b", "1k^@X+", "", "5dc\u0010_6LS\u0018", "u(I", "Adc\u0010_6LS\u0018", "uY\u0018#", "2`c.85==\u001a\u007f\t^;", "5dc\u0011T;:3\"}d_-\u000b\t>", "u(8", "Adc\u0011T;:3\"}d_-\u000b\t>", "uH\u0018#", "5dc\u0011T;:A(z\bm\u0016}\n=e\u000f", "5q^Bc:", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "5dc\u0014e6N^'", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u0014e6N^'", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "5dc\u0018X@", "5dc b<KQ\u0019b\u0004_6\n\u0011+t\u00042\u0005", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc b<KQ\u0019b\u0004_6\n\u0011+t\u00042\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "/cS", "", "5q^Bc", "/cS\u0014e6N^t\u007f\n^9", "EqXAX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", ">qT1X*>a'\t\b", "1k^@X", "2`c.B-?a\u0019\u000e", "3mS\u0014e6N^ ~\tl\nx\u00106", "6`b\u000ea*A]&", "/mR5b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "=oT;<5?]&\u0007vm0\u0007\u0012", "@d\\<i,\u001a\\\u0017\u0002\u0005k", "@d_<e; `#\u000f\u0006", "B`Q9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014$Uz'7C", "AsP?g\u000eK])\n\u0002^:\u000bf+l\u0007", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class GroupSourceInformation {
    public static final int $stable = 8;
    private boolean closed;
    private int dataEndOffset;
    private final int dataStartOffset;
    private ArrayList<Object> groups;
    private final int key;
    private String sourceInformation;

    public GroupSourceInformation(int i2, String str, int i3) {
        this.key = i2;
        this.sourceInformation = str;
        this.dataStartOffset = i3;
    }

    public final int getKey() {
        return this.key;
    }

    public final String getSourceInformation() {
        return this.sourceInformation;
    }

    public final void setSourceInformation(String str) {
        this.sourceInformation = str;
    }

    public final int getDataStartOffset() {
        return this.dataStartOffset;
    }

    public final ArrayList<Object> getGroups() {
        return this.groups;
    }

    public final void setGroups(ArrayList<Object> arrayList) {
        this.groups = arrayList;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final void setClosed(boolean z2) {
        this.closed = z2;
    }

    public final int getDataEndOffset() {
        return this.dataEndOffset;
    }

    public final void setDataEndOffset(int i2) {
        this.dataEndOffset = i2;
    }

    public final void startGrouplessCall(int i2, String str, int i3) {
        openInformation().add(new GroupSourceInformation(i2, str, i3));
    }

    public final void endGrouplessCall(int i2) {
        openInformation().close(i2);
    }

    public final void reportGroup(SlotWriter slotWriter, int i2) {
        openInformation().add(slotWriter.anchor(i2));
    }

    public final void reportGroup(SlotTable slotTable, int i2) {
        openInformation().add(slotTable.anchor(i2));
    }

    public final void addGroupAfter(SlotWriter slotWriter, int i2, int i3) {
        Anchor anchorTryAnchor$runtime_release;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.groups = arrayList;
        }
        int i4 = 0;
        if (i2 >= 0 && (anchorTryAnchor$runtime_release = slotWriter.tryAnchor$runtime_release(i2)) != null) {
            int size = arrayList.size();
            while (true) {
                if (i4 >= size) {
                    i4 = -1;
                    break;
                }
                Object obj = arrayList.get(i4);
                if (Intrinsics.areEqual(obj, anchorTryAnchor$runtime_release) || ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).hasAnchor(anchorTryAnchor$runtime_release))) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        arrayList.add(i4, slotWriter.anchor(i3));
    }

    public final void close(int i2) {
        this.closed = true;
        this.dataEndOffset = i2;
    }

    private final GroupSourceInformation openInformation() {
        Object obj;
        GroupSourceInformation groupSourceInformationOpenInformation;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).closed) {
                    break;
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        GroupSourceInformation groupSourceInformation = obj instanceof GroupSourceInformation ? (GroupSourceInformation) obj : null;
        return (groupSourceInformation == null || (groupSourceInformationOpenInformation = groupSourceInformation.openInformation()) == null) ? this : groupSourceInformationOpenInformation;
    }

    private final void add(Object obj) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.groups = arrayList;
        arrayList.add(obj);
    }

    private final boolean hasAnchor(Anchor anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            return false;
        }
        ArrayList<Object> arrayList2 = arrayList;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList2.get(i2);
            if (Intrinsics.areEqual(obj, anchor) || ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).hasAnchor(anchor))) {
                return true;
            }
        }
        return false;
    }

    public final boolean removeAnchor(Anchor anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof Anchor) {
                    if (Intrinsics.areEqual(obj, anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).removeAnchor(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.groups = null;
                return false;
            }
        }
        return true;
    }
}
