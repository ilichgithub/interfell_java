package org.ilich.interfell.Controller;

import org.ilich.interfell.dto.InputDTO;
import org.ilich.interfell.dto.ResponseDTO;
import org.ilich.interfell.dto.TimezoneDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.*;

@RestController
public class Timezone {

    @RequestMapping(value = "/timezone", method = RequestMethod.POST)
    public ResponseDTO getTime(@RequestBody InputDTO params){

        LocalDateTime ldt = LocalDateTime.of(LocalDate.now(),LocalTime.parse(params.getDato1()));
        ZonedDateTime zdt = ldt.atZone(ZoneId.of(params.getDato2()));
        ZonedDateTime zdtResult = zdt.withZoneSameInstant(ZoneId.of("UTC"));

        return new ResponseDTO(new TimezoneDTO(zdtResult.toLocalTime().toString(),zdtResult.getZone().toString().toLowerCase()));
    }
}
