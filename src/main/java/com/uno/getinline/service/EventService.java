package com.uno.getinline.service;

import com.uno.getinline.constant.EventStatus;
import com.uno.getinline.dto.EventDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EventService  {

    public List<EventDTO> getEvents(Long placeId,
                                     String eventName,
                                     EventStatus eventStatus,
                                     LocalDateTime eventStartDatetime,
                                     LocalDateTime eventEndDatetime)
    {
        return null;
    }

    public Optional<EventDTO> getEvent(Long eventId){
        return Optional.empty();
    }

    public boolean createEvent(EventDTO eventDTO){
        return true;
    }

    public boolean modifyEvent(Long eventId , EventDTO eventDTO){
        return true;
    }

    public boolean removeEvent(Long eventId){
        return true;
    }


}
