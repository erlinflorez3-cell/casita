package com.braze.models.inappmessage;

import android.net.Uri;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.IPutIntoJson;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import org.json.JSONObject;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я|\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<K\u0007\"2\u001b\u007f\u0007tpA0JhP.hS2\u000fq|<$q$yCAX\"}8\tWNmmvJh\u0012K\u000f\f\u0019\u0001j:k]xk\u001e\u00172H\u0007G3coE9fz>\u000562*8\u007f\n\t\u001a@H\u0018v\u0001FS\f(0Hp@T\u0015M\u00138\u001a\u0006D!\t\u001ejgV6Nnc E݊3oRP7_^|{\f\u000ff5o\u000fm.-P7cC5U\u0013\u0007\u0001\nm0\u0006\u0006\u0006\u0011v\u000b?1Yug6\u0007.ByqsUc\u0001\ft\u0005\u007fbRKsUq2h\u000eVyA UB\u0012u\u001e'v\u0017s>/\u0016\u001c\u001d\rr\u0002)\u0001\u0006lU\u0018z\u0010J]IHM9#3f\u007fJk\u001d\\J\u0014\u0005;2S\tt!i3&b+\u001a\u0003W\u0018U\u001aZK3f\n\b&\u001e\u0014~N\u001a6\u00142W\u007f]*!0'%e\ngPg\u0010RdRh\u000f\u0005\u000fj*׆^͕D2~\u0018=-\u0017\u0010rFj\nyVtZ2\u0018[$%#\f\u0011+ \u000by\u0013ǀ1ŎR_xkpWk\u000e=1lBgt\f\u0010]El;\u0006gq\u001dyR%\"\u0016סnۖ\\pZU\u0012ij8B4N{\u001e\nLT\\\u001f+2m\u0006r٠.֞\u001d`-J\t3PWM\u001fmq\u0001\u0010-l\nʛ\u000fȐ(~!\u0003Vu~\n\bzOG\u000b|rCOnM\u0019Tsxע@č'\u0011\u0017u\u0006fulgNr7\u0004wL6$=QQ]Kiè\u000bȞ6\fEGR\u0017sam\u0014- \u000b\f_QvT\u007f\b\u0019\u0018\u0003߳vߝS^/$|\u0007\u0001L(f\u0006$oqKiq\u0001#gNK\u0003\u0003\bj^:\r\u0005MLS.Fݙ\tީ1M?\u001f\u001c'\"_5cc\u001b}`Jz\u001dY\rg\u001a+\u0012DF͌]Є6EPK_3LWDn\txV\"H\u001ePAL\raV\u0018ѓ|ެ<W#1\u0004 \u0015<-r\\\u0016H%@\u0014Biw*\"QTѝjǜ)\u001beUm*{[|\rPL\u0018\u001dLA|P4=NX.ũ\u000bޘ\nw08Gyp\u000b\r\u001f2sD<6\r\u001aҴuѕ\u0014\u0005\u0018HeN%8buA\u0017\u001c\\Itd\n\u001db[_OXWϺ\u001bʟ\"\u0003M3\u000b0T\nOe8DaTY3x\u0014\u0017h;*r\u0003\u0010а4\u0092\u0005\u0015]_I\u000f\u0010k$I/4y'\\N&D5BFc\u0010ݘ\u001dچz:v\r[.\\/\u0017\u0014l\u001e\\ny\u0015\tJ&<8\u001daĦ[ζslENTFES:\u0003\u001d\u00147\u0019\\\rq\u00173-4\u0007\u0004ָKހ\u0018+\u0014YY\u000e\f[p<5X\r!\u000bYd҅\u0016ܤ\u001fJ&s\u001c8\u0010\r+R&Z<P\u0015t\u0010\u0006\u0016> \u0018AZ+^\bEN̡LӲ/v\u001eDQC\u0007e\u0004niKchSx?5\u0012pCOKh}Ӵ0 \\^R\u0013Y\u0001frؠ\u0013ݻҴ\u001f:\u0010d//}bוtXЈ_\f"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "\u001ab^:\")KO.~Df6{\t6sI\ffP\u0010z VyrJ\u0001.\u000b", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "/mX:T;>7\"", "", "5dc\u000ea0FO(~^gjx\u00128o\u000f$\u000bD\u000b %", "u(E", "5dc\u000ea0FO(~^g", "u(I", "Adc\u000ea0FO(~^g", "uY\u0018#", "/mX:T;>=)\u000e", "5dc\u000ea0FO(~dn;;\u00058n\n7wO\u0005! U", "5dc\u000ea0FO(~dn;", "Adc\u000ea0FO(~dn;", "0`R8Z9Hc\"}Xh3\u0007\u0016", "", "5dc\u000fT*DU&\t\u000bg+Z\u00136o\r", "u(8", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r", "uH\u0018#", "1kX0^\b<b\u001d\t\u0004", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u0013`\u0002\u001e=I\u0014=QMDA", "5dc\u0010_0<Yt|\nb6\u0006", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#[';k\u001c\nKR?u=s", "1q^=G@IS", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u0013f\b+&\u0002!.#", "5dc\u0010e6IB-\nz", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#[-Ax\u0005BXC\u0011", "Adc\u0010e6IB-\nz", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI,\u0005<\f\"\u001fG}\u001c8x%~7\u000b*B\\*9M\u0019~\\", "2hb:\\:LB-\nz", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u0014]\f(;{$\u001daN;A", "5dc\u0011\\:FW'\rir7|", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#\\$Eu\u001a<[2Ov4s", "Adc\u0011\\:FW'\rir7|", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI,\u0005<\f\"\u001fG}\u001c8x%~8\u0002.?q$<<WFk\na\u0006", "2ta.g0H\\|\bbb3\u0004\r=e}2\u0005?\u000f", "5dc\u0011h9:b\u001d\t\u0004B5d\r6l\u00046{>\u000b \u0016U", "Adc\u0011h9:b\u001d\t\u0004B5d\r6l\u00046{>\u000b \u0016U", "3w_6e(MW#\bib4|\u0017>a\b3", "", "5dc\u0012k7B`\u0015\u000e~h5k\r7e\u000e7wH\f", "u(9", "Adc\u0012k7B`\u0015\u000e~h5k\r7e\u000e7wH\f", "uI\u0018#", "3wc?T:", "", "", "5dc\u0012k;KO'", "u(;7T=:\u001d)\u000e~eud\u0005:;", "Adc\u0012k;KO'", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "7b^;", "5dc\u0016V6G", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0016V6G", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "7b^;5(<Y\u001b\f\u0005n5{f9l\n5", "5dc\u0016V6G0\u0015|\u0001`9\u0007\u00198d]2\u0003J\u000e", "Adc\u0016V6G0\u0015|\u0001`9\u0007\u00198d]2\u0003J\u000e", "7b^;66E]&", "5dc\u0016V6G1#\u0006\u0005k", "Adc\u0016V6G1#\u0006\u0005k", "7r2<a;K] ", "7rC2f;,S\"}", "Adc!X:MA\u0019\by", ";db@T.>", "5dc\u001aX:LO\u001b~", "Adc\u001aX:LO\u001b~", ";db@T.>3,\u000e\bZ:", "5dc\u001aX:LO\u001b~Zq;\n\u0005=", "Adc\u001aX:LO\u001b~Zq;\n\u0005=", ";db@T.>B\u0019\u0012\n:3\u0001\u000b8", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn$Y\u0011/\u0013t\u001a0V\u0019", "5dc\u001aX:LO\u001b~i^?\fd6i\u00021", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#l J|q5QEDA", "Adc\u001aX:LO\u001b~i^?\fd6i\u00021", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI,\u0005<\f\"\u001fG}\u001c8x%~H}3FI\u001d2OL\u0011/%", ";db@T.>B\u0019\u0012\n<6\u0004\u0013<", "5dc\u001aX:LO\u001b~i^?\ff9l\n5", "Adc\u001aX:LO\u001b~i^?\ff9l\n5", ";db@T.>B-\nz", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u001dY\f.3o\u0016\u001daN;A", "5dc\u001aX:LO\u001b~ir7|", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#e E{\u00120M2Ov4s", "=oT;H9B7\"pz[\u001d\u0001\tA", "5dc\u001cc,GC&\u0003^g\u001e|\u0006 i\u007f::<\n !Vk\u001d@\u0001.C", "5dc\u001cc,GC&\u0003^g\u001e|\u0006 i\u007f:", "Adc\u001cc,GC&\u0003^g\u001e|\u0006 i\u007f:", "=qX2a;:b\u001d\t\u0004", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u001ff\u0002 @|\u0012=QMDA", "5dc\u001ce0>\\(z\nb6\u0006", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#g-;m\u001f=IR?u=s", "Adc\u001ce0>\\(z\nb6\u0006", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI,\u0005<\f\"\u001fG}\u001c8x%~C\u000b$7v%*\\GEt\na\u0006", "CqX", "\u001a`]1e6BRb\bzmul\u00163;", "5dc\"e0", "u(;.a+K]\u001d}Dg,\fR\u001fr\u0004}", "5dc\u0019b*:Z\u0004\fz_,\f\u00072e~\u0004\nN\u0001&\u0002C~\u0011J", "5dc\u001fX4Hb\u0019Z\tl,\fs+t\u00036\\J\u000e\u0002$Gp\u000eKt(", "", ":nV\u0010_0<Y", ":nV\u0016`7KS'\r~h5", "=m03g,K1 \t\t^+", "", "Adc\u0010_0<Yu~}Z=\u0001\u0013<", "Adc\u0019b*:Z\u0004\fz_,\f\u00072e~\u0004\nN\u0001&\u0002C~\u0011J", "@d\\<g,)O(\u0002ih\u0013\u0007\u0007+l[6\n@\u0010~\u0013R", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface IInAppMessage extends IPutIntoJson<JSONObject> {
    static /* synthetic */ void getAnimateIn$annotations() {
    }

    static /* synthetic */ void getAnimateOut$annotations() {
    }

    static /* synthetic */ void getOpenUriInWebView$annotations() {
    }

    static /* synthetic */ void setClickBehavior$default(IInAppMessage iInAppMessage, ClickAction clickAction, Uri uri, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setClickBehavior");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            uri = null;
        }
        iInAppMessage.setClickBehavior(clickAction, uri);
    }

    boolean getAnimateIn();

    boolean getAnimateOut();

    int getBackgroundColor();

    ClickAction getClickAction();

    CropType getCropType();

    DismissType getDismissType();

    int getDurationInMilliseconds();

    long getExpirationTimestamp();

    Map<String, String> getExtras();

    String getIcon();

    int getIconBackgroundColor();

    int getIconColor();

    default Map<String, String> getLocalPrefetchedAssetPaths() {
        return MapsKt.emptyMap();
    }

    String getMessage();

    String getMessageExtras();

    TextAlign getMessageTextAlign();

    int getMessageTextColor();

    MessageType getMessageType();

    boolean getOpenUriInWebView();

    Orientation getOrientation();

    List<String> getRemoteAssetPathsForPrefetch();

    Uri getUri();

    boolean isControl();

    boolean isTestSend();

    boolean logClick();

    boolean logImpression();

    void onAfterClosed();

    void setAnimateIn(boolean z2);

    void setAnimateOut(boolean z2);

    void setBackgroundColor(int i2);

    void setClickBehavior(ClickAction clickAction);

    void setClickBehavior(ClickAction clickAction, Uri uri);

    void setCropType(CropType cropType);

    void setDismissType(DismissType dismissType);

    void setDurationInMilliseconds(int i2);

    void setExpirationTimestamp(long j2);

    void setExtras(Map<String, String> map);

    void setIcon(String str);

    void setIconBackgroundColor(int i2);

    void setIconColor(int i2);

    void setLocalPrefetchedAssetPaths(Map<String, String> map);

    void setMessage(String str);

    void setMessageExtras(String str);

    void setMessageTextAlign(TextAlign textAlign);

    void setMessageTextColor(int i2);

    void setOpenUriInWebView(boolean z2);

    void setOrientation(Orientation orientation);

    void setTestSend(boolean z2);
}
