package org.clever.easyxml.impl;

import org.clever.easyxml.EasyXmlException;
import org.clever.easyxml.handler.BindHandler;
import org.omg.CORBA.Object;

/**
 * Created by sinan on 24.01.2016.
 */
public class BindHandlerImp implements BindHandler<Object>{
    public void value(Object o) throws EasyXmlException {
        System.out.println(o.toString());
    }
}
