package com.truesoft.snowcrew.snowresort.repository;

import com.truesoft.snowcrew.snowresort.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
