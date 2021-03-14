package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    @Test
    void addition() {
        int a = 21;
        int b = 7;
        int total = new Sample().op(Sample.Operation.ADD,a,b);

        Assertions.assertThat(total).as("the additon of 21 + 7").isEqualTo(28);
    }

    @Test
    void multiplication() {
        int a = 2;
        int b = 5;
        int total = new Sample().op(Sample.Operation.MULT,a,b);
        Assertions.assertThat(total).as(" the multiplication of 2*5").isEqualTo(10);
    }
}
