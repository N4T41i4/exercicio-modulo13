package natalia.com.br.dever;

public class PessoaFisica extends Pessoa{
    private String cpf;
    public PessoaFisica(String nome,String cpf){
        super(nome);
        this.cpf=cpf;
    }
      public String getCpf(){
        return cpf;

      }

    @Override
    public String getPessoaType() {
        return "Pessoa Fisica";
    }
}

