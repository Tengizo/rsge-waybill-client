package com.rs.client.utils;

import com.rs.client.exceptions.ExceptionType;
import com.rs.client.exceptions.RsClientException;
import com.rs.client.model.Result;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.w3c.dom.Node;

public class XmlUnmarshaller {

    public static <T> T getObjectFromXml(Object xmlObj, Class<T> cls) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(cls);
            Unmarshaller um = jaxbContext.createUnmarshaller();
            Object unmarshal = um.unmarshal((Node) xmlObj);
            return (cls.cast(unmarshal)) ;
        } catch (JAXBException e) {
            try {
                JAXBContext context = JAXBContext.newInstance(Result.class);
                Unmarshaller umError = context.createUnmarshaller();
                Result result = (Result) umError.unmarshal((Node) xmlObj);
                if (result.getSTATUS() == -100) {
                    throw new RsClientException(result.getText(), ExceptionType.INVALID_USERNAME_OR_PASSWORD, result.getSTATUS());
                }
            }
            catch (JAXBException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
        return null;
    }


}