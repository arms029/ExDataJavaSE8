package testes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TestaData {
    public static void main(String args[]){

        for (String arg : args) {
            System.out.println(arg);
        }

        LocalDate d = LocalDate.now(); //yyyy-MM-dd
        LocalTime t = LocalTime.now(); //hh:mm:ss.ms
        LocalDateTime dt = LocalDateTime.now(); //yyyy-MM-dd(T)hh:mm:ss.ms

        System.out.println(d);
        System.out.println(t);
        System.out.println(dt);

        LocalTime t2 = LocalTime.now(ZoneId.of("America/Chicago"));
        LocalTime t3 = LocalTime.now(ZoneId.of("Africa/Cairo"));
        System.out.println(t2);
        System.out.println(t3);

        LocalTime meioDia = LocalTime.of(12,0,0);
        System.out.println(meioDia);

        LocalDate natal2014 = LocalDate.of(2014, Month.DECEMBER, 25);
        System.out.println(natal2014);

        LocalDateTime data = LocalDateTime.of(2020, 12, 31, 23, 59); //ano bissexto, 366dias
        System.out.println(data.getDayOfYear());
        System.out.println(data.minusHours(2)); //subtrai horas
        System.out.println(data.get(ChronoField.MONTH_OF_YEAR)); 
        System.out.println(data.get(ChronoField.DAY_OF_WEEK));
        System.out.println(data.getDayOfWeek());

        MonthDay day1 = MonthDay.of(1,1); //1/jan
        MonthDay day2 = MonthDay.of(1,2); //2/jan

        System.out.println(day1.isAfter(day2)); //false
        System.out.println(day1.isBefore(day2)); // true
        System.out.println(day1.equals(day1)); //true

        LocalDate dataImutavel = LocalDate.of(1991, 12, 25);

        LocalDate dataModificada = dataImutavel.withMonth(Month.JULY.getValue());
        System.out.println(dataModificada);
        System.out.println(dataImutavel);

        LocalDate dataModificada2 = dataImutavel.plusMonths(2).minusDays(25);
        System.out.println(dataModificada2);

        LocalDate dataModificada3 = dataImutavel.minus(4, ChronoUnit.DAYS);
        System.out.println(dataModificada3);

        LocalDateTime ldt = LocalDateTime.now(); //Criando um LocalDateTime
        LocalDate ld = ldt.toLocalDate(); //pegando um LocalDate a partir de um LocalDateTime
        LocalTime lt = ldt.toLocalTime(); //pegando um LocalTime a partir de um LocalDateTime

        LocalDateTime ldt2 = ld.atTime(lt); //combinando um LocalDate com um LocalTime
        LocalDateTime ldt3 = lt.atDate(ld); //combinando um LocalTime com um LocalDate

        System.out.println(ldt);
        System.out.println(ld);
        System.out.println(lt);
        System.out.println(ldt2);
        System.out.println(ldt3);
        
    }
}