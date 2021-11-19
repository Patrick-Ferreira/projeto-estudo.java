package service;

import model.Cliente;

public class AtivarCliente {

    public void ativarCliente(Cliente cliente, String msg){

        cliente.ativarCliente();

        System.out.println(msg);

    }
}
