package com.epicode.U5D2;

import static org.junit.jupiter.api.Assertions.*;

import com.epicode.U5D2.entities.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class OrdersRunnerTests {

    @Test
    public void testRun_Success() {
        OrdersRunner ordersRunner = new OrdersRunner();
        assertDoesNotThrow(() -> ordersRunner.run());
    } //Testa l'esecuzione normale del metodo run senza alcuna eccezione.

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void testParameterizedRun(int value) {
        OrdersRunner ordersRunner = new OrdersRunner();
        assertDoesNotThrow(() -> ordersRunner.run(String.valueOf(value)));
    } //Test parametrico che esegue il metodo run con valori interi diversi.

    @Test
    public void testRun_ExceptionHandling() {
        OrdersRunner ordersRunner = new OrdersRunner();
        String[] args = {"arg1", "arg2"}; // Pass arguments that may cause an exception
        assertDoesNotThrow(() -> ordersRunner.run(args));
    } //Testa la gestione delle eccezioni del metodo run passando argomenti che possono causare un'eccezione.

    @Test
    public void testRun_NullArgs() {
        OrdersRunner ordersRunner = new OrdersRunner();
        String[] args = null;
        assertDoesNotThrow(() -> ordersRunner.run(args));
    } //Testa il metodo run con argomenti nulli.

    @Test
    public void testRun_EmptyArgs() {
        OrdersRunner ordersRunner = new OrdersRunner();
        String[] args = {};
        assertDoesNotThrow(() -> ordersRunner.run(args));
    } //Testa il metodo run con un array di argomenti vuoto.


}
