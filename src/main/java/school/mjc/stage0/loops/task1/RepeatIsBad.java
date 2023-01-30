package school.mjc.stage0.loops.task1;

import java.util.stream.IntStream;

public class RepeatIsBad {

    @SuppressWarnings("java:S106")
    public void repeatIsBad(){
        String phrase = "writing the same code doesn't have much impact, and it's also time consuming\n";
        String repeated = phrase.repeat(20);
        System.out.println(repeated);
    }
}
