package androidx.compose.ui.text;

import android.text.Editable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
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
/* JADX INFO: compiled from: Html.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\u0007nʑA0R|P.XS2\u000fy\u0002<$a&yCIa\"}(\rWN}gvJ`\fK\u000f\u001c\u0016\u0001j2M[xs܈?2pn\u007fF]sK9xtd\u00040609\u0012\u0005/\u001cݵL\u0010\u0005}\fr\u001a\u0016H@\u001f?\u0003\u0019[\u000b2\u001a$FH\u00034[\u0016UdO\u001daH8;\u0003\u0018L~+m;\u0015M;P\u001bܢ\f?h,7X7c\u001akٜ\u0002OviL\u001b? B5n55CK\nVdg0\u001a#;g\u000fsqTk5Wn\u001d?-eby_T<@\u0012\n\u001fT\u0004<\u000bWT<32n&\u0016[v\tRn_0m\tȬy*<%8\u00183Y>af\u001aoI-f7*\n=\"1\u0016\u0007!\njT`]Bb\u000fi1\u007fEmT\\\u0010qE\f\f\u0019d\u0018)27u\u0007_\u007f\u001f7/%eei'/v\u001aHrq=ݪ_1zwj`@PsFC8\u000f$bbl-mfS\u0007;?\\L`\u0015\u0007 \u001b>d >7$>]}w0ҫL&!3H~7\bs\u001c\u001ae?v;SY\f\u0012wQ%.mV)ۊW/Ya'r\\V'bTx\u0016\u0010\u0004bV4\u0015H> +b;wǠ[]O\u0011:ZA+\u000e&ˊgX-bP<\u0003\u0018)%\u000f\u000f^tr\u0006f'X\\\u0003n2ECg4G5\u0006(vE\u0015%\u001d}\"\u000fwmZedn,t\u0004\u0012f*b`_NU\u0013=\u0004Y>\u00103]T\u0011myO(&)\f(\u001ekt<p r\u000f4\tl`N\u0003&P\u0006%ч\"Xp\u000eyyF)F:ҽ\rИBIzÅ*H\\9\u0015\u0005M {˝qݕ\u000155ξۘ!6"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r$Avs8VR;tC\u0001\u0011q`@\u0007p\u0002", "\u001ana4\"?FZb\rvquZ\u00138t\u007f1\u000b#| \u0016No\u001b\u0012", "1n]AX5M6\u0015\bye,\n", "=tc=h;", "\u001a`]1e6BRb\u000ezq;Fh.i\u000f$xG\u0001l", "uK^?ZuQ[ H\tZ?Ff9n\u000f(\u0005Oc\u0013 Fv\u000eIL\f1b|-Aq\u0015w\\CNz}}\u0014lp5\u0004j,$:\u0018", "1gP?T*MS&\r", "", ">/", "", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", ">0", "", ">1", "3mS\u0011b*N[\u0019\b\n", "3mS\u0012_,FS\"\u000e", "CqX", "", ":nR._\u0015:[\u0019", "?MP:X", "3mS\u001de,?W,fvi7\u0001\u00121", "6`]1_,\u001a\\\"\t\nZ;\u0001\u00138E\t'", "6`]1_,\u001a\\\"\t\nZ;\u0001\u00138S\u000f$\tO", "/sc?\\)Nb\u0019\r", "\u001ana4\"?FZb\rvquX\u0018>r\u0004%\fO\u0001%l", "7f]<e(;Z\u0019p}b;|\u0017:a}(", ">q^0X:LW\"\u0001^g:\f\u0016?c\u000f,\u0006I", "Adc\u0011b*N[\u0019\b\nE6z\u0005>o\r", "\u001ana4\"?FZb\rvquc\u0013-a\u000f2\t\u0016", "AjX=c,=3\"\u000e~m@", "AsP?g\u000bHQ)\u0007zg;", "AsP?g\fES!~\u0004m", "/sc@", "AsP?g\u0017KS\u001a\u0003\u000eF(\b\u00143n\u0002", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class AnnotationContentHandler implements ContentHandler {
    private final ContentHandler contentHandler;
    private final Editable output;

    @Override // org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i2, int i3) throws SAXException {
        this.contentHandler.characters(cArr, i2, i3);
    }

    @Override // org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        this.contentHandler.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
        this.contentHandler.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i2, int i3) throws SAXException {
        this.contentHandler.ignorableWhitespace(cArr, i2, i3);
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
        this.contentHandler.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        this.contentHandler.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
        this.contentHandler.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        this.contentHandler.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
        this.contentHandler.startPrefixMapping(str, str2);
    }

    public AnnotationContentHandler(ContentHandler contentHandler, Editable editable) {
        this.contentHandler = contentHandler;
        this.output = editable;
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (!Intrinsics.areEqual(str2, "annotation")) {
            this.contentHandler.startElement(str, str2, str3, attributes);
        } else if (attributes != null) {
            handleAnnotationStart(attributes);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        if (Intrinsics.areEqual(str2, "annotation")) {
            handleAnnotationEnd();
        } else {
            this.contentHandler.endElement(str, str2, str3);
        }
    }

    private final void handleAnnotationStart(Attributes attributes) {
        int length = attributes.getLength();
        for (int i2 = 0; i2 < length; i2++) {
            String localName = attributes.getLocalName(i2);
            if (localName == null) {
                localName = "";
            }
            String value = attributes.getValue(i2);
            String str = value != null ? value : "";
            if (localName.length() > 0 && str.length() > 0) {
                int length2 = this.output.length();
                this.output.setSpan(new AnnotationSpan(localName, str), length2, length2, 17);
            }
        }
    }

    private final void handleAnnotationEnd() {
        Editable editable = this.output;
        Object[] spans = editable.getSpans(0, editable.length(), AnnotationSpan.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (this.output.getSpanFlags((AnnotationSpan) obj) == 17) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotationSpan annotationSpan = (AnnotationSpan) arrayList2.get(i2);
            int spanStart = this.output.getSpanStart(annotationSpan);
            int length = this.output.length();
            this.output.removeSpan(annotationSpan);
            if (spanStart != length) {
                this.output.setSpan(annotationSpan, spanStart, length, 33);
            }
        }
    }
}
