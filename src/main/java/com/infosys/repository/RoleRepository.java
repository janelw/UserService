package com.infosys.repository;

import com.infosys.model.Role;
import com.infosys.repository.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {


    @Query(value = "SELECT roleid from userr u  WHERE u.id =:id", nativeQuery = true)
    Role findRoleById(@Param( "id") Integer id);
}