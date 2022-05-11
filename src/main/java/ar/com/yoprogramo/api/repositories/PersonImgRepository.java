package ar.com.yoprogramo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.yoprogramo.api.models.PersonImg;

public interface PersonImgRepository extends JpaRepository<PersonImg, Long> {

}
