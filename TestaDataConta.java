package testes;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestaDataConta{
    public static void main(String args[]){
        Instant i = Instant.now();
        Duration dezSec = Duration.ofSeconds(10);
        Instant i2 = i.plus(dezSec);

        System.out.println(i);
        System.out.println(i2);

        Instant m1 = Instant.EPOCH;
        Instant m2 = Instant.now();
        long segundos = Duration.between(m1, m2).getSeconds();
        System.out.println(segundos);

        Duration hora = Duration.ofHours(1);
        System.out.println(hora.getSeconds());

        LocalDate aniversario = LocalDate.of(1991, 3, 29);
        LocalDate agora = LocalDate.now();

        String idade = ("idade: " + String.valueOf(ChronoUnit.YEARS.between(aniversario, agora)) + " anos");
        String idadeEmMeses = ("idade: " + String.valueOf(ChronoUnit.MONTHS.between(aniversario, agora)) + " meses");
        String idadeEmDias = ("idade: " + String.valueOf(ChronoUnit.DAYS.between(aniversario, agora)) + " dias");

        String idadeExata = ("idade: " + String.valueOf(Period.between(aniversario, agora).getYears()) + " anos , " +
            String.valueOf(Period.between(aniversario, agora).getMonths()) + " meses e " +
            String.valueOf(Period.between(aniversario, agora).getDays()) + " dias");

        System.out.println(idade); //acumula os anos durante o período
        System.out.println(idadeEmMeses); //acumula os meses durnte o período
        System.out.println(idadeEmDias); //acumula os dias durante o período
        System.out.println(idadeExata); //não acumula os meses e dias durante o período

        

        
    }
}