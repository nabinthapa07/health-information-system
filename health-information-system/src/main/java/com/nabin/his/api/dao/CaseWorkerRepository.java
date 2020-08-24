package com.nabin.his.api.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseWorkerRepository  extends JpaRepository<CaseWorkerEntity, Serializable>{

}
