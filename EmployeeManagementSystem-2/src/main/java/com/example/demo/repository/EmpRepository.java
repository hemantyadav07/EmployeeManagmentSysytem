
package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Emp;

public interface EmpRepository extends CrudRepository<Emp,String> {

}