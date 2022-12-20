public class ProcessoEstadoConcluido extends ProcessoEstado{

    private ProcessoEstadoConcluido() {};
    private static ProcessoEstadoConcluido instance = new ProcessoEstadoConcluido();
    public static ProcessoEstadoConcluido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Concluido";
    }
}
