package dev.project.computersshop.dtos;

import dev.project.computersshop.models.Client;

public class ClientDtoResponse {
    private int id;
    private String firstName;
    private String lastName;
    private String dni;    

    public ClientDtoResponse(Client client) {
        this.id = client.getId();
        this.firstName = client.getFirstName();
        this.lastName = client.getLastName();
        this.dni = client.getDni();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDni() {
        return dni;
    }
}
