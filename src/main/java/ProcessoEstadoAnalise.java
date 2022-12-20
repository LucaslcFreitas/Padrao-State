public class ProcessoEstadoAnalise extends ProcessoEstado {

    private ProcessoEstadoAnalise() {};
    private static ProcessoEstadoAnalise instance = new ProcessoEstadoAnalise();
    public static ProcessoEstadoAnalise getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Analise";
    }

    public boolean pendente(Processo processo) {
        processo.setEstado(ProcessoEstadoPendente.getInstance());
        return true;
    }

    public boolean rejeitar(Processo processo) {
        processo.setEstado(ProcessoEstadoRejeitado.getInstance());
        return true;
    }

    public boolean concluir(Processo processo) {
        processo.setEstado(ProcessoEstadoConcluido.getInstance());
        return true;
    }
}
