package testes;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class TestaConversaoTipoData {
    public static void main(String[] args){

        //Transformando um Date em um LocalDateTime
        Date d = new Date(); //formato antigo de data JDK1.0
        Instant i = d.toInstant(); //Criando um Instant a partir de um Date
        LocalDateTime ldt = LocalDateTime.ofInstant(i, ZoneId.systemDefault()); //Criando um LocalDateTime a partir de um Instant

        //Transformando um calendar em um LocalDateTime
        Calendar c = Calendar.getInstance(); //formato antigo de data JDK1.1
        Instant i2 = c.toInstant(); //Criando um Instant a partir de um Calendar
        LocalDateTime ldt2 = LocalDateTime.ofInstant(i2, ZoneId.systemDefault()); //Criando um LocalDateTime a partir de um Instant

        //processo reverso
        //Transformando um LocalDateTime em um Date e um Calendar
        Instant i3 = ldt.toInstant(ZoneOffset.UTC); //Criando um LocalDateTime a partir de um Instant
        Date d2 = Date.from(i3); //Criando um Date a partir de um Instant
        Calendar c2 = Calendar.getInstance(); //O tipo calendar não consegue gerar um objeto a partir de um Instant,
        c2.setTime(d2);                       // é necessário criar um tipo Date primeiro para depois transformar em um calendar.
        
    }
}
