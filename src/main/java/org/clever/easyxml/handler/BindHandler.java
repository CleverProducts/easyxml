package org.clever.easyxml.handler;

import org.clever.easyxml.EasyXmlException;


/**
 * Created by sinan on 23.01.2016.
 */
public interface BindHandler<T> {
    void value(T t) throws EasyXmlException;
}
