package com.shelach.orders.comax.converters;

import com.shelach.orders.comax.generated.pricesresult.GetAllItemsPricesByParamsResponse;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Scanner;

@Service
public class GetAllItemsPricesMessageConverter extends AbstractHttpMessageConverter {
    private static String toString(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream, "UTF-8");
        return scanner.useDelimiter("\\A").next();
    }

    public String stripSoap(String msg) {
        return msg.replaceAll("[\r\n\t]", "").replaceAll("(<soap:Envelope.*?>\\s*<soap:Body>)|(\\s*</soap:Body>\\s*</soap:Envelope>)", "");
    }

    @Override
    protected boolean supports(Class clazz) {
        return GetAllItemsPricesByParamsResponse.class.isAssignableFrom(clazz);
    }

    @Override
    public boolean canRead(Class clazz, MediaType mediaType) {
        return supports(clazz);
    }

    @Override
    protected Object readInternal(Class clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        String requestBody = toString(inputMessage.getBody());
        int i = requestBody.indexOf('\n');
        if (i == -1) {
            throw new HttpMessageNotReadableException("No first line found", inputMessage);
        }
        String messageOnly = stripSoap(requestBody);
        Unmarshaller unmarshaller = null;
        try {
            unmarshaller = JAXBContext.newInstance(GetAllItemsPricesByParamsResponse.class).createUnmarshaller();
            return unmarshaller.unmarshal(new StringReader(messageOnly));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void writeInternal(Object o, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

    }
}
