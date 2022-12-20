public abstract class ProcessoEstado {

    public abstract String getEstado();

    public boolean registrar(Processo processo) {
        return false;
    }

    public boolean emAnalise(Processo processo) {
        return false;
    }

    public boolean pendente(Processo processo) {
        return false;
    }

    public boolean rejeitar(Processo processo) {
        return false;
    }

    public boolean concluir(Processo processo) {
        return false;
    }
}
