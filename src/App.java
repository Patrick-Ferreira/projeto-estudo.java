import model.Cliente;
import service.AtivarCliente;
import service.DesativarClinete;

public class App {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Patrick","patrick@email.com","99988-8888");
        System.out.println(cliente);

        AtivarCliente ativarCliente;
        ativarCliente = new AtivarCliente();

       ativarCliente.ativarCliente(cliente, "O cliente "+cliente.getNome()+" foi ativado com sucesso");

        DesativarClinete desativarClinete = new DesativarClinete();
        desativarClinete.desativarCliente(cliente,"O clinte "+ cliente.getNome()+ " foi desativado com sucesso");

    }
}
