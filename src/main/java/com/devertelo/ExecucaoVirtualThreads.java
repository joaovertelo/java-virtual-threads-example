package com.devertelo;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecucaoVirtualThreads {

    public static void main(String[] args) {
        long tempoInicio = System.currentTimeMillis();

        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 0; i < 100000; i++) {
                var processo = new Processo().executar(i);
                executorService.submit(processo);
            }
        }

        System.out.println(Duration.ofMillis(System.currentTimeMillis() - tempoInicio).toSeconds() + " segundos");
    }
}
