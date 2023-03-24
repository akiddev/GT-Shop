package edu.btec.springwebtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.btec.springwebtest.domain.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, String>{

}
