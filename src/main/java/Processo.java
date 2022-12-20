public class Processo {
    private String descricao;
    private ProcessoEstado estado;

    public Processo() {
        this.estado = ProcessoEstadoRegistrado.getInstance();
    }

    public void setEstado(ProcessoEstado estado) {
        this.estado = estado;
    }

    public boolean registrar() {
        return estado.registrar(this);
    }

    public boolean emAnalise() {
        return estado.emAnalise(this);
    }

    public boolean pendente() {
        return estado.pendente(this);
    }

    public boolean rejeitar() {
        return estado.rejeitar(this);
    }

    public boolean concluir() {
        return estado.concluir(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ProcessoEstado getEstado() {
        return estado;
    }
}
