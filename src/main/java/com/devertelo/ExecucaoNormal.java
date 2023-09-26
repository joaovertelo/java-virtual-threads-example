package com.devertelo;

import java.time.Duration;

public class ExecucaoNormal {

    public static void main(String[] args) {
        long tempoInicio = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            new Processo().executar(i).run();
        }

        System.out.println(Duration.ofMillis(System.currentTimeMillis() - tempoInicio).toSeconds() + " segundos");
    }
}
