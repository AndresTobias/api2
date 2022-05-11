package ar.com.yoprogramo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.yoprogramo.api.models.PersonData;

public interface PersonDataRepository extends JpaRepository<PersonData, Long> {

}
