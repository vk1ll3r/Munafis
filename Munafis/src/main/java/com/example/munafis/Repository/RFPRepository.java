package com.example.munafis.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.munafis.Model.RFP;

@Repository
public interface RFPRepository extends JpaRepository<RFP,Integer> {
}
