package com.anhtan.foododering.service.implement;

import com.anhtan.foododering.Exception.RestaurantException;
import com.anhtan.foododering.model.Events;
import com.anhtan.foododering.model.Restaurant;
import com.anhtan.foododering.repository.EventRepository;
import com.anhtan.foododering.service.EventsService;
import com.anhtan.foododering.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImp implements EventsService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private RestaurantService restaurantService;

    public Events createEvent(Events event, Long restaurantId) throws RestaurantException {
        Restaurant restaurant=restaurantService.findRestaurantById(restaurantId);

        Events createdEvent=new Events();
        createdEvent.setRestaurant(restaurant);
        createdEvent.setImage(event.getImage());
        createdEvent.setStartedAt(event.getStartedAt());
        createdEvent.setEndsAt(event.getEndsAt());
        createdEvent.setLocation(event.getLocation());
        createdEvent.setName(event.getName());

        return eventRepository.save(createdEvent);
    }

    public List<Events> findAllEvent() {
        return eventRepository.findAll();
    }

    public List<Events> findRestaurantsEvent(Long id) {
        return eventRepository.findEventsByRestaurantId(id);
    }

    public void deleteEvent(Long id) throws Exception {
        Events event=findById(id);
        eventRepository.delete(event);
    }

    public Events findById(Long id) throws Exception {
        Optional<Events> opt=eventRepository.findById(id);
        if(opt.isPresent()) {
            return opt.get();
        }
        throw new Exception("event not found withy id "+id);
    }
}
