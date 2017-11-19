package org.pirozhok.resources;

import java.io.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

@Path("/pirozhok")
public class StihotvorenieResource {
    @GET
    @Path("/random")
    @Produces("application/json")
    public String handleDownload(@PathParam("file") final String file) throws Exception {
       String body = "а красноречие короче\n" +
                "ну это в общем типа я\n" +
                "и типа ты такой и так же\n" +
                "как я умеешь говорить";
        String author = "© urri";
        return "{\"body\":\""+body+"\", \"author\":\""+author+"\"}";
    }
    
}
