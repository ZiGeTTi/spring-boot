package com.pluralsight.springboot.ticket.registration;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;


public interface RegistrationRepository extends MongoRepository<Registration, String> {
 Optional<Registration> findByTicketCode(String registrationId);
 void deleteByTicketCode(String ticketCode);
}
