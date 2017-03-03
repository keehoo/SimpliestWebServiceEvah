package com.kree.keehoo.webapp;

import javax.ejb.Stateless;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;



@Stateless
@Path("/")
public class Serv {

    public List<Contact> contactList = new ArrayList<>();

    @Path("/contacts")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Contact> dummyContact() {
        contactList.add(new Contact("dupa"));
        contactList.add(new Contact("dupeczka"));
        return contactList;
    }


    @Path("/contacts")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addContact(@Valid Contact contat) {

        contactList.add(contat);
        return Response.accepted().build();

    }

}
