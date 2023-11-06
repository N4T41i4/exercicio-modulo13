package natalia.com.br.dever;

public class Principal {

        public static void main(String[] args) {
            PessoaFisica pessoaFisica = new PessoaFisica("Natalia", "223.776.999-00");
            PessoaJuridica pessoaJuridica = new PessoaJuridica("Oracle", "000.345.688/0001-00");

            System.out.println(pessoaFisica.getNome() + " - " + pessoaFisica.getCpf() + "      -  " + pessoaFisica.getPessoaType());
            System.out.println(pessoaJuridica.getNome() + "  - " +pessoaJuridica.getCnpj()+" -  "+pessoaJuridica.getPessoaType());
        }
    }
