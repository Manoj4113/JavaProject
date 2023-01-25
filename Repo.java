package com.callcenter;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<CallDetails, Integer> {

}
