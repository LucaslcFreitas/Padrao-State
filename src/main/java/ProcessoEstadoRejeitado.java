public class ProcessoEstadoRejeitado extends ProcessoEstado{

    private ProcessoEstadoRejeitado() {};
    private static ProcessoEstadoRejeitado instance = new ProcessoEstadoRejeitado();
    public static ProcessoEstadoRejeitado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Rejeitado";
    }
}
