package org.example.mvc_applicationforconnection.repository;


import org.example.mvc_applicationforconnection.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {

//    //HQL
//    @Query("SELECT u FROM User u where u.login == :login")
//    List<User> findByLogin(@Param("login") String login);




//    @Query(
//            value = "SELECT login FROM user where login like '+k%' or password like '1%'",
//            nativeQuery = true)
//
//    List<User> findByLogin(@Param("login") String login);

    //запрос, когда не смогли подобрать нужный элемент
}
