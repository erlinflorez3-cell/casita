package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.EditCommand;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: HandwritingGesture.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яć\u0014D߬)\u001ew\u0006LDit\fA\u001c0\u0013ǞJ~0;\u001aw\rfr9FDmH4V[*\u001dv\u00044*\\,qY;]ڼ\u0006\"\u001fOVʴon`Z\u0013C\u0015\u0007\u001ex\u0001,QU~^\u001a\u000fHBw?9Mw=O`|6\u000b!:\"Ny\r\u0001 .P\u0010\rzKŷ\u0014\u0012F@xíZ\rc\u0005\"\u0012\fH(\u0001,eoN<Nt]P/+\u0003oBfFm1\u0015M;H\u00057\u001byy&;D=4%%\u0002\u00055V{?1A8=ݾl'50a\u0014e<p\u007fB\u001c[S\u001be\u000b&\u000b\f\u0002d\u001a0CO\u0012R\u0017\u000eÂv\u07beԫ\u0011>\n\u0018\u00142`J;&~\b<:\u001dr\u0002G\u0001\u0006lO\u0018z\u0010D]%Ƨ2ٿݰ\u001fhWpI)f]\n\u0016%\u001eQ\u007f\u0017!\nf>d#.lw\u007fE\u0002FK]f\fo<\u001c\u001a7bΜ)ʶΥK\u00025\u0013\u001fF/IEtQ#Oj*Hr\u0002'\tn\u0004ki\u0001\\p&|+O*7\"!D×\u0004ߘÏXZ2-[9l-\f!+ \u000bvd!S.~Sv\u0005\u0003M\f\u001eU5tLqp\u0002\r\u0006O%3ΉPүߧeT|0M[z5f\u007fZS:Y\u0005(PDxn\u001e\u0013\u0014D| C8M\u001246B0G}EN\u00113ZC\u0013\b\u000ep/\u0010ҰS՜ʗ\u0007k*\u0017\u0017$h\u0017~\u0014\u007fxw3%b8,ove\u001d4{:hb\u0011S\u000b\r\u001b\u0018G\u0016`wRz6\u000eW\u0012\u001fD;iW=R+\u0011\u0015(`\u0018sE˜qό˛Q\u0014-#\u000b#'gvX\u007f\b\u0019wT`\u0019d\u007fX%M\u000f^!O8h\u000e'yF)u\u0014X\u0019\u000bVI!3 <ӷ7وġ# +2}T\u0015a;m?\u001dD~</C\u007f\u000em}Y\u0012b=R%i\u0012Y{\u0016\u001e\u0011\u0002a@jPI\b/\u0005\"ڳk×\u074cLl}9P<LEArYd\u001f]`O!.,x70\u001b\u001cn[h? \u0004BNw,\nB,5\u000fG3>eS\u0016\u001c\u001eOj:b\u000f8;B1£\u0011Βݞ$X]\u0017\u0017e\u001e(&lY;\u0011\fd\tRN\\@\u0016B[T\u00182@~\u000e~w\u000fE^rwI\u0004&T'\u000b\u0007L\u0013\u0010]`OZG~ݩ2ͨא93\u000b'T\u000fG\u0018@7k\u001d7\"\u0013O-\u0005U/R\fQ\u001bV\u00051\u000fS\u0016[I0b4K7\u001b\u0004o:fH\u0001+q0\u001bg\u0002W_ܴ/͜κYfT\u001e\u0005M~d\\^A~):6<84;\u001d]1\bb[K\u0015wOM(@/DWD4|\u0012Ea-\u001e?;}ajBd$W\u0002:D\b8*5E\r!\u000b\u00156f8\\a:.{$%\u001a\tA\u000eH\u0004\\I;r\"E\u0016yg\u0002a\t;^\by(%NeCl4A\u0012hǰ\u000ecz(\u0007d\u0019H~1\u0005\u000e\u0017-~cO'Ӱ2\u0013f\"Z\u001daݰp\u0011.\u0013kҴq߱\fb1ցoovp\u0004O\n\f\u0002ԝ>ˮe18ܼʷ}$\u0002x\nրpV\u0014ͰZ\u0016"}, d2 = {"\u001aH=\u0012R\r\u001e3wxXH\u000b\\\u0003\u001aOc\u0011j", "", "\u001cAB\u001dR\n(2xxeH\u0010ew", "1n\\=b<GRx}~m\n\u0007\u00117a\t'", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|s8UK7t3s", "3cXA66F[\u0015\byl", "", "uZ;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri\u0017l\u001a=+MCs0'\u0014>% \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001eRt\u001c\u0005lPmrMB/\u0017u)\u0001?w^\u0016\u001e\u00161so\u0018", "3mR9b:N`\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "3mR9b:N`\u0019F\u0006P\u000b\u0011Z\u0003M", "uI9u=", "/cYBf;!O\"}\rk0\f\r8g^(\u0003@\u0010\u0017xG}\u001dL\u0004%\"U\u0007\"7", "BdgA", "", "/cYBf;!O\"}\rk0\f\r8g^(\u0003@\u0010\u0017xG}\u001dL\u0004%\"U\u0007\"75gz+O%]\u0014", "uI;7T=:\u001d z\u0004`uZ\f+rm(\bP\u0001 \u0015GEQ!", "5dc\u0019\\5>4#\f]Z5{\u001b<i\u000f,\u0005Bb\u0017%V\u007f\u001b<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9uL}49Dy-3o#*XF\u0011", ":nR._\u0017HW\"\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "DhTD66GT\u001d\u0001\u000bk(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "5dc\u0019\\5>4#\f]Z5{\u001b<i\u000f,\u0005Bb\u0017%V\u007f\u001b<>$|(}\u001e\tQ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W$\u0007,D]h\u001cDi\u0018;IN>A\u0019\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[e\u0015J:\u000e\u000ffIm_H71e6R\u0003?j\u0011\u0019\u0012\u001d9ty\u0018\u001as", "5dc\u001cY-LS(_\u0005k\u000fx\u0012.w\r,\u000bD\n\u0019xG}\u001dL\u0004%", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001em\u0018*KW*kG-ula@\u0006Q;J\u0006'\u001d", ">nX;g\u0010GA\u0017\fz^5", "5dc\u001cY-LS(_\u0005k\u000fx\u0012.w\r,\u000bD\n\u0019xG}\u001dL\u0004%|XEn7kg\u0012", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001T\u00160IAOZ41$Ie9\u000eb\u001a]r6G\"3\u0013X[qJ\u001e\u0016Y!\u0018)\u0017\rdK2n\u000eG#Q7P}Ji\u000b\u0019\u001eW&npT4\u001aPz\u0019wQ6dU]i\u0003\u001d\u0005)", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\u000eC`X<k@\u00029#\u00120", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001bN\n6.Hb6la`L\u0010!Zc3\u0012\t\u000eXN.rCJh\u00066Q\rEv\u0001U&\u0012~uw>e\u0011Q\u0007\u001d?2-hX7i\u0003HEGr7`\u001bc'e\u0010}\b", ":`h<h;\u001c]#\fyb5x\u0018/s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "5dc\u001cY-LS(_\u0005k\u000fx\u0012.w\r,\u000bD\n\u0019xG}\u001dL\u0004%|iz\t(\u007f\u0006\u001a", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W$\u0007,D]h\u001cDi\u0018;IN>A\u0019\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[a\nb5\u001d\u0014#( \u0003NG.e6S\u000f:l\n\b%\u000eC@W>_\u000fT\u0004\u0019tTrfPaj\u0004UA\u000fr..\u0017f\u0019k;D1\u001c;\n\u001fhb\f\u0014\u0005T\u0015tb\u0007cvK#\u0004\u000eg\"", "5dc\u001fT5@Sy\t\bK,\u0005\u0013@em3w>\u0001x\u0017U~\u001eIv", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "AsP?g\u0017HW\"\u000e^g\u001az\u0016/e\t", "3mS\u001db0Gb\u0019\f^g\u001az\u0016/e\t", "5dc\u001fT5@Sy\t\bK,\u0005\u0013@em3w>\u0001x\u0017U~\u001eIvl\u0005]n\u000b*>h", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8D@y4A}%\u001bMQKrCsyMH5\u0010b9Xz&Z\u0016L6d]|K\u0014[j\u0012\u00182\t\u0019cQ38+33\u0012<X_Er\u000e\u000b\u001a\u00171ypP,vC\u0003\u0014\u0003K-gY#]\u0004OLOp*.\u001ccfgA63\u0015{&#2A2\n\u000e1\u001b{S}iwT\u0015\n<.GC\u001f+", "5dc\u001fT5@Sy\t\bL*\n\t/nl(yO", "@dRA<5,Q&~zg", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "5qP;h3:`\u001d\u000e\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u0017fy)Gt\u0012;QROA", "7mR9h:B]\"l\nk(\f\t1y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u0019b{'G{\u001a8V1Jx0-\u0015ju\u000f", "5dc\u001fT5@Sy\t\bL*\n\t/nl(yOH\u0001y\u001bvqQ\u0001", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001T\u00160IAOZ41$Ie9\u000eb\u001a]r6G\"5(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8T;h\n,S\n;w\u000e _z5h\u007f\u0018:vC\u0003\u0014\u0003K-gY#]\u0004OLOp*.\u001ccfk:M3]`\u0019.w47\b\u0003c\u001fv\\\u0003UvT\u0015\n8&RC\u001f+", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001bN\n6.Hb6la`L\u0010!Zc5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\u001c\u001aW7jzJV\u001fT\u000e^bA'w\u001c=FuP@Rl.c\u001f)\u001bfBE.\"qb+l\u001a=\n\u000fbZaR\rvKP\u0017\u0002H2Bwd4T|QKt)3!?\\", "5dc\u001fT5@Sy\t\bL*\n\t/nl(yOH\u0001a\u0016Bq\u001eA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W$\u0007,D]h\u001cDi\u0018;IN>A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0014Z\u0018V+\u001c\u0012m\u000b\u0011nBFtn(R\u0001Hr\u0005\u000b)W3txM`\u001eGC%y\u000b0dZco\t\u0011(Av4t\u001b='fG9(\u001dm(\u001bv&\u0012pw\\\u0010\u007f\\}fz\u0011\u0017\u0005@/H{[\u0010Us\u001fKt:.\u0015jw%A<}){=\u001284?R\u0014Xc'>`\rjoA", "5dc\u001fT5@Sy\t\bL*\n\t/nl(yO\u000f", "AsP?g\u0019>Q(b\u0004L*\n\t/n", "3mS\u001fX*M7\"lxk,|\u0012", "5dc\u001fT5@Sy\t\bL*\n\t/nl(yO\u000f^\u0001\u0012>` Xo", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001T\u00160IAOZ41$Ie9\u000eb\u001a]r6G\"5(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8T;h\n,S\n;w\u000e _z5h\u007f\u0018=\fPx\"\u007fE({\u0010Wi\u0002RKSbst\u0010)\u001f\\DB$#~-dUP,\u0019Q7wn[xtqK\u0018\u000e\u0002\"HufPSo\u001fLxp.K\u000f\u0007[!X\b:X6\u0002;:Dh\u000fTU'KZ\b\u0015.p\u0017j\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001bN\n6.Hb6la`L\u0010!Zc5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\u001c\u001aW7jzJV\u001fT\u000e^bA'w\u001c@[\u0003FNOf)wU]'dED2\u0014;)\u001f2R.\u0014\u0004S \u007ffCTgE(P\u001c\u000b:vZSOsTO>%)S\u0007\u0002 2\"\u0005/><\u0004G9\u007fS\u0005^v{G\\\u007f%:`K0\u0014EI\u000fNKe\nB\u0002r", "7r1670\u001b])\byZ9\u0011", "", "=eU@X;", "7r=2j3B\\\u0019", "7r?Ba*Mc\u0015\u000e~h5", "7rF5\\;>a$zx^", "7rF5\\;>a$zx^\f\u0010\u0007/p\u000f\u0011{R\b\u001b G", "@`]4X\u0016?E\u001c\u0003\n^:\b\u0005-e\u000e", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dSQ!", "Bn>3Y:>b", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&w\u001d", "uKP;W9HW\u0018H|k(\b\f3c\u000eqfJ\u0005 &(EQ!", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class HandwritingGesture_androidKt {
    private static final int LINE_FEED_CODE_POINT = 10;
    private static final int NBSP_CODE_POINT = 160;

    /* JADX INFO: renamed from: adjustHandwritingDeleteGestureRange-72CqOWE */
    public static final long m1499adjustHandwritingDeleteGestureRange72CqOWE(long j2, CharSequence charSequence) {
        int iM6123getStartimpl = TextRange.m6123getStartimpl(j2);
        int iM6118getEndimpl = TextRange.m6118getEndimpl(j2);
        int iCodePointBefore = iM6123getStartimpl > 0 ? Character.codePointBefore(charSequence, iM6123getStartimpl) : 10;
        int iCodePointAt = iM6118getEndimpl < charSequence.length() ? Character.codePointAt(charSequence, iM6118getEndimpl) : 10;
        if (isWhitespaceExceptNewline(iCodePointBefore) && (isWhitespace(iCodePointAt) || isPunctuation(iCodePointAt))) {
            do {
                iM6123getStartimpl -= Character.charCount(iCodePointBefore);
                if (iM6123getStartimpl == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iM6123getStartimpl);
            } while (isWhitespaceExceptNewline(iCodePointBefore));
            return TextRangeKt.TextRange(iM6123getStartimpl, iM6118getEndimpl);
        }
        if (!isWhitespaceExceptNewline(iCodePointAt)) {
            return j2;
        }
        if (!isWhitespace(iCodePointBefore) && !isPunctuation(iCodePointBefore)) {
            return j2;
        }
        do {
            iM6118getEndimpl += Character.charCount(iCodePointAt);
            if (iM6118getEndimpl == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iM6118getEndimpl);
        } while (isWhitespaceExceptNewline(iCodePointAt));
        return TextRangeKt.TextRange(iM6123getStartimpl, iM6118getEndimpl);
    }

    private static final boolean isNewline(int i2) {
        int type = Character.getType(i2);
        return type == 14 || type == 13 || i2 == 10;
    }

    private static final boolean isWhitespace(int i2) {
        return Character.isWhitespace(i2) || i2 == 160;
    }

    private static final boolean isWhitespaceExceptNewline(int i2) {
        return isWhitespace(i2) && !isNewline(i2);
    }

    private static final boolean isPunctuation(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final long toOffset(PointF pointF) {
        return OffsetKt.Offset(pointF.x, pointF.y);
    }

    /* JADX INFO: renamed from: getRangeForScreenRect-OH9lIzo */
    public static final long m1508getRangeForScreenRectOH9lIzo(TextLayoutState textLayoutState, Rect rect, int i2, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        return m1506getRangeForScreenRectO048IG0(layoutResult != null ? layoutResult.getMultiParagraph() : null, rect, textLayoutState.getTextLayoutNodeCoordinates(), i2, textInclusionStrategy);
    }

    /* JADX INFO: renamed from: getRangeForScreenRects-O048IG0 */
    public static final long m1510getRangeForScreenRectsO048IG0(TextLayoutState textLayoutState, Rect rect, Rect rect2, int i2, TextInclusionStrategy textInclusionStrategy) {
        long jM1508getRangeForScreenRectOH9lIzo = m1508getRangeForScreenRectOH9lIzo(textLayoutState, rect, i2, textInclusionStrategy);
        if (TextRange.m6117getCollapsedimpl(jM1508getRangeForScreenRectOH9lIzo)) {
            return TextRange.Companion.m6128getZerod9O1mEE();
        }
        long jM1508getRangeForScreenRectOH9lIzo2 = m1508getRangeForScreenRectOH9lIzo(textLayoutState, rect2, i2, textInclusionStrategy);
        return TextRange.m6117getCollapsedimpl(jM1508getRangeForScreenRectOH9lIzo2) ? TextRange.Companion.m6128getZerod9O1mEE() : m1500enclosurepWDy79M(jM1508getRangeForScreenRectOH9lIzo, jM1508getRangeForScreenRectOH9lIzo2);
    }

    /* JADX INFO: renamed from: getRangeForScreenRect-OH9lIzo */
    public static final long m1507getRangeForScreenRectOH9lIzo(LegacyTextFieldState legacyTextFieldState, Rect rect, int i2, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult value;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        return m1506getRangeForScreenRectO048IG0((layoutResult == null || (value = layoutResult.getValue()) == null) ? null : value.getMultiParagraph(), rect, legacyTextFieldState.getLayoutCoordinates(), i2, textInclusionStrategy);
    }

    /* JADX INFO: renamed from: getRangeForScreenRects-O048IG0 */
    public static final long m1509getRangeForScreenRectsO048IG0(LegacyTextFieldState legacyTextFieldState, Rect rect, Rect rect2, int i2, TextInclusionStrategy textInclusionStrategy) {
        long jM1507getRangeForScreenRectOH9lIzo = m1507getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect, i2, textInclusionStrategy);
        if (TextRange.m6117getCollapsedimpl(jM1507getRangeForScreenRectOH9lIzo)) {
            return TextRange.Companion.m6128getZerod9O1mEE();
        }
        long jM1507getRangeForScreenRectOH9lIzo2 = m1507getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect2, i2, textInclusionStrategy);
        return TextRange.m6117getCollapsedimpl(jM1507getRangeForScreenRectOH9lIzo2) ? TextRange.Companion.m6128getZerod9O1mEE() : m1500enclosurepWDy79M(jM1507getRangeForScreenRectOH9lIzo, jM1507getRangeForScreenRectOH9lIzo2);
    }

    public static final long rangeOfWhitespaces(CharSequence charSequence, int i2) {
        int iCharCount = i2;
        while (iCharCount > 0) {
            int iCodePointBefore = CodepointHelpers_jvmKt.codePointBefore(charSequence, iCharCount);
            if (!isWhitespace(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i2 < charSequence.length()) {
            int iCodePointAt = CodepointHelpers_jvmKt.codePointAt(charSequence, i2);
            if (!isWhitespace(iCodePointAt)) {
                break;
            }
            i2 += CodepointHelpers_jvmKt.charCount(iCodePointAt);
        }
        return TextRangeKt.TextRange(iCharCount, i2);
    }

    /* JADX INFO: renamed from: getOffsetForHandwritingGesture-d-4ec7I */
    public static final int m1503getOffsetForHandwritingGestured4ec7I(TextLayoutState textLayoutState, long j2, ViewConfiguration viewConfiguration) {
        MultiParagraph multiParagraph;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null || (multiParagraph = layoutResult.getMultiParagraph()) == null) {
            return -1;
        }
        return m1504getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j2, textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
    }

    /* JADX INFO: renamed from: getOffsetForHandwritingGesture-d-4ec7I */
    public static final int m1502getOffsetForHandwritingGestured4ec7I(LegacyTextFieldState legacyTextFieldState, long j2, ViewConfiguration viewConfiguration) {
        TextLayoutResult value;
        MultiParagraph multiParagraph;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult == null || (value = layoutResult.getValue()) == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return -1;
        }
        return m1504getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j2, legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
    }

    public static final boolean isBiDiBoundary(TextLayoutResult textLayoutResult, int i2) {
        int lineForOffset = textLayoutResult.getLineForOffset(i2);
        return (i2 == textLayoutResult.getLineStart(lineForOffset) || i2 == TextLayoutResult.getLineEnd$default(textLayoutResult, lineForOffset, false, 2, null)) ? textLayoutResult.getParagraphDirection(i2) != textLayoutResult.getBidiRunDirection(i2) : textLayoutResult.getBidiRunDirection(i2) != textLayoutResult.getBidiRunDirection(i2 - 1);
    }

    /* JADX INFO: renamed from: getRangeForScreenRect-O048IG0 */
    private static final long m1506getRangeForScreenRectO048IG0(MultiParagraph multiParagraph, Rect rect, LayoutCoordinates layoutCoordinates, int i2, TextInclusionStrategy textInclusionStrategy) {
        if (multiParagraph == null || layoutCoordinates == null) {
            return TextRange.Companion.m6128getZerod9O1mEE();
        }
        return multiParagraph.m5990getRangeForRect86BmAI(rect.m3974translatek4lQ0M(layoutCoordinates.mo5528screenToLocalMKHz9U(Offset.Companion.m3953getZeroF1C5BW0())), i2, textInclusionStrategy);
    }

    /* JADX INFO: renamed from: getOffsetForHandwritingGesture-ubNVwUQ */
    private static final int m1504getOffsetForHandwritingGestureubNVwUQ(MultiParagraph multiParagraph, long j2, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        long jMo5528screenToLocalMKHz9U;
        int iM1501getLineForHandwritingGestured4ec7I;
        if (layoutCoordinates == null || (iM1501getLineForHandwritingGestured4ec7I = m1501getLineForHandwritingGestured4ec7I(multiParagraph, (jMo5528screenToLocalMKHz9U = layoutCoordinates.mo5528screenToLocalMKHz9U(j2)), viewConfiguration)) == -1) {
            return -1;
        }
        return multiParagraph.m5989getOffsetForPositionk4lQ0M(Offset.m3931copydBAh8RU$default(jMo5528screenToLocalMKHz9U, 0.0f, (multiParagraph.getLineTop(iM1501getLineForHandwritingGestured4ec7I) + multiParagraph.getLineBottom(iM1501getLineForHandwritingGestured4ec7I)) / 2.0f, 1, null));
    }

    /* JADX INFO: renamed from: getRangeForRemoveSpaceGesture-5iVPX68 */
    public static final long m1505getRangeForRemoveSpaceGesture5iVPX68(TextLayoutResult textLayoutResult, long j2, long j3, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        if (textLayoutResult == null || layoutCoordinates == null) {
            return TextRange.Companion.m6128getZerod9O1mEE();
        }
        long jMo5528screenToLocalMKHz9U = layoutCoordinates.mo5528screenToLocalMKHz9U(j2);
        long jMo5528screenToLocalMKHz9U2 = layoutCoordinates.mo5528screenToLocalMKHz9U(j3);
        int iM1501getLineForHandwritingGestured4ec7I = m1501getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo5528screenToLocalMKHz9U, viewConfiguration);
        int iM1501getLineForHandwritingGestured4ec7I2 = m1501getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo5528screenToLocalMKHz9U2, viewConfiguration);
        if (iM1501getLineForHandwritingGestured4ec7I != -1) {
            if (iM1501getLineForHandwritingGestured4ec7I2 != -1) {
                iM1501getLineForHandwritingGestured4ec7I = Math.min(iM1501getLineForHandwritingGestured4ec7I, iM1501getLineForHandwritingGestured4ec7I2);
            }
            iM1501getLineForHandwritingGestured4ec7I2 = iM1501getLineForHandwritingGestured4ec7I;
        } else if (iM1501getLineForHandwritingGestured4ec7I2 == -1) {
            return TextRange.Companion.m6128getZerod9O1mEE();
        }
        float lineTop = (textLayoutResult.getLineTop(iM1501getLineForHandwritingGestured4ec7I2) + textLayoutResult.getLineBottom(iM1501getLineForHandwritingGestured4ec7I2)) / 2;
        return textLayoutResult.getMultiParagraph().m5990getRangeForRect86BmAI(new Rect(Math.min(Offset.m3937getXimpl(jMo5528screenToLocalMKHz9U), Offset.m3937getXimpl(jMo5528screenToLocalMKHz9U2)), lineTop - 0.1f, Math.max(Offset.m3937getXimpl(jMo5528screenToLocalMKHz9U), Offset.m3937getXimpl(jMo5528screenToLocalMKHz9U2)), lineTop + 0.1f), TextGranularity.Companion.m6087getCharacterDRrd7Zo(), TextInclusionStrategy.Companion.getAnyOverlap());
    }

    /* JADX INFO: renamed from: getLineForHandwritingGesture-d-4ec7I */
    private static final int m1501getLineForHandwritingGestured4ec7I(MultiParagraph multiParagraph, long j2, ViewConfiguration viewConfiguration) {
        float handwritingGestureLineMargin = viewConfiguration != null ? viewConfiguration.getHandwritingGestureLineMargin() : 0.0f;
        int lineForVerticalPosition = multiParagraph.getLineForVerticalPosition(Offset.m3938getYimpl(j2));
        if (Offset.m3938getYimpl(j2) < multiParagraph.getLineTop(lineForVerticalPosition) - handwritingGestureLineMargin || Offset.m3938getYimpl(j2) > multiParagraph.getLineBottom(lineForVerticalPosition) + handwritingGestureLineMargin || Offset.m3937getXimpl(j2) < (-handwritingGestureLineMargin) || Offset.m3937getXimpl(j2) > multiParagraph.getWidth() + handwritingGestureLineMargin) {
            return -1;
        }
        return lineForVerticalPosition;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt$compoundEditCommand$1 */
    /* JADX INFO: compiled from: HandwritingGesture.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0019\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007ӬT\u0011Մ\rn\u0001ˎ`D\u0014Gv`a*'k*5T_2s[;\u0004\u001dD6߄SR"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006\u0006%HhG$@x&=\u0017GDz4+\u001edh\u0003i_5M\t4K[R5^4rK#\"g\u000eH'\u0016\u0004fK(m*F]\u00066Q\rEx\n\u000bu\r9yNL^\u0018C\u0003\u00144\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|s8UK7t3s", "/o_9l\u001bH", "", "0tU3X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|\u001a7O Kl5\u001e\">", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements EditCommand {
        final /* synthetic */ EditCommand[] $editCommands;

        AnonymousClass1(EditCommand[] editCommandArr) {
            editCommandArr = editCommandArr;
        }

        @Override // androidx.compose.ui.text.input.EditCommand
        public void applyTo(androidx.compose.ui.text.input.EditingBuffer editingBuffer) {
            for (EditCommand editCommand : editCommandArr) {
                editCommand.applyTo(editingBuffer);
            }
        }
    }

    public static final EditCommand compoundEditCommand(EditCommand... editCommandArr) {
        return new EditCommand() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.compoundEditCommand.1
            final /* synthetic */ EditCommand[] $editCommands;

            AnonymousClass1(EditCommand[] editCommandArr2) {
                editCommandArr = editCommandArr2;
            }

            @Override // androidx.compose.ui.text.input.EditCommand
            public void applyTo(androidx.compose.ui.text.input.EditingBuffer editingBuffer) {
                for (EditCommand editCommand : editCommandArr) {
                    editCommand.applyTo(editingBuffer);
                }
            }
        };
    }

    /* JADX INFO: renamed from: enclosure-pWDy79M */
    private static final long m1500enclosurepWDy79M(long j2, long j3) {
        return TextRangeKt.TextRange(Math.min(TextRange.m6123getStartimpl(j2), TextRange.m6123getStartimpl(j2)), Math.max(TextRange.m6118getEndimpl(j3), TextRange.m6118getEndimpl(j3)));
    }
}
