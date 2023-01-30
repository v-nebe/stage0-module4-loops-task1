package school.mjc.stage0.loops.task1;

import java.util.stream.IntStream;

public class RepeatIsBad {

    @SuppressWarnings("java:S106")
    public void repeatIsBad(){
        IntStream.range(0, 20)
                .mapToObj(x -> "writing the same code doesn't have much impact, and it's also time consuming")
                .forEach(System.out::println);
    }
}
