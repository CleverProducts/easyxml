package org.clever.easyxml.handler;

import org.clever.easyxml.EasyXmlException;
import org.xml.sax.*;

/**
 * Created by sinan on 20.01.2016.
 */
public interface  Handler {

    void setDocumentLocator(Locator locator);

    void startDocument() throws EasyXmlException;

    void endDocument() throws EasyXmlException;

    void startPrefixMapping(String prefix, String uri) throws EasyXmlException;

    void endPrefixMapping(String prefix) throws EasyXmlException;

    void startElement(String uri, String localName, String qName, Attributes atts) throws EasyXmlException;

    void endElement (String uri, String localName, String qName) throws EasyXmlException;

    void characters (char ch[], int start, int length) throws EasyXmlException;

    void value(String value) throws EasyXmlException;

    void ignorableWhitespace (char ch[], int start, int length) throws EasyXmlException;

    void processingInstruction (String target, String data) throws EasyXmlException;

    void skippedEntity (String name) throws EasyXmlException;

}
