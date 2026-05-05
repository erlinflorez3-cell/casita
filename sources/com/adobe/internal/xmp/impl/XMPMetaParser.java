package com.adobe.internal.xmp.impl;

import com.adobe.internal.xmp.XMPException;
import com.adobe.internal.xmp.XMPMeta;
import com.adobe.internal.xmp.options.ParseOptions;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes4.dex */
public class XMPMetaParser {
    private static final Object XMP_RDF = new Object();
    private static DocumentBuilderFactory factory = createDocumentBuilderFactory();

    private XMPMetaParser() {
    }

    private static DocumentBuilderFactory createDocumentBuilderFactory() {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        documentBuilderFactoryNewInstance.setIgnoringComments(true);
        documentBuilderFactoryNewInstance.setExpandEntityReferences(false);
        try {
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            documentBuilderFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            documentBuilderFactoryNewInstance.setFeature("http://xerces.apache.org/xerces2-j/features.html#disallow-doctype-decl", false);
            documentBuilderFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            documentBuilderFactoryNewInstance.setFeature("http://xerces.apache.org/xerces2-j/features.html#external-parameter-entities", false);
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            documentBuilderFactoryNewInstance.setXIncludeAware(false);
            documentBuilderFactoryNewInstance.setExpandEntityReferences(false);
        } catch (Throwable unused) {
        }
        return documentBuilderFactoryNewInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object[] findRootNode(org.w3c.dom.Node r7, boolean r8, java.lang.Object[] r9) {
        /*
            org.w3c.dom.NodeList r3 = r7.getChildNodes()
            r2 = 0
            r1 = r2
        L6:
            int r0 = r3.getLength()
            if (r1 >= r0) goto L8a
            org.w3c.dom.Node r4 = r3.item(r1)
            short r0 = r4.getNodeType()
            r7 = 7
            if (r7 != r0) goto L33
            r6 = r4
            org.w3c.dom.ProcessingInstruction r6 = (org.w3c.dom.ProcessingInstruction) r6
            java.lang.String r5 = r6.getTarget()
            java.lang.String r0 = "xpacket"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L33
            if (r9 == 0) goto L30
            r4 = 2
            java.lang.String r0 = r6.getData()
            r9[r4] = r0
        L30:
            int r1 = r1 + 1
            goto L6
        L33:
            r5 = 3
            short r0 = r4.getNodeType()
            if (r5 == r0) goto L30
            short r0 = r4.getNodeType()
            if (r7 == r0) goto L30
            java.lang.String r5 = r4.getNamespaceURI()
            java.lang.String r6 = r4.getLocalName()
            java.lang.String r0 = "xmpmeta"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "xapmeta"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L67
        L5a:
            java.lang.String r0 = "adobe:ns:meta/"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L67
            java.lang.Object[] r0 = findRootNode(r4, r2, r9)
            return r0
        L67:
            if (r8 != 0) goto L83
            java.lang.String r0 = "RDF"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L83
            java.lang.String r0 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L83
            if (r9 == 0) goto L82
            r9[r2] = r4
            java.lang.Object r1 = com.adobe.internal.xmp.impl.XMPMetaParser.XMP_RDF
            r0 = 1
            r9[r0] = r1
        L82:
            return r9
        L83:
            java.lang.Object[] r0 = findRootNode(r4, r8, r9)
            if (r0 == 0) goto L30
            return r0
        L8a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.internal.xmp.impl.XMPMetaParser.findRootNode(org.w3c.dom.Node, boolean, java.lang.Object[]):java.lang.Object[]");
    }

    public static XMPMeta parse(Object obj, ParseOptions parseOptions) throws XMPException {
        ParameterAsserts.assertNotNull(obj);
        if (parseOptions == null) {
            parseOptions = new ParseOptions();
        }
        Object[] objArrFindRootNode = findRootNode(parseXml(obj, parseOptions), parseOptions.getRequireXMPMeta(), new Object[3]);
        if (objArrFindRootNode == null || objArrFindRootNode[1] != XMP_RDF) {
            return new XMPMetaImpl();
        }
        XMPMetaImpl xMPMetaImpl = ParseRDF.parse((Node) objArrFindRootNode[0], parseOptions);
        xMPMetaImpl.setPacketHeader((String) objArrFindRootNode[2]);
        return !parseOptions.getOmitNormalization() ? XMPNormalizer.process(xMPMetaImpl, parseOptions) : xMPMetaImpl;
    }

    private static Document parseInputSource(InputSource inputSource) throws XMPException {
        try {
            DocumentBuilder documentBuilderNewDocumentBuilder = factory.newDocumentBuilder();
            documentBuilderNewDocumentBuilder.setErrorHandler(null);
            return documentBuilderNewDocumentBuilder.parse(inputSource);
        } catch (IOException e2) {
            throw new XMPException("Error reading the XML-file", 204, e2);
        } catch (ParserConfigurationException e3) {
            throw new XMPException("XML Parser not correctly configured", 0, e3);
        } catch (SAXException e4) {
            throw new XMPException("XML parsing failure", 201, e4);
        }
    }

    private static Document parseXml(Object obj, ParseOptions parseOptions) throws XMPException {
        return obj instanceof InputStream ? parseXmlFromInputStream((InputStream) obj, parseOptions) : obj instanceof byte[] ? parseXmlFromBytebuffer(new ByteBuffer((byte[]) obj), parseOptions) : parseXmlFromString((String) obj, parseOptions);
    }

    private static Document parseXmlFromBytebuffer(ByteBuffer byteBuffer, ParseOptions parseOptions) throws XMPException {
        try {
            InputSource inputSource = new InputSource(byteBuffer.getByteStream());
            try {
                if (parseOptions.getDisallowDoctype()) {
                    try {
                        factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
                    } catch (Throwable unused) {
                    }
                }
                return parseInputSource(inputSource);
            } catch (XMPException e2) {
                if ("DOCTYPE is disallowed".equals(e2.getCause().getMessage())) {
                    throw new XMPException(e2.getCause().getMessage(), 201);
                }
                if (e2.getErrorCode() != 201 && e2.getErrorCode() != 204) {
                    throw e2;
                }
                if (parseOptions.getAcceptLatin1()) {
                    byteBuffer = Latin1Converter.convert(byteBuffer);
                }
                if (!parseOptions.getFixControlChars()) {
                    return parseInputSource(new InputSource(byteBuffer.getByteStream()));
                }
                return parseInputSource(new InputSource(new FixASCIIControlsReader(new InputStreamReader(byteBuffer.getByteStream(), byteBuffer.getEncoding()))));
            }
        } catch (UnsupportedEncodingException e3) {
            throw new XMPException("Unsupported Encoding", 9, e3);
        }
    }

    private static Document parseXmlFromInputStream(InputStream inputStream, ParseOptions parseOptions) throws XMPException {
        if (!parseOptions.getAcceptLatin1() && !parseOptions.getFixControlChars() && !parseOptions.getDisallowDoctype()) {
            return parseInputSource(new InputSource(inputStream));
        }
        try {
            return parseXmlFromBytebuffer(new ByteBuffer(inputStream), parseOptions);
        } catch (IOException e2) {
            throw new XMPException("Error reading the XML-file", 204, e2);
        }
    }

    private static Document parseXmlFromString(String str, ParseOptions parseOptions) throws XMPException {
        try {
            if (parseOptions.getDisallowDoctype()) {
                try {
                    factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
                } catch (Throwable unused) {
                }
            }
            return parseInputSource(new InputSource(new StringReader(str)));
        } catch (XMPException e2) {
            if (e2.getErrorCode() == 201 && parseOptions.getFixControlChars()) {
                return parseInputSource(new InputSource(new FixASCIIControlsReader(new StringReader(str))));
            }
            throw e2;
        }
    }
}
