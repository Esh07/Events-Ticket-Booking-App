package co2103.hw2.repos;

import org.springframework.data.repository.CrudRepository;


import co2103.hw2.model.Customer;

public  interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
