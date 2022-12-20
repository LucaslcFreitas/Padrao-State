public class ProcessoEstadoRegistrado extends ProcessoEstado{

    private ProcessoEstadoRegistrado() {};
    public static ProcessoEstadoRegistrado instance = new ProcessoEstadoRegistrado();
    public static ProcessoEstadoRegistrado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Registrado";
    }

    public boolean emAnalise(Processo processo) {
        processo.setEstado(ProcessoEstadoAnalise.getInstance());
        return true;
    }
}
