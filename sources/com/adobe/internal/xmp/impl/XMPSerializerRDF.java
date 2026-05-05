package com.adobe.internal.xmp.impl;

import com.adobe.internal.xmp.XMPConst;
import com.adobe.internal.xmp.XMPException;
import com.adobe.internal.xmp.XMPMeta;
import com.adobe.internal.xmp.XMPMetaFactory;
import com.adobe.internal.xmp.options.SerializeOptions;
import com.dynatrace.android.agent.Global;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class XMPSerializerRDF {
    private static final int DEFAULT_PAD = 2048;
    private static final String PACKET_HEADER = "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>";
    private static final String PACKET_TRAILER = "<?xpacket end=\"";
    private static final String PACKET_TRAILER2 = "\"?>";
    static final Set RDF_ATTR_QUALIFIER = new HashSet(Arrays.asList(XMPConst.XML_LANG, "rdf:resource", "rdf:ID", "rdf:bagID", "rdf:nodeID"));
    private static final String RDF_EMPTY_STRUCT = "<rdf:Description/>";
    private static final String RDF_RDF_END = "</rdf:RDF>";
    private static final String RDF_RDF_START = "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">";
    private static final String RDF_SCHEMA_END = "</rdf:Description>";
    private static final String RDF_SCHEMA_START = "<rdf:Description rdf:about=";
    private static final String RDF_STRUCT_END = "</rdf:Description>";
    private static final String RDF_STRUCT_START = "<rdf:Description";
    private static final String RDF_XMPMETA_END = "</x:xmpmeta>";
    private static final String RDF_XMPMETA_START = "<x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"";
    private SerializeOptions options;
    private CountOutputStream outputStream;
    private int padding;
    private int unicodeSize = 1;
    private OutputStreamWriter writer;
    private XMPMetaImpl xmp;

    private void addPadding(int i2) throws XMPException, IOException {
        if (this.options.getExactPacketLength()) {
            int bytesWritten = this.outputStream.getBytesWritten() + (i2 * this.unicodeSize);
            int i3 = this.padding;
            if (bytesWritten > i3) {
                throw new XMPException("Can't fit into specified packet size", 107);
            }
            this.padding = i3 - bytesWritten;
        }
        this.padding /= this.unicodeSize;
        int length = this.options.getNewline().length();
        int i4 = this.padding;
        if (i4 < length) {
            writeChars(i4, TokenParser.SP);
            return;
        }
        this.padding = i4 - length;
        while (true) {
            int i5 = this.padding;
            int i6 = length + 100;
            if (i5 < i6) {
                writeChars(i5, TokenParser.SP);
                writeNewline();
                return;
            } else {
                writeChars(100, TokenParser.SP);
                writeNewline();
                this.padding -= i6;
            }
        }
    }

    private void appendNodeValue(String str, boolean z2) throws IOException {
        if (str == null) {
            str = "";
        }
        write(Utils.escapeXML(str, z2, true));
    }

    private boolean canBeRDFAttrProp(XMPNode xMPNode) {
        return (xMPNode.hasQualifier() || xMPNode.getOptions().isURI() || xMPNode.getOptions().isCompositeProperty() || "[]".equals(xMPNode.getName())) ? false : true;
    }

    private void declareNamespace(String str, String str2, Set set, int i2) throws IOException {
        if (str2 == null) {
            QName qName = new QName(str);
            if (!qName.hasPrefix()) {
                return;
            }
            str = qName.getPrefix();
            str2 = XMPMetaFactory.getSchemaRegistry().getNamespaceURI(str + Global.COLON);
            declareNamespace(str, str2, set, i2);
        }
        if (set.contains(str)) {
            return;
        }
        writeNewline();
        writeIndent(i2);
        write("xmlns:");
        write(str);
        write("=\"");
        write(str2);
        write(34);
        set.add(str);
    }

    private void declareUsedNamespaces(XMPNode xMPNode, Set set, int i2) throws IOException {
        if (xMPNode.getOptions().isSchemaNode()) {
            declareNamespace(xMPNode.getValue().substring(0, xMPNode.getValue().length() - 1), xMPNode.getName(), set, i2);
        } else if (xMPNode.getOptions().isStruct()) {
            Iterator itIterateChildren = xMPNode.iterateChildren();
            while (itIterateChildren.hasNext()) {
                declareNamespace(((XMPNode) itIterateChildren.next()).getName(), null, set, i2);
            }
        }
        Iterator itIterateChildren2 = xMPNode.iterateChildren();
        while (itIterateChildren2.hasNext()) {
            declareUsedNamespaces((XMPNode) itIterateChildren2.next(), set, i2);
        }
        Iterator itIterateQualifier = xMPNode.iterateQualifier();
        while (itIterateQualifier.hasNext()) {
            XMPNode xMPNode2 = (XMPNode) itIterateQualifier.next();
            declareNamespace(xMPNode2.getName(), null, set, i2);
            declareUsedNamespaces(xMPNode2, set, i2);
        }
    }

    private void emitRDFArrayTag(XMPNode xMPNode, boolean z2, int i2) throws IOException {
        if (z2 || xMPNode.hasChildren()) {
            writeIndent(i2);
            write(z2 ? "<rdf:" : "</rdf:");
            if (xMPNode.getOptions().isArrayAlternate()) {
                write("Alt");
            } else if (xMPNode.getOptions().isArrayOrdered()) {
                write("Seq");
            } else {
                write("Bag");
            }
            if (!z2 || xMPNode.hasChildren()) {
                write(">");
            } else {
                write("/>");
            }
            writeNewline();
        }
    }

    private void endOuterRDFDescription(int i2) throws IOException {
        writeIndent(i2 + 1);
        write("</rdf:Description>");
        writeNewline();
    }

    private String serializeAsRDF() throws XMPException, IOException {
        int i2 = 0;
        if (!this.options.getOmitPacketWrapper()) {
            writeIndent(0);
            write(PACKET_HEADER);
            writeNewline();
        }
        if (!this.options.getOmitXmpMetaElement()) {
            writeIndent(0);
            write(RDF_XMPMETA_START);
            if (!this.options.getOmitVersionAttribute()) {
                write(XMPMetaFactory.getVersionInfo().getMessage());
            }
            write("\">");
            writeNewline();
            i2 = 1;
        }
        writeIndent(i2);
        write(RDF_RDF_START);
        writeNewline();
        if (this.options.getUseCanonicalFormat()) {
            serializeCanonicalRDFSchemas(i2);
        } else {
            serializeCompactRDFSchemas(i2);
        }
        writeIndent(i2);
        write(RDF_RDF_END);
        writeNewline();
        if (!this.options.getOmitXmpMetaElement()) {
            writeIndent(i2 - 1);
            write(RDF_XMPMETA_END);
            writeNewline();
        }
        String str = "";
        if (this.options.getOmitPacketWrapper()) {
            return "";
        }
        for (int baseIndent = this.options.getBaseIndent(); baseIndent > 0; baseIndent--) {
            str = str + this.options.getIndent();
        }
        return ((str + PACKET_TRAILER) + (this.options.getReadOnlyPacket() ? 'r' : 'w')) + PACKET_TRAILER2;
    }

    private void serializeCanonicalRDFProperty(XMPNode xMPNode, boolean z2, boolean z3, int i2) throws XMPException, IOException {
        boolean z4;
        int i3 = i2;
        String name = xMPNode.getName();
        if (z3) {
            name = "rdf:value";
        } else if ("[]".equals(name)) {
            name = "rdf:li";
        }
        writeIndent(i3);
        write(60);
        write(name);
        Iterator itIterateQualifier = xMPNode.iterateQualifier();
        boolean z5 = false;
        boolean z6 = false;
        boolean zEquals = false;
        while (true) {
            z4 = true;
            if (!itIterateQualifier.hasNext()) {
                break;
            }
            XMPNode xMPNode2 = (XMPNode) itIterateQualifier.next();
            if (RDF_ATTR_QUALIFIER.contains(xMPNode2.getName())) {
                zEquals = "rdf:resource".equals(xMPNode2.getName());
                if (!z3) {
                    write(32);
                    write(xMPNode2.getName());
                    write("=\"");
                    appendNodeValue(xMPNode2.getValue(), true);
                    write(34);
                }
            } else {
                z6 = true;
            }
        }
        if (!z6 || z3) {
            if (xMPNode.getOptions().isCompositeProperty()) {
                if (xMPNode.getOptions().isArray()) {
                    write(62);
                    writeNewline();
                    int i4 = i3 + 1;
                    emitRDFArrayTag(xMPNode, true, i4);
                    if (xMPNode.getOptions().isArrayAltText()) {
                        XMPNodeUtils.normalizeLangArray(xMPNode);
                    }
                    Iterator itIterateChildren = xMPNode.iterateChildren();
                    while (itIterateChildren.hasNext()) {
                        serializeCanonicalRDFProperty((XMPNode) itIterateChildren.next(), z2, false, i3 + 2);
                    }
                    emitRDFArrayTag(xMPNode, false, i4);
                } else if (zEquals) {
                    Iterator itIterateChildren2 = xMPNode.iterateChildren();
                    while (itIterateChildren2.hasNext()) {
                        XMPNode xMPNode3 = (XMPNode) itIterateChildren2.next();
                        if (!canBeRDFAttrProp(xMPNode3)) {
                            throw new XMPException("Can't mix rdf:resource and complex fields", 202);
                        }
                        writeNewline();
                        writeIndent(i3 + 1);
                        write(32);
                        write(xMPNode3.getName());
                        write("=\"");
                        appendNodeValue(xMPNode3.getValue(), true);
                        write(34);
                    }
                    write("/>");
                    writeNewline();
                } else if (xMPNode.hasChildren()) {
                    if (z2) {
                        write(">");
                        writeNewline();
                        i3++;
                        writeIndent(i3);
                        write(RDF_STRUCT_START);
                        write(">");
                    } else {
                        write(" rdf:parseType=\"Resource\">");
                    }
                    writeNewline();
                    Iterator itIterateChildren3 = xMPNode.iterateChildren();
                    while (itIterateChildren3.hasNext()) {
                        serializeCanonicalRDFProperty((XMPNode) itIterateChildren3.next(), z2, false, i3 + 1);
                    }
                    if (z2) {
                        writeIndent(i3);
                        write("</rdf:Description>");
                        writeNewline();
                        i3--;
                    }
                } else {
                    if (z2) {
                        write(">");
                        writeNewline();
                        writeIndent(i3 + 1);
                        write(RDF_EMPTY_STRUCT);
                        z5 = true;
                    } else {
                        write(" rdf:parseType=\"Resource\"/>");
                    }
                    writeNewline();
                }
                z5 = true;
            } else if (xMPNode.getOptions().isURI()) {
                write(" rdf:resource=\"");
                appendNodeValue(xMPNode.getValue(), true);
                write("\"/>");
                writeNewline();
            } else if (xMPNode.getValue() == null || "".equals(xMPNode.getValue())) {
                write("/>");
                writeNewline();
            } else {
                write(62);
                appendNodeValue(xMPNode.getValue(), false);
                z4 = false;
                z5 = true;
            }
        } else {
            if (zEquals) {
                throw new XMPException("Can't mix rdf:resource and general qualifiers", 202);
            }
            if (z2) {
                write(">");
                writeNewline();
                i3++;
                writeIndent(i3);
                write(RDF_STRUCT_START);
                write(">");
            } else {
                write(" rdf:parseType=\"Resource\">");
            }
            writeNewline();
            int i5 = i3 + 1;
            serializeCanonicalRDFProperty(xMPNode, z2, true, i5);
            Iterator itIterateQualifier2 = xMPNode.iterateQualifier();
            while (itIterateQualifier2.hasNext()) {
                XMPNode xMPNode4 = (XMPNode) itIterateQualifier2.next();
                if (!RDF_ATTR_QUALIFIER.contains(xMPNode4.getName())) {
                    serializeCanonicalRDFProperty(xMPNode4, z2, false, i5);
                }
            }
            if (z2) {
                writeIndent(i3);
                write("</rdf:Description>");
                writeNewline();
                i3--;
            }
            z5 = true;
        }
        if (z5) {
            if (z4) {
                writeIndent(i3);
            }
            write("</");
            write(name);
            write(62);
            writeNewline();
        }
    }

    private void serializeCanonicalRDFSchema(XMPNode xMPNode, int i2) throws XMPException, IOException {
        Iterator itIterateChildren = xMPNode.iterateChildren();
        while (itIterateChildren.hasNext()) {
            serializeCanonicalRDFProperty((XMPNode) itIterateChildren.next(), this.options.getUseCanonicalFormat(), false, i2 + 2);
        }
    }

    private void serializeCanonicalRDFSchemas(int i2) throws XMPException, IOException {
        if (this.xmp.getRoot().getChildrenLength() > 0) {
            startOuterRDFDescription(this.xmp.getRoot(), i2);
            Iterator itIterateChildren = this.xmp.getRoot().iterateChildren();
            while (itIterateChildren.hasNext()) {
                serializeCanonicalRDFSchema((XMPNode) itIterateChildren.next(), i2);
            }
            endOuterRDFDescription(i2);
            return;
        }
        writeIndent(i2 + 1);
        write(RDF_SCHEMA_START);
        writeTreeName();
        write("/>");
        writeNewline();
    }

    private void serializeCompactRDFArrayProp(XMPNode xMPNode, int i2) throws XMPException, IOException {
        write(62);
        writeNewline();
        int i3 = i2 + 1;
        emitRDFArrayTag(xMPNode, true, i3);
        if (xMPNode.getOptions().isArrayAltText()) {
            XMPNodeUtils.normalizeLangArray(xMPNode);
        }
        serializeCompactRDFElementProps(xMPNode, i2 + 2);
        emitRDFArrayTag(xMPNode, false, i3);
    }

    private boolean serializeCompactRDFAttrProps(XMPNode xMPNode, int i2) throws IOException {
        Iterator itIterateChildren = xMPNode.iterateChildren();
        boolean z2 = true;
        while (itIterateChildren.hasNext()) {
            XMPNode xMPNode2 = (XMPNode) itIterateChildren.next();
            if (canBeRDFAttrProp(xMPNode2)) {
                writeNewline();
                writeIndent(i2);
                write(xMPNode2.getName());
                write("=\"");
                appendNodeValue(xMPNode2.getValue(), true);
                write(34);
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0004 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void serializeCompactRDFElementProps(com.adobe.internal.xmp.impl.XMPNode r12, int r13) throws com.adobe.internal.xmp.XMPException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.internal.xmp.impl.XMPSerializerRDF.serializeCompactRDFElementProps(com.adobe.internal.xmp.impl.XMPNode, int):void");
    }

    private void serializeCompactRDFGeneralQualifier(int i2, XMPNode xMPNode) throws XMPException, IOException {
        write(" rdf:parseType=\"Resource\">");
        writeNewline();
        int i3 = i2 + 1;
        serializeCanonicalRDFProperty(xMPNode, false, true, i3);
        Iterator itIterateQualifier = xMPNode.iterateQualifier();
        while (itIterateQualifier.hasNext()) {
            serializeCanonicalRDFProperty((XMPNode) itIterateQualifier.next(), false, false, i3);
        }
    }

    private void serializeCompactRDFSchemas(int i2) throws XMPException, IOException {
        int i3 = i2 + 1;
        writeIndent(i3);
        write(RDF_SCHEMA_START);
        writeTreeName();
        HashSet hashSet = new HashSet();
        hashSet.add("xml");
        hashSet.add("rdf");
        Iterator itIterateChildren = this.xmp.getRoot().iterateChildren();
        while (itIterateChildren.hasNext()) {
            declareUsedNamespaces((XMPNode) itIterateChildren.next(), hashSet, i2 + 3);
        }
        Iterator itIterateChildren2 = this.xmp.getRoot().iterateChildren();
        int i4 = 1;
        while (itIterateChildren2.hasNext()) {
            int i5 = (-1) - (((-1) - i4) | ((-1) - (serializeCompactRDFAttrProps((XMPNode) itIterateChildren2.next(), i2 + 2) ? 1 : 0)));
            i4 = 1;
            if (i5 != 1) {
                i4 = 0;
            }
        }
        if (i4 != 0) {
            write("/>");
            writeNewline();
            return;
        }
        write(62);
        writeNewline();
        Iterator itIterateChildren3 = this.xmp.getRoot().iterateChildren();
        while (itIterateChildren3.hasNext()) {
            serializeCompactRDFElementProps((XMPNode) itIterateChildren3.next(), i2 + 2);
        }
        writeIndent(i3);
        write("</rdf:Description>");
        writeNewline();
    }

    private Object[] serializeCompactRDFSimpleProp(XMPNode xMPNode) throws IOException {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.TRUE;
        if (xMPNode.getOptions().isURI()) {
            write(" rdf:resource=\"");
            appendNodeValue(xMPNode.getValue(), true);
            write("\"/>");
            writeNewline();
            bool = Boolean.FALSE;
        } else if (xMPNode.getValue() == null || xMPNode.getValue().length() == 0) {
            write("/>");
            writeNewline();
            bool = Boolean.FALSE;
        } else {
            write(62);
            appendNodeValue(xMPNode.getValue(), false);
            bool2 = Boolean.FALSE;
        }
        return new Object[]{bool, bool2};
    }

    private boolean serializeCompactRDFStructProp(XMPNode xMPNode, int i2, boolean z2) throws XMPException, IOException {
        Iterator itIterateChildren = xMPNode.iterateChildren();
        boolean z3 = false;
        boolean z4 = false;
        while (itIterateChildren.hasNext()) {
            if (canBeRDFAttrProp((XMPNode) itIterateChildren.next())) {
                z3 = true;
            } else {
                z4 = true;
            }
            if (z3 && z4) {
                break;
            }
        }
        if (z2 && z4) {
            throw new XMPException("Can't mix rdf:resource qualifier and element fields", 202);
        }
        if (!xMPNode.hasChildren()) {
            write(" rdf:parseType=\"Resource\"/>");
            writeNewline();
            return false;
        }
        if (!z4) {
            serializeCompactRDFAttrProps(xMPNode, i2 + 1);
            write("/>");
            writeNewline();
            return false;
        }
        if (z3) {
            write(62);
            writeNewline();
            int i3 = i2 + 1;
            writeIndent(i3);
            write(RDF_STRUCT_START);
            serializeCompactRDFAttrProps(xMPNode, i2 + 2);
            write(">");
            writeNewline();
            serializeCompactRDFElementProps(xMPNode, i3);
            writeIndent(i3);
            write("</rdf:Description>");
            writeNewline();
        } else {
            write(" rdf:parseType=\"Resource\">");
            writeNewline();
            serializeCompactRDFElementProps(xMPNode, i2 + 1);
        }
        return true;
    }

    private void startOuterRDFDescription(XMPNode xMPNode, int i2) throws IOException {
        writeIndent(i2 + 1);
        write(RDF_SCHEMA_START);
        writeTreeName();
        HashSet hashSet = new HashSet();
        hashSet.add("xml");
        hashSet.add("rdf");
        declareUsedNamespaces(xMPNode, hashSet, i2 + 3);
        write(62);
        writeNewline();
    }

    private void write(int i2) throws IOException {
        this.writer.write(i2);
    }

    private void write(String str) throws IOException {
        this.writer.write(str);
    }

    private void writeChars(int i2, char c2) throws IOException {
        while (i2 > 0) {
            this.writer.write(c2);
            i2--;
        }
    }

    private void writeIndent(int i2) throws IOException {
        for (int baseIndent = this.options.getBaseIndent() + i2; baseIndent > 0; baseIndent--) {
            this.writer.write(this.options.getIndent());
        }
    }

    private void writeNewline() throws IOException {
        this.writer.write(this.options.getNewline());
    }

    private void writeTreeName() throws IOException {
        write(34);
        String name = this.xmp.getRoot().getName();
        if (name != null) {
            appendNodeValue(name, true);
        }
        write(34);
    }

    protected void checkOptionsConsistence() throws XMPException {
        boolean encodeUTF16BE = this.options.getEncodeUTF16BE();
        boolean encodeUTF16LE = this.options.getEncodeUTF16LE();
        if (((encodeUTF16BE ? 1 : 0) + (encodeUTF16LE ? 1 : 0)) - ((encodeUTF16BE ? 1 : 0) & (encodeUTF16LE ? 1 : 0)) == 1) {
            this.unicodeSize = 2;
        }
        if (this.options.getExactPacketLength()) {
            if ((-1) - (((-1) - (this.options.getOmitPacketWrapper() ? 1 : 0)) & ((-1) - (this.options.getIncludeThumbnailPad() ? 1 : 0))) == 1) {
                throw new XMPException("Inconsistent options for exact size serialize", 103);
            }
            int padding = this.options.getPadding();
            int i2 = this.unicodeSize - 1;
            if ((padding + i2) - (padding | i2) != 0) {
                throw new XMPException("Exact size must be a multiple of the Unicode element", 103);
            }
            return;
        }
        if (this.options.getReadOnlyPacket()) {
            boolean omitPacketWrapper = this.options.getOmitPacketWrapper();
            boolean includeThumbnailPad = this.options.getIncludeThumbnailPad();
            if (((omitPacketWrapper ? 1 : 0) + (includeThumbnailPad ? 1 : 0)) - ((omitPacketWrapper ? 1 : 0) & (includeThumbnailPad ? 1 : 0)) == 1) {
                throw new XMPException("Inconsistent options for read-only packet", 103);
            }
            this.padding = 0;
            return;
        }
        if (this.options.getOmitPacketWrapper()) {
            if (this.options.getIncludeThumbnailPad()) {
                throw new XMPException("Inconsistent options for non-packet serialize", 103);
            }
            this.padding = 0;
        } else {
            if (this.padding == 0) {
                this.padding = this.unicodeSize * 2048;
            }
            if (!this.options.getIncludeThumbnailPad() || this.xmp.doesPropertyExist("http://ns.adobe.com/xap/1.0/", "Thumbnails")) {
                return;
            }
            this.padding += this.unicodeSize * 10000;
        }
    }

    public void serialize(XMPMeta xMPMeta, OutputStream outputStream, SerializeOptions serializeOptions) throws XMPException {
        try {
            this.outputStream = new CountOutputStream(outputStream);
            this.writer = new OutputStreamWriter(this.outputStream, serializeOptions.getEncoding());
            this.xmp = (XMPMetaImpl) xMPMeta;
            this.options = serializeOptions;
            this.padding = serializeOptions.getPadding();
            this.writer = new OutputStreamWriter(this.outputStream, serializeOptions.getEncoding());
            checkOptionsConsistence();
            String strSerializeAsRDF = serializeAsRDF();
            this.writer.flush();
            addPadding(strSerializeAsRDF.length());
            write(strSerializeAsRDF);
            this.writer.flush();
            this.outputStream.close();
        } catch (IOException unused) {
            throw new XMPException("Error writing to the OutputStream", 0);
        }
    }
}
