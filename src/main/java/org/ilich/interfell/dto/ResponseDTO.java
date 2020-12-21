package org.ilich.interfell.dto;

public class ResponseDTO {

    public TimezoneDTO response;

    public ResponseDTO(TimezoneDTO response) {
        this.response = response;
    }

    public TimezoneDTO getResponse() {
        return response;
    }

    public void setResponse(TimezoneDTO response) {
        this.response = response;
    }
}
