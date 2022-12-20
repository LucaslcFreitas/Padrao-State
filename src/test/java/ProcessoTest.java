import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessoTest {

    Processo processo;

    @BeforeEach
    public void setUp() {
        processo = new Processo();
    }

    @Test
    public void naoDeveRegistrarProcessoRegistrado() {
        processo.setEstado(ProcessoEstadoRegistrado.getInstance());
        assertFalse(processo.registrar());
    }

    @Test
    public void deveAnalisarProcessoRegistrado() {
        processo.setEstado(ProcessoEstadoRegistrado.getInstance());
        assertTrue(processo.emAnalise());
        assertEquals(ProcessoEstadoAnalise.getInstance(), processo.getEstado());
    }

    @Test
    public void naoDevePenderProcessoRegistrado() {
        processo.setEstado(ProcessoEstadoRegistrado.getInstance());
        assertFalse(processo.pendente());
    }

    @Test
    public void naoDeveRejeitarProcessoRegistrado() {
        processo.setEstado(ProcessoEstadoRegistrado.getInstance());
        assertFalse(processo.rejeitar());
    }

    @Test
    public void naoDeveConcluirProcessoRegistrado() {
        processo.setEstado(ProcessoEstadoRegistrado.getInstance());
        assertFalse(processo.concluir());
    }

    @Test
    public void naoDeveRegistrarProcessoEmAnalise() {
        processo.setEstado(ProcessoEstadoAnalise.getInstance());
        assertFalse(processo.registrar());
    }

    @Test
    public void naoDeveAnalisarProcessoEmAnalise() {
        processo.setEstado(ProcessoEstadoAnalise.getInstance());
        assertFalse(processo.emAnalise());
    }

    @Test
    public void devePenderProcessoEmAnalise() {
        processo.setEstado(ProcessoEstadoAnalise.getInstance());
        assertTrue(processo.pendente());
        assertEquals(ProcessoEstadoPendente.getInstance(), processo.getEstado());
    }

    @Test
    public void deveRejeitarProcessoEmAnalise() {
        processo.setEstado(ProcessoEstadoAnalise.getInstance());
        assertTrue(processo.rejeitar());
        assertEquals(ProcessoEstadoRejeitado.getInstance(), processo.getEstado());
    }

    @Test
    public void deveConcluirProcessoEmAnalise() {
        processo.setEstado(ProcessoEstadoAnalise.getInstance());
        assertTrue(processo.concluir());
        assertEquals(ProcessoEstadoConcluido.getInstance(), processo.getEstado());
    }

    @Test
    public void naoDeveRegistrarProcessoPendente() {
        processo.setEstado(ProcessoEstadoPendente.getInstance());
        assertFalse(processo.registrar());
    }

    @Test
    public void deveAnalisarProcessoPendente() {
        processo.setEstado(ProcessoEstadoPendente.getInstance());
        assertTrue(processo.emAnalise());
        assertEquals(ProcessoEstadoAnalise.getInstance(), processo.getEstado());
    }

    @Test
    public void naoDevePenderProcessoPendente() {
        processo.setEstado(ProcessoEstadoPendente.getInstance());
        assertFalse(processo.pendente());
    }

    @Test
    public void naoDeveRejeitarProcessoPendente() {
        processo.setEstado(ProcessoEstadoPendente.getInstance());
        assertFalse(processo.rejeitar());
    }

    @Test
    public void naoDeveConcluirProcessoPendente() {
        processo.setEstado(ProcessoEstadoPendente.getInstance());
        assertFalse(processo.concluir());
    }

    @Test
    public void naoDeveRegistrarProcessoRejeitado() {
        processo.setEstado(ProcessoEstadoRejeitado.getInstance());
        assertFalse(processo.registrar());
    }

    @Test
    public void naoDeveAnalisarProcessoRejeitado() {
        processo.setEstado(ProcessoEstadoRejeitado.getInstance());
        assertFalse(processo.emAnalise());
    }

    @Test
    public void naoDevePenderProcessoRejeitado() {
        processo.setEstado(ProcessoEstadoRejeitado.getInstance());
        assertFalse(processo.pendente());
    }

    @Test
    public void naoDeveRejeitarProcessoRejeitado() {
        processo.setEstado(ProcessoEstadoRejeitado.getInstance());
        assertFalse(processo.rejeitar());
    }

    @Test
    public void naoDeveConcluirProcessoRejeitado() {
        processo.setEstado(ProcessoEstadoRejeitado.getInstance());
        assertFalse(processo.concluir());
    }

    @Test
    public void naoDeveRegistrarProcessoConcluido() {
        processo.setEstado(ProcessoEstadoConcluido.getInstance());
        assertFalse(processo.registrar());
    }

    @Test
    public void naoDeveAnalisarProcessoConcluido() {
        processo.setEstado(ProcessoEstadoConcluido.getInstance());
        assertFalse(processo.emAnalise());
    }

    @Test
    public void naoDevePenderProcessoConcluido() {
        processo.setEstado(ProcessoEstadoConcluido.getInstance());
        assertFalse(processo.pendente());
    }

    @Test
    public void naoDeveRejeitarProcessoConcluido() {
        processo.setEstado(ProcessoEstadoConcluido.getInstance());
        assertFalse(processo.rejeitar());
    }

    @Test
    public void naoDeveConcluirProcessoConcluido() {
        processo.setEstado(ProcessoEstadoConcluido.getInstance());
        assertFalse(processo.concluir());
    }
}