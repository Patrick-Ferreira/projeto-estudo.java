package service;

import model.Cliente;

public class DesativarClinete {

    public void desativarCliente(Cliente cliente, String msg){

        cliente.desativarCliente();
        System.out.println(msg);

    }
}
