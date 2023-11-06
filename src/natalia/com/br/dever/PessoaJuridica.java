package natalia.com.br.dever;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    public PessoaJuridica(String name,String cnpj){
        super(name);
        this.cnpj = cnpj;
    }
    public String getCnpj(){
        return cnpj;
    }

    @Override
    public String getPessoaType() {
        return "Pessoa Juridica";
    }


}
