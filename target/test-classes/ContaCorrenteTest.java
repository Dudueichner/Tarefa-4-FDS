import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class ContaCorrenteTest{

    ContaCorrente conta;

    @BeforeEach
    void setup(){
        conta = new ContaCorrente();
    }

    @Test
    void ContaIniciaZerada(){
        Assertions.assertEquals(0, conta.getSaldo());
    }

    @Test 
    void ContaIniciaSilver(){
        Assertions.assertEquals("Silver", conta.getCategoria());
    }

    @Test 
    void TrocaCategoriaSilverParaGold(){
        conta.deposito(60000);
        Assertions.assertEquals("Gold", conta.getCategoria());
    }

    @Test 
    void TrocaCategoriaGoldParaPlatinum(){
        conta.deposito(60000);
        conta.deposito(150000);
        Assertions.assertEquals("Platinum", conta.getCategoria());
    }

    @Test 
    void TrocaCategoriaPlatinumParaGold(){
        conta.deposito(60000);
        conta.deposito(150000);
        conta.retirada(120000);
        Assertions.assertEquals("Gold", conta.getCategoria());
    }

    @Test 
    void TrocaCategoriaGoldParaSilver(){
        conta.deposito(60000);
        conta.retirada(40000);
        Assertions.assertEquals("Silver", conta.getCategoria());
    }
}