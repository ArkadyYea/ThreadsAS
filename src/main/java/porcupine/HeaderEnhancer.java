package porcupine;

import java.io.IOException;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;

@Provider
public class HeaderEnhancer implements WriterInterceptor {

	@Override
	public void aroundWriteTo(WriterInterceptorContext context)	throws IOException, WebApplicationException {
		context.getHeaders().add("X-Arka", "Hello");
		context.proceed();
	}

	

}
