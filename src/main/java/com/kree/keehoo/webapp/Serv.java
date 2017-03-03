package com.kree.keehoo.webapp;

import javax.ejb.Stateless;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



@Stateless
@Path("/")
public class Serv {

    public List<Contact> contactList = new ArrayList<>();

    @Path("/contacts")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Contact> dummyContact() {
      //  contactList.add(new Contact("dupa"));
      //  contactList.add(new Contact("dupeczka"));

        System.out.println("Current size of the contact list: "+contactList.size());
        if (!contactList.isEmpty()) return contactList;
        else return Collections.EMPTY_LIST;
    }


    @Path("/contacts")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addContact(@Valid Contact contat) {

        System.out.println("Contact to be added: "+contat.getName());

        contactList.add(contat);
        return Response.accepted().build();

    }

}
