
package com.portfolioMarco.MS.Security.Repository;

import com.portfolioMarco.MS.Security.Entity.Rol;
import com.portfolioMarco.MS.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
