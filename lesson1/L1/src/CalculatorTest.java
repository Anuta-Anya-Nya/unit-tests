import static.org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        // Ручное тестирование на позитивные сченарии
        // if (4 != Calculator.calculation(2, 2, '+')) {
        //     throw new AssertionError("Ошибка в методе");
        // }
        // if (2 != Calculator.calculation(4, 2, '-')) {
        //     throw new AssertionError("Ошибка в методе");
        // }
        // if (4 != Calculator.calculation(8, 2, '/')) {
        //     throw new AssertionError("Ошибка в методе");
        // }
        // if (6 != Calculator.calculation(3, 2, '*')) {
        //     throw new AssertionError("Ошибка в методе");
        // }


        // Утверждение
        assert 4 == Calculator.calculation(2, 2, '+');
        assert 2 == Calculator.calculation(4, 2, '-');
        assert 8 == Calculator.calculation(8, 2, '/');
        assert 9 == Calculator.calculation(3, 2, '*');
        

        // С помощью библиотеки assertj
        assertThat(Calculator.calculation(2, 2, '+')).isEqualTo(4);
        
        assertThatThrownBy(()-> Calculator.calculation(8, 4, '_')).isInstanceOf(IllegalStateException.class);

        // В случае деления на ноль или введения другого знака проверяем негативный сченарий
        // try {
        //     Calculator.calculation(8, 4, '_');
        // } catch (IllegalStateException e) {
        //     if (!e.getMessage().equals("Unexpected value operator: _")) {
        //         throw new AssertionError("Ошибка в методе");
        //     }
        // }
    }

}
