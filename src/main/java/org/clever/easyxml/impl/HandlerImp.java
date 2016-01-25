package org.clever.easyxml.impl;

import org.clever.easyxml.EasyXmlException;
import org.clever.easyxml.handler.Handler;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;

/**
 * Created by sinan on 22.01.2016.
 */
public class HandlerImp implements Handler {
    public void setDocumentLocator(Locator locator) {

    }

    public void startDocument() throws EasyXmlException {
        System.out.println();
    }

    public void endDocument() throws EasyXmlException {

    }

    public void startPrefixMapping(String prefix, String uri) throws EasyXmlException {

    }

    public void endPrefixMapping(String prefix) throws EasyXmlException {

    }

    public void startElement(String uri, String localName, String qName, Attributes atts) throws EasyXmlException {
        System.out.println("start element");
    }

    public void endElement(String uri, String localName, String qName) throws EasyXmlException {

    }

    public void characters(char[] ch, int start, int length) throws EasyXmlException {

    }

    public void value(String value) throws EasyXmlException {

    }

    public void ignorableWhitespace(char[] ch, int start, int length) throws EasyXmlException {

    }

    public void processingInstruction(String target, String data) throws EasyXmlException {

    }

    public void skippedEntity(String name) throws EasyXmlException {

    }
}
