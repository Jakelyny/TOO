package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Carro;
import br.edu.ifsul.modelo.Cobertura;
import br.edu.ifsul.modelo.Corretor;
import br.edu.ifsul.modelo.Pessoa;
import br.edu.ifsul.modelo.Seguro;
import java.util.Calendar;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorgebavaresco@ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
public class UsaSeguro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(1);
        pessoa.setNome("Jorge");

        Corretor corretor = new Corretor();
        corretor.setId(2);
        corretor.setNome("Lucas");
        corretor.setPercentualComissao(3.0);

        Carro carro = new Carro();
        carro.setId(1);
        carro.setModelo("Gol");
        carro.setPessoa(pessoa);
        carro.setPlaca("IUY-3456");

        Seguro seguro = new Seguro();
        seguro.setId(1);
        seguro.setCarro(carro);
        seguro.setCorretor(corretor);
        seguro.setData(Calendar.getInstance());
        seguro.setValorTotal(2500.00);

        Cobertura c = new Cobertura();
        c.setId(1);
        c.setDescricao("Seguro contra roubo");
        c.setValor(1000.00);

        seguro.getCoberturas().add(c);

        Cobertura c1 = new Cobertura();
        c1.setId(2);
        c1.setDescricao("Seguro contra terceiros");
        c1.setValor(1500.00);

        seguro.getCoberturas().add(c1);
        
        System.out.println("Seguro: " + seguro.getId() + " Carro: " + seguro.getCarro().getPlaca() + 
                "\nCliente: " + seguro.getCarro().getPessoa().getNome() + " Valor: " + seguro.getValorTotal()+ 
                "\nCorretor: " + seguro.getCorretor().getNome());
        System.out.println("Coberturas: ");
        for (Cobertura co : seguro.getCoberturas()){
            System.out.println("Cobertura: " + co.getDescricao() + " Valor: " + co.getValor());
        }
    }

}
