public class ProcessoEstadoPendente extends ProcessoEstado{

    private ProcessoEstadoPendente() {};
    private static ProcessoEstadoPendente instance = new ProcessoEstadoPendente();
    public static ProcessoEstadoPendente getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pendente";
    }

    public boolean emAnalise(Processo processo) {
        processo.setEstado(ProcessoEstadoAnalise.getInstance());
        return true;
    }
}
