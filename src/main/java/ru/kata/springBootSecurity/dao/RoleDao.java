package ru.kata.springBootSecurity.dao;

import org.springframework.stereotype.Repository;
import ru.kata.springBootSecurity.model.Role;
import java.util.List;

@Repository
public interface RoleDao {
    List<Role> getRoles();

    Role findById(Long id);

    Role findByName(String name);

    void addRole(Role role);
}
